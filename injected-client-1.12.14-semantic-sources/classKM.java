import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("km")
public class classKM {
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field3371 = 64;
   @ObfuscatedName("at")
   final int[][] field3365;
   @ObfuscatedName("ag")
   final int[] field3364;
   @ObfuscatedName("an")
   final int[] field3367;
   @ObfuscatedName("ae")
   final int field3368;
   @ObfuscatedName("av")
   final int[][] field3366;
   @ObfuscatedName("ak")
   int field3370;
   @ObfuscatedName("aj")
   int field3369;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field3372 = 1076101408;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkm;)[I")
   @ObfuscatedName("zh")
   public static int[] method6491(classKM var0) {
      if (var0 == null) {
         var0.method6488();
      }

      return var0.field3364;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method6471(int var1) {
      try {
         for (int var2 = 0; var2 < this.field3366.length; var2++) {
            for (int var3 = 0; var3 < this.field3366[var2].length; var3++) {
               if (var1 == -850402832) {
                  throw new IllegalStateException();
               }

               this.field3366[var2][var3] = 0;
               this.field3365[var2][var3] = 99999999;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "km.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("at")
   void method6473(int var1, int var2, int var3) {
      try {
         this.field3369 = 949502665 * var1;
         this.field3370 = var2 * -1752403085;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "km.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ag")
   int method6476(byte var1) {
      try {
         return this.field3369 * -896174215;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   int method6479(int var1) {
      try {
         return this.field3370 * -1638078021;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ae")
   int method6480(byte var1) {
      try {
         return this.field3366.length;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aj")
   int method6481(byte var1) {
      try {
         return this.field3366[0].length;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[[I")
   @ObfuscatedName("ak")
   int[][] method6484(byte var1) {
      try {
         return this.field3366;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)[[I")
   @ObfuscatedName("aw")
   int[][] method6487(short var1) {
      try {
         return this.field3365;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ap")
   int[] method6492(int var1) {
      try {
         return this.field3364;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ay")
   int[] method6495(int var1) {
      try {
         return this.field3367;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("as")
   void method6474(int var1, int var2) {
      this.field3369 = -516429734 * var1;
      this.field3370 = var2 * -1752403085;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   int method6477() {
      return this.field3369 * -896174215;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("aa")
   int[][] method6488() {
      return this.field3365;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("aq")
   int[][] method6489() {
      return this.field3365;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   int method6478() {
      return this.field3369 * -896174215;
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("au")
   int method6499(short var1) {
      try {
         return this.field3368 * -1803700773;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "km.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bz")
   int[] method6493() {
      return this.field3364;
   }

   classKM(int var1, int var2) {
      this.field3366 = new int[var1][var2];
      this.field3365 = new int[var1][var2];
      int var3 = var1 * var2;
      int var4 = class161.method4253(var3 / 4, (byte)0);
      this.field3364 = new int[var4];
      this.field3367 = new int[var4];
      this.field3368 = (var4 - 1) * 1971928659;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   int method6482() {
      return this.field3366[0].length;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("be")
   int[][] method6485() {
      return this.field3366;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bb")
   int[] method6496() {
      return this.field3367;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   int method6500() {
      return this.field3368 * 1688039754;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("bo")
   int[][] method6490() {
      return this.field3365;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("bg")
   int[][] method6486() {
      return this.field3366;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bj")
   int[] method6497() {
      return this.field3367;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bk")
   int[] method6494() {
      return this.field3364;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   void method6475(int var1, int var2) {
      this.field3369 = 949502665 * var1;
      this.field3370 = var2 * -1752403085;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bm")
   int[] method6498() {
      return this.field3367;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   int method6483() {
      return this.field3366[0].length;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkm;)V")
   @ObfuscatedName("mr")
   public static void method6472(classKM var0) {
      if (var0 == null) {
         var0.method6478();
      }

      for (int var1 = 0; var1 < var0.field3366.length; var1++) {
         for (int var2 = 0; var2 < var0.field3366[var1].length; var2++) {
            var0.field3366[var1][var2] = 0;
            var0.field3365[var1][var2] = 216553613;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   int method6501() {
      return this.field3368 * -1803700773;
   }
}
