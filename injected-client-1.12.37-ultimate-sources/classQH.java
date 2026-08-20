import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qh")
public class classQH {
   @ObfuscatedName("ab")
   int field5541;
   @ObfuscatedName("af")
   int field5538;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final int field5543 = 54;
   @ObfuscatedName("ae")
   boolean field5539 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   public static final int field5542 = 4096;
   @ObfuscatedName("az")
   int field5540;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("cs")
   static classYZ field5544;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   public void method9542(int var1) {
      this.field5541 = var1 * -537204515;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aq")
   public boolean method9530(int var1) {
      return -1966181807 * this.field5540 > -2060505227 * this.field5541 && -1966181807 * this.field5540 <= var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   public boolean method9526(int var1) {
      try {
         return this.field5539;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qh.af(" + ')');
      }
   }

   public classQH(int var1, int var2, boolean var3) {
      this.field5541 = 0;
      this.field5540 = var1 * 1718621873;
      this.field5538 = var2 * 1071612465;
      this.field5539 = var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Lyn;I)Lyn;")
   @ObfuscatedName("az")
   static final classYN method9525(classXY var0, classYN var1, int var2) {
      try {
         int var3 = classXY.method13039(var0, -346779531);
         if (var1 == null) {
            int var4 = classBZ.method1385(var3, -323192748);
            var1 = new classYN(var4);
         }

         for (int var9 = 0; var9 < var3; var9++) {
            if (var2 != 1978086108) {
               throw new IllegalStateException();
            }

            int var5 = classXY.method13039(var0, -346779531);
            int var6 = var0.method13051(-758448158);
            Object var7;
            if (var5 == 1) {
               if (var2 != 1978086108) {
                  throw new IllegalStateException();
               }

               var7 = new classVE(var0.method13071(-505567903));
            } else if (var5 == 2) {
               var7 = new classVK(var0.method13059(1592033524));
            } else {
               var7 = new classVG(var0.method13056((byte)1));
            }

            classYN.method13576(var1, (classVQ)var7, var6);
         }

         return var1;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "qh.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqh;I)Z")
   @ObfuscatedName("fm")
   public static boolean method9534(classQH var0, int var1) {
      return var1 >= var0.field5540 * -1966181807 && var1 < -1432447279 * var0.field5538;
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("ax")
   public void method9522(int var1, int var2, boolean var3) {
      this.field5540 = 1718621873 * var1;
      this.field5538 = -376511642 * var2;
      this.field5539 = var3;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   public boolean method9531(int var1) {
      return -1966181807 * this.field5540 > -2060505227 * this.field5541 && -1966181807 * this.field5540 <= var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("al")
   public boolean method9527() {
      return this.field5539;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ar")
   public boolean method9532(int var1) {
      return -1966181807 * this.field5540 > -2060505227 * this.field5541 && -1966181807 * this.field5540 <= var1;
   }

   @ObfuscatedSignature(descriptor = "(Lqh;II)Z")
   @ObfuscatedName("ea")
   public static boolean method9536(classQH var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method9541(var1, var1);
      } else {
         try {
            if (!var0.method9535(var1, (short)15858)) {
               if (var2 >= 659647835) {
                  throw new IllegalStateException();
               }

               if (var1 >= var0.field5538 * -1432447279) {
                  if (var2 >= 659647835) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            return false;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "qh.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)Z")
   @ObfuscatedName("ab")
   public boolean method9535(int var1, short var2) {
      try {
         boolean var10000;
         if (var1 >= this.field5540 * -1966181807 && var1 < -1432447279 * this.field5538) {
            if (var2 == 255) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qh.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqh;IIZI)V")
   @ObfuscatedName("mx")
   public static void method9523(classQH var0, int var1, int var2, boolean var3, int var4) {
      if (var0 == null) {
         var0.method9524(var1, var1, var3, var1);
      } else {
         try {
            var0.field5540 = 1718621873 * var1;
            var0.field5538 = 1071612465 * var2;
            var0.field5539 = var3;
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "qh.az(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lclient;)V")
   @ObfuscatedName("tj")
   public static void method9546(client var0) {
      if (var0 == null) {
         var0.isDraggingWidget();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ai")
   public boolean method9537(int var1) {
      return !this.method9535(var1, (short)-24461) && var1 >= this.field5538 * -1432447279;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ap")
   public boolean method9538(int var1) {
      return !this.method9535(var1, (short)-609) && var1 >= this.field5538 * -1432447279;
   }

   @ObfuscatedSignature(descriptor = "(Lqh;II)V")
   @ObfuscatedName("oz")
   public static void method9543(classQH var0, int var1, int var2) {
      if (var0 == null) {
         var0.method9544(var1, var1);
      }

      try {
         var0.field5541 = var1 * -537204515;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qh.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("af")
   public boolean method9539(int var1) {
      return !this.method9535(var1, (short)-24992) && var1 >= this.field5538 * -1432447279;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   public boolean method9528() {
      return this.field5539;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("afb")
   protected static final boolean method9545(int var0) {
      try {
         return classTQ.field6198.method10819(-1914370237);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qh.afb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ae")
   public boolean method9533(int var1, int var2) {
      try {
         if (-1966181807 * this.field5540 > -2060505227 * this.field5541) {
            if (var2 == -708993696) {
               throw new IllegalStateException();
            }

            if (-1966181807 * this.field5540 <= var1) {
               if (var2 == -708993696) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qh.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqh;)Z")
   @ObfuscatedName("ze")
   public static boolean method9529(classQH var0) {
      return var0.field5539;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqh;I)Z")
   @ObfuscatedName("eg")
   public static boolean method9540(classQH var0, int var1) {
      return var0 == null ? var0.method9530(var1) : !var0.method9535(var1, (short)-7062) && var1 >= var0.field5538 * -1432447279;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("as")
   public void method9544(int var1, int var2) {
      try {
         this.field5540 = var1 * -537204515;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qh.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZI)V")
   @ObfuscatedName("az")
   public void method9524(int var1, int var2, boolean var3, int var4) {
      try {
         this.field5540 = 1718621873 * var1;
         this.field5538 = 1071612465 * var2;
         this.field5539 = var3;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "qh.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   public boolean method9541(int var1, int var2) {
      try {
         if (!this.method9535(var1, (short)15858)) {
            if (var2 >= 659647835) {
               throw new IllegalStateException();
            }

            if (var1 >= this.field5538 * -1432447279) {
               if (var2 >= 659647835) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qh.ag(" + ')');
      }
   }
}
