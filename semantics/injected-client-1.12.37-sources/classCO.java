import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("co")
public class classCO extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field1180 = 30;
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("ab")
   IterableNodeDeque field1176 = new IterableNodeDeque();
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field1178 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1179 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field1181 = 8;
   @ObfuscatedName("aj")
   static short[][][] field1182;
   @ObfuscatedSignature(descriptor = "Lpx;")
   @ObfuscatedName("ae")
   HealthBarDefinition field1177;

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("az")
   void method2559(int var1, int var2, int var3, int var4, byte var5) {
      try {
         classCV var6 = null;
         int var7 = 0;

         for (classCV var8 = (classCV)this.field1176.method8167(); var8 != null; var8 = (classCV)classAAX.method294(this.field1176)) {
            if (var5 <= 1) {
               throw new IllegalStateException();
            }

            var7++;
            if (1576496181 * var8.field1300 == var1) {
               if (var5 <= 1) {
                  throw new IllegalStateException();
               }

               var8.method2680(var1, var2, var3, var4, -1187795306);
               return;
            }

            if (1576496181 * var8.field1300 <= var1) {
               if (var5 <= 1) {
                  return;
               }

               var6 = var8;
            }
         }

         if (null != var6) {
            IterableNodeDeque.method8150(new classCV(var1, var2, var3, var4), var6);
            if (var7 >= 4) {
               if (var5 <= 1) {
                  throw new IllegalStateException();
               }

               this.field1176.method8167().vmethod398();
            }
         } else if (var5 <= 1) {
            throw new IllegalStateException();
         } else {
            if (var7 < 4) {
               if (var5 <= 1) {
                  return;
               }

               this.field1176.method8159(new classCV(var1, var2, var3, var4));
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "co.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpx;")
   @ObfuscatedName("bv")
   public HealthBarDefinition method2568() {
      return this.field1177;
   }

   @ObfuscatedSignature(descriptor = "(II)Lcv;")
   @ObfuscatedName("af")
   classCV method2562(int var1, int var2) {
      try {
         classCV var3 = (classCV)this.field1176.method8167();
         if (var3 != null) {
            if (var2 >= -750192613) {
               throw new IllegalStateException();
            }

            if (1576496181 * var3.field1300 <= var1) {
               for (classCV var4 = (classCV)classAAX.method294(this.field1176); null != var4; var4 = (classCV)classAAX.method294(this.field1176)) {
                  if (var2 >= -750192613) {
                     throw new IllegalStateException();
                  }

                  if (var4.field1300 * 1576496181 > var1) {
                     break;
                  }

                  if (var2 >= -750192613) {
                     throw new IllegalStateException();
                  }

                  var3.vmethod398();
                  var3 = var4;
               }

               if (this.field1177.field5480 * -1486866911 + 1576496181 * var3.field1300 + -425086145 * var3.field1297 > var1) {
                  if (var2 >= -750192613) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }

               var3.vmethod398();
               return null;
            }

            if (var2 >= -750192613) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "co.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ht")
   static void method2567(byte var0) {
      try {
         if (1 == client.field967 * -496203881) {
            if (var0 != 12) {
               throw new IllegalStateException();
            }

            client.field952 = true;
         }
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "co.ht(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ab")
   void method2560(int var1, int var2, int var3, int var4) {
      classCV var5 = null;
      int var6 = 0;

      for (classCV var7 = (classCV)this.field1176.method8167(); var7 != null; var7 = (classCV)classAAX.method294(this.field1176)) {
         var6++;
         if (1576496181 * var7.field1300 == var1) {
            var7.method2680(var1, var2, var3, var4, -2070137717);
            return;
         }

         if (859522264 * var7.field1300 <= var1) {
            var5 = var7;
         }
      }

      if (null == var5) {
         if (var6 < 4) {
            this.field1176.method8159(new classCV(var1, var2, var3, var4));
         }
      } else {
         IterableNodeDeque.method8150(new classCV(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.field1176.method8167().vmethod398();
         }
      }
   }

   classCO(HealthBarDefinition var1) {
      this.field1177 = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ae")
   boolean method2566(byte var1) {
      try {
         return this.field1176.method8179();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "co.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lcv;")
   @ObfuscatedName("aa")
   classCV method2563(int var1) {
      classCV var2 = (classCV)this.field1176.method8167();
      if (var2 != null && 1576496181 * var2.field1300 <= var1) {
         for (classCV var3 = (classCV)classAAX.method294(this.field1176);
            null != var3 && var3.field1300 * 1576496181 <= var1;
            var3 = (classCV)classAAX.method294(this.field1176)
         ) {
            var2.vmethod398();
            var2 = var3;
         }

         if (this.field1177.field5480 * -1486866911 + 1576496181 * var2.field1300 + -425086145 * var2.field1297 > var1) {
            return var2;
         } else {
            var2.vmethod398();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lcv;")
   @ObfuscatedName("as")
   classCV method2564(int var1) {
      classCV var2 = (classCV)this.field1176.method8167();
      if (var2 != null && 1576496181 * var2.field1300 <= var1) {
         for (classCV var3 = (classCV)classAAX.method294(this.field1176);
            null != var3 && var3.field1300 * 1576496181 <= var1;
            var3 = (classCV)classAAX.method294(this.field1176)
         ) {
            var2.vmethod398();
            var2 = var3;
         }

         if (this.field1177.field5480 * -1486866911 + 1576496181 * var2.field1300 + -425086145 * var2.field1297 > var1) {
            return var2;
         } else {
            var2.vmethod398();
            return null;
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lco;IIII)V")
   @ObfuscatedName("os")
   public static void method2561(classCO var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method2564(var1);
      }

      classCV var5 = null;
      int var6 = 0;

      for (classCV var7 = (classCV)var0.field1176.method8167(); var7 != null; var7 = (classCV)classAAX.method294(var0.field1176)) {
         var6++;
         if (1576496181 * var7.field1300 == var1) {
            var7.method2680(var1, var2, var3, var4, -560476653);
            return;
         }

         if (1576496181 * var7.field1300 <= var1) {
            var5 = var7;
         }
      }

      if (null == var5) {
         if (var6 < 4) {
            var0.field1176.method8159(new classCV(var1, var2, var3, var4));
         }
      } else {
         IterableNodeDeque.method8150(new classCV(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            var0.field1176.method8167().vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lcv;")
   @ObfuscatedName("ac")
   classCV method2565(int var1) {
      classCV var2 = (classCV)this.field1176.method8167();
      if (var2 != null && 1576496181 * var2.field1300 <= var1) {
         for (classCV var3 = (classCV)classAAX.method294(this.field1176);
            null != var3 && var3.field1300 * 1576496181 <= var1;
            var3 = (classCV)classAAX.method294(this.field1176)
         ) {
            var2.vmethod398();
            var2 = var3;
         }

         if (this.field1177.field5480 * -1486866911 + 1576496181 * var2.field1300 + -425086145 * var2.field1297 > var1) {
            return var2;
         } else {
            var2.vmethod398();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lcv;")
   @ObfuscatedName("mb")
   public classCV method2569(int var1) {
      return this.method2562(var1, -1606368617);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("az")
   public static int method2558(int var0, int var1, int var2) {
      try {
         return var1 + (-3 - var0 << 8);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "co.az(" + 41);
      }
   }
}
