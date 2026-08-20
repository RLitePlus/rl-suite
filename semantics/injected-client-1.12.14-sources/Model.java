import java.awt.Shape;
import java.util.Arrays;
import net.runelite.api.Perspective;
import net.runelite.api.model.Jarvis;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ky")
public class Model extends Renderable implements net.runelite.api.Model {
   @ObfuscatedName("bl")
   public int indicesCount;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field3558 = 50;
   @ObfuscatedName("zm")
   public float[] field3507;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field3521 = 2500;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field3557 = 6500;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field3542 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field3538 = 20;
   @ObfuscatedName("ak")
   static boolean[] field3519 = new boolean[6500];
   @ObfuscatedName("bw")
   static int Model_transformTempY;
   @ObfuscatedName("ap")
   static boolean[] field3529 = new boolean[6500];
   @ObfuscatedName("ay")
   static float[] modelViewportXs = new float[6500];
   @ObfuscatedName("au")
   static float[] modelViewportYs = new float[6500];
   @ObfuscatedName("az")
   static float[] field3525 = new float[6500];
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("ml")
   public Model field3572;
   @ObfuscatedName("bq")
   int[] indices2;
   @ObfuscatedName("cd")
   public boolean isSingleTile;
   @ObfuscatedName("as")
   static int[] field3533 = new int[6500];
   @ObfuscatedName("gq")
   public int field3569;
   @ObfuscatedName("ac")
   static int[] field3541 = new int[6500];
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3559 = 6000;
   @ObfuscatedName("co")
   int[] texIndices2;
   @ObfuscatedName("ar")
   static int[] field3532 = new int[12];
   @ObfuscatedName("ah")
   static int[][] field3530 = new int[12][2500];
   @ObfuscatedName("al")
   static int[] field3520 = new int[2500];
   @ObfuscatedName("af")
   static int[] field3531 = new int[2500];
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("bk")
   static Model Model_sharedSpotAnimationModel = new Model();
   @ObfuscatedName("ao")
   static boolean field3537 = true;
   @ObfuscatedName("cw")
   int[][] faceLabelsAlpha;
   @ObfuscatedName("aq")
   static int[] field3540 = Rasterizer3D.Rasterizer3D_cosine;
   @ObfuscatedName("be")
   static int[] field3522 = Rasterizer3D.Rasterizer3D_colorPalette;
   @ObfuscatedName("bi")
   static float[] field3555 = new float[10];
   @ObfuscatedName("ai")
   static int[] field3536 = new int[6500];
   @ObfuscatedName("ax")
   static char[][] field3528 = new char[6000][512];
   @ObfuscatedName("bv")
   int[] faceColors1;
   @ObfuscatedSignature(descriptor = "Lko;")
   @ObfuscatedName("cj")
   ModelColorOverride modelColorOverride;
   @ObfuscatedName("tg")
   public short[] field3580;
   @ObfuscatedName("bg")
   static float[] field3544 = new float[3];
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   int[] verticesY;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("bm")
   static TransformationMatrix field3550 = new TransformationMatrix();
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("bp")
   static TransformationMatrix field3551 = new TransformationMatrix();
   @ObfuscatedName("bt")
   static int[] field3535 = new int[10];
   @ObfuscatedName("cf")
   int xzRadius;
   @ObfuscatedName("am")
   static int[] field3546 = new int[12];
   @ObfuscatedName("ba")
   static int[] field3554 = new int[10];
   @ObfuscatedName("cn")
   int[] texIndices1;
   @ObfuscatedName("ab")
   static char[] field3523 = new char[6000];
   @ObfuscatedName("aa")
   static int[] field3539 = Rasterizer3D.Rasterizer3D_sine;
   @ObfuscatedName("ua")
   public float[] field3501;
   @ObfuscatedName("bn")
   public int verticesCount = 0;
   @ObfuscatedName("bd")
   int[] verticesX;
   @ObfuscatedName("bf")
   static int Model_transformTempZ;
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   int[] verticesZ;
   @ObfuscatedName("xn")
   public int[] field3579;
   @ObfuscatedName("wt")
   public int[] field3578;
   @ObfuscatedName("bz")
   static byte[] Model_sharedSequenceModelFaceAlphas = new byte[1];
   @ObfuscatedName("bc")
   int[] indices1;
   @ObfuscatedName("sn")
   public int field3570;
   @ObfuscatedName("ga")
   public int field3568;
   @ObfuscatedName("bu")
   static int[] field3553 = new int[10];
   @ObfuscatedName("bx")
   int[] indices3;
   @ObfuscatedName("bb")
   static byte[] Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
   @ObfuscatedName("ch")
   int[] faceColors2;
   @ObfuscatedName("ce")
   int[] faceColors3;
   @ObfuscatedName("cu")
   byte[] faceRenderPriorities;
   @ObfuscatedName("vi")
   public float[] field3503;
   @ObfuscatedName("ct")
   public byte[] faceAlphas;
   @ObfuscatedName("cm")
   byte[] textureFaces;
   @ObfuscatedName("cb")
   short[] faceTextures;
   @ObfuscatedName("ck")
   byte[] faceBias;
   @ObfuscatedName("cc")
   public byte field3502;
   @ObfuscatedName("cs")
   public int texIndicesCount;
   @ObfuscatedName("by")
   static int Model_transformTempX;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("bs")
   static Model Model_sharedSequenceModel = new Model();
   @ObfuscatedName("cx")
   int[] texIndices3;
   @ObfuscatedName("ad")
   static int[] field3526 = new int[6500];
   @ObfuscatedName("cg")
   int[][] field3581;
   @ObfuscatedName("cv")
   int[][] vertexLabels;
   @ObfuscatedName("cq")
   int radius;
   @ObfuscatedName("cz")
   int boundsType;
   @ObfuscatedName("cy")
   int diameter;
   @ObfuscatedName("aw")
   static boolean[] field3552 = new boolean[6500];
   @ObfuscatedName("ci")
   int bottomY;
   @ObfuscatedName("bo")
   static int[] field3543 = Rasterizer3D.field3040;
   @ObfuscatedName("cp")
   int[][] field3518;
   @ObfuscatedName("rk")
   public int[] field3577;
   @ObfuscatedSignature(descriptor = "Lje;")
   @ObfuscatedName("cr")
   AABB aabb;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("bj")
   static TransformationMatrix field3549 = new TransformationMatrix();
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ca")
   classJS field3498;
   @ObfuscatedName("cl")
   short field3573;

   public int[] getFaceColors2() {
      return this.faceColors2;
   }

   public float[] getVerticesX() {
      return this.field3501;
   }

   Model(Model var1) {
      this.indicesCount = 0;
      this.field3502 = 0;
      this.texIndicesCount = 0;
      this.isSingleTile = false;
      this.modelColorOverride = null;
      this.field3498 = classJS.field3180;
      this.verticesCount = var1.verticesCount;
      this.indicesCount = var1.indicesCount;
      this.texIndicesCount = var1.texIndicesCount;
      this.field3501 = var1.field3501;
      this.field3507 = var1.field3507;
      this.field3503 = var1.field3503;
      this.indices1 = var1.indices1;
      this.indices2 = var1.indices2;
      this.indices3 = var1.indices3;
      this.faceColors1 = var1.faceColors1;
      this.faceColors2 = var1.faceColors2;
      this.faceColors3 = var1.faceColors3;
      this.faceRenderPriorities = var1.faceRenderPriorities;
      this.faceAlphas = var1.faceAlphas;
      this.textureFaces = var1.textureFaces;
      this.faceTextures = var1.faceTextures;
      this.faceBias = var1.faceBias;
      this.field3502 = var1.field3502;
      this.texIndices1 = var1.texIndices1;
      this.texIndices2 = var1.texIndices2;
      this.texIndices3 = var1.texIndices3;
      this.faceLabelsAlpha = var1.faceLabelsAlpha;
      this.field3518 = var1.field3518;
      this.isSingleTile = var1.isSingleTile;
      this.method6880(var1);
   }

   public Model(Model[] var1, int var2) {
      this.indicesCount = 0;
      this.field3502 = 0;
      this.texIndicesCount = 0;
      this.isSingleTile = false;
      this.modelColorOverride = null;
      this.field3498 = classJS.field3180;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;
      this.field3502 = -1;

      for (int var3 = 0; var3 < var2; var3++) {
         Model var4 = var1[var3];
         if (var4 != null) {
            this.verticesCount = this.verticesCount + var4.verticesCount;
            this.indicesCount = this.indicesCount + var4.indicesCount;
            this.texIndicesCount = this.texIndicesCount + var4.texIndicesCount;
            if (this.field3502 == -1) {
               this.field3502 = var4.field3502;
            }
         }
      }

      this.method6708(this.verticesCount, this.indicesCount, this.texIndicesCount);
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         this.method6716(var1[var5]);
      }

