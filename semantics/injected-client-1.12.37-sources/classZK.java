import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zk")
public class classZK {
   @ObfuscatedName("ab")
   static final int field7192 = (int)(Math.pow(2.0, 8.0) - 1.0) * -513457013;
   @ObfuscatedName("ae")
   static final int field7191 = (int)(Math.pow(2.0, 4.0) - 1.0) * 465910505;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7193 = 4;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public static int method14053(int var0) {
      return var0 >>> 4 & field7192 * -145882333;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public static int method14051(int var0) {
      return var0 >>> 12;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public static int method14052(int var0) {
      return var0 >>> 12;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   public static int method14055(int var0) {
      return (var0 & -1745858582 * field7191) - 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public static int method14054(int var0) {
      return var0 >>> 4 & field7192 * -145882333;
   }

   classZK() throws Throwable {
      throw new Error();
   }
}
