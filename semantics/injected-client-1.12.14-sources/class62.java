import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("co")
public class class62 {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1075 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field1072 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("cm")
   public static final int field1077 = 1011;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field1070 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field1067 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1066 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1074 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field1071 = 24;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1068 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field1076 = 1002;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field1073 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field1069 = 5;

   @ObfuscatedSignature(descriptor = "(Lrg;Lrm;)V")
   @ObfuscatedName("hq")
   public static void method2629(IterableNodeDequeDescendingIterator var0, IterableNodeDeque var1) {
      if (var0 == null) {
         var0.setDeque(var1);
      }

      var0.deque = var1;
      var0.start();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
   @ObfuscatedName("av")
   public static void method2631(String var0, String var1, String var2, int var3, int var4, int var5) throws IOException {
      try {
         if (null != var1) {
            if (var5 == 1427597372) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               if (var5 == 1427597372) {
                  throw new IllegalStateException();
               }

               var0 = var0 + "-" + var1;
            }
         }

         class134.field1817 = 1233151621 * var4;
         class224.cacheGamebuild = 1582662335 * var3;

         try {
            EnumComposition.osName = System.getProperty("os.name");
         } catch (Exception var14) {
            EnumComposition.osName = "Unknown";
         }

         AttackOption.osNameLowercase = EnumComposition.osName.toLowerCase();
         JagexCache.userHomeDirectory = null;

         try {
            JagexCache.userHomeDirectory = System.getProperty("jagex.userhome");
         } catch (Exception var13) {
         }

         if (JagexCache.userHomeDirectory == null) {
            if (var5 == 1427597372) {
               throw new IllegalStateException();
            }

            try {
               JagexCache.userHomeDirectory = System.getProperty("user.home");
            } catch (Exception var12) {
            }
         }

         if (JagexCache.userHomeDirectory != null) {
            if (var5 == 1427597372) {
               return;
            }

            JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
         }

         try {
            if (AttackOption.osNameLowercase.startsWith("win")) {
               if (var5 == 1427597372) {
                  throw new IllegalStateException();
               }

               if (JagexCache.userHomeDirectory == null) {
                  if (var5 == 1427597372) {
                     throw new IllegalStateException();
                  }

                  JagexCache.userHomeDirectory = client.method2321("USERPROFILE");
               }
            } else if (JagexCache.userHomeDirectory == null) {
               if (var5 == 1427597372) {
                  throw new IllegalStateException();
               }

               JagexCache.userHomeDirectory = client.method2321("HOME");
            }

            if (null != JagexCache.userHomeDirectory) {
               if (var5 == 1427597372) {
                  return;
               }

               JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
            }
         } catch (Exception var11) {
         }

         if (null == JagexCache.userHomeDirectory) {
            if (var5 == 1427597372) {
               throw new IllegalStateException();
            }

            JagexCache.userHomeDirectory = "~/";
         }

         classWO.field6405 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""};
         class201.field2288 = new String[]{".jagex_cache_" + -1114182337 * class224.cacheGamebuild, ".file_store_" + class224.cacheGamebuild * -1114182337};

         label155:
         for (int var6 = 0; var6 < 4; var6++) {
            if (var5 == 1427597372) {
               throw new IllegalStateException();
            }

            class452.cacheDir = class137.method4003(var0, var2, var6, (byte)-32);
            if (!class452.cacheDir.exists()) {
               if (var5 == 1427597372) {
                  throw new IllegalStateException();
               }

               class452.cacheDir.mkdirs();
            }

            File[] var7 = class452.cacheDir.listFiles();
            if (var7 != null) {
               if (var5 == 1427597372) {
                  throw new IllegalStateException();
               }

               File[] var8 = var7;

               for (int var9 = 0; var9 < var8.length; var9++) {
                  if (var5 == 1427597372) {
                     throw new IllegalStateException();
                  }

                  File var10 = var8[var9];
                  if (!class194.method4478(var10, false, 2111626722)) {
                     if (var5 == 1427597372) {
                        throw new IllegalStateException();
                     }
                     continue label155;
                  }
               }
            }
            break;
         }

         class107.method3815(class452.cacheDir, 989955989);
         class184.method4485((byte)55);
         JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.dat2", (short)29138), "rw", 1048576000L), 5200, 0);
         JagexCache.JagexCache_idx255File = new BufferedFile(
            new AccessFile(KeyHandler.getFile("main_file_cache.idx255", (short)22937), "rw", 1048576L), 6000, 0
         );
         UserComparator9.JagexCache_idxFiles = new BufferedFile[-808607155 * class134.field1817];

         for (int var16 = 0; var16 < class134.field1817 * -808607155; var16++) {
            if (var5 == 1427597372) {
               return;
            }

            UserComparator9.JagexCache_idxFiles[var16] = new BufferedFile(
               new AccessFile(KeyHandler.getFile("main_file_cache.idx" + var16, (short)15094), "rw", 1048576L), 6000, 0
            );
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "co.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhf;Lxa;I)V")
   @ObfuscatedName("am")
   public static void method2630(FloorUnderlayDefinition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method4503(var1, var2);
      }

      while (true) {
         int var3 = var1.readUnsignedByte(-717633116);
         if (var3 == 0) {
            return;
         }

         var0.decodeNext(var1, var3, var2, 1845735861);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("at")
   static final boolean method2634(int var0) {
      return 14 == var0 || 15 == var0 || var0 >= 44 && var0 <= 51;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   static final boolean method2635(int var0) {
      return 14 == var0 || 15 == var0 || var0 >= -545112501 && var0 <= 51;
   }

   @ObfuscatedSignature(descriptor = "(Lic;III)Ldm;")
   @ObfuscatedName("aa")
   public static final PcmPlayer method2632(TaskHandler var0, int var1, int var2, int var3) {
      try {
         if (0 == EnumComposition.field2157 * 1063377631) {
            if (var3 == -911335249) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            if (var1 >= 0) {
               if (var3 == -911335249) {
                  throw new IllegalStateException();
               }

               if (var1 < 2) {
                  if (var2 < 512) {
                     if (var3 == -911335249) {
                        throw new IllegalStateException();
                     }

                     var2 = 512;
                  }

                  try {
                     PcmPlayer var4 = class380.pcmPlayerProvider.player((short)339);
                     var4.samples = new int[(FaceNormal.PcmPlayer_stereo ? 2 : 1) * 512];
                     var4.field1436 = -1446791373 * var2;
                     var4.init((byte)15);
                     var4.capacity = ((var2 & -2048) + 2048) * -523018411;
                     if (var4.capacity * -570055171 > 32768) {
                        if (var3 == -911335249) {
                           throw new IllegalStateException();
                        }

                        var4.capacity = -1347780608;
                     }

                     var4.open(-570055171 * var4.capacity, 2146020831);
                     if (class339.field4369 * -1378093337 > 0) {
                        if (var3 == -911335249) {
                           throw new IllegalStateException();
                        }

                        if (class372.soundSystem == null) {
                           if (var3 == -911335249) {
                              throw new IllegalStateException();
                           }

                           class372.soundSystem = new SoundSystem();
                           Script.soundSystemExecutor = Executors.newScheduledThreadPool(1);
                           Script.soundSystemExecutor.scheduleAtFixedRate(class372.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
                        }
                     }

                     if (class372.soundSystem != null) {
                        if (class372.soundSystem.players[var1] != null) {
                           if (var3 == -911335249) {
                              throw new IllegalStateException();
                           }

                           throw new IllegalArgumentException();
                        }

                        class372.soundSystem.players[var1] = var4;
                     }

                     return var4;
                  } catch (Throwable var5) {
                     client.method2460(var5);
                     return new PcmPlayer();
                  }
               }

               if (var3 == -911335249) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "co.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mf")
   static void method2636(int var0) {
      try {
         if (!client.isSpellSelected) {
            if (var0 != 798665770) {
               throw new IllegalStateException();
            }
         } else {
            Widget var1 = class226.widgetDefinition
               .getWidgetChild(Skills.selectedSpellWidget * -1070656277, client.selectedSpellChildIndex * -436571069, -1041990954);
            if (var1 != null) {
               if (var0 != 798665770) {
                  throw new IllegalStateException();
               }

               if (var1.onMouseOver != null) {
                  if (var0 != 798665770) {
                     throw new IllegalStateException();
                  }

                  ScriptEvent var2 = new ScriptEvent();
                  var2.widget = var1;
                  var2.args = var1.onMouseOver;
                  class141.runScriptEvent(var2, 1856325427);
               }
            }

            client.selectedSpellItemId = 159227645;
            client.isSpellSelected = false;
            class376.invalidateWidget(var1, (byte)5);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "co.mf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("mg")
   static final void addSceneMenuOptions(int var0, int var1, int var2, int var3, int var4) {
      try {
         if (0 == client.isItemSelected * -415813337 && !client.isSpellSelected) {
            if (var4 >= -586902027) {
               throw new IllegalStateException();
            }

            class166.method4243(var0 - var2, var1 - var3, -1997342808);
         }

         long var5 = -1L;
         int var7 = 0;

         for (int var8 = 0; var8 < classGP.method4258(1468204724); var8++) {
            long var9 = ViewportMouse.ViewportMouse_entityTags[var8];
            if (-1L == var9) {
               if (var4 >= -586902027) {
                  throw new IllegalStateException();
               }
            } else {
               int var13;
               int var14;
               int var15;
               int var16;
               int var18;
               int var19;
               WorldView var21;
               WorldEntity var33;
               label786: {
                  var13 = Tiles.method1494(var9);
                  var14 = (int)(var9 >>> 7 & 127L);
                  var15 = var14;
                  var16 = (int)(var9 >>> 16 & 7L);
                  var18 = HorizontalAlignment.Entity_unpackID(var9);
                  var19 = classLX.method7326(var9);
                  Object var20 = null;
                  var21 = null;
                  var33 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var19);
                  if (var19 >= 0) {
                     if (var4 >= -586902027) {
                        throw new IllegalStateException();
                     }

                     if (var33 != null) {
                        if (var4 >= -586902027) {
                           return;
                        }

                        if (WorldEntity.method10825(var33, 1600404130)) {
                           continue;
                        }

                        var21 = var33.worldView;
                        break label786;
                     }
                  }

                  if (-1 == var19) {
                     if (var4 >= -586902027) {
                        throw new IllegalStateException();
                     }

                     var33 = null;
                     var21 = Occluder.topLevelWorldView;
                  }
               }

               if (var21 != null) {
                  int var23 = -1;
                  if (var19 == client.currentWorldViewId * 1201323213) {
                     if (var4 >= -586902027) {
                        throw new IllegalStateException();
                     }

                     var23 = var21.plane * 2115028565;
                  } else if (-1 == client.currentWorldViewId * 1201323213) {
                     if (var4 >= -586902027) {
                        throw new IllegalStateException();
                     }

                     var23 = var33.worldEntityConfig.method4752((byte)15);
                  } else {
                     WorldEntity var24 = WorldViewManager.method2922(client.worldViewManager, 680297971);
                     WorldView var25 = var24.worldView;
                     if (var25.plane * 2115028565 == var24.worldEntityConfig.method4752((byte)101)) {
                        if (-1 == var19) {
                           if (var4 >= -586902027) {
                              throw new IllegalStateException();
                           }

                           var23 = var24.getPlane(1350327735);
                        } else {
                           var23 = var33.worldEntityConfig.method4752((byte)8);
                        }
                     }
                  }

                  var23 = var23;
                  if (var23 != -1) {
                     if (var16 == 2) {
                        if (var4 >= -586902027) {
                           throw new IllegalStateException();
                        }

                        label777:
                        if (var21.scene.method5784(var23, var13, var14, var9) >= 0) {
                           if (var4 >= -586902027) {
                              throw new IllegalStateException();
                           }

                           ObjectComposition var35 = AsyncHttpResponse.getObjectDefinition(var18, 2094351211);
                           if (var35.transforms != null) {
                              var35 = var35.transform(2068375148);
                           }

                           if (null == var35) {
                              continue;
                           }

                           PendingSpawn var40 = null;

                           for (PendingSpawn var26 = (PendingSpawn)var21.pendingSpawns.last();
                              null != var26;
                              var26 = (PendingSpawn)var21.pendingSpawns.previous()
                           ) {
                              if (var4 >= -586902027) {
                                 throw new IllegalStateException();
                              }

                              if (var26.plane * 1465889165 == var23 && var13 == 1691331269 * var26.x) {
                                 if (var4 >= -586902027) {
                                    throw new IllegalStateException();
                                 }

                                 if (var15 == -7912037 * var26.y) {
                                    if (var4 >= -586902027) {
                                       throw new IllegalStateException();
                                    }

                                    if (var26.objectId2 * -1096388433 == var18) {
                                       if (var4 >= -586902027) {
                                          throw new IllegalStateException();
                                       }

                                       var40 = var26;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (!ApproximateRouteStrategy.field107) {
                              if (var4 >= -586902027) {
                                 return;
                              }

                              if (1 == -415813337 * client.isItemSelected) {
                                 if (var4 >= -586902027) {
                                    throw new IllegalStateException();
                                 }

                                 ClanChannel.insertMenuItem(
                                    Strings.field5019,
                                    client.field790 + " " + classDF.field1350 + " " + class144.colorStartTag(65535, 1626923339) + var35.name,
                                    1,
                                    var18,
                                    var13,
                                    var15,
                                    -1,
                                    false,
                                    var19,
                                    65535
                                 );
                                 break label777;
                              }
                           }

                           if (client.isSpellSelected) {
                              if (var4 >= -586902027) {
                                 throw new IllegalStateException();
                              }

                              if (!ApproximateRouteStrategy.field107 && 4 == (485276933 * DesktopPlatformInfoProvider.selectedSpellFlags & 4)) {
                                 if (var4 >= -586902027) {
                                    throw new IllegalStateException();
                                 }

                                 ClanChannel.insertMenuItem(
                                    client.selectedSpellActionName,
                                    client.selectedSpellName + " " + classDF.field1350 + " " + class144.colorStartTag(65535, -466807679) + var35.name,
                                    2,
                                    var18,
                                    var13,
                                    var15,
                                    -1,
                                    false,
                                    var19,
                                    65535
                                 );
                              }
                           } else {
                              String[] var47 = var35.actions;
                              if (var47 != null) {
                                 if (var4 >= -586902027) {
                                    return;
                                 }

                                 for (int var27 = 4; var27 >= 0; var27--) {
                                    if (var4 >= -586902027) {
                                       return;
                                    }

                                    if (!ApproximateRouteStrategy.field107) {
                                       if (null != var40) {
                                          if (var4 >= -586902027) {
                                             return;
                                          }

                                          if (!var40.isOpShown(var27, 1344631797)) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }
                                             continue;
                                          }
                                       }

                                       String var28 = var47[var27];
                                       if (var40 != null) {
                                          if (var4 >= -586902027) {
                                             throw new IllegalStateException();
                                          }

                                          if (var40.method2988(var27, (byte)89)) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }

                                             var28 = var40.getOpOverride(var27, -504336118);
                                          }
                                       }

                                       if (var28 != null) {
                                          if (var4 >= -586902027) {
                                             throw new IllegalStateException();
                                          }

                                          short var29 = 0;
                                          if (var27 == 0) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }

                                             var29 = 3;
                                          }

                                          if (var27 == 1) {
                                             if (var4 >= -586902027) {
                                                return;
                                             }

                                             var29 = 4;
                                          }

                                          if (var27 == 2) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }

                                             var29 = 5;
                                          }

                                          if (var27 == 3) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }

                                             var29 = 6;
                                          }

                                          if (var27 == 4) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }

                                             var29 = 1001;
                                          }

                                          ClanChannel.insertMenuItem(
                                             var28,
                                             class144.colorStartTag(65535, -1638346016) + var35.name,
                                             var29,
                                             var18,
                                             var13,
                                             var15,
                                             -1,
                                             false,
                                             var19,
                                             65535
                                          );
                                       }
                                    }
                                 }
                              }

                              ClanChannel.insertMenuItem(
                                 Strings.field5125,
                                 class144.colorStartTag(65535, -1329408862) + var35.name,
                                 1002,
                                 var35.id * -965498101,
                                 var13,
                                 var15,
                                 -1,
                                 false,
                                 var19,
                                 65535
                              );
                           }
                        }
                     }

                     if (var16 == 1) {
                        if (var4 >= -586902027) {
                           return;
                        }

                        NPC var36 = (NPC)var21.players.get(var18);
                        if (var36 == null) {
                           if (var4 >= -586902027) {
                              return;
                           }
                           continue;
                        }

                        if (1 == 1880345079 * var36.definition.size) {
                           if (var4 >= -586902027) {
                              return;
                           }

                           if ((var36.x * 340712311 & 127) == 64) {
                              if (var4 >= -586902027) {
                                 throw new IllegalStateException();
                              }

                              if ((var36.y * -1747310679 & 127) == 64) {
                                 if (var4 >= -586902027) {
                                    throw new IllegalStateException();
                                 }

                                 for (int var41 = 0; var41 < var21.field1313.method10502(-2053755886); var41++) {
                                    if (var4 >= -586902027) {
                                       throw new IllegalStateException();
                                    }

                                    NPC var48 = (NPC)var21.players.get(var21.field1313.method10498(var41, (byte)13));
                                    if (var48 != null && var36 != var48) {
                                       if (var4 >= -586902027) {
                                          throw new IllegalStateException();
                                       }

                                       if (1 == var48.definition.size * 1880345079 && var48.x * 340712311 == var36.x * 340712311) {
                                          if (var4 >= -586902027) {
                                             return;
                                          }

                                          if (-1747310679 * var48.y == -1747310679 * var36.y) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }

                                             class40.addNpcToMenu(var48, var48.index * -1903023775, var13, var15, var19, (short)24805);
                                          }
                                       }
                                    }
                                 }

                                 int var42 = client.playerUpdateManager.field1538 * 1320060371;
                                 int[] var49 = client.playerUpdateManager.playerIndices;

                                 for (int var54 = 0; var54 < var42; var54++) {
                                    if (var4 >= -586902027) {
                                       throw new IllegalStateException();
                                    }

                                    Player var58 = (Player)var21.npcs.get(var49[var54]);
                                    if (null != var58) {
                                       if (var4 >= -586902027) {
                                          throw new IllegalStateException();
                                       }

                                       if (340712311 * var36.x == var58.x * 340712311) {
                                          if (var4 >= -586902027) {
                                             throw new IllegalStateException();
                                          }

                                          if (var58.y * -1747310679 == -1747310679 * var36.y) {
                                             if (var4 >= -586902027) {
                                                return;
                                             }

                                             AsyncRestClient.addPlayerToMenu(var58, var49[var54], var13, var15, var19, 1826861838);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        class40.addNpcToMenu(var36, var18, var13, var15, var19, (short)2489);
                     }

                     if (0 == var16) {
                        if (var4 >= -586902027) {
                           return;
                        }

                        Player var37 = (Player)var21.npcs.get(var18);
                        if (null == var37) {
                           if (var4 >= -586902027) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }

                        if (64 == (340712311 * var37.x & 127)) {
                           if (var4 >= -586902027) {
                              throw new IllegalStateException();
                           }

                           if (64 == (var37.y * -1747310679 & 127)) {
                              if (var4 >= -586902027) {
                                 throw new IllegalStateException();
                              }

                              for (int var43 = 0; var43 < var21.field1313.method10502(-1746014213); var43++) {
                                 if (var4 >= -586902027) {
                                    throw new IllegalStateException();
                                 }

                                 NPC var50 = (NPC)var21.players.get(var21.field1313.method10498(var43, (byte)31));
                                 if (var50 != null) {
                                    if (var4 >= -586902027) {
                                       throw new IllegalStateException();
                                    }

                                    if (1 == 1880345079 * var50.definition.size) {
                                       if (var4 >= -586902027) {
                                          throw new IllegalStateException();
                                       }

                                       if (var37.x * 340712311 == 340712311 * var50.x) {
                                          if (var4 >= -586902027) {
                                             throw new IllegalStateException();
                                          }

                                          if (var37.y * -1747310679 == var50.y * -1747310679) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }

                                             class40.addNpcToMenu(var50, var21.field1313.method10498(var43, (byte)4), var13, var15, var19, (short)32557);
                                          }
                                       }
                                    }
                                 }
                              }

                              int var44 = client.playerUpdateManager.field1538 * 1320060371;
                              int[] var51 = client.playerUpdateManager.playerIndices;

                              for (int var55 = 0; var55 < var44; var55++) {
                                 if (var4 >= -586902027) {
                                    throw new IllegalStateException();
                                 }

                                 Player var59 = (Player)var21.npcs.get(var51[var55]);
                                 if (var59 != null) {
                                    if (var4 >= -586902027) {
                                       throw new IllegalStateException();
                                    }

                                    if (var59 != var37) {
                                       if (var4 >= -586902027) {
                                          return;
                                       }

                                       if (var59.x * 340712311 == 340712311 * var37.x) {
                                          if (var4 >= -586902027) {
                                             return;
                                          }

                                          if (-1747310679 * var59.y == var37.y * -1747310679) {
                                             if (var4 >= -586902027) {
                                                throw new IllegalStateException();
                                             }

                                             AsyncRestClient.addPlayerToMenu(var59, var51[var55], var13, var15, var19, 1714005870);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        if (1466770191 * client.combatTargetPlayerIndex != var18) {
                           if (var4 >= -586902027) {
                              return;
                           }

                           AsyncRestClient.addPlayerToMenu(var37, var18, var13, var15, var19, 1353001771);
                        } else {
                           var5 = var9;
                           var7 = var19;
                        }
                     }

                     if (var16 == 3) {
                        if (var4 >= -586902027) {
                           throw new IllegalStateException();
                        }

                        NodeDeque var38 = var21.groundItems[var23][var13][var15];
                        if (null != var38) {
                           if (var4 >= -586902027) {
                              throw new IllegalStateException();
                           }

                           for (TileItem var45 = (TileItem)var38.first(); null != var45; var45 = (TileItem)var38.next()) {
                              if (var4 >= -586902027) {
                                 return;
                              }

                              ItemComposition var52 = class150.ItemDefinition_get(var45.visibleTime * 782226465, 49834084);
                              if (!WorldMapRectangle.field3766) {
                                 if (var4 >= -586902027) {
                                    return;
                                 }

                                 if (1 == -415813337 * client.isItemSelected) {
                                    if (var4 >= -586902027) {
                                       throw new IllegalStateException();
                                    }

                                    ClanChannel.insertMenuItem(
                                       Strings.field5019,
                                       client.field790 + " " + classDF.field1350 + " " + class144.colorStartTag(16748608, -885215251) + var52.name,
                                       16,
                                       var45.visibleTime * 782226465,
                                       var13,
                                       var15,
                                       -1,
                                       false,
                                       var19,
                                       65535
                                    );
                                    continue;
                                 }
                              }

                              if (client.isSpellSelected) {
                                 if (!WorldMapRectangle.field3766) {
                                    if (var4 >= -586902027) {
                                       throw new IllegalStateException();
                                    }

                                    if ((485276933 * DesktopPlatformInfoProvider.selectedSpellFlags & 1) == 1) {
                                       if (var4 >= -586902027) {
                                          return;
                                       }

                                       ClanChannel.insertMenuItem(
                                          client.selectedSpellActionName,
                                          client.selectedSpellName + " " + classDF.field1350 + " " + class144.colorStartTag(16748608, 1523463204) + var52.name,
                                          17,
                                          var45.visibleTime * 782226465,
                                          var13,
                                          var15,
                                          -1,
                                          false,
                                          var19,
                                          65535
                                       );
                                    }
                                 }
                              } else {
                                 String[] var56 = var52.groundActions;

                                 for (int var60 = 4; var60 >= 0; var60--) {
                                    if (!WorldMapRectangle.field3766) {
                                       if (var4 >= -586902027) {
                                          return;
                                       }

                                       if (!var45.method3039(var60, 244325165)) {
                                          if (var4 >= -586902027) {
                                             throw new IllegalStateException();
                                          }
                                       } else {
                                          if (null != var56) {
                                             if (var4 >= -586902027) {
                                                return;
                                             }

                                             if (null != var56[var60]) {
                                                if (var4 >= -586902027) {
                                                   return;
                                                }

                                                byte var62 = 0;
                                                if (var60 == 0) {
                                                   if (var4 >= -586902027) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var62 = 18;
                                                }

                                                if (1 == var60) {
                                                   if (var4 >= -586902027) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var62 = 19;
                                                }

                                                if (2 == var60) {
                                                   if (var4 >= -586902027) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var62 = 20;
                                                }

                                                if (3 == var60) {
                                                   if (var4 >= -586902027) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var62 = 21;
                                                }

                                                if (4 == var60) {
                                                   if (var4 >= -586902027) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var62 = 22;
                                                }

                                                ClanChannel.insertMenuItem(
                                                   var56[var60],
                                                   class144.colorStartTag(16748608, -1602283583) + var52.name,
                                                   var62,
                                                   782226465 * var45.visibleTime,
                                                   var13,
                                                   var15,
                                                   -1,
                                                   false,
                                                   var19,
                                                   65535
                                                );
                                                continue;
                                             }
                                          }

                                          if (var60 == 2) {
                                             if (var4 >= -586902027) {
                                                return;
                                             }

                                             ClanChannel.insertMenuItem(
                                                Strings.field4854,
                                                class144.colorStartTag(16748608, -313940407) + var52.name,
                                                20,
                                                782226465 * var45.visibleTime,
                                                var13,
                                                var15,
                                                -1,
                                                false,
                                                var19,
                                                65535
                                             );
                                          }
                                       }
                                    }
                                 }

                                 ClanChannel.insertMenuItem(
                                    Strings.field5125,
                                    class144.colorStartTag(16748608, 325051668) + var52.name,
                                    1004,
                                    782226465 * var45.visibleTime,
                                    var13,
                                    var15,
                                    -1,
                                    false,
                                    var19,
                                    65535
                                 );
                              }
                           }
                        }
                     }

                     if (4 == var16) {
                        if (var4 >= -586902027) {
                           throw new IllegalStateException();
                        }

                        WorldEntity var39 = (WorldEntity)var21.worldEntities.get((long)var18);
                        if (null == var39) {
                           if (var4 >= -586902027) {
                              throw new IllegalStateException();
                           }
                        } else {
                           WorldEntityConfig var46 = var39.worldEntityConfig;
                           if (client.isItemSelected * -415813337 == 1) {
                              if (var4 >= -586902027) {
                                 return;
                              }

                              ClanChannel.insertMenuItem(
                                 Strings.field5019,
                                 client.field790 + " " + classDF.field1350 + " " + class144.colorStartTag(15574765, 1214715494) + var46.field2378,
                                 61,
                                 var18,
                                 var13,
                                 var15,
                                 -1,
                                 false,
                                 var19,
                                 65535
                              );
                           } else if (client.isSpellSelected) {
                              if (var4 >= -586902027) {
                                 return;
                              }
                           } else {
                              String[] var53 = var46.field2377;
                              if (null != var53) {
                                 if (var4 >= -586902027) {
                                    return;
                                 }

                                 for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var4 >= -586902027) {
                                       throw new IllegalStateException();
                                    }

                                    if (var39.method10851(var57, 835059066) && var53[var57] != null) {
                                       if (var4 >= -586902027) {
                                          throw new IllegalStateException();
                                       }

                                       byte var61 = 0;
                                       if (0 == var57) {
                                          if (var4 >= -586902027) {
                                             throw new IllegalStateException();
                                          }

                                          var61 = 63;
                                       }

                                       if (var57 == 1) {
                                          var61 = 64;
                                       }

                                       if (var57 == 2) {
                                          if (var4 >= -586902027) {
                                             return;
                                          }

                                          var61 = 65;
                                       }

                                       if (3 == var57) {
                                          if (var4 >= -586902027) {
                                             throw new IllegalStateException();
                                          }

                                          var61 = 66;
                                       }

                                       if (4 == var57) {
                                          var61 = 67;
                                       }

                                       ClanChannel.insertMenuItem(
                                          var53[var57],
                                          class144.colorStartTag(15574765, -1309680743) + var46.field2378,
                                          var61,
                                          var18,
                                          var13,
                                          var15,
                                          -1,
                                          false,
                                          var19,
                                          65535
                                       );
                                    }
                                 }
                              }

                              ClanChannel.insertMenuItem(
                                 Strings.field5125,
                                 class144.colorStartTag(15574765, -1803438100) + var46.field2378,
                                 1013,
                                 var46.method4734(113503557),
                                 var13,
                                 var15,
                                 -1,
                                 false,
                                 var19,
                                 65535
                              );
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var5 != -1L) {
            if (var4 >= -586902027) {
               return;
            }

            int var31 = Tiles.method1494(var5);
            int var32 = (int)(var5 >>> 7 & 127L);
            Player var11 = Renderable.method6215(client.combatTargetPlayerIndex * 1466770191, client.worldViewManager, (byte)-69);
            if (null != var11) {
               if (var4 >= -586902027) {
                  throw new IllegalStateException();
               }

               AsyncRestClient.addPlayerToMenu(var11, 1466770191 * client.combatTargetPlayerIndex, var31, var32, var7, 1394457789);
            }
         }
      } catch (RuntimeException var30) {
         throw RestClientThreadFactory.newRunException(var30, "co.mg(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)Lrt;")
   @ObfuscatedName("pi")
   public static NodeDeque method2633(WorldView var0) {
      return var0.objectSounds;
   }

   class62() throws Throwable {
      throw new Error();
   }
}
