import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kd")
public final class GameObject implements net.runelite.api.GameObject, TileObject {
   @ObfuscatedName("ag")
   public long tag = 0L;
   @ObfuscatedName("an")
   int plane;
   @ObfuscatedName("az")
   int field3278;
   @ObfuscatedName("ae")
   int z;
   @ObfuscatedName("au")
   int endY;
   @ObfuscatedName("at")
   int orientation;
   @ObfuscatedName("ak")
   int centerY;
   @ObfuscatedName("aw")
   int startX;
   @ObfuscatedName("ap")
   int endX;
   @ObfuscatedName("aj")
   int centerX;
   @ObfuscatedName("ay")
   int startY;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("av")
   public Renderable renderable;
   @ObfuscatedName("ad")
   int lastDrawn;
   @ObfuscatedName("ai")
   int flags = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("cz")
   static final int field3280 = 74;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field3279 = 28;

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("yn")
   public Model method6305() {
      if (this.renderable == null) {
         return null;
      } else {
         return this.renderable instanceof Model ? (Model)this.renderable : this.renderable.method6220();
      }
   }

   GameObject() {
   }

   public int getConfig() {
      return this.flags * 1362575399;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("wt")
   public void method6306(int var1) {
      this.centerX = var1 * -1556820685;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jd")
   public void method6307(int var1) {
      this.orientation = var1 * 1689425527;
   }

   public Point getSceneMinLocation() {
      return new Point(this.startX * 1666005069, this.startY * 889015863);
   }

   public int getZ() {
      return this.z * 683703035;
   }

   @Nullable
   public String getOpOverride(int var1) {
      PendingSpawn var2 = this.method6304().method3095(this.getHash());
      return var2 == null ? null : var2.method2997(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("iv")
   public void method6308(int var1) {
      this.plane = var1 * -786081505;
   }

   public int getPlane() {
      return this.plane * 1291248351;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("kj")
   public WorldView method6304() {
      return WorldView.method3094(this.method6303());
   }

   public int getX() {
      return this.centerX * 1204024827;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("uh")
   public void method6309(int var1) {
      this.z = var1 * -1268875213;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("vv")
   public void method6310(int var1) {
      this.field3278 = var1 * 2049269999;
   }

   public int sizeY() {
      return this.endY * -2094327665 - this.startY * 889015863 + 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fu")
   public void method6311(int var1) {
      this.flags = var1 * 1921920919;
   }

   public Polygon getCanvasTilePoly() {
      int var1 = 1;
      int var2 = 1;
      if (this instanceof GameObject) {
         GameObject var3 = this;
         var1 = var3.endX * 1553138359 - var3.startX * 1666005069 + 1;
         var2 = var3.endY * -2094327665 - var3.startY * 889015863 + 1;
      }

      return Perspective.getCanvasTileAreaPoly(SecureUrlRequester.client, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
   }

   public int sizeX() {
      return this.endX * 1553138359 - this.startX * 1666005069 + 1;
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("pi")
   public Renderable method6312() {
      return this.renderable;
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(SecureUrlRequester.client, this.getLocalLocation());
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   public long getHash() {
      return this.tag * 1608625415500949283L;
   }

   public boolean isOpShown(int var1) {
      PendingSpawn var2 = this.method6304().method3095(this.getHash());
      return var2 == null ? true : var2.method2999(var1);
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = WorldView.method3094(this.method6303());
      if (var1 == null) {
         var1 = Occluder.topLevelWorldView;
      }

      if (this instanceof GameObject) {
         GameObject var2 = this;
         int var3 = var2.startX * 1666005069;
         int var4 = var2.startY * 889015863;
         int var5 = var2.endX * 1553138359 - var3;
         int var6 = var2.endY * -2094327665 - var4;
         return WorldPoint.fromScene(var1, var3 + var5 / 2, var4 + var6 / 2, this.getPlane());
      } else {
         return WorldPoint.fromLocal(var1, this.getX(), this.getY(), this.getPlane());
      }
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(SecureUrlRequester.client, this.getLocalLocation(), this.getPlane(), var1);
   }

   public int getY() {
      return this.centerY * 1465977803;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ii")
   public void method6313(int var1) {
      this.centerY = var1 * 1817985507;
   }

   public Shape getClickbox() {
      return Perspective.getClickbox(
         SecureUrlRequester.client, this.method6304(), this.method6305(), this.getModelOrientation(), this.getX(), this.getY(), this.getZ()
      );
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bb")
   static int method6302(int var0, Script var1, boolean var2, int var3) {
      try {
         if (3200 == var0) {
            if (var3 == 327716789) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               class27.queueSoundEffect(
                  Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
                  Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
                  Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789],
                  -1645689313
               );
               return 1;
            }
         } else if (var0 == 3201) {
            class408.Interpreter_intStackSize -= -375668463;
            int var19 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var27 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            int var39 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
            int var59 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 3];
            int var64 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 4];
            ArrayList var65 = new ArrayList();
            var65.add(var19);
            KitDefinition.playSong(var65, var27, var39, var59, var64, (byte)10);
            return 1;
         } else if (3202 == var0) {
            if (var3 == 327716789) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               MouseRecorder.method2642(
                  Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
                  Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
                  -2084071294
               );
               return 1;
            }
         } else {
            if (var0 != 3212 && var0 != 3213 && 3209 != var0 && 3181 != var0 && var0 != 3203) {
               if (var3 == 327716789) {
                  throw new IllegalStateException();
               }

               if (3205 != var0) {
                  if (var3 == 327716789) {
                     throw new IllegalStateException();
                  }

                  if (var0 != 3207) {
                     if (var0 != 3214) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        if (3215 != var0 && var0 != 3210) {
                           if (var3 == 327716789) {
                              throw new IllegalStateException();
                           }

                           if (3182 != var0 && 3204 != var0) {
                              if (var3 == 327716789) {
                                 throw new IllegalStateException();
                              }

                              if (var0 != 3206) {
                                 if (3208 != var0) {
                                    if (var0 == 3211) {
                                       if (var3 == 327716789) {
                                          throw new IllegalStateException();
                                       }

                                       return 1;
                                    }

                                    if (3216 == var0) {
                                       int var18 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                                       byte var26 = 0;
                                       class67 var38 = (class67)GrandExchangeOffer.findEnumerated(
                                          ApproximateRouteStrategy.method381(1548837905), var18, (byte)1
                                       );
                                       if (var38 != null) {
                                          if (var3 == 327716789) {
                                             throw new IllegalStateException();
                                          }

                                          byte var70;
                                          if (var38 != class67.field1266) {
                                             if (var3 == 327716789) {
                                                throw new IllegalStateException();
                                             }

                                             var70 = 1;
                                          } else {
                                             var70 = 0;
                                          }

                                          var26 = var70;
                                       }

                                       Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var26;
                                       return 1;
                                    }

                                    if (3218 == var0) {
                                       if (var3 == 327716789) {
                                          throw new IllegalStateException();
                                       }

                                       int var17 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                                       int var25 = 0;
                                       class66 var37 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(1426623930), var17, (byte)1);
                                       if (var37 != null) {
                                          if (var3 == 327716789) {
                                             throw new IllegalStateException();
                                          }

                                          var25 = class66.field477 != var37 ? 1 : 0;
                                       }

                                       Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var25;
                                       return 1;
                                    }

                                    if (var0 != 3217) {
                                       if (var3 == 327716789) {
                                          throw new IllegalStateException();
                                       }

                                       if (var0 != 3219) {
                                          if (var0 == 3220) {
                                             if (var3 == 327716789) {
                                                throw new IllegalStateException();
                                             }

                                             class408.Interpreter_intStackSize -= 708726074;
                                             int var16 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                                             int var24 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
                                             classGK.method4244(var16, var24, 655312653);
                                             return 1;
                                          }

                                          if (var0 == 3221) {
                                             if (var3 == 327716789) {
                                                throw new IllegalStateException();
                                             }

                                             class408.Interpreter_intStackSize -= 2126178222;
                                             int var15 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                                             int var23 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
                                             int var36 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
                                             int var58 = Interpreter.Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
                                             int var63 = Interpreter.Interpreter_intStack[4 + 327716789 * class408.Interpreter_intStackSize];
                                             int var9 = Interpreter.Interpreter_intStack[5 + class408.Interpreter_intStackSize * 327716789];
                                             ArrayList var10 = new ArrayList();
                                             var10.add(var15);
                                             var10.add(var23);
                                             KitDefinition.playSong(var10, var36, var58, var63, var9, (byte)80);
                                             return 1;
                                          }

                                          if (var0 == 3222) {
                                             class408.Interpreter_intStackSize -= 1417452148;
                                             int var14 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                                             int var22 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
                                             int var35 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
                                             int var57 = Interpreter.Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
                                             class182.method4489(var14, var22, var35, var57, 261830680);
                                             return 1;
                                          }

                                          return 2;
                                       }

                                       if (var3 == 327716789) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    class67 var13 = class67.field1266;
                                    class66 var21 = class66.field477;
                                    byte var33 = -1;
                                    int var55 = -1;
                                    if (3217 == var0) {
                                       if (var3 == 327716789) {
                                          throw new IllegalStateException();
                                       }

                                       int var8 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                                       var13 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(741541825), var8, (byte)1);
                                       if (null == var13) {
                                          if (var3 == 327716789) {
                                             throw new IllegalStateException();
                                          }

                                          throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                                       }
                                    }

                                    if (var0 == 3219) {
                                       if (var3 == 327716789) {
                                          throw new IllegalStateException();
                                       }

                                       int var60 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                                       var21 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(629542034), var60, (byte)1);
                                       if (var21 == null) {
                                          if (var3 == 327716789) {
                                             throw new IllegalStateException();
                                          }

                                          throw new RuntimeException(String.format("Unrecognized game option %d", var60));
                                       }
                                    }

                                    if (var21 == class66.field477) {
                                       switch (1194397097 * var13.field1274) {
                                          case 1:
                                          case 2:
                                          case 3:
                                             var33 = 0;
                                             var55 = 1;
                                             break;
                                          case 4:
                                             var33 = 0;
                                             var55 = Integer.MAX_VALUE;
                                             break;
                                          case 5:
                                             var33 = 0;
                                             var55 = 100;
                                             break;
                                          default:
                                             String var61 = String.format("Unkown device option: %s.", var13);
                                             throw new RuntimeException(var61);
                                       }
                                    } else {
                                       switch (1002545705 * var21.field483) {
                                          case 1:
                                             var33 = 0;
                                             var55 = 1;
                                             break;
                                          case 2:
                                          case 3:
                                          case 4:
                                             var33 = 0;
                                             var55 = 100;
                                             break;
                                          default:
                                             String var62 = String.format("Unkown game option: %s.", var21);
                                             throw new RuntimeException(var62);
                                       }
                                    }

                                    Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33;
                                    Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var55;
                                    return 1;
                                 }

                                 if (var3 == 327716789) {
                                    throw new IllegalStateException();
                                 }
                              }
                           }
                        }
                     }

                     class67 var12 = class67.field1266;
                     class66 var20 = class66.field477;
                     int var31 = 0;
                     if (3214 == var0) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        int var47 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        var12 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-634891213), var47, (byte)1);
                        if (null == var12) {
                           if (var3 == 327716789) {
                              throw new IllegalStateException();
                           }

                           throw new RuntimeException(String.format("Unrecognized device option %d", var47));
                        }
                     }

                     if (var0 == 3215) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        int var48 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        var20 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(706051389), var48, (byte)1);
                        if (null == var20) {
                           if (var3 == 327716789) {
                              throw new IllegalStateException();
                           }

                           throw new RuntimeException(String.format("Unrecognized game option %d", var48));
                        }
                     }

                     if (var0 == 3210) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        int var49 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        var12 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-2070068254), var49, (byte)1);
                        if (var12 == null) {
                           if (var3 == 327716789) {
                              throw new IllegalStateException();
                           }

                           var20 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(1975139653), var49, (byte)1);
                           if (null == var20) {
                              if (var3 == 327716789) {
                                 throw new IllegalStateException();
                              }

                              throw new RuntimeException(String.format("Unrecognized client option %d", var49));
                           }
                        }
                     } else if (var0 == 3182) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        var12 = class67.field1270;
                     } else if (var0 == 3204) {
                        var20 = class66.field480;
                     } else if (3206 == var0) {
                        var20 = class66.field478;
                     } else if (3208 == var0) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        var20 = class66.field481;
                     }

