import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wl")
public class classWL {
   @ObfuscatedName("an")
   static final int field6390 = (int)(Math.pow(2.0, 8.0) - 1.0) * 1182081717;
   @ObfuscatedName("ag")
   static final int field6389 = (int)(Math.pow(2.0, 4.0) - 1.0) * 1618484085;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6391 = 8;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("au")
   public static int method11750(int var0) {
      return var0 >>> 4 & 1421132234 * field6390;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   public static int method11751(int var0) {
      return var0 >>> 4 & -1038439317 * field6390;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public static int method11745(int var0) {
      return var0 >>> 12;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laf;Ljava/awt/Component;)V")
   @ObfuscatedName("jx")
   public static void method11749(MouseWheelHandler var0, Component var1) {
      if (var0 == null) {
         var0.method77(var1);
      }

      var1.removeMouseWheelListener(var0);
   }

   classWL() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public static int method11746(int var0) {
      return var0 >>> 12;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public static int method11752(int var0) {
      return var0 >>> 4 & -1945163780 * field6390;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public static int method11747(int var0) {
      return var0 >>> 12;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public static int method11748(int var0) {
      return var0 >>> 12;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   public static int method11753(int var0) {
      return (var0 & -677274403 * field6389) - 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   public static int method11754(int var0) {
      return (var0 & -677274403 * field6389) - 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public static int method11755(int var0) {
      return (var0 & -677274403 * field6389) - 1;
   }
}
