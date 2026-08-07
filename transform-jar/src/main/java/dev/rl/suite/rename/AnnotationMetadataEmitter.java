package dev.rl.suite.rename;

import dev.rl.suite.TransformException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

/** Emits the runtime-visible original-name metadata consumed by decompilers. */
final class AnnotationMetadataEmitter
{
    static final String OBFUSCATED_NAME = "Lnet/runelite/mapping/ObfuscatedName;";
    static final String OBFUSCATED_SIGNATURE = "Lnet/runelite/mapping/ObfuscatedSignature;";

    private AnnotationMetadataEmitter()
    {
    }

    static Counts emit(ClassNode node, SymbolMapping mapping)
    {
        long names = 0;
        long signatures = 0;
        String owner = node.name;
        if (mapping.annotateClass(owner))
        {
            node.visibleAnnotations = append(node.visibleAnnotations,
                annotation(OBFUSCATED_NAME, "value", owner));
            names++;
        }

        for (FieldNode field : node.fields)
        {
            FieldKey key = new FieldKey(owner, field.name, field.desc);
            // The oracle records every field typed as an injected-client class,
            // including long-named injected fields and identity-mapped rl/pub
            // types. This is broader than "descriptor text changed".
            if (mapping.descriptorReferencesScope(field.desc))
            {
                field.visibleAnnotations = append(field.visibleAnnotations,
                    annotation(OBFUSCATED_SIGNATURE, "descriptor", field.desc));
                signatures++;
            }
            if (mapping.renamesField(key))
            {
                field.visibleAnnotations = append(field.visibleAnnotations,
                    annotation(OBFUSCATED_NAME, "value", field.name));
                names++;
            }
        }

        for (MethodNode method : node.methods)
        {
            MethodKey key = new MethodKey(owner, method.name, method.desc);
            if (!mapping.renamesMethod(key))
            {
                continue;
            }
            method.visibleAnnotations = append(method.visibleAnnotations,
                annotation(OBFUSCATED_SIGNATURE, "descriptor", method.desc));
            method.visibleAnnotations = append(method.visibleAnnotations,
                annotation(OBFUSCATED_NAME, "value", method.name));
            signatures++;
            names++;
        }
        return new Counts(names, signatures);
    }

    static void rejectPreexisting(SymbolTable symbols)
    {
        for (SymbolTable.ClassEntry entry : symbols.classes())
        {
            reject(entry.name(), entry.node().visibleAnnotations);
            reject(entry.name(), entry.node().invisibleAnnotations);
            for (FieldNode field : entry.node().fields)
            {
                reject(entry.name() + "." + field.name + ":" + field.desc, field.visibleAnnotations);
                reject(entry.name() + "." + field.name + ":" + field.desc, field.invisibleAnnotations);
            }
            for (MethodNode method : entry.node().methods)
            {
                reject(entry.name() + "." + method.name + method.desc, method.visibleAnnotations);
                reject(entry.name() + "." + method.name + method.desc, method.invisibleAnnotations);
            }
        }
    }

    private static void reject(String owner, List<AnnotationNode> annotations)
    {
        for (AnnotationNode annotation : annotations == null
            ? Collections.<AnnotationNode>emptyList() : annotations)
        {
            if (OBFUSCATED_NAME.equals(annotation.desc)
                || OBFUSCATED_SIGNATURE.equals(annotation.desc))
            {
                throw new TransformException("Preexisting rename metadata on " + owner
                    + ": " + annotation.desc);
            }
        }
    }

    private static AnnotationNode annotation(String descriptor, String key, String value)
    {
        AnnotationNode annotation = new AnnotationNode(descriptor);
        annotation.values = new ArrayList<>(Arrays.<Object>asList(key, value));
        return annotation;
    }

    private static List<AnnotationNode> append(List<AnnotationNode> annotations,
                                               AnnotationNode annotation)
    {
        if (annotations == null)
        {
            annotations = new ArrayList<>();
        }
        annotations.add(annotation);
        return annotations;
    }

    static final class Counts
    {
        final long names;
        final long signatures;

        private Counts(long names, long signatures)
        {
            this.names = names;
            this.signatures = signatures;
        }
    }
}
