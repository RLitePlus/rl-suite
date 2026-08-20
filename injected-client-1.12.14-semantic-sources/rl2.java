import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl2")
class rl2 {
   @ObfuscatedName("gy")
   public final int[][] field5593;
   @ObfuscatedName("kf")
   public final boolean field5591;
   @ObfuscatedName("cx")
   public final int[] field5595;
   @ObfuscatedName("rg")
   public final int[] field5596;
   @ObfuscatedName("fe")
   public final int[][][] field5592;
   @ObfuscatedName("ry")
   public final byte[][] field5598;
   @ObfuscatedName("df")
   public final byte[][] field5597;
   @ObfuscatedName("tc")
   public final boolean field5590;
   @ObfuscatedName("ut")
   public final int[] field5594;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method9551() {
      if (this.field5590) {
         client.isInInstance = this.field5591;
         client.instanceChunkTemplates = this.field5592;
         SpriteBufferProperties.xteaKeys = this.field5593;
         Script.regions = this.field5594;
         FaceNormal.regionMapArchiveIds = this.field5595;
         class210.regionLandArchiveIds = this.field5596;
         class160.regionLandArchives = this.field5597;
         class148.regionMapArchives = this.field5598;
      } else {
         assert this.field5591;

         client.field791 = this.field5592;
         Sound.field2032 = this.field5593;
         LoginState.field158 = this.field5594;
         DevicePcmPlayerProvider.field43 = this.field5595;
         HealthBarUpdate.field601 = this.field5596;
         JagexCache.field2531 = this.field5597;
         Login.field419 = this.field5598;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lrl2;")
   @ObfuscatedName("yb")
   public static rl2 method9552(boolean var0) {
      return var0
         ? new rl2(
            var0,
            client.isInInstance,
            client.instanceChunkTemplates,
            SpriteBufferProperties.xteaKeys,
            Script.regions,
            FaceNormal.regionMapArchiveIds,
            class210.regionLandArchiveIds,
            class160.regionLandArchives,
            class148.regionMapArchives
         )
         : new rl2(
            var0,
            true,
            client.field791,
            Sound.field2032,
            LoginState.field158,
            DevicePcmPlayerProvider.field43,
            HealthBarUpdate.field601,
            JagexCache.field2531,
            Login.field419
         );
   }

   public rl2(boolean var1, boolean var2, int[][][] var3, int[][] var4, int[] var5, int[] var6, int[] var7, byte[][] var8, byte[][] var9) {
      this.field5590 = var1;
      this.field5591 = var2;
      this.field5592 = var3;
      this.field5593 = var4;
      this.field5594 = var5;
      this.field5595 = var6;
      this.field5596 = var7;
      this.field5597 = var8;
      this.field5598 = var9;
   }
}
