import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("um")
public class classUM {
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("av")
   public static final classUM field6350 = new classUM(21);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("af")
   public static final classUM field6332 = new classUM(0);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ae")
   public static final classUM field6331 = new classUM(1);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ab")
   public static final classUM field6341 = new classUM(2);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("aq")
   public static final classUM field6345 = new classUM(12);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("as")
   public static final classUM field6334 = new classUM(4);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("az")
   static final classUM field6329 = new classUM(255);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ac")
   public static final classUM field6336 = new classUM(6);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ad")
   public static final classUM field6343 = new classUM(13);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ao")
   public static final classUM field6338 = new classUM(8);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("al")
   public static final classUM field6342 = new classUM(9);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("am")
   static final classUM field6351 = new classUM(24);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ay")
   public static final classUM field6353 = new classUM(11);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ai")
   public static final classUM field6346 = new classUM(17);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ax")
   public static final classUM field6335 = new classUM(5);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("aj")
   public static final classUM field6344 = new classUM(10);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("au")
   public static final classUM field6339 = new classUM(15);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("aa")
   public static final classUM field6337 = new classUM(7);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ar")
   public static final classUM field6354 = new classUM(18);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("aw")
   public static final classUM field6348 = new classUM(19);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ak")
   public static final classUM field6330 = new classUM(20);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ap")
   public static final classUM field6340 = new classUM(14);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ag")
   public static final classUM field6333 = new classUM(3);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("an")
   public static final classUM field6352 = new classUM(23);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("at")
   public static final classUM field6347 = new classUM(22);
   @ObfuscatedSignature(descriptor = "Lum;")
   @ObfuscatedName("ah")
   static final classUM field6349 = new classUM(25);
   @ObfuscatedName("bn")
   public final int field6328;

