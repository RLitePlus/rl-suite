import java.awt.event.WindowEvent;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gd")
public class classGD implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final String field2565 = "arrayValues";
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field2564 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2563 = 13;

   @ObfuscatedSignature(descriptor = "(Lgw;Lgw;)I")
   @ObfuscatedName("af")
   int method5391(classGW var1, classGW var2) {
      return classGW.method5817(var1, 1727743530) - classGW.method5817(var2, 1727743530);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgd;Ljava/lang/Object;)Z")
   @ObfuscatedName("vf")
   public static boolean method5396(classGD var0, Object var1) {
      return var0 == null ? var0.method5398(var1) : var0.equals(var1);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gd.equals(" + ')');
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method5393((classGW)var1, (classGW)var2, -1506650830);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gd.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method5397(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method5394(Object var1, Object var2) {
      return this.method5393((classGW)var1, (classGW)var2, -566270256);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method5395(Object var1, Object var2) {
      return this.method5393((classGW)var1, (classGW)var2, -858395083);
   }

   classGD() {
   }

   @ObfuscatedSignature(descriptor = "(Lgw;Lgw;)I")
   @ObfuscatedName("ae")
   int method5392(classGW var1, classGW var2) {
      return classGW.method5817(var1, 1727743530) - classGW.method5817(var2, 1727743530);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("cd")
   public static void method5400(classTQ var0, WindowEvent var1) {
      if (var0 == null) {
         var0.method11021();
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("aa")
   static int method5401(int var0, classBL var1, boolean var2, byte var3) {
      try {
         if (var0 == 100) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 480164916;
               int var38 = classBB.field323[classDY.field1679 * -324749371];
               int var58 = classBB.field323[-324749371 * classDY.field1679 + 1];
               int var73 = classBB.field323[classDY.field1679 * -324749371 + 2];
               boolean var120;
               if (classBB.field323[classDY.field1679 * -324749371 + 3] != 0) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var120 = true;
               } else {
                  var120 = false;
               }

               boolean var86 = var120;
               if (var73 < 0) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  classLW var98 = classLY.method7375(classWK.field6691, var38, (byte)69);
                  if (-1510882375 * var98.field4375 != 0) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     classLJ.method7115(var98, var73, var86, var1, -638889179);
                     classLW var102 = new classLW();
                     var102.field4375 = var58 * 685068937;
                     var102.field4342 = (var102.field4329 = 1 * var98.field4329) * 498391781;
                     var102.field4260 = -1612510305 * var73;
                     var102.field4275 = true;
                     if (12 == var58) {
                        classCH.method1502(var102, 1913412174);
                     }

                     var98.field4340[var73] = var102;
                     if (var2) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        classSZ.field6110 = var102;
                     } else {
                        classDL.field1558 = var102;
                     }

                     return 1;
                  }
               }
            }
         } else if (var0 == 101) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var119;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var119 = classSZ.field6110;
               } else {
                  var119 = classDL.field1558;
               }

               classLW var37 = var119;
               classLW var57 = classLY.method7375(classWK.field6691, var37.field4329 * -1163656551, (byte)38);
               classDM.method3434(var37, var57, (byte)-121);
               return 1;
            }
         } else if (102 == var0) {
            classDY.field1679 -= 120041229;
            int var36 = classBB.field323[classDY.field1679 * -324749371];
            classLW var56 = classLY.method7375(classWK.field6691, var36, (byte)36);
            var56.field4340 = null;
            return 1;
         } else if (105 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 360123687;
               int var35 = classBB.field323[-324749371 * classDY.field1679];
               int var55 = classBB.field323[1 + -324749371 * classDY.field1679];
               int var72 = classBB.field323[2 + -324749371 * classDY.field1679];
               classLW var85 = classLY.method7375(classWK.field6691, var35, (byte)82);
               classLW var97 = classLY.method7378(classWK.field6691, var35, var55, (byte)-111);
               if (null == var85) {
                  throw new RuntimeException("");
               } else if (var55 < 0) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else if (var97 == null) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else if (0 == -1510882375 * var97.field4375) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  classLJ.method7115(var85, var72, true, var1, -2009486689);
                  if (var97.field4263 * 653784551 != -1) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }

                     classLW var100 = classLY.method7378(classWK.field6691, var35, 653784551 * var97.field4263, (byte)-55);
                     classOB.method8301(var100, var72, 427421377);
                  }

                  classLW var101 = new classLW(var97);
                  var101.field4260 = -1612510305 * var72;
                  if (var97.field4375 * -1510882375 == 12) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }

                     classCH.method1502(var101, 2035816772);
                  }

                  var85.field4340[var72] = var101;
                  if (var2) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }

                     classSZ.field6110 = var101;
                  } else {
                     classDL.field1558 = var101;
                  }

                  return 1;
               }
            }
         } else if (106 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               int var34 = classBB.field323[-324749371 * classDY.field1679];
               int var54 = classBB.field323[1 + -324749371 * classDY.field1679];
               classLW var118;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var118 = classSZ.field6110;
               } else {
                  var118 = classDL.field1558;
               }

               classLW var71 = var118;
               if (var71 == null) {
                  throw new RuntimeException("");
               } else {
                  classLW var84 = classLY.method7375(classWK.field6691, var71.field4342 * -1502647899, (byte)81);
                  if (-1510882375 * var71.field4375 != 0) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else if (0 != -1510882375 * var84.field4375) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException();
                     }
                  } else {
                     classLJ.method7115(var84, var54, true, var1, -1208316653);
                     classOB.method8301(var71, var54, 427421377);
                     classLW var96 = new classLW();
                     var96.field4375 = 685068937 * var34;
                     var96.field4342 = (var96.field4329 = 1 * var84.field4329) * 498391781;
                     var96.field4263 = -355527991 * var71.field4260;
                     var96.field4260 = var54 * -1612510305;
                     var96.field4275 = true;
                     if (12 == var34) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        classCH.method1502(var96, 2036539711);
                     }

                     var84.field4340[var54] = var96;
                     if (var2) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        classSZ.field6110 = var96;
                     } else {
                        classDL.field1558 = var96;
                     }

                     return 1;
                  }
               }
            }
         } else if (107 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               int var33 = classBB.field323[-324749371 * classDY.field1679];
               int var53 = classBB.field323[1 + classDY.field1679 * -324749371];
               classLW var70 = var2 ? classSZ.field6110 : classDL.field1558;
               if (null == var70) {
                  throw new RuntimeException("");
               } else {
                  classLW var83 = classLY.method7378(classWK.field6691, var70.field4342 * -1502647899, var70.field4263 * 653784551, (byte)-43);
                  classLW var95 = classLY.method7375(classWK.field6691, -1502647899 * var83.field4342, (byte)87);
                  if (var83.field4375 * -1510882375 != 0) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else if (0 != -1510882375 * var95.field4375) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException();
                     }
                  } else {
                     classLJ.method7115(var95, var53, true, var1, -928596172);
                     classOB.method8301(var83, var53, 427421377);
                     classLW var99 = new classLW();
                     var99.field4375 = var33 * 685068937;
                     var99.field4342 = (var99.field4329 = var95.field4329 * 1) * 498391781;
                     var99.field4263 = -355527991 * var83.field4260;
                     var99.field4260 = -1612510305 * var53;
                     var99.field4275 = true;
                     if (var33 == 12) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        classCH.method1502(var99, 1934338583);
                     }

                     var95.field4340[var53] = var99;
                     if (var2) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        classSZ.field6110 = var99;
                     } else {
                        classDL.field1558 = var99;
                     }

                     return 1;
                  }
               }
            }
         } else if (var0 == 200) {
            classDY.field1679 -= 240082458;
            int var32 = classBB.field323[classDY.field1679 * -324749371];
            int var52 = classBB.field323[classDY.field1679 * -324749371 + 1];
            classLW var117;
            if (var52 != -1) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               }

               var117 = classLY.method7378(classWK.field6691, var32, var52, (byte)-95);
            } else {
               var117 = null;
            }

            classLW var69 = var117;
            client.method1677(var69, var2, 2004250802);
            return 1;
         } else if (var0 == 201) {
            client.method1677(
               classLY.method7375(classWK.field6691, classBB.field323[(classDY.field1679 -= 120041229) * -324749371], (byte)127), var2, 2040822688
            );
            return 1;
         } else if (var0 == 204) {
            classLW var115;
            if (var2) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               }

               var115 = classSZ.field6110;
            } else {
               var115 = classDL.field1558;
            }

            classLW var31 = var115;
            if (var31 != null) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               }

               var115 = classLY.method7378(classWK.field6691, var31.field4342 * -1502647899, 653784551 * var31.field4263, (byte)-84);
            } else {
               var115 = null;
            }

            classLW var51 = var115;
            client.method1677(var51, var2, 432407076);
            return 1;
         } else if (205 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var113;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var113 = classSZ.field6110;
               } else {
                  var113 = classDL.field1558;
               }

               classLW var30 = var113;
               if (var30 != null) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var113 = classLY.method7375(classWK.field6691, -1502647899 * var30.field4342, (byte)61);
               } else {
                  var113 = null;
               }

               classLW var50 = var113;
               client.method1677(var50, var2, -388685280);
               return 1;
            }
         } else if (206 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var112;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var112 = classSZ.field6110;
               } else {
                  var112 = classDL.field1558;
               }

               classLW var29 = var112;
               if (null == var29) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  }
               } else if (63131743 * var29.field4260 == -1) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  }
               } else {
                  classLW var49 = classLY.method7375(classWK.field6691, var29.field4342 * -1502647899, (byte)120);
                  classLW var68 = null;

                  for (int var82 = 1 + 63131743 * var29.field4260; var82 < var49.field4340.length; var82++) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }

                     classLW var94 = var49.field4340[var82];
                     if (null == var94) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }
                     } else if (var94.field4263 * 653784551 == var29.field4263 * 653784551) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        var68 = var94;
                        break;
                     }
                  }

                  client.method1677(var68, var2, 2135693016);
                  return 1;
               }
            }
         } else if (207 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var111;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var111 = classSZ.field6110;
               } else {
                  var111 = classDL.field1558;
               }

               classLW var28 = var111;
               if (var28 == null) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  }
               } else if (var28.field4260 * 63131743 == -1) {
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                  return 1;
               } else {
                  classLW var48 = classLY.method7375(classWK.field6691, var28.field4342 * -1502647899, (byte)90);
                  classLW var67 = null;

                  for (int var81 = 63131743 * var28.field4260 - 1; var81 >= 0; var81--) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }

                     classLW var93 = var48.field4340[var81];
                     if (var93 == null) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }
                     } else if (653784551 * var28.field4263 == 653784551 * var93.field4263) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        var67 = var93;
                        break;
                     }
                  }

                  client.method1677(var67, var2, 243307377);
                  return 1;
               }
            }
         } else if (208 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var110;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var110 = classSZ.field6110;
               } else {
                  var110 = classDL.field1558;
               }

               classLW var27 = var110;
               if (null == var27) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  }
               } else if (var27.field4375 * -1510882375 != 0) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  }
               } else {
                  classLW var47 = classLY.method7375(classWK.field6691, -1502647899 * var27.field4342, (byte)57);
                  if (var47.field4340 == null) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     } else {
                        classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                        return 1;
                     }
                  } else {
                     int var66 = 0;

                     for (int var80 = 0; var80 < var47.field4340.length; var80++) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        classLW var92 = var47.field4340[var80];
                        if (null == var92) {
                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }
                        } else if (var92.field4263 * 653784551 == var27.field4260 * 63131743) {
                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }

                           var66++;
                        }
                     }

                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var66;
                     return 1;
                  }
               }
            }
         } else if (var0 == 209) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var108;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var108 = classSZ.field6110;
               } else {
                  var108 = classDL.field1558;
               }

               classLW var26 = var108;
               int[] var109 = classBB.field323;
               int var121 = (classDY.field1679 += 120041229) * -324749371 - 1;
               int var10002;
               if (var26 != null) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var10002 = 653784551 * var26.field4263;
               } else {
                  var10002 = -1;
               }

               var109[var121] = var10002;
               return 1;
            }
         } else if (var0 == 210) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               int var25 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               int var46 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               Object var65 = classKN.method6500(var25, -198268369);
               int var79 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               Object var91 = classKN.method6500(var46, 1661529524);
               int var9 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classPN var10 = classNE.method7829(var9, (byte)-53);
               Object var11 = var10.method9031((byte)5);
               Object var12 = null;
               if (var79 >= 0) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  classPN var13 = classNE.method7829(var79, (byte)12);
                  var12 = var13.method9031((byte)17);
               }

               classLW var14;
               classLW var103 = classLY.method7375(classWK.field6691, classBB.field323[(classDY.field1679 -= 120041229) * -324749371], (byte)113);
               var14 = null;
               label951:
               if (var103 != null && var103.field4340 != null) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  int var15 = 0;

                  classLW var16;
                  while (true) {
                     if (var15 >= var103.field4340.length) {
                        break label951;
                     }

                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }

                     var16 = var103.field4340[var15];
                     if (var16 != null) {
                        if (var9 >= 0 && !var16.method7220(var9, var11, 1388088313).equals(var91)) {
                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }
                        } else {
                           if (var79 < 0) {
                              break;
                           }

                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }

                           if (var16.method7220(var79, var12, 1698311703).equals(var65)) {
                              break;
                           }

                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }
                        }
                     }

                     var15++;
                  }

                  var14 = var16;
               }

               client.method1677(var14, var2, 2090224159);
               return 1;
            }
         } else if (211 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 360123687;
               int var24 = classBB.field323[-324749371 * classDY.field1679];
               classLW var45 = classLY.method7375(classWK.field6691, classBB.field323[1 + -324749371 * classDY.field1679], (byte)25);
               int var64 = classBB.field323[2 + -324749371 * classDY.field1679];
               classBB.field326.method7399(var24, var45, var64, 1453250184);
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classLZ.method7412(classBB.field326, 1466660338);
               return 1;
            }
         } else if (var0 == 212) {
            int var23 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            classLW var107;
            if (var2) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               }

               var107 = classSZ.field6110;
            } else {
               var107 = classDL.field1558;
            }

            classLW var44 = var107;
            if (63131743 * var44.field4260 == -1) {
               classBB.field326.method7399(var23, var44, -1, 1453250184);
            } else {
               classBB.field326
                  .method7399(var23, classLY.method7375(classWK.field6691, var44.field4342 * -1502647899, (byte)120), 63131743 * var44.field4260, 1453250184);
            }

            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classLZ.method7412(classBB.field326, 2114277572);
            return 1;
         } else if (213 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               client.method1677(classBB.field326.method7415(-1992217275), var2, 1437696948);
               return 1;
            }
         } else if (214 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classBB.field326.method7420(-1442930153);
               return 1;
            }
         } else if (215 == var0) {
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classKH.method6476(classBB.field326.method7423(-1713040332), (byte)67);
            return 1;
         } else if (var0 == 216) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               int var22 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               Object var43 = classKN.method6500(var22, -547534697);
               int var63 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classPN var78 = classNE.method7829(var63, (byte)96);
               Object var90 = var78.method9031((byte)89);
               classBB.field326.method7424(var63, var43, var90, (byte)-114);
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classLZ.method7412(classBB.field326, 1097202174);
               return 1;
            }
         } else if (217 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               int var21 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classLW var106;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var106 = classSZ.field6110;
               } else {
                  var106 = classDL.field1558;
               }

               classLW var42 = var106;
               if (null == var42) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else if (var42.field4375 * -1510882375 != 0) {
                  throw new RuntimeException("");
               } else {
                  classLW var62 = classLY.method7375(classWK.field6691, -1502647899 * var42.field4342, (byte)82);
                  if (-1510882375 * var62.field4375 != 0) {
                     throw new RuntimeException();
                  } else {
                     classLW var77 = classBI.method1100(var21, var62, var42, (byte)0);
                     client.method1677(var77, var2, -121555812);
                     return 1;
                  }
               }
            }
         } else if (var0 == 218) {
            classLW var105;
            if (var2) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               }

               var105 = classSZ.field6110;
            } else {
               var105 = classDL.field1558;
            }

            classLW var20 = var105;
            if (var20 == null) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                  return 1;
               }
            } else {
               classLW var41 = classLY.method7375(classWK.field6691, -1502647899 * var20.field4342, (byte)58);
               if (var41 != null) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  if (null != var41.field4340) {
                     classLW var61 = null;

                     for (int var76 = 0; var76 < var41.field4340.length; var76++) {
                        classLW var89 = var41.field4340[var76];
                        if (var89 == null) {
                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }
                        } else if (var20.field4263 * 653784551 == var89.field4263 * 653784551) {
                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }

                           var61 = var89;
                           break;
                        }
                     }

                     client.method1677(var61, var2, -882290401);
                     return 1;
                  }
               }

               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (219 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var19 = var2 ? classSZ.field6110 : classDL.field1558;
               if (null == var19) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  }
               } else {
                  classLW var40 = classLY.method7375(classWK.field6691, var19.field4342 * -1502647899, (byte)52);
                  if (var40 != null) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }

                     if (var40.field4340 != null) {
                        classLW var60 = null;

                        for (int var75 = var40.field4340.length - 1; var75 >= 0; var75--) {
                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }

                           classLW var88 = var40.field4340[var75];
                           if (null == var88) {
                              if (var3 == 12) {
                                 throw new IllegalStateException();
                              }
                           } else if (var19.field4263 * 653784551 == 653784551 * var88.field4263) {
                              if (var3 == 12) {
                                 throw new IllegalStateException();
                              }

                              var60 = var88;
                              break;
                           }
                        }

                        client.method1677(var60, var2, -73000935);
                        return 1;
                     }

                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }
                  }

                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                  return 1;
               }
            }
         } else if (220 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var104;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var104 = classSZ.field6110;
               } else {
                  var104 = classDL.field1558;
               }

               classLW var18 = var104;
               if (null == var18) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  }
               } else if (var18.field4375 * -1510882375 != 0) {
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                  return 1;
               } else {
                  classLW var39 = classLY.method7375(classWK.field6691, -1502647899 * var18.field4342, (byte)71);
                  if (var39 != null) {
                     if (null != var39.field4340) {
                        classLW var59 = null;

                        for (int var74 = 0; var74 < var39.field4340.length; var74++) {
                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }

                           classLW var87 = var39.field4340[var74];
                           if (var87 == null) {
                              if (var3 == 12) {
                                 throw new IllegalStateException();
                              }
                           } else if (var18.field4260 * 63131743 == var87.field4263 * 653784551) {
                              if (var3 == 12) {
                                 throw new IllegalStateException();
                              }

                              var59 = var87;
                              break;
                           }
                        }

                        client.method1677(var59, var2, -861489028);
                        return 1;
                     }

                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }
                  }

                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                  return 1;
               }
            }
         } else if (var0 == 221) {
            classLW var10000;
            if (var2) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               }

               var10000 = classSZ.field6110;
            } else {
               var10000 = classDL.field1558;
            }

            classLW var4 = var10000;
            if (null == var4) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                  return 1;
               }
            } else if (0 != var4.field4375 * -1510882375) {
               if (var3 == 12) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                  return 1;
               }
            } else {
               classLW var5 = classLY.method7375(classWK.field6691, -1502647899 * var4.field4342, (byte)79);
               if (null != var5) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  if (null != var5.field4340) {
                     classLW var6 = null;

                     for (int var7 = var5.field4340.length - 1; var7 >= 0; var7--) {
                        if (var3 == 12) {
                           throw new IllegalStateException();
                        }

                        classLW var8 = var5.field4340[var7];
                        if (var8 != null && 63131743 * var4.field4260 == var8.field4263 * 653784551) {
                           if (var3 == 12) {
                              throw new IllegalStateException();
                           }

                           var6 = var8;
                           break;
                        }
                     }

                     client.method1677(var6, var2, 1592748732);
                     return 1;
                  }

                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }
               }

               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (222 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               classLW var10001;
               if (var2) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var10001 = classSZ.field6110;
               } else {
                  var10001 = classDL.field1558;
               }

               if (null == var10001) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  return 1;
               }
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var17) {
         throw classEG.method3884(var17, "gd.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgw;Lgw;I)I")
   @ObfuscatedName("az")
   int method5393(classGW var1, classGW var2, int var3) {
      try {
         return classGW.method5817(var1, 1727743530) - classGW.method5817(var2, 1727743530);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gd.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljc;")
   @ObfuscatedName("az")
   public static classJC[] method5390(int var0) {
      try {
         return new classJC[]{
            classJC.field3121,
            classJC.field3127,
            classJC.field3123,
            classJC.field3132,
            classJC.field3125,
            classJC.field3124,
            classJC.field3133,
            classJC.field3128,
            classJC.field3129,
            classJC.field3130,
            classJC.field3126,
            classJC.field3131,
            classJC.field3122,
            classJC.field3134,
            classJC.field3135
         };
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "gd.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IILup;Lkh;I)V")
   @ObfuscatedName("ab")
   static void method5399(classDZ var0, int var1, int var2, classUP var3, classKH var4, int var5) {
      try {
         int var6 = -2087374717 * client.field837.field1419;
         int[] var7 = client.field837.field1423;
         classCT var9 = classMB.method7521(-1218173231);
         int var10000;
         if (var9 != null) {
            if (var5 != 1115597881) {
               throw new IllegalStateException();
            }

            var10000 = 532975721 * var9.field1265;
         } else {
            var10000 = 0;
         }

         int var8 = var10000;
         int var22 = var8;

         for (int var10 = 0; var10 < var6; var10++) {
            if (var5 != 1115597881) {
               return;
            }

            classCT var11 = (classCT)var0.field1694.method13404(var7[var10]);
            if (null != var11 && var11.vmethod262((byte)55)) {
               if (var5 != 1115597881) {
                  throw new IllegalStateException();
               }

               if (!var11.field1259) {
                  classUZ var12 = classYY.method13790(var0, -1547553299 * var11.field1487, -1272026483 * var11.field1489, (byte)121);
                  int var13 = (int)var12.field6427;
                  int var14 = (int)var12.field6426;
                  classUZ.method11727(var12, 1980690964);
                  int var15 = var13 / 32 - 2106329293 * client.field962 / 32;
                  int var16 = var14 / 32 - client.field986 * -2126074583 / 32;
                  if (-2130951373 * client.field845 == var11.field1480 * -1315528093) {
                     int var17 = var3.method11443(1082044662);
                     int var18 = classUP.method11445(var3, (byte)20);
                     int var19 = var16 * var17 + var15 * var18 >> 16;
                     int var20 = var18 * var16 - var15 * var17 >> 16;
                     classBA.field309 = var19 * 273083463;
                     classBA.field307 = 1831011619 * var20;
                  } else if (var11.method2622(-1742844410)) {
                     if (var5 != 1115597881) {
                        throw new IllegalStateException();
                     }

                     classBO.method1165(var1, var2, var15, var16, var3, classPE.field5234[3], var4, (byte)54);
                  } else {
                     if (var22 != 0) {
                        if (var5 != 1115597881) {
                           throw new IllegalStateException();
                        }

                        if (0 != var11.field1265 * 532975721) {
                           if (var5 != 1115597881) {
                              throw new IllegalStateException();
                           }

                           if (var22 == 532975721 * var11.field1265) {
                              if (var5 != 1115597881) {
                                 throw new IllegalStateException();
                              }

                              classBO.method1165(var1, var2, var15, var16, var3, classPE.field5234[4], var4, (byte)34);
                              continue;
                           }
                        }
                     }

                     if (classCT.method2629(var11, 95785063)) {
                        if (var5 != 1115597881) {
                           throw new IllegalStateException();
                        }

                        classBO.method1165(var1, var2, var15, var16, var3, classPE.field5234[5], var4, (byte)82);
                     } else if (classCT.method2648(var11, -1839033503)) {
                        if (var5 != 1115597881) {
                           throw new IllegalStateException();
                        }

                        classBO.method1165(var1, var2, var15, var16, var3, classPE.field5234[6], var4, (byte)126);
                     } else {
                        classBO.method1165(var1, var2, var15, var16, var3, classPE.field5234[2], var4, (byte)80);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var21) {
         throw classEG.method3884(var21, "gd.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method5398(Object var1) {
      return super.equals(var1);
   }
}
