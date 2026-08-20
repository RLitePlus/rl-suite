import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("li")
public class classLI {
   @ToRemove(unused = "true")
   @ObfuscatedName("co")
   static final int field3693 = 1;
   @ObfuscatedName("uz")
   static int field3694;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field3692 = 3;

   @ObfuscatedSignature(descriptor = "(ILcv;B)Ldd;")
   @ObfuscatedName("at")
   public static WorldView method7182(int var0, WorldViewManager var1, byte var2) {
      try {
         Iterator var3 = var1.iterator();

         while (var3.hasNext()) {
            if (var2 != 3) {
               throw new IllegalStateException();
            }

            WorldView var4 = (WorldView)var3.next();
            Player var5 = (Player)var4.npcs.get(var0);
            if (var5 != null) {
               if (var2 != 3) {
                  throw new IllegalStateException();
               }

               if (var4.id * 577964535 != -1) {
                  if (var2 != 3) {
                     throw new IllegalStateException();
                  }

                  return var4;
               }
            }
         }

         return var1.method2905((byte)-29);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "li.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;S)[B")
   @ObfuscatedName("aj")
   public static byte[] method7185(CharSequence var0, short var1) {
      try {
         int var2 = var0.length();
         byte[] var3 = new byte[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1 >= 128) {
               throw new IllegalStateException();
            }

            char var5;
            label232: {
               var5 = var0.charAt(var4);
               if (var5 > 0) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  if (var5 < 128) {
                     break label232;
                  }

                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 160) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 255) {
                     break label232;
                  }
               }

               if (var5 == 8364) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -128;
               } else if (var5 == 8218) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -126;
               } else if (402 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -125;
               } else if (8222 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -124;
               } else if (var5 == 8230) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -123;
               } else if (var5 == 8224) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -122;
               } else if (var5 == 8225) {
                  var3[var4] = -121;
               } else if (var5 == 710) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -120;
               } else if (var5 == 8240) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -119;
               } else if (var5 == 352) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -118;
               } else if (8249 == var5) {
                  var3[var4] = -117;
               } else if (338 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -116;
               } else if (var5 == 381) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -114;
               } else if (8216 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -111;
               } else if (8217 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -110;
               } else if (var5 == 8220) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -109;
               } else if (var5 == 8221) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -108;
               } else if (8226 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -107;
               } else if (8211 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -106;
               } else if (var5 == 8212) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -105;
               } else if (732 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -104;
               } else if (var5 == 8482) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -103;
               } else if (353 == var5) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -102;
               } else if (var5 == 8250) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -101;
               } else if (var5 == 339) {
                  var3[var4] = -100;
               } else if (var5 == 382) {
                  if (var1 >= 128) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -98;
               } else if (var5 == 376) {
                  if (var1 >= 128) {
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
         throw RestClientThreadFactory.newRunException(var6, "li.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public static void method7183(int var0) {
      try {
         synchronized (ArchiveDiskActionHandler.field5317) {
            if (ArchiveDiskActionHandler.field5319 * -412991015 != 0) {
               if (var0 <= -2011829299) {
                  return;
               }

               ArchiveDiskActionHandler.field5319 = 789458537;

               try {
                  ArchiveDiskActionHandler.field5317.wait();
               } catch (InterruptedException var6) {
               }
            }
         }

         synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            NodeDeque.method9797(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue);
            NodeDeque.method9797(ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "li.ag(" + ')');
      }
   }

   classLI() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   static void method7184(int var0) {
      try {
         Iterator var1 = Messages.Messages_hashTable.iterator();

         while (var1.hasNext()) {
            if (var0 == -100667920) {
               throw new IllegalStateException();
            }

            Message var2 = (Message)var1.next();
            var2.clearIsFromIgnored(1831205668);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "li.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DDD)I")
   @ObfuscatedName("at")
   public static final int method7181(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0 != var2) {
         double var12;
         if (var4 < 0.5) {
            var12 = (var2 + 1.0) * var4;
         } else {
            var12 = var4 + var2 - var4 * var2;
         }

         double var14 = 2.0 * var4 - var12;
         double var16 = var0 + 0.3333333333333333;
         if (var16 > 1.0) {
            var16--;
         }

         double var20 = var0 - 0.3333333333333333;
         if (var20 < 0.0) {
            var20++;
         }

         if (6.0 * var16 < 1.0) {
            var6 = var16 * ((var12 - var14) * 6.0) + var14;
         } else if (var16 * 2.0 < 1.0) {
            var6 = var12;
         } else if (3.0 * var16 < 2.0) {
            var6 = (0.6666666666666666 - var16) * (var12 - var14) * 6.0 + var14;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0 < 1.0) {
            var8 = (var12 - var14) * 6.0 * var0 + var14;
         } else if (2.0 * var0 < 1.0) {
            var8 = var12;
         } else if (3.0 * var0 < 2.0) {
            var8 = (var12 - var14) * (0.6666666666666666 - var0) * 6.0 + var14;
         } else {
            var8 = var14;
         }

         if (var20 * 6.0 < 1.0) {
            var10 = var14 + 6.0 * (var12 - var14) * var20;
         } else if (var20 * 2.0 < 1.0) {
            var10 = var12;
         } else if (3.0 * var20 < 2.0) {
            var10 = var14 + 6.0 * ((0.6666666666666666 - var20) * (var12 - var14));
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0);
      int var13 = (int)(var8 * 256.0);
      int var23 = (int)(var10 * 256.0);
      return var23 + (var22 << 16) + (var13 << 8);
   }
}
