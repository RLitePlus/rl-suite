import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ah")
public class HttpRequestTask implements Callable {
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("ke")
   static Archive archive10;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field17 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field18 = 48;
   @ObfuscatedSignature(descriptor = "Lau;")
   @ObfuscatedName("av")
   final HttpRequest field16;

   @Override
   public Object call() throws Exception {
      try {
         try {
            while (this.field16.connect((byte)-52)) {
               LoginState.method484(10L);
            }
         } catch (IOException var2) {
            return new HttpResponse("Error servicing REST query: " + var2.getMessage());
         }

         return HttpRequest.method272(this.field16, (byte)40);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ah.call(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("at")
   public Object method84() throws Exception {
      try {
         while (this.field16.connect((byte)-58)) {
            LoginState.method484(10L);
         }
      } catch (IOException var2) {
         return new HttpResponse("Error servicing REST query: " + var2.getMessage());
      }

      return HttpRequest.method272(this.field16, (byte)40);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   public Object method85() throws Exception {
      try {
         while (this.field16.connect((byte)-119)) {
            LoginState.method484(10L);
         }
      } catch (IOException var2) {
         return new HttpResponse("Error servicing REST query: " + var2.getMessage());
      }

      return HttpRequest.method272(this.field16, (byte)40);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;)[I")
   @ObfuscatedName("ea")
   public static int[] method89(NPCComposition var0) {
      return var0.headIconArchiveIds;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("mq")
   static boolean method91(int var0, int var1, int var2) {
      try {
         if (var1 >= 2000) {
            var1 -= 2000;
         }

         class524 var3 = client.worldViewManager.method2948(var0, 385247347);
         WorldEntity var4 = (WorldEntity)client.worldViewManager.method2905((byte)-97).worldEntities.get((long)var0);
         boolean var10000;
         if (-1 == var0) {
            if (var2 == 450742109) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var5 = var10000;
         if (var0 == client.currentWorldViewId * 1201323213) {
            if (var2 == 450742109) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var6 = var10000;
         boolean var7 = false;
         if (var4 != null) {
            if (var2 == 450742109) {
               throw new IllegalStateException();
            }

            if (var4.method10842((short)300) != WorldEntityOwnerType.field5256) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            var7 = var10000;
            if (!var6) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               class386 var8;
               label424: {
                  var8 = var4.worldEntityConfig.method4773(420774120);
                  if (1002 != var1) {
                     if (var2 == 450742109) {
                        throw new IllegalStateException();
                     }

                     if (var1 != 1003) {
                        if (var2 == 450742109) {
                           throw new IllegalStateException();
                        }

                        if (var1 != 1004) {
                           if (var2 == 450742109) {
                              throw new IllegalStateException();
                           }

                           if (var1 != 1013) {
                              var10000 = false;
                              break label424;
                           }

                           if (var2 == 450742109) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }

                  var10000 = true;
               }

               boolean var9 = var10000;
               if (var9) {
                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }

                  if (!var8.field4736) {
                     if (var2 == 450742109) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               }

               label412: {
                  if (var1 != 1) {
                     if (var2 == 450742109) {
                        throw new IllegalStateException();
                     }

                     label409:
                     if (var1 != 2) {
                        if (var2 == 450742109) {
                           throw new IllegalStateException();
                        }

                        if (var1 >= 3) {
                           if (var1 <= 6) {
                              break label409;
                           }

                           if (var2 == 450742109) {
                              throw new IllegalStateException();
                           }
                        }

                        if (1001 != var1) {
                           var10000 = false;
                           break label412;
                        }
                     }
                  }

                  var10000 = true;
               }

               boolean var11 = var10000;
               boolean var12 = var11;
               if (!var11) {
                  label462: {
                     if (var1 != 7) {
                        if (var2 == 450742109) {
                           throw new IllegalStateException();
                        }

                        label392:
                        if (8 != var1) {
                           if (var1 >= 9) {
                              if (var2 == 450742109) {
                                 throw new IllegalStateException();
                              }

                              if (var1 <= 13) {
                                 if (var2 == 450742109) {
                                    throw new IllegalStateException();
                                 }
                                 break label392;
                              }
                           }

                           var10000 = false;
                           break label462;
                        }
                     }

                     var10000 = true;
                  }

                  boolean var13 = var10000;
                  var12 = var13;
               }

               boolean var19 = var12;
               if (!var12) {
                  label463: {
                     if (var1 != 16) {
                        if (var2 == 450742109) {
                           throw new IllegalStateException();
                        }

                        label375:
                        if (17 != var1) {
                           if (var2 == 450742109) {
                              throw new IllegalStateException();
                           }

                           if (var1 >= 18) {
                              if (var2 == 450742109) {
                                 throw new IllegalStateException();
                              }

                              if (var1 <= 22) {
                                 if (var2 == 450742109) {
                                    throw new IllegalStateException();
                                 }
                                 break label375;
                              }
                           }

                           var10000 = false;
                           break label463;
                        }
                     }

                     var10000 = true;
                  }

                  boolean var14 = var10000;
                  var19 = var14;
               }

               boolean var20 = var19;
               if (!var19) {
                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }

                  label362: {
                     if (var1 >= 61) {
                        if (var2 == 450742109) {
                           throw new IllegalStateException();
                        }

                        if (var1 <= 67) {
                           if (var2 == 450742109) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           break label362;
                        }
                     }

                     var10000 = false;
                  }

                  boolean var15 = var10000;
                  var20 = var15;
               }

               if (var20) {
                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }

                  if (!var8.field4739) {
                     if (var2 == 450742109) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               }
            }
         }

         label353: {
            label352:
            if (var1 != 1 && 2 != var1) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               if (var1 >= 3) {
                  if (var1 <= 6) {
                     break label352;
                  }

                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }
               }

               if (1001 != var1) {
                  var10000 = false;
                  break label353;
               }

               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }
            }

            var10000 = true;
         }

         boolean var17 = var10000;
         if (var17) {
            if (var2 == 450742109) {
               throw new IllegalStateException();
            }

            if (!class524.method11141(var3, var7, var5, var6, (byte)-125)) {
               return false;
            }
         }

         label464: {
            if (var1 != 16) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               label334:
               if (17 != var1) {
                  if (var1 >= 18) {
                     if (var2 == 450742109) {
                        throw new IllegalStateException();
                     }

                     if (var1 <= 22) {
                        if (var2 == 450742109) {
                           throw new IllegalStateException();
                        }
                        break label334;
                     }
                  }

                  var10000 = false;
                  break label464;
               }
            }

            var10000 = true;
         }

         boolean var18 = var10000;
         if (var18) {
            if (var2 == 450742109) {
               throw new IllegalStateException();
            }

            if (!var3.method11142(var7, var5, var6, 923591847)) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               return false;
            }
         }

         label465: {
            if (7 != var1) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               label320:
               if (8 != var1) {
                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= 9) {
                     if (var2 == 450742109) {
                        throw new IllegalStateException();
                     }

                     if (var1 <= 13) {
                        if (var2 == 450742109) {
                           throw new IllegalStateException();
                        }
                        break label320;
                     }
                  }

                  var10000 = false;
                  break label465;
               }
            }

            var10000 = true;
         }

         boolean var10 = var10000;
         if (var10 && !var3.method11144(var7, var5, var6, (byte)-1)) {
            if (var2 == 450742109) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (classGV.method4370(var1, 1013287245)) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               if (!var3.method11145(var7, var5, var6, (byte)18)) {
                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            if (1002 == var1) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               if (!var3.method11150(var7, var5, var6, 1627122591)) {
                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            if (var1 == 1004) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               if (!var3.method11152(var7, var5, var6, 1380196845)) {
                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            if (1003 == var1) {
               if (var2 == 450742109) {
                  throw new IllegalStateException();
               }

               if (!var3.method11157(var7, var5, var6, (byte)74)) {
                  if (var2 == 450742109) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "ah.mq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII[Ljava/lang/Object;I)V")
   @ObfuscatedName("mr")
   static void method90(int var0, int var1, int var2, int var3, Object[] var4, int var5) {
      try {
         boolean var6 = false;
         Widget var7 = class226.widgetDefinition.getWidgetChild(var0, var1, -1257330356);
         if (!var6 && var7 == null) {
            if (var5 == 306760292) {
               throw new IllegalStateException();
            }
         } else if (!var6 && !class339.method7868(class191.getWidgetFlags(var7, (byte)75), -2112697734)) {
            if (var5 == 306760292) {
               throw new IllegalStateException();
            }
         } else {
            PacketBufferNode var8 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3889, client.packetWriter.isaacCipher, -1512202163);
            var8.packetBuffer.writeShort(0, -1318402369);
            int var9 = 2108391709 * var8.packetBuffer.offset;
            Buffer.method12187(var8.packetBuffer, var3, -1996945434);
            var8.packetBuffer.writeShortLE(var1, 1128756457);
            Buffer.method12187(var8.packetBuffer, var0, -1630262079);
            var8.packetBuffer.writeShortLE(var2, 906613759);
            Object[] var10 = var4;

            for (int var11 = 0; var11 < var10.length; var11++) {
               if (var5 == 306760292) {
                  throw new IllegalStateException();
               }

               Object var12 = var10[var11];
               if (var12 instanceof Integer) {
                  Buffer.method11992(var8.packetBuffer, (Integer)var12, 2095903573);
               } else if (var12 instanceof String) {
                  if (var5 == 306760292) {
                     throw new IllegalStateException();
                  }

                  var8.packetBuffer.writeStringCp1252NullTerminated((String)var12, 998990159);
               } else if (var12 instanceof DynamicArray) {
                  DynamicArray var13 = (DynamicArray)var12;
                  int var14 = var13.method11215((byte)21);
                  Buffer.method11983(var8.packetBuffer, var14, (byte)56);
                  if (var13.field6107 == class586.field6376) {
                     if (var5 == 306760292) {
                        return;
                     }

                     int[] var18 = var13.method11207(2053374425);

                     for (int var19 = 0; var19 < var14; var19++) {
                        if (var5 == 306760292) {
                           throw new IllegalStateException();
                        }

                        Buffer.method11992(var8.packetBuffer, var18[var19], 2095903573);
                     }
                  } else {
                     Object[] var15 = var13.method11214((byte)-96);

                     for (int var16 = 0; var16 < var14; var16++) {
                        if (var5 == 306760292) {
                           return;
                        }

                        var8.packetBuffer.writeStringCp1252NullTerminated((String)var15[var16], 998990159);
                     }
                  }
               } else if (null == var12) {
                  var8.packetBuffer.writeByte(0, (short)-6638);
               }
            }

            var8.packetBuffer.method11977(2108391709 * var8.packetBuffer.offset - var9, (byte)58);
            PacketWriter.method3330(client.packetWriter, var8, -1771370198);
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "ah.mr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("iu")
   static final void method93(int var0) {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;BII)I")
   @ObfuscatedName("at")
   public static int method83(Buffer var0, byte var1, int var2, int var3) {
      try {
         int var4 = var1 >> var2 & 3;
         if (3 == var4) {
            if (var3 <= -2008683221) {
               throw new IllegalStateException();
            } else {
               return Buffer.method12015(var0, 19752283);
            }
         } else if (2 == var4) {
            if (var3 <= -2008683221) {
               throw new IllegalStateException();
            } else {
               return var0.readShort((byte)-99);
            }
         } else {
            return 1 == var4 ? Buffer.method12001(var0, (byte)97) : 0;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ah.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ay")
   static int method88(int var0, int var1, int var2, int var3) {
      try {
         if (var1 >= var2) {
            if (var3 == 822588103) {
               throw new IllegalStateException();
            } else {
               return var0;
            }
         } else {
            return (int)(var0 * ((float)var1 / var2));
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ah.ay(" + 41);
      }
   }

   HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
      this.this$0 = var1;
      this.field16 = var2;
   }

   @ObfuscatedSignature(descriptor = "([BI)[B")
   @ObfuscatedName("bh")
   static final byte[] decompressBytes(byte[] var0, int var1) {
      Buffer var2 = new Buffer(var0);
      int var3 = var2.method12221();
      int var4 = var2.method12226();
      if (var4 >= 0) {
         if (var3 == 0) {
            byte[] var10 = new byte[var4];
            var2.method12224(var10, 0, var4);
            return var10;
         } else {
            int var5 = var2.method12226();
            if (var5 < 0) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  Archive.method9113(var6, var5, var0, var4, 9);
               } else {
                  synchronized (AbstractArchive.gzipDecompressor) {
                     AbstractArchive.gzipDecompressor.method12241(var2, var6);
                  }
               }

               return var6;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "([BIB)I")
   @ObfuscatedName("bv")
   public static int method86(byte[] var0, int var1, byte var2) {
      try {
         int var4 = -1;

         for (int var5 = 0; var5 < var1; var5++) {
            if (var2 != 60) {
               throw new IllegalStateException();
            }

            var4 = var4 >>> 8 ^ Buffer.field6477[(var4 ^ var0[var5]) & 0xFF];
         }

         return ~var4;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ah.bv(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;I)Lxm;")
   @ObfuscatedName("aj")
   public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2, int var3) {
      try {
         if (!var0.isValidFileName(var1, var2, -1919403045)) {
            if (var3 <= 1902206563) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var0.groupLoadPercentByName(var1, (byte)-17);
            int var5 = AbstractArchive.method9022(var0, var4, var2, 852495920);
            return HitSplatDefinition.method4982(var0, var4, var5, -1268219190);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ah.aj(" + ')');
      }
   }
}
