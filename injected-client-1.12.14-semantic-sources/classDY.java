import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dy")
public class classDY {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1529 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field1528 = 24;
   @ObfuscatedName("ag")
   int field1525;
   @ObfuscatedName("an")
   int field1526;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1527 = 17;
   @ObfuscatedName("at")
   int field1524;
   @ObfuscatedName("av")
   int field1523;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   int method3596() {
      return 1024858103 * this.field1523;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   int method3597(int var1) {
      try {
         return 1024858103 * this.field1523;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dy.av(" + 41);
      }
   }

   classDY(int var1, int var2, int var3, int var4) {
      this.field1523 = -1344939577 * var1;
      this.field1524 = var2 * 1613973385;
      this.field1525 = var3 * -411793309;
      this.field1526 = 747848785 * var4;
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ag")
   int method3601(short var1) {
      try {
         return this.field1525 * 1558853963;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dy.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("an")
   int method3600(byte var1) {
      try {
         return -117088583 * this.field1524;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dy.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   int method3603() {
      return this.field1526 * 1454671025;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;Ljava/lang/String;I)I")
   @ObfuscatedName("ub")
   public static int method3606(ClanSettings var0, String var1, int var2) {
      if (var0 == null) {
         var0.method4349(var1, var2);
      }

      return var0.method4347(var1);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   public static boolean method3598(int var0, int var1) {
      try {
         boolean var10000;
         if (0 != (var0 >> 20 & 1)) {
            if (var1 >= 1392503314) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dy.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   int method3602() {
      return this.field1525 * 1558853963;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method3604() {
      return this.field1526 * 1454671025;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("at")
   int method3605(byte var1) {
      try {
         return this.field1526 * 1454671025;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dy.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   int method3599() {
      return 1024858103 * this.field1523;
   }
}
