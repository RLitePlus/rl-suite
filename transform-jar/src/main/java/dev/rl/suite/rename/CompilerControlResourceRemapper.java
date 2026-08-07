package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Type;

/**
 * Rewrites method patterns in HotSpot's compiler-directives resource without
 * reserializing unrelated text. Pattern rewrites are accepted only when they
 * preserve the exact set of internal method declarations selected before and
 * after symbol remapping.
 */
final class CompilerControlResourceRemapper
{
    static final String RESOURCE_NAME = "compilercontrol.json";

    private CompilerControlResourceRemapper()
    {
    }

    static Result analyze(Map<String, byte[]> resources, SymbolTable symbols,
                          SymbolMapping mapping, HierarchyIndex hierarchy)
    {
        byte[] resource = resources.get(RESOURCE_NAME);
        if (resource == null)
        {
            return Result.absent();
        }

        String source = decodeUtf8(resource);
        Value root = new Parser(source).parse();
        HierarchyAwareRemapper remapper = new HierarchyAwareRemapper(mapping, hierarchy);
        Processor processor = new Processor(source, symbols, mapping, hierarchy, remapper);
        processor.process(root);
        String transformed = processor.applyReplacements();
        return Result.present(resource, transformed.getBytes(StandardCharsets.UTF_8),
            processor.directiveCount, processor.patternCount, processor.rewrittenCount);
    }

    private static String decodeUtf8(byte[] bytes)
    {
        try
        {
            CharBuffer decoded = StandardCharsets.UTF_8.newDecoder()
                .onMalformedInput(CodingErrorAction.REPORT)
                .onUnmappableCharacter(CodingErrorAction.REPORT)
                .decode(ByteBuffer.wrap(bytes));
            return decoded.toString();
        }
        catch (CharacterCodingException ex)
        {
            throw new TransformException(RESOURCE_NAME + " is not valid UTF-8", ex);
        }
    }

    static final class Result
    {
        private final boolean present;
        private final byte[] original;
        private final byte[] transformed;
        private final int directives;
        private final int patterns;
        private final int rewritten;

        private Result(boolean present, byte[] original, byte[] transformed,
                       int directives, int patterns, int rewritten)
        {
            this.present = present;
            this.original = original;
            this.transformed = transformed;
            this.directives = directives;
            this.patterns = patterns;
            this.rewritten = rewritten;
        }

        static Result absent()
        {
            return new Result(false, null, null, 0, 0, 0);
        }

        static Result present(byte[] original, byte[] transformed, int directives,
                              int patterns, int rewritten)
        {
            return new Result(true, original.clone(), transformed.clone(), directives,
                patterns, rewritten);
        }

        Map<String, byte[]> validatedReplacements(Map<String, byte[]> currentResources)
        {
            byte[] current = currentResources.get(RESOURCE_NAME);
            if (!present)
            {
                if (current != null)
                {
                    throw new TransformException(RESOURCE_NAME
                        + " appeared after rename planning");
                }
                return Collections.emptyMap();
            }
            if (current == null || !Arrays.equals(original, current))
            {
                throw new TransformException(RESOURCE_NAME
                    + " changed after rename planning");
            }
            return Collections.singletonMap(RESOURCE_NAME, transformed.clone());
        }

        int presentCount()
        {
            return present ? 1 : 0;
        }

        int directiveCount()
        {
            return directives;
        }

        int patternCount()
        {
            return patterns;
        }

        int rewrittenCount()
        {
            return rewritten;
        }
    }

    private static final class Processor
    {
        private final String source;
        private final SymbolTable symbols;
        private final SymbolMapping mapping;
        private final HierarchyIndex hierarchy;
        private final HierarchyAwareRemapper remapper;
        private final List<MethodView> methods;
        private final List<Replacement> replacements = new ArrayList<>();
        private int directiveCount;
        private int patternCount;
        private int rewrittenCount;

        private Processor(String source, SymbolTable symbols, SymbolMapping mapping,
                          HierarchyIndex hierarchy, HierarchyAwareRemapper remapper)
        {
            this.source = source;
            this.symbols = symbols;
            this.mapping = mapping;
            this.hierarchy = hierarchy;
            this.remapper = remapper;
            this.methods = methodViews(symbols, mapping, remapper);
        }

