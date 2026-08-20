import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ei")
public class FloatProjection extends Projection implements net.runelite.api.FloatProjection {
   @ObfuscatedName("qk")
   public static final float[] field1766 = new float[16];
   @ToRemove(unused = "true")
   @ObfuscatedName("co")
   public static final int field1771 = 85;
   @ObfuscatedName("af")
   float[] field1763 = new float[3];
   @ObfuscatedName("ae")
   long field1765 = 0L;
   @ObfuscatedName("jq")
   static int field1772;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field1769 = 9;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("az")
   classUU transformationMatrix;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field1770 = 33;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field1767 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field1768 = 50;

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("az")
   @Override
   void vmethod435(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      if (client.field1096 == 0) {
         int var8 = classFO.field2350 * 613116963;
         var6 = this.method3897(var6);
         var1.method3839(var2, this.transformationMatrix, var3, var4, var5, var6);
         if (var8 != classFO.field2350 * 613116963) {
            this.method3898();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ad")
   void method3894(long var1) {
      try {
         this.field1765 = 5128300923381284097L * var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ei.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("as")
   @Override
   void vmethod422(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      int var8 = classDM.method3431((byte)109);
      if (0L != this.field1765 * 3132681558244590337L) {
         boolean var10 = 0L != var6;
         if (var10) {
            boolean var11 = 1 == (int)(var6 >>> 19 & 1L);
            var10 = !var11;
         }

         boolean var18 = !var10;
         if (!var18) {
            long var13 = 3132681558244590337L * this.field1765;
            boolean var15 = var13 != 0L;
            if (var15) {
               boolean var16 = 1 == (int)(var13 >>> 19 & 1L);
               var15 = !var16;
            }

            var18 = var15;
         }

         if (var18) {
            var6 = classCF.method1462(3132681558244590337L * this.field1765);
         }
      }

      var1.vmethod419(var2, this.transformationMatrix, var3, var4, var5, var6);
      if (0L != 3132681558244590337L * this.field1765 && var8 != classDM.method3431((byte)119)) {
         long var17 = this.field1765 * 3132681558244590337L;
         boolean var12 = var17 != 0L;
         if (var12) {
            boolean var19 = (int)(var17 >>> 19 & 1L) == 1;
            var12 = !var19;
         }

         this.field1765 = classRF.method9961(0, 0, 0, 5, !var12, 0, 0, (short)26993) * 5128300923381284097L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;IIII)V")
   @ObfuscatedName("af")
   @Override
   void vmethod426(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6) {
      try {
         if (1 == classFH.field2257.field2217) {
            if (var6 == -1565439737) {
               throw new IllegalStateException();
            }
         } else {
            float var7;
            float var8 = var7 = var4 << 7;
            float var9;
            float var10 = var9 = var5 << 7;
            float var11;
            float var12 = var11 = var8 + 128.0F;
            float var13;
            float var14 = var13 = 128.0F + var10;
            float var15 = var1.field2060[var3][var4][var5];
            float var16 = var1.field2060[var3][var4 + 1][var5];
            float var17 = var1.field2060[var3][1 + var4][1 + var5];
            float var18 = var1.field2060[var3][var4][1 + var5];
            this.transformationMatrix.method11616(var8, var15, var10, this.field1763, 1634822735);
            var8 = this.field1763[0];
            var15 = this.field1763[1];
            var10 = this.field1763[2];
            if (var10 < 50.0F) {
               if (var6 == -1565439737) {
                  throw new IllegalStateException();
               }
            } else {
               this.transformationMatrix.method11616(var12, var16, var9, this.field1763, 1634822735);
               var12 = this.field1763[0];
               var16 = this.field1763[1];
               var9 = this.field1763[2];
               if (var9 < 50.0F) {
                  if (var6 == -1565439737) {
                     throw new IllegalStateException();
                  }
               } else {
                  this.transformationMatrix.method11616(var11, var17, var14, this.field1763, 1634822735);
                  var11 = this.field1763[0];
                  var17 = this.field1763[1];
                  var14 = this.field1763[2];
                  if (!(var14 < 50.0F)) {
                     this.transformationMatrix.method11616(var7, var18, var13, this.field1763, 1634822735);
                     var7 = this.field1763[0];
                     var18 = this.field1763[1];
                     var13 = this.field1763[2];
                     if (var13 < 50.0F) {
                        if (var6 == -1565439737) {
                           throw new IllegalStateException();
                        }
                     } else {
                        this.method5034(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var18, var10, var9, var14, var13, -1799784665);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var19) {
         throw classEG.newRunException(var19, "ei.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;III)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod431(Scene var1, SceneTileModel var2, int var3, int var4, int var5) {
      try {
         if (1 != classFH.field2257.field2217) {
            int var6 = var2.field2322.length;

            for (int var7 = 0; var7 < var6; var7++) {
               if (var5 == 52058636) {
                  throw new IllegalStateException();
               }

               float var8 = var2.field2322[var7];
               float var9 = var2.field2323[var7];
               float var10 = var2.field2327[var7];
               this.transformationMatrix.method11616(var8, var9, var10, this.field1763, 1634822735);
               var8 = this.field1763[0];
               var9 = this.field1763[1];
               var10 = this.field1763[2];
               if (var10 < 50.0F) {
                  return;
               }

               if (var2.field2324 != null) {
                  SceneTileModel.field2339[var7] = (int)var8;
                  SceneTileModel.field2335[var7] = (int)var9;
                  SceneTileModel.field2341[var7] = (int)var10;
               }

               SceneTileModel.field2337[var7] = classFH.method4705() + var8 * classFH.method4727() / var10;
               SceneTileModel.field2340[var7] = classFH.method4710() + var9 * classFH.method4727() / var10;
               SceneTileModel.field2338[var7] = classJE.method6356(var10, 2104529011);
            }

            this.method5035(var1, var2, var3, var4, -404951706);
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "ei.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod423(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      int var8 = classDM.method3431((byte)88);
      if (0L != this.field1765 * 3132681558244590337L) {
         boolean var10 = 0L != var6;
         if (var10) {
            boolean var11 = 1 == (int)(var6 >>> 19 & 1L);
            var10 = !var11;
         }

         boolean var18 = !var10;
         if (!var18) {
            long var13 = 3132681558244590337L * this.field1765;
            boolean var15 = var13 != 0L;
            if (var15) {
               boolean var16 = 1 == (int)(var13 >>> 19 & 1L);
               var15 = !var16;
            }

            var18 = var15;
         }

         if (var18) {
            var6 = classCF.method1462(3132681558244590337L * this.field1765);
         }
      }

      var1.vmethod419(var2, this.transformationMatrix, var3, var4, var5, var6);
      if (0L != 3132681558244590337L * this.field1765 && var8 != classDM.method3431((byte)50)) {
         long var17 = this.field1765 * 3132681558244590337L;
         boolean var12 = var17 != 0L;
         if (var12) {
            boolean var19 = (int)(var17 >>> 19 & 1L) == 1;
            var12 = !var19;
         }

         this.field1765 = classRF.method9961(0, 0, 0, 5, !var12, 0, 0, (short)7034) * 5128300923381284097L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod424(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      int var8 = classDM.method3431((byte)62);
      if (0L != this.field1765 * 3132681558244590337L) {
         boolean var10 = 0L != var6;
         if (var10) {
            boolean var11 = 1 == (int)(var6 >>> 19 & 1L);
            var10 = !var11;
         }

         boolean var18 = !var10;
         if (!var18) {
            long var13 = 3132681558244590337L * this.field1765;
            boolean var15 = var13 != 0L;
            if (var15) {
               boolean var16 = 1 == (int)(var13 >>> 19 & 1L);
               var15 = !var16;
            }

            var18 = var15;
         }

         if (var18) {
            var6 = classCF.method1462(3132681558244590337L * this.field1765);
         }
      }

      var1.vmethod419(var2, this.transformationMatrix, var3, var4, var5, var6);
      if (0L != 3132681558244590337L * this.field1765 && var8 != classDM.method3431((byte)14)) {
         long var17 = this.field1765 * 3132681558244590337L;
         boolean var12 = var17 != 0L;
         if (var12) {
            boolean var19 = (int)(var17 >>> 19 & 1L) == 1;
            var12 = !var19;
         }

         this.field1765 = classRF.method9961(0, 0, 0, 5, !var12, 0, 0, (short)23893) * 5128300923381284097L;
      }
   }

   FloatProjection(classUU var1) {
      this.transformationMatrix = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lee;IIIIJ)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod425(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
      int var8 = classDM.method3431((byte)42);
      if (0L != this.field1765 * 3132681558244590337L) {
         boolean var10 = 0L != var6;
         if (var10) {
            boolean var11 = 1 == (int)(var6 >>> 19 & 1L);
            var10 = !var11;
         }

         boolean var18 = !var10;
         if (!var18) {
            long var13 = 3132681558244590337L * this.field1765;
            boolean var15 = var13 != 0L;
            if (var15) {
               boolean var16 = 1 == (int)(var13 >>> 19 & 1L);
               var15 = !var16;
            }

            var18 = var15;
         }

         if (var18) {
            var6 = classCF.method1462(3132681558244590337L * this.field1765);
         }
      }

      var1.vmethod419(var2, this.transformationMatrix, var3, var4, var5, var6);
      if (0L != 3132681558244590337L * this.field1765 && var8 != classDM.method3431((byte)84)) {
         long var17 = this.field1765 * 3132681558244590337L;
         boolean var12 = var17 != 0L;
         if (var12) {
            boolean var19 = (int)(var17 >>> 19 & 1L) == 1;
            var12 = !var19;
         }

         this.field1765 = classRF.method9961(0, 0, 0, 5, !var12, 0, 0, (short)12315) * 5128300923381284097L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("ac")
   @Override
   void vmethod427(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (1 != classFH.field2257.field2217) {
         float var6;
         float var7 = var6 = var4 << 7;
         float var8;
         float var9 = var8 = var5 << 7;
         float var10;
         float var11 = var10 = var7 + 128.0F;
         float var12;
         float var13 = var12 = 128.0F + var9;
         float var14 = var1.field2060[var3][var4][var5];
         float var15 = var1.field2060[var3][var4 + 1][var5];
         float var16 = var1.field2060[var3][1 + var4][1 + var5];
         float var17 = var1.field2060[var3][var4][1 + var5];
         this.transformationMatrix.method11616(var7, var14, var9, this.field1763, 1634822735);
         var7 = this.field1763[0];
         var14 = this.field1763[1];
         var9 = this.field1763[2];
         if (!(var9 < 50.0F)) {
            this.transformationMatrix.method11616(var11, var15, var8, this.field1763, 1634822735);
            var11 = this.field1763[0];
            var15 = this.field1763[1];
            var8 = this.field1763[2];
            if (!(var8 < 50.0F)) {
               this.transformationMatrix.method11616(var10, var16, var13, this.field1763, 1634822735);
               var10 = this.field1763[0];
               var16 = this.field1763[1];
               var13 = this.field1763[2];
               if (!(var13 < 50.0F)) {
                  this.transformationMatrix.method11616(var6, var17, var12, this.field1763, 1634822735);
                  var6 = this.field1763[0];
                  var17 = this.field1763[1];
                  var12 = this.field1763[2];
                  if (!(var12 < 50.0F)) {
                     this.method5034(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, 1985519612);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)J")
   @ObfuscatedName("di")
   public long method3897(long var1) {
      return this.field1765 * 3132681558244590337L == 0L || method3899(var1) && !method3899(this.field1765 * 3132681558244590337L)
         ? var1
         : this.field1765 * 3132681558244590337L & -524289L;
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("aa")
   @Override
   void vmethod428(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (1 != classFH.field2257.field2217) {
         float var6;
         float var7 = var6 = var4 << 7;
         float var8;
         float var9 = var8 = var5 << 7;
         float var10;
         float var11 = var10 = var7 + 128.0F;
         float var12;
         float var13 = var12 = 128.0F + var9;
         float var14 = var1.field2060[var3][var4][var5];
         float var15 = var1.field2060[var3][var4 + 1][var5];
         float var16 = var1.field2060[var3][1 + var4][1 + var5];
         float var17 = var1.field2060[var3][var4][1 + var5];
         this.transformationMatrix.method11616(var7, var14, var9, this.field1763, 1634822735);
         var7 = this.field1763[0];
         var14 = this.field1763[1];
         var9 = this.field1763[2];
         if (!(var9 < 50.0F)) {
            this.transformationMatrix.method11616(var11, var15, var8, this.field1763, 1634822735);
            var11 = this.field1763[0];
            var15 = this.field1763[1];
            var8 = this.field1763[2];
            if (!(var8 < 50.0F)) {
               this.transformationMatrix.method11616(var10, var16, var13, this.field1763, 1634822735);
               var10 = this.field1763[0];
               var16 = this.field1763[1];
               var13 = this.field1763[2];
               if (!(var13 < 50.0F)) {
                  this.transformationMatrix.method11616(var6, var17, var12, this.field1763, 1634822735);
                  var6 = this.field1763[0];
                  var17 = this.field1763[1];
                  var12 = this.field1763[2];
                  if (!(var12 < 50.0F)) {
                     this.method5034(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, 1820957243);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod432(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != classFH.field2257.field2217) {
         int var5 = var2.field2322.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.field2322[var6];
            float var8 = var2.field2323[var6];
            float var9 = var2.field2327[var6];
            this.transformationMatrix.method11616(var7, var8, var9, this.field1763, 1634822735);
            var7 = this.field1763[0];
            var8 = this.field1763[1];
            var9 = this.field1763[2];
            if (var9 < 50.0F) {
               return;
            }

            if (var2.field2324 != null) {
               SceneTileModel.field2339[var6] = (int)var7;
               SceneTileModel.field2335[var6] = (int)var8;
               SceneTileModel.field2341[var6] = (int)var9;
            }

            SceneTileModel.field2337[var6] = classFH.method4705() + var7 * classFH.method4727() / var9;
            SceneTileModel.field2340[var6] = classFH.method4710() + var8 * classFH.method4727() / var9;
            SceneTileModel.field2338[var6] = classJE.method6356(var9, 2093454043);
         }

         this.method5035(var1, var2, var3, var4, -705464145);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("al")
   @Override
   void vmethod429(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (1 != classFH.field2257.field2217) {
         float var6;
         float var7 = var6 = var4 << 7;
         float var8;
         float var9 = var8 = var5 << 7;
         float var10;
         float var11 = var10 = var7 + 128.0F;
         float var12;
         float var13 = var12 = 128.0F + var9;
         float var14 = var1.field2060[var3][var4][var5];
         float var15 = var1.field2060[var3][var4 + 1][var5];
         float var16 = var1.field2060[var3][1 + var4][1 + var5];
         float var17 = var1.field2060[var3][var4][1 + var5];
         this.transformationMatrix.method11616(var7, var14, var9, this.field1763, 1634822735);
         var7 = this.field1763[0];
         var14 = this.field1763[1];
         var9 = this.field1763[2];
         if (!(var9 < 50.0F)) {
            this.transformationMatrix.method11616(var11, var15, var8, this.field1763, 1634822735);
            var11 = this.field1763[0];
            var15 = this.field1763[1];
            var8 = this.field1763[2];
            if (!(var8 < 50.0F)) {
               this.transformationMatrix.method11616(var10, var16, var13, this.field1763, 1634822735);
               var10 = this.field1763[0];
               var16 = this.field1763[1];
               var13 = this.field1763[2];
               if (!(var13 < 50.0F)) {
                  this.transformationMatrix.method11616(var6, var17, var12, this.field1763, 1634822735);
                  var6 = this.field1763[0];
                  var17 = this.field1763[1];
                  var12 = this.field1763[2];
                  if (!(var12 < 50.0F)) {
                     this.method5034(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, -95244558);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Z")
   @ObfuscatedName("ln")
   public static boolean method3899(long var0) {
      return var0 != 0L && (var0 >>> 19 & 1L) == 0L;
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("ao")
   @Override
   void vmethod430(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      if (1 != classFH.field2257.field2217) {
         float var6;
         float var7 = var6 = var4 << 7;
         float var8;
         float var9 = var8 = var5 << 7;
         float var10;
         float var11 = var10 = var7 + 128.0F;
         float var12;
         float var13 = var12 = 128.0F + var9;
         float var14 = var1.field2060[var3][var4][var5];
         float var15 = var1.field2060[var3][var4 + 1][var5];
         float var16 = var1.field2060[var3][1 + var4][1 + var5];
         float var17 = var1.field2060[var3][var4][1 + var5];
         this.transformationMatrix.method11616(var7, var14, var9, this.field1763, 1634822735);
         var7 = this.field1763[0];
         var14 = this.field1763[1];
         var9 = this.field1763[2];
         if (!(var9 < 50.0F)) {
            this.transformationMatrix.method11616(var11, var15, var8, this.field1763, 1634822735);
            var11 = this.field1763[0];
            var15 = this.field1763[1];
            var8 = this.field1763[2];
            if (!(var8 < 50.0F)) {
               this.transformationMatrix.method11616(var10, var16, var13, this.field1763, 1634822735);
               var10 = this.field1763[0];
               var16 = this.field1763[1];
               var13 = this.field1763[2];
               if (!(var13 < 50.0F)) {
                  this.transformationMatrix.method11616(var6, var17, var12, this.field1763, 1634822735);
                  var6 = this.field1763[0];
                  var17 = this.field1763[1];
                  var12 = this.field1763[2];
                  if (!(var12 < 50.0F)) {
                     this.method5034(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, -1891497382);
                  }
               }
            }
         }
      }
   }

   public float[] project(float var1, float var2, float var3) {
      return this.project(var1, var2, var3, this.field1763);
   }

   public float[] project(float var1, float var2, float var3, float[] var4) {
      this.transformationMatrix.method11664(var1, var2, var3, var4);
      return var4;
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("aq")
   @Override
   void vmethod433(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != classFH.field2257.field2217) {
         int var5 = var2.field2322.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.field2322[var6];
            float var8 = var2.field2323[var6];
            float var9 = var2.field2327[var6];
            this.transformationMatrix.method11616(var7, var8, var9, this.field1763, 1634822735);
            var7 = this.field1763[0];
            var8 = this.field1763[1];
            var9 = this.field1763[2];
            if (var9 < 50.0F) {
               return;
            }

            if (var2.field2324 != null) {
               SceneTileModel.field2339[var6] = (int)var7;
               SceneTileModel.field2335[var6] = (int)var8;
               SceneTileModel.field2341[var6] = (int)var9;
            }

            SceneTileModel.field2337[var6] = classFH.method4705() + var7 * classFH.method4727() / var9;
            SceneTileModel.field2340[var6] = classFH.method4710() + var8 * classFH.method4727() / var9;
            SceneTileModel.field2338[var6] = classJE.method6356(var9, 2094720945);
         }

         this.method5035(var1, var2, var3, var4, 1292942959);
      }
   }

   public float[] getProjection() {
      this.transformationMatrix.method11647(field1766);
      return field1766;
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("ay")
   @Override
   void vmethod434(Scene var1, SceneTileModel var2, int var3, int var4) {
      if (1 != classFH.field2257.field2217) {
         int var5 = var2.field2322.length;

         for (int var6 = 0; var6 < var5; var6++) {
            float var7 = var2.field2322[var6];
            float var8 = var2.field2323[var6];
            float var9 = var2.field2327[var6];
            this.transformationMatrix.method11616(var7, var8, var9, this.field1763, 1634822735);
            var7 = this.field1763[0];
            var8 = this.field1763[1];
            var9 = this.field1763[2];
            if (var9 < 50.0F) {
               return;
            }

            if (var2.field2324 != null) {
               SceneTileModel.field2339[var6] = (int)var7;
               SceneTileModel.field2335[var6] = (int)var8;
               SceneTileModel.field2341[var6] = (int)var9;
            }

            SceneTileModel.field2337[var6] = classFH.method4705() + var7 * classFH.method4727() / var9;
            SceneTileModel.field2340[var6] = classFH.method4710() + var8 * classFH.method4727() / var9;
            SceneTileModel.field2338[var6] = classJE.method6356(var9, 2107472726);
         }

         this.method5035(var1, var2, var3, var4, -1793272505);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("tv")
   public void method3898() {
      if (this.field1765 * 3132681558244590337L != 0L) {
         this.field1765 = (this.field1765 * 3132681558244590337L & 524288L | 327680L) * 5128300923381284097L;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("af")
   static int method3896(int var0, int var1, int var2, int var3) {
      try {
         int var4 = var0 >> 16 & 0xFF;
         int var5 = var0 >> 8 & 0xFF;
         int var6 = var0 & 0xFF;
         int var7 = var1 >> 16 & 0xFF;
         int var8 = var1 >> 8 & 0xFF;
         int var9 = var1 & 0xFF;
         int var10 = var4 + var2 * (var7 - var4 + 1) / 64 & 0xFF;
         int var11 = var5 + var2 * (1 + (var8 - var5)) / 64 & 0xFF;
         int var12 = var6 + var2 * (1 + (var9 - var6)) / 64 & 0xFF;
         return var10 << 16 | var11 << 8 | var12;
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "ei.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   public static int method3895(int var0, int var1) {
      try {
         return (var0 & 622673241 * classZK.field7191) - 1;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ei.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfj;III)V")
   @ObfuscatedName("cl")
   @Override
   public void vmethod436(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
      this.vmethod426(var1, var2, var3, var4, var5, 1925151093);
   }

   @ObfuscatedSignature(descriptor = "(Lez;Lfn;II)V")
   @ObfuscatedName("xg")
   @Override
   public void vmethod437(Scene var1, SceneTileModel var2, int var3, int var4) {
      this.vmethod431(var1, var2, var3, var4, 461027311);
   }
}
