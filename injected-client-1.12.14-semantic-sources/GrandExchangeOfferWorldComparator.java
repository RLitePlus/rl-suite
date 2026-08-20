import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qc")
final class GrandExchangeOfferWorldComparator implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field5293 = 42;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aj")
   static AbstractArchive HitSplatDefinition_archive;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method8849(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)92);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;B)I")
   @ObfuscatedName("av")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2, byte var3) {
      try {
         byte var10000;
         if (var1.world * -1787296361 < var2.world * -1787296361) {
            if (var3 != 92) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (var2.world * -1787296361 == -1787296361 * var1.world) {
            if (var3 != 92) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qc.av(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qc.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method8850(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)92);
   }

   @ObfuscatedSignature(descriptor = "(Lko;BBBB)V")
   @ObfuscatedName("up")
   public static void method8848(ModelColorOverride var0, byte var1, byte var2, byte var3, byte var4) {
      if (var0 == null) {
         var0.method6531(var1, var1, var1, var1);
      } else {
         var0.overrideHue = var1;
         var0.overrideSaturation = var2;
         var0.overrideLuminance = var3;
         var0.overrideAmount = var4;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)92);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qc.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method8851(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)92);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method8853(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method8854(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;I)V")
   @ObfuscatedName("ti")
   public static void method8856(classSF var0, int var1) {
      if (var1 != var0.field5763 * -687509261) {
         var0.field5763 = -171759557 * var1;
         var0.method10238(-1477863888);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method8852(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)92);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("aj")
   int method8847(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.world * -879398402 < var2.world * -1777612063 ? -1 : (var2.world * -1647966144 == -1787296361 * var1.world ? 0 : 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;Ljava/lang/Object;)Z")
   @ObfuscatedName("tn")
   public static boolean method8855(GrandExchangeOfferWorldComparator var0, Object var1) {
      if (var0 == null) {
         var0.method8849(var1, var1);
      }

      return var0.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;)I")
   @ObfuscatedName("wg")
   public static int method8857(AbstractArchive var0, String var1) {
      if (var0 == null) {
         var0.method9038(var1);
      }

      var1 = var1.toLowerCase();
      return var0.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lcr;IIIIII)V")
   @ObfuscatedName("jy")
   static final void drawActor2d(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (Scene.method5720(var1, true)) {
         int var13 = var6;
         int var12 = var5;
         int var11 = var4;
         int var10 = var3;
         int var9 = var2;
         Actor var8 = var1;
         WorldView var85 = var0;
         int var14 = 687535200;

         try {
            if (var8 != null) {
               if (var14 >= 1468594823) {
                  throw new IllegalStateException();
               }

               if (!var8.isVisible(-1389483884)) {
                  if (var14 >= 1468594823) {
                     throw new IllegalStateException();
                  }
               } else {
                  if (var8 instanceof NPC) {
                     if (var14 >= 1468594823) {
                        return;
                     }

                     NPCComposition var15 = ((NPC)var8).definition;
                     if (var15.transforms != null) {
                        if (var14 >= 1468594823) {
                           throw new IllegalStateException();
                        }

                        var15 = NPCComposition.method4683(var15, (byte)0);
                     }

                     if (var15 == null) {
                        if (var14 >= 1468594823) {
                           throw new IllegalStateException();
                        }

                        return;
                     }
                  }

                  int var86 = client.playerUpdateManager.field1538 * 1320060371;
                  int[] var16 = client.playerUpdateManager.playerIndices;
                  boolean var10000;
                  if (var9 < var86) {
                     if (var14 >= 1468594823) {
                        return;
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var17;
                  int var18;
                  var17 = var10000;
                  var18 = -2;
                  label1139:
                  if (client.method2438(1) && null != var8.overheadText) {
                     if (var17) {
                        if (var14 >= 1468594823) {
                           throw new IllegalStateException();
                        }

                        if (var8.field1144) {
                           break label1139;
                        }

                        if (client.publicChatMode * 286094873 != 4) {
                           if (var8.field1186) {
                              break label1139;
                           }

                           if (var14 >= 1468594823) {
                              throw new IllegalStateException();
                           }

                           if (client.publicChatMode * 286094873 != 0 && 3 != client.publicChatMode * 286094873) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              if (1 != client.publicChatMode * 286094873 || !((Player)var8).isFriend(1683373223)) {
                                 break label1139;
                              }

                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     ClanSettings.method4346(var85, var8, var8.vmethod147(612699424), -9757353);
                     if (-1259541623 * client.viewportTempX > -1 && 814091759 * client.overheadTextCount < -1772100551 * client.field670) {
                        if (var14 >= 1468594823) {
                           throw new IllegalStateException();
                        }

                        client.overheadTextXOffsets[814091759 * client.overheadTextCount] = class234.fontBold12.stringWidth(var8.overheadText) / 2;
                        client.overheadTextAscents[client.overheadTextCount * 814091759] = class234.fontBold12.ascent;
                        client.overheadTextXs[814091759 * client.overheadTextCount] = client.viewportTempX * -1259541623;
                        client.overheadTextYs[client.overheadTextCount * 814091759] = client.viewportTempY * -604800983 - var18;
                        client.overheadTextColors[814091759 * client.overheadTextCount] = var8.field1161 * -1432687261;
                        client.overheadTextEffects[client.overheadTextCount * 814091759] = var8.field1147 * 1059154345;
                        client.overheadTextCyclesRemaining[client.overheadTextCount * 814091759] = var8.overheadTextCyclesRemaining * 421730673;
                        client.field816[814091759 * client.overheadTextCount] = var8.field1148;
                        client.overheadText[814091759 * client.overheadTextCount] = var8.overheadText;
                        client.overheadTextCount += 110936335;
                        var18 += 12;
                     }
                  }

                  if (!var8.healthBars.method9653()) {
                     ClanSettings.method4346(var85, var8, var8.vmethod147(394719554) + 15, 1669417659);
                     if (!client.method2438(1073741824)) {
                        return;
                     }

                     for (HealthBarConfig var19 = (HealthBarConfig)var8.healthBars.method9642();
                        null != var19;
                        var19 = (HealthBarConfig)var8.healthBars.method9646()
                     ) {
                        if (var14 >= 1468594823) {
                           return;
                        }

                        HealthBarUpdate var20 = var19.get(client.cycle * 1759706017, -1139893780);
                        if (null != var20) {
                           if (var14 >= 1468594823) {
                              throw new IllegalStateException();
                           }

                           HealthBarDefinition var21;
                           SpritePixels var22;
                           SpritePixels var23;
                           int var24;
                           int var25;
                           label1111: {
                              var21 = var19.definition;
                              var22 = var21.getBackSprite((byte)-23);
                              var23 = var21.getFrontSprite(-1226768215);
                              var25 = 0;
                              if (var22 != null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 if (null != var23) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    if (-1711000766 * var21.widthPadding < var23.subWidth) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       var25 = 1291983265 * var21.widthPadding;
                                    }

                                    var24 = var23.subWidth - var25 * 2;
                                    break label1111;
                                 }
                              }

                              var24 = 1815503635 * var21.width;
                           }

                           int var26 = 255;
                           int var27 = -1;
                           int var28 = client.cycle * 1759706017 - -313755967 * var20.cycle;
                           int var29 = var24 * var20.health2 * -712865399 / (var21.width * 1815503635);
                           if (111989601 * var20.cycleOffset > var28) {
                              int var30 = 0 == -35702189 * var21.field2226 ? 0 : -35702189 * var21.field2226 * (var28 / (-35702189 * var21.field2226));
                              int var31 = var20.health * 17821737 * var24 / (1815503635 * var21.width);
                              var27 = (var29 - var31) * var30 / (111989601 * var20.cycleOffset) + var31;
                           } else {
                              var27 = var29;
                              int var117 = var21.int5 * 933043503 + var20.cycleOffset * 111989601 - var28;
                              if (1019541041 * var21.int3 >= 0) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var26 = (var117 << 8) / (933043503 * var21.int5 - var21.int3 * 1019541041);
                              }
                           }

                           if (var20.health2 * -712865399 > 0) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              if (var27 < 1) {
                                 var27 = 1;
                              }
                           }

                           if (var22 != null) {
                              if (var14 >= 1468594823) {
                                 return;
                              }

                              if (null != var23) {
                                 if (var14 >= 1468594823) {
                                    return;
                                 }

                                 if (var27 == var24) {
                                    var27 += var25 * 2;
                                 } else {
                                    var27 += var25;
                                 }

                                 label1098: {
                                    int var119 = var22.subHeight;
                                    var18 += var119;
                                    int var123 = var10 + -1259541623 * client.viewportTempX - (var24 >> 1);
                                    int var32 = var11 + client.viewportTempY * -604800983 - var18;
                                    var123 -= var25;
                                    if (var26 >= 0) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       if (var26 < 255) {
                                          if (var14 >= 1468594823) {
                                             throw new IllegalStateException();
                                          }

                                          var22.method12659(var123, var32, var26);
                                          Rasterizer2D.Rasterizer2D_expandClip(var123, var32, var123 + var27, var119 + var32);
                                          var23.method12659(var123, var32, var26);
                                          break label1098;
                                       }
                                    }

                                    var22.method12650(var123, var32);
                                    Rasterizer2D.Rasterizer2D_expandClip(var123, var32, var27 + var123, var119 + var32);
                                    var23.method12650(var123, var32);
                                 }

                                 Rasterizer2D.Rasterizer2D_setClip(var10, var11, var12 + var10, var13 + var11);
                                 var18 += 2;
                                 continue;
                              }
                           }

                           var18 += 5;
                           if (-1259541623 * client.viewportTempX > -1) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              int var118 = var10 + -1259541623 * client.viewportTempX - (var24 >> 1);
                              int var122 = var11 + client.viewportTempY * -604800983 - var18;
                              Rasterizer2D.Rasterizer2D_fillRectangle(var118, var122, var27, 5, 65280);
                              Rasterizer2D.Rasterizer2D_fillRectangle(var27 + var118, var122, var24 - var27, 5, 16711680);
                           }

                           var18 += 2;
                        } else if (HealthBarConfig.method3562(var19, -1943705772)) {
                           var19.remove();
                        }
                     }
                  }

                  if (-2 == var18) {
                     if (var14 >= 1468594823) {
                        throw new IllegalStateException();
                     }

                     var18 += 7;
                  }

                  if (var17) {
                     if (var14 >= 1468594823) {
                        throw new IllegalStateException();
                     }

                     if (var8.playerCycle * 70809841 == 1759706017 * client.cycle) {
                        if (var14 >= 1468594823) {
                           throw new IllegalStateException();
                        }

                        if (class152.method3962((Player)var8, (byte)0)) {
                           Player var91 = (Player)var8;
                           if (var17) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              ClanSettings.method4346(var85, var8, var8.vmethod147(-757885697) + 15, -333415633);
                              AbstractFont var95 = (AbstractFont)client.fontsMap.get(FontName.FontName_plain12);
                              var18 += 4;
                              FadeOutTask.method10363(
                                 var95,
                                 Username.method12702(var91.username, (byte)37),
                                 var10 + -1259541623 * client.viewportTempX,
                                 var11 + client.viewportTempY * -604800983 - var18,
                                 16777215,
                                 0
                              );
                              var18 += 18;
                           }
                        }
                     }
                  }

                  if (var17) {
                     if (var14 >= 1468594823) {
                        return;
                     }

                     Player var92 = (Player)var8;
                     if (var92.isHidden) {
                        return;
                     }

                     label1071: {
                        if (-1 == var92.headIconPk * -1427369953) {
                           if (var92.headIconPrayer * 624181267 == -1) {
                              break label1071;
                           }

                           if (var14 >= 1468594823) {
                              throw new IllegalStateException();
                           }
                        }

                        ClanSettings.method4346(var85, var8, var8.vmethod147(1562391207) + 15, -694144812);
                        if (client.viewportTempX * -1259541623 > -1) {
                           if (-1427369953 * var92.headIconPk != -1) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              var18 += 25;
                              class66.headIconPkSprites[-1427369953 * var92.headIconPk]
                                 .method12650(-1259541623 * client.viewportTempX + var10 - 12, var11 + -604800983 * client.viewportTempY - var18);
                           }

                           if (-1 != 624181267 * var92.headIconPrayer) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              var18 += 25;
                              class279.headIconPrayerSprites[var92.headIconPrayer * 624181267]
                                 .method12650(var10 + -1259541623 * client.viewportTempX - 12, var11 + client.viewportTempY * -604800983 - var18);
                           }
                        }
                     }

                     if (var9 >= 0) {
                        if (var14 >= 1468594823) {
                           throw new IllegalStateException();
                        }

                        if (client.hintArrow.method8736(1945711579) == 3) {
                           if (var14 >= 1468594823) {
                              throw new IllegalStateException();
                           }

                           if (HintArrow.method8739(client.hintArrow, -483440525) == var16[var9]) {
                              if (var14 >= 1468594823) {
                                 return;
                              }

                              ClanSettings.method4346(var85, var8, var8.vmethod147(-703837487) + 15, -700293417);
                              if (-1259541623 * client.viewportTempX > -1) {
                                 if (var14 >= 1468594823) {
                                    return;
                                 }

                                 var18 += SceneTilePaint.headIconHintSprites[1].subHeight;
                                 SceneTilePaint.headIconHintSprites[1]
                                    .method12650(-1259541623 * client.viewportTempX + var10 - 12, var11 + client.viewportTempY * -604800983 - var18);
                              }
                           }
                        }
                     }
                  } else {
                     NPC var93 = (NPC)var8;
                     int[] var96 = var93.method3518(1478052042);
                     short[] var98 = var93.method3522(-2000951187);
                     if (var98 != null) {
                        if (var14 >= 1468594823) {
                           return;
                        }

                        if (var96 != null) {
                           if (var14 >= 1468594823) {
                              throw new IllegalStateException();
                           }

                           for (int var100 = 0; var100 < var98.length; var100++) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              if (var98[var100] >= 0) {
                                 if (var14 >= 1468594823) {
                                    return;
                                 }

                                 if (var96[var100] < 0) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }
                                 } else {
                                    long var102 = (long)var96[var100] << 8 | var98[var100];
                                    SpritePixels var105 = (SpritePixels)class498.method10645(client.field742, var102, 1934219016);
                                    if (var105 == null) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       SpritePixels[] var107 = class69.method1399(class147.archive8, var96[var100], 0, 1969458106);
                                       if (null != var107 && var98[var100] < var107.length) {
                                          var105 = var107[var98[var100]];
                                          client.field742.method10647(var102, var105, 1512249047);
                                       }
                                    }

                                    if (var105 != null) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       ClanSettings.method4346(var85, var8, var8.vmethod147(-503298830) + 15, 677932957);
                                       if (-1259541623 * client.viewportTempX > -1) {
                                          if (var14 >= 1468594823) {
                                             throw new IllegalStateException();
                                          }

                                          var105.method12650(
                                             var10 + client.viewportTempX * -1259541623 - (var105.subWidth >> 1),
                                             client.viewportTempY * -604800983 + ((var11 - var105.subHeight - 2) * (var100 + 1) - var105.subHeight) - 4
                                          );
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if (client.hintArrow.method8736(1945711579) == 1) {
                        if (var14 >= 1468594823) {
                           throw new IllegalStateException();
                        }

                        if (HintArrow.method8739(client.hintArrow, 726137387) == var85.field1313.method10498(var9 - var86, (byte)85)) {
                           if (var14 >= 1468594823) {
                              throw new IllegalStateException();
                           }

                           if (client.cycle * 1759706017 % 20 < 10) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              ClanSettings.method4346(var85, var8, var8.vmethod147(644106411) + 15, -1298103908);
                              if (client.viewportTempX * -1259541623 > -1) {
                                 if (var14 >= 1468594823) {
                                    return;
                                 }

                                 SceneTilePaint.headIconHintSprites[0]
                                    .method12650(-1259541623 * client.viewportTempX + var10 - 12, -604800983 * client.viewportTempY + var11 - 28);
                              }
                           }
                        }
                     }
                  }

                  for (int var94 = 0; var94 < 4; var94++) {
                     if (var14 >= 1468594823) {
                        throw new IllegalStateException();
                     }

                     int var97 = var8.hitSplatCycles[var94];
                     int var99 = var8.hitSplatTypes[var94];
                     HitSplatDefinition var101 = null;
                     int var103 = 0;
                     if (var99 >= 0) {
                        if (var14 >= 1468594823) {
                           break;
                        }

                        if (var97 <= 1759706017 * client.cycle) {
                           if (var14 >= 1468594823) {
                              break;
                           }
                           continue;
                        }

                        var101 = classGF.method4234(var8.hitSplatTypes[var94], 558050665);
                        var103 = var101.field2548 * -332979161;
                        if (null != var101) {
                           if (var14 >= 1468594823) {
                              break;
                           }

                           if (null != var101.transforms) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              var101 = HitSplatDefinition.method4998(var101, -1973952333);
                              if (var101 == null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var8.hitSplatCycles[var94] = -1;
                                 continue;
                              }
                           }
                        }
                     } else if (var97 < 0) {
                        if (var14 >= 1468594823) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }

                     int var104 = var8.hitSplatTypes2[var94];
                     HitSplatDefinition var106 = null;
                     if (var104 >= 0) {
                        var106 = classGF.method4234(var104, 558050665);
                        if (var106 != null) {
                           if (var14 >= 1468594823) {
                              break;
                           }

                           if (var106.transforms != null) {
                              if (var14 >= 1468594823) {
                                 throw new IllegalStateException();
                              }

                              var106 = HitSplatDefinition.method4998(var106, -345323327);
                           }
                        }
                     }

                     if (var97 - var103 <= 1759706017 * client.cycle) {
                        if (var101 == null) {
                           if (var14 >= 1468594823) {
                              throw new IllegalStateException();
                           }

                           var8.hitSplatCycles[var94] = -1;
                        } else {
                           ClanSettings.method4346(var85, var8, var8.vmethod147(1494123968) / 2, -926132648);
                           if (-1259541623 * client.viewportTempX > -1) {
                              byte var108 = 2;
                              if (var94 == 1) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 client.viewportTempY -= 454611444;
                              }

                              if (var94 == 2) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 client.viewportTempX -= -1806126889;
                                 client.viewportTempY -= -1920177926;
                              }

                              if (var94 == 3) {
                                 client.viewportTempX += -1806126889;
                                 client.viewportTempY -= -1920177926;
                              }

                              SpritePixels var111 = null;
                              SpritePixels var113 = null;
                              SpritePixels var115 = null;
                              SpritePixels var120 = null;
                              int var125 = 0;
                              int var126 = 0;
                              int var33 = 0;
                              int var34 = 0;
                              int var35 = 0;
                              int var36 = 0;
                              int var37 = 0;
                              int var38 = 0;
                              SpritePixels var39 = null;
                              SpritePixels var40 = null;
                              SpritePixels var41 = null;
                              SpritePixels var42 = null;
                              int var43 = 0;
                              int var44 = 0;
                              int var45 = 0;
                              int var46 = 0;
                              int var47 = 0;
                              int var48 = 0;
                              int var49 = 0;
                              int var50 = 0;
                              int var51 = 0;
                              var111 = var101.method5004(-1264574950);
                              if (null != var111) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var125 = var111.subWidth;
                                 int var52 = var111.subHeight;
                                 if (var52 > var51) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var51 = var52;
                                 }

                                 var35 = var111.xOffset;
                              }

                              var113 = var101.method5006(1606238880);
                              if (var113 != null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var126 = var113.subWidth;
                                 int var127 = var113.subHeight;
                                 if (var127 > var51) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var51 = var127;
                                 }

                                 var36 = var113.xOffset;
                              }

                              var115 = var101.method5008(-565447237);
                              if (var115 != null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var33 = var115.subWidth;
                                 int var128 = var115.subHeight;
                                 if (var128 > var51) {
                                    var51 = var128;
                                 }

                                 var37 = var115.xOffset;
                              }

                              var120 = var101.method5009(1935060474);
                              if (null != var120) {
                                 var34 = var120.subWidth;
                                 int var129 = var120.subHeight;
                                 if (var129 > var51) {
                                    if (var14 >= 1468594823) {
                                       break;
                                    }

                                    var51 = var129;
                                 }

                                 var38 = var120.xOffset;
                              }

                              if (var106 != null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var39 = var106.method5004(1412667859);
                                 if (var39 != null) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var43 = var39.subWidth;
                                    int var130 = var39.subHeight;
                                    if (var130 > var51) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       var51 = var130;
                                    }

                                    var47 = var39.xOffset;
                                 }

                                 var40 = var106.method5006(704306378);
                                 if (null != var40) {
                                    var44 = var40.subWidth;
                                    int var131 = var40.subHeight;
                                    if (var131 > var51) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       var51 = var131;
                                    }

                                    var48 = var40.xOffset;
                                 }

                                 var41 = var106.method5008(-169813377);
                                 if (var41 != null) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var45 = var41.subWidth;
                                    int var132 = var41.subHeight;
                                    if (var132 > var51) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       var51 = var132;
                                    }

                                    var49 = var41.xOffset;
                                 }

                                 var42 = var106.method5009(1935060474);
                                 if (var42 != null) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var46 = var42.subWidth;
                                    int var133 = var42.subHeight;
                                    if (var133 > var51) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       var51 = var133;
                                    }

                                    var50 = var42.xOffset;
                                 }
                              }

                              Font var134 = HitSplatDefinition.method5013(var101, -1980771566);
                              if (var134 == null) {
                                 if (var14 >= 1468594823) {
                                    break;
                                 }

                                 var134 = class498.fontPlain11;
                              }

                              Font var53;
                              if (var106 != null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var53 = HitSplatDefinition.method5013(var106, -1965269755);
                                 if (null == var53) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var53 = class498.fontPlain11;
                                 }
                              } else {
                                 var53 = class498.fontPlain11;
                              }

                              Object var54 = null;
                              String var55 = null;
                              int var56 = 0;
                              int var57 = 0;
                              var54 = var101.getString(var8.hitSplatValues[var94], 1113141895);
                              var56 = var134.stringWidth((String)var54);
                              if (null != var106) {
                                 var55 = var106.getString(var8.hitSplatValues2[var94], 1113141895);
                                 var57 = var53.stringWidth(var55);
                              }

                              int var58;
                              int var59;
                              var58 = 0;
                              var59 = 0;
                              label1029:
                              if (var126 > 0) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 if (var115 == null) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    if (var120 == null) {
                                       var58 = 1;
                                       break label1029;
                                    }

                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var58 = var56 / var126 + 1;
                              }

                              if (var106 != null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 label1016:
                                 if (var44 > 0) {
                                    if (var14 >= 1468594823) {
                                       break;
                                    }

                                    if (var41 == null) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       if (var42 == null) {
                                          var59 = 1;
                                          break label1016;
                                       }
                                    }

                                    var59 = var57 / var44 + 1;
                                 }
                              }

                              int var60 = 0;
                              int var61 = var60;
                              if (var125 > 0) {
                                 var60 += var125;
                              }

                              var60 += 2;
                              int var62 = var60;
                              if (var33 > 0) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var60 += var33;
                              }

                              int var63 = var60;
                              int var64 = var60;
                              if (var126 > 0) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 int var65 = var126 * var58;
                                 var60 += var65;
                                 var64 = var60 + (var65 - var56) / 2;
                              } else {
                                 var60 += var56;
                              }

                              int var141 = var60;
                              if (var34 > 0) {
                                 if (var14 >= 1468594823) {
                                    break;
                                 }

                                 var60 += var34;
                              }

                              int var66 = 0;
                              int var67 = 0;
                              int var68 = 0;
                              int var69 = 0;
                              int var70 = 0;
                              if (null != var106) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var60 += 2;
                                 var66 = var60;
                                 if (var43 > 0) {
                                    var60 += var43;
                                 }

                                 var60 += 2;
                                 var67 = var60;
                                 if (var45 > 0) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var60 += var45;
                                 }

                                 var68 = var60;
                                 var70 = var60;
                                 if (var44 > 0) {
                                    int var71 = var59 * var44;
                                    var60 += var71;
                                    var70 = var60 + (var71 - var57) / 2;
                                 } else {
                                    var60 += var57;
                                 }

                                 var69 = var60;
                                 if (var46 > 0) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var60 += var46;
                                 }
                              }

                              int var142 = var8.hitSplatCycles[var94] - client.cycle * 1759706017;
                              int var72 = var101.field2546 * -1382939459 - var142 * -1382939459 * var101.field2546 / (var101.field2548 * -332979161);
                              int var73 = var101.field2552 * 191702075 * var142 / (var101.field2548 * -332979161) + -(191702075 * var101.field2552);
                              int var74 = -1259541623 * client.viewportTempX + var10 - (var60 >> 1) + var72;
                              int var75 = var11 + client.viewportTempY * -604800983 - 12 + var73;
                              int var76 = var75;
                              int var77 = var75 + var51;
                              int var78 = 15 + var75 + var101.field2556 * 1090496625;
                              int var79 = var78 - var134.maxAscent;
                              int var80 = var78 + var134.maxDescent;
                              if (var79 < var75) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var76 = var79;
                              }

                              if (var80 > var77) {
                                 var77 = var80;
                              }

                              int var81 = 0;
                              if (null != var106) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var81 = 15 + var75 + 1090496625 * var106.field2556;
                                 int var82 = var81 - var53.maxAscent;
                                 int var83 = var53.maxDescent + var81;
                                 if (var82 < var76 && var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 if (var83 > var77 && var14 >= 1468594823) {
                                    break;
                                 }
                              }

                              int var143 = 255;
                              if (-1970524731 * var101.field2553 >= 0) {
                                 if (var14 >= 1468594823) {
                                    break;
                                 }

                                 var143 = (var142 << 8) / (var101.field2548 * -332979161 - var101.field2553 * -1970524731);
                              }

                              if (var143 >= 0) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 if (var143 < 255) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    if (null != var111) {
                                       var111.method12659(var74 + var61 - var35, var75, var143);
                                    }

                                    if (var115 != null) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       var115.method12659(var62 + var74 - var37, var75, var143);
                                    }

                                    if (var113 != null) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       for (int var146 = 0; var146 < var58; var146++) {
                                          if (var14 >= 1468594823) {
                                             throw new IllegalStateException();
                                          }

                                          var113.method12659(var146 * var126 + (var63 + var74 - var36), var75, var143);
                                       }
                                    }

                                    if (var120 != null) {
                                       if (var14 >= 1468594823) {
                                          throw new IllegalStateException();
                                       }

                                       var120.method12659(var74 + var141 - var38, var75, var143);
                                    }

                                    var134.drawAlpha((String)var54, var64 + var74, var78, -705101241 * var101.textColor, 0, var143);
                                    if (var106 != null) {
                                       if (var14 >= 1468594823) {
                                          break;
                                       }

                                       if (null != var39) {
                                          if (var14 >= 1468594823) {
                                             throw new IllegalStateException();
                                          }

                                          var39.method12659(var74 + var66 - var47, var75, var143);
                                       }

                                       if (null != var41) {
                                          if (var14 >= 1468594823) {
                                             break;
                                          }

                                          var41.method12659(var67 + var74 - var49, var75, var143);
                                       }

                                       if (null != var40) {
                                          if (var14 >= 1468594823) {
                                             throw new IllegalStateException();
                                          }

                                          for (int var147 = 0; var147 < var59; var147++) {
                                             var40.method12659(var74 + var68 - var48 + var44 * var147, var75, var143);
                                          }
                                       }

                                       if (var42 != null) {
                                          var42.method12659(var74 + var69 - var50, var75, var143);
                                       }

                                       var53.drawAlpha(var55, var74 + var70, var81, -705101241 * var106.textColor, 0, var143);
                                    }
                                    continue;
                                 }
                              }

                              if (null != var111) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var111.method12650(var74 + var61 - var35, var75);
                              }

                              if (null != var115) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var115.method12650(var74 + var62 - var37, var75);
                              }

                              if (null != var113) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 for (int var144 = 0; var144 < var58; var144++) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var113.method12650(var144 * var126 + (var74 + var63 - var36), var75);
                                 }
                              }

                              if (var120 != null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 var120.method12650(var141 + var74 - var38, var75);
                              }

                              var134.method10402((String)var54, var74 + var64, var78, -705101241 * var101.textColor | 0xFF000000, 0);
                              if (var106 != null) {
                                 if (var14 >= 1468594823) {
                                    throw new IllegalStateException();
                                 }

                                 if (var39 != null) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var39.method12650(var66 + var74 - var47, var75);
                                 }

                                 if (null != var41) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var41.method12650(var67 + var74 - var49, var75);
                                 }

                                 if (var40 != null) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    for (int var145 = 0; var145 < var59; var145++) {
                                       var40.method12650(var145 * var44 + (var74 + var68 - var48), var75);
                                    }
                                 }

                                 if (null != var42) {
                                    if (var14 >= 1468594823) {
                                       throw new IllegalStateException();
                                    }

                                    var42.method12650(var69 + var74 - var50, var75);
                                 }

                                 var53.method10402(var55, var70 + var74, var81, var106.textColor * -705101241 | 0xFF000000, 0);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } catch (RuntimeException var84) {
            throw RestClientThreadFactory.newRunException(var84, "qc.jy(" + ')');
         }
      }
   }
}
