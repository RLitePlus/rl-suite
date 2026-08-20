import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ce")
public class SecureRandomFuture {
   @ObfuscatedName("at")
   Future future;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field494 = 9;
   @ObfuscatedName("as")
   static int Interpreter_objectStackSize;
   @ToRemove(unused = "true")
   @ObfuscatedName("cz")
   static final int field497 = 2048;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field493 = 23;
   @ObfuscatedName("av")
   ExecutorService executor = Executors.newSingleThreadExecutor();
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field496 = 94;
   @ObfuscatedName("oz")
   static SecureRandom field499;
   @ObfuscatedSignature(descriptor = "Lgs;")
   @ObfuscatedName("hn")
   static ClanSettings guestClanSettings;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field492 = 19;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lce;)Ljava/security/SecureRandom;")
   @ObfuscatedName("jb")
   public static SecureRandom method1392(SecureRandomFuture var0) {
      try {
         return (SecureRandom)var0.future.get();
      } catch (Exception var2) {
         return WorldMapData_0.method7119(-1397085959);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Ljava/security/SecureRandom;")
   @ObfuscatedName("ag")
   SecureRandom get(short var1) {
      try {
         try {
            return (SecureRandom)this.future.get();
         } catch (Exception var3) {
            return WorldMapData_0.method7119(-1815779913);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ce.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   void method1388() {
      this.executor.shutdown();
      this.executor = null;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("at")
   boolean isDone(byte var1) {
      try {
         return this.future.isDone();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ce.at(" + ')');
      }
   }

   SecureRandomFuture() {
      this.future = this.executor.submit(new SecureRandomCallable());
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("aw")
   SecureRandom method1394() {
      try {
         return (SecureRandom)this.future.get();
      } catch (Exception var2) {
         return WorldMapData_0.method7119(730388429);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lce;I)V")
   @ObfuscatedName("ns")
   public static void method1389(SecureRandomFuture var0, int var1) {
      if (var0 == null) {
         var0.shutdown(var1);
      }

      try {
         var0.executor.shutdown();
         var0.executor = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ce.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILxt;Loz;I)V")
   @ObfuscatedName("ae")
   static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, int var4, SpritePixels var5, SpriteMask var6, int var7) {
      try {
         SpriteMask var15 = var6;
         SpritePixels var14 = var5;
         int var13 = var4;
         int var12 = var3;
         int var11 = var2;
         int var10 = var1;
         int var9 = var0;
         int var16 = 1663436157;

         try {
            if (var14 != null) {
               int var17 = var12 * var12 + var11 * var11;
               if (var17 > 6400) {
                  if (var16 == 397551696) {
                  }
               } else {
                  int var18 = Rasterizer3D.Rasterizer3D_sine[var13];
                  int var19 = Rasterizer3D.Rasterizer3D_cosine[var13];
                  int var20 = var12 * var18 + var19 * var11 >> 16;
                  int var21 = var12 * var19 - var18 * var11 >> 16;
                  if (var17 > 2500) {
                     if (var16 == 397551696) {
                        throw new IllegalStateException();
                     }

                     SpritePixels.method12672(
                        var14,
                        var20 + var15.height * 915756381 / 2 - var14.width / 2,
                        1668058793 * var15.width / 2 - var21 - var14.height / 2,
                        var9,
                        var10,
                        915756381 * var15.height,
                        1668058793 * var15.width,
                        var15.xStarts,
                        var15.xWidths
                     );
                  } else {
                     var14.method12650(
                        var20 + var15.height * 915756381 / 2 + var9 - var14.width / 2, var10 + 1668058793 * var15.width / 2 - var21 - var14.height / 2
                     );
                  }
               }
            }
         } catch (RuntimeException var22) {
            throw RestClientThreadFactory.newRunException(var22, "ce.ae(" + ')');
         }
      } catch (Exception var23) {
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void shutdown(int var1) {
      try {
         this.executor.shutdown();
         this.executor = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ce.av(" + ')');
      }
   }
}
