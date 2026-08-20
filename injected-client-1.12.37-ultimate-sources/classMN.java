import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mn")
public class classMN {
   @ObfuscatedName("af")
   public float[] field4541;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field4543 = 46;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field4542 = 5;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("aq")
   public static classVA field4545;
   @ObfuscatedSignature(descriptor = "Ley;")
   @ObfuscatedName("az")
   public classEY field4544;

   @ObfuscatedSignature(descriptor = "(Lsp;Ldz;I)Z")
   @ObfuscatedName("cc")
   static boolean method7624(classSP var0, classDZ var1, int var2) {
      try {
         for (int var3 = 0; var3 < -2087374717 * client.field837.field1419; var3++) {
            if (var2 >= 88068473) {
               throw new IllegalStateException();
            }

            classCT var4 = (classCT)var1.field1694.method13404(client.field837.field1423[var3]);
            if (classFA.method4550(var0, var4, -1555620546)) {
               if (var2 >= 88068473) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         for (int var8 = 0; var8 < classZH.method14003(var1.field1697, (byte)10); var8++) {
            if (var2 >= 88068473) {
               throw new IllegalStateException();
            }

            classDN var10 = (classDN)var1.field1698.method13404(var1.field1697.method14001(var8, 2081965195));
            if (null != var10) {
               if (var2 >= 88068473) {
                  throw new IllegalStateException();
               }

               if (var10.field1581.method8930(936289412).vmethod546((byte)0)) {
                  if (var2 >= 88068473) {
                     throw new IllegalStateException();
                  }

                  if (classFA.method4550(var0, var10, -1555620546)) {
                     return true;
                  }
               }
            }
         }

         classUQ var9 = classLC.method6675(var0.field6019, var0.field6026.method8482(-1468800021), -734679843);

         for (int var11 = 0; var11 < classZH.method14003(var1.field1693, (byte)10); var11++) {
            classSP var5 = (classSP)var1.field1700.method13595(var1.field1693.method14001(var11, 1881451855));
            if (null != var5) {
               if (var2 >= 88068473) {
                  throw new IllegalStateException();
               }

               if (var0 != var5) {
                  if (var2 >= 88068473) {
                     throw new IllegalStateException();
                  }

                  if (1612595797 * client.field855 == var5.field6012.field1689.field2142) {
                     classUQ var6 = classLC.method6675(var5.field6019, var5.field6026.method8482(1210286274), 181881556);
                     if (var9.method11482(var6, -1807797079)) {
                        if (var2 >= 88068473) {
                           throw new IllegalStateException();
                        }

                        var9.method11467((byte)-71);
                        var6.method11467((byte)-72);
                        return true;
                     }

                     var6.method11467((byte)-116);
                  }
               }
            }
         }

         var9.method11467((byte)-100);
         return false;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "mn.cc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsg;I)Luu;")
   @ObfuscatedName("ly")
   public static classUU method7625(classSG var0, int var1) {
      if (var0 == null) {
         var0.method10423(var1);
      }

      rl2 var2 = rl21.field5728.field5722[var0.field5928];
      return var2.field5716;
   }

   @ObfuscatedSignature(descriptor = "(ILlw;IIIII[FB)Llw;")
   @ObfuscatedName("az")
   static classLW method7623(int var0, classLW var1, int var2, int var3, int var4, int var5, int var6, float[] var7, byte var8) {
      try {
         classLW var9 = new classLW();
         var9.field4375 = 685068937 * var0;
         var9.field4342 = 498391781 * var1.field4329;
         var9.field4260 = var2 * -1612510305;
         var9.field4275 = true;
         var9.field4264 = var3 * 1632281619;
         var9.field4250 = var4 * 454876301;
         var9.field4251 = var5 * -1430539503;
         var9.field4252 = -565540095 * var6;
         var9.field4248 = (int)(1115597881 * var1.field4249 * var7[0]) * -1076753689;
         var9.field4285 = 1989424741 * (int)(var7[1] * (293773697 * var1.field4259));
         var9.field4255 = 1034606045 * (int)(var1.field4249 * 1115597881 * var7[2]);
         var9.field4335 = -259501473 * (int)(293773697 * var1.field4259 * var7[3]);
         return var9;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "mn.az(" + ')');
      }
   }

   classMN(classMS var1) {
      this.this$0 = var1;
      this.field4541 = new float[4];
   }
}
