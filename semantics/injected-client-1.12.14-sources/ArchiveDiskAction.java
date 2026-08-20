import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pt")
public class ArchiveDiskAction extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   public static final int field5236 = 50;
   @ObfuscatedName("av")
   int type;
   @ObfuscatedSignature(descriptor = "Ltf;")
   @ObfuscatedName("ag")
   public ArchiveDisk archiveDisk;
   @ObfuscatedName("at")
   public byte[] data;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("an")
   public Archive archive;

   ArchiveDiskAction() {
   }
}
