import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oi")
public class WorldEntityConfig extends classVJ implements net.runelite.api.WorldEntityConfig {
   @ObfuscatedSignature(descriptor = "[Lvh;")
   @ObfuscatedName("bt")
   final classVH[] field4874;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4892 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4891 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field4890 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4899 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field4896 = 25;
   @ObfuscatedSignature(descriptor = "Ljb;")
   @ObfuscatedName("bo")
   final classJB field4875;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field4895 = 25;
   @ObfuscatedName("am")
   public final String field4881;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("an")
   static EvictingDualNodeHashTable field4872 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field4894 = 20;
   @ObfuscatedName("ah")
   final int field4882;
   @ObfuscatedName("bn")
   public final String[] field4883;
   @ObfuscatedName("bx")
   public final boolean field4884;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field4897 = 14;
   @ObfuscatedName("bp")
   final int field4879;
   @ObfuscatedName("br")
   final int field4880;
   @ObfuscatedSignature(descriptor = "Lvh;")
   @ObfuscatedName("bm")
   classVH field4876;
   @ObfuscatedName("ba")
   final int field4889;
   @ObfuscatedName("bg")
   final int field4878;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field4898 = 17;
   @ObfuscatedSignature(descriptor = "Lkw;")
   @ObfuscatedName("bk")
   final classKW field4886;
   @ObfuscatedName("bj")
   final int field4887;
   @ObfuscatedName("bu")
   final int field4888;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field4877 = 16;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("bw")
   public static EvictingDualNodeHashTable field4873 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("bc")
   final int field4885;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field4893 = 27;

   @ObfuscatedSignature(descriptor = "()Lkw;")
   @ObfuscatedName("bu")
   public classKW method8484() {
      return this.field4886;
   }

