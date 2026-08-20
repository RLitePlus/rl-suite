import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ia")
public class class228 {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field2432 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2433 = 0;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aw")
   static AbstractArchive HitSplatDefinition_fontsArchive;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2431 = 4;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfq;)I")
   @ObfuscatedName("um")
   public static int method4853(class140 var0) {
      return -1142185869 * var0.field1838;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   static void method4852(int var0) {
      try {
         synchronized (ArchiveDiskActionHandler.field5317) {
            if (0 == ArchiveDiskActionHandler.field5319 * -412991015) {
               if (var0 == 1298039426) {
                  throw new IllegalStateException();
               }

               class179.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
               client.method2322(-1);
               class179.ArchiveDiskActionHandler_thread.setDaemon(true);
               class179.ArchiveDiskActionHandler_thread.start();
               class179.ArchiveDiskActionHandler_thread.setPriority(5);
            }

            ArchiveDiskActionHandler.field5319 = 1228719640;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ia.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lix;)V")
   @ObfuscatedName("ep")
   public static void method4855(class225 var0) {
      for (class226 var2 : var0.field2761.field3074) {
         if (null != var2.field2777 && !var2.field2777.isDone(1741769013)) {
            return;
         }
      }

      for (class226 var5 : var0.field2761.field3074) {
         if (null != var5.field2777) {
            byte[] var3 = var5.field2777.getResponse((byte)81);
            if (var3 != null && var3.length > 0) {
               var0.field2762 = 135467006;
               return;
            }
         }
      }

      var0.method5323(-1721208231);
      var0.field2762 = 428405269;
   }

   class228() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "([BIII)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public static String method4854(byte[] var0, int var1, int var2, int var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;
         int var6 = var1;
         int var7 = var2 + var1;

         while (var6 < var7) {
            if (var3 >= 1373079782) {
               throw new IllegalStateException();
            }

            int var8 = var0[var6++] & 255;
            int var9;
            if (var8 < 128) {
               if (var3 >= 1373079782) {
                  throw new IllegalStateException();
               }

               if (var8 == 0) {
                  if (var3 >= 1373079782) {
                     throw new IllegalStateException();
                  }

                  var9 = 65533;
               } else {
                  var9 = var8;
               }
            } else if (var8 < 192) {
               if (var3 >= 1373079782) {
                  throw new IllegalStateException();
               }

               var9 = 65533;
            } else {
               label156:
               if (var8 < 224) {
                  if (var3 >= 1373079782) {
                     throw new IllegalStateException();
                  }

                  if (var6 < var7) {
                     if (var3 >= 1373079782) {
                        throw new IllegalStateException();
                     }

                     if (128 == (var0[var6] & 192)) {
                        if (var3 >= 1373079782) {
                           throw new IllegalStateException();
                        }

                        var9 = (var8 & 31) << 6 | var0[var6++] & 63;
                        if (var9 < 128) {
                           if (var3 >= 1373079782) {
                              throw new IllegalStateException();
                           }

                           var9 = 65533;
                        }
                        break label156;
                     }
                  }

                  var9 = 65533;
               } else {
                  label155:
                  if (var8 < 240) {
                     if (var3 >= 1373079782) {
                        throw new IllegalStateException();
                     }

                     if (var6 + 1 < var7) {
                        if (var3 >= 1373079782) {
                           throw new IllegalStateException();
                        }

                        if (128 == (var0[var6] & 192)) {
                           if (var3 >= 1373079782) {
                              throw new IllegalStateException();
                           }

                           if ((var0[1 + var6] & 192) == 128) {
                              if (var3 >= 1373079782) {
                                 throw new IllegalStateException();
                              }

                              var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                              if (var9 < 2048) {
                                 if (var3 >= 1373079782) {
                                    throw new IllegalStateException();
                                 }

                                 var9 = 65533;
                              }
                              break label155;
                           }
                        }
                     }

                     var9 = 65533;
                  } else {
                     label146:
                     if (var8 < 248) {
                        if (var3 >= 1373079782) {
                           throw new IllegalStateException();
                        }

                        if (2 + var6 < var7) {
                           if (var3 >= 1373079782) {
                              throw new IllegalStateException();
                           }

                           if ((var0[var6] & 192) == 128) {
                              if (var3 >= 1373079782) {
                                 throw new IllegalStateException();
                              }

                              if ((var0[1 + var6] & 192) == 128 && (var0[var6 + 2] & 192) == 128) {
                                 if (var3 >= 1373079782) {
                                    throw new IllegalStateException();
                                 }

                                 var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                                 if (var9 >= 65536) {
                                    if (var3 >= 1373079782) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 <= 1114111) {
                                       var9 = 65533;
                                       break label146;
                                    }

                                    if (var3 >= 1373079782) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var9 = 65533;
                                 break label146;
                              }
                           }
                        }

                        var9 = 65533;
                     } else {
                        var9 = 65533;
                     }
                  }
               }
            }

            var4[var5++] = (char)var9;
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "ia.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("ko")
   static final void method4856(boolean var0, byte var1) {
      try {
         HttpRequestTask.method93(1532028188);
         client.packetWriter.pendingWrites += -833464913;
         if (client.packetWriter.pendingWrites * -1338760881 < 50) {
            if (var1 <= 0) {
               return;
            }

            if (!var0) {
               return;
            }
         }

         client.packetWriter.pendingWrites = 0;
         if (!client.hadNetworkError) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            if (PacketWriter.method3346(client.packetWriter, 1510040957) != null) {
               PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3914, client.packetWriter.isaacCipher, -2135907448);
               PacketWriter.method3330(client.packetWriter, var2, -1771370198);

               try {
                  client.packetWriter.flush(-489061727);
               } catch (IOException var4) {
                  client.hadNetworkError = true;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ia.ko(" + ')');
      }
   }
}
