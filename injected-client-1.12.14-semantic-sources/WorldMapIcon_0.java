import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
   @ObfuscatedName("ag")
   final int subWidth;
   @ObfuscatedSignature(descriptor = "Llv;")
   @ObfuscatedName("at")
   final WorldMapLabel label;
   @ObfuscatedName("av")
   final int element;
   @ObfuscatedName("an")
   final int subHeight;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aa")
   static AbstractArchive SpotAnimationDefinition_archive;

   @ObfuscatedSignature(descriptor = "(Loe;IS)Loe;")
   @ObfuscatedName("an")
   public static WidgetConfigNode method7215(WidgetConfigNode var0, int var1, short var2) {
      try {
         for (WidgetConfigNode var3 = var0; null != var3; var3 = var3.nextWidgetConfigNode) {
            if (var2 == 10000) {
               throw new IllegalStateException();
            }

            if (var1 >= -1247489297 * var3.start && var1 <= var3.end * 1508033891) {
               return var3;
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lo.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   @Override
   public int getElement(int var1) {
      try {
         return -879570211 * this.element;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lo.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("ay")
   @Override
   WorldMapLabel vmethod293() {
      return this.label;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   @Override
   int getSubWidth(int var1) {
      try {
         return this.subWidth * -402581373;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lo.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   int getSubHeight(int var1) {
      try {
         return -231451761 * this.subHeight;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lo.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   @Override
   int vmethod295() {
      return this.subWidth * -402581373;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   @Override
   public int vmethod288() {
      return -879570211 * this.element;
   }

   WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
      super(var1, var2);
      this.element = var3 * 262641013;
      this.label = var4;
      WorldMapElement var5 = class463.WorldMapElement_get(this.getElement(1856000626), (byte)0);
      SpritePixels var6 = var5.getSpriteBool(false, 2034607561);
      if (var6 != null) {
         this.subWidth = 1799484971 * var6.subWidth;
         this.subHeight = -1343394961 * var6.subHeight;
      } else {
         this.subWidth = 0;
         this.subHeight = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("au")
   @Override
   WorldMapLabel vmethod292() {
      return this.label;
   }

   @ObfuscatedSignature(descriptor = "()Llv;")
   @ObfuscatedName("az")
   @Override
   WorldMapLabel vmethod294() {
      return this.label;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   @Override
   int vmethod297() {
      return -231451761 * this.subHeight;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   int vmethod298() {
      return -231451761 * this.subHeight;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("ku")
   static void method7216(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         SpriteMask.method8686(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, var5, 1090362473);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lo.ku(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   @Override
   int vmethod299() {
      return -231451761 * this.subHeight;
   }

   @ObfuscatedSignature(descriptor = "(B)Llv;")
   @ObfuscatedName("ag")
   @Override
   WorldMapLabel getLabel(byte var1) {
      try {
         return this.label;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lo.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod289() {
      return -138303565 * this.element;
   }
}
