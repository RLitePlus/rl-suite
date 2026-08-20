import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
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

@ObfuscatedName("kf")
public final class WallDecoration implements DecorativeObject, TileObject {
   @ToRemove(unused = "true")
   @ObfuscatedName("cu")
   static final int field3299 = 70;
   @ObfuscatedName("au")
   int xOffset;
   @ObfuscatedName("ag")
   public long tag = 0L;
   @ObfuscatedName("ae")
   int z;
   @ObfuscatedName("aj")
   int x;
   @ObfuscatedName("ak")
   int y;
   @ObfuscatedName("aw")
   int orientation;
   @ObfuscatedName("ap")
   int orientation2;
   @ObfuscatedName("an")
   int yOffset;
   @ObfuscatedName("ay")
   int field3297;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("at")
   public Renderable renderable2;
   @ObfuscatedName("az")
   int field3298;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("av")
   public Renderable renderable1;
   @ObfuscatedName("ad")
   int flags = 0;
   @ObfuscatedName("kl")
   public int field3300;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field3292 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final String field3301 = "";

   public int getYOffset() {
      return this.field3298 * 1799251127;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ql")
   public void method6333(int var1, int var2) {
      this.method6326(var1, var2, (byte)-19);
   }

   public int getZ() {
      return this.z * 121856729;
   }

   public int getPlane() {
      return this.field3300;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ea")
   public int method6329() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   WallDecoration() {
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

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qg")
   public int method6334() {
      return this.orientation2 * -1475596409;
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(SecureUrlRequester.client, var1, this.getLocalLocation(), var2, var3);
   }

   public int getConfig() {
      return this.flags * 219957667;
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("yz")
   public Renderable method6335() {
      return this.renderable2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("an")
   void method6323(int var1, int var2) {
      this.yOffset = 1452083403 * var1;
      this.field3297 = -148446411 * var2;
      switch (1327001075 * this.orientation) {
         case 1:
            var1++;
            break;
         case 2:
            var2--;
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 4:
            var1--;
            break;
         case 8:
            var2++;
      }

      this.xOffset = 1902801229 * var1;
      this.field3298 = var2 * -2070562553;
   }

   public boolean isOpShown(int var1) {
      PendingSpawn var2 = this.method6332().method3095(this.getHash());
      return var2 == null ? true : var2.method2999(var1);
   }

   public int getX() {
      return this.x * -682745183;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("zs")
   public void method6336(int var1) {
      this.flags = var1 * 627913227;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ch")
   public Model method6330() {
      Renderable var1 = this.method6344();
      if (var1 == null) {
         return null;
      } else {
         Model var2;
         if (var1 instanceof Model) {
            var2 = (Model)var1;
         } else {
            var2 = var1.method6220();
         }

         return var2;
      }
   }

   public int getY() {
      return this.y * 1215145581;
   }

   public Shape getConvexHull2() {
      Model var1 = this.method6331();
      return var1 == null ? null : var1.method6857(this.method6332(), this.x * -682745183, this.y * 1215145581, 0, this.getZ());
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   public void method6337(int var1) {
      this.x = var1 * 1750745441;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method6329());
   }

   @ObfuscatedSignature(descriptor = "(Ljz;)V")
   @ObfuscatedName("pj")
   public void method6338(Renderable var1) {
      this.renderable1 = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   void method6324(int var1, int var2) {
      this.yOffset = 1452083403 * var1;
      this.field3297 = -148446411 * var2;
      switch (1327001075 * this.orientation) {
         case 1:
            var1++;
            break;
         case 2:
            var2--;
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 4:
            var1--;
            break;
         case 8:
            var2++;
      }

      this.xOffset = 1902801229 * var1;
      this.field3298 = var2 * -2070562553;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("zn")
   public void method6339(long var1) {
      this.tag = var1 * -8661371853864889935L;
   }

   @ObfuscatedSignature(descriptor = "(Ljz;)V")
   @ObfuscatedName("nv")
   public void method6340(Renderable var1) {
      this.renderable2 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ws")
   public void method6341(int var1) {
      this.orientation = var1 * 1245442875;
   }

   public long getHash() {
      return this.tag * -7524770072208173231L;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   void method6325(int var1, int var2) {
      this.yOffset = 1452083403 * var1;
      this.field3297 = -148446411 * var2;
      switch (1327001075 * this.orientation) {
         case 1:
            var1++;
            break;
         case 2:
            var2--;
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 4:
            var1--;
            break;
         case 8:
            var2++;
      }

      this.xOffset = 1902801229 * var1;
      this.field3298 = var2 * -2070562553;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public void method6342(int var1) {
      this.z = var1 * -1903362711;
   }

   @ObfuscatedSignature(descriptor = "(II)Lgc;")
   @ObfuscatedName("av")
   public static InvDefinition getInvDefinition(int var0, int var1) {
      try {
         InvDefinition var2 = (InvDefinition)class402.method8806(InvDefinition.InvDefinition_cached, var0);
         if (null != var2) {
            if (var1 == 875273125) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = InvDefinition.InvDefinition_archive.getFile(5, var0, 1411796427);
            var2 = new InvDefinition();
            if (var3 != null) {
               var2.decode(new Buffer(var3), 63066429);
            }

            InvDefinition.InvDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kf.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("nc")
   public void method6343(int var1) {
      this.orientation2 = var1 * -1434556873;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsb;I)V")
   @ObfuscatedName("ak")
   public static void method6328(class468 var0, int var1) {
      classRZ var2 = var0.field5756[var1];
      int var3 = 56172297 * var0.field5757 >>> 1;

      while (var1 < var3) {
         int var4 = (var1 << 1) + 1;
         classRZ var5 = var0.field5756[var4];
         int var6 = 2 + (var1 << 1);
         classRZ var7 = var0.field5756[var6];
         int var8;
         if (null != var0.field5753) {
            if (var6 < -1002980573 * var0.field5757 && var0.field5753.compare(var5.field5748, var7.field5748) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < var0.field5757 * -1002980573 && ((Comparable)var5.field5748).compareTo(var7.field5748) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (null != var0.field5753
            ? var0.field5753.compare(var2.field5748, var0.field5756[var8].field5748) <= 0
            : ((Comparable)var2.field5748).compareTo(var0.field5756[var8].field5748) <= 0) {
            break;
         }

         var0.field5756[var1] = var0.field5756[var8];
         var0.field5756[var1].field5749 = var1 * 760132303;
         var1 = var8;
      }

      var0.field5756[var1] = var2;
      var0.field5756[var1].field5749 = var1 * -160818364;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("ep")
   public WorldView method6332() {
      return WorldView.method3094(this.method6329());
   }

   @ObfuscatedSignature(descriptor = "(ILcv;B)Ldd;")
   @ObfuscatedName("ag")
   public static WorldView method6327(int var0, WorldViewManager var1, byte var2) {
      try {
         Iterator var3 = var1.iterator();

         while (var3.hasNext()) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            WorldView var4 = (WorldView)var3.next();
            if (var4.players.get(var0) != null) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return var1.method2905((byte)-120);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kf.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("zm")
   public Renderable method6344() {
      return this.renderable1;
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(SecureUrlRequester.client, this.getLocalLocation());
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = WorldView.method3094(this.method6329());
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

   public int getXOffset() {
      return this.xOffset * 1501441925;
   }

   public Shape getConvexHull() {
      Model var1 = this.method6330();
      return var1 == null
         ? null
         : var1.method6857(this.method6332(), this.x * -682745183 + this.getXOffset(), this.y * 1215145581 + this.getYOffset(), 0, this.getZ());
   }

   public Shape getClickbox() {
      WorldView var1 = this.method6332();
      Shape var2 = Perspective.getClickbox(
         SecureUrlRequester.client,
         var1,
         this.method6330(),
         0,
         this.x * -682745183 + this.getXOffset(),
         this.y * 1215145581 + this.getYOffset(),
         this.z * 121856729
      );
      Shape var3 = Perspective.getClickbox(SecureUrlRequester.client, var1, this.method6331(), 0, this.x * -682745183, this.y * 1215145581, this.z * 121856729);
      if (var2 != null && var3 != null) {
         return new Shapes(new Shape[]{var2, var3});
      } else {
         return var2 != null ? var2 : var3;
      }
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(SecureUrlRequester.client, this.getLocalLocation(), this.getPlane(), var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("nm")
   public void method6345(int var1) {
      this.y = var1 * 568873829;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ow")
   public Model method6331() {
      Renderable var1 = this.method6335();
      if (var1 == null) {
         return null;
      } else {
         Model var2;
         if (var1 instanceof Model) {
            var2 = (Model)var1;
         } else {
            var2 = var1.method6220();
         }

         return var2;
      }
   }

   @Nullable
   public String getOpOverride(int var1) {
      PendingSpawn var2 = this.method6332().method3095(this.getHash());
      return var2 == null ? null : var2.method2997(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("av")
   void method6326(int var1, int var2, byte var3) {
      try {
         this.yOffset = 1452083403 * var1;
         this.field3297 = -148446411 * var2;
         switch (1327001075 * this.orientation) {
            case 1:
               var1++;
               break;
            case 2:
               var2--;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
               break;
            case 4:
               var1--;
               break;
            case 8:
               var2++;
         }

         this.xOffset = 1902801229 * var1;
         this.field3298 = var2 * -2070562553;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kf.av(" + ')');
      }
   }
}
