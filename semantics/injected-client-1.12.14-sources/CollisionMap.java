import net.runelite.api.CollisionData;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kk")
public class CollisionMap implements CollisionData {
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field3349 = 1076101390;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field3345 = 4;
   @ObfuscatedName("bt")
   int xInset;
   @ObfuscatedName("ba")
   int xSize;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field3347 = 64;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field3343 = 4096;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field3346 = 8192;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field3350 = 16384;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field3344 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field3353 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3351 = 1;
   @ObfuscatedName("bu")
   int yInset;
   @ObfuscatedName("bi")
   int ySize;
   @ObfuscatedName("cq")
   static int loginBoxCenter;
   @ObfuscatedName("by")
   final int[][] flags;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   public static final int field3352 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field3348 = 8;

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bi")
   void method6390(int var1, int var2, int var3) {
      this.flags[var1][var2] = this.flags[var1][var2] | var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;)V")
   @ObfuscatedName("za")
   public static void method6381(CollisionMap var0) {
      if (var0 == null) {
         var0.method6383();
      } else {
         for (int var1 = 0; var1 < -1640107663 * var0.xSize; var1++) {
            for (int var2 = 0; var2 < -67399471 * var0.ySize; var2++) {
               if (var1 >= 1 && var2 >= 1 && var1 < var0.xSize * -1640107663 - 5 && var2 < var0.ySize * -67399471 - 5) {
                  var0.flags[var1][var2] = 1073741824;
               } else {
                  var0.flags[var1][var2] = 16777215;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("cx")
   public void method6426(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 504755687 * this.xInset;
      var2 -= this.yInset * -1751058007;
      if (0 == var3) {
         if (var4 == 0) {
            this.setFlagOff(var1, var2, 128, -1373903582);
            this.setFlagOff(var1 - 1, var2, 8, -1185049816);
         }

         if (var4 == 1) {
            this.setFlagOff(var1, var2, 2, -1301707123);
            this.setFlagOff(var1, var2 + 1, 32, -633662433);
         }

         if (var4 == 2) {
            this.setFlagOff(var1, var2, 8, -2019054192);
            this.setFlagOff(1 + var1, var2, 128, -1721687747);
         }

         if (var4 == 3) {
            this.setFlagOff(var1, var2, 32, -316964794);
            this.setFlagOff(var1, var2 - 1, 2, -1639404992);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.setFlagOff(var1, var2, 1, -1016130571);
            this.setFlagOff(var1 - 1, var2 + 1, 16, -1279096321);
         }

         if (1 == var4) {
            this.setFlagOff(var1, var2, 4, -1642539853);
            this.setFlagOff(1 + var1, var2 + 1, 64, -1443493705);
         }

         if (2 == var4) {
            this.setFlagOff(var1, var2, 16, -1318922856);
            this.setFlagOff(1 + var1, var2 - 1, 1, -1503466090);
         }

         if (var4 == 3) {
            this.setFlagOff(var1, var2, 64, -605768649);
            this.setFlagOff(var1 - 1, var2 - 1, 4, -1951732403);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.setFlagOff(var1, var2, 130, -1438013421);
            this.setFlagOff(var1 - 1, var2, 8, -2139494346);
            this.setFlagOff(var1, var2 + 1, 32, -523470932);
         }

         if (1 == var4) {
            this.setFlagOff(var1, var2, 10, -432251051);
            this.setFlagOff(var1, 1 + var2, 32, -306043046);
            this.setFlagOff(var1 + 1, var2, 128, -2063363416);
         }

         if (var4 == 2) {
            this.setFlagOff(var1, var2, 40, -2136385420);
            this.setFlagOff(1 + var1, var2, 128, -1689714701);
            this.setFlagOff(var1, var2 - 1, 2, -813846700);
         }

         if (3 == var4) {
            this.setFlagOff(var1, var2, 160, -1267593439);
            this.setFlagOff(var1, var2 - 1, 2, -1929981132);
            this.setFlagOff(var1 - 1, var2, 8, -303035053);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (0 == var4) {
               this.setFlagOff(var1, var2, 65536, -1169875011);
               this.setFlagOff(var1 - 1, var2, 4096, -2030307826);
            }

            if (var4 == 1) {
               this.setFlagOff(var1, var2, 1024, -1416209017);
               this.setFlagOff(var1, 1 + var2, 16384, -1319709956);
            }

            if (2 == var4) {
               this.setFlagOff(var1, var2, 4096, -2115044267);
               this.setFlagOff(1 + var1, var2, 65536, -2054917855);
            }

            if (3 == var4) {
               this.setFlagOff(var1, var2, 16384, -441853857);
               this.setFlagOff(var1, var2 - 1, 1024, -1849148508);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (var4 == 0) {
               this.setFlagOff(var1, var2, 512, -1495402116);
               this.setFlagOff(var1 - 1, 1 + var2, 8192, -965514675);
            }

            if (1 == var4) {
               this.setFlagOff(var1, var2, 2048, -417797227);
               this.setFlagOff(var1 + 1, 1 + var2, 32768, -1146987280);
            }

            if (var4 == 2) {
               this.setFlagOff(var1, var2, 8192, -1770639715);
               this.setFlagOff(var1 + 1, var2 - 1, 512, -2108908128);
            }

            if (var4 == 3) {
               this.setFlagOff(var1, var2, 32768, -1710665672);
               this.setFlagOff(var1 - 1, var2 - 1, 2048, -1083414925);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               this.setFlagOff(var1, var2, 66560, -1710714673);
               this.setFlagOff(var1 - 1, var2, 4096, -1073638459);
               this.setFlagOff(var1, 1 + var2, 16384, -1063158028);
            }

            if (var4 == 1) {
               this.setFlagOff(var1, var2, 5120, -1378730319);
               this.setFlagOff(var1, var2 + 1, 16384, -1668468673);
               this.setFlagOff(1 + var1, var2, 65536, -1409458161);
            }

            if (var4 == 2) {
               this.setFlagOff(var1, var2, 20480, -1860246608);
               this.setFlagOff(1 + var1, var2, 65536, -925757247);
               this.setFlagOff(var1, var2 - 1, 1024, -1550337357);
            }

            if (3 == var4) {
               this.setFlagOff(var1, var2, 81920, -1118744207);
               this.setFlagOff(var1, var2 - 1, 1024, -1503647126);
               this.setFlagOff(var1 - 1, var2, 4096, -893262672);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkk;I)V")
   @ObfuscatedName("cz")
   public static void method6382(CollisionMap var0, int var1) {
      if (var0 == null) {
         var0.clear(var1);
      } else {
         try {
            for (int var2 = 0; var2 < -1640107663 * var0.xSize; var2++) {
               for (int var3 = 0; var3 < -67399471 * var0.ySize; var3++) {
                  if (var1 == 1164283646) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 1) {
                     if (var1 == 1164283646) {
                        return;
                     }

                     if (var3 >= 1) {
                        if (var1 == 1164283646) {
                           throw new IllegalStateException();
                        }

                        if (var2 < var0.xSize * -1640107663 - 5) {
                           if (var1 == 1164283646) {
                              throw new IllegalStateException();
                           }

                           if (var3 < var0.ySize * -67399471 - 5) {
                              var0.flags[var2][var3] = 1073741824;
                              continue;
                           }

                           if (var1 == 1164283646) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }

                  var0.flags[var2][var3] = 16777215;
               }
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "kk.aj(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;IIIIZ)V")
   @ObfuscatedName("ql")
   public static void method6427(CollisionMap var0, int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 846033741 * var0.xInset;
      var2 -= var0.yInset * -1751058007;
      if (0 == var3) {
         if (var4 == 0) {
            var0.setFlagOff(var1, var2, 128, -2067672279);
            var0.setFlagOff(var1 - 1, var2, 8, -1398667261);
         }

         if (var4 == 1) {
            var0.setFlagOff(var1, var2, 2, -365853183);
            var0.setFlagOff(var1, var2 + 1, 1377826888, -1849768317);
         }

         if (var4 == 2) {
            var0.setFlagOff(var1, var2, 8, -1808101911);
            var0.setFlagOff(1 + var1, var2, 128, -462894261);
         }

         if (var4 == 3) {
            var0.setFlagOff(var1, var2, 32, -743176087);
            var0.setFlagOff(var1, var2 - 1, 2, -412681195);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            var0.setFlagOff(var1, var2, 1, -898749698);
            var0.setFlagOff(var1 - 1, var2 + 1, 16, -937304082);
         }

         if (1 == var4) {
            var0.setFlagOff(var1, var2, 4, -815549913);
            var0.setFlagOff(1 + var1, var2 + 1, 64, -1695975597);
         }

         if (2 == var4) {
            var0.setFlagOff(var1, var2, 16, -1632300697);
            var0.setFlagOff(1 + var1, var2 - 1, 1, -375949204);
         }

         if (var4 == 3) {
            var0.setFlagOff(var1, var2, -1514664940, -581897475);
            var0.setFlagOff(var1 - 1, var2 - 1, 4, -341429074);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            var0.setFlagOff(var1, var2, -923915386, -950417765);
            var0.setFlagOff(var1 - 1, var2, 8, -1348800856);
            var0.setFlagOff(var1, var2 + 1, 32, -425301850);
         }

         if (1 == var4) {
            var0.setFlagOff(var1, var2, 10, -888973402);
            var0.setFlagOff(var1, 1 + var2, 32, -2009691847);
            var0.setFlagOff(var1 + 1, var2, 128, -326816258);
         }

         if (var4 == 2) {
            var0.setFlagOff(var1, var2, 40, -1533192661);
            var0.setFlagOff(1 + var1, var2, 270395033, -895518672);
            var0.setFlagOff(var1, var2 - 1, 2, -311209896);
         }

         if (3 == var4) {
            var0.setFlagOff(var1, var2, 745212667, -911558158);
            var0.setFlagOff(var1, var2 - 1, 2, -996477385);
            var0.setFlagOff(var1 - 1, var2, 8, -1044649377);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (0 == var4) {
               var0.setFlagOff(var1, var2, 65536, -1311538571);
               var0.setFlagOff(var1 - 1, var2, 4096, -885919649);
            }

            if (var4 == 1) {
               var0.setFlagOff(var1, var2, 1024, -1663834462);
               var0.setFlagOff(var1, 1 + var2, 16384, -1912660466);
            }

            if (2 == var4) {
               var0.setFlagOff(var1, var2, 4096, -825542008);
               var0.setFlagOff(1 + var1, var2, -1065210400, -1747407071);
            }

            if (3 == var4) {
               var0.setFlagOff(var1, var2, -420059296, -674628159);
               var0.setFlagOff(var1, var2 - 1, -2128782745, -392547555);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (var4 == 0) {
               var0.setFlagOff(var1, var2, 512, -432623390);
               var0.setFlagOff(var1 - 1, 1 + var2, 8192, -1753346848);
            }

            if (1 == var4) {
               var0.setFlagOff(var1, var2, 2048, -1958400234);
               var0.setFlagOff(var1 + 1, 1 + var2, -844934316, -1711988119);
            }

            if (var4 == 2) {
               var0.setFlagOff(var1, var2, 8192, -1126619088);
               var0.setFlagOff(var1 + 1, var2 - 1, 512, -560455500);
            }

            if (var4 == 3) {
               var0.setFlagOff(var1, var2, 32768, -1352355687);
               var0.setFlagOff(var1 - 1, var2 - 1, 2048, -666126019);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               var0.setFlagOff(var1, var2, -1928461626, -307065838);
               var0.setFlagOff(var1 - 1, var2, 4096, -1728876861);
               var0.setFlagOff(var1, 1 + var2, 534952605, -684613505);
            }

            if (var4 == 1) {
               var0.setFlagOff(var1, var2, 168647378, -1255781836);
               var0.setFlagOff(var1, var2 + 1, 1538259548, -1801584163);
               var0.setFlagOff(1 + var1, var2, 442138534, -874219655);
            }

            if (var4 == 2) {
               var0.setFlagOff(var1, var2, 756771981, -1602502370);
               var0.setFlagOff(1 + var1, var2, 65536, -1218923361);
               var0.setFlagOff(var1, var2 - 1, 1024, -895315747);
            }

            if (3 == var4) {
               var0.setFlagOff(var1, var2, 81920, -1370271562);
               var0.setFlagOff(var1, var2 - 1, 1024, -849735536);
               var0.setFlagOff(var1 - 1, var2, 1843320863, -1492943750);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method6375(int var1) {
      try {
         return this.xSize * -1640107663;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kk.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;II)V")
   @ObfuscatedName("my")
   public static void method6438(CollisionMap var0, int var1, int var2) {
      var1 -= 504755687 * var0.xInset;
      var2 -= -1751058007 * var0.yInset;
      var0.flags[var1][var2] = var0.flags[var1][var2] & -262145;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bf")
   public void method6441(int var1, int var2, int var3) {
      this.method6398(var1, var2, var3, 651999802);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method6377(int var1) {
      try {
         return -67399471 * this.ySize;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kk.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("az")
   boolean method6405(int var1, int var2, int var3) {
      try {
         if (var1 >= 1) {
            if (var3 != 554339037) {
               throw new IllegalStateException();
            }

            if (var1 < -1640107663 * this.xSize - 5) {
               if (var3 != 554339037) {
                  throw new IllegalStateException();
               }

               if (var2 >= 1) {
                  if (var3 != 554339037) {
                     throw new IllegalStateException();
                  }

                  if (var2 < this.ySize * -67399471 - 5) {
                     if (var3 != 554339037) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kk.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;II)V")
   @ObfuscatedName("el")
   public static void method6423(CollisionMap var0, int var1, int var2) {
      var1 -= 504755687 * var0.xInset;
      var2 -= 2074409456 * var0.yInset;
      var0.flags[var1][var2] = var0.flags[var1][var2] | -396308928;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ak")
   boolean method6386(int var1, int var2, int var3, int var4) {
      try {
         boolean var10000;
         if (0 != (this.flags[var1][var2] & var3)) {
            if (var4 >= 1554418098) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kk.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkk;IIII)V")
   @ObfuscatedName("sh")
   public static void method6391(CollisionMap var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.setFlag(var1, var1, var1, var1);
      } else {
         try {
            var0.flags[var1][var2] = var0.flags[var1][var2] | var3;
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "kk.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("aw")
   void setFlagOff(int var1, int var2, int var3, int var4) {
      try {
         this.flags[var1][var2] = this.flags[var1][var2] & ~var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kk.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("ae")
   final void method6379(int var1, int var2, int var3, int var4, byte var5) {
      try {
         this.xInset = 396905943 * var1;
         this.yInset = 1274460825 * var2;
         this.xSize = -1514229871 * var3;
         this.ySize = var4 * -1646868431;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "kk.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("au")
   public boolean method6401(int var1, int var2, int var3) {
      try {
         return this.method6405(var1 - this.xInset * 504755687, var2 - this.yInset * -1751058007, 554339037);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kk.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method6371() {
      return -1163198067 * this.yInset;
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ac")
   public void setBlockedByFloor(int var1, int var2, byte var3) {
      try {
         var1 -= this.xInset * 504755687;
         var2 -= this.yInset * -1751058007;
         this.flags[var1][var2] = this.flags[var1][var2] | 2097152;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kk.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkk;IIIIZI)V")
   @ObfuscatedName("gm")
   public static void method6408(CollisionMap var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      if (var0 == null) {
         var0.addGameObject(var1, var1, var1, var1, var5, var1);
      } else {
         try {
            var1 -= 504755687 * var0.xInset;
            var2 -= var0.yInset * -1751058007;
            if (var3 == 0) {
               if (var4 == 0) {
                  method6391(var0, var1, var2, 128, 1177297832);
                  method6391(var0, var1 - 1, var2, 8, -1055171365);
               }

               if (1 == var4) {
                  method6391(var0, var1, var2, 2, -900362070);
                  method6391(var0, var1, var2 + 1, 32, -162751720);
               }

               if (var4 == 2) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  method6391(var0, var1, var2, 8, 1648924199);
                  method6391(var0, 1 + var1, var2, 128, -938801178);
               }

               if (3 == var4) {
                  if (var6 == -1366403836) {
                     return;
                  }

                  method6391(var0, var1, var2, 32, -96910703);
                  method6391(var0, var1, var2 - 1, 2, -101771546);
               }
            }

            label262: {
               if (1 != var3) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  if (3 != var3) {
                     break label262;
                  }

                  if (var6 == -1366403836) {
                     return;
                  }
               }

               if (var4 == 0) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  method6391(var0, var1, var2, 1, -728676917);
                  method6391(var0, var1 - 1, 1 + var2, 16, -255937684);
               }

               if (var4 == 1) {
                  method6391(var0, var1, var2, 4, 1038973681);
                  method6391(var0, 1 + var1, 1 + var2, 64, 1523377877);
               }

               if (var4 == 2) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  method6391(var0, var1, var2, 16, -153600210);
                  method6391(var0, var1 + 1, var2 - 1, 1, -1563716659);
               }

               if (var4 == 3) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  method6391(var0, var1, var2, 64, -81762934);
                  method6391(var0, var1 - 1, var2 - 1, 4, -973367637);
               }
            }

            if (2 == var3) {
               if (var6 == -1366403836) {
                  throw new IllegalStateException();
               }

               if (0 == var4) {
                  if (var6 == -1366403836) {
                     return;
                  }

                  method6391(var0, var1, var2, 130, -1697015878);
                  method6391(var0, var1 - 1, var2, 8, 656186039);
                  method6391(var0, var1, 1 + var2, 32, -1693453328);
               }

               if (1 == var4) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  method6391(var0, var1, var2, 10, 1782772863);
                  method6391(var0, var1, 1 + var2, 32, -653936727);
                  method6391(var0, 1 + var1, var2, 128, 533647655);
               }

               if (var4 == 2) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  method6391(var0, var1, var2, 40, 258918276);
                  method6391(var0, 1 + var1, var2, 128, 723847863);
                  method6391(var0, var1, var2 - 1, 2, 243983368);
               }

               if (var4 == 3) {
                  method6391(var0, var1, var2, 160, -645992083);
                  method6391(var0, var1, var2 - 1, 2, -214148228);
                  method6391(var0, var1 - 1, var2, 8, 1261132299);
               }
            }

            if (var5) {
               if (var6 == -1366403836) {
                  throw new IllegalStateException();
               }

               if (0 == var3) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  if (var4 == 0) {
                     if (var6 == -1366403836) {
                        throw new IllegalStateException();
                     }

                     method6391(var0, var1, var2, 65536, 2068187312);
                     method6391(var0, var1 - 1, var2, 4096, 988823848);
                  }

                  if (1 == var4) {
                     if (var6 == -1366403836) {
                        return;
                     }

                     method6391(var0, var1, var2, 1024, 448294614);
                     method6391(var0, var1, var2 + 1, 16384, -1193192576);
                  }

                  if (2 == var4) {
                     if (var6 == -1366403836) {
                        return;
                     }

                     method6391(var0, var1, var2, 4096, 1564656203);
                     method6391(var0, var1 + 1, var2, 65536, -856380604);
                  }

                  if (3 == var4) {
                     if (var6 == -1366403836) {
                        throw new IllegalStateException();
                     }

                     method6391(var0, var1, var2, 16384, -1566986648);
                     method6391(var0, var1, var2 - 1, 1024, 786698860);
                  }
               }

               label267: {
                  if (var3 != 1) {
                     if (var6 == -1366403836) {
                        throw new IllegalStateException();
                     }

                     if (3 != var3) {
                        break label267;
                     }

                     if (var6 == -1366403836) {
                        return;
                     }
                  }

                  if (var4 == 0) {
                     if (var6 == -1366403836) {
                        return;
                     }

                     method6391(var0, var1, var2, 512, 1953671252);
                     method6391(var0, var1 - 1, var2 + 1, 8192, -1451353598);
                  }

                  if (1 == var4) {
                     if (var6 == -1366403836) {
                        return;
                     }

                     method6391(var0, var1, var2, 2048, 1806671570);
                     method6391(var0, 1 + var1, 1 + var2, 32768, -59812234);
                  }

                  if (2 == var4) {
                     if (var6 == -1366403836) {
                        throw new IllegalStateException();
                     }

                     method6391(var0, var1, var2, 8192, -2042374379);
                     method6391(var0, var1 + 1, var2 - 1, 512, 364974319);
                  }

                  if (var4 == 3) {
                     if (var6 == -1366403836) {
                        return;
                     }

                     method6391(var0, var1, var2, 32768, 1830274697);
                     method6391(var0, var1 - 1, var2 - 1, 2048, -1865433706);
                  }
               }

               if (2 == var3) {
                  if (var6 == -1366403836) {
                     throw new IllegalStateException();
                  }

                  if (var4 == 0) {
                     method6391(var0, var1, var2, 66560, -977356374);
                     method6391(var0, var1 - 1, var2, 4096, 542148330);
                     method6391(var0, var1, 1 + var2, 16384, 1680742349);
                  }

                  if (var4 == 1) {
                     method6391(var0, var1, var2, 5120, -920502768);
                     method6391(var0, var1, 1 + var2, 16384, -237825029);
                     method6391(var0, 1 + var1, var2, 65536, -786759646);
                  }

                  if (2 == var4) {
                     if (var6 == -1366403836) {
                        return;
                     }

                     method6391(var0, var1, var2, 20480, 643865267);
                     method6391(var0, 1 + var1, var2, 65536, -2067210115);
                     method6391(var0, var1, var2 - 1, 1024, -2005119803);
                  }

                  if (var4 == 3) {
                     if (var6 == -1366403836) {
                        return;
                     }

                     method6391(var0, var1, var2, 81920, 1311827989);
                     method6391(var0, var1, var2 - 1, 1024, 906909468);
                     method6391(var0, var1 - 1, var2, 4096, 704428482);
                  }
               }
            }
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "kk.ad(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ab")
   public void setBlockedByFloorDec(int var1, int var2, byte var3) {
      try {
         var1 -= 504755687 * this.xInset;
         var2 -= -1751058007 * this.yInset;
         this.flags[var1][var2] = this.flags[var1][var2] | 262144;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kk.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZI)V")
   @ObfuscatedName("ad")
   public void method6428(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= 504755687 * this.xInset;
         var2 -= this.yInset * -1751058007;
         if (0 == var3) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 128, -1479251122);
               this.setFlagOff(var1 - 1, var2, 8, -1107050550);
            }

            if (var4 == 1) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 2, -990713408);
               this.setFlagOff(var1, var2 + 1, 32, -2019447935);
            }

            if (var4 == 2) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 8, -1221479105);
               this.setFlagOff(1 + var1, var2, 128, -1587441347);
            }

            if (var4 == 3) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 32, -1857854102);
               this.setFlagOff(var1, var2 - 1, 2, -1689901154);
            }
         }

         label263: {
            if (1 != var3) {
               if (3 != var3) {
                  break label263;
               }

               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }
            }

            if (0 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 1, -326850532);
               this.setFlagOff(var1 - 1, var2 + 1, 16, -961841252);
            }

            if (1 == var4) {
               this.setFlagOff(var1, var2, 4, -1509485295);
               this.setFlagOff(1 + var1, var2 + 1, 64, -1481967305);
            }

            if (2 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 16, -2025328439);
               this.setFlagOff(1 + var1, var2 - 1, 1, -1275351106);
            }

            if (var4 == 3) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 64, -1600964191);
               this.setFlagOff(var1 - 1, var2 - 1, 4, -437129079);
            }
         }

         if (var3 == 2) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 130, -2082664926);
               this.setFlagOff(var1 - 1, var2, 8, -1155290597);
               this.setFlagOff(var1, var2 + 1, 32, -1413240828);
            }

            if (1 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 10, -1950044243);
               this.setFlagOff(var1, 1 + var2, 32, -1835092703);
               this.setFlagOff(var1 + 1, var2, 128, -385263561);
            }

            if (var4 == 2) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 40, -494556912);
               this.setFlagOff(1 + var1, var2, 128, -1250194228);
               this.setFlagOff(var1, var2 - 1, 2, -1821116829);
            }

            if (3 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 160, -1773760926);
               this.setFlagOff(var1, var2 - 1, 2, -1766940343);
               this.setFlagOff(var1 - 1, var2, 8, -1458790212);
            }
         }

         if (var5) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var3 == 0) {
               if (var6 == 1327475339) {
                  return;
               }

               if (0 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 65536, -920987826);
                  this.setFlagOff(var1 - 1, var2, 4096, -833617265);
               }

               if (var4 == 1) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 1024, -1100257220);
                  this.setFlagOff(var1, 1 + var2, 16384, -1586227168);
               }

               if (2 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 4096, -458013589);
                  this.setFlagOff(1 + var1, var2, 65536, -817317818);
               }

               if (3 == var4) {
                  if (var6 == 1327475339) {
                     return;
                  }

                  this.setFlagOff(var1, var2, 16384, -1474736942);
                  this.setFlagOff(var1, var2 - 1, 1024, -1934758939);
               }
            }

            label267: {
               if (1 != var3) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  if (var3 != 3) {
                     break label267;
                  }
               }

               if (var4 == 0) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 512, -889368794);
                  this.setFlagOff(var1 - 1, 1 + var2, 8192, -512579983);
               }

               if (1 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 2048, -625808937);
                  this.setFlagOff(var1 + 1, 1 + var2, 32768, -1109391252);
               }

               if (var4 == 2) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 8192, -933378014);
                  this.setFlagOff(var1 + 1, var2 - 1, 512, -1547032559);
               }

               if (var4 == 3) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 32768, -858984353);
                  this.setFlagOff(var1 - 1, var2 - 1, 2048, -1895694685);
               }
            }

            if (2 == var3) {
               if (var4 == 0) {
                  this.setFlagOff(var1, var2, 66560, -2141722815);
                  this.setFlagOff(var1 - 1, var2, 4096, -1438188439);
                  this.setFlagOff(var1, 1 + var2, 16384, -1771431626);
               }

               if (var4 == 1) {
                  if (var6 == 1327475339) {
                     return;
                  }

                  this.setFlagOff(var1, var2, 5120, -2045399584);
                  this.setFlagOff(var1, var2 + 1, 16384, -876574871);
                  this.setFlagOff(1 + var1, var2, 65536, -1197506781);
               }

               if (var4 == 2) {
                  this.setFlagOff(var1, var2, 20480, -566984926);
                  this.setFlagOff(1 + var1, var2, 65536, -550276816);
                  this.setFlagOff(var1, var2 - 1, 1024, -1625813221);
               }

               if (3 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 81920, -2116569954);
                  this.setFlagOff(var1, var2 - 1, 1024, -1079889797);
                  this.setFlagOff(var1 - 1, var2, 4096, -1691008348);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "kk.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bh")
   boolean method6406(int var1, int var2) {
      return var1 >= 1 && var1 < -1640107663 * this.xSize - 5 && var2 >= 1 && var2 < this.ySize * -67399471 - 5;
   }

   public int[][] getFlags() {
      return this.flags;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   int method6367() {
      return 504755687 * this.xInset;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bu")
   void method6392(int var1, int var2, int var3) {
      this.flags[var1][var2] = this.flags[var1][var2] | var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   int method6372() {
      return -1751058007 * this.yInset;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("px")
   public void method6442(int var1, int var2, int var3, int var4, boolean var5) {
      method6408(this, var1, var2, var3, var4, var5, 1809198866);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ay")
   public void method6398(int var1, int var2, int var3, int var4) {
      try {
         this.setFlagOff(var1 - this.xInset * 504755687, var2 - this.yInset * -1751058007, var3, -493127550);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kk.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;)I")
   @ObfuscatedName("qs")
   public static int method6368(CollisionMap var0) {
      return 504755687 * var0.xInset;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method6378() {
      return -67399471 * this.ySize;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("br")
   public boolean method6402(int var1, int var2) {
      return this.method6405(var1 - this.xInset * 504755687, var2 - this.yInset * -1751058007, 554339037);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   public int method6376() {
      return this.xSize * -1640107663;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public void method6383() {
      for (int var1 = 0; var1 < -1640107663 * this.xSize; var1++) {
         for (int var2 = 0; var2 < -67399471 * this.ySize; var2++) {
            if (var1 >= 1 && var2 >= 1 && var1 < this.xSize * -1640107663 - 5 && var2 < this.ySize * -67399471 - 5) {
               this.flags[var1][var2] = 1073741824;
            } else {
               this.flags[var1][var2] = 16777215;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bm")
   boolean method6387(int var1, int var2, int var3) {
      return 0 != (this.flags[var1][var2] & var3);
   }

   public CollisionMap(int var1, int var2, boolean var3) {
      if (var3) {
         this.method6379(-1, -1, var1 + 6, var2 + 6, (byte)-10);
      } else {
         this.method6379(0, 0, var1, var2, (byte)-111);
      }

      this.flags = new int[-1640107663 * this.xSize][this.ySize * -67399471];
      method6382(this, 427996469);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ba")
   void method6393(int var1, int var2, int var3) {
      this.flags[var1][var2] = this.flags[var1][var2] | var3;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZ)V")
   @ObfuscatedName("cd")
   public void method6432(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= 504755687 * this.xInset;
      var2 -= this.yInset * -1751058007;
      if (1 == var5 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var1 + var3; var12++) {
         if (var12 >= 0 && var12 < this.xSize * -1640107663) {
            for (int var9 = var2; var9 < var2 + var4; var9++) {
               if (var9 >= 0 && var9 < this.ySize * -67399471) {
                  this.setFlagOff(var12, var9, var7, -1251017764);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("by")
   void method6396(int var1, int var2, int var3) {
      this.flags[var1][var2] = this.flags[var1][var2] & ~var3;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("dt")
   public void method6443(int var1, int var2, int var3, int var4, boolean var5) {
      method6417(this, var1, var2, var3, var4, var5, 497115708);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("bc")
   public void method6409(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 504755687 * this.xInset;
      var2 -= this.yInset * -1751058007;
      if (var3 == 0) {
         if (var4 == 0) {
            method6391(this, var1, var2, 128, -851694703);
            method6391(this, var1 - 1, var2, 8, 949583547);
         }

         if (1 == var4) {
            method6391(this, var1, var2, 2, -1998248682);
            method6391(this, var1, var2 + 1, 32, -1749967174);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, 8, 1049694902);
            method6391(this, 1 + var1, var2, 128, -1999317231);
         }

         if (3 == var4) {
            method6391(this, var1, var2, 32, -258195970);
            method6391(this, var1, var2 - 1, 2, -610611861);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (var4 == 0) {
            method6391(this, var1, var2, 1, 1405115121);
            method6391(this, var1 - 1, 1 + var2, 16, 1576297330);
         }

         if (var4 == 1) {
            method6391(this, var1, var2, 4, 1317575251);
            method6391(this, 1 + var1, 1 + var2, 64, -914466403);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, 16, -661483262);
            method6391(this, var1 + 1, var2 - 1, 1, -601272575);
         }

         if (var4 == 3) {
            method6391(this, var1, var2, 64, -713800645);
            method6391(this, var1 - 1, var2 - 1, 4, -82842084);
         }
      }

      if (2 == var3) {
         if (0 == var4) {
            method6391(this, var1, var2, 130, 1247062773);
            method6391(this, var1 - 1, var2, 8, -518973777);
            method6391(this, var1, 1 + var2, 32, -288820181);
         }

         if (1 == var4) {
            method6391(this, var1, var2, 10, 1280365698);
            method6391(this, var1, 1 + var2, 32, 777904683);
            method6391(this, 1 + var1, var2, 128, 2065691455);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, 40, 492407531);
            method6391(this, 1 + var1, var2, 128, 2130116410);
            method6391(this, var1, var2 - 1, 2, -575222446);
         }

         if (var4 == 3) {
            method6391(this, var1, var2, 160, -1204911292);
            method6391(this, var1, var2 - 1, 2, -31405168);
            method6391(this, var1 - 1, var2, 8, -1142205571);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 65536, 1355397735);
               method6391(this, var1 - 1, var2, 4096, -732777183);
            }

            if (1 == var4) {
               method6391(this, var1, var2, 1024, -1201842815);
               method6391(this, var1, var2 + 1, 16384, 1720136534);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 4096, -352040773);
               method6391(this, var1 + 1, var2, 65536, -819203834);
            }

            if (3 == var4) {
               method6391(this, var1, var2, 16384, -210575754);
               method6391(this, var1, var2 - 1, 1024, -2110175326);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 512, 1532117737);
               method6391(this, var1 - 1, var2 + 1, 8192, 181043961);
            }

            if (1 == var4) {
               method6391(this, var1, var2, 2048, -839340940);
               method6391(this, 1 + var1, 1 + var2, 32768, 1480165896);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 8192, 1532606691);
               method6391(this, var1 + 1, var2 - 1, 512, -732281655);
            }

            if (var4 == 3) {
               method6391(this, var1, var2, 32768, 1448955857);
               method6391(this, var1 - 1, var2 - 1, 2048, 401903364);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 66560, 1818253799);
               method6391(this, var1 - 1, var2, 4096, -1816623077);
               method6391(this, var1, 1 + var2, 16384, -1433952971);
            }

            if (var4 == 1) {
               method6391(this, var1, var2, 5120, -640282656);
               method6391(this, var1, 1 + var2, 16384, -1514008958);
               method6391(this, 1 + var1, var2, 65536, -602062751);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 20480, 685565846);
               method6391(this, 1 + var1, var2, 65536, -1189432136);
               method6391(this, var1, var2 - 1, 1024, 1038144146);
            }

            if (var4 == 3) {
               method6391(this, var1, var2, 81920, -1258328867);
               method6391(this, var1, var2 - 1, 1024, 34896442);
               method6391(this, var1 - 1, var2, 4096, -1504633227);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;III)Z")
   @ObfuscatedName("sf")
   public static boolean method6388(CollisionMap var0, int var1, int var2, int var3) {
      return 0 != (var0.flags[var1][var2] & var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("nc")
   public void method6444() {
      method6382(this, -1769108229);
   }

   @ObfuscatedSignature(descriptor = "(Lkk;I)I")
   @ObfuscatedName("vb")
   public static int method6369(CollisionMap var0, int var1) {
      if (var0 == null) {
         return var0.method6370(var1);
      } else {
         try {
            return 504755687 * var0.xInset;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "kk.av(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bn")
   public void method6399(int var1, int var2, int var3) {
      this.setFlagOff(var1 - this.xInset * 504755687, var2 - this.yInset * -1751058007, var3, -1444149848);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZB)V")
   @ObfuscatedName("ai")
   void method6412(int var1, int var2, int var3, int var4, int var5, boolean var6, byte var7) {
      try {
         int var8 = 256;
         if (var6) {
            var8 += 131072;
         }

         label76: {
            var1 -= this.xInset * 504755687;
            var2 -= -1751058007 * this.yInset;
            if (var5 != 1) {
               if (var7 == 1) {
                  throw new IllegalStateException();
               }

               if (3 != var5) {
                  break label76;
               }

               if (var7 == 1) {
                  return;
               }
            }

            int var9 = var3;
            var3 = var4;
            var4 = var9;
         }

         for (int var14 = var1; var14 < var3 + var1; var14++) {
            if (var7 == 1) {
               throw new IllegalStateException();
            }

            if (var14 >= 0) {
               if (var7 == 1) {
                  return;
               }

               if (var14 < this.xSize * -1640107663) {
                  for (int var10 = var2; var10 < var2 + var4; var10++) {
                     if (var7 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var10 >= 0) {
                        if (var7 == 1) {
                           throw new IllegalStateException();
                        }

                        if (var10 < -67399471 * this.ySize) {
                           if (var7 == 1) {
                              throw new IllegalStateException();
                           }

                           method6391(this, var14, var10, var8, -1704659055);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "kk.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZ)V")
   @ObfuscatedName("cg")
   public void method6433(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = -1207776145;
      if (var6) {
         var7 += 131072;
      }

      var1 -= 504755687 * this.xInset;
      var2 -= this.yInset * -1751058007;
      if (1 == var5 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var1 + var3; var12++) {
         if (var12 >= 0 && var12 < this.xSize * -1640107663) {
            for (int var9 = var2; var9 < var2 + var4; var9++) {
               if (var9 >= 0 && var9 < this.ySize * -67399471) {
                  this.setFlagOff(var12, var9, var7, -1695447006);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cs")
   public void method6425(int var1, int var2) {
      var1 -= 504755687 * this.xInset;
      var2 -= -1751058007 * this.yInset;
      this.flags[var1][var2] = this.flags[var1][var2] | 262144;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bl")
   boolean method6407(int var1, int var2) {
      return var1 >= 1 && var1 < -1640107663 * this.xSize - 5 && var2 >= 1 && var2 < this.ySize * -67399471 - 5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;IIIIIZ)V")
   @ObfuscatedName("bs")
   public static void method6434(CollisionMap var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var0 == null) {
         var0.method6375(var1);
      }

      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= 504755687 * var0.xInset;
      var2 -= var0.yInset * -1751058007;
      if (1 == var5 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var1 + var3; var12++) {
         if (var12 >= 0 && var12 < var0.xSize * -1640107663) {
            for (int var9 = var2; var9 < var2 + var4; var9++) {
               if (var9 >= 0 && var9 < var0.ySize * -67399471) {
                  var0.setFlagOff(var12, var9, var7, -524988506);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bp")
   boolean method6389(int var1, int var2, int var3) {
      return 0 != (this.flags[var1][var2] & var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;IIIIZ)V")
   @ObfuscatedName("tm")
   public static void method6429(CollisionMap var0, int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= -789136894 * var0.xInset;
      var2 -= var0.yInset * -609283014;
      if (0 == var3) {
         if (var4 == 0) {
            var0.setFlagOff(var1, var2, 352337560, -786779393);
            var0.setFlagOff(var1 - 1, var2, 8, -2071034365);
         }

         if (var4 == 1) {
            var0.setFlagOff(var1, var2, 2, -1843272368);
            var0.setFlagOff(var1, var2 + 1, 32, -1906267672);
         }

         if (var4 == 2) {
            var0.setFlagOff(var1, var2, 8, -852076205);
            var0.setFlagOff(1 + var1, var2, 128, -1459616850);
         }

         if (var4 == 3) {
            var0.setFlagOff(var1, var2, 1800503339, -609920569);
            var0.setFlagOff(var1, var2 - 1, 2, -1271934981);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            var0.setFlagOff(var1, var2, 1, -1170747673);
            var0.setFlagOff(var1 - 1, var2 + 1, 16, -1737293086);
         }

         if (1 == var4) {
            var0.setFlagOff(var1, var2, 4, -1573141616);
            var0.setFlagOff(1 + var1, var2 + 1, 64, -544354740);
         }

         if (2 == var4) {
            var0.setFlagOff(var1, var2, 16, -332893515);
            var0.setFlagOff(1 + var1, var2 - 1, 1, -1069443471);
         }

         if (var4 == 3) {
            var0.setFlagOff(var1, var2, 64, -990098079);
            var0.setFlagOff(var1 - 1, var2 - 1, 4, -890896830);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            var0.setFlagOff(var1, var2, 1974297527, -1150890415);
            var0.setFlagOff(var1 - 1, var2, 8, -954324336);
            var0.setFlagOff(var1, var2 + 1, 32, -1457237395);
         }

         if (1 == var4) {
            var0.setFlagOff(var1, var2, 10, -1846353709);
            var0.setFlagOff(var1, 1 + var2, 196454977, -1509192505);
            var0.setFlagOff(var1 + 1, var2, 128, -412349167);
         }

         if (var4 == 2) {
            var0.setFlagOff(var1, var2, 40, -1704290939);
            var0.setFlagOff(1 + var1, var2, -47574886, -1040762065);
            var0.setFlagOff(var1, var2 - 1, 2, -385344586);
         }

         if (3 == var4) {
            var0.setFlagOff(var1, var2, 160, -1710713411);
            var0.setFlagOff(var1, var2 - 1, 2, -310992134);
            var0.setFlagOff(var1 - 1, var2, 8, -447493402);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (0 == var4) {
               var0.setFlagOff(var1, var2, 65536, -897540702);
               var0.setFlagOff(var1 - 1, var2, -951292295, -2057907075);
            }

            if (var4 == 1) {
               var0.setFlagOff(var1, var2, 1024, -1802028284);
               var0.setFlagOff(var1, 1 + var2, 336157350, -1281083304);
            }

            if (2 == var4) {
               var0.setFlagOff(var1, var2, 4096, -837948151);
               var0.setFlagOff(1 + var1, var2, 65536, -1851789633);
            }

            if (3 == var4) {
               var0.setFlagOff(var1, var2, -714714577, -690746039);
               var0.setFlagOff(var1, var2 - 1, 485449311, -390540385);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (var4 == 0) {
               var0.setFlagOff(var1, var2, 512, -552743103);
               var0.setFlagOff(var1 - 1, 1 + var2, -1285388878, -1780657793);
            }

            if (1 == var4) {
               var0.setFlagOff(var1, var2, 716668712, -986625887);
               var0.setFlagOff(var1 + 1, 1 + var2, 32768, -1724309088);
            }

            if (var4 == 2) {
               var0.setFlagOff(var1, var2, 8192, -2022044740);
               var0.setFlagOff(var1 + 1, var2 - 1, 512, -1797952095);
            }

            if (var4 == 3) {
               var0.setFlagOff(var1, var2, -1039074772, -1073168907);
               var0.setFlagOff(var1 - 1, var2 - 1, -10819077, -1203798331);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               var0.setFlagOff(var1, var2, 66560, -1606716406);
               var0.setFlagOff(var1 - 1, var2, 274500491, -670763151);
               var0.setFlagOff(var1, 1 + var2, 1820891678, -699088980);
            }

            if (var4 == 1) {
               var0.setFlagOff(var1, var2, 5120, -1860290134);
               var0.setFlagOff(var1, var2 + 1, 16384, -1220819772);
               var0.setFlagOff(1 + var1, var2, 569151665, -1535700682);
            }

            if (var4 == 2) {
               var0.setFlagOff(var1, var2, 20480, -397111039);
               var0.setFlagOff(1 + var1, var2, 65536, -879105568);
               var0.setFlagOff(var1, var2 - 1, -1276169017, -706781373);
            }

            if (3 == var4) {
               var0.setFlagOff(var1, var2, 81920, -1003275754);
               var0.setFlagOff(var1, var2 - 1, 1024, -1741404738);
               var0.setFlagOff(var1 - 1, var2, 4096, -1124741049);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bz")
   final void method6380(int var1, int var2, int var3, int var4) {
      this.xInset = 396905943 * var1;
      this.yInset = 150607563 * var2;
      this.xSize = -1514229871 * var3;
      this.ySize = var4 * 1993719247;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("bx")
   public void method6410(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 1373781536 * this.xInset;
      var2 -= this.yInset * -472142402;
      if (var3 == 0) {
         if (var4 == 0) {
            method6391(this, var1, var2, 128, 1383425576);
            method6391(this, var1 - 1, var2, 8, -548506515);
         }

         if (1 == var4) {
            method6391(this, var1, var2, 2, -1616938775);
            method6391(this, var1, var2 + 1, 32, -362325701);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, 8, 1162159821);
            method6391(this, 1 + var1, var2, 128, 2107510433);
         }

         if (3 == var4) {
            method6391(this, var1, var2, 24813668, -1229310921);
            method6391(this, var1, var2 - 1, 2, 1507331299);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (var4 == 0) {
            method6391(this, var1, var2, 1, -2065848961);
            method6391(this, var1 - 1, 1 + var2, 16, 242719173);
         }

         if (var4 == 1) {
            method6391(this, var1, var2, 4, -995776186);
            method6391(this, 1 + var1, 1 + var2, 64, -1645870253);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, 16, 1075697598);
            method6391(this, var1 + 1, var2 - 1, 1, -2108377156);
         }

         if (var4 == 3) {
            method6391(this, var1, var2, 1185102329, 579344125);
            method6391(this, var1 - 1, var2 - 1, 4, 1847986710);
         }
      }

      if (2 == var3) {
         if (0 == var4) {
            method6391(this, var1, var2, 130, 151352405);
            method6391(this, var1 - 1, var2, 8, 2007725112);
            method6391(this, var1, 1 + var2, 32, 1345405588);
         }

         if (1 == var4) {
            method6391(this, var1, var2, 10, -1695275642);
            method6391(this, var1, 1 + var2, 211737970, 829279587);
            method6391(this, 1 + var1, var2, -1101604156, 994291389);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, -731872995, 759624080);
            method6391(this, 1 + var1, var2, 730071656, -42624307);
            method6391(this, var1, var2 - 1, 2, 272886362);
         }

         if (var4 == 3) {
            method6391(this, var1, var2, -1076306801, 839894173);
            method6391(this, var1, var2 - 1, 2, -1715035193);
            method6391(this, var1 - 1, var2, 8, 504510949);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 65536, -970202637);
               method6391(this, var1 - 1, var2, 4096, -1582269702);
            }

            if (1 == var4) {
               method6391(this, var1, var2, -1078638139, -1690006176);
               method6391(this, var1, var2 + 1, 16384, -1324554341);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 4096, 225801282);
               method6391(this, var1 + 1, var2, 65536, 1238116551);
            }

            if (3 == var4) {
               method6391(this, var1, var2, -1399653904, 1766838483);
               method6391(this, var1, var2 - 1, 2118177383, 1440966535);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 512, 910812323);
               method6391(this, var1 - 1, var2 + 1, 8192, 1566646470);
            }

            if (1 == var4) {
               method6391(this, var1, var2, 1989634922, -1469843227);
               method6391(this, 1 + var1, 1 + var2, 1652292471, -216177131);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 8192, -1527049276);
               method6391(this, var1 + 1, var2 - 1, 512, 674978697);
            }

            if (var4 == 3) {
               method6391(this, var1, var2, 32768, -1613778259);
               method6391(this, var1 - 1, var2 - 1, 2048, -1791835520);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 66560, -44312157);
               method6391(this, var1 - 1, var2, 4096, 162881908);
               method6391(this, var1, 1 + var2, 879335136, 1543030673);
            }

            if (var4 == 1) {
               method6391(this, var1, var2, 5120, -466544432);
               method6391(this, var1, 1 + var2, 636307523, -1693868143);
               method6391(this, 1 + var1, var2, 1499071373, 1793881273);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 20480, 1936021320);
               method6391(this, 1 + var1, var2, -1411670141, 281578464);
               method6391(this, var1, var2 - 1, 1024, 193935915);
            }

            if (var4 == 3) {
               method6391(this, var1, var2, -1888049932, -208667815);
               method6391(this, var1, var2 - 1, 22046289, -1980608040);
               method6391(this, var1 - 1, var2, 4096, -2040017058);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZ)V")
   @ObfuscatedName("bv")
   void method6413(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.xInset * 504755687;
      var2 -= -1751058007 * this.yInset;
      if (var5 == 1 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var3 + var1; var12++) {
         if (var12 >= 0 && var12 < this.xSize * -1640107663) {
            for (int var9 = var2; var9 < var2 + var4; var9++) {
               if (var9 >= 0 && var9 < -67399471 * this.ySize) {
                  method6391(this, var12, var9, var7, -196541600);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZ)V")
   @ObfuscatedName("ch")
   void method6414(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.xInset * 504755687;
      var2 -= -1751058007 * this.yInset;
      if (var5 == 1 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var3 + var1; var12++) {
         if (var12 >= 0 && var12 < this.xSize * -1640107663) {
            for (int var9 = var2; var9 < var2 + var4; var9++) {
               if (var9 >= 0 && var9 < -67399471 * this.ySize) {
                  method6391(this, var12, var9, var7, 2104764712);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkk;IIB)V")
   @ObfuscatedName("dh")
   public static void method6439(CollisionMap var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method6440(var1, var1, var3);
      } else {
         try {
            var1 -= 504755687 * var0.xInset;
            var2 -= -1751058007 * var0.yInset;
            var0.flags[var1][var2] = var0.flags[var1][var2] & -262145;
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "kk.ah(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("jn")
   public void method6445(int var1, int var2) {
      this.setBlockedByFloor(var1, var2, (byte)-113);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("ce")
   public void method6415(int var1, int var2, int var3, int var4, boolean var5) {
      this.method6412(var1, var2, var3, var4, 0, var5, (byte)29);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("cu")
   public void method6416(int var1, int var2, int var3, int var4, boolean var5) {
      this.method6412(var1, var2, var3, var4, 0, var5, (byte)-35);
   }

   @ObfuscatedSignature(descriptor = "(Lkk;IIIIIZB)V")
   @ObfuscatedName("ja")
   public static void method6435(CollisionMap var0, int var1, int var2, int var3, int var4, int var5, boolean var6, byte var7) {
      if (var0 == null) {
         var0.setFlagOffNonSquare(var1, var1, var1, var1, var1, var6, var7);
      } else {
         try {
            int var8 = 256;
            if (var6) {
               if (var7 <= 4) {
                  throw new IllegalStateException();
               }

               var8 += 131072;
            }

            label78: {
               var1 -= 504755687 * var0.xInset;
               var2 -= var0.yInset * -1751058007;
               if (1 != var5) {
                  if (var7 <= 4) {
                     return;
                  }

                  if (3 != var5) {
                     break label78;
                  }
               }

               int var9 = var3;
               var3 = var4;
               var4 = var9;
            }

            for (int var14 = var1; var14 < var1 + var3; var14++) {
               if (var7 <= 4) {
                  throw new IllegalStateException();
               }

               if (var14 >= 0) {
                  if (var7 <= 4) {
                     throw new IllegalStateException();
                  }

                  if (var14 < var0.xSize * -1640107663) {
                     if (var7 <= 4) {
                        return;
                     }

                     for (int var10 = var2; var10 < var2 + var4; var10++) {
                        if (var10 >= 0 && var10 < var0.ySize * -67399471) {
                           if (var7 <= 4) {
                              throw new IllegalStateException();
                           }

                           var0.setFlagOff(var14, var10, var8, -857380182);
                        }
                     }
                  }
               }
            }
         } catch (RuntimeException var11) {
            throw RestClientThreadFactory.newRunException(var11, "kk.ar(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cx")
   public void method6446(int var1, int var2) {
      this.setBlockedByFloorDec(var1, var2, (byte)11);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ct")
   public void method6419(int var1, int var2) {
      var1 -= this.xInset * 504755687;
      var2 -= this.yInset * -480919249;
      this.flags[var1][var2] = this.flags[var1][var2] | -518439939;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cm")
   public void method6420(int var1, int var2) {
      var1 -= this.xInset * 504755687;
      var2 -= this.yInset * -1751058007;
      this.flags[var1][var2] = this.flags[var1][var2] | 2097152;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cb")
   public void method6421(int var1, int var2) {
      var1 -= this.xInset * 504755687;
      var2 -= this.yInset * -1751058007;
      this.flags[var1][var2] = this.flags[var1][var2] | 2097152;
   }

   @ObfuscatedSignature(descriptor = "(Lkk;IIIIZI)V")
   @ObfuscatedName("mp")
   public static void method6417(CollisionMap var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      if (var0 == null) {
         var0.method6431(var1, var1, var1, var1, var5, var1);
      }

      try {
         var0.method6412(var1, var2, var3, var4, 0, var5, (byte)55);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "kk.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkk;S)I")
   @ObfuscatedName("dm")
   public static int method6373(CollisionMap var0, short var1) {
      if (var0 == null) {
         var0.method6374(var1);
      }

      try {
         return -1751058007 * var0.yInset;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kk.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;III)V")
   @ObfuscatedName("oi")
   public static void method6397(CollisionMap var0, int var1, int var2, int var3) {
      var0.flags[var1][var2] = var0.flags[var1][var2] & ~var3;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ck")
   public void method6422(int var1, int var2) {
      var1 -= this.xInset * 504755687;
      var2 -= this.yInset * -1751058007;
      this.flags[var1][var2] = this.flags[var1][var2] | 2097152;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("bq")
   public void method6411(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 504755687 * this.xInset;
      var2 -= this.yInset * -1751058007;
      if (var3 == 0) {
         if (var4 == 0) {
            method6391(this, var1, var2, 128, -1418342585);
            method6391(this, var1 - 1, var2, 8, 794608290);
         }

         if (1 == var4) {
            method6391(this, var1, var2, 2, 4215479);
            method6391(this, var1, var2 + 1, 32, 556937426);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, 8, 304854303);
            method6391(this, 1 + var1, var2, 128, -1198745967);
         }

         if (3 == var4) {
            method6391(this, var1, var2, 32, 2087918326);
            method6391(this, var1, var2 - 1, 2, 897096793);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (var4 == 0) {
            method6391(this, var1, var2, 1, 577394152);
            method6391(this, var1 - 1, 1 + var2, 16, -1731852449);
         }

         if (var4 == 1) {
            method6391(this, var1, var2, 4, 1097556778);
            method6391(this, 1 + var1, 1 + var2, 64, -480270235);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, 16, -1455718717);
            method6391(this, var1 + 1, var2 - 1, 1, -1467914355);
         }

         if (var4 == 3) {
            method6391(this, var1, var2, 64, 2125208541);
            method6391(this, var1 - 1, var2 - 1, 4, -1989067486);
         }
      }

      if (2 == var3) {
         if (0 == var4) {
            method6391(this, var1, var2, 130, -1036971493);
            method6391(this, var1 - 1, var2, 8, -2065897619);
            method6391(this, var1, 1 + var2, 32, -194359325);
         }

         if (1 == var4) {
            method6391(this, var1, var2, 10, -229954169);
            method6391(this, var1, 1 + var2, 32, -231448143);
            method6391(this, 1 + var1, var2, 128, 1747746595);
         }

         if (var4 == 2) {
            method6391(this, var1, var2, 40, 632823396);
            method6391(this, 1 + var1, var2, 128, 1443086690);
            method6391(this, var1, var2 - 1, 2, 1730594961);
         }

         if (var4 == 3) {
            method6391(this, var1, var2, 160, 1222449313);
            method6391(this, var1, var2 - 1, 2, -1554713386);
            method6391(this, var1 - 1, var2, 8, -338329781);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 65536, 758875421);
               method6391(this, var1 - 1, var2, 4096, -36505176);
            }

            if (1 == var4) {
               method6391(this, var1, var2, 1024, 1720387837);
               method6391(this, var1, var2 + 1, 16384, -1782958418);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 4096, 1609749249);
               method6391(this, var1 + 1, var2, 65536, -462721588);
            }

            if (3 == var4) {
               method6391(this, var1, var2, 16384, -1199435020);
               method6391(this, var1, var2 - 1, 1024, -1130542652);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 512, 832455996);
               method6391(this, var1 - 1, var2 + 1, 8192, -515264400);
            }

            if (1 == var4) {
               method6391(this, var1, var2, 2048, 1198475039);
               method6391(this, 1 + var1, 1 + var2, 32768, -1597163623);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 8192, 425091100);
               method6391(this, var1 + 1, var2 - 1, 512, -1843980603);
            }

            if (var4 == 3) {
               method6391(this, var1, var2, 32768, -804614091);
               method6391(this, var1 - 1, var2 - 1, 2048, 794060296);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               method6391(this, var1, var2, 66560, -1941343424);
               method6391(this, var1 - 1, var2, 4096, 593394127);
               method6391(this, var1, 1 + var2, 16384, 649136444);
            }

            if (var4 == 1) {
               method6391(this, var1, var2, 5120, -639554632);
               method6391(this, var1, 1 + var2, 16384, 1548465047);
               method6391(this, 1 + var1, var2, 65536, 2058018911);
            }

            if (2 == var4) {
               method6391(this, var1, var2, 20480, 1889318795);
               method6391(this, 1 + var1, var2, 65536, -68871640);
               method6391(this, var1, var2 - 1, 1024, 714118496);
            }

            if (var4 == 3) {
               method6391(this, var1, var2, 81920, 1108437272);
               method6391(this, var1, var2 - 1, 1024, 43615431);
               method6391(this, var1 - 1, var2, 4096, 76777376);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("as")
   public void method6400(int var1, int var2, int var3) {
      this.setFlagOff(var1 - this.xInset * 504755687, var2 - this.yInset * -1751058007, var3, -1337198029);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   public void method6384() {
      for (int var1 = 0; var1 < -1640107663 * this.xSize; var1++) {
         for (int var2 = 0; var2 < -67399471 * this.ySize; var2++) {
            if (var1 >= 1 && var2 >= 1 && var1 < this.xSize * -1640107663 - 5 && var2 < this.ySize * -67399471 - 5) {
               this.flags[var1][var2] = 1073741824;
            } else {
               this.flags[var1][var2] = 16777215;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bd")
   public boolean method6403(int var1, int var2) {
      return this.method6405(var1 - this.xInset * 504755687, var2 - this.yInset * -1364769717, 554339037);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZI)I")
   @ObfuscatedName("aj")
   static int method6404(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2) {
            if (var3 >= -149915699) {
               throw new IllegalStateException();
            }

            if (var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();
               int var8 = 0;

               while (true) {
                  if (var8 >= var7) {
                     if (!var5) {
                        if (var3 >= -149915699) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     return var6;
                  }

                  if (var3 >= -149915699) {
                     throw new IllegalStateException();
                  }

                  label145: {
                     int var9 = var0.charAt(var8);
                     if (var8 == 0) {
                        if (var3 >= -149915699) {
                           throw new IllegalStateException();
                        }

                        if (45 == var9) {
                           if (var3 >= -149915699) {
                              throw new IllegalStateException();
                           }

                           var4 = true;
                           break label145;
                        }

                        if (43 == var9) {
                           if (var3 >= -149915699) {
                              throw new IllegalStateException();
                           }

                           if (var2) {
                              if (var3 >= -149915699) {
                                 throw new IllegalStateException();
                              }
                              break label145;
                           }
                        }
                     }

                     if (var9 >= 48 && var9 <= 57) {
                        if (var3 >= -149915699) {
                           throw new IllegalStateException();
                        }

                        var9 -= 48;
                     } else {
                        label144: {
                           if (var9 >= 65) {
                              if (var3 >= -149915699) {
                                 throw new IllegalStateException();
                              }

                              if (var9 <= 90) {
                                 if (var3 >= -149915699) {
                                    throw new IllegalStateException();
                                 }

                                 var9 -= 55;
                                 break label144;
                              }
                           }

                           if (var9 < 97) {
                              break;
                           }

                           if (var3 >= -149915699) {
                              throw new IllegalStateException();
                           }

                           if (var9 > 122) {
                              break;
                           }

                           if (var3 >= -149915699) {
                              throw new IllegalStateException();
                           }

                           var9 -= 87;
                        }
                     }

                     if (var9 >= var1) {
                        throw new NumberFormatException();
                     }

                     if (var4) {
                        if (var3 >= -149915699) {
                           throw new IllegalStateException();
                        }

                        var9 = -var9;
                     }

                     int var10 = var9 + var1 * var6;
                     if (var10 / var1 != var6) {
                        if (var3 >= -149915699) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     var6 = var10;
                     var5 = true;
                  }

                  var8++;
               }

               throw new NumberFormatException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "kk.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("at")
   int method6374(short var1) {
      try {
         return -1751058007 * this.xSize;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kk.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   public void clear(int var1) {
      try {
         for (int var2 = 0; var2 < -1640107663 * this.xSize; var2++) {
            for (int var3 = 0; var3 < -67399471 * this.xSize; var3++) {
               if (var1 == 1164283646) {
                  throw new IllegalStateException();
               }

               if (var2 >= 1) {
                  if (var1 == 1164283646) {
                     return;
                  }

                  if (var3 >= 1) {
                     if (var1 == 1164283646) {
                        throw new IllegalStateException();
                     }

                     if (var2 < this.xInset * -1640107663 - 5) {
                        if (var1 == 1164283646) {
                           throw new IllegalStateException();
                        }

                        if (var3 < this.xSize * -67399471 - 5) {
                           this.flags[var2][var3] = 1073741824;
                           continue;
                        }

                        if (var1 == 1164283646) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               this.flags[var2][var3] = 16777215;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kk.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cj")
   public boolean method6447(int var1, int var2) {
      return this.method6401(var1, var2, -365810060);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;IIIIIZ)V")
   @ObfuscatedName("it")
   public static void method6436(CollisionMap var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var0 == null) {
         var0.method6447(var1, var1);
      }

      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= 504755687 * var0.xInset;
      var2 -= var0.yInset * -1751058007;
      if (1 == var5 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var1 + var3; var12++) {
         if (var12 >= 0 && var12 < var0.xSize * -1640107663) {
            for (int var9 = var2; var9 < var2 + var4; var9++) {
               if (var9 >= 0 && var9 < var0.ySize * 2101689345) {
                  var0.setFlagOff(var12, var9, var7, -1376153500);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZI)V")
   @ObfuscatedName("as")
   public void addGameObject(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= 504755687 * this.ySize;
         var2 -= this.xSize * -1751058007;
         if (0 == var3) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 128, -1479251122);
               this.setFlagOff(var1 - 1, var2, 8, -1107050550);
            }

            if (var4 == 1) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 2, -990713408);
               this.setFlagOff(var1, var2 + 1, 32, -2019447935);
            }

            if (var4 == 2) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 8, -1221479105);
               this.setFlagOff(1 + var1, var2, 128, -1587441347);
            }

            if (var4 == 3) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 32, -1857854102);
               this.setFlagOff(var1, var2 - 1, 2, -1689901154);
            }
         }

         label263: {
            if (1 != var3) {
               if (3 != var3) {
                  break label263;
               }

               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }
            }

            if (0 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 1, -326850532);
               this.setFlagOff(var1 - 1, var2 + 1, 16, -961841252);
            }

            if (1 == var4) {
               this.setFlagOff(var1, var2, 4, -1509485295);
               this.setFlagOff(1 + var1, var2 + 1, 64, -1481967305);
            }

            if (2 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 16, -2025328439);
               this.setFlagOff(1 + var1, var2 - 1, 1, -1275351106);
            }

            if (var4 == 3) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 64, -1600964191);
               this.setFlagOff(var1 - 1, var2 - 1, 4, -437129079);
            }
         }

         if (var3 == 2) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 130, -2082664926);
               this.setFlagOff(var1 - 1, var2, 8, -1155290597);
               this.setFlagOff(var1, var2 + 1, 32, -1413240828);
            }

            if (1 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 10, -1950044243);
               this.setFlagOff(var1, 1 + var2, 32, -1835092703);
               this.setFlagOff(var1 + 1, var2, 128, -385263561);
            }

            if (var4 == 2) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 40, -494556912);
               this.setFlagOff(1 + var1, var2, 128, -1250194228);
               this.setFlagOff(var1, var2 - 1, 2, -1821116829);
            }

            if (3 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 160, -1773760926);
               this.setFlagOff(var1, var2 - 1, 2, -1766940343);
               this.setFlagOff(var1 - 1, var2, 8, -1458790212);
            }
         }

         if (var5) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var3 == 0) {
               if (var6 == 1327475339) {
                  return;
               }

               if (0 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 65536, -920987826);
                  this.setFlagOff(var1 - 1, var2, 4096, -833617265);
               }

               if (var4 == 1) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 1024, -1100257220);
                  this.setFlagOff(var1, 1 + var2, 16384, -1586227168);
               }

               if (2 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 4096, -458013589);
                  this.setFlagOff(1 + var1, var2, 65536, -817317818);
               }

               if (3 == var4) {
                  if (var6 == 1327475339) {
                     return;
                  }

                  this.setFlagOff(var1, var2, 16384, -1474736942);
                  this.setFlagOff(var1, var2 - 1, 1024, -1934758939);
               }
            }

            label267: {
               if (1 != var3) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  if (var3 != 3) {
                     break label267;
                  }
               }

               if (var4 == 0) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 512, -889368794);
                  this.setFlagOff(var1 - 1, 1 + var2, 8192, -512579983);
               }

               if (1 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 2048, -625808937);
                  this.setFlagOff(var1 + 1, 1 + var2, 32768, -1109391252);
               }

               if (var4 == 2) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 8192, -933378014);
                  this.setFlagOff(var1 + 1, var2 - 1, 512, -1547032559);
               }

               if (var4 == 3) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 32768, -858984353);
                  this.setFlagOff(var1 - 1, var2 - 1, 2048, -1895694685);
               }
            }

            if (2 == var3) {
               if (var4 == 0) {
                  this.setFlagOff(var1, var2, 66560, -2141722815);
                  this.setFlagOff(var1 - 1, var2, 4096, -1438188439);
                  this.setFlagOff(var1, 1 + var2, 16384, -1771431626);
               }

               if (var4 == 1) {
                  if (var6 == 1327475339) {
                     return;
                  }

                  this.setFlagOff(var1, var2, 5120, -2045399584);
                  this.setFlagOff(var1, var2 + 1, 16384, -876574871);
                  this.setFlagOff(1 + var1, var2, 65536, -1197506781);
               }

               if (var4 == 2) {
                  this.setFlagOff(var1, var2, 20480, -566984926);
                  this.setFlagOff(1 + var1, var2, 65536, -550276816);
                  this.setFlagOff(var1, var2 - 1, 1024, -1625813221);
               }

               if (3 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 81920, -2116569954);
                  this.setFlagOff(var1, var2 - 1, 1024, -1079889797);
                  this.setFlagOff(var1 - 1, var2, 4096, -1691008348);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "kk.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZB)V")
   @ObfuscatedName("ar")
   public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6, byte var7) {
      try {
         int var8 = 256;
         if (var6) {
            if (var7 <= 4) {
               throw new IllegalStateException();
            }

            var8 += 131072;
         }

         label76: {
            var1 -= 504755687 * this.ySize;
            var2 -= this.ySize * -1751058007;
            if (1 != var5) {
               if (var7 <= 4) {
                  return;
               }

               if (3 != var5) {
                  break label76;
               }
            }

            int var9 = var3;
            var3 = var4;
            var4 = var9;
         }

         for (int var14 = var1; var14 < var1 + var3; var14++) {
            if (var7 <= 4) {
               throw new IllegalStateException();
            }

            if (var14 >= 0) {
               if (var7 <= 4) {
                  throw new IllegalStateException();
               }

               if (var14 < this.xSize * -1640107663) {
                  if (var7 <= 4) {
                     return;
                  }

                  for (int var10 = var2; var10 < var2 + var4; var10++) {
                     if (var10 >= 0 && var10 < this.ySize * -67399471) {
                        if (var7 <= 4) {
                           throw new IllegalStateException();
                        }

                        this.setFlagOff(var14, var10, var8, -857380182);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "kk.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ah")
   public void method6440(int var1, int var2, byte var3) {
      try {
         var1 -= 504755687 * this.yInset;
         var2 -= -1751058007 * this.xSize;
         this.flags[var1][var2] = this.flags[var1][var2] & -262145;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kk.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   int method6370(int var1) {
      try {
         return 504755687 * this.xInset;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kk.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ap")
   void setFlag(int var1, int var2, int var3, int var4) {
      try {
         this.flags[var1][var2] = this.flags[var1][var2] | var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kk.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZI)V")
   @ObfuscatedName("ax")
   public void method6431(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= 504755687 * this.ySize;
         var2 -= this.ySize * -1751058007;
         if (0 == var3) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 128, -1479251122);
               this.setFlag(var1 - 1, var2, 8, -1107050550);
            }

            if (var4 == 1) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 2, -990713408);
               this.setFlagOff(var1, var2 + 1, 32, -2019447935);
            }

            if (var4 == 2) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 8, -1221479105);
               this.setFlag(1 + var1, var2, 128, -1587441347);
            }

            if (var4 == 3) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 32, -1857854102);
               this.setFlagOff(var1, var2 - 1, 2, -1689901154);
            }
         }

         label263: {
            if (1 != var3) {
               if (3 != var3) {
                  break label263;
               }

               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }
            }

            if (0 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlag(var1, var2, 1, -326850532);
               this.setFlag(var1 - 1, var2 + 1, 16, -961841252);
            }

            if (1 == var4) {
               this.setFlag(var1, var2, 4, -1509485295);
               this.setFlag(1 + var1, var2 + 1, 64, -1481967305);
            }

            if (2 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 16, -2025328439);
               this.setFlag(1 + var1, var2 - 1, 1, -1275351106);
            }

            if (var4 == 3) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 64, -1600964191);
               this.setFlagOff(var1 - 1, var2 - 1, 4, -437129079);
            }
         }

         if (var3 == 2) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlag(var1, var2, 130, -2082664926);
               this.setFlag(var1 - 1, var2, 8, -1155290597);
               this.setFlag(var1, var2 + 1, 32, -1413240828);
            }

            if (1 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlag(var1, var2, 10, -1950044243);
               this.setFlagOff(var1, 1 + var2, 32, -1835092703);
               this.setFlag(var1 + 1, var2, 128, -385263561);
            }

            if (var4 == 2) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 40, -494556912);
               this.setFlagOff(1 + var1, var2, 128, -1250194228);
               this.setFlagOff(var1, var2 - 1, 2, -1821116829);
            }

            if (3 == var4) {
               if (var6 == 1327475339) {
                  throw new IllegalStateException();
               }

               this.setFlagOff(var1, var2, 160, -1773760926);
               this.setFlagOff(var1, var2 - 1, 2, -1766940343);
               this.setFlag(var1 - 1, var2, 8, -1458790212);
            }
         }

         if (var5) {
            if (var6 == 1327475339) {
               throw new IllegalStateException();
            }

            if (var3 == 0) {
               if (var6 == 1327475339) {
                  return;
               }

               if (0 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlag(var1, var2, 65536, -920987826);
                  this.setFlag(var1 - 1, var2, 4096, -833617265);
               }

               if (var4 == 1) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlag(var1, var2, 1024, -1100257220);
                  this.setFlag(var1, 1 + var2, 16384, -1586227168);
               }

               if (2 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 4096, -458013589);
                  this.setFlagOff(1 + var1, var2, 65536, -817317818);
               }

               if (3 == var4) {
                  if (var6 == 1327475339) {
                     return;
                  }

                  this.setFlagOff(var1, var2, 16384, -1474736942);
                  this.setFlag(var1, var2 - 1, 1024, -1934758939);
               }
            }

            label267: {
               if (1 != var3) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  if (var3 != 3) {
                     break label267;
                  }
               }

               if (var4 == 0) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 512, -889368794);
                  this.setFlagOff(var1 - 1, 1 + var2, 8192, -512579983);
               }

               if (1 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlag(var1, var2, 2048, -625808937);
                  this.setFlagOff(var1 + 1, 1 + var2, 32768, -1109391252);
               }

               if (var4 == 2) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlag(var1, var2, 8192, -933378014);
                  this.setFlag(var1 + 1, var2 - 1, 512, -1547032559);
               }

               if (var4 == 3) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlagOff(var1, var2, 32768, -858984353);
                  this.setFlagOff(var1 - 1, var2 - 1, 2048, -1895694685);
               }
            }

            if (2 == var3) {
               if (var4 == 0) {
                  this.setFlagOff(var1, var2, 66560, -2141722815);
                  this.setFlag(var1 - 1, var2, 4096, -1438188439);
                  this.setFlag(var1, 1 + var2, 16384, -1771431626);
               }

               if (var4 == 1) {
                  if (var6 == 1327475339) {
                     return;
                  }

                  this.setFlagOff(var1, var2, 5120, -2045399584);
                  this.setFlagOff(var1, var2 + 1, 16384, -876574871);
                  this.setFlag(1 + var1, var2, 65536, -1197506781);
               }

               if (var4 == 2) {
                  this.setFlagOff(var1, var2, 20480, -566984926);
                  this.setFlag(1 + var1, var2, 65536, -550276816);
                  this.setFlag(var1, var2 - 1, 1024, -1625813221);
               }

               if (3 == var4) {
                  if (var6 == 1327475339) {
                     throw new IllegalStateException();
                  }

                  this.setFlag(var1, var2, 81920, -2116569954);
                  this.setFlagOff(var1, var2 - 1, 1024, -1079889797);
                  this.setFlagOff(var1 - 1, var2, 4096, -1691008348);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "kk.ax(" + ')');
      }
   }
}