        private static List<MethodView> methodViews(SymbolTable symbols, SymbolMapping mapping,
                                                    HierarchyAwareRemapper remapper)
        {
            List<MethodView> result = new ArrayList<>();
            for (SymbolTable.MethodEntry entry : symbols.methods())
            {
                MethodKey key = entry.key();
                result.add(new MethodView(key,
                    mapping.className(key.getOwner()),
                    remapper.mapMethodName(key.getOwner(), key.getName(), key.getDescriptor()),
                    remapper.mapMethodDesc(key.getDescriptor())));
            }
            return Collections.unmodifiableList(result);
        }

        private void process(Value root)
        {
            if (root instanceof ObjectValue)
            {
                processDirective((ObjectValue) root);
                return;
            }
            if (!(root instanceof ArrayValue))
            {
                throw malformed("top level must be a directive object or an array of objects");
            }
            for (Value value : ((ArrayValue) root).values)
            {
                if (!(value instanceof ObjectValue))
                {
                    throw malformed("top-level directive array contains a non-object value");
                }
                processDirective((ObjectValue) value);
            }
        }

        private void processDirective(ObjectValue directive)
        {
            directiveCount++;
            boolean hasMatch = false;
            for (Member member : directive.members)
            {
                String key = normalizedKey(member.key.value);
                switch (key)
                {
                    case "match":
                        hasMatch = true;
                        processPatterns(member.value, false, "match");
                        break;
                    case "inline":
                        processPatterns(member.value, true, "inline");
                        break;
                    case "c1":
                    case "c2":
                        if (!(member.value instanceof ObjectValue))
                        {
                            throw malformed(key + " must contain an object");
                        }
                        processCompilerBlock((ObjectValue) member.value, key);
                        break;
                    default:
                        rejectReservedKeys(member.value, "option " + member.key.value);
                        break;
                }
            }
            if (!hasMatch)
            {
                throw malformed("directive object is missing required match");
            }
        }

        private void processCompilerBlock(ObjectValue block, String blockName)
        {
            for (Member member : block.members)
            {
                String key = normalizedKey(member.key.value);
                if ("inline".equals(key))
                {
                    processPatterns(member.value, true, blockName + ".inline");
                }
                else if ("match".equals(key) || "c1".equals(key) || "c2".equals(key))
                {
                    throw malformed(key + " is not allowed inside " + blockName);
                }
                else
                {
                    rejectReservedKeys(member.value,
                        blockName + " option " + member.key.value);
                }
            }
        }

        private void rejectReservedKeys(Value value, String location)
        {
            if (value instanceof ObjectValue)
            {
                for (Member member : ((ObjectValue) value).members)
                {
                    String key = normalizedKey(member.key.value);
                    if ("match".equals(key) || "inline".equals(key)
                        || "c1".equals(key) || "c2".equals(key))
                    {
                        throw malformed(key + " occurs in an invalid location under " + location);
                    }
                    rejectReservedKeys(member.value, location);
                }
            }
            else if (value instanceof ArrayValue)
            {
                for (Value element : ((ArrayValue) value).values)
                {
                    rejectReservedKeys(element, location);
                }
            }
        }

        private static String normalizedKey(String key)
        {
            return key.toLowerCase(Locale.ROOT);
        }

        private void processPatterns(Value value, boolean inline, String location)
        {
            if (value instanceof StringValue)
            {
                processPattern((StringValue) value, inline, location);
                return;
            }
            if (!(value instanceof ArrayValue))
            {
                throw malformed(location + " must be a string or an array of strings");
            }
            ArrayValue array = (ArrayValue) value;
            if (!inline && array.values.isEmpty())
            {
                throw malformed("match array must not be empty");
            }
            for (Value element : array.values)
            {
                if (!(element instanceof StringValue))
                {
                    throw malformed(location + " array contains a non-string value");
                }
                processPattern((StringValue) element, inline, location);
            }
        }

        private void processPattern(StringValue token, boolean inline, String location)
        {
            patternCount++;
            MethodPattern pattern = MethodPattern.parse(token.value, inline, location);
            MethodPattern transformed = remapPattern(pattern, location);
            String replacement = transformed.render();
            if (!replacement.equals(token.value))
            {
                replacements.add(new Replacement(token.start, token.end, quote(replacement)));
                rewrittenCount++;
            }
        }

