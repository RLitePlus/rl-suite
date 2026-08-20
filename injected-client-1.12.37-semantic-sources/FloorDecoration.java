import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.GroundObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eo")
public final class FloorDecoration implements GroundObject, TileObject {
   @ObfuscatedName("as")
   int field1809;
   @ObfuscatedName("af")
   public long field1815;
   @ObfuscatedName("xm")
   public int field1814;
   @ObfuscatedName("ae")
   int field1807;
   @ObfuscatedName("bl")
   static int field1811;
   @ObfuscatedName("ag")
   int field1808;
   @ObfuscatedName("ab")
   int field1806;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field1810 = 74;
   @ToRemove(unused = "true")
   @ObfuscatedName("cq")
   static final int field1812 = 152;
   @ToRemove(unused = "true")
   @ObfuscatedName("cv")
   public static final int field1813 = 82;
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("az")
   public Renderable field1816;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final byte field1805 = 1;

   public WorldPoint getWorldLocation() {
      WorldView var1 = WorldView.method3780(this.method3940());
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

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   int method3932() {
      return this.field1809 * -1235687175;
   }

   public int getPlane() {
      return this.field1814;
   }

   public long getHash() {
      return this.field1815 * 5132338419383099835L;
   }

   public int getConfig() {
      return this.field1809 * -1235687175;
   }

   public int getX() {
      return this.field1806 * 1333275141;
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("va")
   public Renderable method3942() {
      return this.field1816;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("af")
   void method3938(int var1, byte var2) {
      try {
         this.field1809 = -845194935 * var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "eo.af(" + ')');
      }
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method3940());
   }

   FloorDecoration() {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("rq")
   public void method3943(int var1) {
      this.field1809 = var1 * -845194935;
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   public int getZ() {
      return this.field1807 * -276908185;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leo;)I")
   @ObfuscatedName("ue")
   public static int method3933(FloorDecoration var0) {
      return var0.field1809 * -1235687175;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("hh")
   public void method3944(long var1) {
      this.field1815 = var1 * -8879266543907161229L;
   }

   public int getY() {
      return this.field1808 * 498815127;
   }

   public boolean isOpShown(int var1) {
      classCD var2 = this.method3939().method3775(this.getHash());
      return var2 == null ? true : var2.method1438(var1);
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("ay")
   public WorldView method3939() {
      return WorldView.method3780(this.method3940());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leo;)I")
   @ObfuscatedName("ky")
   public static int method3934(FloorDecoration var0) {
      return var0.field1809 * -1235687175;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ja")
   public void method3945(int var1) {
      this.field1808 = var1 * -1962070233;
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(classOE.field4843, this.getLocalLocation());
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   int method3935() {
      return this.field1809 * -172950048;
   }

   @Nullable
   public String getOpOverride(int var1) {
      classCD var2 = this.method3939().method3775(this.getHash());
      return var2 == null ? null : var2.method1434(var1);
   }

   @ObfuscatedSignature(descriptor = "(Leo;I)I")
   @ObfuscatedName("bh")
   public static int method3936(FloorDecoration var0, int var1) {
      if (var0 == null) {
         var0.method3937(var1);
      }

      try {
         return var0.field1809 * -1235687175;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "eo.az(" + 41);
      }
   }

   public Shape getClickbox() {
      return Perspective.getClickbox(
         classOE.field4843, this.method3939(), this.method3941(), 0, this.field1806 * 1333275141, this.field1808 * 498815127, this.field1807 * -276908185
      );
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(classOE.field4843, this.getLocalLocation(), this.getPlane(), var1);
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(classOE.field4843, var1, this.getLocalLocation(), var2, var3);
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("st")
   public void method3946(int var1) {
      this.field1807 = var1 * 476279895;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jw")
   public int method3940() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   public Shape getConvexHull() {
      Model var1 = this.method3941();
      return var1 == null ? null : var1.method5252(this.method3939(), this.getX(), this.getY(), 0, this.getZ());
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("yn")
   public Model method3941() {
      Renderable var1 = this.method3942();
      if (var1 == null) {
         return null;
      } else {
         return var1 instanceof Model ? (Model)var1 : var1.method3842();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;)V")
   @ObfuscatedName("bf")
   public void method3947(Renderable var1) {
      this.field1816 = var1;
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

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pi")
   public void method3948(int var1) {
      this.field1806 = var1 * 19534541;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   int method3937(int var1) {
      try {
         return this.field1809 * -1235687175;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "eo.az(" + 41);
      }
   }
}
