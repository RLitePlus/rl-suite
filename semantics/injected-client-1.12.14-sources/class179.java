import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gi")
public class class179 extends DualNode {
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   public static EvictingDualNodeHashTable field1842 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2012 = -3407872;
   @ToRemove(unused = "true")
   @ObfuscatedName("cq")
   static final int field2014 = 89;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field2013 = 30;
   @ObfuscatedName("ak")
   static Thread ArchiveDiskActionHandler_thread;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field2011 = 1076101378;

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIII)V")
   @ObfuscatedName("kc")
   static void method4240(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         NodeDeque var7 = var0.groundItems[var1][var2][var3];
         if (var7 != null) {
            if (var6 >= -1950238779) {
               return;
            }

            for (TileItem var8 = (TileItem)var7.last(); null != var8; var8 = (TileItem)var7.previous()) {
               if (var6 >= -1950238779) {
                  throw new IllegalStateException();
               }

               if (782226465 * var8.visibleTime == var4 && var5 == -1247866467 * var8.despawnTime) {
                  var8.remove();
                  break;
               }
            }

            if (var7.last() == null) {
               if (var6 >= -1950238779) {
                  return;
               }

               var0.groundItems[var1][var2][var3] = null;
            }

            class348.updateItemPile2(var0, var1, var2, var3, -2049170103);
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "gi.kc(" + ')');
      }
   }

   class179() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public static void method4237(int var0) {
      try {
         class345.field4309.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "gi.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;IIIII)Z")
   @ObfuscatedName("ac")
   static boolean method4238(Model var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         AABB var6 = var0.getAABB(var1);
         int var7 = var2 + var6.xMid * -1721312265;
         int var8 = 1267849313 * var6.yMid + var3;
         int var9 = var4 + 266507379 * var6.zMid;
         int var10 = var6.xMidOffset * 984504841;
         int var11 = var6.yMidOffset * -157622439;
         int var12 = 528344083 * var6.zMidOffset;
         int var13 = SecureUrlRequester.field1707 * -1015152063 - var7;
         int var14 = FloorUnderlayDefinition.field2186 * 2038044067 - var8;
         int var15 = class339.field4374 * -1714049539 - var9;
         if (Math.abs(var13) > var10 + class108.field1676 * 788805875) {
            if (var5 == 91500301) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Math.abs(var14) > var11 + TileItem.field1292 * -1012313495) {
            if (var5 == 91500301) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Math.abs(var15) > 50295743 * classFY.field1931 + var12) {
            if (var5 == 91500301) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Math.abs(VarpDefinition.field2411 * -840015355 * var15 - -1797444321 * Varcs.field1384 * var14)
            > 50295743 * classFY.field1931 * var11 + var12 * TileItem.field1292 * -1012313495) {
            if (var5 == 91500301) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Math.abs(var13 * -1797444321 * Varcs.field1384 - var15 * class142.field1811 * 510143033)
            > 788805875 * class108.field1676 * var12 + 50295743 * classFY.field1931 * var10) {
            if (var5 == 91500301) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Math.abs(var14 * 510143033 * class142.field1811 - -840015355 * VarpDefinition.field2411 * var13)
            > var10 * TileItem.field1292 * -1012313495 + class108.field1676 * 788805875 * var11) {
            if (var5 == 91500301) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "gi.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIB)Z")
   @ObfuscatedName("kb")
   static boolean method4241(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         return classPE.method8719(AsyncHttpResponse.worldView.plane * 2115028565, var0, var1, var2, var3, var4, var5, 1174774180);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "gi.kb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lki;I)V")
   @ObfuscatedName("jl")
   static void method4239(class279 var0, int var1) {
      try {
         if (var0 != null) {
            if (var0.field3312 != null) {
               if (2077538819 * var0.field3312.childIndex >= 0) {
                  if (var1 <= 1543527720) {
                     throw new IllegalStateException();
                  }

                  Widget var2 = class226.widgetDefinition.method7953(var0.field3312.parentId * 794900977, -14235294);
                  if (var2 == null || null == var2.children) {
                     return;
                  }

                  if (var1 <= 1543527720) {
                     throw new IllegalStateException();
                  }

                  if (var2.children.length == 0 || 2077538819 * var0.field3312.childIndex >= var2.children.length) {
                     return;
                  }

                  if (var1 <= 1543527720) {
                     throw new IllegalStateException();
                  }

                  if (var0.field3312 != var2.children[var0.field3312.childIndex * 2077538819]) {
                     return;
                  }
               }

               if (11 == var0.field3312.type * 928687775) {
                  if (var1 <= 1543527720) {
                     return;
                  }

                  if (251947843 * var0.field3313 == 0) {
                     if (var1 <= 1543527720) {
                        throw new IllegalStateException();
                     }

                     if (var0.field3312.method8106(1436225141 * var0.field3310, -1485962813 * var0.field3311, 0, 0, -1635748238)) {
                        if (var1 <= 1543527720) {
                           throw new IllegalStateException();
                        }

                        class234.method5918(
                           class225.method5282(Widget.method8141(var0.field3312, 1030819063), (byte)33),
                           1,
                           Widget.method8141(var0.field3312, 475284210).method5322((byte)25),
                           -1058808458
                        );
                        switch (Widget.method8124(var0.field3312, -1955667681)) {
                           case 0:
                              class558.openURL(var0.field3312.method8134(-974116638), (short)1305);
                              return;
                           case 1:
                              if (WorldMapCacheName.method7396(class191.getWidgetFlags(var0.field3312, (byte)75), -604505976)) {
                                 int[] var6 = var0.field3312.method8137((byte)0);
                                 if (var6 != null) {
                                    if (var1 <= 1543527720) {
                                       return;
                                    }

                                    PacketBufferNode var3 = ReflectionCheck.getPacketBufferNode(
                                       ClientPacket.field3886, client.packetWriter.isaacCipher, -1855302326
                                    );
                                    Buffer.method12187(var3.packetBuffer, var0.field3312.method8130(-1531019798), 1666237719);
                                    var3.packetBuffer.writeShortLE(var0.field3312.childIndex * 2077538819, 1177061486);
                                    var3.packetBuffer.writeIntIME(var6[2], 783375377);
                                    Buffer.method12187(var3.packetBuffer, var6[1], 547374872);
                                    var3.packetBuffer.writeIntIME(var6[0], 783375377);
                                    Buffer.method12187(var3.packetBuffer, 278777747 * var0.field3312.id, 623854895);
                                    PacketWriter.method3330(client.packetWriter, var3, -1771370198);
                                 }

                                 return;
                              }
                        }
                     }

                     return;
                  }
               }

               if (12 == 928687775 * var0.field3312.type) {
                  classOO var5 = var0.field3312.method8156(2080800876);
                  if (var5 != null) {
                     if (var1 <= 1543527720) {
                        return;
                     }

                     if (var5.method8541(-54689902)) {
                        if (var1 <= 1543527720) {
                           throw new IllegalStateException();
                        }

                        switch (var0.field3313 * 251947843) {
                           case 0:
                              client.widgetFocusInputManager.method6353(var0.field3312, (byte)65);
                              var5.method8371(true, 1485355144);
                              var5.method8504(
                                 1436225141 * var0.field3310,
                                 -1485962813 * var0.field3311,
                                 IndexCheck.method6514(client.indexCheck, 82, (short)1337),
                                 IndexCheck.method6514(client.indexCheck, 81, (short)1337),
                                 -1718147780
                              );
                              break;
                           case 1:
                              var5.method8509(1436225141 * var0.field3310, var0.field3311 * -1485962813, -658285040);
                        }
                     }
                  }
               }

               return;
            }

            if (var1 <= 1543527720) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gi.jl(" + ')');
      }
   }
}
