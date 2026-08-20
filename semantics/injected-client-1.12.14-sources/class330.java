import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mt")
public class class330 {
   @ObfuscatedSignature(descriptor = "Lci;")
   @ObfuscatedName("gg")
   static Player localPlayer;
   @ToRemove(unused = "true")
   @ObfuscatedName("em")
   static final int field4001 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4000 = 256;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("rs")
   static Widget mousedOverWidgetIf1;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field3998 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field3999 = 5;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwn;)Ljava/io/File;")
   @ObfuscatedName("xz")
   public static File method7536(AccessFile var0) {
      return var0.field6395;
   }

   @ObfuscatedSignature(descriptor = "(Lof;B)Z")
   @ObfuscatedName("oy")
   static boolean isComponentHidden(Widget var0, byte var1) {
      try {
         return var0.isHidden;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "mt.oy(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;ZZ)I")
   @ObfuscatedName("lu")
   public static int method7537(JagNetThread var0, boolean var1, boolean var2) {
      if (var0 == null) {
         var0.method9233(var1);
      }

      int var3 = 0;
      if (var1) {
         var3 += 2050000033 * var0.field5469 + var0.field5467 * 1350052665;
      }

      if (var2) {
         var3 += var0.field5463 * 2003362371 + 1532259301 * var0.field5479;
      }

      return var3;
   }

   class330() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   public static int method7535(int var0, int var1) {
      try {
         return var0 >> 17 & 7;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "mt.at(" + 41);
      }
   }
}
