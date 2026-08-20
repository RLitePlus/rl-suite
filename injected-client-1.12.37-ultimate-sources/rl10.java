import java.util.ArrayList;
import java.util.List;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl10")
public class rl10 implements Tile {
   @ObfuscatedName("cp")
   public final int field5692;
   @ObfuscatedSignature(descriptor = "Lrl10;")
   @ObfuscatedName("kj")
   public rl10 field5693;
   @ObfuscatedSignature(descriptor = "Lez;")
   @ObfuscatedName("at")
   public final classEZ field5691;

   @ObfuscatedSignature(descriptor = "()Leq;")
   @ObfuscatedName("py")
   public classEQ method10040() {
      return this.field5691.field2011[this.field5692];
   }

   @ObfuscatedSignature(descriptor = "()Lfj;")
   @ObfuscatedName("di")
   public classFJ method10033() {
      return this.field5691.field2006[this.field5692];
   }

   @ObfuscatedSignature(descriptor = "()Lfi;")
   @ObfuscatedName("rq")
   public classFI method10034() {
      return this.field5691.field2009[this.field5692];
   }

   public int getPlane() {
      return this.field5692 >> this.field5691.field1996 & 3;
   }

   public void setGroundObject(GroundObject var1) {
      this.field5691.field2010[this.field5692] = (classEO)var1;
      if (var1 == null) {
         this.field5691.field2005[this.field5692] = this.field5691.field2005[this.field5692] & -2049;
      } else {
         this.field5691.field2005[this.field5692] = this.field5691.field2005[this.field5692] | 2048;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ca")
   public int method10038() {
      return this.field5691.method4396(this.field5692);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vx")
   public int method10041() {
      int var1 = this.field5692 & this.field5691.field1998;
      return var1 - this.field5691.field2147;
   }

   public void setSceneTilePaint(SceneTilePaint var1) {
      this.field5691.field2006[this.field5692] = (classFJ)var1;
   }

   public List getGroundItems() {
      classEQ var1 = this.method10040();
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for (Object var3 = var1.method3955(); var3 instanceof classDL; var3 = ((classVQ)var3).method12064()) {
            var2.add((classDL)var3);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()Leo;")
   @ObfuscatedName("xz")
   public classEO method10039() {
      return this.field5691.field2010[this.field5692];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("yt")
   public int method10031() {
      return this.field5691.field2012[this.field5692];
   }

   @ObfuscatedSignature(descriptor = "()Lfn;")
   @ObfuscatedName("lf")
   public classFN method10035() {
      return this.field5691.field2007[this.field5692];
   }

   public WorldPoint getWorldLocation() {
      int var1 = this.field5692 >> this.field5691.field1996 & 3;
      int var2 = this.field5692 >> this.field5691.field1995 & this.field5691.field1997;
      int var3 = this.field5692 & this.field5691.field1998;
      var2 -= this.field5691.field2147;
      var3 -= this.field5691.field2147;
      classDZ var4 = this.field5691.field2150;
      return WorldPoint.fromScene(var4, var2, var3, var1);
   }

   @ObfuscatedSignature(descriptor = "()Lfe;")
   @ObfuscatedName("zz")
   public classFE method10037() {
      return this.field5691.field2008[this.field5692];
   }

   public LocalPoint getLocalLocation() {
      int var1 = this.field5692 >> this.field5691.field1995 & this.field5691.field1997;
      int var2 = this.field5692 & this.field5691.field1998;
      var1 -= this.field5691.field2147;
      var2 -= this.field5691.field2147;
      return LocalPoint.fromScene(var1, var2, this.field5691);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("um")
   public int method10030() {
      int var1 = this.field5692 >> this.field5691.field1995 & this.field5691.field1997;
      return var1 - this.field5691.field2147;
   }

   public Point getSceneLocation() {
      int var1 = this.field5692 >> this.field5691.field1995 & this.field5691.field1997;
      int var2 = this.field5692 & this.field5691.field1998;
      var1 -= this.field5691.field2147;
      var2 -= this.field5691.field2147;
      return new Point(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()Lrl10;")
   @ObfuscatedName("md")
   public rl10 method10032() {
      return this.field5693;
   }

   @ObfuscatedSignature(descriptor = "()[Lfb;")
   @ObfuscatedName("bd")
   public classFB[] method10036() {
      return new classFB[]{
         this.field5691.field2013[this.field5692 * 5 + 0],
         this.field5691.field2013[this.field5692 * 5 + 1],
         this.field5691.field2013[this.field5692 * 5 + 2],
         this.field5691.field2013[this.field5692 * 5 + 3],
         this.field5691.field2013[this.field5692 * 5 + 4]
      };
   }

   public int getRenderLevel() {
      return this.field5691.method4423(this.field5692);
   }

   public void setSceneTileModel(SceneTileModel var1) {
      this.field5691.field2007[this.field5692] = (classFN)var1;
   }

   public rl10(classEZ var1, int var2) {
      this.field5691 = var1;
      this.field5692 = var2;
   }
}
