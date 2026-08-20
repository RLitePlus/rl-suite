import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cv")
public class classCV extends classVQ {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final long field1304 = 4095L;
   @ObfuscatedName("az")
   int field1300;
   @ObfuscatedName("ab")
   int field1297;
   @ObfuscatedName("ae")
   int field1299;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field1301 = 19;
   @ObfuscatedName("af")
   int field1298;
   @ObfuscatedName("at")
   static String[] field1305;
   @ObfuscatedName("or")
   static int field1303;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field1302 = 47;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("rb")
   public int method2686() {
      return this.field1299 * -808970489;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ab")
   void method2679(int var1, int var2, int var3, int var4) {
      this.field1300 = -6191587 * var1;
      this.field1298 = var2 * 1027400933;
      this.field1299 = var3 * 460302007;
      this.field1297 = var4 * 1157610687;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("az")
   void method2680(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.field1300 = -6191587 * var1;
         this.field1298 = var2 * 1027400933;
         this.field1299 = var3 * 460302007;
         this.field1297 = var4 * 1157610687;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "cv.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("af")
   void method2681(int var1, int var2, int var3, int var4) {
      this.field1300 = -6191587 * var1;
      this.field1298 = var2 * 1027400933;
      this.field1299 = var3 * 460302007;
      this.field1297 = var4 * 1157610687;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ae")
   void method2682(int var1, int var2, int var3, int var4) {
      this.field1300 = -6191587 * var1;
      this.field1298 = var2 * 1027400933;
      this.field1299 = var3 * 298986330;
      this.field1297 = var4 * 1157610687;
   }

   classCV(int var1, int var2, int var3, int var4) {
      this.field1300 = var1 * -6191587;
      this.field1298 = var2 * 1027400933;
      this.field1299 = var3 * 460302007;
      this.field1297 = var4 * 1157610687;
   }

   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("ab")
   public static int method2683(long var0) {
      try {
         return (int)(var0 >>> 16 & 7L);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cv.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("gn")
   static final void method2685(String var0, byte var1) {
      try {
         if (null == classIB.field2935) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         } else {
            classJL var2 = classEF.method3849(classJS.FRIENDCHAT_KICK, client.field795.field1535, (byte)-69);
            classXY.method12971(var2.field3343, classAU.method712(var0, (byte)77), (byte)-96);
            classXY.method12997(var2.field3343, var0, (short)7263);
            client.field795.method3367(var2, -1301097035);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cv.gn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIB)I")
   @ObfuscatedName("bs")
   public static int method2684(byte[] var0, int var1, byte var2) {
      try {
         return classPY.method9375(var0, 0, var1, -1206335529);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cv.bs(" + 41);
      }
   }
}
