import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Area;
import javax.annotation.Nullable;
import net.runelite.api.ItemLayer;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eq")
public final class classEQ implements ItemLayer, TileObject {
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("as")
   classEE field1847;
   @ObfuscatedName("ae")
   int field1839;
   @ObfuscatedName("az")
   int field1841;
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("ag")
   classEE field1846;
   @ObfuscatedName("af")
   int field1840;
   @ObfuscatedSignature(descriptor = "Lee;")
   @ObfuscatedName("ab")
   classEE field1845;
   @ObfuscatedName("ax")
   long field1844;
   @ObfuscatedName("ac")
   int field1838;
   @ObfuscatedName("qo")
   public int field1843;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field1842 = 97;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;I)V")
   @ObfuscatedName("pb")
   public static void method3950(classLH var0, int var1) {
      if (var0 == null) {
         var0.method7088(var1);
      }

      classZD.method13868(var0.field4159, var1, (byte)119);
   }

   public Shape getClickbox() {
      Area var1 = new Area();
      classDZ var2 = this.method3951();

      for (classEE var6 : new classEE[]{this.method3955(), this.method3956(), this.method3957()}) {
         if (var6 != null) {
            classFX var7 = var6.method3842();
            if (var7 != null) {
               Shape var8 = Perspective.getClickbox(
                  classOE.field4843,
                  var2,
                  var7,
                  0,
                  this.field1840 * -892202585,
                  this.field1839 * -1209739927,
                  this.field1841 * 1186822141 - this.field1838 * 218008627
               );
               if (var8 != null) {
                  var1.add(new Area(var8));
               }
            }
         }
      }

      return var1;
   }

   public boolean isOpShown(int var1) {
      classCD var2 = this.method3951().method3775(this.getHash());
      return var2 == null ? true : var2.method1438(var1);
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(classOE.field4843, this.getLocalLocation(), this.getPlane(), var1);
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   public Polygon getCanvasTilePoly() {
      int var1 = 1;
      int var2 = 1;
      if (this instanceof classFB) {
         classFB var3 = (classFB)this;
         var1 = var3.field2186 * 304142753 - var3.field2188 * 1138017605 + 1;
         var2 = var3.field2192 * -544424899 - var3.field2194 * -555977777 + 1;
      }

      return Perspective.getCanvasTileAreaPoly(classOE.field4843, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("nw")
   public void method3953(int var1) {
      this.field1843 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("ub")
   public classEE method3955() {
      return this.field1846;
   }

   public int getPlane() {
      return this.field1843;
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(classOE.field4843, var1, this.getLocalLocation(), var2, var3);
   }

   @Nullable
   public String getOpOverride(int var1) {
      classCD var2 = this.method3951().method3775(this.getHash());
      return var2 == null ? null : var2.method1434(var1);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(classOE.field4843, this.getLocalLocation());
   }

   public int getY() {
      return this.field1839 * -1209739927;
   }

   public int getZ() {
      return this.field1841 * 1186822141;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   public int method3954() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("sj")
   public classDZ method3951() {
      return classDZ.method3780(this.method3954());
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("wu")
   public classEE method3956() {
      return this.field1845;
   }

   public long getHash() {
      return this.field1844;
   }

   public int getHeight() {
      return this.field1838 * 218008627;
   }

   public WorldPoint getWorldLocation() {
      classDZ var1 = classDZ.method3780(this.method3954());
      if (var1 == null) {
         var1 = classIS.field3053;
      }

      if (this instanceof classFB) {
         classFB var2 = (classFB)this;
         int var3 = var2.field2188 * 1138017605;
         int var4 = var2.field2194 * -555977777;
         int var5 = var2.field2186 * 304142753 - var3;
         int var6 = var2.field2192 * -544424899 - var4;
         return WorldPoint.fromScene(var1, var3 + var5 / 2, var4 + var6 / 2, this.getPlane());
      } else {
         return WorldPoint.fromLocal(var1, this.getX(), this.getY(), this.getPlane());
      }
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method3954());
   }

   @ObfuscatedSignature(descriptor = "()Lee;")
   @ObfuscatedName("dx")
   public classEE method3957() {
      return this.field1847;
   }

   public int getX() {
      return this.field1840 * -892202585;
   }

   classEQ() {
   }

   @ObfuscatedSignature(descriptor = "(Lzr;IIB)V")
   @ObfuscatedName("af")
   static void method3952(classZR var0, int var1, int var2, byte var3) {
      Object[] var4 = var0.getArguments();
      if (var4 != null && var4.length > 0 && var4[0] instanceof JavaScriptCallback) {
         try {
            ((JavaScriptCallback)var4[0]).run(var0);
         } catch (Exception var17) {
            client.field1026.error("Error in JavaScriptCallback", var17);
         }
      } else {
         try {
            client.field1132 = var0;
            int var9 = var2;
            int var8 = var1;
            classZR var7 = var0;
            byte var10 = -55;

            try {
               Object[] var11 = var7.method14091(2099330486);
               classBL var12;
               if (classTS.method11131(var7.method14097(335454777), -324749371)) {
                  if (var10 >= 1) {
                     throw new IllegalStateException();
                  }

                  classAC.field132 = (classHV)var11[0];
                  classPS var13 = classFJ.method4796(classAC.field132.field2897 * -753629693, (byte)-48);
                  var12 = classCE.method1439(var7.method14097(-2116113327), var13.field5405 * 872689451, 1254355271 * var13.field5404, (short)5691);
               } else if (classJG.method6366(var7.method14097(530150576), -1688993416)) {
                  if (var10 >= 1) {
                     throw new IllegalStateException();
                  }

                  int var20 = (Integer)var11[0];
                  var12 = classCE.method1439(var7.method14097(-2002140776), var20, -1, (short)20718);
               } else if (classMZ.method7747(var7.method14097(-866893993), (byte)-97)) {
                  int var21 = (Integer)var11[0];
                  var12 = classCE.method1439(var7.method14097(1200058477), var21, -1, (short)13921);
               } else if (var7.method14097(-1488556078) == 86) {
                  int var22 = (Integer)var11[0];
                  var12 = classCE.method1439(var7.method14097(1538912943), var22, -1, (short)24104);
               } else {
                  int var23 = (Integer)var11[0];
                  var12 = classSK.method10460(var23, 2038806036);
               }

               if (null != var12) {
                  if (var10 >= 1) {
                     throw new IllegalStateException();
                  }

                  classLD.method6748(var7, var12, var8, var9, 1450398201);
               }
            } catch (RuntimeException var18) {
               throw classEG.method3884(var18, "eq.af(" + ')');
            }
         } finally {
            client.field1101 = null;
         }
      }
   }
}
