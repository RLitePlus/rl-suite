import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fi")
public class class137 implements Enum {
   @ObfuscatedSignature(descriptor = "[Lxt;")
   @ObfuscatedName("pw")
   static SpritePixels[] crossSprites;
   @ObfuscatedSignature(descriptor = "Lfi;")
   @ObfuscatedName("at")
   static final class137 field1794 = new class137(1, 1);
   @ObfuscatedSignature(descriptor = "Lfi;")
   @ObfuscatedName("ag")
   static final class137 field1792 = new class137(2, 2);
   @ObfuscatedSignature(descriptor = "Lfi;")
   @ObfuscatedName("an")
   static final class137 field1791 = new class137(3, 3);
   @ObfuscatedSignature(descriptor = "Lfi;")
   @ObfuscatedName("ae")
   static final class137 field1793 = new class137(4, 4);
   @ObfuscatedName("aj")
   final int field1796;
   @ObfuscatedName("ak")
   final int field1795;
   @ObfuscatedSignature(descriptor = "Lfi;")
   @ObfuscatedName("av")
   static final class137 field1790 = new class137(0, 0);
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field1797 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final String field1799 = "Date not valid.";
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field1798 = 36;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfi;")
   @ObfuscatedName("au")
   static class137 method4007(int var0) {
      class137 var1 = (class137)GrandExchangeOffer.findEnumerated(PlayerUpdateManager.method3619((byte)-100), var0, (byte)1);
      if (var1 == null) {
         var1 = field1790;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfi;")
   @ObfuscatedName("ay")
   static class137 method4008(int var0) {
      class137 var1 = (class137)GrandExchangeOffer.findEnumerated(PlayerUpdateManager.method3619((byte)-124), var0, (byte)1);
      if (var1 == null) {
         var1 = field1790;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lfi;")
   @ObfuscatedName("ap")
   static class137[] method4004() {
      return new class137[]{field1790, field1794, field1792, field1791, field1793};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lfi;")
   @ObfuscatedName("ak")
   static class137[] method4005() {
      return new class137[]{field1790, field1794, field1792, field1791, field1793};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field1795 * 462507268;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field1795 * 1773187724;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lfi;")
   @ObfuscatedName("aw")
   static class137[] method4006() {
      return new class137[]{field1790, field1794, field1792, field1791, field1793};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field1795 * -801756045;
   }

   class137(int var1, int var2) {
      this.field1796 = var1 * -621277531;
      this.field1795 = -1807306601 * var2;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field1795 * 808963879;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fi.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lfi;")
   @ObfuscatedName("az")
   static class137 method4009(int var0) {
      class137 var1 = (class137)GrandExchangeOffer.findEnumerated(PlayerUpdateManager.method3619((byte)-93), var0, (byte)1);
      if (var1 == null) {
         var1 = field1790;
      }

      return var1;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
   @ObfuscatedName("at")
   static File method4003(String var0, String var1, int var2, byte var3) {
      try {
         String var4 = var2 == 0 ? "" : "" + var2;
         SoundCache.field1483 = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
         String var5 = null;
         String var6 = null;
         boolean var7 = false;
         if (SoundCache.field1483.exists()) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            AccessFile var8 = null;
            boolean var23 = false /* VF: Semaphore variable */;

            label411: {
               label410: {
                  try {
                     var23 = true;
                     var8 = new AccessFile(SoundCache.field1483, "rw", 10000L);
                     Buffer var9 = new Buffer((int)AccessFile.method11809(var8, (byte)91));

                     while (var9.offset * 2108391709 < var9.array.length) {
                        if (var3 >= 2) {
                           throw new IllegalStateException();
                        }

                        int var10 = var8.read(var9.array, var9.offset * 2108391709, var9.array.length - var9.offset * 2108391709, (byte)-47);
                        if (var10 == -1) {
                           if (var3 >= 2) {
                              throw new IllegalStateException();
                           }

                           throw new IOException();
                        }

                        var9.offset += 1741769013 * var10;
                     }

                     var9.offset = 0;
                     int var37 = var9.readUnsignedByte(-1306128855);
                     if (var37 >= 1) {
                        if (var3 >= 2) {
                           throw new IllegalStateException();
                        }

                        if (var37 <= 3) {
                           int var11 = 0;
                           if (var37 > 1) {
                              var11 = var9.readUnsignedByte(416271866);
                           }

                           if (var37 <= 2) {
                              if (var3 >= 2) {
                                 throw new IllegalStateException();
                              }

                              var5 = var9.readStringCp1252NullTerminatedOrNull(-1115433129);
                              if (var11 == 1) {
                                 if (var3 >= 2) {
                                    throw new IllegalStateException();
                                 }

                                 var6 = var9.readStringCp1252NullTerminatedOrNull(681177859);
                                 var23 = false;
                              } else {
                                 var23 = false;
                              }
                           } else {
                              var5 = Buffer.method12033(var9, -1960788898);
                              if (var11 == 1) {
                                 if (var3 >= 2) {
                                    throw new IllegalStateException();
                                 }

                                 var6 = Buffer.method12033(var9, -2132013930);
                                 var23 = false;
                              } else {
                                 var23 = false;
                              }
                           }
                           break label410;
                        }

                        if (var3 >= 2) {
                           throw new IllegalStateException();
                        }
                     }

                     throw new IOException("" + var37);
                  } catch (Exception var28) {
                     var28.printStackTrace();
                     var23 = false;
                  } finally {
                     if (var23) {
                        try {
                           if (null != var8) {
                              if (var3 >= 2) {
                                 throw new IllegalStateException();
                              }

                              var8.close((byte)-125);
                           }
                        } catch (IOException var24) {
                        }
                     }
                  }

                  try {
                     if (null != var8) {
                        var8.close((byte)-9);
                     }
                  } catch (IOException var25) {
                  }
                  break label411;
               }

               try {
                  if (null != var8) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     var8.close((byte)-61);
                  }
               } catch (IOException var26) {
               }
            }

            if (var5 != null) {
               if (var3 >= 2) {
                  throw new IllegalStateException();
               }

               File var33 = new File(var5);
               if (!var33.exists()) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  var5 = null;
               }
            }

            if (var5 != null) {
               if (var3 >= 2) {
                  throw new IllegalStateException();
               }

               File var34 = new File(var5, "test.dat");
               if (!class194.method4478(var34, true, 2022815658)) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  var5 = null;
               }
            }
         }

         if (var5 == null) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            if (0 == var2) {
               if (var3 >= 2) {
                  throw new IllegalStateException();
               }

               label374:
               for (int var31 = 0; var31 < class201.field2288.length; var31++) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  for (int var35 = 0; var35 < classWO.field6405.length; var35++) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     File var38 = new File(classWO.field6405[var35] + class201.field2288[var31] + File.separatorChar + var0 + File.separatorChar);
                     if (var38.exists()) {
                        if (var3 >= 2) {
                           throw new IllegalStateException();
                        }

                        if (class194.method4478(new File(var38, "test.dat"), true, 1990981709)) {
                           if (var3 >= 2) {
                              throw new IllegalStateException();
                           }

                           var5 = var38.toString();
                           var7 = true;
                           break label374;
                        }
                     }
                  }
               }
            }
         }

         if (null == var5) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            var5 = JagexCache.userHomeDirectory
               + File.separatorChar
               + "jagexcache"
               + var4
               + File.separatorChar
               + var0
               + File.separatorChar
               + var1
               + File.separatorChar;
            var7 = true;
         }

         if (var6 != null) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            File var32 = new File(var6);
            File var36 = new File(var5);

            try {
               File[] var39 = var32.listFiles();
               File[] var40 = var39;

               for (int var12 = 0; var12 < var40.length; var12++) {
                  if (var3 >= 2) {
                     throw new IllegalStateException();
                  }

                  File var13 = var40[var12];
                  File var14 = new File(var36, var13.getName());
                  boolean var15 = var13.renameTo(var14);
                  if (!var15) {
                     if (var3 >= 2) {
                        throw new IllegalStateException();
                     }

                     throw new IOException();
                  }
               }
            } catch (Exception var27) {
               var27.printStackTrace();
            }

            var7 = true;
         }

         if (var7) {
            if (var3 >= 2) {
               throw new IllegalStateException();
            }

            class225.method5333(new File(var5), null, 1444084843);
         }

         return new File(var5);
      } catch (RuntimeException var30) {
         throw RestClientThreadFactory.newRunException(var30, "fi.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   public static int method4002(int var0, int var1) {
      try {
         return classUS.field6098[var0 & 16383];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fi.at(" + 41);
      }
   }
}
