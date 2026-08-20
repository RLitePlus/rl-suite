import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.runelite.api.Animation;
import net.runelite.api.Model;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ou")
public class classOU extends classVJ implements Animation {
   @ObfuscatedName("ba")
   final int[] field5135;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field5147 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5148 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5146 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field5149 = 8;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("av")
   public static classVA field5153;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ah")
   public static classJZ field5141 = new classJZ(64);
   @ObfuscatedName("bo")
   public final int field5133;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field5150 = 0;
   @ObfuscatedName("bc")
   static boolean field5142 = false;
   @ObfuscatedName("bi")
   public final boolean field5123;
   @ObfuscatedName("br")
   public final Map field5120;
   @ObfuscatedName("bv")
   final int field5129;
   @ObfuscatedName("bm")
   final int field5130;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("bx")
   public static classJZ field5144 = new classJZ(100);
   @ObfuscatedName("be")
   public final int field5121;
   @ObfuscatedName("bk")
   public final int[] field5125;
   @ObfuscatedName("bd")
   public final int field5119;
   @ObfuscatedName("bu")
   public final int field5134;
   @ObfuscatedName("bj")
   final int[] field5132;
   @ObfuscatedName("bw")
   final boolean[] field5136;
   @ObfuscatedName("bb")
   public final int field5138;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final String field5152 = "date";
   @rl8(method10126 = 17)
   @ObfuscatedName("bl")
   public int field5122;
   @ObfuscatedName("by")
   public final int field5139;
   @ObfuscatedName("kd")
   public static final Set field5143 = ImmutableSet.of(472, 1729);
   @ObfuscatedName("tp")
   public int field5118 = -1;
   @ObfuscatedName("bq")
   public final int field5140;
   @ObfuscatedName("bf")
   public final int field5124;
   @ObfuscatedName("bs")
   public final int field5131;
   @ObfuscatedName("bg")
   public final int[] field5127;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("bn")
   public static classJZ field5145 = new classJZ(100);
   @ObfuscatedName("bt")
   final int field5126;
   @ObfuscatedName("bp")
   public final int field5128;
   @ObfuscatedName("bh")
   public final boolean field5137;
   @ToRemove(unused = "true")
   @ObfuscatedName("dx")
   public static final int field5151 = 103;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfs;")
   @ObfuscatedName("am")
   static classFS method8736(int var0) {
      classFS var1 = (classFS)field5145.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = classMS.method7649(classKP.field3986, classIY.field3099, var0, -1473802527);
         if (null != var1) {
            field5145.method6428(var1, var0);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   public int method8796() {
      return this.method8771(1901014809);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   public boolean method8767() {
      return 982132619 * this.field5128 >= 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   public int method8771(int var1) {
      try {
         return 1101853025 * this.field5130 - this.field5129 * -1900166697;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ou.aq(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lou;Lfx;I)Lfx;")
   @ObfuscatedName("cz")
   public static classFX method8754(classOU var0, classFX var1, int var2) {
      if (var0 == null) {
         var0.method8749(var2, var2);
      }

      if (!var0.method8768((byte)0)) {
         var2 = var0.field5127[var2];
         classFS var7 = classCN.method2557(var2 >> 16, 781516133);
         var2 &= 65535;
         if (var7 == null) {
            return var1.method5084(true);
         } else {
            classFX var8 = var1.method5084(!var7.method4976(var2, (byte)49));
            var8.method5106(var7, var2);
            return var8;
         }
      } else {
         classSN var3 = classGR.method5658(982132619 * var0.field5128, 342764102);
         if (var3 == null) {
            return var1.method5084(true);
         } else {
            classFX var4 = var1.method5084(!classSN.method10518(var3, 774973527));
            classFX.method5109(var4, var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;I)Lnet/runelite/api/Model;")
   @ObfuscatedName("zq")
   public Model method8797(classFX var1, int var2) {
      return method8793(this, var1, var2, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Lfx;IIB)Lfx;")
   @ObfuscatedName("ac")
   classFX method8790(classFX var1, int var2, int var3, byte var4) {
      return this.method8792(rl21.field5728, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Lfx;II)Lfx;")
   @ObfuscatedName("aa")
   classFX method8795(classFX var1, int var2, int var3) {
      if (var2 < 0 && !this.isMayaAnim()) {
         int var21 = var2 ^ Integer.MIN_VALUE;
         int var5 = var21 >> 16 & 16383;
         var2 = var21 & 65535;
         int var6 = var2 + 1;
         if (var6 >= this.field5127.length) {
            var6 = -1;
         }

         int var7 = this.field5127[var2];
         classFS var8 = classOE.field4843.method2451(var7 >> 16);
         int var9 = var7 & 65535;
         int var10 = -1;
         classFS var11 = null;
         if (var6 != -1) {
            int var12 = this.field5127[var6];
            var11 = classOE.field4843.method2451(var12 >> 16);
            var10 = var12 & 65535;
         }

         if (var8 == null) {
            return var1.method5266(true);
         } else {
            classFX var22 = var1.method5266(!var8.field2392[var9].field1910);
            var22.method5251(rl21.field5728, var8, var9, var11, var10, var5, this.field5125[var2]);
            return var22;
         }
      } else {
         if (var2 < 0) {
            int var4 = var2 ^ Integer.MIN_VALUE;
            var2 = var4 & 65535;
         }

         int var15 = var2;
         classFX var14 = var1;
         classOU var13 = this;
         int var16 = 356352012;

         try {
            classFX var10000;
            if (!var13.method8768((byte)0)) {
               if (var16 == -698145269) {
                  throw new IllegalStateException();
               }

               var15 = var13.field5127[var15];
               classFS var17 = classCN.method2557(var15 >> 16, 1209741532);
               var15 &= 65535;
               if (var17 == null) {
                  if (var16 == -698145269) {
                     throw new IllegalStateException();
                  }

                  classFX var23 = var14.method5084(true);
                  var10000 = var23;
               } else {
                  boolean var10001;
                  if (!var17.method4976(var15, (byte)-121)) {
                     if (var16 == -698145269) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  classFX var18 = var14.method5084(var10001);
                  var18.method5106(var17, var15);
                  var10000 = var18;
               }
            } else {
               classSN var27 = classGR.method5658(982132619 * var13.field5128, -121871174);
               if (var27 == null) {
                  if (var16 == -698145269) {
                     throw new IllegalStateException();
                  }

                  classFX var24 = var14.method5084(true);
                  var10000 = var24;
               } else {
                  classFX var28 = var14.method5084(!classSN.method10518(var27, 1083251105));
                  classFX.method5109(var28, var27, var15);
                  var10000 = var28;
               }
            }

            return var10000;
         } catch (RuntimeException var19) {
            throw classEG.method3884(var19, "ou.aa(" + ')');
         }
      }
   }

   classOU(classXY var1, int var2) {
      this.field5126 = -766716195 * var2;
      int var3 = -1;
      HashMap var4 = null;
      int var5 = 0;
      int var6 = 0;
      int[] var7 = null;
      int[] var8 = null;
      int[] var9 = null;
      int var10 = 0;
      int var11 = -1;
      int[] var12 = null;
      boolean[] var13 = null;
      byte var14 = 0;
      boolean var15 = false;
      int var16 = 5;
      int var17 = -1;
      int var18 = -1;
      int var19 = 99;
      int var20 = -1;
      int var21 = -1;
      int var22 = 2;
      boolean var23 = false;
      if (null != var1 && null != var1.field6954) {
         label218:
         while (true) {
            int var24 = classXY.method13039(var1, -346779531);
            switch (var24) {
               case 0:
                  break label218;
               case 1:
                  int var35 = classXY.method13047(var1, 1375017291);
                  var9 = new int[var35];

                  for (int var40 = 0; var40 < var35; var40++) {
                     var9[var40] = classXY.method13047(var1, -627706079);
                  }

                  var7 = new int[var35];

                  for (int var41 = 0; var41 < var35; var41++) {
                     var7[var41] = classXY.method13047(var1, -959474609);
                  }

                  for (int var42 = 0; var42 < var35; var42++) {
                     var7[var42] += classXY.method13047(var1, -1078483407) << 16;
                  }
                  break;
               case 2:
                  var11 = classXY.method13047(var1, -897496743);
                  break;
               case 3:
                  int var34 = classXY.method13039(var1, -346779531);
                  var12 = new int[var34 + 1];

                  for (int var39 = 0; var39 < var34; var39++) {
                     var12[var39] = classXY.method13039(var1, -346779531);
                  }

                  var12[var34] = 9999999;
                  break;
               case 4:
                  var15 = true;
                  break;
               case 5:
                  var16 = classXY.method13039(var1, -346779531);
                  break;
               case 6:
                  var17 = classXY.method13047(var1, -1530559703);
                  break;
               case 7:
                  var18 = classXY.method13047(var1, -2119168493);
                  break;
               case 8:
                  var19 = classXY.method13039(var1, -346779531);
                  break;
               case 9:
                  var20 = classXY.method13039(var1, -346779531);
                  break;
               case 10:
                  var21 = classXY.method13039(var1, -346779531);
                  break;
               case 11:
                  var22 = classXY.method13039(var1, -346779531);
                  break;
               case 12:
                  int var33 = classXY.method13039(var1, -346779531);
                  var8 = new int[var33];

                  for (int var37 = 0; var37 < var33; var37++) {
                     var8[var37] = classXY.method13047(var1, 1293324271);
                  }

                  for (int var38 = 0; var38 < var33; var38++) {
                     var8[var38] += classXY.method13047(var1, 690666412) << 16;
                  }
                  break;
               case 13:
                  var3 = var1.method13056((byte)1);
                  break;
               case 14:
                  int var32 = classXY.method13047(var1, -373093999);
                  if (null == var4) {
                     var4 = new HashMap();
                  }

                  for (int var36 = 0; var36 < var32; var36++) {
                     int var27 = classXY.method13047(var1, -790102863);
                     classOT var28 = classDM.method3433(var1, -849154980);
                     if (null != var28) {
                        if (!var4.containsKey(var27)) {
                           var4.put(var27, new ArrayList());
                        }

                        ((ArrayList)var4.get(var27)).add(var28);
                     }
                  }
                  break;
               case 15:
                  var5 = classXY.method13047(var1, -1996321657);
                  var6 = classXY.method13047(var1, -2046798678);
                  break;
               case 16:
                  var14 = classXY.method13043(var1, (byte)17);
                  break;
               case 17:
                  var13 = new boolean[256];

                  for (int var25 = 0; var25 < var13.length; var25++) {
                     var13[var25] = false;
                  }

                  int var31 = classXY.method13039(var1, -346779531);

                  for (int var26 = 0; var26 < var31; var26++) {
                     var13[classXY.method13039(var1, -346779531)] = true;
                  }
               case 18:
               default:
                  break;
               case 19:
                  var23 = true;
            }
         }
      }

      if (var20 == -1) {
         if (var12 == null && null == var13) {
            var20 = 0;
         } else {
            var20 = 2;
         }
      }

      if (-1 == var21) {
         if (null == var12 && var13 == null) {
            var21 = 0;
         } else {
            var21 = 2;
         }
      }

      if (null != var9) {
         var10 = 0;

         for (int var30 = 0; var30 < var9.length; var30++) {
            var10 += var9[var30];
         }
      }

      this.field5128 = -139933661 * var3;
      this.field5120 = var4;
      this.field5129 = 185975271 * var5;
      this.field5130 = var6 * -199265631;
      this.field5127 = var7;
      this.field5132 = var8;
      this.field5125 = var9;
      this.field5133 = -293117435 * var10;
      this.field5134 = 1039941295 * var11;
      this.field5135 = var12;
      this.field5136 = var13;
      this.field5138 = var14 * 62391105;
      this.field5137 = var15;
      this.field5121 = var16 * 258801263;
      this.field5139 = var17 * 935967061;
      this.field5140 = var18 * 317621309;
      this.field5124 = var19 * 1860155365;
      this.field5131 = -871691867 * var20;
      this.field5119 = var21 * 1539095341;
      this.field5122 = -991329609 * var22;
      this.field5123 = var23;
   }

   public int[] getFrameLengths() {
      return this.field5125;
   }

   @ObfuscatedSignature(descriptor = "(Lfx;ILou;IB)Lfx;")
   @ObfuscatedName("al")
   classFX method8760(classFX var1, int var2, classOU var3, int var4, byte var5) {
      try {
         var2 = this.field5127[var2];
         classFS var6 = classCN.method2557(var2 >> 16, 1353877852);
         var2 &= 65535;
         if (var6 == null) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            } else {
               return method8793(var3, var1, var4, (byte)0);
            }
         } else {
            var4 = var3.field5127[var4];
            classFS var7 = classCN.method2557(var4 >> 16, 1043107412);
            var4 &= 65535;
            if (var7 == null) {
               if (var5 >= 1) {
                  throw new IllegalStateException();
               } else {
                  classFX var14 = var1.method5081(!var6.method4976(var2, (byte)-37));
                  var14.method5106(var6, var2);
                  return var14;
               }
            } else {
               boolean var10001;
               if (!var6.method4976(var2, (byte)-107)) {
                  if (var5 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               boolean var10002;
               if (!var7.method4976(var4, (byte)-118)) {
                  if (var5 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10002 = true;
               } else {
                  var10002 = false;
               }

               classFX var8 = var1.method5081(var10001 & var10002);
               var8.method5121(var6, var2, var7, var4, this.field5135);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "ou.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lou;Lfx;IB)Lfx;")
   @ObfuscatedName("dm")
   public static classFX method8793(classOU var0, classFX var1, int var2, byte var3) {
      if (var0 == null) {
         return var0.method8794(var1, var2, var3);
      } else if (var2 < 0 && !var0.isMayaAnim()) {
         int var24 = var2 ^ Integer.MIN_VALUE;
         int var5 = var24 >> 16 & 16383;
         boolean var6 = (var24 & 1073741824) != 0;
         var2 = var24 & 65535;
         int var7 = var2 + 1;
         if (var7 >= var0.field5127.length) {
            if (field5143.contains(var0.field5118)) {
               var7 = -1;
            } else if (var0.field5134 * 1665914959 > 0) {
               var7 -= var0.field5134 * 1665914959;
            } else if (var6) {
               var7 = 0;
            }
         }

         int var8 = var0.field5127[var2];
         classFS var9 = classOE.field4843.method2451(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         classFS var12 = null;
         if (var7 >= 0 && var7 < var0.field5127.length) {
            int var13 = var0.field5127[var7];
            var12 = classOE.field4843.method2451(var13 >> 16);
            var11 = var13 & 65535;
         }

         if (var9 == null) {
            return var1.method5264(true);
         } else {
            classFX var25 = var1.method5264(!var9.field2392[var10].field1910);
            var25.method5251(rl21.field5728, var9, var10, var12, var11, var5, var0.field5125[var2]);
            return var25;
         }
      } else {
         if (var2 < 0) {
            int var4 = var2 ^ Integer.MIN_VALUE;
            var2 = var4 & 65535;
         }

         int var16 = var2;
         classFX var15 = var1;
         classOU var14 = var0;
         boolean var17 = false;

         try {
            classFX var10000;
            if (!var14.method8768((byte)0)) {
               if (var17) {
                  throw new IllegalStateException();
               }

               var16 = var14.field5127[var16];
               classFS var18 = classCN.method2557(var16 >> 16, 1755798141);
               var16 &= 65535;
               if (var18 == null) {
                  if (var17) {
                     throw new IllegalStateException();
                  }

                  classFX var26 = var15.method5081(true);
                  var10000 = var26;
               } else {
                  boolean var10001;
                  if (!var18.method4976(var16, (byte)75)) {
                     if (var17) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  classFX var19 = var15.method5081(var10001);
                  var19.method5106(var18, var16);
                  var10000 = var19;
               }
            } else {
               classSN var30;
               label109: {
                  int var31 = var14.field5128 * 982132619;
                  classSN var20 = classUG.method11321(var31, 10699284);
                  if (var20 != null) {
                     if (var17) {
                        throw new IllegalStateException();
                     }

                     if (var20.method10543((byte)-38)) {
                        if (var17) {
                           throw new IllegalStateException();
                        }

                        var30 = var20;
                        break label109;
                     }
                  }

                  var30 = null;
               }

               if (null == var30) {
                  if (var17) {
                     throw new IllegalStateException();
                  }

                  classFX var27 = var15.method5081(true);
                  var10000 = var27;
               } else {
                  boolean var32;
                  if (!classSN.method10518(var30, 433706305)) {
                     if (var17) {
                        throw new IllegalStateException();
                     }

                     var32 = true;
                  } else {
                     var32 = false;
                  }

                  classFX var21 = var15.method5081(var32);
                  classFX.method5109(var21, var30, var16);
                  var10000 = var21;
               }
            }

            return var10000;
         } catch (RuntimeException var22) {
            throw classEG.method3884(var22, "ou.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;II)Lfx;")
   @ObfuscatedName("aj")
   public classFX method8763(classFX var1, int var2, int var3) {
      try {
         if (!this.method8768((byte)0)) {
            int var4 = this.field5127[var2];
            classFS var5 = classCN.method2557(var4 >> 16, 1511684087);
            var4 &= 65535;
            if (null == var5) {
               if (var3 >= -1631789300) {
                  throw new IllegalStateException();
               } else {
                  return var1.method5081(true);
               }
            } else {
               classFS var6 = null;
               int var7 = 0;
               if (null != this.field5132 && var2 < this.field5132.length) {
                  if (var3 >= -1631789300) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field5132[var2];
                  var6 = classCN.method2557(var7 >> 16, 1867985083);
                  var7 &= 65535;
               }

               if (null != var6) {
                  if (var3 >= -1631789300) {
                     throw new IllegalStateException();
                  }

                  if (65535 != var7) {
                     boolean var13;
                     if (!var5.method4976(var4, (byte)22)) {
                        if (var3 >= -1631789300) {
                           throw new IllegalStateException();
                        }

                        var13 = true;
                     } else {
                        var13 = false;
                     }

                     boolean var10002;
                     if (!var6.method4976(var7, (byte)-77)) {
                        if (var3 >= -1631789300) {
                           throw new IllegalStateException();
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     classFX var12 = var1.method5081(var13 & var10002);
                     var12.method5106(var5, var4);
                     var12.method5106(var6, var7);
                     return var12;
                  }

                  if (var3 >= -1631789300) {
                     throw new IllegalStateException();
                  }
               }

               boolean var10001;
               if (!var5.method4976(var4, (byte)53)) {
                  if (var3 >= -1631789300) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               classFX var8 = var1.method5081(var10001);
               var8.method5106(var5, var4);
               return var8;
            }
         } else {
            return method8793(this, var1, var2, (byte)0);
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "ou.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;[IIIIII)V")
   @ObfuscatedName("ux")
   public static void method8789(classFT var0, int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0.field2378.field2211) {
         if (var6 > var0.field2378.field2227) {
            var6 = var0.field2378.field2227;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (var0.field2378.field2213 != 0) {
            if (var0.field2378.field2213 == 254) {
               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  var1[var2++] = var1[var2];
               }
            } else {
               int var7 = var0.field2378.field2213;
               int var8 = 256 - var0.field2378.field2213;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

               while (--var4 >= 0) {
                  int var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
               }

               var4 = var6 - var5 & 3;

               while (--var4 >= 0) {
                  int var28 = var1[var2];
                  var1[var2++] = var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00);
               }
            }
         } else {
            while (--var4 >= 0) {
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }

            var4 = var6 - var5 & 3;

            while (--var4 >= 0) {
               var1[var2++] = var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;ILou;I)Lfx;")
   @ObfuscatedName("bf")
   classFX method8761(classFX var1, int var2, classOU var3, int var4) {
      var2 = this.field5127[var2];
      classFS var5 = classCN.method2557(var2 >> 16, 2102040559);
      var2 &= 65535;
      if (var5 == null) {
         return method8793(var3, var1, var4, (byte)0);
      } else {
         var4 = var3.field5127[var4];
         classFS var6 = classCN.method2557(var4 >> 16, 2013558815);
         var4 &= 65535;
         if (var6 == null) {
            classFX var12 = var1.method5081(!var5.method4976(var2, (byte)52));
            var12.method5106(var5, var2);
            return var12;
         } else {
            classFX var7 = var1.method5081(!var5.method4976(var2, (byte)17) & !var6.method4976(var4, (byte)44));
            var7.method5121(var5, var2, var6, var4, this.field5135);
            return var7;
         }
      }
   }

   public int getId() {
      return this.field5118;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lsn;")
   @ObfuscatedName("ah")
   static classSN method8740(int var0) {
      classSN var1 = classUG.method11321(var0, -643749618);
      return var1 != null && var1.method10543((byte)-5) ? var1 : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Lsn;")
   @ObfuscatedName("ap")
   public classSN method8781(int var1) {
      try {
         return this.method8768((byte)0) ? classGR.method5658(982132619 * this.field5128, 1348613364) : null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ou.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cd")
   public boolean method8784() {
      return this.method8768((byte)0)
         ? method8776(this, 1225296312) == 0
         : null != this.field5127 && this.field5127.length > 0 && classCN.method2557(this.field5127[0] >> 16, 1623484778) != null;
   }

   public int getDuration() {
      if (this.isMayaAnim()) {
         return this.method8796();
      } else {
         return this.field5125 != null ? this.field5125.length : 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lou;")
   @ObfuscatedName("ar")
   public static classOU method8733(int var0) {
      classOU var1 = (classOU)field5141.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field5153.method11867(12, var0, -924344173);
         var1 = new classOU(new classXY(var2), var0);
         field5141.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lou;I)I")
   @ObfuscatedName("xy")
   public static int method8782(classOU var0, int var1) {
      if (var0 == null) {
         var0.method8780(var1);
      }

      try {
         return 854569333 * var0.field5126;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ou.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;I)Lfx;")
   @ObfuscatedName("hy")
   public classFX method8798(classFX var1, int var2) {
      return this.method8795(var1, var2, 356352012);
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ai")
   public boolean method8785(byte var1) {
      try {
         if (this.method8768((byte)0)) {
            if (var1 == 110) {
               throw new IllegalStateException();
            } else {
               boolean var3;
               if (method8776(this, 1225296312) == 0) {
                  if (var1 == 110) {
                     throw new IllegalStateException();
                  }

                  var3 = true;
               } else {
                  var3 = false;
               }

               return var3;
            }
         } else {
            if (null != this.field5127) {
               if (var1 == 110) {
                  throw new IllegalStateException();
               }

               if (this.field5127.length > 0) {
                  if (var1 == 110) {
                     throw new IllegalStateException();
                  }

                  if (classCN.method2557(this.field5127[0] >> 16, 1275003202) != null) {
                     if (var1 == 110) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ou.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lou;Lfx;I)Lfx;")
   @ObfuscatedName("qo")
   public static classFX method8764(classOU var0, classFX var1, int var2) {
      if (var0 == null) {
         var0.getNumFrames();
      }

      if (!var0.method8768((byte)0)) {
         int var3 = var0.field5127[var2];
         classFS var4 = classCN.method2557(var3 >> 16, 1885345732);
         var3 &= 65535;
         if (null == var4) {
            return var1.method5081(true);
         } else {
            classFS var5 = null;
            int var6 = 0;
            if (null != var0.field5132 && var2 < var0.field5132.length) {
               var6 = var0.field5132[var2];
               var5 = classCN.method2557(var6 >> 16, 1590609819);
               var6 &= 65535;
            }

            if (null != var5 && 65535 != var6) {
               classFX var10 = var1.method5081(!var4.method4976(var3, (byte)71) & !var5.method4976(var6, (byte)-4));
               var10.method5106(var4, var3);
               var10.method5106(var5, var6);
               return var10;
            } else {
               classFX var7 = var1.method5081(!var4.method4976(var3, (byte)-28));
               var7.method5106(var4, var3);
               return var7;
            }
         }
      } else {
         return method8793(var0, var1, var2, (byte)0);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bg")
   public boolean method8748(int var1) {
      if (this.field5139 * -1028999512 > 0 || this.field5140 * -1007958506 > 0) {
         return true;
      } else if (!this.method8768((byte)0)) {
         var1 = this.field5127[var1];
         classFS var7 = classCN.method2557(var1 >> 16, 1617059123);
         var1 &= 507542717;
         return null == var7 ? false : var7.method4976(var1, (byte)-51);
      } else {
         int var3 = -964539070 * this.field5128;
         classSN var4 = classUG.method11321(var3, -53624491);
         classSN var2;
         if (var4 != null && var4.method10543((byte)-16)) {
            var2 = var4;
         } else {
            var2 = null;
         }

         return var2 == null ? false : classSN.method10518(var2, 1659619761);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfs;")
   @ObfuscatedName("at")
   static classFS method8737(int var0) {
      classFS var1 = (classFS)field5145.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = classMS.method7649(classKP.field3986, classIY.field3099, var0, -1894902159);
         if (null != var1) {
            field5145.method6428(var1, var0);
         }

         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lou;Lfx;I)Lfx;")
   @ObfuscatedName("ox")
   public static classFX method8755(classOU var0, classFX var1, int var2) {
      if (var0 == null) {
         var0.getDuration();
      }

      if (!var0.method8768((byte)0)) {
         var2 = var0.field5127[var2];
         classFS var7 = classCN.method2557(var2 >> 16, 1154355043);
         var2 &= -2022008043;
         if (var7 == null) {
            return var1.method5084(true);
         } else {
            classFX var8 = var1.method5084(!var7.method4976(var2, (byte)24));
            var8.method5106(var7, var2);
            return var8;
         }
      } else {
         classSN var3 = classGR.method5658(982132619 * var0.field5128, 454772312);
         if (var3 == null) {
            return var1.method5084(true);
         } else {
            classFX var4 = var1.method5084(!classSN.method10518(var3, 1699915752));
            classFX.method5109(var4, var3, var2);
            return var4;
         }
      }
   }

   public int getFrameStep() {
      return this.field5134 * 1665914959;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfs;")
   @ObfuscatedName("an")
   static classFS method8738(int var0) {
      classFS var1 = (classFS)field5145.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = classMS.method7649(classKP.field3986, classIY.field3099, var0, -1429920351);
         if (null != var1) {
            field5145.method6428(var1, var0);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   public int method8772() {
      return 1101853025 * this.field5130 - this.field5129 * -1900166697;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lou;")
   @ObfuscatedName("ak")
   public static classOU method8734(int var0) {
      classOU var1 = (classOU)field5141.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field5153.method11867(12, var0, -930637148);
         var1 = new classOU(new classXY(var2), var0);
         field5141.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lou;Lfx;ILou;I)Lfx;")
   @ObfuscatedName("by")
   public static classFX method8759(classOU var0, classFX var1, int var2, classOU var3, int var4) {
      if (var0 == null) {
         var0.method8770();
      }

      if (field5142 && !var0.method8768((byte)0) && !var3.method8768((byte)0)) {
         return var0.method8760(var1, var2, var3, var4, (byte)-8);
      } else {
         classFX var5 = var1.method5081(false);
         boolean var6 = false;
         classFS var7 = null;
         classEM var8 = null;
         if (var0.method8768((byte)0)) {
            classSN var9 = var0.method8781(-402920139);
            if (var9 == null) {
               return var5;
            }

            if (var3.method8768((byte)0) && var0.field5136 == null) {
               classFX.method5109(var5, var9, var2);
               return var5;
            }

            var8 = var9.field5983;
            var5.method5125(var8, var9, var2, var0.field5136, false, !var3.method8768((byte)0));
         } else {
            var2 = var0.field5127[var2];
            var7 = classCN.method2557(var2 >> 16, 1562267390);
            var2 &= 65535;
            if (var7 == null) {
               return method8793(var3, var1, var4, (byte)0);
            }

            if (!var3.method8768((byte)0) && (null == var0.field5135 || var4 == -1)) {
               var5.method5106(var7, var2);
               return var5;
            }

            if (var0.field5135 == null || var4 == -1) {
               var5.method5106(var7, var2);
               return var5;
            }

            var6 = var3.method8768((byte)0);
            if (!var6) {
               var5.method5127(var7, var2, var0.field5135, false);
            }
         }

         if (var3.method8768((byte)0)) {
            classSN var13 = var3.method8781(-632796168);
            if (null == var13) {
               return var5;
            }

            if (null == var8) {
               var8 = var13.field5983;
            }

            var5.method5125(var8, var13, var4, var0.field5136, true, true);
         } else {
            var4 = var3.field5127[var4];
            classFS var14 = classCN.method2557(var4 >> 16, 1880900322);
            var4 &= 65535;
            if (null == var14) {
               return method8793(var0, var1, var2, (byte)0);
            }

            var5.method5127(var14, var4, var0.field5135, true);
         }

         if (var6 && var7 != null) {
            var5.method5127(var7, var2, var0.field5135, false);
         }

         classZG.method13998(var5);
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lsn;")
   @ObfuscatedName("bn")
   static classSN method8741(int var0) {
      classSN var1 = classUG.method11321(var0, 650955337);
      return var1 != null && var1.method10543((byte)-28) ? var1 : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lou;Lfx;I)Lfx;")
   @ObfuscatedName("mc")
   public static classFX method8765(classOU var0, classFX var1, int var2) {
      if (var0 == null) {
         var0.getNumFrames();
      }

      if (!var0.method8768((byte)0)) {
         int var3 = var0.field5127[var2];
         classFS var4 = classCN.method2557(var3 >> 16, 1102677527);
         var3 &= 65535;
         if (null == var4) {
            return var1.method5081(true);
         } else {
            classFS var5 = null;
            int var6 = 0;
            if (null != var0.field5132 && var2 < var0.field5132.length) {
               var6 = var0.field5132[var2];
               var5 = classCN.method2557(var6 >> 16, 1838196087);
               var6 &= 65535;
            }

            if (null != var5 && 65535 != var6) {
               classFX var10 = var1.method5081(!var4.method4976(var3, (byte)-37) & !var5.method4976(var6, (byte)67));
               var10.method5106(var4, var3);
               var10.method5106(var5, var6);
               return var10;
            } else {
               classFX var7 = var1.method5081(!var4.method4976(var3, (byte)68));
               var7.method5106(var4, var3);
               return var7;
            }
         }
      } else {
         return method8793(var0, var1, var2, (byte)0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lsn;")
   @ObfuscatedName("bx")
   static classSN method8742(int var0) {
      classSN var1 = classUG.method11321(var0, 1059799505);
      return var1 != null && var1.method10543((byte)-37) ? var1 : null;
   }

   public boolean isMayaAnim() {
      return this.method8768((byte)0);
   }

   public int getLeftHandItem() {
      return this.field5139 * -885490691 == -1 ? -1 : this.field5139 * -885490691 - 512;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lsn;")
   @ObfuscatedName("bc")
   public static classSN method8743(int var0) {
      classSN var1 = (classSN)field5144.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         var1 = classMB.method7509(classGN.field2633, classIY.field3099, var0, -1929466463);
         if (var1 != null) {
            field5144.method6428(var1, var0);
         }

         return var1;
      }
   }

   public void setRestartMode(int var1) {
      this.field5122 = var1 * -991329609;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Lot;")
   @ObfuscatedName("bt")
   static classOT method8745(classXY var0) {
      if (var0 != null) {
         int var1 = 0;
         int var2 = -1;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         var1 = classXY.method13047(var0, -906648727);
         var2 = classXY.method13039(var0, -346779531);
         var3 = classXY.method13039(var0, -346779531);
         var4 = classXY.method13039(var0, -346779531);
         var5 = classXY.method13039(var0, -346779531);
         if (var1 >= 1 && var3 >= 1 && var4 >= 0 && var5 >= 0) {
            return new classOT(var1, var2, var3, var4, var5);
         }
      }

      return null;
   }

   public int getRightHandItem() {
      return this.field5140 * 484651797 == -1 ? -1 : this.field5140 * 484651797 - 512;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Lot;")
   @ObfuscatedName("br")
   static classOT method8746(classXY var0) {
      if (var0 != null) {
         int var1 = 0;
         int var2 = -1;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         var1 = classXY.method13047(var0, 1948251173);
         var2 = classXY.method13039(var0, -346779531);
         var3 = classXY.method13039(var0, -346779531);
         var4 = classXY.method13039(var0, -346779531);
         var5 = classXY.method13039(var0, -346779531);
         if (var1 >= 1 && var3 >= 1 && var4 >= 0 && var5 >= 0) {
            return new classOT(var1, var2, var3, var4, var5);
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lou;Lfx;II)Lfx;")
   @ObfuscatedName("sv")
   public static classFX method8752(classOU var0, classFX var1, int var2, int var3) {
      if (var0 == null) {
         var0.isMayaAnim();
      }

      if (!var0.method8768((byte)0)) {
         var2 = var0.field5127[var2];
         classFS var10 = classCN.method2557(var2 >> 16, 1530828722);
         var2 &= 65535;
         if (var10 == null) {
            return var1.method5081(true);
         } else {
            classFX var11 = var1.method5081(!var10.method4976(var2, (byte)-82));
            var3 &= 3;
            if (var3 == 1) {
               var11.method5174();
            } else if (var3 == 2) {
               var11.method5245();
            } else if (3 == var3) {
               var11.method5238();
            }

            var11.method5106(var10, var2);
            if (var3 == 1) {
               var11.method5238();
            } else if (var3 == 2) {
               var11.method5245();
            } else if (var3 == 3) {
               var11.method5174();
            }

            return var11;
         }
      } else {
         classSN var4 = classGR.method5658(var0.field5128 * 982132619, 950145319);
         if (null == var4) {
            return var1.method5081(true);
         } else {
            classFX var5 = var1.method5081(!classSN.method10518(var4, 934659027));
            var3 &= 3;
            if (1 == var3) {
               var5.method5174();
            } else if (var3 == 2) {
               var5.method5245();
            } else if (var3 == 3) {
               var5.method5238();
            }

            classFX.method5109(var5, var4, var2);
            if (1 == var3) {
               var5.method5238();
            } else if (2 == var3) {
               var5.method5245();
            } else if (var3 == 3) {
               var5.method5174();
            }

            return var5;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;ILou;I)Lnet/runelite/api/Model;")
   @ObfuscatedName("uu")
   public Model method8799(classFX var1, int var2, classOU var3, int var4) {
      return this.method8791(var1, var2, var3, var4, -1500497548);
   }

   @ObfuscatedSignature(descriptor = "(Lfx;ILou;II)Lfx;")
   @ObfuscatedName("ao")
   public classFX method8791(classFX var1, int var2, classOU var3, int var4, int var5) {
      if (var2 < 0) {
         int var6 = var2 ^ Integer.MIN_VALUE;
         var2 = var6 & 65535;
      }

      if (var4 < 0) {
         int var19 = var4 ^ Integer.MIN_VALUE;
         var4 = var19 & 65535;
      }

      int var11 = var4;
      classOU var10 = var3;
      int var9 = var2;
      classFX var8 = var1;
      classOU var7 = this;
      int var12 = -1500497548;

      try {
         if (field5142) {
            if (var12 <= -1820146238) {
               throw new IllegalStateException();
            }

            if (!var7.method8768((byte)0)) {
               if (var12 <= -1820146238) {
                  throw new IllegalStateException();
               }

               if (!var10.method8768((byte)0)) {
                  if (var12 <= -1820146238) {
                     throw new IllegalStateException();
                  }

                  return var7.method8760(var8, var9, var10, var11, (byte)-99);
               }
            }
         }

         classFX var13;
         classFS var15;
         label208: {
            var13 = var8.method5081(false);
            boolean var14 = false;
            var15 = null;
            classEM var16 = null;
            if (var7.method8768((byte)0)) {
               classSN var17 = var7.method8781(70464549);
               if (var17 == null) {
                  return var13;
               }

               if (var10.method8768((byte)0)) {
                  if (var12 <= -1820146238) {
                     throw new IllegalStateException();
                  }

                  if (var7.field5136 == null) {
                     if (var12 <= -1820146238) {
                        throw new IllegalStateException();
                     }

                     classFX.method5109(var13, var17, var9);
                     return var13;
                  }
               }

               var16 = var17.field5983;
               boolean[] var10004 = var7.field5136;
               boolean var10006;
               if (!var10.method8768((byte)0)) {
                  if (var12 <= -1820146238) {
                     throw new IllegalStateException();
                  }

                  var10006 = true;
               } else {
                  var10006 = false;
               }

               var13.method5125(var16, var17, var9, var10004, false, var10006);
            } else {
               label210: {
                  var9 = var7.field5127[var9];
                  var15 = classCN.method2557(var9 >> 16, 1574740704);
                  var9 &= 65535;
                  if (var15 == null) {
                     return method8793(var10, var8, var11, (byte)0);
                  }

                  if (!var10.method8768((byte)0)) {
                     if (var12 <= -1820146238) {
                        throw new IllegalStateException();
                     }

                     if (null == var7.field5135) {
                        break label208;
                     }

                     if (var12 <= -1820146238) {
                        throw new IllegalStateException();
                     }

                     if (var11 == -1) {
                        if (var12 <= -1820146238) {
                           throw new IllegalStateException();
                        }
                        break label208;
                     }
                  }

                  if (var7.field5135 != null) {
                     if (var12 <= -1820146238) {
                        throw new IllegalStateException();
                     }

                     if (var11 != -1) {
                        var14 = var10.method8768((byte)0);
                        if (!var14) {
                           if (var12 <= -1820146238) {
                              throw new IllegalStateException();
                           }

                           var13.method5127(var15, var9, var7.field5135, false);
                        }
                        break label210;
                     }

                     if (var12 <= -1820146238) {
                        throw new IllegalStateException();
                     }
                  }

                  var13.method5106(var15, var9);
                  return var13;
               }
            }

            if (var10.method8768((byte)0)) {
               if (var12 <= -1820146238) {
                  throw new IllegalStateException();
               }

               classSN var26 = var10.method8781(155407083);
               if (null == var26) {
                  if (var12 <= -1820146238) {
                     throw new IllegalStateException();
                  }

                  return var13;
               }

               if (null == var16) {
                  if (var12 <= -1820146238) {
                     throw new IllegalStateException();
                  }

                  var16 = var26.field5983;
               }

               var13.method5125(var16, var26, var11, var7.field5136, true, true);
            } else {
               var11 = var10.field5127[var11];
               classFS var27 = classCN.method2557(var11 >> 16, 1845067020);
               var11 &= 65535;
               if (null == var27) {
                  if (var12 <= -1820146238) {
                     throw new IllegalStateException();
                  }

                  return method8793(var7, var8, var9, (byte)0);
               }

               var13.method5127(var27, var11, var7.field5135, true);
            }

            if (var14) {
               if (var12 <= -1820146238) {
                  throw new IllegalStateException();
               }

               if (var15 != null) {
                  if (var12 <= -1820146238) {
                     throw new IllegalStateException();
                  }

                  var13.method5127(var15, var9, var7.field5135, false);
               }
            }

            classZG.method13998(var13);
            return var13;
         }

         var13.method5106(var15, var9);
         return var13;
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "ou.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ax")
   public boolean method8749(int var1, int var2) {
      try {
         if (this.field5139 * -885490691 <= 0) {
            if (var2 != 1284412146) {
               throw new IllegalStateException();
            }

            if (this.field5140 * 484651797 <= 0) {
               if (!this.method8768((byte)0)) {
                  var1 = this.field5127[var1];
                  classFS var9 = classCN.method2557(var1 >> 16, 1475843360);
                  var1 &= 65535;
                  if (null == var9) {
                     if (var2 != 1284412146) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  return var9.method4976(var1, (byte)25);
               }

               classSN var3;
               label56: {
                  int var4 = 982132619 * this.field5128;
                  classSN var5 = classUG.method11321(var4, 855136244);
                  if (var5 != null) {
                     if (var2 != 1284412146) {
                        throw new IllegalStateException();
                     }

                     if (var5.method10543((byte)-20)) {
                        var3 = var5;
                        break label56;
                     }
                  }

                  var3 = null;
               }

               if (var3 == null) {
                  if (var2 != 1284412146) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               return classSN.method10518(var3, 1085179575);
            }

            if (var2 != 1284412146) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ou.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cy")
   public boolean method8786() {
      return this.method8768((byte)0)
         ? method8776(this, 1225296312) == 0
         : null != this.field5127 && this.field5127.length > 0 && classCN.method2557(this.field5127[0] >> 16, 1401245832) != null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bj")
   public boolean method8750(int var1) {
      if (this.field5139 * -885490691 > 0 || this.field5140 * 1233418324 > 0) {
         return true;
      } else if (!this.method8768((byte)0)) {
         var1 = this.field5127[var1];
         classFS var7 = classCN.method2557(var1 >> 16, 1895779398);
         var1 &= -1062969903;
         return null == var7 ? false : var7.method4976(var1, (byte)-56);
      } else {
         int var3 = -1468700487 * this.field5128;
         classSN var4 = classUG.method11321(var3, -1179865279);
         classSN var2;
         if (var4 != null && var4.method10543((byte)-90)) {
            var2 = var4;
         } else {
            var2 = null;
         }

         return var2 == null ? false : classSN.method10518(var2, 725917820);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lou;I)I")
   @ObfuscatedName("ni")
   public static int method8776(classOU var0, int var1) {
      if (var0 == null) {
         var0.method8779(var1);
      }

      try {
         if (var0.method8768((byte)0)) {
            if (var1 != 1225296312) {
               throw new IllegalStateException();
            } else {
               int var3 = var0.field5128 * 982132619;
               classSN var4 = classUG.method11321(var3, 585547370);
               byte var2;
               if (null == var4) {
                  if (var1 != 1225296312) {
                     throw new IllegalStateException();
                  }

                  var2 = 2;
               } else {
                  byte var10000;
                  if (var4.method10543((byte)-82)) {
                     if (var1 != 1225296312) {
                        throw new IllegalStateException();
                     }

                     var10000 = 0;
                  } else {
                     var10000 = 1;
                  }

                  var2 = var10000;
               }

               return var2;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ou.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bk")
   public boolean method8751(int var1) {
      if (this.field5139 * -885490691 > 0 || this.field5140 * 484651797 > 0) {
         return true;
      } else if (!this.method8768((byte)0)) {
         var1 = this.field5127[var1];
         classFS var7 = classCN.method2557(var1 >> 16, 1649058188);
         var1 &= 65535;
         return null == var7 ? false : var7.method4976(var1, (byte)16);
      } else {
         int var3 = 982132619 * this.field5128;
         classSN var4 = classUG.method11321(var3, -63586250);
         classSN var2;
         if (var4 != null && var4.method10543((byte)-116)) {
            var2 = var4;
         } else {
            var2 = null;
         }

         return var2 == null ? false : classSN.method10518(var2, 1137028173);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;II)Lfx;")
   @ObfuscatedName("bu")
   classFX method8753(classFX var1, int var2, int var3) {
      if (!this.method8768((byte)0)) {
         var2 = this.field5127[var2];
         classFS var10 = classCN.method2557(var2 >> 16, 745035339);
         var2 &= 857715864;
         if (var10 == null) {
            return var1.method5081(true);
         } else {
            classFX var11 = var1.method5081(!var10.method4976(var2, (byte)-111));
            var3 &= 3;
            if (var3 == 1) {
               var11.method5174();
            } else if (var3 == 2) {
               var11.method5245();
            } else if (3 == var3) {
               var11.method5238();
            }

            var11.method5106(var10, var2);
            if (var3 == 1) {
               var11.method5238();
            } else if (var3 == 2) {
               var11.method5245();
            } else if (var3 == 3) {
               var11.method5174();
            }

            return var11;
         }
      } else {
         classSN var4 = classGR.method5658(this.field5128 * 982132619, -907126373);
         if (null == var4) {
            return var1.method5081(true);
         } else {
            classFX var5 = var1.method5081(!classSN.method10518(var4, -1066767861));
            var3 &= 3;
            if (1 == var3) {
               var5.method5174();
            } else if (var3 == 2) {
               var5.method5245();
            } else if (var3 == 3) {
               var5.method5238();
            }

            classFX.method5109(var5, var4, var2);
            if (1 == var3) {
               var5.method5238();
            } else if (2 == var3) {
               var5.method5245();
            } else if (var3 == 3) {
               var5.method5174();
            }

            return var5;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;I)Lfx;")
   @ObfuscatedName("ba")
   classFX method8756(classFX var1, int var2) {
      if (!this.method8768((byte)0)) {
         var2 = this.field5127[var2];
         classFS var7 = classCN.method2557(var2 >> 16, 2123025091);
         var2 &= -782434165;
         if (var7 == null) {
            return var1.method5084(true);
         } else {
            classFX var8 = var1.method5084(!var7.method4976(var2, (byte)-51));
            var8.method5106(var7, var2);
            return var8;
         }
      } else {
         classSN var3 = classGR.method5658(982132619 * this.field5128, 1760622756);
         if (var3 == null) {
            return var1.method5084(true);
         } else {
            classFX var4 = var1.method5084(!classSN.method10518(var3, 209169666));
            classFX.method5109(var4, var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;I)Lfx;")
   @ObfuscatedName("bb")
   classFX method8757(classFX var1, int var2) {
      if (!this.method8768((byte)0)) {
         var2 = this.field5127[var2];
         classFS var7 = classCN.method2557(var2 >> 16, 1648173841);
         var2 &= 65535;
         if (var7 == null) {
            return var1.method5084(true);
         } else {
            classFX var8 = var1.method5084(!var7.method4976(var2, (byte)-104));
            var8.method5106(var7, var2);
            return var8;
         }
      } else {
         classSN var3 = classGR.method5658(982132619 * this.field5128, 840254458);
         if (var3 == null) {
            return var1.method5084(true);
         } else {
            classFX var4 = var1.method5084(!classSN.method10518(var3, 1707553593));
            classFX.method5109(var4, var3, var2);
            return var4;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfs;")
   @ObfuscatedName("av")
   static classFS method8739(int var0) {
      classFS var1 = (classFS)field5145.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = classMS.method7649(classKP.field3986, classIY.field3099, var0, -1738240690);
         if (null != var1) {
            field5145.method6428(var1, var0);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cl")
   public int method8783() {
      return 854569333 * this.field5126;
   }

   @ObfuscatedSignature(descriptor = "(Lfx;I)Lfx;")
   @ObfuscatedName("bs")
   public classFX method8766(classFX var1, int var2) {
      if (!this.method8768((byte)0)) {
         int var3 = this.field5127[var2];
         classFS var4 = classCN.method2557(var3 >> 16, 1294795509);
         var3 &= -2120273047;
         if (null == var4) {
            return var1.method5081(true);
         } else {
            classFS var5 = null;
            int var6 = 0;
            if (null != this.field5132 && var2 < this.field5132.length) {
               var6 = this.field5132[var2];
               var5 = classCN.method2557(var6 >> 16, 1972931463);
               var6 &= 65535;
            }

            if (null != var5 && 819389203 != var6) {
               classFX var10 = var1.method5081(!var4.method4976(var3, (byte)-30) & !var5.method4976(var6, (byte)-58));
               var10.method5106(var4, var3);
               var10.method5106(var5, var6);
               return var10;
            } else {
               classFX var7 = var1.method5081(!var4.method4976(var3, (byte)-84));
               var7.method5106(var4, var3);
               return var7;
            }
         }
      } else {
         return method8793(this, var1, var2, (byte)0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqr;ILqv;)I")
   @ObfuscatedName("gz")
   public static int method8800(classQR var0, int var1, classQV var2) {
      return classRD.method9941(var0, var1, var2, -189415751);
   }

   public int getRestartMode() {
      return this.field5122 * 1697446663;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ay")
   public boolean method8768(byte var1) {
      try {
         boolean var10000;
         if (982132619 * this.field5128 >= 0) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ou.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lou;")
   @ObfuscatedName("aw")
   public static classOU method8735(int var0) {
      classOU var1 = (classOU)field5141.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field5153.method11867(12, var0, -820180156);
         var1 = new classOU(new classXY(var2), var0);
         field5141.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Lfx;II)Lfx;")
   @ObfuscatedName("ta")
   public classFX method8792(rl21 var1, classFX var2, int var3, int var4) {
      if (var3 < 0 && !this.isMayaAnim()) {
         int var22 = var3 ^ Integer.MIN_VALUE;
         int var24 = var22 >> 16 & 16383;
         var3 = var22 & 65535;
         int var25 = var3 + 1;
         if (var25 >= this.field5127.length) {
            if (field5143.contains(this.field5118)) {
               var25 = -1;
            } else {
               var25 -= this.field5134 * 1665914959;
            }
         }

         int var8 = this.field5127[var3];
         classFS var9 = classFS.method4981(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         classFS var12 = null;
         if (var25 >= 0 && var25 < this.field5127.length) {
            int var13 = this.field5127[var25];
            var12 = classFS.method4981(var13 >> 16);
            var11 = var13 & 65535;
         }

         if (var9 == null) {
            return var2.method5220(var1, true);
         } else {
            classFX var26 = var2.method5220(var1, !var9.field2392[var10].field1910);
            var4 &= 3;
            if (var4 == 1) {
               var26.method5253();
            } else if (var4 == 2) {
               var26.method5260();
            } else if (var4 == 3) {
               var26.method5254();
            }

            var26.method5251(var1, var9, var10, var12, var11, var24, this.field5125[var3]);
            if (var4 == 1) {
               var26.method5254();
            } else if (var4 == 2) {
               var26.method5260();
            } else if (var4 == 3) {
               var26.method5253();
            }

            return var26;
         }
      } else if (!this.isMayaAnim()) {
         var3 = this.field5127[var3];
         classFS var21 = classFS.method4981(var3 >> 16);
         var3 &= 65535;
         if (var21 == null) {
            return var2.method5220(var1, true);
         } else {
            classFX var23 = var2.method5220(var1, !var21.method4982(var3));
            var4 &= 3;
            if (var4 == 1) {
               var23.method5253();
            } else if (var4 == 2) {
               var23.method5260();
            } else if (var4 == 3) {
               var23.method5254();
            }

            var23.method5217(var1, var21, var3);
            if (var4 == 1) {
               var23.method5254();
            } else if (var4 == 2) {
               var23.method5260();
            } else if (var4 == 3) {
               var23.method5253();
            }

            return var23;
         }
      } else {
         if (var3 < 0) {
            int var5 = var3 ^ Integer.MIN_VALUE;
            var3 = var5 & 65535;
         }

         int var20 = this.field5128 * 982132619;
         classSN var6 = classSN.method10534(var20);
         if (var6 != null && var6.method10549()) {
            classFX var7 = var2.method5220(var1, !var6.field5995);
            var4 &= 3;
            if (var4 == 1) {
               var7.method5253();
            } else if (var4 == 2) {
               var7.method5260();
            } else if (var4 == 3) {
               var7.method5254();
            }

            var7.method5234(var1, var6, var3);
            if (var4 == 1) {
               var7.method5254();
            } else if (var4 == 2) {
               var7.method5260();
            } else if (var4 == 3) {
               var7.method5253();
            }

            return var7;
         } else {
            return var2.method5220(var1, true);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bh")
   public boolean method8769() {
      return 982132619 * this.field5128 >= 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bz")
   public boolean method8770() {
      return 982132619 * this.field5128 >= 0;
   }

   public int getNumFrames() {
      if (this.isMayaAnim()) {
         return this.method8796();
      } else {
         return this.field5127 != null ? this.field5127.length : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   public int method8773() {
      return 1101853025 * this.field5130 - this.field5129 * -1900166697;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   public int method8774() {
      return 1101853025 * this.field5130 - this.field5129 * -1900166697;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   public int method8775() {
      return 1101853025 * this.field5130 - this.field5129 * -1900166697;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   int method8777() {
      if (this.method8768((byte)0)) {
         int var2 = this.field5128 * -838817177;
         classSN var3 = classUG.method11321(var2, 1410907232);
         int var1;
         if (null == var3) {
            var1 = 2;
         } else {
            var1 = var3.method10543((byte)-101) ? 0 : 1;
         }

         return var1;
      } else {
         return 2;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cq")
   int method8778() {
      if (this.method8768((byte)0)) {
         int var2 = this.field5128 * 982132619;
         classSN var3 = classUG.method11321(var2, 693669691);
         int var1;
         if (null == var3) {
            var1 = 2;
         } else {
            var1 = var3.method10543((byte)-61) ? 0 : 1;
         }

         return var1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lou;Lfx;I)Lfx;")
   @ObfuscatedName("pk")
   public static classFX method8758(classOU var0, classFX var1, int var2) {
      if (var0 == null) {
         var0.method8772();
      }

      if (!var0.method8768((byte)0)) {
         var2 = var0.field5127[var2];
         classFS var7 = classCN.method2557(var2 >> 16, 1947661110);
         var2 &= -1177125690;
         if (var7 == null) {
            return var1.method5084(true);
         } else {
            classFX var8 = var1.method5084(!var7.method4976(var2, (byte)-45));
            var8.method5106(var7, var2);
            return var8;
         }
      } else {
         classSN var3 = classGR.method5658(1865800324 * var0.field5128, -241758509);
         if (var3 == null) {
            return var1.method5084(true);
         } else {
            classFX var4 = var1.method5084(!classSN.method10518(var3, -1172769616));
            classFX.method5109(var4, var3, var2);
            return var4;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lsn;")
   @ObfuscatedName("bp")
   public static classSN method8744(int var0) {
      classSN var1 = (classSN)field5144.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         var1 = classMB.method7509(classGN.field2633, classIY.field3099, var0, -1929466463);
         if (var1 != null) {
            field5144.method6428(var1, var0);
         }

         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lou;Lfx;ILou;I)Lfx;")
   @ObfuscatedName("ui")
   public static classFX method8762(classOU var0, classFX var1, int var2, classOU var3, int var4) {
      var2 = var0.field5127[var2];
      classFS var5 = classCN.method2557(var2 >> 16, 1997118090);
      var2 &= 65535;
      if (var5 == null) {
         return method8793(var3, var1, var4, (byte)0);
      } else {
         var4 = var3.field5127[var4];
         classFS var6 = classCN.method2557(var4 >> 16, 1164925312);
         var4 &= 65535;
         if (var6 == null) {
            classFX var12 = var1.method5081(!var5.method4976(var2, (byte)-98));
            var12.method5106(var5, var2);
            return var12;
         } else {
            classFX var7 = var1.method5081(!var5.method4976(var2, (byte)-40) & !var6.method4976(var4, (byte)62));
            var7.method5121(var5, var2, var6, var4, var0.field5135);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cv")
   public boolean method8787() {
      return this.method8768((byte)0)
         ? method8776(this, 1225296312) == 0
         : null != this.field5127 && this.field5127.length > 0 && classCN.method2557(this.field5127[0] >> 16, 1281074722) != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cs")
   public boolean method8788() {
      return this.method8768((byte)0)
         ? method8776(this, 1225296312) == 0
         : null != this.field5127 && this.field5127.length > 0 && classCN.method2557(this.field5127[0] >> 16, 1069565543) != null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Lot;")
   @ObfuscatedName("bm")
   static classOT method8747(classXY var0) {
      if (var0 != null) {
         int var1 = 0;
         int var2 = -1;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         var1 = classXY.method13047(var0, -1219852808);
         var2 = classXY.method13039(var0, -346779531);
         var3 = classXY.method13039(var0, -346779531);
         var4 = classXY.method13039(var0, -346779531);
         var5 = classXY.method13039(var0, -346779531);
         if (var1 >= 1 && var3 >= 1 && var4 >= 0 && var5 >= 0) {
            return new classOT(var1, var2, var3, var4, var5);
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   int method8779(int var1) {
      try {
         if (this.method8768((byte)0)) {
            if (var1 != 1225296312) {
               throw new IllegalStateException();
            } else {
               int var3 = this.field5128 * 982132619;
               classSN var4 = classUG.method11321(var3, 585547370);
               byte var2;
               if (null == var4) {
                  if (var1 != 1225296312) {
                     throw new IllegalStateException();
                  }

                  var2 = 2;
               } else {
                  byte var10000;
                  if (var4.method10543((byte)-82)) {
                     if (var1 != 1225296312) {
                        throw new IllegalStateException();
                     }

                     var10000 = 0;
                  } else {
                     var10000 = 1;
                  }

                  var2 = var10000;
               }

               return var2;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ou.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("au")
   public int method8780(int var1) {
      try {
         if (this.method8768((byte)0)) {
            if (var1 != 1225296312) {
               throw new IllegalStateException();
            } else {
               int var3 = this.field5124 * 982132619;
               classSN var4 = classUG.method11321(var3, 585547370);
               byte var2;
               if (null == var4) {
                  if (var1 != 1225296312) {
                     throw new IllegalStateException();
                  }

                  var2 = 2;
               } else {
                  byte var10000;
                  if (var4.method10543((byte)-82)) {
                     if (var1 != 1225296312) {
                        throw new IllegalStateException();
                     }

                     var10000 = 0;
                  } else {
                     var10000 = 1;
                  }

                  var2 = var10000;
               }

               return var2;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ou.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;IB)Lfx;")
   @ObfuscatedName("as")
   public classFX method8794(classFX var1, int var2, byte var3) {
      if (var2 < 0 && !this.method8784()) {
         int var24 = var2 ^ Integer.MIN_VALUE;
         int var5 = var24 >> 16 & 16383;
         boolean var6 = (var24 & 1073741824) != 0;
         var2 = var24 & 65535;
         int var7 = var2 + 1;
         if (var7 >= this.field5127.length) {
            if (field5143.contains(this.field5122)) {
               var7 = -1;
            } else if (this.field5134 * 1665914959 > 0) {
               var7 -= this.field5119 * 1665914959;
            } else if (var6) {
               var7 = 0;
            }
         }

         int var8 = this.field5127[var2];
         classFS var9 = classOE.field4843.method2451(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         classFS var12 = null;
         if (var7 >= 0 && var7 < this.field5125.length) {
            int var13 = this.field5127[var7];
            var12 = classOE.field4843.method2451(var13 >> 16);
            var11 = var13 & 65535;
         }

         if (var9 == null) {
            return var1.method5082(true);
         } else {
            classFX var25 = var1.method5081(!var9.field2392[var10].field1910);
            var25.method5251(rl21.field5728, var9, var10, var12, var11, var5, this.field5127[var2]);
            return var25;
         }
      } else {
         if (var2 < 0) {
            int var4 = var2 ^ Integer.MIN_VALUE;
            var2 = var4 & 65535;
         }

         int var16 = var2;
         classFX var15 = var1;
         classOU var14 = this;
         boolean var17 = false;

         try {
            classFX var10000;
            if (!var14.method8768((byte)0)) {
               if (var17) {
                  throw new IllegalStateException();
               }

               var16 = var14.field5125[var16];
               classFS var18 = classCN.method2557(var16 >> 16, 1755798141);
               var16 &= 65535;
               if (var18 == null) {
                  if (var17) {
                     throw new IllegalStateException();
                  }

                  classFX var26 = var15.method5266(true);
                  var10000 = var26;
               } else {
                  boolean var10001;
                  if (!var18.method4976(var16, (byte)75)) {
                     if (var17) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  classFX var19 = var15.method5081(var10001);
                  var19.method5106(var18, var16);
                  var10000 = var19;
               }
            } else {
               classSN var30;
               label107: {
                  int var31 = var14.field5140 * 982132619;
                  classSN var20 = classUG.method11321(var31, 10699284);
                  if (var20 != null) {
                     if (var17) {
                        throw new IllegalStateException();
                     }

                     if (var20.method10543((byte)-38)) {
                        if (var17) {
                           throw new IllegalStateException();
                        }

                        var30 = var20;
                        break label107;
                     }
                  }

                  var30 = null;
               }

               if (null == var30) {
                  if (var17) {
                     throw new IllegalStateException();
                  }

                  classFX var27 = var15.method5081(true);
                  var10000 = var27;
               } else {
                  boolean var32;
                  if (!classSN.method10518(var30, 433706305)) {
                     if (var17) {
                        throw new IllegalStateException();
                     }

                     var32 = true;
                  } else {
                     var32 = false;
                  }

                  classFX var21 = var15.method5081(var32);
                  classFX.method5109(var21, var30, var16);
                  var10000 = var21;
               }
            }

            return var10000;
         } catch (RuntimeException var22) {
            throw classEG.method3884(var22, "ou.as(" + ')');
         }
      }
   }
}
