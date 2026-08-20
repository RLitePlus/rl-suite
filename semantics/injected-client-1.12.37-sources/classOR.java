import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("or")
public class classOR extends classVJ {
   @ObfuscatedName("ap")
   final int field5084;
   @ObfuscatedName("at")
   final int field5094;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5087 = 4;
   @ObfuscatedName("ar")
   final short[] field5091;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("aj")
   public static AbstractArchive field5085;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ay")
   static EvictingDualNodeHashTable field5098 = new EvictingDualNodeHashTable(64);
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("aq")
   static EvictingDualNodeHashTable field5099 = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("ad")
   final int field5088;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field5100 = 40;
   @ObfuscatedName("au")
   public final int field5083;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5101 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5102 = 2;
   @ObfuscatedName("aw")
   final short[] field5092;
   @ObfuscatedName("ak")
   final short[] field5086;
   @ObfuscatedName("av")
   final int field5093;
   @ObfuscatedName("bn")
   final boolean field5097;
   @ObfuscatedName("ai")
   final short[] field5090;
   @ObfuscatedName("am")
   final int field5095;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   public static final int field5103 = 62;
   @ObfuscatedName("ah")
   final int field5096;
   @ObfuscatedName("an")
   final int field5089;
   @ObfuscatedName("om")
   static int field5104;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public boolean method8728(int var1) {
      try {
         return this.field5097;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "or.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;)I")
   @ObfuscatedName("ed")
   public static int method8722(classSU var0) {
      return 1286089593 * var0.field6059;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lor;")
   @ObfuscatedName("as")
   public static classOR method8719(int var0) {
      classOR var1 = (classOR)field5098.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classEN.field1802.method11867(13, var0, -2147428008);
         var1 = new classOR(new Buffer(var2), var0);
         field5098.method6428(var1, var0);
         return var1;
      }
   }

   classOR(Buffer var1, int var2) {
      this.field5088 = -1335336579 * var2;
      int var3 = 0;
      int var4 = -1;
      short[] var5 = null;
      short[] var6 = null;
      short[] var7 = null;
      short[] var8 = null;
      int var9 = 128;
      int var10 = 128;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      boolean var14 = true;
      if (var1 != null && null != var1.array) {
         label75:
         while (true) {
            int var15 = Buffer.method13039(var1, -346779531);
            switch (var15) {
               case 0:
                  break label75;
               case 1:
               case 9:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               default:
                  continue;
               case 2:
                  var4 = Buffer.method13047(var1, -1950398158);
                  continue;
               case 3:
                  var3 = var1.method13117(classXM.field6888.field6890, 1437379579);
                  continue;
               case 4:
                  var9 = Buffer.method13047(var1, 667998590);
                  continue;
               case 5:
                  var10 = Buffer.method13047(var1, -865461482);
                  continue;
               case 6:
                  var11 = Buffer.method13047(var1, 123616886);
                  continue;
               case 7:
                  var12 = Buffer.method13039(var1, -346779531);
                  continue;
               case 8:
                  var13 = Buffer.method13039(var1, -346779531);
                  continue;
               case 10:
                  var14 = false;
                  continue;
               case 40:
                  int var18 = Buffer.method13039(var1, -346779531);
                  var5 = new short[var18];
                  var6 = new short[var18];
                  int var19 = 0;

                  while (true) {
                     if (var19 >= var18) {
                        continue label75;
                     }

                     var5[var19] = (short)Buffer.method13047(var1, -1246683280);
                     var6[var19] = (short)Buffer.method13047(var1, -1766064453);
                     var19++;
                  }
               case 41:
            }

            int var16 = Buffer.method13039(var1, -346779531);
            var7 = new short[var16];
            var8 = new short[var16];

            for (int var17 = 0; var17 < var16; var17++) {
               var7[var17] = (short)Buffer.method13047(var1, -1882949024);
               var8[var17] = (short)Buffer.method13047(var1, -781866163);
            }
         }
      }

      this.field5084 = var3 * -238891201;
      this.field5083 = -1826452025 * var4;
      this.field5090 = var5;
      this.field5091 = var6;
      this.field5092 = var7;
      this.field5086 = var8;
      this.field5093 = -489725797 * var9;
      this.field5094 = var10 * 107320625;
      this.field5089 = var11 * -1107617573;
      this.field5095 = var12 * 588011357;
      this.field5096 = var13 * -745429135;
      this.field5097 = var14;
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ao")
   public final Model method8723(int var1) {
      Model var2 = this.method8726(457912642);
      if (null == var2) {
         return null;
      } else {
         Model var3;
         if (696329207 * this.field5083 != -1 && var1 != -1) {
            var3 = classQA.method9430(696329207 * this.field5083, 262627062).method8795(var2, var1, -1287453103);
         } else {
            var3 = var2.method5084(true);
         }

         if (-1357160656 * this.field5093 != -793533364 || 448906649 * this.field5094 != 128) {
            var3.method5237(this.field5093 * 1902216595, -1853643823 * this.field5094, this.field5093 * 1404912865);
         }

         if (this.field5089 * -337435821 != 0) {
            if (-1880671932 == this.field5089 * -337435821) {
               var3.method5238();
            }

            if (-337435821 * this.field5089 == -1344918997) {
               var3.method5238();
               var3.method5238();
            }

            if (270 == this.field5089 * -337435821) {
               var3.method5238();
               var3.method5238();
               var3.method5238();
            }
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lfx;")
   @ObfuscatedName("ae")
   public final Model method8724(int var1, int var2) {
      try {
         Model var3 = this.method8726(2031766993);
         if (null == var3) {
            if (var2 <= 608537135) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Model var4;
            label80: {
               if (696329207 * this.field5083 != -1) {
                  if (var2 <= 608537135) {
                     throw new IllegalStateException();
                  }

                  if (var1 != -1) {
                     if (var2 <= 608537135) {
                        throw new IllegalStateException();
                     }

                     var4 = classQA.method9430(696329207 * this.field5083, -984750645).method8795(var3, var1, 356352012);
                     break label80;
                  }
               }

               var4 = var3.method5084(true);
            }

            label74: {
               if (1902216595 * this.field5093 == 128) {
                  if (var2 <= 608537135) {
                     throw new IllegalStateException();
                  }

                  if (-1853643823 * this.field5094 == 128) {
                     break label74;
                  }

                  if (var2 <= 608537135) {
                     throw new IllegalStateException();
                  }
               }

               var4.method5237(this.field5093 * 1902216595, -1853643823 * this.field5094, this.field5093 * 1902216595);
            }

            if (this.field5089 * -337435821 != 0) {
               if (var2 <= 608537135) {
                  throw new IllegalStateException();
               }

               if (90 == this.field5089 * -337435821) {
                  if (var2 <= 608537135) {
                     throw new IllegalStateException();
                  }

                  var4.method5238();
               }

               if (-337435821 * this.field5089 == 180) {
                  if (var2 <= 608537135) {
                     throw new IllegalStateException();
                  }

                  var4.method5238();
                  var4.method5238();
               }

               if (270 == this.field5089 * -337435821) {
                  if (var2 <= 608537135) {
                     throw new IllegalStateException();
                  }

                  var4.method5238();
                  var4.method5238();
                  var4.method5238();
               }
            }

            return var4;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "or.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ab")
   public final Model method8726(int var1) {
      try {
         Model var2 = (Model)field5099.method6422(-770187307 * this.field5088);
         if (var2 == null) {
            if (var1 == -444705952) {
               throw new IllegalStateException();
            }

            ModelData var3 = ModelData.method4047(field5085, -1176461121 * this.field5084, 0);
            if (null == var3) {
               if (var1 == -444705952) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (this.field5090 != null) {
               for (int var4 = 0; var4 < this.field5090.length; var4++) {
                  var3.method4001(this.field5090[var4], this.field5091[var4]);
               }
            }

            if (null != this.field5092) {
               for (int var6 = 0; var6 < this.field5092.length; var6++) {
                  if (var1 == -444705952) {
                     throw new IllegalStateException();
                  }

                  var3.method4004(this.field5092[var6], this.field5086[var6]);
               }
            }

            var2 = var3.method4045(64 + this.field5095 * 1235203317, 330840465 * this.field5096 + 850, -30, -50, -30);
            field5099.method6428(var2, this.field5088 * -770187307);
         }

         return var2;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "or.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public static void method8721() {
      EvictingDualNodeHashTable.method6431(field5098);
      EvictingDualNodeHashTable.method6431(field5099);
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("aa")
   public final Model method8725(int var1) {
      Model var2 = this.method8726(-1712517118);
      if (null == var2) {
         return null;
      } else {
         Model var3;
         if (696329207 * this.field5083 != -1 && var1 != -1) {
            var3 = classQA.method9430(696329207 * this.field5083, 71214634).method8795(var2, var1, -680303656);
         } else {
            var3 = var2.method5084(true);
         }

         if (1902216595 * this.field5093 != 128 || -1853643823 * this.field5094 != 128) {
            var3.method5237(this.field5093 * 1902216595, -1853643823 * this.field5094, this.field5093 * 1902216595);
         }

         if (this.field5089 * -337435821 != 0) {
            if (90 == this.field5089 * -337435821) {
               var3.method5238();
            }

            if (-337435821 * this.field5089 == 180) {
               var3.method5238();
               var3.method5238();
            }

            if (270 == this.field5089 * -337435821) {
               var3.method5238();
               var3.method5238();
               var3.method5238();
            }
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lor;")
   @ObfuscatedName("ax")
   public static classOR method8720(int var0) {
      classOR var1 = (classOR)field5098.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classEN.field1802.method11867(13, var0, -1617111090);
         var1 = new classOR(new Buffer(var2), var0);
         field5098.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("al")
   public final Model method8727() {
      Model var1 = (Model)field5099.method6422(-770187307 * this.field5088);
      if (var1 == null) {
         ModelData var2 = ModelData.method4047(field5085, -1176461121 * this.field5084, 0);
         if (null == var2) {
            return null;
         }

         if (this.field5090 != null) {
            for (int var3 = 0; var3 < this.field5090.length; var3++) {
               var2.method4001(this.field5090[var3], this.field5091[var3]);
            }
         }

         if (null != this.field5092) {
            for (int var4 = 0; var4 < this.field5092.length; var4++) {
               var2.method4004(this.field5092[var4], this.field5086[var4]);
            }
         }

         var1 = var2.method4045(64 + this.field5095 * 1822277857, 1877973522 * this.field5096 + -928618529, -30, -50, -30);
         field5099.method6428(var1, this.field5088 * -770187307);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II[BII)I")
   @ObfuscatedName("ag")
   public static int method8729(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      try {
         int var6 = var2 - var1;

         for (int var7 = 0; var7 < var6; var7++) {
            char var8;
            label204: {
               var8 = var0.charAt(var7 + var1);
               if (var8 > 0) {
                  if (var8 < 128) {
                     break label204;
                  }

                  if (var5 != 305293424) {
                     throw new IllegalStateException();
                  }
               }

               if (var8 < 160 || var8 > 255) {
                  if (var8 == 8364) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var4 + var7] = -128;
                  } else if (var8 == 8218) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -126;
                  } else if (402 == var8) {
                     var3[var4 + var7] = -125;
                  } else if (var8 == 8222) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var4 + var7] = -124;
                  } else if (8230 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var4 + var7] = -123;
                  } else if (8224 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -122;
                  } else if (8225 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var4 + var7] = -121;
                  } else if (var8 == 710) {
                     var3[var4 + var7] = -120;
                  } else if (var8 == 8240) {
                     var3[var7 + var4] = -119;
                  } else if (var8 == 352) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var4 + var7] = -118;
                  } else if (8249 == var8) {
                     var3[var7 + var4] = -117;
                  } else if (338 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var4 + var7] = -116;
                  } else if (381 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -114;
                  } else if (8216 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -111;
                  } else if (var8 == 8217) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -110;
                  } else if (var8 == 8220) {
                     var3[var4 + var7] = -109;
                  } else if (var8 == 8221) {
                     var3[var4 + var7] = -108;
                  } else if (8226 == var8) {
                     var3[var7 + var4] = -107;
                  } else if (var8 == 8211) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -106;
                  } else if (8212 == var8) {
                     var3[var4 + var7] = -105;
                  } else if (732 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -104;
                  } else if (var8 == 8482) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -103;
                  } else if (var8 == 353) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -102;
                  } else if (8250 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var4 + var7] = -101;
                  } else if (339 == var8) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var4 + var7] = -100;
                  } else if (var8 == 382) {
                     if (var5 != 305293424) {
                        throw new IllegalStateException();
                     }

                     var3[var7 + var4] = -98;
                  } else if (376 == var8) {
                     var3[var4 + var7] = -97;
                  } else {
                     var3[var7 + var4] = 63;
                  }
                  continue;
               }
            }

            var3[var7 + var4] = (byte)var8;
         }

         return var6;
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "or.ag(" + 41);
      }
   }
}
