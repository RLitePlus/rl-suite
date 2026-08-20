import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aay")
public class classAAY {
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field118 = 62;
   @ObfuscatedName("ae")
   public int field116 = 0;
   @ObfuscatedName("af")
   public int field115 = 0;
   @ObfuscatedName("az")
   public char field117;

   classAAY() {
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lxs;I)V")
   @ObfuscatedName("eg")
   static void method297(classDZ var0, classXS var1, int var2) {
      client.method2344(var0, var1);

      try {
         classDZ var3 = classCQ.field1220;
         var3.field1709 = classXY.method13047(var1, -1596984619) * 182422557;
         var3.field1708 = classXY.method13047(var1, 1871705287) * 771221349;
         int var4 = 1296729483 * var3.field1696 / 8;
         int var5 = -1269171107 * var3.field1692 / 8;
         client.field1006.method12828(var1, var4, var5, (byte)38);
         classLG.field4141 = new byte[classXK.method12809(client.field1006, -251280248)][];
         classDY.field1684 = new byte[classXK.method12809(client.field1006, 852620275)][];
         client.field837.method3028(var3, -545217909);
         classJB.method6345(25, -1192966987);
         client.field805 = true;
         classDA.field1366 = var3;
         classCB.method1402(var3, -1886918929);
         client.method2380(var0, var1);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "aay.eg(" + ')');
      }
   }
}
