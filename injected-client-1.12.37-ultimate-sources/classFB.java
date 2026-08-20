import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.GameObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fb")
public final class classFB implements GameObject, TileObject {
   @ObfuscatedName("al")
   int field2192;
   @ObfuscatedName("af")
   int field2189;
   @ObfuscatedName("ae")
   public long field2185 = 0L;
   @ObfuscatedName("ab")
   int field2187;
   @ObfuscatedName("ay")
   int field2197;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field2193 = 7;
   @ObfuscatedName("ax")
   int field2196;
   @ObfuscatedName("ac")
   int field2188;
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("az")
   public classEE field2200;
   @ObfuscatedName("ao")
   int field2194;
   @ObfuscatedName("ag")
   int field2190;
   @ObfuscatedName("as")
   int field2195;
   @ObfuscatedName("aj")
   int field2191;
   @ObfuscatedName("aq")
   int field2184 = 0;
   @ObfuscatedName("aa")
   int field2186;
   @ObfuscatedName("oq")
   static int field2199;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field2198 = 67;

   public WorldPoint getWorldLocation() {
      classDZ var1 = classDZ.method3780(this.method4559());
      if (var1 == null) {
         var1 = classIS.field3053;
      }

      if (this instanceof classFB) {
         classFB var2 = this;
         int var3 = var2.field2188 * 1138017605;
         int var4 = var2.field2194 * -555977777;
         int var5 = var2.field2186 * 304142753 - var3;
         int var6 = var2.field2192 * -544424899 - var4;
         return WorldPoint.fromScene(var1, var3 + var5 / 2, var4 + var6 / 2, this.getPlane());
      } else {
         return WorldPoint.fromLocal(var1, this.getX(), this.getY(), this.getPlane());
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yp")
   public void method4562(int var1) {
      this.field2195 = var1 * -1872653325;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ay")
   public void method4563(long var1) {
      this.field2185 = var1 * -4819202259227702107L;
   }

   public int sizeY() {
      return this.field2192 * -544424899 - this.field2194 * -555977777 + 1;
   }

   public Polygon getCanvasTilePoly() {
      int var1 = 1;
      int var2 = 1;
      if (this instanceof classFB) {
         classFB var3 = this;
         var1 = var3.field2186 * 304142753 - var3.field2188 * 1138017605 + 1;
         var2 = var3.field2192 * -544424899 - var3.field2194 * -555977777 + 1;
      }

      return Perspective.getCanvasTileAreaPoly(classOE.field4843, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bp")
   public void method4564(int var1) {
      this.field2187 = var1 * -1965758605;
   }

   public long getHash() {
      return this.field2185 * 1745853678706228013L;
   }

   public Shape getClickbox() {
      return Perspective.getClickbox(classOE.field4843, this.method4560(), this.method4561(), this.getModelOrientation(), this.getX(), this.getY(), this.getZ());
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(classOE.field4843, this.getLocalLocation(), this.getPlane(), var1);
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(classOE.field4843, var1, this.getLocalLocation(), var2, var3);
   }

   public int getZ() {
      return this.field2190 * 1269801851;
   }

   public int getConfig() {
      return this.field2184 * -288062455;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("xw")
   public void method4565(int var1) {
      this.field2184 = var1 * -1989916103;
   }

   public Point getSceneMinLocation() {
      return new Point(this.field2188 * 1138017605, this.field2194 * -555977777);
   }

   public int getY() {
      return this.field2196 * -1706390585;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dp")
   public void method4566(int var1) {
      this.field2190 = var1 * -1294023757;
   }

   @ObfuscatedSignature(descriptor = "(Lee;)V")
   @ObfuscatedName("oa")
   public void method4567(classEE var1) {
      this.field2200 = var1;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method4559());
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ll")
   public int method4559() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   public int sizeX() {
      return this.field2186 * 304142753 - this.field2188 * 1138017605 + 1;
   }

   public int getModelOrientation() {
      return this.field2189 * 470594389;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pm")
   public void method4568(int var1) {
      this.field2196 = var1 * 1768277495;
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("mw")
   public classEE method4569() {
      return this.field2200;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laag;)I")
   @ObfuscatedName("pa")
   public static int method4558(classAAG var0) {
      return var0 == null ? var0.method207() : 648326113 * var0.field50 - 1766285715 * var0.field52;
   }

   public Shape getConvexHull() {
      classFX var1 = this.method4561();
      return var1 == null ? null : var1.method5252(this.method4560(), this.getX(), this.getY(), this.getModelOrientation(), this.getZ());
   }

   @Nullable
   public String getOpOverride(int var1) {
      classCD var2 = this.method4560().method3775(this.getHash());
      return var2 == null ? null : var2.method1434(var1);
   }

   public int getPlane() {
      return this.field2187 * 568825275;
   }

   public int getOrientation() {
      int var1 = this.getModelOrientation();
      int var2 = this.getConfig() >> 6 & 3;
      return var2 * 512 + var1;
   }

   public boolean isOpShown(int var1) {
      classCD var2 = this.method4560().method3775(this.getHash());
      return var2 == null ? true : var2.method1438(var1);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(classOE.field4843, this.getLocalLocation());
   }

   public Point getSceneMaxLocation() {
      return new Point(this.field2186 * 304142753, this.field2192 * -544424899);
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bi")
   public void method4570(int var1) {
      this.field2189 = var1 * -610160131;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ru")
   public classFX method4561() {
      if (this.field2200 == null) {
         return null;
      } else {
         return this.field2200 instanceof classFX ? (classFX)this.field2200 : this.field2200.method3842();
      }
   }

   public int getX() {
      return this.field2195 * -1405731525;
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("ro")
   public classDZ method4560() {
      return classDZ.method3780(this.method4559());
   }

   classFB() {
   }
}
