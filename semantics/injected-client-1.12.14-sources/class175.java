import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ge")
public class class175 extends classFM {
   @ObfuscatedSignature(descriptor = "Lsu;")
   @ObfuscatedName("ar")
   public static Font ItemDefinition_fontPlain11;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field1990 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field1993 = 73;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kl")
   static Archive field1995;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   public static final int field1992 = 131072;
   @ObfuscatedName("at")
   long field1994;
   @ObfuscatedName("av")
   int field1991;

   @ObfuscatedSignature(descriptor = "(Lft;FZI)F")
   @ObfuscatedName("at")
   static float method4230(classFT var0, float var1, boolean var2, int var3) {
      try {
         float var4 = 0.0F;
         if (var0 != null) {
            if (var3 >= 349664140) {
               throw new IllegalStateException();
            }

            if (classFT.method4131(var0, (byte)-64) != 0) {
               float var5 = 1994604433 * var0.field1888[0].field1818;
               float var6 = var0.field1888[classFT.method4131(var0, (byte)8) - 1].field1818 * 1994604433;
               float var7 = var6 - var5;
               if (0.0F == var7) {
                  return var0.field1888[0].field1816;
               }

               float var8 = 0.0F;
               if (var1 > var6) {
                  if (var3 >= 349664140) {
                     throw new IllegalStateException();
                  }

                  var8 = (var1 - var6) / var7;
               } else {
                  var8 = (var1 - var5) / var7;
               }

               float var9 = (int)var8;
               float var10 = Math.abs(var8 - var9);
               float var11 = var7 * var10;
               var9 = Math.abs(1.0F + var9);
               float var12 = var9 / 2.0F;
               float var13 = (int)var12;
               var10 = var12 - var13;
               if (var2) {
                  if (var3 >= 349664140) {
                     throw new IllegalStateException();
                  }

                  if (class137.field1793 == var0.field1882) {
                     if (var3 >= 349664140) {
                        throw new IllegalStateException();
                     }

                     if (0.0F != var10) {
                        if (var3 >= 349664140) {
                           throw new IllegalStateException();
                        }

                        var11 += var5;
                     } else {
                        var11 = var6 - var11;
                     }
                  } else {
                     label156: {
                        if (class137.field1792 != var0.field1882) {
                           if (var3 >= 349664140) {
                              throw new IllegalStateException();
                           }

                           if (class137.field1791 != var0.field1882) {
                              if (var0.field1882 == class137.field1794) {
                                 if (var3 >= 349664140) {
                                    throw new IllegalStateException();
                                 }

                                 var11 = var5 - var1;
                                 float var14 = var0.field1888[0].field1812;
                                 float var15 = var0.field1888[0].field1813;
                                 var4 = var0.field1888[0].field1816;
                                 if (0.0F != var14) {
                                    if (var3 >= 349664140) {
                                       throw new IllegalStateException();
                                    }

                                    var4 -= var15 * var11 / var14;
                                 }

                                 return var4;
                              }
                              break label156;
                           }

                           if (var3 >= 349664140) {
                              throw new IllegalStateException();
                           }
                        }

                        var11 = var6 - var11;
                     }
                  }
               } else if (var0.field1883 == class137.field1793) {
                  if (var3 >= 349664140) {
                     throw new IllegalStateException();
                  }

                  if (0.0F != var10) {
                     if (var3 >= 349664140) {
                        throw new IllegalStateException();
                     }

                     var11 = var6 - var11;
                  } else {
                     var11 += var5;
                  }
               } else {
                  label149: {
                     if (class137.field1792 != var0.field1883) {
                        if (var3 >= 349664140) {
                           throw new IllegalStateException();
                        }

                        if (var0.field1883 != class137.field1791) {
                           if (class137.field1794 == var0.field1883) {
                              if (var3 >= 349664140) {
                                 throw new IllegalStateException();
                              }

                              var11 = var1 - var6;
                              float var26 = var0.field1888[classFT.method4131(var0, (byte)-15) - 1].field1814;
                              float var27 = var0.field1888[classFT.method4131(var0, (byte)-19) - 1].field1815;
                              var4 = var0.field1888[classFT.method4131(var0, (byte)10) - 1].field1816;
                              if (var26 != 0.0F) {
                                 if (var3 >= 349664140) {
                                    throw new IllegalStateException();
                                 }

                                 var4 += var27 * var11 / var26;
                              }

                              return var4;
                           }
                           break label149;
                        }

                        if (var3 >= 349664140) {
                           throw new IllegalStateException();
                        }
                     }

                     var11 += var5;
                  }
               }

               var4 = HintArrow.method8726(var0, var11, -1644257037);
               if (var2) {
                  if (var3 >= 349664140) {
                     throw new IllegalStateException();
                  }

                  if (class137.field1791 == var0.field1882) {
                     if (var3 >= 349664140) {
                        throw new IllegalStateException();
                     }

                     float var28 = var0.field1888[classFT.method4131(var0, (byte)-10) - 1].field1816 - var0.field1888[0].field1816;
                     var4 -= var9 * var28;
                     return var4;
                  }
               }

               if (!var2) {
                  if (var3 >= 349664140) {
                     throw new IllegalStateException();
                  }

                  if (var0.field1883 == class137.field1791) {
                     float var16 = var0.field1888[classFT.method4131(var0, (byte)-38) - 1].field1816 - var0.field1888[0].field1816;
                     var4 += var16 * var9;
                  }
               }

               return var4;
            }

            if (var3 >= 349664140) {
               throw new IllegalStateException();
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "ge.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field1991 = Buffer.method12015(var1, 1961302722) * -1571995773;
         this.field1994 = Buffer.method12018(var1, -1997806210);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ge.av(" + ')');
      }
   }

   class175(class154 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field1991 = Buffer.method12015(var1, 2020019225) * -1571995773;
      this.field1994 = Buffer.method12018(var1, -2002592983);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field1991 = Buffer.method12015(var1, -214824959) * -1571995773;
      this.field1994 = Buffer.method12018(var1, -1924201963);
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      ClanSettings.method4334(var1, this.field1991 * -1599912149, this.field1994);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lxj;S)V")
   @ObfuscatedName("lt")
   static void method4232(WorldView var0, PacketBuffer var1, short var2) {
      WorldView var3 = AsyncHttpResponse.worldView;
      if (var3.baseX * 825809917 > 0) {
         client.field938.debug("Dropping wv load for already loaded wv {}", var3.getId());
      } else {
         PacketBuffer var5 = var1;
         WorldView var4 = var0;
         short var6 = -6564;
         client.method2402(var0, var1);

         try {
            WorldView var7 = AsyncHttpResponse.worldView;
            var7.baseX = Buffer.method12008(var5, (byte)5) * -1720428203;
            var7.baseY = Buffer.method12008(var5, (byte)5) * 1427720705;
            int var8 = var7.sizeX * 2010544793 / 8;
            int var9 = var7.sizeY * 1823353167 / 8;
            int var10 = Buffer.method12008(var5, (byte)5);
            PacketBuffer.method12336(var5, -562841432);
            int var11 = 0;

            while (true) {
               if (var11 >= 4) {
                  var5.exportIndex((byte)-58);
                  Sound.field2032 = new int[var10][4];

                  for (int var22 = 0; var22 < var10; var22++) {
                     if (var6 >= 232) {
                        throw new IllegalStateException();
                     }

                     for (int var24 = 0; var24 < 4; var24++) {
                        if (var6 >= 232) {
                           throw new IllegalStateException();
                        }

                        Sound.field2032[var22][var24] = Buffer.method12015(var5, 1284771127);
                     }
                  }

                  LoginState.field158 = new int[var10];
                  DevicePcmPlayerProvider.field43 = new int[var10];
                  HealthBarUpdate.field601 = new int[var10];
                  JagexCache.field2531 = new byte[var10][];
                  Login.field419 = new byte[var10][];
                  var10 = 0;

                  for (int var23 = 0; var23 < 4; var23++) {
                     for (int var25 = 0; var25 < var8; var25++) {
                        for (int var26 = 0; var26 < var9; var26++) {
                           int var27 = client.field791[var23][var25][var26];
                           if (var27 != -1) {
                              if (var6 >= 232) {
                                 throw new IllegalStateException();
                              }

                              int var15 = class498.method10641(var27, 1710195242);
                              int var16 = Renderable.method6216(var27, (byte)-11);
                              int var17 = (var15 / 8 << 8) + var16 / 8;

                              for (int var18 = 0; var18 < var10; var18++) {
                                 if (var17 == LoginState.field158[var18]) {
                                    var17 = -1;
                                    break;
                                 }
                              }

                              if (-1 != var17) {
                                 if (var6 >= 232) {
                                    throw new IllegalStateException();
                                 }

                                 LoginState.field158[var10] = var17;
                                 int var28 = var17 >> 8 & 0xFF;
                                 int var19 = var17 & 0xFF;
                                 DevicePcmPlayerProvider.field43[var10] = Tile.archive9.groupLoadPercentByName("m" + var28 + "_" + var19, (byte)-6);
                                 HealthBarUpdate.field601[var10] = Tile.archive9.groupLoadPercentByName("l" + var28 + "_" + var19, (byte)108);
                                 var10++;
                              }
                           }
                        }
                     }
                  }

                  client.playerUpdateManager.method3644(var7, (byte)-46);
                  WorldMapSectionType.updateGameState(25, (byte)45);
                  client.field778 = true;
                  ClientPacket.field3962 = var7;
                  classPE.method8720(var7, 689863962);
                  client.method2521(var4, var5);
                  break;
               }

               if (var6 >= 232) {
                  client.method2521(var4, var5);
                  break;
               }

               for (int var12 = 0; var12 < var8; var12++) {
                  if (var6 >= 232) {
                     throw new IllegalStateException();
                  }

                  for (int var13 = 0; var13 < var9; var13++) {
                     if (var6 >= 232) {
                        throw new IllegalStateException();
                     }

                     int var14 = var5.method12339(1, 1333712909);
                     if (var14 == 1) {
                        if (var6 >= 232) {
                           client.method2521(var4, var5);
                           return;
                        }

                        client.field791[var11][var12][var13] = var5.method12339(26, 1333712909);
                     } else {
                        client.field791[var11][var12][var13] = -1;
                     }
                  }
               }

               var11++;
            }
         } catch (RuntimeException var20) {
            throw RestClientThreadFactory.newRunException(var20, "ge.lt(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ng")
   static boolean getTapToDrop(int var0) {
      try {
         return client.tapToDrop;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ge.ng(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         ClanSettings.method4334(var1, this.field1991 * -1599912149, this.field1994);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ge.at(" + ')');
      }
   }
}
