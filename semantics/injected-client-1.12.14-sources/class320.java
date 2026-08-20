import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mb")
public abstract class class320 implements classMK {
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field3819 = 29;
   @ObfuscatedSignature(descriptor = "Lbd;")
   @ObfuscatedName("ib")
   public static FriendSystem friendSystem;
   @ObfuscatedName("ap")
   public static byte[][] SpriteBuffer_pixels;
   @ObfuscatedName("av")
   protected int field3818;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkm;)I")
   @ObfuscatedName("nu")
   public static int method7363(classKM var0) {
      return var0.field3369 * 141723969;
   }

   @ObfuscatedSignature(descriptor = "(DDII)[D")
   @ObfuscatedName("av")
   public static double[] method7359(double var0, double var2, int var4, int var5) {
      try {
         int var6 = 2 * var4 + 1;
         double[] var7 = new double[var6];
         int var8 = -var4;

         for (int var9 = 0; var8 <= var4; var9++) {
            double var16 = (var8 - var0) / var2;
            double var14 = Math.exp(var16 * -var16 / 2.0) / Math.sqrt(Math.PI * 2);
            double var12 = var14 / var2;
            var7[var9] = var12;
            var8++;
         }

         return var7;
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "mb.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILwp;I)Z")
   @ObfuscatedName("av")
   public static boolean method7360(int var0, class594 var1, int var2) {
      try {
         boolean var10000;
         if ((var0 & var1.rsOrdinal((byte)91)) != 0) {
            if (var2 >= -506763349) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "mb.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("cd")
   public static void method7364(PacketBuffer var0) {
      if (var0 == null) {
         var0.method12328();
      }

      var0.bitIndex = var0.offset * -1840678392;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ag")
   static int method7362(int var0, int var1, int var2) {
      try {
         ItemContainer var3 = (ItemContainer)ItemContainer.itemContainers.method8915(var0);
         if (null == var3) {
            if (var2 != 1876982269) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if (var1 == -1) {
            if (var2 != 1876982269) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var4 = 0;

            for (int var5 = 0; var5 < var3.quantities.length; var5++) {
               if (var2 != 1876982269) {
                  throw new IllegalStateException();
               }

               if (var1 == var3.ids[var5]) {
                  if (var2 != 1876982269) {
                     throw new IllegalStateException();
                  }

                  var4 += var3.quantities[var5];
               }
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "mb.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;III)I")
   @ObfuscatedName("an")
   public static int method7365(DynamicArray var0, Object var1, int var2, int var3, int var4) {
      try {
         if (var2 < 0) {
            if (var4 >= -1507638435) {
               throw new IllegalStateException();
            }

            var2 = 0;
         }

         label119: {
            if (var3 >= 0) {
               if (var4 >= -1507638435) {
                  throw new IllegalStateException();
               }

               if (var3 <= var0.method11215((byte)14)) {
                  break label119;
               }

               if (var4 >= -1507638435) {
                  throw new IllegalStateException();
               }
            }

            var3 = var0.method11215((byte)64);
         }

         int var5 = 0;
         if (var0.field6107 == class586.field6376) {
            if (var4 >= -1507638435) {
               throw new IllegalStateException();
            }

            int[] var6 = var0.method11207(2053374425);
            int var7 = (Integer)var1;

            for (int var8 = var2; var8 < var3; var8++) {
               if (var4 >= -1507638435) {
                  throw new IllegalStateException();
               }

               if (var7 == var6[var8]) {
                  if (var4 >= -1507638435) {
                     throw new IllegalStateException();
                  }

                  var5++;
               }
            }
         } else if (class586.field6377 == var0.field6107) {
            if (var4 >= -1507638435) {
               throw new IllegalStateException();
            }

            long[] var11 = DynamicArray.method11211(var0, (byte)-7);
            long var13 = (Long)var1;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var11[var9] == var13) {
                  if (var4 >= -1507638435) {
                     throw new IllegalStateException();
                  }

                  var5++;
               }
            }
         } else {
            Object[] var12 = var0.method11214((byte)-55);

            for (int var14 = var2; var14 < var3; var14++) {
               if (var4 >= -1507638435) {
                  throw new IllegalStateException();
               }

               if (var1 != var12[var14]) {
                  if (var4 >= -1507638435) {
                     throw new IllegalStateException();
                  }

                  if (var12[var14] == null || !var12[var14].equals(var1)) {
                     continue;
                  }

                  if (var4 >= -1507638435) {
                     throw new IllegalStateException();
                  }
               }

               var5++;
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "mb.an(" + 41);
      }
   }

   protected class320(StudioGame var1, Language var2, int var3) {
      this.field3818 = var3 * -1482068985;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;")
   @ObfuscatedName("av")
   public static String method7361(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         StringBuilder var3 = new StringBuilder(var2);

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1 == 485110348) {
               throw new IllegalStateException();
            }

            char var5;
            label113: {
               var5 = var0.charAt(var4);
               if (var5 >= 'a') {
                  if (var1 == 485110348) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 'z') {
                     break label113;
                  }

                  if (var1 == 485110348) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 'A') {
                  if (var1 == 485110348) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 'Z') {
                     break label113;
                  }

                  if (var1 == 485110348) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= '0') {
                  if (var5 <= '9') {
                     break label113;
                  }

                  if (var1 == 485110348) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 != '.') {
                  if (var1 == 485110348) {
                     throw new IllegalStateException();
                  }

                  if (var5 != '-' && '*' != var5) {
                     if (var1 == 485110348) {
                        throw new IllegalStateException();
                     }

                     if ('_' != var5) {
                        if (var5 == ' ') {
                           if (var1 == 485110348) {
                              throw new IllegalStateException();
                           }

                           var3.append('+');
                        } else {
                           byte var6 = Sound.charToByteCp1252(var5, (byte)53);
                           var3.append('%');
                           int var7 = var6 >> 4 & 15;
                           if (var7 >= 10) {
                              var3.append((char)(55 + var7));
                           } else {
                              var3.append((char)(var7 + 48));
                           }

                           var7 = var6 & 15;
                           if (var7 >= 10) {
                              if (var1 == 485110348) {
                                 throw new IllegalStateException();
                              }

                              var3.append((char)(var7 + 55));
                           } else {
                              var3.append((char)(var7 + 48));
                           }
                        }
                        continue;
                     }

                     if (var1 == 485110348) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            var3.append(var5);
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "mb.av(" + ')');
      }
   }
}
