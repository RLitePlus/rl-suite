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

@ObfuscatedName("jv")
public final class FloorDecoration implements GroundObject, TileObject {
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("av")
   public Renderable renderable;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field3206 = 41;
   @ObfuscatedName("ag")
   int z;
   @ObfuscatedName("an")
   int x;
   @ObfuscatedName("ae")
   int y;
   @ObfuscatedName("aj")
   int flags;
   @ObfuscatedName("gh")
   public int field3208;
   @ObfuscatedName("at")
   public long tag;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field3204 = 65;
   @ToRemove(unused = "true")
   @ObfuscatedName("ci")
   static final int field3207 = 1;

   public int getPlane() {
      return this.field3208;
   }

   public Shape getClickbox() {
      return Perspective.getClickbox(
         SecureUrlRequester.client, this.method6192(), this.method6191(), 0, this.x * 1266171817, this.y * -190028295, this.z * -495673633
      );
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("hl")
   public Model method6191() {
      Renderable var1 = this.method6195();
      if (var1 == null) {
         return null;
      } else {
         return var1 instanceof Model ? (Model)var1 : var1.method6220();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ix")
   public void method6194(int var1) {
      this.y = var1 * -1587983287;
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("ey")
   public Renderable method6195() {
      return this.renderable;
   }

   @ObfuscatedSignature(descriptor = "(Ljz;)V")
   @ObfuscatedName("sg")
   public void method6196(Renderable var1) {
      this.renderable = var1;
   }

   public Polygon getCanvasTilePoly() {
      int var1 = 1;
      int var2 = 1;
      if (this instanceof GameObject) {
         GameObject var3 = (GameObject)this;
         var1 = var3.endX * 1553138359 - var3.startX * 1666005069 + 1;
         var2 = var3.endY * -2094327665 - var3.startY * 889015863 + 1;
      }

      return Perspective.getCanvasTileAreaPoly(SecureUrlRequester.client, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
   }

   public boolean isOpShown(int var1) {
      PendingSpawn var2 = this.method6192().method3095(this.getHash());
      return var2 == null ? true : var2.method2999(var1);
   }

   public Shape getConvexHull() {
      Model var1 = this.method6191();
      return var1 == null ? null : var1.method6857(this.method6192(), this.getX(), this.getY(), 0, this.getZ());
   }

   @Nullable
   public String getOpOverride(int var1) {
      PendingSpawn var2 = this.method6192().method3095(this.getHash());
      return var2 == null ? null : var2.method2997(var1);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("xm")
   public void method6197(long var1) {
      this.tag = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("iy")
   public void method6198(int var1) {
      this.flags = var1 * 1739618287;
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(SecureUrlRequester.client, var1, this.getLocalLocation(), var2, var3);
   }

   public int getConfig() {
      return this.flags * 633706255;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("rz")
   public void method6199(int var1) {
      this.x = var1 * -681913191;
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(SecureUrlRequester.client, this.getLocalLocation(), this.getPlane(), var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("zt")
   public void method6200(int var1) {
      this.z = var1 * -1446077153;
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ds")
   public int method6193() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("av")
   static boolean method6190(int var0, byte var1) {
      try {
         boolean var10000;
         if ((var0 & 128) != 0) {
            if (var1 >= 8) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jv.av(" + ')');
      }
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("fg")
   public WorldView method6192() {
      return WorldView.method3094(this.method6193());
   }

   public int getY() {
      return this.y * -190028295;
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(SecureUrlRequester.client, this.getLocalLocation());
   }

   public int getZ() {
      return this.z * -495673633;
   }

   public long getHash() {
      return this.tag;
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = WorldView.method3094(this.method6193());
      if (var1 == null) {
         var1 = Occluder.topLevelWorldView;
      }

      if (this instanceof GameObject) {
         GameObject var2 = (GameObject)this;
         int var3 = var2.startX * 1666005069;
         int var4 = var2.startY * 889015863;
         int var5 = var2.endX * 1553138359 - var3;
         int var6 = var2.endY * -2094327665 - var4;
         return WorldPoint.fromScene(var1, var3 + var5 / 2, var4 + var6 / 2, this.getPlane());
      } else {
         return WorldPoint.fromLocal(var1, this.getX(), this.getY(), this.getPlane());
      }
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method6193());
   }

   public int getX() {
      return this.x * 1266171817;
   }

   FloorDecoration() {
   }
}
