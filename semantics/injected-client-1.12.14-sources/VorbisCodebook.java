import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ee")
public class VorbisCodebook {
   @ObfuscatedName("ag")
   int[] lengthMap;
   @ObfuscatedName("av")
   int field1561;
   @ObfuscatedName("aj")
   int[] keys;
   @ObfuscatedName("at")
   int entries;
   @ObfuscatedName("ae")
   float[][] field1564;
   @ObfuscatedName("an")
   int[] field1566;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   void method3691() {
      int[] var1 = new int[this.entries];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < this.entries; var3++) {
         int var4 = this.keys[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= 32; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      this.field1566 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < this.entries; var12++) {
         int var13 = this.keys[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = Integer.MIN_VALUE >>> var16;
               if ((var14 & var18) != 0) {
                  if (this.field1566[var15] == 0) {
                     this.field1566[var15] = var11;
                  }

                  var15 = this.field1566[var15];
               } else {
                  var15++;
               }

               if (var15 >= this.field1566.length) {
                  int[] var21 = new int[this.field1566.length * 2];

                  for (int var22 = 0; var22 < this.field1566.length; var22++) {
                     var21[var22] = this.field1566[var22];
                  }

                  this.field1566 = var21;
               }

               var18 >>>= 1;
            }

            this.field1566[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   void method3692() {
      int[] var1 = new int[this.entries];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < this.entries; var3++) {
         int var4 = this.keys[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= 32; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      this.field1566 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < this.entries; var12++) {
         int var13 = this.keys[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = Integer.MIN_VALUE >>> var16;
               if ((var14 & var18) != 0) {
                  if (this.field1566[var15] == 0) {
                     this.field1566[var15] = var11;
                  }

                  var15 = this.field1566[var15];
               } else {
                  var15++;
               }

               if (var15 >= this.field1566.length) {
                  int[] var21 = new int[this.field1566.length * 2];

                  for (int var22 = 0; var22 < this.field1566.length; var22++) {
                     var21[var22] = this.field1566[var22];
                  }

                  this.field1566 = var21;
               }

               var18 >>>= 1;
            }

            this.field1566[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lem;)[F")
   @ObfuscatedName("an")
   float[] method3701(classEM var1) {
      return this.field1564[class525.method11170(this, var1)];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   static int method3686(int var0, int var1) {
      int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

      while (class237.method5406(var2, var1, -2126471348) > var0) {
         var2--;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lee;)V")
   @ObfuscatedName("mq")
   public static void method3693(VorbisCodebook var0) {
      int[] var1 = new int[var0.entries];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < var0.entries; var3++) {
         int var4 = var0.keys[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= 32; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      var0.field1566 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < var0.entries; var12++) {
         int var13 = var0.keys[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = Integer.MIN_VALUE >>> var16;
               if ((var14 & var18) != 0) {
                  if (var0.field1566[var15] == 0) {
                     var0.field1566[var15] = var11;
                  }

                  var15 = var0.field1566[var15];
               } else {
                  var15++;
               }

               if (var15 >= var0.field1566.length) {
                  int[] var21 = new int[var0.field1566.length * 2];

                  for (int var22 = 0; var22 < var0.field1566.length; var22++) {
                     var21[var22] = var0.field1566[var22];
                  }

                  var0.field1566 = var21;
               }

               var18 >>>= 1;
            }

            var0.field1566[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   static int method3687(int var0, int var1) {
      int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

      while (class237.method5406(var2, var1, -2117250001) > var0) {
         var2--;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   static int method3688(int var0, int var1) {
      int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

      while (class237.method5406(var2, var1, -2135652936) > var0) {
         var2--;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lem;)I")
   @ObfuscatedName("ad")
   int method3695(classEM var1) {
      int var2 = 0;

      while (this.field1566[var2] >= 0) {
         var2 = classEM.method3774(var1, (byte)4) != 0 ? this.field1566[var2] : var2 + 1;
      }

      return ~this.field1566[var2];
   }

   @ObfuscatedSignature(descriptor = "(Lem;)I")
   @ObfuscatedName("ac")
   int method3696(classEM var1) {
      int var2 = 0;

      while (this.field1566[var2] >= 0) {
         var2 = classEM.method3774(var1, (byte)4) != 0 ? this.field1566[var2] : var2 + 1;
      }

      return ~this.field1566[var2];
   }

   VorbisCodebook(classEM var1) {
      classEM.method3770(var1, 24, 472488938);
      this.field1561 = classEM.method3770(var1, 16, 1952287390);
      this.entries = classEM.method3770(var1, 24, -562752432);
      this.keys = new int[this.entries];
      boolean var2 = classEM.method3774(var1, (byte)4) != 0;
      if (var2) {
         int var3 = 0;

         for (int var4 = classEM.method3770(var1, 5, -1695891244) + 1; var3 < this.entries; var4++) {
            int var5 = classEM.method3770(var1, class39.iLog(this.entries - var3, -1036196233), -347815361);

            for (int var6 = 0; var6 < var5; var6++) {
               this.keys[var3++] = var4;
            }
         }
      } else {
         boolean var15 = classEM.method3774(var1, (byte)4) != 0;

         for (int var17 = 0; var17 < this.entries; var17++) {
            if (var15 && classEM.method3774(var1, (byte)4) == 0) {
               this.keys[var17] = 0;
            } else {
               this.keys[var17] = classEM.method3770(var1, 5, -290267736) + 1;
            }
         }
      }

      this.method3692();
      int var16 = classEM.method3770(var1, 4, -1667290314);
      if (var16 > 0) {
         float var18 = VorbisSample.float32Unpack(classEM.method3770(var1, 32, -1045154173));
         float var19 = VorbisSample.float32Unpack(classEM.method3770(var1, 32, 1440264719));
         int var20 = classEM.method3770(var1, 4, -918460161) + 1;
         boolean var7 = classEM.method3774(var1, (byte)4) != 0;
         int var8;
         if (var16 == 1) {
            var8 = mapType1QuantValues(this.entries, this.field1561);
         } else {
            var8 = this.entries * this.field1561;
         }

         this.lengthMap = new int[var8];

         for (int var9 = 0; var9 < var8; var9++) {
            this.lengthMap[var9] = classEM.method3770(var1, var20, 1659044030);
         }

         this.field1564 = new float[this.entries][this.field1561];
         if (var16 == 1) {
            for (int var21 = 0; var21 < this.entries; var21++) {
               float var10 = 0.0F;
               int var11 = 1;

               for (int var12 = 0; var12 < this.field1561; var12++) {
                  int var13 = var21 / var11 % var8;
                  float var14 = this.lengthMap[var13] * var19 + var18 + var10;
                  this.field1564[var21][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for (int var22 = 0; var22 < this.entries; var22++) {
               float var23 = 0.0F;
               int var24 = var22 * this.field1561;

               for (int var25 = 0; var25 < this.field1561; var25++) {
                  float var26 = this.lengthMap[var24] * var19 + var18 + var23;
                  this.field1564[var22][var25] = var26;
                  if (var7) {
                     var23 = var26;
                  }

                  var24++;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   static int method3689(int var0, int var1) {
      int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

      while (class237.method5406(var2, var1, -2134345488) > var0) {
         var2--;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lem;)I")
   @ObfuscatedName("ai")
   int method3697(classEM var1) {
      int var2 = 0;

      while (this.field1566[var2] >= 0) {
         var2 = classEM.method3774(var1, (byte)4) != 0 ? this.field1566[var2] : var2 + 1;
      }

      return ~this.field1566[var2];
   }

   @ObfuscatedSignature(descriptor = "(Lem;)I")
   @ObfuscatedName("as")
   int method3698(classEM var1) {
      int var2 = 0;

      while (this.field1566[var2] >= 0) {
         var2 = classEM.method3774(var1, (byte)4) != 0 ? this.field1566[var2] : var2 + 1;
      }

      return ~this.field1566[var2];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lee;Lem;)I")
   @ObfuscatedName("jb")
   public static int method3699(VorbisCodebook var0, classEM var1) {
      if (var0 == null) {
         var0.method3703(var1);
      }

      int var2 = 0;

      while (var0.field1566[var2] >= 0) {
         var2 = classEM.method3774(var1, (byte)4) != 0 ? var0.field1566[var2] : var2 + 1;
      }

      return ~var0.field1566[var2];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   static int mapType1QuantValues(int var0, int var1) {
      int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

      while (class237.method5406(var2, var1, -2120438094) > var0) {
         var2--;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lee;)V")
   @ObfuscatedName("gg")
   public static void method3694(VorbisCodebook var0) {
      int[] var1 = new int[var0.entries];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < var0.entries; var3++) {
         int var4 = var0.keys[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= 32; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      var0.field1566 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < var0.entries; var12++) {
         int var13 = var0.keys[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = Integer.MIN_VALUE >>> var16;
               if ((var14 & var18) != 0) {
                  if (var0.field1566[var15] == 0) {
                     var0.field1566[var15] = var11;
                  }

                  var15 = var0.field1566[var15];
               } else {
                  var15++;
               }

               if (var15 >= var0.field1566.length) {
                  int[] var21 = new int[var0.field1566.length * 2];

                  for (int var22 = 0; var22 < var0.field1566.length; var22++) {
                     var21[var22] = var0.field1566[var22];
                  }

                  var0.field1566 = var21;
               }

               var18 >>>= 1;
            }

            var0.field1566[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lem;)[F")
   @ObfuscatedName("ab")
   float[] method3702(classEM var1) {
      return this.field1564[class525.method11170(this, var1)];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmj;)V")
   @ObfuscatedName("eq")
   public static void method3685(PacketBufferNode var0) {
      if (var0 == null) {
         var0.method7435();
      }

      if (-1232939811 * PacketBufferNode.PacketBufferNode_packetBufferNodeCount < PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
         PacketBufferNode.PacketBufferNode_packetBufferNodes[(PacketBufferNode.PacketBufferNode_packetBufferNodeCount += -986475329) * -2135827649 - 1] = var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lem;)[F")
   @ObfuscatedName("ar")
   float[] method3703(classEM var1) {
      return this.field1564[class525.method11170(this, var1)];
   }

   @ObfuscatedSignature(descriptor = "(Lem;)I")
   @ObfuscatedName("ag")
   int method3700(classEM var1) {
      int var2 = 0;

      while (this.field1566[var2] >= 0) {
         var2 = classEM.method3774(var1, (byte)4) != 0 ? this.keys[var2] : var2 + 1;
      }

      return ~this.field1566[var2];
   }
}
