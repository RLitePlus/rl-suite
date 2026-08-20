import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fw")
public class classFW {
   @ObfuscatedName("ry")
   static int field2417;
   @ObfuscatedName("af")
   int field2413 = 0;
   @ObfuscatedName("ae")
   int[] field2414 = new int[128];
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2416 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2415 = 11;
   @ObfuscatedName("ab")
   int[] field2412 = new int[128];

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ax")
   public boolean method5062(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field2413 * -16046119; var3++) {
            if (this.field2412[var3] == var1) {
               if (var2 <= 539907889) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "fw.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   public void method5039(int var1) {
      try {
         this.field2413 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fw.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   public int method5059(int var1) {
      return this.field2414[var1];
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aw")
   public void method5052(int var1, int var2) {
      this.field2412[this.field2413 * -16046119] = var1;
      this.field2414[-16046119 * this.field2413] = var2;
      this.field2413 += 684779625;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ah")
   public boolean method5063(int var1) {
      for (int var2 = 0; var2 < this.field2413 * -16046119; var2++) {
         if (this.field2412[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   public int method5056(int var1, int var2) {
      try {
         return this.field2412[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "fw.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   public int method5060(int var1, int var2) {
      try {
         return this.field2414[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "fw.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public int method5043(int var1) {
      try {
         return this.field2413 * -16046119;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fw.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method5040() {
      this.field2413 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method5061(int var1) {
      return this.field2414[var1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public int method5044() {
      return this.field2413 * -16046119;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public int method5045() {
      return this.field2413 * 1178788132;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method5047() {
      return -16046119 * this.field2413 >= 128;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method5048() {
      return -16046119 * this.field2413 >= -1876658784;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method5049() {
      return -16046119 * this.field2413 >= 128;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method5050() {
      return -16046119 * this.field2413 >= 128;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ai")
   public void method5053(int var1, int var2) {
      this.field2412[this.field2413 * -16046119] = var1;
      this.field2414[2089152346 * this.field2413] = var2;
      this.field2413 += 684779625;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ar")
   public void method5054(int var1, int var2) {
      this.field2412[this.field2413 * -885363965] = var1;
      this.field2414[-371983899 * this.field2413] = var2;
      this.field2413 += 1943448503;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public void method5041() {
      this.field2413 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public int method5057(int var1) {
      return this.field2412[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfw;I)I")
   @ObfuscatedName("sg")
   public static int method5058(classFW var0, int var1) {
      return var0.field2412[var1];
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ab")
   public void method5055(int var1, int var2, int var3) {
      try {
         this.field2412[this.field2413 * -16046119] = var1;
         this.field2414[-16046119 * this.field2413] = var2;
         this.field2413 += 684779625;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "fw.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   public boolean method5051(int var1) {
      try {
         boolean var10000;
         if (-16046119 * this.field2413 >= 128) {
            if (var1 != 555265558) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "fw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public void method5042() {
      this.field2413 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("dr")
   static void method5066(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         IntProjection.method4080(classCQ.field1220, var0, var1, var2, var3, var4, var5, -822185665);
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "fw.dr(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;)Lkr;")
   @ObfuscatedName("kk")
   public static classKR method5065(WorldEntity var0) {
      return var0.field6021;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("cs")
   static int method5067(int var0, Script var1, boolean var2, int var3) {
      try {
         if (8000 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               classTE var39 = classJM.method6398(classBB.field328[1375698635 * classBB.field338], null, 1578948926);
               classTE var64 = (classTE)classBB.field328[1 + classBB.field338 * 1375698635];
               classNI.method7860(var39, var64, -1004642784);
               return 1;
            }
         } else if (8001 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var38 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var63 = classBB.field323[1 + -324749371 * DynamicObject.field1679];
               classTE var81 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               classAS.method663(var81, var38, var63, (byte)0);
               return 1;
            }
         } else if (var0 == 8002) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classTE var37 = (classTE)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int[] var101 = classBB.field323;
               int var109 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var117;
               if (null == var37) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  var117 = 1;
               } else {
                  var117 = 0;
               }

               var101[var109] = var117;
               return 1;
            }
         } else if (var0 == 8003) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classTE var36 = (classTE)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int[] var100 = classBB.field323;
               int var108 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var116;
               if (var36 != null) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  var116 = var36.method10756(325723704);
               } else {
                  var116 = 0;
               }

               var100[var108] = var116;
               return 1;
            }
         } else if (var0 == 8004) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               classTE var35 = (classTE)classBB.field328[classBB.field338 * 1375698635];
               classTE var62 = (classTE)classBB.field328[1 + classBB.field338 * 1375698635];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classSY.method10714(var35, var62, -325353510);
               return 1;
            }
         } else if (var0 == 8005) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               int var34 = classBB.field323[DynamicObject.field1679 * -324749371];
               int var61 = classBB.field323[DynamicObject.field1679 * -324749371 + 1];
               int var80 = classBB.field323[DynamicObject.field1679 * -324749371 + 2];
               Object var87 = classKN.method6500(var80, -1989739513);
               classTE var91 = (classTE)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int[] var99 = classBB.field323;
               int var107 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var115;
               if (null != var91) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  var115 = classVS.method12082(var91, var87, var34, var61, 1782791469);
               } else {
                  var115 = -1;
               }

               var99[var107] = var115;
               return 1;
            }
         } else if (8006 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               int var33 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var60 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
               int var79 = classBB.field323[-324749371 * DynamicObject.field1679 + 2];
               Object var86 = classKN.method6500(var79, 204610918);
               classTE var90 = (classTE)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int[] var98 = classBB.field323;
               int var106 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var114;
               if (var90 != null) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  var114 = classQP.method9699(var90, var86, var33, var60, (byte)0);
               } else {
                  var114 = -1;
               }

               var98[var106] = var114;
               return 1;
            }
         } else if (8007 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               int var32 = classBB.field323[DynamicObject.field1679 * -324749371];
               int var59 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
               int var78 = classBB.field323[DynamicObject.field1679 * -324749371 + 2];
               Object var85 = classKN.method6500(var78, -457051485);
               classTE var89 = (classTE)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int[] var97 = classBB.field323;
               int var105 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var113;
               if (var89 != null) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  var113 = classGK.method5481(var89, var85, var32, var59, -746124030);
               } else {
                  var113 = 0;
               }

               var97[var105] = var113;
               return 1;
            }
         } else if (var0 == 8008) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classTE var31 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               int var58 = classKV.method6570(var31, -2042956675);
               if (var31.field6128 == classYY.field7111) {
                  int[] var94 = classBB.field323;
                  int var103 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var111;
                  if (var58 >= 0) {
                     if (var3 <= 658009662) {
                        throw new IllegalStateException();
                     }

                     var111 = var31.method10748(325615819)[var58];
                  } else {
                     var111 = -1;
                  }

                  var94[var103] = var111;
               } else {
                  if (classYY.field7113 != var31.field6128) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  Object var95;
                  if (var58 >= 0) {
                     if (var3 <= 658009662) {
                        throw new IllegalStateException();
                     }

                     var95 = classTE.method10753(var31, 885401162)[var58];
                  } else {
                     var95 = null;
                  }

                  String var77 = (String)var95;
                  var95 = classBB.field328;
                  int var104 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  String var112;
                  if (null != var77) {
                     if (var3 <= 658009662) {
                        throw new IllegalStateException();
                     }

                     var112 = var77;
                  } else {
                     var112 = "";
                  }

                  ((Object[])var95)[var104] = var112;
               }

               return 1;
            }
         } else if (var0 == 8009) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classTE var30 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               int var57 = classMB.method7520(var30, 314284836);
               if (classYY.field7111 == var30.field6128) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  int[] var10000 = classBB.field323;
                  int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var10002;
                  if (var57 >= 0) {
                     if (var3 <= 658009662) {
                        throw new IllegalStateException();
                     }

                     var10002 = var30.method10748(1111693409)[var57];
                  } else {
                     var10002 = -1;
                  }

                  var10000[var10001] = var10002;
               } else {
                  if (classYY.field7113 != var30.field6128) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  Object var92;
                  if (var57 >= 0) {
                     if (var3 <= 658009662) {
                        throw new IllegalStateException();
                     }

                     var92 = classTE.method10753(var30, -846138251)[var57];
                  } else {
                     var92 = null;
                  }

                  String var76 = (String)var92;
                  var92 = classBB.field328;
                  int var102 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  String var110;
                  if (null != var76) {
                     if (var3 <= 658009662) {
                        throw new IllegalStateException();
                     }

                     var110 = var76;
                  } else {
                     var110 = "";
                  }

                  ((Object[])var92)[var102] = var110;
               }

               return 1;
            }
         } else if (8010 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               int var29 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var56 = classBB.field323[1 + -324749371 * DynamicObject.field1679];
               int var75 = classBB.field323[2 + -324749371 * DynamicObject.field1679];
               Object var84 = classKN.method6500(var75, 1109263451);
               classTE var88 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               classAF.method340(var88, var84, var29, var56, -763309240);
               return 1;
            }
         } else if (var0 == 8011) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               int var28 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var55 = classBB.field323[1 + -324749371 * DynamicObject.field1679];
               int var74 = classBB.field323[DynamicObject.field1679 * -324749371 + 2];
               classTE var83 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               classCN.method2553(var83, var28, 1, var55, var74, (byte)0);
               return 1;
            }
         } else if (8012 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classTE var27 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               classPH.method8891(var27, 1340708106);
               return 1;
            }
         } else if (8013 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               int var26 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classTE var54 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               classLD.method6745(var54, var26, (byte)98);
               return 1;
            }
         } else if (var0 == 8014) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var25 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var53 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
               classTE var73 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               classSG.method10417(var73, var25, var53, (byte)-64);
               return 1;
            }
         } else if (8015 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var24 = classBB.field323[DynamicObject.field1679 * -324749371];
            int var52 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
            int var72 = classBB.field323[DynamicObject.field1679 * -324749371 + 2];
            classBB.field338 -= -1849233978;
            classTE var82 = classJM.method6398(classBB.field328[classBB.field338 * 1375698635], null, 1578948926);
            classTE var8 = classJM.method6398(classBB.field328[1375698635 * classBB.field338 + 1], null, 1578948926);
            ObjectSound.method3676(var82, var8, var24, var52, var72, 1473076970);
            return 1;
         } else if (8016 == var0) {
            classTE var23 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)classQA.method9429(var23, -1710981879);
            return 1;
         } else if (var0 == 8017) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classTE var22 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               int var51 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classFK.method4819(var22, var51, (byte)-92);
               return 1;
            }
         } else if (8018 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               String var20 = (String)classBB.field328[1375698635 * classBB.field338];
               String var50 = (String)classBB.field328[1 + classBB.field338 * 1375698635];
               var20 = classUP.method11420(var20, User.method10179(-1124459322), classBB.field334, classBB.field333, (byte)0);
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classRK.method10013(var20, var50, 1581454780);
               return 1;
            }
         } else if (var0 == 8019) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               classTE var19 = classJM.method6398(classBB.field328[1375698635 * classBB.field338], null, 1578948926);
               String var49 = (String)classBB.field328[classBB.field338 * 1375698635 + 1];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classLI.method7107(var19, var49, -1434634203);
               return 1;
            }
         } else if (8020 == var0) {
            DynamicObject.field1679 -= 240082458;
            char var18 = (char)classBB.field323[DynamicObject.field1679 * -324749371];
            int var48 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
            EnumComposition var71 = classKD.method6461(var48, 1996266443);
            if (!EnumComposition.method8345(var71, var18, 1755902995)) {
               if (var3 <= 658009662) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else {
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var71.method8319((short)25818);
               return 1;
            }
         } else if (var0 == 8021) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var17 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var47 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
               EnumComposition var70 = classKD.method6461(var47, 1856902854);
               if (!var70.method8348((char)var17, (byte)-121)) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = EnumComposition.method8324(var70, (byte)27);
                  return 1;
               }
            }
         } else if (8022 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var16 = classBB.field323[-324749371 * DynamicObject.field1679];
            int var46 = classBB.field323[DynamicObject.field1679 * -324749371 + 1];
            int var69 = classBB.field323[DynamicObject.field1679 * -324749371 + 2];
            if (var69 < var46) {
               if (var3 <= 658009662) {
                  throw new IllegalStateException();
               }

               var69 = var46;
            }

            if (var46 >= 0) {
               if (var3 <= 658009662) {
                  throw new IllegalStateException();
               }

               if (var46 <= 5000) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  if (var69 >= 0) {
                     if (var69 <= 5000) {
                        if (var16 == 115) {
                           classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = new classTE(classYY.field7113, "", var46, var69);
                        } else {
                           if (var16 != 105) {
                              if (var3 <= 658009662) {
                                 throw new IllegalStateException();
                              }

                              if (var16 != 49) {
                                 classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = new classTE(classYY.field7111, -1, var46, var69);
                                 return 1;
                              }

                              if (var3 <= 658009662) {
                                 throw new IllegalStateException();
                              }
                           }

                           classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = new classTE(classYY.field7111, 0, var46, var69);
                        }

                        return 1;
                     }

                     if (var3 <= 658009662) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            throw new RuntimeException();
         } else if (var0 == 8023) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               int var15 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classTE var45 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               if (var15 >= 0) {
                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }

                  if (var15 <= 5000) {
                     var45.method10767(var15, 2106960168);
                     return 1;
                  }

                  if (var3 <= 658009662) {
                     throw new IllegalStateException();
                  }
               }

               throw new RuntimeException();
            }
         } else if (8024 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               int var14 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               Object var44 = classKN.method6500(var14, -237809439);
               classTE var68 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               classOB.method8300(var68, var68.method10756(-2120127156), var44, 1485267394);
               return 1;
            }
         } else if (8025 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var13 = classBB.field323[DynamicObject.field1679 * -324749371];
               int var43 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
               Object var67 = classKN.method6500(var43, 120265624);
               classTE var7 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               classOB.method8300(var7, var13, var67, 1917454547);
               return 1;
            }
         } else if (8026 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               int var12 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classTE var42 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               Object var66 = classLH.method7023(var42, var12, -418412397);
               classBD.method990(var42.field6128, var66, (byte)95);
               return 1;
            }
         } else if (var0 == 8027) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               classTE var11 = classJM.method6398(classBB.field328[1375698635 * classBB.field338], null, 1578948926);
               classTE var41 = classJM.method6398(classBB.field328[1375698635 * classBB.field338 + 1], null, 1578948926);
               classKU.method6566(var11, var41, var11.method10756(-1005920495), (byte)58);
               return 1;
            }
         } else if (var0 == 8028) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               int var10 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field338 -= -1849233978;
               classTE var40 = classJM.method6398(classBB.field328[classBB.field338 * 1375698635], null, 1578948926);
               classTE var65 = classJM.method6398(classBB.field328[1 + 1375698635 * classBB.field338], null, 1578948926);
               classKU.method6566(var40, var65, var10, (byte)55);
               return 1;
            }
         } else if (8029 == var0) {
            if (var3 <= 658009662) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var4 = classBB.field323[DynamicObject.field1679 * -324749371];
               int var5 = classBB.field323[1 + -324749371 * DynamicObject.field1679];
               classTE var6 = classJM.method6398(classBB.field328[(classBB.field338 -= 1222866659) * 1375698635], null, 1578948926);
               VarbitComposition.method9215(var6, var4, var5, 1487907647);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "fw.cs(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(DDII)[D")
   @ObfuscatedName("ae")
   public static double[] method5046(double var0, double var2, int var4, int var5) {
      try {
         int var6 = 1 + 2 * var4;
         double[] var7 = new double[var6];
         int var8 = -var4;

         for (int var9 = 0; var8 <= var4; var9++) {
            if (var5 != 224234046) {
               throw new IllegalStateException();
            }

            var7[var9] = classOL.method8509(var8, var0, var2);
            var8++;
         }

         return var7;
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "fw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llg;II)Llg;")
   @ObfuscatedName("ab")
   public static WidgetConfigNode method5064(WidgetConfigNode var0, int var1, int var2) {
      try {
         for (WidgetConfigNode var3 = var0; null != var3; var3 = var3.field4140) {
            if (var2 == -1907613182) {
               throw new IllegalStateException();
            }

            if (var1 >= 1443675333 * var3.field4134) {
               if (var2 == -1907613182) {
                  throw new IllegalStateException();
               }

               if (var1 <= var3.field4136 * -1057754721) {
                  if (var2 == -1907613182) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "fw.ab(" + ')');
      }
   }
}
