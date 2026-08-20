import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xm")
public class classXM {
   @ObfuscatedSignature(descriptor = "Lxf;")
   @ObfuscatedName("ae")
   public final classXF field6890;
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("af")
   public static final classXM field6889 = new classXM(new classXP());
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("az")
   public static final classXM field6888 = new classXM(new classXX());

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;I)Z")
   @ObfuscatedName("wn")
   public static boolean method12844(WorldMap var0, int var1) {
      return !var0.field6713.contains(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Lhd;Lps;IIF)V")
   @ObfuscatedName("ga")
   public static void method12843(WorldMapRegion var0, AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      if (var0 == null) {
         var0.method5637();
      } else {
         classHW var6 = var1.vmethod491((byte)-36);
         if (null != var6) {
            if (var6.field2901.method6087(var5, 1247117025)) {
               Font var7 = (Font)var0.field2661.get(var6.field2901);
               var7.method66(
                  var6.field2900,
                  var3 - -1499119738 * var6.field2902 / 2,
                  var4,
                  var6.field2902 * 2116737063,
                  2072150010 * var6.field2899,
                  -1519185711 | 257956491 * var2.field5408,
                  0,
                  1,
                  0,
                  var7.field8 / 2
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   public int method12840(byte var1) {
      try {
         return this.field6890.vmethod648((byte)32).field6931 * 198139297;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "xm.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxm;)I")
   @ObfuscatedName("qx")
   public static int method12841(classXM var0) {
      return var0.field6890.vmethod648((byte)32).field6931 * -1736259265;
   }

   classXM(classXF var1) {
      this.field6890 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int method12842() {
      return this.field6890.vmethod648((byte)32).field6931 * 198139297;
   }
}
