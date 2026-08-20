import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ws")
public class BufferedFile {
   @ObfuscatedName("az")
   long fileOffset;
   @ObfuscatedName("ag")
   byte[] readBuffer;
   @ObfuscatedSignature(descriptor = "Lwn;")
   @ObfuscatedName("at")
   AccessFile accessFile;
   @ObfuscatedName("ae")
   int readBufferLength;
   @ObfuscatedName("an")
   long readBufferOffset = 5194146062620342075L;
   @ObfuscatedName("ak")
   long writeBufferOffset = -7248959654507250997L;
   @ObfuscatedName("aw")
   int writeBufferLength = 0;
   @ObfuscatedName("ap")
   long offset;
   @ObfuscatedName("aj")
   byte[] writeBuffer;
   @ObfuscatedName("au")
   long length;
   @ObfuscatedName("ay")
   long fileLength;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method11874() throws IOException {
      if (-1L != -1047395612733414115L * this.writeBufferOffset) {
         if (-1047395612733414115L * this.writeBufferOffset != this.fileOffset * -2635910061598715747L) {
            AccessFile.method11793(this.accessFile, this.writeBufferOffset * -1047395612733414115L);
            this.fileOffset = 7321886634909236865L * this.writeBufferOffset;
         }

         AccessFile.method11798(this.accessFile, this.writeBuffer, 0, this.writeBufferLength * 1023942981, (byte)-105);
         this.fileOffset = this.fileOffset + -3516505508880855351L * this.writeBufferLength;
         if (this.fileOffset * -2635910061598715747L > -8916147190238263293L * this.fileLength) {
            this.fileLength = this.fileOffset * 5925661200296555231L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (-1047395612733414115L * this.writeBufferOffset >= -114192960065178099L * this.readBufferOffset
            && this.writeBufferOffset * -1047395612733414115L < this.readBufferOffset * -114192960065178099L + 1024333101 * this.readBufferLength) {
            var1 = this.writeBufferOffset * -1047395612733414115L;
         } else if (-114192960065178099L * this.readBufferOffset >= -1047395612733414115L * this.writeBufferOffset
            && -114192960065178099L * this.readBufferOffset < this.writeBufferLength * 1023942981 + this.writeBufferOffset * -1047395612733414115L) {
            var1 = -114192960065178099L * this.readBufferOffset;
         }

         if (this.writeBufferOffset * -1047395612733414115L + this.writeBufferLength * 1023942981 > -114192960065178099L * this.readBufferOffset
            && this.writeBufferLength * 1651337151 + -1047395612733414115L * this.writeBufferOffset
               <= 1024333101 * this.readBufferLength + -114192960065178099L * this.readBufferOffset) {
            var3 = 1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset;
         } else if (this.readBufferOffset * -114192960065178099L + this.readBufferLength * 1024333101 > this.writeBufferOffset * -1047395612733414115L
            && this.readBufferLength * 717313020 + -114192960065178099L * this.readBufferOffset
               <= this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset) {
            var3 = this.readBufferLength * -1757666164 + -114192960065178099L * this.readBufferOffset;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               this.writeBuffer,
               (int)(var1 - -1047395612733414115L * this.writeBufferOffset),
               this.readBuffer,
               (int)(var1 - this.readBufferOffset * -114192960065178099L),
               var5
            );
         }

         this.writeBufferOffset = -7248959654507250997L;
         this.writeBufferLength = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method11875() throws IOException {
      if (-1L != -1047395612733414115L * this.writeBufferOffset) {
         if (-1047395612733414115L * this.writeBufferOffset != this.fileOffset * -2635910061598715747L) {
            AccessFile.method11793(this.accessFile, this.writeBufferOffset * -1047395612733414115L);
            this.fileOffset = 7321886634909236865L * this.writeBufferOffset;
         }

         AccessFile.method11798(this.accessFile, this.writeBuffer, 0, this.writeBufferLength * 1023942981, (byte)-33);
         this.fileOffset = this.fileOffset + -3516505508880855351L * this.writeBufferLength;
         if (this.fileOffset * -2635910061598715747L > -8916147190238263293L * this.fileLength) {
            this.fileLength = this.fileOffset * 5925661200296555231L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (-1047395612733414115L * this.writeBufferOffset >= -114192960065178099L * this.readBufferOffset
            && this.writeBufferOffset * -1047395612733414115L < this.readBufferOffset * -114192960065178099L + 1024333101 * this.readBufferLength) {
            var1 = this.writeBufferOffset * -1047395612733414115L;
         } else if (-114192960065178099L * this.readBufferOffset >= -1047395612733414115L * this.writeBufferOffset
            && -114192960065178099L * this.readBufferOffset < this.writeBufferLength * 1023942981 + this.writeBufferOffset * -1047395612733414115L) {
            var1 = -114192960065178099L * this.readBufferOffset;
         }

         if (this.writeBufferOffset * -1047395612733414115L + this.writeBufferLength * 1023942981 > -114192960065178099L * this.readBufferOffset
            && this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset
               <= 1024333101 * this.readBufferLength + -114192960065178099L * this.readBufferOffset) {
            var3 = 1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset;
         } else if (this.readBufferOffset * -114192960065178099L + this.readBufferLength * 1024333101 > this.writeBufferOffset * -1047395612733414115L
            && this.readBufferLength * 1024333101 + -114192960065178099L * this.readBufferOffset
               <= this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset) {
            var3 = this.readBufferLength * 1024333101 + -114192960065178099L * this.readBufferOffset;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               this.writeBuffer,
               (int)(var1 - -1047395612733414115L * this.writeBufferOffset),
               this.readBuffer,
               (int)(var1 - this.readBufferOffset * -114192960065178099L),
               var5
            );
         }

         this.writeBufferOffset = -7248959654507250997L;
         this.writeBufferLength = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ai")
   public long method11854() {
      return -8179259620974557791L * this.length;
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("ag")
   public long length(int var1) {
      try {
         return -8179259620974557791L * this.length;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ws.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/io/File;")
   @ObfuscatedName("an")
   public final File method11858(int var1) {
      try {
         return this.accessFile.method11792(99370670);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ws.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("ae")
   public void readFully(byte[] var1, int var2) throws IOException {
      try {
         this.read(var1, 0, var1.length, -444838210);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ws.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("aj")
   public void read(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if (var2 + var3 > var1.length) {
               if (var4 != -444838210) {
                  return;
               }

               throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
            }

            if (this.writeBufferOffset * -1047395612733414115L != -1L) {
               if (var4 != -444838210) {
                  throw new IllegalStateException();
               }

               if (this.offset * 5345664010121337071L >= this.writeBufferOffset * -1047395612733414115L) {
                  if (var4 != -444838210) {
                     throw new IllegalStateException();
                  }

                  if (var3 + 5345664010121337071L * this.offset <= this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(
                        this.writeBuffer, (int)(5345664010121337071L * this.offset - this.writeBufferOffset * -1047395612733414115L), var1, var2, var3
                     );
                     this.offset += var3 * -8651900383598291441L;
                     return;
                  }
               }
            }

            long var5 = 5345664010121337071L * this.offset;
            int var7 = var2;
            int var8 = var3;
            if (this.offset * 5345664010121337071L >= -114192960065178099L * this.readBufferOffset) {
               if (var4 != -444838210) {
                  throw new IllegalStateException();
               }

               if (5345664010121337071L * this.offset < this.readBufferLength * 1024333101 + this.readBufferOffset * -114192960065178099L) {
                  if (var4 != -444838210) {
                     throw new IllegalStateException();
                  }

                  int var9 = (int)(1024333101 * this.readBufferLength - (5345664010121337071L * this.offset - this.readBufferOffset * -114192960065178099L));
                  if (var9 > var3) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     var9 = var3;
                  }

                  System.arraycopy(this.readBuffer, (int)(this.offset * 5345664010121337071L - -114192960065178099L * this.readBufferOffset), var1, var2, var9);
                  this.offset += -8651900383598291441L * var9;
                  var2 += var9;
                  var3 -= var9;
               }
            }

            if (var3 > this.readBuffer.length) {
               if (var4 != -444838210) {
                  throw new IllegalStateException();
               }

               AccessFile.method11793(this.accessFile, this.offset * 5345664010121337071L);
               this.fileOffset = this.offset * 4685393502465842171L;

               while (var3 > 0) {
                  if (var4 != -444838210) {
                     throw new IllegalStateException();
                  }

                  int var17 = this.accessFile.read(var1, var2, var3, (byte)-26);
                  if (var17 == -1) {
                     break;
                  }

                  this.fileOffset += var17 * 7539460343460607413L;
                  this.offset += -8651900383598291441L * var17;
                  var2 += var17;
                  var3 -= var17;
               }
            } else if (var3 > 0) {
               this.load((short)18560);
               int var16 = var3;
               if (var3 > 1024333101 * this.readBufferLength) {
                  if (var4 != -444838210) {
                     return;
                  }

                  var16 = 1024333101 * this.readBufferLength;
               }

               System.arraycopy(this.readBuffer, 0, var1, var2, var16);
               var2 += var16;
               var3 -= var16;
               this.offset += var16 * -8651900383598291441L;
            }

            if (-1L != -1047395612733414115L * this.writeBufferOffset) {
               if (var4 != -444838210) {
                  throw new IllegalStateException();
               }

               if (-1047395612733414115L * this.writeBufferOffset > this.offset * 5345664010121337071L && var3 > 0) {
                  if (var4 != -444838210) {
                     throw new IllegalStateException();
                  }

                  int var18 = (int)(this.writeBufferOffset * -1047395612733414115L - 5345664010121337071L * this.offset) + var2;
                  if (var18 > var2 + var3) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     var18 = var3 + var2;
                  }

                  while (var2 < var18) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     var1[var2++] = 0;
                     var3--;
                     this.offset += -8651900383598291441L;
                  }
               }

               long var11;
               long var19;
               label185: {
                  var19 = -1L;
                  var11 = -1L;
                  if (-1047395612733414115L * this.writeBufferOffset >= var5) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     if (this.writeBufferOffset * -1047395612733414115L < var5 + var8) {
                        if (var4 != -444838210) {
                           return;
                        }

                        var19 = this.writeBufferOffset * -1047395612733414115L;
                        break label185;
                     }
                  }

                  if (var5 >= this.writeBufferOffset * -1047395612733414115L) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     if (var5 < -1047395612733414115L * this.writeBufferOffset + 1023942981 * this.writeBufferLength) {
                        if (var4 != -444838210) {
                           return;
                        }

                        var19 = var5;
                     }
                  }
               }

               label179: {
                  if (this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset > var5) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     if (1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset <= var5 + var8) {
                        if (var4 != -444838210) {
                           throw new IllegalStateException();
                        }

                        var11 = this.writeBufferOffset * -1047395612733414115L + this.writeBufferLength * 1023942981;
                        break label179;
                     }
                  }

                  if (var8 + var5 > this.writeBufferOffset * -1047395612733414115L) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     if (var8 + var5 <= 1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset) {
                        if (var4 != -444838210) {
                           throw new IllegalStateException();
                        }

                        var11 = var5 + var8;
                     }
                  }
               }

               if (var19 > -1L) {
                  if (var4 != -444838210) {
                     throw new IllegalStateException();
                  }

                  if (var11 > var19) {
                     if (var4 != -444838210) {
                        throw new IllegalStateException();
                     }

                     int var13 = (int)(var11 - var19);
                     System.arraycopy(this.writeBuffer, (int)(var19 - this.writeBufferOffset * -1047395612733414115L), var1, (int)(var19 - var5) + var7, var13);
                     if (var11 > this.offset * 5345664010121337071L) {
                        var3 = (int)(var3 - (var11 - this.offset * 5345664010121337071L));
                        this.offset = -8651900383598291441L * var11;
                     }
                  }
               }
            }
         } catch (IOException var14) {
            this.fileOffset = -7539460343460607413L;
            throw var14;
         }

         if (var3 > 0) {
            if (var4 == -444838210) {
               throw new EOFException();
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "ws.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/File;")
   @ObfuscatedName("as")
   public final File method11859() {
      return this.accessFile.method11792(-1366581954);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method11868() throws IOException {
      this.readBufferLength = 0;
      if (this.fileOffset * -2635910061598715747L != this.offset * 5345664010121337071L) {
         AccessFile.method11793(this.accessFile, 5345664010121337071L * this.offset);
         this.fileOffset = this.offset * 4685393502465842171L;
      }

      this.readBufferOffset = 284880226474633195L * this.offset;

      while (1024333101 * this.readBufferLength < this.readBuffer.length) {
         int var1 = this.readBuffer.length - this.readBufferLength * 1024333101;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         int var2 = this.accessFile.read(this.readBuffer, this.readBufferLength * 1024333101, var1, (byte)-34);
         if (var2 == -1) {
            break;
         }

         this.fileOffset += 7539460343460607413L * var2;
         this.readBufferLength += var2 * 1309278885;
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ap")
   void flush(short var1) throws IOException {
      try {
         if (-1L != -1047395612733414115L * this.writeBufferOffset) {
            if (var1 == 255) {
               return;
            }

            if (-1047395612733414115L * this.writeBufferOffset != this.fileOffset * -2635910061598715747L) {
               if (var1 == 255) {
                  throw new IllegalStateException();
               }

               AccessFile.method11793(this.accessFile, this.writeBufferOffset * -1047395612733414115L);
               this.fileOffset = 7321886634909236865L * this.writeBufferOffset;
            }

            AccessFile.method11798(this.accessFile, this.writeBuffer, 0, this.writeBufferLength * 1023942981, (byte)-127);
            this.fileOffset = this.fileOffset + -3516505508880855351L * this.writeBufferLength;
            if (this.fileOffset * -2635910061598715747L > -8916147190238263293L * this.fileLength) {
               if (var1 == 255) {
                  throw new IllegalStateException();
               }

               this.fileLength = this.fileOffset * 5925661200296555231L;
            }

            long var2;
            long var4;
            label95: {
               var2 = -1L;
               var4 = -1L;
               if (-1047395612733414115L * this.writeBufferOffset >= -114192960065178099L * this.readBufferOffset) {
                  if (var1 == 255) {
                     throw new IllegalStateException();
                  }

                  if (this.writeBufferOffset * -1047395612733414115L < this.readBufferOffset * -114192960065178099L + 1024333101 * this.readBufferLength) {
                     if (var1 == 255) {
                        throw new IllegalStateException();
                     }

                     var2 = this.writeBufferOffset * -1047395612733414115L;
                     break label95;
                  }
               }

               if (-114192960065178099L * this.readBufferOffset >= -1047395612733414115L * this.writeBufferOffset) {
                  if (var1 == 255) {
                     throw new IllegalStateException();
                  }

                  if (-114192960065178099L * this.readBufferOffset < this.writeBufferLength * 1023942981 + this.writeBufferOffset * -1047395612733414115L) {
                     if (var1 == 255) {
                        return;
                     }

                     var2 = -114192960065178099L * this.readBufferOffset;
                  }
               }
            }

            label89: {
               if (this.writeBufferOffset * -1047395612733414115L + this.writeBufferLength * 1023942981 > -114192960065178099L * this.readBufferOffset) {
                  if (var1 == 255) {
                     throw new IllegalStateException();
                  }

                  if (this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset
                     <= 1024333101 * this.readBufferLength + -114192960065178099L * this.readBufferOffset) {
                     if (var1 == 255) {
                        return;
                     }

                     var4 = 1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset;
                     break label89;
                  }
               }

               if (this.readBufferOffset * -114192960065178099L + this.readBufferLength * 1024333101 > this.writeBufferOffset * -1047395612733414115L) {
                  if (var1 == 255) {
                     throw new IllegalStateException();
                  }

                  if (this.readBufferLength * 1024333101 + -114192960065178099L * this.readBufferOffset
                     <= this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset) {
                     var4 = this.readBufferLength * 1024333101 + -114192960065178099L * this.readBufferOffset;
                  }
               }
            }

            if (var2 > -1L) {
               if (var1 == 255) {
                  throw new IllegalStateException();
               }

               if (var4 > var2) {
                  int var6 = (int)(var4 - var2);
                  System.arraycopy(
                     this.writeBuffer,
                     (int)(var2 - -1047395612733414115L * this.writeBufferOffset),
                     this.readBuffer,
                     (int)(var2 - this.readBufferOffset * -114192960065178099L),
                     var6
                  );
               }
            }

            this.writeBufferOffset = -7248959654507250997L;
            this.writeBufferLength = 0;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ws.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ay")
   public void method11851(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.offset = -8651900383598291441L * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("au")
   public void method11852(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.offset = -8651900383598291441L * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("az")
   public long method11856() {
      return -8179259620974557791L * this.length;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lws;[BII)V")
   @ObfuscatedName("qx")
   public static void method11870(BufferedFile var0, byte[] var1, int var2, int var3) throws IOException {
      if (var0 == null) {
         var0.method11873(var1, var2, var2);
      } else {
         try {
            if (var0.offset * 5345664010121337071L + var3 > var0.length * -8179259620974557791L) {
               var0.length = (var3 + var0.offset * 5345664010121337071L) * -1369563860981801375L;
            }

            if (-1L != var0.writeBufferOffset * -1047395612733414115L
               && (
                  5345664010121337071L * var0.offset < -1047395612733414115L * var0.writeBufferOffset
                     || 5345664010121337071L * var0.offset > 1023942981 * var0.writeBufferLength + var0.writeBufferOffset * -1047395612733414115L
               )) {
               var0.flush((short)11768);
            }

            if (-1L != -1047395612733414115L * var0.writeBufferOffset
               && var0.offset * 5345664010121337071L + var3 > var0.writeBufferOffset * -1047395612733414115L + var0.writeBuffer.length) {
               int var4 = (int)(var0.writeBuffer.length - (5345664010121337071L * var0.offset - var0.writeBufferOffset * -1047395612733414115L));
               System.arraycopy(var1, var2, var0.writeBuffer, (int)(5345664010121337071L * var0.offset - -1047395612733414115L * var0.writeBufferOffset), var4);
               var0.offset += var4 * -8651900383598291441L;
               var2 += var4;
               var3 -= var4;
               var0.writeBufferLength = var0.writeBuffer.length * -218805875;
               var0.flush((short)-6792);
            }

            if (var3 <= var0.writeBuffer.length) {
               if (var3 > 0) {
                  if (-1L == var0.writeBufferOffset * -1047395612733414115L) {
                     var0.writeBufferOffset = var0.offset * 3670443581278983291L;
                  }

                  System.arraycopy(
                     var1, var2, var0.writeBuffer, (int)(5345664010121337071L * var0.offset - var0.writeBufferOffset * -1047395612733414115L), var3
                  );
                  var0.offset += -8651900383598291441L * var3;
                  if (var0.offset * 5345664010121337071L - var0.writeBufferOffset * -1047395612733414115L > 1023942981 * var0.writeBufferLength) {
                     var0.writeBufferLength = -218805875 * (int)(5345664010121337071L * var0.offset - -1047395612733414115L * var0.writeBufferOffset);
                  }
               }
            } else {
               if (var0.fileOffset * -2635910061598715747L != var0.offset * 5345664010121337071L) {
                  AccessFile.method11793(var0.accessFile, var0.offset * 5345664010121337071L);
                  var0.fileOffset = 4685393502465842171L * var0.offset;
               }

               AccessFile.method11798(var0.accessFile, var1, var2, var3, (byte)-73);
               var0.fileOffset += var3 * 7539460343460607413L;
               if (-2635910061598715747L * var0.fileOffset > -8916147190238263293L * var0.fileLength) {
                  var0.fileLength = 5925661200296555231L * var0.fileOffset;
               }

               long var10 = -1L;
               long var6 = -1L;
               if (var0.offset * 5345664010121337071L >= var0.readBufferOffset * -114192960065178099L
                  && var0.offset * 5345664010121337071L < var0.readBufferOffset * -114192960065178099L + 1024333101 * var0.readBufferLength) {
                  var10 = 5345664010121337071L * var0.offset;
               } else if (var0.readBufferOffset * -114192960065178099L >= 5345664010121337071L * var0.offset
                  && -114192960065178099L * var0.readBufferOffset < var3 + var0.offset * 5345664010121337071L) {
                  var10 = var0.readBufferOffset * -114192960065178099L;
               }

               if (var3 + var0.offset * 5345664010121337071L > var0.readBufferOffset * -114192960065178099L
                  && var3 + 5345664010121337071L * var0.offset <= 1024333101 * var0.readBufferLength + -114192960065178099L * var0.readBufferOffset) {
                  var6 = 5345664010121337071L * var0.offset + var3;
               } else if (-114192960065178099L * var0.readBufferOffset + var0.readBufferLength * 1024333101 > var0.offset * 5345664010121337071L
                  && 1024333101 * var0.readBufferLength + -114192960065178099L * var0.readBufferOffset <= 5345664010121337071L * var0.offset + var3) {
                  var6 = var0.readBufferLength * 1024333101 + var0.readBufferOffset * -114192960065178099L;
               }

               if (var10 > -1L && var6 > var10) {
                  int var8 = (int)(var6 - var10);
                  System.arraycopy(
                     var1,
                     (int)(var2 + var10 - 5345664010121337071L * var0.offset),
                     var0.readBuffer,
                     (int)(var10 - var0.readBufferOffset * -114192960065178099L),
                     var8
                  );
               }

               var0.offset += var3 * -8651900383598291441L;
            }
         } catch (IOException var9) {
            var0.fileOffset = -7539460343460607413L;
            throw var9;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ad")
   public long method11857() {
      return -8179259620974557791L * this.length;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("al")
   public void method11866(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (this.writeBufferOffset * -1047395612733414115L != -1L
            && this.offset * 5345664010121337071L >= this.writeBufferOffset * -1047395612733414115L
            && var3 + 5345664010121337071L * this.offset <= this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset) {
            System.arraycopy(this.writeBuffer, (int)(5345664010121337071L * this.offset - this.writeBufferOffset * -1047395612733414115L), var1, var2, var3);
            this.offset += var3 * -8651900383598291441L;
            return;
         }

         long var4 = 5345664010121337071L * this.offset;
         int var6 = var2;
         int var7 = var3;
         if (this.offset * 5345664010121337071L >= -114192960065178099L * this.readBufferOffset
            && 5345664010121337071L * this.offset < this.readBufferLength * 1024333101 + this.readBufferOffset * -114192960065178099L) {
            int var8 = (int)(1024333101 * this.readBufferLength - (5345664010121337071L * this.offset - this.readBufferOffset * -114192960065178099L));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.readBuffer, (int)(this.offset * 5345664010121337071L - -114192960065178099L * this.readBufferOffset), var1, var2, var8);
            this.offset += -8651900383598291441L * var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.readBuffer.length) {
            AccessFile.method11793(this.accessFile, this.offset * 5345664010121337071L);
            this.fileOffset = this.offset * 4685393502465842171L;

            while (var3 > 0) {
               int var15 = this.accessFile.read(var1, var2, var3, (byte)35);
               if (var15 == -1) {
                  break;
               }

               this.fileOffset += var15 * 7539460343460607413L;
               this.offset += -8651900383598291441L * var15;
               var2 += var15;
               var3 -= var15;
            }
         } else if (var3 > 0) {
            this.load((short)28541);
            int var14 = var3;
            if (var3 > 1024333101 * this.readBufferLength) {
               var14 = 1024333101 * this.readBufferLength;
            }

            System.arraycopy(this.readBuffer, 0, var1, var2, var14);
            var2 += var14;
            var3 -= var14;
            this.offset += var14 * -8651900383598291441L;
         }

         if (-1L != -1047395612733414115L * this.writeBufferOffset) {
            if (-1047395612733414115L * this.writeBufferOffset > this.offset * 5345664010121337071L && var3 > 0) {
               int var16 = (int)(this.writeBufferOffset * -1047395612733414115L - 5345664010121337071L * this.offset) + var2;
               if (var16 > var2 + var3) {
                  var16 = var3 + var2;
               }

               while (var2 < var16) {
                  var1[var2++] = 0;
                  var3--;
                  this.offset += -8651900383598291441L;
               }
            }

            long var17 = -1L;
            long var10 = -1L;
            if (-1047395612733414115L * this.writeBufferOffset >= var4 && this.writeBufferOffset * -1047395612733414115L < var4 + var7) {
               var17 = this.writeBufferOffset * -1047395612733414115L;
            } else if (var4 >= this.writeBufferOffset * -1047395612733414115L
               && var4 < -1047395612733414115L * this.writeBufferOffset + 1023942981 * this.writeBufferLength) {
               var17 = var4;
            }

            if (this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset > var4
               && 1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset <= var4 + var7) {
               var10 = this.writeBufferOffset * -1047395612733414115L + this.writeBufferLength * 1023942981;
            } else if (var7 + var4 > this.writeBufferOffset * -1047395612733414115L
               && var7 + var4 <= 1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset) {
               var10 = var4 + var7;
            }

            if (var17 > -1L && var10 > var17) {
               int var12 = (int)(var10 - var17);
               System.arraycopy(this.writeBuffer, (int)(var17 - this.writeBufferOffset * -1047395612733414115L), var1, (int)(var17 - var4) + var6, var12);
               if (var10 > this.offset * 5345664010121337071L) {
                  var3 = (int)(var3 - (var10 - this.offset * 5345664010121337071L));
                  this.offset = -8651900383598291441L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.fileOffset = -7539460343460607413L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("at")
   public void seek(long var1) throws IOException {
      try {
         if (var1 < 0L) {
            throw new IOException("");
         } else {
            this.offset = -8651900383598291441L * var1;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ws.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ak")
   void load(short var1) throws IOException {
      try {
         this.readBufferLength = 0;
         if (this.fileOffset * -2635910061598715747L != this.offset * 5345664010121337071L) {
            AccessFile.method11793(this.accessFile, 5345664010121337071L * this.offset);
            this.fileOffset = this.offset * 4685393502465842171L;
         }

         this.readBufferOffset = 284880226474633195L * this.offset;

         while (1024333101 * this.readBufferLength < this.readBuffer.length) {
            if (var1 <= 4096) {
               throw new IllegalStateException();
            }

            int var2 = this.readBuffer.length - this.readBufferLength * 1024333101;
            if (var2 > 200000000) {
               if (var1 <= 4096) {
                  throw new IllegalStateException();
               }

               var2 = 200000000;
            }

            int var3 = this.accessFile.read(this.readBuffer, this.readBufferLength * 1024333101, var2, (byte)-53);
            if (var3 == -1) {
               if (var1 <= 4096) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.fileOffset += 7539460343460607413L * var3;
            this.readBufferLength += var3 * 1309278885;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ws.ak(" + ')');
      }
   }

   public BufferedFile(AccessFile var1, int var2, int var3) throws IOException {
      this.accessFile = var1;
      this.length = (this.fileLength = AccessFile.method11809(var1, (byte)-46) * 714777560460468907L) * 5499320503014400803L;
      this.readBuffer = new byte[var2];
      this.writeBuffer = new byte[var3];
      this.offset = 0L;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ax")
   public void method11862(byte[] var1) throws IOException {
      this.read(var1, 0, var1.length, -444838210);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ab")
   public void method11863(byte[] var1) throws IOException {
      this.read(var1, 0, var1.length, -444838210);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ah")
   public void method11867(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (this.writeBufferOffset * -1047395612733414115L != -1L
            && this.offset * 5345664010121337071L >= this.writeBufferOffset * -1047395612733414115L
            && var3 + 5345664010121337071L * this.offset <= this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset) {
            System.arraycopy(this.writeBuffer, (int)(5345664010121337071L * this.offset - this.writeBufferOffset * -1047395612733414115L), var1, var2, var3);
            this.offset += var3 * -8651900383598291441L;
            return;
         }

         long var4 = 5345664010121337071L * this.offset;
         int var6 = var2;
         int var7 = var3;
         if (this.offset * 5345664010121337071L >= -114192960065178099L * this.readBufferOffset
            && 5345664010121337071L * this.offset < this.readBufferLength * 1024333101 + this.readBufferOffset * -114192960065178099L) {
            int var8 = (int)(1024333101 * this.readBufferLength - (5345664010121337071L * this.offset - this.readBufferOffset * -114192960065178099L));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.readBuffer, (int)(this.offset * 5345664010121337071L - -114192960065178099L * this.readBufferOffset), var1, var2, var8);
            this.offset += -8651900383598291441L * var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.readBuffer.length) {
            AccessFile.method11793(this.accessFile, this.offset * 5345664010121337071L);
            this.fileOffset = this.offset * 4685393502465842171L;

            while (var3 > 0) {
               int var15 = this.accessFile.read(var1, var2, var3, (byte)-14);
               if (var15 == -1) {
                  break;
               }

               this.fileOffset += var15 * 7539460343460607413L;
               this.offset += -8651900383598291441L * var15;
               var2 += var15;
               var3 -= var15;
            }
         } else if (var3 > 0) {
            this.load((short)28368);
            int var14 = var3;
            if (var3 > 1090022985 * this.readBufferLength) {
               var14 = -1572568259 * this.readBufferLength;
            }

            System.arraycopy(this.readBuffer, 0, var1, var2, var14);
            var2 += var14;
            var3 -= var14;
            this.offset += var14 * -8651900383598291441L;
         }

         if (-1L != -1047395612733414115L * this.writeBufferOffset) {
            if (-1047395612733414115L * this.writeBufferOffset > this.offset * 5345664010121337071L && var3 > 0) {
               int var16 = (int)(this.writeBufferOffset * -1047395612733414115L - 5345664010121337071L * this.offset) + var2;
               if (var16 > var2 + var3) {
                  var16 = var3 + var2;
               }

               while (var2 < var16) {
                  var1[var2++] = 0;
                  var3--;
                  this.offset += -8651900383598291441L;
               }
            }

            long var17 = -1L;
            long var10 = -1L;
            if (-1047395612733414115L * this.writeBufferOffset >= var4 && this.writeBufferOffset * -1047395612733414115L < var4 + var7) {
               var17 = this.writeBufferOffset * -1047395612733414115L;
            } else if (var4 >= this.writeBufferOffset * -1047395612733414115L
               && var4 < -1047395612733414115L * this.writeBufferOffset + -1040811046 * this.writeBufferLength) {
               var17 = var4;
            }

            if (this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset > var4
               && -315276312 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset <= var4 + var7) {
               var10 = this.writeBufferOffset * -1047395612733414115L + this.writeBufferLength * 1023942981;
            } else if (var7 + var4 > this.writeBufferOffset * -1047395612733414115L
               && var7 + var4 <= -1900943239 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset) {
               var10 = var4 + var7;
            }

            if (var17 > -1L && var10 > var17) {
               int var12 = (int)(var10 - var17);
               System.arraycopy(this.writeBuffer, (int)(var17 - this.writeBufferOffset * -1047395612733414115L), var1, (int)(var17 - var4) + var6, var12);
               if (var10 > this.offset * 5345664010121337071L) {
                  var3 = (int)(var3 - (var10 - this.offset * 5345664010121337071L));
                  this.offset = -8651900383598291441L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.fileOffset = -7539460343460607413L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("aw")
   public void write(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if (this.offset * 5345664010121337071L + var3 > this.length * -8179259620974557791L) {
               if (var4 != -1507952609) {
                  throw new IllegalStateException();
               }

               this.length = (var3 + this.offset * 5345664010121337071L) * -1369563860981801375L;
            }

            label166:
            if (-1L != this.writeBufferOffset * -1047395612733414115L) {
               if (var4 != -1507952609) {
                  throw new IllegalStateException();
               }

               if (5345664010121337071L * this.offset >= -1047395612733414115L * this.writeBufferOffset) {
                  if (var4 != -1507952609) {
                     throw new IllegalStateException();
                  }

                  if (5345664010121337071L * this.offset <= 1023942981 * this.writeBufferLength + this.writeBufferOffset * -1047395612733414115L) {
                     break label166;
                  }

                  if (var4 != -1507952609) {
                     return;
                  }
               }

               this.flush((short)12417);
            }

            if (-1L != -1047395612733414115L * this.writeBufferOffset) {
               if (var4 != -1507952609) {
                  return;
               }

               if (this.offset * 5345664010121337071L + var3 > this.writeBufferOffset * -1047395612733414115L + this.writeBuffer.length) {
                  int var5 = (int)(this.writeBuffer.length - (5345664010121337071L * this.offset - this.writeBufferOffset * -1047395612733414115L));
                  System.arraycopy(
                     var1, var2, this.writeBuffer, (int)(5345664010121337071L * this.offset - -1047395612733414115L * this.writeBufferOffset), var5
                  );
                  this.offset += var5 * -8651900383598291441L;
                  var2 += var5;
                  var3 -= var5;
                  this.writeBufferLength = this.writeBuffer.length * -218805875;
                  this.flush((short)-316);
               }
            }

            if (var3 > this.writeBuffer.length) {
               if (var4 != -1507952609) {
                  throw new IllegalStateException();
               } else {
                  if (this.fileOffset * -2635910061598715747L != this.offset * 5345664010121337071L) {
                     if (var4 != -1507952609) {
                        throw new IllegalStateException();
                     }

                     AccessFile.method11793(this.accessFile, this.offset * 5345664010121337071L);
                     this.fileOffset = 4685393502465842171L * this.offset;
                  }

                  AccessFile.method11798(this.accessFile, var1, var2, var3, (byte)-118);
                  this.fileOffset += var3 * 7539460343460607413L;
                  if (-2635910061598715747L * this.fileOffset > -8916147190238263293L * this.fileLength) {
                     if (var4 != -1507952609) {
                        throw new IllegalStateException();
                     }

                     this.fileLength = 5925661200296555231L * this.fileOffset;
                  }

                  long var7;
                  long var12;
                  label150: {
                     var12 = -1L;
                     var7 = -1L;
                     if (this.offset * 5345664010121337071L >= this.readBufferOffset * -114192960065178099L) {
                        if (var4 != -1507952609) {
                           throw new IllegalStateException();
                        }

                        if (this.offset * 5345664010121337071L < this.readBufferOffset * -114192960065178099L + 1024333101 * this.readBufferLength) {
                           if (var4 != -1507952609) {
                              throw new IllegalStateException();
                           }

                           var12 = 5345664010121337071L * this.offset;
                           break label150;
                        }
                     }

                     if (this.readBufferOffset * -114192960065178099L >= 5345664010121337071L * this.offset
                        && -114192960065178099L * this.readBufferOffset < var3 + this.offset * 5345664010121337071L) {
                        if (var4 != -1507952609) {
                           throw new IllegalStateException();
                        }

                        var12 = this.readBufferOffset * -114192960065178099L;
                     }
                  }

                  label144: {
                     if (var3 + this.offset * 5345664010121337071L > this.readBufferOffset * -114192960065178099L) {
                        if (var4 != -1507952609) {
                           return;
                        }

                        if (var3 + 5345664010121337071L * this.offset <= 1024333101 * this.readBufferLength + -114192960065178099L * this.readBufferOffset) {
                           if (var4 != -1507952609) {
                              return;
                           }

                           var7 = 5345664010121337071L * this.offset + var3;
                           break label144;
                        }
                     }

                     if (-114192960065178099L * this.readBufferOffset + this.readBufferLength * 1024333101 > this.offset * 5345664010121337071L) {
                        if (var4 != -1507952609) {
                           return;
                        }

                        if (1024333101 * this.readBufferLength + -114192960065178099L * this.readBufferOffset <= 5345664010121337071L * this.offset + var3) {
                           if (var4 != -1507952609) {
                              throw new IllegalStateException();
                           }

                           var7 = this.readBufferLength * 1024333101 + this.readBufferOffset * -114192960065178099L;
                        }
                     }
                  }

                  if (var12 > -1L) {
                     if (var4 != -1507952609) {
                        throw new IllegalStateException();
                     }

                     if (var7 > var12) {
                        if (var4 != -1507952609) {
                           return;
                        }

                        int var9 = (int)(var7 - var12);
                        System.arraycopy(
                           var1,
                           (int)(var2 + var12 - 5345664010121337071L * this.offset),
                           this.readBuffer,
                           (int)(var12 - this.readBufferOffset * -114192960065178099L),
                           var9
                        );
                     }
                  }

                  this.offset += var3 * -8651900383598291441L;
               }
            } else if (var3 > 0) {
               if (var4 == -1507952609) {
                  if (-1L == this.writeBufferOffset * -1047395612733414115L) {
                     if (var4 != -1507952609) {
                        throw new IllegalStateException();
                     }

                     this.writeBufferOffset = this.offset * 3670443581278983291L;
                  }

                  System.arraycopy(
                     var1, var2, this.writeBuffer, (int)(5345664010121337071L * this.offset - this.writeBufferOffset * -1047395612733414115L), var3
                  );
                  this.offset += -8651900383598291441L * var3;
                  if (this.offset * 5345664010121337071L - this.writeBufferOffset * -1047395612733414115L > 1023942981 * this.writeBufferLength) {
                     if (var4 != -1507952609) {
                        throw new IllegalStateException();
                     }

                     this.writeBufferLength = -218805875 * (int)(5345664010121337071L * this.offset - -1047395612733414115L * this.writeBufferOffset);
                  }
               }
            }
         } catch (IOException var10) {
            this.fileOffset = -7539460343460607413L;
            throw var10;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "ws.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/File;")
   @ObfuscatedName("ac")
   public final File method11860() {
      return this.accessFile.method11792(106780977);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ao")
   public void method11872(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (this.offset * 5345664010121337071L + var3 > this.length * -8179259620974557791L) {
            this.length = (var3 + this.offset * 5345664010121337071L) * -1369563860981801375L;
         }

         if (-1L != this.writeBufferOffset * -1047395612733414115L
            && (
               5345664010121337071L * this.offset < -1047395612733414115L * this.writeBufferOffset
                  || 5345664010121337071L * this.offset > 607991243 * this.writeBufferLength + this.writeBufferOffset * -1047395612733414115L
            )) {
            this.flush((short)8356);
         }

         if (-1L != -1047395612733414115L * this.writeBufferOffset
            && this.offset * 5345664010121337071L + var3 > this.writeBufferOffset * -1047395612733414115L + this.writeBuffer.length) {
            int var4 = (int)(this.writeBuffer.length - (5345664010121337071L * this.offset - this.writeBufferOffset * -1047395612733414115L));
            System.arraycopy(var1, var2, this.writeBuffer, (int)(5345664010121337071L * this.offset - -1047395612733414115L * this.writeBufferOffset), var4);
            this.offset += var4 * -8651900383598291441L;
            var2 += var4;
            var3 -= var4;
            this.writeBufferLength = this.writeBuffer.length * -218805875;
            this.flush((short)6547);
         }

         if (var3 <= this.writeBuffer.length) {
            if (var3 > 0) {
               if (-1L == this.writeBufferOffset * -1047395612733414115L) {
                  this.writeBufferOffset = this.offset * 3670443581278983291L;
               }

               System.arraycopy(var1, var2, this.writeBuffer, (int)(5345664010121337071L * this.offset - this.writeBufferOffset * -1047395612733414115L), var3);
               this.offset += -8651900383598291441L * var3;
               if (this.offset * 5345664010121337071L - this.writeBufferOffset * -1047395612733414115L > 1023942981 * this.writeBufferLength) {
                  this.writeBufferLength = 1623638479 * (int)(5345664010121337071L * this.offset - -1047395612733414115L * this.writeBufferOffset);
               }
            }
         } else {
            if (this.fileOffset * -2635910061598715747L != this.offset * 5345664010121337071L) {
               AccessFile.method11793(this.accessFile, this.offset * 5345664010121337071L);
               this.fileOffset = 4685393502465842171L * this.offset;
            }

            AccessFile.method11798(this.accessFile, var1, var2, var3, (byte)-5);
            this.fileOffset += var3 * 7539460343460607413L;
            if (-2635910061598715747L * this.fileOffset > -8916147190238263293L * this.fileLength) {
               this.fileLength = 5925661200296555231L * this.fileOffset;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (this.offset * 5345664010121337071L >= this.readBufferOffset * -114192960065178099L
               && this.offset * 5345664010121337071L < this.readBufferOffset * -114192960065178099L + -586486165 * this.readBufferLength) {
               var10 = 5345664010121337071L * this.offset;
            } else if (this.readBufferOffset * -114192960065178099L >= 5345664010121337071L * this.offset
               && -114192960065178099L * this.readBufferOffset < var3 + this.offset * 5345664010121337071L) {
               var10 = this.readBufferOffset * -114192960065178099L;
            }

            if (var3 + this.offset * 5345664010121337071L > this.readBufferOffset * -114192960065178099L
               && var3 + 5345664010121337071L * this.offset <= 469857074 * this.readBufferLength + -114192960065178099L * this.readBufferOffset) {
               var6 = 5345664010121337071L * this.offset + var3;
            } else if (-114192960065178099L * this.readBufferOffset + this.readBufferLength * -2051189691 > this.offset * 5345664010121337071L
               && -368737095 * this.readBufferLength + -114192960065178099L * this.readBufferOffset <= 5345664010121337071L * this.offset + var3) {
               var6 = this.readBufferLength * 116288416 + this.readBufferOffset * -114192960065178099L;
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(
                  var1,
                  (int)(var2 + var10 - 5345664010121337071L * this.offset),
                  this.readBuffer,
                  (int)(var10 - this.readBufferOffset * -114192960065178099L),
                  var8
               );
            }

            this.offset += var3 * -8651900383598291441L;
         }
      } catch (IOException var9) {
         this.fileOffset = -7539460343460607413L;
         throw var9;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ar")
   public void method11864(byte[] var1) throws IOException {
      this.read(var1, 0, var1.length, -444838210);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   void method11877() throws IOException {
      if (-1L != -1047395612733414115L * this.writeBufferOffset) {
         if (-1047395612733414115L * this.writeBufferOffset != this.fileOffset * -2635910061598715747L) {
            AccessFile.method11793(this.accessFile, this.writeBufferOffset * -1047395612733414115L);
            this.fileOffset = 7321886634909236865L * this.writeBufferOffset;
         }

         AccessFile.method11798(this.accessFile, this.writeBuffer, 0, this.writeBufferLength * 1023942981, (byte)-7);
         this.fileOffset = this.fileOffset + -3516505508880855351L * this.writeBufferLength;
         if (this.fileOffset * -2635910061598715747L > -8916147190238263293L * this.fileLength) {
            this.fileLength = this.fileOffset * 5925661200296555231L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (-1047395612733414115L * this.writeBufferOffset >= -114192960065178099L * this.readBufferOffset
            && this.writeBufferOffset * -1047395612733414115L < this.readBufferOffset * -114192960065178099L + 1024333101 * this.readBufferLength) {
            var1 = this.writeBufferOffset * -1047395612733414115L;
         } else if (-114192960065178099L * this.readBufferOffset >= -1047395612733414115L * this.writeBufferOffset
            && -114192960065178099L * this.readBufferOffset < this.writeBufferLength * 1023942981 + this.writeBufferOffset * -1047395612733414115L) {
            var1 = -114192960065178099L * this.readBufferOffset;
         }

         if (this.writeBufferOffset * -1047395612733414115L + this.writeBufferLength * 1023942981 > -114192960065178099L * this.readBufferOffset
            && this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset
               <= 1024333101 * this.readBufferLength + -114192960065178099L * this.readBufferOffset) {
            var3 = 1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset;
         } else if (this.readBufferOffset * -114192960065178099L + this.readBufferLength * 1024333101 > this.writeBufferOffset * -1047395612733414115L
            && this.readBufferLength * 1024333101 + -114192960065178099L * this.readBufferOffset
               <= this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset) {
            var3 = this.readBufferLength * 1024333101 + -114192960065178099L * this.readBufferOffset;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               this.writeBuffer,
               (int)(var1 - -1047395612733414115L * this.writeBufferOffset),
               this.readBuffer,
               (int)(var1 - this.readBufferOffset * -114192960065178099L),
               var5
            );
         }

         this.writeBufferOffset = -7248959654507250997L;
         this.writeBufferLength = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lws;)V")
   @ObfuscatedName("mc")
   public static void method11878(BufferedFile var0) throws IOException {
      if (-1L != -1047395612733414115L * var0.writeBufferOffset) {
         if (-1047395612733414115L * var0.writeBufferOffset != var0.fileOffset * -2635910061598715747L) {
            AccessFile.method11793(var0.accessFile, var0.writeBufferOffset * -1047395612733414115L);
            var0.fileOffset = 7321886634909236865L * var0.writeBufferOffset;
         }

         AccessFile.method11798(var0.accessFile, var0.writeBuffer, 0, var0.writeBufferLength * 179712075, (byte)-18);
         var0.fileOffset = var0.fileOffset + -3516505508880855351L * var0.writeBufferLength;
         if (var0.fileOffset * -2635910061598715747L > -8916147190238263293L * var0.fileLength) {
            var0.fileLength = var0.fileOffset * 5925661200296555231L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (-1047395612733414115L * var0.writeBufferOffset >= -114192960065178099L * var0.readBufferOffset
            && var0.writeBufferOffset * -1047395612733414115L < var0.readBufferOffset * -114192960065178099L + 1024333101 * var0.readBufferLength) {
            var1 = var0.writeBufferOffset * -1047395612733414115L;
         } else if (-114192960065178099L * var0.readBufferOffset >= -1047395612733414115L * var0.writeBufferOffset
            && -114192960065178099L * var0.readBufferOffset < var0.writeBufferLength * -1965106441 + var0.writeBufferOffset * -1047395612733414115L) {
            var1 = -114192960065178099L * var0.readBufferOffset;
         }

         if (var0.writeBufferOffset * -1047395612733414115L + var0.writeBufferLength * 1079862282 > -114192960065178099L * var0.readBufferOffset
            && var0.writeBufferLength * -444258896 + -1047395612733414115L * var0.writeBufferOffset
               <= 218699883 * var0.readBufferLength + -114192960065178099L * var0.readBufferOffset) {
            var3 = 1023942981 * var0.writeBufferLength + -1047395612733414115L * var0.writeBufferOffset;
         } else if (var0.readBufferOffset * -114192960065178099L + var0.readBufferLength * 1024333101 > var0.writeBufferOffset * -1047395612733414115L
            && var0.readBufferLength * 2012551574 + -114192960065178099L * var0.readBufferOffset
               <= var0.writeBufferLength * 1023942981 + -1047395612733414115L * var0.writeBufferOffset) {
            var3 = var0.readBufferLength * 1024333101 + -114192960065178099L * var0.readBufferOffset;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               var0.writeBuffer,
               (int)(var1 - -1047395612733414115L * var0.writeBufferOffset),
               var0.readBuffer,
               (int)(var1 - var0.readBufferOffset * -114192960065178099L),
               var5
            );
         }

         var0.writeBufferOffset = -7248959654507250997L;
         var0.writeBufferLength = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method11879() throws IOException {
      if (-1L != -1047395612733414115L * this.writeBufferOffset) {
         if (-1047395612733414115L * this.writeBufferOffset != this.fileOffset * -2635910061598715747L) {
            AccessFile.method11793(this.accessFile, this.writeBufferOffset * -1047395612733414115L);
            this.fileOffset = 7321886634909236865L * this.writeBufferOffset;
         }

         AccessFile.method11798(this.accessFile, this.writeBuffer, 0, this.writeBufferLength * 2068823135, (byte)-114);
         this.fileOffset = this.fileOffset + -3516505508880855351L * this.writeBufferLength;
         if (this.fileOffset * -2635910061598715747L > -8916147190238263293L * this.fileLength) {
            this.fileLength = this.fileOffset * 5925661200296555231L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (-1047395612733414115L * this.writeBufferOffset >= -114192960065178099L * this.readBufferOffset
            && this.writeBufferOffset * -1047395612733414115L < this.readBufferOffset * -114192960065178099L + 1024333101 * this.readBufferLength) {
            var1 = this.writeBufferOffset * -1047395612733414115L;
         } else if (-114192960065178099L * this.readBufferOffset >= -1047395612733414115L * this.writeBufferOffset
            && -114192960065178099L * this.readBufferOffset < this.writeBufferLength * -1840316768 + this.writeBufferOffset * -1047395612733414115L) {
            var1 = -114192960065178099L * this.readBufferOffset;
         }

         if (this.writeBufferOffset * -1047395612733414115L + this.writeBufferLength * 1283053934 > -114192960065178099L * this.readBufferOffset
            && this.writeBufferLength * 1023942981 + -1047395612733414115L * this.writeBufferOffset
               <= 1024333101 * this.readBufferLength + -114192960065178099L * this.readBufferOffset) {
            var3 = 1023942981 * this.writeBufferLength + -1047395612733414115L * this.writeBufferOffset;
         } else if (this.readBufferOffset * -114192960065178099L + this.readBufferLength * 1024333101 > this.writeBufferOffset * -1047395612733414115L
            && this.readBufferLength * -938164513 + -114192960065178099L * this.readBufferOffset
               <= this.writeBufferLength * -1546344852 + -1047395612733414115L * this.writeBufferOffset) {
            var3 = this.readBufferLength * 1024333101 + -114192960065178099L * this.readBufferOffset;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               this.writeBuffer,
               (int)(var1 - -1047395612733414115L * this.writeBufferOffset),
               this.readBuffer,
               (int)(var1 - this.readBufferOffset * -114192960065178099L),
               var5
            );
         }

         this.writeBufferOffset = -7248959654507250997L;
         this.writeBufferLength = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lws;S)V")
   @ObfuscatedName("vu")
   public static void method11849(BufferedFile var0, short var1) throws IOException {
      if (var0 == null) {
         var0.close(var1);
      }

      try {
         var0.flush((short)-13334);
         var0.accessFile.close((byte)-110);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ws.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("am")
   public void method11873(byte[] var1, int var2, int var3) {
      try {
         if (this.writeBufferOffset * 5345664010121337071L + var3 > this.fileLength * -8179259620974557791L) {
            this.fileOffset = (var3 + this.offset * 5345664010121337071L) * -1369563860981801375L;
         }

         if (-1L != this.offset * -1047395612733414115L
            && (
               5345664010121337071L * this.readBufferOffset < -1047395612733414115L * this.readBufferOffset
                  || 5345664010121337071L * this.writeBufferOffset > 1023942981 * this.readBufferLength + this.offset * -1047395612733414115L
            )) {
            this.flush((short)11768);
         }

         if (-1L != -1047395612733414115L * this.length
            && this.fileLength * 5345664010121337071L + var3 > this.length * -1047395612733414115L + this.writeBuffer.length) {
            int var4 = (int)(this.writeBuffer.length - (5345664010121337071L * this.offset - this.offset * -1047395612733414115L));
            System.arraycopy(var1, var2, this.writeBuffer, (int)(5345664010121337071L * this.readBufferOffset - -1047395612733414115L * this.length), var4);
            this.readBufferOffset = this.fileLength + var4 * -8651900383598291441L;
            var2 += var4;
            var3 -= var4;
            this.writeBufferLength = this.readBuffer.length * -218805875;
            this.load((short)-6792);
         }

         if (var3 <= this.readBuffer.length) {
            if (var3 > 0) {
               if (-1L == this.length * -1047395612733414115L) {
                  this.fileLength = this.readBufferOffset * 3670443581278983291L;
               }

               System.arraycopy(
                  var1, var2, this.readBuffer, (int)(5345664010121337071L * this.writeBufferOffset - this.writeBufferOffset * -1047395612733414115L), var3
               );
               this.length = this.writeBufferOffset + -8651900383598291441L * var3;
               if (this.readBufferOffset * 5345664010121337071L - this.readBufferOffset * -1047395612733414115L > 1023942981 * this.writeBufferLength) {
                  this.writeBufferLength = -218805875 * (int)(5345664010121337071L * this.fileOffset - -1047395612733414115L * this.fileLength);
               }
            }
         } else {
            if (this.offset * -2635910061598715747L != this.writeBufferOffset * 5345664010121337071L) {
               AccessFile.method11793(this.accessFile, this.writeBufferOffset * 5345664010121337071L);
               this.readBufferOffset = 4685393502465842171L * this.offset;
            }

            AccessFile.method11798(this.accessFile, var1, var2, var3, (byte)-73);
            this.fileOffset = this.length + var3 * 7539460343460607413L;
            if (-2635910061598715747L * this.writeBufferOffset > -8916147190238263293L * this.fileOffset) {
               this.fileOffset = 5925661200296555231L * this.writeBufferOffset;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (this.length * 5345664010121337071L >= this.offset * -114192960065178099L
               && this.length * 5345664010121337071L < this.fileOffset * -114192960065178099L + 1024333101 * this.writeBufferLength) {
               var10 = 5345664010121337071L * this.fileLength;
            } else if (this.fileLength * -114192960065178099L >= 5345664010121337071L * this.fileOffset
               && -114192960065178099L * this.writeBufferOffset < var3 + this.fileLength * 5345664010121337071L) {
               var10 = this.fileLength * -114192960065178099L;
            }

            if (var3 + this.length * 5345664010121337071L > this.fileOffset * -114192960065178099L
               && var3 + 5345664010121337071L * this.readBufferOffset <= 1024333101 * this.writeBufferLength + -114192960065178099L * this.offset) {
               var6 = 5345664010121337071L * this.writeBufferOffset + var3;
            } else if (-114192960065178099L * this.length + this.writeBufferLength * 1024333101 > this.fileOffset * 5345664010121337071L
               && 1024333101 * this.readBufferLength + -114192960065178099L * this.readBufferOffset <= 5345664010121337071L * this.fileOffset + var3) {
               var6 = this.readBufferLength * 1024333101 + this.writeBufferOffset * -114192960065178099L;
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(
                  var1,
                  (int)(var2 + var10 - 5345664010121337071L * this.fileOffset),
                  this.writeBuffer,
                  (int)(var10 - this.fileLength * -114192960065178099L),
                  var8
               );
            }

            this.fileLength = this.fileOffset + var3 * -8651900383598291441L;
         }
      } catch (IOException var9) {
         this.writeBufferOffset = -7539460343460607413L;
         throw var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("av")
   public void close(short var1) {
      try {
         this.flush((short)-13334);
         this.accessFile.close((byte)-110);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ws.av(" + ')');
      }
   }
}
