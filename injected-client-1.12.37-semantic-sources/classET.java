import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class classET {
   @ObfuscatedName("ac")
   int[] field1909;
   @ObfuscatedName("ae")
   static int[] field1907 = new int[500];
   @ObfuscatedName("az")
   static int[] field1905 = new int[500];
   @ObfuscatedName("ab")
   static int[] field1906 = new int[500];
   @ObfuscatedSignature(descriptor = "Lem;")
   @ObfuscatedName("ag")
   classEM field1911 = null;
   @ObfuscatedName("as")
   int field1913 = -1;
   @ObfuscatedName("ax")
   int[] field1912;
   @ObfuscatedName("aa")
   int[] field1915;
   @ObfuscatedName("af")
   static int[] field1908 = new int[500];
   @ObfuscatedName("ao")
   int[] field1914;
   @ObfuscatedName("al")
   boolean field1910 = false;

   classET(byte[] var1, classEM var2) {
      this.field1911 = var2;
      classXY var3 = new classXY(var1);
      classXY var4 = new classXY(var1);
      var3.field6955 = 2103253898;
      int var5 = classXY.method13039(var3, -346779531);
      int var6 = -1;
      int var7 = 0;
      var4.field6955 = (var3.field6955 * 702114061 + var5) * -1095856699;

      for (int var8 = 0; var8 < var5; var8++) {
         int var9 = classXY.method13039(var3, -346779531);
         if (var9 > 0) {
            if (this.field1911.field1785[var8] != 0) {
               for (int var10 = var8 - 1; var10 > var6; var10--) {
                  if (this.field1911.field1785[var10] == 0) {
                     field1905[var7] = var10;
                     field1908[var7] = 0;
                     field1907[var7] = 0;
                     field1906[var7] = 0;
                     var7++;
                     break;
                  }
               }
            }

            field1905[var7] = var8;
            short var12 = 0;
            if (this.field1911.field1785[var8] == 3) {
               var12 = 128;
            }

            if ((var9 & 1) != 0) {
               field1908[var7] = var4.method13088(-1585995521);
            } else {
               field1908[var7] = var12;
            }

            if ((var9 & 2) != 0) {
               field1907[var7] = var4.method13088(-1608158525);
            } else {
               field1907[var7] = var12;
            }

            if ((var9 & 4) != 0) {
               field1906[var7] = var4.method13088(-1250737533);
            } else {
               field1906[var7] = var12;
            }

            var6 = var8;
            var7++;
            if (this.field1911.field1785[var8] == 5) {
               this.field1910 = true;
            }
         }
      }

      if (var4.field6955 * 702114061 != var1.length) {
         throw new RuntimeException();
      } else {
         this.field1913 = var7;
         this.field1912 = new int[var7];
         this.field1909 = new int[var7];
         this.field1915 = new int[var7];
         this.field1914 = new int[var7];

         for (int var11 = 0; var11 < var7; var11++) {
            this.field1912[var11] = field1905[var11];
            this.field1909[var11] = field1908[var11];
            this.field1915[var11] = field1907[var11];
            this.field1914[var11] = field1906[var11];
         }

         var3.field6955 = var4.field6955 * 1;
      }
   }
}
