import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jm")
public class ModelData extends Renderable implements net.runelite.api.ModelData {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field3124 = -2;
   @ObfuscatedName("ah")
   byte[] textureCoords;
   @ObfuscatedSignature(descriptor = "[Lke;")
   @ObfuscatedName("bi")
   VertexNormal[] vertexVertices;
   @ObfuscatedName("ba")
   int[][] faceLabelsAlpha;
   @ObfuscatedName("ae")
   static int[] field3121 = new int[10000];
   @ObfuscatedName("wg")
   public int[] field3134;
   @ObfuscatedName("aj")
   static int field3119 = 0;
   @ObfuscatedName("au")
   int[] verticesY;
   @ObfuscatedName("az")
   int[] verticesZ;
   @ObfuscatedName("ap")
   int verticesCount = 0;
   @ObfuscatedName("ay")
   int[] verticesX;
   @ObfuscatedName("br")
   int field3129;
   @ObfuscatedName("aq")
   byte[] textureRenderTypes;
   @ObfuscatedName("ad")
   int faceCount = 0;
   @ObfuscatedName("ai")
   int[] indices1;
   @ObfuscatedName("as")
   int[] indices2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field3123 = -1;
   @ObfuscatedName("ac")
   int[] indices3;
   @ObfuscatedName("ax")
   byte[] faceRenderPriorities;
   @ObfuscatedName("ar")
   byte[] faceAlphas;
   @ObfuscatedName("bu")
   int[][] vertexLabels;
   @ObfuscatedName("bo")
   short[] texTriangleY;
   @ObfuscatedName("bg")
   short[] texTriangleZ;
   @ObfuscatedName("bt")
   int[] faceSkins;
   @ObfuscatedName("aw")
   static int[] ModelData_cosine = Rasterizer3D.Rasterizer3D_cosine;
   @ObfuscatedName("tq")
   public float[] field3101;
   @ObfuscatedName("bn")
   int field3128;
   @ObfuscatedName("wk")
   public int[] field3135;
   @ObfuscatedName("ak")
   static int[] ModelData_sine = Rasterizer3D.Rasterizer3D_sine;
   @ObfuscatedName("al")
   short[] faceColors;
   @ObfuscatedName("af")
   short[] faceTextures;
   @ObfuscatedName("be")
   short[] texTriangleX;
   @ObfuscatedName("zv")
   public float[] field3096;
   @ObfuscatedName("xe")
   public int[] field3136;
   @ObfuscatedSignature(descriptor = "[Ljy;")
   @ObfuscatedName("bs")
   FaceNormal[] faceNormals;
   @ObfuscatedSignature(descriptor = "[Lke;")
   @ObfuscatedName("bz")
   VertexNormal[] vertexNormals;
   @ObfuscatedName("bk")
   public short ambient;
   @ObfuscatedName("bb")
   public short contrast;
   @ObfuscatedName("bj")
   int[][] field3095;
   @ObfuscatedName("bm")
   int[][] field3105;
   @ObfuscatedName("aa")
   int textureTriangleCount;
   @ObfuscatedName("ab")
   byte[] faceRenderTypes;
   @ObfuscatedName("ao")
   byte priority = 0;
   @ObfuscatedName("am")
   byte[] field3089;
   @ObfuscatedName("an")
   static int[] field3118 = new int[10000];
   @ObfuscatedName("by")
   boolean isBoundsCalculated = false;
   @ObfuscatedName("yb")
   public float[] field3100;
   @ObfuscatedName("bw")
   int field3130;
   @ObfuscatedName("bf")
   int field3127;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3125 = -3;
   @ObfuscatedName("bd")
   int field3126;
   @ObfuscatedName("bp")
   int[] vertexSkins;

