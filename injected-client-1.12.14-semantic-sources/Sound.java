import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gm")
public class Sound extends classFM {
   @ObfuscatedName("ag")
   byte field2027;
   @ObfuscatedName("at")
   byte field2029;
   @ObfuscatedName("ow")
   static int[][] field2032;
   @ObfuscatedName("av")
   boolean field2031;
   @ObfuscatedName("ae")
   byte field2026;
   @ObfuscatedName("an")
   byte field2028;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final String field2030 = "main_file_cache.idx255";

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field2031 = var1.readUnsignedByte(312896064) == 1;
      this.field2029 = Buffer.method12001(var1, (byte)72);
      this.field2027 = Buffer.method12001(var1, (byte)100);
      this.field2028 = Buffer.method12001(var1, (byte)100);
      this.field2026 = Buffer.method12001(var1, (byte)31);
   }

   @ObfuscatedSignature(descriptor = "(CI)C")
   @ObfuscatedName("ag")
   static char method4250(char var0, int var1) {
      try {
         if (var0 == 198) {
            if (var1 >= -2018440920) {
               throw new IllegalStateException();
            } else {
               return 'E';
            }
         } else if (var0 == 230) {
            return 'e';
         } else if (223 == var0) {
            return 's';
         } else if (338 == var0) {
            return 'E';
         } else if (339 == var0) {
            if (var1 >= -2018440920) {
               throw new IllegalStateException();
            } else {
               return 'e';
            }
         } else {
            return '\u0000';
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gm.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.allowGuests = this.field2031;
         var1.field2068 = this.field2029;
         var1.field2063 = this.field2027;
         var1.field2065 = this.field2028;
         var1.field2066 = this.field2026;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gm.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field2031 = var1.readUnsignedByte(-428336515) == 1;
      this.field2029 = Buffer.method12001(var1, (byte)95);
      this.field2027 = Buffer.method12001(var1, (byte)81);
      this.field2028 = Buffer.method12001(var1, (byte)48);
      this.field2026 = Buffer.method12001(var1, (byte)33);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         boolean var10001;
         if (var1.readUnsignedByte(-433594533) == 1) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field2031 = var10001;
         this.field2029 = Buffer.method12001(var1, (byte)121);
         this.field2027 = Buffer.method12001(var1, (byte)22);
         this.field2028 = Buffer.method12001(var1, (byte)74);
         this.field2026 = Buffer.method12001(var1, (byte)76);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.allowGuests = this.field2031;
      var1.field2068 = this.field2029;
      var1.field2063 = this.field2027;
      var1.field2065 = this.field2028;
      var1.field2066 = this.field2026;
   }

   @ObfuscatedSignature(descriptor = "(CB)B")
   @ObfuscatedName("av")
   public static byte charToByteCp1252(char var0, byte var1) {
      try {
         if (var0 > 0) {
            if (var0 < 128) {
               return (byte)var0;
            }

            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 160) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               return (byte)var0;
            }
         }

         if (var0 == 8364) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -128;
            }
         } else if (var0 == 8218) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -126;
            }
         } else if (var0 == 402) {
            return -125;
         } else if (8222 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -124;
            }
         } else if (8230 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -123;
            }
         } else if (8224 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -122;
            }
         } else if (var0 == 8225) {
            return -121;
         } else if (710 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -120;
            }
         } else if (8240 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -119;
            }
         } else if (var0 == 352) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -118;
            }
         } else if (var0 == 8249) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -117;
            }
         } else if (var0 == 338) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -116;
            }
         } else if (381 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -114;
            }
         } else if (var0 == 8216) {
            return -111;
         } else if (var0 == 8217) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -110;
            }
         } else if (8220 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -109;
            }
         } else if (8221 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -108;
            }
         } else if (8226 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -107;
            }
         } else if (8211 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -106;
            }
         } else if (8212 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -105;
            }
         } else if (var0 == 732) {
            return -104;
         } else if (8482 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -103;
            }
         } else if (var0 == 353) {
            return -102;
         } else if (var0 == 8250) {
            return -101;
         } else if (339 == var0) {
            return -100;
         } else if (382 == var0) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return -98;
            }
         } else {
            byte var29;
            if (var0 == 376) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               var29 = -97;
            } else {
               var29 = 63;
            }

            return var29;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gm.av(" + ')');
      }
   }

   Sound(class154 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("av")
   public static boolean isWorldMapEvent(int var0, int var1) {
      try {
         if (var0 != 10) {
            if (var1 <= -904576183) {
               throw new IllegalStateException();
            }

            if (var0 != 11 && var0 != 12) {
               if (var1 <= -904576183) {
                  throw new IllegalStateException();
               }

               if (var0 != 13) {
                  if (var1 <= -904576183) {
                     throw new IllegalStateException();
                  }

                  if (14 != var0) {
                     if (var1 <= -904576183) {
                        throw new IllegalStateException();
                     }

                     if (var0 != 15) {
                        if (var1 <= -904576183) {
                           throw new IllegalStateException();
                        }

                        if (var0 != 16) {
                           if (var1 <= -904576183) {
                              throw new IllegalStateException();
                           }

                           if (var0 != 17) {
                              return false;
                           }

                           if (var1 <= -904576183) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gm.av(" + ')');
      }
   }
}