        private MethodPattern remapPattern(MethodPattern pattern, String location)
        {
            Set<Integer> originalMatches = matchedMethods(pattern, false);
            String mappedClass = pattern.classPart;
            String normalizedClass = pattern.normalizedClass();
            boolean exactClass = !containsWildcard(normalizedClass);
            if (exactClass && symbols.containsClass(normalizedClass))
            {
                mappedClass = pattern.formatClass(mapping.className(normalizedClass));
            }

            String mappedSignature = pattern.signature;
            if (mappedSignature != null)
            {
                String fullDescriptor = pattern.hasReturnType
                    ? mappedSignature : mappedSignature + 'V';
                String remappedDescriptor;
                try
                {
                    remappedDescriptor = remapper.mapMethodDesc(fullDescriptor);
                }
                catch (RuntimeException ex)
                {
                    throw malformed("invalid descriptor in " + location + " pattern "
                        + pattern.original + ": " + ex.getMessage());
                }
                mappedSignature = pattern.hasReturnType
                    ? remappedDescriptor
                    : remappedDescriptor.substring(0, remappedDescriptor.length() - 1);
            }

            String mappedMethod = pattern.methodPart;
            if (!containsWildcard(pattern.effectiveMethod()))
            {
                Set<String> mappedNames = new LinkedHashSet<>();
                for (Integer index : originalMatches)
                {
                    mappedNames.add(methods.get(index).mappedName);
                }
                if (mappedNames.isEmpty() && exactClass && symbols.containsClass(normalizedClass))
                {
                    for (MethodView candidate : hierarchyCandidates(pattern, normalizedClass))
                    {
                        mappedNames.add(candidate.mappedName);
                    }
                    if (mappedNames.isEmpty())
                    {
                        throw malformed(location + " pattern does not resolve to an internal method: "
                            + pattern.original);
                    }
                }
                if (mappedNames.size() == 1)
                {
                    mappedMethod = mappedNames.iterator().next();
                }
            }

            MethodPattern candidate = pattern.with(mappedClass, mappedMethod, mappedSignature);
            Set<Integer> mappedMatches = matchedMethods(candidate, true);
            if (!originalMatches.equals(mappedMatches))
            {
                throw malformed("ambiguous " + location + " pattern cannot preserve its internal "
                    + "method match set after renaming: " + pattern.original
                    + " (before=" + originalMatches.size() + ", after="
                    + mappedMatches.size() + ")");
            }
            return candidate;
        }

        private List<MethodView> hierarchyCandidates(MethodPattern pattern, String owner)
        {
            List<MethodView> direct = new ArrayList<>();
            for (MethodView method : methods)
            {
                if (owner.equals(method.key.getOwner())
                    && pattern.matchesMethodAndSignature(method.key.getName(),
                        method.key.getDescriptor()))
                {
                    direct.add(method);
                }
            }
            if (!direct.isEmpty())
            {
                return direct;
            }

            Set<String> ancestors = hierarchy.ancestors(owner);
            List<MethodView> inherited = new ArrayList<>();
            for (MethodView method : methods)
            {
                if (ancestors.contains(method.key.getOwner())
                    && pattern.matchesMethodAndSignature(method.key.getName(),
                        method.key.getDescriptor()))
                {
                    inherited.add(method);
                }
            }
            return inherited;
        }

        private Set<Integer> matchedMethods(MethodPattern pattern, boolean mapped)
        {
            Set<Integer> matches = new LinkedHashSet<>();
            for (int index = 0; index < methods.size(); index++)
            {
                MethodView method = methods.get(index);
                String owner = mapped ? method.mappedOwner : method.key.getOwner();
                String name = mapped ? method.mappedName : method.key.getName();
                String descriptor = mapped ? method.mappedDescriptor : method.key.getDescriptor();
                if (pattern.matches(owner, name, descriptor))
                {
                    matches.add(index);
                }
            }
            return matches;
        }