      this.method6876(var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;[[IIIIZI)Lky;")
   @ObfuscatedName("yb")
   public static Model method6718(Model var0, int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      if (var0 == null) {
         var0.toSharedSequenceModel(var5);
      }

      var0.method6864();
      int var7 = var2 - var0.diameter;
      int var8 = var2 + var0.diameter;
      int var9 = var4 - var0.diameter;
      int var10 = var4 + var0.diameter;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return var0;
         } else {
            Model var11;
            if (var5) {
               var11 = new Model(var0);
               var11.field3507 = new float[var11.verticesCount];
            } else {
               var11 = var0;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.verticesCount; var12++) {
                  int var13 = (int)var0.field3501[var12] + var2;
                  int var14 = (int)var0.field3503[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field3507[var12] = (int)var0.field3507[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.verticesCount; var27++) {
                  int var28 = (-((int)var0.field3507[var27]) << 16) / (var0.height * -1272589951);
                  if (var28 < var6) {
                     int var29 = (int)var0.field3501[var27] + var2;
                     int var30 = (int)var0.field3503[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field3507[var27] = (int)var0.field3507[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field3507[var27] = var0.field3507[var27];
                  }
               }
            }

            var11.method6742();
            return var11;
         }
      } else {
         return var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)V")
   @ObfuscatedName("uj")
   public static void method6823(Model var0, int var1) {
      if (var0 == null) {
         var0.method6853(var1);
      }

      int var2 = Rasterizer3D.getClipMidX();
      int var3 = Rasterizer3D.getClipMidY();
      int var4 = 0;
      int var5 = var0.indices1[var1];
      int var6 = var0.indices2[var1];
      int var7 = var0.indices3[var1];
      int var8 = field3541[var5];
      int var9 = field3541[var6];
      int var10 = field3541[var7];
      if (var0.faceAlphas == null) {
         Rasterizer3D.clips.clipX = 0;
      } else {
         Rasterizer3D.clips.clipX = var0.faceAlphas[var1] & 255;
      }

      if (var8 >= 50) {
         field3535[var4] = (int)modelViewportXs[var5];
         field3553[var4] = (int)modelViewportYs[var5];
         field3555[var4] = field3525[var5];
         field3554[var4++] = var0.faceColors1[var1];
      } else {
         int var11 = field3536[var5];
         int var12 = field3533[var5];
         int var13 = var0.faceColors1[var1];
         if (var10 >= 50) {
            int var14 = (50 - var8) * field3543[var10 - var8];
            field3535[var4] = var2 + (var11 + ((field3536[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var12 + ((field3533[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var13 + ((var0.faceColors3[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            int var35 = (50 - var8) * field3543[var9 - var8];
            field3535[var4] = var2 + (var11 + ((field3536[var6] - var11) * var35 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var12 + ((field3533[var6] - var12) * var35 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var13 + ((var0.faceColors2[var1] - var13) * var35 >> 16);
         }
      }

      if (var9 >= 50) {
         field3535[var4] = (int)modelViewportXs[var6];
         field3553[var4] = (int)modelViewportYs[var6];
         field3555[var4] = field3525[var6];
         field3554[var4++] = var0.faceColors2[var1];
      } else {
         int var26 = field3536[var6];
         int var29 = field3533[var6];
         int var32 = var0.faceColors2[var1];
         if (var8 >= 50) {
            int var36 = (50 - var9) * field3543[var8 - var9];
            field3535[var4] = var2 + (var26 + ((field3536[var5] - var26) * var36 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var29 + ((field3533[var5] - var29) * var36 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var32 + ((var0.faceColors1[var1] - var32) * var36 >> 16);
         }

         if (var10 >= 50) {
            int var37 = (50 - var9) * field3543[var10 - var9];
            field3535[var4] = var2 + (var26 + ((field3536[var7] - var26) * var37 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var29 + ((field3533[var7] - var29) * var37 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var32 + ((var0.faceColors3[var1] - var32) * var37 >> 16);
         }
      }

      if (var10 >= 50) {
         field3535[var4] = (int)modelViewportXs[var7];
         field3553[var4] = (int)modelViewportYs[var7];
         field3555[var4] = field3525[var7];
         field3554[var4++] = var0.faceColors3[var1];
      } else {
         int var27 = field3536[var7];
         int var30 = field3533[var7];
         int var33 = var0.faceColors3[var1];
         if (var9 >= 50) {
            int var38 = (50 - var10) * field3543[var9 - var10];
            field3535[var4] = var2 + (var27 + ((field3536[var6] - var27) * var38 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var30 + ((field3533[var6] - var30) * var38 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var33 + ((var0.faceColors2[var1] - var33) * var38 >> 16);
         }

         if (var8 >= 50) {
            int var39 = (50 - var10) * field3543[var8 - var10];
            field3535[var4] = var2 + (var27 + ((field3536[var5] - var27) * var39 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var30 + ((field3533[var5] - var30) * var39 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var33 + ((var0.faceColors1[var1] - var33) * var39 >> 16);
         }
      }

      int var28 = field3535[0];
      int var31 = field3535[1];
      int var34 = field3535[2];
      int var40 = field3553[0];
      int var15 = field3553[1];
      int var16 = field3553[2];
      int var17 = var0.faceBias == null ? 0 : var0.faceBias[var1] * 2;
      float var18 = WorldMapSectionType.method7174(field3555[0] - var17, 1627560534);
      float var19 = WorldMapSectionType.method7174(field3555[1] - var17, -567065014);
      float var20 = WorldMapSectionType.method7174(field3555[2] - var17, -2045006365);
      Rasterizer3D.clips.clipping = false;
      int var21 = Rasterizer3D.method5865();
      if (var4 == 3) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21) {
            Rasterizer3D.clips.clipping = true;
         }

         var0.method6821(var1, var40, var15, var16, var28, var31, var34, var18, var19, var20, field3554[0], field3554[1], field3554[2]);
      }

      if (var4 == 4) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21 || field3535[3] < 0 || field3535[3] > var21) {
            Rasterizer3D.clips.clipping = true;
         }

         if (var0.faceTextures != null && var0.faceTextures[var1] != -1) {
            int var24;
            int var41;
            int var43;
            if (var0.textureFaces != null && var0.textureFaces[var1] != -1) {
               int var25 = var0.textureFaces[var1] & 255;
               var41 = var0.texIndices1[var25];
               var43 = var0.texIndices2[var25];
               var24 = var0.texIndices3[var25];
            } else {
               var41 = var5;
               var43 = var6;
               var24 = var7;
            }

            short var44 = var0.faceTextures[var1];
            if (var0.faceColors3[var1] == -1) {
               Rasterizer3D.rasterTextureWithShadingAndLighting(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  var0.faceColors1[var1],
                  var0.faceColors1[var1],
                  var0.faceColors1[var1],
                  field3536[var41],
                  field3536[var43],
                  field3536[var24],
                  field3533[var41],
                  field3533[var43],
                  field3533[var24],
                  field3541[var41],
                  field3541[var43],
                  field3541[var24],
                  var44
               );
               Rasterizer3D.rasterTextureWithShadingAndLighting(
                  var40,
                  var16,
                  field3553[3],
                  var28,
                  var34,
                  field3535[3],
                  var18,
                  var20,
                  field3555[3],
                  var0.faceColors1[var1],
                  var0.faceColors1[var1],
                  var0.faceColors1[var1],
                  field3536[var41],
                  field3536[var43],
                  field3536[var24],
                  field3533[var41],
                  field3533[var43],
                  field3533[var24],
                  field3541[var41],
                  field3541[var43],
                  field3541[var24],
                  var44
               );
            } else {
               Rasterizer3D.rasterTextureWithShadingAndLighting(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  field3554[0],
                  field3554[1],
                  field3554[2],
                  field3536[var41],
                  field3536[var43],
                  field3536[var24],
                  field3533[var41],
                  field3533[var43],
                  field3533[var24],
                  field3541[var41],
                  field3541[var43],
                  field3541[var24],
                  var44
               );
               Rasterizer3D.rasterTextureWithShadingAndLighting(
                  var40,
                  var16,
                  field3553[3],
                  var28,
                  var34,
                  field3535[3],
                  var18,
                  var20,
                  field3555[3],
                  field3554[0],
                  field3554[2],
                  field3554[3],
                  field3536[var41],
                  field3536[var43],
                  field3536[var24],
                  field3533[var41],
                  field3533[var43],
                  field3533[var24],
                  field3541[var41],
                  field3541[var43],
                  field3541[var24],
                  var44
               );
            }
         } else {
            boolean var22 = var0.method6817(var1);
            if (var0.faceColors3[var1] == -1 && var22) {
               int var42 = field3522[var0.faceColors1[var1]];
               Rasterizer3D.rasterTriangle(var40, var15, var16, var28, var31, var34, var18, var19, var20, var42);
               Rasterizer3D.rasterTriangle(var40, var16, field3553[3], var28, var34, field3535[3], var18, var20, field3555[3], var42);
            } else if (var0.faceColors3[var1] == -1) {
               int var23 = field3522[var0.faceColors1[var1]];
               Rasterizer3D.rasterFlat(var40, var15, var16, var28, var31, var34, var18, var19, var20, var23);
               Rasterizer3D.rasterFlat(var40, var16, field3553[3], var28, var34, field3535[3], var18, var20, field3555[3], var23);
            } else if (var22) {
               Rasterizer3D.rasterTriangleWithGradient(var40, var15, var16, var28, var31, var34, var18, var19, var20, field3554[0], field3554[1], field3554[2]);
               Rasterizer3D.rasterTriangleWithGradient(
                  var40, var16, field3553[3], var28, var34, field3535[3], var18, var20, field3555[3], field3554[0], field3554[2], field3554[3]
               );
            } else {
               Rasterizer3D.rasterGouraud(var40, var15, var16, var28, var31, var34, var18, var19, var20, field3554[0], field3554[1], field3554[2]);
               Rasterizer3D.rasterGouraud(
                  var40, var16, field3553[3], var28, var34, field3535[3], var18, var20, field3555[3], field3554[0], field3554[2], field3554[3]
               );
            }
         }
      }
   }

   public Model(int var1, int var2, int var3, byte var4) {
      this.indicesCount = 0;
      this.field3502 = 0;
      this.texIndicesCount = 0;
      this.isSingleTile = false;
      this.modelColorOverride = null;
      this.field3498 = classJS.field3180;
      this.method6708(var1, var2, var3);
      this.field3502 = var4;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.texIndicesCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("av")
   void method6708(int var1, int var2, int var3) {
      this.method6872(var1, var2, var3);
      this.field3501 = new float[var1];
      this.field3507 = new float[var1];
      this.field3503 = new float[var1];
      this.indices1 = new int[var2];
      this.indices2 = new int[var2];
      this.indices3 = new int[var2];
      this.faceColors1 = new int[var2];
      this.faceColors2 = new int[var2];
      this.faceColors3 = new int[var2];
      if (var3 > 0) {
         this.texIndices1 = new int[var3];
         this.texIndices2 = new int[var3];
         this.texIndices3 = new int[var3];
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("at")
   void method6712(Model var1) {
      int var2 = this.indices1.length;
      if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field3502 != var1.field3502)) {
         this.faceRenderPriorities = new byte[var2];
         Arrays.fill(this.faceRenderPriorities, this.field3502);
      }

      if (this.faceAlphas == null && var1.faceAlphas != null) {
         this.faceAlphas = new byte[var2];
         Arrays.fill(this.faceAlphas, (byte)0);
      }

      if (this.faceTextures == null && var1.faceTextures != null) {
         this.faceTextures = new short[var2];
         Arrays.fill(this.faceTextures, (short)-1);
      }

      if (this.textureFaces == null && var1.textureFaces != null) {
         this.textureFaces = new byte[var2];
         Arrays.fill(this.textureFaces, (byte)-1);
      }

      if (this.faceBias == null && var1.faceBias != null) {
         this.faceBias = new byte[var2];
         Arrays.fill(this.faceBias, (byte)0);
      }
   }

   public int[] getFaceIndices2() {
      return this.indices2;
   }

   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("aj")
   public void method6716(Model var1) {
      this.method6858(var1);
      if (var1 != null) {
         this.method6712(var1);

         for (int var2 = 0; var2 < var1.indicesCount; var2++) {
            this.indices1[this.indicesCount] = var1.indices1[var2] + this.verticesCount;
            this.indices2[this.indicesCount] = var1.indices2[var2] + this.verticesCount;
            this.indices3[this.indicesCount] = var1.indices3[var2] + this.verticesCount;
            this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
            this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
            this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
            if (this.faceRenderPriorities != null) {
               this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field3502;
            }

            if (this.faceAlphas != null && var1.faceAlphas != null) {
               this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2];
            }

            if (this.faceTextures != null) {
               this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
            }

            if (this.textureFaces != null) {
               if (var1.textureFaces != null && var1.textureFaces[var2] != -1) {
                  this.textureFaces[this.indicesCount] = (byte)(var1.textureFaces[var2] + this.texIndicesCount);
               } else {
                  this.textureFaces[this.indicesCount] = -1;
               }
            }

            if (this.faceBias != null && var1.faceBias != null) {
               this.faceBias[this.indicesCount] = var1.faceBias[var2];
            }

            this.indicesCount++;
         }

         for (int var3 = 0; var3 < var1.texIndicesCount; var3++) {
            this.texIndices1[this.texIndicesCount] = var1.texIndices1[var3] + this.verticesCount;
            this.texIndices2[this.texIndicesCount] = var1.texIndices2[var3] + this.verticesCount;
            this.texIndices3[this.texIndicesCount] = var1.texIndices3[var3] + this.verticesCount;
            this.texIndicesCount++;
         }

         for (int var4 = 0; var4 < var1.verticesCount; var4++) {
            this.field3501[this.verticesCount] = var1.field3501[var4];
            this.field3507[this.verticesCount] = var1.field3507[var4];
            this.field3503[this.verticesCount] = var1.field3503[var4];
            this.verticesCount++;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("di")
   public void method6867() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         float var2 = this.field3503[var1];
         this.field3503[var1] = this.field3501[var1];
         this.field3501[var1] = -var2;
      }

      this.method6887();
   }

   @ObfuscatedSignature(descriptor = "(Z)Lky;")
   @ObfuscatedName("aw")
   public Model toSharedSequenceModel(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   @ObfuscatedSignature(descriptor = "(Z)Lky;")
   @ObfuscatedName("ac")
   public Model toSharedSpotAnimationModel(boolean var1) {
      if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;I)V")
   @ObfuscatedName("sw")
   public static void method6731(Model var0, int var1) {
      if (var0 == null) {
         var0.method6779();
      } else {
         AABB var2 = var0.getAABB(var1);
         if (var2 == null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = field3540[var1];
            int var10 = field3539[var1];

            for (int var11 = 0; var11 < var0.verticesCount; var11++) {
               int var12 = class348.method7747((int)var0.field3501[var11], (int)var0.field3503[var11], var9, var10, -1801183294);
               int var13 = (int)var0.field3507[var11];
               int var15 = (int)var0.field3501[var11];
               int var16 = (int)var0.field3503[var11];
               int var14 = var16 * var9 - var10 * var15 >> 16;
               if (var12 < var3) {
                  var3 = var12;
               }

               if (var12 > var6) {
                  var6 = var12;
               }

               if (var13 < var4) {
                  var4 = var13;
               }

               if (var13 > var7) {
                  var7 = var13;
               }

               if (var14 < var5) {
                  var5 = var14;
               }

               if (var14 > var8) {
                  var8 = var14;
               }
            }

            var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
            int var19 = -1659977647;
            if (var2.xMidOffset * 984504841 < 32) {
               var2.xMidOffset = 694847264;
            }

            if (var2.zMidOffset * 528344083 < 1103348003) {
               var2.zMidOffset = 1706083168;
            }

            if (var0.isSingleTile) {
               byte var20 = 8;
               var2.xMidOffset += -1973771832;
               var2.zMidOffset += 1500262616;
            }

            var2.aabb = var0.aabb;
            var0.aabb = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZLky;[B)Lky;")
   @ObfuscatedName("ab")
   Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
      this.method6855(var1, var2, var3);
      var2.verticesCount = this.verticesCount;
      var2.indicesCount = this.indicesCount;
      var2.texIndicesCount = this.texIndicesCount;
      if (var2.field3501 == null || var2.field3501.length < this.verticesCount) {
         var2.field3501 = new float[this.verticesCount + 100];
         var2.field3507 = new float[this.verticesCount + 100];
         var2.field3503 = new float[this.verticesCount + 100];
      }

      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         var2.field3501[var4] = this.field3501[var4];
         var2.field3507[var4] = this.field3507[var4];
         var2.field3503[var4] = this.field3503[var4];
      }

      if (var1) {
         var2.faceAlphas = this.faceAlphas;
      } else {
         var2.faceAlphas = var3;
         if (this.faceAlphas == null) {
            for (int var5 = 0; var5 < this.indicesCount; var5++) {
               var2.faceAlphas[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < this.indicesCount; var6++) {
               var2.faceAlphas[var6] = this.faceAlphas[var6];
            }
         }
      }

      var2.indices1 = this.indices1;
      var2.indices2 = this.indices2;
      var2.indices3 = this.indices3;
      var2.faceColors1 = this.faceColors1;
      var2.faceColors2 = this.faceColors2;
      var2.faceColors3 = this.faceColors3;
      var2.faceRenderPriorities = this.faceRenderPriorities;
      var2.textureFaces = this.textureFaces;
      var2.faceTextures = this.faceTextures;
      var2.faceBias = this.faceBias;
      var2.field3502 = this.field3502;
      var2.texIndices1 = this.texIndices1;
      var2.texIndices2 = this.texIndices2;
      var2.texIndices3 = this.texIndices3;
      var2.faceLabelsAlpha = this.faceLabelsAlpha;
      var2.field3518 = this.field3518;
      var2.vertexLabels = this.vertexLabels;
      var2.field3581 = this.field3581;
      var2.isSingleTile = this.isSingleTile;
      var2.modelColorOverride = this.modelColorOverride;
      var2.field3573 = this.field3573;
      var2.method6742();
      return var2;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("yd")
   public Model method6882() {
      this.resetBounds();
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void calculateBoundingBox(int var1) {
      AABB var2 = this.getAABB(var1);
      if (var2 == null) {
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = field3540[var1];
         int var10 = field3539[var1];

         for (int var11 = 0; var11 < this.verticesCount; var11++) {
            int var12 = class348.method7747((int)this.field3501[var11], (int)this.field3503[var11], var9, var10, 375165849);
            int var13 = (int)this.field3507[var11];
            int var15 = (int)this.field3501[var11];
            int var16 = (int)this.field3503[var11];
            int var14 = var16 * var9 - var10 * var15 >> 16;
            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }

            if (var14 < var5) {
               var5 = var14;
            }

            if (var14 > var8) {
               var8 = var14;
            }
         }

         var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
         byte var19 = 32;
         if (var2.xMidOffset * 984504841 < 32) {
            var2.xMidOffset = 694847264;
         }

         if (var2.zMidOffset * 528344083 < 32) {
            var2.zMidOffset = 1706083168;
         }

         if (this.isSingleTile) {
            byte var20 = 8;
            var2.xMidOffset += -1973771832;
            var2.zMidOffset += 1500262616;
         }

         var2.aabb = this.aabb;
         this.aabb = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lje;")
   @ObfuscatedName("ar")
   AABB getAABB(int var1) {
      for (AABB var2 = this.aabb; var2 != null; var2 = var2.aabb) {
         if (var2.orientation * -1506356863 == var1) {
            return var2;
         }
      }

      return null;
   }

   public int getUvBufferOffset() {
      return this.field3570;
   }

   public int[] getFaceIndices1() {
      return this.indices1;
   }

   @ObfuscatedSignature(descriptor = "(ILry;)V")
   @ObfuscatedName("be")
   public void method6883(int var1, TransformationMatrix var2) {
      method6720(this, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I)V")
   @ObfuscatedName("dg")
   void method6754(classFY var1, int var2) {
      Skeleton var3 = var1.field1921;

      for (int var4 = 0; var4 < var3.count * 1593543125; var4++) {
         int var5 = var3.transformTypes[var4];
         if (var5 == 5
            && var1.field1945 != null
            && var1.field1945[var4] != null
            && var1.field1945[var4][0] != null
            && this.field3518 != null
            && this.faceAlphas != null) {
            classFT var6 = var1.field1945[var4][0];

            for (int var10 : var3.labels[var4]) {
               if (var10 < this.field3518.length) {
                  int[] var11 = this.field3518[var10];

                  for (int var12 = 0; var12 < var11.length; var12++) {
                     int var13 = var11[var12];
                     int var14 = (int)((this.faceAlphas[var13] & 255) + var6.method4110(var2, (byte)-1) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = -723614246;
                     }

                     this.faceAlphas[var13] = (byte)var14;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[IIII)V")
   @ObfuscatedName("bk")
   void transform(int var1, int[] var2, int var3, int var4, int var5) {
      assert SecureUrlRequester.client.isClientThread();

      this.method6865(rl19.field5583, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   public void method6742() {
      this.radius = 0;
      this.aabb = null;
   }

   @ObfuscatedSignature(descriptor = "(Lky;Ljt;ILjt;I[I)V")
   @ObfuscatedName("cg")
   public static void method6758(Model var0, Frames var1, int var2, Frames var3, int var4, int[] var5) {
      if (var0 == null) {
         var0.animate2(var1, var2, var1, var2, var5);
      }

      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            Animation var6 = var1.frames[var2];
            Animation var7 = var3.frames[var4];
            Skeleton var8 = var6.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            method6879(-1);
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.transformCount; var11++) {
               int var12 = var6.transformYs[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.transformTypes[var12] == 0) {
                  var0.transform(
                     var8.transformTypes[var12], var8.labels[var12], var6.transformSkeletonLabels[var11], var6.transformZs[var11], var6.transformXs[var11]
                  );
               }
            }

            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            method6879(-1);
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.transformCount; var17++) {
               int var18 = var7.transformYs[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.transformTypes[var18] == 0) {
                  var0.transform(
                     var8.transformTypes[var18], var8.labels[var18], var7.transformSkeletonLabels[var17], var7.transformZs[var17], var7.transformXs[var17]
                  );
               }
            }

            var0.method6742();
         } else {
            var0.animate(var1, var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljt;I)V")
   @ObfuscatedName("aa")
   public void animate(Frames var1, int var2) {
      if (this.faceLabelsAlpha != null) {
         if (var2 != -1) {
            Animation var3 = var1.frames[var2];
            Skeleton var4 = var3.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            method6879(-1);

            for (int var5 = 0; var5 < var3.transformCount; var5++) {
               int var6 = var3.transformYs[var5];
               this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformSkeletonLabels[var5], var3.transformZs[var5], var3.transformXs[var5]);
            }

            this.method6742();
         }
      }
   }

   public void setSceneId(int var1) {
      this.field3568 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lky;")
   @ObfuscatedName("cc")
   public Model method6884(boolean var1) {
      return this.toSharedSpotAnimationModel(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I)V")
   @ObfuscatedName("zj")
   public void method6753(classFY var1, int var2) {
      Skeleton var3 = var1.field1921;
      class251 var4 = var3.method5403(-510419997);
      if (var4 != null) {
         var3.method5403(-510419997).method6165(var1, var2, (byte)53);
         Scene.method5518(this, var3.method5403(-510419997), var1.method4165((byte)80));
      }

      if (var1.method4169((byte)12)) {
         this.method6856(var1, var2);
      }

      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I)V")
   @ObfuscatedName("be")
   void method6856(classFY var1, int var2) {
      Skeleton var3 = var1.field1921;
      byte[] var4 = this.getFaceTransparencies();

      for (int var5 = 0; var5 < var3.count * 1593543125; var5++) {
         int var6 = var3.transformTypes[var5];
         if (var6 == 5 && var1.field1939 != null && var1.field1939[var5 * 1 + 0] != 0 && this.field3518 != null && var4 != null) {
            int var7 = var1.field1939[var5 * 1 + 0];

            for (int var11 : var3.labels[var5]) {
               if (var11 < this.field3518.length) {
                  int[] var12 = this.field3518[var11];

                  for (int var13 = 0; var13 < var12.length; var13++) {
                     int var14 = var12[var13];
                     int var15 = (int)((var4[var14] & 255) + var1.method4190(var7, var2) * 255.0F);
                     if (var15 < 0) {
                        var15 = 0;
                     } else if (var15 > 255) {
                        var15 = 255;
                     }

                     var4[var14] = (byte)var15;
                  }
               }
            }
         }
      }
   }

   public boolean useBoundingBox() {
      return this.isSingleTile;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("ax")
   public static void method6772(Model var0) {
      if (var0 == null) {
         var0.method6846();
      } else {
         for (int var1 = 0; var1 < var0.verticesCount; var1++) {
            int var2 = (int)var0.field3501[var1];
            var0.field3501[var1] = var0.field3503[var1];
            var0.field3503[var1] = -var2;
         }

         var0.method6742();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ei")
   public void method6864() {
      if (this.radius != 1) {
         this.radius = 1;
         float var1 = 0.0F;
         float var2 = 0.0F;
         float var3 = 0.0F;

         for (int var4 = 0; var4 < this.verticesCount; var4++) {
            float var5 = this.field3501[var4];
            float var6 = this.field3507[var4];
            float var7 = this.field3503[var4];
            if (-var6 > var1) {
               var1 = -var6;
            }

            if (var6 > var2) {
               var2 = var6;
            }

            float var8 = var5 * var5 + var7 * var7;
            if (var8 > var3) {
               var3 = var8;
            }
         }

         this.boundsType = (int)Math.ceil(var2);
         super.height = (int)Math.ceil(var1) * -689148287;
         this.diameter = (int)Math.ceil(Math.sqrt(var3));
         this.xzRadius = (int)Math.ceil(Math.sqrt(this.diameter * this.diameter + super.height * -1272589951 * super.height * -1272589951));
         this.bottomY = this.xzRadius + (int)Math.ceil(Math.sqrt(this.diameter * this.diameter + this.boundsType * this.boundsType));
      }
   }

   @ObfuscatedSignature(descriptor = "(ZLky;[B)V")
   @ObfuscatedName("wv")
   public void method6855(boolean var1, Model var2, byte[] var3) {
      var2.field3578 = this.field3578;
      var2.field3577 = this.field3577;
      var2.field3579 = this.field3579;
      var2.field3580 = this.field3580;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("fj")
   boolean method6816(int var1) {
      return var1 < this.field3573;
   }

   @ObfuscatedSignature(descriptor = "(IFFFFFFFFFIII)V")
   @ObfuscatedName("fa")
   final void method6819(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13
   ) {
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.textureFaces != null && this.textureFaces[var1] != -1) {
            int var17 = this.textureFaces[var1] & 255;
            var18 = this.texIndices1[var17];
            var15 = this.texIndices2[var17];
            var16 = this.texIndices3[var17];
         } else {
            var18 = this.indices1[var1];
            var15 = this.indices2[var1];
            var16 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            Rasterizer3D.rasterTextureWithShadingAndLighting(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var11,
               var11,
               field3536[var18],
               field3536[var15],
               field3536[var16],
               field3533[var18],
               field3533[var15],
               field3533[var16],
               field3541[var18],
               field3541[var15],
               field3541[var16],
               this.faceTextures[var1]
            );
         } else {
            Rasterizer3D.rasterTextureWithShadingAndLighting(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var12,
               var13,
               field3536[var18],
               field3536[var15],
               field3536[var16],
               field3533[var18],
               field3533[var15],
               field3533[var16],
               field3541[var18],
               field3541[var15],
               field3541[var16],
               this.faceTextures[var1]
            );
         }
      } else {
         boolean var14 = this.method6817(var1);
         if (this.faceColors3[var1] == -1 && var14) {
            Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3522[this.faceColors1[var1]]);
         } else if (this.faceColors3[var1] == -1) {
            Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3522[this.faceColors1[var1]]);
         } else if (var14) {
            Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         } else {
            Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("io")
   public static void method6773(Model var0) {
      if (var0 == null) {
         var0.method6776();
      }

      for (int var1 = 0; var1 < var0.verticesCount; var1++) {
         int var2 = (int)var0.field3501[var1];
         var0.field3501[var1] = var0.field3503[var1];
         var0.field3503[var1] = -var2;
      }

      var0.method6742();
   }

   @ObfuscatedSignature(descriptor = "(I)Lje;")
   @ObfuscatedName("bx")
   public AABB method6885(int var1) {
      return this.getAABB(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("et")
   public void method6846() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         float var2 = this.field3501[var1];
         this.field3501[var1] = this.field3503[var1];
         this.field3503[var1] = -var2;
      }

      this.method6887();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljq;I)V")
   @ObfuscatedName("vm")
   public static void method6828(Model var0, class251 var1, int var2) {
      if (var0.vertexLabels != null) {
         for (int var3 = 0; var3 < var0.verticesCount; var3++) {
            int[] var4 = var0.vertexLabels[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = var0.field3581[var3];
               TransformationMatrix.method9943(field3549, 987818339);

               for (int var6 = 0; var6 < var4.length; var6++) {
                  int var7 = var4[var6];
                  class136 var8 = var1.method6159(var7, -146335463);
                  if (var8 != null) {
                     field3550.method9950(var5[var6] / 255.0F, -1086687804);
                     TransformationMatrix.method10012(field3551, var8.method4073(var2, (byte)-24), -625828796);
                     TransformationMatrix.method9959(field3551, field3550, (byte)-35);
                     field3549.method10018(field3551, (byte)1);
                  }
               }

               method6720(var0, var3, field3549);
            }
         }
      }
   }

   public short[] getUnlitFaceColors() {
      return this.field3580;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kz")
   @Override
   void vmethod231(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      this.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bp")
   public void rotateZ(int var1) {
      int var2 = field3539[var1];
      int var3 = field3540[var1];

      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         int var5 = (int)this.field3507[var4] * var3 - (int)this.field3503[var4] * var2 >> 16;
         this.field3503[var4] = (int)this.field3507[var4] * var2 + (int)this.field3503[var4] * var3 >> 16;
         this.field3507[var4] = var5;
      }

      this.method6742();
   }

   public byte getOverrideHue() {
      return this.modelColorOverride != null ? this.modelColorOverride.overrideHue : 0;
   }

   public int[] getVertexNormalsY() {
      return this.field3577;
   }

   @ObfuscatedSignature(descriptor = "(Ljt;ILjt;I[I)V")
   @ObfuscatedName("dk")
   public void method6759(Frames var1, int var2, Frames var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            Animation var6 = var1.frames[var2];
            Animation var7 = var3.frames[var4];
            Skeleton var8 = var6.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.transformCount; var11++) {
               int var12 = var6.transformYs[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.transformTypes[var12] == 0) {
                  this.transform(
                     var8.transformTypes[var12], var8.labels[var12], var6.transformSkeletonLabels[var11], var6.transformZs[var11], var6.transformXs[var11]
                  );
               }
            }

            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.transformCount; var17++) {
               int var18 = var7.transformYs[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.transformTypes[var18] == 0) {
                  this.transform(
                     var8.transformTypes[var18], var8.labels[var18], var7.transformSkeletonLabels[var17], var7.transformZs[var17], var7.transformXs[var17]
                  );
               }
            }

            this.method6742();
         } else {
            this.animate(var1, var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IFFFFFFFFFIII)V")
   @ObfuscatedName("fm")
   final void method6820(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13
   ) {
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.textureFaces != null && this.textureFaces[var1] != -1) {
            int var17 = this.textureFaces[var1] & -673567206;
            var18 = this.texIndices1[var17];
            var15 = this.texIndices2[var17];
            var16 = this.texIndices3[var17];
         } else {
            var18 = this.indices1[var1];
            var15 = this.indices2[var1];
            var16 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            Rasterizer3D.rasterTextureWithShadingAndLighting(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var11,
               var11,
               field3536[var18],
               field3536[var15],
               field3536[var16],
               field3533[var18],
               field3533[var15],
               field3533[var16],
               field3541[var18],
               field3541[var15],
               field3541[var16],
               this.faceTextures[var1]
            );
         } else {
            Rasterizer3D.rasterTextureWithShadingAndLighting(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var12,
               var13,
               field3536[var18],
               field3536[var15],
               field3536[var16],
               field3533[var18],
               field3533[var15],
               field3533[var16],
               field3541[var18],
               field3541[var15],
               field3541[var16],
               this.faceTextures[var1]
            );
         }
      } else {
         boolean var14 = this.method6817(var1);
         if (this.faceColors3[var1] == -1 && var14) {
            Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3522[this.faceColors1[var1]]);
         } else if (this.faceColors3[var1] == -1) {
            Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3522[this.faceColors1[var1]]);
         } else if (var14) {
            Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         } else {
            Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fw")
   void method6807() {
      for (char var1 = 0; var1 < this.indicesCount; var1++) {
         if (!field3529[var1]) {
            int var2 = (field3526[this.indices1[var1]] + field3526[this.indices2[var1]] + field3526[this.indices3[var1]]) / 3 + this.xzRadius;
            char[] var10000 = field3528[var2];
            field3523[var2]++;
            var10000[field3523[var2]] = var1;
         }
      }

      if (this.faceRenderPriorities == null) {
         for (int var5 = this.bottomY - 1; var5 >= 0; var5--) {
            char var6 = field3523[var5];
            if (var6 > 0) {
               char[] var3 = field3528[var5];

               for (int var4 = 0; var4 < var6; var4++) {
                  this.method6813(var3[var4]);
               }
            }
         }
      } else {
         this.method6809();
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("en")
   public final void method6850(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         int var16 = var7;
         int var15 = var6;
         int var14 = var5;
         int var12 = var3;
         int var11 = var2;
         int var10 = var1;
         Model var9 = this;
         if (this.radius != 2) {
            this.method6845();
         }

         int var17 = Rasterizer3D.getClipMidX();
         int var18 = Rasterizer3D.getClipMidY();
         int var19 = field3539[var1];
         int var20 = field3540[var1];
         int var21 = field3539[var2];
         int var22 = field3540[var2];
         int var23 = field3539[var3];
         int var24 = field3540[var3];
         int var25 = field3539[var4];
         int var26 = field3540[var4];
         int var27 = var6 * var25 + var7 * var26 >> 16;

         for (int var28 = 0; var28 < var9.verticesCount; var28++) {
            int var29 = (int)var9.field3501[var28];
            int var30 = (int)var9.field3507[var28];
            int var31 = (int)var9.field3503[var28];
            if (var12 != 0) {
               int var32 = var30 * var23 + var29 * var24 >> 16;
               var30 = var30 * var24 - var29 * var23 >> 16;
               var29 = var32;
            }

            if (var10 != 0) {
               int var39 = var30 * var20 - var31 * var19 >> 16;
               var31 = var30 * var19 + var31 * var20 >> 16;
               var30 = var39;
            }

            if (var11 != 0) {
               int var40 = var31 * var21 + var29 * var22 >> 16;
               var31 = var31 * var22 - var29 * var21 >> 16;
               var29 = var40;
            }

            var29 += var14;
            var30 += var15;
            var31 += var16;
            int var41 = var30 * var26 - var31 * var25 >> 16;
            var31 = var30 * var25 + var31 * var26 >> 16;
            field3526[var28] = var31 - var27;
            modelViewportXs[var28] = var17 + var29 * Rasterizer3D.get3dZoom() / var31;
            modelViewportYs[var28] = var18 + var41 * Rasterizer3D.get3dZoom() / var31;
            field3525[var28] = var31;
            if (var9.faceTextures != null) {
               field3536[var28] = var29;
               field3533[var28] = var41;
               field3541[var28] = var31;
            }
         }

         try {
            var9.draw0(false, false, false, 0L);
         } catch (Exception var33) {
         }
      } catch (Exception var34) {
         client.field938.debug("failed drawing model", var34);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("fb")
   public final void method6790(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.radius != 2) {
         this.method6845();
      }

      int var9 = Rasterizer3D.getClipMidX();
      int var10 = Rasterizer3D.getClipMidY();
      int var11 = field3539[var1];
      int var12 = field3540[var1];
      int var13 = field3539[var2];
      int var14 = field3540[var2];
      int var15 = field3539[var3];
      int var16 = field3540[var3];
      int var17 = field3539[var4];
      int var18 = field3540[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for (int var20 = 0; var20 < this.verticesCount; var20++) {
         int var21 = (int)this.field3501[var20];
         int var22 = (int)this.field3507[var20];
         int var23 = (int)this.field3503[var20];
         if (var3 != 0) {
            int var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            int var30 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var30;
         }

         if (var2 != 0) {
            int var31 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var31;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         int var32 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field3526[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
         modelViewportYs[var20] = var10 + var32 * Rasterizer3D.get3dZoom() / var8;
         field3525[var20] = var8;
         if (this.faceTextures != null) {
            field3536[var20] = var21;
            field3533[var20] = var32;
            field3541[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("ge")
   @Override
   void vmethod234(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      this.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIJ)V")
   @ObfuscatedName("bw")
   void method6795(int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.faceAlphas != null) {
         int var9 = Rasterizer3D.Rasterizer3D_sine[var2];
         int var10 = Rasterizer3D.Rasterizer3D_cosine[var2];
         int var11 = Rasterizer3D.Rasterizer3D_sine[var3];
         int var12 = Rasterizer3D.Rasterizer3D_cosine[var3];
         float var13 = Rasterizer3D.field3038[var2];
         float var14 = Rasterizer3D.field3037[var2];
         float var15 = Rasterizer3D.field3038[var3];
         float var16 = Rasterizer3D.field3037[var3];
         if (this.radius != 1) {
            this.method6864();
         }

         this.calculateBoundingBox(var1);
         int var17 = var6 * var12 - var4 * var11 >> 16;
         int var18 = var5 * var9 + var17 * var10 >> 16;
         int var19 = this.diameter * var10 >> 16;
         int var20 = var18 + var19;
         if (var20 > 50 && var18 < AbstractRasterizer.method5428()) {
            int var21 = var6 * var11 + var4 * var12 >> 16;
            int var22 = (var21 - this.diameter) * Rasterizer3D.get3dZoom();
            if (var22 / var20 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
               int var23 = (var21 + this.diameter) * Rasterizer3D.get3dZoom();
               if (var23 / var20 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
                  int var24 = var5 * var10 - var17 * var9 >> 16;
                  int var25 = this.diameter * var9 >> 16;
                  int var26 = var25 + (this.boundsType * var10 >> 16);
                  int var27 = (var24 + var26) * Rasterizer3D.get3dZoom();
                  if (var27 / var20 > Rasterizer3D.method5859()) {
                     int var28 = var25 + (this.height * -1272589951 * var10 >> 16);
                     int var29 = (var24 - var28) * Rasterizer3D.get3dZoom();
                     if (var29 / var20 < Rasterizer3D.method5856()) {
                        int var30 = var19 + (this.height * -1272589951 * var9 >> 16);
                        boolean var31 = false;
                        boolean var32 = false;
                        if (var18 - var30 <= 50) {
                           var32 = true;
                        }

                        boolean var33 = var32 || this.faceTextures != null;
                        int var34 = UserComparator8.method3943(826934782);
                        int var35 = HttpMethod.method368(1649667460);
                        boolean var36 = ViewportMouse.ViewportMouse_isInViewport;
                        boolean var38 = WorldMapLabelSize.method7220(var7);
                        boolean var39 = false;
                        if (var38 && var36) {
                           boolean var40 = false;
                           if (field3537) {
                              var40 = WorldMapSection1.method7453(
                                 this,
                                 var1,
                                 var4,
                                 var5,
                                 var6,
                                 var13,
                                 var14,
                                 var15,
                                 var16,
                                 Rasterizer3D.getClipMidX(),
                                 Rasterizer3D.getClipMidY(),
                                 Rasterizer3D.get3dZoom(),
                                 201035158
                              );
                           } else {
                              int var41 = var18 - var19;
                              if (var41 <= 50) {
                                 var41 = 50;
                              }

                              if (var21 > 0) {
                                 var22 /= var20;
                                 var23 /= var41;
                              } else {
                                 var23 /= var20;
                                 var22 /= var41;
                              }

                              if (var24 > 0) {
                                 var29 /= var20;
                                 var27 /= var41;
                              } else {
                                 var27 /= var20;
                                 var29 /= var41;
                              }

                              int var42 = var34 - Rasterizer3D.getClipMidX();
                              int var43 = var35 - Rasterizer3D.getClipMidY();
                              if (var42 > var22 && var42 < var23 && var43 > var29 && var43 < var27) {
                                 var40 = true;
                              }
                           }

                           if (var40) {
                              if (this.isSingleTile) {
                                 int var55 = var5 - this.height * -1272589951 / 2;
                                 int var57 = var6 * var12 - var4 * var11 >> 16;
                                 var57 = var55 * var9 + var57 * var10 >> 16;
                                 int var60 = var57 - this.diameter;
                                 Varps.method8676(var7, var60, -2087507895);
                              } else {
                                 var39 = true;
                              }
                           }
                        }

                        int var54 = Rasterizer3D.getClipMidX();
                        int var56 = Rasterizer3D.getClipMidY();
                        float var59 = 0.0F;
                        float var61 = 0.0F;
                        if (var1 != 0) {
                           var59 = Rasterizer3D.field3038[var1];
                           var61 = Rasterizer3D.field3037[var1];
                        }

                        for (int var44 = 0; var44 < this.verticesCount; var44++) {
                           float var45 = (int)this.field3501[var44];
                           float var46 = (int)this.field3507[var44];
                           float var47 = (int)this.field3503[var44];
                           if (var1 != 0) {
                              float var48 = var47 * var59 + var45 * var61;
                              var47 = var47 * var61 - var45 * var59;
                              var45 = var48;
                           }

                           var45 += var4;
                           var46 += var5;
                           var47 += var6;
                           float var68 = var47 * var15 + var45 * var16;
                           var47 = var47 * var16 - var45 * var15;
                           float var69 = var46 * var14 - var47 * var13;
                           var47 = var46 * var13 + var47 * var14;
                           var31 |= this.method6797(var44, var68, var69, var47, var18, var54, var56, var33);
                        }

                        try {
                           this.draw0(var31, var39, this.isSingleTile, var7);
                        } catch (Exception var49) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lky;")
   @ObfuscatedName("by")
   public Model method6886(boolean var1) {
      return this.toSharedSequenceModel(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dd")
   void method6733(int var1) {
      AABB var2 = this.getAABB(var1);
      if (var2 == null) {
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = field3540[var1];
         int var10 = field3539[var1];

         for (int var11 = 0; var11 < this.verticesCount; var11++) {
            int var12 = class348.method7747((int)this.field3501[var11], (int)this.field3503[var11], var9, var10, -873326723);
            int var13 = (int)this.field3507[var11];
            int var15 = (int)this.field3501[var11];
            int var16 = (int)this.field3503[var11];
            int var14 = var16 * var9 - var10 * var15 >> 16;
            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }

            if (var14 < var5) {
               var5 = var14;
            }

            if (var14 > var8) {
               var8 = var14;
            }
         }

         var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
         int var19 = 1509340381;
         if (var2.xMidOffset * 984504841 < -1214578423) {
            var2.xMidOffset = -2057480940;
         }

         if (var2.zMidOffset * -937778360 < 32) {
            var2.zMidOffset = 1706083168;
         }

         if (this.isSingleTile) {
            byte var20 = 8;
            var2.xMidOffset += 893019215;
            var2.zMidOffset += 1500262616;
         }

         var2.aabb = this.aabb;
         this.aabb = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IFFFIIIZ)Z")
   @ObfuscatedName("bf")
   boolean method6797(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
      field3526[var1] = (int)var4 - var5;
      if (var8) {
         field3536[var1] = (int)var2;
         field3533[var1] = (int)var3;
         field3541[var1] = (int)var4;
      }

      if (var4 >= 50.0F) {
         modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
         modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
         field3525[var1] = var4;
         return false;
      } else {
         modelViewportXs[var1] = -5000.0F;
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fq")
   void method6802() {
      for (int var1 = 0; var1 < this.indicesCount; var1++) {
         if (!field3529[var1]) {
            this.method6813(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("kf")
   @Override
   void vmethod250(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.faceAlphas != null) {
         if (this.radius != 1) {
            this.method6864();
         }

         this.calculateBoundingBox(var1);
         class456 var8 = BuddyRankComparator.method3976(-814754263);
         var8.field5516.method9303(var1 * 0.0030679614F, 0.0F, 0.0F, -1574760321);
         var8.field5514.method9868(1.0F, 1.0F, 1.0F, 234291626);
         var8.field5515.method9868(var3, var4, var5, 816467043);
         TransformationMatrix var9 = SecureUrlRequester.method3893(-1569237267);
         var9.method10017(var8, (byte)119);
         TransformationMatrix.method9959(var9, var2, (byte)-120);
         int var10 = (int)var9.method9997(0.0F, 0.0F, 0.0F, (short)1603);
         boolean var11 = false;
         int var12 = var10 - this.xzRadius;
         boolean var13 = var12 <= -529785307 || this.faceTextures != null;
         boolean var14 = WorldMapLabelSize.method7220(var6);
         boolean var15 = false;
         if (var14) {
            boolean var16 = ViewportMouse.ViewportMouse_isInViewport;
            if (var16) {
               int var19 = Rasterizer3D.getClipMidX();
               int var20 = Rasterizer3D.getClipMidY();
               int var21 = Rasterizer3D.get3dZoom();
               boolean var22 = ViewportMouse.ViewportMouse_isInViewport;
               boolean var17;
               if (!var22) {
                  var17 = false;
               } else {
                  if (!ViewportMouse.ViewportMouse_false0) {
                     int var23 = 516758450;
                     int var24 = AbstractRasterizer.method5428();
                     int var25 = var23 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var26 = var23 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     int var27 = var24 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var28 = var24 * (ViewportMouse.ViewportMouse_y * -1495188900 - var20) / var21;
                     TransformationMatrix var29;
                     synchronized (TransformationMatrix.field5731) {
                        if (TransformationMatrix.field5729 * -1897438390 == 0) {
                           var29 = new TransformationMatrix(var2);
                        } else {
                           TransformationMatrix.method10012(
                              TransformationMatrix.field5731[(TransformationMatrix.field5729 -= -794138199) * -1539552615], var2, -586965319
                           );
                           var29 = TransformationMatrix.field5731[TransformationMatrix.field5729 * -1539552615];
                        }
                     }

                     var29.method9982(-2031227361);
                     float[] var31 = new float[3];
                     var29.transformPoint(var25, var26, var23, var31, 1045119330);
                     var25 = (int)var31[0];
                     var26 = (int)var31[1];
                     var23 = (int)var31[2];
                     var29.transformPoint(var27, var28, var24, var31, 1045119330);
                     var27 = (int)var31[0];
                     var28 = (int)var31[1];
                     var24 = (int)var31[2];
                     TransformationMatrix.method9929(var29, (byte)1);
                     ReflectionCheck.method3891(var25, var26, var23, var27, var28, var24, 327716789);
                  }

                  var17 = class179.method4238(this, var1, var3, var4, var5, 87650732);
               }

               if (var17) {
                  if (this.isSingleTile) {
                     int var43 = (int)var9.method9997(0.0F, this.height * -1272589951 / 2, 0.0F, (short)1603);
                     int var45 = var43 - this.diameter;
                     Varps.method8676(var6, var45, -407343089);
                  } else {
                     var15 = true;
                  }
               }
            }
         }

         int var34 = Rasterizer3D.getClipMidX();
         int var35 = Rasterizer3D.getClipMidY();

         for (int var18 = 0; var18 < this.verticesCount; var18++) {
            float var36 = (int)this.field3501[var18];
            float var38 = (int)this.field3507[var18];
            float var40 = (int)this.field3503[var18];
            var9.transformPoint(var36, var38, var40, field3544, 1045119330);
            var36 = field3544[0];
            var38 = field3544[1];
            var40 = field3544[2];
            var11 |= this.method6797(var18, var36, var38, var40, var10, var34, var35, var13);
         }

         var8.method9422((short)28979);
         TransformationMatrix.method9929(var9, (byte)1);

         try {
            this.draw0(var11, var15, this.isSingleTile, var6);
         } catch (Exception var32) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;Lfy;I)V")
   @ObfuscatedName("zw")
   public void method6875(rl19 var1, classFY var2, int var3) {
      Skeleton var4 = var2.field1921;
      class251 var5 = var4.field2814;
      if (var5 != null) {
         var5.method6171(var1, var2, var3, null, false);
         this.method6852(var1, var5, var2.field1929 * -157771145);
      }

      if (var2.field1933) {
         this.method6895(var2, var3);
      }

      this.method6887();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;III)V")
   @ObfuscatedName("uh")
   public static void method6785(Model var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.getTexIndices2();
      }

      for (int var4 = 0; var4 < var0.verticesCount; var4++) {
         var0.field3501[var4] = (int)var0.field3501[var4] + var1;
         var0.field3507[var4] = (int)var0.field3507[var4] + var2;
         var0.field3503[var4] = (int)var0.field3503[var4] + var3;
      }

      var0.method6742();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("df")
   void method6809() {
      for (int var1 = 0; var1 < 12; var1++) {
         field3532[var1] = 0;
         field3546[var1] = 0;
      }

      for (int var13 = this.bottomY - 1; var13 >= 0; var13--) {
         char var2 = field3523[var13];
         if (var2 > 0) {
            char[] var3 = field3528[var13];

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = var3[var4];
               byte var6 = this.faceRenderPriorities[var5];
               int var7 = field3532[var6]++;
               field3530[var6][var7] = var5;
               if (var6 < 10) {
                  field3546[var6] = field3546[var6] + var13;
               } else if (var6 == 10) {
                  field3520[var7] = var13;
               } else {
                  field3531[var7] = var13;
               }
            }
         }
      }

      int var14 = 0;
      if (field3532[1] > 0 || field3532[2] > 0) {
         var14 = (field3546[1] + field3546[2]) / (field3532[1] + field3532[2]);
      }

      int var15 = 0;
      if (field3532[3] > 0 || field3532[4] > 0) {
         var15 = (field3546[3] + field3546[4]) / (field3532[3] + field3532[4]);
      }

      int var16 = 0;
      if (field3532[6] > 0 || field3532[8] > 0) {
         var16 = (field3546[6] + field3546[8]) / (field3532[6] + field3532[8]);
      }

      int var18 = 0;
      int var19 = field3532[10];
      int[] var20 = field3530[10];
      int[] var8 = field3520;
      if (var18 == var19) {
         var18 = 0;
         var19 = field3532[11];
         var20 = field3530[11];
         var8 = field3531;
      }

      int var17;
      if (var18 < var19) {
         var17 = var8[var18];
      } else {
         var17 = -1000;
      }

      for (int var9 = 0; var9 < 10; var9++) {
         while (var9 == 0 && var17 > var14) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 3 && var17 > var15) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 5 && var17 > var16) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         int var10 = field3532[var9];
         int[] var11 = field3530[var9];

         for (int var12 = 0; var12 < var10; var12++) {
            this.method6813(var11[var12]);
         }
      }

      while (var17 != -1000) {
         this.method6813(var20[var18++]);
         if (var18 == var19 && var20 != field3530[11]) {
            var18 = 0;
            var20 = field3530[11];
            var19 = field3532[11];
            var8 = field3531;
         }

         if (var18 < var19) {
            var17 = var8[var18];
         } else {
            var17 = -1000;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("em")
   public void method6866() {
      if (this.field3578 == null && (client.field997 & 4) == 4) {
         int var1 = this.getVerticesCount();
         this.field3578 = new int[var1];
         this.field3577 = new int[var1];
         this.field3579 = new int[var1];
         int[] var2 = this.getFaceIndices1();
         int[] var3 = this.getFaceIndices2();
         int[] var4 = this.getFaceIndices3();
         float[] var5 = this.getVerticesX();
         float[] var6 = this.getVerticesY();
         float[] var7 = this.getVerticesZ();

         for (int var8 = 0; var8 < this.getFaceCount(); var8++) {
            int var9 = var2[var8];
            int var10 = var3[var8];
            int var11 = var4[var8];
            int var12 = (int)(var5[var10] - var5[var9]);
            int var13 = (int)(var6[var10] - var6[var9]);
            int var14 = (int)(var7[var10] - var7[var9]);
            int var15 = (int)(var5[var11] - var5[var9]);
            int var16 = (int)(var6[var11] - var6[var9]);
            int var17 = (int)(var7[var11] - var7[var9]);
            int var18 = var13 * var17 - var16 * var14;
            int var19 = var14 * var15 - var17 * var12;

            int var20;
            for (var20 = var12 * var16 - var15 * var13;
               var18 > 8192 || var19 > 8192 || var20 > 8192 || var18 < -8192 || var19 < -8192 || var20 < -8192;
               var20 >>= 1
            ) {
               var18 >>= 1;
               var19 >>= 1;
            }

            int var21 = (int)Math.sqrt(var18 * var18 + var19 * var19 + var20 * var20);
            if (var21 <= 0) {
               var21 = 1;
            }

            var18 = var18 * 256 / var21;
            var19 = var19 * 256 / var21;
            var20 = var20 * 256 / var21;
            this.field3578[var9] = this.field3578[var9] + var18;
            this.field3577[var9] = this.field3577[var9] + var19;
            this.field3579[var9] = this.field3579[var9] + var20;
            this.field3578[var10] = this.field3578[var10] + var18;
            this.field3577[var10] = this.field3577[var10] + var19;
            this.field3579[var10] = this.field3579[var10] + var20;
            this.field3578[var11] = this.field3578[var11] + var18;
            this.field3577[var11] = this.field3577[var11] + var19;
            this.field3579[var11] = this.field3579[var11] + var20;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IFFFFFFFFFIII)V")
   @ObfuscatedName("bq")
   final void method6821(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13
   ) {
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.textureFaces != null && this.textureFaces[var1] != -1) {
            int var17 = this.textureFaces[var1] & 255;
            var18 = this.texIndices1[var17];
            var15 = this.texIndices2[var17];
            var16 = this.texIndices3[var17];
         } else {
            var18 = this.indices1[var1];
            var15 = this.indices2[var1];
            var16 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            Rasterizer3D.rasterTextureWithShadingAndLighting(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var11,
               var11,
               field3536[var18],
               field3536[var15],
               field3536[var16],
               field3533[var18],
               field3533[var15],
               field3533[var16],
               field3541[var18],
               field3541[var15],
               field3541[var16],
               this.faceTextures[var1]
            );
         } else {
            Rasterizer3D.rasterTextureWithShadingAndLighting(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var12,
               var13,
               field3536[var18],
               field3536[var15],
               field3536[var16],
               field3533[var18],
               field3533[var15],
               field3533[var16],
               field3541[var18],
               field3541[var15],
               field3541[var16],
               this.faceTextures[var1]
            );
         }
      } else {
         boolean var14 = this.method6817(var1);
         if (this.faceColors3[var1] == -1 && var14) {
            Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3522[this.faceColors1[var1]]);
         } else if (this.faceColors3[var1] == -1) {
            Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3522[this.faceColors1[var1]]);
         } else if (var14) {
            Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         } else {
            Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljc;Lfy;I[ZZZ)V")
   @ObfuscatedName("ea")
   public void method6762(Skeleton var1, classFY var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class251 var7 = var1.method5403(-510419997);
      if (var7 != null) {
         var7.method6172(var2, var3, var4, var5, 1311210027);
         if (var6) {
            Scene.method5518(this, var7, var2.method4165((byte)112));
         }
      }

      if (!var5 && var2.method4169((byte)12)) {
         this.method6856(var2, var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIIIIIII)V")
   @ObfuscatedName("si")
   public static void method6791(Model var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var0.radius != 2) {
         var0.method6845();
      }

      int var9 = Rasterizer3D.getClipMidX();
      int var10 = Rasterizer3D.getClipMidY();
      int var11 = field3539[var1];
      int var12 = field3540[var1];
      int var13 = field3539[var2];
      int var14 = field3540[var2];
      int var15 = field3539[var3];
      int var16 = field3540[var3];
      int var17 = field3539[var4];
      int var18 = field3540[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for (int var20 = 0; var20 < var0.verticesCount; var20++) {
         int var21 = (int)var0.field3501[var20];
         int var22 = (int)var0.field3507[var20];
         int var23 = (int)var0.field3503[var20];
         if (var3 != 0) {
            int var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            int var30 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var30;
         }

         if (var2 != 0) {
            int var31 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var31;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         int var32 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field3526[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
         modelViewportYs[var20] = var10 + var32 * Rasterizer3D.get3dZoom() / var8;
         field3525[var20] = var8;
         if (var0.faceTextures != null) {
            field3536[var20] = var21;
            field3533[var20] = var32;
            field3541[var20] = var23;
         }
      }

      try {
         var0.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lje;")
   @ObfuscatedName("hd")
   public AABB method6868(int var1) {
      this.calculateExtreme(var1);
      AABB var2 = this.method6885(var1);

      assert var2 != null;

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dh")
   public void method6887() {
      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Ljq;I)V")
   @ObfuscatedName("do")
   void method6874(class251 var1, int var2) {
      this.method6852(rl19.field5583, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lko;S)V")
   @ObfuscatedName("cm")
   public void method6832(ModelColorOverride var1, short var2) {
      if (this.modelColorOverride == null) {
         this.modelColorOverride = new ModelColorOverride();
      }

      this.modelColorOverride.method6530(var1);
      this.field3573 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lky;III)V")
   @ObfuscatedName("sq")
   public static void method6851(Model var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.scale(var1, var1, var1);
      } else {
         for (int var4 = 0; var4 < var0.verticesCount; var4++) {
            var0.field3501[var4] = var1 * var0.field3501[var4] / 128.0F;
            var0.field3507[var4] = var2 * var0.field3507[var4] / 128.0F;
            var0.field3503[var4] = var3 * var0.field3503[var4] / 128.0F;
         }

         var0.method6887();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dv")
   public void method6835() {
      this.modelColorOverride = null;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("js")
   public Model method6888() {
      this.method6846();
      return this;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("gt")
   public void method6871(float var1) {
      for (int var2 = 0; var2 < this.verticesCount; var2++) {
         this.field3507[var2] = this.field3507[var2] * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljt;I)V")
   @ObfuscatedName("dm")
   public void method6749(Frames var1, int var2) {
      if (this.faceLabelsAlpha != null) {
         if (var2 != -1) {
            Animation var3 = var1.frames[var2];
            Skeleton var4 = var3.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;

            for (int var5 = 0; var5 < var3.transformCount; var5++) {
               int var6 = var3.transformYs[var5];
               this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformSkeletonLabels[var5], var3.transformZs[var5], var3.transformXs[var5]);
            }

            this.method6742();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("ko")
   @Override
   void vmethod230(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      this.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   public int getBufferOffset() {
      return this.field3569;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kp")
   @Override
   void vmethod232(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      this.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   public byte[] getFaceTransparencies() {
      return this.faceAlphas;
   }

   public int getXYZMag() {
      return this.diameter;
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)V")
   @ObfuscatedName("xc")
   public static void method6870(Model var0, int var1) {
      if (var0 == null) {
         var0.method6897(var1);
      }

      for (int var2 = 0; var2 < var0.verticesCount; var2++) {
         var0.field3507[var2] = var0.field3507[var2] + var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIJIIZ)V")
   @ObfuscatedName("kt")
   @Override
   void vmethod233(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      this.method6795(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("cn")
   void method6709(int var1, int var2, int var3) {
      this.field3501 = new float[var1];
      this.field3507 = new float[var1];
      this.field3503 = new float[var1];
      this.indices1 = new int[var2];
      this.indices2 = new int[var2];
      this.indices3 = new int[var2];
      this.faceColors1 = new int[var2];
      this.faceColors2 = new int[var2];
      this.faceColors3 = new int[var2];
      if (var3 > 0) {
         this.texIndices1 = new int[var3];
         this.texIndices2 = new int[var3];
         this.texIndices3 = new int[var3];
      }
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("ku")
   @Override
   void vmethod251(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.faceAlphas != null) {
         if (this.radius != 1) {
            this.method6864();
         }

         this.calculateBoundingBox(var1);
         class456 var8 = BuddyRankComparator.method3976(-814754263);
         var8.field5516.method9303(var1 * 0.0030679614F, 0.0F, 0.0F, -1574760321);
         var8.field5514.method9868(1.0F, 1.0F, 1.0F, -1965816862);
         var8.field5515.method9868(var3, var4, var5, 1164987114);
         TransformationMatrix var9 = SecureUrlRequester.method3893(1437160983);
         var9.method10017(var8, (byte)81);
         TransformationMatrix.method9959(var9, var2, (byte)-79);
         int var10 = (int)var9.method9997(0.0F, 0.0F, 0.0F, (short)1603);
         boolean var11 = false;
         int var12 = var10 - this.xzRadius;
         boolean var13 = var12 <= 50 || this.faceTextures != null;
         boolean var14 = WorldMapLabelSize.method7220(var6);
         boolean var15 = false;
         if (var14) {
            boolean var16 = ViewportMouse.ViewportMouse_isInViewport;
            if (var16) {
               int var19 = Rasterizer3D.getClipMidX();
               int var20 = Rasterizer3D.getClipMidY();
               int var21 = Rasterizer3D.get3dZoom();
               boolean var22 = ViewportMouse.ViewportMouse_isInViewport;
               boolean var17;
               if (!var22) {
                  var17 = false;
               } else {
                  if (!ViewportMouse.ViewportMouse_false0) {
                     int var23 = 50;
                     int var24 = AbstractRasterizer.method5428();
                     int var25 = var23 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var26 = var23 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     int var27 = var24 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var28 = var24 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     TransformationMatrix var29;
                     synchronized (TransformationMatrix.field5731) {
                        if (TransformationMatrix.field5729 * -1539552615 == 0) {
                           var29 = new TransformationMatrix(var2);
                        } else {
                           TransformationMatrix.method10012(
                              TransformationMatrix.field5731[(TransformationMatrix.field5729 -= -794138199) * -1539552615], var2, -1441008924
                           );
                           var29 = TransformationMatrix.field5731[TransformationMatrix.field5729 * -1539552615];
                        }
                     }

                     var29.method9982(344097076);
                     float[] var31 = new float[3];
                     var29.transformPoint(var25, var26, var23, var31, 1045119330);
                     var25 = (int)var31[0];
                     var26 = (int)var31[1];
                     var23 = (int)var31[2];
                     var29.transformPoint(var27, var28, var24, var31, 1045119330);
                     var27 = (int)var31[0];
                     var28 = (int)var31[1];
                     var24 = (int)var31[2];
                     TransformationMatrix.method9929(var29, (byte)1);
                     ReflectionCheck.method3891(var25, var26, var23, var27, var28, var24, 327716789);
                  }

                  var17 = class179.method4238(this, var1, var3, var4, var5, 2050102559);
               }

               if (var17) {
                  if (this.isSingleTile) {
                     int var43 = (int)var9.method9997(0.0F, this.height * -1272589951 / 2, 0.0F, (short)1603);
                     int var45 = var43 - this.diameter;
                     Varps.method8676(var6, var45, -1033496495);
                  } else {
                     var15 = true;
                  }
               }
            }
         }

         int var34 = Rasterizer3D.getClipMidX();
         int var35 = Rasterizer3D.getClipMidY();

         for (int var18 = 0; var18 < this.verticesCount; var18++) {
            float var36 = (int)this.field3501[var18];
            float var38 = (int)this.field3507[var18];
            float var40 = (int)this.field3503[var18];
            var9.transformPoint(var36, var38, var40, field3544, 1045119330);
            var36 = field3544[0];
            var38 = field3544[1];
            var40 = field3544[2];
            var11 |= this.method6797(var18, var36, var38, var40, var10, var34, var35, var13);
         }

         var8.method9422((short)12160);
         TransformationMatrix.method9929(var9, (byte)1);

         try {
            this.draw0(var11, var15, this.isSingleTile, var6);
         } catch (Exception var32) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   public void rotateY270Ccw() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         int var2 = (int)this.field3501[var1];
         this.field3501[var1] = this.field3503[var1];
         this.field3503[var1] = -var2;
      }

      this.method6742();
   }

   public int[] getFaceColors3() {
      return this.faceColors3;
   }

   @ObfuscatedSignature(descriptor = "(Ljq;I)V")
   @ObfuscatedName("ct")
   void method6829(class251 var1, int var2) {
      if (this.vertexLabels != null) {
         for (int var3 = 0; var3 < this.verticesCount; var3++) {
            int[] var4 = this.vertexLabels[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field3581[var3];
               TransformationMatrix.method9943(field3549, -1624781042);

               for (int var6 = 0; var6 < var4.length; var6++) {
                  int var7 = var4[var6];
                  class136 var8 = var1.method6159(var7, -146335463);
                  if (var8 != null) {
                     field3550.method9950(var5[var6] / 255.0F, 1542350418);
                     TransformationMatrix.method10012(field3551, var8.method4073(var2, (byte)-31), -1420165815);
                     TransformationMatrix.method9959(field3551, field3550, (byte)-103);
                     field3549.method10018(field3551, (byte)1);
                  }
               }

               method6720(this, var3, field3549);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;I[IFFF)V")
   @ObfuscatedName("ss")
   public void method6849(rl19 var1, int var2, int[] var3, float var4, float var5, float var6) {
      if (var2 == 0) {
         int var7 = 0;
         var1.field5585 = var1.field5584 = var1.field5586 = 0.0F;

         for (int var8 = 0; var8 < var3.length; var8++) {
            int var9 = var3[var8];
            if (var9 < this.faceLabelsAlpha.length) {
               int[] var10 = this.faceLabelsAlpha[var9];

               for (int var11 = 0; var11 < var10.length; var11++) {
                  int var12 = var10[var11];
                  var1.field5585 = var1.field5585 + this.field3501[var12];
                  var1.field5584 = var1.field5584 + this.field3507[var12];
                  var1.field5586 = var1.field5586 + this.field3503[var12];
                  var7++;
               }
            }
         }

         if (var7 > 0) {
            var1.field5585 = var4 + var1.field5585 / var7;
            var1.field5584 = var5 + var1.field5584 / var7;
            var1.field5586 = var6 + var1.field5586 / var7;
         } else {
            var1.field5585 = var4;
            var1.field5584 = var5;
            var1.field5586 = var6;
         }
      } else if (var2 == 1) {
         for (int var22 = 0; var22 < var3.length; var22++) {
            int var26 = var3[var22];
            if (var26 < this.faceLabelsAlpha.length) {
               int[] var30 = this.faceLabelsAlpha[var26];

               for (int var34 = 0; var34 < var30.length; var34++) {
                  int var38 = var30[var34];
                  this.field3501[var38] = this.field3501[var38] + var4;
                  this.field3507[var38] = this.field3507[var38] + var5;
                  this.field3503[var38] = this.field3503[var38] + var6;
               }
            }
         }
      } else if (var2 == 2) {
         float var23 = var4 * 8.0F * 0.0030679617F;
         float var27 = var5 * 8.0F * 0.0030679617F;
         float var31 = var6 * 8.0F * 0.0030679617F;
         float var35 = 0.0F;
         float var39 = 0.0F;
         float var42 = 0.0F;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         if (var23 != 0.0F) {
            var35 = (float)Math.sin(var23);
            var39 = (float)Math.cos(var23);
         }

         if (var27 != 0.0F) {
            var42 = (float)Math.sin(var27);
            var13 = (float)Math.cos(var27);
         }

         if (var31 != 0.0F) {
            var14 = (float)Math.sin(var31);
            var15 = (float)Math.cos(var31);
         }

         for (int var16 = 0; var16 < var3.length; var16++) {
            int var17 = var3[var16];
            if (var17 < this.faceLabelsAlpha.length) {
               int[] var18 = this.faceLabelsAlpha[var17];

               for (int var19 = 0; var19 < var18.length; var19++) {
                  int var20 = var18[var19];
                  this.field3501[var20] = this.field3501[var20] - var1.field5585;
                  this.field3507[var20] = this.field3507[var20] - var1.field5584;
                  this.field3503[var20] = this.field3503[var20] - var1.field5586;
                  if (var31 != 0.0F) {
                     float var21 = var14 * this.field3507[var20] + var15 * this.field3501[var20];
                     this.field3507[var20] = var15 * this.field3507[var20] - var14 * this.field3501[var20];
                     this.field3501[var20] = var21;
                  }

                  if (var23 != 0.0F) {
                     float var44 = var39 * this.field3507[var20] - var35 * this.field3503[var20];
                     this.field3503[var20] = var35 * this.field3507[var20] + var39 * this.field3503[var20];
                     this.field3507[var20] = var44;
                  }

                  if (var27 != 0.0F) {
                     float var45 = var42 * this.field3503[var20] + var13 * this.field3501[var20];
                     this.field3503[var20] = var13 * this.field3503[var20] - var42 * this.field3501[var20];
                     this.field3501[var20] = var45;
                  }

                  this.field3501[var20] = this.field3501[var20] + var1.field5585;
                  this.field3507[var20] = this.field3507[var20] + var1.field5584;
                  this.field3503[var20] = this.field3503[var20] + var1.field5586;
               }
            }
         }
      } else if (var2 == 3) {
         for (int var24 = 0; var24 < var3.length; var24++) {
            int var28 = var3[var24];
            if (var28 < this.faceLabelsAlpha.length) {
               int[] var32 = this.faceLabelsAlpha[var28];

               for (int var36 = 0; var36 < var32.length; var36++) {
                  int var40 = var32[var36];
                  this.field3501[var40] = this.field3501[var40] - var1.field5585;
                  this.field3507[var40] = this.field3507[var40] - var1.field5584;
                  this.field3503[var40] = this.field3503[var40] - var1.field5586;
                  this.field3501[var40] = var4 * this.field3501[var40] / 128.0F;
                  this.field3507[var40] = var5 * this.field3507[var40] / 128.0F;
                  this.field3503[var40] = var6 * this.field3503[var40] / 128.0F;
                  this.field3501[var40] = this.field3501[var40] + var1.field5585;
                  this.field3507[var40] = this.field3507[var40] + var1.field5584;
                  this.field3503[var40] = this.field3503[var40] + var1.field5586;
               }
            }
         }
      } else if (var2 == 5 && this.field3518 != null && this.faceAlphas != null) {
         for (int var25 = 0; var25 < var3.length; var25++) {
            int var29 = var3[var25];
            if (var29 < this.field3518.length) {
               int[] var33 = this.field3518[var29];

               for (int var37 = 0; var37 < var33.length; var37++) {
                  int var41 = var33[var37];
                  int var43 = (this.faceAlphas[var41] & 255) + (int)var4 * 8;
                  if (var43 < 0) {
                     var43 = 0;
                  } else if (var43 > 255) {
                     var43 = 255;
                  }

                  this.faceAlphas[var41] = (byte)var43;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("co")
   void method6710(int var1, int var2, int var3) {
      this.field3501 = new float[var1];
      this.field3507 = new float[var1];
      this.field3503 = new float[var1];
      this.indices1 = new int[var2];
      this.indices2 = new int[var2];
      this.indices3 = new int[var2];
      this.faceColors1 = new int[var2];
      this.faceColors2 = new int[var2];
      this.faceColors3 = new int[var2];
      if (var3 > 0) {
         this.texIndices1 = new int[var3];
         this.texIndices2 = new int[var3];
         this.texIndices3 = new int[var3];
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("cx")
   void method6713(Model var1) {
      int var2 = this.indices1.length;
      if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field3502 != var1.field3502)) {
         this.faceRenderPriorities = new byte[var2];
         Arrays.fill(this.faceRenderPriorities, this.field3502);
      }

      if (this.faceAlphas == null && var1.faceAlphas != null) {
         this.faceAlphas = new byte[var2];
         Arrays.fill(this.faceAlphas, (byte)0);
      }

      if (this.faceTextures == null && var1.faceTextures != null) {
         this.faceTextures = new short[var2];
         Arrays.fill(this.faceTextures, (short)-1);
      }

      if (this.textureFaces == null && var1.textureFaces != null) {
         this.textureFaces = new byte[var2];
         Arrays.fill(this.textureFaces, (byte)-1);
      }

      if (this.faceBias == null && var1.faceBias != null) {
         this.faceBias = new byte[var2];
         Arrays.fill(this.faceBias, (byte)0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("cg")
   void method6714(Model var1) {
      int var2 = this.indices1.length;
      if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field3502 != var1.field3502)) {
         this.faceRenderPriorities = new byte[var2];
         Arrays.fill(this.faceRenderPriorities, this.field3502);
      }

      if (this.faceAlphas == null && var1.faceAlphas != null) {
         this.faceAlphas = new byte[var2];
         Arrays.fill(this.faceAlphas, (byte)0);
      }

      if (this.faceTextures == null && var1.faceTextures != null) {
         this.faceTextures = new short[var2];
         Arrays.fill(this.faceTextures, (short)-1);
      }

      if (this.textureFaces == null && var1.textureFaces != null) {
         this.textureFaces = new byte[var2];
         Arrays.fill(this.textureFaces, (byte)-1);
      }

      if (this.faceBias == null && var1.faceBias != null) {
         this.faceBias = new byte[var2];
         Arrays.fill(this.faceBias, (byte)0);
      }
   }

   Model() {
      this.indicesCount = 0;
      this.field3502 = 0;
      this.texIndicesCount = 0;
      this.isSingleTile = false;
      this.modelColorOverride = null;
      this.field3498 = classJS.field3180;
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Lky;")
   @ObfuscatedName("cz")
   public Model method6719(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method6864();
      int var7 = var2 - this.diameter;
      int var8 = var2 + this.diameter;
      int var9 = var4 - this.diameter;
      int var10 = var4 + this.diameter;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            Model var11;
            if (var5) {
               var11 = new Model(this);
               var11.field3507 = new float[var11.verticesCount];
            } else {
               var11 = this;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.verticesCount; var12++) {
                  int var13 = (int)this.field3501[var12] + var2;
                  int var14 = (int)this.field3503[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field3507[var12] = (int)this.field3507[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.verticesCount; var27++) {
                  int var28 = (-((int)this.field3507[var27]) << 16) / (this.height * -1272589951);
                  if (var28 < var6) {
                     int var29 = (int)this.field3501[var27] + var2;
                     int var30 = (int)this.field3503[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field3507[var27] = (int)this.field3507[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field3507[var27] = this.field3507[var27];
                  }
               }
            }

            var11.method6742();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;Ljs;)V")
   @ObfuscatedName("dp")
   public static void method6841(Model var0, classJS var1) {
      if (var0 == null) {
         var0.method6844(var1);
      } else {
         var0.field3498 = var1;
      }
   }

   public int[] getFaceColors1() {
      return this.faceColors1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljt;I[IZ)V")
   @ObfuscatedName("lw")
   public static void method6767(Model var0, Frames var1, int var2, int[] var3, boolean var4) {
      if (var0 == null) {
         var0.method6734(var2);
      } else if (var3 == null) {
         var0.animate(var1, var2);
      } else {
         Animation var5 = var1.frames[var2];
         Skeleton var6 = var5.skeleton;
         int var7 = 0;
         int var8 = var3[var7++];
         Model_transformTempX = 0;
         Model_transformTempY = 0;
         Model_transformTempZ = 0;

         for (int var9 = 0; var9 < var5.transformCount; var9++) {
            int var10 = var5.transformYs[var9];

            while (var10 > var8) {
               var8 = var3[var7++];
            }

            if (var4) {
               if (var10 == var8 || var6.transformTypes[var10] == 0) {
                  var0.transform(
                     var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
                  );
               }
            } else if (var10 != var8 || var6.transformTypes[var10] == 0) {
               var0.transform(
                  var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fs")
   public void method6872(int var1, int var2, int var3) {
      if ((client.field997 & 64) != 0) {
         this.field3580 = new short[var2];
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public void resetBounds() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3501[var1] = -this.field3501[var1];
         this.field3503[var1] = -this.field3503[var1];
      }

      this.method6887();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("li")
   public static void method6738(Model var0) {
      if (var0.radius != 2) {
         var0.radius = 2;
         var0.diameter = 0;

         for (int var1 = 0; var1 < var0.verticesCount; var1++) {
            int var2 = (int)var0.field3501[var1];
            int var3 = (int)var0.field3507[var1];
            int var4 = (int)var0.field3503[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > var0.diameter) {
               var0.diameter = var5;
            }
         }

         var0.diameter = (int)(Math.sqrt(var0.diameter) + 0.99);
         var0.xzRadius = var0.diameter;
         var0.bottomY = var0.diameter + var0.diameter;
      }
   }

   public byte getOverrideAmount() {
      return this.modelColorOverride != null ? this.modelColorOverride.overrideAmount : 0;
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("kq")
   @Override
   void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.faceAlphas != null) {
         if (this.radius != 1) {
            this.method6864();
         }

         this.calculateBoundingBox(var1);
         class456 var8 = BuddyRankComparator.method3976(-814754263);
         var8.field5516.method9303(var1 * 0.0030679614F, 0.0F, 0.0F, -1574760321);
         var8.field5514.method9868(1.0F, 1.0F, 1.0F, 813611793);
         var8.field5515.method9868(var3, var4, var5, 912173457);
         TransformationMatrix var9 = SecureUrlRequester.method3893(-1605707109);
         var9.method10017(var8, (byte)43);
         TransformationMatrix.method9959(var9, var2, (byte)-28);
         int var10 = (int)var9.method9997(0.0F, 0.0F, 0.0F, (short)1603);
         boolean var11 = false;
         int var12 = var10 - this.xzRadius;
         boolean var13 = var12 <= 50 || this.faceTextures != null;
         boolean var14 = WorldMapLabelSize.method7220(var6);
         boolean var15 = false;
         if (var14) {
            boolean var16 = ViewportMouse.ViewportMouse_isInViewport;
            if (var16) {
               int var19 = Rasterizer3D.getClipMidX();
               int var20 = Rasterizer3D.getClipMidY();
               int var21 = Rasterizer3D.get3dZoom();
               boolean var22 = ViewportMouse.ViewportMouse_isInViewport;
               boolean var17;
               if (!var22) {
                  var17 = false;
               } else {
                  if (!ViewportMouse.ViewportMouse_false0) {
                     int var23 = 50;
                     int var24 = AbstractRasterizer.method5428();
                     int var25 = var23 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var26 = var23 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     int var27 = var24 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var28 = var24 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     TransformationMatrix var29;
                     synchronized (TransformationMatrix.field5731) {
                        if (TransformationMatrix.field5729 * -1539552615 == 0) {
                           var29 = new TransformationMatrix(var2);
                        } else {
                           TransformationMatrix.method10012(
                              TransformationMatrix.field5731[(TransformationMatrix.field5729 -= -794138199) * -1539552615], var2, -685428911
                           );
                           var29 = TransformationMatrix.field5731[TransformationMatrix.field5729 * -1539552615];
                        }
                     }

                     var29.method9982(-2064235416);
                     float[] var31 = new float[3];
                     var29.transformPoint(var25, var26, var23, var31, 1045119330);
                     var25 = (int)var31[0];
                     var26 = (int)var31[1];
                     var23 = (int)var31[2];
                     var29.transformPoint(var27, var28, var24, var31, 1045119330);
                     var27 = (int)var31[0];
                     var28 = (int)var31[1];
                     var24 = (int)var31[2];
                     TransformationMatrix.method9929(var29, (byte)1);
                     ReflectionCheck.method3891(var25, var26, var23, var27, var28, var24, 327716789);
                  }

                  var17 = class179.method4238(this, var1, var3, var4, var5, 71331398);
               }

               if (var17) {
                  if (this.isSingleTile) {
                     int var43 = (int)var9.method9997(0.0F, this.height * -1272589951 / 2, 0.0F, (short)1603);
                     int var45 = var43 - this.diameter;
                     Varps.method8676(var6, var45, -914898405);
                  } else {
                     var15 = true;
                  }
               }
            }
         }

         int var34 = Rasterizer3D.getClipMidX();
         int var35 = Rasterizer3D.getClipMidY();

         for (int var18 = 0; var18 < this.verticesCount; var18++) {
            float var36 = (int)this.field3501[var18];
            float var38 = (int)this.field3507[var18];
            float var40 = (int)this.field3503[var18];
            var9.transformPoint(var36, var38, var40, field3544, 1045119330);
            var36 = field3544[0];
            var38 = field3544[1];
            var40 = field3544[2];
            var11 |= this.method6797(var18, var36, var38, var40, var10, var34, var35, var13);
         }

         var8.method9422((short)6222);
         TransformationMatrix.method9929(var9, (byte)1);

         try {
            this.draw0(var11, var15, this.isSingleTile, var6);
         } catch (Exception var32) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[IIII)V")
   @ObfuscatedName("fh")
   public void method6889(int var1, int[] var2, int var3, int var4, int var5) {
      this.transform(var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("sf")
   public static void method6879(int var0) {
      assert SecureUrlRequester.client.isClientThread();

      rl19 var1 = rl19.field5583;
      var1.field5589 = var1.field5587 = var1.field5588 = 0;
      var1.field5585 = var1.field5584 = var1.field5586 = 0.0F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljt;I)V")
   @ObfuscatedName("zh")
   public static void method6750(Model var0, Frames var1, int var2) {
      if (var0.faceLabelsAlpha != null) {
         if (var2 != -1) {
            Animation var3 = var1.frames[var2];
            Skeleton var4 = var3.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;

            for (int var5 = 0; var5 < var3.transformCount; var5++) {
               int var6 = var3.transformYs[var5];
               var0.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformSkeletonLabels[var5], var3.transformZs[var5], var3.transformXs[var5]);
            }

            var0.method6742();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lky;")
   @ObfuscatedName("cv")
   public Model method6723(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + -734799765];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   public byte getOverrideLuminance() {
      return this.modelColorOverride != null ? this.modelColorOverride.overrideLuminance : 0;
   }

   @ObfuscatedSignature(descriptor = "(III)Lky;")
   @ObfuscatedName("mk")
   public Model method6890(int var1, int var2, int var3) {
      method6851(this, var1, var2, var3);
      return this;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   void method6808() {
      for (char var1 = 0; var1 < this.indicesCount; var1++) {
         if (!field3529[var1]) {
            int var2 = (field3526[this.indices1[var1]] + field3526[this.indices2[var1]] + field3526[this.indices3[var1]]) / 3 + this.xzRadius;
            char[] var10000 = field3528[var2];
            field3523[var2]++;
            var10000[field3523[var2]] = var1;
         }
      }

      if (this.faceRenderPriorities == null) {
         for (int var5 = this.bottomY - 1; var5 >= 0; var5--) {
            char var6 = field3523[var5];
            if (var6 > 0) {
               char[] var3 = field3528[var5];

               for (int var4 = 0; var4 < var6; var4++) {
                  this.method6813(var3[var4]);
               }
            }
         }
      } else {
         this.method6809();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cl")
   void method6734(int var1) {
      AABB var2 = this.getAABB(var1);
      if (var2 == null) {
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = field3540[var1];
         int var10 = field3539[var1];

         for (int var11 = 0; var11 < this.verticesCount; var11++) {
            int var12 = class348.method7747((int)this.field3501[var11], (int)this.field3503[var11], var9, var10, 1429715563);
            int var13 = (int)this.field3507[var11];
            int var15 = (int)this.field3501[var11];
            int var16 = (int)this.field3503[var11];
            int var14 = var16 * var9 - var10 * var15 >> 16;
            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }

            if (var14 < var5) {
               var5 = var14;
            }

            if (var14 > var8) {
               var8 = var14;
            }
         }

         var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
         byte var19 = 32;
         if (var2.xMidOffset * 984504841 < 32) {
            var2.xMidOffset = 694847264;
         }

         if (var2.zMidOffset * 528344083 < 32) {
            var2.zMidOffset = 1706083168;
         }

         if (this.isSingleTile) {
            byte var20 = 8;
            var2.xMidOffset += -1973771832;
            var2.zMidOffset += 1500262616;
         }

         var2.aabb = this.aabb;
         this.aabb = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZJ)V")
   @ObfuscatedName("bn")
   final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bottomY < 6000) {
         for (int var6 = 0; var6 < this.bottomY; var6++) {
            field3523[var6] = 0;
         }

         int var30 = var3 ? 20 : 5;
         int var7 = Rasterizer3D.method5865();

         for (int var8 = 0; var8 < this.indicesCount; var8++) {
            if (this.faceColors3[var8] == -2) {
               field3529[var8] = true;
            } else {
               if (this.field3498 != classJS.field3183) {
                  if (Rasterizer3D.clips.currentFaceAlpha == 1 && (this.faceAlphas == null || this.faceAlphas[var8] == 0)) {
                     field3529[var8] = true;
                     continue;
                  }

                  if (Rasterizer3D.clips.currentFaceAlpha == 0 && this.faceAlphas != null && this.faceAlphas[var8] != 0) {
                     field3529[var8] = true;
                     continue;
                  }
               }

               int var9 = this.indices1[var8];
               int var10 = this.indices2[var8];
               int var11 = this.indices3[var8];
               float var12 = modelViewportXs[var9];
               float var13 = modelViewportXs[var10];
               float var14 = modelViewportXs[var11];
               field3552[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
               if (field3552[var8]) {
                  int var15 = field3536[var9];
                  int var16 = field3536[var10];
                  int var17 = field3536[var11];
                  int var18 = field3533[var9];
                  int var19 = field3533[var10];
                  int var20 = field3533[var11];
                  int var21 = field3541[var9];
                  int var22 = field3541[var10];
                  int var23 = field3541[var11];
                  var15 -= var16;
                  var17 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var21 -= var22;
                  var23 -= var22;
                  int var24 = var18 * var23 - var21 * var20;
                  int var25 = var21 * var17 - var15 * var23;
                  int var26 = var15 * var20 - var18 * var17;
                  field3529[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
               } else {
                  field3529[var8] = (var12 - var13) * (modelViewportYs[var11] - modelViewportYs[var10])
                        - (modelViewportYs[var9] - modelViewportYs[var10]) * (var14 - var13)
                     <= 0.0F;
                  field3519[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
                  if (var2
                     && VarcInt.method4529(
                        (int)modelViewportYs[var9],
                        (int)modelViewportYs[var10],
                        (int)modelViewportYs[var11],
                        (int)var12,
                        (int)var13,
                        (int)var14,
                        var30,
                        -2124509071
                     )) {
                     int var35 = (int)(field3525[var9] + field3525[var10] + field3525[var11]) / 3;
                     Varps.method8676(var4, var35, -1692751389);
                  }
               }
            }
         }

         short var31 = this.field3573;
         boolean var32 = false;
         if (Rasterizer3D.clips.field3431.method6538()) {
            this.field3573 = (short)this.indicesCount;
         } else if (this.modelColorOverride != null && this.modelColorOverride.method6538()) {
            Rasterizer3D.clips.field3431.method6530(this.modelColorOverride);
            var32 = true;
         }

         try {
            if (!Rasterizer3D.method5869()) {
               this.method6807();
            } else {
               classJS var33 = this.field3498;
               if (var33 == classJS.field3180) {
                  if (Rasterizer3D.clips.currentFaceAlpha != 0 && this.faceAlphas != null) {
                     var33 = classJS.field3182;
                  } else {
                     var33 = classJS.field3181;
                  }
               }

               switch (var33.field3179) {
                  case 1:
                     Rasterizer3D.clips.field3434 = -1;
                     Rasterizer3D.clips.field3438 = -1;
                     this.method6807();
                     break;
                  case 2:
                     Rasterizer3D.clips.field3434 = -1;
                     Rasterizer3D.clips.field3438 = 0;
                     this.method6807();
                     Rasterizer3D.clips.field3434 = 0;
                     Rasterizer3D.clips.field3438 = -1;
                     this.method6807();
                     Rasterizer3D.clips.field3434 = -1;
                     Rasterizer3D.clips.field3438 = -1;
                     break;
                  case 3:
                     Rasterizer3D.clips.field3434 = -1;
                     Rasterizer3D.clips.field3438 = -1;
                     this.method6802();
               }
            }
         } finally {
            this.field3573 = var31;
            if (var32) {
               Rasterizer3D.clips.field3431.method6533();
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gj")
   public void method6737() {
      if (this.radius != 1) {
         this.radius = 1;
         this.height = 0;
         this.boundsType = 0;
         this.diameter = 0;

         for (int var1 = 0; var1 < this.verticesCount; var1++) {
            int var2 = (int)this.field3501[var1];
            int var3 = (int)this.field3507[var1];
            int var4 = (int)this.field3503[var1];
            if (-var3 > this.height * -1272589951) {
               this.height = -var3 * 1535983325;
            }

            if (var3 > this.boundsType) {
               this.boundsType = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.diameter) {
               this.diameter = var5;
            }
         }

         this.diameter = (int)(Math.sqrt(this.diameter) + 0.99);
         this.xzRadius = (int)(Math.sqrt(this.diameter * this.diameter + this.height * -1272589951 * this.height * -1272589951) + 0.99);
         this.bottomY = this.xzRadius + (int)(Math.sqrt(this.diameter * this.diameter + this.boundsType * this.boundsType) + 0.99);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fo")
   void method6739() {
      if (this.radius != 2) {
         this.radius = 2;
         this.diameter = 0;

         for (int var1 = 0; var1 < this.verticesCount; var1++) {
            int var2 = (int)this.field3501[var1];
            int var3 = (int)this.field3507[var1];
            int var4 = (int)this.field3503[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.diameter) {
               this.diameter = var5;
            }
         }

         this.diameter = (int)(Math.sqrt(this.diameter) + 0.99);
         this.xzRadius = this.diameter;
         this.bottomY = this.diameter + this.diameter;
      }
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Lky;")
   @ObfuscatedName("bc")
   public Model method6891(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      return this.contourGround(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(ZLky;[B)Lky;")
   @ObfuscatedName("oi")
   public Model method6892(boolean var1, Model var2, byte[] var3) {
      return this.buildSharedModel(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method6803() {
      for (int var1 = 0; var1 < this.indicesCount; var1++) {
         if (!field3529[var1]) {
            this.method6813(var1);
         }
      }
   }

   public int getFaceCount() {
      return this.indicesCount;
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;Ljq;I)V")
   @ObfuscatedName("vr")
   public void method6852(rl19 var1, class251 var2, int var3) {
      if (this.vertexLabels != null) {
         for (int var4 = 0; var4 < this.verticesCount; var4++) {
            int[] var5 = this.vertexLabels[var4];
            if (var5 != null && var5.length != 0) {
               int[] var6 = this.field3581[var4];
               var1.field5580.method10029();

               for (int var7 = 0; var7 < var5.length; var7++) {
                  int var8 = var5[var7];
                  class136 var9 = var2.method6176(var8);
                  if (var9 != null) {
                     float var10 = var6[var7] / 255.0F;
                     var1.field5581.method10036(var10, var10, var10);
                     var1.field5582.method10020(var9.method4086(var1, var3));
                     var1.field5582.method10024(var1.field5581);
                     var1.field5580.method10027(var1.field5582);
                  }
               }

               this.method6883(var4, var1.field5580);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("cm")
   public static void method6836(Model var0) {
      if (var0 == null) {
         var0.method6743();
      } else {
         var0.modelColorOverride = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljt;ILjt;I[I)V")
   @ObfuscatedName("ec")
   public void method6760(Frames var1, int var2, Frames var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            Animation var6 = var1.frames[var2];
            Animation var7 = var3.frames[var4];
            Skeleton var8 = var6.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.transformCount; var11++) {
               int var12 = var6.transformYs[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.transformTypes[var12] == 0) {
                  this.transform(
                     var8.transformTypes[var12], var8.labels[var12], var6.transformSkeletonLabels[var11], var6.transformZs[var11], var6.transformXs[var11]
                  );
               }
            }

            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.transformCount; var17++) {
               int var18 = var7.transformYs[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.transformTypes[var18] == 0) {
                  this.transform(
                     var8.transformTypes[var18], var8.labels[var18], var7.transformSkeletonLabels[var17], var7.transformZs[var17], var7.transformXs[var17]
                  );
               }
            }

            this.method6742();
         } else {
            this.animate(var1, var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("co")
   public void method6743() {
      this.radius = 0;
      this.aabb = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   public void rotateY180() {
      this.radius = 0;
      this.aabb = null;
   }

   public byte[] getFaceRenderPriorities() {
      return this.faceRenderPriorities;
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;I[IIII)V")
   @ObfuscatedName("kf")
   public void method6869(rl19 var1, int var2, int[] var3, int var4, int var5, int var6) {
      if (var2 == 0) {
         int var7 = 0;
         var1.field5589 = 0;
         var1.field5587 = 0;
         var1.field5588 = 0;

         for (int var8 = 0; var8 < var3.length; var8++) {
            int var9 = var3[var8];
            if (var9 < this.faceLabelsAlpha.length) {
               int[] var10 = this.faceLabelsAlpha[var9];

               for (int var11 = 0; var11 < var10.length; var11++) {
                  int var12 = var10[var11];
                  var1.field5589 = (int)(var1.field5589 + this.field3501[var12]);
                  var1.field5587 = (int)(var1.field5587 + this.field3507[var12]);
                  var1.field5588 = (int)(var1.field5588 + this.field3503[var12]);
                  var7++;
               }
            }
         }

         if (var7 > 0) {
            var1.field5589 = var4 + var1.field5589 / var7;
            var1.field5587 = var5 + var1.field5587 / var7;
            var1.field5588 = var6 + var1.field5588 / var7;
         } else {
            var1.field5589 = var4;
            var1.field5587 = var5;
            var1.field5588 = var6;
         }
      } else if (var2 == 1) {
         for (int var18 = 0; var18 < var3.length; var18++) {
            int var22 = var3[var18];
            if (var22 < this.faceLabelsAlpha.length) {
               int[] var26 = this.faceLabelsAlpha[var22];

               for (int var30 = 0; var30 < var26.length; var30++) {
                  int var34 = var26[var30];
                  this.field3501[var34] = this.field3501[var34] + var4;
                  this.field3507[var34] = this.field3507[var34] + var5;
                  this.field3503[var34] = this.field3503[var34] + var6;
               }
            }
         }
      } else if (var2 == 2) {
         for (int var19 = 0; var19 < var3.length; var19++) {
            int var23 = var3[var19];
            if (var23 < this.faceLabelsAlpha.length) {
               int[] var27 = this.faceLabelsAlpha[var23];

               for (int var31 = 0; var31 < var27.length; var31++) {
                  int var35 = var27[var31];
                  this.field3501[var35] = this.field3501[var35] - var1.field5589;
                  this.field3507[var35] = this.field3507[var35] - var1.field5587;
                  this.field3503[var35] = this.field3503[var35] - var1.field5588;
                  int var38 = (var4 & 0xFF) * 8;
                  int var13 = (var5 & 0xFF) * 8;
                  int var14 = (var6 & 0xFF) * 8;
                  if (var14 != 0) {
                     int var15 = Rasterizer3D.Rasterizer3D_sine[var14];
                     int var16 = Rasterizer3D.Rasterizer3D_cosine[var14];
                     int var17 = var15 * (int)this.field3507[var35] + var16 * (int)this.field3501[var35] >> 16;
                     this.field3507[var35] = var16 * (int)this.field3507[var35] - var15 * (int)this.field3501[var35] >> 16;
                     this.field3501[var35] = var17;
                  }

                  if (var38 != 0) {
                     int var40 = Rasterizer3D.Rasterizer3D_sine[var38];
                     int var42 = Rasterizer3D.Rasterizer3D_cosine[var38];
                     int var44 = var42 * (int)this.field3507[var35] - var40 * (int)this.field3503[var35] >> 16;
                     this.field3503[var35] = var40 * (int)this.field3507[var35] + var42 * (int)this.field3503[var35] >> 16;
                     this.field3507[var35] = var44;
                  }

                  if (var13 != 0) {
                     int var41 = Rasterizer3D.Rasterizer3D_sine[var13];
                     int var43 = Rasterizer3D.Rasterizer3D_cosine[var13];
                     int var45 = var41 * (int)this.field3503[var35] + var43 * (int)this.field3501[var35] >> 16;
                     this.field3503[var35] = var43 * (int)this.field3503[var35] - var41 * (int)this.field3501[var35] >> 16;
                     this.field3501[var35] = var45;
                  }

                  this.field3501[var35] = this.field3501[var35] + var1.field5589;
                  this.field3507[var35] = this.field3507[var35] + var1.field5587;
                  this.field3503[var35] = this.field3503[var35] + var1.field5588;
               }
            }
         }
      } else if (var2 == 3) {
         for (int var20 = 0; var20 < var3.length; var20++) {
            int var24 = var3[var20];
            if (var24 < this.faceLabelsAlpha.length) {
               int[] var28 = this.faceLabelsAlpha[var24];

               for (int var32 = 0; var32 < var28.length; var32++) {
                  int var36 = var28[var32];
                  this.field3501[var36] = this.field3501[var36] - var1.field5589;
                  this.field3507[var36] = this.field3507[var36] - var1.field5587;
                  this.field3503[var36] = this.field3503[var36] - var1.field5588;
                  this.field3501[var36] = var4 * (int)this.field3501[var36] / 128;
                  this.field3507[var36] = var5 * (int)this.field3507[var36] / 128;
                  this.field3503[var36] = var6 * (int)this.field3503[var36] / 128;
                  this.field3501[var36] = this.field3501[var36] + var1.field5589;
                  this.field3507[var36] = this.field3507[var36] + var1.field5587;
                  this.field3503[var36] = this.field3503[var36] + var1.field5588;
               }
            }
         }
      } else if (var2 == 5 && this.field3518 != null && this.faceAlphas != null) {
         for (int var21 = 0; var21 < var3.length; var21++) {
            int var25 = var3[var21];
            if (var25 < this.field3518.length) {
               int[] var29 = this.field3518[var25];

               for (int var33 = 0; var33 < var29.length; var33++) {
                  int var37 = var29[var33];
                  int var39 = (this.faceAlphas[var37] & 255) + var4 * 8;
                  if (var39 < 0) {
                     var39 = 0;
                  } else if (var39 > 255) {
                     var39 = 255;
                  }

                  this.faceAlphas[var37] = (byte)var39;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ep")
   public void method6745() {
      this.radius = 0;
      this.aabb = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fz")
   void method6804() {
      for (int var1 = 0; var1 < this.indicesCount; var1++) {
         if (!field3529[var1]) {
            this.method6813(var1);
         }
      }
   }

   public int getSceneId() {
      return this.field3568;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ex")
   public void method6746() {
      this.radius = 0;
      this.aabb = null;
   }

   @ObfuscatedSignature(descriptor = "(Ljt;I)V")
   @ObfuscatedName("dr")
   public void method6751(Frames var1, int var2) {
      if (this.faceLabelsAlpha != null) {
         if (var2 != -1) {
            Animation var3 = var1.frames[var2];
            Skeleton var4 = var3.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;

            for (int var5 = 0; var5 < var3.transformCount; var5++) {
               int var6 = var3.transformYs[var5];
               this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformSkeletonLabels[var5], var3.transformZs[var5], var3.transformXs[var5]);
            }

            this.method6742();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;Z)Lky;")
   @ObfuscatedName("tc")
   public Model method6859(rl19 var1, boolean var2) {
      if (!var2 && var1.field5579.length < this.indicesCount) {
         var1.field5579 = new byte[this.indicesCount + 100];
      }

      return this.method6892(var2, var1.field5578, var1.field5579);
   }

   @ObfuscatedSignature(descriptor = "(Ljt;I)V")
   @ObfuscatedName("du")
   public void method6752(Frames var1, int var2) {
      if (this.faceLabelsAlpha != null) {
         if (var2 != -1) {
            Animation var3 = var1.frames[var2];
            Skeleton var4 = var3.skeleton;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;

            for (int var5 = 0; var5 < var3.transformCount; var5++) {
               int var6 = var3.transformYs[var5];
               this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformSkeletonLabels[var5], var3.transformZs[var5], var3.transformXs[var5]);
            }

            this.method6742();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILry;)V")
   @ObfuscatedName("gu")
   void method6825(int var1, TransformationMatrix var2) {
      float var3 = (int)this.field3501[var1];
      float var4 = -((int)this.field3507[var1]);
      float var5 = -((int)this.field3503[var1]);
      float var6 = 1.0F;
      this.field3501[var1] = var2.field5724 * var3 + var2.field5735 * var4 + var2.field5743 * var5 + var2.field5742 * var6;
      this.field3507[var1] = -((int)(var2.field5736 * var3 + var2.field5725 * var4 + var2.field5739 * var5 + var2.field5737 * var6));
      this.field3503[var1] = -((int)(var2.field5740 * var3 + var2.field5741 * var4 + var2.field5726 * var5 + var2.field5734 * var6));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;ZLky;[B)Lky;")
   @ObfuscatedName("pn")
   public static Model method6729(Model var0, boolean var1, Model var2, byte[] var3) {
      var2.verticesCount = var0.verticesCount;
      var2.indicesCount = var0.indicesCount;
      var2.texIndicesCount = var0.texIndicesCount;
      if (var2.field3501 == null || var2.field3501.length < var0.verticesCount) {
         var2.field3501 = new float[var0.verticesCount + 100];
         var2.field3507 = new float[var0.verticesCount + 100];
         var2.field3503 = new float[var0.verticesCount + 12364932];
      }

      for (int var4 = 0; var4 < var0.verticesCount; var4++) {
         var2.field3501[var4] = var0.field3501[var4];
         var2.field3507[var4] = var0.field3507[var4];
         var2.field3503[var4] = var0.field3503[var4];
      }

      if (var1) {
         var2.faceAlphas = var0.faceAlphas;
      } else {
         var2.faceAlphas = var3;
         if (var0.faceAlphas == null) {
            for (int var5 = 0; var5 < var0.indicesCount; var5++) {
               var2.faceAlphas[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < var0.indicesCount; var6++) {
               var2.faceAlphas[var6] = var0.faceAlphas[var6];
            }
         }
      }

      var2.indices1 = var0.indices1;
      var2.indices2 = var0.indices2;
      var2.indices3 = var0.indices3;
      var2.faceColors1 = var0.faceColors1;
      var2.faceColors2 = var0.faceColors2;
      var2.faceColors3 = var0.faceColors3;
      var2.faceRenderPriorities = var0.faceRenderPriorities;
      var2.textureFaces = var0.textureFaces;
      var2.faceTextures = var0.faceTextures;
      var2.faceBias = var0.faceBias;
      var2.field3502 = var0.field3502;
      var2.texIndices1 = var0.texIndices1;
      var2.texIndices2 = var0.texIndices2;
      var2.texIndices3 = var0.texIndices3;
      var2.faceLabelsAlpha = var0.faceLabelsAlpha;
      var2.field3518 = var0.field3518;
      var2.vertexLabels = var0.vertexLabels;
      var2.field3581 = var0.field3581;
      var2.isSingleTile = var0.isSingleTile;
      var2.modelColorOverride = var0.modelColorOverride;
      var2.field3573 = var0.field3573;
      var2.method6742();
      return var2;
   }

   public void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method6850(var1, var2, var3, var4, var5, var6, var7);
   }

   public int[] getVertexNormalsX() {
      return this.field3578;
   }

   @ObfuscatedSignature(descriptor = "(III)Lky;")
   @ObfuscatedName("hk")
   public Model method6893(int var1, int var2, int var3) {
      method6877(this, var1, var2, var3);
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I)V")
   @ObfuscatedName("dp")
   void method6755(classFY var1, int var2) {
      Skeleton var3 = var1.field1921;

      for (int var4 = 0; var4 < var3.count * -1846826988; var4++) {
         int var5 = var3.transformTypes[var4];
         if (var5 == 5
            && var1.field1945 != null
            && var1.field1945[var4] != null
            && var1.field1945[var4][0] != null
            && this.field3518 != null
            && this.faceAlphas != null) {
            classFT var6 = var1.field1945[var4][0];

            for (int var10 : var3.labels[var4]) {
               if (var10 < this.field3518.length) {
                  int[] var11 = this.field3518[var10];

                  for (int var12 = 0; var12 < var11.length; var12++) {
                     int var13 = var11[var12];
                     int var14 = (int)((this.faceAlphas[var13] & 255) + var6.method4110(var2, (byte)38) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = -876103888;
                     }

                     this.faceAlphas[var13] = (byte)var14;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("kx")
   @Override
   void vmethod252(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.faceAlphas != null) {
         if (this.radius != 1) {
            this.method6864();
         }

         this.calculateBoundingBox(var1);
         class456 var8 = BuddyRankComparator.method3976(-814754263);
         var8.field5516.method9303(var1 * 0.0030679614F, 0.0F, 0.0F, -1574760321);
         var8.field5514.method9868(1.0F, 1.0F, 1.0F, -953399147);
         var8.field5515.method9868(var3, var4, var5, -1524092099);
         TransformationMatrix var9 = SecureUrlRequester.method3893(-1102929314);
         var9.method10017(var8, (byte)58);
         TransformationMatrix.method9959(var9, var2, (byte)-82);
         int var10 = (int)var9.method9997(0.0F, 0.0F, 0.0F, (short)1603);
         boolean var11 = false;
         int var12 = var10 - this.xzRadius;
         boolean var13 = var12 <= 50 || this.faceTextures != null;
         boolean var14 = WorldMapLabelSize.method7220(var6);
         boolean var15 = false;
         if (var14) {
            boolean var16 = ViewportMouse.ViewportMouse_isInViewport;
            if (var16) {
               int var19 = Rasterizer3D.getClipMidX();
               int var20 = Rasterizer3D.getClipMidY();
               int var21 = Rasterizer3D.get3dZoom();
               boolean var22 = ViewportMouse.ViewportMouse_isInViewport;
               boolean var17;
               if (!var22) {
                  var17 = false;
               } else {
                  if (!ViewportMouse.ViewportMouse_false0) {
                     int var23 = 50;
                     int var24 = AbstractRasterizer.method5428();
                     int var25 = var23 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var26 = var23 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     int var27 = var24 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var28 = var24 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     TransformationMatrix var29;
                     synchronized (TransformationMatrix.field5731) {
                        if (TransformationMatrix.field5729 * -1539552615 == 0) {
                           var29 = new TransformationMatrix(var2);
                        } else {
                           TransformationMatrix.method10012(
                              TransformationMatrix.field5731[(TransformationMatrix.field5729 -= -794138199) * -1539552615], var2, -896354280
                           );
                           var29 = TransformationMatrix.field5731[TransformationMatrix.field5729 * -1539552615];
                        }
                     }

                     var29.method9982(607700565);
                     float[] var31 = new float[3];
                     var29.transformPoint(var25, var26, var23, var31, 1045119330);
                     var25 = (int)var31[0];
                     var26 = (int)var31[1];
                     var23 = (int)var31[2];
                     var29.transformPoint(var27, var28, var24, var31, 1045119330);
                     var27 = (int)var31[0];
                     var28 = (int)var31[1];
                     var24 = (int)var31[2];
                     TransformationMatrix.method9929(var29, (byte)1);
                     ReflectionCheck.method3891(var25, var26, var23, var27, var28, var24, 327716789);
                  }

                  var17 = class179.method4238(this, var1, var3, var4, var5, -1159518283);
               }

               if (var17) {
                  if (this.isSingleTile) {
                     int var43 = (int)var9.method9997(0.0F, this.height * -1272589951 / 2, 0.0F, (short)1603);
                     int var45 = var43 - this.diameter;
                     Varps.method8676(var6, var45, -233522560);
                  } else {
                     var15 = true;
                  }
               }
            }
         }

         int var34 = Rasterizer3D.getClipMidX();
         int var35 = Rasterizer3D.getClipMidY();

         for (int var18 = 0; var18 < this.verticesCount; var18++) {
            float var36 = (int)this.field3501[var18];
            float var38 = (int)this.field3507[var18];
            float var40 = (int)this.field3503[var18];
            var9.transformPoint(var36, var38, var40, field3544, 1045119330);
            var36 = field3544[0];
            var38 = field3544[1];
            var40 = field3544[2];
            var11 |= this.method6797(var18, var36, var38, var40, var10, var34, var35, var13);
         }

         var8.method9422((short)29116);
         TransformationMatrix.method9929(var9, (byte)1);

         try {
            this.draw0(var11, var15, this.isSingleTile, var6);
         } catch (Exception var32) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljq;I)V")
   @ObfuscatedName("bo")
   void method6756(class251 var1, int var2) {
      this.method6874(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dw")
   void method6735(int var1) {
      AABB var2 = this.getAABB(var1);
      if (var2 == null) {
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = field3540[var1];
         int var10 = field3539[var1];

         for (int var11 = 0; var11 < this.verticesCount; var11++) {
            int var12 = class348.method7747((int)this.field3501[var11], (int)this.field3503[var11], var9, var10, 97751553);
            int var13 = (int)this.field3507[var11];
            int var15 = (int)this.field3501[var11];
            int var16 = (int)this.field3503[var11];
            int var14 = var16 * var9 - var10 * var15 >> 16;
            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }

            if (var14 < var5) {
               var5 = var14;
            }

            if (var14 > var8) {
               var8 = var14;
            }
         }

         var2 = new AABB(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
         byte var19 = 32;
         if (var2.xMidOffset * 984504841 < 32) {
            var2.xMidOffset = 694847264;
         }

         if (var2.zMidOffset * 528344083 < 32) {
            var2.zMidOffset = 1706083168;
         }

         if (this.isSingleTile) {
            byte var20 = 8;
            var2.xMidOffset += -1973771832;
            var2.zMidOffset += 1500262616;
         }

         var2.aabb = this.aabb;
         this.aabb = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("hm")
   public Model method6894() {
      this.method6867();
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ljc;Lfy;I[ZZZ)V")
   @ObfuscatedName("ee")
   public void method6763(Skeleton var1, classFY var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class251 var7 = var1.method5403(-510419997);
      if (var7 != null) {
         var7.method6172(var2, var3, var4, var5, 52113711);
         if (var6) {
            Scene.method5518(this, var7, var2.method4165((byte)24));
         }
      }

      if (!var5 && var2.method4169((byte)12)) {
         this.method6856(var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljc;Lfy;I[ZZZ)V")
   @ObfuscatedName("es")
   public void method6764(Skeleton var1, classFY var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class251 var7 = var1.method5403(-510419997);
      if (var7 != null) {
         var7.method6172(var2, var3, var4, var5, -1223261824);
         if (var6) {
            Scene.method5518(this, var7, var2.method4165((byte)123));
         }
      }

      if (!var5 && var2.method4169((byte)12)) {
         this.method6856(var2, var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;ILry;)V")
   @ObfuscatedName("qm")
   public static void method6826(Model var0, int var1, TransformationMatrix var2) {
      float var3 = (int)var0.field3501[var1];
      float var4 = -((int)var0.field3507[var1]);
      float var5 = -((int)var0.field3503[var1]);
      float var6 = 1.0F;
      var0.field3501[var1] = var2.field5724 * var3 + var2.field5735 * var4 + var2.field5743 * var5 + var2.field5742 * var6;
      var0.field3507[var1] = -((int)(var2.field5736 * var3 + var2.field5725 * var4 + var2.field5739 * var5 + var2.field5737 * var6));
      var0.field3503[var1] = -((int)(var2.field5740 * var3 + var2.field5741 * var4 + var2.field5726 * var5 + var2.field5734 * var6));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("el")
   public void method6778() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         int var2 = (int)this.field3503[var1];
         this.field3503[var1] = this.field3501[var1];
         this.field3501[var1] = -var2;
      }

      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Ljt;I[IZ)V")
   @ObfuscatedName("ej")
   public void method6768(Frames var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.animate(var1, var2);
      } else {
         Animation var5 = var1.frames[var2];
         Skeleton var6 = var5.skeleton;
         int var7 = 0;
         int var8 = var3[var7++];
         Model_transformTempX = 0;
         Model_transformTempY = 0;
         Model_transformTempZ = 0;

         for (int var9 = 0; var9 < var5.transformCount; var9++) {
            int var10 = var5.transformYs[var9];

            while (var10 > var8) {
               var8 = var3[var7++];
            }

            if (var4) {
               if (var10 == var8 || var6.transformTypes[var10] == 0) {
                  this.transform(
                     var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
                  );
               }
            } else if (var10 != var8 || var6.transformTypes[var10] == 0) {
               this.transform(
                  var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
               );
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;I)V")
   @ObfuscatedName("nw")
   public static void method6781(Model var0, int var1) {
      if (var0 == null) {
         var0.method6783(var1);
      }

      int var2 = field3539[var1];
      int var3 = field3540[var1];

      for (int var4 = 0; var4 < var0.verticesCount; var4++) {
         int var5 = (int)var0.field3507[var4] * var3 - (int)var0.field3503[var4] * var2 >> 16;
         var0.field3503[var4] = (int)var0.field3507[var4] * var2 + (int)var0.field3503[var4] * var3 >> 16;
         var0.field3507[var4] = var5;
      }

      var0.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("cn")
   public void method6880(Model var1) {
      this.field3578 = var1.field3578;
      this.field3577 = var1.field3577;
      this.field3579 = var1.field3579;
      this.field3580 = var1.field3580;
   }

   @ObfuscatedSignature(descriptor = "(Lky;ILry;)V")
   @ObfuscatedName("gy")
   public static void method6720(Model var0, int var1, TransformationMatrix var2) {
      if (var0 == null) {
         var0.method6721(var1, var2);
      }

      float var3 = var0.field3501[var1];
      float var4 = -var0.field3507[var1];
      float var5 = -var0.field3503[var1];
      float var6 = 1.0F;
      var0.field3501[var1] = var2.field5724 * var3 + var2.field5735 * var4 + var2.field5743 * var5 + var2.field5742 * var6;
      var0.field3507[var1] = -(var2.field5736 * var3 + var2.field5725 * var4 + var2.field5739 * var5 + var2.field5737 * var6);
      var0.field3503[var1] = -(var2.field5740 * var3 + var2.field5741 * var4 + var2.field5726 * var5 + var2.field5734 * var6);
   }

   @ObfuscatedSignature(descriptor = "(Z)Lky;")
   @ObfuscatedName("cf")
   public Model method6724(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   public int getRadius() {
      return this.xzRadius;
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Lky;")
   @ObfuscatedName("ak")
   public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var14 = var6;
      int var12 = var4;
      int var11 = var3;
      int var10 = var2;
      int[][] var9 = var1;
      Model var8 = this;
      this.method6864();
      int var15 = var2 - this.diameter;
      int var16 = var2 + this.diameter;
      int var17 = var4 - this.diameter;
      int var18 = var4 + this.diameter;
      Model var10000;
      if (var15 >= 0 && var16 + 128 >> 7 < var1.length && var17 >= 0 && var18 + 128 >> 7 < var1[0].length) {
         var15 >>= 7;
         var16 = var16 + 127 >> 7;
         var17 >>= 7;
         var18 = var18 + 127 >> 7;
         if (var1[var15][var17] == var3 && var1[var16][var17] == var3 && var1[var15][var18] == var3 && var1[var16][var18] == var3) {
            var10000 = this;
         } else {
            Model var19;
            if (var5) {
               var19 = new Model(this);
               var19.field3507 = new float[var19.verticesCount];
            } else {
               var19 = this;
            }

            if (var6 == 0) {
               for (int var35 = 0; var35 < var19.verticesCount; var35++) {
                  int var36 = (int)var8.field3501[var35] + var10;
                  int var37 = (int)var8.field3503[var35] + var12;
                  int var38 = var36 & 127;
                  int var39 = var37 & 127;
                  int var40 = var36 >> 7;
                  int var41 = var37 >> 7;
                  int var42 = var9[var40][var41] * (128 - var38) + var9[var40 + 1][var41] * var38 >> 7;
                  int var43 = var9[var40][var41 + 1] * (128 - var38) + var9[var40 + 1][var41 + 1] * var38 >> 7;
                  int var44 = var42 * (128 - var39) + var43 * var39 >> 7;
                  var19.field3507[var35] = (int)var8.field3507[var35] + var44 - var11;
               }
            } else {
               for (int var20 = 0; var20 < var19.verticesCount; var20++) {
                  int var21 = (-((int)var8.field3507[var20]) << 16) / (var8.height * -1272589951);
                  if (var21 < var14) {
                     int var22 = (int)var8.field3501[var20] + var10;
                     int var23 = (int)var8.field3503[var20] + var12;
                     int var24 = var22 & 127;
                     int var25 = var23 & 127;
                     int var26 = var22 >> 7;
                     int var27 = var23 >> 7;
                     int var28 = var9[var26][var27] * (128 - var24) + var9[var26 + 1][var27] * var24 >> 7;
                     int var29 = var9[var26][var27 + 1] * (128 - var24) + var9[var26 + 1][var27 + 1] * var24 >> 7;
                     int var30 = var28 * (128 - var25) + var29 * var25 >> 7;
                     var19.field3507[var20] = (int)var8.field3507[var20] + (var30 - var11) * (var14 - var21) / var14;
                  } else {
                     var19.field3507[var20] = var8.field3507[var20];
                  }
               }
            }

            var19.method6742();
            var10000 = var19;
         }
      } else {
         var10000 = this;
      }

      Model var7 = var10000;
      if (var7 != this && (client.field997 & 2) == 2 && var6 == 0) {
         var7.field3572 = this;
      }

      return var7;
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;Ljc;Lju;Lju;FI)V")
   @ObfuscatedName("ci")
   public void method6854(rl19 var1, Skeleton var2, Animation var3, Animation var4, float var5, int var6) {
      if (var4 != null && var5 != 0.0F) {
         int var26 = 0;
         int var27 = 0;

         for (int var9 = 0; var9 < var2.count * 1593543125; var9++) {
            boolean var10 = false;
            if (var26 < var3.transformCount && var3.transformYs[var26] == var9) {
               var10 = true;
            }

            boolean var11 = false;
            if (var27 < var4.transformCount && var4.transformYs[var27] == var9) {
               var11 = true;
            }

            if (var10 || var11) {
               short var12 = 0;
               int var13 = var2.transformTypes[var9];
               if (var13 == 3) {
                  var12 = 128;
               }

               int var14 = var12;
               int var15 = var12;
               int var16 = var12;
               if (var10) {
                  var14 = var3.transformSkeletonLabels[var26];
                  var15 = var3.transformZs[var26];
                  var16 = var3.transformXs[var26];
                  var26++;
               }

               int var17 = var12;
               int var18 = var12;
               int var19 = var12;
               if (var11) {
                  var17 = var4.transformSkeletonLabels[var27];
                  var18 = var4.transformZs[var27];
                  var19 = var4.transformXs[var27];
                  var27++;
               }

               float var20;
               float var21;
               float var22;
               if (var13 == 2) {
                  int var23 = var17 - var14 & 0xFF;
                  int var24 = var18 - var15 & 0xFF;
                  int var25 = var19 - var16 & 0xFF;
                  if (var23 >= 128) {
                     var23 -= 256;
                  }

                  if (var24 >= 128) {
                     var24 -= 256;
                  }

                  if (var25 >= 128) {
                     var25 -= 256;
                  }

                  var20 = var14 + var23 * var5 / var6;
                  var21 = var15 + var24 * var5 / var6;
                  var22 = var16 + var25 * var5 / var6;
               } else if (var13 == 5) {
                  var20 = var14;
                  var21 = 0.0F;
                  var22 = 0.0F;
               } else {
                  var20 = var14 + (var17 - var14) * var5 / var6;
                  var21 = var15 + (var18 - var15) * var5 / var6;
                  var22 = var16 + (var19 - var16) * var5 / var6;
               }

               this.method6849(var1, var13, var2.labels[var9], var20, var21, var22);
            }
         }
      } else {
         for (int var7 = 0; var7 < var3.transformCount; var7++) {
            int var8 = var3.transformYs[var7];
            this.method6849(
               var1, var2.transformTypes[var8], var2.labels[var8], var3.transformSkeletonLabels[var7], var3.transformZs[var7], var3.transformXs[var7]
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dt")
   public void method6837() {
      this.modelColorOverride = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gy")
   public void method6775() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         int var2 = (int)this.field3501[var1];
         this.field3501[var1] = this.field3503[var1];
         this.field3503[var1] = -var2;
      }

      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dl")
   public void method6776() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3501[var1] = -((int)this.field3501[var1]);
         this.field3503[var1] = -((int)this.field3503[var1]);
      }

      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public void method6777() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3501[var1] = -((int)this.field3501[var1]);
         this.field3503[var1] = -((int)this.field3503[var1]);
      }

      this.method6742();
   }

   public short[] getFaceTextures() {
      return this.faceTextures;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dm")
   public void method6779() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         int var2 = (int)this.field3503[var1];
         this.field3503[var1] = this.field3501[var1];
         this.field3501[var1] = -var2;
      }

      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("eh")
   public void method6786(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         this.field3501[var4] = (int)this.field3501[var4] + var1;
         this.field3507[var4] = (int)this.field3507[var4] + var2;
         this.field3503[var4] = (int)this.field3503[var4] + var3;
      }

      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Ljs;)V")
   @ObfuscatedName("gb")
   void method6842(classJS var1) {
      this.field3498 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ey")
   public void method6782(int var1) {
      int var2 = field3539[var1];
      int var3 = field3540[var1];

      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         int var5 = (int)this.field3507[var4] * var3 - (int)this.field3503[var4] * var2 >> 16;
         this.field3503[var4] = (int)this.field3507[var4] * var2 + (int)this.field3503[var4] * var3 >> 16;
         this.field3507[var4] = var5;
      }

      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("iq")
   public void method6858(Model var1) {
      if (var1 != null && this.field3580 != null && var1.field3580 != null) {
         for (int var2 = 0; var2 < var1.indicesCount; var2++) {
            this.field3580[this.indicesCount + var2] = var1.field3580[var2];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("ev")
   public void method6784(class461 var1) {
      ProjectionCoord var2;
      synchronized (ProjectionCoord.field5722) {
         if (ProjectionCoord.field5720 * 1970955523 == 0) {
            var2 = new ProjectionCoord();
         } else {
            ProjectionCoord.field5722[(ProjectionCoord.field5720 -= 1300180395) * 1970955523].method9878(1701153650);
            var2 = ProjectionCoord.field5722[ProjectionCoord.field5720 * 1970955523];
         }
      }

      ProjectionCoord var6 = var2;

      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         var6.method9868((int)this.field3501[var4], (int)this.field3507[var4], (int)this.field3503[var4], -497173808);
         var6.method9909(var1, 1314896004);
         this.field3501[var4] = var6.x;
         this.field3507[var4] = var6.z;
         this.field3503[var4] = var6.y;
      }

      var6.release(-804947546);
      this.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Z)Lky;")
   @ObfuscatedName("cw")
   public Model method6727(boolean var1) {
      if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
   }

   public void setBufferOffset(int var1) {
      this.field3569 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bc")
   boolean method6817(int var1) {
      return var1 < this.field3573;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIJ)V")
   @ObfuscatedName("fn")
   void method6796(int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.faceAlphas != null) {
         int var9 = Rasterizer3D.Rasterizer3D_sine[var2];
         int var10 = Rasterizer3D.Rasterizer3D_cosine[var2];
         int var11 = Rasterizer3D.Rasterizer3D_sine[var3];
         int var12 = Rasterizer3D.Rasterizer3D_cosine[var3];
         float var13 = Rasterizer3D.field3038[var2];
         float var14 = Rasterizer3D.field3037[var2];
         float var15 = Rasterizer3D.field3038[var3];
         float var16 = Rasterizer3D.field3037[var3];
         if (this.radius != 1) {
            this.method6864();
         }

         this.calculateBoundingBox(var1);
         int var17 = var6 * var12 - var4 * var11 >> 16;
         int var18 = var5 * var9 + var17 * var10 >> 16;
         int var19 = this.diameter * var10 >> 16;
         int var20 = var18 + var19;
         if (var20 > 50 && var18 < AbstractRasterizer.method5428()) {
            int var21 = var6 * var11 + var4 * var12 >> 16;
            int var22 = (var21 - this.diameter) * Rasterizer3D.get3dZoom();
            if (var22 / var20 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
               int var23 = (var21 + this.diameter) * Rasterizer3D.get3dZoom();
               if (var23 / var20 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
                  int var24 = var5 * var10 - var17 * var9 >> 16;
                  int var25 = this.diameter * var9 >> 16;
                  int var26 = var25 + (this.boundsType * var10 >> 16);
                  int var27 = (var24 + var26) * Rasterizer3D.get3dZoom();
                  if (var27 / var20 > Rasterizer3D.method5859()) {
                     int var28 = var25 + (this.height * -1272589951 * var10 >> 16);
                     int var29 = (var24 - var28) * Rasterizer3D.get3dZoom();
                     if (var29 / var20 < Rasterizer3D.method5856()) {
                        int var30 = var19 + (this.height * -1272589951 * var9 >> 16);
                        boolean var31 = false;
                        boolean var32 = false;
                        if (var18 - var30 <= 50) {
                           var32 = true;
                        }

                        boolean var33 = var32 || this.faceTextures != null;
                        int var34 = UserComparator8.method3943(-923520227);
                        int var35 = HttpMethod.method368(1927711924);
                        boolean var36 = ViewportMouse.ViewportMouse_isInViewport;
                        boolean var38 = WorldMapLabelSize.method7220(var7);
                        boolean var39 = false;
                        if (var38 && var36) {
                           boolean var40 = false;
                           if (field3537) {
                              var40 = WorldMapSection1.method7453(
                                 this,
                                 var1,
                                 var4,
                                 var5,
                                 var6,
                                 var13,
                                 var14,
                                 var15,
                                 var16,
                                 Rasterizer3D.getClipMidX(),
                                 Rasterizer3D.getClipMidY(),
                                 Rasterizer3D.get3dZoom(),
                                 274870273
                              );
                           } else {
                              int var41 = var18 - var19;
                              if (var41 <= 50) {
                                 var41 = 50;
                              }

                              if (var21 > 0) {
                                 var22 /= var20;
                                 var23 /= var41;
                              } else {
                                 var23 /= var20;
                                 var22 /= var41;
                              }

                              if (var24 > 0) {
                                 var29 /= var20;
                                 var27 /= var41;
                              } else {
                                 var27 /= var20;
                                 var29 /= var41;
                              }

                              int var42 = var34 - Rasterizer3D.getClipMidX();
                              int var43 = var35 - Rasterizer3D.getClipMidY();
                              if (var42 > var22 && var42 < var23 && var43 > var29 && var43 < var27) {
                                 var40 = true;
                              }
                           }

                           if (var40) {
                              if (this.isSingleTile) {
                                 int var55 = var5 - this.height * -1272589951 / 2;
                                 int var57 = var6 * var12 - var4 * var11 >> 16;
                                 var57 = var55 * var9 + var57 * var10 >> 16;
                                 int var60 = var57 - this.diameter;
                                 Varps.method8676(var7, var60, -635558373);
                              } else {
                                 var39 = true;
                              }
                           }
                        }

                        int var54 = Rasterizer3D.getClipMidX();
                        int var56 = Rasterizer3D.getClipMidY();
                        float var59 = 0.0F;
                        float var61 = 0.0F;
                        if (var1 != 0) {
                           var59 = Rasterizer3D.field3038[var1];
                           var61 = Rasterizer3D.field3037[var1];
                        }

                        for (int var44 = 0; var44 < this.verticesCount; var44++) {
                           float var45 = (int)this.field3501[var44];
                           float var46 = (int)this.field3507[var44];
                           float var47 = (int)this.field3503[var44];
                           if (var1 != 0) {
                              float var48 = var47 * var59 + var45 * var61;
                              var47 = var47 * var61 - var45 * var59;
                              var45 = var48;
                           }

                           var45 += var4;
                           var46 += var5;
                           var47 += var6;
                           float var68 = var47 * var15 + var45 * var16;
                           var47 = var47 * var16 - var45 * var15;
                           float var69 = var46 * var14 - var47 * var13;
                           var47 = var46 * var13 + var47 * var14;
                           var31 |= this.method6797(var44, var68, var69, var47, var18, var54, var56, var33);
                        }

                        try {
                           this.draw0(var31, var39, this.isSingleTile, var7);
                        } catch (Exception var49) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public int[] getTexIndices2() {
      return this.texIndices2;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("bi")
   public final void method6789(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.radius != 2) {
         this.method6845();
      }

      int var8 = Rasterizer3D.getClipMidX();
      int var9 = Rasterizer3D.getClipMidY();
      int var10 = field3539[var1];
      int var11 = field3540[var1];
      int var12 = field3539[var2];
      int var13 = field3540[var2];
      int var14 = field3539[var3];
      int var15 = field3540[var3];
      int var16 = field3539[var4];
      int var17 = field3540[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for (int var19 = 0; var19 < this.verticesCount; var19++) {
         int var20 = (int)this.field3501[var19];
         int var21 = (int)this.field3507[var19];
         int var22 = (int)this.field3503[var19];
         if (var3 != 0) {
            int var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            int var29 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var29;
         }

         if (var2 != 0) {
            int var30 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var30;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         int var31 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field3526[var19] = var22 - var18;
         modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
         modelViewportYs[var19] = var9 + var31 * Rasterizer3D.get3dZoom() / var22;
         field3525[var19] = var22;
         if (this.faceTextures != null) {
            field3536[var19] = var20;
            field3533[var19] = var31;
            field3541[var19] = var22;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var24) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Lky;)V")
   @ObfuscatedName("sv")
   public static void method6717(Model var0, Model var1) {
      if (var0 == null) {
         var0.method6714(var0);
      } else if (var1 != null) {
         var0.method6712(var1);

         for (int var2 = 0; var2 < var1.indicesCount; var2++) {
            var0.indices1[var0.indicesCount] = var1.indices1[var2] + var0.verticesCount;
            var0.indices2[var0.indicesCount] = var1.indices2[var2] + var0.verticesCount;
            var0.indices3[var0.indicesCount] = var1.indices3[var2] + var0.verticesCount;
            var0.faceColors1[var0.indicesCount] = var1.faceColors1[var2];
            var0.faceColors2[var0.indicesCount] = var1.faceColors2[var2];
            var0.faceColors3[var0.indicesCount] = var1.faceColors3[var2];
            if (var0.faceRenderPriorities != null) {
               var0.faceRenderPriorities[var0.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field3502;
            }

            if (var0.faceAlphas != null && var1.faceAlphas != null) {
               var0.faceAlphas[var0.indicesCount] = var1.faceAlphas[var2];
            }

            if (var0.faceTextures != null) {
               var0.faceTextures[var0.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
            }

            if (var0.textureFaces != null) {
               if (var1.textureFaces != null && var1.textureFaces[var2] != -1) {
                  var0.textureFaces[var0.indicesCount] = (byte)(var1.textureFaces[var2] + var0.texIndicesCount);
               } else {
                  var0.textureFaces[var0.indicesCount] = -1;
               }
            }

            if (var0.faceBias != null && var1.faceBias != null) {
               var0.faceBias[var0.indicesCount] = var1.faceBias[var2];
            }

            var0.indicesCount++;
         }

         for (int var3 = 0; var3 < var1.texIndicesCount; var3++) {
            var0.texIndices1[var0.texIndicesCount] = var1.texIndices1[var3] + var0.verticesCount;
            var0.texIndices2[var0.texIndicesCount] = var1.texIndices2[var3] + var0.verticesCount;
            var0.texIndices3[var0.texIndicesCount] = var1.texIndices3[var3] + var0.verticesCount;
            var0.texIndicesCount++;
         }

         for (int var4 = 0; var4 < var1.verticesCount; var4++) {
            var0.field3501[var0.verticesCount] = var1.field3501[var4];
            var0.field3507[var0.verticesCount] = var1.field3507[var4];
            var0.field3503[var0.verticesCount] = var1.field3503[var4];
            var0.verticesCount++;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("by")
   public final void method6792(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.radius != 2) {
         this.method6845();
      }

      int var9 = Rasterizer3D.getClipMidX();
      int var10 = Rasterizer3D.getClipMidY();
      int var11 = field3539[var1];
      int var12 = field3540[var1];
      int var13 = field3539[var2];
      int var14 = field3540[var2];
      int var15 = field3539[var3];
      int var16 = field3540[var3];
      int var17 = field3539[var4];
      int var18 = field3540[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for (int var20 = 0; var20 < this.verticesCount; var20++) {
         int var21 = (int)this.field3501[var20];
         int var22 = (int)this.field3507[var20];
         int var23 = (int)this.field3503[var20];
         if (var3 != 0) {
            int var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            int var30 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var30;
         }

         if (var2 != 0) {
            int var31 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var31;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         int var32 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field3526[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
         modelViewportYs[var20] = var10 + var32 * Rasterizer3D.get3dZoom() / var8;
         field3525[var20] = var8;
         if (this.faceTextures != null) {
            field3536[var20] = var21;
            field3533[var20] = var32;
            field3541[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }
   }

   public int[] getTexIndices1() {
      return this.texIndices1;
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;I[IIII)V")
   @ObfuscatedName("tn")
   public void method6865(rl19 var1, int var2, int[] var3, int var4, int var5, int var6) {
      if ((client.field997 & 8) != 0) {
         this.method6849(var1, var2, var3, var4, var5, var6);
      } else {
         this.method6869(var1, var2, var3, var4, var5, var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("eb")
   public final void method6793(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.radius != 2) {
         this.method6845();
      }

      int var9 = Rasterizer3D.getClipMidX();
      int var10 = Rasterizer3D.getClipMidY();
      int var11 = field3539[var1];
      int var12 = field3540[var1];
      int var13 = field3539[var2];
      int var14 = field3540[var2];
      int var15 = field3539[var3];
      int var16 = field3540[var3];
      int var17 = field3539[var4];
      int var18 = field3540[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for (int var20 = 0; var20 < this.verticesCount; var20++) {
         int var21 = (int)this.field3501[var20];
         int var22 = (int)this.field3507[var20];
         int var23 = (int)this.field3503[var20];
         if (var3 != 0) {
            int var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            int var30 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var30;
         }

         if (var2 != 0) {
            int var31 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var31;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         int var32 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field3526[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
         modelViewportYs[var20] = var10 + var32 * Rasterizer3D.get3dZoom() / var8;
         field3525[var20] = var8;
         if (this.faceTextures != null) {
            field3536[var20] = var21;
            field3533[var20] = var32;
            field3541[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dz")
   public void method6747() {
      this.radius = 0;
      this.aabb = null;
   }

   @ObfuscatedSignature(descriptor = "(IFFFIIIZ)Z")
   @ObfuscatedName("fh")
   boolean method6798(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
      field3526[var1] = (int)var4 - var5;
      if (var8) {
         field3536[var1] = (int)var2;
         field3533[var1] = (int)var3;
         field3541[var1] = (int)var4;
      }

      if (var4 >= 50.0F) {
         modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
         modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
         field3525[var1] = var4;
         return false;
      } else {
         modelViewportXs[var1] = -5000.0F;
         return true;
      }
   }

   public void calculateExtreme(int var1) {
      this.calculateBoundingBox(var1);
   }

   @ObfuscatedSignature(descriptor = "(IFFFIIIZ)Z")
   @ObfuscatedName("fs")
   boolean method6799(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
      field3526[var1] = (int)var4 - var5;
      if (var8) {
         field3536[var1] = (int)var2;
         field3533[var1] = (int)var3;
         field3541[var1] = (int)var4;
      }

      if (var4 >= 50.0F) {
         modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
         modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
         field3525[var1] = var4;
         return false;
      } else {
         modelViewportXs[var1] = -5000.0F;
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZZJ)V")
   @ObfuscatedName("fi")
   final void method6801(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.bottomY < 1465678793) {
         for (int var6 = 0; var6 < this.bottomY; var6++) {
            field3523[var6] = 0;
         }

         int var30 = var3 ? 20 : 5;
         int var7 = Rasterizer3D.method5865();

         for (int var8 = 0; var8 < this.indicesCount; var8++) {
            if (this.faceColors3[var8] == -2) {
               field3529[var8] = true;
            } else {
               if (this.field3498 != classJS.field3183) {
                  if (Rasterizer3D.clips.currentFaceAlpha == 1 && (this.faceAlphas == null || this.faceAlphas[var8] == 0)) {
                     field3529[var8] = true;
                     continue;
                  }

                  if (Rasterizer3D.clips.currentFaceAlpha == 0 && this.faceAlphas != null && this.faceAlphas[var8] != 0) {
                     field3529[var8] = true;
                     continue;
                  }
               }

               int var9 = this.indices1[var8];
               int var10 = this.indices2[var8];
               int var11 = this.indices3[var8];
               float var12 = modelViewportXs[var9];
               float var13 = modelViewportXs[var10];
               float var14 = modelViewportXs[var11];
               field3552[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
               if (field3552[var8]) {
                  int var15 = field3536[var9];
                  int var16 = field3536[var10];
                  int var17 = field3536[var11];
                  int var18 = field3533[var9];
                  int var19 = field3533[var10];
                  int var20 = field3533[var11];
                  int var21 = field3541[var9];
                  int var22 = field3541[var10];
                  int var23 = field3541[var11];
                  var15 -= var16;
                  var17 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var21 -= var22;
                  var23 -= var22;
                  int var24 = var18 * var23 - var21 * var20;
                  int var25 = var21 * var17 - var15 * var23;
                  int var26 = var15 * var20 - var18 * var17;
                  field3529[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
               } else {
                  field3529[var8] = (var12 - var13) * (modelViewportYs[var11] - modelViewportYs[var10])
                        - (modelViewportYs[var9] - modelViewportYs[var10]) * (var14 - var13)
                     <= 0.0F;
                  field3519[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
                  if (var2
                     && VarcInt.method4529(
                        (int)modelViewportYs[var9],
                        (int)modelViewportYs[var10],
                        (int)modelViewportYs[var11],
                        (int)var12,
                        (int)var13,
                        (int)var14,
                        var30,
                        276099999
                     )) {
                     int var35 = (int)(field3525[var9] + field3525[var10] + field3525[var11]) / 3;
                     Varps.method8676(var4, var35, -1904777411);
                  }
               }
            }
         }

         short var31 = this.field3573;
         boolean var32 = false;
         if (Rasterizer3D.clips.field3431.method6538()) {
            this.field3573 = (short)this.indicesCount;
         } else if (this.modelColorOverride != null && this.modelColorOverride.method6538()) {
            Rasterizer3D.clips.field3431.method6530(this.modelColorOverride);
            var32 = true;
         }

         try {
            if (!Rasterizer3D.method5869()) {
               this.method6807();
            } else {
               classJS var33 = this.field3498;
               if (var33 == classJS.field3180) {
                  if (Rasterizer3D.clips.currentFaceAlpha != 0 && this.faceAlphas != null) {
                     var33 = classJS.field3182;
                  } else {
                     var33 = classJS.field3181;
                  }
               }

               switch (var33.field3179) {
                  case 1:
                     Rasterizer3D.clips.field3434 = -1;
                     Rasterizer3D.clips.field3438 = -1;
                     this.method6807();
                     break;
                  case 2:
                     Rasterizer3D.clips.field3434 = -1;
                     Rasterizer3D.clips.field3438 = 0;
                     this.method6807();
                     Rasterizer3D.clips.field3434 = 0;
                     Rasterizer3D.clips.field3438 = -1;
                     this.method6807();
                     Rasterizer3D.clips.field3434 = -1;
                     Rasterizer3D.clips.field3438 = -1;
                     break;
                  case 3:
                     Rasterizer3D.clips.field3434 = -1;
                     Rasterizer3D.clips.field3438 = -1;
                     this.method6802();
               }
            }
         } finally {
            this.field3573 = var31;
            if (var32) {
               Rasterizer3D.clips.field3431.method6533();
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;III)V")
   @ObfuscatedName("hk")
   public static void method6787(Model var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method6867();
      }

      for (int var4 = 0; var4 < var0.verticesCount; var4++) {
         var0.field3501[var4] = (int)var0.field3501[var4] * var1 / 128;
         var0.field3507[var4] = (int)var0.field3507[var4] * var2 / -219677751;
         var0.field3503[var4] = (int)var0.field3503[var4] * var3 / 128;
      }

      var0.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Lky;Lra;)V")
   @ObfuscatedName("wi")
   public static void method6847(Model var0, class461 var1) {
      if (var0 == null) {
         var0.method6848(var1);
      }

      ProjectionCoord var2 = ProjectionCoord.method9923(0.0F, 0.0F, 0.0F);

      for (int var3 = 0; var3 < var0.verticesCount; var3++) {
         var2.method9921(var0.field3501[var3], var0.field3507[var3], var0.field3503[var3]);
         var2.method9922(var1);
         var0.field3501[var3] = var2.x;
         var0.field3507[var3] = var2.z;
         var0.field3503[var3] = var2.y;
      }

      var2.method9925();
      var0.method6887();
   }

   @ObfuscatedSignature(descriptor = "(Ljs;)V")
   @ObfuscatedName("gz")
   void method6843(classJS var1) {
      this.field3498 = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fk")
   void method6805() {
      for (int var1 = 0; var1 < this.indicesCount; var1++) {
         if (!field3529[var1]) {
            this.method6813(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   void method6806() {
      for (int var1 = 0; var1 < this.indicesCount; var1++) {
         if (!field3529[var1]) {
            this.method6813(var1);
         }
      }
   }

   public int getVerticesCount() {
      return this.verticesCount;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fu")
   final void method6813(int var1) {
      if (this.faceAlphas == null) {
         Rasterizer3D.clips.clipX = 0;
      } else {
         Rasterizer3D.clips.clipX = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
      }

      if (Rasterizer3D.clips.currentFaceAlpha != 1 || Rasterizer3D.clips.clipX != 0) {
         if (Rasterizer3D.clips.currentFaceAlpha != 0 || Rasterizer3D.clips.clipX == 0) {
            if (field3552[var1]) {
               method6823(this, var1);
            } else {
               int var2 = this.indices1[var1];
               int var3 = this.indices2[var1];
               int var4 = this.indices3[var1];
               Rasterizer3D.clips.clipping = field3519[var1];
               int var5 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
               float var6 = WorldMapSectionType.method7174(field3525[var2] - var5, 689249021);
               float var7 = WorldMapSectionType.method7174(field3525[var3] - var5, -1027768647);
               float var8 = WorldMapSectionType.method7174(field3525[var4] - var5, 2125387553);
               this.method6821(
                  var1,
                  modelViewportYs[var2],
                  modelViewportYs[var3],
                  modelViewportYs[var4],
                  modelViewportXs[var2],
                  modelViewportXs[var3],
                  modelViewportXs[var4],
                  var6,
                  var7,
                  var8,
                  this.faceColors1[var1],
                  this.faceColors2[var1],
                  this.faceColors3[var1]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;Ljc;Lfy;I[ZZZ)V")
   @ObfuscatedName("ui")
   public static void method6765(Model var0, Skeleton var1, classFY var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      if (var0 == null) {
         var0.method6766(var1, var2, var3, var4, var5, var5);
      } else {
         class251 var7 = var1.method5403(-510419997);
         if (var7 != null) {
            var7.method6172(var2, var3, var4, var5, -1942430699);
            if (var6) {
               Scene.method5518(var0, var7, var2.method4165((byte)97));
            }
         }

         if (!var5 && var2.method4169((byte)12)) {
            var0.method6856(var2, var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIII)Ljava/awt/Shape;")
   @ObfuscatedName("lx")
   public Shape method6857(WorldView var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[this.verticesCount];
      int[] var7 = new int[this.verticesCount];
      Perspective.modelToCanvas(
         SecureUrlRequester.client, var1, this.verticesCount, var2, var3, var5, var4, this.field3501, this.field3503, this.field3507, var6, var7
      );
      return Jarvis.convexHull(var6, var7);
   }

   public int[] getFaceIndices3() {
      return this.indices3;
   }

   public int getBottomY() {
      return this.boundsType;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   void method6810() {
      for (int var1 = 0; var1 < 12; var1++) {
         field3532[var1] = 0;
         field3546[var1] = 0;
      }

      for (int var13 = this.bottomY - 1; var13 >= 0; var13--) {
         char var2 = field3523[var13];
         if (var2 > 0) {
            char[] var3 = field3528[var13];

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = var3[var4];
               byte var6 = this.faceRenderPriorities[var5];
               int var7 = field3532[var6]++;
               field3530[var6][var7] = var5;
               if (var6 < 10) {
                  field3546[var6] = field3546[var6] + var13;
               } else if (var6 == 10) {
                  field3520[var7] = var13;
               } else {
                  field3531[var7] = var13;
               }
            }
         }
      }

      int var14 = 0;
      if (field3532[1] > 0 || field3532[2] > 0) {
         var14 = (field3546[1] + field3546[2]) / (field3532[1] + field3532[2]);
      }

      int var15 = 0;
      if (field3532[3] > 0 || field3532[4] > 0) {
         var15 = (field3546[3] + field3546[4]) / (field3532[3] + field3532[4]);
      }

      int var16 = 0;
      if (field3532[6] > 0 || field3532[8] > 0) {
         var16 = (field3546[6] + field3546[8]) / (field3532[6] + field3532[8]);
      }

      int var18 = 0;
      int var19 = field3532[10];
      int[] var20 = field3530[10];
      int[] var8 = field3520;
      if (var18 == var19) {
         var18 = 0;
         var19 = field3532[11];
         var20 = field3530[11];
         var8 = field3531;
      }

      int var17;
      if (var18 < var19) {
         var17 = var8[var18];
      } else {
         var17 = 226995366;
      }

      for (int var9 = 0; var9 < 10; var9++) {
         while (var9 == 0 && var17 > var14) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = 886025408;
            }
         }

         while (var9 == 3 && var17 > var15) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = 1005342619;
            }
         }

         while (var9 == 5 && var17 > var16) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -62952066;
            }
         }

         int var10 = field3532[var9];
         int[] var11 = field3530[var9];

         for (int var12 = 0; var12 < var10; var12++) {
            this.method6813(var11[var12]);
         }
      }

      while (var17 != -1414829969) {
         this.method6813(var20[var18++]);
         if (var18 == var19 && var20 != field3530[11]) {
            var18 = 0;
            var20 = field3530[11];
            var19 = field3532[11];
            var8 = field3531;
         }

         if (var18 < var19) {
            var17 = var8[var18];
         } else {
            var17 = 992853598;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ft")
   void method6811() {
      for (int var1 = 0; var1 < 12; var1++) {
         field3532[var1] = 0;
         field3546[var1] = 0;
      }

      for (int var13 = this.bottomY - 1; var13 >= 0; var13--) {
         char var2 = field3523[var13];
         if (var2 > 0) {
            char[] var3 = field3528[var13];

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = var3[var4];
               byte var6 = this.faceRenderPriorities[var5];
               int var7 = field3532[var6]++;
               field3530[var6][var7] = var5;
               if (var6 < 10) {
                  field3546[var6] = field3546[var6] + var13;
               } else if (var6 == 10) {
                  field3520[var7] = var13;
               } else {
                  field3531[var7] = var13;
               }
            }
         }
      }

      int var14 = 0;
      if (field3532[1] > 0 || field3532[2] > 0) {
         var14 = (field3546[1] + field3546[2]) / (field3532[1] + field3532[2]);
      }

      int var15 = 0;
      if (field3532[3] > 0 || field3532[4] > 0) {
         var15 = (field3546[3] + field3546[4]) / (field3532[3] + field3532[4]);
      }

      int var16 = 0;
      if (field3532[6] > 0 || field3532[8] > 0) {
         var16 = (field3546[6] + field3546[8]) / (field3532[6] + field3532[8]);
      }

      int var18 = 0;
      int var19 = field3532[10];
      int[] var20 = field3530[10];
      int[] var8 = field3520;
      if (var18 == var19) {
         var18 = 0;
         var19 = field3532[11];
         var20 = field3530[11];
         var8 = field3531;
      }

      int var17;
      if (var18 < var19) {
         var17 = var8[var18];
      } else {
         var17 = -1000;
      }

      for (int var9 = 0; var9 < 10; var9++) {
         while (var9 == 0 && var17 > var14) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 3 && var17 > var15) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 5 && var17 > var16) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         int var10 = field3532[var9];
         int[] var11 = field3530[var9];

         for (int var12 = 0; var12 < var10; var12++) {
            this.method6813(var11[var12]);
         }
      }

      while (var17 != -1000) {
         this.method6813(var20[var18++]);
         if (var18 == var19 && var20 != field3530[11]) {
            var18 = 0;
            var20 = field3530[11];
            var19 = field3532[11];
            var8 = field3531;
         }

         if (var18 < var19) {
            var17 = var8[var18];
         } else {
            var17 = -1000;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fg")
   void method6812() {
      for (int var1 = 0; var1 < 12; var1++) {
         field3532[var1] = 0;
         field3546[var1] = 0;
      }

      for (int var13 = this.bottomY - 1; var13 >= 0; var13--) {
         char var2 = field3523[var13];
         if (var2 > 0) {
            char[] var3 = field3528[var13];

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = var3[var4];
               byte var6 = this.faceRenderPriorities[var5];
               int var7 = field3532[var6]++;
               field3530[var6][var7] = var5;
               if (var6 < 10) {
                  field3546[var6] = field3546[var6] + var13;
               } else if (var6 == 10) {
                  field3520[var7] = var13;
               } else {
                  field3531[var7] = var13;
               }
            }
         }
      }

      int var14 = 0;
      if (field3532[1] > 0 || field3532[2] > 0) {
         var14 = (field3546[1] + field3546[2]) / (field3532[1] + field3532[2]);
      }

      int var15 = 0;
      if (field3532[3] > 0 || field3532[4] > 0) {
         var15 = (field3546[3] + field3546[4]) / (field3532[3] + field3532[4]);
      }

      int var16 = 0;
      if (field3532[6] > 0 || field3532[8] > 0) {
         var16 = (field3546[6] + field3546[8]) / (field3532[6] + field3532[8]);
      }

      int var18 = 0;
      int var19 = field3532[10];
      int[] var20 = field3530[10];
      int[] var8 = field3520;
      if (var18 == var19) {
         var18 = 0;
         var19 = field3532[11];
         var20 = field3530[11];
         var8 = field3531;
      }

      int var17;
      if (var18 < var19) {
         var17 = var8[var18];
      } else {
         var17 = -1000;
      }

      for (int var9 = 0; var9 < 10; var9++) {
         while (var9 == 0 && var17 > var14) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 3 && var17 > var15) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         while (var9 == 5 && var17 > var16) {
            this.method6813(var20[var18++]);
            if (var18 == var19 && var20 != field3530[11]) {
               var18 = 0;
               var19 = field3532[11];
               var20 = field3530[11];
               var8 = field3531;
            }

            if (var18 < var19) {
               var17 = var8[var18];
            } else {
               var17 = -1000;
            }
         }

         int var10 = field3532[var9];
         int[] var11 = field3530[var9];

         for (int var12 = 0; var12 < var10; var12++) {
            this.method6813(var11[var12]);
         }
      }

      while (var17 != -1000) {
         this.method6813(var20[var18++]);
         if (var18 == var19 && var20 != field3530[11]) {
            var18 = 0;
            var20 = field3530[11];
            var19 = field3532[11];
            var8 = field3531;
         }

         if (var18 < var19) {
            var17 = var8[var18];
         } else {
            var17 = -1000;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method6740() {
      this.method6864();
      return this.diameter;
   }

   public int getDiameter() {
      return this.bottomY;
   }

   public byte getOverrideSaturation() {
      return this.modelColorOverride != null ? this.modelColorOverride.overrideSaturation : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bx")
   final void method6814(int var1) {
      if (this.faceAlphas == null) {
         Rasterizer3D.clips.clipX = 0;
      } else {
         Rasterizer3D.clips.clipX = (this.faceAlphas[var1] == -1 ? -1734885886 : this.faceAlphas[var1]) & 0xFF;
      }

      if (Rasterizer3D.clips.currentFaceAlpha != 1 || Rasterizer3D.clips.clipX != 0) {
         if (Rasterizer3D.clips.currentFaceAlpha != 0 || Rasterizer3D.clips.clipX == 0) {
            if (field3552[var1]) {
               method6823(this, var1);
            } else {
               int var2 = this.indices1[var1];
               int var3 = this.indices2[var1];
               int var4 = this.indices3[var1];
               Rasterizer3D.clips.clipping = field3519[var1];
               int var5 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
               float var6 = WorldMapSectionType.method7174(field3525[var2] - var5, -872632755);
               float var7 = WorldMapSectionType.method7174(field3525[var3] - var5, 1992637228);
               float var8 = WorldMapSectionType.method7174(field3525[var4] - var5, -2132550341);
               this.method6821(
                  var1,
                  modelViewportYs[var2],
                  modelViewportYs[var3],
                  modelViewportYs[var4],
                  modelViewportXs[var2],
                  modelViewportXs[var3],
                  modelViewportXs[var4],
                  var6,
                  var7,
                  var8,
                  this.faceColors1[var1],
                  this.faceColors2[var1],
                  this.faceColors3[var1]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I)V")
   @ObfuscatedName("aq")
   public void method6895(classFY var1, int var2) {
      this.method6856(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bl")
   final void drawFace(int var1) {
      if (this.faceAlphas == null) {
         Rasterizer3D.clips.clipX = 0;
      } else {
         Rasterizer3D.clips.clipX = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 1229810895;
      }

      if (Rasterizer3D.clips.currentFaceAlpha != 1 || Rasterizer3D.clips.clipX != 0) {
         if (Rasterizer3D.clips.currentFaceAlpha != 0 || Rasterizer3D.clips.clipX == 0) {
            if (field3552[var1]) {
               method6823(this, var1);
            } else {
               int var2 = this.indices1[var1];
               int var3 = this.indices2[var1];
               int var4 = this.indices3[var1];
               Rasterizer3D.clips.clipping = field3519[var1];
               int var5 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
               float var6 = WorldMapSectionType.method7174(field3525[var2] - var5, -1586611992);
               float var7 = WorldMapSectionType.method7174(field3525[var3] - var5, 1498591832);
               float var8 = WorldMapSectionType.method7174(field3525[var4] - var5, 2115607255);
               this.method6821(
                  var1,
                  modelViewportYs[var2],
                  modelViewportYs[var3],
                  modelViewportYs[var4],
                  modelViewportXs[var2],
                  modelViewportXs[var3],
                  modelViewportXs[var4],
                  var6,
                  var7,
                  var8,
                  this.faceColors1[var1],
                  this.faceColors2[var1],
                  this.faceColors3[var1]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("fx")
   boolean method6818(int var1) {
      return var1 < this.field3573;
   }

   @ObfuscatedSignature(descriptor = "(Lky;III)V")
   @ObfuscatedName("fk")
   public static void method6877(Model var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.offsetBy(var1, var1, var1);
      } else {
         for (int var4 = 0; var4 < var0.verticesCount; var4++) {
            var0.field3501[var4] = var0.field3501[var4] + var1;
            var0.field3507[var4] = var0.field3507[var4] + var2;
            var0.field3503[var4] = var0.field3503[var4] + var3;
         }

         var0.method6887();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fe")
   void method6845() {
      if (this.radius != 2) {
         this.radius = 2;
         float var1 = 0.0F;

         for (int var2 = 0; var2 < this.verticesCount; var2++) {
            float var3 = this.field3501[var2];
            float var4 = this.field3507[var2];
            float var5 = this.field3503[var2];
            float var6 = var3 * var3 + var5 * var5 + var4 * var4;
            if (var6 > var1) {
               var1 = var6;
            }
         }

         this.diameter = (int)Math.ceil(Math.sqrt(var1));
         this.xzRadius = this.diameter;
         this.bottomY = this.diameter + this.diameter;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljt;I[IZ)V")
   @ObfuscatedName("bz")
   public void method6769(Frames var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.animate(var1, var2);
      } else {
         Animation var5 = var1.frames[var2];
         Skeleton var6 = var5.skeleton;
         int var7 = 0;
         int var8 = var3[var7++];
         Model_transformTempX = 0;
         Model_transformTempY = 0;
         Model_transformTempZ = 0;
         method6879(-1);

         for (int var9 = 0; var9 < var5.transformCount; var9++) {
            int var10 = var5.transformYs[var9];

            while (var10 > var8) {
               var8 = var3[var7++];
            }

            if (var4) {
               if (var10 == var8 || var6.transformTypes[var10] == 0) {
                  this.transform(
                     var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
                  );
               }
            } else if (var10 != var8 || var6.transformTypes[var10] == 0) {
               this.transform(
                  var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IFFFFFFFFFIII)V")
   @ObfuscatedName("fd")
   final void method6822(
      int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13
   ) {
      if (this.faceTextures != null && this.faceTextures[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.textureFaces != null && this.textureFaces[var1] != -1) {
            int var17 = this.textureFaces[var1] & 255;
            var18 = this.texIndices1[var17];
            var15 = this.texIndices2[var17];
            var16 = this.texIndices3[var17];
         } else {
            var18 = this.indices1[var1];
            var15 = this.indices2[var1];
            var16 = this.indices3[var1];
         }

         if (this.faceColors3[var1] == -1) {
            Rasterizer3D.rasterTextureWithShadingAndLighting(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var11,
               var11,
               field3536[var18],
               field3536[var15],
               field3536[var16],
               field3533[var18],
               field3533[var15],
               field3533[var16],
               field3541[var18],
               field3541[var15],
               field3541[var16],
               this.faceTextures[var1]
            );
         } else {
            Rasterizer3D.rasterTextureWithShadingAndLighting(
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var12,
               var13,
               field3536[var18],
               field3536[var15],
               field3536[var16],
               field3533[var18],
               field3533[var15],
               field3533[var16],
               field3541[var18],
               field3541[var15],
               field3541[var16],
               this.faceTextures[var1]
            );
         }
      } else {
         boolean var14 = this.method6817(var1);
         if (this.faceColors3[var1] == -1 && var14) {
            Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3522[this.faceColors1[var1]]);
         } else if (this.faceColors3[var1] == -1) {
            Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3522[this.faceColors1[var1]]);
         } else if (var14) {
            Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         } else {
            Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fv")
   final void method6824(int var1) {
      int var2 = Rasterizer3D.getClipMidX();
      int var3 = Rasterizer3D.getClipMidY();
      int var4 = 0;
      int var5 = this.indices1[var1];
      int var6 = this.indices2[var1];
      int var7 = this.indices3[var1];
      int var8 = field3541[var5];
      int var9 = field3541[var6];
      int var10 = field3541[var7];
      if (this.faceAlphas == null) {
         Rasterizer3D.clips.clipX = 0;
      } else {
         Rasterizer3D.clips.clipX = this.faceAlphas[var1] & 255;
      }

      if (var8 >= 50) {
         field3535[var4] = (int)modelViewportXs[var5];
         field3553[var4] = (int)modelViewportYs[var5];
         field3555[var4] = field3525[var5];
         field3554[var4++] = this.faceColors1[var1];
      } else {
         int var11 = field3536[var5];
         int var12 = field3533[var5];
         int var13 = this.faceColors1[var1];
         if (var10 >= 50) {
            int var14 = (50 - var8) * field3543[var10 - var8];
            field3535[var4] = var2 + (var11 + ((field3536[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var12 + ((field3533[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            int var35 = (50 - var8) * field3543[var9 - var8];
            field3535[var4] = var2 + (var11 + ((field3536[var6] - var11) * var35 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var12 + ((field3533[var6] - var12) * var35 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var13 + ((this.faceColors2[var1] - var13) * var35 >> 16);
         }
      }

      if (var9 >= 50) {
         field3535[var4] = (int)modelViewportXs[var6];
         field3553[var4] = (int)modelViewportYs[var6];
         field3555[var4] = field3525[var6];
         field3554[var4++] = this.faceColors2[var1];
      } else {
         int var26 = field3536[var6];
         int var29 = field3533[var6];
         int var32 = this.faceColors2[var1];
         if (var8 >= 50) {
            int var36 = (50 - var9) * field3543[var8 - var9];
            field3535[var4] = var2 + (var26 + ((field3536[var5] - var26) * var36 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var29 + ((field3533[var5] - var29) * var36 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var32 + ((this.faceColors1[var1] - var32) * var36 >> 16);
         }

         if (var10 >= 50) {
            int var37 = (50 - var9) * field3543[var10 - var9];
            field3535[var4] = var2 + (var26 + ((field3536[var7] - var26) * var37 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var29 + ((field3533[var7] - var29) * var37 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var32 + ((this.faceColors3[var1] - var32) * var37 >> 16);
         }
      }

      if (var10 >= 50) {
         field3535[var4] = (int)modelViewportXs[var7];
         field3553[var4] = (int)modelViewportYs[var7];
         field3555[var4] = field3525[var7];
         field3554[var4++] = this.faceColors3[var1];
      } else {
         int var27 = field3536[var7];
         int var30 = field3533[var7];
         int var33 = this.faceColors3[var1];
         if (var9 >= 50) {
            int var38 = (50 - var10) * field3543[var9 - var10];
            field3535[var4] = var2 + (var27 + ((field3536[var6] - var27) * var38 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var30 + ((field3533[var6] - var30) * var38 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var33 + ((this.faceColors2[var1] - var33) * var38 >> 16);
         }

         if (var8 >= 50) {
            int var39 = (50 - var10) * field3543[var8 - var10];
            field3535[var4] = var2 + (var27 + ((field3536[var5] - var27) * var39 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3553[var4] = var3 + (var30 + ((field3533[var5] - var30) * var39 >> 16)) * Rasterizer3D.get3dZoom() / 50;
            field3555[var4] = 50.0F;
            field3554[var4++] = var33 + ((this.faceColors1[var1] - var33) * var39 >> 16);
         }
      }

      int var28 = field3535[0];
      int var31 = field3535[1];
      int var34 = field3535[2];
      int var40 = field3553[0];
      int var15 = field3553[1];
      int var16 = field3553[2];
      int var17 = this.faceBias == null ? 0 : this.faceBias[var1] * 2;
      float var18 = WorldMapSectionType.method7174(field3555[0] - var17, -1730741629);
      float var19 = WorldMapSectionType.method7174(field3555[1] - var17, -1666770462);
      float var20 = WorldMapSectionType.method7174(field3555[2] - var17, 907192308);
      Rasterizer3D.clips.clipping = false;
      int var21 = Rasterizer3D.method5865();
      if (var4 == 3) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21) {
            Rasterizer3D.clips.clipping = true;
         }

         this.method6821(var1, var40, var15, var16, var28, var31, var34, var18, var19, var20, field3554[0], field3554[1], field3554[2]);
      }

      if (var4 == 4) {
         if (var28 < 0 || var31 < 0 || var34 < 0 || var28 > var21 || var31 > var21 || var34 > var21 || field3535[3] < 0 || field3535[3] > var21) {
            Rasterizer3D.clips.clipping = true;
         }

         if (this.faceTextures != null && this.faceTextures[var1] != -1) {
            int var24;
            int var41;
            int var43;
            if (this.textureFaces != null && this.textureFaces[var1] != -1) {
               int var25 = this.textureFaces[var1] & 255;
               var41 = this.texIndices1[var25];
               var43 = this.texIndices2[var25];
               var24 = this.texIndices3[var25];
            } else {
               var41 = var5;
               var43 = var6;
               var24 = var7;
            }

            short var44 = this.faceTextures[var1];
            if (this.faceColors3[var1] == -1) {
               Rasterizer3D.rasterTextureWithShadingAndLighting(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  this.faceColors1[var1],
                  this.faceColors1[var1],
                  this.faceColors1[var1],
                  field3536[var41],
                  field3536[var43],
                  field3536[var24],
                  field3533[var41],
                  field3533[var43],
                  field3533[var24],
                  field3541[var41],
                  field3541[var43],
                  field3541[var24],
                  var44
               );
               Rasterizer3D.rasterTextureWithShadingAndLighting(
                  var40,
                  var16,
                  field3553[3],
                  var28,
                  var34,
                  field3535[3],
                  var18,
                  var20,
                  field3555[3],
                  this.faceColors1[var1],
                  this.faceColors1[var1],
                  this.faceColors1[var1],
                  field3536[var41],
                  field3536[var43],
                  field3536[var24],
                  field3533[var41],
                  field3533[var43],
                  field3533[var24],
                  field3541[var41],
                  field3541[var43],
                  field3541[var24],
                  var44
               );
            } else {
               Rasterizer3D.rasterTextureWithShadingAndLighting(
                  var40,
                  var15,
                  var16,
                  var28,
                  var31,
                  var34,
                  var18,
                  var19,
                  var20,
                  field3554[0],
                  field3554[1],
                  field3554[2],
                  field3536[var41],
                  field3536[var43],
                  field3536[var24],
                  field3533[var41],
                  field3533[var43],
                  field3533[var24],
                  field3541[var41],
                  field3541[var43],
                  field3541[var24],
                  var44
               );
               Rasterizer3D.rasterTextureWithShadingAndLighting(
                  var40,
                  var16,
                  field3553[3],
                  var28,
                  var34,
                  field3535[3],
                  var18,
                  var20,
                  field3555[3],
                  field3554[0],
                  field3554[2],
                  field3554[3],
                  field3536[var41],
                  field3536[var43],
                  field3536[var24],
                  field3533[var41],
                  field3533[var43],
                  field3533[var24],
                  field3541[var41],
                  field3541[var43],
                  field3541[var24],
                  var44
               );
            }
         } else {
            boolean var22 = this.method6817(var1);
            if (this.faceColors3[var1] == -1 && var22) {
               int var42 = field3522[this.faceColors1[var1]];
               Rasterizer3D.rasterTriangle(var40, var15, var16, var28, var31, var34, var18, var19, var20, var42);
               Rasterizer3D.rasterTriangle(var40, var16, field3553[3], var28, var34, field3535[3], var18, var20, field3555[3], var42);
            } else if (this.faceColors3[var1] == -1) {
               int var23 = field3522[this.faceColors1[var1]];
               Rasterizer3D.rasterFlat(var40, var15, var16, var28, var31, var34, var18, var19, var20, var23);
               Rasterizer3D.rasterFlat(var40, var16, field3553[3], var28, var34, field3535[3], var18, var20, field3555[3], var23);
            } else if (var22) {
               Rasterizer3D.rasterTriangleWithGradient(var40, var15, var16, var28, var31, var34, var18, var19, var20, field3554[0], field3554[1], field3554[2]);
               Rasterizer3D.rasterTriangleWithGradient(
                  var40, var16, field3553[3], var28, var34, field3535[3], var18, var20, field3555[3], field3554[0], field3554[2], field3554[3]
               );
            } else {
               Rasterizer3D.rasterGouraud(var40, var15, var16, var28, var31, var34, var18, var19, var20, field3554[0], field3554[1], field3554[2]);
               Rasterizer3D.rasterGouraud(
                  var40, var16, field3553[3], var28, var34, field3535[3], var18, var20, field3555[3], field3554[0], field3554[2], field3554[3]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZLky;[B)Lky;")
   @ObfuscatedName("cj")
   Model method6730(boolean var1, Model var2, byte[] var3) {
      var2.verticesCount = this.verticesCount;
      var2.indicesCount = this.indicesCount;
      var2.texIndicesCount = this.texIndicesCount;
      if (var2.field3501 == null || var2.field3501.length < this.verticesCount) {
         var2.field3501 = new float[this.verticesCount + 831699431];
         var2.field3507 = new float[this.verticesCount + 100];
         var2.field3503 = new float[this.verticesCount + 100];
      }

      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         var2.field3501[var4] = this.field3501[var4];
         var2.field3507[var4] = this.field3507[var4];
         var2.field3503[var4] = this.field3503[var4];
      }

      if (var1) {
         var2.faceAlphas = this.faceAlphas;
      } else {
         var2.faceAlphas = var3;
         if (this.faceAlphas == null) {
            for (int var5 = 0; var5 < this.indicesCount; var5++) {
               var2.faceAlphas[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < this.indicesCount; var6++) {
               var2.faceAlphas[var6] = this.faceAlphas[var6];
            }
         }
      }

      var2.indices1 = this.indices1;
      var2.indices2 = this.indices2;
      var2.indices3 = this.indices3;
      var2.faceColors1 = this.faceColors1;
      var2.faceColors2 = this.faceColors2;
      var2.faceColors3 = this.faceColors3;
      var2.faceRenderPriorities = this.faceRenderPriorities;
      var2.textureFaces = this.textureFaces;
      var2.faceTextures = this.faceTextures;
      var2.faceBias = this.faceBias;
      var2.field3502 = this.field3502;
      var2.texIndices1 = this.texIndices1;
      var2.texIndices2 = this.texIndices2;
      var2.texIndices3 = this.texIndices3;
      var2.faceLabelsAlpha = this.faceLabelsAlpha;
      var2.field3518 = this.field3518;
      var2.vertexLabels = this.vertexLabels;
      var2.field3581 = this.field3581;
      var2.isSingleTile = this.isSingleTile;
      var2.modelColorOverride = this.modelColorOverride;
      var2.field3573 = this.field3573;
      var2.method6742();
      return var2;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("hs")
   public Model method6863() {
      return this.field3572;
   }

   public float[] getVerticesZ() {
      return this.field3503;
   }

   @ObfuscatedSignature(descriptor = "(ILry;)V")
   @ObfuscatedName("gn")
   void method6827(int var1, TransformationMatrix var2) {
      float var3 = (int)this.field3501[var1];
      float var4 = -((int)this.field3507[var1]);
      float var5 = -((int)this.field3503[var1]);
      float var6 = 1.0F;
      this.field3501[var1] = var2.field5724 * var3 + var2.field5735 * var4 + var2.field5743 * var5 + var2.field5742 * var6;
      this.field3507[var1] = -((int)(var2.field5736 * var3 + var2.field5725 * var4 + var2.field5739 * var5 + var2.field5737 * var6));
      this.field3503[var1] = -((int)(var2.field5740 * var3 + var2.field5741 * var4 + var2.field5726 * var5 + var2.field5734 * var6));
   }

   @ObfuscatedSignature(descriptor = "(ILry;IIIJ)V")
   @ObfuscatedName("kg")
   @Override
   void vmethod253(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
      if (Rasterizer3D.clips.currentFaceAlpha != 1 || this.faceAlphas != null) {
         if (this.radius != 1) {
            this.method6864();
         }

         this.calculateBoundingBox(var1);
         class456 var8 = BuddyRankComparator.method3976(-814754263);
         var8.field5516.method9303(var1 * 0.0030679614F, 0.0F, 0.0F, -1574760321);
         var8.field5514.method9868(1.0F, 1.0F, 1.0F, -1501892792);
         var8.field5515.method9868(var3, var4, var5, -604376616);
         TransformationMatrix var9 = SecureUrlRequester.method3893(1995612823);
         var9.method10017(var8, (byte)86);
         TransformationMatrix.method9959(var9, var2, (byte)-87);
         int var10 = (int)var9.method9997(0.0F, 0.0F, 0.0F, (short)1603);
         boolean var11 = false;
         int var12 = var10 - this.xzRadius;
         boolean var13 = var12 <= 50 || this.faceTextures != null;
         boolean var14 = WorldMapLabelSize.method7220(var6);
         boolean var15 = false;
         if (var14) {
            boolean var16 = ViewportMouse.ViewportMouse_isInViewport;
            if (var16) {
               int var19 = Rasterizer3D.getClipMidX();
               int var20 = Rasterizer3D.getClipMidY();
               int var21 = Rasterizer3D.get3dZoom();
               boolean var22 = ViewportMouse.ViewportMouse_isInViewport;
               boolean var17;
               if (!var22) {
                  var17 = false;
               } else {
                  if (!ViewportMouse.ViewportMouse_false0) {
                     int var23 = 50;
                     int var24 = AbstractRasterizer.method5428();
                     int var25 = var23 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var26 = var23 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     int var27 = var24 * (ViewportMouse.ViewportMouse_x * 770621097 - var19) / var21;
                     int var28 = var24 * (ViewportMouse.ViewportMouse_y * -459009589 - var20) / var21;
                     TransformationMatrix var29;
                     synchronized (TransformationMatrix.field5731) {
                        if (TransformationMatrix.field5729 * -1539552615 == 0) {
                           var29 = new TransformationMatrix(var2);
                        } else {
                           TransformationMatrix.method10012(
                              TransformationMatrix.field5731[(TransformationMatrix.field5729 -= -794138199) * -1539552615], var2, -1043873205
                           );
                           var29 = TransformationMatrix.field5731[TransformationMatrix.field5729 * -1539552615];
                        }
                     }

                     var29.method9982(-1129147089);
                     float[] var31 = new float[3];
                     var29.transformPoint(var25, var26, var23, var31, 1045119330);
                     var25 = (int)var31[0];
                     var26 = (int)var31[1];
                     var23 = (int)var31[2];
                     var29.transformPoint(var27, var28, var24, var31, 1045119330);
                     var27 = (int)var31[0];
                     var28 = (int)var31[1];
                     var24 = (int)var31[2];
                     TransformationMatrix.method9929(var29, (byte)1);
                     ReflectionCheck.method3891(var25, var26, var23, var27, var28, var24, 327716789);
                  }

                  var17 = class179.method4238(this, var1, var3, var4, var5, 1962342810);
               }

               if (var17) {
                  if (this.isSingleTile) {
                     int var43 = (int)var9.method9997(0.0F, this.height * -1272589951 / 2, 0.0F, (short)1603);
                     int var45 = var43 - this.diameter;
                     Varps.method8676(var6, var45, -877355694);
                  } else {
                     var15 = true;
                  }
               }
            }
         }

         int var34 = Rasterizer3D.getClipMidX();
         int var35 = Rasterizer3D.getClipMidY();

         for (int var18 = 0; var18 < this.verticesCount; var18++) {
            float var36 = (int)this.field3501[var18];
            float var38 = (int)this.field3507[var18];
            float var40 = (int)this.field3503[var18];
            var9.transformPoint(var36, var38, var40, field3544, 1045119330);
            var36 = field3544[0];
            var38 = field3544[1];
            var40 = field3544[2];
            var11 |= this.method6797(var18, var36, var38, var40, var10, var34, var35, var13);
         }

         var8.method9422((short)9449);
         TransformationMatrix.method9929(var9, (byte)1);

         try {
            this.draw0(var11, var15, this.isSingleTile, var6);
         } catch (Exception var32) {
         }
      }
   }

   public void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.method6790(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @ObfuscatedSignature(descriptor = "(Ljq;I)V")
   @ObfuscatedName("go")
   void method6830(class251 var1, int var2) {
      if (this.vertexLabels != null) {
         for (int var3 = 0; var3 < this.verticesCount; var3++) {
            int[] var4 = this.vertexLabels[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field3581[var3];
               TransformationMatrix.method9943(field3549, 376553717);

               for (int var6 = 0; var6 < var4.length; var6++) {
                  int var7 = var4[var6];
                  class136 var8 = var1.method6159(var7, -146335463);
                  if (var8 != null) {
                     field3550.method9950(var5[var6] / 255.0F, 1724482647);
                     TransformationMatrix.method10012(field3551, var8.method4073(var2, (byte)-5), -448342693);
                     TransformationMatrix.method9959(field3551, field3550, (byte)-114);
                     field3549.method10018(field3551, (byte)1);
                  }
               }

               method6720(this, var3, field3549);
            }
         }
      }
   }

   public float[] getVerticesY() {
      return this.field3507;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ff")
   public final void method6794(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.radius != 2) {
         this.method6845();
      }

      int var9 = Rasterizer3D.getClipMidX();
      int var10 = Rasterizer3D.getClipMidY();
      int var11 = field3539[var1];
      int var12 = field3540[var1];
      int var13 = field3539[var2];
      int var14 = field3540[var2];
      int var15 = field3539[var3];
      int var16 = field3540[var3];
      int var17 = field3539[var4];
      int var18 = field3540[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for (int var20 = 0; var20 < this.verticesCount; var20++) {
         int var21 = (int)this.field3501[var20];
         int var22 = (int)this.field3507[var20];
         int var23 = (int)this.field3503[var20];
         if (var3 != 0) {
            int var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            int var30 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var30;
         }

         if (var2 != 0) {
            int var31 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var31;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         int var32 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field3526[var20] = var23 - var19;
         modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
         modelViewportYs[var20] = var10 + var32 * Rasterizer3D.get3dZoom() / var8;
         field3525[var20] = var8;
         if (this.faceTextures != null) {
            field3536[var20] = var21;
            field3533[var20] = var32;
            field3541[var20] = var23;
         }
      }

      try {
         this.draw0(false, false, false, 0L);
      } catch (Exception var25) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljq;I)V")
   @ObfuscatedName("gf")
   void method6831(class251 var1, int var2) {
      if (this.vertexLabels != null) {
         for (int var3 = 0; var3 < this.verticesCount; var3++) {
            int[] var4 = this.vertexLabels[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field3581[var3];
               TransformationMatrix.method9943(field3549, 2013968320);

               for (int var6 = 0; var6 < var4.length; var6++) {
                  int var7 = var4[var6];
                  class136 var8 = var1.method6159(var7, -146335463);
                  if (var8 != null) {
                     field3550.method9950(var5[var6] / 255.0F, -1658413951);
                     TransformationMatrix.method10012(field3551, var8.method4073(var2, (byte)-78), -1455393866);
                     TransformationMatrix.method9959(field3551, field3550, (byte)-18);
                     field3549.method10018(field3551, (byte)1);
                  }
               }

               method6720(this, var3, field3549);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljt;I[IZ)V")
   @ObfuscatedName("qz")
   public static void method6770(Model var0, Frames var1, int var2, int[] var3, boolean var4) {
      if (var0 == null) {
         var0.method6737();
      }

      if (var3 == null) {
         var0.animate(var1, var2);
      } else {
         Animation var5 = var1.frames[var2];
         Skeleton var6 = var5.skeleton;
         int var7 = 0;
         int var8 = var3[var7++];
         Model_transformTempX = 0;
         Model_transformTempY = 0;
         Model_transformTempZ = 0;

         for (int var9 = 0; var9 < var5.transformCount; var9++) {
            int var10 = var5.transformYs[var9];

            while (var10 > var8) {
               var8 = var3[var7++];
            }

            if (var4) {
               if (var10 == var8 || var6.transformTypes[var10] == 0) {
                  var0.transform(
                     var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
                  );
               }
            } else if (var10 != var8 || var6.transformTypes[var10] == 0) {
               var0.transform(
                  var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lko;S)V")
   @ObfuscatedName("gs")
   public void method6833(ModelColorOverride var1, short var2) {
      if (this.modelColorOverride == null) {
         this.modelColorOverride = new ModelColorOverride();
      }

      this.modelColorOverride.method6530(var1);
      this.field3573 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lko;S)V")
   @ObfuscatedName("gg")
   public void method6834(ModelColorOverride var1, short var2) {
      if (this.modelColorOverride == null) {
         this.modelColorOverride = new ModelColorOverride();
      }

      this.modelColorOverride.method6530(var1);
      this.field3573 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public void rotateY90Ccw() {
      this.method6845();
   }

   public byte[] getTextureFaces() {
      return this.textureFaces;
   }

   public int[] getTexIndices3() {
      return this.texIndices3;
   }

   @ObfuscatedSignature(descriptor = "(Ljt;I[IZ)V")
   @ObfuscatedName("ef")
   public void method6771(Frames var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.animate(var1, var2);
      } else {
         Animation var5 = var1.frames[var2];
         Skeleton var6 = var5.skeleton;
         int var7 = 0;
         int var8 = var3[var7++];
         Model_transformTempX = 0;
         Model_transformTempY = 0;
         Model_transformTempZ = 0;

         for (int var9 = 0; var9 < var5.transformCount; var9++) {
            int var10 = var5.transformYs[var9];

            while (var10 > var8) {
               var8 = var3[var7++];
            }

            if (var4) {
               if (var10 == var8 || var6.transformTypes[var10] == 0) {
                  this.transform(
                     var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
                  );
               }
            } else if (var10 != var8 || var6.transformTypes[var10] == 0) {
               this.transform(
                  var6.transformTypes[var10], var6.labels[var10], var5.transformSkeletonLabels[var9], var5.transformZs[var9], var5.transformXs[var9]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   public void method6838() {
      this.modelColorOverride = null;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("ck")
   public void method6839(float var1) {
      for (int var2 = 0; var2 < this.verticesCount; var2++) {
         this.field3507[var2] = (int)this.field3507[var2] * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;Ljt;ILjt;III)V")
   @ObfuscatedName("xf")
   public void method6862(rl19 var1, Frames var2, int var3, Frames var4, int var5, int var6, int var7) {
      if (this.faceLabelsAlpha != null && var3 != -1) {
         Animation var8 = var2.frames[var3];
         Skeleton var9 = var8.skeleton;
         Animation var10 = null;
         if (var4 != null) {
            var10 = var4.frames[var5];
            if (var10.skeleton != var9) {
               var10 = null;
            }
         }

         var1.field5585 = var1.field5584 = var1.field5586 = 0.0F;
         this.method6854(var1, var9, var8, var10, var6 + (float)NanoClock.field2569, var7);
         this.method6887();
      }
   }

   public void setUvBufferOffset(int var1) {
      this.field3570 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gw")
   public void method6840(int var1) {
      for (int var2 = 0; var2 < this.verticesCount; var2++) {
         this.field3507[var2] = (int)this.field3507[var2] + var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lky;")
   @ObfuscatedName("cq")
   public Model method6725(boolean var1) {
      if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
         Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
      }

      return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
   }

   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("cp")
   void method6715(Model var1) {
      int var2 = this.indices1.length;
      if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field3502 != var1.field3502)) {
         this.faceRenderPriorities = new byte[var2];
         Arrays.fill(this.faceRenderPriorities, this.field3502);
      }

      if (this.faceAlphas == null && var1.faceAlphas != null) {
         this.faceAlphas = new byte[var2];
         Arrays.fill(this.faceAlphas, (byte)0);
      }

      if (this.faceTextures == null && var1.faceTextures != null) {
         this.faceTextures = new short[var2];
         Arrays.fill(this.faceTextures, (short)-1);
      }

      if (this.textureFaces == null && var1.textureFaces != null) {
         this.textureFaces = new byte[var2];
         Arrays.fill(this.textureFaces, (byte)-1);
      }

      if (this.faceBias == null && var1.faceBias != null) {
         this.faceBias = new byte[var2];
         Arrays.fill(this.faceBias, (byte)0);
      }
   }

   public int[] getVertexNormalsZ() {
      return this.field3579;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("db")
   public int method6741() {
      this.method6777();
      return this.bottomY;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;III)V")
   @ObfuscatedName("qv")
   public static void method6788(Model var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method6890(var1, var1, var1);
      }

      for (int var4 = 0; var4 < var0.verticesCount; var4++) {
         var0.field3501[var4] = (int)var0.field3501[var4] * var1 / 128;
         var0.field3507[var4] = (int)var0.field3507[var4] * var2 / 128;
         var0.field3503[var4] = (int)var0.field3503[var4] * var3 / -336415766;
      }

      var0.method6742();
   }

   @ObfuscatedSignature(descriptor = "(Ljt;ILjt;I[I)V")
   @ObfuscatedName("bg")
   public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            Animation var6 = var1.frames[var2];
            Animation var7 = var3.frames[var4];
            Skeleton var8 = var6.skeleton;
            Model_transformTempY = 0;
            Model_transformTempX = 0;
            Model_transformTempZ = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.transformCount; var11++) {
               int var12 = var6.transformZs[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.transformTypes[var12] == 0) {
                  this.transform(
                     var8.transformTypes[var12], var8.labels[var12], var6.transformYs[var11], var6.transformSkeletonLabels[var11], var6.transformYs[var11]
                  );
               }
            }

            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempX = 0;
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.transformCount; var17++) {
               int var18 = var7.transformZs[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.transformTypes[var18] == 0) {
                  this.transform(var8.transformTypes[var18], var8.labels[var18], var7.transformXs[var17], var7.transformYs[var17], var7.transformYs[var17]);
               }
            }

            this.method6866();
         } else {
            this.animate(var1, var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fc")
   final void method6853(int var1) {
      this.field3568 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cc")
   public void method6897(int var1) {
      this.method6735(var1);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bu")
   public void offsetBy(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.indicesCount; var4++) {
         this.field3501[var4] = this.field3501[var4] + var1;
         this.field3501[var4] = this.field3501[var4] + var2;
         this.field3503[var4] = this.field3503[var4] + var3;
      }

      this.method6867();
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ba")
   public void scale(int var1, int var2, int var3) {
      this.method6872(var1, var2, var3);
      this.field3501 = new float[var1];
      this.field3507 = new float[var1];
      this.field3503 = new float[var1];
      this.texIndices1 = new int[var2];
      this.indices3 = new int[var2];
      this.indices2 = new int[var2];
      this.faceColors1 = new int[var2];
      this.texIndices1 = new int[var2];
      this.faceColors3 = new int[var2];
      if (var3 > 0) {
         this.indices1 = new int[var3];
         this.verticesX = new int[var3];
         this.indices2 = new int[var3];
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljq;I)V")
   @ObfuscatedName("gm")
   void method6757(class251 var1, int var2) {
      this.method6756(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;Ljt;I)V")
   @ObfuscatedName("fa")
   public void method6873(rl19 var1, Frames var2, int var3) {
      if (this.faceLabelsAlpha != null && var3 != -1) {
         Animation var4 = var2.frames[var3];
         Skeleton var5 = var4.skeleton;
         var1.field5589 = 0;
         var1.field5587 = 0;
         var1.field5588 = 0;

         for (int var6 = 0; var6 < var4.transformCount; var6++) {
            int var7 = var4.transformYs[var6];
            this.method6865(
               var1, var5.transformTypes[var7], var5.labels[var7], var4.transformSkeletonLabels[var6], var4.transformZs[var6], var4.transformXs[var6]
            );
         }

         this.method6887();
      }
   }

   @ObfuscatedSignature(descriptor = "([Lky;I)V")
   @ObfuscatedName("dj")
   public void method6876(Model[] var1, int var2) {
      this.method6866();
   }

   public byte[] getFaceBias() {
      return this.faceBias;
   }

   @ObfuscatedSignature(descriptor = "(Ljc;Lfy;I[ZZZ)V")
   @ObfuscatedName("bs")
   public void method6766(Skeleton var1, classFY var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class251 var7 = var1.method5403(-510419997);
      if (var7 != null) {
         var7.method6172(var2, var3, var4, var5, -1942430699);
         if (var6) {
            Scene.method5518(this, var7, var2.method4165((byte)97));
         }
      }

      if (!var5 && var2.method4169((byte)12)) {
         this.method6856(var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eu")
   public void method6783(int var1) {
      int var2 = field3543[var1];
      int var3 = field3520[var1];

      for (int var4 = 0; var4 < this.field3569; var4++) {
         int var5 = (int)this.field3503[var4] * var3 - (int)this.field3501[var4] * var2 >> 16;
         this.field3503[var4] = (int)this.field3503[var4] * var2 + (int)this.field3503[var4] * var3 >> 16;
         this.field3503[var4] = var5;
      }

      this.method6776();
   }

   public void calculateBoundsCylinder() {
      this.method6864();
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("bt")
   public void method6848(class461 var1) {
      ProjectionCoord var2 = ProjectionCoord.method9856(0.0F, 0.0F, 0.0F);

      for (int var3 = 0; var3 < this.verticesCount; var3++) {
         var2.method9921(this.field3503[var3], this.field3503[var3], this.field3501[var3]);
         var2.method9922(var1);
         this.field3503[var3] = var2.y;
         this.field3503[var3] = var2.x;
         this.field3501[var3] = var2.y;
      }

      var2.method9866();
      this.method6745();
   }

   @ObfuscatedSignature(descriptor = "(ILry;)V")
   @ObfuscatedName("cu")
   void method6721(int var1, TransformationMatrix var2) {
      float var3 = this.field3501[var1];
      float var4 = -this.field3507[var1];
      float var5 = -this.field3503[var1];
      float var6 = 1.0F;
      this.field3501[var1] = var2.field5724 * var3 + var2.field5724 * var4 + var2.field5741 * var5 + var2.field5738 * var6;
      this.field3507[var1] = -(var2.field5732 * var3 + var2.field5741 * var4 + var2.field5724 * var5 + var2.field5732 * var6);
      this.field3503[var1] = -(var2.field5743 * var3 + var2.field5740 * var4 + var2.field5735 * var5 + var2.field5727 * var6);
   }

   @ObfuscatedSignature(descriptor = "(Ljs;)V")
   @ObfuscatedName("cs")
   void method6844(classJS var1) {
      this.field3498 = var1;
   }
}
