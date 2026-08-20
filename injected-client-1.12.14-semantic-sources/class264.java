import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kw")
public class class264 {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3487 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)F")
   @ObfuscatedName("ap")
   static final float method6697(float var0, float var1, float var2, float var3) {
      return var2 * var1 + var3 * var0;
   }

   class264() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ae")
   static final int method6695(int var0, int var1, int var2, int var3) {
      return var2 * var0 + var3 * var1 >> 16;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)F")
   @ObfuscatedName("aj")
   static final float method6698(float var0, float var1, float var2, float var3) {
      return var2 * var1 + var3 * var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)F")
   @ObfuscatedName("ak")
   static final float method6699(float var0, float var1, float var2, float var3) {
      return var2 * var1 + var3 * var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFF)F")
   @ObfuscatedName("aw")
   static final float method6700(float var0, float var1, float var2, float var3) {
      return var2 * var1 + var3 * var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("au")
   static final float method6701(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 1.0100503F + 150.75377F / var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("an")
   static final int method6696(int var0, int var1, int var2, int var3) {
      return var2 * var0 + var3 * var1 >> 16;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("ay")
   static final float method6702(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 1.0100503F + 150.75377F / var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("az")
   static final float method6703(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 1.0100503F + 150.75377F / var0;
   }

   @ObfuscatedSignature(descriptor = "(CII)Ljava/lang/String;")
   @ObfuscatedName("ai")
   static String method6705(char var0, int var1, int var2) {
      try {
         char[] var3 = new char[var1];

         for (int var4 = 0; var4 < var1; var4++) {
            if (var2 != -1812540193) {
               throw new IllegalStateException();
            }

            var3[var4] = var0;
         }

         return new String(var3);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kw.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lxa;IIIIIII)V")
   @ObfuscatedName("ak")
   static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         int[][][] var9 = var0.tileHeights;
         byte[][][] var10 = var0.tileSettings;
         if (var2 >= 0) {
            if (var8 <= 2108391709) {
               return;
            }

            if (var2 < 4) {
               if (var8 <= 2108391709) {
                  throw new IllegalStateException();
               }

               if (var3 >= 0) {
                  if (var8 <= 2108391709) {
                     return;
                  }

                  if (var3 < var9[0].length - 1) {
                     if (var8 <= 2108391709) {
                        throw new IllegalStateException();
                     }

                     if (var4 >= 0) {
                        if (var8 <= 2108391709) {
                           throw new IllegalStateException();
                        }

                        if (var4 < var9[0][0].length - 1) {
                           if (var8 <= 2108391709) {
                              return;
                           }

                           var10[var2][var3][var4] = 0;

                           while (true) {
                              int var11 = Buffer.method12008(var1, (byte)5);
                              if (0 == var11) {
                                 if (0 == var2) {
                                    if (var8 <= 2108391709) {
                                       throw new IllegalStateException();
                                    }

                                    int[] var19 = var9[0][var3];
                                    int var15 = var5 + 932731;
                                    int var16 = 556238 + var6;
                                    int var17 = class236.method6008(45365 + var15, var16 + 91923, 4, 1998174652)
                                       - 128
                                       + (class236.method6008(var15 + 10294, var16 + 37821, 2, 399894027) - 128 >> 1)
                                       + (class236.method6008(var15, var16, 1, 1788526346) - 128 >> 2);
                                    var17 = (int)(var17 * 0.3) + 35;
                                    if (var17 < 10) {
                                       if (var8 <= 2108391709) {
                                          throw new IllegalStateException();
                                       }

                                       var17 = 10;
                                    } else if (var17 > 60) {
                                       if (var8 <= 2108391709) {
                                          return;
                                       }

                                       var17 = 60;
                                    }

                                    var19[var4] = -var17 * 8;
                                 } else {
                                    var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - 240;
                                 }

                                 return;
                              }

                              if (1 == var11) {
                                 int var12 = var1.readUnsignedByte(1464289238);
                                 if (1 == var12) {
                                    if (var8 <= 2108391709) {
                                       throw new IllegalStateException();
                                    }

                                    var12 = 0;
                                 }

                                 if (0 == var2) {
                                    if (var8 <= 2108391709) {
                                       throw new IllegalStateException();
                                    }

                                    var9[0][var3][var4] = 8 * -var12;
                                 } else {
                                    var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - var12 * 8;
                                 }

                                 return;
                              }

                              if (var11 <= 49) {
                                 if (var8 <= 2108391709) {
                                    throw new IllegalStateException();
                                 }

                                 class623.Tiles_overlays[var2][var3][var4] = (short)var1.readShort((byte)-5);
                                 class200.Tiles_shapes[var2][var3][var4] = (byte)((var11 - 2) / 4);
                                 HttpRequest.field83[var2][var3][var4] = (byte)(var11 - 2 + var7 & 3);
                              } else if (var11 <= 81) {
                                 if (var8 <= 2108391709) {
                                    return;
                                 }

                                 var10[var2][var3][var4] = (byte)(var11 - 49);
                              } else {
                                 class33.Tiles_underlays[var2][var3][var4] = (short)(var11 - 81);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         class148.method4142(var1, (byte)121);
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "kw.ak(" + ')');
      }
   }
}
