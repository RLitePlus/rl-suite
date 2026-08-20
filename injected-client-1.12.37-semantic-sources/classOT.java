import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ot")
public class classOT {
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field5115 = 34;
   @ObfuscatedName("ae")
   public int field5110;
   @ObfuscatedName("ag")
   public int field5114;
   @ObfuscatedName("af")
   public int field5111;
   @ObfuscatedName("az")
   public int field5112;
   @ObfuscatedName("ab")
   public int field5113 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final String field5116 = ",";
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("du")
   public static AbstractArchive field5117;

   @ObfuscatedSignature(descriptor = "(Ldz;IILup;Lkh;I)V")
   @ObfuscatedName("af")
   static void method8731(WorldView var0, int var1, int var2, classUP var3, classKH var4, int var5) {
      try {
         for (int var6 = 0; var6 < 1296729483 * var0.field1696; var6++) {
            if (var5 >= -622888314) {
               return;
            }

            for (int var7 = 0; var7 < var0.field1692 * -1269171107; var7++) {
               classNN var8 = var0.field1701[var0.field1710 * -483624883][var6][var7];
               if (var8 != null) {
                  if (var5 >= -622888314) {
                     throw new IllegalStateException();
                  }

                  if (var0.method3719(-2087374717)) {
                     if (var5 >= -622888314) {
                        throw new IllegalStateException();
                     }

                     int var9 = 2 + var6 * 4 - 2106329293 * client.field962 / 32;
                     int var10 = 2 + var7 * 4 - client.field986 * -2126074583 / 32;
                     classBO.method1165(var1, var2, var9, var10, var3, classPE.field5234[0], var4, (byte)90);
                  } else {
                     classUZ var15 = classYY.method13790(var0, classKY.method6605(var6, 1744931264), classKY.method6605(var7, 319964660), (byte)106);
                     int var16 = (int)var15.field6427;
                     int var11 = (int)var15.field6426;
                     classUZ.method11727(var15, 1858745959);
                     int var12 = var16 / 32 - client.field962 * 2106329293 / 32;
                     int var13 = var11 / 32 - client.field986 * -2126074583 / 32;
                     classBO.method1165(var1, var2, var12, var13, var3, classPE.field5234[0], var4, (byte)106);
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "ot.af(" + ')');
      }
   }

   classOT(int var1, int var2, int var3, int var4, int var5) {
      this.field5110 = 1904983035;
      this.field5114 = 0;
      this.field5111 = 0;
      this.field5112 = 0;
      this.field5113 = -1519924349 * var1;
      this.field5110 = 1904983035 * var2;
      this.field5114 = 1485655469 * var3;
      this.field5111 = var4 * -2014204285;
      this.field5112 = 73484471 * var5;
   }

   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;B)[Lyz;")
   @ObfuscatedName("ab")
   public static IndexedSprite[] method8732(AbstractArchive var0, String var1, String var2, byte var3) {
      try {
         if (!AbstractArchive.method11853(var0, var1, var2, 1946412001)) {
            if (var3 <= 14) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var0.method11848(var1, -286483869);
            int var5 = var0.method11851(var4, var2, (byte)-40);
            IndexedSprite[] var6;
            if (!classHK.method6068(var0, var4, var5, (byte)-92)) {
               if (var3 <= 14) {
                  throw new IllegalStateException();
               }

               var6 = null;
            } else {
               var6 = classFS.method4978((byte)-88);
            }

            return var6;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ot.ab(" + ')');
      }
   }
}
