import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import net.runelite.api.IndexDataBase;
import net.runelite.api.overlay.OverlayIndex;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("va")
public abstract class AbstractArchive implements IndexDataBase {
   @ObfuscatedName("bs")
   Object[][] field6457;
   @ObfuscatedSignature(descriptor = "Laat;")
   @ObfuscatedName("bc")
   static classAAT field6439 = new classAAT();
   @ObfuscatedName("bp")
   public int field6441;
   @ObfuscatedName("br")
   boolean field6437;
   @ObfuscatedName("fd")
   public Object field6443;
   @ObfuscatedName("bx")
   static int field6438 = 0;
   @ObfuscatedName("ba")
   int field6440;
   @ObfuscatedName("bg")
   int[] field6447;
   @ObfuscatedName("bj")
   int[] field6449;
   @ObfuscatedSignature(descriptor = "Lzt;")
   @ObfuscatedName("bk")
   classZT field6444;
   @ObfuscatedName("bo")
   int[] field6450;
   @ObfuscatedName("by")
   int[][] field6456;
   @ObfuscatedName("bt")
   int field6442;
   @ObfuscatedName("bu")
   int[] field6451;
   @ObfuscatedName("qz")
   public boolean field6445;
   @ObfuscatedName("bb")
   int[] field6446;
   @ObfuscatedName("bi")
   int[] field6448;
   @ObfuscatedName("bf")
   Object[] field6453;
   @ObfuscatedName("be")
   int[][] field6455;
   @ObfuscatedSignature(descriptor = "[Lzt;")
   @ObfuscatedName("bq")
   classZT[] field6454;
   @ObfuscatedName("bw")
   int[] field6452;
   @ObfuscatedName("bm")
   boolean field6436;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("iv")
   public int method11875(String var1) {
      return this.method11848(var1, 218437170);
   }

   @ObfuscatedSignature(descriptor = "(II)[I")
   @ObfuscatedName("bv")
   public int[] method11824(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= -1444785102) {
               throw new IllegalStateException();
            }

            if (var1 < this.field6456.length) {
               return this.field6456[var1];
            }

