package dev.rl.suite.packet;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;

final class Instructions
{
    private Instructions()
    {
    }

    static AbstractInsnNode previousExecutable(AbstractInsnNode instruction)
    {
        AbstractInsnNode current = instruction.getPrevious();
        while (current != null && current.getOpcode() < 0)
        {
            current = current.getPrevious();
        }
        return current;
    }

    static Integer intConstant(AbstractInsnNode instruction)
    {
        if (instruction == null) return null;
        int opcode = instruction.getOpcode();
        if (opcode >= Opcodes.ICONST_M1 && opcode <= Opcodes.ICONST_5)
        {
            return opcode - Opcodes.ICONST_0;
        }
        if (instruction instanceof IntInsnNode
            && (opcode == Opcodes.BIPUSH || opcode == Opcodes.SIPUSH))
        {
            return ((IntInsnNode) instruction).operand;
        }
        if (instruction instanceof LdcInsnNode
            && ((LdcInsnNode) instruction).cst instanceof Integer)
        {
            return (Integer) ((LdcInsnNode) instruction).cst;
        }
        return null;
    }
}
