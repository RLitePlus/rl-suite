import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jl")
public class classJL extends classVQ {
   @ObfuscatedSignature(descriptor = "Lxs;")
   @ObfuscatedName("ac")
   public classXS field3343;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3336 = 10000;
   @ObfuscatedSignature(descriptor = "[Ljl;")
   @ObfuscatedName("ab")
   static classJL[] field3333 = new classJL[300];
   @ObfuscatedName("ag")
   static int field3334 = 0;
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("as")
   classJS field3342;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field3340 = 512;
   @ObfuscatedName("ax")
   int field3339;
   @ObfuscatedName("aa")
   public int field3335;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field3337 = 39;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3341 = 260;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3338 = 24;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method6387() {
      if (1275112637 * field3334 < field3333.length) {
         field3333[(field3334 += 766488213) * 1275112637 - 1] = this;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   public void method6388(int var1) {
      try {
         if (1275112637 * field3334 < field3333.length) {
            field3333[(field3334 += 766488213) * 1275112637 - 1] = this;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "jl.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljl;")
   @ObfuscatedName("ay")
   public static classJL method6384() {
      classJL var0 = classFJ.method4793(1410588756);
      var0.field3342 = null;
      var0.field3339 = 0;
      var0.field3343 = new classXS(5000);
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljl;")
   @ObfuscatedName("as")
   static classJL method6378() {
      return 1275112637 * field3334 == 0 ? new classJL() : field3333[(field3334 -= 766488213) * 1275112637];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljl;)V")
   @ObfuscatedName("va")
   public static void method6389(classJL var0) {
      if (var0 == null) {
         var0.method6387();
      }

      if (1275112637 * field3334 < field3333.length) {
         field3333[(field3334 += 766488213) * 1275112637 - 1] = var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljs;Lyt;)Ljl;")
   @ObfuscatedName("ao")
   public static classJL method6382(classJS var0, classYT var1) {
      classJL var2 = classFJ.method4793(2109786031);
      var2.field3342 = var0;
      var2.field3339 = -1950310809 * var0.field3371;
      if (-1669214905 * var2.field3339 == -1) {
         var2.field3343 = new classXS(260);
      } else if (-1669214905 * var2.field3339 == -2) {
         var2.field3343 = new classXS(10000);
      } else if (var2.field3339 * -1669214905 <= 18) {
         var2.field3343 = new classXS(20);
      } else if (var2.field3339 * -1669214905 <= 98) {
         var2.field3343 = new classXS(100);
      } else {
         var2.field3343 = new classXS(260);
      }

      var2.field3343.method12894(var1, -867900324);
      var2.field3343.method12900(var2.field3342.field3372 * 484572505, (byte)3);
      var2.field3335 = 0;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljl;")
   @ObfuscatedName("ac")
   static classJL method6379() {
      return 1275112637 * field3334 == 0 ? new classJL() : field3333[(field3334 -= 766488213) * 1275112637];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljs;Lyt;)Ljl;")
   @ObfuscatedName("aa")
   public static classJL method6383(classJS var0, classYT var1) {
      classJL var2 = classFJ.method4793(2128648648);
      var2.field3342 = var0;
      var2.field3339 = -1950310809 * var0.field3371;
      if (-1669214905 * var2.field3339 == -1) {
         var2.field3343 = new classXS(260);
      } else if (-1669214905 * var2.field3339 == -2) {
         var2.field3343 = new classXS(10000);
      } else if (var2.field3339 * -1669214905 <= 18) {
         var2.field3343 = new classXS(20);
      } else if (var2.field3339 * -1669214905 <= 98) {
         var2.field3343 = new classXS(100);
      } else {
         var2.field3343 = new classXS(260);
      }

      var2.field3343.method12894(var1, -1341633633);
      var2.field3343.method12900(var2.field3342.field3372 * 484572505, (byte)75);
      var2.field3335 = 0;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljl;")
   @ObfuscatedName("aj")
   public static classJL method6385() {
      classJL var0 = classFJ.method4793(1619799152);
      var0.field3342 = null;
      var0.field3339 = 0;
      var0.field3343 = new classXS(5000);
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljl;")
   @ObfuscatedName("al")
   public static classJL method6386() {
      classJL var0 = classFJ.method4793(1568205369);
      var0.field3342 = null;
      var0.field3339 = 0;
      var0.field3343 = new classXS(5000);
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljl;")
   @ObfuscatedName("ag")
   static classJL method6380() {
      return 1275112637 * field3334 == 0 ? new classJL() : field3333[(field3334 -= 766488213) * 1275112637];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)I")
   @ObfuscatedName("el")
   public static int method6391(classCY var0) {
      return var0.field1344 * -1030221399;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljl;")
   @ObfuscatedName("ax")
   static classJL method6381() {
      return 1275112637 * field3334 == 0 ? new classJL() : field3333[(field3334 -= 766488213) * 1479425096];
   }

   classJL() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method6390() {
      if (1275112637 * field3334 < field3333.length) {
         field3333[(field3334 += 766488213) * 1275112637 - 1] = this;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[B")
   @ObfuscatedName("ab")
   public static byte[] method6392(byte var0) {
      try {
         byte[] var1 = new byte[24];

         try {
            classME.field4490.method138(0L);
            classME.field4490.method142(var1, 1861877066);

            int var2;
            for (var2 = 0; var2 < 24; var2++) {
               if (0 != var1[var2]) {
                  if (var0 != 0) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            }

            if (var2 >= 24) {
               if (var0 != 0) {
                  throw new IllegalStateException();
               }

               throw new IOException();
            }
         } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
               if (var0 != 0) {
                  throw new IllegalStateException();
               }

               var1[var3] = -1;
            }
         }

         return var1;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "jl.ab(" + ')');
      }
   }
}
