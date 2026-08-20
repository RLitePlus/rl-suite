import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fv")
public abstract class Projection implements net.runelite.api.Projection {
   @ObfuscatedName("mg")
   public static int field2411;
   @ToRemove(unused = "true")
   @ObfuscatedName("ed")
   static final int field2410 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field2409 = 1792;

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;III)V")
   @ObfuscatedName("kz")
   public void method5032(Scene var1, SceneTileModel var2, int var3, int var4, int var5) {
      field2411 = var3;
      this.vmethod437(var1, var2, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("ao")
   abstract void vmethod430(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfv;Lez;Lfj;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("of")
   public static void method5020(
      Projection var0,
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      if (var0 == null) {
         var0.method5023(var1, var2, var3, var3, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5);
      }

      float var17 = classFH.method4705() + var5 * classFH.method4727() / var13;
      float var18 = classFH.method4710() + var9 * classFH.method4727() / var13;
      float var19 = classFH.method4705() + var6 * classFH.method4727() / var14;
      float var20 = classFH.method4710() + var10 * classFH.method4727() / var14;
      float var21 = classFH.method4705() + var7 * classFH.method4727() / var15;
      float var22 = classFH.method4710() + var11 * classFH.method4727() / var15;
      float var23 = classFH.method4705() + var8 * classFH.method4727() / var16;
      float var24 = classFH.method4710() + var12 * classFH.method4727() / var16;
      float var25 = classJE.method6356(var13, 2113236722);
      float var26 = classJE.method6356(var14, 2118764360);
      float var27 = classJE.method6356(var15, 2125842076);
      float var28 = classJE.method6356(var16, 2104309487);
      classFH.field2257.field2213 = 0;
      if ((var20 - var24) * (var21 - var23) - (var22 - var24) * (var19 - var23) > 0.0F) {
         classFH.field2257.field2211 = false;
         int var29 = classFH.method4731();
         if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
            classFH.field2257.field2211 = true;
         }

         if (Scene.method4144(var1.field2045, var1.field2046, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
            float var30 = classVI.method11957(
               var1.field2045, var1.field2046, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26, 103610332
            );
            if (var30 > var1.field2042) {
               var1.field2026 = var3;
               var1.field2034 = var4;
               var1.field2042 = var30;
            }
         }

         if (var2.field2287 * -374133199 == -1) {
            if (1930994898 != -149713173 * var2.field2286) {
               classFH.method4758(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -1523134809 * var2.field2286,
                  -433204571 * var2.field2284,
                  -633153015 * var2.field2288
               );
            }
         } else if (!Scene.field2084) {
            if (var2.field2283) {
               classFH.method4769(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -665850825 * var2.field2286,
                  var2.field2284 * 1860831095,
                  var2.field2288 * -633153015,
                  (int)var5,
                  (int)var6,
                  (int)var8,
                  (int)var9,
                  (int)var10,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var16,
                  var2.field2287 * -248747123
               );
            } else {
               classFH.method4769(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -665850825 * var2.field2286,
                  var2.field2284 * 1860831095,
                  -633153015 * var2.field2288,
                  (int)var7,
                  (int)var8,
                  (int)var6,
                  (int)var11,
                  (int)var12,
                  (int)var10,
                  (int)var15,
                  (int)var16,
                  (int)var14,
                  -100681446 * var2.field2287
               );
            }
         } else {
            int var32 = classFH.field2257.field2239.vmethod408(1015843198 * var2.field2287, -1314837517);
            classFH.method4758(
               var22,
               var24,
               var20,
               var21,
               var23,
               var19,
               var27,
               var28,
               var26,
               Scene.method4142(var32, -665850825 * var2.field2286),
               Scene.method4142(var32, var2.field2284 * 1860831095),
               Scene.method4142(var32, var2.field2288 * 1735654675)
            );
         }
      }

      if ((var24 - var20) * (var17 - var19) - (var23 - var19) * (var18 - var20) > 0.0F) {
         classFH.field2257.field2211 = false;
         int var31 = classFH.method4731();
         if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var31 || var19 > var31 || var23 > var31) {
            classFH.field2257.field2211 = true;
         }

         if (Scene.method4144(var1.field2045, var1.field2046, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
            float var33 = classVI.method11957(
               var1.field2045, var1.field2046, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28, -709565948
            );
            if (var33 > var1.field2042) {
               var1.field2026 = var3;
               var1.field2034 = var4;
               var1.field2042 = var33;
            }
         }

         if (-1 == var2.field2287 * -1656613927) {
            if (55255572 * var2.field2285 != 1405122701) {
               classFH.method4758(
                  var18,
                  var20,
                  var24,
                  var17,
                  var19,
                  var23,
                  var25,
                  var26,
                  var28,
                  -1289335841 * var2.field2285,
                  -121830974 * var2.field2288,
                  var2.field2284 * 1860831095
               );
            }
         } else if (!Scene.field2084) {
            classFH.method4769(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               -137007609 * var2.field2285,
               var2.field2288 * 847958029,
               var2.field2284 * -1089416961,
               (int)var5,
               (int)var6,
               (int)var8,
               (int)var9,
               (int)var10,
               (int)var12,
               (int)var13,
               (int)var14,
               (int)var16,
               1479555085 * var2.field2287
            );
         } else {
            int var34 = classFH.field2257.field2239.vmethod408(var2.field2287 * -322216470, -1766663415);
            classFH.method4758(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               Scene.method4142(var34, var2.field2285 * 1145127777),
               Scene.method4142(var34, -109486114 * var2.field2288),
               Scene.method4142(var34, var2.field2284 * -2126403163)
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("az")
   abstract void vmethod435(Renderable var1, int var2, int var3, int var4, int var5, long var6);

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;IIII)V")
   @ObfuscatedName("af")
   abstract void vmethod426(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("as")
   abstract void vmethod422(Renderable var1, int var2, int var3, int var4, int var5, long var6);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfv;Lez;Lfn;II)V")
   @ObfuscatedName("gf")
   public static void method5025(Projection var0, Scene var1, SceneTileModel var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5029(var1, var2, var3, var3);
      } else {
         classFH.field2257.field2213 = 0;
         int var5 = var2.field2330.length;

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = var2.field2330[var6];
            int var8 = var2.field2331[var6];
            int var9 = var2.field2329[var6];
            float var10 = SceneTileModel.field2337[var7];
            float var11 = SceneTileModel.field2337[var8];
            float var12 = SceneTileModel.field2337[var9];
            float var13 = SceneTileModel.field2340[var7];
            float var14 = SceneTileModel.field2340[var8];
            float var15 = SceneTileModel.field2340[var9];
            float var16 = SceneTileModel.field2338[var7];
            float var17 = SceneTileModel.field2338[var8];
            float var18 = SceneTileModel.field2338[var9];
            if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0.0F) {
               classFH.field2257.field2211 = false;
               int var19 = classFH.method4731();
               if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > var19 || var11 > var19 || var12 > var19) {
                  classFH.field2257.field2211 = true;
               }

               if (Scene.method4144(var1.field2045, var1.field2046, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
                  float var20 = classVI.method11957(
                     var1.field2045, var1.field2046, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18, -282384414
                  );
                  if (var20 > var1.field2042) {
                     var1.field2026 = var3;
                     var1.field2034 = var4;
                     var1.field2042 = var20;
                  }
               }

               if (var2.field2324 != null && var2.field2324[var6] != -1) {
                  if (!Scene.field2084) {
                     if (var2.field2319) {
                        classFH.method4769(
                           var13,
                           var14,
                           var15,
                           var10,
                           var11,
                           var12,
                           var16,
                           var17,
                           var18,
                           var2.field2332[var6],
                           var2.field2325[var6],
                           var2.field2328[var6],
                           SceneTileModel.field2339[0],
                           SceneTileModel.field2339[1],
                           SceneTileModel.field2339[3],
                           SceneTileModel.field2335[0],
                           SceneTileModel.field2335[1],
                           SceneTileModel.field2335[3],
                           SceneTileModel.field2341[0],
                           SceneTileModel.field2341[1],
                           SceneTileModel.field2341[3],
                           var2.field2324[var6]
                        );
                     } else {
                        classFH.method4769(
                           var13,
                           var14,
                           var15,
                           var10,
                           var11,
                           var12,
                           var16,
                           var17,
                           var18,
                           var2.field2332[var6],
                           var2.field2325[var6],
                           var2.field2328[var6],
                           SceneTileModel.field2339[var7],
                           SceneTileModel.field2339[var8],
                           SceneTileModel.field2339[var9],
                           SceneTileModel.field2335[var7],
                           SceneTileModel.field2335[var8],
                           SceneTileModel.field2335[var9],
                           SceneTileModel.field2341[var7],
                           SceneTileModel.field2341[var8],
                           SceneTileModel.field2341[var9],
                           var2.field2324[var6]
                        );
                     }
                  } else {
                     int var21 = classFH.field2257.field2239.vmethod408(var2.field2324[var6], -2090204362);
                     classFH.method4758(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        Scene.method4142(var21, var2.field2332[var6]),
                        Scene.method4142(var21, var2.field2325[var6]),
                        Scene.method4142(var21, var2.field2328[var6])
                     );
                  }
               } else if (var2.field2332[var6] != 12345678) {
                  classFH.method4758(
                     var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.field2332[var6], var2.field2325[var6], var2.field2328[var6]
                  );
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Lyn;")
   @ObfuscatedName("tn")
   public static IterableNodeHashTable method5030(Actor var0) {
      return var0.field1469;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIFFF)F")
   @ObfuscatedName("ah")
   public static float method5036(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return classVI.method11957(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, -126722077);
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("ay")
   abstract void vmethod434(Scene var1, SceneTileModel var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;III)V")
   @ObfuscatedName("au")
   void method5035(Scene var1, SceneTileModel var2, int var3, int var4, int var5) {
      try {
         classFD var6 = classFH.field2257;
         boolean var7 = classOE.field4843.isGpu();
         if (client.field1118 != null) {
            client.field1118.drawSceneTileModel(var1, var2, var3, var4);
         }

         rl10 var8 = var1.field1993[var1.field2150.field1710 * -483624883][var3 + var1.field2147][var4 + var1.field2147];
         var6.field2213 = 0;
         int var9 = var2.field2330.length;

         for (int var10 = 0; var10 < var9; var10++) {
            int var11 = var2.field2330[var10];
            int var12 = var2.field2331[var10];
            int var13 = var2.field2329[var10];
            float var14 = SceneTileModel.field2337[var11];
            float var15 = SceneTileModel.field2337[var12];
            float var16 = SceneTileModel.field2337[var13];
            float var17 = SceneTileModel.field2340[var11];
            float var18 = SceneTileModel.field2340[var12];
            float var19 = SceneTileModel.field2340[var13];
            float var20 = SceneTileModel.field2338[var11];
            float var21 = SceneTileModel.field2338[var12];
            float var22 = SceneTileModel.field2338[var13];
            if ((var14 - var15) * (var19 - var18) - (var17 - var18) * (var16 - var15) > 0.0F) {
               if (Scene.method4503(var1.field2045, var1.field2046, (int)var17, (int)var18, (int)var19, (int)var14, (int)var15, (int)var16)) {
                  float var23 = method5036(
                     var1.field2045, var1.field2046, (int)var14, (int)var15, (int)var16, (int)var17, (int)var18, (int)var19, var20, var21, var22
                  );
                  if (var23 > var1.field2042 && field2411 <= var1.field2150.field1710 * -483624883) {
                     var1.method4438(var3, var4, var23);
                  }

                  if (var8 != null
                     && var2 == var8.method10035()
                     && var1.field2045 >= classOE.field4843.getViewportXOffset()
                     && var1.field2045 < classOE.field4843.getViewportXOffset() + classOE.field4843.getViewportWidth()
                     && var1.field2046 >= classOE.field4843.getViewportYOffset()
                     && var1.field2046 < classOE.field4843.getViewportYOffset() + classOE.field4843.getViewportHeight()) {
                     var1.method4401(var3, var4, var8.method10038());
                  }
               }

               if (!var7) {
                  var6.field2211 = false;
                  int var26 = var6.field2227;
                  if (var14 < 0.0F || var15 < 0.0F || var16 < 0.0F || var14 > var26 || var15 > var26 || var16 > var26) {
                     var6.field2211 = true;
                  }

                  if (var2.field2324 != null && var2.field2324[var10] != -1) {
                     if (!Scene.field2084) {
                        if (var2.field2319) {
                           classFQ.method4962(
                              var17,
                              var18,
                              var19,
                              var14,
                              var15,
                              var16,
                              var20,
                              var21,
                              var22,
                              var2.field2332[var10],
                              var2.field2325[var10],
                              var2.field2328[var10],
                              SceneTileModel.field2339[0],
                              SceneTileModel.field2339[1],
                              SceneTileModel.field2339[3],
                              SceneTileModel.field2335[0],
                              SceneTileModel.field2335[1],
                              SceneTileModel.field2335[3],
                              SceneTileModel.field2341[0],
                              SceneTileModel.field2341[1],
                              SceneTileModel.field2341[3],
                              var2.field2324[var10]
                           );
                        } else {
                           classFQ.method4962(
                              var17,
                              var18,
                              var19,
                              var14,
                              var15,
                              var16,
                              var20,
                              var21,
                              var22,
                              var2.field2332[var10],
                              var2.field2325[var10],
                              var2.field2328[var10],
                              SceneTileModel.field2339[var11],
                              SceneTileModel.field2339[var12],
                              SceneTileModel.field2339[var13],
                              SceneTileModel.field2335[var11],
                              SceneTileModel.field2335[var12],
                              SceneTileModel.field2335[var13],
                              SceneTileModel.field2341[var11],
                              SceneTileModel.field2341[var12],
                              SceneTileModel.field2341[var13],
                              var2.field2324[var10]
                           );
                        }
                     } else {
                        int var24 = var6.field2239.method4683(var2.field2324[var10]);
                        classFQ.method4963(
                           var17,
                           var18,
                           var19,
                           var14,
                           var15,
                           var16,
                           var20,
                           var21,
                           var22,
                           Scene.method4454(var24, var2.field2332[var10]),
                           Scene.method4454(var24, var2.field2325[var10]),
                           Scene.method4454(var24, var2.field2328[var10])
                        );
                     }
                  } else if (var2.field2332[var10] != 12345678) {
                     classFQ.method4963(
                        var17, var18, var19, var14, var15, var16, var20, var21, var22, var2.field2332[var10], var2.field2325[var10], var2.field2328[var10]
                     );
                  }
               }
            }
         }
      } catch (Exception var25) {
         client.field1026.warn("error during overlay rendering", var25);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ab")
   abstract void vmethod423(Renderable var1, int var2, int var3, int var4, int var5, long var6);

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ag")
   abstract void vmethod424(Renderable var1, int var2, int var3, int var4, int var5, long var6);

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;III)V")
   @ObfuscatedName("ae")
   abstract void vmethod431(Scene var1, SceneTileModel var2, int var3, int var4, int var5);

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ax")
   abstract void vmethod425(Renderable var1, int var2, int var3, int var4, int var5, long var6);

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("ac")
   abstract void vmethod427(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

   Projection() {
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("af")
   public static void method5024(byte var0) {
      try {
         classGQ.field2652.clear();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "fv.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("mv")
   public void method5037(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      this.vmethod435(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("aa")
   abstract void vmethod428(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("aq")
   abstract void vmethod433(Scene var1, SceneTileModel var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("aj")
   abstract void vmethod432(Scene var1, SceneTileModel var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("cl")
   public void vmethod436(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      this.vmethod426(var1, var2, var3, var4, var5, 1925151093);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfv;Lez;Lfj;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("qm")
   public static void method5021(
      Projection var0,
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      if (var0 == null) {
         var0.method5034(var1, var2, var3, var3, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5, var5, var3);
      } else {
         float var17 = classFH.method4705() + var5 * classFH.method4727() / var13;
         float var18 = classFH.method4710() + var9 * classFH.method4727() / var13;
         float var19 = classFH.method4705() + var6 * classFH.method4727() / var14;
         float var20 = classFH.method4710() + var10 * classFH.method4727() / var14;
         float var21 = classFH.method4705() + var7 * classFH.method4727() / var15;
         float var22 = classFH.method4710() + var11 * classFH.method4727() / var15;
         float var23 = classFH.method4705() + var8 * classFH.method4727() / var16;
         float var24 = classFH.method4710() + var12 * classFH.method4727() / var16;
         float var25 = classJE.method6356(var13, 2087029359);
         float var26 = classJE.method6356(var14, 2146515067);
         float var27 = classJE.method6356(var15, 2086976790);
         float var28 = classJE.method6356(var16, 2124193034);
         classFH.field2257.field2213 = 0;
         if ((var20 - var24) * (var21 - var23) - (var22 - var24) * (var19 - var23) > 0.0F) {
            classFH.field2257.field2211 = false;
            int var29 = classFH.method4731();
            if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
               classFH.field2257.field2211 = true;
            }

            if (Scene.method4144(var1.field2045, var1.field2046, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
               float var30 = classVI.method11957(
                  var1.field2045, var1.field2046, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26, 107282128
               );
               if (var30 > var1.field2042) {
                  var1.field2026 = var3;
                  var1.field2034 = var4;
                  var1.field2042 = var30;
               }
            }

            if (var2.field2287 * 1479555085 == -1) {
               if (-91603001 != -665850825 * var2.field2286) {
                  classFH.method4758(
                     var22,
                     var24,
                     var20,
                     var21,
                     var23,
                     var19,
                     var27,
                     var28,
                     var26,
                     -665850825 * var2.field2286,
                     -942062056 * var2.field2284,
                     -633153015 * var2.field2288
                  );
               }
            } else if (!Scene.field2084) {
               if (var2.field2283) {
                  classFH.method4769(
                     var22,
                     var24,
                     var20,
                     var21,
                     var23,
                     var19,
                     var27,
                     var28,
                     var26,
                     -665850825 * var2.field2286,
                     var2.field2284 * 1860831095,
                     var2.field2288 * -1667679331,
                     (int)var5,
                     (int)var6,
                     (int)var8,
                     (int)var9,
                     (int)var10,
                     (int)var12,
                     (int)var13,
                     (int)var14,
                     (int)var16,
                     var2.field2287 * 1479555085
                  );
               } else {
                  classFH.method4769(
                     var22,
                     var24,
                     var20,
                     var21,
                     var23,
                     var19,
                     var27,
                     var28,
                     var26,
                     -665850825 * var2.field2286,
                     var2.field2284 * 428825690,
                     -633153015 * var2.field2288,
                     (int)var7,
                     (int)var8,
                     (int)var6,
                     (int)var11,
                     (int)var12,
                     (int)var10,
                     (int)var15,
                     (int)var16,
                     (int)var14,
                     -1028401064 * var2.field2287
                  );
               }
            } else {
               int var32 = classFH.field2257.field2239.vmethod408(847353418 * var2.field2287, -1418600718);
               classFH.method4758(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  Scene.method4142(var32, -1743886056 * var2.field2286),
                  Scene.method4142(var32, var2.field2284 * 139844517),
                  Scene.method4142(var32, var2.field2288 * 788574122)
               );
            }
         }

         if ((var24 - var20) * (var17 - var19) - (var23 - var19) * (var18 - var20) > 0.0F) {
            classFH.field2257.field2211 = false;
            int var31 = classFH.method4731();
            if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var31 || var19 > var31 || var23 > var31) {
               classFH.field2257.field2211 = true;
            }

            if (Scene.method4144(var1.field2045, var1.field2046, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
               float var33 = classVI.method11957(
                  var1.field2045, var1.field2046, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28, -601642293
               );
               if (var33 > var1.field2042) {
                  var1.field2026 = var3;
                  var1.field2034 = var4;
                  var1.field2042 = var33;
               }
            }

            if (-1 == var2.field2287 * 1479555085) {
               if (-1662598237 * var2.field2285 != 932814621) {
                  classFH.method4758(
                     var18,
                     var20,
                     var24,
                     var17,
                     var19,
                     var23,
                     var25,
                     var26,
                     var28,
                     1145127777 * var2.field2285,
                     -633153015 * var2.field2288,
                     var2.field2284 * -1975281087
                  );
               }
            } else if (!Scene.field2084) {
               classFH.method4769(
                  var18,
                  var20,
                  var24,
                  var17,
                  var19,
                  var23,
                  var25,
                  var26,
                  var28,
                  1145127777 * var2.field2285,
                  var2.field2288 * -633153015,
                  var2.field2284 * 807187497,
                  (int)var5,
                  (int)var6,
                  (int)var8,
                  (int)var9,
                  (int)var10,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var16,
                  1479555085 * var2.field2287
               );
            } else {
               int var34 = classFH.field2257.field2239.vmethod408(var2.field2287 * 635457184, -1700348629);
               classFH.method4758(
                  var18,
                  var20,
                  var24,
                  var17,
                  var19,
                  var23,
                  var25,
                  var26,
                  var28,
                  Scene.method4142(var34, var2.field2285 * 1145127777),
                  Scene.method4142(var34, -633153015 * var2.field2288),
                  Scene.method4142(var34, var2.field2284 * 1860831095)
               );
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("vu")
   public static void method5031(ModelData var0) {
      if (var0.field1870 != null) {
         int[] var1 = new int[-1609438000];
         int var2 = 0;

         for (int var3 = 0; var3 < var0.field1848; var3++) {
            int var4 = var0.field1870[var3];
            var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         var0.field1863 = new int[var2 + 1][];

         for (int var7 = 0; var7 <= var2; var7++) {
            var0.field1863[var7] = new int[var1[var7]];
            var1[var7] = 0;
         }

         int var8 = 0;

         while (var8 < var0.field1848) {
            int var12 = var0.field1870[var8];
            var0.field1863[var12][var1[var12]++] = var8++;
         }

         var0.field1870 = null;
      }

      if (var0.field1871 != null) {
         int[] var5 = new int[1280990010];
         int var6 = 0;

         for (int var9 = 0; var9 < var0.field1849; var9++) {
            int var13 = var0.field1871[var9];
            var5[var13]++;
            if (var13 > var6) {
               var6 = var13;
            }
         }

         var0.field1860 = new int[var6 + 1][];

         for (int var10 = 0; var10 <= var6; var10++) {
            var0.field1860[var10] = new int[var5[var10]];
            var5[var10] = 0;
         }

         int var11 = 0;

         while (var11 < var0.field1849) {
            int var14 = var0.field1871[var11];
            var0.field1860[var14][var5[var14]++] = var11++;
         }

         var0.field1871 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("ar")
   void method5022(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      float var17 = classFH.method4705() + var5 * classFH.method4727() / var13;
      float var18 = classFH.method4710() + var9 * classFH.method4727() / var13;
      float var19 = classFH.method4705() + var6 * classFH.method4727() / var14;
      float var20 = classFH.method4710() + var10 * classFH.method4727() / var14;
      float var21 = classFH.method4705() + var7 * classFH.method4727() / var15;
      float var22 = classFH.method4710() + var11 * classFH.method4727() / var15;
      float var23 = classFH.method4705() + var8 * classFH.method4727() / var16;
      float var24 = classFH.method4710() + var12 * classFH.method4727() / var16;
      float var25 = classJE.method6356(var13, 2103933360);
      float var26 = classJE.method6356(var14, 2089783204);
      float var27 = classJE.method6356(var15, 2129086673);
      float var28 = classJE.method6356(var16, 2138813391);
      classFH.field2257.field2213 = 0;
      if ((var20 - var24) * (var21 - var23) - (var22 - var24) * (var19 - var23) > 0.0F) {
         classFH.field2257.field2211 = false;
         int var29 = classFH.method4731();
         if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
            classFH.field2257.field2211 = true;
         }

         if (Scene.method4144(var1.field2045, var1.field2046, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
            float var30 = classVI.method11957(
               var1.field2045, var1.field2046, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26, 234202891
            );
            if (var30 > var1.field2042) {
               var1.field2026 = var3;
               var1.field2034 = var4;
               var1.field2042 = var30;
            }
         }

         if (var2.field2287 * 1479555085 == -1) {
            if (12345678 != -665850825 * var2.field2286) {
               classFH.method4758(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -665850825 * var2.field2286,
                  1860831095 * var2.field2284,
                  -633153015 * var2.field2288
               );
            }
         } else if (!Scene.field2084) {
            if (var2.field2283) {
               classFH.method4769(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -665850825 * var2.field2286,
                  var2.field2284 * 1860831095,
                  var2.field2288 * -633153015,
                  (int)var5,
                  (int)var6,
                  (int)var8,
                  (int)var9,
                  (int)var10,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var16,
                  var2.field2287 * 1479555085
               );
            } else {
               classFH.method4769(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -665850825 * var2.field2286,
                  var2.field2284 * 1860831095,
                  -633153015 * var2.field2288,
                  (int)var7,
                  (int)var8,
                  (int)var6,
                  (int)var11,
                  (int)var12,
                  (int)var10,
                  (int)var15,
                  (int)var16,
                  (int)var14,
                  1479555085 * var2.field2287
               );
            }
         } else {
            int var32 = classFH.field2257.field2239.vmethod408(1479555085 * var2.field2287, -1711340608);
            classFH.method4758(
               var22,
               var24,
               var20,
               var21,
               var23,
               var19,
               var27,
               var28,
               var26,
               Scene.method4142(var32, -665850825 * var2.field2286),
               Scene.method4142(var32, var2.field2284 * 1860831095),
               Scene.method4142(var32, var2.field2288 * -633153015)
            );
         }
      }

      if ((var24 - var20) * (var17 - var19) - (var23 - var19) * (var18 - var20) > 0.0F) {
         classFH.field2257.field2211 = false;
         int var31 = classFH.method4731();
         if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var31 || var19 > var31 || var23 > var31) {
            classFH.field2257.field2211 = true;
         }

         if (Scene.method4144(var1.field2045, var1.field2046, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
            float var33 = classVI.method11957(
               var1.field2045, var1.field2046, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28, -52545789
            );
            if (var33 > var1.field2042) {
               var1.field2026 = var3;
               var1.field2034 = var4;
               var1.field2042 = var33;
            }
         }

         if (-1 == var2.field2287 * 1479555085) {
            if (1145127777 * var2.field2285 != 12345678) {
               classFH.method4758(
                  var18,
                  var20,
                  var24,
                  var17,
                  var19,
                  var23,
                  var25,
                  var26,
                  var28,
                  1145127777 * var2.field2285,
                  -633153015 * var2.field2288,
                  var2.field2284 * 1860831095
               );
            }
         } else if (!Scene.field2084) {
            classFH.method4769(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               1145127777 * var2.field2285,
               var2.field2288 * -633153015,
               var2.field2284 * 1860831095,
               (int)var5,
               (int)var6,
               (int)var8,
               (int)var9,
               (int)var10,
               (int)var12,
               (int)var13,
               (int)var14,
               (int)var16,
               1479555085 * var2.field2287
            );
         } else {
            int var34 = classFH.field2257.field2239.vmethod408(var2.field2287 * 1479555085, -1475347955);
            classFH.method4758(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               Scene.method4142(var34, var2.field2285 * 1145127777),
               Scene.method4142(var34, -633153015 * var2.field2288),
               Scene.method4142(var34, var2.field2284 * 1860831095)
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;IIFFFFFFFFFFFFI)V")
   @ObfuscatedName("ap")
   void method5034(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      int var17
   ) {
      try {
         classFD var18 = classFH.field2257;
         int var19 = var18.field2209;
         int var20 = var18.field2232;
         int var21 = var18.field2235;
         float var22 = var20 + var5 * var19 / var13;
         float var23 = var21 + var9 * var19 / var13;
         float var24 = var20 + var6 * var19 / var14;
         float var25 = var21 + var10 * var19 / var14;
         float var26 = var20 + var7 * var19 / var15;
         float var27 = var21 + var11 * var19 / var15;
         float var28 = var20 + var8 * var19 / var16;
         float var29 = var21 + var12 * var19 / var16;
         float var30 = classFQ.method4947(var13);
         float var31 = classFQ.method4947(var14);
         float var32 = classFQ.method4947(var15);
         float var33 = classFQ.method4947(var16);
         var18.field2213 = 0;
         rl10 var34 = var1.field1993[var1.field2150.field1710 * -483624883][var3 + var1.field2147][var4 + var1.field2147];
         if ((var25 - var29) * (var26 - var28) - (var27 - var29) * (var24 - var28) > 0.0F) {
            if (Scene.method4503(var1.field2045, var1.field2046, (int)var27, (int)var29, (int)var25, (int)var26, (int)var28, (int)var24)) {
               float var35 = method5036(
                  var1.field2045, var1.field2046, (int)var26, (int)var28, (int)var24, (int)var27, (int)var29, (int)var25, var32, var33, var31
               );
               if (var35 > var1.field2042 && field2411 <= var1.field2150.field1710 * -483624883) {
                  var1.method4438(var3, var4, var35);
               }

               if (var1.field2045 >= classOE.field4843.getViewportXOffset()
                  && var1.field2045 < classOE.field4843.getViewportXOffset() + classOE.field4843.getViewportWidth()
                  && var1.field2046 >= classOE.field4843.getViewportYOffset()
                  && var1.field2046 < classOE.field4843.getViewportYOffset() + classOE.field4843.getViewportHeight()
                  && var34 != null
                  && var2 == var34.method10033()) {
                  var1.method4401(var3, var4, var34.method10038());
               }
            }

            if (!classOE.field4843.isGpu()) {
               var18.field2211 = false;
               int var38 = var18.field2227;
               if (var26 < 0.0F || var28 < 0.0F || var24 < 0.0F || var26 > var38 || var28 > var38 || var24 > var38) {
                  var18.field2211 = true;
               }

               if (var2.field2287 * 1479555085 == -1) {
                  if (var2.field2286 * -665850825 != 12345678) {
                     classFQ.method4963(
                        var27,
                        var29,
                        var25,
                        var26,
                        var28,
                        var24,
                        var32,
                        var33,
                        var31,
                        var2.field2286 * -665850825,
                        var2.field2284 * 1860831095,
                        var2.field2288 * -633153015
                     );
                  }
               } else if (!Scene.field2084) {
                  if (var2.field2283) {
                     classFQ.method4962(
                        var27,
                        var29,
                        var25,
                        var26,
                        var28,
                        var24,
                        var32,
                        var33,
                        var31,
                        var2.field2286 * -665850825,
                        var2.field2284 * 1860831095,
                        var2.field2288 * -633153015,
                        (int)var5,
                        (int)var6,
                        (int)var8,
                        (int)var9,
                        (int)var10,
                        (int)var12,
                        (int)var13,
                        (int)var14,
                        (int)var16,
                        var2.field2287 * 1479555085
                     );
                  } else {
                     classFQ.method4962(
                        var27,
                        var29,
                        var25,
                        var26,
                        var28,
                        var24,
                        var32,
                        var33,
                        var31,
                        var2.field2286 * -665850825,
                        var2.field2284 * 1860831095,
                        var2.field2288 * -633153015,
                        (int)var7,
                        (int)var8,
                        (int)var6,
                        (int)var11,
                        (int)var12,
                        (int)var10,
                        (int)var15,
                        (int)var16,
                        (int)var14,
                        var2.field2287 * 1479555085
                     );
                  }
               } else {
                  int var36 = var18.field2239.method4683(var2.field2287 * 1479555085);
                  classFQ.method4963(
                     var27,
                     var29,
                     var25,
                     var26,
                     var28,
                     var24,
                     var32,
                     var33,
                     var31,
                     Scene.method4454(var36, var2.field2286 * -665850825),
                     Scene.method4454(var36, var2.field2284 * 1860831095),
                     Scene.method4454(var36, var2.field2288 * -633153015)
                  );
               }
            }
         }

         if ((var29 - var25) * (var22 - var24) - (var23 - var25) * (var28 - var24) > 0.0F) {
            if (Scene.method4503(var1.field2045, var1.field2046, (int)var23, (int)var25, (int)var29, (int)var22, (int)var24, (int)var28)) {
               float var39 = method5036(
                  var1.field2045, var1.field2046, (int)var22, (int)var24, (int)var28, (int)var23, (int)var25, (int)var29, var30, var31, var33
               );
               if (var39 > var1.field2042 && field2411 <= var1.field2150.field1710 * -483624883) {
                  var1.method4438(var3, var4, var39);
               }

               if (var1.field2045 >= classOE.field4843.getViewportXOffset()
                  && var1.field2045 < classOE.field4843.getViewportXOffset() + classOE.field4843.getViewportWidth()
                  && var1.field2046 >= classOE.field4843.getViewportYOffset()
                  && var1.field2046 < classOE.field4843.getViewportYOffset() + classOE.field4843.getViewportHeight()
                  && var34 != null
                  && var2 == var34.method10033()) {
                  var1.method4401(var3, var4, var34.method10038());
               }
            }

            if (!classOE.field4843.isGpu()) {
               var18.field2211 = false;
               int var40 = var18.field2227;
               if (var22 < 0.0F || var24 < 0.0F || var28 < 0.0F || var22 > var40 || var24 > var40 || var28 > var40) {
                  var18.field2211 = true;
               }

               if (var2.field2287 * 1479555085 == -1) {
                  if (var2.field2285 * 1145127777 != 12345678) {
                     classFQ.method4963(
                        var23,
                        var25,
                        var29,
                        var22,
                        var24,
                        var28,
                        var30,
                        var31,
                        var33,
                        var2.field2285 * 1145127777,
                        var2.field2288 * -633153015,
                        var2.field2284 * 1860831095
                     );
                  }
               } else if (!Scene.field2084) {
                  classFQ.method4962(
                     var23,
                     var25,
                     var29,
                     var22,
                     var24,
                     var28,
                     var30,
                     var31,
                     var33,
                     var2.field2285 * 1145127777,
                     var2.field2288 * -633153015,
                     var2.field2284 * 1860831095,
                     (int)var5,
                     (int)var6,
                     (int)var8,
                     (int)var9,
                     (int)var10,
                     (int)var12,
                     (int)var13,
                     (int)var14,
                     (int)var16,
                     var2.field2287 * 1479555085
                  );
               } else {
                  int var41 = var18.field2239.method4683(var2.field2287 * 1479555085);
                  classFQ.method4963(
                     var23,
                     var25,
                     var29,
                     var22,
                     var24,
                     var28,
                     var30,
                     var31,
                     var33,
                     Scene.method4454(var41, var2.field2285 * 1145127777),
                     Scene.method4454(var41, var2.field2288 * -633153015),
                     Scene.method4454(var41, var2.field2284 * 1860831095)
                  );
               }
            }
         }
      } catch (Exception var37) {
         client.field1026.warn("error during underlay rendering", var37);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("av")
   void method5026(Scene var1, SceneTileModel var2, int var3, int var4) {
      classFH.field2257.field2213 = 0;
      int var5 = var2.field2330.length;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var2.field2330[var6];
         int var8 = var2.field2331[var6];
         int var9 = var2.field2329[var6];
         float var10 = SceneTileModel.field2337[var7];
         float var11 = SceneTileModel.field2337[var8];
         float var12 = SceneTileModel.field2337[var9];
         float var13 = SceneTileModel.field2340[var7];
         float var14 = SceneTileModel.field2340[var8];
         float var15 = SceneTileModel.field2340[var9];
         float var16 = SceneTileModel.field2338[var7];
         float var17 = SceneTileModel.field2338[var8];
         float var18 = SceneTileModel.field2338[var9];
         if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0.0F) {
            classFH.field2257.field2211 = false;
            int var19 = classFH.method4731();
            if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > var19 || var11 > var19 || var12 > var19) {
               classFH.field2257.field2211 = true;
            }

            if (Scene.method4144(var1.field2045, var1.field2046, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
               float var20 = classVI.method11957(
                  var1.field2045, var1.field2046, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18, -1843758356
               );
               if (var20 > var1.field2042) {
                  var1.field2026 = var3;
                  var1.field2034 = var4;
                  var1.field2042 = var20;
               }
            }

            if (var2.field2324 != null && var2.field2324[var6] != -1) {
               if (!Scene.field2084) {
                  if (var2.field2319) {
                     classFH.method4769(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.field2332[var6],
                        var2.field2325[var6],
                        var2.field2328[var6],
                        SceneTileModel.field2339[0],
                        SceneTileModel.field2339[1],
                        SceneTileModel.field2339[3],
                        SceneTileModel.field2335[0],
                        SceneTileModel.field2335[1],
                        SceneTileModel.field2335[3],
                        SceneTileModel.field2341[0],
                        SceneTileModel.field2341[1],
                        SceneTileModel.field2341[3],
                        var2.field2324[var6]
                     );
                  } else {
                     classFH.method4769(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.field2332[var6],
                        var2.field2325[var6],
                        var2.field2328[var6],
                        SceneTileModel.field2339[var7],
                        SceneTileModel.field2339[var8],
                        SceneTileModel.field2339[var9],
                        SceneTileModel.field2335[var7],
                        SceneTileModel.field2335[var8],
                        SceneTileModel.field2335[var9],
                        SceneTileModel.field2341[var7],
                        SceneTileModel.field2341[var8],
                        SceneTileModel.field2341[var9],
                        var2.field2324[var6]
                     );
                  }
               } else {
                  int var21 = classFH.field2257.field2239.vmethod408(var2.field2324[var6], -961735207);
                  classFH.method4758(
                     var13,
                     var14,
                     var15,
                     var10,
                     var11,
                     var12,
                     var16,
                     var17,
                     var18,
                     Scene.method4142(var21, var2.field2332[var6]),
                     Scene.method4142(var21, var2.field2325[var6]),
                     Scene.method4142(var21, var2.field2328[var6])
                  );
               }
            } else if (var2.field2332[var6] != 12345678) {
               classFH.method4758(
                  var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.field2332[var6], var2.field2325[var6], var2.field2328[var6]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("al")
   abstract void vmethod429(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("vq")
   public void method5038(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      this.method5034(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, 650575801);
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;IIII)V")
   @ObfuscatedName("nd")
   public void method5033(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6) {
      field2411 = var3;
      this.vmethod436(var1, var2, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("an")
   void method5027(Scene var1, SceneTileModel var2, int var3, int var4) {
      classFH.field2257.field2213 = 0;
      int var5 = var2.field2330.length;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var2.field2330[var6];
         int var8 = var2.field2331[var6];
         int var9 = var2.field2329[var6];
         float var10 = SceneTileModel.field2337[var7];
         float var11 = SceneTileModel.field2337[var8];
         float var12 = SceneTileModel.field2337[var9];
         float var13 = SceneTileModel.field2340[var7];
         float var14 = SceneTileModel.field2340[var8];
         float var15 = SceneTileModel.field2340[var9];
         float var16 = SceneTileModel.field2338[var7];
         float var17 = SceneTileModel.field2338[var8];
         float var18 = SceneTileModel.field2338[var9];
         if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0.0F) {
            classFH.field2257.field2211 = false;
            int var19 = classFH.method4731();
            if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > var19 || var11 > var19 || var12 > var19) {
               classFH.field2257.field2211 = true;
            }

            if (Scene.method4144(var1.field2045, var1.field2046, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
               float var20 = classVI.method11957(
                  var1.field2045, var1.field2046, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18, 968350016
               );
               if (var20 > var1.field2042) {
                  var1.field2026 = var3;
                  var1.field2034 = var4;
                  var1.field2042 = var20;
               }
            }

            if (var2.field2324 != null && var2.field2324[var6] != -1) {
               if (!Scene.field2084) {
                  if (var2.field2319) {
                     classFH.method4769(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.field2332[var6],
                        var2.field2325[var6],
                        var2.field2328[var6],
                        SceneTileModel.field2339[0],
                        SceneTileModel.field2339[1],
                        SceneTileModel.field2339[3],
                        SceneTileModel.field2335[0],
                        SceneTileModel.field2335[1],
                        SceneTileModel.field2335[3],
                        SceneTileModel.field2341[0],
                        SceneTileModel.field2341[1],
                        SceneTileModel.field2341[3],
                        var2.field2324[var6]
                     );
                  } else {
                     classFH.method4769(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.field2332[var6],
                        var2.field2325[var6],
                        var2.field2328[var6],
                        SceneTileModel.field2339[var7],
                        SceneTileModel.field2339[var8],
                        SceneTileModel.field2339[var9],
                        SceneTileModel.field2335[var7],
                        SceneTileModel.field2335[var8],
                        SceneTileModel.field2335[var9],
                        SceneTileModel.field2341[var7],
                        SceneTileModel.field2341[var8],
                        SceneTileModel.field2341[var9],
                        var2.field2324[var6]
                     );
                  }
               } else {
                  int var21 = classFH.field2257.field2239.vmethod408(var2.field2324[var6], -1174194734);
                  classFH.method4758(
                     var13,
                     var14,
                     var15,
                     var10,
                     var11,
                     var12,
                     var16,
                     var17,
                     var18,
                     Scene.method4142(var21, var2.field2332[var6]),
                     Scene.method4142(var21, var2.field2325[var6]),
                     Scene.method4142(var21, var2.field2328[var6])
                  );
               }
            } else if (var2.field2332[var6] != 12345678) {
               classFH.method4758(
                  var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.field2332[var6], var2.field2325[var6], var2.field2328[var6]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("xg")
   public void vmethod437(Scene var1, SceneTileModel var2, int var3, int var4) {
      this.vmethod431(var1, var2, var3, var4, 461027311);
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("am")
   void method5028(Scene var1, SceneTileModel var2, int var3, int var4) {
      classFH.field2257.field2213 = 0;
      int var5 = var2.field2330.length;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var2.field2330[var6];
         int var8 = var2.field2331[var6];
         int var9 = var2.field2329[var6];
         float var10 = SceneTileModel.field2337[var7];
         float var11 = SceneTileModel.field2337[var8];
         float var12 = SceneTileModel.field2337[var9];
         float var13 = SceneTileModel.field2340[var7];
         float var14 = SceneTileModel.field2340[var8];
         float var15 = SceneTileModel.field2340[var9];
         float var16 = SceneTileModel.field2338[var7];
         float var17 = SceneTileModel.field2338[var8];
         float var18 = SceneTileModel.field2338[var9];
         if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0.0F) {
            classFH.field2257.field2211 = false;
            int var19 = classFH.method4731();
            if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > var19 || var11 > var19 || var12 > var19) {
               classFH.field2257.field2211 = true;
            }

            if (Scene.method4144(var1.field2045, var1.field2046, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
               float var20 = classVI.method11957(
                  var1.field2045, var1.field2046, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18, -1725798257
               );
               if (var20 > var1.field2042) {
                  var1.field2026 = var3;
                  var1.field2034 = var4;
                  var1.field2042 = var20;
               }
            }

            if (var2.field2324 != null && var2.field2324[var6] != -1) {
               if (!Scene.field2084) {
                  if (var2.field2319) {
                     classFH.method4769(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.field2332[var6],
                        var2.field2325[var6],
                        var2.field2328[var6],
                        SceneTileModel.field2339[0],
                        SceneTileModel.field2339[1],
                        SceneTileModel.field2339[3],
                        SceneTileModel.field2335[0],
                        SceneTileModel.field2335[1],
                        SceneTileModel.field2335[3],
                        SceneTileModel.field2341[0],
                        SceneTileModel.field2341[1],
                        SceneTileModel.field2341[3],
                        var2.field2324[var6]
                     );
                  } else {
                     classFH.method4769(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.field2332[var6],
                        var2.field2325[var6],
                        var2.field2328[var6],
                        SceneTileModel.field2339[var7],
                        SceneTileModel.field2339[var8],
                        SceneTileModel.field2339[var9],
                        SceneTileModel.field2335[var7],
                        SceneTileModel.field2335[var8],
                        SceneTileModel.field2335[var9],
                        SceneTileModel.field2341[var7],
                        SceneTileModel.field2341[var8],
                        SceneTileModel.field2341[var9],
                        var2.field2324[var6]
                     );
                  }
               } else {
                  int var21 = classFH.field2257.field2239.vmethod408(var2.field2324[var6], -1087616155);
                  classFH.method4758(
                     var13,
                     var14,
                     var15,
                     var10,
                     var11,
                     var12,
                     var16,
                     var17,
                     var18,
                     Scene.method4142(var21, var2.field2332[var6]),
                     Scene.method4142(var21, var2.field2325[var6]),
                     Scene.method4142(var21, var2.field2328[var6])
                  );
               }
            } else if (var2.field2332[var6] != 12345678) {
               classFH.method4758(
                  var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.field2332[var6], var2.field2325[var6], var2.field2328[var6]
               );
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;IIFFFFFFFFFFFF)V")
   @ObfuscatedName("ak")
   void method5023(
      Scene var1,
      SceneTilePaint var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      float var17 = classFH.method4705() + var5 * classFH.method4727() / var13;
      float var18 = classFH.method4710() + var9 * classFH.method4727() / var13;
      float var19 = classFH.method4705() + var6 * classFH.method4727() / var14;
      float var20 = classFH.method4710() + var10 * classFH.method4727() / var14;
      float var21 = classFH.method4705() + var7 * classFH.method4727() / var15;
      float var22 = classFH.method4710() + var11 * classFH.method4727() / var15;
      float var23 = classFH.method4705() + var8 * classFH.method4727() / var16;
      float var24 = classFH.method4710() + var12 * classFH.method4727() / var16;
      float var25 = classJE.method6356(var13, 2101975182);
      float var26 = classJE.method6356(var14, 2146129497);
      float var27 = classJE.method6356(var15, 2119120462);
      float var28 = classJE.method6356(var16, 2119626815);
      classFH.field2257.field2213 = 0;
      if ((var20 - var24) * (var21 - var23) - (var22 - var24) * (var19 - var23) > 0.0F) {
         classFH.field2257.field2211 = false;
         int var29 = classFH.method4731();
         if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
            classFH.field2257.field2211 = true;
         }

         if (Scene.method4144(var1.field2045, var1.field2046, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
            float var30 = classVI.method11957(
               var1.field2045, var1.field2046, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26, 1010728738
            );
            if (var30 > var1.field2042) {
               var1.field2026 = var3;
               var1.field2034 = var4;
               var1.field2042 = var30;
            }
         }

         if (var2.field2287 * 487891967 == -1) {
            if (-1138628509 != -665850825 * var2.field2286) {
               classFH.method4758(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -1088977242 * var2.field2286,
                  1860831095 * var2.field2284,
                  -633153015 * var2.field2288
               );
            }
         } else if (!Scene.field2084) {
            if (var2.field2283) {
               classFH.method4769(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -665850825 * var2.field2286,
                  var2.field2284 * -1912210833,
                  var2.field2288 * -1966719815,
                  (int)var5,
                  (int)var6,
                  (int)var8,
                  (int)var9,
                  (int)var10,
                  (int)var12,
                  (int)var13,
                  (int)var14,
                  (int)var16,
                  var2.field2287 * -414115434
               );
            } else {
               classFH.method4769(
                  var22,
                  var24,
                  var20,
                  var21,
                  var23,
                  var19,
                  var27,
                  var28,
                  var26,
                  -291767698 * var2.field2286,
                  var2.field2284 * 268482076,
                  -1718665627 * var2.field2288,
                  (int)var7,
                  (int)var8,
                  (int)var6,
                  (int)var11,
                  (int)var12,
                  (int)var10,
                  (int)var15,
                  (int)var16,
                  (int)var14,
                  1479555085 * var2.field2287
               );
            }
         } else {
            int var32 = classFH.field2257.field2239.vmethod408(1479555085 * var2.field2287, -1169549494);
            classFH.method4758(
               var22,
               var24,
               var20,
               var21,
               var23,
               var19,
               var27,
               var28,
               var26,
               Scene.method4142(var32, -665850825 * var2.field2286),
               Scene.method4142(var32, var2.field2284 * 1860831095),
               Scene.method4142(var32, var2.field2288 * -633153015)
            );
         }
      }

      if ((var24 - var20) * (var17 - var19) - (var23 - var19) * (var18 - var20) > 0.0F) {
         classFH.field2257.field2211 = false;
         int var31 = classFH.method4731();
         if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var31 || var19 > var31 || var23 > var31) {
            classFH.field2257.field2211 = true;
         }

         if (Scene.method4144(var1.field2045, var1.field2046, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
            float var33 = classVI.method11957(
               var1.field2045, var1.field2046, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28, 806671715
            );
            if (var33 > var1.field2042) {
               var1.field2026 = var3;
               var1.field2034 = var4;
               var1.field2042 = var33;
            }
         }

         if (-1 == var2.field2287 * -505554333) {
            if (1145127777 * var2.field2285 != 12345678) {
               classFH.method4758(
                  var18,
                  var20,
                  var24,
                  var17,
                  var19,
                  var23,
                  var25,
                  var26,
                  var28,
                  1145127777 * var2.field2285,
                  -633153015 * var2.field2288,
                  var2.field2284 * -1305505055
               );
            }
         } else if (!Scene.field2084) {
            classFH.method4769(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               1145127777 * var2.field2285,
               var2.field2288 * -633153015,
               var2.field2284 * 1860831095,
               (int)var5,
               (int)var6,
               (int)var8,
               (int)var9,
               (int)var10,
               (int)var12,
               (int)var13,
               (int)var14,
               (int)var16,
               1479555085 * var2.field2287
            );
         } else {
            int var34 = classFH.field2257.field2239.vmethod408(var2.field2287 * 873498727, -1051532129);
            classFH.method4758(
               var18,
               var20,
               var24,
               var17,
               var19,
               var23,
               var25,
               var26,
               var28,
               Scene.method4142(var34, var2.field2285 * -1226497550),
               Scene.method4142(var34, -457502577 * var2.field2288),
               Scene.method4142(var34, var2.field2284 * 1860831095)
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("at")
   void method5029(Scene var1, SceneTileModel var2, int var3, int var4) {
      classFH.field2257.field2230 = 0;
      int var5 = var2.field2322.length;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var2.field2327[var6];
         int var8 = var2.field2323[var6];
         int var9 = var2.field2329[var6];
         float var10 = SceneTileModel.field2340[var7];
         float var11 = SceneTileModel.field2338[var8];
         float var12 = SceneTileModel.field2340[var9];
         float var13 = SceneTileModel.field2338[var7];
         float var14 = SceneTileModel.field2337[var8];
         float var15 = SceneTileModel.field2337[var9];
         float var16 = SceneTileModel.field2340[var7];
         float var17 = SceneTileModel.field2337[var8];
         float var18 = SceneTileModel.field2337[var9];
         if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0.0F) {
            classFH.field2257.field2211 = false;
            int var19 = classFH.method4734();
            if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > var19 || var11 > var19 || var12 > var19) {
               classFH.field2257.field2211 = true;
            }

            if (Scene.method4144(var1.field2054, var1.field2054, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
               float var20 = classVI.method11957(
                  var1.field2032, var1.field2053, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18, -282384414
               );
               if (var20 > var1.field2042) {
                  var1.field2053 = var3;
                  var1.field2121 = var4;
                  var1.field2090 = var20;
               }
            }

            if (var2.field2332 != null && var2.field2324[var6] != -1) {
               if (!Scene.field2084) {
                  if (var2.field2319) {
                     classFH.method4770(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.field2324[var6],
                        var2.field2332[var6],
                        var2.field2332[var6],
                        SceneTileModel.field2341[0],
                        SceneTileModel.field2339[1],
                        SceneTileModel.field2339[3],
                        SceneTileModel.field2341[0],
                        SceneTileModel.field2339[1],
                        SceneTileModel.field2335[3],
                        SceneTileModel.field2339[0],
                        SceneTileModel.field2335[1],
                        SceneTileModel.field2335[3],
                        var2.field2324[var6]
                     );
                  } else {
                     classFH.method4769(
                        var13,
                        var14,
                        var15,
                        var10,
                        var11,
                        var12,
                        var16,
                        var17,
                        var18,
                        var2.field2328[var6],
                        var2.field2332[var6],
                        var2.field2325[var6],
                        SceneTileModel.field2339[var7],
                        SceneTileModel.field2339[var8],
                        SceneTileModel.field2341[var9],
                        SceneTileModel.field2339[var7],
                        SceneTileModel.field2341[var8],
                        SceneTileModel.field2335[var9],
                        SceneTileModel.field2341[var7],
                        SceneTileModel.field2341[var8],
                        SceneTileModel.field2339[var9],
                        var2.field2325[var6]
                     );
                  }
               } else {
                  int var21 = classFH.field2257.field2239.vmethod408(var2.field2332[var6], -2090204362);
                  classFH.method4760(
                     var13,
                     var14,
                     var15,
                     var10,
                     var11,
                     var12,
                     var16,
                     var17,
                     var18,
                     Scene.method4142(var21, var2.field2324[var6]),
                     Scene.method4142(var21, var2.field2332[var6]),
                     Scene.method4142(var21, var2.field2328[var6])
                  );
               }
            } else if (var2.field2328[var6] != 12345678) {
               classFH.method4761(
                  var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.field2328[var6], var2.field2332[var6], var2.field2332[var6]
               );
            }
         }
      }
   }
}
