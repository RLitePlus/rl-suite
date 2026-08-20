import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("so")
public interface classSO {
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   int vmethod394();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int vmethod388(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   int vmethod389();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   int vmethod392();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   int vmethod390();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   int vmethod391();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   int vmethod395();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   int vmethod397();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   int vmethod393(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldb;IIIIII)V")
   @ObfuscatedName("an")
   static void method10550(classDB var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method2883(var1, var1, var1, var1, var1, var1);
      }

      var0.field1374 = var1 * -2025561193;
      var0.field1370 = var2 * -1895662654;
      var0.field1369 = 881833361 * var3;
      var0.field1368 = var4 * 644877005;
      var0.field1371 = var5 * -1165767657;
      var0.field1373 = var6 * -25884917;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   int vmethod396();
}
