import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vw")
public class classVW implements classSE {
   @ObfuscatedName("at")
   int field6320;
   @ObfuscatedName("ag")
   int field6319;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field6318 = 2;
   @ObfuscatedName("an")
   boolean field6323;
   @ObfuscatedSignature(descriptor = "Ldd;")
   @ObfuscatedName("av")
   WorldView field6322;
   @ObfuscatedName("jj")
   static int field6321;

   @ObfuscatedSignature(descriptor = "(Ldd;IIZ)V")
   @ObfuscatedName("aj")
   public void method11637(WorldView var1, int var2, int var3, boolean var4) {
      this.field6322 = var1;
      this.field6319 = var2 * -1655613243;
      this.field6320 = var3 * -1451223975;
      this.field6323 = var4;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIZI)V")
   @ObfuscatedName("an")
   public void method11638(WorldView var1, int var2, int var3, boolean var4, int var5) {
      try {
         this.field6322 = var1;
         this.field6319 = var2 * -1655613243;
         this.field6320 = var3 * -1451223975;
         this.field6323 = var4;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vw.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;I)V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod331(SequenceDefinition var1, int var2) {
      if (null != this.field6322) {
         WorldView var3 = this.field6322;
         int var4 = this.field6319 * -880777715;
         int var5 = 980396663 * this.field6320;
         boolean var6 = this.field6323;
         if (1548103253 * class57.soundEffectCount < 50 && null != var1.field2753 && var1.field2753.containsKey(var2)) {
            ArrayList var7 = (ArrayList)var1.field2753.get(var2);
            if (!var7.isEmpty()) {
               int var8 = 0;
               if (var7.size() > 1) {
                  int var9 = 1 + (int)(Math.random() * 100.0);
                  int var10 = 0;

                  for (class217 var12 : var7) {
                     int var13 = var10;
                     var10 += var12.field2490 * -1588064686;
                     if (var13 <= var9 && var9 < var10) {
                        break;
                     }

                     var8++;
                  }

                  if (var8 >= var7.size()) {
                     return;
                  }
               }

               class217 var14 = (class217)var7.get(var8);
               int var15 = var14.field2491 * 457215544 & 31;
               if ((var15 <= 0 || ClientPreferences.method1623(class468.clientPreferences, (byte)0) != 0)
                  && (var15 != 0 || ClientPreferences.method1620(class468.clientPreferences, 1448908011) != 0)
                  && var14 != null) {
                  if (0 == 2052898063 * var14.field2491) {
                     if (var6) {
                        GrandExchangeOffer.method8889(
                           1035025708 * var3.id,
                           var14.field2493 * 896618819,
                           0,
                           0,
                           0,
                           1434183343 * var14.field2492,
                           -1235349515 * var14.field2489,
                           0,
                           var1.field2733,
                           -1135571776
                        );
                     }
                  } else {
                     int var16 = Coord.method8304(var4 - 64, (byte)-3);
                     int var17 = Coord.method8304(var5 - 64, (byte)-36);
                     GrandExchangeOffer.method8889(
                        577964535 * var3.id,
                        -342245865 * var14.field2493,
                        var16,
                        var17,
                        var14.field2491 * -1187064719,
                        1277556611 * var14.field2492,
                        var14.field2489 * -1235349515,
                        0,
                        var1.field2733,
                        -1320989707
                     );
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("vi")
   public void method11643() {
      method11640(this, (byte)-93);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)V")
   @ObfuscatedName("hm")
   public static void method11639(classVW var0) {
      if (var0 == null) {
         var0.method11643();
      }

      var0.field6322 = null;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIZ)V")
   @ObfuscatedName("qa")
   public void method11644(WorldView var1, int var2, int var3, boolean var4) {
      this.method11638(var1, var2, var3, var4, 133741999);
   }

   @ObfuscatedSignature(descriptor = "(Lvw;B)V")
   @ObfuscatedName("za")
   public static void method11640(classVW var0, byte var1) {
      if (var0 == null) {
         var0.method11641(var1);
      } else {
         try {
            var0.field6322 = null;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "vw.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;II)V")
   @ObfuscatedName("av")
   @Override
   public void vmethod329(SequenceDefinition var1, int var2, int var3) {
      try {
         if (null == this.field6322) {
            if (var3 > -698462875) {
               ;
            }
         } else {
            WorldView var4 = this.field6322;
            int var5 = this.field6319 * -880777715;
            int var6 = 543552489 * this.field6320;
            boolean var7 = this.field6323;
            if (1548103253 * class57.soundEffectCount >= 50) {
               if (var3 <= -698462875) {
                  throw new IllegalStateException();
               }
            } else if (null != var1.field2753) {
               if (var3 <= -698462875) {
                  throw new IllegalStateException();
               }

               if (!var1.field2753.containsKey(var2)) {
                  if (var3 <= -698462875) {
                     return;
                  }
               } else {
                  ArrayList var8 = (ArrayList)var1.field2753.get(var2);
                  if (var8.isEmpty()) {
                     if (var3 <= -698462875) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var9 = 0;
                     if (var8.size() > 1) {
                        if (var3 <= -698462875) {
                           return;
                        }

                        int var10 = 1 + (int)(Math.random() * 100.0);
                        int var11 = 0;

                        for (Iterator var12 = var8.iterator(); var12.hasNext(); var9++) {
                           if (var3 <= -698462875) {
                              throw new IllegalStateException();
                           }

                           class217 var13 = (class217)var12.next();
                           int var14 = var11;
                           var11 += var13.field2490 * -1913625419;
                           if (var14 <= var10) {
                              if (var3 <= -698462875) {
                                 throw new IllegalStateException();
                              }

                              if (var10 < var11) {
                                 if (var3 <= -698462875) {
                                    throw new IllegalStateException();
                                 }
                                 break;
                              }
                           }
                        }

                        if (var9 >= var8.size()) {
                           return;
                        }
                     }

                     class217 var16 = (class217)var8.get(var9);
                     int var17 = var16.field2491 * 2052898063 & 31;
                     if (var17 > 0) {
                        if (var3 <= -698462875) {
                           throw new IllegalStateException();
                        }

                        if (ClientPreferences.method1623(class468.clientPreferences, (byte)0) == 0) {
                           return;
                        }
                     }

                     if (var17 == 0) {
                        if (var3 <= -698462875) {
                           return;
                        }

                        if (ClientPreferences.method1620(class468.clientPreferences, 204130106) == 0) {
                           if (var3 <= -698462875) {
                              return;
                           }

                           return;
                        }
                     }

                     if (var16 == null) {
                        if (var3 <= -698462875) {
                           throw new IllegalStateException();
                        }
                     } else if (0 == 2052898063 * var16.field2491) {
                        if (var3 <= -698462875) {
                           throw new IllegalStateException();
                        }

                        if (!var7) {
                           if (var3 <= -698462875) {
                              return;
                           }
                        } else {
                           GrandExchangeOffer.method8889(
                              577964535 * var4.id,
                              var16.field2493 * 896618819,
                              0,
                              0,
                              0,
                              1277556611 * var16.field2492,
                              -1235349515 * var16.field2489,
                              0,
                              var1.field2733,
                              -917781164
                           );
                        }
                     } else {
                        int var18 = Coord.method8304(var5 - 64, (byte)-76);
                        int var19 = Coord.method8304(var6 - 64, (byte)-98);
                        GrandExchangeOffer.method8889(
                           577964535 * var4.id,
                           896618819 * var16.field2493,
                           var18,
                           var19,
                           var16.field2491 * 2052898063,
                           1277556611 * var16.field2492,
                           var16.field2489 * -1235349515,
                           0,
                           var1.field2733,
                           -1235362860
                        );
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "vw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;I)V")
   @ObfuscatedName("at")
   @Override
   public void vmethod328(SequenceDefinition var1, int var2) {
      if (null != this.field6322) {
         WorldView var3 = this.field6322;
         int var4 = this.field6319 * -967637641;
         int var5 = 1626297826 * this.field6320;
         boolean var6 = this.field6323;
         if (2068741233 * class57.soundEffectCount < 50 && null != var1.field2753 && var1.field2753.containsKey(var2)) {
            ArrayList var7 = (ArrayList)var1.field2753.get(var2);
            if (!var7.isEmpty()) {
               int var8 = 0;
               if (var7.size() > 1) {
                  int var9 = 1 + (int)(Math.random() * 100.0);
                  int var10 = 0;

                  for (class217 var12 : var7) {
                     int var13 = var10;
                     var10 += var12.field2490 * -1913625419;
                     if (var13 <= var9 && var9 < var10) {
                        break;
                     }

                     var8++;
                  }

                  if (var8 >= var7.size()) {
                     return;
                  }
               }

               class217 var14 = (class217)var7.get(var8);
               int var15 = var14.field2491 * 346913130 & -358690373;
               if ((var15 <= 0 || ClientPreferences.method1623(class468.clientPreferences, (byte)0) != 0)
                  && (var15 != 0 || ClientPreferences.method1620(class468.clientPreferences, 516869505) != 0)
                  && var14 != null) {
                  if (0 == 800357070 * var14.field2491) {
                     if (var6) {
                        GrandExchangeOffer.method8889(
                           -935843738 * var3.id,
                           var14.field2493 * 1631188826,
                           0,
                           0,
                           0,
                           -179440730 * var14.field2492,
                           -1235349515 * var14.field2489,
                           0,
                           var1.field2733,
                           -1768386741
                        );
                     }
                  } else {
                     int var16 = Coord.method8304(var4 - -987026752, (byte)-13);
                     int var17 = Coord.method8304(var5 - 64, (byte)-86);
                     GrandExchangeOffer.method8889(
                        577964535 * var3.id,
                        896618819 * var14.field2493,
                        var16,
                        var17,
                        var14.field2491 * 1546620502,
                        1277556611 * var14.field2492,
                        var14.field2489 * -1748764593,
                        0,
                        var1.field2733,
                        -484157476
                     );
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldu;[II)I")
   @ObfuscatedName("nv")
   public static int method11642(VorbisFloor var0, int[] var1, int var2) {
      if (var0 == null) {
         var0.method3480(var1, var2);
      }

      int var3 = var1[var2];
      int var4 = -1;
      int var5 = -390068053;

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var1[var6];
         if (var7 < var3 && var7 > var5) {
            var4 = var6;
            var5 = var7;
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(Liw;I)V")
   @ObfuscatedName("ol")
   @Override
   public void vmethod330(SequenceDefinition var1, int var2) {
      this.vmethod329(var1, var2, -61741358);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   public void method11641(byte var1) {
      try {
         this.field6322 = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vw.ae(" + ')');
      }
   }
}
