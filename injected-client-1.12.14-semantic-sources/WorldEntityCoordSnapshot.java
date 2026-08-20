import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("to")
public class WorldEntityCoordSnapshot {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field5949 = 128;
   @ObfuscatedName("at")
   int field5948;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field5947 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field5946 = 5;
   @ObfuscatedSignature(descriptor = "Lkb;")
   @ObfuscatedName("av")
   final WorldEntityCoord worldEntityCoord = new WorldEntityCoord();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIZ)Z")
   @ObfuscatedName("dy")
   public static boolean method10798(Scene var0, int var1, int var2, int var3, int var4, boolean var5) {
      return var0.method5603(var0.field2921, var1, var2, var3, var4, var5);
   }

   WorldEntityCoordSnapshot() {
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIIIIIZI)V")
   @ObfuscatedName("km")
   static void method10799(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
      try {
         TileItem var12 = new TileItem();
         var12.visibleTime = 319074273 * var4;
         int var10001 = 274398389 * var5;
         var12.method3053(274398389 * var5 * -1247866467);
         var12.despawnTime = var10001;
         TileItem.method3035(var12, var6, (byte)17);
         var12.flag = -541870261 * (var7 + 1597664885 * client.serverCycle);
         var12.ownership = (1597664885 * client.serverCycle + var8) * -906243951;
         var12.id = -1712425603 * var9;
         var12.isPrivate = var10;
         if (var0.groundItems[var1][var2][var3] == null) {
            if (var11 == 1104791644) {
               return;
            }

            var0.groundItems[var1][var2][var3] = new NodeDeque();
         }

         var0.groundItems[var1][var2][var3].addFirst(var12);
         class348.updateItemPile2(var0, var1, var2, var3, -2025822675);
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "to.km(" + ')');
      }
   }
}
