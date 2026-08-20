import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gn")
public class classGN {
   @ObfuscatedName("ax")
   int field2631;
   @ObfuscatedName("az")
   final int[][] field2624;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("an")
   public static classVA field2633;
   @ObfuscatedName("ab")
   final int[] field2623;
   @ObfuscatedName("af")
   final int[][] field2627;
   @ObfuscatedName("as")
   int field2630;
   @ObfuscatedName("ae")
   final int[] field2625;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field2629 = 8;
   @ObfuscatedName("ag")
   final int field2626;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final String field2632 = "wm";
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field2628 = 256;

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ap")
   void method5510(int var1, int var2) {
      this.field2630 = var1 * -1574930361;
      this.field2631 = var2 * -476938375;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("bg")
   int[][] method5530() {
      return this.field2624;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   int method5523() {
      return this.field2627[0].length;
   }

   @ObfuscatedSignature(descriptor = "(Lgn;S)I")
   @ObfuscatedName("vj")
   public static int method5513(classGN var0, short var1) {
      if (var0 == null) {
         return var0.method5517(var1);
      } else {
         try {
            return 1086959991 * var0.field2630;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "gn.ae(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int method5521(int var1) {
      try {
         return this.field2627.length;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   int method5524(int var1) {
      try {
         return this.field2627[0].length;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   int method5514() {
      return 1086959991 * this.field2630;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)I")
   @ObfuscatedName("ey")
   public static int method5525(classGN var0) {
      return var0.field2627[0].length;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("aa")
   int[] method5534(int var1) {
      try {
         return this.field2625;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ao")
   int[] method5537(int var1) {
      try {
         return this.field2623;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method5505() {
      for (int var1 = 0; var1 < this.field2627.length; var1++) {
         for (int var2 = 0; var2 < this.field2627[var1].length; var2++) {
            this.field2627[var1][var2] = 0;
            this.field2624[var1][var2] = 99999999;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgn;B)I")
   @ObfuscatedName("oa")
   public static int method5540(classGN var0, byte var1) {
      if (var0 == null) {
         var0.method5543(var1);
      }

      try {
         return var0.field2626 * -1760234091;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.al(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)I")
   @ObfuscatedName("qe")
   public static int method5526(classGN var0) {
      return var0.field2627[0].length;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("br")
   int method5527() {
      return this.field2627[0].length;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   void method5511(int var1, int var2) {
      this.field2630 = var1 * 1666635716;
      this.field2631 = var2 * 374245466;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method5506() {
      for (int var1 = 0; var1 < this.field2627.length; var1++) {
         for (int var2 = 0; var2 < this.field2627[var1].length; var2++) {
            this.field2627[var1][var2] = 0;
            this.field2624[var1][var2] = 99999999;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgn;I)I")
   @ObfuscatedName("zz")
   public static int method5518(classGN var0, int var1) {
      if (var0 == null) {
         var0.method5520(var1);
      }

      try {
         return 1050179627 * var0.field2631;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   void method5507(byte var1) {
      try {
         for (int var2 = 0; var2 < this.field2627.length; var2++) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            for (int var3 = 0; var3 < this.field2627[var2].length; var3++) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               this.field2627[var2][var3] = 0;
               this.field2624[var2][var3] = 99999999;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gn.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   int method5515() {
      return 1086959991 * this.field2630;
   }

   @ObfuscatedSignature(descriptor = "(I)[[I")
   @ObfuscatedName("ax")
   int[][] method5528(int var1) {
      try {
         return this.field2627;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   int method5516() {
      return 1086959991 * this.field2630;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   int method5519() {
      return 1050179627 * this.field2631;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   int method5522() {
      return this.field2627.length;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("bm")
   int[][] method5529() {
      return this.field2627;
   }

   @ObfuscatedSignature(descriptor = "(S)[[I")
   @ObfuscatedName("ac")
   int[][] method5531(short var1) {
      try {
         return this.field2624;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)V")
   @ObfuscatedName("ot")
   public static void method5508(classGN var0) {
      if (var0 == null) {
         var0.method5509();
      }

      for (int var1 = 0; var1 < var0.field2627.length; var1++) {
         for (int var2 = 0; var2 < var0.field2627[var1].length; var2++) {
            var0.field2627[var1][var2] = 0;
            var0.field2624[var1][var2] = 99999999;
         }
      }
   }

   classGN(int var1, int var2) {
      this.field2627 = new int[var1][var2];
      this.field2624 = new int[var1][var2];
      int var3 = var1 * var2;
      int var4 = classBZ.method1385(var3 / 4, -1689796505);
      this.field2625 = new int[var4];
      this.field2623 = new int[var4];
      this.field2626 = -955404867 * (var4 - 1);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("af")
   void method5512(int var1, int var2, int var3) {
      try {
         this.field2630 = var1 * -1574930361;
         this.field2631 = var2 * 2101118595;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gn.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("bj")
   int[][] method5532() {
      return this.field2624;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bu")
   int[] method5535() {
      return this.field2625;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bk")
   int[] method5536() {
      return this.field2625;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bo")
   int[] method5538() {
      return this.field2623;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bw")
   int method5541() {
      return this.field2626 * -1760234091;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bb")
   int method5542() {
      return this.field2626 * -1760234091;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("bt")
   int[][] method5533() {
      return this.field2624;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   static final void method5544(int var0) {
      try {
         classLP.field4196 = null;
         classOX.field5192 = null;
         classEY.field1983 = 0;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "gn.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   static int method5503(byte var0) {
      try {
         return classDG.method3057(98, 198, (byte)53);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "gn.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Loy;")
   @ObfuscatedName("az")
   public static classOY method5504(int var0, byte var1) {
      try {
         classOY var2 = (classOY)classOY.field5194.method6422(var0);
         if (null != var2) {
            if (var1 != 1) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classOY.field5201.method11867(16, var0, -2032314649);
            var2 = new classOY(new classXY(var3));
            classOY.field5194.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gn.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   int method5520(int var1) {
      try {
         return 1050179627 * this.field2630;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.ab(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)[I")
   @ObfuscatedName("ww")
   public static int[] method5539(classGN var0) {
      return var0.field2623;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("al")
   int method5543(byte var1) {
      try {
         return this.field2626 * -1760234091;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method5509() {
      for (int var1 = 0; var1 < this.field2627.length; var1++) {
         for (int var2 = 0; var2 < this.field2624[var1].length; var2++) {
            this.field2624[var1][var2] = 0;
            this.field2624[var1][var2] = 99999999;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ae")
   int method5517(short var1) {
      try {
         return 1086959991 * this.field2631;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gn.ae(" + 41);
      }
   }
}
