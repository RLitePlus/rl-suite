import java.util.Arrays;
import net.runelite.api.ColorTextureOverride;
import net.runelite.api.kit.KitType;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oa")
public class PlayerComposition implements net.runelite.api.PlayerComposition {
   @ObfuscatedName("ac")
   long hash;
   @ObfuscatedName("ab")
   long field4396;
   @ObfuscatedName("aj")
   public static short[][] field4398;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ak")
   public static EvictingDualNodeHashTable PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
   @ObfuscatedSignature(descriptor = "Lth;")
   @ObfuscatedName("aw")
   public static class498 field4391 = new class498(16, classTB.field5892);
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4390 = 256;
   @ObfuscatedName("ay")
   int[] field4383;
   @ObfuscatedName("au")
   int[] equipment;
   @ObfuscatedName("az")
   int[] bodyColors;
   @ObfuscatedName("ap")
   public static int field4392 = 0;
   @ObfuscatedName("ai")
   public int gender;
   @ObfuscatedName("as")
   int npcTransformId;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   public static final int field4395 = 62;
   @ObfuscatedName("ad")
   public int field4386 = -151397069;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4394 = 2048;
   @ObfuscatedName("ar")
   boolean field4385;
   @ObfuscatedSignature(descriptor = "[Lgx;")
   @ObfuscatedName("ax")
   PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field4393 = 23;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;I)[I")
   @ObfuscatedName("un")
   public static int[] method7885(PlayerComposition var0, int var1) {
      if (var0 == null) {
         return var0.getEquipmentIds();
      } else {
         int[] var2 = new int[12];

         for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < class408.KitDefinition_fileCount * -2022221137; var4++) {
               KitDefinition var5 = class225.method5278(var4, (byte)12);
               if (null != var5 && !var5.nonSelectable && var5.method4831(var3, var1, (byte)-53)) {
                  var2[class204.method4644(var3, 1719086475)] = var4 + -1277926008;
                  break;
               }
            }
         }

         return var2;
      }
   }

   PlayerComposition(PlayerComposition var1) {
      this.gender = 0;
      this.field4385 = false;
      if (null != var1) {
         int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
         int[] var3 = Arrays.copyOf(var1.field4383, var1.field4383.length);
         PlayerCompositionColorTextureOverride[] var4 = var1.playerCompositionColorTextureOverrides != null
            ? Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length)
            : null;
         int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
         this.method7877(var3, var2, var4, false, var5, var1.gender * -941255479, var1.npcTransformId * 1504383947, var1.field4386 * 1035639301, 4273917);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loa;II)[I")
   @ObfuscatedName("kf")
   public static int[] method7886(PlayerComposition var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method7890(var1, var1);
      } else {
         try {
            int[] var3 = new int[12];

            for (int var4 = 0; var4 < 7; var4++) {
               if (var2 == 1074266368) {
                  throw new IllegalStateException();
               }

               for (int var5 = 0; var5 < class408.KitDefinition_fileCount * -2022221137; var5++) {
                  if (var2 == 1074266368) {
                     throw new IllegalStateException();
                  }

                  KitDefinition var6 = class225.method5278(var5, (byte)12);
                  if (null != var6) {
                     if (var2 == 1074266368) {
                        throw new IllegalStateException();
                     }

                     if (!var6.nonSelectable && var6.method4831(var4, var1, (byte)-72)) {
                        if (var2 == 1074266368) {
                           throw new IllegalStateException();
                        }

                        var3[class204.method4644(var4, 509279286)] = var5 + 256;
                        break;
                     }
                  }
               }
            }

            return var3;
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "oa.ag(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;IZ)V")
   @ObfuscatedName("zs")
   public static void method7891(PlayerComposition var0, int var1, boolean var2) {
      int var3 = var0.equipment[class204.method4644(var1, 1167617809)];
      if (var3 != 0) {
         var3 -= 256;

         KitDefinition var4;
         do {
            if (!var2) {
               if (--var3 < 0) {
                  var3 = class408.KitDefinition_fileCount * 1404191186 - 1;
               }
            } else if (++var3 >= class408.KitDefinition_fileCount * -2022221137) {
               var3 = 0;
            }

            var4 = class225.method5278(var3, (byte)12);
         } while (var4 == null || var4.nonSelectable || !var4.method4831(var1, 162897894 * var0.gender, (byte)-121));

         var0.equipment[class204.method4644(var1, 552333272)] = -320302172 + var3;
         method7905(var0, (byte)-1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;II)V")
   @ObfuscatedName("tk")
   public static void method7923(PlayerComposition var0, int var1, int var2) {
      boolean var3 = var2 != var0.gender * -941255479;
      var0.gender = -1884800066 * var2;
      if (var3) {
         if (var1 == var0.gender * -941255479) {
            for (int var4 = 0; var4 < 7; var4++) {
               int var5 = class204.method4644(var4, -747616206);
               if (var0.equipment[var5] > 0 && var0.equipment[var5] < 2048) {
                  var0.equipment[var5] = var0.field4383[var5];
               }
            }
         } else {
            if (var0.equipment[0] < 2048 || var0.method7930(972583393)) {
               var0.equipment[1469073007 * class222.field2452.field2461] = 1;
            }

            for (int var9 = 0; var9 < 7; var9++) {
               int var10 = class204.method4644(var9, 542238197);
               if (var0.equipment[var10] > 0 && var0.equipment[var10] < 243776978) {
                  int[] var6 = var0.equipment;

                  for (int var7 = 0; var7 < class408.KitDefinition_fileCount * -1288154612; var7++) {
                     KitDefinition var8 = class225.method5278(var7, (byte)12);
                     if (var8 != null && !var8.nonSelectable && var8.method4831(var9, var2, (byte)-127)) {
                        var6[class204.method4644(var9, 922389972)] = 256 + var7;
                        break;
                     }
                  }
               }
            }
         }
      }

      var0.method7922((byte)-17);
   }

   @ObfuscatedSignature(descriptor = "([I[I[Lgx;Z[IIIII)V")
   @ObfuscatedName("av")
   public void method7877(
      int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8, int var9
   ) {
      try {
         this.playerCompositionColorTextureOverrides = var3;
         this.field4385 = var4;
         this.field4386 = 151397069 * var8;
         this.method7884(var1, var2, var5, var6, var7, (byte)81);
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "oa.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;I)V")
   @ObfuscatedName("ry")
   public static void method7952(Model var0, int var1) {
      if (var0.faceAlphas == null) {
         Rasterizer3D.clips.clipX = 0;
      } else {
         Rasterizer3D.clips.clipX = (var0.faceAlphas[var1] == -1 ? 253 : var0.faceAlphas[var1]) & 255;
      }

      if (Rasterizer3D.clips.currentFaceAlpha != 1 || Rasterizer3D.clips.clipX != 0) {
         if (Rasterizer3D.clips.currentFaceAlpha != 0 || Rasterizer3D.clips.clipX == 0) {
            if (Model.field3552[var1]) {
               Model.method6823(var0, var1);
            } else {
               int var2 = var0.indices1[var1];
               int var3 = var0.indices2[var1];
               int var4 = var0.indices3[var1];
               Rasterizer3D.clips.clipping = Model.field3519[var1];
               int var5 = var0.faceBias == null ? 0 : var0.faceBias[var1] * 2;
               float var6 = WorldMapSectionType.method7174(Model.field3525[var2] - var5, 539041483);
               float var7 = WorldMapSectionType.method7174(Model.field3525[var3] - var5, 1810287226);
               float var8 = WorldMapSectionType.method7174(Model.field3525[var4] - var5, -999395799);
               var0.method6821(
                  var1,
                  Model.modelViewportYs[var2],
                  Model.modelViewportYs[var3],
                  Model.modelViewportYs[var4],
                  Model.modelViewportXs[var2],
                  Model.modelViewportXs[var3],
                  Model.modelViewportXs[var4],
                  var6,
                  var7,
                  var8,
                  var0.faceColors1[var1],
                  var0.faceColors2[var1],
                  var0.faceColors3[var1]
               );
            }
         }
      }
   }

   public int getEquipmentId(KitType var1) {
      int var2 = this.getEquipmentIds()[var1.getIndex()];
      return var2 < 2048 ? -1 : var2 - 2048;
   }

   @ObfuscatedSignature(descriptor = "(Loa;B)V")
   @ObfuscatedName("zh")
   public static void method7905(PlayerComposition var0, byte var1) {
      if (var0 == null) {
         var0.setHash(var1);
      } else {
         try {
            long var2 = 5134927487433058529L * var0.hash;
            long[] var4 = Buffer.field6476;
            var0.hash = 5952686814464238815L;

            for (int var5 = 0; var5 < 12; var5++) {
               if (var1 != -1) {
                  throw new IllegalStateException();
               }

               var0.hash = -5952686814464238815L
                  * (var0.hash * 5134927487433058529L >>> 8 ^ var4[(int)((5134927487433058529L * var0.hash ^ var0.equipment[var5] >> 24) & 255L)]);
               var0.hash = (5134927487433058529L * var0.hash >>> 8 ^ var4[(int)((var0.hash * 5134927487433058529L ^ var0.equipment[var5] >> 16) & 255L)])
                  * -5952686814464238815L;
               var0.hash = (var0.hash * 5134927487433058529L >>> 8 ^ var4[(int)((var0.hash * 5134927487433058529L ^ var0.equipment[var5] >> 8) & 255L)])
                  * -5952686814464238815L;
               var0.hash = (var0.hash * 5134927487433058529L >>> 8 ^ var4[(int)((5134927487433058529L * var0.hash ^ var0.equipment[var5]) & 255L)])
                  * -5952686814464238815L;
            }

            if (var0.playerCompositionColorTextureOverrides != null) {
               if (var1 != -1) {
                  throw new IllegalStateException();
               }

               for (int var8 = 0; var8 < var0.playerCompositionColorTextureOverrides.length; var8++) {
                  if (var0.playerCompositionColorTextureOverrides[var8] != null) {
                     if (var1 != -1) {
                        return;
                     }

                     if (null != var0.playerCompositionColorTextureOverrides[var8].playerCompositionRecolorTo) {
                        if (var1 != -1) {
                           return;
                        }

                        for (int var6 = 0; var6 < var0.playerCompositionColorTextureOverrides[var8].playerCompositionRecolorTo.length; var6++) {
                           if (var1 != -1) {
                              throw new IllegalStateException();
                           }

                           var0.hash = -5952686814464238815L
                              * (
                                 5134927487433058529L * var0.hash >>> 8
                                    ^ var4[(int)(
                                       (
                                             var0.hash * 5134927487433058529L
                                                ^ var0.playerCompositionColorTextureOverrides[var8].playerCompositionRecolorTo[var6] >> 8
                                          )
                                          & 255L
                                    )]
                              );
                           var0.hash = -5952686814464238815L
                              * (
                                 5134927487433058529L * var0.hash >>> 8
                                    ^ var4[(int)(
                                       (var0.hash * 5134927487433058529L ^ var0.playerCompositionColorTextureOverrides[var8].playerCompositionRecolorTo[var6])
                                          & 255L
                                    )]
                              );
                        }
                     }

                     if (var0.playerCompositionColorTextureOverrides[var8].playerCompositionRetextureTo != null) {
                        if (var1 != -1) {
                           throw new IllegalStateException();
                        }

                        for (int var10 = 0; var10 < var0.playerCompositionColorTextureOverrides[var8].playerCompositionRetextureTo.length; var10++) {
                           if (var1 != -1) {
                              throw new IllegalStateException();
                           }

                           var0.hash = -5952686814464238815L
                              * (
                                 5134927487433058529L * var0.hash >>> 8
                                    ^ var4[(int)(
                                       (
                                             5134927487433058529L * var0.hash
                                                ^ var0.playerCompositionColorTextureOverrides[var8].playerCompositionRetextureTo[var10] >> 8
                                          )
                                          & 255L
                                    )]
                              );
                           var0.hash = -5952686814464238815L
                              * (
                                 5134927487433058529L * var0.hash >>> 8
                                    ^ var4[(int)(
                                       (
                                             5134927487433058529L * var0.hash
                                                ^ var0.playerCompositionColorTextureOverrides[var8].playerCompositionRetextureTo[var10]
                                          )
                                          & 255L
                                    )]
                              );
                        }
                     }
                  }
               }
            }

            for (int var9 = 0; var9 < 5; var9++) {
               if (var1 != -1) {
                  throw new IllegalStateException();
               }

               var0.hash = -5952686814464238815L
                  * (var0.hash * 5134927487433058529L >>> 8 ^ var4[(int)((5134927487433058529L * var0.hash ^ var0.bodyColors[var9]) & 255L)]);
            }

            label89: {
               var0.hash = (5134927487433058529L * var0.hash >>> 8 ^ var4[(int)((var0.hash * 5134927487433058529L ^ -941255479 * var0.gender) & 255L)])
                  * -5952686814464238815L;
               if (0L != var2) {
                  if (var1 != -1) {
                     return;
                  }

                  if (var2 != 5134927487433058529L * var0.hash) {
                     break label89;
                  }

                  if (var1 != -1) {
                     throw new IllegalStateException();
                  }
               }

               if (!var0.field4385) {
                  return;
               }
            }

            PlayerAppearance_cachedModels.remove(var2);
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "oa.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)V")
   @ObfuscatedName("ae")
   public void method7897(int var1, boolean var2, int var3) {
      try {
         int var4 = this.bodyColors[var1];
         if (!var2) {
            if (var3 >= 2028093277) {
               return;
            }

            do {
               if (--var4 < 0) {
                  if (var3 >= 2028093277) {
                     throw new IllegalStateException();
                  }

                  var4 = ItemContainer.field1065[var1].length - 1;
               }
            } while (!WorldMapRegion.method6985(var1, var4, (byte)71));
         } else {
            do {
               if (++var4 >= ItemContainer.field1065[var1].length) {
                  if (var3 >= 2028093277) {
                     throw new IllegalStateException();
                  }

                  var4 = 0;
               }
            } while (!WorldMapRegion.method6985(var1, var4, (byte)90));

            if (var3 >= 2028093277) {
               return;
            }
         }

         this.bodyColors[var1] = var4;
         method7905(this, (byte)-1);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oa.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;Liw;ILiw;I)Lky;")
   @ObfuscatedName("oe")
   public static Model method7910(PlayerComposition var0, SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (-1 != var0.npcTransformId * 1504383947) {
         return AsyncHttpResponse.getNpcDefinition(var0.npcTransformId * 1504383947, (byte)110).getModel(var1, var2, var3, var4, null, (short)4481);
      } else {
         long var5 = var0.hash * 5134927487433058529L;
         int[] var7 = var0.equipment;
         if (null != var1 && (972490383 * var1.shield >= 0 || -455776013 * var1.weapon >= 0)) {
            var7 = new int[12];
            System.arraycopy(var0.equipment, 0, var7, 0, var7.length);
            if (972490383 * var1.shield >= 0) {
               var5 ^= (long)(var1.shield * 972490383 - var0.equipment[1469073007 * class222.field2448.field2461]) << 40;
               var7[1469073007 * class222.field2448.field2461] = var0.method7949(972490383 * var1.shield, 1280961237);
            }

            if (var1.weapon * -455776013 >= 0) {
               var5 ^= (long)(-455776013 * var1.weapon - var0.equipment[class222.field2449.field2461 * 1469073007]) << 48;
               var7[1469073007 * class222.field2449.field2461] = var0.method7949(-455776013 * var1.weapon, -1149820257);
            }
         }

         Model var8 = (Model)class402.method8806(PlayerAppearance_cachedModels, var5);
         if (var8 == null) {
            boolean var9 = false;

            for (int var10 = 0; var10 < 12; var10++) {
               int var11 = var7[var10];
               if (var0.method7939(var11, (byte)12)) {
                  KitDefinition var12 = var0.KitDefinition_get(var11, (byte)67);
                  if (var12 != null && !var12.ready(-1656519357)) {
                     var9 = true;
                  }
               }

               if (var0.method7944(var11, (byte)0)) {
                  PlayerCompositionColorTextureOverride var20 = null == var0.playerCompositionColorTextureOverrides
                     ? null
                     : var0.playerCompositionColorTextureOverrides[var10];
                  if (!var0.method7947(var11, (byte)2).method5067(var0.gender * -941255479, var20, 1343428063)) {
                     var9 = true;
                  }
               }
            }

            if (var9) {
               if (-2534806694966286359L * var0.field4396 != -1L) {
                  var8 = (Model)class402.method8806(PlayerAppearance_cachedModels, var0.field4396 * -2534806694966286359L);
               }

               if (var8 == null) {
                  return null;
               }
            }

            if (null == var8) {
               ModelData[] var18 = new ModelData[12];
               int var19 = 0;

               for (int var21 = 0; var21 < 12; var21++) {
                  int var13 = var7[var21];
                  if (var0.method7939(var13, (byte)81)) {
                     KitDefinition var14 = var0.KitDefinition_get(var13, (byte)9);
                     ModelData var15 = null;
                     if (null != var14) {
                        var15 = KitDefinition.method4835(var14, -1369110031);
                     }

                     if (var15 != null) {
                        var18[var19++] = var15;
                     }
                  }

                  if (var0.method7944(var13, (byte)0)) {
                     ItemComposition var24 = var0.method7947(var13, (byte)2);
                     PlayerCompositionColorTextureOverride var25 = var0.playerCompositionColorTextureOverrides == null
                        ? null
                        : var0.playerCompositionColorTextureOverrides[var21];
                     ModelData var16 = var24.method5072(-941255479 * var0.gender, var25, (byte)-59);
                     if (null != var16) {
                        var18[var19++] = var16;
                     }
                  }
               }

               ModelData var22 = new ModelData(var18, var19);

               for (int var23 = 0; var23 < 5; var23++) {
                  if (var0.bodyColors[var23] < ItemContainer.field1065[var23].length) {
                     var22.recolor(classDH.field1360[var23], ItemContainer.field1065[var23][var0.bodyColors[var23]]);
                  }

                  if (var0.bodyColors[var23] < field4398[var23].length) {
                     var22.recolor(class358.field4366[var23], field4398[var23][var0.bodyColors[var23]]);
                  }
               }

               var8 = ModelData.method6106(var22, 64, 850, -30, -50, -30);
               PlayerAppearance_cachedModels.put(var8, var5);
               var0.field4396 = var5 * -6230193929615794087L;
            }
         }

         Model var17;
         if (var1 == null && var3 == null) {
            var17 = var8.toSharedSequenceModel(true);
         } else if (null != var1 && null != var3) {
            var17 = var1.applyTransformations(var8, var2, var3, var4, 1660303299);
         } else if (var1 != null) {
            var17 = var1.transformActorModel(var8, var2, (byte)101);
         } else {
            var17 = var3.transformActorModel(var8, var4, (byte)124);
         }

         return var17;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bv")
   public void method7924(int var1, int var2) {
      boolean var3 = var2 != this.gender * -496346954;
      this.gender = -1901051076 * var2;
      if (var3) {
         if (var1 == this.gender * 1624618011) {
            for (int var4 = 0; var4 < 7; var4++) {
               int var5 = class204.method4644(var4, -446357320);
               if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
                  this.equipment[var5] = this.field4383[var5];
               }
            }
         } else {
            if (this.equipment[0] < -990366687 || this.method7930(1133436681)) {
               this.equipment[1162464249 * class222.field2452.field2461] = 1;
            }

            for (int var9 = 0; var9 < 7; var9++) {
               int var10 = class204.method4644(var9, 1442479723);
               if (this.equipment[var10] > 0 && this.equipment[var10] < -1913710930) {
                  int[] var6 = this.equipment;

                  for (int var7 = 0; var7 < class408.KitDefinition_fileCount * -2022221137; var7++) {
                     KitDefinition var8 = class225.method5278(var7, (byte)12);
                     if (var8 != null && !var8.nonSelectable && var8.method4831(var9, var2, (byte)-70)) {
                        var6[class204.method4644(var9, 435596146)] = -1540488324 + var7;
                        break;
                     }
                  }
               }
            }
         }
      }

      this.method7922((byte)-17);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ak")
   public void write(Buffer var1, int var2) {
      try {
         var1.writeByte(-941255479 * this.gender, (short)-465);

         for (int var3 = 0; var3 < 7; var3++) {
            if (var2 >= -703929600) {
               throw new IllegalStateException();
            }

            int var4 = this.equipment[class204.method4644(var3, 756419670)];
            if (var4 == 0) {
               var1.writeShort(-1, -1890891656);
            } else {
               var1.writeShort(var4 - 256, -1721714539);
            }
         }

         for (int var6 = 0; var6 < 5; var6++) {
            if (var2 >= -703929600) {
               throw new IllegalStateException();
            }

            var1.writeByte(this.bodyColors[var6], (short)-9641);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oa.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;I)V")
   @ObfuscatedName("hb")
   public static void method7935(PlayerComposition var0, int var1) {
      if (var0 == null) {
         var0.method7950(var1);
      }

      ItemComposition var2 = class150.ItemDefinition_get(var1, -1518186635);
      var0.equipment[-1427799695 * var2.maleModel] = 2048 + var1;
      if (-1 != -1551751121 * var2.maleModel1) {
         var0.equipment[var2.maleModel1 * -1551751121] = 0;
      }

      if (1456474147 * var2.maleModel2 != -1) {
         var0.equipment[1456474147 * var2.maleModel2] = 0;
      }

      var0.method7922((byte)-16);
   }

   public int getKitId(KitType var1) {
      int var2 = this.getEquipmentIds()[var1.getIndex()];
      return var2 >= 256 && var2 < 2048 ? var2 - 256 : -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;)V")
   @ObfuscatedName("aq")
   public static void method7921(PlayerComposition var0) {
      var0.method7884(var0.field4383, var0.equipment, var0.bodyColors, var0.gender * -941255479, 1504383947 * var0.npcTransformId, (byte)74);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;IZ)V")
   @ObfuscatedName("mp")
   public static void method7898(PlayerComposition var0, int var1, boolean var2) {
      int var3 = var0.bodyColors[var1];
      if (!var2) {
         do {
            if (--var3 < 0) {
               var3 = ItemContainer.field1065[var1].length - 1;
            }
         } while (!WorldMapRegion.method6985(var1, var3, (byte)99));
      } else {
         do {
            if (++var3 >= ItemContainer.field1065[var1].length) {
               var3 = 0;
            }
         } while (!WorldMapRegion.method6985(var1, var3, (byte)83));
      }

      var0.bodyColors[var1] = var3;
      method7905(var0, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljm;")
   @ObfuscatedName("ay")
   ModelData getModelData(int var1) {
      try {
         if (1504383947 * this.npcTransformId != -1) {
            if (var1 == 15597568) {
               throw new IllegalStateException();
            } else {
               return NPCComposition.method4677(AsyncHttpResponse.getNpcDefinition(this.npcTransformId * 1504383947, (byte)124), null, 1968988991);
            }
         } else {
            boolean var2 = false;

            for (int var3 = 0; var3 < 12; var3++) {
               if (var1 == 15597568) {
                  throw new IllegalStateException();
               }

               int var4 = this.equipment[var3];
               if (this.method7939(var4, (byte)56)) {
                  if (var1 == 15597568) {
                     throw new IllegalStateException();
                  }

                  KitDefinition var5 = this.KitDefinition_get(var4, (byte)94);
                  if (null != var5) {
                     if (var1 == 15597568) {
                        throw new IllegalStateException();
                     }

                     if (!KitDefinition.method4839(var5, (byte)32)) {
                        var2 = true;
                     }
                  }
               }

               if (this.method7944(var4, (byte)0)) {
                  if (var1 == 15597568) {
                     throw new IllegalStateException();
                  }

                  PlayerCompositionColorTextureOverride var12 = this.playerCompositionColorTextureOverrides == null
                     ? null
                     : this.playerCompositionColorTextureOverrides[var3];
                  if (!this.method7947(var4, (byte)2).method5075(this.gender * -941255479, var12, (byte)9)) {
                     var2 = true;
                  }
               }
            }

            if (!var2) {
               ModelData[] var10 = new ModelData[12];
               int var11 = 0;

               for (int var13 = 0; var13 < 12; var13++) {
                  if (var1 == 15597568) {
                     throw new IllegalStateException();
                  }

                  int var6 = this.equipment[var13];
                  if (this.method7939(var6, (byte)27)) {
                     if (var1 == 15597568) {
                        throw new IllegalStateException();
                     }

                     KitDefinition var7 = this.KitDefinition_get(var6, (byte)68);
                     ModelData var8 = null;
                     if (var7 != null) {
                        if (var1 == 15597568) {
                           throw new IllegalStateException();
                        }

                        var8 = var7.getKitDefinitionModels(-1793120611);
                     }

                     if (var8 != null) {
                        if (var1 == 15597568) {
                           throw new IllegalStateException();
                        }

                        var10[var11++] = var8;
                     }
                  }

                  if (this.method7944(var6, (byte)0)) {
                     PlayerCompositionColorTextureOverride var16 = null == this.playerCompositionColorTextureOverrides
                        ? null
                        : this.playerCompositionColorTextureOverrides[var13];
                     ModelData var17 = this.method7947(var6, (byte)2).method5078(-941255479 * this.gender, var16, 2082315204);
                     if (var17 != null) {
                        if (var1 == 15597568) {
                           throw new IllegalStateException();
                        }

                        var10[var11++] = var17;
                     }
                  }
               }

               ModelData var14 = new ModelData(var10, var11);

               for (int var15 = 0; var15 < 5; var15++) {
                  if (var1 == 15597568) {
                     throw new IllegalStateException();
                  }

                  if (this.bodyColors[var15] < ItemContainer.field1065[var15].length) {
                     if (var1 == 15597568) {
                        throw new IllegalStateException();
                     }

                     var14.recolor(classDH.field1360[var15], ItemContainer.field1065[var15][this.bodyColors[var15]]);
                  }

                  if (this.bodyColors[var15] < field4398[var15].length) {
                     if (var1 == 15597568) {
                        throw new IllegalStateException();
                     }

                     var14.recolor(class358.field4366[var15], field4398[var15][this.bodyColors[var15]]);
                  }
               }

               return var14;
            } else if (var1 == 15597568) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "oa.ay(" + ')');
      }
   }

   public void setTransformedNpcId(int var1) {
      this.npcTransformId = var1 * 361232867;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("as")
   public void method7925(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (var2 != this.gender * -941255479) {
            if (var3 != -1704793879) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         this.gender = 101631353 * var2;
         if (var4) {
            if (var3 != -1704793879) {
               throw new IllegalStateException();
            }

            if (var1 == this.gender * -941255479) {
               for (int var5 = 0; var5 < 7; var5++) {
                  if (var3 != -1704793879) {
                     return;
                  }

                  int var6 = class204.method4644(var5, 1203201785);
                  if (this.equipment[var6] > 0) {
                     if (var3 != -1704793879) {
                        return;
                     }

                     if (this.equipment[var6] < 2048) {
                        if (var3 != -1704793879) {
                           throw new IllegalStateException();
                        }

                        this.equipment[var6] = this.field4383[var6];
                     }
                  }
               }
            } else {
               label119: {
                  if (this.equipment[0] >= 2048) {
                     if (var3 != -1704793879) {
                        throw new IllegalStateException();
                     }

                     if (!this.method7930(-1439515718)) {
                        break label119;
                     }

                     if (var3 != -1704793879) {
                        throw new IllegalStateException();
                     }
                  }

                  this.equipment[1469073007 * class222.field2452.field2461] = 1;
               }

               for (int var11 = 0; var11 < 7; var11++) {
                  if (var3 != -1704793879) {
                     throw new IllegalStateException();
                  }

                  int var12 = class204.method4644(var11, 1858130303);
                  if (this.equipment[var12] > 0 && this.equipment[var12] < 2048) {
                     if (var3 != -1704793879) {
                        return;
                     }

                     int[] var7 = this.equipment;

                     for (int var8 = 0; var8 < class408.KitDefinition_fileCount * -2022221137; var8++) {
                        if (var3 != -1704793879) {
                           throw new IllegalStateException();
                        }

                        KitDefinition var9 = class225.method5278(var8, (byte)12);
                        if (var9 != null) {
                           if (var3 != -1704793879) {
                              throw new IllegalStateException();
                           }

                           if (!var9.nonSelectable) {
                              if (var3 != -1704793879) {
                                 return;
                              }

                              if (var9.method4831(var11, var2, (byte)-110)) {
                                 if (var3 != -1704793879) {
                                    throw new IllegalStateException();
                                 }

                                 var7[class204.method4644(var11, 1095019635)] = 256 + var8;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         this.method7922((byte)113);
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "oa.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;I)Lis;")
   @ObfuscatedName("ox")
   public static ItemComposition method7946(PlayerComposition var0, int var1) {
      if (var0 == null) {
         var0.method7918();
      }

      return class150.ItemDefinition_get(var1 - 335323076, -926679432);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ai")
   boolean method7938(int var1) {
      return var1 >= 256 && var1 < 2048;
   }

   public int[] getEquipmentIds() {
      return this.equipment;
   }

   @ObfuscatedSignature(descriptor = "(I)Lhy;")
   @ObfuscatedName("cx")
   KitDefinition method7941(int var1) {
      return class225.method5278(var1 - 822405849, (byte)12);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltm;II)V")
   @ObfuscatedName("vf")
   public static void method7875(Buddy var0, int var1, int var2) {
      if (var0 == null) {
         var0.hasWorld(var1);
      }

      var0.world = var1 * 1697130425;
      var0.int2 = 712191463 * var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   public void method7900(int var1) {
      if (this.gender * -941255479 != var1) {
         this.method7884(null, null, this.bodyColors, var1, -1, (byte)16);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("bb")
   public void method7892(int var1, boolean var2) {
      int var3 = this.equipment[class204.method4644(var1, -538869809)];
      if (var3 != 0) {
         var3 -= 256;

         KitDefinition var4;
         do {
            if (!var2) {
               if (--var3 < 0) {
                  var3 = class408.KitDefinition_fileCount * -73117665 - 1;
               }
            } else if (++var3 >= class408.KitDefinition_fileCount * -2022221137) {
               var3 = 0;
            }

            var4 = class225.method5278(var3, (byte)12);
         } while (var4 == null || var4.nonSelectable || !var4.method4831(var1, -318986204 * this.gender, (byte)-100));

         this.equipment[class204.method4644(var1, 1450412275)] = 256 + var3;
         method7905(this, (byte)-1);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ar")
   boolean method7944(int var1, byte var2) {
      try {
         boolean var10000;
         if (var1 >= 2048) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oa.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lis;")
   @ObfuscatedName("ah")
   ItemComposition method7947(int var1, byte var2) {
      try {
         return class150.ItemDefinition_get(var1 - 2048, -1109073512);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oa.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("al")
   int method7949(int var1, int var2) {
      try {
         return var1 - 512 + 2048;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oa.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([I[I[Lgx;Z[IIII)V")
   @ObfuscatedName("af")
   public void method7878(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.playerCompositionColorTextureOverrides = var3;
      this.field4385 = var4;
      this.field4386 = 151397069 * var8;
      this.method7884(var1, var2, var5, var6, var7, (byte)18);
   }

   public PlayerComposition() {
      this.gender = 0;
      this.field4385 = false;
   }

   public int getTransformedNpcId() {
      return this.npcTransformId * 1504383947;
   }

   @ObfuscatedSignature(descriptor = "([I[I[Lgx;Z[IIII)V")
   @ObfuscatedName("ao")
   public void method7879(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.playerCompositionColorTextureOverrides = var3;
      this.field4385 = var4;
      this.field4386 = 151397069 * var8;
      this.method7884(var1, var2, var5, var6, var7, (byte)73);
   }

   @ObfuscatedSignature(descriptor = "([I[I[Lgx;Z[IIII)V")
   @ObfuscatedName("aa")
   public void method7880(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.playerCompositionColorTextureOverrides = var3;
      this.field4385 = var4;
      this.field4386 = 811407440 * var8;
      this.method7884(var1, var2, var5, var6, var7, (byte)80);
   }

   @ObfuscatedSignature(descriptor = "([I[I[III)V")
   @ObfuscatedName("aq")
   public void method7882(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = method7886(this, var4, -817405794);
      }

      if (null == var2) {
         var2 = method7886(this, var4, -1431738362);
      }

      this.field4383 = var1;
      this.equipment = var2;
      this.bodyColors = var3;
      this.gender = 101631353 * var4;
      this.npcTransformId = 361232867 * var5;
      method7905(this, (byte)-1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;[I[I[Lgx;Z[IIII)V")
   @ObfuscatedName("nt")
   public static void method7881(
      PlayerComposition var0, int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8
   ) {
      if (var0 == null) {
         var0.setTransformedNpcId(var6);
      } else {
         var0.playerCompositionColorTextureOverrides = var3;
         var0.field4385 = var4;
         var0.field4386 = 151397069 * var8;
         var0.method7884(var1, var2, var5, var6, var7, (byte)88);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   void method7922(byte var1) {
      try {
         this.method7884(this.field4383, this.equipment, this.bodyColors, this.gender * -941255479, 1504383947 * this.npcTransformId, (byte)2);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oa.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loa;III)V")
   @ObfuscatedName("jw")
   public static void method7931(PlayerComposition var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method7933(var1, var1, var1);
      }

      try {
         var0.bodyColors[var1] = var2;
         var0.method7922((byte)-54);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oa.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("bg")
   int[] method7887(int var1) {
      int[] var2 = new int[12];

      for (int var3 = 0; var3 < 7; var3++) {
         for (int var4 = 0; var4 < class408.KitDefinition_fileCount * -2022221137; var4++) {
            KitDefinition var5 = class225.method5278(var4, (byte)12);
            if (null != var5 && !var5.nonSelectable && var5.method4831(var3, var1, (byte)-13)) {
               var2[class204.method4644(var3, 530948692)] = var4 + 256;
               break;
            }
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("bz")
   int[] method7888(int var1) {
      int[] var2 = new int[12];

      for (int var3 = 0; var3 < 7; var3++) {
         for (int var4 = 0; var4 < class408.KitDefinition_fileCount * -2022221137; var4++) {
            KitDefinition var5 = class225.method5278(var4, (byte)12);
            if (null != var5 && !var5.nonSelectable && var5.method4831(var3, var1, (byte)-74)) {
               var2[class204.method4644(var3, 1089507725)] = var4 + 256;
               break;
            }
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   boolean method7927() {
      if (!this.method7944(this.equipment[0], (byte)0)) {
         return false;
      } else {
         ItemComposition var1 = this.method7947(this.equipment[0], (byte)2);
         return var1.maleModel1 * 1176745383 != 1469073007 * class222.field2452.field2461
            && 1469073007 * class222.field2452.field2461 != var1.maleModel2 * 1456474147;
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;ILiw;I)Lky;")
   @ObfuscatedName("bd")
   public Model method7911(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (-1 != this.npcTransformId * 1504383947) {
         return AsyncHttpResponse.getNpcDefinition(this.npcTransformId * 1504383947, (byte)12).getModel(var1, var2, var3, var4, null, (short)19132);
      } else {
         long var5 = this.hash * 5134927487433058529L;
         int[] var7 = this.equipment;
         if (null != var1 && (972490383 * var1.shield >= 0 || -455776013 * var1.weapon >= 0)) {
            var7 = new int[12];
            System.arraycopy(this.equipment, 0, var7, 0, var7.length);
            if (972490383 * var1.shield >= 0) {
               var5 ^= (long)(var1.shield * 972490383 - this.equipment[1469073007 * class222.field2448.field2461]) << 40;
               var7[1469073007 * class222.field2448.field2461] = this.method7949(972490383 * var1.shield, -1285746792);
            }

            if (var1.weapon * -455776013 >= 0) {
               var5 ^= (long)(-455776013 * var1.weapon - this.equipment[class222.field2449.field2461 * 1469073007]) << 48;
               var7[1469073007 * class222.field2449.field2461] = this.method7949(-455776013 * var1.weapon, -1060148429);
            }
         }

         Model var8 = (Model)class402.method8806(PlayerAppearance_cachedModels, var5);
         if (var8 == null) {
            boolean var9 = false;

            for (int var10 = 0; var10 < 12; var10++) {
               int var11 = var7[var10];
               if (this.method7939(var11, (byte)67)) {
                  KitDefinition var12 = this.KitDefinition_get(var11, (byte)98);
                  if (var12 != null && !var12.ready(-1506262279)) {
                     var9 = true;
                  }
               }

               if (this.method7944(var11, (byte)0)) {
                  PlayerCompositionColorTextureOverride var20 = null == this.playerCompositionColorTextureOverrides
                     ? null
                     : this.playerCompositionColorTextureOverrides[var10];
                  if (!this.method7947(var11, (byte)2).method5067(this.gender * -941255479, var20, 1343428063)) {
                     var9 = true;
                  }
               }
            }

            if (var9) {
               if (-2534806694966286359L * this.field4396 != -1L) {
                  var8 = (Model)class402.method8806(PlayerAppearance_cachedModels, this.field4396 * -2534806694966286359L);
               }

               if (var8 == null) {
                  return null;
               }
            }

            if (null == var8) {
               ModelData[] var18 = new ModelData[12];
               int var19 = 0;

               for (int var21 = 0; var21 < 12; var21++) {
                  int var13 = var7[var21];
                  if (this.method7939(var13, (byte)44)) {
                     KitDefinition var14 = this.KitDefinition_get(var13, (byte)106);
                     ModelData var15 = null;
                     if (null != var14) {
                        var15 = KitDefinition.method4835(var14, 38790168);
                     }

                     if (var15 != null) {
                        var18[var19++] = var15;
                     }
                  }

                  if (this.method7944(var13, (byte)0)) {
                     ItemComposition var24 = this.method7947(var13, (byte)2);
                     PlayerCompositionColorTextureOverride var25 = this.playerCompositionColorTextureOverrides == null
                        ? null
                        : this.playerCompositionColorTextureOverrides[var21];
                     ModelData var16 = var24.method5072(-941255479 * this.gender, var25, (byte)-21);
                     if (null != var16) {
                        var18[var19++] = var16;
                     }
                  }
               }

               ModelData var22 = new ModelData(var18, var19);

               for (int var23 = 0; var23 < 5; var23++) {
                  if (this.bodyColors[var23] < ItemContainer.field1065[var23].length) {
                     var22.recolor(classDH.field1360[var23], ItemContainer.field1065[var23][this.bodyColors[var23]]);
                  }

                  if (this.bodyColors[var23] < field4398[var23].length) {
                     var22.recolor(class358.field4366[var23], field4398[var23][this.bodyColors[var23]]);
                  }
               }

               var8 = ModelData.method6106(var22, 64, 850, -30, -50, -30);
               PlayerAppearance_cachedModels.put(var8, var5);
               this.field4396 = var5 * -6230193929615794087L;
            }
         }

         Model var17;
         if (var1 == null && var3 == null) {
            var17 = var8.toSharedSequenceModel(true);
         } else if (null != var1 && null != var3) {
            var17 = var1.applyTransformations(var8, var2, var3, var4, 1484868970);
         } else if (var1 != null) {
            var17 = var1.transformActorModel(var8, var2, (byte)22);
         } else {
            var17 = var3.transformActorModel(var8, var4, (byte)84);
         }

         return var17;
      }
   }

   public int[] getColors() {
      return this.bodyColors;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;I)[I")
   @ObfuscatedName("mi")
   public static int[] method7889(PlayerComposition var0, int var1) {
      if (var0 == null) {
         var0.method7941(var1);
      }

      int[] var2 = new int[12];

      for (int var3 = 0; var3 < 7; var3++) {
         for (int var4 = 0; var4 < class408.KitDefinition_fileCount * -2022221137; var4++) {
            KitDefinition var5 = class225.method5278(var4, (byte)12);
            if (null != var5 && !var5.nonSelectable && var5.method4831(var3, var1, (byte)-20)) {
               var2[class204.method4644(var3, 623358166)] = var4 + 256;
               break;
            }
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ac")
   public void method7936(int var1, int var2) {
      try {
         ItemComposition var3 = class150.ItemDefinition_get(var1, -674277938);
         this.equipment[-1427799695 * var3.maleModel] = 2048 + var1;
         if (-1 != -1551751121 * var3.maleModel1) {
            if (var2 <= -1675120777) {
               throw new IllegalStateException();
            }

            this.equipment[var3.maleModel1 * -1551751121] = 0;
         }

         if (1456474147 * var3.maleModel2 != -1) {
            if (var2 <= -1675120777) {
               throw new IllegalStateException();
            }

            this.equipment[1456474147 * var3.maleModel2] = 0;
         }

         this.method7922((byte)80);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oa.ac(" + ')');
      }
   }

   public int getGender() {
      return this.gender * -941255479;
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("bp")
   public void method7899(int var1, boolean var2) {
      int var3 = this.bodyColors[var1];
      if (!var2) {
         do {
            if (--var3 < 0) {
               var3 = ItemContainer.field1065[var1].length - 1;
            }
         } while (!WorldMapRegion.method6985(var1, var3, (byte)12));
      } else {
         do {
            if (++var3 >= ItemContainer.field1065[var1].length) {
               var3 = 0;
            }
         } while (!WorldMapRegion.method6985(var1, var3, (byte)90));
      }

      this.bodyColors[var1] = var3;
      method7905(this, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("bj")
   public void method7893(int var1, boolean var2) {
      int var3 = this.equipment[class204.method4644(var1, 703734967)];
      if (var3 != 0) {
         var3 -= 256;

         KitDefinition var4;
         do {
            if (!var2) {
               if (--var3 < 0) {
                  var3 = class408.KitDefinition_fileCount * -2022221137 - 1;
               }
            } else if (++var3 >= class408.KitDefinition_fileCount * -2022221137) {
               var3 = 0;
            }

            var4 = class225.method5278(var3, (byte)12);
         } while (var4 == null || var4.nonSelectable || !var4.method4831(var1, -941255479 * this.gender, (byte)-28));

         this.equipment[class204.method4644(var1, 392822962)] = 256 + var3;
         method7905(this, (byte)-1);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   public void method7901(int var1, int var2) {
      try {
         if (this.gender * -941255479 == var1) {
            if (var2 != -227265447) {
               ;
            }
         } else {
            this.method7884(null, null, this.bodyColors, var1, -1, (byte)39);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oa.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;I)V")
   @ObfuscatedName("bd")
   public static void method7902(PlayerComposition var0, int var1) {
      if (var0.gender * -941255479 != var1) {
         var0.method7884(null, null, var0.bodyColors, var1, -1, (byte)72);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loa;Liw;ILiw;IB)Lky;")
   @ObfuscatedName("jo")
   public static Model method7912(PlayerComposition var0, SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, byte var5) {
      if (var0 == null) {
         return var0.getModel(var1, var2, var1, var2, var5);
      } else {
         try {
            if (-1 != var0.npcTransformId * 1504383947) {
               if (var5 <= 1) {
                  throw new IllegalStateException();
               } else {
                  return AsyncHttpResponse.getNpcDefinition(var0.npcTransformId * 1504383947, (byte)37).getModel(var1, var2, var3, var4, null, (short)5628);
               }
            } else {
               long var6;
               int[] var8;
               var6 = var0.hash * 5134927487433058529L;
               var8 = var0.equipment;
               label264:
               if (null != var1) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (972490383 * var1.shield < 0) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (-455776013 * var1.weapon < 0) {
                        break label264;
                     }

                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }
                  }

                  var8 = new int[12];
                  System.arraycopy(var0.equipment, 0, var8, 0, var8.length);
                  if (972490383 * var1.shield >= 0) {
                     var6 ^= (long)(var1.shield * 972490383 - var0.equipment[1469073007 * class222.field2448.field2461]) << 40;
                     var8[1469073007 * class222.field2448.field2461] = var0.method7949(972490383 * var1.shield, -214839257);
                  }

                  if (var1.weapon * -455776013 >= 0) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     var6 ^= (long)(-455776013 * var1.weapon - var0.equipment[class222.field2449.field2461 * 1469073007]) << 48;
                     var8[1469073007 * class222.field2449.field2461] = var0.method7949(-455776013 * var1.weapon, -1234139603);
                  }
               }

               Model var9 = (Model)class402.method8806(PlayerAppearance_cachedModels, var6);
               if (var9 == null) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  boolean var10 = false;

                  for (int var11 = 0; var11 < 12; var11++) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     int var12 = var8[var11];
                     if (var0.method7939(var12, (byte)116)) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        KitDefinition var13 = var0.KitDefinition_get(var12, (byte)69);
                        if (var13 != null) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (!var13.ready(-897175459)) {
                              if (var5 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var10 = true;
                           }
                        }
                     }

                     if (var0.method7944(var12, (byte)0)) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        PlayerCompositionColorTextureOverride var22 = null == var0.playerCompositionColorTextureOverrides
                           ? null
                           : var0.playerCompositionColorTextureOverrides[var11];
                        if (!var0.method7947(var12, (byte)2).method5067(var0.gender * -941255479, var22, 1343428063)) {
                           var10 = true;
                        }
                     }
                  }

                  if (var10) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (-2534806694966286359L * var0.field4396 != -1L) {
                        var9 = (Model)class402.method8806(PlayerAppearance_cachedModels, var0.field4396 * -2534806694966286359L);
                     }

                     if (var9 == null) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        return null;
                     }
                  }

                  if (null == var9) {
                     ModelData[] var20 = new ModelData[12];
                     int var21 = 0;

                     for (int var23 = 0; var23 < 12; var23++) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        int var14 = var8[var23];
                        if (var0.method7939(var14, (byte)116)) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           KitDefinition var15 = var0.KitDefinition_get(var14, (byte)116);
                           ModelData var16 = null;
                           if (null != var15) {
                              if (var5 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var16 = KitDefinition.method4835(var15, -317308515);
                           }

                           if (var16 != null) {
                              if (var5 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var20[var21++] = var16;
                           }
                        }

                        if (var0.method7944(var14, (byte)0)) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           ItemComposition var26 = var0.method7947(var14, (byte)2);
                           PlayerCompositionColorTextureOverride var10000;
                           if (var0.playerCompositionColorTextureOverrides == null) {
                              if (var5 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = null;
                           } else {
                              var10000 = var0.playerCompositionColorTextureOverrides[var23];
                           }

                           PlayerCompositionColorTextureOverride var27 = var10000;
                           ModelData var17 = var26.method5072(-941255479 * var0.gender, var27, (byte)118);
                           if (null != var17) {
                              if (var5 <= 1) {
                                 throw new IllegalStateException();
                              }

                              var20[var21++] = var17;
                           }
                        }
                     }

                     ModelData var24 = new ModelData(var20, var21);

                     for (int var25 = 0; var25 < 5; var25++) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (var0.bodyColors[var25] < ItemContainer.field1065[var25].length) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           var24.recolor(classDH.field1360[var25], ItemContainer.field1065[var25][var0.bodyColors[var25]]);
                        }

                        if (var0.bodyColors[var25] < field4398[var25].length) {
                           var24.recolor(class358.field4366[var25], field4398[var25][var0.bodyColors[var25]]);
                        }
                     }

                     var9 = ModelData.method6106(var24, 64, 850, -30, -50, -30);
                     PlayerAppearance_cachedModels.put(var9, var6);
                     var0.field4396 = var6 * -6230193929615794087L;
                  }
               }

               if (var1 == null) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var3 == null) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     Model var30 = var9.toSharedSequenceModel(true);
                     return var30;
                  }
               }

               if (null != var1) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (null != var3) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     Model var29 = var1.applyTransformations(var9, var2, var3, var4, 1784213328);
                     return var29;
                  }
               }

               Model var19;
               if (var1 != null) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  var19 = var1.transformActorModel(var9, var2, (byte)45);
               } else {
                  var19 = var3.transformActorModel(var9, var4, (byte)78);
               }

               return var19;
            }
         } catch (RuntimeException var18) {
            throw RestClientThreadFactory.newRunException(var18, "oa.ap(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Loa;IZI)V")
   @ObfuscatedName("lm")
   public static void method7894(PlayerComposition var0, int var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.changeAppearance(var1, var2, var1);
      }

      try {
         int var4 = var0.equipment[class204.method4644(var1, 256183483)];
         if (var4 == 0) {
            if (var3 >= 1063009849) {
               throw new IllegalStateException();
            }
         } else {
            var4 -= 256;

            while (true) {
               if (!var2) {
                  if (var3 >= 1063009849) {
                     throw new IllegalStateException();
                  }

                  if (--var4 < 0) {
                     if (var3 >= 1063009849) {
                        throw new IllegalStateException();
                     }

                     var4 = class408.KitDefinition_fileCount * -2022221137 - 1;
                  }
               } else if (++var4 >= class408.KitDefinition_fileCount * -2022221137) {
                  if (var3 >= 1063009849) {
                     throw new IllegalStateException();
                  }

                  var4 = 0;
               }

               KitDefinition var5 = class225.method5278(var4, (byte)12);
               if (var5 != null) {
                  if (var3 >= 1063009849) {
                     throw new IllegalStateException();
                  }

                  if (!var5.nonSelectable && var5.method4831(var1, -941255479 * var0.gender, (byte)-114)) {
                     if (var3 >= 1063009849) {
                        throw new IllegalStateException();
                     }

                     var0.equipment[class204.method4644(var1, -193861154)] = 256 + var4;
                     method7905(var0, (byte)-1);
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "oa.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ab")
   boolean method7939(int var1, byte var2) {
      try {
         if (var1 >= 256) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (var1 < 2048) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oa.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   void method7906() {
      long var1 = 5134927487433058529L * this.hash;
      long[] var3 = Buffer.field6476;
      this.hash = 5952686814464238815L;

      for (int var4 = 0; var4 < 12; var4++) {
         this.hash = -5952686814464238815L
            * (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.equipment[var4] >> 24) & 255L)]);
         this.hash = (5134927487433058529L * this.hash >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ this.equipment[var4] >> 16) & 255L)])
            * -5952686814464238815L;
         this.hash = (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ this.equipment[var4] >> 8) & 255L)])
            * -5952686814464238815L;
         this.hash = (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.equipment[var4]) & 255L)])
            * -5952686814464238815L;
      }

      if (this.playerCompositionColorTextureOverrides != null) {
         for (int var6 = 0; var6 < this.playerCompositionColorTextureOverrides.length; var6++) {
            if (this.playerCompositionColorTextureOverrides[var6] != null) {
               if (null != this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo) {
                  for (int var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo.length; var5++) {
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (this.hash * 5134927487433058529L ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo[var5] >> 8)
                                    & 255L
                              )]
                        );
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (this.hash * 5134927487433058529L ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo[var5]) & 255L
                              )]
                        );
                  }
               }

               if (this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo != null) {
                  for (int var8 = 0; var8 < this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo.length; var8++) {
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (5134927487433058529L * this.hash ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo[var8] >> 8)
                                    & 255L
                              )]
                        );
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (5134927487433058529L * this.hash ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo[var8])
                                    & 255L
                              )]
                        );
                  }
               }
            }
         }
      }

      for (int var7 = 0; var7 < 5; var7++) {
         this.hash = -5952686814464238815L
            * (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.bodyColors[var7]) & 255L)]);
      }

      this.hash = (5134927487433058529L * this.hash >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ -941255479 * this.gender) & 255L)])
         * -5952686814464238815L;
      if (0L != var1 && var1 != 5134927487433058529L * this.hash || this.field4385) {
         PlayerAppearance_cachedModels.remove(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   void method7907() {
      long var1 = 5134927487433058529L * this.hash;
      long[] var3 = Buffer.field6476;
      this.hash = 5952686814464238815L;

      for (int var4 = 0; var4 < 12; var4++) {
         this.hash = -5952686814464238815L
            * (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.equipment[var4] >> 24) & 255L)]);
         this.hash = (5134927487433058529L * this.hash >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ this.equipment[var4] >> 16) & 255L)])
            * -5952686814464238815L;
         this.hash = (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ this.equipment[var4] >> 8) & 255L)])
            * -5952686814464238815L;
         this.hash = (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.equipment[var4]) & 255L)])
            * -5952686814464238815L;
      }

      if (this.playerCompositionColorTextureOverrides != null) {
         for (int var6 = 0; var6 < this.playerCompositionColorTextureOverrides.length; var6++) {
            if (this.playerCompositionColorTextureOverrides[var6] != null) {
               if (null != this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo) {
                  for (int var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo.length; var5++) {
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (this.hash * 5134927487433058529L ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo[var5] >> 8)
                                    & 255L
                              )]
                        );
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (this.hash * 5134927487433058529L ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo[var5]) & 255L
                              )]
                        );
                  }
               }

               if (this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo != null) {
                  for (int var8 = 0; var8 < this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo.length; var8++) {
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (5134927487433058529L * this.hash ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo[var8] >> 8)
                                    & 255L
                              )]
                        );
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (5134927487433058529L * this.hash ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo[var8])
                                    & 255L
                              )]
                        );
                  }
               }
            }
         }
      }

      for (int var7 = 0; var7 < 5; var7++) {
         this.hash = -5952686814464238815L
            * (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.bodyColors[var7]) & 255L)]);
      }

      this.hash = (5134927487433058529L * this.hash >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ -941255479 * this.gender) & 255L)])
         * -5952686814464238815L;
      if (0L != var1 && var1 != 5134927487433058529L * this.hash || this.field4385) {
         PlayerAppearance_cachedModels.remove(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loa;B)I")
   @ObfuscatedName("ot")
   public static int method7917(PlayerComposition var0, byte var1) {
      if (var0 == null) {
         return var0.getChatHeadId(var1);
      } else {
         try {
            long var2 = 5134927487433058529L * var0.hash;
            if (1504383947 * var0.npcTransformId != -1) {
               var2 = -65536L | 1504383947 * var0.npcTransformId;
            }

            Integer var4 = (Integer)class498.method10645(field4391, var2, 1934219016);
            if (null == var4) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               var4 = (field4392 += 721221853) * 629514101 - 1;
               field4391.method10647(var2, var4, 1214301467);
               field4392 = 721221853 * (629514101 * field4392 % 65535);
            }

            return var4;
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "oa.au(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   public int method7918() {
      long var1 = 5134927487433058529L * this.hash;
      if (-1172870409 * this.npcTransformId != -1) {
         var1 = -65536L | 1504383947 * this.npcTransformId;
      }

      Integer var3 = (Integer)class498.method10645(field4391, var1, 1934219016);
      if (null == var3) {
         var3 = (field4392 += 721221853) * 629514101 - 1;
         field4391.method10647(var1, var3, 2059009040);
         field4392 = -265527099 * (629514101 * field4392 % 1273630926);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("by")
   public void method7904(Buffer var1) {
      var1.writeByte(-941255479 * this.gender, (short)-22157);

      for (int var2 = 0; var2 < 7; var2++) {
         int var3 = this.equipment[class204.method4644(var2, 473621231)];
         if (var3 == 0) {
            var1.writeShort(-1, -1429972536);
         } else {
            var1.writeShort(var3 - 256, -1204352326);
         }
      }

      for (int var4 = 0; var4 < 5; var4++) {
         var1.writeByte(this.bodyColors[var4], (short)-4654);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("bh")
   ModelData method7915() {
      if (1504383947 * this.npcTransformId != -1) {
         return NPCComposition.method4677(AsyncHttpResponse.getNpcDefinition(this.npcTransformId * 1504383947, (byte)101), null, -303983471);
      } else {
         boolean var1 = false;

         for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.equipment[var2];
            if (this.method7939(var3, (byte)84)) {
               KitDefinition var4 = this.KitDefinition_get(var3, (byte)110);
               if (null != var4 && !KitDefinition.method4839(var4, (byte)32)) {
                  var1 = true;
               }
            }

            if (this.method7944(var3, (byte)0)) {
               PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null
                  ? null
                  : this.playerCompositionColorTextureOverrides[var2];
               if (!this.method7947(var3, (byte)2).method5075(this.gender * -941255479, var10, (byte)11)) {
                  var1 = true;
               }
            }
         }

         if (var1) {
            return null;
         } else {
            ModelData[] var8 = new ModelData[12];
            int var9 = 0;

            for (int var11 = 0; var11 < 12; var11++) {
               int var5 = this.equipment[var11];
               if (this.method7939(var5, (byte)74)) {
                  KitDefinition var6 = this.KitDefinition_get(var5, (byte)31);
                  ModelData var7 = null;
                  if (var6 != null) {
                     var7 = var6.getKitDefinitionModels(-1793120611);
                  }

                  if (var7 != null) {
                     var8[var9++] = var7;
                  }
               }

               if (this.method7944(var5, (byte)0)) {
                  PlayerCompositionColorTextureOverride var14 = null == this.playerCompositionColorTextureOverrides
                     ? null
                     : this.playerCompositionColorTextureOverrides[var11];
                  ModelData var15 = this.method7947(var5, (byte)2).method5078(-941255479 * this.gender, var14, 315011975);
                  if (var15 != null) {
                     var8[var9++] = var15;
                  }
               }
            }

            ModelData var12 = new ModelData(var8, var9);

            for (int var13 = 0; var13 < 5; var13++) {
               if (this.bodyColors[var13] < ItemContainer.field1065[var13].length) {
                  var12.recolor(classDH.field1360[var13], ItemContainer.field1065[var13][this.bodyColors[var13]]);
               }

               if (this.bodyColors[var13] < field4398[var13].length) {
                  var12.recolor(class358.field4366[var13], field4398[var13][this.bodyColors[var13]]);
               }
            }

            return var12;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("bl")
   ModelData method7916() {
      if (1504383947 * this.npcTransformId != -1) {
         return NPCComposition.method4677(AsyncHttpResponse.getNpcDefinition(this.npcTransformId * 1504383947, (byte)9), null, -466000621);
      } else {
         boolean var1 = false;

         for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.equipment[var2];
            if (this.method7939(var3, (byte)59)) {
               KitDefinition var4 = this.KitDefinition_get(var3, (byte)9);
               if (null != var4 && !KitDefinition.method4839(var4, (byte)32)) {
                  var1 = true;
               }
            }

            if (this.method7944(var3, (byte)0)) {
               PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null
                  ? null
                  : this.playerCompositionColorTextureOverrides[var2];
               if (!this.method7947(var3, (byte)2).method5075(this.gender * -941255479, var10, (byte)91)) {
                  var1 = true;
               }
            }
         }

         if (var1) {
            return null;
         } else {
            ModelData[] var8 = new ModelData[12];
            int var9 = 0;

            for (int var11 = 0; var11 < 12; var11++) {
               int var5 = this.equipment[var11];
               if (this.method7939(var5, (byte)63)) {
                  KitDefinition var6 = this.KitDefinition_get(var5, (byte)121);
                  ModelData var7 = null;
                  if (var6 != null) {
                     var7 = var6.getKitDefinitionModels(-1793120611);
                  }

                  if (var7 != null) {
                     var8[var9++] = var7;
                  }
               }

               if (this.method7944(var5, (byte)0)) {
                  PlayerCompositionColorTextureOverride var14 = null == this.playerCompositionColorTextureOverrides
                     ? null
                     : this.playerCompositionColorTextureOverrides[var11];
                  ModelData var15 = this.method7947(var5, (byte)2).method5078(-941255479 * this.gender, var14, 1599393689);
                  if (var15 != null) {
                     var8[var9++] = var15;
                  }
               }
            }

            ModelData var12 = new ModelData(var8, var9);

            for (int var13 = 0; var13 < 5; var13++) {
               if (this.bodyColors[var13] < ItemContainer.field1065[var13].length) {
                  var12.recolor(classDH.field1360[var13], ItemContainer.field1065[var13][this.bodyColors[var13]]);
               }

               if (this.bodyColors[var13] < field4398[var13].length) {
                  var12.recolor(class358.field4366[var13], field4398[var13][this.bodyColors[var13]]);
               }
            }

            return var12;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   public int method7919() {
      long var1 = 5134927487433058529L * this.hash;
      if (1504383947 * this.npcTransformId != -1) {
         var1 = -65536L | 1504383947 * this.npcTransformId;
      }

      Integer var3 = (Integer)class498.method10645(field4391, var1, 1934219016);
      if (null == var3) {
         var3 = (field4392 += 721221853) * 629514101 - 1;
         field4391.method10647(var1, var3, 2014736598);
         field4392 = 721221853 * (629514101 * field4392 % 65535);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cm")
   boolean method7928() {
      if (!this.method7944(this.equipment[0], (byte)0)) {
         return false;
      } else {
         ItemComposition var1 = this.method7947(this.equipment[0], (byte)2);
         return var1.maleModel1 * -1551751121 != 1469073007 * class222.field2452.field2461
            && -647379316 * class222.field2452.field2461 != var1.maleModel2 * 1456474147;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   void method7908() {
      long var1 = 5134927487433058529L * this.hash;
      long[] var3 = Buffer.field6476;
      this.hash = 5952686814464238815L;

      for (int var4 = 0; var4 < 12; var4++) {
         this.hash = -5952686814464238815L
            * (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.equipment[var4] >> 24) & 255L)]);
         this.hash = (5134927487433058529L * this.hash >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ this.equipment[var4] >> 16) & 255L)])
            * -5952686814464238815L;
         this.hash = (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ this.equipment[var4] >> 8) & 255L)])
            * -5952686814464238815L;
         this.hash = (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.equipment[var4]) & 255L)])
            * -5952686814464238815L;
      }

      if (this.playerCompositionColorTextureOverrides != null) {
         for (int var6 = 0; var6 < this.playerCompositionColorTextureOverrides.length; var6++) {
            if (this.playerCompositionColorTextureOverrides[var6] != null) {
               if (null != this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo) {
                  for (int var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo.length; var5++) {
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (this.hash * 5134927487433058529L ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo[var5] >> 8)
                                    & 255L
                              )]
                        );
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (this.hash * 5134927487433058529L ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRecolorTo[var5]) & 255L
                              )]
                        );
                  }
               }

               if (this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo != null) {
                  for (int var8 = 0; var8 < this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo.length; var8++) {
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (5134927487433058529L * this.hash ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo[var8] >> 8)
                                    & 255L
                              )]
                        );
                     this.hash = -5952686814464238815L
                        * (
                           5134927487433058529L * this.hash >>> 8
                              ^ var3[(int)(
                                 (5134927487433058529L * this.hash ^ this.playerCompositionColorTextureOverrides[var6].playerCompositionRetextureTo[var8])
                                    & 255L
                              )]
                        );
                  }
               }
            }
         }
      }

      for (int var7 = 0; var7 < 5; var7++) {
         this.hash = -5952686814464238815L
            * (this.hash * 5134927487433058529L >>> 8 ^ var3[(int)((5134927487433058529L * this.hash ^ this.bodyColors[var7]) & 255L)]);
      }

      this.hash = (5134927487433058529L * this.hash >>> 8 ^ var3[(int)((this.hash * 5134927487433058529L ^ -941255479 * this.gender) & 255L)])
         * -5952686814464238815L;
      if (0L != var1 && var1 != 5134927487433058529L * this.hash || this.field4385) {
         PlayerAppearance_cachedModels.remove(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cf")
   int method7950(int var1) {
      return var1 - 512 + -1149250666;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;IZ)V")
   @ObfuscatedName("zx")
   public static void method7895(PlayerComposition var0, int var1, boolean var2) {
      int var3 = var0.equipment[class204.method4644(var1, 1973430038)];
      if (var3 != 0) {
         var3 -= 256;

         KitDefinition var4;
         do {
            if (!var2) {
               if (--var3 < 0) {
                  var3 = class408.KitDefinition_fileCount * -2022221137 - 1;
               }
            } else if (++var3 >= class408.KitDefinition_fileCount * -2022221137) {
               var3 = 0;
            }

            var4 = class225.method5278(var3, (byte)12);
         } while (var4 == null || var4.nonSelectable || !var4.method4831(var1, -941255479 * var0.gender, (byte)-49));

         var0.equipment[class204.method4644(var1, 1298365956)] = 256 + var3;
         method7905(var0, (byte)-1);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ct")
   boolean method7929() {
      if (!this.method7944(this.equipment[0], (byte)0)) {
         return false;
      } else {
         ItemComposition var1 = this.method7947(this.equipment[0], (byte)2);
         return var1.maleModel1 * 1068605157 != 1469073007 * class222.field2452.field2461
            && 691295613 * class222.field2452.field2461 != var1.maleModel2 * -1148488166;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lhy;")
   @ObfuscatedName("ax")
   KitDefinition KitDefinition_get(int var1, byte var2) {
      try {
         return class225.method5278(var1 - 256, (byte)12);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oa.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ck")
   public void method7932(int var1, int var2) {
      this.bodyColors[var1] = var2;
      this.method7922((byte)68);
   }

   public void setHash() {
      method7905(this, (byte)-1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;I)Z")
   @ObfuscatedName("tj")
   public static boolean method7945(PlayerComposition var0, int var1) {
      if (var0 == null) {
         var0.method7941(var1);
      }

      return var1 >= 1341688365;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cs")
   public void method7937(int var1) {
      ItemComposition var2 = class150.ItemDefinition_get(var1, 209226430);
      this.equipment[-1171855377 * var2.maleModel] = 2048 + var1;
      if (-1 != 36070342 * var2.maleModel1) {
         this.equipment[var2.maleModel1 * 228074415] = 0;
      }

      if (859876022 * var2.maleModel2 != -1) {
         this.equipment[1456474147 * var2.maleModel2] = 0;
      }

      this.method7922((byte)-59);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("co")
   boolean method7940(int var1) {
      return var1 >= -1626514376 && var1 < 2048;
   }

   @ObfuscatedSignature(descriptor = "([I[I[III)V")
   @ObfuscatedName("be")
   public void method7883(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = method7886(this, var4, 2069657652);
      }

      if (null == var2) {
         var2 = method7886(this, var4, 968460702);
      }

      this.field4383 = var1;
      this.equipment = var2;
      this.bodyColors = var3;
      this.gender = 101631353 * var4;
      this.npcTransformId = 361232867 * var5;
      method7905(this, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ce")
   public void method7926(int var1, int var2) {
      boolean var3 = var2 != this.gender * -941255479;
      this.gender = 101631353 * var2;
      if (var3) {
         if (var1 == this.gender * -941255479) {
            for (int var4 = 0; var4 < 7; var4++) {
               int var5 = class204.method4644(var4, 292038038);
               if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
                  this.equipment[var5] = this.field4383[var5];
               }
            }
         } else {
            if (this.equipment[0] < 2048 || this.method7930(35142632)) {
               this.equipment[1469073007 * class222.field2452.field2461] = 1;
            }

            for (int var9 = 0; var9 < 7; var9++) {
               int var10 = class204.method4644(var9, 1734199105);
               if (this.equipment[var10] > 0 && this.equipment[var10] < 2048) {
                  int[] var6 = this.equipment;

                  for (int var7 = 0; var7 < class408.KitDefinition_fileCount * -2022221137; var7++) {
                     KitDefinition var8 = class225.method5278(var7, (byte)12);
                     if (var8 != null && !var8.nonSelectable && var8.method4831(var9, var2, (byte)-76)) {
                        var6[class204.method4644(var9, 1427185056)] = 256 + var7;
                        break;
                     }
                  }
               }
            }
         }
      }

      this.method7922((byte)37);
   }

   public ColorTextureOverride[] getColorTextureOverrides() {
      return this.playerCompositionColorTextureOverrides;
   }

   @ObfuscatedSignature(descriptor = "(I)Lhy;")
   @ObfuscatedName("cg")
   KitDefinition method7943(int var1) {
      return class225.method5278(var1 - 256, (byte)12);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cn")
   boolean method7930(int var1) {
      try {
         if (this.method7944(this.equipment[0], (byte)0)) {
            if (var1 <= -1675090931) {
               throw new IllegalStateException();
            } else {
               ItemComposition var2 = this.method7947(this.equipment[0], (byte)2);
               return var2.maleModel1 * -1551751121 != 1469073007 * class222.field2452.field2461
                  && 1469073007 * class222.field2452.field2461 != var2.maleModel2 * 1456474147;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oa.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lis;")
   @ObfuscatedName("cz")
   ItemComposition method7948(int var1) {
      return class150.ItemDefinition_get(var1 - 2048, -379422506);
   }

   public boolean isFemale() {
      return this.getGender() == 1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cy")
   int method7951(int var1) {
      return var1 - -1312083900 + -209019243;
   }

   @ObfuscatedSignature(descriptor = "([I[I[IIIB)V")
   @ObfuscatedName("at")
   public void method7884(int[] var1, int[] var2, int[] var3, int var4, int var5, byte var6) {
      try {
         if (var1 == null) {
            if (var6 <= 1) {
               throw new IllegalStateException();
            }

            var1 = method7886(this, var4, -833268089);
         }

         if (null == var2) {
            if (var6 <= 1) {
               throw new IllegalStateException();
            }

            var2 = method7886(this, var4, -561110701);
         }

         this.field4383 = var1;
         this.equipment = var2;
         this.bodyColors = var3;
         this.gender = 101631353 * var4;
         this.npcTransformId = 361232867 * var5;
         method7905(this, (byte)-1);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oa.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[I")
   @ObfuscatedName("ag")
   int[] method7890(int var1, int var2) {
      try {
         int[] var3 = new int[12];

         for (int var4 = 0; var4 < 7; var4++) {
            if (var2 == 1074266368) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < class408.KitDefinition_fileCount * -2022221137; var5++) {
               if (var2 == 1074266368) {
                  throw new IllegalStateException();
               }

               KitDefinition var6 = class225.method5278(var5, (byte)12);
               if (null != var6) {
                  if (var2 == 1074266368) {
                     throw new IllegalStateException();
                  }

                  if (!var6.nonSelectable && var6.method4831(var4, var1, (byte)-72)) {
                     if (var2 == 1074266368) {
                        throw new IllegalStateException();
                     }

                     var3[class204.method4644(var4, 509279286)] = var5 + 256;
                     break;
                  }
               }
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oa.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)V")
   @ObfuscatedName("an")
   public void changeAppearance(int var1, boolean var2, int var3) {
      try {
         int var4 = this.field4383[class204.method4644(var1, 256183483)];
         if (var4 == 0) {
            if (var3 >= 1063009849) {
               throw new IllegalStateException();
            }
         } else {
            var4 -= 256;

            while (true) {
               if (!var2) {
                  if (var3 >= 1063009849) {
                     throw new IllegalStateException();
                  }

                  if (--var4 < 0) {
                     if (var3 >= 1063009849) {
                        throw new IllegalStateException();
                     }

                     var4 = class408.KitDefinition_fileCount * -2022221137 - 1;
                  }
               } else if (++var4 >= class408.KitDefinition_fileCount * -2022221137) {
                  if (var3 >= 1063009849) {
                     throw new IllegalStateException();
                  }

                  var4 = 0;
               }

               KitDefinition var5 = class225.method5278(var4, (byte)12);
               if (var5 != null) {
                  if (var3 >= 1063009849) {
                     throw new IllegalStateException();
                  }

                  if (!var5.nonSelectable && var5.method4831(var1, -941255479 * this.field4386, (byte)-114)) {
                     if (var3 >= 1063009849) {
                        throw new IllegalStateException();
                     }

                     this.equipment[class204.method4644(var1, -193861154)] = 256 + var4;
                     method7905(this, (byte)-1);
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "oa.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aw")
   void setHash(byte var1) {
      try {
         long var2 = 5134927487433058529L * this.field4396;
         long[] var4 = Buffer.field6476;
         this.hash = 5952686814464238815L;

         for (int var5 = 0; var5 < 12; var5++) {
            if (var1 != -1) {
               throw new IllegalStateException();
            }

            this.hash = -5952686814464238815L
               * (this.hash * 5134927487433058529L >>> 8 ^ var4[(int)((5134927487433058529L * this.hash ^ this.field4383[var5] >> 24) & 255L)]);
            this.hash = (5134927487433058529L * this.field4396 >>> 8 ^ var4[(int)((this.field4396 * 5134927487433058529L ^ this.equipment[var5] >> 16) & 255L)])
               * -5952686814464238815L;
            this.field4396 = (
                  this.field4396 * 5134927487433058529L >>> 8 ^ var4[(int)((this.field4396 * 5134927487433058529L ^ this.equipment[var5] >> 8) & 255L)]
               )
               * -5952686814464238815L;
            this.hash = (this.field4396 * 5134927487433058529L >>> 8 ^ var4[(int)((5134927487433058529L * this.field4396 ^ this.equipment[var5]) & 255L)])
               * -5952686814464238815L;
         }

         if (this.playerCompositionColorTextureOverrides != null) {
            if (var1 != -1) {
               throw new IllegalStateException();
            }

            for (int var8 = 0; var8 < this.playerCompositionColorTextureOverrides.length; var8++) {
               if (this.playerCompositionColorTextureOverrides[var8] != null) {
                  if (var1 != -1) {
                     return;
                  }

                  if (null != this.playerCompositionColorTextureOverrides[var8].playerCompositionRetextureTo) {
                     if (var1 != -1) {
                        return;
                     }

                     for (int var6 = 0; var6 < this.playerCompositionColorTextureOverrides[var8].playerCompositionRecolorTo.length; var6++) {
                        if (var1 != -1) {
                           throw new IllegalStateException();
                        }

                        this.field4396 = -5952686814464238815L
                           * (
                              5134927487433058529L * this.hash >>> 8
                                 ^ var4[(int)(
                                    (this.hash * 5134927487433058529L ^ this.playerCompositionColorTextureOverrides[var8].playerCompositionRecolorTo[var6] >> 8)
                                       & 255L
                                 )]
                           );
                        this.field4396 = -5952686814464238815L
                           * (
                              5134927487433058529L * this.hash >>> 8
                                 ^ var4[(int)(
                                    (this.hash * 5134927487433058529L ^ this.playerCompositionColorTextureOverrides[var8].playerCompositionRetextureTo[var6])
                                       & 255L
                                 )]
                           );
                     }
                  }

                  if (this.playerCompositionColorTextureOverrides[var8].playerCompositionRetextureTo != null) {
                     if (var1 != -1) {
                        throw new IllegalStateException();
                     }

                     for (int var10 = 0; var10 < this.playerCompositionColorTextureOverrides[var8].playerCompositionRetextureTo.length; var10++) {
                        if (var1 != -1) {
                           throw new IllegalStateException();
                        }

                        this.field4396 = -5952686814464238815L
                           * (
                              5134927487433058529L * this.field4396 >>> 8
                                 ^ var4[(int)(
                                    (
                                          5134927487433058529L * this.hash
                                             ^ this.playerCompositionColorTextureOverrides[var8].playerCompositionRecolorTo[var10] >> 8
                                       )
                                       & 255L
                                 )]
                           );
                        this.field4396 = -5952686814464238815L
                           * (
                              5134927487433058529L * this.hash >>> 8
                                 ^ var4[(int)(
                                    (5134927487433058529L * this.hash ^ this.playerCompositionColorTextureOverrides[var8].playerCompositionRecolorTo[var10])
                                       & 255L
                                 )]
                           );
                     }
                  }
               }
            }
         }

         for (int var9 = 0; var9 < 5; var9++) {
            if (var1 != -1) {
               throw new IllegalStateException();
            }

            this.field4396 = -5952686814464238815L
               * (this.hash * 5134927487433058529L >>> 8 ^ var4[(int)((5134927487433058529L * this.field4396 ^ this.equipment[var9]) & 255L)]);
         }

         label87: {
            this.hash = (5134927487433058529L * this.field4396 >>> 8 ^ var4[(int)((this.field4396 * 5134927487433058529L ^ -941255479 * this.gender) & 255L)])
               * -5952686814464238815L;
            if (0L != var2) {
               if (var1 != -1) {
                  return;
               }

               if (var2 != 5134927487433058529L * this.hash) {
                  break label87;
               }

               if (var1 != -1) {
                  throw new IllegalStateException();
               }
            }

            if (!this.field4385) {
               return;
            }
         }

         PlayerAppearance_cachedModels.remove(var2);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oa.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;ILiw;IB)Lky;")
   @ObfuscatedName("ap")
   public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, byte var5) {
      try {
         if (-1 != this.npcTransformId * 1504383947) {
            if (var5 <= 1) {
               throw new IllegalStateException();
            } else {
               return AsyncHttpResponse.getNpcDefinition(this.npcTransformId * 1504383947, (byte)37).getModel(var1, var2, var3, var4, null, (short)5628);
            }
         } else {
            long var6;
            int[] var8;
            var6 = this.field4396 * 5134927487433058529L;
            var8 = this.field4383;
            label262:
            if (null != var1) {
               if (var5 <= 1) {
                  throw new IllegalStateException();
               }

               if (972490383 * var1.animationHeightOffset < 0) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (-455776013 * var1.field2720 < 0) {
                     break label262;
                  }

                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }
               }

               var8 = new int[12];
               System.arraycopy(this.field4383, 0, var8, 0, var8.length);
               if (972490383 * var1.animationHeightOffset >= 0) {
                  var6 ^= (long)(var1.animationHeightOffset * 972490383 - this.field4383[1469073007 * class222.field2448.field2461]) << 40;
                  var8[1469073007 * class222.field2449.field2461] = this.method7949(972490383 * var1.field2752, -214839257);
               }

               if (var1.field2729 * -455776013 >= 0) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  var6 ^= (long)(-455776013 * var1.field2734 - this.bodyColors[class222.field2452.field2461 * 1469073007]) << 48;
                  var8[1469073007 * class222.field2452.field2461] = this.method7949(-455776013 * var1.field2752, -1234139603);
               }
            }

            Model var9 = (Model)class402.method8806(PlayerAppearance_cachedModels, var6);
            if (var9 == null) {
               if (var5 <= 1) {
                  throw new IllegalStateException();
               }

               boolean var10 = false;

               for (int var11 = 0; var11 < 12; var11++) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  int var12 = var8[var11];
                  if (this.method7939(var12, (byte)116)) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     KitDefinition var13 = this.KitDefinition_get(var12, (byte)69);
                     if (var13 != null) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (!var13.ready(-897175459)) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10 = true;
                        }
                     }
                  }

                  if (this.method7939(var12, (byte)0)) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     PlayerCompositionColorTextureOverride var22 = null == this.playerCompositionColorTextureOverrides
                        ? null
                        : this.playerCompositionColorTextureOverrides[var11];
                     if (!this.method7947(var12, (byte)2).method5067(this.field4386 * -941255479, var22, 1343428063)) {
                        var10 = true;
                     }
                  }
               }

               if (var10) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (-2534806694966286359L * this.field4396 != -1L) {
                     var9 = (Model)class402.method8806(PlayerAppearance_cachedModels, this.hash * -2534806694966286359L);
                  }

                  if (var9 == null) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }
               }

               if (null == var9) {
                  ModelData[] var20 = new ModelData[12];
                  int var21 = 0;

                  for (int var23 = 0; var23 < 12; var23++) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     int var14 = var8[var23];
                     if (this.method7939(var14, (byte)116)) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        KitDefinition var15 = this.KitDefinition_get(var14, (byte)116);
                        ModelData var16 = null;
                        if (null != var15) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           var16 = KitDefinition.method4835(var15, -317308515);
                        }

                        if (var16 != null) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           var20[var21++] = var16;
                        }
                     }

                     if (this.method7939(var14, (byte)0)) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        ItemComposition var26 = this.method7947(var14, (byte)2);
                        PlayerCompositionColorTextureOverride var10000;
                        if (this.playerCompositionColorTextureOverrides == null) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10000 = null;
                        } else {
                           var10000 = this.playerCompositionColorTextureOverrides[var23];
                        }

                        PlayerCompositionColorTextureOverride var27 = var10000;
                        ModelData var17 = var26.method5072(-941255479 * this.gender, var27, (byte)118);
                        if (null != var17) {
                           if (var5 <= 1) {
                              throw new IllegalStateException();
                           }

                           var20[var21++] = var17;
                        }
                     }
                  }

                  ModelData var24 = new ModelData(var20, var21);

                  for (int var25 = 0; var25 < 5; var25++) {
                     if (var5 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (this.field4383[var25] < ItemContainer.field1065[var25].length) {
                        if (var5 <= 1) {
                           throw new IllegalStateException();
                        }

                        var24.method6072(classDH.field1360[var25], ItemContainer.field1065[var25][this.equipment[var25]]);
                     }

                     if (this.bodyColors[var25] < field4398[var25].length) {
                        var24.retexture(class358.field4366[var25], field4398[var25][this.field4383[var25]]);
                     }
                  }

                  var9 = ModelData.method6106(var24, 64, 850, -30, -50, -30);
                  PlayerAppearance_cachedModels.method7374(var9, var6);
                  this.field4396 = var6 * -6230193929615794087L;
               }
            }

            if (var1 == null) {
               if (var5 <= 1) {
                  throw new IllegalStateException();
               }

               if (var3 == null) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  Model var30 = var9.toSharedSpotAnimationModel(true);
                  return var30;
               }
            }

            if (null != var1) {
               if (var5 <= 1) {
                  throw new IllegalStateException();
               }

               if (null != var3) {
                  if (var5 <= 1) {
                     throw new IllegalStateException();
                  }

                  Model var29 = var1.applyTransformations(var9, var2, var3, var4, 1784213328);
                  return var29;
               }
            }

            Model var19;
            if (var1 != null) {
               if (var5 <= 1) {
                  throw new IllegalStateException();
               }

               var19 = var1.transformActorModel(var9, var2, (byte)45);
            } else {
               var19 = var3.transformWidgetModel(var9, var4, (byte)78);
            }

            return var19;
         }
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "oa.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("au")
   public int getChatHeadId(byte var1) {
      try {
         long var2 = 5134927487433058529L * this.hash;
         if (1504383947 * this.npcTransformId != -1) {
            var2 = -65536L | 1504383947 * this.npcTransformId;
         }

         Integer var4 = (Integer)class498.method10645(field4391, var2, 1934219016);
         if (null == var4) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var4 = (field4392 += 721221853) * 629514101 - 1;
            field4391.method10647(var2, var4, 1214301467);
            field4392 = 721221853 * (629514101 * field4392 % 65535);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oa.au(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)V")
   @ObfuscatedName("dy")
   public static void method7876(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method9652();
      }

      while (var0.sentinel.previous != var0.sentinel) {
         var0.sentinel.previous.remove();
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ad")
   public void method7933(int var1, int var2, int var3) {
      try {
         this.field4383[var1] = var2;
         this.setHash((byte)-54);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oa.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cb")
   public void method7934(int var1, int var2) {
      this.field4383[var1] = var2;
      this.setHash((byte)-31);
   }
}
