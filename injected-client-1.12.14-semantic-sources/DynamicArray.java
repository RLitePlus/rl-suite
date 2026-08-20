import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ut")
public class DynamicArray {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field6113 = 5000;
   @ObfuscatedSignature(descriptor = "Lwh;")
   @ObfuscatedName("at")
   public final class586 field6107;
   @ObfuscatedName("ag")
   public final boolean field6109;
   @ObfuscatedName("ap")
   public Object[] field6111;
   @ObfuscatedName("ae")
   public int field6106;
   @ObfuscatedName("aj")
   Object field6108;
   @ObfuscatedName("ak")
   public int[] array;
   @ObfuscatedName("aw")
   public long[] field6110;
   @ObfuscatedName("an")
   public int size;
   @ObfuscatedName("ks")
   static String worldHost;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field6114 = 30;

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("au")
   final void method11236(int var1, byte var2) {
      try {
         int var3 = this.size * 1583568339;
         this.size = -1205286309 * var1;
         if (var1 < var3) {
            if (var2 >= 4) {
               throw new IllegalStateException();
            }

            if (class586.field6376 == this.field6107) {
               if (var2 >= 4) {
                  return;
               }

               Arrays.fill(this.array, var1, var3, 0);
            } else if (this.field6107 == class586.field6377) {
               if (var2 >= 4) {
                  throw new IllegalStateException();
               }

               Arrays.fill(this.field6110, var1, var3, 0L);
            } else {
               Arrays.fill(this.field6111, var1, var3, null);
            }
         } else if (var1 > var3) {
            if (var2 >= 4) {
               throw new IllegalStateException();
            }

            if (class586.field6376 == this.field6107) {
               int var4 = (Integer)this.field6108;
               if (var4 != 0) {
                  if (var2 >= 4) {
                     throw new IllegalStateException();
                  }

                  Arrays.fill(this.array, var3, var1, var4);
               }
            } else if (this.field6107 == class586.field6377) {
               long var7 = (Long)this.field6108;
               if (var7 != 0L) {
                  if (var2 >= 4) {
                     throw new IllegalStateException();
                  }

                  Arrays.fill(this.field6110, var3, var1, var7);
               }
            } else if (this.field6108 != null) {
               if (var2 >= 4) {
                  throw new IllegalStateException();
               }

               Arrays.fill(this.field6111, var3, var1, this.field6108);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ut.au(" + ')');
      }
   }

   public DynamicArray(class586 var1, Object var2, int var3, int var4) {
      this.field6109 = true;
      this.field6107 = var1;
      this.field6106 = var4 * -1332440619;
      this.field6108 = var2;
      if (var1 == class586.field6376) {
         this.array = new int[var4];
      } else if (class586.field6377 == var1) {
         this.field6110 = new long[var4];
      } else if (var1 == class586.field6379) {
         this.field6111 = new String[var4];
      }

      this.method11236(var3, (byte)-71);
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("av")
   public final int[] method11207(int var1) {
      try {
         return this.array;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ut.av(" + ')');
      }
   }

   public DynamicArray(class586 var1, boolean var2) {
      this.field6107 = var1;
      this.field6109 = var2;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("an")
   public final int method11215(byte var1) {
      try {
         return 1583568339 * this.size;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ut.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bt")
   public void method11241(Buffer var1) {
      var1.writeShort(this.size * 1583568339, -1318538218);
      if (class586.field6376 == this.field6107) {
         var1.writeByte(0, (short)-7425);

         for (int var2 = 0; var2 < this.size * 1311283137; var2++) {
            var1.writeInt(this.array[var2], 1459997225);
         }
      } else if (this.field6107 == class586.field6377) {
         var1.writeByte(1, (short)-19588);

         for (int var3 = 0; var3 < -2024216959 * this.size; var3++) {
            var1.writeLongMedium(this.field6110[var3]);
         }
      } else if (class586.field6379 == this.field6107) {
         var1.writeByte(2, (short)-6476);

         for (int var4 = 0; var4 < this.size * 2045705121; var4++) {
            var1.writeStringCp1252NullTerminated((String)this.field6111[var4], 998990159);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("be")
   public final void method11225(int var1) {
      method11228(this, var1, 1003365724);
      this.method11236(var1, (byte)-84);
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ak")
   public final void method11226(int var1, byte var2) {
      try {
         method11228(this, var1, -76857376);
         this.method11236(var1, (byte)-98);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ut.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[J")
   @ObfuscatedName("ax")
   final long[] method11209() {
      return this.field6110;
   }

   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("xg")
   public static void method11228(DynamicArray var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11232(var1, var1);
      } else {
         try {
            if (!var0.field6109) {
               if (var2 < 1465977803) {
                  throw new RuntimeException();
               }
            } else {
               if (var1 >= 0) {
                  if (var1 <= 5000) {
                     if (var1 > 1016864637 * var0.field6106) {
                        var0.method11235(var0.method11234(var1, (byte)20), 1793819103);
                     }

                     return;
                  }

                  if (var2 >= 1465977803) {
                     throw new IllegalStateException();
                  }
               }

               throw new RuntimeException();
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "ut.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ay")
   void method11235(int var1, int var2) {
      try {
         if (var1 != 1016864637 * this.field6106) {
            if (var2 == 1338048487) {
               return;
            }

            this.field6106 = var1 * -1332440619;
            if (class586.field6376 == this.field6107) {
               if (var2 == 1338048487) {
                  return;
               }

               this.array = Arrays.copyOf(this.array, var1);
            } else if (class586.field6377 == this.field6107) {
               if (var2 == 1338048487) {
                  return;
               }

               this.field6110 = Arrays.copyOf(this.field6110, var1);
            } else if (class586.field6379 == this.field6107) {
               if (var2 == 1338048487) {
                  return;
               }

               this.field6111 = Arrays.copyOf(this.field6111, var1);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ut.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bk")
   int method11233(int var1) {
      int var2 = (-1671031931 * this.field6106 >> 1) + -289727670 * this.field6106;
      return Math.max(var1, Math.min(var2, 5000));
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ai")
   public final int[] method11208() {
      return this.array;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;I)V")
   @ObfuscatedName("aj")
   final void method11221(int var1, Object var2, int var3) {
      try {
         if (class586.field6376 == this.field6107) {
            if (var3 >= -1480645403) {
               throw new IllegalStateException();
            }

            this.array[var1] = (Integer)var2;
         } else if (this.field6107 == class586.field6377) {
            if (var3 >= -1480645403) {
               throw new IllegalStateException();
            }

            this.field6110[var1] = (Long)var2;
         } else {
            this.field6111[var1] = var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ut.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("aq")
   final void method11222(int var1, Object var2) {
      if (class586.field6376 == this.field6107) {
         this.array[var1] = (Integer)var2;
      } else if (this.field6107 == class586.field6377) {
         this.field6110[var1] = (Long)var2;
      } else {
         this.field6111[var1] = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("ar")
   public final Object[] method11213() {
      return this.field6111;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public final int method11216() {
      return -219755015 * this.size;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public final int method11217() {
      return 1583568339 * this.size;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("af")
   final Object method11218(int var1) {
      if (class586.field6376 == this.field6107) {
         return this.array[var1];
      } else {
         return this.field6107 == class586.field6377 ? this.field6110[var1] : this.field6111[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("ad")
   public void method11242(Buffer var1, byte var2) {
      try {
         var1.writeShort(this.size * 1583568339, -1971405069);
         if (class586.field6376 == this.field6107) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            var1.writeByte(0, (short)-15078);

            for (int var3 = 0; var3 < this.size * 1583568339; var3++) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               var1.writeInt(this.array[var3], 55143248);
            }
         } else if (this.field6107 == class586.field6377) {
            if (var2 <= 1) {
               return;
            }

            var1.writeByte(1, (short)-1697);

            for (int var5 = 0; var5 < 1583568339 * this.size; var5++) {
               if (var2 <= 1) {
                  return;
               }

               var1.writeLongMedium(this.field6110[var5]);
            }
         } else if (class586.field6379 == this.field6107) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            var1.writeByte(2, (short)-32162);

            for (int var6 = 0; var6 < this.size * 1583568339; var6++) {
               var1.writeStringCp1252NullTerminated((String)this.field6111[var6], 998990159);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ut.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)[J")
   @ObfuscatedName("fg")
   public static long[] method11210(DynamicArray var0) {
      return var0.field6110;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("aa")
   final void method11223(int var1, Object var2) {
      if (class586.field6376 == this.field6107) {
         this.array[var1] = (Integer)var2;
      } else if (this.field6107 == class586.field6377) {
         this.field6110[var1] = (Long)var2;
      } else {
         this.field6111[var1] = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)Ljava/lang/Object;")
   @ObfuscatedName("ae")
   final Object method11219(int var1, short var2) {
      try {
         if (class586.field6376 == this.field6107) {
            return this.array[var1];
         } else if (this.field6107 == class586.field6377) {
            if (var2 >= 154) {
               throw new IllegalStateException();
            } else {
               return this.field6110[var1];
            }
         } else {
            return this.field6111[var1];
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ut.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   public final void method11227(int var1) {
      method11228(this, var1, -544417366);
      this.method11236(var1, (byte)-80);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)Lut;")
   @ObfuscatedName("bj")
   public static DynamicArray method11238(int[] var0) {
      DynamicArray var1 = new DynamicArray(class586.field6376, true);
      var1.array = var0;
      var1.size = -1205286309 * var0.length;
      var1.field6106 = -1332440619 * var0.length;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bs")
   final void method11229(int var1) {
      if (!this.field6109) {
         throw new RuntimeException();
      } else if (var1 >= 0 && var1 <= 5000) {
         if (var1 > 1016864637 * this.field6106) {
            this.method11235(this.method11234(var1, (byte)20), -1465364882);
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)Lut;")
   @ObfuscatedName("bp")
   public static DynamicArray method11239(int[] var0) {
      DynamicArray var1 = new DynamicArray(class586.field6376, true);
      var1.array = var0;
      var1.size = -1205286309 * var0.length;
      var1.field6106 = -1332440619 * var0.length;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lut;B)[J")
   @ObfuscatedName("rm")
   public static long[] method11211(DynamicArray var0, byte var1) {
      if (var0 == null) {
         var0.method11212(var1);
      }

      try {
         return var0.field6110;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ut.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Ljava/lang/Object;")
   @ObfuscatedName("ag")
   public final Object[] method11214(byte var1) {
      try {
         return this.field6111;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ut.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)Lut;")
   @ObfuscatedName("bm")
   public static DynamicArray method11240(int[] var0) {
      DynamicArray var1 = new DynamicArray(class586.field6376, true);
      var1.array = var0;
      var1.size = -1205286309 * var0.length;
      var1.field6106 = -1332440619 * var0.length;
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("jh")
   public static void method11244(Model var0) {
      if (var0 == null) {
         var0.method6779();
      }

      var0.modelColorOverride = null;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ap")
   int method11234(int var1, byte var2) {
      try {
         int var3 = (1016864637 * this.field6106 >> 1) + 1016864637 * this.field6106;
         return Math.max(var1, Math.min(var3, 5000));
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ut.ap(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)Ljava/lang/Object;")
   @ObfuscatedName("ii")
   public static Object method11220(DynamicArray var0, int var1) {
      if (class586.field6376 == var0.field6107) {
         return var0.array[var1];
      } else {
         return var0.field6107 == class586.field6377 ? var0.field6110[var1] : var0.field6111[var1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)V")
   @ObfuscatedName("za")
   public static void method11230(DynamicArray var0, int var1) {
      if (!var0.field6109) {
         throw new RuntimeException();
      } else if (var1 >= 0 && var1 <= 325157191) {
         if (var1 > 2038599625 * var0.field6106) {
            var0.method11235(var0.method11234(var1, (byte)20), -1628246219);
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;ILjava/lang/Object;)V")
   @ObfuscatedName("ch")
   public static void method11224(DynamicArray var0, int var1, Object var2) {
      if (class586.field6376 == var0.field6107) {
         var0.array[var1] = (Integer)var2;
      } else if (var0.field6107 == class586.field6377) {
         var0.field6110[var1] = (Long)var2;
      } else {
         var0.field6111[var1] = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bz")
   final void method11231(int var1) {
      if (!this.field6109) {
         throw new RuntimeException();
      } else if (var1 >= 0 && var1 <= 5000) {
         if (var1 > 1016864637 * this.field6106) {
            this.method11235(this.method11234(var1, (byte)20), -1803010800);
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bu")
   public void method11243(Buffer var1) {
      var1.writeShort(this.size * 2032975754, -2069970247);
      if (class586.field6376 == this.field6107) {
         var1.writeByte(0, (short)-29629);

         for (int var2 = 0; var2 < this.size * 1583568339; var2++) {
            var1.writeInt(this.array[var2], 1971772550);
         }
      } else if (this.field6107 == class586.field6377) {
         var1.writeByte(1, (short)-24772);

         for (int var3 = 0; var3 < 1583568339 * this.size; var3++) {
            var1.writeLongMedium(this.field6110[var3]);
         }
      } else if (class586.field6379 == this.field6107) {
         var1.writeByte(2, (short)-2839);

         for (int var4 = 0; var4 < this.size * 1583568339; var4++) {
            var1.writeStringCp1252NullTerminated((String)this.field6111[var4], 998990159);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("iw")
   static final int method11245(int var0, int var1) {
      try {
         return Math.min(Math.max(var0, 128), 383);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ut.iw(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)V")
   @ObfuscatedName("re")
   public static void method11237(DynamicArray var0, int var1) {
      int var2 = var0.size * 1583568339;
      var0.size = -1205286309 * var1;
      if (var1 < var2) {
         if (class586.field6376 == var0.field6107) {
            Arrays.fill(var0.array, var1, var2, 0);
         } else if (var0.field6107 == class586.field6377) {
            Arrays.fill(var0.field6110, var1, var2, 0L);
         } else {
            Arrays.fill(var0.field6111, var1, var2, null);
         }
      } else if (var1 > var2) {
         if (class586.field6376 == var0.field6107) {
            int var3 = (Integer)var0.field6108;
            if (var3 != 0) {
               Arrays.fill(var0.array, var2, var1, var3);
            }
         } else if (var0.field6107 == class586.field6377) {
            long var5 = (Long)var0.field6108;
            if (var5 != 0L) {
               Arrays.fill(var0.field6110, var2, var1, var5);
            }
         } else if (var0.field6108 != null) {
            Arrays.fill(var0.field6111, var2, var1, var0.field6108);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[J")
   @ObfuscatedName("at")
   final long[] method11212(byte var1) {
      try {
         return this.field6110;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ut.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aw")
   final void method11232(int var1, int var2) {
      try {
         if (!this.field6109) {
            if (var2 < 1465977803) {
               throw new RuntimeException();
            }
         } else {
            if (var1 >= 0) {
               if (var1 <= 5000) {
                  if (var1 > 1016864637 * this.size) {
                     this.method11235(this.method11234(var1, (byte)20), 1793819103);
                  }

                  return;
               }

               if (var2 >= 1465977803) {
                  throw new IllegalStateException();
               }
            }

            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ut.aw(" + ')');
      }
   }
}
