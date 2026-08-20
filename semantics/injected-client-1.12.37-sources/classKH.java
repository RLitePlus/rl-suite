import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kh")
public class classKH extends classVJ {
   @ObfuscatedName("az")
   public final int field3586;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field3589 = 30;
   @ObfuscatedName("ae")
   public final int[] field3584;
   @ObfuscatedName("ab")
   public final int[] field3587;
   @ObfuscatedName("af")
   public final int field3585;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field3588 = 32;

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("oc")
   public int[] method6482() {
      return this.field3587;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("af")
   public boolean method6478(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field3587.length) {
         int var3 = this.field3587[var2];
         if (var1 >= var3 && var1 <= var3 + this.field3584[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lva;S)I")
   @ObfuscatedName("af")
   static int method6477(AbstractArchive var0, short var1) {
      try {
         int var2 = classBF.field414.length + classBF.field411.length;
         String[] var3 = classBF.field386;

         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (var0.method11848(var5, -123140444) != -1) {
               if (var1 >= 255) {
                  throw new IllegalStateException();
               }

               var2++;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "kh.af(" + 41);
      }
   }

   classKH(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field3586 = var1 * 1709305797;
      this.field3585 = var2 * -38113611;
      this.field3584 = var3;
      this.field3587 = var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vb")
   public int method6483() {
      return this.field3586 * -1246906611;
   }

   @ObfuscatedSignature(descriptor = "([IB)Lte;")
   @ObfuscatedName("aj")
   public static classTE method6476(int[] var0, byte var1) {
      try {
         classTE var2 = new classTE(classYY.field7111, true);
         var2.field6126 = var0;
         var2.field6131 = var0.length * -1063196331;
         var2.field6123 = var0.length * 404453943;
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "kh.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkh;III)Z")
   @ObfuscatedName("ej")
   public static boolean method6479(classKH var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method6481(var1, var1, var1);
      }

      try {
         if (var2 >= 0) {
            if (var3 <= -2140697775) {
               throw new IllegalStateException();
            }

            if (var2 < var0.field3587.length) {
               int var4 = var0.field3587[var2];
               if (var1 >= var4) {
                  if (var3 <= -2140697775) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= var4 + var0.field3584[var2]) {
                     if (var3 <= -2140697775) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "kh.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkh;II)Z")
   @ObfuscatedName("qi")
   public static boolean method6480(classKH var0, int var1, int var2) {
      if (var0 == null) {
         var0.method6486(var1, var1);
      }

      if (var2 >= 0 && var2 < var0.field3587.length) {
         int var3 = var0.field3587[var2];
         if (var1 >= var3 && var1 <= var3 + var0.field3584[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ga")
   public int[] method6484() {
      return this.field3584;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("wh")
   public int method6485() {
      return this.field3585 * -1637380195;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[JIII)V")
   @ObfuscatedName("ag")
   public static void method6475(String[] var0, long[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            long var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var10 = var2; var10 < var3; var10++) {
               if (var4 == -470927658) {
                  throw new IllegalStateException();
               }

               if (var7 != null) {
                  if (var4 == -470927658) {
                     return;
                  }

                  if (null == var0[var10] || var0[var10].compareTo(var7) >= (var10 & 1)) {
                     continue;
                  }

                  if (var4 == -470927658) {
                     throw new IllegalStateException();
                  }
               }

               String var11 = var0[var10];
               var0[var10] = var0[var6];
               var0[var6] = var11;
               long var12 = var1[var10];
               var1[var10] = var1[var6];
               var1[var6++] = var12;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method6475(var0, var1, var2, var6 - 1, 797807956);
            method6475(var0, var1, var6 + 1, var3, 289945362);
         }
      } catch (RuntimeException var14) {
         throw classEG.newRunException(var14, "kh.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("vf")
   public boolean method6486(int var1, int var2) {
      return method6479(this, var1, var2, 700473093);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("az")
   public boolean method6481(int var1, int var2, int var3) {
      try {
         if (var2 >= 0) {
            if (var3 <= -2140697775) {
               throw new IllegalStateException();
            }

            if (var2 < this.field3584.length) {
               int var4 = this.field3587[var2];
               if (var1 >= var4) {
                  if (var3 <= -2140697775) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= var4 + this.field3584[var2]) {
                     if (var3 <= -2140697775) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "kh.az(" + ')');
      }
   }
}
