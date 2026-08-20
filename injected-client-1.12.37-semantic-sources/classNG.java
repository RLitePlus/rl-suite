import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ng")
class classNG implements Callable {
   @ToRemove(unused = "true")
   @ObfuscatedName("cn")
   static final int field4670 = 3;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lek;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("vj")
   public static int method7836(classEK var0, Object var1, Object var2) {
      return var0 == null ? var0.method3907(var1, var1) : var0.method3905((Buddy)var1, (Buddy)var2, (short)31267);
   }

   @Override
   public Object call() {
      try {
         PriorityQueue var1 = this.this$0.field4757;

         while (true) {
            Object var2 = null;
            synchronized (var1) {
               if (var1.isEmpty() || this.val$cancelled.get()) {
                  return null;
               }

               var2 = (classNS)var1.remove();
            }

            classAU.method704(((classNS)var2).field4716, 1321256158);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ng.call(" + ')');
      }
   }

   classNG(classNU var1, AtomicBoolean var2) {
      this.this$0 = var1;
      this.val$cancelled = var2;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("az")
   public Object method7838() {
      PriorityQueue var1 = this.this$0.field4757;

      while (true) {
         Object var2 = null;
         synchronized (var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (classNS)var1.remove();
         }

         classAU.method704(((classNS)var2).field4716, 1959768971);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("af")
   public Object method7839() {
      PriorityQueue var1 = this.this$0.field4757;

      while (true) {
         Object var2 = null;
         synchronized (var1) {
            if (var1.isEmpty() || this.val$cancelled.get()) {
               return null;
            }

            var2 = (classNS)var1.remove();
         }

         classAU.method704(((classNS)var2).field4716, 842700106);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnm;)Ljava/lang/String;")
   @ObfuscatedName("el")
   public static String method7840(classNM var0) {
      return var0.field4688;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;I)V")
   @ObfuscatedName("cl")
   static void method7841(WorldView var0, int var1) {
      try {
         int var2 = client.field837.field1419 * -2087374717;
         int[] var3 = client.field837.field1423;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1 != 1770667891) {
               throw new IllegalStateException();
            }

            if (var3[var4] != client.field971 * 927693091) {
               if (var1 != 1770667891) {
                  throw new IllegalStateException();
               }

               if (var3[var4] != client.field845 * -2130951373) {
                  classDV.method3627(var0, var3[var4], true, 1805215117);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ng.cl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILcl;I)Luz;")
   @ObfuscatedName("aa")
   static classUZ method7837(int var0, int var1, int var2, int var3, classCL var4, int var5) {
      try {
         classUZ var6 = null;
         WorldView var7 = null;
         if (classBZ.method1381(var0, (byte)-59)) {
            boolean var10000;
            if (var0 > 0) {
               if (var5 >= -314200228) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var9 = var10000;
            Object var8;
            if (var9) {
               if (var5 >= -314200228) {
                  throw new IllegalStateException();
               }

               int var10 = classHI.method6057(var0, -390386984);
               var7 = classHB.method5990(var10, var4, -1845572351);
               var8 = (Actor)var7.field1698.method13404(var10);
            } else {
               int var17 = classGA.method5290(var0, -1282125261);
               var7 = classQB.method9434(var17, var4, 1290700236);
               var8 = var7.method3737(var17, (byte)1);
            }

            if (var8 != null) {
               if (var5 >= -314200228) {
                  throw new IllegalStateException();
               }

               classKY var18 = ((Actor)var8).method3162(var7, (short)8639);
               var6 = classHZ.method6135(16777216);
               var6.field6427 = 1870919123 * var18.field4055;
               var6.field6426 = var18.field4056 * 819227381;
            }
         }

         if (var6 == null) {
            if (var5 >= -314200228) {
               throw new IllegalStateException();
            }

            var7 = var4.method1596(var1, var2, -168421765);
            int var15 = var1 - -1444178379 * var7.field1709;
            int var16 = var2 - -351145363 * var7.field1708;
            WorldEntity var19 = (WorldEntity)classCL.method1592(var4, 1101306946).worldEntities.method13595(2140889407 * var7.field1699);
            if (var19 != null) {
               if (var5 >= -314200228) {
                  throw new IllegalStateException();
               }

               var6 = var19.method10620(classKY.method6612(var15, 107638560), classKY.method6612(var16, 25081989), (byte)67);
            } else {
               var6 = classIK.method6218(classKY.method6612(var15, 858107525), 0.0F, classKY.method6612(var16, 113134476), (byte)-8);
            }
         }

         int var20 = (int)var6.field6427;
         int var11 = (int)var6.field6426;
         int var12 = classKV.method6571(var7, var20, var11, var3, (byte)122);
         WorldEntity var13 = (WorldEntity)classIS.field3053.worldEntities.method13595(var7.field1699 * 2140889407);
         if (null != var13) {
            var12 += classKV.method6571(classIS.field3053, var13.vmethod368(311606126), var13.vmethod371(-2097434147), var13.vmethod258((byte)-99), (byte)122);
         }

         var6.field6425 = var12;
         return var6;
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "ng.aa(" + ')');
      }
   }
}
