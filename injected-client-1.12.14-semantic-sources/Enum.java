import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qr")
public interface Enum {
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   int rsOrdinal(byte var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   int vmethod28();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Lmr;[Lxm;)V")
   @ObfuscatedName("so")
   static void method9145(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      if (var0 == null) {
         var0.icons(var1);
      }

      var0.method7062(var1, var2, var3, 1055655472);
      WorldMapRegion.method7060(var0, var1, var2, var3, var5, (byte)105);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ch")
   default int method9146() {
      return this.rsOrdinal((byte)20);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   int vmethod29();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   int vmethod30();
}