            if (var2 >= -1444785102) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "va.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("bw")
   void method11794(byte[] var1, int var2) {
      try {
         this.field6441 = classCV.method2684(var1, var1.length, (byte)-24) * -1441214089;
         classXY var3 = new classXY(classMD.method7538(var1, (byte)49));
         int var4 = classXY.method13039(var3, -346779531);
         if (var4 >= 5) {
            if (var4 <= 7) {
               if (var4 >= 6) {
                  if (var2 != 1479807699) {
                     throw new IllegalStateException();
                  }

                  var3.method13056((byte)1);
               }

               int var5 = classXY.method13039(var3, -346779531);
               boolean var10000;
               if (0 != (var5 & 1)) {
                  if (var2 != 1479807699) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1;
               } else {
                  var10000 = 0;
               }

               boolean var6 = (boolean)var10000;
               if ((var5 & 2) != 0) {
                  if (var2 != 1479807699) {
                     throw new IllegalStateException();
                  }

                  var10000 = (boolean)1;
               } else {
                  var10000 = (boolean)0;
               }

               boolean var7 = var10000;
               if (0 != (var5 & 4)) {
                  if (var2 != 1479807699) {
                     return;
                  }

                  var10000 = (boolean)1;
               } else {
                  var10000 = (boolean)0;
               }

               boolean var8 = var10000;
               if (0 != (var5 & 8)) {
                  if (var2 != 1479807699) {
                     throw new IllegalStateException();
                  }

                  var10000 = (boolean)1;
               } else {
                  var10000 = (boolean)0;
               }

               boolean var9 = var10000;
               if (var7) {
                  if (var2 != 1479807699) {
                     return;
                  }

                  throw new UnsupportedOperationException("");
               }

               if (var9) {
                  throw new UnsupportedOperationException("");
               }

               if (var4 >= 7) {
                  if (var2 != 1479807699) {
                     throw new IllegalStateException();
                  }

                  this.field6440 = var3.method13107((short)24721) * 911284189;
               } else {
                  this.field6440 = classXY.method13047(var3, 555237632) * 911284189;
               }

               int var10 = 0;
               int var11 = -1;
               this.field6447 = new int[-1862600587 * this.field6440];
               if (var4 >= 7) {
                  if (var2 != 1479807699) {
                     return;
                  }

                  for (int var12 = 0; var12 < this.field6440 * -1862600587; var12++) {
                     if (var2 != 1479807699) {
                        throw new IllegalStateException();
                     }

                     this.field6447[var12] = var10 += var3.method13107((short)-2019);
                     if (this.field6447[var12] > var11) {
                        var11 = this.field6447[var12];
                     }
                  }
               } else {
                  for (int var21 = 0; var21 < this.field6440 * -1862600587; var21++) {
                     if (var2 != 1479807699) {
                        return;
                     }

                     this.field6447[var21] = var10 += classXY.method13047(var3, -1355391222);
                     if (this.field6447[var21] > var11) {
                        if (var2 != 1479807699) {
                           return;
                        }

                        var11 = this.field6447[var21];
                     }
                  }
               }

               this.field6442 = (var11 + 1) * 2034482581;
               this.field6452 = new int[-442718787 * this.field6442];
               this.field6446 = new int[-442718787 * this.field6442];
               this.field6448 = new int[-442718787 * this.field6442];
               this.field6456 = new int[-442718787 * this.field6442][];
               this.field6453 = new Object[this.field6442 * -442718787];
               this.field6457 = new Object[-442718787 * this.field6442][];
               if (var6) {
                  this.field6449 = new int[-442718787 * this.field6442];
                  Arrays.fill(this.field6449, -1);

                  for (int var22 = 0; var22 < this.field6440 * -1862600587; var22++) {
                     this.field6449[this.field6447[var22]] = var3.method13056((byte)1);
                  }

                  this.field6444 = new classZT(this.field6449);
               }

               for (int var23 = 0; var23 < -1862600587 * this.field6440; var23++) {
                  if (var2 != 1479807699) {
                     throw new IllegalStateException();
                  }

                  this.field6452[this.field6447[var23]] = var3.method13056((byte)1);
               }

               if (var8) {
                  if (var2 != 1479807699) {
                     return;
                  }

                  this.field6450 = new int[this.field6442 * -442718787];
                  this.field6451 = new int[-442718787 * this.field6442];

                  for (int var24 = 0; var24 < this.field6440 * -1862600587; var24++) {
                     this.field6450[this.field6447[var24]] = var3.method13056((byte)1);
                     this.field6451[this.field6447[var24]] = var3.method13056((byte)1);
                  }
               }

               for (int var25 = 0; var25 < -1862600587 * this.field6440; var25++) {
                  this.field6446[this.field6447[var25]] = var3.method13056((byte)1);
               }

               if (var4 >= 7) {
                  if (var2 != 1479807699) {
                     throw new IllegalStateException();
                  }

                  for (int var26 = 0; var26 < -1862600587 * this.field6440; var26++) {
                     if (var2 != 1479807699) {
                        throw new IllegalStateException();
                     }

                     this.field6448[this.field6447[var26]] = var3.method13107((short)-539);
                  }

                  for (int var27 = 0; var27 < this.field6440 * -1862600587; var27++) {
                     if (var2 != 1479807699) {
                        throw new IllegalStateException();
                     }

                     int var13 = this.field6447[var27];
                     int var14 = this.field6448[var13];
                     var10 = 0;
                     int var15 = -1;
                     this.field6456[var13] = new int[var14];

                     for (int var16 = 0; var16 < var14; var16++) {
                        int var17 = this.field6456[var13][var16] = var10 += var3.method13107((short)-19540);
                        if (var17 > var15) {
                           if (var2 != 1479807699) {
                              throw new IllegalStateException();
                           }

                           var15 = var17;
                        }
                     }

                     this.field6457[var13] = new Object[1 + var15];
                  }
               } else {
                  for (int var28 = 0; var28 < -1862600587 * this.field6440; var28++) {
                     if (var2 != 1479807699) {
                        return;
                     }

                     this.field6448[this.field6447[var28]] = classXY.method13047(var3, -572332719);
                  }

                  for (int var29 = 0; var29 < -1862600587 * this.field6440; var29++) {
                     if (var2 != 1479807699) {
                        return;
                     }

                     int var31 = this.field6447[var29];
                     int var33 = this.field6448[var31];
                     var10 = 0;
                     int var35 = -1;
                     this.field6456[var31] = new int[var33];

                     for (int var37 = 0; var37 < var33; var37++) {
                        if (var2 != 1479807699) {
                           return;
                        }

                        int var39 = this.field6456[var31][var37] = var10 += classXY.method13047(var3, 398616294);
                        if (var39 > var35) {
                           if (var2 != 1479807699) {
                              throw new IllegalStateException();
                           }

                           var35 = var39;
                        }
                     }

                     this.field6457[var31] = new Object[var35 + 1];
                  }
               }

               if (var6) {
                  if (var2 != 1479807699) {
                     throw new IllegalStateException();
                  }

                  this.field6455 = new int[var11 + 1][];
                  this.field6454 = new classZT[1 + var11];

                  for (int var30 = 0; var30 < -1862600587 * this.field6440; var30++) {
                     if (var2 != 1479807699) {
                        throw new IllegalStateException();
                     }

                     int var32 = this.field6447[var30];
                     int var34 = this.field6448[var32];
                     this.field6455[var32] = new int[this.field6457[var32].length];
                     Arrays.fill(this.field6455[var32], -1);

                     for (int var36 = 0; var36 < var34; var36++) {
                        if (var2 != 1479807699) {
                           throw new IllegalStateException();
                        }

                        if (this.field6456[var32] != null) {
                           if (var2 != 1479807699) {
                              return;
                           }

                           var10000 = this.field6456[var32][var36];
                        } else {
                           var10000 = var36;
                        }

                        int var38 = var10000;
                        this.field6455[var32][var38] = var3.method13056((byte)1);
                     }

                     this.field6454[var32] = new classZT(this.field6455[var32]);
                  }
               }

               return;
            }

            if (var2 != 1479807699) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "va.bw(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Z")
   @ObfuscatedName("cc")
   public static boolean method11802(AbstractArchive var0, int var1) {
      if (var0 == null) {
         var0.method11826(var1);
      }

      if (1 == var0.field6457.length) {
         return var0.method11871(0, var1, (byte)-9);
      } else if (var0.field6457[var1].length == 1) {
         return var0.method11871(var1, 0, (byte)23);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[B")
   @ObfuscatedName("bb")
   public byte[] method11867(int var1, int var2, int var3) {
      int var19 = var2;
      int var18 = var1;
      AbstractArchive var17 = this;
      int var20 = -1784809144;

      byte[] var10000;
      try {
         byte[] var65 = var17.method11872(var18, var19, null, -839280760);
         var10000 = var65;
      } catch (RuntimeException var55) {
         throw classEG.method3884(var55, "va.bb(" + ')');
      }

      byte[] var4 = var10000;
      classVP var5 = (classVP)this;
      if (!OverlayIndex.hasOverlay(var5.method12054(), var1)) {
         return var4;
      } else {
         InputStream var6 = this.getClass().getResourceAsStream("/runelite/" + var5.method12054() + "/" + var1);
         if (var6 == null) {
            client.field1026.warn("Missing overlay data for {}/{}", var5.method12054(), var1);
            return var4;
         } else {
            try {
               InputStream var7 = this.getClass().getResourceAsStream("/runelite/" + var5.method12054() + "/" + var1 + ".hash");

               try {
                  if (var4 == null) {
                     if (var7 != null) {
                        client.field1026.warn("Hash file for non existing archive {}/{}", var5.method12054(), var1);
                        return null;
                     } else {
                        client.field1026.debug("Adding archive {}/{}", var5.method12054(), var1);

                        try {
                           return ByteStreams.toByteArray(var6);
                        } catch (IOException var57) {
                           client.field1026.warn("error loading archive replacement", var57);
                           return null;
                        }
                     }
                  } else if (var7 == null) {
                     client.field1026.warn("Missing hash file for {}/{}", var5.method12054(), var1);
                     return var4;
                  } else {
                     HashCode var8 = Hashing.sha256().hashBytes(var4);
                     String var9 = BaseEncoding.base16().encode(var8.asBytes());

                     try {
                        String var10 = CharStreams.toString(new InputStreamReader(var7));
                        if (var10.equals(var9)) {
                           client.field1026.debug("Replacing archive {}/{}", var5.method12054(), var1);
                           return ByteStreams.toByteArray(var6);
                        }

                        client.field1026
                           .warn("Mismatch in overlaid cache archive hash for {}/{}: {} != {}", new Object[]{var5.method12054(), var1, var10, var9});
                        this.field6445 = true;
                     } catch (IOException var56) {
                        client.field1026.warn("error checking hash", var56);
                     }

                     return var4;
                  }
               } finally {
                  if (var7 != null) {
                     try {
                        var7.close();
                     } catch (IOException var54) {
                        client.field1026.warn(null, var54);
                     }
                  }
               }
            } finally {
               try {
                  var6.close();
               } catch (IOException var53) {
                  client.field1026.warn(null, var53);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ev")
   public int method11847(String var1) {
      var1 = var1.toLowerCase();
      return classZT.method14193(this.field6444, classQI.method9587(var1, 904186689), -2110438931);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I[I)Z")
   @ObfuscatedName("nc")
   public static boolean method11841(AbstractArchive var0, int var1, int[] var2) {
      if (var0 == null) {
         return var0.method11846(var1, var2);
      } else if (null == var0.field6453[var1]) {
         return false;
      } else {
         int var3 = var0.field6448[var1];
         int[] var4 = var0.field6456[var1];
         Object[] var5 = var0.field6457[var1];
         boolean var6 = true;

         for (int var7 = 0; var7 < var3; var7++) {
            if (null == var5[var4[var7]]) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (null == var2 || var2[0] == 0 && 0 == var2[1] && 0 == var2[2] && var2[3] == 0) {
               var19 = PlayerComposition.method6663(var0.field6453[var1], false, -174334988);
            } else {
               var19 = PlayerComposition.method6663(var0.field6453[var1], true, -174334988);
               classXY var8 = new classXY(var19);
               var8.method13136(var2, 5, var8.field6954.length, -1664008178);
            }

            byte[] var20;
            try {
               var20 = classMD.method7538(var19, (byte)72);
            } catch (RuntimeException var18) {
               throw classEG.method3884(
                  var18,
                  ""
                     + (var2 != null)
                     + ","
                     + var1
                     + ","
                     + var19.length
                     + ","
                     + classCV.method2684(var19, var19.length, (byte)-40)
                     + ","
                     + classCV.method2684(var19, var19.length - 2, (byte)-73)
                     + ","
                     + var0.field6452[var1]
                     + ","
                     + -854894521 * var0.field6441
               );
            }

            if (var0.field6437) {
               var0.field6453[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               int var10 = var20[--var9] & 255;
               var9 -= var10 * var3 * 4;
               classXY var11 = new classXY(var20);
               int[] var12 = new int[var3];
               var11.field6955 = -1095856699 * var9;

               for (int var13 = 0; var13 < var10; var13++) {
                  int var14 = 0;

                  for (int var15 = 0; var15 < var3; var15++) {
                     var14 += var11.method13056((byte)1);
                     var12[var15] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for (int var24 = 0; var24 < var3; var24++) {
                  var23[var24] = new byte[var12[var24]];
                  var12[var24] = 0;
               }

               var11.field6955 = var9 * -1095856699;
               int var25 = 0;

               for (int var26 = 0; var26 < var10; var26++) {
                  int var16 = 0;

                  for (int var17 = 0; var17 < var3; var17++) {
                     var16 += var11.method13056((byte)1);
                     System.arraycopy(var20, var25, var23[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var25 += var16;
                  }
               }

               for (int var27 = 0; var27 < var3; var27++) {
                  if (!var0.field6436) {
                     var5[var4[var27]] = classOQ.method8718(var23[var27], false, -59017401);
                  } else {
                     var5[var4[var27]] = var23[var27];
                  }
               }
            } else if (!var0.field6436) {
               var5[var4[0]] = classOQ.method8718(var20, false, 454850578);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("be")
   public boolean method11871(int var1, int var2, byte var3) {
      synchronized (this) {
         int var8 = var2;
         int var7 = var1;
         AbstractArchive var6 = this;
         byte var9 = 57;

         boolean var10000;
         try {
            if (var7 >= 0) {
               if (var9 == 14) {
                  throw new IllegalStateException();
               }

               if (var7 < var6.field6457.length) {
                  if (var9 == 14) {
                     throw new IllegalStateException();
                  }

                  if (var6.field6457[var7] != null && var8 >= 0) {
                     if (var9 == 14) {
                        throw new IllegalStateException();
                     }

                     if (var8 < var6.field6457[var7].length) {
                        if (var6.field6457[var7][var8] != null) {
                           if (var9 == 14) {
                              throw new IllegalStateException();
                           }

                           return true;
                        } else if (var6.field6453[var7] != null) {
                           if (var9 == 14) {
                              throw new IllegalStateException();
                           }

                           return true;
                        } else {
                           var6.vmethod610(var7, -2090620669);
                           if (var6.field6453[var7] != null) {
                              if (var9 == 14) {
                                 throw new IllegalStateException();
                              }

                              boolean var15 = true;
                              var10000 = var15;
                           } else {
                              boolean var16 = false;
                              var10000 = var16;
                           }

                           return var10000;
                        }
                     }

                     if (var9 == 14) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            boolean var12 = false;
            var10000 = var12;
         } catch (RuntimeException var10) {
            throw classEG.method3884(var10, "va.be(" + ')');
         }

         return var10000;
      }
   }

   @ObfuscatedSignature(descriptor = "(II[II)[B")
   @ObfuscatedName("bi")
   byte[] method11872(int var1, int var2, int[] var3, int var4) {
      if (var1 >= 0 && var1 < this.field6457.length && this.field6457[var1] != null && var2 >= 0 && var2 < this.field6457[var1].length) {
         Object var5 = this.field6457[var1][var2];
         if (var5 == null) {
            synchronized (this) {
               Object var7 = this.field6453[var1];
               if (var7 == null) {
                  this.method11877(var1);
               }

               if (!this.method11879(var1, var3)) {
                  return null;
               }

               var5 = this.field6457[var1][var2];
               if (this.field6436) {
                  this.field6457[var1][var2] = null;
               }
            }
         }

         return var5 == null ? null : method11882(var5, false);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)[B")
   @ObfuscatedName("xm")
   public byte[] method11876(int var1, int var2, int[] var3) {
      return this.method11872(var1, var2, var3, -839280760);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)[B")
   @ObfuscatedName("bg")
   public static byte[] method11813(AbstractArchive var0, int var1) {
      if (var0.field6457.length == 1) {
         return var0.method11867(0, var1, -940282324);
      } else if (1 == var0.field6457[var1].length) {
         return var0.method11867(var1, 0, -1270318268);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cw")
   public boolean method11866(int var1, int var2) {
      synchronized (this) {
         int var6 = var1;
         AbstractArchive var5 = this;
         int var7 = -906797091;

         boolean var10000;
         try {
            if (null != var5.field6453[var6]) {
               if (var7 != -906797091) {
                  throw new IllegalStateException();
               }

               boolean var10 = true;
               var10000 = var10;
            } else {
               var5.vmethod610(var6, -684799657);
               if (null != var5.field6453[var6]) {
                  if (var7 != -906797091) {
                     throw new IllegalStateException();
                  }

                  boolean var11 = true;
                  var10000 = var11;
               } else {
                  boolean var12 = false;
                  var10000 = var12;
               }
            }
         } catch (RuntimeException var8) {
            throw classEG.method3884(var8, "va.bq(" + ')');
         }

         return var10000;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ab")
   void vmethod610(int var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "va.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
   @ObfuscatedName("cd")
   public byte[] method11854(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = classZT.method14193(this.field6444, classQI.method9587(var1, 944207945), -2104715742);
         int var5 = classZT.method14193(this.field6454[var4], classQI.method9587(var2, 1165737786), -2066745604);
         return this.method11867(var4, var5, -703145795);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "va.cd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bf")
   public boolean method11811(int var1) {
      try {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.field6447.length; var3++) {
            if (var1 >= 1484841107) {
               throw new IllegalStateException();
            }

            int var4 = this.field6447[var3];
            if (null == this.field6453[var4]) {
               if (var1 >= 1484841107) {
                  throw new IllegalStateException();
               }

               this.vmethod610(var4, -1359343459);
               if (this.field6453[var4] == null) {
                  if (var1 >= 1484841107) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "va.bf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bz")
   public int method11832(byte var1) {
      try {
         return this.field6442 * -442718787;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "va.bz(" + 41);
      }
   }

   public boolean isOverlayOutdated() {
      return this.field6445;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("cr")
   public void method11870(byte var1) {
      for (int var2 = 0; var2 < this.field6453.length; var2++) {
         if (this.field6453[var2] instanceof classZW) {
            ((classZW)this.field6453[var2]).method14213();
         }

         this.field6453[var2] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cu")
   public void method11865(int var1, int var2) {
      for (int var3 = 0; var3 < this.field6457[var1].length; var3++) {
         if (this.field6457[var1][var3] instanceof classZW) {
            ((classZW)this.field6457[var1][var3]).method14213();
         }

         this.field6457[var1][var3] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("cb")
   public void method11863(byte var1) {
      for (int var2 = 0; var2 < this.field6457.length; var2++) {
         if (this.field6457[var2] != null) {
            for (int var3 = 0; var3 < this.field6457[var2].length; var3++) {
               if (this.field6457[var2][var3] instanceof classZW) {
                  ((classZW)this.field6457[var2][var3]).method14213();
               }

               this.field6457[var2][var3] = null;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[II)Z")
   @ObfuscatedName("ct")
   boolean method11842(int var1, int[] var2, int var3) {
      this.method11869(var1, var2);

      try {
         if (null == this.field6453[var1]) {
            if (var3 == 680482133) {
               throw new IllegalStateException();
            } else {
               this.method11874(var1, var2);
               return false;
            }
         } else {
            int var4 = this.field6448[var1];
            int[] var5 = this.field6456[var1];
            Object[] var6 = this.field6457[var1];
            boolean var7 = true;

            for (int var8 = 0; var8 < var4; var8++) {
               if (var3 == 680482133) {
                  throw new IllegalStateException();
               }

               if (null == var6[var5[var8]]) {
                  if (var3 == 680482133) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
                  break;
               }
            }

            if (var7) {
               if (var3 == 680482133) {
                  throw new IllegalStateException();
               } else {
                  this.method11874(var1, var2);
                  return true;
               }
            } else {
               byte[] var21;
               label188: {
                  label187: {
                     if (null != var2) {
                        if (var3 == 680482133) {
                           throw new IllegalStateException();
                        }

                        if (var2[0] != 0) {
                           break label187;
                        }

                        if (var3 == 680482133) {
                           throw new IllegalStateException();
                        }

                        if (0 != var2[1] || 0 != var2[2]) {
                           break label187;
                        }

                        if (var2[3] != 0) {
                           if (var3 == 680482133) {
                              throw new IllegalStateException();
                           }
                           break label187;
                        }
                     }

                     var21 = PlayerComposition.method6663(this.field6453[var1], false, -174334988);
                     break label188;
                  }

                  var21 = PlayerComposition.method6663(this.field6453[var1], true, -174334988);
                  classXY var9 = new classXY(var21);
                  var9.method13136(var2, 5, var9.field6954.length, -1664008178);
               }

               byte[] var22;
               try {
                  var22 = classMD.method7538(var21, (byte)93);
               } catch (RuntimeException var19) {
                  StringBuilder var10001 = new StringBuilder().append("");
                  boolean var10002;
                  if (var2 != null) {
                     if (var3 == 680482133) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  throw classEG.method3884(
                     var19,
                     var10001.append(var10002)
                        .append(",")
                        .append(var1)
                        .append(",")
                        .append(var21.length)
                        .append(",")
                        .append(classCV.method2684(var21, var21.length, (byte)-57))
                        .append(",")
                        .append(classCV.method2684(var21, var21.length - 2, (byte)6))
                        .append(",")
                        .append(this.field6452[var1])
                        .append(",")
                        .append(-854894521 * this.field6441)
                        .toString()
                  );
               }

               if (this.field6437) {
                  if (var3 == 680482133) {
                     throw new IllegalStateException();
                  }

                  this.field6453[var1] = null;
               }

               if (var4 > 1) {
                  int var10 = var22.length;
                  int var11 = var22[--var10] & 255;
                  var10 -= var11 * var4 * 4;
                  classXY var12 = new classXY(var22);
                  int[] var13 = new int[var4];
                  var12.field6955 = -1095856699 * var10;

                  for (int var14 = 0; var14 < var11; var14++) {
                     if (var3 == 680482133) {
                        throw new IllegalStateException();
                     }

                     int var15 = 0;

                     for (int var16 = 0; var16 < var4; var16++) {
                        if (var3 == 680482133) {
                           throw new IllegalStateException();
                        }

                        var15 += var12.method13056((byte)1);
                        var13[var16] += var15;
                     }
                  }

                  byte[][] var25 = new byte[var4][];

                  for (int var26 = 0; var26 < var4; var26++) {
                     if (var3 == 680482133) {
                        throw new IllegalStateException();
                     }

                     var25[var26] = new byte[var13[var26]];
                     var13[var26] = 0;
                  }

                  var12.field6955 = var10 * -1095856699;
                  int var27 = 0;

                  for (int var28 = 0; var28 < var11; var28++) {
                     if (var3 == 680482133) {
                        throw new IllegalStateException();
                     }

                     int var17 = 0;

                     for (int var18 = 0; var18 < var4; var18++) {
                        if (var3 == 680482133) {
                           throw new IllegalStateException();
                        }

                        var17 += var12.method13056((byte)1);
                        System.arraycopy(var22, var27, var25[var18], var13[var18], var17);
                        var13[var18] += var17;
                        var27 += var17;
                     }
                  }

                  for (int var29 = 0; var29 < var4; var29++) {
                     if (var3 == 680482133) {
                        throw new IllegalStateException();
                     }

                     if (!this.field6436) {
                        if (var3 == 680482133) {
                           throw new IllegalStateException();
                        }

                        var6[var5[var29]] = classOQ.method8718(var25[var29], false, -1322135147);
                     } else {
                        var6[var5[var29]] = var25[var29];
                     }
                  }
               } else if (!this.field6436) {
                  if (var3 == 680482133) {
                     throw new IllegalStateException();
                  }

                  var6[var5[0]] = classOQ.method8718(var22, false, -520316564);
               } else {
                  var6[var5[0]] = var22;
               }

               this.method11874(var1, var2);
               return true;
            }
         }
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "va.ct(" + ')');
      }
   }

   AbstractArchive(boolean var1, boolean var2) {
      this.field6437 = var1;
      this.field6436 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dv")
   public int method11830(int var1) {
      return null != this.field6457 && var1 < this.field6457.length && this.field6457[var1] != null ? this.field6457[var1].length : 0;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
   @ObfuscatedName("cv")
   public boolean method11859(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = classZT.method14193(this.field6444, classQI.method9587(var1, 864611726), -2128373051);
         int var5 = classZT.method14193(this.field6454[var4], classQI.method9587(var2, 2062653392), -2128802975);
         return this.method11871(var4, var5, (byte)57);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "va.cv(" + ')');
      }
   }

   public int[] getFileIds(int var1) {
      return this.method11824(var1, -1868977307);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Z")
   @ObfuscatedName("se")
   public static boolean method11803(AbstractArchive var0, int var1) {
      if (1 == var0.field6457.length) {
         return var0.method11871(0, var1, (byte)-36);
      } else if (var0.field6457[var1].length == 1) {
         return var0.method11871(var1, 0, (byte)11);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("dr")
   public byte[] method11797(int var1, int var2) {
      return this.method11872(var1, var2, null, 1436447374);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   void vmethod611(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("cp")
   public int method11848(String var1, int var2) {
      try {
         var1 = var1.toLowerCase();
         return classZT.method14193(this.field6444, classQI.method9587(var1, 1845525662), -2102421027);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "va.cp(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("xp")
   public static void method11838(AbstractArchive var0) {
      if (var0 == null) {
         var0.isOverlayOutdated();
      }

      for (int var1 = 0; var1 < var0.field6457.length; var1++) {
         if (var0.field6457[var1] != null) {
            for (int var2 = 0; var2 < var0.field6457[var1].length; var2++) {
               var0.field6457[var1][var2] = null;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("cs")
   static final byte[] method11789(byte[] var0) {
      classXY var1 = new classXY(var0);
      int var2 = classXY.method13039(var1, -346779531);
      int var3 = var1.method13056((byte)1);
      if (var3 >= 0 && (0 == -1099343951 * field6438 || var3 <= -1099343951 * field6438)) {
         if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.method13084(var6, 0, var3, (byte)16);
            return var6;
         } else {
            int var4 = var1.method13056((byte)1);
            if (var4 >= 0 && (0 == field6438 * -1099343951 || var4 <= field6438 * -1099343951)) {
               byte[] var5 = new byte[var4];
               if (var2 == 1) {
                  classYG.method13331(var5, var4, var0, var3, 9);
               } else {
                  classAAT.method269(field6439, var1, var5, 752193851);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)Z")
   @ObfuscatedName("ek")
   boolean method11843(int var1, int[] var2) {
      if (null == this.field6453[var1]) {
         return false;
      } else {
         int var3 = this.field6448[var1];
         int[] var4 = this.field6456[var1];
         Object[] var5 = this.field6457[var1];
         boolean var6 = true;

         for (int var7 = 0; var7 < var3; var7++) {
            if (null == var5[var4[var7]]) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (null == var2 || var2[0] == 0 && 0 == var2[1] && 0 == var2[2] && var2[3] == 0) {
               var19 = PlayerComposition.method6663(this.field6453[var1], false, -174334988);
            } else {
               var19 = PlayerComposition.method6663(this.field6453[var1], true, -174334988);
               classXY var8 = new classXY(var19);
               var8.method13136(var2, 5, var8.field6954.length, -1664008178);
            }

            byte[] var20;
            try {
               var20 = classMD.method7538(var19, (byte)13);
            } catch (RuntimeException var18) {
               throw classEG.method3884(
                  var18,
                  ""
                     + (var2 != null)
                     + ","
                     + var1
                     + ","
                     + var19.length
                     + ","
                     + classCV.method2684(var19, var19.length, (byte)26)
                     + ","
                     + classCV.method2684(var19, var19.length - 2, (byte)-64)
                     + ","
                     + this.field6452[var1]
                     + ","
                     + -854894521 * this.field6441
               );
            }

            if (this.field6437) {
               this.field6453[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               int var10 = var20[--var9] & 255;
               var9 -= var10 * var3 * 4;
               classXY var11 = new classXY(var20);
               int[] var12 = new int[var3];
               var11.field6955 = -1095856699 * var9;

               for (int var13 = 0; var13 < var10; var13++) {
                  int var14 = 0;

                  for (int var15 = 0; var15 < var3; var15++) {
                     var14 += var11.method13056((byte)1);
                     var12[var15] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for (int var24 = 0; var24 < var3; var24++) {
                  var23[var24] = new byte[var12[var24]];
                  var12[var24] = 0;
               }

               var11.field6955 = var9 * -1095856699;
               int var25 = 0;

               for (int var26 = 0; var26 < var10; var26++) {
                  int var16 = 0;

                  for (int var17 = 0; var17 < var3; var17++) {
                     var16 += var11.method13056((byte)1);
                     System.arraycopy(var20, var25, var23[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var25 += var16;
                  }
               }

               for (int var27 = 0; var27 < var3; var27++) {
                  if (!this.field6436) {
                     var5[var4[var27]] = classOQ.method8718(var23[var27], false, 304135976);
                  } else {
                     var5[var4[var27]] = var23[var27];
                  }
               }
            } else if (!this.field6436) {
               var5[var4[0]] = classOQ.method8718(var20, false, -1752306650);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
   @ObfuscatedName("el")
   public boolean method11852(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = classZT.method14193(this.field6444, classQI.method9587(var1, 1922263806), -2100537001);
      if (var3 < 0) {
         return false;
      } else {
         int var4 = classZT.method14193(this.field6454[var3], classQI.method9587(var2, 923161390), -2141017414);
         return var4 >= 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("ck")
   static final byte[] method11790(byte[] var0) {
      classXY var1 = new classXY(var0);
      int var2 = classXY.method13039(var1, -346779531);
      int var3 = var1.method13056((byte)1);
      if (var3 >= 0 && (0 == 1326196087 * field6438 || var3 <= -1099343951 * field6438)) {
         if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.method13084(var6, 0, var3, (byte)113);
            return var6;
         } else {
            int var4 = var1.method13056((byte)1);
            if (var4 >= 0 && (0 == field6438 * -1099343951 || var4 <= field6438 * -461127009)) {
               byte[] var5 = new byte[var4];
               if (var2 == 1) {
                  classYG.method13331(var5, var4, var0, var3, 9);
               } else {
                  classAAT.method269(field6439, var1, var5, -1277094573);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("cl")
   public void method11869(int var1, int[] var2) {
      this.field6443 = this.field6453[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dc")
   public boolean method11809(int var1) {
      if (null != this.field6453[var1]) {
         return true;
      } else {
         this.vmethod610(var1, -1062800015);
         return null != this.field6453[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cc")
   void method11795(byte[] var1) {
      this.field6441 = classCV.method2684(var1, var1.length, (byte)-57) * 945574357;
      classXY var2 = new classXY(classMD.method7538(var1, (byte)50));
      int var3 = classXY.method13039(var2, -346779531);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.method13056((byte)1);
         }

         int var4 = classXY.method13039(var2, -346779531);
         boolean var5 = 0 != (var4 & 1);
         boolean var6 = (var4 & 2) != 0;
         boolean var7 = 0 != (var4 & 4);
         boolean var8 = 0 != (var4 & 8);
         if (var6) {
            throw new UnsupportedOperationException("");
         } else if (var8) {
            throw new UnsupportedOperationException("");
         } else {
            if (var3 >= 7) {
               this.field6440 = var2.method13107((short)323) * 640575568;
            } else {
               this.field6440 = classXY.method13047(var2, -1489112566) * 911284189;
            }

            int var9 = 0;
            int var10 = -1;
            this.field6447 = new int[1711773878 * this.field6440];
            if (var3 >= 7) {
               for (int var11 = 0; var11 < this.field6440 * 82434612; var11++) {
                  this.field6447[var11] = var9 += var2.method13107((short)-9104);
                  if (this.field6447[var11] > var10) {
                     var10 = this.field6447[var11];
                  }
               }
            } else {
               for (int var19 = 0; var19 < this.field6440 * -1862600587; var19++) {
                  this.field6447[var19] = var9 += classXY.method13047(var2, 652549953);
                  if (this.field6447[var19] > var10) {
                     var10 = this.field6447[var19];
                  }
               }
            }

            this.field6442 = (var10 + 1) * 2034482581;
            this.field6452 = new int[-1807062846 * this.field6442];
            this.field6446 = new int[-2075121294 * this.field6442];
            this.field6448 = new int[1685017034 * this.field6442];
            this.field6456 = new int[939387744 * this.field6442][];
            this.field6453 = new Object[this.field6442 * -1742518581];
            this.field6457 = new Object[116930679 * this.field6442][];
            if (var5) {
               this.field6449 = new int[-442718787 * this.field6442];
               Arrays.fill(this.field6449, -1);

               for (int var20 = 0; var20 < this.field6440 * -2069029272; var20++) {
                  this.field6449[this.field6447[var20]] = var2.method13056((byte)1);
               }

               this.field6444 = new classZT(this.field6449);
            }

            for (int var21 = 0; var21 < -1862600587 * this.field6440; var21++) {
               this.field6452[this.field6447[var21]] = var2.method13056((byte)1);
            }

            if (var7) {
               this.field6450 = new int[this.field6442 * 1271305401];
               this.field6451 = new int[1650944627 * this.field6442];

               for (int var22 = 0; var22 < this.field6440 * 987761614; var22++) {
                  this.field6450[this.field6447[var22]] = var2.method13056((byte)1);
                  this.field6451[this.field6447[var22]] = var2.method13056((byte)1);
               }
            }

            for (int var23 = 0; var23 < -1862600587 * this.field6440; var23++) {
               this.field6446[this.field6447[var23]] = var2.method13056((byte)1);
            }

            if (var3 >= 7) {
               for (int var24 = 0; var24 < 116835506 * this.field6440; var24++) {
                  this.field6448[this.field6447[var24]] = var2.method13107((short)10248);
               }

               for (int var25 = 0; var25 < this.field6440 * -710764139; var25++) {
                  int var12 = this.field6447[var25];
                  int var13 = this.field6448[var12];
                  var9 = 0;
                  int var14 = -1;
                  this.field6456[var12] = new int[var13];

                  for (int var15 = 0; var15 < var13; var15++) {
                     int var16 = this.field6456[var12][var15] = var9 += var2.method13107((short)11347);
                     if (var16 > var14) {
                        var14 = var16;
                     }
                  }

                  this.field6457[var12] = new Object[1 + var14];
               }
            } else {
               for (int var26 = 0; var26 < -1399199723 * this.field6440; var26++) {
                  this.field6448[this.field6447[var26]] = classXY.method13047(var2, 889767870);
               }

               for (int var27 = 0; var27 < -1862600587 * this.field6440; var27++) {
                  int var29 = this.field6447[var27];
                  int var31 = this.field6448[var29];
                  var9 = 0;
                  int var33 = -1;
                  this.field6456[var29] = new int[var31];

                  for (int var35 = 0; var35 < var31; var35++) {
                     int var37 = this.field6456[var29][var35] = var9 += classXY.method13047(var2, 556892208);
                     if (var37 > var33) {
                        var33 = var37;
                     }
                  }

                  this.field6457[var29] = new Object[var33 + 1];
               }
            }

            if (var5) {
               this.field6455 = new int[var10 + 1][];
               this.field6454 = new classZT[1 + var10];

               for (int var28 = 0; var28 < -1621565740 * this.field6440; var28++) {
                  int var30 = this.field6447[var28];
                  int var32 = this.field6448[var30];
                  this.field6455[var30] = new int[this.field6457[var30].length];
                  Arrays.fill(this.field6455[var30], -1);

                  for (int var34 = 0; var34 < var32; var34++) {
                     int var36 = this.field6456[var30] != null ? this.field6456[var30][var34] : var34;
                     this.field6455[var30][var36] = var2.method13056((byte)1);
                  }

                  this.field6454[var30] = new classZT(this.field6455[var30]);
               }
            }
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cf")
   void method11796(byte[] var1) {
      this.field6441 = classCV.method2684(var1, var1.length, (byte)-41) * -1019941158;
      classXY var2 = new classXY(classMD.method7538(var1, (byte)122));
      int var3 = classXY.method13039(var2, -346779531);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.method13056((byte)1);
         }

         int var4 = classXY.method13039(var2, -346779531);
         boolean var5 = 0 != (var4 & 1);
         boolean var6 = (var4 & 2) != 0;
         boolean var7 = 0 != (var4 & 4);
         boolean var8 = 0 != (var4 & 8);
         if (var6) {
            throw new UnsupportedOperationException("");
         } else if (var8) {
            throw new UnsupportedOperationException("");
         } else {
            if (var3 >= 7) {
               this.field6440 = var2.method13107((short)-1693) * 911284189;
            } else {
               this.field6440 = classXY.method13047(var2, 1120192273) * -2056517136;
            }

            int var9 = 0;
            int var10 = -1;
            this.field6447 = new int[239589402 * this.field6440];
            if (var3 >= 7) {
               for (int var11 = 0; var11 < this.field6440 * -1862600587; var11++) {
                  this.field6447[var11] = var9 += var2.method13107((short)-25069);
                  if (this.field6447[var11] > var10) {
                     var10 = this.field6447[var11];
                  }
               }
            } else {
               for (int var19 = 0; var19 < this.field6440 * -65952741; var19++) {
                  this.field6447[var19] = var9 += classXY.method13047(var2, 155746105);
                  if (this.field6447[var19] > var10) {
                     var10 = this.field6447[var19];
                  }
               }
            }

            this.field6442 = (var10 + 1) * 2034482581;
            this.field6452 = new int[-442718787 * this.field6442];
            this.field6446 = new int[1939516170 * this.field6442];
            this.field6448 = new int[-1207187970 * this.field6442];
            this.field6456 = new int[222093975 * this.field6442][];
            this.field6453 = new Object[this.field6442 * 1783716551];
            this.field6457 = new Object[-442718787 * this.field6442][];
            if (var5) {
               this.field6449 = new int[-442718787 * this.field6442];
               Arrays.fill(this.field6449, -1);

               for (int var20 = 0; var20 < this.field6440 * -1862600587; var20++) {
                  this.field6449[this.field6447[var20]] = var2.method13056((byte)1);
               }

               this.field6444 = new classZT(this.field6449);
            }

            for (int var21 = 0; var21 < -1862600587 * this.field6440; var21++) {
               this.field6452[this.field6447[var21]] = var2.method13056((byte)1);
            }

            if (var7) {
               this.field6450 = new int[this.field6442 * -1056944305];
               this.field6451 = new int[-442718787 * this.field6442];

               for (int var22 = 0; var22 < this.field6440 * 1665911051; var22++) {
                  this.field6450[this.field6447[var22]] = var2.method13056((byte)1);
                  this.field6451[this.field6447[var22]] = var2.method13056((byte)1);
               }
            }

            for (int var23 = 0; var23 < -1862600587 * this.field6440; var23++) {
               this.field6446[this.field6447[var23]] = var2.method13056((byte)1);
            }

            if (var3 >= 7) {
               for (int var24 = 0; var24 < -1862600587 * this.field6440; var24++) {
                  this.field6448[this.field6447[var24]] = var2.method13107((short)15672);
               }

               for (int var25 = 0; var25 < this.field6440 * -1862600587; var25++) {
                  int var12 = this.field6447[var25];
                  int var13 = this.field6448[var12];
                  var9 = 0;
                  int var14 = -1;
                  this.field6456[var12] = new int[var13];

                  for (int var15 = 0; var15 < var13; var15++) {
                     int var16 = this.field6456[var12][var15] = var9 += var2.method13107((short)-9083);
                     if (var16 > var14) {
                        var14 = var16;
                     }
                  }

                  this.field6457[var12] = new Object[1 + var14];
               }
            } else {
               for (int var26 = 0; var26 < -1862600587 * this.field6440; var26++) {
                  this.field6448[this.field6447[var26]] = classXY.method13047(var2, -1061707454);
               }

               for (int var27 = 0; var27 < 1313379298 * this.field6440; var27++) {
                  int var29 = this.field6447[var27];
                  int var31 = this.field6448[var29];
                  var9 = 0;
                  int var33 = -1;
                  this.field6456[var29] = new int[var31];

                  for (int var35 = 0; var35 < var31; var35++) {
                     int var37 = this.field6456[var29][var35] = var9 += classXY.method13047(var2, -963472163);
                     if (var37 > var33) {
                        var33 = var37;
                     }
                  }

                  this.field6457[var29] = new Object[var33 + 1];
               }
            }

            if (var5) {
               this.field6455 = new int[var10 + 1][];
               this.field6454 = new classZT[1 + var10];

               for (int var28 = 0; var28 < -1727844432 * this.field6440; var28++) {
                  int var30 = this.field6447[var28];
                  int var32 = this.field6448[var30];
                  this.field6455[var30] = new int[this.field6457[var30].length];
                  Arrays.fill(this.field6455[var30], -1);

                  for (int var34 = 0; var34 < var32; var34++) {
                     int var36 = this.field6456[var30] != null ? this.field6456[var30][var34] : var34;
                     this.field6455[var30][var36] = var2.method13056((byte)1);
                  }

                  this.field6454[var30] = new classZT(this.field6455[var30]);
               }
            }
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("du")
   public byte[] method11798(int var1, int var2) {
      return this.method11872(var1, var2, null, -235572209);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bq")
   public boolean method11800(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field6457.length && this.field6457[var1] != null && var2 >= 0 && var2 < this.field6457[var1].length) {
         if (this.field6457[var1][var2] != null) {
            return true;
         } else if (this.field6453[var1] != null) {
            return true;
         } else {
            this.vmethod610(var1, -1132072373);
            return this.field6453[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   void vmethod612(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ci")
   public boolean method11804(int var1) {
      if (1 == this.field6457.length) {
         return this.method11871(0, var1, (byte)50);
      } else if (this.field6457[var1].length == 1) {
         return this.method11871(var1, 0, (byte)86);
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("co")
   static final byte[] method11791(byte[] var0) {
      classXY var1 = new classXY(var0);
      int var2 = classXY.method13039(var1, -346779531);
      int var3 = var1.method13056((byte)1);
      if (var3 >= 0 && (0 == -1099343951 * field6438 || var3 <= -1099343951 * field6438)) {
         if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.method13084(var6, 0, var3, (byte)81);
            return var6;
         } else {
            int var4 = var1.method13056((byte)1);
            if (var4 >= 0 && (0 == field6438 * -1099343951 || var4 <= field6438 * 1685882827)) {
               byte[] var5 = new byte[var4];
               if (var2 == 1) {
                  classYG.method13331(var5, var4, var0, var3, 9);
               } else {
                  classAAT.method269(field6439, var1, var5, 1403104232);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dd")
   public boolean method11810(int var1) {
      if (null != this.field6453[var1]) {
         return true;
      } else {
         this.vmethod610(var1, -1773435163);
         return null != this.field6453[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("hl")
   static boolean method11864(int var0) {
      try {
         boolean var10000;
         if (ClientPreferences.method2793(classAB.field122, (byte)-115) >= 347524667 * client.field886) {
            if (var0 != -2053271753) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "va.hl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cw")
   public void method11877(int var1) {
      this.vmethod610(var1, 1021458986);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   void vmethod613(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("ch")
   public byte[] method11817(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field6457.length && this.field6457[var1] != null && var2 >= 0 && var2 < this.field6457[var1].length) {
         if (this.field6457[var1][var2] == null) {
            boolean var3 = this.method11842(var1, null, -1877833434);
            if (!var3) {
               this.vmethod610(var1, 619656921);
               var3 = this.method11842(var1, null, 34433207);
               if (!var3) {
                  return null;
               }
            }
         }

         return PlayerComposition.method6663(this.field6457[var1][var2], false, -174334988);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dm")
   public boolean method11812() {
      boolean var1 = true;

      for (int var2 = 0; var2 < this.field6447.length; var2++) {
         int var3 = this.field6447[var2];
         if (null == this.field6453[var3]) {
            this.vmethod610(var3, 1132861107);
            if (this.field6453[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(III)[B")
   @ObfuscatedName("bd")
   public byte[] method11873(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < this.field6457.length && this.field6457[var1] != null && var2 >= 0 && var2 < this.field6457[var1].length) {
         Object var4 = this.field6457[var1][var2];
         if (var4 == null) {
            synchronized (this) {
               Object var6 = this.field6453[var1];
               if (var6 == null) {
                  this.method11877(var1);
               }

               this.method11879(var1, null);
               var4 = this.field6457[var1][var2];
            }
         }

         return var4 == null ? null : method11882(var4, false);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)[B")
   @ObfuscatedName("lc")
   public static byte[] method11814(AbstractArchive var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11816(var1, var1);
      }

      try {
         if (var0.field6457.length == 1) {
            if (var2 == -672458971) {
               throw new IllegalStateException();
            } else {
               return var0.method11867(0, var1, -2126116436);
            }
         } else if (1 == var0.field6457[var1].length) {
            return var0.method11867(var1, 0, -1819242288);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "va.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("bs")
   public byte[] method11818(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field6457.length && this.field6457[var1] != null && var2 >= 0 && var2 < this.field6457[var1].length) {
         if (this.field6457[var1][var2] == null) {
            boolean var3 = this.method11842(var1, null, 277588367);
            if (!var3) {
               this.vmethod610(var1, -389102148);
               var3 = this.method11842(var1, null, 1971156755);
               if (!var3) {
                  return null;
               }
            }
         }

         return PlayerComposition.method6663(this.field6457[var1][var2], false, -174334988);
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;)Z")
   @ObfuscatedName("rz")
   public static boolean method11860(AbstractArchive var0, String var1, String var2) {
      if (var0 == null) {
         var0.method11849(var1);
      }

      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = classZT.method14193(var0.field6444, classQI.method9587(var1, 1775438273), -2135491150);
      int var4 = classZT.method14193(var0.field6454[var3], classQI.method9587(var2, 1908322384), -2122132110);
      return var0.method11871(var3, var4, (byte)-38);
   }

   public byte[] loadData(int var1, int var2) {
      return this.method11867(var1, var2, -1784809144);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;)[B")
   @ObfuscatedName("dk")
   public static byte[] method11855(AbstractArchive var0, String var1, String var2) {
      if (var0 == null) {
         var0.isOverlayOutdated();
      }

      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = classZT.method14193(var0.field6444, classQI.method9587(var1, 2042302156), -2126822988);
      int var4 = classZT.method14193(var0.field6454[var3], classQI.method9587(var2, 888462362), -2146511637);
      return var0.method11867(var3, var4, -772510071);
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("cn")
   public byte[] method11819(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field6457.length && this.field6457[var1] != null && var2 >= 0 && var2 < this.field6457[var1].length) {
         if (this.field6457[var1][var2] == null) {
            boolean var3 = this.method11842(var1, null, -1676262302);
            if (!var3) {
               this.vmethod610(var1, 410538434);
               var3 = this.method11842(var1, null, -1303036171);
               if (!var3) {
                  return null;
               }
            }
         }

         return PlayerComposition.method6663(this.field6457[var1][var2], false, -174334988);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("wb")
   public byte[] method11820(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field6457.length && this.field6457[var1] != null && var2 >= 0 && var2 < this.field6457[var1].length) {
         if (this.field6457[var1][var2] == null) {
            boolean var3 = this.method11842(var1, null, -1679392097);
            if (!var3) {
               this.vmethod610(var1, -1089707517);
               var3 = this.method11842(var1, null, -1619425384);
               if (!var3) {
                  return null;
               }
            }
         }

         return PlayerComposition.method6663(this.field6457[var1][var2], false, -174334988);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("dk")
   public byte[] method11821(int var1) {
      if (1 == this.field6457.length) {
         return this.method11873(0, var1, 1635413985);
      } else if (this.field6457[var1].length == 1) {
         return this.method11873(var1, 0, -1044345618);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cx")
   public boolean method11805(int var1) {
      if (1 == this.field6457.length) {
         return this.method11871(0, var1, (byte)-108);
      } else if (this.field6457[var1].length == 1) {
         return this.method11871(var1, 0, (byte)3);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;I)Z")
   @ObfuscatedName("nq")
   public static boolean method11853(AbstractArchive var0, String var1, String var2, int var3) {
      if (var0 == null) {
         return var0.method11862(var1, var1, var3);
      } else {
         try {
            var1 = var1.toLowerCase();
            var2 = var2.toLowerCase();
            int var4 = classZT.method14193(var0.field6444, classQI.method9587(var1, 1786709651), -2146087740);
            if (var4 < 0) {
               if (var3 <= -1335263258) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               int var5 = classZT.method14193(var0.field6454[var4], classQI.method9587(var2, 1091217424), -2097093371);
               return var5 >= 0;
            }
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "va.cl(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("xk")
   public void method11874(int var1, int[] var2) {
      if (this.field6437 && this.field6453[var1] == null && this.field6443 instanceof classZW) {
         ((classZW)this.field6443).method14213();
      }

      this.field6443 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("bn")
   public static void method11836(AbstractArchive var0) {
      if (var0 == null) {
         var0.method11812();
      }

      for (int var1 = 0; var1 < var0.field6453.length; var1++) {
         var0.field6453[var1] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("dw")
   public int[] method11825(int var1) {
      return var1 >= 0 && var1 < this.field6456.length ? this.field6456[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("dh")
   public int[] method11826(int var1) {
      return var1 >= 0 && var1 < this.field6456.length ? this.field6456[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)I")
   @ObfuscatedName("cq")
   public int method11851(int var1, String var2, byte var3) {
      try {
         var2 = var2.toLowerCase();
         return classZT.method14193(this.field6454[var1], classQI.method9587(var2, 1751591396), -2086318994);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "va.cq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dn")
   public int method11831(int var1) {
      return null != this.field6457 && var1 < this.field6457.length && this.field6457[var1] != null ? this.field6457[var1].length : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("cy")
   static final byte[] method11792(byte[] var0) {
      classXY var1 = new classXY(var0);
      int var2 = classXY.method13039(var1, -346779531);
      int var3 = var1.method13056((byte)1);
      if (var3 >= 0 && (0 == -1099343951 * field6438 || var3 <= -1099343951 * field6438)) {
         if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.method13084(var6, 0, var3, (byte)111);
            return var6;
         } else {
            int var4 = var1.method13056((byte)1);
            if (var4 >= 0 && (0 == field6438 * -1099343951 || var4 <= field6438 * -1099343951)) {
               byte[] var5 = new byte[var4];
               if (var2 == 1) {
                  classYG.method13331(var5, var4, var0, var3, 9);
               } else {
                  classAAT.method269(field6439, var1, var5, 1974386164);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cg")
   public boolean method11801(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field6457.length && this.field6457[var1] != null && var2 >= 0 && var2 < this.field6457[var1].length) {
         if (this.field6457[var1][var2] != null) {
            return true;
         } else if (this.field6453[var1] != null) {
            return true;
         } else {
            this.vmethod610(var1, -1150747092);
            return this.field6453[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dq")
   public int method11833() {
      return this.field6442 * -1727728404;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dg")
   public int method11834() {
      return this.field6442 * -442718787;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dl")
   public int method11835() {
      return this.field6442 * -442718787;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("de")
   public int[] method11827(int var1) {
      return var1 >= 0 && var1 < this.field6456.length ? this.field6456[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ds")
   public void method11837(int var1) {
      for (int var2 = 0; var2 < this.field6457[var1].length; var2++) {
         this.field6457[var1][var2] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("bl")
   public byte[] method11878(int var1, int var2) {
      return this.method11873(var1, var2, 2044601435);
   }

   @ObfuscatedSignature(descriptor = "(I[I)Z")
   @ObfuscatedName("wd")
   public boolean method11879(int var1, int[] var2) {
      return this.method11842(var1, var2, -2043523761);
   }

   @ObfuscatedSignature(descriptor = "(Lva;II)[B")
   @ObfuscatedName("by")
   public static byte[] method11822(AbstractArchive var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11823(var1, var1);
      }

      try {
         if (1 == var0.field6457.length) {
            if (var2 == 1789555459) {
               throw new IllegalStateException();
            } else {
               return var0.method11873(0, var1, 488646171);
            }
         } else if (var0.field6457[var1].length == 1) {
            if (var2 == 1789555459) {
               throw new IllegalStateException();
            } else {
               return var0.method11873(var1, 0, -782572774);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "va.bl(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)[I")
   @ObfuscatedName("yb")
   public static int[] method11828(AbstractArchive var0, int var1) {
      if (var0 == null) {
         var0.method11804(var1);
      }

      return var1 >= 0 && var1 < var0.field6456.length ? var0.field6456[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dj")
   public void method11839() {
      for (int var1 = 0; var1 < this.field6457.length; var1++) {
         if (this.field6457[var1] != null) {
            for (int var2 = 0; var2 < this.field6457[var1].length; var2++) {
               this.field6457[var1][var2] = null;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dp")
   public void method11840() {
      for (int var1 = 0; var1 < this.field6457.length; var1++) {
         if (this.field6457[var1] != null) {
            for (int var2 = 0; var2 < this.field6457[var1].length; var2++) {
               this.field6457[var1][var2] = null;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I[I)Z")
   @ObfuscatedName("vp")
   public static boolean method11844(AbstractArchive var0, int var1, int[] var2) {
      if (null == var0.field6453[var1]) {
         return false;
      } else {
         int var3 = var0.field6448[var1];
         int[] var4 = var0.field6456[var1];
         Object[] var5 = var0.field6457[var1];
         boolean var6 = true;

         for (int var7 = 0; var7 < var3; var7++) {
            if (null == var5[var4[var7]]) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (null == var2 || var2[0] == 0 && 0 == var2[1] && 0 == var2[2] && var2[3] == 0) {
               var19 = PlayerComposition.method6663(var0.field6453[var1], false, -174334988);
            } else {
               var19 = PlayerComposition.method6663(var0.field6453[var1], true, -174334988);
               classXY var8 = new classXY(var19);
               var8.method13136(var2, 5, var8.field6954.length, -1664008178);
            }

            byte[] var20;
            try {
               var20 = classMD.method7538(var19, (byte)59);
            } catch (RuntimeException var18) {
               throw classEG.method3884(
                  var18,
                  ""
                     + (var2 != null)
                     + ","
                     + var1
                     + ","
                     + var19.length
                     + ","
                     + classCV.method2684(var19, var19.length, (byte)-99)
                     + ","
                     + classCV.method2684(var19, var19.length - 2, (byte)-85)
                     + ","
                     + var0.field6452[var1]
                     + ","
                     + -854894521 * var0.field6441
               );
            }

            if (var0.field6437) {
               var0.field6453[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               int var10 = var20[--var9] & 255;
               var9 -= var10 * var3 * 4;
               classXY var11 = new classXY(var20);
               int[] var12 = new int[var3];
               var11.field6955 = -1095856699 * var9;

               for (int var13 = 0; var13 < var10; var13++) {
                  int var14 = 0;

                  for (int var15 = 0; var15 < var3; var15++) {
                     var14 += var11.method13056((byte)1);
                     var12[var15] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for (int var24 = 0; var24 < var3; var24++) {
                  var23[var24] = new byte[var12[var24]];
                  var12[var24] = 0;
               }

               var11.field6955 = var9 * -1095856699;
               int var25 = 0;

               for (int var26 = 0; var26 < var10; var26++) {
                  int var16 = 0;

                  for (int var17 = 0; var17 < var3; var17++) {
                     var16 += var11.method13056((byte)1);
                     System.arraycopy(var20, var25, var23[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var25 += var16;
                  }
               }

               for (int var27 = 0; var27 < var3; var27++) {
                  if (!var0.field6436) {
                     var5[var4[var27]] = classOQ.method8718(var23[var27], false, -2145399643);
                  } else {
                     var5[var4[var27]] = var23[var27];
                  }
               }
            } else if (!var0.field6436) {
               var5[var4[0]] = classOQ.method8718(var20, false, 1934256216);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)Z")
   @ObfuscatedName("ey")
   boolean method11845(int var1, int[] var2) {
      if (null == this.field6453[var1]) {
         return false;
      } else {
         int var3 = this.field6448[var1];
         int[] var4 = this.field6456[var1];
         Object[] var5 = this.field6457[var1];
         boolean var6 = true;

         for (int var7 = 0; var7 < var3; var7++) {
            if (null == var5[var4[var7]]) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (null == var2 || var2[0] == 0 && 0 == var2[1] && 0 == var2[2] && var2[3] == 0) {
               var19 = PlayerComposition.method6663(this.field6453[var1], false, -174334988);
            } else {
               var19 = PlayerComposition.method6663(this.field6453[var1], true, -174334988);
               classXY var8 = new classXY(var19);
               var8.method13136(var2, 5, var8.field6954.length, -1664008178);
            }

            byte[] var20;
            try {
               var20 = classMD.method7538(var19, (byte)33);
            } catch (RuntimeException var18) {
               throw classEG.method3884(
                  var18,
                  ""
                     + (var2 != null)
                     + ","
                     + var1
                     + ","
                     + var19.length
                     + ","
                     + classCV.method2684(var19, var19.length, (byte)-97)
                     + ","
                     + classCV.method2684(var19, var19.length - 2, (byte)31)
                     + ","
                     + this.field6452[var1]
                     + ","
                     + -854894521 * this.field6441
               );
            }

            if (this.field6437) {
               this.field6453[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               int var10 = var20[--var9] & 255;
               var9 -= var10 * var3 * 4;
               classXY var11 = new classXY(var20);
               int[] var12 = new int[var3];
               var11.field6955 = -1095856699 * var9;

               for (int var13 = 0; var13 < var10; var13++) {
                  int var14 = 0;

                  for (int var15 = 0; var15 < var3; var15++) {
                     var14 += var11.method13056((byte)1);
                     var12[var15] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for (int var24 = 0; var24 < var3; var24++) {
                  var23[var24] = new byte[var12[var24]];
                  var12[var24] = 0;
               }

               var11.field6955 = var9 * -1095856699;
               int var25 = 0;

               for (int var26 = 0; var26 < var10; var26++) {
                  int var16 = 0;

                  for (int var17 = 0; var17 < var3; var17++) {
                     var16 += var11.method13056((byte)1);
                     System.arraycopy(var20, var25, var23[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var25 += var16;
                  }
               }

               for (int var27 = 0; var27 < var3; var27++) {
                  if (!this.field6436) {
                     var5[var4[var27]] = classOQ.method8718(var23[var27], false, 1922438212);
                  } else {
                     var5[var4[var27]] = var23[var27];
                  }
               }
            } else if (!this.field6436) {
               var5[var4[0]] = classOQ.method8718(var20, false, 1151724328);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)Z")
   @ObfuscatedName("jt")
   public static boolean method11806(AbstractArchive var0, int var1) {
      if (var0 == null) {
         var0.method11808(var1);
      }

      if (1 == var0.field6457.length) {
         return var0.method11871(0, var1, (byte)-87);
      } else if (var0.field6457[var1].length == 1) {
         return var0.method11871(var1, 0, (byte)29);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("dz")
   public int[] method11829(int var1) {
      return var1 >= 0 && var1 < this.field6456.length ? this.field6456[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
   @ObfuscatedName("en")
   public byte[] method11856(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = classZT.method14193(this.field6444, classQI.method9587(var1, 1655580833), -2087243645);
      int var4 = classZT.method14193(this.field6454[var3], classQI.method9587(var2, 1280867400), -2092387021);
      return this.method11867(var3, var4, -686045689);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ej")
   public int method11849(String var1) {
      var1 = var1.toLowerCase();
      return classZT.method14193(this.field6444, classQI.method9587(var1, 1747430079), -2123505141);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ed")
   public int method11850(String var1) {
      var1 = var1.toLowerCase();
      return classZT.method14193(this.field6444, classQI.method9587(var1, 1182832765), -2137204962);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
   @ObfuscatedName("yj")
   public byte[] method11880(String var1, String var2) {
      return this.method11854(var1, var2, 1857645463);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)[B")
   @ObfuscatedName("as")
   public static byte[] method11815(AbstractArchive var0, int var1) {
      if (var0 == null) {
         var0.vmethod611(var1);
      }

      if (var0.field6457.length == 1) {
         return var0.method11867(0, var1, -791608788);
      } else if (1 == var0.field6457[var1].length) {
         return var0.method11867(var1, 0, -1332749972);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("by")
   public boolean method11807(int var1, byte var2) {
      try {
         if (1 == this.field6457.length) {
            if (var2 != -1) {
               throw new IllegalStateException();
            } else {
               return this.method11871(0, var1, (byte)0);
            }
         } else if (this.field6457[var1].length == 1) {
            if (var2 != -1) {
               throw new IllegalStateException();
            } else {
               return this.method11871(var1, 0, (byte)15);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "va.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)[B")
   @ObfuscatedName("cz")
   byte[] method11799(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field6457.length && null != this.field6457[var1] && var2 >= 0 && var2 < this.field6457[var1].length) {
         if (this.field6457[var1][var2] == null) {
            boolean var4 = this.method11842(var1, var3, -458525448);
            if (!var4) {
               this.vmethod610(var1, 751119654);
               var4 = this.method11842(var1, var3, -2090002854);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var6 = PlayerComposition.method6663(this.field6457[var1][var2], false, -174334988);
         if (this.field6436) {
            this.field6457[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
   @ObfuscatedName("eh")
   public byte[] method11857(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = classZT.method14193(this.field6444, classQI.method9587(var1, 1816329289), -2136328371);
      int var4 = classZT.method14193(this.field6454[var3], classQI.method9587(var2, 1002160249), -2133017801);
      return this.method11867(var3, var4, -1258426360);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Ljava/lang/String;Ljava/lang/String;)Z")
   @ObfuscatedName("gr")
   public static boolean method11861(AbstractArchive var0, String var1, String var2) {
      if (var0 == null) {
         var0.method11880(var1, var1);
      }

      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = classZT.method14193(var0.field6444, classQI.method9587(var1, 1557328943), -2111428077);
      int var4 = classZT.method14193(var0.field6454[var3], classQI.method9587(var2, 1359072099), -2112304049);
      return var0.method11871(var3, var4, (byte)45);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dc")
   public int method11881(int var1) {
      return this.method11868(var1, 1562769287);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bh")
   public int method11868(int var1, int var2) {
      if (this.field6457 != null && var1 < this.field6457.length) {
         Object[] var3 = this.field6457[var1];
         return var3 == null ? 0 : var3.length;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
   @ObfuscatedName("ex")
   public byte[] method11858(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = classZT.method14193(this.field6444, classQI.method9587(var1, 1261906042), -2143389956);
      int var4 = classZT.method14193(this.field6454[var3], classQI.method9587(var2, 1489898206), -2086700308);
      return this.method11867(var3, var4, -712728705);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("ca")
   static final byte[] method11793(byte[] var0) {
      classXY var1 = new classXY(var0);
      int var2 = classXY.method13039(var1, -346779531);
      int var3 = var1.method13056((byte)1);
      if (var3 >= 0 && (0 == -1099343951 * field6438 || var3 <= -1099343951 * field6438)) {
         if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.method13084(var6, 0, var3, (byte)83);
            return var6;
         } else {
            int var4 = var1.method13056((byte)1);
            if (var4 >= 0 && (0 == field6438 * -1099343951 || var4 <= field6438 * -1099343951)) {
               byte[] var5 = new byte[var4];
               if (var2 == 1) {
                  classYG.method13331(var5, var4, var0, var3, 9);
               } else {
                  classAAT.method269(field6439, var1, var5, -178170704);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Z)[B")
   @ObfuscatedName("cm")
   public static byte[] method11882(Object var0, boolean var1) {
      return PlayerComposition.method6663(var0, var1, -174334988);
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("dt")
   public byte[] method11816(int var1, int var2) {
      try {
         if (this.field6457.length == 1) {
            if (var2 == -672458971) {
               throw new IllegalStateException();
            } else {
               return this.method11873(0, var1, -2126116436);
            }
         } else if (1 == this.field6457[var1].length) {
            return this.method11873(var1, 0, -1819242288);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "va.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("di")
   public byte[] method11823(int var1, int var2) {
      try {
         if (1 == this.field6457.length) {
            if (var2 == 1789555459) {
               throw new IllegalStateException();
            } else {
               return this.method11867(0, var1, 488646171);
            }
         } else if (this.field6457[var1].length == 1) {
            if (var2 == 1789555459) {
               throw new IllegalStateException();
            } else {
               return this.method11867(var1, 0, -782572774);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "va.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
   @ObfuscatedName("cl")
   public boolean method11862(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = classZT.method14193(this.field6444, classQI.method9587(var1, 864611726), -2128373051);
         int var5 = classZT.method14193(this.field6454[var4], classQI.method9587(var2, 2062653392), -2128802975);
         return this.method11871(var4, var5, (byte)57);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "va.cv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ce")
   public boolean method11808(int var1) {
      if (1 == this.field6457.length) {
         return this.method11871(0, var1, (byte)-36);
      } else if (this.field6457[var1].length == 1) {
         return this.method11871(var1, 0, (byte)11);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)Z")
   @ObfuscatedName("es")
   boolean method11846(int var1, int[] var2) {
      if (null == this.field6453[var1]) {
         return false;
      } else {
         int var3 = this.field6451[var1];
         int[] var4 = this.field6455[var1];
         Object[] var5 = this.field6457[var1];
         boolean var6 = true;

         for (int var7 = 0; var7 < var3; var7++) {
            if (null == var5[var4[var7]]) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (null == var2 || var2[0] == 0 && 0 == var2[1] && 0 == var2[2] && var2[3] == 0) {
               var19 = PlayerComposition.method6663(this.field6453[var1], false, -174334988);
            } else {
               var19 = PlayerComposition.method6663(this.field6453[var1], true, -174334988);
               classXY var8 = new classXY(var19);
               var8.method13135(var2, 5, var8.field6954.length, -1664008178);
            }

            byte[] var20;
            try {
               var20 = classMD.method7538(var19, (byte)72);
            } catch (RuntimeException var18) {
               throw classEG.method3884(
                  var18,
                  ""
                     + (var2 != null)
                     + ","
                     + var1
                     + ","
                     + var19.length
                     + ","
                     + classCV.method2684(var19, var19.length, (byte)-40)
                     + ","
                     + classCV.method2684(var19, var19.length - 2, (byte)-73)
                     + ","
                     + this.field6448[var1]
                     + ","
                     + -854894521 * this.field6441
               );
            }

            if (this.field6437) {
               this.field6453[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               int var10 = var20[--var9] & 255;
               var9 -= var10 * var3 * 4;
               classXY var11 = new classXY(var20);
               int[] var12 = new int[var3];
               var11.field6955 = -1095856699 * var9;

               for (int var13 = 0; var13 < var10; var13++) {
                  int var14 = 0;

                  for (int var15 = 0; var15 < var3; var15++) {
                     var14 += var11.method13122((byte)1);
                     var12[var15] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for (int var24 = 0; var24 < var3; var24++) {
                  var23[var24] = new byte[var12[var24]];
                  var12[var24] = 0;
               }

               var11.field6955 = var9 * -1095856699;
               int var25 = 0;

               for (int var26 = 0; var26 < var10; var26++) {
                  int var16 = 0;

                  for (int var17 = 0; var17 < var3; var17++) {
                     var16 += var11.method13207((byte)1);
                     System.arraycopy(var20, var25, var23[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var25 += var16;
                  }
               }

               for (int var27 = 0; var27 < var3; var27++) {
                  if (!this.field6436) {
                     var5[var4[var27]] = classOQ.method8718(var23[var27], false, -59017401);
                  } else {
                     var5[var4[var27]] = var23[var27];
                  }
               }
            } else if (!this.field6437) {
               var5[var4[0]] = classOQ.method8718(var20, false, 454850578);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }
}
