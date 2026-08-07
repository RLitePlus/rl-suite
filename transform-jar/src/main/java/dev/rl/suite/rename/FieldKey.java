package dev.rl.suite.rename;

import java.util.Objects;

/** Original field declaration identity. */
public final class FieldKey implements Comparable<FieldKey>
{
    private final String owner;
    private final String name;
    private final String descriptor;

    public FieldKey(String owner, String name, String descriptor)
    {
        this.owner = Objects.requireNonNull(owner, "owner");
        this.name = Objects.requireNonNull(name, "name");
        this.descriptor = Objects.requireNonNull(descriptor, "descriptor");
    }

    public String getOwner()
    {
        return owner;
    }

    public String getName()
    {
        return name;
    }

    public String getDescriptor()
    {
        return descriptor;
    }

    @Override
    public int compareTo(FieldKey other)
    {
        int comparison = owner.compareTo(other.owner);
        if (comparison == 0)
        {
            comparison = name.compareTo(other.name);
        }
        if (comparison == 0)
        {
            comparison = descriptor.compareTo(other.descriptor);
        }
        return comparison;
    }

    @Override
    public boolean equals(Object object)
    {
        if (object == this)
        {
            return true;
        }
        if (!(object instanceof FieldKey))
        {
            return false;
        }
        FieldKey other = (FieldKey) object;
        return owner.equals(other.owner) && name.equals(other.name)
            && descriptor.equals(other.descriptor);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(owner, name, descriptor);
    }

    @Override
    public String toString()
    {
        return owner + "." + name + ":" + descriptor;
    }
}
