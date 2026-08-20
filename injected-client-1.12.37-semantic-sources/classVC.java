import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vc")
public class classVC {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6488 = 50;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("af")
   Widget field6489;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("az")
   Widget field6490;
   @ObfuscatedName("ae")
   int field6487 = 0;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;Z)Laar;")
   @ObfuscatedName("lt")
   public static classAAR method11934(classDS var0, boolean var1) {
      return var0 == null ? var0.method3576(var1) : BoundaryObject.method4612("2", classYP.field7028.field4053, var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("al")
   public void method11928(Widget var1) {
      this.field6490 = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   public void method11924(byte var1) {
      try {
         if (this.field6489 != null) {
            if (var1 >= 4) {
               throw new IllegalStateException();
            }

            if (-740803857 * this.field6487 < 50) {
               if (var1 >= 4) {
                  throw new IllegalStateException();
               }

               this.field6487 += -1419496433;
            }
         } else if (-740803857 * this.field6487 > 0) {
            if (var1 >= 4) {
               return;
            }

            this.field6487 -= -1419496433;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "vc.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Z")
   @ObfuscatedName("ab")
   public boolean method11932(Widget var1, byte var2) {
      try {
         if (var1 == this.field6489) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (50 == this.field6487 * -740803857) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vc.ab(" + ')');
      }
   }

   classVC() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvc;)V")
   @ObfuscatedName("yk")
   public static void method11925(classVC var0) {
      if (var0.field6489 != null) {
         if (-740803857 * var0.field6487 < 50) {
            var0.field6487 += 429501998;
         }
      } else if (303009574 * var0.field6487 > 0) {
         var0.field6487 -= -1419496433;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("ag")
   public void method11929(Widget var1, int var2) {
      try {
         this.field6490 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vc.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("ae")
   public void method11933(Widget var1, int var2) {
      try {
         this.field6489 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vc.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method11926() {
      if (this.field6489 != null) {
         if (-1786359775 * this.field6487 < 411698692) {
            this.field6487 += -1419496433;
         }
      } else if (-740803857 * this.field6487 > 0) {
         this.field6487 -= 1648860763;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Z")
   @ObfuscatedName("af")
   public boolean method11927(Widget var1, byte var2) {
      try {
         return this.field6490 == var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("ao")
   public void method11930(Widget var1) {
      this.field6490 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("aj")
   public void method11931(Widget var1) {
      this.field6490 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lva;B)I")
   @ObfuscatedName("az")
   static int method11935(AbstractArchive var0, AbstractArchive var1, byte var2) {
      try {
         int var3 = 0;
         String[] var4 = classBF.field411;

         for (int var5 = 0; var5 < var4.length; var5++) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            String var6 = var4[var5];
            if (var0.method11859(var6, "", -1093961304)) {
               if (var2 <= 2) {
                  throw new IllegalStateException();
               }

               var3++;
            }
         }

         var4 = classBF.field414;

         for (int var10 = 0; var10 < var4.length; var10++) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            }

            String var12 = var4[var10];
            if (var1.method11859(var12, "", -144849564)) {
               if (var2 <= 2) {
                  throw new IllegalStateException();
               }

               var3++;
            }
         }

         var4 = classBF.field386;

         for (int var11 = 0; var11 < var4.length; var11++) {
            String var13 = var4[var11];
            if (var1.method11848(var13, 218437170) != -1) {
               if (var2 <= 2) {
                  throw new IllegalStateException();
               }

               if (var1.method11859(var13, "", 825023448)) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  var3++;
               }
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "vc.az(" + 41);
      }
   }
}
