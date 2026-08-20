import java.util.LinkedList;
import java.util.List;
import net.runelite.api.AmbientSoundEffect;
import net.runelite.api.coords.LocalPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cq")
public final class ObjectSound extends Node implements AmbientSoundEffect {
   @ObfuscatedName("lp")
   static String gameSessionServiceBaseUrl;
   @ObfuscatedName("at")
   final int x;
   @ObfuscatedName("ai")
   int field1098;
   @ObfuscatedName("ac")
   int field1102;
   @ObfuscatedName("ag")
   final int y;
   @ObfuscatedSignature(descriptor = "Liv;")
   @ObfuscatedName("ap")
   final ObjectComposition obj;
   @ObfuscatedName("ak")
   int field1096;
   @ObfuscatedName("af")
   int field1105;
   @ObfuscatedName("av")
   final int plane;
   @ObfuscatedSignature(descriptor = "Ldk;")
   @ObfuscatedName("ay")
   RawPcmStream stream1;
   @ObfuscatedName("au")
   int soundEffectId;
   @ObfuscatedSignature(descriptor = "Ldk;")
   @ObfuscatedName("az")
   RawPcmStream stream2;
   @ObfuscatedName("aj")
   final int field1094;
   @ObfuscatedName("an")
   final int maxX;
   @ObfuscatedName("as")
   int field1099;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("ar")
   class343 field1106;
   @ObfuscatedSignature(descriptor = "Lpu;")
   @ObfuscatedName("ab")
   final class402 field1108;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("ax")
   class343 field1103;
   @ObfuscatedName("aw")
   int field1097;
   @ObfuscatedName("ae")
   final int maxY;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("al")
   class343 field1104;
   @ObfuscatedName("ah")
   int field1107;
   @ObfuscatedName("am")
   boolean field1113;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("ao")
   static final NodeDeque field1087 = new NodeDeque();
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("aq")
   static final class343 field1089 = class343.field4175;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   static final int field1109 = 93;
   @ObfuscatedName("ad")
   int[] soundEffectIds;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method2734() {
      return super.toString();
   }

