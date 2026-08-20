import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ga")
public class classGA {
   @ObfuscatedName("ag")
   int field2526;
   @ObfuscatedName("af")
   int field2525;
   @ObfuscatedName("ay")
   int field2535;
   @ObfuscatedName("ab")
   int field2523;
   @ObfuscatedName("ae")
   int field2524;
   @ObfuscatedName("as")
   int field2532;
   @ObfuscatedName("ax")
   int field2534;
   @ObfuscatedName("ac")
   int field2520 = 0;
   @ObfuscatedName("aa")
   int field2521 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final float field2522 = 0.9F;
   @ObfuscatedName("al")
   int field2528;
   @ObfuscatedName("aj")
   int field2527;
   @ObfuscatedName("aq")
   int field2531;
   @ObfuscatedName("ao")
   boolean field2536;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field2530 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field2533 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field2529 = 27;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lga;Lzd;Lzv;)V")
   @ObfuscatedName("ie")
   public static void method5286(classGA var0, classZD var1, Font var2) {
      if (var0 == null) {
         var0.method5288(var1, var2);
      }

      if (var2 != null) {
         int var3 = var2.field8;
         int var4 = Math.min(1491368497 * var0.field2526, (int)(0.9F * var3));
         int var5 = var1.method13950(936166701 * var0.field2523, (byte)-72);
         int var6 = var1.method13952(1491368497 * var0.field2526, 842154218);
         int var7 = var5 + (var0.field2525 * 441109595 - -1400917867 * var0.field2532);
         int var8 = var3 + -793189793 * var0.field2524 - 1896268917 * var0.field2534 + var6;
         classYW.method13671(
            var0.field2525 * 441109595,
            var0.field2524 * -793189793,
            936166701 * var0.field2523 + var0.field2525 * 441109595,
            var0.field2526 * 1491368497 + -793189793 * var0.field2524
         );
         int var9 = -1709561623 * var0.field2521;
         int var10 = var0.field2520 * 221668521;
         if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
         }

         classAAG var21 = var1.method13871(0, var9, 942501220);
         classAAG var12 = var1.method13871(var9, var10, 649658971);
         classAAG var13 = var1.method13871(var10, var1.method13850(-1135586510), 727745105);
         classAAG var14 = var1.method13871(0, var0.field2520 * 221668521, 372017264);
         if (!classAAG.method202(var12, 424394232)) {
            int var15 = var2.field10 + var2.field9;

            for (int var16 = 0; var16 < var12.method204(-1490112889); var16++) {
               classAAY var17 = var12.method217(var16, -1860112912);
               int var18 = var17.field116 * -724223965 + var7;
               int var19 = var2.method33(var17.field117);
               int var20 = 1839316601 * var17.field115 + var8 - var3;
               classYW.method13698(var18, var20, var19, var15, -643748135 * var0.field2531);
            }
         }

         if (!classAAG.method202(var21, 1504404585)) {
            var2.method72(var21, var7, var8, var0.field2528 * 1807643063, -138828943 * var0.field2527, -1);
         }

         if (!classAAG.method202(var12, 2035444186)) {
            var2.method72(var12, var7, var8, var0.field2535 * 949236295, -138828943 * var0.field2527, -1);
         }

         if (!classAAG.method202(var13, 1813816571)) {
            var2.method72(var13, var7, var8, var0.field2528 * 1807643063, -138828943 * var0.field2527, -1);
         }

         if (var0.field2536) {
            classWB var22 = var14.method214((byte)-103);
            int var23 = var7 + (Integer)var22.field6654;
            int var24 = var8 + (Integer)var22.field6655;
            int var25 = var24 - var4;
            classYW.method13732(var23, var24, var23, var25, var0.field2528 * 1807643063);
            if (-1 != -138828943 * var0.field2527) {
               classYW.method13732(var23 + 1, var24 + 1, 1 + var23, var25 + 1, var0.field2527 * -138828943);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzd;Lzv;I)V")
   @ObfuscatedName("ae")
   void method5287(classZD var1, Font var2, int var3) {
      try {
         if (var2 == null) {
            if (var3 != 120041229) {
               throw new IllegalStateException();
            }
         } else {
            int var4 = var2.field8;
            int var5 = Math.min(1491368497 * this.field2526, (int)(0.9F * var4));
            int var6 = var1.method13950(936166701 * this.field2523, (byte)-2);
            int var7 = var1.method13952(1491368497 * this.field2526, -1983597007);
            int var8 = var6 + (this.field2525 * 441109595 - -1400917867 * this.field2532);
            int var9 = var4 + -793189793 * this.field2524 - 1896268917 * this.field2534 + var7;
            classYW.method13671(
               this.field2525 * 441109595,
               this.field2524 * -793189793,
               936166701 * this.field2523 + this.field2525 * 441109595,
               this.field2526 * 1491368497 + -793189793 * this.field2524
            );
            int var10 = -1709561623 * this.field2521;
            int var11 = this.field2520 * 221668521;
            if (var10 > var11) {
               if (var3 != 120041229) {
                  throw new IllegalStateException();
               }

               int var12 = var10;
               var10 = var11;
               var11 = var12;
            }

            classAAG var23 = var1.method13871(0, var10, 436907871);
            classAAG var13 = var1.method13871(var10, var11, 226795559);
            classAAG var14 = var1.method13871(var11, var1.method13850(-1501206611), 27595323);
            classAAG var15 = var1.method13871(0, this.field2520 * 221668521, 584463);
            if (!classAAG.method202(var13, 1936380487)) {
               int var16 = var2.field10 + var2.field9;

               for (int var17 = 0; var17 < var13.method204(1208950319); var17++) {
                  if (var3 != 120041229) {
                     throw new IllegalStateException();
                  }

                  classAAY var18 = var13.method217(var17, -1309855585);
                  int var19 = var18.field116 * -724223965 + var8;
                  int var20 = var2.method33(var18.field117);
                  int var21 = 1839316601 * var18.field115 + var9 - var4;
                  classYW.method13698(var19, var21, var20, var16, -643748135 * this.field2531);
               }
            }

            if (!classAAG.method202(var23, 68204662)) {
               if (var3 != 120041229) {
                  throw new IllegalStateException();
               }

               var2.method72(var23, var8, var9, this.field2528 * 1807643063, -138828943 * this.field2527, -1);
            }

            if (!classAAG.method202(var13, -343955524)) {
               if (var3 != 120041229) {
                  throw new IllegalStateException();
               }

               var2.method72(var13, var8, var9, this.field2535 * 949236295, -138828943 * this.field2527, -1);
            }

            if (!classAAG.method202(var14, -626826741)) {
               if (var3 != 120041229) {
                  throw new IllegalStateException();
               }

               var2.method72(var14, var8, var9, this.field2528 * 1807643063, -138828943 * this.field2527, -1);
            }

            if (this.field2536) {
               classWB var24 = var15.method214((byte)-108);
               int var25 = var8 + (Integer)var24.field6654;
               int var26 = var9 + (Integer)var24.field6655;
               int var27 = var26 - var5;
               classYW.method13732(var25, var26, var25, var27, this.field2528 * 1807643063);
               if (-1 != -138828943 * this.field2527) {
                  if (var3 != 120041229) {
                     return;
                  }

                  classYW.method13732(var25 + 1, var26 + 1, 1 + var25, var27 + 1, this.field2527 * -138828943);
               }
            }
         }
      } catch (RuntimeException var22) {
         throw classEG.method3884(var22, "ga.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("bp")
   static int method5292(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 == 2700) {
            if (var3 >= 665692147) {
               throw new IllegalStateException();
            } else {
               Widget var15 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)69);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 2073671441 * var15.field4319;
               return 1;
            }
         } else if (var0 == 2701) {
            Widget var14 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)69);
            if (2073671441 * var14.field4319 != -1) {
               if (var3 >= 665692147) {
                  throw new IllegalStateException();
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1190987649 * var14.field4344;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (2702 == var0) {
            if (var3 >= 665692147) {
               throw new IllegalStateException();
            } else {
               int var13 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               InterfaceParent var17 = (InterfaceParent)classWK.field6691.field6613.method13363(var13);
               if (var17 != null) {
                  if (var3 >= 665692147) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 2703) {
            if (var3 >= 665692147) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               int var12 = classBB.field323[DynamicObject.field1679 * -324749371];
               Widget var16 = classLY.method7378(
                  classWK.field6691,
                  classBB.field323[1 + -324749371 * DynamicObject.field1679],
                  classBB.field323[2 + DynamicObject.field1679 * -324749371],
                  (byte)-100
               );
               classPN var18 = classNE.method7829(var12, (byte)-36);
               if (classPN.method9026(var18, (byte)2)) {
                  if (var3 >= 665692147) {
                     throw new IllegalStateException();
                  }

                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var16.method7220(var12, var18.field5351, 1554237687);
               } else if (var18.method9028((byte)60)) {
                  if (var3 >= 665692147) {
                     throw new IllegalStateException();
                  }

                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var16.method7228(var12, 3335646069137558745L * var18.field5354);
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Widget.method7226(
                     var16, var12, var18.field5352 * -1601970641, (byte)9
                  );
               }

               return 1;
            }
         } else if (var0 == 2704) {
            if (var3 >= 665692147) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               Widget var11 = classLY.method7378(
                  classWK.field6691,
                  classBB.field323[DynamicObject.field1679 * -324749371],
                  classBB.field323[1 + -324749371 * DynamicObject.field1679],
                  (byte)22
               );
               int var5 = classBB.field323[2 + DynamicObject.field1679 * -324749371];
               Object var6 = classKN.method6500(var5, 905963788);
               int var7 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var11.method7230(var7, var6, (byte)-119);
               return 1;
            }
         } else if (2706 == var0) {
            if (var3 >= 665692147) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -77072447 * classWK.field6691.field6612;
               return 1;
            }
         } else if (2707 == var0) {
            Widget var10 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)75);
            int[] var10000 = classBB.field323;
            int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
            byte var10002;
            if (var10.method7249(1355775728)) {
               if (var3 >= 665692147) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            var10000[var10001] = var10002;
            return 1;
         } else if (2708 == var0) {
            Widget var9 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)88);
            return classEG.method3883(var9, 1268080743);
         } else if (var0 == 2709) {
            if (var3 >= 665692147) {
               throw new IllegalStateException();
            } else {
               Widget var4 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)65);
               return classIC.method6142(var4, (byte)48);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ga.bp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzd;Lzv;)V")
   @ObfuscatedName("ao")
   void method5288(classZD var1, Font var2) {
      if (var2 != null) {
         int var3 = var2.field8;
         int var4 = Math.min(1481909902 * this.field2526, (int)(0.9F * var3));
         int var5 = var1.method13950(-419070401 * this.field2523, (byte)-46);
         int var6 = var1.method13952(-1785821366 * this.field2526, 2100913198);
         int var7 = var5 + (this.field2525 * 1545163404 - -1400917867 * this.field2532);
         int var8 = var3 + -793189793 * this.field2524 - 1896268917 * this.field2534 + var6;
         classYW.method13671(
            this.field2525 * 441109595,
            this.field2524 * 1634278274,
            936166701 * this.field2523 + this.field2525 * 441109595,
            this.field2526 * 2053972458 + -793189793 * this.field2524
         );
         int var9 = 1903178246 * this.field2521;
         int var10 = this.field2520 * 221668521;
         if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
         }

         classAAG var21 = var1.method13871(0, var9, 674967521);
         classAAG var12 = var1.method13871(var9, var10, 1135474716);
         classAAG var13 = var1.method13871(var10, var1.method13850(-1536320592), 781940696);
         classAAG var14 = var1.method13871(0, this.field2520 * 221668521, 2008752358);
         if (!classAAG.method202(var12, 1209167877)) {
            int var15 = var2.field10 + var2.field9;

            for (int var16 = 0; var16 < var12.method204(453848796); var16++) {
               classAAY var17 = var12.method217(var16, -1879550978);
               int var18 = var17.field116 * 722315763 + var7;
               int var19 = var2.method33(var17.field117);
               int var20 = 1486535473 * var17.field115 + var8 - var3;
               classYW.method13698(var18, var20, var19, var15, 909096085 * this.field2531);
            }
         }

         if (!classAAG.method202(var21, -227282562)) {
            var2.method72(var21, var7, var8, this.field2528 * 1807643063, -138828943 * this.field2527, -1);
         }

         if (!classAAG.method202(var12, -615476978)) {
            var2.method72(var12, var7, var8, this.field2535 * 1935848295, -938782705 * this.field2527, -1);
         }

         if (!classAAG.method202(var13, -70162169)) {
            var2.method72(var13, var7, var8, this.field2528 * 1807643063, -1522184922 * this.field2527, -1);
         }

         if (this.field2536) {
            classWB var22 = var14.method214((byte)-16);
            int var23 = var7 + (Integer)var22.field6654;
            int var24 = var8 + (Integer)var22.field6655;
            int var25 = var24 - var4;
            classYW.method13732(var23, var24, var23, var25, this.field2528 * 1807643063);
            if (-1 != -1089982811 * this.field2527) {
               classYW.method13732(var23 + 1, var24 + 1, 1 + var23, var25 + 1, this.field2527 * -138828943);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("ab")
   void method5277(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.field2525 = -573756181 * var1;
      this.field2524 = 707000735 * var2;
      this.field2523 = var3 * 408930919;
      this.field2526 = 1917859420 * var4;
      this.field2532 = -2058097995 * var5;
      this.field2534 = 762178525 * var6;
      this.field2520 = -1260486759 * var7;
      this.field2521 = -182636711 * var8;
      this.field2536 = var9;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ac")
   void method5282(int var1, int var2, int var3, int var4) {
      this.field2528 = 1576811527 * var1;
      this.field2527 = 1295039889 * var2;
      this.field2535 = var3 * -226109577;
      this.field2531 = -618237591 * var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lga;IIIIIIIIZ)V")
   @ObfuscatedName("gu")
   public static void method5278(classGA var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var0 == null) {
         var0.method5282(var1, var1, var1, var1);
      } else {
         var0.field2525 = 2131544575 * var1;
         var0.field2524 = 707000735 * var2;
         var0.field2523 = var3 * 1142870693;
         var0.field2526 = -1220788240 * var4;
         var0.field2532 = 977115837 * var5;
         var0.field2534 = -1595878523 * var6;
         var0.field2520 = 391144625 * var7;
         var0.field2521 = -182636711 * var8;
         var0.field2536 = var9;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lga;IIII)V")
   @ObfuscatedName("xd")
   public static void method5283(classGA var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5282(var1, var1, var1, var1);
      } else {
         var0.field2528 = 1576811527 * var1;
         var0.field2527 = 1295039889 * var2;
         var0.field2535 = var3 * -226109577;
         var0.field2531 = -618237591 * var4;
      }
   }

   classGA() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;II)V")
   @ObfuscatedName("dz")
   public static void method5291(classZD var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13903(var1, var1);
      }

      if (!var0.method13845(1107195800) && var0.field7170 != null) {
         classWB var3 = classZD.method13970(var0, var1, var2, 274916617);
         boolean var4 = (Integer)var3.field6654 == 0 && (Integer)var3.field6655 == var0.field7158.size();
         int var5 = (Integer)var3.field6654;
         int var6 = 0;
         int var7 = var4 ? 0 : ((classAAY)var0.field7158.get((Integer)var3.field6654)).field115 * 1839316601;
         int var8 = 0;

         for (int var9 = (Integer)var3.field6654; var9 <= (Integer)var3.field6655; var9++) {
            boolean var10 = var9 >= var0.field7158.size();
            classAAY var11 = (classAAY)var0.field7158.get(!var10 ? var9 : var0.field7158.size() - 1);
            int var12 = !var10 ? var0.method13967(var11, false, (byte)-15) : 0;
            boolean var13 = !var10 && var11.field117 == '\n';
            boolean var14 = !var10 && var0.method13847(1930762735) && var6 + var12 > 1062600889 * var0.field7160;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               if (var14) {
                  int var17 = 0;
                  if (2145444479 * var0.field7159 == 1) {
                     for (int var18 = var9; var18 > var5; var18--) {
                        classAAY var19 = (classAAY)var0.field7158.get(var18);
                        var17 += var18 < var15 ? var0.method13967(var19, false, (byte)20) : 0;
                        if (var19.field117 == ' ' || var19.field117 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               int var25 = -var0.method13950(var6, (byte)-80);

               for (int var26 = var5; var26 < var15; var26++) {
                  classAAY var27 = (classAAY)var0.field7158.get(var26);
                  int var20 = var0.method13967(var27, false, (byte)-18);
                  var27.field116 = var25 * -1084672117;
                  var27.field115 = -170636343 * var7;
                  var25 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += var0.method13911((byte)28);
               var8++;
            }

            var6 += !var10 ? var12 : 0;
         }

         if (0 != var0.field7156 * -2110789749 && var4) {
            int var21 = var8 * var0.method13911((byte)-20);
            int var22 = var0.method13952(var21, -233375950);

            for (int var23 = 0; var23 < var0.field7158.size(); var23++) {
               classAAY var24 = (classAAY)var0.field7158.get(var23);
               var24.field115 -= -170636343 * var22;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lga;IIIIIIIIZ)V")
   @ObfuscatedName("uh")
   public static void method5279(classGA var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var0 == null) {
         var0.method5280(var1, var1, var1, var1, var1, var1, var1, var1, var9);
      }

      var0.field2525 = 699482775 * var1;
      var0.field2524 = 707000735 * var2;
      var0.field2523 = var3 * 1142870693;
      var0.field2526 = 963550929 * var4;
      var0.field2532 = 1593231084 * var5;
      var0.field2534 = 556966681 * var6;
      var0.field2520 = 127732734 * var7;
      var0.field2521 = -182636711 * var8;
      var0.field2536 = var9;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("as")
   void method5280(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.field2525 = 805667795 * var1;
      this.field2524 = -1856113475 * var2;
      this.field2523 = var3 * 1142870693;
      this.field2526 = 1341484976 * var4;
      this.field2532 = 977115837 * var5;
      this.field2534 = 762178525 * var6;
      this.field2520 = 1935151430 * var7;
      this.field2521 = 2145019401 * var8;
      this.field2536 = var9;
   }

   @ObfuscatedSignature(descriptor = "(Lzd;Lzv;)V")
   @ObfuscatedName("al")
   void method5289(classZD var1, Font var2) {
      if (var2 != null) {
         int var3 = var2.field8;
         int var4 = Math.min(1491368497 * this.field2526, (int)(0.9F * var3));
         int var5 = var1.method13950(936166701 * this.field2523, (byte)-11);
         int var6 = var1.method13952(1491368497 * this.field2526, 1444260448);
         int var7 = var5 + (this.field2525 * -1151051805 - -1855473546 * this.field2532);
         int var8 = var3 + -1992576358 * this.field2524 - -404073355 * this.field2534 + var6;
         classYW.method13671(
            this.field2525 * 441109595,
            this.field2524 * -793189793,
            932098522 * this.field2523 + this.field2525 * 441109595,
            this.field2526 * 925787561 + -536975558 * this.field2524
         );
         int var9 = -1607103206 * this.field2521;
         int var10 = this.field2520 * -140710787;
         if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
         }

         classAAG var21 = var1.method13871(0, var9, 38332193);
         classAAG var12 = var1.method13871(var9, var10, 333767999);
         classAAG var13 = var1.method13871(var10, var1.method13850(-128882205), 1061820490);
         classAAG var14 = var1.method13871(0, this.field2520 * 221668521, 913585940);
         if (!classAAG.method202(var12, 1146734842)) {
            int var15 = var2.field10 + var2.field9;

            for (int var16 = 0; var16 < var12.method204(984174273); var16++) {
               classAAY var17 = var12.method217(var16, -1340613208);
               int var18 = var17.field116 * -724223965 + var7;
               int var19 = var2.method33(var17.field117);
               int var20 = -1932974331 * var17.field115 + var8 - var3;
               classYW.method13698(var18, var20, var19, var15, -243844123 * this.field2531);
            }
         }

         if (!classAAG.method202(var21, -731110251)) {
            var2.method72(var21, var7, var8, this.field2528 * -898323646, -138828943 * this.field2527, -1);
         }

         if (!classAAG.method202(var12, -1206000151)) {
            var2.method72(var12, var7, var8, this.field2535 * 949236295, -301748936 * this.field2527, -1);
         }

         if (!classAAG.method202(var13, 680125738)) {
            var2.method72(var13, var7, var8, this.field2528 * 353488235, 766039999 * this.field2527, -1);
         }

         if (this.field2536) {
            classWB var22 = var14.method214((byte)-62);
            int var23 = var7 + (Integer)var22.field6654;
            int var24 = var8 + (Integer)var22.field6655;
            int var25 = var24 - var4;
            classYW.method13732(var23, var24, var23, var25, this.field2528 * 1807643063);
            if (-1 != 419027730 * this.field2527) {
               classYW.method13732(var23 + 1, var24 + 1, 1 + var23, var25 + 1, this.field2527 * 963621583);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZI)V")
   @ObfuscatedName("az")
   void method5281(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10) {
      try {
         this.field2525 = 805667795 * var1;
         this.field2524 = 707000735 * var2;
         this.field2523 = var3 * 1142870693;
         this.field2526 = 963550929 * var4;
         this.field2532 = 977115837 * var5;
         this.field2534 = 762178525 * var6;
         this.field2520 = -1260486759 * var7;
         this.field2521 = -182636711 * var8;
         this.field2536 = var9;
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "ga.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lga;IIIII)V")
   @ObfuscatedName("vm")
   public static void method5284(classGA var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method5285(var1, var1, var1, var1, var1);
      } else {
         try {
            var0.field2528 = 1576811527 * var1;
            var0.field2527 = 1295039889 * var2;
            var0.field2535 = var3 * -226109577;
            var0.field2531 = -618237591 * var4;
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "ga.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   static int method5290(int var0, int var1) {
      try {
         return -var0 - 1;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ga.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;B)V")
   @ObfuscatedName("ex")
   static void method5293(NPC var0, byte var1) {
      try {
         var0.field1441 = -1188676331 * var0.definition.field5284;
         var0.field1472 = -1692128277 * var0.definition.field5299;
         var0.field1445 = -1396416521 * var0.definition.field5285;
         var0.field1462 = 1282027453 * var0.definition.field5308;
         var0.field1450 = -1864595447 * var0.definition.field5286;
         var0.field1448 = var0.definition.field5309 * -1944547999;
         var0.field1436 = var0.definition.field5306 * -2041668601;
         var0.field1444 = 164467025 * var0.definition.field5291;
         var0.field1457 = var0.definition.field5307 * 1722908955;
         var0.field1449 = 23640527 * var0.definition.field5281;
         var0.field1443 = -1297027025 * var0.definition.field5310;
         var0.field1451 = 1997438045 * var0.definition.field5301;
         var0.field1452 = -771437299 * var0.definition.field5311;
         var0.field1453 = -1595575305 * var0.definition.field5282;
         var0.field1446 = 631388589 * var0.definition.field5298;
         var0.field1455 = -1060340881 * var0.definition.field5303;
         var0.field1456 = var0.definition.field5312 * -1105503079;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ga.ex(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("af")
   void method5285(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.field2520 = 1576811527 * var1;
         this.field2531 = 1295039889 * var2;
         this.field2523 = var3 * -226109577;
         this.field2535 = -618237591 * var4;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ga.af(" + ')');
      }
   }
}
