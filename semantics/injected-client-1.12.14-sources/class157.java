import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gu")
public class class157 extends classGK {
   @ObfuscatedName("ag")
   int field2097;
   @ObfuscatedName("at")
   byte field2096;
   @ObfuscatedName("av")
   int field2095;
   @ObfuscatedName("an")
   String field2099;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field2098 = 81;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod188(Buffer var1) {
      this.field2095 = Buffer.method12008(var1, (byte)5) * 1994674213;
      this.field2096 = Buffer.method12001(var1, (byte)50);
      this.field2097 = Buffer.method12008(var1, (byte)5) * -339230303;
      Buffer.method12018(var1, -2143866838);
      this.field2099 = var1.readStringCp1252NullCircumfixed(839723709);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;I)V")
   @ObfuscatedName("av")
   public static void method4368(AbstractArchive var0, int var1) {
      try {
         StructComposition.StructDefinition_archive = var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gu.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod191(ClanChannel var1, byte var2) {
      try {
         ClanChannelMember var3 = (ClanChannelMember)var1.members.get(this.field2095 * -455128147);
         var3.rank = this.field2096;
         var3.world = -282953565 * this.field2097;
         var3.username = new Username(this.field2099);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gu.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod190(Buffer var1) {
      this.field2095 = Buffer.method12008(var1, (byte)5) * -2031766195;
      this.field2096 = Buffer.method12001(var1, (byte)90);
      this.field2097 = Buffer.method12008(var1, (byte)5) * -1230774181;
      Buffer.method12018(var1, -2033024422);
      this.field2099 = var1.readStringCp1252NullCircumfixed(-2015887229);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod189(Buffer var1, byte var2) {
      try {
         this.field2095 = Buffer.method12008(var1, (byte)5) * 1994674213;
         this.field2096 = Buffer.method12001(var1, (byte)96);
         this.field2097 = Buffer.method12008(var1, (byte)5) * -339230303;
         Buffer.method12018(var1, -2075810817);
         this.field2099 = var1.readStringCp1252NullCircumfixed(719550235);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gu.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod187(Buffer var1) {
      this.field2095 = Buffer.method12008(var1, (byte)5) * 1443766865;
      this.field2096 = Buffer.method12001(var1, (byte)5);
      this.field2097 = Buffer.method12008(var1, (byte)5) * -339230303;
      Buffer.method12018(var1, -2141626114);
      this.field2099 = var1.readStringCp1252NullCircumfixed(622520249);
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("ak")
   @Override
   void vmethod192(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field2095 * 1240298575);
      var2.rank = this.field2096;
      var2.world = 1773453026 * this.field2097;
      var2.username = new Username(this.field2099);
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod193(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field2095 * -455128147);
      var2.rank = this.field2096;
      var2.world = -282953565 * this.field2097;
      var2.username = new Username(this.field2099);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("la")
   static final void updateItemPile(int var0, int var1, int var2, int var3) {
      try {
         class348.updateItemPile2(AsyncHttpResponse.worldView, var0, var1, var2, -1783897780);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gu.la(" + ')');
      }
   }

   class157(classGT var1) {
      this.this$0 = var1;
      this.field2095 = -1994674213;
   }

   @ObfuscatedSignature(descriptor = "([FIFZFZ[FI)I")
   @ObfuscatedName("av")
   public static int method4367(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6, int var7) {
      try {
         float var8 = 0.0F;

         for (int var9 = 0; var9 < 1 + var1; var9++) {
            if (var7 != -1793120611) {
               throw new IllegalStateException();
            }

            var8 += Math.abs(var0[var9]);
         }

         float var43 = (Math.abs(var2) + Math.abs(var4)) * (1 + var1) * classFH.field1780;
         if (var8 <= var43) {
            if (var7 != -1793120611) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            float[] var10 = new float[1 + var1];

            for (int var11 = 0; var11 < var1 + 1; var11++) {
               if (var7 != -1793120611) {
                  throw new IllegalStateException();
               }

               var10[var11] = var0[var11] * (1.0F / var8);
            }

            while (Math.abs(var10[var1]) < var43) {
               if (var7 != -1793120611) {
                  throw new IllegalStateException();
               }

               var1--;
            }

            int var44 = 0;
            if (var1 == 0) {
               if (var7 != -1793120611) {
                  throw new IllegalStateException();
               } else {
                  return var44;
               }
            } else if (1 == var1) {
               var6[0] = -var10[0] / var10[1];
               boolean var54;
               if (var3) {
                  if (var7 != -1793120611) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var43 + var6[0]) {
                     if (var7 != -1793120611) {
                        throw new IllegalStateException();
                     }

                     var54 = 1;
                  } else {
                     var54 = 0;
                  }
               } else if (var2 < var6[0] - var43) {
                  if (var7 != -1793120611) {
                     throw new IllegalStateException();
                  }

                  var54 = 1;
               } else {
                  var54 = 0;
               }

               boolean var46 = (boolean)var54;
               if (var5) {
                  var54 = var4 > var6[0] - var43;
               } else if (var4 > var6[0] + var43) {
                  if (var7 != -1793120611) {
                     throw new IllegalStateException();
                  }

                  var54 = (boolean)1;
               } else {
                  var54 = (boolean)0;
               }

               label375: {
                  boolean var47 = var54;
                  if (var46) {
                     if (var7 != -1793120611) {
                        throw new IllegalStateException();
                     }

                     if (var47) {
                        if (var7 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        var54 = 1;
                        break label375;
                     }
                  }

                  var54 = 0;
               }

               byte var45 = var54;
               if (var45 > 0) {
                  if (var7 != -1793120611) {
                     throw new IllegalStateException();
                  }

                  if (var3) {
                     if (var7 != -1793120611) {
                        throw new IllegalStateException();
                     }

                     if (var6[0] < var2) {
                        if (var7 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        var6[0] = var2;
                        return var45;
                     }
                  }

                  if (var5) {
                     if (var7 != -1793120611) {
                        throw new IllegalStateException();
                     }

                     if (var6[0] > var4) {
                        if (var7 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        var6[0] = var4;
                     }
                  }
               }

               return var45;
            } else {
               classRW var12 = new classRW(var10, var1);
               float[] var13 = new float[var1 + 1];

               for (int var14 = 1; var14 <= var1; var14++) {
                  if (var7 != -1793120611) {
                     throw new IllegalStateException();
                  }

                  var13[var14 - 1] = var10[var14] * var14;
               }

               float[] var48 = new float[var1 + 1];
               int var15 = method4367(var13, var1 - 1, var2, false, var4, false, var48, -1793120611);
               if (var15 == -1) {
                  if (var7 != -1793120611) {
                     throw new IllegalStateException();
                  } else {
                     return 0;
                  }
               } else {
                  boolean var16 = false;
                  float var18 = 0.0F;
                  float var19 = 0.0F;
                  float var20 = 0.0F;

                  for (int var21 = 0; var21 <= var15; var21++) {
                     if (var7 != -1793120611) {
                        throw new IllegalStateException();
                     }

                     if (var44 > var1) {
                        if (var7 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        return var44;
                     }

                     float var17;
                     if (var21 == 0) {
                        if (var7 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        var17 = var2;
                        var19 = ArchiveDiskActionHandler.method8885(var10, var1, var2, (byte)-63);
                        if (Math.abs(var19) <= var43) {
                           if (var7 != -1793120611) {
                              throw new IllegalStateException();
                           }

                           if (var3) {
                              if (var7 != -1793120611) {
                                 throw new IllegalStateException();
                              }

                              var6[var44++] = var2;
                           }
                        }
                     } else {
                        var17 = var20;
                        var19 = var18;
                     }

                     if (var21 == var15) {
                        var20 = var4;
                        var16 = false;
                     } else {
                        var20 = var48[var21];
                     }

                     var18 = ArchiveDiskActionHandler.method8885(var10, var1, var20, (byte)-79);
                     if (var16) {
                        if (var7 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        var16 = false;
                     } else if (Math.abs(var18) < var43) {
                        if (var7 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        if (var21 == var15) {
                           if (var7 != -1793120611) {
                              throw new IllegalStateException();
                           }

                           if (!var5) {
                              continue;
                           }
                        }

                        var6[var44++] = var20;
                        var16 = true;
                     } else {
                        label481: {
                           if (var19 < 0.0F) {
                              if (var7 != -1793120611) {
                                 throw new IllegalStateException();
                              }

                              if (var18 > 0.0F) {
                                 break label481;
                              }

                              if (var7 != -1793120611) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (!(var19 > 0.0F)) {
                              continue;
                           }

                           if (var7 != -1793120611) {
                              throw new IllegalStateException();
                           }

                           if (!(var18 < 0.0F)) {
                              continue;
                           }

                           if (var7 != -1793120611) {
                              throw new IllegalStateException();
                           }
                        }

                        int var23 = var44++;
                        float var25 = var17;
                        float var26 = var20;
                        float var27 = ArchiveDiskActionHandler.method8885(var12.field5708, var12.field5709 * 1718555529, var17, (byte)-84);
                        float var24;
                        if (Math.abs(var27) < classFH.field1780) {
                           if (var7 != -1793120611) {
                              throw new IllegalStateException();
                           }

                           var24 = var17;
                        } else {
                           float var28 = ArchiveDiskActionHandler.method8885(var12.field5708, 1718555529 * var12.field5709, var20, (byte)-78);
                           if (Math.abs(var28) < classFH.field1780) {
                              if (var7 != -1793120611) {
                                 throw new IllegalStateException();
                              }

                              var24 = var20;
                           } else {
                              float var29 = 0.0F;
                              float var30 = 0.0F;
                              float var31 = 0.0F;
                              float var36 = 0.0F;
                              boolean var37 = true;
                              boolean var38 = false;

                              do {
                                 var38 = false;
                                 if (var37) {
                                    var29 = var25;
                                    var36 = var27;
                                    var30 = var26 - var25;
                                    var31 = var30;
                                    var37 = false;
                                 }

                                 if (Math.abs(var36) < Math.abs(var28)) {
                                    if (var7 != -1793120611) {
                                       throw new IllegalStateException();
                                    }

                                    var25 = var26;
                                    var26 = var29;
                                    var29 = var25;
                                    var27 = var28;
                                    var28 = var36;
                                    var36 = var27;
                                 }

                                 float var39;
                                 float var40;
                                 boolean var53;
                                 label415: {
                                    var39 = classFH.field1781 * Math.abs(var26) + 0.0F;
                                    var40 = (var29 - var26) * 0.5F;
                                    if (Math.abs(var40) > var39) {
                                       if (var7 != -1793120611) {
                                          throw new IllegalStateException();
                                       }

                                       if (0.0F != var28) {
                                          if (var7 != -1793120611) {
                                             throw new IllegalStateException();
                                          }

                                          var53 = true;
                                          break label415;
                                       }
                                    }

                                    var53 = false;
                                 }

                                 boolean var41 = var53;
                                 if (var41) {
                                    if (var7 != -1793120611) {
                                       throw new IllegalStateException();
                                    }

                                    label406: {
                                       if (!(Math.abs(var31) < var39)) {
                                          if (var7 != -1793120611) {
                                             throw new IllegalStateException();
                                          }

                                          if (!(Math.abs(var27) <= Math.abs(var28))) {
                                             float var35 = var28 / var27;
                                             float var32;
                                             float var33;
                                             if (var29 == var25) {
                                                if (var7 != -1793120611) {
                                                   throw new IllegalStateException();
                                                }

                                                var32 = var35 * (var40 * 2.0F);
                                                var33 = 1.0F - var35;
                                             } else {
                                                var33 = var27 / var36;
                                                float var34 = var28 / var36;
                                                var32 = var35 * (var33 * (2.0F * var40) * (var33 - var34) - (var34 - 1.0F) * (var26 - var25));
                                                var33 = (var34 - 1.0F) * (var33 - 1.0F) * (var35 - 1.0F);
                                             }

                                             if (var32 > 0.0) {
                                                if (var7 != -1793120611) {
                                                   throw new IllegalStateException();
                                                }

                                                var33 = -var33;
                                             } else {
                                                var32 = -var32;
                                             }

                                             var35 = var31;
                                             var31 = var30;
                                             if (2.0F * var32 < 3.0F * var40 * var33 - Math.abs(var39 * var33)) {
                                                if (var7 != -1793120611) {
                                                   throw new IllegalStateException();
                                                }

                                                if (var32 < Math.abs(var35 * 0.5F * var33)) {
                                                   if (var7 != -1793120611) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var30 = var32 / var33;
                                                   break label406;
                                                }
                                             }

                                             var30 = var40;
                                             var31 = var40;
                                             break label406;
                                          }

                                          if (var7 != -1793120611) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       var30 = var40;
                                       var31 = var40;
                                    }

                                    var25 = var26;
                                    var27 = var28;
                                    if (Math.abs(var30) > var39) {
                                       if (var7 != -1793120611) {
                                          throw new IllegalStateException();
                                       }

                                       var26 += var30;
                                    } else if (var40 > 0.0) {
                                       var26 += var39;
                                    } else {
                                       var26 -= var39;
                                    }

                                    var28 = ArchiveDiskActionHandler.method8885(var12.field5708, 1718555529 * var12.field5709, var26, (byte)-71);
                                    if (var28 * (var36 / Math.abs(var36)) > 0.0) {
                                       if (var7 != -1793120611) {
                                          throw new IllegalStateException();
                                       }

                                       var37 = true;
                                       var38 = true;
                                    } else {
                                       var38 = true;
                                    }
                                 }
                              } while (var38);

                              if (var7 != -1793120611) {
                                 throw new IllegalStateException();
                              }

                              var24 = var26;
                           }
                        }

                        var6[var23] = var24;
                        if (var44 > 1) {
                           if (var7 != -1793120611) {
                              throw new IllegalStateException();
                           }

                           if (var6[var44 - 2] >= var6[var44 - 1] - var43) {
                              var6[var44 - 2] = (var6[var44 - 2] + var6[var44 - 1]) * 0.5F;
                              var44--;
                           }
                        }
                     }
                  }

                  return var44;
               }
            }
         }
      } catch (RuntimeException var42) {
         throw RestClientThreadFactory.newRunException(var42, "gu.av(" + 41);
      }
   }
}
