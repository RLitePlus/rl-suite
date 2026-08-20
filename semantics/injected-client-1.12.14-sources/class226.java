import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iy")
public class class226 {
   @ObfuscatedName("at")
   public float[] field2774;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kq")
   static Archive field2779;
   @ObfuscatedSignature(descriptor = "Ley;")
   @ObfuscatedName("av")
   public UrlRequest field2777;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field2775 = 2048;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field2776 = 107;
   @ObfuscatedSignature(descriptor = "Loc;")
   @ObfuscatedName("fg")
   static WidgetDefinition widgetDefinition;

   @ObfuscatedSignature(descriptor = "([[[IIIII)V")
   @ObfuscatedName("aj")
   static final void method5335(int[][][] var0, int var1, int var2, int var3, int var4) {
      try {
         for (int var5 = 0; var5 < 8; var5++) {
            if (var4 == -2141350146) {
               return;
            }

            for (int var6 = 0; var6 < 8; var6++) {
               if (var4 == -2141350146) {
                  throw new IllegalStateException();
               }

               var0[var1][var5 + var2][var6 + var3] = 0;
            }
         }

         if (var2 > 0) {
            if (var4 == -2141350146) {
               throw new IllegalStateException();
            }

            for (int var8 = 1; var8 < 8; var8++) {
               var0[var1][var2][var8 + var3] = var0[var1][var2 - 1][var8 + var3];
            }
         }

         if (var3 > 0) {
            for (int var9 = 1; var9 < 8; var9++) {
               if (var4 == -2141350146) {
                  throw new IllegalStateException();
               }

               var0[var1][var9 + var2][var3] = var0[var1][var2 + var9][var3 - 1];
            }
         }

         if (var2 > 0) {
            if (var4 == -2141350146) {
               return;
            }

            if (var0[var1][var2 - 1][var3] != 0) {
               if (var4 == -2141350146) {
                  throw new IllegalStateException();
               }

               var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
               return;
            }
         }

         if (var3 > 0) {
            if (var4 == -2141350146) {
               throw new IllegalStateException();
            }

            if (0 != var0[var1][var2][var3 - 1]) {
               if (var4 == -2141350146) {
                  return;
               }

               var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
               return;
            }
         }

         if (var2 > 0) {
            if (var4 == -2141350146) {
               return;
            }

            if (var3 > 0) {
               if (var4 == -2141350146) {
                  throw new IllegalStateException();
               }

               if (var0[var1][var2 - 1][var3 - 1] != 0) {
                  if (var4 == -2141350146) {
                     throw new IllegalStateException();
                  }

                  var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "iy.aj(" + ')');
      }
   }

   class226(class236 var1) {
      this.this$0 = var1;
      this.field2774 = new float[4];
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("at")
   static final void method5334(String var0, int var1) {
      try {
         SwapSongTask.method10270(var0 + Strings.field5037, (byte)8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iy.at(" + ')');
      }
   }
}
