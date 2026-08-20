import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl2")
class rl2 {
   @ObfuscatedName("pm")
   public boolean field5720;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("hx")
   public classUU field5718;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("jk")
   public classUU field5717;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("eu")
   public classUU field5716 = new classUU();
   @ObfuscatedName("az")
   public boolean field5719;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;)Z")
   @ObfuscatedName("qq")
   public static boolean method10057(WorldMapArea var0) {
      return var0.field2732;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)Laag;")
   @ObfuscatedName("zj")
   public static classAAG method10058(classLH var0) {
      return var0.field4159.method13871(var0.field4152 * 1072642345, var0.field4157 * -698145269, 415687298);
   }

   public rl2() {
      this.field5717 = new classUU();
      this.field5718 = new classUU();
   }
}
