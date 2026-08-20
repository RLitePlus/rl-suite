import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.DecorativeObjectDespawned;
import net.runelite.api.events.DecorativeObjectSpawned;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.WallObjectDespawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jh")
public class Scene extends Renderable implements net.runelite.api.Scene {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2985 = 128;
   @ObfuscatedName("ii")
   public boolean field3025;
   @ObfuscatedName("qn")
   public final int field2890;
   @ObfuscatedName("vt")
   public final int field2892;
   @ObfuscatedName("cu")
   int Scene_drawnCount;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2978 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field2981 = 128;
   @ObfuscatedName("dd")
   int[] Scene_planeOccluderCounts;
   @ObfuscatedName("ad")
   static final int[] field2876 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field2980 = 9;
   @ObfuscatedName("cc")
   int Scene_cameraX;
   @ObfuscatedName("gk")
   public int field3015;
   @ObfuscatedName("ap")
   static final int[] field2863 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @ObfuscatedSignature(descriptor = "[Lkz;")
   @ObfuscatedName("zz")
   public final SceneTilePaint[] field2901;
   @ObfuscatedSignature(descriptor = "Lka;")
   @ObfuscatedName("yp")
   public Projection field2917;
   @ObfuscatedName("cq")
   float field2971;
   @ObfuscatedName("au")
   static final int[] field2870 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   @ObfuscatedName("sd")
   public final int field2891;
   @ObfuscatedSignature(descriptor = "[[Lkj;")
   @ObfuscatedName("dw")
   Occluder[][] Scene_planeOccluders;
   @ObfuscatedSignature(descriptor = "Lrl17;")
   @ObfuscatedName("kc")
   public final rl17 field2885;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2983 = 128;
   @ObfuscatedName("cb")
   int Scene_cameraYTileMin;
   @ObfuscatedName("fk")
   public int field3014;
   @ObfuscatedName("ko")
   public final byte[] field2907;
   @ObfuscatedName("dh")
   int field3005;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2976 = 90;
   @ObfuscatedName("rs")
   public final byte[] field2909;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2975 = 32;
   @ObfuscatedName("dk")
   BitSet field2956;
   @ObfuscatedName("ar")
   public static boolean Scene_isLowDetail = false;
   @ObfuscatedName("gn")
   public int field3016;
   @ObfuscatedName("ah")
   final int worldViewId;
   @ObfuscatedSignature(descriptor = "Lko;")
   @ObfuscatedName("al")
   public final ModelColorOverride modelColorOverride;
   @ObfuscatedName("qn")
   public float field2889;
   @ObfuscatedSignature(descriptor = "Lko;")
   @ObfuscatedName("af")
   final ModelColorOverride field2879;
   @ObfuscatedName("nk")
   public int field3018;
   @ObfuscatedName("am")
   final int field2919;
   @ObfuscatedName("ao")
   final int field2960;
   @ObfuscatedName("aa")
   final int field2961;
   @ObfuscatedSignature(descriptor = "[Lku;")
   @ObfuscatedName("fy")
   public final BoundaryObject[] field2903;
   @ObfuscatedName("aq")
   final int field2962;
   @ObfuscatedName("cx")
   int Scene_cameraYTile;
   @ObfuscatedName("bv")
   int tempGameObjectsCount;
   @ObfuscatedName("cw")
   boolean checkClick;
   @ObfuscatedName("bs")
   final int field2964;
   @ObfuscatedName("hz")
   public int field3017;
   @ObfuscatedName("de")
   BitSet field2959;
   @ObfuscatedSignature(descriptor = "[[[Ljw;")
   @ObfuscatedName("bk")
   Tile[][][] tiles;
   @ObfuscatedName("bb")
   public int Scene_plane;
   @ObfuscatedName("tq")
   public static final int[] field2866 = new int[184];
   @ObfuscatedName("bn")
   boolean viewportWalking;
   @ObfuscatedSignature(descriptor = "[Lkj;")
   @ObfuscatedName("br")
   Occluder[] Scene_currentOccluders;
   @ObfuscatedName("kk")
   public static final int[] field2867 = new int[184];
   @ObfuscatedName("ip")
   public byte[][][] field3028;
   @ObfuscatedName("bp")
   public int field2924;
   @ObfuscatedName("ux")
   public static int field3021;
   @ObfuscatedName("bt")
   public int field2925;
   @ObfuscatedName("bu")
   public float Scene_scale;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field2984 = 50;
   @ObfuscatedName("cf")
   float field2969;
   @ObfuscatedName("by")
   public float field2929;
   @ObfuscatedName("jb")
   public long[] field2910;
   @ObfuscatedName("im")
   public final int field2899;
   @ObfuscatedName("tp")
   public final int field2897;
   @ObfuscatedName("az")
   static final int[] field2871 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   @ObfuscatedName("bf")
   public int baseY;
   @ObfuscatedName("bz")
   public int cycle;
   @ObfuscatedName("bd")
   int Scene_currentOccludersCount;
   @ObfuscatedName("di")
   int field3006;
   @ObfuscatedName("bh")
   int planes;
   @ObfuscatedSignature(descriptor = "[Lkr;")
   @ObfuscatedName("fz")
   public final SceneTileModel[] field2902;
   @ObfuscatedName("bl")
   int xSize;
   @ObfuscatedName("jv")
   public int field2882;
   @ObfuscatedName("bc")
   int ySize;
   @ObfuscatedSignature(descriptor = "[[[Lrl8;")
   @ObfuscatedName("va")
   public rl8[][][] field3030;
   @ObfuscatedName("bq")
   int[][][] tileHeights;
   @ObfuscatedName("lx")
   public int field2880;
   @ObfuscatedName("yu")
   public Map field2881;
   @ObfuscatedName("bx")
   int minPlane;
   @ObfuscatedName("bg")
   final int field2939;
   @ObfuscatedSignature(descriptor = "Ljl;")
   @ObfuscatedName("qt")
   public FloatProjection field2918;
   @ObfuscatedName("nc")
   public float field2974;
   @ObfuscatedSignature(descriptor = "[Ljv;")
   @ObfuscatedName("ev")
   public final FloorDecoration[] field2905;
   @ObfuscatedName("ch")
   int[][][] field2952;
   @ObfuscatedName("wo")
   public final int field2893;
   @ObfuscatedName("ce")
   int tileUpdateCount;
   @ObfuscatedSignature(descriptor = "[[[Lrl8;")
   @ObfuscatedName("ib")
   public rl8[][][] field2886;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field2979 = 32;
   @ObfuscatedName("ct")
   int Scene_cameraXTileMin;
   @ObfuscatedName("ij")
   public short[][][] field3031;
   @ObfuscatedName("cm")
   int Scene_cameraXTileMax;
   @ObfuscatedName("yy")
   public int[][][] field3029;
   @ObfuscatedName("qm")
   public final Set field2916;
   @ObfuscatedName("ec")
   int field3013;
   @ObfuscatedName("ck")
   int Scene_cameraYTileMax;
   @ObfuscatedName("wm")
   public int field3022;
   @ObfuscatedName("fa")
   public boolean field3024;
   @ObfuscatedName("be")
   final int field2965;
   @ObfuscatedName("cs")
   int Scene_cameraY;
   @ObfuscatedName("fs")
   public final int[] field2900;
   @ObfuscatedName("fu")
   public byte[][][] field3027;
   @ObfuscatedName("vr")
   public int field2883;
   @ObfuscatedName("cn")
   int Scene_cameraZ;
   @ObfuscatedName("co")
   int Scene_cameraXTile;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2982 = 64;
   @ObfuscatedSignature(descriptor = "[Lkf;")
   @ObfuscatedName("vx")
   public final WallDecoration[] field2904;
   @ObfuscatedName("cg")
   int Scene_entityX;
   @ObfuscatedName("cp")
   int Scene_entityY;
   @ObfuscatedName("cd")
   int field2990;
   @ObfuscatedName("cz")
   int field3001;
   @ObfuscatedName("ci")
   float field2970;
   @ObfuscatedName("ba")
   int Scene_baseX;
   @ObfuscatedName("rz")
   public int field3019;
   @ObfuscatedName("cy")
   float field2972;
   @ObfuscatedName("df")
   static final int[][] tileShape2D = new int[][]{
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
      {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
      {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
      {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
      {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1},
      {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}
   };
   @ObfuscatedName("bo")
   final int field2938;
   @ObfuscatedName("lv")
   public final int[] field2911;
   @ObfuscatedName("dt")
   int field3010;
   @ObfuscatedName("cr")
   int Scene_selectedPlane;
   @ObfuscatedName("ay")
   static final int[] field2877 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   @ObfuscatedName("ez")
   public final byte[] field2908;
   @ObfuscatedName("nh")
   public final int field2894;
   @ObfuscatedName("ca")
   int Scene_selectedScreenY;
   @ObfuscatedName("kq")
   public final int field2895;
   @ObfuscatedName("cl")
   int scenePlanesCount;
   @ObfuscatedName("du")
   int field3011;
   @ObfuscatedName("dx")
   int field2940;
   @ObfuscatedName("si")
   public int field3020;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field2977 = 383;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("dv")
   NodeDeque Scene_tilesDeque;
   @ObfuscatedSignature(descriptor = "[Ljb;")
   @ObfuscatedName("za")
   public final ItemLayer[] field2906;
   @ObfuscatedName("dy")
   static final int[][] tileRotation2D = new int[][]{
      {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
      {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
      {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
      {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}
   };
   @ObfuscatedName("rw")
   public short[][][] field2913;
   @ObfuscatedName("dc")
   int field3003;
   @ObfuscatedName("db")
   int field3002;
   @ObfuscatedName("bi")
   int Scene_baseY;
   @ObfuscatedName("cj")
   int Scene_selectedScreenX;
   @ObfuscatedName("dz")
   int field3012;
   @ObfuscatedSignature(descriptor = "[Lkd;")
   @ObfuscatedName("cv")
   GameObject[] gameObjects;
   @ObfuscatedSignature(descriptor = "Lrl15;")
   @ObfuscatedName("sa")
   public static final rl15 field2869 = new rl15();
   @ObfuscatedSignature(descriptor = "Ldd;")
   @ObfuscatedName("qo")
   public WorldView field3023;
   @ObfuscatedSignature(descriptor = "[Lkd;")
   @ObfuscatedName("dj")
   GameObject[] tempGameObjects;
   @ObfuscatedName("da")
   int Scene_offsetOccluder;
   @ObfuscatedName("bw")
   public int baseX;
   @ObfuscatedName("dr")
   int field2945;
   @ObfuscatedName("dg")
   int field3004;
   @ObfuscatedName("ic")
   public int[][][] field2888;
   @ObfuscatedName("dq")
   int[] field2946;
   @ObfuscatedSignature(descriptor = "[Lrl16;")
   @ObfuscatedName("rq")
   public final rl16[] field2914;
   @ObfuscatedName("pv")
   public final int field2898;
   @ObfuscatedName("ai")
   static final int[] field2873 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   @ObfuscatedName("kc")
   public float field2884;
   @ObfuscatedName("gz")
   public float field2973;
   @ObfuscatedName("dm")
   int field3007;
   @ObfuscatedName("zd")
   public BitSet field2915;
   @ObfuscatedName("hr")
   public int[] field3026;
   @ObfuscatedName("dp")
   int field3009;
   @ObfuscatedSignature(descriptor = "[Lkd;")
   @ObfuscatedName("ic")
   public final GameObject[] field2887;
   @ObfuscatedName("as")
   static final int[] field2872 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   @ObfuscatedName("ds")
   BitSet field2958;
   @ObfuscatedName("sa")
   public float field2868;
   @ObfuscatedSignature(descriptor = "[[Lrl16;")
   @ObfuscatedName("rw")
   public final rl16[][] field2912;
   @ObfuscatedSignature(descriptor = "Ljn;")
   @ObfuscatedName("dl")
   TileRenderMode field2944;
   @ObfuscatedName("do")
   BitSet field2921;
   @ObfuscatedName("oj")
   public final int field2896;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("bj")
   public TransformationMatrix field2922;
   @ObfuscatedName("dn")
   int field3008;
   @ObfuscatedName("bm")
   public int field2923;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;)V")
   @ObfuscatedName("wj")
   public static void method5514(Scene var0) {
      if (var0 == null) {
         var0.shouldSendWalk();
      }

      for (int var1 = 0; var1 < var0.tempGameObjectsCount; var1++) {
         GameObject var2 = var0.tempGameObjects[var1];
         var0.removeGameObject(var2);
         var0.tempGameObjects[var1] = null;
      }

      var0.tempGameObjectsCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fq")
   public void method5526(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.floorDecoration = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   static final int method5469(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("at")
   static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIIIIIZ)V")
   @ObfuscatedName("ms")
   public static void method5647(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var0 == null) {
         var0.getOverlayIds();
      }

      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= var0.xSize * 128) {
         var1 = var0.xSize * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= var0.ySize * 128) {
         var3 = var0.ySize * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      var0.field2970 = Rasterizer3D.field3038[var4];
      var0.field2969 = Rasterizer3D.field3037[var4];
      var0.field2972 = Rasterizer3D.field3038[var5];
      var0.field2971 = Rasterizer3D.field3037[var5];
      method5618(var0, (var4 - 128) / 32, var5 / 64);
      var0.Scene_cameraX = var1;
      var0.Scene_cameraY = var2;
      var0.Scene_cameraZ = var3;
      var0.Scene_cameraXTile = var1 / 128;
      var0.Scene_cameraYTile = var3 / 128;
      var0.Scene_entityX = var7 / 128;
      var0.Scene_entityY = var8 / 128;
      var0.Scene_plane = var6;
      IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
      if (Rasterizer3D.method5869()) {
         Rasterizer3D.clips.currentFaceAlpha = 0;
         var0.projectScene(var10, var9, true);
         Rasterizer3D.clips.currentFaceAlpha = 1;
         var0.projectScene(var10, var9, false);
         Rasterizer3D.clips.currentFaceAlpha = 2;
      } else {
         Rasterizer3D.clips.currentFaceAlpha = 2;
         var0.projectScene(var10, var9, true);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ff")
   public void method5515() {
      for (int var1 = 0; var1 < this.tempGameObjectsCount; var1++) {
         GameObject var2 = this.tempGameObjects[var1];
         this.removeGameObject(var2);
         this.tempGameObjects[var1] = null;
      }

      this.tempGameObjectsCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jw")
   public void method5776(int var1) {
      this.tiles = null;
      this.setMinLevel(var1);

      for (int var2 = 0; var2 < this.xSize; var2++) {
         for (int var3 = 0; var3 < this.ySize; var3++) {
            int var4 = this.method5690(var1, var2, var3);
            if (!this.method5737(var4)) {
               this.setTileMinPlane(var4, var1, var2, var3);
            }

            if (this.field2886[var1][var2][var3] == null) {
               this.field2886[var1][var2][var3] = new rl8(this, var4);
               this.method5687(var1, var2, var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl8;)V")
   @ObfuscatedName("bp")
   public void method5714(rl8 var1) {
      Callbacks var2 = SecureUrlRequester.client.getCallbacks();
      BoundaryObject var3 = var1.method9618();
      if (var3 != null) {
         WallObjectSpawned var4 = new WallObjectSpawned();
         var4.setTile(var1);
         var4.setWallObject(var3);
         var2.post(var4);
      }

      WallDecoration var13 = var1.method9621();
      if (var13 != null) {
         DecorativeObjectSpawned var5 = new DecorativeObjectSpawned();
         var5.setTile(var1);
         var5.setDecorativeObject(var13);
         var2.post(var5);
      }

      FloorDecoration var14 = var1.method9619();
      if (var14 != null) {
         GroundObjectSpawned var6 = new GroundObjectSpawned();
         var6.setTile(var1);
         var6.setGroundObject(var14);
         var2.post(var6);
      }

      for (GameObject var9 : var1.method9614()) {
         if (var9 != null) {
            int var10 = var9.startX * 1666005069;
            int var11 = var9.startY * 889015863;
            if (var10 == var1.method9616() && var11 == var1.method9615() && var9.endX * 1553138359 < 104 && var9.endY * -2094327665 < 104) {
               GameObjectSpawned var12 = new GameObjectSpawned();
               var12.setTile(var1);
               var12.setGameObject(var9);
               var2.post(var12);
            }
         }
      }
   }

   public int getBaseX() {
      return this.field3017;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ac")
   public void Scene_addOccluder(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Occluder var9 = new Occluder();
      var9.maxX = var3 / 128 * 496408929;
      var9.maxZ = var4 / 128 * -1879995635;
      var9.field3319 = var5 / 128 * -252472961;
      var9.field3335 = var6 / 128 * -2005555601;
      var9.minY = var2 * 2032819107;
      var9.maxY = var3 * -1996116791;
      var9.field3337 = var4 * 404787707;
      var9.minTileX = var5 * 289747341;
      var9.minZ = var6 * -1992453087;
      var9.minTileY = var7 * -1906312175;
      var9.field3324 = var8 * -1574631007;
      this.Scene_planeOccluders[var1][this.Scene_planeOccluderCounts[var1]++] = var9;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("eq")
   public void method5706(int var1, int var2, int var3, int var4) {
      int var5 = this.method5690(var1, var2, var3);
      if ((this.field3028[var1][var2][var3] & 8) != 0) {
         this.field2900[var5] = this.field2900[var5] | 64;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("ax")
   public void addTile(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      if (var4 == 0) {
         SceneTilePaint var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

         for (int var22 = var1; var22 >= 0; var22--) {
            int var23 = this.method5690(var22, var2, var3);
            if (this.field2886[var22][var2][var3] == null) {
               this.field2886[var22][var2][var3] = new rl8(this, var23);
               this.method5687(var22, var2, var3);
            }

            if (!this.method5737(var23)) {
               this.setTileMinPlane(var23, var22, var2, var3);
            }
         }

         int var26 = this.method5690(var1, var2, var3);
         this.field2901[var26] = var21;
         this.field2900[var26] = this.field2900[var26] | 256 | (var21.neColor * -120051743 != 12345678 ? 512 : 0);
      } else if (var4 != 1) {
         SceneTileModel var24 = new SceneTileModel(
            var4,
            var5,
            var6,
            var2 - this.field3014,
            var3 - this.field3014,
            var7,
            var8,
            var9,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16,
            var17,
            var18,
            var19,
            Math.max(1, var20)
         );

         for (int var27 = var1; var27 >= 0; var27--) {
            int var31 = this.method5690(var27, var2, var3);
            if (this.field2886[var27][var2][var3] == null) {
               this.field2886[var27][var2][var3] = new rl8(this, var31);
               this.method5687(var27, var2, var3);
            }

            if (!this.method5737(var31)) {
               this.setTileMinPlane(var31, var27, var2, var3);
            }
         }

         int var28 = this.method5690(var1, var2, var3);
         this.field2902[var28] = var24;
         this.field2900[var28] = this.field2900[var28] | 1024;
      } else {
         SceneTilePaint var25 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for (int var29 = var1; var29 >= 0; var29--) {
            int var32 = this.method5690(var29, var2, var3);
            if (this.field2886[var29][var2][var3] == null) {
               this.field2886[var29][var2][var3] = new rl8(this, var32);
               this.method5687(var29, var2, var3);
            }

            if (!this.method5737(var32)) {
               this.setTileMinPlane(var32, var29, var2, var3);
            }
         }

         int var30 = this.method5690(var1, var2, var3);
         this.field2901[var30] = var25;
         this.field2900[var30] = this.field2900[var30] | 256 | (var25.neColor * -120051743 != 12345678 ? 512 : 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;JLjz;Ljz;)V")
   @ObfuscatedName("ah")
   public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
      int var10 = var2 + this.field3014;
      int var11 = var3 + this.field3014;
      ItemLayer var12 = new ItemLayer();
      var12.third = var5;
      var12.x = (var2 * 128 + 64) * 1120156657;
      var12.y = (var3 * 128 + 64) * 954674805;
      var12.z = var4 * 2083339729;
      var12.tag = var6;
      var12.first = var8;
      var12.second = var9;
      var12.method5394(var1);
      int var13 = 0;
      int var14 = this.method5690(var1, var10, var11);
      if (this.method5737(var14)) {
         byte var15 = this.field2907[var14];

         for (int var16 = 0; var16 < var15; var16++) {
            GameObject var17 = this.field2887[var14 * 5 + var16];
            if ((var17.flags * 1362575399 & 256) == 256 && var17.renderable instanceof Model) {
               Model var18 = (Model)var17.renderable;
               var18.calculateBoundsCylinder();
               if (var18.height * -1272589951 > var13) {
                  var13 = var18.height * -1272589951;
               }
            }
         }
      }

      var12.height = var13 * -166504297;
      if (!this.method5737(var14)) {
         this.setTileMinPlane(var14, var1, var10, var11);
      }

      if (this.field2886[var1][var10][var11] == null) {
         this.field2886[var1][var10][var11] = new rl8(this, var14);
         this.method5687(var1, var10, var11);
      }

      rl16 var19 = this.field2912[var10 >> 3][var11 >> 3];
      if ((this.field2900[var14] & 12288) != 0) {
         var19.field5566.remove(this.field2906[var14]);
      }

      this.field2906[var14] = var12;
      this.field2900[var14] = this.field2900[var14] & -12289;
      this.field2900[var14] = this.field2900[var14] | (var13 != 0 ? 8192 : 4096);
      var19.field5566.add(var12);
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;Ljz;IIJI)V")
   @ObfuscatedName("al")
   public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      int var12 = var2 + this.field3014;
      int var13 = var3 + this.field3014;
      if (var5 != null || var6 != null) {
         int var14 = this.method5690(var1, var12, var13);
         BoundaryObject var15 = new BoundaryObject();
         var15.method6646(var9);
         var15.method6651(var11);
         var15.method6641(var2 * 128 + 64);
         var15.method6643(var3 * 128 + 64);
         var15.method6642(var4);
         var15.method6650(var5);
         var15.method6644(var6);
         var15.method6647(var7);
         var15.method6648(var8);

         for (int var16 = var1; var16 >= 0; var16--) {
            int var17 = this.method5690(var16, var12, var13);
            if (!this.method5737(var17)) {
               this.setTileMinPlane(var17, var16, var12, var13);
            }

            if (this.field2886[var16][var12][var13] == null) {
               this.field2886[var16][var12][var13] = new rl8(this, var17);
               this.method5687(var16, var12, var13);
            }
         }

         assert this.field2903[var14] == null;

         this.field2903[var14] = var15;
         this.field2900[var14] = this.field2900[var14] | 16384;
         this.field2910[var14] = this.field2910[var14] | 1080863910568919040L;
         if (var5 instanceof DynamicObject || var6 instanceof DynamicObject) {
            rl16 var20 = this.field2912[var12 >> 3][var13 >> 3];
            var20.field5566.add(var15);
            this.method5691((DynamicObject)var5);
            this.method5691((DynamicObject)var6);
         }

         this.method5779(var5, 0, var15.getX(), var15.getZ(), var15.getY(), var2, var3);
         this.method5779(var6, 0, var15.getX(), var15.getZ(), var15.getY(), var2, var3);
         var15.field3470 = var1;
         if (this.field3025) {
            WallObjectSpawned var21 = new WallObjectSpawned();
            var21.setTile(this.field2886[var1][var12][var13]);
            var21.setWallObject(var15);
            SecureUrlRequester.client.getCallbacks().post(var21);
         }

         if (this.field3025 && client.field1025 != null) {
            client.field1025.invalidateZone(this, var12 >> 3, var13 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;II)V")
   @ObfuscatedName("ft")
   public static void method5722(Scene var0, int var1, int var2) {
      if (var0 == null) {
         var0.setLinkBelow(var1, var1);
      } else {
         int var3 = var1 - var0.field3014;
         int var4 = var2 - var0.field3014;
         var0.method5694(var0.method5690(0, var1, var2), var0.field2899);

         for (int var5 = 0; var5 < 3; var5++) {
            int var6 = var0.method5690(var5, var1, var2);
            var0.method5694(var6 + var0.field2894, var6);
            if (var0.method5737(var6)) {
               byte var7 = var0.field2907[var6];

               for (int var8 = 0; var8 < var7; var8++) {
                  GameObject var9 = var0.field2887[var6 * 5 + var8];
                  long var10 = var9.tag * 1608625415500949283L;
                  int var12 = (int)(var10 >> 16 & 7L);
                  if (var12 == 2 && var9.startX * 1666005069 == var3 && var9.startY * 889015863 == var4) {
                     var9.plane = (var9.plane * 1291248351 - 1) * -786081505;
                  }
               }

               BoundaryObject var15 = var0.field2903[var6];
               if (var15 != null) {
                  var15.field3470--;
               }

               FloorDecoration var16 = var0.field2905[var6];
               if (var16 != null) {
                  var16.field3208--;
               }

               WallDecoration var17 = var0.field2904[var6];
               if (var17 != null) {
                  var17.field3300--;
               }
            }
         }

         int var13 = var0.method5690(0, var1, var2);
         if (!var0.method5737(var13)) {
            var0.setTileMinPlane(var13, 0, var1, var2);
         }

         if (var0.field2886[0][var1][var2] == null) {
            var0.field2886[0][var1][var2] = new rl8(var0, var13);
            var0.method5687(0, var1, var2);
         }

         var0.field2900[var13] = var0.field2900[var13] | 32;
         int var14 = var0.method5690(3, var1, var2);
         var0.method5694(var0.field2899, var14);
         var0.field2900[var14] = var0.field2900[var14] & -2;
         var0.method5768(var0.field2899);
         var0.field2886[3][var1][var2] = null;
         var0.method5687(3, var2, var2);
         var0.field2886[0][var1][var2].field5671 = new rl8(var0, var14);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;Lka;Lrl16;)V")
   @ObfuscatedName("au")
   public void method5727(Projection var1, Projection var2, rl16 var3) {
      if (!var3.field5567.isEmpty()) {
         rl15.field5563 = var1;
         var3.field5567.sort(field2869);

         for (int var4 = 0; var4 < var3.field5567.size(); var4++) {
            GameObject var5 = (GameObject)var3.field5567.get(var4);
            if (!(var5.renderable instanceof Scene)) {
               Renderable var6 = var5.renderable;

               Model var7;
               try {
                  var7 = var6 instanceof Model ? (Model)var6 : var6.method6220();
                  if (var7 == null) {
                     continue;
                  }
               } catch (Exception var9) {
                  client.field938.debug("exception drawing game entity", var9);
                  continue;
               }

               if (var7 != var6) {
                  var6.setModelHeight(var7.getModelHeight());
               }

               int var8 = var6.getAnimationHeightOffset();
               client.field1025
                  .drawTemp(
                     var1, this, var5, var7, var5.orientation * 46801735, var5.centerX * 1204024827, var5.z * 683703035 - var8, var5.centerY * 1465977803
                  );
               client.method2474(
                  var1,
                  var2,
                  var7,
                  var5.orientation * 46801735,
                  var5.centerX * 1204024827,
                  var5.z * 683703035 - var8,
                  var5.centerY * 1465977803,
                  var5.tag * 1608625415500949283L
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;Ljz;IIIIJI)V")
   @ObfuscatedName("et")
   public void method5500(
      int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13
   ) {
      if (var5 != null) {
         WallDecoration var14 = new WallDecoration();
         var14.tag = var11 * -8661371853864889935L;
         var14.flags = var13 * 627913227;
         var14.x = var2 * 757117056 + 378558528;
         var14.y = var3 * -198593920 + 2048186688;
         var14.z = var4 * -1903362711;
         var14.renderable1 = var5;
         var14.renderable2 = var6;
         var14.orientation = var7 * 1245442875;
         var14.orientation2 = var8 * -1434556873;
         var14.method6326(var9, var10, (byte)-70);

         for (int var15 = var1; var15 >= 0; var15--) {
            if (this.tiles[var15][var2][var3] == null) {
               this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].wallDecoration = var14;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qt")
   public void method5789() {
      this.method5641();
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("eq")
   public boolean method5764(int var1) {
      return (this.field2900[var1] & 4) != 0;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIILjz;IJI)Z")
   @ObfuscatedName("ao")
   public boolean method5502(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return method5780(this, var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjz;IJZ)V")
   @ObfuscatedName("ol")
   public void method5790(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
      this.method5503(var1, var2, var3, var4, var5, var6, var7, var8, var10);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bs")
   public void method5791(int var1, int var2, int var3, int var4) {
      this.method5715(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjz;IJZ)Z")
   @ObfuscatedName("eu")
   public boolean method5503(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return method5780(this, var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)J")
   @ObfuscatedName("rj")
   public static long method5547(Scene var0, int var1, int var2, int var3) {
      Tile var4 = var0.tiles[var1][var2][var3];
      return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L;
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjz;IJIIII)Z")
   @ObfuscatedName("aq")
   public boolean addNullableObject(
      int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13
   ) {
      return var6 == null ? true : method5780(this, var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public void setRoofRemovalMode(int var1) {
      this.field2880 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lkd;)V")
   @ObfuscatedName("bg")
   void removeGameObject(GameObject var1) {
      for (int var2 = var1.startX * 1666005069; var2 <= var1.endX * 1553138359; var2++) {
         int var3 = var2 + this.field3014;

         for (int var4 = var1.startY * 889015863; var4 <= var1.endY * -2094327665; var4++) {
            int var5 = var4 + this.field3014;
            int var6 = this.method5690(var1.plane * 1291248351, var3, var5);
            if (this.method5737(var6)) {
               byte var7 = this.field2907[var6];

               for (int var8 = 0; var8 < var7; var8++) {
                  GameObject var9 = this.field2887[var6 * 5 + var8];
                  if (var9 == var1) {
                     var7 = --this.field2907[var6];

                     for (int var10 = var8; var10 < var7; var10++) {
                        this.field2887[var6 * 5 + var10] = this.field2887[var6 * 5 + var10 + 1];
                        this.field2908[var6 * 5 + var10] = this.field2908[var6 * 5 + var10 + 1];
                     }

                     this.field2887[var6 * 5 + var7] = null;
                     break;
                  }
               }

               this.field2909[var6] = 0;

               for (int var12 = 0; var12 < this.field2907[var6]; var12++) {
                  this.field2909[var6] = (byte)(this.field2909[var6] | this.field2908[var6 * 5 + var12]);
               }
            }
         }
      }

      this.method5709(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljw;)V")
   @ObfuscatedName("jl")
   void method5666(Projection var1, Tile var2) {
      if (var2 != null) {
         int var3 = var2.x * 1738768469;
         int var4 = var2.y * -720501671;
         int var5 = var2.plane * 1971565835;
         int var6 = var2.originalPlane * -204188827;
         if (var2.plane * 1971565835 == 0 && var2.linkedBelowTile != null) {
            this.method5759(var1, var2.linkedBelowTile);
         }

         if (var2.paint != null) {
            if (!method5672(this, var6, var3, var4) && (var2.paint.neColor * -120051743 != 1865155520 || var5 <= this.Scene_selectedPlane)) {
               var1.drawTileUnderlay(this, var2.paint, var6, var3, var4, -436402298);
            }
         } else if (var2.model != null && !method5672(this, var6, var3, var4)) {
            var1.drawTileOverlay(this, var2.model, var3, var4, -656009185);
         }

         BoundaryObject var7 = var2.boundaryObject;
         if (var7 != null) {
            if (var7.renderable1 != null && !this.method5675(var6, var3, var4, var7.orientationA * -1263767342)) {
               var1.draw(var7.renderable1, 0, var7.x * -1937046859, var7.z * -421690259, var7.y * -1299414895, var7.tag * -4972732868916429537L);
            }

            if (var7.renderable2 != null && !this.method5675(var6, var3, var4, var7.orientationB * 1828021190)) {
               var1.draw(var7.renderable2, 0, var7.x * 2114462435, var7.z * -1912869971, var7.y * 797386072, var7.tag * -4972732868916429537L);
            }
         }

         WallDecoration var8 = var2.wallDecoration;
         if (var8 != null && !this.method5678(var6, var3, var4, var8.renderable1.height * 531916759)) {
            if (var8.orientation * 816678099 == 256) {
               var1.draw(
                  var8.renderable1,
                  0,
                  var8.x * 517710998 + var8.xOffset * 1501441925,
                  var8.z * 528600136,
                  var8.y * -1349163857 + var8.field3298 * 1799251127,
                  var8.tag * -7524770072208173231L
               );
               if (var8.renderable2 != null) {
                  var1.draw(var8.renderable2, 0, var8.x * -682745183, var8.z * -1416550376, var8.y * 1215145581, var8.tag * -7524770072208173231L);
               }
            } else {
               var1.draw(
                  var8.renderable1,
                  0,
                  var8.x * 269052318 + var8.xOffset * 1501441925,
                  var8.z * 185541931,
                  var8.y * 1215145581 + var8.field3298 * -1962527887,
                  var8.tag * -7524770072208173231L
               );
            }
         }

         FloorDecoration var9 = var2.floorDecoration;
         if (var9 != null) {
            var1.draw(var9.renderable, 0, var9.x * 501801403, var9.z * -1571708159, var9.y * -1754935111, var9.tag);
         }

         ItemLayer var10 = var2.itemLayer;
         if (var10 != null) {
            if (var10.first != null) {
               var1.draw(var10.first, 0, var10.x * 1211487271, var10.z * 2049665653 - var10.height * 2067113767, var10.y * -162090531, var10.tag);
            }

            if (var10.second != null) {
               var1.draw(var10.second, 0, var10.x * -2126801391, var10.z * -90686671 - var10.height * 2067113767, var10.y * -162090531, var10.tag);
            }

            if (var10.third != null) {
               var1.draw(var10.third, 0, var10.x * -1773670946, var10.z * -90686671 - var10.height * 548412670, var10.y * -162090531, var10.tag);
            }
         }

         for (int var11 = 0; var11 < var2.gameObjectsCount * 199423050; var11++) {
            GameObject var12 = var2.gameObjects[var11];
            var12.lastDrawn = this.Scene_drawnCount * -230921571;
            if (var12.startX * 1666005069 == var2.x * 1738768469
               && var12.startY * 604599708 == var2.y * -720501671
               && !this.method5679(
                  var6,
                  var12.startX * 1666005069,
                  var12.endX * 1553138359,
                  var12.startY * 889015863,
                  var12.endY * -2094327665,
                  var12.renderable.height * -1272589951
               )) {
               var1.draw(
                  var12.renderable,
                  var12.orientation * 46801735,
                  var12.centerX * -551480247,
                  var12.z * 683703035,
                  var12.centerY * -1302564195,
                  var12.tag * 1608625415500949283L
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hf")
   public void method5751(int var1, int var2, int var3) {
      if (var3 == this.field3023.plane * 2115028565 && !SecureUrlRequester.client.isMenuOpen()) {
         this.field2882 = var1;
         this.field2883 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bz")
   public void removeBoundaryObject(int var1, int var2, int var3) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var4 = this.method5690(var1, var2, var3);
      if (this.method5737(var4) && (this.field2900[var4] & 16384) != 0) {
         BoundaryObject var5 = this.field2903[var4];
         this.field2903[var4] = null;
         this.field2900[var4] = this.field2900[var4] & -16385;
         if (var5.renderable1 instanceof DynamicObject || var5.renderable2 instanceof DynamicObject) {
            rl16 var6 = this.field2912[var2 >> 3][var3 >> 3];
            var6.field5566.remove(var5);
         }

         if (this.field3025) {
            WallObjectDespawned var9 = new WallObjectDespawned();
            var9.setTile(this.field2886[var1][var2][var3]);
            var9.setWallObject(var5);
            SecureUrlRequester.client.getCallbacks().post(var9);
         }

         if (this.field3025 && client.field1025 != null) {
            client.field1025.invalidateZone(this, var2 >> 3, var3 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bk")
   public void removeWallDecoration(int var1, int var2, int var3) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var4 = this.method5690(var1, var2, var3);
      if (this.method5737(var4) && (this.field2900[var4] & 32768) != 0) {
         WallDecoration var5 = this.field2904[var4];
         this.field2904[var4] = null;
         this.field2900[var4] = this.field2900[var4] & -32769;
         if (var5.renderable1 instanceof DynamicObject || var5.renderable2 instanceof DynamicObject) {
            rl16 var6 = this.field2912[var2 >> 3][var3 >> 3];
            var6.field5566.remove(var5);
         }

         if (this.field3025) {
            DecorativeObjectDespawned var9 = new DecorativeObjectDespawned();
            var9.setTile(this.field2886[var1][var2][var3]);
            var9.setDecorativeObject(var5);
            SecureUrlRequester.client.getCallbacks().post(var9);
         }

         if (this.field3025 && client.field1025 != null) {
            client.field1025.invalidateZone(this, var2 >> 3, var3 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cx")
   boolean method5604(int var1, int var2, int var3, int var4) {
      return this.method5599(this.field2921, var1, var2, var3, var4);
   }

   public void setMinLevel(int var1) {
      this.minPlane = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fb")
   public void method5792(int var1, int var2, int var3, int var4) {
      this.method5706(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bj")
   public void removeFloorDecoration(int var1, int var2, int var3) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var4 = this.method5690(var1, var2, var3);
      if (this.method5737(var4) && (this.field2900[var4] & 2048) != 0) {
         FloorDecoration var5 = this.field2905[var4];
         this.field2905[var4] = null;
         this.field2900[var4] = this.field2900[var4] & -2049;
         if (var5.renderable instanceof DynamicObject) {
            rl16 var6 = this.field2912[var2 >> 3][var3 >> 3];
            var6.field5566.remove(var5);
         }

         if (this.field3025) {
            GroundObjectDespawned var9 = new GroundObjectDespawned();
            var9.setTile(this.field2886[var1][var2][var3]);
            var9.setGroundObject(var5);
            SecureUrlRequester.client.getCallbacks().post(var9);
         }

         if (this.field3025 && client.field1025 != null) {
            client.field1025.invalidateZone(this, var2 >> 3, var3 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bm")
   public void removeGroundItemPile(int var1, int var2, int var3) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var4 = this.method5690(var1, var2, var3);
      if (this.method5737(var4)) {
         ItemLayer var5 = this.field2906[var4];
         this.field2906[var4] = null;
         this.field2900[var4] = this.field2900[var4] & -12289;
         rl16 var6 = this.field2912[var2 >> 3][var3 >> 3];
         var6.field5566.remove(var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("db")
   public void method5715(int var1, int var2, int var3, int var4) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var5 = this.method5690(var1, var2, var3);
      if (this.method5737(var5)) {
         WallDecoration var6 = this.field2904[var5];
         if (var6 != null) {
            var6.method6333(var4 * var6.yOffset * 1804672227 / 16, var4 * var6.field3297 * 751081245 / 16);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("sz")
   public void method5689(int var1, int var2) {
      assert (var2 & 0xFF) == var2;

      this.field2900[var1] = this.field2900[var1] & 16777215;
      this.field2900[var1] = this.field2900[var1] | var2 << 24;
   }

   @ObfuscatedSignature(descriptor = "(III)Ljv;")
   @ObfuscatedName("fd")
   public FloorDecoration method5778(int var1, int var2, int var3) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var4 = this.method5690(var1, var2, var3);
      return this.method5737(var4) ? this.field2905[var4] : null;
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("gm")
   public long method5763(int var1, int var2, int var3) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var4 = this.method5690(var1, var2, var3);
      return this.method5737(var4) && this.field2904[var4] != null ? this.field2904[var4].tag * -7524770072208173231L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cz")
   public void method5793(int var1) {
      this.method5776(var1);
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("by")
   public long getWallDecorationTag(int var1, int var2, int var3) {
      int var4 = var2 + this.field3014;
      int var5 = var3 + this.field3014;
      int var6 = this.method5690(var1, var4, var5);
      if (!this.method5737(var6)) {
         return 0L;
      } else {
         byte var7 = this.field2907[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = this.field2887[var6 * 5 + var8];
            long var10 = var9.tag * 1608625415500949283L;
            int var12 = (int)(var10 >> 16 & 7L);
            if (var12 == 2 && var2 == var9.startX * 1666005069 && var3 == var9.startY * 889015863) {
               return var9.tag * 1608625415500949283L;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("bi")
   public long getBoundaryObjectTag(int var1, int var2, int var3) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var4 = this.method5690(var1, var2, var3);
      return this.method5737(var4) && this.field2905[var4] != null ? this.field2905[var4].tag : 0L;
   }

   public short[][][] getOverlayIds() {
      return this.field3031;
   }

   public int getDrawDistance() {
      return field3021;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ft")
   public void method5527(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.floorDecoration = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;III)V")
   @ObfuscatedName("br")
   void method5754(ModelData var1, int var2, int var3, int var4) {
      int var5 = var3 + 1;
      int var6 = var4 + 1;

      for (int var7 = var3; var7 <= var5; var7++) {
         if (var7 >= 0 && var7 < this.xSize) {
            for (int var8 = var4 - 1; var8 <= var6; var8++) {
               if (var8 >= 0 && var8 < this.ySize && (var7 >= var5 || var8 >= var6)) {
                  int var9 = this.method5690(var2, var7, var8);
                  if (this.method5737(var9)) {
                     FloorDecoration var10 = this.field2905[var9];
                     if (var10 != null && var10.renderable instanceof ModelData) {
                        int var11 = this.method5688(var2, var7, var8) - this.method5688(var2, var3, var4);
                        ModelData var12 = (ModelData)var10.renderable;
                        ModelData.method6127(var1, var12, (var7 - var3) * 128, var11, (var8 - var4) * 128, true);
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("gl")
   int method5560(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method5567(var1, var2, var3) - this.method5567(var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("rw")
   public void method5691(DynamicObject var1) {
      if (var1 != null) {
         var1.method2870();
         if (var1.field1196 > -1 && this.field2915 != null) {
            this.field2915.set(var1.field1196);
         }

         if (var1.method2871()) {
            var1.field1208 = true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("hl")
   boolean method5582(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.field2960 + var3 * this.field2961 + var4 * this.field2962 + var5, var6);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("ko")
   @Override
   void vmethod230(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      TransformationMatrix var15 = SecureUrlRequester.method3893(564587634);
      class456 var16 = BuddyRankComparator.method3976(-814754263);
      var16.field5516.method9303(class6.method119(var1, 400390998), 0.0F, 0.0F, -1574760321);
      var16.field5515.method9868(var4, var5, var6, 979412296);
      class456 var17 = BuddyRankComparator.method3976(-814754263);
      var17.field5515.method9868(-(this.xSize * 64) - this.field2923, this.field2924, -(this.ySize * 64) - this.field2925, -1963523157);
      TransformationMatrix var18 = SecureUrlRequester.method3893(1997326429);
      var18.method10017(var17, (byte)79);
      var15.method9987(1.0F, this.Scene_scale, 1.0F, 1.0F, -1879368353);
      TransformationMatrix.method9959(var18, var15, (byte)-83);
      TransformationMatrix.method9959(var18, this.field2922, (byte)-106);
      var15.method10017(var16, (byte)97);
      TransformationMatrix.method9959(var18, var15, (byte)-47);
      TransformationMatrix.method10012(var15, var18, -1854625913);
      var15.method9982(633757915);
      this.Scene_cameraX = (int)var15.method9995(var7, var8, var9, -1922958387);
      this.Scene_cameraY = (int)var15.method9996(var7, var8, var9, (byte)42);
      this.Scene_cameraZ = (int)var15.method9997(var7, var8, var9, (short)1603);
      this.Scene_cameraXTile = this.Scene_cameraX / 128;
      this.Scene_cameraYTile = this.Scene_cameraZ / 128;
      this.Scene_entityX = (int)var15.method9995(var12, 0.0F, var13, -1794127197) / 128;
      this.Scene_entityY = (int)var15.method9997(var12, 0.0F, var13, (short)1603) / 128;
      class463 var19 = new class463();
      TransformationMatrix var20 = SecureUrlRequester.method3893(-303617655);
      class463.method9764(var19, class6.method119(-var2, -327594410), -1314816461);
      var19.method9766(class6.method119(-var3, -2074750514), -1739121717);
      var19.method9775(var7, var8, var9, 85286073);
      var20.method9972(var19, (byte)12);
      var20.method9982(-1512675728);
      var16.method9422((short)8859);
      var17.method9422((short)31673);
      TransformationMatrix.method9929(var15, (byte)1);
      TransformationMatrix.method9959(var18, var20, (byte)-5);
      FloatProjection var21 = new FloatProjection(var18);
      var21.method6009(var10);
      ModelData0.method6707((byte)-71);
      this.projectScene(var21, var14, Rasterizer3D.clips.currentFaceAlpha != 1);
      ModelData0.method6707((byte)-38);
      TransformationMatrix.method9929(var20, (byte)1);
      TransformationMatrix.method9929(var18, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("do")
   public void method5572(int var1) {
      this.Scene_offsetOccluder = classSF.method10160(25, 90, var1, -19618711);
      AbstractRasterizer.method5437(this.Scene_offsetOccluder);
      if (this.field2946 != null && this.field2946.length > 0) {
         this.method5614(this.field2946, this.field3011, this.field3007, this.field3009, this.field3004);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljn;)V")
   @ObfuscatedName("cu")
   public void method5575(TileRenderMode var1) {
      if (var1 != this.field2944) {
         this.field2944 = var1;
         this.method5614(this.field2946, this.field3011, this.field3007, this.field3009, this.field3004);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("cm")
   boolean method5583(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.field2960 + var3 * this.field2961 + var4 * this.field2962 + var5, var6);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;Ljz;IIJI)V")
   @ObfuscatedName("sc")
   public void method5794(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      this.newBoundaryObject(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("sj")
   public static void method5712(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Scene var7 = AsyncHttpResponse.worldView.scene;
      int var8 = var1 + var7.field3014;
      int var9 = var2 + var7.field3014;
      rl16 var10 = var7.field2912[var8 >> 3][var9 >> 3];
      if (var5 == 0) {
         BoundaryObject var11 = var7.method5796(var0, var1, var2);
         if (var11 != null && (var11.renderable1 instanceof DynamicObject || var11.renderable2 instanceof DynamicObject) && !var10.field5566.contains(var11)) {
            var10.field5566.add(var11);
         }
      } else if (var5 == 1) {
         WallDecoration var12 = var7.method5800(var0, var1, var2);
         if (var12 != null && (var12.renderable1 instanceof DynamicObject || var12.renderable2 instanceof DynamicObject) && !var10.field5566.contains(var12)) {
            var10.field5566.add(var12);
         }
      } else if (var5 == 2) {
         GameObject var13 = var7.getGameObject(var0, var1, var2);
         if (var13 != null && var13.renderable instanceof DynamicObject && !var10.field5566.contains(var13)) {
            var10.field5566.add(var13);
         }
      } else if (var5 == 3) {
         FloorDecoration var14 = var7.getFloorDecoration(var0, var1, var2);
         if (var14 != null && var14.renderable instanceof DynamicObject && !var10.field5566.contains(var14)) {
            var10.field5566.add(var14);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("hs")
   boolean method5589(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5583(this.field2958, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cc")
   boolean method5591(int var1, int var2, int var3, int var4) {
      return method5581(this, this.field2959, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Ljz;IIIIII)V")
   @ObfuscatedName("xk")
   public void method5779(Renderable var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 instanceof Model) {
         Model var8 = (Model)var1;
         var8.calculateExtreme(var2);
         AABB var9 = var8.method6868(var2);
         int var10 = var3 - (var6 << 7);
         int var11 = var5 - (var7 << 7);
         int var12 = var10 + var9.xMid * -1721312265;
         int var13 = var4 + var9.yMid * 1267849313;
         int var14 = var11 + var9.zMid * 266507379;
         int var15 = var12 - var9.xMidOffset * 984504841;
         int var16 = var13 - var9.yMidOffset * -157622439;
         int var17 = var14 - var9.zMidOffset * 528344083;
         int var18 = var12 + var9.xMidOffset * 984504841;
         int var19 = var13 + var9.yMidOffset * -157622439;
         int var20 = var14 + var9.zMidOffset * 528344083;
         int var21 = var6 + this.field3014;
         int var22 = var7 + this.field3014;
         rl16 var23 = this.field2912[var21 >> 3][var22 >> 3];
         var23.field5573 = Math.min(var23.field5573, var15);
         var23.field5569 = Math.min(var23.field5569, var16);
         var23.field5572 = Math.min(var23.field5572, var17);
         var23.field5564 = Math.max(var23.field5564, var18);
         var23.field5571 = Math.max(var23.field5571, var19);
         var23.field5565 = Math.max(var23.field5565, var20);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("cg")
   boolean method5596(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5583(this.field2959, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("cn")
   boolean method5599(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.field2938 + var3 * this.field2939 + var4 * this.field2964 + var5);
   }

   public int getWorldViewId() {
      return this.worldViewId;
   }

   @ObfuscatedSignature(descriptor = "(IIIJ)I")
   @ObfuscatedName("bn")
   public int getObjectFlags(int var1, int var2, int var3, long var4) {
      Tile var6 = this.tiles[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.boundaryObject != null && var6.boundaryObject.tag * -4972732868916429537L == var4) {
         return var6.boundaryObject.flags * -1044451971 & -270051693;
      } else if (var6.wallDecoration != null && var6.wallDecoration.tag * -7524770072208173231L == var4) {
         return var6.wallDecoration.flags * 721590135 & 1005253092;
      } else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) {
         return var6.floorDecoration.flags * -12483549 & 0xFF;
      } else {
         for (int var7 = 0; var7 < var6.gameObjectsCount * 1265471425; var7++) {
            if (var6.gameObjects[var7].tag * 1608625415500949283L == var4) {
               return var6.gameObjects[var7].flags * 1469116866 & -1934611726;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljw;Z)V")
   @ObfuscatedName("jc")
   void method5663(Projection var1, Tile var2, boolean var3) {
      this.Scene_tilesDeque.addFirst(var2);

      label640:
      while (true) {
         Tile var4;
         int var5;
         int var6;
         int var7;
         int var8;
         Tile[][] var9;
         while (true) {
            var4 = (Tile)this.Scene_tilesDeque.removeLast();
            if (var4 == null) {
               return;
            }

            if (var4.drawSecondary) {
               var5 = var4.x * 1738768469;
               var6 = var4.y * -1849129306;
               var7 = var4.plane * 1971565835;
               var8 = var4.originalPlane * -1882629447;
               var9 = this.tiles[var7];
               if (!var4.drawPrimary) {
                  break;
               }

               if (var3) {
                  if (var7 > 0) {
                     Tile var10 = this.tiles[var7 - 1][var5][var6];
                     if (var10 != null && var10.drawSecondary) {
                        continue;
                     }
                  }

                  if (var5 <= this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin) {
                     Tile var21 = var9[var5 - 1][var6];
                     if (var21 != null && var21.drawSecondary && (var21.drawPrimary || (var4.gameObjectsEdgeMask * -776991163 & 1) == 0)) {
                        continue;
                     }
                  }

                  if (var5 >= this.Scene_cameraXTile && var5 < this.Scene_cameraXTileMax - 1) {
                     Tile var22 = var9[var5 + 1][var6];
                     if (var22 != null && var22.drawSecondary && (var22.drawPrimary || (var4.gameObjectsEdgeMask * -776991163 & 4) == 0)) {
                        continue;
                     }
                  }

                  if (var6 <= this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin) {
                     Tile var23 = var9[var5][var6 - 1];
                     if (var23 != null && var23.drawSecondary && (var23.drawPrimary || (var4.gameObjectsEdgeMask * -443279227 & 8) == 0)) {
                        continue;
                     }
                  }

                  if (var6 >= this.Scene_cameraYTile && var6 < this.Scene_cameraYTileMax - 1) {
                     Tile var24 = var9[var5][var6 + 1];
                     if (var24 != null && var24.drawSecondary && (var24.drawPrimary || (var4.gameObjectsEdgeMask * -776991163 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var3 = true;
               }

               var4.drawPrimary = false;
               if (var4.linkedBelowTile != null) {
                  Tile var25 = var4.linkedBelowTile;
                  if (var25.paint != null) {
                     if (!method5672(this, 0, var5, var6)) {
                        var1.drawTileUnderlay(this, var25.paint, 0, var5, var6, -436402298);
                     }
                  } else if (var25.model != null && !method5672(this, 0, var5, var6)) {
                     var1.drawTileOverlay(this, var25.model, var5, var6, -656009185);
                  }

                  BoundaryObject var11 = var25.boundaryObject;
                  if (var11 != null) {
                     var1.draw(var11.renderable1, 0, var11.x * 863006039, var11.z * -1912869971, var11.y * 546730723, var11.tag * -4972732868916429537L);
                  }

                  for (int var12 = 0; var12 < var25.gameObjectsCount * 1265471425; var12++) {
                     GameObject var13 = var25.gameObjects[var12];
                     if (var13 != null) {
                        var1.draw(
                           var13.renderable,
                           var13.orientation * 46801735,
                           var13.centerX * 1204024827,
                           var13.z * -104000136,
                           var13.centerY * 1465977803,
                           var13.tag * 1608625415500949283L
                        );
                     }
                  }
               }

               boolean var26 = false;
               if (var4.paint != null) {
                  if (!method5672(this, var8, var5, var6)) {
                     var26 = true;
                     if (var4.paint.neColor * -120051743 != 383117821 || var7 <= this.Scene_selectedPlane) {
                        var1.drawTileUnderlay(this, var4.paint, var8, var5, var6, -436402298);
                     }
                  }
               } else if (var4.model != null && !method5672(this, var8, var5, var6)) {
                  var26 = true;
                  var1.drawTileOverlay(this, var4.model, var5, var6, -656009185);
               }

               int var34 = 0;
               int var44 = 0;
               BoundaryObject var49 = var4.boundaryObject;
               WallDecoration var14 = var4.wallDecoration;
               if (var49 != null || var14 != null) {
                  if (this.Scene_cameraXTile == var5) {
                     var34++;
                  } else if (this.Scene_cameraXTile < var5) {
                     var34 += 2;
                  }

                  if (this.Scene_cameraYTile == var6) {
                     var34 += 3;
                  } else if (this.Scene_cameraYTile > var6) {
                     var34 += 6;
                  }

                  var44 = field2863[var34];
                  var4.field3223 = field2870[var34] * -1303724817;
               }

               if (var49 != null) {
                  if ((var49.orientationA * -666272519 & field2877[var34]) != 0) {
                     if (var49.orientationA * -666272519 == 16) {
                        var4.drawGameObjectEdges = 1766637505;
                        var4.field3222 = field2871[var34] * -2080838119;
                        var4.field3220 = -661082575 - var4.field3222 * 1293074774;
                     } else if (var49.orientationA * -666272519 == 2115174123) {
                        var4.drawGameObjectEdges = -761692286;
                        var4.field3222 = field2876[var34] * -1344466549;
                        var4.field3220 = 916701154 - var4.field3222 * -2104084422;
                     } else if (var49.orientationA * -666272519 == 64) {
                        var4.drawGameObjectEdges = -1523384572;
                        var4.field3222 = field2873[var34] * 1357831514;
                        var4.field3220 = -1896192775 - var4.field3222 * -1878168379;
                     } else {
                        var4.drawGameObjectEdges = -385010802;
                        var4.field3222 = field2872[var34] * -1344466549;
                        var4.field3220 = 929124223 - var4.field3222 * 1308426172;
                     }
                  } else {
                     var4.drawGameObjectEdges = 0;
                  }

                  if ((var49.orientationA * 1739207967 & var44) != 0 && !this.method5675(var8, var5, var6, var49.orientationA * -666272519)) {
                     var1.draw(var49.renderable1, 0, var49.x * -1486040682, var49.z * -1912869971, var49.y * 546730723, var49.tag * -4972732868916429537L);
                  }

                  if ((var49.orientationB * -960080451 & var44) != 0 && !this.method5675(var8, var5, var6, var49.orientationB * -211200105)) {
                     var1.draw(var49.renderable2, 0, var49.x * -1089120385, var49.z * 103664716, var49.y * 1103116384, var49.tag * -4972732868916429537L);
                  }
               }

               if (var14 != null && !this.method5678(var8, var5, var6, var14.renderable1.height * 191786305)) {
                  if ((var14.orientation * 1327001075 & var44) != 0) {
                     var1.draw(
                        var14.renderable1,
                        0,
                        var14.x * -682745183 + var14.xOffset * 1501441925,
                        var14.z * 121856729,
                        var14.y * 1215145581 + var14.field3298 * -1428942459,
                        var14.tag * -7524770072208173231L
                     );
                  } else if (var14.orientation * -1091470109 == 256) {
                     int var15 = var14.x * -1234029048 - this.Scene_cameraX;
                     int var16 = var14.y * 1170999806 - this.Scene_cameraZ;
                     int var17 = var14.orientation2 * -1475596409;
                     int var18;
                     if (var17 != 1 && var17 != 2) {
                        var18 = var15;
                     } else {
                        var18 = -var15;
                     }

                     int var19;
                     if (var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if (var19 < var18) {
                        var1.draw(
                           var14.renderable1,
                           0,
                           var14.x * -682745183 + var14.xOffset * 306971918,
                           var14.z * 121856729,
                           var14.y * 1215145581 + var14.field3298 * -2075741320,
                           var14.tag * -7524770072208173231L
                        );
                     } else if (var14.renderable2 != null) {
                        var1.draw(var14.renderable2, 0, var14.x * -682745183, var14.z * 121856729, var14.y * 1215145581, var14.tag * -7524770072208173231L);
                     }
                  }
               }

               if (var26) {
                  FloorDecoration var58 = var4.floorDecoration;
                  if (var58 != null) {
                     var1.draw(var58.renderable, 0, var58.x * 2034356017, var58.z * 1624638208, var58.y * -190028295, var58.tag);
                  }

                  ItemLayer var65 = var4.itemLayer;
                  if (var65 != null && var65.height * 385996045 == 0) {
                     if (var65.first != null) {
                        var1.draw(var65.first, 0, var65.x * -1625205487, var65.z * 1264735599, var65.y * -836077517, var65.tag);
                     }

                     if (var65.second != null) {
                        var1.draw(var65.second, 0, var65.x * -1625205487, var65.z * -90686671, var65.y * -162090531, var65.tag);
                     }

                     if (var65.third != null) {
                        var1.draw(var65.third, 0, var65.x * 1274075092, var65.z * -90686671, var65.y * 831103823, var65.tag);
                     }
                  }
               }

               int var59 = var4.gameObjectsEdgeMask * -776991163;
               if (var59 != 0) {
                  if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1 && (var59 & 4) != 0) {
                     Tile var66 = var9[var5 + 1][var6];
                     if (var66 != null && var66.drawSecondary) {
                        this.Scene_tilesDeque.addFirst(var66);
                     }
                  }

                  if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1 && (var59 & 2) != 0) {
                     Tile var67 = var9[var5][var6 + 1];
                     if (var67 != null && var67.drawSecondary) {
                        this.Scene_tilesDeque.addFirst(var67);
                     }
                  }

                  if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax && (var59 & 1) != 0) {
                     Tile var68 = var9[var5 - 1][var6];
                     if (var68 != null && var68.drawSecondary) {
                        this.Scene_tilesDeque.addFirst(var68);
                     }
                  }

                  if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax && (var59 & 8) != 0) {
                     Tile var69 = var9[var5][var6 - 1];
                     if (var69 != null && var69.drawSecondary) {
                        this.Scene_tilesDeque.addFirst(var69);
                     }
                  }
               }
               break;
            }
         }

         if (var4.drawGameObjectEdges * 403042499 != 0) {
            boolean var27 = true;

            for (int var35 = 0; var35 < var4.gameObjectsCount * 1265471425; var35++) {
               if (var4.gameObjects[var35].lastDrawn * -511982524 != this.Scene_drawnCount
                  && (var4.gameObjectEdgeMasks[var35] & var4.drawGameObjectEdges * 403042499) == var4.field3222 * 34151683) {
                  var27 = false;
                  break;
               }
            }

            if (var27) {
               BoundaryObject var36 = var4.boundaryObject;
               if (!this.method5675(var8, var5, var6, var36.orientationA * -666272519)) {
                  var1.draw(var36.renderable1, 0, var36.x * 1125715746, var36.z * 491282203, var36.y * 546730723, var36.tag * -4972732868916429537L);
               }

               var4.drawGameObjectEdges = 0;
            }
         }

         if (var4.drawGameObjects) {
            try {
               int var28 = var4.gameObjectsCount * 1265471425;
               var4.drawGameObjects = false;
               int var37 = 0;

               label588:
               for (int var45 = 0; var45 < var28; var45++) {
                  GameObject var50 = var4.gameObjects[var45];
                  if (var50.lastDrawn * 1629237777 != this.Scene_drawnCount) {
                     for (int var53 = var50.startX * -1397904659; var53 <= var50.endX * 1553138359; var53++) {
                        for (int var60 = var50.startY * -884954498; var60 <= var50.endY * -2094327665; var60++) {
                           Tile var70 = var9[var53][var60];
                           if (var70.drawPrimary) {
                              var4.drawGameObjects = true;
                              continue label588;
                           }

                           if (var70.drawGameObjectEdges * 403042499 != 0) {
                              int var75 = 0;
                              if (var53 > var50.startX * 862180821) {
                                 var75++;
                              }

                              if (var53 < var50.endX * -815281116) {
                                 var75 += 4;
                              }

                              if (var60 > var50.startY * -461445104) {
                                 var75 += 8;
                              }

                              if (var60 < var50.endY * 451605321) {
                                 var75 += 2;
                              }

                              if ((var75 & var70.drawGameObjectEdges * 403042499) == var4.field3220 * 838547666) {
                                 var4.drawGameObjects = true;
                                 continue label588;
                              }
                           }
                        }
                     }

                     this.gameObjects[var37++] = var50;
                     int var54 = this.Scene_cameraXTile - var50.startX * -1506855329;
                     int var61 = var50.endX * -1375718296 - this.Scene_cameraXTile;
                     if (var61 > var54) {
                        var54 = var61;
                     }

                     int var71 = this.Scene_cameraYTile - var50.startY * 889015863;
                     int var76 = var50.endY * -2094327665 - this.Scene_cameraYTile;
                     if (var76 > var71) {
                        var50.field3278 = (var54 + var76) * -1405360348;
                     } else {
                        var50.field3278 = (var54 + var71) * 2049269999;
                     }
                  }
               }

               while (true) {
                  int var46 = -2093936621;
                  int var51 = -1;

                  for (int var55 = 0; var55 < var37; var55++) {
                     GameObject var62 = this.gameObjects[var55];
                     if (var62.lastDrawn * 399338421 != this.Scene_drawnCount) {
                        if (var62.field3278 * 993497113 > var46) {
                           var46 = var62.field3278 * 186764815;
                           var51 = var55;
                        } else if (var62.field3278 * 972725437 == var46) {
                           int var72 = var62.centerX * 273343354 - this.Scene_cameraX;
                           int var77 = var62.centerY * -224585679 - this.Scene_cameraZ;
                           int var79 = this.gameObjects[var51].centerX * 2011991680 - this.Scene_cameraX;
                           int var80 = this.gameObjects[var51].centerY * 1465977803 - this.Scene_cameraZ;
                           if (var72 * var72 + var77 * var77 > var79 * var79 + var80 * var80) {
                              var51 = var55;
                           }
                        }
                     }
                  }

                  if (var51 == -1) {
                     if (var4.drawGameObjects) {
                        continue label640;
                     }
                     break;
                  }

                  GameObject var56 = this.gameObjects[var51];
                  var56.lastDrawn = this.Scene_drawnCount * -230921571;
                  if (!this.method5679(
                     var8,
                     var56.startX * -1581493190,
                     var56.endX * 1553138359,
                     var56.startY * 828162656,
                     var56.endY * -2094327665,
                     var56.renderable.height * -1272589951
                  )) {
                     var1.draw(
                        var56.renderable,
                        var56.orientation * 934832625,
                        var56.centerX * -413499904,
                        var56.z * 683703035,
                        var56.centerY * 848302239,
                        var56.tag * 1608625415500949283L
                     );
                  }

                  for (int var63 = var56.startX * 240443704; var63 <= var56.endX * 1553138359; var63++) {
                     for (int var73 = var56.startY * 889015863; var73 <= var56.endY * -59179052; var73++) {
                        Tile var78 = var9[var63][var73];
                        if (var78.drawGameObjectEdges * 403042499 != 0) {
                           this.Scene_tilesDeque.addFirst(var78);
                        } else if ((var63 != var5 || var73 != var6) && var78.drawSecondary) {
                           this.Scene_tilesDeque.addFirst(var78);
                        }
                     }
                  }
               }
            } catch (Exception var20) {
               var4.drawGameObjects = false;
            }
         }

         if (var4.drawSecondary && var4.drawGameObjectEdges * -1012434623 == 0) {
            if (var5 <= this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin) {
               Tile var29 = var9[var5 - 1][var6];
               if (var29 != null && var29.drawSecondary) {
                  continue;
               }
            }

            if (var5 >= this.Scene_cameraXTile && var5 < this.Scene_cameraXTileMax - 1) {
               Tile var30 = var9[var5 + 1][var6];
               if (var30 != null && var30.drawSecondary) {
                  continue;
               }
            }

            if (var6 <= this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin) {
               Tile var31 = var9[var5][var6 - 1];
               if (var31 != null && var31.drawSecondary) {
                  continue;
               }
            }

            if (var6 >= this.Scene_cameraYTile && var6 < this.Scene_cameraYTileMax - 1) {
               Tile var32 = var9[var5][var6 + 1];
               if (var32 != null && var32.drawSecondary) {
                  continue;
               }
            }

            var4.drawSecondary = false;
            this.tileUpdateCount--;
            ItemLayer var33 = var4.itemLayer;
            if (var33 != null && var33.height * 702359292 != 0) {
               if (var33.first != null) {
                  var1.draw(var33.first, 0, var33.x * 889806866, var33.z * -90686671 - var33.height * 2067113767, var33.y * -162090531, var33.tag);
               }

               if (var33.second != null) {
                  var1.draw(var33.second, 0, var33.x * -1625205487, var33.z * -90686671 - var33.height * -2140701131, var33.y * -162090531, var33.tag);
               }

               if (var33.third != null) {
                  var1.draw(var33.third, 0, var33.x * -1625205487, var33.z * 29381610 - var33.height * 2067113767, var33.y * -162090531, var33.tag);
               }
            }

            if (var4.field3223 * 1129050639 != 0) {
               WallDecoration var38 = var4.wallDecoration;
               if (var38 != null && !this.method5678(var8, var5, var6, var38.renderable1.height * -340848903)) {
                  if ((var38.orientation * 1327001075 & var4.field3223 * 1129050639) != 0) {
                     var1.draw(
                        var38.renderable1,
                        0,
                        var38.x * -682745183 + var38.xOffset * -1913728719,
                        var38.z * 121856729,
                        var38.y * 521355023 + var38.field3298 * -390795333,
                        var38.tag * -7524770072208173231L
                     );
                  } else if (var38.orientation * -992118451 == 256) {
                     int var47 = var38.x * 2037631685 - this.Scene_cameraX;
                     int var52 = var38.y * 1215145581 - this.Scene_cameraZ;
                     int var57 = var38.orientation2 * -1163646070;
                     int var64;
                     if (var57 != 1 && var57 != 2) {
                        var64 = var47;
                     } else {
                        var64 = -var47;
                     }

                     int var74;
                     if (var57 != 2 && var57 != 3) {
                        var74 = var52;
                     } else {
                        var74 = -var52;
                     }

                     if (var74 >= var64) {
                        var1.draw(
                           var38.renderable1,
                           0,
                           var38.x * -682745183 + var38.xOffset * -2141143584,
                           var38.z * 121856729,
                           var38.y * 1215145581 + var38.field3298 * -286847569,
                           var38.tag * -7524770072208173231L
                        );
                     } else if (var38.renderable2 != null) {
                        var1.draw(var38.renderable2, 0, var38.x * 1642642049, var38.z * 121856729, var38.y * 2069694373, var38.tag * -7524770072208173231L);
                     }
                  }
               }

               BoundaryObject var48 = var4.boundaryObject;
               if (var48 != null) {
                  if ((var48.orientationB * -599488210 & var4.field3223 * 1023501943) != 0
                     && !this.method5675(var8, var5, var6, var48.orientationB * 373712186)) {
                     var1.draw(var48.renderable2, 0, var48.x * 1223043775, var48.z * -1290161594, var48.y * -1728502148, var48.tag * -4972732868916429537L);
                  }

                  if ((var48.orientationA * 396151937 & var4.field3223 * -796527006) != 0
                     && !this.method5675(var8, var5, var6, var48.orientationA * -1304988988)) {
                     var1.draw(var48.renderable1, 0, var48.x * 724990389, var48.z * 1024285573, var48.y * 592968203, var48.tag * -4972732868916429537L);
                  }
               }
            }

            if (var7 < this.planes - 1) {
               Tile var39 = this.tiles[var7 + 1][var5][var6];
               if (var39 != null && var39.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var39);
               }
            }

            if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1) {
               Tile var40 = var9[var5 + 1][var6];
               if (var40 != null && var40.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var40);
               }
            }

            if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1) {
               Tile var41 = var9[var5][var6 + 1];
               if (var41 != null && var41.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var41);
               }
            }

            if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax) {
               Tile var42 = var9[var5 - 1][var6];
               if (var42 != null && var42.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var42);
               }
            }

            if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax) {
               Tile var43 = var9[var5][var6 - 1];
               if (var43 != null && var43.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var43);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("cd")
   boolean method5607(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5603(this.field2921, var1, var2, var3, var4, var5);
   }

   public void removeGameObject(net.runelite.api.GameObject var1) {
      this.removeGameObject((GameObject)var1);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cp")
   boolean method5609(int var1, int var2, int var3, int var4) {
      return this.method5599(this.field2956, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(III)Ljv;")
   @ObfuscatedName("ba")
   public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
      return this.method5778(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method5698(int var1) {
      return this.field2900[var1] >> 24 & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("iu")
   boolean method5612(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5603(this.field2956, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(Lka;Lka;Ljz;IIIIJ)V")
   @ObfuscatedName("nm")
   public void method5724(Projection var1, Projection var2, Renderable var3, int var4, int var5, int var6, int var7, long var8) {
      if (var3 instanceof Model) {
         Model var10 = (Model)var3;
         var10.calculateBoundsCylinder();
         client.method2474(var1, var2, var10, var4, var5, var6, var7, var8);
      } else if (var3 instanceof DynamicObject) {
         int var14 = client.field997 >> 7 & 15;
         DynamicObject var11 = (DynamicObject)var3;
         if (var11.field1208 || var14 > 0) {
            Model var12 = var11.method2868(rl19.field5583);
            if (var12 != null) {
               var12.calculateBoundsCylinder();
               int var13 = var11.getAnimationHeightOffset();

               assert !var11.field1208 || var13 == 0;

               client.method2474(var1, var2, var12, var4, var5, var6 - var13, var7, var8);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lku;")
   @ObfuscatedName("ra")
   public BoundaryObject method5796(int var1, int var2, int var3) {
      return classXR.method12494(this, var1, var2, var3);
   }

   public int[] getMapRegions() {
      return this.field3026;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("hz")
   boolean method5579(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.field2960 + var3 * this.field2961 + var4 * this.field2962 + var5);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("sk")
   public void method5717() {
      if ((client.field997 & 16) != 0) {
         for (int var1 = 0; var1 < this.xSize >> 3; var1++) {
            for (int var2 = 0; var2 < this.ySize >> 3; var2++) {
               rl16 var3 = this.field2912[var1][var2];
               if (var3 != null) {
                  boolean var4 = false;

                  for (int var5 = 0; var5 < var3.field5566.size(); var5++) {
                     TileObject var6 = (TileObject)var3.field5566.get(var5);
                     if (var6 instanceof GameObject) {
                        GameObject var7 = (GameObject)var6;

                        assert var7.renderable instanceof DynamicObject;

                        DynamicObject var8 = (DynamicObject)var7.renderable;
                        if (!var8.field1208 && var8.method2871()) {
                           var8.method2870();
                           var8.field1208 = true;
                           var4 = true;
                        }
                     } else if (var6 instanceof FloorDecoration) {
                        FloorDecoration var9 = (FloorDecoration)var6;

                        assert var9.renderable instanceof DynamicObject;

                        DynamicObject var12 = (DynamicObject)var9.renderable;
                        if (!var12.field1208 && var12.method2871()) {
                           var12.method2870();
                           var12.field1208 = true;
                           var4 = true;
                        }
                     } else if (var6 instanceof BoundaryObject) {
                        BoundaryObject var10 = (BoundaryObject)var6;
                        if (var10.renderable1 instanceof DynamicObject) {
                           DynamicObject var13 = (DynamicObject)var10.renderable1;
                           if (!var13.field1208 && var13.method2871()) {
                              var13.method2870();
                              var13.field1208 = true;
                              var4 = true;
                           }
                        }

                        if (var10.renderable2 instanceof DynamicObject) {
                           DynamicObject var14 = (DynamicObject)var10.renderable2;
                           if (!var14.field1208 && var14.method2871()) {
                              var14.method2870();
                              var14.field1208 = true;
                              var4 = true;
                           }
                        }
                     } else if (var6 instanceof WallDecoration) {
                        WallDecoration var11 = (WallDecoration)var6;
                        if (var11.renderable1 instanceof DynamicObject) {
                           DynamicObject var15 = (DynamicObject)var11.renderable1;
                           if (!var15.field1208 && var15.method2871()) {
                              var15.method2870();
                              var15.field1208 = true;
                              var4 = true;
                           }
                        }

                        if (var11.renderable2 instanceof DynamicObject) {
                           DynamicObject var16 = (DynamicObject)var11.renderable2;
                           if (!var16.field1208 && var16.method2871()) {
                              var16.method2870();
                              var16.field1208 = true;
                              var4 = true;
                           }
                        }
                     }
                  }

                  if (var4) {
                     client.field1025.invalidateZone(this, var3.field5568, var3.field5570);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ko")
   public void method5710() {
      this.field3023 = null;

      for (int var1 = 0; var1 < this.xSize >> 3; var1++) {
         for (int var2 = 0; var2 < this.ySize >> 3; var2++) {
            rl16 var3 = this.field2912[var1][var2];

            for (int var4 = 0; var4 < 4; var4++) {
               int var5 = this.method5690(var4, var1, var2);
               BoundaryObject var6 = this.field2903[var5];
               if (var6 != null) {
                  var6.tag = -1L * -8195661098055663905L;
                  var6.renderable1 = var6.renderable2 = null;
               }

               WallDecoration var7 = this.field2904[var5];
               if (var7 != null) {
                  var7.tag = -1L * -8661371853864889935L;
                  var7.renderable1 = var7.renderable2 = null;
               }

               FloorDecoration var8 = this.field2905[var5];
               if (var8 != null) {
                  var8.tag = -1L;
                  var8.renderable = null;
               }

               for (int var9 = 0; var9 < this.field2907[var5]; var9++) {
                  GameObject var10 = this.field2887[var5 * 5 + var9];
                  var10.tag = -1L * -108185211891154805L;
                  var10.renderable = null;
               }
            }

            for (TileObject var12 : var3.field5566) {
               if (var12 instanceof GameObject) {
                  GameObject var13 = (GameObject)var12;
                  DynamicObject var17 = (DynamicObject)var13.renderable;

                  assert var17.field1198 == this;

                  var17.field1198 = null;
               } else if (var12 instanceof FloorDecoration) {
                  FloorDecoration var14 = (FloorDecoration)var12;
                  DynamicObject var18 = (DynamicObject)var14.renderable;

                  assert var18.field1198 == this;

                  var18.field1198 = null;
               } else if (var12 instanceof BoundaryObject) {
                  BoundaryObject var15 = (BoundaryObject)var12;
                  if (var15.renderable1 instanceof DynamicObject) {
                     DynamicObject var19 = (DynamicObject)var15.renderable1;

                     assert var19.field1198 == this;

                     var19.field1198 = null;
                  }

                  if (var15.renderable2 instanceof DynamicObject) {
                     DynamicObject var20 = (DynamicObject)var15.renderable2;

                     assert var20.field1198 == this;

                     var20.field1198 = null;
                  }
               } else if (var12 instanceof WallDecoration) {
                  WallDecoration var16 = (WallDecoration)var12;
                  if (var16.renderable1 instanceof DynamicObject) {
                     DynamicObject var21 = (DynamicObject)var16.renderable1;

                     assert var21.field1198 == this;

                     var21.field1198 = null;
                  }

                  if (var16.renderable2 instanceof DynamicObject) {
                     DynamicObject var22 = (DynamicObject)var16.renderable2;

                     assert var22.field1198 == this;

                     var22.field1198 = null;
                  }
               }
            }
         }
      }

      this.method5806();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("qt")
   public static boolean method5601(Scene var0, BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * var0.field2938 + var3 * var0.field2939 + var4 * var0.field2964 + var5, var6);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ka")
   boolean method5677(int var1, int var2, int var3, int var4) {
      if (!method5672(this, var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method5683(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1)
            && this.method5683(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1)
            && this.method5683(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
            && this.method5683(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cq")
   boolean method5623(int var1, int var2, int var3, int var4) {
      if (!this.method5609(var1, var2, var3, var4)) {
         return this.method5604(var1, var2, var3, var4);
      } else {
         this.method5612(var1, var2, var3, var4, false);
         int var5 = var1 * 32 + 128;
         int var6 = var2 * 64;
         int var7 = (var3 - this.Scene_offsetOccluder - this.field2945 - 1) * 128;
         int var8 = (var4 - this.Scene_offsetOccluder - this.field2940 - 1) * 128;

         for (int var9 = -this.field3011; var9 <= this.field3007; var9 += 128) {
            if (this.method5627(var7, this.field2946[var1] + var9, var8, var5, var6)) {
               return this.method5607(var1, var2, var3, var4, true);
            }
         }

         return this.method5607(var1, var2, var3, var4, false);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dc")
   public void method5694(int var1, int var2) {
      this.field2900[var2] = this.field2900[var1];
      this.field2901[var2] = this.field2901[var1];
      this.field2902[var2] = this.field2902[var1];
      this.field2903[var2] = this.field2903[var1];
      this.field2904[var2] = this.field2904[var1];
      this.field2905[var2] = this.field2905[var1];
      this.field2906[var2] = this.field2906[var1];
      this.field2907[var2] = this.field2907[var1];

      for (int var3 = 0; var3 < 5; var3++) {
         this.field2887[var2 * 5 + var3] = this.field2887[var1 * 5 + var3];
         this.field2908[var2 * 5 + var3] = this.field2908[var1 * 5 + var3];
      }

      this.field2909[var2] = this.field2909[var1];
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("cr")
   public void method5632(int var1, int var2, int var3) {
      this.Scene_selectedPlane = var1;
      this.Scene_selectedScreenX = var2;
      this.Scene_selectedScreenY = var3;
   }

   public boolean isInstance() {
      return this.field3024;
   }

   public int getBaseY() {
      return this.field3020;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("ge")
   @Override
   void vmethod234(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      IntProjection var15 = IntProjection.field3178;
      float var16 = var15.field3169;
      float var17 = var15.field3166;
      float var18 = var15.field3171;
      class456 var19 = class456.method9437();
      var19.field5516.method9339((float)client.method2436(var1 & 2047), 0.0F, 0.0F);
      var19.field5515.method9921(var4, var5, var6);
      class456 var20 = class456.method9437();
      var20.field5515.method9921(-(this.xSize * 64) - this.field2923, this.field2924, -(this.ySize * 64) - this.field2925);
      TransformationMatrix var21 = ((FloatProjection)this.field2917).transformationMatrix;
      var21.method10034(var20);
      TransformationMatrix var22 = TransformationMatrix.method10019();
      var22.method10023(1.0F, this.Scene_scale, 1.0F, 1.0F);
      var21.method10024(var22);
      var21.method10024(this.field2922);
      var22.method10034(var19);
      var21.method10024(var22);
      var22.method10020(var21);
      var22.method10035();
      this.field2889 = var22.method10026(var16, var17, var18);
      this.field2868 = var22.method10031(var16, var17, var18);
      this.field2973 = var22.method10033(var16, var17, var18);
      this.Scene_cameraX = (int)this.field2889;
      this.Scene_cameraY = (int)this.field2868;
      this.Scene_cameraZ = (int)this.field2973;
      this.Scene_cameraXTile = this.Scene_cameraX >> 7;
      this.Scene_cameraYTile = this.Scene_cameraZ >> 7;
      this.Scene_entityX = (int)var22.method10026(var12, 0.0F, var13) >> 7;
      this.Scene_entityY = (int)var22.method10033(var12, 0.0F, var13) >> 7;
      var19.method9438();
      var20.method9438();
      var22.method10028();
      this.field2918.transformationMatrix.method10020(var21);
      class463 var23 = class463.field5683;
      var23.method9787();
      var23.method9786(-var15.field3170);
      var23.method9789(-var15.field3167);
      var23.method9788(var16, var17, var18);
      TransformationMatrix var24 = TransformationMatrix.method10019();
      var24.method10032(var23);
      var24.method10035();
      var21.method10024(var24);
      var24.method10028();
      ViewportMouse.ViewportMouse_false0 = false;
      ((FloatProjection)this.field2917).field3079 = var10 * 1113747779295338803L;
      if ((client.field997 & 16) != 0) {
         this.method5783(true, var14);
         this.method5558(this.field2917, this.field2918);
         Rasterizer3D.clips.field3431.method6541(this.field2879);
      } else {
         this.method5783(Rasterizer3D.clips.currentFaceAlpha != 1, var14);
         if (Rasterizer3D.clips.currentFaceAlpha == 0) {
            assert Rasterizer3D.field3042.method5453();

            assert !SecureUrlRequester.client.isGpu();

            this.method5772(this.field2917);
         } else {
            this.method5702(this.field2917);
         }

         Rasterizer3D.clips.field3431.method6541(this.field2879);
         if (client.field1025 != null) {
            client.field1025.postDrawScene();
         }
      }

      ViewportMouse.ViewportMouse_false0 = false;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("dw")
   public void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      int var10 = client.field997 >> 7 & 15;
      rl21.method9559(var10);
      client.method2505();
      var1 = SpriteBufferProperties.cameraX * -201184013;
      var2 = ScriptFrame.cameraY * 2001367751;
      var3 = class528.cameraZ * 1084219535;
      var4 = GraphicsObject.cameraPitch * -1593954547;
      var5 = WorldMapData_0.cameraYaw * 197556079;
      boolean var11 = SecureUrlRequester.client.isGpu();
      if (!var11 && client.field993 != 0) {
         AbstractRasterizer.method5451(
            SecureUrlRequester.client.getViewportXOffset(),
            SecureUrlRequester.client.getViewportYOffset(),
            SecureUrlRequester.client.getViewportWidth(),
            SecureUrlRequester.client.getViewportHeight(),
            client.field993
         );
      }

      this.Scene_cameraX = Ints.constrainToRange(var1, this.field3022 << 7, (this.field3018 << 7) - 1);
      this.Scene_cameraY = var2;
      this.Scene_cameraZ = Ints.constrainToRange(var3, this.field3016 << 7, (this.field3015 << 7) - 1);
      this.field2889 = Floats.constrainToRange((float)client.field965, this.field3022 << 7, (this.field3018 << 7) - 1);
      this.field2868 = (float)client.field958;
      this.field2973 = Floats.constrainToRange((float)client.field964, this.field3016 << 7, (this.field3015 << 7) - 1);
      this.Scene_cameraXTile = this.Scene_cameraX >> 7;
      this.Scene_cameraYTile = this.Scene_cameraZ >> 7;
      this.Scene_cameraXTile = this.Scene_cameraXTile + this.field3014;
      this.Scene_cameraYTile = this.Scene_cameraYTile + this.field3014;
      this.Scene_entityX = var7 >> 7;
      this.Scene_entityY = var8 >> 7;
      this.Scene_entityX = this.Scene_entityX + this.field3014;
      this.Scene_entityY = this.Scene_entityY + this.field3014;
      this.Scene_plane = var6;
      int var12 = Ints.constrainToRange(var4, 128, 383);
      float var13 = (float)client.field967;
      if (!client.field914) {
         var4 = var12;
         var13 = Floats.constrainToRange(var13, (float) (Math.PI / 8), 1.1750293F);
      }

      this.method5805((var12 - 128) / 32, var5 / 64);
      this.field2970 = Rasterizer3D.field3038[var4];
      this.field2969 = Rasterizer3D.field3037[var4];
      this.field2972 = Rasterizer3D.field3038[var5];
      this.field2971 = Rasterizer3D.field3037[var5];
      this.field2884 = var13;
      this.field2974 = (float)client.field966;
      IntProjection var14 = new IntProjection(this.Scene_cameraX, this.Scene_cameraY, this.Scene_cameraZ, var4, var5, var7, var8);
      var14.field3169 = this.field2889;
      var14.field3166 = this.field2868;
      var14.field3171 = this.field2973;
      var14.field3170 = this.field2884;
      var14.field3167 = this.field2974;
      var14.field3168 = (float)Math.sin(this.field2884);
      var14.field3165 = (float)Math.cos(this.field2884);
      var14.field3172 = (float)Math.sin(this.field2974);
      var14.field3173 = (float)Math.cos(this.field2974);
      this.field2917 = var14;
      IntProjection.field3178 = var14;
      if ((client.field997 & 16) != 0) {
         this.method5783(true, var9);
         this.method5558(var14, null);
         Rasterizer3D.clips.field3431.method6541(this.field2879);
         this.method5766(null);
         SecureUrlRequester.client.getCallbacks().drawScene();
      } else if (Rasterizer3D.field3042.method5453() && !SecureUrlRequester.client.isGpu()) {
         Rasterizer3D.clips.currentFaceAlpha = 0;
         this.method5783(true, var9);
         this.method5772(var14);
         Rasterizer3D.clips.field3431.method6541(this.field2879);
         Rasterizer3D.clips.currentFaceAlpha = 1;
         this.method5783(false, var9);
         this.method5702(var14);
         Rasterizer3D.clips.field3431.method6541(this.field2879);
         Rasterizer3D.clips.currentFaceAlpha = 2;
         SecureUrlRequester.client.getCallbacks().drawScene();
         if (client.field1025 != null) {
            client.field1025.postDrawScene();
         }
      } else {
         Rasterizer3D.clips.currentFaceAlpha = 2;
         this.method5783(true, var9);
         this.method5702(var14);
         Rasterizer3D.clips.field3431.method6541(this.field2879);
         SecureUrlRequester.client.getCallbacks().drawScene();
         if (client.field1025 != null) {
            client.field1025.postDrawScene();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;ZZ)V")
   @ObfuscatedName("dv")
   void projectScene(Projection var1, boolean var2, boolean var3) {
   }

   @ObfuscatedSignature(descriptor = "(Lka;Z)V")
   @ObfuscatedName("dy")
   void method5659(Projection var1, boolean var2) {
      this.tileUpdateCount = 0;

      for (int var3 = this.minPlane; var3 < this.planes; var3++) {
         Tile[][] var4 = this.tiles[var3];

         for (int var5 = this.Scene_cameraXTileMin; var5 < this.Scene_cameraXTileMax; var5++) {
            for (int var6 = this.Scene_cameraYTileMin; var6 < this.Scene_cameraYTileMax; var6++) {
               Tile var7 = var4[var5][var6];
               if (var7 != null) {
                  if (var7.minPlane * -295997735 <= this.Scene_plane
                     && (
                        !var2
                           || this.visibleTiles(
                              var5 - this.Scene_cameraXTile + this.field2945 + this.Scene_offsetOccluder,
                              var6 - this.Scene_cameraYTile + this.field2940 + this.Scene_offsetOccluder
                           )
                           || this.tileHeights[var3][var5][var6] - this.Scene_cameraY >= 2000
                     )) {
                     var7.drawPrimary = true;
                     var7.drawSecondary = true;
                     if (var7.gameObjectsCount * 1265471425 > 0) {
                        var7.drawGameObjects = true;
                     } else {
                        var7.drawGameObjects = false;
                     }

                     this.tileUpdateCount++;
                  } else {
                     var7.drawPrimary = false;
                     var7.drawSecondary = false;
                     var7.drawGameObjectEdges = 0;
                  }
               }
            }
         }
      }

      int var14 = Math.abs(this.field2945);
      int var15 = Math.abs(this.field2940);

      for (int var16 = this.minPlane; var16 < this.planes; var16++) {
         Tile[][] var18 = this.tiles[var16];

         for (int var20 = -(this.Scene_offsetOccluder + var14); var20 <= 0; var20++) {
            int var8 = this.Scene_cameraXTile + var20;
            int var9 = this.Scene_cameraXTile - var20;
            if (var8 >= this.Scene_cameraXTileMin || var9 < this.Scene_cameraXTileMax) {
               for (int var10 = -(this.Scene_offsetOccluder + var15); var10 <= 0; var10++) {
                  int var11 = this.Scene_cameraYTile + var10;
                  int var12 = this.Scene_cameraYTile - var10;
                  if (var8 >= this.Scene_cameraXTileMin && var8 < this.Scene_cameraXTileMax) {
                     if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
                        Tile var13 = var18[var8][var11];
                        if (var13 != null && var13.drawPrimary) {
                           this.drawTile(var1, var13, true);
                        }
                     }

                     if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
                        Tile var27 = var18[var8][var12];
                        if (var27 != null && var27.drawPrimary) {
                           this.drawTile(var1, var27, true);
                        }
                     }
                  }

                  if (var9 >= this.Scene_cameraXTileMin && var9 < this.Scene_cameraXTileMax) {
                     if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
                        Tile var28 = var18[var9][var11];
                        if (var28 != null && var28.drawPrimary) {
                           this.drawTile(var1, var28, true);
                        }
                     }

                     if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
                        Tile var29 = var18[var9][var12];
                        if (var29 != null && var29.drawPrimary) {
                           this.drawTile(var1, var29, true);
                        }
                     }
                  }

                  if (this.tileUpdateCount == 0) {
                     this.method5641();
                     Rasterizer3D.clips.field3431.method6530(this.field2879);
                     return;
                  }
               }
            }
         }
      }

      for (int var17 = this.minPlane; var17 < this.planes; var17++) {
         Tile[][] var19 = this.tiles[var17];

         for (int var21 = -(this.Scene_offsetOccluder + var14); var21 <= 0; var21++) {
            int var22 = this.field2990 + var21;
            int var23 = this.field2990 - var21;
            if (var22 >= this.Scene_cameraXTileMin || var23 < this.Scene_cameraXTileMax) {
               for (int var24 = -(this.Scene_offsetOccluder + var15); var24 <= 0; var24++) {
                  int var25 = this.field3001 + var24;
                  int var26 = this.field3001 - var24;
                  if (var22 >= this.Scene_cameraXTileMin && var22 < this.Scene_cameraXTileMax) {
                     if (var25 >= this.Scene_cameraYTileMin && var25 < this.Scene_cameraYTileMax) {
                        Tile var30 = var19[var22][var25];
                        if (var30 != null && var30.drawPrimary) {
                           this.drawTile(var1, var30, false);
                        }
                     }

                     if (var26 >= this.Scene_cameraYTileMin && var26 < this.Scene_cameraYTileMax) {
                        Tile var31 = var19[var22][var26];
                        if (var31 != null && var31.drawPrimary) {
                           this.drawTile(var1, var31, false);
                        }
                     }
                  }

                  if (var23 >= this.Scene_cameraXTileMin && var23 < this.Scene_cameraXTileMax) {
                     if (var25 >= this.Scene_cameraYTileMin && var25 < this.Scene_cameraYTileMax) {
                        Tile var32 = var19[var23][var25];
                        if (var32 != null && var32.drawPrimary) {
                           this.drawTile(var1, var32, false);
                        }
                     }

                     if (var26 >= this.Scene_cameraYTileMin && var26 < this.Scene_cameraYTileMax) {
                        Tile var33 = var19[var23][var26];
                        if (var33 != null && var33.drawPrimary) {
                           this.drawTile(var1, var33, false);
                        }
                     }
                  }

                  if (this.tileUpdateCount == 0) {
                     this.method5641();
                     Rasterizer3D.clips.field3431.method6530(this.field2879);
                     return;
                  }
               }
            }
         }
      }

      Rasterizer3D.clips.field3431.method6530(this.field2879);
      this.method5641();
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljw;Z)V")
   @ObfuscatedName("dc")
   void drawTile(Projection var1, Tile var2, boolean var3) {
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ia")
   public boolean method5797(int var1, int var2, int var3) {
      return method5672(this, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Lka;Z)V")
   @ObfuscatedName("vl")
   public static void method5656(Scene var0, Projection var1, boolean var2) {
      if (var0 == null) {
         var0.updateVisibleTilesAndOccluders(var1, var2);
      }

      var0.tileUpdateCount = 0;

      for (int var3 = var0.minPlane; var3 < var0.planes; var3++) {
         Tile[][] var4 = var0.tiles[var3];

         for (int var5 = var0.Scene_cameraXTileMin; var5 < var0.Scene_cameraXTileMax; var5++) {
            for (int var6 = var0.Scene_cameraYTileMin; var6 < var0.Scene_cameraYTileMax; var6++) {
               Tile var7 = var4[var5][var6];
               if (var7 != null
                  && var7.minPlane * -295997735 <= var0.Scene_plane
                  && (
                     !var2
                        || var0.visibleTiles(
                           var5 - var0.Scene_cameraXTile + var0.field2945 + var0.Scene_offsetOccluder,
                           var6 - var0.Scene_cameraYTile + var0.field2940 + var0.Scene_offsetOccluder
                        )
                        || var0.tileHeights[var3][var5][var6] - var0.Scene_cameraY >= 2000
                  )) {
                  var0.method5759(var1, var7);
               }
            }
         }
      }

      var0.method5641();
      Rasterizer3D.clips.field3431.method6530(var0.field2879);
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljw;)V")
   @ObfuscatedName("db")
   void method5759(Projection var1, Tile var2) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jk")
   void method5668() {
      int var1 = this.Scene_planeOccluderCounts[this.Scene_plane];
      Occluder[] var2 = this.Scene_planeOccluders[this.Scene_plane];
      this.Scene_currentOccludersCount = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         Occluder var4 = var2[var3];
         if (var4.minY * 100315147 == 1) {
            int var14 = var4.maxX * -148649311 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
            if (var14 >= 0 && var14 <= this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
               int var16 = var4.field3319 * -470143361 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
               if (var16 < 0) {
                  var16 = 0;
               }

               int var18 = var4.field3335 * 1711044751 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
               if (var18 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
                  var18 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
               }

               boolean var20 = false;

               while (var16 <= var18) {
                  if (this.visibleTiles(var14, var16++)) {
                     var20 = true;
                     break;
                  }
               }

               if (var20) {
                  int var22 = this.Scene_cameraX - var4.maxY * 1482829177;
                  if (var22 > 32) {
                     var4.field3320 = 1914877877;
                  } else {
                     if (var22 >= -32) {
                        continue;
                     }

                     var4.field3320 = -465211542;
                     var22 = -var22;
                  }

                  var4.maxTileX = (var4.minTileX * -1389987515 - this.Scene_cameraZ << 8) / var22 * 818308459;
                  var4.minX = (var4.minZ * 282521569 - this.Scene_cameraZ << 8) / var22 * -239764303;
                  var4.field3321 = (var4.minTileY * 1051489521 - this.Scene_cameraY << 8) / var22 * 1269296287;
                  var4.field3330 = (var4.field3324 * 1574771297 - this.Scene_cameraY << 8) / var22 * 1380630977;
                  this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
               }
            }
         } else if (var4.minY * 100315147 == 2) {
            int var13 = var4.field3319 * -470143361 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
            if (var13 >= 0 && var13 <= this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
               int var15 = var4.maxX * -148649311 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
               if (var15 < 0) {
                  var15 = 0;
               }

               int var17 = var4.maxZ * 2070166469 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
               if (var17 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
                  var17 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
               }

               boolean var19 = false;

               while (var15 <= var17) {
                  if (this.visibleTiles(var15++, var13)) {
                     var19 = true;
                     break;
                  }
               }

               if (var19) {
                  int var21 = this.Scene_cameraZ - var4.minTileX * -1389987515;
                  if (var21 > 32) {
                     var4.field3320 = 1449666335;
                  } else {
                     if (var21 >= -32) {
                        continue;
                     }

                     var4.field3320 = -930423084;
                     var21 = -var21;
                  }

                  var4.maxTileY = (var4.maxY * 1482829177 - this.Scene_cameraX << 8) / var21 * 540575933;
                  var4.type = (var4.field3337 * 602919219 - this.Scene_cameraX << 8) / var21 * -416546231;
                  var4.field3321 = (var4.minTileY * 1051489521 - this.Scene_cameraY << 8) / var21 * 1269296287;
                  var4.field3330 = (var4.field3324 * 1574771297 - this.Scene_cameraY << 8) / var21 * 1380630977;
                  this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
               }
            }
         } else if (var4.minY * 100315147 == 4) {
            int var5 = var4.minTileY * 1051489521 - this.Scene_cameraY;
            if (var5 > 128) {
               int var6 = var4.field3319 * -470143361 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = var4.field3335 * 1711044751 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
               if (var7 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
                  var7 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
               }

               if (var6 <= var7) {
                  int var8 = var4.maxX * -148649311 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  int var9 = var4.maxZ * 2070166469 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
                  if (var9 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
                     var9 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
                  }

                  boolean var10 = false;

                  label187:
                  for (int var11 = var8; var11 <= var9; var11++) {
                     for (int var12 = var6; var12 <= var7; var12++) {
                        if (this.visibleTiles(var11, var12)) {
                           var10 = true;
                           break label187;
                        }
                     }
                  }

                  if (var10) {
                     var4.field3320 = 984454793;
                     var4.maxTileY = (var4.maxY * 1482829177 - this.Scene_cameraX << 8) / var5 * 540575933;
                     var4.type = (var4.field3337 * 602919219 - this.Scene_cameraX << 8) / var5 * -416546231;
                     var4.maxTileX = (var4.minTileX * -1389987515 - this.Scene_cameraZ << 8) / var5 * 818308459;
                     var4.minX = (var4.minZ * 282521569 - this.Scene_cameraZ << 8) / var5 * -239764303;
                     this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dn")
   public void method5481(int var1, int var2) {
      Tile var3 = this.tiles[0][var1][var2];

      for (int var4 = 0; var4 < 3; var4++) {
         Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.plane -= 1437298339;

            for (int var6 = 0; var6 < var5.gameObjectsCount * 1265471425; var6++) {
               GameObject var7 = var5.gameObjects[var6];
               long var9 = 1608625415500949283L * var7.tag;
               boolean var8 = classPC.method8712(var9) == 2;
               if (var8 && var7.startX * 1666005069 == var1 && var7.startY * 889015863 == var2) {
                  var7.plane -= -786081505;
               }
            }
         }
      }

      if (this.tiles[0][var1][var2] == null) {
         this.tiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.tiles[0][var1][var2].linkedBelowTile = var3;
      this.tiles[3][var1][var2] = null;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("dz")
   boolean method5675(int var1, int var2, int var3, int var4) {
      if (!method5672(this, var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.tileHeights[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.Scene_cameraX) {
                  if (!this.method5683(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5683(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5683(var5, var9, var6)) {
                  return false;
               }

               if (!this.method5683(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.Scene_cameraZ) {
                  if (!this.method5683(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5683(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5683(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method5683(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.Scene_cameraX) {
                  if (!this.method5683(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5683(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5683(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method5683(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.Scene_cameraZ) {
                  if (!this.method5683(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5683(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method5683(var5, var9, var6)) {
                  return false;
               }

               if (!this.method5683(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method5683(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method5683(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method5683(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method5683(var5 + 128, var9, var6);
         } else {
            return var4 == 128 ? this.method5683(var5, var9, var6) : true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("di")
   boolean method5678(int var1, int var2, int var3, int var4) {
      if (!method5672(this, var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method5683(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1)
            && this.method5683(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1)
            && this.method5683(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
            && this.method5683(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("dl")
   boolean method5679(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var3 && var4 == var5) {
         if (!method5672(this, var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return this.method5683(var13 + 1, this.tileHeights[var1][var2][var4] - var6, var15 + 1)
               && this.method5683(var13 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var15 + 1)
               && this.method5683(var13 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
               && this.method5683(var13 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (this.field2952[var1][var7][var8] == -this.Scene_drawnCount) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = this.tileHeights[var1][var2][var4] - var6;
         if (!this.method5683(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method5683(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !this.method5683(var12, var9, var11) ? false : this.method5683(var10, var9, var11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;III)J")
   @ObfuscatedName("ob")
   public static long method5731(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method5732(var1, var1, var1);
      } else {
         var2 += var0.field3014;
         var3 += var0.field3014;
         int var4 = var0.method5690(var1, var2, var3);
         return var0.method5737(var4) && var0.field2903[var4] != null ? var0.field2903[var4].tag * -4972732868916429537L : 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("vr")
   public void method5696(int var1, int var2) {
      assert (var2 & 15) == var2;

      this.field2900[var1] = this.field2900[var1] & -15728641;
      this.field2900[var1] = this.field2900[var1] | var2 << 20;
   }

   public byte getOverrideSaturation() {
      return this.modelColorOverride.overrideSaturation;
   }

   public int[][][] getRoofs() {
      return this.field2888;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("dr")
   boolean method5683(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.Scene_currentOccludersCount; var4++) {
         Occluder var5 = this.Scene_currentOccluders[var4];
         if (var5.field3320 * 185187997 == 1) {
            int var6 = var5.maxY * 1482829177 - var1;
            if (var6 > 0) {
               int var7 = var5.minTileX * -1389987515 + (var5.maxTileX * 2026020675 * var6 >> 8);
               int var8 = var5.minZ * 282521569 + (var5.minX * -2059449263 * var6 >> 8);
               int var9 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var6 >> 8);
               int var10 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 2) {
            int var11 = var1 - var5.maxY * 1482829177;
            if (var11 > 0) {
               int var15 = var5.minTileX * -1389987515 + (var5.maxTileX * 2026020675 * var11 >> 8);
               int var19 = var5.minZ * 282521569 + (var5.minX * -2059449263 * var11 >> 8);
               int var23 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var11 >> 8);
               int var27 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var11 >> 8);
               if (var3 >= var15 && var3 <= var19 && var2 >= var23 && var2 <= var27) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 3) {
            int var12 = var5.minTileX * -1389987515 - var3;
            if (var12 > 0) {
               int var16 = var5.maxY * 1482829177 + (var5.maxTileY * 753513109 * var12 >> 8);
               int var20 = var5.field3337 * 602919219 + (var5.type * 965971961 * var12 >> 8);
               int var24 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var12 >> 8);
               int var28 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var12 >> 8);
               if (var1 >= var16 && var1 <= var20 && var2 >= var24 && var2 <= var28) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 4) {
            int var13 = var3 - var5.minTileX * -1389987515;
            if (var13 > 0) {
               int var17 = var5.maxY * 1482829177 + (var5.maxTileY * 753513109 * var13 >> 8);
               int var21 = var5.field3337 * 602919219 + (var5.type * 965971961 * var13 >> 8);
               int var25 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var13 >> 8);
               int var29 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var13 >> 8);
               if (var1 >= var17 && var1 <= var21 && var2 >= var25 && var2 <= var29) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 5) {
            int var14 = var2 - var5.minTileY * 1051489521;
            if (var14 > 0) {
               int var18 = var5.maxY * 1482829177 + (var5.maxTileY * 753513109 * var14 >> 8);
               int var22 = var5.field3337 * 602919219 + (var5.type * 965971961 * var14 >> 8);
               int var26 = var5.minTileX * -1389987515 + (var5.maxTileX * 2026020675 * var14 >> 8);
               int var30 = var5.minZ * 282521569 + (var5.minX * -2059449263 * var14 >> 8);
               if (var1 >= var18 && var1 <= var22 && var3 >= var26 && var3 <= var30) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jz")
   public void method5479(int var1) {
      this.minPlane = var1;

      for (int var2 = 0; var2 < this.xSize; var2++) {
         for (int var3 = 0; var3 < this.ySize; var3++) {
            if (this.tiles[var1][var2][var3] == null) {
               this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[[[Lrl8;")
   @ObfuscatedName("pd")
   public rl8[][][] method5695() {
      return this.field3030;
   }

   @ObfuscatedSignature(descriptor = "(III)Lkd;")
   @ObfuscatedName("bu")
   public GameObject getGameObject(int var1, int var2, int var3) {
      return method5734(this, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Z)V")
   @ObfuscatedName("jm")
   public static void method5628(Scene var0, boolean var1) {
      if (var0 == null) {
         var0.menuOpen(var1);
      }

      if (!WidgetDefinition.method7971(var0) || var1) {
         var0.checkClick = true;
         var0.viewportWalking = var1;
         var0.baseX = -1;
         var0.baseY = -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dx")
   static final int method5470(int var0, int var1) {
      var1 = var1 * (var0 & 884148868) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > -2099083429) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ix")
   public void method5629(boolean var1) {
      if (!WidgetDefinition.method7971(this) || var1) {
         this.checkClick = true;
         this.viewportWalking = var1;
         this.baseX = -1;
         this.baseY = -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Lka;ZZ)V")
   @ObfuscatedName("zt")
   public static void method5652(Scene var0, Projection var1, boolean var2, boolean var3) {
      if (var0 == null) {
         var0.method5717();
      }

      var0.Scene_drawnCount++;
      var0.field2879.method6530(Rasterizer3D.clips.field3431);
      Rasterizer3D.clips.field3431.method6530(var0.modelColorOverride);
      boolean var4 = var0.worldViewId == -1;
      if (var3) {
         var0.Scene_baseX = -1;
         var0.Scene_baseY = -1;
         var0.field2929 = -1.0F;
         var0.field2990 = !var2 && var0.field2944 != TileRenderMode.field3137 ? var0.Scene_entityX : var0.Scene_cameraXTile;
         var0.field3001 = !var2 && var0.field2944 != TileRenderMode.field3137 ? var0.Scene_entityY : var0.Scene_cameraYTile;
         if (var4) {
            var0.Scene_cameraXTileMin = var0.field2990 - var0.Scene_offsetOccluder;
            if (var0.Scene_cameraXTileMin < 0) {
               var0.Scene_cameraXTileMin = 0;
            }

            var0.Scene_cameraYTileMin = var0.field3001 - var0.Scene_offsetOccluder;
            if (var0.Scene_cameraYTileMin < 0) {
               var0.Scene_cameraYTileMin = 0;
            }

            var0.Scene_cameraXTileMax = var0.field2990 + var0.Scene_offsetOccluder;
            if (var0.Scene_cameraXTileMax > var0.xSize) {
               var0.Scene_cameraXTileMax = var0.xSize;
            }

            var0.Scene_cameraYTileMax = var0.field3001 + var0.Scene_offsetOccluder;
            if (var0.Scene_cameraYTileMax > var0.ySize) {
               var0.Scene_cameraYTileMax = var0.ySize;
            }
         } else {
            var0.Scene_cameraXTileMin = 0;
            var0.Scene_cameraYTileMin = 0;
            var0.Scene_cameraXTileMax = var0.xSize;
            var0.Scene_cameraYTileMax = var0.ySize;
            var0.field2990 = var0.xSize / 2;
            var0.field3001 = var0.ySize / 2;
            var0.Scene_offsetOccluder = Math.max(var0.field2990, var0.field3001);
         }

         var0.field2945 = var0.Scene_cameraXTile - var0.field2990;
         var0.field2940 = var0.Scene_cameraYTile - var0.field3001;
         if (var4) {
            var0.method5668();
         }
      }

      if (Rasterizer3D.clips.currentFaceAlpha == 0) {
         method5656(var0, var1, var4);
      } else {
         var0.method5659(var1, var4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("dm")
   static boolean method5473(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   public void setDrawDistance(int var1) {
      field3021 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kz")
   @Override
   void vmethod231(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      TransformationMatrix var15 = SecureUrlRequester.method3893(1564475697);
      class456 var16 = BuddyRankComparator.method3976(-814754263);
      var16.field5516.method9303(class6.method119(var1, -825251958), 0.0F, 0.0F, -1574760321);
      var16.field5515.method9868(var4, var5, var6, -1502365310);
      class456 var17 = BuddyRankComparator.method3976(-814754263);
      var17.field5515.method9868(-(this.xSize * 64) - this.field2923, this.field2924, -(this.ySize * 64) - this.field2925, 401458273);
      TransformationMatrix var18 = SecureUrlRequester.method3893(-680118980);
      var18.method10017(var17, (byte)76);
      var15.method9987(1.0F, this.Scene_scale, 1.0F, 1.0F, -1804999470);
      TransformationMatrix.method9959(var18, var15, (byte)-12);
      TransformationMatrix.method9959(var18, this.field2922, (byte)-125);
      var15.method10017(var16, (byte)73);
      TransformationMatrix.method9959(var18, var15, (byte)-14);
      TransformationMatrix.method10012(var15, var18, -833413178);
      var15.method9982(-1365479816);
      this.Scene_cameraX = (int)var15.method9995(var7, var8, var9, -1889508070);
      this.Scene_cameraY = (int)var15.method9996(var7, var8, var9, (byte)-16);
      this.Scene_cameraZ = (int)var15.method9997(var7, var8, var9, (short)1603);
      this.Scene_cameraXTile = this.Scene_cameraX / 128;
      this.Scene_cameraYTile = this.Scene_cameraZ / 128;
      this.Scene_entityX = (int)var15.method9995(var12, 0.0F, var13, -1878396949) / 128;
      this.Scene_entityY = (int)var15.method9997(var12, 0.0F, var13, (short)1603) / 128;
      class463 var19 = new class463();
      TransformationMatrix var20 = SecureUrlRequester.method3893(474865817);
      class463.method9764(var19, class6.method119(-var2, -193452347), -1314816461);
      var19.method9766(class6.method119(-var3, -125072742), -1739121717);
      var19.method9775(var7, var8, var9, 857768725);
      var20.method9972(var19, (byte)16);
      var20.method9982(-762791399);
      var16.method9422((short)22900);
      var17.method9422((short)29100);
      TransformationMatrix.method9929(var15, (byte)1);
      TransformationMatrix.method9959(var18, var20, (byte)-34);
      FloatProjection var21 = new FloatProjection(var18);
      var21.method6009(var10);
      ModelData0.method6707((byte)-45);
      this.projectScene(var21, var14, Rasterizer3D.clips.currentFaceAlpha != 1);
      ModelData0.method6707((byte)-102);
      TransformationMatrix.method9929(var20, (byte)1);
      TransformationMatrix.method9929(var18, (byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIII)Z")
   @ObfuscatedName("wf")
   public static boolean method5592(Scene var0, int var1, int var2, int var3, int var4) {
      return method5581(var0, var0.field2959, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("hw")
   public boolean method5799(int var1, int var2, int var3, int var4) {
      return this.method5678(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("gj")
   public void method5551(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.planes; var4++) {
         for (int var5 = 0; var5 < this.xSize; var5++) {
            for (int var6 = 0; var6 < this.ySize; var6++) {
               Tile var7 = this.tiles[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.boundaryObject;
                  if (var8 != null && var8.renderable1 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.renderable1;
                     class144.method3966(this, var9, var4, var5, var6, 1, 1);
                     if (var8.renderable2 instanceof ModelData) {
                        ModelData var10 = (ModelData)var8.renderable2;
                        class144.method3966(this, var10, var4, var5, var6, 1, 1);
                        ModelData.method6020(var9, var10, 0, 0, 0, false);
                        var8.renderable2 = ModelData.method6106(var10, var10.ambient, var10.contrast, var1, var2, var3);
                     }

                     var8.renderable1 = ModelData.method6106(var9, var9.ambient, var9.contrast, var1, var2, var3);
                  }

                  for (int var12 = 0; var12 < var7.gameObjectsCount * 1037511515; var12++) {
                     GameObject var14 = var7.gameObjects[var12];
                     if (var14 != null && var14.renderable instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.renderable;
                        class144.method3966(
                           this,
                           var11,
                           var4,
                           var5,
                           var6,
                           var14.endX * 805113865 - var14.startX * 1666005069 + 1,
                           var14.endY * 279404555 - var14.startY * -1038103155 + 1
                        );
                        var14.renderable = ModelData.method6106(var11, var11.ambient, var11.contrast, var1, var2, var3);
                     }
                  }

                  FloorDecoration var13 = var7.floorDecoration;
                  if (var13 != null && var13.renderable instanceof ModelData) {
                     ModelData var15 = (ModelData)var13.renderable;
                     this.method5754(var15, var4, var5, var6);
                     var13.renderable = ModelData.method6106(var15, var15.ambient, var15.contrast, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ds")
   public void method5476() {
      for (int var1 = 0; var1 < this.planes; var1++) {
         for (int var2 = 0; var2 < this.xSize; var2++) {
            for (int var3 = 0; var3 < this.ySize; var3++) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      if (this.Scene_planeOccluderCounts != null) {
         for (int var4 = 0; var4 < this.scenePlanesCount; var4++) {
            for (int var7 = 0; var7 < this.Scene_planeOccluderCounts[var4]; var7++) {
               this.Scene_planeOccluders[var4][var7] = null;
            }

            this.Scene_planeOccluderCounts[var4] = 0;
         }
      }

      if (this.Scene_currentOccluders != null) {
         Arrays.fill(this.Scene_currentOccluders, null);
      }

      this.Scene_currentOccludersCount = 0;

      for (int var5 = 0; var5 < this.tempGameObjectsCount; var5++) {
         this.tempGameObjects[var5] = null;
      }

      this.tempGameObjectsCount = 0;

      for (int var6 = 0; var6 < this.gameObjects.length; var6++) {
         this.gameObjects[var6] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("wb")
   public int method5758(int var1) {
      int var2 = var1 >> this.field2891 & 3;
      return var2 + (this.field2900[var1 & this.field2894 - 1] >> 5 & 1) & 3;
   }

   @ObfuscatedSignature(descriptor = "(III)Lkf;")
   @ObfuscatedName("xd")
   public WallDecoration method5800(int var1, int var2, int var3) {
      return method5788(this, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("tr")
   public void method5801(int var1, int var2) {
      method5722(this, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fs")
   public void method5521(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.wallDecoration = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cf")
   boolean visibleTiles(int var1, int var2) {
      if (!this.method5591(this.field3008, this.field3013, var1, var2)) {
         return class623.method12415(this, this.field3008, this.field3013, var1, var2);
      } else {
         this.method5596(this.field3008, this.field3013, var1, var2, false);
         boolean var3 = false;

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (this.method5623(this.field3008, this.field3013, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008, (this.field3013 + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008 + 1, this.field3013, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008 + 1, (this.field3013 + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.method5589(this.field3008, this.field3013, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;III)V")
   @ObfuscatedName("qj")
   public static void method5692(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.removeGameObject(var1, var1, var1);
      }

      int var4 = var2 + var0.field3014;
      int var5 = var3 + var0.field3014;
      int var6 = var0.method5690(var1, var4, var5);
      if (var0.method5737(var6)) {
         byte var7 = var0.field2907[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = var0.field2887[var6 * 5 + var8];
            long var10 = var9.tag * 1608625415500949283L;
            int var12 = (int)(var10 >> 16 & 7L);
            if (var12 == 2 && var2 == var9.startX * 1666005069 && var3 == var9.startY * 889015863) {
               var0.removeGameObject((net.runelite.api.GameObject)var9);
               return;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)Ljv;")
   @ObfuscatedName("ju")
   public static FloorDecoration method5536(Scene var0, int var1, int var2, int var3) {
      Tile var4 = var0.tiles[var1][var2][var3];
      return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ec")
   public void method5485(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Occluder var9 = new Occluder();
      var9.maxX = var3 / 128 * 496408929;
      var9.maxZ = var4 / -29796752 * -218728163;
      var9.field3319 = var5 / 1324717472 * -739998995;
      var9.field3335 = var6 / 1588146685 * -442128598;
      var9.minY = var2 * -204323568;
      var9.maxY = var3 * -1996116791;
      var9.field3337 = var4 * 404787707;
      var9.minTileX = var5 * 289747341;
      var9.minZ = var6 * -634066848;
      var9.minTileY = var7 * -1906312175;
      var9.field3324 = var8 * -1574631007;
      this.Scene_planeOccluders[var1][this.Scene_planeOccluderCounts[var1]++] = var9;
   }

   public void removeTile(net.runelite.api.Tile var1) {
      rl8 var2 = (rl8)var1;
      int var3 = var2.field5670;
      int var4 = this.field2900[var3];
      int var5 = var3 >> this.field2890 & this.field2892;
      int var6 = var3 & this.field2893;
      rl16 var7 = this.field2912[var5 >> 3][var6 >> 3];
      if ((var4 & 2048) != 0) {
         var7.field5566.remove(this.field2905[var3]);
      }

      if ((var4 & 12288) != 0) {
         var7.field5566.remove(this.field2906[var3]);
      }

      if ((var4 & 16384) != 0) {
         var7.field5566.remove(this.field2903[var3]);
      }

      if ((var4 & 32768) != 0) {
         var7.field5566.remove(this.field2904[var3]);
      }

      byte var8 = this.field2907[var3];

      for (int var9 = 0; var9 < var8; var9++) {
         GameObject var10 = this.field2887[var3 * 5 + var9];
         var7.field5566.remove(var10);
      }

      this.method5768(var3);
      var2.field5671 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lrl8;ILjava/util/Set;)V")
   @ObfuscatedName("bb")
   public void method5700(rl8 var1, int var2, Set var3) {
      this.method5771(var1.field5670);

      int var4;
      while ((var4 = this.method5736()) != this.field2897) {
         int var5 = var4 >> this.field2890 & this.field2892;
         int var6 = var4 & this.field2893;
         int var7 = var4 >> this.field2891 & 3;
         if (this.field2888[var7][var5][var6] == 0) {
            if (this.method5753(var7, var5, var6)) {
               this.method5740(var7, var5 - 1, var6);
               this.method5740(var7, var5 + 1, var6);
               this.method5740(var7, var5, var6 - 1);
               this.method5740(var7, var5, var6 + 1);
               this.method5740(var7, var5 - 1, var6 - 1);
               this.method5740(var7, var5 + 1, var6 - 1);
               this.method5740(var7, var5 - 1, var6 + 1);
               this.method5740(var7, var5 + 1, var6 + 1);
            }

            this.field2888[var7][var5][var6] = var2;

            for (int var8 = var7 + 1; var8 < 4; var8++) {
               int var9 = this.field2888[var8][var5][var6];
               if (var9 != 0) {
                  var3.add(var9);
                  break;
               }

               this.field2888[var8][var5][var6] = var2;
            }
         }
      }

      if (var3 != null && var3.size() > 0) {
         this.field2881.put(var2, var3.stream().mapToInt(var0 -> var0).toArray());
         var3.clear();
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ea")
   public void method5486(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Occluder var9 = new Occluder();
      var9.maxX = var3 / 128 * 496408929;
      var9.maxZ = var4 / 1521581064 * 320517708;
      var9.field3319 = var5 / 128 * -252472961;
      var9.field3335 = var6 / -1378778389 * -2005555601;
      var9.minY = var2 * -2012903779;
      var9.maxY = var3 * -1996116791;
      var9.field3337 = var4 * 404787707;
      var9.minTileX = var5 * -43704678;
      var9.minZ = var6 * -1992453087;
      var9.minTileY = var7 * -1906312175;
      var9.field3324 = var8 * -1574631007;
      this.Scene_planeOccluders[var1][this.Scene_planeOccluderCounts[var1]++] = var9;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("er")
   public void method5730() {
      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < this.xSize; var2++) {
            for (int var3 = 0; var3 < this.ySize; var3++) {
               int var4 = this.method5690(var1, var2, var3);
               if (this.method5737(var4)) {
                  int var5 = var2 >> 3;
                  int var6 = var3 >> 3;
                  rl16 var7 = this.field2912[var5][var6];
                  if ((this.field2900[var4] & 32) != 0) {
                     assert var1 == 0;

                     int var8 = this.tileHeights[0][var2][var3];
                     this.method5739(var7, var2, var3, var8);
                  }

                  int var14 = (this.field3028[1][var2][var3] & 2) >> 1;
                  int var9 = var1 + var14;
                  int var10 = this.tileHeights[var9][var2][var3];
                  this.method5739(var7, var2, var3, var10);
                  int var11 = this.field2900[var4];
                  if ((var11 & 2048) != 0) {
                     FloorDecoration var12 = this.field2905[var4];
                     if (var12.renderable instanceof Model) {
                        this.method5704(var10, var7, (Model)var12.renderable);
                     }
                  }

                  if ((var11 & 16384) != 0) {
                     BoundaryObject var15 = this.field2903[var4];
                     if (var15.renderable1 instanceof Model) {
                        this.method5704(var10, var7, (Model)var15.renderable1);
                     }

                     if (var15.renderable2 instanceof Model) {
                        this.method5704(var10, var7, (Model)var15.renderable2);
                     }
                  }

                  if ((var11 & 32768) != 0) {
                     WallDecoration var16 = this.field2904[var4];
                     if (var16.renderable1 instanceof Model) {
                        this.method5704(var10, var7, (Model)var16.renderable1);
                     }

                     if (var16.renderable2 instanceof Model) {
                        this.method5704(var10, var7, (Model)var16.renderable2);
                     }
                  }

                  for (int var17 = 0; var17 < this.field2907[var4]; var17++) {
                     GameObject var13 = this.field2887[var4 * 5 + var17];
                     if (var13.renderable instanceof Model) {
                        this.method5704(var10, var7, (Model)var13.renderable);
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ee")
   public void method5487(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Occluder var9 = new Occluder();
      var9.maxX = var3 / 1547479649 * 496408929;
      var9.maxZ = var4 / 179134313 * -639035963;
      var9.field3319 = var5 / 128 * -252472961;
      var9.field3335 = var6 / -871847004 * -526484185;
      var9.minY = var2 * -1463379360;
      var9.maxY = var3 * -1062671428;
      var9.field3337 = var4 * -1791555907;
      var9.minTileX = var5 * 289747341;
      var9.minZ = var6 * 981833123;
      var9.minTileY = var7 * -1906312175;
      var9.field3324 = var8 * -1574631007;
      this.Scene_planeOccluders[var1][this.Scene_planeOccluderCounts[var1]++] = var9;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ye")
   public void method5488(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if (var5 != null) {
         this.tiles[var1][var2][var3].minPlane = var4 * 25702761;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ej")
   public void method5802(int var1, int var2, int var3) {
      method5718(this, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("er")
   public void method5489(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      if (var4 == 0) {
         SceneTilePaint var24 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

         for (int var26 = var1; var26 >= 0; var26--) {
            if (this.tiles[var26][var2][var3] == null) {
               this.tiles[var26][var2][var3] = new Tile(var26, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].paint = var24;
      } else if (var4 != 1) {
         if (var20 == 0) {
            var20 = 1;
         }

         SceneTileModel var23 = new SceneTileModel(
            var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20
         );

         for (int var25 = var1; var25 >= 0; var25--) {
            if (this.tiles[var25][var2][var3] == null) {
               this.tiles[var25][var2][var3] = new Tile(var25, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].model = var23;
      } else {
         SceneTilePaint var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for (int var22 = var1; var22 >= 0; var22--) {
            if (this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].paint = var21;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl16;II)Z")
   @ObfuscatedName("sx")
   public boolean method5749(rl16 var1, int var2, int var3) {
      if ((client.field997 & 32) != 0) {
         return client.field1025.zoneInFrustum(var2, var3, var1.field5571, var1.field5569);
      } else {
         int var4 = var1.field5571;
         int var5 = -var1.field5569;
         int var6 = ((var2 << 3) - this.field3014 << 7) + 512 - this.Scene_cameraX;
         int var7 = ((var3 << 3) - this.field3014 << 7) + 512 - this.Scene_cameraZ;
         int var8 = var4 - this.Scene_cameraY;
         short var9 = 724;
         int var10 = Rasterizer3D.clips.method6629();
         int var11 = Rasterizer3D.clips.method6626();
         int var12 = Rasterizer3D.clips.method6630();
         int var13 = Rasterizer3D.clips.method6625();
         int var14 = Rasterizer3D.clips.method6634();
         float var15 = this.field2971 * var7 - this.field2972 * var6;
         float var16 = this.field2970 * var8 + this.field2969 * var15;
         float var17 = this.field2969 * var9;
         float var18 = var16 + var17;
         if (var18 > 50.0F) {
            float var19 = var7 * this.field2972 + this.field2971 * var6;
            float var20 = (var19 - var9) * var10;
            float var21 = (var19 + var9) * var10;
            if (var20 < var11 * var18 && var21 > var12 * var18) {
               float var22 = this.field2969 * var8 - var15 * this.field2970;
               float var23 = this.field2970 * var9;
               float var24 = (var22 + var23) * var10;
               if (var24 > var13 * var18) {
                  float var25 = this.field2969 * var5 + var23;
                  float var26 = (var22 - var25) * var10;
                  if (var26 < var14 * var18) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;Ljq;I)V")
   @ObfuscatedName("xi")
   public static void method5518(Model var0, class251 var1, int var2) {
      if (var0 == null) {
         var0.method6757(var1, var2);
      } else {
         var0.method6874(var1, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dd")
   public void method5644() {
      this.baseX = -1;
      this.viewportWalking = false;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;JI)V")
   @ObfuscatedName("ar")
   public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.renderable = var5;
         var9.x = var2 * -1385542528 + -692771264;
         var9.y = var3 * -1398397824 + 1448284736;
         var9.z = var4 * -1446077153;
         var9.tag = var6;
         var9.flags = var8 * 1739618287;
         if (this.tiles[var1][var2][var3] == null) {
            this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.tiles[var1][var2][var3].floorDecoration = var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("uy")
   public int method5701(int var1) {
      return this.field2900[var1] >> 16 & 15;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;JI)V")
   @ObfuscatedName("bh")
   public void method5494(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.renderable = var5;
         var9.x = var2 * -1385542528 + -692771264;
         var9.y = var3 * -1398397824 + 1448284736;
         var9.z = var4 * -1446077153;
         var9.tag = var6;
         var9.flags = var8 * 1739618287;
         if (this.tiles[var1][var2][var3] == null) {
            this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.tiles[var1][var2][var3].floorDecoration = var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIJ)I")
   @ObfuscatedName("gs")
   public int method5784(int var1, int var2, int var3, long var4) {
      var2 += this.field3014;
      var3 += this.field3014;
      int var6 = this.method5690(var1, var2, var3);
      if (!this.method5737(var6)) {
         return -1;
      } else if (this.field2903[var6] != null && this.field2903[var6].tag * -4972732868916429537L == var4) {
         return this.field2903[var6].flags * -1044451971 & 0xFF;
      } else if (this.field2904[var6] != null && this.field2904[var6].tag * -7524770072208173231L == var4) {
         return this.field2904[var6].flags * 219957667 & 0xFF;
      } else if (this.field2905[var6] != null && this.field2905[var6].tag == var4) {
         return this.field2905[var6].flags * 633706255 & 0xFF;
      } else {
         byte var7 = this.field2907[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = this.field2887[var6 * 5 + var8];
            if (var9.tag * 1608625415500949283L == var4) {
               return var9.flags * 1362575399 & 0xFF;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("jx")
   public void method5648(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.xSize * 128) {
         var1 = this.xSize * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ySize * 128) {
         var3 = this.ySize * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.field2970 = Rasterizer3D.field3038[var4];
      this.field2969 = Rasterizer3D.field3037[var4];
      this.field2972 = Rasterizer3D.field3038[var5];
      this.field2971 = Rasterizer3D.field3037[var5];
      method5618(this, (var4 - 128) / 32, var5 / 64);
      this.Scene_cameraX = var1;
      this.Scene_cameraY = var2;
      this.Scene_cameraZ = var3;
      this.Scene_cameraXTile = var1 / 128;
      this.Scene_cameraYTile = var3 / 128;
      this.Scene_entityX = var7 / 128;
      this.Scene_entityY = var8 / 128;
      this.Scene_plane = var6;
      IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
      if (Rasterizer3D.method5869()) {
         Rasterizer3D.clips.currentFaceAlpha = 0;
         this.projectScene(var10, var9, true);
         Rasterizer3D.clips.currentFaceAlpha = 1;
         this.projectScene(var10, var9, false);
         Rasterizer3D.clips.currentFaceAlpha = 2;
      } else {
         Rasterizer3D.clips.currentFaceAlpha = 2;
         this.projectScene(var10, var9, true);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;JLjz;Ljz;)V")
   @ObfuscatedName("eg")
   public void method5495(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
      ItemLayer var10 = new ItemLayer();
      var10.third = var5;
      var10.x = var2 * 1646131328 + -1324417984;
      var10.y = var3 * 1939290752 + 969645376;
      var10.z = var4 * 2083339729;
      var10.tag = var6;
      var10.first = var8;
      var10.second = var9;
      int var11 = 0;
      Tile var12 = this.tiles[var1][var2][var3];
      if (var12 != null) {
         for (int var13 = 0; var13 < var12.gameObjectsCount * 1265471425; var13++) {
            if ((var12.gameObjects[var13].flags * 1362575399 & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) {
               Model var14 = (Model)var12.gameObjects[var13].renderable;
               var14.method6864();
               if (var14.height * -1272589951 > var11) {
                  var11 = var14.height * -1272589951;
               }
            }
         }
      }

      var10.height = var11 * -166504297;
      if (this.tiles[var1][var2][var3] == null) {
         this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.tiles[var1][var2][var3].itemLayer = var10;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;Ljz;IIJI)V")
   @ObfuscatedName("ep")
   public void method5498(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         BoundaryObject var12 = new BoundaryObject();
         var12.tag = var9 * -8195661098055663905L;
         var12.flags = var11 * -1337019435;
         var12.x = var2 * 581815936 + -1856575680;
         var12.y = var3 * -198089344 + 2048438976;
         var12.z = var4 * 2094051365;
         var12.renderable1 = var5;
         var12.renderable2 = var6;
         var12.orientationA = var7 * 730760521;
         var12.orientationB = var8 * 652122151;

         for (int var13 = var1; var13 >= 0; var13--) {
            if (this.tiles[var13][var2][var3] == null) {
               this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].boundaryObject = var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("kj")
   boolean method5670(int var1, int var2, int var3) {
      int var4 = this.field2952[var1][var2][var3];
      if (var4 == -this.Scene_drawnCount) {
         return false;
      } else if (var4 == this.Scene_drawnCount) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method5683(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1)
            && this.method5683(var5 + -192479206 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1)
            && this.method5683(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + -75934679 - 1)
            && this.method5683(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2952[var1][var2][var3] = this.Scene_drawnCount;
            return true;
         } else {
            this.field2952[var1][var2][var3] = -this.Scene_drawnCount;
            return false;
         }
      }
   }

   public void buildRoofs() {
      this.field2888 = new int[this.planes][this.xSize][this.ySize];
      int var1 = 1;
      this.field2881 = new HashMap();
      HashSet var2 = new HashSet();

      for (int var3 = this.planes - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.ySize; var4++) {
            for (int var5 = 0; var5 < this.xSize; var5++) {
               rl8 var6 = this.field2886[var3][var5][var4];
               if (var6 != null && this.field2888[var3][var5][var4] == 0 && this.method5753(var3, var5, var4)) {
                  this.method5700(var6, var1++, var2);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("fc")
   public long method5542(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag * -7524770072208173231L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("wc")
   public void method5740(int var1, int var2, int var3) {
      if (var2 >= 0 && var2 < this.xSize && var3 >= 0 && var3 < this.ySize) {
         int var4 = this.method5690(var1, var2, var3);
         if (this.method5737(var4)) {
            this.method5771(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;IZ)V")
   @ObfuscatedName("av")
   public void method5707(Projection var1, int var2, boolean var3) {
      this.method5771(var2);

      label647:
      while (true) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var12;
         while (true) {
            var4 = this.method5736();
            if (var4 == this.field2897) {
               return;
            }

            if (this.method5764(var4)) {
               var5 = var4 >> this.field2890 & this.field2892;
               var6 = var4 & this.field2893;
               var7 = var4 >> this.field2891 & 3;
               var8 = this.method5758(var4);
               int var9 = this.method5625(var4);
               int var10 = var5 - this.field3014;
               int var11 = var6 - this.field3014;
               var12 = this.field2900[var4];
               if (!this.method5738(var4)) {
                  break;
               }

               if (var3) {
                  if (var7 > 0) {
                     int var13 = var4 - this.field2894;
                     if (this.method5737(var13) && this.method5764(var13)) {
                        continue;
                     }
                  }

                  if (var5 <= this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin) {
                     int var25 = var4 - this.field2895;
                     if (this.method5737(var25) && this.method5764(var25) && (this.method5738(var25) || (this.field2909[var4] & 1) == 0)) {
                        continue;
                     }
                  }

                  if (var5 >= this.Scene_cameraXTile && var5 < this.Scene_cameraXTileMax - 1) {
                     int var26 = var4 + this.field2895;
                     if (this.method5737(var26) && this.method5764(var26) && (this.method5738(var26) || (this.field2909[var4] & 4) == 0)) {
                        continue;
                     }
                  }

                  if (var6 <= this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin) {
                     int var27 = var4 - this.field2896;
                     if (this.method5737(var27) && this.method5764(var27) && (this.method5738(var27) || (this.field2909[var4] & 8) == 0)) {
                        continue;
                     }
                  }

                  if (var6 >= this.Scene_cameraYTile && var6 < this.Scene_cameraYTileMax - 1) {
                     int var28 = var4 + this.field2896;
                     if (this.method5737(var28) && this.method5764(var28) && (this.method5738(var28) || (this.field2909[var4] & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var3 = true;
               }

               var12 = this.field2900[var4] = this.field2900[var4] & -3;
               if ((var12 & 32) != 0) {
                  int var29 = this.method5690(3, var5, var6);
                  int var14 = this.field2900[var29];
                  if ((var14 & 256) != 0) {
                     if (!this.method5797(0, var5, var6)) {
                        var1.method6228(this, this.field2901[var29], 0, 0, var10, var11);
                     }
                  } else if ((var14 & 1024) != 0 && !this.method5797(0, var5, var6)) {
                     var1.method6231(this, this.field2902[var29], 0, var10, var11);
                  }

                  if ((var14 & 16384) != 0) {
                     BoundaryObject var15 = this.field2903[var29];
                     this.method5744(
                        var1, var15.renderable1, 0, var15.x * -1937046859, var15.z * -1912869971, var15.y * 546730723, var15.tag * -4972732868916429537L
                     );
                  }

                  for (int var53 = 0; var53 < this.field2907[var29]; var53++) {
                     GameObject var16 = this.field2887[var29 * 5 + var53];
                     if (var16 != null) {
                        this.method5744(
                           var1,
                           var16.renderable,
                           var16.orientation * 46801735,
                           var16.centerX * 1204024827,
                           var16.z * 683703035,
                           var16.centerY * 1465977803,
                           var16.tag * 1608625415500949283L
                        );
                     }
                  }
               }

               boolean var30 = false;
               if ((var12 & 256) != 0) {
                  if (!this.method5797(var8, var5, var6)) {
                     var30 = true;
                     if ((var12 & 512) != 0 || var7 <= this.Scene_selectedPlane) {
                        SceneTilePaint var45 = this.field2901[var4];
                        var1.method6228(this, var45, var9, var8, var10, var11);
                     }
                  }
               } else if ((var12 & 1024) != 0 && !this.method5797(var8, var5, var6)) {
                  var30 = true;
                  var1.method6231(this, this.field2902[var4], var9, var10, var11);
               }

               int var46 = 0;
               int var54 = 0;
               int var59 = 0;
               if ((var12 & 49152) != 0) {
                  if (var5 == this.Scene_cameraXTile) {
                     var46++;
                  } else if (this.Scene_cameraXTile < var5) {
                     var46 += 2;
                  }

                  if (var6 == this.Scene_cameraYTile) {
                     var46 += 3;
                  } else if (this.Scene_cameraYTile > var6) {
                     var46 += 6;
                  }

                  var54 = field2863[var46];
                  int var17 = field2870[var46];
                  this.method5689(var4, var17);
                  var59 = field2877[var46];

                  assert (~(var54 | var17) & 0xFF) == var59;
               }

               if ((var12 & 16384) != 0) {
                  BoundaryObject var66 = this.field2903[var4];
                  if ((var66.orientationA * -666272519 & var59) != 0) {
                     byte var18;
                     int var19;
                     switch (var66.orientationA * -666272519) {
                        case 16:
                           var18 = 3;
                           var19 = field2871[var46];
                           break;
                        case 32:
                           var18 = 6;
                           var19 = field2876[var46];
                           break;
                        case 64:
                           var18 = 12;
                           var19 = field2873[var46];
                           break;
                        case 128:
                           var18 = 9;
                           var19 = field2872[var46];
                           break;
                        default:
                           throw new IllegalStateException();
                     }

                     this.method5705(var4, var18);
                     this.method5696(var4, var19);

                     assert (var18 ^ var19) == var18 - var19;

                     var12 = this.field2900[var4] = this.field2900[var4] | 16;
                  }

                  if ((var66.orientationA * -666272519 & var54) != 0 && !this.method5813(var8, var5, var6, var66.orientationA * -666272519)) {
                     this.method5744(
                        var1, var66.renderable1, 0, var66.x * -1937046859, var66.z * -1912869971, var66.y * 546730723, var66.tag * -4972732868916429537L
                     );
                  }

                  if ((var66.orientationB * -211200105 & var54) != 0 && !this.method5813(var8, var5, var6, var66.orientationB * -211200105)) {
                     this.method5744(
                        var1, var66.renderable2, 0, var66.x * -1937046859, var66.z * -1912869971, var66.y * 546730723, var66.tag * -4972732868916429537L
                     );
                  }
               }

               if ((var12 & 32768) != 0) {
                  WallDecoration var67 = this.field2904[var4];
                  if (!this.method5799(var8, var5, var6, var67.renderable1.height * -1272589951)) {
                     if ((var67.orientation * 1327001075 & var54) != 0) {
                        this.method5744(
                           var1,
                           var67.renderable1,
                           0,
                           var67.x * -682745183 + var67.xOffset * 1501441925,
                           var67.z * 121856729,
                           var67.y * 1215145581 + var67.field3298 * 1799251127,
                           var67.tag * -7524770072208173231L
                        );
                     } else if (var67.orientation * 1327001075 == 256) {
                        int var76 = var67.x * -682745183 - this.Scene_cameraX;
                        int var86 = var67.y * 1215145581 - this.Scene_cameraZ;
                        int var20 = var67.orientation2 * -1475596409;
                        int var21;
                        if (var20 != 1 && var20 != 2) {
                           var21 = var76;
                        } else {
                           var21 = -var76;
                        }

                        int var22;
                        if (var20 != 2 && var20 != 3) {
                           var22 = var86;
                        } else {
                           var22 = -var86;
                        }

                        if (var22 < var21) {
                           this.method5744(
                              var1,
                              var67.renderable1,
                              0,
                              var67.x * -682745183 + var67.xOffset * 1501441925,
                              var67.z * 121856729,
                              var67.y * 1215145581 + var67.field3298 * 1799251127,
                              var67.tag * -7524770072208173231L
                           );
                        } else if (var67.renderable2 != null) {
                           this.method5744(
                              var1, var67.renderable2, 0, var67.x * -682745183, var67.z * 121856729, var67.y * 1215145581, var67.tag * -7524770072208173231L
                           );
                        }
                     }
                  }
               }

               if (var30) {
                  if ((this.field2900[var4] & 2048) != 0) {
                     FloorDecoration var68 = this.field2905[var4];
                     this.method5744(var1, var68.renderable, 0, var68.x * 1266171817, var68.z * -495673633, var68.y * -190028295, var68.tag);
                  }

                  if ((this.field2900[var4] & 4096) != 0) {
                     ItemLayer var69 = this.field2906[var4];
                     if (var69.first != null) {
                        this.method5744(var1, var69.first, 0, var69.x * -1625205487, var69.z * -90686671, var69.y * -162090531, var69.tag);
                     }

                     if (var69.second != null) {
                        this.method5744(var1, var69.second, 0, var69.x * -1625205487, var69.z * -90686671, var69.y * -162090531, var69.tag);
                     }

                     if (var69.third != null) {
                        this.method5744(var1, var69.third, 0, var69.x * -1625205487, var69.z * -90686671, var69.y * -162090531, var69.tag);
                     }
                  }
               }

               byte var70 = this.field2909[var4];
               if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1 && (var70 & 4) != 0) {
                  int var77 = var4 + this.field2895;
                  if (this.method5737(var77) && this.method5764(var77)) {
                     this.method5771(var77);
                  }
               }

               if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1 && (var70 & 2) != 0) {
                  int var78 = var4 + this.field2896;
                  if (this.method5737(var78) && this.method5764(var78)) {
                     this.method5771(var78);
                  }
               }

               if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax && (var70 & 1) != 0) {
                  int var79 = var4 - this.field2895;
                  if (this.method5737(var79) && this.method5764(var79)) {
                     this.method5771(var79);
                  }
               }

               if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax && (var70 & 8) != 0) {
                  int var80 = var4 - this.field2896;
                  if (this.method5737(var80) && this.method5764(var80)) {
                     this.method5771(var80);
                  }
               }
               break;
            }
         }

         if ((var12 & 16) != 0) {
            boolean var31 = true;

            for (int var47 = 0; var47 < this.field2907[var4]; var47++) {
               GameObject var55 = this.field2887[var4 * 5 + var47];
               byte var60 = this.field2908[var4 * 5 + var47];
               if (var55.lastDrawn * 399338421 != this.Scene_drawnCount && (var60 & this.method5701(var4)) == this.method5721(var4)) {
                  var31 = false;
                  break;
               }
            }

            if (var31) {
               BoundaryObject var48 = this.field2903[var4];
               if (!this.method5813(var8, var5, var6, var48.orientationA * -666272519)) {
                  this.method5744(
                     var1, var48.renderable1, 0, var48.x * -1937046859, var48.z * -1912869971, var48.y * 546730723, var48.tag * -4972732868916429537L
                  );
               }

               var12 = this.field2900[var4] = this.field2900[var4] & -17;
            }
         }

         if ((var12 & 8) != 0) {
            try {
               var12 = this.field2900[var4] = this.field2900[var4] & -9;
               int var32 = 0;

               label592:
               for (int var49 = 0; var49 < this.field2907[var4]; var49++) {
                  GameObject var56 = this.field2887[var4 * 5 + var49];
                  if (var56.lastDrawn * 399338421 != this.Scene_drawnCount) {
                     for (int var61 = var56.startX * 1666005069; var61 <= var56.endX * 1553138359; var61++) {
                        for (int var71 = var56.startY * 889015863; var71 <= var56.endY * -2094327665; var71++) {
                           int var81 = var61 + this.field3014;
                           int var87 = var71 + this.field3014;
                           int var91 = this.method5690(var7, var81, var87);
                           if (this.method5738(var91)) {
                              var12 = this.field2900[var4] = this.field2900[var4] | 8;
                              continue label592;
                           }

                           if ((this.field2900[var91] & 16) != 0) {
                              byte var95 = 0;
                              if (var61 > var56.startX * 1666005069) {
                                 var95 |= 1;
                              }

                              if (var61 < var56.endX * 1553138359) {
                                 var95 |= 4;
                              }

                              if (var71 > var56.startY * 889015863) {
                                 var95 |= 8;
                              }

                              if (var71 < var56.endY * -2094327665) {
                                 var95 |= 2;
                              }

                              int var99 = this.method5701(var4) ^ this.method5721(var4);
                              if ((var95 & this.method5701(var91)) == var99) {
                                 var12 = this.field2900[var4] = this.field2900[var4] | 8;
                                 continue label592;
                              }
                           }
                        }
                     }

                     assert var32 < 5;

                     this.gameObjects[var32++] = var56;
                     int var62 = this.Scene_cameraXTile - this.field3014;
                     int var72 = this.Scene_cameraYTile - this.field3014;
                     int var82 = var62 - var56.startX * 1666005069;
                     int var88 = var56.endX * 1553138359 - var62;
                     if (var88 > var82) {
                        var82 = var88;
                     }

                     int var92 = var72 - var56.startY * 889015863;
                     int var96 = var56.endY * -2094327665 - var72;
                     if (var96 > var92) {
                        var56.field3278 = (var82 + var96) * 2049269999;
                     } else {
                        var56.field3278 = (var82 + var92) * 2049269999;
                     }
                  }
               }

               while (true) {
                  int var50 = -50;
                  int var57 = -1;

                  for (int var63 = 0; var63 < var32; var63++) {
                     GameObject var73 = this.gameObjects[var63];
                     if (var73.lastDrawn * 399338421 != this.Scene_drawnCount) {
                        if (var73.field3278 * 186764815 > var50) {
                           var50 = var73.field3278 * 186764815;
                           var57 = var63;
                        } else if (var50 == var73.field3278 * 186764815) {
                           int var83 = var73.centerX * 1204024827 - this.Scene_cameraX;
                           int var89 = var73.centerY * 1465977803 - this.Scene_cameraZ;
                           int var93 = this.gameObjects[var57].centerX * 1204024827 - this.Scene_cameraX;
                           int var97 = this.gameObjects[var57].centerY * 1465977803 - this.Scene_cameraZ;
                           if (var83 * var83 + var89 * var89 > var93 * var93 + var97 * var97) {
                              var57 = var63;
                           }
                        }
                     }
                  }

                  if (var57 == -1) {
                     if ((var12 & 8) != 0) {
                        continue label647;
                     }
                     break;
                  }

                  GameObject var64 = this.gameObjects[var57];
                  var64.lastDrawn = this.Scene_drawnCount * -230921571;
                  this.method5744(
                     var1,
                     var64.renderable,
                     var64.orientation * 46801735,
                     var64.centerX * 1204024827,
                     var64.z * 683703035,
                     var64.centerY * 1465977803,
                     var64.tag * 1608625415500949283L
                  );

                  for (int var74 = var64.startX * 1666005069; var74 <= var64.endX * 1553138359; var74++) {
                     for (int var84 = var64.startY * 889015863; var84 <= var64.endY * -2094327665; var84++) {
                        int var90 = var74 + this.field3014;
                        int var94 = var84 + this.field3014;
                        int var98 = this.method5690(var7, var90, var94);
                        if ((this.field2900[var98] & 16) != 0) {
                           this.method5771(var98);
                        } else if ((var90 != var5 || var94 != var6) && this.method5764(var98)) {
                           this.method5771(var98);
                        }
                     }
                  }
               }
            } catch (Exception var23) {
               client.field938.debug("exception drawing game entity", var23);
               var12 = this.field2900[var4] = this.field2900[var4] & -9;
            }
         }

         if (!this.method5764(var4)) {
            assert false : "tile needs backside draw";
         } else if ((var12 & 16) == 0) {
            if (var5 <= this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin) {
               int var33 = var4 - this.field2895;
               if (this.method5737(var33) && this.method5764(var33)) {
                  continue;
               }
            }

            if (var5 >= this.Scene_cameraXTile && var5 < this.Scene_cameraXTileMax - 1) {
               int var34 = var4 + this.field2895;
               if (this.method5737(var34) && this.method5764(var34)) {
                  continue;
               }
            }

            if (var6 <= this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin) {
               int var35 = var4 - this.field2896;
               if (this.method5737(var35) && this.method5764(var35)) {
                  continue;
               }
            }

            if (var6 >= this.Scene_cameraYTile && var6 < this.Scene_cameraYTileMax - 1) {
               int var36 = var4 + this.field2896;
               if (this.method5737(var36) && this.method5764(var36)) {
                  continue;
               }
            }

            var12 = this.field2900[var4] = this.field2900[var4] & -5;
            this.tileUpdateCount--;
            if ((var12 & 8192) != 0) {
               ItemLayer var37 = this.field2906[var4];
               if (var37.first != null) {
                  this.method5744(var1, var37.first, 0, var37.x * -1625205487, var37.z * -90686671 - var37.height * 2067113767, var37.y * -162090531, var37.tag);
               }

               if (var37.second != null) {
                  this.method5744(
                     var1, var37.second, 0, var37.x * -1625205487, var37.z * -90686671 - var37.height * 2067113767, var37.y * -162090531, var37.tag
                  );
               }

               if (var37.third != null) {
                  this.method5744(var1, var37.third, 0, var37.x * -1625205487, var37.z * -90686671 - var37.height * 2067113767, var37.y * -162090531, var37.tag);
               }
            }

            if ((var12 & 49152) != 0 && this.method5698(var4) != 0) {
               if ((var12 & 32768) != 0) {
                  WallDecoration var38 = this.field2904[var4];
                  if (!this.method5799(var8, var5, var6, var38.renderable1.height * -1272589951)) {
                     if ((var38.orientation * 1327001075 & this.method5698(var4)) != 0) {
                        this.method5744(
                           var1,
                           var38.renderable1,
                           0,
                           var38.x * -682745183 + var38.xOffset * 1501441925,
                           var38.z * 121856729,
                           var38.y * 1215145581 + var38.field3298 * 1799251127,
                           var38.tag * -7524770072208173231L
                        );
                     } else if (var38.orientation * 1327001075 == 256) {
                        int var51 = var38.x * -682745183 - this.Scene_cameraX;
                        int var58 = var38.y * 1215145581 - this.Scene_cameraZ;
                        int var65 = var38.orientation2 * -1475596409;
                        int var75;
                        if (var65 != 1 && var65 != 2) {
                           var75 = var51;
                        } else {
                           var75 = -var51;
                        }

                        int var85;
                        if (var65 != 2 && var65 != 3) {
                           var85 = var58;
                        } else {
                           var85 = -var58;
                        }

                        if (var85 >= var75) {
                           this.method5744(
                              var1,
                              var38.renderable1,
                              0,
                              var38.x * -682745183 + var38.xOffset * 1501441925,
                              var38.z * 121856729,
                              var38.y * 1215145581 + var38.field3298 * 1799251127,
                              var38.tag * -7524770072208173231L
                           );
                        } else if (var38.renderable2 != null) {
                           this.method5744(
                              var1, var38.renderable2, 0, var38.x * -682745183, var38.z * 121856729, var38.y * 1215145581, var38.tag * -7524770072208173231L
                           );
                        }
                     }
                  }
               }

               if ((var12 & 16384) != 0) {
                  BoundaryObject var39 = this.field2903[var4];
                  int var52 = this.method5698(var4);
                  if ((var39.orientationB * -211200105 & var52) != 0 && !this.method5813(var8, var5, var6, var39.orientationB * -211200105)) {
                     this.method5744(
                        var1, var39.renderable2, 0, var39.x * -1937046859, var39.z * -1912869971, var39.y * 546730723, var39.tag * -4972732868916429537L
                     );
                  }

                  if ((var39.orientationA * -666272519 & var52) != 0 && !this.method5813(var8, var5, var6, var39.orientationA * -666272519)) {
                     this.method5744(
                        var1, var39.renderable1, 0, var39.x * -1937046859, var39.z * -1912869971, var39.y * 546730723, var39.tag * -4972732868916429537L
                     );
                  }
               }
            }

            if (var7 < this.planes - 1) {
               int var40 = var4 + this.field2894;
               if (this.method5737(var40) && this.method5764(var40)) {
                  this.method5771(var40);
               }
            }

            if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1) {
               int var41 = var4 + this.field2895;
               if (this.method5737(var41) && this.method5764(var41)) {
                  this.method5771(var41);
               }
            }

            if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1) {
               int var42 = var4 + this.field2896;
               if (this.method5737(var42) && this.method5764(var42)) {
                  this.method5771(var42);
               }
            }

            if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax) {
               int var43 = var4 - this.field2895;
               if (this.method5737(var43) && this.method5764(var43)) {
                  this.method5771(var43);
               }
            }

            if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax) {
               int var44 = var4 - this.field2896;
               if (this.method5737(var44) && this.method5764(var44)) {
                  this.method5771(var44);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjz;IJZ)Z")
   @ObfuscatedName("aa")
   public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 616749650 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > -151163385 && var7 < 1851349925) {
               var11 -= 128;
            }
         }

         var11 /= -1386743727;
         var12 /= 128;
         var13 /= -739800543;
         var14 /= -1777712661;
         return method5780(this, var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;III)Lkd;")
   @ObfuscatedName("nc")
   public static GameObject method5734(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method5735(var1, var1, var1);
      } else {
         int var4 = var2 + var0.field3014;
         int var5 = var3 + var0.field3014;
         int var6 = var0.method5690(var1, var4, var5);
         if (!var0.method5737(var6)) {
            return null;
         } else {
            byte var7 = var0.field2907[var6];

            for (int var8 = 0; var8 < var7; var8++) {
               GameObject var9 = var0.field2887[var6 * 5 + var8];
               long var10 = var9.tag * 1608625415500949283L;
               int var12 = (int)(var10 >> 16 & 7L);
               if (var12 == 2 && var2 == var9.startX * 1666005069 && var3 == var9.startY * 889015863) {
                  return var9;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjz;IJZ)Z")
   @ObfuscatedName("ei")
   public boolean method5505(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 1681843647 && var7 < 1738179292) {
               var14 += 128;
            }

            if (var7 > 1374515103 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 133346536;
         var13 /= 128;
         var14 /= 1859266656;
         return method5780(this, var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;Ljz;IIIIJI)V")
   @ObfuscatedName("af")
   public void newWallDecoration(
      int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13
   ) {
      int var14 = var2 + this.field3014;
      int var15 = var3 + this.field3014;
      if (var5 != null) {
         int var16 = this.method5690(var1, var14, var15);
         WallDecoration var17 = new WallDecoration();
         var17.method6339(var11);
         var17.method6336(var13);
         var17.method6337(var2 * 128 + 64);
         var17.method6345(var3 * 128 + 64);
         var17.method6342(var4);
         var17.method6338(var5);
         var17.method6340(var6);
         var17.method6341(var7);
         var17.method6343(var8);
         var17.method6333(var9, var10);

         for (int var18 = var1; var18 >= 0; var18--) {
            int var19 = this.method5690(var18, var14, var15);
            if (!this.method5737(var19)) {
               this.setTileMinPlane(var19, var18, var14, var15);
            }

            if (this.field2886[var18][var14][var15] == null) {
               this.field2886[var18][var14][var15] = new rl8(this, var19);
               this.method5687(var18, var14, var15);
            }
         }

         assert this.field2904[var16] == null;

         this.field2904[var16] = var17;
         this.field2900[var16] = this.field2900[var16] | 32768;
         var17.field3300 = var1;
         if (var5 instanceof DynamicObject || var6 instanceof DynamicObject) {
            rl16 var20 = this.field2912[var14 >> 3][var15 >> 3];
            var20.field5566.add(var17);
            this.method5691((DynamicObject)var5);
            this.method5691((DynamicObject)var6);
         }

         this.method5779(var5, 0, var17.getX(), var17.getZ(), var17.getY(), var2, var3);
         this.method5779(var6, 0, var17.getX(), var17.getZ(), var17.getY(), var2, var3);
         if (this.field3025) {
            DecorativeObjectSpawned var21 = new DecorativeObjectSpawned();
            var21.setTile(this.field2886[var1][var14][var15]);
            var21.setDecorativeObject(var17);
            SecureUrlRequester.client.getCallbacks().post(var21);
         }

         if (this.field3025 && client.field1025 != null) {
            client.field1025.invalidateZone(this, var14 >> 3, var15 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xy")
   public void method5743() {
      int var1 = this.field2898;
      var1 <<= 1;
      this.field2911[var1] = this.field2898;
      var1 = this.field2898;
      var1 = (var1 << 1) + 1;
      this.field2911[var1] = this.field2898;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ke")
   public boolean method5803(int var1, int var2) {
      return this.visibleTiles(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("hu")
   boolean method5587(int var1, int var2, int var3, int var4) {
      return method5581(this, this.field2958, var1, var2, var3, var4);
   }

   public byte getOverrideHue() {
      return this.modelColorOverride.overrideHue;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;Ljz;IIIIJI)V")
   @ObfuscatedName("ex")
   public void method5501(
      int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13
   ) {
      if (var5 != null) {
         WallDecoration var14 = new WallDecoration();
         var14.tag = var11 * -8661371853864889935L;
         var14.flags = var13 * 627913227;
         var14.x = var2 * 757117056 + 378558528;
         var14.y = var3 * -198593920 + 2048186688;
         var14.z = var4 * -1903362711;
         var14.renderable1 = var5;
         var14.renderable2 = var6;
         var14.orientation = var7 * 1245442875;
         var14.orientation2 = var8 * -1434556873;
         var14.method6326(var9, var10, (byte)-104);

         for (int var15 = var1; var15 >= 0; var15--) {
            if (this.tiles[var15][var2][var3] == null) {
               this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].wallDecoration = var14;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjz;IZJI)Z")
   @ObfuscatedName("eh")
   boolean method5510(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14
   ) {
      for (int var15 = var2; var15 < var2 + var4; var15++) {
         for (int var16 = var3; var16 < var3 + var5; var16++) {
            if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) {
               return false;
            }

            Tile var17 = this.tiles[var1][var15][var16];
            if (var17 != null && var17.gameObjectsCount * 1265471425 >= 5) {
               return false;
            }
         }
      }

      GameObject var21 = new GameObject();
      var21.tag = var12 * -108185211891154805L;
      var21.flags = var14 * -1258758361;
      var21.plane = var1 * -856944119;
      var21.centerX = var6 * -234643653;
      var21.centerY = var7 * -646790119;
      var21.z = var8 * 2086167211;
      var21.renderable = var9;
      var21.orientation = var10 * -702273745;
      var21.startX = var2 * -850870139;
      var21.startY = var3 * -153499769;
      var21.endX = (var2 + var4 - 1) * 1351710020;
      var21.endY = (var3 + var5 - 1) * 51178894;

      for (int var22 = var2; var22 < var2 + var4; var22++) {
         for (int var23 = var3; var23 < var3 + var5; var23++) {
            int var18 = 0;
            if (var22 > var2) {
               var18++;
            }

            if (var22 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var23 > var3) {
               var18 += 8;
            }

            if (var23 < var3 + var5 - 1) {
               var18 += 2;
            }

            for (int var19 = var1; var19 >= 0; var19--) {
               if (this.tiles[var19][var22][var23] == null) {
                  this.tiles[var19][var22][var23] = new Tile(var19, var22, var23);
               }
            }

            Tile var24 = this.tiles[var1][var22][var23];
            var24.gameObjects[var24.gameObjectsCount * -2000692492] = var21;
            var24.gameObjectEdgeMasks[var24.gameObjectsCount * 1265471425] = var18;
            var24.gameObjectsEdgeMask = (var24.gameObjectsEdgeMask * -832586231 | var18) * -397683571;
            var24.gameObjectsCount += 1691254849;
         }
      }

      if (var11) {
         if (this.tempGameObjectsCount >= this.tempGameObjects.length) {
            this.tempGameObjects = Arrays.copyOf(this.tempGameObjects, this.tempGameObjects.length * 2);
         }

         this.tempGameObjects[this.tempGameObjectsCount++] = var21;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjz;IZJI)Z")
   @ObfuscatedName("eo")
   boolean method5511(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14
   ) {
      for (int var15 = var2; var15 < var2 + var4; var15++) {
         for (int var16 = var3; var16 < var3 + var5; var16++) {
            if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) {
               return false;
            }

            Tile var17 = this.tiles[var1][var15][var16];
            if (var17 != null && var17.gameObjectsCount * 1265471425 >= 5) {
               return false;
            }
         }
      }

      GameObject var21 = new GameObject();
      var21.tag = var12 * -108185211891154805L;
      var21.flags = var14 * 1921920919;
      var21.plane = var1 * 1521486585;
      var21.centerX = var6 * 1659600885;
      var21.centerY = var7 * 7308726;
      var21.z = var8 * -1872193188;
      var21.renderable = var9;
      var21.orientation = var10 * 1689425527;
      var21.startX = var2 * 426997343;
      var21.startY = var3 * -1402711585;
      var21.endX = (var2 + var4 - 1) * 1166828986;
      var21.endY = (var3 + var5 - 1) * -1414930720;

      for (int var22 = var2; var22 < var2 + var4; var22++) {
         for (int var23 = var3; var23 < var3 + var5; var23++) {
            int var18 = 0;
            if (var22 > var2) {
               var18++;
            }

            if (var22 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var23 > var3) {
               var18 += 8;
            }

            if (var23 < var3 + var5 - 1) {
               var18 += 2;
            }

            for (int var19 = var1; var19 >= 0; var19--) {
               if (this.tiles[var19][var22][var23] == null) {
                  this.tiles[var19][var22][var23] = new Tile(var19, var22, var23);
               }
            }

            Tile var24 = this.tiles[var1][var22][var23];
            var24.gameObjects[var24.gameObjectsCount * 1634903202] = var21;
            var24.gameObjectEdgeMasks[var24.gameObjectsCount * 484465097] = var18;
            var24.gameObjectsEdgeMask = (var24.gameObjectsEdgeMask * -776991163 | var18) * -846378964;
            var24.gameObjectsCount += -1873780224;
         }
      }

      if (var11) {
         if (this.tempGameObjectsCount >= this.tempGameObjects.length) {
            this.tempGameObjects = Arrays.copyOf(this.tempGameObjects, this.tempGameObjects.length * 2);
         }

         this.tempGameObjects[this.tempGameObjectsCount++] = var21;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Lka;Lka;Lrl16;Ljava/util/Set;)V")
   @ObfuscatedName("mn")
   public void method5752(Projection var1, Projection var2, rl16 var3, Set var4) {
      for (int var5 = 0; var5 < var3.field5566.size(); var5++) {
         TileObject var6 = (TileObject)var3.field5566.get(var5);
         if (var6 instanceof GameObject) {
            GameObject var7 = (GameObject)var6;

            assert var7.renderable instanceof DynamicObject;

            DynamicObject var8 = (DynamicObject)var7.renderable;
            if (!var8.field1208
               && this.method5769(
                  var7.startX * 1666005069, var7.startY * 889015863, var7.endX * 1553138359, var7.endY * -2094327665, var7.plane * 1291248351, var4
               )) {
               this.method5725(
                  var1,
                  var8,
                  var7,
                  var7.orientation * 46801735,
                  var7.centerX * 1204024827,
                  var7.z * 683703035,
                  var7.centerY * 1465977803,
                  var7.tag * 1608625415500949283L
               );
            }
         } else if (var6 instanceof FloorDecoration) {
            FloorDecoration var12 = (FloorDecoration)var6;

            assert var12.renderable instanceof DynamicObject;

            DynamicObject var16 = (DynamicObject)var12.renderable;
            if (!var16.field1208) {
               int var9 = var12.x * 1266171817 >> 7;
               int var10 = var12.y * -190028295 >> 7;
               if (this.method5769(var9, var10, var9, var10, var12.field3208, var4)) {
                  this.method5725(var1, var16, var12, 0, var12.x * 1266171817, var12.z * -495673633, var12.y * -190028295, var12.tag);
               }
            }
         } else if (var6 instanceof BoundaryObject) {
            BoundaryObject var13 = (BoundaryObject)var6;
            int var17 = var13.x * -1937046859 >> 7;
            int var20 = var13.y * 546730723 >> 7;
            if (this.method5769(var17, var20, var17, var20, var13.field3470, var4)) {
               if (var13.renderable1 instanceof DynamicObject) {
                  DynamicObject var23 = (DynamicObject)var13.renderable1;
                  if (!var23.field1208) {
                     this.method5725(
                        var1, var23, var13, 0, var13.x * -1937046859, var13.z * -1912869971, var13.y * 546730723, var13.tag * -4972732868916429537L
                     );
                  }
               }

               if (var13.renderable2 instanceof DynamicObject) {
                  DynamicObject var24 = (DynamicObject)var13.renderable2;
                  if (!var24.field1208) {
                     this.method5725(
                        var1, var24, var13, 0, var13.x * -1937046859, var13.z * -1912869971, var13.y * 546730723, var13.tag * -4972732868916429537L
                     );
                  }
               }
            }
         } else if (var6 instanceof WallDecoration) {
            WallDecoration var14 = (WallDecoration)var6;
            int var18 = var14.x * -682745183 >> 7;
            int var21 = var14.y * 1215145581 >> 7;
            if (this.method5769(var18, var21, var18, var21, var14.field3300, var4)) {
               if (var14.renderable1 instanceof DynamicObject) {
                  DynamicObject var25 = (DynamicObject)var14.renderable1;
                  if (!var25.field1208) {
                     this.method5725(
                        var1,
                        var25,
                        var14,
                        0,
                        var14.x * -682745183 + var14.xOffset * 1501441925,
                        var14.z * 121856729,
                        var14.y * 1215145581 + var14.field3298 * 1799251127,
                        var14.tag * -7524770072208173231L
                     );
                  }
               }

               if (var14.renderable2 instanceof DynamicObject) {
                  DynamicObject var26 = (DynamicObject)var14.renderable2;
                  if (!var26.field1208) {
                     this.method5725(var1, var26, var14, 0, var14.x * -682745183, var14.z * 121856729, var14.y * 1215145581, var14.tag * -7524770072208173231L);
                  }
               }
            }
         } else if (var6 instanceof ItemLayer) {
            ItemLayer var15 = (ItemLayer)var6;
            int var19 = var15.x * -1625205487 >> 7;
            int var22 = var15.y * -162090531 >> 7;
            if (this.method5769(var19, var22, var19, var22, var15.field2806, var4)) {
               if (var15.first != null) {
                  TileItem var27 = (TileItem)var15.first;
                  Model var11 = var27.method6220();
                  if (var11 == null) {
                     continue;
                  }

                  var27.setModelHeight(var11.getModelHeight());
                  client.field1025
                     .drawDynamic(
                        -1, var1, this, var15, var27, var11, 0, var15.x * -1625205487, var15.z * -90686671 - var15.height * 2067113767, var15.y * -162090531
                     );
                  client.method2474(
                     var1, var2, var11, 0, var15.x * -1625205487, var15.z * -90686671 - var15.height * 2067113767, var15.y * -162090531, var15.tag
                  );
               }

               if (var15.second != null) {
                  TileItem var28 = (TileItem)var15.second;
                  Model var30 = var28.method6220();
                  if (var30 == null) {
                     continue;
                  }

                  var28.setModelHeight(var30.getModelHeight());
                  client.field1025
                     .drawDynamic(
                        -1, var1, this, var15, var28, var30, 0, var15.x * -1625205487, var15.z * -90686671 - var15.height * 2067113767, var15.y * -162090531
                     );
                  client.method2474(
                     var1, var2, var30, 0, var15.x * -1625205487, var15.z * -90686671 - var15.height * 2067113767, var15.y * -162090531, var15.tag
                  );
               }

               if (var15.third != null) {
                  TileItem var29 = (TileItem)var15.third;
                  Model var31 = var29.method6220();
                  if (var31 != null) {
                     var29.setModelHeight(var31.getModelHeight());
                     client.field1025
                        .drawDynamic(
                           -1, var1, this, var15, var29, var31, 0, var15.x * -1625205487, var15.z * -90686671 - var15.height * 2067113767, var15.y * -162090531
                        );
                     client.method2474(
                        var1, var2, var31, 0, var15.x * -1625205487, var15.z * -90686671 - var15.height * 2067113767, var15.y * -162090531, var15.tag
                     );
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("oo")
   public boolean method5737(int var1) {
      return (this.field2900[var1] & 1) != 0;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjz;IZJI)Z")
   @ObfuscatedName("ed")
   boolean method5512(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14
   ) {
      for (int var15 = var2; var15 < var2 + var4; var15++) {
         for (int var16 = var3; var16 < var3 + var5; var16++) {
            if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) {
               return false;
            }

            Tile var17 = this.tiles[var1][var15][var16];
            if (var17 != null && var17.gameObjectsCount * 1265471425 >= 5) {
               return false;
            }
         }
      }

      GameObject var21 = new GameObject();
      var21.tag = var12 * -108185211891154805L;
      var21.flags = var14 * 1921920919;
      var21.plane = var1 * -786081505;
      var21.centerX = var6 * -1556820685;
      var21.centerY = var7 * 1817985507;
      var21.z = var8 * -1268875213;
      var21.renderable = var9;
      var21.orientation = var10 * 1689425527;
      var21.startX = var2 * -850870139;
      var21.startY = var3 * -153499769;
      var21.endX = (var2 + var4 - 1) * -155485433;
      var21.endY = (var3 + var5 - 1) * 1391658607;

      for (int var22 = var2; var22 < var2 + var4; var22++) {
         for (int var23 = var3; var23 < var3 + var5; var23++) {
            int var18 = 0;
            if (var22 > var2) {
               var18++;
            }

            if (var22 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var23 > var3) {
               var18 += 8;
            }

            if (var23 < var3 + var5 - 1) {
               var18 += 2;
            }

            for (int var19 = var1; var19 >= 0; var19--) {
               if (this.tiles[var19][var22][var23] == null) {
                  this.tiles[var19][var22][var23] = new Tile(var19, var22, var23);
               }
            }

            Tile var24 = this.tiles[var1][var22][var23];
            var24.gameObjects[var24.gameObjectsCount * 1265471425] = var21;
            var24.gameObjectEdgeMasks[var24.gameObjectsCount * 1265471425] = var18;
            var24.gameObjectsEdgeMask = (var24.gameObjectsEdgeMask * -776991163 | var18) * -397683571;
            var24.gameObjectsCount += 1691254849;
         }
      }

      if (var11) {
         if (this.tempGameObjectsCount >= this.tempGameObjects.length) {
            this.tempGameObjects = Arrays.copyOf(this.tempGameObjects, this.tempGameObjects.length * 2);
         }

         this.tempGameObjects[this.tempGameObjectsCount++] = var21;
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIII)Z")
   @ObfuscatedName("qg")
   public static boolean method5680(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         return var0.method5626(var1, var1, var1, var1, var1);
      } else if (var2 == var3 && var4 == var5) {
         if (!method5672(var0, var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return var0.method5683(var13 + 1, var0.tileHeights[var1][var2][var4] - var6, var15 + 1)
               && var0.method5683(var13 + 128 - 1, var0.tileHeights[var1][var2 + 1][var4] - var6, var15 + 1)
               && var0.method5683(var13 + 128 - 1, var0.tileHeights[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
               && var0.method5683(var13 + 1, var0.tileHeights[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (var0.field2952[var1][var7][var8] == -var0.Scene_drawnCount) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = var0.tileHeights[var1][var2][var4] - var6;
         if (!var0.method5683(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!var0.method5683(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !var0.method5683(var12, var9, var11) ? false : var0.method5683(var10, var9, var11);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("wd")
   public static boolean method5602(Scene var0, BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * var0.field2938 + var3 * var0.field2939 + var4 * var0.field2964 + var5, var6);
      return var6;
   }

   public int getMinLevel() {
      return this.minPlane;
   }

   @ObfuscatedSignature(descriptor = "(Lka;Lka;Lrl16;)V")
   @ObfuscatedName("yb")
   public void method5774(Projection var1, Projection var2, rl16 var3) {
      if (this.method5729(var1, var3)) {
         int var4 = var3.field5568;
         int var5 = var3.field5570;

         for (int var6 = this.minPlane; var6 < this.planes; var6++) {
            for (int var7 = var4 << 3; var7 < var4 + 1 << 3; var7++) {
               for (int var8 = var5 << 3; var8 < var5 + 1 << 3; var8++) {
                  int var9 = this.method5690(var6, var7, var8);
                  if (this.method5737(var9)) {
                     int var10 = var9 >> this.field2890 & this.field2892;
                     int var11 = var9 & this.field2893;
                     int var12 = var9 >> this.field2891 & 3;
                     int var13 = this.field2900[var9];
                     int var14 = this.method5758(var9);
                     int var15 = this.method5625(var9);
                     int var16 = var10 - this.field3014;
                     int var17 = var11 - this.field3014;
                     if (var15 <= this.Scene_plane) {
                        if ((var13 & 32) != 0) {
                           int var18 = this.method5690(3, var10, var11);
                           int var19 = this.field2900[var18];
                           if ((var19 & 256) != 0) {
                              var1.method6228(this, this.field2901[var18], 0, 0, var16, var17);
                           } else if ((var19 & 1024) != 0) {
                              var1.method6231(this, this.field2902[var18], 0, var16, var17);
                           }
                        }

                        if ((var13 & 256) != 0) {
                           if ((var13 & 512) != 0 || var12 <= this.Scene_selectedPlane) {
                              SceneTilePaint var20 = this.field2901[var9];
                              var1.method6228(this, var20, var15, var14, var16, var17);
                           }
                        } else if ((var13 & 1024) != 0) {
                           var1.method6231(this, this.field2902[var9], var15, var16, var17);
                        }

                        if ((var13 & 2048) != 0) {
                           FloorDecoration var21 = this.field2905[var9];
                           this.method5724(var1, var2, var21.renderable, 0, var21.x * 1266171817, var21.z * -495673633, var21.y * -190028295, var21.tag);
                        }

                        if ((var13 & 16384) != 0) {
                           BoundaryObject var22 = this.field2903[var9];
                           this.method5724(
                              var1,
                              var2,
                              var22.renderable1,
                              0,
                              var22.x * -1937046859,
                              var22.z * -1912869971,
                              var22.y * 546730723,
                              var22.tag * -4972732868916429537L
                           );
                           this.method5724(
                              var1,
                              var2,
                              var22.renderable2,
                              0,
                              var22.x * -1937046859,
                              var22.z * -1912869971,
                              var22.y * 546730723,
                              var22.tag * -4972732868916429537L
                           );
                        }

                        if ((var13 & 32768) != 0) {
                           WallDecoration var23 = this.field2904[var9];
                           this.method5724(
                              var1,
                              var2,
                              var23.renderable1,
                              0,
                              var23.x * -682745183 + var23.xOffset * 1501441925,
                              var23.z * 121856729,
                              var23.y * 1215145581 + var23.field3298 * 1799251127,
                              var23.tag * -7524770072208173231L
                           );
                           this.method5724(
                              var1,
                              var2,
                              var23.renderable2,
                              0,
                              var23.x * -682745183 + var23.xOffset * 1501441925,
                              var23.z * 121856729,
                              var23.y * 1215145581 + var23.field3298 * 1799251127,
                              var23.tag * -7524770072208173231L
                           );
                        }

                        for (int var24 = 0; var24 < this.field2907[var9]; var24++) {
                           GameObject var25 = this.field2887[var9 * 5 + var24];
                           if (var25.lastDrawn * 399338421 != this.Scene_drawnCount) {
                              var25.lastDrawn = this.Scene_drawnCount * -230921571;
                              this.method5724(
                                 var1,
                                 var2,
                                 var25.renderable,
                                 var25.orientation * 46801735,
                                 var25.centerX * 1204024827,
                                 var25.z * 683703035,
                                 var25.centerY * 1465977803,
                                 var25.tag * 1608625415500949283L
                              );
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eb")
   public void method5516() {
      for (int var1 = 0; var1 < this.tempGameObjectsCount; var1++) {
         GameObject var2 = this.tempGameObjects[var1];
         this.removeGameObject(var2);
         this.tempGameObjects[var1] = null;
      }

      this.tempGameObjectsCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("gp")
   int method5564(int var1, int var2, int var3) {
      return (
            this.tileHeights[var1][var2][var3]
               + this.tileHeights[var1][var2 + 1][var3]
               + this.tileHeights[var1][var2][var3 + 1]
               + this.tileHeights[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("kl")
   boolean method5676(int var1, int var2, int var3, int var4) {
      if (!method5672(this, var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.tileHeights[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.Scene_cameraX) {
                  if (!this.method5683(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5683(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5683(var5, var9, var6)) {
                  return false;
               }

               if (!this.method5683(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.Scene_cameraZ) {
                  if (!this.method5683(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5683(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5683(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method5683(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.Scene_cameraX) {
                  if (!this.method5683(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5683(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5683(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method5683(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.Scene_cameraZ) {
                  if (!this.method5683(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5683(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method5683(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method5683(var5, var9, var6)) {
                  return false;
               }

               if (!this.method5683(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method5683(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method5683(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method5683(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method5683(var5 + 128, var9, var6);
         } else {
            return var4 == 128 ? this.method5683(var5, var9, var6) : true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;IIIILjz;JI)V")
   @ObfuscatedName("ju")
   public static void method5745(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var0 == null) {
         var0.method5746(var1, var1, var1, var1, var5, var6, var1);
      }

      int var9 = var2 + var0.field3014;
      int var10 = var3 + var0.field3014;
      if (var5 != null) {
         int var11 = var0.method5690(var1, var9, var10);
         FloorDecoration var12 = new FloorDecoration();
         var12.method6196(var5);
         var12.method6199(var2 * 128 + 64);
         var12.method6194(var3 * 128 + 64);
         var12.method6200(var4);
         var12.method6197(var6);
         var12.method6198(var8);
         rl8 var13 = var0.field2886[var1][var9][var10];
         if (var13 == null) {
            var0.field2886[var1][var9][var10] = var13 = new rl8(var0, var11);
            var0.method5687(var1, var9, var10);
         }

         if (!var0.method5737(var11)) {
            var0.setTileMinPlane(var11, var1, var9, var10);
         }

         assert var0.field2905[var11] == null;

         var0.field2905[var11] = var12;
         var0.field2900[var11] = var0.field2900[var11] | 2048;
         var0.field2910[var11] = var0.field2910[var11] | 1080863910568919040L;
         if (var5 instanceof DynamicObject) {
            rl16 var14 = var0.field2912[var9 >> 3][var10 >> 3];
            var14.field5566.add(var12);
            var0.method5691((DynamicObject)var5);
         }

         var0.method5779(var5, 0, var12.getX(), var12.getZ(), var12.getY(), var2, var3);
         var12.field3208 = var1;
         if (var0.field3025) {
            GroundObjectSpawned var17 = new GroundObjectSpawned();
            var17.setTile(var13);
            var17.setGroundObject(var12);
            SecureUrlRequester.client.getCallbacks().post(var17);
         }

         if (var0.field3025 && client.field1025 != null) {
            client.field1025.invalidateZone(var0, var9 >> 3, var10 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;JI)V")
   @ObfuscatedName("ef")
   public void method5804(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      method5745(this, var1, var2, var3, var4, var5, var6, var8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)Ljv;")
   @ObfuscatedName("cq")
   public static FloorDecoration method5537(Scene var0, int var1, int var2, int var3) {
      Tile var4 = var0.tiles[var1][var2][var3];
      return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
   }

   @ObfuscatedSignature(descriptor = "(Lka;ZZ)V")
   @ObfuscatedName("jv")
   void method5653(Projection var1, boolean var2, boolean var3) {
      this.Scene_drawnCount++;
      this.field2879.method6530(Rasterizer3D.clips.field3431);
      Rasterizer3D.clips.field3431.method6530(this.modelColorOverride);
      boolean var4 = this.worldViewId == -1;
      if (var3) {
         this.Scene_baseX = -1;
         this.Scene_baseY = -1;
         this.field2929 = -1.0F;
         this.field2990 = !var2 && this.field2944 != TileRenderMode.field3137 ? this.Scene_entityX : this.Scene_cameraXTile;
         this.field3001 = !var2 && this.field2944 != TileRenderMode.field3137 ? this.Scene_entityY : this.Scene_cameraYTile;
         if (var4) {
            this.Scene_cameraXTileMin = this.field2990 - this.Scene_offsetOccluder;
            if (this.Scene_cameraXTileMin < 0) {
               this.Scene_cameraXTileMin = 0;
            }

            this.Scene_cameraYTileMin = this.field3001 - this.Scene_offsetOccluder;
            if (this.Scene_cameraYTileMin < 0) {
               this.Scene_cameraYTileMin = 0;
            }

            this.Scene_cameraXTileMax = this.field2990 + this.Scene_offsetOccluder;
            if (this.Scene_cameraXTileMax > this.xSize) {
               this.Scene_cameraXTileMax = this.xSize;
            }

            this.Scene_cameraYTileMax = this.field3001 + this.Scene_offsetOccluder;
            if (this.Scene_cameraYTileMax > this.ySize) {
               this.Scene_cameraYTileMax = this.ySize;
            }
         } else {
            this.Scene_cameraXTileMin = 0;
            this.Scene_cameraYTileMin = 0;
            this.Scene_cameraXTileMax = this.xSize;
            this.Scene_cameraYTileMax = this.ySize;
            this.field2990 = this.xSize / 2;
            this.field3001 = this.ySize / 2;
            this.Scene_offsetOccluder = Math.max(this.field2990, this.field3001);
         }

         this.field2945 = this.Scene_cameraXTile - this.field2990;
         this.field2940 = this.Scene_cameraYTile - this.field3001;
         if (var4) {
            this.method5668();
         }
      }

      if (Rasterizer3D.clips.currentFaceAlpha == 0) {
         method5656(this, var1, var4);
      } else {
         this.method5659(var1, var4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Ljn;)V")
   @ObfuscatedName("oc")
   public static void method5576(Scene var0, TileRenderMode var1) {
      if (var1 != var0.field2944) {
         var0.field2944 = var1;
         var0.method5614(var0.field2946, var0.field3011, var0.field3007, var0.field3009, var0.field3004);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("yd")
   public int method5736() {
      int var2 = this.field2898;
      var2 <<= 1;
      int var1 = this.field2911[var2];
      if (var1 >= this.field2898) {
         return this.field2897;
      } else {
         this.method5713(var1);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dp")
   public void method5477() {
      for (int var1 = 0; var1 < this.planes; var1++) {
         for (int var2 = 0; var2 < this.xSize; var2++) {
            for (int var3 = 0; var3 < this.ySize; var3++) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      if (this.Scene_planeOccluderCounts != null) {
         for (int var4 = 0; var4 < this.scenePlanesCount; var4++) {
            for (int var7 = 0; var7 < this.Scene_planeOccluderCounts[var4]; var7++) {
               this.Scene_planeOccluders[var4][var7] = null;
            }

            this.Scene_planeOccluderCounts[var4] = 0;
         }
      }

      if (this.Scene_currentOccluders != null) {
         Arrays.fill(this.Scene_currentOccluders, null);
      }

      this.Scene_currentOccludersCount = 0;

      for (int var5 = 0; var5 < this.tempGameObjectsCount; var5++) {
         this.tempGameObjects[var5] = null;
      }

      this.tempGameObjectsCount = 0;

      for (int var6 = 0; var6 < this.gameObjects.length; var6++) {
         this.gameObjects[var6] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("he")
   public int method5690(int var1, int var2, int var3) {
      assert var1 >= 0 && var1 <= 3;

      assert var2 >= 0 && var2 < this.xSize;

      assert var3 >= 0 && var3 < this.ySize;

      return var1 << this.field2891 | var2 << this.field2890 | var3;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fh")
   public void method5522(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.wallDecoration = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bs")
   public void method5805(int var1, int var2) {
      method5618(this, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ga")
   public void method5705(int var1, int var2) {
      assert (var2 & 15) == var2;

      this.field2900[var1] = this.field2900[var1] & -983041;
      this.field2900[var1] = this.field2900[var1] | var2 << 16;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;II)V")
   @ObfuscatedName("vn")
   public static void method5482(Scene var0, int var1, int var2) {
      Tile var3 = var0.tiles[0][var1][var2];

      for (int var4 = 0; var4 < 3; var4++) {
         Tile var5 = var0.tiles[var4][var1][var2] = var0.tiles[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.plane -= 1858043896;

            for (int var6 = 0; var6 < var5.gameObjectsCount * 1265471425; var6++) {
               GameObject var7 = var5.gameObjects[var6];
               long var9 = 1608625415500949283L * var7.tag;
               boolean var8 = classPC.method8712(var9) == 2;
               if (var8 && var7.startX * -566196184 == var1 && var7.startY * 889015863 == var2) {
                  var7.plane -= -1853279855;
               }
            }
         }
      }

      if (var0.tiles[0][var1][var2] == null) {
         var0.tiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      var0.tiles[0][var1][var2].linkedBelowTile = var3;
      var0.tiles[3][var1][var2] = null;
   }

   @ObfuscatedSignature(descriptor = "(Lkd;)V")
   @ObfuscatedName("fp")
   void method5517(GameObject var1) {
      for (int var2 = var1.startX * 1666005069; var2 <= var1.endX * 1553138359; var2++) {
         for (int var3 = var1.startY * 889015863; var3 <= var1.endY * -2094327665; var3++) {
            Tile var4 = this.tiles[var1.plane * 1291248351][var2][var3];
            if (var4 != null) {
               for (int var5 = 0; var5 < var4.gameObjectsCount * 1265471425; var5++) {
                  if (var4.gameObjects[var5] == var1) {
                     var4.gameObjectsCount -= 1691254849;

                     for (int var6 = var5; var6 < var4.gameObjectsCount * 1265471425; var6++) {
                        var4.gameObjects[var6] = var4.gameObjects[var6 + 1];
                        var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1];
                     }

                     var4.gameObjects[var4.gameObjectsCount * 1265471425] = null;
                     break;
                  }
               }

               var4.gameObjectsEdgeMask = 0;

               for (int var7 = 0; var7 < var4.gameObjectsCount * 1265471425; var7++) {
                  var4.gameObjectsEdgeMask = (var4.gameObjectsEdgeMask * -776991163 | var4.gameObjectEdgeMasks[var7]) * -397683571;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)J")
   @ObfuscatedName("yv")
   public static long method5543(Scene var0, int var1, int var2, int var3) {
      Tile var4 = var0.tiles[var1][var2][var3];
      return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag * -7524770072208173231L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fi")
   public void method5523(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.wallDecoration = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fg")
   public void method5525(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.gameObjectsCount * 1265471425; var5++) {
            GameObject var6 = var4.gameObjects[var5];
            long var8 = 1608625415500949283L * var6.tag;
            boolean var7 = classPC.method8712(var8) == 2;
            if (var7 && var6.startX * -1510758521 == var2 && var6.startY * -958565323 == var3) {
               this.removeGameObject(var6);
               return;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ab")
   public void setTileMinPlane(int var1, int var2, int var3, int var4) {
      this.method5768(var1);
      this.field2900[var1] = 1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjz;IJIIII)Z")
   @ObfuscatedName("ez")
   public boolean method5507(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : method5780(this, var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public int[][][] getTileHeights() {
      return this.tileHeights;
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjz;IJIIII)Z")
   @ObfuscatedName("ey")
   public boolean method5508(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : method5780(this, var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("qs")
   public static int method5475(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("pd")
   public boolean method5738(int var1) {
      return (this.field2900[var1] & 2) != 0;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fk")
   public void method5528(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.itemLayer = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lku;")
   @ObfuscatedName("fo")
   public BoundaryObject method5530(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.boundaryObject;
   }

   public int[][][] getInstanceTemplateChunks() {
      return this.field3029;
   }

   @ObfuscatedSignature(descriptor = "(Lrl16;III)V")
   @ObfuscatedName("bt")
   public void method5739(rl16 var1, int var2, int var3, int var4) {
      var1.field5569 = Math.min(var1.field5569, var4);
      var1.field5571 = Math.max(var1.field5571, var4);
      boolean var5 = (var2 & 7) == 0 && var2 > 0;
      boolean var6 = (var3 & 7) == 0 && var3 > 0;
      if (var5) {
         rl16 var7 = this.field2912[(var2 >> 3) - 1][var3 >> 3];
         var7.field5569 = Math.min(var7.field5569, var4);
         var7.field5571 = Math.max(var7.field5571, var4);
      }

      if (var6) {
         rl16 var8 = this.field2912[var2 >> 3][(var3 >> 3) - 1];
         var8.field5569 = Math.min(var8.field5569, var4);
         var8.field5571 = Math.max(var8.field5571, var4);
      }

      if (var6 && var5) {
         rl16 var9 = this.field2912[(var2 >> 3) - 1][(var3 >> 3) - 1];
         var9.field5569 = Math.min(var9.field5569, var4);
         var9.field5571 = Math.max(var9.field5571, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;JLjz;Ljz;)V")
   @ObfuscatedName("ew")
   public void method5496(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
      ItemLayer var10 = new ItemLayer();
      var10.third = var5;
      var10.x = var2 * 1646131328 + -1324417984;
      var10.y = var3 * 1939290752 + 969645376;
      var10.z = var4 * 2083339729;
      var10.tag = var6;
      var10.first = var8;
      var10.second = var9;
      int var11 = 0;
      Tile var12 = this.tiles[var1][var2][var3];
      if (var12 != null) {
         for (int var13 = 0; var13 < var12.gameObjectsCount * 1265471425; var13++) {
            if ((var12.gameObjects[var13].flags * 1362575399 & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) {
               Model var14 = (Model)var12.gameObjects[var13].renderable;
               var14.method6864();
               if (var14.height * -1272589951 > var11) {
                  var11 = var14.height * -1272589951;
               }
            }
         }
      }

      var10.height = var11 * -166504297;
      if (this.tiles[var1][var2][var3] == null) {
         this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.tiles[var1][var2][var3].itemLayer = var10;
   }

   @ObfuscatedSignature(descriptor = "(Lkd;)V")
   @ObfuscatedName("ko")
   public void method5709(GameObject var1) {
      if (this.tempGameObjectsCount <= 0) {
         assert !(var1.method6312() instanceof Actor);

         assert !(var1.method6312() instanceof Projectile);

         assert !(var1.method6312() instanceof GraphicsObject);

         assert !(var1.method6312() instanceof Scene);

         int var2 = var1.startX * 1666005069 + this.field3014;
         int var3 = var1.startY * 889015863 + this.field3014;
         int var4 = var1.getPlane();
         client.field938.trace("Game object despawn: {}", var1.getId());
         if (var1.renderable instanceof DynamicObject) {
            rl16 var5 = this.field2912[var2 >> 3][var3 >> 3];
            var5.field5566.remove(var1);
         }

         if (this.field3025) {
            GameObjectDespawned var6 = new GameObjectDespawned();
            var6.setTile(this.field2886[var4][var2][var3]);
            var6.setGameObject(var1);
            SecureUrlRequester.client.getCallbacks().post(var6);
         }

         if (this.field3025 && client.field1025 != null) {
            client.field1025.invalidateZone(this, var2 >> 3, var3 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lku;")
   @ObfuscatedName("fw")
   public BoundaryObject method5531(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.boundaryObject;
   }

   @ObfuscatedSignature(descriptor = "(III)Lkf;")
   @ObfuscatedName("fy")
   public WallDecoration method5533(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.wallDecoration;
   }

   @ObfuscatedSignature(descriptor = "(Lka;Lrl16;)Z")
   @ObfuscatedName("pi")
   public boolean method5729(Projection var1, rl16 var2) {
      int var3 = var2.field5568;
      int var4 = var2.field5570;
      int var5 = ((var3 << 3) - this.field3014 << 7) + (var2.field5573 + var2.field5564) / 2;
      int var6 = (var2.field5571 + var2.field5569) / 2;
      int var7 = ((var4 << 3) - this.field3014 << 7) + (var2.field5572 + var2.field5565) / 2;
      int var8 = (var2.field5564 - var2.field5573 + 1) / 2;
      int var9 = (var2.field5571 - var2.field5569 + 1) / 2;
      int var10 = (var2.field5565 - var2.field5572 + 1) / 2;
      return client.method1835(var1, 0, 0, 0, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(III)Lkf;")
   @ObfuscatedName("fu")
   public WallDecoration method5534(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.wallDecoration;
   }

   @ObfuscatedSignature(descriptor = "(III)Lkd;")
   @ObfuscatedName("vg")
   public GameObject method5535(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for (int var5 = 0; var5 < var4.gameObjectsCount * 1265471425; var5++) {
            GameObject var6 = var4.gameObjects[var5];
            long var8 = var6.tag * 1608625415500949283L;
            boolean var7 = classPC.method8712(var8) == 2;
            if (var7 && var6.startX * 1666005069 == var2 && var6.startY * 889015863 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Lka;ZZ)V")
   @ObfuscatedName("ss")
   public static void method5654(Scene var0, Projection var1, boolean var2, boolean var3) {
      if (var0 == null) {
         var0.getUnderlayIds();
      }

      var0.Scene_drawnCount++;
      var0.field2879.method6530(Rasterizer3D.clips.field3431);
      Rasterizer3D.clips.field3431.method6530(var0.modelColorOverride);
      boolean var4 = var0.worldViewId == -1;
      if (var3) {
         var0.Scene_baseX = -1;
         var0.Scene_baseY = -1;
         var0.field2929 = -1.0F;
         var0.field2990 = !var2 && var0.field2944 != TileRenderMode.field3137 ? var0.Scene_entityX : var0.Scene_cameraXTile;
         var0.field3001 = !var2 && var0.field2944 != TileRenderMode.field3137 ? var0.Scene_entityY : var0.Scene_cameraYTile;
         if (var4) {
            var0.Scene_cameraXTileMin = var0.field2990 - var0.Scene_offsetOccluder;
            if (var0.Scene_cameraXTileMin < 0) {
               var0.Scene_cameraXTileMin = 0;
            }

            var0.Scene_cameraYTileMin = var0.field3001 - var0.Scene_offsetOccluder;
            if (var0.Scene_cameraYTileMin < 0) {
               var0.Scene_cameraYTileMin = 0;
            }

            var0.Scene_cameraXTileMax = var0.field2990 + var0.Scene_offsetOccluder;
            if (var0.Scene_cameraXTileMax > var0.xSize) {
               var0.Scene_cameraXTileMax = var0.xSize;
            }

            var0.Scene_cameraYTileMax = var0.field3001 + var0.Scene_offsetOccluder;
            if (var0.Scene_cameraYTileMax > var0.ySize) {
               var0.Scene_cameraYTileMax = var0.ySize;
            }
         } else {
            var0.Scene_cameraXTileMin = 0;
            var0.Scene_cameraYTileMin = 0;
            var0.Scene_cameraXTileMax = var0.xSize;
            var0.Scene_cameraYTileMax = var0.ySize;
            var0.field2990 = var0.xSize / 2;
            var0.field3001 = var0.ySize / 2;
            var0.Scene_offsetOccluder = Math.max(var0.field2990, var0.field3001);
         }

         var0.field2945 = var0.Scene_cameraXTile - var0.field2990;
         var0.field2940 = var0.Scene_cameraYTile - var0.field3001;
         if (var4) {
            var0.method5668();
         }
      }

      if (Rasterizer3D.clips.currentFaceAlpha == 0) {
         method5656(var0, var1, var4);
      } else {
         var0.method5659(var1, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dt")
   void occlude() {
      int var1 = this.Scene_planeOccluderCounts[this.Scene_plane];
      Occluder[] var2 = this.Scene_planeOccluders[this.Scene_plane];
      this.Scene_currentOccludersCount = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         Occluder var4 = var2[var3];
         if (var4.minY * 100315147 == 1) {
            int var14 = var4.maxX * 139674851 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
            if (var14 >= 0 && var14 <= this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
               int var16 = var4.field3319 * 1462494231 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
               if (var16 < 0) {
                  var16 = 0;
               }

               int var18 = var4.field3335 * 16323178 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
               if (var18 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
                  var18 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
               }

               boolean var20 = false;

               while (var16 <= var18) {
                  if (this.visibleTiles(var14, var16++)) {
                     var20 = true;
                     break;
                  }
               }

               if (var20) {
                  int var22 = this.Scene_cameraX - var4.maxY * 551934522;
                  if (var22 > 32) {
                     var4.field3320 = -952971740;
                  } else {
                     if (var22 >= -32) {
                        continue;
                     }

                     var4.field3320 = 2012523183;
                     var22 = -var22;
                  }

                  var4.maxTileX = (var4.minTileX * -1422533277 - this.Scene_cameraZ << 8) / var22 * 818308459;
                  var4.minX = (var4.minZ * 282521569 - this.Scene_cameraZ << 8) / var22 * -239764303;
                  var4.field3321 = (var4.minTileY * 1051489521 - this.Scene_cameraY << 8) / var22 * -1193579980;
                  var4.field3330 = (var4.field3324 * -163413578 - this.Scene_cameraY << 8) / var22 * 1380630977;
                  this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
               }
            }
         } else if (var4.minY * 100315147 == 2) {
            int var13 = var4.field3319 * -470143361 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
            if (var13 >= 0 && var13 <= this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
               int var15 = var4.maxX * -148649311 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
               if (var15 < 0) {
                  var15 = 0;
               }

               int var17 = var4.maxZ * 2070166469 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
               if (var17 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
                  var17 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
               }

               boolean var19 = false;

               while (var15 <= var17) {
                  if (this.visibleTiles(var15++, var13)) {
                     var19 = true;
                     break;
                  }
               }

               if (var19) {
                  int var21 = this.Scene_cameraZ - var4.minTileX * -921583280;
                  if (var21 > 32) {
                     var4.field3320 = 1449666335;
                  } else {
                     if (var21 >= 71883770) {
                        continue;
                     }

                     var4.field3320 = -930423084;
                     var21 = -var21;
                  }

                  var4.maxTileY = (var4.maxY * 1482829177 - this.Scene_cameraX << 8) / var21 * 1029885596;
                  var4.type = (var4.field3337 * 70427260 - this.Scene_cameraX << 8) / var21 * 1045016682;
                  var4.field3321 = (var4.minTileY * -593128104 - this.Scene_cameraY << 8) / var21 * -1084173727;
                  var4.field3330 = (var4.field3324 * 1429810870 - this.Scene_cameraY << 8) / var21 * 1380630977;
                  this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
               }
            }
         } else if (var4.minY * 84456863 == 4) {
            int var5 = var4.minTileY * 1051489521 - this.Scene_cameraY;
            if (var5 > 128) {
               int var6 = var4.field3319 * -470143361 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = var4.field3335 * 1971187923 - this.Scene_cameraYTile + this.Scene_offsetOccluder;
               if (var7 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
                  var7 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
               }

               if (var6 <= var7) {
                  int var8 = var4.maxX * -148649311 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  int var9 = var4.maxZ * 1669590015 - this.Scene_cameraXTile + this.Scene_offsetOccluder;
                  if (var9 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
                     var9 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
                  }

                  boolean var10 = false;

                  label190:
                  for (int var11 = var8; var11 <= var9; var11++) {
                     for (int var12 = var6; var12 <= var7; var12++) {
                        if (this.visibleTiles(var11, var12)) {
                           var10 = true;
                           break label190;
                        }
                     }
                  }

                  if (var10) {
                     var4.field3320 = -1254022050;
                     var4.maxTileY = (var4.maxY * -1528833028 - this.Scene_cameraX << 8) / var5 * -1243074404;
                     var4.type = (var4.field3337 * 602919219 - this.Scene_cameraX << 8) / var5 * 1821069683;
                     var4.maxTileX = (var4.minTileX * -1389987515 - this.Scene_cameraZ << 8) / var5 * 818308459;
                     var4.minX = (var4.minZ * 282521569 - this.Scene_cameraZ << 8) / var5 * -239764303;
                     this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Ljv;")
   @ObfuscatedName("uk")
   public FloorDecoration method5538(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
   }

   @ObfuscatedSignature(descriptor = "(III)Ljv;")
   @ObfuscatedName("fm")
   public FloorDecoration method5539(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("es")
   public void method5490(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      if (var4 == 0) {
         SceneTilePaint var24 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

         for (int var26 = var1; var26 >= 0; var26--) {
            if (this.tiles[var26][var2][var3] == null) {
               this.tiles[var26][var2][var3] = new Tile(var26, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].paint = var24;
      } else if (var4 != 1) {
         if (var20 == 0) {
            var20 = 1;
         }

         SceneTileModel var23 = new SceneTileModel(
            var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20
         );

         for (int var25 = var1; var25 >= 0; var25--) {
            if (this.tiles[var25][var2][var3] == null) {
               this.tiles[var25][var2][var3] = new Tile(var25, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].model = var23;
      } else {
         SceneTilePaint var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for (int var22 = var1; var22 >= 0; var22--) {
            if (this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].paint = var21;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("gf")
   public long method5540(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag * -4972732868916429537L : 0L;
   }

   public Scene(int var1, int var2, int var3, int var4, int var5, TileRenderMode var6, int[][][] var7) {
      Scene var8 = this;
      this.modelColorOverride = new ModelColorOverride();
      this.field2879 = new ModelColorOverride();
      this.field2880 = 0;
      this.field2881 = null;
      this.field2882 = -1;
      this.field2883 = -1;
      this.field2885 = new rl17(this);
      this.field2886 = new rl8[var2][var3][var4];
      this.field2888 = new int[var2][var3][var4];
      int var16 = 32 - Integer.numberOfLeadingZeros(var3 + 3);
      int var17 = 32 - Integer.numberOfLeadingZeros(var4 + 3);
      int var18 = 4 * (1 << var16) * (1 << var17);
      int var19 = var18 << 1;
      this.field2890 = var17;
      this.field2891 = var16 + var17;
      this.field2892 = (1 << var16) - 1;
      this.field2893 = (1 << var17) - 1;
      this.field2894 = 1 << var16 + var17;
      this.field2895 = 1 << var17;
      this.field2896 = 1;
      this.field2897 = var18 - 1;
      this.field2898 = var18 - 2;
      this.field2899 = var18 - 3;
      this.field2900 = new int[var18];
      this.field2901 = new SceneTilePaint[var18];
      this.field2902 = new SceneTileModel[var18];
      this.field2903 = new BoundaryObject[var18];
      this.field2904 = new WallDecoration[var18];
      this.field2905 = new FloorDecoration[var18];
      this.field2906 = new ItemLayer[var18];
      this.field2907 = new byte[var18];
      this.field2887 = new GameObject[var18 * 5];
      this.field2908 = new byte[var18 * 5];
      this.field2909 = new byte[var18];
      this.field2910 = new long[var18];
      this.field2911 = new int[var19];
      Arrays.fill(this.field2911, this.field2897);
      this.method5743();
      int var20 = var3 >> 3;
      int var21 = var4 >> 3;
      this.field2912 = new rl16[var20][var21];
      this.field2914 = new rl16[var20 * var21];

      for (int var22 = 0; var22 < var20; var22++) {
         int var23 = 0;

         while (var23 < var21) {
            rl16 var24 = var8.field2912[var22][var23] = new rl16();
            var24.field5568 = var22;
            var24.field5570 = var23++;
         }
      }

      if (var1 == -1) {
         var8.field2915 = Varps.Varps_main != null ? new BitSet(Varps.Varps_main.length) : null;
         var8.field2916 = new HashSet();
      } else {
         var8.field2915 = null;
         var8.field2917 = new FloatProjection(new TransformationMatrix());
         var8.field2918 = new FloatProjection(new TransformationMatrix());
         var8.field2916 = Collections.emptySet();
      }

      this.modelColorOverride = new ModelColorOverride();
      this.field2879 = new ModelColorOverride();
      this.Scene_plane = 0;
      this.field2922 = new TransformationMatrix();
      this.field2923 = 0;
      this.field2924 = 0;
      this.field2925 = 0;
      this.Scene_scale = 1.0F;
      this.Scene_baseX = -1;
      this.Scene_baseY = -1;
      this.field2929 = -1.0F;
      this.baseX = -1;
      this.baseY = -1;
      this.viewportWalking = false;
      this.minPlane = 0;
      this.tempGameObjectsCount = 0;
      this.tileUpdateCount = 0;
      this.gameObjects = new GameObject[5];
      this.checkClick = false;
      this.Scene_selectedPlane = 0;
      this.Scene_selectedScreenX = 0;
      this.Scene_selectedScreenY = 0;
      this.scenePlanesCount = 4;
      this.Scene_tilesDeque = new NodeDeque();
      this.tempGameObjects = new GameObject[32];
      this.Scene_offsetOccluder = 0;
      this.field2944 = TileRenderMode.field3137;
      this.field2945 = 0;
      this.field2940 = 0;
      this.field2946 = new int[9];
      this.planes = var2;
      this.xSize = var3;
      this.ySize = var4;
      this.tiles = new Tile[var2][var3][var4];
      this.field2952 = new int[var2][var3 + 1][var4 + 1];
      this.tileHeights = var7;
      this.Scene_offsetOccluder = var5;
      this.field2944 = var6;
      this.worldViewId = var1;
      if (var1 != -1) {
         this.field2919 = 0;
         this.field2958 = null;
         this.field2959 = null;
         this.field2960 = 0;
         this.field2961 = 0;
         this.field2962 = 0;
         this.field2965 = 0;
         this.field2921 = null;
         this.field2956 = null;
         this.field2938 = 0;
         this.field2939 = 0;
         this.field2964 = 0;
      } else {
         this.field2919 = 8386816;
         this.field2958 = new BitSet(this.field2919);
         this.field2959 = new BitSet(this.field2919);
         this.field2960 = 1048352;
         this.field2961 = 32761;
         this.field2962 = 181;
         this.field2965 = 9644832;
         this.field2921 = new BitSet(this.field2965);
         this.field2956 = new BitSet(this.field2965);
         this.field2938 = 1071648;
         this.field2939 = 33489;
         this.field2964 = 183;
         this.Scene_planeOccluderCounts = new int[this.scenePlanesCount];
         this.Scene_planeOccluders = new Occluder[this.scenePlanesCount][500];
         this.Scene_currentOccluders = new Occluder[500];
      }

      AbstractRasterizer.method5437(var5);
      this.clearTempGameObjects();
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("go")
   public long method5545(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for (int var5 = 0; var5 < var4.gameObjectsCount * -321015979; var5++) {
            GameObject var6 = var4.gameObjects[var5];
            long var8 = var6.tag * 1608625415500949283L;
            boolean var7 = classPC.method8712(var8) == 2;
            if (var7 && var6.startX * -1562565562 == var2 && var6.startY * 889015863 == var3) {
               return var6.tag * 1608625415500949283L;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("bw")
   public long getGameObjectTag(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for (int var5 = 0; var5 < var4.gameObjectsCount * 573438188; var5++) {
            GameObject var6 = var4.gameObjects[var5];
            long var8 = var6.tag * 1608625415500949283L;
            boolean var7 = classPC.method8712(var8) == 2;
            if (var7 && var6.startX * 1666005069 == var2 && var6.startY * 889015863 == var3) {
               return var6.tag * 1608625415500949283L;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("gz")
   int method5561(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method5567(var1, var2, var3) - this.method5567(var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("bf")
   public long getFloorDecorationTag(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L;
   }

   @ObfuscatedSignature(descriptor = "(IIIJ)I")
   @ObfuscatedName("gg")
   public int method5550(int var1, int var2, int var3, long var4) {
      Tile var6 = this.tiles[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.boundaryObject != null && var6.boundaryObject.tag * -4972732868916429537L == var4) {
         return var6.boundaryObject.flags * -1044451971 & 0xFF;
      } else if (var6.wallDecoration != null && var6.wallDecoration.tag * -7524770072208173231L == var4) {
         return var6.wallDecoration.flags * 219957667 & 0xFF;
      } else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) {
         return var6.floorDecoration.flags * 633706255 & 0xFF;
      } else {
         for (int var7 = 0; var7 < var6.gameObjectsCount * 1265471425; var7++) {
            if (var6.gameObjects[var7].tag * 1608625415500949283L == var4) {
               return var6.gameObjects[var7].flags * 1362575399 & 0xFF;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;III)V")
   @ObfuscatedName("gt")
   void method5556(ModelData var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for (int var9 = var3; var9 <= var6; var9++) {
         if (var9 >= 0 && var9 < this.xSize) {
            for (int var10 = var7; var10 <= var8; var10++) {
               if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) {
                  Tile var11 = this.tiles[var2][var9][var10];
                  if (var11 != null && var11.floorDecoration != null && var11.floorDecoration.renderable instanceof ModelData) {
                     int var12 = this.method5560(var2, var9, var10, var2, var3, var4);
                     ModelData var13 = (ModelData)var11.floorDecoration.renderable;
                     ModelData.method6020(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("gy")
   public void method5552(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.planes; var4++) {
         for (int var5 = 0; var5 < this.xSize; var5++) {
            for (int var6 = 0; var6 < this.ySize; var6++) {
               Tile var7 = this.tiles[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.boundaryObject;
                  if (var8 != null && var8.renderable1 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.renderable1;
                     class144.method3966(this, var9, var4, var5, var6, 1, 1);
                     if (var8.renderable2 instanceof ModelData) {
                        ModelData var10 = (ModelData)var8.renderable2;
                        class144.method3966(this, var10, var4, var5, var6, 1, 1);
                        ModelData.method6020(var9, var10, 0, 0, 0, false);
                        var8.renderable2 = ModelData.method6106(var10, var10.ambient, var10.contrast, var1, var2, var3);
                     }

                     var8.renderable1 = ModelData.method6106(var9, var9.ambient, var9.contrast, var1, var2, var3);
                  }

                  for (int var12 = 0; var12 < var7.gameObjectsCount * -1811449824; var12++) {
                     GameObject var14 = var7.gameObjects[var12];
                     if (var14 != null && var14.renderable instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.renderable;
                        class144.method3966(
                           this,
                           var11,
                           var4,
                           var5,
                           var6,
                           var14.endX * 1553138359 - var14.startX * 1666005069 + 1,
                           var14.endY * -2028421126 - var14.startY * 889015863 + 1
                        );
                        var14.renderable = ModelData.method6106(var11, var11.ambient, var11.contrast, var1, var2, var3);
                     }
                  }

                  FloorDecoration var13 = var7.floorDecoration;
                  if (var13 != null && var13.renderable instanceof ModelData) {
                     ModelData var15 = (ModelData)var13.renderable;
                     this.method5754(var15, var4, var5, var6);
                     var13.renderable = ModelData.method6106(var15, var15.ambient, var15.contrast, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jz")
   void method5641() {
      if (this.checkClick) {
         this.checkClick = false;
         this.baseX = this.Scene_baseX;
         this.baseY = this.Scene_baseY;
      }
   }

   public byte getOverrideAmount() {
      return this.modelColorOverride.overrideAmount;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ui")
   public void method5708() {
      boolean var1 = this.field2880 != 0 && this.worldViewId == -1;
      if (var1) {
         this.field2916.clear();
         Player var2 = SecureUrlRequester.client.method2443();
         if (var2 != null && (this.field2880 & 1) != 0) {
            LocalPoint var3 = var2.getLocalLocation();
            if (var3.isInScene()) {
               int var4 = this.field2888[this.field3023.plane * 2115028565][var3.getSceneX() + this.field3014][var3.getSceneY() + this.field3014];
               this.method5742(var4);
            }
         }

         if (this.field2882 >= this.field3022
            && this.field2882 < this.field3018
            && this.field2883 >= this.field3016
            && this.field2883 < this.field3015
            && (this.field2880 & 2) != 0) {
            int var15 = this.field2888[this.field3023.plane * 2115028565][this.field2882 + this.field3014][this.field2883 + this.field3014];
            this.method5742(var15);
         }

         LocalPoint var16 = SecureUrlRequester.client.getLocalDestinationLocation();
         if (var16 != null && var16.isInScene() && (this.field2880 & 4) != 0) {
            int var17 = this.field2888[this.field3023.plane * 2115028565][var16.getSceneX() + this.field3014][var16.getSceneY() + this.field3014];
            this.method5742(var17);
         }

         if (SecureUrlRequester.client.getCameraPitch() < 310 && (this.field2880 & 8) != 0 && var2 != null) {
            int var18 = var2.method2846() >> 7;
            int var5 = var2.method2845() >> 7;
            int var6 = SecureUrlRequester.client.getCameraX() >> 7;
            int var7 = SecureUrlRequester.client.getCameraY() >> 7;
            if (var18 >= this.field3022
               && var5 >= this.field3016
               && var6 >= this.field3022
               && var7 >= this.field3016
               && var18 < this.field3018
               && var5 < this.field3015
               && var6 < this.field3018
               && var7 < this.field3015) {
               int var8 = Math.abs(var18 - var6);
               int var9 = Integer.compare(var18, var6);
               int var10 = -Math.abs(var5 - var7);
               int var11 = Integer.compare(var5, var7);
               int var12 = var8 + var10;

               while (var6 != var18 || var7 != var5) {
                  if (this.method5753(this.field3023.plane * 2115028565, var6 + this.field3014, var7 + this.field3014)) {
                     int var14 = this.field2888[this.field3023.plane * 2115028565][var6 + this.field3014][var7 + this.field3014];
                     this.method5742(var14);
                  }

                  int var13 = 2 * var12;
                  if (var13 >= var10) {
                     var12 += var10;
                     var6 += var9;
                  } else {
                     var12 += var8;
                     var7 += var11;
                  }
               }
            }
         }

         this.field2916.remove(0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;III)V")
   @ObfuscatedName("kz")
   public static void method5718(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method5741(var1, var1, var1);
      }

      for (int var4 = 0; var4 < var0.planes; var4++) {
         for (int var5 = 0; var5 < var0.xSize; var5++) {
            for (int var6 = 0; var6 < var0.ySize; var6++) {
               int var7 = var0.method5690(var4, var5, var6);
               if (var0.method5737(var7)) {
                  BoundaryObject var8 = var0.field2903[var7];
                  if (var8 != null && var8.renderable1 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.renderable1;
                     var0.method5810(var9, var4, var5, var6, 1, 1);
                     if (var8.renderable2 instanceof net.runelite.api.ModelData) {
                        ModelData var10 = (ModelData)var8.renderable2;
                        var0.method5810(var10, var4, var5, var6, 1, 1);
                        ModelData.method6127(var9, var10, 0, 0, 0, false);
                        var8.renderable2 = var10.method6119(var10.ambient, var10.contrast, var1, var2, var3);
                     }

                     var8.renderable1 = var9.method6119(var9.ambient, var9.contrast, var1, var2, var3);
                  }

                  byte var13 = var0.field2907[var7];

                  for (int var14 = 0; var14 < var13; var14++) {
                     GameObject var11 = var0.field2887[var7 * 5 + var14];
                     if (var11 != null && var11.renderable instanceof ModelData) {
                        ModelData var12 = (ModelData)var11.renderable;
                        var0.method5810(
                           var12,
                           var4,
                           var5,
                           var6,
                           var11.endX * 1553138359 - var11.startX * 1666005069 + 1,
                           var11.endY * -2094327665 - var11.startY * 889015863 + 1
                        );
                        var11.renderable = var12.method6119(var12.ambient, var12.contrast, var1, var2, var3);
                     }
                  }

                  FloorDecoration var15 = var0.field2905[var7];
                  if (var15 != null && var15.renderable instanceof ModelData) {
                     ModelData var16 = (ModelData)var15.renderable;
                     var0.method5815(var16, var4, var5, var6);
                     var15.renderable = var16.method6119(var16.ambient, var16.contrast, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("gk")
   public void method5553(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.planes; var4++) {
         for (int var5 = 0; var5 < this.xSize; var5++) {
            for (int var6 = 0; var6 < this.ySize; var6++) {
               Tile var7 = this.tiles[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.boundaryObject;
                  if (var8 != null && var8.renderable1 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.renderable1;
                     class144.method3966(this, var9, var4, var5, var6, 1, 1);
                     if (var8.renderable2 instanceof ModelData) {
                        ModelData var10 = (ModelData)var8.renderable2;
                        class144.method3966(this, var10, var4, var5, var6, 1, 1);
                        ModelData.method6020(var9, var10, 0, 0, 0, false);
                        var8.renderable2 = ModelData.method6106(var10, var10.ambient, var10.contrast, var1, var2, var3);
                     }

                     var8.renderable1 = ModelData.method6106(var9, var9.ambient, var9.contrast, var1, var2, var3);
                  }

                  for (int var12 = 0; var12 < var7.gameObjectsCount * 1798603172; var12++) {
                     GameObject var14 = var7.gameObjects[var12];
                     if (var14 != null && var14.renderable instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.renderable;
                        class144.method3966(
                           this,
                           var11,
                           var4,
                           var5,
                           var6,
                           var14.endX * 1553138359 - var14.startX * 1666005069 + 1,
                           var14.endY * -2094327665 - var14.startY * 889015863 + 1
                        );
                        var14.renderable = ModelData.method6106(var11, var11.ambient, var11.contrast, var1, var2, var3);
                     }
                  }

                  FloorDecoration var13 = var7.floorDecoration;
                  if (var13 != null && var13.renderable instanceof ModelData) {
                     ModelData var15 = (ModelData)var13.renderable;
                     this.method5754(var15, var4, var5, var6);
                     var13.renderable = ModelData.method6106(var15, var15.ambient, var15.contrast, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Z")
   @ObfuscatedName("ir")
   boolean method5626(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = Rasterizer3D.Rasterizer3D_sine;
      int[] var7 = Rasterizer3D.Rasterizer3D_cosine;
      int var8 = var6[var4];
      int var9 = var7[var4];
      int var10 = var6[var5];
      int var11 = var7[var5];
      int var12 = var3 * var10 + var1 * var11 >> 16;
      int var13 = var3 * var11 - var1 * var10 >> 16;
      int var14 = var2 * var8 + var13 * var9 >> 16;
      int var15 = var2 * var9 - var13 * var8 >> 16;
      if (var14 >= 50 && var14 <= AbstractRasterizer.method5428()) {
         int var16 = this.field3003 + var12 * 128 / var14;
         int var17 = this.field3002 + var15 * 128 / var14;
         return var16 >= this.field3010 && var16 <= this.field3012 && var17 >= this.field3005 && var17 <= this.field3006;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;III)V")
   @ObfuscatedName("gw")
   void method5557(ModelData var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for (int var9 = var3; var9 <= var6; var9++) {
         if (var9 >= 0 && var9 < this.xSize) {
            for (int var10 = var7; var10 <= var8; var10++) {
               if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) {
                  Tile var11 = this.tiles[var2][var9][var10];
                  if (var11 != null && var11.floorDecoration != null && var11.floorDecoration.renderable instanceof ModelData) {
                     int var12 = this.method5560(var2, var9, var10, var2, var3, var4);
                     ModelData var13 = (ModelData)var11.floorDecoration.renderable;
                     ModelData.method6020(var1, var13, (var9 - var3) * 1447155585, var12, (var10 - var4) * 589971326, true);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;)V")
   @ObfuscatedName("gv")
   public static void method5634(Scene var0) {
      if (var0 == null) {
         var0.occlude();
      }

      var0.viewportWalking = true;
   }

   public byte getOverrideLuminance() {
      return this.modelColorOverride.overrideLuminance;
   }

   @ObfuscatedSignature(descriptor = "(Ljm;IIIII)V")
   @ObfuscatedName("gb")
   void method5559(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for (int var12 = var2; var12 <= var2 + 1; var12++) {
         if (var12 != this.planes) {
            for (int var13 = var8; var13 <= var9; var13++) {
               if (var13 >= 0 && var13 < this.xSize) {
                  for (int var14 = var10; var14 <= var11; var14++) {
                     if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        Tile var15 = this.tiles[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.method5560(var12, var13, var14, var2, var3, var4);
                           BoundaryObject var17 = var15.boundaryObject;
                           if (var17 != null) {
                              if (var17.renderable1 instanceof ModelData) {
                                 ModelData var18 = (ModelData)var17.renderable1;
                                 ModelData.method6020(
                                    var1,
                                    var18,
                                    (var13 - var3) * 128 + (1 - var5) * 2025029260,
                                    var16,
                                    (var14 - var4) * -616079961 + (1 - var6) * -1700630929,
                                    var7
                                 );
                              }

                              if (var17.renderable2 instanceof ModelData) {
                                 ModelData var23 = (ModelData)var17.renderable2;
                                 ModelData.method6020(
                                    var1,
                                    var23,
                                    (var13 - var3) * 128 + (1 - var5) * 1543316531,
                                    var16,
                                    (var14 - var4) * 856421688 + (1 - var6) * -1984399186,
                                    var7
                                 );
                              }
                           }

                           for (int var24 = 0; var24 < var15.gameObjectsCount * -1183083679; var24++) {
                              GameObject var19 = var15.gameObjects[var24];
                              if (var19 != null && var19.renderable instanceof ModelData) {
                                 ModelData var20 = (ModelData)var19.renderable;
                                 int var21 = var19.endX * 1553138359 - var19.startX * -1493025658 + 1;
                                 int var22 = var19.endY * -367416140 - var19.startY * 864412233 + 1;
                                 ModelData.method6020(
                                    var1,
                                    var20,
                                    (var19.startX * 1666005069 - var3) * -2006128527 + (var21 - var5) * 64,
                                    var16,
                                    (var19.startY * 929770643 - var4) * 128 + (var22 - var6) * -1208544484,
                                    var7
                                 );
                              }
                           }
                        }
                     }
                  }
               }
            }

            var8--;
            var7 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("sy")
   public boolean method5748(int var1, int var2, int var3, int var4, boolean var5) {
      DrawCallbacks var6 = client.field1025;
      if (SecureUrlRequester.client.isGpu() && var6 != null && this.worldViewId == -1) {
         for (int var7 = this.Scene_cameraXTileMin; var7 < this.Scene_cameraXTileMax; var7++) {
            int var8 = this.ySize;
            int var9 = 0;

            for (int var10 = this.Scene_cameraYTileMin; var10 < this.Scene_cameraYTileMax; var10++) {
               int var11 = this.method5690(var4, var7, var10);
               if (this.method5737(var11)
                  && var6.tileInFrustum(this, this.field2970, this.field2969, this.field2972, this.field2971, var1, var2, var3, var4, var7, var10)) {
                  var8 = Math.min(var8, var10);
                  var9 = Math.max(var9, var10);
               }
            }

            if (var5) {
               field2866[var7] = var8;
               field2867[var7] = var9;
            } else {
               field2866[var7] = Math.min(field2866[var7], var8);
               field2867[var7] = Math.max(field2867[var7], var9);
            }
         }

         for (int var12 = this.Scene_cameraXTileMin + 1; var12 < this.Scene_cameraXTileMax - 1; var12++) {
            field2866[var12] = Math.min(field2866[var12], Math.max(field2866[var12 - 1], field2866[var12 + 1]));
            field2867[var12] = Math.max(field2867[var12], Math.min(field2867[var12 - 1], field2867[var12 + 1]));
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("bl")
   int method5562(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method5567(var1, var2, var3) - this.method5567(var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Z")
   @ObfuscatedName("cv")
   boolean method5627(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = Rasterizer3D.Rasterizer3D_sine;
      int[] var7 = Rasterizer3D.Rasterizer3D_cosine;
      int var8 = var6[var4];
      int var9 = var7[var4];
      int var10 = var6[var5];
      int var11 = var7[var5];
      int var12 = var3 * var10 + var1 * var11 >> 16;
      int var13 = var3 * var11 - var1 * var10 >> 16;
      int var14 = var2 * var8 + var13 * var9 >> 16;
      int var15 = var2 * var9 - var13 * var8 >> 16;
      if (var14 >= 50 && var14 <= AbstractRasterizer.method5428()) {
         int var16 = this.field3003 + var12 * 128 / var14;
         int var17 = this.field3002 + var15 * 128 / var14;
         return var16 >= this.field3010 && var16 <= this.field3012 && var17 >= this.field3005 && var17 <= this.field3006;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjz;IJIIII)Z")
   @ObfuscatedName("ev")
   public boolean method5509(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : method5780(this, var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fw")
   public void method5480(int var1) {
      this.minPlane = var1;

      for (int var2 = 0; var2 < this.xSize; var2++) {
         for (int var3 = 0; var3 < this.ySize; var3++) {
            if (this.tiles[var1][var2][var3] == null) {
               this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("xz")
   public void method5806() {
      this.clearTempGameObjects();
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("gx")
   int method5565(int var1, int var2, int var3) {
      return (
            this.tileHeights[var1][var2][var3]
               + this.tileHeights[var1][var2 + 1][var3]
               + this.tileHeights[var1][var2][var3 + 1]
               + this.tileHeights[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "([IIIII)V")
   @ObfuscatedName("cz")
   public void method5614(int[] var1, int var2, int var3, int var4, int var5) {
      this.field2946 = var1;
      this.field3011 = var2;
      this.field3007 = var3;
      this.field3009 = var4;
      this.field3004 = var5;
      this.field3010 = 0;
      this.field3005 = 0;
      this.field3012 = var4;
      this.field3006 = var5;
      this.field3003 = var4 / 2;
      this.field3002 = var5 / 2;
      this.field2959.set(0, this.field2959.size());
      this.field2956.set(0, this.field2956.size());
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("gc")
   int method5566(int var1, int var2, int var3) {
      return (
            this.tileHeights[var1][var2][var3]
               + this.tileHeights[var1][var2 + 1][var3]
               + this.tileHeights[var1][var2][var3 + 1]
               + this.tileHeights[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "()[[[Lrl8;")
   @ObfuscatedName("zw")
   public rl8[][][] method5699() {
      return this.field2886;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("zq")
   public static boolean method5580(Scene var0, BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * var0.field2960 + var3 * var0.field2961 + var4 * var0.field2962 + var5);
   }

   public byte[][][] getExtendedTileSettings() {
      return this.field3028;
   }

   @ObfuscatedSignature(descriptor = "(IIF)V")
   @ObfuscatedName("th")
   public void method5755(int var1, int var2, float var3) {
      int var4 = var1;
      int var5 = var2;
      Player var6 = class330.localPlayer;
      if (this.worldViewId == -1 && var6.method2833()) {
         int var7 = var6.x * 340712311 >> 7;
         int var8 = var6.y * -1747310679 >> 7;
         byte var11 = 70;
         int var12 = (int)Math.hypot(var7 - var1, var8 - var2) - 70;
         if (var12 > 0) {
            var4 = (70 * var1 + var12 * var7) / (70 + var12);
            var5 = (70 * var2 + var12 * var8) / (70 + var12);
         }
      }

      this.Scene_baseX = var4;
      this.Scene_baseY = var5;
      this.field2929 = var3;
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("gq")
   public void method5569(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.tiles[var4][var5][var6];
      if (var7 != null) {
         SceneTilePaint var8 = var7.paint;
         if (var8 != null) {
            int var18 = var8.rgb * -453092939;
            if (var18 != 0) {
               for (int var19 = 0; var19 < 4; var19++) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }
            }
         } else {
            SceneTileModel var9 = var7.model;
            if (var9 != null) {
               int var10 = var9.shape;
               int var11 = var9.rotation;
               int var12 = var9.underlayRgb;
               int var13 = var9.overlayRgb;
               int[] var14 = tileShape2D[var10];
               int[] var15 = tileRotation2D[var11];
               int var16 = 0;
               if (var12 != 0) {
                  for (int var17 = 0; var17 < 4; var17++) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for (int var26 = 0; var26 < 4; var26++) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("gr")
   public void method5570(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.tiles[var4][var5][var6];
      if (var7 != null) {
         SceneTilePaint var8 = var7.paint;
         if (var8 != null) {
            int var18 = var8.rgb * -453092939;
            if (var18 != 0) {
               for (int var19 = 0; var19 < 4; var19++) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }
            }
         } else {
            SceneTileModel var9 = var7.model;
            if (var9 != null) {
               int var10 = var9.shape;
               int var11 = var9.rotation;
               int var12 = var9.underlayRgb;
               int var13 = var9.overlayRgb;
               int[] var14 = tileShape2D[var10];
               int[] var15 = tileRotation2D[var11];
               int var16 = 0;
               if (var12 != 0) {
                  for (int var17 = 0; var17 < 4; var17++) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for (int var26 = 0; var26 < 4; var26++) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("hi")
   public void method5571(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.tiles[var4][var5][var6];
      if (var7 != null) {
         SceneTilePaint var8 = var7.paint;
         if (var8 != null) {
            int var18 = var8.rgb * -453092939;
            if (var18 != 0) {
               for (int var19 = 0; var19 < 4; var19++) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }
            }
         } else {
            SceneTileModel var9 = var7.model;
            if (var9 != null) {
               int var10 = var9.shape;
               int var11 = var9.rotation;
               int var12 = var9.underlayRgb;
               int var13 = var9.overlayRgb;
               int[] var14 = tileShape2D[var10];
               int[] var15 = tileRotation2D[var11];
               int var16 = 0;
               if (var12 != 0) {
                  for (int var17 = 0; var17 < 4; var17++) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for (int var26 = 0; var26 < 4; var26++) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void init(int var1) {
      this.Scene_offsetOccluder = classSF.method10160(25, 90, var1, -19618711);
      AbstractRasterizer.method5437(this.Scene_offsetOccluder);
      if (this.field2946 != null && this.field2946.length > 0) {
         this.method5614(this.field2946, this.field3011, this.field3007, this.field3009, this.field3004);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hg")
   public void method5574(int var1) {
      this.Scene_offsetOccluder = classSF.method10160(25, 112819592, var1, -19618711);
      AbstractRasterizer.method5437(this.Scene_offsetOccluder);
      if (this.field2946 != null && this.field2946.length > 0) {
         this.method5614(this.field2946, this.field3011, this.field3007, this.field3009, this.field3004);
      }
   }

   public byte[][][] getTileShapes() {
      return this.field3027;
   }

   @ObfuscatedSignature(descriptor = "(Ljn;)V")
   @ObfuscatedName("hx")
   public void method5577(TileRenderMode var1) {
      if (var1 != this.field2944) {
         this.field2944 = var1;
         this.method5614(this.field2946, this.field3011, this.field3007, this.field3009, this.field3004);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("fy")
   public boolean method5753(int var1, int var2, int var3) {
      return (this.field3028[var1][var2][var3] & 4) != 0;
   }

   @ObfuscatedSignature(descriptor = "(ZZ)V")
   @ObfuscatedName("wm")
   public void method5783(boolean var1, boolean var2) {
      this.Scene_drawnCount++;
      this.field2879.method6541(Rasterizer3D.clips.field3431);
      Rasterizer3D.clips.field3431.method6541(this.modelColorOverride);
      if (var1) {
         this.Scene_baseX = -1;
         this.Scene_baseY = -1;
         this.field2929 = -1.0F;
         boolean var3 = this.worldViewId == -1;
         DrawCallbacks var4 = client.field1025;
         if (var4 != null && var3) {
            client.field1000 = 0;
            var4.drawScene(this.field2889, this.field2868, this.field2973, this.field2884, this.field2974, this.Scene_plane);
         }

         int var5 = SecureUrlRequester.client.isGpu() ? field3021 : this.Scene_offsetOccluder;
         int var6 = !var2 && this.field2944 != TileRenderMode.field3137 ? this.Scene_entityX : this.Scene_cameraXTile;
         int var7 = !var2 && this.field2944 != TileRenderMode.field3137 ? this.Scene_entityY : this.Scene_cameraYTile;
         if (var3) {
            this.Scene_cameraXTileMin = Math.max(var6 - var5, this.field3022 + this.field3014);
            this.Scene_cameraYTileMin = Math.max(var7 - var5, this.field3016 + this.field3014);
            this.Scene_cameraXTileMax = Math.min(var6 + var5, this.field3018 + this.field3014);
            this.Scene_cameraYTileMax = Math.min(var7 + var5, this.field3015 + this.field3014);
         } else {
            this.Scene_cameraXTileMin = 0;
            this.Scene_cameraYTileMin = 0;
            this.Scene_cameraXTileMax = this.xSize;
            this.Scene_cameraYTileMax = this.ySize;
            var6 = this.xSize / 2;
            var7 = this.ySize / 2;
            this.Scene_offsetOccluder = Math.max(var6, var7);
         }

         this.field2945 = this.Scene_cameraXTile - var6;
         this.field2940 = this.Scene_cameraYTile - var7;
         this.tileUpdateCount = 0;
         this.method5708();
         boolean var8 = SecureUrlRequester.client.isMenuOpen();
         if (!var8) {
            this.field2882 = this.field3022;
            this.field2883 = this.field3016;
         }

         if ((client.field997 & 16) != 0) {
            boolean var9 = this.field2880 != 0 && this.worldViewId == -1;
            int var10 = var9 ? this.planes - 1 : this.Scene_plane;
            client.field1025
               .preSceneDraw(
                  this,
                  this.field2889,
                  this.field2868,
                  this.field2973,
                  this.field2884,
                  this.field2974,
                  this.minPlane,
                  this.field3023.plane * 2115028565,
                  var10,
                  this.field2916
               );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dg")
   public void method5478() {
      for (int var1 = 0; var1 < this.planes; var1++) {
         for (int var2 = 0; var2 < this.xSize; var2++) {
            for (int var3 = 0; var3 < this.ySize; var3++) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      if (this.Scene_planeOccluderCounts != null) {
         for (int var4 = 0; var4 < this.scenePlanesCount; var4++) {
            for (int var7 = 0; var7 < this.Scene_planeOccluderCounts[var4]; var7++) {
               this.Scene_planeOccluders[var4][var7] = null;
            }

            this.Scene_planeOccluderCounts[var4] = 0;
         }
      }

      if (this.Scene_currentOccluders != null) {
         Arrays.fill(this.Scene_currentOccluders, null);
      }

      this.Scene_currentOccludersCount = 0;

      for (int var5 = 0; var5 < this.tempGameObjectsCount; var5++) {
         this.tempGameObjects[var5] = null;
      }

      this.tempGameObjectsCount = 0;

      for (int var6 = 0; var6 < this.gameObjects.length; var6++) {
         this.gameObjects[var6] = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)J")
   @ObfuscatedName("nl")
   public static long method5541(Scene var0, int var1, int var2, int var3) {
      Tile var4 = var0.tiles[var1][var2][var3];
      return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag * -4972732868916429537L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("pp")
   public void method5807(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      this.addTile(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)J")
   @ObfuscatedName("rs")
   public static long method5544(Scene var0, int var1, int var2, int var3) {
      Tile var4 = var0.tiles[var1][var2][var3];
      return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag * -7524770072208173231L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ex")
   public void method5742(int var1) {
      boolean var2 = this.field2916.add(var1);
      if (var2 && (client.field997 & 16) != 0 && this.field2881 != null) {
         int[] var3 = (int[])this.field2881.get(var1);
         if (var3 != null) {
            for (int var7 : var3) {
               this.method5742(var7);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("kv")
   boolean method5684(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.Scene_currentOccludersCount; var4++) {
         Occluder var5 = this.Scene_currentOccluders[var4];
         if (var5.field3320 * 185187997 == 1) {
            int var6 = var5.maxY * 1482829177 - var1;
            if (var6 > 0) {
               int var7 = var5.minTileX * -1389987515 + (var5.maxTileX * 2026020675 * var6 >> 8);
               int var8 = var5.minZ * 282521569 + (var5.minX * -2059449263 * var6 >> 8);
               int var9 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var6 >> 8);
               int var10 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 2) {
            int var11 = var1 - var5.maxY * 1482829177;
            if (var11 > 0) {
               int var15 = var5.minTileX * -1389987515 + (var5.maxTileX * 2026020675 * var11 >> 8);
               int var19 = var5.minZ * 282521569 + (var5.minX * -2059449263 * var11 >> 8);
               int var23 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var11 >> 8);
               int var27 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var11 >> 8);
               if (var3 >= var15 && var3 <= var19 && var2 >= var23 && var2 <= var27) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 3) {
            int var12 = var5.minTileX * -1389987515 - var3;
            if (var12 > 0) {
               int var16 = var5.maxY * 1482829177 + (var5.maxTileY * 753513109 * var12 >> 8);
               int var20 = var5.field3337 * 602919219 + (var5.type * 965971961 * var12 >> 8);
               int var24 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var12 >> 8);
               int var28 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var12 >> 8);
               if (var1 >= var16 && var1 <= var20 && var2 >= var24 && var2 <= var28) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 4) {
            int var13 = var3 - var5.minTileX * -1389987515;
            if (var13 > 0) {
               int var17 = var5.maxY * 1482829177 + (var5.maxTileY * 753513109 * var13 >> 8);
               int var21 = var5.field3337 * 602919219 + (var5.type * 965971961 * var13 >> 8);
               int var25 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var13 >> 8);
               int var29 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var13 >> 8);
               if (var1 >= var17 && var1 <= var21 && var2 >= var25 && var2 <= var29) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 5) {
            int var14 = var2 - var5.minTileY * 1051489521;
            if (var14 > 0) {
               int var18 = var5.maxY * 1482829177 + (var5.maxTileY * 753513109 * var14 >> 8);
               int var22 = var5.field3337 * 602919219 + (var5.type * 965971961 * var14 >> 8);
               int var26 = var5.minTileX * -1389987515 + (var5.maxTileX * 2026020675 * var14 >> 8);
               int var30 = var5.minZ * 282521569 + (var5.minX * -2059449263 * var14 >> 8);
               if (var1 >= var18 && var1 <= var22 && var3 >= var26 && var3 <= var30) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lka;Lct;Lnet/runelite/api/TileObject;IIIIJ)V")
   @ObfuscatedName("gi")
   public void method5725(Projection var1, DynamicObject var2, TileObject var3, int var4, int var5, int var6, int var7, long var8) {
      int var10 = client.field997 >> 7 & 15;
      if (var10 > 0) {
         var2.method2869();
         rl21.method9555(var3, var2, var4, var5, var6, var7);
      } else {
         Model var11;
         try {
            var11 = var2.method6220();
         } catch (Exception var13) {
            client.field938.debug("exception drawing dynamic game entity", var13);
            return;
         }

         if (var11 != null) {
            var2.setModelHeight(var11.getModelHeight());
            int var12 = var2.getAnimationHeightOffset();
            client.field1025.drawDynamic(-1, var1, this, var3, var2, var11, var4, var5, var6 - var12, var7);
            client.method2474(var1, this.field2918, var11, var4, var5, var6 - var12, var7, var8);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("hc")
   boolean method5584(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.field2960 + var3 * this.field2961 + var4 * this.field2962 + var5, var6);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("hr")
   boolean method5585(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.field2960 + var3 * this.field2961 + var4 * this.field2962 + var5, var6);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void clearTempGameObjects() {
      Arrays.fill(this.field2900, 0);
      Arrays.fill(this.field2901, null);
      Arrays.fill(this.field2902, null);
      Arrays.fill(this.field2903, null);
      Arrays.fill(this.field2904, null);
      Arrays.fill(this.field2905, null);
      Arrays.fill(this.field2906, null);
      Arrays.fill(this.field2887, null);
      Arrays.fill(this.field2907, (byte)0);
      Arrays.fill(this.tempGameObjects, null);
      this.tempGameObjectsCount = 0;
      Arrays.fill(this.gameObjects, null);

      for (int var1 = 0; var1 < this.xSize >> 3; var1++) {
         for (int var2 = 0; var2 < this.ySize >> 3; var2++) {
            rl16 var3 = this.field2912[var1][var2];
            var3.field5566.clear();
            var3.field5567.clear();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ha")
   boolean method5588(int var1, int var2, int var3, int var4) {
      return method5581(this, this.field2958, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lka;ZZ)V")
   @ObfuscatedName("jf")
   void method5655(Projection var1, boolean var2, boolean var3) {
      this.Scene_drawnCount++;
      this.field2879.method6530(Rasterizer3D.clips.field3431);
      Rasterizer3D.clips.field3431.method6530(this.modelColorOverride);
      boolean var4 = this.worldViewId == -1;
      if (var3) {
         this.Scene_baseX = -1;
         this.Scene_baseY = -1;
         this.field2929 = -1.0F;
         this.field2990 = !var2 && this.field2944 != TileRenderMode.field3137 ? this.Scene_entityX : this.Scene_cameraXTile;
         this.field3001 = !var2 && this.field2944 != TileRenderMode.field3137 ? this.Scene_entityY : this.Scene_cameraYTile;
         if (var4) {
            this.Scene_cameraXTileMin = this.field2990 - this.Scene_offsetOccluder;
            if (this.Scene_cameraXTileMin < 0) {
               this.Scene_cameraXTileMin = 0;
            }

            this.Scene_cameraYTileMin = this.field3001 - this.Scene_offsetOccluder;
            if (this.Scene_cameraYTileMin < 0) {
               this.Scene_cameraYTileMin = 0;
            }

            this.Scene_cameraXTileMax = this.field2990 + this.Scene_offsetOccluder;
            if (this.Scene_cameraXTileMax > this.xSize) {
               this.Scene_cameraXTileMax = this.xSize;
            }

            this.Scene_cameraYTileMax = this.field3001 + this.Scene_offsetOccluder;
            if (this.Scene_cameraYTileMax > this.ySize) {
               this.Scene_cameraYTileMax = this.ySize;
            }
         } else {
            this.Scene_cameraXTileMin = 0;
            this.Scene_cameraYTileMin = 0;
            this.Scene_cameraXTileMax = this.xSize;
            this.Scene_cameraYTileMax = this.ySize;
            this.field2990 = this.xSize / 2;
            this.field3001 = this.ySize / 2;
            this.Scene_offsetOccluder = Math.max(this.field2990, this.field3001);
         }

         this.field2945 = this.Scene_cameraXTile - this.field2990;
         this.field2940 = this.Scene_cameraYTile - this.field3001;
         if (var4) {
            this.method5668();
         }
      }

      if (Rasterizer3D.clips.currentFaceAlpha == 0) {
         method5656(this, var1, var4);
      } else {
         this.method5659(var1, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;)Z")
   @ObfuscatedName("ny")
   public boolean method5773(Renderable var1) {
      if (var1 instanceof DynamicObject) {
         DynamicObject var2 = (DynamicObject)var1;
         if (var2.field1196 != -1 && var2.field1199 != Varps.Varps_main[var2.field1196]) {
            var2.method2870();
            return var2.field1208;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("iq")
   boolean method5590(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5583(this.field2958, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("il")
   public boolean method5639() {
      return this.viewportWalking && this.baseX != -1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public void setViewportWalking() {
      for (int var1 = 0; var1 < this.tempGameObjectsCount; var1++) {
         GameObject var2 = this.tempGameObjects[var1];
         this.removeGameObject((net.runelite.api.GameObject)var2);
         var2.method6315(null);
      }

      for (int var3 = 0; var3 < this.field2912.length; var3++) {
         for (int var4 = 0; var4 < this.field2912[0].length; var4++) {
            this.field2912[var3][var4].field5567.clear();
         }
      }

      this.tempGameObjectsCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ho")
   boolean method5593(int var1, int var2, int var3, int var4) {
      return method5581(this, this.field2959, var1, var2, var3, var4);
   }

   public int getRoofRemovalMode() {
      return this.field2880;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIILjz;IJI)Z")
   @ObfuscatedName("pn")
   public boolean method5808(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
      return this.method5502(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fl")
   public void method5524(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.wallDecoration = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("if")
   boolean method5605(int var1, int var2, int var3, int var4) {
      return this.method5599(this.field2921, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ig")
   boolean method5606(int var1, int var2, int var3, int var4) {
      return this.method5599(this.field2921, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("ck")
   boolean method5608(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5603(this.field2921, var1, var2, var3, var4, var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;[IIIII)V")
   @ObfuscatedName("iq")
   public static void method5615(Scene var0, int[] var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.getOverlayIds();
      }

      var0.field2946 = var1;
      var0.field3011 = var2;
      var0.field3007 = var3;
      var0.field3009 = var4;
      var0.field3004 = var5;
      var0.field3010 = 0;
      var0.field3005 = 0;
      var0.field3012 = var4;
      var0.field3006 = var5;
      var0.field3003 = var4 / 2;
      var0.field3002 = var5 / 2;
      var0.field2959.set(0, var0.field2959.size());
      var0.field2956.set(0, var0.field2956.size());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)V")
   @ObfuscatedName("ax")
   public static void method5554(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method5732(var1, var1, var1);
      }

      for (int var4 = 0; var4 < var0.planes; var4++) {
         for (int var5 = 0; var5 < var0.xSize; var5++) {
            for (int var6 = 0; var6 < var0.ySize; var6++) {
               Tile var7 = var0.tiles[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.boundaryObject;
                  if (var8 != null && var8.renderable1 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.renderable1;
                     class144.method3966(var0, var9, var4, var5, var6, 1, 1);
                     if (var8.renderable2 instanceof ModelData) {
                        ModelData var10 = (ModelData)var8.renderable2;
                        class144.method3966(var0, var10, var4, var5, var6, 1, 1);
                        ModelData.method6020(var9, var10, 0, 0, 0, false);
                        var8.renderable2 = ModelData.method6106(var10, var10.ambient, var10.contrast, var1, var2, var3);
                     }

                     var8.renderable1 = ModelData.method6106(var9, var9.ambient, var9.contrast, var1, var2, var3);
                  }

                  for (int var12 = 0; var12 < var7.gameObjectsCount * -1393464713; var12++) {
                     GameObject var14 = var7.gameObjects[var12];
                     if (var14 != null && var14.renderable instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.renderable;
                        class144.method3966(
                           var0,
                           var11,
                           var4,
                           var5,
                           var6,
                           var14.endX * -1438843607 - var14.startX * 1340534914 + 1,
                           var14.endY * -2094327665 - var14.startY * 732690608 + 1
                        );
                        var14.renderable = ModelData.method6106(var11, var11.ambient, var11.contrast, var1, var2, var3);
                     }
                  }

                  FloorDecoration var13 = var7.floorDecoration;
                  if (var13 != null && var13.renderable instanceof ModelData) {
                     ModelData var15 = (ModelData)var13.renderable;
                     var0.method5754(var15, var4, var5, var6);
                     var13.renderable = ModelData.method6106(var15, var15.ambient, var15.contrast, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ip")
   boolean method5610(int var1, int var2, int var3, int var4) {
      return this.method5599(this.field2956, var1, var2, var3, var4);
   }

   public short[][][] getUnderlayIds() {
      return this.field2913;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("it")
   boolean method5611(int var1, int var2, int var3, int var4) {
      return this.method5599(this.field2956, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;Ljz;IIIIJI)V")
   @ObfuscatedName("hw")
   public void method5809(
      int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13
   ) {
      this.newWallDecoration(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13);
   }

   @ObfuscatedSignature(descriptor = "([IIIII)V")
   @ObfuscatedName("iv")
   public void method5616(int[] var1, int var2, int var3, int var4, int var5) {
      this.field2946 = var1;
      this.field3011 = var2;
      this.field3007 = var3;
      this.field3009 = var4;
      this.field3004 = var5;
      this.field3010 = 0;
      this.field3005 = 0;
      this.field3012 = var4;
      this.field3006 = var5;
      this.field3003 = var4 / 2;
      this.field3002 = var5 / 2;
      this.field2959.set(0, this.field2959.size());
      this.field2956.set(0, this.field2956.size());
   }

   @ObfuscatedSignature(descriptor = "(Ljm;IIIII)V")
   @ObfuscatedName("cn")
   public void method5810(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      class144.method3966(this, var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("jt")
   boolean method5671(int var1, int var2, int var3) {
      int var4 = this.field2952[var1][var2][var3];
      if (var4 == -this.Scene_drawnCount) {
         return false;
      } else if (var4 == this.Scene_drawnCount) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method5683(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1)
            && this.method5683(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1)
            && this.method5683(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
            && this.method5683(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2952[var1][var2][var3] = this.Scene_drawnCount;
            return true;
         } else {
            this.field2952[var1][var2][var3] = -this.Scene_drawnCount;
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("iz")
   boolean method5620(int var1, int var2) {
      if (!this.method5591(this.field3008, this.field3013, var1, var2)) {
         return class623.method12415(this, this.field3008, this.field3013, var1, var2);
      } else {
         this.method5596(this.field3008, this.field3013, var1, var2, false);
         boolean var3 = false;

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (this.method5623(this.field3008, this.field3013, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008, (this.field3013 + 1) % 1381779978, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008 + 1, this.field3013, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008 + 1, (this.field3013 + 1) % 31, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.method5589(this.field3008, this.field3013, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("iw")
   boolean method5621(int var1, int var2) {
      if (!this.method5591(this.field3008, this.field3013, var1, var2)) {
         return class623.method12415(this, this.field3008, this.field3013, var1, var2);
      } else {
         this.method5596(this.field3008, this.field3013, var1, var2, false);
         boolean var3 = false;

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (this.method5623(this.field3008, this.field3013, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008, (this.field3013 + 1) % 711462614, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008 + 1, this.field3013, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5623(this.field3008 + 1, (this.field3013 + 1) % 242766889, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.method5589(this.field3008, this.field3013, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("id")
   boolean method5624(int var1, int var2, int var3, int var4) {
      if (!this.method5609(var1, var2, var3, var4)) {
         return this.method5604(var1, var2, var3, var4);
      } else {
         this.method5612(var1, var2, var3, var4, false);
         int var5 = var1 * 32 + 128;
         int var6 = var2 * 64;
         int var7 = (var3 - this.Scene_offsetOccluder - this.field2945 - 1) * 128;
         int var8 = (var4 - this.Scene_offsetOccluder - this.field2940 - 1) * 128;

         for (int var9 = -this.field3011; var9 <= this.field3007; var9 += 128) {
            if (this.method5627(var7, this.field2946[var1] + var9, var8, var5, var6)) {
               return this.method5607(var1, var2, var3, var4, true);
            }
         }

         return this.method5607(var1, var2, var3, var4, false);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kp")
   @Override
   void vmethod232(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      TransformationMatrix var15 = SecureUrlRequester.method3893(1598958732);
      class456 var16 = BuddyRankComparator.method3976(-814754263);
      var16.field5516.method9303(class6.method119(var1, 45184143), 0.0F, 0.0F, -1574760321);
      var16.field5515.method9868(var4, var5, var6, 93305287);
      class456 var17 = BuddyRankComparator.method3976(-814754263);
      var17.field5515.method9868(-(this.xSize * 64) - this.field2923, this.field2924, -(this.ySize * 64) - this.field2925, 1382719545);
      TransformationMatrix var18 = SecureUrlRequester.method3893(-1788056051);
      var18.method10017(var17, (byte)121);
      var15.method9987(1.0F, this.Scene_scale, 1.0F, 1.0F, -2128275466);
      TransformationMatrix.method9959(var18, var15, (byte)-21);
      TransformationMatrix.method9959(var18, this.field2922, (byte)-77);
      var15.method10017(var16, (byte)80);
      TransformationMatrix.method9959(var18, var15, (byte)-123);
      TransformationMatrix.method10012(var15, var18, -1531552741);
      var15.method9982(507814016);
      this.Scene_cameraX = (int)var15.method9995(var7, var8, var9, -2109506967);
      this.Scene_cameraY = (int)var15.method9996(var7, var8, var9, (byte)-112);
      this.Scene_cameraZ = (int)var15.method9997(var7, var8, var9, (short)1603);
      this.Scene_cameraXTile = this.Scene_cameraX / 128;
      this.Scene_cameraYTile = this.Scene_cameraZ / 128;
      this.Scene_entityX = (int)var15.method9995(var12, 0.0F, var13, -2033824652) / 128;
      this.Scene_entityY = (int)var15.method9997(var12, 0.0F, var13, (short)1603) / 128;
      class463 var19 = new class463();
      TransformationMatrix var20 = SecureUrlRequester.method3893(-577702046);
      class463.method9764(var19, class6.method119(-var2, -466028636), -1314816461);
      var19.method9766(class6.method119(-var3, 662909154), -1739121717);
      var19.method9775(var7, var8, var9, 550736431);
      var20.method9972(var19, (byte)99);
      var20.method9982(1350006310);
      var16.method9422((short)6611);
      var17.method9422((short)12979);
      TransformationMatrix.method9929(var15, (byte)1);
      TransformationMatrix.method9959(var18, var20, (byte)-46);
      FloatProjection var21 = new FloatProjection(var18);
      var21.method6009(var10);
      ModelData0.method6707((byte)-56);
      this.projectScene(var21, var14, Rasterizer3D.clips.currentFaceAlpha != 1);
      ModelData0.method6707((byte)-119);
      TransformationMatrix.method9929(var20, (byte)1);
      TransformationMatrix.method9929(var18, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ze")
   public void method5760() {
      for (int var1 = 0; var1 < this.planes; var1++) {
         for (int var2 = this.field3014; var2 < this.xSize - this.field3014; var2++) {
            for (int var3 = this.field3014; var3 < this.ySize - this.field3014; var3++) {
               rl8 var4 = this.field3030[var1][var2 - this.field3014][var3 - this.field3014];
               if (var4 != null) {
                  this.method5714(var4);
                  if (var4.method9620() != null) {
                     this.method5714(var4.method9620());
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pw")
   public static void method5492(int var0) {
      WorldView var1 = Occluder.topLevelWorldView;
      Scene var2 = var1.scene;
      if (var2.field2915.get(var0)) {
         var2.method5703();
      }

      for (int var3 = 0; var3 < var1.field1314.method10506(); var3++) {
         WorldEntity var4 = (WorldEntity)class340.method7830(var1.worldEntities, class499.method10906(var1.field1314, var3));
         var4.worldView.scene.method5703();
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ie")
   public void method5630(boolean var1) {
      if (!WidgetDefinition.method7971(this) || var1) {
         this.checkClick = true;
         this.viewportWalking = var1;
         this.baseX = -1;
         this.baseY = -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lku;")
   @ObfuscatedName("fe")
   public BoundaryObject method5532(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.boundaryObject;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ic")
   public void method5633(int var1, int var2, int var3) {
      this.Scene_selectedPlane = var1;
      this.Scene_selectedScreenX = var2;
      this.Scene_selectedScreenY = var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ia")
   public void method5635() {
      this.viewportWalking = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)V")
   @ObfuscatedName("bc")
   public static void method5529(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method5555(var1, var1, var1);
      } else {
         Tile var4 = var0.tiles[var1][var2][var3];
         if (var4 != null) {
            var4.itemLayer = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bx")
   public void method5771(int var1) {
      int var2 = (var1 << 1) + 1;
      var2 = this.field2911[var2];
      var2 <<= 1;
      int var5 = var1 << 1;
      this.field2911[var2] = this.field2911[var5];
      var2 = var1 << 1;
      var2 = this.field2911[var2];
      var2 = (var2 << 1) + 1;
      int var9 = (var1 << 1) + 1;
      this.field2911[var2] = this.field2911[var9];
      var2 = (var1 << 1) + 1;
      int var11 = this.field2898;
      int var12 = (var11 << 1) + 1;
      this.field2911[var2] = this.field2911[var12];
      var2 = var1 << 1;
      this.field2911[var2] = this.field2898;
      var2 = (var1 << 1) + 1;
      var2 = this.field2911[var2];
      var2 <<= 1;
      this.field2911[var2] = var1;
      var2 = var1 << 1;
      var2 = this.field2911[var2];
      var2 = (var2 << 1) + 1;
      this.field2911[var2] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("im")
   public void method5636() {
      this.viewportWalking = true;
   }

   @ObfuscatedSignature(descriptor = "(ILrl16;Lky;)V")
   @ObfuscatedName("mb")
   public void method5704(int var1, rl16 var2, Model var3) {
      var3.calculateBoundsCylinder();
      int var4 = var1 - var3.height * -1272589951;
      int var5 = var1 + var3.boundsType;
      if (var4 < var2.field5569) {
         var2.field5569 = var4;
      }

      if (var5 > var2.field5571) {
         var2.field5571 = var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;III)Z")
   @ObfuscatedName("iy")
   public static boolean method5672(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method5674(var1, var1, var1);
      }

      int var4 = var0.field2952[var1][var2][var3];
      if (var4 == -var0.Scene_drawnCount) {
         return false;
      } else if (var4 == var0.Scene_drawnCount) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (var0.method5683(var5 + 1, var0.tileHeights[var1][var2][var3], var6 + 1)
            && var0.method5683(var5 + 128 - 1, var0.tileHeights[var1][var2 + 1][var3], var6 + 1)
            && var0.method5683(var5 + 128 - 1, var0.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
            && var0.method5683(var5 + 1, var0.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
            var0.field2952[var1][var2][var3] = var0.Scene_drawnCount;
            return true;
         } else {
            var0.field2952[var1][var2][var3] = -var0.Scene_drawnCount;
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Lka;Ljw;Z)V")
   @ObfuscatedName("va")
   public static void method5664(Scene var0, Projection var1, Tile var2, boolean var3) {
      var0.Scene_tilesDeque.addFirst(var2);

      label640:
      while (true) {
         Tile var4;
         int var5;
         int var6;
         int var7;
         int var8;
         Tile[][] var9;
         while (true) {
            var4 = (Tile)var0.Scene_tilesDeque.removeLast();
            if (var4 == null) {
               return;
            }

            if (var4.drawSecondary) {
               var5 = var4.x * 1738768469;
               var6 = var4.y * -720501671;
               var7 = var4.plane * -2018428603;
               var8 = var4.originalPlane * 1233217895;
               var9 = var0.tiles[var7];
               if (!var4.drawPrimary) {
                  break;
               }

               if (var3) {
                  if (var7 > 0) {
                     Tile var10 = var0.tiles[var7 - 1][var5][var6];
                     if (var10 != null && var10.drawSecondary) {
                        continue;
                     }
                  }

                  if (var5 <= var0.Scene_cameraXTile && var5 > var0.Scene_cameraXTileMin) {
                     Tile var21 = var9[var5 - 1][var6];
                     if (var21 != null && var21.drawSecondary && (var21.drawPrimary || (var4.gameObjectsEdgeMask * -1791004926 & 1) == 0)) {
                        continue;
                     }
                  }

                  if (var5 >= var0.Scene_cameraXTile && var5 < var0.Scene_cameraXTileMax - 1) {
                     Tile var22 = var9[var5 + 1][var6];
                     if (var22 != null && var22.drawSecondary && (var22.drawPrimary || (var4.gameObjectsEdgeMask * -988791017 & 4) == 0)) {
                        continue;
                     }
                  }

                  if (var6 <= var0.Scene_cameraYTile && var6 > var0.Scene_cameraYTileMin) {
                     Tile var23 = var9[var5][var6 - 1];
                     if (var23 != null && var23.drawSecondary && (var23.drawPrimary || (var4.gameObjectsEdgeMask * -1022731850 & 8) == 0)) {
                        continue;
                     }
                  }

                  if (var6 >= var0.Scene_cameraYTile && var6 < var0.Scene_cameraYTileMax - 1) {
                     Tile var24 = var9[var5][var6 + 1];
                     if (var24 != null && var24.drawSecondary && (var24.drawPrimary || (var4.gameObjectsEdgeMask * -776991163 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var3 = true;
               }

               var4.drawPrimary = false;
               if (var4.linkedBelowTile != null) {
                  Tile var25 = var4.linkedBelowTile;
                  if (var25.paint != null) {
                     if (!method5672(var0, 0, var5, var6)) {
                        var1.drawTileUnderlay(var0, var25.paint, 0, var5, var6, -436402298);
                     }
                  } else if (var25.model != null && !method5672(var0, 0, var5, var6)) {
                     var1.drawTileOverlay(var0, var25.model, var5, var6, -656009185);
                  }

                  BoundaryObject var11 = var25.boundaryObject;
                  if (var11 != null) {
                     var1.draw(var11.renderable1, 0, var11.x * -1937046859, var11.z * 2073541161, var11.y * -1939472849, var11.tag * -4972732868916429537L);
                  }

                  for (int var12 = 0; var12 < var25.gameObjectsCount * 1819271130; var12++) {
                     GameObject var13 = var25.gameObjects[var12];
                     if (var13 != null) {
                        var1.draw(
                           var13.renderable,
                           var13.orientation * 1442937536,
                           var13.centerX * 1204024827,
                           var13.z * 683703035,
                           var13.centerY * 1465977803,
                           var13.tag * 1608625415500949283L
                        );
                     }
                  }
               }

               boolean var26 = false;
               if (var4.paint != null) {
                  if (!method5672(var0, var8, var5, var6)) {
                     var26 = true;
                     if (var4.paint.neColor * -120051743 != 12345678 || var7 <= var0.Scene_selectedPlane) {
                        var1.drawTileUnderlay(var0, var4.paint, var8, var5, var6, -436402298);
                     }
                  }
               } else if (var4.model != null && !method5672(var0, var8, var5, var6)) {
                  var26 = true;
                  var1.drawTileOverlay(var0, var4.model, var5, var6, -656009185);
               }

               int var34 = 0;
               int var44 = 0;
               BoundaryObject var49 = var4.boundaryObject;
               WallDecoration var14 = var4.wallDecoration;
               if (var49 != null || var14 != null) {
                  if (var0.Scene_cameraXTile == var5) {
                     var34++;
                  } else if (var0.Scene_cameraXTile < var5) {
                     var34 += 2;
                  }

                  if (var0.Scene_cameraYTile == var6) {
                     var34 += 3;
                  } else if (var0.Scene_cameraYTile > var6) {
                     var34 += 6;
                  }

                  var44 = field2863[var34];
                  var4.field3223 = field2870[var34] * 1706054849;
               }

               if (var49 != null) {
                  if ((var49.orientationA * -666272519 & field2877[var34]) != 0) {
                     if (var49.orientationA * -540038205 == 16) {
                        var4.drawGameObjectEdges = 1766637505;
                        var4.field3222 = field2871[var34] * 1441954766;
                        var4.field3220 = 1364184585 - var4.field3222 * -654700737;
                     } else if (var49.orientationA * -666272519 == 972824145) {
                        var4.drawGameObjectEdges = -761692286;
                        var4.field3222 = field2876[var34] * -1731848111;
                        var4.field3220 = -1322165150 - var4.field3222 * -103252079;
                     } else if (var49.orientationA * -666272519 == 802131914) {
                        var4.drawGameObjectEdges = -1523384572;
                        var4.field3222 = field2873[var34] * 604634695;
                        var4.field3220 = 1650636996 - var4.field3222 * 724146245;
                     } else {
                        var4.drawGameObjectEdges = 1004945219;
                        var4.field3222 = field2872[var34] * -1344466549;
                        var4.field3220 = -458240151 - var4.field3222 * -103252079;
                     }
                  } else {
                     var4.drawGameObjectEdges = 0;
                  }

                  if ((var49.orientationA * 97455792 & var44) != 0 && !var0.method5675(var8, var5, var6, var49.orientationA * -478444932)) {
                     var1.draw(var49.renderable1, 0, var49.x * -2076906303, var49.z * -639627959, var49.y * 546730723, var49.tag * -4972732868916429537L);
                  }

                  if ((var49.orientationB * -8217860 & var44) != 0 && !var0.method5675(var8, var5, var6, var49.orientationB * -211200105)) {
                     var1.draw(var49.renderable2, 0, var49.x * 911320362, var49.z * -1912869971, var49.y * -1698790301, var49.tag * -4972732868916429537L);
                  }
               }

               if (var14 != null && !var0.method5678(var8, var5, var6, var14.renderable1.height * 533053570)) {
                  if ((var14.orientation * 173770262 & var44) != 0) {
                     var1.draw(
                        var14.renderable1,
                        0,
                        var14.x * 2116993376 + var14.xOffset * 1501441925,
                        var14.z * 350364234,
                        var14.y * 1215145581 + var14.field3298 * 1799251127,
                        var14.tag * -7524770072208173231L
                     );
                  } else if (var14.orientation * 1327001075 == 256) {
                     int var15 = var14.x * -52811655 - var0.Scene_cameraX;
                     int var16 = var14.y * 985526665 - var0.Scene_cameraZ;
                     int var17 = var14.orientation2 * -1475596409;
                     int var18;
                     if (var17 != 1 && var17 != 2) {
                        var18 = var15;
                     } else {
                        var18 = -var15;
                     }

                     int var19;
                     if (var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if (var19 < var18) {
                        var1.draw(
                           var14.renderable1,
                           0,
                           var14.x * 1588386438 + var14.xOffset * 1501441925,
                           var14.z * 121856729,
                           var14.y * -1726511614 + var14.field3298 * 1799251127,
                           var14.tag * -7524770072208173231L
                        );
                     } else if (var14.renderable2 != null) {
                        var1.draw(var14.renderable2, 0, var14.x * -682745183, var14.z * 121856729, var14.y * 1215145581, var14.tag * -7524770072208173231L);
                     }
                  }
               }

               if (var26) {
                  FloorDecoration var58 = var4.floorDecoration;
                  if (var58 != null) {
                     var1.draw(var58.renderable, 0, var58.x * 823917208, var58.z * -578738777, var58.y * -385906522, var58.tag);
                  }

                  ItemLayer var65 = var4.itemLayer;
                  if (var65 != null && var65.height * 2067113767 == 0) {
                     if (var65.first != null) {
                        var1.draw(var65.first, 0, var65.x * -1625205487, var65.z * -90686671, var65.y * -162090531, var65.tag);
                     }

                     if (var65.second != null) {
                        var1.draw(var65.second, 0, var65.x * -1706948791, var65.z * -90686671, var65.y * -1856622019, var65.tag);
                     }

                     if (var65.third != null) {
                        var1.draw(var65.third, 0, var65.x * -2127486170, var65.z * -90686671, var65.y * -614514829, var65.tag);
                     }
                  }
               }

               int var59 = var4.gameObjectsEdgeMask * 1751027507;
               if (var59 != 0) {
                  if (var5 < var0.Scene_cameraXTile && var5 >= var0.Scene_cameraXTileMin && var5 < var0.Scene_cameraXTileMax - 1 && (var59 & 4) != 0) {
                     Tile var66 = var9[var5 + 1][var6];
                     if (var66 != null && var66.drawSecondary) {
                        var0.Scene_tilesDeque.addFirst(var66);
                     }
                  }

                  if (var6 < var0.Scene_cameraYTile && var6 >= var0.Scene_cameraYTileMin && var6 < var0.Scene_cameraYTileMax - 1 && (var59 & 2) != 0) {
                     Tile var67 = var9[var5][var6 + 1];
                     if (var67 != null && var67.drawSecondary) {
                        var0.Scene_tilesDeque.addFirst(var67);
                     }
                  }

                  if (var5 > var0.Scene_cameraXTile && var5 > var0.Scene_cameraXTileMin && var5 < var0.Scene_cameraXTileMax && (var59 & 1) != 0) {
                     Tile var68 = var9[var5 - 1][var6];
                     if (var68 != null && var68.drawSecondary) {
                        var0.Scene_tilesDeque.addFirst(var68);
                     }
                  }

                  if (var6 > var0.Scene_cameraYTile && var6 > var0.Scene_cameraYTileMin && var6 < var0.Scene_cameraYTileMax && (var59 & 8) != 0) {
                     Tile var69 = var9[var5][var6 - 1];
                     if (var69 != null && var69.drawSecondary) {
                        var0.Scene_tilesDeque.addFirst(var69);
                     }
                  }
               }
               break;
            }
         }

         if (var4.drawGameObjectEdges * 403042499 != 0) {
            boolean var27 = true;

            for (int var35 = 0; var35 < var4.gameObjectsCount * -359776966; var35++) {
               if (var4.gameObjects[var35].lastDrawn * -758998996 != var0.Scene_drawnCount
                  && (var4.gameObjectEdgeMasks[var35] & var4.drawGameObjectEdges * 2087388349) == var4.field3222 * -1047327197) {
                  var27 = false;
                  break;
               }
            }

            if (var27) {
               BoundaryObject var36 = var4.boundaryObject;
               if (!var0.method5675(var8, var5, var6, var36.orientationA * -666272519)) {
                  var1.draw(var36.renderable1, 0, var36.x * -664557557, var36.z * -1643850185, var36.y * 546730723, var36.tag * -4972732868916429537L);
               }

               var4.drawGameObjectEdges = 0;
            }
         }

         if (var4.drawGameObjects) {
            try {
               int var28 = var4.gameObjectsCount * -350333481;
               var4.drawGameObjects = false;
               int var37 = 0;

               label588:
               for (int var45 = 0; var45 < var28; var45++) {
                  GameObject var50 = var4.gameObjects[var45];
                  if (var50.lastDrawn * 554713242 != var0.Scene_drawnCount) {
                     for (int var53 = var50.startX * 1666005069; var53 <= var50.endX * 1553138359; var53++) {
                        for (int var60 = var50.startY * 1122792639; var60 <= var50.endY * 155417980; var60++) {
                           Tile var70 = var9[var53][var60];
                           if (var70.drawPrimary) {
                              var4.drawGameObjects = true;
                              continue label588;
                           }

                           if (var70.drawGameObjectEdges * 403042499 != 0) {
                              int var75 = 0;
                              if (var53 > var50.startX * 1666005069) {
                                 var75++;
                              }

                              if (var53 < var50.endX * 164590956) {
                                 var75 += 4;
                              }

                              if (var60 > var50.startY * -1797635624) {
                                 var75 += 8;
                              }

                              if (var60 < var50.endY * 1374853489) {
                                 var75 += 2;
                              }

                              if ((var75 & var70.drawGameObjectEdges * 403042499) == var4.field3220 * -799869417) {
                                 var4.drawGameObjects = true;
                                 continue label588;
                              }
                           }
                        }
                     }

                     var0.gameObjects[var37++] = var50;
                     int var54 = var0.Scene_cameraXTile - var50.startX * 1666005069;
                     int var61 = var50.endX * -478627854 - var0.Scene_cameraXTile;
                     if (var61 > var54) {
                        var54 = var61;
                     }

                     int var71 = var0.Scene_cameraYTile - var50.startY * 1892556714;
                     int var76 = var50.endY * -2094327665 - var0.Scene_cameraYTile;
                     if (var76 > var71) {
                        var50.field3278 = (var54 + var76) * 2049269999;
                     } else {
                        var50.field3278 = (var54 + var71) * 2049269999;
                     }
                  }
               }

               while (true) {
                  int var46 = -50;
                  int var51 = -1;

                  for (int var55 = 0; var55 < var37; var55++) {
                     GameObject var62 = var0.gameObjects[var55];
                     if (var62.lastDrawn * -1887540232 != var0.Scene_drawnCount) {
                        if (var62.field3278 * 186764815 > var46) {
                           var46 = var62.field3278 * -285537056;
                           var51 = var55;
                        } else if (var62.field3278 * 186764815 == var46) {
                           int var72 = var62.centerX * -1705197570 - var0.Scene_cameraX;
                           int var77 = var62.centerY * -1924718831 - var0.Scene_cameraZ;
                           int var79 = var0.gameObjects[var51].centerX * 1922501 - var0.Scene_cameraX;
                           int var80 = var0.gameObjects[var51].centerY * 1465977803 - var0.Scene_cameraZ;
                           if (var72 * var72 + var77 * var77 > var79 * var79 + var80 * var80) {
                              var51 = var55;
                           }
                        }
                     }
                  }

                  if (var51 == -1) {
                     if (var4.drawGameObjects) {
                        continue label640;
                     }
                     break;
                  }

                  GameObject var56 = var0.gameObjects[var51];
                  var56.lastDrawn = var0.Scene_drawnCount * -230921571;
                  if (!var0.method5679(
                     var8,
                     var56.startX * 1496299597,
                     var56.endX * 1553138359,
                     var56.startY * 889015863,
                     var56.endY * 2027737181,
                     var56.renderable.height * -1272589951
                  )) {
                     var1.draw(
                        var56.renderable,
                        var56.orientation * 46801735,
                        var56.centerX * 1204024827,
                        var56.z * 683703035,
                        var56.centerY * -1393254634,
                        var56.tag * 1608625415500949283L
                     );
                  }

                  for (int var63 = var56.startX * 835731408; var63 <= var56.endX * -14405738; var63++) {
                     for (int var73 = var56.startY * 889015863; var73 <= var56.endY * -2094327665; var73++) {
                        Tile var78 = var9[var63][var73];
                        if (var78.drawGameObjectEdges * 403042499 != 0) {
                           var0.Scene_tilesDeque.addFirst(var78);
                        } else if ((var63 != var5 || var73 != var6) && var78.drawSecondary) {
                           var0.Scene_tilesDeque.addFirst(var78);
                        }
                     }
                  }
               }
            } catch (Exception var20) {
               var4.drawGameObjects = false;
            }
         }

         if (var4.drawSecondary && var4.drawGameObjectEdges * -2017297194 == 0) {
            if (var5 <= var0.Scene_cameraXTile && var5 > var0.Scene_cameraXTileMin) {
               Tile var29 = var9[var5 - 1][var6];
               if (var29 != null && var29.drawSecondary) {
                  continue;
               }
            }

            if (var5 >= var0.Scene_cameraXTile && var5 < var0.Scene_cameraXTileMax - 1) {
               Tile var30 = var9[var5 + 1][var6];
               if (var30 != null && var30.drawSecondary) {
                  continue;
               }
            }

            if (var6 <= var0.Scene_cameraYTile && var6 > var0.Scene_cameraYTileMin) {
               Tile var31 = var9[var5][var6 - 1];
               if (var31 != null && var31.drawSecondary) {
                  continue;
               }
            }

            if (var6 >= var0.Scene_cameraYTile && var6 < var0.Scene_cameraYTileMax - 1) {
               Tile var32 = var9[var5][var6 + 1];
               if (var32 != null && var32.drawSecondary) {
                  continue;
               }
            }

            var4.drawSecondary = false;
            var0.tileUpdateCount--;
            ItemLayer var33 = var4.itemLayer;
            if (var33 != null && var33.height * 2067113767 != 0) {
               if (var33.first != null) {
                  var1.draw(var33.first, 0, var33.x * -1625205487, var33.z * -90686671 - var33.height * 2067113767, var33.y * -162090531, var33.tag);
               }

               if (var33.second != null) {
                  var1.draw(var33.second, 0, var33.x * -1625205487, var33.z * -655735234 - var33.height * 2067113767, var33.y * -162090531, var33.tag);
               }

               if (var33.third != null) {
                  var1.draw(var33.third, 0, var33.x * -1625205487, var33.z * -90686671 - var33.height * 298683626, var33.y * -1760022866, var33.tag);
               }
            }

            if (var4.field3223 * -1145227221 != 0) {
               WallDecoration var38 = var4.wallDecoration;
               if (var38 != null && !var0.method5678(var8, var5, var6, var38.renderable1.height * -1272589951)) {
                  if ((var38.orientation * 1721974281 & var4.field3223 * 1129050639) != 0) {
                     var1.draw(
                        var38.renderable1,
                        0,
                        var38.x * -682745183 + var38.xOffset * 1501441925,
                        var38.z * 121856729,
                        var38.y * 1215145581 + var38.field3298 * 1799251127,
                        var38.tag * -7524770072208173231L
                     );
                  } else if (var38.orientation * -1914117005 == 256) {
                     int var47 = var38.x * -682745183 - var0.Scene_cameraX;
                     int var52 = var38.y * 1189615958 - var0.Scene_cameraZ;
                     int var57 = var38.orientation2 * 1594637867;
                     int var64;
                     if (var57 != 1 && var57 != 2) {
                        var64 = var47;
                     } else {
                        var64 = -var47;
                     }

                     int var74;
                     if (var57 != 2 && var57 != 3) {
                        var74 = var52;
                     } else {
                        var74 = -var52;
                     }

                     if (var74 >= var64) {
                        var1.draw(
                           var38.renderable1,
                           0,
                           var38.x * -682745183 + var38.xOffset * 1107394559,
                           var38.z * 121856729,
                           var38.y * 1215145581 + var38.field3298 * 2008100035,
                           var38.tag * -7524770072208173231L
                        );
                     } else if (var38.renderable2 != null) {
                        var1.draw(var38.renderable2, 0, var38.x * -682745183, var38.z * 121856729, var38.y * -1680869617, var38.tag * -7524770072208173231L);
                     }
                  }
               }

               BoundaryObject var48 = var4.boundaryObject;
               if (var48 != null) {
                  if ((var48.orientationB * -1895254858 & var4.field3223 * 1914165352) != 0
                     && !var0.method5675(var8, var5, var6, var48.orientationB * 1187610208)) {
                     var1.draw(var48.renderable2, 0, var48.x * 696906194, var48.z * 854705185, var48.y * 546730723, var48.tag * -4972732868916429537L);
                  }

                  if ((var48.orientationA * -666272519 & var4.field3223 * -412138687) != 0
                     && !var0.method5675(var8, var5, var6, var48.orientationA * -666272519)) {
                     var1.draw(var48.renderable1, 0, var48.x * -1937046859, var48.z * -1912869971, var48.y * 546730723, var48.tag * -4972732868916429537L);
                  }
               }
            }

            if (var7 < var0.planes - 1) {
               Tile var39 = var0.tiles[var7 + 1][var5][var6];
               if (var39 != null && var39.drawSecondary) {
                  var0.Scene_tilesDeque.addFirst(var39);
               }
            }

            if (var5 < var0.Scene_cameraXTile && var5 >= var0.Scene_cameraXTileMin && var5 < var0.Scene_cameraXTileMax - 1) {
               Tile var40 = var9[var5 + 1][var6];
               if (var40 != null && var40.drawSecondary) {
                  var0.Scene_tilesDeque.addFirst(var40);
               }
            }

            if (var6 < var0.Scene_cameraYTile && var6 >= var0.Scene_cameraYTileMin && var6 < var0.Scene_cameraYTileMax - 1) {
               Tile var41 = var9[var5][var6 + 1];
               if (var41 != null && var41.drawSecondary) {
                  var0.Scene_tilesDeque.addFirst(var41);
               }
            }

            if (var5 > var0.Scene_cameraXTile && var5 > var0.Scene_cameraXTileMin && var5 < var0.Scene_cameraXTileMax) {
               Tile var42 = var9[var5 - 1][var6];
               if (var42 != null && var42.drawSecondary) {
                  var0.Scene_tilesDeque.addFirst(var42);
               }
            }

            if (var6 > var0.Scene_cameraYTile && var6 > var0.Scene_cameraYTileMin && var6 < var0.Scene_cameraYTileMax) {
               Tile var43 = var9[var5][var6 - 1];
               if (var43 != null && var43.drawSecondary) {
                  var0.Scene_tilesDeque.addFirst(var43);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljn;)V")
   @ObfuscatedName("hn")
   public void method5578(TileRenderMode var1) {
      if (var1 != this.field2944) {
         this.field2944 = var1;
         this.method5614(this.field2946, this.field3011, this.field3007, this.field3009, this.field3004);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cl")
   void processWalkClick() {
      if (this.checkClick) {
         this.checkClick = false;
         this.baseX = this.Scene_baseX;
         this.baseY = this.Scene_baseY;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("xc")
   public static boolean method5811(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return containsBounds(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jp")
   void method5643() {
      if (this.checkClick) {
         this.checkClick = false;
         this.baseX = this.Scene_baseX;
         this.baseY = this.Scene_baseY;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hn")
   public int method5721(int var1) {
      return this.field2900[var1] >> 20 & 15;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jd")
   public void method5645() {
      this.baseX = -1;
      this.viewportWalking = false;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("jo")
   public void method5649(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.xSize * 128) {
         var1 = this.xSize * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ySize * 128) {
         var3 = this.ySize * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.field2970 = Rasterizer3D.field3038[var4];
      this.field2969 = Rasterizer3D.field3037[var4];
      this.field2972 = Rasterizer3D.field3038[var5];
      this.field2971 = Rasterizer3D.field3037[var5];
      method5618(this, (var4 - 128) / 32, var5 / 64);
      this.Scene_cameraX = var1;
      this.Scene_cameraY = var2;
      this.Scene_cameraZ = var3;
      this.Scene_cameraXTile = var1 / 128;
      this.Scene_cameraYTile = var3 / 128;
      this.Scene_entityX = var7 / 128;
      this.Scene_entityY = var8 / 128;
      this.Scene_plane = var6;
      IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
      if (Rasterizer3D.method5869()) {
         Rasterizer3D.clips.currentFaceAlpha = 0;
         this.projectScene(var10, var9, true);
         Rasterizer3D.clips.currentFaceAlpha = 1;
         this.projectScene(var10, var9, false);
         Rasterizer3D.clips.currentFaceAlpha = 2;
      } else {
         Rasterizer3D.clips.currentFaceAlpha = 2;
         this.projectScene(var10, var9, true);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hy")
   public void method5768(int var1) {
      this.field2900[var1] = 0;
      this.field2901[var1] = null;
      this.field2902[var1] = null;
      this.field2903[var1] = null;
      this.field2904[var1] = null;
      this.field2905[var1] = null;
      this.field2906[var1] = null;
      this.field2907[var1] = 0;

      for (int var2 = 0; var2 < 5; var2++) {
         this.field2887[var1 * 5 + var2] = null;
         this.field2908[var1 * 5 + var2] = 0;
      }

      this.field2909[var1] = 0;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bc")
   int method5567(int var1, int var2, int var3) {
      return (
            this.tileHeights[var1][var2][var3]
               + this.tileHeights[var1][var2 + 1][var3]
               + this.tileHeights[var1][var2][var3 + 1]
               + this.tileHeights[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("jn")
   public void method5650(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.xSize * 128) {
         var1 = this.xSize * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ySize * 128) {
         var3 = this.ySize * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.field2970 = Rasterizer3D.field3038[var4];
      this.field2969 = Rasterizer3D.field3037[var4];
      this.field2972 = Rasterizer3D.field3038[var5];
      this.field2971 = Rasterizer3D.field3037[var5];
      method5618(this, (var4 - 128) / 32, var5 / 64);
      this.Scene_cameraX = var1;
      this.Scene_cameraY = var2;
      this.Scene_cameraZ = var3;
      this.Scene_cameraXTile = var1 / 128;
      this.Scene_cameraYTile = var3 / 128;
      this.Scene_entityX = var7 / 128;
      this.Scene_entityY = var8 / 128;
      this.Scene_plane = var6;
      IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
      if (Rasterizer3D.method5869()) {
         Rasterizer3D.clips.currentFaceAlpha = 0;
         this.projectScene(var10, var9, true);
         Rasterizer3D.clips.currentFaceAlpha = 1;
         this.projectScene(var10, var9, false);
         Rasterizer3D.clips.currentFaceAlpha = 2;
      } else {
         Rasterizer3D.clips.currentFaceAlpha = 2;
         this.projectScene(var10, var9, true);
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)V")
   @ObfuscatedName("em")
   public void method5812(int[] var1, int var2, int var3, int var4, int var5) {
      this.method5614(var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("jb")
   public void method5651(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.xSize * 128) {
         var1 = this.xSize * 31425456 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ySize * 128) {
         var3 = this.ySize * 1997014702 - 1;
      }

      if (var4 < 1127050034) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.field2970 = Rasterizer3D.field3038[var4];
      this.field2969 = Rasterizer3D.field3037[var4];
      this.field2972 = Rasterizer3D.field3038[var5];
      this.field2971 = Rasterizer3D.field3037[var5];
      method5618(this, (var4 - 1957944641) / 32, var5 / 64);
      this.Scene_cameraX = var1;
      this.Scene_cameraY = var2;
      this.Scene_cameraZ = var3;
      this.Scene_cameraXTile = var1 / -1151898567;
      this.Scene_cameraYTile = var3 / -322965114;
      this.Scene_entityX = var7 / 128;
      this.Scene_entityY = var8 / 1647631376;
      this.Scene_plane = var6;
      IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
      if (Rasterizer3D.method5869()) {
         Rasterizer3D.clips.currentFaceAlpha = 0;
         this.projectScene(var10, var9, true);
         Rasterizer3D.clips.currentFaceAlpha = 1;
         this.projectScene(var10, var9, false);
         Rasterizer3D.clips.currentFaceAlpha = 2;
      } else {
         Rasterizer3D.clips.currentFaceAlpha = 2;
         this.projectScene(var10, var9, true);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("ky")
   boolean method5681(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var3 && var4 == var5) {
         if (!method5672(this, var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return this.method5683(var13 + 1, this.tileHeights[var1][var2][var4] - var6, var15 + 1)
               && this.method5683(var13 + 848224780 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var15 + 1)
               && this.method5683(var13 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var15 + -1519404546 - 1)
               && this.method5683(var13 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (this.field2952[var1][var7][var8] == -this.Scene_drawnCount) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = this.tileHeights[var1][var2][var4] - var6;
         if (!this.method5683(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method5683(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !this.method5683(var12, var9, var11) ? false : this.method5683(var10, var9, var11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("cg")
   public static void method5622(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Scene var7 = AsyncHttpResponse.worldView.scene;
      int var8 = var1 + var7.field3014;
      int var9 = var2 + var7.field3014;
      if (var5 == 2) {
         GameObject var10 = var7.getGameObject(var0, var1, var2);
         if (var10 != null && var10.renderable instanceof DynamicObject && !((DynamicObject)var10.renderable).method2871()) {
            return;
         }
      } else if (var5 == 3) {
         FloorDecoration var11 = var7.getFloorDecoration(var0, var1, var2);
         if (var11 != null && var11.renderable instanceof DynamicObject && !((DynamicObject)var11.renderable).method2871()) {
            return;
         }
      }

      if (client.field1025 != null) {
         client.field1025.invalidateZone(var7, var8 >> 3, var9 >> 3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("cs")
   boolean method5613(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5603(this.field2956, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("gh")
   int method5563(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method5567(var1, var2, var3) - this.method5567(var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ht")
   public int method5688(int var1, int var2, int var3) {
      return this.tileHeights[var1][var2 + 1][var3 + 1]
            + this.tileHeights[var1][var2][var3]
            + this.tileHeights[var1][var2 + 1][var3]
            + this.tileHeights[var1][var2][var3 + 1]
         >> 2;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ko")
   public boolean method5813(int var1, int var2, int var3, int var4) {
      return this.method5675(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lka;Z)V")
   @ObfuscatedName("js")
   void method5657(Projection var1, boolean var2) {
      this.tileUpdateCount = 0;

      for (int var3 = this.minPlane; var3 < this.planes; var3++) {
         Tile[][] var4 = this.tiles[var3];

         for (int var5 = this.Scene_cameraXTileMin; var5 < this.Scene_cameraXTileMax; var5++) {
            for (int var6 = this.Scene_cameraYTileMin; var6 < this.Scene_cameraYTileMax; var6++) {
               Tile var7 = var4[var5][var6];
               if (var7 != null
                  && var7.minPlane * -295997735 <= this.Scene_plane
                  && (
                     !var2
                        || this.visibleTiles(
                           var5 - this.Scene_cameraXTile + this.field2945 + this.Scene_offsetOccluder,
                           var6 - this.Scene_cameraYTile + this.field2940 + this.Scene_offsetOccluder
                        )
                        || this.tileHeights[var3][var5][var6] - this.Scene_cameraY >= 252832460
                  )) {
                  this.method5759(var1, var7);
               }
            }
         }
      }

      this.method5641();
      Rasterizer3D.clips.field3431.method6530(this.field2879);
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;Ljz;IIJI)V")
   @ObfuscatedName("el")
   public void method5499(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         BoundaryObject var12 = new BoundaryObject();
         var12.tag = var9 * -8195661098055663905L;
         var12.flags = var11 * -1337019435;
         var12.x = var2 * 581815936 + -1856575680;
         var12.y = var3 * -198089344 + 2048438976;
         var12.z = var4 * 2094051365;
         var12.renderable1 = var5;
         var12.renderable2 = var6;
         var12.orientationA = var7 * 730760521;
         var12.orientationB = var8 * 652122151;

         for (int var13 = var1; var13 >= 0; var13--) {
            if (this.tiles[var13][var2][var3] == null) {
               this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].boundaryObject = var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;Z)V")
   @ObfuscatedName("jr")
   void method5660(Projection var1, boolean var2) {
      this.tileUpdateCount = 0;

      for (int var3 = this.minPlane; var3 < this.planes; var3++) {
         Tile[][] var4 = this.tiles[var3];

         for (int var5 = this.Scene_cameraXTileMin; var5 < this.Scene_cameraXTileMax; var5++) {
            for (int var6 = this.Scene_cameraYTileMin; var6 < this.Scene_cameraYTileMax; var6++) {
               Tile var7 = var4[var5][var6];
               if (var7 != null) {
                  if (var7.minPlane * -295997735 <= this.Scene_plane
                     && (
                        !var2
                           || this.visibleTiles(
                              var5 - this.Scene_cameraXTile + this.field2945 + this.Scene_offsetOccluder,
                              var6 - this.Scene_cameraYTile + this.field2940 + this.Scene_offsetOccluder
                           )
                           || this.tileHeights[var3][var5][var6] - this.Scene_cameraY >= 2000
                     )) {
                     var7.drawPrimary = true;
                     var7.drawSecondary = true;
                     if (var7.gameObjectsCount * 1265471425 > 0) {
                        var7.drawGameObjects = true;
                     } else {
                        var7.drawGameObjects = false;
                     }

                     this.tileUpdateCount++;
                  } else {
                     var7.drawPrimary = false;
                     var7.drawSecondary = false;
                     var7.drawGameObjectEdges = 0;
                  }
               }
            }
         }
      }

      int var14 = Math.abs(this.field2945);
      int var15 = Math.abs(this.field2940);

      for (int var16 = this.minPlane; var16 < this.planes; var16++) {
         Tile[][] var18 = this.tiles[var16];

         for (int var20 = -(this.Scene_offsetOccluder + var14); var20 <= 0; var20++) {
            int var8 = this.Scene_cameraXTile + var20;
            int var9 = this.Scene_cameraXTile - var20;
            if (var8 >= this.Scene_cameraXTileMin || var9 < this.Scene_cameraXTileMax) {
               for (int var10 = -(this.Scene_offsetOccluder + var15); var10 <= 0; var10++) {
                  int var11 = this.Scene_cameraYTile + var10;
                  int var12 = this.Scene_cameraYTile - var10;
                  if (var8 >= this.Scene_cameraXTileMin && var8 < this.Scene_cameraXTileMax) {
                     if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
                        Tile var13 = var18[var8][var11];
                        if (var13 != null && var13.drawPrimary) {
                           this.drawTile(var1, var13, true);
                        }
                     }

                     if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
                        Tile var27 = var18[var8][var12];
                        if (var27 != null && var27.drawPrimary) {
                           this.drawTile(var1, var27, true);
                        }
                     }
                  }

                  if (var9 >= this.Scene_cameraXTileMin && var9 < this.Scene_cameraXTileMax) {
                     if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
                        Tile var28 = var18[var9][var11];
                        if (var28 != null && var28.drawPrimary) {
                           this.drawTile(var1, var28, true);
                        }
                     }

                     if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
                        Tile var29 = var18[var9][var12];
                        if (var29 != null && var29.drawPrimary) {
                           this.drawTile(var1, var29, true);
                        }
                     }
                  }

                  if (this.tileUpdateCount == 0) {
                     this.method5641();
                     Rasterizer3D.clips.field3431.method6530(this.field2879);
                     return;
                  }
               }
            }
         }
      }

      for (int var17 = this.minPlane; var17 < this.planes; var17++) {
         Tile[][] var19 = this.tiles[var17];

         for (int var21 = -(this.Scene_offsetOccluder + var14); var21 <= 0; var21++) {
            int var22 = this.field2990 + var21;
            int var23 = this.field2990 - var21;
            if (var22 >= this.Scene_cameraXTileMin || var23 < this.Scene_cameraXTileMax) {
               for (int var24 = -(this.Scene_offsetOccluder + var15); var24 <= 0; var24++) {
                  int var25 = this.field3001 + var24;
                  int var26 = this.field3001 - var24;
                  if (var22 >= this.Scene_cameraXTileMin && var22 < this.Scene_cameraXTileMax) {
                     if (var25 >= this.Scene_cameraYTileMin && var25 < this.Scene_cameraYTileMax) {
                        Tile var30 = var19[var22][var25];
                        if (var30 != null && var30.drawPrimary) {
                           this.drawTile(var1, var30, false);
                        }
                     }

                     if (var26 >= this.Scene_cameraYTileMin && var26 < this.Scene_cameraYTileMax) {
                        Tile var31 = var19[var22][var26];
                        if (var31 != null && var31.drawPrimary) {
                           this.drawTile(var1, var31, false);
                        }
                     }
                  }

                  if (var23 >= this.Scene_cameraXTileMin && var23 < this.Scene_cameraXTileMax) {
                     if (var25 >= this.Scene_cameraYTileMin && var25 < this.Scene_cameraYTileMax) {
                        Tile var32 = var19[var23][var25];
                        if (var32 != null && var32.drawPrimary) {
                           this.drawTile(var1, var32, false);
                        }
                     }

                     if (var26 >= this.Scene_cameraYTileMin && var26 < this.Scene_cameraYTileMax) {
                        Tile var33 = var19[var23][var26];
                        if (var33 != null && var33.drawPrimary) {
                           this.drawTile(var1, var33, false);
                        }
                     }
                  }

                  if (this.tileUpdateCount == 0) {
                     this.method5641();
                     Rasterizer3D.clips.field3431.method6530(this.field2879);
                     return;
                  }
               }
            }
         }
      }

      Rasterizer3D.clips.field3431.method6530(this.field2879);
      this.method5641();
   }

   @ObfuscatedSignature(descriptor = "(Lka;Z)V")
   @ObfuscatedName("jq")
   void method5661(Projection var1, boolean var2) {
      this.tileUpdateCount = 0;

      for (int var3 = this.minPlane; var3 < this.planes; var3++) {
         Tile[][] var4 = this.tiles[var3];

         for (int var5 = this.Scene_cameraXTileMin; var5 < this.Scene_cameraXTileMax; var5++) {
            for (int var6 = this.Scene_cameraYTileMin; var6 < this.Scene_cameraYTileMax; var6++) {
               Tile var7 = var4[var5][var6];
               if (var7 != null) {
                  if (var7.minPlane * -295997735 <= this.Scene_plane
                     && (
                        !var2
                           || this.visibleTiles(
                              var5 - this.Scene_cameraXTile + this.field2945 + this.Scene_offsetOccluder,
                              var6 - this.Scene_cameraYTile + this.field2940 + this.Scene_offsetOccluder
                           )
                           || this.tileHeights[var3][var5][var6] - this.Scene_cameraY >= 2000
                     )) {
                     var7.drawPrimary = true;
                     var7.drawSecondary = true;
                     if (var7.gameObjectsCount * 1265471425 > 0) {
                        var7.drawGameObjects = true;
                     } else {
                        var7.drawGameObjects = false;
                     }

                     this.tileUpdateCount++;
                  } else {
                     var7.drawPrimary = false;
                     var7.drawSecondary = false;
                     var7.drawGameObjectEdges = 0;
                  }
               }
            }
         }
      }

      int var14 = Math.abs(this.field2945);
      int var15 = Math.abs(this.field2940);

      for (int var16 = this.minPlane; var16 < this.planes; var16++) {
         Tile[][] var18 = this.tiles[var16];

         for (int var20 = -(this.Scene_offsetOccluder + var14); var20 <= 0; var20++) {
            int var8 = this.Scene_cameraXTile + var20;
            int var9 = this.Scene_cameraXTile - var20;
            if (var8 >= this.Scene_cameraXTileMin || var9 < this.Scene_cameraXTileMax) {
               for (int var10 = -(this.Scene_offsetOccluder + var15); var10 <= 0; var10++) {
                  int var11 = this.Scene_cameraYTile + var10;
                  int var12 = this.Scene_cameraYTile - var10;
                  if (var8 >= this.Scene_cameraXTileMin && var8 < this.Scene_cameraXTileMax) {
                     if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
                        Tile var13 = var18[var8][var11];
                        if (var13 != null && var13.drawPrimary) {
                           this.drawTile(var1, var13, true);
                        }
                     }

                     if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
                        Tile var27 = var18[var8][var12];
                        if (var27 != null && var27.drawPrimary) {
                           this.drawTile(var1, var27, true);
                        }
                     }
                  }

                  if (var9 >= this.Scene_cameraXTileMin && var9 < this.Scene_cameraXTileMax) {
                     if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
                        Tile var28 = var18[var9][var11];
                        if (var28 != null && var28.drawPrimary) {
                           this.drawTile(var1, var28, true);
                        }
                     }

                     if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
                        Tile var29 = var18[var9][var12];
                        if (var29 != null && var29.drawPrimary) {
                           this.drawTile(var1, var29, true);
                        }
                     }
                  }

                  if (this.tileUpdateCount == 0) {
                     this.method5641();
                     Rasterizer3D.clips.field3431.method6530(this.field2879);
                     return;
                  }
               }
            }
         }
      }

      for (int var17 = this.minPlane; var17 < this.planes; var17++) {
         Tile[][] var19 = this.tiles[var17];

         for (int var21 = -(this.Scene_offsetOccluder + var14); var21 <= 0; var21++) {
            int var22 = this.field2990 + var21;
            int var23 = this.field2990 - var21;
            if (var22 >= this.Scene_cameraXTileMin || var23 < this.Scene_cameraXTileMax) {
               for (int var24 = -(this.Scene_offsetOccluder + var15); var24 <= 0; var24++) {
                  int var25 = this.field3001 + var24;
                  int var26 = this.field3001 - var24;
                  if (var22 >= this.Scene_cameraXTileMin && var22 < this.Scene_cameraXTileMax) {
                     if (var25 >= this.Scene_cameraYTileMin && var25 < this.Scene_cameraYTileMax) {
                        Tile var30 = var19[var22][var25];
                        if (var30 != null && var30.drawPrimary) {
                           this.drawTile(var1, var30, false);
                        }
                     }

                     if (var26 >= this.Scene_cameraYTileMin && var26 < this.Scene_cameraYTileMax) {
                        Tile var31 = var19[var22][var26];
                        if (var31 != null && var31.drawPrimary) {
                           this.drawTile(var1, var31, false);
                        }
                     }
                  }

                  if (var23 >= this.Scene_cameraXTileMin && var23 < this.Scene_cameraXTileMax) {
                     if (var25 >= this.Scene_cameraYTileMin && var25 < this.Scene_cameraYTileMax) {
                        Tile var32 = var19[var23][var25];
                        if (var32 != null && var32.drawPrimary) {
                           this.drawTile(var1, var32, false);
                        }
                     }

                     if (var26 >= this.Scene_cameraYTileMin && var26 < this.Scene_cameraYTileMax) {
                        Tile var33 = var19[var23][var26];
                        if (var33 != null && var33.drawPrimary) {
                           this.drawTile(var1, var33, false);
                        }
                     }
                  }

                  if (this.tileUpdateCount == 0) {
                     this.method5641();
                     Rasterizer3D.clips.field3431.method6530(this.field2879);
                     return;
                  }
               }
            }
         }
      }

      Rasterizer3D.clips.field3431.method6530(this.field2879);
      this.method5641();
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljw;Z)V")
   @ObfuscatedName("jg")
   void method5665(Projection var1, Tile var2, boolean var3) {
      this.Scene_tilesDeque.addFirst(var2);

      label640:
      while (true) {
         Tile var4;
         int var5;
         int var6;
         int var7;
         int var8;
         Tile[][] var9;
         while (true) {
            var4 = (Tile)this.Scene_tilesDeque.removeLast();
            if (var4 == null) {
               return;
            }

            if (var4.drawSecondary) {
               var5 = var4.x * 1738768469;
               var6 = var4.y * -720501671;
               var7 = var4.plane * 1971565835;
               var8 = var4.originalPlane * 1724486501;
               var9 = this.tiles[var7];
               if (!var4.drawPrimary) {
                  break;
               }

               if (var3) {
                  if (var7 > 0) {
                     Tile var10 = this.tiles[var7 - 1][var5][var6];
                     if (var10 != null && var10.drawSecondary) {
                        continue;
                     }
                  }

                  if (var5 <= this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin) {
                     Tile var21 = var9[var5 - 1][var6];
                     if (var21 != null && var21.drawSecondary && (var21.drawPrimary || (var4.gameObjectsEdgeMask * -776991163 & 1) == 0)) {
                        continue;
                     }
                  }

                  if (var5 >= this.Scene_cameraXTile && var5 < this.Scene_cameraXTileMax - 1) {
                     Tile var22 = var9[var5 + 1][var6];
                     if (var22 != null && var22.drawSecondary && (var22.drawPrimary || (var4.gameObjectsEdgeMask * -776991163 & 4) == 0)) {
                        continue;
                     }
                  }

                  if (var6 <= this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin) {
                     Tile var23 = var9[var5][var6 - 1];
                     if (var23 != null && var23.drawSecondary && (var23.drawPrimary || (var4.gameObjectsEdgeMask * -776991163 & 8) == 0)) {
                        continue;
                     }
                  }

                  if (var6 >= this.Scene_cameraYTile && var6 < this.Scene_cameraYTileMax - 1) {
                     Tile var24 = var9[var5][var6 + 1];
                     if (var24 != null && var24.drawSecondary && (var24.drawPrimary || (var4.gameObjectsEdgeMask * -776991163 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var3 = true;
               }

               var4.drawPrimary = false;
               if (var4.linkedBelowTile != null) {
                  Tile var25 = var4.linkedBelowTile;
                  if (var25.paint != null) {
                     if (!method5672(this, 0, var5, var6)) {
                        var1.drawTileUnderlay(this, var25.paint, 0, var5, var6, -436402298);
                     }
                  } else if (var25.model != null && !method5672(this, 0, var5, var6)) {
                     var1.drawTileOverlay(this, var25.model, var5, var6, -656009185);
                  }

                  BoundaryObject var11 = var25.boundaryObject;
                  if (var11 != null) {
                     var1.draw(var11.renderable1, 0, var11.x * -1937046859, var11.z * -1912869971, var11.y * 546730723, var11.tag * -4972732868916429537L);
                  }

                  for (int var12 = 0; var12 < var25.gameObjectsCount * 1265471425; var12++) {
                     GameObject var13 = var25.gameObjects[var12];
                     if (var13 != null) {
                        var1.draw(
                           var13.renderable,
                           var13.orientation * 46801735,
                           var13.centerX * 1204024827,
                           var13.z * 683703035,
                           var13.centerY * 1465977803,
                           var13.tag * 1608625415500949283L
                        );
                     }
                  }
               }

               boolean var26 = false;
               if (var4.paint != null) {
                  if (!method5672(this, var8, var5, var6)) {
                     var26 = true;
                     if (var4.paint.neColor * -120051743 != 12345678 || var7 <= this.Scene_selectedPlane) {
                        var1.drawTileUnderlay(this, var4.paint, var8, var5, var6, -436402298);
                     }
                  }
               } else if (var4.model != null && !method5672(this, var8, var5, var6)) {
                  var26 = true;
                  var1.drawTileOverlay(this, var4.model, var5, var6, -656009185);
               }

               int var34 = 0;
               int var44 = 0;
               BoundaryObject var49 = var4.boundaryObject;
               WallDecoration var14 = var4.wallDecoration;
               if (var49 != null || var14 != null) {
                  if (this.Scene_cameraXTile == var5) {
                     var34++;
                  } else if (this.Scene_cameraXTile < var5) {
                     var34 += 2;
                  }

                  if (this.Scene_cameraYTile == var6) {
                     var34 += 3;
                  } else if (this.Scene_cameraYTile > var6) {
                     var34 += 6;
                  }

                  var44 = field2863[var34];
                  var4.field3223 = field2870[var34] * -1303724817;
               }

               if (var49 != null) {
                  if ((var49.orientationA * -666272519 & field2877[var34]) != 0) {
                     if (var49.orientationA * -666272519 == 16) {
                        var4.drawGameObjectEdges = 1766637505;
                        var4.field3222 = field2871[var34] * -1344466549;
                        var4.field3220 = -661082575 - var4.field3222 * -103252079;
                     } else if (var49.orientationA * -666272519 == 32) {
                        var4.drawGameObjectEdges = -761692286;
                        var4.field3222 = field2876[var34] * -1344466549;
                        var4.field3220 = -1322165150 - var4.field3222 * -103252079;
                     } else if (var49.orientationA * -666272519 == 64) {
                        var4.drawGameObjectEdges = -1523384572;
                        var4.field3222 = field2873[var34] * -1344466549;
                        var4.field3220 = 1650636996 - var4.field3222 * -103252079;
                     } else {
                        var4.drawGameObjectEdges = 1004945219;
                        var4.field3222 = field2872[var34] * -1344466549;
                        var4.field3220 = -1983247725 - var4.field3222 * -103252079;
                     }
                  } else {
                     var4.drawGameObjectEdges = 0;
                  }

                  if ((var49.orientationA * -666272519 & var44) != 0 && !this.method5675(var8, var5, var6, var49.orientationA * -666272519)) {
                     var1.draw(var49.renderable1, 0, var49.x * -1937046859, var49.z * -1912869971, var49.y * 546730723, var49.tag * -4972732868916429537L);
                  }

                  if ((var49.orientationB * -211200105 & var44) != 0 && !this.method5675(var8, var5, var6, var49.orientationB * -211200105)) {
                     var1.draw(var49.renderable2, 0, var49.x * -1937046859, var49.z * -1912869971, var49.y * 546730723, var49.tag * -4972732868916429537L);
                  }
               }

               if (var14 != null && !this.method5678(var8, var5, var6, var14.renderable1.height * -1272589951)) {
                  if ((var14.orientation * 1327001075 & var44) != 0) {
                     var1.draw(
                        var14.renderable1,
                        0,
                        var14.x * -682745183 + var14.xOffset * 1501441925,
                        var14.z * 121856729,
                        var14.y * 1215145581 + var14.field3298 * 1799251127,
                        var14.tag * -7524770072208173231L
                     );
                  } else if (var14.orientation * 1327001075 == 256) {
                     int var15 = var14.x * -682745183 - this.Scene_cameraX;
                     int var16 = var14.y * 1215145581 - this.Scene_cameraZ;
                     int var17 = var14.orientation2 * -1475596409;
                     int var18;
                     if (var17 != 1 && var17 != 2) {
                        var18 = var15;
                     } else {
                        var18 = -var15;
                     }

                     int var19;
                     if (var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if (var19 < var18) {
                        var1.draw(
                           var14.renderable1,
                           0,
                           var14.x * -682745183 + var14.xOffset * 1501441925,
                           var14.z * 121856729,
                           var14.y * 1215145581 + var14.field3298 * 1799251127,
                           var14.tag * -7524770072208173231L
                        );
                     } else if (var14.renderable2 != null) {
                        var1.draw(var14.renderable2, 0, var14.x * -682745183, var14.z * 121856729, var14.y * 1215145581, var14.tag * -7524770072208173231L);
                     }
                  }
               }

               if (var26) {
                  FloorDecoration var58 = var4.floorDecoration;
                  if (var58 != null) {
                     var1.draw(var58.renderable, 0, var58.x * 1266171817, var58.z * -495673633, var58.y * -190028295, var58.tag);
                  }

                  ItemLayer var65 = var4.itemLayer;
                  if (var65 != null && var65.height * 2067113767 == 0) {
                     if (var65.first != null) {
                        var1.draw(var65.first, 0, var65.x * -1625205487, var65.z * -90686671, var65.y * -162090531, var65.tag);
                     }

                     if (var65.second != null) {
                        var1.draw(var65.second, 0, var65.x * -1625205487, var65.z * -90686671, var65.y * -162090531, var65.tag);
                     }

                     if (var65.third != null) {
                        var1.draw(var65.third, 0, var65.x * -1625205487, var65.z * -90686671, var65.y * -162090531, var65.tag);
                     }
                  }
               }

               int var59 = var4.gameObjectsEdgeMask * -776991163;
               if (var59 != 0) {
                  if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1 && (var59 & 4) != 0) {
                     Tile var66 = var9[var5 + 1][var6];
                     if (var66 != null && var66.drawSecondary) {
                        this.Scene_tilesDeque.addFirst(var66);
                     }
                  }

                  if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1 && (var59 & 2) != 0) {
                     Tile var67 = var9[var5][var6 + 1];
                     if (var67 != null && var67.drawSecondary) {
                        this.Scene_tilesDeque.addFirst(var67);
                     }
                  }

                  if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax && (var59 & 1) != 0) {
                     Tile var68 = var9[var5 - 1][var6];
                     if (var68 != null && var68.drawSecondary) {
                        this.Scene_tilesDeque.addFirst(var68);
                     }
                  }

                  if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax && (var59 & 8) != 0) {
                     Tile var69 = var9[var5][var6 - 1];
                     if (var69 != null && var69.drawSecondary) {
                        this.Scene_tilesDeque.addFirst(var69);
                     }
                  }
               }
               break;
            }
         }

         if (var4.drawGameObjectEdges * 403042499 != 0) {
            boolean var27 = true;

            for (int var35 = 0; var35 < var4.gameObjectsCount * 1265471425; var35++) {
               if (var4.gameObjects[var35].lastDrawn * 399338421 != this.Scene_drawnCount
                  && (var4.gameObjectEdgeMasks[var35] & var4.drawGameObjectEdges * 403042499) == var4.field3222 * -1047327197) {
                  var27 = false;
                  break;
               }
            }

            if (var27) {
               BoundaryObject var36 = var4.boundaryObject;
               if (!this.method5675(var8, var5, var6, var36.orientationA * -666272519)) {
                  var1.draw(var36.renderable1, 0, var36.x * -1937046859, var36.z * -1912869971, var36.y * 546730723, var36.tag * -4972732868916429537L);
               }

               var4.drawGameObjectEdges = 0;
            }
         }

         if (var4.drawGameObjects) {
            try {
               int var28 = var4.gameObjectsCount * 1265471425;
               var4.drawGameObjects = false;
               int var37 = 0;

               label588:
               for (int var45 = 0; var45 < var28; var45++) {
                  GameObject var50 = var4.gameObjects[var45];
                  if (var50.lastDrawn * 399338421 != this.Scene_drawnCount) {
                     for (int var53 = var50.startX * 1666005069; var53 <= var50.endX * 1553138359; var53++) {
                        for (int var60 = var50.startY * 889015863; var60 <= var50.endY * -2094327665; var60++) {
                           Tile var70 = var9[var53][var60];
                           if (var70.drawPrimary) {
                              var4.drawGameObjects = true;
                              continue label588;
                           }

                           if (var70.drawGameObjectEdges * 403042499 != 0) {
                              int var75 = 0;
                              if (var53 > var50.startX * 1666005069) {
                                 var75++;
                              }

                              if (var53 < var50.endX * 1553138359) {
                                 var75 += 4;
                              }

                              if (var60 > var50.startY * 889015863) {
                                 var75 += 8;
                              }

                              if (var60 < var50.endY * -2094327665) {
                                 var75 += 2;
                              }

                              if ((var75 & var70.drawGameObjectEdges * 403042499) == var4.field3220 * -489308045) {
                                 var4.drawGameObjects = true;
                                 continue label588;
                              }
                           }
                        }
                     }

                     this.gameObjects[var37++] = var50;
                     int var54 = this.Scene_cameraXTile - var50.startX * 1666005069;
                     int var61 = var50.endX * 1553138359 - this.Scene_cameraXTile;
                     if (var61 > var54) {
                        var54 = var61;
                     }

                     int var71 = this.Scene_cameraYTile - var50.startY * 889015863;
                     int var76 = var50.endY * -2094327665 - this.Scene_cameraYTile;
                     if (var76 > var71) {
                        var50.field3278 = (var54 + var76) * 2049269999;
                     } else {
                        var50.field3278 = (var54 + var71) * 2049269999;
                     }
                  }
               }

               while (true) {
                  int var46 = -50;
                  int var51 = -1;

                  for (int var55 = 0; var55 < var37; var55++) {
                     GameObject var62 = this.gameObjects[var55];
                     if (var62.lastDrawn * 399338421 != this.Scene_drawnCount) {
                        if (var62.field3278 * 186764815 > var46) {
                           var46 = var62.field3278 * 186764815;
                           var51 = var55;
                        } else if (var62.field3278 * 186764815 == var46) {
                           int var72 = var62.centerX * 1204024827 - this.Scene_cameraX;
                           int var77 = var62.centerY * 1465977803 - this.Scene_cameraZ;
                           int var79 = this.gameObjects[var51].centerX * 1204024827 - this.Scene_cameraX;
                           int var80 = this.gameObjects[var51].centerY * 1465977803 - this.Scene_cameraZ;
                           if (var72 * var72 + var77 * var77 > var79 * var79 + var80 * var80) {
                              var51 = var55;
                           }
                        }
                     }
                  }

                  if (var51 == -1) {
                     if (var4.drawGameObjects) {
                        continue label640;
                     }
                     break;
                  }

                  GameObject var56 = this.gameObjects[var51];
                  var56.lastDrawn = this.Scene_drawnCount * -230921571;
                  if (!this.method5679(
                     var8,
                     var56.startX * 1666005069,
                     var56.endX * 1553138359,
                     var56.startY * 889015863,
                     var56.endY * -2094327665,
                     var56.renderable.height * -1272589951
                  )) {
                     var1.draw(
                        var56.renderable,
                        var56.orientation * 46801735,
                        var56.centerX * 1204024827,
                        var56.z * 683703035,
                        var56.centerY * 1465977803,
                        var56.tag * 1608625415500949283L
                     );
                  }

                  for (int var63 = var56.startX * 1666005069; var63 <= var56.endX * 1553138359; var63++) {
                     for (int var73 = var56.startY * 889015863; var73 <= var56.endY * -2094327665; var73++) {
                        Tile var78 = var9[var63][var73];
                        if (var78.drawGameObjectEdges * 403042499 != 0) {
                           this.Scene_tilesDeque.addFirst(var78);
                        } else if ((var63 != var5 || var73 != var6) && var78.drawSecondary) {
                           this.Scene_tilesDeque.addFirst(var78);
                        }
                     }
                  }
               }
            } catch (Exception var20) {
               var4.drawGameObjects = false;
            }
         }

         if (var4.drawSecondary && var4.drawGameObjectEdges * 403042499 == 0) {
            if (var5 <= this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin) {
               Tile var29 = var9[var5 - 1][var6];
               if (var29 != null && var29.drawSecondary) {
                  continue;
               }
            }

            if (var5 >= this.Scene_cameraXTile && var5 < this.Scene_cameraXTileMax - 1) {
               Tile var30 = var9[var5 + 1][var6];
               if (var30 != null && var30.drawSecondary) {
                  continue;
               }
            }

            if (var6 <= this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin) {
               Tile var31 = var9[var5][var6 - 1];
               if (var31 != null && var31.drawSecondary) {
                  continue;
               }
            }

            if (var6 >= this.Scene_cameraYTile && var6 < this.Scene_cameraYTileMax - 1) {
               Tile var32 = var9[var5][var6 + 1];
               if (var32 != null && var32.drawSecondary) {
                  continue;
               }
            }

            var4.drawSecondary = false;
            this.tileUpdateCount--;
            ItemLayer var33 = var4.itemLayer;
            if (var33 != null && var33.height * 2067113767 != 0) {
               if (var33.first != null) {
                  var1.draw(var33.first, 0, var33.x * -1625205487, var33.z * -90686671 - var33.height * 2067113767, var33.y * -162090531, var33.tag);
               }

               if (var33.second != null) {
                  var1.draw(var33.second, 0, var33.x * -1625205487, var33.z * -90686671 - var33.height * 2067113767, var33.y * -162090531, var33.tag);
               }

               if (var33.third != null) {
                  var1.draw(var33.third, 0, var33.x * -1625205487, var33.z * -90686671 - var33.height * 2067113767, var33.y * -162090531, var33.tag);
               }
            }

            if (var4.field3223 * 1129050639 != 0) {
               WallDecoration var38 = var4.wallDecoration;
               if (var38 != null && !this.method5678(var8, var5, var6, var38.renderable1.height * -1272589951)) {
                  if ((var38.orientation * 1327001075 & var4.field3223 * 1129050639) != 0) {
                     var1.draw(
                        var38.renderable1,
                        0,
                        var38.x * -682745183 + var38.xOffset * 1501441925,
                        var38.z * 121856729,
                        var38.y * 1215145581 + var38.field3298 * 1799251127,
                        var38.tag * -7524770072208173231L
                     );
                  } else if (var38.orientation * 1327001075 == 256) {
                     int var47 = var38.x * -682745183 - this.Scene_cameraX;
                     int var52 = var38.y * 1215145581 - this.Scene_cameraZ;
                     int var57 = var38.orientation2 * -1475596409;
                     int var64;
                     if (var57 != 1 && var57 != 2) {
                        var64 = var47;
                     } else {
                        var64 = -var47;
                     }

                     int var74;
                     if (var57 != 2 && var57 != 3) {
                        var74 = var52;
                     } else {
                        var74 = -var52;
                     }

                     if (var74 >= var64) {
                        var1.draw(
                           var38.renderable1,
                           0,
                           var38.x * -682745183 + var38.xOffset * 1501441925,
                           var38.z * 121856729,
                           var38.y * 1215145581 + var38.field3298 * 1799251127,
                           var38.tag * -7524770072208173231L
                        );
                     } else if (var38.renderable2 != null) {
                        var1.draw(var38.renderable2, 0, var38.x * -682745183, var38.z * 121856729, var38.y * 1215145581, var38.tag * -7524770072208173231L);
                     }
                  }
               }

               BoundaryObject var48 = var4.boundaryObject;
               if (var48 != null) {
                  if ((var48.orientationB * -211200105 & var4.field3223 * 1129050639) != 0
                     && !this.method5675(var8, var5, var6, var48.orientationB * -211200105)) {
                     var1.draw(var48.renderable2, 0, var48.x * -1937046859, var48.z * -1912869971, var48.y * 546730723, var48.tag * -4972732868916429537L);
                  }

                  if ((var48.orientationA * -666272519 & var4.field3223 * 1129050639) != 0
                     && !this.method5675(var8, var5, var6, var48.orientationA * -666272519)) {
                     var1.draw(var48.renderable1, 0, var48.x * -1937046859, var48.z * -1912869971, var48.y * 546730723, var48.tag * -4972732868916429537L);
                  }
               }
            }

            if (var7 < this.planes - 1) {
               Tile var39 = this.tiles[var7 + 1][var5][var6];
               if (var39 != null && var39.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var39);
               }
            }

            if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1) {
               Tile var40 = var9[var5 + 1][var6];
               if (var40 != null && var40.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var40);
               }
            }

            if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1) {
               Tile var41 = var9[var5][var6 + 1];
               if (var41 != null && var41.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var41);
               }
            }

            if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax) {
               Tile var42 = var9[var5 - 1][var6];
               if (var42 != null && var42.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var42);
               }
            }

            if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax) {
               Tile var43 = var9[var5][var6 - 1];
               if (var43 != null && var43.drawSecondary) {
                  this.Scene_tilesDeque.addFirst(var43);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;Z)V")
   @ObfuscatedName("ji")
   void method5658(Projection var1, boolean var2) {
      this.tileUpdateCount = 0;

      for (int var3 = this.minPlane; var3 < this.planes; var3++) {
         Tile[][] var4 = this.tiles[var3];

         for (int var5 = this.Scene_cameraXTileMin; var5 < this.Scene_cameraXTileMax; var5++) {
            for (int var6 = this.Scene_cameraYTileMin; var6 < this.Scene_cameraYTileMax; var6++) {
               Tile var7 = var4[var5][var6];
               if (var7 != null
                  && var7.minPlane * -295997735 <= this.Scene_plane
                  && (
                     !var2
                        || this.visibleTiles(
                           var5 - this.Scene_cameraXTile + this.field2945 + this.Scene_offsetOccluder,
                           var6 - this.Scene_cameraYTile + this.field2940 + this.Scene_offsetOccluder
                        )
                        || this.tileHeights[var3][var5][var6] - this.Scene_cameraY >= 2000
                  )) {
                  this.method5759(var1, var7);
               }
            }
         }
      }

      this.method5641();
      Rasterizer3D.clips.field3431.method6530(this.field2879);
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljw;)V")
   @ObfuscatedName("je")
   void method5667(Projection var1, Tile var2) {
      if (var2 != null) {
         int var3 = var2.x * 1738768469;
         int var4 = var2.y * -720501671;
         int var5 = var2.plane * 1971565835;
         int var6 = var2.originalPlane * 1724486501;
         if (var2.plane * 1971565835 == 0 && var2.linkedBelowTile != null) {
            this.method5759(var1, var2.linkedBelowTile);
         }

         if (var2.paint != null) {
            if (!method5672(this, var6, var3, var4) && (var2.paint.neColor * -120051743 != 12345678 || var5 <= this.Scene_selectedPlane)) {
               var1.drawTileUnderlay(this, var2.paint, var6, var3, var4, -436402298);
            }
         } else if (var2.model != null && !method5672(this, var6, var3, var4)) {
            var1.drawTileOverlay(this, var2.model, var3, var4, -656009185);
         }

         BoundaryObject var7 = var2.boundaryObject;
         if (var7 != null) {
            if (var7.renderable1 != null && !this.method5675(var6, var3, var4, var7.orientationA * -666272519)) {
               var1.draw(var7.renderable1, 0, var7.x * -1937046859, var7.z * -1912869971, var7.y * 546730723, var7.tag * -4972732868916429537L);
            }

            if (var7.renderable2 != null && !this.method5675(var6, var3, var4, var7.orientationB * -211200105)) {
               var1.draw(var7.renderable2, 0, var7.x * -1937046859, var7.z * -1912869971, var7.y * 546730723, var7.tag * -4972732868916429537L);
            }
         }

         WallDecoration var8 = var2.wallDecoration;
         if (var8 != null && !this.method5678(var6, var3, var4, var8.renderable1.height * -1272589951)) {
            if (var8.orientation * 1327001075 == 256) {
               var1.draw(
                  var8.renderable1,
                  0,
                  var8.x * -682745183 + var8.xOffset * 1501441925,
                  var8.z * 121856729,
                  var8.y * 1215145581 + var8.field3298 * 1799251127,
                  var8.tag * -7524770072208173231L
               );
               if (var8.renderable2 != null) {
                  var1.draw(var8.renderable2, 0, var8.x * -682745183, var8.z * 121856729, var8.y * 1215145581, var8.tag * -7524770072208173231L);
               }
            } else {
               var1.draw(
                  var8.renderable1,
                  0,
                  var8.x * -682745183 + var8.xOffset * 1501441925,
                  var8.z * 121856729,
                  var8.y * 1215145581 + var8.field3298 * 1799251127,
                  var8.tag * -7524770072208173231L
               );
            }
         }

         FloorDecoration var9 = var2.floorDecoration;
         if (var9 != null) {
            var1.draw(var9.renderable, 0, var9.x * 1266171817, var9.z * -495673633, var9.y * -190028295, var9.tag);
         }

         ItemLayer var10 = var2.itemLayer;
         if (var10 != null) {
            if (var10.first != null) {
               var1.draw(var10.first, 0, var10.x * -1625205487, var10.z * -90686671 - var10.height * 2067113767, var10.y * -162090531, var10.tag);
            }

            if (var10.second != null) {
               var1.draw(var10.second, 0, var10.x * -1625205487, var10.z * -90686671 - var10.height * 2067113767, var10.y * -162090531, var10.tag);
            }

            if (var10.third != null) {
               var1.draw(var10.third, 0, var10.x * -1625205487, var10.z * -90686671 - var10.height * 2067113767, var10.y * -162090531, var10.tag);
            }
         }

         for (int var11 = 0; var11 < var2.gameObjectsCount * 1265471425; var11++) {
            GameObject var12 = var2.gameObjects[var11];
            var12.lastDrawn = this.Scene_drawnCount * -230921571;
            if (var12.startX * 1666005069 == var2.x * 1738768469
               && var12.startY * 889015863 == var2.y * -720501671
               && !this.method5679(
                  var6,
                  var12.startX * 1666005069,
                  var12.endX * 1553138359,
                  var12.startY * 889015863,
                  var12.endY * -2094327665,
                  var12.renderable.height * -1272589951
               )) {
               var1.draw(
                  var12.renderable,
                  var12.orientation * 46801735,
                  var12.centerX * 1204024827,
                  var12.z * 683703035,
                  var12.centerY * 1465977803,
                  var12.tag * 1608625415500949283L
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;IIIIIIIILjz;IZJI)Z")
   @ObfuscatedName("jl")
   public static boolean method5780(
      Scene var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      Renderable var9,
      int var10,
      boolean var11,
      long var12,
      int var14
   ) {
      if (var0 == null) {
         var0.newGameObject(var1, var1, var1, var1, var1, var1, var1, var1, var9, var1, var11, var12, var1);
      }

      int var15 = var2 + var0.field3014;
      int var16 = var3 + var0.field3014;
      if (var11) {
         boolean var17 = SecureUrlRequester.client.getCallbacks().draw(var9, false);
         if (!var17) {
            if ((var6 & 127) == 64 && (var7 & 127) == 64 && var9 instanceof Actor && ((Actor)var9).size * -919874483 == 1) {
               int var31 = var6 >> 7;
               int var33 = var7 >> 7;
               var0.field3023.tileLastDrawnActor[var31][var33] = -1;
            }

            return false;
         }
      }

      for (int var25 = var15; var25 < var15 + var4; var25++) {
         for (int var18 = var16; var18 < var16 + var5; var18++) {
            if (var25 < 0 || var18 < 0 || var25 >= var0.xSize || var18 >= var0.ySize) {
               return false;
            }

            int var19 = var0.method5690(var1, var25, var18);
            if (var0.method5737(var19) && var0.field2907[var19] >= 5) {
               return false;
            }
         }
      }

      GameObject var26;
      if (var11) {
         if (var0.tempGameObjectsCount >= var0.tempGameObjects.length) {
            var0.tempGameObjects = Arrays.copyOf(var0.tempGameObjects, var0.tempGameObjects.length * 2);
         }

         var26 = var0.tempGameObjects[var0.tempGameObjectsCount];
         if (var26 == null) {
            var26 = var0.tempGameObjects[var0.tempGameObjectsCount] = new GameObject();
         }

         var26.lastDrawn = 0 * -230921571;
         var26.method6310(0);
         var0.tempGameObjectsCount++;
      } else {
         var26 = new GameObject();
      }

      var26.method6314(var12);
      var26.method6311(var14);
      var26.method6308(var1);
      var26.method6306(var6);
      var26.method6313(var7);
      var26.method6309(var8);
      var26.method6315(var9);
      var26.method6307(var10);
      var26.startX = var2 * -850870139;
      var26.startY = var3 * -153499769;
      var26.endX = (var2 + var4 - 1) * -155485433;
      var26.endY = (var3 + var5 - 1) * 1391658607;
      if (var11) {
         rl16 var27 = var0.field2912[var15 >> 3][var16 >> 3];
         var27.field5567.add(var26);
      } else if (var9 instanceof DynamicObject) {
         rl16 var28 = var0.field2912[var15 >> 3][var16 >> 3];
         var28.field5566.add(var26);
         var0.method5691((DynamicObject)var9);
      }

      var0.method5779(var9, var10, var6, var8, var7, var2, var3);

      for (int var29 = var15; var29 < var15 + var4; var29++) {
         for (int var32 = var16; var32 < var16 + var5; var32++) {
            byte var20 = 0;
            if (var29 > var15) {
               var20 |= 1;
            }

            if (var29 < var15 + var4 - 1) {
               var20 |= 4;
            }

            if (var32 > var16) {
               var20 |= 8;
            }

            if (var32 < var16 + var5 - 1) {
               var20 |= 2;
            }

            for (int var21 = var1; var21 >= 0; var21--) {
               int var22 = var0.method5690(var21, var29, var32);
               if (var0.field2886[var21][var29][var32] == null) {
                  var0.field2886[var21][var29][var32] = new rl8(var0, var22);
                  var0.method5687(var21, var29, var32);
               }

               if (!var0.method5737(var22)) {
                  var0.setTileMinPlane(var22, var21, var29, var32);
               }
            }

            int var34 = var0.method5690(var1, var29, var32);
            byte var35 = var0.field2907[var34];
            var0.field2887[var34 * 5 + var35] = var26;
            var0.field2908[var34 * 5 + var35] = (byte)var20;
            var0.field2909[var34] = (byte)(var0.field2909[var34] | var20);
            var0.field2907[var34]++;
         }
      }

      if (!var11 && var0.field3025) {
         assert !(var9 instanceof Actor);

         assert !(var9 instanceof Projectile);

         assert !(var9 instanceof GraphicsObject);

         assert !(var9 instanceof Scene);

         client.field938.trace("Game object spawn: {}", var26.getId());
         GameObjectSpawned var30 = new GameObjectSpawned();
         var30.setTile(var0.field2886[var1][var15][var16]);
         var30.setGameObject(var26);
         SecureUrlRequester.client.getCallbacks().post(var30);
         int var24 = var0.method5690(var1, var2, var3);
         var0.field2910[var24] = var0.field2910[var24] | 1080863910568919040L;
      }

      if (var0.field3025 && !var11 && client.field1025 != null) {
         client.field1025.invalidateZone(var0, var15 >> 3, var16 >> 3);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ja")
   public void method5646() {
      this.baseX = -1;
      this.viewportWalking = false;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("zz")
   public static boolean method5581(Scene var0, BitSet var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method5600(var1, var2, var2, var2, var2);
      }

      return var1.get(var2 * var0.field2960 + var3 * var0.field2961 + var4 * var0.field2962 + var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dq")
   static final int method5471(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = -2094820435;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "(Lka;Lka;)V")
   @ObfuscatedName("uo")
   public void method5558(Projection var1, Projection var2) {
      int var3 = this.Scene_cameraXTile >> 3;
      int var4 = this.Scene_cameraYTile >> 3;
      int var5 = field3021 >> 3;
      int var6 = this.xSize >> 3;
      int var7 = this.ySize >> 3;
      this.field3019 = 0;

      for (int var8 = -var5; var8 <= var5; var8++) {
         for (int var9 = -var5; var9 <= var5; var9++) {
            int var10 = var3 + var8;
            int var11 = var4 + var9;
            if (var10 >= 0 && var10 < var6 && var11 >= 0 && var11 < var7) {
               rl16 var12 = this.field2914[this.field3019++] = this.field2912[var10][var11];
               var12.field5574 = false;
            }
         }
      }

      Arrays.sort(this.field2914, 0, this.field3019, this.field2885);
      rl21.method9557(var1, this);

      for (int var13 = 0; var13 < this.field3019; var13++) {
         rl16 var16 = this.field2914[var13];
         if (this.worldViewId != -1 || this.method5749(var16, var16.field5568, var16.field5570)) {
            var16.field5574 = true;
            client.field1025.drawZoneOpaque(var2, this, var16.field5568, var16.field5570);
            this.method5752(var1, var2, var16, this.field2916);
            this.method5774(var1, var2, var16);
         }
      }

      for (int var14 = this.field3019 - 1; var14 >= 0; var14--) {
         rl16 var17 = this.field2914[var14];
         if (var17.field5574) {
            this.method5727(var1, var2, var17);
         }
      }

      rl21.method9556();
      rl21.method9554();

      for (int var15 = this.field3019 - 1; var15 >= 0; var15--) {
         rl16 var18 = this.field2914[var15];
         if (var18.field5574) {
            this.method5782(var1, var18);
         }
      }

      client.field1025.drawPass(var2, this, 0);
   }

   @ObfuscatedSignature(descriptor = "(Lka;I)V")
   @ObfuscatedName("du")
   public void method5697(Projection var1, int var2) {
      int var3 = this.field2900[var2];
      if ((var3 & 32) != 0) {
         int var4 = 3 << this.field2891 | var2;
         this.method5697(var1, var4);
      }

      int var15 = var2 >> this.field2890 & this.field2892;
      int var5 = var2 & this.field2893;
      int var6 = var2 >> this.field2891 & 3;
      int var7 = this.method5758(var2);
      int var8 = this.method5625(var2);
      int var9 = var15 - this.field3014;
      int var10 = var5 - this.field3014;
      if ((var3 & 256) != 0) {
         if (!this.method5797(var7, var15, var5) && ((var3 & 512) != 0 || var6 <= this.Scene_selectedPlane)) {
            SceneTilePaint var11 = this.field2901[var2];
            var1.method6228(this, var11, var8, var7, var9, var10);
         }
      } else if ((var3 & 1024) != 0 && !this.method5797(var7, var15, var5)) {
         var1.method6231(this, this.field2902[var2], var8, var9, var10);
      }

      if ((var3 & 16384) != 0) {
         BoundaryObject var16 = this.field2903[var2];
         if (var16.renderable1 != null && !this.method5813(var7, var15, var5, var16.orientationA * -666272519)) {
            this.method5744(var1, var16.renderable1, 0, var16.x * -1937046859, var16.z * -1912869971, var16.y * 546730723, var16.tag * -4972732868916429537L);
         }

         if (var16.renderable2 != null && !this.method5813(var7, var15, var5, var16.orientationA * -666272519)) {
            this.method5744(var1, var16.renderable2, 0, var16.x * -1937046859, var16.z * -1912869971, var16.y * 546730723, var16.tag * -4972732868916429537L);
         }
      }

      if ((var3 & 32768) != 0) {
         WallDecoration var17 = this.field2904[var2];
         if (!this.method5799(var7, var15, var5, var17.renderable1.height * -1272589951)) {
            if (var17.orientation * 1327001075 == 256) {
               this.method5744(
                  var1,
                  var17.renderable1,
                  0,
                  var17.x * -682745183 + var17.xOffset * 1501441925,
                  var17.z * 121856729,
                  var17.y * 1215145581 + var17.field3298 * 1799251127,
                  var17.tag * -7524770072208173231L
               );
               if (var17.renderable2 != null) {
                  this.method5744(
                     var1, var17.renderable2, 0, var17.x * -682745183, var17.z * 121856729, var17.y * 1215145581, var17.tag * -7524770072208173231L
                  );
               }
            } else {
               this.method5744(
                  var1,
                  var17.renderable1,
                  0,
                  var17.x * -682745183 + var17.xOffset * 1501441925,
                  var17.z * 121856729,
                  var17.y * 1215145581 + var17.field3298 * 1799251127,
                  var17.tag * -7524770072208173231L
               );
            }
         }
      }

      if ((var3 & 2048) != 0) {
         FloorDecoration var18 = this.field2905[var2];
         this.method5744(var1, var18.renderable, 0, var18.x * 1266171817, var18.z * -495673633, var18.y * -190028295, var18.tag);
      }

      if ((this.field2900[var2] & 12288) != 0) {
         ItemLayer var19 = this.field2906[var2];
         if (var19.first != null) {
            this.method5744(var1, var19.first, 0, var19.x * -1625205487, var19.z * -90686671 - var19.height * 2067113767, var19.y * -162090531, var19.tag);
         }

         if (var19.second != null) {
            this.method5744(var1, var19.second, 0, var19.x * -1625205487, var19.z * -90686671 - var19.height * 2067113767, var19.y * -162090531, var19.tag);
         }

         if (var19.third != null) {
            this.method5744(var1, var19.third, 0, var19.x * -1625205487, var19.z * -90686671 - var19.height * 2067113767, var19.y * -162090531, var19.tag);
         }
      }

      for (int var20 = 0; var20 < this.field2907[var2]; var20++) {
         GameObject var12 = this.field2887[var2 * 5 + var20];
         var12.lastDrawn = this.Scene_drawnCount * -230921571;
         if (var9 == var12.startX * 1666005069 && var10 == var12.startY * 889015863) {
            try {
               this.method5744(
                  var1,
                  var12.renderable,
                  var12.orientation * 46801735,
                  var12.centerX * 1204024827,
                  var12.z * 683703035,
                  var12.centerY * 1465977803,
                  var12.tag * 1608625415500949283L
               );
            } catch (Exception var14) {
               client.field938.debug("exception drawing game entity", var14);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("du")
   static boolean method5474(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("bq")
   public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      var5 += this.field3014;
      var6 += this.field3014;
      int var7 = this.method5690(var4, var5, var6);
      if (this.method5737(var7)) {
         int var8 = this.field2900[var7];
         if ((var8 & 256) != 0) {
            SceneTilePaint var9 = this.field2901[var7];
            int var10 = var9.rgb * -453092939;
            if (var10 != 0) {
               for (int var11 = 0; var11 < 4; var11++) {
                  var1[var2] = var10;
                  var1[var2 + 1] = var10;
                  var1[var2 + 2] = var10;
                  var1[var2 + 3] = var10;
                  var2 += var3;
               }
            }
         } else if ((var8 & 1024) != 0) {
            SceneTileModel var20 = this.field2902[var7];
            if (var20 != null) {
               int var21 = var20.shape;
               int var22 = var20.rotation;
               int var12 = var20.underlayRgb;
               int var13 = var20.overlayRgb;
               int[] var14 = tileShape2D[var21];
               int[] var15 = tileRotation2D[var22];
               int var16 = 0;
               if (var12 != 0) {
                  for (int var17 = 0; var17 < 4; var17++) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for (int var29 = 0; var29 < 4; var29++) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("xg")
   public void method5814(boolean var1) {
      method5628(this, var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIZ)Z")
   @ObfuscatedName("zq")
   public static boolean method5597(Scene var0, int var1, int var2, int var3, int var4, boolean var5) {
      return var0.method5583(var0.field2959, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("kw")
   boolean method5682(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var3 && var4 == var5) {
         if (!method5672(this, var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return this.method5683(var13 + 1, this.tileHeights[var1][var2][var4] - var6, var15 + 1)
               && this.method5683(var13 + -537599161 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var15 + 1)
               && this.method5683(var13 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var15 + -99218119 - 1)
               && this.method5683(var13 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var15 + 1145558095 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (this.field2952[var1][var7][var8] == -this.Scene_drawnCount) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = this.tileHeights[var1][var2][var4] - var6;
         if (!this.method5683(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method5683(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !this.method5683(var12, var9, var11) ? false : this.method5683(var10, var9, var11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fn")
   public void method5520(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.boundaryObject = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("hp")
   boolean method5594(int var1, int var2, int var3, int var4) {
      return method5581(this, this.field2959, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("uw")
   public static void method5491(
      Scene var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      if (var0 == null) {
         var0.method5743();
      }

      if (var4 == 0) {
         SceneTilePaint var24 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

         for (int var26 = var1; var26 >= 0; var26--) {
            if (var0.tiles[var26][var2][var3] == null) {
               var0.tiles[var26][var2][var3] = new Tile(var26, var2, var3);
            }
         }

         var0.tiles[var1][var2][var3].paint = var24;
      } else if (var4 != 1) {
         if (var20 == 0) {
            var20 = 1;
         }

         SceneTileModel var23 = new SceneTileModel(
            var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20
         );

         for (int var25 = var1; var25 >= 0; var25--) {
            if (var0.tiles[var25][var2][var3] == null) {
               var0.tiles[var25][var2][var3] = new Tile(var25, var2, var3);
            }
         }

         var0.tiles[var1][var2][var3].model = var23;
      } else {
         SceneTilePaint var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for (int var22 = var1; var22 >= 0; var22--) {
            if (var0.tiles[var22][var2][var3] == null) {
               var0.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         var0.tiles[var1][var2][var3].paint = var21;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ke")
   boolean method5685(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.Scene_currentOccludersCount; var4++) {
         Occluder var5 = this.Scene_currentOccluders[var4];
         if (var5.field3320 * 185187997 == 1) {
            int var6 = var5.maxY * 1482829177 - var1;
            if (var6 > 0) {
               int var7 = var5.minTileX * 482805074 + (var5.maxTileX * 2026020675 * var6 >> 8);
               int var8 = var5.minZ * 878190004 + (var5.minX * -2113139833 * var6 >> 8);
               int var9 = var5.minTileY * 325018011 + (var5.field3321 * 1608308536 * var6 >> 8);
               int var10 = var5.field3324 * 1574771297 + (var5.field3330 * 1978703402 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 2) {
            int var11 = var1 - var5.maxY * -1581732242;
            if (var11 > 0) {
               int var15 = var5.minTileX * -1389987515 + (var5.maxTileX * -1731953516 * var11 >> 8);
               int var19 = var5.minZ * 282521569 + (var5.minX * -1518194223 * var11 >> 8);
               int var23 = var5.minTileY * 1329246222 + (var5.field3321 * 1686581846 * var11 >> 8);
               int var27 = var5.field3324 * 1574771297 + (var5.field3330 * 452742721 * var11 >> 8);
               if (var3 >= var15 && var3 <= var19 && var2 >= var23 && var2 <= var27) {
                  return true;
               }
            }
         } else if (var5.field3320 * -1898797854 == 3) {
            int var12 = var5.minTileX * 203659525 - var3;
            if (var12 > 0) {
               int var16 = var5.maxY * 1482829177 + (var5.maxTileY * 753513109 * var12 >> 8);
               int var20 = var5.field3337 * 602919219 + (var5.type * 965971961 * var12 >> 8);
               int var24 = var5.minTileY * 1051489521 + (var5.field3321 * 1603747012 * var12 >> 8);
               int var28 = var5.field3324 * 1574771297 + (var5.field3330 * 849240273 * var12 >> 8);
               if (var1 >= var16 && var1 <= var20 && var2 >= var24 && var2 <= var28) {
                  return true;
               }
            }
         } else if (var5.field3320 * 1151440380 == 4) {
            int var13 = var3 - var5.minTileX * -1389987515;
            if (var13 > 0) {
               int var17 = var5.maxY * -1140070898 + (var5.maxTileY * -1594958928 * var13 >> 8);
               int var21 = var5.field3337 * -291890430 + (var5.type * 965971961 * var13 >> 8);
               int var25 = var5.minTileY * 1051489521 + (var5.field3321 * 1627533151 * var13 >> 8);
               int var29 = var5.field3324 * -801334763 + (var5.field3330 * 452742721 * var13 >> 8);
               if (var1 >= var17 && var1 <= var21 && var2 >= var25 && var2 <= var29) {
                  return true;
               }
            }
         } else if (var5.field3320 * 185187997 == 5) {
            int var14 = var2 - var5.minTileY * 1051489521;
            if (var14 > 0) {
               int var18 = var5.maxY * 1482829177 + (var5.maxTileY * -1280212712 * var14 >> 8);
               int var22 = var5.field3337 * -5545794 + (var5.type * -1427044117 * var14 >> 8);
               int var26 = var5.minTileX * -1389987515 + (var5.maxTileX * 2026020675 * var14 >> 8);
               int var30 = var5.minZ * 1302015068 + (var5.minX * -2059449263 * var14 >> 8);
               if (var1 >= var18 && var1 <= var22 && var3 >= var26 && var3 <= var30) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lka;)V")
   @ObfuscatedName("mb")
   public void method5766(Projection var1) {
      this.field2879.method6541(Rasterizer3D.clips.field3431);
      Rasterizer3D.clips.field3431.method6541(this.modelColorOverride);

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = this.field3019 - 1; var3 >= 0; var3--) {
            rl16 var4 = this.field2914[var3];
            if (var4.field5574) {
               client.field1025.drawZoneAlpha(var1, this, var2, var4.field5568, var4.field5570);

               for (int var5 = 0; var5 < var4.field5567.size(); var5++) {
                  GameObject var6 = (GameObject)var4.field5567.get(var5);
                  if (var6.plane * 1291248351 == var2 && var6.renderable instanceof Scene) {
                     Scene var7 = (Scene)var6.renderable;
                     var7.method5766(var7.field2918);
                  }
               }
            }
         }
      }

      client.field1025.drawPass(var1, this, 1);
      client.field1025.postSceneDraw(this);
      this.method5789();
      Rasterizer3D.clips.field3431.method6541(this.field2879);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("co")
   boolean method5603(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * this.field2938 + var3 * this.field2939 + var4 * this.field2964 + var5, var6);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;II)V")
   @ObfuscatedName("yf")
   public static void method5618(Scene var0, int var1, int var2) {
      if (var0 == null) {
         var0.visibilityMap(var1, var1);
      } else {
         var0.field3008 = var1;
         var0.field3013 = var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIII)V")
   @ObfuscatedName("oz")
   public static void method5519(Scene var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5716(var1, var1, var1, var1);
      }

      Tile var5 = var0.tiles[var1][var2][var3];
      if (var5 != null) {
         WallDecoration var6 = var5.wallDecoration;
         if (var6 != null) {
            var6.method6326(var6.yOffset * 1804672227 * var4 / 16, var6.field3297 * 751081245 * var4 / 16, (byte)-122);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)V")
   @ObfuscatedName("ij")
   public void method5617(int[] var1, int var2, int var3, int var4, int var5) {
      this.field2946 = var1;
      this.field3011 = var2;
      this.field3007 = var3;
      this.field3009 = var4;
      this.field3004 = var5;
      this.field3010 = 0;
      this.field3005 = 0;
      this.field3012 = var4;
      this.field3006 = var5;
      this.field3003 = var4 / 2;
      this.field3002 = var5 / 2;
      this.field2959.set(0, this.field2959.size());
      this.field2956.set(0, this.field2956.size());
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kt")
   @Override
   void vmethod233(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      TransformationMatrix var15 = SecureUrlRequester.method3893(-1863263494);
      class456 var16 = BuddyRankComparator.method3976(-814754263);
      var16.field5516.method9303(class6.method119(var1, 238602346), 0.0F, 0.0F, -1574760321);
      var16.field5515.method9868(var4, var5, var6, 790370548);
      class456 var17 = BuddyRankComparator.method3976(-814754263);
      var17.field5515.method9868(-(this.xSize * 1926251131) - this.field2923, this.field2924, -(this.ySize * 64) - this.field2925, -1480171953);
      TransformationMatrix var18 = SecureUrlRequester.method3893(179040731);
      var18.method10017(var17, (byte)125);
      var15.method9987(1.0F, this.Scene_scale, 1.0F, 1.0F, -1830509051);
      TransformationMatrix.method9959(var18, var15, (byte)-34);
      TransformationMatrix.method9959(var18, this.field2922, (byte)-48);
      var15.method10017(var16, (byte)119);
      TransformationMatrix.method9959(var18, var15, (byte)-43);
      TransformationMatrix.method10012(var15, var18, -663272296);
      var15.method9982(608803993);
      this.Scene_cameraX = (int)var15.method9995(var7, var8, var9, -2076565953);
      this.Scene_cameraY = (int)var15.method9996(var7, var8, var9, (byte)-24);
      this.Scene_cameraZ = (int)var15.method9997(var7, var8, var9, (short)1603);
      this.Scene_cameraXTile = this.Scene_cameraX / -834480613;
      this.Scene_cameraYTile = this.Scene_cameraZ / -606022068;
      this.Scene_entityX = (int)var15.method9995(var12, 0.0F, var13, -1880551593) / 128;
      this.Scene_entityY = (int)var15.method9997(var12, 0.0F, var13, (short)1603) / 128;
      class463 var19 = new class463();
      TransformationMatrix var20 = SecureUrlRequester.method3893(546116740);
      class463.method9764(var19, class6.method119(-var2, -844490818), -1314816461);
      var19.method9766(class6.method119(-var3, -1673633884), -1739121717);
      var19.method9775(var7, var8, var9, 1645742754);
      var20.method9972(var19, (byte)73);
      var20.method9982(-2006267263);
      var16.method9422((short)15432);
      var17.method9422((short)2227);
      TransformationMatrix.method9929(var15, (byte)1);
      TransformationMatrix.method9959(var18, var20, (byte)-6);
      FloatProjection var21 = new FloatProjection(var18);
      var21.method6009(var10);
      ModelData0.method6707((byte)-90);
      this.projectScene(var21, var14, Rasterizer3D.clips.currentFaceAlpha != 1);
      ModelData0.method6707((byte)-79);
      TransformationMatrix.method9929(var20, (byte)1);
      TransformationMatrix.method9929(var18, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aw")
   public void setLinkBelow(int var1, int var2) {
      int var3 = var1 - this.field3020;
      int var4 = var2 - this.field2880;
      this.method5481(this.method5688(0, var1, var2), this.field2897);

      for (int var5 = 0; var5 < 3; var5++) {
         int var6 = this.method5688(var5, var1, var2);
         this.method5801(var6 + this.field2890, var6);
         if (this.method5738(var6)) {
            byte var7 = this.field2907[var6];

            for (int var8 = 0; var8 < var7; var8++) {
               GameObject var9 = this.field2887[var6 * 5 + var8];
               long var10 = var9.tag * 1608625415500949283L;
               int var12 = (int)(var10 >> 16 & 7L);
               if (var12 == 2 && var9.centerY * 1666005069 == var3 && var9.endX * 889015863 == var4) {
                  var9.centerX = (var9.startY * 1291248351 - 1) * -786081505;
               }
            }

            BoundaryObject var15 = this.field2903[var6];
            if (var15 != null) {
               var15.field3470--;
            }

            FloorDecoration var16 = this.field2905[var6];
            if (var16 != null) {
               var16.field3208--;
            }

            WallDecoration var17 = this.field2904[var6];
            if (var17 != null) {
               var17.field3300--;
            }
         }
      }

      int var13 = this.method5688(0, var1, var2);
      if (!this.method5764(var13)) {
         this.method5715(var13, 0, var1, var2);
      }

      if (this.field3030[0][var1][var2] == null) {
         this.field3030[0][var1][var2] = new rl8(this, var13);
         this.removeFloorDecoration(0, var1, var2);
      }

      this.field2911[var13] = this.field2911[var13] | 32;
      int var14 = this.method5690(3, var1, var2);
      this.method5694(this.field2891, var14);
      this.field2911[var14] = this.field2911[var14] & -2;
      this.method5768(this.field2899);
      this.field2886[3][var1][var2] = null;
      this.method5526(3, var2, var2);
      this.field2886[0][var1][var2].field5671 = new rl8(this, var14);
   }

   @ObfuscatedSignature(descriptor = "(IIIILjz;JI)V")
   @ObfuscatedName("ej")
   public void method5746(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      int var9 = var2 + this.Scene_plane;
      int var10 = var3 + this.field3015;
      if (var5 != null) {
         int var11 = this.method5690(var1, var9, var10);
         FloorDecoration var12 = new FloorDecoration();
         var12.method6196(var5);
         var12.method6194(var2 * 128 + 64);
         var12.method6198(var3 * 128 + 64);
         var12.method6199(var4);
         var12.method6197(var6);
         var12.method6199(var8);
         rl8 var13 = this.field3030[var1][var9][var10];
         if (var13 == null) {
            this.field3030[var1][var9][var10] = var13 = new rl8(this, var11);
            this.method5527(var1, var9, var10);
         }

         if (!this.method5737(var11)) {
            this.method5488(var11, var1, var9, var10);
         }

         assert this.field2905[var11] == null;

         this.field2905[var11] = var12;
         this.field2911[var11] = this.field2911[var11] | 2048;
         this.field2910[var11] = this.field2910[var11] | 1080863910568919040L;
         if (var5 instanceof DynamicObject) {
            rl16 var14 = this.field2912[var9 >> 3][var10 >> 3];
            var14.field5567.add(var12);
            this.method5691((DynamicObject)var5);
         }

         this.method5779(var5, 0, var12.getId(), var12.getZ(), var12.method6193(), var2, var3);
         var12.field3208 = var1;
         if (this.field3024) {
            GroundObjectSpawned var17 = new GroundObjectSpawned();
            var17.setTile(var13);
            var17.setGroundObject(var12);
            SecureUrlRequester.client.getCallbacks().post(var17);
         }

         if (this.field3024 && client.field1025 != null) {
            client.field1025.invalidateZone(this, var9 >> 3, var10 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjz;IZJI)Z")
   @ObfuscatedName("be")
   boolean newGameObject(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14
   ) {
      for (int var15 = var2; var15 < var2 + var4; var15++) {
         for (int var16 = var3; var16 < var3 + var5; var16++) {
            if (var15 < 0 || var16 < 0 || var15 >= this.Scene_cameraXTileMin || var16 >= this.field2990) {
               return false;
            }

            Tile var17 = this.tiles[var1][var15][var16];
            if (var17 != null && var17.field3222 * 1265471425 >= 5) {
               return false;
            }
         }
      }

      GameObject var21 = new GameObject();
      var21.tag = var12 * -108185211891154805L;
      var21.centerY = var14 * -1258758361;
      var21.flags = var1 * -856944119;
      var21.field3278 = var6 * -234643653;
      var21.lastDrawn = var7 * -646790119;
      var21.plane = var8 * 2086167211;
      var21.renderable = var9;
      var21.flags = var10 * -702273745;
      var21.flags = var2 * -850870139;
      var21.endX = var3 * -153499769;
      var21.lastDrawn = (var2 + var4 - 1) * 1351710020;
      var21.flags = (var3 + var5 - 1) * 51178894;

      for (int var22 = var2; var22 < var2 + var4; var22++) {
         for (int var23 = var3; var23 < var3 + var5; var23++) {
            int var18 = 0;
            if (var22 > var2) {
               var18++;
            }

            if (var22 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var23 > var3) {
               var18 += 8;
            }

            if (var23 < var3 + var5 - 1) {
               var18 += 2;
            }

            for (int var19 = var1; var19 >= 0; var19--) {
               if (this.tiles[var19][var22][var23] == null) {
                  this.tiles[var19][var22][var23] = new Tile(var19, var22, var23);
               }
            }

            Tile var24 = this.tiles[var1][var22][var23];
            var24.gameObjects[var24.field3223 * -2000692492] = var21;
            var24.gameObjectEdgeMasks[var24.minPlane * 1265471425] = var18;
            var24.gameObjectsCount = (var24.originalPlane * -832586231 | var18) * -397683571;
            var24.field3220 = var24.drawGameObjectEdges + 1691254849;
         }
      }

      if (var11) {
         if (this.xSize >= this.tempGameObjects.length) {
            this.tempGameObjects = Arrays.copyOf(this.tempGameObjects, this.tempGameObjects.length * 2);
         }

         GameObject[] var10000 = this.gameObjects;
         int var10001 = this.Scene_entityY;
         this.field3005 = this.Scene_entityY + 1;
         var10000[var10001] = var21;
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Lka;)V")
   @ObfuscatedName("za")
   public void method5772(Projection var1) {
      assert !SecureUrlRequester.client.isGpu();

      boolean var2 = this.field2880 != 0 && this.worldViewId == -1;
      this.tileUpdateCount = 0;

      for (int var3 = this.minPlane; var3 < this.planes; var3++) {
         for (int var4 = this.Scene_cameraXTileMin; var4 < this.Scene_cameraXTileMax; var4++) {
            for (int var5 = this.Scene_cameraYTileMin; var5 < this.Scene_cameraYTileMax; var5++) {
               int var6 = this.method5690(var3, var4, var5);
               if (this.method5737(var6)) {
                  int var7 = this.method5625(var6);
                  int var8 = this.field2888[this.field3023.plane * 2115028565][var4][var5];
                  if ((var7 <= this.Scene_plane || var2)
                     && (
                        this.worldViewId != -1
                           || this.method5803(
                              var4 - this.Scene_cameraXTile + this.field2945 + this.Scene_offsetOccluder,
                              var5 - this.Scene_cameraYTile + this.field2940 + this.Scene_offsetOccluder
                           )
                           || this.tileHeights[var3][var4][var5] - this.Scene_cameraY >= 2000
                     )
                     && (!var2 || this.field3023.plane * 2115028565 >= var7 || var8 == 0 || !this.field2916.contains(var8))) {
                     this.method5697(var1, var6);
                  }
               }
            }
         }
      }

      this.method5789();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hf")
   public void method5703() {
      for (int var1 = 0; var1 < this.xSize >> 3; var1++) {
         for (int var2 = 0; var2 < this.ySize >> 3; var2++) {
            rl16 var3 = this.field2912[var1][var2];
            boolean var4 = false;

            for (TileObject var6 : var3.field5566) {
               if (var6 instanceof GameObject) {
                  GameObject var10 = (GameObject)var6;
                  var4 |= this.method5773(var10.renderable);
               } else if (var6 instanceof BoundaryObject) {
                  BoundaryObject var9 = (BoundaryObject)var6;
                  var4 |= this.method5773(var9.renderable1) || this.method5773(var9.renderable2);
               } else if (!(var6 instanceof WallDecoration)) {
                  if (var6 instanceof FloorDecoration) {
                     FloorDecoration var8 = (FloorDecoration)var6;
                     var4 |= this.method5773(var8.renderable);
                  }
               } else {
                  WallDecoration var7 = (WallDecoration)var6;
                  var4 |= this.method5773(var7.renderable1) || this.method5773(var7.renderable2);
               }
            }

            if (var4 && client.field1025 != null) {
               client.field1025.invalidateZone(this, var3.field5568, var3.field5570);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;Z)V")
   @ObfuscatedName("df")
   void updateVisibleTilesAndOccluders(Projection var1, boolean var2) {
      this.Scene_cameraYTileMax = 0;

      for (int var3 = this.Scene_cameraZ; var3 < this.Scene_cameraX; var3++) {
         Tile[][] var4 = this.tiles[var3];

         for (int var5 = this.field3008; var5 < this.field3009; var5++) {
            for (int var6 = this.field2945; var6 < this.tileUpdateCount; var6++) {
               Tile var7 = var4[var5][var6];
               if (var7 != null) {
                  if (var7.gameObjectsEdgeMask * -295997735 <= this.field2924
                     && (
                        !var2
                           || this.method5621(
                              var5 - this.Scene_cameraY + this.field2990 + this.Scene_cameraYTileMax,
                              var6 - this.field3001 + this.Scene_selectedScreenX + this.field3003
                           )
                           || this.tileHeights[var3][var5][var6] - this.Scene_cameraX >= 2000
                     )) {
                     var7.drawSecondary = true;
                     var7.drawSecondary = true;
                     if (var7.drawGameObjectEdges * 1265471425 > 0) {
                        var7.drawPrimary = true;
                     } else {
                        var7.drawGameObjects = false;
                     }

                     this.field3005 = this.field3009 + 1;
                  } else {
                     var7.drawPrimary = false;
                     var7.drawGameObjects = false;
                     var7.plane = 0;
                  }
               }
            }
         }
      }

      int var14 = Math.abs(this.minPlane);
      int var15 = Math.abs(this.tempGameObjectsCount);

      for (int var16 = this.field3013; var16 < this.Scene_cameraXTileMin; var16++) {
         Tile[][] var18 = this.tiles[var16];

         for (int var20 = -(this.Scene_cameraX + var14); var20 <= 0; var20++) {
            int var8 = this.Scene_cameraYTileMin + var20;
            int var9 = this.Scene_selectedScreenY - var20;
            if (var8 >= this.ySize || var9 < this.ySize) {
               for (int var10 = -(this.field3010 + var15); var10 <= 0; var10++) {
                  int var11 = this.Scene_offsetOccluder + var10;
                  int var12 = this.field3006 - var10;
                  if (var8 >= this.field3005 && var8 < this.Scene_drawnCount) {
                     if (var11 >= this.tileUpdateCount && var11 < this.field3007) {
                        Tile var13 = var18[var8][var11];
                        if (var13 != null && var13.drawSecondary) {
                           this.method5665(var1, var13, true);
                        }
                     }

                     if (var12 >= this.field2990 && var12 < this.field3003) {
                        Tile var27 = var18[var8][var12];
                        if (var27 != null && var27.drawSecondary) {
                           this.method5665(var1, var27, true);
                        }
                     }
                  }

                  if (var9 >= this.Scene_currentOccludersCount && var9 < this.Scene_cameraX) {
                     if (var11 >= this.Scene_baseX && var11 < this.Scene_drawnCount) {
                        Tile var28 = var18[var9][var11];
                        if (var28 != null && var28.drawGameObjects) {
                           this.method5665(var1, var28, true);
                        }
                     }

                     if (var12 >= this.Scene_cameraX && var12 < this.Scene_selectedScreenY) {
                        Tile var29 = var18[var9][var12];
                        if (var29 != null && var29.drawPrimary) {
                           this.drawTile(var1, var29, true);
                        }
                     }
                  }

                  if (this.field3002 == 0) {
                     this.occlude();
                     Rasterizer3D.clips.field3431.method6530(this.field2879);
                     return;
                  }
               }
            }
         }
      }

      for (int var17 = this.field3008; var17 < this.field3008; var17++) {
         Tile[][] var19 = this.tiles[var17];

         for (int var21 = -(this.field3007 + var14); var21 <= 0; var21++) {
            int var22 = this.Scene_cameraXTileMin + var21;
            int var23 = this.Scene_selectedScreenX - var21;
            if (var22 >= this.field3011 || var23 < this.field3013) {
               for (int var24 = -(this.xSize + var15); var24 <= 0; var24++) {
                  int var25 = this.field3008 + var24;
                  int var26 = this.Scene_currentOccludersCount - var24;
                  if (var22 >= this.field3002 && var22 < this.tileUpdateCount) {
                     if (var25 >= this.Scene_cameraYTileMax && var25 < this.Scene_cameraYTileMin) {
                        Tile var30 = var19[var22][var25];
                        if (var30 != null && var30.drawGameObjects) {
                           this.method5663(var1, var30, false);
                        }
                     }

                     if (var26 >= this.field3013 && var26 < this.field3004) {
                        Tile var31 = var19[var22][var26];
                        if (var31 != null && var31.drawGameObjects) {
                           this.drawTile(var1, var31, false);
                        }
                     }
                  }

                  if (var23 >= this.Scene_cameraZ && var23 < this.Scene_cameraXTileMin) {
                     if (var25 >= this.Scene_baseY && var25 < this.Scene_baseX) {
                        Tile var32 = var19[var23][var25];
                        if (var32 != null && var32.drawPrimary) {
                           this.drawTile(var1, var32, false);
                        }
                     }

                     if (var26 >= this.field3013 && var26 < this.field2945) {
                        Tile var33 = var19[var23][var26];
                        if (var33 != null && var33.drawSecondary) {
                           this.method5663(var1, var33, false);
                        }
                     }
                  }

                  if (this.tempGameObjectsCount == 0) {
                     this.method5668();
                     Rasterizer3D.clips.field3431.method6530(this.field2879);
                     return;
                  }
               }
            }
         }
      }

      Rasterizer3D.clips.field3431.method6530(this.field2879);
      this.method5668();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;)V")
   @ObfuscatedName("hm")
   public static void method5637(Scene var0) {
      if (var0 == null) {
         var0.getUnderlayIds();
      }

      var0.viewportWalking = true;
   }

   @ObfuscatedSignature(descriptor = "(III)Lkf;")
   @ObfuscatedName("bt")
   public WallDecoration getWallDecoration(int var1, int var2, int var3) {
      var2 += this.field2880;
      var3 += this.field2880;
      int var4 = this.method5688(var1, var2, var3);
      return this.method5738(var4) ? this.field2904[var4] : null;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bb")
   public void removeGameObject(int var1, int var2, int var3) {
      int var4 = var2 + this.field2924;
      int var5 = var3 + this.Scene_plane;
      int var6 = this.method5690(var1, var4, var5);
      if (this.method5764(var6)) {
         byte var7 = this.field2909[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = this.field2887[var6 * 5 + var8];
            long var10 = var9.tag * 1608625415500949283L;
            int var12 = (int)(var10 >> 16 & 7L);
            if (var12 == 2 && var2 == var9.plane * 1666005069 && var3 == var9.startX * 889015863) {
               this.removeGameObject((net.runelite.api.GameObject)var9);
               return;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;)V")
   @ObfuscatedName("il")
   public void method5702(Projection var1) {
      boolean var2 = this.field2880 != 0 && this.worldViewId == -1;
      int var3 = SecureUrlRequester.client.isGpu() ? field3021 : this.Scene_offsetOccluder;

      for (int var4 = this.planes - 1; var4 >= this.minPlane; var4--) {
         boolean var5 = this.method5748(this.Scene_cameraX, this.Scene_cameraY, this.Scene_cameraZ, var4, this.planes - 1 == var4);

         for (int var6 = this.Scene_cameraXTileMin; var6 < this.Scene_cameraXTileMax; var6++) {
            int var7 = var5 ? field2866[var6] : this.Scene_cameraYTileMin;
            int var8 = var5 ? field2867[var6] : this.Scene_cameraYTileMax - 1;

            for (int var9 = var7; var9 <= var8; var9++) {
               int var10 = this.method5690(var4, var6, var9);
               if (this.method5737(var10)) {
                  int var11 = this.method5625(var10);
                  int var12 = this.field2888[this.field3023.plane * 2115028565][var6][var9];
                  if ((var11 <= this.Scene_plane || var2)
                     && (
                        this.worldViewId != -1
                           || var5
                           || this.method5803(
                              var6 - this.Scene_cameraXTile + this.field2945 + this.Scene_offsetOccluder,
                              var9 - this.Scene_cameraYTile + this.field2940 + this.Scene_offsetOccluder
                           )
                           || this.tileHeights[var4][var6][var9] - this.Scene_cameraY >= 2000
                     )
                     && (!var2 || this.field3023.plane * 2115028565 >= var11 || var12 == 0 || !this.field2916.contains(var12))) {
                     int var13 = this.field2900[var10];
                     var13 |= 6;
                     var13 |= this.field2907[var10] > 0 ? 8 : 0;
                     var13 &= -16711697;
                     this.field2900[var10] = var13;
                     this.tileUpdateCount++;
                  } else {
                     this.field2900[var10] = this.field2900[var10] & -23;
                  }
               }
            }
         }
      }

      int var16 = Math.abs(this.field2945);
      int var17 = Math.abs(this.field2940);

      label141:
      for (int var18 = 0; var18 < 2; var18++) {
         boolean var19 = var18 == 0;

         for (int var20 = this.minPlane; var20 < this.planes; var20++) {
            for (int var21 = -(var16 + var3); var21 <= 0; var21++) {
               int var22 = var21 + this.Scene_cameraXTile;
               int var23 = this.Scene_cameraXTile - var21;
               if (var22 >= this.Scene_cameraXTileMin || var23 < this.Scene_cameraXTileMax) {
                  for (int var24 = -(var17 + var3); var24 <= 0; var24++) {
                     int var28 = var24 + this.Scene_cameraYTile;
                     int var14 = this.Scene_cameraYTile - var24;
                     if (var22 >= this.Scene_cameraXTileMin && var22 < this.Scene_cameraXTileMax) {
                        if (var28 >= this.Scene_cameraYTileMin && var28 < this.Scene_cameraYTileMax) {
                           int var15 = this.method5690(var20, var22, var28);
                           if ((this.field2900[var15] & 3) == 3) {
                              this.method5707(var1, var15, var19);
                           }
                        }

                        if (var14 >= this.Scene_cameraYTileMin && var14 < this.Scene_cameraYTileMax) {
                           int var29 = this.method5690(var20, var22, var14);
                           if ((this.field2900[var29] & 3) == 3) {
                              this.method5707(var1, var29, var19);
                           }
                        }
                     }

                     if (var23 >= this.Scene_cameraXTileMin && var23 < this.Scene_cameraXTileMax) {
                        if (var28 >= this.Scene_cameraYTileMin && var28 < this.Scene_cameraYTileMax) {
                           int var30 = this.method5690(var20, var23, var28);
                           if ((this.field2900[var30] & 3) == 3) {
                              this.method5707(var1, var30, var19);
                           }
                        }

                        if (var14 >= this.Scene_cameraYTileMin && var14 < this.Scene_cameraYTileMax) {
                           int var31 = this.method5690(var20, var23, var14);
                           if ((this.field2900[var31] & 3) == 3) {
                              this.method5707(var1, var31, var19);
                           }
                        }
                     }

                     if (this.tileUpdateCount == 0) {
                        break label141;
                     }
                  }
               }
            }
         }
      }

      this.method5789();
   }

   @ObfuscatedSignature(descriptor = "(Lka;Ljz;IIIIJ)V")
   @ObfuscatedName("bs")
   public void method5744(Projection var1, Renderable var2, int var3, int var4, int var5, int var6, long var7) {
      var1.method6233(var2, var3, var4, var5, var6, var7);
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("fr")
   public long method5732(int var1, int var2, int var3) {
      var2 += this.field3016;
      var3 += this.baseY;
      int var4 = this.method5688(var1, var2, var3);
      return this.method5737(var4) && this.field2903[var4] != null ? this.field2903[var4].tag * -4972732868916429537L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("iy")
   public void method5687(int var1, int var2, int var3) {
      if (this.field3030 != null) {
         int var4 = var2 - this.field3014;
         int var5 = var3 - this.field3014;
         if (var4 >= 0 && var4 < this.field3030[var1].length && var5 >= 0 && var5 < this.field3030[var1][var4].length) {
            this.field3030[var1][var4][var5] = this.field2886[var1][var2][var3];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bd")
   public void method5741(int var1, int var2, int var3) {
      if (var2 >= 0 && var2 < this.field2990 && var3 >= 0 && var3 < this.Scene_selectedScreenY) {
         int var4 = this.method5688(var1, var2, var3);
         if (this.method5738(var4)) {
            this.setRoofRemovalMode(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljz;Z)Z")
   @ObfuscatedName("if")
   public static boolean method5720(Renderable var0, boolean var1) {
      return SecureUrlRequester.client.getCallbacks().draw(var0, var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("se")
   public int method5625(int var1) {
      int var2 = var1 >> this.field2891 & 3;
      return (this.field2900[var1] & 64) != 0 ? 0 : var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljm;IIIII)V")
   @ObfuscatedName("bh")
   void method5468(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for (int var12 = var2; var12 <= var2 + 1; var12++) {
         if (var12 != this.Scene_cameraZ) {
            for (int var13 = var8; var13 <= var9; var13++) {
               if (var13 >= 0 && var13 < this.Scene_cameraYTile) {
                  for (int var14 = var10; var14 <= var11; var14++) {
                     if (var14 >= 0 && var14 < this.Scene_cameraZ && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        int var15 = this.method5690(var12, var13, var14);
                        if (this.method5764(var15)) {
                           int var16 = this.method5688(var12, var13, var14) - this.method5690(var2, var3, var4);
                           BoundaryObject var17 = this.field2903[var15];
                           if (var17 != null) {
                              if (var17.renderable2 instanceof ModelData) {
                                 ModelData var18 = (ModelData)var17.renderable1;
                                 ModelData.method6127(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7);
                              }

                              if (var17.renderable2 instanceof ModelData) {
                                 ModelData var24 = (ModelData)var17.renderable1;
                                 ModelData.method6127(var1, var24, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7);
                              }
                           }

                           byte var25 = this.field2909[var15];

                           for (int var19 = 0; var19 < var25; var19++) {
                              GameObject var20 = this.field2887[var15 * 5 + var19];
                              if (var20 != null && var20.renderable instanceof ModelData) {
                                 ModelData var21 = (ModelData)var20.renderable;
                                 int var22 = var20.centerY * 1553138359 - var20.field3278 * 1666005069 + 1;
                                 int var23 = var20.orientation * -2094327665 - var20.plane * 889015863 + 1;
                                 ModelData.method6127(
                                    var1,
                                    var21,
                                    (var20.startY * 1666005069 + this.field3019 - var3) * 128 + (var22 - var5) * 64,
                                    var16,
                                    (var20.plane * 889015863 + this.field3018 - var4) * 128 + (var23 - var6) * 64,
                                    var7
                                 );
                              }
                           }
                        }
                     }
                  }
               }
            }

            var8--;
            var7 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;III)Lkf;")
   @ObfuscatedName("wr")
   public static WallDecoration method5788(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.getWallDecoration(var1, var1, var1);
      } else {
         var2 += var0.field3014;
         var3 += var0.field3014;
         int var4 = var0.method5690(var1, var2, var3);
         return var0.method5737(var4) ? var0.field2904[var4] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("de")
   public void method5713(int var1) {
      int var2 = (var1 << 1) + 1;
      var2 = this.field2911[var2];
      var2 <<= 1;
      int var5 = var1 << 1;
      this.field2911[var2] = this.field2911[var5];
      var2 = var1 << 1;
      var2 = this.field2911[var2];
      var2 = (var2 << 1) + 1;
      int var9 = (var1 << 1) + 1;
      this.field2911[var2] = this.field2911[var9];
      var2 = var1 << 1;
      int var11 = (var1 << 1) + 1;
      this.field2911[var2] = this.field2911[var11] = this.field2897;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIILjz;JLjz;Ljz;)V")
   @ObfuscatedName("oj")
   public static void method5497(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
      if (var0 == null) {
         var0.method5687(var1, var1, var1);
      } else {
         ItemLayer var10 = new ItemLayer();
         var10.third = var5;
         var10.x = var2 * 1646131328 + -1324417984;
         var10.y = var3 * 1939290752 + 969645376;
         var10.z = var4 * 2083339729;
         var10.tag = var6;
         var10.first = var8;
         var10.second = var9;
         int var11 = 0;
         Tile var12 = var0.tiles[var1][var2][var3];
         if (var12 != null) {
            for (int var13 = 0; var13 < var12.gameObjectsCount * 1265471425; var13++) {
               if ((var12.gameObjects[var13].flags * 1362575399 & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) {
                  Model var14 = (Model)var12.gameObjects[var13].renderable;
                  var14.method6864();
                  if (var14.height * -1272589951 > var11) {
                     var11 = var14.height * -1272589951;
                  }
               }
            }
         }

         var10.height = var11 * -166504297;
         if (var0.tiles[var1][var2][var3] == null) {
            var0.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         var0.tiles[var1][var2][var3].itemLayer = var10;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;III)V")
   @ObfuscatedName("fn")
   public void method5815(ModelData var1, int var2, int var3, int var4) {
      this.method5754(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("ct")
   boolean method5600(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var2 * this.field2938 + var3 * this.worldViewId + var4 * this.field2962 + var5);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cb")
   boolean method5595(int var1, int var2, int var3, int var4) {
      return method5581(this, this.field2958, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ci")
   void visibilityMap(int var1, int var2) {
      Tile var3 = this.tiles[0][var1][var2];

      for (int var4 = 0; var4 < 3; var4++) {
         Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
         if (var5 != null) {
            var5.originalPlane = var5.y - 1437298339;

            for (int var6 = 0; var6 < var5.originalPlane * 1265471425; var6++) {
               GameObject var7 = var5.gameObjects[var6];
               long var9 = 1608625415500949283L * var7.tag;
               boolean var8 = classPC.method8712(var9) == 2;
               if (var8 && var7.field3278 * 1666005069 == var1 && var7.startY * 889015863 == var2) {
                  var7.plane = var7.centerY - -786081505;
               }
            }
         }
      }

      if (this.tiles[0][var1][var2] == null) {
         this.tiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.tiles[0][var1][var2].linkedBelowTile = var3;
      this.tiles[3][var1][var2] = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("bk")
   public static boolean method5586(Scene var0, BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var2 * var0.field2960 + var3 * var0.field2961 + var4 * var0.field2962 + var5, var6);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cw")
   public void menuOpen(boolean var1) {
      if (!WidgetDefinition.method7971(this) || var1) {
         this.viewportWalking = true;
         this.viewportWalking = var1;
         this.field3018 = -1;
         this.field3017 = -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lka;Lrl16;)V")
   @ObfuscatedName("qn")
   public void method5782(Projection var1, rl16 var2) {
      for (int var3 = 0; var3 < var2.field5567.size(); var3++) {
         GameObject var4 = (GameObject)var2.field5567.get(var3);
         if (var4.renderable instanceof Scene) {
            var1.method6233(
               var4.renderable,
               var4.orientation * 46801735,
               var4.centerX * 1204024827,
               var4.z * 683703035,
               var4.centerY * 1465977803,
               var4.tag * 1608625415500949283L
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cj")
   public void method5638() {
      this.viewportWalking = true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ca")
   public boolean shouldSendWalk() {
      return this.viewportWalking && this.field3015 != -1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("oq")
   public void method5716(int var1, int var2, int var3, int var4) {
      var2 += this.field3017;
      var3 += this.field2882;
      int var5 = this.method5688(var1, var2, var3);
      if (this.method5737(var5)) {
         WallDecoration var6 = this.field2904[var5];
         if (var6 != null) {
            var6.method6333(var4 * var6.yOffset * 1804672227 / 16, var4 * var6.field3298 * 751081245 / 16);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)I")
   @ObfuscatedName("qm")
   public static int method5568(Scene var0, int var1, int var2, int var3) {
      return (
            var0.tileHeights[var1][var2][var3]
               + var0.tileHeights[var1][var2 + 1][var3]
               + var0.tileHeights[var1][var2][var3 + 1]
               + var0.tileHeights[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)Z")
   @ObfuscatedName("sr")
   public static boolean method5673(Scene var0, int var1, int var2, int var3) {
      int var4 = var0.field2952[var1][var2][var3];
      if (var4 == -var0.Scene_drawnCount) {
         return false;
      } else if (var4 == var0.Scene_drawnCount) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (var0.method5683(var5 + 1, var0.tileHeights[var1][var2][var3], var6 + 1)
            && var0.method5683(var5 + 128 - 1, var0.tileHeights[var1][var2 + 1][var3], var6 + 1)
            && var0.method5683(var5 + 128 - 1, var0.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
            && var0.method5683(var5 + 1, var0.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
            var0.field2952[var1][var2][var3] = var0.Scene_drawnCount;
            return true;
         } else {
            var0.field2952[var1][var2][var3] = -var0.Scene_drawnCount;
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fz")
   public void method5555(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.planes; var4++) {
         for (int var5 = 0; var5 < this.planes; var5++) {
            for (int var6 = 0; var6 < this.Scene_cameraYTileMax; var6++) {
               Tile var7 = this.tiles[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.boundaryObject;
                  if (var8 != null && var8.renderable2 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.renderable2;
                     class144.method3966(this, var9, var4, var5, var6, 1, 1);
                     if (var8.renderable2 instanceof ModelData) {
                        ModelData var10 = (ModelData)var8.renderable2;
                        class144.method3966(this, var10, var4, var5, var6, 1, 1);
                        ModelData.method6021(var9, var10, 0, 0, 0, false);
                        var8.renderable1 = ModelData.method6106(var10, var10.contrast, var10.ambient, var1, var2, var3);
                     }

                     var8.renderable2 = ModelData.method6106(var9, var9.contrast, var9.ambient, var1, var2, var3);
                  }

                  for (int var12 = 0; var12 < var7.field3223 * -1393464713; var12++) {
                     GameObject var14 = var7.gameObjects[var12];
                     if (var14 != null && var14.renderable instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.renderable;
                        class144.method3966(
                           this,
                           var11,
                           var4,
                           var5,
                           var6,
                           var14.centerY * -1438843607 - var14.startX * 1340534914 + 1,
                           var14.lastDrawn * -2094327665 - var14.endX * 732690608 + 1
                        );
                        var14.renderable = ModelData.method6106(var11, var11.contrast, var11.contrast, var1, var2, var3);
                     }
                  }

                  FloorDecoration var13 = var7.floorDecoration;
                  if (var13 != null && var13.renderable instanceof ModelData) {
                     ModelData var15 = (ModelData)var13.renderable;
                     this.method5556(var15, var4, var5, var6);
                     var13.renderable = ModelData.method6106(var15, var15.contrast, var15.contrast, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("ht")
   boolean method5598(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5603(this.field2921, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(III)Lkd;")
   @ObfuscatedName("fv")
   public GameObject method5735(int var1, int var2, int var3) {
      int var4 = var2 + this.field2923;
      int var5 = var3 + this.field2883;
      int var6 = this.method5688(var1, var4, var5);
      if (!this.method5737(var6)) {
         return null;
      } else {
         byte var7 = this.field2907[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = this.field2887[var6 * 5 + var8];
            long var10 = var9.tag * 1608625415500949283L;
            int var12 = (int)(var10 >> 16 & 7L);
            if (var12 == 2 && var2 == var9.centerY * 1666005069 && var3 == var9.z * 889015863) {
               return var9;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjava/util/Set;)Z")
   @ObfuscatedName("mb")
   public boolean method5769(int var1, int var2, int var3, int var4, int var5, Set var6) {
      boolean var7 = false;
      int var8 = var5 + ((this.field3028[1][var1 + this.field3014][var2 + this.field3014] & 2) >> 1) & 3;

      for (int var9 = var1; var9 <= var3; var9++) {
         for (int var10 = var2; var10 <= var4; var10++) {
            var7 |= (this.field3028[var8][var9 + this.field3014][var10 + this.field3014] & 8) != 0;
         }
      }

      var5 = var7 ? 0 : var5;
      boolean var14 = this.field2880 != 0 && this.worldViewId == -1;
      if (var5 >= this.minPlane && (var14 || var5 <= this.Scene_plane)) {
         if (var5 > this.field3023.plane * 2115028565 && !var6.isEmpty()) {
            for (int var15 = var1; var15 <= var3; var15++) {
               for (int var11 = var2; var11 <= var4; var11++) {
                  int var12 = this.field2888[this.field3023.plane * 2115028565][var15 + this.field3014][var11 + this.field3014];
                  if (var6.contains(var12)) {
                     return false;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lku;")
   @ObfuscatedName("bp")
   public BoundaryObject getBoundaryObject(int var1, int var2, int var3) {
      var2 += this.field2925;
      var3 += this.field2882;
      int var4 = this.method5690(var1, var2, var3);
      return this.method5738(var4) ? this.field2903[var4] : null;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("dh")
   boolean method5674(int var1, int var2, int var3) {
      int var4 = this.tileHeights[var1][var2][var3];
      if (var4 == -this.tempGameObjectsCount) {
         return false;
      } else if (var4 == this.field3009) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method5685(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1)
            && this.method5671(var5 + 128 - 1, this.field2952[var1][var2 + 1][var3], var6 + 1)
            && this.method5671(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
            && this.method5670(var5 + 1, this.field2952[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2952[var1][var2][var3] = this.tempGameObjectsCount;
            return true;
         } else {
            this.field2952[var1][var2][var3] = -this.field2990;
            return false;
         }
      }
   }
}
