import java.util.ArrayList;
import java.util.List;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl8")
public class rl8 implements net.runelite.api.Tile {
   @ObfuscatedName("ue")
   public final int field5670;
   @ObfuscatedSignature(descriptor = "Ljh;")
   @ObfuscatedName("if")
   public final Scene field5669;
   @ObfuscatedSignature(descriptor = "Lrl8;")
   @ObfuscatedName("vi")
   public rl8 field5671;

   public List getGroundItems() {
      ItemLayer var1 = this.method9613();
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for (Object var3 = var1.method5396(); var3 instanceof TileItem; var3 = ((Node)var3).method11658()) {
            var2.add((TileItem)var3);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lkr;")
   @ObfuscatedName("zs")
   public SceneTileModel method9617() {
      return this.field5669.field2902[this.field5670];
   }

   @ObfuscatedSignature(descriptor = "()Ljv;")
   @ObfuscatedName("io")
   public FloorDecoration method9619() {
      return this.field5669.field2905[this.field5670];
   }

   public void setSceneTileModel(net.runelite.api.SceneTileModel var1) {
      this.field5669.field2902[this.field5670] = (SceneTileModel)var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gu")
   public int method9623() {
      return this.field5669.field2907[this.field5670];
   }

   @ObfuscatedSignature(descriptor = "()Lrl8;")
   @ObfuscatedName("mv")
   public rl8 method9620() {
      return this.field5671;
   }

   public WorldPoint getWorldLocation() {
      int var1 = this.field5670 >> this.field5669.field2891 & 3;
      int var2 = this.field5670 >> this.field5669.field2890 & this.field5669.field2892;
      int var3 = this.field5670 & this.field5669.field2893;
      var2 -= this.field5669.field3014;
      var3 -= this.field5669.field3014;
      WorldView var4 = this.field5669.field3023;
      return WorldPoint.fromScene(var4, var2, var3, var1);
   }

   @ObfuscatedSignature(descriptor = "()Ljb;")
   @ObfuscatedName("ss")
   public ItemLayer method9613() {
      return this.field5669.field2906[this.field5670];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vb")
   public int method9615() {
      int var1 = this.field5670 & this.field5669.field2893;
      return var1 - this.field5669.field3014;
   }

   @ObfuscatedSignature(descriptor = "()Lku;")
   @ObfuscatedName("ky")
   public BoundaryObject method9618() {
      return this.field5669.field2903[this.field5670];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jp")
   public int method9616() {
      int var1 = this.field5670 >> this.field5669.field2890 & this.field5669.field2892;
      return var1 - this.field5669.field3014;
   }

   public LocalPoint getLocalLocation() {
      int var1 = this.field5670 >> this.field5669.field2890 & this.field5669.field2892;
      int var2 = this.field5670 & this.field5669.field2893;
      var1 -= this.field5669.field3014;
      var2 -= this.field5669.field3014;
      return LocalPoint.fromScene(var1, var2, this.field5669);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("tw")
   public int method9624() {
      return this.field5669.method5625(this.field5670);
   }

   @ObfuscatedSignature(descriptor = "()Lkf;")
   @ObfuscatedName("jk")
   public WallDecoration method9621() {
      return this.field5669.field2904[this.field5670];
   }

   public Point getSceneLocation() {
      int var1 = this.field5670 >> this.field5669.field2890 & this.field5669.field2892;
      int var2 = this.field5670 & this.field5669.field2893;
      var1 -= this.field5669.field3014;
      var2 -= this.field5669.field3014;
      return new Point(var1, var2);
   }

   public int getPlane() {
      return this.field5670 >> this.field5669.field2891 & 3;
   }

   public int getRenderLevel() {
      return this.field5669.method5758(this.field5670);
   }

   public void setGroundObject(GroundObject var1) {
      this.field5669.field2905[this.field5670] = (FloorDecoration)var1;
      if (var1 == null) {
         this.field5669.field2900[this.field5670] = this.field5669.field2900[this.field5670] & -2049;
      } else {
         this.field5669.field2900[this.field5670] = this.field5669.field2900[this.field5670] | 2048;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lkz;")
   @ObfuscatedName("zu")
   public SceneTilePaint method9622() {
      return this.field5669.field2901[this.field5670];
   }

   @ObfuscatedSignature(descriptor = "()[Lkd;")
   @ObfuscatedName("ze")
   public GameObject[] method9614() {
      return new GameObject[]{
         this.field5669.field2887[this.field5670 * 5 + 0],
         this.field5669.field2887[this.field5670 * 5 + 1],
         this.field5669.field2887[this.field5670 * 5 + 2],
         this.field5669.field2887[this.field5670 * 5 + 3],
         this.field5669.field2887[this.field5670 * 5 + 4]
      };
   }

   public void setSceneTilePaint(net.runelite.api.SceneTilePaint var1) {
      this.field5669.field2901[this.field5670] = (SceneTilePaint)var1;
   }

   public rl8(Scene var1, int var2) {
      this.field5669 = var1;
      this.field5670 = var2;
   }
}
