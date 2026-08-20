import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.geometry.Shapes;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ku")
public final class BoundaryObject implements WallObject, TileObject {
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("av")
   public Renderable renderable1;
   @ObfuscatedName("aw")
   int orientationB;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("at")
   public Renderable renderable2;
   @ObfuscatedName("an")
   int z;
   @ObfuscatedName("ag")
   public long tag = 0L;
   @ObfuscatedName("aj")
   int y;
   @ObfuscatedName("ak")
   int orientationA;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   public static final int field3469 = 2048;
   @ObfuscatedName("ap")
   int flags = 0;
   @ObfuscatedName("ip")
   public int field3470;
   @ObfuscatedName("ae")
   int x;

   public int getZ() {
      return this.z * -1912869971;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("tq")
   public void method6641(int var1) {
      this.x = var1 * 1111841693;
   }

   @Nullable
   public String getOpOverride(int var1) {
      PendingSpawn var2 = this.method6639().method3095(this.getHash());
      return var2 == null ? null : var2.method2997(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lx")
   public void method6642(int var1) {
      this.z = var1 * 2094051365;
   }

   public Shape getConvexHull2() {
      Model var1 = this.method6640();
      if (var1 == null) {
         return null;
      } else {
         int var2 = Perspective.getTileHeight(SecureUrlRequester.client, this.getLocalLocation(), this.getPlane());
         return var1.method6857(this.method6639(), this.x * -1937046859, this.y * 546730723, 0, var2);
      }
   }

   public int getX() {
      return this.x * -1937046859;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ei")
   public void method6643(int var1) {
      this.y = var1 * 837313227;
   }

   @ObfuscatedSignature(descriptor = "(Ljz;)V")
   @ObfuscatedName("pr")
   public void method6644(Renderable var1) {
      this.renderable2 = var1;
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = WorldView.method3094(this.method6637());
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
      PendingSpawn var2 = this.method6639().method3095(this.getHash());
      return var2 == null ? true : var2.method2999(var1);
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(SecureUrlRequester.client, var1, this.getLocalLocation(), var2, var3);
   }

   public Shape getClickbox() {
      WorldView var1 = this.method6639();
      Shape var2 = Perspective.getClickbox(
         SecureUrlRequester.client, var1, this.method6638(), 0, this.x * -1937046859, this.y * 546730723, this.z * -1912869971
      );
      Shape var3 = Perspective.getClickbox(
         SecureUrlRequester.client, var1, this.method6640(), 0, this.x * -1937046859, this.y * 546730723, this.z * -1912869971
      );
      if (var2 != null && var3 != null) {
         return new Shapes(new Shape[]{var2, var3});
      } else {
         return var2 != null ? var2 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("my")
   public Renderable method6645() {
      return this.renderable1;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("zc")
   public void method6646(long var1) {
      this.tag = var1 * -8195661098055663905L;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("sy")
   public int method6637() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;)Liw;")
   @ObfuscatedName("fj")
   public static SequenceDefinition method6635(AnimationSequence var0) {
      if (var0 == null) {
         var0.method10326();
      }

      return var0.sequenceDefinition;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("vc")
   public void method6647(int var1) {
      this.orientationA = var1 * 730760521;
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("zg")
   public void method6648(int var1) {
      this.orientationB = var1 * 652122151;
   }

   public int getY() {
      return this.y * 546730723;
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("nz")
   public Renderable method6649() {
      return this.renderable2;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("pc")
   public Model method6640() {
      Renderable var1 = this.method6649();
      if (var1 == null) {
         return null;
      } else {
         return var1 instanceof Model ? (Model)var1 : var1.method6220();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;)V")
   @ObfuscatedName("xc")
   public void method6650(Renderable var1) {
      this.renderable1 = var1;
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   public int getOrientationB() {
      return this.orientationB * -211200105;
   }

   public Shape getConvexHull() {
      Model var1 = this.method6638();
      if (var1 == null) {
         return null;
      } else {
         int var2 = Perspective.getTileHeight(SecureUrlRequester.client, this.getLocalLocation(), this.getPlane());
         return var1.method6857(this.method6639(), this.x * -1937046859, this.y * 546730723, 0, var2);
      }
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(SecureUrlRequester.client, this.getLocalLocation());
   }

   public int getPlane() {
      return this.field3470;
   }

   public int getConfig() {
      return this.flags * -1044451971;
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(SecureUrlRequester.client, this.getLocalLocation(), this.getPlane(), var1);
   }

   public int getOrientationA() {
      return this.orientationA * -666272519;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method6637());
   }

   BoundaryObject() {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("po")
   public void method6651(int var1) {
      this.flags = var1 * -1337019435;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("xo")
   public WorldView method6639() {
      return WorldView.method3094(this.method6637());
   }

   public long getHash() {
      return this.tag * -4972732868916429537L;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("oe")
   public Model method6638() {
      Renderable var1 = this.method6645();
      if (var1 == null) {
         return null;
      } else {
         return var1 instanceof Model ? (Model)var1 : var1.method6220();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
   @ObfuscatedName("an")
   static Class loadClassFromDescriptor(String var0, int var1) throws ClassNotFoundException {
      try {
         if (var0.equals("B")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return byte.class;
            }
         } else if (var0.equals("I")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return int.class;
            }
         } else if (var0.equals("S")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return short.class;
            }
         } else if (var0.equals("J")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return long.class;
            }
         } else if (var0.equals("Z")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return boolean.class;
            }
         } else if (var0.equals("F")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return float.class;
            }
         } else if (var0.equals("D")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return double.class;
            }
         } else if (var0.equals("C")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return char.class;
            }
         } else if (var0.equals("void")) {
            if (var1 != 1401900348) {
               throw new IllegalStateException();
            } else {
               return void.class;
            }
         } else {
            return Class.forName(var0);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ku.an(" + ')');
      }
   }
}
