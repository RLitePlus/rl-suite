import java.io.IOException;
import java.util.Map;
import net.runelite.api.ChatMessageType;
import net.runelite.api.MessageNode;
import net.runelite.api.events.ChatMessage;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fm")
public class classFM extends classVQ {
   @ObfuscatedName("ag")
   public int field2307;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field2310 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field2314 = 0;
   @ObfuscatedName("ae")
   public int field2305;
   @ObfuscatedName("ab")
   public int field2308;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field2316 = 24;
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ln")
   static classCX field2318;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field2312 = 13;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("as")
   public classLW field2306;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field2309 = 3353893;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field2317 = 68;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field2311 = 20;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field2313 = 21;
   @ObfuscatedName("bj")
   static int field2315;

   public classFM(int var1, int var2, int var3, classLW var4) {
      this.field2308 = var1 * -595683489;
      this.field2307 = -1061876549 * var2;
      this.field2305 = var3 * 1244177423;
      this.field2306 = var4;
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ax")
   public static boolean method4846(int var0, byte var1) {
      try {
         if (classNP.field4699.isEmpty()) {
            return false;
         } else {
            classNB var2 = (classNB)classNP.field4699.get(0);
            if (var2 != null) {
               if (var1 == 3) {
                  throw new IllegalStateException();
               }

               if (var0 == 1942111947 * var2.field4632) {
                  if (var1 == 3) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "fm.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
   @ObfuscatedName("af")
   static void method4848(int var0, String var1, String var2, String var3, byte var4) {
      String var13 = var3;
      String var12 = var2;
      String var11 = var1;
      int var10 = var0;
      byte var14 = 81;

      try {
         classBV var15 = (classBV)classCN.field1171.get(var10);
         if (null == var15) {
            if (var14 == 0) {
               throw new IllegalStateException();
            }

            var15 = new classBV();
            classCN.field1171.put(var10, var15);
         }

         classCG var16 = var15.method1249(var10, var11, var12, var13, -424837532);
         classYN.method13576(classCN.field1174, var16, var16.field725 * 707758669);
         classNZ.method8265(classCN.field1173, var16);
         classPV.method9261(client.field824, 1682853972);
      } catch (RuntimeException var17) {
         throw classEG.method3884(var17, "fm.af(" + ')');
      }

      Map var5 = classOE.field4843.getChatLineMap();
      classBV var6 = (classBV)var5.get(var0);
      MessageNode var7 = var6.getLines()[0];
      ChatMessageType var8 = ChatMessageType.of(var0);
      if (var8 == ChatMessageType.CLAN_CHAT && var2 != null && var2.startsWith("|")) {
         var8 = ChatMessageType.CLAN_GIM_CHAT;
         var2 = var2.substring(1);
      }

      if (var8 == ChatMessageType.CLAN_MESSAGE && var2 != null && var2.startsWith("|")) {
         var8 = ChatMessageType.CLAN_GIM_MESSAGE;
         var2 = var2.substring(1);
      }

      if (client.field1026.isDebugEnabled()) {
         String var9 = var8 == ChatMessageType.UNKNOWN ? String.valueOf(var0) : var8.name();
         client.field1026.debug("Chat message type {}: {}", var9, var2);
      }

      ChatMessage var18 = new ChatMessage(var7, var8, var1, var2, var3, var7.getTimestamp());
      classOE.field4843.getCallbacks().post(var18);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;I)V")
   @ObfuscatedName("ad")
   static final void method4847(classDZ var0, int var1) {
      try {
         int var2 = var0.field1696 * 1296729483;
         int var3 = var0.field1692 * -1269171107;
         int[][][] var4 = var0.field1688;
         byte[][][] var5 = var0.field1702;
         classEZ var6 = var0.field1689;
         classGC[] var7 = var0.field1687;

         for (int var8 = 0; var8 < 4; var8++) {
            if (var1 >= 500493205) {
               throw new IllegalStateException();
            }

            for (int var9 = 0; var9 < var2; var9++) {
               if (var1 >= 500493205) {
                  throw new IllegalStateException();
               }

               for (int var10 = 0; var10 < var3; var10++) {
                  if (var1 >= 500493205) {
                     return;
                  }

                  if (1 == (var0.field1702[var8][var9][var10] & 1)) {
                     if (var1 >= 500493205) {
                        throw new IllegalStateException();
                     }

                     int var11 = var8;
                     if ((var0.field1702[1][var9][var10] & 2) == 2) {
                        if (var1 >= 500493205) {
                           throw new IllegalStateException();
                        }

                        var11 = var8 - 1;
                     }

                     if (var11 >= 0) {
                        if (var1 >= 500493205) {
                           return;
                        }

                        if (var7 != null) {
                           if (var1 >= 500493205) {
                              throw new IllegalStateException();
                           }

                           var7[var11].method5364(var9, var10, -2018061884);
                        }
                     }
                  }
               }
            }
         }

         classDI.field1512 = classDI.field1512 + ((int)(Math.random() * 5.0) - 2) * 2133726259;
         if (classDI.field1512 * 1346569979 < -8) {
            if (var1 >= 500493205) {
               throw new IllegalStateException();
            }

            classDI.field1512 = 110059112;
         }

         if (1346569979 * classDI.field1512 > 8) {
            classDI.field1512 = -110059112;
         }

         classDI.field1506 = classDI.field1506 + ((int)(Math.random() * 5.0) - 2) * -93161891;
         if (-1223029259 * classDI.field1506 < -16) {
            if (var1 >= 500493205) {
               throw new IllegalStateException();
            }

            classDI.field1506 = 1490590256;
         }

         if (-1223029259 * classDI.field1506 > 16) {
            if (var1 >= 500493205) {
               throw new IllegalStateException();
            }

            classDI.field1506 = -1490590256;
         }

         for (int var54 = 0; var54 < 4; var54++) {
            if (var1 >= 500493205) {
               throw new IllegalStateException();
            }

            byte[][] var57 = classFE.field2250[var54];
            byte var60 = 96;
            short var62 = 768;
            byte var12 = -50;
            byte var13 = -10;
            byte var14 = -50;
            int var15 = (int)Math.sqrt(5100.0);
            int var16 = var15 * 768 >> 8;

            for (int var17 = 1; var17 < var3 - 1; var17++) {
               if (var1 >= 500493205) {
                  throw new IllegalStateException();
               }

               for (int var18 = 1; var18 < var2 - 1; var18++) {
                  if (var1 >= 500493205) {
                     return;
                  }

                  int var19 = var4[var54][var18 + 1][var17] - var4[var54][var18 - 1][var17];
                  int var20 = var4[var54][var18][1 + var17] - var4[var54][var18][var17 - 1];
                  int var21 = (int)Math.sqrt(65536 + var19 * var19 + var20 * var20);
                  int var22 = (var19 << 8) / var21;
                  int var23 = 65536 / var21;
                  int var24 = (var20 << 8) / var21;
                  int var25 = 96 + (-10 * var23 + var22 * -50 + -50 * var24) / var16;
                  int var26 = (var57[var18][var17] >> 1)
                     + (var57[var18][var17 - 1] >> 2)
                     + (var57[var18 - 1][var17] >> 2)
                     + (var57[1 + var18][var17] >> 3)
                     + (var57[var18][var17 + 1] >> 3);
                  classDI.field1517[var18][var17] = var25 - var26;
               }
            }

            for (int var69 = 0; var69 < var3; var69++) {
               classAB.field126[var69] = 0;
               classCR.field1229[var69] = 0;
               client.field1148[var69] = 0;
               classBI.field476[var69] = 0;
               classIC.field2941[var69] = 0;
            }

            for (int var70 = -5; var70 < 5 + var2; var70++) {
               if (var1 >= 500493205) {
                  throw new IllegalStateException();
               }

               for (int var73 = 0; var73 < var3; var73++) {
                  if (var1 >= 500493205) {
                     throw new IllegalStateException();
                  }

                  int var77 = 5 + var70;
                  if (var77 >= 0) {
                     if (var1 >= 500493205) {
                        throw new IllegalStateException();
                     }

                     if (var77 < var2) {
                        if (var1 >= 500493205) {
                           throw new IllegalStateException();
                        }

                        long var82 = (long)Math.pow(2.0, 15.0) - 1L;
                        int var93 = (int)var82;
                        int var98 = classDI.field1519[var54][var77][var73] & var93;
                        if (var98 > 0) {
                           if (var1 >= 500493205) {
                              throw new IllegalStateException();
                           }

                           classPH var111 = classIY.method6334(var98 - 1, 829043358);
                           classAB.field126[var73] = classAB.field126[var73] + -1415575461 * var111.field5250;
                           classCR.field1229[var73] = classCR.field1229[var73] + var111.field5255 * 618687933;
                           client.field1148[var73] = client.field1148[var73] + var111.field5253 * 1851728405;
                           classBI.field476[var73] = classBI.field476[var73] + var111.field5251 * 658768917;
                           classIC.field2941[var73]++;
                        }
                     }
                  }

                  int var83 = var70 - 5;
                  if (var83 >= 0) {
                     if (var1 >= 500493205) {
                        return;
                     }

                     if (var83 < var2) {
                        if (var1 >= 500493205) {
                           return;
                        }

                        long var88 = (long)Math.pow(2.0, 15.0) - 1L;
                        int var99 = (int)var88;
                        int var112 = classDI.field1519[var54][var83][var73] & var99;
                        if (var112 > 0) {
                           classPH var117 = classIY.method6334(var112 - 1, 760950480);
                           classAB.field126[var73] = classAB.field126[var73] - -1415575461 * var117.field5250;
                           classCR.field1229[var73] = classCR.field1229[var73] - var117.field5255 * 618687933;
                           client.field1148[var73] = client.field1148[var73] - var117.field5253 * 1851728405;
                           classBI.field476[var73] = classBI.field476[var73] - var117.field5251 * 658768917;
                           classIC.field2941[var73]--;
                        }
                     }
                  }
               }

               if (var70 >= 1) {
                  if (var1 >= 500493205) {
                     throw new IllegalStateException();
                  }

                  if (var70 < var2 - 1) {
                     int var74 = 0;
                     int var78 = 0;
                     int var84 = 0;
                     int var89 = 0;
                     int var94 = 0;

                     for (int var100 = -5; var100 < var3 + 5; var100++) {
                        int var113 = var100 + 5;
                        if (var113 >= 0) {
                           if (var1 >= 500493205) {
                              return;
                           }

                           if (var113 < var3) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              var74 += classAB.field126[var113];
                              var78 += classCR.field1229[var113];
                              var84 += client.field1148[var113];
                              var89 += classBI.field476[var113];
                              var94 += classIC.field2941[var113];
                           }
                        }

                        int var118 = var100 - 5;
                        if (var118 >= 0) {
                           if (var1 >= 500493205) {
                              return;
                           }

                           if (var118 < var3) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              var74 -= classAB.field126[var118];
                              var78 -= classCR.field1229[var118];
                              var84 -= client.field1148[var118];
                              var89 -= classBI.field476[var118];
                              var94 -= classIC.field2941[var118];
                           }
                        }

                        if (var100 >= 1) {
                           if (var1 >= 500493205) {
                              throw new IllegalStateException();
                           }

                           if (var100 < var3 - 1) {
                              if (client.field885) {
                                 if (var1 >= 500493205) {
                                    return;
                                 }

                                 if ((var5[0][var70][var100] & 2) == 0) {
                                    if (var1 >= 500493205) {
                                       return;
                                    }

                                    if (0 != (var5[var54][var70][var100] & 16)) {
                                       if (var1 >= 500493205) {
                                          return;
                                       }
                                       continue;
                                    }
                                 }
                              }

                              if (var54 < -791964067 * classDI.field1511) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 classDI.field1511 = 360312309 * var54;
                              }

                              long var122 = (long)Math.pow(2.0, 15.0) - 1L;
                              int var28 = (int)var122;
                              int var29 = classDI.field1519[var54][var70][var100] & var28;
                              int var30 = classCO.field1182[var54][var70][var100] & var28;
                              if (var29 <= 0) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 if (var30 <= 0) {
                                    continue;
                                 }

                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }
                              }

                              int var31 = var4[var54][var70][var100];
                              int var32 = var4[var54][var70 + 1][var100];
                              int var33 = var4[var54][var70 + 1][var100 + 1];
                              int var34 = var4[var54][var70][1 + var100];
                              int var35 = classDI.field1517[var70][var100];
                              int var36 = classDI.field1517[var70 + 1][var100];
                              int var37 = classDI.field1517[1 + var70][var100 + 1];
                              int var38 = classDI.field1517[var70][1 + var100];
                              int var39 = -1;
                              int var40 = -1;
                              if (var29 > 0) {
                                 int var41 = 256 * var74 / var89;
                                 int var42 = var78 / var94;
                                 int var43 = var84 / var94;
                                 var39 = classHG.method6010(var41, var42, var43, (byte)2);
                                 var41 = classDI.field1512 * 1346569979 + var41 & 0xFF;
                                 var43 += classDI.field1506 * -1223029259;
                                 if (var43 < 0) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }

                                    var43 = 0;
                                 } else if (var43 > 255) {
                                    if (var1 >= 500493205) {
                                       return;
                                    }

                                    var43 = 255;
                                 }

                                 var40 = classHG.method6010(var41, var42, var43, (byte)2);
                              }

                              if (var54 > 0) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 boolean var129 = true;
                                 if (0 == var29) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }

                                    if (0 != classBY.field619[var54][var70][var100]) {
                                       if (var1 >= 500493205) {
                                          throw new IllegalStateException();
                                       }

                                       var129 = false;
                                    }
                                 }

                                 if (var30 > 0) {
                                    if (var1 >= 500493205) {
                                       return;
                                    }

                                    int var134 = var30 - 1;
                                    classOW var44 = (classOW)classOW.field5183.method6422(var134);
                                    classOW var131;
                                    if (var44 != null) {
                                       if (var1 >= 500493205) {
                                          throw new IllegalStateException();
                                       }

                                       var131 = var44;
                                    } else {
                                       byte[] var45 = classOW.field5185.method11867(4, var134, -1613100084);
                                       var44 = new classOW(new classXY(var45), var134);
                                       classOW.field5183.method6428(var44, var134);
                                       var131 = var44;
                                    }

                                    if (!var131.field5177) {
                                       if (var1 >= 500493205) {
                                          throw new IllegalStateException();
                                       }

                                       var129 = false;
                                    }
                                 }

                                 if (var129 && var31 == var32) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }

                                    if (var31 == var33) {
                                       if (var1 >= 500493205) {
                                          throw new IllegalStateException();
                                       }

                                       if (var31 == var34) {
                                          if (var1 >= 500493205) {
                                             throw new IllegalStateException();
                                          }

                                          classDE.field1410[var54][var70][var100] = classDE.field1410[var54][var70][var100] | 2340;
                                       }
                                    }
                                 }
                              }

                              int var130 = 0;
                              if (-1 != var40) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 var130 = classFH.field2251[classWK.method12378(var40, 96, 738649702)];
                              }

                              if (var30 == 0) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 classEZ.method4410(
                                    var6,
                                    var54,
                                    var70,
                                    var100,
                                    0,
                                    0,
                                    -1,
                                    var31,
                                    var32,
                                    var33,
                                    var34,
                                    classWK.method12378(var39, var35, 669723813),
                                    classWK.method12378(var39, var36, -459296636),
                                    classWK.method12378(var39, var37, -700175560),
                                    classWK.method12378(var39, var38, 14535008),
                                    0,
                                    0,
                                    0,
                                    0,
                                    var130,
                                    0
                                 );
                              } else {
                                 int var132 = classBY.field619[var54][var70][var100] + 1;
                                 byte var135 = classDI.field1518[var54][var70][var100];
                                 int var138 = var30 - 1;
                                 classOW var46 = (classOW)classOW.field5183.method6422(var138);
                                 classOW var137;
                                 if (null != var46) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }

                                    var137 = var46;
                                 } else {
                                    byte[] var47 = classOW.field5185.method11867(4, var138, -813224353);
                                    var46 = new classOW(new classXY(var47), var138);
                                    classOW.field5183.method6428(var46, var138);
                                    var137 = var46;
                                 }

