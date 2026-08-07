package dev.rl.suite.rename;

import java.util.Objects;

/** Original internal class name used as a stable mapping key. */
public final class ClassKey implements Comparable<ClassKey>
{
    private final String name;

    public ClassKey(String name)
    {
        this.name = Objects.requireNonNull(name, "name");
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int compareTo(ClassKey other)
    {
        return name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object object)
    {
        return object == this || object instanceof ClassKey
            && name.equals(((ClassKey) object).name);
    }

    @Override
    public int hashCode()
    {
        return name.hashCode();
    }

    @Override
    public String toString()
    {
        return name;
    }
}
