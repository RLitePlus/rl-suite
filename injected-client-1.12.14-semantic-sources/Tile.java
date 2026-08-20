import java.util.List;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jw")
public final class Tile extends Node implements net.runelite.api.Tile {
   @ObfuscatedName("am")
   int field3223;
   @ObfuscatedSignature(descriptor = "Lkz;")
   @ObfuscatedName("at")
   SceneTilePaint paint;
   @ObfuscatedSignature(descriptor = "Lkr;")
   @ObfuscatedName("ag")
   SceneTileModel model;
   @ObfuscatedSignature(descriptor = "Ljb;")
   @ObfuscatedName("an")
   ItemLayer itemLayer;
   @ObfuscatedName("ae")
   int gameObjectsCount;
   @ObfuscatedName("ay")
   int originalPlane;
   @ObfuscatedName("ak")
   int plane;
   @ObfuscatedName("aw")
   int x;
   @ObfuscatedName("ap")
   int y;
   @ObfuscatedName("af")
   int field3220;
   @ObfuscatedSignature(descriptor = "Lkf;")
   @ObfuscatedName("az")
   WallDecoration wallDecoration;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("ka")
   static Archive archive9;
   @ObfuscatedName("ah")
   int drawGameObjectEdges;
   @ObfuscatedName("ai")
   int[] gameObjectEdgeMasks;
   @ObfuscatedName("as")
   int gameObjectsEdgeMask;
   @ObfuscatedName("ac")
   int minPlane;
   @ObfuscatedName("ab")
   boolean drawPrimary;
   @ObfuscatedName("ax")
   boolean drawSecondary;
   @ObfuscatedName("ar")
   boolean drawGameObjects;
   @ObfuscatedSignature(descriptor = "Ljv;")
   @ObfuscatedName("ad")
   FloorDecoration floorDecoration;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3224 = 5;
   @ObfuscatedSignature(descriptor = "Lku;")
   @ObfuscatedName("au")
   BoundaryObject boundaryObject;
   @ObfuscatedSignature(descriptor = "[Lkd;")
   @ObfuscatedName("aj")
   GameObject[] gameObjects = new GameObject[5];
   @ObfuscatedSignature(descriptor = "Ljw;")
   @ObfuscatedName("ao")
   Tile linkedBelowTile;
   @ObfuscatedName("al")
   int field3222;

   @ObfuscatedSignature(descriptor = "()[Lkd;")
   @ObfuscatedName("ja")
   public GameObject[] method6203() {
      return this.gameObjects;
   }

   @ObfuscatedSignature(descriptor = "()Lku;")
   @ObfuscatedName("xi")
   public BoundaryObject method6204() {
      return this.boundaryObject;
   }

   public int getRenderLevel() {
      return this.originalPlane * 1724486501;
   }

   @ObfuscatedSignature(descriptor = "()Ljb;")
   @ObfuscatedName("fw")
   public ItemLayer method6205() {
      return this.itemLayer;
   }

   @ObfuscatedSignature(descriptor = "()Lkz;")
   @ObfuscatedName("ih")
   public SceneTilePaint method6206() {
      return this.paint;
   }

   @ObfuscatedSignature(descriptor = "()Ljw;")
   @ObfuscatedName("ug")
   public Tile method6207() {
      return this.linkedBelowTile;
   }

   public void setSceneTilePaint(net.runelite.api.SceneTilePaint var1) {
      this.paint = (SceneTilePaint)var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljv;")
   @ObfuscatedName("ix")
   public FloorDecoration method6208() {
      return this.floorDecoration;
   }

   public Point getSceneLocation() {
      throw new IllegalStateException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lci;I)Z")
   @ObfuscatedName("ai")
   public static boolean method6202(Player var0, int var1) {
      if (var0 == null) {
         var0.vmethod52();
      }

      return var1 >= -1928433644;
   }

   public void setGroundObject(GroundObject var1) {
      this.floorDecoration = (FloorDecoration)var1;
   }

   public LocalPoint getLocalLocation() {
      throw new IllegalStateException();
   }

   @ObfuscatedSignature(descriptor = "()Lkr;")
   @ObfuscatedName("zw")
   public SceneTileModel method6209() {
      return this.model;
   }

   @ObfuscatedSignature(descriptor = "(IZI)Ljava/lang/String;")
   @ObfuscatedName("ak")
   public static String intToString(int var0, boolean var1, int var2) {
      try {
         if (var1) {
            if (var2 != -358468941) {
               throw new IllegalStateException();
            }

            if (var0 >= 0) {
               int var4 = var0;
               if (var1) {
                  if (var2 != -358468941) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 0) {
                     int var5 = 2;

                     for (int var6 = var0 / 10; var6 != 0; var5++) {
                        if (var2 != -358468941) {
                           throw new IllegalStateException();
                        }

                        var6 /= 10;
                     }

                     char[] var7 = new char[var5];
                     var7[0] = '+';

                     for (int var8 = var5 - 1; var8 > 0; var8--) {
                        if (var2 != -358468941) {
                           throw new IllegalStateException();
                        }

                        int var9 = var4;
                        var4 /= 10;
                        int var10 = var9 - 10 * var4;
                        if (var10 >= 10) {
                           if (var2 != -358468941) {
                              throw new IllegalStateException();
                           }

                           var7[var8] = (char)(87 + var10);
                        } else {
                           var7[var8] = (char)(var10 + 48);
                        }
                     }

                     return new String(var7);
                  }

                  if (var2 != -358468941) {
                     throw new IllegalStateException();
                  }
               }

               return Integer.toString(var0, 10);
            }

            if (var2 != -358468941) {
               throw new IllegalStateException();
            }
         }

         return Integer.toString(var0);
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "jw.ak(" + ')');
      }
   }

   public List getGroundItems() {
      throw new IllegalStateException();
   }

   public void setSceneTileModel(net.runelite.api.SceneTileModel var1) {
      this.model = (SceneTileModel)var1;
   }

   public int getPlane() {
      return this.plane * 1971565835;
   }

   @ObfuscatedSignature(descriptor = "()Lkf;")
   @ObfuscatedName("io")
   public WallDecoration method6210() {
      return this.wallDecoration;
   }

   public WorldPoint getWorldLocation() {
      throw new IllegalStateException();
   }

   Tile(int var1, int var2, int var3) {
      this.gameObjectEdgeMasks = new int[5];
      this.gameObjectsEdgeMask = 0;
      this.originalPlane = (this.plane = 1437298339 * var1) * 1948546991;
      this.x = var2 * -1724023555;
      this.y = -1952906263 * var3;
   }
}
