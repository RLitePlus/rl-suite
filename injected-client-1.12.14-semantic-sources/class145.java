import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fw")
class class145 implements Callable {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final byte field1912 = 126;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field1914 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1913 = 4;

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ap")
   protected static int getGcDuration(short var0) {
      try {
         int var1;
         label62: {
            var1 = 0;
            if (Timer.garbageCollector != null) {
               if (var0 != 165) {
                  throw new IllegalStateException();
               }

               if (Timer.garbageCollector.isValid()) {
                  break label62;
               }
            }

            try {
               Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

               while (var2.hasNext()) {
                  if (var0 != 165) {
                     throw new IllegalStateException();
                  }

                  GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
                  if (var3.isValid()) {
                     if (var0 != 165) {
                        throw new IllegalStateException();
                     }

                     Timer.garbageCollector = var3;
                     GameEngine.garbageCollectorLastCheckTimeMs = -5524403803700233737L;
                     GameEngine.garbageCollectorLastCollectionTime = -4424692208050935839L;
                  }
               }
            } catch (Throwable var10) {
            }
         }

         if (null != Timer.garbageCollector) {
            if (var0 != 165) {
               throw new IllegalStateException();
            }

            long var12 = ParamComposition.method4949((byte)15);
            long var4 = Timer.garbageCollector.getCollectionTime();
            if (-1L != -2422081617647836193L * GameEngine.garbageCollectorLastCollectionTime) {
               if (var0 != 165) {
                  throw new IllegalStateException();
               }

               long var6 = var4 - GameEngine.garbageCollectorLastCollectionTime * -2422081617647836193L;
               long var8 = var12 - -948665066413299655L * GameEngine.garbageCollectorLastCheckTimeMs;
               if (var8 != 0L) {
                  if (var0 != 165) {
                     throw new IllegalStateException();
                  }

                  var1 = (int)(var6 * 100L / var8);
               }
            }

            GameEngine.garbageCollectorLastCollectionTime = 4424692208050935839L * var4;
            GameEngine.garbageCollectorLastCheckTimeMs = var12 * 5524403803700233737L;
         }

         return var1;
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "fw.ap(" + 41);
      }
   }

   class145(classFY var1, int var2, int var3, class138[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("at")
   public Object method4145() {
      for (int var1 = this.val$workStart; var1 < this.val$workEnd; var1++) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   public Object method4146() {
      for (int var1 = this.val$workStart; var1 < this.val$workEnd; var1++) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("ai")
   static boolean method4148(char var0, byte var1) {
      try {
         boolean var10000;
         if (Login.field398.indexOf(var0) != -1) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fw.ai(" + ')');
      }
   }

   @Override
   public Object call() {
      try {
         for (int var1 = this.val$workStart; var1 < this.val$workEnd; var1++) {
            this.val$curveLoadJobs[var1].call();
         }

         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fw.call(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lxt;")
   @ObfuscatedName("au")
   static SpritePixels[] method4147(int var0) {
      try {
         SpritePixels[] var1 = new SpritePixels[1626067939 * class615.SpriteBuffer_spriteCount];

         for (int var2 = 0; var2 < 1626067939 * class615.SpriteBuffer_spriteCount; var2++) {
            if (var0 == 210930953) {
               throw new IllegalStateException();
            }

            SpritePixels var3 = var1[var2] = new SpritePixels();
            var3.width = -1309012693 * class208.SpriteBuffer_spriteWidth;
            var3.height = class144.SpriteBuffer_spriteHeight * 722593713;
            var3.xOffset = class615.SpriteBuffer_xOffsets[var2];
            var3.yOffset = class615.SpriteBuffer_yOffsets[var2];
            var3.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var2];
            var3.subHeight = class615.SpriteBuffer_spriteHeights[var2];
            int var4 = var3.subHeight * var3.subWidth;
            byte[] var5 = class320.SpriteBuffer_pixels[var2];
            var3.pixels = new int[var4];

            for (int var6 = 0; var6 < var4; var6++) {
               if (var0 == 210930953) {
                  throw new IllegalStateException();
               }

               int var7 = var5[var6] & 255;
               var3.pixels[var6] = BufferedSource.SpriteBuffer_spritePalette[var7];
            }
         }

         class615.SpriteBuffer_xOffsets = null;
         class615.SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         class615.SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var1;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "fw.au(" + ')');
      }
   }
}
