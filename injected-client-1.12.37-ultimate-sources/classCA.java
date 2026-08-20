import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ca")
final class classCA implements classLM {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field635 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final String field637 = "clk";
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field636 = 3;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method1393(int var0) {
      try {
         classJZ.method6431(classOD.field4820);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ca.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod147(int var1) {
      try {
         if (this.val$item.method7294(1681066350).field4425 != null) {
            classZR var2 = classZS.method14182(
               classUQ.method11465(this.val$item, 1351188757).method14145(this.val$item.method7294(831022479).field4425, (byte)2), (byte)60
            );
            client.field823.method9658(var2, 1697206599);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ca.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   @Override
   public void vmethod148() {
      if (this.val$item.method7294(-1689102841).field4425 != null) {
         classZR var1 = classZS.method14182(
            classUQ.method11465(this.val$item, 1798756905).method14145(this.val$item.method7294(-1682057913).field4425, (byte)2), (byte)30
         );
         client.field823.method9658(var1, 1697206599);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod149() {
      if (this.val$item.method7294(-1868444860).field4425 != null) {
         classZR var1 = classZS.method14182(
            classUQ.method11465(this.val$item, 1634000256).method14145(this.val$item.method7294(1217704895).field4425, (byte)2), (byte)93
         );
         client.field823.method9658(var1, 1697206599);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   @Override
   public void vmethod150() {
      if (this.val$item.method7294(633115180).field4425 != null) {
         classZR var1 = classZS.method14182(
            classUQ.method11465(this.val$item, 400907152).method14145(this.val$item.method7294(-560912922).field4425, (byte)2), (byte)50
         );
         client.field823.method9658(var1, 1697206599);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)Z")
   @ObfuscatedName("gq")
   public static boolean method1395(classLH var0) {
      if (var0 == null) {
         var0.method7006();
      }

      if (!var0.method6998((byte)-83)) {
         return false;
      } else {
         boolean var1 = false;
         if (var0.field4159.method13850(1524979700) > var0.field4142 * 1701882209) {
            var0.field4159.method13893(var0.field4142 * 1701882209, var0.field4159.method13850(-465672214), 841198054);
            var1 = true;
         }

         int var2 = classLH.method7014(var0, -2118783281);
         if (var0.field4159.method13913(-1578415338) > var2) {
            int var3 = classZD.method13901(var0.field4159, 0, var2, -461842083) - 1;
            var0.field4159.method13893(var3, var0.field4159.method13850(1863939241), 1152939592);
            var1 = true;
         }

         if (var1) {
            int var6 = -698145269 * var0.field4157;
            int var4 = 1072642345 * var0.field4152;
            int var5 = var0.field4159.method13850(-1402302409);
            if (var0.field4157 * -698145269 > var5) {
               var6 = var5;
            }

            if (1072642345 * var0.field4152 > var5) {
               var4 = var5;
            }

            classLH.method6882(var0, var4, var6, 1122842785);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod151() {
      if (this.val$item.method7294(1727865402).field4425 != null) {
         classZR var1 = classZS.method14182(
            classUQ.method11465(this.val$item, 154611908).method14145(this.val$item.method7294(-467736828).field4425, (byte)2), (byte)111
         );
         client.field823.method9658(var1, 1697206599);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lzs;")
   @ObfuscatedName("af")
   public static classZS method1392(int var0, int var1) {
      try {
         classZS var3 = new classZS();
         var3.field7269 = 790618167 * var0;
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ca.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CLxo;B)I")
   @ObfuscatedName("ae")
   static int method1394(char var0, classXO var1, byte var2) {
      try {
         int var3;
         label32: {
            var3 = var0 << 4;
            if (!Character.isUpperCase(var0)) {
               if (var2 <= 46) {
                  throw new IllegalStateException();
               }

               if (!Character.isTitleCase(var0)) {
                  break label32;
               }

               if (var2 <= 46) {
                  throw new IllegalStateException();
               }
            }

            var0 = Character.toLowerCase(var0);
            var3 = 1 + (var0 << 4);
         }

         if (241 == var0 && classXO.field6894 == var1) {
            var3 = 1762;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ca.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("go")
   static final int method1396(int var0) {
      try {
         return classKF.field3571.vmethod393(826200091);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ca.go(" + 41);
      }
   }

   classCA(classLW var1) {
      this.val$item = var1;
   }
}