   @ObfuscatedSignature(descriptor = "(Lts;IIIII)V")
   @ObfuscatedName("ag")
   void method2654(WorldEntity var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = ClientPreferences.method1623(class468.clientPreferences, (byte)0);
         if (this.field1113) {
            if (var6 <= 1389819596) {
               throw new IllegalStateException();
            } else {
               this.method2661(0, this.field1107 * -297601409, this.field1106, (byte)-43);
               this.method2663(0, this.field1107 * -297601409, this.field1106, (byte)11);
               this.method2669((byte)-1);
               this.method2674(-2059505829);
               if (class189.method4815(this.stream1, 1636192381) == 0) {
                  if (var6 <= 1389819596) {
                     throw new IllegalStateException();
                  }

                  if (class189.method4815(this.stream2, 419303214) == 0) {
                     method2697(this, 665624616);
                     method2706(this, 1510917926);
                     this.field1113 = false;
                  }
               }
            }
         } else {
            if (-1 == -1203626699 * this.soundEffectId) {
               if (var6 <= 1389819596) {
                  throw new IllegalStateException();
               }

               if (null == this.soundEffectIds) {
                  if (var6 <= 1389819596) {
                     return;
                  }

                  return;
               }
            }

            WorldEntity var8 = client.worldViewManager.method2917(this.plane * -686711829, -1209535253);
            if (var7 != 0) {
               if (var6 <= 1389819596) {
                  throw new IllegalStateException();
               }

               int var10 = 1915964479 * this.x;
               class402 var11 = this.field1108;
               boolean var10000;
               if (var8 == var1) {
                  if (var6 <= 1389819596) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1;
               } else {
                  var10000 = 0;
               }

               boolean var9;
               label259: {
                  boolean var12 = (boolean)var10000;
                  if (var12) {
                     if (var6 <= 1389819596) {
                        throw new IllegalStateException();
                     }

                     if (var10 != var2) {
                        if (var6 <= 1389819596) {
                           return;
                        }

                        var9 = 0;
                        break label259;
                     }
                  } else {
                     if (null != var1) {
                        if (var6 <= 1389819596) {
                           throw new IllegalStateException();
                        }

                        if (var1.worldEntityConfig.method4752((byte)127) != var2) {
                           var9 = 0;
                           break label259;
                        }
                     }

                     if (null != var8) {
                        if (var6 <= 1389819596) {
                           throw new IllegalStateException();
                        }

                        if (var8.worldEntityConfig.method4752((byte)11) != var10) {
                           if (var6 <= 1389819596) {
                              throw new IllegalStateException();
                           }

                           var9 = 0;
                           break label259;
                        }
                     }

                     if (null == var1) {
                        if (var6 <= 1389819596) {
                           return;
                        }

                        var10000 = var2;
                     } else {
                        var10000 = var1.getPlane(-1006559944);
                     }

                     int var13 = var10000;
                     if (null == var8) {
                        if (var6 <= 1389819596) {
                           throw new IllegalStateException();
                        }

                        var10000 = var10;
                     } else {
                        var10000 = var8.getPlane(-134182467);
                     }

                     int var14 = var10000;
                     if (var14 != var13) {
                        if (var6 <= 1389819596) {
                           throw new IllegalStateException();
                        }

                        var9 = 0;
                        break label259;
                     }
                  }

                  switch (var11.field5243 * -1573211635) {
                     case 0:
                        var9 = 1;
                        break;
                     case 1:
                        var9 = var12;
                        break;
                     case 2:
                        label243: {
                           if (var8 != var1) {
                              if (var6 <= 1389819596) {
                                 throw new IllegalStateException();
                              }

                              if (var8 != null) {
                                 var24 = false;
                                 break label243;
                              }

                              if (var6 <= 1389819596) {
                                 throw new IllegalStateException();
                              }
                           }

                           var24 = true;
                        }

                        var9 = var24;
                        break;
                     default:
                        var9 = 0;
                  }
               }

               if (var9) {
                  if (var6 <= 1389819596) {
                     throw new IllegalStateException();
                  }

                  this.method2669((byte)-1);
                  this.method2674(-1943007104);
                  var9 = class204.method4650(var3, var4, this, 893473998);
                  double var18;
                  if (this.field1097 * -1922168877 < this.field1096 * 30889521) {
                     if (var6 <= 1389819596) {
                        throw new IllegalStateException();
                     }

                     var18 = LoginScreenAnimation.method1315(
                        this.field1096 * 30889521 - var9, 30889521 * this.field1096 - this.field1097 * -1922168877, this.field1103, -774462451
                     );
                  } else {
                     var18 = 1.0;
                  }

                  int var19 = (int)(var18 * var7);
                  int var20 = class189.method4815(this.stream1, 1186902029);
                  int var21 = class189.method4815(this.stream2, -368237232);
                  if (var20 < var19) {
                     if (var6 <= 1389819596) {
                        throw new IllegalStateException();
                     }

                     this.method2661(var19, -590775437 * this.field1105, this.field1104, (byte)-88);
                  } else if (var20 > var19) {
                     if (var6 <= 1389819596) {
                        return;
                     }

                     this.method2661(var19, -297601409 * this.field1107, this.field1106, (byte)57);
                  }

                  if (var21 < var19) {
                     this.method2663(var19, -590775437 * this.field1105, this.field1104, (byte)-78);
                  } else if (var21 > var19) {
                     if (var6 <= 1389819596) {
                        throw new IllegalStateException();
                     }

                     this.method2663(var19, -297601409 * this.field1107, this.field1106, (byte)-32);
                  }

                  if (this.stream1 != null) {
                     if (var6 <= 1389819596) {
                        return;
                     }

                     this.method2669((byte)-1);
                  } else if (this.soundEffectId * -1203626699 >= 0) {
                     if (var6 <= 1389819596) {
                        return;
                     }

                     if (var19 > 0) {
                        if (var6 <= 1389819596) {
                           throw new IllegalStateException();
                        }

                        this.method2680(-1203626699 * this.soundEffectId, 0, (byte)18);
                     }
                  }

                  if (null != this.stream2) {
                     this.method2674(-1382738320);
                  } else if (null != this.soundEffectIds && (this.field1102 -= var5 * -373095675) * 150622669 <= 0 && var19 > 0) {
                     if (var6 <= 1389819596) {
                        throw new IllegalStateException();
                     }

                     this.method2691(this.soundEffectIds, var19, 341321924);
                     this.method2663(var19, -590775437 * this.field1105, this.field1104, (byte)13);
                     this.method2674(-1692596509);
                  }

                  return;
               }
            }

            this.method2661(0, 150, field1089, (byte)-8);
            this.method2663(0, 150, field1089, (byte)40);
            this.method2669((byte)-1);
            this.method2674(-1952918268);
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "cq.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILnb;B)V")
   @ObfuscatedName("ae")
   void method2661(int var1, int var2, class343 var3, byte var4) {
      try {
         if (this.stream1 != null) {
            if (var4 == 1) {
               throw new IllegalStateException();
            }

            if (this.stream1.field1387 != var1) {
               this.stream1.field1389 = this.stream1.method3247();
               this.stream1.field1399 = ParamComposition.method4949((byte)15);
               this.stream1.field1387 = var1;
               this.stream1.field1390 = HttpRequestTask.method88(
                  var2,
                  Math.abs(this.stream1.field1389 - this.stream1.field1387),
                  ClientPreferences.method1623(class468.clientPreferences, (byte)0),
                  -1759377449
               );
               this.stream1.field1391 = var3;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "cq.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILnb;B)V")
   @ObfuscatedName("aj")
   void method2663(int var1, int var2, class343 var3, byte var4) {
      try {
         if (this.stream2 != null) {
            if (var4 == 1) {
               throw new IllegalStateException();
            }

            if (var1 != this.stream2.field1387) {
               this.stream2.field1389 = this.stream2.method3247();
               this.stream2.field1399 = ParamComposition.method4949((byte)15);
               int var5 = HttpRequestTask.method88(
                  var2, Math.abs(this.stream2.field1389 - var1), ClientPreferences.method1623(class468.clientPreferences, (byte)0), 755041159
               );
               this.stream2.field1390 = var5;
               this.stream2.field1387 = var1;
               this.stream2.field1391 = var3;
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cq.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   void method2669(byte var1) {
      try {
         if (this.stream1 != null) {
            if (var1 != -1) {
               throw new IllegalStateException();
            }

            int var2 = this.stream1.method3247();
            long var3 = ParamComposition.method4949((byte)15);
            long var5 = var3 - this.stream1.field1399;
            int var8 = this.stream1.field1389;
            int var9 = this.stream1.field1387;
            class343 var10 = this.stream1.field1391;
            int var11 = this.stream1.field1390;
            int var7;
            if (var9 == var2) {
               var7 = var2;
            } else {
               int var12;
               if (var2 > var9) {
                  if (var1 != -1) {
                     throw new IllegalStateException();
                  }

                  double var13 = 1.0 - LoginScreenAnimation.method1315(var5, var11, var10, 1722854663);
                  var12 = (int)(var13 * (var8 - var9)) + var9;
               } else {
                  double var16 = LoginScreenAnimation.method1315(var5, var11, var10, 1115566766);
                  var12 = (int)(var16 * (var9 - var8)) + var8;
               }

               var7 = var12;
            }

            if (var7 != var2) {
               if (var1 != -1) {
                  throw new IllegalStateException();
               }

               this.stream1.method3251(var7);
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "cq.ak(" + ')');
      }
   }

   public LocalPoint getMaxPosition() {
      return new LocalPoint(this.maxY * 127429897, this.field1094 * 1835506585, class330.localPlayer.worldViewId * 1753020269);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   void method2674(int var1) {
      try {
         if (null != this.stream2) {
            if (var1 >= -883131913) {
               throw new IllegalStateException();
            }

            int var2 = this.stream2.method3247();
            long var3 = ParamComposition.method4949((byte)15);
            long var5 = var3 - this.stream2.field1399;
            int var8 = this.stream2.field1389;
            int var9 = this.stream2.field1387;
            class343 var10 = this.stream2.field1391;
            int var11 = this.stream2.field1390;
            int var7;
            if (var2 == var9) {
               if (var1 >= -883131913) {
                  throw new IllegalStateException();
               }

               var7 = var2;
            } else {
               int var12;
               if (var2 > var9) {
                  if (var1 >= -883131913) {
                     throw new IllegalStateException();
                  }

                  double var13 = 1.0 - LoginScreenAnimation.method1315(var5, var11, var10, -1441484359);
                  var12 = (int)((var8 - var9) * var13) + var9;
               } else {
                  double var16 = LoginScreenAnimation.method1315(var5, var11, var10, -977455702);
                  var12 = (int)(var16 * (var9 - var8)) + var8;
               }

               var7 = var12;
            }

            if (var7 != var2) {
               this.stream2.method3251(var7);
            }

            if (!this.stream2.hasNext()) {
               this.stream2 = null;
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "cq.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("au")
   void method2680(int var1, int var2, byte var3) {
      try {
         int var4 = AbstractArchive.method9046(class175.field1995, var1, (byte)-62) - 1;
         SoundEffect var5 = SoundEffect.readSoundEffect(class175.field1995, var1, var4);
         if (var5 != null) {
            if (var3 <= 4) {
               throw new IllegalStateException();
            }

            RawSound var6;
            if (var4 == 0) {
               var6 = var5.method3580(class468.clientPreferences.method1669(-1171752513));
            } else {
               if (1 != var4) {
                  return;
               }

               var6 = SoundEffect.method3582(var5);
            }

            RawPcmStream var7 = RawPcmStream.createRawPcmStream(var6, 100, var2);
            if (var7 == null) {
               if (var3 <= 4) {
                  throw new IllegalStateException();
               }

               return;
            }

            var7.method3242(-1);
            class50.pcmStreamMixer.addSubStream(var7);
            this.stream1 = var7;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cq.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bq")
   void method2681(int var1, int var2) {
      int var3 = AbstractArchive.method9046(class175.field1995, var1, (byte)-32) - 1;
      SoundEffect var4 = SoundEffect.readSoundEffect(class175.field1995, var1, var3);
      if (var4 != null) {
         RawSound var5;
         if (var3 == 0) {
            var5 = var4.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (1 != var3) {
               return;
            }

            var5 = SoundEffect.method3582(var4);
         }

         RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, -644081622, var2);
         if (var6 == null) {
            return;
         }

         var6.method3242(-1);
         class50.pcmStreamMixer.addSubStream(var6);
         this.stream1 = var6;
      }
   }

   @Override
   public String toString() {
      try {
         return super.toString();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cq.toString(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;IILnb;)V")
   @ObfuscatedName("ru")
   public static void method2664(ObjectSound var0, int var1, int var2, class343 var3) {
      if (var0.stream2 != null && var1 != var0.stream2.field1387) {
         var0.stream2.field1389 = var0.stream2.method3247();
         var0.stream2.field1399 = ParamComposition.method4949((byte)15);
         int var4 = HttpRequestTask.method88(
            var2, Math.abs(var0.stream2.field1389 - var1), ClientPreferences.method1623(class468.clientPreferences, (byte)0), -1127311775
         );
         var0.stream2.field1390 = var4;
         var0.stream2.field1387 = var1;
         var0.stream2.field1391 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   int method2712(int var1) {
      try {
         return -1252609781 * this.y;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.ar(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lts;IIII)V")
   @ObfuscatedName("bs")
   void method2655(WorldEntity var1, int var2, int var3, int var4, int var5) {
      int var6 = ClientPreferences.method1623(class468.clientPreferences, (byte)0);
      if (this.field1113) {
         this.method2661(0, this.field1107 * -210076263, this.field1106, (byte)91);
         this.method2663(0, this.field1107 * -297601409, this.field1106, (byte)3);
         this.method2669((byte)-1);
         this.method2674(-1237691545);
         if (class189.method4815(this.stream1, 2061556286) == 0 && class189.method4815(this.stream2, 1456361016) == 0) {
            method2697(this, 200413270);
            method2706(this, 1510917926);
            this.field1113 = false;
         }
      } else if (-1 != 1667363110 * this.soundEffectId || null != this.soundEffectIds) {
         WorldEntity var7 = client.worldViewManager.method2917(this.plane * -1207817429, -1209535253);
         if (var6 != 0) {
            boolean var8;
            label182: {
               int var9 = 1915964479 * this.x;
               class402 var10 = this.field1108;
               boolean var11 = var7 == var1;
               if (var11) {
                  if (var9 != var2) {
                     var8 = 0;
                     break label182;
                  }
               } else {
                  if (null != var1 && var1.worldEntityConfig.method4752((byte)106) != var2) {
                     var8 = 0;
                     break label182;
                  }

                  if (null != var7 && var7.worldEntityConfig.method4752((byte)50) != var9) {
                     var8 = 0;
                     break label182;
                  }

                  int var12 = null == var1 ? var2 : var1.getPlane(-1977238704);
                  int var13 = null == var7 ? var9 : var7.getPlane(1025998947);
                  if (var13 != var12) {
                     var8 = 0;
                     break label182;
                  }
               }

               switch (var10.field5243 * -1500053103) {
                  case 0:
                     var8 = 1;
                     break;
                  case 1:
                     var8 = var11;
                     break;
                  case 2:
                     var8 = var7 == var1 || var7 == null;
                     break;
                  default:
                     var8 = 0;
               }
            }

            if (var8) {
               this.method2669((byte)-1);
               this.method2674(-1702250476);
               var8 = class204.method4650(var3, var4, this, 2022991633);
               double var16;
               if (this.field1097 * -1922168877 < this.field1096 * 30889521) {
                  var16 = LoginScreenAnimation.method1315(
                     this.field1096 * -1780223262 - var8, 30889521 * this.field1096 - this.field1097 * -1922168877, this.field1103, -307209843
                  );
               } else {
                  var16 = 1.0;
               }

               int var17 = (int)(var16 * var6);
               int var18 = class189.method4815(this.stream1, -619583650);
               int var19 = class189.method4815(this.stream2, 472888301);
               if (var18 < var17) {
                  this.method2661(var17, -1388732577 * this.field1105, this.field1104, (byte)42);
               } else if (var18 > var17) {
                  this.method2661(var17, -297601409 * this.field1107, this.field1106, (byte)-23);
               }

               if (var19 < var17) {
                  this.method2663(var17, -590775437 * this.field1105, this.field1104, (byte)-7);
               } else if (var19 > var17) {
                  this.method2663(var17, -297601409 * this.field1107, this.field1106, (byte)8);
               }

               if (this.stream1 != null) {
                  this.method2669((byte)-1);
               } else if (this.soundEffectId * 65432043 >= 0 && var17 > 0) {
                  this.method2680(-1771483209 * this.soundEffectId, 0, (byte)92);
               }

               if (null != this.stream2) {
                  this.method2674(-1179568050);
               } else if (null != this.soundEffectIds && (this.field1102 -= var5 * -373095675) * 87763475 <= 0 && var17 > 0) {
                  this.method2691(this.soundEffectIds, var17, 341321924);
                  this.method2663(var17, -590775437 * this.field1105, this.field1104, (byte)-47);
                  this.method2674(-1348332700);
               }

               return;
            }
         }

         this.method2661(0, 841503865, field1089, (byte)-14);
         this.method2663(0, 150, field1089, (byte)24);
         this.method2669((byte)-1);
         this.method2674(-1142429018);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method2718(int var1) {
      try {
         return this.field1094 * 1835506585;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.af(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   static void method2648() {
      for (ObjectSound var0 = (ObjectSound)field1087.last(); null != var0; var0 = (ObjectSound)field1087.previous()) {
         method2652(var0, -824061258);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("da")
   @Override
   public void vmethod136() {
      super.remove();
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aa")
   int method2730(int var1) {
      try {
         return this.field1097 * -1922168877;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.aa(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;II)V")
   @ObfuscatedName("cr")
   public static void method2682(ObjectSound var0, int var1, int var2) {
      if (var0 == null) {
         var0.method2731();
      }

      int var3 = AbstractArchive.method9046(class175.field1995, var1, (byte)-35) - 1;
      SoundEffect var4 = SoundEffect.readSoundEffect(class175.field1995, var1, var3);
      if (var4 != null) {
         RawSound var5;
         if (var3 == 0) {
            var5 = var4.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (1 != var3) {
               return;
            }

            var5 = SoundEffect.method3582(var4);
         }

         RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, 100, var2);
         if (var6 == null) {
            return;
         }

         var6.method3242(-1);
         class50.pcmStreamMixer.addSubStream(var6);
         var0.stream1 = var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcq;B)I")
   @ObfuscatedName("uq")
   public static int method2709(ObjectSound var0, byte var1) {
      if (var0 == null) {
         return var0.method2711(var1);
      } else {
         try {
            return -1203626699 * var0.soundEffectId;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cq.ax(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   static void method2649() {
      for (ObjectSound var0 = (ObjectSound)field1087.last(); null != var0; var0 = (ObjectSound)field1087.previous()) {
         method2652(var0, -824061258);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   @Override
   public void remove() {
      try {
         super.remove();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cq.cy(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([II)V")
   @ObfuscatedName("ct")
   void method2687(int[] var1, int var2) {
      int var3 = var1[(int)(Math.random() * var1.length)];
      int var4 = AbstractArchive.method9046(class175.field1995, var3, (byte)-127) - 1;
      SoundEffect var5 = SoundEffect.readSoundEffect(class175.field1995, var3, var4);
      if (var5 != null) {
         RawSound var6;
         if (var4 == 0) {
            var6 = var5.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (var4 != 1) {
               return;
            }

            var6 = SoundEffect.method3582(var5);
         }

         RawPcmStream var7 = RawPcmStream.createRawPcmStream(var6, 100, var2);
         if (null == var7) {
            return;
         }

         var7.method3242(0);
         class50.pcmStreamMixer.addSubStream(var7);
         var7.method3262();
         this.stream2 = var7;
         this.field1102 = class190.method4639(-315377807 * this.field1098, 282059221 * this.field1099, 131874505) * -373095675;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   void method2702() {
      if (this.stream2 != null) {
         class50.pcmStreamMixer.removeSubStream(this.stream2);
         this.stream2 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cc")
   static void method2692() {
      for (WorldView var1 : client.worldViewManager) {
         for (ObjectSound var2 = (ObjectSound)var1.method3080(-817766372).last(); null != var2; var2 = (ObjectSound)var1.method3080(-1131943261).previous()) {
            method2708(var2, -687136603);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qf")
   public void method2738() {
      method2706(this, 1510917926);
   }

   @ObfuscatedSignature(descriptor = "(Lcq;I)V")
   @ObfuscatedName("us")
   public static void method2697(ObjectSound var0, int var1) {
      if (var0 == null) {
         var0.method2700(var1);
      } else {
         try {
            if (var0.stream1 != null) {
               class50.pcmStreamMixer.removeSubStream(var0.stream1);
               var0.stream1 = null;
            }
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cq.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcq;I)I")
   @ObfuscatedName("ku")
   public static int method2715(ObjectSound var0, int var1) {
      if (var0 == null) {
         return var0.method2725(var1);
      } else {
         try {
            return 127429897 * var0.maxY;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cq.ah(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   void method2650() {
      this.method2661(0, -297601409 * this.field1107, this.field1106, (byte)-61);
      this.method2663(0, -613142179 * this.field1107, this.field1106, (byte)27);
      this.method2669((byte)-1);
      this.method2674(-2038697432);
      if (class189.method4815(this.stream1, 2020011200) == 0 && class189.method4815(this.stream2, 975511531) == 0) {
         method2697(this, -784863104);
         method2706(this, 1510917926);
         this.remove();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqo;)V")
   @ObfuscatedName("sa")
   public static void method2646(IndexedObjectSetIterator var0) {
      var0.field5401 = var0.field5399.nodes[0].nextNode;
      var0.field5400 = 1;
      var0.field5398 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lts;IIII)V")
   @ObfuscatedName("bz")
   void method2656(WorldEntity var1, int var2, int var3, int var4, int var5) {
      int var6 = ClientPreferences.method1623(class468.clientPreferences, (byte)0);
      if (this.field1113) {
         this.method2661(0, this.field1107 * -297601409, this.field1106, (byte)-81);
         this.method2663(0, this.field1107 * -297601409, this.field1106, (byte)-51);
         this.method2669((byte)-1);
         this.method2674(-1776869552);
         if (class189.method4815(this.stream1, -2146524356) == 0 && class189.method4815(this.stream2, 1231882742) == 0) {
            method2697(this, 741418220);
            method2706(this, 1510917926);
            this.field1113 = false;
         }
      } else if (-1 != -1203626699 * this.soundEffectId || null != this.soundEffectIds) {
         WorldEntity var7 = client.worldViewManager.method2917(this.plane * -686711829, -1209535253);
         if (var6 != 0) {
            boolean var8;
            label176: {
               int var9 = 1915964479 * this.x;
               class402 var10 = this.field1108;
               boolean var11 = var7 == var1;
               if (var11) {
                  if (var9 != var2) {
                     var8 = 0;
                     break label176;
                  }
               } else {
                  if (null != var1 && var1.worldEntityConfig.method4752((byte)39) != var2) {
                     var8 = 0;
                     break label176;
                  }

                  if (null != var7 && var7.worldEntityConfig.method4752((byte)92) != var9) {
                     var8 = 0;
                     break label176;
                  }

                  int var12 = null == var1 ? var2 : var1.getPlane(-353225652);
                  int var13 = null == var7 ? var9 : var7.getPlane(-755017652);
                  if (var13 != var12) {
                     var8 = 0;
                     break label176;
                  }
               }

               switch (var10.field5243 * -1573211635) {
                  case 0:
                     var8 = 1;
                     break;
                  case 1:
                     var8 = var11;
                     break;
                  case 2:
                     var8 = var7 == var1 || var7 == null;
                     break;
                  default:
                     var8 = 0;
               }
            }

            if (var8) {
               this.method2669((byte)-1);
               this.method2674(-1982805780);
               var8 = class204.method4650(var3, var4, this, 356865557);
               double var16;
               if (this.field1097 * -1922168877 < this.field1096 * 30889521) {
                  var16 = LoginScreenAnimation.method1315(
                     this.field1096 * 30889521 - var8, 30889521 * this.field1096 - this.field1097 * -1922168877, this.field1103, 1223286130
                  );
               } else {
                  var16 = 1.0;
               }

               int var17 = (int)(var16 * var6);
               int var18 = class189.method4815(this.stream1, -1492839866);
               int var19 = class189.method4815(this.stream2, -1332708583);
               if (var18 < var17) {
                  this.method2661(var17, -590775437 * this.field1105, this.field1104, (byte)10);
               } else if (var18 > var17) {
                  this.method2661(var17, -297601409 * this.field1107, this.field1106, (byte)8);
               }

               if (var19 < var17) {
                  this.method2663(var17, -590775437 * this.field1105, this.field1104, (byte)12);
               } else if (var19 > var17) {
                  this.method2663(var17, -297601409 * this.field1107, this.field1106, (byte)-66);
               }

               if (this.stream1 != null) {
                  this.method2669((byte)-1);
               } else if (this.soundEffectId * -1203626699 >= 0 && var17 > 0) {
                  this.method2680(-1203626699 * this.soundEffectId, 0, (byte)37);
               }

               if (null != this.stream2) {
                  this.method2674(-1875222105);
               } else if (null != this.soundEffectIds && (this.field1102 -= var5 * -373095675) * 150622669 <= 0 && var17 > 0) {
                  this.method2691(this.soundEffectIds, var17, 341321924);
                  this.method2663(var17, -590775437 * this.field1105, this.field1104, (byte)-49);
                  this.method2674(-2026104671);
               }

               return;
            }
         }

         this.method2661(0, 150, field1089, (byte)-23);
         this.method2663(0, 150, field1089, (byte)101);
         this.method2669((byte)-1);
         this.method2674(-990251906);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IILcq;)I")
   @ObfuscatedName("bk")
   static int method2657(int var0, int var1, ObjectSound var2) {
      WorldView var3 = WorldViewManager.method2901(client.worldViewManager, -686711829 * var2.plane, (byte)1);
      ProjectionCoord var4 = classDH.method3122(var3, var2.y * -1252609781, var2.maxX * 1899711959, (byte)76);
      ProjectionCoord var5 = classDH.method3122(var3, 1150476652 * var2.maxY, -1076383995 * var2.field1094, (byte)11);
      int var6 = (int)var4.x;
      int var7 = (int)var4.y;
      int var8 = (int)var5.x;
      int var9 = (int)var5.y;
      var4.release(-804947546);
      var5.release(-804947546);
      int var10 = class147.method4135(var0, var1, var6, var7, var8, var9, -850809223);
      return Math.max(var10 - 1853540203, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IILcq;)I")
   @ObfuscatedName("bb")
   static int method2658(int var0, int var1, ObjectSound var2) {
      WorldView var3 = WorldViewManager.method2901(client.worldViewManager, -272568784 * var2.plane, (byte)1);
      ProjectionCoord var4 = classDH.method3122(var3, var2.y * -1252609781, var2.maxX * 1309892759, (byte)111);
      ProjectionCoord var5 = classDH.method3122(var3, 631571510 * var2.maxY, 1835506585 * var2.field1094, (byte)118);
      int var6 = (int)var4.x;
      int var7 = (int)var4.y;
      int var8 = (int)var5.x;
      int var9 = (int)var5.y;
      var4.release(-804947546);
      var5.release(-804947546);
      int var10 = class147.method4135(var0, var1, var6, var7, var8, var9, 1292808404);
      return Math.max(var10 - 2131349619, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IILcq;)I")
   @ObfuscatedName("bj")
   static int method2659(int var0, int var1, ObjectSound var2) {
      WorldView var3 = WorldViewManager.method2901(client.worldViewManager, -1490662619 * var2.plane, (byte)1);
      ProjectionCoord var4 = classDH.method3122(var3, var2.y * -1252609781, var2.maxX * 1899711959, (byte)17);
      ProjectionCoord var5 = classDH.method3122(var3, 667164499 * var2.maxY, 1835506585 * var2.field1094, (byte)102);
      int var6 = (int)var4.x;
      int var7 = (int)var4.y;
      int var8 = (int)var5.x;
      int var9 = (int)var5.y;
      var4.release(-804947546);
      var5.release(-804947546);
      int var10 = class147.method4135(var0, var1, var6, var7, var8, var9, 1233998591);
      return Math.max(var10 - 64, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldk;)I")
   @ObfuscatedName("bn")
   static int method2673(RawPcmStream var0) {
      return null != var0 ? var0.method3247() : 0;
   }

   @ObfuscatedSignature(descriptor = "(IILnb;)V")
   @ObfuscatedName("bp")
   void method2662(int var1, int var2, class343 var3) {
      if (this.stream1 != null && this.stream1.field1387 != var1) {
         this.stream1.field1389 = this.stream1.method3247();
         this.stream1.field1399 = ParamComposition.method4949((byte)15);
         this.stream1.field1387 = var1;
         this.stream1.field1390 = HttpRequestTask.method88(
            var2, Math.abs(this.stream1.field1389 - this.stream1.field1387), ClientPreferences.method1623(class468.clientPreferences, (byte)0), -103860599
         );
         this.stream1.field1391 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILnb;)V")
   @ObfuscatedName("bt")
   void method2665(int var1, int var2, class343 var3) {
      if (this.stream2 != null && var1 != this.stream2.field1387) {
         this.stream2.field1389 = this.stream2.method3247();
         this.stream2.field1399 = ParamComposition.method4949((byte)15);
         int var4 = HttpRequestTask.method88(
            var2, Math.abs(this.stream2.field1389 - var1), ClientPreferences.method1623(class468.clientPreferences, (byte)0), 1430913182
         );
         this.stream2.field1390 = var4;
         this.stream2.field1387 = var1;
         this.stream2.field1391 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(IILnb;)V")
   @ObfuscatedName("bi")
   void method2666(int var1, int var2, class343 var3) {
      if (this.stream2 != null && var1 != this.stream2.field1387) {
         this.stream2.field1389 = this.stream2.method3247();
         this.stream2.field1399 = ParamComposition.method4949((byte)15);
         int var4 = HttpRequestTask.method88(
            var2, Math.abs(this.stream2.field1389 - var1), ClientPreferences.method1623(class468.clientPreferences, (byte)0), 256373305
         );
         this.stream2.field1390 = var4;
         this.stream2.field1387 = var1;
         this.stream2.field1391 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   void method2670() {
      if (this.stream1 != null) {
         int var1 = this.stream1.method3247();
         long var2 = ParamComposition.method4949((byte)15);
         long var4 = var2 - this.stream1.field1399;
         int var7 = this.stream1.field1389;
         int var8 = this.stream1.field1387;
         class343 var9 = this.stream1.field1391;
         int var10 = this.stream1.field1390;
         int var6;
         if (var8 == var1) {
            var6 = var1;
         } else {
            int var11;
            if (var1 > var8) {
               double var12 = 1.0 - LoginScreenAnimation.method1315(var4, var10, var9, -2010973845);
               var11 = (int)(var12 * (var7 - var8)) + var8;
            } else {
               double var14 = LoginScreenAnimation.method1315(var4, var10, var9, -1746515440);
               var11 = (int)(var14 * (var8 - var7)) + var7;
            }

            var6 = var11;
         }

         if (var6 != var1) {
            this.stream1.method3251(var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cs")
   void method2671() {
      if (this.stream1 != null) {
         int var1 = this.stream1.method3247();
         long var2 = ParamComposition.method4949((byte)15);
         long var4 = var2 - this.stream1.field1399;
         int var7 = this.stream1.field1389;
         int var8 = this.stream1.field1387;
         class343 var9 = this.stream1.field1391;
         int var10 = this.stream1.field1390;
         int var6;
         if (var8 == var1) {
            var6 = var1;
         } else {
            int var11;
            if (var1 > var8) {
               double var12 = 1.0 - LoginScreenAnimation.method1315(var4, var10, var9, -32327425);
               var11 = (int)(var12 * (var7 - var8)) + var8;
            } else {
               double var14 = LoginScreenAnimation.method1315(var4, var10, var9, 1519862119);
               var11 = (int)(var14 * (var8 - var7)) + var7;
            }

            var6 = var11;
         }

         if (var6 != var1) {
            this.stream1.method3251(var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   void method2703() {
      if (this.stream2 != null) {
         class50.pcmStreamMixer.removeSubStream(this.stream2);
         this.stream2 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   void method2675() {
      if (null != this.stream2) {
         int var1 = this.stream2.method3247();
         long var2 = ParamComposition.method4949((byte)15);
         long var4 = var2 - this.stream2.field1399;
         int var7 = this.stream2.field1389;
         int var8 = this.stream2.field1387;
         class343 var9 = this.stream2.field1391;
         int var10 = this.stream2.field1390;
         int var6;
         if (var1 == var8) {
            var6 = var1;
         } else {
            int var11;
            if (var1 > var8) {
               double var12 = 1.0 - LoginScreenAnimation.method1315(var4, var10, var9, 663264742);
               var11 = (int)((var7 - var8) * var12) + var8;
            } else {
               double var14 = LoginScreenAnimation.method1315(var4, var10, var9, -514377052);
               var11 = (int)(var14 * (var8 - var7)) + var7;
            }

            var6 = var11;
         }

         if (var6 != var1) {
            this.stream2.method3251(var6);
         }

         if (!this.stream2.hasNext()) {
            this.stream2 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   void method2676() {
      if (null != this.stream2) {
         int var1 = this.stream2.method3247();
         long var2 = ParamComposition.method4949((byte)15);
         long var4 = var2 - this.stream2.field1399;
         int var7 = this.stream2.field1389;
         int var8 = this.stream2.field1387;
         class343 var9 = this.stream2.field1391;
         int var10 = this.stream2.field1390;
         int var6;
         if (var1 == var8) {
            var6 = var1;
         } else {
            int var11;
            if (var1 > var8) {
               double var12 = 1.0 - LoginScreenAnimation.method1315(var4, var10, var9, -573262637);
               var11 = (int)((var7 - var8) * var12) + var8;
            } else {
               double var14 = LoginScreenAnimation.method1315(var4, var10, var9, 1197490231);
               var11 = (int)(var14 * (var8 - var7)) + var7;
            }

            var6 = var11;
         }

         if (var6 != var1) {
            this.stream2.method3251(var6);
         }

         if (!this.stream2.hasNext()) {
            this.stream2 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("pi")
   public void method2739() {
      method2697(this, 894587571);
   }

   public int getPlane() {
      return this.x * 1915964479;
   }

   public int getSoundEffectId() {
      return this.soundEffectId * -1203626699;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   void method2677() {
      if (null != this.stream2) {
         int var1 = this.stream2.method3247();
         long var2 = ParamComposition.method4949((byte)15);
         long var4 = var2 - this.stream2.field1399;
         int var7 = this.stream2.field1389;
         int var8 = this.stream2.field1387;
         class343 var9 = this.stream2.field1391;
         int var10 = this.stream2.field1390;
         int var6;
         if (var1 == var8) {
            var6 = var1;
         } else {
            int var11;
            if (var1 > var8) {
               double var12 = 1.0 - LoginScreenAnimation.method1315(var4, var10, var9, -2105308077);
               var11 = (int)((var7 - var8) * var12) + var8;
            } else {
               double var14 = LoginScreenAnimation.method1315(var4, var10, var9, -835687467);
               var11 = (int)(var14 * (var8 - var7)) + var7;
            }

            var6 = var11;
         }

         if (var6 != var1) {
            this.stream2.method3251(var6);
         }

         if (!this.stream2.hasNext()) {
            this.stream2 = null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bl")
   static int method2679(int var0, int var1, int var2) {
      return var1 >= var2 ? var0 : (int)(var0 * ((float)var1 / var2));
   }

   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFFI)V")
   @ObfuscatedName("an")
   static void method2678(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      try {
         if (null == var0) {
            if (var9 != -509240052) {
               throw new IllegalStateException();
            }
         } else {
            var0.field1872 = var1;
            float var10 = var4 - var1;
            float var11 = var8 - var5;
            float var12 = var2 - var1;
            float var13 = 0.0F;
            float var14 = 0.0F;
            if (0.0F != var12) {
               var13 = (var6 - var5) / var12;
            }

            var12 = var4 - var3;
            if (var12 != 0.0F) {
               if (var9 != -509240052) {
                  return;
               }

               var14 = (var8 - var7) / var12;
            }

            float var15 = 1.0F / (var10 * var10);
            float var16 = var13 * var10;
            float var17 = var10 * var14;
            var0.field1874 = var15 * (var17 + var16 - var11 - var11) / var10;
            var0.field1878 = (var11 + (var11 + var11) - var16 - var16 - var17) * var15;
            var0.field1876 = var13;
            var0.field1879 = var5;
         }
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "cq.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;II)V")
   @ObfuscatedName("kr")
   public static void method2683(ObjectSound var0, int var1, int var2) {
      if (var0 == null) {
         var0.method2698();
      }

      int var3 = AbstractArchive.method9046(class175.field1995, var1, (byte)-29) - 1;
      SoundEffect var4 = SoundEffect.readSoundEffect(class175.field1995, var1, var3);
      if (var4 != null) {
         RawSound var5;
         if (var3 == 0) {
            var5 = var4.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (1 != var3) {
               return;
            }

            var5 = SoundEffect.method3582(var4);
         }

         RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, 1145497522, var2);
         if (var6 == null) {
            return;
         }

         var6.method3242(-1);
         class50.pcmStreamMixer.addSubStream(var6);
         var0.stream1 = var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ce")
   void method2684(int var1, int var2) {
      int var3 = AbstractArchive.method9046(class175.field1995, var1, (byte)-108) - 1;
      SoundEffect var4 = SoundEffect.readSoundEffect(class175.field1995, var1, var3);
      if (var4 != null) {
         RawSound var5;
         if (var3 == 0) {
            var5 = var4.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (1 != var3) {
               return;
            }

            var5 = SoundEffect.method3582(var4);
         }

         RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, 100, var2);
         if (var6 == null) {
            return;
         }

         var6.method3242(-1);
         class50.pcmStreamMixer.addSubStream(var6);
         this.stream1 = var6;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bx")
   void method2685(int var1, int var2) {
      int var3 = AbstractArchive.method9046(class175.field1995, var1, (byte)-124) - 1;
      SoundEffect var4 = SoundEffect.readSoundEffect(class175.field1995, var1, var3);
      if (var4 != null) {
         RawSound var5;
         if (var3 == 0) {
            var5 = var4.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (1 != var3) {
               return;
            }

            var5 = SoundEffect.method3582(var4);
         }

         RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, 100, var2);
         if (var6 == null) {
            return;
         }

         var6.method3242(-1);
         class50.pcmStreamMixer.addSubStream(var6);
         this.stream1 = var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;[II)V")
   @ObfuscatedName("il")
   public static void method2688(ObjectSound var0, int[] var1, int var2) {
      if (var0 == null) {
         var0.method2700(var2);
      } else {
         int var3 = var1[(int)(Math.random() * var1.length)];
         int var4 = AbstractArchive.method9046(class175.field1995, var3, (byte)-84) - 1;
         SoundEffect var5 = SoundEffect.readSoundEffect(class175.field1995, var3, var4);
         if (var5 != null) {
            RawSound var6;
            if (var4 == 0) {
               var6 = var5.method3580(class468.clientPreferences.method1669(-1171752513));
            } else {
               if (var4 != 1) {
                  return;
               }

               var6 = SoundEffect.method3582(var5);
            }

            RawPcmStream var7 = RawPcmStream.createRawPcmStream(var6, 873193364, var2);
            if (null == var7) {
               return;
            }

            var7.method3242(0);
            class50.pcmStreamMixer.addSubStream(var7);
            var7.method3262();
            var0.stream2 = var7;
            var0.field1102 = class190.method4639(-315377807 * var0.field1098, -297139118 * var0.field1099, 131874505) * 1913621274;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   int method2726() {
      return 30889521 * this.field1096;
   }

   @ObfuscatedSignature(descriptor = "([II)V")
   @ObfuscatedName("cm")
   void method2689(int[] var1, int var2) {
      int var3 = var1[(int)(Math.random() * var1.length)];
      int var4 = AbstractArchive.method9046(class175.field1995, var3, (byte)-128) - 1;
      SoundEffect var5 = SoundEffect.readSoundEffect(class175.field1995, var3, var4);
      if (var5 != null) {
         RawSound var6;
         if (var4 == 0) {
            var6 = var5.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (var4 != 1) {
               return;
            }

            var6 = SoundEffect.method3582(var5);
         }

         RawPcmStream var7 = RawPcmStream.createRawPcmStream(var6, 1138909518, var2);
         if (null == var7) {
            return;
         }

         var7.method3242(0);
         class50.pcmStreamMixer.addSubStream(var7);
         var7.method3262();
         this.stream2 = var7;
         this.field1102 = class190.method4639(-103274045 * this.field1098, -1661050420 * this.field1099, 131874505) * -1501614418;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcq;I)I")
   @ObfuscatedName("vx")
   public static int method2727(ObjectSound var0, int var1) {
      if (var0 == null) {
         return var0.method2721(var1);
      } else {
         try {
            return 30889521 * var0.field1096;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cq.ao(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([II)V")
   @ObfuscatedName("cb")
   void method2690(int[] var1, int var2) {
      int var3 = var1[(int)(Math.random() * var1.length)];
      int var4 = AbstractArchive.method9046(class175.field1995, var3, (byte)-110) - 1;
      SoundEffect var5 = SoundEffect.readSoundEffect(class175.field1995, var3, var4);
      if (var5 != null) {
         RawSound var6;
         if (var4 == 0) {
            var6 = var5.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (var4 != 1) {
               return;
            }

            var6 = SoundEffect.method3582(var5);
         }

         RawPcmStream var7 = RawPcmStream.createRawPcmStream(var6, 2079291620, var2);
         if (null == var7) {
            return;
         }

         var7.method3242(0);
         class50.pcmStreamMixer.addSubStream(var7);
         var7.method3262();
         this.stream2 = var7;
         this.field1102 = class190.method4639(-99457615 * this.field1098, 1546883917 * this.field1099, 131874505) * -680138482;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cl")
   int method2719() {
      return this.field1094 * 1835506585;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ck")
   static void method2693() {
      for (WorldView var1 : client.worldViewManager) {
         for (ObjectSound var2 = (ObjectSound)var1.method3080(-1741796256).last(); null != var2; var2 = (ObjectSound)var1.method3080(-1868825656).previous()) {
            method2708(var2, -687136603);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   int method2713() {
      return -1252609781 * this.y;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   int method2722(int var1) {
      try {
         return this.x * 1915964479;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.am(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IILcq;)I")
   @ObfuscatedName("bm")
   static int method2660(int var0, int var1, ObjectSound var2) {
      WorldView var3 = WorldViewManager.method2901(client.worldViewManager, 429224374 * var2.plane, (byte)1);
      ProjectionCoord var4 = classDH.method3122(var3, var2.y * -145358222, var2.maxX * 1899711959, (byte)50);
      ProjectionCoord var5 = classDH.method3122(var3, 127429897 * var2.maxY, 1835506585 * var2.field1094, (byte)124);
      int var6 = (int)var4.x;
      int var7 = (int)var4.y;
      int var8 = (int)var5.x;
      int var9 = (int)var5.y;
      var4.release(-804947546);
      var5.release(-804947546);
      int var10 = class147.method4135(var0, var1, var6, var7, var8, var9, -1224981133);
      return Math.max(var10 - 1214300051, 0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   void method2698() {
      if (this.stream1 != null) {
         class50.pcmStreamMixer.removeSubStream(this.stream1);
         this.stream1 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("co")
   void method2699() {
      if (this.stream1 != null) {
         class50.pcmStreamMixer.removeSubStream(this.stream1);
         this.stream1 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dj")
   @Override
   public void vmethod138() {
      super.remove();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   void method2704() {
      if (this.stream2 != null) {
         class50.pcmStreamMixer.removeSubStream(this.stream2);
         this.stream2 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcq;I)I")
   @ObfuscatedName("yv")
   public static int method2716(ObjectSound var0, int var1) {
      if (var0 == null) {
         return var0.method2717(var1);
      } else {
         try {
            return 1899711959 * var0.maxX;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cq.al(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cn")
   void method2694() {
      int var1 = -1203626699 * this.soundEffectId;
      ObjectComposition var2 = this.obj.transform(-1487339500);
      if (null != var2) {
         this.soundEffectId = 2036860515 * var2.ambientSoundId;
         this.field1096 = Coord.method8301(var2.int7 * -22639547, -355008838) * 1511670481;
         this.field1097 = Coord.method8301(-1714304273 * var2.int8, -355008838) * -561715109;
         this.field1098 = var2.int5 * -223191153;
         this.field1099 = var2.int6 * 2095415115;
         this.soundEffectIds = var2.soundEffectIds;
         this.field1103 = var2.field2687;
         this.field1104 = var2.field2662;
         this.field1105 = -1044512077 * var2.field2660;
         this.field1106 = var2.field2691;
         this.field1107 = 213393279 * var2.field2689;
      } else {
         this.soundEffectId = 1395978979;
         this.field1096 = 0;
         this.field1097 = 0;
         this.field1098 = 0;
         this.field1099 = 0;
         this.soundEffectIds = null;
         this.field1103 = ObjectComposition.field2646;
         this.field1106 = ObjectComposition.field2649;
         this.field1107 = 675553492;
         this.field1104 = ObjectComposition.field2655;
         this.field1105 = -605321436;
      }

      if (-1203626699 * this.soundEffectId != var1) {
         this.field1113 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method2705() {
      if (this.stream2 != null) {
         class50.pcmStreamMixer.removeSubStream(this.stream2);
         this.stream2 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   void method2695() {
      int var1 = 284065350 * this.soundEffectId;
      ObjectComposition var2 = this.obj.transform(154340614);
      if (null != var2) {
         this.soundEffectId = 2036860515 * var2.ambientSoundId;
         this.field1096 = Coord.method8301(var2.int7 * -22639547, -355008838) * 1511670481;
         this.field1097 = Coord.method8301(2132093154 * var2.int8, -355008838) * -76888262;
         this.field1098 = var2.int5 * -223191153;
         this.field1099 = var2.int6 * -1912675481;
         this.soundEffectIds = var2.soundEffectIds;
         this.field1103 = var2.field2687;
         this.field1104 = var2.field2662;
         this.field1105 = -1044512077 * var2.field2660;
         this.field1106 = var2.field2691;
         this.field1107 = 213393279 * var2.field2689;
      } else {
         this.soundEffectId = -1804688300;
         this.field1096 = 0;
         this.field1097 = 0;
         this.field1098 = 0;
         this.field1099 = 0;
         this.soundEffectIds = null;
         this.field1103 = ObjectComposition.field2646;
         this.field1106 = ObjectComposition.field2649;
         this.field1107 = 675553492;
         this.field1104 = ObjectComposition.field2655;
         this.field1105 = -1580104805;
      }

      if (-1203626699 * this.soundEffectId != var1) {
         this.field1113 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   public void method2740() {
      this.set((byte)0);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ch")
   void method2686(int var1, int var2) {
      int var3 = AbstractArchive.method9046(class175.field1995, var1, (byte)-8) - 1;
      SoundEffect var4 = SoundEffect.readSoundEffect(class175.field1995, var1, var3);
      if (var4 != null) {
         RawSound var5;
         if (var3 == 0) {
            var5 = var4.method3580(class468.clientPreferences.method1669(-1171752513));
         } else {
            if (1 != var3) {
               return;
            }

            var5 = SoundEffect.method3582(var4);
         }

         RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, 100, var2);
         if (var6 == null) {
            return;
         }

         var6.method3242(-1);
         class50.pcmStreamMixer.addSubStream(var6);
         this.stream1 = var6;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("di")
   int method2710() {
      return -1203626699 * this.soundEffectId;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ai")
   void set(byte var1) {
      try {
         int var2 = -1203626699 * this.soundEffectId;
         ObjectComposition var3 = this.obj.transform(-1482169595);
         if (null != var3) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            this.soundEffectId = 2036860515 * var3.ambientSoundId;
            this.field1096 = Coord.method8301(var3.int7 * -22639547, -355008838) * 1511670481;
            this.field1097 = Coord.method8301(-1714304273 * var3.int8, -355008838) * -561715109;
            this.field1098 = var3.int5 * -223191153;
            this.field1099 = var3.int6 * 2095415115;
            this.soundEffectIds = var3.soundEffectIds;
            this.field1103 = var3.field2687;
            this.field1104 = var3.field2662;
            this.field1105 = -1044512077 * var3.field2660;
            this.field1106 = var3.field2691;
            this.field1107 = 213393279 * var3.field2689;
         } else {
            this.soundEffectId = 1395978979;
            this.field1096 = 0;
            this.field1097 = 0;
            this.field1098 = 0;
            this.field1099 = 0;
            this.soundEffectIds = null;
            this.field1103 = ObjectComposition.field2646;
            this.field1106 = ObjectComposition.field2649;
            this.field1107 = 675553492;
            this.field1104 = ObjectComposition.field2655;
            this.field1105 = -605321436;
         }

         if (-1203626699 * this.soundEffectId != var2) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            this.field1113 = true;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cq.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("df")
   int method2714() {
      return -1252609781 * this.y;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method2651() {
      this.method2661(0, -297601409 * this.field1107, this.field1106, (byte)-35);
      this.method2663(0, -297601409 * this.field1107, this.field1106, (byte)-33);
      this.method2669((byte)-1);
      this.method2674(-2029718771);
      if (class189.method4815(this.stream1, -1113224752) == 0 && class189.method4815(this.stream2, -357028311) == 0) {
         method2697(this, 1089254589);
         method2706(this, 1510917926);
         this.remove();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dy")
   int method2720() {
      return this.field1094 * -2123895975;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dz")
   int method2723() {
      return this.x * 1915964479;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dv")
   int method2724() {
      return this.x * 1915964479;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cv")
   int method2728() {
      return 30889521 * this.field1096;
   }

   public int[] getBackgroundSoundEffectIds() {
      return this.soundEffectIds;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dd")
   int method2729() {
      return 30889521 * this.field1096;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dt")
   int method2731() {
      return this.field1097 * -1941424145;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("db")
   int method2732() {
      return this.field1097 * -1922168877;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dh")
   int method2733() {
      return this.field1097 * -1922168877;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method2735() {
      return super.toString();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method2736() {
      return super.toString();
   }

   @ObfuscatedSignature(descriptor = "(Lcq;I)V")
   @ObfuscatedName("is")
   public static void method2706(ObjectSound var0, int var1) {
      if (var0 == null) {
         var0.method2707(var1);
      }

      try {
         if (var0.stream2 != null) {
            if (var1 != 1510917926) {
               throw new IllegalStateException();
            }

            class50.pcmStreamMixer.removeSubStream(var0.stream2);
            var0.stream2 = null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.ac(" + ')');
      }
   }

   ObjectSound(int var1, int var2, int var3, int var4, int var5, ObjectComposition var6) {
      this.plane = var1 * -1616923453;
      this.x = var2 * -900553793;
      this.y = (var3 << 7) * 1235194531;
      this.maxX = (var4 << 7) * 1379071463;
      int var7 = var6.sizeX * 1813358617;
      int var8 = var6.sizeY * -352504863;
      if (var5 == 1 || var5 == 3) {
         var7 = var6.sizeY * -352504863;
         var8 = var6.sizeX * 1813358617;
      }

      this.maxY = (var3 + var7 << 7) * -35049159;
      this.field1094 = (var4 + var8 << 7) * 437881001;
      this.soundEffectId = var6.ambientSoundId * -1194817153 * -1395978979;
      this.field1096 = (var6.int7 * -22639547 << 7) * 1511670481;
      this.field1097 = Math.max(var6.int8 * -1714304273 - 1 << 7, 0) * -561715109;
      this.field1098 = var6.int5 * 260597535 * 1351887249;
      this.field1099 = var6.int6 * 1031328871 * -1919529091;
      this.soundEffectIds = var6.soundEffectIds;
      if (var6.transforms != null) {
         this.obj = var6;
      } else {
         this.obj = null;
      }

      if (this.soundEffectIds != null) {
         this.field1102 = (this.field1098 * -315377807 + (int)(Math.random() * (this.field1099 * 282059221 - this.field1098 * -315377807))) * -373095675;
      }

      this.field1103 = var6.field2687;
      this.field1104 = var6.field2662;
      this.field1105 = var6.field2660 * 1177696105 * 942875067;
      this.field1106 = var6.field2691;
      this.field1107 = var6.field2689 * 1851369985 * 331532671;
      this.field1108 = var6.field2673;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   void method2672() {
      if (this.stream1 != null) {
         int var1 = this.stream1.method3247();
         long var2 = ParamComposition.method4949((byte)15);
         long var4 = var2 - this.stream1.field1399;
         int var7 = this.stream1.field1389;
         int var8 = this.stream1.field1387;
         class343 var9 = this.stream1.field1391;
         int var10 = this.stream1.field1390;
         int var6;
         if (var8 == var1) {
            var6 = var1;
         } else {
            int var11;
            if (var1 > var8) {
               double var12 = 1.0 - LoginScreenAnimation.method1315(var4, var10, var9, 926410832);
               var11 = (int)(var12 * (var7 - var8)) + var8;
            } else {
               double var14 = LoginScreenAnimation.method1315(var4, var10, var9, 1627383534);
               var11 = (int)(var14 * (var8 - var7)) + var7;
            }

            var6 = var11;
         }

         if (var6 != var1) {
            this.stream1.method3251(var6);
         }
      }
   }

   public LocalPoint getMinPosition() {
      return new LocalPoint(this.y * -1252609781, this.maxX * 1899711959, class330.localPlayer.worldViewId * 1753020269);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("az")
   void method2691(int[] var1, int var2, int var3) {
      try {
         int var4 = var1[(int)(Math.random() * var1.length)];
         int var5 = AbstractArchive.method9046(class175.field1995, var4, (byte)-100) - 1;
         SoundEffect var6 = SoundEffect.readSoundEffect(class175.field1995, var4, var5);
         if (var6 != null) {
            if (var3 != 341321924) {
               throw new IllegalStateException();
            }

            RawSound var7;
            if (var5 == 0) {
               if (var3 != 341321924) {
                  throw new IllegalStateException();
               }

               var7 = var6.method3580(class468.clientPreferences.method1669(-1171752513));
            } else {
               if (var5 != 1) {
                  return;
               }

               if (var3 != 341321924) {
                  throw new IllegalStateException();
               }

               var7 = SoundEffect.method3582(var6);
            }

            RawPcmStream var8 = RawPcmStream.createRawPcmStream(var7, 100, var2);
            if (null == var8) {
               if (var3 != 341321924) {
                  throw new IllegalStateException();
               }

               return;
            }

            var8.method3242(0);
            class50.pcmStreamMixer.addSubStream(var8);
            var8.method3262();
            this.stream2 = var8;
            this.field1102 = class190.method4639(-315377807 * this.field1098, 282059221 * this.field1099, 131874505) * -373095675;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "cq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public static String method2647(Buffer var0, int var1) {
      try {
         return PlayerType.method8786(var0, 32767, 1993958308);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcq;I)V")
   @ObfuscatedName("og")
   public static void method2708(ObjectSound var0, int var1) {
      if (var0 == null) {
         var0.method2701(var1);
      }

      try {
         field1087.addFirst(var0);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("ck")
   static int method2737(int var0, Script var1, boolean var2, int var3) {
      try {
         if (7500 == var0) {
            if (var3 <= 1979410702) {
               throw new IllegalStateException();
            } else {
               int var26 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Object var32 = class39.method651(var26, 2041649142);
               int var36 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               DbTable var39 = GraphicsObject.getDbTable(var36, (byte)-62);
               if (var39 == null) {
                  if (var3 <= 1979410702) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  int var42 = ItemLayer.method5387(var36, 794763681);
                  VarcInt.field2192 = var39.method11886(var32, var42, 1526239520);
                  if (null != VarcInt.field2192) {
                     if (var3 <= 1979410702) {
                        throw new IllegalStateException();
                     }

                     client.field709 = Buddy.method10784(var36, -519592981) * -325293249;
                     class291.field3774 = VarcInt.field2192.iterator();
                     if (var0 == 7500) {
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = VarcInt.field2192.size();
                     }
                  } else {
                     client.field709 = 325293249;
                     class291.field3774 = null;
                     if (7500 == var0) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     }
                  }

                  return 1;
               }
            }
         } else if (7501 != var0) {
            if (7502 == var0) {
               if (var3 <= 1979410702) {
                  throw new IllegalStateException();
               } else {
                  class408.Interpreter_intStackSize -= -1084394537;
                  int var25 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
                  int var31 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
                  int var35 = Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
                  int var38 = Buddy.method10784(var31, 1673904313);
                  int var41 = class236.method5960(var31, (byte)36);
                  int var44 = ItemLayer.method5387(var31, 1376536887);
                  DbRowType var45 = class141.getDbRowType(var25, 185472044);
                  DbTableType var46 = ChatChannel.getDbTableType(var38, -1689231098);
                  int[] var47 = var46.types[var41];
                  int var13 = 0;
                  int var14 = var47.length;
                  if (var44 >= 0) {
                     if (var3 <= 1979410702) {
                        throw new IllegalStateException();
                     }

                     if (var44 >= var14) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var44 + ", Max: " + var14);
                     }

                     var13 = var44;
                     var14 = 1 + var44;
                  }

                  Object[] var15 = var45.getColumnType(var41, (byte)30);
                  if (null == var15 && null != var46.defaultValues) {
                     if (var3 <= 1979410702) {
                        throw new IllegalStateException();
                     }

                     var15 = var46.defaultValues[var41];
                  }

                  if (var15 == null) {
                     for (int var48 = var13; var48 < var14; var48++) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        int var49 = var47[var48];
                        class586 var50 = class251.method6149(var49, -1703539756);
                        if (class586.field6379 == var50) {
                           if (var3 <= 1979410702) {
                              throw new IllegalStateException();
                           }

                           Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                        } else {
                           Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class113.method3912(
                              var49, -1076424721
                           );
                        }
                     }

                     return 1;
                  } else {
                     int var16 = var15.length / var47.length;
                     if (var35 >= 0) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        if (var35 < var16) {
                           for (int var17 = var13; var17 < var14; var17++) {
                              if (var3 <= 1979410702) {
                                 throw new IllegalStateException();
                              }

                              int var18 = var17 + var35 * var47.length;
                              class586 var19 = class251.method6149(var47[var17], -1703539756);
                              if (var19 == class586.field6379) {
                                 Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var15[var18];
                              } else {
                                 Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (Integer)var15[var18];
                              }
                           }

                           return 1;
                        }

                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }
                     }

                     throw new RuntimeException();
                  }
               }
            } else if (7503 == var0) {
               if (var3 <= 1979410702) {
                  throw new IllegalStateException();
               } else {
                  class408.Interpreter_intStackSize -= 708726074;
                  int var24 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                  int var30 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
                  int var34 = 0;
                  int var37 = Buddy.method10784(var30, 525047087);
                  int var40 = class236.method5960(var30, (byte)-43);
                  DbRowType var43 = class141.getDbRowType(var24, 74053870);
                  DbTableType var10 = ChatChannel.getDbTableType(var37, -1952472771);
                  int[] var11 = var10.types[var40];
                  Object[] var12 = var43.getColumnType(var40, (byte)16);
                  if (var12 == null) {
                     if (var3 <= 1979410702) {
                        throw new IllegalStateException();
                     }

                     if (var10.defaultValues != null) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        var12 = var10.defaultValues[var40];
                     }
                  }

                  if (null != var12) {
                     var34 = var12.length / var11.length;
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var34;
                  return 1;
               }
            } else if (var0 == 7504) {
               if (var3 <= 1979410702) {
                  throw new IllegalStateException();
               } else {
                  class408.Interpreter_intStackSize -= -1793120611;
                  int var23 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                  DbTable var29 = WorldMapDecorationType.getDbTable2(var23, (byte)30);
                  if (var29 == null) {
                     if (var3 <= 1979410702) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException();
                     }
                  } else {
                     VarcInt.field2192 = var29.method11886(0, 0, 897806595);
                     int var33 = 0;
                     if (null != VarcInt.field2192) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        client.field709 = -325293249 * var23;
                        class291.field3774 = VarcInt.field2192.iterator();
                        var33 = VarcInt.field2192.size();
                     }

                     if (7504 == var0) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33;
                     }

                     return 1;
                  }
               }
            } else if (var0 == 7505) {
               if (var3 <= 1979410702) {
                  throw new IllegalStateException();
               } else {
                  int var22 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  DbRowType var28 = class141.getDbRowType(var22, -1025755910);
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1403723051 * var28.tableId;
                  return 1;
               }
            } else if (7506 == var0) {
               if (var3 <= 1979410702) {
                  throw new IllegalStateException();
               } else {
                  int var21 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  int var27 = -1;
                  if (VarcInt.field2192 != null) {
                     if (var3 <= 1979410702) {
                        throw new IllegalStateException();
                     }

                     if (var21 >= 0 && var21 < VarcInt.field2192.size()) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        var27 = (Integer)VarcInt.field2192.get(var21);
                     }
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var27;
                  return 1;
               }
            } else if (7507 == var0) {
               if (var3 <= 1979410702) {
                  throw new IllegalStateException();
               } else {
                  int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  Object var5 = class39.method651(var4, -222023397);
                  int var6 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  DbTable var7 = GraphicsObject.getDbTable(var6, (byte)-115);
                  if (var7 == null) {
                     if (var3 <= 1979410702) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException();
                     }
                  } else if (Buddy.method10784(var6, 958267933) != client.field709 * -1381956417) {
                     throw new RuntimeException();
                  } else {
                     if (VarcInt.field2192 == null) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        if (VarcInt.field2192.isEmpty()) {
                           if (var3 <= 1979410702) {
                              throw new IllegalStateException();
                           }

                           throw new RuntimeException();
                        }
                     }

                     int var8 = ItemLayer.method5387(var6, 1097171235);
                     List var9 = var7.method11886(var5, var8, 1049517983);
                     VarcInt.field2192 = new LinkedList(VarcInt.field2192);
                     if (null != var9) {
                        if (var3 <= 1979410702) {
                           throw new IllegalStateException();
                        }

                        VarcInt.field2192.retainAll(var9);
                     } else {
                        VarcInt.field2192.clear();
                     }

                     class291.field3774 = VarcInt.field2192.iterator();
                     if (7507 == var0) {
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = VarcInt.field2192.size();
                     }

                     return 1;
                  }
               }
            } else {
               return 2;
            }
         } else {
            if (class291.field3774 != null) {
               if (var3 <= 1979410702) {
                  throw new IllegalStateException();
               }

               if (class291.field3774.hasNext()) {
                  if (var3 <= 1979410702) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (Integer)class291.field3774.next();
                  return 1;
               }
            }

            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "cq.ck(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   void method2700(int var1) {
      try {
         if (this.stream1 != null) {
            class50.pcmStreamMixer.method3420(this.stream2);
            this.stream1 = null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   void method2707(int var1) {
      try {
         if (this.stream1 != null) {
            if (var1 != 1510917926) {
               throw new IllegalStateException();
            }

            class50.pcmStreamMixer.method3423(this.stream1);
            this.stream2 = null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcq;I)V")
   @ObfuscatedName("wj")
   public static void method2652(ObjectSound var0, int var1) {
      if (var0 == null) {
         var0.method2653(var1);
      }

      try {
         var0.method2661(0, -297601409 * var0.field1107, var0.field1106, (byte)-19);
         var0.method2663(0, -297601409 * var0.field1107, var0.field1106, (byte)-59);
         var0.method2669((byte)-1);
         var0.method2674(-1784349338);
         if (class189.method4815(var0.stream1, 451420728) == 0) {
            if (var1 != -824061258) {
               throw new IllegalStateException();
            }

            if (class189.method4815(var0.stream2, -1295907286) == 0) {
               if (var1 != -824061258) {
                  throw new IllegalStateException();
               }

               method2697(var0, 894587571);
               method2706(var0, 1510917926);
               var0.remove();
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void method2701(int var1) {
      try {
         if (this.stream1 != null) {
            class50.pcmStreamMixer.method3419(this.stream2);
            this.stream1 = null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ax")
   int method2711(byte var1) {
      try {
         return -1203626699 * this.field1096;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   int method2717(int var1) {
      try {
         return 1899711959 * this.field1094;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.al(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;IILnb;)V")
   @ObfuscatedName("td")
   public static void method2667(ObjectSound var0, int var1, int var2, class343 var3) {
      if (var0 == null) {
         var0.method2668(var1, var1, var3);
      } else {
         if (var0.stream2 != null && var1 != var0.stream2.field1387) {
            var0.stream2.field1389 = var0.stream2.method3247();
            var0.stream2.field1399 = ParamComposition.method4949((byte)15);
            int var4 = HttpRequestTask.method88(
               var2, Math.abs(var0.stream2.field1389 - var1), ClientPreferences.method1623(class468.clientPreferences, (byte)0), 1952313692
            );
            var0.stream2.field1390 = var4;
            var0.stream2.field1387 = var1;
            var0.stream2.field1391 = var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   void method2653(int var1) {
      try {
         this.method2663(0, -297601409 * this.field1099, this.field1106, (byte)-19);
         this.method2661(0, -297601409 * this.field1097, this.field1104, (byte)-59);
         this.method2669((byte)-1);
         this.method2700(-1784349338);
         if (class189.method4815(this.stream2, 451420728) == 0) {
            if (var1 != -824061258) {
               throw new IllegalStateException();
            }

            if (class189.method4815(this.stream2, -1295907286) == 0) {
               if (var1 != -824061258) {
                  throw new IllegalStateException();
               }

               method2697(this, 894587571);
               method2706(this, 1510917926);
               this.method11660();
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILnb;)V")
   @ObfuscatedName("bu")
   void method2668(int var1, int var2, class343 var3) {
      if (this.stream1 != null && var1 != this.stream2.field1389) {
         this.stream2.field1389 = this.stream2.method3261();
         this.stream2.field1399 = ParamComposition.method4949((byte)15);
         int var4 = HttpRequestTask.method88(
            var2, Math.abs(this.stream1.field1390 - var1), ClientPreferences.method1623(class468.clientPreferences, (byte)0), 1952313692
         );
         this.stream1.field1387 = var4;
         this.stream2.field1390 = var1;
         this.stream2.field1391 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   int method2721(int var1) {
      try {
         return this.maxX * 1835506585;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   int method2725(int var1) {
      try {
         return this.maxY * 1915964479;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cq.am(" + 41);
      }
   }
}