                                 int var140 = var137.field5176 * -982434803;
                                 int var48;
                                 int var49;
                                 if (var140 >= 0) {
                                    var49 = classFH.field2257.field2239.vmethod408(var140, -1340787172);
                                    var48 = -1;
                                 } else if (16711935 == var137.field5175 * 2136479275) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }

                                    var48 = -2;
                                    var140 = -1;
                                    var49 = -2;
                                 } else {
                                    var48 = classHG.method6010(
                                       var137.field5180 * 2106821511, var137.field5181 * -1352766871, var137.field5182 * -1560131225, (byte)2
                                    );
                                    int var50 = classDI.field1512 * 1346569979 + var137.field5180 * 2106821511 & 0xFF;
                                    int var51 = classDI.field1506 * -1223029259 + -1560131225 * var137.field5182;
                                    if (var51 < 0) {
                                       if (var1 >= 500493205) {
                                          return;
                                       }

                                       var51 = 0;
                                    } else if (var51 > 255) {
                                       if (var1 >= 500493205) {
                                          throw new IllegalStateException();
                                       }

                                       var51 = 255;
                                    }

                                    var49 = classHG.method6010(var50, var137.field5181 * -1352766871, var51, (byte)2);
                                 }

                                 int var142 = 0;
                                 if (-2 != var49) {
                                    if (var1 >= 500493205) {
                                       return;
                                    }

                                    var142 = classFH.field2251[classEL.method3920(var49, 96, (byte)33)];
                                 }

                                 if (var137.field5170 * 151173899 != -1) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }

                                    int var143 = classDI.field1512 * 1346569979 + var137.field5179 * 2023234915 & 0xFF;
                                    int var52 = 1086307051 * var137.field5171 + classDI.field1506 * -1223029259;
                                    if (var52 < 0) {
                                       if (var1 >= 500493205) {
                                          throw new IllegalStateException();
                                       }

                                       var52 = 0;
                                    } else if (var52 > 255) {
                                       if (var1 >= 500493205) {
                                          throw new IllegalStateException();
                                       }

                                       var52 = 255;
                                    }

                                    var49 = classHG.method6010(var143, var137.field5173 * -2131451469, var52, (byte)2);
                                    var142 = classFH.field2251[classEL.method3920(var49, 96, (byte)-52)];
                                 }

                                 classEZ.method4410(
                                    var6,
                                    var54,
                                    var70,
                                    var100,
                                    var132,
                                    var135,
                                    var140,
                                    var31,
                                    var32,
                                    var33,
                                    var34,
                                    classWK.method12378(var39, var35, -2144766771),
                                    classWK.method12378(var39, var36, 282896285),
                                    classWK.method12378(var39, var37, -241679558),
                                    classWK.method12378(var39, var38, -698197275),
                                    classEL.method3920(var48, var35, (byte)16),
                                    classEL.method3920(var48, var36, (byte)40),
                                    classEL.method3920(var48, var37, (byte)39),
                                    classEL.method3920(var48, var38, (byte)-54),
                                    var130,
                                    var142
                                 );
                              }
                           }
                        }
                     }
                  }
               }
            }

            for (int var71 = 1; var71 < var3 - 1; var71++) {
               if (var1 >= 500493205) {
                  throw new IllegalStateException();
               }

               for (int var75 = 1; var75 < var2 - 1; var75++) {
                  int var101;
                  if (0 != (var0.field1702[var54][var75][var71] & 8)) {
                     if (var1 >= 500493205) {
                        throw new IllegalStateException();
                     }

                     var101 = 0;
                  } else {
                     label1036: {
                        if (var54 > 0) {
                           if (var1 >= 500493205) {
                              throw new IllegalStateException();
                           }

                           if (0 != (var0.field1702[1][var75][var71] & 2)) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              var101 = var54 - 1;
                              break label1036;
                           }
                        }

                        var101 = var54;
                     }
                  }

                  var6.method4412(var54, var75, var71, var101);
               }
            }

            classDI.field1519[var54] = (short[][])null;
            classCO.field1182[var54] = (short[][])null;
            classBY.field619[var54] = (byte[][])null;
            classDI.field1518[var54] = (byte[][])null;
            classFE.field2250[var54] = (byte[][])null;
         }

         classFK.method4823(var6, -50, -10, -50);

         for (int var55 = 0; var55 < var2; var55++) {
            for (int var58 = 0; var58 < var3; var58++) {
               if (var1 >= 500493205) {
                  return;
               }

               if (2 == (var5[1][var55][var58] & 2)) {
                  if (var1 >= 500493205) {
                     return;
                  }

                  var6.method4427(var55, var58);
               }
            }
         }

         if (var0.method3719(-2087374717)) {
            if (var1 >= 500493205) {
               return;
            }

            int var56 = var0.field1696 * 1296729483;
            int var59 = var0.field1692 * -1269171107;
            int[][][] var61 = var0.field1688;
            classEZ var63 = var0.field1689;
            byte var64 = 1;
            byte var65 = 2;
            byte var66 = 4;

            for (int var67 = 0; var67 < 4; var67++) {
               if (var1 >= 500493205) {
                  throw new IllegalStateException();
               }

               if (var67 > 0) {
                  var64 <<= 3;
                  var65 <<= 3;
                  var66 <<= 3;
               }

               for (int var68 = 0; var68 <= var67; var68++) {
                  for (int var72 = 0; var72 <= var59; var72++) {
                     if (var1 >= 500493205) {
                        return;
                     }

                     for (int var76 = 0; var76 <= var56; var76++) {
                        if ((classDE.field1410[var68][var76][var72] & var64) != 0) {
                           if (var1 >= 500493205) {
                              throw new IllegalStateException();
                           }

                           int var79 = var72;
                           int var85 = var72;
                           int var90 = var68;

                           int var95;
                           for (var95 = var68; var79 > 0; var79--) {
                              if (var1 >= 500493205) {
                                 return;
                              }

                              if ((classDE.field1410[var68][var76][var79 - 1] & var64) == 0) {
                                 break;
                              }

                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }
                           }

                           while (var85 < var59 && (classDE.field1410[var68][var76][var85 + 1] & var64) != 0) {
                              var85++;
                           }

                           label809:
                           while (var90 > 0) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              for (int var102 = var79; var102 <= var85; var102++) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == (classDE.field1410[var90 - 1][var76][var102] & var64)) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }
                                    break label809;
                                 }
                              }

                              var90--;
                           }

                           label796:
                           while (var95 < var67) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              for (int var103 = var79; var103 <= var85; var103++) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == (classDE.field1410[1 + var95][var76][var103] & var64)) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }
                                    break label796;
                                 }
                              }

                              var95++;
                           }

                           int var104 = (1 + var95 - var90) * (1 + (var85 - var79));
                           if (var104 >= 8) {
                              if (var1 >= 500493205) {
                                 return;
                              }

                              short var114 = 240;
                              int var119 = var61[var95][var76][var79] - var114;
                              int var123 = var61[var90][var76][var79];
                              var63.method4153(var67, 1, var76 * 128, var76 * 128, 128 * var79, 128 * var85 + 128, var119, var123);

                              for (int var27 = var90; var27 <= var95; var27++) {
                                 for (int var126 = var79; var126 <= var85; var126++) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }

                                    classDE.field1410[var27][var76][var126] = classDE.field1410[var27][var76][var126] & ~var64;
                                 }
                              }
                           }
                        }

                        if ((classDE.field1410[var68][var76][var72] & var65) != 0) {
                           if (var1 >= 500493205) {
                              return;
                           }

                           int var80 = var76;
                           int var86 = var76;
                           int var91 = var68;

                           int var96;
                           for (var96 = var68; var80 > 0; var80--) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              if ((classDE.field1410[var68][var80 - 1][var72] & var65) == 0) {
                                 break;
                              }

                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }
                           }

                           while (var86 < var56 && (classDE.field1410[var68][1 + var86][var72] & var65) != 0) {
                              if (var1 >= 500493205) {
                                 return;
                              }

                              var86++;
                           }

                           label863:
                           while (var91 > 0) {
                              for (int var105 = var80; var105 <= var86; var105++) {
                                 if ((classDE.field1410[var91 - 1][var105][var72] & var65) == 0) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }
                                    break label863;
                                 }
                              }

                              var91--;
                           }

                           label852:
                           while (var96 < var67) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              for (int var106 = var80; var106 <= var86; var106++) {
                                 if ((classDE.field1410[var96 + 1][var106][var72] & var65) == 0) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }
                                    break label852;
                                 }
                              }

                              var96++;
                           }

                           int var107 = (var86 - var80 + 1) * (1 + var96 - var91);
                           if (var107 >= 8) {
                              short var115 = 240;
                              int var120 = var61[var96][var80][var72] - var115;
                              int var124 = var61[var91][var80][var72];
                              var63.method4153(var67, 2, 128 * var80, 128 + 128 * var86, var72 * 128, 128 * var72, var120, var124);

                              for (int var125 = var91; var125 <= var96; var125++) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 for (int var127 = var80; var127 <= var86; var127++) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }

                                    classDE.field1410[var125][var127][var72] = classDE.field1410[var125][var127][var72] & ~var65;
                                 }
                              }
                           }
                        }

                        if (0 != (classDE.field1410[var68][var76][var72] & var66)) {
                           int var81 = var76;
                           int var87 = var76;
                           int var92 = var72;

                           int var97;
                           for (var97 = var72; var92 > 0 && (classDE.field1410[var68][var76][var92 - 1] & var66) != 0; var92--) {
                              if (var1 >= 500493205) {
                                 return;
                              }
                           }

                           while (var97 < var59) {
                              if (var1 >= 500493205) {
                                 return;
                              }

                              if (0 == (classDE.field1410[var68][var76][1 + var97] & var66)) {
                                 break;
                              }

                              var97++;
                           }

                           label919:
                           while (var81 > 0) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              for (int var108 = var92; var108 <= var97; var108++) {
                                 if (0 == (classDE.field1410[var68][var81 - 1][var108] & var66)) {
                                    if (var1 >= 500493205) {
                                       throw new IllegalStateException();
                                    }
                                    break label919;
                                 }
                              }

                              var81--;
                           }

                           label908:
                           while (var87 < var56) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              for (int var109 = var92; var109 <= var97; var109++) {
                                 if (var1 >= 500493205) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == (classDE.field1410[var68][1 + var87][var109] & var66)) {
                                    if (var1 >= 500493205) {
                                       return;
                                    }
                                    break label908;
                                 }
                              }

                              var87++;
                           }

                           if ((var87 - var81 + 1) * (1 + (var97 - var92)) >= 4) {
                              if (var1 >= 500493205) {
                                 throw new IllegalStateException();
                              }

                              int var110 = var61[var68][var81][var92];
                              var63.method4153(var67, 4, 128 * var81, 128 + 128 * var87, 128 * var92, 128 + 128 * var97, var110, var110);

                              for (int var116 = var81; var116 <= var87; var116++) {
                                 for (int var121 = var92; var121 <= var97; var121++) {
                                    classDE.field1410[var68][var116][var121] = classDE.field1410[var68][var116][var121] & ~var66;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var53) {
         throw classEG.method3884(var53, "fm.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lcy;")
   @ObfuscatedName("az")
   static classCY method4845(int var0) {
      try {
         classAAR var1 = null;
         classCY var2 = new classCY();

         try {
            var1 = classFE.method4612("", classYP.field7028.field4053, false, (byte)1);
            byte[] var3 = new byte[(int)var1.method257(-153393736)];
            int var4 = 0;

            while (var4 < var3.length) {
               if (var0 >= -144085929) {
                  throw new IllegalStateException();
               }

               int var5 = var1.method260(var3, var4, var3.length - var4, -1397369950);
               if (var5 == -1) {
                  throw new IOException();
               }

               var4 += var5;
            }

            var2 = new classCY(new classXY(var3));
         } catch (Exception var7) {
         }

         try {
            if (null != var1) {
               if (var0 >= -144085929) {
                  throw new IllegalStateException();
               }

               classAAR.method247(var1, (byte)1);
            }
         } catch (Exception var6) {
         }

         return var2;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "fm.az(" + ')');
      }
   }
}
