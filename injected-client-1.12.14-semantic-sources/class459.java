import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rd")
public class class459 {
   class459() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   public static int method9404(int var0, int var1) {
      return (int)(Math.atan2(var0, var1) * 325.94932345220167) & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   public static int method9405(int var0, int var1) {
      return (int)(Math.atan2(var0, var1) * 325.94932345220167) & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   public static int method9406(int var0, int var1) {
      return (int)(Math.atan2(var0, var1) * 325.94932345220167) & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("ap")
   public static int method9407(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      if (var0 < var2) {
         var6 += var2 - var0;
      } else if (var0 > var4) {
         var6 += var0 - var4;
      }

      if (var1 < var3) {
         var6 += var3 - var1;
      } else if (var1 > var5) {
         var6 += var1 - var5;
      }

      return var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("au")
   public static int method9408(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      if (var0 < var2) {
         var6 += var2 - var0;
      } else if (var0 > var4) {
         var6 += var0 - var4;
      }

      if (var1 < var3) {
         var6 += var3 - var1;
      } else if (var1 > var5) {
         var6 += var1 - var5;
      }

      return var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("ay")
   public static int method9409(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      if (var0 < var2) {
         var6 += var2 - var0;
      } else if (var0 > var4) {
         var6 += var0 - var4;
      }

      if (var1 < var3) {
         var6 += var3 - var1;
      } else if (var1 > var5) {
         var6 += var1 - var5;
      }

      return var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("ad")
   public static boolean method9410(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return !PacketBufferNode.method7434(var0, var1, var2, var3, var4, var5, 361075336)
         ? false
         : PacketBufferNode.method7434(var0, var1, var4, var5, var6, var7, 361075336);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II[BII)I")
   @ObfuscatedName("ak")
   public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      try {
         int var6 = var2 - var1;

         for (int var7 = 0; var7 < var6; var7++) {
            if (var5 <= -1030077373) {
               throw new IllegalStateException();
            }

            char var8;
            label225: {
               var8 = var0.charAt(var7 + var1);
               if (var8 > 0) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  if (var8 < 128) {
                     break label225;
                  }

                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }
               }

               if (var8 >= 160) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  if (var8 <= 255) {
                     if (var5 <= -1030077373) {
                        throw new IllegalStateException();
                     }
                     break label225;
                  }
               }

               if (var8 == 8364) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -128;
               } else if (var8 == 8218) {
                  var3[var7 + var4] = -126;
               } else if (402 == var8) {
                  var3[var7 + var4] = -125;
               } else if (8222 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -124;
               } else if (var8 == 8230) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -123;
               } else if (8224 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -122;
               } else if (8225 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -121;
               } else if (710 == var8) {
                  var3[var7 + var4] = -120;
               } else if (8240 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -119;
               } else if (var8 == 352) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -118;
               } else if (8249 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -117;
               } else if (var8 == 338) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -116;
               } else if (381 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -114;
               } else if (8216 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -111;
               } else if (var8 == 8217) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -110;
               } else if (8220 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -109;
               } else if (var8 == 8221) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -108;
               } else if (var8 == 8226) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -107;
               } else if (8211 == var8) {
                  var3[var4 + var7] = -106;
               } else if (8212 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -105;
               } else if (var8 == 732) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -104;
               } else if (8482 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -103;
               } else if (353 == var8) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -102;
               } else if (8250 == var8) {
                  var3[var4 + var7] = -101;
               } else if (var8 == 339) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -100;
               } else if (var8 == 382) {
                  var3[var7 + var4] = -98;
               } else if (var8 == 376) {
                  if (var5 <= -1030077373) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -97;
               } else {
                  var3[var7 + var4] = 63;
               }
               continue;
            }

            var3[var7 + var4] = (byte)var8;
         }

         return var6;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "rd.ak(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("ai")
   public static boolean method9411(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return !PacketBufferNode.method7434(var0, var1, var2, var3, var4, var5, 361075336)
         ? false
         : PacketBufferNode.method7434(var0, var1, var4, var5, var6, var7, 361075336);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("as")
   public static boolean method9412(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return !PacketBufferNode.method7434(var0, var1, var2, var3, var4, var5, 361075336)
         ? false
         : PacketBufferNode.method7434(var0, var1, var4, var5, var6, var7, 361075336);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("ac")
   static boolean method9414(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 - var2;
      int var7 = var5 - var3;
      int var8 = var0 - var2;
      int var9 = var1 - var3;
      int var10 = var7 * var9 + var8 * var6;
      int var12 = var7 * var7 + var6 * var6;
      return 0 <= var10 && var10 <= var12;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("az")
   public static boolean method9413(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return !PacketBufferNode.method7434(var0, var1, var2, var3, var4, var5, 361075336)
         ? false
         : PacketBufferNode.method7434(var0, var1, var4, var5, var6, var7, 361075336);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("lk")
   static final boolean method9416(int var0, int var1) {
      try {
         if (var0 >= 2000) {
            var0 -= 2000;
         }

         boolean var10000;
         if (var0 == 1007) {
            if (var1 != 1683599854) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rd.lk(" + ')');
      }
   }
}
