import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cf")
public class class69 {
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ae")
   static final class69 field504 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ay")
   static final class69 field509 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ag")
   static final class69 field502 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("an")
   static final class69 field505 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("aw")
   static final class69 field501 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("aj")
   static final class69 field511 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ak")
   static final class69 field506 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("av")
   static final class69 field500 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("az")
   static final class69 field512 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ap")
   static final class69 field508 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("au")
   static final class69 field503 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("at")
   static final class69 field517 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ad")
   static final class69 field516 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ai")
   static final class69 field513 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("as")
   static final class69 field514 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ac")
   static final class69 field515 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ab")
   static final class69 field510 = new class69();
   @ObfuscatedSignature(descriptor = "Lcf;")
   @ObfuscatedName("ax")
   static final class69 field507 = new class69();
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final long field519 = 4294967295L;
   @ToRemove(unused = "true")
   @ObfuscatedName("ce")
   public static final int field518 = 1008;

   @ObfuscatedSignature(descriptor = "(Lof;B)I")
   @ObfuscatedName("os")
   static int getWidgetFlags2(Widget var0, byte var1) {
      try {
         WidgetConfigNode var2 = (WidgetConfigNode)client.widgetFlags.method8915(var0.id * 278777747);
         WidgetConfigNode var3 = WorldMapIcon_0.method7215(var2, var0.childIndex * 2077538819, (short)-1357);
         if (var3 != null) {
            return WidgetConfigNode.method7983(var3, (byte)68);
         } else {
            int var5 = var0.flags * -1862035483;
            return var5 >> 1 & 1023;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cf.os(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   static void method1397(int var0) {
      try {
         Messages.Messages_channels.clear();
         Messages.Messages_hashTable.clear();
         Messages.Messages_queue.clear();
         Messages.Messages_count = 0;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cf.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZZZZI)Lqn;")
   @ObfuscatedName("ha")
   static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4, int var5) {
      try {
         ArchiveDisk var6 = null;
         if (JagexCache.JagexCache_dat2File != null) {
            if (var5 == -891115635) {
               throw new IllegalStateException();
            }

            var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, UserComparator9.JagexCache_idxFiles[var0], 1000000);
         }

         return new Archive(var6, InterfaceParent.masterDisk, VarbitComposition.field2488, var0, var1, var2, var3, var4, false);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "cf.ha(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;)I")
   @ObfuscatedName("co")
   public static int method1398(classVU var0) {
      return var0.field6308 * 1346192340;
   }

   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;III)V")
   @ObfuscatedName("ad")
   public static void method1400(int[] var0, Object[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 != 1772939328) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            int var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            Object var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;
            byte var10000;
            if (var7 == Integer.MAX_VALUE) {
               if (var4 != 1772939328) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var9 = var10000;

            for (int var10 = var2; var10 < var3; var10++) {
               if (var4 != 1772939328) {
                  throw new IllegalStateException();
               }

               if (var0[var10] < var7 + (var10 & var9)) {
                  if (var4 != 1772939328) {
                     throw new IllegalStateException();
                  }

                  int var11 = var0[var10];
                  var0[var10] = var0[var6];
                  var0[var6] = var11;
                  Object var12 = var1[var10];
                  var1[var10] = var1[var6];
                  var1[var6++] = var12;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method1400(var0, var1, var2, var6 - 1, 1772939328);
            method1400(var0, var1, 1 + var6, var3, 1772939328);
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "cf.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)I")
   @ObfuscatedName("at")
   public static int method1396(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (1 == (var5 & 1)) {
            int var7 = var3;
            var3 = var4;
            var4 = var7;
         }

         var2 &= 3;
         if (var2 == 0) {
            if (var6 == -243528685) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else if (1 == var2) {
            return 7 - var0 - (var3 - 1);
         } else if (2 == var2) {
            if (var6 == -243528685) {
               throw new IllegalStateException();
            } else {
               return 7 - var1 - (var4 - 1);
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cf.at(" + 41);
      }
   }

   class69() {
   }

   @ObfuscatedSignature(descriptor = "(Lqm;III)[Lxt;")
   @ObfuscatedName("ag")
   public static SpritePixels[] method1399(AbstractArchive var0, int var1, int var2, int var3) {
      try {
         return !FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867) ? null : class145.method4147(-270079415);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cf.ag(" + ')');
      }
   }
}