   @ObfuscatedSignature(descriptor = "()Lkw;")
   @ObfuscatedName("ba")
   public classKW method8485() {
      return this.field4886;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("as")
   public int method8479(byte var1) {
      try {
         return 540130837 * this.field4880;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("af")
   public int method8461(byte var1) {
      try {
         return this.field4878 * -324844483;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.af(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loi;")
   @ObfuscatedName("aj")
   public static WorldEntityConfig method8456(int var0) {
      WorldEntityConfig var1 = (WorldEntityConfig)field4872.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = classCB.field649.method11867(-132306035, var0, -693118684);
         var1 = new WorldEntityConfig(new Buffer(var2), var0);
         field4872.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Loi;I)I")
   @ObfuscatedName("kz")
   public static int method8497(WorldEntityConfig var0, int var1) {
      if (var0 == null) {
         return var0.method8502(var1);
      } else {
         try {
            return 1745230265 * var0.field4889;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "oi.al(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljb;")
   @ObfuscatedName("aa")
   public classJB method8490(int var1) {
      try {
         return this.field4875;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("ao")
   public SpritePixels method8492(int var1) {
      try {
         if (this.field4888 * -486845133 < 0) {
            return null;
         } else {
            SpritePixels var2 = (SpritePixels)field4873.method6422(-486845133 * this.field4888);
            if (var2 != null) {
               return var2;
            } else {
               var2 = classPN.method9038(classJI.field3167, this.field4888 * -486845133, 0, -2018802584);
               if (var2 != null) {
                  if (var1 == -1892459964) {
                     throw new IllegalStateException();
                  }

                  field4873.method6428(var2, this.field4888 * -486845133);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "oi.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("sq")
   public SpritePixels method8504() {
      return this.method8492(-2019079217);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bx")
   public int method8470() {
      return this.field4885 * 594099331;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loi;")
   @ObfuscatedName("ay")
   public static WorldEntityConfig method8457(int var0) {
      WorldEntityConfig var1 = (WorldEntityConfig)field4872.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = classCB.field649.method11867(72, var0, -785881483);
         var1 = new WorldEntityConfig(new Buffer(var2), var0);
         field4872.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loi;")
   @ObfuscatedName("aq")
   public static WorldEntityConfig method8458(int var0) {
      WorldEntityConfig var1 = (WorldEntityConfig)field4872.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = classCB.field649.method11867(72, var0, -1556852003);
         var1 = new WorldEntityConfig(new Buffer(var2), var0);
         field4872.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loi;")
   @ObfuscatedName("ad")
   public static WorldEntityConfig method8459(int var0) {
      WorldEntityConfig var1 = (WorldEntityConfig)field4872.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = classCB.field649.method11867(72, var0, -1399830928);
         var1 = new WorldEntityConfig(new Buffer(var2), var0);
         field4872.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loi;")
   @ObfuscatedName("ap")
   public static WorldEntityConfig method8460(int var0) {
      WorldEntityConfig var1 = (WorldEntityConfig)field4872.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = classCB.field649.method11867(72, var0, -1903885803);
         var1 = new WorldEntityConfig(new Buffer(var2), var0);
         field4872.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bf")
   public int method8462() {
      return this.field4878 * 2104740550;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bm")
   public int method8463() {
      return this.field4878 * -324844483;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method8464() {
      return this.field4878 * 1944094787;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public int method8465() {
      return this.field4878 * -324844483;
   }

   @ObfuscatedSignature(descriptor = "(I)Lvh;")
   @ObfuscatedName("ax")
   public classVH method8482(int var1) {
      try {
         return this.field4876;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   public int method8466() {
      return this.field4887 * 1455014693;
   }

   @ObfuscatedSignature(descriptor = "(Loi;I)I")
   @ObfuscatedName("rr")
   public static int method8467(WorldEntityConfig var0, int var1) {
      if (var0 == null) {
         return var0.method8469(var1);
      } else {
         try {
            return var0.field4887 * 1455014693;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "oi.ae(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   public int method8471() {
      return this.field4885 * 594099331;
   }

   WorldEntityConfig(Buffer var1, int var2) {
      this.field4878 = var2 * -972786923;
      String var3 = classKK.field3615;
      int var4 = -1;
      String[] var5 = new String[5];
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = -1;
      int var14 = 0;
      classKW var15 = classKW.field4042;
      classJB var16 = classJB.field3116;
      int var17 = -1;
      int var18 = 39188;
      if (var1 != null && var1.array != null) {
         label64:
         while (true) {
            int var19 = Buffer.method13039(var1, -346779531);
            switch (var19) {
               case 0:
                  break label64;
               case 1:
               case 3:
               case 10:
               case 11:
               case 13:
               case 21:
               case 22:
               default:
                  continue;
               case 2:
                  var14 = Buffer.method13039(var1, -346779531);
                  continue;
               case 4:
                  var7 = var1.method13050((byte)16);
                  continue;
               case 5:
                  var8 = var1.method13050((byte)16);
                  continue;
               case 6:
                  var9 = var1.method13050((byte)16);
                  continue;
               case 7:
                  var10 = var1.method13050((byte)16);
                  continue;
               case 8:
                  var11 = Buffer.method13047(var1, 569407538);
                  continue;
               case 9:
                  var12 = Buffer.method13047(var1, -1997974894);
                  continue;
               case 12:
                  var3 = var1.method13071(418132268);
                  continue;
               case 14:
                  var6 = true;
                  continue;
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
                  int var21 = var19 - 15;
                  var5[var21] = var1.method13071(-947086534);
                  if (var5[var21].equalsIgnoreCase("hidden")) {
                     var5[var21] = null;
                  }

                  var6 = true;
                  continue;
               case 20:
                  var4 = Buffer.method13047(var1, -942119645);
                  continue;
               case 23:
                  var15 = (classKW)classOF.method8404(classMA.method7428((byte)-103), Buffer.method13039(var1, -346779531), 346173919);
                  continue;
               case 24:
                  classJB[] var20 = new classJB[]{classJB.field3114, classJB.field3117, classJB.field3115};
                  var16 = (classJB)classOF.method8404(var20, Buffer.method13039(var1, -346779531), 1234798768);
                  continue;
               case 25:
                  var13 = Buffer.method13047(var1, 1383209310);
                  continue;
               case 26:
                  var17 = Buffer.method13110(var1, -324749371);
                  continue;
               case 27:
            }

            var18 = Buffer.method13047(var1, 1675846563);
         }
      }

      this.field4881 = var3;
      this.field4882 = var4 * 1644425259;
      this.field4883 = var5;
      this.field4884 = var6;
      this.field4885 = -650776021 * var7;
      this.field4879 = -1487457123 * var8;
      this.field4880 = var13 * 777068861;
      this.field4887 = var14 * 1484824749;
      this.field4886 = var15;
      this.field4875 = var16;
      this.field4888 = var17 * -117395973;
      this.field4889 = var18 * -1085530999;
      this.field4876 = new classVH(var11, var12, var9, var10);
      this.field4874 = new classVH[4];
      short var22 = 256;
      this.field4874[0] = new classVH(var22 + var11, var22 + var12, var9, var10);
      var22 = 362;
      this.field4874[2] = new classVH(var22 + var11, var12 + var22, var9, var10);
      var22 = 334;
      this.field4874[1] = new classVH(var22 + var11, var22 + var12, var9, var10);
      this.field4874[3] = this.field4874[1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method8472() {
      return this.field4885 * 594099331;
   }

   public int getBoundsHeight() {
      return this.field4876.field6649 * 1760347583;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public int method8498() {
      return -1779143755 * this.field4889;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   public int method8475() {
      return 1896935861 * this.field4879;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   public int method8476() {
      return 1896935861 * this.field4879;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method8477() {
      return -1653926378 * this.field4879;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   public int method8468() {
      return this.field4887 * 1455014693;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("br")
   public int method8480() {
      return 540130837 * this.field4880;
   }

   @ObfuscatedSignature(descriptor = "()Lvh;")
   @ObfuscatedName("bt")
   public classVH method8483() {
      return this.field4876;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("ba")
   static int method8503(int var0, Script var1, boolean var2, int var3) {
      try {
         if (3800 == var0) {
            if (null != classBM.field513) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
               classNJ.field4678 = classBM.field513;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (3801 == var0) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               int var20 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (client.field865[var20] != null) {
                  if (var3 == -1863749917) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                  classNJ.field4678 = client.field865[var20];
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 3802) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3016;
               return 1;
            }
         } else if (var0 == 3803) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               int[] var26 = classBB.field323;
               int var28 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var30;
               if (classNJ.field4678.field3034) {
                  if (var3 == -1863749917) {
                     throw new IllegalStateException();
                  }

                  var30 = 1;
               } else {
                  var30 = 0;
               }

               var26[var28] = var30;
               return 1;
            }
         } else if (var0 == 3804) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3023;
               return 1;
            }
         } else if (3805 == var0) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3025;
            return 1;
         } else if (var0 == 3806) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3024;
               return 1;
            }
         } else if (var0 == 3807) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3019;
               return 1;
            }
         } else if (3809 == var0) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3028 * -1967686263;
               return 1;
            }
         } else if (3810 == var0) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               int var19 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3043[var19];
               return 1;
            }
         } else if (var0 == 3811) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               int var18 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3037[var18];
               return 1;
            }
         } else if (var0 == 3812) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3027 * -845393113;
               return 1;
            }
         } else if (var0 == 3813) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               int var17 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3044[var17];
               return 1;
            }
         } else if (3814 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var16 = classBB.field323[-324749371 * DynamicObject.field1679];
            int var22 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
            int var23 = classBB.field323[DynamicObject.field1679 * -324749371 + 2];
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClanSettings.method6244(
               classNJ.field4678, var16, var22, var23, -841278672
            );
            return 1;
         } else if (var0 == 3815) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3014 * -577292071;
               return 1;
            }
         } else if (var0 == 3816) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1725108575 * classNJ.field4678.field3017;
               return 1;
            }
         } else if (var0 == 3817) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classBE.method993(
                  classNJ.field4678, (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], -2067157559
               );
               return 1;
            }
         } else if (3818 == var0) {
            classBB.field323[DynamicObject.field1679 * -324749371 - 1] = classNJ.field4678.method6249((byte)-64)[classBB.field323[DynamicObject.field1679
                  * -324749371
               - 1]];
            return 1;
         } else if (var0 == 3819) {
            if (var3 == -1863749917) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var15 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var21 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
               classVX.method12263(var21, var15, (byte)85);
               return 1;
            }
         } else if (var0 == 3820) {
            int var14 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3039[var14];
            return 1;
         } else {
            if (3821 == var0) {
               DynamicObject.field1679 -= 360123687;
               int var4 = classBB.field323[DynamicObject.field1679 * -324749371];
               boolean var10000;
               if (classBB.field323[1 + DynamicObject.field1679 * -324749371] == 1) {
                  if (var3 == -1863749917) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var5 = var10000;
               int var6 = classBB.field323[DynamicObject.field1679 * -324749371 + 2];
               VarbitComposition.method9217(var6, var4, var5, 45209452);
            }

            if (3822 == var0) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  int var13 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                  int[] var25 = classBB.field323;
                  int var27 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  byte var29;
                  if (classNJ.field4678.field3045[var13]) {
                     if (var3 == -1863749917) {
                        throw new IllegalStateException();
                     }

                     var29 = 1;
                  } else {
                     var29 = 0;
                  }

                  var25[var27] = var29;
                  return 1;
               }
            } else if (var0 == 3850) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  if (classKA.field3513 != null) {
                     if (var3 == -1863749917) {
                        throw new IllegalStateException();
                     }

                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                     classPO.field5368 = classKA.field3513;
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  }

                  return 1;
               }
            } else if (var0 == 3851) {
               int var12 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (null != client.field866[var12]) {
                  if (var3 == -1863749917) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                  classPO.field5368 = client.field866[var12];
                  classHU.field2891 = 1507670665 * var12;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3852) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classPO.field5368.field2948;
                  return 1;
               }
            } else if (3853 == var0) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368.field2950;
                  return 1;
               }
            } else if (3854 == var0) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368.field2949;
                  return 1;
               }
            } else if (3855 == var0) {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClanChannel.method6183(classPO.field5368, (byte)-26);
               return 1;
            } else if (var0 == 3856) {
               int var11 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var11))
                  .field2846
                  .method164(1702373393);
               return 1;
            } else if (3857 == var0) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  int var10 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var10)).field2841;
                  return 1;
               }
            } else if (3858 == var0) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  int var9 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var9)).field2842
                     * -906550845;
                  return 1;
               }
            } else if (3859 == var0) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  int var8 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                  Message.method1496(-1270719559 * classHU.field2891, var8, 973334607);
                  return 1;
               }
            } else if (var0 == 3860) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368
                     .method6186((String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], (byte)33);
                  return 1;
               }
            } else if (3861 == var0) {
               classBB.field323[DynamicObject.field1679 * -324749371 - 1] = ClanChannel.method6169(classPO.field5368, -1957709273)[classBB.field323[-324749371
                     * DynamicObject.field1679
                  - 1]];
               return 1;
            } else if (3890 == var0) {
               if (var3 == -1863749917) {
                  throw new IllegalStateException();
               } else {
                  int[] var24 = classBB.field323;
                  int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  byte var10002;
                  if (null != classOH.field4871) {
                     if (var3 == -1863749917) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var24[var10001] = var10002;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "oi.ba(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loi;)Lym;")
   @ObfuscatedName("hp")
   public static SpritePixels method8493(WorldEntityConfig var0) {
      if (var0 == null) {
         var0.method8500();
      }

      if (var0.field4888 * -486845133 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field4873.method6422(-486845133 * var0.field4888);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classJI.field3167, var0.field4888 * -486845133, 0, -1854532348);
            if (var1 != null) {
               field4873.method6428(var1, var0.field4888 * -486845133);
            }

            return var1;
         }
      }
   }

   public int getBoundsX() {
      return this.field4876.field6646 * -1311898939;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ag")
   public int method8478(byte var1) {
      try {
         return 1896935861 * this.field4879;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public int method8481() {
      return 804505943 * this.field4880;
   }

   public int getCategory() {
      return this.field4882 * 1743605379;
   }

   public int getId() {
      return this.field4878 * -324844483;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int method8473() {
      return this.field4885 * -714504734;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("bb")
   public SpritePixels method8494() {
      if (this.field4888 * 1536601507 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field4873.method6422(-1546897097 * this.field4888);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classJI.field3167, this.field4888 * 155563273, 0, -1885655451);
            if (var1 != null) {
               field4873.method6428(var1, this.field4888 * -895453213);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("bi")
   public SpritePixels method8495() {
      if (this.field4888 * -486845133 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field4873.method6422(-486845133 * this.field4888);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classJI.field3167, this.field4888 * -486845133, 0, -1609789149);
            if (var1 != null) {
               field4873.method6428(var1, this.field4888 * -486845133);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method8474(int var1) {
      try {
         return this.field4885 * 594099331;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   public int method8499() {
      return 1745230265 * this.field4889;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   public int method8500() {
      return 1745230265 * this.field4889;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loi;)Lkw;")
   @ObfuscatedName("jv")
   public static classKW method8486(WorldEntityConfig var0) {
      return var0.field4886;
   }

   @ObfuscatedSignature(descriptor = "()Ljb;")
   @ObfuscatedName("bw")
   public classJB method8491() {
      return this.field4875;
   }

   public int getBoundsY() {
      return this.field4876.field6645 * -1680480153;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method8501() {
      return 1745230265 * this.field4889;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("be")
   public SpritePixels method8496() {
      if (this.field4888 * -486845133 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field4873.method6422(-486845133 * this.field4888);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classJI.field3167, this.field4888 * -486845133, 0, -1966443163);
            if (var1 != null) {
               field4873.method6428(var1, this.field4888 * -486845133);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method8469(int var1) {
      try {
         return this.field4879 * 1455014693;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lkw;")
   @ObfuscatedName("ac")
   public classKW method8487(int var1) {
      try {
         return this.field4886;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   public int method8502(int var1) {
      try {
         return 1745230265 * this.field4888;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loi;I)Lkw;")
   @ObfuscatedName("mu")
   public static classKW method8488(WorldEntityConfig var0, int var1) {
      if (var0 == null) {
         var0.method8487(var1);
      }

      try {
         return var0.field4886;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "oi.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lkw;")
   @ObfuscatedName("bk")
   public classKW method8489() {
      return this.field4886;
   }

   public int getBoundsWidth() {
      return this.field4876.field6648 * -105665105;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public int method8505() {
      return this.field4879 * -324844483;
   }
}
