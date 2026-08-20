import java.awt.event.WindowEvent;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gm")
public class classGM {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2622 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Lgy;II)V")
   @ObfuscatedName("ab")
   public static void method5497(Buffer var0, classGY var1, int var2, int var3) {
      classGY.method5929(var1, classKY.method6605(var2, 254158521), classKY.method6605(var3, 1629084526), (byte)5);
      classGY.method5933(var1, 0, (short)255);
      var1.method5923(0, 598729790);
      byte var4 = Buffer.method13043(var0, (byte)17);
      if (var4 != 0) {
         int var5 = classQK.method9604(var0, var4, 0, (byte)75);
         int var6 = classQK.method9604(var0, var4, 2, (byte)14);
         int var7 = classQK.method9604(var0, var4, 4, (byte)22);
         int var8 = classQK.method9604(var0, var4, 6, (byte)84);
         var1.method5939(var5, var6, var7, var8, -1896731343);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;BI)I")
   @ObfuscatedName("as")
   public static int method5499(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (var3 == 3) {
         return var0.method13056((byte)1);
      } else if (2 == var3) {
         return var0.method13050((byte)16);
      } else {
         return 1 == var3 ? Buffer.method13043(var0, (byte)17) : 0;
      }
   }

   classGM() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;BI)I")
   @ObfuscatedName("ag")
   public static int method5500(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (var3 == 3) {
         return var0.method13056((byte)1);
      } else if (2 == var3) {
         return var0.method13050((byte)16);
      } else {
         return 1 == var3 ? Buffer.method13043(var0, (byte)17) : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("rt")
   public static void method5502(GameEngine var0, WindowEvent var1) {
      if (var0 == null) {
         var0.windowActivated(var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Lgy;II)V")
   @ObfuscatedName("ae")
   public static void method5498(Buffer var0, classGY var1, int var2, int var3) {
      classGY.method5929(var1, classKY.method6605(var2, 427595868), classKY.method6605(var3, 347163338), (byte)5);
      classGY.method5933(var1, 0, (short)255);
      var1.method5923(0, -868268101);
      byte var4 = Buffer.method13043(var0, (byte)17);
      if (var4 != 0) {
         int var5 = classQK.method9604(var0, var4, 0, (byte)9);
         int var6 = classQK.method9604(var0, var4, 2, (byte)41);
         int var7 = classQK.method9604(var0, var4, 4, (byte)47);
         int var8 = classQK.method9604(var0, var4, 6, (byte)17);
         var1.method5939(var5, var6, var7, var8, 2006765241);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;BI)I")
   @ObfuscatedName("ax")
   public static int method5501(Buffer var0, byte var1, int var2) {
      int var3 = var1 >> var2 & 3;
      if (var3 == 3) {
         return var0.method13056((byte)1);
      } else if (2 == var3) {
         return var0.method13050((byte)16);
      } else {
         return 1 == var3 ? Buffer.method13043(var0, (byte)17) : 0;
      }
   }
}
