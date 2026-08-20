import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hq")
public class classHQ implements classGE {
   @ToRemove(unused = "true")
   @ObfuscatedName("ct")
   static final int field2869 = 512;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field2867 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2866 = 14;
   @ObfuscatedName("bf")
   static int field2868;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2865 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2864 = 4;

   @ObfuscatedSignature(descriptor = "(ILxy;B)Lpi;")
   @ObfuscatedName("az")
   public static classPI method6093(int var0, classXY var1, byte var2) {
      try {
         int var3 = classXY.method13039(var1, -346779531);
         boolean var10000;
         if ((var3 & 1) != 0) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         if (0 != (var3 & 2)) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var5 = var10000;
         boolean var6 = (var3 & 4) != 0;
         if (0 != (var3 & 8)) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         classPI var8 = new classPI(var0);
         if (var4) {
            int[] var10;
            label154: {
               int var9 = classXY.method13039(var1, -346779531);
               var10 = new int[]{var9 & 15, var9 >> 4 & 15};
               if (null != var8.field5261) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  if (var8.field5261.length == var10.length) {
                     if (var2 <= 2) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                     break label154;
                  }
               }

               var10000 = false;
            }

            boolean var11 = var10000;

            for (int var12 = 0; var12 < 2; var12++) {
               if (var2 <= 2) {
                  throw new IllegalStateException();
               }

               if (15 != var10[var12]) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  short var13 = (short)classXY.method13047(var1, -2092843255);
                  if (var11) {
                     var8.field5261[var10[var12]] = var13;
                  }
               }
            }
         }

         if (var5) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            int var15 = classXY.method13039(var1, -346779531);
            int[] var16 = new int[]{var15 & 15, var15 >> 4 & 15};
            if (null != var8.field5260 && var8.field5260.length == var16.length) {
               if (var2 <= 2) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var17 = var10000;

            for (int var18 = 0; var18 < 2; var18++) {
               if (var2 <= 2) {
                  throw new IllegalStateException();
               }

               if (15 != var16[var18]) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  short var19 = (short)classXY.method13047(var1, -1898895509);
                  if (var17) {
                     if (var2 <= 2) {
                        throw new IllegalStateException();
                     }

                     var8.field5260[var16[var18]] = var19;
                  }
               }
            }
         }

         if (var6) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            var8.field5257 = var1.method13117(classXM.field6888.field6890, 1566271411) * -1424760829;
            var8.field5258 = var1.method13117(classXM.field6888.field6890, 1755187850) * -286785645;
         }

         if (var7) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            var8.field5259 = var1.method13117(classXM.field6888.field6890, 1488196929) * 1097885037;
            var8.field5262 = var1.method13117(classXM.field6888.field6890, 1868658130) * -74289375;
         }

         return var8;
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "hq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Low;")
   @ObfuscatedName("az")
   @Override
   public classOW vmethod463(int var1, byte var2) {
      try {
         classOW var4 = (classOW)classOW.field5183.method6422(var1);
         classOW var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = classOW.field5185.method11867(4, var1, -1693839991);
            var4 = new classOW(new classXY(var5), var1);
            classOW.field5183.method6428(var4, var1);
            var3 = var4;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "hq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Low;")
   @ObfuscatedName("af")
   @Override
   public classOW vmethod464(int var1) {
      classOW var3 = (classOW)classOW.field5183.method6422(var1);
      classOW var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = classOW.field5185.method11867(4, var1, -803899226);
         var3 = new classOW(new classXY(var4), var1);
         classOW.field5183.method6428(var3, var1);
         var2 = var3;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Low;")
   @ObfuscatedName("ae")
   @Override
   public classOW vmethod465(int var1) {
      classOW var3 = (classOW)classOW.field5183.method6422(var1);
      classOW var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = classOW.field5185.method11867(4, var1, -1030441563);
         var3 = new classOW(new classXY(var4), var1);
         classOW.field5183.method6428(var3, var1);
         var2 = var3;
      }

      return var2;
   }

   classHQ() {
   }
}
