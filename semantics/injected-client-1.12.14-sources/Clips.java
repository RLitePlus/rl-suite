import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kt")
public class Clips {
   @ObfuscatedName("az")
   int field3438;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field3453 = 512;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final float field3441 = 75.0F;
   @ObfuscatedName("bz")
   int field3434;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final float field3440 = 14925.0F;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3455 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final float field3443 = 150.75377F;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field3456 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field3450 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field3457 = 1;
   @ObfuscatedName("ah")
   int clipMidY;
   @ObfuscatedName("ac")
   int currentFaceAlpha;
   @ObfuscatedName("bs")
   int field3460;
   @ObfuscatedName("ai")
   boolean clipping;
   @ObfuscatedName("as")
   public boolean rasterGouraudLowRes;
   @ObfuscatedName("al")
   int clipX;
   @ObfuscatedName("ab")
   public int zoom;
   @ObfuscatedSignature(descriptor = "Lkg;")
   @ObfuscatedName("ax")
   public TextureLoader Rasterizer3D_textureLoader;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final float field3442 = 1.0100503F;
   @ObfuscatedName("ao")
   int clipCenterX;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field3454 = 2;
   @ObfuscatedName("am")
   int clipNegativeMidX;
   @ObfuscatedName("ar")
   int clipMidX;
   @ObfuscatedName("aq")
   int field3451;
   @ObfuscatedName("af")
   int clipY;
   @ObfuscatedName("aa")
   int clipNegativeMidY;
   @ObfuscatedName("be")
   int[] Rasterizer3D_rowOffsets;
   @ObfuscatedSignature(descriptor = "Lko;")
   @ObfuscatedName("ad")
   final ModelColorOverride field3431 = new ModelColorOverride();
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field3458 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field3459 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final float field3444 = 15000.0F;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkt;III)V")
   @ObfuscatedName("ub")
   public static void method6621(Clips var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method6630();
      }

      var0.clipping = var1 < 0 || var1 > var0.clipNegativeMidX || var2 < 0 || var2 > var0.clipNegativeMidX || var3 < 0 || var3 > var0.clipNegativeMidX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("pb")
   public int method6625() {
      return this.clipY;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("yg")
   public int method6626() {
      return this.field3451;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   void method6614() {
      this.clipMidY = this.clipNegativeMidX / 2;
      this.clipCenterX = this.field3460 / 2;
      this.clipMidX = -this.clipMidY;
      this.field3451 = this.clipNegativeMidX - this.clipMidY;
      this.clipY = -this.clipCenterX;
      this.clipNegativeMidY = this.field3460 - this.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   void setClipBounds() {
      this.clipMidY = this.clipNegativeMidX / 2;
      this.clipCenterX = this.field3460 / 2;
      this.clipMidX = -this.clipMidY;
      this.field3451 = this.clipNegativeMidX - this.clipMidY;
      this.clipY = -this.clipCenterX;
      this.clipNegativeMidY = this.field3460 - this.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("xp")
   public boolean method6627() {
      return this.rasterGouraudLowRes;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ag")
   void setClipping(int var1, int var2, int var3) {
      this.clipping = var1 < 0 || var1 > this.clipNegativeMidX || var2 < 0 || var2 > this.clipNegativeMidX || var3 < 0 || var3 > this.clipNegativeMidX;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   void method6616() {
      this.clipMidY = this.clipNegativeMidX / 2;
      this.clipCenterX = this.field3460 / 2;
      this.clipMidX = -this.clipMidY;
      this.field3451 = this.clipNegativeMidX - this.clipMidY;
      this.clipY = -this.clipCenterX;
      this.clipNegativeMidY = this.field3460 - this.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("aw")
   void method6618(int var1, int var2, int var3, int var4) {
      this.clipMidY = var1 - var2;
      this.clipCenterX = var3 - var4;
      this.clipMidX = -this.clipMidY;
      this.field3451 = this.clipNegativeMidX - this.clipMidY;
      this.clipY = -this.clipCenterX;
      this.clipNegativeMidY = this.field3460 - this.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method6617() {
      this.clipMidY = this.clipNegativeMidX / 2;
      this.clipCenterX = this.field3460 / 2;
      this.clipMidX = -this.clipMidY;
      this.field3451 = this.clipNegativeMidX - this.clipMidY;
      this.clipY = -this.clipCenterX;
      this.clipNegativeMidY = this.field3460 - this.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("at")
   void setCustomClipBounds(int var1, int var2, int var3, int var4) {
      this.clipMidY = var1 - var2;
      this.clipCenterX = var3 - var4;
      this.clipMidX = -this.clipMidY;
      this.field3451 = this.clipNegativeMidX - this.clipMidY;
      this.clipY = -this.clipCenterX;
      this.clipNegativeMidY = this.field3460 - this.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qg")
   public int method6628() {
      return this.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("je")
   public int method6629() {
      return this.zoom;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("co")
   public int method6630() {
      return this.clipMidX;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("xn")
   public void method6631(boolean var1) {
      this.rasterGouraudLowRes = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ak")
   void method6620(int var1, int var2, int var3, int var4) {
      this.clipMidY = var1 - var2;
      this.clipCenterX = var3 - var4;
      this.clipMidX = -this.clipMidY;
      this.field3451 = this.clipNegativeMidX - this.clipMidY;
      this.clipY = -this.clipCenterX;
      this.clipNegativeMidY = this.field3460 - this.clipCenterX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("oo")
   public int method6632() {
      return this.clipMidY;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("do")
   public void method6633(int var1) {
      this.zoom = var1;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ap")
   void method6623(int var1, int var2, int var3) {
      this.clipping = var1 < 0 || var1 > this.clipNegativeMidX || var2 < 0 || var2 > this.clipNegativeMidX || var3 < 0 || var3 > this.clipNegativeMidX;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("uf")
   public int method6634() {
      return this.clipNegativeMidY;
   }

   Clips() {
      this.currentFaceAlpha = 2;
      this.field3431 = new ModelColorOverride();
      this.clipping = false;
      this.rasterGouraudLowRes = true;
      this.clipX = 0;
      this.zoom = 512;
      this.Rasterizer3D_rowOffsets = new int[1024];
      this.field3434 = -1;
      this.field3438 = -1;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("au")
   void method6624(int var1, int var2, int var3) {
      this.clipping = var1 < 0 || var1 > this.clipNegativeMidX || var2 < 0 || var2 > this.clipNegativeMidX || var3 < 0 || var3 > this.clipNegativeMidX;
   }
}
