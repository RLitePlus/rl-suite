import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iw")
public class classIW extends classHB {
   @ObfuscatedName("af")
   byte field3073;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field3074 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field3076 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field3080 = 116;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final String field3081 = "percent_";
   @ObfuscatedName("az")
   int field3072;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   public static final int field3079 = 35;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field3075 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field3077 = 1076101378;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3078 = 1076101507;

   @ObfuscatedSignature(descriptor = "(Lby;III)V")
   @ObfuscatedName("eu")
   static final void method6324(classBY var0, int var1, int var2, int var3) {
      try {
         if (null != var0) {
            if (var3 >= 278366) {
               throw new IllegalStateException();
            }

            classQP.method9703(
               var0.field606 * -1898447825,
               1064501843 * var0.field613,
               568212409 * var0.field612,
               var0.field608 * -675640733,
               var0.field609 * -93349349,
               var0.field610 * -522427581,
               var0.field616,
               var0.field615,
               var1,
               var2,
               (byte)-55
            );
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "iw.eu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(classIQ var1, byte var2) {
      try {
         var1.method6271(1280951887 * this.field3072, this.field3073, (byte)-45);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iw.af(" + ')');
      }
   }

   classIW(classIF var1) {
      this.this$0 = var1;
      this.field3072 = 547647313;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      this.field3072 = classXY.method13047(var1, 3034607) * -547647313;
      this.field3073 = classXY.method13043(var1, (byte)17);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      this.field3072 = classXY.method13047(var1, -1461109209) * -547647313;
      this.field3073 = classXY.method13043(var1, (byte)17);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(classIQ var1) {
      var1.method6271(-1561213768 * this.field3072, this.field3073, (byte)-121);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(classIQ var1) {
      var1.method6271(1280951887 * this.field3072, this.field3073, (byte)-8);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(classIQ var1) {
      var1.method6271(1280951887 * this.field3072, this.field3073, (byte)-90);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         this.field3072 = classXY.method13047(var1, -103951534) * -547647313;
         this.field3073 = classXY.method13043(var1, (byte)17);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iw.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)[I")
   @ObfuscatedName("az")
   static int[] method6322(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         int[] var6 = new int[256];

         for (int var7 = 0; var7 < 64; var7++) {
            if (var5 <= 1) {
               throw new IllegalStateException();
            }

            var6[var7] = classEI.method3896(var0, var1, var7, -2051091202);
         }

         for (int var9 = 0; var9 < 64; var9++) {
            var6[64 + var9] = classEI.method3896(var1, var2, var9, -1874606988);
         }

         for (int var10 = 0; var10 < 64; var10++) {
            if (var5 <= 1) {
               throw new IllegalStateException();
            }

            var6[128 + var10] = classEI.method3896(var2, var3, var10, -1697785566);
         }

         for (int var11 = 0; var11 < 64; var11++) {
            var6[var11 + 192] = classEI.method3896(var3, var4, var11, -2057552385);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "iw.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ax")
   static int method6323(int var0, byte var1) {
      try {
         classCG var2 = (classCG)classCN.field1174.method13595(var0);
         if (var2 == null) {
            if (var1 == 96) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (var2.field6516 == classCN.field1173.field4800) {
            if (var1 == 96) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 707758669 * ((classCG)var2.field6516).field725;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iw.ax(" + 41);
      }
   }
}
