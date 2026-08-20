import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ej")
public class AudioFilter {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1609 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final float field1608 = 100.0F;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final float field1605 = 8.0F;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final float field1607 = 32.703197F;
   @ObfuscatedName("aj")
   static int[][] coefficients = new int[2][8];
   @ObfuscatedName("ak")
   static float field1606;
   @ObfuscatedName("au")
   int[][][] field1601;
   @ObfuscatedName("aw")
   static int forwardMultiplier;
   @ObfuscatedName("ae")
   static float[][] field1603 = new float[2][8];
   @ObfuscatedName("ay")
   int[][][] field1600;
   @ObfuscatedName("ap")
   int[] pairs = new int[2];
   @ObfuscatedName("az")
   int[] field1599;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lej;IIFI)F")
   @ObfuscatedName("yg")
   public static float method3757(AudioFilter var0, int var1, int var2, float var3, int var4) {
      float var5 = var0.field1600[var1][0][var2] + var3 * (var0.field1600[var1][1][var2] - var0.field1600[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return normalize(var5, var4);
   }

   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("av")
   static float normalize(float var0, int var1) {
      float var2 = 32.703197F * (float)Math.pow(2.0, var0);
      return var2 * (float) Math.PI / (var1 / 2);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Ldp;)V")
   @ObfuscatedName("ae")
   final void method3766(Buffer var1, SoundEnvelope var2) {
      int var3 = var1.readUnsignedByte(485613978);
      this.pairs[0] = var3 >> 4;
      this.pairs[1] = var3 & 15;
      if (var3 != 0) {
         this.field1599[0] = Buffer.method12008(var1, (byte)5);
         this.field1599[1] = Buffer.method12008(var1, (byte)5);
         int var4 = var1.readUnsignedByte(1951340421);

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.pairs[var5]; var6++) {
               this.field1600[var5][0][var6] = Buffer.method12008(var1, (byte)5);
               this.field1601[var5][0][var6] = Buffer.method12008(var1, (byte)5);
            }
         }

         for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.pairs[var8]; var9++) {
               if ((var4 & 1 << var8 * 4 << var9) != 0) {
                  this.field1600[var8][1][var9] = Buffer.method12008(var1, (byte)5);
                  this.field1601[var8][1][var9] = Buffer.method12008(var1, (byte)5);
               } else {
                  this.field1600[var8][1][var9] = this.field1600[var8][0][var9];
                  this.field1601[var8][1][var9] = this.field1601[var8][0][var9];
               }
            }
         }

         if (var4 != 0 || this.field1599[1] != this.field1599[0]) {
            var2.decodeSegments(var1);
         }
      } else {
         int[] var7 = this.field1599;
         this.field1599[1] = 0;
         var7[0] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lej;IFI)I")
   @ObfuscatedName("fq")
   public static int method3762(AudioFilter var0, int var1, float var2, int var3) {
      if (var0 == null) {
         var0.method3758(var1, var1, var2, var1);
      }

      if (var1 == 0) {
         float var4 = var0.field1599[0] + (var0.field1599[1] - var0.field1599[0]) * var2;
         var4 *= 0.0030517578F;
         field1606 = (float)Math.pow(0.1, var4 / 20.0F);
         forwardMultiplier = (int)(field1606 * 65536.0F);
      }

      if (var0.pairs[var1] == 0) {
         return 0;
      } else {
         float var10 = method3755(var0, var1, 0, var2);
         field1603[var1][0] = -2.0F * var10 * (float)Math.cos(var0.method3758(var1, 0, var2, var3));
         field1603[var1][1] = var10 * var10;

         for (int var5 = 1; var5 < var0.pairs[var1]; var5++) {
            var10 = method3755(var0, var1, var5, var2);
            float var6 = -2.0F * var10 * (float)Math.cos(var0.method3758(var1, var5, var2, var3));
            float var7 = var10 * var10;
            field1603[var1][var5 * 2 + 1] = field1603[var1][var5 * 2 - 1] * var7;
            field1603[var1][var5 * 2] = field1603[var1][var5 * 2 - 1] * var6 + field1603[var1][var5 * 2 - 2] * var7;

            for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
               field1603[var1][var8] = field1603[var1][var8] + (field1603[var1][var8 - 1] * var6 + field1603[var1][var8 - 2] * var7);
            }

            field1603[var1][1] = field1603[var1][1] + (field1603[var1][0] * var6 + var7);
            field1603[var1][0] = field1603[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var12 = 0; var12 < var0.pairs[0] * 2; var12++) {
               field1603[0][var12] = field1603[0][var12] * field1606;
            }
         }

         for (int var13 = 0; var13 < var0.pairs[var1] * 2; var13++) {
            coefficients[var1][var13] = (int)(field1603[var1][var13] * 65536.0F);
         }

         return var0.pairs[var1] * 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIFI)F")
   @ObfuscatedName("ag")
   float method3758(int var1, int var2, float var3, int var4) {
      float var5 = this.field1600[var1][0][var2] + var3 * (this.field1600[var1][1][var2] - this.field1600[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return normalize(var5, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIFI)F")
   @ObfuscatedName("au")
   float method3759(int var1, int var2, float var3, int var4) {
      float var5 = this.field1600[var1][0][var2] + var3 * (this.field1600[var1][1][var2] - this.field1600[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return normalize(var5, var4);
   }

   AudioFilter() {
      this.field1600 = new int[2][2][4];
      this.field1601 = new int[2][2][4];
      this.field1599 = new int[2];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llb;)V")
   @ObfuscatedName("bo")
   public static void method3769(class299 var0) {
      if (var0 == null) {
         var0.method6982();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lej;IIF)F")
   @ObfuscatedName("tb")
   public static float method3753(AudioFilter var0, int var1, int var2, float var3) {
      float var4 = var0.field1601[var1][0][var2] + var3 * (var0.field1601[var1][1][var2] - var0.field1601[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lej;IIFI)F")
   @ObfuscatedName("vm")
   public static float method3760(AudioFilter var0, int var1, int var2, float var3, int var4) {
      float var5 = var0.field1600[var1][0][var2] + var3 * (var0.field1600[var1][1][var2] - var0.field1600[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return normalize(var5, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("aj")
   static float method3752(float var0, int var1) {
      float var2 = 32.703197F * (float)Math.pow(2.0, var0);
      return var2 * (float) Math.PI / (var1 / 2);
   }

   @ObfuscatedSignature(descriptor = "(IIF)F")
   @ObfuscatedName("at")
   float method3754(int var1, int var2, float var3) {
      float var4 = this.field1601[var1][0][var2] + var3 * (this.field1601[var1][1][var2] - this.field1601[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }

   @ObfuscatedSignature(descriptor = "(IIFI)F")
   @ObfuscatedName("ai")
   float method3761(int var1, int var2, float var3, int var4) {
      float var5 = this.field1600[var1][0][var2] + var3 * (this.field1600[var1][1][var2] - this.field1600[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return normalize(var5, var4);
   }

   @ObfuscatedSignature(descriptor = "(IFI)I")
   @ObfuscatedName("as")
   int method3763(int var1, float var2, int var3) {
      if (var1 == 0) {
         float var4 = this.field1599[0] + (this.field1599[1] - this.field1599[0]) * var2;
         var4 *= 0.0030517578F;
         field1606 = (float)Math.pow(0.1, var4 / 20.0F);
         forwardMultiplier = (int)(field1606 * 65536.0F);
      }

      if (this.pairs[var1] == 0) {
         return 0;
      } else {
         float var10 = method3755(this, var1, 0, var2);
         field1603[var1][0] = -2.0F * var10 * (float)Math.cos(this.method3758(var1, 0, var2, var3));
         field1603[var1][1] = var10 * var10;

         for (int var5 = 1; var5 < this.pairs[var1]; var5++) {
            var10 = method3755(this, var1, var5, var2);
            float var6 = -2.0F * var10 * (float)Math.cos(this.method3758(var1, var5, var2, var3));
            float var7 = var10 * var10;
            field1603[var1][var5 * 2 + 1] = field1603[var1][var5 * 2 - 1] * var7;
            field1603[var1][var5 * 2] = field1603[var1][var5 * 2 - 1] * var6 + field1603[var1][var5 * 2 - 2] * var7;

            for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
               field1603[var1][var8] = field1603[var1][var8] + (field1603[var1][var8 - 1] * var6 + field1603[var1][var8 - 2] * var7);
            }

            field1603[var1][1] = field1603[var1][1] + (field1603[var1][0] * var6 + var7);
            field1603[var1][0] = field1603[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var12 = 0; var12 < this.pairs[0] * 2; var12++) {
               field1603[0][var12] = field1603[0][var12] * field1606;
            }
         }

         for (int var13 = 0; var13 < this.pairs[var1] * 2; var13++) {
            coefficients[var1][var13] = (int)(field1603[var1][var13] * 65536.0F);
         }

         return this.pairs[var1] * 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Ldp;)V")
   @ObfuscatedName("ab")
   final void method3767(Buffer var1, SoundEnvelope var2) {
      int var3 = var1.readUnsignedByte(-432304014);
      this.pairs[0] = var3 >> 4;
      this.pairs[1] = var3 & 15;
      if (var3 != 0) {
         this.field1599[0] = Buffer.method12008(var1, (byte)5);
         this.field1599[1] = Buffer.method12008(var1, (byte)5);
         int var4 = var1.readUnsignedByte(1491326209);

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.pairs[var5]; var6++) {
               this.field1600[var5][0][var6] = Buffer.method12008(var1, (byte)5);
               this.field1601[var5][0][var6] = Buffer.method12008(var1, (byte)5);
            }
         }

         for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.pairs[var8]; var9++) {
               if ((var4 & 1 << var8 * 4 << var9) != 0) {
                  this.field1600[var8][1][var9] = Buffer.method12008(var1, (byte)5);
                  this.field1601[var8][1][var9] = Buffer.method12008(var1, (byte)5);
               } else {
                  this.field1600[var8][1][var9] = this.field1600[var8][0][var9];
                  this.field1601[var8][1][var9] = this.field1601[var8][0][var9];
               }
            }
         }

         if (var4 != 0 || this.field1599[1] != this.field1599[0]) {
            var2.decodeSegments(var1);
         }
      } else {
         int[] var7 = this.field1599;
         this.field1599[1] = 0;
         var7[0] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lej;IIF)F")
   @ObfuscatedName("er")
   public static float method3755(AudioFilter var0, int var1, int var2, float var3) {
      if (var0 == null) {
         return var0.method3756(var1, var1, var3);
      } else {
         float var4 = var0.field1601[var1][0][var2] + var3 * (var0.field1601[var1][1][var2] - var0.field1601[var1][0][var2]);
         var4 *= 0.0015258789F;
         return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Ldp;)V")
   @ObfuscatedName("ax")
   final void method3768(Buffer var1, SoundEnvelope var2) {
      int var3 = var1.readUnsignedByte(1768790315);
      this.pairs[0] = var3 >> 4;
      this.pairs[1] = var3 & 15;
      if (var3 != 0) {
         this.field1599[0] = Buffer.method12008(var1, (byte)5);
         this.field1599[1] = Buffer.method12008(var1, (byte)5);
         int var4 = var1.readUnsignedByte(1341887040);

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.pairs[var5]; var6++) {
               this.field1600[var5][0][var6] = Buffer.method12008(var1, (byte)5);
               this.field1601[var5][0][var6] = Buffer.method12008(var1, (byte)5);
            }
         }

         for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.pairs[var8]; var9++) {
               if ((var4 & 1 << var8 * 4 << var9) != 0) {
                  this.field1600[var8][1][var9] = Buffer.method12008(var1, (byte)5);
                  this.field1601[var8][1][var9] = Buffer.method12008(var1, (byte)5);
               } else {
                  this.field1600[var8][1][var9] = this.field1600[var8][0][var9];
                  this.field1601[var8][1][var9] = this.field1601[var8][0][var9];
               }
            }
         }

         if (var4 != 0 || this.field1599[1] != this.field1599[0]) {
            var2.decodeSegments(var1);
         }
      } else {
         int[] var7 = this.field1599;
         this.field1599[1] = 0;
         var7[0] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(IFI)I")
   @ObfuscatedName("an")
   int compute(int var1, float var2, int var3) {
      if (var1 == 0) {
         float var4 = this.field1599[0] + (this.pairs[1] - this.pairs[0]) * var2;
         var4 *= 0.0030517578F;
         field1606 = (float)Math.pow(0.1, var4 / 20.0F);
         forwardMultiplier = (int)(field1606 * 65536.0F);
      }

      if (this.pairs[var1] == 0) {
         return 0;
      } else {
         float var10 = method3755(this, var1, 0, var2);
         field1603[var1][0] = -2.0F * var10 * (float)Math.cos(this.method3761(var1, 0, var2, var3));
         field1603[var1][1] = var10 * var10;

         for (int var5 = 1; var5 < this.pairs[var1]; var5++) {
            var10 = method3755(this, var1, var5, var2);
            float var6 = -2.0F * var10 * (float)Math.cos(this.method3758(var1, var5, var2, var3));
            float var7 = var10 * var10;
            field1603[var1][var5 * 2 + 1] = field1603[var1][var5 * 2 - 1] * var7;
            field1603[var1][var5 * 2] = field1603[var1][var5 * 2 - 1] * var6 + field1603[var1][var5 * 2 - 2] * var7;

            for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
               field1603[var1][var8] = field1603[var1][var8] + (field1603[var1][var8 - 1] * var6 + field1603[var1][var8 - 2] * var7);
            }

            field1603[var1][1] = field1603[var1][1] + (field1603[var1][0] * var6 + var7);
            field1603[var1][0] = field1603[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var12 = 0; var12 < this.field1599[0] * 2; var12++) {
               field1603[0][var12] = field1603[0][var12] * field1606;
            }
         }

         for (int var13 = 0; var13 < this.field1599[var1] * 2; var13++) {
            coefficients[var1][var13] = (int)(field1603[var1][var13] * 65536.0F);
         }

         return this.pairs[var1] * 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lej;IFI)I")
   @ObfuscatedName("pw")
   public static int method3765(AudioFilter var0, int var1, float var2, int var3) {
      if (var0 == null) {
         var0.compute(var1, var2, var1);
      }

      if (var1 == 0) {
         float var4 = var0.field1599[0] + (var0.field1599[1] - var0.field1599[0]) * var2;
         var4 *= 0.0030517578F;
         field1606 = (float)Math.pow(0.1, var4 / 20.0F);
         forwardMultiplier = (int)(field1606 * 65536.0F);
      }

      if (var0.pairs[var1] == 0) {
         return 0;
      } else {
         float var10 = method3755(var0, var1, 0, var2);
         field1603[var1][0] = -2.0F * var10 * (float)Math.cos(var0.method3758(var1, 0, var2, var3));
         field1603[var1][1] = var10 * var10;

         for (int var5 = 1; var5 < var0.pairs[var1]; var5++) {
            var10 = method3755(var0, var1, var5, var2);
            float var6 = -2.0F * var10 * (float)Math.cos(var0.method3758(var1, var5, var2, var3));
            float var7 = var10 * var10;
            field1603[var1][var5 * 2 + 1] = field1603[var1][var5 * 2 - 1] * var7;
            field1603[var1][var5 * 2] = field1603[var1][var5 * 2 - 1] * var6 + field1603[var1][var5 * 2 - 2] * var7;

            for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
               field1603[var1][var8] = field1603[var1][var8] + (field1603[var1][var8 - 1] * var6 + field1603[var1][var8 - 2] * var7);
            }

            field1603[var1][1] = field1603[var1][1] + (field1603[var1][0] * var6 + var7);
            field1603[var1][0] = field1603[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var12 = 0; var12 < var0.pairs[0] * 2; var12++) {
               field1603[0][var12] = field1603[0][var12] * field1606;
            }
         }

         for (int var13 = 0; var13 < var0.pairs[var1] * 2; var13++) {
            coefficients[var1][var13] = (int)(field1603[var1][var13] * 65536.0F);
         }

         return var0.pairs[var1] * 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIF)F")
   @ObfuscatedName("ak")
   float method3756(int var1, int var2, float var3) {
      float var4 = this.field1600[var1][0][var2] + var3 * (this.field1600[var1][1][var2] - this.field1601[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }
}
