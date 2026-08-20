import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ow")
public class classOW extends classVJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5174 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5178 = 1;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ax")
   public static AbstractArchive field5185;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5184 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5172 = 2;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ac")
   public static EvictingDualNodeHashTable field5183 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("aa")
   public final int field5175;
   @ObfuscatedName("au")
   public final int field5173;
   @ObfuscatedName("al")
   public final boolean field5177;
   @ObfuscatedName("aj")
   public final int field5170;
   @ObfuscatedName("ay")
   public final int field5180;
   @ObfuscatedName("aq")
   public final int field5181;
   @ObfuscatedName("ad")
   public final int field5182;
   @ObfuscatedName("ap")
   public final int field5179;
   @ObfuscatedName("ao")
   public final int field5176;
   @ObfuscatedName("ai")
   public final int field5171;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("zo")
   public int method8810() {
      return this.field5176 * -982434803;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public static void method8803() {
      EvictingDualNodeHashTable.method6431(field5183);
   }

   public classOW(classXY var1, int var2) {
      int var3 = 0;
      int var4 = -1;
      boolean var5 = true;
      int var6 = -1;
      if (null != var1 && var1.field6954 != null) {
         label51:
         while (true) {
            int var7 = classXY.method13039(var1, -346779531);
            switch (var7) {
               case 0:
                  break label51;
               case 1:
                  var3 = var1.method13051(-758448158);
                  continue;
               case 2:
                  var4 = classXY.method13039(var1, -346779531);
               case 3:
               case 4:
               case 6:
               case 8:
               default:
                  continue;
               case 5:
                  var5 = false;
                  continue;
               case 7:
                  var6 = var1.method13051(-758448158);
                  continue;
               case 9:
            }

            classXY.method13039(var1, -346779531);
         }
      }

      this.field5175 = var3 * 584710275;
      this.field5176 = 1423667909 * var4;
      this.field5177 = var5;
      this.field5170 = var6 * -1839613789;
      if (-1 != var6) {
         classOS var8 = this.method8809(var6, -1620115005);
         this.field5179 = 1910154801 * var8.field5107;
         this.field5173 = -2044794319 * var8.field5105;
         this.field5171 = 2036871205 * var8.field5106;
      } else {
         this.field5179 = 0;
         this.field5173 = 0;
         this.field5171 = 0;
      }

      classOS var9 = this.method8809(var3, 1943355153);
      this.field5180 = var9.field5107 * 2033473845;
      this.field5181 = var9.field5105 * -411782965;
      this.field5182 = 837220081 * var9.field5106;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("rs")
   public int method8811() {
      return this.field5180 * 2106821511;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("rn")
   public int method8812() {
      return this.field5173 * -2131451469;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vz")
   public int method8813() {
      return this.field5170 * 151173899;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ab")
   public static void method8802(AbstractArchive var0) {
      field5185 = var0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("xx")
   public int method8814() {
      return this.field5182 * -1560131225;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("sw")
   public int method8815() {
      return this.field5179 * 2023234915;
   }

   @ObfuscatedSignature(descriptor = "(II)J")
   @ObfuscatedName("af")
   public static long method8807(int var0, int var1) {
      try {
         return classZI.field7187[var0];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ow.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public static void method8804() {
      EvictingDualNodeHashTable.method6431(field5183);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("tp")
   public int method8816() {
      return this.field5171 * 1086307051;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("zp")
   public int method8817() {
      return this.field5181 * -1352766871;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public static void method8805() {
      EvictingDualNodeHashTable.method6431(field5183);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public static void method8806() {
      EvictingDualNodeHashTable.method6431(field5183);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("uk")
   public int method8818() {
      return this.field5175 * 2136479275;
   }

   @ObfuscatedSignature(descriptor = "(I)Los;")
   @ObfuscatedName("aa")
   classOS method8808(int var1) {
      double var2 = (var1 >> 16 & 89120203) / 256.0;
      double var4 = (var1 >> 8 & 0xFF) / 256.0;
      double var6 = (var1 & 747201095) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var8 + var10) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0;
         }
      }

      var12 /= 6.0;
      return new classOS(this, (int)(var12 * 256.0), (int)(var14 * 256.0), (int)(256.0 * var16));
   }

   @ObfuscatedSignature(descriptor = "(II)Los;")
   @ObfuscatedName("ae")
   classOS method8809(int var1, int var2) {
      try {
         double var3 = (var1 >> 16 & 0xFF) / 256.0;
         double var5 = (var1 >> 8 & 0xFF) / 256.0;
         double var7 = (var1 & 0xFF) / 256.0;
         double var9 = var3;
         if (var5 < var3) {
            if (var2 == -389406596) {
               throw new IllegalStateException();
            }

            var9 = var5;
         }

         if (var7 < var9) {
            if (var2 == -389406596) {
               throw new IllegalStateException();
            }

            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            if (var2 == -389406596) {
               throw new IllegalStateException();
            }

            var11 = var5;
         }

         if (var7 > var11) {
            if (var2 == -389406596) {
               throw new IllegalStateException();
            }

            var11 = var7;
         }

         double var13 = 0.0;
         double var15 = 0.0;
         double var17 = (var9 + var11) / 2.0;
         if (var9 != var11) {
            if (var2 == -389406596) {
               throw new IllegalStateException();
            }

            if (var17 < 0.5) {
               if (var2 == -389406596) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (var11 + var9);
            }

            if (var17 >= 0.5) {
               if (var2 == -389406596) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (2.0 - var11 - var9);
            }

            if (var11 == var3) {
               if (var2 == -389406596) {
                  throw new IllegalStateException();
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if (var11 == var5) {
               if (var2 == -389406596) {
                  throw new IllegalStateException();
               }

               var13 = 2.0 + (var7 - var3) / (var11 - var9);
            } else if (var11 == var7) {
               var13 = (var3 - var5) / (var11 - var9) + 4.0;
            }
         }

         var13 /= 6.0;
         return new classOS(this, (int)(var13 * 256.0), (int)(var15 * 256.0), (int)(256.0 * var17));
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "ow.ae(" + ')');
      }
   }
}
