import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rq")
class classRQ implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final String field5832 = "Date not valid.";
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5830 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field5831 = 49;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lxy;)[I")
   @ObfuscatedName("uo")
   public static int[] method10164(classLW var0, classXY var1) {
      if (var0 == null) {
         var0.getYPositionMode();
      }

      int var2 = classXY.method13039(var1, -346779531);
      if (0 == var2) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = var1.method13056((byte)1);
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrq;Lro;Lro;)I")
   @ObfuscatedName("jv")
   public static int method10156(classRQ var0, classRO var1, classRO var2) {
      if (var0 == null) {
         return var0.method10159(var1, var1);
      } else if (-9085244238986792263L * var1.field5823 > -9085244238986792263L * var2.field5823) {
         return 1;
      } else {
         return var1.field5823 * -9085244238986792263L < var2.field5823 * -9085244238986792263L ? -1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V")
   @ObfuscatedName("bx")
   static void method10165(int var0, String var1, int var2) {
      try {
         classBF.field392 = var1;
         classBF.field395 = -570519487 * var0;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rq.bx(" + ')');
      }
   }

   classRQ(classRJ var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lro;Lro;)I")
   @ObfuscatedName("ae")
   int method10157(classRO var1, classRO var2) {
      if (-9085244238986792263L * var1.field5823 > -9085244238986792263L * var2.field5823) {
         return 1;
      } else {
         return var1.field5823 * -9085244238986792263L < var2.field5823 * -9085244238986792263L ? -1 : 0;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rq.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method10162(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method10163(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lro;Lro;I)I")
   @ObfuscatedName("az")
   int method10158(classRO var1, classRO var2, int var3) {
      try {
         if (-9085244238986792263L * var1.field5823 > -9085244238986792263L * var2.field5823) {
            if (var3 <= 399464675) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var1.field5823 * -9085244238986792263L < var2.field5823 * -9085244238986792263L) {
            if (var3 <= 399464675) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rq.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lro;Lro;)I")
   @ObfuscatedName("af")
   int method10159(classRO var1, classRO var2) {
      if (-9085244238986792263L * var1.field5823 > -9085244238986792263L * var2.field5823) {
         return 1;
      } else {
         return var1.field5823 * -9085244238986792263L < var2.field5823 * -9085244238986792263L ? -1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lro;Lro;)I")
   @ObfuscatedName("ag")
   int method10160(classRO var1, classRO var2) {
      if (-9085244238986792263L * var1.field5823 > -9085244238986792263L * var2.field5823) {
         return 1;
      } else {
         return var1.field5823 * -9085244238986792263L < var2.field5823 * -9085244238986792263L ? -1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsp;Lsp;ZB)Z")
   @ObfuscatedName("az")
   public static boolean method10161(classSP var0, classSP var1, boolean var2, byte var3) {
      try {
         if (var0 == var1) {
            if (var3 == 7) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (var1 == null) {
            if (var3 == 7) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (null == var0) {
            if (var3 == 7) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rq.az(" + ')');
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method10158((classRO)var1, (classRO)var2, 1336240482);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rq.compare(" + 41);
      }
   }
}
