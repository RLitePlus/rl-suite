import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kb")
public class WorldEntityCoord {
   @ObfuscatedName("av")
   int orientation = 0;
   @ObfuscatedName("an")
   int z;
   @ObfuscatedName("ag")
   int y;
   @ObfuscatedName("at")
   int x = 0;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int getY(int var1) {
      try {
         return this.x * -639471049;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kb.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int getZ(int var1) {
      try {
         return -430111663 * this.y;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kb.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method6247() {
      return -430111663 * this.y;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method6290() {
      return this.x * -639471049 + ", " + this.z * -179609957 + ", " + -430111663 * this.y + ", " + this.orientation * 459733525;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   public int getX(int var1) {
      try {
         return this.orientation * 459733525;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kb.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("bj")
   public void method6261(WorldEntityCoord var1) {
      this.orientation = 1 * var1.orientation;
      this.x = 1 * var1.x;
      this.z = var1.z * 1;
      this.y = 1 * var1.y;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("ue")
   public void method6293(WorldEntityCoord var1) {
      this.method6262(var1, 1531022422);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;I)V")
   @ObfuscatedName("aw")
   public void method6262(WorldEntityCoord var1, int var2) {
      try {
         this.orientation = 1 * var1.orientation;
         this.x = 1 * var1.x;
         this.z = var1.z * 1;
         this.y = 1 * var1.y;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kb.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method6255() {
      return this.orientation * 459733525;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ay")
   public void setZ(int var1, byte var2) {
      try {
         this.z = 165042067 * var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kb.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("au")
   public void setDirection(int var1, int var2, int var3) {
      try {
         this.x += 1487528839 * var1;
         this.y += 767739057 * var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kb.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;I)I")
   @ObfuscatedName("ft")
   public static int method6240(WorldEntityCoord var0, int var1) {
      if (var0 == null) {
         var0.getOrientation(var1);
      }

      try {
         return var0.z * -179609957;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kb.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;IIIIB)V")
   @ObfuscatedName("oo")
   public static void method6278(WorldEntityCoord var0, int var1, int var2, int var3, int var4, byte var5) {
      if (var0 == null) {
         var0.method6281(var1, var1, var1, var1, var5);
      } else {
         try {
            var0.x += var1 * 1487528839;
            var0.z += var2 * 165042067;
            var0.y += var3 * 767739057;
            var0.setOrientation(459733525 * var0.orientation + var4, 2110666551);
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "kb.az(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;)Ljava/lang/String;")
   @ObfuscatedName("ni")
   public static String method6291(WorldEntityCoord var0) {
      if (var0 == null) {
         var0.method6247();
      }

      return var0.x * -639471049 + ", " + var0.z * 231455687 + ", " + -430111663 * var0.y + ", " + var0.orientation * -1614625316;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("an")
   public int getTileX(byte var1) {
      try {
         return this.x * -639471049 >> 7;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kb.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;B)Z")
   @ObfuscatedName("ad")
   boolean method6286(WorldEntityCoord var1, byte var2) {
      try {
         if (-639471049 * this.x == var1.x * -639471049) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            if (-179609957 * this.z == -179609957 * var1.z) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (var1.y * -430111663 == -430111663 * this.y) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  if (459733525 * var1.orientation == 459733525 * this.orientation) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kb.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ae")
   public int getTileY(byte var1) {
      try {
         return -430111663 * this.y >> 7;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kb.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public int method6237() {
      return this.x * -639471049;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method6283(Object var1) {
      return var1 instanceof WorldEntityCoord ? this.method6286((WorldEntityCoord)var1, (byte)1) : false;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method6284(Object var1) {
      return var1 instanceof WorldEntityCoord ? this.method6286((WorldEntityCoord)var1, (byte)1) : false;
   }

   @ObfuscatedSignature(descriptor = "([BB)Llu;")
   @ObfuscatedName("av")
   static WorldMapSprite method6245(byte[] var0, byte var1) {
      try {
         if (null == var0) {
            if (var1 != 1) {
               throw new IllegalStateException();
            } else {
               return new WorldMapSprite();
            }
         } else {
            SpritePixels var2 = class201.readSpritePixelsFromBytes(var0, (byte)-108);
            if (null == var2) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               } else {
                  return new WorldMapSprite();
               }
            } else {
               return new WorldMapSprite(var2.pixels);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kb.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZB)[B")
   @ObfuscatedName("at")
   public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1, byte var2) {
      try {
         synchronized (ByteArrayPool.field5829) {
            label203: {
               if (var0 != 100) {
                  if (var0 >= 100) {
                     break label203;
                  }

                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label203;
                  }
               }

               if (-2080909031 * ByteArrayPool.ByteArrayPool_smallCount > 0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  byte[] var4 = ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount -= 1846047529) * -2080909031];
                  ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount * -2080909031] = null;
                  return var4;
               }
            }

            label195: {
               if (5000 != var0) {
                  if (var0 >= 5000) {
                     break label195;
                  }

                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label195;
                  }

                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }
               }

               if (410827371 * ByteArrayPool.ByteArrayPool_mediumCount > 0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  byte[] var9 = ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount -= 202056259) * 410827371];
                  ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount * 410827371] = null;
                  return var9;
               }
            }

            label186: {
               if (var0 != 10000) {
                  if (var0 >= 10000 || !var1) {
                     break label186;
                  }

                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }
               }

               if (ByteArrayPool.ByteArrayPool_largeCount * 1911186123 > 0) {
                  byte[] var10 = ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount -= -167480605) * 1911186123];
                  ByteArrayPool.ByteArrayPool_large[1911186123 * ByteArrayPool.ByteArrayPool_largeCount] = null;
                  return var10;
               }
            }

            label178: {
               if (var0 != 30000) {
                  if (var0 >= 30000) {
                     break label178;
                  }

                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label178;
                  }

                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }
               }

               if (ByteArrayPool.field5841 * -125656445 > 0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  byte[] var11 = ByteArrayPool.field5830[(ByteArrayPool.field5841 -= -1431815125) * -125656445];
                  ByteArrayPool.field5830[ByteArrayPool.field5841 * -125656445] = null;
                  return var11;
               }
            }

            if (ByteArrayPool.ByteArrayPool_arrays != null) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               for (int var12 = 0; var12 < class451.ByteArrayPool_alternativeSizes.length; var12++) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (class451.ByteArrayPool_alternativeSizes[var12] != var0) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var0 >= class451.ByteArrayPool_alternativeSizes[var12]) {
                        continue;
                     }

                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     if (!var1) {
                        continue;
                     }

                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }
                  }

                  if (class70.ByteArrayPool_altSizeArrayCounts[var12] > 0) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     byte[] var5 = ByteArrayPool.ByteArrayPool_arrays[var12][--class70.ByteArrayPool_altSizeArrayCounts[var12]];
                     ByteArrayPool.ByteArrayPool_arrays[var12][class70.ByteArrayPool_altSizeArrayCounts[var12]] = null;
                     return var5;
                  }
               }
            }

            if (var1) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if (class451.ByteArrayPool_alternativeSizes != null) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  for (int var13 = 0; var13 < class451.ByteArrayPool_alternativeSizes.length; var13++) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var0 <= class451.ByteArrayPool_alternativeSizes[var13]) {
                        if (var2 == 1) {
                           throw new IllegalStateException();
                        }

                        if (class70.ByteArrayPool_altSizeArrayCounts[var13] < ByteArrayPool.ByteArrayPool_arrays[var13].length) {
                           if (var2 == 1) {
                              throw new IllegalStateException();
                           }

                           return new byte[class451.ByteArrayPool_alternativeSizes[var13]];
                        }
                     }
                  }
               }
            }
         }

         return new byte[var0];
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "kb.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public int method6238() {
      return this.x * 1823522967;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bl")
   public void method6279(int var1, int var2, int var3, int var4) {
      this.x += var1 * 1487528839;
      this.z += var2 * 165042067;
      this.y += var3 * 767739057;
      this.setOrientation(459733525 * this.orientation + var4, 1847384615);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   public int method6239() {
      return this.x * -639471049;
   }

   @Override
   public String toString() {
      try {
         return this.x * -639471049 + ", " + this.z * -179609957 + ", " + -430111663 * this.y + ", " + this.orientation * 459733525;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "kb.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ba")
   public void method6265(int var1, int var2) {
      this.x = var1 * 1487528839;
      this.y = 767739057 * var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method6241() {
      return this.z * -179609957;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public int method6248() {
      return -430111663 * this.y;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   public void setOrientation(int var1, int var2) {
      try {
         this.orientation = -398195395 * (var1 & 2047);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kb.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public int method6250() {
      return this.x * -639471049 >> 7;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return var1 instanceof WorldEntityCoord ? this.method6286((WorldEntityCoord)var1, (byte)1) : false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kb.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("be")
   public int method6253() {
      return -430111663 * this.y >> 7;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   public int method6256() {
      return this.orientation * 459733525;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   public int method6257() {
      return this.orientation * 459733525;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method6242() {
      return this.z * -179609957;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method6285(Object var1) {
      return var1 instanceof WorldEntityCoord ? this.method6286((WorldEntityCoord)var1, (byte)1) : false;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bw")
   public void method6260(int var1) {
      this.orientation = -398195395 * (var1 & 2047);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("bb")
   public void method6263(WorldEntityCoord var1) {
      this.orientation = 1 * var1.orientation;
      this.x = 1 * var1.x;
      this.z = var1.z * 1;
      this.y = 1 * var1.y;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ap")
   public void method6266(int var1, int var2, int var3) {
      try {
         this.x = var1 * 1487528839;
         this.y = 767739057 * var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kb.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)V")
   @ObfuscatedName("bm")
   public void method6264(WorldEntityCoord var1) {
      this.orientation = 1 * var1.orientation;
      this.x = 1 * var1.x;
      this.z = var1.z * 1;
      this.y = 1 * var1.y;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bt")
   public void method6267(int var1, int var2) {
      this.x = var1 * 1524363207;
      this.y = 2071244164 * var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bu")
   public void method6268(int var1, int var2) {
      this.x = var1 * 1487528839;
      this.y = 767739057 * var2;
   }

   public WorldEntityCoord() {
      this.y = 0;
      this.z = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bf")
   public void method6271(int var1) {
      this.z = 165042067 * var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("by")
   public void method6272(int var1) {
      this.z = 165042067 * var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;)I")
   @ObfuscatedName("gd")
   public static int method6282(MidiFileReader var0) {
      return var0.trackPositions.length;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bk")
   public void method6273(int var1) {
      this.z = 165042067 * var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method6292() {
      return this.x * 1347462889 + ", " + this.z * -1263142742 + ", " + -430111663 * this.y + ", " + this.orientation * -29130423;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bd")
   public void method6275(int var1, int var2) {
      this.x += 1487528839 * var1;
      this.y += 767739057 * var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("br")
   public void method6276(int var1, int var2) {
      this.x += -1626333109 * var1;
      this.y += 767739057 * var2;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bh")
   public void method6280(int var1, int var2, int var3, int var4) {
      this.x += var1 * 1487528839;
      this.z += var2 * 165042067;
      this.y += var3 * 767739057;
      this.setOrientation(459733525 * this.orientation + var4, 2043596275);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public int method6251() {
      return this.x * -1494593183 >> 7;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)Z")
   @ObfuscatedName("bq")
   boolean method6287(WorldEntityCoord var1) {
      return -639471049 * this.x == var1.x * 1760291962
         && -179609957 * this.z == 220500585 * var1.z
         && var1.y * -430111663 == 1441619800 * this.y
         && -883810462 * var1.orientation == 459733525 * this.orientation;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bn")
   public void method6277(int var1, int var2) {
      this.x += 1487528839 * var1;
      this.y += 767739057 * var2;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)Z")
   @ObfuscatedName("bx")
   boolean method6288(WorldEntityCoord var1) {
      return -639471049 * this.x == var1.x * -639471049
         && -179609957 * this.z == -179609957 * var1.z
         && var1.y * -430111663 == -430111663 * this.y
         && 459733525 * var1.orientation == 459733525 * this.orientation;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   public int method6243() {
      return this.z * -179609957;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("av")
   static boolean method6258(String var0, int var1) {
      try {
         if (null == var0) {
            if (var1 != 1715908378) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            try {
               new URL(var0);
               return true;
            } catch (MalformedURLException var3) {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kb.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public int getOrientation(int var1) {
      try {
         return this.z * -179609957;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kb.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("az")
   public void method6281(int var1, int var2, int var3, int var4, byte var5) {
      try {
         this.y = this.orientation + var1 * 1487528839;
         this.z = this.x + var2 * 165042067;
         this.orientation = this.z + var3 * 767739057;
         this.method6267(459733525 * this.z + var4, 2110666551);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "kb.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;)Z")
   @ObfuscatedName("bc")
   boolean method6289(WorldEntityCoord var1) {
      return -639471049 * this.orientation == var1.x * 1760291962
         && -179609957 * this.orientation == 220500585 * var1.orientation
         && var1.y * -430111663 == 1441619800 * this.y
         && -883810462 * var1.orientation == 459733525 * this.z;
   }
}
