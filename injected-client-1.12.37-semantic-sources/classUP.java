import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("up")
public class classUP {
   @ObfuscatedName("az")
   int field6362 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field6364 = 7;
   @ObfuscatedName("ar")
   static int field6363;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("zg")
   public int method11453() {
      int var2 = this.field6362 * 1379695375;
      return var2 >> 3;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bl")
   public void method11456(int var1) {
      this.field6362 = (this.field6362 * 1379695375 + var1 & classCS.method2576(-1520924805)) * -1993796625;
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ac")
   public void method11426(int var1, int var2, byte var3) {
      try {
         var1 &= classCS.method2576(-1520924805);
         var2 &= classCS.method2576(-1520924805);
         this.field6362 = Math.max(var1, Math.min(var2, 1379695375 * this.field6362)) * -1993796625;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "up.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("ba")
   public float method11439() {
      int var2 = this.field6362 * 1379695375;
      int var4 = var2 & 16383;
      return (float)(3.834951969714103E-4 * var4);
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ao")
   public int method11436(short var1) {
      try {
         return 1379695375 * this.field6362;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "up.ao(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public int method11443(int var1) {
      try {
         int var3 = this.field6362 * 1379695375;
         return classBF.method997(var3, (byte)-79);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "up.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("aq")
   public float method11449(int var1) {
      try {
         return classED.method3828(this.field6362 * 1379695375, 1196830319);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "up.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)F")
   @ObfuscatedName("ad")
   public float method11451(byte var1) {
      try {
         int var3 = this.field6362 * 1379695375;
         return classGB.field2539[var3];
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "up.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int method11454(int var1) {
      try {
         int var3 = this.field6362 * 1379695375;
         return var3 >> 3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "up.ap(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public static int method11415(int var0) {
      return Actor.method3082(var0, 2028453267);
   }

   @ObfuscatedSignature(descriptor = "(Lup;B)I")
   @ObfuscatedName("rn")
   public static int method11445(classUP var0, byte var1) {
      if (var0 == null) {
         var0.method11448(var1);
      }

      try {
         return classLL.method7119(var0.field6362 * 1379695375, 1222866659);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "up.ay(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public static int method11421() {
      return 16383;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method11461() {
      return method11445(this, (byte)-45);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("aw")
   static float method11417(int var0) {
      return classGB.field2538[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ak")
   static float method11418(int var0) {
      return classGB.field2538[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   public static int method11419() {
      return 16384;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method11462() {
      return this.method11443(1486466529);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public static int method11416(int var0) {
      return Actor.method3082(var0, 1974396234);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("ht")
   public float method11463() {
      return this.method11451((byte)111);
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("al")
   public float method11440(int var1) {
      try {
         int var3 = this.field6362 * 1379695375;
         int var5 = var3 & 16383;
         return (float)(3.834951969714103E-4 * var5);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "up.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public static int method11422() {
      return 16383;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(D)I")
   @ObfuscatedName("ah")
   public static int method11424(double var0) {
      return (int)(2607.5945876176133 * var0) & -328054676;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("bo")
   public float method11441() {
      int var2 = this.field6362 * 166390186;
      int var4 = var2 & 16383;
      return (float)(3.834951969714103E-4 * var4);
   }

   @ObfuscatedSignature(descriptor = "(Lup;II)V")
   @ObfuscatedName("ff")
   public static void method11457(classUP var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11435(var1, var1);
      } else {
         try {
            var0.field6362 = (var0.field6362 * 1379695375 + var1 & classCS.method2576(-1520924805)) * -1993796625;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "up.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bx")
   public void method11427(int var1, int var2) {
      var1 &= classCS.method2576(-1520924805);
      var2 &= classCS.method2576(-1520924805);
      this.field6362 = Math.max(var1, Math.min(var2, 1379695375 * this.field6362)) * -1993796625;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("gy")
   public float method11464() {
      return this.method11449(2092171063);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lup;)F")
   @ObfuscatedName("st")
   public static float method11442(classUP var0) {
      if (var0 == null) {
         var0.method11438();
      }

      int var2 = var0.field6362 * 1379695375;
      int var4 = var2 & 16383;
      return (float)(3.834951969714103E-4 * var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public static int method11423() {
      return 16383;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lup;)I")
   @ObfuscatedName("vk")
   public static int method11446(classUP var0) {
      return classLL.method7119(var0.field6362 * 1379695375, 1222866659);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bp")
   public void method11428(int var1, int var2) {
      var1 &= classCS.method2576(-1520924805);
      var2 &= classCS.method2576(-1520924805);
      this.field6362 = Math.max(var1, Math.min(var2, 1379695375 * this.field6362)) * -3930023;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("br")
   public void method11430(int var1) {
      this.field6362 = (var1 & classCS.method2576(-1520924805)) * -1993796625;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bm")
   public void method11431(int var1) {
      this.field6362 = (var1 & classCS.method2576(-1520924805)) * -1993796625;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bt")
   public void method11432(int var1) {
      this.field6362 = (var1 & classCS.method2576(-1520924805)) * 648604933;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bg")
   public void method11433(int var1) {
      this.field6362 = (var1 & classCS.method2576(-1520924805)) * -1993796625;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bw")
   public int method11437() {
      return 1379695375 * this.field6362;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ka")
   public int method11438() {
      return -2074684870 * this.field6362;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bn")
   public static int method11425(int var0) {
      return var0 << 3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   public int method11444() {
      int var2 = this.field6362 * 1379695375;
      return classBF.method997(var2, (byte)-28);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aa")
   public void method11434(int var1, int var2) {
      try {
         this.field6362 = (var1 & classCS.method2576(-1520924805)) * -1993796625;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "up.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   public int method11447() {
      return classLL.method7119(this.field6362 * -990654914, 1222866659);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("be")
   public float method11450() {
      return classED.method3828(this.field6362 * 1379695375, 1196830319);
   }

   public classUP(int var1) {
      this.field6362 = (var1 & classCS.method2576(-1520924805)) * -1993796625;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("bf")
   public float method11452() {
      int var2 = this.field6362 * 1379695375;
      return classGB.field2539[var2];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bi")
   public int method11455() {
      int var2 = this.field6362 * 931288241;
      return var2 >> 3;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bv")
   public void method11458(int var1) {
      this.field6362 = (this.field6362 * 1379695375 + var1 & classCS.method2576(-1520924805)) * -1993796625;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bh")
   public void method11459(int var1) {
      this.field6362 = (this.field6362 * 1379695375 + var1 & classCS.method2576(-1520924805)) * 259646430;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bz")
   public void method11460(int var1) {
      this.field6362 = (this.field6362 * 277125606 + var1 & classCS.method2576(-1520924805)) * -1993796625;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ILjava/lang/StringBuilder;Lqi;B)Ljava/lang/String;")
   @ObfuscatedName("az")
   public static String method11420(String var0, int var1, StringBuilder var2, classQI var3, byte var4) {
      try {
         if (null == var0) {
            if (var4 != 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (var0.isEmpty()) {
            if (var4 != 0) {
               throw new IllegalStateException();
            } else {
               return var0;
            }
         } else {
            String var5;
            try {
               var5 = classLA.method6656(var0, var1, var2, var3, -1453270208);
            } finally {
               var2.setLength(0);
               var3.method9583(1452371636);
            }

            return var5;
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "up.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ay")
   public int method11448(byte var1) {
      try {
         return classLL.method7119(this.field6362 * 1379695375, 1222866659);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "up.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   public void method11435(int var1, int var2) {
      try {
         this.field6362 = (var1 & classCS.method2576(-1520924805)) * -1993796625;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "up.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bc")
   public void method11429(int var1, int var2) {
      var1 &= classCS.method2576(-1520924805);
      var2 &= classCS.method2576(-1520924805);
      this.field6362 = Math.max(var1, Math.min(var2, 1379695375 * this.field6362)) * -1993796625;
   }
}
