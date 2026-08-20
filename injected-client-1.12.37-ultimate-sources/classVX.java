import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
public class classVX extends classVI {
   @ObfuscatedName("af")
   int field6635;
   @ObfuscatedName("az")
   int field6640 = 0;
   @ObfuscatedName("ae")
   int field6636;
   @ObfuscatedName("ab")
   int field6637;
   @ObfuscatedName("as")
   int field6638;
   @ObfuscatedName("ag")
   int field6639;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   @Override
   public int vmethod622() {
      double var1 = this.method12270(-1142063836);
      return (int)Math.round(var1 * (-1793991211 * this.field6638 - this.field6636 * -1962640878) + -2108847851 * this.field6636);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod620(int var1) {
      try {
         double var2 = this.method12270(867906914);
         return (int)Math.round(var2 * (230071057 * this.field6638 - this.field6636 * -2108847851) + -2108847851 * this.field6636);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vx.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod618(int var1) {
      try {
         double var2 = this.method12270(-623220422);
         return (int)Math.round(-1315002479 * this.field6635 + (-643066489 * this.field6639 - this.field6635 * -1315002479) * var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vx.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   @Override
   public int vmethod614(int var1) {
      try {
         double var2 = this.method12270(-770456165);
         return (int)Math.round(this.field6640 * 1239267557 + var2 * (this.field6637 * 102040981 - 1239267557 * this.field6640));
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vx.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod615() {
      double var1 = this.method12270(-112353627);
      return (int)Math.round(this.field6640 * 1239267557 + var1 * (this.field6637 * 102040981 - 1239267557 * this.field6640));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod616() {
      double var1 = this.method12270(-1479291235);
      return (int)Math.round(this.field6640 * 1239267557 + var1 * (this.field6637 * 102040981 - 1239267557 * this.field6640));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   @Override
   public int vmethod617() {
      double var1 = this.method12270(301775130);
      return (int)Math.round(-1315002479 * this.field6635 + (-643066489 * this.field6639 - this.field6635 * -1315002479) * var1);
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ac")
   static int method12261(int var0, byte var1) {
      try {
         classCG var2 = (classCG)classCN.field1174.method13595(var0);
         if (var2 == null) {
            if (var1 != 2) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (var2.field6515 == classCN.field1173.field4800) {
            if (var1 != 2) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 707758669 * ((classCG)var2.field6515).field725;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "vx.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   @Override
   public int vmethod619() {
      double var1 = this.method12270(-2028877491);
      return (int)Math.round(var1 * (230071057 * this.field6638 - this.field6636 * -2108847851) + -2108847851 * this.field6636);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   @Override
   public int vmethod623() {
      double var1 = this.method12270(297012413);
      return (int)Math.round(var1 * (230071057 * this.field6638 - this.field6636 * -2108847851) + -2108847851 * this.field6636);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   @Override
   public int vmethod621() {
      double var1 = this.method12270(1514283069);
      return (int)Math.round(var1 * (230071057 * this.field6638 - this.field6636 * -2108847851) + -2108847851 * this.field6636);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)[B")
   @ObfuscatedName("ab")
   public static byte[] method12262(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         byte[] var3 = new byte[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            char var5;
            label225: {
               var5 = var0.charAt(var4);
               if (var5 > 0) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  if (var5 < 128) {
                     break label225;
                  }

                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 160) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 255) {
                     break label225;
                  }
               }

               if (var5 == 8364) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -128;
               } else if (8218 == var5) {
                  var3[var4] = -126;
               } else if (402 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -125;
               } else if (8222 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -124;
               } else if (var5 == 8230) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -123;
               } else if (8224 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -122;
               } else if (8225 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -121;
               } else if (710 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -120;
               } else if (var5 == 8240) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -119;
               } else if (352 == var5) {
                  var3[var4] = -118;
               } else if (8249 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -117;
               } else if (var5 == 338) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -116;
               } else if (var5 == 381) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -114;
               } else if (8216 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -111;
               } else if (8217 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -110;
               } else if (8220 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -109;
               } else if (8221 == var5) {
                  var3[var4] = -108;
               } else if (8226 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -107;
               } else if (var5 == 8211) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -106;
               } else if (8212 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -105;
               } else if (732 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -104;
               } else if (var5 == 8482) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -103;
               } else if (var5 == 353) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -102;
               } else if (8250 == var5) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -101;
               } else if (339 == var5) {
                  var3[var4] = -100;
               } else if (var5 == 382) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -98;
               } else if (var5 == 376) {
                  if (var1 >= -1239932395) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -97;
               } else {
                  var3[var4] = 63;
               }
               continue;
            }

            var3[var4] = (byte)var5;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "vx.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("gs")
   static final void method12263(int var0, int var1, byte var2) {
      try {
         if (null == client.field866[var0]) {
            if (var2 != 85) {
               throw new IllegalStateException();
            }
         } else {
            if (var1 >= 0) {
               if (var2 != 85) {
                  throw new IllegalStateException();
               }

               if (var1 < classIE.method6183(client.field866[var0], (byte)3)) {
                  classHN var3 = (classHN)client.field866[var0].field2955.get(var1);
                  if (var3.field2841 != -1) {
                     return;
                  }

                  classJL var4 = classEF.method3849(classJS.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL, client.field795.field1535, (byte)59);
                  classXY.method12971(var4.field3343, 3 + classAU.method712(var3.field2846.method164(1461228078), (byte)80), (byte)-100);
                  classXY.method12971(var4.field3343, var0, (byte)-127);
                  var4.field3343.method12973(var1, -1542382992);
                  classXY.method12997(var4.field3343, var3.field2846.method164(652075722), (short)19367);
                  client.field795.method3367(var4, -1301097035);
                  return;
               }

               if (var2 != 85) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "vx.gs(" + ')');
      }
   }

   public classVX(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var7, var8);
      this.field6635 = 0;
      this.field6636 = 0;
      this.field6637 = 0;
      this.field6639 = 0;
      this.field6638 = 0;
      this.field6640 = 657671405 * var1;
      this.field6635 = var2 * -499320463;
      this.field6636 = var3 * 156663357;
      this.field6637 = -717939267 * var4;
      this.field6639 = var5 * -2021777353;
      this.field6638 = 1915074033 * var6;
   }
}