        private String applyReplacements()
        {
            if (replacements.isEmpty())
            {
                return source;
            }
            replacements.sort(Comparator.comparingInt((Replacement value) -> value.start)
                .reversed());
            StringBuilder output = new StringBuilder(source);
            int boundary = source.length();
            for (Replacement replacement : replacements)
            {
                if (replacement.end > boundary)
                {
                    throw new TransformException("Overlapping " + RESOURCE_NAME
                        + " rewrite spans");
                }
                output.replace(replacement.start, replacement.end, replacement.text);
                boundary = replacement.start;
            }
            return output.toString();
        }
    }

    private static final class MethodView
    {
        private final MethodKey key;
        private final String mappedOwner;
        private final String mappedName;
        private final String mappedDescriptor;

        private MethodView(MethodKey key, String mappedOwner, String mappedName,
                           String mappedDescriptor)
        {
            this.key = key;
            this.mappedOwner = mappedOwner;
            this.mappedName = mappedName;
            this.mappedDescriptor = mappedDescriptor;
        }
    }

    private static final class MethodPattern
    {
        private final String original;
        private final String commandPrefix;
        private final String classPart;
        private final String separator;
        private final String methodPart;
        private final String signature;
        private final boolean hasReturnType;

        private MethodPattern(String original, String commandPrefix, String classPart,
                              String separator, String methodPart, String signature,
                              boolean hasReturnType)
        {
            this.original = original;
            this.commandPrefix = commandPrefix;
            this.classPart = classPart;
            this.separator = separator;
            this.methodPart = methodPart;
            this.signature = signature;
            this.hasReturnType = hasReturnType;
        }

        static MethodPattern parse(String value, boolean inline, String location)
        {
            if (value.isEmpty())
            {
                throw malformed("empty " + location + " method pattern");
            }
            String command = "";
            String body = value;
            if (inline)
            {
                char first = value.charAt(0);
                if (first != '+' && first != '-')
                {
                    throw malformed("inline pattern must start with + or -: " + value);
                }
                command = Character.toString(first);
                body = value.substring(1);
            }
            else if (value.charAt(0) == '+' || value.charAt(0) == '-')
            {
                throw malformed("match pattern must not have an inline command: " + value);
            }
            if (body.isEmpty())
            {
                throw malformed("method pattern is missing after inline command: " + value);
            }

            int signatureStart = body.indexOf('(');
            String head = signatureStart < 0 ? body : body.substring(0, signatureStart);
            String signature = signatureStart < 0 ? null : body.substring(signatureStart);
            SeparatorParts parts = splitHead(head, value);
            if (parts.classPart.indexOf(':') >= 0 || parts.methodPart.indexOf(':') >= 0
                || containsWhitespace(parts.classPart) || containsWhitespace(parts.methodPart))
            {
                throw malformed("invalid method pattern name syntax: " + value);
            }
            if (parts.classPart.isEmpty() && parts.methodPart.isEmpty())
            {
                // HotSpot accepts both "." and "::" as match-all patterns.
            }

            boolean hasReturn = false;
            if (signature != null)
            {
                if (signature.indexOf('*') >= 0)
                {
                    throw malformed("wildcards are not allowed in method signatures: " + value);
                }
                int close = signature.indexOf(')');
                if (close < 1 || signature.indexOf(')', close + 1) >= 0)
                {
                    throw malformed("invalid method signature in pattern: " + value);
                }
                hasReturn = close != signature.length() - 1;
                String descriptor = hasReturn ? signature : signature + 'V';
                try
                {
                    Type parsed = Type.getMethodType(descriptor);
                    if (!descriptor.equals(parsed.getDescriptor()))
                    {
                        throw new IllegalArgumentException("non-canonical descriptor");
                    }
                }
                catch (RuntimeException ex)
                {
                    throw malformed("invalid JVM method signature in pattern " + value
                        + ": " + ex.getMessage());
                }
            }
            return new MethodPattern(value, command, parts.classPart, parts.separator,
                parts.methodPart, signature, hasReturn);
        }

