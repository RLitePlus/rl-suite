import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bn")
public class classBN {
   @ObfuscatedName("ae")
   int[] field517;
   @ObfuscatedName("af")
   int field516;
   @ObfuscatedName("ab")
   int[] field518;
   @ObfuscatedName("az")
   int field515;

   classBN(classBT var1) {
      var1.method1231(16, -2038756090);
      this.field515 = classBT.method1235(var1, 309636778) != 0 ? var1.method1231(4, -1992813142) + 1 : 1;
      if (classBT.method1235(var1, -1920686168) != 0) {
         var1.method1231(8, -2033555503);
      }

      var1.method1231(2, -2013614499);
      if (this.field515 > 1) {
         this.field516 = var1.method1231(4, -1958387643);
      }

      this.field517 = new int[this.field515];
      this.field518 = new int[this.field515];

      for (int var2 = 0; var2 < this.field515; var2++) {
         var1.method1231(8, -2138771869);
         this.field517[var2] = var1.method1231(8, -2026877994);
         this.field518[var2] = var1.method1231(8, -2110737677);
      }
   }
}
