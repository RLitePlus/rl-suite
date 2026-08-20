import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ju")
public class Animation {
   @ObfuscatedName("av")
   static int[] field3190 = new int[500];
   @ObfuscatedName("at")
   static int[] field3191 = new int[500];
   @ObfuscatedName("ag")
   static int[] field3193 = new int[500];
   @ObfuscatedName("an")
   static int[] field3192 = new int[500];
   @ObfuscatedName("aj")
   int transformCount;
   @ObfuscatedName("aw")
   int[] transformXs;
   @ObfuscatedName("ap")
   int[] transformYs;
   @ObfuscatedName("ak")
   int[] transformSkeletonLabels;
   @ObfuscatedName("ay")
   int[] transformZs;
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ae")
   Skeleton skeleton = null;
   @ObfuscatedName("au")
   boolean hasAlphaTransform;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)Ltx;")
   @ObfuscatedName("ws")
   public static HttpHeaders method6188(HttpRequest var0) {
      return var0.httpHeaders;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljt;I)V")
   @ObfuscatedName("my")
   public static void method6189(Model var0, Frames var1, int var2) {
      if (var0.faceLabelsAlpha != null) {
         if (var2 != -1) {
            Animation var3 = var1.frames[var2];
            Skeleton var4 = var3.skeleton;
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;

            for (int var5 = 0; var5 < var3.transformCount; var5++) {
               int var6 = var3.transformYs[var5];
               var0.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformSkeletonLabels[var5], var3.transformZs[var5], var3.transformXs[var5]);
            }

            var0.method6742();
         }
      }
   }

   Animation(byte[] var1, Skeleton var2) {
      this.transformCount = -1;
      this.hasAlphaTransform = false;
      this.skeleton = var2;
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      var3.offset = -811429270;
      int var5 = var3.readUnsignedByte(38796366);
      int var6 = -1;
      int var7 = 0;
      var4.offset = (var3.offset * 2108391709 + var5) * 1741769013;

      for (int var8 = 0; var8 < var5; var8++) {
         int var9 = var3.readUnsignedByte(-324712401);
         if (var9 > 0) {
            if (this.skeleton.transformTypes[var8] != 0) {
               for (int var10 = var8 - 1; var10 > var6; var10--) {
                  if (this.skeleton.transformTypes[var10] == 0) {
                     field3190[var7] = var10;
                     field3191[var7] = 0;
                     field3193[var7] = 0;
                     field3192[var7] = 0;
                     var7++;
                     break;
                  }
               }
            }

            field3190[var7] = var8;
            short var12 = 0;
            if (this.skeleton.transformTypes[var8] == 3) {
               var12 = 128;
            }

            if ((var9 & 1) != 0) {
               field3191[var7] = var4.readShortSmart(393165114);
            } else {
               field3191[var7] = var12;
            }

            if ((var9 & 2) != 0) {
               field3193[var7] = var4.readShortSmart(1280897897);
            } else {
               field3193[var7] = var12;
            }

            if ((var9 & 4) != 0) {
               field3192[var7] = var4.readShortSmart(-560387943);
            } else {
               field3192[var7] = var12;
            }

            var6 = var8;
            var7++;
            if (this.skeleton.transformTypes[var8] == 5) {
               this.hasAlphaTransform = true;
            }
         }
      }

      if (var4.offset * 2108391709 != var1.length) {
         throw new RuntimeException();
      } else {
         this.transformCount = var7;
         this.transformYs = new int[var7];
         this.transformSkeletonLabels = new int[var7];
         this.transformZs = new int[var7];
         this.transformXs = new int[var7];

         for (int var11 = 0; var11 < var7; var11++) {
            this.transformYs[var11] = field3190[var11];
            this.transformSkeletonLabels[var11] = field3191[var11];
            this.transformZs[var11] = field3193[var11];
            this.transformXs[var11] = field3192[var11];
         }

         var3.offset = var4.offset * 1;
      }
   }
}
