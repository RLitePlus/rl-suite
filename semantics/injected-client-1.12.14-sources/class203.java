import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ho")
public class class203 extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2277 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final String field2278 = "Authorization";
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   static EvictingDualNodeHashTable field2022 = new EvictingDualNodeHashTable(64);
   @ObfuscatedSignature(descriptor = "Ljp;")
   @ObfuscatedName("jq")
   static Task js5SocketTask;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   public static void method4628() {
      field2022.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lll;)V")
   @ObfuscatedName("xe")
   public static void method4631(WorldMapSection0 var0) {
      if (var0 == null) {
         var0.method7195();
      }
   }

   class203() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public static void method4629() {
      field2022.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public static void method4630() {
      field2022.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhm;I)Lky;")
   @ObfuscatedName("np")
   public static Model method4632(SpotAnimationDefinition var0, int var1) {
      if (var0 == null) {
         return var0.method4620();
      } else {
         Model var2 = var0.method4617((byte)71);
         if (null == var2) {
            return null;
         } else {
            Model var3;
            if (var0.sequence * -508160903 != -1 && var1 != -1) {
               var3 = ClientPacket.SequenceDefinition_get(var0.sequence * -508160903, -421082649).transformSpotAnimationModel(var2, var1, -306677100);
            } else {
               var3 = var2.toSharedSpotAnimationModel(true);
            }

            if (var0.widthScale * -1858034947 != 128 || 128 != 1708511037 * var0.heightScale) {
               Model.method6851(var3, -1858034947 * var0.widthScale, var0.heightScale * 1708511037, var0.widthScale * -1858034947);
            }

            if (0 != var0.orientation * -1496786229) {
               if (90 == var0.orientation * -1496786229) {
                  var3.method6846();
               }

               if (180 == var0.orientation * -1496786229) {
                  var3.method6846();
                  var3.method6846();
               }

               if (var0.orientation * -1496786229 == 270) {
                  var3.method6846();
                  var3.method6846();
                  var3.method6846();
               }
            }

            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Lof;IIIII)V")
   @ObfuscatedName("nx")
   static final void drawModelComponents(Widget[] var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         for (int var6 = var1; var6 <= var2; var6++) {
            if (var5 <= -1886600450) {
               throw new IllegalStateException();
            }

            Widget var7 = var0[var6];
            if (var7 == null) {
               if (var5 <= -1886600450) {
                  throw new IllegalStateException();
               }
            } else if (var3 == 794900977 * var7.parentId) {
               if (var5 <= -1886600450) {
                  return;
               }

               if (var7.field4451 * 1865628485 != var4) {
                  if (var5 <= -1886600450) {
                     return;
                  }
               } else {
                  if (var7.isIf3) {
                     if (var5 <= -1886600450) {
                        throw new IllegalStateException();
                     }

                     if (class330.isComponentHidden(var7, (byte)72)) {
                        if (var5 <= -1886600450) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  if (0 == 928687775 * var7.type) {
                     if (!var7.isIf3) {
                        if (var5 <= -1886600450) {
                           return;
                        }

                        if (class330.isComponentHidden(var7, (byte)-29)) {
                           if (var5 <= -1886600450) {
                              throw new IllegalStateException();
                           }

                           if (var7 != class330.mousedOverWidgetIf1) {
                              if (var5 <= -1886600450) {
                                 return;
                              }
                              continue;
                           }
                        }
                     }

                     drawModelComponents(
                        var0, -1516264759 * var7.field4453, var7.field4454 * -86298045, var7.id * 278777747, 2077538819 * var7.childIndex, -1569261103
                     );
                     if (null != var7.children) {
                        if (var5 <= -1886600450) {
                           return;
                        }

                        drawModelComponents(var7.children, 0, var7.children.length - 1, var7.id * 278777747, -1, 1702132035);
                     }

                     if (var7.childIndex * 2077538819 == -1) {
                        if (var5 <= -1886600450) {
                           throw new IllegalStateException();
                        }

                        InterfaceParent var8 = (InterfaceParent)client.interfaceParents.method8915(var7.id * 278777747);
                        if (null != var8) {
                           if (var5 <= -1886600450) {
                              return;
                           }

                           classTE.method10606(var8.group * -1385287145, -247096033);
                        }
                     }
                  }

                  if (6 == var7.type * 928687775) {
                     if (var5 <= -1886600450) {
                        return;
                     }

                     label205: {
                        if (var7.sequenceId * -750054055 == -1) {
                           if (var5 <= -1886600450) {
                              throw new IllegalStateException();
                           }

                           if (1986719883 * var7.sequenceId2 == -1) {
                              break label205;
                           }
                        }

                        boolean var13 = class556.runCs1(var7, -1333135934);
                        int var9;
                        if (var13) {
                           var9 = 1986719883 * var7.sequenceId2;
                        } else {
                           var9 = -750054055 * var7.sequenceId;
                        }

                        if (-1 != var9) {
                           if (var5 <= -1886600450) {
                              throw new IllegalStateException();
                           }

                           SequenceDefinition var10 = ClientPacket.SequenceDefinition_get(var9, 243836180);
                           if (!var10.isCachedModelIdSet((byte)-70)) {
                              for (var7.modelFrameCycle = var7.modelFrameCycle + 1209031921 * client.graphicsCycle;
                                 var7.modelFrameCycle * 1113141895 > var10.frameLengths[81622619 * var7.modelFrame];
                                 class376.invalidateWidget(var7, (byte)5)
                              ) {
                                 var7.modelFrameCycle = var7.modelFrameCycle - -450825417 * var10.frameLengths[var7.modelFrame * 81622619];
                                 var7.modelFrame += 213830099;
                                 if (81622619 * var7.modelFrame >= var10.frameIds.length) {
                                    var7.modelFrame = var7.modelFrame - var10.frameCount * -600526271;
                                    if (81622619 * var7.modelFrame >= 0) {
                                       if (var5 <= -1886600450) {
                                          throw new IllegalStateException();
                                       }

                                       if (81622619 * var7.modelFrame < var10.frameIds.length) {
                                          continue;
                                       }
                                    }

                                    var7.modelFrame = 0;
                                 }
                              }
                           } else {
                              var7.modelFrame = var7.modelFrame + 1211461877 * client.graphicsCycle;
                              int var11 = var10.getMayaAnimFrame((byte)123);
                              label175:
                              if (var7.modelFrame * 81622619 >= var11) {
                                 if (var5 <= -1886600450) {
                                    throw new IllegalStateException();
                                 }

                                 var7.modelFrame = var7.modelFrame - var10.frameCount * -600526271;
                                 if (81622619 * var7.modelFrame >= 0) {
                                    if (var5 <= -1886600450) {
                                       throw new IllegalStateException();
                                    }

                                    if (var7.modelFrame * 81622619 < var11) {
                                       break label175;
                                    }

                                    if (var5 <= -1886600450) {
                                       return;
                                    }
                                 }

                                 var7.modelFrame = 0;
                              }

                              class376.invalidateWidget(var7, (byte)5);
                           }
                        }
                     }

                     if (0 != -470641523 * var7.field4473) {
                        if (var5 <= -1886600450) {
                           throw new IllegalStateException();
                        }

                        if (!var7.isIf3) {
                           if (var5 <= -1886600450) {
                              return;
                           }

                           int var14 = var7.field4473 * -470641523 >> 16;
                           int var16 = var7.field4473 * -470641523 << 16 >> 16;
                           var14 *= -1533995753 * client.graphicsCycle;
                           var16 *= client.graphicsCycle * -1533995753;
                           var7.modelAngleX = -1977744073 * (var14 + 751747207 * var7.modelAngleX & 2047);
                           var7.modelAngleY = 676548941 * (1629507461 * var7.modelAngleY + var16 & 2047);
                           class376.invalidateWidget(var7, (byte)5);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "ho.nx(" + ')');
      }
   }
}
