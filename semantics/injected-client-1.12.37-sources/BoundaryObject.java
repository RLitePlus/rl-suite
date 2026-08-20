import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.io.File;
import java.io.IOException;
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

@ObfuscatedName("fe")
public final class BoundaryObject implements WallObject, TileObject {
   @ObfuscatedName("zx")
   public int field2247;
   @ObfuscatedName("ag")
   int field2244;
   @ObfuscatedName("aa")
   int field2241;
   @ObfuscatedName("ae")
   public long field2240 = 0L;
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("af")
   public Renderable field2248;
   @ObfuscatedName("ac")
   int field2243;
   @ObfuscatedName("as")
   int field2245;
   @ObfuscatedName("ax")
   int field2246;
   @ObfuscatedName("ab")
   int field2242;
   @ObfuscatedName("ad")
   static byte[][][] field2250;
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("az")
   public Renderable field2249;

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(classOE.client, var1, this.getLocalLocation(), var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fw")
   public int method4617() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   public Shape getConvexHull() {
      Model var1 = this.method4616();
      if (var1 == null) {
         return null;
      } else {
         int var2 = Perspective.getTileHeight(classOE.client, this.getLocalLocation(), this.getPlane());
         return var1.method5252(this.method4615(), this.field2244 * -777838807, this.field2245 * 31139801, 0, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mz")
   public void method4619(int var1) {
      this.field2246 = var1 * -1380680693;
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("hd")
   public Renderable method4620() {
      return this.field2248;
   }

   @Nullable
   public String getOpOverride(int var1) {
      classCD var2 = this.method4615().method3775(this.getHash());
      return var2 == null ? null : var2.method1434(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("sa")
   public void method4621(int var1) {
      this.field2241 = var1 * -752902543;
   }

   public int getOrientationB() {
      return this.field2243 * -1413337351;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("by")
   public void method4622(int var1) {
      this.field2243 = var1 * 1487745865;
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("cr")
   public Renderable method4623() {
      return this.field2249;
   }

   public int getY() {
      return this.field2245 * 31139801;
   }

   public Shape getClickbox() {
      WorldView var1 = this.method4615();
      Shape var2 = Perspective.getClickbox(
         classOE.client, var1, this.method4616(), 0, this.field2244 * -777838807, this.field2245 * 31139801, this.field2242 * 1315862339
      );
      Shape var3 = Perspective.getClickbox(
         classOE.client, var1, this.method4618(), 0, this.field2244 * -777838807, this.field2245 * 31139801, this.field2242 * 1315862339
      );
      if (var2 != null && var3 != null) {
         return new Shapes(new Shape[]{var2, var3});
      } else {
         return var2 != null ? var2 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("br")
   public void method4624(int var1) {
      this.field2242 = var1 * -697873045;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("zc")
   public void method4625(long var1) {
      this.field2240 = var1 * -2636099314526831141L;
   }

   @ObfuscatedSignature(descriptor = "(Lee;)V")
   @ObfuscatedName("ym")
   public void method4626(Renderable var1) {
      this.field2248 = var1;
   }

   public long getHash() {
      return this.field2240 * 7159317397185328723L;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("lq")
   public Model method4618() {
      Renderable var1 = this.method4620();
      if (var1 == null) {
         return null;
      } else {
         return var1 instanceof Model ? (Model)var1 : var1.method3842();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("ux")
   public WorldView method4615() {
      return WorldView.method3780(this.method4617());
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Laar;")
   @ObfuscatedName("ae")
   public static classAAR method4612(String var0, String var1, boolean var2, byte var3) {
      try {
         File var4 = new File(classSL.field5975, "preferences" + var0 + ".dat");
         if (var4.exists()) {
            try {
               return new classAAR(var4, "rw", 10000L);
            } catch (IOException var10) {
            }
         }

         String var5 = "";
         if (33 == 1602897005 * MidiRequest.field4637) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            var5 = "_rc";
         } else if (MidiRequest.field4637 * 1602897005 == 34) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            var5 = "_wip";
         }

         File var6 = new File(ClanChannel.field2954, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
         if (!var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            if (var6.exists()) {
               try {
                  return new classAAR(var6, "rw", 10000L);
               } catch (IOException var9) {
               }
            }
         }

         try {
            return new classAAR(var4, "rw", 10000L);
         } catch (IOException var8) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "fe.ae(" + ')');
      }
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = WorldView.method3780(this.method4617());
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

   public Shape getConvexHull2() {
      Model var1 = this.method4618();
      if (var1 == null) {
         return null;
      } else {
         int var2 = Perspective.getTileHeight(classOE.client, this.getLocalLocation(), this.getPlane());
         return var1.method5252(this.method4615(), this.field2244 * -777838807, this.field2245 * 31139801, 0, var2);
      }
   }

   public int getConfig() {
      return this.field2241 * 1869636241;
   }

   @ObfuscatedSignature(descriptor = "(Lee;)V")
   @ObfuscatedName("nb")
   public void method4627(Renderable var1) {
      this.field2249 = var1;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method4617());
   }

   public boolean isOpShown(int var1) {
      classCD var2 = this.method4615().method3775(this.getHash());
      return var2 == null ? true : var2.method1438(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)Z")
   @ObfuscatedName("yg")
   public static boolean method4613(classLH var0) {
      return var0 == null ? var0.method6983() : var0.field4147;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pq")
   public void method4628(int var1) {
      this.field2245 = var1 * 151054441;
   }

   public int getZ() {
      return this.field2242 * 1315862339;
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(classOE.client, this.getLocalLocation(), this.getPlane(), var1);
   }

   public int getOrientationA() {
      return this.field2246 * 1548562339;
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(classOE.client, this.getLocalLocation());
   }

   public Polygon getCanvasTilePoly() {
      int var1 = 1;
      int var2 = 1;
      if (this instanceof GameObject) {
         GameObject var3 = (GameObject)this;
         var1 = var3.field2186 * 304142753 - var3.field2188 * 1138017605 + 1;
         var2 = var3.field2192 * -544424899 - var3.field2194 * -555977777 + 1;
      }

      return Perspective.getCanvasTileAreaPoly(classOE.client, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
   }

   public int getX() {
      return this.field2244 * -777838807;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bf")
   public void method4629(int var1) {
      this.field2244 = var1 * -1785598695;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("re")
   public Model method4616() {
      Renderable var1 = this.method4623();
      if (var1 == null) {
         return null;
      } else {
         return var1 instanceof Model ? (Model)var1 : var1.method3842();
      }
   }

   public int getPlane() {
      return this.field2247;
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("bu")
   static int method4614(int var0, Script var1, boolean var2, byte var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "fe.bu(" + 41);
      }
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   BoundaryObject() {
      this.field2241 = 0;
   }
}