   public short[] getFaceColors() {
      return this.texTriangleY;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("ux")
   public static void method6051(ModelData var0) {
      if (var0 == null) {
         var0.method6112();
      }

      if (var0.vertexSkins != null) {
         int[] var1 = new int[256];
         int var2 = 0;

         for (int var3 = 0; var3 < var0.verticesCount; var3++) {
            int var4 = var0.vertexSkins[var3];
            var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         var0.vertexLabels = new int[var2 + 1][];

         for (int var7 = 0; var7 <= var2; var7++) {
            var0.vertexLabels[var7] = new int[var1[var7]];
            var1[var7] = 0;
         }

         int var8 = 0;

         while (var8 < var0.verticesCount) {
            int var12 = var0.vertexSkins[var8];
            var0.vertexLabels[var12][var1[var12]++] = var8++;
         }

         var0.vertexSkins = null;
      }

      if (var0.faceSkins != null) {
         int[] var5 = new int[256];
         int var6 = 0;

         for (int var9 = 0; var9 < var0.faceCount; var9++) {
            int var13 = var0.faceSkins[var9];
            var5[var13]++;
            if (var13 > var6) {
               var6 = var13;
            }
         }

         var0.faceLabelsAlpha = new int[var6 + 1][];

         for (int var10 = 0; var10 <= var6; var10++) {
            var0.faceLabelsAlpha[var10] = new int[var5[var10]];
            var5[var10] = 0;
         }

         int var11 = 0;

         while (var11 < var0.faceCount) {
            int var14 = var0.faceSkins[var11];
            var0.faceLabelsAlpha[var14][var5[var14]++] = var11++;
         }

         var0.faceSkins = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;[B)V")
   @ObfuscatedName("nb")
   public static void method6035(ModelData var0, byte[] var1) {
      if (var0 == null) {
         var0.method6131();
      }

      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * 2021466426;
      int var9 = Buffer.method12008(var2, (byte)5);
      int var10 = Buffer.method12008(var2, (byte)5);
      int var11 = var2.readUnsignedByte(1836566786);
      int var12 = var2.readUnsignedByte(-627728121);
      int var13 = var2.readUnsignedByte(-1186188833);
      int var14 = var2.readUnsignedByte(-69717519);
      int var15 = var2.readUnsignedByte(343001640);
      int var16 = var2.readUnsignedByte(-565081418);
      int var17 = var2.readUnsignedByte(1523511872);
      int var18 = Buffer.method12008(var2, (byte)5);
      int var19 = Buffer.method12008(var2, (byte)5);
      int var20 = Buffer.method12008(var2, (byte)5);
      int var21 = Buffer.method12008(var2, (byte)5);
      int var22 = Buffer.method12008(var2, (byte)5);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         var0.textureRenderTypes = new byte[var11];
         var2.offset = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = var0.textureRenderTypes[var26] = Buffer.method12001(var2, (byte)63);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var58 = var11 + var9;
      int var28 = var58;
      if (var12 == 1) {
         var58 += var10;
      }

      var58 += var10;
      int var30 = var58;
      if (var13 == 255) {
         var58 += var10;
      }

      int var31 = var58;
      if (var15 == 1) {
         var58 += var10;
      }

      int var32 = var58;
      if (var17 == 1) {
         var58 += var9;
      }

      int var33 = var58;
      if (var14 == 1) {
         var58 += var10;
      }

      var58 += var21;
      int var35 = var58;
      if (var16 == 1) {
         var58 += var10 * 2;
      }

      var58 += var22;
      var58 += var10 * 2;
      var58 += var18;
      var58 += var19;
      var58 += var20;
      var58 += var23 * 6;
      var58 += var24 * 6;
      var58 += var24 * 6;
      var58 += var24 * 2;
      var58 += var24;
      var58 += var24 * 2 + var25 * 2;
      var0.verticesCount = var9;
      var0.faceCount = var10;
      var0.textureTriangleCount = var11;
      var0.field3096 = new float[var9];
      var0.field3100 = new float[var9];
      var0.field3101 = new float[var9];
      var0.indices1 = new int[var10];
      var0.indices2 = new int[var10];
      var0.indices3 = new int[var10];
      if (var17 == 1) {
         var0.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         var0.faceRenderTypes = new byte[var10];
      }

      if (var13 == 255) {
         var0.faceRenderPriorities = new byte[var10];
      } else {
         var0.priority = (byte)var13;
      }

      if (var14 == 1) {
         var0.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         var0.faceSkins = new int[var10];
      }

      if (var16 == 1) {
         var0.texTriangleZ = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         var0.textureCoords = new byte[var10];
      }

      var0.texTriangleY = new short[var10];
      if (var11 > 0) {
         var0.faceColors = new short[var11];
         var0.faceTextures = new short[var11];
         var0.texTriangleX = new short[var11];
      }

      var2.offset = var11 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 603164308;
      var6.offset = var32 * 1741769013;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      for (int var51 = 0; var51 < var9; var51++) {
         int var52 = var2.readUnsignedByte(-1180030620);
         int var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.readShortSmart(-934249600);
         }

         int var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.readShortSmart(-544056205);
         }

         int var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.readShortSmart(-201239569);
         }

         var0.field3096[var51] = var48 + var53;
         var0.field3100[var51] = var49 + var54;
         var0.field3101[var51] = var50 + var55;
         var48 = (int)var0.field3096[var51];
         var49 = (int)var0.field3100[var51];
         var50 = (int)var0.field3101[var51];
         if (var17 == 1) {
            var0.vertexSkins[var51] = var6.readUnsignedByte(1232350050);
         }
      }

      var2.offset = var58 * 1381483082;
      var3.offset = var28 * -1011180326;
      var4.offset = var30 * -1717652533;
      var5.offset = var33 * -1123244798;
      var6.offset = var31 * 1707333018;
      var7.offset = var35 * -102562699;
      var8.offset = var58 * 1741769013;

      for (int var72 = 0; var72 < var10; var72++) {
         var0.texTriangleY[var72] = (short)Buffer.method12008(var2, (byte)5);
         if (var12 == 1) {
            var0.faceRenderTypes[var72] = Buffer.method12001(var3, (byte)84);
         }

         if (var13 == 255) {
            var0.faceRenderPriorities[var72] = Buffer.method12001(var4, (byte)101);
         }

         if (var14 == 1) {
            var0.faceAlphas[var72] = Buffer.method12001(var5, (byte)63);
         }

         if (var15 == 1) {
            var0.faceSkins[var72] = var6.readUnsignedByte(-189441936);
         }

         if (var16 == 1) {
            var0.texTriangleZ[var72] = (short)(Buffer.method12008(var7, (byte)5) - 1);
         }

         if (var0.textureCoords != null && var0.texTriangleZ[var72] != -1) {
            var0.textureCoords[var72] = (byte)(var8.readUnsignedByte(-34206252) - 1);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * -1488137457;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;

      for (int var77 = 0; var77 < var10; var77++) {
         int var56 = var3.readUnsignedByte(726585430);
         if (var56 == 1) {
            var73 = var2.readShortSmart(504118820) + var76;
            var74 = var2.readShortSmart(599328911) + var73;
            var75 = var2.readShortSmart(1161217621) + var74;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 2) {
            var74 = var75;
            var75 = var2.readShortSmart(1275291828) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 3) {
            var73 = var75;
            var75 = var2.readShortSmart(-1970720177) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 4) {
            int var57 = var73;
            var73 = var74;
            var74 = var57;
            var75 = var2.readShortSmart(61041858) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var57;
            var0.indices3[var77] = var75;
         }
      }

      var2.offset = var58 * -1657493756;
      var3.offset = var58 * -545357090;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * -1316408207;
      var6.offset = var58 * -1246918146;
      var7.offset = var58 * -318287711;

      for (int var78 = 0; var78 < var11; var78++) {
         int var80 = var0.textureRenderTypes[var78] & 255;
         if (var80 == 0) {
            var0.faceColors[var78] = (short)Buffer.method12008(var2, (byte)5);
            var0.faceTextures[var78] = (short)Buffer.method12008(var2, (byte)5);
            var0.texTriangleX[var78] = (short)Buffer.method12008(var2, (byte)5);
         }
      }

      var2.offset = var58 * -650680774;
      int var79 = var2.readUnsignedByte(-1004925335);
      if (var79 != 0) {
         new ModelData0();
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12015(var2, 1410502571);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Lky;")
   @ObfuscatedName("wf")
   public Model method6119(int var1, int var2, int var3, int var4, int var5) {
      return method6106(this, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("lr")
   public static void method6052(ModelData var0) {
      if (var0 == null) {
         var0.invalidate();
      } else {
         if (var0.vertexSkins != null) {
            int[] var1 = new int[256];
            int var2 = 0;

            for (int var3 = 0; var3 < var0.verticesCount; var3++) {
               int var4 = var0.vertexSkins[var3];
               var1[var4]++;
               if (var4 > var2) {
                  var2 = var4;
               }
            }

            var0.vertexLabels = new int[var2 + 1][];

            for (int var7 = 0; var7 <= var2; var7++) {
               var0.vertexLabels[var7] = new int[var1[var7]];
               var1[var7] = 0;
            }

            int var8 = 0;

            while (var8 < var0.verticesCount) {
               int var12 = var0.vertexSkins[var8];
               var0.vertexLabels[var12][var1[var12]++] = var8++;
            }

            var0.vertexSkins = null;
         }

         if (var0.faceSkins != null) {
            int[] var5 = new int[256];
            int var6 = 0;

            for (int var9 = 0; var9 < var0.faceCount; var9++) {
               int var13 = var0.faceSkins[var9];
               var5[var13]++;
               if (var13 > var6) {
                  var6 = var13;
               }
            }

            var0.faceLabelsAlpha = new int[var6 + 1][];

            for (int var10 = 0; var10 <= var6; var10++) {
               var0.faceLabelsAlpha[var10] = new int[var5[var10]];
               var5[var10] = 0;
            }

            int var11 = 0;

            while (var11 < var0.faceCount) {
               int var14 = var0.faceSkins[var11];
               var0.faceLabelsAlpha[var14][var5[var14]++] = var11++;
            }

            var0.faceSkins = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("by")
   public short[] method6120() {
      return this.faceColors;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Ljm;")
   @ObfuscatedName("bu")
   public static ModelData method6018(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, 642851426);
      return var3 == null ? null : new ModelData(var3);
   }

   ModelData(byte[] var1) {
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         method6029(this, var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         method6033(this, var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method6036(var1);
      } else {
         this.method6041(var1);
      }
   }

   public int[] getFaceIndices1() {
      return this.indices1;
   }

   public ModelData(ModelData[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      this.verticesCount = 0;
      this.faceCount = 0;
      this.textureTriangleCount = 0;
      this.priority = -1;

      for (int var11 = 0; var11 < var2; var11++) {
         ModelData var12 = var1[var11];
         if (var12 != null) {
            this.verticesCount = this.verticesCount + var12.verticesCount;
            this.faceCount = this.faceCount + var12.faceCount;
            this.textureTriangleCount = this.textureTriangleCount + var12.textureTriangleCount;
            if (var12.faceRenderPriorities != null) {
               var4 = true;
            } else {
               if (this.priority == -1) {
                  this.priority = var12.priority;
               }

               if (this.priority != var12.priority) {
                  var4 = true;
               }
            }

            var3 |= var12.faceRenderTypes != null;
            var5 |= var12.faceAlphas != null;
            var6 |= var12.faceSkins != null;
            var7 |= var12.texTriangleZ != null;
            var8 |= var12.textureCoords != null;
            var9 |= var12.field3095 != null;
            var10 |= var12.field3089 != null;
         }
      }

      this.field3096 = new float[this.verticesCount];
      this.field3100 = new float[this.verticesCount];
      this.field3101 = new float[this.verticesCount];
      this.vertexSkins = new int[this.verticesCount];
      this.indices1 = new int[this.faceCount];
      this.indices2 = new int[this.faceCount];
      this.indices3 = new int[this.faceCount];
      if (var3) {
         this.faceRenderTypes = new byte[this.faceCount];
      }

      if (var4) {
         this.faceRenderPriorities = new byte[this.faceCount];
      }

      if (var5) {
         this.faceAlphas = new byte[this.faceCount];
      }

      if (var6) {
         this.faceSkins = new int[this.faceCount];
      }

      if (var7) {
         this.texTriangleZ = new short[this.faceCount];
      }

      if (var8) {
         this.textureCoords = new byte[this.faceCount];
      }

      if (var9) {
         this.field3095 = new int[this.verticesCount][];
         this.field3105 = new int[this.verticesCount][];
      }

      if (var10) {
         this.field3089 = new byte[this.faceCount];
      }

      this.texTriangleY = new short[this.faceCount];
      if (this.textureTriangleCount > 0) {
         this.textureRenderTypes = new byte[this.textureTriangleCount];
         this.faceColors = new short[this.textureTriangleCount];
         this.faceTextures = new short[this.textureTriangleCount];
         this.texTriangleX = new short[this.textureTriangleCount];
      }

      this.verticesCount = 0;
      this.faceCount = 0;
      this.textureTriangleCount = 0;

      for (int var15 = 0; var15 < var2; var15++) {
         ModelData var16 = var1[var15];
         if (var16 != null) {
            for (int var13 = 0; var13 < var16.faceCount; var13++) {
               if (var3 && var16.faceRenderTypes != null) {
                  this.faceRenderTypes[this.faceCount] = var16.faceRenderTypes[var13];
               }

               if (var4) {
                  if (var16.faceRenderPriorities != null) {
                     this.faceRenderPriorities[this.faceCount] = var16.faceRenderPriorities[var13];
                  } else {
                     this.faceRenderPriorities[this.faceCount] = var16.priority;
                  }
               }

               if (var5 && var16.faceAlphas != null) {
                  this.faceAlphas[this.faceCount] = var16.faceAlphas[var13];
               }

               if (var6 && var16.faceSkins != null) {
                  this.faceSkins[this.faceCount] = var16.faceSkins[var13];
               }

               if (var7) {
                  if (var16.texTriangleZ != null) {
                     this.texTriangleZ[this.faceCount] = var16.texTriangleZ[var13];
                  } else {
                     this.texTriangleZ[this.faceCount] = -1;
                  }
               }

               if (var8) {
                  if (var16.textureCoords != null && var16.textureCoords[var13] != -1) {
                     this.textureCoords[this.faceCount] = (byte)(var16.textureCoords[var13] + this.textureTriangleCount);
                  } else {
                     this.textureCoords[this.faceCount] = -1;
                  }
               }

               if (var10 && var16.field3089 != null) {
                  this.field3089[this.faceCount] = var16.field3089[var13];
               }

               this.texTriangleY[this.faceCount] = var16.texTriangleY[var13];
               this.indices1[this.faceCount] = this.method6044(var16, var16.indices1[var13]);
               this.indices2[this.faceCount] = this.method6044(var16, var16.indices2[var13]);
               this.indices3[this.faceCount] = this.method6044(var16, var16.indices3[var13]);
               this.faceCount++;
            }

            for (int var17 = 0; var17 < var16.textureTriangleCount; var17++) {
               byte var14 = this.textureRenderTypes[this.textureTriangleCount] = var16.textureRenderTypes[var17];
               if (var14 == 0) {
                  this.faceColors[this.textureTriangleCount] = (short)this.method6044(var16, var16.faceColors[var17]);
                  this.faceTextures[this.textureTriangleCount] = (short)this.method6044(var16, var16.faceTextures[var17]);
                  this.texTriangleX[this.textureTriangleCount] = (short)this.method6044(var16, var16.texTriangleX[var17]);
               }

               this.textureTriangleCount++;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("dw")
   public void method6070(short var1, short var2) {
      if (this.texTriangleZ != null) {
         for (int var3 = 0; var3 < this.faceCount; var3++) {
            if (this.texTriangleZ[var3] == var1) {
               this.texTriangleZ[var3] = var2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;II)Ljm;")
   @ObfuscatedName("av")
   public static ModelData ModelData_get(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.loadData(var1, var2);

      try {
         return var3 == null ? null : new ModelData(var3);
      } catch (NullPointerException var5) {
         throw new RuntimeException("loading model " + var1 + ", " + var2, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("jr")
   public ModelData method6111() {
      this.texTriangleY = (short[])this.texTriangleY.clone();
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ljm;Ljm;IIIZ)V")
   @ObfuscatedName("at")
   static void method6020(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      method6092(var0);
      var0.calculateVertexNormals();
      method6092(var1);
      var1.calculateVertexNormals();
      field3119++;
      int var6 = 0;
      float[] var7 = var1.field3096;
      int var8 = var1.verticesCount;

      for (int var9 = 0; var9 < var0.verticesCount; var9++) {
         VertexNormal var10 = var0.vertexNormals[var9];
         if (var10.magnitude * 802759063 != 0) {
            int var11 = (int)var0.field3100[var9] - var3;
            if (var11 <= var1.field3130) {
               int var12 = (int)var0.field3096[var9] - var2;
               if (var12 >= var1.field3127 && var12 <= var1.field3128) {
                  int var13 = (int)var0.field3101[var9] - var4;
                  if (var13 >= var1.field3129 && var13 <= var1.field3126) {
                     for (int var14 = 0; var14 < var8; var14++) {
                        VertexNormal var15 = var1.vertexNormals[var14];
                        if (var12 == (int)var7[var14]
                           && var13 == (int)var1.field3101[var14]
                           && var11 == (int)var1.field3100[var14]
                           && var15.magnitude * 802759063 != 0) {
                           if (var0.vertexVertices == null) {
                              var0.vertexVertices = new VertexNormal[var0.verticesCount];
                           }

                           if (var1.vertexVertices == null) {
                              var1.vertexVertices = new VertexNormal[var8];
                           }

                           VertexNormal var16 = var0.vertexVertices[var9];
                           if (var16 == null) {
                              var16 = var0.vertexVertices[var9] = new VertexNormal(var10);
                           }

                           VertexNormal var17 = var1.vertexVertices[var14];
                           if (var17 == null) {
                              var17 = var1.vertexVertices[var14] = new VertexNormal(var15);
                           }

                           var16.x = var16.x + var15.x * 1;
                           var16.y = var16.y + var15.y * 1;
                           var16.z = var16.z + var15.z * 1;
                           var16.magnitude = var16.magnitude + var15.magnitude * 1;
                           var17.x = var17.x + var10.x * 1;
                           var17.y = var17.y + var10.y * 1;
                           var17.z = var17.z + var10.z * 1;
                           var17.magnitude = var17.magnitude + var10.magnitude * 1;
                           var6++;
                           field3118[var9] = field3119;
                           field3121[var14] = field3119;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for (int var18 = 0; var18 < var0.faceCount; var18++) {
            if (field3118[var0.indices1[var18]] == field3119 && field3118[var0.indices2[var18]] == field3119 && field3118[var0.indices3[var18]] == field3119) {
               if (var0.faceRenderTypes == null) {
                  var0.faceRenderTypes = new byte[var0.faceCount];
               }

               var0.faceRenderTypes[var18] = 2;
            }
         }

         for (int var19 = 0; var19 < var1.faceCount; var19++) {
            if (field3121[var1.indices1[var19]] == field3119 && field3121[var1.indices2[var19]] == field3119 && field3121[var1.indices3[var19]] == field3119) {
               if (var1.faceRenderTypes == null) {
                  var1.faceRenderTypes = new byte[var1.faceCount];
               }

               var1.faceRenderTypes[var19] = 2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   static final int method6023(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   static final int method6026(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   public void method6056() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3096[var1] = -((int)this.field3096[var1]);
         this.field3101[var1] = -((int)this.field3101[var1]);
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "(III)Ljm;")
   @ObfuscatedName("qt")
   public ModelData method6121(int var1, int var2, int var3) {
      method6104(this, var1, var2, var3);
      return this;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ax")
   void method6041(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 18) * 1741769013;
      int var9 = Buffer.method12008(var4, (byte)5);
      int var10 = Buffer.method12008(var4, (byte)5);
      int var11 = var4.readUnsignedByte(1737698413);
      int var12 = var4.readUnsignedByte(1749045878);
      int var13 = var4.readUnsignedByte(1703628613);
      int var14 = var4.readUnsignedByte(341042615);
      int var15 = var4.readUnsignedByte(-359248577);
      int var16 = var4.readUnsignedByte(1200615260);
      int var17 = Buffer.method12008(var4, (byte)5);
      int var18 = Buffer.method12008(var4, (byte)5);
      int var19 = Buffer.method12008(var4, (byte)5);
      int var20 = Buffer.method12008(var4, (byte)5);
      int var21 = 0;
      var21 += var9;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      var21 += var20;
      var21 += var10 * 2;
      var21 += var11 * 6;
      var21 += var17;
      var21 += var18;
      var21 += var19;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      if (var16 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
         this.textureCoords = new byte[var10];
         this.texTriangleZ = new short[var10];
      }

      if (var13 == 255) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      this.texTriangleY = new short[var10];
      var4.offset = var21 * 1741769013;
      var5.offset = var21 * 1741769013;
      var6.offset = var21 * 1741769013;
      var7.offset = var21 * 1741769013;
      var8.offset = var27 * 1741769013;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      for (int var38 = 0; var38 < var9; var38++) {
         int var39 = var4.readUnsignedByte(-1635475072);
         int var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.readShortSmart(-353241017);
         }

         int var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.readShortSmart(-1155646582);
         }

         int var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.readShortSmart(-73764618);
         }

         this.field3096[var38] = var35 + var40;
         this.field3100[var38] = var36 + var41;
         this.field3101[var38] = var37 + var42;
         var35 = (int)this.field3096[var38];
         var36 = (int)this.field3100[var38];
         var37 = (int)this.field3101[var38];
         if (var16 == 1) {
            this.vertexSkins[var38] = var8.readUnsignedByte(-1066386562);
         }
      }

      var4.offset = var21 * 1741769013;
      var5.offset = var26 * 1741769013;
      var6.offset = var24 * 1741769013;
      var7.offset = var28 * 1741769013;
      var8.offset = var25 * 1741769013;

      for (int var53 = 0; var53 < var10; var53++) {
         this.texTriangleY[var53] = (short)Buffer.method12008(var4, (byte)5);
         if (var12 == 1) {
            int var55 = var5.readUnsignedByte(1044160819);
            if ((var55 & 1) == 1) {
               this.faceRenderTypes[var53] = 1;
               var2 = true;
            } else {
               this.faceRenderTypes[var53] = 0;
            }

            if ((var55 & 2) == 2) {
               this.textureCoords[var53] = (byte)(var55 >> 2);
               this.texTriangleZ[var53] = this.texTriangleY[var53];
               this.texTriangleY[var53] = 127;
               if (this.texTriangleZ[var53] != -1) {
                  var3 = true;
               }
            } else {
               this.textureCoords[var53] = -1;
               this.texTriangleZ[var53] = -1;
            }
         }

         if (var13 == 255) {
            this.faceRenderPriorities[var53] = Buffer.method12001(var6, (byte)112);
         }

         if (var14 == 1) {
            this.faceAlphas[var53] = Buffer.method12001(var7, (byte)127);
         }

         if (var15 == 1) {
            this.faceSkins[var53] = var8.readUnsignedByte(-978985579);
         }
      }

      var4.offset = var21 * 1741769013;
      var5.offset = var21 * 1741769013;
      int var54 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;

      for (int var59 = 0; var59 < var10; var59++) {
         int var43 = var5.readUnsignedByte(-932663891);
         if (var43 == 1) {
            var54 = var4.readShortSmart(-1788076036) + var58;
            var56 = var4.readShortSmart(-606597293) + var54;
            var57 = var4.readShortSmart(-773672738) + var56;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 2) {
            var56 = var57;
            var57 = var4.readShortSmart(1730361994) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 3) {
            var54 = var57;
            var57 = var4.readShortSmart(297917919) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 4) {
            int var44 = var54;
            var54 = var56;
            var56 = var44;
            var57 = var4.readShortSmart(467138763) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var44;
            this.indices3[var59] = var57;
         }
      }

      var4.offset = var21 * 1741769013;

      for (int var60 = 0; var60 < var11; var60++) {
         this.textureRenderTypes[var60] = 0;
         this.faceColors[var60] = (short)Buffer.method12008(var4, (byte)5);
         this.faceTextures[var60] = (short)Buffer.method12008(var4, (byte)5);
         this.texTriangleX[var60] = (short)Buffer.method12008(var4, (byte)5);
      }

      if (this.textureCoords != null) {
         boolean var61 = false;

         for (int var62 = 0; var62 < var10; var62++) {
            int var63 = this.textureCoords[var62] & 255;
            if (var63 != 255) {
               if ((this.faceColors[var63] & '\uffff') == this.indices1[var62]
                  && (this.faceTextures[var63] & '\uffff') == this.indices2[var62]
                  && (this.texTriangleX[var63] & '\uffff') == this.indices3[var62]) {
                  this.textureCoords[var62] = -1;
               } else {
                  var61 = true;
               }
            }
         }

         if (!var61) {
            this.textureCoords = null;
         }
      }

      if (!var3) {
         this.texTriangleZ = null;
      }

      if (!var2) {
         this.faceRenderTypes = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;I)I")
   @ObfuscatedName("ar")
   final int method6044(ModelData var1, int var2) {
      int var3 = -1;
      int var4 = (int)var1.field3096[var2];
      int var5 = (int)var1.field3100[var2];
      int var6 = (int)var1.field3101[var2];

      for (int var7 = 0; var7 < this.verticesCount; var7++) {
         if (var4 == (int)this.field3096[var7] && var5 == (int)this.field3100[var7] && var6 == (int)this.field3101[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field3096[this.verticesCount] = var4;
         this.field3100[this.verticesCount] = var5;
         this.field3101[this.verticesCount] = var6;
         if (var1.vertexSkins != null) {
            this.vertexSkins[this.verticesCount] = var1.vertexSkins[var2];
         }

         if (var1.field3095 != null) {
            this.field3095[this.verticesCount] = var1.field3095[var2];
            this.field3105[this.verticesCount] = var1.field3105[var2];
         }

         var3 = this.verticesCount++;
      }

      return var3;
   }

   public float[] getVerticesY() {
      return this.field3100;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("cj")
   public void method6065(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         this.field3096[var4] = (int)this.field3096[var4] + var1;
         this.field3100[var4] = (int)this.field3100[var4] + var2;
         this.field3101[var4] = (int)this.field3101[var4] + var3;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("bg")
   public void recolor(short var1, short var2) {
      for (int var3 = 0; var3 < this.faceCount; var3++) {
         if (this.texTriangleY[var3] == var1) {
            this.texTriangleY[var3] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public void method6107() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         float var2 = this.field3096[var1];
         this.field3096[var1] = this.field3101[var1];
         this.field3101[var1] = -var2;
      }

      this.method6130();
   }

   public int[] getFaceIndices3() {
      return this.indices3;
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("kq")
   public short[] method6122() {
      return this.texTriangleX;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public void method6103() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3096[var1] = -this.field3096[var1];
         this.field3101[var1] = -this.field3101[var1];
      }

      this.method6130();
   }

   public int getVerticesCount() {
      return this.verticesCount;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method6112() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         float var2 = this.field3101[var1];
         this.field3101[var1] = this.field3096[var1];
         this.field3096[var1] = -var2;
      }

      this.method6130();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("be")
   public void method6061(int var1) {
      int var2 = ModelData_sine[var1];
      int var3 = ModelData_cosine[var1];

      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         int var5 = (int)this.field3101[var4] * var2 + (int)this.field3096[var4] * var3 >> 16;
         this.field3101[var4] = (int)this.field3101[var4] * var3 - (int)this.field3096[var4] * var2 >> 16;
         this.field3096[var4] = var5;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public void calculateVertexNormals() {
      if (this.vertexNormals == null) {
         this.vertexNormals = new VertexNormal[this.verticesCount];

         for (int var1 = 0; var1 < this.verticesCount; var1++) {
            this.vertexNormals[var1] = new VertexNormal();
         }

         for (int var17 = 0; var17 < this.faceCount; var17++) {
            int var2 = this.indices1[var17];
            int var3 = this.indices2[var17];
            int var4 = this.indices3[var17];
            int var5 = (int)this.field3096[var3] - (int)this.field3096[var2];
            int var6 = (int)this.field3100[var3] - (int)this.field3100[var2];
            int var7 = (int)this.field3101[var3] - (int)this.field3101[var2];
            int var8 = (int)this.field3096[var4] - (int)this.field3096[var2];
            int var9 = (int)this.field3100[var4] - (int)this.field3100[var2];
            int var10 = (int)this.field3101[var4] - (int)this.field3101[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.faceRenderTypes == null) {
               var15 = 0;
            } else {
               var15 = this.faceRenderTypes[var17];
            }

            if (var15 == 0) {
               VertexNormal var16 = this.vertexNormals[var2];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var3];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var4];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
            } else if (var15 == 1) {
               if (this.faceNormals == null) {
                  this.faceNormals = new FaceNormal[this.faceCount];
               }

               FaceNormal var23 = this.faceNormals[var17] = new FaceNormal();
               var23.x = var11 * 999846063;
               var23.y = var12 * 1104023811;
               var23.z = var13 * -1994033;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   public void method6074() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3101[var1] = -((int)this.field3101[var1]);
      }

      for (int var3 = 0; var3 < this.faceCount; var3++) {
         int var2 = this.indices1[var3];
         this.indices1[var3] = this.indices3[var3];
         this.indices3[var3] = var2;
      }

      this.method6087();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("oz")
   public static void method6053(ModelData var0) {
      if (var0 == null) {
         var0.getFaceCount();
      }

      for (int var1 = 0; var1 < var0.verticesCount; var1++) {
         int var2 = (int)var0.field3096[var1];
         var0.field3096[var1] = var0.field3101[var1];
         var0.field3101[var1] = -var2;
      }

      var0.method6087();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cr")
   public void method6062(int var1) {
      int var2 = ModelData_sine[var1];
      int var3 = ModelData_cosine[var1];

      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         int var5 = (int)this.field3101[var4] * var2 + (int)this.field3096[var4] * var3 >> 16;
         this.field3101[var4] = (int)this.field3101[var4] * var3 - (int)this.field3096[var4] * var2 >> 16;
         this.field3096[var4] = var5;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ct")
   void method6042(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 18) * 2112894032;
      int var9 = Buffer.method12008(var4, (byte)5);
      int var10 = Buffer.method12008(var4, (byte)5);
      int var11 = var4.readUnsignedByte(-619031750);
      int var12 = var4.readUnsignedByte(1021685858);
      int var13 = var4.readUnsignedByte(1303531648);
      int var14 = var4.readUnsignedByte(1690968048);
      int var15 = var4.readUnsignedByte(-577647580);
      int var16 = var4.readUnsignedByte(-1523339942);
      int var17 = Buffer.method12008(var4, (byte)5);
      int var18 = Buffer.method12008(var4, (byte)5);
      int var19 = Buffer.method12008(var4, (byte)5);
      int var20 = Buffer.method12008(var4, (byte)5);
      int var21 = 0;
      var21 += var9;
      var21 += var10;
      int var24 = var21;
      if (var13 == -1555033739) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      var21 += var20;
      var21 += var10 * 2;
      var21 += var11 * 6;
      var21 += var17;
      var21 += var18;
      var21 += var19;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      if (var16 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
         this.textureCoords = new byte[var10];
         this.texTriangleZ = new short[var10];
      }

      if (var13 == 574032282) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      this.texTriangleY = new short[var10];
      var4.offset = var21 * 1741769013;
      var5.offset = var21 * 2131617567;
      var6.offset = var21 * 1741769013;
      var7.offset = var21 * -1233593280;
      var8.offset = var27 * 1741769013;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      for (int var38 = 0; var38 < var9; var38++) {
         int var39 = var4.readUnsignedByte(-13455916);
         int var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.readShortSmart(1078680979);
         }

         int var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.readShortSmart(-993841001);
         }

         int var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.readShortSmart(-731515130);
         }

         this.field3096[var38] = var35 + var40;
         this.field3100[var38] = var36 + var41;
         this.field3101[var38] = var37 + var42;
         var35 = (int)this.field3096[var38];
         var36 = (int)this.field3100[var38];
         var37 = (int)this.field3101[var38];
         if (var16 == 1) {
            this.vertexSkins[var38] = var8.readUnsignedByte(-1707880518);
         }
      }

      var4.offset = var21 * 1688994448;
      var5.offset = var26 * 2123090417;
      var6.offset = var24 * 1741769013;
      var7.offset = var28 * -1170369926;
      var8.offset = var25 * 1789806960;

      for (int var53 = 0; var53 < var10; var53++) {
         this.texTriangleY[var53] = (short)Buffer.method12008(var4, (byte)5);
         if (var12 == 1) {
            int var55 = var5.readUnsignedByte(2093843926);
            if ((var55 & 1) == 1) {
               this.faceRenderTypes[var53] = 1;
               var2 = true;
            } else {
               this.faceRenderTypes[var53] = 0;
            }

            if ((var55 & 2) == 2) {
               this.textureCoords[var53] = (byte)(var55 >> 2);
               this.texTriangleZ[var53] = this.texTriangleY[var53];
               this.texTriangleY[var53] = 127;
               if (this.texTriangleZ[var53] != -1) {
                  var3 = true;
               }
            } else {
               this.textureCoords[var53] = -1;
               this.texTriangleZ[var53] = -1;
            }
         }

         if (var13 == 255) {
            this.faceRenderPriorities[var53] = Buffer.method12001(var6, (byte)19);
         }

         if (var14 == 1) {
            this.faceAlphas[var53] = Buffer.method12001(var7, (byte)116);
         }

         if (var15 == 1) {
            this.faceSkins[var53] = var8.readUnsignedByte(-77152843);
         }
      }

      var4.offset = var21 * -1457595875;
      var5.offset = var21 * 23175420;
      int var54 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;

      for (int var59 = 0; var59 < var10; var59++) {
         int var43 = var5.readUnsignedByte(-701998353);
         if (var43 == 1) {
            var54 = var4.readShortSmart(-1229972839) + var58;
            var56 = var4.readShortSmart(-1707740520) + var54;
            var57 = var4.readShortSmart(-957749499) + var56;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 2) {
            var56 = var57;
            var57 = var4.readShortSmart(984636511) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 3) {
            var54 = var57;
            var57 = var4.readShortSmart(1999721143) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 4) {
            int var44 = var54;
            var54 = var56;
            var56 = var44;
            var57 = var4.readShortSmart(-193383521) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var44;
            this.indices3[var59] = var57;
         }
      }

      var4.offset = var21 * 1741769013;

      for (int var60 = 0; var60 < var11; var60++) {
         this.textureRenderTypes[var60] = 0;
         this.faceColors[var60] = (short)Buffer.method12008(var4, (byte)5);
         this.faceTextures[var60] = (short)Buffer.method12008(var4, (byte)5);
         this.texTriangleX[var60] = (short)Buffer.method12008(var4, (byte)5);
      }

      if (this.textureCoords != null) {
         boolean var61 = false;

         for (int var62 = 0; var62 < var10; var62++) {
            int var63 = this.textureCoords[var62] & 255;
            if (var63 != 255) {
               if ((this.faceColors[var63] & '\uffff') == this.indices1[var62]
                  && (this.faceTextures[var63] & '\uffff') == this.indices2[var62]
                  && (this.texTriangleX[var63] & '\uffff') == this.indices3[var62]) {
                  this.textureCoords[var62] = -1;
               } else {
                  var61 = true;
               }
            }
         }

         if (!var61) {
            this.textureCoords = null;
         }
      }

      if (!var3) {
         this.texTriangleZ = null;
      }

      if (!var2) {
         this.faceRenderTypes = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   void method6087() {
      this.vertexNormals = null;
      this.vertexVertices = null;
      this.faceNormals = null;
      this.isBoundsCalculated = false;
   }

   public float[] getVerticesZ() {
      return this.field3101;
   }

   @ObfuscatedSignature(descriptor = "(Z)Ljm;")
   @ObfuscatedName("gs")
   public ModelData method6115(boolean var1) {
      if (this.faceAlphas != null) {
         this.faceAlphas = (byte[])this.faceAlphas.clone();
      } else if (var1) {
         this.faceAlphas = new byte[this.getFaceCount()];
      }

      return this;
   }

   ModelData() {
   }

   @ObfuscatedSignature(descriptor = "(Ljm;SS)V")
   @ObfuscatedName("od")
   public static void method6071(ModelData var0, short var1, short var2) {
      if (var0 == null) {
         var0.retexture(var1, var1);
      }

      if (var0.texTriangleZ != null) {
         for (int var3 = 0; var3 < var0.faceCount; var3++) {
            if (var0.texTriangleZ[var3] == var1) {
               var0.texTriangleZ[var3] = var2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("bt")
   public final Model method6097() {
      return method6106(this, 128, 43690, 0, -1, 0);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ab")
   void method6036(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * 1741769013;
      int var9 = Buffer.method12008(var2, (byte)5);
      int var10 = Buffer.method12008(var2, (byte)5);
      int var11 = var2.readUnsignedByte(-843992789);
      int var12 = var2.readUnsignedByte(-920022932);
      int var13 = var2.readUnsignedByte(-383233926);
      int var14 = var2.readUnsignedByte(-960961954);
      int var15 = var2.readUnsignedByte(1488540362);
      int var16 = var2.readUnsignedByte(167633126);
      int var17 = var2.readUnsignedByte(-862853157);
      int var18 = Buffer.method12008(var2, (byte)5);
      int var19 = Buffer.method12008(var2, (byte)5);
      int var20 = Buffer.method12008(var2, (byte)5);
      int var21 = Buffer.method12008(var2, (byte)5);
      int var22 = Buffer.method12008(var2, (byte)5);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         var2.offset = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = this.textureRenderTypes[var26] = Buffer.method12001(var2, (byte)42);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var58 = var11 + var9;
      int var28 = var58;
      if (var12 == 1) {
         var58 += var10;
      }

      var58 += var10;
      int var30 = var58;
      if (var13 == 255) {
         var58 += var10;
      }

      int var31 = var58;
      if (var15 == 1) {
         var58 += var10;
      }

      int var32 = var58;
      if (var17 == 1) {
         var58 += var9;
      }

      int var33 = var58;
      if (var14 == 1) {
         var58 += var10;
      }

      var58 += var21;
      int var35 = var58;
      if (var16 == 1) {
         var58 += var10 * 2;
      }

      var58 += var22;
      var58 += var10 * 2;
      var58 += var18;
      var58 += var19;
      var58 += var20;
      var58 += var23 * 6;
      var58 += var24 * 6;
      var58 += var24 * 6;
      var58 += var24 * 2;
      var58 += var24;
      var58 += var24 * 2 + var25 * 2;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var17 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
      }

      if (var13 == 255) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      if (var16 == 1) {
         this.texTriangleZ = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.textureCoords = new byte[var10];
      }

      this.texTriangleY = new short[var10];
      if (var11 > 0) {
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      var2.offset = var11 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 1741769013;
      var6.offset = var32 * 1741769013;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      for (int var51 = 0; var51 < var9; var51++) {
         int var52 = var2.readUnsignedByte(516768848);
         int var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.readShortSmart(-471727613);
         }

         int var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.readShortSmart(-947877406);
         }

         int var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.readShortSmart(2077974909);
         }

         this.field3096[var51] = var48 + var53;
         this.field3100[var51] = var49 + var54;
         this.field3101[var51] = var50 + var55;
         var48 = (int)this.field3096[var51];
         var49 = (int)this.field3100[var51];
         var50 = (int)this.field3101[var51];
         if (var17 == 1) {
            this.vertexSkins[var51] = var6.readUnsignedByte(-278203107);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var28 * 1741769013;
      var4.offset = var30 * 1741769013;
      var5.offset = var33 * 1741769013;
      var6.offset = var31 * 1741769013;
      var7.offset = var35 * 1741769013;
      var8.offset = var58 * 1741769013;

      for (int var72 = 0; var72 < var10; var72++) {
         this.texTriangleY[var72] = (short)Buffer.method12008(var2, (byte)5);
         if (var12 == 1) {
            this.faceRenderTypes[var72] = Buffer.method12001(var3, (byte)27);
         }

         if (var13 == 255) {
            this.faceRenderPriorities[var72] = Buffer.method12001(var4, (byte)6);
         }

         if (var14 == 1) {
            this.faceAlphas[var72] = Buffer.method12001(var5, (byte)67);
         }

         if (var15 == 1) {
            this.faceSkins[var72] = var6.readUnsignedByte(-203262847);
         }

         if (var16 == 1) {
            this.texTriangleZ[var72] = (short)(Buffer.method12008(var7, (byte)5) - 1);
         }

         if (this.textureCoords != null && this.texTriangleZ[var72] != -1) {
            this.textureCoords[var72] = (byte)(var8.readUnsignedByte(-1126420215) - 1);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * 1741769013;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;

      for (int var77 = 0; var77 < var10; var77++) {
         int var56 = var3.readUnsignedByte(-1264243564);
         if (var56 == 1) {
            var73 = var2.readShortSmart(-483387537) + var76;
            var74 = var2.readShortSmart(1068501818) + var73;
            var75 = var2.readShortSmart(-1323554784) + var74;
            var76 = var75;
            this.indices1[var77] = var73;
            this.indices2[var77] = var74;
            this.indices3[var77] = var75;
         }

         if (var56 == 2) {
            var74 = var75;
            var75 = var2.readShortSmart(1415658340) + var76;
            var76 = var75;
            this.indices1[var77] = var73;
            this.indices2[var77] = var74;
            this.indices3[var77] = var75;
         }

         if (var56 == 3) {
            var73 = var75;
            var75 = var2.readShortSmart(1896214168) + var76;
            var76 = var75;
            this.indices1[var77] = var73;
            this.indices2[var77] = var74;
            this.indices3[var77] = var75;
         }

         if (var56 == 4) {
            int var57 = var73;
            var73 = var74;
            var74 = var57;
            var75 = var2.readShortSmart(-746770559) + var76;
            var76 = var75;
            this.indices1[var77] = var73;
            this.indices2[var77] = var57;
            this.indices3[var77] = var75;
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 1741769013;
      var6.offset = var58 * 1741769013;
      var7.offset = var58 * 1741769013;

      for (int var78 = 0; var78 < var11; var78++) {
         int var80 = this.textureRenderTypes[var78] & 255;
         if (var80 == 0) {
            this.faceColors[var78] = (short)Buffer.method12008(var2, (byte)5);
            this.faceTextures[var78] = (short)Buffer.method12008(var2, (byte)5);
            this.texTriangleX[var78] = (short)Buffer.method12008(var2, (byte)5);
         }
      }

      var2.offset = var58 * 1741769013;
      int var79 = var2.readUnsignedByte(-335439572);
      if (var79 != 0) {
         new ModelData0();
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12015(var2, -586255312);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;II)Ljm;")
   @ObfuscatedName("ba")
   public static ModelData method6019(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, 1927386776);
      return var3 == null ? null : new ModelData(var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public void method6116() {
      VertexNormal[] var1 = this.method6131();
      VertexNormal[] var2 = this.method6134();
      if (var1 != null && this.field3135 == null) {
         int var3 = this.getVerticesCount();
         this.field3135 = new int[var3];
         this.field3136 = new int[var3];
         this.field3134 = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            VertexNormal var5;
            if (var2 != null && (var5 = var2[var4]) != null) {
               this.field3135[var4] = var5.method6321();
               this.field3136[var4] = var5.method6318();
               this.field3134[var4] = var5.method6320();
            } else if ((var5 = var1[var4]) != null) {
               this.field3135[var4] = var5.method6321();
               this.field3136[var4] = var5.method6318();
               this.field3134[var4] = var5.method6320();
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;Ljm;IIIZ)V")
   @ObfuscatedName("bi")
   static void method6021(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      method6092(var0);
      var0.calculateVertexNormals();
      method6092(var1);
      var1.calculateVertexNormals();
      field3119++;
      int var6 = 0;
      float[] var7 = var1.field3096;
      int var8 = var1.verticesCount;

      for (int var9 = 0; var9 < var0.verticesCount; var9++) {
         VertexNormal var10 = var0.vertexNormals[var9];
         if (var10.magnitude * 802759063 != 0) {
            int var11 = (int)var0.field3100[var9] - var3;
            if (var11 <= var1.field3130) {
               int var12 = (int)var0.field3096[var9] - var2;
               if (var12 >= var1.field3127 && var12 <= var1.field3128) {
                  int var13 = (int)var0.field3101[var9] - var4;
                  if (var13 >= var1.field3129 && var13 <= var1.field3126) {
                     for (int var14 = 0; var14 < var8; var14++) {
                        VertexNormal var15 = var1.vertexNormals[var14];
                        if (var12 == (int)var7[var14]
                           && var13 == (int)var1.field3101[var14]
                           && var11 == (int)var1.field3100[var14]
                           && var15.magnitude * 802759063 != 0) {
                           if (var0.vertexVertices == null) {
                              var0.vertexVertices = new VertexNormal[var0.verticesCount];
                           }

                           if (var1.vertexVertices == null) {
                              var1.vertexVertices = new VertexNormal[var8];
                           }

                           VertexNormal var16 = var0.vertexVertices[var9];
                           if (var16 == null) {
                              var16 = var0.vertexVertices[var9] = new VertexNormal(var10);
                           }

                           VertexNormal var17 = var1.vertexVertices[var14];
                           if (var17 == null) {
                              var17 = var1.vertexVertices[var14] = new VertexNormal(var15);
                           }

                           var16.x = var16.x + var15.x * 1;
                           var16.y = var16.y + var15.y * 1;
                           var16.z = var16.z + var15.z * 1;
                           var16.magnitude = var16.magnitude + var15.magnitude * 1;
                           var17.x = var17.x + var10.x * 1;
                           var17.y = var17.y + var10.y * 1;
                           var17.z = var17.z + var10.z * 1;
                           var17.magnitude = var17.magnitude + var10.magnitude * 1;
                           var6++;
                           field3118[var9] = field3119;
                           field3121[var14] = field3119;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for (int var18 = 0; var18 < var0.faceCount; var18++) {
            if (field3118[var0.indices1[var18]] == field3119 && field3118[var0.indices2[var18]] == field3119 && field3118[var0.indices3[var18]] == field3119) {
               if (var0.faceRenderTypes == null) {
                  var0.faceRenderTypes = new byte[var0.faceCount];
               }

               var0.faceRenderTypes[var18] = 2;
            }
         }

         for (int var19 = 0; var19 < var1.faceCount; var19++) {
            if (field3121[var1.indices1[var19]] == field3119 && field3121[var1.indices2[var19]] == field3119 && field3121[var1.indices3[var19]] == field3119) {
               if (var1.faceRenderTypes == null) {
                  var1.faceRenderTypes = new byte[var1.faceCount];
               }

               var1.faceRenderTypes[var19] = 2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwi;)V")
   @ObfuscatedName("ng")
   public static void method6017(DbRowType var0) {
      if (var0 == null) {
         var0.getTableID();
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("dv")
   public void method6072(short var1, short var2) {
      if (this.texTriangleZ != null) {
         for (int var3 = 0; var3 < this.faceCount; var3++) {
            if (this.texTriangleZ[var3] == var1) {
               this.texTriangleZ[var3] = var2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bw")
   static final int method6024(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("ma")
   public ModelData method6117() {
      return new ModelData(this, true, true, true, true);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dt")
   public void method6079(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         this.field3096[var4] = (int)this.field3096[var4] * var1 / -303777354;
         this.field3100[var4] = (int)this.field3100[var4] * var2 / -551716705;
         this.field3101[var4] = (int)this.field3101[var4] * var3 / 128;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "(III)Ljm;")
   @ObfuscatedName("ok")
   public ModelData method6123(int var1, int var2, int var3) {
      this.resize(var1, var2, var3);
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("wp")
   public static void method6092(ModelData var0) {
      if (var0 == null) {
         var0.calculateBounds();
      }

      if (!var0.isBoundsCalculated) {
         var0.height = 0;
         var0.field3130 = 0;
         var0.field3127 = 999999;
         var0.field3128 = -999999;
         var0.field3126 = -99999;
         var0.field3129 = 99999;

         for (int var1 = 0; var1 < var0.verticesCount; var1++) {
            int var2 = (int)var0.field3096[var1];
            int var3 = (int)var0.field3100[var1];
            int var4 = (int)var0.field3101[var1];
            if (var2 < var0.field3127) {
               var0.field3127 = var2;
            }

            if (var2 > var0.field3128) {
               var0.field3128 = var2;
            }

            if (var4 < var0.field3129) {
               var0.field3129 = var4;
            }

            if (var4 > var0.field3126) {
               var0.field3126 = var4;
            }

            if (-var3 > var0.height * -1272589951) {
               var0.height = -var3 * -689148287;
            }

            if (var3 > var0.field3130) {
               var0.field3130 = var3;
            }
         }

         var0.isBoundsCalculated = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dz")
   public void method6080(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         this.field3096[var4] = (int)this.field3096[var4] * var1 / 32827461;
         this.field3100[var4] = (int)this.field3100[var4] * var2 / 340683923;
         this.field3101[var4] = (int)this.field3101[var4] * var3 / -956939332;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bd")
   void method6028(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 26) * -651344141;
      int var9 = Buffer.method12008(var2, (byte)5);
      int var10 = Buffer.method12008(var2, (byte)5);
      int var11 = var2.readUnsignedByte(1672423654);
      int var12 = var2.readUnsignedByte(-752678279);
      int var13 = var2.readUnsignedByte(-706655788);
      int var14 = var2.readUnsignedByte(1563544636);
      int var15 = var2.readUnsignedByte(1152071628);
      int var16 = var2.readUnsignedByte(1819133905);
      int var17 = var2.readUnsignedByte(1693933035);
      int var18 = var2.readUnsignedByte(1494890717);
      int var19 = Buffer.method12008(var2, (byte)5);
      int var20 = Buffer.method12008(var2, (byte)5);
      int var21 = Buffer.method12008(var2, (byte)5);
      int var22 = Buffer.method12008(var2, (byte)5);
      int var23 = Buffer.method12008(var2, (byte)5);
      int var24 = Buffer.method12008(var2, (byte)5);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         var2.offset = 0;

         for (int var28 = 0; var28 < var11; var28++) {
            byte var29 = this.textureRenderTypes[var28] = Buffer.method12001(var2, (byte)32);
            if (var29 == 0) {
               var25++;
            }

            if (var29 >= 1 && var29 <= 3) {
               var26++;
            }

            if (var29 == 2) {
               var27++;
            }
         }
      }

      int var60 = var11 + var9;
      int var30 = var60;
      if (var12 == 1) {
         var60 += var10;
      }

      var60 += var10;
      int var32 = var60;
      if (var13 == -1570686893) {
         var60 += var10;
      }

      int var33 = var60;
      if (var15 == 1) {
         var60 += var10;
      }

      var60 += var24;
      int var35 = var60;
      if (var14 == 1) {
         var60 += var10;
      }

      var60 += var22;
      int var37 = var60;
      if (var16 == 1) {
         var60 += var10 * 2;
      }

      var60 += var23;
      var60 += var10 * 2;
      var60 += var19;
      var60 += var20;
      var60 += var21;
      var60 += var25 * 6;
      var60 += var26 * 6;
      var60 += var26 * 6;
      var60 += var26 * 2;
      var60 += var26;
      var60 += var26 * 2 + var27 * 2;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var17 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
      }

      if (var13 == -809701944) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      if (var16 == 1) {
         this.texTriangleZ = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.textureCoords = new byte[var10];
      }

      if (var18 == 1) {
         this.field3095 = new int[var9][];
         this.field3105 = new int[var9][];
      }

      this.texTriangleY = new short[var10];
      if (var11 > 0) {
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      var2.offset = var11 * 1741769013;
      var3.offset = var60 * -1849527700;
      var4.offset = var60 * 1741769013;
      var5.offset = var60 * 1741769013;
      var6.offset = var60 * 1741769013;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      for (int var53 = 0; var53 < var9; var53++) {
         int var54 = var2.readUnsignedByte(-1090893347);
         int var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.readShortSmart(-1589892263);
         }

         int var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.readShortSmart(1174419171);
         }

         int var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.readShortSmart(20556909);
         }

         this.field3096[var53] = var50 + var55;
         this.field3100[var53] = var51 + var56;
         this.field3101[var53] = var52 + var57;
         var50 = (int)this.field3096[var53];
         var51 = (int)this.field3100[var53];
         var52 = (int)this.field3101[var53];
         if (var17 == 1) {
            this.vertexSkins[var53] = var6.readUnsignedByte(532129071);
         }
      }

      if (var18 == 1) {
         for (int var75 = 0; var75 < var9; var75++) {
            int var78 = var6.readUnsignedByte(1668168175);
            this.field3095[var75] = new int[var78];
            this.field3105[var75] = new int[var78];

            for (int var80 = 0; var80 < var78; var80++) {
               this.field3095[var75][var80] = var6.readUnsignedByte(542143202);
               this.field3105[var75][var80] = var6.readUnsignedByte(-706280042);
            }
         }
      }

      var2.offset = var60 * 410861652;
      var3.offset = var30 * -390261828;
      var4.offset = var32 * 2083868640;
      var5.offset = var35 * 1741769013;
      var6.offset = var33 * 1741769013;
      var7.offset = var37 * 1741769013;
      var8.offset = var60 * 1741769013;

      for (int var76 = 0; var76 < var10; var76++) {
         this.texTriangleY[var76] = (short)Buffer.method12008(var2, (byte)5);
         if (var12 == 1) {
            this.faceRenderTypes[var76] = Buffer.method12001(var3, (byte)20);
         }

         if (var13 == -1751679251) {
            this.faceRenderPriorities[var76] = Buffer.method12001(var4, (byte)6);
         }

         if (var14 == 1) {
            this.faceAlphas[var76] = Buffer.method12001(var5, (byte)37);
         }

         if (var15 == 1) {
            this.faceSkins[var76] = var6.readUnsignedByte(1915326696);
         }

         if (var16 == 1) {
            this.texTriangleZ[var76] = (short)(Buffer.method12008(var7, (byte)5) - 1);
         }

         if (this.textureCoords != null && this.texTriangleZ[var76] != -1) {
            this.textureCoords[var76] = (byte)(var8.readUnsignedByte(-976488567) - 1);
         }
      }

      var2.offset = var60 * -1397693806;
      var3.offset = var60 * 1741769013;
      int var77 = 0;
      int var79 = 0;
      int var81 = 0;
      int var82 = 0;

      for (int var83 = 0; var83 < var10; var83++) {
         int var58 = var3.readUnsignedByte(288274739);
         if (var58 == 1) {
            var77 = var2.readShortSmart(605092039) + var82;
            var79 = var2.readShortSmart(-757690870) + var77;
            var81 = var2.readShortSmart(-717225180) + var79;
            var82 = var81;
            this.indices1[var83] = var77;
            this.indices2[var83] = var79;
            this.indices3[var83] = var81;
         }

         if (var58 == 2) {
            var79 = var81;
            var81 = var2.readShortSmart(-953859329) + var82;
            var82 = var81;
            this.indices1[var83] = var77;
            this.indices2[var83] = var79;
            this.indices3[var83] = var81;
         }

         if (var58 == 3) {
            var77 = var81;
            var81 = var2.readShortSmart(199265776) + var82;
            var82 = var81;
            this.indices1[var83] = var77;
            this.indices2[var83] = var79;
            this.indices3[var83] = var81;
         }

         if (var58 == 4) {
            int var59 = var77;
            var77 = var79;
            var79 = var59;
            var81 = var2.readShortSmart(-1674747636) + var82;
            var82 = var81;
            this.indices1[var83] = var77;
            this.indices2[var83] = var59;
            this.indices3[var83] = var81;
         }
      }

      var2.offset = var60 * 2084727238;
      var3.offset = var60 * 1817514130;
      var4.offset = var60 * -2010068671;
      var5.offset = var60 * -1176860858;
      var6.offset = var60 * 347667361;
      var7.offset = var60 * 1741769013;

      for (int var84 = 0; var84 < var11; var84++) {
         int var86 = this.textureRenderTypes[var84] & 255;
         if (var86 == 0) {
            this.faceColors[var84] = (short)Buffer.method12008(var2, (byte)5);
            this.faceTextures[var84] = (short)Buffer.method12008(var2, (byte)5);
            this.texTriangleX[var84] = (short)Buffer.method12008(var2, (byte)5);
         }
      }

      var2.offset = var60 * 1741769013;
      int var85 = var2.readUnsignedByte(-111974185);
      if (var85 != 0) {
         new ModelData0();
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12015(var2, 569080415);
      }

      boolean var87 = var2.readUnsignedByte(317347987) == 1;
      if (var87) {
         this.field3089 = new byte[var10];

         for (int var88 = 0; var88 < var10; var88++) {
            this.field3089[var88] = Buffer.method12001(var2, (byte)77);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;IIIII)Lky;")
   @ObfuscatedName("ro")
   public static Model method6095(ModelData var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.invalidate();
      }

      var0.calculateVertexNormals();
      int var6 = (int)Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
      int var7 = var2 * var6 >> 8;
      Model var8 = new Model();
      var8.faceColors1 = new int[var0.faceCount];
      var8.faceColors2 = new int[var0.faceCount];
      var8.faceColors3 = new int[var0.faceCount];
      if (var0.textureTriangleCount > 0 && var0.textureCoords != null) {
         int[] var9 = new int[var0.textureTriangleCount];

         for (int var10 = 0; var10 < var0.faceCount; var10++) {
            if (var0.textureCoords[var10] != -1) {
               var9[var0.textureCoords[var10] & 255]++;
            }
         }

         var8.texIndicesCount = 0;

         for (int var17 = 0; var17 < var0.textureTriangleCount; var17++) {
            if (var9[var17] > 0 && var0.textureRenderTypes[var17] == 0) {
               var8.texIndicesCount++;
            }
         }

         var8.texIndices1 = new int[var8.texIndicesCount];
         var8.texIndices2 = new int[var8.texIndicesCount];
         var8.texIndices3 = new int[var8.texIndicesCount];
         int var18 = 0;

         for (int var11 = 0; var11 < var0.textureTriangleCount; var11++) {
            if (var9[var11] > 0 && var0.textureRenderTypes[var11] == 0) {
               var8.texIndices1[var18] = var0.faceColors[var11] & '\uffff';
               var8.texIndices2[var18] = var0.faceTextures[var11] & '\uffff';
               var8.texIndices3[var18] = var0.texTriangleX[var11] & '\uffff';
               var9[var11] = var18++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.textureFaces = new byte[var0.faceCount];

         for (int var20 = 0; var20 < var0.faceCount; var20++) {
            if (var0.textureCoords[var20] != -1) {
               var8.textureFaces[var20] = (byte)var9[var0.textureCoords[var20] & 255];
            } else {
               var8.textureFaces[var20] = -1;
            }
         }
      }

      for (int var16 = 0; var16 < var0.faceCount; var16++) {
         byte var19;
         if (var0.faceRenderTypes == null) {
            var19 = 0;
         } else {
            var19 = var0.faceRenderTypes[var16];
         }

         byte var21;
         if (var0.faceAlphas == null) {
            var21 = 0;
         } else {
            var21 = var0.faceAlphas[var16];
         }

         short var12;
         if (var0.texTriangleZ == null) {
            var12 = -1;
         } else {
            var12 = var0.texTriangleZ[var16];
         }

         if (var21 == -2) {
            var19 = 3;
         }

         if (var21 == -1) {
            var19 = 2;
         }

         if (var12 == -1) {
            if (var19 == 0) {
               int var15 = var0.texTriangleY[var16] & '\uffff';
               VertexNormal var13;
               if (var0.vertexVertices != null && var0.vertexVertices[var0.indices1[var16]] != null) {
                  var13 = var0.vertexVertices[var0.indices1[var16]];
               } else {
                  var13 = var0.vertexNormals[var0.indices1[var16]];
               }

               int var14 = var1
                  + (var3 * var13.x * 97383685 + var4 * var13.y * 1754978191 + var5 * var13.z * 1294340687) / (var7 * var13.magnitude * 802759063);
               var8.faceColors1[var16] = method6023(var15, var14);
               if (var0.vertexVertices != null && var0.vertexVertices[var0.indices2[var16]] != null) {
                  var13 = var0.vertexVertices[var0.indices2[var16]];
               } else {
                  var13 = var0.vertexNormals[var0.indices2[var16]];
               }

               var14 = var1 + (var3 * var13.x * 97383685 + var4 * var13.y * 1754978191 + var5 * var13.z * 1294340687) / (var7 * var13.magnitude * 802759063);
               var8.faceColors2[var16] = method6023(var15, var14);
               if (var0.vertexVertices != null && var0.vertexVertices[var0.indices3[var16]] != null) {
                  var13 = var0.vertexVertices[var0.indices3[var16]];
               } else {
                  var13 = var0.vertexNormals[var0.indices3[var16]];
               }

               var14 = var1 + (var3 * var13.x * 97383685 + var4 * var13.y * 1754978191 + var5 * var13.z * 1294340687) / (var7 * var13.magnitude * 802759063);
               var8.faceColors3[var16] = method6023(var15, var14);
            } else if (var19 == 1) {
               FaceNormal var24 = var0.faceNormals[var16];
               int var31 = var1 + (var3 * var24.x * -1027021233 + var4 * var24.y * -976363093 + var5 * var24.z * 1358705711) / (var7 + var7 / 2);
               var8.faceColors1[var16] = method6023(var0.texTriangleY[var16] & '\uffff', var31);
               var8.faceColors3[var16] = -1;
            } else if (var19 == 3) {
               var8.faceColors1[var16] = 128;
               var8.faceColors3[var16] = -1;
            } else {
               var8.faceColors3[var16] = -2;
            }
         } else if (var19 == 0) {
            VertexNormal var25;
            if (var0.vertexVertices != null && var0.vertexVertices[var0.indices1[var16]] != null) {
               var25 = var0.vertexVertices[var0.indices1[var16]];
            } else {
               var25 = var0.vertexNormals[var0.indices1[var16]];
            }

            int var32 = var1 + (var3 * var25.x * 97383685 + var4 * var25.y * 1754978191 + var5 * var25.z * 1294340687) / (var7 * var25.magnitude * 802759063);
            var8.faceColors1[var16] = method6026(var32);
            if (var0.vertexVertices != null && var0.vertexVertices[var0.indices2[var16]] != null) {
               var25 = var0.vertexVertices[var0.indices2[var16]];
            } else {
               var25 = var0.vertexNormals[var0.indices2[var16]];
            }

            var32 = var1 + (var3 * var25.x * 97383685 + var4 * var25.y * 1754978191 + var5 * var25.z * 1294340687) / (var7 * var25.magnitude * 802759063);
            var8.faceColors2[var16] = method6026(var32);
            if (var0.vertexVertices != null && var0.vertexVertices[var0.indices3[var16]] != null) {
               var25 = var0.vertexVertices[var0.indices3[var16]];
            } else {
               var25 = var0.vertexNormals[var0.indices3[var16]];
            }

            var32 = var1 + (var3 * var25.x * 97383685 + var4 * var25.y * 1754978191 + var5 * var25.z * 1294340687) / (var7 * var25.magnitude * 802759063);
            var8.faceColors3[var16] = method6026(var32);
         } else if (var19 == 1) {
            FaceNormal var28 = var0.faceNormals[var16];
            int var35 = var1 + (var3 * var28.x * -1027021233 + var4 * var28.y * -976363093 + var5 * var28.z * 1358705711) / (var7 + var7 / 2);
            var8.faceColors1[var16] = method6026(var35);
            var8.faceColors3[var16] = -1;
         } else {
            var8.faceColors3[var16] = -2;
         }
      }

      method6052(var0);
      var8.verticesCount = var0.verticesCount;
      var8.field3501 = var0.field3096;
      var8.field3507 = var0.field3100;
      var8.field3503 = var0.field3101;
      var8.indicesCount = var0.faceCount;
      var8.indices1 = var0.indices1;
      var8.indices2 = var0.indices2;
      var8.indices3 = var0.indices3;
      var8.faceRenderPriorities = var0.faceRenderPriorities;
      var8.faceAlphas = var0.faceAlphas;
      var8.field3502 = var0.priority;
      var8.faceLabelsAlpha = var0.vertexLabels;
      var8.field3518 = var0.faceLabelsAlpha;
      var8.faceTextures = var0.texTriangleZ;
      var8.vertexLabels = var0.field3095;
      var8.field3581 = var0.field3105;
      var8.faceBias = var0.field3089;
      return var8;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("br")
   void method6030(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * 1741769013;
      int var9 = Buffer.method12008(var4, (byte)5);
      int var10 = Buffer.method12008(var4, (byte)5);
      int var11 = var4.readUnsignedByte(955976945);
      int var12 = var4.readUnsignedByte(8269058);
      int var13 = var4.readUnsignedByte(-1571225344);
      int var14 = var4.readUnsignedByte(327623381);
      int var15 = var4.readUnsignedByte(-192080526);
      int var16 = var4.readUnsignedByte(-595336781);
      int var17 = var4.readUnsignedByte(16008434);
      int var18 = Buffer.method12008(var4, (byte)5);
      int var19 = Buffer.method12008(var4, (byte)5);
      int var20 = Buffer.method12008(var4, (byte)5);
      int var21 = Buffer.method12008(var4, (byte)5);
      int var22 = Buffer.method12008(var4, (byte)5);
      int var23 = 0;
      var23 += var9;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      var23 += var21;
      var23 += var10 * 2;
      var23 += var11 * 6;
      var23 += var18;
      var23 += var19;
      var23 += var20;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      if (var16 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
         this.textureCoords = new byte[var10];
         this.texTriangleZ = new short[var10];
      }

      if (var13 == 255) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      if (var17 == 1) {
         this.field3095 = new int[var9][];
         this.field3105 = new int[var9][];
      }

      this.texTriangleY = new short[var10];
      var4.offset = var23 * 1741769013;
      var5.offset = var23 * 1741769013;
      var6.offset = var23 * 1741769013;
      var7.offset = var23 * 1741769013;
      var8.offset = var23 * 1741769013;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      for (int var41 = 0; var41 < var9; var41++) {
         int var42 = var4.readUnsignedByte(-964431139);
         int var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.readShortSmart(-326201349);
         }

         int var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.readShortSmart(-324976907);
         }

         int var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.readShortSmart(-572968066);
         }

         this.field3096[var41] = var38 + var43;
         this.field3100[var41] = var39 + var44;
         this.field3101[var41] = var40 + var45;
         var38 = (int)this.field3096[var41];
         var39 = (int)this.field3100[var41];
         var40 = (int)this.field3101[var41];
         if (var16 == 1) {
            this.vertexSkins[var41] = var8.readUnsignedByte(-920664030);
         }
      }

      if (var17 == 1) {
         for (int var58 = 0; var58 < var9; var58++) {
            int var61 = var8.readUnsignedByte(893148819);
            this.field3095[var58] = new int[var61];
            this.field3105[var58] = new int[var61];

            for (int var64 = 0; var64 < var61; var64++) {
               this.field3095[var58][var64] = var8.readUnsignedByte(-538538253);
               this.field3105[var58][var64] = var8.readUnsignedByte(-137310265);
            }
         }
      }

      var4.offset = var23 * 1741769013;
      var5.offset = var28 * 1741769013;
      var6.offset = var26 * 1741769013;
      var7.offset = var30 * 1741769013;
      var8.offset = var27 * 1741769013;

      for (int var59 = 0; var59 < var10; var59++) {
         this.texTriangleY[var59] = (short)Buffer.method12008(var4, (byte)5);
         if (var12 == 1) {
            int var62 = var5.readUnsignedByte(724275941);
            if ((var62 & 1) == 1) {
               this.faceRenderTypes[var59] = 1;
               var2 = true;
            } else {
               this.faceRenderTypes[var59] = 0;
            }

            if ((var62 & 2) == 2) {
               this.textureCoords[var59] = (byte)(var62 >> 2);
               this.texTriangleZ[var59] = this.texTriangleY[var59];
               this.texTriangleY[var59] = 127;
               if (this.texTriangleZ[var59] != -1) {
                  var3 = true;
               }
            } else {
               this.textureCoords[var59] = -1;
               this.texTriangleZ[var59] = -1;
            }
         }

         if (var13 == 255) {
            this.faceRenderPriorities[var59] = Buffer.method12001(var6, (byte)58);
         }

         if (var14 == 1) {
            this.faceAlphas[var59] = Buffer.method12001(var7, (byte)69);
         }

         if (var15 == 1) {
            this.faceSkins[var59] = var8.readUnsignedByte(-1219960589);
         }
      }

      var4.offset = var23 * 1741769013;
      var5.offset = var23 * 1741769013;
      int var60 = 0;
      int var63 = 0;
      int var65 = 0;
      int var66 = 0;

      for (int var67 = 0; var67 < var10; var67++) {
         int var46 = var5.readUnsignedByte(1707898646);
         if (var46 == 1) {
            var60 = var4.readShortSmart(-78290036) + var66;
            var63 = var4.readShortSmart(-1936325717) + var60;
            var65 = var4.readShortSmart(254137798) + var63;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 2) {
            var63 = var65;
            var65 = var4.readShortSmart(-670080198) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 3) {
            var60 = var65;
            var65 = var4.readShortSmart(-660185657) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 4) {
            int var47 = var60;
            var60 = var63;
            var63 = var47;
            var65 = var4.readShortSmart(265935874) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var47;
            this.indices3[var67] = var65;
         }
      }

      var4.offset = var23 * 1741769013;

      for (int var68 = 0; var68 < var11; var68++) {
         this.textureRenderTypes[var68] = 0;
         this.faceColors[var68] = (short)Buffer.method12008(var4, (byte)5);
         this.faceTextures[var68] = (short)Buffer.method12008(var4, (byte)5);
         this.texTriangleX[var68] = (short)Buffer.method12008(var4, (byte)5);
      }

      var4.offset = var23 * 1741769013;
      boolean var69 = var4.readUnsignedByte(1395612982) == 1;
      if (var69) {
         this.field3089 = new byte[var10];

         for (int var70 = 0; var70 < var10; var70++) {
            this.field3089[var70] = Buffer.method12001(var4, (byte)83);
         }
      }

      if (this.textureCoords != null) {
         boolean var71 = false;

         for (int var72 = 0; var72 < var10; var72++) {
            int var48 = this.textureCoords[var72] & 255;
            if (var48 != 255) {
               if ((this.faceColors[var48] & '\uffff') == this.indices1[var72]
                  && (this.faceTextures[var48] & '\uffff') == this.indices2[var72]
                  && (this.texTriangleX[var48] & '\uffff') == this.indices3[var72]) {
                  this.textureCoords[var72] = -1;
               } else {
                  var71 = true;
               }
            }
         }

         if (!var71) {
            this.textureCoords = null;
         }
      }

      if (!var3) {
         this.texTriangleZ = null;
      }

      if (!var2) {
         this.faceRenderTypes = null;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bh")
   void method6031(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * 1741769013;
      int var9 = Buffer.method12008(var4, (byte)5);
      int var10 = Buffer.method12008(var4, (byte)5);
      int var11 = var4.readUnsignedByte(-1015882908);
      int var12 = var4.readUnsignedByte(444278449);
      int var13 = var4.readUnsignedByte(-1072510505);
      int var14 = var4.readUnsignedByte(-1673451771);
      int var15 = var4.readUnsignedByte(1398654374);
      int var16 = var4.readUnsignedByte(-582114987);
      int var17 = var4.readUnsignedByte(360202517);
      int var18 = Buffer.method12008(var4, (byte)5);
      int var19 = Buffer.method12008(var4, (byte)5);
      int var20 = Buffer.method12008(var4, (byte)5);
      int var21 = Buffer.method12008(var4, (byte)5);
      int var22 = Buffer.method12008(var4, (byte)5);
      int var23 = 0;
      var23 += var9;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      var23 += var21;
      var23 += var10 * 2;
      var23 += var11 * 6;
      var23 += var18;
      var23 += var19;
      var23 += var20;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      if (var16 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
         this.textureCoords = new byte[var10];
         this.texTriangleZ = new short[var10];
      }

      if (var13 == 255) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      if (var17 == 1) {
         this.field3095 = new int[var9][];
         this.field3105 = new int[var9][];
      }

      this.texTriangleY = new short[var10];
      var4.offset = var23 * 1741769013;
      var5.offset = var23 * 1741769013;
      var6.offset = var23 * 1741769013;
      var7.offset = var23 * 1741769013;
      var8.offset = var23 * 1741769013;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      for (int var41 = 0; var41 < var9; var41++) {
         int var42 = var4.readUnsignedByte(-1510756002);
         int var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.readShortSmart(968607478);
         }

         int var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.readShortSmart(-733685891);
         }

         int var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.readShortSmart(822948617);
         }

         this.field3096[var41] = var38 + var43;
         this.field3100[var41] = var39 + var44;
         this.field3101[var41] = var40 + var45;
         var38 = (int)this.field3096[var41];
         var39 = (int)this.field3100[var41];
         var40 = (int)this.field3101[var41];
         if (var16 == 1) {
            this.vertexSkins[var41] = var8.readUnsignedByte(1452100131);
         }
      }

      if (var17 == 1) {
         for (int var58 = 0; var58 < var9; var58++) {
            int var61 = var8.readUnsignedByte(345640476);
            this.field3095[var58] = new int[var61];
            this.field3105[var58] = new int[var61];

            for (int var64 = 0; var64 < var61; var64++) {
               this.field3095[var58][var64] = var8.readUnsignedByte(991192488);
               this.field3105[var58][var64] = var8.readUnsignedByte(822503880);
            }
         }
      }

      var4.offset = var23 * 1741769013;
      var5.offset = var28 * 1741769013;
      var6.offset = var26 * 1741769013;
      var7.offset = var30 * 1741769013;
      var8.offset = var27 * 1741769013;

      for (int var59 = 0; var59 < var10; var59++) {
         this.texTriangleY[var59] = (short)Buffer.method12008(var4, (byte)5);
         if (var12 == 1) {
            int var62 = var5.readUnsignedByte(585839652);
            if ((var62 & 1) == 1) {
               this.faceRenderTypes[var59] = 1;
               var2 = true;
            } else {
               this.faceRenderTypes[var59] = 0;
            }

            if ((var62 & 2) == 2) {
               this.textureCoords[var59] = (byte)(var62 >> 2);
               this.texTriangleZ[var59] = this.texTriangleY[var59];
               this.texTriangleY[var59] = 127;
               if (this.texTriangleZ[var59] != -1) {
                  var3 = true;
               }
            } else {
               this.textureCoords[var59] = -1;
               this.texTriangleZ[var59] = -1;
            }
         }

         if (var13 == 255) {
            this.faceRenderPriorities[var59] = Buffer.method12001(var6, (byte)1);
         }

         if (var14 == 1) {
            this.faceAlphas[var59] = Buffer.method12001(var7, (byte)94);
         }

         if (var15 == 1) {
            this.faceSkins[var59] = var8.readUnsignedByte(-865900515);
         }
      }

      var4.offset = var23 * 1741769013;
      var5.offset = var23 * 1741769013;
      int var60 = 0;
      int var63 = 0;
      int var65 = 0;
      int var66 = 0;

      for (int var67 = 0; var67 < var10; var67++) {
         int var46 = var5.readUnsignedByte(-634432420);
         if (var46 == 1) {
            var60 = var4.readShortSmart(2064928866) + var66;
            var63 = var4.readShortSmart(1092455960) + var60;
            var65 = var4.readShortSmart(494538030) + var63;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 2) {
            var63 = var65;
            var65 = var4.readShortSmart(500052910) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 3) {
            var60 = var65;
            var65 = var4.readShortSmart(52294587) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 4) {
            int var47 = var60;
            var60 = var63;
            var63 = var47;
            var65 = var4.readShortSmart(2081215698) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var47;
            this.indices3[var67] = var65;
         }
      }

      var4.offset = var23 * 1741769013;

      for (int var68 = 0; var68 < var11; var68++) {
         this.textureRenderTypes[var68] = 0;
         this.faceColors[var68] = (short)Buffer.method12008(var4, (byte)5);
         this.faceTextures[var68] = (short)Buffer.method12008(var4, (byte)5);
         this.texTriangleX[var68] = (short)Buffer.method12008(var4, (byte)5);
      }

      var4.offset = var23 * 1741769013;
      boolean var69 = var4.readUnsignedByte(-706185210) == 1;
      if (var69) {
         this.field3089 = new byte[var10];

         for (int var70 = 0; var70 < var10; var70++) {
            this.field3089[var70] = Buffer.method12001(var4, (byte)16);
         }
      }

      if (this.textureCoords != null) {
         boolean var71 = false;

         for (int var72 = 0; var72 < var10; var72++) {
            int var48 = this.textureCoords[var72] & 255;
            if (var48 != 255) {
               if ((this.faceColors[var48] & '\uffff') == this.indices1[var72]
                  && (this.faceTextures[var48] & '\uffff') == this.indices2[var72]
                  && (this.texTriangleX[var48] & '\uffff') == this.indices3[var72]) {
                  this.textureCoords[var72] = -1;
               } else {
                  var71 = true;
               }
            }
         }

         if (!var71) {
            this.textureCoords = null;
         }
      }

      if (!var3) {
         this.texTriangleZ = null;
      }

      if (!var2) {
         this.faceRenderTypes = null;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bl")
   void method6032(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * 1054916792;
      int var9 = Buffer.method12008(var4, (byte)5);
      int var10 = Buffer.method12008(var4, (byte)5);
      int var11 = var4.readUnsignedByte(-14408973);
      int var12 = var4.readUnsignedByte(-8556705);
      int var13 = var4.readUnsignedByte(-2630928);
      int var14 = var4.readUnsignedByte(1462727349);
      int var15 = var4.readUnsignedByte(1812540066);
      int var16 = var4.readUnsignedByte(-802178958);
      int var17 = var4.readUnsignedByte(1381459813);
      int var18 = Buffer.method12008(var4, (byte)5);
      int var19 = Buffer.method12008(var4, (byte)5);
      int var20 = Buffer.method12008(var4, (byte)5);
      int var21 = Buffer.method12008(var4, (byte)5);
      int var22 = Buffer.method12008(var4, (byte)5);
      int var23 = 0;
      var23 += var9;
      var23 += var10;
      int var26 = var23;
      if (var13 == 1581544988) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      var23 += var21;
      var23 += var10 * 2;
      var23 += var11 * 6;
      var23 += var18;
      var23 += var19;
      var23 += var20;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      if (var16 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
         this.textureCoords = new byte[var10];
         this.texTriangleZ = new short[var10];
      }

      if (var13 == 255) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      if (var17 == 1) {
         this.field3095 = new int[var9][];
         this.field3105 = new int[var9][];
      }

      this.texTriangleY = new short[var10];
      var4.offset = var23 * -709732919;
      var5.offset = var23 * 56152525;
      var6.offset = var23 * 1741769013;
      var7.offset = var23 * 1741769013;
      var8.offset = var23 * 1741769013;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      for (int var41 = 0; var41 < var9; var41++) {
         int var42 = var4.readUnsignedByte(-1647180267);
         int var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.readShortSmart(560858568);
         }

         int var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.readShortSmart(1602203426);
         }

         int var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.readShortSmart(-1754818930);
         }

         this.field3096[var41] = var38 + var43;
         this.field3100[var41] = var39 + var44;
         this.field3101[var41] = var40 + var45;
         var38 = (int)this.field3096[var41];
         var39 = (int)this.field3100[var41];
         var40 = (int)this.field3101[var41];
         if (var16 == 1) {
            this.vertexSkins[var41] = var8.readUnsignedByte(-1273174711);
         }
      }

      if (var17 == 1) {
         for (int var58 = 0; var58 < var9; var58++) {
            int var61 = var8.readUnsignedByte(-487167089);
            this.field3095[var58] = new int[var61];
            this.field3105[var58] = new int[var61];

            for (int var64 = 0; var64 < var61; var64++) {
               this.field3095[var58][var64] = var8.readUnsignedByte(1411745647);
               this.field3105[var58][var64] = var8.readUnsignedByte(26433594);
            }
         }
      }

      var4.offset = var23 * 1741769013;
      var5.offset = var28 * 1741769013;
      var6.offset = var26 * 403909769;
      var7.offset = var30 * -1922721917;
      var8.offset = var27 * 1741769013;

      for (int var59 = 0; var59 < var10; var59++) {
         this.texTriangleY[var59] = (short)Buffer.method12008(var4, (byte)5);
         if (var12 == 1) {
            int var62 = var5.readUnsignedByte(-323793561);
            if ((var62 & 1) == 1) {
               this.faceRenderTypes[var59] = 1;
               var2 = true;
            } else {
               this.faceRenderTypes[var59] = 0;
            }

            if ((var62 & 2) == 2) {
               this.textureCoords[var59] = (byte)(var62 >> 2);
               this.texTriangleZ[var59] = this.texTriangleY[var59];
               this.texTriangleY[var59] = 127;
               if (this.texTriangleZ[var59] != -1) {
                  var3 = true;
               }
            } else {
               this.textureCoords[var59] = -1;
               this.texTriangleZ[var59] = -1;
            }
         }

         if (var13 == -1868760541) {
            this.faceRenderPriorities[var59] = Buffer.method12001(var6, (byte)66);
         }

         if (var14 == 1) {
            this.faceAlphas[var59] = Buffer.method12001(var7, (byte)86);
         }

         if (var15 == 1) {
            this.faceSkins[var59] = var8.readUnsignedByte(447702941);
         }
      }

      var4.offset = var23 * 1741769013;
      var5.offset = var23 * 1741769013;
      int var60 = 0;
      int var63 = 0;
      int var65 = 0;
      int var66 = 0;

      for (int var67 = 0; var67 < var10; var67++) {
         int var46 = var5.readUnsignedByte(1542433607);
         if (var46 == 1) {
            var60 = var4.readShortSmart(304358618) + var66;
            var63 = var4.readShortSmart(-1248573103) + var60;
            var65 = var4.readShortSmart(50644452) + var63;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 2) {
            var63 = var65;
            var65 = var4.readShortSmart(420374763) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 3) {
            var60 = var65;
            var65 = var4.readShortSmart(476895729) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var63;
            this.indices3[var67] = var65;
         }

         if (var46 == 4) {
            int var47 = var60;
            var60 = var63;
            var63 = var47;
            var65 = var4.readShortSmart(269035617) + var66;
            var66 = var65;
            this.indices1[var67] = var60;
            this.indices2[var67] = var47;
            this.indices3[var67] = var65;
         }
      }

      var4.offset = var23 * 1741769013;

      for (int var68 = 0; var68 < var11; var68++) {
         this.textureRenderTypes[var68] = 0;
         this.faceColors[var68] = (short)Buffer.method12008(var4, (byte)5);
         this.faceTextures[var68] = (short)Buffer.method12008(var4, (byte)5);
         this.texTriangleX[var68] = (short)Buffer.method12008(var4, (byte)5);
      }

      var4.offset = var23 * -326757300;
      boolean var69 = var4.readUnsignedByte(-93251496) == 1;
      if (var69) {
         this.field3089 = new byte[var10];

         for (int var70 = 0; var70 < var10; var70++) {
            this.field3089[var70] = Buffer.method12001(var4, (byte)102);
         }
      }

      if (this.textureCoords != null) {
         boolean var71 = false;

         for (int var72 = 0; var72 < var10; var72++) {
            int var48 = this.textureCoords[var72] & 1117333450;
            if (var48 != -1436774032) {
               if ((this.faceColors[var48] & '\uffff') == this.indices1[var72]
                  && (this.faceTextures[var48] & 1719951763) == this.indices2[var72]
                  && (this.texTriangleX[var48] & '\uffff') == this.indices3[var72]) {
                  this.textureCoords[var72] = -1;
               } else {
                  var71 = true;
               }
            }
         }

         if (!var71) {
            this.textureCoords = null;
         }
      }

      if (!var3) {
         this.texTriangleZ = null;
      }

      if (!var2) {
         this.faceRenderTypes = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;[B)V")
   @ObfuscatedName("nd")
   public static void method6037(ModelData var0, byte[] var1) {
      if (var0 == null) {
         var0.method6076();
      }

      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * 1741769013;
      int var9 = Buffer.method12008(var2, (byte)5);
      int var10 = Buffer.method12008(var2, (byte)5);
      int var11 = var2.readUnsignedByte(-11633386);
      int var12 = var2.readUnsignedByte(-1550083201);
      int var13 = var2.readUnsignedByte(1760122241);
      int var14 = var2.readUnsignedByte(-1693631103);
      int var15 = var2.readUnsignedByte(524935953);
      int var16 = var2.readUnsignedByte(-1692955223);
      int var17 = var2.readUnsignedByte(-686262545);
      int var18 = Buffer.method12008(var2, (byte)5);
      int var19 = Buffer.method12008(var2, (byte)5);
      int var20 = Buffer.method12008(var2, (byte)5);
      int var21 = Buffer.method12008(var2, (byte)5);
      int var22 = Buffer.method12008(var2, (byte)5);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         var0.textureRenderTypes = new byte[var11];
         var2.offset = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = var0.textureRenderTypes[var26] = Buffer.method12001(var2, (byte)4);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var58 = var11 + var9;
      int var28 = var58;
      if (var12 == 1) {
         var58 += var10;
      }

      var58 += var10;
      int var30 = var58;
      if (var13 == 255) {
         var58 += var10;
      }

      int var31 = var58;
      if (var15 == 1) {
         var58 += var10;
      }

      int var32 = var58;
      if (var17 == 1) {
         var58 += var9;
      }

      int var33 = var58;
      if (var14 == 1) {
         var58 += var10;
      }

      var58 += var21;
      int var35 = var58;
      if (var16 == 1) {
         var58 += var10 * 2;
      }

      var58 += var22;
      var58 += var10 * 2;
      var58 += var18;
      var58 += var19;
      var58 += var20;
      var58 += var23 * 6;
      var58 += var24 * 6;
      var58 += var24 * 6;
      var58 += var24 * 2;
      var58 += var24;
      var58 += var24 * 2 + var25 * 2;
      var0.verticesCount = var9;
      var0.faceCount = var10;
      var0.textureTriangleCount = var11;
      var0.field3096 = new float[var9];
      var0.field3100 = new float[var9];
      var0.field3101 = new float[var9];
      var0.indices1 = new int[var10];
      var0.indices2 = new int[var10];
      var0.indices3 = new int[var10];
      if (var17 == 1) {
         var0.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         var0.faceRenderTypes = new byte[var10];
      }

      if (var13 == 255) {
         var0.faceRenderPriorities = new byte[var10];
      } else {
         var0.priority = (byte)var13;
      }

      if (var14 == 1) {
         var0.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         var0.faceSkins = new int[var10];
      }

      if (var16 == 1) {
         var0.texTriangleZ = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         var0.textureCoords = new byte[var10];
      }

      var0.texTriangleY = new short[var10];
      if (var11 > 0) {
         var0.faceColors = new short[var11];
         var0.faceTextures = new short[var11];
         var0.texTriangleX = new short[var11];
      }

      var2.offset = var11 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 1741769013;
      var6.offset = var32 * 1741769013;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      for (int var51 = 0; var51 < var9; var51++) {
         int var52 = var2.readUnsignedByte(711240697);
         int var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.readShortSmart(773144916);
         }

         int var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.readShortSmart(355407418);
         }

         int var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.readShortSmart(-1875461332);
         }

         var0.field3096[var51] = var48 + var53;
         var0.field3100[var51] = var49 + var54;
         var0.field3101[var51] = var50 + var55;
         var48 = (int)var0.field3096[var51];
         var49 = (int)var0.field3100[var51];
         var50 = (int)var0.field3101[var51];
         if (var17 == 1) {
            var0.vertexSkins[var51] = var6.readUnsignedByte(-1564007782);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var28 * 1741769013;
      var4.offset = var30 * 1741769013;
      var5.offset = var33 * 1741769013;
      var6.offset = var31 * 1741769013;
      var7.offset = var35 * 1741769013;
      var8.offset = var58 * 1741769013;

      for (int var72 = 0; var72 < var10; var72++) {
         var0.texTriangleY[var72] = (short)Buffer.method12008(var2, (byte)5);
         if (var12 == 1) {
            var0.faceRenderTypes[var72] = Buffer.method12001(var3, (byte)21);
         }

         if (var13 == 255) {
            var0.faceRenderPriorities[var72] = Buffer.method12001(var4, (byte)16);
         }

         if (var14 == 1) {
            var0.faceAlphas[var72] = Buffer.method12001(var5, (byte)48);
         }

         if (var15 == 1) {
            var0.faceSkins[var72] = var6.readUnsignedByte(501227782);
         }

         if (var16 == 1) {
            var0.texTriangleZ[var72] = (short)(Buffer.method12008(var7, (byte)5) - 1);
         }

         if (var0.textureCoords != null && var0.texTriangleZ[var72] != -1) {
            var0.textureCoords[var72] = (byte)(var8.readUnsignedByte(-1335852234) - 1);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * 1741769013;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;

      for (int var77 = 0; var77 < var10; var77++) {
         int var56 = var3.readUnsignedByte(-672132889);
         if (var56 == 1) {
            var73 = var2.readShortSmart(-179355438) + var76;
            var74 = var2.readShortSmart(-706031682) + var73;
            var75 = var2.readShortSmart(-1437502334) + var74;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 2) {
            var74 = var75;
            var75 = var2.readShortSmart(-1680613484) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 3) {
            var73 = var75;
            var75 = var2.readShortSmart(-729102194) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 4) {
            int var57 = var73;
            var73 = var74;
            var74 = var57;
            var75 = var2.readShortSmart(-1448657547) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var57;
            var0.indices3[var77] = var75;
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 1741769013;
      var6.offset = var58 * 1741769013;
      var7.offset = var58 * 1741769013;

      for (int var78 = 0; var78 < var11; var78++) {
         int var80 = var0.textureRenderTypes[var78] & 255;
         if (var80 == 0) {
            var0.faceColors[var78] = (short)Buffer.method12008(var2, (byte)5);
            var0.faceTextures[var78] = (short)Buffer.method12008(var2, (byte)5);
            var0.texTriangleX[var78] = (short)Buffer.method12008(var2, (byte)5);
         }
      }

      var2.offset = var58 * 1741769013;
      int var79 = var2.readUnsignedByte(1925594410);
      if (var79 != 0) {
         new ModelData0();
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12015(var2, -421405314);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("wj")
   public ModelData method6114() {
      this.field3096 = (float[])this.field3096.clone();
      this.field3100 = (float[])this.field3100.clone();
      this.field3101 = (float[])this.field3101.clone();
      return this;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cu")
   void method6038(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * 1741769013;
      int var9 = Buffer.method12008(var2, (byte)5);
      int var10 = Buffer.method12008(var2, (byte)5);
      int var11 = var2.readUnsignedByte(-118616804);
      int var12 = var2.readUnsignedByte(1172660816);
      int var13 = var2.readUnsignedByte(-302855336);
      int var14 = var2.readUnsignedByte(674610927);
      int var15 = var2.readUnsignedByte(-1724419329);
      int var16 = var2.readUnsignedByte(1045296781);
      int var17 = var2.readUnsignedByte(1820445182);
      int var18 = Buffer.method12008(var2, (byte)5);
      int var19 = Buffer.method12008(var2, (byte)5);
      int var20 = Buffer.method12008(var2, (byte)5);
      int var21 = Buffer.method12008(var2, (byte)5);
      int var22 = Buffer.method12008(var2, (byte)5);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         var2.offset = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = this.textureRenderTypes[var26] = Buffer.method12001(var2, (byte)45);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var58 = var11 + var9;
      int var28 = var58;
      if (var12 == 1) {
         var58 += var10;
      }

      var58 += var10;
      int var30 = var58;
      if (var13 == 255) {
         var58 += var10;
      }

      int var31 = var58;
      if (var15 == 1) {
         var58 += var10;
      }

      int var32 = var58;
      if (var17 == 1) {
         var58 += var9;
      }

      int var33 = var58;
      if (var14 == 1) {
         var58 += var10;
      }

      var58 += var21;
      int var35 = var58;
      if (var16 == 1) {
         var58 += var10 * 2;
      }

      var58 += var22;
      var58 += var10 * 2;
      var58 += var18;
      var58 += var19;
      var58 += var20;
      var58 += var23 * 6;
      var58 += var24 * 6;
      var58 += var24 * 6;
      var58 += var24 * 2;
      var58 += var24;
      var58 += var24 * 2 + var25 * 2;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var17 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
      }

      if (var13 == 255) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      if (var16 == 1) {
         this.texTriangleZ = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.textureCoords = new byte[var10];
      }

      this.texTriangleY = new short[var10];
      if (var11 > 0) {
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      var2.offset = var11 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 1741769013;
      var6.offset = var32 * 1741769013;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      for (int var51 = 0; var51 < var9; var51++) {
         int var52 = var2.readUnsignedByte(-528167276);
         int var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.readShortSmart(-1699653394);
         }

         int var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.readShortSmart(1414708145);
         }

         int var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.readShortSmart(1270846106);
         }

         this.field3096[var51] = var48 + var53;
         this.field3100[var51] = var49 + var54;
         this.field3101[var51] = var50 + var55;
         var48 = (int)this.field3096[var51];
         var49 = (int)this.field3100[var51];
         var50 = (int)this.field3101[var51];
         if (var17 == 1) {
            this.vertexSkins[var51] = var6.readUnsignedByte(-399319405);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var28 * 1741769013;
      var4.offset = var30 * 1741769013;
      var5.offset = var33 * 1741769013;
      var6.offset = var31 * 1741769013;
      var7.offset = var35 * 1741769013;
      var8.offset = var58 * 1741769013;

      for (int var72 = 0; var72 < var10; var72++) {
         this.texTriangleY[var72] = (short)Buffer.method12008(var2, (byte)5);
         if (var12 == 1) {
            this.faceRenderTypes[var72] = Buffer.method12001(var3, (byte)41);
         }

         if (var13 == 255) {
            this.faceRenderPriorities[var72] = Buffer.method12001(var4, (byte)120);
         }

         if (var14 == 1) {
            this.faceAlphas[var72] = Buffer.method12001(var5, (byte)67);
         }

         if (var15 == 1) {
            this.faceSkins[var72] = var6.readUnsignedByte(-476177988);
         }

         if (var16 == 1) {
            this.texTriangleZ[var72] = (short)(Buffer.method12008(var7, (byte)5) - 1);
         }

         if (this.textureCoords != null && this.texTriangleZ[var72] != -1) {
            this.textureCoords[var72] = (byte)(var8.readUnsignedByte(1705642016) - 1);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * 1741769013;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;

      for (int var77 = 0; var77 < var10; var77++) {
         int var56 = var3.readUnsignedByte(1016871964);
         if (var56 == 1) {
            var73 = var2.readShortSmart(-2105264698) + var76;
            var74 = var2.readShortSmart(-272137931) + var73;
            var75 = var2.readShortSmart(17664854) + var74;
            var76 = var75;
            this.indices1[var77] = var73;
            this.indices2[var77] = var74;
            this.indices3[var77] = var75;
         }

         if (var56 == 2) {
            var74 = var75;
            var75 = var2.readShortSmart(941988233) + var76;
            var76 = var75;
            this.indices1[var77] = var73;
            this.indices2[var77] = var74;
            this.indices3[var77] = var75;
         }

         if (var56 == 3) {
            var73 = var75;
            var75 = var2.readShortSmart(-2118079409) + var76;
            var76 = var75;
            this.indices1[var77] = var73;
            this.indices2[var77] = var74;
            this.indices3[var77] = var75;
         }

         if (var56 == 4) {
            int var57 = var73;
            var73 = var74;
            var74 = var57;
            var75 = var2.readShortSmart(211461552) + var76;
            var76 = var75;
            this.indices1[var77] = var73;
            this.indices2[var77] = var57;
            this.indices3[var77] = var75;
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 1741769013;
      var6.offset = var58 * 1741769013;
      var7.offset = var58 * 1741769013;

      for (int var78 = 0; var78 < var11; var78++) {
         int var80 = this.textureRenderTypes[var78] & 255;
         if (var80 == 0) {
            this.faceColors[var78] = (short)Buffer.method12008(var2, (byte)5);
            this.faceTextures[var78] = (short)Buffer.method12008(var2, (byte)5);
            this.texTriangleX[var78] = (short)Buffer.method12008(var2, (byte)5);
         }
      }

      var2.offset = var58 * 1741769013;
      int var79 = var2.readUnsignedByte(1897338476);
      if (var79 != 0) {
         new ModelData0();
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12015(var2, -375898599);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("de")
   public final Model method6098() {
      return method6106(this, -970957464, -1554281299, 0, -1, 0);
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("hk")
   public short[] method6124() {
      return this.faceTextures;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("fa")
   public byte[] method6125() {
      return this.textureRenderTypes;
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Ljm;")
   @ObfuscatedName("wq")
   public ModelData method6126(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      return this.method6049(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bk")
   public void resize(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         this.field3096[var4] = var1 * this.field3096[var4] / 128.0F;
         this.field3100[var4] = var2 * this.field3100[var4] / 128.0F;
         this.field3101[var4] = var3 * this.field3101[var4] / 128.0F;
      }

      this.method6130();
   }

   @ObfuscatedSignature(descriptor = "(Ljm;Ljm;IIIZ)V")
   @ObfuscatedName("rd")
   public static void method6127(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      method6020(var0, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(Ljm;I)I")
   @ObfuscatedName("cb")
   final int method6045(ModelData var1, int var2) {
      int var3 = -1;
      int var4 = (int)var1.field3096[var2];
      int var5 = (int)var1.field3100[var2];
      int var6 = (int)var1.field3101[var2];

      for (int var7 = 0; var7 < this.verticesCount; var7++) {
         if (var4 == (int)this.field3096[var7] && var5 == (int)this.field3100[var7] && var6 == (int)this.field3101[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field3096[this.verticesCount] = var4;
         this.field3100[this.verticesCount] = var5;
         this.field3101[this.verticesCount] = var6;
         if (var1.vertexSkins != null) {
            this.vertexSkins[this.verticesCount] = var1.vertexSkins[var2];
         }

         if (var1.field3095 != null) {
            this.field3095[this.verticesCount] = var1.field3095[var2];
            this.field3105[this.verticesCount] = var1.field3105[var2];
         }

         var3 = this.verticesCount++;
      }

      return var3;
   }

   public int getFaceCount() {
      return this.faceCount;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("do")
   public final Model method6099() {
      return method6106(this, 128, 43690, 0, -1, 0);
   }

   @ObfuscatedSignature(descriptor = "(Ljm;)Ljm;")
   @ObfuscatedName("rk")
   public static ModelData method6048(ModelData var0) {
      if (var0 == null) {
         var0.copyModelData();
      }

      ModelData var1 = new ModelData();
      if (var0.faceRenderTypes != null) {
         var1.faceRenderTypes = new byte[var0.faceCount];

         for (int var2 = 0; var2 < var0.faceCount; var2++) {
            var1.faceRenderTypes[var2] = var0.faceRenderTypes[var2];
         }
      }

      var1.verticesCount = var0.verticesCount;
      var1.faceCount = var0.faceCount;
      var1.textureTriangleCount = var0.textureTriangleCount;
      var1.field3096 = var0.field3096;
      var1.field3100 = var0.field3100;
      var1.field3101 = var0.field3101;
      var1.indices1 = var0.indices1;
      var1.indices2 = var0.indices2;
      var1.indices3 = var0.indices3;
      var1.faceRenderPriorities = var0.faceRenderPriorities;
      var1.faceAlphas = var0.faceAlphas;
      var1.textureCoords = var0.textureCoords;
      var1.texTriangleY = var0.texTriangleY;
      var1.texTriangleZ = var0.texTriangleZ;
      var1.priority = var0.priority;
      var1.textureRenderTypes = var0.textureRenderTypes;
      var1.faceColors = var0.faceColors;
      var1.faceTextures = var0.faceTextures;
      var1.texTriangleX = var0.texTriangleX;
      var1.vertexSkins = var0.vertexSkins;
      var1.faceSkins = var0.faceSkins;
      var1.vertexLabels = var0.vertexLabels;
      var1.faceLabelsAlpha = var0.faceLabelsAlpha;
      var1.vertexNormals = var0.vertexNormals;
      var1.faceNormals = var0.faceNormals;
      var1.ambient = var0.ambient;
      var1.contrast = var0.contrast;
      var1.field3089 = var0.field3089;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljm;I)I")
   @ObfuscatedName("cc")
   final int method6046(ModelData var1, int var2) {
      int var3 = -1;
      int var4 = (int)var1.field3096[var2];
      int var5 = (int)var1.field3100[var2];
      int var6 = (int)var1.field3101[var2];

      for (int var7 = 0; var7 < this.verticesCount; var7++) {
         if (var4 == (int)this.field3096[var7] && var5 == (int)this.field3100[var7] && var6 == (int)this.field3101[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field3096[this.verticesCount] = var4;
         this.field3100[this.verticesCount] = var5;
         this.field3101[this.verticesCount] = var6;
         if (var1.vertexSkins != null) {
            this.vertexSkins[this.verticesCount] = var1.vertexSkins[var2];
         }

         if (var1.field3095 != null) {
            this.field3095[this.verticesCount] = var1.field3095[var2];
            this.field3105[this.verticesCount] = var1.field3105[var2];
         }

         var3 = this.verticesCount++;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Ljm;III)V")
   @ObfuscatedName("ma")
   public static void method6104(ModelData var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.changeOffset(var1, var1, var1);
      } else {
         for (int var4 = 0; var4 < var0.verticesCount; var4++) {
            var0.field3096[var4] = var0.field3096[var4] + var1;
            var0.field3100[var4] = var0.field3100[var4] + var2;
            var0.field3101[var4] = var0.field3101[var4] + var3;
         }

         var0.method6130();
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cm")
   void method6043(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 18) * 1741769013;
      int var9 = Buffer.method12008(var4, (byte)5);
      int var10 = Buffer.method12008(var4, (byte)5);
      int var11 = var4.readUnsignedByte(1704110002);
      int var12 = var4.readUnsignedByte(274045334);
      int var13 = var4.readUnsignedByte(1559164541);
      int var14 = var4.readUnsignedByte(1608544084);
      int var15 = var4.readUnsignedByte(1890360331);
      int var16 = var4.readUnsignedByte(-1380308024);
      int var17 = Buffer.method12008(var4, (byte)5);
      int var18 = Buffer.method12008(var4, (byte)5);
      int var19 = Buffer.method12008(var4, (byte)5);
      int var20 = Buffer.method12008(var4, (byte)5);
      int var21 = 0;
      var21 += var9;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      var21 += var20;
      var21 += var10 * 2;
      var21 += var11 * 6;
      var21 += var17;
      var21 += var18;
      var21 += var19;
      this.verticesCount = var9;
      this.faceCount = var10;
      this.textureTriangleCount = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.indices1 = new int[var10];
      this.indices2 = new int[var10];
      this.indices3 = new int[var10];
      if (var11 > 0) {
         this.textureRenderTypes = new byte[var11];
         this.faceColors = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleX = new short[var11];
      }

      if (var16 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.faceRenderTypes = new byte[var10];
         this.textureCoords = new byte[var10];
         this.texTriangleZ = new short[var10];
      }

      if (var13 == 255) {
         this.faceRenderPriorities = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         this.faceSkins = new int[var10];
      }

      this.texTriangleY = new short[var10];
      var4.offset = var21 * 1741769013;
      var5.offset = var21 * 1741769013;
      var6.offset = var21 * 1741769013;
      var7.offset = var21 * 1741769013;
      var8.offset = var27 * 1741769013;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      for (int var38 = 0; var38 < var9; var38++) {
         int var39 = var4.readUnsignedByte(1368866652);
         int var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.readShortSmart(703120290);
         }

         int var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.readShortSmart(1987955934);
         }

         int var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.readShortSmart(-650436252);
         }

         this.field3096[var38] = var35 + var40;
         this.field3100[var38] = var36 + var41;
         this.field3101[var38] = var37 + var42;
         var35 = (int)this.field3096[var38];
         var36 = (int)this.field3100[var38];
         var37 = (int)this.field3101[var38];
         if (var16 == 1) {
            this.vertexSkins[var38] = var8.readUnsignedByte(-1638553997);
         }
      }

      var4.offset = var21 * 1741769013;
      var5.offset = var26 * 1741769013;
      var6.offset = var24 * 1741769013;
      var7.offset = var28 * 1741769013;
      var8.offset = var25 * 1741769013;

      for (int var53 = 0; var53 < var10; var53++) {
         this.texTriangleY[var53] = (short)Buffer.method12008(var4, (byte)5);
         if (var12 == 1) {
            int var55 = var5.readUnsignedByte(1333166502);
            if ((var55 & 1) == 1) {
               this.faceRenderTypes[var53] = 1;
               var2 = true;
            } else {
               this.faceRenderTypes[var53] = 0;
            }

            if ((var55 & 2) == 2) {
               this.textureCoords[var53] = (byte)(var55 >> 2);
               this.texTriangleZ[var53] = this.texTriangleY[var53];
               this.texTriangleY[var53] = 127;
               if (this.texTriangleZ[var53] != -1) {
                  var3 = true;
               }
            } else {
               this.textureCoords[var53] = -1;
               this.texTriangleZ[var53] = -1;
            }
         }

         if (var13 == 255) {
            this.faceRenderPriorities[var53] = Buffer.method12001(var6, (byte)12);
         }

         if (var14 == 1) {
            this.faceAlphas[var53] = Buffer.method12001(var7, (byte)97);
         }

         if (var15 == 1) {
            this.faceSkins[var53] = var8.readUnsignedByte(551564743);
         }
      }

      var4.offset = var21 * 1741769013;
      var5.offset = var21 * 1741769013;
      int var54 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;

      for (int var59 = 0; var59 < var10; var59++) {
         int var43 = var5.readUnsignedByte(1773295068);
         if (var43 == 1) {
            var54 = var4.readShortSmart(-111590155) + var58;
            var56 = var4.readShortSmart(-741497136) + var54;
            var57 = var4.readShortSmart(1819481370) + var56;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 2) {
            var56 = var57;
            var57 = var4.readShortSmart(907230344) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 3) {
            var54 = var57;
            var57 = var4.readShortSmart(-1330063370) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var56;
            this.indices3[var59] = var57;
         }

         if (var43 == 4) {
            int var44 = var54;
            var54 = var56;
            var56 = var44;
            var57 = var4.readShortSmart(1748036736) + var58;
            var58 = var57;
            this.indices1[var59] = var54;
            this.indices2[var59] = var44;
            this.indices3[var59] = var57;
         }
      }

      var4.offset = var21 * 1741769013;

      for (int var60 = 0; var60 < var11; var60++) {
         this.textureRenderTypes[var60] = 0;
         this.faceColors[var60] = (short)Buffer.method12008(var4, (byte)5);
         this.faceTextures[var60] = (short)Buffer.method12008(var4, (byte)5);
         this.texTriangleX[var60] = (short)Buffer.method12008(var4, (byte)5);
      }

      if (this.textureCoords != null) {
         boolean var61 = false;

         for (int var62 = 0; var62 < var10; var62++) {
            int var63 = this.textureCoords[var62] & 255;
            if (var63 != 255) {
               if ((this.faceColors[var63] & '\uffff') == this.indices1[var62]
                  && (this.faceTextures[var63] & '\uffff') == this.indices2[var62]
                  && (this.texTriangleX[var63] & '\uffff') == this.indices3[var62]) {
                  this.textureCoords[var62] = -1;
               } else {
                  var61 = true;
               }
            }
         }

         if (!var61) {
            this.textureCoords = null;
         }
      }

      if (!var3) {
         this.texTriangleZ = null;
      }

      if (!var2) {
         this.faceRenderTypes = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   public void method6054() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         int var2 = (int)this.field3096[var1];
         this.field3096[var1] = this.field3101[var1];
         this.field3101[var1] = -var2;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("dn")
   public final Model method6100() {
      return method6106(this, 128, 43690, 0, -1, 0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   public void method6057() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3096[var1] = -((int)this.field3096[var1]);
         this.field3101[var1] = -((int)this.field3101[var1]);
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "(Ljm;[B)V")
   @ObfuscatedName("tt")
   public static void method6033(ModelData var0, byte[] var1) {
      if (var0 == null) {
         var0.method6034(var1);
      } else {
         boolean var2 = false;
         boolean var3 = false;
         Buffer var4 = new Buffer(var1);
         Buffer var5 = new Buffer(var1);
         Buffer var6 = new Buffer(var1);
         Buffer var7 = new Buffer(var1);
         Buffer var8 = new Buffer(var1);
         var4.offset = (var1.length - 23) * 1741769013;
         int var9 = Buffer.method12008(var4, (byte)5);
         int var10 = Buffer.method12008(var4, (byte)5);
         int var11 = var4.readUnsignedByte(-76501308);
         int var12 = var4.readUnsignedByte(-832537999);
         int var13 = var4.readUnsignedByte(655212435);
         int var14 = var4.readUnsignedByte(622385299);
         int var15 = var4.readUnsignedByte(1025638825);
         int var16 = var4.readUnsignedByte(1083683212);
         int var17 = var4.readUnsignedByte(1496787786);
         int var18 = Buffer.method12008(var4, (byte)5);
         int var19 = Buffer.method12008(var4, (byte)5);
         int var20 = Buffer.method12008(var4, (byte)5);
         int var21 = Buffer.method12008(var4, (byte)5);
         int var22 = Buffer.method12008(var4, (byte)5);
         int var23 = 0;
         var23 += var9;
         var23 += var10;
         int var26 = var23;
         if (var13 == 255) {
            var23 += var10;
         }

         int var27 = var23;
         if (var15 == 1) {
            var23 += var10;
         }

         int var28 = var23;
         if (var12 == 1) {
            var23 += var10;
         }

         var23 += var22;
         int var30 = var23;
         if (var14 == 1) {
            var23 += var10;
         }

         var23 += var21;
         var23 += var10 * 2;
         var23 += var11 * 6;
         var23 += var18;
         var23 += var19;
         var23 += var20;
         var0.verticesCount = var9;
         var0.faceCount = var10;
         var0.textureTriangleCount = var11;
         var0.field3096 = new float[var9];
         var0.field3100 = new float[var9];
         var0.field3101 = new float[var9];
         var0.indices1 = new int[var10];
         var0.indices2 = new int[var10];
         var0.indices3 = new int[var10];
         if (var11 > 0) {
            var0.textureRenderTypes = new byte[var11];
            var0.faceColors = new short[var11];
            var0.faceTextures = new short[var11];
            var0.texTriangleX = new short[var11];
         }

         if (var16 == 1) {
            var0.vertexSkins = new int[var9];
         }

         if (var12 == 1) {
            var0.faceRenderTypes = new byte[var10];
            var0.textureCoords = new byte[var10];
            var0.texTriangleZ = new short[var10];
         }

         if (var13 == 255) {
            var0.faceRenderPriorities = new byte[var10];
         } else {
            var0.priority = (byte)var13;
         }

         if (var14 == 1) {
            var0.faceAlphas = new byte[var10];
         }

         if (var15 == 1) {
            var0.faceSkins = new int[var10];
         }

         if (var17 == 1) {
            var0.field3095 = new int[var9][];
            var0.field3105 = new int[var9][];
         }

         var0.texTriangleY = new short[var10];
         var4.offset = var23 * 1741769013;
         var5.offset = var23 * 1741769013;
         var6.offset = var23 * 1741769013;
         var7.offset = var23 * 1741769013;
         var8.offset = var23 * 1741769013;
         int var38 = 0;
         int var39 = 0;
         int var40 = 0;

         for (int var41 = 0; var41 < var9; var41++) {
            int var42 = var4.readUnsignedByte(-1530619487);
            int var43 = 0;
            if ((var42 & 1) != 0) {
               var43 = var5.readShortSmart(288103583);
            }

            int var44 = 0;
            if ((var42 & 2) != 0) {
               var44 = var6.readShortSmart(969023616);
            }

            int var45 = 0;
            if ((var42 & 4) != 0) {
               var45 = var7.readShortSmart(-100723690);
            }

            var0.field3096[var41] = var38 + var43;
            var0.field3100[var41] = var39 + var44;
            var0.field3101[var41] = var40 + var45;
            var38 = (int)var0.field3096[var41];
            var39 = (int)var0.field3100[var41];
            var40 = (int)var0.field3101[var41];
            if (var16 == 1) {
               var0.vertexSkins[var41] = var8.readUnsignedByte(-484875655);
            }
         }

         if (var17 == 1) {
            for (int var58 = 0; var58 < var9; var58++) {
               int var61 = var8.readUnsignedByte(1043040065);
               var0.field3095[var58] = new int[var61];
               var0.field3105[var58] = new int[var61];

               for (int var64 = 0; var64 < var61; var64++) {
                  var0.field3095[var58][var64] = var8.readUnsignedByte(1049664313);
                  var0.field3105[var58][var64] = var8.readUnsignedByte(112226855);
               }
            }
         }

         var4.offset = var23 * 1741769013;
         var5.offset = var28 * 1741769013;
         var6.offset = var26 * 1741769013;
         var7.offset = var30 * 1741769013;
         var8.offset = var27 * 1741769013;

         for (int var59 = 0; var59 < var10; var59++) {
            var0.texTriangleY[var59] = (short)Buffer.method12008(var4, (byte)5);
            if (var12 == 1) {
               int var62 = var5.readUnsignedByte(-625568667);
               if ((var62 & 1) == 1) {
                  var0.faceRenderTypes[var59] = 1;
                  var2 = true;
               } else {
                  var0.faceRenderTypes[var59] = 0;
               }

               if ((var62 & 2) == 2) {
                  var0.textureCoords[var59] = (byte)(var62 >> 2);
                  var0.texTriangleZ[var59] = var0.texTriangleY[var59];
                  var0.texTriangleY[var59] = 127;
                  if (var0.texTriangleZ[var59] != -1) {
                     var3 = true;
                  }
               } else {
                  var0.textureCoords[var59] = -1;
                  var0.texTriangleZ[var59] = -1;
               }
            }

            if (var13 == 255) {
               var0.faceRenderPriorities[var59] = Buffer.method12001(var6, (byte)82);
            }

            if (var14 == 1) {
               var0.faceAlphas[var59] = Buffer.method12001(var7, (byte)79);
            }

            if (var15 == 1) {
               var0.faceSkins[var59] = var8.readUnsignedByte(-1050772233);
            }
         }

         var4.offset = var23 * 1741769013;
         var5.offset = var23 * 1741769013;
         int var60 = 0;
         int var63 = 0;
         int var65 = 0;
         int var66 = 0;

         for (int var67 = 0; var67 < var10; var67++) {
            int var46 = var5.readUnsignedByte(1935213362);
            if (var46 == 1) {
               var60 = var4.readShortSmart(244416010) + var66;
               var63 = var4.readShortSmart(-649397109) + var60;
               var65 = var4.readShortSmart(-582811450) + var63;
               var66 = var65;
               var0.indices1[var67] = var60;
               var0.indices2[var67] = var63;
               var0.indices3[var67] = var65;
            }

            if (var46 == 2) {
               var63 = var65;
               var65 = var4.readShortSmart(1951956263) + var66;
               var66 = var65;
               var0.indices1[var67] = var60;
               var0.indices2[var67] = var63;
               var0.indices3[var67] = var65;
            }

            if (var46 == 3) {
               var60 = var65;
               var65 = var4.readShortSmart(-1683960329) + var66;
               var66 = var65;
               var0.indices1[var67] = var60;
               var0.indices2[var67] = var63;
               var0.indices3[var67] = var65;
            }

            if (var46 == 4) {
               int var47 = var60;
               var60 = var63;
               var63 = var47;
               var65 = var4.readShortSmart(-1595179765) + var66;
               var66 = var65;
               var0.indices1[var67] = var60;
               var0.indices2[var67] = var47;
               var0.indices3[var67] = var65;
            }
         }

         var4.offset = var23 * 1741769013;

         for (int var68 = 0; var68 < var11; var68++) {
            var0.textureRenderTypes[var68] = 0;
            var0.faceColors[var68] = (short)Buffer.method12008(var4, (byte)5);
            var0.faceTextures[var68] = (short)Buffer.method12008(var4, (byte)5);
            var0.texTriangleX[var68] = (short)Buffer.method12008(var4, (byte)5);
         }

         var4.offset = var23 * 1741769013;
         boolean var69 = var4.readUnsignedByte(-1443704488) == 1;
         if (var69) {
            var0.field3089 = new byte[var10];

            for (int var70 = 0; var70 < var10; var70++) {
               var0.field3089[var70] = Buffer.method12001(var4, (byte)77);
            }
         }

         if (var0.textureCoords != null) {
            boolean var71 = false;

            for (int var72 = 0; var72 < var10; var72++) {
               int var48 = var0.textureCoords[var72] & 255;
               if (var48 != 255) {
                  if ((var0.faceColors[var48] & '\uffff') == var0.indices1[var72]
                     && (var0.faceTextures[var48] & '\uffff') == var0.indices2[var72]
                     && (var0.texTriangleX[var48] & '\uffff') == var0.indices3[var72]) {
                     var0.textureCoords[var72] = -1;
                  } else {
                     var71 = true;
                  }
               }
            }

            if (!var71) {
               var0.textureCoords = null;
            }
         }

         if (!var3) {
            var0.texTriangleZ = null;
         }

         if (!var2) {
            var0.faceRenderTypes = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   public void method6059() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         int var2 = (int)this.field3101[var1];
         this.field3101[var1] = this.field3096[var1];
         this.field3096[var1] = -var2;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("vd")
   public ModelData method6128() {
      this.method6112();
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("yt")
   public ModelData method6129() {
      return method6048(this);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cq")
   public void method6060() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         int var2 = (int)this.field3101[var1];
         this.field3101[var1] = this.field3096[var1];
         this.field3096[var1] = -var2;
      }

      this.method6087();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;Ljm;IIIZ)V")
   @ObfuscatedName("by")
   static void method6022(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      method6092(var0);
      var0.calculateVertexNormals();
      method6092(var1);
      var1.calculateVertexNormals();
      field3119++;
      int var6 = 0;
      float[] var7 = var1.field3096;
      int var8 = var1.verticesCount;

      for (int var9 = 0; var9 < var0.verticesCount; var9++) {
         VertexNormal var10 = var0.vertexNormals[var9];
         if (var10.magnitude * 802759063 != 0) {
            int var11 = (int)var0.field3100[var9] - var3;
            if (var11 <= var1.field3130) {
               int var12 = (int)var0.field3096[var9] - var2;
               if (var12 >= var1.field3127 && var12 <= var1.field3128) {
                  int var13 = (int)var0.field3101[var9] - var4;
                  if (var13 >= var1.field3129 && var13 <= var1.field3126) {
                     for (int var14 = 0; var14 < var8; var14++) {
                        VertexNormal var15 = var1.vertexNormals[var14];
                        if (var12 == (int)var7[var14]
                           && var13 == (int)var1.field3101[var14]
                           && var11 == (int)var1.field3100[var14]
                           && var15.magnitude * 802759063 != 0) {
                           if (var0.vertexVertices == null) {
                              var0.vertexVertices = new VertexNormal[var0.verticesCount];
                           }

                           if (var1.vertexVertices == null) {
                              var1.vertexVertices = new VertexNormal[var8];
                           }

                           VertexNormal var16 = var0.vertexVertices[var9];
                           if (var16 == null) {
                              var16 = var0.vertexVertices[var9] = new VertexNormal(var10);
                           }

                           VertexNormal var17 = var1.vertexVertices[var14];
                           if (var17 == null) {
                              var17 = var1.vertexVertices[var14] = new VertexNormal(var15);
                           }

                           var16.x = var16.x + var15.x * 1;
                           var16.y = var16.y + var15.y * 1;
                           var16.z = var16.z + var15.z * 1;
                           var16.magnitude = var16.magnitude + var15.magnitude * 1;
                           var17.x = var17.x + var10.x * 1;
                           var17.y = var17.y + var10.y * 1;
                           var17.z = var17.z + var10.z * 1;
                           var17.magnitude = var17.magnitude + var10.magnitude * 1;
                           var6++;
                           field3118[var9] = field3119;
                           field3121[var14] = field3119;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for (int var18 = 0; var18 < var0.faceCount; var18++) {
            if (field3118[var0.indices1[var18]] == field3119 && field3118[var0.indices2[var18]] == field3119 && field3118[var0.indices3[var18]] == field3119) {
               if (var0.faceRenderTypes == null) {
                  var0.faceRenderTypes = new byte[var0.faceCount];
               }

               var0.faceRenderTypes[var18] = 2;
            }
         }

         for (int var19 = 0; var19 < var1.faceCount; var19++) {
            if (field3121[var1.indices1[var19]] == field3119 && field3121[var1.indices2[var19]] == field3119 && field3121[var1.indices3[var19]] == field3119) {
               if (var1.faceRenderTypes == null) {
                  var1.faceRenderTypes = new byte[var1.faceCount];
               }

               var1.faceRenderTypes[var19] = 2;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljm;IIIII)Lky;")
   @ObfuscatedName("fo")
   public static Model method6106(ModelData var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.toModel(var1, var1, var1, var1, var1);
      }

      client.field938.trace("Lighting model {}", var0);
      int var12 = var5;
      int var11 = var4;
      int var10 = var3;
      int var8 = var1;
      ModelData var7 = var0;
      var0.calculateVertexNormals();
      int var13 = (int)Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
      int var14 = var2 * var13 >> 8;
      Model var15 = new Model();
      var15.faceColors1 = new int[var0.faceCount];
      var15.faceColors2 = new int[var0.faceCount];
      var15.faceColors3 = new int[var0.faceCount];
      if (var0.textureTriangleCount > 0 && var0.textureCoords != null) {
         int[] var16 = new int[var0.textureTriangleCount];

         for (int var17 = 0; var17 < var7.faceCount; var17++) {
            if (var7.textureCoords[var17] != -1) {
               var16[var7.textureCoords[var17] & 255]++;
            }
         }

         var15.texIndicesCount = 0;

         for (int var24 = 0; var24 < var7.textureTriangleCount; var24++) {
            if (var16[var24] > 0 && var7.textureRenderTypes[var24] == 0) {
               var15.texIndicesCount++;
            }
         }

         var15.texIndices1 = new int[var15.texIndicesCount];
         var15.texIndices2 = new int[var15.texIndicesCount];
         var15.texIndices3 = new int[var15.texIndicesCount];
         int var25 = 0;

         for (int var18 = 0; var18 < var7.textureTriangleCount; var18++) {
            if (var16[var18] > 0 && var7.textureRenderTypes[var18] == 0) {
               var15.texIndices1[var25] = var7.faceColors[var18] & '\uffff';
               var15.texIndices2[var25] = var7.faceTextures[var18] & '\uffff';
               var15.texIndices3[var25] = var7.texTriangleX[var18] & '\uffff';
               var16[var18] = var25++;
            } else {
               var16[var18] = -1;
            }
         }

         var15.textureFaces = new byte[var7.faceCount];

         for (int var27 = 0; var27 < var7.faceCount; var27++) {
            if (var7.textureCoords[var27] != -1) {
               var15.textureFaces[var27] = (byte)var16[var7.textureCoords[var27] & 255];
            } else {
               var15.textureFaces[var27] = -1;
            }
         }
      }

      for (int var23 = 0; var23 < var7.faceCount; var23++) {
         byte var26;
         if (var7.faceRenderTypes == null) {
            var26 = 0;
         } else {
            var26 = var7.faceRenderTypes[var23];
         }

         byte var28;
         if (var7.faceAlphas == null) {
            var28 = 0;
         } else {
            var28 = var7.faceAlphas[var23];
         }

         short var19;
         if (var7.texTriangleZ == null) {
            var19 = -1;
         } else {
            var19 = var7.texTriangleZ[var23];
         }

         if (var28 == -2) {
            var26 = 3;
         }

         if (var28 == -1) {
            var26 = 2;
         }

         if (var19 == -1) {
            if (var26 == 0) {
               int var22 = var7.texTriangleY[var23] & '\uffff';
               VertexNormal var20;
               if (var7.vertexVertices != null && var7.vertexVertices[var7.indices1[var23]] != null) {
                  var20 = var7.vertexVertices[var7.indices1[var23]];
               } else {
                  var20 = var7.vertexNormals[var7.indices1[var23]];
               }

               int var21 = var8
                  + (var10 * var20.x * 97383685 + var11 * var20.y * 1754978191 + var12 * var20.z * 1294340687) / (var14 * var20.magnitude * 802759063);
               var15.faceColors1[var23] = method6023(var22, var21);
               if (var7.vertexVertices != null && var7.vertexVertices[var7.indices2[var23]] != null) {
                  var20 = var7.vertexVertices[var7.indices2[var23]];
               } else {
                  var20 = var7.vertexNormals[var7.indices2[var23]];
               }

               var21 = var8
                  + (var10 * var20.x * 97383685 + var11 * var20.y * 1754978191 + var12 * var20.z * 1294340687) / (var14 * var20.magnitude * 802759063);
               var15.faceColors2[var23] = method6023(var22, var21);
               if (var7.vertexVertices != null && var7.vertexVertices[var7.indices3[var23]] != null) {
                  var20 = var7.vertexVertices[var7.indices3[var23]];
               } else {
                  var20 = var7.vertexNormals[var7.indices3[var23]];
               }

               var21 = var8
                  + (var10 * var20.x * 97383685 + var11 * var20.y * 1754978191 + var12 * var20.z * 1294340687) / (var14 * var20.magnitude * 802759063);
               var15.faceColors3[var23] = method6023(var22, var21);
            } else if (var26 == 1) {
               FaceNormal var31 = var7.faceNormals[var23];
               int var38 = var8 + (var10 * var31.x * -1027021233 + var11 * var31.y * -976363093 + var12 * var31.z * 1358705711) / (var14 + var14 / 2);
               var15.faceColors1[var23] = method6023(var7.texTriangleY[var23] & '\uffff', var38);
               var15.faceColors3[var23] = -1;
            } else if (var26 == 3) {
               var15.faceColors1[var23] = 128;
               var15.faceColors3[var23] = -1;
            } else {
               var15.faceColors3[var23] = -2;
            }
         } else if (var26 == 0) {
            VertexNormal var32;
            if (var7.vertexVertices != null && var7.vertexVertices[var7.indices1[var23]] != null) {
               var32 = var7.vertexVertices[var7.indices1[var23]];
            } else {
               var32 = var7.vertexNormals[var7.indices1[var23]];
            }

            int var39 = var8
               + (var10 * var32.x * 97383685 + var11 * var32.y * 1754978191 + var12 * var32.z * 1294340687) / (var14 * var32.magnitude * 802759063);
            var15.faceColors1[var23] = method6026(var39);
            if (var7.vertexVertices != null && var7.vertexVertices[var7.indices2[var23]] != null) {
               var32 = var7.vertexVertices[var7.indices2[var23]];
            } else {
               var32 = var7.vertexNormals[var7.indices2[var23]];
            }

            var39 = var8 + (var10 * var32.x * 97383685 + var11 * var32.y * 1754978191 + var12 * var32.z * 1294340687) / (var14 * var32.magnitude * 802759063);
            var15.faceColors2[var23] = method6026(var39);
            if (var7.vertexVertices != null && var7.vertexVertices[var7.indices3[var23]] != null) {
               var32 = var7.vertexVertices[var7.indices3[var23]];
            } else {
               var32 = var7.vertexNormals[var7.indices3[var23]];
            }

            var39 = var8 + (var10 * var32.x * 97383685 + var11 * var32.y * 1754978191 + var12 * var32.z * 1294340687) / (var14 * var32.magnitude * 802759063);
            var15.faceColors3[var23] = method6026(var39);
         } else if (var26 == 1) {
            FaceNormal var35 = var7.faceNormals[var23];
            int var42 = var8 + (var10 * var35.x * -1027021233 + var11 * var35.y * -976363093 + var12 * var35.z * 1358705711) / (var14 + var14 / 2);
            var15.faceColors1[var23] = method6026(var42);
            var15.faceColors3[var23] = -1;
         } else {
            var15.faceColors3[var23] = -2;
         }
      }

      method6052(var7);
      var15.verticesCount = var7.verticesCount;
      var15.field3501 = var7.field3096;
      var15.field3507 = var7.field3100;
      var15.field3503 = var7.field3101;
      var15.indicesCount = var7.faceCount;
      var15.indices1 = var7.indices1;
      var15.indices2 = var7.indices2;
      var15.indices3 = var7.indices3;
      var15.faceRenderPriorities = var7.faceRenderPriorities;
      var15.faceAlphas = var7.faceAlphas;
      var15.field3502 = var7.priority;
      var15.faceLabelsAlpha = var7.vertexLabels;
      var15.field3518 = var7.faceLabelsAlpha;
      var15.faceTextures = var7.texTriangleZ;
      var15.vertexLabels = var7.field3095;
      var15.field3581 = var7.field3105;
      var15.faceBias = var7.field3089;
      if (var15 == null) {
         return null;
      } else {
         if ((client.field997 & 4) == 4) {
            var0.method6116();
            var15.field3578 = var0.field3135;
            var15.field3577 = var0.field3136;
            var15.field3579 = var0.field3134;
         }

         if ((client.field997 & 64) == 64) {
            var15.field3580 = var0.texTriangleY;
         }

         return var15;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lg")
   public void method6130() {
      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "([[IIIIZI)Ljm;")
   @ObfuscatedName("al")
   public ModelData method6049(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      method6092(this);
      int var7 = var2 + this.field3127;
      int var8 = var2 + this.field3128;
      int var9 = var4 + this.field3129;
      int var10 = var4 + this.field3126;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            ModelData var11;
            if (var5) {
               var11 = new ModelData(this, true, true, true, true);
               var11.field3100 = new float[var11.verticesCount];
            } else {
               var11 = this;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.verticesCount; var12++) {
                  int var13 = (int)this.field3096[var12] + var2;
                  int var14 = (int)this.field3101[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field3100[var12] = (int)this.field3100[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.verticesCount; var27++) {
                  int var28 = (-((int)this.field3100[var27]) << 16) / (this.height * -1272589951);
                  if (var28 < var6) {
                     int var29 = (int)this.field3096[var27] + var2;
                     int var30 = (int)this.field3101[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field3100[var27] = (int)this.field3100[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field3100[var27] = this.field3100[var27];
                  }
               }
            }

            var11.method6087();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("cl")
   public void method6068(short var1, short var2) {
      for (int var3 = 0; var3 < this.faceCount; var3++) {
         if (this.texTriangleY[var3] == var1) {
            this.texTriangleY[var3] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("dd")
   public void method6069(short var1, short var2) {
      for (int var3 = 0; var3 < this.faceCount; var3++) {
         if (this.texTriangleY[var3] == var1) {
            this.texTriangleY[var3] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("di")
   public void method6083() {
      if (this.vertexNormals == null) {
         this.vertexNormals = new VertexNormal[this.verticesCount];

         for (int var1 = 0; var1 < this.verticesCount; var1++) {
            this.vertexNormals[var1] = new VertexNormal();
         }

         for (int var17 = 0; var17 < this.faceCount; var17++) {
            int var2 = this.indices1[var17];
            int var3 = this.indices2[var17];
            int var4 = this.indices3[var17];
            int var5 = (int)this.field3096[var3] - (int)this.field3096[var2];
            int var6 = (int)this.field3100[var3] - (int)this.field3100[var2];
            int var7 = (int)this.field3101[var3] - (int)this.field3101[var2];
            int var8 = (int)this.field3096[var4] - (int)this.field3096[var2];
            int var9 = (int)this.field3100[var4] - (int)this.field3100[var2];
            int var10 = (int)this.field3101[var4] - (int)this.field3101[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.faceRenderTypes == null) {
               var15 = 0;
            } else {
               var15 = this.faceRenderTypes[var17];
            }

            if (var15 == 0) {
               VertexNormal var16 = this.vertexNormals[var2];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var3];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var4];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
            } else if (var15 == 1) {
               if (this.faceNormals == null) {
                  this.faceNormals = new FaceNormal[this.faceCount];
               }

               FaceNormal var23 = this.faceNormals[var17] = new FaceNormal();
               var23.x = var11 * 999846063;
               var23.y = var12 * 1104023811;
               var23.z = var13 * -1994033;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bf")
   static final int method6025(int var0, int var1) {
      var1 = var1 * (var0 & 1249995952) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & -835710504) + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("nd")
   public static void method6093(ModelData var0) {
      if (!var0.isBoundsCalculated) {
         var0.height = 0;
         var0.field3130 = 0;
         var0.field3127 = 999999;
         var0.field3128 = -999999;
         var0.field3126 = 1520930332;
         var0.field3129 = 99999;

         for (int var1 = 0; var1 < var0.verticesCount; var1++) {
            int var2 = (int)var0.field3096[var1];
            int var3 = (int)var0.field3100[var1];
            int var4 = (int)var0.field3101[var1];
            if (var2 < var0.field3127) {
               var0.field3127 = var2;
            }

            if (var2 > var0.field3128) {
               var0.field3128 = var2;
            }

            if (var4 < var0.field3129) {
               var0.field3129 = var4;
            }

            if (var4 > var0.field3126) {
               var0.field3126 = var4;
            }

            if (-var3 > var0.height * -988016684) {
               var0.height = -var3 * -523552825;
            }

            if (var3 > var0.field3130) {
               var0.field3130 = var3;
            }
         }

         var0.isBoundsCalculated = true;
      }
   }

   public int[] getFaceIndices2() {
      return this.indices2;
   }

   public ModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.verticesCount = var1.verticesCount;
      this.faceCount = var1.faceCount;
      this.textureTriangleCount = var1.textureTriangleCount;
      if (var2) {
         this.field3096 = var1.field3096;
         this.field3100 = var1.field3100;
         this.field3101 = var1.field3101;
      } else {
         this.field3096 = new float[this.verticesCount];
         this.field3100 = new float[this.verticesCount];
         this.field3101 = new float[this.verticesCount];

         for (int var6 = 0; var6 < this.verticesCount; var6++) {
            this.field3096[var6] = var1.field3096[var6];
            this.field3100[var6] = var1.field3100[var6];
            this.field3101[var6] = var1.field3101[var6];
         }
      }

      if (var3) {
         this.texTriangleY = var1.texTriangleY;
      } else {
         this.texTriangleY = new short[this.faceCount];

         for (int var7 = 0; var7 < this.faceCount; var7++) {
            this.texTriangleY[var7] = var1.texTriangleY[var7];
         }
      }

      if (!var4 && var1.texTriangleZ != null) {
         this.texTriangleZ = new short[this.faceCount];

         for (int var8 = 0; var8 < this.faceCount; var8++) {
            this.texTriangleZ[var8] = var1.texTriangleZ[var8];
         }
      } else {
         this.texTriangleZ = var1.texTriangleZ;
      }

      if (var5) {
         this.faceAlphas = var1.faceAlphas;
      } else {
         this.faceAlphas = new byte[this.faceCount];
         if (var1.faceAlphas == null) {
            for (int var9 = 0; var9 < this.faceCount; var9++) {
               this.faceAlphas[var9] = 0;
            }
         } else {
            for (int var10 = 0; var10 < this.faceCount; var10++) {
               this.faceAlphas[var10] = var1.faceAlphas[var10];
            }
         }
      }

      this.indices1 = var1.indices1;
      this.indices2 = var1.indices2;
      this.indices3 = var1.indices3;
      this.faceRenderTypes = var1.faceRenderTypes;
      this.faceRenderPriorities = var1.faceRenderPriorities;
      this.textureCoords = var1.textureCoords;
      this.priority = var1.priority;
      this.textureRenderTypes = var1.textureRenderTypes;
      this.faceColors = var1.faceColors;
      this.faceTextures = var1.faceTextures;
      this.texTriangleX = var1.texTriangleX;
      this.vertexSkins = var1.vertexSkins;
      this.faceSkins = var1.faceSkins;
      this.vertexLabels = var1.vertexLabels;
      this.faceLabelsAlpha = var1.faceLabelsAlpha;
      this.vertexNormals = var1.vertexNormals;
      this.faceNormals = var1.faceNormals;
      this.vertexVertices = var1.vertexVertices;
      this.field3095 = var1.field3095;
      this.field3105 = var1.field3105;
      this.ambient = var1.ambient;
      this.contrast = var1.contrast;
      this.field3089 = var1.field3089;
   }

   @ObfuscatedSignature(descriptor = "()[Lke;")
   @ObfuscatedName("ip")
   public VertexNormal[] method6131() {
      return this.vertexNormals;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dy")
   public void method6075() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3101[var1] = -((int)this.field3101[var1]);
      }

      for (int var3 = 0; var3 < this.faceCount; var3++) {
         int var2 = this.indices1[var3];
         this.indices1[var3] = this.indices3[var3];
         this.indices3[var3] = var2;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("uf")
   public byte[] method6132() {
      return this.textureCoords;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("db")
   public void method6076() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         this.field3101[var1] = -((int)this.field3101[var1]);
      }

      for (int var3 = 0; var3 < this.faceCount; var3++) {
         int var2 = this.indices1[var3];
         this.indices1[var3] = this.indices3[var3];
         this.indices3[var3] = var2;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cv")
   public void method6063(int var1) {
      int var2 = ModelData_sine[var1];
      int var3 = ModelData_cosine[var1];

      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         int var5 = (int)this.field3101[var4] * var2 + (int)this.field3096[var4] * var3 >> 16;
         this.field3101[var4] = (int)this.field3101[var4] * var3 - (int)this.field3096[var4] * var2 >> 16;
         this.field3096[var4] = var5;
      }

      this.method6087();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;III)V")
   @ObfuscatedName("fi")
   public static void method6066(ModelData var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method6139();
      }

      for (int var4 = 0; var4 < var0.verticesCount; var4++) {
         var0.field3096[var4] = (int)var0.field3096[var4] + var1;
         var0.field3100[var4] = (int)var0.field3100[var4] + var2;
         var0.field3101[var4] = (int)var0.field3101[var4] + var3;
      }

      var0.method6087();
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dh")
   public void method6081(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.verticesCount; var4++) {
         this.field3096[var4] = (int)this.field3096[var4] * var1 / 128;
         this.field3100[var4] = (int)this.field3100[var4] * var2 / 128;
         this.field3101[var4] = (int)this.field3101[var4] * var3 / 128;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "(Ljm;I)I")
   @ObfuscatedName("ck")
   final int method6047(ModelData var1, int var2) {
      int var3 = -1;
      int var4 = (int)var1.field3096[var2];
      int var5 = (int)var1.field3100[var2];
      int var6 = (int)var1.field3101[var2];

      for (int var7 = 0; var7 < this.verticesCount; var7++) {
         if (var4 == (int)this.field3096[var7] && var5 == (int)this.field3100[var7] && var6 == (int)this.field3101[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field3096[this.verticesCount] = var4;
         this.field3100[this.verticesCount] = var5;
         this.field3101[this.verticesCount] = var6;
         if (var1.vertexSkins != null) {
            this.vertexSkins[this.verticesCount] = var1.vertexSkins[var2];
         }

         if (var1.field3095 != null) {
            this.field3095[this.verticesCount] = var1.field3095[var2];
            this.field3105[this.verticesCount] = var1.field3105[var2];
         }

         var3 = this.verticesCount++;
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;[B)V")
   @ObfuscatedName("hk")
   public static void method6039(ModelData var0, byte[] var1) {
      if (var0 == null) {
         var0.rotateY270Ccw();
      }

      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * 1741769013;
      int var9 = Buffer.method12008(var2, (byte)5);
      int var10 = Buffer.method12008(var2, (byte)5);
      int var11 = var2.readUnsignedByte(336721050);
      int var12 = var2.readUnsignedByte(-489299805);
      int var13 = var2.readUnsignedByte(1718182341);
      int var14 = var2.readUnsignedByte(-1431025330);
      int var15 = var2.readUnsignedByte(1890726623);
      int var16 = var2.readUnsignedByte(887989718);
      int var17 = var2.readUnsignedByte(-1164444593);
      int var18 = Buffer.method12008(var2, (byte)5);
      int var19 = Buffer.method12008(var2, (byte)5);
      int var20 = Buffer.method12008(var2, (byte)5);
      int var21 = Buffer.method12008(var2, (byte)5);
      int var22 = Buffer.method12008(var2, (byte)5);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         var0.textureRenderTypes = new byte[var11];
         var2.offset = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = var0.textureRenderTypes[var26] = Buffer.method12001(var2, (byte)60);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var58 = var11 + var9;
      int var28 = var58;
      if (var12 == 1) {
         var58 += var10;
      }

      var58 += var10;
      int var30 = var58;
      if (var13 == 255) {
         var58 += var10;
      }

      int var31 = var58;
      if (var15 == 1) {
         var58 += var10;
      }

      int var32 = var58;
      if (var17 == 1) {
         var58 += var9;
      }

      int var33 = var58;
      if (var14 == 1) {
         var58 += var10;
      }

      var58 += var21;
      int var35 = var58;
      if (var16 == 1) {
         var58 += var10 * 2;
      }

      var58 += var22;
      var58 += var10 * 2;
      var58 += var18;
      var58 += var19;
      var58 += var20;
      var58 += var23 * 6;
      var58 += var24 * 6;
      var58 += var24 * 6;
      var58 += var24 * 2;
      var58 += var24;
      var58 += var24 * 2 + var25 * 2;
      var0.verticesCount = var9;
      var0.faceCount = var10;
      var0.textureTriangleCount = var11;
      var0.field3096 = new float[var9];
      var0.field3100 = new float[var9];
      var0.field3101 = new float[var9];
      var0.indices1 = new int[var10];
      var0.indices2 = new int[var10];
      var0.indices3 = new int[var10];
      if (var17 == 1) {
         var0.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         var0.faceRenderTypes = new byte[var10];
      }

      if (var13 == 255) {
         var0.faceRenderPriorities = new byte[var10];
      } else {
         var0.priority = (byte)var13;
      }

      if (var14 == 1) {
         var0.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         var0.faceSkins = new int[var10];
      }

      if (var16 == 1) {
         var0.texTriangleZ = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         var0.textureCoords = new byte[var10];
      }

      var0.texTriangleY = new short[var10];
      if (var11 > 0) {
         var0.faceColors = new short[var11];
         var0.faceTextures = new short[var11];
         var0.texTriangleX = new short[var11];
      }

      var2.offset = var11 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 1741769013;
      var6.offset = var32 * 1741769013;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      for (int var51 = 0; var51 < var9; var51++) {
         int var52 = var2.readUnsignedByte(-1339395969);
         int var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.readShortSmart(1709959073);
         }

         int var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.readShortSmart(-871663378);
         }

         int var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.readShortSmart(-485014319);
         }

         var0.field3096[var51] = var48 + var53;
         var0.field3100[var51] = var49 + var54;
         var0.field3101[var51] = var50 + var55;
         var48 = (int)var0.field3096[var51];
         var49 = (int)var0.field3100[var51];
         var50 = (int)var0.field3101[var51];
         if (var17 == 1) {
            var0.vertexSkins[var51] = var6.readUnsignedByte(-579009757);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var28 * 1741769013;
      var4.offset = var30 * 1741769013;
      var5.offset = var33 * 1741769013;
      var6.offset = var31 * 1741769013;
      var7.offset = var35 * 1741769013;
      var8.offset = var58 * 1741769013;

      for (int var72 = 0; var72 < var10; var72++) {
         var0.texTriangleY[var72] = (short)Buffer.method12008(var2, (byte)5);
         if (var12 == 1) {
            var0.faceRenderTypes[var72] = Buffer.method12001(var3, (byte)9);
         }

         if (var13 == 255) {
            var0.faceRenderPriorities[var72] = Buffer.method12001(var4, (byte)100);
         }

         if (var14 == 1) {
            var0.faceAlphas[var72] = Buffer.method12001(var5, (byte)61);
         }

         if (var15 == 1) {
            var0.faceSkins[var72] = var6.readUnsignedByte(-386680192);
         }

         if (var16 == 1) {
            var0.texTriangleZ[var72] = (short)(Buffer.method12008(var7, (byte)5) - 1);
         }

         if (var0.textureCoords != null && var0.texTriangleZ[var72] != -1) {
            var0.textureCoords[var72] = (byte)(var8.readUnsignedByte(57153241) - 1);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * 1741769013;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;

      for (int var77 = 0; var77 < var10; var77++) {
         int var56 = var3.readUnsignedByte(1018936079);
         if (var56 == 1) {
            var73 = var2.readShortSmart(-1966685719) + var76;
            var74 = var2.readShortSmart(-2108976709) + var73;
            var75 = var2.readShortSmart(-2054818507) + var74;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 2) {
            var74 = var75;
            var75 = var2.readShortSmart(-175798903) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 3) {
            var73 = var75;
            var75 = var2.readShortSmart(-1820466662) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var74;
            var0.indices3[var77] = var75;
         }

         if (var56 == 4) {
            int var57 = var73;
            var73 = var74;
            var74 = var57;
            var75 = var2.readShortSmart(106759430) + var76;
            var76 = var75;
            var0.indices1[var77] = var73;
            var0.indices2[var77] = var57;
            var0.indices3[var77] = var75;
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 1741769013;
      var6.offset = var58 * 1741769013;
      var7.offset = var58 * 1741769013;

      for (int var78 = 0; var78 < var11; var78++) {
         int var80 = var0.textureRenderTypes[var78] & 255;
         if (var80 == 0) {
            var0.faceColors[var78] = (short)Buffer.method12008(var2, (byte)5);
            var0.faceTextures[var78] = (short)Buffer.method12008(var2, (byte)5);
            var0.texTriangleX[var78] = (short)Buffer.method12008(var2, (byte)5);
         }
      }

      var2.offset = var58 * 1741769013;
      int var79 = var2.readUnsignedByte(2008564599);
      if (var79 != 0) {
         new ModelData0();
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12015(var2, 233278308);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   public void method6055() {
      for (int var1 = 0; var1 < this.verticesCount; var1++) {
         int var2 = (int)this.field3096[var1];
         this.field3096[var1] = this.field3101[var1];
         this.field3101[var1] = -var2;
      }

      this.method6087();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dl")
   public void method6084() {
      if (this.vertexNormals == null) {
         this.vertexNormals = new VertexNormal[this.verticesCount];

         for (int var1 = 0; var1 < this.verticesCount; var1++) {
            this.vertexNormals[var1] = new VertexNormal();
         }

         for (int var17 = 0; var17 < this.faceCount; var17++) {
            int var2 = this.indices1[var17];
            int var3 = this.indices2[var17];
            int var4 = this.indices3[var17];
            int var5 = (int)this.field3096[var3] - (int)this.field3096[var2];
            int var6 = (int)this.field3100[var3] - (int)this.field3100[var2];
            int var7 = (int)this.field3101[var3] - (int)this.field3101[var2];
            int var8 = (int)this.field3096[var4] - (int)this.field3096[var2];
            int var9 = (int)this.field3100[var4] - (int)this.field3100[var2];
            int var10 = (int)this.field3101[var4] - (int)this.field3101[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.faceRenderTypes == null) {
               var15 = 0;
            } else {
               var15 = this.faceRenderTypes[var17];
            }

            if (var15 == 0) {
               VertexNormal var16 = this.vertexNormals[var2];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var3];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var4];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
            } else if (var15 == 1) {
               if (this.faceNormals == null) {
                  this.faceNormals = new FaceNormal[this.faceCount];
               }

               FaceNormal var23 = this.faceNormals[var17] = new FaceNormal();
               var23.x = var11 * 999846063;
               var23.y = var12 * 1104023811;
               var23.z = var13 * -1994033;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dr")
   public void method6085() {
      if (this.vertexNormals == null) {
         this.vertexNormals = new VertexNormal[this.verticesCount];

         for (int var1 = 0; var1 < this.verticesCount; var1++) {
            this.vertexNormals[var1] = new VertexNormal();
         }

         for (int var17 = 0; var17 < this.faceCount; var17++) {
            int var2 = this.indices1[var17];
            int var3 = this.indices2[var17];
            int var4 = this.indices3[var17];
            int var5 = (int)this.field3096[var3] - (int)this.field3096[var2];
            int var6 = (int)this.field3100[var3] - (int)this.field3100[var2];
            int var7 = (int)this.field3101[var3] - (int)this.field3101[var2];
            int var8 = (int)this.field3096[var4] - (int)this.field3096[var2];
            int var9 = (int)this.field3100[var4] - (int)this.field3100[var2];
            int var10 = (int)this.field3101[var4] - (int)this.field3101[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.faceRenderTypes == null) {
               var15 = 0;
            } else {
               var15 = this.faceRenderTypes[var17];
            }

            if (var15 == 0) {
               VertexNormal var16 = this.vertexNormals[var2];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var3];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var4];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
            } else if (var15 == 1) {
               if (this.faceNormals == null) {
                  this.faceNormals = new FaceNormal[this.faceCount];
               }

               FaceNormal var23 = this.faceNormals[var17] = new FaceNormal();
               var23.x = var11 * 999846063;
               var23.y = var12 * 1104023811;
               var23.z = var13 * -1994033;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dx")
   public void method6086() {
      if (this.vertexNormals == null) {
         this.vertexNormals = new VertexNormal[this.verticesCount];

         for (int var1 = 0; var1 < this.verticesCount; var1++) {
            this.vertexNormals[var1] = new VertexNormal();
         }

         for (int var17 = 0; var17 < this.faceCount; var17++) {
            int var2 = this.indices1[var17];
            int var3 = this.indices2[var17];
            int var4 = this.indices3[var17];
            int var5 = (int)this.field3096[var3] - (int)this.field3096[var2];
            int var6 = (int)this.field3100[var3] - (int)this.field3100[var2];
            int var7 = (int)this.field3101[var3] - (int)this.field3101[var2];
            int var8 = (int)this.field3096[var4] - (int)this.field3096[var2];
            int var9 = (int)this.field3100[var4] - (int)this.field3100[var2];
            int var10 = (int)this.field3101[var4] - (int)this.field3101[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 1690101493 || var12 > -1293246790 || var13 > -1054206183 || var11 < -8192 || var12 < -222336225 || var13 < -488985819;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * -944565295 / var14;
            byte var15;
            if (this.faceRenderTypes == null) {
               var15 = 0;
            } else {
               var15 = this.faceRenderTypes[var17];
            }

            if (var15 == 0) {
               VertexNormal var16 = this.vertexNormals[var2];
               var16.x += var11 * 997298125;
               var16.y += var12 * -457283729;
               var16.z += var13 * 1601946799;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var3];
               var16.x += var11 * 343785435;
               var16.y += var12 * -457283729;
               var16.z += var13 * -1564312937;
               var16.magnitude += -938775001;
               var16 = this.vertexNormals[var4];
               var16.x += var11 * 1287807818;
               var16.y += var12 * -719927629;
               var16.z += var13 * 1601946799;
               var16.magnitude += -1351039972;
            } else if (var15 == 1) {
               if (this.faceNormals == null) {
                  this.faceNormals = new FaceNormal[this.faceCount];
               }

               FaceNormal var23 = this.faceNormals[var17] = new FaceNormal();
               var23.x = var11 * 999846063;
               var23.y = var12 * 1104023811;
               var23.z = var13 * -1994033;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dq")
   void method6088() {
      this.vertexNormals = null;
      this.vertexVertices = null;
      this.faceNormals = null;
      this.isBoundsCalculated = false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;I)V")
   @ObfuscatedName("jw")
   public static void method6064(ModelData var0, int var1) {
      if (var0 == null) {
         var0.method6085();
      } else {
         int var2 = ModelData_sine[var1];
         int var3 = ModelData_cosine[var1];

         for (int var4 = 0; var4 < var0.verticesCount; var4++) {
            int var5 = (int)var0.field3101[var4] * var2 + (int)var0.field3096[var4] * var3 >> 16;
            var0.field3101[var4] = (int)var0.field3101[var4] * var3 - (int)var0.field3096[var4] * var2 >> 16;
            var0.field3096[var4] = var5;
         }

         var0.method6087();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("du")
   void method6089() {
      this.vertexNormals = null;
      this.vertexVertices = null;
      this.faceNormals = null;
      this.isBoundsCalculated = false;
   }

   public byte[] getFaceTransparencies() {
      return this.faceAlphas;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dm")
   void method6090() {
      this.vertexNormals = null;
      this.vertexVertices = null;
      this.faceNormals = null;
      this.isBoundsCalculated = false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;[[IIIIZI)Ljm;")
   @ObfuscatedName("uj")
   public static ModelData method6050(ModelData var0, int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      if (var0 == null) {
         var0.method6132();
      }

      method6092(var0);
      int var7 = var2 + var0.field3127;
      int var8 = var2 + var0.field3128;
      int var9 = var4 + var0.field3129;
      int var10 = var4 + var0.field3126;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return var0;
         } else {
            ModelData var11;
            if (var5) {
               var11 = new ModelData(var0, true, true, true, true);
               var11.field3100 = new float[var11.verticesCount];
            } else {
               var11 = var0;
            }

            if (var6 == 0) {
               for (int var12 = 0; var12 < var11.verticesCount; var12++) {
                  int var13 = (int)var0.field3096[var12] + var2;
                  int var14 = (int)var0.field3101[var12] + var4;
                  int var15 = var13 & 127;
                  int var16 = var14 & 127;
                  int var17 = var13 >> 7;
                  int var18 = var14 >> 7;
                  int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field3100[var12] = (int)var0.field3100[var12] + var21 - var3;
               }
            } else {
               for (int var27 = 0; var27 < var11.verticesCount; var27++) {
                  int var28 = (-((int)var0.field3100[var27]) << 16) / (var0.height * -1272589951);
                  if (var28 < var6) {
                     int var29 = (int)var0.field3096[var27] + var2;
                     int var30 = (int)var0.field3101[var27] + var4;
                     int var31 = var29 & 127;
                     int var32 = var30 & 127;
                     int var33 = var29 >> 7;
                     int var34 = var30 >> 7;
                     int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
                     int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
                     int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
                     var11.field3100[var27] = (int)var0.field3100[var27] + (var22 - var3) * (var6 - var28) / var6;
                  } else {
                     var11.field3100[var27] = var0.field3100[var27];
                  }
               }
            }

            var11.method6087();
            return var11;
         }
      } else {
         return var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Lky;")
   @ObfuscatedName("ds")
   public final Model method6096(int var1, int var2, int var3, int var4, int var5) {
      this.calculateVertexNormals();
      int var6 = (int)Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
      int var7 = var2 * var6 >> 8;
      Model var8 = new Model();
      var8.faceColors1 = new int[this.faceCount];
      var8.faceColors2 = new int[this.faceCount];
      var8.faceColors3 = new int[this.faceCount];
      if (this.textureTriangleCount > 0 && this.textureCoords != null) {
         int[] var9 = new int[this.textureTriangleCount];

         for (int var10 = 0; var10 < this.faceCount; var10++) {
            if (this.textureCoords[var10] != -1) {
               var9[this.textureCoords[var10] & 255]++;
            }
         }

         var8.texIndicesCount = 0;

         for (int var17 = 0; var17 < this.textureTriangleCount; var17++) {
            if (var9[var17] > 0 && this.textureRenderTypes[var17] == 0) {
               var8.texIndicesCount++;
            }
         }

         var8.texIndices1 = new int[var8.texIndicesCount];
         var8.texIndices2 = new int[var8.texIndicesCount];
         var8.texIndices3 = new int[var8.texIndicesCount];
         int var18 = 0;

         for (int var11 = 0; var11 < this.textureTriangleCount; var11++) {
            if (var9[var11] > 0 && this.textureRenderTypes[var11] == 0) {
               var8.texIndices1[var18] = this.faceColors[var11] & '\uffff';
               var8.texIndices2[var18] = this.faceTextures[var11] & '\uffff';
               var8.texIndices3[var18] = this.texTriangleX[var11] & '\uffff';
               var9[var11] = var18++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.textureFaces = new byte[this.faceCount];

         for (int var20 = 0; var20 < this.faceCount; var20++) {
            if (this.textureCoords[var20] != -1) {
               var8.textureFaces[var20] = (byte)var9[this.textureCoords[var20] & -1406227241];
            } else {
               var8.textureFaces[var20] = -1;
            }
         }
      }

      for (int var16 = 0; var16 < this.faceCount; var16++) {
         byte var19;
         if (this.faceRenderTypes == null) {
            var19 = 0;
         } else {
            var19 = this.faceRenderTypes[var16];
         }

         byte var21;
         if (this.faceAlphas == null) {
            var21 = 0;
         } else {
            var21 = this.faceAlphas[var16];
         }

         short var12;
         if (this.texTriangleZ == null) {
            var12 = -1;
         } else {
            var12 = this.texTriangleZ[var16];
         }

         if (var21 == -960042858) {
            var19 = 3;
         }

         if (var21 == -1) {
            var19 = 2;
         }

         if (var12 == -1) {
            if (var19 == 0) {
               int var15 = this.texTriangleY[var16] & '\uffff';
               VertexNormal var13;
               if (this.vertexVertices != null && this.vertexVertices[this.indices1[var16]] != null) {
                  var13 = this.vertexVertices[this.indices1[var16]];
               } else {
                  var13 = this.vertexNormals[this.indices1[var16]];
               }

               int var14 = var1
                  + (var3 * var13.x * 937731994 + var4 * var13.y * -1094963644 + var5 * var13.z * 1294340687) / (var7 * var13.magnitude * -1816599189);
               var8.faceColors1[var16] = method6023(var15, var14);
               if (this.vertexVertices != null && this.vertexVertices[this.indices2[var16]] != null) {
                  var13 = this.vertexVertices[this.indices2[var16]];
               } else {
                  var13 = this.vertexNormals[this.indices2[var16]];
               }

               var14 = var1 + (var3 * var13.x * -54805943 + var4 * var13.y * 1754978191 + var5 * var13.z * 1294340687) / (var7 * var13.magnitude * 802759063);
               var8.faceColors2[var16] = method6023(var15, var14);
               if (this.vertexVertices != null && this.vertexVertices[this.indices3[var16]] != null) {
                  var13 = this.vertexVertices[this.indices3[var16]];
               } else {
                  var13 = this.vertexNormals[this.indices3[var16]];
               }

               var14 = var1 + (var3 * var13.x * -1197027357 + var4 * var13.y * -659201780 + var5 * var13.z * -287517073) / (var7 * var13.magnitude * 802759063);
               var8.faceColors3[var16] = method6023(var15, var14);
            } else if (var19 == 1) {
               FaceNormal var24 = this.faceNormals[var16];
               int var31 = var1 + (var3 * var24.x * -1027021233 + var4 * var24.y * -916325224 + var5 * var24.z * 1358705711) / (var7 + var7 / 2);
               var8.faceColors1[var16] = method6023(this.texTriangleY[var16] & 1680521873, var31);
               var8.faceColors3[var16] = -1;
            } else if (var19 == 3) {
               var8.faceColors1[var16] = 1560987667;
               var8.faceColors3[var16] = -1;
            } else {
               var8.faceColors3[var16] = -2;
            }
         } else if (var19 == 0) {
            VertexNormal var25;
            if (this.vertexVertices != null && this.vertexVertices[this.indices1[var16]] != null) {
               var25 = this.vertexVertices[this.indices1[var16]];
            } else {
               var25 = this.vertexNormals[this.indices1[var16]];
            }

            int var32 = var1 + (var3 * var25.x * 183912965 + var4 * var25.y * 1754978191 + var5 * var25.z * -509268761) / (var7 * var25.magnitude * 1036886525);
            var8.faceColors1[var16] = method6026(var32);
            if (this.vertexVertices != null && this.vertexVertices[this.indices2[var16]] != null) {
               var25 = this.vertexVertices[this.indices2[var16]];
            } else {
               var25 = this.vertexNormals[this.indices2[var16]];
            }

            var32 = var1 + (var3 * var25.x * 97383685 + var4 * var25.y * 1754978191 + var5 * var25.z * 1550748258) / (var7 * var25.magnitude * 1556642359);
            var8.faceColors2[var16] = method6026(var32);
            if (this.vertexVertices != null && this.vertexVertices[this.indices3[var16]] != null) {
               var25 = this.vertexVertices[this.indices3[var16]];
            } else {
               var25 = this.vertexNormals[this.indices3[var16]];
            }

            var32 = var1 + (var3 * var25.x * 97383685 + var4 * var25.y * 1754978191 + var5 * var25.z * 945016666) / (var7 * var25.magnitude * -785089789);
            var8.faceColors3[var16] = method6026(var32);
         } else if (var19 == 1) {
            FaceNormal var28 = this.faceNormals[var16];
            int var35 = var1 + (var3 * var28.x * -1027021233 + var4 * var28.y * -976363093 + var5 * var28.z * 1510425026) / (var7 + var7 / 2);
            var8.faceColors1[var16] = method6026(var35);
            var8.faceColors3[var16] = -1;
         } else {
            var8.faceColors3[var16] = -2;
         }
      }

      method6052(this);
      var8.verticesCount = this.verticesCount;
      var8.field3501 = this.field3096;
      var8.field3507 = this.field3100;
      var8.field3503 = this.field3101;
      var8.indicesCount = this.faceCount;
      var8.indices1 = this.indices1;
      var8.indices2 = this.indices2;
      var8.indices3 = this.indices3;
      var8.faceRenderPriorities = this.faceRenderPriorities;
      var8.faceAlphas = this.faceAlphas;
      var8.field3502 = this.priority;
      var8.faceLabelsAlpha = this.vertexLabels;
      var8.field3518 = this.faceLabelsAlpha;
      var8.faceTextures = this.texTriangleZ;
      var8.vertexLabels = this.field3095;
      var8.field3581 = this.field3105;
      var8.faceBias = this.field3089;
      return var8;
   }

   @ObfuscatedSignature(descriptor = "(SS)Ljm;")
   @ObfuscatedName("wi")
   public ModelData method6133(short var1, short var2) {
      method6071(this, var1, var2);
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("uz")
   public ModelData method6110() {
      return this.method6115(false);
   }

   @ObfuscatedSignature(descriptor = "()[Lke;")
   @ObfuscatedName("to")
   public VertexNormal[] method6134() {
      return this.vertexVertices;
   }

   @ObfuscatedSignature(descriptor = "(Ljm;[B)V")
   @ObfuscatedName("kf")
   public static void method6029(ModelData var0, byte[] var1) {
      if (var0 == null) {
         var0.method6040(var1);
      }

      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 26) * 1741769013;
      int var9 = Buffer.method12008(var2, (byte)5);
      int var10 = Buffer.method12008(var2, (byte)5);
      int var11 = var2.readUnsignedByte(96336390);
      int var12 = var2.readUnsignedByte(-1410558745);
      int var13 = var2.readUnsignedByte(-1316481694);
      int var14 = var2.readUnsignedByte(34756096);
      int var15 = var2.readUnsignedByte(-1561214300);
      int var16 = var2.readUnsignedByte(985651008);
      int var17 = var2.readUnsignedByte(-1202155707);
      int var18 = var2.readUnsignedByte(1775991622);
      int var19 = Buffer.method12008(var2, (byte)5);
      int var20 = Buffer.method12008(var2, (byte)5);
      int var21 = Buffer.method12008(var2, (byte)5);
      int var22 = Buffer.method12008(var2, (byte)5);
      int var23 = Buffer.method12008(var2, (byte)5);
      int var24 = Buffer.method12008(var2, (byte)5);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      if (var11 > 0) {
         var0.textureRenderTypes = new byte[var11];
         var2.offset = 0;

         for (int var28 = 0; var28 < var11; var28++) {
            byte var29 = var0.textureRenderTypes[var28] = Buffer.method12001(var2, (byte)98);
            if (var29 == 0) {
               var25++;
            }

            if (var29 >= 1 && var29 <= 3) {
               var26++;
            }

            if (var29 == 2) {
               var27++;
            }
         }
      }

      int var60 = var11 + var9;
      int var30 = var60;
      if (var12 == 1) {
         var60 += var10;
      }

      var60 += var10;
      int var32 = var60;
      if (var13 == 255) {
         var60 += var10;
      }

      int var33 = var60;
      if (var15 == 1) {
         var60 += var10;
      }

      var60 += var24;
      int var35 = var60;
      if (var14 == 1) {
         var60 += var10;
      }

      var60 += var22;
      int var37 = var60;
      if (var16 == 1) {
         var60 += var10 * 2;
      }

      var60 += var23;
      var60 += var10 * 2;
      var60 += var19;
      var60 += var20;
      var60 += var21;
      var60 += var25 * 6;
      var60 += var26 * 6;
      var60 += var26 * 6;
      var60 += var26 * 2;
      var60 += var26;
      var60 += var26 * 2 + var27 * 2;
      var0.verticesCount = var9;
      var0.faceCount = var10;
      var0.textureTriangleCount = var11;
      var0.field3096 = new float[var9];
      var0.field3100 = new float[var9];
      var0.field3101 = new float[var9];
      var0.indices1 = new int[var10];
      var0.indices2 = new int[var10];
      var0.indices3 = new int[var10];
      if (var17 == 1) {
         var0.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         var0.faceRenderTypes = new byte[var10];
      }

      if (var13 == 255) {
         var0.faceRenderPriorities = new byte[var10];
      } else {
         var0.priority = (byte)var13;
      }

      if (var14 == 1) {
         var0.faceAlphas = new byte[var10];
      }

      if (var15 == 1) {
         var0.faceSkins = new int[var10];
      }

      if (var16 == 1) {
         var0.texTriangleZ = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         var0.textureCoords = new byte[var10];
      }

      if (var18 == 1) {
         var0.field3095 = new int[var9][];
         var0.field3105 = new int[var9][];
      }

      var0.texTriangleY = new short[var10];
      if (var11 > 0) {
         var0.faceColors = new short[var11];
         var0.faceTextures = new short[var11];
         var0.texTriangleX = new short[var11];
      }

      var2.offset = var11 * 1741769013;
      var3.offset = var60 * 1741769013;
      var4.offset = var60 * 1741769013;
      var5.offset = var60 * 1741769013;
      var6.offset = var60 * 1741769013;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      for (int var53 = 0; var53 < var9; var53++) {
         int var54 = var2.readUnsignedByte(-1396118156);
         int var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.readShortSmart(-2013527622);
         }

         int var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.readShortSmart(-65233649);
         }

         int var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.readShortSmart(679745300);
         }

         var0.field3096[var53] = var50 + var55;
         var0.field3100[var53] = var51 + var56;
         var0.field3101[var53] = var52 + var57;
         var50 = (int)var0.field3096[var53];
         var51 = (int)var0.field3100[var53];
         var52 = (int)var0.field3101[var53];
         if (var17 == 1) {
            var0.vertexSkins[var53] = var6.readUnsignedByte(-89267513);
         }
      }

      if (var18 == 1) {
         for (int var75 = 0; var75 < var9; var75++) {
            int var78 = var6.readUnsignedByte(178998634);
            var0.field3095[var75] = new int[var78];
            var0.field3105[var75] = new int[var78];

            for (int var80 = 0; var80 < var78; var80++) {
               var0.field3095[var75][var80] = var6.readUnsignedByte(-1411601717);
               var0.field3105[var75][var80] = var6.readUnsignedByte(1856211880);
            }
         }
      }

      var2.offset = var60 * 1741769013;
      var3.offset = var30 * 1741769013;
      var4.offset = var32 * 1741769013;
      var5.offset = var35 * 1741769013;
      var6.offset = var33 * 1741769013;
      var7.offset = var37 * 1741769013;
      var8.offset = var60 * 1741769013;

      for (int var76 = 0; var76 < var10; var76++) {
         var0.texTriangleY[var76] = (short)Buffer.method12008(var2, (byte)5);
         if (var12 == 1) {
            var0.faceRenderTypes[var76] = Buffer.method12001(var3, (byte)44);
         }

         if (var13 == 255) {
            var0.faceRenderPriorities[var76] = Buffer.method12001(var4, (byte)92);
         }

         if (var14 == 1) {
            var0.faceAlphas[var76] = Buffer.method12001(var5, (byte)92);
         }

         if (var15 == 1) {
            var0.faceSkins[var76] = var6.readUnsignedByte(-539589367);
         }

         if (var16 == 1) {
            var0.texTriangleZ[var76] = (short)(Buffer.method12008(var7, (byte)5) - 1);
         }

         if (var0.textureCoords != null && var0.texTriangleZ[var76] != -1) {
            var0.textureCoords[var76] = (byte)(var8.readUnsignedByte(-1279360406) - 1);
         }
      }

      var2.offset = var60 * 1741769013;
      var3.offset = var60 * 1741769013;
      int var77 = 0;
      int var79 = 0;
      int var81 = 0;
      int var82 = 0;

      for (int var83 = 0; var83 < var10; var83++) {
         int var58 = var3.readUnsignedByte(-279583018);
         if (var58 == 1) {
            var77 = var2.readShortSmart(-210360738) + var82;
            var79 = var2.readShortSmart(601768719) + var77;
            var81 = var2.readShortSmart(-636769403) + var79;
            var82 = var81;
            var0.indices1[var83] = var77;
            var0.indices2[var83] = var79;
            var0.indices3[var83] = var81;
         }

         if (var58 == 2) {
            var79 = var81;
            var81 = var2.readShortSmart(-2089913285) + var82;
            var82 = var81;
            var0.indices1[var83] = var77;
            var0.indices2[var83] = var79;
            var0.indices3[var83] = var81;
         }

         if (var58 == 3) {
            var77 = var81;
            var81 = var2.readShortSmart(-911109787) + var82;
            var82 = var81;
            var0.indices1[var83] = var77;
            var0.indices2[var83] = var79;
            var0.indices3[var83] = var81;
         }

         if (var58 == 4) {
            int var59 = var77;
            var77 = var79;
            var79 = var59;
            var81 = var2.readShortSmart(-1237779978) + var82;
            var82 = var81;
            var0.indices1[var83] = var77;
            var0.indices2[var83] = var59;
            var0.indices3[var83] = var81;
         }
      }

      var2.offset = var60 * 1741769013;
      var3.offset = var60 * 1741769013;
      var4.offset = var60 * 1741769013;
      var5.offset = var60 * 1741769013;
      var6.offset = var60 * 1741769013;
      var7.offset = var60 * 1741769013;

      for (int var84 = 0; var84 < var11; var84++) {
         int var86 = var0.textureRenderTypes[var84] & 255;
         if (var86 == 0) {
            var0.faceColors[var84] = (short)Buffer.method12008(var2, (byte)5);
            var0.faceTextures[var84] = (short)Buffer.method12008(var2, (byte)5);
            var0.texTriangleX[var84] = (short)Buffer.method12008(var2, (byte)5);
         }
      }

      var2.offset = var60 * 1741769013;
      int var85 = var2.readUnsignedByte(-214108173);
      if (var85 != 0) {
         new ModelData0();
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12015(var2, 1757396035);
      }

      boolean var87 = var2.readUnsignedByte(-1212893783) == 1;
      if (var87) {
         var0.field3089 = new byte[var10];

         for (int var88 = 0; var88 < var10; var88++) {
            var0.field3089[var88] = Buffer.method12001(var2, (byte)24);
         }
      }
   }

   public float[] getVerticesX() {
      return this.field3096;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("co")
   public void method6135() {
      this.calculateVertexNormals();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("hd")
   public static void method6077(ModelData var0) {
      for (int var1 = 0; var1 < var0.verticesCount; var1++) {
         var0.field3101[var1] = -((int)var0.field3101[var1]);
      }

      for (int var3 = 0; var3 < var0.faceCount; var3++) {
         int var2 = var0.indices1[var3];
         var0.indices1[var3] = var0.indices3[var3];
         var0.indices3[var3] = var2;
      }

      var0.method6087();
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("dk")
   public final Model method6101() {
      return method6106(this, 128, 43690, 0, -1, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bn")
   static final int method6027(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("aw")
   void method6040(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * 2021466426;
      int var9 = Buffer.method12008(var2, (byte)5);
      int var10 = Buffer.method12008(var2, (byte)5);
      int var11 = var2.method12075(1836566786);
      int var12 = var2.readShortSmart(-627728121);
      int var13 = var2.readUnsignedByte(-1186188833);
      int var14 = var2.readShortSmartSub(-69717519);
      int var15 = var2.readUnsignedByteNeg(343001640);
      int var16 = var2.method12097(-565081418);
      int var17 = var2.readSignedShort(1523511872);
      int var18 = Buffer.method12008(var2, (byte)5);
      int var19 = Buffer.method12008(var2, (byte)5);
      int var20 = Buffer.method12008(var2, (byte)5);
      int var21 = Buffer.method12008(var2, (byte)5);
      int var22 = Buffer.method12008(var2, (byte)5);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         this.field3089 = new byte[var11];
         var2.offset = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = this.textureRenderTypes[var26] = Buffer.method12001(var2, (byte)63);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var58 = var11 + var9;
      int var28 = var58;
      if (var12 == 1) {
         var58 += var10;
      }

      var58 += var10;
      int var30 = var58;
      if (var13 == 255) {
         var58 += var10;
      }

      int var31 = var58;
      if (var15 == 1) {
         var58 += var10;
      }

      int var32 = var58;
      if (var17 == 1) {
         var58 += var9;
      }

      int var33 = var58;
      if (var14 == 1) {
         var58 += var10;
      }

      var58 += var21;
      int var35 = var58;
      if (var16 == 1) {
         var58 += var10 * 2;
      }

      var58 += var22;
      var58 += var10 * 2;
      var58 += var18;
      var58 += var19;
      var58 += var20;
      var58 += var23 * 6;
      var58 += var24 * 6;
      var58 += var24 * 6;
      var58 += var24 * 2;
      var58 += var24;
      var58 += var24 * 2 + var25 * 2;
      this.textureTriangleCount = var9;
      this.field3130 = var10;
      this.field3128 = var11;
      this.field3100 = new float[var9];
      this.field3100 = new float[var9];
      this.field3101 = new float[var9];
      this.verticesX = new int[var10];
      this.verticesX = new int[var10];
      this.vertexSkins = new int[var10];
      if (var17 == 1) {
         this.indices1 = new int[var9];
      }

      if (var12 == 1) {
         this.textureCoords = new byte[var10];
      }

      if (var13 == 255) {
         this.field3089 = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.textureRenderTypes = new byte[var10];
      }

      if (var15 == 1) {
         this.indices1 = new int[var10];
      }

      if (var16 == 1) {
         this.faceTextures = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field3089 = new byte[var10];
      }

      this.texTriangleX = new short[var10];
      if (var11 > 0) {
         this.texTriangleY = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleY = new short[var11];
      }

      var2.offset = var11 * 1741769013;
      var3.offset = var58 * 1741769013;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * 603164308;
      var6.offset = var32 * 1741769013;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      for (int var51 = 0; var51 < var9; var51++) {
         int var52 = var2.readUnsignedByte(-1180030620);
         int var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.readUnsignedByteAdd(-934249600);
         }

         int var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.readUnsignedIntIME(-544056205);
         }

         int var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.readUnsignedByteNeg(-201239569);
         }

         this.field3096[var51] = var48 + var53;
         this.field3100[var51] = var49 + var54;
         this.field3096[var51] = var50 + var55;
         var48 = (int)this.field3101[var51];
         var49 = (int)this.field3101[var51];
         var50 = (int)this.field3100[var51];
         if (var17 == 1) {
            this.indices3[var51] = var6.readUnsignedByteNeg(1232350050);
         }
      }

      var2.offset = var58 * 1381483082;
      var3.offset = var28 * -1011180326;
      var4.offset = var30 * -1717652533;
      var5.offset = var33 * -1123244798;
      var6.offset = var31 * 1707333018;
      var7.offset = var35 * -102562699;
      var8.offset = var58 * 1741769013;

      for (int var72 = 0; var72 < var10; var72++) {
         this.faceColors[var72] = (short)Buffer.method12008(var2, (byte)5);
         if (var12 == 1) {
            this.textureCoords[var72] = Buffer.method12001(var3, (byte)84);
         }

         if (var13 == 255) {
            this.textureRenderTypes[var72] = Buffer.method12001(var4, (byte)101);
         }

         if (var14 == 1) {
            this.field3089[var72] = Buffer.method12001(var5, (byte)63);
         }

         if (var15 == 1) {
            this.faceSkins[var72] = var6.readLargeSmart(-189441936);
         }

         if (var16 == 1) {
            this.faceColors[var72] = (short)(Buffer.method12008(var7, (byte)5) - 1);
         }

         if (this.faceRenderPriorities != null && this.faceTextures[var72] != -1) {
            this.textureCoords[var72] = (byte)(var8.readUnsignedShortAdd(-34206252) - 1);
         }
      }

      var2.offset = var58 * 1741769013;
      var3.offset = var58 * -1488137457;
      int var73 = 0;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;

      for (int var77 = 0; var77 < var10; var77++) {
         int var56 = var3.method12181(726585430);
         if (var56 == 1) {
            var73 = var2.readMedium(504118820) + var76;
            var74 = var2.method12183(599328911) + var73;
            var75 = var2.readVarInt(1161217621) + var74;
            var76 = var75;
            this.verticesY[var77] = var73;
            this.indices2[var77] = var74;
            this.indices3[var77] = var75;
         }

         if (var56 == 2) {
            var74 = var75;
            var75 = var2.readUnsignedIntLE(1275291828) + var76;
            var76 = var75;
            this.indices2[var77] = var73;
            this.indices2[var77] = var74;
            this.vertexSkins[var77] = var75;
         }

         if (var56 == 3) {
            var73 = var75;
            var75 = var2.readShortSmart(-1970720177) + var76;
            var76 = var75;
            this.verticesZ[var77] = var73;
            this.verticesY[var77] = var74;
            this.indices2[var77] = var75;
         }

         if (var56 == 4) {
            int var57 = var73;
            var73 = var74;
            var74 = var57;
            var75 = var2.readUnsignedByteNeg(61041858) + var76;
            var76 = var75;
            this.verticesZ[var77] = var73;
            this.indices3[var77] = var57;
            this.verticesY[var77] = var75;
         }
      }

      var2.offset = var58 * -1657493756;
      var3.offset = var58 * -545357090;
      var4.offset = var58 * 1741769013;
      var5.offset = var58 * -1316408207;
      var6.offset = var58 * -1246918146;
      var7.offset = var58 * -318287711;

      for (int var78 = 0; var78 < var11; var78++) {
         int var80 = this.textureCoords[var78] & 255;
         if (var80 == 0) {
            this.texTriangleY[var78] = (short)Buffer.method12008(var2, (byte)5);
            this.faceColors[var78] = (short)Buffer.method12008(var2, (byte)5);
            this.faceColors[var78] = (short)Buffer.method12008(var2, (byte)5);
         }
      }

      var2.offset = var58 * -650680774;
      int var79 = var2.readShortLE(-1004925335);
      if (var79 != 0) {
         new ModelData0();
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12008(var2, (byte)5);
         Buffer.method12015(var2, 1410502571);
      }
   }

   @ObfuscatedSignature(descriptor = "(SS)Ljm;")
   @ObfuscatedName("it")
   public ModelData method6136(short var1, short var2) {
      this.recolor(var1, var2);
      return this;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ac")
   void method6034(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * 1741769013;
      int var9 = Buffer.method12008(var4, (byte)5);
      int var10 = Buffer.method12008(var4, (byte)5);
      int var11 = var4.readUnsignedByteAdd(-76501308);
      int var12 = var4.readLargeSmart(-832537999);
      int var13 = var4.readLargeSmart(655212435);
      int var14 = var4.readUnsignedIntLE(622385299);
      int var15 = var4.method12075(1025638825);
      int var16 = var4.method12100(1083683212);
      int var17 = var4.method12075(1496787786);
      int var18 = Buffer.method12008(var4, (byte)5);
      int var19 = Buffer.method12008(var4, (byte)5);
      int var20 = Buffer.method12008(var4, (byte)5);
      int var21 = Buffer.method12008(var4, (byte)5);
      int var22 = Buffer.method12008(var4, (byte)5);
      int var23 = 0;
      var23 += var9;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      var23 += var21;
      var23 += var10 * 2;
      var23 += var11 * 6;
      var23 += var18;
      var23 += var19;
      var23 += var20;
      this.field3129 = var9;
      this.field3127 = var10;
      this.field3129 = var11;
      this.field3096 = new float[var9];
      this.field3100 = new float[var9];
      this.field3100 = new float[var9];
      this.indices3 = new int[var10];
      this.faceSkins = new int[var10];
      this.verticesZ = new int[var10];
      if (var11 > 0) {
         this.faceRenderTypes = new byte[var11];
         this.texTriangleX = new short[var11];
         this.faceTextures = new short[var11];
         this.texTriangleY = new short[var11];
      }

      if (var16 == 1) {
         this.vertexSkins = new int[var9];
      }

      if (var12 == 1) {
         this.textureRenderTypes = new byte[var10];
         this.field3089 = new byte[var10];
         this.texTriangleY = new short[var10];
      }

      if (var13 == 255) {
         this.faceAlphas = new byte[var10];
      } else {
         this.priority = (byte)var13;
      }

      if (var14 == 1) {
         this.textureRenderTypes = new byte[var10];
      }

      if (var15 == 1) {
         this.indices2 = new int[var10];
      }

      if (var17 == 1) {
         this.field3105 = new int[var9][];
         this.faceLabelsAlpha = new int[var9][];
      }

      this.faceTextures = new short[var10];
      var4.offset = var23 * 1741769013;
      var5.offset = var23 * 1741769013;
      var6.offset = var23 * 1741769013;
      var7.offset = var23 * 1741769013;
      var8.offset = var23 * 1741769013;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      for (int var41 = 0; var41 < var9; var41++) {
         int var42 = var4.method12075(-1530619487);
         int var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.method12100(288103583);
         }

         int var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.readMedium(969023616);
         }

         int var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.readShortSmartSub(-100723690);
         }

         this.field3100[var41] = var38 + var43;
         this.field3100[var41] = var39 + var44;
         this.field3100[var41] = var40 + var45;
         var38 = (int)this.field3096[var41];
         var39 = (int)this.field3100[var41];
         var40 = (int)this.field3101[var41];
         if (var16 == 1) {
            this.faceSkins[var41] = var8.method12075(-484875655);
         }
      }

      if (var17 == 1) {
         for (int var58 = 0; var58 < var9; var58++) {
            int var61 = var8.readUnsignedIntLE(1043040065);
            this.vertexLabels[var58] = new int[var61];
            this.faceLabelsAlpha[var58] = new int[var61];

            for (int var64 = 0; var64 < var61; var64++) {
               this.vertexLabels[var58][var64] = var8.readShortSmartSub(1049664313);
               this.field3095[var58][var64] = var8.readUnsignedByte(112226855);
            }
         }
      }

      var4.offset = var23 * 1741769013;
      var5.offset = var28 * 1741769013;
      var6.offset = var26 * 1741769013;
      var7.offset = var30 * 1741769013;
      var8.offset = var27 * 1741769013;

      for (int var59 = 0; var59 < var10; var59++) {
         this.texTriangleZ[var59] = (short)Buffer.method12008(var4, (byte)5);
         if (var12 == 1) {
            int var62 = var5.readUnsignedIntIME(-625568667);
            if ((var62 & 1) == 1) {
               this.faceAlphas[var59] = 1;
               var2 = true;
            } else {
               this.faceRenderTypes[var59] = 0;
            }

            if ((var62 & 2) == 2) {
               this.faceAlphas[var59] = (byte)(var62 >> 2);
               this.texTriangleY[var59] = this.faceColors[var59];
               this.faceColors[var59] = 127;
               if (this.faceTextures[var59] != -1) {
                  var3 = true;
               }
            } else {
               this.textureRenderTypes[var59] = -1;
               this.faceColors[var59] = -1;
            }
         }

         if (var13 == 255) {
            this.faceRenderPriorities[var59] = Buffer.method12001(var6, (byte)82);
         }

         if (var14 == 1) {
            this.faceAlphas[var59] = Buffer.method12001(var7, (byte)79);
         }

         if (var15 == 1) {
            this.verticesY[var59] = var8.readUnsignedIntLE(-1050772233);
         }
      }

      var4.offset = var23 * 1741769013;
      var5.offset = var23 * 1741769013;
      int var60 = 0;
      int var63 = 0;
      int var65 = 0;
      int var66 = 0;

      for (int var67 = 0; var67 < var10; var67++) {
         int var46 = var5.packBytesToInt(1935213362);
         if (var46 == 1) {
            var60 = var4.readUnsignedIntLE(244416010) + var66;
            var63 = var4.readSignedShort(-649397109) + var60;
            var65 = var4.method12100(-582811450) + var63;
            var66 = var65;
            this.indices2[var67] = var60;
            this.indices3[var67] = var63;
            this.vertexSkins[var67] = var65;
         }

         if (var46 == 2) {
            var63 = var65;
            var65 = var4.readUnsignedIntIME(1951956263) + var66;
            var66 = var65;
            this.vertexSkins[var67] = var60;
            this.verticesY[var67] = var63;
            this.indices2[var67] = var65;
         }

         if (var46 == 3) {
            var60 = var65;
            var65 = var4.readUnsignedByteAdd(-1683960329) + var66;
            var66 = var65;
            this.indices2[var67] = var60;
            this.faceSkins[var67] = var63;
            this.verticesY[var67] = var65;
         }

         if (var46 == 4) {
            int var47 = var60;
            var60 = var63;
            var63 = var47;
            var65 = var4.readMedium(-1595179765) + var66;
            var66 = var65;
            this.indices3[var67] = var60;
            this.verticesY[var67] = var47;
            this.indices3[var67] = var65;
         }
      }

      var4.offset = var23 * 1741769013;

      for (int var68 = 0; var68 < var11; var68++) {
         this.textureCoords[var68] = 0;
         this.faceTextures[var68] = (short)Buffer.method12008(var4, (byte)5);
         this.faceTextures[var68] = (short)Buffer.method12008(var4, (byte)5);
         this.texTriangleY[var68] = (short)Buffer.method12008(var4, (byte)5);
      }

      var4.offset = var23 * 1741769013;
      boolean var69 = var4.method12183(-1443704488) == 1;
      if (var69) {
         this.faceRenderTypes = new byte[var10];

         for (int var70 = 0; var70 < var10; var70++) {
            this.faceRenderPriorities[var70] = Buffer.method12001(var4, (byte)77);
         }
      }

      if (this.faceRenderPriorities != null) {
         boolean var71 = false;

         for (int var72 = 0; var72 < var10; var72++) {
            int var48 = this.faceRenderTypes[var72] & 255;
            if (var48 != 255) {
               if ((this.texTriangleY[var48] & '\uffff') == this.faceSkins[var72]
                  && (this.texTriangleZ[var48] & '\uffff') == this.indices1[var72]
                  && (this.texTriangleZ[var48] & '\uffff') == this.indices3[var72]) {
                  this.textureCoords[var72] = -1;
               } else {
                  var71 = true;
               }
            }
         }

         if (!var71) {
            this.textureRenderTypes = null;
         }
      }

      if (!var3) {
         this.faceTextures = null;
      }

      if (!var2) {
         this.faceRenderPriorities = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("sx")
   public static void method6078(ModelData var0) {
      if (var0 == null) {
         var0.method6097();
      }

      for (int var1 = 0; var1 < var0.verticesCount; var1++) {
         var0.field3101[var1] = -((int)var0.field3101[var1]);
      }

      for (int var3 = 0; var3 < var0.faceCount; var3++) {
         int var2 = var0.indices1[var3];
         var0.indices1[var3] = var0.indices3[var3];
         var0.indices3[var3] = var2;
      }

      var0.method6087();
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("ah")
   public ModelData copyModelData() {
      return method6048(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("yn")
   public ModelData method6102() {
      this.texTriangleZ = (short[])this.texTriangleZ.clone();
      return this;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bo")
   public void changeOffset(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field3129; var4++) {
         this.field3100[var4] = this.field3100[var4] + var1;
         this.field3101[var4] = this.field3101[var4] + var2;
         this.field3101[var4] = this.field3101[var4] + var3;
      }

      this.method6076();
   }

   @ObfuscatedSignature(descriptor = "(SS)V")
   @ObfuscatedName("bs")
   public void retexture(short var1, short var2) {
      if (this.texTriangleZ != null) {
         for (int var3 = 0; var3 < this.field3130; var3++) {
            if (this.texTriangleX[var3] == var1) {
               this.texTriangleX[var3] = var2;
            }
         }
      }
   }

   public short[] getFaceTextures() {
      return this.texTriangleZ;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Lky;")
   @ObfuscatedName("bp")
   public final Model toModel(int var1, int var2, int var3, int var4, int var5) {
      return method6106(this, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("ow")
   public ModelData method6139() {
      this.method6103();
      return this;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("hk")
   public static void method6058(ModelData var0) {
      if (var0 == null) {
         var0.method6108();
      }

      for (int var1 = 0; var1 < var0.verticesCount; var1++) {
         var0.field3096[var1] = -((int)var0.field3096[var1]);
         var0.field3101[var1] = -((int)var0.field3101[var1]);
      }

      var0.method6087();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   void calculateBounds() {
      if (!this.isBoundsCalculated) {
         this.height = 0;
         this.faceCount = 0;
         this.verticesCount = 999999;
         this.field3128 = -999999;
         this.faceCount = -99999;
         this.field3128 = 99999;

         for (int var1 = 0; var1 < this.field3127; var1++) {
            int var2 = (int)this.field3100[var1];
            int var3 = (int)this.field3100[var1];
            int var4 = (int)this.field3101[var1];
            if (var2 < this.field3129) {
               this.verticesCount = var2;
            }

            if (var2 > this.field3130) {
               this.field3130 = var2;
            }

            if (var4 < this.faceCount) {
               this.field3129 = var4;
            }

            if (var4 > this.field3130) {
               this.verticesCount = var4;
            }

            if (-var3 > this.height * -1272589951) {
               this.height = -var3 * -689148287;
            }

            if (var3 > this.field3128) {
               this.field3130 = var3;
            }
         }

         this.isBoundsCalculated = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   public void method6108() {
      for (int var1 = 0; var1 < this.field3128; var1++) {
         float var2 = this.field3101[var1];
         this.field3100[var1] = this.field3101[var1];
         this.field3100[var1] = -var2;
      }

      this.method6103();
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ch")
   public Model method6109() {
      return this.method6119(64, 768, -50, -10, -50);
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("bs")
   public ModelData method6140() {
      this.method6107();
      return this;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void invalidate() {
      this.vertexNormals = null;
      this.vertexVertices = null;
      this.faceNormals = null;
      this.isBoundsCalculated = false;
   }
}
