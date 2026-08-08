package dev.rl.suite.packet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Reads the subset of JSON the mapping files use: objects, arrays, strings,
 * numbers, booleans and null. Objects become {@code Map<String, Object>} and
 * arrays {@code List<Object>}. Numbers are returned as their literal text, so a
 * garbage multiplier keeps its exact value rather than passing through a double.
 */
public final class Json
{
    private final String source;
    private int cursor;

    private Json(String source)
    {
        this.source = source;
    }

    public static Object parse(String text)
    {
        Json reader = new Json(text);
        reader.skipWhitespace();
        Object value = reader.readValue();
        reader.skipWhitespace();
        if (reader.cursor != text.length())
        {
            throw new IllegalArgumentException("Trailing content at offset " + reader.cursor);
        }
        return value;
    }

    private Object readValue()
    {
        char c = peek();
        if (c == '{')
        {
            return readObject();
        }
        if (c == '[')
        {
            return readArray();
        }
        if (c == '"')
        {
            return readString();
        }
        if (source.startsWith("true", cursor))
        {
            cursor += 4;
            return Boolean.TRUE;
        }
        if (source.startsWith("false", cursor))
        {
            cursor += 5;
            return Boolean.FALSE;
        }
        if (source.startsWith("null", cursor))
        {
            cursor += 4;
            return null;
        }
        return readNumber();
    }

    private Map<String, Object> readObject()
    {
        Map<String, Object> result = new LinkedHashMap<>();
        expect('{');
        skipWhitespace();
        if (peek() == '}')
        {
            cursor++;
            return result;
        }
        while (true)
        {
            skipWhitespace();
            String key = readString();
            skipWhitespace();
            expect(':');
            skipWhitespace();
            result.put(key, readValue());
            skipWhitespace();
            char c = next();
            if (c == '}')
            {
                return result;
            }
            if (c != ',')
            {
                throw new IllegalArgumentException("Expected , or } at offset " + (cursor - 1));
            }
        }
    }

    private List<Object> readArray()
    {
        List<Object> result = new ArrayList<>();
        expect('[');
        skipWhitespace();
        if (peek() == ']')
        {
            cursor++;
            return result;
        }
        while (true)
        {
            skipWhitespace();
            result.add(readValue());
            skipWhitespace();
            char c = next();
            if (c == ']')
            {
                return result;
            }
            if (c != ',')
            {
                throw new IllegalArgumentException("Expected , or ] at offset " + (cursor - 1));
            }
        }
    }

    private String readString()
    {
        expect('"');
        StringBuilder text = new StringBuilder();
        while (true)
        {
            char c = next();
            if (c == '"')
            {
                return text.toString();
            }
            if (c != '\\')
            {
                text.append(c);
                continue;
            }
            char escape = next();
            switch (escape)
            {
                case 'n': text.append('\n'); break;
                case 't': text.append('\t'); break;
                case 'r': text.append('\r'); break;
                case 'b': text.append('\b'); break;
                case 'f': text.append('\f'); break;
                case 'u':
                    text.append((char) Integer.parseInt(source.substring(cursor, cursor + 4), 16));
                    cursor += 4;
                    break;
                default: text.append(escape);
            }
        }
    }

    /** Numbers keep their literal text so long multipliers survive exactly. */
    private String readNumber()
    {
        int start = cursor;
        while (cursor < source.length() && "+-.eE0123456789".indexOf(source.charAt(cursor)) >= 0)
        {
            cursor++;
        }
        if (start == cursor)
        {
            throw new IllegalArgumentException("Expected a value at offset " + start);
        }
        return source.substring(start, cursor);
    }

    private void skipWhitespace()
    {
        while (cursor < source.length() && Character.isWhitespace(source.charAt(cursor)))
        {
            cursor++;
        }
    }

    private char peek()
    {
        if (cursor >= source.length())
        {
            throw new IllegalArgumentException("Unexpected end of input");
        }
        return source.charAt(cursor);
    }

    private char next()
    {
        char c = peek();
        cursor++;
        return c;
    }

    private void expect(char expected)
    {
        char c = next();
        if (c != expected)
        {
            throw new IllegalArgumentException("Expected " + expected + " at offset " + (cursor - 1));
        }
    }
}
