import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fa")
public class classFA implements classTL {
   @ObfuscatedName("nc")
   public int[] field2183;
   @ObfuscatedName("af")
   public int[] field2182;
   @ObfuscatedName("aq")
   boolean[] field2173;
   @ObfuscatedName("ae")
   public int field2176;
   @ObfuscatedName("ay")
   boolean[] field2174;
   @ObfuscatedName("go")
   public int field2164;
   @ObfuscatedName("ab")
   int[] field2172;
   @ObfuscatedName("ff")
   public int[] field2167 = new int[128];
   @ObfuscatedName("as")
   public char field2175;
   @ObfuscatedName("wj")
   public int field2181;
   @ObfuscatedName("ax")
   public int field2177;
   @ObfuscatedName("ac")
   char[] field2166;
   @ObfuscatedName("ag")
   int field2163;
   @ObfuscatedName("ao")
   int field2169;
   @ObfuscatedName("al")
   int field2170;
   @ObfuscatedName("aj")
   int field2171;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2178 = 128;
   @ObfuscatedName("aa")
   int[] field2168;
   @ObfuscatedName("ad")
   boolean[] field2165;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field2180 = 106;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field2179 = 109;

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bg")
   public int[] method4544() {
      int[] var1 = new int[422327897 * this.field2164];

      for (int var2 = 0; var2 < this.field2164 * 422327897; var2++) {
         var1[var2] = this.field2167[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lfa;I)[I")
   @ObfuscatedName("cs")
   public static int[] method4555(classFA var0, int var1) {
      if (var0 == null) {
         return var0.method4554(var1);
      } else {
         int[] var2 = new int[var0.field2176];

         for (int var3 = 0; var3 < var0.field2176; var3++) {
            var2[var3] = var0.field2183[var3];
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod446(int var1, byte var2) {
      if (classTP.field6185) {
         if (this.field2164 * 422327897 < this.field2167.length) {
            int[] var10000 = this.field2167;
            int var10001 = this.field2164 * 422327897;
            this.field2164 = (this.field2164 * 422327897 + 1) * -1228426775;
            var10000[var10001] = var1;
         }
      } else {
         int var3 = var1;
         classFA var6 = this;
         byte var4 = 2;

         try {
            var6.method4527(var3, (byte)5);
            var6.field2174[var3] = true;
            var6.field2173[var3] = true;
            var6.field2165[var3] = false;
            if (var6.field2164 * 422327897 < 128) {
               if (var4 != 2) {
                  throw new IllegalStateException();
               }

               var6.field2167[(var6.field2164 += -1228426775) * 422327897 - 1] = var3;
            }

            boolean var7 = true;
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "fa.ab(" + ')');
         }

         if (this.field2176 < this.field2183.length) {
            this.field2183[this.field2176++] = var1;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod447(int var1, byte var2) {
      if (classTP.field6185) {
         if (this.field2163 * -1467379791 < this.field2172.length) {
            int[] var10000 = this.field2172;
            int var10001 = this.field2163 * -1467379791;
            this.field2163 = (this.field2163 * -1467379791 + 1) * 269834577;
            var10000[var10001] = var1;
         }
      } else {
         int var3 = var1;
         classFA var6 = this;
         boolean var4 = true;

         try {
            var6.field2174[var3] = false;
            var6.field2173[var3] = false;
            var6.field2165[var3] = true;
            if (-1467379791 * var6.field2163 < 128) {
               var6.field2172[(var6.field2163 += 269834577) * -1467379791 - 1] = var3;
            }

            boolean var7 = true;
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "fa.ag(" + ')');
         }

         if (this.field2177 < this.field2182.length) {
            this.field2182[this.field2177++] = var1;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("as")
   @Override
   public boolean vmethod448(char var1, int var2) {
      if (!classTP.field6185) {
         char var3 = var1;
         classFA var7 = this;
         int var4 = 1791336663;

         try {
            int var5 = 1793736147 * var7.field2170 + 1 & 127;
            if (var7.field2169 * 1493235637 != var5) {
               var7.field2168[var7.field2170 * 1793736147] = -1;
               var7.field2166[var7.field2170 * 1793736147] = var3;
               var7.field2170 = 1369580123 * var5;
            }

            boolean var8 = false;
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "fa.as(" + ')');
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(ZI)Z")
   @ObfuscatedName("ax")
   @Override
   public boolean vmethod444(boolean var1, int var2) {
      try {
         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "fa.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method4528(int var1) {
      this.method4552();

      try {
         this.field2169 = 1238797461 * this.field2171;
         this.field2171 = this.field2170 * 794645003;
         this.field2164 = 0;
         this.field2163 = 0;
         Arrays.fill(this.field2173, false);
         Arrays.fill(this.field2165, false);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "fa.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("az")
   void method4527(int var1, byte var2) {
      try {
         int var3 = 1 + this.field2170 * 1793736147 & 127;
         if (this.field2169 * 1493235637 != var3) {
            if (var2 != 5) {
               throw new IllegalStateException();
            }

            this.field2168[this.field2170 * 1793736147] = var1;
            this.field2166[1793736147 * this.field2170] = 0;
            this.field2170 = 1369580123 * var3;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "fa.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aa")
   public boolean method4533(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -1847010979) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.field2173[var1];
            }

            if (var2 == -1847010979) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "fa.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Z")
   @ObfuscatedName("ry")
   public boolean[] method4556() {
      return this.field2174;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("dq")
   static boolean method4551(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      classEZ.method4388(var0, var1, var2, var3, var4, var5, var6);

      try {
         classEZ var8 = classCQ.field1220.field1689;
         if (var5 == 1946452601 * classKV.field4034.field4038) {
            if (var7 != -208526133) {
               throw new IllegalStateException();
            }

            classFE var9 = var8.method4467(var0, var1, var2);
            if (null != var9) {
               if (var7 != -208526133) {
                  throw new IllegalStateException();
               }

               int var10 = classCN.method2552(7159317397185328723L * var9.field2240);
               if (78062377 * classKB.field3517.field3538 == var3) {
                  if (var7 != -208526133) {
                     throw new IllegalStateException();
                  }

                  var9.field2249 = new classDY(classCQ.field1220, var10, 2, var4 + 4, var0, var1, var2, var6, false, var9.field2249);
                  var9.field2248 = new classDY(classCQ.field1220, var10, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var9.field2248);
               } else {
                  var9.field2249 = new classDY(classCQ.field1220, var10, var3, var4, var0, var1, var2, var6, false, var9.field2249);
               }

               classEZ.method4419(var0, var1, var2, var3, var4, var5, var6);
               return true;
            }
         } else if (var5 == 1946452601 * classKV.field4036.field4038) {
            if (var7 != -208526133) {
               throw new IllegalStateException();
            }

            classFI var12 = var8.method4420(var0, var1, var2);
            if (null != var12) {
               if (var7 != -208526133) {
                  throw new IllegalStateException();
               }

               label111: {
                  int var15 = classCN.method2552(-3608662145112923099L * var12.field2266);
                  if (var3 != classKB.field3520.field3538 * 78062377) {
                     if (var7 != -208526133) {
                        throw new IllegalStateException();
                     }

                     if (78062377 * classKB.field3525.field3538 != var3) {
                        if (78062377 * classKB.field3522.field3538 == var3) {
                           if (var7 != -208526133) {
                              throw new IllegalStateException();
                           }

                           var12.field2279 = new classDY(classCQ.field1220, var15, 4, 4 + var4, var0, var1, var2, var6, false, var12.field2279);
                        } else if (var3 == 78062377 * classKB.field3523.field3538) {
                           if (var7 != -208526133) {
                              throw new IllegalStateException();
                           }

                           var12.field2279 = new classDY(classCQ.field1220, var15, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var12.field2279);
                        } else if (classKB.field3524.field3538 * 78062377 == var3) {
                           var12.field2279 = new classDY(classCQ.field1220, var15, 4, 4 + var4, var0, var1, var2, var6, false, var12.field2279);
                           var12.field2278 = new classDY(classCQ.field1220, var15, 4, 4 + (var4 + 2 & 3), var0, var1, var2, var6, false, var12.field2278);
                        }
                        break label111;
                     }

                     if (var7 != -208526133) {
                        throw new IllegalStateException();
                     }
                  }

                  var12.field2279 = new classDY(classCQ.field1220, var15, 4, var4, var0, var1, var2, var6, false, var12.field2279);
               }

               classEZ.method4419(var0, var1, var2, var3, var4, var5, var6);
               return true;
            }
         } else if (1946452601 * classKV.field4035.field4038 == var5) {
            if (var7 != -208526133) {
               throw new IllegalStateException();
            }

            classFB var13 = var8.method4395(var0, var1, var2);
            if (var3 == 78062377 * classKB.field3526.field3538) {
               var3 = classKB.field3521.field3538 * 78062377;
            }

            if (null != var13) {
               if (var7 != -208526133) {
                  throw new IllegalStateException();
               }

               var13.field2200 = new classDY(
                  classCQ.field1220, classCN.method2552(var13.field2185 * 1745853678706228013L), var3, var4, var0, var1, var2, var6, false, var13.field2200
               );
               classEZ.method4419(var0, var1, var2, var3, var4, var5, var6);
               return true;
            }
         } else if (1946452601 * classKV.field4037.field4038 == var5) {
            if (var7 != -208526133) {
               throw new IllegalStateException();
            }

            classEO var14 = classEZ.method4457(var8, var0, var1, var2);
            if (null != var14) {
               if (var7 != -208526133) {
                  throw new IllegalStateException();
               }

               var14.field1816 = new classDY(
                  classCQ.field1220, classCN.method2552(var14.field1815 * 5132338419383099835L), 22, var4, var0, var1, var2, var6, false, var14.field1816
               );
               classEZ.method4419(var0, var1, var2, var3, var4, var5, var6);
               return true;
            }
         }

         classEZ.method4419(var0, var1, var2, var3, var4, var5, var6);
         return false;
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "fa.dq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bn")
   public boolean method4539(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2174[var1] : false;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("qd")
   public boolean method4557(int var1) {
      return method4540(this, var1, 1486897778);
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod443(char var1) {
      int var2 = -2063803178 * this.field2170 + 1 & 127;
      if (this.field2169 * 1417519993 != var2) {
         this.field2168[this.field2170 * 1793736147] = -1;
         this.field2166[this.field2170 * 1062444591] = var1;
         this.field2170 = 1369580123 * var2;
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ar")
   @Override
   public boolean vmethod438(int var1) {
      this.method4527(var1, (byte)5);
      this.field2174[var1] = true;
      this.field2173[var1] = true;
      this.field2165[var1] = false;
      if (this.field2164 * 1684796856 < 128) {
         this.field2167[(this.field2164 += -1070132417) * -1712614544 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("aj")
   public int[] method4553(int var1) {
      int[] var2 = new int[this.field2177];

      for (int var3 = 0; var3 < this.field2177; var3++) {
         var2[var3] = this.field2182[var3];
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("sa")
   public void method4552() {
      this.field2176 = 0;
      this.field2177 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   @Override
   public boolean vmethod440(int var1) {
      this.field2174[var1] = false;
      this.field2173[var1] = false;
      this.field2165[var1] = true;
      if (-1467379791 * this.field2163 < -344169988) {
         this.field2172[(this.field2163 += -1510737587) * -1467379791 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hx")
   public void method4549() {
      this.field2183 = new int[this.field2167.length];
      this.field2182 = new int[this.field2172.length];
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("at")
   @Override
   public boolean vmethod441(int var1) {
      this.field2174[var1] = false;
      this.field2173[var1] = false;
      this.field2165[var1] = true;
      if (-1467379791 * this.field2163 < 128) {
         this.field2172[(this.field2163 += 269834577) * -1467379791 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("au")
   public boolean method4534(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2173[var1] : false;
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("am")
   @Override
   public boolean vmethod445(boolean var1) {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method4529() {
      this.field2169 = 1238797461 * this.field2171;
      this.field2171 = this.field2170 * -1159169878;
      this.field2164 = 0;
      this.field2163 = 0;
      Arrays.fill(this.field2173, false);
      Arrays.fill(this.field2165, false);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public final boolean method4530() {
      if (1493235637 * this.field2169 == 55912537 * this.field2171) {
         return false;
      } else {
         this.field2181 = -1809238967 * this.field2168[this.field2169 * 1493235637];
         this.field2175 = this.field2166[1493235637 * this.field2169];
         this.field2169 = 44662429 * (this.field2169 * 1493235637 + 1 & 127);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ad")
   public boolean method4535(int var1) {
      return var1 >= 0 && var1 < -1630000651 ? this.field2173[var1] : false;
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ao")
   public boolean method4543(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.field2165[var1];
            }

            if (var2 >= 0) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "fa.ao(" + ')');
      }
   }

   public classFA() {
      this.field2164 = 0;
      this.field2172 = new int[128];
      this.field2163 = 0;
      this.field2166 = new char[128];
      this.field2168 = new int[128];
      this.field2169 = 0;
      this.field2170 = 0;
      this.field2171 = 0;
      this.field2174 = new boolean[112];
      this.field2173 = new boolean[112];
      this.field2165 = new boolean[112];
      this.method4549();
   }

   @ObfuscatedSignature(descriptor = "(Lfa;II)Z")
   @ObfuscatedName("dh")
   public static boolean method4540(classFA var0, int var1, int var2) {
      if (var0 == null) {
         var0.method4538(var1, var1);
      }

      try {
         if (var1 >= 0) {
            if (var2 <= -270403001) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return var0.field2174[var1];
            }

            if (var2 <= -270403001) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "fa.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ai")
   public boolean method4536(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2173[var1] : false;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aw")
   @Override
   public boolean vmethod439(int var1) {
      this.method4527(var1, (byte)5);
      this.field2174[var1] = true;
      this.field2173[var1] = true;
      this.field2165[var1] = false;
      if (this.field2164 * 422327897 < 128) {
         this.field2167[(this.field2164 += -1228426775) * 422327897 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("ae")
   public final boolean method4531(short var1) {
      try {
         if (1493235637 * this.field2169 == 55912537 * this.field2171) {
            return false;
         } else {
            this.field2181 = -1809238967 * this.field2168[this.field2169 * 1493235637];
            this.field2175 = this.field2166[1493235637 * this.field2169];
            this.field2169 = 44662429 * (this.field2169 * 1493235637 + 1 & 127);
            return true;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "fa.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bc")
   public boolean method4541(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2174[var1] : false;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("br")
   public int[] method4545() {
      int[] var1 = new int[422327897 * this.field2164];

      for (int var2 = 0; var2 < this.field2164 * 422327897; var2++) {
         var1[var2] = this.field2167[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bx")
   public boolean method4542(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2174[var1] : false;
   }

   @ObfuscatedSignature(descriptor = "(Lsp;Ldh;I)Z")
   @ObfuscatedName("ca")
   static boolean method4550(classSP var0, classDH var1, int var2) {
      try {
         if (null != var0) {
            if (var2 != -1555620546) {
               throw new IllegalStateException();
            }

            if (var1 != null) {
               int var3 = -14785344 * var1.field1441;
               int var4 = -1547553299 * var1.field1487 - var3;
               int var5 = -1272026483 * var1.field1489 - var3;
               int var6 = -1547553299 * var1.field1487 + var3 - 1;
               int var7 = var3 + -1272026483 * var1.field1489 - 1;
               classVL var8 = classKO.method6506(524131857);
               var8.method11991(
                  var0.field6026.method8482(-1030535322), var0.vmethod368(311606126), var0.vmethod371(-1383677015), var0.method10561(-914918388), 1946119928
               );
               boolean var9 = classSW.method10699(var8, var4, var5, var6, var7, 1183312927);
               var8.method11971(586690183);
               return var9;
            }

            if (var2 != -1555620546) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "fa.ca(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bp")
   public int[] method4546() {
      int[] var1 = new int[this.field2163 * -1467379791];

      for (int var2 = 0; var2 < this.field2163 * 1822050080; var2++) {
         var1[var2] = this.field2172[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bj")
   public int[] method4547() {
      int[] var1 = new int[this.field2163 * -1467379791];

      for (int var2 = 0; var2 < this.field2163 * -1467379791; var2++) {
         var1[var2] = this.field2172[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bt")
   public int[] method4548() {
      int[] var1 = new int[this.field2163 * -1467379791];

      for (int var2 = 0; var2 < this.field2163 * -1467379791; var2++) {
         var1[var2] = this.field2172[var2];
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod442(int var1) {
      this.field2174[var1] = false;
      this.field2173[var1] = false;
      this.field2165[var1] = true;
      if (958590431 * this.field2163 < 1246857244) {
         this.field2172[(this.field2163 += -1568993007) * 1885719854 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(IB)Lze;")
   @ObfuscatedName("af")
   public static classZE method4532(int var0, byte var1) {
      try {
         classZE var2 = (classZE)classZE.field7171.method6422(var0);
         if (null != var2) {
            return var2;
         } else {
            byte[] var3 = classZE.field7177.method11867(38, var0, -2122935696);
            var2 = new classZE(new classXY(var3), var0, -1);
            classZE.field7171.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "fa.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ap")
   public boolean method4537(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2173[var1] : false;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("al")
   public int[] method4554(int var1) {
      int[] var2 = new int[this.field2176];

      for (int var3 = 0; var3 < this.field2181; var3++) {
         var2[var3] = this.field2183[var3];
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   public boolean method4538(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -1847010979) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.field2173[var1];
            }

            if (var2 == -1847010979) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "fa.ac(" + ')');
      }
   }
}
