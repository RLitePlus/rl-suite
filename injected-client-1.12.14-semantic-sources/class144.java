import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fe")
public class class144 {
   @ObfuscatedName("ag")
   public static int SpriteBuffer_spriteHeight;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1768 = 50;

   @ObfuscatedSignature(descriptor = "(Ljh;Ljm;IIIII)V")
   @ObfuscatedName("th")
   public static void method3966(Scene var0, ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method5468(var1, var2, var2, var2, var2, var2);
      } else {
         boolean var7 = true;
         int var8 = var3;
         int var9 = var3 + var5;
         int var10 = var4 - 1;
         int var11 = var4 + var6;

         for (int var12 = var2; var12 <= var2 + 1; var12++) {
            if (var12 != var0.planes) {
               for (int var13 = var8; var13 <= var9; var13++) {
                  if (var13 >= 0 && var13 < var0.xSize) {
                     for (int var14 = var10; var14 <= var11; var14++) {
                        if (var14 >= 0 && var14 < var0.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                           int var15 = var0.method5690(var12, var13, var14);
                           if (var0.method5737(var15)) {
                              int var16 = var0.method5688(var12, var13, var14) - var0.method5688(var2, var3, var4);
                              BoundaryObject var17 = var0.field2903[var15];
                              if (var17 != null) {
                                 if (var17.renderable1 instanceof ModelData) {
                                    ModelData var18 = (ModelData)var17.renderable1;
                                    ModelData.method6127(
                                       var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7
                                    );
                                 }

                                 if (var17.renderable2 instanceof ModelData) {
                                    ModelData var24 = (ModelData)var17.renderable2;
                                    ModelData.method6127(
                                       var1, var24, (var13 - var3) * 128 + (1 - var5) * 64, var16, (1 - var6) * 64 + (var14 - var4) * 128, var7
                                    );
                                 }
                              }

                              byte var25 = var0.field2907[var15];

                              for (int var19 = 0; var19 < var25; var19++) {
                                 GameObject var20 = var0.field2887[var15 * 5 + var19];
                                 if (var20 != null && var20.renderable instanceof ModelData) {
                                    ModelData var21 = (ModelData)var20.renderable;
                                    int var22 = var20.endX * 1553138359 - var20.startX * 1666005069 + 1;
                                    int var23 = var20.endY * -2094327665 - var20.startY * 889015863 + 1;
                                    ModelData.method6127(
                                       var1,
                                       var21,
                                       (var20.startX * 1666005069 + var0.field3014 - var3) * 128 + (var22 - var5) * 64,
                                       var16,
                                       (var20.startY * 889015863 + var0.field3014 - var4) * 128 + (var23 - var6) * 64,
                                       var7
                                    );
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var8--;
               var7 = false;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("hq")
   static void method3969(byte var0) {
      try {
         if (null != class166.varcs) {
            if (var0 >= 8) {
               throw new IllegalStateException();
            }

            if (Varcs.method3159(class166.varcs, (byte)70)) {
               if (var0 >= 8) {
                  client.method2468();
                  return;
               }

               class166.varcs.write(1838473330);
            }
         }

         class108.method3886(1059509023);
         AbstractSocket.method10590(-1202997885);
         if (class535.mouseRecorder != null) {
            if (var0 >= 8) {
               throw new IllegalStateException();
            }

            class535.mouseRecorder.isRunning = false;
         }

         class535.mouseRecorder = null;
         client.packetWriter.close((byte)64);
         if (null != client.taskHandler) {
            if (var0 >= 8) {
               throw new IllegalStateException();
            }

            try {
               client.taskHandler.close(1444608153);
            } catch (Exception var3) {
            }
         }

         client.taskHandler = null;
         WorldMapElement.clear(-72925928);
         FloorUnderlayDefinition.method4515((byte)76);
         client.worldViewManager.clear((byte)-34);
         NodeDeque.method9797(client.projectiles);
         Skills.worldMap = null;
         classGK.method4244(0, 0, 1480988795);
         class179.method4237(-1931393605);
         client.playingJingle = false;
         class356.method7753((byte)0);
         if (Skills.pcmPlayer1 != null) {
            if (var0 >= 8) {
               throw new IllegalStateException();
            }

            Skills.pcmPlayer1.shutdown(-559888588);
         }

         VarbitComposition.field2488.method9266(-209149077);
         classLI.method7183(-1418499446);
         if (null != class164.urlRequester) {
            class164.urlRequester.close(-1481714301);
         }

         UserComparator7.method3731(545871027);
         JagexCache.JagexCache_dat2File = null;
         JagexCache.JagexCache_idx255File = null;
         UserComparator9.JagexCache_idxFiles = null;
         ObjectComposition.method5136((short)240);
         InterfaceParent.masterDisk = null;
         client.archiveLoaders.clear();
         client.field910 = 0;
         VarbitComposition.field2488 = new JagNetThread();
         class164.urlRequester = new SecureUrlRequester(SecureUrlRequester.client.https, 235);

         try {
            class62.method2631("oldschool", class365.field4638, class1.field71.name, 0, 25, 2122323037);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }

         InterfaceParent.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
         client.taskHandler = new TaskHandler();
         SecureUrlRequester.client.method760(1953679235);
         HitSplatDefinition.method5015(class69.field517, -1309726132);
         WorldMapSectionType.updateGameState(0, (byte)45);
         client.method2468();
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fe.hq(" + ')');
      }
   }

   class144() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("at")
   static String colorStartTag(int var0, int var1) {
      try {
         return "<col=" + Integer.toHexString(var0) + ">";
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fe.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Llz;")
   @ObfuscatedName("ae")
   public static MoveSpeed[] method3963(int var0) {
      try {
         return new MoveSpeed[]{MoveSpeed.field3806, MoveSpeed.field3807, MoveSpeed.field3805, MoveSpeed.field3808};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "fe.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("at")
   public static void performReflectionCheck(PacketBuffer var0, int var1) {
      try {
         ReflectionCheck var2 = (ReflectionCheck)class117.reflectionChecks.method9642();
         if (var2 == null) {
            if (var1 == -367872008) {
               throw new IllegalStateException();
            }
         } else {
            int var3 = var0.offset * 2108391709;
            var0.writeInt(var2.size * 1393129895, 304169732);

            for (int var4 = 0; var4 < var2.id * -1975307707; var4++) {
               if (var1 == -367872008) {
                  throw new IllegalStateException();
               }

               if (0 != var2.creationErrors[var4]) {
                  if (var1 == -367872008) {
                     throw new IllegalStateException();
                  }

                  var0.writeByte(var2.creationErrors[var4], (short)-497);
               } else {
                  try {
                     int var5 = var2.operations[var4];
                     if (0 == var5) {
                        if (var1 == -367872008) {
                           throw new IllegalStateException();
                        }

                        Field var6 = var2.fields[var4];
                        int var7 = var6.getInt(null);
                        var0.writeByte(0, (short)-26283);
                        var0.writeInt(var7, 537839197);
                     } else if (1 == var5) {
                        Field var24 = var2.fields[var4];
                        var24.setInt(null, var2.intReplaceValues[var4]);
                        var0.writeByte(0, (short)-14707);
                     } else if (var5 == 2) {
                        if (var1 == -367872008) {
                           throw new IllegalStateException();
                        }

                        Field var25 = var2.fields[var4];
                        int var28 = var25.getModifiers();
                        var0.writeByte(0, (short)-1191);
                        var0.writeInt(var28, 465796108);
                     }

                     if (3 != var5) {
                        if (4 == var5) {
                           Method var27 = var2.methods[var4];
                           int var30 = var27.getModifiers();
                           var0.writeByte(0, (short)-2850);
                           var0.writeInt(var30, 2048586343);
                        }
                     } else {
                        if (var1 == -367872008) {
                           throw new IllegalStateException();
                        }

                        Method var26 = var2.methods[var4];
                        byte[][] var29 = var2.arguments[var4];
                        Object[] var8 = new Object[var29.length];

                        for (int var9 = 0; var9 < var29.length; var9++) {
                           if (var1 == -367872008) {
                              return;
                           }

                           ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var29[var9]));
                           var8[var9] = var10.readObject();
                        }

                        Object var31 = var26.invoke(null, var8);
                        if (var31 == null) {
                           if (var1 == -367872008) {
                              throw new IllegalStateException();
                           }

                           var0.writeByte(0, (short)-1666);
                        } else if (var31 instanceof Number) {
                           if (var1 == -367872008) {
                              throw new IllegalStateException();
                           }

                           var0.writeByte(1, (short)-26052);
                           var0.writeLongMedium(((Number)var31).longValue());
                        } else if (var31 instanceof String) {
                           if (var1 == -367872008) {
                              throw new IllegalStateException();
                           }

                           var0.writeByte(2, (short)-15182);
                           var0.writeStringCp1252NullTerminated((String)var31, 998990159);
                        } else {
                           var0.writeByte(4, (short)-21492);
                        }
                     }
                  } catch (ClassNotFoundException var11) {
                     var0.writeByte(-10, (short)-29663);
                  } catch (InvalidClassException var12) {
                     var0.writeByte(-11, (short)-907);
                  } catch (StreamCorruptedException var13) {
                     var0.writeByte(-12, (short)-15328);
                  } catch (OptionalDataException var14) {
                     var0.writeByte(-13, (short)-16439);
                  } catch (IllegalAccessException var15) {
                     var0.writeByte(-14, (short)-2449);
                  } catch (IllegalArgumentException var16) {
                     var0.writeByte(-15, (short)-6882);
                  } catch (InvocationTargetException var17) {
                     var0.writeByte(-16, (short)-23273);
                  } catch (SecurityException var18) {
                     var0.writeByte(-17, (short)-24442);
                  } catch (IOException var19) {
                     var0.writeByte(-18, (short)-448);
                  } catch (NullPointerException var20) {
                     var0.writeByte(-19, (short)-15647);
                  } catch (Exception var21) {
                     var0.writeByte(-20, (short)-25003);
                  } catch (Throwable var22) {
                     var0.writeByte(-21, (short)-24412);
                  }
               }
            }

            var0.writeCrc(var3, -1693282382);
            var2.remove();
         }
      } catch (RuntimeException var23) {
         throw RestClientThreadFactory.newRunException(var23, "fe.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)C")
   @ObfuscatedName("an")
   static char method3967(char var0, int var1) {
      try {
         if (181 != var0) {
            if (var1 == -317825635) {
               throw new IllegalStateException();
            }

            if (402 != var0) {
               return Character.toTitleCase(var0);
            }

            if (var1 == -317825635) {
               throw new IllegalStateException();
            }
         }

         return var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fe.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([F[II)V")
   @ObfuscatedName("au")
   public static void method3968(float[] var0, int[] var1, int var2) {
      try {
         classWO.method11827(var0, var1, 0, var0.length - 1, 1570109790);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fe.au(" + ')');
      }
   }
}
