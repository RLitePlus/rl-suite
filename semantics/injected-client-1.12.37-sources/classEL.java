import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("el")
public class classEL extends classRD {
   @ObfuscatedName("az")
   final boolean field1780;
   @ObfuscatedName("pe")
   static int field1784;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field1781 = 38;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   static final int field1783 = 56;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field1782 = 15;

   @ObfuscatedSignature(descriptor = "(Lel;Lri;Lri;B)I")
   @ObfuscatedName("vw")
   public static int method3911(classEL var0, Buddy var1, Buddy var2, byte var3) {
      if (var0 == null) {
         return var0.method3917(var1, var1, var3);
      } else {
         try {
            if (var1.field5669 * -760305529 == client.field827 * 1311484143) {
               if (var3 != -1) {
                  throw new IllegalStateException();
               }

               if (-760305529 * var2.field5669 == 1311484143 * client.field827) {
                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }

                  int var10000;
                  if (var0.field1780) {
                     if (var3 != -1) {
                        throw new IllegalStateException();
                     }

                     var10000 = classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519);
                  } else {
                     var10000 = classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
                  }

                  return var10000;
               }
            }

            return classRD.method9942(var0, var1, var2, 2022984694);
         } catch (RuntimeException var4) {
            throw classEG.newRunException(var4, "el.az(" + 41);
         }
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return method3911(this, (Buddy)var1, (Buddy)var2, (byte)-1);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "el.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method3918(Object var1, Object var2) {
      return method3911(this, (Buddy)var1, (Buddy)var2, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)I")
   @ObfuscatedName("fr")
   static int method3921(Widget var0, int var1, int var2) {
      try {
         if (null != var0.field4399) {
            if (var2 <= -1661685543) {
               throw new IllegalStateException();
            }

            if (var1 < var0.field4399.length) {
               try {
                  int[] var3 = var0.field4399[var1];
                  int var4 = 0;
                  int var5 = 0;
                  byte var6 = 0;

                  while (true) {
                     int var7 = var3[var5++];
                     int var8 = 0;
                     byte var9 = 0;
                     if (var7 == 0) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        return var4;
                     }

                     if (var7 == 1) {
                        var8 = client.field963[var3[var5++]];
                     }

                     if (2 == var7) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        var8 = client.field854[var3[var5++]];
                     }

                     if (3 == var7) {
                        var8 = client.field803[var3[var5++]];
                     }

                     if (4 == var7) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        int var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        Widget var11 = classLY.method7375(classWK.field6691, var10, (byte)27);
                        int var12 = var3[var5++];
                        label273:
                        if (var12 != -1) {
                           if (var2 <= -1661685543) {
                              throw new IllegalStateException();
                           }

                           if (classOB.method8299(var12, (byte)15).field5016) {
                              if (var2 <= -1661685543) {
                                 throw new IllegalStateException();
                              }

                              if (!client.field932) {
                                 break label273;
                              }

                              if (var2 <= -1661685543) {
                                 throw new IllegalStateException();
                              }
                           }

                           for (int var13 = 0; var13 < var11.field4390.length; var13++) {
                              if (var2 <= -1661685543) {
                                 throw new IllegalStateException();
                              }

                              if (var11.field4390[var13] == 1 + var12) {
                                 if (var2 <= -1661685543) {
                                    throw new IllegalStateException();
                                 }

                                 var8 += var11.field4372[var13];
                              }
                           }
                        }
                     }

                     if (5 == var7) {
                        var8 = classLB.field4090[var3[var5++]];
                     }

                     if (6 == var7) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        var8 = classKJ.field3600[client.field854[var3[var5++]] - 1];
                     }

                     if (7 == var7) {
                        var8 = classLB.field4090[var3[var5++]] * 100 / 46875;
                     }

                     if (var7 == 8) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        Player var22 = classMB.method7521(-715300279);
                        int var10000;
                        if (var22 == null) {
                           if (var2 <= -1661685543) {
                              throw new IllegalStateException();
                           }

                           var10000 = 0;
                        } else {
                           var10000 = var22.field1261 * 810892507;
                        }

                        var8 = var10000;
                     }

                     if (9 == var7) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        for (int var23 = 0; var23 < 25; var23++) {
                           if (var2 <= -1661685543) {
                              throw new IllegalStateException();
                           }

                           if (classKJ.field3599[var23]) {
                              var8 += client.field854[var23];
                           }
                        }
                     }

