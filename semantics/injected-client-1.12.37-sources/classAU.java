import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("au")
public class classAU extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("cb")
   public static final int field286 = 1009;
   @ObfuscatedSignature(descriptor = "Lad;")
   @ObfuscatedName("az")
   classAD field280;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field281 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field283 = 29;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final int field285 = 117;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field282 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field284 = 42;

   @ObfuscatedSignature(descriptor = "(I)Laj;")
   @ObfuscatedName("ab")
   classAJ method708(int var1) {
      try {
         if (this.field280.field138 == null) {
            if (var1 <= 50554122) {
               throw new IllegalStateException();
            }

            this.field280.field138 = this.field280.field137.method972(null);
            this.field280.field137 = null;
         }

         return this.field280.field138;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "au.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   public boolean method696(int var1) {
      try {
         boolean var10000;
         if (null == this.field280) {
            if (var1 != 918580135) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "au.az(" + ')');
      }
   }

   public classAU(classAJ var1) {
      this.field280 = new classAD(null, var1);
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ay")
   public classAJ method705() {
      if (null != this.field280) {
         this.field280.field139.lock();

         classAJ var1;
         try {
            var1 = this.method708(1790508884);
         } finally {
            this.field280.field139.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Ljava/lang/String;")
   @ObfuscatedName("yz")
   public static String method714(classPL var0) {
      return var0.field5293;
   }

   @ObfuscatedSignature(descriptor = "(I)Laj;")
   @ObfuscatedName("ae")
   public classAJ method706(int var1) {
      try {
         if (null != this.field280) {
            if (var1 <= 883542634) {
               throw new IllegalStateException();
            } else {
               this.field280.field139.lock();

               classAJ var2;
               try {
                  var2 = this.method708(1896592008);
               } finally {
                  this.field280.field139.unlock();
               }

               return var2;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "au.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ao")
   public classAJ method699() {
      if (null != this.field280 && this.field280.field139.tryLock()) {
         classAJ var1;
         try {
            var1 = this.method708(207218594);
         } finally {
            this.field280.field139.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   public boolean method697() {
      return null == this.field280;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;IIIIIIB)V")
   @ObfuscatedName("as")
   static void method715(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      if (Scene.method4436(var1, true)) {
         int var15 = var7;
         int var14 = var6;
         int var13 = var5;
         int var12 = var4;
         int var11 = var3;
         int var10 = var2;
         Actor var9 = var1;
         WorldView var60 = var0;
         byte var16 = 9;

         try {
            if (var9 != null) {
               if (var16 <= 2) {
                  throw new IllegalStateException();
               }

               if (var9.vmethod262((byte)117)) {
                  if (var9 instanceof NPC) {
                     if (var16 <= 2) {
                        throw new IllegalStateException();
                     }

                     classPL var17 = ((NPC)var9).definition;
                     if (var17.field5325 != null) {
                        var17 = var17.method8955(652890385);
                     }

                     if (null == var17) {
                        if (var16 <= 2) {
                           throw new IllegalStateException();
                        }

                        return;
                     }
                  }

                  classDF var61 = client.field837;
                  Font var18 = classBB.field341;
                  Font var19 = classVP.field6550;
                  int var20 = client.field870 * 2102667627;
                  classKQ var21 = client.field941;
                  int var22 = -2087374717 * client.field837.field1419;
                  int[] var23 = var61.field1423;
                  boolean var10000;
                  if (var10 < var22) {
                     if (var16 <= 2) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var24;
                  int var25;
                  var24 = var10000;
                  var25 = -2;
                  label805:
                  if (client.method2262(1) && null != var9.overheadText) {
                     if (var24) {
                        if (var16 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (var9.field1458) {
                           break label805;
                        }

                        if (var16 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (var20 != 4) {
                           if (var16 <= 2) {
                              throw new IllegalStateException();
                           }

                           if (var9.field1503) {
                              break label805;
                           }

                           if (var20 != 0 && 3 != var20) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              if (1 != var20) {
                                 break label805;
                              }

                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              if (!((Player)var9).method2622(1616991476)) {
                                 break label805;
                              }

                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     GrandExchangeOffer.method7620(var60, var9, var9.vmethod373(1468278006), 2054255495);
                     if (1269689307 * classCE.field690 > -1) {
                        if (var16 <= 2) {
                           return;
                        }

                        if (classCE.field689 * 1111851887 < -1479123829 * classCE.field691) {
                           if (var16 <= 2) {
                              throw new IllegalStateException();
                           }

                           classCE.field695[classCE.field689 * 1111851887] = var18.method36(var9.overheadText) / 2;
                           classCE.field694[classCE.field689 * 1111851887] = var18.field8;
                           classCE.field692[1111851887 * classCE.field689] = 1269689307 * classCE.field690;
                           classCE.field703[classCE.field689 * 1111851887] = -690353985 * classCE.field700 - var25;
                           classCE.field693[1111851887 * classCE.field689] = 414414391 * var9.field1460;
                           classCE.field697[1111851887 * classCE.field689] = 1831374229 * var9.field1481;
                           classCE.field696[1111851887 * classCE.field689] = 317527437 * var9.field1459;
                           classCE.field698[classCE.field689 * 1111851887] = var9.field1438;
                           classCE.field699[classCE.field689 * 1111851887] = var9.overheadText;
                           classCE.field689 += 867122063;
                           var25 += 12;
                        }
                     }
                  }

                  WorldEntity var26 = classCL.method1601(client.field814, -1105444433 * var9.field1439, -1179824897);
                  if (null == var26 || !var26.method10558(1352269382)) {
                     if (!var9.field1442.method8179()) {
                        if (var16 <= 2) {
                           throw new IllegalStateException();
                        }

                        GrandExchangeOffer.method7620(var60, var9, var9.vmethod373(1468278006) + 15, 2054255495);
                        if (!client.method2262(1073741824)) {
                           return;
                        }

                        for (classCO var27 = (classCO)var9.field1442.method8167(); var27 != null; var27 = (classCO)classAAX.method294(var9.field1442)) {
                           classCV var28 = var27.method2562(var15, -1606368617);
                           if (var28 != null) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              HealthBarDefinition var29;
                              SpritePixels var30;
                              SpritePixels var31;
                              int var32;
                              int var33;
                              label774: {
                                 var29 = var27.field1177;
                                 var30 = var29.method9368((byte)-90);
                                 var31 = var29.method9365(782773199);
                                 var33 = 0;
                                 if (var30 != null) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (null != var31) {
                                       if (var16 <= 2) {
                                          throw new IllegalStateException();
                                       }

                                       if (545947590 * var29.field5486 < var31.field7007) {
                                          if (var16 <= 2) {
                                             throw new IllegalStateException();
                                          }

                                          var33 = -1874509853 * var29.field5486;
                                       }

                                       var32 = var31.field7007 - 2 * var33;
                                       break label774;
                                    }
                                 }

                                 var32 = var29.field5485 * -1485258143;
                              }

                              int var34 = 255;
                              int var35 = -1;
                              int var36 = var15 - 1576496181 * var28.field1300;
                              int var37 = var28.field1299 * -808970489 * var32 / (-1485258143 * var29.field5485);
                              if (-425086145 * var28.field1297 > var36) {
                                 if (var16 <= 2) {
                                    throw new IllegalStateException();
                                 }

                                 int var38 = var29.field5483 * -822457041 == 0 ? 0 : var36 / (var29.field5483 * -822457041) * var29.field5483 * -822457041;
                                 int var39 = var32 * var28.field1298 * -545900307 / (-1485258143 * var29.field5485);
                                 var35 = var39 + (var37 - var39) * var38 / (-425086145 * var28.field1297);
                              } else {
                                 var35 = var37;
                                 int var92 = var28.field1297 * -425086145 + -1486866911 * var29.field5480 - var36;
                                 if (597861161 * var29.field5477 >= 0) {
                                    if (var16 <= 2) {
                                       return;
                                    }

                                    var34 = (var92 << 8) / (var29.field5480 * -1486866911 - 597861161 * var29.field5477);
                                 }
                              }

                              if (var28.field1299 * -808970489 > 0) {
                                 if (var16 <= 2) {
                                    return;
                                 }

                                 if (var35 < 1) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    var35 = 1;
                                 }
                              }

                              if (null != var30) {
                                 if (var16 <= 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var31 != null) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var32 == var35) {
                                       if (var16 <= 2) {
                                          throw new IllegalStateException();
                                       }

                                       var35 += var33 * 2;
                                    } else {
                                       var35 += var33;
                                    }

                                    label761: {
                                       int var94 = var30.field7009;
                                       var25 += var94;
                                       int var97 = var11 + classCE.field690 * 1269689307 - (var32 >> 1);
                                       int var40 = -690353985 * classCE.field700 + var12 - var25;
                                       var97 -= var33;
                                       if (var34 >= 0) {
                                          if (var16 <= 2) {
                                             throw new IllegalStateException();
                                          }

                                          if (var34 < 255) {
                                             if (var16 <= 2) {
                                                return;
                                             }

                                             SpritePixels.method13523(var30, var97, var40, var34);
                                             classYW.method13674(var97, var40, var35 + var97, var40 + var94);
                                             SpritePixels.method13523(var31, var97, var40, var34);
                                             break label761;
                                          }
                                       }

                                       SpritePixels.method13511(var30, var97, var40);
                                       classYW.method13674(var97, var40, var35 + var97, var40 + var94);
                                       SpritePixels.method13511(var31, var97, var40);
                                    }

                                    classYW.method13671(var11, var12, var11 + var13, var12 + var14);
                                    var25 += 2;
                                    continue;
                                 }
                              }

                              var25 += 5;
                              if (classCE.field690 * 1269689307 > -1) {
                                 int var93 = classCE.field690 * 1269689307 + var11 - (var32 >> 1);
                                 int var96 = classCE.field700 * -690353985 + var12 - var25;
                                 classYW.method13698(var93, var96, var35, 5, 65280);
                                 classYW.method13698(var35 + var93, var96, var32 - var35, 5, 16711680);
                              }

                              var25 += 2;
                           } else if (var27.method2566((byte)32)) {
                              var27.vmethod398();
                           }
                        }
                     }

                     if (var25 == -2) {
                        if (var16 <= 2) {
                           throw new IllegalStateException();
                        }

                        var25 += 7;
                     }

                     if (var24 && var15 == -741500243 * var9.field1490) {
                        Player var70 = (Player)var9;
                        boolean var66;
                        if (0 == -1072700981 * client.field852) {
                           if (var16 <= 2) {
                              return;
                           }

                           var66 = false;
                        } else if (-1315528093 * var70.field1480 != client.field845 * -2130951373) {
                           if (var16 <= 2) {
                              throw new IllegalStateException();
                           }

                           boolean var73 = classDB.method2887((byte)-5);
                           if (!var73) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              if ((client.field852 * -1072700981 & 1) != 0) {
                                 if (var16 <= 2) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              label736: {
                                 boolean var77 = var10000;
                                 if (var77) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var70.method2622(-7537203)) {
                                       if (var16 <= 2) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = true;
                                       break label736;
                                    }
                                 }

                                 var10000 = false;
                              }

                              var73 = var10000;
                           }

                           label861: {
                              label725:
                              if (!var73) {
                                 if (var16 <= 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (classTW.method11210(-811881628)) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (Player.method2629(var70, -2018184281)) {
                                       if (var16 <= 2) {
                                          throw new IllegalStateException();
                                       }
                                       break label725;
                                    }
                                 }

                                 var10000 = false;
                                 break label861;
                              }

                              var10000 = true;
                           }

                           var66 = var10000;
                        } else {
                           var66 = classKC.method6459(-1600093149);
                        }

                        if (var66) {
                           if (var16 <= 2) {
                              throw new IllegalStateException();
                           }

                           Player var74 = (Player)var9;
                           if (var24) {
                              GrandExchangeOffer.method7620(var60, var9, var9.vmethod373(1468278006) + 15, 2054255495);
                              var25 += 4;
                              var19.method65(
                                 var74.field1283.method164(1749335415),
                                 1269689307 * classCE.field690 + var11,
                                 classCE.field700 * -690353985 + var12 - var25,
                                 16777215,
                                 0
                              );
                              var25 += 18;
                           }
                        }
                     }

                     if (var24) {
                        if (var16 <= 2) {
                           throw new IllegalStateException();
                        }

                        Player var67 = (Player)var9;
                        if (var67.field1259) {
                           if (var16 <= 2) {
                              throw new IllegalStateException();
                           }

                           return;
                        }

                        label693: {
                           if (-1 == var67.field1271 * 1605395471) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              if (-325171935 * var67.field1266 == -1) {
                                 break label693;
                              }

                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }
                           }

                           GrandExchangeOffer.method7620(var60, var9, var9.vmethod373(1468278006) + 15, 2054255495);
                           if (classCE.field690 * 1269689307 > -1) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              if (1605395471 * var67.field1271 != -1) {
                                 var25 += 25;
                                 SpritePixels.method13511(
                                    classUO.field6361[var67.field1271 * 1605395471],
                                    1269689307 * classCE.field690 + var11 - 12,
                                    var12 + -690353985 * classCE.field700 - var25
                                 );
                              }

                              if (-1 != var67.field1266 * -325171935) {
                                 if (var16 <= 2) {
                                    return;
                                 }

                                 var25 += 25;
                                 SpritePixels.method13511(
                                    classCE.field713[-325171935 * var67.field1266],
                                    classCE.field690 * 1269689307 + var11 - 12,
                                    classCE.field700 * -690353985 + var12 - var25
                                 );
                              }
                           }
                        }

                        if (var10 >= 0) {
                           if (var16 <= 2) {
                              return;
                           }

                           if (var21.method6529(44499372) == 3 && var21.method6533(-1230988124) == var23[var10]) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              GrandExchangeOffer.method7620(var60, var9, var9.vmethod373(1468278006) + 15, 2054255495);
                              if (1269689307 * classCE.field690 > -1) {
                                 var25 += classCE.field714[1].field7009;
                                 SpritePixels.method13511(
                                    classCE.field714[1], var11 + 1269689307 * classCE.field690 - 12, -690353985 * classCE.field700 + var12 - var25
                                 );
                              }
                           }
                        }
                     } else {
                        NPC var68 = (NPC)var9;
                        int[] var71 = var68.method3460(-1005955860);
                        short[] var75 = NPC.method3462(var68, 869496718);
                        if (null != var75) {
                           if (var16 <= 2) {
                              throw new IllegalStateException();
                           }

                           if (null != var71) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              for (int var78 = 0; var78 < var75.length; var78++) {
                                 if (var16 <= 2) {
                                    throw new IllegalStateException();
                                 }

                                 if (var75[var78] >= 0) {
                                    if (var16 <= 2) {
                                       return;
                                    }

                                    if (var71[var78] < 0) {
                                       if (var16 <= 2) {
                                          return;
                                       }
                                    } else {
                                       long var80 = (long)var71[var78] << 8 | var75[var78];
                                       SpritePixels var83 = (SpritePixels)classCE.field702.method9981(var80, (byte)35);
                                       if (null == var83) {
                                          if (var16 <= 2) {
                                             throw new IllegalStateException();
                                          }

                                          SpritePixels[] var85 = classIR.method6307(classHC.field2767, var71[var78], 0, -1253680523);
                                          if (null != var85) {
                                             if (var16 <= 2) {
                                                throw new IllegalStateException();
                                             }

                                             if (var75[var78] < var85.length) {
                                                if (var16 <= 2) {
                                                   throw new IllegalStateException();
                                                }

                                                var83 = var85[var75[var78]];
                                                classCE.field702.method9982(var80, var83, (byte)1);
                                             }
                                          }
                                       }

                                       if (null != var83) {
                                          if (var16 <= 2) {
                                             return;
                                          }

                                          GrandExchangeOffer.method7620(var60, var9, var9.vmethod373(1468278006) + 15, 2054255495);
                                          if (1269689307 * classCE.field690 > -1) {
                                             if (var16 <= 2) {
                                                throw new IllegalStateException();
                                             }

                                             SpritePixels.method13511(
                                                var83,
                                                var11 + 1269689307 * classCE.field690 - (var83.field7007 >> 1),
                                                -690353985 * classCE.field700 + ((var12 - var83.field7009 - 2) * (1 + var78) - var83.field7009) - 4
                                             );
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        if (var21.method6529(-1345505790) == 1) {
                           if (var16 <= 2) {
                              throw new IllegalStateException();
                           }

                           if (var21.method6533(-354054755) == var60.field1697.method14001(var10 - var22, 1586536531)) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }

                              if (var15 % 20 < 10) {
                                 if (var16 <= 2) {
                                    throw new IllegalStateException();
                                 }

                                 GrandExchangeOffer.method7620(var60, var9, var9.vmethod373(1468278006) + 15, 2054255495);
                                 if (classCE.field690 * 1269689307 > -1) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    SpritePixels.method13511(
                                       classCE.field714[0], classCE.field690 * 1269689307 + var11 - 12, -690353985 * classCE.field700 + var12 - 28
                                    );
                                 }
                              }
                           }
                        }
                     }

                     if (var9.field1434.isEmpty()) {
                        if (var16 <= 2) {
                           throw new IllegalStateException();
                        }
                     } else {
                        GrandExchangeOffer.method7620(var60, var9, var9.vmethod373(1468278006) / 2, 2054255495);

                        for (int var69 = 0; var69 < var9.field1434.size(); var69++) {
                           classDV var72 = (classDV)var9.field1434.get(var69);
                           if (var72.method3619(1750402749) <= var15) {
                              if (var16 <= 2) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              classPW var76 = PacketWriter.method3373(var72.method3615(-1499119738), (byte)6);
                              if (var76.field5455 != null) {
                                 if (var16 <= 2) {
                                    throw new IllegalStateException();
                                 }

                                 var76 = classPW.method9331(var76, (byte)37);
                                 if (var76 == null) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }

                              if (var72.method3619(1597161256) - var76.field5448 * -265436849 > var15) {
                                 if (var16 <= 2) {
                                    throw new IllegalStateException();
                                 }
                              } else {
                                 byte var79 = 2;
                                 SpritePixels var81 = var76.method9339(-528056669);
                                 SpritePixels var82 = var76.method9346(1009762333);
                                 SpritePixels var84 = var76.method9342(194562629);
                                 SpritePixels var86 = classPW.method9351(var76, 21303142);
                                 Font var89 = var76.method9354(943769960);
                                 if (null == var89) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    var89 = classQJ.field5556;
                                 }

                                 int var95;
                                 int var99;
                                 int var90 = var72.method3622((short)8173);
                                 String var91 = classPW.method9336(var76, var90, 1842947557);
                                 var95 = var89.method36(var91);
                                 var99 = 0;
                                 label620:
                                 if (null != var84) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    if (var82 == null) {
                                       if (null == var86) {
                                          var99 = 1;
                                          break label620;
                                       }

                                       if (var16 <= 2) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    var99 = var95 / var84.field7007 + 1;
                                 }

                                 int var100 = 0;
                                 if (var81 != null) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    var100 = var81.field7007;
                                 }

                                 var100 += 2;
                                 int var41 = var100;
                                 if (null != var82) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    var100 += var82.field7007;
                                 }

                                 int var42 = var100;
                                 int var43 = var100;
                                 if (var84 != null) {
                                    int var44 = var84.field7007 * var99;
                                    var100 += var44;
                                    var43 = var100 + (var44 - var95) / 2;
                                 } else {
                                    var100 += var95;
                                 }

                                 int var103 = var100;
                                 if (null != var86) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    var100 += var86.field7007;
                                 }

                                 byte var45 = classWV.field6782[var69 << 1];
                                 byte var47 = classWV.field6782[var69 << 1 | 1];
                                 int var49 = classCE.field690 * 1269689307 + var45;
                                 int var50 = var47 + -690353985 * classCE.field700;
                                 int var51 = var72.method3619(259837900) - var15;
                                 int var52 = -175799565 * var76.field5453 - var51 * -175799565 * var76.field5453 / (-265436849 * var76.field5448);
                                 int var53 = -(525276423 * var76.field5449) + 525276423 * var76.field5449 * var51 / (var76.field5448 * -265436849);
                                 int var54 = var49 + var11 - (var100 >> 1) + var52;
                                 int var55 = var53 + (var50 + var12 - 12);
                                 int var56 = var55 + 15 + var76.field5461 * 1496284667;
                                 int var57 = 255;
                                 if (585026425 * var76.field5458 >= 0) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    var57 = (var51 << 8) / (var76.field5448 * -265436849 - var76.field5458 * 585026425);
                                 }

                                 if (var57 >= 0) {
                                    if (var16 <= 2) {
                                       break;
                                    }

                                    if (var57 < 255) {
                                       if (var16 <= 2) {
                                          break;
                                       }

                                       if (null != var81) {
                                          SpritePixels.method13523(var81, var54 - var81.field7010, var55, var57);
                                       }

                                       if (var82 != null) {
                                          SpritePixels.method13523(var82, var54 + var41 - var82.field7010, var55, var57);
                                       }

                                       if (null != var84) {
                                          if (var16 <= 2) {
                                             break;
                                          }

                                          for (int var104 = 0; var104 < var99; var104++) {
                                             if (var16 <= 2) {
                                                throw new IllegalStateException();
                                             }

                                             SpritePixels.method13523(var84, var104 * var84.field7007 + (var42 + var54 - var84.field7010), var55, var57);
                                          }
                                       }

                                       if (null != var86) {
                                          if (var16 <= 2) {
                                             throw new IllegalStateException();
                                          }

                                          SpritePixels.method13523(var86, var54 + var103 - var86.field7010, var55, var57);
                                       }

                                       AbstractFont.method58(
                                          var89,
                                          classPW.method9336(var76, var72.method3622((short)7461), 530831433),
                                          var43 + var54,
                                          var56,
                                          682377569 * var76.field5454,
                                          0,
                                          var57
                                       );
                                       continue;
                                    }
                                 }

                                 if (var81 != null) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    SpritePixels.method13511(var81, var54 - var81.field7010, var55);
                                 }

                                 if (null != var82) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    SpritePixels.method13511(var82, var41 + var54 - var82.field7010, var55);
                                 }

                                 if (null != var84) {
                                    if (var16 <= 2) {
                                       throw new IllegalStateException();
                                    }

                                    for (int var58 = 0; var58 < var99; var58++) {
                                       if (var16 <= 2) {
                                          throw new IllegalStateException();
                                       }

                                       SpritePixels.method13511(var84, var84.field7007 * var58 + (var42 + var54 - var84.field7010), var55);
                                    }
                                 }

                                 if (var86 != null) {
                                    if (var16 <= 2) {
                                       break;
                                    }

                                    SpritePixels.method13511(var86, var54 + var103 - var86.field7010, var55);
                                 }

                                 var89.method56(
                                    classPW.method9336(var76, var72.method3622((short)-6749), -1354391897),
                                    var54 + var43,
                                    var56,
                                    682377569 * var76.field5454 | 0xFF000000,
                                    0
                                 );
                              }
                           }
                        }
                     }
                  }
               }
            }
         } catch (RuntimeException var59) {
            throw classEG.newRunException(var59, "au.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ax")
   public classAJ method700() {
      if (null != this.field280 && this.field280.field139.tryLock()) {
         classAJ var1;
         try {
            var1 = this.method708(1213681298);
         } finally {
            this.field280.field139.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("aa")
   public classAJ method701() {
      if (null != this.field280 && this.field280.field139.tryLock()) {
         classAJ var1;
         try {
            var1 = this.method708(2143594419);
         } finally {
            this.field280.field139.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   public classAU() {
      this.field280 = null;
   }

   classAU(classBC var1) {
      if (var1 != null) {
         this.field280 = new classAD(var1, null);
      }
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("aq")
   classAJ method709() {
      if (this.field280.field138 == null) {
         this.field280.field138 = this.field280.field137.method972(null);
         this.field280.field137 = null;
      }

      return this.field280.field138;
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ad")
   classAJ method710() {
      if (this.field280.field138 == null) {
         this.field280.field138 = this.field280.field137.method972(null);
         this.field280.field137 = null;
      }

      return this.field280.field138;
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ap")
   classAJ method711() {
      if (this.field280.field138 == null) {
         this.field280.field138 = this.field280.field137.method972(null);
         this.field280.field137 = null;
      }

      return this.field280.field138;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)Laj;")
   @ObfuscatedName("sj")
   public static classAJ method707(classAU var0) {
      if (null != var0.field280) {
         var0.field280.field139.lock();

         classAJ var1;
         try {
            var1 = var0.method708(946478713);
         } finally {
            var0.field280.field139.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)I")
   @ObfuscatedName("az")
   static final int method695(int var0, int var1, int var2, int var3, int var4) {
      try {
         return var3 * var1 + var2 * var0 >> 16;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "au.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("aa")
   static void method713(int var0, int var1, int var2, int var3) {
      try {
         short var4 = 128;
         short var5 = 128;
         int var6 = classKY.method6605(classIS.field3053.field1696 * 1296729483 - 2, 289463597);
         int var7 = classKY.method6605(classIS.field3053.field1692 * -1269171107 - 2, 283219116);
         if (var0 >= var4) {
            if (var3 <= -278083205) {
               throw new IllegalStateException();
            }

            if (var6 >= var0) {
               if (var3 <= -278083205) {
                  return;
               }

               if (var1 >= var5) {
                  if (var3 <= -278083205) {
                     return;
                  }

                  if (var7 >= var1) {
                     var0 -= -325062789 * classKI.field3598;
                     var2 -= classNL.field4684 * 1615527037;
                     var1 -= classAI.field167 * 1343311673;
                     int var8 = client.field914.method11443(378090433);
                     int var9 = classUP.method11445(client.field914, (byte)-40);
                     int var10 = client.field796.method11443(882641471);
                     int var11 = classUP.method11445(client.field796, (byte)5);
                     int var12 = var10 * var1 + var0 * var11 >> 16;
                     var1 = var11 * var1 - var0 * var10 >> 16;
                     var12 = var9 * var2 - var8 * var1 >> 16;
                     var1 = var9 * var1 + var8 * var2 >> 16;
                     if (var1 >= 50) {
                        classCE.field690 = 562042963 * (client.field878 * 1129651895 * var12 / var1 + client.field990 * 27064125 / 2);
                        classCE.field700 = 854419263 * (1158148203 * client.field982 / 2 + client.field878 * 1129651895 * var12 / var1);
                     } else {
                        classCE.field690 = -562042963;
                        classCE.field700 = -854419263;
                     }

                     return;
                  }

                  if (var3 <= -278083205) {
                     return;
                  }
               }
            }
         }

         classCE.field690 = -562042963;
         classCE.field700 = -854419263;
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "au.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I")
   @ObfuscatedName("bd")
   public static int method712(String var0, byte var1) {
      try {
         return var0.length() + 1;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "au.bd(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Laj;")
   @ObfuscatedName("ac")
   public classAJ method702() {
      if (null != this.field280 && this.field280.field139.tryLock()) {
         classAJ var1;
         try {
            var1 = this.method708(1346589853);
         } finally {
            this.field280.field139.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Laj;")
   @ObfuscatedName("af")
   public classAJ method703(int var1) {
      try {
         if (null == this.field280 || !this.field280.field139.tryLock()) {
            return null;
         } else if (var1 <= 2698021) {
            throw new IllegalStateException();
         } else {
            classAJ var2;
            try {
               var2 = this.method708(682434643);
            } finally {
               this.field280.field139.unlock();
            }

            return var2;
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "au.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lau;I)Laj;")
   @ObfuscatedName("my")
   public static classAJ method704(classAU var0, int var1) {
      if (var0 == null) {
         return var0.method703(var1);
      } else {
         try {
            if (null == var0.field280 || !var0.field280.field139.tryLock()) {
               return null;
            } else if (var1 <= 2698021) {
               throw new IllegalStateException();
            } else {
               classAJ var2;
               try {
                  var2 = var0.method708(682434643);
               } finally {
                  var0.field280.field139.unlock();
               }

               return var2;
            }
         } catch (RuntimeException var7) {
            throw classEG.newRunException(var7, "au.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method698() {
      return null == this.field280;
   }
}