                     if (var20 == class66.field477) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        switch (var12.field1274 * 1194397097) {
                           case 1:
                              byte var68;
                              if (ClientPreferences.method1560(class468.clientPreferences, 726078613)) {
                                 if (var3 == 327716789) {
                                    throw new IllegalStateException();
                                 }

                                 var68 = 1;
                              } else {
                                 var68 = 0;
                              }

                              var31 = var68;
                              break;
                           case 2:
                              byte var67;
                              if (class468.clientPreferences.isTitleMusicDisabled(578735457)) {
                                 if (var3 == 327716789) {
                                    throw new IllegalStateException();
                                 }

                                 var67 = 1;
                              } else {
                                 var67 = 0;
                              }

                              var31 = var67;
                              break;
                           case 3:
                              byte var66;
                              if (class468.clientPreferences.isDisplayingFps(756705879)) {
                                 if (var3 == 327716789) {
                                    throw new IllegalStateException();
                                 }

                                 var66 = 1;
                              } else {
                                 var66 = 0;
                              }

                              var31 = var66;
                              break;
                           case 4:
                              var31 = class468.clientPreferences.method1595(1306584676);
                              break;
                           case 5:
                              var31 = ApproximateRouteStrategy.method383((byte)-6);
                              break;
                           case 6:
                              byte var10000;
                              if (class468.clientPreferences.method1669(-1171752513)) {
                                 if (var3 == 327716789) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = 1;
                              } else {
                                 var10000 = 0;
                              }

                              var31 = var10000;
                              break;
                           default:
                              String var50 = String.format("Unkown device option: %s.", var12);
                              throw new RuntimeException(var50);
                        }
                     } else {
                        switch (var20.field483 * 1002545705) {
                           case 1:
                              byte var69;
                              if (class468.clientPreferences.isRoofsHidden(168162965)) {
                                 if (var3 == 327716789) {
                                    throw new IllegalStateException();
                                 }

                                 var69 = 1;
                              } else {
                                 var69 = 0;
                              }

                              var31 = var69;
                              break;
                           case 2:
                              int var54 = class468.clientPreferences.getMusicVolume((byte)6);
                              var31 = Math.round(100 * var54 / 255.0F);
                              break;
                           case 3:
                              int var53 = ClientPreferences.method1620(class468.clientPreferences, 509125098);
                              var31 = Math.round(100 * var53 / 127.0F);
                              break;
                           case 4:
                              int var52 = ClientPreferences.method1623(class468.clientPreferences, (byte)0);
                              var31 = Math.round(var52 * 100 / 127.0F);
                              break;
                           default:
                              String var51 = String.format("Unkown game option: %s.", var20);
                              throw new RuntimeException(var51);
                        }
                     }

                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var31;
                     return 1;
                  }

                  if (var3 == 327716789) {
                     throw new IllegalStateException();
                  }
               }
            }

            class67 var4 = class67.field1266;
            class66 var5 = class66.field477;
            int var6 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            if (var0 == 3212) {
               int var7 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               var4 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(549661167), var7, (byte)1);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var7));
               }
            }

            if (var0 == 3213) {
               if (var3 == 327716789) {
                  throw new IllegalStateException();
               }

               int var40 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               var5 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(1838945979), var40, (byte)1);
               if (null == var5) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var40));
               }
            }

            if (var0 == 3209) {
               if (var3 == 327716789) {
                  throw new IllegalStateException();
               }

               int var41 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               var4 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(361106428), var41, (byte)1);
               if (null == var4) {
                  var5 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(208988931), var41, (byte)1);
                  if (var5 == null) {
                     if (var3 == 327716789) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException(String.format("Unrecognized client option %d", var41));
                  }
               }
            } else if (3181 == var0) {
               if (var3 == 327716789) {
                  throw new IllegalStateException();
               }

               var4 = class67.field1270;
            } else if (var0 == 3203) {
               var5 = class66.field480;
            } else if (3205 == var0) {
               if (var3 == 327716789) {
                  throw new IllegalStateException();
               }

               var5 = class66.field478;
            } else if (3207 == var0) {
               if (var3 == 327716789) {
                  throw new IllegalStateException();
               }

               var5 = class66.field481;
            }

            if (class66.field477 == var5) {
               if (var3 == 327716789) {
                  throw new IllegalStateException();
               }

               switch (var4.field1274 * 1194397097) {
                  case 1:
                     boolean var72;
                     if (var6 == 1) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        var72 = true;
                     } else {
                        var72 = false;
                     }

                     ClientPreferences.method1569(class468.clientPreferences, var72, 1319471299);
                     break;
                  case 2:
                     boolean var71;
                     if (1 == var6) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        var71 = true;
                     } else {
                        var71 = false;
                     }

                     class468.clientPreferences.updateTitleMusicDisabled(var71, -1051120691);
                     break;
                  case 3:
                     ClientPreferences.method1591(class468.clientPreferences, var6 == 1, -682535269);
                     break;
                  case 4:
                     if (var6 < 0) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        var6 = 0;
                     }

                     class468.clientPreferences.updateEULA(var6, (byte)-12);
                     break;
                  case 5:
                     DefaultsGroup.method11178(var6, -1681370493);
                     break;
                  case 6:
                     boolean var10001;
                     if (1 == var6) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     class468.clientPreferences.method1671(var10001, 7643725);
                     break;
                  default:
                     String var42 = String.format("Unkown device option: %s.", var4);
                     throw new RuntimeException(var42);
               }
            } else {
               switch (1002545705 * var5.field483) {
                  case 1:
                     boolean var73;
                     if (1 == var6) {
                        if (var3 == 327716789) {
                           throw new IllegalStateException();
                        }

                        var73 = true;
                     } else {
                        var73 = false;
                     }

                     class468.clientPreferences.updateRoofsHidden(var73, (short)24773);
                     break;
                  case 2:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     int var46 = Math.round(var6 * 255 / 100.0F);
                     LoginState.setMusicVolume(var46, -717394585);
                     break;
                  case 3:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     int var45 = Math.round(127 * var6 / 100.0F);
                     User.method10994(var45, (byte)51);
                     break;
                  case 4:
                     var6 = Math.min(Math.max(var6, 0), 100);
                     int var44 = Math.round(var6 * 127 / 100.0F);
                     class383.method8659(var44, 555917642);
                     break;
                  default:
                     String var43 = String.format("Unkown game option: %s.", var5);
                     throw new RuntimeException(var43);
               }
            }

            return 1;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "kd.bb(" + 41);
      }
   }

   public int getOrientation() {
      int var1 = this.getModelOrientation();
      int var2 = this.getConfig() >> 6 & 3;
      return var2 * 512 + var1;
   }

   public int getModelOrientation() {
      return this.orientation * 46801735;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ml")
   public int method6303() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method6303());
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(SecureUrlRequester.client, var1, this.getLocalLocation(), var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("cb")
   public void method6314(long var1) {
      this.tag = var1 * -108185211891154805L;
   }

   @ObfuscatedSignature(descriptor = "(Ljz;)V")
   @ObfuscatedName("dn")
   public void method6315(Renderable var1) {
      this.renderable = var1;
   }

   public Shape getConvexHull() {
      Model var1 = this.method6305();
      return var1 == null ? null : var1.method6857(this.method6304(), this.getX(), this.getY(), this.getModelOrientation(), this.getZ());
   }

   public Point getSceneMaxLocation() {
      return new Point(this.endX * 1553138359, this.endY * -2094327665);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IB)V")
   @ObfuscatedName("aj")
   public static void method6301(AbstractArchive var0, int var1, byte var2) {
      try {
         if (class345.field4309.isEmpty()) {
            if (var2 != 3) {
               throw new IllegalStateException();
            }
         } else {
            ArrayList var3 = new ArrayList();
            Iterator var4 = class345.field4309.iterator();

            while (var4.hasNext()) {
               if (var2 != 3) {
                  return;
               }

               MidiRequest var5 = (MidiRequest)var4.next();
               var5.field4279 = false;
               var5.field4278 = false;
               var5.field4268 = false;
               var5.field4269 = false;
               var5.musicTrackArchive = var0;
               var5.musicTrackVolume = -1589930535 * var1;
               var5.field4267 = 0.0F;
               var3.add(var5);
            }

            class113.method3918(
               var3,
               class345.musicPlayerStatus * 847508035,
               class345.field4312 * 595186573,
               class345.field4307 * 1197280793,
               -673721945 * class345.field4306,
               false,
               -1882065613
            );
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "kd.aj(" + ')');
      }
   }
}
