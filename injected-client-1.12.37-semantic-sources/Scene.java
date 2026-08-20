import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.runelite.api.Tile;
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

@ObfuscatedName("ez")
public class Scene extends Renderable implements net.runelite.api.Scene {
   @ObfuscatedName("bf")
   int field2056;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2098 = 64;
   @ObfuscatedSignature(descriptor = "[Leq;")
   @ObfuscatedName("fz")
   public final ItemLayer[] field2011;
   @ObfuscatedName("dx")
   static final int[][] field2081 = new int[][]{
      {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
      {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
      {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
      {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}
   };
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2096 = 1024;
   @ObfuscatedName("mi")
   public int field2145;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2099 = 3064;
   @ObfuscatedName("bg")
   public int field1991;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2104 = 1;
   @ObfuscatedName("cm")
   int field2064;
   @ObfuscatedName("ac")
   static final int field2066 = Math.min(1024, 1);
   @ObfuscatedName("aa")
   static final int field2086 = Math.max(3064, 4160);
   @ObfuscatedName("cs")
   int field2121;
   @ObfuscatedName("kq")
   public final int field1997;
   @ObfuscatedName("zw")
   public static int field2149;
   @ObfuscatedSignature(descriptor = "Lrl18;")
   @ObfuscatedName("re")
   public final rl18 field1992;
   @ObfuscatedName("ql")
   public final byte[] field2015;
   @ObfuscatedName("hn")
   public int[] field2158;
   @ObfuscatedName("bj")
   public int field2030;
   @ObfuscatedSignature(descriptor = "Lrl16;")
   @ObfuscatedName("vq")
   public static final rl16 field2078 = new rl16();
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2100 = 1024;
   @ObfuscatedName("ay")
   static final int field2069 = classKG.method6472(724424251) / 1024;
   @ObfuscatedName("bu")
   int field2034;
   @ObfuscatedSignature(descriptor = "[Lrl17;")
   @ObfuscatedName("wy")
   public final rl17[] field2021;
   @ObfuscatedName("ad")
   static final int[] field2070 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @ObfuscatedName("ap")
   static final int[] field2067 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   @ObfuscatedName("au")
   static final int[] field2079 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   @ObfuscatedSignature(descriptor = "Lfl;")
   @ObfuscatedName("bn")
   public final classFL field2035;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("dd")
   classNN field2049;
   @ObfuscatedName("xv")
   public boolean field2157;
   @ObfuscatedName("aw")
   static final int[] field2082 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   @ObfuscatedName("ux")
   public short[][][] field2017;
   @ObfuscatedName("gs")
   public final int field1999;
   @ObfuscatedSignature(descriptor = "Lex;")
   @ObfuscatedName("de")
   classEX field2052;
   @ObfuscatedName("hb")
   public BitSet field2022;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2106 = 90;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2105 = 32;
   @ObfuscatedName("hr")
   public final int field1995;
   @ObfuscatedName("al")
   public static final int field2071 = (field2086 - field2066) / 256 + 1;
   @ObfuscatedName("lr")
   public int field2144;
   @ObfuscatedName("yn")
   public int field2037;
   @ObfuscatedName("ah")
   final boolean field2062;
   @ObfuscatedSignature(descriptor = "[Lfe;")
   @ObfuscatedName("nw")
   public final BoundaryObject[] field2008;
   @ObfuscatedName("cz")
   boolean field2033;
   @ObfuscatedName("sk")
   public final int field2001;
   @ObfuscatedName("kn")
   public boolean field2156;
   @ObfuscatedSignature(descriptor = "Lfl;")
   @ObfuscatedName("bx")
   final classFL field2061;
   @ObfuscatedName("uo")
   public int field2148;
   @ObfuscatedSignature(descriptor = "[Leo;")
   @ObfuscatedName("ru")
   public final FloorDecoration[] field2010;
   @ObfuscatedSignature(descriptor = "Lfv;")
   @ObfuscatedName("wc")
   public Projection field2024;
   @ObfuscatedName("iq")
   public int field2142;
   @ObfuscatedName("zd")
   public final int[] field2019;
   @ObfuscatedName("kt")
   public float field2091;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2107 = 4160;
   @ObfuscatedName("sq")
   public int field2147;
   @ObfuscatedName("dp")
   static BitSet field2152;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("bm")
   public classUU field2028;
   @ObfuscatedName("jn")
   public final int field2000;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2103 = 50;
   @ObfuscatedName("ow")
   public int field2047;
   @ObfuscatedName("cn")
   public float field2090;
   @ObfuscatedName("ck")
   int field2115;
   @ObfuscatedName("bo")
   int field2026;
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("ep")
   public WorldView field2150;
   @ObfuscatedName("dq")
   static int field2134;
   @ObfuscatedName("en")
   public int field2027;
   @ObfuscatedName("rs")
   public int field2036;
   @ObfuscatedName("ix")
   public final int field2002;
   @ObfuscatedName("gp")
   public static final int[] field2076 = new int[184];
   @ObfuscatedName("cc")
   public float field2088;
   @ObfuscatedName("bk")
   public float field2055;
   @ObfuscatedName("be")
   int field2110;
   @ObfuscatedName("ci")
   int field2038;
   @ObfuscatedName("bq")
   int field2059;
   @ObfuscatedName("ll")
   public int field2143;
   @ObfuscatedName("db")
   int field2050;
   @ObfuscatedSignature(descriptor = "[Lfn;")
   @ObfuscatedName("pk")
   public final SceneTileModel[] field2007;
   @ObfuscatedName("bs")
   int field2032;
   @ObfuscatedName("dg")
   static int field2128;
   @ObfuscatedName("bl")
   int field2040;
   @ObfuscatedName("bv")
   int[][][] field2031;
   @ObfuscatedName("bh")
   int field2041;
   @ObfuscatedName("bz")
   int field2065;
   @ObfuscatedName("yj")
   public final int field2004;
   @ObfuscatedSignature(descriptor = "[Lfb;")
   @ObfuscatedName("ch")
   GameObject[] field2025;
   @ObfuscatedName("bt")
   public int field2112;
   @ObfuscatedName("cu")
   int field2123;
   @ObfuscatedName("bb")
   public int field1988;
   @ObfuscatedName("cb")
   int field2113;
   @ObfuscatedName("ct")
   int field2122;
   @ObfuscatedName("cp")
   int field2118;
   @ObfuscatedName("sl")
   public float field2095;
   @ObfuscatedName("pd")
   public final int field1998;
   @ObfuscatedName("cq")
   int field2119;
   @ObfuscatedName("cl")
   int field2116;
   @ObfuscatedName("cd")
   int field2114;
   @ObfuscatedName("cv")
   int field2124;
   @ObfuscatedName("ea")
   static BitSet field2153;
   @ObfuscatedName("cy")
   int field2125;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2101 = 128;
   @ObfuscatedName("ai")
   static final int[] field2080 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   @ObfuscatedName("cg")
   int field2044;
   @ObfuscatedName("go")
   public int field2029;
   @ObfuscatedName("cf")
   public float field2089;
   @ObfuscatedName("bd")
   int[][][] field2060;
   @ObfuscatedSignature(descriptor = "[Lep;")
   @ObfuscatedName("by")
   classEP[] field2048;
   @ObfuscatedName("nc")
   public static Deque field2077 = new ArrayDeque();
   @ObfuscatedName("ys")
   public final int field2003;
   @ObfuscatedName("bi")
   boolean field2043;
   @ObfuscatedName("zx")
   public final byte[] field2014;
   @ObfuscatedName("ri")
   public final byte[] field2012;
   @ObfuscatedName("mv")
   public static final int[] field2075 = new int[184];
   @ObfuscatedName("oi")
   public int field2146;
   @ObfuscatedSignature(descriptor = "[[Lrl17;")
   @ObfuscatedName("zl")
   public final rl17[][] field2020;
   @ObfuscatedName("ba")
   public float field2042;
   @ObfuscatedName("cw")
   int field2045;
   @ObfuscatedName("ca")
   public float field2087;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2097 = 25;
   @ObfuscatedName("ej")
   static int field2140;
   @ObfuscatedName("ua")
   public int[][][] field1994;
   @ObfuscatedSignature(descriptor = "[Lfb;")
   @ObfuscatedName("jr")
   public final GameObject[] field2013;
   @ObfuscatedName("ol")
   public float field2093;
   @ObfuscatedSignature(descriptor = "[[Lep;")
   @ObfuscatedName("ce")
   classEP[][] field2039;
   @ObfuscatedName("cr")
   int field2120;
   @ObfuscatedSignature(descriptor = "Lfx;")
   @ObfuscatedName("dc")
   Model field2151;
   @ObfuscatedSignature(descriptor = "[[[Lrl10;")
   @ObfuscatedName("lz")
   public rl10[][][] field2161;
   @ObfuscatedName("am")
   public static boolean field2084 = false;
   @ObfuscatedName("ux")
   public long[] field2016;
   @ObfuscatedName("dm")
   static final int[][] field2085 = new int[][]{
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
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field2102 = 256;
   @ObfuscatedName("dy")
   static int field2139;
   @ObfuscatedName("di")
   static int field2129;
   @ObfuscatedName("du")
   static int field2137;
   @ObfuscatedName("ws")
   public final int field1996;
   @ObfuscatedName("dt")
   static int field2136;
   @ObfuscatedName("dr")
   static int field2135;
   @ObfuscatedName("dk")
   static int field2131;
   @ObfuscatedSignature(descriptor = "[[[Lrl10;")
   @ObfuscatedName("ms")
   public rl10[][][] field1993;
   @ObfuscatedName("co")
   int field2117;
   @ObfuscatedSignature(descriptor = "[Lew;")
   @ObfuscatedName("dw")
   classEW[] field2057;
   @ObfuscatedName("dh")
   int field2051;
   @ObfuscatedName("ak")
   static final int[] field2083 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   @ObfuscatedName("dz")
   int field2053;
   @ObfuscatedName("dn")
   int field2054;
   @ObfuscatedName("lt")
   public float field2092;
   @ObfuscatedName("dv")
   static int field2138;
   @ObfuscatedName("br")
   public int field2111;
   @ObfuscatedName("do")
   static int field2133;
   @ObfuscatedName("cx")
   int[] field2063;
   @ObfuscatedName("dl")
   static int field2132;
   @ObfuscatedName("vl")
   public Map field1989;
   @ObfuscatedName("cj")
   int field2046;
   @ObfuscatedName("ox")
   public int[][][] field2074;
   @ObfuscatedName("hs")
   public final Set field2023;
   @ObfuscatedName("hf")
   public byte[][][] field2159;
   @ObfuscatedName("df")
   static int field2127;
   @ObfuscatedSignature(descriptor = "[Lfj;")
   @ObfuscatedName("em")
   public final SceneTilePaint[] field2006;
   @ObfuscatedName("mo")
   public final int[] field2005;
   @ObfuscatedName("ds")
   static int[] field2072 = new int[field2071];
   @ObfuscatedName("dj")
   static int field2130;
   @ObfuscatedSignature(descriptor = "[Lfi;")
   @ObfuscatedName("hz")
   public final WallDecoration[] field2009;
   @ObfuscatedName("bc")
   public int field2109;
   @ObfuscatedName("da")
   static int field2126;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2108 = 128;
   @ObfuscatedName("vh")
   public byte[][][] field2160;
   @ObfuscatedName("ey")
   static BitSet field2155;
   @ObfuscatedSignature(descriptor = "Lei;")
   @ObfuscatedName("zd")
   public FloatProjection field2018;
   @ObfuscatedName("rv")
   public float field2094;
   @ObfuscatedSignature(descriptor = "[[[Lew;")
   @ObfuscatedName("bp")
   public classEW[][][] field2058;
   @ObfuscatedName("ih")
   public short[][][] field2162;
   @ObfuscatedName("bw")
   public int field1990;
   @ObfuscatedName("ek")
   static BitSet field2154;
   @ObfuscatedName("es")
   static int field2141;
   @ObfuscatedName("ar")
   static final int[] field2068 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dt")
   public void method4326(int var1, int var2, int var3) {
      this.field2044 = var1;
      this.field2045 = var2;
      this.field2046 = var3;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ku")
   public void method4322(boolean var1) {
      if (!this.method4334() || var1) {
         this.field2043 = true;
         this.field2033 = var1;
         this.field2036 = -1;
         this.field2037 = -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)I")
   @ObfuscatedName("ax")
   public static int method4131(boolean var0) {
      return var0 ? 1 : 1024;
   }

   @ObfuscatedSignature(descriptor = "(Lfb;)V")
   @ObfuscatedName("gl")
   public void method4453(GameObject var1) {
      int var2 = (int)(var1.field2185 * 1745853678706228013L >> 16 & 7L);
      if (var2 == 2) {
         assert !(var1.method4569() instanceof Actor);

         assert !(var1.method4569() instanceof Projectile);

         assert !(var1.method4569() instanceof GraphicsObject);

         assert !(var1.method4569() instanceof Scene);

         assert !(var1.method4569() instanceof ActorSpotAnim);

         int var3 = var1.field2188 * 1138017605 + this.field2147;
         int var4 = var1.field2194 * -555977777 + this.field2147;
         int var5 = var1.getPlane();
         client.field1026.trace("Game object despawn: {}", var1.getId());
         if (var1.field2200 instanceof DynamicObject) {
            rl17 var6 = this.field2020[var3 >> 3][var4 >> 3];
            var6.field5705.remove(var1);
         }

         if (this.field2156) {
            GameObjectDespawned var7 = new GameObjectDespawned();
            var7.setTile(this.field1993[var5][var3][var4]);
            var7.setGameObject(var1);
            classOE.field4843.getCallbacks().post(var7);
         }

         if (this.field2156 && client.field1118 != null) {
            client.field1118.invalidateZone(this, var3 >> 3, var4 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILup;Lup;IIIZ)V")
   @ObfuscatedName("dh")
   public void method4398(int var1, int var2, int var3, classUP var4, classUP var5, int var6, int var7, int var8, boolean var9) {
      int var10 = client.field1096 >> 7 & 15;
      rl23.method10069(var10);
      client.method1770();
      var1 = classKI.field3598 * -325062789;
      var2 = classNL.field4684 * 1615527037;
      var3 = classAI.field167 * 1343311673;
      boolean var11 = classOE.field4843.isGpu();
      if (!var11 && client.field1084 != 0) {
         classFQ.method4954(
            classOE.field4843.getViewportXOffset(),
            classOE.field4843.getViewportYOffset(),
            classOE.field4843.getViewportWidth(),
            classOE.field4843.getViewportHeight(),
            client.field1084
         );
      }

      this.field2118 = Ints.constrainToRange(var1, this.field2144 << 7, (this.field2145 << 7) - 1);
      this.field2119 = var2;
      this.field2116 = Ints.constrainToRange(var3, this.field2148 << 7, (this.field2111 << 7) - 1);
      this.field2095 = Floats.constrainToRange(client.field1058, this.field2144 << 7, (this.field2145 << 7) - 1);
      this.field2091 = client.field1049;
      this.field2094 = Floats.constrainToRange(client.field1055, this.field2148 << 7, (this.field2111 << 7) - 1);
      this.field2114 = this.field2118 >> 7;
      this.field2124 = this.field2116 >> 7;
      this.field2114 = this.field2114 + this.field2147;
      this.field2124 = this.field2124 + this.field2147;
      this.field2121 = var7 >> 7;
      this.field2125 = var8 >> 7;
      this.field2121 = this.field2121 + this.field2147;
      this.field2125 = this.field2125 + this.field2147;
      this.field2027 = var6;
      int var12 = Ints.constrainToRange(var4.field6362 * 1379695375, 1, 4160);
      method4510((var12 - field2066) / 256, var5.field6362 * 1379695375 / 1024);
      this.field2087 = var4.method11464();
      this.field2088 = var4.method11463();
      this.field2089 = var5.method11464();
      this.field2090 = var5.method11463();
      this.field2093 = client.field1048;
      this.field2092 = client.field1053;
      IntProjection var13 = new IntProjection(this.field2118, this.field2119, this.field2116, var4, var5, var7, var8);
      var13.field1933 = this.field2095;
      var13.field1930 = this.field2091;
      var13.field1931 = this.field2094;
      var13.field1929 = this.field2093;
      var13.field1935 = this.field2092;
      var13.field1932 = (float)Math.sin(this.field2093);
      var13.field1934 = (float)Math.cos(this.field2093);
      var13.field1936 = (float)Math.sin(this.field2092);
      var13.field1928 = (float)Math.cos(this.field2092);
      this.field2024 = var13;
      IntProjection.field1939 = var13;
      if (this.field2151 != null && !classOE.field4843.isGpu()) {
         this.field2151.method5255(classFZ.field2519);
         this.field2151.method5259(0, var4, var5, 0, 0, 0, -1L);
      }

      if ((client.field1096 & 16) != 0) {
         this.method4390(true, var9);
         this.method4470(var13, null);
         classFH.field2257.field2215.method4844(this.field2061);
         this.method4387(null);
         classOE.field4843.getCallbacks().drawScene();
      } else if (classFH.field2261.method4955() && !classOE.field4843.isGpu()) {
         classFH.field2257.field2217 = 0;
         this.method4390(true, var9);
         this.method4393(var13);
         classFH.field2257.field2215.method4844(this.field2061);
         classFH.field2257.field2217 = 1;
         this.method4390(false, var9);
         this.method4442(var13);
         classFH.field2257.field2215.method4844(this.field2061);
         classFH.field2257.field2217 = 2;
         classOE.field4843.getCallbacks().drawScene();
         if (client.field1118 != null) {
            client.field1118.postDrawScene();
         }
      } else {
         classFH.field2257.field2217 = 2;
         this.method4390(true, var9);
         this.method4442(var13);
         classFH.field2257.field2215.method4844(this.field2061);
         classOE.field4843.getCallbacks().drawScene();
         if (client.field1118 != null) {
            client.field1118.postDrawScene();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIII)Z")
   @ObfuscatedName("iy")
   public boolean method4429(Renderable var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 instanceof DynamicObject) {
         DynamicObject var8 = (DynamicObject)var1;
         if (var8.field1665 != -1 && var8.field1669 != classLB.field4090[var8.field1665]) {
            var8.method3706();
            this.method4447(var8, var2, var3, var4, var5, var6, var7);
            return var8.field1668;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public static int method4139() {
      return field2066;
   }

   public Scene(boolean var1, int var2, int var3, int var4, int var5, classEX var6, int[][][] var7) {
      Scene var8 = this;
      this.field1988 = 0;
      this.field1989 = null;
      this.field1990 = -1;
      this.field1991 = -1;
      this.field1992 = new rl18(this);
      this.field1993 = new rl10[var2][var3][var4];
      this.field1994 = new int[var2][var3][var4];
      int var16 = 32 - Integer.numberOfLeadingZeros(var3 + 3);
      int var17 = 32 - Integer.numberOfLeadingZeros(var4 + 3);
      int var18 = 4 * (1 << var16) * (1 << var17);
      int var19 = var18 << 1;
      this.field1995 = var17;
      this.field1996 = var16 + var17;
      this.field1997 = (1 << var16) - 1;
      this.field1998 = (1 << var17) - 1;
      this.field1999 = 1 << var16 + var17;
      this.field2000 = 1 << var17;
      this.field2001 = 1;
      this.field2002 = var18 - 1;
      this.field2003 = var18 - 2;
      this.field2004 = var18 - 3;
      this.field2005 = new int[var18];
      this.field2006 = new SceneTilePaint[var18];
      this.field2007 = new SceneTileModel[var18];
      this.field2008 = new BoundaryObject[var18];
      this.field2009 = new WallDecoration[var18];
      this.field2010 = new FloorDecoration[var18];
      this.field2011 = new ItemLayer[var18];
      this.field2012 = new byte[var18];
      this.field2013 = new GameObject[var18 * 5];
      this.field2014 = new byte[var18 * 5];
      this.field2015 = new byte[var18];
      this.field2016 = new long[var18];
      this.field2019 = new int[var19];
      Arrays.fill(this.field2019, this.field2002);
      this.method4431();
      int var20 = var3 >> 3;
      int var21 = var4 >> 3;
      this.field2020 = new rl17[var20][var21];
      this.field2021 = new rl17[var20 * var21];

      for (int var22 = 0; var22 < var20; var22++) {
         int var23 = 0;

         while (var23 < var21) {
            rl17 var24 = var8.field2020[var22][var23] = new rl17();
            var24.field5707 = var22;
            var24.field5710 = var23++;
         }
      }

      if (var1) {
         var8.field2022 = classLB.field4090 != null ? new BitSet(classLB.field4090.length) : null;
         var8.field2023 = new HashSet();
      } else {
         var8.field2022 = null;
         var8.field2024 = new FloatProjection(new classUU());
         var8.field2018 = new FloatProjection(new classUU());
         var8.field2023 = Collections.emptySet();
      }

      this.field2035 = new classFL();
      this.field2061 = new classFL();
      this.field2027 = 0;
      this.field2028 = new classUU();
      this.field2029 = 0;
      this.field2030 = 0;
      this.field2047 = 0;
      this.field2055 = 1.0F;
      this.field2026 = -1;
      this.field2034 = -1;
      this.field2042 = -1.0F;
      this.field2036 = -1;
      this.field2037 = -1;
      this.field2033 = false;
      this.field2040 = 0;
      this.field2041 = 0;
      this.field2065 = 0;
      this.field2025 = new GameObject[55];
      this.field2043 = false;
      this.field2044 = 0;
      this.field2045 = 0;
      this.field2046 = 0;
      this.field2038 = 4;
      this.field2064 = -1;
      this.field2049 = new classNN();
      this.field2050 = 0;
      this.field2057 = new classEW[32];
      this.field2051 = 0;
      this.field2052 = classEX.field1977;
      this.field2053 = 0;
      this.field2054 = 0;
      this.field2059 = var2;
      this.field2056 = var3;
      this.field2032 = var4;
      this.field2058 = new classEW[var2][var3][var4];
      this.field2031 = new int[var2][var3 + 1][var4 + 1];
      this.field2060 = var7;
      this.field2051 = var5;
      this.field2052 = var6;
      this.field2062 = var1;
      if (var1) {
         this.field2063 = new int[this.field2038];
         this.field2039 = new classEP[this.field2038][500];
         this.field2048 = new classEP[500];
      }

      this.method4491();
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ao")
   static final int method4142(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fy")
   public void method4356() {
      this.field2150 = null;

      for (int var1 = 0; var1 < this.field2056 >> 3; var1++) {
         for (int var2 = 0; var2 < this.field2032 >> 3; var2++) {
            rl17 var3 = this.field2020[var1][var2];

            for (int var4 = 0; var4 < 4; var4++) {
               int var5 = this.method4489(var4, var1, var2);
               BoundaryObject var6 = this.field2008[var5];
               if (var6 != null) {
                  var6.field2240 = -1L * -2636099314526831141L;
                  var6.field2249 = var6.field2248 = null;
               }

               WallDecoration var7 = this.field2009[var5];
               if (var7 != null) {
                  var7.field2266 = -1L * 2170180156281739181L;
                  var7.field2279 = var7.field2278 = null;
               }

               FloorDecoration var8 = this.field2010[var5];
               if (var8 != null) {
                  var8.field1815 = -1L * -8879266543907161229L;
                  var8.field1816 = null;
               }

               for (int var9 = 0; var9 < this.field2012[var5]; var9++) {
                  GameObject var10 = this.field2013[var5 * 5 + var9];
                  var10.field2185 = -1L * -4819202259227702107L;
                  var10.field2200 = null;
               }
            }

            for (TileObject var12 : var3.field5705) {
               if (var12 instanceof GameObject) {
                  GameObject var13 = (GameObject)var12;
                  DynamicObject var17 = (DynamicObject)var13.field2200;

                  assert var17.field1667 == this;

                  var17.field1667 = null;
               } else if (var12 instanceof FloorDecoration) {
                  FloorDecoration var14 = (FloorDecoration)var12;
                  DynamicObject var18 = (DynamicObject)var14.field1816;

                  assert var18.field1667 == this;

                  var18.field1667 = null;
               } else if (var12 instanceof BoundaryObject) {
                  BoundaryObject var15 = (BoundaryObject)var12;
                  if (var15.field2249 instanceof DynamicObject) {
                     DynamicObject var19 = (DynamicObject)var15.field2249;

                     assert var19.field1667 == this;

                     var19.field1667 = null;
                  }

                  if (var15.field2248 instanceof DynamicObject) {
                     DynamicObject var20 = (DynamicObject)var15.field2248;

                     assert var20.field1667 == this;

                     var20.field1667 = null;
                  }
               } else if (var12 instanceof WallDecoration) {
                  WallDecoration var16 = (WallDecoration)var12;
                  if (var16.field2279 instanceof DynamicObject) {
                     DynamicObject var21 = (DynamicObject)var16.field2279;

                     assert var21.field1667 == this;

                     var21.field1667 = null;
                  }

                  if (var16.field2278 instanceof DynamicObject) {
                     DynamicObject var22 = (DynamicObject)var16.field2278;

                     assert var22.field1667 == this;

                     var22.field1667 = null;
                  }
               }
            }
         }
      }

      this.method4512();
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("al")
   public static boolean method4144(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("cz")
   static boolean method4270(int var0, int var1, int var2, int var3, boolean var4) {
      return method4264(field2152, var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;II)Z")
   @ObfuscatedName("ho")
   public static boolean method4310(Scene var0, int var1, int var2) {
      if (var0 == null) {
         var0.method4155(var1, var1, var1, var1, var1, var1, var1, var1);
      }

      if (!method4273(field2141, field2140, var1, var2)) {
         return method4267(field2141, field2140, var1, var2);
      } else {
         method4278(field2141, field2140, var1, var2, false);
         boolean var3 = false;

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (var0.method4318(field2141, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (var0.method4318(field2141, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (var0.method4318(field2141 + 1, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (var0.method4318(field2141 + 1, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return method4270(field2141, field2140, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   public void method4486(int var1) {
      this.field2058 = null;
      this.field2057 = null;
      this.setMinLevel(var1);

      for (int var2 = 0; var2 < this.field2056; var2++) {
         for (int var3 = 0; var3 < this.field2032; var3++) {
            int var4 = this.method4489(var1, var2, var3);
            if (!this.method4389(var4)) {
               this.method4437(var4, var1, var2, var3);
            }

            if (this.field1993[var1][var2][var3] == null) {
               this.field1993[var1][var2][var3] = new rl10(this, var4);
               this.method4424(var1, var2, var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("yt")
   public void method4424(int var1, int var2, int var3) {
      if (this.field2161 != null) {
         int var4 = var2 - this.field2147;
         int var5 = var3 - this.field2147;
         if (var4 >= 0 && var4 < this.field2161[var1].length && var5 >= 0 && var5 < this.field2161[var1][var4].length) {
            this.field2161[var1][var4][var5] = this.field1993[var1][var2][var3];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aq")
   public void method4427(int var1, int var2) {
      int var3 = var1 - this.field2147;
      int var4 = var2 - this.field2147;
      this.method4418(this.method4489(0, var1, var2), this.field2004);

      for (int var5 = 0; var5 < 3; var5++) {
         int var6 = this.method4489(var5, var1, var2);
         this.method4418(var6 + this.field1999, var6);
         if (this.method4389(var6)) {
            byte var7 = this.field2012[var6];

            for (int var8 = 0; var8 < var7; var8++) {
               GameObject var9 = this.field2013[var6 * 5 + var8];
               long var10 = var9.field2185 * 1745853678706228013L;
               int var12 = (int)(var10 >> 16 & 7L);
               if (var12 == 2 && var9.field2188 * 1138017605 == var3 && var9.field2194 * -555977777 == var4) {
                  var9.field2187 = (var9.field2187 * 568825275 - 1) * -1965758605;
               }
            }

            BoundaryObject var15 = this.field2008[var6];
            if (var15 != null) {
               var15.field2247--;
            }

            FloorDecoration var16 = this.field2010[var6];
            if (var16 != null) {
               var16.field1814--;
            }

            WallDecoration var17 = this.field2009[var6];
            if (var17 != null) {
               var17.field2277--;
            }
         }
      }

      int var13 = this.method4489(0, var1, var2);
      if (!this.method4389(var13)) {
         this.method4437(var13, 0, var1, var2);
      }

      if (this.field1993[0][var1][var2] == null) {
         this.field1993[0][var1][var2] = new rl10(this, var13);
         this.method4424(0, var1, var2);
      }

      this.field2005[var13] = this.field2005[var13] | 32;
      int var14 = this.method4489(3, var1, var2);
      this.method4418(this.field2004, var14);
      this.field2005[var14] = this.field2005[var14] & -2;
      this.method4402(this.field2004);
      this.field1993[3][var1][var2] = null;
      this.method4424(3, var2, var2);
      this.field1993[0][var1][var2].field5693 = new rl10(this, var14);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("op")
   public void method4344() {
      if ((client.field1096 & 16) != 0) {
         for (int var1 = 0; var1 < this.field2056 >> 3; var1++) {
            for (int var2 = 0; var2 < this.field2032 >> 3; var2++) {
               rl17 var3 = this.field2020[var1][var2];
               if (var3 != null) {
                  boolean var4 = false;

                  for (int var5 = 0; var5 < var3.field5705.size(); var5++) {
                     TileObject var6 = (TileObject)var3.field5705.get(var5);
                     if (var6 instanceof GameObject) {
                        GameObject var7 = (GameObject)var6;

                        assert var7.field2200 instanceof DynamicObject;

                        DynamicObject var8 = (DynamicObject)var7.field2200;
                        if (!var8.field1668 && var8.method3709()) {
                           var8.method3706();
                           var8.field1668 = true;
                           var4 = true;
                        }
                     } else if (var6 instanceof FloorDecoration) {
                        FloorDecoration var9 = (FloorDecoration)var6;

                        assert var9.field1816 instanceof DynamicObject;

                        DynamicObject var12 = (DynamicObject)var9.field1816;
                        if (!var12.field1668 && var12.method3709()) {
                           var12.method3706();
                           var12.field1668 = true;
                           var4 = true;
                        }
                     } else if (var6 instanceof BoundaryObject) {
                        BoundaryObject var10 = (BoundaryObject)var6;
                        if (var10.field2249 instanceof DynamicObject) {
                           DynamicObject var13 = (DynamicObject)var10.field2249;
                           if (!var13.field1668 && var13.method3709()) {
                              var13.method3706();
                              var13.field1668 = true;
                              var4 = true;
                           }
                        }

                        if (var10.field2248 instanceof DynamicObject) {
                           DynamicObject var14 = (DynamicObject)var10.field2248;
                           if (!var14.field1668 && var14.method3709()) {
                              var14.method3706();
                              var14.field1668 = true;
                              var4 = true;
                           }
                        }
                     } else if (var6 instanceof WallDecoration) {
                        WallDecoration var11 = (WallDecoration)var6;
                        if (var11.field2279 instanceof DynamicObject) {
                           DynamicObject var15 = (DynamicObject)var11.field2279;
                           if (!var15.field1668 && var15.method3709()) {
                              var15.method3706();
                              var15.field1668 = true;
                              var4 = true;
                           }
                        }

                        if (var11.field2278 instanceof DynamicObject) {
                           DynamicObject var16 = (DynamicObject)var11.field2278;
                           if (!var16.field1668 && var16.method3709()) {
                              var16.method3706();
                              var16.field1668 = true;
                              var4 = true;
                           }
                        }
                     }
                  }

                  if (var4) {
                     client.field1118.invalidateZone(this, var3.field5707, var3.field5710);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("am")
   public void method4153(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      classEP var9 = new classEP();
      var9.field1834 = var3 / 128 * 704810239;
      var9.field1822 = var4 / 128 * -1209725141;
      var9.field1821 = var5 / 128 * -78990867;
      var9.field1818 = var6 / 128 * 950850697;
      var9.field1823 = var2 * 185901273;
      var9.field1830 = var3 * -1875068183;
      var9.field1832 = var4 * 1706709409;
      var9.field1819 = var5 * 106408303;
      var9.field1817 = var6 * 1541236735;
      var9.field1827 = var7 * -969645925;
      var9.field1826 = var8 * 1077506721;
      this.field2039[var1][this.field2063[var1]++] = var9;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ah")
   public void method4412(int var1, int var2, int var3, int var4) {
      int var5 = this.method4489(var1, var2, var3);
      if ((this.field2159[var1][var2][var3] & 8) != 0) {
         this.field2005[var5] = this.field2005[var5] | 64;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)Z")
   @ObfuscatedName("kb")
   static boolean method4319(int var0, int var1, int var2, int var3, int var4) {
      int var5 = classBF.method997(var3, (byte)-87);
      int var7 = classLL.method7119(var3, 1222866659);
      int var8 = classBF.method997(var4, (byte)-30);
      int var10 = classLL.method7119(var4, 1222866659);
      int var11 = var2 * var8 + var0 * var10 >> 16;
      int var12 = var2 * var10 - var0 * var8 >> 16;
      int var13 = var1 * var5 + var12 * var7 >> 16;
      int var14 = var1 * var7 - var12 * var5 >> 16;
      if (var13 >= 50 && var13 <= classFQ.method4929()) {
         int var15 = field2139 + var11 * 128 / var13;
         int var16 = field2129 + var14 * 128 / var13;
         return var15 >= field2137 && var15 <= field2135 && var16 >= field2136 && var16 <= field2131;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("kw")
   boolean method4315(int var1, int var2, int var3, int var4) {
      if (!method4296(var1, var2, var3, var4)) {
         return method4290(var1, var2, var3, var4);
      } else {
         method4301(var1, var2, var3, var4, false);
         int var5 = var1 * 256 + field2066;
         int var6 = var2 * 1024;
         int var7 = (var3 - this.field2051 - this.field2053 - 1) * 128;
         int var8 = (var4 - this.field2051 - this.field2054 - 1) * 128;

         for (int var9 = -field2130; var9 <= field2126; var9 += 128) {
            if (method4320(var7, field2072[var1] + var9, var8, var5, var6)) {
               return method4293(var1, var2, var3, var4, true);
            }
         }

         return method4293(var1, var2, var3, var4, false);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;JLee;Lee;I)V")
   @ObfuscatedName("bp")
   public void method4475(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9, int var10) {
      int var11 = var2 + this.field2147;
      int var12 = var3 + this.field2147;
      ItemLayer var13 = new ItemLayer();
      var13.field1846 = var5;
      var13.field1840 = (var2 * 128 + 64) * -1385855465;
      var13.field1839 = (var3 * 128 + 64) * 2114521817;
      var13.field1841 = var4 * -673866411;
      var13.field1844 = var6;
      var13.field1847 = var8;
      var13.field1845 = var9;
      var13.field1838 = var10 * 1484214011;
      var13.method3953(var1);
      int var14 = this.method4489(var1, var11, var12);
      if (!this.method4389(var14)) {
         this.method4437(var14, var1, var11, var12);
      }

      if (this.field1993[var1][var11][var12] == null) {
         this.field1993[var1][var11][var12] = new rl10(this, var14);
         this.method4424(var1, var11, var12);
      }

      rl17 var15 = this.field2020[var11 >> 3][var12 >> 3];
      if ((this.field2005[var14] & 12288) != 0) {
         var15.field5705.remove(this.field2011[var14]);
      }

      this.field2011[var14] = var13;
      this.field2005[var14] = this.field2005[var14] & -12289;
      this.field2005[var14] = this.field2005[var14] | (var10 != 0 ? 8192 : 4096);
      var15.field5705.add(var13);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   public int method4122() {
      return this.field2064;
   }

   @ObfuscatedSignature(descriptor = "(III)Lfb;")
   @ObfuscatedName("bh")
   public GameObject method4395(int var1, int var2, int var3) {
      int var4 = var2 + this.field2147;
      int var5 = var3 + this.field2147;
      int var6 = this.method4489(var1, var4, var5);
      if (!this.method4389(var6)) {
         return null;
      } else {
         byte var7 = this.field2012[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = this.field2013[var6 * 5 + var8];
            long var10 = var9.field2185 * 1745853678706228013L;
            int var12 = (int)(var10 >> 16 & 7L);
            if (var12 == 2 && var2 == var9.field2188 * 1138017605 && var3 == var9.field2194 * -555977777) {
               return var9;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIILee;IJI)Z")
   @ObfuscatedName("bt")
   public boolean method4179(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.method4430(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILee;IJIIII)Z")
   @ObfuscatedName("bk")
   public boolean method4183(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method4430(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kz")
   public void method4483() {
      boolean var1 = this.field1988 != 0 && this.field2062;
      if (var1) {
         this.field2023.clear();
         Player var2 = classOE.field4843.method2221();
         if (var2 != null && (this.field1988 & 1) != 0) {
            LocalPoint var3 = var2.getLocalLocation();
            if (var3.isInScene()) {
               int var4 = this.field1994[this.field2150.field1710 * -483624883][var3.getSceneX() + this.field2147][var3.getSceneY() + this.field2147];
               this.method4482(var4);
            }
         }

         if (this.field1990 >= this.field2144
            && this.field1990 < this.field2145
            && this.field1991 >= this.field2148
            && this.field1991 < this.field2111
            && (this.field1988 & 2) != 0) {
            int var15 = this.field1994[this.field2150.field1710 * -483624883][this.field1990 + this.field2147][this.field1991 + this.field2147];
            this.method4482(var15);
         }

         LocalPoint var16 = classOE.field4843.getLocalDestinationLocation();
         if (var16 != null && var16.isInScene() && (this.field1988 & 4) != 0) {
            int var17 = this.field1994[this.field2150.field1710 * -483624883][var16.getSceneX() + this.field2147][var16.getSceneY() + this.field2147];
            this.method4482(var17);
         }

         if (classOE.field4843.getCameraPitch() < 2480 && (this.field1988 & 8) != 0 && var2 != null) {
            int var18 = var2.method3287() >> 7;
            int var5 = var2.method3286() >> 7;
            int var6 = classOE.field4843.getCameraX() >> 7;
            int var7 = classOE.field4843.getCameraY() >> 7;
            if (var18 >= this.field2144
               && var5 >= this.field2148
               && var6 >= this.field2144
               && var7 >= this.field2148
               && var18 < this.field2145
               && var5 < this.field2111
               && var6 < this.field2145
               && var7 < this.field2111) {
               int var8 = Math.abs(var18 - var6);
               int var9 = Integer.compare(var18, var6);
               int var10 = -Math.abs(var5 - var7);
               int var11 = Integer.compare(var5, var7);
               int var12 = var8 + var10;

               while (var6 != var18 || var7 != var5) {
                  if (this.method4411(this.field2150.field1710 * -483624883, var6 + this.field2147, var7 + this.field2147)) {
                     int var14 = this.field1994[this.field2150.field1710 * -483624883][var6 + this.field2147][var7 + this.field2147];
                     this.method4482(var14);
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

         this.field2023.remove(0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILee;IZJI)Z")
   @ObfuscatedName("bo")
   boolean method4430(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14
   ) {
      int var15 = var2 + this.field2147;
      int var16 = var3 + this.field2147;
      if (var11) {
         boolean var17 = classOE.field4843.getCallbacks().draw(var9, false);
         if (!var17) {
            if ((var6 & 127) == 64 && (var7 & 127) == 64 && var9 instanceof Actor && ((Actor)var9).field1441 * 670857619 == 1) {
               int var31 = var6 >> 7;
               int var33 = var7 >> 7;
               this.field2150.field1703[var31][var33] = -1;
            }

            return false;
         }
      }

      for (int var25 = var15; var25 < var15 + var4; var25++) {
         for (int var18 = var16; var18 < var16 + var5; var18++) {
            if (var25 < 0 || var18 < 0 || var25 >= this.field2056 || var18 >= this.field2032) {
               return false;
            }

            int var19 = this.method4489(var1, var25, var18);
            if (this.method4389(var19) && this.field2012[var19] >= 5) {
               return false;
            }
         }
      }

      GameObject var26;
      if (var11) {
         var26 = (GameObject)field2077.pollLast();
         if (var26 == null) {
            var26 = new GameObject();
         }

         var26.field2197 = 0 * 132222543;
         var26.field2191 = 0 * -1227421221;
      } else {
         var26 = new GameObject();
      }

      var26.method4563(var12);
      var26.method4565(var14);
      var26.method4564(var1);
      var26.method4562(var6);
      var26.method4568(var7);
      var26.method4566(var8);
      var26.method4567(var9);
      var26.method4570(var10);
      var26.field2188 = var2 * 250676621;
      var26.field2194 = var3 * -1058819281;
      var26.field2186 = (var2 + var4 - 1) * 1384467041;
      var26.field2192 = (var3 + var5 - 1) * 1191492373;
      if (var11) {
         rl17 var27 = this.field2020[var15 >> 3][var16 >> 3];
         var27.field5706.add(var26);
      } else if (var9 instanceof DynamicObject) {
         rl17 var28 = this.field2020[var15 >> 3][var16 >> 3];
         var28.field5705.add(var26);
         this.method4428((DynamicObject)var9);
      }

      this.method4447(var9, var10, var6, var8, var7, var2, var3);

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
               int var22 = this.method4489(var21, var29, var32);
               if (this.field1993[var21][var29][var32] == null) {
                  this.field1993[var21][var29][var32] = new rl10(this, var22);
                  this.method4424(var21, var29, var32);
               }

               if (!this.method4389(var22)) {
                  this.method4437(var22, var21, var29, var32);
               }
            }

            int var34 = this.method4489(var1, var29, var32);
            byte var35 = this.field2012[var34];
            this.field2013[var34 * 5 + var35] = var26;
            this.field2014[var34 * 5 + var35] = (byte)var20;
            this.field2015[var34] = (byte)(this.field2015[var34] | var20);
            this.field2012[var34]++;
         }
      }

      if (!var11 && this.field2156) {
         assert !(var9 instanceof Actor);

         assert !(var9 instanceof Projectile);

         assert !(var9 instanceof GraphicsObject);

         assert !(var9 instanceof Scene);

         client.field1026.trace("Game object spawn: {}", var26.getId());
         GameObjectSpawned var30 = new GameObjectSpawned();
         var30.setTile(this.field1993[var1][var15][var16]);
         var30.setGameObject(var26);
         classOE.field4843.getCallbacks().post(var30);
         int var24 = this.method4489(var1, var2, var3);
         this.field2016[var24] = this.field2016[var24] | 1080863910568919040L;
      }

      if (this.field2156 && !var11 && client.field1118 != null) {
         client.field1118.invalidateZone(this, var15 >> 3, var16 >> 3);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Lew;)Z")
   @ObfuscatedName("ba")
   boolean method4189(classEW var1) {
      if (var1.field1956 * -299736461 != this.field2065) {
         var1.field1956 = this.field2065 * -1699605829;
         var1.field1958 = var1.field1963 * -980607445;
         if (this.field2050 >= this.field2057.length) {
            this.field2057 = Arrays.copyOf(this.field2057, this.field2057.length * 2);
         }

         this.field2057[this.field2050++] = var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ed")
   public void method4127() {
      this.field2064 = -1;
      this.field2151 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lfb;)V")
   @ObfuscatedName("bb")
   void method4359(GameObject var1) {
      for (int var2 = var1.field2188 * 1138017605; var2 <= var1.field2186 * 304142753; var2++) {
         int var3 = var2 + this.field2147;

         for (int var4 = var1.field2194 * -555977777; var4 <= var1.field2192 * -544424899; var4++) {
            int var5 = var4 + this.field2147;
            int var6 = this.method4489(var1.field2187 * 568825275, var3, var5);
            if (this.method4389(var6)) {
               byte var7 = this.field2012[var6];

               for (int var8 = 0; var8 < var7; var8++) {
                  GameObject var9 = this.field2013[var6 * 5 + var8];
                  if (var9 == var1) {
                     var7 = --this.field2012[var6];

                     for (int var10 = var8; var10 < var7; var10++) {
                        this.field2013[var6 * 5 + var10] = this.field2013[var6 * 5 + var10 + 1];
                        this.field2014[var6 * 5 + var10] = this.field2014[var6 * 5 + var10 + 1];
                     }

                     this.field2013[var6 * 5 + var7] = null;
                     break;
                  }
               }

               this.field2005[var6] = this.field2005[var6] & -129;
               this.field2015[var6] = 0;

               for (int var12 = 0; var12 < this.field2012[var6]; var12++) {
                  this.field2015[var6] = (byte)(this.field2015[var6] | this.field2014[var6 * 5 + var12]);
               }
            }
         }
      }

      this.method4453(var1);
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("co")
   public void method4459(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      var5 += this.field2147;
      var6 += this.field2147;
      int var7 = this.method4489(var4, var5, var6);
      if (this.method4389(var7)) {
         int var8 = this.field2005[var7];
         if ((var8 & 256) != 0) {
            SceneTilePaint var9 = this.field2006[var7];
            int var10 = var9.field2289 * 1843846065;
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
            SceneTileModel var20 = this.field2007[var7];
            if (var20 != null) {
               int var21 = var20.field2320;
               int var22 = var20.field2326;
               int var12 = var20.field2333;
               int var13 = var20.field2321;
               int[] var14 = field2085[var21];
               int[] var15 = field2081[var22];
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

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("by")
   public void method4485(int var1, int var2, int var3) {
      var2 += this.field2147;
      var3 += this.field2147;
      int var4 = this.method4489(var1, var2, var3);
      if (this.method4389(var4) && (this.field2005[var4] & 16384) != 0) {
         BoundaryObject var5 = this.field2008[var4];
         this.field2008[var4] = null;
         this.field2005[var4] = this.field2005[var4] & -16385;
         if (var5.field2249 instanceof DynamicObject || var5.field2248 instanceof DynamicObject) {
            rl17 var6 = this.field2020[var2 >> 3][var3 >> 3];
            var6.field5705.remove(var5);
         }

         if (this.field2156) {
            WallObjectDespawned var9 = new WallObjectDespawned();
            var9.setTile(this.field1993[var1][var2][var3]);
            var9.setWallObject(var5);
            classOE.field4843.getCallbacks().post(var9);
         }

         if (this.field2156 && client.field1118 != null) {
            client.field1118.invalidateZone(this, var2 >> 3, var3 >> 3);
         }
      }
   }

   public void buildRoofs() {
      this.field1994 = new int[this.field2059][this.field2056][this.field2032];
      int var1 = 1;
      this.field1989 = new HashMap();
      Set[] var2 = new Set[]{new HashSet(), new HashSet(), new HashSet()};

      for (int var3 = this.field2059 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.field2032; var4++) {
            for (int var5 = 0; var5 < this.field2056; var5++) {
               rl10 var6 = this.field1993[var3][var5][var4];
               if (var6 != null && this.field1994[var3][var5][var4] == 0 && this.method4411(var3, var5, var4)) {
                  this.method4473(var6, var1++, var2);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bq")
   public void method4445(int var1, int var2, int var3) {
      var2 += this.field2147;
      var3 += this.field2147;
      int var4 = this.method4489(var1, var2, var3);
      if (this.method4389(var4) && (this.field2005[var4] & 32768) != 0) {
         WallDecoration var5 = this.field2009[var4];
         this.field2009[var4] = null;
         this.field2005[var4] = this.field2005[var4] & -32769;
         if (var5.field2279 instanceof DynamicObject || var5.field2278 instanceof DynamicObject) {
            rl17 var6 = this.field2020[var2 >> 3][var3 >> 3];
            var6.field5705.remove(var5);
         }

         if (this.field2156) {
            DecorativeObjectDespawned var9 = new DecorativeObjectDespawned();
            var9.setTile(this.field1993[var1][var2][var3]);
            var9.setDecorativeObject(var5);
            classOE.field4843.getCallbacks().post(var9);
         }

         if (this.field2156 && client.field1118 != null) {
            client.field1118.invalidateZone(this, var2 >> 3, var3 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kb")
   public void method4482(int var1) {
      if (var1 != 0 && var1 >> 28 == 0) {
         this.method4397(var1);
      }
   }

   public void removeGameObject(net.runelite.api.GameObject var1) {
      this.method4359((GameObject)var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bf")
   public void method4466(int var1) {
      int var2 = (var1 << 1) + 1;
      var2 = this.field2019[var2];
      var2 <<= 1;
      int var5 = var1 << 1;
      this.field2019[var2] = this.field2019[var5];
      var2 = var1 << 1;
      var2 = this.field2019[var2];
      var2 = (var2 << 1) + 1;
      int var9 = (var1 << 1) + 1;
      this.field2019[var2] = this.field2019[var9];
      var2 = var1 << 1;
      int var11 = (var1 << 1) + 1;
      this.field2019[var2] = this.field2019[var11] = this.field2002;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bf")
   public void method4394(int var1, int var2, int var3) {
      int var4 = var2 + this.field2147;
      int var5 = var3 + this.field2147;
      int var6 = this.method4489(var1, var4, var5);
      if (this.method4389(var6)) {
         byte var7 = this.field2012[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = this.field2013[var6 * 5 + var8];
            long var10 = var9.field2185 * 1745853678706228013L;
            int var12 = (int)(var10 >> 16 & 7L);
            if (var12 == 2 && var2 == var9.field2188 * 1138017605 && var3 == var9.field2194 * -555977777) {
               this.removeGameObject(var9);
               return;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("dp")
   boolean method4373(int var1, int var2, int var3) {
      int var4 = this.field2031[var1][var2][var3];
      if (var4 == -this.field2065) {
         return false;
      } else if (var4 == this.field2065) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method4386(var5 + 1, this.field2060[var1][var2][var3], var6 + 1)
            && this.method4386(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3], var6 + 1)
            && this.method4386(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
            && this.method4386(var5 + 1, this.field2060[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2031[var1][var2][var3] = this.field2065;
            return true;
         } else {
            this.field2031[var1][var2][var3] = -this.field2065;
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lfe;")
   @ObfuscatedName("hx")
   public BoundaryObject method4467(int var1, int var2, int var3) {
      var2 += this.field2147;
      var3 += this.field2147;
      int var4 = this.method4489(var1, var2, var3);
      return this.method4389(var4) ? this.field2008[var4] : null;
   }

   @ObfuscatedSignature(descriptor = "(Lez;IIIILee;JI)V")
   @ObfuscatedName("yb")
   public static void method4464(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var0 == null) {
         var0.method4465(var1, var1, var1, var1, var5, var6, var1);
      } else {
         int var9 = var2 + var0.field2147;
         int var10 = var3 + var0.field2147;
         if (var5 != null) {
            int var11 = var0.method4489(var1, var9, var10);
            FloorDecoration var12 = new FloorDecoration();
            var12.method3947(var5);
            var12.method3948(var2 * 128 + 64);
            var12.method3945(var3 * 128 + 64);
            var12.method3946(var4);
            var12.method3944(var6);
            var12.method3943(var8);
            rl10 var13 = var0.field1993[var1][var9][var10];
            if (var13 == null) {
               var0.field1993[var1][var9][var10] = var13 = new rl10(var0, var11);
               var0.method4424(var1, var9, var10);
            }

            if (!var0.method4389(var11)) {
               var0.method4437(var11, var1, var9, var10);
            }

            assert var0.field2010[var11] == null;

            var0.field2010[var11] = var12;
            var0.field2005[var11] = var0.field2005[var11] | 2048;
            var0.field2016[var11] = var0.field2016[var11] | 1080863910568919040L;
            if (var5 instanceof DynamicObject) {
               rl17 var14 = var0.field2020[var9 >> 3][var10 >> 3];
               var14.field5705.add(var12);
               var0.method4428((DynamicObject)var5);
            }

            var0.method4447(var5, 0, var12.getX(), var12.getZ(), var12.getY(), var2, var3);
            var12.field1814 = var1;
            if (var0.field2156) {
               GroundObjectSpawned var17 = new GroundObjectSpawned();
               var17.setTile(var13);
               var17.setGroundObject(var12);
               classOE.field4843.getCallbacks().post(var17);
            }

            if (var0.field2156 && client.field1118 != null) {
               client.field1118.invalidateZone(var0, var9 >> 3, var10 >> 3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lfi;")
   @ObfuscatedName("bv")
   public WallDecoration method4420(int var1, int var2, int var3) {
      var2 += this.field2147;
      var3 += this.field2147;
      int var4 = this.method4489(var1, var2, var3);
      return this.method4389(var4) ? this.field2009[var4] : null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mw")
   void method4370() {
      int var1 = this.field2063[this.field2027];
      classEP[] var2 = this.field2039[this.field2027];
      this.field2110 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         classEP var4 = var2[var3];
         if (var4.field1823 * -71966871 == 1) {
            int var14 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
            if (var14 >= 0 && var14 <= this.field2051 + this.field2051) {
               int var16 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
               if (var16 < 0) {
                  var16 = 0;
               }

               int var18 = var4.field1818 * -899751495 - this.field2124 + this.field2051;
               if (var18 > this.field2051 + this.field2051) {
                  var18 = this.field2051 + this.field2051;
               }

               boolean var20 = false;

               while (var16 <= var18) {
                  if (this.method4311(var14, var16++)) {
                     var20 = true;
                     break;
                  }
               }

               if (var20) {
                  int var22 = this.field2118 - var4.field1830 * -996295335;
                  if (var22 > 32) {
                     var4.field1825 = -307181543;
                  } else {
                     if (var22 >= -32) {
                        continue;
                     }

                     var4.field1825 = -614363086;
                     var22 = -var22;
                  }

                  var4.field1820 = (var4.field1819 * -832449137 - this.field2116 << 8) / var22 * -1015514901;
                  var4.field1828 = (var4.field1817 * -371025921 - this.field2116 << 8) / var22 * 306530981;
                  var4.field1831 = (var4.field1827 * 318014867 - this.field2119 << 8) / var22 * -1741242211;
                  var4.field1824 = (var4.field1826 * -971837087 - this.field2119 << 8) / var22 * -2051350499;
                  this.field2048[this.field2110++] = var4;
               }
            }
         } else if (var4.field1823 * -71966871 == 2) {
            int var13 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
            if (var13 >= 0 && var13 <= this.field2051 + this.field2051) {
               int var15 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
               if (var15 < 0) {
                  var15 = 0;
               }

               int var17 = var4.field1822 * -753584253 - this.field2114 + this.field2051;
               if (var17 > this.field2051 + this.field2051) {
                  var17 = this.field2051 + this.field2051;
               }

               boolean var19 = false;

               while (var15 <= var17) {
                  if (this.method4311(var15++, var13)) {
                     var19 = true;
                     break;
                  }
               }

               if (var19) {
                  int var21 = this.field2116 - var4.field1819 * -832449137;
                  if (var21 > 32) {
                     var4.field1825 = -921544629;
                  } else {
                     if (var21 >= -32) {
                        continue;
                     }

                     var4.field1825 = -1228726172;
                     var21 = -var21;
                  }

                  var4.field1833 = (var4.field1830 * -996295335 - this.field2118 << 8) / var21 * -1640466283;
                  var4.field1829 = (var4.field1832 * 1506923105 - this.field2118 << 8) / var21 * 323343539;
                  var4.field1831 = (var4.field1827 * 318014867 - this.field2119 << 8) / var21 * -1741242211;
                  var4.field1824 = (var4.field1826 * -971837087 - this.field2119 << 8) / var21 * -2051350499;
                  this.field2048[this.field2110++] = var4;
               }
            }
         } else if (var4.field1823 * -71966871 == 4) {
            int var5 = var4.field1827 * 318014867 - this.field2119;
            if (var5 > 128) {
               int var6 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = var4.field1818 * -899751495 - this.field2124 + this.field2051;
               if (var7 > this.field2051 + this.field2051) {
                  var7 = this.field2051 + this.field2051;
               }

               if (var6 <= var7) {
                  int var8 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  int var9 = var4.field1822 * -753584253 - this.field2114 + this.field2051;
                  if (var9 > this.field2051 + this.field2051) {
                     var9 = this.field2051 + this.field2051;
                  }

                  boolean var10 = false;

                  label190:
                  for (int var11 = var8; var11 <= var9; var11++) {
                     for (int var12 = var6; var12 <= var7; var12++) {
                        if (this.method4311(var11, var12)) {
                           var10 = true;
                           break label190;
                        }
                     }
                  }

                  if (var10) {
                     var4.field1825 = -1535907715;
                     var4.field1833 = (var4.field1830 * -996295335 - this.field2118 << 8) / var5 * -1640466283;
                     var4.field1829 = (var4.field1832 * 1506923105 - this.field2118 << 8) / var5 * 323343539;
                     var4.field1820 = (var4.field1819 * -832449137 - this.field2116 << 8) / var5 * -1015514901;
                     var4.field1828 = (var4.field1817 * -371025921 - this.field2116 << 8) / var5 * 306530981;
                     this.field2048[this.field2110++] = var4;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("ik")
   static boolean method4261(BitSet var0, int var1, int var2, int var3, int var4) {
      return var0.get(var1 * field2138 + var2 * field2133 + var3 * field2128 + var4);
   }

   @ObfuscatedSignature(descriptor = "()[[[Lrl10;")
   @ObfuscatedName("cl")
   public rl10[][][] method4425() {
      return this.field2161;
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;IJ)Z")
   @ObfuscatedName("gk")
   public boolean method4187(int var1, int var2, int var3, int var4, Renderable var5, int var6, long var7) {
      if (var5 == null) {
         return false;
      } else {
         int var9 = var2 / 128;
         int var10 = var3 / 128;
         if (var9 >= 0 && var10 >= 0 && var9 < this.field2056 && var10 < this.field2032) {
            classEW var11 = this.field2058[var1][var9][var10];
            if (var11 != null && (var11.field1955 == null || var11.field1955.size() != 50)) {
               if (var11.field1955 == null) {
                  var11.field1955 = new ArrayList();
               }

               GameObject var12 = new GameObject();
               var12.field2185 = var7 * -4819202259227702107L;
               var12.field2184 = 0;
               var12.field2187 = var1 * 1383386583;
               var12.field2195 = var2 * 1127193675;
               var12.field2196 = var3 * 1768277495;
               var12.field2190 = var4 * -1294023757;
               var12.field2200 = var5;
               var12.field2189 = var6 * -107181990;
               var12.field2188 = var9 * -515564213;
               var12.field2194 = var10 * -1058819281;
               var12.field2186 = var9 * -1397775053;
               var12.field2192 = var10 * 1872428737;
               var11.field1955.add(var12);
               this.method4189(var11);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)J")
   @ObfuscatedName("oo")
   public static long method4228(Scene var0, int var1, int var2, int var3) {
      classEW var4 = var0.field2058[var1][var2][var3];
      return var4 != null && var4.field1967 != null ? var4.field1967.field1815 * 5132338419383099835L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(Lrl10;)V")
   @ObfuscatedName("ud")
   public void method4405(rl10 var1) {
      Callbacks var2 = classOE.field4843.getCallbacks();
      BoundaryObject var3 = var1.method10037();
      if (var3 != null) {
         WallObjectSpawned var4 = new WallObjectSpawned();
         var4.setTile(var1);
         var4.setWallObject(var3);
         var2.post(var4);
      }

      WallDecoration var13 = var1.method10034();
      if (var13 != null) {
         DecorativeObjectSpawned var5 = new DecorativeObjectSpawned();
         var5.setTile(var1);
         var5.setDecorativeObject(var13);
         var2.post(var5);
      }

      FloorDecoration var14 = var1.method10039();
      if (var14 != null) {
         GroundObjectSpawned var6 = new GroundObjectSpawned();
         var6.setTile(var1);
         var6.setGroundObject(var14);
         var2.post(var6);
      }

      for (GameObject var9 : var1.method10036()) {
         if (var9 != null) {
            int var10 = var9.field2188 * 1138017605;
            int var11 = var9.field2194 * -555977777;
            if (var10 == var1.method10030() && var11 == var1.method10041() && var9.field2186 * 304142753 < 104 && var9.field2192 * -544424899 < 104) {
               GameObjectSpawned var12 = new GameObjectSpawned();
               var12.setTile(var1);
               var12.setGameObject(var9);
               var2.post(var12);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)V")
   @ObfuscatedName("yn")
   public static void method4496(int[] var0, int var1, int var2, int var3, int var4) {
      method4304(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("cb")
   public long method4439(int var1, int var2, int var3) {
      int var4 = var2 + this.field2147;
      int var5 = var3 + this.field2147;
      int var6 = this.method4489(var1, var4, var5);
      if (!this.method4389(var6)) {
         return 0L;
      } else {
         byte var7 = this.field2012[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = this.field2013[var6 * 5 + var8];
            long var10 = var9.field2185 * 1745853678706228013L;
            int var12 = (int)(var10 >> 16 & 7L);
            if (var12 == 2 && var2 == var9.field2188 * 1138017605 && var3 == var9.field2194 * -555977777) {
               return var9.field2185 * 1745853678706228013L;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dg")
   public void method4432() {
      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < this.field2056; var2++) {
            for (int var3 = 0; var3 < this.field2032; var3++) {
               int var4 = this.method4489(var1, var2, var3);
               if (this.method4389(var4)) {
                  int var5 = var2 >> 3;
                  int var6 = var3 >> 3;
                  rl17 var7 = this.field2020[var5][var6];
                  if ((this.field2005[var4] & 32) != 0) {
                     assert var1 == 0;

                     int var8 = this.field2060[0][var2][var3];
                     this.method4487(var7, var2, var3, var8);
                  }

                  int var14 = (this.field2159[1][var2][var3] & 2) >> 1;
                  int var9 = var1 + var14;
                  int var10 = this.field2060[var9][var2][var3];
                  this.method4487(var7, var2, var3, var10);
                  int var11 = this.field2005[var4];
                  if ((var11 & 2048) != 0) {
                     FloorDecoration var12 = this.field2010[var4];
                     if (var12.field1816 instanceof Model) {
                        this.method4440(var10, var7, (Model)var12.field1816);
                     }
                  }

                  if ((var11 & 16384) != 0) {
                     BoundaryObject var15 = this.field2008[var4];
                     if (var15.field2249 instanceof Model) {
                        this.method4440(var10, var7, (Model)var15.field2249);
                     }

                     if (var15.field2248 instanceof Model) {
                        this.method4440(var10, var7, (Model)var15.field2248);
                     }
                  }

                  if ((var11 & 32768) != 0) {
                     WallDecoration var16 = this.field2009[var4];
                     if (var16.field2279 instanceof Model) {
                        this.method4440(var10, var7, (Model)var16.field2279);
                     }

                     if (var16.field2278 instanceof Model) {
                        this.method4440(var10, var7, (Model)var16.field2278);
                     }
                  }

                  for (int var17 = 0; var17 < this.field2012[var4]; var17++) {
                     GameObject var13 = this.field2013[var4 * 5 + var17];
                     if (var13.field2200 instanceof Model) {
                        this.method4440(var10, var7, (Model)var13.field2200);
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("ct")
   public long method4476(int var1, int var2, int var3) {
      var2 += this.field2147;
      var3 += this.field2147;
      int var4 = this.method4489(var1, var2, var3);
      return this.method4389(var4) && this.field2010[var4] != null ? this.field2010[var4].field1815 * 5132338419383099835L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("nk")
   public void method4471(int var1, int var2, int var3) {
      if (var2 >= 0 && var2 < this.field2056 && var3 >= 0 && var3 < this.field2032) {
         int var4 = this.method4489(var1, var2, var3);
         if (this.method4389(var4)) {
            this.method4404(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lew;)V")
   @ObfuscatedName("bi")
   void method4197(classEW var1) {
      var1.field1954 = 0;

      for (int var2 = 0; var2 < var1.field1963 * -389646721; var2++) {
         var1.field1954 = (var1.field1954 * -785027619 | var1.field1953[var2]) * -1095478667;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIILee;JI)V")
   @ObfuscatedName("my")
   public static void method4162(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var0 == null) {
         var0.method4506();
      }

      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.field1816 = var5;
         var9.field1806 = var2 * -1794546048 + 1250210624;
         var9.field1808 = var3 * -2036886656 + -1018443328;
         var9.field1807 = var4 * 476279895;
         var9.field1815 = var6 * -8879266543907161229L;
         var9.method3938(var8, (byte)2);
         if (var0.field2058[var1][var2][var3] == null) {
            var0.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
         }

         var0.field2058[var1][var2][var3].field1967 = var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ler;III)V")
   @ObfuscatedName("ir")
   void method4461(ModelData var1, int var2, int var3, int var4) {
      int var5 = var3 + 1;
      int var6 = var4 + 1;

      for (int var7 = var3; var7 <= var5; var7++) {
         if (var7 >= 0 && var7 < this.field2056) {
            for (int var8 = var4 - 1; var8 <= var6; var8++) {
               if (var8 >= 0 && var8 < this.field2032 && (var7 >= var5 || var8 >= var6)) {
                  int var9 = this.method4489(var2, var7, var8);
                  if (this.method4389(var9)) {
                     FloorDecoration var10 = this.field2010[var9];
                     if (var10 != null && var10.field1816 instanceof ModelData) {
                        int var11 = this.method4414(var2, var7, var8) - this.method4414(var2, var3, var4);
                        ModelData var12 = (ModelData)var10.field1816;
                        ModelData.method4065(var1, var12, (var7 - var3) * 128, var11, (var8 - var4) * 128, true);
                     }
                  }
               }
            }
         }
      }
   }

   public byte[][][] getExtendedTileSettings() {
      return this.field2159;
   }

   @ObfuscatedSignature(descriptor = "(Ler;IIIII)V")
   @ObfuscatedName("cv")
   void method4441(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for (int var12 = var2; var12 <= var2 + 1; var12++) {
         if (var12 != this.field2059) {
            for (int var13 = var8; var13 <= var9; var13++) {
               if (var13 >= 0 && var13 < this.field2056) {
                  for (int var14 = var10; var14 <= var11; var14++) {
                     if (var14 >= 0 && var14 < this.field2032 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        int var15 = this.method4489(var12, var13, var14);
                        if (this.method4389(var15)) {
                           int var16 = this.method4414(var12, var13, var14) - this.method4414(var2, var3, var4);
                           BoundaryObject var17 = this.field2008[var15];
                           if (var17 != null) {
                              if (var17.field2249 instanceof ModelData) {
                                 ModelData var18 = (ModelData)var17.field2249;
                                 ModelData.method4065(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7);
                              }

                              if (var17.field2248 instanceof ModelData) {
                                 ModelData var24 = (ModelData)var17.field2248;
                                 ModelData.method4065(var1, var24, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7);
                              }
                           }

                           byte var25 = this.field2012[var15];

                           for (int var19 = 0; var19 < var25; var19++) {
                              GameObject var20 = this.field2013[var15 * 5 + var19];
                              if (var20 != null && var20.field2200 instanceof ModelData) {
                                 ModelData var21 = (ModelData)var20.field2200;
                                 int var22 = var20.field2186 * 304142753 - var20.field2188 * 1138017605 + 1;
                                 int var23 = var20.field2192 * -544424899 - var20.field2194 * -555977777 + 1;
                                 ModelData.method4065(
                                    var1,
                                    var21,
                                    (var20.field2188 * 1138017605 + this.field2147 - var3) * 128 + (var22 - var5) * 64,
                                    var16,
                                    (var20.field2194 * -555977777 + this.field2147 - var4) * 128 + (var23 - var6) * 64,
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

   @ObfuscatedSignature(descriptor = "(Lfb;II)I")
   @ObfuscatedName("ze")
   public int method4497(GameObject var1, int var2, int var3) {
      return method4367(this, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Lfb;II)I")
   @ObfuscatedName("lt")
   int method4365(GameObject var1, int var2, int var3) {
      int var4 = var2 - var1.field2188 * -1996012957;
      int var5 = var1.field2186 * -161575791 - var2;
      if (var5 > var4) {
         var4 = var5;
      }

      int var6 = var3 - var1.field2194 * -555977777;
      int var7 = var1.field2192 * 340761146 - var3;
      return var7 > var6 ? var4 + var7 : var4 + var6;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ck")
   public void method4253(int var1) {
      this.field2051 = classEK.method3908(25, 90, var1, (byte)17);
      method4257(this.field2051);
      classFQ.method4936(this.field2051);
      method4304(field2072, field2130, field2126, field2135, field2131);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Lfv;Z)V")
   @ObfuscatedName("fw")
   public static void method4350(Scene var0, Projection var1, boolean var2) {
      if (var0 == null) {
         var0.method4333();
      }

      var0.field2041 = 0;

      for (int var3 = var0.field2040; var3 < var0.field2059; var3++) {
         classEW[][] var4 = var0.field2058[var3];

         for (int var5 = var0.field2120; var5 < var0.field2123; var5++) {
            for (int var6 = var0.field2113; var6 < var0.field2122; var6++) {
               classEW var7 = var4[var5][var6];
               if (var7 != null
                  && var7.field1964 * 1390661409 <= var0.field2027
                  && (
                     !var2
                        || var0.method4311(var5 - var0.field2114 + var0.field2053 + var0.field2051, var6 - var0.field2124 + var0.field2054 + var0.field2051)
                        || var0.field2060[var3][var5][var6] - var0.field2119 >= 2000
                  )) {
                  var0.method4444(var1, var7);
               }
            }
         }
      }

      var0.method4338();
      classFL.method4827(classFH.field2257.field2215, var0.field2061);
   }

   @ObfuscatedSignature(descriptor = "(Ler;IIIII)V")
   @ObfuscatedName("sq")
   public void method4498(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      this.method4441(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(Lex;)V")
   @ObfuscatedName("ca")
   public void method4254(classEX var1) {
      if (var1 != this.field2052) {
         this.field2052 = var1;
         method4304(field2072, field2130, field2126, field2135, field2131);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cc")
   public static void method4257(int var0) {
      int var1 = (field2071 - 1) * field2069 * (var0 + var0 + 1) * (var0 + var0 + 1);
      field2152 = new BitSet(var1);
      field2155 = new BitSet(var1);
      field2138 = field2069 * (var0 + var0 + 1) * (var0 + var0 + 1);
      field2133 = (var0 + var0 + 1) * (var0 + var0 + 1);
      field2128 = var0 + var0 + 1;
      int var2 = field2071 * field2069 * (var0 + var0 + 3) * (var0 + var0 + 3);
      field2153 = new BitSet(var2);
      field2154 = new BitSet(var2);
      field2132 = field2069 * (var0 + var0 + 3) * (var0 + var0 + 3);
      field2134 = (var0 + var0 + 3) * (var0 + var0 + 3);
      field2127 = var0 + var0 + 3;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("vn")
   public int method4458(int var1) {
      return this.field2005[var1] >> 20 & 15;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("cf")
   static boolean method4262(BitSet var0, int var1, int var2, int var3, int var4) {
      return var0.get(var1 * field2138 + var2 * field2133 + var3 * field2128 + var4);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("cn")
   static boolean method4264(BitSet var0, int var1, int var2, int var3, int var4, boolean var5) {
      var0.set(var1 * field2138 + var2 * field2133 + var3 * field2128 + var4, var5);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ch")
   static boolean method4267(int var0, int var1, int var2, int var3) {
      return method4262(field2152, var0, var1, var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIJ)I")
   @ObfuscatedName("ad")
   public static int method4230(Scene var0, int var1, int var2, int var3, long var4) {
      classEW var6 = var0.field2058[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field1970 != null && var6.field1970.field2240 * 7159317397185328723L == var4) {
         return var6.field1970.field2241 * 1869636241 & 0xFF;
      } else if (var6.field1971 != null && var6.field1971.field2266 * -3608662145112923099L == var4) {
         return var6.field1971.field2265 * -1506294211 & 0xFF;
      } else if (var6.field1967 != null && var6.field1967.field1815 * 5132338419383099835L == var4) {
         return FloorDecoration.method3936(var6.field1967, 595746927) & 0xFF;
      } else {
         for (int var7 = 0; var7 < var6.field1963 * -389646721; var7++) {
            if (var6.field1951[var7].field2185 * 1745853678706228013L == var4) {
               return var6.field1951[var7].field2184 * -288062455 & 0xFF;
            }
         }

         return -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("eu")
   public static boolean method4145(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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
   @ObfuscatedSignature(descriptor = "(Lez;Z)V")
   @ObfuscatedName("qe")
   public static void method4323(Scene var0, boolean var1) {
      if (var0 == null) {
         var0.method4148();
      }

      if (!var0.method4334() || var1) {
         var0.field2043 = true;
         var0.field2033 = var1;
         var0.field2036 = -1;
         var0.field2037 = -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;IIIIILee;IJZ)Z")
   @ObfuscatedName("eh")
   public static boolean method4477(Scene var0, int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
      if (var0 == null) {
         return var0.method4478(var1, var1, var1, var1, var1, var6, var1, var8, var10);
      } else if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
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

         var11 >>= 7;
         var12 >>= 7;
         var13 >>= 7;
         var14 >>= 7;
         return var0.method4499(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cg")
   static boolean method4273(int var0, int var1, int var2, int var3) {
      return method4262(field2155, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("cw")
   static boolean method4278(int var0, int var1, int var2, int var3, boolean var4) {
      return method4264(field2155, var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("cj")
   static boolean method4282(BitSet var0, int var1, int var2, int var3, int var4) {
      return var0.get(var1 * field2132 + var2 * field2134 + var3 * field2127 + var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILee;IZJI)Z")
   @ObfuscatedName("cm")
   public boolean method4499(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14
   ) {
      return this.method4430(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14);
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;IJ)Z")
   @ObfuscatedName("bu")
   public boolean method4421(int var1, int var2, int var3, int var4, Renderable var5, int var6, long var7) {
      if (var5 == null) {
         return false;
      } else {
         int var9 = (var2 >> 7) + this.field2147;
         int var10 = (var3 >> 7) + this.field2147;
         if (var9 >= 0 && var10 >= 0 && var9 < this.field2056 && var10 < this.field2032) {
            GameObject var11 = (GameObject)field2077.pollLast();
            if (var11 == null) {
               var11 = new GameObject();
            }

            var11.field2185 = var7 * -4819202259227702107L;
            var11.field2184 = 0 * -1989916103;
            var11.field2187 = var1 * -1965758605;
            var11.field2195 = var2 * -1872653325;
            var11.field2196 = var3 * 1768277495;
            var11.field2190 = var4 * -1294023757;
            var11.field2200 = var5;
            var11.field2189 = var6 * -610160131;
            var11.field2188 = (var2 >> 7) * 250676621;
            var11.field2194 = (var3 >> 7) * -1058819281;
            var11.field2186 = (var2 >> 7) * 1384467041;
            var11.field2192 = (var3 >> 7) * 1191492373;
            var11.field2197 = 0 * 132222543;
            var11.field2191 = 0 * -1227421221;
            int var12 = this.method4489(var1, var9, var10);
            if (!this.method4389(var12)) {
               this.method4437(var12, var1, var9, var10);
            }

            if (this.field1993[var1][var9][var10] == null) {
               this.field1993[var1][var9][var10] = new rl10(this, var12);
               this.method4424(var1, var9, var10);
            }

            this.field2005[var12] = this.field2005[var12] | 128;
            rl17 var13 = this.field2020[var9 >> 3][var10 >> 3];
            var13.field5706.add(var11);
            return true;
         } else {
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Lex;)V")
   @ObfuscatedName("kx")
   public static void method4255(Scene var0, classEX var1) {
      if (var1 != var0.field2052) {
         var0.field2052 = var1;
         method4304(field2072, field2130, field2126, field2135, field2131);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("jf")
   static boolean method4274(int var0, int var1, int var2, int var3) {
      return method4262(field2155, var0, var1, var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("ip")
   static boolean method4265(BitSet var0, int var1, int var2, int var3, int var4, boolean var5) {
      var0.set(var1 * field2138 + var2 * field2133 + var3 * field2128 + var4, var5);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cm")
   static boolean method4296(int var0, int var1, int var2, int var3) {
      return method4282(field2154, var0, var1, var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("jt")
   static boolean method4285(BitSet var0, int var1, int var2, int var3, int var4, boolean var5) {
      var0.set(var1 * field2132 + var2 * field2134 + var3 * field2127 + var4, var5);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;)V")
   @ObfuscatedName("gw")
   public void method4442(Projection var1) {
      boolean var2 = this.field1988 != 0 && this.field2062;
      int var3 = classOE.field4843.isGpu() ? field2149 : this.field2051;

      for (int var4 = this.field2059 - 1; var4 >= this.field2040; var4--) {
         boolean var5 = this.method4488(this.field2118, this.field2119, this.field2116, var4, this.field2059 - 1 == var4);

         for (int var6 = this.field2120; var6 < this.field2123; var6++) {
            int var7 = var5 ? field2075[var6] : this.field2113;
            int var8 = var5 ? field2076[var6] : this.field2122 - 1;

            for (int var9 = var7; var9 <= var8; var9++) {
               int var10 = this.method4489(var4, var6, var9);
               if (this.method4389(var10)) {
                  int var11 = this.method4396(var10);
                  int var12 = this.field1994[this.field2150.field1710 * -483624883][var6][var9];
                  if ((var11 <= this.field2027 || var2)
                     && (
                        !this.field2062
                           || var5
                           || this.method4511(var6 - this.field2114 + this.field2053 + this.field2051, var9 - this.field2124 + this.field2054 + this.field2051)
                           || this.field2060[var4][var6][var9] - this.field2119 >= 2000
                     )
                     && (!var2 || this.field2150.field1710 * -483624883 >= var11 || var12 == 0 || !this.field2023.contains(var12))) {
                     int var13 = this.field2005[var10];
                     var13 |= 6;
                     var13 |= this.field2012[var10] <= 0 && (var13 & 128) == 0 ? 0 : 8;
                     var13 &= -16711697;
                     this.field2005[var10] = var13;
                     this.field2041++;
                  } else {
                     this.field2005[var10] = this.field2005[var10] & -23;
                  }
               }
            }
         }
      }

      int var16 = Math.abs(this.field2053);
      int var17 = Math.abs(this.field2054);

      label140:
      for (int var18 = 0; var18 < 2; var18++) {
         boolean var19 = var18 == 0;

         for (int var20 = this.field2040; var20 < this.field2059; var20++) {
            for (int var21 = -(var16 + var3); var21 <= 0; var21++) {
               int var22 = var21 + this.field2114;
               int var23 = this.field2114 - var21;
               if (var22 >= this.field2120 || var23 < this.field2123) {
                  for (int var24 = -(var17 + var3); var24 <= 0; var24++) {
                     int var28 = var24 + this.field2124;
                     int var14 = this.field2124 - var24;
                     if (var22 >= this.field2120 && var22 < this.field2123) {
                        if (var28 >= this.field2113 && var28 < this.field2122) {
                           int var15 = this.method4489(var20, var22, var28);
                           if ((this.field2005[var15] & 3) == 3) {
                              this.method4468(var1, var15, var19);
                           }
                        }

                        if (var14 >= this.field2113 && var14 < this.field2122) {
                           int var29 = this.method4489(var20, var22, var14);
                           if ((this.field2005[var29] & 3) == 3) {
                              this.method4468(var1, var29, var19);
                           }
                        }
                     }

                     if (var23 >= this.field2120 && var23 < this.field2123) {
                        if (var28 >= this.field2113 && var28 < this.field2122) {
                           int var30 = this.method4489(var20, var23, var28);
                           if ((this.field2005[var30] & 3) == 3) {
                              this.method4468(var1, var30, var19);
                           }
                        }

                        if (var14 >= this.field2113 && var14 < this.field2122) {
                           int var31 = this.method4489(var20, var23, var14);
                           if ((this.field2005[var31] & 3) == 3) {
                              this.method4468(var1, var31, var19);
                           }
                        }
                     }

                     if (this.field2041 == 0) {
                        break label140;
                     }
                  }
               }
            }
         }
      }

      this.method4516();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)V")
   @ObfuscatedName("nc")
   public static void method4231(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4317(var1, var1, var1, var1);
      }

      for (int var4 = 0; var4 < var0.field2059; var4++) {
         for (int var5 = 0; var5 < var0.field2056; var5++) {
            for (int var6 = 0; var6 < var0.field2032; var6++) {
               classEW var7 = var0.field2058[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.field1970;
                  if (var8 != null && var8.field2249 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.field2249;
                     var0.method4441(var9, var4, var5, var6, 1, 1);
                     if (var8.field2248 instanceof ModelData) {
                        ModelData var10 = (ModelData)var8.field2248;
                        var0.method4441(var10, var4, var5, var6, 1, 1);
                        ModelData.method3961(var9, var10, 0, 0, 0, false);
                        var8.field2248 = var10.method4045(var10.field1878, var10.field1879, var1, var2, var3);
                     }

                     var8.field2249 = var9.method4045(var9.field1878, var9.field1879, var1, var2, var3);
                  }

                  for (int var12 = 0; var12 < var7.field1963 * -389646721; var12++) {
                     GameObject var14 = var7.field1951[var12];
                     if (var14 != null && var14.field2200 instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.field2200;
                        var0.method4441(
                           var11,
                           var4,
                           var5,
                           var6,
                           var14.field2186 * 304142753 - var14.field2188 * 1138017605 + 1,
                           var14.field2192 * -544424899 - var14.field2194 * -555977777 + 1
                        );
                        var14.field2200 = var11.method4045(var11.field1878, var11.field1879, var1, var2, var3);
                     }
                  }

                  FloorDecoration var13 = var7.field1967;
                  if (var13 != null && var13.field1816 instanceof ModelData) {
                     ModelData var15 = (ModelData)var13.field1816;
                     var0.method4461(var15, var4, var5, var6);
                     var13.field1816 = var15.method4045(var15.field1878, var15.field1879, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIII)V")
   @ObfuscatedName("dd")
   public static void method4304(int[] var0, int var1, int var2, int var3, int var4) {
      field2072 = var0;
      field2130 = var1;
      field2126 = var2;
      field2137 = 0;
      field2136 = 0;
      field2135 = var3;
      field2131 = var4;
      field2139 = var3 / 2;
      field2129 = var4 / 2;
      field2155.set(0, field2155.size());
      field2154.set(0, field2154.size());
   }

   public byte getOverrideHue() {
      return this.field2035.field2300;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("qy")
   public int method4403(int var1) {
      return this.field2005[var1] >> 16 & 15;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Lfb;II)I")
   @ObfuscatedName("nd")
   public static int method4366(Scene var0, GameObject var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4224(var2, var2, var2);
      }

      int var4 = var2 - var1.field2188 * 1138017605;
      int var5 = var1.field2186 * 304142753 - var2;
      if (var5 > var4) {
         var4 = var5;
      }

      int var6 = var3 - var1.field2194 * -555977777;
      int var7 = var1.field2192 * -544424899 - var3;
      return var7 > var6 ? var4 + var7 : var4 + var6;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;ZZ)V")
   @ObfuscatedName("li")
   void method4349(Projection var1, boolean var2, boolean var3) {
      this.field2065++;
      classFL.method4827(this.field2061, classFH.field2257.field2215);
      classFL.method4827(classFH.field2257.field2215, this.field2035);
      if (var3) {
         this.field2117 = !var2 && this.field2052 != classEX.field1977 ? this.field2121 : this.field2114;
         this.field2115 = !var2 && this.field2052 != classEX.field1977 ? this.field2125 : this.field2124;
         if (this.field2062) {
            this.field2120 = this.field2117 - this.field2051;
            if (this.field2120 < 0) {
               this.field2120 = 0;
            }

            this.field2113 = this.field2115 - this.field2051;
            if (this.field2113 < 0) {
               this.field2113 = 0;
            }

            this.field2123 = this.field2117 + this.field2051;
            if (this.field2123 > this.field2056) {
               this.field2123 = this.field2056;
            }

            this.field2122 = this.field2115 + this.field2051;
            if (this.field2122 > this.field2032) {
               this.field2122 = this.field2032;
            }
         } else {
            this.field2120 = 0;
            this.field2113 = 0;
            this.field2123 = this.field2056;
            this.field2122 = this.field2032;
            this.field2117 = this.field2056 / 2;
            this.field2115 = this.field2032 / 2;
            this.field2051 = Math.max(this.field2117, this.field2115);
         }

         this.field2053 = this.field2114 - this.field2117;
         this.field2054 = this.field2124 - this.field2115;
         if (this.field2062) {
            this.method4371();
         }
      }

      if (classFH.field2257.field2217 == 0) {
         this.method4351(var1, this.field2062);
      } else {
         classHL.method6073(this, var1, this.field2062);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("dx")
   boolean method4311(int var1, int var2) {
      if (!method4273(field2141, field2140, var1, var2)) {
         return method4267(field2141, field2140, var1, var2);
      } else {
         method4278(field2141, field2140, var1, var2, false);
         boolean var3 = false;

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (this.method4318(field2141, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141 + 1, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141 + 1, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return method4270(field2141, field2140, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILrl17;Lfx;)V")
   @ObfuscatedName("fa")
   public void method4440(int var1, rl17 var2, Model var3) {
      var3.calculateBoundsCylinder();
      int var4 = var1 - var3.field1743 * -1256242689;
      int var5 = var1 + var3.field2492;
      if (var4 < var2.field5711) {
         var2.field5711 = var4;
      }

      if (var5 > var2.field5709) {
         var2.field5709 = var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("qd")
   public void method4500(int var1) {
      this.method4486(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Z")
   @ObfuscatedName("di")
   static boolean method4320(int var0, int var1, int var2, int var3, int var4) {
      int var5 = classBF.method997(var3, (byte)-45);
      int var7 = classLL.method7119(var3, 1222866659);
      int var8 = classBF.method997(var4, (byte)-113);
      int var10 = classLL.method7119(var4, 1222866659);
      int var11 = var2 * var8 + var0 * var10 >> 16;
      int var12 = var2 * var10 - var0 * var8 >> 16;
      int var13 = var1 * var5 + var12 * var7 >> 16;
      int var14 = var1 * var7 - var12 * var5 >> 16;
      if (var13 >= 50 && var13 <= classFQ.method4929()) {
         int var15 = field2139 + var11 * 128 / var13;
         int var16 = field2129 + var14 * 128 / var13;
         return var15 >= field2137 && var15 <= field2135 && var16 >= field2136 && var16 <= field2131;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("du")
   public void method4324(boolean var1) {
      if (!this.method4334() || var1) {
         this.field2043 = true;
         this.field2033 = var1;
         this.field2036 = -1;
         this.field2037 = -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("fi")
   public void method4160(
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
            if (this.field2058[var26][var2][var3] == null) {
               this.field2058[var26][var2][var3] = new classEW(var26, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1972 = var24;
      } else if (var4 != 1) {
         if (var20 == 0) {
            var20 = 1;
         }

         SceneTileModel var23 = new SceneTileModel(
            var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20
         );

         for (int var25 = var1; var25 >= 0; var25--) {
            if (this.field2058[var25][var2][var3] == null) {
               this.field2058[var25][var2][var3] = new classEW(var25, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1973 = var23;
      } else {
         SceneTilePaint var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for (int var22 = var1; var22 >= 0; var22--) {
            if (this.field2058[var22][var2][var3] == null) {
               this.field2058[var22][var2][var3] = new classEW(var22, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1972 = var21;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ky")
   public boolean method4334() {
      return this.field2033 && this.field2036 != -1;
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfb;II)I")
   @ObfuscatedName("ds")
   public static int method4367(Scene var0, GameObject var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4369(var1, var2, var2);
      }

      int var4 = var2 - var1.field2188 * 1138017605;
      int var5 = var1.field2186 * 304142753 - var2;
      if (var5 > var4) {
         var4 = var5;
      }

      int var6 = var3 - var1.field2194 * -555977777;
      int var7 = var1.field2192 * -544424899 - var3;
      return var7 > var6 ? var4 + var7 : var4 + var6;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("de")
   public void method4345(int var1) {
      this.field2142 = var1;
      this.field2026 = -1;
      this.field2034 = -1;
      this.field2042 = -1.0F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIILee;Lee;IIJI)V")
   @ObfuscatedName("xs")
   public static void method4173(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      if (var0 == null) {
         var0.method4210(var1, var1, var1);
      }

      if (var5 != null || var6 != null) {
         BoundaryObject var12 = new BoundaryObject();
         var12.field2240 = var9 * -2636099314526831141L;
         var12.field2241 = var11 * -752902543;
         var12.field2244 = var2 * -1994411555 + 1685800512;
         var12.field2245 = var3 * -669945546 + -326366588;
         var12.field2242 = var4 * -1658828428;
         var12.field2249 = var5;
         var12.field2248 = var6;
         var12.field2246 = var7 * -484103910;
         var12.field2243 = var8 * 760556117;

         for (int var13 = var1; var13 >= 0; var13--) {
            if (var0.field2058[var13][var2][var3] == null) {
               var0.field2058[var13][var2][var3] = new classEW(var13, var2, var3);
            }
         }

         var0.field2058[var1][var2][var3].field1970 = var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("je")
   static boolean method4297(int var0, int var1, int var2, int var3) {
      return method4282(field2154, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lew;Z)V")
   @ObfuscatedName("do")
   void method4407(Projection var1, classEW var2, boolean var3) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dq")
   void method4371() {
      int var1 = this.field2063[this.field2027];
      classEP[] var2 = this.field2039[this.field2027];
      this.field2110 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         classEP var4 = var2[var3];
         if (var4.field1823 * -71966871 == 1) {
            int var14 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
            if (var14 >= 0 && var14 <= this.field2051 + this.field2051) {
               int var16 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
               if (var16 < 0) {
                  var16 = 0;
               }

               int var18 = var4.field1818 * -899751495 - this.field2124 + this.field2051;
               if (var18 > this.field2051 + this.field2051) {
                  var18 = this.field2051 + this.field2051;
               }

               boolean var20 = false;

               while (var16 <= var18) {
                  if (this.method4311(var14, var16++)) {
                     var20 = true;
                     break;
                  }
               }

               if (var20) {
                  int var22 = this.field2118 - var4.field1830 * -996295335;
                  if (var22 > 32) {
                     var4.field1825 = -307181543;
                  } else {
                     if (var22 >= -32) {
                        continue;
                     }

                     var4.field1825 = -614363086;
                     var22 = -var22;
                  }

                  var4.field1820 = (var4.field1819 * -832449137 - this.field2116 << 8) / var22 * -1015514901;
                  var4.field1828 = (var4.field1817 * -371025921 - this.field2116 << 8) / var22 * 306530981;
                  var4.field1831 = (var4.field1827 * 318014867 - this.field2119 << 8) / var22 * -1741242211;
                  var4.field1824 = (var4.field1826 * -971837087 - this.field2119 << 8) / var22 * -2051350499;
                  this.field2048[this.field2110++] = var4;
               }
            }
         } else if (var4.field1823 * -71966871 == 2) {
            int var13 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
            if (var13 >= 0 && var13 <= this.field2051 + this.field2051) {
               int var15 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
               if (var15 < 0) {
                  var15 = 0;
               }

               int var17 = var4.field1822 * -753584253 - this.field2114 + this.field2051;
               if (var17 > this.field2051 + this.field2051) {
                  var17 = this.field2051 + this.field2051;
               }

               boolean var19 = false;

               while (var15 <= var17) {
                  if (this.method4311(var15++, var13)) {
                     var19 = true;
                     break;
                  }
               }

               if (var19) {
                  int var21 = this.field2116 - var4.field1819 * -832449137;
                  if (var21 > 32) {
                     var4.field1825 = -921544629;
                  } else {
                     if (var21 >= -32) {
                        continue;
                     }

                     var4.field1825 = -1228726172;
                     var21 = -var21;
                  }

                  var4.field1833 = (var4.field1830 * -996295335 - this.field2118 << 8) / var21 * -1640466283;
                  var4.field1829 = (var4.field1832 * 1506923105 - this.field2118 << 8) / var21 * 323343539;
                  var4.field1831 = (var4.field1827 * 318014867 - this.field2119 << 8) / var21 * -1741242211;
                  var4.field1824 = (var4.field1826 * -971837087 - this.field2119 << 8) / var21 * -2051350499;
                  this.field2048[this.field2110++] = var4;
               }
            }
         } else if (var4.field1823 * -71966871 == 4) {
            int var5 = var4.field1827 * 318014867 - this.field2119;
            if (var5 > 128) {
               int var6 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = var4.field1818 * -899751495 - this.field2124 + this.field2051;
               if (var7 > this.field2051 + this.field2051) {
                  var7 = this.field2051 + this.field2051;
               }

               if (var6 <= var7) {
                  int var8 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  int var9 = var4.field1822 * -753584253 - this.field2114 + this.field2051;
                  if (var9 > this.field2051 + this.field2051) {
                     var9 = this.field2051 + this.field2051;
                  }

                  boolean var10 = false;

                  label189:
                  for (int var11 = var8; var11 <= var9; var11++) {
                     for (int var12 = var6; var12 <= var7; var12++) {
                        if (this.method4311(var11, var12)) {
                           var10 = true;
                           break label189;
                        }
                     }
                  }

                  if (var10) {
                     var4.field1825 = -1535907715;
                     var4.field1833 = (var4.field1830 * -996295335 - this.field2118 << 8) / var5 * -1640466283;
                     var4.field1829 = (var4.field1832 * 1506923105 - this.field2118 << 8) / var5 * 323343539;
                     var4.field1820 = (var4.field1819 * -832449137 - this.field2116 << 8) / var5 * -1015514901;
                     var4.field1828 = (var4.field1817 * -371025921 - this.field2116 << 8) / var5 * 306530981;
                     this.field2048[this.field2110++] = var4;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;I)V")
   @ObfuscatedName("xv")
   public static void method4346(Scene var0, int var1) {
      if (var0 == null) {
         var0.method4348(var1);
      } else {
         var0.field2142 = var1;
         var0.field2026 = -1;
         var0.field2034 = -1;
         var0.field2042 = -1.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("mf")
   boolean method4376(int var1, int var2, int var3, int var4) {
      if (!this.method4374(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method4386(var5 + 1, this.field2060[var1][var2][var3] - var4, var6 + 1)
            && this.method4386(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3] - var4, var6 + 1)
            && this.method4386(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
            && this.method4386(var5 + 1, this.field2060[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hp")
   public void method4215(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         var4.field1967 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("mz")
   boolean method4374(int var1, int var2, int var3) {
      int var4 = this.field2031[var1][var2][var3];
      if (var4 == -this.field2065) {
         return false;
      } else if (var4 == this.field2065) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method4386(var5 + 1, this.field2060[var1][var2][var3], var6 + 1)
            && this.method4386(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3], var6 + 1)
            && this.method4386(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
            && this.method4386(var5 + 1, this.field2060[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2031[var1][var2][var3] = this.field2065;
            return true;
         } else {
            this.field2031[var1][var2][var3] = -this.field2065;
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ds")
   boolean method4375(int var1, int var2, int var3, int var4) {
      if (!this.method4374(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field2060[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.field2118) {
                  if (!this.method4386(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method4386(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method4386(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method4386(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method4386(var5, var9, var6)) {
                  return false;
               }

               if (!this.method4386(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.field2116) {
                  if (!this.method4386(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method4386(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method4386(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method4386(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method4386(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method4386(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.field2118) {
                  if (!this.method4386(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method4386(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method4386(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method4386(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method4386(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method4386(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.field2116) {
                  if (!this.method4386(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method4386(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method4386(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method4386(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method4386(var5, var9, var6)) {
                  return false;
               }

               if (!this.method4386(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method4386(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method4386(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method4386(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method4386(var5 + 128, var9, var6);
         } else {
            return var4 == 128 ? this.method4386(var5, var9, var6) : true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("gl")
   public int method4396(int var1) {
      int var2 = var1 >> this.field1996 & 3;
      return (this.field2005[var1] & 64) != 0 ? 0 : var2;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("mg")
   boolean method4381(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var3 && var4 == var5) {
         if (!this.method4374(var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return this.method4386(var13 + 1, this.field2060[var1][var2][var4] - var6, var15 + 1)
               && this.method4386(var13 + 128 - 1, this.field2060[var1][var2 + 1][var4] - var6, var15 + 1)
               && this.method4386(var13 + 128 - 1, this.field2060[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
               && this.method4386(var13 + 1, this.field2060[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (this.field2031[var1][var7][var8] == -this.field2065) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = this.field2060[var1][var2][var4] - var6;
         if (!this.method4386(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method4386(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !this.method4386(var12, var9, var11) ? false : this.method4386(var10, var9, var11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("iw")
   public void method4251(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      classEW var7 = this.field2058[var4][var5][var6];
      if (var7 != null) {
         SceneTilePaint var8 = var7.field1972;
         if (var8 != null) {
            int var18 = var8.field2289 * -1850192500;
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
            SceneTileModel var9 = var7.field1973;
            if (var9 != null) {
               int var10 = var9.field2320;
               int var11 = var9.field2326;
               int var12 = var9.field2333;
               int var13 = var9.field2321;
               int[] var14 = field2085[var10];
               int[] var15 = field2081[var11];
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

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("sg")
   public boolean method4435(int var1) {
      return (this.field2005[var1] & 4) != 0;
   }

   public void setDrawDistance(int var1) {
      field2149 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("lx")
   @Override
   void vmethod415(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      IntProjection var15 = IntProjection.field1939;
      float var16 = var15.field1933;
      float var17 = var15.field1930;
      float var18 = var15.field1931;
      classUG var19 = classUG.method11322();
      var19.field6305.method11403(client.method2292(var1 & 2047), 0.0F, 0.0F);
      classSJ.method10457(var19.field6307, var4, var5, var6);
      classUG var20 = classUG.method11322();
      classSJ.method10457(var20.field6307, -(this.field2056 * 64) - this.field2029, this.field2030, -(this.field2032 * 64) - this.field2047);
      classUU var21 = ((FloatProjection)this.field2024).transformationMatrix;
      var21.method11655(var20);
      classUU var22 = classUU.method11645();
      var22.method11654(1.0F, this.field2055, 1.0F, 1.0F);
      var21.method11652(var22);
      var21.method11652(this.field2028);
      var22.method11655(var19);
      var21.method11652(var22);
      var22.method11649(var21);
      var22.method11653();
      this.field2095 = var22.method11657(var16, var17, var18);
      this.field2091 = var22.method11660(var16, var17, var18);
      this.field2094 = var22.method11656(var16, var17, var18);
      this.field2118 = (int)this.field2095;
      this.field2119 = (int)this.field2091;
      this.field2116 = (int)this.field2094;
      this.field2114 = this.field2118 >> 7;
      this.field2124 = this.field2116 >> 7;
      this.field2121 = (int)var22.method11657(var12, 0.0F, var13) >> 7;
      this.field2125 = (int)var22.method11656(var12, 0.0F, var13) >> 7;
      var19.method11323();
      var20.method11323();
      var22.method11662();
      this.field2018.transformationMatrix.method11649(var21);
      classUX var23 = classUX.field6410;
      var23.method11700();
      var23.method11699(-var15.field1929);
      var23.method11698(-var15.field1935);
      var23.method11702(var16, var17, var18);
      classUU var24 = classUU.method11645();
      var24.method11661(var23);
      var24.method11653();
      var21.method11652(var24);
      var24.method11662();
      classFO.field2346 = false;
      ((FloatProjection)this.field2024).field1765 = var10 * 5128300923381284097L;
      if ((client.field1096 & 16) != 0) {
         this.method4390(true, var14);
         this.method4470(this.field2024, this.field2018);
         classFH.field2257.field2215.method4844(this.field2061);
      } else {
         this.method4390(classFH.field2257.field2217 != 1, var14);
         if (classFH.field2257.field2217 == 0) {
            assert classFH.field2261.method4955();

            assert !classOE.field4843.isGpu();

            this.method4393(this.field2024);
         } else {
            this.method4442(this.field2024);
         }

         classFH.field2257.field2215.method4844(this.field2061);
         if (client.field1118 != null) {
            client.field1118.postDrawScene();
         }
      }

      classFO.field2346 = false;
   }

   public short[][][] getOverlayIds() {
      return this.field2017;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ey")
   public int method4414(int var1, int var2, int var3) {
      return this.field2060[var1][var2 + 1][var3 + 1]
            + this.field2060[var1][var2][var3]
            + this.field2060[var1][var2 + 1][var3]
            + this.field2060[var1][var2][var3 + 1]
         >> 2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ek")
   public int method4123() {
      return this.field2064;
   }

   @ObfuscatedSignature(descriptor = "(ILfx;)V")
   @ObfuscatedName("es")
   public void method4124(int var1, Model var2) {
      this.field2064 = var1;
      this.field2151 = var2;
   }

   @ObfuscatedSignature(descriptor = "(ILfx;)V")
   @ObfuscatedName("ej")
   public void method4125(int var1, Model var2) {
      this.field2064 = var1;
      this.field2151 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kl")
   public void method4328() {
      this.field2033 = true;
   }

   public int getRoofRemovalMode() {
      return this.field1988;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ev")
   public void method4128() {
      this.field2064 = -1;
      this.field2151 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)I")
   @ObfuscatedName("eh")
   public static int method4132(boolean var0) {
      return var0 ? 1 : 1024;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lj")
   void method4337() {
      if (this.field2043) {
         this.field2043 = false;
         this.field2036 = this.field2026;
         this.field2037 = this.field2034;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)I")
   @ObfuscatedName("en")
   public static int method4133(boolean var0) {
      return var0 ? 1 : 1024;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)I")
   @ObfuscatedName("ex")
   public static int method4134(boolean var0) {
      return var0 ? 1 : 1024;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)I")
   @ObfuscatedName("eq")
   public static int method4136(boolean var0) {
      return var0 ? 4160 : -1300232836;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lfv;Lrl17;)V")
   @ObfuscatedName("er")
   public void method4426(Projection var1, Projection var2, rl17 var3) {
      if (this.method4400(var1, var3)) {
         int var4 = var3.field5707;
         int var5 = var3.field5710;

         for (int var6 = this.field2040; var6 < this.field2059; var6++) {
            for (int var7 = var4 << 3; var7 < var4 + 1 << 3; var7++) {
               for (int var8 = var5 << 3; var8 < var5 + 1 << 3; var8++) {
                  int var9 = this.method4489(var6, var7, var8);
                  if (this.method4389(var9)) {
                     int var10 = var9 >> this.field1995 & this.field1997;
                     int var11 = var9 & this.field1998;
                     int var12 = var9 >> this.field1996 & 3;
                     int var13 = this.field2005[var9];
                     int var14 = this.method4423(var9);
                     int var15 = this.method4396(var9);
                     int var16 = var10 - this.field2147;
                     int var17 = var11 - this.field2147;
                     if (var15 <= this.field2027) {
                        if ((var13 & 32) != 0) {
                           int var18 = this.method4489(3, var10, var11);
                           int var19 = this.field2005[var18];
                           if ((var19 & 256) != 0) {
                              var1.method5033(this, this.field2006[var18], 0, 0, var16, var17);
                           } else if ((var19 & 1024) != 0) {
                              var1.method5032(this, this.field2007[var18], 0, var16, var17);
                           }
                        }

                        if ((var13 & 256) != 0) {
                           if ((var13 & 512) != 0 || var12 <= this.field2044) {
                              SceneTilePaint var20 = this.field2006[var9];
                              var1.method5033(this, var20, var15, var14, var16, var17);
                           }
                        } else if ((var13 & 1024) != 0) {
                           var1.method5032(this, this.field2007[var9], var15, var16, var17);
                        }

                        if ((var13 & 2048) != 0) {
                           FloorDecoration var21 = this.field2010[var9];
                           this.method4406(
                              var1,
                              var2,
                              var21.field1816,
                              0,
                              var21.field1806 * 1333275141,
                              var21.field1807 * -276908185,
                              var21.field1808 * 498815127,
                              var21.field1815 * 5132338419383099835L
                           );
                        }

                        if ((var13 & 16384) != 0) {
                           BoundaryObject var22 = this.field2008[var9];
                           this.method4406(
                              var1,
                              var2,
                              var22.field2249,
                              0,
                              var22.field2244 * -777838807,
                              var22.field2242 * 1315862339,
                              var22.field2245 * 31139801,
                              var22.field2240 * 7159317397185328723L
                           );
                           this.method4406(
                              var1,
                              var2,
                              var22.field2248,
                              0,
                              var22.field2244 * -777838807,
                              var22.field2242 * 1315862339,
                              var22.field2245 * 31139801,
                              var22.field2240 * 7159317397185328723L
                           );
                        }

                        if ((var13 & 32768) != 0) {
                           WallDecoration var23 = this.field2009[var9];
                           this.method4406(
                              var1,
                              var2,
                              var23.field2279,
                              0,
                              var23.field2270 * 1766830743 + var23.field2267 * -404927711,
                              var23.field2268 * 1698079433,
                              var23.field2275 * -361702377 + var23.field2273 * 856605829,
                              var23.field2266 * -3608662145112923099L
                           );
                           this.method4406(
                              var1,
                              var2,
                              var23.field2278,
                              0,
                              var23.field2270 * 1766830743 + var23.field2272 * -1085897215,
                              var23.field2268 * 1698079433,
                              var23.field2275 * -361702377 + var23.field2271 * 513256357,
                              var23.field2266 * -3608662145112923099L
                           );
                        }

                        for (int var24 = 0; var24 < this.field2012[var9]; var24++) {
                           GameObject var25 = this.field2013[var9 * 5 + var24];
                           if (var25.field2197 * 163498159 != this.field2065) {
                              var25.field2197 = this.field2065 * 132222543;
                              this.method4406(
                                 var1,
                                 var2,
                                 var25.field2200,
                                 var25.field2189 * 470594389,
                                 var25.field2195 * -1405731525,
                                 var25.field2190 * 1269801851,
                                 var25.field2196 * -1706390585,
                                 var25.field2185 * 1745853678706228013L
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)I")
   @ObfuscatedName("er")
   public static int method4137(boolean var0) {
      return var0 ? 4160 : 3064;
   }

   @ObfuscatedSignature(descriptor = "(IIF)V")
   @ObfuscatedName("ow")
   public void method4438(int var1, int var2, float var3) {
      int var4 = var1;
      int var5 = var2;
      Player var6 = classDC.field1393;
      if (this.field2062 && var6 != null && var6.method3284().isTopLevel()) {
         int var7 = var6.field1487 * -1547553299 >> 7;
         int var8 = var6.field1489 * -1272026483 >> 7;
         byte var11 = 70;
         int var12 = (int)Math.hypot(var7 - var1, var8 - var2) - 70;
         if (var12 > 0) {
            var4 = (70 * var1 + var12 * var7) / (70 + var12);
            var5 = (70 * var2 + var12 * var8) / (70 + var12);
         }
      }

      this.field2026 = var4;
      this.field2034 = var5;
      this.field2042 = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eo")
   public static int method4140() {
      return field2066;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("iz")
   public void method4415() {
      for (int var1 = 0; var1 < this.field2056 >> 3; var1++) {
         for (int var2 = 0; var2 < this.field2032 >> 3; var2++) {
            rl17 var3 = this.field2020[var1][var2];
            boolean var4 = false;

            for (TileObject var6 : var3.field5705) {
               if (var6 instanceof GameObject) {
                  GameObject var10 = (GameObject)var6;
                  var4 |= this.method4429(
                     var10.field2200,
                     var10.getOrientation(),
                     var10.getX(),
                     var10.getZ(),
                     var10.getY(),
                     var10.field2188 * 1138017605,
                     var10.field2194 * -555977777
                  );
               } else if (var6 instanceof BoundaryObject) {
                  BoundaryObject var9 = (BoundaryObject)var6;
                  var4 |= this.method4429(var9.field2249, 0, var9.getX(), var9.getZ(), var9.getY(), var9.getX() >> 7, var9.getY() >> 7)
                     || this.method4429(var9.field2248, 0, var9.getX(), var9.getZ(), var9.getY(), var9.getX() >> 7, var9.getY() >> 7);
               } else if (!(var6 instanceof WallDecoration)) {
                  if (var6 instanceof FloorDecoration) {
                     FloorDecoration var8 = (FloorDecoration)var6;
                     var4 |= this.method4429(var8.field1816, 0, var8.getX(), var8.getZ(), var8.getY(), var8.getX() >> 7, var8.getY() >> 7);
                  }
               } else {
                  WallDecoration var7 = (WallDecoration)var6;
                  var4 |= this.method4429(var7.field2279, 0, var7.getX(), var7.getZ(), var7.getY(), var7.getX() >> 7, var7.getY() >> 7)
                     || this.method4429(var7.field2278, 0, var7.getX(), var7.getZ(), var7.getY(), var7.getX() >> 7, var7.getY() >> 7);
               }
            }

            if (var4 && client.field1118 != null) {
               client.field1118.invalidateZone(this, var3.field5707, var3.field5710);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("et")
   public static int method4141() {
      return field2066;
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;IJ)Z")
   @ObfuscatedName("go")
   public boolean method4188(int var1, int var2, int var3, int var4, Renderable var5, int var6, long var7) {
      if (var5 == null) {
         return false;
      } else {
         int var9 = var2 / 128;
         int var10 = var3 / 828775391;
         if (var9 >= 0 && var10 >= 0 && var9 < this.field2056 && var10 < this.field2032) {
            classEW var11 = this.field2058[var1][var9][var10];
            if (var11 != null && (var11.field1955 == null || var11.field1955.size() != 50)) {
               if (var11.field1955 == null) {
                  var11.field1955 = new ArrayList();
               }

               GameObject var12 = new GameObject();
               var12.field2185 = var7 * -4819202259227702107L;
               var12.field2184 = 0;
               var12.field2187 = var1 * 496176618;
               var12.field2195 = var2 * 550346604;
               var12.field2196 = var3 * -94575718;
               var12.field2190 = var4 * 1573958690;
               var12.field2200 = var5;
               var12.field2189 = var6 * 672279374;
               var12.field2188 = var9 * 1137974587;
               var12.field2194 = var10 * -1297334770;
               var12.field2186 = var9 * 1384467041;
               var12.field2192 = var10 * 665976936;
               var11.field1955.add(var12);
               this.method4189(var11);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lfv;)V")
   @ObfuscatedName("iy")
   public void method4470(Projection var1, Projection var2) {
      int var3 = this.field2114 >> 3;
      int var4 = this.field2124 >> 3;
      int var5 = field2149 >> 3;
      int var6 = this.field2056 >> 3;
      int var7 = this.field2032 >> 3;
      this.field2143 = 0;

      for (int var8 = -var5; var8 <= var5; var8++) {
         for (int var9 = -var5; var9 <= var5; var9++) {
            int var10 = var3 + var8;
            int var11 = var4 + var9;
            if (var10 >= 0 && var10 < var6 && var11 >= 0 && var11 < var7) {
               rl17 var12 = this.field2021[this.field2143++] = this.field2020[var10][var11];
               var12.field5713 = false;
            }
         }
      }

      Arrays.sort(this.field2021, 0, this.field2143, this.field1992);
      rl23.method10064(var1, this);

      for (int var13 = 0; var13 < this.field2143; var13++) {
         rl17 var16 = this.field2021[var13];
         if (!this.field2062 || this.method4449(var16, var16.field5707, var16.field5710)) {
            var16.field5713 = true;
            client.field1118.drawZoneOpaque(var2, this, var16.field5707, var16.field5710);
            this.method4392(var1, var2, var16, this.field2023);
            this.method4426(var1, var2, var16);
         }
      }

      for (int var14 = this.field2143 - 1; var14 >= 0; var14--) {
         rl17 var17 = this.field2021[var14];
         if (var17.field5713) {
            this.method4469(var1, var2, var17);
         }
      }

      rl23.method10065();
      rl23.method10071();

      for (int var15 = this.field2143 - 1; var15 >= 0; var15--) {
         rl17 var18 = this.field2021[var15];
         if (var18.field5713) {
            this.method4474(var1, var18);
         }
      }

      client.field1118.drawPass(var2, this, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIILee;JLee;Lee;I)V")
   @ObfuscatedName("lt")
   public static void method4171(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9, int var10) {
      if (var0 == null) {
         var0.method4484(var1, var1);
      } else {
         ItemLayer var11 = new ItemLayer();
         var11.field1846 = var5;
         var11.field1840 = var2 * -1295840384 + 1499563456;
         var11.field1839 = var3 * 75852928 + -2109557184;
         var11.field1841 = var4 * -673866411;
         var11.field1844 = var6;
         var11.field1847 = var8;
         var11.field1845 = var9;
         var11.field1838 = var10 * 1484214011;
         if (var0.field2058[var1][var2][var3] == null) {
            var0.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
         }

         var0.field2058[var1][var2][var3].field1968 = var11;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("dc")
   static boolean method4301(int var0, int var1, int var2, int var3, boolean var4) {
      return method4288(field2154, var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("ef")
   public static boolean method4146(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ez")
   public void method4147() {
      for (int var1 = 0; var1 < this.field2059; var1++) {
         for (int var2 = 0; var2 < this.field2056; var2++) {
            for (int var3 = 0; var3 < this.field2032; var3++) {
               this.field2058[var1][var2][var3] = null;
            }
         }
      }

      if (this.field2063 != null) {
         for (int var4 = 0; var4 < this.field2038; var4++) {
            for (int var7 = 0; var7 < this.field2063[var4]; var7++) {
               this.field2039[var4][var7] = null;
            }

            this.field2063[var4] = 0;
         }
      }

      if (this.field2048 != null) {
         Arrays.fill(this.field2048, null);
      }

      this.field2110 = 0;

      for (int var5 = 0; var5 < this.field2050; var5++) {
         this.field2057[var5] = null;
      }

      this.field2050 = 0;

      for (int var6 = 0; var6 < this.field2025.length; var6++) {
         this.field2025[var6] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ei")
   public void method4148() {
      for (int var1 = 0; var1 < this.field2059; var1++) {
         for (int var2 = 0; var2 < this.field2056; var2++) {
            for (int var3 = 0; var3 < this.field2032; var3++) {
               this.field2058[var1][var2][var3] = null;
            }
         }
      }

      if (this.field2063 != null) {
         for (int var4 = 0; var4 < this.field2038; var4++) {
            for (int var7 = 0; var7 < this.field2063[var4]; var7++) {
               this.field2039[var4][var7] = null;
            }

            this.field2063[var4] = 0;
         }
      }

      if (this.field2048 != null) {
         Arrays.fill(this.field2048, null);
      }

      this.field2110 = 0;

      for (int var5 = 0; var5 < this.field2050; var5++) {
         this.field2057[var5] = null;
      }

      this.field2050 = 0;

      for (int var6 = 0; var6 < this.field2025.length; var6++) {
         this.field2025[var6] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ee")
   public void method4149() {
      for (int var1 = 0; var1 < this.field2059; var1++) {
         for (int var2 = 0; var2 < this.field2056; var2++) {
            for (int var3 = 0; var3 < this.field2032; var3++) {
               this.field2058[var1][var2][var3] = null;
            }
         }
      }

      if (this.field2063 != null) {
         for (int var4 = 0; var4 < this.field2038; var4++) {
            for (int var7 = 0; var7 < this.field2063[var4]; var7++) {
               this.field2039[var4][var7] = null;
            }

            this.field2063[var4] = 0;
         }
      }

      if (this.field2048 != null) {
         Arrays.fill(this.field2048, null);
      }

      this.field2110 = 0;

      for (int var5 = 0; var5 < this.field2050; var5++) {
         this.field2057[var5] = null;
      }

      this.field2050 = 0;

      for (int var6 = 0; var6 < this.field2025.length; var6++) {
         this.field2025[var6] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eb")
   public void method4151(int var1) {
      this.field2040 = var1;

      for (int var2 = 0; var2 < this.field2056; var2++) {
         for (int var3 = 0; var3 < this.field2032; var3++) {
            if (this.field2058[var1][var2][var3] == null) {
               this.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrj;Ljava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("ue")
   public static Object method4121(classRJ var0, Object var1) {
      if (var0 == null) {
         var0.method9990();
      }

      synchronized (var0) {
         if (-1L != -6953202533736370667L * var0.field5679) {
            var0.method9991((byte)106);
         }

         classRO var3 = (classRO)var0.field5673.get(var1);
         if (var3 == null) {
            return null;
         } else {
            var0.method9986(var3, false, (byte)29);
            return var3.field5821;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lew;)V")
   @ObfuscatedName("gt")
   void method4198(classEW var1) {
      var1.field1954 = 0;

      for (int var2 = 0; var2 < var1.field1963 * -389646721; var2++) {
         var1.field1954 = (var1.field1954 * -785027619 | var1.field1953[var2]) * -1095478667;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("ii")
   public static void method4388(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Scene var7 = classCQ.field1220.scene;
      int var8 = var1 + var7.field2147;
      int var9 = var2 + var7.field2147;
      if (var5 == 2) {
         GameObject var10 = var7.method4519(var0, var1, var2);
         if (var10 != null && var10.field2200 instanceof DynamicObject && !((DynamicObject)var10.field2200).method3709()) {
            return;
         }
      } else if (var5 == 3) {
         FloorDecoration var11 = var7.method4502(var0, var1, var2);
         if (var11 != null && var11.field1816 instanceof DynamicObject && !((DynamicObject)var11.field1816).method3709()) {
            return;
         }
      }

      if (client.field1118 != null) {
         client.field1118.invalidateZone(var7, var8 >> 3, var9 >> 3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ec")
   public void method4154(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      classEP var9 = new classEP();
      var9.field1834 = var3 / 1157169464 * 704810239;
      var9.field1822 = var4 / 1382290822 * -1209725141;
      var9.field1821 = var5 / 128 * -78990867;
      var9.field1818 = var6 / 1257729063 * 1157954288;
      var9.field1823 = var2 * 185901273;
      var9.field1830 = var3 * -1875068183;
      var9.field1832 = var4 * 1706709409;
      var9.field1819 = var5 * 106408303;
      var9.field1817 = var6 * 1541236735;
      var9.field1827 = var7 * -969645925;
      var9.field1826 = var8 * 1077506721;
      this.field2039[var1][this.field2063[var1]++] = var9;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;)V")
   @ObfuscatedName("nz")
   public void method4387(Projection var1) {
      this.field2061.method4844(classFH.field2257.field2215);
      classFH.field2257.field2215.method4844(this.field2035);
      client.field1118.drawPass(var1, this, 2);

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = this.field2143 - 1; var3 >= 0; var3--) {
            rl17 var4 = this.field2021[var3];
            if (var4.field5713) {
               client.field1118.drawZoneAlpha(var1, this, var2, var4.field5707, var4.field5710);

               for (int var5 = 0; var5 < var4.field5706.size(); var5++) {
                  GameObject var6 = (GameObject)var4.field5706.get(var5);
                  if (var6.field2187 * 568825275 == var2 && var6.field2200 instanceof Scene) {
                     Scene var7 = (Scene)var6.field2200;
                     var7.method4387(var7.field2018);
                  }
               }
            }
         }
      }

      client.field1118.drawPass(var1, this, 1);
      client.field1118.postSceneDraw(this);
      this.method4516();
      classFH.field2257.field2215.method4844(this.field2061);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("fo")
   public void method4155(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      classEP var9 = new classEP();
      var9.field1834 = var3 / 128 * 704810239;
      var9.field1822 = var4 / 128 * -1209725141;
      var9.field1821 = var5 / 128 * -78990867;
      var9.field1818 = var6 / 128 * 950850697;
      var9.field1823 = var2 * 185901273;
      var9.field1830 = var3 * -1875068183;
      var9.field1832 = var4 * 1706709409;
      var9.field1819 = var5 * 106408303;
      var9.field1817 = var6 * 1541236735;
      var9.field1827 = var7 * -969645925;
      var9.field1826 = var8 * 1077506721;
      this.field2039[var1][this.field2063[var1]++] = var9;
   }

   @ObfuscatedSignature(descriptor = "(Lez;IIIIII)I")
   @ObfuscatedName("fw")
   public static int method4240(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      return var0 == null ? var0.method4243(var1, var1, var1, var1, var1, var1) : method4249(var0, var1, var2, var3) - method4249(var0, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("fl")
   public void method4156(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      classEP var9 = new classEP();
      var9.field1834 = var3 / 128 * 184212436;
      var9.field1822 = var4 / 2103908952 * -1209725141;
      var9.field1821 = var5 / 1583989872 * -78990867;
      var9.field1818 = var6 / -225053351 * 807895637;
      var9.field1823 = var2 * 185901273;
      var9.field1830 = var3 * -1875068183;
      var9.field1832 = var4 * -251997020;
      var9.field1819 = var5 * -350625218;
      var9.field1817 = var6 * 1541236735;
      var9.field1827 = var7 * 1615984411;
      var9.field1826 = var8 * 1077506721;
      this.field2039[var1][this.field2063[var1]++] = var9;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIIILee;IJZ)Z")
   @ObfuscatedName("cm")
   public static boolean method4180(Scene var0, int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
      if (var0 == null) {
         var0.method4491();
      }

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

            if (var7 > -1414134963 && var7 < 1249345380) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < -258490443) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < -674450742) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= -1011951674;
         var13 /= -1767950335;
         var14 /= 288632182;
         return var0.method4430(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public void setMinLevel(int var1) {
      this.field2040 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lez;III)I")
   @ObfuscatedName("ir")
   public static int method4492(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4494(var1, var1, var1);
      }

      int var4 = var2 + var0.field2147;
      int var5 = var3 + var0.field2147;
      int var6 = 0;
      int var7 = var0.method4489(var1, var4, var5);
      if (var0.method4389(var7)) {
         byte var8 = var0.field2012[var7];

         for (int var9 = 0; var9 < var8; var9++) {
            GameObject var10 = var0.field2013[var7 * 5 + var9];
            if ((var10.field2184 * -288062455 & 256) == 256 && var10.field2200 instanceof Model) {
               Model var11 = (Model)var10.field2200;
               var11.calculateBoundsCylinder();
               if (var11.field1743 * -1256242689 > var6) {
                  var6 = var11.field1743 * -1256242689;
               }
            }
         }
      }

      return var6;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fj")
   public void method4157(int var1, int var2, int var3, int var4) {
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         this.field2058[var1][var2][var3].field1964 = var4 * 1248621793;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;I)V")
   @ObfuscatedName("pq")
   public void method4422(Projection var1, int var2) {
      int var3 = this.field2005[var2];
      if ((var3 & 32) != 0) {
         int var4 = 3 << this.field1996 | var2;
         this.method4422(var1, var4);
      }

      int var17 = var2 >> this.field1995 & this.field1997;
      int var5 = var2 & this.field1998;
      int var6 = var2 >> this.field1996 & 3;
      int var7 = this.method4423(var2);
      int var8 = this.method4396(var2);
      int var9 = var17 - this.field2147;
      int var10 = var5 - this.field2147;
      if ((var3 & 256) != 0) {
         if (!this.method4523(var7, var17, var5) && ((var3 & 512) != 0 || var6 <= this.field2044)) {
            SceneTilePaint var11 = this.field2006[var2];
            var1.method5033(this, var11, var8, var7, var9, var10);
         }
      } else if ((var3 & 1024) != 0 && !this.method4523(var7, var17, var5)) {
         var1.method5032(this, this.field2007[var2], var8, var9, var10);
      }

      if ((var3 & 16384) != 0) {
         BoundaryObject var18 = this.field2008[var2];
         if (var18.field2249 != null && !this.method4521(var7, var17, var5, var18.field2246 * 1548562339)) {
            this.method4490(
               var1,
               var18.field2249,
               0,
               var18.field2244 * -777838807,
               var18.field2242 * 1315862339,
               var18.field2245 * 31139801,
               var18.field2240 * 7159317397185328723L
            );
         }

         if (var18.field2248 != null && !this.method4521(var7, var17, var5, var18.field2246 * 1548562339)) {
            this.method4490(
               var1,
               var18.field2248,
               0,
               var18.field2244 * -777838807,
               var18.field2242 * 1315862339,
               var18.field2245 * 31139801,
               var18.field2240 * 7159317397185328723L
            );
         }
      }

      if ((var3 & 32768) != 0) {
         WallDecoration var19 = this.field2009[var2];
         if (!this.method4509(var7, var17, var5, var19.field2279.field1743 * -1256242689)) {
            if (var19.field2276 * 254285683 == 256) {
               this.method4490(
                  var1,
                  var19.field2279,
                  0,
                  var19.field2270 * 1766830743 + var19.field2267 * -404927711,
                  var19.field2268 * 1698079433,
                  var19.field2275 * -361702377 + var19.field2273 * 856605829,
                  var19.field2266 * -3608662145112923099L
               );
               if (var19.field2278 != null) {
                  this.method4490(
                     var1,
                     var19.field2278,
                     0,
                     var19.field2270 * 1766830743 + var19.field2272 * -1085897215,
                     var19.field2268 * 1698079433,
                     var19.field2275 * -361702377 + var19.field2271 * 513256357,
                     var19.field2266 * -3608662145112923099L
                  );
               }
            } else {
               this.method4490(
                  var1,
                  var19.field2279,
                  0,
                  var19.field2270 * 1766830743 + var19.field2267 * -404927711,
                  var19.field2268 * 1698079433,
                  var19.field2275 * -361702377 + var19.field2273 * 856605829,
                  var19.field2266 * -3608662145112923099L
               );
            }
         }
      }

      if ((var3 & 2048) != 0) {
         FloorDecoration var20 = this.field2010[var2];
         this.method4490(
            var1,
            var20.field1816,
            0,
            var20.field1806 * 1333275141,
            var20.field1807 * -276908185,
            var20.field1808 * 498815127,
            var20.field1815 * 5132338419383099835L
         );
      }

      if ((this.field2005[var2] & 12288) != 0) {
         ItemLayer var21 = this.field2011[var2];
         if (var21.field1847 != null) {
            this.method4490(
               var1,
               var21.field1847,
               0,
               var21.field1840 * -892202585,
               var21.field1841 * 1186822141 - var21.field1838 * 218008627,
               var21.field1839 * -1209739927,
               var21.field1844
            );
         }

         if (var21.field1845 != null) {
            this.method4490(
               var1,
               var21.field1845,
               0,
               var21.field1840 * -892202585,
               var21.field1841 * 1186822141 - var21.field1838 * 218008627,
               var21.field1839 * -1209739927,
               var21.field1844
            );
         }

         if (var21.field1846 != null) {
            this.method4490(
               var1,
               var21.field1846,
               0,
               var21.field1840 * -892202585,
               var21.field1841 * 1186822141 - var21.field1838 * 218008627,
               var21.field1839 * -1209739927,
               var21.field1844
            );
         }
      }

      for (int var22 = 0; var22 < this.field2012[var2]; var22++) {
         GameObject var12 = this.field2013[var2 * 5 + var22];
         var12.field2197 = this.field2065 * 132222543;
         if (var9 == var12.field2188 * 1138017605 && var10 == var12.field2194 * -555977777) {
            try {
               this.method4490(
                  var1,
                  var12.field2200,
                  var12.field2189 * 470594389,
                  var12.field2195 * -1405731525,
                  var12.field2190 * 1269801851,
                  var12.field2196 * -1706390585,
                  var12.field2185 * 1745853678706228013L
               );
            } catch (Exception var16) {
               client.field1026.debug("exception drawing game entity", var16);
            }
         }
      }

      if ((var3 & 128) != 0) {
         rl17 var23 = this.field2020[var17 >> 3][var5 >> 3];

         for (int var24 = 0; var24 < var23.field5706.size(); var24++) {
            GameObject var13 = (GameObject)var23.field5706.get(var24);
            if (var13.field2200 instanceof ActorSpotAnim && var13.field2188 * 1138017605 == var9 && var13.field2194 * -555977777 == var10) {
               var13.field2197 = this.field2065 * 132222543;

               try {
                  this.method4490(
                     var1,
                     var13.field2200,
                     var13.field2189 * 470594389,
                     var13.field2195 * -1405731525,
                     var13.field2190 * 1269801851,
                     var13.field2196 * -1706390585,
                     var13.field2185 * 1745853678706228013L
                  );
               } catch (Exception var15) {
                  client.field1026.debug("exception drawing game entity", var15);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("fv")
   public int method4167(int var1, int var2, int var3) {
      int var4 = 0;
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.field1963 * -389646721; var6++) {
            if ((var5.field1951[var6].field2184 * 1896767852 & 256) == -368396687 && var5.field1951[var6].field2200 instanceof Model) {
               Model var7 = (Model)var5.field1951[var6].field2200;
               var7.method5230();
               if (var7.field1743 * -762394348 > var4) {
                  var4 = var7.field1743 * -976093565;
               }
            }
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mu")
   public void method4397(int var1) {
      boolean var2 = this.field2023.add(var1);
      if (var2 && (client.field1096 & 16) != 0 && this.field1989 != null) {
         int[] var3 = (int[])this.field1989.get(var1);
         if (var3 != null) {
            for (int var7 : var3) {
               this.method4397(var7);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("gs")
   public int method4460(int var1) {
      return this.field2005[var1] >> 24 & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fy")
   public void method4158(int var1, int var2, int var3, int var4) {
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         this.field2058[var1][var2][var3].field1964 = var4 * -2135733247;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lfv;Lrl17;Ljava/util/Set;)V")
   @ObfuscatedName("ot")
   public void method4392(Projection var1, Projection var2, rl17 var3, Set var4) {
      for (int var5 = 0; var5 < var3.field5705.size(); var5++) {
         TileObject var6 = (TileObject)var3.field5705.get(var5);
         if (var6 instanceof GameObject) {
            GameObject var7 = (GameObject)var6;

            assert var7.field2200 instanceof DynamicObject;

            DynamicObject var8 = (DynamicObject)var7.field2200;
            if (!var8.field1668
               && this.method4443(
                  var7.field2188 * 1138017605,
                  var7.field2194 * -555977777,
                  var7.field2186 * 304142753,
                  var7.field2192 * -544424899,
                  var7.field2187 * 568825275,
                  var4
               )) {
               this.method4416(
                  var1,
                  var8,
                  var7,
                  var7.field2189 * 470594389,
                  var7.field2195 * -1405731525,
                  var7.field2190 * 1269801851,
                  var7.field2196 * -1706390585,
                  var7.field2185 * 1745853678706228013L
               );
            }
         } else if (var6 instanceof FloorDecoration) {
            FloorDecoration var12 = (FloorDecoration)var6;

            assert var12.field1816 instanceof DynamicObject;

            DynamicObject var16 = (DynamicObject)var12.field1816;
            if (!var16.field1668) {
               int var9 = var12.field1806 * 1333275141 >> 7;
               int var10 = var12.field1808 * 498815127 >> 7;
               if (this.method4443(var9, var10, var9, var10, var12.field1814, var4)) {
                  this.method4416(
                     var1,
                     var16,
                     var12,
                     0,
                     var12.field1806 * 1333275141,
                     var12.field1807 * -276908185,
                     var12.field1808 * 498815127,
                     var12.field1815 * 5132338419383099835L
                  );
               }
            }
         } else if (var6 instanceof BoundaryObject) {
            BoundaryObject var13 = (BoundaryObject)var6;
            int var17 = var13.field2244 * -777838807 >> 7;
            int var20 = var13.field2245 * 31139801 >> 7;
            if (this.method4443(var17, var20, var17, var20, var13.field2247, var4)) {
               if (var13.field2249 instanceof DynamicObject) {
                  DynamicObject var23 = (DynamicObject)var13.field2249;
                  if (!var23.field1668) {
                     this.method4416(
                        var1,
                        var23,
                        var13,
                        0,
                        var13.field2244 * -777838807,
                        var13.field2242 * 1315862339,
                        var13.field2245 * 31139801,
                        var13.field2240 * 7159317397185328723L
                     );
                  }
               }

               if (var13.field2248 instanceof DynamicObject) {
                  DynamicObject var24 = (DynamicObject)var13.field2248;
                  if (!var24.field1668) {
                     this.method4416(
                        var1,
                        var24,
                        var13,
                        0,
                        var13.field2244 * -777838807,
                        var13.field2242 * 1315862339,
                        var13.field2245 * 31139801,
                        var13.field2240 * 7159317397185328723L
                     );
                  }
               }
            }
         } else if (var6 instanceof WallDecoration) {
            WallDecoration var14 = (WallDecoration)var6;
            int var18 = var14.field2270 * 1766830743 >> 7;
            int var21 = var14.field2275 * -361702377 >> 7;
            if (this.method4443(var18, var21, var18, var21, var14.field2277, var4)) {
               if (var14.field2279 instanceof DynamicObject) {
                  DynamicObject var25 = (DynamicObject)var14.field2279;
                  if (!var25.field1668) {
                     this.method4416(
                        var1,
                        var25,
                        var14,
                        0,
                        var14.field2270 * 1766830743 + var14.field2267 * -404927711,
                        var14.field2268 * 1698079433,
                        var14.field2275 * -361702377 + var14.field2273 * 856605829,
                        var14.field2266 * -3608662145112923099L
                     );
                  }
               }

               if (var14.field2278 instanceof DynamicObject) {
                  DynamicObject var26 = (DynamicObject)var14.field2278;
                  if (!var26.field1668) {
                     this.method4416(
                        var1,
                        var26,
                        var14,
                        0,
                        var14.field2270 * 1766830743 + var14.field2272 * -1085897215,
                        var14.field2268 * 1698079433,
                        var14.field2275 * -361702377 + var14.field2271 * 513256357,
                        var14.field2266 * -3608662145112923099L
                     );
                  }
               }
            }
         } else if (var6 instanceof ItemLayer) {
            ItemLayer var15 = (ItemLayer)var6;
            int var19 = var15.field1840 * -892202585 >> 7;
            int var22 = var15.field1839 * -1209739927 >> 7;
            if (this.method4443(var19, var22, var19, var22, var15.field1843, var4)) {
               if (var15.field1847 != null) {
                  TileItem var27 = (TileItem)var15.field1847;
                  Model var11 = var27.method3842();
                  if (var11 == null) {
                     continue;
                  }

                  var27.setModelHeight(var11.getModelHeight());
                  client.field1118
                     .drawDynamic(
                        -1,
                        var1,
                        this,
                        var15,
                        var27,
                        var11,
                        0,
                        var15.field1840 * -892202585,
                        var15.field1841 * 1186822141 - var15.field1838 * 218008627,
                        var15.field1839 * -1209739927
                     );
                  client.method2395(
                     var1,
                     var2,
                     var11,
                     0,
                     var15.field1840 * -892202585,
                     var15.field1841 * 1186822141 - var15.field1838 * 218008627,
                     var15.field1839 * -1209739927,
                     var15.field1844
                  );
               }

               if (var15.field1845 != null) {
                  TileItem var28 = (TileItem)var15.field1845;
                  Model var30 = var28.method3842();
                  if (var30 == null) {
                     continue;
                  }

                  var28.setModelHeight(var30.getModelHeight());
                  client.field1118
                     .drawDynamic(
                        -1,
                        var1,
                        this,
                        var15,
                        var28,
                        var30,
                        0,
                        var15.field1840 * -892202585,
                        var15.field1841 * 1186822141 - var15.field1838 * 218008627,
                        var15.field1839 * -1209739927
                     );
                  client.method2395(
                     var1,
                     var2,
                     var30,
                     0,
                     var15.field1840 * -892202585,
                     var15.field1841 * 1186822141 - var15.field1838 * 218008627,
                     var15.field1839 * -1209739927,
                     var15.field1844
                  );
               }

               if (var15.field1846 != null) {
                  TileItem var29 = (TileItem)var15.field1846;
                  Model var31 = var29.method3842();
                  if (var31 != null) {
                     var29.setModelHeight(var31.getModelHeight());
                     client.field1118
                        .drawDynamic(
                           -1,
                           var1,
                           this,
                           var15,
                           var29,
                           var31,
                           0,
                           var15.field1840 * -892202585,
                           var15.field1841 * 1186822141 - var15.field1838 * 218008627,
                           var15.field1839 * -1209739927
                        );
                     client.method2395(
                        var1,
                        var2,
                        var31,
                        0,
                        var15.field1840 * -892202585,
                        var15.field1841 * 1186822141 - var15.field1838 * 218008627,
                        var15.field1839 * -1209739927,
                        var15.field1844
                     );
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("fg")
   public void method4161(
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
            if (this.field2058[var26][var2][var3] == null) {
               this.field2058[var26][var2][var3] = new classEW(var26, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1972 = var24;
      } else if (var4 != 1) {
         if (var20 == 0) {
            var20 = 1;
         }

         SceneTileModel var23 = new SceneTileModel(
            var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20
         );

         for (int var25 = var1; var25 >= 0; var25--) {
            if (this.field2058[var25][var2][var3] == null) {
               this.field2058[var25][var2][var3] = new classEW(var25, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1973 = var23;
      } else {
         SceneTilePaint var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for (int var22 = var1; var22 >= 0; var22--) {
            if (this.field2058[var22][var2][var3] == null) {
               this.field2058[var22][var2][var3] = new classEW(var22, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1972 = var21;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIILee;JI)V")
   @ObfuscatedName("cm")
   public static void method4163(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var0 == null) {
         var0.method4394(var1, var1, var1);
      }

      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.field1816 = var5;
         var9.field1806 = var2 * -1794546048 + 1250210624;
         var9.field1808 = var3 * -2036886656 + -1018443328;
         var9.field1807 = var4 * 476279895;
         var9.field1815 = var6 * -8879266543907161229L;
         var9.method3938(var8, (byte)2);
         if (var0.field2058[var1][var2][var3] == null) {
            var0.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
         }

         var0.field2058[var1][var2][var3].field1967 = var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hd")
   public void method4209(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.field1963 * -389646721; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = var6.field2185 * 1745853678706228013L;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2188 * 1138017605 == var2 && var6.field2194 * -555977777 == var3) {
               this.method4359(var6);
               return;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ju")
   static boolean method4268(int var0, int var1, int var2, int var3) {
      return method4262(field2152, var0, var1, var2, var3);
   }

   public int[][][] getInstanceTemplateChunks() {
      return this.field2074;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("fq")
   public int method4168(int var1, int var2, int var3) {
      int var4 = 0;
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.field1963 * -389646721; var6++) {
            if ((var5.field1951[var6].field2184 * -288062455 & 256) == 256 && var5.field1951[var6].field2200 instanceof Model) {
               Model var7 = (Model)var5.field1951[var6].field2200;
               var7.method5230();
               if (var7.field1743 * -1256242689 > var4) {
                  var4 = var7.field1743 * -1256242689;
               }
            }
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("fp")
   public int method4169(int var1, int var2, int var3) {
      int var4 = 0;
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.field1963 * 1673275625; var6++) {
            if ((var5.field1951[var6].field2184 * -1239389472 & 256) == -963892359 && var5.field1951[var6].field2200 instanceof Model) {
               Model var7 = (Model)var5.field1951[var6].field2200;
               var7.method5230();
               if (var7.field1743 * -1256242689 > var4) {
                  var4 = var7.field1743 * -764770787;
               }
            }
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("fs")
   public int method4170(int var1, int var2, int var3) {
      int var4 = 0;
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.field1963 * -389646721; var6++) {
            if ((var5.field1951[var6].field2184 * -288062455 & 256) == 256 && var5.field1951[var6].field2200 instanceof Model) {
               Model var7 = (Model)var5.field1951[var6].field2200;
               var7.method5230();
               if (var7.field1743 * -1256242689 > var4) {
                  var4 = var7.field1743 * -1256242689;
               }
            }
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("il")
   int method4244(int var1, int var2, int var3) {
      return (
            this.field2060[var1][var2][var3]
               + this.field2060[var1][var2 + 1][var3]
               + this.field2060[var1][var2][var3 + 1]
               + this.field2060[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Lfv;Lew;)V")
   @ObfuscatedName("tm")
   public static void method4360(Scene var0, Projection var1, classEW var2) {
      if (var0 == null) {
         var0.method4364(var1, var2);
      } else if (var2 != null) {
         int var3 = var2.field1952 * -54806681;
         int var4 = var2.field1957 * -2067052011;
         int var5 = var2.field1949 * 860707211;
         int var6 = var2.field1950 * 800564741;
         if (var2.field1949 * -1631770904 == 0 && var2.field1969 != null) {
            var0.method4444(var1, var2.field1969);
         }

         if (var2.field1972 != null) {
            if (!var0.method4374(var6, var3, var4) && (var2.field1972.field2286 * -665850825 != -1426952059 || var5 <= var0.field2044)) {
               var1.vmethod426(var0, var2.field1972, var6, var3, var4, -1478884889);
            }
         } else if (var2.field1973 != null && !var0.method4374(var6, var3, var4)) {
            var1.vmethod431(var0, var2.field1973, var3, var4, -1622535918);
         }

         BoundaryObject var7 = var2.field1970;
         if (var7 != null) {
            if (var7.field2249 != null && !var0.method4375(var6, var3, var4, var7.field2246 * -934006316)) {
               var1.vmethod435(
                  var7.field2249, 0, var7.field2244 * -777838807, var7.field2242 * 1288676392, var7.field2245 * 31139801, var7.field2240 * 7159317397185328723L
               );
            }

            if (var7.field2248 != null && !var0.method4375(var6, var3, var4, var7.field2243 * -1413337351)) {
               var1.vmethod435(
                  var7.field2248,
                  0,
                  var7.field2244 * -777838807,
                  var7.field2242 * -1515157587,
                  var7.field2245 * -1252193898,
                  var7.field2240 * 7159317397185328723L
               );
            }
         }

         WallDecoration var8 = var2.field1971;
         if (var8 != null && !method4378(var0, var6, var3, var4, var8.field2279.field1743 * -1952736422)) {
            if (var8.field2276 * 846961611 == -1481471005) {
               var1.vmethod435(
                  var8.field2279,
                  0,
                  var8.field2270 * 1766830743 + var8.field2267 * -404927711,
                  var8.field2268 * 1698079433,
                  var8.field2275 * -361702377 + var8.field2273 * 40184986,
                  var8.field2266 * -3608662145112923099L
               );
               if (var8.field2278 != null) {
                  var1.vmethod435(
                     var8.field2278,
                     0,
                     var8.field2270 * 1766830743 + var8.field2272 * 1455253427,
                     var8.field2268 * -1366991944,
                     var8.field2275 * 1346123655 + var8.field2271 * 828654353,
                     var8.field2266 * -3608662145112923099L
                  );
               }
            } else {
               var1.vmethod435(
                  var8.field2279,
                  0,
                  var8.field2270 * -882763528 + var8.field2267 * -404927711,
                  var8.field2268 * 1698079433,
                  var8.field2275 * 1588533613 + var8.field2273 * 856605829,
                  var8.field2266 * -3608662145112923099L
               );
            }
         }

         FloorDecoration var9 = var2.field1967;
         if (var9 != null) {
            var1.vmethod435(
               var9.field1816, 0, var9.field1806 * -1726810846, var9.field1807 * -276908185, var9.field1808 * 498815127, var9.field1815 * 5132338419383099835L
            );
         }

         ItemLayer var10 = var2.field1968;
         if (var10 != null) {
            if (var10.field1847 != null) {
               var1.vmethod435(
                  var10.field1847,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * 270985406,
                  var10.field1844
               );
            }

            if (var10.field1845 != null) {
               var1.vmethod435(
                  var10.field1845,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }

            if (var10.field1846 != null) {
               var1.vmethod435(
                  var10.field1846,
                  0,
                  var10.field1840 * -405788651,
                  var10.field1841 * 1186822141 - var10.field1838 * 1952365616,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }
         }

         for (int var11 = 0; var11 < var2.field1963 * 1995264333; var11++) {
            GameObject var12 = var2.field1951[var11];
            var12.field2197 = var0.field2065 * 2048564324;
            if (var12.field2188 * -509062758 == var2.field1952 * 821923362
               && var12.field2194 * 573032171 == var2.field1957 * 1436652264
               && !var0.method4381(
                  var6,
                  var12.field2188 * 1138017605,
                  var12.field2186 * -767005432,
                  var12.field2194 * 366117412,
                  var12.field2192 * -544424899,
                  var12.field2200.field1743 * -1256242689
               )) {
               try {
                  var1.vmethod435(
                     var12.field2200,
                     var12.field2189 * 470594389,
                     var12.field2195 * -1405731525,
                     var12.field2190 * 1269801851,
                     var12.field2196 * 1739635682,
                     var12.field2185 * 1745853678706228013L
                  );
               } catch (Exception var15) {
               }
            }
         }

         if (var2.method4092((short)5606)) {
            for (int var16 = 0; var16 < var2.field1955.size(); var16++) {
               GameObject var17 = (GameObject)var2.field1955.get(var16);
               var17.field2197 = var0.field2065 * 1946200923;
               if (!var0.method4381(
                  var6,
                  var2.field1952 * 1817344549,
                  var2.field1952 * -817853095,
                  var2.field1957 * -2067052011,
                  var2.field1957 * 550001787,
                  var17.field2200.field1743 * -1256242689
               )) {
                  try {
                     var1.vmethod435(
                        var17.field2200,
                        var17.field2189 * 470594389,
                        var17.field2195 * -1556881435,
                        var17.field2190 * -985902500,
                        var17.field2196 * -1706390585,
                        var17.field2185 * 1745853678706228013L
                     );
                  } catch (Exception var14) {
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("db")
   void method4338() {
      if (this.field2043) {
         this.field2043 = false;
         this.field2036 = this.field2026;
         this.field2037 = this.field2034;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lfe;")
   @ObfuscatedName("hf")
   public BoundaryObject method4501(int var1, int var2, int var3) {
      return this.method4467(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("gs")
   public void method4200(int var1, int var2, int var3, int var4) {
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         WallDecoration var6 = var5.field1971;
         if (var6 != null) {
            if (var6.field2267 * -404927711 != 0) {
               var6.field2267 = (var6.field2267 * -404927711 < 0 ? -var4 : var4) * 261748961;
            }

            if (var6.field2273 * 856605829 != 0) {
               var6.field2273 = (var6.field2273 * 856605829 < 0 ? -var4 : var4) * 46830669;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("vk")
   public boolean method4389(int var1) {
      return (this.field2005[var1] & 1) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)V")
   @ObfuscatedName("bl")
   public static void method4232(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4214(var1, var1, var1);
      } else {
         for (int var4 = 0; var4 < var0.field2059; var4++) {
            for (int var5 = 0; var5 < var0.field2056; var5++) {
               for (int var6 = 0; var6 < var0.field2032; var6++) {
                  classEW var7 = var0.field2058[var4][var5][var6];
                  if (var7 != null) {
                     BoundaryObject var8 = var7.field1970;
                     if (var8 != null && var8.field2249 instanceof ModelData) {
                        ModelData var9 = (ModelData)var8.field2249;
                        var0.method4441(var9, var4, var5, var6, 1, 1);
                        if (var8.field2248 instanceof ModelData) {
                           ModelData var10 = (ModelData)var8.field2248;
                           var0.method4441(var10, var4, var5, var6, 1, 1);
                           ModelData.method3961(var9, var10, 0, 0, 0, false);
                           var8.field2248 = var10.method4045(var10.field1878, var10.field1879, var1, var2, var3);
                        }

                        var8.field2249 = var9.method4045(var9.field1878, var9.field1879, var1, var2, var3);
                     }

                     for (int var12 = 0; var12 < var7.field1963 * -389646721; var12++) {
                        GameObject var14 = var7.field1951[var12];
                        if (var14 != null && var14.field2200 instanceof ModelData) {
                           ModelData var11 = (ModelData)var14.field2200;
                           var0.method4441(
                              var11,
                              var4,
                              var5,
                              var6,
                              var14.field2186 * -536942667 - var14.field2188 * 1138017605 + 1,
                              var14.field2192 * 738944045 - var14.field2194 * -744271729 + 1
                           );
                           var14.field2200 = var11.method4045(var11.field1878, var11.field1879, var1, var2, var3);
                        }
                     }

                     FloorDecoration var13 = var7.field1967;
                     if (var13 != null && var13.field1816 instanceof ModelData) {
                        ModelData var15 = (ModelData)var13.field1816;
                        var0.method4461(var15, var4, var5, var6);
                        var13.field1816 = var15.method4045(var15.field1878, var15.field1879, var1, var2, var3);
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("cr")
   public long method4455(int var1, int var2, int var3) {
      var2 += this.field2147;
      var3 += this.field2147;
      int var4 = this.method4489(var1, var2, var3);
      return this.method4389(var4) && this.field2008[var4] != null ? this.field2008[var4].field2240 * 7159317397185328723L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(Lfb;)V")
   @ObfuscatedName("gw")
   void method4195(GameObject var1) {
      for (int var2 = var1.field2188 * 1138017605; var2 <= var1.field2186 * 304142753; var2++) {
         for (int var3 = var1.field2194 * -555977777; var3 <= var1.field2192 * -544424899; var3++) {
            classEW var4 = this.field2058[var1.field2187 * 568825275][var2][var3];
            if (var4 != null) {
               for (int var5 = 0; var5 < var4.field1963 * -389646721; var5++) {
                  if (var4.field1951[var5] == var1) {
                     var4.field1963 -= -71349889;

                     for (int var6 = var5; var6 < var4.field1963 * -389646721; var6++) {
                        var4.field1951[var6] = var4.field1951[var6 + 1];
                        var4.field1953[var6] = var4.field1953[var6 + 1];
                     }

                     var4.field1951[var4.field1963 * -389646721] = null;
                     break;
                  }
               }

               this.method4197(var4);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIILee;JLee;Lee;I)V")
   @ObfuscatedName("vm")
   public static void method4172(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9, int var10) {
      if (var0 == null) {
         var0.method4423(var1);
      }

      ItemLayer var11 = new ItemLayer();
      var11.field1846 = var5;
      var11.field1840 = var2 * -1779547208 + 1499563456;
      var11.field1839 = var3 * 1079728895 + 327127294;
      var11.field1841 = var4 * 1193418273;
      var11.field1844 = var6;
      var11.field1847 = var8;
      var11.field1845 = var9;
      var11.field1838 = var10 * 1484214011;
      if (var0.field2058[var1][var2][var3] == null) {
         var0.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
      }

      var0.field2058[var1][var2][var3].field1968 = var11;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;)V")
   @ObfuscatedName("pn")
   public void method4393(Projection var1) {
      assert !classOE.field4843.isGpu();

      boolean var2 = this.field1988 != 0 && this.field2062;
      this.field2041 = 0;

      for (int var3 = this.field2040; var3 < this.field2059; var3++) {
         for (int var4 = this.field2120; var4 < this.field2123; var4++) {
            for (int var5 = this.field2113; var5 < this.field2122; var5++) {
               int var6 = this.method4489(var3, var4, var5);
               if (this.method4389(var6)) {
                  int var7 = this.method4396(var6);
                  int var8 = this.field1994[this.field2150.field1710 * -483624883][var4][var5];
                  if ((var7 <= this.field2027 || var2)
                     && (
                        !this.field2062
                           || this.method4511(var4 - this.field2114 + this.field2053 + this.field2051, var5 - this.field2124 + this.field2054 + this.field2051)
                           || this.field2060[var3][var4][var5] - this.field2119 >= 2000
                     )
                     && (!var2 || this.field2150.field1710 * -483624883 >= var7 || var8 == 0 || !this.field2023.contains(var8))) {
                     this.method4422(var1, var6);
                  }
               }
            }
         }
      }

      this.method4516();
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;Lee;IIJI)V")
   @ObfuscatedName("br")
   public void method4174(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         BoundaryObject var12 = new BoundaryObject();
         var12.field2240 = var9 * -2636099314526831141L;
         var12.field2241 = var11 * -1331376248;
         var12.field2244 = var2 * 67219237 + 1685800512;
         var12.field2245 = var3 * -2139868032 + 1802625245;
         var12.field2242 = var4 * -1784019733;
         var12.field2249 = var5;
         var12.field2248 = var6;
         var12.field2246 = var7 * -1380680693;
         var12.field2243 = var8 * 1409055500;

         for (int var13 = var1; var13 >= 0; var13--) {
            if (this.field2058[var13][var2][var3] == null) {
               this.field2058[var13][var2][var3] = new classEW(var13, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1970 = var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIII)V")
   @ObfuscatedName("mg")
   public static void method4201(Scene var0, int var1, int var2, int var3, int var4) {
      classEW var5 = var0.field2058[var1][var2][var3];
      if (var5 != null) {
         WallDecoration var6 = var5.field1971;
         if (var6 != null) {
            if (var6.field2267 * -1298305053 != 0) {
               var6.field2267 = (var6.field2267 * 689000322 < 0 ? -var4 : var4) * 261748961;
            }

            if (var6.field2273 * 856605829 != 0) {
               var6.field2273 = (var6.field2273 * 798788125 < 0 ? -var4 : var4) * 46830669;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;Lee;IIIIIIJI)V")
   @ObfuscatedName("fe")
   public void method4176(
      int var1,
      int var2,
      int var3,
      int var4,
      Renderable var5,
      Renderable var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      long var13,
      int var15
   ) {
      if (var5 != null) {
         WallDecoration var16 = new WallDecoration();
         var16.field2266 = var13 * 2170180156281739181L;
         var16.field2265 = var15 * -1380406631;
         var16.field2270 = var2 * 896963456 + 1208710401;
         var16.field2275 = var3 * 856544128 + -1766125854;
         var16.field2268 = var4 * 765794169;
         var16.field2279 = var5;
         var16.field2278 = var6;
         var16.field2276 = var7 * 1259333051;
         var16.field2269 = var8 * 1071651815;
         var16.field2267 = var9 * 261748961;
         var16.field2273 = var10 * -148592333;
         var16.field2272 = var11 * -153257471;
         var16.field2271 = var12 * -829209555;

         for (int var17 = var1; var17 >= 0; var17--) {
            if (this.field2058[var17][var2][var3] == null) {
               this.field2058[var17][var2][var3] = new classEW(var17, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1971 = var16;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;Lee;IIIIIIJI)V")
   @ObfuscatedName("fc")
   public void method4177(
      int var1,
      int var2,
      int var3,
      int var4,
      Renderable var5,
      Renderable var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      long var13,
      int var15
   ) {
      if (var5 != null) {
         WallDecoration var16 = new WallDecoration();
         var16.field2266 = var13 * 2170180156281739181L;
         var16.field2265 = var15 * -47677163;
         var16.field2270 = var2 * 296492093 + -854633774;
         var16.field2275 = var3 * 856544128 + 688297055;
         var16.field2268 = var4 * 765794169;
         var16.field2279 = var5;
         var16.field2278 = var6;
         var16.field2276 = var7 * 1259333051;
         var16.field2269 = var8 * -351751517;
         var16.field2267 = var9 * 261748961;
         var16.field2273 = var10 * 46830669;
         var16.field2272 = var11 * 16568119;
         var16.field2271 = var12 * -2036977261;

         for (int var17 = var1; var17 >= 0; var17--) {
            if (this.field2058[var17][var2][var3] == null) {
               this.field2058[var17][var2][var3] = new classEW(var17, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1971 = var16;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)I")
   @ObfuscatedName("sg")
   public static int method4245(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4250(var1, var1, var1);
      }

      return (
            var0.field2060[var1][var2][var3]
               + var0.field2060[var1][var2 + 1][var3]
               + var0.field2060[var1][var2][var3 + 1]
               + var0.field2060[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "(IIIIILee;IJZ)Z")
   @ObfuscatedName("fa")
   public boolean method4181(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
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
         return this.method4430(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILee;IJZ)Z")
   @ObfuscatedName("bj")
   public boolean method4182(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
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
         return this.method4430(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILee;IJIIII)Z")
   @ObfuscatedName("gb")
   public boolean method4184(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method4430(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedSignature(descriptor = "(Z)I")
   @ObfuscatedName("ac")
   public static int method4138(boolean var0) {
      return var0 ? 4160 : 3064;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILee;IZJI)Z")
   @ObfuscatedName("gv")
   boolean method4186(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14
   ) {
      for (int var15 = var2; var15 < var2 + var4; var15++) {
         for (int var16 = var3; var16 < var3 + var5; var16++) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field2056 || var16 >= this.field2032) {
               return false;
            }

            classEW var17 = this.field2058[var1][var15][var16];
            if (var17 != null && var17.field1963 * -8834507 >= 5) {
               return false;
            }
         }
      }

      GameObject var21 = new GameObject();
      var21.field2185 = var12 * -4819202259227702107L;
      var21.field2184 = var14 * -575080916;
      var21.field2187 = var1 * -1965758605;
      var21.field2195 = var6 * -563286342;
      var21.field2196 = var7 * -333886098;
      var21.field2190 = var8 * -1294023757;
      var21.field2200 = var9;
      var21.field2189 = var10 * -128126345;
      var21.field2188 = var2 * -1266763122;
      var21.field2194 = var3 * -1058819281;
      var21.field2186 = (var2 + var4 - 1) * 1384467041;
      var21.field2192 = (var3 + var5 - 1) * 1191492373;

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
               if (this.field2058[var19][var22][var23] == null) {
                  this.field2058[var19][var22][var23] = new classEW(var19, var22, var23);
               }
            }

            classEW var24 = this.field2058[var1][var22][var23];
            if (var11) {
               this.method4189(var24);
            }

            var24.field1951[var24.field1963 * -901221775] = var21;
            var24.field1953[var24.field1963 * -933601066] = var18;
            var24.field1954 = (var24.field1954 * -785027619 | var18) * -1095478667;
            var24.field1963 += -71349889;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;Lee;IIIIIIJI)V")
   @ObfuscatedName("bm")
   public void method4481(
      int var1,
      int var2,
      int var3,
      int var4,
      Renderable var5,
      Renderable var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      long var13,
      int var15
   ) {
      int var16 = var2 + this.field2147;
      int var17 = var3 + this.field2147;
      if (var5 != null) {
         int var18 = this.method4489(var1, var16, var17);
         WallDecoration var19 = new WallDecoration();
         var19.method4782(var13);
         var19.method4785(var15);
         var19.method4788(var2 * 128 + 64);
         var19.method4783(var3 * 128 + 64);
         var19.method4787(var4);
         var19.method4792(var5);
         var19.method4791(var6);
         var19.method4781(var7);
         var19.method4790(var8);
         var19.field2267 = var9 * 261748961;
         var19.field2273 = var10 * 46830669;
         var19.field2272 = var11 * -153257471;
         var19.field2271 = var12 * -829209555;

         for (int var20 = var1; var20 >= 0; var20--) {
            int var21 = this.method4489(var20, var16, var17);
            if (!this.method4389(var21)) {
               this.method4437(var21, var20, var16, var17);
            }

            if (this.field1993[var20][var16][var17] == null) {
               this.field1993[var20][var16][var17] = new rl10(this, var21);
               this.method4424(var20, var16, var17);
            }
         }

         assert this.field2009[var18] == null;

         this.field2009[var18] = var19;
         this.field2005[var18] = this.field2005[var18] | 32768;
         var19.field2277 = var1;
         if (var5 instanceof DynamicObject || var6 instanceof DynamicObject) {
            rl17 var22 = this.field2020[var16 >> 3][var17 >> 3];
            var22.field5705.add(var19);
            this.method4428((DynamicObject)var5);
            this.method4428((DynamicObject)var6);
         }

         this.method4447(var5, 0, var19.getX(), var19.getZ(), var19.getY(), var2, var3);
         this.method4447(var6, 0, var19.getX(), var19.getZ(), var19.getY(), var2, var3);
         if (this.field2156) {
            DecorativeObjectSpawned var23 = new DecorativeObjectSpawned();
            var23.setTile(this.field1993[var1][var16][var17]);
            var23.setDecorativeObject(var19);
            classOE.field4843.getCallbacks().post(var23);
         }

         if (this.field2156 && client.field1118 != null) {
            client.field1118.invalidateZone(this, var16 >> 3, var17 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gc")
   public void method4194() {
      for (int var1 = 0; var1 < this.field2050; var1++) {
         classEW var2 = this.field2057[var1];

         for (int var3 = var2.field1958 * 1189212925; var3 < var2.field1963 * -389646721; var3++) {
            var2.field1951[var3] = null;
         }

         var2.field1963 = var2.field1958 * -232476541;
         var2.field1956 = 1699605829;
         if (var2.field1955 != null) {
            var2.field1955.clear();
         }

         this.method4197(var2);
      }

      this.field2050 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjava/util/Set;)Z")
   @ObfuscatedName("se")
   public boolean method4443(int var1, int var2, int var3, int var4, int var5, Set var6) {
      boolean var7 = false;
      int var8 = var5 + ((this.field2159[1][var1 + this.field2147][var2 + this.field2147] & 2) >> 1) & 3;

      for (int var9 = var1; var9 <= var3; var9++) {
         for (int var10 = var2; var10 <= var4; var10++) {
            var7 |= (this.field2159[var8][var9 + this.field2147][var10 + this.field2147] & 8) != 0;
         }
      }

      var5 = var7 ? 0 : var5;
      boolean var14 = this.field1988 != 0 && this.field2062;
      if (var5 >= this.field2040 && (var14 || var5 <= this.field2027)) {
         if (var5 > this.field2150.field1710 * -483624883 && !var6.isEmpty()) {
            for (int var15 = var1; var15 <= var3; var15++) {
               for (int var11 = var2; var11 <= var4; var11++) {
                  int var12 = this.field1994[var5][var15 + this.field2147][var11 + this.field2147];
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

   @ObfuscatedSignature(descriptor = "(ILfx;)V")
   @ObfuscatedName("af")
   public void method4126(int var1, Model var2) {
      this.field2064 = var1;
      this.field2151 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lfb;)V")
   @ObfuscatedName("gg")
   void method4196(GameObject var1) {
      for (int var2 = var1.field2188 * 1138017605; var2 <= var1.field2186 * 304142753; var2++) {
         for (int var3 = var1.field2194 * -555977777; var3 <= var1.field2192 * -544424899; var3++) {
            classEW var4 = this.field2058[var1.field2187 * 568825275][var2][var3];
            if (var4 != null) {
               for (int var5 = 0; var5 < var4.field1963 * -389646721; var5++) {
                  if (var4.field1951[var5] == var1) {
                     var4.field1963 -= -71349889;

                     for (int var6 = var5; var6 < var4.field1963 * -389646721; var6++) {
                        var4.field1951[var6] = var4.field1951[var6 + 1];
                        var4.field1953[var6] = var4.field1953[var6 + 1];
                     }

                     var4.field1951[var4.field1963 * -389646721] = null;
                     break;
                  }
               }

               this.method4197(var4);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lew;)V")
   @ObfuscatedName("gn")
   void method4199(classEW var1) {
      var1.field1954 = 0;

      for (int var2 = 0; var2 < var1.field1963 * -389646721; var2++) {
         var1.field1954 = (var1.field1954 * -785027619 | var1.field1953[var2]) * -1095478667;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("gy")
   public void method4202(int var1, int var2, int var3, int var4) {
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         WallDecoration var6 = var5.field1971;
         if (var6 != null) {
            if (var6.field2267 * 208407183 != 0) {
               var6.field2267 = (var6.field2267 * -404927711 < 0 ? -var4 : var4) * -531053014;
            }

            if (var6.field2273 * 856605829 != 0) {
               var6.field2273 = (var6.field2273 * 1368219853 < 0 ? -var4 : var4) * 46830669;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("jp")
   static boolean method4291(int var0, int var1, int var2, int var3, boolean var4) {
      return method4288(field2153, var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("gj")
   public void method4203(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         var4.field1970 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("gx")
   public void method4204(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         var4.field1970 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Leo;")
   @ObfuscatedName("ho")
   public FloorDecoration method4502(int var1, int var2, int var3) {
      return method4457(this, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ge")
   public void method4205(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         var4.field1971 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ts")
   public void method4437(int var1, int var2, int var3, int var4) {
      this.method4402(var1);
      this.field2005[var1] = 1;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hz")
   public void method4206(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         var4.field1971 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl17;III)V")
   @ObfuscatedName("ro")
   public void method4487(rl17 var1, int var2, int var3, int var4) {
      var1.field5711 = Math.min(var1.field5711, var4);
      var1.field5709 = Math.max(var1.field5709, var4);
      boolean var5 = (var2 & 7) == 0 && var2 > 0;
      boolean var6 = (var3 & 7) == 0 && var3 > 0;
      if (var5) {
         rl17 var7 = this.field2020[(var2 >> 3) - 1][var3 >> 3];
         var7.field5711 = Math.min(var7.field5711, var4);
         var7.field5709 = Math.max(var7.field5709, var4);
      }

      if (var6) {
         rl17 var8 = this.field2020[var2 >> 3][(var3 >> 3) - 1];
         var8.field5711 = Math.min(var8.field5711, var4);
         var8.field5709 = Math.max(var8.field5709, var4);
      }

      if (var6 && var5) {
         rl17 var9 = this.field2020[(var2 >> 3) - 1][(var3 >> 3) - 1];
         var9.field5711 = Math.min(var9.field5711, var4);
         var9.field5709 = Math.max(var9.field5709, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;III)V")
   @ObfuscatedName("mm")
   public static void method4456(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4208(var1, var1, var1);
      }

      var2 += var0.field2147;
      var3 += var0.field2147;
      int var4 = var0.method4489(var1, var2, var3);
      if (var0.method4389(var4) && (var0.field2005[var4] & 2048) != 0) {
         FloorDecoration var5 = var0.field2010[var4];
         var0.field2010[var4] = null;
         var0.field2005[var4] = var0.field2005[var4] & -2049;
         if (var5.field1816 instanceof DynamicObject) {
            rl17 var6 = var0.field2020[var2 >> 3][var3 >> 3];
            var6.field5705.remove(var5);
         }

         if (var0.field2156) {
            GroundObjectDespawned var9 = new GroundObjectDespawned();
            var9.setTile(var0.field1993[var1][var2][var3]);
            var9.setGroundObject(var5);
            classOE.field4843.getCallbacks().post(var9);
         }

         if (var0.field2156 && client.field1118 != null) {
            client.field1118.invalidateZone(var0, var2 >> 3, var3 >> 3);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIIILee;IJIIII)Z")
   @ObfuscatedName("om")
   public static boolean method4185(
      Scene var0, int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13
   ) {
      if (var0 == null) {
         var0.getTileShapes();
      }

      return var6 == null ? true : var0.method4430(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hi")
   public void method4210(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.field1963 * -389646721; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = var6.field2185 * 1745853678706228013L;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2188 * 1138017605 == var2 && var6.field2194 * -555977777 == var3) {
               this.method4359(var6);
               return;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("df")
   boolean method4386(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2110; var4++) {
         classEP var5 = this.field2048[var4];
         if (var5.field1825 * 289281065 == 1) {
            int var6 = var5.field1830 * -996295335 - var1;
            if (var6 > 0) {
               int var7 = var5.field1819 * -832449137 + (var5.field1820 * 149581763 * var6 >> 8);
               int var8 = var5.field1817 * -371025921 + (var5.field1828 * -1009677011 * var6 >> 8);
               int var9 = var5.field1827 * 318014867 + (var5.field1831 * -1408907851 * var6 >> 8);
               int var10 = var5.field1826 * -971837087 + (var5.field1824 * 309256757 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1825 * 289281065 == 2) {
            int var11 = var1 - var5.field1830 * -996295335;
            if (var11 > 0) {
               int var15 = var5.field1819 * -832449137 + (var5.field1820 * 149581763 * var11 >> 8);
               int var19 = var5.field1817 * -371025921 + (var5.field1828 * -1009677011 * var11 >> 8);
               int var23 = var5.field1827 * 318014867 + (var5.field1831 * -1408907851 * var11 >> 8);
               int var27 = var5.field1826 * -971837087 + (var5.field1824 * 309256757 * var11 >> 8);
               if (var3 >= var15 && var3 <= var19 && var2 >= var23 && var2 <= var27) {
                  return true;
               }
            }
         } else if (var5.field1825 * 289281065 == 3) {
            int var12 = var5.field1819 * -832449137 - var3;
            if (var12 > 0) {
               int var16 = var5.field1830 * -996295335 + (var5.field1833 * 1759679165 * var12 >> 8);
               int var20 = var5.field1832 * 1506923105 + (var5.field1829 * -1152058757 * var12 >> 8);
               int var24 = var5.field1827 * 318014867 + (var5.field1831 * -1408907851 * var12 >> 8);
               int var28 = var5.field1826 * -971837087 + (var5.field1824 * 309256757 * var12 >> 8);
               if (var1 >= var16 && var1 <= var20 && var2 >= var24 && var2 <= var28) {
                  return true;
               }
            }
         } else if (var5.field1825 * 289281065 == 4) {
            int var13 = var3 - var5.field1819 * -832449137;
            if (var13 > 0) {
               int var17 = var5.field1830 * -996295335 + (var5.field1833 * 1759679165 * var13 >> 8);
               int var21 = var5.field1832 * 1506923105 + (var5.field1829 * -1152058757 * var13 >> 8);
               int var25 = var5.field1827 * 318014867 + (var5.field1831 * -1408907851 * var13 >> 8);
               int var29 = var5.field1826 * -971837087 + (var5.field1824 * 309256757 * var13 >> 8);
               if (var1 >= var17 && var1 <= var21 && var2 >= var25 && var2 <= var29) {
                  return true;
               }
            }
         } else if (var5.field1825 * 289281065 == 5) {
            int var14 = var2 - var5.field1827 * 318014867;
            if (var14 > 0) {
               int var18 = var5.field1830 * -996295335 + (var5.field1833 * 1759679165 * var14 >> 8);
               int var22 = var5.field1832 * 1506923105 + (var5.field1829 * -1152058757 * var14 >> 8);
               int var26 = var5.field1819 * -832449137 + (var5.field1820 * 149581763 * var14 >> 8);
               int var30 = var5.field1817 * -371025921 + (var5.field1828 * -1009677011 * var14 >> 8);
               if (var1 >= var18 && var1 <= var22 && var3 >= var26 && var3 <= var30) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hm")
   public void method4211(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.field1963 * -1176003376; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = var6.field2185 * 1745853678706228013L;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2188 * -1928190230 == var2 && var6.field2194 * -555977777 == var3) {
               this.method4359(var6);
               return;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hl")
   public void method4216(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         var4.field1967 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mq")
   @Override
   void vmethod414(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      classUU var15 = classRM.method10129(1778071523);
      classUG var16 = classMQ.method7640(1049769988);
      classUL var17 = var16.field6305;
      int var19 = var1 & 2047;
      float var18 = (float)(var19 / 2048.0F * (Math.PI * 2));
      var17.method11373(var18, 0.0F, 0.0F, -369519070);
      var16.field6307.method11728(var4, var5, var6, 2011546842);
      classUG var20 = classMQ.method7640(-1209686922);
      var20.field6307.method11728(-(this.field2056 * 64) - this.field2029, this.field2030, -(this.field2032 * 64) - this.field2047, 2066399031);
      classUU var21 = classRM.method10129(1778071523);
      var21.method11642(var20, 1997825264);
      classUU.method11613(var15, 1.0F, this.field2055, 1.0F, 1.0F, -1412584499);
      classUU.method11594(var21, var15, 88268549);
      classUU.method11594(var21, this.field2028, -1637257785);
      var15.method11642(var16, 1640394600);
      classUU.method11594(var21, var15, -68256233);
      rl23.method10067(var15, var21, (byte)-78);
      var15.method11609(-516551499);
      this.field2118 = (int)var15.method11622(var7, var8, var9, (byte)88);
      this.field2119 = (int)var15.method11623(var7, var8, var9, -286689790);
      this.field2116 = (int)var15.method11625(var7, var8, var9, -1162982420);
      this.field2114 = this.field2118 / 128;
      this.field2124 = this.field2116 / 128;
      this.field2121 = (int)var15.method11622(var12, 0.0F, var13, (byte)-53) / 128;
      this.field2125 = (int)var15.method11625(var12, 0.0F, var13, 1469205599) / 128;
      classUX var22 = new classUX();
      classUU var23 = classRM.method10129(1778071523);
      var22.method11681(-var2.method11440(-1294028644), 173632492);
      var22.method11686(-var3.method11440(-723957400), 982132619);
      var22.method11693(var7, var8, var9, (byte)5);
      var23.method11605(var22, -1959054899);
      var23.method11609(-1904700161);
      var16.method11306(-857745384);
      var20.method11306(838740671);
      var15.method11555(2076326646);
      classUU.method11594(var21, var23, 994612139);
      FloatProjection var24 = new FloatProjection(var21);
      var24.method3894(var10);
      classTW.method11209((byte)-30);
      this.method4408(var24, var14, classFH.field2257.field2217 != 1);
      classTW.method11209((byte)56);
      var23.method11555(2143193220);
      var21.method11555(1704783583);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("im")
   public static boolean method4503(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return method4144(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @ObfuscatedSignature(descriptor = "(III)Lfe;")
   @ObfuscatedName("ig")
   public BoundaryObject method4217(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      return var4 == null ? null : var4.field1970;
   }

   @ObfuscatedSignature(descriptor = "(III)Lfe;")
   @ObfuscatedName("hg")
   public BoundaryObject method4218(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      return var4 == null ? null : var4.field1970;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)J")
   @ObfuscatedName("bq")
   public static long method4227(Scene var0, int var1, int var2, int var3) {
      classEW var4 = var0.field2058[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for (int var5 = 0; var5 < var4.field1963 * -1577096966; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = var6.field2185 * 1745853678706228013L;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2188 * 1223384850 == var2 && var6.field2194 * -555977777 == var3) {
               return var6.field2185 * 1745853678706228013L;
            }
         }

         return 0L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;)V")
   @ObfuscatedName("uq")
   public static void method4150(Scene var0) {
      if (var0 == null) {
         var0.getInstanceTemplateChunks();
      }

      for (int var1 = 0; var1 < var0.field2059; var1++) {
         for (int var2 = 0; var2 < var0.field2056; var2++) {
            for (int var3 = 0; var3 < var0.field2032; var3++) {
               var0.field2058[var1][var2][var3] = null;
            }
         }
      }

      if (var0.field2063 != null) {
         for (int var4 = 0; var4 < var0.field2038; var4++) {
            for (int var7 = 0; var7 < var0.field2063[var4]; var7++) {
               var0.field2039[var4][var7] = null;
            }

            var0.field2063[var4] = 0;
         }
      }

      if (var0.field2048 != null) {
         Arrays.fill(var0.field2048, null);
      }

      var0.field2110 = 0;

      for (int var5 = 0; var5 < var0.field2050; var5++) {
         var0.field2057[var5] = null;
      }

      var0.field2050 = 0;

      for (int var6 = 0; var6 < var0.field2025.length; var6++) {
         var0.field2025[var6] = null;
      }
   }

   public int[][][] getRoofs() {
      return this.field1994;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("gq")
   public static void method4419(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Scene var7 = classCQ.field1220.scene;
      int var8 = var1 + var7.field2147;
      int var9 = var2 + var7.field2147;
      rl17 var10 = var7.field2020[var8 >> 3][var9 >> 3];
      if (var5 == 0) {
         BoundaryObject var11 = var7.method4501(var0, var1, var2);
         if (var11 != null && (var11.field2249 instanceof DynamicObject || var11.field2248 instanceof DynamicObject) && !var10.field5705.contains(var11)) {
            var10.field5705.add(var11);
         }
      } else if (var5 == 1) {
         WallDecoration var12 = var7.method4517(var0, var1, var2);
         if (var12 != null && (var12.field2279 instanceof DynamicObject || var12.field2278 instanceof DynamicObject) && !var10.field5705.contains(var12)) {
            var10.field5705.add(var12);
         }
      } else if (var5 == 2) {
         GameObject var13 = var7.method4519(var0, var1, var2);
         if (var13 != null && var13.field2200 instanceof DynamicObject && !var10.field5705.contains(var13)) {
            var10.field5705.add(var13);
         }
      } else if (var5 == 3) {
         FloorDecoration var14 = var7.method4502(var0, var1, var2);
         if (var14 != null && var14.field1816 instanceof DynamicObject && !var10.field5705.contains(var14)) {
            var10.field5705.add(var14);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lfe;")
   @ObfuscatedName("bl")
   public BoundaryObject method4219(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      return var4 == null ? null : var4.field1970;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("mb")
   boolean method4377(int var1, int var2, int var3, int var4) {
      if (!this.method4374(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method4386(var5 + 1, this.field2060[var1][var2][var3] - var4, var6 + 1)
            && this.method4386(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3] - var4, var6 + 1)
            && this.method4386(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
            && this.method4386(var5 + 1, this.field2060[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hw")
   public void method4207(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         var4.field1971 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Leo;")
   @ObfuscatedName("bz")
   public FloorDecoration method4222(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      return var4 != null && var4.field1967 != null ? var4.field1967 : null;
   }

   @ObfuscatedSignature(descriptor = "(III)Leo;")
   @ObfuscatedName("ha")
   public FloorDecoration method4223(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      return var4 != null && var4.field1967 != null ? var4.field1967 : null;
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("hj")
   public long method4224(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      return var4 != null && var4.field1971 != null ? var4.field1971.field2266 * -3608662145112923099L : 0L;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("jw")
   static boolean method4292(int var0, int var1, int var2, int var3, boolean var4) {
      return method4288(field2153, var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)I")
   @ObfuscatedName("eg")
   public static int method4135(boolean var0) {
      return var0 ? 1 : 1024;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ja")
   static boolean method4275(int var0, int var1, int var2, int var3) {
      return method4262(field2155, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hb")
   public void method4233(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2059; var4++) {
         for (int var5 = 0; var5 < this.field2056; var5++) {
            for (int var6 = 0; var6 < this.field2032; var6++) {
               classEW var7 = this.field2058[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.field1970;
                  if (var8 != null && var8.field2249 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.field2249;
                     this.method4441(var9, var4, var5, var6, 1, 1);
                     if (var8.field2248 instanceof ModelData) {
                        ModelData var10 = (ModelData)var8.field2248;
                        this.method4441(var10, var4, var5, var6, 1, 1);
                        ModelData.method3961(var9, var10, 0, 0, 0, false);
                        var8.field2248 = var10.method4045(var10.field1878, var10.field1879, var1, var2, var3);
                     }

                     var8.field2249 = var9.method4045(var9.field1878, var9.field1879, var1, var2, var3);
                  }

                  for (int var12 = 0; var12 < var7.field1963 * -389646721; var12++) {
                     GameObject var14 = var7.field1951[var12];
                     if (var14 != null && var14.field2200 instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.field2200;
                        this.method4441(
                           var11,
                           var4,
                           var5,
                           var6,
                           var14.field2186 * -484358301 - var14.field2188 * 1435073618 + 1,
                           var14.field2192 * 1029339049 - var14.field2194 * -555977777 + 1
                        );
                        var14.field2200 = var11.method4045(var11.field1878, var11.field1879, var1, var2, var3);
                     }
                  }

                  FloorDecoration var13 = var7.field1967;
                  if (var13 != null && var13.field1816 instanceof ModelData) {
                     ModelData var15 = (ModelData)var13.field1816;
                     this.method4461(var15, var4, var5, var6);
                     var13.field1816 = var15.method4045(var15.field1878, var15.field1879, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;IIII)Z")
   @ObfuscatedName("fx")
   public static boolean method4378(Scene var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method4379(var1, var1, var1, var1);
      }

      if (!var0.method4374(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return var0.method4386(var5 + 1, var0.field2060[var1][var2][var3] - var4, var6 + 1)
            && var0.method4386(var5 + 128 - 1, var0.field2060[var1][var2 + 1][var3] - var4, var6 + 1)
            && var0.method4386(var5 + 128 - 1, var0.field2060[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
            && var0.method4386(var5 + 1, var0.field2060[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)Z")
   @ObfuscatedName("kt")
   static boolean method4321(int var0, int var1, int var2, int var3, int var4) {
      int var5 = classBF.method997(var3, (byte)-120);
      int var7 = classLL.method7119(var3, 1222866659);
      int var8 = classBF.method997(var4, (byte)-85);
      int var10 = classLL.method7119(var4, 1222866659);
      int var11 = var2 * var8 + var0 * var10 >> 16;
      int var12 = var2 * var10 - var0 * var8 >> 16;
      int var13 = var1 * var5 + var12 * var7 >> 16;
      int var14 = var1 * var7 - var12 * var5 >> 16;
      if (var13 >= -1610945124 && var13 <= classFQ.method4929()) {
         int var15 = field2139 + var11 * -770857664 / var13;
         int var16 = field2129 + var14 * 128 / var13;
         return var15 >= field2137 && var15 <= field2135 && var16 >= field2136 && var16 <= field2131;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;IIII)V")
   @ObfuscatedName("ie")
   public static void method4472(Scene var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method4413(var1, var1, var1, var1);
      }

      var2 += var0.field2147;
      var3 += var0.field2147;
      int var5 = var0.method4489(var1, var2, var3);
      if (var0.method4389(var5)) {
         WallDecoration var6 = var0.field2009[var5];
         if (var6 != null) {
            if (var6.field2267 * -404927711 != 0) {
               var6.field2267 = (var6.field2267 * -404927711 < 0 ? -var4 : var4) * 261748961;
            }

            if (var6.field2273 * 856605829 != 0) {
               var6.field2273 = (var6.field2273 * 856605829 < 0 ? -var4 : var4) * 46830669;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIII)V")
   @ObfuscatedName("ve")
   public void method4447(Renderable var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Model var8 = null;
      int var9 = client.field1096 >> 7 & 15;
      if (!(var1 instanceof DynamicObject) || !((DynamicObject)var1).field1668 && var9 <= 0) {
         if (var1 instanceof Model) {
            var8 = (Model)var1;
         }
      } else {
         var8 = ((DynamicObject)var1).method3714();
      }

      if (var8 != null) {
         var8.calculateExtreme(var2);
         AABB var10 = var8.method5235(var2);
         int var11 = var3 - ((var6 & 7) << 7);
         int var12 = var5 - ((var7 & 7) << 7);
         int var13 = var11 + var10.field2367 * -915116879;
         int var14 = var4 + var10.field2366 * -1027280203;
         int var15 = var12 + var10.field2369 * -81102275;
         int var16 = var13 - var10.field2368 * 1301855055;
         int var17 = var14 - var10.field2365 * -623192411;
         int var18 = var15 - var10.field2370 * 2105673973;
         int var19 = var13 + var10.field2368 * 1301855055;
         int var20 = var14 + var10.field2365 * -623192411;
         int var21 = var15 + var10.field2370 * 2105673973;
         int var22 = var6 + this.field2147;
         int var23 = var7 + this.field2147;
         rl17 var24 = this.field2020[var22 >> 3][var23 >> 3];
         var24.field5708 = Math.min(var24.field5708, var16);
         var24.field5711 = Math.min(var24.field5711, var17);
         var24.field5712 = Math.min(var24.field5712, var18);
         var24.field5703 = Math.max(var24.field5703, var19);
         var24.field5709 = Math.max(var24.field5709, var20);
         var24.field5704 = Math.max(var24.field5704, var21);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;Lee;IIIIIIJI)V")
   @ObfuscatedName("wg")
   public void method4504(
      int var1,
      int var2,
      int var3,
      int var4,
      Renderable var5,
      Renderable var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      long var13,
      int var15
   ) {
      this.method4481(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var15);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("kg")
   static void method4307(int var0, int var1) {
      if (var0 < 0) {
         var0 = 0;
      }

      field2141 = var0;
      field2140 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ler;III)V")
   @ObfuscatedName("is")
   void method4235(ModelData var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for (int var9 = var3; var9 <= var6; var9++) {
         if (var9 >= 0 && var9 < this.field2056) {
            for (int var10 = var7; var10 <= var8; var10++) {
               if (var10 >= 0 && var10 < this.field2032 && (var9 >= var6 || var10 >= var8)) {
                  classEW var11 = this.field2058[var2][var9][var10];
                  if (var11 != null && var11.field1967 != null && var11.field1967.field1816 instanceof ModelData) {
                     int var12 = method4240(this, var2, var9, var10, var2, var3, var4);
                     ModelData var13 = (ModelData)var11.field1967.field1816;
                     ModelData.method3961(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lrl17;)V")
   @ObfuscatedName("ak")
   public void method4474(Projection var1, rl17 var2) {
      for (int var3 = 0; var3 < var2.field5706.size(); var3++) {
         GameObject var4 = (GameObject)var2.field5706.get(var3);
         if (var4.field2200 instanceof Scene) {
            var1.method5037(
               var4.field2200,
               var4.field2189 * 470594389,
               var4.field2195 * -1405731525,
               var4.field2190 * 1269801851,
               var4.field2196 * -1706390585,
               var4.field2185 * 1745853678706228013L
            );
         }
      }
   }

   public int getWorldViewId() {
      return this.field2112;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ml")
   public void method4505(boolean var1) {
      this.method4324(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ler;III)V")
   @ObfuscatedName("cd")
   void method4236(ModelData var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for (int var9 = var3; var9 <= var6; var9++) {
         if (var9 >= 0 && var9 < this.field2056) {
            for (int var10 = var7; var10 <= var8; var10++) {
               if (var10 >= 0 && var10 < this.field2032 && (var9 >= var6 || var10 >= var8)) {
                  classEW var11 = this.field2058[var2][var9][var10];
                  if (var11 != null && var11.field1967 != null && var11.field1967.field1816 instanceof ModelData) {
                     int var12 = method4240(this, var2, var9, var10, var2, var3, var4);
                     ModelData var13 = (ModelData)var11.field1967.field1816;
                     ModelData.method3961(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }
   }

   public byte getOverrideAmount() {
      return this.field2035.field2303;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("yf")
   public boolean method4450(int var1) {
      return (this.field2005[var1] & 2) != 0;
   }

   @ObfuscatedSignature(descriptor = "(Ler;IIIII)V")
   @ObfuscatedName("ix")
   void method4238(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for (int var12 = var2; var12 <= var2 + 1; var12++) {
         if (var12 != this.field2059) {
            for (int var13 = var8; var13 <= var9; var13++) {
               if (var13 >= 0 && var13 < this.field2056) {
                  for (int var14 = var10; var14 <= var11; var14++) {
                     if (var14 >= 0 && var14 < this.field2032 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        classEW var15 = this.field2058[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = method4240(this, var12, var13, var14, var2, var3, var4);
                           BoundaryObject var17 = var15.field1970;
                           if (var17 != null) {
                              if (var17.field2249 instanceof ModelData) {
                                 ModelData var18 = (ModelData)var17.field2249;
                                 ModelData.method3961(
                                    var1,
                                    var18,
                                    (var13 - var3) * 550629966 + (1 - var5) * 709963166,
                                    var16,
                                    (var14 - var4) * 128 + (1 - var6) * -678320273,
                                    var7
                                 );
                              }

                              if (var17.field2248 instanceof ModelData) {
                                 ModelData var23 = (ModelData)var17.field2248;
                                 ModelData.method3961(
                                    var1,
                                    var23,
                                    (var13 - var3) * -724273396 + (1 - var5) * 1049222396,
                                    var16,
                                    (var14 - var4) * 128 + (1 - var6) * -603634666,
                                    var7
                                 );
                              }
                           }

                           for (int var24 = 0; var24 < var15.field1963 * -1229198320; var24++) {
                              GameObject var19 = var15.field1951[var24];
                              if (var19 != null && var19.field2200 instanceof ModelData) {
                                 ModelData var20 = (ModelData)var19.field2200;
                                 int var21 = var19.field2186 * 304142753 - var19.field2188 * -1559065218 + 1;
                                 int var22 = var19.field2192 * -544424899 - var19.field2194 * 1881335404 + 1;
                                 ModelData.method3961(
                                    var1,
                                    var20,
                                    (var19.field2188 * 1779806614 - var3) * 128 + (var21 - var5) * 64,
                                    var16,
                                    (var19.field2194 * -555977777 - var4) * 128 + (var22 - var6) * 194306734,
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

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("tm")
   public void method4401(int var1, int var2, int var3) {
      if (var3 == this.field2150.field1710 * -483624883 && !classOE.field4843.isMenuOpen()) {
         this.field1990 = var1;
         this.field1991 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("ih")
   int method4241(int var1, int var2, int var3, int var4, int var5, int var6) {
      return method4249(this, var1, var2, var3) - method4249(this, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("it")
   int method4246(int var1, int var2, int var3) {
      return (
            this.field2060[var1][var2][var3]
               + this.field2060[var1][var2 + 1][var3]
               + this.field2060[var1][var2][var3 + 1]
               + this.field2060[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dm")
   static void method4308(int var0, int var1) {
      if (var0 < 0) {
         var0 = 0;
      }

      field2141 = var0;
      field2140 = var1;
   }

   public int getBaseX() {
      return this.field2109;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method4491() {
      Arrays.fill(this.field2005, 0);
      Arrays.fill(this.field2006, null);
      Arrays.fill(this.field2007, null);
      Arrays.fill(this.field2008, null);
      Arrays.fill(this.field2009, null);
      Arrays.fill(this.field2010, null);
      Arrays.fill(this.field2011, null);
      Arrays.fill(this.field2013, null);
      Arrays.fill(this.field2012, (byte)0);
      Arrays.fill(this.field2025, null);

      for (int var1 = 0; var1 < this.field2056 >> 3; var1++) {
         for (int var2 = 0; var2 < this.field2032 >> 3; var2++) {
            rl17 var3 = this.field2020[var1][var2];
            var3.field5705.clear();
            var3.field5706.clear();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("oq")
   public Model method4506() {
      return this.field2151;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lrl17;)Z")
   @ObfuscatedName("xu")
   public boolean method4400(Projection var1, rl17 var2) {
      int var3 = var2.field5707;
      int var4 = var2.field5710;
      int var5 = ((var3 << 3) - this.field2147 << 7) + (var2.field5708 + var2.field5703) / 2;
      int var6 = (var2.field5709 + var2.field5711) / 2;
      int var7 = ((var4 << 3) - this.field2147 << 7) + (var2.field5712 + var2.field5704) / 2;
      int var8 = (var2.field5703 - var2.field5708 + 1) / 2;
      int var9 = (var2.field5709 - var2.field5711 + 1) / 2;
      int var10 = (var2.field5704 - var2.field5712 + 1) / 2;
      return client.method2312(var1, 0, 0, 0, var5, var6, var7, var8, var9, var10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)J")
   @ObfuscatedName("vc")
   public static long method4229(Scene var0, int var1, int var2, int var3) {
      classEW var4 = var0.field2058[var1][var2][var3];
      return var4 != null && var4.field1967 != null ? var4.field1967.field1815 * 5132338419383099835L : 0L;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;)V")
   @ObfuscatedName("fx")
   public static void method4329(Scene var0) {
      if (var0 == null) {
         var0.method4130();
      }

      var0.field2033 = true;
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("hq")
   public long method4225(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      return var4 != null && var4.field1971 != null ? var4.field1971.field2266 * -3608662145112923099L : 0L;
   }

   @ObfuscatedSignature(descriptor = "([IIIIII)V")
   @ObfuscatedName("if")
   public void method4252(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      classEW var7 = this.field2058[var4][var5][var6];
      if (var7 != null) {
         SceneTilePaint var8 = var7.field1972;
         if (var8 != null) {
            int var18 = var8.field2289 * 1843846065;
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
            SceneTileModel var9 = var7.field1973;
            if (var9 != null) {
               int var10 = var9.field2320;
               int var11 = var9.field2326;
               int var12 = var9.field2333;
               int var13 = var9.field2321;
               int[] var14 = field2085[var10];
               int[] var15 = field2081[var11];
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

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("wk")
   public void method4507(int var1, int var2) {
      this.method4427(var1, var2);
   }

   public int getBaseY() {
      return this.field2146;
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;Lee;IIJI)V")
   @ObfuscatedName("fx")
   public void method4434(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      int var12 = var2 + this.field2147;
      int var13 = var3 + this.field2147;
      if (var5 != null || var6 != null) {
         int var14 = this.method4489(var1, var12, var13);
         BoundaryObject var15 = new BoundaryObject();
         var15.method4625(var9);
         var15.method4621(var11);
         var15.method4629(var2 * 128 + 64);
         var15.method4628(var3 * 128 + 64);
         var15.method4624(var4);
         var15.method4627(var5);
         var15.method4626(var6);
         var15.method4619(var7);
         var15.method4622(var8);

         for (int var16 = var1; var16 >= 0; var16--) {
            int var17 = this.method4489(var16, var12, var13);
            if (!this.method4389(var17)) {
               this.method4437(var17, var16, var12, var13);
            }

            if (this.field1993[var16][var12][var13] == null) {
               this.field1993[var16][var12][var13] = new rl10(this, var17);
               this.method4424(var16, var12, var13);
            }
         }

         assert this.field2008[var14] == null;

         this.field2008[var14] = var15;
         this.field2005[var14] = this.field2005[var14] | 16384;
         this.field2016[var14] = this.field2016[var14] | 1080863910568919040L;
         if (var5 instanceof DynamicObject || var6 instanceof DynamicObject) {
            rl17 var20 = this.field2020[var12 >> 3][var13 >> 3];
            var20.field5705.add(var15);
            this.method4428((DynamicObject)var5);
            this.method4428((DynamicObject)var6);
         }

         this.method4447(var5, 0, var15.getX(), var15.getZ(), var15.getY(), var2, var3);
         this.method4447(var6, 0, var15.getX(), var15.getZ(), var15.getY(), var2, var3);
         var15.field2247 = var1;
         if (this.field2156) {
            WallObjectSpawned var21 = new WallObjectSpawned();
            var21.setTile(this.field1993[var1][var12][var13]);
            var21.setWallObject(var15);
            classOE.field4843.getCallbacks().post(var21);
         }

         if (this.field2156 && client.field1118 != null) {
            client.field1118.invalidateZone(this, var12 >> 3, var13 >> 3);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Lew;)Z")
   @ObfuscatedName("kk")
   public static boolean method4190(Scene var0, classEW var1) {
      if (var1.field1956 * -9179043 != var0.field2065) {
         var1.field1956 = var0.field2065 * -1699605829;
         var1.field1958 = var1.field1963 * -906965805;
         if (var0.field2050 >= var0.field2057.length) {
            var0.field2057 = Arrays.copyOf(var0.field2057, var0.field2057.length * 2);
         }

         var0.field2057[var0.field2050++] = var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;)V")
   @ObfuscatedName("bj")
   public static void method4330(Scene var0) {
      if (var0 == null) {
         var0.method4333();
      }

      var0.field2033 = true;
   }

   public byte[][][] getTileShapes() {
      return this.field2160;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("iv")
   public static void method4258(int var0) {
      int var1 = (field2071 - 1) * field2069 * (var0 + var0 + 1) * (var0 + var0 + 1);
      field2152 = new BitSet(var1);
      field2155 = new BitSet(var1);
      field2138 = field2069 * (var0 + var0 + 1) * (var0 + var0 + 1);
      field2133 = (var0 + var0 + 1) * (var0 + var0 + 1);
      field2128 = var0 + var0 + 1;
      int var2 = field2071 * field2069 * (var0 + var0 + 3) * (var0 + var0 + 3);
      field2153 = new BitSet(var2);
      field2154 = new BitSet(var2);
      field2132 = field2069 * (var0 + var0 + 3) * (var0 + var0 + 3);
      field2134 = (var0 + var0 + 3) * (var0 + var0 + 3);
      field2127 = var0 + var0 + 3;
   }

   @ObfuscatedSignature(descriptor = "(IIIIILee;IJZ)V")
   @ObfuscatedName("bu")
   public void method4508(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
      method4477(this, var1, var2, var3, var4, var5, var6, var7, var8, var10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("iq")
   public static void method4259(int var0) {
      int var1 = (field2071 - 1) * field2069 * (var0 + var0 + 1) * (var0 + var0 + 1);
      field2152 = new BitSet(var1);
      field2155 = new BitSet(var1);
      field2138 = field2069 * (var0 + var0 + 1) * (var0 + var0 + 1);
      field2133 = (var0 + var0 + 1) * (var0 + var0 + 1);
      field2128 = var0 + var0 + 1;
      int var2 = field2071 * field2069 * (var0 + var0 + 3) * (var0 + var0 + 3);
      field2153 = new BitSet(var2);
      field2154 = new BitSet(var2);
      field2132 = field2069 * (var0 + var0 + 3) * (var0 + var0 + 3);
      field2134 = (var0 + var0 + 3) * (var0 + var0 + 3);
      field2127 = var0 + var0 + 3;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("rc")
   public boolean method4509(int var1, int var2, int var3, int var4) {
      return method4378(this, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;I)V")
   @ObfuscatedName("ck")
   public static void method4152(Scene var0, int var1) {
      if (var0 == null) {
         var0.method4168(var1, var1, var1);
      }

      var0.field2040 = var1;

      for (int var2 = 0; var2 < var0.field2056; var2++) {
         for (int var3 = 0; var3 < var0.field2032; var3++) {
            if (var0.field2058[var1][var2][var3] == null) {
               var0.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hg")
   public void method4431() {
      int var1 = this.field2003;
      var1 <<= 1;
      this.field2019[var1] = this.field2003;
      var1 = this.field2003;
      var1 = (var1 << 1) + 1;
      this.field2019[var1] = this.field2003;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ic")
   public static void method4260(int var0) {
      int var1 = (field2071 - 1) * field2069 * (var0 + var0 + 1) * (var0 + var0 + 1);
      field2152 = new BitSet(var1);
      field2155 = new BitSet(var1);
      field2138 = field2069 * (var0 + var0 + 1) * (var0 + var0 + 1);
      field2133 = (var0 + var0 + 1) * (var0 + var0 + 1);
      field2128 = var0 + var0 + 1;
      int var2 = field2071 * field2069 * (var0 + var0 + 3) * (var0 + var0 + 3);
      field2153 = new BitSet(var2);
      field2154 = new BitSet(var2);
      field2132 = field2069 * (var0 + var0 + 3) * (var0 + var0 + 3);
      field2134 = (var0 + var0 + 3) * (var0 + var0 + 3);
      field2127 = var0 + var0 + 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("iy")
   static boolean method4263(BitSet var0, int var1, int var2, int var3, int var4) {
      return var0.get(var1 * field2138 + var2 * field2133 + var3 * field2128 + var4);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kc")
   public void method4331() {
      this.field2033 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("ii")
   static boolean method4266(BitSet var0, int var1, int var2, int var3, int var4, boolean var5) {
      var0.set(var1 * field2138 + var2 * field2133 + var3 * field2128 + var4, var5);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;Lee;IIJI)V")
   @ObfuscatedName("yu")
   public void method4175(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         BoundaryObject var12 = new BoundaryObject();
         var12.field2240 = var9 * -2636099314526831141L;
         var12.field2241 = var11 * -752902543;
         var12.field2244 = var2 * -923366272 + 1685800512;
         var12.field2245 = var3 * -2139868032 + 1077549632;
         var12.field2242 = var4 * -697873045;
         var12.field2249 = var5;
         var12.field2248 = var6;
         var12.field2246 = var7 * -1380680693;
         var12.field2243 = var8 * 1487745865;

         for (int var13 = var1; var13 >= 0; var13--) {
            if (this.field2058[var13][var2][var3] == null) {
               this.field2058[var13][var2][var3] = new classEW(var13, var2, var3);
            }
         }

         this.field2058[var1][var2][var3].field1970 = var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("sv")
   public void method4484(int var1, int var2) {
      assert (var2 & 15) == var2;

      this.field2005[var1] = this.field2005[var1] & -15728641;
      this.field2005[var1] = this.field2005[var1] | var2 << 20;
   }

   @ObfuscatedSignature(descriptor = "(Lez;III)Leo;")
   @ObfuscatedName("gx")
   public static FloorDecoration method4457(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method4525(var1, var1, var1);
      } else {
         var2 += var0.field2147;
         var3 += var0.field2147;
         int var4 = var0.method4489(var1, var2, var3);
         return var0.method4389(var4) ? var0.field2010[var4] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lew;)V")
   @ObfuscatedName("lo")
   void method4361(Projection var1, classEW var2) {
      if (var2 != null) {
         int var3 = var2.field1952 * -54806681;
         int var4 = var2.field1957 * -2067052011;
         int var5 = var2.field1949 * 1483076705;
         int var6 = var2.field1950 * 800564741;
         if (var2.field1949 * -2004702872 == 0 && var2.field1969 != null) {
            this.method4444(var1, var2.field1969);
         }

         if (var2.field1972 != null) {
            if (!this.method4374(var6, var3, var4) && (var2.field1972.field2286 * 1662822508 != 1268869135 || var5 <= this.field2044)) {
               var1.vmethod426(this, var2.field1972, var6, var3, var4, -2040228248);
            }
         } else if (var2.field1973 != null && !this.method4374(var6, var3, var4)) {
            var1.vmethod431(this, var2.field1973, var3, var4, -2124088443);
         }

         BoundaryObject var7 = var2.field1970;
         if (var7 != null) {
            if (var7.field2249 != null && !this.method4375(var6, var3, var4, var7.field2246 * 1548562339)) {
               var1.vmethod435(
                  var7.field2249,
                  0,
                  var7.field2244 * -1078103908,
                  var7.field2242 * 1315862339,
                  var7.field2245 * 31139801,
                  var7.field2240 * 7159317397185328723L
               );
            }

            if (var7.field2248 != null && !this.method4375(var6, var3, var4, var7.field2243 * -1413337351)) {
               var1.vmethod435(
                  var7.field2248,
                  0,
                  var7.field2244 * -1259310485,
                  var7.field2242 * 618049031,
                  var7.field2245 * -1102104320,
                  var7.field2240 * 7159317397185328723L
               );
            }
         }

         WallDecoration var8 = var2.field1971;
         if (var8 != null && !method4378(this, var6, var3, var4, var8.field2279.field1743 * 1108772015)) {
            if (var8.field2276 * 254285683 == -1724790585) {
               var1.vmethod435(
                  var8.field2279,
                  0,
                  var8.field2270 * 1683313172 + var8.field2267 * -404927711,
                  var8.field2268 * 1698079433,
                  var8.field2275 * 1106128048 + var8.field2273 * 861330991,
                  var8.field2266 * -3608662145112923099L
               );
               if (var8.field2278 != null) {
                  var1.vmethod435(
                     var8.field2278,
                     0,
                     var8.field2270 * 1766830743 + var8.field2272 * 330210020,
                     var8.field2268 * 1698079433,
                     var8.field2275 * -361702377 + var8.field2271 * 513256357,
                     var8.field2266 * -3608662145112923099L
                  );
               }
            } else {
               var1.vmethod435(
                  var8.field2279,
                  0,
                  var8.field2270 * -1565333119 + var8.field2267 * -404927711,
                  var8.field2268 * 1698079433,
                  var8.field2275 * -361702377 + var8.field2273 * 856605829,
                  var8.field2266 * -3608662145112923099L
               );
            }
         }

         FloorDecoration var9 = var2.field1967;
         if (var9 != null) {
            var1.vmethod435(
               var9.field1816, 0, var9.field1806 * 1333275141, var9.field1807 * 1194776988, var9.field1808 * -433293465, var9.field1815 * 5132338419383099835L
            );
         }

         ItemLayer var10 = var2.field1968;
         if (var10 != null) {
            if (var10.field1847 != null) {
               var1.vmethod435(
                  var10.field1847,
                  0,
                  var10.field1840 * 1325865996,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }

            if (var10.field1845 != null) {
               var1.vmethod435(
                  var10.field1845,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }

            if (var10.field1846 != null) {
               var1.vmethod435(
                  var10.field1846,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * -261433433 - var10.field1838 * -1955322214,
                  var10.field1839 * 435853241,
                  var10.field1844
               );
            }
         }

         for (int var11 = 0; var11 < var2.field1963 * -796463233; var11++) {
            GameObject var12 = var2.field1951[var11];
            var12.field2197 = this.field2065 * -58641868;
            if (var12.field2188 * 1530698152 == var2.field1952 * -54806681
               && var12.field2194 * -555977777 == var2.field1957 * -2083275184
               && !this.method4381(
                  var6,
                  var12.field2188 * 1138017605,
                  var12.field2186 * 304142753,
                  var12.field2194 * -555977777,
                  var12.field2192 * -544424899,
                  var12.field2200.field1743 * -1256242689
               )) {
               try {
                  var1.vmethod435(
                     var12.field2200,
                     var12.field2189 * 470594389,
                     var12.field2195 * -1887722434,
                     var12.field2190 * 1269801851,
                     var12.field2196 * -1706390585,
                     var12.field2185 * 1745853678706228013L
                  );
               } catch (Exception var15) {
               }
            }
         }

         if (var2.method4092((short)-28024)) {
            for (int var16 = 0; var16 < var2.field1955.size(); var16++) {
               GameObject var17 = (GameObject)var2.field1955.get(var16);
               var17.field2197 = this.field2065 * 132222543;
               if (!this.method4381(
                  var6,
                  var2.field1952 * -1377018906,
                  var2.field1952 * 453986683,
                  var2.field1957 * -562900908,
                  var2.field1957 * 805228346,
                  var17.field2200.field1743 * -489674690
               )) {
                  try {
                     var1.vmethod435(
                        var17.field2200,
                        var17.field2189 * 470594389,
                        var17.field2195 * -1405731525,
                        var17.field2190 * -1586084758,
                        var17.field2196 * -1706390585,
                        var17.field2185 * 1745853678706228013L
                     );
                  } catch (Exception var14) {
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bl")
   public static void method4510(int var0, int var1) {
      method4308(var0, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lrl17;II)Z")
   @ObfuscatedName("xb")
   public boolean method4449(rl17 var1, int var2, int var3) {
      if ((client.field1096 & 32) != 0) {
         return client.field1118.zoneInFrustum(var2, var3, var1.field5709, var1.field5711);
      } else {
         int var4 = var1.field5711;
         int var5 = var1.field5709;
         int var6 = ((var2 << 3) - this.field2147 << 7) + 512 - this.field2118;
         int var7 = ((var3 << 3) - this.field2147 << 7) + 512 - this.field2116;
         int var8 = var5 - this.field2119;
         short var9 = 724;
         int var10 = classFH.field2257.method4607();
         int var11 = classFH.field2257.method4603();
         int var12 = classFH.field2257.method4608();
         int var13 = classFH.field2257.method4602();
         int var14 = classFH.field2257.method4604();
         float var15 = this.field2090 * var7 - this.field2089 * var6;
         float var16 = this.field2087 * var8 + this.field2088 * var15;
         float var17 = this.field2088 * var9;
         float var18 = var16 + var17;
         if (var18 > 50.0F) {
            float var19 = var7 * this.field2089 + this.field2090 * var6;
            float var20 = (var19 - var9) * var10;
            float var21 = (var19 + var9) * var10;
            if (var20 < var11 * var18 && var21 > var12 * var18) {
               float var22 = this.field2088 * var8 - var15 * this.field2087;
               float var23 = this.field2087 * var9;
               float var24 = (var22 + var23) * var10;
               if (var24 > var13 * var18) {
                  float var25 = this.field2088 * (var5 - var4) + var23;
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("jd")
   static boolean method4271(int var0, int var1, int var2, int var3, boolean var4) {
      return method4264(field2152, var0, var1, var2, var3, var4);
   }

   public int getDrawDistance() {
      return field2149;
   }

   public byte getOverrideSaturation() {
      return this.field2035.field2301;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("em")
   public static void method4451(int var0) {
      WorldView var1 = classIS.field3053;
      Scene var2 = var1.scene;
      if (var2.field2022.get(var0)) {
         var2.method4415();
      }

      for (int var3 = 0; var3 < var1.field1693.method14011(); var3++) {
         WorldEntity var4 = (WorldEntity)var1.worldEntities.method13600(var1.field1693.method14012(var3));
         var4.field6012.scene.method4415();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("jz")
   static boolean method4272(int var0, int var1, int var2, int var3, boolean var4) {
      return method4264(field2152, var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("jq")
   static boolean method4276(int var0, int var1, int var2, int var3) {
      return method4262(field2155, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("ce")
   static boolean method4293(int var0, int var1, int var2, int var3, boolean var4) {
      return method4288(field2153, var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("el")
   public boolean method4511(int var1, int var2) {
      return this.method4311(var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("jg")
   static boolean method4277(int var0, int var1, int var2, int var3) {
      return method4262(field2155, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(III)J")
   @ObfuscatedName("cu")
   public long method4417(int var1, int var2, int var3) {
      var2 += this.field2147;
      var3 += this.field2147;
      int var4 = this.method4489(var1, var2, var3);
      return this.method4389(var4) && this.field2009[var4] != null ? this.field2009[var4].field2266 * -3608662145112923099L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(Ldy;)V")
   @ObfuscatedName("kc")
   public void method4428(DynamicObject var1) {
      if (var1 != null) {
         var1.method3706();
         if (var1.field1665 > -1 && this.field2022 != null) {
            this.field2022.set(var1.field1665);
         }

         if (var1.method3709()) {
            var1.field1668 = true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIILee;Lee;IIIIIIJI)V")
   @ObfuscatedName("iq")
   public static void method4178(
      Scene var0,
      int var1,
      int var2,
      int var3,
      int var4,
      Renderable var5,
      Renderable var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      long var13,
      int var15
   ) {
      if (var0 == null) {
         var0.getDrawDistance();
      }

      if (var5 != null) {
         WallDecoration var16 = new WallDecoration();
         var16.field2266 = var13 * 2170180156281739181L;
         var16.field2265 = var15 * -47677163;
         var16.field2270 = var2 * 896963456 + -1699001920;
         var16.field2275 = var3 * 856544128 + 428272064;
         var16.field2268 = var4 * 765794169;
         var16.field2279 = var5;
         var16.field2278 = var6;
         var16.field2276 = var7 * 1259333051;
         var16.field2269 = var8 * 1071651815;
         var16.field2267 = var9 * 261748961;
         var16.field2273 = var10 * 46830669;
         var16.field2272 = var11 * -153257471;
         var16.field2271 = var12 * -829209555;

         for (int var17 = var1; var17 >= 0; var17--) {
            if (var0.field2058[var17][var2][var3] == null) {
               var0.field2058[var17][var2][var3] = new classEW(var17, var2, var3);
            }
         }

         var0.field2058[var1][var2][var3].field1971 = var16;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("ji")
   static boolean method4279(int var0, int var1, int var2, int var3, boolean var4) {
      return method4264(field2155, var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("jn")
   static boolean method4280(int var0, int var1, int var2, int var3, boolean var4) {
      return method4264(field2155, var0, var1, var2, var3, var4);
   }

   public int[] getMapRegions() {
      return this.field2158;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("xo")
   public void method4448(int var1, int var2) {
      assert (var2 & 0xFF) == var2;

      this.field2005[var1] = this.field2005[var1] & 16777215;
      this.field2005[var1] = this.field2005[var1] | var2 << 24;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("js")
   static boolean method4281(int var0, int var1, int var2, int var3, boolean var4) {
      return method4264(field2155, var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("jc")
   static boolean method4283(BitSet var0, int var1, int var2, int var3, int var4) {
      return var0.get(var1 * field2132 + var2 * field2134 + var3 * field2127 + var4);
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lew;)V")
   @ObfuscatedName("dg")
   void method4444(Projection var1, classEW var2) {
   }

   public byte getOverrideLuminance() {
      return this.field2035.field2302;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("vz")
   public void method4512() {
      this.method4491();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIILee;JI)V")
   @ObfuscatedName("nf")
   public static void method4164(Scene var0, int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var0 == null) {
         var0.method4166(var1, var1, var1, var1, var5, var6, var1);
      }

      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.field1816 = var5;
         var9.field1806 = var2 * 2134971449 + 1250210624;
         var9.field1808 = var3 * 719086569 + -1083896930;
         var9.field1807 = var4 * -1938914931;
         var9.field1815 = var6 * -8879266543907161229L;
         var9.method3938(var8, (byte)2);
         if (var0.field2058[var1][var2][var3] == null) {
            var0.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
         }

         var0.field2058[var1][var2][var3].field1967 = var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("iz")
   int method4247(int var1, int var2, int var3) {
      return (
            this.field2060[var1][var2][var3]
               + this.field2060[var1][var2 + 1][var3]
               + this.field2060[var1][var2][var3 + 1]
               + this.field2060[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("kp")
   public void method4433(int var1, int var2) {
      assert (var2 & 15) == var2;

      this.field2005[var1] = this.field2005[var1] & -983041;
      this.field2005[var1] = this.field2005[var1] | var2 << 16;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIILee;IJI)Z")
   @ObfuscatedName("fk")
   public boolean method4513(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
      return this.method4179(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Lew;)Z")
   @ObfuscatedName("lq")
   public static boolean method4191(Scene var0, classEW var1) {
      if (var0 == null) {
         return var0.method4193(var1);
      } else if (var1.field1956 * -299736461 != var0.field2065) {
         var1.field1956 = var0.field2065 * -1699605829;
         var1.field1958 = var1.field1963 * -980607445;
         if (var0.field2050 >= var0.field2057.length) {
            var0.field2057 = Arrays.copyOf(var0.field2057, var0.field2057.length * 2);
         }

         var0.field2057[var0.field2050++] = var1;
         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("jx")
   static boolean method4286(BitSet var0, int var1, int var2, int var3, int var4, boolean var5) {
      var0.set(var1 * field2132 + var2 * field2134 + var3 * field2127 + var4, var5);
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("jv")
   static boolean method4289(int var0, int var1, int var2, int var3) {
      return method4282(field2153, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(Lez;IIIJ)I")
   @ObfuscatedName("if")
   public static int method4462(Scene var0, int var1, int var2, int var3, long var4) {
      if (var0 == null) {
         return var0.method4463(var1, var1, var1, var4);
      } else {
         var2 += var0.field2147;
         var3 += var0.field2147;
         int var6 = var0.method4489(var1, var2, var3);
         if (!var0.method4389(var6)) {
            return -1;
         } else if (var0.field2008[var6] != null && var0.field2008[var6].field2240 * 7159317397185328723L == var4) {
            return var0.field2008[var6].field2241 * 1869636241 & 0xFF;
         } else if (var0.field2009[var6] != null && var0.field2009[var6].field2266 * -3608662145112923099L == var4) {
            return var0.field2009[var6].field2265 * -1506294211 & 0xFF;
         } else if (var0.field2010[var6] != null && var0.field2010[var6].field1815 * 5132338419383099835L == var4) {
            return var0.field2010[var6].field1809 * -1235687175 & 0xFF;
         } else {
            byte var7 = var0.field2012[var6];

            for (int var8 = 0; var8 < var7; var8++) {
               GameObject var9 = var0.field2013[var6 * 5 + var8];
               if (var9.field2185 * 1745853678706228013L == var4) {
                  return var9.field2184 * -288062455 & 0xFF;
               }
            }

            return -1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("yo")
   public void method4514(int var1, int var2, int var3) {
      classFK.method4823(this, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("vv")
   public void method4515(int var1, int var2, int var3, int var4) {
      method4472(this, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("jm")
   static boolean method4294(int var0, int var1, int var2, int var3, boolean var4) {
      return method4288(field2153, var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ex")
   public void method4402(int var1) {
      this.field2005[var1] = 0;
      this.field2006[var1] = null;
      this.field2007[var1] = null;
      this.field2008[var1] = null;
      this.field2009[var1] = null;
      this.field2010[var1] = null;
      this.field2011[var1] = null;
      this.field2012[var1] = 0;

      for (int var2 = 0; var2 < 5; var2++) {
         this.field2013[var1 * 5 + var2] = null;
         this.field2014[var1 * 5 + var2] = 0;
      }

      this.field2015[var1] = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ne")
   public void method4516() {
      this.method4338();
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;JI)V")
   @ObfuscatedName("fh")
   public void method4165(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.field1816 = var5;
         var9.field1806 = var2 * -1794546048 + -1104504652;
         var9.field1808 = var3 * -2036886656 + -1018443328;
         var9.field1807 = var4 * 476279895;
         var9.field1815 = var6 * -8879266543907161229L;
         var9.method3938(var8, (byte)2);
         if (this.field2058[var1][var2][var3] == null) {
            this.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
         }

         this.field2058[var1][var2][var3].field1967 = var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lew;)Z")
   @ObfuscatedName("gz")
   boolean method4192(classEW var1) {
      if (var1.field1956 * -299736461 != this.field2065) {
         var1.field1956 = this.field2065 * -1699605829;
         var1.field1958 = var1.field1963 * -980607445;
         if (this.field2050 >= this.field2057.length) {
            this.field2057 = Arrays.copyOf(this.field2057, this.field2057.length * 2);
         }

         this.field2057[this.field2050++] = var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lfv;Lee;IIIIJ)V")
   @ObfuscatedName("mz")
   public void method4406(Projection var1, Projection var2, Renderable var3, int var4, int var5, int var6, int var7, long var8) {
      if (var3 instanceof Model) {
         Model var10 = (Model)var3;
         var10.calculateBoundsCylinder();
         client.method2395(var1, var2, var10, var4, var5, var6, var7, var8);
      } else if (var3 instanceof DynamicObject) {
         int var14 = client.field1096 >> 7 & 15;
         DynamicObject var11 = (DynamicObject)var3;
         if (var11.field1668 || var14 > 0) {
            Model var12 = var11.method3707(rl21.field5728);
            if (var12 != null) {
               var12.calculateBoundsCylinder();
               int var13 = var11.getAnimationHeightOffset();

               assert !var11.field1668 || var13 == 0;

               client.method2395(var1, var2, var12, var4, var5, var6 - var13, var7, var8);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lfb;")
   @ObfuscatedName("hr")
   public GameObject method4220(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for (int var5 = 0; var5 < var4.field1963 * -389646721; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = 1745853678706228013L * var6.field2185;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2188 * 1588489486 == var2 && var6.field2194 * 1610330980 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("jy")
   static boolean method4298(int var0, int var1, int var2, int var3) {
      return method4282(field2154, var0, var1, var2, var3);
   }

   public int[][][] getTileHeights() {
      return this.field2060;
   }

   @ObfuscatedSignature(descriptor = "(III)Lfi;")
   @ObfuscatedName("cd")
   public WallDecoration method4517(int var1, int var2, int var3) {
      return this.method4420(var1, var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("jb")
   static boolean method4299(int var0, int var1, int var2, int var3) {
      return method4282(field2154, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;JI)V")
   @ObfuscatedName("iu")
   public void method4518(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      method4464(this, var1, var2, var3, var4, var5, var6, var8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("jk")
   static boolean method4300(int var0, int var1, int var2, int var3) {
      return method4282(field2154, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hc")
   public void method4234(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field2059; var4++) {
         for (int var5 = 0; var5 < this.field2056; var5++) {
            for (int var6 = 0; var6 < this.field2032; var6++) {
               classEW var7 = this.field2058[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.field1970;
                  if (var8 != null && var8.field2249 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.field2249;
                     this.method4441(var9, var4, var5, var6, 1, 1);
                     if (var8.field2248 instanceof ModelData) {
                        ModelData var10 = (ModelData)var8.field2248;
                        this.method4441(var10, var4, var5, var6, 1, 1);
                        ModelData.method3961(var9, var10, 0, 0, 0, false);
                        var8.field2248 = var10.method4045(var10.field1878, var10.field1879, var1, var2, var3);
                     }

                     var8.field2249 = var9.method4045(var9.field1878, var9.field1879, var1, var2, var3);
                  }

                  for (int var12 = 0; var12 < var7.field1963 * -389646721; var12++) {
                     GameObject var14 = var7.field1951[var12];
                     if (var14 != null && var14.field2200 instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.field2200;
                        this.method4441(
                           var11,
                           var4,
                           var5,
                           var6,
                           var14.field2186 * 304142753 - var14.field2188 * 1138017605 + 1,
                           var14.field2192 * -1621346983 - var14.field2194 * 413785176 + 1
                        );
                        var14.field2200 = var11.method4045(var11.field1878, var11.field1879, var1, var2, var3);
                     }
                  }

                  FloorDecoration var13 = var7.field1967;
                  if (var13 != null && var13.field1816 instanceof ModelData) {
                     ModelData var15 = (ModelData)var13.field1816;
                     this.method4461(var15, var4, var5, var6);
                     var13.field1816 = var15.method4045(var15.field1878, var15.field1879, var1, var2, var3);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("ke")
   static boolean method4302(int var0, int var1, int var2, int var3, boolean var4) {
      return method4288(field2154, var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("kf")
   static boolean method4303(int var0, int var1, int var2, int var3, boolean var4) {
      return method4288(field2154, var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([IIIII)V")
   @ObfuscatedName("kx")
   public static void method4305(int[] var0, int var1, int var2, int var3, int var4) {
      field2072 = var0;
      field2130 = var1;
      field2126 = var2;
      field2137 = 0;
      field2136 = 0;
      field2135 = var3;
      field2131 = var4;
      field2139 = var3 / 2;
      field2129 = var4 / 2;
      field2155.set(0, field2155.size());
      field2154.set(0, field2154.size());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([IIIII)V")
   @ObfuscatedName("kp")
   public static void method4306(int[] var0, int var1, int var2, int var3, int var4) {
      field2072 = var0;
      field2130 = var1;
      field2126 = var2;
      field2137 = 0;
      field2136 = 0;
      field2135 = var3;
      field2131 = var4;
      field2139 = var3 / 2;
      field2129 = var4 / 2;
      field2155.set(0, field2155.size());
      field2154.set(0, field2154.size());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("id")
   static boolean method4269(int var0, int var1, int var2, int var3) {
      return method4262(field2152, var0, var1, var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ks")
   static void method4309(int var0, int var1) {
      if (var0 < 0) {
         var0 = 0;
      }

      field2141 = var0;
      field2140 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fd")
   public void method4159(int var1, int var2, int var3, int var4) {
      classEW var5 = this.field2058[var1][var2][var3];
      if (var5 != null) {
         this.field2058[var1][var2][var3].field1964 = var4 * 1248621793;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("wa")
   public boolean method4488(int var1, int var2, int var3, int var4, boolean var5) {
      DrawCallbacks var6 = client.field1118;
      if (classOE.field4843.isGpu() && var6 != null && this.field2062) {
         for (int var7 = this.field2120; var7 < this.field2123; var7++) {
            int var8 = this.field2032;
            int var9 = 0;

            for (int var10 = this.field2113; var10 < this.field2122; var10++) {
               int var11 = this.method4489(var4, var7, var10);
               if (this.method4389(var11)
                  && var6.tileInFrustum(this, this.field2087, this.field2088, this.field2089, this.field2090, var1, var2, var3, var4, var7, var10)) {
                  var8 = Math.min(var8, var10);
                  var9 = Math.max(var9, var10);
               }
            }

            if (var5) {
               field2075[var7] = var8;
               field2076[var7] = var9;
            } else {
               field2075[var7] = Math.min(field2075[var7], var8);
               field2076[var7] = Math.max(field2076[var7], var9);
            }
         }

         for (int var12 = this.field2120 + 1; var12 < this.field2123 - 1; var12++) {
            field2075[var12] = Math.min(field2075[var12], Math.max(field2075[var12 - 1], field2075[var12 + 1]));
            field2076[var12] = Math.max(field2076[var12], Math.min(field2076[var12 - 1], field2076[var12 + 1]));
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Z)V")
   @ObfuscatedName("dn")
   void method4351(Projection var1, boolean var2) {
      this.field2041 = 0;

      for (int var3 = this.field2040; var3 < this.field2059; var3++) {
         classEW[][] var4 = this.field2058[var3];

         for (int var5 = this.field2120; var5 < this.field2123; var5++) {
            for (int var6 = this.field2113; var6 < this.field2122; var6++) {
               classEW var7 = var4[var5][var6];
               if (var7 != null
                  && var7.field1964 * 1390661409 <= this.field2027
                  && (
                     !var2
                        || this.method4311(var5 - this.field2114 + this.field2053 + this.field2051, var6 - this.field2124 + this.field2054 + this.field2051)
                        || this.field2060[var3][var5][var6] - this.field2119 >= 2000
                  )) {
                  this.method4444(var1, var7);
               }
            }
         }
      }

      this.method4338();
      classFL.method4827(classFH.field2257.field2215, this.field2061);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("kq")
   boolean method4312(int var1, int var2) {
      if (!method4273(field2141, field2140, var1, var2)) {
         return method4267(field2141, field2140, var1, var2);
      } else {
         method4278(field2141, field2140, var1, var2, false);
         boolean var3 = false;

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (this.method4318(field2141, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141 + 1, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141 + 1, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return method4270(field2141, field2140, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ka")
   boolean method4313(int var1, int var2) {
      if (!method4273(field2141, field2140, var1, var2)) {
         return method4267(field2141, field2140, var1, var2);
      } else {
         method4278(field2141, field2140, var1, var2, false);
         boolean var3 = false;

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (this.method4318(field2141, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141 + 1, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141 + 1, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return method4270(field2141, field2140, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("ki")
   boolean method4316(int var1, int var2, int var3, int var4) {
      if (!method4296(var1, var2, var3, var4)) {
         return method4290(var1, var2, var3, var4);
      } else {
         method4301(var1, var2, var3, var4, false);
         int var5 = var1 * 256 + field2066;
         int var6 = var2 * 1024;
         int var7 = (var3 - this.field2051 - this.field2053 - 1) * 128;
         int var8 = (var4 - this.field2051 - this.field2054 - 1) * 128;

         for (int var9 = -field2130; var9 <= field2126; var9 += 128) {
            if (method4320(var7, field2072[var1] + var9, var8, var5, var6)) {
               return method4293(var1, var2, var3, var4, true);
            }
         }

         return method4293(var1, var2, var3, var4, false);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lfb;")
   @ObfuscatedName("nh")
   public GameObject method4519(int var1, int var2, int var3) {
      return this.method4395(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("hd")
   public void method4418(int var1, int var2) {
      this.field2005[var2] = this.field2005[var1];
      this.field2006[var2] = this.field2006[var1];
      this.field2007[var2] = this.field2007[var1];
      this.field2008[var2] = this.field2008[var1];
      this.field2009[var2] = this.field2009[var1];
      this.field2010[var2] = this.field2010[var1];
      this.field2011[var2] = this.field2011[var1];
      this.field2012[var2] = this.field2012[var1];

      for (int var3 = 0; var3 < 5; var3++) {
         this.field2013[var2 * 5 + var3] = this.field2013[var1 * 5 + var3];
         this.field2014[var2 * 5 + var3] = this.field2014[var1 * 5 + var3];
      }

      this.field2015[var2] = this.field2015[var1];
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("kv")
   boolean method4317(int var1, int var2, int var3, int var4) {
      if (!method4296(var1, var2, var3, var4)) {
         return method4290(var1, var2, var3, var4);
      } else {
         method4301(var1, var2, var3, var4, false);
         int var5 = var1 * 256 + field2066;
         int var6 = var2 * 1024;
         int var7 = (var3 - this.field2051 - this.field2053 - 1) * 128;
         int var8 = (var4 - this.field2051 - this.field2054 - 1) * 128;

         for (int var9 = -field2130; var9 <= field2126; var9 += 128) {
            if (method4320(var7, field2072[var1] + var9, var8, var5, var6)) {
               return method4293(var1, var2, var3, var4, true);
            }
         }

         return method4293(var1, var2, var3, var4, false);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cx")
   static boolean method4290(int var0, int var1, int var2, int var3) {
      return method4282(field2153, var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(III)Lfb;")
   @ObfuscatedName("hk")
   public GameObject method4221(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for (int var5 = 0; var5 < var4.field1963 * -389646721; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = 1745853678706228013L * var6.field2185;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2188 * 1138017605 == var2 && var6.field2194 * -689283924 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("kn")
   public void method4325(boolean var1) {
      if (!this.method4334() || var1) {
         this.field2043 = true;
         this.field2033 = var1;
         this.field2036 = -1;
         this.field2037 = -1;
      }
   }

   public int getMinLevel() {
      return this.field2040;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("io")
   public void method4520(
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
      method4410(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZ)Z")
   @ObfuscatedName("jh")
   static boolean method4295(int var0, int var1, int var2, int var3, boolean var4) {
      return method4288(field2153, var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("da")
   boolean method4382(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var3 && var4 == var5) {
         if (!this.method4374(var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return this.method4386(var13 + 1, this.field2060[var1][var2][var4] - var6, var15 + 1)
               && this.method4386(var13 + 128 - 1, this.field2060[var1][var2 + 1][var4] - var6, var15 + 1)
               && this.method4386(var13 + 128 - 1, this.field2060[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
               && this.method4386(var13 + 1, this.field2060[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (this.field2031[var1][var7][var8] == -this.field2065) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = this.field2060[var1][var2][var4] - var6;
         if (!this.method4386(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method4386(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !this.method4386(var12, var9, var11) ? false : this.method4386(var10, var9, var11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dk")
   public boolean method4335() {
      return this.field2033 && this.field2036 != -1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kh")
   public boolean method4336() {
      return this.field2033 && this.field2036 != -1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("kb")
   public boolean method4521(int var1, int var2, int var3, int var4) {
      return this.method4375(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lrl10;I[Ljava/util/Set;)V")
   @ObfuscatedName("jy")
   public void method4473(rl10 var1, int var2, Set[] var3) {
      this.method4404(var1.field5692);

      int var4;
      while ((var4 = this.method4391()) != this.field2002) {
         int var5 = var4 >> this.field1995 & this.field1997;
         int var6 = var4 & this.field1998;
         int var7 = var4 >> this.field1996 & 3;
         if (this.field1994[var7][var5][var6] == 0) {
            if (this.method4411(var7, var5, var6)) {
               this.method4471(var7, var5 - 1, var6);
               this.method4471(var7, var5 + 1, var6);
               this.method4471(var7, var5, var6 - 1);
               this.method4471(var7, var5, var6 + 1);
               this.method4471(var7, var5 - 1, var6 - 1);
               this.method4471(var7, var5 + 1, var6 - 1);
               this.method4471(var7, var5 - 1, var6 + 1);
               this.method4471(var7, var5 + 1, var6 + 1);
            }

            this.field1994[var7][var5][var6] = var2;
            int var8 = var7 + 1;

            for (int var9 = 0; var8 < 4; var9++) {
               int var10 = this.field1994[var8][var5][var6];
               if (var10 != 0) {
                  var3[var9].add(var10);
                  break;
               }

               var10 = var2 | var9 + 1 << 28;
               this.field1994[var8][var5][var6] = var10;
               var3[var9].add(var10);
               var8++;
            }
         }
      }

      for (int var11 = 0; var11 < 3; var11++) {
         Set var12 = var3[var11];
         if (var12.size() > 0) {
            this.field1989.put(var2 | var11 << 28, var12.stream().mapToInt(var0 -> var0).toArray());
            var12.clear();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("dy")
   boolean method4318(int var1, int var2, int var3, int var4) {
      if (!method4296(var1, var2, var3, var4)) {
         return method4290(var1, var2, var3, var4);
      } else {
         method4301(var1, var2, var3, var4, false);
         int var5 = var1 * 256 + field2066;
         int var6 = var2 * 1024;
         int var7 = (var3 - this.field2051 - this.field2053 - 1) * 128;
         int var8 = (var4 - this.field2051 - this.field2054 - 1) * 128;

         for (int var9 = -field2130; var9 <= field2126; var9 += 128) {
            if (method4320(var7, field2072[var1] + var9, var8, var5, var6)) {
               return method4293(var1, var2, var3, var4, true);
            }
         }

         return method4293(var1, var2, var3, var4, false);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIIIII)I")
   @ObfuscatedName("ql")
   public static int method4242(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method4437(var1, var1, var1, var1);
      }

      return method4249(var0, var1, var2, var3) - method4249(var0, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lm")
   void method4339() {
      if (this.field2043) {
         this.field2043 = false;
         this.field2036 = this.field2026;
         this.field2037 = this.field2034;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;)V")
   @ObfuscatedName("ki")
   public static void method4129(Scene var0) {
      if (var0 == null) {
         var0.isInstance();
      }

      var0.field2064 = -1;
      var0.field2151 = null;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ko")
   boolean method4314(int var1, int var2) {
      if (!method4273(field2141, field2140, var1, var2)) {
         return method4267(field2141, field2140, var1, var2);
      } else {
         method4278(field2141, field2140, var1, var2, false);
         boolean var3 = false;

         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (this.method4318(field2141, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141 + 1, field2140, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method4318(field2141 + 1, (field2140 + 1) % field2069, var1 + var4 + 1, var2 + var5 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return method4270(field2141, field2140, var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lf")
   public void method4340() {
      this.field2036 = -1;
      this.field2033 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ln")
   public void method4341() {
      this.field2036 = -1;
      this.field2033 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ce")
   public void method4480() {
      for (int var1 = 0; var1 < this.field2059; var1++) {
         for (int var2 = this.field2147; var2 < this.field2056 - this.field2147; var2++) {
            for (int var3 = this.field2147; var3 < this.field2032 - this.field2147; var3++) {
               rl10 var4 = this.field2161[var1][var2 - this.field2147][var3 - this.field2147];
               if (var4 != null) {
                  this.method4405(var4);
                  if (var4.method10032() != null) {
                     this.method4405(var4.method10032());
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILup;Lup;IIIZ)V")
   @ObfuscatedName("lz")
   public void method4343(int var1, int var2, int var3, classUP var4, classUP var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field2056 * 128) {
         var1 = this.field2056 * 1720506926 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field2032 * -422969528) {
         var3 = this.field2032 * 128 - 1;
      }

      var4.method11426(1, 4160, (byte)15);
      this.field2087 = var4.method11449(2129787521);
      this.field2088 = var4.method11451((byte)116);
      this.field2089 = var5.method11449(2112225602);
      this.field2090 = var5.method11451((byte)111);
      method4308((var4.method11436((short)-30976) - field2066) / -1632316410, var5.method11436((short)-13978) / 1024);
      this.field2118 = var1;
      this.field2119 = var2;
      this.field2116 = var3;
      this.field2114 = var1 / -866401737;
      this.field2124 = var3 / -1459648397;
      this.field2121 = var7 / -799547811;
      this.field2125 = var8 / -1224939909;
      this.field2027 = var6;
      IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
      if (this.field2151 != null) {
         classNZ.method8286(this.field2151, classFZ.field2519);
         this.field2151.method5163(0, var4, var5, 0, 0, 0, -1L);
      }

      if (classFH.method4735()) {
         classFH.field2257.field2217 = 0;
         this.method4408(var10, var9, true);
         classFH.field2257.field2217 = 1;
         this.method4408(var10, var9, false);
         classFH.field2257.field2217 = 2;
      } else {
         classFH.field2257.field2217 = 2;
         this.method4408(var10, var9, true);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lb")
   public void method4347(int var1) {
      this.field2142 = var1;
      this.field2026 = -1;
      this.field2034 = -1;
      this.field2042 = -1.0F;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ly")
   public void method4348(int var1) {
      this.field2142 = var1;
      this.field2026 = -1;
      this.field2034 = -1;
      this.field2042 = -1.0F;
   }

   @ObfuscatedSignature(descriptor = "()[[[Lrl10;")
   @ObfuscatedName("rd")
   public rl10[][][] method4399() {
      return this.field1993;
   }

   public void removeTile(Tile var1) {
      rl10 var2 = (rl10)var1;
      int var3 = var2.field5692;
      int var4 = this.field2005[var3];
      int var5 = var3 >> this.field1995 & this.field1997;
      int var6 = var3 & this.field1998;
      rl17 var7 = this.field2020[var5 >> 3][var6 >> 3];
      if ((var4 & 2048) != 0) {
         var7.field5705.remove(this.field2010[var3]);
      }

      if ((var4 & 12288) != 0) {
         var7.field5705.remove(this.field2011[var3]);
      }

      if ((var4 & 16384) != 0) {
         var7.field5705.remove(this.field2008[var3]);
      }

      if ((var4 & 32768) != 0) {
         var7.field5705.remove(this.field2009[var3]);
      }

      byte var8 = this.field2012[var3];

      for (int var9 = 0; var9 < var8; var9++) {
         GameObject var10 = this.field2013[var3 * 5 + var9];
         var7.field5705.remove(var10);
      }

      this.method4402(var3);
      var2.field5693 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("jj")
   static boolean method4287(BitSet var0, int var1, int var2, int var3, int var4, boolean var5) {
      var0.set(var1 * field2132 + var2 * field2134 + var3 * field2127 + var4, var5);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Z)V")
   @ObfuscatedName("lu")
   void method4352(Projection var1, boolean var2) {
      this.field2041 = 0;

      for (int var3 = this.field2040; var3 < this.field2059; var3++) {
         classEW[][] var4 = this.field2058[var3];

         for (int var5 = this.field2120; var5 < this.field2123; var5++) {
            for (int var6 = this.field2113; var6 < this.field2122; var6++) {
               classEW var7 = var4[var5][var6];
               if (var7 != null
                  && var7.field1964 * 917688813 <= this.field2027
                  && (
                     !var2
                        || this.method4311(var5 - this.field2114 + this.field2053 + this.field2051, var6 - this.field2124 + this.field2054 + this.field2051)
                        || this.field2060[var3][var5][var6] - this.field2119 >= -465454206
                  )) {
                  this.method4444(var1, var7);
               }
            }
         }
      }

      this.method4338();
      classFL.method4827(classFH.field2257.field2215, this.field2061);
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Z)V")
   @ObfuscatedName("lc")
   void method4353(Projection var1, boolean var2) {
      this.field2041 = 0;

      for (int var3 = this.field2040; var3 < this.field2059; var3++) {
         classEW[][] var4 = this.field2058[var3];

         for (int var5 = this.field2120; var5 < this.field2123; var5++) {
            for (int var6 = this.field2113; var6 < this.field2122; var6++) {
               classEW var7 = var4[var5][var6];
               if (var7 != null
                  && var7.field1964 * 1390661409 <= this.field2027
                  && (
                     !var2
                        || this.method4311(var5 - this.field2114 + this.field2053 + this.field2051, var6 - this.field2124 + this.field2054 + this.field2051)
                        || this.field2060[var3][var5][var6] - this.field2119 >= 2000
                  )) {
                  this.method4444(var1, var7);
               }
            }
         }
      }

      this.method4338();
      classFL.method4827(classFH.field2257.field2215, this.field2061);
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Z)V")
   @ObfuscatedName("ll")
   void method4355(Projection var1, boolean var2) {
      this.field2041 = 0;

      for (int var3 = this.field2040; var3 < this.field2059; var3++) {
         classEW[][] var4 = this.field2058[var3];

         for (int var5 = this.field2120; var5 < this.field2123; var5++) {
            for (int var6 = this.field2113; var6 < this.field2122; var6++) {
               classEW var7 = var4[var5][var6];
               if (var7 != null) {
                  if (var7.field1964 * -1037639466 <= this.field2027
                     && (
                        !var2
                           || this.method4311(var5 - this.field2114 + this.field2053 + this.field2051, var6 - this.field2124 + this.field2054 + this.field2051)
                           || this.field2060[var3][var5][var6] - this.field2119 >= 1289531338
                     )) {
                     var7.field1974 = true;
                     var7.field1976 = true;
                     var7.field1975 = var7.field1963 * 1562340076 > 0 || var7.method4092((short)10726);
                     this.field2041++;
                  } else {
                     var7.field1974 = false;
                     var7.field1976 = false;
                     var7.field1962 = 0;
                  }
               }
            }
         }
      }

      int var14 = Math.abs(this.field2053);
      int var15 = Math.abs(this.field2054);

      for (int var16 = this.field2040; var16 < this.field2059; var16++) {
         classEW[][] var18 = this.field2058[var16];

         for (int var20 = -(this.field2051 + var14); var20 <= 0; var20++) {
            int var8 = this.field2114 + var20;
            int var9 = this.field2114 - var20;
            if (var8 >= this.field2120 || var9 < this.field2123) {
               for (int var10 = -(this.field2051 + var15); var10 <= 0; var10++) {
                  int var11 = this.field2124 + var10;
                  int var12 = this.field2124 - var10;
                  if (var8 >= this.field2120 && var8 < this.field2123) {
                     if (var11 >= this.field2113 && var11 < this.field2122) {
                        classEW var13 = var18[var8][var11];
                        if (var13 != null && var13.field1974) {
                           this.method4407(var1, var13, true);
                        }
                     }

                     if (var12 >= this.field2113 && var12 < this.field2122) {
                        classEW var27 = var18[var8][var12];
                        if (var27 != null && var27.field1974) {
                           this.method4407(var1, var27, true);
                        }
                     }
                  }

                  if (var9 >= this.field2120 && var9 < this.field2123) {
                     if (var11 >= this.field2113 && var11 < this.field2122) {
                        classEW var28 = var18[var9][var11];
                        if (var28 != null && var28.field1974) {
                           this.method4407(var1, var28, true);
                        }
                     }

                     if (var12 >= this.field2113 && var12 < this.field2122) {
                        classEW var29 = var18[var9][var12];
                        if (var29 != null && var29.field1974) {
                           this.method4407(var1, var29, true);
                        }
                     }
                  }

                  if (this.field2041 == 0) {
                     this.method4338();
                     classFL.method4827(classFH.field2257.field2215, this.field2061);
                     return;
                  }
               }
            }
         }
      }

      for (int var17 = this.field2040; var17 < this.field2059; var17++) {
         classEW[][] var19 = this.field2058[var17];

         for (int var21 = -(this.field2051 + var14); var21 <= 0; var21++) {
            int var22 = this.field2117 + var21;
            int var23 = this.field2117 - var21;
            if (var22 >= this.field2120 || var23 < this.field2123) {
               for (int var24 = -(this.field2051 + var15); var24 <= 0; var24++) {
                  int var25 = this.field2115 + var24;
                  int var26 = this.field2115 - var24;
                  if (var22 >= this.field2120 && var22 < this.field2123) {
                     if (var25 >= this.field2113 && var25 < this.field2122) {
                        classEW var30 = var19[var22][var25];
                        if (var30 != null && var30.field1974) {
                           this.method4407(var1, var30, false);
                        }
                     }

                     if (var26 >= this.field2113 && var26 < this.field2122) {
                        classEW var31 = var19[var22][var26];
                        if (var31 != null && var31.field1974) {
                           this.method4407(var1, var31, false);
                        }
                     }
                  }

                  if (var23 >= this.field2120 && var23 < this.field2123) {
                     if (var25 >= this.field2113 && var25 < this.field2122) {
                        classEW var32 = var19[var23][var25];
                        if (var32 != null && var32.field1974) {
                           this.method4407(var1, var32, false);
                        }
                     }

                     if (var26 >= this.field2113 && var26 < this.field2122) {
                        classEW var33 = var19[var23][var26];
                        if (var33 != null && var33.field1974) {
                           this.method4407(var1, var33, false);
                        }
                     }
                  }

                  if (this.field2041 == 0) {
                     this.method4338();
                     classFL.method4827(classFH.field2257.field2215, this.field2061);
                     return;
                  }
               }
            }
         }
      }

      classFL.method4827(classFH.field2257.field2215, this.field2061);
      this.method4338();
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lew;Z)V")
   @ObfuscatedName("lw")
   void method4357(Projection var1, classEW var2, boolean var3) {
      classNN.method7900(this.field2049, var2);

      label661:
      while (true) {
         classEW var4;
         int var5;
         int var6;
         int var7;
         int var8;
         classEW[][] var9;
         while (true) {
            var4 = (classEW)classNN.method7907(this.field2049);
            if (var4 == null) {
               return;
            }

            if (var4.field1976) {
               var5 = var4.field1952 * -54806681;
               var6 = var4.field1957 * -2067052011;
               var7 = var4.field1949 * 1483076705;
               var8 = var4.field1950 * 800564741;
               var9 = this.field2058[var7];
               if (!var4.field1974) {
                  break;
               }

               if (var3) {
                  if (var7 > 0) {
                     classEW var10 = this.field2058[var7 - 1][var5][var6];
                     if (var10 != null && var10.field1976) {
                        continue;
                     }
                  }

                  if (var5 <= this.field2114 && var5 > this.field2120) {
                     classEW var21 = var9[var5 - 1][var6];
                     if (var21 != null && var21.field1976 && (var21.field1974 || (var4.field1954 * -785027619 & 1) == 0)) {
                        continue;
                     }
                  }

                  if (var5 >= this.field2114 && var5 < this.field2123 - 1) {
                     classEW var22 = var9[var5 + 1][var6];
                     if (var22 != null && var22.field1976 && (var22.field1974 || (var4.field1954 * -785027619 & 4) == 0)) {
                        continue;
                     }
                  }

                  if (var6 <= this.field2124 && var6 > this.field2113) {
                     classEW var23 = var9[var5][var6 - 1];
                     if (var23 != null && var23.field1976 && (var23.field1974 || (var4.field1954 * -785027619 & 8) == 0)) {
                        continue;
                     }
                  }

                  if (var6 >= this.field2124 && var6 < this.field2122 - 1) {
                     classEW var24 = var9[var5][var6 + 1];
                     if (var24 != null && var24.field1976 && (var24.field1974 || (var4.field1954 * -785027619 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var3 = true;
               }

               var4.field1974 = false;
               if (var4.field1969 != null) {
                  classEW var25 = var4.field1969;
                  if (var25.field1972 != null) {
                     if (!this.method4374(0, var5, var6)) {
                        var1.vmethod426(this, var25.field1972, 0, var5, var6, 1184911032);
                     }
                  } else if (var25.field1973 != null && !this.method4374(0, var5, var6)) {
                     var1.vmethod431(this, var25.field1973, var5, var6, -1559083594);
                  }

                  BoundaryObject var11 = var25.field1970;
                  if (var11 != null) {
                     var1.vmethod435(
                        var11.field2249,
                        0,
                        var11.field2244 * -777838807,
                        var11.field2242 * 1315862339,
                        var11.field2245 * 31139801,
                        var11.field2240 * 7159317397185328723L
                     );
                  }

                  for (int var12 = 0; var12 < var25.field1963 * -389646721; var12++) {
                     GameObject var13 = var25.field1951[var12];
                     if (var13 != null) {
                        var1.vmethod435(
                           var13.field2200,
                           var13.field2189 * 470594389,
                           var13.field2195 * -1405731525,
                           var13.field2190 * 1269801851,
                           var13.field2196 * -1706390585,
                           var13.field2185 * 1745853678706228013L
                        );
                     }
                  }

                  if (var25.field1955 != null && !var25.field1955.isEmpty()) {
                     for (int var46 = 0; var46 < var25.field1955.size(); var46++) {
                        GameObject var53 = (GameObject)var25.field1955.get(var46);
                        var1.vmethod435(
                           var53.field2200,
                           var53.field2189 * 470594389,
                           var53.field2195 * -1405731525,
                           var53.field2190 * 1269801851,
                           var53.field2196 * -1706390585,
                           var53.field2185 * 1745853678706228013L
                        );
                     }
                  }
               }

               boolean var26 = false;
               if (var4.field1972 != null) {
                  if (!this.method4374(var8, var5, var6)) {
                     var26 = true;
                     if (var4.field1972.field2286 * -665850825 != 12345678 || var7 <= this.field2044) {
                        var1.vmethod426(this, var4.field1972, var8, var5, var6, -549838045);
                     }
                  }
               } else if (var4.field1973 != null && !this.method4374(var8, var5, var6)) {
                  var26 = true;
                  var1.vmethod431(this, var4.field1973, var5, var6, 801308209);
               }

               int var34 = 0;
               int var47 = 0;
               BoundaryObject var54 = var4.field1970;
               WallDecoration var14 = var4.field1971;
               if (var54 != null || var14 != null) {
                  if (this.field2114 == var5) {
                     var34++;
                  } else if (this.field2114 < var5) {
                     var34 += 2;
                  }

                  if (this.field2124 == var6) {
                     var34 += 3;
                  } else if (this.field2124 > var6) {
                     var34 += 6;
                  }

                  var47 = field2070[var34];
                  var4.field1966 = field2079[var34] * -444605687;
               }

               if (var54 != null) {
                  if ((var54.field2246 * 1548562339 & field2067[var34]) != 0) {
                     if (var54.field2246 * 1548562339 == 16) {
                        var4.field1962 = -1916821325;
                        var4.field1961 = field2080[var34] * -271757815;
                        var4.field1960 = -1262267289 - var4.field1961 * -640457819;
                     } else if (var54.field2246 * 1548562339 == 32) {
                        var4.field1962 = 461324646;
                        var4.field1961 = field2068[var34] * -271757815;
                        var4.field1960 = 1770432718 - var4.field1961 * -640457819;
                     } else if (var54.field2246 * 1548562339 == 64) {
                        var4.field1962 = 922649292;
                        var4.field1961 = field2082[var34] * -271757815;
                        var4.field1960 = -754101860 - var4.field1961 * -640457819;
                     } else {
                        var4.field1962 = -1455496679;
                        var4.field1961 = field2083[var34] * -271757815;
                        var4.field1960 = 508165429 - var4.field1961 * -640457819;
                     }
                  } else {
                     var4.field1962 = 0;
                  }

                  if ((var54.field2246 * 1548562339 & var47) != 0 && !this.method4375(var8, var5, var6, var54.field2246 * 1548562339)) {
                     var1.vmethod435(
                        var54.field2249,
                        0,
                        var54.field2244 * -777838807,
                        var54.field2242 * 1315862339,
                        var54.field2245 * 31139801,
                        var54.field2240 * 7159317397185328723L
                     );
                  }

                  if ((var54.field2243 * -1413337351 & var47) != 0 && !this.method4375(var8, var5, var6, var54.field2243 * -1413337351)) {
                     var1.vmethod435(
                        var54.field2248,
                        0,
                        var54.field2244 * -777838807,
                        var54.field2242 * 1315862339,
                        var54.field2245 * 31139801,
                        var54.field2240 * 7159317397185328723L
                     );
                  }
               }

               if (var14 != null && !method4378(this, var8, var5, var6, var14.field2279.field1743 * -1256242689)) {
                  if ((var14.field2276 * 254285683 & var47) != 0) {
                     var1.vmethod435(
                        var14.field2279,
                        0,
                        var14.field2270 * 1766830743 + var14.field2267 * -404927711,
                        var14.field2268 * 1698079433,
                        var14.field2275 * -361702377 + var14.field2273 * 856605829,
                        var14.field2266 * -3608662145112923099L
                     );
                  } else if (var14.field2276 * 254285683 == 256) {
                     int var15 = var14.field2270 * 1766830743 - this.field2118;
                     int var16 = var14.field2275 * -361702377 - this.field2116;
                     int var17 = var14.field2269 * -819410985;
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
                        var1.vmethod435(
                           var14.field2279,
                           0,
                           var14.field2270 * 1766830743 + var14.field2267 * -404927711,
                           var14.field2268 * 1698079433,
                           var14.field2275 * -361702377 + var14.field2273 * 856605829,
                           var14.field2266 * -3608662145112923099L
                        );
                     } else if (var14.field2278 != null) {
                        var1.vmethod435(
                           var14.field2278,
                           0,
                           var14.field2270 * 1766830743 + var14.field2272 * -1085897215,
                           var14.field2268 * 1698079433,
                           var14.field2275 * -361702377 + var14.field2271 * 513256357,
                           var14.field2266 * -3608662145112923099L
                        );
                     }
                  }
               }

               if (var26) {
                  FloorDecoration var63 = var4.field1967;
                  if (var63 != null) {
                     var1.vmethod435(
                        var63.field1816,
                        0,
                        var63.field1806 * 1333275141,
                        var63.field1807 * -276908185,
                        var63.field1808 * 498815127,
                        var63.field1815 * 5132338419383099835L
                     );
                  }

                  ItemLayer var69 = var4.field1968;
                  if (var69 != null && var69.field1838 * 218008627 == 0) {
                     if (var69.field1847 != null) {
                        var1.vmethod435(
                           var69.field1847, 0, var69.field1840 * -892202585, var69.field1841 * 1186822141, var69.field1839 * -1209739927, var69.field1844
                        );
                     }

                     if (var69.field1845 != null) {
                        var1.vmethod435(
                           var69.field1845, 0, var69.field1840 * -892202585, var69.field1841 * 1186822141, var69.field1839 * -1209739927, var69.field1844
                        );
                     }

                     if (var69.field1846 != null) {
                        var1.vmethod435(
                           var69.field1846, 0, var69.field1840 * -892202585, var69.field1841 * 1186822141, var69.field1839 * -1209739927, var69.field1844
                        );
                     }
                  }
               }

               int var64 = var4.field1954 * -785027619;
               if (var64 != 0) {
                  if (var5 < this.field2114 && var5 >= this.field2120 && var5 < this.field2123 - 1 && (var64 & 4) != 0) {
                     classEW var70 = var9[var5 + 1][var6];
                     if (var70 != null && var70.field1976) {
                        classNN.method7900(this.field2049, var70);
                     }
                  }

                  if (var6 < this.field2124 && var6 >= this.field2113 && var6 < this.field2122 - 1 && (var64 & 2) != 0) {
                     classEW var71 = var9[var5][var6 + 1];
                     if (var71 != null && var71.field1976) {
                        classNN.method7900(this.field2049, var71);
                     }
                  }

                  if (var5 > this.field2114 && var5 > this.field2120 && var5 < this.field2123 && (var64 & 1) != 0) {
                     classEW var72 = var9[var5 - 1][var6];
                     if (var72 != null && var72.field1976) {
                        classNN.method7900(this.field2049, var72);
                     }
                  }

                  if (var6 > this.field2124 && var6 > this.field2113 && var6 < this.field2122 && (var64 & 8) != 0) {
                     classEW var73 = var9[var5][var6 - 1];
                     if (var73 != null && var73.field1976) {
                        classNN.method7900(this.field2049, var73);
                     }
                  }
               }
               break;
            }
         }

         if (var4.field1962 * -438031503 != 0) {
            boolean var27 = true;

            for (int var35 = 0; var35 < var4.field1963 * -389646721; var35++) {
               if (var4.field1951[var35].field2197 * 163498159 != this.field2065
                  && (var4.field1953[var35] & var4.field1962 * -438031503) == var4.field1961 * 392470585) {
                  var27 = false;
                  break;
               }
            }

            if (var27) {
               BoundaryObject var36 = var4.field1970;
               if (!this.method4375(var8, var5, var6, var36.field2246 * 1548562339)) {
                  var1.vmethod435(
                     var36.field2249,
                     0,
                     var36.field2244 * -777838807,
                     var36.field2242 * 1315862339,
                     var36.field2245 * 31139801,
                     var36.field2240 * 7159317397185328723L
                  );
               }

               var4.field1962 = 0;
            }
         }

         if (var4.field1975) {
            try {
               var4.field1975 = false;
               int var28 = 0;

               label609:
               for (int var37 = 0; var37 < var4.field1963 * -389646721; var37++) {
                  GameObject var48 = var4.field1951[var37];
                  if (var48.field2197 * 163498159 != this.field2065) {
                     for (int var55 = var48.field2188 * 1138017605; var55 <= var48.field2186 * 304142753; var55++) {
                        for (int var59 = var48.field2194 * -555977777; var59 <= var48.field2192 * -544424899; var59++) {
                           classEW var65 = var9[var55][var59];
                           if (var65.field1974) {
                              var4.field1975 = true;
                              continue label609;
                           }

                           if (var65.field1962 * -438031503 != 0) {
                              int var74 = 0;
                              if (var55 > var48.field2188 * 1138017605) {
                                 var74++;
                              }

                              if (var55 < var48.field2186 * 304142753) {
                                 var74 += 4;
                              }

                              if (var59 > var48.field2194 * -555977777) {
                                 var74 += 8;
                              }

                              if (var59 < var48.field2192 * -544424899) {
                                 var74 += 2;
                              }

                              if ((var74 & var65.field1962 * -438031503) == var4.field1960 * 948803077) {
                                 var4.field1975 = true;
                                 continue label609;
                              }
                           }
                        }
                     }

                     this.field2025[var28++] = var48;
                     var48.field2191 = method4367(this, var48, this.field2114, this.field2124) * -1227421221;
                  }
               }

               if (var4.method4092((short)2142)) {
                  for (int var38 = 0; var38 < var4.field1955.size(); var38++) {
                     GameObject var49 = (GameObject)var4.field1955.get(var38);
                     if (var49.field2197 * 163498159 != this.field2065) {
                        this.field2025[var28++] = var49;
                        var49.field2191 = method4367(this, var49, this.field2114, this.field2124) * -1227421221;
                     }
                  }
               }

               while (true) {
                  int var39 = -50;
                  int var50 = -1;

                  for (int var56 = 0; var56 < var28; var56++) {
                     GameObject var60 = this.field2025[var56];
                     if (var60.field2197 * 163498159 != this.field2065) {
                        if (var60.field2191 * 835963475 > var39) {
                           var39 = var60.field2191 * 835963475;
                           var50 = var56;
                        } else if (var60.field2191 * 835963475 == var39) {
                           int var66 = var60.field2195 * -1405731525 - this.field2118;
                           int var75 = var60.field2196 * -1706390585 - this.field2116;
                           int var78 = this.field2025[var50].field2195 * -1405731525 - this.field2118;
                           int var79 = this.field2025[var50].field2196 * -1706390585 - this.field2116;
                           if (var66 * var66 + var75 * var75 > var78 * var78 + var79 * var79) {
                              var50 = var56;
                           }
                        }
                     }
                  }

                  if (var50 == -1) {
                     if (var4.field1975) {
                        continue label661;
                     }
                     break;
                  }

                  GameObject var57 = this.field2025[var50];
                  var57.field2197 = this.field2065 * 132222543;
                  if (!this.method4381(
                     var8,
                     var57.field2188 * 1138017605,
                     var57.field2186 * 304142753,
                     var57.field2194 * -555977777,
                     var57.field2192 * -544424899,
                     var57.field2200.field1743 * -1256242689
                  )) {
                     var1.vmethod435(
                        var57.field2200,
                        var57.field2189 * 470594389,
                        var57.field2195 * -1405731525,
                        var57.field2190 * 1269801851,
                        var57.field2196 * -1706390585,
                        var57.field2185 * 1745853678706228013L
                     );
                  }

                  for (int var61 = var57.field2188 * 1138017605; var61 <= var57.field2186 * 304142753; var61++) {
                     for (int var67 = var57.field2194 * -555977777; var67 <= var57.field2192 * -544424899; var67++) {
                        classEW var76 = var9[var61][var67];
                        if (var76.field1962 * -438031503 != 0) {
                           classNN.method7900(this.field2049, var76);
                        } else if ((var61 != var5 || var67 != var6) && var76.field1976) {
                           classNN.method7900(this.field2049, var76);
                        }
                     }
                  }
               }
            } catch (Exception var20) {
               var4.field1975 = false;
            }
         }

         if (var4.field1976 && var4.field1962 * -438031503 == 0) {
            if (var5 <= this.field2114 && var5 > this.field2120) {
               classEW var29 = var9[var5 - 1][var6];
               if (var29 != null && var29.field1976) {
                  continue;
               }
            }

            if (var5 >= this.field2114 && var5 < this.field2123 - 1) {
               classEW var30 = var9[var5 + 1][var6];
               if (var30 != null && var30.field1976) {
                  continue;
               }
            }

            if (var6 <= this.field2124 && var6 > this.field2113) {
               classEW var31 = var9[var5][var6 - 1];
               if (var31 != null && var31.field1976) {
                  continue;
               }
            }

            if (var6 >= this.field2124 && var6 < this.field2122 - 1) {
               classEW var32 = var9[var5][var6 + 1];
               if (var32 != null && var32.field1976) {
                  continue;
               }
            }

            var4.field1976 = false;
            this.field2041--;
            ItemLayer var33 = var4.field1968;
            if (var33 != null && var33.field1838 * 218008627 != 0) {
               if (var33.field1847 != null) {
                  var1.vmethod435(
                     var33.field1847,
                     0,
                     var33.field1840 * -892202585,
                     var33.field1841 * 1186822141 - var33.field1838 * 218008627,
                     var33.field1839 * -1209739927,
                     var33.field1844
                  );
               }

               if (var33.field1845 != null) {
                  var1.vmethod435(
                     var33.field1845,
                     0,
                     var33.field1840 * -892202585,
                     var33.field1841 * 1186822141 - var33.field1838 * 218008627,
                     var33.field1839 * -1209739927,
                     var33.field1844
                  );
               }

               if (var33.field1846 != null) {
                  var1.vmethod435(
                     var33.field1846,
                     0,
                     var33.field1840 * -892202585,
                     var33.field1841 * 1186822141 - var33.field1838 * 218008627,
                     var33.field1839 * -1209739927,
                     var33.field1844
                  );
               }
            }

            if (var4.field1966 * 1986405177 != 0) {
               WallDecoration var40 = var4.field1971;
               if (var40 != null && !method4378(this, var8, var5, var6, var40.field2279.field1743 * -1256242689)) {
                  if ((var40.field2276 * 254285683 & var4.field1966 * 1986405177) != 0) {
                     var1.vmethod435(
                        var40.field2279,
                        0,
                        var40.field2270 * 1766830743 + var40.field2267 * -404927711,
                        var40.field2268 * 1698079433,
                        var40.field2275 * -361702377 + var40.field2273 * 856605829,
                        var40.field2266 * -3608662145112923099L
                     );
                  } else if (var40.field2276 * 254285683 == 256) {
                     int var51 = var40.field2270 * 1766830743 - this.field2118;
                     int var58 = var40.field2275 * -361702377 - this.field2116;
                     int var62 = var40.field2269 * -819410985;
                     int var68;
                     if (var62 != 1 && var62 != 2) {
                        var68 = var51;
                     } else {
                        var68 = -var51;
                     }

                     int var77;
                     if (var62 != 2 && var62 != 3) {
                        var77 = var58;
                     } else {
                        var77 = -var58;
                     }

                     if (var77 >= var68) {
                        var1.vmethod435(
                           var40.field2279,
                           0,
                           var40.field2270 * 1766830743 + var40.field2267 * -404927711,
                           var40.field2268 * 1698079433,
                           var40.field2275 * -361702377 + var40.field2273 * 856605829,
                           var40.field2266 * -3608662145112923099L
                        );
                     } else if (var40.field2278 != null) {
                        var1.vmethod435(
                           var40.field2278,
                           0,
                           var40.field2270 * 1766830743 + var40.field2272 * -1085897215,
                           var40.field2268 * 1698079433,
                           var40.field2275 * -361702377 + var40.field2271 * 513256357,
                           var40.field2266 * -3608662145112923099L
                        );
                     }
                  }
               }

               BoundaryObject var52 = var4.field1970;
               if (var52 != null) {
                  if ((var52.field2243 * -1413337351 & var4.field1966 * 1986405177) != 0 && !this.method4375(var8, var5, var6, var52.field2243 * -1413337351)) {
                     var1.vmethod435(
                        var52.field2248,
                        0,
                        var52.field2244 * -777838807,
                        var52.field2242 * 1315862339,
                        var52.field2245 * 31139801,
                        var52.field2240 * 7159317397185328723L
                     );
                  }

                  if ((var52.field2246 * 1548562339 & var4.field1966 * 1986405177) != 0 && !this.method4375(var8, var5, var6, var52.field2246 * 1548562339)) {
                     var1.vmethod435(
                        var52.field2249,
                        0,
                        var52.field2244 * -777838807,
                        var52.field2242 * 1315862339,
                        var52.field2245 * 31139801,
                        var52.field2240 * 7159317397185328723L
                     );
                  }
               }
            }

            if (var7 < this.field2059 - 1) {
               classEW var41 = this.field2058[var7 + 1][var5][var6];
               if (var41 != null && var41.field1976) {
                  classNN.method7900(this.field2049, var41);
               }
            }

            if (var5 < this.field2114 && var5 >= this.field2120 && var5 < this.field2123 - 1) {
               classEW var42 = var9[var5 + 1][var6];
               if (var42 != null && var42.field1976) {
                  classNN.method7900(this.field2049, var42);
               }
            }

            if (var6 < this.field2124 && var6 >= this.field2113 && var6 < this.field2122 - 1) {
               classEW var43 = var9[var5][var6 + 1];
               if (var43 != null && var43.field1976) {
                  classNN.method7900(this.field2049, var43);
               }
            }

            if (var5 > this.field2114 && var5 > this.field2120 && var5 < this.field2123) {
               classEW var44 = var9[var5 - 1][var6];
               if (var44 != null && var44.field1976) {
                  classNN.method7900(this.field2049, var44);
               }
            }

            if (var6 > this.field2124 && var6 > this.field2113 && var6 < this.field2122) {
               classEW var45 = var9[var5][var6 - 1];
               if (var45 != null && var45.field1976) {
                  classNN.method7900(this.field2049, var45);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lew;Z)V")
   @ObfuscatedName("la")
   void method4358(Projection var1, classEW var2, boolean var3) {
      classNN.method7900(this.field2049, var2);

      label661:
      while (true) {
         classEW var4;
         int var5;
         int var6;
         int var7;
         int var8;
         classEW[][] var9;
         while (true) {
            var4 = (classEW)classNN.method7907(this.field2049);
            if (var4 == null) {
               return;
            }

            if (var4.field1976) {
               var5 = var4.field1952 * 322732253;
               var6 = var4.field1957 * -1784116547;
               var7 = var4.field1949 * 1483076705;
               var8 = var4.field1950 * 800564741;
               var9 = this.field2058[var7];
               if (!var4.field1974) {
                  break;
               }

               if (var3) {
                  if (var7 > 0) {
                     classEW var10 = this.field2058[var7 - 1][var5][var6];
                     if (var10 != null && var10.field1976) {
                        continue;
                     }
                  }

                  if (var5 <= this.field2114 && var5 > this.field2120) {
                     classEW var21 = var9[var5 - 1][var6];
                     if (var21 != null && var21.field1976 && (var21.field1974 || (var4.field1954 * -82581941 & 1) == 0)) {
                        continue;
                     }
                  }

                  if (var5 >= this.field2114 && var5 < this.field2123 - 1) {
                     classEW var22 = var9[var5 + 1][var6];
                     if (var22 != null && var22.field1976 && (var22.field1974 || (var4.field1954 * 1720302903 & 4) == 0)) {
                        continue;
                     }
                  }

                  if (var6 <= this.field2124 && var6 > this.field2113) {
                     classEW var23 = var9[var5][var6 - 1];
                     if (var23 != null && var23.field1976 && (var23.field1974 || (var4.field1954 * 533122567 & 8) == 0)) {
                        continue;
                     }
                  }

                  if (var6 >= this.field2124 && var6 < this.field2122 - 1) {
                     classEW var24 = var9[var5][var6 + 1];
                     if (var24 != null && var24.field1976 && (var24.field1974 || (var4.field1954 * -785027619 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var3 = true;
               }

               var4.field1974 = false;
               if (var4.field1969 != null) {
                  classEW var25 = var4.field1969;
                  if (var25.field1972 != null) {
                     if (!this.method4374(0, var5, var6)) {
                        var1.vmethod426(this, var25.field1972, 0, var5, var6, -1198642994);
                     }
                  } else if (var25.field1973 != null && !this.method4374(0, var5, var6)) {
                     var1.vmethod431(this, var25.field1973, var5, var6, 2026704799);
                  }

                  BoundaryObject var11 = var25.field1970;
                  if (var11 != null) {
                     var1.vmethod435(
                        var11.field2249,
                        0,
                        var11.field2244 * -777838807,
                        var11.field2242 * -88329071,
                        var11.field2245 * 31139801,
                        var11.field2240 * 7159317397185328723L
                     );
                  }

                  for (int var12 = 0; var12 < var25.field1963 * 915128840; var12++) {
                     GameObject var13 = var25.field1951[var12];
                     if (var13 != null) {
                        var1.vmethod435(
                           var13.field2200,
                           var13.field2189 * 470594389,
                           var13.field2195 * -6821234,
                           var13.field2190 * 1269801851,
                           var13.field2196 * -1706390585,
                           var13.field2185 * 1745853678706228013L
                        );
                     }
                  }

                  if (var25.field1955 != null && !var25.field1955.isEmpty()) {
                     for (int var46 = 0; var46 < var25.field1955.size(); var46++) {
                        GameObject var53 = (GameObject)var25.field1955.get(var46);
                        var1.vmethod435(
                           var53.field2200,
                           var53.field2189 * 470594389,
                           var53.field2195 * -1908392223,
                           var53.field2190 * 1269801851,
                           var53.field2196 * 871859552,
                           var53.field2185 * 1745853678706228013L
                        );
                     }
                  }
               }

               boolean var26 = false;
               if (var4.field1972 != null) {
                  if (!this.method4374(var8, var5, var6)) {
                     var26 = true;
                     if (var4.field1972.field2286 * -665850825 != 12345678 || var7 <= this.field2044) {
                        var1.vmethod426(this, var4.field1972, var8, var5, var6, -628387858);
                     }
                  }
               } else if (var4.field1973 != null && !this.method4374(var8, var5, var6)) {
                  var26 = true;
                  var1.vmethod431(this, var4.field1973, var5, var6, -1950055723);
               }

               int var34 = 0;
               int var47 = 0;
               BoundaryObject var54 = var4.field1970;
               WallDecoration var14 = var4.field1971;
               if (var54 != null || var14 != null) {
                  if (this.field2114 == var5) {
                     var34++;
                  } else if (this.field2114 < var5) {
                     var34 += 2;
                  }

                  if (this.field2124 == var6) {
                     var34 += 3;
                  } else if (this.field2124 > var6) {
                     var34 += 6;
                  }

                  var47 = field2070[var34];
                  var4.field1966 = field2079[var34] * 893962788;
               }

               if (var54 != null) {
                  if ((var54.field2246 * 1548562339 & field2067[var34]) != 0) {
                     if (var54.field2246 * -2125787007 == 16) {
                        var4.field1962 = -2017892742;
                        var4.field1961 = field2080[var34] * -271757815;
                        var4.field1960 = -1546635933 - var4.field1961 * -640457819;
                     } else if (var54.field2246 * 1548562339 == -344914803) {
                        var4.field1962 = 461324646;
                        var4.field1961 = field2068[var34] * -1241279141;
                        var4.field1960 = 1770432718 - var4.field1961 * -640457819;
                     } else if (var54.field2246 * 1548562339 == 66643623) {
                        var4.field1962 = 922649292;
                        var4.field1961 = field2082[var34] * -271757815;
                        var4.field1960 = -754101860 - var4.field1961 * -640457819;
                     } else {
                        var4.field1962 = 1900479878;
                        var4.field1961 = field2083[var34] * -271757815;
                        var4.field1960 = -1486440048 - var4.field1961 * -640457819;
                     }
                  } else {
                     var4.field1962 = 0;
                  }

                  if ((var54.field2246 * 1548562339 & var47) != 0 && !this.method4375(var8, var5, var6, var54.field2246 * 1396363825)) {
                     var1.vmethod435(
                        var54.field2249,
                        0,
                        var54.field2244 * 1385335661,
                        var54.field2242 * 1315862339,
                        var54.field2245 * 31139801,
                        var54.field2240 * 7159317397185328723L
                     );
                  }

                  if ((var54.field2243 * -1034886024 & var47) != 0 && !this.method4375(var8, var5, var6, var54.field2243 * -1530602966)) {
                     var1.vmethod435(
                        var54.field2248,
                        0,
                        var54.field2244 * 455614865,
                        var54.field2242 * 1315862339,
                        var54.field2245 * 1432549217,
                        var54.field2240 * 7159317397185328723L
                     );
                  }
               }

               if (var14 != null && !method4378(this, var8, var5, var6, var14.field2279.field1743 * -944516245)) {
                  if ((var14.field2276 * 254285683 & var47) != 0) {
                     var1.vmethod435(
                        var14.field2279,
                        0,
                        var14.field2270 * 1887524728 + var14.field2267 * -1188251123,
                        var14.field2268 * -939247107,
                        var14.field2275 * -361702377 + var14.field2273 * 1701104232,
                        var14.field2266 * -3608662145112923099L
                     );
                  } else if (var14.field2276 * 254285683 == 1440807484) {
                     int var15 = var14.field2270 * 533577138 - this.field2118;
                     int var16 = var14.field2275 * -361702377 - this.field2116;
                     int var17 = var14.field2269 * -1474799858;
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
                        var1.vmethod435(
                           var14.field2279,
                           0,
                           var14.field2270 * 279930749 + var14.field2267 * -404927711,
                           var14.field2268 * 550212484,
                           var14.field2275 * -946164839 + var14.field2273 * 856605829,
                           var14.field2266 * -3608662145112923099L
                        );
                     } else if (var14.field2278 != null) {
                        var1.vmethod435(
                           var14.field2278,
                           0,
                           var14.field2270 * 1766830743 + var14.field2272 * -1085897215,
                           var14.field2268 * 770036540,
                           var14.field2275 * -42737406 + var14.field2271 * 513256357,
                           var14.field2266 * -3608662145112923099L
                        );
                     }
                  }
               }

               if (var26) {
                  FloorDecoration var63 = var4.field1967;
                  if (var63 != null) {
                     var1.vmethod435(
                        var63.field1816,
                        0,
                        var63.field1806 * -2054255181,
                        var63.field1807 * -276908185,
                        var63.field1808 * 1258433260,
                        var63.field1815 * 5132338419383099835L
                     );
                  }

                  ItemLayer var69 = var4.field1968;
                  if (var69 != null && var69.field1838 * 218008627 == 0) {
                     if (var69.field1847 != null) {
                        var1.vmethod435(
                           var69.field1847, 0, var69.field1840 * -2075649563, var69.field1841 * 1755095600, var69.field1839 * -2135559555, var69.field1844
                        );
                     }

                     if (var69.field1845 != null) {
                        var1.vmethod435(
                           var69.field1845, 0, var69.field1840 * 1220529357, var69.field1841 * 1186822141, var69.field1839 * -1209739927, var69.field1844
                        );
                     }

                     if (var69.field1846 != null) {
                        var1.vmethod435(
                           var69.field1846, 0, var69.field1840 * -1343340595, var69.field1841 * 1186822141, var69.field1839 * -1370360400, var69.field1844
                        );
                     }
                  }
               }

               int var64 = var4.field1954 * -785027619;
               if (var64 != 0) {
                  if (var5 < this.field2114 && var5 >= this.field2120 && var5 < this.field2123 - 1 && (var64 & 4) != 0) {
                     classEW var70 = var9[var5 + 1][var6];
                     if (var70 != null && var70.field1976) {
                        classNN.method7900(this.field2049, var70);
                     }
                  }

                  if (var6 < this.field2124 && var6 >= this.field2113 && var6 < this.field2122 - 1 && (var64 & 2) != 0) {
                     classEW var71 = var9[var5][var6 + 1];
                     if (var71 != null && var71.field1976) {
                        classNN.method7900(this.field2049, var71);
                     }
                  }

                  if (var5 > this.field2114 && var5 > this.field2120 && var5 < this.field2123 && (var64 & 1) != 0) {
                     classEW var72 = var9[var5 - 1][var6];
                     if (var72 != null && var72.field1976) {
                        classNN.method7900(this.field2049, var72);
                     }
                  }

                  if (var6 > this.field2124 && var6 > this.field2113 && var6 < this.field2122 && (var64 & 8) != 0) {
                     classEW var73 = var9[var5][var6 - 1];
                     if (var73 != null && var73.field1976) {
                        classNN.method7900(this.field2049, var73);
                     }
                  }
               }
               break;
            }
         }

         if (var4.field1962 * 1786861211 != 0) {
            boolean var27 = true;

            for (int var35 = 0; var35 < var4.field1963 * 2143111306; var35++) {
               if (var4.field1951[var35].field2197 * 1585427195 != this.field2065
                  && (var4.field1953[var35] & var4.field1962 * -438031503) == var4.field1961 * 392470585) {
                  var27 = false;
                  break;
               }
            }

            if (var27) {
               BoundaryObject var36 = var4.field1970;
               if (!this.method4375(var8, var5, var6, var36.field2246 * 1548562339)) {
                  var1.vmethod435(
                     var36.field2249,
                     0,
                     var36.field2244 * -777838807,
                     var36.field2242 * 1078421609,
                     var36.field2245 * -959496816,
                     var36.field2240 * 7159317397185328723L
                  );
               }

               var4.field1962 = 0;
            }
         }

         if (var4.field1975) {
            try {
               var4.field1975 = false;
               int var28 = 0;

               label609:
               for (int var37 = 0; var37 < var4.field1963 * -389646721; var37++) {
                  GameObject var48 = var4.field1951[var37];
                  if (var48.field2197 * 943209940 != this.field2065) {
                     for (int var55 = var48.field2188 * -407291055; var55 <= var48.field2186 * 304142753; var55++) {
                        for (int var59 = var48.field2194 * -555977777; var59 <= var48.field2192 * 1020923948; var59++) {
                           classEW var65 = var9[var55][var59];
                           if (var65.field1974) {
                              var4.field1975 = true;
                              continue label609;
                           }

                           if (var65.field1962 * -438031503 != 0) {
                              int var74 = 0;
                              if (var55 > var48.field2188 * 1138017605) {
                                 var74++;
                              }

                              if (var55 < var48.field2186 * 304142753) {
                                 var74 += 4;
                              }

                              if (var59 > var48.field2194 * -35895706) {
                                 var74 += 8;
                              }

                              if (var59 < var48.field2192 * 291461487) {
                                 var74 += 2;
                              }

                              if ((var74 & var65.field1962 * -438031503) == var4.field1960 * 1319121170) {
                                 var4.field1975 = true;
                                 continue label609;
                              }
                           }
                        }
                     }

                     this.field2025[var28++] = var48;
                     var48.field2191 = method4367(this, var48, this.field2114, this.field2124) * -1587470917;
                  }
               }

               if (var4.method4092((short)14124)) {
                  for (int var38 = 0; var38 < var4.field1955.size(); var38++) {
                     GameObject var49 = (GameObject)var4.field1955.get(var38);
                     if (var49.field2197 * -176899493 != this.field2065) {
                        this.field2025[var28++] = var49;
                        var49.field2191 = method4367(this, var49, this.field2114, this.field2124) * -753226779;
                     }
                  }
               }

               while (true) {
                  int var39 = 1683533221;
                  int var50 = -1;

                  for (int var56 = 0; var56 < var28; var56++) {
                     GameObject var60 = this.field2025[var56];
                     if (var60.field2197 * -187532341 != this.field2065) {
                        if (var60.field2191 * 835963475 > var39) {
                           var39 = var60.field2191 * -1826212277;
                           var50 = var56;
                        } else if (var60.field2191 * 835963475 == var39) {
                           int var66 = var60.field2195 * -1405731525 - this.field2118;
                           int var75 = var60.field2196 * -1062449319 - this.field2116;
                           int var78 = this.field2025[var50].field2195 * -1405731525 - this.field2118;
                           int var79 = this.field2025[var50].field2196 * -1706390585 - this.field2116;
                           if (var66 * var66 + var75 * var75 > var78 * var78 + var79 * var79) {
                              var50 = var56;
                           }
                        }
                     }
                  }

                  if (var50 == -1) {
                     if (var4.field1975) {
                        continue label661;
                     }
                     break;
                  }

                  GameObject var57 = this.field2025[var50];
                  var57.field2197 = this.field2065 * -1422097183;
                  if (!this.method4381(
                     var8,
                     var57.field2188 * 1138017605,
                     var57.field2186 * 304142753,
                     var57.field2194 * -555977777,
                     var57.field2192 * -879789992,
                     var57.field2200.field1743 * -1256242689
                  )) {
                     var1.vmethod435(
                        var57.field2200,
                        var57.field2189 * -307690925,
                        var57.field2195 * -1405731525,
                        var57.field2190 * 1269801851,
                        var57.field2196 * -1706390585,
                        var57.field2185 * 1745853678706228013L
                     );
                  }

                  for (int var61 = var57.field2188 * 928438506; var61 <= var57.field2186 * -1814976862; var61++) {
                     for (int var67 = var57.field2194 * -271175504; var67 <= var57.field2192 * -544424899; var67++) {
                        classEW var76 = var9[var61][var67];
                        if (var76.field1962 * -438031503 != 0) {
                           classNN.method7900(this.field2049, var76);
                        } else if ((var61 != var5 || var67 != var6) && var76.field1976) {
                           classNN.method7900(this.field2049, var76);
                        }
                     }
                  }
               }
            } catch (Exception var20) {
               var4.field1975 = false;
            }
         }

         if (var4.field1976 && var4.field1962 * -438031503 == 0) {
            if (var5 <= this.field2114 && var5 > this.field2120) {
               classEW var29 = var9[var5 - 1][var6];
               if (var29 != null && var29.field1976) {
                  continue;
               }
            }

            if (var5 >= this.field2114 && var5 < this.field2123 - 1) {
               classEW var30 = var9[var5 + 1][var6];
               if (var30 != null && var30.field1976) {
                  continue;
               }
            }

            if (var6 <= this.field2124 && var6 > this.field2113) {
               classEW var31 = var9[var5][var6 - 1];
               if (var31 != null && var31.field1976) {
                  continue;
               }
            }

            if (var6 >= this.field2124 && var6 < this.field2122 - 1) {
               classEW var32 = var9[var5][var6 + 1];
               if (var32 != null && var32.field1976) {
                  continue;
               }
            }

            var4.field1976 = false;
            this.field2041--;
            ItemLayer var33 = var4.field1968;
            if (var33 != null && var33.field1838 * 218008627 != 0) {
               if (var33.field1847 != null) {
                  var1.vmethod435(
                     var33.field1847,
                     0,
                     var33.field1840 * 876965431,
                     var33.field1841 * 1186822141 - var33.field1838 * 218008627,
                     var33.field1839 * -502239712,
                     var33.field1844
                  );
               }

               if (var33.field1845 != null) {
                  var1.vmethod435(
                     var33.field1845,
                     0,
                     var33.field1840 * -892202585,
                     var33.field1841 * 1186822141 - var33.field1838 * 218008627,
                     var33.field1839 * -312810684,
                     var33.field1844
                  );
               }

               if (var33.field1846 != null) {
                  var1.vmethod435(
                     var33.field1846,
                     0,
                     var33.field1840 * 1020081250,
                     var33.field1841 * 961145992 - var33.field1838 * -949399200,
                     var33.field1839 * -1209739927,
                     var33.field1844
                  );
               }
            }

            if (var4.field1966 * 1986405177 != 0) {
               WallDecoration var40 = var4.field1971;
               if (var40 != null && !method4378(this, var8, var5, var6, var40.field2279.field1743 * -1256242689)) {
                  if ((var40.field2276 * 254285683 & var4.field1966 * 1986405177) != 0) {
                     var1.vmethod435(
                        var40.field2279,
                        0,
                        var40.field2270 * 1481322256 + var40.field2267 * -404927711,
                        var40.field2268 * 1698079433,
                        var40.field2275 * -361702377 + var40.field2273 * -1127816319,
                        var40.field2266 * -3608662145112923099L
                     );
                  } else if (var40.field2276 * 254285683 == -567230744) {
                     int var51 = var40.field2270 * -4263128 - this.field2118;
                     int var58 = var40.field2275 * -361702377 - this.field2116;
                     int var62 = var40.field2269 * -671066975;
                     int var68;
                     if (var62 != 1 && var62 != 2) {
                        var68 = var51;
                     } else {
                        var68 = -var51;
                     }

                     int var77;
                     if (var62 != 2 && var62 != 3) {
                        var77 = var58;
                     } else {
                        var77 = -var58;
                     }

                     if (var77 >= var68) {
                        var1.vmethod435(
                           var40.field2279,
                           0,
                           var40.field2270 * 2011931484 + var40.field2267 * 745550696,
                           var40.field2268 * 1787470087,
                           var40.field2275 * -361702377 + var40.field2273 * -348664289,
                           var40.field2266 * -3608662145112923099L
                        );
                     } else if (var40.field2278 != null) {
                        var1.vmethod435(
                           var40.field2278,
                           0,
                           var40.field2270 * -211985042 + var40.field2272 * -1085897215,
                           var40.field2268 * 1698079433,
                           var40.field2275 * -868527098 + var40.field2271 * 513256357,
                           var40.field2266 * -3608662145112923099L
                        );
                     }
                  }
               }

               BoundaryObject var52 = var4.field1970;
               if (var52 != null) {
                  if ((var52.field2243 * -1413337351 & var4.field1966 * 1986405177) != 0 && !this.method4375(var8, var5, var6, var52.field2243 * 193767008)) {
                     var1.vmethod435(
                        var52.field2248,
                        0,
                        var52.field2244 * 118037168,
                        var52.field2242 * 411396686,
                        var52.field2245 * -16623385,
                        var52.field2240 * 7159317397185328723L
                     );
                  }

                  if ((var52.field2246 * 1548562339 & var4.field1966 * 1986405177) != 0 && !this.method4375(var8, var5, var6, var52.field2246 * 1548562339)) {
                     var1.vmethod435(
                        var52.field2249,
                        0,
                        var52.field2244 * -777838807,
                        var52.field2242 * -517437493,
                        var52.field2245 * -1045252521,
                        var52.field2240 * 7159317397185328723L
                     );
                  }
               }
            }

            if (var7 < this.field2059 - 1) {
               classEW var41 = this.field2058[var7 + 1][var5][var6];
               if (var41 != null && var41.field1976) {
                  classNN.method7900(this.field2049, var41);
               }
            }

            if (var5 < this.field2114 && var5 >= this.field2120 && var5 < this.field2123 - 1) {
               classEW var42 = var9[var5 + 1][var6];
               if (var42 != null && var42.field1976) {
                  classNN.method7900(this.field2049, var42);
               }
            }

            if (var6 < this.field2124 && var6 >= this.field2113 && var6 < this.field2122 - 1) {
               classEW var43 = var9[var5][var6 + 1];
               if (var43 != null && var43.field1976) {
                  classNN.method7900(this.field2049, var43);
               }
            }

            if (var5 > this.field2114 && var5 > this.field2120 && var5 < this.field2123) {
               classEW var44 = var9[var5 - 1][var6];
               if (var44 != null && var44.field1976) {
                  classNN.method7900(this.field2049, var44);
               }
            }

            if (var6 > this.field2124 && var6 > this.field2113 && var6 < this.field2122) {
               classEW var45 = var9[var5][var6 - 1];
               if (var45 != null && var45.field1976) {
                  classNN.method7900(this.field2049, var45);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)V")
   @ObfuscatedName("uq")
   public static void method4212(Scene var0, int var1, int var2, int var3) {
      classEW var4 = var0.field2058[var1][var2][var3];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.field1963 * -389646721; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = var6.field2185 * 1745853678706228013L;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2188 * 1138017605 == var2 && var6.field2194 * 1819687021 == var3) {
               var0.method4359(var6);
               return;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)I")
   @ObfuscatedName("mc")
   public static int method4248(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4167(var1, var1, var1);
      }

      return (
            var0.field2060[var1][var2][var3]
               + var0.field2060[var1][var2 + 1][var3]
               + var0.field2060[var1][var2][var3 + 1]
               + var0.field2060[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("xt")
   public static int method4454(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIII)Z")
   @ObfuscatedName("jo")
   static boolean method4284(BitSet var0, int var1, int var2, int var3, int var4) {
      return var0.get(var1 * field2132 + var2 * field2134 + var3 * field2127 + var4);
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lew;)V")
   @ObfuscatedName("ls")
   void method4362(Projection var1, classEW var2) {
      if (var2 != null) {
         int var3 = var2.field1952 * -54806681;
         int var4 = var2.field1957 * -2067052011;
         int var5 = var2.field1949 * 1483076705;
         int var6 = var2.field1950 * 1938198001;
         if (var2.field1949 * -1270672859 == 0 && var2.field1969 != null) {
            this.method4444(var1, var2.field1969);
         }

         if (var2.field1972 != null) {
            if (!this.method4374(var6, var3, var4) && (var2.field1972.field2286 * 372976130 != -626353109 || var5 <= this.field2044)) {
               var1.vmethod426(this, var2.field1972, var6, var3, var4, 874226372);
            }
         } else if (var2.field1973 != null && !this.method4374(var6, var3, var4)) {
            var1.vmethod431(this, var2.field1973, var3, var4, 1484234154);
         }

         BoundaryObject var7 = var2.field1970;
         if (var7 != null) {
            if (var7.field2249 != null && !this.method4375(var6, var3, var4, var7.field2246 * 1548562339)) {
               var1.vmethod435(
                  var7.field2249, 0, var7.field2244 * -777838807, var7.field2242 * 1315862339, var7.field2245 * 31139801, var7.field2240 * 7159317397185328723L
               );
            }

            if (var7.field2248 != null && !this.method4375(var6, var3, var4, var7.field2243 * -1748397631)) {
               var1.vmethod435(
                  var7.field2248, 0, var7.field2244 * -777838807, var7.field2242 * 1315862339, var7.field2245 * 31139801, var7.field2240 * 7159317397185328723L
               );
            }
         }

         WallDecoration var8 = var2.field1971;
         if (var8 != null && !method4378(this, var6, var3, var4, var8.field2279.field1743 * -1256242689)) {
            if (var8.field2276 * 254285683 == 256) {
               var1.vmethod435(
                  var8.field2279,
                  0,
                  var8.field2270 * 1766830743 + var8.field2267 * -1373468864,
                  var8.field2268 * -1257265268,
                  var8.field2275 * 1115068667 + var8.field2273 * -963605192,
                  var8.field2266 * -3608662145112923099L
               );
               if (var8.field2278 != null) {
                  var1.vmethod435(
                     var8.field2278,
                     0,
                     var8.field2270 * 1766830743 + var8.field2272 * 1683764072,
                     var8.field2268 * 1698079433,
                     var8.field2275 * -361702377 + var8.field2271 * 513256357,
                     var8.field2266 * -3608662145112923099L
                  );
               }
            } else {
               var1.vmethod435(
                  var8.field2279,
                  0,
                  var8.field2270 * 1766830743 + var8.field2267 * 1385947540,
                  var8.field2268 * -607784492,
                  var8.field2275 * -361702377 + var8.field2273 * 856605829,
                  var8.field2266 * -3608662145112923099L
               );
            }
         }

         FloorDecoration var9 = var2.field1967;
         if (var9 != null) {
            var1.vmethod435(
               var9.field1816, 0, var9.field1806 * 1333275141, var9.field1807 * -276908185, var9.field1808 * 498815127, var9.field1815 * 5132338419383099835L
            );
         }

         ItemLayer var10 = var2.field1968;
         if (var10 != null) {
            if (var10.field1847 != null) {
               var1.vmethod435(
                  var10.field1847,
                  0,
                  var10.field1840 * -2078253856,
                  var10.field1841 * 1186822141 - var10.field1838 * -1224490135,
                  var10.field1839 * 1484661171,
                  var10.field1844
               );
            }

            if (var10.field1845 != null) {
               var1.vmethod435(
                  var10.field1845,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * 1251483933,
                  var10.field1844
               );
            }

            if (var10.field1846 != null) {
               var1.vmethod435(
                  var10.field1846,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }
         }

         for (int var11 = 0; var11 < var2.field1963 * -389646721; var11++) {
            GameObject var12 = var2.field1951[var11];
            var12.field2197 = this.field2065 * 132222543;
            if (var12.field2188 * 1138017605 == var2.field1952 * -416180782
               && var12.field2194 * 695646168 == var2.field1957 * -2067052011
               && !this.method4381(
                  var6,
                  var12.field2188 * -1635386907,
                  var12.field2186 * 304142753,
                  var12.field2194 * 1148163100,
                  var12.field2192 * -1819860113,
                  var12.field2200.field1743 * -1256242689
               )) {
               try {
                  var1.vmethod435(
                     var12.field2200,
                     var12.field2189 * 1478041859,
                     var12.field2195 * -1405731525,
                     var12.field2190 * 1689974509,
                     var12.field2196 * -1706390585,
                     var12.field2185 * 1745853678706228013L
                  );
               } catch (Exception var15) {
               }
            }
         }

         if (var2.method4092((short)16115)) {
            for (int var16 = 0; var16 < var2.field1955.size(); var16++) {
               GameObject var17 = (GameObject)var2.field1955.get(var16);
               var17.field2197 = this.field2065 * 132222543;
               if (!this.method4381(
                  var6,
                  var2.field1952 * 929582739,
                  var2.field1952 * -629641082,
                  var2.field1957 * -2067052011,
                  var2.field1957 * -2067052011,
                  var17.field2200.field1743 * -1256242689
               )) {
                  try {
                     var1.vmethod435(
                        var17.field2200,
                        var17.field2189 * 470594389,
                        var17.field2195 * 628172248,
                        var17.field2190 * -1471224767,
                        var17.field2196 * -1706390585,
                        var17.field2185 * 1745853678706228013L
                     );
                  } catch (Exception var14) {
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;III)I")
   @ObfuscatedName("zl")
   public static int method4249(Scene var0, int var1, int var2, int var3) {
      return var0 == null
         ? var0.method4493(var1, var1, var1)
         : (
               var0.field2060[var1][var2][var3]
                  + var0.field2060[var1][var2 + 1][var3]
                  + var0.field2060[var1][var2][var3 + 1]
                  + var0.field2060[var1][var2 + 1][var3 + 1]
            )
            / 4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Ler;III)V")
   @ObfuscatedName("hu")
   public static void method4237(Scene var0, ModelData var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method4208(var2, var2, var2);
      } else {
         int var6 = var3 + 1;
         int var7 = var4 - 1;
         int var8 = var4 + 1;

         for (int var9 = var3; var9 <= var6; var9++) {
            if (var9 >= 0 && var9 < var0.field2056) {
               for (int var10 = var7; var10 <= var8; var10++) {
                  if (var10 >= 0 && var10 < var0.field2032 && (var9 >= var6 || var10 >= var8)) {
                     classEW var11 = var0.field2058[var2][var9][var10];
                     if (var11 != null && var11.field1967 != null && var11.field1967.field1816 instanceof ModelData) {
                        int var12 = method4240(var0, var2, var9, var10, var2, var3, var4);
                        ModelData var13 = (ModelData)var11.field1967.field1816;
                        ModelData.method3961(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lew;)V")
   @ObfuscatedName("lk")
   void method4363(Projection var1, classEW var2) {
      if (var2 != null) {
         int var3 = var2.field1952 * -54806681;
         int var4 = var2.field1957 * -2067052011;
         int var5 = var2.field1949 * 1483076705;
         int var6 = var2.field1950 * 800564741;
         if (var2.field1949 * 1483076705 == 0 && var2.field1969 != null) {
            this.method4444(var1, var2.field1969);
         }

         if (var2.field1972 != null) {
            if (!this.method4374(var6, var3, var4) && (var2.field1972.field2286 * -665850825 != 12345678 || var5 <= this.field2044)) {
               var1.vmethod426(this, var2.field1972, var6, var3, var4, 1178341524);
            }
         } else if (var2.field1973 != null && !this.method4374(var6, var3, var4)) {
            var1.vmethod431(this, var2.field1973, var3, var4, 1886840969);
         }

         BoundaryObject var7 = var2.field1970;
         if (var7 != null) {
            if (var7.field2249 != null && !this.method4375(var6, var3, var4, var7.field2246 * 1548562339)) {
               var1.vmethod435(
                  var7.field2249, 0, var7.field2244 * -777838807, var7.field2242 * 1315862339, var7.field2245 * 31139801, var7.field2240 * 7159317397185328723L
               );
            }

            if (var7.field2248 != null && !this.method4375(var6, var3, var4, var7.field2243 * -1413337351)) {
               var1.vmethod435(
                  var7.field2248, 0, var7.field2244 * -777838807, var7.field2242 * 1315862339, var7.field2245 * 31139801, var7.field2240 * 7159317397185328723L
               );
            }
         }

         WallDecoration var8 = var2.field1971;
         if (var8 != null && !method4378(this, var6, var3, var4, var8.field2279.field1743 * -1256242689)) {
            if (var8.field2276 * 254285683 == 256) {
               var1.vmethod435(
                  var8.field2279,
                  0,
                  var8.field2270 * 1766830743 + var8.field2267 * -404927711,
                  var8.field2268 * 1698079433,
                  var8.field2275 * -361702377 + var8.field2273 * 856605829,
                  var8.field2266 * -3608662145112923099L
               );
               if (var8.field2278 != null) {
                  var1.vmethod435(
                     var8.field2278,
                     0,
                     var8.field2270 * 1766830743 + var8.field2272 * -1085897215,
                     var8.field2268 * 1698079433,
                     var8.field2275 * -361702377 + var8.field2271 * 513256357,
                     var8.field2266 * -3608662145112923099L
                  );
               }
            } else {
               var1.vmethod435(
                  var8.field2279,
                  0,
                  var8.field2270 * 1766830743 + var8.field2267 * -404927711,
                  var8.field2268 * 1698079433,
                  var8.field2275 * -361702377 + var8.field2273 * 856605829,
                  var8.field2266 * -3608662145112923099L
               );
            }
         }

         FloorDecoration var9 = var2.field1967;
         if (var9 != null) {
            var1.vmethod435(
               var9.field1816, 0, var9.field1806 * 1333275141, var9.field1807 * -276908185, var9.field1808 * 498815127, var9.field1815 * 5132338419383099835L
            );
         }

         ItemLayer var10 = var2.field1968;
         if (var10 != null) {
            if (var10.field1847 != null) {
               var1.vmethod435(
                  var10.field1847,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }

            if (var10.field1845 != null) {
               var1.vmethod435(
                  var10.field1845,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }

            if (var10.field1846 != null) {
               var1.vmethod435(
                  var10.field1846,
                  0,
                  var10.field1840 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }
         }

         for (int var11 = 0; var11 < var2.field1963 * -389646721; var11++) {
            GameObject var12 = var2.field1951[var11];
            var12.field2197 = this.field2065 * 132222543;
            if (var12.field2188 * 1138017605 == var2.field1952 * -54806681
               && var12.field2194 * -555977777 == var2.field1957 * -2067052011
               && !this.method4381(
                  var6,
                  var12.field2188 * 1138017605,
                  var12.field2186 * 304142753,
                  var12.field2194 * -555977777,
                  var12.field2192 * -544424899,
                  var12.field2200.field1743 * -1256242689
               )) {
               try {
                  var1.vmethod435(
                     var12.field2200,
                     var12.field2189 * 470594389,
                     var12.field2195 * -1405731525,
                     var12.field2190 * 1269801851,
                     var12.field2196 * -1706390585,
                     var12.field2185 * 1745853678706228013L
                  );
               } catch (Exception var15) {
               }
            }
         }

         if (var2.method4092((short)1181)) {
            for (int var16 = 0; var16 < var2.field1955.size(); var16++) {
               GameObject var17 = (GameObject)var2.field1955.get(var16);
               var17.field2197 = this.field2065 * 132222543;
               if (!this.method4381(
                  var6,
                  var2.field1952 * -54806681,
                  var2.field1952 * -54806681,
                  var2.field1957 * -2067052011,
                  var2.field1957 * -2067052011,
                  var17.field2200.field1743 * -1256242689
               )) {
                  try {
                     var1.vmethod435(
                        var17.field2200,
                        var17.field2189 * 470594389,
                        var17.field2195 * -1405731525,
                        var17.field2190 * 1269801851,
                        var17.field2196 * -1706390585,
                        var17.field2185 * 1745853678706228013L
                     );
                  } catch (Exception var14) {
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;IZ)V")
   @ObfuscatedName("vj")
   public void method4468(Projection var1, int var2, boolean var3) {
      this.method4404(var2);

      label669:
      while (true) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var10;
         int var11;
         int var12;
         while (true) {
            var4 = this.method4391();
            if (var4 == this.field2002) {
               return;
            }

            if (this.method4435(var4)) {
               var5 = var4 >> this.field1995 & this.field1997;
               var6 = var4 & this.field1998;
               var7 = var4 >> this.field1996 & 3;
               var8 = this.method4423(var4);
               int var9 = this.method4396(var4);
               var10 = var5 - this.field2147;
               var11 = var6 - this.field2147;
               var12 = this.field2005[var4];
               if (!this.method4450(var4)) {
                  break;
               }

               if (var3) {
                  if (var7 > 0) {
                     int var13 = var4 - this.field1999;
                     if (this.method4389(var13) && this.method4435(var13)) {
                        continue;
                     }
                  }

                  if (var5 <= this.field2114 && var5 > this.field2120) {
                     int var25 = var4 - this.field2000;
                     if (this.method4389(var25) && this.method4435(var25) && (this.method4450(var25) || (this.field2015[var4] & 1) == 0)) {
                        continue;
                     }
                  }

                  if (var5 >= this.field2114 && var5 < this.field2123 - 1) {
                     int var26 = var4 + this.field2000;
                     if (this.method4389(var26) && this.method4435(var26) && (this.method4450(var26) || (this.field2015[var4] & 4) == 0)) {
                        continue;
                     }
                  }

                  if (var6 <= this.field2124 && var6 > this.field2113) {
                     int var27 = var4 - this.field2001;
                     if (this.method4389(var27) && this.method4435(var27) && (this.method4450(var27) || (this.field2015[var4] & 8) == 0)) {
                        continue;
                     }
                  }

                  if (var6 >= this.field2124 && var6 < this.field2122 - 1) {
                     int var28 = var4 + this.field2001;
                     if (this.method4389(var28) && this.method4435(var28) && (this.method4450(var28) || (this.field2015[var4] & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var3 = true;
               }

               var12 = this.field2005[var4] = this.field2005[var4] & -3;
               if ((var12 & 32) != 0) {
                  int var29 = this.method4489(3, var5, var6);
                  int var14 = this.field2005[var29];
                  if ((var14 & 256) != 0) {
                     if (!this.method4523(0, var5, var6)) {
                        var1.method5033(this, this.field2006[var29], 0, 0, var10, var11);
                     }
                  } else if ((var14 & 1024) != 0 && !this.method4523(0, var5, var6)) {
                     var1.method5032(this, this.field2007[var29], 0, var10, var11);
                  }

                  if ((var14 & 16384) != 0) {
                     BoundaryObject var15 = this.field2008[var29];
                     this.method4490(
                        var1,
                        var15.field2249,
                        0,
                        var15.field2244 * -777838807,
                        var15.field2242 * 1315862339,
                        var15.field2245 * 31139801,
                        var15.field2240 * 7159317397185328723L
                     );
                  }

                  for (int var54 = 0; var54 < this.field2012[var29]; var54++) {
                     GameObject var16 = this.field2013[var29 * 5 + var54];
                     if (var16 != null) {
                        this.method4490(
                           var1,
                           var16.field2200,
                           var16.field2189 * 470594389,
                           var16.field2195 * -1405731525,
                           var16.field2190 * 1269801851,
                           var16.field2196 * -1706390585,
                           var16.field2185 * 1745853678706228013L
                        );
                     }
                  }
               }

               boolean var30 = false;
               if ((var12 & 256) != 0) {
                  if (!this.method4523(var8, var5, var6)) {
                     var30 = true;
                     if ((var12 & 512) != 0 || var7 <= this.field2044) {
                        SceneTilePaint var45 = this.field2006[var4];
                        var1.method5033(this, var45, var9, var8, var10, var11);
                     }
                  }
               } else if ((var12 & 1024) != 0 && !this.method4523(var8, var5, var6)) {
                  var30 = true;
                  var1.method5032(this, this.field2007[var4], var9, var10, var11);
               }

               int var46 = 0;
               int var55 = 0;
               int var61 = 0;
               if ((var12 & 49152) != 0) {
                  if (var5 == this.field2114) {
                     var46++;
                  } else if (this.field2114 < var5) {
                     var46 += 2;
                  }

                  if (var6 == this.field2124) {
                     var46 += 3;
                  } else if (this.field2124 > var6) {
                     var46 += 6;
                  }

                  var55 = field2070[var46];
                  int var17 = field2079[var46];
                  this.method4448(var4, var17);
                  var61 = field2067[var46];

                  assert (~(var55 | var17) & 0xFF) == var61;
               }

               if ((var12 & 16384) != 0) {
                  BoundaryObject var68 = this.field2008[var4];
                  if ((var68.field2246 * 1548562339 & var61) != 0) {
                     byte var18;
                     int var19;
                     switch (var68.field2246 * 1548562339) {
                        case 16:
                           var18 = 3;
                           var19 = field2080[var46];
                           break;
                        case 32:
                           var18 = 6;
                           var19 = field2068[var46];
                           break;
                        case 64:
                           var18 = 12;
                           var19 = field2082[var46];
                           break;
                        case 128:
                           var18 = 9;
                           var19 = field2083[var46];
                           break;
                        default:
                           throw new IllegalStateException();
                     }

                     this.method4433(var4, var18);
                     this.method4484(var4, var19);

                     assert (var18 ^ var19) == var18 - var19;

                     var12 = this.field2005[var4] = this.field2005[var4] | 16;
                  }

                  if ((var68.field2246 * 1548562339 & var55) != 0 && !this.method4521(var8, var5, var6, var68.field2246 * 1548562339)) {
                     this.method4490(
                        var1,
                        var68.field2249,
                        0,
                        var68.field2244 * -777838807,
                        var68.field2242 * 1315862339,
                        var68.field2245 * 31139801,
                        var68.field2240 * 7159317397185328723L
                     );
                  }

                  if ((var68.field2243 * -1413337351 & var55) != 0 && !this.method4521(var8, var5, var6, var68.field2243 * -1413337351)) {
                     this.method4490(
                        var1,
                        var68.field2248,
                        0,
                        var68.field2244 * -777838807,
                        var68.field2242 * 1315862339,
                        var68.field2245 * 31139801,
                        var68.field2240 * 7159317397185328723L
                     );
                  }
               }

               if ((var12 & 32768) != 0) {
                  WallDecoration var69 = this.field2009[var4];
                  if (!this.method4509(var8, var5, var6, var69.field2279.field1743 * -1256242689)) {
                     if ((var69.field2276 * 254285683 & var55) != 0) {
                        this.method4490(
                           var1,
                           var69.field2279,
                           0,
                           var69.field2270 * 1766830743 + var69.field2267 * -404927711,
                           var69.field2268 * 1698079433,
                           var69.field2275 * -361702377 + var69.field2273 * 856605829,
                           var69.field2266 * -3608662145112923099L
                        );
                     } else if (var69.field2276 * 254285683 == 256) {
                        int var77 = var69.field2270 * 1766830743 - this.field2118;
                        int var86 = var69.field2275 * -361702377 - this.field2116;
                        int var20 = var69.field2269 * -819410985;
                        int var21;
                        if (var20 != 1 && var20 != 2) {
                           var21 = var77;
                        } else {
                           var21 = -var77;
                        }

                        int var22;
                        if (var20 != 2 && var20 != 3) {
                           var22 = var86;
                        } else {
                           var22 = -var86;
                        }

                        if (var22 < var21) {
                           this.method4490(
                              var1,
                              var69.field2279,
                              0,
                              var69.field2270 * 1766830743 + var69.field2267 * -404927711,
                              var69.field2268 * 1698079433,
                              var69.field2275 * -361702377 + var69.field2273 * 856605829,
                              var69.field2266 * -3608662145112923099L
                           );
                        } else if (var69.field2278 != null) {
                           this.method4490(
                              var1,
                              var69.field2278,
                              0,
                              var69.field2270 * 1766830743 + var69.field2272 * -1085897215,
                              var69.field2268 * 1698079433,
                              var69.field2275 * -361702377 + var69.field2271 * 513256357,
                              var69.field2266 * -3608662145112923099L
                           );
                        }
                     }
                  }
               }

               if (var30) {
                  if ((this.field2005[var4] & 2048) != 0) {
                     FloorDecoration var70 = this.field2010[var4];
                     this.method4490(
                        var1,
                        var70.field1816,
                        0,
                        var70.field1806 * 1333275141,
                        var70.field1807 * -276908185,
                        var70.field1808 * 498815127,
                        var70.field1815 * 5132338419383099835L
                     );
                  }

                  if ((this.field2005[var4] & 4096) != 0) {
                     ItemLayer var71 = this.field2011[var4];
                     if (var71.field1847 != null) {
                        this.method4490(
                           var1, var71.field1847, 0, var71.field1840 * -892202585, var71.field1841 * 1186822141, var71.field1839 * -1209739927, var71.field1844
                        );
                     }

                     if (var71.field1845 != null) {
                        this.method4490(
                           var1, var71.field1845, 0, var71.field1840 * -892202585, var71.field1841 * 1186822141, var71.field1839 * -1209739927, var71.field1844
                        );
                     }

                     if (var71.field1846 != null) {
                        this.method4490(
                           var1, var71.field1846, 0, var71.field1840 * -892202585, var71.field1841 * 1186822141, var71.field1839 * -1209739927, var71.field1844
                        );
                     }
                  }
               }

               byte var72 = this.field2015[var4];
               if (var5 < this.field2114 && var5 >= this.field2120 && var5 < this.field2123 - 1 && (var72 & 4) != 0) {
                  int var78 = var4 + this.field2000;
                  if (this.method4389(var78) && this.method4435(var78)) {
                     this.method4404(var78);
                  }
               }

               if (var6 < this.field2124 && var6 >= this.field2113 && var6 < this.field2122 - 1 && (var72 & 2) != 0) {
                  int var79 = var4 + this.field2001;
                  if (this.method4389(var79) && this.method4435(var79)) {
                     this.method4404(var79);
                  }
               }

               if (var5 > this.field2114 && var5 > this.field2120 && var5 < this.field2123 && (var72 & 1) != 0) {
                  int var80 = var4 - this.field2000;
                  if (this.method4389(var80) && this.method4435(var80)) {
                     this.method4404(var80);
                  }
               }

               if (var6 > this.field2124 && var6 > this.field2113 && var6 < this.field2122 && (var72 & 8) != 0) {
                  int var81 = var4 - this.field2001;
                  if (this.method4389(var81) && this.method4435(var81)) {
                     this.method4404(var81);
                  }
               }
               break;
            }
         }

         if ((var12 & 16) != 0) {
            boolean var31 = true;

            for (int var47 = 0; var47 < this.field2012[var4]; var47++) {
               GameObject var56 = this.field2013[var4 * 5 + var47];
               byte var62 = this.field2014[var4 * 5 + var47];
               if (var56.field2197 * 163498159 != this.field2065 && (var62 & this.method4403(var4)) == this.method4458(var4)) {
                  var31 = false;
                  break;
               }
            }

            if (var31) {
               BoundaryObject var48 = this.field2008[var4];
               if (!this.method4521(var8, var5, var6, var48.field2246 * 1548562339)) {
                  this.method4490(
                     var1,
                     var48.field2249,
                     0,
                     var48.field2244 * -777838807,
                     var48.field2242 * 1315862339,
                     var48.field2245 * 31139801,
                     var48.field2240 * 7159317397185328723L
                  );
               }

               var12 = this.field2005[var4] = this.field2005[var4] & -17;
            }
         }

         if ((var12 & 8) != 0) {
            try {
               var12 = this.field2005[var4] = this.field2005[var4] & -9;
               int var32 = 0;

               label614:
               for (int var49 = 0; var49 < this.field2012[var4]; var49++) {
                  GameObject var57 = this.field2013[var4 * 5 + var49];
                  if (var57.field2197 * 163498159 != this.field2065) {
                     for (int var63 = var57.field2188 * 1138017605; var63 <= var57.field2186 * 304142753; var63++) {
                        for (int var73 = var57.field2194 * -555977777; var73 <= var57.field2192 * -544424899; var73++) {
                           int var82 = var63 + this.field2147;
                           int var87 = var73 + this.field2147;
                           int var90 = this.method4489(var7, var82, var87);
                           if (this.method4450(var90)) {
                              var12 = this.field2005[var4] = this.field2005[var4] | 8;
                              continue label614;
                           }

                           if ((this.field2005[var90] & 16) != 0) {
                              byte var93 = 0;
                              if (var63 > var57.field2188 * 1138017605) {
                                 var93 |= 1;
                              }

                              if (var63 < var57.field2186 * 304142753) {
                                 var93 |= 4;
                              }

                              if (var73 > var57.field2194 * -555977777) {
                                 var93 |= 8;
                              }

                              if (var73 < var57.field2192 * -544424899) {
                                 var93 |= 2;
                              }

                              int var96 = this.method4403(var4) ^ this.method4458(var4);
                              if ((var93 & this.method4403(var90)) == var96) {
                                 var12 = this.field2005[var4] = this.field2005[var4] | 8;
                                 continue label614;
                              }
                           }
                        }
                     }

                     assert var32 < 5;

                     this.field2025[var32++] = var57;
                     var57.field2191 = this.method4497(var57, this.field2114 - this.field2147, this.field2124 - this.field2147) * -1227421221;
                  }
               }

               if ((var12 & 128) != 0) {
                  rl17 var50 = this.field2020[var5 >> 3][var6 >> 3];

                  for (int var58 = 0; var58 < var50.field5706.size(); var58++) {
                     GameObject var64 = (GameObject)var50.field5706.get(var58);
                     if (var64.field2200 instanceof ActorSpotAnim
                        && var64.field2197 * 163498159 != this.field2065
                        && var64.field2188 * 1138017605 == var10
                        && var64.field2194 * -555977777 == var11
                        && var32 < 55) {
                        assert var32 < 55;

                        this.field2025[var32++] = var64;
                        var64.field2191 = this.method4497(var64, this.field2114 - this.field2147, this.field2124 - this.field2147) * -1227421221;
                     }
                  }
               }

               while (true) {
                  int var51 = -50;
                  int var59 = -1;

                  for (int var65 = 0; var65 < var32; var65++) {
                     GameObject var74 = this.field2025[var65];
                     if (var74.field2197 * 163498159 != this.field2065) {
                        if (var74.field2191 * 835963475 > var51) {
                           var51 = var74.field2191 * 835963475;
                           var59 = var65;
                        } else if (var51 == var74.field2191 * 835963475) {
                           int var83 = var74.field2195 * -1405731525 - this.field2118;
                           int var88 = var74.field2196 * -1706390585 - this.field2116;
                           int var91 = this.field2025[var59].field2195 * -1405731525 - this.field2118;
                           int var94 = this.field2025[var59].field2196 * -1706390585 - this.field2116;
                           if (var83 * var83 + var88 * var88 > var91 * var91 + var94 * var94) {
                              var59 = var65;
                           }
                        }
                     }
                  }

                  if (var59 == -1) {
                     if ((var12 & 8) != 0) {
                        continue label669;
                     }
                     break;
                  }

                  GameObject var66 = this.field2025[var59];
                  var66.field2197 = this.field2065 * 132222543;
                  this.method4490(
                     var1,
                     var66.field2200,
                     var66.field2189 * 470594389,
                     var66.field2195 * -1405731525,
                     var66.field2190 * 1269801851,
                     var66.field2196 * -1706390585,
                     var66.field2185 * 1745853678706228013L
                  );

                  for (int var75 = var66.field2188 * 1138017605; var75 <= var66.field2186 * 304142753; var75++) {
                     for (int var84 = var66.field2194 * -555977777; var84 <= var66.field2192 * -544424899; var84++) {
                        int var89 = var75 + this.field2147;
                        int var92 = var84 + this.field2147;
                        int var95 = this.method4489(var7, var89, var92);
                        if ((this.field2005[var95] & 16) != 0) {
                           this.method4404(var95);
                        } else if ((var89 != var5 || var92 != var6) && this.method4435(var95)) {
                           this.method4404(var95);
                        }
                     }
                  }
               }
            } catch (Exception var23) {
               client.field1026.debug("exception drawing game entity", var23);
               var12 = this.field2005[var4] = this.field2005[var4] & -9;
            }
         }

         if (!this.method4435(var4)) {
            assert false : "tile needs backside draw";
         } else if ((var12 & 16) == 0) {
            if (var5 <= this.field2114 && var5 > this.field2120) {
               int var33 = var4 - this.field2000;
               if (this.method4389(var33) && this.method4435(var33)) {
                  continue;
               }
            }

            if (var5 >= this.field2114 && var5 < this.field2123 - 1) {
               int var34 = var4 + this.field2000;
               if (this.method4389(var34) && this.method4435(var34)) {
                  continue;
               }
            }

            if (var6 <= this.field2124 && var6 > this.field2113) {
               int var35 = var4 - this.field2001;
               if (this.method4389(var35) && this.method4435(var35)) {
                  continue;
               }
            }

            if (var6 >= this.field2124 && var6 < this.field2122 - 1) {
               int var36 = var4 + this.field2001;
               if (this.method4389(var36) && this.method4435(var36)) {
                  continue;
               }
            }

            var12 = this.field2005[var4] = this.field2005[var4] & -5;
            this.field2041--;
            if ((var12 & 8192) != 0) {
               ItemLayer var37 = this.field2011[var4];
               if (var37.field1847 != null) {
                  this.method4490(
                     var1,
                     var37.field1847,
                     0,
                     var37.field1840 * -892202585,
                     var37.field1841 * 1186822141 - var37.field1838 * 218008627,
                     var37.field1839 * -1209739927,
                     var37.field1844
                  );
               }

               if (var37.field1845 != null) {
                  this.method4490(
                     var1,
                     var37.field1845,
                     0,
                     var37.field1840 * -892202585,
                     var37.field1841 * 1186822141 - var37.field1838 * 218008627,
                     var37.field1839 * -1209739927,
                     var37.field1844
                  );
               }

               if (var37.field1846 != null) {
                  this.method4490(
                     var1,
                     var37.field1846,
                     0,
                     var37.field1840 * -892202585,
                     var37.field1841 * 1186822141 - var37.field1838 * 218008627,
                     var37.field1839 * -1209739927,
                     var37.field1844
                  );
               }
            }

            if ((var12 & 49152) != 0 && this.method4460(var4) != 0) {
               if ((var12 & 32768) != 0) {
                  WallDecoration var38 = this.field2009[var4];
                  if (!this.method4509(var8, var5, var6, var38.field2279.field1743 * -1256242689)) {
                     if ((var38.field2276 * 254285683 & this.method4460(var4)) != 0) {
                        this.method4490(
                           var1,
                           var38.field2279,
                           0,
                           var38.field2270 * 1766830743 + var38.field2267 * -404927711,
                           var38.field2268 * 1698079433,
                           var38.field2275 * -361702377 + var38.field2273 * 856605829,
                           var38.field2266 * -3608662145112923099L
                        );
                     } else if (var38.field2276 * 254285683 == 256) {
                        int var52 = var38.field2270 * 1766830743 - this.field2118;
                        int var60 = var38.field2275 * -361702377 - this.field2116;
                        int var67 = var38.field2269 * -819410985;
                        int var76;
                        if (var67 != 1 && var67 != 2) {
                           var76 = var52;
                        } else {
                           var76 = -var52;
                        }

                        int var85;
                        if (var67 != 2 && var67 != 3) {
                           var85 = var60;
                        } else {
                           var85 = -var60;
                        }

                        if (var85 >= var76) {
                           this.method4490(
                              var1,
                              var38.field2279,
                              0,
                              var38.field2270 * 1766830743 + var38.field2267 * -404927711,
                              var38.field2268 * 1698079433,
                              var38.field2275 * -361702377 + var38.field2273 * 856605829,
                              var38.field2266 * -3608662145112923099L
                           );
                        } else if (var38.field2278 != null) {
                           this.method4490(
                              var1,
                              var38.field2278,
                              0,
                              var38.field2270 * 1766830743 + var38.field2272 * -1085897215,
                              var38.field2268 * 1698079433,
                              var38.field2275 * -361702377 + var38.field2271 * 513256357,
                              var38.field2266 * -3608662145112923099L
                           );
                        }
                     }
                  }
               }

               if ((var12 & 16384) != 0) {
                  BoundaryObject var39 = this.field2008[var4];
                  int var53 = this.method4460(var4);
                  if ((var39.field2243 * -1413337351 & var53) != 0 && !this.method4521(var8, var5, var6, var39.field2243 * -1413337351)) {
                     this.method4490(
                        var1,
                        var39.field2248,
                        0,
                        var39.field2244 * -777838807,
                        var39.field2242 * 1315862339,
                        var39.field2245 * 31139801,
                        var39.field2240 * 7159317397185328723L
                     );
                  }

                  if ((var39.field2246 * 1548562339 & var53) != 0 && !this.method4521(var8, var5, var6, var39.field2246 * 1548562339)) {
                     this.method4490(
                        var1,
                        var39.field2249,
                        0,
                        var39.field2244 * -777838807,
                        var39.field2242 * 1315862339,
                        var39.field2245 * 31139801,
                        var39.field2240 * 7159317397185328723L
                     );
                  }
               }
            }

            if (var7 < this.field2059 - 1) {
               int var40 = var4 + this.field1999;
               if (this.method4389(var40) && this.method4435(var40)) {
                  this.method4404(var40);
               }
            }

            if (var5 < this.field2114 && var5 >= this.field2120 && var5 < this.field2123 - 1) {
               int var41 = var4 + this.field2000;
               if (this.method4389(var41) && this.method4435(var41)) {
                  this.method4404(var41);
               }
            }

            if (var6 < this.field2124 && var6 >= this.field2113 && var6 < this.field2122 - 1) {
               int var42 = var4 + this.field2001;
               if (this.method4389(var42) && this.method4435(var42)) {
                  this.method4404(var42);
               }
            }

            if (var5 > this.field2114 && var5 > this.field2120 && var5 < this.field2123) {
               int var43 = var4 - this.field2000;
               if (this.method4389(var43) && this.method4435(var43)) {
                  this.method4404(var43);
               }
            }

            if (var6 > this.field2124 && var6 > this.field2113 && var6 < this.field2122) {
               int var44 = var4 - this.field2001;
               if (this.method4389(var44) && this.method4435(var44)) {
                  this.method4404(var44);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ler;IIIII)V")
   @ObfuscatedName("ie")
   void method4239(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for (int var12 = var2; var12 <= var2 + 1; var12++) {
         if (var12 != this.field2059) {
            for (int var13 = var8; var13 <= var9; var13++) {
               if (var13 >= 0 && var13 < this.field2056) {
                  for (int var14 = var10; var14 <= var11; var14++) {
                     if (var14 >= 0 && var14 < this.field2032 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        classEW var15 = this.field2058[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = method4240(this, var12, var13, var14, var2, var3, var4);
                           BoundaryObject var17 = var15.field1970;
                           if (var17 != null) {
                              if (var17.field2249 instanceof ModelData) {
                                 ModelData var18 = (ModelData)var17.field2249;
                                 ModelData.method3961(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field2248 instanceof ModelData) {
                                 ModelData var23 = (ModelData)var17.field2248;
                                 ModelData.method3961(var1, var23, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for (int var24 = 0; var24 < var15.field1963 * -389646721; var24++) {
                              GameObject var19 = var15.field1951[var24];
                              if (var19 != null && var19.field2200 instanceof ModelData) {
                                 ModelData var20 = (ModelData)var19.field2200;
                                 int var21 = var19.field2186 * 304142753 - var19.field2188 * 1138017605 + 1;
                                 int var22 = var19.field2192 * -544424899 - var19.field2194 * -555977777 + 1;
                                 ModelData.method3961(
                                    var1,
                                    var20,
                                    (var19.field2188 * 1138017605 - var3) * 128 + (var21 - var5) * 64,
                                    var16,
                                    (var19.field2194 * -555977777 - var4) * 128 + (var22 - var6) * 64,
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

   @ObfuscatedSignature(descriptor = "(Lfb;II)I")
   @ObfuscatedName("ld")
   int method4368(GameObject var1, int var2, int var3) {
      int var4 = var2 - var1.field2188 * 1138017605;
      int var5 = var1.field2186 * 304142753 - var2;
      if (var5 > var4) {
         var4 = var5;
      }

      int var6 = var3 - var1.field2194 * -555977777;
      int var7 = var1.field2192 * -544424899 - var3;
      return var7 > var6 ? var4 + var7 : var4 + var6;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lq")
   void method4372() {
      int var1 = this.field2063[this.field2027];
      classEP[] var2 = this.field2039[this.field2027];
      this.field2110 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         classEP var4 = var2[var3];
         if (var4.field1823 * -71966871 == 1) {
            int var14 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
            if (var14 >= 0 && var14 <= this.field2051 + this.field2051) {
               int var16 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
               if (var16 < 0) {
                  var16 = 0;
               }

               int var18 = var4.field1818 * -899751495 - this.field2124 + this.field2051;
               if (var18 > this.field2051 + this.field2051) {
                  var18 = this.field2051 + this.field2051;
               }

               boolean var20 = false;

               while (var16 <= var18) {
                  if (this.method4311(var14, var16++)) {
                     var20 = true;
                     break;
                  }
               }

               if (var20) {
                  int var22 = this.field2118 - var4.field1830 * -996295335;
                  if (var22 > 32) {
                     var4.field1825 = -307181543;
                  } else {
                     if (var22 >= -32) {
                        continue;
                     }

                     var4.field1825 = -614363086;
                     var22 = -var22;
                  }

                  var4.field1820 = (var4.field1819 * -832449137 - this.field2116 << 8) / var22 * -1015514901;
                  var4.field1828 = (var4.field1817 * -371025921 - this.field2116 << 8) / var22 * 306530981;
                  var4.field1831 = (var4.field1827 * 318014867 - this.field2119 << 8) / var22 * -1741242211;
                  var4.field1824 = (var4.field1826 * -971837087 - this.field2119 << 8) / var22 * -2051350499;
                  this.field2048[this.field2110++] = var4;
               }
            }
         } else if (var4.field1823 * -71966871 == 2) {
            int var13 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
            if (var13 >= 0 && var13 <= this.field2051 + this.field2051) {
               int var15 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
               if (var15 < 0) {
                  var15 = 0;
               }

               int var17 = var4.field1822 * -753584253 - this.field2114 + this.field2051;
               if (var17 > this.field2051 + this.field2051) {
                  var17 = this.field2051 + this.field2051;
               }

               boolean var19 = false;

               while (var15 <= var17) {
                  if (this.method4311(var15++, var13)) {
                     var19 = true;
                     break;
                  }
               }

               if (var19) {
                  int var21 = this.field2116 - var4.field1819 * -832449137;
                  if (var21 > 32) {
                     var4.field1825 = -921544629;
                  } else {
                     if (var21 >= -32) {
                        continue;
                     }

                     var4.field1825 = -1228726172;
                     var21 = -var21;
                  }

                  var4.field1833 = (var4.field1830 * -996295335 - this.field2118 << 8) / var21 * -1640466283;
                  var4.field1829 = (var4.field1832 * 1506923105 - this.field2118 << 8) / var21 * 323343539;
                  var4.field1831 = (var4.field1827 * 318014867 - this.field2119 << 8) / var21 * -1741242211;
                  var4.field1824 = (var4.field1826 * -971837087 - this.field2119 << 8) / var21 * -2051350499;
                  this.field2048[this.field2110++] = var4;
               }
            }
         } else if (var4.field1823 * -71966871 == 4) {
            int var5 = var4.field1827 * 318014867 - this.field2119;
            if (var5 > 128) {
               int var6 = var4.field1821 * -728017947 - this.field2124 + this.field2051;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = var4.field1818 * -899751495 - this.field2124 + this.field2051;
               if (var7 > this.field2051 + this.field2051) {
                  var7 = this.field2051 + this.field2051;
               }

               if (var6 <= var7) {
                  int var8 = var4.field1834 * 1062499071 - this.field2114 + this.field2051;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  int var9 = var4.field1822 * -753584253 - this.field2114 + this.field2051;
                  if (var9 > this.field2051 + this.field2051) {
                     var9 = this.field2051 + this.field2051;
                  }

                  boolean var10 = false;

                  label197:
                  for (int var11 = var8; var11 <= var9; var11++) {
                     for (int var12 = var6; var12 <= var7; var12++) {
                        if (this.method4311(var11, var12)) {
                           var10 = true;
                           break label197;
                        }
                     }
                  }

                  if (var10) {
                     var4.field1825 = -1535907715;
                     var4.field1833 = (var4.field1830 * -996295335 - this.field2118 << 8) / var5 * -1640466283;
                     var4.field1829 = (var4.field1832 * 1506923105 - this.field2118 << 8) / var5 * 323343539;
                     var4.field1820 = (var4.field1819 * -832449137 - this.field2116 << 8) / var5 * -1015514901;
                     var4.field1828 = (var4.field1817 * -371025921 - this.field2116 << 8) / var5 * 306530981;
                     this.field2048[this.field2110++] = var4;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("rl")
   public int method4489(int var1, int var2, int var3) {
      assert var1 >= 0 && var1 <= 3;

      assert var2 >= 0 && var2 < this.field2056;

      assert var3 >= 0 && var3 < this.field2032;

      return var1 << this.field1996 | var2 << this.field1995 | var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   public void method4479() {
      for (int var1 = 0; var1 < this.field2020.length; var1++) {
         for (int var2 = 0; var2 < this.field2020[var1].length; var2++) {
            rl17 var3 = this.field2020[var1][var2];

            for (int var4 = 0; var4 < var3.field5706.size(); var4++) {
               GameObject var5 = (GameObject)var3.field5706.get(var4);
               this.removeGameObject(var5);
               var5.field2200 = null;
               field2077.addLast(var5);
            }

            var3.field5706.clear();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ew")
   static final int method4143(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("km")
   public void method4332() {
      this.field2033 = true;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/BitSet;IIIIZ)Z")
   @ObfuscatedName("ci")
   static boolean method4288(BitSet var0, int var1, int var2, int var3, int var4, boolean var5) {
      var0.set(var1 * field2132 + var2 * field2134 + var3 * field2127 + var4, var5);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("ma")
   boolean method4383(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var3 && var4 == var5) {
         if (!this.method4374(var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return this.method4386(var13 + 1, this.field2060[var1][var2][var4] - var6, var15 + 1)
               && this.method4386(var13 + 128 - 1, this.field2060[var1][var2 + 1][var4] - var6, var15 + 1)
               && this.method4386(var13 + 128 - 1, this.field2060[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
               && this.method4386(var13 + 1, this.field2060[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (this.field2031[var1][var7][var8] == -this.field2065) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = this.field2060[var1][var2][var4] - var6;
         if (!this.method4386(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method4386(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !this.method4386(var12, var9, var11) ? false : this.method4386(var10, var9, var11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lex;)V")
   @ObfuscatedName("ia")
   public void method4256(classEX var1) {
      if (var1 != this.field2052) {
         this.field2052 = var1;
         method4304(field2072, field2130, field2126, field2135, field2131);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lee;IIIIJ)V")
   @ObfuscatedName("pi")
   public void method4490(Projection var1, Renderable var2, int var3, int var4, int var5, int var6, long var7) {
      var1.method5037(var2, var3, var4, var5, var6, var7);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("mp")
   boolean method4384(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var3 && var4 == var5) {
         if (!this.method4374(var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return this.method4386(var13 + 1, this.field2060[var1][var2][var4] - var6, var15 + 1)
               && this.method4386(var13 + -796360025 - 1, this.field2060[var1][var2 + 1][var4] - var6, var15 + 1)
               && this.method4386(var13 + -1962340737 - 1, this.field2060[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
               && this.method4386(var13 + 1, this.field2060[var1][var2][var4 + 1] - var6, var15 + -1196696347 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (this.field2031[var1][var7][var8] == -this.field2065) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = this.field2060[var1][var2][var4] - var6;
         if (!this.method4386(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method4386(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !this.method4386(var12, var9, var11) ? false : this.method4386(var10, var9, var11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("mj")
   boolean method4385(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var3 && var4 == var5) {
         if (!this.method4374(var1, var2, var4)) {
            return false;
         } else {
            int var13 = var2 << 7;
            int var15 = var4 << 7;
            return this.method4386(var13 + 1, this.field2060[var1][var2][var4] - var6, var15 + 1)
               && this.method4386(var13 + 128 - 1, this.field2060[var1][var2 + 1][var4] - var6, var15 + 1)
               && this.method4386(var13 + 128 - 1, this.field2060[var1][var2 + 1][var4 + 1] - var6, var15 + 128 - 1)
               && this.method4386(var13 + 1, this.field2060[var1][var2][var4 + 1] - var6, var15 + 128 - 1);
         }
      } else {
         for (int var7 = var2; var7 <= var3; var7++) {
            for (int var8 = var4; var8 <= var5; var8++) {
               if (this.field2031[var1][var7][var8] == -this.field2065) {
                  return false;
               }
            }
         }

         int var12 = (var2 << 7) + 1;
         int var14 = (var4 << 7) + 2;
         int var9 = this.field2060[var1][var2][var4] - var6;
         if (!this.method4386(var12, var9, var14)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method4386(var10, var9, var14)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               return !this.method4386(var12, var9, var11) ? false : this.method4386(var10, var9, var11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ler;III)V")
   @ObfuscatedName("qq")
   public void method4522(ModelData var1, int var2, int var3, int var4) {
      this.method4461(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mk")
   @Override
   void vmethod416(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      classUU var15 = classRM.method10129(1778071523);
      classUG var16 = classMQ.method7640(-1059764796);
      classUL var17 = var16.field6305;
      int var19 = var1 & 2047;
      float var18 = (float)(var19 / 2048.0F * (Math.PI * 2));
      var17.method11373(var18, 0.0F, 0.0F, -86203980);
      var16.field6307.method11728(var4, var5, var6, 1815114720);
      classUG var20 = classMQ.method7640(28934177);
      var20.field6307.method11728(-(this.field2056 * 64) - this.field2029, this.field2030, -(this.field2032 * 64) - this.field2047, 1932719810);
      classUU var21 = classRM.method10129(1778071523);
      var21.method11642(var20, 1541601286);
      classUU.method11613(var15, 1.0F, this.field2055, 1.0F, 1.0F, -1412584499);
      classUU.method11594(var21, var15, -1962310328);
      classUU.method11594(var21, this.field2028, 757304521);
      var15.method11642(var16, 1796198258);
      classUU.method11594(var21, var15, 973198009);
      rl23.method10067(var15, var21, (byte)11);
      var15.method11609(-1577693990);
      this.field2118 = (int)var15.method11622(var7, var8, var9, (byte)22);
      this.field2119 = (int)var15.method11623(var7, var8, var9, 308001213);
      this.field2116 = (int)var15.method11625(var7, var8, var9, 563985024);
      this.field2114 = this.field2118 / 128;
      this.field2124 = this.field2116 / 128;
      this.field2121 = (int)var15.method11622(var12, 0.0F, var13, (byte)-29) / 128;
      this.field2125 = (int)var15.method11625(var12, 0.0F, var13, 1227481582) / 128;
      classUX var22 = new classUX();
      classUU var23 = classRM.method10129(1778071523);
      var22.method11681(-var2.method11440(-873887704), 173632492);
      var22.method11686(-var3.method11440(-1933881439), 982132619);
      var22.method11693(var7, var8, var9, (byte)86);
      var23.method11605(var22, -1959054899);
      var23.method11609(-1186101863);
      var16.method11306(-923964429);
      var20.method11306(-16933514);
      var15.method11555(2013999465);
      classUU.method11594(var21, var23, 362738109);
      FloatProjection var24 = new FloatProjection(var21);
      var24.method3894(var10);
      classTW.method11209((byte)-3);
      this.method4408(var24, var14, classFH.field2257.field2217 != 1);
      classTW.method11209((byte)29);
      var23.method11555(2061656568);
      var21.method11555(1659151387);
   }

   public void setRoofRemovalMode(int var1) {
      this.field1988 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("me")
   @Override
   void vmethod417(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      classUU var15 = classRM.method10129(1778071523);
      classUG var16 = classMQ.method7640(-1445277858);
      classUL var17 = var16.field6305;
      int var19 = var1 & 2047;
      float var18 = (float)(var19 / 2048.0F * (Math.PI * 2));
      var17.method11373(var18, 0.0F, 0.0F, -392474146);
      var16.field6307.method11728(var4, var5, var6, 2105574261);
      classUG var20 = classMQ.method7640(800674293);
      var20.field6307.method11728(-(this.field2056 * 64) - this.field2029, this.field2030, -(this.field2032 * -1097442121) - this.field2047, 1773831181);
      classUU var21 = classRM.method10129(1778071523);
      var21.method11642(var20, 2118775072);
      classUU.method11613(var15, 1.0F, this.field2055, 1.0F, 1.0F, -1412584499);
      classUU.method11594(var21, var15, -749679020);
      classUU.method11594(var21, this.field2028, -1872588850);
      var15.method11642(var16, 1415894900);
      classUU.method11594(var21, var15, -166423358);
      rl23.method10067(var15, var21, (byte)76);
      var15.method11609(-554959006);
      this.field2118 = (int)var15.method11622(var7, var8, var9, (byte)-24);
      this.field2119 = (int)var15.method11623(var7, var8, var9, 716587726);
      this.field2116 = (int)var15.method11625(var7, var8, var9, -588608582);
      this.field2114 = this.field2118 / 128;
      this.field2124 = this.field2116 / 362410988;
      this.field2121 = (int)var15.method11622(var12, 0.0F, var13, (byte)36) / 1245132430;
      this.field2125 = (int)var15.method11625(var12, 0.0F, var13, -255615920) / 1806827785;
      classUX var22 = new classUX();
      classUU var23 = classRM.method10129(1778071523);
      var22.method11681(-var2.method11440(-634700962), 173632492);
      var22.method11686(-var3.method11440(-1800521643), 982132619);
      var22.method11693(var7, var8, var9, (byte)49);
      var23.method11605(var22, -1959054899);
      var23.method11609(-2059406849);
      var16.method11306(-1959808293);
      var20.method11306(-1519274453);
      var15.method11555(1641984670);
      classUU.method11594(var21, var23, -488397737);
      FloatProjection var24 = new FloatProjection(var21);
      var24.method3894(var10);
      classTW.method11209((byte)-52);
      this.method4408(var24, var14, classFH.field2257.field2217 != 1);
      classTW.method11209((byte)17);
      var23.method11555(1647577243);
      var21.method11555(1544122231);
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mt")
   @Override
   void vmethod418(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      classUU var15 = classRM.method10129(1778071523);
      classUG var16 = classMQ.method7640(235537212);
      classUL var17 = var16.field6305;
      int var19 = var1 & 2047;
      float var18 = (float)(var19 / 2048.0F * (Math.PI * 2));
      var17.method11373(var18, 0.0F, 0.0F, -589567001);
      var16.field6307.method11728(var4, var5, var6, 2118599735);
      classUG var20 = classMQ.method7640(-872998953);
      var20.field6307.method11728(-(this.field2056 * 64) - this.field2029, this.field2030, -(this.field2032 * 64) - this.field2047, 2146272440);
      classUU var21 = classRM.method10129(1778071523);
      var21.method11642(var20, 1886158483);
      classUU.method11613(var15, 1.0F, this.field2055, 1.0F, 1.0F, -1412584499);
      classUU.method11594(var21, var15, -759667496);
      classUU.method11594(var21, this.field2028, 937764227);
      var15.method11642(var16, 1194119767);
      classUU.method11594(var21, var15, 99988922);
      rl23.method10067(var15, var21, (byte)34);
      var15.method11609(216614897);
      this.field2118 = (int)var15.method11622(var7, var8, var9, (byte)11);
      this.field2119 = (int)var15.method11623(var7, var8, var9, 1284723913);
      this.field2116 = (int)var15.method11625(var7, var8, var9, 861234028);
      this.field2114 = this.field2118 / -266922065;
      this.field2124 = this.field2116 / 1882402883;
      this.field2121 = (int)var15.method11622(var12, 0.0F, var13, (byte)56) / 128;
      this.field2125 = (int)var15.method11625(var12, 0.0F, var13, 754453209) / 128;
      classUX var22 = new classUX();
      classUU var23 = classRM.method10129(1778071523);
      var22.method11681(-var2.method11440(-2012613769), 173632492);
      var22.method11686(-var3.method11440(-2087745254), 982132619);
      var22.method11693(var7, var8, var9, (byte)98);
      var23.method11605(var22, -1959054899);
      var23.method11609(-1446443821);
      var16.method11306(60381397);
      var20.method11306(-1267163293);
      var15.method11555(1697997152);
      classUU.method11594(var21, var23, 331410632);
      FloatProjection var24 = new FloatProjection(var21);
      var24.method3894(var10);
      classTW.method11209((byte)36);
      this.method4408(var24, var14, classFH.field2257.field2217 != 1);
      classTW.method11209((byte)-77);
      var23.method11555(1633898212);
      var21.method11555(1912810330);
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Ldy;Lnet/runelite/api/TileObject;IIIIJ)V")
   @ObfuscatedName("nh")
   public void method4416(Projection var1, DynamicObject var2, TileObject var3, int var4, int var5, int var6, int var7, long var8) {
      assert !var2.field1668;

      int var10 = client.field1096 >> 7 & 15;
      if (var10 > 0) {
         var2.method3710();
         rl23.method10070(var3, var2, var4, var5, var6, var7);
      } else {
         Model var11;
         try {
            var11 = var2.method3842();
         } catch (Exception var13) {
            client.field1026.debug("exception drawing dynamic game entity", var13);
            return;
         }

         if (var11 != null) {
            var2.setModelHeight(var11.getModelHeight());
            int var12 = var2.getAnimationHeightOffset();
            client.field1118.drawDynamic(-1, var1, this, var3, var2, var11, var4, var5, var6 - var12, var7);
            client.method2395(var1, this.field2018, var11, var4, var5, var6 - var12, var7, var8);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;ZZ)V")
   @ObfuscatedName("dz")
   void method4408(Projection var1, boolean var2, boolean var3) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method4130() {
      this.field2124 = -1;
      this.field2151 = null;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("bn")
   public void method4409(
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
            int var23 = this.method4168(var22, var2, var3);
            if (this.field1993[var22][var2][var3] == null) {
               this.field1993[var22][var2][var3] = new rl10(this, var23);
               this.method4205(var22, var2, var3);
            }

            if (!this.method4435(var23)) {
               this.method4202(var23, var22, var2, var3);
            }
         }

         int var26 = this.method4489(var1, var2, var3);
         this.field2006[var26] = var21;
         this.field2019[var26] = this.field2019[var26] | 256 | (var21.field2288 * -665850825 != 12345678 ? 512 : 0);
      } else if (var4 != 1) {
         SceneTileModel var24 = new SceneTileModel(
            var4,
            var5,
            var6,
            var2 - this.field1990,
            var3 - this.field1991,
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
            int var31 = this.method4169(var27, var2, var3);
            if (this.field2161[var27][var2][var3] == null) {
               this.field1993[var27][var2][var3] = new rl10(this, var31);
               this.method4471(var27, var2, var3);
            }

            if (!this.method4435(var31)) {
               this.method4437(var31, var27, var2, var3);
            }
         }

         int var28 = this.method4168(var1, var2, var3);
         this.field2007[var28] = var24;
         this.field2019[var28] = this.field2019[var28] | 1024;
      } else {
         SceneTilePaint var25 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for (int var29 = var1; var29 >= 0; var29--) {
            int var32 = this.method4170(var29, var2, var3);
            if (this.field1993[var29][var2][var3] == null) {
               this.field1993[var29][var2][var3] = new rl10(this, var32);
               this.method4233(var29, var2, var3);
            }

            if (!this.method4450(var32)) {
               this.method4159(var32, var29, var2, var3);
            }
         }

         int var30 = this.method4169(var1, var2, var3);
         this.field2006[var30] = var25;
         this.field2019[var30] = this.field2019[var30] | 256 | (var25.field2288 * -665850825 != 12345678 ? 512 : 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILee;IJZ)Z")
   @ObfuscatedName("fm")
   public boolean method4478(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
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

         var11 >>= 7;
         var12 >>= 7;
         var13 >>= 7;
         var14 >>= 7;
         return this.method4499(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ou")
   public boolean method4523(int var1, int var2, int var3) {
      return this.method4374(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("be")
   public void method4413(int var1, int var2, int var3, int var4) {
      int var5 = this.method4168(var1, var2, var3);
      if ((this.field2159[var1][var2][var3] & 8) != 0) {
         this.field2005[var5] = this.field2005[var5] | 64;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;Z)Z")
   @ObfuscatedName("xt")
   public static boolean method4436(Renderable var0, boolean var1) {
      return classOE.field4843.getCallbacks().draw(var0, var1);
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;Lee;IIJI)V")
   @ObfuscatedName("ft")
   public void method4524(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
      this.method4434(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
   }

   @ObfuscatedSignature(descriptor = "(ZZ)V")
   @ObfuscatedName("er")
   public void method4390(boolean var1, boolean var2) {
      this.field2065++;
      this.field2061.method4844(classFH.field2257.field2215);
      classFH.field2257.field2215.method4844(this.field2035);
      if (var1) {
         DrawCallbacks var3 = client.field1118;
         if (var3 != null && this.field2062) {
            classGP.field2650 = 0;
            var3.drawScene(this.field2095, this.field2091, this.field2094, this.field2093, this.field2092, this.field2027);
         }

         int var4 = classOE.field4843.isGpu() ? field2149 : this.field2051;
         int var5 = !var2 && this.field2052 != classEX.field1977 ? this.field2121 : this.field2114;
         int var6 = !var2 && this.field2052 != classEX.field1977 ? this.field2125 : this.field2124;
         if (this.field2062) {
            this.field2120 = Math.max(var5 - var4, this.field2144 + this.field2147);
            this.field2113 = Math.max(var6 - var4, this.field2148 + this.field2147);
            this.field2123 = Math.min(var5 + var4, this.field2145 + this.field2147);
            this.field2122 = Math.min(var6 + var4, this.field2111 + this.field2147);
         } else {
            this.field2120 = 0;
            this.field2113 = 0;
            this.field2123 = this.field2056;
            this.field2122 = this.field2032;
            var5 = this.field2056 / 2;
            var6 = this.field2032 / 2;
            this.field2051 = Math.max(var5, var6);
         }

         this.field2053 = this.field2114 - var5;
         this.field2054 = this.field2124 - var6;
         this.field2041 = 0;
         this.method4483();
         boolean var7 = classOE.field4843.isMenuOpen();
         if (!var7) {
            this.field1990 = this.field2144;
            this.field1991 = this.field2148;
         }

         if ((client.field1096 & 16) != 0) {
            boolean var8 = this.field1988 != 0 && this.field2062;
            int var9 = var8 ? this.field2059 - 1 : this.field2027;
            client.field1118
               .preSceneDraw(
                  this,
                  this.field2018,
                  this.field2095,
                  this.field2091,
                  this.field2094,
                  this.field2093,
                  this.field2092,
                  this.field2040,
                  this.field2150.field1710 * -483624883,
                  var9,
                  this.field2023
               );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ko")
   public boolean method4411(int var1, int var2, int var3) {
      return (this.field2159[var1][var2][var3] & 4) != 0;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lfv;Lrl17;)V")
   @ObfuscatedName("de")
   public void method4469(Projection var1, Projection var2, rl17 var3) {
      if (!var3.field5706.isEmpty()) {
         rl16.field5702 = var1;
         var3.field5706.sort(field2078);

         for (int var4 = 0; var4 < var3.field5706.size(); var4++) {
            GameObject var5 = (GameObject)var3.field5706.get(var4);
            if (!(var5.field2200 instanceof Scene)) {
               Renderable var6 = var5.field2200;

               Model var7;
               try {
                  var7 = var6 instanceof Model ? (Model)var6 : var6.method3842();
                  if (var7 == null) {
                     continue;
                  }
               } catch (Exception var9) {
                  client.field1026.debug("exception drawing game entity", var9);
                  continue;
               }

               if (var7 != var6) {
                  var6.setModelHeight(var7.getModelHeight());
               }

               int var8 = var6.getAnimationHeightOffset();
               client.field1118
                  .drawTemp(
                     var1,
                     this,
                     var5,
                     var7,
                     var5.field2189 * 470594389,
                     var5.field2195 * -1405731525,
                     var5.field2190 * 1269801851 - var8,
                     var5.field2196 * -1706390585
                  );
               client.method2395(
                  var1,
                  var2,
                  var7,
                  var5.field2189 * 470594389,
                  var5.field2195 * -1405731525,
                  var5.field2190 * 1269801851 - var8,
                  var5.field2196 * -1706390585,
                  var5.field2185 * 1745853678706228013L
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Leo;")
   @ObfuscatedName("rg")
   public FloorDecoration method4525(int var1, int var2, int var3) {
      return method4457(this, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("cl")
   public void method4213(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.field1961 * -389646721; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = var6.field2185 * 1745853678706228013L;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2187 * 1138017605 == var2 && var6.field2196 * -555977777 == var3) {
               this.method4359(var6);
               return;
            }
         }
      }
   }

   public short[][][] getUnderlayIds() {
      return this.field2162;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("cs")
   int method4243(int var1, int var2, int var3, int var4, int var5, int var6) {
      return method4249(this, var1, var2, var3) - method4249(this, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("op")
   public int method4423(int var1) {
      int var2 = var1 >> this.field1996 & 3;
      return var2 + (this.field2005[var1 & this.field1999 - 1] >> 5 & 1) & 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)J")
   @ObfuscatedName("as")
   public static long method4226(Scene var0, int var1, int var2, int var3) {
      classEW var4 = var0.field2058[var1][var2][var3];
      return var4 != null && var4.field1971 != null ? var4.field1971.field2266 * -3608662145112923099L : 0L;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bs")
   public void method4208(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         var4.field1971 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dr")
   public void method4333() {
      this.field2033 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;III)V")
   @ObfuscatedName("dt")
   public static void method4327(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4417(var1, var1, var1);
      }

      var0.field2044 = var1;
      var0.field2045 = var2;
      var0.field2046 = var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dw")
   public void method4342() {
      this.field1990 = -1;
      this.field2043 = false;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("wt")
   public void method4526(int var1, int var2, int var3, int var4) {
      this.method4412(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ke")
   public void method4404(int var1) {
      int var2 = (var1 << 1) + 1;
      var2 = this.field2019[var2];
      var2 <<= 1;
      int var5 = var1 << 1;
      this.field2019[var2] = this.field2019[var5];
      var2 = var1 << 1;
      var2 = this.field2019[var2];
      var2 = (var2 << 1) + 1;
      int var9 = (var1 << 1) + 1;
      this.field2019[var2] = this.field2019[var9];
      var2 = (var1 << 1) + 1;
      int var11 = this.field2003;
      int var12 = (var11 << 1) + 1;
      this.field2019[var2] = this.field2019[var12];
      var2 = var1 << 1;
      this.field2019[var2] = this.field2003;
      var2 = (var1 << 1) + 1;
      var2 = this.field2019[var2];
      var2 <<= 1;
      this.field2019[var2] = var1;
      var2 = var1 << 1;
      var2 = this.field2019[var2];
      var2 = (var2 << 1) + 1;
      this.field2019[var2] = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Z)V")
   @ObfuscatedName("dv")
   void method4354(Projection var1, boolean var2) {
      this.field2114 = 0;

      for (int var3 = this.field2051; var3 < this.field2034; var3++) {
         classEW[][] var4 = this.field2058[var3];

         for (int var5 = this.field2040; var5 < this.field2059; var5++) {
            for (int var6 = this.field2120; var6 < this.field2044; var6++) {
               classEW var7 = var4[var5][var6];
               if (var7 != null
                  && var7.field1961 * 1390661409 <= this.field2142
                  && (
                     !var2
                        || this.method4314(var5 - this.field2122 + this.field2065 + this.field2046, var6 - this.field2032 + this.field2122 + this.field2117)
                        || this.field2060[var3][var5][var6] - this.field2123 >= 2000
                  )) {
                  this.method4361(var1, var7);
               }
            }
         }
      }

      this.method4338();
      classFL.method4827(classFH.field2257.field2215, this.field2061);
   }

   @ObfuscatedSignature(descriptor = "(Lez;III)V")
   @ObfuscatedName("wp")
   public static void method4495(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4446(var1, var1, var1);
      } else {
         var2 += var0.field2147;
         var3 += var0.field2147;
         int var4 = var0.method4489(var1, var2, var3);
         if (var0.method4389(var4)) {
            ItemLayer var5 = var0.field2011[var4];
            var0.field2011[var4] = null;
            var0.field2005[var4] = var0.field2005[var4] & -12289;
            rl17 var6 = var0.field2020[var2 >> 3][var3 >> 3];
            var6.field5705.remove(var5);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("dj")
   boolean method4379(int var1, int var2, int var3, int var4) {
      if (!this.method4373(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method4374(var5 + 1, this.field2031[var1][var2][var3] - var4, var6 + 1)
            && this.method4374(var5 + 128 - 1, this.field2031[var1][var2 + 1][var3] - var4, var6 + 1)
            && this.method4374(var5 + 128 - 1, this.field2031[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
            && this.method4373(var5 + 1, this.field2031[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("cy")
   int method4493(int var1, int var2, int var3) {
      int var4 = var2 + this.field2029;
      int var5 = var3 + this.field2147;
      int var6 = 0;
      int var7 = this.method4167(var1, var4, var5);
      if (this.method4450(var7)) {
         byte var8 = this.field2015[var7];

         for (int var9 = 0; var9 < var8; var9++) {
            GameObject var10 = this.field2013[var7 * 5 + var9];
            if ((var10.field2186 * -288062455 & 256) == 256 && var10.field2200 instanceof Model) {
               Model var11 = (Model)var10.field2200;
               var11.method5104();
               if (var11.field1743 * -1256242689 > var6) {
                  var6 = var11.field1743 * -1256242689;
               }
            }
         }
      }

      return var6;
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;JI)V")
   @ObfuscatedName("fu")
   public void method4166(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.field1816 = var5;
         var9.field1807 = var2 * -1794546048 + -1104504652;
         var9.field1806 = var3 * -2036886656 + -1018443328;
         var9.field1808 = var4 * 476279895;
         var9.field1815 = var6 * -8879266543907161229L;
         var9.method3938(var8, (byte)2);
         if (this.field2058[var1][var2][var3] == null) {
            this.field2058[var1][var2][var3] = new classEW(var1, var2, var3);
         }

         this.field2058[var1][var2][var3].field1967 = var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lew;)Z")
   @ObfuscatedName("gp")
   boolean method4193(classEW var1) {
      if (var1.field1957 * -299736461 != this.field2120) {
         var1.field1957 = this.field2026 * -1699605829;
         var1.field1956 *= -980607445;
         if (this.field2038 >= this.field2057.length) {
            this.field2057 = Arrays.copyOf(this.field2057, this.field2057.length * 2);
         }

         classEW[] var10000 = this.field2057;
         int var10001 = this.field2038;
         this.field2045 = this.field2038 + 1;
         var10000[var10001] = var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hn")
   public void method4214(int var1, int var2, int var3) {
      classEW var4 = this.field2058[var1][var2][var3];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.field1964 * -389646721; var5++) {
            GameObject var6 = var4.field1951[var5];
            long var8 = var6.field2185 * 1745853678706228013L;
            boolean var7 = classCV.method2683(var8) == 2;
            if (var7 && var6.field2196 * 1138017605 == var2 && var6.field2187 * -555977777 == var3) {
               this.method4359(var6);
               return;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("mn")
   boolean method4380(int var1, int var2, int var3, int var4) {
      if (!this.method4386(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method4373(var5 + 1, this.field2060[var1][var2][var3] - var4, var6 + 1)
            && this.method4374(var5 + 128 - 1, this.field2031[var1][var2 + 1][var3] - var4, var6 + 1)
            && this.method4373(var5 + 128 - 1, this.field2060[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
            && this.method4374(var5 + 1, this.field2031[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bd")
   public void method4446(int var1, int var2, int var3) {
      var2 += this.field1991;
      var3 += this.field2111;
      int var4 = this.method4167(var1, var2, var3);
      if (this.method4435(var4) && (this.field2019[var4] & 32768) != 0) {
         WallDecoration var5 = this.field2009[var4];
         this.field2009[var4] = null;
         this.field2005[var4] = this.field2005[var4] & -32769;
         if (var5.field2279 instanceof DynamicObject || var5.field2278 instanceof DynamicObject) {
            rl17 var6 = this.field2020[var2 >> 3][var3 >> 3];
            var6.field5706.remove(var5);
         }

         if (this.field2156) {
            DecorativeObjectDespawned var9 = new DecorativeObjectDespawned();
            var9.setTile(this.field2161[var1][var2][var3]);
            var9.setDecorativeObject(var5);
            classOE.field4843.getCallbacks().post(var9);
         }

         if (this.field2157 && client.field1118 != null) {
            client.field1118.invalidateZone(this, var2 >> 3, var3 >> 3);
         }
      }
   }

   public boolean isInstance() {
      return this.field2157;
   }

   @ObfuscatedSignature(descriptor = "(Lfb;II)I")
   @ObfuscatedName("dl")
   int method4369(GameObject var1, int var2, int var3) {
      int var4 = var2 - var1.field2184 * 1138017605;
      int var5 = var1.field2194 * 304142753 - var2;
      if (var5 > var4) {
         var4 = var5;
      }

      int var6 = var3 - var1.field2195 * -555977777;
      int var7 = var1.field2195 * -544424899 - var3;
      return var7 > var6 ? var4 + var7 : var4 + var6;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bc")
   public int method4494(int var1, int var2, int var3) {
      int var4 = var2 + this.field1991;
      int var5 = var3 + this.field2047;
      int var6 = 0;
      int var7 = this.method4168(var1, var4, var5);
      if (this.method4450(var7)) {
         byte var8 = this.field2014[var7];

         for (int var9 = 0; var9 < var8; var9++) {
            GameObject var10 = this.field2013[var7 * 5 + var9];
            if ((var10.field2192 * -288062455 & 256) == 256 && var10.field2200 instanceof Model) {
               Model var11 = (Model)var10.field2200;
               var11.method5133();
               if (var11.field1743 * -1256242689 > var6) {
                  var6 = var11.field1743 * -1256242689;
               }
            }
         }
      }

      return var6;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ji")
   public int method4391() {
      int var2 = this.field2003;
      var2 <<= 1;
      int var1 = this.field2019[var2];
      if (var1 >= this.field2003) {
         return this.field2002;
      } else {
         this.method4466(var1);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("in")
   int method4250(int var1, int var2, int var3) {
      return (
            this.field2060[var1][var2][var3]
               + this.field2060[var1][var2 + 1][var3]
               + this.field2060[var1][var2][var3 + 1]
               + this.field2031[var1][var2 + 1][var3 + 1]
         )
         / 4;
   }

   @ObfuscatedSignature(descriptor = "(IIIJ)I")
   @ObfuscatedName("cq")
   public int method4463(int var1, int var2, int var3, long var4) {
      var2 += this.field2037;
      var3 += this.field2109;
      int var6 = this.method4167(var1, var2, var3);
      if (!this.method4450(var6)) {
         return -1;
      } else if (this.field2008[var6] != null && this.field2008[var6].field2240 * 7159317397185328723L == var4) {
         return this.field2008[var6].field2242 * 1869636241 & 0xFF;
      } else if (this.field2009[var6] != null && this.field2009[var6].field2266 * -3608662145112923099L == var4) {
         return this.field2009[var6].field2276 * -1506294211 & 0xFF;
      } else if (this.field2010[var6] != null && this.field2010[var6].field1815 * 5132338419383099835L == var4) {
         return this.field2010[var6].field1809 * -1235687175 & 0xFF;
      } else {
         byte var7 = this.field2014[var6];

         for (int var8 = 0; var8 < var7; var8++) {
            GameObject var9 = this.field2013[var6 * 5 + var8];
            if (var9.field2185 * 1745853678706228013L == var4) {
               return var9.field2187 * -288062455 & 0xFF;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILee;JI)V")
   @ObfuscatedName("bx")
   public void method4465(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
      int var9 = var2 + this.field2143;
      int var10 = var3 + this.field2036;
      if (var5 != null) {
         int var11 = this.method4489(var1, var9, var10);
         FloorDecoration var12 = new FloorDecoration();
         var12.method3947(var5);
         var12.method3948(var2 * 128 + 64);
         var12.method3943(var3 * 128 + 64);
         var12.method3943(var4);
         var12.method3944(var6);
         var12.method3943(var8);
         rl10 var13 = this.field2161[var1][var9][var10];
         if (var13 == null) {
            this.field2161[var1][var9][var10] = var13 = new rl10(this, var11);
            this.method4215(var1, var9, var10);
         }

         if (!this.method4389(var11)) {
            this.method4437(var11, var1, var9, var10);
         }

         assert this.field2010[var11] == null;

         this.field2010[var11] = var12;
         this.field2005[var11] = this.field2005[var11] | 2048;
         this.field2016[var11] = this.field2016[var11] | 1080863910568919040L;
         if (var5 instanceof DynamicObject) {
            rl17 var14 = this.field2020[var9 >> 3][var10 >> 3];
            var14.field5705.add(var12);
            this.method4428((DynamicObject)var5);
         }

         this.method4447(var5, 0, var12.getConfig(), var12.getPlane(), var12.getConfig(), var2, var3);
         var12.field1814 = var1;
         if (this.field2156) {
            GroundObjectSpawned var17 = new GroundObjectSpawned();
            var17.setTile(var13);
            var17.setGroundObject(var12);
            classOE.field4843.getCallbacks().post(var17);
         }

         if (this.field2157 && client.field1118 != null) {
            client.field1118.invalidateZone(this, var9 >> 3, var10 >> 3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;IIIIIIIIIIIIIIIIIIII)V")
   @ObfuscatedName("mv")
   public static void method4410(
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
         var0.method4409(var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1);
      }

      if (var4 == 0) {
         SceneTilePaint var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

         for (int var22 = var1; var22 >= 0; var22--) {
            int var23 = var0.method4489(var22, var2, var3);
            if (var0.field1993[var22][var2][var3] == null) {
               var0.field1993[var22][var2][var3] = new rl10(var0, var23);
               var0.method4424(var22, var2, var3);
            }

            if (!var0.method4389(var23)) {
               var0.method4437(var23, var22, var2, var3);
            }
         }

         int var26 = var0.method4489(var1, var2, var3);
         var0.field2006[var26] = var21;
         var0.field2005[var26] = var0.field2005[var26] | 256 | (var21.field2286 * -665850825 != 12345678 ? 512 : 0);
      } else if (var4 != 1) {
         SceneTileModel var24 = new SceneTileModel(
            var4,
            var5,
            var6,
            var2 - var0.field2147,
            var3 - var0.field2147,
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
            int var31 = var0.method4489(var27, var2, var3);
            if (var0.field1993[var27][var2][var3] == null) {
               var0.field1993[var27][var2][var3] = new rl10(var0, var31);
               var0.method4424(var27, var2, var3);
            }

            if (!var0.method4389(var31)) {
               var0.method4437(var31, var27, var2, var3);
            }
         }

         int var28 = var0.method4489(var1, var2, var3);
         var0.field2007[var28] = var24;
         var0.field2005[var28] = var0.field2005[var28] | 1024;
      } else {
         SceneTilePaint var25 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for (int var29 = var1; var29 >= 0; var29--) {
            int var32 = var0.method4489(var29, var2, var3);
            if (var0.field1993[var29][var2][var3] == null) {
               var0.field1993[var29][var2][var3] = new rl10(var0, var32);
               var0.method4424(var29, var2, var3);
            }

            if (!var0.method4389(var32)) {
               var0.method4437(var32, var29, var2, var3);
            }
         }

         int var30 = var0.method4489(var1, var2, var3);
         var0.field2006[var30] = var25;
         var0.field2005[var30] = var0.field2005[var30] | 256 | (var25.field2286 * -665850825 != 12345678 ? 512 : 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfv;Lew;)V")
   @ObfuscatedName("lr")
   void method4364(Projection var1, classEW var2) {
      if (var2 != null) {
         int var3 = var2.field1966 * -54806681;
         int var4 = var2.field1956 * -2067052011;
         int var5 = var2.field1960 * 1483076705;
         int var6 = var2.field1950 * 800564741;
         if (var2.field1963 * 1483076705 == 0 && var2.field1969 != null) {
            this.method4362(var1, var2.field1969);
         }

         if (var2.field1972 != null) {
            if (!this.method4386(var6, var3, var4) && (var2.field1972.field2285 * -665850825 != 12345678 || var5 <= this.field2051)) {
               var1.vmethod426(this, var2.field1972, var6, var3, var4, 1178341524);
            }
         } else if (var2.field1973 != null && !this.method4386(var6, var3, var4)) {
            var1.vmethod431(this, var2.field1973, var3, var4, 1886840969);
         }

         BoundaryObject var7 = var2.field1970;
         if (var7 != null) {
            if (var7.field2249 != null && !this.method4380(var6, var3, var4, var7.field2244 * 1548562339)) {
               var1.vmethod422(
                  var7.field2248, 0, var7.field2246 * -777838807, var7.field2243 * 1315862339, var7.field2243 * 31139801, var7.field2240 * 7159317397185328723L
               );
            }

            if (var7.field2248 != null && !this.method4375(var6, var3, var4, var7.field2242 * -1413337351)) {
               var1.vmethod425(
                  var7.field2248, 0, var7.field2241 * -777838807, var7.field2244 * 1315862339, var7.field2245 * 31139801, var7.field2240 * 7159317397185328723L
               );
            }
         }

         WallDecoration var8 = var2.field1971;
         if (var8 != null && !method4378(this, var6, var3, var4, var8.field2279.field1743 * -1256242689)) {
            if (var8.field2271 * 254285683 == 256) {
               var1.vmethod422(
                  var8.field2278,
                  0,
                  var8.field2268 * 1766830743 + var8.field2270 * -404927711,
                  var8.field2265 * 1698079433,
                  var8.field2275 * -361702377 + var8.field2275 * 856605829,
                  var8.field2266 * -3608662145112923099L
               );
               if (var8.field2278 != null) {
                  var1.vmethod424(
                     var8.field2278,
                     0,
                     var8.field2267 * 1766830743 + var8.field2276 * -1085897215,
                     var8.field2272 * 1698079433,
                     var8.field2270 * -361702377 + var8.field2268 * 513256357,
                     var8.field2266 * -3608662145112923099L
                  );
               }
            } else {
               var1.vmethod425(
                  var8.field2279,
                  0,
                  var8.field2269 * 1766830743 + var8.field2272 * -404927711,
                  var8.field2269 * 1698079433,
                  var8.field2275 * -361702377 + var8.field2273 * 856605829,
                  var8.field2266 * -3608662145112923099L
               );
            }
         }

         FloorDecoration var9 = var2.field1967;
         if (var9 != null) {
            var1.vmethod425(
               var9.field1816, 0, var9.field1808 * 1333275141, var9.field1808 * -276908185, var9.field1806 * 498815127, var9.field1815 * 5132338419383099835L
            );
         }

         ItemLayer var10 = var2.field1968;
         if (var10 != null) {
            if (var10.field1846 != null) {
               var1.vmethod424(
                  var10.field1846,
                  0,
                  var10.field1839 * -892202585,
                  var10.field1840 * 1186822141 - var10.field1839 * 218008627,
                  var10.field1840 * -1209739927,
                  var10.field1844
               );
            }

            if (var10.field1846 != null) {
               var1.vmethod435(
                  var10.field1845,
                  0,
                  var10.field1838 * -892202585,
                  var10.field1838 * 1186822141 - var10.field1838 * 218008627,
                  var10.field1839 * -1209739927,
                  var10.field1844
               );
            }

            if (var10.field1847 != null) {
               var1.vmethod425(
                  var10.field1845,
                  0,
                  var10.field1841 * -892202585,
                  var10.field1841 * 1186822141 - var10.field1839 * 218008627,
                  var10.field1838 * -1209739927,
                  var10.field1844
               );
            }
         }

         for (int var11 = 0; var11 < var2.field1966 * -389646721; var11++) {
            GameObject var12 = var2.field1951[var11];
            var12.field2192 = this.field2045 * 132222543;
            if (var12.field2192 * 1138017605 == var2.field1966 * -54806681
               && var12.field2195 * -555977777 == var2.field1966 * -2067052011
               && !this.method4382(
                  var6,
                  var12.field2186 * 1138017605,
                  var12.field2189 * 304142753,
                  var12.field2186 * -555977777,
                  var12.field2195 * -544424899,
                  var12.field2200.field1743 * -1256242689
               )) {
               try {
                  var1.vmethod424(
                     var12.field2200,
                     var12.field2187 * 470594389,
                     var12.field2191 * -1405731525,
                     var12.field2191 * 1269801851,
                     var12.field2197 * -1706390585,
                     var12.field2185 * 1745853678706228013L
                  );
               } catch (Exception var15) {
               }
            }
         }

         if (var2.method4092((short)1181)) {
            for (int var16 = 0; var16 < var2.field1955.size(); var16++) {
               GameObject var17 = (GameObject)var2.field1955.get(var16);
               var17.field2184 = this.field2040 * 132222543;
               if (!this.method4385(
                  var6,
                  var2.field1964 * -54806681,
                  var2.field1949 * -54806681,
                  var2.field1962 * -2067052011,
                  var2.field1957 * -2067052011,
                  var17.field2200.field1743 * -1256242689
               )) {
                  try {
                     var1.vmethod424(
                        var17.field2200,
                        var17.field2192 * 470594389,
                        var17.field2188 * -1405731525,
                        var17.field2194 * 1269801851,
                        var17.field2196 * -1706390585,
                        var17.field2185 * 1745853678706228013L
                     );
                  } catch (Exception var14) {
                  }
               }
            }
         }
      }
   }
}