        private static SeparatorParts splitHead(String head, String original)
        {
            int doubleColon = head.indexOf("::");
            if (doubleColon >= 0)
            {
                if (head.indexOf("::", doubleColon + 2) >= 0)
                {
                    throw malformed("method pattern contains more than one :: separator: "
                        + original);
                }
                return new SeparatorParts(head.substring(0, doubleColon), "::",
                    head.substring(doubleColon + 2));
            }

            int delimiter = -1;
            for (int index = 0; index < head.length(); index++)
            {
                char current = head.charAt(index);
                if (current == '.' || current == ',' || Character.isWhitespace(current))
                {
                    delimiter = index;
                }
            }
            if (delimiter < 0)
            {
                throw malformed("method pattern is missing a class/method separator: "
                    + original);
            }
            int separatorEnd = delimiter + 1;
            if (Character.isWhitespace(head.charAt(delimiter)))
            {
                while (delimiter > 0 && Character.isWhitespace(head.charAt(delimiter - 1)))
                {
                    delimiter--;
                }
                while (separatorEnd < head.length()
                    && Character.isWhitespace(head.charAt(separatorEnd)))
                {
                    separatorEnd++;
                }
            }
            return new SeparatorParts(head.substring(0, delimiter),
                head.substring(delimiter, separatorEnd), head.substring(separatorEnd));
        }

        MethodPattern with(String mappedClass, String mappedMethod, String mappedSignature)
        {
            return new MethodPattern(original, commandPrefix, mappedClass, separator,
                mappedMethod, mappedSignature, hasReturnType);
        }

        String render()
        {
            return commandPrefix + classPart + separator + methodPart
                + (signature == null ? "" : signature);
        }

        String normalizedClass()
        {
            String effective = effectiveClass();
            if ("::".equals(separator) || effective.indexOf('.') >= 0)
            {
                return effective.replace('.', '/');
            }
            return effective;
        }

        String formatClass(String internalName)
        {
            if (classPart.indexOf('.') >= 0 && classPart.indexOf('/') < 0)
            {
                return internalName.replace('/', '.');
            }
            return internalName;
        }

        String effectiveClass()
        {
            return classPart.isEmpty() ? "*" : classPart;
        }

        String effectiveMethod()
        {
            return methodPart.isEmpty() ? "*" : methodPart;
        }

        boolean matches(String owner, String name, String descriptor)
        {
            return globMatches(normalizedClass(), owner)
                && matchesMethodAndSignature(name, descriptor);
        }

        boolean matchesMethodAndSignature(String name, String descriptor)
        {
            if (!globMatches(effectiveMethod(), name))
            {
                return false;
            }
            if (signature == null)
            {
                return true;
            }
            if (hasReturnType)
            {
                return signature.equals(descriptor);
            }
            int close = descriptor.indexOf(')');
            return close >= 0 && signature.equals(descriptor.substring(0, close + 1));
        }
    }

    private static final class SeparatorParts
    {
        private final String classPart;
        private final String separator;
        private final String methodPart;

        private SeparatorParts(String classPart, String separator, String methodPart)
        {
            this.classPart = classPart;
            this.separator = separator;
            this.methodPart = methodPart;
        }
    }

    private static boolean containsWildcard(String value)
    {
        return value.indexOf('*') >= 0;
    }

