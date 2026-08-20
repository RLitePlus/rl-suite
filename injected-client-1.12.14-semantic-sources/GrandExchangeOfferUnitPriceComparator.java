import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qb")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5291 = 3;
   @ObfuscatedSignature(descriptor = "Lpz;")
   @ObfuscatedName("gy")
   static CameraViewMode cameraViewMode;

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qb.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqb;Lqk;Lqk;)I")
   @ObfuscatedName("wn")
   public static int method8833(GrandExchangeOfferUnitPriceComparator var0, GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if (var0 == null) {
         return var0.method8838(var1, var1);
      } else {
         return var1.grandExchangeOffer.unitPrice * -443884831 < var2.grandExchangeOffer.unitPrice * 270012189
            ? -1
            : (var1.grandExchangeOffer.unitPrice * 270012189 == var2.grandExchangeOffer.unitPrice * 29139897 ? 0 : 1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method8839(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, -1273122938);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 145243852);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qb.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;I)I")
   @ObfuscatedName("av")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2, int var3) {
      try {
         byte var10000;
         if (var1.grandExchangeOffer.unitPrice * 270012189 < var2.grandExchangeOffer.unitPrice * 270012189) {
            if (var3 >= 2018466653) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (var1.grandExchangeOffer.unitPrice * 270012189 == var2.grandExchangeOffer.unitPrice * 270012189) {
            if (var3 >= 2018466653) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qb.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method8840(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, 250588180);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method8841(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2, -779970348);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method8842(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqb;Ljava/lang/Object;)Z")
   @ObfuscatedName("df")
   public static boolean method8843(GrandExchangeOfferUnitPriceComparator var0, Object var1) {
      if (var0 == null) {
         var0.method8841(var1, var1);
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method8844(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("aw")
   int method8835(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.unitPrice * 2013489525 < var2.grandExchangeOffer.unitPrice * 270012189
         ? -1
         : (var1.grandExchangeOffer.unitPrice * -751191944 == var2.grandExchangeOffer.unitPrice * -1651531745 ? 0 : 1);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("aj")
   int method8836(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.unitPrice * 270012189 < var2.grandExchangeOffer.unitPrice * 270012189
         ? -1
         : (var1.grandExchangeOffer.unitPrice * 270012189 == var2.grandExchangeOffer.unitPrice * 270012189 ? 0 : 1);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("ap")
   int method8837(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.unitPrice * 270012189 < var2.grandExchangeOffer.unitPrice * 270012189
         ? -1
         : (var1.grandExchangeOffer.unitPrice * 270012189 == var2.grandExchangeOffer.unitPrice * 270012189 ? 0 : 1);
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;)I")
   @ObfuscatedName("ay")
   int method8838(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.unitPrice * 270012189 < var2.grandExchangeOffer.unitPrice * -169605541
         ? -1
         : (var1.grandExchangeOffer.unitPrice * 875802885 == var2.grandExchangeOffer.unitPrice * -1321287783 ? 0 : 1);
   }

   @ObfuscatedSignature(descriptor = "(BI)C")
   @ObfuscatedName("ae")
   public static char method8845(byte var0, int var1) {
      try {
         int var2 = var0 & 255;
         if (var2 == 0) {
            if (var1 == 632501093) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("" + Integer.toString(var2, 16));
            }
         } else {
            if (var2 >= 128) {
               if (var1 == 632501093) {
                  throw new IllegalStateException();
               }

               if (var2 < 160) {
                  char var3 = class451.cp1252AsciiExtension[var2 - 128];
                  if (0 == var3) {
                     if (var1 == 632501093) {
                        throw new IllegalStateException();
                     }

                     var3 = '?';
                  }

                  var2 = var3;
               }
            }

            return (char)var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qb.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsj;ILse;B)I")
   @ObfuscatedName("av")
   public static int method8832(AnimationSequence var0, int var1, classSE var2, byte var3) {
      try {
         int var4 = 0;
         if (!AnimationSequence.method10315(var0, -831296794)) {
            var0.method10338(0, -174161386);
            return var4;
         } else {
            SequenceDefinition var5 = AnimationSequence.method10318(var0, 685669445);
            if (var5.frameCount * 1996641051 == -1) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               var4 |= 8;
            }

            if (SequenceDefinition.method5260(var5, (byte)-72)) {
               var0.method10338(0, -838776920);
            } else {
               var0.method10338(var0.method10335(1958668357) + var1, -322992251);
            }

            if (!var5.isCachedModelIdSet((byte)-68)) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               int var8 = var1;
               byte var9 = 0;
               SequenceDefinition var10 = AnimationSequence.method10318(var0, 114211506);
               if (var10.frameCount * 1996641051 > 0) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var10.field2752 * -1278679125 > 0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     var8 = var1 % (var10.field2752 * -1278679125);
                  }
               }

               int var11 = var0.getFrame(-609025707);
               int var12 = AnimationSequence.method10329(var0, 859206463);
               int var13 = AnimationSequence.method10330(var0, 45053939);
               if (var11 >= var10.frameIds.length) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  var11 = 0;
                  var12 = 0;
               }

               var12 += var8;

               while (var12 > var10.frameLengths[var11]) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  var12 -= var10.frameLengths[var11];
                  var11++;
                  var9 |= 4;
                  if ((var9 & 2) == 0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (null != var2) {
                        var2.vmethod329(var10, var11, -61741358);
                     }
                  }

                  if (var11 >= var10.frameIds.length) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     var13++;
                     var9 |= 1;
                     var11 -= 1996641051 * var10.frameCount;
                     if (var13 >= var10.field2729 * 522964681) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var9 |= 2;
                     }

                     label212: {
                        if (var11 >= 0) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (var11 < var10.frameIds.length) {
                              break label212;
                           }

                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }
                        }

                        var9 |= 2;
                        var11 = 0;
                     }

                     if ((var9 & 2) == 0) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (null != var2) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           var2.vmethod329(var10, var11, 2023957907);
                        }
                     }
                  }
               }

               var0.method10347(var11, var12, var13, (byte)53);
               var4 |= var9;
            } else {
               int var16 = var1;
               byte var17 = 0;
               SequenceDefinition var18 = AnimationSequence.method10318(var0, -1417379171);
               if (1996641051 * var18.frameCount > 0) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var1 > 0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     var16 = var1 - (var1 - 1) / (1996641051 * var18.frameCount) * var18.frameCount * 1996641051;
                  }
               }

               int var19 = var0.getFrame(-609025707);
               int var21 = AnimationSequence.method10330(var0, -1680979469);

               while (var16 > 0) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  var16--;
                  var19++;
                  var17 |= 4;
                  if ((var17 & 2) == 0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (null != var2) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var2.vmethod329(var18, var19, -214332441);
                     }
                  }

                  int var22 = var18.getMayaAnimFrame((byte)113);
                  if (var19 >= var22) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     var21++;
                     var17 |= 1;
                     var19 -= var18.frameCount * 1996641051;
                     if (var21 >= var18.field2729 * 522964681) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var17 |= 2;
                     }

                     label190: {
                        if (var19 >= 0) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (var19 < var22) {
                              break label190;
                           }
                        }

                        var17 |= 2;
                        var19 = 0;
                     }

                     if (0 == (var17 & 2)) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (var2 != null) {
                           if (var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           var2.vmethod329(var18, var19, 215963253);
                        }
                     }
                  }
               }

               AnimationSequence.method10351(var0, var19, var21, (byte)125);
               var4 |= var17;
            }

            return var4;
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "qb.av(" + 41);
      }
   }
}
