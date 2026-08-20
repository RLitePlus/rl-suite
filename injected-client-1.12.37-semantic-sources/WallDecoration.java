import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.DecorativeObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.geometry.Shapes;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fi")
public final class WallDecoration implements DecorativeObject, TileObject {
   @ObfuscatedName("gl")
   public int field2277;
   @ObfuscatedName("ac")
   int field2269;
   @ObfuscatedName("aa")
   int field2267;
   @ObfuscatedName("ae")
   public long field2266 = 0L;
   @ObfuscatedName("ab")
   int field2268;
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("az")
   public Renderable field2279;
   @ObfuscatedName("aj")
   int field2271;
   @ObfuscatedName("ax")
   int field2276;
   @ObfuscatedName("ag")
   int field2270;
   @ObfuscatedName("as")
   int field2275;
   @ObfuscatedName("ao")
   int field2273;
   @ObfuscatedName("al")
   int field2272;
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("af")
   public Renderable field2278;
   @ObfuscatedName("ay")
   int field2265 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field2274 = 262144;

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(classOE.field4843, var1, this.getLocalLocation(), var2, var3);
   }

   public Shape getConvexHull2() {
      Model var1 = this.method4778();
      return var1 == null
         ? null
         : var1.method5252(
            this.method4780(),
            this.field2270 * 1766830743 + this.field2272 * -1085897215,
            this.field2275 * -361702377 + this.field2271 * 513256357,
            0,
            this.getZ()
         );
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yh")
   public void method4781(int var1) {
      this.field2276 = var1 * 1259333051;
   }

   public Polygon getCanvasTilePoly() {
      int var1 = 1;
      int var2 = 1;
      if (this instanceof GameObject) {
         GameObject var3 = (GameObject)this;
         var1 = var3.field2186 * 304142753 - var3.field2188 * 1138017605 + 1;
         var2 = var3.field2192 * -544424899 - var3.field2194 * -555977777 + 1;
      }

      return Perspective.getCanvasTileAreaPoly(classOE.field4843, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
   }

   public int getPlane() {
      return this.field2277;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method4777());
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = WorldView.method3780(this.method4777());
      if (var1 == null) {
         var1 = classIS.field3053;
      }

      if (this instanceof GameObject) {
         GameObject var2 = (GameObject)this;
         int var3 = var2.field2188 * 1138017605;
         int var4 = var2.field2194 * -555977777;
         int var5 = var2.field2186 * 304142753 - var3;
         int var6 = var2.field2192 * -544424899 - var4;
         return WorldPoint.fromScene(var1, var3 + var5 / 2, var4 + var6 / 2, this.getPlane());
      } else {
         return WorldPoint.fromLocal(var1, this.getX(), this.getY(), this.getPlane());
      }
   }

   public Shape getConvexHull() {
      Model var1 = this.method4779();
      return var1 == null
         ? null
         : var1.method5252(
            this.method4780(),
            this.field2270 * 1766830743 + this.field2267 * -404927711,
            this.field2275 * -361702377 + this.field2273 * 856605829,
            0,
            this.getZ()
         );
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ss")
   public void method4782(long var1) {
      this.field2266 = var1 * 2170180156281739181L;
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(classOE.field4843, this.getLocalLocation());
   }

   public int getYOffset2() {
      return this.field2271 * 513256357;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("km")
   public void method4783(int var1) {
      this.field2275 = var1 * 1214651303;
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(classOE.field4843, this.getLocalLocation(), this.getPlane(), var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("zc")
   public int method4784() {
      return this.field2269 * -819410985;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("rq")
   public void method4785(int var1) {
      this.field2265 = var1 * -47677163;
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("pc")
   public Renderable method4786() {
      return this.field2278;
   }

   public boolean isOpShown(int var1) {
      classCD var2 = this.method4780().method3775(this.getHash());
      return var2 == null ? true : var2.method1438(var1);
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   @Nullable
   public String getOpOverride(int var1) {
      classCD var2 = this.method4780().method3775(this.getHash());
      return var2 == null ? null : var2.method1434(var1);
   }

   public int getXOffset() {
      return this.field2267 * -404927711;
   }

   public int getConfig() {
      return this.field2265 * -1506294211;
   }

   public int getXOffset2() {
      return this.field2272 * -1085897215;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("xu")
   public void method4787(int var1) {
      this.field2268 = var1 * 765794169;
   }

   public int getX() {
      return this.field2270 * 1766830743;
   }

   public int getY() {
      return this.field2275 * -361702377;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("nv")
   public void method4788(int var1) {
      this.field2270 = var1 * -697635545;
   }

   public int getYOffset() {
      return this.field2273 * 856605829;
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("re")
   public Renderable method4789() {
      return this.field2279;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ex")
   public void method4790(int var1) {
      this.field2269 = var1 * 1071651815;
   }

   public int getZ() {
      return this.field2268 * 1698079433;
   }

   public long getHash() {
      return this.field2266 * -3608662145112923099L;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fp")
   public int method4777() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("aj")
   public WorldView method4780() {
      return WorldView.method3780(this.method4777());
   }

   @ObfuscatedSignature(descriptor = "(Lee;)V")
   @ObfuscatedName("eo")
   public void method4791(Renderable var1) {
      this.field2278 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("hw")
   public Model method4778() {
      Renderable var1 = this.method4786();
      if (var1 == null) {
         return null;
      } else {
         Model var2;
         if (var1 instanceof Model) {
            var2 = (Model)var1;
         } else {
            var2 = var1.method3842();
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;)V")
   @ObfuscatedName("go")
   public void method4792(Renderable var1) {
      this.field2279 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("mv")
   public Model method4779() {
      Renderable var1 = this.method4789();
      if (var1 == null) {
         return null;
      } else {
         Model var2;
         if (var1 instanceof Model) {
            var2 = (Model)var1;
         } else {
            var2 = var1.method3842();
         }

         return var2;
      }
   }

   public Shape getClickbox() {
      WorldView var1 = this.method4780();
      Shape var2 = Perspective.getClickbox(
         classOE.field4843,
         var1,
         this.method4779(),
         0,
         this.field2270 * 1766830743 + this.field2267 * -404927711,
         this.field2275 * -361702377 + this.field2273 * 856605829,
         this.field2268 * 1698079433
      );
      Shape var3 = Perspective.getClickbox(
         classOE.field4843,
         var1,
         this.method4778(),
         0,
         this.field2270 * 1766830743 + this.field2272 * -1085897215,
         this.field2275 * -361702377,
         this.field2268 * 1698079433 + this.field2271 * 513256357
      );
      if (var2 != null && var3 != null) {
         return new Shapes(new Shape[]{var2, var3});
      } else {
         return var2 != null ? var2 : var3;
      }
   }

   WallDecoration() {
   }
}
