import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iz")
public class classIZ extends classHB {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field3103 = 13;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field3101 = 64;
   @ObfuscatedName("az")
   int field3100;
   @ObfuscatedName("af")
   boolean field3105;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field3102 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("cp")
   static final int field3104 = 16;

   classIZ(classIF var1) {
      this.this$0 = var1;
      this.field3100 = -1376629843;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         this.field3100 = classXY.method13047(var1, -1009266385) * 1376629843;
         this.field3105 = classXY.method13039(var1, -346779531) == 1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iz.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)I")
   @ObfuscatedName("tc")
   public static int method6341(classVA var0) {
      if (var0 == null) {
         var0.method11834();
      }

      return var0.field6442 * -442718787;
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(classIQ var1, byte var2) {
      try {
         classIQ.method6276(var1, 800501723 * this.field3100, this.field3105, 2072579966);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iz.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      this.field3100 = classXY.method13047(var1, -1334039576) * 1376629843;
      this.field3105 = classXY.method13039(var1, -346779531) == 1;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(classIQ var1) {
      classIQ.method6276(var1, -2086270710 * this.field3100, this.field3105, 1901524512);
   }

   @ObfuscatedSignature(descriptor = "(Luz;Luz;I)Luz;")
   @ObfuscatedName("as")
   public static final classUZ method6340(classUZ var0, classUZ var1, int var2) {
      try {
         classUZ var3 = classGX.method5840(var0, (byte)-35);
         var3.method11768(var1, -1351554887);
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "iz.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;II)I")
   @ObfuscatedName("cp")
   public static int method6342(classOP var0, int var1, int var2) {
      return classGQ.method5602(var0.field5032, var1, var2, 457021445);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(classIQ var1) {
      classIQ.method6276(var1, 800501723 * this.field3100, this.field3105, 1923317305);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(classIQ var1) {
      classIQ.method6276(var1, 800501723 * this.field3100, this.field3105, 2070297393);
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("az")
   public static int method6339(int var0, byte var1) {
      try {
         return var0 >> 20 & 2047;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "iz.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      this.field3100 = classXY.method13047(var1, -236751831) * 1376629843;
      this.field3105 = classXY.method13039(var1, -346779531) == 1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)I")
   @ObfuscatedName("az")
   public static int method6338(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = 0;
         if (var0 < var2) {
            if (var6 >= -852633712) {
               throw new IllegalStateException();
            }

            var7 += var2 - var0;
         } else if (var0 > var4) {
            if (var6 >= -852633712) {
               throw new IllegalStateException();
            }

            var7 += var0 - var4;
         }

         if (var1 < var3) {
            if (var6 >= -852633712) {
               throw new IllegalStateException();
            }

            var7 += var3 - var1;
         } else if (var1 > var5) {
            if (var6 >= -852633712) {
               throw new IllegalStateException();
            }

            var7 += var1 - var5;
         }

         return var7;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "iz.az(" + 41);
      }
   }
}
