import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hn")
public class class191 extends DualNode {
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   static EvictingDualNodeHashTable field2007 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   static final int field2275 = 95;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvi;Ljava/lang/String;)V")
   @ObfuscatedName("lq")
   public static void method4626(DesktopPlatformInfoProvider var0, String var1) {
      if (var0 == null) {
         var0.vmethod441();
      }

      String[] var2 = var1.split("\\.");

      try {
         var0.field6169 = Integer.parseInt(var2[1]) * -965599541;
         var2 = var2[2].split("_");
         var0.field6167 = Integer.parseInt(var2[0]) * 1545588975;
         var0.field6168 = Integer.parseInt(var2[1]) * 105412717;
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;B)I")
   @ObfuscatedName("on")
   static int getWidgetFlags(Widget var0, byte var1) {
      Widget var3 = var0;
      byte var4 = 75;

      int var10000;
      try {
         WidgetConfigNode var5 = (WidgetConfigNode)client.widgetFlags.method8915(278777747 * var3.id);
         WidgetConfigNode var6 = WorldMapIcon_0.method7215(var5, 2077538819 * var3.childIndex, (short)11712);
         if (null != var6) {
            if (var4 != 75) {
               throw new IllegalStateException();
            }

            int var8 = var6.method7979(-2140075893);
            var10000 = var8;
         } else {
            int var9 = -1862035483 * var3.flags;
            var10000 = var9;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "hn.on(" + 41);
      }

      int var2 = var10000;
      if (client.field1041) {
         var2 |= 2097152;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(B)Lmj;")
   @ObfuscatedName("av")
   public static PacketBufferNode method4625(byte var0) {
      try {
         if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount * -2135827649 == 0) {
            if (var0 != 0) {
               throw new IllegalStateException();
            } else {
               return new PacketBufferNode();
            }
         } else {
            return PacketBufferNode.PacketBufferNode_packetBufferNodes[(PacketBufferNode.PacketBufferNode_packetBufferNodeCount -= -986475329) * -2135827649];
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "hn.av(" + ')');
      }
   }

   class191() throws Throwable {
      throw new Error();
   }
}
