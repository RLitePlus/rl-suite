import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fz")
public class classFZ {
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ab")
   static final classFZ field2518 = new classFZ(3);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("af")
   static final classFZ field2516 = new classFZ(1);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ae")
   public static final classFZ field2517 = new classFZ(2);
   @ObfuscatedName("as")
   final int field2514;
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ag")
   static final classFZ field2519 = new classFZ(4);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("az")
   static final classFZ field2515 = new classFZ(0);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltc;Ljava/awt/Component;)V")
   @ObfuscatedName("ac")
   public static void method5275(MouseWheelHandler var0, Component var1) {
      if (var0 == null) {
         var0.method10742(var1);
      }

      var1.removeMouseWheelListener(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzh;)V")
   @ObfuscatedName("ak")
   public static void method5276(classZH var0) {
      if (var0 == null) {
         var0.method14002();
      }

      var0.field7185 = 0;
   }

   classFZ(int var1) {
      this.field2514 = var1;
   }
}
