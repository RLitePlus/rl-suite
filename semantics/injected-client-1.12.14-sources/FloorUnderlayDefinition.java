import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hf")
public class FloorUnderlayDefinition extends DualNode {
   @ObfuscatedName("ae")
   public int saturation;
   @ObfuscatedName("bm")
   static int field2186;
   @ObfuscatedName("ag")
   int rgb = 0;
   @ObfuscatedName("an")
   public int hue;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("at")
   public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("aj")
   public int lightness;
   @ObfuscatedName("ak")
   public int hueMultiplier;
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   static final int field2185 = 0;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   public static AbstractArchive FloorUnderlayDefinition_archive;

   @ObfuscatedSignature(descriptor = "(Lut;B)I")
   @ObfuscatedName("ae")
   public static int method4514(DynamicArray var0, byte var1) {
      try {
         classWJ.method11743(var0, (byte)-35);
         byte var2 = 0;
         int var3 = var0.method11215((byte)16);
         int var4 = -1;
         if (class586.field6376 == var0.field6107) {
            if (var1 <= 32) {
               throw new IllegalStateException();
            }

            int[] var5 = var0.method11207(2053374425);

            for (int var6 = var2; var6 < var3; var6++) {
               if (var1 <= 32) {
                  throw new IllegalStateException();
               }

               if (-1 != var4) {
                  if (var1 <= 32) {
                     throw new IllegalStateException();
                  }

                  if (var5[var6] >= var5[var4]) {
                     continue;
                  }

                  if (var1 <= 32) {
                     throw new IllegalStateException();
                  }
               }

               var4 = var6;
            }
         } else if (class586.field6377 == var0.field6107) {
            if (var1 <= 32) {
               throw new IllegalStateException();
            }

            long[] var10 = DynamicArray.method11211(var0, (byte)21);

            for (int var12 = var2; var12 < var3; var12++) {
               if (var4 != -1) {
                  if (var1 <= 32) {
                     throw new IllegalStateException();
                  }

                  if (var10[var12] >= var10[var4]) {
                     continue;
                  }

                  if (var1 <= 32) {
                     throw new IllegalStateException();
                  }
               }

               var4 = var12;
            }
         } else if (class586.field6379 == var0.field6107) {
            if (var1 <= 32) {
               throw new IllegalStateException();
            }

            String var11 = null;
            Object[] var13 = var0.method11214((byte)-33);

            for (int var7 = var2; var7 < var3; var7++) {
               if (var1 <= 32) {
                  throw new IllegalStateException();
               }

               String var8 = (String)var13[var7];
               if (-1 != var4) {
                  if (var1 <= 32) {
                     throw new IllegalStateException();
                  }

                  if (null == var8) {
                     continue;
                  }

                  if (var1 <= 32) {
                     throw new IllegalStateException();
                  }

                  if (var8.compareTo(var11) >= 0) {
                     continue;
                  }

                  if (var1 <= 32) {
                     throw new IllegalStateException();
                  }
               }

               var4 = var7;
               var11 = var8;
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "hf.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   public int method4516() {
      return this.hueMultiplier * -1636648267;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void method4509(int var1) {
      double var2 = (var1 >> 16 & 0xFF) / 256.0;
      double var4 = (var1 >> 8 & 0xFF) / 256.0;
      double var6 = (var1 & 0xFF) / 256.0;
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
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.saturation = 1876954581 * (int)(256.0 * var14);
      this.lightness = (int)(256.0 * var16) * -196416751;
      if (-1731148931 * this.saturation < 0) {
         this.saturation = 0;
      } else if (-1731148931 * this.saturation > 255) {
         this.saturation = 1882048299;
      }

      if (this.lightness * -1928632847 < 0) {
         this.lightness = 0;
      } else if (this.lightness * -1928632847 > 255) {
         this.lightness = 1453336047;
      }

      if (var16 > 0.5) {
         this.hueMultiplier = (int)((1.0 - var16) * var14 * 512.0) * 1675748253;
      } else {
         this.hueMultiplier = (int)(var16 * var14 * 512.0) * 1675748253;
      }

      if (this.hueMultiplier * -1636648267 < 1) {
         this.hueMultiplier = 1675748253;
      }

      this.hue = 1215564817 * (int)(this.hueMultiplier * -1636648267 * var12);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;III)V")
   @ObfuscatedName("ae")
   void decodeNext(Buffer var1, int var2, int var3, int var4) {
      try {
         if (var2 == 1) {
            if (var4 <= 1682687803) {
               throw new IllegalStateException();
            }

            this.rgb = var1.readMedium(-997738366) * -1760687259;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hf.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   void setHsl(int var1, int var2) {
      try {
         double var3 = (var1 >> 16 & 0xFF) / 256.0;
         double var5 = (var1 >> 8 & 0xFF) / 256.0;
         double var7 = (var1 & 0xFF) / 256.0;
         double var9 = var3;
         if (var5 < var3) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            var9 = var5;
         }

         if (var7 < var9) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            if (var2 <= 1852114741) {
               return;
            }

            var11 = var5;
         }

         if (var7 > var11) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            var11 = var7;
         }

         double var13 = 0.0;
         double var15 = 0.0;
         double var17 = (var9 + var11) / 2.0;
         if (var9 != var11) {
            if (var17 < 0.5) {
               if (var2 <= 1852114741) {
                  return;
               }

               var15 = (var11 - var9) / (var9 + var11);
            }

            if (var17 >= 0.5) {
               if (var2 <= 1852114741) {
                  return;
               }

               var15 = (var11 - var9) / (2.0 - var11 - var9);
            }

            if (var11 == var3) {
               if (var2 <= 1852114741) {
                  throw new IllegalStateException();
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if (var11 == var5) {
               var13 = (var7 - var3) / (var11 - var9) + 2.0;
            } else if (var11 == var7) {
               if (var2 <= 1852114741) {
                  throw new IllegalStateException();
               }

               var13 = 4.0 + (var3 - var5) / (var11 - var9);
            }
         }

         var13 /= 6.0;
         this.saturation = 1876954581 * (int)(256.0 * var15);
         this.lightness = (int)(256.0 * var17) * -196416751;
         if (-1731148931 * this.saturation < 0) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            this.saturation = 0;
         } else if (-1731148931 * this.saturation > 255) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            this.saturation = 1882048299;
         }

         if (this.lightness * -1928632847 < 0) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            this.lightness = 0;
         } else if (this.lightness * -1928632847 > 255) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            this.lightness = 1453336047;
         }

         if (var17 > 0.5) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            this.hueMultiplier = (int)((1.0 - var17) * var15 * 512.0) * 1675748253;
         } else {
            this.hueMultiplier = (int)(var17 * var15 * 512.0) * 1675748253;
         }

         if (this.hueMultiplier * -1636648267 < 1) {
            if (var2 <= 1852114741) {
               throw new IllegalStateException();
            }

            this.hueMultiplier = 1675748253;
         }

         this.hue = 1215564817 * (int)(this.hueMultiplier * -1636648267 * var13);
      } catch (RuntimeException var19) {
         throw RestClientThreadFactory.newRunException(var19, "hf.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ak")
   public static void method4491(AbstractArchive var0) {
      FloorUnderlayDefinition_archive = var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method4497() {
      this.setHsl(this.rgb * 805645933, 1856707612);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ap")
   public static void method4492(AbstractArchive var0) {
      FloorUnderlayDefinition_archive = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ay")
   public static void method4493(AbstractArchive var0) {
      FloorUnderlayDefinition_archive = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public static void method4495() {
      FloorUnderlayDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public static void method4496() {
      FloorUnderlayDefinition_cached.clear();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method4498() {
      this.setHsl(this.rgb * 805645933, 1951697158);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method4499() {
      this.setHsl(this.rgb * 805645933, 2129601962);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public void postDecode(int var1) {
      try {
         this.setHsl(this.rgb * 805645933, 1891725815);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hf.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method4501() {
      this.setHsl(this.rgb * 805645933, 2012777753);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("nb")
   public void method4517() {
      this.postDecode(-1181210910);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dl")
   public int method4518() {
      return this.lightness * -1928632847;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("wz")
   public int method4519() {
      return this.saturation * -1731148931;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ui")
   public void method4502(Buffer var1, int var2) {
      while (true) {
         int var3 = var1.readUnsignedByte(1804668089);
         if (var3 == 0) {
            return;
         }

         this.decodeNext(var1, var3, var2, 1731898534);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ab")
   public void method4503(Buffer var1, int var2) {
      while (true) {
         int var3 = var1.readUnsignedByte(1262230427);
         if (var3 == 0) {
            return;
         }

         this.decodeNext(var1, var3, var2, 1842352669);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhf;Lxa;II)V")
   @ObfuscatedName("yc")
   public static void method4504(FloorUnderlayDefinition var0, Buffer var1, int var2, int var3) {
      if (var0 == null) {
         var0.decode(var1, var2, var2);
      } else {
         try {
            while (true) {
               int var4 = var1.readUnsignedByte(1123297762);
               if (var4 == 0) {
                  if (var3 <= -1090668795) {
                     return;
                  } else {
                     return;
                  }
               }

               var0.decodeNext(var1, var4, var2, 1734701964);
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "hf.an(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("aw")
   public static void method4494(AbstractArchive var0) {
      FloorUnderlayDefinition_archive = var0;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("al")
   void method4507(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.rgb = var1.readMedium(-223020346) * 548805385;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   void method4511(int var1) {
      double var2 = (var1 >> 16 & 0xFF) / 256.0;
      double var4 = (var1 >> 8 & 0xFF) / 256.0;
      double var6 = (var1 & 0xFF) / 256.0;
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
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.saturation = 1876954581 * (int)(256.0 * var14);
      this.lightness = (int)(256.0 * var16) * -196416751;
      if (-1731148931 * this.saturation < 0) {
         this.saturation = 0;
      } else if (-1731148931 * this.saturation > 255) {
         this.saturation = 1882048299;
      }

      if (this.lightness * -1928632847 < 0) {
         this.lightness = 0;
      } else if (this.lightness * -1928632847 > 255) {
         this.lightness = 1453336047;
      }

      if (var16 > 0.5) {
         this.hueMultiplier = (int)((1.0 - var16) * var14 * 512.0) * 1675748253;
      } else {
         this.hueMultiplier = (int)(var16 * var14 * 512.0) * 1675748253;
      }

      if (this.hueMultiplier * -1636648267 < 1) {
         this.hueMultiplier = 1675748253;
      }

      this.hue = 1215564817 * (int)(this.hueMultiplier * -1636648267 * var12);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   void method4512(int var1) {
      double var2 = (var1 >> 16 & 0xFF) / 256.0;
      double var4 = (var1 >> 8 & 0xFF) / 256.0;
      double var6 = (var1 & 0xFF) / 256.0;
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
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.saturation = 1876954581 * (int)(256.0 * var14);
      this.lightness = (int)(256.0 * var16) * -196416751;
      if (-1731148931 * this.saturation < 0) {
         this.saturation = 0;
      } else if (-1731148931 * this.saturation > 255) {
         this.saturation = 1882048299;
      }

      if (this.lightness * -1928632847 < 0) {
         this.lightness = 0;
      } else if (this.lightness * -1928632847 > 255) {
         this.lightness = 1453336047;
      }

      if (var16 > 0.5) {
         this.hueMultiplier = (int)((1.0 - var16) * var14 * 512.0) * 1675748253;
      } else {
         this.hueMultiplier = (int)(var16 * var14 * 512.0) * 1675748253;
      }

      if (this.hueMultiplier * -1636648267 < 1) {
         this.hueMultiplier = 1675748253;
      }

      this.hue = 1215564817 * (int)(this.hueMultiplier * -1636648267 * var12);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("hn")
   static void method4515(byte var0) {
      try {
         class472.compass = null;
         class39.redHintArrowSprite = null;
         class499.mapSceneSprites = null;
         class66.headIconPkSprites = null;
         class279.headIconPrayerSprites = null;
         SceneTilePaint.headIconHintSprites = null;
         class217.mapDotSprites = null;
         class137.crossSprites = null;
         classWZ.field6473 = null;
         WorldMapArchiveLoader.scrollBarSprites = null;
         UrlRequest.field1731 = null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "hf.hn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ah")
   void method4508(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.rgb = var1.readMedium(-2090123914) * -1760687259;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ar")
   public void method4520(Buffer var1, int var2) {
      method4504(this, var1, var2, -320814010);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("xh")
   public int method4521() {
      return this.hue * 124413169;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)V")
   @ObfuscatedName("ak")
   static final void method4513(String var0, short var1) {
      try {
         SwapSongTask.method10270(Strings.field5044 + var0 + Strings.field5045, (byte)8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hf.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("an")
   public void decode(Buffer var1, int var2, int var3) {
      try {
         while (true) {
            int var4 = var1.method12097(1123297762);
            if (var4 == 0) {
               if (var3 <= -1090668795) {
                  return;
               }

               return;
            }

            this.decodeNext(var1, var4, var2, 1734701964);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hf.an(" + ')');
      }
   }
}
