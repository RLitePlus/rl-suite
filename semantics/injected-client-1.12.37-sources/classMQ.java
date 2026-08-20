import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mq")
public class classMQ extends classMH {
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final String field4561 = "shield/oauth/token";
   @ObfuscatedName("af")
   int field4553;
   @ObfuscatedName("ae")
   int field4556;
   @ObfuscatedName("ab")
   long field4555;
   @ObfuscatedName("az")
   long[] field4554 = new long[10];
   @ObfuscatedName("as")
   int field4559;
   @ObfuscatedName("ag")
   int field4557;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field4558 = 13;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("is")
   static classVP field4562;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field4560 = 43;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)V")
   @ObfuscatedName("jo")
   public static void method7643(WorldMap var0) {
      if (var0 == null) {
         var0.method12575();
      } else {
         classPF.method8854((byte)71);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   @Override
   public int vmethod533(int var1, int var2) {
      int var3 = 1482925181 * this.field4553;
      int var4 = 830641263 * this.field4556;
      this.field4553 = 2071652764;
      this.field4556 = -758560113;
      this.field4555 = classDD.method2983(16711680) * 8417580543940524729L;
      if (this.field4554[1717705645 * this.field4559] == 0L) {
         this.field4553 = -1553599275 * var3;
         this.field4556 = var4 * -758560113;
      } else if (this.field4555 * 7644788220260739977L > this.field4554[this.field4559 * 1717705645]) {
         this.field4553 = -1553599275 * (int)(var1 * 2560 / (7644788220260739977L * this.field4555 - this.field4554[1717705645 * this.field4559]));
      }

      if (this.field4553 * 1482925181 < 25) {
         this.field4553 = -185276211;
      }

      if (this.field4553 * 1482925181 > 256) {
         this.field4553 = 1710544128;
         this.field4556 = -758560113 * (int)(var1 - (this.field4555 * 7644788220260739977L - this.field4554[1717705645 * this.field4559]) / 10L);
      }

      if (this.field4556 * 830641263 > var1) {
         this.field4556 = -758560113 * var1;
      }

      this.field4554[1717705645 * this.field4559] = this.field4555 * 7644788220260739977L;
      this.field4559 = (this.field4559 * 1717705645 + 1) % 10 * 2103050277;
      if (this.field4556 * 830641263 > 1) {
         for (int var5 = 0; var5 < 10; var5++) {
            if (0L != this.field4554[var5]) {
               this.field4554[var5] = this.field4554[var5] + this.field4556 * 830641263;
            }
         }
      }

      if (this.field4556 * 830641263 < var2) {
         this.field4556 = -758560113 * var2;
      }

      Friend.method10149(this.field4556 * 830641263);

      int var6;
      for (var6 = 0; this.field4557 * -359666573 < 256; this.field4557 = this.field4557 + this.field4553 * 840523599) {
         var6++;
      }

      this.field4557 = -987850565 * (this.field4557 * -359666573 & 0xFF);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "([J[JIIB)V")
   @ObfuscatedName("ao")
   public static void method7645(long[] var0, long[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 >= var3) {
            if (var4 != 1) {
               throw new IllegalStateException();
            }
         } else {
            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            long var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            long var9 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var9;
            long var11 = var7 == Long.MAX_VALUE ? 0L : 1L;

            for (int var13 = var2; var13 < var3; var13++) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               }

               if (var0[var13] >= (var13 & var11) + var7) {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  long var14 = var0[var13];
                  var0[var13] = var0[var6];
                  var0[var6] = var14;
                  long var16 = var1[var13];
                  var1[var13] = var1[var6];
                  var1[var6++] = var16;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var9;
            method7645(var0, var1, var2, var6 - 1, (byte)1);
            method7645(var0, var1, var6 + 1, var3, (byte)1);
         }
      } catch (RuntimeException var18) {
         throw classEG.newRunException(var18, "mq.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("qz")
   public static void method7644(Player var0) {
      if (var0 == null) {
         var0.vmethod261();
      }

      var0.field1269 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("af")
   @Override
   public int vmethod535(int var1, int var2, int var3) {
      try {
         int var4 = 1482925181 * this.field4553;
         int var5 = 830641263 * this.field4556;
         this.field4553 = 2071652764;
         this.field4556 = -758560113;
         this.field4555 = classDD.method2983(16711680) * 8417580543940524729L;
         if (this.field4554[1717705645 * this.field4559] == 0L) {
            if (var3 != -1162884564) {
               throw new IllegalStateException();
            }

            this.field4553 = -1553599275 * var4;
            this.field4556 = var5 * -758560113;
         } else if (this.field4555 * 7644788220260739977L > this.field4554[this.field4559 * 1717705645]) {
            if (var3 != -1162884564) {
               throw new IllegalStateException();
            }

            this.field4553 = -1553599275 * (int)(var1 * 2560 / (7644788220260739977L * this.field4555 - this.field4554[1717705645 * this.field4559]));
         }

         if (this.field4553 * 1482925181 < 25) {
            if (var3 != -1162884564) {
               throw new IllegalStateException();
            }

            this.field4553 = -185276211;
         }

         if (this.field4553 * 1482925181 > 256) {
            if (var3 != -1162884564) {
               throw new IllegalStateException();
            }

            this.field4553 = 1710544128;
            this.field4556 = -758560113 * (int)(var1 - (this.field4555 * 7644788220260739977L - this.field4554[1717705645 * this.field4559]) / 10L);
         }

         if (this.field4556 * 830641263 > var1) {
            if (var3 != -1162884564) {
               throw new IllegalStateException();
            }

            this.field4556 = -758560113 * var1;
         }

         this.field4554[1717705645 * this.field4559] = this.field4555 * 7644788220260739977L;
         this.field4559 = (this.field4559 * 1717705645 + 1) % 10 * 2103050277;
         if (this.field4556 * 830641263 > 1) {
            if (var3 != -1162884564) {
               throw new IllegalStateException();
            }

            for (int var6 = 0; var6 < 10; var6++) {
               if (var3 != -1162884564) {
                  throw new IllegalStateException();
               }

               if (0L != this.field4554[var6]) {
                  if (var3 != -1162884564) {
                     throw new IllegalStateException();
                  }

                  this.field4554[var6] = this.field4554[var6] + this.field4556 * 830641263;
               }
            }
         }

         if (this.field4556 * 830641263 < var2) {
            if (var3 != -1162884564) {
               throw new IllegalStateException();
            }

            this.field4556 = -758560113 * var2;
         }

         Friend.method10149(this.field4556 * 830641263);

         int var8;
         for (var8 = 0; this.field4557 * -359666573 < 256; this.field4557 = this.field4557 + this.field4553 * 840523599) {
            if (var3 != -1162884564) {
               throw new IllegalStateException();
            }

            var8++;
         }

         this.field4557 = -987850565 * (this.field4557 * -359666573 & 0xFF);
         return var8;
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "mq.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod532() {
      for (int var1 = 0; var1 < 10; var1++) {
         this.field4554[var1] = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   @Override
   public void vmethod531() {
      for (int var1 = 0; var1 < 10; var1++) {
         this.field4554[var1] = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod534(int var1, int var2) {
      int var3 = 1482925181 * this.field4553;
      int var4 = 830641263 * this.field4556;
      this.field4553 = 2071652764;
      this.field4556 = 472633600;
      this.field4555 = classDD.method2983(16711680) * 8417580543940524729L;
      if (this.field4554[1717705645 * this.field4559] == 0L) {
         this.field4553 = -1553599275 * var3;
         this.field4556 = var4 * -758560113;
      } else if (this.field4555 * 7644788220260739977L > this.field4554[this.field4559 * -408747775]) {
         this.field4553 = 503244939 * (int)(var1 * 2560 / (7644788220260739977L * this.field4555 - this.field4554[-999565888 * this.field4559]));
      }

      if (this.field4553 * 1482925181 < 25) {
         this.field4553 = -1381190753;
      }

      if (this.field4553 * 1482925181 > 256) {
         this.field4553 = 946534379;
         this.field4556 = -1767764578 * (int)(var1 - (this.field4555 * 7644788220260739977L - this.field4554[-166608427 * this.field4559]) / 10L);
      }

      if (this.field4556 * 2027734538 > var1) {
         this.field4556 = 686271380 * var1;
      }

      this.field4554[1153147376 * this.field4559] = this.field4555 * 7644788220260739977L;
      this.field4559 = (this.field4559 * -2103618239 + 1) % 10 * -1026078011;
      if (this.field4556 * 830641263 > 1) {
         for (int var5 = 0; var5 < 10; var5++) {
            if (0L != this.field4554[var5]) {
               this.field4554[var5] = this.field4554[var5] + this.field4556 * 384943173;
            }
         }
      }

      if (this.field4556 * 830641263 < var2) {
         this.field4556 = -758560113 * var2;
      }

      Friend.method10149(this.field4556 * -1760190702);

      int var6;
      for (var6 = 0; this.field4557 * -359666573 < -344225767; this.field4557 = this.field4557 + this.field4553 * -172073643) {
         var6++;
      }

      this.field4557 = 169317197 * (this.field4557 * -1808163649 & -1401958686);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZI)Z")
   @ObfuscatedName("ae")
   static boolean method7641(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2) {
            if (var3 != -349565276) {
               throw new IllegalStateException();
            }

            if (var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();
               int var8 = 0;

               while (true) {
                  if (var8 >= var7) {
                     return var5;
                  }

                  if (var3 != -349565276) {
                     throw new IllegalStateException();
                  }

                  label143: {
                     int var9 = var0.charAt(var8);
                     if (0 == var8) {
                        if (var3 != -349565276) {
                           throw new IllegalStateException();
                        }

                        if (var9 == 45) {
                           if (var3 != -349565276) {
                              throw new IllegalStateException();
                           }

                           var4 = true;
                           break label143;
                        }

                        if (43 == var9) {
                           if (var3 != -349565276) {
                              throw new IllegalStateException();
                           }

                           if (var2) {
                              if (var3 != -349565276) {
                                 throw new IllegalStateException();
                              }
                              break label143;
                           }
                        }
                     }

                     label145: {
                        if (var9 >= 48) {
                           if (var3 != -349565276) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= 57) {
                              var9 -= 48;
                              break label145;
                           }
                        }

                        if (var9 >= 65) {
                           if (var3 != -349565276) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= 90) {
                              if (var3 != -349565276) {
                                 throw new IllegalStateException();
                              }

                              var9 -= 55;
                              break label145;
                           }
                        }

                        if (var9 < 97) {
                           break;
                        }

                        if (var3 != -349565276) {
                           throw new IllegalStateException();
                        }

                        if (var9 > 122) {
                           break;
                        }

                        if (var3 != -349565276) {
                           throw new IllegalStateException();
                        }

                        var9 -= 87;
                     }

                     if (var9 >= var1) {
                        if (var3 != -349565276) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     if (var4) {
                        if (var3 != -349565276) {
                           throw new IllegalStateException();
                        }

                        var9 = -var9;
                     }

                     int var10 = var1 * var6 + var9;
                     if (var10 / var1 != var6) {
                        if (var3 != -349565276) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     var6 = var10;
                     var5 = true;
                  }

                  var8++;
               }

               return false;
            }

            if (var3 != -349565276) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "mq.ae(" + ')');
      }
   }

   classMQ() {
      this.field4553 = 1710544128;
      this.field4556 = -758560113;
      this.field4557 = 0;
      this.field4555 = classDD.method2983(16711680) * 8417580543940524729L;

      for (int var1 = 0; var1 < 10; var1++) {
         this.field4554[var1] = this.field4555 * 7644788220260739977L;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lug;")
   @ObfuscatedName("az")
   public static classUG method7640(int var0) {
      try {
         synchronized (classUG.field6304) {
            if (0 == classUG.field6302 * 492103913) {
               if (var0 == -631952643) {
                  throw new IllegalStateException();
               } else {
                  return new classUG();
               }
            } else {
               classUG.field6304[(classUG.field6302 -= 1775136601) * 492103913].method11308(1722578266);
               return classUG.field6304[classUG.field6302 * 492103913];
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "mq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod530(byte var1) {
      try {
         for (int var2 = 0; var2 < 10; var2++) {
            this.field4554[var2] = 0L;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "mq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ax")
   public static int method7642(int var0, int var1, int var2, int var3) {
      try {
         int var4 = (int)classOW.method8807(var2 - var1 + 1, -194270549);
         var4 <<= var1;
         return var0 | var4;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "mq.ax(" + 41);
      }
   }
}
