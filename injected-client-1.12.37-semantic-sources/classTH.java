import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("th")
public abstract class classTH implements classUT {
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field6138 = 25;
   @ObfuscatedName("az")
   protected int field6137;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field6139 = 2048;

   @ObfuscatedSignature(descriptor = "(Lva;III)Lyz;")
   @ObfuscatedName("az")
   static IndexedSprite method10812(AbstractArchive var0, int var1, int var2, int var3) {
      try {
         if (!classHK.method6068(var0, var1, var2, (byte)-42)) {
            return null;
         } else {
            IndexedSprite var5 = new IndexedSprite();
            var5.field7124 = classYL.field7000 * -1073038619;
            var5.field7120 = classYL.field6999 * -1062567517;
            var5.field7122 = classYL.field7002[0];
            var5.field7123 = classYL.field7003[0];
            var5.field7121 = classPO.field5371[0];
            var5.field7119 = classGG.field2578[0];
            var5.palette = classRB.field5639;
            var5.pixels = classYL.field7004[0];
            classVZ.method12278((byte)-102);
            return var5;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "th.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;)I")
   @ObfuscatedName("oa")
   public static int method10813(WorldMapArea var0) {
      return 1389480535 * var0.field2733;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltd;Ljava/awt/Graphics;)V")
   @ObfuscatedName("ck")
   public static void method10811(Canvas var0, Graphics var1) {
      var0.field6119.paint(var1);
   }

   protected classTH(classKX var1, classXO var2, int var3) {
      this.field6137 = -425669175 * var3;
   }
}
