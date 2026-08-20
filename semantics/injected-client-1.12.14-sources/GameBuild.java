import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pv")
public class GameBuild {
   @ObfuscatedName("ae")
   public final String name;
   @ObfuscatedSignature(descriptor = "Lpv;")
   @ObfuscatedName("at")
   static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
   @ObfuscatedSignature(descriptor = "Lpv;")
   @ObfuscatedName("ag")
   static final GameBuild RC = new GameBuild("RC", 1);
   @ObfuscatedName("aj")
   public final int buildId;
   @ObfuscatedSignature(descriptor = "Lpv;")
   @ObfuscatedName("av")
   static final GameBuild LIVE = new GameBuild("LIVE", 0);
   @ObfuscatedSignature(descriptor = "Lpv;")
   @ObfuscatedName("an")
   static final GameBuild WIP = new GameBuild("WIP", 2);
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field5255 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field5254 = 47;

   @ObfuscatedSignature(descriptor = "(Lcr;B)V")
   @ObfuscatedName("ia")
   static final void method8812(Actor var0, byte var1) {
      try {
         boolean var10000;
         label59: {
            if (var0.field1176 * 69976937 != 1759706017 * client.cycle) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               if (Actor.method2758(var0, 2125422907)) {
                  var10000 = false;
                  break label59;
               }
            }

            var10000 = true;
         }

         boolean var2;
         var2 = var10000;
         label53:
         if (!var2) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            SequenceDefinition var3 = AnimationSequence.method10318(var0.animationSequence, 1045669000);
            if (var3 != null) {
               if (!var3.isCachedModelIdSet((byte)19)) {
                  var2 = AnimationSequence.method10329(var0.animationSequence, 859206463) + 1 > var3.frameLengths[var0.animationSequence.getFrame(-609025707)];
                  break label53;
               }

               if (var1 <= 0) {
                  return;
               }
            }

            var2 = true;
         }

         if (var2) {
            int var10 = var0.field1176 * 69976937 - var0.spotAnimation * 108069351;
            int var4 = client.cycle * 1759706017 - 108069351 * var0.spotAnimation;
            int var5 = 1257575232 * var0.size + 291177600 * var0.field1181;
            int var6 = var0.field1178 * -1091697536 + var0.size * 1257575232;
            int var7 = var0.size * 1257575232 + 1152127104 * var0.field1180;
            int var8 = 1257575232 * var0.size + -980546688 * var0.field1182;
            var0.x = (var7 * var4 + var5 * (var10 - var4)) / var10 * 1875668551;
            var0.y = (var8 * var4 + var6 * (var10 - var4)) / var10 * -122983271;
         }

         var0.field1145 = 0;
         var0.orientation = -950807473 * var0.field1179;
         var0.rotation = var0.orientation * 1559750685;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "pv.ia(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpv;")
   @ObfuscatedName("at")
   public static GameBuild[] method8807() {
      return new GameBuild[]{BUILDLIVE, LIVE, WIP, RC};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpv;")
   @ObfuscatedName("ag")
   public static GameBuild[] method8808() {
      return new GameBuild[]{BUILDLIVE, LIVE, WIP, RC};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpv;")
   @ObfuscatedName("an")
   public static GameBuild[] method8809() {
      return new GameBuild[]{BUILDLIVE, LIVE, WIP, RC};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrf;)I")
   @ObfuscatedName("bb")
   public static int method8811(class456 var0) {
      if (var0 == null) {
         var0.method9432();
      }

      int var1 = -182005883;
      int var2 = 1;
      var2 = var2 * 728984776 + var0.field5516.hashCode();
      var2 = var2 * 695027304 + var0.field5515.hashCode();
      return var2 * 31 + var0.field5514.hashCode();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpv;")
   @ObfuscatedName("ae")
   public static GameBuild[] method8810() {
      return new GameBuild[]{BUILDLIVE, LIVE, WIP, RC};
   }

   GameBuild(String var1, int var2) {
      this.name = var1;
      this.buildId = var2 * 1905079957;
   }
}