                     if (var7 == 10) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        int var24 = var3[var5++] << 16;
                        var24 += var3[var5++];
                        Widget var30 = classLY.method7375(classWK.field6691, var24, (byte)98);
                        int var32 = var3[var5++];
                        label311:
                        if (var32 != -1) {
                           if (var2 <= -1661685543) {
                              throw new IllegalStateException();
                           }

                           if (classOB.method8299(var32, (byte)96).field5016) {
                              if (var2 <= -1661685543) {
                                 throw new IllegalStateException();
                              }

                              if (!client.field932) {
                                 break label311;
                              }

                              if (var2 <= -1661685543) {
                                 throw new IllegalStateException();
                              }
                           }

                           for (int var33 = 0; var33 < var30.field4390.length; var33++) {
                              if (var2 <= -1661685543) {
                                 throw new IllegalStateException();
                              }

                              if (1 + var32 == var30.field4390[var33]) {
                                 if (var2 <= -1661685543) {
                                    throw new IllegalStateException();
                                 }

                                 var8 = 999999999;
                                 break;
                              }
                           }
                        }
                     }

                     if (var7 == 11) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        var8 = 1748831801 * client.field922;
                     }

                     if (var7 == 12) {
                        var8 = client.field936 * -1542253723;
                     }

                     if (var7 == 13) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        int var26 = classLB.field4090[var3[var5++]];
                        int var31 = var3[var5++];
                        var8 = 0 != (var26 & 1 << var31) ? 1 : 0;
                     }

                     if (14 == var7) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        int var27 = var3[var5++];
                        var8 = classEM.method3922(var27, -1102009778);
                     }

                     if (var7 == 15) {
                        var9 = 1;
                     }

                     if (16 == var7) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        var9 = 2;
                     }

                     if (var7 == 17) {
                        var9 = 3;
                     }

                     if (18 == var7) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        Player var28 = classMB.method7521(2048959670);
                        var8 = (var28.field1487 * -1547553299 >> 7) + classIS.field3053.field1709 * -1444178379;
                     }

                     if (var7 == 19) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        Player var29 = classMB.method7521(-1246355078);
                        var8 = classIS.field3053.field1708 * -351145363 + (-1272026483 * var29.field1489 >> 7);
                     }

                     if (20 == var7) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        var8 = var3[var5++];
                     }

                     if (var9 == 0) {
                        if (var2 <= -1661685543) {
                           throw new IllegalStateException();
                        }

                        if (var6 == 0) {
                           if (var2 <= -1661685543) {
                              throw new IllegalStateException();
                           }

                           var4 += var8;
                        }

                        if (1 == var6) {
                           if (var2 <= -1661685543) {
                              throw new IllegalStateException();
                           }

                           var4 -= var8;
                        }

                        if (var6 == 2) {
                           if (var2 <= -1661685543) {
                              throw new IllegalStateException();
                           }

                           if (0 != var8) {
                              if (var2 <= -1661685543) {
                                 throw new IllegalStateException();
                              }

                              var4 /= var8;
                           }
                        }

                        if (3 == var6) {
                           var4 *= var8;
                        }

                        var6 = 0;
                     } else {
                        var6 = var9;
                     }
                  }
               } catch (Exception var14) {
                  return -1;
               }
            }

            if (var2 <= -1661685543) {
               throw new IllegalStateException();
            }
         }

         return -2;
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "el.fr(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("af")
   int method3912(Buddy var1, Buddy var2) {
      if (var1.field5669 * -1349180826 == client.field827 * -1143228024 && -2107160266 * var2.field5669 == -1725062167 * client.field827) {
         return this.field1780
            ? classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519)
            : classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
      } else {
         return classRD.method9942(this, var1, var2, 1782725969);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ak")
   static final int method3920(int var0, int var1, byte var2) {
      try {
         if (-2 == var0) {
            if (var2 == 0) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else if (var0 == -1) {
            if (var2 == 0) {
               throw new IllegalStateException();
            } else {
               if (var1 < 2) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  var1 = 2;
               } else if (var1 > 126) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  var1 = 126;
               }

               return var1;
            }
         } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               var1 = 126;
            }

            return (var0 & 65408) + var1;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "el.ak(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpj;)Z")
   @ObfuscatedName("hf")
   public static boolean method3919(classPJ var0) {
      return var0.field5271 * -984169853 < 287626351 * var0.field5269.field5497;
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("ab")
   int method3913(Buddy var1, Buddy var2) {
      if (var1.field5669 * -760305529 == client.field827 * -2084215972 && -760305529 * var2.field5669 == 1311484143 * client.field827) {
         return this.field1780
            ? classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519)
            : classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
      } else {
         return classRD.method9942(this, var1, var2, 1495416044);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("ae")
   int method3914(Buddy var1, Buddy var2) {
      if (var1.field5669 * -760305529 == client.field827 * 1311484143 && -760305529 * var2.field5669 == 1311484143 * client.field827) {
         return this.field1780
            ? classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519)
            : classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
      } else {
         return classRD.method9942(this, var1, var2, 1471558263);
      }
   }

   public classEL(boolean var1) {
      this.field1780 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lel;Lri;Lri;)I")
   @ObfuscatedName("gm")
   public static int method3915(classEL var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         return var0.method3913(var1, var1);
      } else if (var1.field5669 * -760305529 == client.field827 * -533150383 && 1888257964 * var2.field5669 == 1580136460 * client.field827) {
         return var0.field1780
            ? classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519)
            : classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
      } else {
         return classRD.method9942(var0, var1, var2, 1516743496);
      }
   }

   @ObfuscatedSignature(descriptor = "([FIFZFZ[FI)I")
   @ObfuscatedName("az")
   public static int method3916(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6, int var7) {
      try {
         float var8 = 0.0F;

         for (int var9 = 0; var9 < var1 + 1; var9++) {
            if (var7 >= 1363213817) {
               throw new IllegalStateException();
            }

            var8 += Math.abs(var0[var9]);
         }

         float var43 = (Math.abs(var2) + Math.abs(var4)) * (1 + var1) * classST.field6039;
         if (var8 <= var43) {
            return -1;
         } else {
            float[] var10 = new float[1 + var1];

            for (int var11 = 0; var11 < var1 + 1; var11++) {
               if (var7 >= 1363213817) {
                  throw new IllegalStateException();
               }

               var10[var11] = var0[var11] * (1.0F / var8);
            }

            while (Math.abs(var10[var1]) < var43) {
               if (var7 >= 1363213817) {
                  throw new IllegalStateException();
               }

               var1--;
            }

            int var44 = 0;
            if (0 == var1) {
               if (var7 >= 1363213817) {
                  throw new IllegalStateException();
               } else {
                  return var44;
               }
            } else if (var1 == 1) {
               var6[0] = -var10[0] / var10[1];
               boolean var54;
               if (var3) {
                  if (var7 >= 1363213817) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var43 + var6[0]) {
                     if (var7 >= 1363213817) {
                        throw new IllegalStateException();
                     }

                     var54 = 1;
                  } else {
                     var54 = 0;
                  }
               } else if (var2 < var6[0] - var43) {
                  if (var7 >= 1363213817) {
                     throw new IllegalStateException();
                  }

                  var54 = 1;
               } else {
                  var54 = 0;
               }

               boolean var46 = (boolean)var54;
               if (var5) {
                  if (var4 > var6[0] - var43) {
                     if (var7 >= 1363213817) {
                        throw new IllegalStateException();
                     }

                     var54 = (boolean)1;
                  } else {
                     var54 = (boolean)0;
                  }
               } else {
                  var54 = var4 > var43 + var6[0];
               }

               label354: {
                  boolean var47 = var54;
                  if (var46) {
                     if (var7 >= 1363213817) {
                        throw new IllegalStateException();
                     }

                     if (var47) {
                        if (var7 >= 1363213817) {
                           throw new IllegalStateException();
                        }

                        var54 = 1;
                        break label354;
                     }
                  }

                  var54 = 0;
               }

               byte var45 = var54;
               if (var45 > 0) {
                  if (var7 >= 1363213817) {
                     throw new IllegalStateException();
                  }

                  if (var3) {
                     if (var7 >= 1363213817) {
                        throw new IllegalStateException();
                     }

                     if (var6[0] < var2) {
                        if (var7 >= 1363213817) {
                           throw new IllegalStateException();
                        }

                        var6[0] = var2;
                        return var45;
                     }
                  }

                  if (var5) {
                     if (var7 >= 1363213817) {
                        throw new IllegalStateException();
                     }

                     if (var6[0] > var4) {
                        var6[0] = var4;
                     }
                  }
               }

               return var45;
            } else {
               classUW var12 = new classUW(var10, var1);
               float[] var13 = new float[1 + var1];

               for (int var14 = 1; var14 <= var1; var14++) {
                  if (var7 >= 1363213817) {
                     throw new IllegalStateException();
                  }

                  var13[var14 - 1] = var10[var14] * var14;
               }

               float[] var48 = new float[1 + var1];
               int var15 = method3916(var13, var1 - 1, var2, false, var4, false, var48, 743817263);
               if (var15 == -1) {
                  return 0;
               } else {
                  boolean var16 = false;
                  float var18 = 0.0F;
                  float var19 = 0.0F;
                  float var20 = 0.0F;

                  for (int var21 = 0; var21 <= var15; var21++) {
                     if (var7 >= 1363213817) {
                        throw new IllegalStateException();
                     }

                     if (var44 > var1) {
                        return var44;
                     }

                     float var17;
                     if (0 == var21) {
                        if (var7 >= 1363213817) {
                           throw new IllegalStateException();
                        }

                        var17 = var2;
                        var19 = classGF.method5427(var10, var1, var2, (byte)10);
                        if (Math.abs(var19) <= var43) {
                           if (var7 >= 1363213817) {
                              throw new IllegalStateException();
                           }

                           if (var3) {
                              var6[var44++] = var2;
                           }
                        }
                     } else {
                        var17 = var20;
                        var19 = var18;
                     }

                     if (var15 == var21) {
                        if (var7 >= 1363213817) {
                           throw new IllegalStateException();
                        }

                        var20 = var4;
                        var16 = false;
                     } else {
                        var20 = var48[var21];
                     }

                     var18 = classGF.method5427(var10, var1, var20, (byte)10);
                     if (var16) {
                        if (var7 >= 1363213817) {
                           throw new IllegalStateException();
                        }

                        var16 = false;
                     } else if (Math.abs(var18) < var43) {
                        if (var7 >= 1363213817) {
                           throw new IllegalStateException();
                        }

                        if (var15 == var21) {
                           if (var7 >= 1363213817) {
                              throw new IllegalStateException();
                           }

                           if (!var5) {
                              continue;
                           }

                           if (var7 >= 1363213817) {
                              throw new IllegalStateException();
                           }
                        }

                        var6[var44++] = var20;
                        var16 = true;
                     } else {
                        label459: {
                           if (var19 < 0.0F) {
                              if (var18 > 0.0F) {
                                 break label459;
                              }

                              if (var7 >= 1363213817) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (!(var19 > 0.0F) || !(var18 < 0.0F)) {
                              continue;
                           }

                           if (var7 >= 1363213817) {
                              throw new IllegalStateException();
                           }
                        }

                        int var23 = var44++;
                        float var25 = var17;
                        float var26 = var20;
                        float var27 = classGF.method5427(var12.field6407, var12.field6406 * -234790521, var17, (byte)10);
                        float var24;
                        if (Math.abs(var27) < classST.field6039) {
                           if (var7 >= 1363213817) {
                              throw new IllegalStateException();
                           }

                           var24 = var17;
                        } else {
                           float var28 = classGF.method5427(var12.field6407, -234790521 * var12.field6406, var20, (byte)10);
                           if (Math.abs(var28) < classST.field6039) {
                              var24 = var20;
                           } else {
                              float var29 = 0.0F;
                              float var30 = 0.0F;
                              float var31 = 0.0F;
                              float var36 = 0.0F;
                              boolean var37 = true;
                              boolean var38 = false;

                              do {
                                 var38 = false;
                                 if (var37) {
                                    if (var7 >= 1363213817) {
                                       throw new IllegalStateException();
                                    }

                                    var29 = var25;
                                    var36 = var27;
                                    var30 = var26 - var25;
                                    var31 = var30;
                                    var37 = false;
                                 }

                                 if (Math.abs(var36) < Math.abs(var28)) {
                                    if (var7 >= 1363213817) {
                                       throw new IllegalStateException();
                                    }

                                    var25 = var26;
                                    var26 = var29;
                                    var29 = var25;
                                    var27 = var28;
                                    var28 = var36;
                                    var36 = var27;
                                 }

                                 float var39;
                                 float var40;
                                 boolean var53;
                                 label393: {
                                    var39 = classST.field6040 * Math.abs(var26) + 0.0F;
                                    var40 = 0.5F * (var29 - var26);
                                    if (Math.abs(var40) > var39) {
                                       if (var7 >= 1363213817) {
                                          throw new IllegalStateException();
                                       }

                                       if (var28 != 0.0F) {
                                          if (var7 >= 1363213817) {
                                             throw new IllegalStateException();
                                          }

                                          var53 = true;
                                          break label393;
                                       }
                                    }

                                    var53 = false;
                                 }

                                 boolean var41 = var53;
                                 if (var41) {
                                    if (var7 >= 1363213817) {
                                       throw new IllegalStateException();
                                    }

                                    label384: {
                                       if (!(Math.abs(var31) < var39)) {
                                          if (var7 >= 1363213817) {
                                             throw new IllegalStateException();
                                          }

                                          if (!(Math.abs(var27) <= Math.abs(var28))) {
                                             float var35 = var28 / var27;
                                             float var32;
                                             float var33;
                                             if (var25 == var29) {
                                                if (var7 >= 1363213817) {
                                                   throw new IllegalStateException();
                                                }

                                                var32 = var35 * (var40 * 2.0F);
                                                var33 = 1.0F - var35;
                                             } else {
                                                var33 = var27 / var36;
                                                float var34 = var28 / var36;
                                                var32 = var35 * (var40 * 2.0F * var33 * (var33 - var34) - (var26 - var25) * (var34 - 1.0F));
                                                var33 = (var34 - 1.0F) * (var33 - 1.0F) * (var35 - 1.0F);
                                             }

                                             if (var32 > 0.0) {
                                                if (var7 >= 1363213817) {
                                                   throw new IllegalStateException();
                                                }

                                                var33 = -var33;
                                             } else {
                                                var32 = -var32;
                                             }

                                             var35 = var31;
                                             var31 = var30;
                                             if (var32 * 2.0F < var33 * (var40 * 3.0F) - Math.abs(var39 * var33) && var32 < Math.abs(0.5F * var35 * var33)) {
                                                var30 = var32 / var33;
                                                break label384;
                                             }

                                             var30 = var40;
                                             var31 = var40;
                                             break label384;
                                          }

                                          if (var7 >= 1363213817) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       var30 = var40;
                                       var31 = var40;
                                    }

                                    var25 = var26;
                                    var27 = var28;
                                    if (Math.abs(var30) > var39) {
                                       if (var7 >= 1363213817) {
                                          throw new IllegalStateException();
                                       }

                                       var26 += var30;
                                    } else if (var40 > 0.0) {
                                       if (var7 >= 1363213817) {
                                          throw new IllegalStateException();
                                       }

                                       var26 += var39;
                                    } else {
                                       var26 -= var39;
                                    }

                                    var28 = classGF.method5427(var12.field6407, -234790521 * var12.field6406, var26, (byte)10);
                                    if (var28 * (var36 / Math.abs(var36)) > 0.0) {
                                       if (var7 >= 1363213817) {
                                          throw new IllegalStateException();
                                       }

                                       var37 = true;
                                       var38 = true;
                                    } else {
                                       var38 = true;
                                    }
                                 }
                              } while (var38);

                              var24 = var26;
                           }
                        }

                        var6[var23] = var24;
                        if (var44 > 1) {
                           if (var7 >= 1363213817) {
                              throw new IllegalStateException();
                           }

                           if (var6[var44 - 2] >= var6[var44 - 1] - var43) {
                              if (var7 >= 1363213817) {
                                 throw new IllegalStateException();
                              }

                              var6[var44 - 2] = 0.5F * (var6[var44 - 1] + var6[var44 - 2]);
                              var44--;
                           }
                        }
                     }
                  }

                  return var44;
               }
            }
         }
      } catch (RuntimeException var42) {
         throw classEG.newRunException(var42, "el.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;B)I")
   @ObfuscatedName("az")
   int method3917(Buddy var1, Buddy var2, byte var3) {
      try {
         if (var1.field5670 * -760305529 == client.field1081 * 1311484143) {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            if (-760305529 * var2.field5671 == 1311484143 * client.field1033) {
               if (var3 != -1) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.field1780) {
                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }

                  var10000 = classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519);
               } else {
                  var10000 = classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
               }

               return var10000;
            }
         }

         return classRD.method9942(this, var1, var2, 2022984694);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "el.az(" + 41);
      }
   }
}