    private static boolean containsWhitespace(String value)
    {
        for (int index = 0; index < value.length(); index++)
        {
            if (Character.isWhitespace(value.charAt(index)))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean globMatches(String pattern, String value)
    {
        int patternIndex = 0;
        int valueIndex = 0;
        int star = -1;
        int retry = -1;
        while (valueIndex < value.length())
        {
            if (patternIndex < pattern.length()
                && pattern.charAt(patternIndex) == value.charAt(valueIndex))
            {
                patternIndex++;
                valueIndex++;
            }
            else if (patternIndex < pattern.length() && pattern.charAt(patternIndex) == '*')
            {
                star = patternIndex++;
                retry = valueIndex;
            }
            else if (star >= 0)
            {
                patternIndex = star + 1;
                valueIndex = ++retry;
            }
            else
            {
                return false;
            }
        }
        while (patternIndex < pattern.length() && pattern.charAt(patternIndex) == '*')
        {
            patternIndex++;
        }
        return patternIndex == pattern.length();
    }

    private static String quote(String value)
    {
        StringBuilder result = new StringBuilder(value.length() + 2).append('"');
        for (int index = 0; index < value.length(); index++)
        {
            char current = value.charAt(index);
            switch (current)
            {
                case '"':
                    result.append("\\\"");
                    break;
                case '\\':
                    result.append("\\\\");
                    break;
                case '\b':
                    result.append("\\b");
                    break;
                case '\f':
                    result.append("\\f");
                    break;
                case '\n':
                    result.append("\\n");
                    break;
                case '\r':
                    result.append("\\r");
                    break;
                case '\t':
                    result.append("\\t");
                    break;
                default:
                    if (current < 0x20)
                    {
                        result.append(String.format("\\u%04x", (int) current));
                    }
                    else
                    {
                        result.append(current);
                    }
                    break;
            }
        }
        return result.append('"').toString();
    }

    private static TransformException malformed(String message)
    {
        return new TransformException("Malformed " + RESOURCE_NAME + ": " + message);
    }

    private interface Value
    {
    }

    private static final class ObjectValue implements Value
    {
        private final List<Member> members;

        private ObjectValue(List<Member> members)
        {
            this.members = members;
        }
    }

    private static final class ArrayValue implements Value
    {
        private final List<Value> values;

        private ArrayValue(List<Value> values)
        {
            this.values = values;
        }
    }

    private static final class StringValue implements Value
    {
        private final String value;
        private final int start;
        private final int end;

        private StringValue(String value, int start, int end)
        {
            this.value = value;
            this.start = start;
            this.end = end;
        }
    }

    private static final class ScalarValue implements Value
    {
        private final String value;

        private ScalarValue(String value)
        {
            this.value = value;
        }
    }

    private static final class Member
    {
        private final StringValue key;
        private final Value value;

        private Member(StringValue key, Value value)
        {
            this.key = key;
            this.value = value;
        }
    }

    private static final class Replacement
    {
        private final int start;
        private final int end;
        private final String text;

        private Replacement(int start, int end, String text)
        {
            this.start = start;
            this.end = end;
            this.text = text;
        }
    }

    /** Parser for the documented HotSpot JSON subset. */
    private static final class Parser
    {
        private final String source;
        private int index;

        private Parser(String source)
        {
            this.source = source;
        }

        private Value parse()
        {
            skipTrivia();
            if (index == source.length())
            {
                throw error("resource is empty");
            }
            Value result = parseValue();
            skipTrivia();
            if (index != source.length())
            {
                throw error("unexpected trailing content");
            }
            return result;
        }

        private Value parseValue()
        {
            skipTrivia();
            if (index >= source.length())
            {
                throw error("expected a value");
            }
            char current = source.charAt(index);
            if (current == '{')
            {
                return parseObject();
            }
            if (current == '[')
            {
                return parseArray();
            }
            if (current == '"')
            {
                return parseString();
            }
            return parseScalar();
        }

        private ObjectValue parseObject()
        {
            index++;
            List<Member> members = new ArrayList<>();
            skipTrivia();
            if (consume('}'))
            {
                return new ObjectValue(members);
            }
            while (true)
            {
                skipTrivia();
                if (index >= source.length())
                {
                    throw error("unterminated object; expected an object key or '}'");
                }
                StringValue key = source.charAt(index) == '"'
                    ? parseString() : parseUnquotedKey();
                skipTrivia();
                require(':', "expected ':' after object key");
                Value value = parseValue();
                members.add(new Member(key, value));
                skipTrivia();
                if (consume('}'))
                {
                    return new ObjectValue(members);
                }
                require(',', "expected ',' or '}' after object value");
                skipTrivia();
                if (consume('}'))
                {
                    return new ObjectValue(members);
                }
            }
        }

        private ArrayValue parseArray()
        {
            index++;
            List<Value> values = new ArrayList<>();
            skipTrivia();
            if (consume(']'))
            {
                return new ArrayValue(values);
            }
            while (true)
            {
                values.add(parseValue());
                skipTrivia();
                if (consume(']'))
                {
                    return new ArrayValue(values);
                }
                require(',', "expected ',' or ']' after array value");
                skipTrivia();
                if (consume(']'))
                {
                    return new ArrayValue(values);
                }
            }
        }

        private StringValue parseString()
        {
            int start = index;
            index++;
            StringBuilder value = new StringBuilder();
            while (index < source.length())
            {
                char current = source.charAt(index++);
                if (current == '"')
                {
                    validateSurrogates(value.toString());
                    return new StringValue(value.toString(), start, index);
                }
                if (current < 0x20)
                {
                    throw error("unescaped control character in string");
                }
                if (current != '\\')
                {
                    value.append(current);
                    continue;
                }
                if (index >= source.length())
                {
                    throw error("unterminated string escape");
                }
                char escaped = source.charAt(index++);
                switch (escaped)
                {
                    case '"':
                    case '\\':
                    case '/':
                        value.append(escaped);
                        break;
                    case 'b':
                        value.append('\b');
                        break;
                    case 'f':
                        value.append('\f');
                        break;
                    case 'n':
                        value.append('\n');
                        break;
                    case 'r':
                        value.append('\r');
                        break;
                    case 't':
                        value.append('\t');
                        break;
                    case 'u':
                        value.append(parseUnicodeEscape());
                        break;
                    default:
                        throw error("invalid string escape \\" + escaped);
                }
            }
            throw error("unterminated string");
        }

        private char parseUnicodeEscape()
        {
            if (index + 4 > source.length())
            {
                throw error("incomplete unicode escape");
            }
            int value = 0;
            for (int count = 0; count < 4; count++)
            {
                int digit = Character.digit(source.charAt(index++), 16);
                if (digit < 0)
                {
                    throw error("invalid unicode escape");
                }
                value = value * 16 + digit;
            }
            return (char) value;
        }

        private StringValue parseUnquotedKey()
        {
            int start = index;
            while (index < source.length())
            {
                char current = source.charAt(index);
                if (current == ':' || Character.isWhitespace(current))
                {
                    break;
                }
                if (current == ',' || current == '{' || current == '}'
                    || current == '[' || current == ']' || current == '"'
                    || current == '/')
                {
                    throw error("invalid character in unquoted object key");
                }
                index++;
            }
            if (index == start)
            {
                throw error("expected an object key");
            }
            return new StringValue(source.substring(start, index), start, index);
        }

        private ScalarValue parseScalar()
        {
            int start = index;
            while (index < source.length())
            {
                char current = source.charAt(index);
                if (current == ',' || current == '}' || current == ']'
                    || Character.isWhitespace(current))
                {
                    break;
                }
                if (current == '/' && index + 1 < source.length()
                    && source.charAt(index + 1) == '/')
                {
                    break;
                }
                index++;
            }
            String value = source.substring(start, index);
            if (!"true".equals(value) && !"false".equals(value) && !"null".equals(value)
                && !value.matches("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][+-]?[0-9]+)?"))
            {
                throw error("invalid scalar value " + value);
            }
            return new ScalarValue(value);
        }

        private void skipTrivia()
        {
            while (index < source.length())
            {
                char current = source.charAt(index);
                if (Character.isWhitespace(current))
                {
                    index++;
                    continue;
                }
                if (current == '/' && index + 1 < source.length()
                    && source.charAt(index + 1) == '/')
                {
                    index += 2;
                    while (index < source.length() && source.charAt(index) != '\n'
                        && source.charAt(index) != '\r')
                    {
                        index++;
                    }
                    continue;
                }
                if (current == '/')
                {
                    throw error("only // line comments are supported by HotSpot directives");
                }
                return;
            }
        }

        private boolean consume(char expected)
        {
            if (index < source.length() && source.charAt(index) == expected)
            {
                index++;
                return true;
            }
            return false;
        }

        private void require(char expected, String message)
        {
            if (!consume(expected))
            {
                throw error(message);
            }
        }

        private TransformException error(String message)
        {
            int line = 1;
            int column = 1;
            for (int position = 0; position < Math.min(index, source.length()); position++)
            {
                if (source.charAt(position) == '\n')
                {
                    line++;
                    column = 1;
                }
                else
                {
                    column++;
                }
            }
            return malformed(message + " at line " + line + ", column " + column);
        }

        private void validateSurrogates(String value)
        {
            for (int position = 0; position < value.length(); position++)
            {
                char current = value.charAt(position);
                if (Character.isHighSurrogate(current))
                {
                    if (position + 1 >= value.length()
                        || !Character.isLowSurrogate(value.charAt(position + 1)))
                    {
                        throw error("unpaired high surrogate in string");
                    }
                    position++;
                }
                else if (Character.isLowSurrogate(current))
                {
                    throw error("unpaired low surrogate in string");
                }
            }
        }
    }
}
