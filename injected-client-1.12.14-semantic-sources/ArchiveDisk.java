import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tf")
public final class ArchiveDisk {
   @ObfuscatedSignature(descriptor = "Lws;")
   @ObfuscatedName("at")
   BufferedFile datFile;
   @ObfuscatedName("av")
   static byte[] ArchiveDisk_buffer = new byte[520];
   @ObfuscatedSignature(descriptor = "Lws;")
   @ObfuscatedName("ag")
   BufferedFile idxFile = null;
   @ObfuscatedName("an")
   int archive;
   @ObfuscatedName("ae")
   int maxEntrySize;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method10615() {
      return "" + 1072567871 * this.archive;
   }

   @ObfuscatedSignature(descriptor = "(Lqt;)V")
   @ObfuscatedName("kj")
   public static void method10607(IterableNodeHashTableIterator var0) {
      if (var0 == null) {
         var0.start();
      }

      var0.head = var0.hashTable.buckets[0].previous;
      var0.index = 1;
      var0.last = null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method10616() {
      return "" + 1072567871 * this.archive;
   }

   @ObfuscatedSignature(descriptor = "(I[BIZB)Z")
   @ObfuscatedName("ag")
   boolean write0(int var1, byte[] var2, int var3, boolean var4, byte var5) {
      try {
         synchronized (this.idxFile) {
            boolean var23;
            try {
               int var7;
               label152:
               if (var4) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  if (this.datFile.length(-545329567) < var1 * 6 + 6) {
                     return false;
                  }

                  this.datFile.seek(var1 * 6);
                  this.datFile.read(ArchiveDisk_buffer, 0, 6, -444838210);
                  var7 = ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8) + (ArchiveDisk_buffer[5] & 255);
                  if (var7 > 0) {
                     if (var5 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var7 <= this.idxFile.length(-545329567) / 520L) {
                        break label152;
                     }

                     if (var5 == 0) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               } else {
                  var7 = (int)((this.idxFile.method11858(-1080459254).length() + 519L) / 520L);
                  if (0 == var7) {
                     var7 = 1;
                  }
               }

               int var8 = 0;
               int var9 = 0;

               for (int var10 = var7; var8 < var3; var9++) {
                  if (var5 == 0) {
                     throw new IllegalStateException();
                  }

                  int var11 = 0;
                  if (var4) {
                     this.idxFile.seek(520L * var10);
                     int var12;
                     int var13;
                     int var14;
                     if (var1 > 65535) {
                        this.idxFile.read(ArchiveDisk_buffer, 0, 10, -444838210);
                        var12 = (ArchiveDisk_buffer[3] & 255)
                           + ((ArchiveDisk_buffer[2] & 255) << 8)
                           + ((ArchiveDisk_buffer[1] & 255) << 16)
                           + ((ArchiveDisk_buffer[0] & 255) << 24);
                        var13 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8);
                        var11 = (ArchiveDisk_buffer[8] & 255) + ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16);
                        var14 = ArchiveDisk_buffer[9] & 255;
                     } else {
                        this.idxFile.read(ArchiveDisk_buffer, 0, 8, -444838210);
                        var12 = (ArchiveDisk_buffer[1] & 255) + ((ArchiveDisk_buffer[0] & 255) << 8);
                        var13 = ((ArchiveDisk_buffer[2] & 255) << 8) + (ArchiveDisk_buffer[3] & 255);
                        var11 = (ArchiveDisk_buffer[6] & 255) + ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16);
                        var14 = ArchiveDisk_buffer[7] & 255;
                     }

                     if (var1 != var12) {
                        return false;
                     }

                     if (var5 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var13 != var9) {
                        return false;
                     }

                     if (var5 == 0) {
                        throw new IllegalStateException();
                     }

                     if (this.archive * 1072567871 != var14) {
                        if (var5 == 0) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     if (var11 < 0) {
                        return false;
                     }

                     if (var5 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var11 > this.idxFile.length(-545329567) / 520L) {
                        if (var5 == 0) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }
                  }

                  if (var11 == 0) {
                     if (var5 == 0) {
                        throw new IllegalStateException();
                     }

                     var4 = false;
                     var11 = (int)((this.idxFile.method11858(-1080459254).length() + 519L) / 520L);
                     if (var11 == 0) {
                        if (var5 == 0) {
                           throw new IllegalStateException();
                        }

                        var11++;
                     }

                     if (var10 == var11) {
                        var11++;
                     }
                  }

                  if (var1 > 65535) {
                     if (var5 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var3 - var8 <= 510) {
                        if (var5 == 0) {
                           throw new IllegalStateException();
                        }

                        var11 = 0;
                     }

                     ArchiveDisk_buffer[0] = (byte)(var1 >> 24);
                     ArchiveDisk_buffer[1] = (byte)(var1 >> 16);
                     ArchiveDisk_buffer[2] = (byte)(var1 >> 8);
                     ArchiveDisk_buffer[3] = (byte)var1;
                     ArchiveDisk_buffer[4] = (byte)(var9 >> 8);
                     ArchiveDisk_buffer[5] = (byte)var9;
                     ArchiveDisk_buffer[6] = (byte)(var11 >> 16);
                     ArchiveDisk_buffer[7] = (byte)(var11 >> 8);
                     ArchiveDisk_buffer[8] = (byte)var11;
                     ArchiveDisk_buffer[9] = (byte)(this.archive * 1072567871);
                     this.idxFile.seek(var10 * 520L);
                     this.idxFile.write(ArchiveDisk_buffer, 0, 10, -1507952609);
                     int var19 = var3 - var8;
                     if (var19 > 510) {
                        if (var5 == 0) {
                           throw new IllegalStateException();
                        }

                        var19 = 510;
                     }

                     this.idxFile.write(var2, var8, var19, -1507952609);
                     var8 += var19;
                  } else {
                     if (var3 - var8 <= 512) {
                        var11 = 0;
                     }

                     ArchiveDisk_buffer[0] = (byte)(var1 >> 8);
                     ArchiveDisk_buffer[1] = (byte)var1;
                     ArchiveDisk_buffer[2] = (byte)(var9 >> 8);
                     ArchiveDisk_buffer[3] = (byte)var9;
                     ArchiveDisk_buffer[4] = (byte)(var11 >> 16);
                     ArchiveDisk_buffer[5] = (byte)(var11 >> 8);
                     ArchiveDisk_buffer[6] = (byte)var11;
                     ArchiveDisk_buffer[7] = (byte)(1072567871 * this.archive);
                     this.idxFile.seek(var10 * 520L);
                     this.idxFile.write(ArchiveDisk_buffer, 0, 8, -1507952609);
                     int var20 = var3 - var8;
                     if (var20 > 512) {
                        if (var5 == 0) {
                           throw new IllegalStateException();
                        }

                        var20 = 512;
                     }

                     this.idxFile.write(var2, var8, var20, -1507952609);
                     var8 += var20;
                  }

                  var10 = var11;
               }

               ArchiveDisk_buffer[0] = (byte)(var3 >> 16);
               ArchiveDisk_buffer[1] = (byte)(var3 >> 8);
               ArchiveDisk_buffer[2] = (byte)var3;
               ArchiveDisk_buffer[3] = (byte)(var7 >> 16);
               ArchiveDisk_buffer[4] = (byte)(var7 >> 8);
               ArchiveDisk_buffer[5] = (byte)var7;
               this.datFile.seek(6 * var1);
               this.datFile.write(ArchiveDisk_buffer, 0, 6, -1507952609);
               var23 = true;
            } catch (IOException var16) {
               return false;
            }

            return var23;
         }
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "tf.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltf;I[BIZ)Z")
   @ObfuscatedName("mu")
   public static boolean method10614(ArchiveDisk var0, int var1, byte[] var2, int var3, boolean var4) {
      synchronized (var0.idxFile) {
         boolean var20;
         try {
            int var6;
            if (var4) {
               if (var0.datFile.length(-545329567) < var1 * 6 + 6) {
                  return false;
               }

               var0.datFile.seek(var1 * 6);
               var0.datFile.read(ArchiveDisk_buffer, 0, 6, -444838210);
               var6 = ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8) + (ArchiveDisk_buffer[5] & 255);
               if (var6 <= 0 || var6 > var0.idxFile.length(-545329567) / 520L) {
                  return false;
               }
            } else {
               var6 = (int)((var0.idxFile.method11858(-1080459254).length() + 519L) / 520L);
               if (0 == var6) {
                  var6 = 1;
               }
            }

            int var7 = 0;
            int var8 = 0;

            for (int var9 = var6; var7 < var3; var8++) {
               int var10 = 0;
               if (var4) {
                  var0.idxFile.seek(520L * var9);
                  int var11;
                  int var12;
                  int var13;
                  if (var1 > 65535) {
                     var0.idxFile.read(ArchiveDisk_buffer, 0, 10, -444838210);
                     var11 = (ArchiveDisk_buffer[3] & 255)
                        + ((ArchiveDisk_buffer[2] & 255) << 8)
                        + ((ArchiveDisk_buffer[1] & 255) << 16)
                        + ((ArchiveDisk_buffer[0] & 255) << 24);
                     var12 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8);
                     var10 = (ArchiveDisk_buffer[8] & 255) + ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16);
                     var13 = ArchiveDisk_buffer[9] & 255;
                  } else {
                     var0.idxFile.read(ArchiveDisk_buffer, 0, 8, -444838210);
                     var11 = (ArchiveDisk_buffer[1] & 255) + ((ArchiveDisk_buffer[0] & 255) << 8);
                     var12 = ((ArchiveDisk_buffer[2] & 255) << 8) + (ArchiveDisk_buffer[3] & 255);
                     var10 = (ArchiveDisk_buffer[6] & 255) + ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16);
                     var13 = ArchiveDisk_buffer[7] & 255;
                  }

                  if (var1 != var11 || var12 != var8 || var0.archive * 1072567871 != var13) {
                     return false;
                  }

                  if (var10 < 0 || var10 > var0.idxFile.length(-545329567) / 520L) {
                     return false;
                  }
               }

               if (var10 == 0) {
                  var4 = false;
                  var10 = (int)((var0.idxFile.method11858(-1080459254).length() + 519L) / 520L);
                  if (var10 == 0) {
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

                  ArchiveDisk_buffer[0] = (byte)(var1 >> 24);
                  ArchiveDisk_buffer[1] = (byte)(var1 >> 16);
                  ArchiveDisk_buffer[2] = (byte)(var1 >> 8);
                  ArchiveDisk_buffer[3] = (byte)var1;
                  ArchiveDisk_buffer[4] = (byte)(var8 >> 8);
                  ArchiveDisk_buffer[5] = (byte)var8;
                  ArchiveDisk_buffer[6] = (byte)(var10 >> 16);
                  ArchiveDisk_buffer[7] = (byte)(var10 >> 8);
                  ArchiveDisk_buffer[8] = (byte)var10;
                  ArchiveDisk_buffer[9] = (byte)(var0.archive * 1072567871);
                  var0.idxFile.seek(var9 * 520L);
                  var0.idxFile.write(ArchiveDisk_buffer, 0, 10, -1507952609);
                  int var17 = var3 - var7;
                  if (var17 > 510) {
                     var17 = 510;
                  }

                  var0.idxFile.write(var2, var7, var17, -1507952609);
                  var7 += var17;
               } else {
                  if (var3 - var7 <= 512) {
                     var10 = 0;
                  }

                  ArchiveDisk_buffer[0] = (byte)(var1 >> 8);
                  ArchiveDisk_buffer[1] = (byte)var1;
                  ArchiveDisk_buffer[2] = (byte)(var8 >> 8);
                  ArchiveDisk_buffer[3] = (byte)var8;
                  ArchiveDisk_buffer[4] = (byte)(var10 >> 16);
                  ArchiveDisk_buffer[5] = (byte)(var10 >> 8);
                  ArchiveDisk_buffer[6] = (byte)var10;
                  ArchiveDisk_buffer[7] = (byte)(1072567871 * var0.archive);
                  var0.idxFile.seek(var9 * 520L);
                  var0.idxFile.write(ArchiveDisk_buffer, 0, 8, -1507952609);
                  int var18 = var3 - var7;
                  if (var18 > 512) {
                     var18 = 512;
                  }

                  var0.idxFile.write(var2, var7, var18, -1507952609);
                  var7 += var18;
               }

               var9 = var10;
            }

            ArchiveDisk_buffer[0] = (byte)(var3 >> 16);
            ArchiveDisk_buffer[1] = (byte)(var3 >> 8);
            ArchiveDisk_buffer[2] = (byte)var3;
            ArchiveDisk_buffer[3] = (byte)(var6 >> 16);
            ArchiveDisk_buffer[4] = (byte)(var6 >> 8);
            ArchiveDisk_buffer[5] = (byte)var6;
            var0.datFile.seek(6 * var1);
            var0.datFile.write(ArchiveDisk_buffer, 0, 6, -1507952609);
            var20 = true;
         } catch (IOException var15) {
            return false;
         }

         return var20;
      }
   }

   @Override
   public String toString() {
      try {
         return "" + 1072567871 * this.archive;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "tf.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltf;I[BIB)Z")
   @ObfuscatedName("eg")
   public static boolean method10610(ArchiveDisk var0, int var1, byte[] var2, int var3, byte var4) {
      if (var0 == null) {
         return var0.write(var1, var2, var1, var4);
      } else {
         try {
            synchronized (var0.idxFile) {
               if (var3 >= 0) {
                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= -1857353405 * var0.maxEntrySize) {
                     boolean var6 = var0.write0(var1, var2, var3, true, (byte)-38);
                     if (!var6) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var6 = var0.write0(var1, var2, var3, false, (byte)-34);
                     }

                     return var6;
                  }

                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  }
               }

               throw new IllegalArgumentException("" + 1072567871 * var0.archive + ',' + var1 + ',' + var3);
            }
         } catch (RuntimeException var9) {
            throw RestClientThreadFactory.newRunException(var9, "tf.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("av")
   public byte[] read(int var1, int var2) {
      try {
         synchronized (this.idxFile) {
            try {
               if (this.datFile.length(-545329567) < 6 + var1 * 6) {
                  return null;
               } else {
                  this.datFile.seek(6 * var1);
                  this.datFile.read(ArchiveDisk_buffer, 0, 6, -444838210);
                  int var4 = (ArchiveDisk_buffer[2] & 255) + ((ArchiveDisk_buffer[0] & 255) << 16) + ((ArchiveDisk_buffer[1] & 255) << 8);
                  int var5 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8);
                  if (var4 >= 0) {
                     if (var2 >= 1014644969) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= this.maxEntrySize * -1857353405) {
                        if (var5 > 0) {
                           if (var2 >= 1014644969) {
                              throw new IllegalStateException();
                           }

                           if (var5 <= this.idxFile.length(-545329567) / 520L) {
                              byte[] var6 = new byte[var4];
                              int var7 = 0;
                              int var8 = 0;

                              while (var7 < var4) {
                                 if (var2 >= 1014644969) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == var5) {
                                    if (var2 >= 1014644969) {
                                       throw new IllegalStateException();
                                    }

                                    return null;
                                 }

                                 this.idxFile.seek(520L * var5);
                                 int var9 = var4 - var7;
                                 int var10;
                                 int var11;
                                 int var12;
                                 int var13;
                                 byte var14;
                                 if (var1 > 65535) {
                                    if (var2 >= 1014644969) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 > 510) {
                                       if (var2 >= 1014644969) {
                                          throw new IllegalStateException();
                                       }

                                       var9 = 510;
                                    }

                                    var14 = 10;
                                    this.idxFile.read(ArchiveDisk_buffer, 0, var9 + var14, -444838210);
                                    var10 = ((ArchiveDisk_buffer[2] & 255) << 8)
                                       + ((ArchiveDisk_buffer[1] & 255) << 16)
                                       + ((ArchiveDisk_buffer[0] & 255) << 24)
                                       + (ArchiveDisk_buffer[3] & 255);
                                    var11 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8);
                                    var12 = ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16) + (ArchiveDisk_buffer[8] & 255);
                                    var13 = ArchiveDisk_buffer[9] & 255;
                                 } else {
                                    if (var9 > 512) {
                                       if (var2 >= 1014644969) {
                                          throw new IllegalStateException();
                                       }

                                       var9 = 512;
                                    }

                                    var14 = 8;
                                    this.idxFile.read(ArchiveDisk_buffer, 0, var14 + var9, -444838210);
                                    var10 = ((ArchiveDisk_buffer[0] & 255) << 8) + (ArchiveDisk_buffer[1] & 255);
                                    var11 = ((ArchiveDisk_buffer[2] & 255) << 8) + (ArchiveDisk_buffer[3] & 255);
                                    var12 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255);
                                    var13 = ArchiveDisk_buffer[7] & 255;
                                 }

                                 if (var1 == var10) {
                                    if (var2 >= 1014644969) {
                                       throw new IllegalStateException();
                                    }

                                    if (var11 == var8) {
                                       if (this.archive * 1072567871 == var13) {
                                          if (var12 >= 0) {
                                             if (var2 >= 1014644969) {
                                                throw new IllegalStateException();
                                             }

                                             if (var12 <= this.idxFile.length(-545329567) / 520L) {
                                                int var15 = var14 + var9;

                                                for (int var16 = var14; var16 < var15; var16++) {
                                                   if (var2 >= 1014644969) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var6[var7++] = ArchiveDisk_buffer[var16];
                                                }

                                                var5 = var12;
                                                var8++;
                                                continue;
                                             }

                                             if (var2 >= 1014644969) {
                                                throw new IllegalStateException();
                                             }
                                          }

                                          return null;
                                       }

                                       if (var2 >= 1014644969) {
                                          throw new IllegalStateException();
                                       }
                                    }
                                 }

                                 return null;
                              }

                              return var6;
                           }
                        }

                        return null;
                     }

                     if (var2 >= 1014644969) {
                        throw new IllegalStateException();
                     }
                  }

                  return null;
               }
            } catch (IOException var18) {
               return null;
            }
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "tf.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method10617() {
      return "" + 1072567871 * this.archive;
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("an")
   public byte[] method10609(int var1) {
      synchronized (this.idxFile) {
         byte[] var21;
         try {
            if (this.datFile.length(-545329567) < 6 + var1 * 6) {
               return null;
            }

            this.datFile.seek(6 * var1);
            this.datFile.read(ArchiveDisk_buffer, 0, 6, -444838210);
            int var3 = (ArchiveDisk_buffer[2] & 255) + ((ArchiveDisk_buffer[0] & 255) << 16) + ((ArchiveDisk_buffer[1] & 255) << 8);
            int var4 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[3] & 255) << 16) + ((ArchiveDisk_buffer[4] & 255) << 8);
            if (var3 < 0 || var3 > this.maxEntrySize * -1857353405) {
               return null;
            }

            if (var4 <= 0 || var4 > this.idxFile.length(-545329567) / 520L) {
               return null;
            }

            byte[] var5 = new byte[var3];
            int var6 = 0;
            int var7 = 0;

            while (var6 < var3) {
               if (0 == var4) {
                  return null;
               }

               this.idxFile.seek(520L * var4);
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
                  this.idxFile.read(ArchiveDisk_buffer, 0, var8 + var13, -444838210);
                  var9 = ((ArchiveDisk_buffer[2] & 255) << 8)
                     + ((ArchiveDisk_buffer[1] & 255) << 16)
                     + ((ArchiveDisk_buffer[0] & 255) << 24)
                     + (ArchiveDisk_buffer[3] & 255);
                  var10 = (ArchiveDisk_buffer[5] & 255) + ((ArchiveDisk_buffer[4] & 255) << 8);
                  var11 = ((ArchiveDisk_buffer[7] & 255) << 8) + ((ArchiveDisk_buffer[6] & 255) << 16) + (ArchiveDisk_buffer[8] & 255);
                  var12 = ArchiveDisk_buffer[9] & 255;
               } else {
                  if (var8 > 512) {
                     var8 = 512;
                  }

                  var13 = 8;
                  this.idxFile.read(ArchiveDisk_buffer, 0, var13 + var8, -444838210);
                  var9 = ((ArchiveDisk_buffer[0] & 255) << 8) + (ArchiveDisk_buffer[1] & 255);
                  var10 = ((ArchiveDisk_buffer[2] & 255) << 8) + (ArchiveDisk_buffer[3] & 255);
                  var11 = ((ArchiveDisk_buffer[5] & 255) << 8) + ((ArchiveDisk_buffer[4] & 255) << 16) + (ArchiveDisk_buffer[6] & 255);
                  var12 = ArchiveDisk_buffer[7] & 255;
               }

               if (var1 == var9 && var10 == var7 && this.archive * 1072567871 == var12) {
                  if (var11 >= 0 && var11 <= this.idxFile.length(-545329567) / 520L) {
                     int var14 = var13 + var8;

                     for (int var15 = var13; var15 < var14; var15++) {
                        var5[var6++] = ArchiveDisk_buffer[var15];
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
   @ObfuscatedName("ae")
   public boolean method10611(int var1, byte[] var2, int var3) {
      synchronized (this.idxFile) {
         if (var3 >= 0 && var3 <= -1857353405 * this.maxEntrySize) {
            boolean var5 = this.write0(var1, var2, var3, true, (byte)11);
            if (!var5) {
               var5 = this.write0(var1, var2, var3, false, (byte)-53);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + 1072567871 * this.archive + -2110453811 + var1 + ',' + var3);
         }
      }
   }

   public ArchiveDisk(int var1, BufferedFile var2, BufferedFile var3, int var4) {
      this.datFile = null;
      this.maxEntrySize = -1486284808;
      this.archive = 385800639 * var1;
      this.idxFile = var2;
      this.datFile = var3;
      this.maxEntrySize = var4 * -279327893;
   }

   @ObfuscatedSignature(descriptor = "(I[BIB)Z")
   @ObfuscatedName("at")
   public boolean write(int var1, byte[] var2, int var3, byte var4) {
      try {
         synchronized (this.datFile) {
            if (var3 >= 0) {
               if (var4 <= 0) {
                  throw new IllegalStateException();
               }

               if (var3 <= -1857353405 * this.maxEntrySize) {
                  boolean var6 = this.write0(var1, var2, var3, true, (byte)-38);
                  if (!var6) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     var6 = this.write0(var1, var2, var3, false, (byte)-34);
                  }

                  return var6;
               }

               if (var4 <= 0) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException("" + 1072567871 * this.maxEntrySize + ',' + var1 + ',' + var3);
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "tf.at(" + ')');
      }
   }
}
