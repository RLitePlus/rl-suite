import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aac")
public class classAAC {
   @ObfuscatedName("ax")
   long field33;
   @ObfuscatedSignature(descriptor = "Laar;")
   @ObfuscatedName("af")
   classAAR field31;
   @ObfuscatedName("ae")
   byte[] field35;
   @ObfuscatedName("ab")
   long field36 = 6188616650964201105L;
   @ObfuscatedName("ag")
   int field38;
   @ObfuscatedName("as")
   byte[] field34;
   @ObfuscatedName("al")
   long field30;
   @ObfuscatedName("ac")
   int field32;
   @ObfuscatedName("aa")
   long field37;
   @ObfuscatedName("ao")
   long field29;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field39 = 200000000;
   @ObfuscatedName("aj")
   long field40;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laac;)V")
   @ObfuscatedName("ap")
   public static void method158(classAAC var0) throws IOException {
      if (var0 == null) {
         var0.method163();
      } else {
         if (var0.field33 * 695819223253367491L != -1L) {
            if (var0.field33 * 695819223253367491L != var0.field40 * -8875074085580969595L) {
               var0.field31.method241(695819223253367491L * var0.field33);
               var0.field40 = -4565816884240621145L * var0.field33;
            }

            var0.field31.method242(var0.field34, 0, var0.field32 * -1202147915, -921777407);
            var0.field40 = var0.field40 + var0.field32 * 4982648314025189359L;
            if (-8875074085580969595L * var0.field40 > -2811425842963315237L * var0.field29) {
               var0.field29 = 486754378564656159L * var0.field40;
            }

            long var1 = -1L;
            long var3 = -1L;
            if (var0.field33 * 695819223253367491L >= var0.field36 * -682698895895007857L
               && var0.field33 * 695819223253367491L < var0.field38 * 950427542 + -682698895895007857L * var0.field36) {
               var1 = 695819223253367491L * var0.field33;
            } else if (var0.field36 * -682698895895007857L >= var0.field33 * 695819223253367491L
               && -682698895895007857L * var0.field36 < var0.field32 * -387998165 + var0.field33 * 695819223253367491L) {
               var1 = var0.field36 * -682698895895007857L;
            }

            if (var0.field32 * -387998165 + 695819223253367491L * var0.field33 > -682698895895007857L * var0.field36
               && 695819223253367491L * var0.field33 + -387998165 * var0.field32 <= -1605680973 * var0.field38 + -682698895895007857L * var0.field36) {
               var3 = 695819223253367491L * var0.field33 + var0.field32 * -387998165;
            } else if (var0.field36 * -682698895895007857L + var0.field38 * -1605680973 > var0.field33 * 695819223253367491L
               && var0.field36 * -682698895895007857L + var0.field38 * -1605680973 <= 695819223253367491L * var0.field33 + -387998165 * var0.field32) {
               var3 = -682698895895007857L * var0.field36 + -1605680973 * var0.field38;
            }

            if (var1 > -1L && var3 > var1) {
               int var5 = (int)(var3 - var1);
               System.arraycopy(
                  var0.field34, (int)(var1 - 695819223253367491L * var0.field33), var0.field35, (int)(var1 - -682698895895007857L * var0.field36), var5
               );
            }

            var0.field33 = 1077159670856333845L;
            var0.field32 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bx")
   public void method159() throws IOException {
      if (this.field33 * 695819223253367491L != -1L) {
         if (this.field33 * 695819223253367491L != this.field40 * -8875074085580969595L) {
            this.field31.method241(695819223253367491L * this.field33);
            this.field40 = -4565816884240621145L * this.field33;
         }

         this.field31.method242(this.field34, 0, this.field32 * -387998165, -271676411);
         this.field40 = this.field40 + this.field32 * 4982648314025189359L;
         if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
            this.field29 = 486754378564656159L * this.field40;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.field33 * 695819223253367491L >= this.field36 * -682698895895007857L
            && this.field33 * 695819223253367491L < this.field38 * -1605680973 + -682698895895007857L * this.field36) {
            var1 = 695819223253367491L * this.field33;
         } else if (this.field36 * -682698895895007857L >= this.field33 * 695819223253367491L
            && -682698895895007857L * this.field36 < this.field32 * -387998165 + this.field33 * 695819223253367491L) {
            var1 = this.field36 * -682698895895007857L;
         }

         if (this.field32 * -387998165 + 695819223253367491L * this.field33 > -682698895895007857L * this.field36
            && 695819223253367491L * this.field33 + -387998165 * this.field32 <= -1605680973 * this.field38 + -682698895895007857L * this.field36) {
            var3 = 695819223253367491L * this.field33 + this.field32 * -387998165;
         } else if (this.field36 * -682698895895007857L + this.field38 * -1605680973 > this.field33 * 695819223253367491L
            && this.field36 * -682698895895007857L + this.field38 * -1605680973 <= 695819223253367491L * this.field33 + -387998165 * this.field32) {
            var3 = -682698895895007857L * this.field36 + -1605680973 * this.field38;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               this.field34, (int)(var1 - 695819223253367491L * this.field33), this.field35, (int)(var1 - -682698895895007857L * this.field36), var5
            );
         }

         this.field33 = 1077159670856333845L;
         this.field32 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("ae")
   public long method139(int var1) {
      try {
         return -757454725848334387L * this.field30;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aac.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/io/File;")
   @ObfuscatedName("ab")
   public final File method141(int var1) {
      try {
         return classAAR.method235(this.field31, -972347736);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aac.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laac;)V")
   @ObfuscatedName("mu")
   public static void method131(classAAC var0) throws IOException {
      if (var0 == null) {
         var0.method152();
      } else {
         var0.method160(1929640893);
         classAAR.method247(var0.field31, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("ag")
   public void method142(byte[] var1, int var2) throws IOException {
      try {
         method147(this, var1, 0, var1.length, (byte)-49);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "aac.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("ac")
   public void method153(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if (this.field37 * -1515802674131212629L + var3 > this.field30 * -757454725848334387L) {
               if (var4 == -1274996579) {
                  throw new IllegalStateException();
               }

               this.field30 = 636707342016742661L * (var3 + this.field37 * -1515802674131212629L);
            }

            label154:
            if (-1L != 695819223253367491L * this.field33) {
               if (var4 == -1274996579) {
                  throw new IllegalStateException();
               }

               if (-1515802674131212629L * this.field37 >= 695819223253367491L * this.field33) {
                  if (this.field37 * -1515802674131212629L <= 695819223253367491L * this.field33 + -387998165 * this.field32) {
                     break label154;
                  }

                  if (var4 == -1274996579) {
                     throw new IllegalStateException();
                  }
               }

               this.method160(841776084);
            }

            if (695819223253367491L * this.field33 != -1L) {
               if (var4 == -1274996579) {
                  throw new IllegalStateException();
               }

               if (var3 + -1515802674131212629L * this.field37 > this.field34.length + 695819223253367491L * this.field33) {
                  if (var4 == -1274996579) {
                     return;
                  }

                  int var5 = (int)(this.field34.length - (this.field37 * -1515802674131212629L - 695819223253367491L * this.field33));
                  System.arraycopy(var1, var2, this.field34, (int)(this.field37 * -1515802674131212629L - this.field33 * 695819223253367491L), var5);
                  this.field37 += var5 * 6855001617440859139L;
                  var2 += var5;
                  var3 -= var5;
                  this.field32 = this.field34.length * -1933692797;
                  this.method160(1614855081);
               }
            }

            if (var3 > this.field34.length) {
               if (var4 == -1274996579) {
                  throw new IllegalStateException();
               } else {
                  if (this.field37 * -1515802674131212629L != this.field40 * -8875074085580969595L) {
                     this.field31.method241(this.field37 * -1515802674131212629L);
                     this.field40 = this.field37 * 3488955817673977455L;
                  }

                  this.field31.method242(var1, var2, var3, -1603705111);
                  this.field40 += var3 * 193022495361705805L;
                  if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
                     if (var4 == -1274996579) {
                        throw new IllegalStateException();
                     }

                     this.field29 = this.field40 * 486754378564656159L;
                  }

                  long var7;
                  long var12;
                  label139: {
                     var12 = -1L;
                     var7 = -1L;
                     if (-1515802674131212629L * this.field37 >= this.field36 * -682698895895007857L) {
                        if (var4 == -1274996579) {
                           return;
                        }

                        if (this.field37 * -1515802674131212629L < -1605680973 * this.field38 + this.field36 * -682698895895007857L) {
                           if (var4 == -1274996579) {
                              throw new IllegalStateException();
                           }

                           var12 = this.field37 * -1515802674131212629L;
                           break label139;
                        }
                     }

                     if (-682698895895007857L * this.field36 >= this.field37 * -1515802674131212629L
                        && -682698895895007857L * this.field36 < var3 + this.field37 * -1515802674131212629L) {
                        if (var4 == -1274996579) {
                           return;
                        }

                        var12 = this.field36 * -682698895895007857L;
                     }
                  }

                  if (this.field37 * -1515802674131212629L + var3 > this.field36 * -682698895895007857L
                     && -1515802674131212629L * this.field37 + var3 <= -1605680973 * this.field38 + this.field36 * -682698895895007857L) {
                     if (var4 == -1274996579) {
                        throw new IllegalStateException();
                     }

                     var7 = var3 + -1515802674131212629L * this.field37;
                  } else if (-682698895895007857L * this.field36 + this.field38 * -1605680973 > -1515802674131212629L * this.field37) {
                     if (var4 == -1274996579) {
                        throw new IllegalStateException();
                     }

                     if (-682698895895007857L * this.field36 + this.field38 * -1605680973 <= var3 + this.field37 * -1515802674131212629L) {
                        if (var4 == -1274996579) {
                           throw new IllegalStateException();
                        }

                        var7 = this.field36 * -682698895895007857L + this.field38 * -1605680973;
                     }
                  }

                  if (var12 > -1L) {
                     if (var4 == -1274996579) {
                        throw new IllegalStateException();
                     }

                     if (var7 > var12) {
                        if (var4 == -1274996579) {
                           throw new IllegalStateException();
                        }

                        int var9 = (int)(var7 - var12);
                        System.arraycopy(
                           var1,
                           (int)(var2 + var12 - -1515802674131212629L * this.field37),
                           this.field35,
                           (int)(var12 - this.field36 * -682698895895007857L),
                           var9
                        );
                     }
                  }

                  this.field37 += 6855001617440859139L * var3;
               }
            } else if (var3 > 0) {
               if (var4 == -1274996579) {
                  throw new IllegalStateException();
               } else {
                  if (this.field33 * 695819223253367491L == -1L) {
                     if (var4 == -1274996579) {
                        throw new IllegalStateException();
                     }

                     this.field33 = this.field37 * 8824162854156981753L;
                  }

                  System.arraycopy(var1, var2, this.field34, (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33), var3);
                  this.field37 += var3 * 6855001617440859139L;
                  if (-1515802674131212629L * this.field37 - 695819223253367491L * this.field33 > this.field32 * -387998165) {
                     this.field32 = -1933692797 * (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33);
                  }
               }
            }
         } catch (IOException var10) {
            this.field40 = -193022495361705805L;
            throw var10;
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "aac.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lco;)Z")
   @ObfuscatedName("vm")
   public static boolean method149(classCO var0) {
      return var0.field1176.method8179();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   public void method160(int var1) throws IOException {
      try {
         if (this.field33 * 695819223253367491L != -1L) {
            if (var1 <= 213303884) {
               throw new IllegalStateException();
            }

            if (this.field33 * 695819223253367491L != this.field40 * -8875074085580969595L) {
               if (var1 <= 213303884) {
                  throw new IllegalStateException();
               }

               this.field31.method241(695819223253367491L * this.field33);
               this.field40 = -4565816884240621145L * this.field33;
            }

            this.field31.method242(this.field34, 0, this.field32 * -387998165, -1854243139);
            this.field40 = this.field40 + this.field32 * 4982648314025189359L;
            if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
               if (var1 <= 213303884) {
                  throw new IllegalStateException();
               }

               this.field29 = 486754378564656159L * this.field40;
            }

            long var2;
            long var4;
            label90: {
               var2 = -1L;
               var4 = -1L;
               if (this.field33 * 695819223253367491L >= this.field36 * -682698895895007857L) {
                  if (var1 <= 213303884) {
                     return;
                  }

                  if (this.field33 * 695819223253367491L < this.field38 * -1605680973 + -682698895895007857L * this.field36) {
                     if (var1 <= 213303884) {
                        throw new IllegalStateException();
                     }

                     var2 = 695819223253367491L * this.field33;
                     break label90;
                  }
               }

               if (this.field36 * -682698895895007857L >= this.field33 * 695819223253367491L) {
                  if (var1 <= 213303884) {
                     throw new IllegalStateException();
                  }

                  if (-682698895895007857L * this.field36 < this.field32 * -387998165 + this.field33 * 695819223253367491L) {
                     if (var1 <= 213303884) {
                        throw new IllegalStateException();
                     }

                     var2 = this.field36 * -682698895895007857L;
                  }
               }
            }

            label84: {
               if (this.field32 * -387998165 + 695819223253367491L * this.field33 > -682698895895007857L * this.field36) {
                  if (var1 <= 213303884) {
                     return;
                  }

                  if (695819223253367491L * this.field33 + -387998165 * this.field32 <= -1605680973 * this.field38 + -682698895895007857L * this.field36) {
                     var4 = 695819223253367491L * this.field33 + this.field32 * -387998165;
                     break label84;
                  }
               }

               if (this.field36 * -682698895895007857L + this.field38 * -1605680973 > this.field33 * 695819223253367491L
                  && this.field36 * -682698895895007857L + this.field38 * -1605680973 <= 695819223253367491L * this.field33 + -387998165 * this.field32) {
                  if (var1 <= 213303884) {
                     throw new IllegalStateException();
                  }

                  var4 = -682698895895007857L * this.field36 + -1605680973 * this.field38;
               }
            }

            if (var2 > -1L && var4 > var2) {
               if (var1 <= 213303884) {
                  throw new IllegalStateException();
               }

               int var6 = (int)(var4 - var2);
               System.arraycopy(
                  this.field34, (int)(var2 - 695819223253367491L * this.field33), this.field35, (int)(var2 - -682698895895007857L * this.field36), var6
               );
            }

            this.field33 = 1077159670856333845L;
            this.field32 = 0;
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "aac.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("aj")
   public void method135(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field37 = var1 * 6855001617440859139L;
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ap")
   public long method140() {
      return -757454725848334387L * this.field30;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("af")
   public void method136(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field37 = var1 * 6855001617440859139L;
      }
   }

   public classAAC(classAAR var1, int var2, int var3) throws IOException {
      this.field33 = 1077159670856333845L;
      this.field32 = 0;
      this.field31 = var1;
      this.field30 = (this.field29 = var1.method257(-153393736) * -7400481039763575213L) * -6434844604491602873L;
      this.field35 = new byte[var2];
      this.field34 = new byte[var3];
      this.field37 = 0L;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method151(int var1) throws IOException {
      try {
         this.field38 = 0;
         if (-8875074085580969595L * this.field40 != -1515802674131212629L * this.field37) {
            if (var1 != -735750071) {
               throw new IllegalStateException();
            }

            this.field31.method241(this.field37 * -1515802674131212629L);
            this.field40 = this.field37 * 3488955817673977455L;
         }

         this.field36 = this.field37 * -6596923341588799707L;

         while (-1605680973 * this.field38 < this.field35.length) {
            if (var1 != -735750071) {
               throw new IllegalStateException();
            }

            int var2 = this.field35.length - -1605680973 * this.field38;
            if (var2 > 200000000) {
               if (var1 != -735750071) {
                  throw new IllegalStateException();
               }

               var2 = 200000000;
            }

            int var3 = this.field31.method260(this.field35, -1605680973 * this.field38, var2, -1397369950);
            if (-1 == var3) {
               if (var1 != -735750071) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.field40 += 193022495361705805L * var3;
            this.field38 += var3 * -2125894021;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "aac.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ar")
   public void method143(byte[] var1) throws IOException {
      method147(this, var1, 0, var1.length, (byte)46);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ak")
   public void method144(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.field33 * 695819223253367491L
            && -1515802674131212629L * this.field37 >= this.field33 * 695819223253367491L
            && var3 + -1515802674131212629L * this.field37 <= -387998165 * this.field32 + 695819223253367491L * this.field33) {
            System.arraycopy(this.field34, (int)(this.field37 * -1515802674131212629L - 695819223253367491L * this.field33), var1, var2, var3);
            this.field37 += var3 * 6855001617440859139L;
            return;
         }

         long var4 = this.field37 * -1515802674131212629L;
         int var6 = var2;
         int var7 = var3;
         if (-1515802674131212629L * this.field37 >= this.field36 * -682698895895007857L
            && this.field37 * -1515802674131212629L < this.field38 * -1605680973 + this.field36 * -682698895895007857L) {
            int var8 = (int)(this.field38 * -1605680973 - (-1515802674131212629L * this.field37 - -682698895895007857L * this.field36));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field35, (int)(this.field37 * -1515802674131212629L - this.field36 * -682698895895007857L), var1, var2, var8);
            this.field37 += 6855001617440859139L * var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.field35.length) {
            this.field31.method241(-1515802674131212629L * this.field37);
            this.field40 = this.field37 * 3488955817673977455L;

            while (var3 > 0) {
               int var15 = this.field31.method260(var1, var2, var3, -1397369950);
               if (var15 == -1) {
                  break;
               }

               this.field40 += var15 * 193022495361705805L;
               this.field37 += var15 * 6855001617440859139L;
               var2 += var15;
               var3 -= var15;
            }
         } else if (var3 > 0) {
            this.method151(-735750071);
            int var14 = var3;
            if (var3 > this.field38 * -1605680973) {
               var14 = -1605680973 * this.field38;
            }

            System.arraycopy(this.field35, 0, var1, var2, var14);
            var2 += var14;
            var3 -= var14;
            this.field37 += var14 * 6855001617440859139L;
         }

         if (-1L != 695819223253367491L * this.field33) {
            if (695819223253367491L * this.field33 > this.field37 * -1515802674131212629L && var3 > 0) {
               int var16 = var2 + (int)(this.field33 * 695819223253367491L - -1515802674131212629L * this.field37);
               if (var16 > var2 + var3) {
                  var16 = var2 + var3;
               }

               while (var2 < var16) {
                  var1[var2++] = 0;
                  var3--;
                  this.field37 += 6855001617440859139L;
               }
            }

            long var17 = -1L;
            long var10 = -1L;
            if (695819223253367491L * this.field33 >= var4 && 695819223253367491L * this.field33 < var4 + var7) {
               var17 = 695819223253367491L * this.field33;
            } else if (var4 >= 695819223253367491L * this.field33 && var4 < 695819223253367491L * this.field33 + -387998165 * this.field32) {
               var17 = var4;
            }

            if (695819223253367491L * this.field33 + -387998165 * this.field32 > var4
               && this.field32 * -387998165 + this.field33 * 695819223253367491L <= var4 + var7) {
               var10 = 695819223253367491L * this.field33 + -387998165 * this.field32;
            } else if (var4 + var7 > 695819223253367491L * this.field33 && var4 + var7 <= this.field32 * -387998165 + 695819223253367491L * this.field33) {
               var10 = var7 + var4;
            }

            if (var17 > -1L && var10 > var17) {
               int var12 = (int)(var10 - var17);
               System.arraycopy(this.field34, (int)(var17 - 695819223253367491L * this.field33), var1, (int)(var17 - var4) + var6, var12);
               if (var10 > -1515802674131212629L * this.field37) {
                  var3 = (int)(var3 - (var10 - this.field37 * -1515802674131212629L));
                  this.field37 = 6855001617440859139L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.field40 = -193022495361705805L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("av")
   public void method145(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.field33 * 695819223253367491L
            && -1515802674131212629L * this.field37 >= this.field33 * 695819223253367491L
            && var3 + -1515802674131212629L * this.field37 <= 1398099834 * this.field32 + 695819223253367491L * this.field33) {
            System.arraycopy(this.field34, (int)(this.field37 * -1515802674131212629L - 695819223253367491L * this.field33), var1, var2, var3);
            this.field37 += var3 * 6855001617440859139L;
            return;
         }

         long var4 = this.field37 * -1515802674131212629L;
         int var6 = var2;
         int var7 = var3;
         if (-1515802674131212629L * this.field37 >= this.field36 * -682698895895007857L
            && this.field37 * -1515802674131212629L < this.field38 * -1605680973 + this.field36 * -682698895895007857L) {
            int var8 = (int)(this.field38 * 867867434 - (-1515802674131212629L * this.field37 - -682698895895007857L * this.field36));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field35, (int)(this.field37 * -1515802674131212629L - this.field36 * -682698895895007857L), var1, var2, var8);
            this.field37 += 6855001617440859139L * var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.field35.length) {
            this.field31.method241(-1515802674131212629L * this.field37);
            this.field40 = this.field37 * 3488955817673977455L;

            while (var3 > 0) {
               int var15 = this.field31.method260(var1, var2, var3, -1397369950);
               if (var15 == -1) {
                  break;
               }

               this.field40 += var15 * 193022495361705805L;
               this.field37 += var15 * 6855001617440859139L;
               var2 += var15;
               var3 -= var15;
            }
         } else if (var3 > 0) {
            this.method151(-735750071);
            int var14 = var3;
            if (var3 > this.field38 * -1169010076) {
               var14 = -2095912115 * this.field38;
            }

            System.arraycopy(this.field35, 0, var1, var2, var14);
            var2 += var14;
            var3 -= var14;
            this.field37 += var14 * 6855001617440859139L;
         }

         if (-1L != 695819223253367491L * this.field33) {
            if (695819223253367491L * this.field33 > this.field37 * -1515802674131212629L && var3 > 0) {
               int var16 = var2 + (int)(this.field33 * 695819223253367491L - -1515802674131212629L * this.field37);
               if (var16 > var2 + var3) {
                  var16 = var2 + var3;
               }

               while (var2 < var16) {
                  var1[var2++] = 0;
                  var3--;
                  this.field37 += 6855001617440859139L;
               }
            }

            long var17 = -1L;
            long var10 = -1L;
            if (695819223253367491L * this.field33 >= var4 && 695819223253367491L * this.field33 < var4 + var7) {
               var17 = 695819223253367491L * this.field33;
            } else if (var4 >= 695819223253367491L * this.field33 && var4 < 695819223253367491L * this.field33 + 1849820891 * this.field32) {
               var17 = var4;
            }

            if (695819223253367491L * this.field33 + -387998165 * this.field32 > var4
               && this.field32 * -1354206747 + this.field33 * 695819223253367491L <= var4 + var7) {
               var10 = 695819223253367491L * this.field33 + -1574569040 * this.field32;
            } else if (var4 + var7 > 695819223253367491L * this.field33 && var4 + var7 <= this.field32 * -567800357 + 695819223253367491L * this.field33) {
               var10 = var7 + var4;
            }

            if (var17 > -1L && var10 > var17) {
               int var12 = (int)(var10 - var17);
               System.arraycopy(this.field34, (int)(var17 - 695819223253367491L * this.field33), var1, (int)(var17 - var4) + var6, var12);
               if (var10 > -1515802674131212629L * this.field37) {
                  var3 = (int)(var3 - (var10 - this.field37 * -1515802674131212629L));
                  this.field37 = 6855001617440859139L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.field40 = -193022495361705805L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   void method152() throws IOException {
      this.field38 = 0;
      if (-8875074085580969595L * this.field40 != -1515802674131212629L * this.field37) {
         this.field31.method241(this.field37 * -1515802674131212629L);
         this.field40 = this.field37 * 3488955817673977455L;
      }

      this.field36 = this.field37 * -6596923341588799707L;

      while (565438758 * this.field38 < this.field35.length) {
         int var1 = this.field35.length - -1605680973 * this.field38;
         if (var1 > 200000000) {
            var1 = -927546808;
         }

         int var2 = this.field31.method260(this.field35, -1605680973 * this.field38, var1, -1397369950);
         if (-1 == var2) {
            break;
         }

         this.field40 += 193022495361705805L * var2;
         this.field38 += var2 * 2051343584;
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("an")
   public void method154(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (this.field37 * -1515802674131212629L + var3 > this.field30 * -757454725848334387L) {
            this.field30 = 636707342016742661L * (var3 + this.field37 * -1515802674131212629L);
         }

         if (-1L != 695819223253367491L * this.field33
            && (
               -1515802674131212629L * this.field37 < 695819223253367491L * this.field33
                  || this.field37 * -1515802674131212629L > 695819223253367491L * this.field33 + -387998165 * this.field32
            )) {
            this.method160(1911247633);
         }

         if (695819223253367491L * this.field33 != -1L
            && var3 + -1515802674131212629L * this.field37 > this.field34.length + 695819223253367491L * this.field33) {
            int var4 = (int)(this.field34.length - (this.field37 * -1515802674131212629L - 695819223253367491L * this.field33));
            System.arraycopy(var1, var2, this.field34, (int)(this.field37 * -1515802674131212629L - this.field33 * 695819223253367491L), var4);
            this.field37 += var4 * 6855001617440859139L;
            var2 += var4;
            var3 -= var4;
            this.field32 = this.field34.length * -1933692797;
            this.method160(305151795);
         }

         if (var3 <= this.field34.length) {
            if (var3 > 0) {
               if (this.field33 * 695819223253367491L == -1L) {
                  this.field33 = this.field37 * 8824162854156981753L;
               }

               System.arraycopy(var1, var2, this.field34, (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33), var3);
               this.field37 += var3 * 6855001617440859139L;
               if (-1515802674131212629L * this.field37 - 695819223253367491L * this.field33 > this.field32 * -387998165) {
                  this.field32 = -1933692797 * (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33);
               }
            }
         } else {
            if (this.field37 * -1515802674131212629L != this.field40 * -8875074085580969595L) {
               this.field31.method241(this.field37 * -1515802674131212629L);
               this.field40 = this.field37 * 3488955817673977455L;
            }

            this.field31.method242(var1, var2, var3, -2046166188);
            this.field40 += var3 * 193022495361705805L;
            if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
               this.field29 = this.field40 * 486754378564656159L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (-1515802674131212629L * this.field37 >= this.field36 * -682698895895007857L
               && this.field37 * -1515802674131212629L < -1605680973 * this.field38 + this.field36 * -682698895895007857L) {
               var10 = this.field37 * -1515802674131212629L;
            } else if (-682698895895007857L * this.field36 >= this.field37 * -1515802674131212629L
               && -682698895895007857L * this.field36 < var3 + this.field37 * -1515802674131212629L) {
               var10 = this.field36 * -682698895895007857L;
            }

            if (this.field37 * -1515802674131212629L + var3 > this.field36 * -682698895895007857L
               && -1515802674131212629L * this.field37 + var3 <= -1605680973 * this.field38 + this.field36 * -682698895895007857L) {
               var6 = var3 + -1515802674131212629L * this.field37;
            } else if (-682698895895007857L * this.field36 + this.field38 * -1605680973 > -1515802674131212629L * this.field37
               && -682698895895007857L * this.field36 + this.field38 * -1605680973 <= var3 + this.field37 * -1515802674131212629L) {
               var6 = this.field36 * -682698895895007857L + this.field38 * -1605680973;
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(
                  var1, (int)(var2 + var10 - -1515802674131212629L * this.field37), this.field35, (int)(var10 - this.field36 * -682698895895007857L), var8
               );
            }

            this.field37 += 6855001617440859139L * var3;
         }
      } catch (IOException var9) {
         this.field40 = -193022495361705805L;
         throw var9;
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("am")
   public void method155(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (this.field37 * -1515802674131212629L + var3 > this.field30 * -757454725848334387L) {
            this.field30 = 636707342016742661L * (var3 + this.field37 * -1515802674131212629L);
         }

         if (-1L != 695819223253367491L * this.field33
            && (
               -1515802674131212629L * this.field37 < 695819223253367491L * this.field33
                  || this.field37 * -1515802674131212629L > 695819223253367491L * this.field33 + -387998165 * this.field32
            )) {
            this.method160(809402310);
         }

         if (695819223253367491L * this.field33 != -1L
            && var3 + -1515802674131212629L * this.field37 > this.field34.length + 695819223253367491L * this.field33) {
            int var4 = (int)(this.field34.length - (this.field37 * -1515802674131212629L - 695819223253367491L * this.field33));
            System.arraycopy(var1, var2, this.field34, (int)(this.field37 * -1515802674131212629L - this.field33 * 695819223253367491L), var4);
            this.field37 += var4 * 6855001617440859139L;
            var2 += var4;
            var3 -= var4;
            this.field32 = this.field34.length * -1933692797;
            this.method160(665251507);
         }

         if (var3 <= this.field34.length) {
            if (var3 > 0) {
               if (this.field33 * 695819223253367491L == -1L) {
                  this.field33 = this.field37 * 8824162854156981753L;
               }

               System.arraycopy(var1, var2, this.field34, (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33), var3);
               this.field37 += var3 * 6855001617440859139L;
               if (-1515802674131212629L * this.field37 - 695819223253367491L * this.field33 > this.field32 * -387998165) {
                  this.field32 = -1933692797 * (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33);
               }
            }
         } else {
            if (this.field37 * -1515802674131212629L != this.field40 * -8875074085580969595L) {
               this.field31.method241(this.field37 * -1515802674131212629L);
               this.field40 = this.field37 * 3488955817673977455L;
            }

            this.field31.method242(var1, var2, var3, -2117736311);
            this.field40 += var3 * 193022495361705805L;
            if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
               this.field29 = this.field40 * 486754378564656159L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (-1515802674131212629L * this.field37 >= this.field36 * -682698895895007857L
               && this.field37 * -1515802674131212629L < -617809927 * this.field38 + this.field36 * -682698895895007857L) {
               var10 = this.field37 * -1515802674131212629L;
            } else if (-682698895895007857L * this.field36 >= this.field37 * -1515802674131212629L
               && -682698895895007857L * this.field36 < var3 + this.field37 * -1515802674131212629L) {
               var10 = this.field36 * -682698895895007857L;
            }

            if (this.field37 * -1515802674131212629L + var3 > this.field36 * -682698895895007857L
               && -1515802674131212629L * this.field37 + var3 <= -1605680973 * this.field38 + this.field36 * -682698895895007857L) {
               var6 = var3 + -1515802674131212629L * this.field37;
            } else if (-682698895895007857L * this.field36 + this.field38 * -1605680973 > -1515802674131212629L * this.field37
               && -682698895895007857L * this.field36 + this.field38 * -1605680973 <= var3 + this.field37 * -1515802674131212629L) {
               var6 = this.field36 * -682698895895007857L + this.field38 * -858572660;
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(
                  var1, (int)(var2 + var10 - -1515802674131212629L * this.field37), this.field35, (int)(var10 - this.field36 * -682698895895007857L), var8
               );
            }

            this.field37 += 6855001617440859139L * var3;
         }
      } catch (IOException var9) {
         this.field40 = -193022495361705805L;
         throw var9;
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ah")
   public void method156(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (this.field37 * -1515802674131212629L + var3 > this.field30 * -757454725848334387L) {
            this.field30 = 636707342016742661L * (var3 + this.field37 * -1515802674131212629L);
         }

         if (-1L != 695819223253367491L * this.field33
            && (
               -1515802674131212629L * this.field37 < 695819223253367491L * this.field33
                  || this.field37 * -1515802674131212629L > 695819223253367491L * this.field33 + 1666473781 * this.field32
            )) {
            this.method160(966247498);
         }

         if (695819223253367491L * this.field33 != -1L
            && var3 + -1515802674131212629L * this.field37 > this.field34.length + 695819223253367491L * this.field33) {
            int var4 = (int)(this.field34.length - (this.field37 * -1515802674131212629L - 695819223253367491L * this.field33));
            System.arraycopy(var1, var2, this.field34, (int)(this.field37 * -1515802674131212629L - this.field33 * 695819223253367491L), var4);
            this.field37 += var4 * 6855001617440859139L;
            var2 += var4;
            var3 -= var4;
            this.field32 = this.field34.length * -476345317;
            this.method160(686860026);
         }

         if (var3 <= this.field34.length) {
            if (var3 > 0) {
               if (this.field33 * 695819223253367491L == -1L) {
                  this.field33 = this.field37 * 8824162854156981753L;
               }

               System.arraycopy(var1, var2, this.field34, (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33), var3);
               this.field37 += var3 * 6855001617440859139L;
               if (-1515802674131212629L * this.field37 - 695819223253367491L * this.field33 > this.field32 * -387998165) {
                  this.field32 = -1933692797 * (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33);
               }
            }
         } else {
            if (this.field37 * -1515802674131212629L != this.field40 * -8875074085580969595L) {
               this.field31.method241(this.field37 * -1515802674131212629L);
               this.field40 = this.field37 * 3488955817673977455L;
            }

            this.field31.method242(var1, var2, var3, -2092829441);
            this.field40 += var3 * 193022495361705805L;
            if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
               this.field29 = this.field40 * 486754378564656159L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (-1515802674131212629L * this.field37 >= this.field36 * -682698895895007857L
               && this.field37 * -1515802674131212629L < -1605680973 * this.field38 + this.field36 * -682698895895007857L) {
               var10 = this.field37 * -1515802674131212629L;
            } else if (-682698895895007857L * this.field36 >= this.field37 * -1515802674131212629L
               && -682698895895007857L * this.field36 < var3 + this.field37 * -1515802674131212629L) {
               var10 = this.field36 * -682698895895007857L;
            }

            if (this.field37 * -1515802674131212629L + var3 > this.field36 * -682698895895007857L
               && -1515802674131212629L * this.field37 + var3 <= -1605680973 * this.field38 + this.field36 * -682698895895007857L) {
               var6 = var3 + -1515802674131212629L * this.field37;
            } else if (-682698895895007857L * this.field36 + this.field38 * -31256847 > -1515802674131212629L * this.field37
               && -682698895895007857L * this.field36 + this.field38 * 528004534 <= var3 + this.field37 * -1515802674131212629L) {
               var6 = this.field36 * -682698895895007857L + this.field38 * -1605680973;
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(
                  var1, (int)(var2 + var10 - -1515802674131212629L * this.field37), this.field35, (int)(var10 - this.field36 * -682698895895007857L), var8
               );
            }

            this.field37 += 6855001617440859139L * var3;
         }
      } catch (IOException var9) {
         this.field40 = -193022495361705805L;
         throw var9;
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("aq")
   public void method137(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field37 = var1 * 6855001617440859139L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   public void method161() throws IOException {
      if (this.field33 * 695819223253367491L != -1L) {
         if (this.field33 * 695819223253367491L != this.field40 * -8875074085580969595L) {
            this.field31.method241(695819223253367491L * this.field33);
            this.field40 = -4565816884240621145L * this.field33;
         }

         this.field31.method242(this.field34, 0, this.field32 * 601124288, -1663441737);
         this.field40 = this.field40 + this.field32 * 4982648314025189359L;
         if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
            this.field29 = 486754378564656159L * this.field40;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.field33 * 695819223253367491L >= this.field36 * -682698895895007857L
            && this.field33 * 695819223253367491L < this.field38 * -1605680973 + -682698895895007857L * this.field36) {
            var1 = 695819223253367491L * this.field33;
         } else if (this.field36 * -682698895895007857L >= this.field33 * 695819223253367491L
            && -682698895895007857L * this.field36 < this.field32 * -387998165 + this.field33 * 695819223253367491L) {
            var1 = this.field36 * -682698895895007857L;
         }

         if (this.field32 * -1977175693 + 695819223253367491L * this.field33 > -682698895895007857L * this.field36
            && 695819223253367491L * this.field33 + -387998165 * this.field32 <= -1605680973 * this.field38 + -682698895895007857L * this.field36) {
            var3 = 695819223253367491L * this.field33 + this.field32 * -817915072;
         } else if (this.field36 * -682698895895007857L + this.field38 * -1605680973 > this.field33 * 695819223253367491L
            && this.field36 * -682698895895007857L + this.field38 * 786667928 <= 695819223253367491L * this.field33 + -1830106391 * this.field32) {
            var3 = -682698895895007857L * this.field36 + -1605680973 * this.field38;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               this.field34, (int)(var1 - 695819223253367491L * this.field33), this.field35, (int)(var1 - -682698895895007857L * this.field36), var5
            );
         }

         this.field33 = 1077159670856333845L;
         this.field32 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ay")
   public void method138(long var1) throws IOException {
      try {
         if (var1 < 0L) {
            throw new IOException("");
         } else {
            this.field37 = var1 * 6855001617440859139L;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "aac.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laac;[BII)V")
   @ObfuscatedName("np")
   public static void method146(classAAC var0, byte[] var1, int var2, int var3) throws IOException {
      if (var0 == null) {
         var0.method140();
      }

      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != var0.field33 * 695819223253367491L
            && -1515802674131212629L * var0.field37 >= var0.field33 * 695819223253367491L
            && var3 + -1515802674131212629L * var0.field37 <= -387998165 * var0.field32 + 695819223253367491L * var0.field33) {
            System.arraycopy(var0.field34, (int)(var0.field37 * -1515802674131212629L - 695819223253367491L * var0.field33), var1, var2, var3);
            var0.field37 += var3 * 6855001617440859139L;
            return;
         }

         long var4 = var0.field37 * -1515802674131212629L;
         int var6 = var2;
         int var7 = var3;
         if (-1515802674131212629L * var0.field37 >= var0.field36 * -682698895895007857L
            && var0.field37 * -1515802674131212629L < var0.field38 * -1605680973 + var0.field36 * -682698895895007857L) {
            int var8 = (int)(var0.field38 * -1605680973 - (-1515802674131212629L * var0.field37 - -682698895895007857L * var0.field36));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(var0.field35, (int)(var0.field37 * -1515802674131212629L - var0.field36 * -682698895895007857L), var1, var2, var8);
            var0.field37 += 6855001617440859139L * var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > var0.field35.length) {
            var0.field31.method241(-1515802674131212629L * var0.field37);
            var0.field40 = var0.field37 * 3488955817673977455L;

            while (var3 > 0) {
               int var15 = var0.field31.method260(var1, var2, var3, -1397369950);
               if (var15 == -1) {
                  break;
               }

               var0.field40 += var15 * 193022495361705805L;
               var0.field37 += var15 * 6855001617440859139L;
               var2 += var15;
               var3 -= var15;
            }
         } else if (var3 > 0) {
            var0.method151(-735750071);
            int var14 = var3;
            if (var3 > var0.field38 * -1605680973) {
               var14 = -1605680973 * var0.field38;
            }

            System.arraycopy(var0.field35, 0, var1, var2, var14);
            var2 += var14;
            var3 -= var14;
            var0.field37 += var14 * 6855001617440859139L;
         }

         if (-1L != 695819223253367491L * var0.field33) {
            if (695819223253367491L * var0.field33 > var0.field37 * -1515802674131212629L && var3 > 0) {
               int var16 = var2 + (int)(var0.field33 * 695819223253367491L - -1515802674131212629L * var0.field37);
               if (var16 > var2 + var3) {
                  var16 = var2 + var3;
               }

               while (var2 < var16) {
                  var1[var2++] = 0;
                  var3--;
                  var0.field37 += 6855001617440859139L;
               }
            }

            long var17 = -1L;
            long var10 = -1L;
            if (695819223253367491L * var0.field33 >= var4 && 695819223253367491L * var0.field33 < var4 + var7) {
               var17 = 695819223253367491L * var0.field33;
            } else if (var4 >= 695819223253367491L * var0.field33 && var4 < 695819223253367491L * var0.field33 + -387998165 * var0.field32) {
               var17 = var4;
            }

            if (695819223253367491L * var0.field33 + -387998165 * var0.field32 > var4
               && var0.field32 * -387998165 + var0.field33 * 695819223253367491L <= var4 + var7) {
               var10 = 695819223253367491L * var0.field33 + -387998165 * var0.field32;
            } else if (var4 + var7 > 695819223253367491L * var0.field33 && var4 + var7 <= var0.field32 * -387998165 + 695819223253367491L * var0.field33) {
               var10 = var7 + var4;
            }

            if (var17 > -1L && var10 > var17) {
               int var12 = (int)(var10 - var17);
               System.arraycopy(var0.field34, (int)(var17 - 695819223253367491L * var0.field33), var1, (int)(var17 - var4) + var6, var12);
               if (var10 > -1515802674131212629L * var0.field37) {
                  var3 = (int)(var3 - (var10 - var0.field37 * -1515802674131212629L));
                  var0.field37 = 6855001617440859139L * var10;
               }
            }
         }
      } catch (IOException var13) {
         var0.field40 = -193022495361705805L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Laac;[BIIB)V")
   @ObfuscatedName("rs")
   public static void method147(classAAC var0, byte[] var1, int var2, int var3, byte var4) throws IOException {
      if (var0 == null) {
         var0.method148(var1, var2, var2, var4);
      } else {
         try {
            try {
               if (var3 + var2 > var1.length) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
               }

               if (-1L != var0.field33 * 695819223253367491L && -1515802674131212629L * var0.field37 >= var0.field33 * 695819223253367491L) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  if (var3 + -1515802674131212629L * var0.field37 <= -387998165 * var0.field32 + 695819223253367491L * var0.field33) {
                     if (var4 == 15) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(var0.field34, (int)(var0.field37 * -1515802674131212629L - 695819223253367491L * var0.field33), var1, var2, var3);
                     var0.field37 += var3 * 6855001617440859139L;
                     return;
                  }
               }

               long var5 = var0.field37 * -1515802674131212629L;
               int var7 = var2;
               int var8 = var3;
               if (-1515802674131212629L * var0.field37 >= var0.field36 * -682698895895007857L) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  if (var0.field37 * -1515802674131212629L < var0.field38 * -1605680973 + var0.field36 * -682698895895007857L) {
                     if (var4 == 15) {
                        throw new IllegalStateException();
                     }

                     int var9 = (int)(var0.field38 * -1605680973 - (-1515802674131212629L * var0.field37 - -682698895895007857L * var0.field36));
                     if (var9 > var3) {
                        var9 = var3;
                     }

                     System.arraycopy(var0.field35, (int)(var0.field37 * -1515802674131212629L - var0.field36 * -682698895895007857L), var1, var2, var9);
                     var0.field37 += 6855001617440859139L * var9;
                     var2 += var9;
                     var3 -= var9;
                  }
               }

               if (var3 > var0.field35.length) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  var0.field31.method241(-1515802674131212629L * var0.field37);
                  var0.field40 = var0.field37 * 3488955817673977455L;

                  while (var3 > 0) {
                     int var17 = var0.field31.method260(var1, var2, var3, -1397369950);
                     if (var17 == -1) {
                        break;
                     }

                     var0.field40 += var17 * 193022495361705805L;
                     var0.field37 += var17 * 6855001617440859139L;
                     var2 += var17;
                     var3 -= var17;
                  }
               } else if (var3 > 0) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  var0.method151(-735750071);
                  int var16 = var3;
                  if (var3 > var0.field38 * -1605680973) {
                     if (var4 == 15) {
                        throw new IllegalStateException();
                     }

                     var16 = -1605680973 * var0.field38;
                  }

                  System.arraycopy(var0.field35, 0, var1, var2, var16);
                  var2 += var16;
                  var3 -= var16;
                  var0.field37 += var16 * 6855001617440859139L;
               }

               if (-1L != 695819223253367491L * var0.field33) {
                  if (695819223253367491L * var0.field33 > var0.field37 * -1515802674131212629L) {
                     if (var4 == 15) {
                        return;
                     }

                     if (var3 > 0) {
                        if (var4 == 15) {
                           return;
                        }

                        int var18 = var2 + (int)(var0.field33 * 695819223253367491L - -1515802674131212629L * var0.field37);
                        if (var18 > var2 + var3) {
                           if (var4 == 15) {
                              throw new IllegalStateException();
                           }

                           var18 = var2 + var3;
                        }

                        while (var2 < var18) {
                           if (var4 == 15) {
                              throw new IllegalStateException();
                           }

                           var1[var2++] = 0;
                           var3--;
                           var0.field37 += 6855001617440859139L;
                        }
                     }
                  }

                  long var11;
                  long var19;
                  label168: {
                     var19 = -1L;
                     var11 = -1L;
                     if (695819223253367491L * var0.field33 >= var5) {
                        if (var4 == 15) {
                           throw new IllegalStateException();
                        }

                        if (695819223253367491L * var0.field33 < var5 + var8) {
                           if (var4 == 15) {
                              throw new IllegalStateException();
                           }

                           var19 = 695819223253367491L * var0.field33;
                           break label168;
                        }
                     }

                     if (var5 >= 695819223253367491L * var0.field33) {
                        if (var4 == 15) {
                           return;
                        }

                        if (var5 < 695819223253367491L * var0.field33 + -387998165 * var0.field32) {
                           var19 = var5;
                        }
                     }
                  }

                  if (695819223253367491L * var0.field33 + -387998165 * var0.field32 > var5
                     && var0.field32 * -387998165 + var0.field33 * 695819223253367491L <= var5 + var8) {
                     var11 = 695819223253367491L * var0.field33 + -387998165 * var0.field32;
                  } else if (var5 + var8 > 695819223253367491L * var0.field33) {
                     if (var4 == 15) {
                        throw new IllegalStateException();
                     }

                     if (var5 + var8 <= var0.field32 * -387998165 + 695819223253367491L * var0.field33) {
                        if (var4 == 15) {
                           throw new IllegalStateException();
                        }

                        var11 = var8 + var5;
                     }
                  }

                  if (var19 > -1L && var11 > var19) {
                     if (var4 == 15) {
                        throw new IllegalStateException();
                     }

                     int var13 = (int)(var11 - var19);
                     System.arraycopy(var0.field34, (int)(var19 - 695819223253367491L * var0.field33), var1, (int)(var19 - var5) + var7, var13);
                     if (var11 > -1515802674131212629L * var0.field37) {
                        if (var4 == 15) {
                           throw new IllegalStateException();
                        }

                        var3 = (int)(var3 - (var11 - var0.field37 * -1515802674131212629L));
                        var0.field37 = 6855001617440859139L * var11;
                     }
                  }
               }
            } catch (IOException var14) {
               var0.field40 = -193022495361705805L;
               throw var14;
            }

            if (var3 > 0) {
               if (var4 == 15) {
                  throw new IllegalStateException();
               } else {
                  throw new EOFException();
               }
            }
         } catch (RuntimeException var15) {
            throw classEG.newRunException(var15, "aac.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Laac;I)V")
   @ObfuscatedName("zk")
   public static void method132(classAAC var0, int var1) throws IOException {
      if (var0 == null) {
         var0.method134(var1);
      } else {
         try {
            var0.method160(1319123085);
            classAAR.method247(var0.field31, (byte)1);
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "aac.az(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)I")
   @ObfuscatedName("by")
   public static int method150(classPV var0) {
      if (var0 == null) {
         var0.method9264();
      }

      return var0.field5427 * 1236436392;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   public void method162() throws IOException {
      if (this.field33 * 695819223253367491L != -1L) {
         if (this.field33 * 695819223253367491L != this.field40 * -8875074085580969595L) {
            this.field31.method241(695819223253367491L * this.field33);
            this.field40 = -4565816884240621145L * this.field33;
         }

         this.field31.method242(this.field34, 0, this.field32 * -1836664147, -907626);
         this.field40 = this.field40 + this.field32 * 4982648314025189359L;
         if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
            this.field29 = 486754378564656159L * this.field40;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.field33 * 695819223253367491L >= this.field36 * -682698895895007857L
            && this.field33 * 695819223253367491L < this.field38 * 506078364 + -682698895895007857L * this.field36) {
            var1 = 695819223253367491L * this.field33;
         } else if (this.field36 * -682698895895007857L >= this.field33 * 695819223253367491L
            && -682698895895007857L * this.field36 < this.field32 * 156633896 + this.field33 * 695819223253367491L) {
            var1 = this.field36 * -682698895895007857L;
         }

         if (this.field32 * 1042081335 + 695819223253367491L * this.field33 > -682698895895007857L * this.field36
            && 695819223253367491L * this.field33 + 1579403506 * this.field32 <= -1776634975 * this.field38 + -682698895895007857L * this.field36) {
            var3 = 695819223253367491L * this.field33 + this.field32 * -2063262841;
         } else if (this.field36 * -682698895895007857L + this.field38 * -1605680973 > this.field33 * 695819223253367491L
            && this.field36 * -682698895895007857L + this.field38 * -1605680973 <= 695819223253367491L * this.field33 + -387998165 * this.field32) {
            var3 = -682698895895007857L * this.field36 + 1751769786 * this.field38;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               this.field34, (int)(var1 - 695819223253367491L * this.field33), this.field35, (int)(var1 - -682698895895007857L * this.field36), var5
            );
         }

         this.field33 = 1077159670856333845L;
         this.field32 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("bn")
   public void method157(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (this.field37 * -1515802674131212629L + var3 > this.field30 * -757454725848334387L) {
            this.field30 = 636707342016742661L * (var3 + this.field37 * -1515802674131212629L);
         }

         if (-1L != 695819223253367491L * this.field33
            && (
               -1515802674131212629L * this.field37 < 695819223253367491L * this.field33
                  || this.field37 * -1515802674131212629L > 695819223253367491L * this.field33 + -387998165 * this.field32
            )) {
            this.method160(707288124);
         }

         if (695819223253367491L * this.field33 != -1L
            && var3 + -1515802674131212629L * this.field37 > this.field34.length + 695819223253367491L * this.field33) {
            int var4 = (int)(this.field34.length - (this.field37 * -1515802674131212629L - 695819223253367491L * this.field33));
            System.arraycopy(var1, var2, this.field34, (int)(this.field37 * -1515802674131212629L - this.field33 * 695819223253367491L), var4);
            this.field37 += var4 * 6855001617440859139L;
            var2 += var4;
            var3 -= var4;
            this.field32 = this.field34.length * -1933692797;
            this.method160(1572871677);
         }

         if (var3 <= this.field34.length) {
            if (var3 > 0) {
               if (this.field33 * 695819223253367491L == -1L) {
                  this.field33 = this.field37 * 8824162854156981753L;
               }

               System.arraycopy(var1, var2, this.field34, (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33), var3);
               this.field37 += var3 * 6855001617440859139L;
               if (-1515802674131212629L * this.field37 - 695819223253367491L * this.field33 > this.field32 * -706699751) {
                  this.field32 = -1933692797 * (int)(-1515802674131212629L * this.field37 - 695819223253367491L * this.field33);
               }
            }
         } else {
            if (this.field37 * -1515802674131212629L != this.field40 * -8875074085580969595L) {
               this.field31.method241(this.field37 * -1515802674131212629L);
               this.field40 = this.field37 * 3488955817673977455L;
            }

            this.field31.method242(var1, var2, var3, -1379503807);
            this.field40 += var3 * 193022495361705805L;
            if (-8875074085580969595L * this.field40 > -2811425842963315237L * this.field29) {
               this.field29 = this.field40 * 486754378564656159L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (-1515802674131212629L * this.field37 >= this.field36 * -682698895895007857L
               && this.field37 * -1515802674131212629L < -325545060 * this.field38 + this.field36 * -682698895895007857L) {
               var10 = this.field37 * -1515802674131212629L;
            } else if (-682698895895007857L * this.field36 >= this.field37 * -1515802674131212629L
               && -682698895895007857L * this.field36 < var3 + this.field37 * -1515802674131212629L) {
               var10 = this.field36 * -682698895895007857L;
            }

            if (this.field37 * -1515802674131212629L + var3 > this.field36 * -682698895895007857L
               && -1515802674131212629L * this.field37 + var3 <= 1043555206 * this.field38 + this.field36 * -682698895895007857L) {
               var6 = var3 + -1515802674131212629L * this.field37;
            } else if (-682698895895007857L * this.field36 + this.field38 * -555658165 > -1515802674131212629L * this.field37
               && -682698895895007857L * this.field36 + this.field38 * -1605680973 <= var3 + this.field37 * -1515802674131212629L) {
               var6 = this.field36 * -682698895895007857L + this.field38 * -541296062;
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(
                  var1, (int)(var2 + var10 - -1515802674131212629L * this.field37), this.field35, (int)(var10 - this.field36 * -682698895895007857L), var8
               );
            }

            this.field37 += 6855001617440859139L * var3;
         }
      } catch (IOException var9) {
         this.field40 = -193022495361705805L;
         throw var9;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public void method133() {
      this.method160(1788244273);
      classAAR.method247(this.field31, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   public void method134(int var1) {
      try {
         this.method160(1319123085);
         classAAR.method247(this.field31, (byte)1);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aac.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)V")
   @ObfuscatedName("as")
   public void method148(byte[] var1, int var2, int var3, byte var4) {
      try {
         try {
            if (var3 + var2 > var1.length) {
               if (var4 == 15) {
                  throw new IllegalStateException();
               }

               throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
            }

            if (-1L != this.field33 * 695819223253367491L && -1515802674131212629L * this.field29 >= this.field33 * 695819223253367491L) {
               if (var4 == 15) {
                  throw new IllegalStateException();
               }

               if (var3 + -1515802674131212629L * this.field33 <= -387998165 * this.field38 + 695819223253367491L * this.field33) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  System.arraycopy(this.field35, (int)(this.field40 * -1515802674131212629L - 695819223253367491L * this.field30), var1, var2, var3);
                  this.field29 = this.field33 + var3 * 6855001617440859139L;
                  return;
               }
            }

            long var5 = this.field37 * -1515802674131212629L;
            int var7 = var2;
            int var8 = var3;
            if (-1515802674131212629L * this.field36 >= this.field36 * -682698895895007857L) {
               if (var4 == 15) {
                  throw new IllegalStateException();
               }

               if (this.field33 * -1515802674131212629L < this.field38 * -1605680973 + this.field40 * -682698895895007857L) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  int var9 = (int)(this.field38 * -1605680973 - (-1515802674131212629L * this.field29 - -682698895895007857L * this.field36));
                  if (var9 > var3) {
                     var9 = var3;
                  }

                  System.arraycopy(this.field35, (int)(this.field40 * -1515802674131212629L - this.field30 * -682698895895007857L), var1, var2, var9);
                  this.field36 = this.field33 + 6855001617440859139L * var9;
                  var2 += var9;
                  var3 -= var9;
               }
            }

            if (var3 > this.field35.length) {
               if (var4 == 15) {
                  throw new IllegalStateException();
               }

               this.field31.method241(-1515802674131212629L * this.field29);
               this.field36 = this.field37 * 3488955817673977455L;

               while (var3 > 0) {
                  int var17 = this.field31.method260(var1, var2, var3, -1397369950);
                  if (var17 == -1) {
                     break;
                  }

                  this.field40 = this.field29 + var17 * 193022495361705805L;
                  this.field36 = this.field40 + var17 * 6855001617440859139L;
                  var2 += var17;
                  var3 -= var17;
               }
            } else if (var3 > 0) {
               if (var4 == 15) {
                  throw new IllegalStateException();
               }

               this.method151(-735750071);
               int var16 = var3;
               if (var3 > this.field38 * -1605680973) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  var16 = -1605680973 * this.field32;
               }

               System.arraycopy(this.field35, 0, var1, var2, var16);
               var2 += var16;
               var3 -= var16;
               this.field36 = this.field30 + var16 * 6855001617440859139L;
            }

            if (-1L != 695819223253367491L * this.field37) {
               if (695819223253367491L * this.field30 > this.field37 * -1515802674131212629L) {
                  if (var4 == 15) {
                     return;
                  }

                  if (var3 > 0) {
                     if (var4 == 15) {
                        return;
                     }

                     int var18 = var2 + (int)(this.field40 * 695819223253367491L - -1515802674131212629L * this.field29);
                     if (var18 > var2 + var3) {
                        if (var4 == 15) {
                           throw new IllegalStateException();
                        }

                        var18 = var2 + var3;
                     }

                     while (var2 < var18) {
                        if (var4 == 15) {
                           throw new IllegalStateException();
                        }

                        var1[var2++] = 0;
                        var3--;
                        this.field29 = this.field37 + 6855001617440859139L;
                     }
                  }
               }

               long var11;
               long var19;
               label166: {
                  var19 = -1L;
                  var11 = -1L;
                  if (695819223253367491L * this.field30 >= var5) {
                     if (var4 == 15) {
                        throw new IllegalStateException();
                     }

                     if (695819223253367491L * this.field33 < var5 + var8) {
                        if (var4 == 15) {
                           throw new IllegalStateException();
                        }

                        var19 = 695819223253367491L * this.field37;
                        break label166;
                     }
                  }

                  if (var5 >= 695819223253367491L * this.field30) {
                     if (var4 == 15) {
                        return;
                     }

                     if (var5 < 695819223253367491L * this.field36 + -387998165 * this.field38) {
                        var19 = var5;
                     }
                  }
               }

               if (695819223253367491L * this.field40 + -387998165 * this.field32 > var5
                  && this.field32 * -387998165 + this.field29 * 695819223253367491L <= var5 + var8) {
                  var11 = 695819223253367491L * this.field36 + -387998165 * this.field38;
               } else if (var5 + var8 > 695819223253367491L * this.field30) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  if (var5 + var8 <= this.field38 * -387998165 + 695819223253367491L * this.field36) {
                     if (var4 == 15) {
                        throw new IllegalStateException();
                     }

                     var11 = var8 + var5;
                  }
               }

               if (var19 > -1L && var11 > var19) {
                  if (var4 == 15) {
                     throw new IllegalStateException();
                  }

                  int var13 = (int)(var11 - var19);
                  System.arraycopy(this.field34, (int)(var19 - 695819223253367491L * this.field37), var1, (int)(var19 - var5) + var7, var13);
                  if (var11 > -1515802674131212629L * this.field36) {
                     if (var4 == 15) {
                        throw new IllegalStateException();
                     }

                     var3 = (int)(var3 - (var11 - this.field37 * -1515802674131212629L));
                     this.field36 = 6855001617440859139L * var11;
                  }
               }
            }
         } catch (IOException var14) {
            this.field33 = -193022495361705805L;
            throw var14;
         }

         if (var3 > 0) {
            if (var4 == 15) {
               throw new IllegalStateException();
            } else {
               throw new EOFException();
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "aac.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   public void method163() {
      if (this.field29 * 695819223253367491L != -1L) {
         if (this.field30 * 695819223253367491L != this.field40 * -8875074085580969595L) {
            this.field31.method238(695819223253367491L * this.field30);
            this.field33 = -4565816884240621145L * this.field36;
         }

         this.field31.method242(this.field35, 0, this.field32 * -1202147915, -921777407);
         this.field40 = this.field37 + this.field38 * 4982648314025189359L;
         if (-8875074085580969595L * this.field29 > -2811425842963315237L * this.field29) {
            this.field30 = 486754378564656159L * this.field29;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.field33 * 695819223253367491L >= this.field40 * -682698895895007857L
            && this.field29 * 695819223253367491L < this.field38 * 950427542 + -682698895895007857L * this.field29) {
            var1 = 695819223253367491L * this.field33;
         } else if (this.field33 * -682698895895007857L >= this.field37 * 695819223253367491L
            && -682698895895007857L * this.field40 < this.field38 * -387998165 + this.field40 * 695819223253367491L) {
            var1 = this.field36 * -682698895895007857L;
         }

         if (this.field32 * -387998165 + 695819223253367491L * this.field36 > -682698895895007857L * this.field36
            && 695819223253367491L * this.field36 + -387998165 * this.field38 <= -1605680973 * this.field38 + -682698895895007857L * this.field37) {
            var3 = 695819223253367491L * this.field30 + this.field32 * -387998165;
         } else if (this.field40 * -682698895895007857L + this.field32 * -1605680973 > this.field36 * 695819223253367491L
            && this.field40 * -682698895895007857L + this.field32 * -1605680973 <= 695819223253367491L * this.field40 + -387998165 * this.field32) {
            var3 = -682698895895007857L * this.field30 + -1605680973 * this.field32;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(
               this.field34, (int)(var1 - 695819223253367491L * this.field33), this.field35, (int)(var1 - -682698895895007857L * this.field33), var5
            );
         }

         this.field33 = 1077159670856333845L;
         this.field38 = 0;
      }
   }
}
