import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sy")
public class classSY {
   @ObfuscatedName("as")
   float field6101 = Float.MAX_VALUE;
   @ObfuscatedName("ab")
   float field6102;
   @ObfuscatedName("az")
   int field6103;
   @ObfuscatedName("ae")
   float field6099 = Float.MAX_VALUE;
   @ObfuscatedName("af")
   float field6098 = Float.MAX_VALUE;
   @ObfuscatedName("ag")
   float field6100 = Float.MAX_VALUE;
   @ObfuscatedSignature(descriptor = "Lsy;")
   @ObfuscatedName("ax")
   classSY field6104;

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("az")
   void method10715(classXY var1, int var2, int var3) {
      try {
         this.field6103 = var1.method13050((byte)16) * -1704955975;
         this.field6102 = var1.method13062(1386282862);
         this.field6101 = var1.method13062(-422565930);
         this.field6099 = var1.method13062(2120343611);
         this.field6098 = var1.method13062(713711615);
         this.field6100 = var1.method13062(-227074139);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "sy.az(" + ')');
      }
   }

   classSY() {
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ae")
   void method10716(classXY var1, int var2) {
      this.field6103 = var1.method13050((byte)16) * -1704955975;
      this.field6102 = var1.method13062(-1028566497);
      this.field6101 = var1.method13062(480949948);
      this.field6099 = var1.method13062(1840430139);
      this.field6098 = var1.method13062(-834142439);
      this.field6100 = var1.method13062(993234334);
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljava/lang/Object;")
   @ObfuscatedName("bn")
   static Object[] method10721(int var0) {
      try {
         String var1 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
         Object[] var2 = new Object[var1.length()];

         for (int var3 = var1.length() - 1; var3 >= 0; var3--) {
            if (var0 <= 818745819) {
               throw new IllegalStateException();
            }

            if (var1.charAt(var3) == 'i') {
               if (var0 <= 818745819) {
                  throw new IllegalStateException();
               }

               var2[var3] = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            } else {
               var2[var3] = classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "sy.bn(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;)Z")
   @ObfuscatedName("wp")
   public static boolean method10719(classVV var0) {
      return null == var0.field6617;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)I")
   @ObfuscatedName("zv")
   public static int method10720(classPL var0) {
      if (var0 == null) {
         var0.method9004();
      }

      return 1525345516 * var0.field5287;
   }

   @ObfuscatedSignature(descriptor = "(Lte;Lte;I)I")
   @ObfuscatedName("az")
   public static int method10714(classTE var0, classTE var1, int var2) {
      try {
         if (var0 == var1) {
            if (var2 != -325353510) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if (null == var0) {
            if (var2 != -325353510) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (var1 == null) {
            return 1;
         } else {
            int var3 = var0.method10756(-356529791);
            int var4 = var1.method10756(-480017276);
            int var5 = Math.min(var3, var4);
            if (classYY.field7111 == var0.field6128 && classYY.field7111 == var1.field6128) {
               if (var2 != -325353510) {
                  throw new IllegalStateException();
               }

               int[] var12 = var0.method10748(1466976318);
               int[] var14 = var1.method10748(1580187264);

               for (int var16 = 0; var16 < var5; var16++) {
                  if (var2 != -325353510) {
                     throw new IllegalStateException();
                  }

                  if (var12[var16] < var14[var16]) {
                     if (var2 != -325353510) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }

                  if (var12[var16] > var14[var16]) {
                     if (var2 != -325353510) {
                        throw new IllegalStateException();
                     }

                     return 1;
                  }
               }
            } else {
               if (var0.field6128 == classYY.field7115) {
                  if (var2 != -325353510) {
                     throw new IllegalStateException();
                  }

                  if (var1.field6128 == classYY.field7115) {
                     if (var2 != -325353510) {
                        throw new IllegalStateException();
                     }

                     long[] var11 = var0.method10750(-1985316054);
                     long[] var13 = var1.method10750(-261201653);

                     for (int var15 = 0; var15 < var5; var15++) {
                        if (var2 != -325353510) {
                           throw new IllegalStateException();
                        }

                        if (var11[var15] < var13[var15]) {
                           if (var2 != -325353510) {
                              throw new IllegalStateException();
                           }

                           return -1;
                        }

                        if (var11[var15] > var13[var15]) {
                           if (var2 != -325353510) {
                              throw new IllegalStateException();
                           }

                           return 1;
                        }
                     }

                     return var3 < var4 ? -1 : (var4 == var3 ? 0 : 1);
                  }
               }

               if (classYY.field7113 != var0.field6128) {
                  throw new RuntimeException();
               }

               if (var2 != -325353510) {
                  throw new IllegalStateException();
               }

               if (classYY.field7113 != var1.field6128) {
                  throw new RuntimeException();
               }

               if (var2 != -325353510) {
                  throw new IllegalStateException();
               }

               Object[] var6 = classTE.method10753(var0, 1968563847);
               Object[] var7 = classTE.method10753(var1, -1462959061);

               for (int var8 = 0; var8 < var5; var8++) {
                  int var9 = ((String)var6[var8]).compareTo((String)var7[var8]);
                  if (var9 < 0) {
                     if (var2 != -325353510) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }

                  if (var9 > 0) {
                     if (var2 != -325353510) {
                        throw new IllegalStateException();
                     }

                     return 1;
                  }
               }
            }

            return var3 < var4 ? -1 : (var4 == var3 ? 0 : 1);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "sy.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsy;Lxy;I)V")
   @ObfuscatedName("cp")
   public static void method10717(classSY var0, classXY var1, int var2) {
      if (var0 == null) {
         var0.method10718(var1, var2);
      }

      var0.field6103 = var1.method13050((byte)16) * -1704955975;
      var0.field6102 = var1.method13062(-83963739);
      var0.field6101 = var1.method13062(291689664);
      var0.field6099 = var1.method13062(1269653316);
      var0.field6098 = var1.method13062(-250677433);
      var0.field6100 = var1.method13062(1854011696);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ab")
   void method10718(classXY var1, int var2) {
      this.field6103 = var1.method13050((byte)16) * -1704955975;
      this.field6102 = var1.method13062(954238399);
      this.field6101 = var1.method13062(1140390718);
      this.field6099 = var1.method13062(787704173);
      this.field6098 = var1.method13062(1876739545);
      this.field6100 = var1.method13062(22579728);
   }
}
