import net.runelite.api.WidgetNode;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cx")
public class InterfaceParent extends Node implements WidgetNode {
   @ObfuscatedName("at")
   int type;
   @ObfuscatedName("av")
   int group;
   @ObfuscatedName("ag")
   boolean field1251 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final byte field1252 = -1;
   @ObfuscatedSignature(descriptor = "Ltf;")
   @ObfuscatedName("vi")
   static ArchiveDisk masterDisk;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   static void method3000(int var0) {
      try {
         class33.Tiles_underlays = (short[][][])null;
         class623.Tiles_overlays = (short[][][])null;
         class200.Tiles_shapes = (byte[][][])null;
         HttpRequest.field83 = (byte[][][])null;
         class148.field1911 = (int[][][])null;
         Tiles.Tiles_underlays2 = (byte[][][])null;
         MouseRecorder.field1086 = (int[][])null;
         WorldMapSectionType.Tiles_hue = null;
         class565.Tiles_saturation = null;
         class67.Tiles_lightness = null;
         class161.Tiles_hueMultiplier = null;
         class154.field1761 = null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cx.at(" + ')');
      }
   }

   public int getId() {
      return this.group * -1385287145;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public static void method3001(int var0) {
      try {
         WorldMapElement.HitSplatDefinition_cached.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cx.ag(" + ')');
      }
   }

   public int getModalMode() {
      return this.type * -953539367;
   }

   @ObfuscatedSignature(descriptor = "([FI)V")
   @ObfuscatedName("ae")
   static void method3002(float[] var0, int var1) {
      try {
         if (classFH.field1780 + var0[0] < 1.3333334F) {
            if (var1 == 5970950) {
               throw new IllegalStateException();
            }

            float var2 = var0[0] - 2.0F;
            float var3 = var0[0] - 1.0F;
            float var4 = (float)Math.sqrt(var2 * var2 - var3 * 4.0F * var3);
            float var5 = (var4 + -var2) * 0.5F;
            if (classFH.field1780 + var0[1] > var5) {
               if (var1 == 5970950) {
                  throw new IllegalStateException();
               }

               var0[1] = var5 - classFH.field1780;
            } else {
               var5 = 0.5F * (-var2 - var4);
               if (var0[1] < var5 + classFH.field1780) {
                  if (var1 == 5970950) {
                     return;
                  }

                  var0[1] = classFH.field1780 + var5;
               }
            }
         } else {
            var0[0] = 1.3333334F - classFH.field1780;
            var0[1] = 0.33333334F - classFH.field1780;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cx.ae(" + ')');
      }
   }

   InterfaceParent() {
   }
}
