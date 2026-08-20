import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mw")
public interface WorldMapSection {
   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   boolean vmethod274(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(IIIB)Z")
   @ObfuscatedName("at")
   boolean containsCoord(int var1, int var2, int var3, byte var4);

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ag")
   boolean containsPosition(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(IIIB)[I")
   @ObfuscatedName("an")
   int[] getBorderTileLengths(int var1, int var2, int var3, byte var4);

   @ObfuscatedSignature(descriptor = "(Lla;I)V")
   @ObfuscatedName("av")
   void expandBounds(WorldMapArea var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aj")
   void read(Buffer var1, int var2);

   @ObfuscatedSignature(descriptor = "(III)Loj;")
   @ObfuscatedName("ae")
   Coord coord(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("af")
   void vmethod284(Buffer var1);

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ay")
   boolean vmethod267(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("au")
   boolean vmethod271(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ar")
   Coord vmethod278(int var1, int var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;Lxa;I)V")
   @ObfuscatedName("co")
   static void method7542(InvDefinition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.decodeNext(var1, var2, var2);
      }

      if (var2 == 2) {
         var0.size = Buffer.method12008(var1, (byte)5) * 242669455;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ad")
   boolean vmethod266(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ai")
   boolean vmethod269(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("as")
   boolean vmethod273(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ax")
   Coord vmethod277(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("ab")
   int[] vmethod276(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("az")
   boolean vmethod268(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("ap")
   void vmethod264(WorldMapArea var1);

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ah")
   Coord vmethod279(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("al")
   void vmethod282(Buffer var1);

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("aw")
   void vmethod265(WorldMapArea var1);

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("am")
   void vmethod283(Buffer var1);
}
