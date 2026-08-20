import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vk")
public class classVK extends Node {
   @ObfuscatedName("az")
   public long field6517;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luj;)V")
   @ObfuscatedName("kt")
   public static void method11964(classUJ var0) {
      if (var0 == null) {
         var0.method11336();
      }

      try {
         while (true) {
            classVU var1;
            synchronized (classUJ.field6313) {
               var1 = (classVU)classUJ.field6313.method7915();
            }

            if (var1 != null) {
               if (0 == var1.field6607 * -1312025255) {
                  classUS.method11531(var1.field6608, (int)var1.field6552, var1.field6610, var1.field6610.length, 665812228);
                  synchronized (classUJ.field6313) {
                     var1.vmethod398();
                  }
               } else if (var1.field6607 * -452974526 == 1) {
                  var1.field6610 = var1.field6608.method11527((int)var1.field6552, -1142684788);
                  synchronized (classUJ.field6313) {
                     classNN.method7900(classUJ.field6316, var1);
                  }
               }

               synchronized (classUJ.field6315) {
                  if (classUJ.field6314 * 508619279 <= 1) {
                     classUJ.field6314 = 0;
                     classUJ.field6315.notifyAll();
                     return;
                  }

                  classUJ.field6314 = 2125268663;
               }
            } else {
               Friend.method10149(100L);
               synchronized (classUJ.field6315) {
                  if (508619279 * classUJ.field6314 <= 1) {
                     classUJ.field6314 = 0;
                     classUJ.field6315.notifyAll();
                     return;
                  }

                  classUJ.field6314 -= 379503855;
               }
            }
         }
      } catch (Exception var13) {
         classAAU.method275(null, var13, (byte)53);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lup;)F")
   @ObfuscatedName("pe")
   public static float method11966(classUP var0) {
      return classED.method3828(var0.field6362 * 1379695375, 1196830319);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lps;)I")
   @ObfuscatedName("kb")
   public static int method11967(WorldMapElement var0) {
      return var0.field5405 * 872689451;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)Z")
   @ObfuscatedName("zc")
   public static boolean method11965(classBM var0) {
      return var0.field509;
   }

   public classVK(long var1) {
      this.field6517 = var1;
   }
}
