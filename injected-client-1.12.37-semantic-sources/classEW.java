import java.util.ArrayList;
import java.util.List;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ew")
public final class classEW extends Node implements Tile {
   @ObfuscatedSignature(descriptor = "Leo;")
   @ObfuscatedName("au")
   FloorDecoration field1967;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1959 = 50;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1965 = 5;
   @ObfuscatedSignature(descriptor = "Lfn;")
   @ObfuscatedName("ab")
   public SceneTileModel field1973;
   @ObfuscatedName("bn")
   int field1966;
   @ObfuscatedName("as")
   int field1963;
   @ObfuscatedSignature(descriptor = "[Lfb;")
   @ObfuscatedName("ax")
   GameObject[] field1951 = new GameObject[5];
   @ObfuscatedName("ac")
   int field1958;
   @ObfuscatedName("aa")
   int field1956 = 1699605829;
   @ObfuscatedName("al")
   int field1949;
   @ObfuscatedName("an")
   int field1962;
   @ObfuscatedName("aj")
   int field1952;
   @ObfuscatedName("ay")
   int field1957;
   @ObfuscatedSignature(descriptor = "Lfe;")
   @ObfuscatedName("ad")
   BoundaryObject field1970;
   @ObfuscatedSignature(descriptor = "Lfj;")
   @ObfuscatedName("ae")
   public SceneTilePaint field1972;
   @ObfuscatedSignature(descriptor = "Lfi;")
   @ObfuscatedName("ap")
   WallDecoration field1971;
   @ObfuscatedName("aq")
   int field1950;
   @ObfuscatedName("ai")
   int[] field1953;
   @ObfuscatedName("ar")
   int field1954;
   @ObfuscatedName("ao")
   ArrayList field1955 = null;
   @ObfuscatedName("ak")
   boolean field1974;
   @ObfuscatedName("av")
   boolean field1976;
   @ObfuscatedName("at")
   boolean field1975;
   @ObfuscatedSignature(descriptor = "Leq;")
   @ObfuscatedName("ag")
   ItemLayer field1968;
   @ObfuscatedName("am")
   int field1961;
   @ObfuscatedName("ah")
   int field1960;
   @ObfuscatedName("aw")
   int field1964;
   @ObfuscatedSignature(descriptor = "Lew;")
   @ObfuscatedName("bx")
   classEW field1969;

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("af")
   boolean method4092(short var1) {
      try {
         if (this.field1955 != null) {
            if (var1 == 256) {
               throw new IllegalStateException();
            }

            if (!this.field1955.isEmpty()) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ew.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Leo;")
   @ObfuscatedName("az")
   public FloorDecoration method4088(int var1) {
      try {
         return this.field1967;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ew.az(" + ')');
      }
   }

   public void setSceneTilePaint(net.runelite.api.SceneTilePaint var1) {
      this.field1972 = (SceneTilePaint)var1;
   }

   public int getRenderLevel() {
      return this.field1950 * 800564741;
   }

   @ObfuscatedSignature(descriptor = "()Lfi;")
   @ObfuscatedName("nv")
   public WallDecoration method4096() {
      return this.field1971;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lew;)Z")
   @ObfuscatedName("ua")
   public static boolean method4093(classEW var0) {
      if (var0 == null) {
         var0.method4095();
      }

      return var0.field1955 != null && !var0.field1955.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "()[Lfb;")
   @ObfuscatedName("eg")
   public GameObject[] method4097() {
      return this.field1951;
   }

   @ObfuscatedSignature(descriptor = "()Lfj;")
   @ObfuscatedName("zu")
   public SceneTilePaint method4098() {
      return this.field1972;
   }

   @ObfuscatedSignature(descriptor = "()Leo;")
   @ObfuscatedName("ae")
   public FloorDecoration method4089() {
      return this.field1967;
   }

   classEW(int var1, int var2, int var3) {
      this.field1953 = new int[5];
      this.field1954 = 0;
      this.field1950 = (this.field1949 = -1766608991 * var1) * -754964563;
      this.field1952 = var2 * 1003910231;
      this.field1957 = 1268069693 * var3;
   }

   public void setGroundObject(GroundObject var1) {
      this.field1967 = (FloorDecoration)var1;
   }

   @ObfuscatedSignature(descriptor = "()Leo;")
   @ObfuscatedName("nw")
   public FloorDecoration method4099() {
      return this.field1967;
   }

   public LocalPoint getLocalLocation() {
      throw new IllegalStateException();
   }

   @ObfuscatedSignature(descriptor = "()Lfn;")
   @ObfuscatedName("qk")
   public SceneTileModel method4100() {
      return this.field1973;
   }

   public WorldPoint getWorldLocation() {
      throw new IllegalStateException();
   }

   public int getPlane() {
      return this.field1949 * 1483076705;
   }

   @ObfuscatedSignature(descriptor = "()Lew;")
   @ObfuscatedName("sl")
   public classEW method4101() {
      return this.field1969;
   }

   public List getGroundItems() {
      throw new IllegalStateException();
   }

   @ObfuscatedSignature(descriptor = "()Leo;")
   @ObfuscatedName("ab")
   public FloorDecoration method4090() {
      return this.field1967;
   }

   public void setSceneTileModel(net.runelite.api.SceneTileModel var1) {
      this.field1973 = (SceneTileModel)var1;
   }

   @ObfuscatedSignature(descriptor = "()Leo;")
   @ObfuscatedName("ag")
   public FloorDecoration method4091() {
      return this.field1967;
   }

   @ObfuscatedSignature(descriptor = "()Leq;")
   @ObfuscatedName("vd")
   public ItemLayer method4102() {
      return this.field1968;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   boolean method4094() {
      return this.field1955 != null && !this.field1955.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "()Lfe;")
   @ObfuscatedName("ix")
   public BoundaryObject method4103() {
      return this.field1970;
   }

   public Point getSceneLocation() {
      throw new IllegalStateException();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   boolean method4095() {
      return this.field1955 != null && !this.field1955.isEmpty();
   }
}
