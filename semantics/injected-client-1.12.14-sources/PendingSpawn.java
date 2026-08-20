import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cw")
public final class PendingSpawn extends Node {
   @ObfuscatedName("ae")
   int y;
   @ObfuscatedName("at")
   int plane;
   @ObfuscatedName("aw")
   int field1245;
   @ObfuscatedName("an")
   int x;
   @ToRemove(unused = "true")
   @ObfuscatedName("ec")
   static final int field1249 = 65536;
   @ObfuscatedName("aj")
   int objectId;
   @ObfuscatedName("ag")
   int type;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1244 = 31;
   @ObfuscatedName("ap")
   int objectId2;
   @ObfuscatedName("ay")
   int field1246;
   @ObfuscatedName("au")
   int field1243;
   @ObfuscatedName("az")
   int field1247;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field1237 = 2097152;
   @ObfuscatedName("ai")
   int hitpoints;
   @ObfuscatedName("as")
   int field1232;
   @ObfuscatedName("ac")
   String[] field1250;
   @ObfuscatedName("ad")
   int delay = 0;
   @ObfuscatedName("ak")
   int field1239;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field1248 = 77;

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ar")
   String method2991(int var1) {
      return this.field1250 != null && var1 >= 0 && var1 < this.field1250.length ? this.field1250[var1] : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcw;I)Ljava/lang/String;")
   @ObfuscatedName("yg")
   public static String method2992(PendingSpawn var0, int var1) {
      return var0.field1250 != null && var1 >= 0 && var1 < var0.field1250.length ? var0.field1250[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("av")
   void method2973(int var1, byte var2) {
      try {
         this.field1232 = var1 * -1287583949;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   void method2974(int var1) {
      this.field1232 = var1 * -1287583949;
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("an")
   boolean method2988(int var1, byte var2) {
      try {
         if (null != this.field1250) {
            if (var2 == 8) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 == 8) {
                  throw new IllegalStateException();
               }

               if (var1 < this.field1250.length && this.field1250[var1] != null) {
                  if (var2 == 8) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cw.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcw;I)Z")
   @ObfuscatedName("se")
   public static boolean method2982(PendingSpawn var0, int var1) {
      if (var0 == null) {
         return var0.isOpShown(var1, var1);
      } else {
         return var1 >= 0 && var1 <= 4 ? 0 != (492194811 * var0.field1232 & 1 << var1) : true;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("ae")
   String getOpOverride(int var1, int var2) {
      try {
         if (this.field1250 != null) {
            if (var2 != -504336118) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 != -504336118) {
                  throw new IllegalStateException();
               }

               if (var1 < this.field1250.length) {
                  if (var2 != -504336118) {
                     throw new IllegalStateException();
                  }

                  return this.field1250[var1];
               }
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("pw")
   public int method2996() {
      return this.hitpoints * 517473543;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void method2975(int var1) {
      this.field1232 = var1 * -1287583949;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void method2976(int var1) {
      this.field1232 = var1 * -1287583949;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("cj")
   public String method2997(int var1) {
      return this.getOpOverride(var1, -504336118);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ax")
   boolean method2983(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (492194811 * this.field1232 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   boolean method2984(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (1872359100 * this.field1232 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("nw")
   public void method2998(int var1) {
      this.delay = var1 * 753690807;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("ap")
   void method2977(String[] var1) {
      this.field1250 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcw;I)Z")
   @ObfuscatedName("fb")
   public static boolean method2989(PendingSpawn var0, int var1) {
      return null != var0.field1250 && var1 >= 0 && var1 < var0.field1250.length && var0.field1250[var1] != null;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("ay")
   void method2978(String[] var1) {
      this.field1250 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   boolean method2985(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (492194811 * this.field1232 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   boolean method2986(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (-1993577075 * this.field1232 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ad")
   boolean method2990(int var1) {
      return null != this.field1250 && var1 >= 0 && var1 < this.field1250.length && this.field1250[var1] != null;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("af")
   String method2994(int var1) {
      return this.field1250 != null && var1 >= 0 && var1 < this.field1250.length ? this.field1250[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   boolean isOpShown(int var1, int var2) {
      try {
         if (var1 < 0 || var1 > 4) {
            return true;
         } else if (var2 <= 816602458) {
            throw new IllegalStateException();
         } else {
            boolean var10000;
            if (0 != (492194811 * this.field1232 & 1 << var1)) {
               if (var2 <= 816602458) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cw.ag(" + ')');
      }
   }

   PendingSpawn() {
      this.hitpoints = -316037303;
      this.field1232 = -1260396755;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ah")
   String method2995(int var1) {
      return this.field1250 != null && var1 >= 0 && var1 < this.field1250.length ? this.field1250[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public static void method2972(int var0) {
      try {
         FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("au")
   void method2979(String[] var1) {
      this.field1250 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("mu")
   public boolean method2999(int var1) {
      return this.isOpShown(var1, 1344631797);
   }

   @ObfuscatedSignature(descriptor = "(Lcw;[Ljava/lang/String;I)V")
   @ObfuscatedName("vw")
   public static void method2980(PendingSpawn var0, String[] var1, int var2) {
      if (var0 == null) {
         var0.method2981(var1, var2);
      }

      try {
         var0.field1250 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;I)V")
   @ObfuscatedName("at")
   void method2981(String[] var1, int var2) {
      try {
         this.field1250 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cw.at(" + ')');
      }
   }
}
