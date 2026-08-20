import java.math.BigInteger;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mc")
final class classMC implements Comparator {
   @ObfuscatedSignature(descriptor = "Lzx;")
   @ObfuscatedName("gv")
   public static classZX field4481;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final int field4480 = 95;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmc;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("jt")
   public static int method7526(classMC var0, Object var1, Object var2) {
      return var0 == null ? var0.method7528(var1, var1) : method7524(var0, (classNM)var1, (classNM)var2, (byte)0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmc;Ljava/lang/Object;)Z")
   @ObfuscatedName("xj")
   public static boolean method7529(classMC var0, Object var1) {
      return var0 == null ? var0.equals(var1) : var0.equals(var1);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return method7524(this, (classNM)var1, (classNM)var2, (byte)0);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mc.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method7530(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("al")
   public static boolean method7532(int var0) {
      try {
         boolean var1 = false;
         boolean var2 = false;
         if (!classNP.field4700.isEmpty()) {
            classWT var3 = (classWT)classNP.field4700.get(0);
            if (var3 == null) {
               if (var0 >= 2009220218) {
                  throw new IllegalStateException();
               }

               classNP.field4700.remove(0);
            } else if (var3.vmethod627((byte)30)) {
               if (var0 >= 2009220218) {
                  throw new IllegalStateException();
               }

               if (var3.method12613(1292837044)) {
                  if (var0 >= 2009220218) {
                     throw new IllegalStateException();
                  }

                  System.out.println("Error in midimanager.service: " + classWT.method12619(var3, -1194474870));
                  var1 = true;
               } else {
                  if (var3.method12621((short)-6663) != null) {
                     if (var0 >= 2009220218) {
                        throw new IllegalStateException();
                     }

                     classNP.field4700.add(1, var3.method12621((short)-19609));
                  }

                  var2 = var3.method12614((byte)16);
               }

               classNP.field4700.remove(0);
            } else {
               var2 = var3.method12614((byte)105);
            }
         }

         if (var1) {
            if (var0 >= 2009220218) {
               throw new IllegalStateException();
            }

            classNP.field4700.clear();
            classGK.method5486(1665423628);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mc.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method7527(Object var1, Object var2) {
      return method7524(this, (classNM)var1, (classNM)var2, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("af")
   int method7522(classNM var1, classNM var2) {
      return -1508628682 * var1.field4685.field4536 < var2.field4685.field4536 * 1837172920
         ? -1
         : (2117520842 * var1.field4685.field4536 == var2.field4685.field4536 * 207261578 ? 0 : 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)I")
   @ObfuscatedName("em")
   public static int method7531(classPV var0) {
      return 186634899 * var0.field5435;
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("ae")
   int method7523(classNM var1, classNM var2) {
      return 29846541 * var1.field4685.field4536 < var2.field4685.field4536 * 29846541
         ? -1
         : (29846541 * var1.field4685.field4536 == var2.field4685.field4536 * 29846541 ? 0 : 1);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mc.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmc;Lnm;Lnm;B)I")
   @ObfuscatedName("mi")
   public static int method7524(classMC var0, classNM var1, classNM var2, byte var3) {
      if (var0 == null) {
         var0.method7525(var1, var1, var3);
      }

      try {
         return 29846541 * var1.field4685.field4536 < var2.field4685.field4536 * 29846541
            ? -1
            : (29846541 * var1.field4685.field4536 == var2.field4685.field4536 * 29846541 ? 0 : 1);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mc.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("bb")
   static int method7533(int var0, classBL var1, boolean var2, byte var3) {
      try {
         if (4000 == var0) {
            classDY.field1679 -= 240082458;
            int var63 = classBB.field323[-324749371 * classDY.field1679];
            int var86 = classBB.field323[1 + -324749371 * classDY.field1679];
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var86 + var63;
            return 1;
         } else if (4001 == var0) {
            classDY.field1679 -= 240082458;
            int var62 = classBB.field323[-324749371 * classDY.field1679];
            int var85 = classBB.field323[1 + -324749371 * classDY.field1679];
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var62 - var85;
            return 1;
         } else if (4002 == var0) {
            if (var3 >= 101) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               int var61 = classBB.field323[-324749371 * classDY.field1679];
               int var84 = classBB.field323[1 + classDY.field1679 * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var61 * var84;
               return 1;
            }
         } else if (var0 == 4003) {
            classDY.field1679 -= 240082458;
            int var60 = classBB.field323[classDY.field1679 * -324749371];
            int var83 = classBB.field323[classDY.field1679 * -324749371 + 1];
            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var60 / var83;
            return 1;
         } else if (var0 == 4004) {
            if (var3 >= 101) {
               throw new IllegalStateException();
            } else {
               int var59 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)(Math.random() * var59);
               return 1;
            }
         } else if (4005 == var0) {
            if (var3 >= 101) {
               throw new IllegalStateException();
            } else {
               int var58 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)(Math.random() * (1 + var58));
               return 1;
            }
         } else if (4006 == var0) {
            if (var3 >= 101) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 600206145;
               int var57 = classBB.field323[-324749371 * classDY.field1679];
               int var82 = classBB.field323[classDY.field1679 * -324749371 + 1];
               int var111 = classBB.field323[-324749371 * classDY.field1679 + 2];
               int var117 = classBB.field323[3 + -324749371 * classDY.field1679];
               int var124 = classBB.field323[4 + classDY.field1679 * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (var124 - var111) * (var82 - var57) / (var117 - var111) + var57;
               return 1;
            }
         } else if (4007 == var0) {
            if (var3 >= 101) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               int var56 = classBB.field323[classDY.field1679 * -324749371];
               int var81 = classBB.field323[-324749371 * classDY.field1679 + 1];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var56 * var81 / 100 + var56;
               return 1;
            }
         } else if (var0 == 4008) {
            if (var3 >= 101) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               int var55 = classBB.field323[-324749371 * classDY.field1679];
               int var80 = classBB.field323[classDY.field1679 * -324749371 + 1];
               if (var80 >= 0) {
                  if (var3 >= 101) {
                     throw new IllegalStateException();
                  }

                  if (var80 <= 31) {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var55 | 1 << var80;
                     return 1;
                  }

                  if (var3 >= 101) {
                     throw new IllegalStateException();
                  }
               }

               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var55;
               return 1;
            }
         } else if (var0 == 4009) {
            if (var3 >= 101) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               int var54 = classBB.field323[classDY.field1679 * -324749371];
               int var79 = classBB.field323[classDY.field1679 * -324749371 + 1];
               if (var79 >= 0 && var79 <= 31) {
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var54 & -1 - (1 << var79);
               } else {
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var54;
               }

               return 1;
            }
         } else if (4010 != var0) {
            if (var0 == 4011) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  int var53 = classBB.field323[classDY.field1679 * -324749371];
                  int var78 = classBB.field323[classDY.field1679 * -324749371 + 1];
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var53 % var78;
                  return 1;
               }
            } else if (4012 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  int var52 = classBB.field323[classDY.field1679 * -324749371];
                  int var77 = classBB.field323[-324749371 * classDY.field1679 + 1];
                  if (var52 == 0) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                  } else {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)Math.pow(var52, var77);
                  }

                  return 1;
               }
            } else if (var0 == 4013) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  int var51 = classBB.field323[classDY.field1679 * -324749371];
                  int var76 = classBB.field323[1 + classDY.field1679 * -324749371];
                  if (0 == var51) {
                     classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
                     return 1;
                  } else {
                     switch (var76) {
                        case 0:
                           classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = Integer.MAX_VALUE;
                           break;
                        case 1:
                           classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var51;
                           break;
                        case 2:
                           classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)Math.sqrt(var51);
                           break;
                        case 3:
                           classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)Math.cbrt(var51);
                           break;
                        case 4:
                           classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)Math.sqrt(Math.sqrt(var51));
                           break;
                        default:
                           classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)Math.pow(var51, 1.0 / var76);
                     }

                     return 1;
                  }
               }
            } else if (var0 == 4014) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  int var50 = classBB.field323[classDY.field1679 * -324749371];
                  int var75 = classBB.field323[classDY.field1679 * -324749371 + 1];
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var50 & var75;
                  return 1;
               }
            } else if (var0 == 4015) {
               classDY.field1679 -= 240082458;
               int var49 = classBB.field323[-324749371 * classDY.field1679];
               int var74 = classBB.field323[classDY.field1679 * -324749371 + 1];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var49 | var74;
               return 1;
            } else if (var0 == 4016) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  int var48 = classBB.field323[classDY.field1679 * -324749371];
                  int var73 = classBB.field323[1 + classDY.field1679 * -324749371];
                  int[] var130 = classBB.field323;
                  int var135 = (classDY.field1679 += 120041229) * -324749371 - 1;
                  int var139;
                  if (var48 < var73) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     var139 = var48;
                  } else {
                     var139 = var73;
                  }

                  var130[var135] = var139;
                  return 1;
               }
            } else if (4017 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  int var47 = classBB.field323[-324749371 * classDY.field1679];
                  int var72 = classBB.field323[1 + -324749371 * classDY.field1679];
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var47 > var72 ? var47 : var72;
                  return 1;
               }
            } else if (4018 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 360123687;
                  long var46 = classBB.field323[classDY.field1679 * -324749371];
                  long var110 = classBB.field323[1 + classDY.field1679 * -324749371];
                  long var123 = classBB.field323[-324749371 * classDY.field1679 + 2];
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)(var123 * var46 / var110);
                  return 1;
               }
            } else if (4025 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  int var45 = classPN.method9024(classBB.field323[(classDY.field1679 -= 120041229) * -324749371], -953880827);
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var45;
                  return 1;
               }
            } else if (4026 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  int var44 = classBB.field323[-324749371 * classDY.field1679];
                  int var71 = classBB.field323[1 + -324749371 * classDY.field1679];
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var44 ^ 1 << var71;
                  return 1;
               }
            } else if (var0 == 4027) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 360123687;
                  int var43 = classBB.field323[-324749371 * classDY.field1679];
                  int var70 = classBB.field323[1 + classDY.field1679 * -324749371];
                  int var109 = classBB.field323[classDY.field1679 * -324749371 + 2];
                  if (var70 >= 0) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     if (var70 <= 31) {
                        if (var3 >= 101) {
                           throw new IllegalStateException();
                        }

                        if (var109 >= 0 && var109 <= 31) {
                           classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classMQ.method7642(var43, var70, var109, -1687991555);
                           return 1;
                        }
                     }
                  }

                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var43;
                  return 1;
               }
            } else if (4028 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 360123687;
                  int var42 = classBB.field323[-324749371 * classDY.field1679];
                  int var69 = classBB.field323[1 + -324749371 * classDY.field1679];
                  int var108 = classBB.field323[classDY.field1679 * -324749371 + 2];
                  if (var69 >= 0) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     if (var69 <= 31) {
                        if (var3 >= 101) {
                           throw new IllegalStateException();
                        }

                        if (var108 >= 0) {
                           if (var3 >= 101) {
                              throw new IllegalStateException();
                           }

                           if (var108 <= 31) {
                              classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = classJP.method6402(var42, var69, var108, 1668017962);
                              return 1;
                           }
                        }
                     }
                  }

                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var42;
                  return 1;
               }
            } else if (var0 == 4029) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 360123687;
                  int var41 = classBB.field323[-324749371 * classDY.field1679];
                  int var68 = classBB.field323[1 + classDY.field1679 * -324749371];
                  int var107 = classBB.field323[classDY.field1679 * -324749371 + 2];
                  if (var68 >= 0) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     if (var68 <= 31 && var107 >= 0) {
                        if (var3 >= 101) {
                           throw new IllegalStateException();
                        }

                        if (var107 <= 31) {
                           int var116 = 31 - var107;
                           classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var41 << var116 >>> var68 + var116;
                           return 1;
                        }

                        if (var3 >= 101) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var41;
                  return 1;
               }
            } else if (4030 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 480164916;
                  int var39 = classBB.field323[classDY.field1679 * -324749371];
                  int var67 = classBB.field323[1 + -324749371 * classDY.field1679];
                  int var106 = classBB.field323[2 + -324749371 * classDY.field1679];
                  int var115 = classBB.field323[-324749371 * classDY.field1679 + 3];
                  if (var106 >= 0) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     if (var106 <= 31) {
                        if (var3 >= 101) {
                           throw new IllegalStateException();
                        }

                        if (var115 >= 0) {
                           if (var3 >= 101) {
                              throw new IllegalStateException();
                           }

                           if (var115 <= 31) {
                              var39 = classJP.method6402(var39, var106, var115, -344911722);
                              int var122 = (int)classOW.method8807(var115 - var106 + 1, 522379196);
                              if (var67 > var122) {
                                 if (var3 >= 101) {
                                    throw new IllegalStateException();
                                 }

                                 var67 = var122;
                              }

                              classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var39 | var67 << var106;
                              return 1;
                           }

                           if (var3 >= 101) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }

                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var39;
                  return 1;
               }
            } else if (4032 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classBB.field323[-324749371 * classDY.field1679 - 1] = classBF.method997(classBB.field323[classDY.field1679 * -324749371 - 1], (byte)-2) >> 2;
                  return 1;
               }
            } else if (4033 == var0) {
               classBB.field323[-324749371 * classDY.field1679 - 1] = classDH.method3082(classBB.field323[-324749371 * classDY.field1679 - 1], 1125240045) >> 2;
               return 1;
            } else if (var0 == 4034) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  int var38 = classBB.field323[-324749371 * classDY.field1679];
                  int var66 = classBB.field323[-324749371 * classDY.field1679 + 1];
                  int var105 = classRO.method10142(var38, var66, -1790758291);
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var105;
                  return 1;
               }
            } else if (var0 == 4035) {
               classBB.field323[-324749371 * classDY.field1679 - 1] = Math.abs(classBB.field323[-324749371 * classDY.field1679 - 1]);
               return 1;
            } else if (4036 == var0) {
               String var37 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int var65 = -1;
               if (classEU.method4078(var37, (byte)-1)) {
                  if (var3 >= 101) {
                     throw new IllegalStateException();
                  }

                  var65 = classJF.method6360(var37, -784368728);
               }

               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var65;
               return 1;
            } else if (4037 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= 1699258970;
                  long var36 = classBB.field322[18294437 * classXT.field6939];
                  long var104 = classBB.field322[1 + classXT.field6939 * 18294437];
                  long var121 = var104 + var36;
                  boolean var129;
                  if (var104 > 0L) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     var129 = true;
                  } else {
                     var129 = false;
                  }

                  boolean var134;
                  if (var121 > var36) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     var134 = true;
                  } else {
                     var134 = false;
                  }

                  if (var129 != var134) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var121;
                     return 1;
                  }
               }
            } else if (4038 == var0) {
               classXT.field6939 -= 1699258970;
               long var35 = classBB.field322[classXT.field6939 * 18294437];
               long var103 = classBB.field322[1 + 18294437 * classXT.field6939];
               long var120 = var35 - var103;
               boolean var128;
               if (var103 < 0L) {
                  if (var3 >= 101) {
                     throw new IllegalStateException();
                  }

                  var128 = true;
               } else {
                  var128 = false;
               }

               if (var128 != var120 > var35) {
                  if (var3 >= 101) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var120;
                  return 1;
               }
            } else if (var0 == 4039) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= 1699258970;
                  long var34 = classBB.field322[18294437 * classXT.field6939];
                  long var102 = classBB.field322[1 + classXT.field6939 * 18294437];
                  long var119 = var102 * var34;
                  if (0L == var102 || var34 == var119 / var102) {
                     classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var119;
                     return 1;
                  } else if (var3 >= 101) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               }
            } else if (4040 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= 1699258970;
                  long var33 = classBB.field322[18294437 * classXT.field6939];
                  long var101 = classBB.field322[1 + classXT.field6939 * 18294437];
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var33 / var101;
                  return 1;
               }
            } else if (4041 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= 1699258970;
                  long var32 = classBB.field322[classXT.field6939 * 18294437];
                  long var100 = classBB.field322[18294437 * classXT.field6939 + 1];
                  long[] var127 = classBB.field322;
                  int var133 = (classXT.field6939 += -1297854163) * 18294437 - 1;
                  long var138;
                  if (var32 < var100) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     var138 = var32;
                  } else {
                     var138 = var100;
                  }

                  var127[var133] = var138;
                  return 1;
               }
            } else if (4042 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= 1699258970;
                  long var31 = classBB.field322[classXT.field6939 * 18294437];
                  long var99 = classBB.field322[1 + 18294437 * classXT.field6939];
                  long[] var126 = classBB.field322;
                  int var132 = (classXT.field6939 += -1297854163) * 18294437 - 1;
                  long var137;
                  if (var31 > var99) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     var137 = var31;
                  } else {
                     var137 = var99;
                  }

                  var126[var132] = var137;
                  return 1;
               }
            } else if (var0 == 4043) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= 401404807;
                  BigInteger var30 = BigInteger.valueOf(classBB.field322[18294437 * classXT.field6939]);
                  BigInteger var64 = BigInteger.valueOf(classBB.field322[1 + classXT.field6939 * 18294437]);
                  BigInteger var98 = BigInteger.valueOf(classBB.field322[classXT.field6939 * 18294437 + 2]);
                  if (BigInteger.ZERO == var64) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     BigInteger var114 = var30.multiply(var98).divide(var64);
                     if (var114.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                        if (var3 >= 101) {
                           throw new IllegalStateException();
                        }

                        if (var114.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                           classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var114.longValue();
                           return 1;
                        }

                        if (var3 >= 101) {
                           throw new IllegalStateException();
                        }
                     }

                     throw new RuntimeException("");
                  }
               }
            } else if (4044 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 120041229;
                  int var29 = classBB.field323[classDY.field1679 * -324749371];
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var29;
                  return 1;
               }
            } else if (var0 == 4047) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= -1297854163;
                  classDY.field1679 -= 120041229;
                  long var28 = classBB.field322[18294437 * classXT.field6939];
                  int var97 = classBB.field323[-324749371 * classDY.field1679];
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var28 | 1L << var97;
                  return 1;
               }
            } else if (4048 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= -1297854163;
                  classDY.field1679 -= 120041229;
                  long var27 = classBB.field322[classXT.field6939 * 18294437];
                  int var96 = classBB.field323[classDY.field1679 * -324749371];
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var27 & -1L - (1L << var96);
                  return 1;
               }
            } else if (4049 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= -1297854163;
                  classDY.field1679 -= 120041229;
                  long var26 = classBB.field322[18294437 * classXT.field6939];
                  int var95 = classBB.field323[classDY.field1679 * -324749371];
                  int[] var125 = classBB.field323;
                  int var131 = (classDY.field1679 += 120041229) * -324749371 - 1;
                  byte var136;
                  if ((var26 & 1L << var95) != 0L) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     var136 = 1;
                  } else {
                     var136 = 0;
                  }

                  var125[var131] = var136;
                  return 1;
               }
            } else if (var0 == 4050) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  int var25 = classXE.method12747(classBB.field322[(classXT.field6939 -= -1297854163) * 18294437]);
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var25;
                  return 1;
               }
            } else if (4051 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= -1297854163;
                  classDY.field1679 -= 120041229;
                  long var24 = classBB.field322[classXT.field6939 * 18294437];
                  int var94 = classBB.field323[-324749371 * classDY.field1679];
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var24 ^ 1L << var94;
                  return 1;
               }
            } else if (var0 == 4052) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= -1297854163;
                  classDY.field1679 -= 240082458;
                  long var23 = classBB.field322[18294437 * classXT.field6939];
                  int var93 = classEK.method3908(0, 63, classBB.field323[classDY.field1679 * -324749371], (byte)-55);
                  int var113 = classEK.method3908(0, 63, classBB.field323[classDY.field1679 * -324749371 + 1], (byte)-20);
                  if (var113 < var93) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classTW.method11207(var23, var93, var113, (byte)-25);
                     return 1;
                  }
               }
            } else if (4053 == var0) {
               classXT.field6939 -= -1297854163;
               classDY.field1679 -= 240082458;
               long var22 = classBB.field322[classXT.field6939 * 18294437];
               int var92 = classEK.method3908(0, 63, classBB.field323[-324749371 * classDY.field1679], (byte)-2);
               int var112 = classEK.method3908(0, 63, classBB.field323[1 + -324749371 * classDY.field1679], (byte)-20);
               if (var112 < var92) {
                  if (var3 >= 101) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classSA.method10355(var22, var92, var112, 43107232);
                  return 1;
               }
            } else if (var0 == 4054) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= -1297854163;
                  classDY.field1679 -= 240082458;
                  long var21 = classBB.field322[classXT.field6939 * 18294437];
                  int var91 = classEK.method3908(0, 63, classBB.field323[-324749371 * classDY.field1679], (byte)-94);
                  int var7 = classEK.method3908(0, 63, classBB.field323[classDY.field1679 * -324749371 + 1], (byte)2);
                  if (var7 < var91) {
                     throw new RuntimeException("");
                  } else {
                     int var118 = 63 - var7;
                     classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var21 << var118 >>> var91 + var118;
                     return 1;
                  }
               }
            } else if (4055 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= 1699258970;
                  long var20 = classBB.field322[classXT.field6939 * 18294437];
                  long var90 = classBB.field322[18294437 * classXT.field6939 + 1];
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var20 % var90;
                  return 1;
               }
            } else if (var0 == 4056) {
               classXT.field6939 -= 1699258970;
               long var19 = classBB.field322[classXT.field6939 * 18294437];
               long var89 = classBB.field322[classXT.field6939 * 18294437 + 1];
               classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var19 & var89;
               return 1;
            } else if (var0 == 4057) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= 1699258970;
                  long var18 = classBB.field322[classXT.field6939 * 18294437];
                  long var88 = classBB.field322[classXT.field6939 * 18294437 + 1];
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var18 | var88;
                  return 1;
               }
            } else if (4058 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= -1297854163;
                  long var17 = classBB.field322[18294437 * classXT.field6939];
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = ~var17;
                  return 1;
               }
            } else if (var0 == 4059) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classDY.field1679 -= 240082458;
                  classXT.field6939 -= 1699258970;
                  long var15 = classBB.field322[18294437 * classXT.field6939];
                  long var87 = classBB.field322[18294437 * classXT.field6939 + 1];
                  int var8 = classBB.field323[-324749371 * classDY.field1679];
                  int var9 = classBB.field323[classDY.field1679 * -324749371 + 1];
                  var15 = classSA.method10355(var15, var8, var9, 43107232);
                  long var10 = classOW.method8807(1 + (var9 - var8), 396795633);
                  if (var87 > var10) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     var87 = var10;
                  }

                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var15 | var87 << var8;
                  return 1;
               }
            } else if (var0 == 4060) {
               classDY.field1679 -= 240082458;
               long var14 = classBB.field323[-324749371 * classDY.field1679];
               long var6 = classBB.field323[1 + -324749371 * classDY.field1679];
               classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var14 << 32 | var6 & 4294967295L;
               return 1;
            } else if (4061 == var0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               } else {
                  classXT.field6939 -= -1297854163;
                  long var13 = classBB.field322[classXT.field6939 * 18294437];
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)(var13 >> 32);
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (int)var13;
                  return 1;
               }
            } else {
               return 2;
            }
         } else {
            classDY.field1679 -= 240082458;
            int var4 = classBB.field323[classDY.field1679 * -324749371];
            int var5 = classBB.field323[-324749371 * classDY.field1679 + 1];
            if (var5 >= 0) {
               if (var3 >= 101) {
                  throw new IllegalStateException();
               }

               if (var5 <= 31) {
                  int[] var10000 = classBB.field323;
                  int var10001 = (classDY.field1679 += 120041229) * -324749371 - 1;
                  byte var10002;
                  if (0 != (var4 & 1 << var5)) {
                     if (var3 >= 101) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
                  return 1;
               }

               if (var3 >= 101) {
                  throw new IllegalStateException();
               }
            }

            classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "mc.bb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method7528(Object var1, Object var2) {
      return method7524(this, (classNM)var1, (classNM)var2, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;B)I")
   @ObfuscatedName("az")
   int method7525(classNM var1, classNM var2, byte var3) {
      try {
         return 29846541 * var1.field4685.field4535 < var2.field4685.field4538 * 29846541
            ? -1
            : (29846541 * var1.field4685.field4536 == var2.field4685.field4535 * 29846541 ? 0 : 1);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mc.az(" + 41);
      }
   }
}
