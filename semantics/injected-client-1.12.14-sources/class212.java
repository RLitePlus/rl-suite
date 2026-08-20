import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iu")
public class class212 extends DualNode {
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   static EvictingDualNodeHashTable field1909 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2644 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2643 = 32;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public static void method5131() {
      field1909.clear();
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lpw;B)V")
   @ObfuscatedName("ju")
   static void method5135(WorldView var0, WorldEntityOwnerType var1, byte var2) {
      try {
         int var3 = 0;

         for (int var4 = 0; var4 < var0.field1314.method10502(-1766873335); var4++) {
            if (var2 == 44) {
               throw new IllegalStateException();
            }

            WorldEntity var5 = (WorldEntity)var0.worldEntities.get((long)var0.field1314.method10498(var4, (byte)86));
            if (var5 != null) {
               if (1201323213 * client.currentWorldViewId == 577964535 * var5.worldView.id) {
                  if (var2 == 44) {
                     throw new IllegalStateException();
                  }
               } else if (var5.method10842((short)300) == var1) {
                  if (var2 == 44) {
                     return;
                  }

                  boolean var10000;
                  if (var3 < -338757497 * client.field711) {
                     if (var2 == 44) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var6 = var10000;
                  if (!var6) {
                     if (var2 == 44) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var3++;
                     boolean var7 = false;
                     if (var1 == WorldEntityOwnerType.field5257) {
                        if (var2 == 44) {
                           throw new IllegalStateException();
                        }

                        boolean var8;
                        label193: {
                           for (int var9 = 0; var9 < client.playerUpdateManager.field1538 * 1320060371; var9++) {
                              if (var2 == 44) {
                                 throw new IllegalStateException();
                              }

                              Player var10 = (Player)var0.npcs.get(client.playerUpdateManager.playerIndices[var9]);
                              if (classTR.method10815(var5, var10, 1409342983)) {
                                 if (var2 == 44) {
                                    throw new IllegalStateException();
                                 }

                                 var8 = true;
                                 break label193;
                              }
                           }

                           int var14 = 0;

                           label172:
                           while (true) {
                              if (var14 >= var0.field1313.method10502(-2001482665)) {
                                 Bounds var15 = DefaultsGroup.method11177(
                                    var5.worldEntityCoord, WorldEntityConfig.method4768(var5.worldEntityConfig, -1958663222), (byte)-101
                                 );

                                 for (int var17 = 0; var17 < var0.field1314.method10502(-2009566624); var17++) {
                                    if (var2 == 44) {
                                       throw new IllegalStateException();
                                    }

                                    WorldEntity var18 = (WorldEntity)var0.worldEntities.get((long)var0.field1314.method10498(var17, (byte)34));
                                    if (null != var18 && var18 != var5) {
                                       if (var2 == 44) {
                                          throw new IllegalStateException();
                                       }

                                       if (1759706017 * client.cycle == var18.worldView.scene.cycle) {
                                          if (var2 == 44) {
                                             throw new IllegalStateException();
                                          }

                                          Bounds var19 = DefaultsGroup.method11177(
                                             var18.worldEntityCoord, WorldEntityConfig.method4768(var18.worldEntityConfig, -1958663222), (byte)-51
                                          );
                                          if (Bounds.method9511(var15, var19, -609510589)) {
                                             if (var2 == 44) {
                                                throw new IllegalStateException();
                                             }

                                             var15.method9493(-1624940431);
                                             var19.method9493(5641090);
                                             var8 = true;
                                             break label172;
                                          }

                                          var19.method9493(-1817801547);
                                       }
                                    }
                                 }

                                 var15.method9493(-1014834050);
                                 var8 = false;
                                 break;
                              }

                              NPC var16 = (NPC)var0.players.get(var0.field1313.method10498(var14, (byte)78));
                              if (null != var16) {
                                 if (var2 == 44) {
                                    throw new IllegalStateException();
                                 }

                                 boolean var11 = false;

                                 for (int var12 = 0; var12 < var16.definition.actions.length; var12++) {
                                    if (var2 == 44) {
                                       throw new IllegalStateException();
                                    }

                                    if (null != var16.definition.actions[var12]) {
                                       if (var2 == 44) {
                                          return;
                                       }

                                       var11 = true;
                                    }
                                 }

                                 if (var11) {
                                    if (var2 == 44) {
                                       throw new IllegalStateException();
                                    }

                                    if (classTR.method10815(var5, var16, 1643823165)) {
                                       if (var2 == 44) {
                                          throw new IllegalStateException();
                                       }

                                       var8 = true;
                                       break;
                                    }
                                 }
                              }

                              var14++;
                           }
                        }

                        var7 = var8;
                     }

                     WorldMapLabelSize.method7223(var0, var5, var7, (byte)2);
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "iu.ju(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;II)I")
   @ObfuscatedName("vs")
   public static int method5133(ObjectComposition var0, int var1, int var2) {
      return class108.method3858(var0.params, var1, var2, -1926610435);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public static void method5132() {
      field1909.clear();
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ar")
   static final int method5134(int var0, int var1, int var2) {
      try {
         if (var0 == -2) {
            if (var2 == -1791539036) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else if (-1 == var0) {
            if (var1 < 2) {
               if (var2 == -1791539036) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               var1 = 126;
            }

            return var1;
         } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
               var1 = 2;
            } else if (var1 > 126) {
               if (var2 == -1791539036) {
                  throw new IllegalStateException();
               }

               var1 = 126;
            }

            return var1 + (var0 & 65408);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iu.ar(" + 41);
      }
   }

   class212() throws Throwable {
      throw new Error();
   }
}