   classUM(int var1) {
      this.field6328 = var1 * -596577535;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;IIIIII)V")
   @ObfuscatedName("no")
   public static void method11409(SpritePixels var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method13558(var1, var1, var1, var1, var1, var1);
      } else if (var6 != 0) {
         var1 -= var0.field7010 << 4;
         var2 -= var0.field7011 << 4;
         double var7 = (var5 & 974219364) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((var0.field7007 << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((var0.field7007 << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((var0.field7009 << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((var0.field7009 << 4) - var2) * var10;
         int var17 = ((var0.field7007 << 4) - var1) * var10 + ((var0.field7009 << 4) - var2) * var9;
         int var18 = -((var0.field7007 << 4) - var1) * var9 + ((var0.field7009 << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + -19488099 >> 12;
         var21 >>= 12;
         var22 = var22 + 769021359 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < SpritePixels.field7097) {
            var19 = SpritePixels.field7097;
         }

         if (var20 > SpritePixels.field7099) {
            var20 = SpritePixels.field7099;
         }

         if (var21 < SpritePixels.field7096) {
            var21 = SpritePixels.field7096;
         }

         if (var22 > SpritePixels.field7098) {
            var22 = SpritePixels.field7098;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * SpritePixels.field7102 + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var33 = var22; var33 < 0; var23 += SpritePixels.field7102) {
                        int var34 = var23;
                        int var35 = var30;
                        int var36 = var31;
                        int var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (var0.field7007 << 12) < 0 && var31 - (var0.field7009 << 12) < 0) {
                           for (; var37 < 0; var37++) {
                              int var38 = var0.field7005[(var36 >> 12) * var0.field7007 + (var35 >> 12)];
                              if (var38 != 0) {
                                 SpritePixels.field7104[var34++] = var38;
                              } else {
                                 var34++;
                              }
                           }
                        }

                        var33++;
                     }
                  } else if (var26 < 0) {
                     for (int var84 = var22; var84 < 0; var23 += SpritePixels.field7102) {
                        int var92 = var23;
                        int var100 = var30;
                        int var108 = var31 + (var28 * var26 >> 4);
                        int var116 = var20;
                        if (var30 >= 0 && var30 - (var0.field7007 << 12) < 0) {
                           int var32;
                           if ((var32 = var108 - (var0.field7009 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var116 = var20 + var32;
                              var108 += var26 * var32;
                              var92 = var23 + var32;
                           }

                           if ((var32 = (var108 - var26) / var26) > var116) {
                              var116 = var32;
                           }

                           while (var116 < 0) {
                              int var124 = var0.field7005[(var108 >> 12) * var0.field7007 + (var100 >> 12)];
                              if (var124 != 0) {
                                 SpritePixels.field7104[var92++] = var124;
                              } else {
                                 var92++;
                              }

                              var108 += var26;
                              var116++;
                           }
                        }

                        var84++;
                        var30 -= var26;
                     }
                  } else {
                     for (int var85 = var22; var85 < 0; var23 += SpritePixels.field7102) {
                        int var93 = var23;
                        int var101 = var30;
                        int var109 = var31 + (var28 * var26 >> 4);
                        int var117 = var20;
                        if (var30 >= 0 && var30 - (var0.field7007 << 12) < 0) {
                           if (var109 < 0) {
                              int var57 = (var26 - 1 - var109) / var26;
                              var117 = var20 + var57;
                              var109 += var26 * var57;
                              var93 = var23 + var57;
                           }

                           int var58;
                           if ((var58 = (1 + var109 - (var0.field7009 << 12) - var26) / var26) > var117) {
                              var117 = var58;
                           }

                           while (var117 < 0) {
                              int var125 = var0.field7005[(var109 >> 12) * var0.field7007 + (var101 >> 12)];
                              if (var125 != 0) {
                                 SpritePixels.field7104[var93++] = var125;
                              } else {
                                 var93++;
                              }

                              var109 += var26;
                              var117++;
                           }
                        }

                        var85++;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for (int var86 = var22; var86 < 0; var23 += SpritePixels.field7102) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31;
                        int var118 = var20;
                        if (var31 >= 0 && var31 - (var0.field7009 << 12) < 0) {
                           int var59;
                           if ((var59 = var102 - (var0.field7007 << 12)) >= 0) {
                              var59 = (var27 - var59) / var27;
                              var118 = var20 + var59;
                              var102 += var27 * var59;
                              var94 = var23 + var59;
                           }

                           if ((var59 = (var102 - var27) / var27) > var118) {
                              var118 = var59;
                           }

                           while (var118 < 0) {
                              int var126 = var0.field7005[(var110 >> 12) * var0.field7007 + (var102 >> 12)];
                              if (var126 != 0) {
                                 SpritePixels.field7104[var94++] = var126;
                              } else {
                                 var94++;
                              }

                              var102 += var27;
                              var118++;
                           }
                        }

                        var86++;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for (int var87 = var22; var87 < 0; var23 += SpritePixels.field7102) {
                        int var95 = var23;
                        int var103 = var30 + (var28 * var27 >> 4);
                        int var111 = var31 + (var28 * var26 >> 4);
                        int var119 = var20;
                        int var62;
                        if ((var62 = var103 - (var0.field7007 << 12)) >= 0) {
                           var62 = (var27 - var62) / var27;
                           var119 = var20 + var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 = var23 + var62;
                        }

                        if ((var62 = (var103 - var27) / var27) > var119) {
                           var119 = var62;
                        }

                        if ((var62 = var111 - (var0.field7009 << 12)) >= 0) {
                           var62 = (var26 - var62) / var26;
                           var119 += var62;
                           var103 += var27 * var62;
                           var111 += var26 * var62;
                           var95 += var62;
                        }

                        if ((var62 = (var111 - var26) / var26) > var119) {
                           var119 = var62;
                        }

                        while (var119 < 0) {
                           int var127 = var0.field7005[(var111 >> 12) * var0.field7007 + (var103 >> 12)];
                           if (var127 != 0) {
                              SpritePixels.field7104[var95++] = var127;
                           } else {
                              var95++;
                           }

                           var103 += var27;
                           var111 += var26;
                           var119++;
                        }

                        var87++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for (int var88 = var22; var88 < 0; var23 += SpritePixels.field7102) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31 + (var28 * var26 >> 4);
                        int var120 = var20;
                        int var68;
                        if ((var68 = var104 - (var0.field7007 << 12)) >= 0) {
                           var68 = (var27 - var68) / var27;
                           var120 = var20 + var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 = var23 + var68;
                        }

                        if ((var68 = (var104 - var27) / var27) > var120) {
                           var120 = var68;
                        }

                        if (var112 < 0) {
                           var68 = (var26 - 1 - var112) / var26;
                           var120 += var68;
                           var104 += var27 * var68;
                           var112 += var26 * var68;
                           var96 += var68;
                        }

                        if ((var68 = (1 + var112 - (var0.field7009 << 12) - var26) / var26) > var120) {
                           var120 = var68;
                        }

                        while (var120 < 0) {
                           int var128 = var0.field7005[(var112 >> 12) * var0.field7007 + (var104 >> 12)];
                           if (var128 != 0) {
                              SpritePixels.field7104[var96++] = var128;
                           } else {
                              var96++;
                           }

                           var104 += var27;
                           var112 += var26;
                           var120++;
                        }

                        var88++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for (int var89 = var22; var89 < 0; var23 += SpritePixels.field7102) {
                     int var97 = var23;
                     int var105 = var30 + (var28 * var27 >> 4);
                     int var113 = var31;
                     int var121 = var20;
                     if (var31 >= 0 && var31 - (var0.field7009 << 12) < 0) {
                        if (var105 < 0) {
                           int var73 = (var27 - 1 - var105) / var27;
                           var121 = var20 + var73;
                           var105 += var27 * var73;
                           var97 = var23 + var73;
                        }

                        int var74;
                        if ((var74 = (1 + var105 - (var0.field7007 << 12) - var27) / var27) > var121) {
                           var121 = var74;
                        }

                        while (var121 < 0) {
                           int var129 = var0.field7005[(var113 >> 12) * var0.field7007 + (var105 >> 12)];
                           if (var129 != 0) {
                              SpritePixels.field7104[var97++] = var129;
                           } else {
                              var97++;
                           }

                           var105 += var27;
                           var121++;
                        }
                     }

                     var89++;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for (int var90 = var22; var90 < 0; var23 += SpritePixels.field7102) {
                     int var98 = var23;
                     int var106 = var30 + (var28 * var27 >> 4);
                     int var114 = var31 + (var28 * var26 >> 4);
                     int var122 = var20;
                     if (var106 < 0) {
                        int var75 = (var27 - 1 - var106) / var27;
                        var122 = var20 + var75;
                        var106 += var27 * var75;
                        var114 += var26 * var75;
                        var98 = var23 + var75;
                     }

                     int var76;
                     if ((var76 = (1 + var106 - (var0.field7007 << 12) - var27) / var27) > var122) {
                        var122 = var76;
                     }

                     if ((var76 = var114 - (var0.field7009 << 12)) >= 0) {
                        var76 = (var26 - var76) / var26;
                        var122 += var76;
                        var106 += var27 * var76;
                        var114 += var26 * var76;
                        var98 += var76;
                     }

                     if ((var76 = (var114 - var26) / var26) > var122) {
                        var122 = var76;
                     }

                     while (var122 < 0) {
                        int var130 = var0.field7005[(var114 >> 12) * var0.field7007 + (var106 >> 12)];
                        if (var130 != 0) {
                           SpritePixels.field7104[var98++] = var130;
                        } else {
                           var98++;
                        }

                        var106 += var27;
                        var114 += var26;
                        var122++;
                     }

                     var90++;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for (int var91 = var22; var91 < 0; var23 += SpritePixels.field7102) {
                     int var99 = var23;
                     int var107 = var30 + (var28 * var27 >> 4);
                     int var115 = var31 + (var28 * var26 >> 4);
                     int var123 = var20;
                     if (var107 < 0) {
                        int var80 = (var27 - 1 - var107) / var27;
                        var123 = var20 + var80;
                        var107 += var27 * var80;
                        var115 += var26 * var80;
                        var99 = var23 + var80;
                     }

                     int var81;
                     if ((var81 = (1 + var107 - (var0.field7007 << 12) - var27) / var27) > var123) {
                        var123 = var81;
                     }

                     if (var115 < 0) {
                        var81 = (var26 - 1 - var115) / var26;
                        var123 += var81;
                        var107 += var27 * var81;
                        var115 += var26 * var81;
                        var99 += var81;
                     }

                     if ((var81 = (1 + var115 - (var0.field7009 << 12) - var26) / var26) > var123) {
                        var123 = var81;
                     }

                     while (var123 < 0) {
                        int var131 = var0.field7005[(var115 >> 12) * var0.field7007 + (var107 >> 12)];
                        if (var131 != 0) {
                           SpritePixels.field7104[var99++] = var131;
                        } else {
                           var99++;
                        }

                        var107 += var27;
                        var115 += var26;
                        var123++;
                     }

                     var91++;
                     var30 -= var26;
                     var31 += var27;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lef;)V")
   @ObfuscatedName("ze")
   public static void method11407(classEF var0) {
      classSG[] var1 = var0.field1745;

      for (int var2 = 0; var2 < var1.length; var2++) {
         classSG var3 = var1[var2];
         if (-521703669 * var3.field5924 >= 0) {
            var3.field5929 = var0.field1745[var3.field5924 * -521703669];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IILup;Lkh;I)V")
   @ObfuscatedName("ae")
   static void method11408(WorldView var0, int var1, int var2, classUP var3, classKH var4, int var5) {
      try {
         for (int var6 = 0; var6 < classZH.method14003(var0.field1697, (byte)10); var6++) {
            NPC var7 = (NPC)var0.field1698.method13404(var0.field1697.method14001(var6, 1956621640));
            if (var7 != null) {
               if (var5 <= -213891969) {
                  throw new IllegalStateException();
               }

               if (var7.vmethod262((byte)94)) {
                  classPL var8 = var7.definition;
                  if (null != var8) {
                     if (var5 <= -213891969) {
                        throw new IllegalStateException();
                     }

                     if (null != var8.field5325) {
                        if (var5 <= -213891969) {
                           return;
                        }

                        var8 = var8.method8955(652890385);
                     }
                  }

                  if (null != var8) {
                     if (var5 <= -213891969) {
                        return;
                     }

                     if (var8.field5319) {
                        if (var5 <= -213891969) {
                           throw new IllegalStateException();
                        }

                        if (var8.field5326) {
                           if (var5 <= -213891969) {
                              throw new IllegalStateException();
                           }

                           classUZ var9 = classYY.method13790(var0, -1547553299 * var7.field1487, -1272026483 * var7.field1489, (byte)121);
                           int var10 = (int)var9.field6427;
                           int var11 = (int)var9.field6426;
                           classUZ.method11727(var9, 1821141675);
                           int var12 = var10 / 32 - client.field962 * 2106329293 / 32;
                           int var13 = var11 / 32 - client.field986 * -2126074583 / 32;
                           classBO.method1165(var1, var2, var12, var13, var3, classPE.field5234[1], var4, (byte)103);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.newRunException(var14, "um.ae(" + ')');
      }
   }
}
