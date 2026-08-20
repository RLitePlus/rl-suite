import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fu")
public class class147 implements Enum {
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("ak")
   static final class147 field1890 = new class147(6, 6);
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("at")
   static final class147 field1891 = new class147(1, 1);
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("ag")
   static final class147 field1892 = new class147(2, 2);
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("av")
   static final class147 field1889 = new class147(0, 0);
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("ae")
   static final class147 field1893 = new class147(4, 4);
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("aj")
   static final class147 field1894 = new class147(5, 5);
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("ap")
   static final class147 field1897 = new class147(8, 8);
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("an")
   static final class147 field1895 = new class147(3, 3);
   @ObfuscatedSignature(descriptor = "Lfu;")
   @ObfuscatedName("aw")
   static final class147 field1896 = new class147(7, 7);
   @ObfuscatedName("ay")
   final int field1898;
   @ObfuscatedName("au")
   final int field1899;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field1900 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field1901 = 1024;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("ky")
   static Archive archive8;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;)Z")
   @ObfuscatedName("ui")
   public static boolean method4139(Scene var0) {
      return var0.viewportWalking && var0.baseX != -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;Ljava/lang/String;)V")
   @ObfuscatedName("bk")
   public static void method4138(ClientPreferences var0, String var1) {
      if (var0 == null) {
         var0.method1689();
      }

      var0.rememberedUsername = var1;
      Player.savePreferences((byte)-102);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return -12898178 * this.field1899;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -923091163 * this.field1899;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -1815554136 * this.field1899;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)I")
   @ObfuscatedName("at")
   public static int method4135(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = 0;
         if (var0 < var2) {
            if (var6 <= -1405985971) {
               throw new IllegalStateException();
            }

            var7 += var2 - var0;
         } else if (var0 > var4) {
            if (var6 <= -1405985971) {
               throw new IllegalStateException();
            }

            var7 += var0 - var4;
         }

         if (var1 < var3) {
            if (var6 <= -1405985971) {
               throw new IllegalStateException();
            }

            var7 += var3 - var1;
         } else if (var1 > var5) {
            if (var6 <= -1405985971) {
               throw new IllegalStateException();
            }

            var7 += var1 - var5;
         }

         return var7;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "fu.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return -923091163 * this.field1899;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fu.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;II)I")
   @ObfuscatedName("nu")
   static final int method4140(Widget var0, int var1, int var2) {
      try {
         if (var0.cs1Instructions != null) {
            if (var2 == -183835964) {
               throw new IllegalStateException();
            }

            if (var1 < var0.cs1Instructions.length) {
               try {
                  int[] var3 = var0.cs1Instructions[var1];
                  int var4 = 0;
                  int var5 = 0;
                  byte var6 = 0;

                  while (true) {
                     int var7 = var3[var5++];
                     int var8 = 0;
                     byte var9 = 0;
                     if (var7 == 0) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        return var4;
                     }

                     if (var7 == 1) {
                        var8 = client.currentLevels[var3[var5++]];
                     }

                     if (2 == var7) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var8 = client.levels[var3[var5++]];
                     }

                     if (var7 == 3) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var8 = client.experience[var3[var5++]];
                     }

                     if (var7 == 4) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        int var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        Widget var11 = class226.widgetDefinition.method7953(var10, -1526406199);
                        int var12 = var3[var5++];
                        label265:
                        if (var12 != -1) {
                           if (var2 == -183835964) {
                              throw new IllegalStateException();
                           }

                           if (class150.ItemDefinition_get(var12, 271967565).isTradable) {
                              if (var2 == -183835964) {
                                 throw new IllegalStateException();
                              }

                              if (!client.isMembersWorld) {
                                 break label265;
                              }

                              if (var2 == -183835964) {
                                 throw new IllegalStateException();
                              }
                           }

                           for (int var13 = 0; var13 < var11.itemIds.length; var13++) {
                              if (var2 == -183835964) {
                                 throw new IllegalStateException();
                              }

                              if (var11.itemIds[var13] == 1 + var12) {
                                 if (var2 == -183835964) {
                                    throw new IllegalStateException();
                                 }

                                 var8 += var11.itemQuantities[var13];
                              }
                           }
                        }
                     }

                     if (5 == var7) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var8 = Varps.Varps_main[var3[var5++]];
                     }

                     if (6 == var7) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var8 = Skills.Skills_experienceTable[client.levels[var3[var5++]] - 1];
                     }

                     if (7 == var7) {
                        var8 = Varps.Varps_main[var3[var5++]] * 100 / 46875;
                     }

                     if (var7 == 8) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var8 = class330.localPlayer.combatLevel * -545684123;
                     }

                     if (9 == var7) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        for (int var22 = 0; var22 < 25; var22++) {
                           if (var2 == -183835964) {
                              throw new IllegalStateException();
                           }

                           if (Skills.Skills_enabled[var22]) {
                              var8 += client.levels[var22];
                           }
                        }
                     }

                     if (var7 == 10) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        int var23 = var3[var5++] << 16;
                        var23 += var3[var5++];
                        Widget var27 = class226.widgetDefinition.method7953(var23, 1398295062);
                        int var29 = var3[var5++];
                        label302:
                        if (-1 != var29) {
                           if (var2 == -183835964) {
                              throw new IllegalStateException();
                           }

                           if (class150.ItemDefinition_get(var29, -254674219).isTradable) {
                              if (!client.isMembersWorld) {
                                 break label302;
                              }

                              if (var2 == -183835964) {
                                 throw new IllegalStateException();
                              }
                           }

                           for (int var30 = 0; var30 < var27.itemIds.length; var30++) {
                              if (var2 == -183835964) {
                                 throw new IllegalStateException();
                              }

                              if (var27.itemIds[var30] == var29 + 1) {
                                 var8 = 999999999;
                                 break;
                              }
                           }
                        }
                     }

                     if (11 == var7) {
                        var8 = client.runEnergy * -1850849067;
                     }

                     if (12 == var7) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var8 = client.weight * -17542531;
                     }

                     if (var7 == 13) {
                        int var25 = Varps.Varps_main[var3[var5++]];
                        int var28 = var3[var5++];
                        byte var10000;
                        if (0 != (var25 & 1 << var28)) {
                           if (var2 == -183835964) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var8 = var10000;
                     }

                     if (var7 == 14) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        int var26 = var3[var5++];
                        var8 = WorldMapData_1.getVarbit(var26, -1321523339);
                     }

                     if (15 == var7) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var9 = 1;
                     }

                     if (var7 == 16) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var9 = 2;
                     }

                     if (17 == var7) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var9 = 3;
                     }

                     if (var7 == 18) {
                        var8 = (class330.localPlayer.x * 340712311 >> 7) + Occluder.topLevelWorldView.baseX * 825809917;
                     }

                     if (var7 == 19) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var8 = (class330.localPlayer.y * -1747310679 >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
                     }

                     if (20 == var7) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        var8 = var3[var5++];
                     }

                     if (var9 == 0) {
                        if (var2 == -183835964) {
                           throw new IllegalStateException();
                        }

                        if (var6 == 0) {
                           if (var2 == -183835964) {
                              throw new IllegalStateException();
                           }

                           var4 += var8;
                        }

                        if (var6 == 1) {
                           if (var2 == -183835964) {
                              throw new IllegalStateException();
                           }

                           var4 -= var8;
                        }

                        if (var6 == 2) {
                           if (var2 == -183835964) {
                              throw new IllegalStateException();
                           }

                           if (var8 != 0) {
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

            if (var2 == -183835964) {
               throw new IllegalStateException();
            }
         }

         return -2;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "fu.nu(" + 41);
      }
   }

   class147(int var1, int var2) {
      this.field1898 = var1 * 605755729;
      this.field1899 = -1183103827 * var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Lsl;)Z")
   @ObfuscatedName("sx")
   public static boolean method4136(classOO var0, AbstractFont var1) {
      boolean var2 = !var0.field4655;
      var0.field4654.method10140(var1, (short)-19093);
      var0.field4656.method10140(var1, (short)3403);
      var0.field4655 = true;
      var2 |= var0.method8401(-1159242269 * var0.field4665, -1773537928 * var0.field4659, -322440087);
      var2 |= classOO.method8450(var0, var0.field4658 * 1171481847, -178140633 * var0.field4661, -355534603);
      if (classOO.method8615(var0, (byte)28)) {
         classOO.method8636(var0, (byte)4);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Ljava/lang/String;Ljava/lang/String;B)Lsu;")
   @ObfuscatedName("aw")
   public static Font method4137(AbstractArchive var0, AbstractArchive var1, String var2, String var3, byte var4) {
      try {
         if (!var0.isValidFileName(var2, var3, -1825379961)) {
            if (var4 <= 12) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var5 = var0.groupLoadPercentByName(var2, (byte)-55);
            int var6 = AbstractArchive.method9022(var0, var5, var3, 876044713);
            Font var7;
            if (!FloorOverlayDefinition.method5355(var0, var5, var6, -1366279867)) {
               if (var4 <= 12) {
                  throw new IllegalStateException();
               }

               var7 = null;
            } else {
               var7 = class181.method4267(var1.getFile(var5, var6, -26810986), 16777215);
            }

            return var7;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "fu.aw(" + ')');
      }
   }
}
