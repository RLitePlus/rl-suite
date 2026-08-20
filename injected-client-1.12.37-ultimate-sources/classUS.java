import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("us")
public final class classUS {
   @ObfuscatedSignature(descriptor = "Laac;")
   @ObfuscatedName("af")
   classAAC field6376 = null;
   @ObfuscatedName("ag")
   int field6377;
   @ObfuscatedSignature(descriptor = "Laac;")
   @ObfuscatedName("ae")
   classAAC field6379 = null;
   @ObfuscatedName("ab")
   int field6378;
   @ObfuscatedName("az")
   static byte[] field6375 = new byte[520];
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field6380 = 61;

   @ObfuscatedSignature(descriptor = "(I[BIZ)Z")
   @ObfuscatedName("ao")
   boolean method11536(int var1, byte[] var2, int var3, boolean var4) {
      synchronized (this.field6376) {
         boolean var20;
         try {
            int var6;
            if (var4) {
               if (this.field6379.method139(189055573) < 6 + 6 * var1) {
                  return false;
               }

               this.field6379.method138(6 * var1);
               classAAC.method147(this.field6379, field6375, 0, 6, (byte)8);
               var6 = ((field6375[3] & 255) << 16) + ((field6375[4] & 255) << 8) + (field6375[5] & 255);
               if (var6 <= 0 || var6 > this.field6376.method139(608939529) / 520L) {
                  return false;
               }
            } else {
               this.field6376.method160(1305737107);
               var6 = (int)((this.field6376.method141(1954360519).length() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            int var7 = 0;
            int var8 = 0;

            for (int var9 = var6; var7 < var3; var8++) {
               int var10 = 0;
               if (var4) {
                  this.field6376.method138(520L * var9);
                  int var11;
                  int var12;
                  int var13;
                  if (var1 > 65535) {
                     classAAC.method147(this.field6376, field6375, 0, 10, (byte)-28);
                     var11 = (field6375[3] & 255) + ((field6375[0] & 255) << 24) + ((field6375[1] & 255) << 16) + ((field6375[2] & 255) << 8);
                     var12 = (field6375[5] & 255) + ((field6375[4] & 255) << 8);
                     var10 = ((field6375[6] & 255) << 16) + ((field6375[7] & 255) << 8) + (field6375[8] & 255);
                     var13 = field6375[9] & 255;
                  } else {
                     classAAC.method147(this.field6376, field6375, 0, 8, (byte)-18);
                     var11 = (field6375[1] & 255) + ((field6375[0] & 255) << 8);
                     var12 = (field6375[3] & 255) + ((field6375[2] & 255) << 8);
                     var10 = (field6375[6] & 255) + ((field6375[4] & 255) << 16) + ((field6375[5] & 255) << 8);
                     var13 = field6375[7] & 255;
                  }

                  if (var1 != var11 || var8 != var12 || -516579491 * this.field6378 != var13) {
                     return false;
                  }

                  if (var10 < 0 || var10 > this.field6376.method139(1405582704) / 520L) {
                     return false;
                  }
               }

               if (var10 == 0) {
                  var4 = false;
                  this.field6376.method160(1521991074);
                  var10 = (int)((this.field6376.method141(-1406764211).length() + 519L) / 520L);
                  if (0 == var10) {
                     var10++;
                  }

                  if (var9 == var10) {
                     var10++;
                  }
               }

               if (var1 > 65535) {
                  if (var3 - var7 <= 510) {
                     var10 = 0;
                  }

                  field6375[0] = (byte)(var1 >> 24);
                  field6375[1] = (byte)(var1 >> 16);
                  field6375[2] = (byte)(var1 >> 8);
                  field6375[3] = (byte)var1;
                  field6375[4] = (byte)(var8 >> 8);
                  field6375[5] = (byte)var8;
                  field6375[6] = (byte)(var10 >> 16);
                  field6375[7] = (byte)(var10 >> 8);
                  field6375[8] = (byte)var10;
                  field6375[9] = (byte)(-516579491 * this.field6378);
                  this.field6376.method138(var9 * 520L);
                  this.field6376.method153(field6375, 0, 10, -1041412311);
                  int var17 = var3 - var7;
                  if (var17 > 510) {
                     var17 = 510;
                  }

                  this.field6376.method153(var2, var7, var17, 1175702454);
                  var7 += var17;
               } else {
                  if (var3 - var7 <= 512) {
                     var10 = 0;
                  }

                  field6375[0] = (byte)(var1 >> 8);
                  field6375[1] = (byte)var1;
                  field6375[2] = (byte)(var8 >> 8);
                  field6375[3] = (byte)var8;
                  field6375[4] = (byte)(var10 >> 16);
                  field6375[5] = (byte)(var10 >> 8);
                  field6375[6] = (byte)var10;
                  field6375[7] = (byte)(-516579491 * this.field6378);
                  this.field6376.method138(var9 * 520L);
                  this.field6376.method153(field6375, 0, 8, 626037593);
                  int var18 = var3 - var7;
                  if (var18 > 512) {
                     var18 = 512;
                  }

                  this.field6376.method153(var2, var7, var18, -1968977421);
                  var7 += var18;
               }

               var9 = var10;
            }

            field6375[0] = (byte)(var3 >> 16);
            field6375[1] = (byte)(var3 >> 8);
            field6375[2] = (byte)var3;
            field6375[3] = (byte)(var6 >> 16);
            field6375[4] = (byte)(var6 >> 8);
            field6375[5] = (byte)var6;
            this.field6379.method138(6 * var1);
            this.field6379.method153(field6375, 0, 6, -1362260381);
            var20 = true;
         } catch (IOException var15) {
            return false;
         }

         return var20;
      }
   }

   @ObfuscatedSignature(descriptor = "(I[BIZI)Z")
   @ObfuscatedName("ae")
   boolean method11537(int var1, byte[] var2, int var3, boolean var4, int var5) {
      try {
         synchronized (this.field6376) {
            boolean var23;
            try {
               int var7;
               label152:
               if (var4) {
                  if (this.field6379.method139(2116365316) < 6 + 6 * var1) {
                     if (var5 <= -165063710) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  this.field6379.method138(6 * var1);
                  classAAC.method147(this.field6379, field6375, 0, 6, (byte)23);
                  var7 = ((field6375[3] & 255) << 16) + ((field6375[4] & 255) << 8) + (field6375[5] & 255);
                  if (var7 > 0) {
                     if (var7 <= this.field6376.method139(-332620610) / 520L) {
                        break label152;
                     }

                     if (var5 <= -165063710) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               } else {
                  this.field6376.method160(572594115);
                  var7 = (int)((this.field6376.method141(1274287360).length() + 519L) / 520L);
                  if (var7 == 0) {
                     if (var5 <= -165063710) {
                        throw new IllegalStateException();
                     }

                     var7 = 1;
                  }
               }

               int var8 = 0;
               int var9 = 0;

               for (int var10 = var7; var8 < var3; var9++) {
                  int var11 = 0;
                  if (var4) {
                     if (var5 <= -165063710) {
                        throw new IllegalStateException();
                     }

                     this.field6376.method138(520L * var10);
                     int var12;
                     int var13;
                     int var14;
                     if (var1 > 65535) {
                        classAAC.method147(this.field6376, field6375, 0, 10, (byte)64);
                        var12 = (field6375[3] & 255) + ((field6375[0] & 255) << 24) + ((field6375[1] & 255) << 16) + ((field6375[2] & 255) << 8);
                        var13 = (field6375[5] & 255) + ((field6375[4] & 255) << 8);
                        var11 = ((field6375[6] & 255) << 16) + ((field6375[7] & 255) << 8) + (field6375[8] & 255);
                        var14 = field6375[9] & 255;
                     } else {
                        classAAC.method147(this.field6376, field6375, 0, 8, (byte)-25);
                        var12 = (field6375[1] & 255) + ((field6375[0] & 255) << 8);
                        var13 = (field6375[3] & 255) + ((field6375[2] & 255) << 8);
                        var11 = (field6375[6] & 255) + ((field6375[4] & 255) << 16) + ((field6375[5] & 255) << 8);
                        var14 = field6375[7] & 255;
                     }

                     if (var1 != var12) {
                        return false;
                     }

                     if (var5 <= -165063710) {
                        throw new IllegalStateException();
                     }

                     if (var9 != var13) {
                        return false;
                     }

                     if (var5 <= -165063710) {
                        throw new IllegalStateException();
                     }

                     if (-516579491 * this.field6378 != var14) {
                        if (var5 <= -165063710) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     if (var11 < 0) {
                        return false;
                     }

                     if (var11 > this.field6376.method139(-556428687) / 520L) {
                        if (var5 <= -165063710) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }
                  }

                  if (var11 == 0) {
                     if (var5 <= -165063710) {
                        throw new IllegalStateException();
                     }

                     var4 = false;
                     this.field6376.method160(1495830330);
                     var11 = (int)((this.field6376.method141(-1972384051).length() + 519L) / 520L);
                     if (0 == var11) {
                        if (var5 <= -165063710) {
                           throw new IllegalStateException();
                        }

                        var11++;
                     }

                     if (var10 == var11) {
                        if (var5 <= -165063710) {
                           throw new IllegalStateException();
                        }

                        var11++;
                     }
                  }

                  if (var1 > 65535) {
                     if (var5 <= -165063710) {
                        throw new IllegalStateException();
                     }

                     if (var3 - var8 <= 510) {
                        var11 = 0;
                     }

                     field6375[0] = (byte)(var1 >> 24);
                     field6375[1] = (byte)(var1 >> 16);
                     field6375[2] = (byte)(var1 >> 8);
                     field6375[3] = (byte)var1;
                     field6375[4] = (byte)(var9 >> 8);
                     field6375[5] = (byte)var9;
                     field6375[6] = (byte)(var11 >> 16);
                     field6375[7] = (byte)(var11 >> 8);
                     field6375[8] = (byte)var11;
                     field6375[9] = (byte)(-516579491 * this.field6378);
                     this.field6376.method138(var10 * 520L);
                     this.field6376.method153(field6375, 0, 10, -1799094639);
                     int var19 = var3 - var8;
                     if (var19 > 510) {
                        if (var5 <= -165063710) {
                           throw new IllegalStateException();
                        }

                        var19 = 510;
                     }

                     this.field6376.method153(var2, var8, var19, 722555417);
                     var8 += var19;
                  } else {
                     if (var3 - var8 <= 512) {
                        if (var5 <= -165063710) {
                           throw new IllegalStateException();
                        }

                        var11 = 0;
                     }

                     field6375[0] = (byte)(var1 >> 8);
                     field6375[1] = (byte)var1;
                     field6375[2] = (byte)(var9 >> 8);
                     field6375[3] = (byte)var9;
                     field6375[4] = (byte)(var11 >> 16);
                     field6375[5] = (byte)(var11 >> 8);
                     field6375[6] = (byte)var11;
                     field6375[7] = (byte)(-516579491 * this.field6378);
                     this.field6376.method138(var10 * 520L);
                     this.field6376.method153(field6375, 0, 8, -2135176595);
                     int var20 = var3 - var8;
                     if (var20 > 512) {
                        if (var5 <= -165063710) {
                           throw new IllegalStateException();
                        }

                        var20 = 512;
                     }

                     this.field6376.method153(var2, var8, var20, 1292449566);
                     var8 += var20;
                  }

                  var10 = var11;
               }

               field6375[0] = (byte)(var3 >> 16);
               field6375[1] = (byte)(var3 >> 8);
               field6375[2] = (byte)var3;
               field6375[3] = (byte)(var7 >> 16);
               field6375[4] = (byte)(var7 >> 8);
               field6375[5] = (byte)var7;
               this.field6379.method138(6 * var1);
               this.field6379.method153(field6375, 0, 6, 1526480910);
               var23 = true;
            } catch (IOException var16) {
               return false;
            }

            return var23;
         }
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "us.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("az")
   public byte[] method11527(int var1, int var2) {
      try {
         synchronized (this.field6376) {
            try {
               if (this.field6379.method139(2054595008) >= var1 * 6 + 6) {
                  this.field6379.method138(6 * var1);
                  classAAC.method147(this.field6379, field6375, 0, 6, (byte)-16);
                  int var4 = (field6375[2] & 255) + ((field6375[0] & 255) << 16) + ((field6375[1] & 255) << 8);
                  int var5 = (field6375[5] & 255) + ((field6375[4] & 255) << 8) + ((field6375[3] & 255) << 16);
                  if (var4 >= 0) {
                     if (var2 != -1142684788) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= this.field6377 * -472857467) {
                        if (var5 > 0) {
                           if (var2 != -1142684788) {
                              throw new IllegalStateException();
                           }

                           if (var5 <= this.field6376.method139(995909726) / 520L) {
                              byte[] var6 = new byte[var4];
                              int var7 = 0;
                              int var8 = 0;

                              while (var7 < var4) {
                                 if (var2 != -1142684788) {
                                    throw new IllegalStateException();
                                 }

                                 if (var5 == 0) {
                                    return null;
                                 }

                                 this.field6376.method138(var5 * 520L);
                                 int var9 = var4 - var7;
                                 int var10;
                                 int var11;
                                 int var12;
                                 int var13;
                                 byte var14;
                                 if (var1 > 65535) {
                                    if (var9 > 510) {
                                       if (var2 != -1142684788) {
                                          throw new IllegalStateException();
                                       }

                                       var9 = 510;
                                    }

                                    var14 = 10;
                                    classAAC.method147(this.field6376, field6375, 0, var9 + var14, (byte)-24);
                                    var10 = (field6375[3] & 255) + ((field6375[0] & 255) << 24) + ((field6375[1] & 255) << 16) + ((field6375[2] & 255) << 8);
                                    var11 = (field6375[5] & 255) + ((field6375[4] & 255) << 8);
                                    var12 = ((field6375[6] & 255) << 16) + ((field6375[7] & 255) << 8) + (field6375[8] & 255);
                                    var13 = field6375[9] & 255;
                                 } else {
                                    if (var9 > 512) {
                                       if (var2 != -1142684788) {
                                          throw new IllegalStateException();
                                       }

                                       var9 = 512;
                                    }

                                    var14 = 8;
                                    classAAC.method147(this.field6376, field6375, 0, var14 + var9, (byte)-36);
                                    var10 = ((field6375[0] & 255) << 8) + (field6375[1] & 255);
                                    var11 = (field6375[3] & 255) + ((field6375[2] & 255) << 8);
                                    var12 = ((field6375[4] & 255) << 16) + ((field6375[5] & 255) << 8) + (field6375[6] & 255);
                                    var13 = field6375[7] & 255;
                                 }

                                 if (var10 == var1 && var8 == var11) {
                                    if (var2 != -1142684788) {
                                       throw new IllegalStateException();
                                    }

                                    if (var13 == -516579491 * this.field6378) {
                                       if (var12 >= 0) {
                                          if (var2 != -1142684788) {
                                             throw new IllegalStateException();
                                          }

                                          if (var12 <= this.field6376.method139(138785714) / 520L) {
                                             int var15 = var14 + var9;

                                             for (int var16 = var14; var16 < var15; var16++) {
                                                if (var2 != -1142684788) {
                                                   throw new IllegalStateException();
                                                }

                                                var6[var7++] = field6375[var16];
                                             }

                                             var5 = var12;
                                             var8++;
                                             continue;
                                          }

                                          if (var2 != -1142684788) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       return null;
                                    }

                                    if (var2 != -1142684788) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 return null;
                              }

                              return var6;
                           }

                           if (var2 != -1142684788) {
                              throw new IllegalStateException();
                           }
                        }

                        return null;
                     }

                     if (var2 != -1142684788) {
                        throw new IllegalStateException();
                     }
                  }

                  return null;
               } else if (var2 != -1142684788) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } catch (IOException var18) {
               return null;
            }
         }
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "us.az(" + ')');
      }
   }

   @Override
   public String toString() {
      try {
         return "" + this.field6378 * -516579491;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "us.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("ab")
   public byte[] method11528(int var1) {
      synchronized (this.field6376) {
         byte[] var21;
         try {
            if (this.field6379.method139(551953958) < var1 * 6 + 6) {
               return null;
            }

            this.field6379.method138(6 * var1);
            classAAC.method147(this.field6379, field6375, 0, 6, (byte)-53);
            int var3 = (field6375[2] & 255) + ((field6375[0] & 255) << 16) + ((field6375[1] & 255) << 8);
            int var4 = (field6375[5] & 255) + ((field6375[4] & 255) << 8) + ((field6375[3] & 255) << 16);
            if (var3 < 0 || var3 > this.field6377 * -472857467) {
               return null;
            }

            if (var4 <= 0 || var4 > this.field6376.method139(-971196014) / 520L) {
               return null;
            }

            byte[] var5 = new byte[var3];
            int var6 = 0;
            int var7 = 0;

            while (var6 < var3) {
               if (var4 == 0) {
                  return null;
               }

               this.field6376.method138(var4 * 520L);
               int var8 = var3 - var6;
               int var9;
               int var10;
               int var11;
               int var12;
               byte var13;
               if (var1 > 65535) {
                  if (var8 > 510) {
                     var8 = 510;
                  }

                  var13 = 10;
                  classAAC.method147(this.field6376, field6375, 0, var8 + var13, (byte)-10);
                  var9 = (field6375[3] & 255) + ((field6375[0] & 255) << 24) + ((field6375[1] & 255) << 16) + ((field6375[2] & 255) << 8);
                  var10 = (field6375[5] & 255) + ((field6375[4] & 255) << 8);
                  var11 = ((field6375[6] & 255) << 16) + ((field6375[7] & 255) << 8) + (field6375[8] & 255);
                  var12 = field6375[9] & 255;
               } else {
                  if (var8 > 512) {
                     var8 = 512;
                  }

                  var13 = 8;
                  classAAC.method147(this.field6376, field6375, 0, var13 + var8, (byte)-21);
                  var9 = ((field6375[0] & 255) << 8) + (field6375[1] & 255);
                  var10 = (field6375[3] & 255) + ((field6375[2] & 255) << 8);
                  var11 = ((field6375[4] & 255) << 16) + ((field6375[5] & 255) << 8) + (field6375[6] & 255);
                  var12 = field6375[7] & 255;
               }

               if (var9 == var1 && var7 == var10 && var12 == -516579491 * this.field6378) {
                  if (var11 >= 0 && var11 <= this.field6376.method139(1441407175) / 520L) {
                     int var14 = var13 + var8;

                     for (int var15 = var13; var15 < var14; var15++) {
                        var5[var6++] = field6375[var15];
                     }

                     var4 = var11;
                     var7++;
                     continue;
                  }

                  return null;
               }

               return null;
            }

            var21 = var5;
         } catch (IOException var17) {
            return null;
         }

         return var21;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lus;I[BII)Z")
   @ObfuscatedName("lc")
   public static boolean method11531(classUS var0, int var1, byte[] var2, int var3, int var4) {
      if (var0 == null) {
         var0.method11535(var1, var2, var1, var1);
      }

      try {
         synchronized (var0.field6376) {
            if (var3 >= 0) {
               if (var3 <= var0.field6377 * -472857467) {
                  boolean var6 = var0.method11537(var1, var2, var3, true, 11147277);
                  if (!var6) {
                     if (var4 <= -1885758891) {
                        throw new IllegalStateException();
                     }

                     var6 = var0.method11537(var1, var2, var3, false, 128907718);
                  }

                  return var6;
               }

               if (var4 <= -1885758891) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException("" + var0.field6378 * -516579491 + ',' + var1 + ',' + var3);
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "us.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lus;)Ljava/lang/String;")
   @ObfuscatedName("fn")
   public static String method11541(classUS var0) {
      if (var0 == null) {
         var0.method11544();
      }

      return "" + var0.field6378 * -516579491;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;)Z")
   @ObfuscatedName("dp")
   public static boolean method11546(classCM var0) {
      return var0 == null ? var0.method2495() : (classXE.field6840.vmethod8((byte)1) & var0.field1163 * -458552905) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loi;)I")
   @ObfuscatedName("tn")
   public static int method11540(classOI var0) {
      return var0.field4885 * 594099331;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lus;I[BIZ)Z")
   @ObfuscatedName("cj")
   public static boolean method11538(classUS var0, int var1, byte[] var2, int var3, boolean var4) {
      synchronized (var0.field6376) {
         boolean var20;
         try {
            int var6;
            if (var4) {
               if (var0.field6379.method139(1040909057) < 6 + 6 * var1) {
                  return false;
               }

               var0.field6379.method138(6 * var1);
               classAAC.method147(var0.field6379, field6375, 0, 6, (byte)36);
               var6 = ((field6375[3] & 255) << 16) + ((field6375[4] & -1795210951) << 8) + (field6375[5] & 1697042908);
               if (var6 <= 0 || var6 > var0.field6376.method139(-470900045) / 520L) {
                  return false;
               }
            } else {
               var0.field6376.method160(371376770);
               var6 = (int)((var0.field6376.method141(-338644278).length() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            int var7 = 0;
            int var8 = 0;

            for (int var9 = var6; var7 < var3; var8++) {
               int var10 = 0;
               if (var4) {
                  var0.field6376.method138(520L * var9);
                  int var11;
                  int var12;
                  int var13;
                  if (var1 > 65535) {
                     classAAC.method147(var0.field6376, field6375, 0, 10, (byte)-54);
                     var11 = (field6375[3] & 255) + ((field6375[0] & 255) << 24) + ((field6375[1] & -750183757) << 16) + ((field6375[2] & 466421412) << 8);
                     var12 = (field6375[5] & -1271690914) + ((field6375[4] & 255) << 8);
                     var10 = ((field6375[6] & -1833309180) << 16) + ((field6375[7] & -987510356) << 8) + (field6375[8] & 255);
                     var13 = field6375[9] & -1549326995;
                  } else {
                     classAAC.method147(var0.field6376, field6375, 0, 8, (byte)71);
                     var11 = (field6375[1] & -1947873202) + ((field6375[0] & 255) << 8);
                     var12 = (field6375[3] & -1594378647) + ((field6375[2] & 255) << 8);
                     var10 = (field6375[6] & 1328014408) + ((field6375[4] & 255) << 16) + ((field6375[5] & 255) << 8);
                     var13 = field6375[7] & 255;
                  }

                  if (var1 != var11 || var8 != var12 || 758645822 * var0.field6378 != var13) {
                     return false;
                  }

                  if (var10 < 0 || var10 > var0.field6376.method139(-928221521) / 520L) {
                     return false;
                  }
               }

               if (var10 == 0) {
                  var4 = false;
                  var0.field6376.method160(1553665709);
                  var10 = (int)((var0.field6376.method141(2015100844).length() + 519L) / 520L);
                  if (0 == var10) {
                     var10++;
                  }

                  if (var9 == var10) {
                     var10++;
                  }
               }

               if (var1 > 69019277) {
                  if (var3 - var7 <= 198811923) {
                     var10 = 0;
                  }

                  field6375[0] = (byte)(var1 >> 24);
                  field6375[1] = (byte)(var1 >> 16);
                  field6375[2] = (byte)(var1 >> 8);
                  field6375[3] = (byte)var1;
                  field6375[4] = (byte)(var8 >> 8);
                  field6375[5] = (byte)var8;
                  field6375[6] = (byte)(var10 >> 16);
                  field6375[7] = (byte)(var10 >> 8);
                  field6375[8] = (byte)var10;
                  field6375[9] = (byte)(-126181015 * var0.field6378);
                  var0.field6376.method138(var9 * 520L);
                  var0.field6376.method153(field6375, 0, 10, -246220574);
                  int var17 = var3 - var7;
                  if (var17 > 510) {
                     var17 = -1683521973;
                  }

                  var0.field6376.method153(var2, var7, var17, -98176016);
                  var7 += var17;
               } else {
                  if (var3 - var7 <= -280106643) {
                     var10 = 0;
                  }

                  field6375[0] = (byte)(var1 >> 8);
                  field6375[1] = (byte)var1;
                  field6375[2] = (byte)(var8 >> 8);
                  field6375[3] = (byte)var8;
                  field6375[4] = (byte)(var10 >> 16);
                  field6375[5] = (byte)(var10 >> 8);
                  field6375[6] = (byte)var10;
                  field6375[7] = (byte)(1767571773 * var0.field6378);
                  var0.field6376.method138(var9 * 520L);
                  var0.field6376.method153(field6375, 0, 8, 230857187);
                  int var18 = var3 - var7;
                  if (var18 > 512) {
                     var18 = 512;
                  }

                  var0.field6376.method153(var2, var7, var18, -1237872419);
                  var7 += var18;
               }

               var9 = var10;
            }

            field6375[0] = (byte)(var3 >> 16);
            field6375[1] = (byte)(var3 >> 8);
            field6375[2] = (byte)var3;
            field6375[3] = (byte)(var6 >> 16);
            field6375[4] = (byte)(var6 >> 8);
            field6375[5] = (byte)var6;
            var0.field6379.method138(6 * var1);
            var0.field6379.method153(field6375, 0, 6, -1217727254);
            var20 = true;
         } catch (IOException var15) {
            return false;
         }

         return var20;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("ag")
   public byte[] method11529(int var1) {
      synchronized (this.field6376) {
         byte[] var21;
         try {
            if (this.field6379.method139(-1914839275) < var1 * 6 + 6) {
               return null;
            }

            this.field6379.method138(6 * var1);
            classAAC.method147(this.field6379, field6375, 0, 6, (byte)-60);
            int var3 = (field6375[2] & 255) + ((field6375[0] & 255) << 16) + ((field6375[1] & 255) << 8);
            int var4 = (field6375[5] & 255) + ((field6375[4] & 255) << 8) + ((field6375[3] & 255) << 16);
            if (var3 < 0 || var3 > this.field6377 * -472857467) {
               return null;
            }

            if (var4 <= 0 || var4 > this.field6376.method139(-832854620) / 520L) {
               return null;
            }

            byte[] var5 = new byte[var3];
            int var6 = 0;
            int var7 = 0;

            while (var6 < var3) {
               if (var4 == 0) {
                  return null;
               }

               this.field6376.method138(var4 * 520L);
               int var8 = var3 - var6;
               int var9;
               int var10;
               int var11;
               int var12;
               byte var13;
               if (var1 > 65535) {
                  if (var8 > 510) {
                     var8 = 510;
                  }

                  var13 = 10;
                  classAAC.method147(this.field6376, field6375, 0, var8 + var13, (byte)38);
                  var9 = (field6375[3] & 255) + ((field6375[0] & 255) << 24) + ((field6375[1] & 255) << 16) + ((field6375[2] & 255) << 8);
                  var10 = (field6375[5] & 255) + ((field6375[4] & 255) << 8);
                  var11 = ((field6375[6] & 255) << 16) + ((field6375[7] & 255) << 8) + (field6375[8] & 255);
                  var12 = field6375[9] & 255;
               } else {
                  if (var8 > 512) {
                     var8 = 512;
                  }

                  var13 = 8;
                  classAAC.method147(this.field6376, field6375, 0, var13 + var8, (byte)-11);
                  var9 = ((field6375[0] & 255) << 8) + (field6375[1] & 255);
                  var10 = (field6375[3] & 255) + ((field6375[2] & 255) << 8);
                  var11 = ((field6375[4] & 255) << 16) + ((field6375[5] & 255) << 8) + (field6375[6] & 255);
                  var12 = field6375[7] & 255;
               }

               if (var9 == var1 && var7 == var10 && var12 == -516579491 * this.field6378) {
                  if (var11 >= 0 && var11 <= this.field6376.method139(-1251052679) / 520L) {
                     int var14 = var13 + var8;

                     for (int var15 = var13; var15 < var14; var15++) {
                        var5[var6++] = field6375[var15];
                     }

                     var4 = var11;
                     var7++;
                     continue;
                  }

                  return null;
               }

               return null;
            }

            var21 = var5;
         } catch (IOException var17) {
            return null;
         }

         return var21;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lus;)Ljava/lang/String;")
   @ObfuscatedName("zf")
   public static String method11542(classUS var0) {
      return var0 == null ? var0.toString() : "" + var0.field6378 * 1754419751;
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("as")
   public byte[] method11530(int var1) {
      synchronized (this.field6376) {
         byte[] var21;
         try {
            if (this.field6379.method139(-1584345221) < var1 * 6 + 6) {
               return null;
            }

            this.field6379.method138(6 * var1);
            classAAC.method147(this.field6379, field6375, 0, 6, (byte)-20);
            int var3 = (field6375[2] & 255) + ((field6375[0] & 255) << 16) + ((field6375[1] & 255) << 8);
            int var4 = (field6375[5] & 255) + ((field6375[4] & 255) << 8) + ((field6375[3] & 255) << 16);
            if (var3 < 0 || var3 > this.field6377 * -472857467) {
               return null;
            }

            if (var4 <= 0 || var4 > this.field6376.method139(2088818206) / 520L) {
               return null;
            }

            byte[] var5 = new byte[var3];
            int var6 = 0;
            int var7 = 0;

            while (var6 < var3) {
               if (var4 == 0) {
                  return null;
               }

               this.field6376.method138(var4 * 520L);
               int var8 = var3 - var6;
               int var9;
               int var10;
               int var11;
               int var12;
               byte var13;
               if (var1 > 65535) {
                  if (var8 > 510) {
                     var8 = 510;
                  }

                  var13 = 10;
                  classAAC.method147(this.field6376, field6375, 0, var8 + var13, (byte)-33);
                  var9 = (field6375[3] & 255) + ((field6375[0] & 255) << 24) + ((field6375[1] & 255) << 16) + ((field6375[2] & 255) << 8);
                  var10 = (field6375[5] & 255) + ((field6375[4] & 255) << 8);
                  var11 = ((field6375[6] & 255) << 16) + ((field6375[7] & 255) << 8) + (field6375[8] & 255);
                  var12 = field6375[9] & 255;
               } else {
                  if (var8 > 512) {
                     var8 = 512;
                  }

                  var13 = 8;
                  classAAC.method147(this.field6376, field6375, 0, var13 + var8, (byte)-53);
                  var9 = ((field6375[0] & 255) << 8) + (field6375[1] & 255);
                  var10 = (field6375[3] & 255) + ((field6375[2] & 255) << 8);
                  var11 = ((field6375[4] & 255) << 16) + ((field6375[5] & 255) << 8) + (field6375[6] & 255);
                  var12 = field6375[7] & 255;
               }

               if (var9 == var1 && var7 == var10 && var12 == -516579491 * this.field6378) {
                  if (var11 >= 0 && var11 <= this.field6376.method139(917667154) / 520L) {
                     int var14 = var13 + var8;

                     for (int var15 = var13; var15 < var14; var15++) {
                        var5[var6++] = field6375[var15];
                     }

                     var4 = var11;
                     var7++;
                     continue;
                  }

                  return null;
               }

               return null;
            }

            var21 = var5;
         } catch (IOException var17) {
            return null;
         }

         return var21;
      }
   }

   @ObfuscatedSignature(descriptor = "(I[BI)Z")
   @ObfuscatedName("ax")
   public boolean method11532(int var1, byte[] var2, int var3) {
      synchronized (this.field6376) {
         if (var3 >= 0 && var3 <= this.field6377 * -472857467) {
            boolean var5 = this.method11537(var1, var2, var3, true, 1216173639);
            if (!var5) {
               var5 = this.method11537(var1, var2, var3, false, 613342726);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.field6378 * -516579491 + ',' + var1 + ',' + var3);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;Z)V")
   @ObfuscatedName("jy")
   public static void method11545(classQC var0, boolean var1) {
      if (var0 == null) {
         var0.getSession();
      }
   }

   @ObfuscatedSignature(descriptor = "(I[BI)Z")
   @ObfuscatedName("ac")
   public boolean method11533(int var1, byte[] var2, int var3) {
      synchronized (this.field6376) {
         if (var3 >= 0 && var3 <= this.field6377 * -472857467) {
            boolean var5 = this.method11537(var1, var2, var3, true, 239261359);
            if (!var5) {
               var5 = this.method11537(var1, var2, var3, false, 824707967);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.field6378 * -559439453 + ',' + var1 + -549835680 + var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[BI)Z")
   @ObfuscatedName("aa")
   public boolean method11534(int var1, byte[] var2, int var3) {
      synchronized (this.field6376) {
         if (var3 >= 0 && var3 <= this.field6377 * -472857467) {
            boolean var5 = this.method11537(var1, var2, var3, true, 1898313989);
            if (!var5) {
               var5 = this.method11537(var1, var2, var3, false, 1201350803);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.field6378 * -516579491 + ',' + var1 + ',' + var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method11543() {
      return "" + this.field6378 * -516579491;
   }

   @ObfuscatedSignature(descriptor = "(I[BIZ)Z")
   @ObfuscatedName("al")
   boolean method11539(int var1, byte[] var2, int var3, boolean var4) {
      synchronized (this.field6376) {
         boolean var20;
         try {
            int var6;
            if (var4) {
               if (this.field6379.method139(-393673495) < 6 + 6 * var1) {
                  return false;
               }

               this.field6379.method138(6 * var1);
               classAAC.method147(this.field6379, field6375, 0, 6, (byte)-72);
               var6 = ((field6375[3] & 255) << 16) + ((field6375[4] & 255) << 8) + (field6375[5] & 255);
               if (var6 <= 0 || var6 > this.field6376.method139(355390931) / 520L) {
                  return false;
               }
            } else {
               this.field6376.method160(1299409782);
               var6 = (int)((this.field6376.method141(149981094).length() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            int var7 = 0;
            int var8 = 0;

            for (int var9 = var6; var7 < var3; var8++) {
               int var10 = 0;
               if (var4) {
                  this.field6376.method138(520L * var9);
                  int var11;
                  int var12;
                  int var13;
                  if (var1 > 65535) {
                     classAAC.method147(this.field6376, field6375, 0, 10, (byte)53);
                     var11 = (field6375[3] & 255) + ((field6375[0] & 255) << 24) + ((field6375[1] & 255) << 16) + ((field6375[2] & 255) << 8);
                     var12 = (field6375[5] & 255) + ((field6375[4] & 255) << 8);
                     var10 = ((field6375[6] & 255) << 16) + ((field6375[7] & 255) << 8) + (field6375[8] & 255);
                     var13 = field6375[9] & 255;
                  } else {
                     classAAC.method147(this.field6376, field6375, 0, 8, (byte)44);
                     var11 = (field6375[1] & 255) + ((field6375[0] & 255) << 8);
                     var12 = (field6375[3] & 255) + ((field6375[2] & 255) << 8);
                     var10 = (field6375[6] & 255) + ((field6375[4] & 255) << 16) + ((field6375[5] & 255) << 8);
                     var13 = field6375[7] & 255;
                  }

                  if (var1 != var11 || var8 != var12 || -516579491 * this.field6378 != var13) {
                     return false;
                  }

                  if (var10 < 0 || var10 > this.field6376.method139(1885472564) / 520L) {
                     return false;
                  }
               }

               if (var10 == 0) {
                  var4 = false;
                  this.field6376.method160(545914072);
                  var10 = (int)((this.field6376.method141(-393345921).length() + 519L) / 520L);
                  if (0 == var10) {
                     var10++;
                  }

                  if (var9 == var10) {
                     var10++;
                  }
               }

               if (var1 > 65535) {
                  if (var3 - var7 <= 510) {
                     var10 = 0;
                  }

                  field6375[0] = (byte)(var1 >> 24);
                  field6375[1] = (byte)(var1 >> 16);
                  field6375[2] = (byte)(var1 >> 8);
                  field6375[3] = (byte)var1;
                  field6375[4] = (byte)(var8 >> 8);
                  field6375[5] = (byte)var8;
                  field6375[6] = (byte)(var10 >> 16);
                  field6375[7] = (byte)(var10 >> 8);
                  field6375[8] = (byte)var10;
                  field6375[9] = (byte)(-516579491 * this.field6378);
                  this.field6376.method138(var9 * 520L);
                  this.field6376.method153(field6375, 0, 10, 402136946);
                  int var17 = var3 - var7;
                  if (var17 > 510) {
                     var17 = 510;
                  }

                  this.field6376.method153(var2, var7, var17, 169984222);
                  var7 += var17;
               } else {
                  if (var3 - var7 <= 512) {
                     var10 = 0;
                  }

                  field6375[0] = (byte)(var1 >> 8);
                  field6375[1] = (byte)var1;
                  field6375[2] = (byte)(var8 >> 8);
                  field6375[3] = (byte)var8;
                  field6375[4] = (byte)(var10 >> 16);
                  field6375[5] = (byte)(var10 >> 8);
                  field6375[6] = (byte)var10;
                  field6375[7] = (byte)(-516579491 * this.field6378);
                  this.field6376.method138(var9 * 520L);
                  this.field6376.method153(field6375, 0, 8, 388922826);
                  int var18 = var3 - var7;
                  if (var18 > 512) {
                     var18 = 512;
                  }

                  this.field6376.method153(var2, var7, var18, 1224276632);
                  var7 += var18;
               }

               var9 = var10;
            }

            field6375[0] = (byte)(var3 >> 16);
            field6375[1] = (byte)(var3 >> 8);
            field6375[2] = (byte)var3;
            field6375[3] = (byte)(var6 >> 16);
            field6375[4] = (byte)(var6 >> 8);
            field6375[5] = (byte)var6;
            this.field6379.method138(6 * var1);
            this.field6379.method153(field6375, 0, 6, -954522284);
            var20 = true;
         } catch (IOException var15) {
            return false;
         }

         return var20;
      }
   }

   public classUS(int var1, classAAC var2, classAAC var3, int var4) {
      this.field6377 = 433487560;
      this.field6378 = var1 * -1790137099;
      this.field6376 = var2;
      this.field6379 = var3;
      this.field6377 = var4 * 901289037;
   }

   @ObfuscatedSignature(descriptor = "(I[BII)Z")
   @ObfuscatedName("af")
   public boolean method11535(int var1, byte[] var2, int var3, int var4) {
      try {
         synchronized (this.field6376) {
            if (var3 >= 0) {
               if (var3 <= this.field6377 * -472857467) {
                  boolean var6 = this.method11537(var1, var2, var3, true, 11147277);
                  if (!var6) {
                     if (var4 <= -1885758891) {
                        throw new IllegalStateException();
                     }

                     var6 = this.method11537(var1, var2, var3, false, 128907718);
                  }

                  return var6;
               }

               if (var4 <= -1885758891) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException("" + this.field6377 * -516579491 + ',' + var1 + ',' + var3);
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "us.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method11544() {
      return "" + this.field6378 * -516579491;
   }
}
