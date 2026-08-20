import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gl")
public class classGL extends classHA {
   @ToRemove(unused = "true")
   @ObfuscatedName("cl")
   static final int field2621 = 2000;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2618 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   public static final int field2620 = 33554432;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2619 = 1;

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("af")
   @Override
   void vmethod467(classXY var1, int var2) {
      try {
         this.field2752 = Math.min(this.field2752 * -1667236931, 4) * -765552747;
         this.field2758 = new short[1][64][64];
         this.field2759 = new short[-1667236931 * this.field2752][64][64];
         this.field2757 = new byte[-1667236931 * this.field2752][64][64];
         this.field2756 = new byte[this.field2752 * -1667236931][64][64];
         this.field2760 = new classHZ[this.field2752 * -1667236931][64][64][];

         for (int var3 = 0; var3 < 64; var3++) {
            if (var2 != -1811901292) {
               throw new IllegalStateException();
            }

            for (int var4 = 0; var4 < 64; var4++) {
               if (var2 != -1811901292) {
                  throw new IllegalStateException();
               }

               this.method5971(var3, var4, var1, (byte)7);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gl.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("bw")
   static int method5496(int var0, classBL var1, boolean var2, int var3) {
      try {
         if (3903 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var35 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = client.field864[var35].method7613(383438983);
               return 1;
            }
         } else if (3904 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var34 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = client.field864[var34].field4535 * 1561057361;
               return 1;
            }
         } else if (var0 == 3905) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var33 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = client.field864[var33].field4534 * -1718041163;
               return 1;
            }
         } else if (3906 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var32 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 29846541 * client.field864[var32].field4536;
               return 1;
            }
         } else if (3907 == var0) {
            int var31 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = client.field864[var31].field4537 * 834365773;
            return 1;
         } else if (var0 == 3908) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var30 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 464461553 * client.field864[var30].field4538;
               return 1;
            }
         } else if (3910 == var0) {
            int var29 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            int var46 = classMM.method7607(client.field864[var29], (short)3906);
            int[] var55 = classBB.field323;
            int var61 = (classDY.field1679 += 120041229) * -324749371 - 1;
            byte var67;
            if (var46 == 0) {
               if (var3 <= -53251402) {
                  throw new IllegalStateException();
               }

               var67 = 1;
            } else {
               var67 = 0;
            }

            var55[var61] = var67;
            return 1;
         } else if (var0 == 3911) {
            int var28 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            int var45 = classMM.method7607(client.field864[var28], (short)3906);
            int[] var54 = classBB.field323;
            int var60 = (classDY.field1679 += 120041229) * -324749371 - 1;
            byte var66;
            if (var45 == 2) {
               if (var3 <= -53251402) {
                  throw new IllegalStateException();
               }

               var66 = 1;
            } else {
               var66 = 0;
            }

            var54[var60] = var66;
            return 1;
         } else if (3912 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var27 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               int var44 = classMM.method7607(client.field864[var27], (short)3906);
               int[] var53 = classBB.field323;
               int var59 = (classDY.field1679 += 120041229) * -324749371 - 1;
               byte var65;
               if (5 == var44) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  var65 = 1;
               } else {
                  var65 = 0;
               }

               var53[var59] = var65;
               return 1;
            }
         } else if (3913 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var26 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               int var43 = classMM.method7607(client.field864[var26], (short)3906);
               int[] var52 = classBB.field323;
               int var58 = (classDY.field1679 += 120041229) * -324749371 - 1;
               byte var64;
               if (var43 == 1) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  var64 = 1;
               } else {
                  var64 = 0;
               }

               var52[var58] = var64;
               return 1;
            }
         } else if (var0 == 3914) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               boolean var51;
               if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  var51 = true;
               } else {
                  var51 = false;
               }

               boolean var25 = var51;
               if (null != classON.field4994) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  classON.field4994.method7730(classMV.field4606, var25, (byte)-108);
               }

               return 1;
            }
         } else if (3915 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               boolean var24 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1;
               if (null != classON.field4994) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  classON.field4994.method7730(classMV.field4605, var24, (byte)-12);
               }

               return 1;
            }
         } else if (var0 == 3916) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               boolean var50;
               if (1 == classBB.field323[-324749371 * classDY.field1679]) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  var50 = true;
               } else {
                  var50 = false;
               }

               boolean var23 = var50;
               boolean var42 = classBB.field323[1 + -324749371 * classDY.field1679] == 1;
               if (classON.field4994 != null) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  client.field829.field744 = var42;
                  classON.field4994.method7730(client.field829, var23, (byte)-54);
               }

               return 1;
            }
         } else if (var0 == 3917) {
            boolean var49;
            if (classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1) {
               if (var3 <= -53251402) {
                  throw new IllegalStateException();
               }

               var49 = true;
            } else {
               var49 = false;
            }

            boolean var22 = var49;
            if (null != classON.field4994) {
               if (var3 <= -53251402) {
                  throw new IllegalStateException();
               }

               classON.field4994.method7730(classMV.field4604, var22, (byte)-9);
            }

            return 1;
         } else if (3918 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               boolean var21 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371] == 1;
               if (null != classON.field4994) {
                  classON.field4994.method7730(classMV.field4607, var21, (byte)-128);
               }

               return 1;
            }
         } else if (3919 == var0) {
            int[] var48 = classBB.field323;
            int var57 = (classDY.field1679 += 120041229) * -324749371 - 1;
            int var63;
            if (classON.field4994 == null) {
               if (var3 <= -53251402) {
                  throw new IllegalStateException();
               }

               var63 = 0;
            } else {
               var63 = classON.field4994.field4608.size();
            }

            var48[var57] = var63;
            return 1;
         } else if (var0 == 3920) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var20 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classNM var41 = (classNM)classON.field4994.field4608.get(var20);
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var41.field4686 * -906797091;
               return 1;
            }
         } else if (var0 == 3921) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var19 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classNM var40 = (classNM)classON.field4994.field4608.get(var19);
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var40.method7889(985767106);
               return 1;
            }
         } else if (var0 == 3922) {
            int var18 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            classNM var39 = (classNM)classON.field4994.field4608.get(var18);
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var39.method7891(49193);
            return 1;
         } else if (3923 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var17 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classNM var38 = (classNM)classON.field4994.field4608.get(var17);
               long var6 = classDD.method2983(16711680) - classXO.field6905 - 4044309507405125089L * var38.field4687;
               int var8 = (int)(var6 / 3600000L);
               int var9 = (int)((var6 - var8 * 3600000) / 60000L);
               int var10 = (int)((var6 - 3600000 * var8 - 60000 * var9) / 1000L);
               String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var11;
               return 1;
            }
         } else if (var0 == 3924) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var16 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classNM var37 = (classNM)classON.field4994.field4608.get(var16);
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 29846541 * var37.field4685.field4536;
               return 1;
            }
         } else if (3925 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var15 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classNM var36 = (classNM)classON.field4994.field4608.get(var15);
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var36.field4685.field4534 * -1718041163;
               return 1;
            }
         } else if (var0 == 3926) {
            int var14 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            classNM var5 = (classNM)classON.field4994.field4608.get(var14);
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var5.field4685.field4535 * 1561057361;
            return 1;
         } else if (3931 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var13 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               int[] var47 = classBB.field323;
               int var56 = (classDY.field1679 += 120041229) * -324749371 - 1;
               byte var62;
               if (classOB.method8299(var13, (byte)-9).field5062) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  var62 = 1;
               } else {
                  var62 = 0;
               }

               var47[var56] = var62;
               return 1;
            }
         } else if (3939 == var0) {
            if (var3 <= -53251402) {
               throw new IllegalStateException();
            } else {
               int var4 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               int[] var10000 = classBB.field323;
               int var10001 = (classDY.field1679 += 120041229) * -324749371 - 1;
               byte var10002;
               if (classOB.method8299(var4, (byte)-99).field5063) {
                  if (var3 <= -53251402) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "gl.bw(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof classGL)) {
            return false;
         } else {
            classGL var2 = (classGL)var1;
            return var2.field2751 * 1151970023 == 1151970023 * this.field2751 && -456391909 * var2.field2750 == this.field2750 * -456391909;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gl.equals(" + ')');
      }
   }

   @Override
   public int hashCode() {
      try {
         return 1151970023 * this.field2751 | -456391909 * this.field2750 << 8;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "gl.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method5490(Object var1) {
      if (!(var1 instanceof classGL)) {
         return false;
      } else {
         classGL var2 = (classGL)var1;
         return var2.field2751 * 1151970023 == -1846640190 * this.field2751 && -456391909 * var2.field2750 == this.field2750 * 1360661892;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod468(classXY var1) {
      this.field2752 = Math.min(this.field2752 * -1667236931, 4) * -765552747;
      this.field2758 = new short[1][64][64];
      this.field2759 = new short[-1667236931 * this.field2752][64][64];
      this.field2757 = new byte[-1667236931 * this.field2752][64][64];
      this.field2756 = new byte[this.field2752 * -1667236931][64][64];
      this.field2760 = new classHZ[this.field2752 * -1667236931][64][64][];

      for (int var2 = 0; var2 < 64; var2++) {
         for (int var3 = 0; var3 < 64; var3++) {
            this.method5971(var2, var3, var1, (byte)30);
         }
      }
   }

   classGL() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgl;Ljava/lang/Object;)Z")
   @ObfuscatedName("eh")
   public static boolean method5491(classGL var0, Object var1) {
      if (var0 == null) {
         var0.hashCode();
      }

      if (!(var1 instanceof classGL)) {
         return false;
      } else {
         classGL var2 = (classGL)var1;
         return var2.field2751 * 1151970023 == 1151970023 * var0.field2751 && -456391909 * var2.field2750 == var0.field2750 * -456391909;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod466(classXY var1) {
      this.field2752 = Math.min(this.field2752 * 253916772, 4) * -2127495599;
      this.field2758 = new short[1][64][242678375];
      this.field2759 = new short[636747538 * this.field2752][-830239501][-540901328];
      this.field2757 = new byte[1161657485 * this.field2752][-1863139155][1036939809];
      this.field2756 = new byte[this.field2752 * -1849630180][64][1936799418];
      this.field2760 = new classHZ[this.field2752 * -1667236931][64][-2017750099][];

      for (int var2 = 0; var2 < -1463417767; var2++) {
         for (int var3 = 0; var3 < 2061948163; var3++) {
            this.method5971(var2, var3, var1, (byte)-5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afh")
   public int method5492() {
      return 1151970023 * this.field2751 | -456391909 * this.field2750 << 8;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afe")
   public int method5493() {
      return 1151970023 * this.field2751 | -456391909 * this.field2750 << 8;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method5494() {
      return 1151970023 * this.field2751 | -456391909 * this.field2750 << 8;
   }

   @ObfuscatedSignature(descriptor = "(Lgl;Lxy;I)V")
   @ObfuscatedName("va")
   public static void method5487(classGL var0, classXY var1, int var2) {
      if (var0 == null) {
         var0.method5488(var1, var2);
      } else {
         try {
            int var3 = classXY.method13039(var1, -346779531);
            if (classHI.field2802.field2801 * 1177860011 != var3) {
               if (var2 == -1462911970) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               var0.field2753 = classXY.method13039(var1, -346779531) * -2015926021;
               var0.field2752 = classXY.method13039(var1, -346779531) * -765552747;
               var0.field2754 = classXY.method13047(var1, -1098287353) * -735630941;
               var0.field2755 = classXY.method13047(var1, 1575481484) * -1209921667;
               var0.field2751 = classXY.method13047(var1, 481720397) * -1652832041;
               var0.field2750 = classXY.method13047(var1, -1142101059) * -1381327085;
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "gl.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afs")
   public int method5495() {
      return -1735244143 * this.field2751 | -28135619 * this.field2750 << 8;
   }

   @ObfuscatedSignature(descriptor = "(Lsu;FB)F")
   @ObfuscatedName("az")
   static float method5489(classSU var0, float var1, byte var2) {
      try {
         if (null != var0) {
            if (var2 != 127) {
               throw new IllegalStateException();
            }

            if (var0.method10685((byte)-26) != 0) {
               if (var1 < var0.field6068[0].field6103 * 1210377865) {
                  if (var2 != 127) {
                     throw new IllegalStateException();
                  }

                  if (var0.field6063 == classSE.field5911) {
                     if (var2 != 127) {
                        throw new IllegalStateException();
                     }

                     return var0.field6068[0].field6102;
                  }

                  return classPP.method9087(var0, var1, true, (byte)1);
               }

               if (var1 > var0.field6068[var0.method10685((byte)-120) - 1].field6103 * 1210377865) {
                  if (var2 != 127) {
                     throw new IllegalStateException();
                  }

                  if (classSE.field5911 == var0.field6062) {
                     if (var2 != 127) {
                        throw new IllegalStateException();
                     }

                     return var0.field6068[var0.method10685((byte)-99) - 1].field6102;
                  }

                  return classPP.method9087(var0, var1, false, (byte)1);
               }

               if (var0.field6065) {
                  if (var2 != 127) {
                     throw new IllegalStateException();
                  }

                  return var0.field6068[0].field6102;
               }

               classSY var3 = var0.method10682(var1, 1391304917);
               boolean var4 = false;
               boolean var5 = false;
               if (null != var3) {
                  if (var2 != 127) {
                     throw new IllegalStateException();
                  }

                  if (0.0F == var3.field6098 && var3.field6100 == 0.0F) {
                     if (var2 != 127) {
                        throw new IllegalStateException();
                     }

                     var4 = true;
                  } else {
                     label258: {
                        if (var3.field6098 == Float.MAX_VALUE) {
                           if (var2 != 127) {
                              throw new IllegalStateException();
                           }

                           if (Float.MAX_VALUE == var3.field6100) {
                              if (var2 != 127) {
                                 throw new IllegalStateException();
                              }

                              var5 = true;
                              break label258;
                           }
                        }

                        if (null != var3.field6104) {
                           if (var2 != 127) {
                              throw new IllegalStateException();
                           }

                           if (var0.field6045) {
                              if (var2 != 127) {
                                 throw new IllegalStateException();
                              }

                              float var6 = var3.field6103 * 1210377865;
                              float var10 = var3.field6102;
                              float var7 = 0.33333334F * var3.field6098 + var6;
                              float var11 = var3.field6100 * 0.33333334F + var10;
                              float var9 = var3.field6104.field6103 * 1210377865;
                              float var13 = var3.field6104.field6102;
                              float var8 = var9 - 0.33333334F * var3.field6104.field6101;
                              float var12 = var13 - 0.33333334F * var3.field6104.field6099;
                              if (var0.field6064) {
                                 classBS.method1220(var0, var6, var7, var8, var9, var10, var11, var12, var13, (byte)-94);
                              } else if (var0 == null) {
                                 if (var2 != 127) {
                                    throw new IllegalStateException();
                                 }
                              } else {
                                 var0.field6057 = var6;
                                 float var14 = var9 - var6;
                                 float var15 = var13 - var10;
                                 float var16 = var7 - var6;
                                 float var17 = 0.0F;
                                 float var18 = 0.0F;
                                 if (0.0F != var16) {
                                    if (var2 != 127) {
                                       throw new IllegalStateException();
                                    }

                                    var17 = (var11 - var10) / var16;
                                 }

                                 var16 = var9 - var8;
                                 if (0.0F != var16) {
                                    if (var2 != 127) {
                                       throw new IllegalStateException();
                                    }

                                    var18 = (var13 - var12) / var16;
                                 }

                                 float var19 = 1.0F / (var14 * var14);
                                 float var20 = var14 * var17;
                                 float var21 = var14 * var18;
                                 var0.field6047 = var19 * (var20 + var21 - var15 - var15) / var14;
                                 var0.field6052 = (var15 + (var15 + var15) - var20 - var20 - var21) * var19;
                                 var0.field6051 = var17;
                                 var0.field6050 = var10;
                              }

                              var0.field6045 = false;
                           }
                        } else {
                           var4 = true;
                        }
                     }
                  }

                  if (var4) {
                     if (var2 != 127) {
                        throw new IllegalStateException();
                     }

                     return var3.field6102;
                  }

                  if (var5) {
                     if (var2 != 127) {
                        throw new IllegalStateException();
                     }

                     if (var1 != var3.field6103 * 1210377865) {
                        if (var2 != 127) {
                           throw new IllegalStateException();
                        }

                        if (var3.field6104 != null) {
                           return var3.field6104.field6102;
                        }

                        if (var2 != 127) {
                           throw new IllegalStateException();
                        }
                     }

                     return var3.field6102;
                  }

                  if (var0.field6064) {
                     if (var2 != 127) {
                        throw new IllegalStateException();
                     }

                     float var24;
                     if (var0 == null) {
                        if (var2 != 127) {
                           throw new IllegalStateException();
                        }

                        var24 = 0.0F;
                     } else {
                        float var26;
                        if (var1 == var0.field6057) {
                           if (var2 != 127) {
                              throw new IllegalStateException();
                           }

                           var26 = 0.0F;
                        } else if (var1 == var0.field6048) {
                           if (var2 != 127) {
                              throw new IllegalStateException();
                           }

                           var26 = 1.0F;
                        } else {
                           var26 = (var1 - var0.field6057) / (var0.field6048 - var0.field6057);
                        }

                        float var27;
                        if (var0.field6066) {
                           var27 = var26;
                        } else {
                           float[] var28 = new float[4];
                           var28[3] = var0.field6050;
                           var28[2] = var0.field6051;
                           var28[1] = var0.field6052;
                           var28[0] = var0.field6047 - var26;
                           float[] var29 = new float[5];
                           int var30 = classEL.method3916(var28, 3, 0.0F, true, 1.0F, true, var29, -401031406);
                           if (var30 == 1) {
                              if (var2 != 127) {
                                 throw new IllegalStateException();
                              }

                              var27 = var29[0];
                           } else {
                              var27 = 0.0F;
                           }
                        }

                        var24 = var0.field6058 + var27 * (var27 * (var0.field6053 * var27 + var0.field6049) + var0.field6054);
                     }

                     return var24;
                  }

                  float var23;
                  if (var0 == null) {
                     if (var2 != 127) {
                        throw new IllegalStateException();
                     }

                     var23 = 0.0F;
                  } else {
                     float var25 = var1 - var0.field6057;
                     var23 = var0.field6050 + (var0.field6051 + var25 * (var0.field6047 * var25 + var0.field6052)) * var25;
                  }

                  return var23;
               }

               return 0.0F;
            }

            if (var2 != 127) {
               throw new IllegalStateException();
            }
         }

         return 0.0F;
      } catch (RuntimeException var22) {
         throw classEG.method3884(var22, "gl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   void method5488(classXY var1, int var2) {
      try {
         int var3 = classXY.method13039(var1, -346779531);
         if (classHI.field2803.field2801 * 1177860011 != var3) {
            if (var2 == -1462911970) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            super.field2752 = classXY.method13039(var1, -346779531) * -2015926021;
            super.field2754 = classXY.method13039(var1, -346779531) * -765552747;
            super.field2753 = classXY.method13047(var1, -1098287353) * -735630941;
            super.field2753 = classXY.method13047(var1, 1575481484) * -1209921667;
            super.field2755 = classXY.method13047(var1, 481720397) * -1652832041;
            this.field2750 = classXY.method13047(var1, -1142101059) * -1381327085;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gl.az(" + ')');
      }
   }
}
