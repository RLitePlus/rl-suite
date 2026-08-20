import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jn")
public class TileRenderMode {
   @ObfuscatedSignature(descriptor = "Ljn;")
   @ObfuscatedName("av")
   public static final TileRenderMode field3137 = new TileRenderMode();
   @ObfuscatedSignature(descriptor = "Ljn;")
   @ObfuscatedName("at")
   public static final TileRenderMode field3138 = new TileRenderMode();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;J)V")
   @ObfuscatedName("dn")
   public static void method6141(Buffer var0, long var1) {
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 56);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 48);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 40);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 32);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljn;")
   @ObfuscatedName("ag")
   public static TileRenderMode[] method6142() {
      return new TileRenderMode[]{field3137, field3138};
   }

   TileRenderMode() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljn;")
   @ObfuscatedName("at")
   public static TileRenderMode[] method6143() {
      return new TileRenderMode[]{field3137, field3138};
   }

   @ObfuscatedSignature(descriptor = "()[Ljn;")
   @ObfuscatedName("av")
   public static TileRenderMode[] method6144() {
      return new TileRenderMode[]{field3137, field3138};
   }
}
