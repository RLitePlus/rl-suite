package dev.rl.suite.model;

import java.util.Objects;
import org.objectweb.asm.tree.ClassNode;

public final class ClassUnit
{
    private final String originalClassName;
    private ClassNode node;

    ClassUnit(ClassNode node)
    {
        this.originalClassName = Objects.requireNonNull(node.name);
        this.node = Objects.requireNonNull(node);
    }

    public String getOriginalClassName()
    {
        return originalClassName;
    }

    public ClassNode getNode()
    {
        return node;
    }

    void replaceNode(ClassNode replacement)
    {
        this.node = Objects.requireNonNull(replacement, "replacement");
    }
}
