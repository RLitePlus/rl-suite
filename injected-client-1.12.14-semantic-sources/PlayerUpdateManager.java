import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dz")
public class PlayerUpdateManager {
   @ObfuscatedName("ai")
   int field1538;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field1545 = 1;
   @ObfuscatedName("ag")
   final int[] playerIndices = new int[2048];
   @ObfuscatedName("az")
   int playerCount;
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("ak")
   final Buffer field1534;
   @ObfuscatedSignature(descriptor = "[Llz;")
   @ObfuscatedName("aj")
   final MoveSpeed[] field1532;
   @ObfuscatedName("ae")
   final boolean[] field1531;
   @ObfuscatedName("ay")
   final int[] Players_targetIndices;
   @ObfuscatedName("ap")
   final int[] Players_emptyIndices;
   @ObfuscatedName("aw")
   final String[] field1533;
   @ObfuscatedName("au")
   final int[] Players_pendingUpdateIndices;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1546 = 2;
   @ObfuscatedSignature(descriptor = "[Lbh;")
   @ObfuscatedName("an")
   final class46[] Players_regions = new class46[2048];
   @ObfuscatedName("as")
   int Players_pendingUpdateCount;
   @ObfuscatedName("ad")
   int Players_emptyIdxCount;
   @ObfuscatedName("ns")
   static String sessionId;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field1544 = 1073741824;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field1543 = 27;

   @ObfuscatedSignature(descriptor = "(Ldz;I)V")
   @ObfuscatedName("ov")
   public static void method3659(PlayerUpdateManager var0, int var1) {
      if (var0 == null) {
         var0.method3661(var1);
      }

      try {
         var0.field1538 = 0;

         for (int var2 = 0; var2 < 2048; var2++) {
            if (var1 == 1051081121) {
               return;
            }

            var0.Players_regions[var2].method534((byte)-76);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dz.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method3633() {
      for (int var1 = 0; var1 < 1555789145 * this.Players_pendingUpdateCount; var1++) {
         int var2 = this.Players_targetIndices[var1];
         class46 var3 = this.Players_regions[var2];

         for (WorldView var5 : client.worldViewManager) {
            Player var6 = (Player)var5.npcs.get(var2);
            if (null != var6) {
               var3.method542(var6, 871222113);
               var6.detach();
            }
         }

         var3.method545((byte)26);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("av")
   final void updatePlayer(PacketBuffer var1, int var2) {
      try {
         method3659(this, -1841972177);
         PacketBuffer.method12336(var1, 1537483682);
         int var3 = client.localPlayerIndex * -1548864151;
         class46 var4 = this.Players_regions[var3];
         int var5 = var1.method12339(30, 1333712909);
         var4.method537(-1, -1817290030);
         var4.coord.method8309(var5, 1388091988);
         var4.field176 = 0;
         Player var6 = var4.method550(var3, Occluder.topLevelWorldView, 1653562717);
         class46.method540(var4, var6, 2085366366);
         GrandExchangeOfferTotalQuantityComparator.method9179(Occluder.topLevelWorldView.npcs, var6, var3);
         class330.localPlayer = var6;
         this.field1538 = 0;
         this.playerIndices[(this.field1538 += -2117789093) * 1320060371 - 1] = var3;
         this.playerCount = 0;

         for (int var7 = 1; var7 < 2048; var7++) {
            if (var7 != var3) {
               int var8 = var1.method12339(18, 1333712909);
               int var9 = var8 >> 16;
               int var10 = var8 >> 8 & 0xFF;
               int var11 = var8 & 0xFF;
               this.Players_regions[var7].method537(Coord.method8286(var9, var10, var11, (byte)28), -1854356237);
               this.Players_emptyIndices[(this.playerCount += 787561297) * -1752371791 - 1] = var7;
            }
         }

         var1.exportIndex((byte)-93);
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "dz.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;B)V")
   @ObfuscatedName("yn")
   public static void method3634(PlayerUpdateManager var0, byte var1) {
      if (var0 == null) {
         var0.method3637(var1);
      }

      try {
         for (int var2 = 0; var2 < 1555789145 * var0.Players_pendingUpdateCount; var2++) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            int var3 = var0.Players_targetIndices[var2];
            class46 var4 = var0.Players_regions[var3];
            Iterator var5 = client.worldViewManager.iterator();

            while (var5.hasNext()) {
               if (var1 != 0) {
                  return;
               }

               WorldView var6 = (WorldView)var5.next();
               Player var7 = (Player)var6.npcs.get(var3);
               if (null != var7) {
                  var4.method542(var7, 1381053839);
                  var7.detach();
               }
            }

            var4.method545((byte)-43);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "dz.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("ar")
   final void method3609(PacketBuffer var1, int var2) {
      int var3 = var1.offset * -638175095;
      this.Players_emptyIdxCount = 0;
      this.method3617(var1, -130823381);
      method3634(this, (byte)0);
      method3641(this, 716849969);
      this.updatePlayers(var1, -1295341675);
      method3647(this, (byte)64);
      if (var1.offset * 1454690778 - var3 != var2) {
         throw new RuntimeException(var1.offset * 2108391709 - var3 + " " + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)I")
   @ObfuscatedName("an")
   int method3620(PacketBuffer var1, int var2) {
      try {
         int var3 = var1.method12339(2, 1333712909);
         int var4;
         if (0 == var3) {
            if (var2 >= 1599863785) {
               throw new IllegalStateException();
            }

            var4 = 0;
         } else if (var3 == 1) {
            if (var2 >= 1599863785) {
               throw new IllegalStateException();
            }

            var4 = var1.method12339(5, 1333712909);
         } else if (2 == var3) {
            if (var2 >= 1599863785) {
               throw new IllegalStateException();
            }

            var4 = var1.method12339(8, 1333712909);
         } else {
            var4 = var1.method12339(11, 1333712909);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "dz.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;IB)V")
   @ObfuscatedName("ae")
   void readPlayerUpdate(PacketBuffer var1, int var2, byte var3) {
      try {
         boolean var10000;
         if (var1.method12339(1, 1333712909) == 1) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         if (var4) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            this.Players_pendingUpdateIndices[(this.Players_emptyIdxCount += 1674177231) * 1318902831 - 1] = var2;
         }

         int var5 = var1.method12339(2, 1333712909);
         class46 var6 = this.Players_regions[var2];
         if (var5 == 0) {
            if (var4) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               } else {
                  this.field1531[var2] = false;
               }
            } else if (client.localPlayerIndex * -1548864151 == var2) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else {
               var6.method554((byte)16);
               if (var1.method12339(1, 1333712909) != 0) {
                  if (var3 <= 1) {
                     return;
                  }

                  method3631(this, var1, var2, (byte)-52);
               }

               this.Players_targetIndices[(this.Players_pendingUpdateCount += -1916566807) * 1555789145 - 1] = var2;
            }
         } else if (1 == var5) {
            if (var3 > 1) {
               int var15 = var1.method12339(3, 1333712909);
               Coord var18 = var6.coord;
               if (0 == var15) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var18.x -= -612920153;
                  var18.y -= 715626839;
               } else if (1 == var15) {
                  var18.y -= 715626839;
               } else if (2 == var15) {
                  var18.x += -612920153;
                  var18.y -= 715626839;
               } else if (var15 == 3) {
                  if (var3 <= 1) {
                     return;
                  }

                  var18.x -= -612920153;
               } else if (var15 == 4) {
                  if (var3 <= 1) {
                     return;
                  }

                  var18.x += -612920153;
               } else if (var15 == 5) {
                  var18.x -= -612920153;
                  var18.y += 715626839;
               } else if (6 == var15) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var18.y += 715626839;
               } else if (var15 == 7) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var18.x += -612920153;
                  var18.y += 715626839;
               }

               this.field1531[var2] = true;
               this.field1532[var2] = var6.pathTraversed;
            }
         } else if (var5 == 2) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               int var14 = var1.method12339(4, 1333712909);
               Coord var17 = var6.coord;
               if (var14 == 0) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x -= -1225840306;
                  var17.y -= 1431253678;
               } else if (1 == var14) {
                  if (var3 <= 1) {
                     return;
                  }

                  var17.x -= -612920153;
                  var17.y -= 1431253678;
               } else if (var14 == 2) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.y -= 1431253678;
               } else if (3 == var14) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x += -612920153;
                  var17.y -= 1431253678;
               } else if (4 == var14) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x += -1225840306;
                  var17.y -= 1431253678;
               } else if (5 == var14) {
                  if (var3 <= 1) {
                     return;
                  }

                  var17.x -= -1225840306;
                  var17.y -= 715626839;
               } else if (var14 == 6) {
                  if (var3 <= 1) {
                     return;
                  }

                  var17.x += -1225840306;
                  var17.y -= 715626839;
               } else if (7 == var14) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x -= -1225840306;
               } else if (8 == var14) {
                  var17.x += -1225840306;
               } else if (var14 == 9) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x -= -1225840306;
                  var17.y += 715626839;
               } else if (10 == var14) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x += -1225840306;
                  var17.y += 715626839;
               } else if (11 == var14) {
                  if (var3 <= 1) {
                     return;
                  }

                  var17.x -= -1225840306;
                  var17.y += 1431253678;
               } else if (var14 == 12) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x -= -612920153;
                  var17.y += 1431253678;
               } else if (13 == var14) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.y += 1431253678;
               } else if (14 == var14) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x += -612920153;
                  var17.y += 1431253678;
               } else if (var14 == 15) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var17.x += -1225840306;
                  var17.y += 1431253678;
               }

               this.field1531[var2] = true;
               this.field1532[var2] = var6.pathTraversed;
            }
         } else {
            int var7 = var1.method12339(1, 1333712909);
            if (0 == var7) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               } else {
                  int var16 = var1.method12339(12, 1333712909);
                  int var19 = var16 >> 10;
                  int var20 = var16 >> 5 & 31;
                  if (var20 > 15) {
                     if (var3 <= 1) {
                        return;
                     }

                     var20 -= 32;
                  }

                  int var21 = var16 & 31;
                  if (var21 > 15) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var21 -= 32;
                  }

                  Coord var22 = var6.coord;
                  var22.plane = (byte)(var22.plane * 370217423 + var19 & 3) * 969692463;
                  var22.x += -612920153 * var20;
                  var22.y += 715626839 * var21;
                  this.field1531[var2] = true;
                  this.field1532[var2] = var6.pathTraversed;
               }
            } else {
               int var8 = var1.method12339(30, 1333712909);
               int var9 = Coord.method8288(var8, -1599549181);
               int var10 = Coord.method8292(var8, 1956889788);
               int var11 = Coord.method8294(var8, 1346086770);
               Coord var12 = var6.coord;
               var12.plane = (byte)(var9 + 370217423 * var12.plane & 3) * 969692463;
               var12.x = (-1931160809 * var12.x + var10 & 16383) * -612920153;
               var12.y = 715626839 * (-263036313 * var12.y + var11 & 16383);
               this.field1531[var2] = true;
               this.field1532[var2] = var6.pathTraversed;
            }
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "dz.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("lj")
   public void method3662(PacketBuffer var1, int var2) {
      Actor.field1187 = true;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;B)V")
   @ObfuscatedName("bo")
   public static void method3647(PlayerUpdateManager var0, byte var1) {
      if (var0 == null) {
         var0.method3651(var1);
      } else {
         try {
            for (int var2 = 0; var2 < 1320060371 * var0.field1538; var2++) {
               if (var1 != 64) {
                  throw new IllegalStateException();
               }

               int var3 = var0.playerIndices[var2];
               if (var0.field1531[var3]) {
                  class46 var4 = var0.Players_regions[var3];
                  var4.method569(var0.field1532[var3], (byte)-32);
                  var0.field1531[var3] = false;
               }
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "dz.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("ba")
   void method3643(WorldView var1) {
      for (int var2 = 0; var2 < this.field1538 * 1320060371; var2++) {
         int var3 = this.playerIndices[var2];
         class46 var4 = this.Players_regions[var3];
         Coord var5 = var4.coord;
         Player var6 = (Player)var1.npcs.get(var3);
         boolean var7 = -1931160809 * var5.x > 748859673 * var1.baseX
            && var5.y * -523713223 > -1512134761 * var1.baseY
            && var5.x * -1068229443 < var1.sizeX * -1631731457 + var1.baseX * -201311889
            && -2008117441 * var5.y < var1.sizeY * 1823353167 + var1.baseY * 1279964673;
         if (client.localPlayerIndex * -1548864151 == var3 && var7 && -1 != 1770274851 * var1.id) {
            client.currentWorldViewId = var1.id * -107516717;
         }

         if (var7 && null == var6) {
            var6 = var4.method550(var3, var1, 1758767443);
            class46.method540(var4, var6, 1678036809);
            GrandExchangeOfferTotalQuantityComparator.method9179(var1.npcs, var6, var3);
         } else if (!var7 && null != var6 && var6 != class330.localPlayer) {
            var4.method542(var6, 599776518);
            var6.detach();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;B)V")
   @ObfuscatedName("ap")
   void method3644(WorldView var1, byte var2) {
      try {
         for (int var3 = 0; var3 < this.field1538 * 1320060371; var3++) {
            if (var2 >= 50) {
               throw new IllegalStateException();
            }

            int var4;
            class46 var5;
            Player var7;
            boolean var10000;
            label94: {
               var4 = this.playerIndices[var3];
               var5 = this.Players_regions[var4];
               Coord var6 = var5.coord;
               var7 = (Player)var1.npcs.get(var4);
               if (-1931160809 * var6.x > 825809917 * var1.baseX) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  if (var6.y * -263036313 > 1279964673 * var1.baseY && var6.x * -1931160809 < var1.sizeX * 2010544793 + var1.baseX * 825809917) {
                     if (var2 >= 50) {
                        throw new IllegalStateException();
                     }

                     if (-263036313 * var6.y < var1.sizeY * 1823353167 + var1.baseY * 1279964673) {
                        if (var2 >= 50) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                        break label94;
                     }
                  }
               }

               var10000 = false;
            }

            boolean var8 = var10000;
            if (client.localPlayerIndex * -1548864151 == var4) {
               if (var2 >= 50) {
                  return;
               }

               if (var8) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  if (-1 != 577964535 * var1.id) {
                     if (var2 >= 50) {
                        throw new IllegalStateException();
                     }

                     client.currentWorldViewId = var1.id * -1981865517;
                  }
               }
            }

            if (var8 && null == var7) {
               if (var2 >= 50) {
                  throw new IllegalStateException();
               }

               var7 = var5.method550(var4, var1, 1205430090);
               class46.method540(var5, var7, 2061503532);
               GrandExchangeOfferTotalQuantityComparator.method9179(var1.npcs, var7, var4);
            } else if (!var8 && null != var7) {
               if (var2 >= 50) {
                  return;
               }

               if (var7 != class330.localPlayer) {
                  if (var2 >= 50) {
                     throw new IllegalStateException();
                  }

                  var5.method542(var7, 633020534);
                  var7.detach();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "dz.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("ay")
   void updatePlayers(PacketBuffer var1, int var2) {
      try {
         for (int var3 = 0; var3 < 1318902831 * this.Players_emptyIdxCount; var3++) {
            if (var2 == 725764462) {
               return;
            }

            int var4 = this.Players_pendingUpdateIndices[var3];
            int var5 = var1.readUnsignedByte(1402092600);
            if (0 != (var5 & 1)) {
               var5 += var1.readUnsignedByte(-1174822496) << 8;
            }

            if ((var5 & 256) != 0) {
               var5 += var1.readUnsignedByte(191931566) << 16;
            }

            this.method3652(var1, var4, var5, -1465216876);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "dz.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("ax")
   final void method3610(PacketBuffer var1, int var2) {
      int var3 = var1.offset * 2108391709;
      this.Players_emptyIdxCount = 0;
      this.method3617(var1, 194889104);
      method3634(this, (byte)0);
      method3641(this, 162186026);
      this.updatePlayers(var1, -986362855);
      method3647(this, (byte)64);
      if (var1.offset * 2108391709 - var3 != var2) {
         throw new RuntimeException(var1.offset * 2108391709 - var3 + " " + var2);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxj;)I")
   @ObfuscatedName("om")
   public static int method3621(PlayerUpdateManager var0, PacketBuffer var1) {
      if (var0 == null) {
         var0.method3615(var1);
      }

      int var2 = var1.method12339(2, 1333712909);
      int var3;
      if (0 == var2) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var1.method12339(5, 1333712909);
      } else if (2 == var2) {
         var3 = var1.method12339(8, 1333712909);
      } else {
         var3 = var1.method12339(11, 1333712909);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxj;III)V")
   @ObfuscatedName("az")
   void method3652(PacketBuffer var1, int var2, int var3, int var4) {
      try {
         class46 var5 = this.Players_regions[var2];
         int var6 = Integer.MAX_VALUE;
         if (0 != (var3 & 4)) {
            if (var4 == 1867695331) {
               throw new IllegalStateException();
            }

            int var7 = var1.readUnsignedByteAdd(1349804019);
            byte[] var8 = new byte[var7];
            Buffer var9 = new Buffer(var8);
            var1.writeBytes(var8, 0, var7, 1425102174);
            var5.method571(var9, 574338365);
         }

         if (0 != (var3 & 16384)) {
            if (var4 == 1867695331) {
               return;
            }

            var6 = var1.readByteNeg(344605225);
            if (127 == var6) {
               if (var4 == 1867695331) {
                  throw new IllegalStateException();
               }

               this.field1532[var2] = MoveSpeed.field3805;
            } else {
               this.field1532[var2] = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var6, (byte)1);
            }
         }

         if (0 != (var3 & 8192)) {
            int var17 = 1759706017 * client.cycle + var1.readUnsignedShortAdd(-1156088784);
            int var28 = 1759706017 * client.cycle + var1.readUnsignedShortAdd(-1156088784);
            byte var37 = var1.readByteSub(-639471049);
            byte var10 = var1.readByteAdd((byte)-108);
            byte var11 = var1.readByteSub(-639471049);
            byte var12 = (byte)var1.readUnsignedByteAdd(1073245106);
            var5.method612(var17, var28, var37, var10, var11, var12, -815735561);
         }

         if (0 != (var3 & 128)) {
            if (var4 == 1867695331) {
               throw new IllegalStateException();
            }

            int var18 = Buffer.method12008(var1, (byte)5);
            class46.method595(var5, var18, -816455450);
         }

         if (0 != (var3 & 16)) {
            if (var4 == 1867695331) {
               throw new IllegalStateException();
            }

            int var19 = var1.readUnsignedShortLE((byte)-3);
            if (65535 == var19) {
               if (var4 == 1867695331) {
                  throw new IllegalStateException();
               }

               var19 = -1;
            }

            int var29 = var1.readUnsignedByteAdd(1739371390);
            var5.method575(var19, var29, (byte)1);
         }

         if (0 != (var3 & 32)) {
            if (var4 == 1867695331) {
               return;
            }

            String var20 = var1.readStringCp1252NullCircumfixed(1783588984);
            var5.method582(var20, (byte)1);
         }

         if ((var3 & 4096) != 0) {
            if (var4 == 1867695331) {
               return;
            }

            int var21 = var1.readUnsignedShortAdd(-1156088784);
            int var30 = var21 >> 8;
            int var10000;
            if (var30 >= 13 && var30 <= 20) {
               if (var4 == 1867695331) {
                  return;
               }

               var10000 = var30 - 12;
            } else {
               var10000 = 0;
            }

            int var38 = var10000;
            PlayerType var43 = (PlayerType)GrandExchangeOffer.findEnumerated(Varps.PlayerType_values(-1764497545), var1.readUnsignedByteNeg(489473782), (byte)1);
            boolean var61;
            if (var1.readUnsignedByteNeg(-1659498218) == 1) {
               if (var4 == 1867695331) {
                  return;
               }

               var61 = true;
            } else {
               var61 = false;
            }

            boolean var48 = var61;
            int var53 = var1.readUnsignedByteSub((byte)-45);
            this.field1534.offset = 0;
            var1.method12206(this.field1534.array, 0, var53, (byte)23);
            this.field1534.offset = 0;
            String var13 = AbstractFont.escapeBrackets(ClanChannelMember.method3946(ObjectSound.method2647(this.field1534, 162307969), -421912782));
            byte[] var14 = null;
            if (var38 > 0) {
               if (var4 == 1867695331) {
                  return;
               }

               if (var38 <= 8) {
                  if (var4 == 1867695331) {
                     throw new IllegalStateException();
                  }

                  var14 = new byte[var38];

                  for (int var15 = 0; var15 < var38; var15++) {
                     var14[var15] = var1.readByteAdd((byte)-1);
                  }
               }
            }

            class46.method598(var5, var21, var43, var48, var13, var14, (byte)3);
         }

         if ((var3 & 64) != 0) {
            int var22 = var1.readUnsignedByteNeg(189024688);
            if (var22 > 0) {
               if (var4 == 1867695331) {
                  throw new IllegalStateException();
               }

               for (int var31 = 0; var31 < var22; var31++) {
                  if (var4 == 1867695331) {
                     return;
                  }

                  int var44 = -1;
                  int var49 = -1;
                  int var54 = -1;
                  int var39 = Buffer.method12050(var1, -1267311793);
                  if (var39 == 32767) {
                     if (var4 == 1867695331) {
                        throw new IllegalStateException();
                     }

                     var39 = Buffer.method12050(var1, -1003160901);
                     var49 = Buffer.method12050(var1, 1035386796);
                     var44 = Buffer.method12050(var1, 590979043);
                     var54 = Buffer.method12050(var1, 1916374315);
                  } else if (32766 != var39) {
                     var49 = Buffer.method12050(var1, -117078951);
                  } else {
                     var39 = -1;
                  }

                  int var57 = Buffer.method12050(var1, 1227373710);
                  var5.method585(var39, var49, var44, var54, var57, (byte)36);
               }
            }

            int var32 = var1.readUnsignedByteNeg(-752169146);
            if (var32 > 0) {
               if (var4 == 1867695331) {
                  throw new IllegalStateException();
               }

               for (int var40 = 0; var40 < var32; var40++) {
                  if (var4 == 1867695331) {
                     throw new IllegalStateException();
                  }

                  int var45 = Buffer.method12050(var1, -262086409);
                  int var50 = Buffer.method12050(var1, -1097294824);
                  if (var50 != 32767) {
                     int var55 = Buffer.method12050(var1, -415637287);
                     int var58 = var1.readUnsignedByte(281010940);
                     int var60 = var50 > 0 ? var1.readUnsignedByteAdd(-587551822) : var58;
                     class46.method586(var5, var45, var50, var55, var58, var60, 1738060518);
                  } else {
                     var5.method591(var45, -39093119);
                  }
               }
            }
         }

         if ((var3 & 2048) != 0) {
            if (var4 == 1867695331) {
               return;
            }

            var5.pathTraversed = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var1.readByteAdd((byte)-60), (byte)1);
            if (var6 == Integer.MAX_VALUE) {
               if (var4 == 1867695331) {
                  return;
               }

               this.field1532[var2] = var5.pathTraversed;
            }
         }

         if (0 != (var3 & 2)) {
            var1.readUnsignedShortLE((byte)-93);
            var1.readUnsignedByteNeg(-1750124392);
            var1.readUnsignedByte(304666418);
            int var23 = var1.readUnsignedByteSub((byte)18);
            this.field1534.offset = 0;
            var1.method12209(this.field1534.array, 0, var23, (byte)88);
            this.field1534.offset = 0;
         }

         if ((var3 & 65536) != 0) {
            if (var4 == 1867695331) {
               throw new IllegalStateException();
            }

            int var24 = var1.readUnsignedByte(1668629664);

            for (int var33 = 0; var33 < var24; var33++) {
               int var41 = var1.readUnsignedByte(890142427);
               int var46 = var1.readUnsignedShortAddLE(972641036);
               int var51 = Buffer.method12203(var1, -1712965741);
               var5.method616(var41, var46, var51 >> 16, var51 & 65535, (byte)5);
            }
         }

         if ((var3 & 1024) != 0) {
            for (int var25 = 0; var25 < 3; var25++) {
               this.field1533[var25] = var1.readStringCp1252NullCircumfixed(-1638036450);
            }

            class46.method610(var5, this.field1533, -937676350);
         }

         if (0 != (var3 & 512)) {
            if (var4 == 1867695331) {
               throw new IllegalStateException();
            }

            byte var26 = var1.readByteSub(-639471049);
            byte var34 = Buffer.method12001(var1, (byte)96);
            byte var42 = Buffer.method12001(var1, (byte)75);
            byte var47 = var1.readByteAdd((byte)-80);
            int var52 = var1.readUnsignedShortAdd(-1156088784) + 1759706017 * client.cycle;
            int var56 = Buffer.method12008(var1, (byte)5) + client.cycle * 1759706017;
            int var59 = var1.readUnsignedShortAddLE(1698414431);
            var5.method600(var26, var34, var42, var47, var52, var56, var59, -1543563048);
            this.field1531[var2] = false;
         }

         if (0 != (var3 & 8)) {
            int var35 = Buffer.method12008(var1, (byte)5);
            var35 += var1.readUnsignedByteSub((byte)-82) << 16;
            int var27 = 16777215;
            if (var27 == var35) {
               if (var4 == 1867695331) {
                  return;
               }

               var35 = -1;
            }

            var5.method577(var35, -1115713671);
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "dz.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lci;I)V")
   @ObfuscatedName("ad")
   void method3657(Player var1, int var2) {
      this.method3663(var1);

      try {
         if (var1 == null) {
            if (var2 >= 16711935) {
               throw new IllegalStateException();
            }
         } else {
            this.Players_regions[var1.index * -1903023775].method542(var1, 1260057330);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dz.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;)I")
   @ObfuscatedName("aa")
   int method3622(PacketBuffer var1) {
      int var2 = var1.method12339(2, 1333712909);
      int var3;
      if (0 == var2) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var1.method12339(5, 1333712909);
      } else if (2 == var2) {
         var3 = var1.method12339(8, 1333712909);
      } else {
         var3 = var1.method12339(11, 1333712909);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("ah")
   void method3614(PacketBuffer var1) {
      this.Players_pendingUpdateCount = 0;
      int var2 = 0;
      PacketBuffer.method12336(var1, -1098714804);

      for (int var3 = 0; var3 < this.field1538 * 1181509566; var3++) {
         int var4 = this.playerIndices[var3];
         if ((this.Players_regions[var4].field176 & 1) == 0) {
            if (var2 > 0) {
               var2--;
               this.Players_regions[var4].field176 = (byte)(this.Players_regions[var4].field176 | 2);
            } else {
               int var5 = var1.method12339(1, 1333712909);
               if (var5 == 0) {
                  var2 = this.method3620(var1, -899980674);
                  this.Players_regions[var4].field176 = (byte)(this.Players_regions[var4].field176 | 2);
               } else {
                  this.readPlayerUpdate(var1, var4, (byte)99);
               }
            }
         }
      }

      var1.exportIndex((byte)-96);
      if (0 != var2) {
         throw new RuntimeException();
      } else {
         PacketBuffer.method12336(var1, 863606939);

         for (int var6 = 0; var6 < -2095833480 * this.field1538; var6++) {
            int var10 = this.playerIndices[var6];
            if ((this.Players_regions[var10].field176 & 1) != 0) {
               if (var2 > 0) {
                  var2--;
                  this.Players_regions[var10].field176 = (byte)(this.Players_regions[var10].field176 | 2);
               } else {
                  int var13 = var1.method12339(1, 1333712909);
                  if (0 == var13) {
                     var2 = this.method3620(var1, -1995753247);
                     this.Players_regions[var10].field176 = (byte)(this.Players_regions[var10].field176 | 2);
                  } else {
                     this.readPlayerUpdate(var1, var10, (byte)78);
                  }
               }
            }
         }

         var1.exportIndex((byte)61);
         if (0 != var2) {
            throw new RuntimeException();
         } else {
            PacketBuffer.method12336(var1, 854262370);

            for (int var7 = 0; var7 < this.playerCount * -1752371791; var7++) {
               int var11 = this.Players_emptyIndices[var7];
               if ((this.Players_regions[var11].field176 & 1) != 0) {
                  if (var2 > 0) {
                     var2--;
                     this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                  } else {
                     int var14 = var1.method12339(1, 1333712909);
                     if (var14 == 0) {
                        var2 = this.method3620(var1, 900440115);
                        this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                     } else if (method3631(this, var1, var11, (byte)-33)) {
                        this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                     }
                  }
               }
            }

            var1.exportIndex((byte)-77);
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               PacketBuffer.method12336(var1, 1479798677);

               for (int var8 = 0; var8 < this.playerCount * 2133854148; var8++) {
                  int var12 = this.Players_emptyIndices[var8];
                  if ((this.Players_regions[var12].field176 & 1) == 0) {
                     if (var2 > 0) {
                        var2--;
                        this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                     } else {
                        int var15 = var1.method12339(1, 1333712909);
                        if (0 == var15) {
                           var2 = this.method3620(var1, -1770413603);
                           this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                        } else if (method3631(this, var1, var12, (byte)35)) {
                           this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                        }
                     }
                  }
               }

               var1.exportIndex((byte)60);
               if (0 != var2) {
                  throw new RuntimeException();
               } else {
                  this.field1538 = 0;
                  this.playerCount = 0;

                  for (int var9 = 1; var9 < -2013636122; var9++) {
                     this.Players_regions[var9].field176 = (byte)(this.Players_regions[var9].field176 >> 1);
                     if (this.Players_regions[var9].method551(-1469706480)) {
                        this.playerIndices[(this.field1538 += -2117789093) * 1585729655 - 1] = var9;
                     } else {
                        this.Players_emptyIndices[(this.playerCount += 419871195) * 1671214687 - 1] = var9;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;)I")
   @ObfuscatedName("am")
   int method3623(PacketBuffer var1) {
      int var2 = var1.method12339(2, 1333712909);
      int var3;
      if (0 == var2) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var1.method12339(5, 1333712909);
      } else if (2 == var2) {
         var3 = var1.method12339(8, 1333712909);
      } else {
         var3 = var1.method12339(11, 1333712909);
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("dl")
   public static void method3638(PlayerUpdateManager var0) {
      if (var0 == null) {
         var0.method3660();
      }

      client.currentWorldViewId = 1092382715;

      for (WorldView var2 : client.worldViewManager) {
         var0.method3644(var2, (byte)33);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("al")
   void method3615(PacketBuffer var1) {
      this.Players_pendingUpdateCount = 0;
      int var2 = 0;
      PacketBuffer.method12336(var1, 948949070);

      for (int var3 = 0; var3 < this.field1538 * 1041752392; var3++) {
         int var4 = this.playerIndices[var3];
         if ((this.Players_regions[var4].field176 & 1) == 0) {
            if (var2 > 0) {
               var2--;
               this.Players_regions[var4].field176 = (byte)(this.Players_regions[var4].field176 | 2);
            } else {
               int var5 = var1.method12339(1, 1333712909);
               if (var5 == 0) {
                  var2 = this.method3620(var1, 313612257);
                  this.Players_regions[var4].field176 = (byte)(this.Players_regions[var4].field176 | 2);
               } else {
                  this.readPlayerUpdate(var1, var4, (byte)66);
               }
            }
         }
      }

      var1.exportIndex((byte)0);
      if (0 != var2) {
         throw new RuntimeException();
      } else {
         PacketBuffer.method12336(var1, 1108021247);

         for (int var6 = 0; var6 < 1261231522 * this.field1538; var6++) {
            int var10 = this.playerIndices[var6];
            if ((this.Players_regions[var10].field176 & 1) != 0) {
               if (var2 > 0) {
                  var2--;
                  this.Players_regions[var10].field176 = (byte)(this.Players_regions[var10].field176 | 2);
               } else {
                  int var13 = var1.method12339(1, 1333712909);
                  if (0 == var13) {
                     var2 = this.method3620(var1, -555451431);
                     this.Players_regions[var10].field176 = (byte)(this.Players_regions[var10].field176 | 2);
                  } else {
                     this.readPlayerUpdate(var1, var10, (byte)93);
                  }
               }
            }
         }

         var1.exportIndex((byte)77);
         if (0 != var2) {
            throw new RuntimeException();
         } else {
            PacketBuffer.method12336(var1, -1929837285);

            for (int var7 = 0; var7 < this.playerCount * -1752371791; var7++) {
               int var11 = this.Players_emptyIndices[var7];
               if ((this.Players_regions[var11].field176 & 1) != 0) {
                  if (var2 > 0) {
                     var2--;
                     this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                  } else {
                     int var14 = var1.method12339(1, 1333712909);
                     if (var14 == 0) {
                        var2 = this.method3620(var1, -1068229766);
                        this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                     } else if (method3631(this, var1, var11, (byte)-16)) {
                        this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                     }
                  }
               }
            }

            var1.exportIndex((byte)-3);
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               PacketBuffer.method12336(var1, -17259045);

               for (int var8 = 0; var8 < this.playerCount * -1752371791; var8++) {
                  int var12 = this.Players_emptyIndices[var8];
                  if ((this.Players_regions[var12].field176 & 1) == 0) {
                     if (var2 > 0) {
                        var2--;
                        this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                     } else {
                        int var15 = var1.method12339(1, 1333712909);
                        if (0 == var15) {
                           var2 = this.method3620(var1, 920704080);
                           this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                        } else if (method3631(this, var1, var12, (byte)66)) {
                           this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                        }
                     }
                  }
               }

               var1.exportIndex((byte)2);
               if (0 != var2) {
                  throw new RuntimeException();
               } else {
                  this.field1538 = 0;
                  this.playerCount = 0;

                  for (int var9 = 1; var9 < -402126957; var9++) {
                     this.Players_regions[var9].field176 = (byte)(this.Players_regions[var9].field176 >> 1);
                     if (this.Players_regions[var9].method551(-251291966)) {
                        this.playerIndices[(this.field1538 += -2117789093) * 1320060371 - 1] = var9;
                     } else {
                        this.Players_emptyIndices[(this.playerCount += -1053597760) * -1752371791 - 1] = var9;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lci;)V")
   @ObfuscatedName("fu")
   public void method3663(Player var1) {
      if (var1 != null) {
         SecureUrlRequester.client.getCallbacks().post(new PlayerDespawned(var1));
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("af")
   void method3616(PacketBuffer var1) {
      this.Players_pendingUpdateCount = 0;
      int var2 = 0;
      PacketBuffer.method12336(var1, 1810691352);

      for (int var3 = 0; var3 < this.field1538 * 620921993; var3++) {
         int var4 = this.playerIndices[var3];
         if ((this.Players_regions[var4].field176 & 1) == 0) {
            if (var2 > 0) {
               var2--;
               this.Players_regions[var4].field176 = (byte)(this.Players_regions[var4].field176 | 2);
            } else {
               int var5 = var1.method12339(1, 1333712909);
               if (var5 == 0) {
                  var2 = this.method3620(var1, 1503879408);
                  this.Players_regions[var4].field176 = (byte)(this.Players_regions[var4].field176 | 2);
               } else {
                  this.readPlayerUpdate(var1, var4, (byte)44);
               }
            }
         }
      }

      var1.exportIndex((byte)-12);
      if (0 != var2) {
         throw new RuntimeException();
      } else {
         PacketBuffer.method12336(var1, 1121342548);

         for (int var6 = 0; var6 < 1685914679 * this.field1538; var6++) {
            int var10 = this.playerIndices[var6];
            if ((this.Players_regions[var10].field176 & 1) != 0) {
               if (var2 > 0) {
                  var2--;
                  this.Players_regions[var10].field176 = (byte)(this.Players_regions[var10].field176 | 2);
               } else {
                  int var13 = var1.method12339(1, 1333712909);
                  if (0 == var13) {
                     var2 = this.method3620(var1, -295211196);
                     this.Players_regions[var10].field176 = (byte)(this.Players_regions[var10].field176 | 2);
                  } else {
                     this.readPlayerUpdate(var1, var10, (byte)124);
                  }
               }
            }
         }

         var1.exportIndex((byte)101);
         if (0 != var2) {
            throw new RuntimeException();
         } else {
            PacketBuffer.method12336(var1, 370774794);

            for (int var7 = 0; var7 < this.playerCount * -1752371791; var7++) {
               int var11 = this.Players_emptyIndices[var7];
               if ((this.Players_regions[var11].field176 & 1) != 0) {
                  if (var2 > 0) {
                     var2--;
                     this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                  } else {
                     int var14 = var1.method12339(1, 1333712909);
                     if (var14 == 0) {
                        var2 = this.method3620(var1, -1415611798);
                        this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                     } else if (method3631(this, var1, var11, (byte)43)) {
                        this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 | 2);
                     }
                  }
               }
            }

            var1.exportIndex((byte)0);
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               PacketBuffer.method12336(var1, 917391067);

               for (int var8 = 0; var8 < this.playerCount * -1752371791; var8++) {
                  int var12 = this.Players_emptyIndices[var8];
                  if ((this.Players_regions[var12].field176 & 1) == 0) {
                     if (var2 > 0) {
                        var2--;
                        this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                     } else {
                        int var15 = var1.method12339(1, 1333712909);
                        if (0 == var15) {
                           var2 = this.method3620(var1, 1431441780);
                           this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                        } else if (method3631(this, var1, var12, (byte)31)) {
                           this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                        }
                     }
                  }
               }

               var1.exportIndex((byte)38);
               if (0 != var2) {
                  throw new RuntimeException();
               } else {
                  this.field1538 = 0;
                  this.playerCount = 0;

                  for (int var9 = 1; var9 < 2048; var9++) {
                     this.Players_regions[var9].field176 = (byte)(this.Players_regions[var9].field176 >> 1);
                     if (this.Players_regions[var9].method551(-1882816170)) {
                        this.playerIndices[(this.field1538 += -2117789093) * 1320060371 - 1] = var9;
                     } else {
                        this.Players_emptyIndices[(this.playerCount += 787561297) * -1132537874 - 1] = var9;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("ac")
   final void method3611(PacketBuffer var1, int var2) {
      int var3 = var1.offset * 2108391709;
      this.Players_emptyIdxCount = 0;
      this.method3617(var1, -1629036735);
      method3634(this, (byte)0);
      method3641(this, 607942241);
      this.updatePlayers(var1, 1193243030);
      method3647(this, (byte)64);
      if (var1.offset * -1138382857 - var3 != var2) {
         throw new RuntimeException(var1.offset * -1195577524 - var3 + " " + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)Z")
   @ObfuscatedName("bg")
   boolean method3627(PacketBuffer var1, int var2) {
      class46 var3 = this.Players_regions[var2];
      int var4 = var1.method12339(2, 1333712909);
      if (0 == var4) {
         if (var1.method12339(1, 1333712909) != 0) {
            method3631(this, var1, var2, (byte)-6);
         }

         int var15 = var1.method12339(13, 1333712909);
         int var18 = var1.method12339(13, 1333712909);
         boolean var21 = var1.method12339(1, 1333712909) == 1;
         if (var21) {
            this.Players_pendingUpdateIndices[(this.Players_emptyIdxCount += 1674177231) * 1318902831 - 1] = var2;
         }

         if (var3.method551(2059308131)) {
            throw new RuntimeException();
         } else {
            var3.method559(var15, var18, 1584829418);
            this.field1531[var2] = false;
            return true;
         }
      } else if (1 == var4) {
         int var14 = var1.method12339(2, 1333712909);
         int var17 = var3.field169 * 596721571;
         int var20 = Coord.method8288(var17, -1170356422) + var14 & 3;
         var3.method566(var20, 2134764171);
         var3.field169 = 1728637963 * ((var17 & 268435455) + (var20 << 28));
         return false;
      } else if (var4 == 2) {
         int var13 = var1.method12339(5, 1333712909);
         int var16 = var13 >> 3;
         int var19 = var13 & 7;
         int var22 = 596721571 * var3.field169;
         int var23 = Coord.method8288(var22, -1297610337) + var16 & 3;
         int var24 = var22 >> 14 & 0xFF;
         int var25 = var22 & 0xFF;
         if (0 == var19) {
            var24--;
            var25--;
         }

         if (var19 == 1) {
            var25--;
         }

         if (2 == var19) {
            var24++;
            var25--;
         }

         if (var19 == 3) {
            var24--;
         }

         if (4 == var19) {
            var24++;
         }

         if (5 == var19) {
            var24--;
            var25++;
         }

         if (var19 == 6) {
            var25++;
         }

         if (var19 == 7) {
            var24++;
            var25++;
         }

         var3.method566(var23, 2134764171);
         var3.field169 = Coord.method8286(var23, var24, var25, (byte)14) * 1728637963;
         return false;
      } else {
         int var5 = var1.method12339(18, 1333712909);
         int var6 = var5 >> 16;
         int var7 = var5 >> 8 & 0xFF;
         int var8 = var5 & 0xFF;
         int var9 = 596721571 * var3.field169;
         int var10 = Coord.method8288(var9, -1703045738) + var6 & 3;
         var3.method566(var10, 2134764171);
         int var11 = Coord.method8292(var9, -911911798) + var7 & 0xFF;
         int var12 = Coord.method8294(var9, 1346086770) + var8 & 0xFF;
         var3.field169 = Coord.method8286(var3.method565(831964661), var11, var12, (byte)-9) * 1728637963;
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbp;Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("ga")
   public static void method3618(MouseHandler var0, FocusEvent var1) {
      if (var0 == null) {
         var0.method969(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("hr")
   public void method3664(PacketBuffer var1, int var2) {
      Actor.field1187 = false;

      for (int var3 = 0; var3 < this.field1538 * 1320060371; var3++) {
         ArrayList var4 = this.Players_regions[this.playerIndices[var3]].field175;

         for (int var5 = 0; var5 < var4.size(); var5++) {
            ((Player)var4.get(var5)).method2841();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxj;)V")
   @ObfuscatedName("fi")
   public static void method3608(PlayerUpdateManager var0, PacketBuffer var1) {
      if (var0 == null) {
         var0.method3615(var1);
      } else {
         method3659(var0, 763731647);
         PacketBuffer.method12336(var1, -422884090);
         int var2 = client.localPlayerIndex * -1548864151;
         class46 var3 = var0.Players_regions[var2];
         int var4 = var1.method12339(30, 1333712909);
         var3.method537(-1, -1931473588);
         var3.coord.method8309(var4, 97172516);
         var3.field176 = 0;
         Player var5 = var3.method550(var2, Occluder.topLevelWorldView, 1518971763);
         class46.method540(var3, var5, 1700659752);
         GrandExchangeOfferTotalQuantityComparator.method9179(Occluder.topLevelWorldView.npcs, var5, var2);
         class330.localPlayer = var5;
         var0.field1538 = 0;
         var0.playerIndices[(var0.field1538 += -2117789093) * 1320060371 - 1] = var2;
         var0.playerCount = 0;

         for (int var6 = 1; var6 < 2048; var6++) {
            if (var6 != var2) {
               int var7 = var1.method12339(18, 1333712909);
               int var8 = var7 >> 16;
               int var9 = var7 >> 8 & 0xFF;
               int var10 = var7 & 0xFF;
               var0.Players_regions[var6].method537(Coord.method8286(var8, var9, var10, (byte)48), -1820738821);
               var0.Players_emptyIndices[(var0.playerCount += 787561297) * -1752371791 - 1] = var6;
            }
         }

         var1.exportIndex((byte)-17);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("be")
   void method3625(PacketBuffer var1, int var2) {
      boolean var3 = var1.method12339(1, 1333712909) == 1;
      if (var3) {
         this.Players_pendingUpdateIndices[(this.Players_emptyIdxCount += -1167298267) * 1318902831 - 1] = var2;
      }

      int var4 = var1.method12339(2, 1333712909);
      class46 var5 = this.Players_regions[var2];
      if (var4 == 0) {
         if (var3) {
            this.field1531[var2] = false;
         } else if (client.localPlayerIndex * -706359349 == var2) {
            throw new RuntimeException();
         } else {
            var5.method554((byte)16);
            if (var1.method12339(1, 1333712909) != 0) {
               method3631(this, var1, var2, (byte)16);
            }

            this.Players_targetIndices[(this.Players_pendingUpdateCount += -1916566807) * 1555789145 - 1] = var2;
         }
      } else if (1 == var4) {
         int var13 = var1.method12339(3, 1333712909);
         Coord var16 = var5.coord;
         if (0 == var13) {
            var16.x -= -2097694791;
            var16.y -= 715626839;
         } else if (1 == var13) {
            var16.y -= 715626839;
         } else if (2 == var13) {
            var16.x += -612920153;
            var16.y -= 306513526;
         } else if (var13 == 3) {
            var16.x -= 785147574;
         } else if (var13 == 4) {
            var16.x += -352056400;
         } else if (var13 == 5) {
            var16.x -= 773571571;
            var16.y += -1401068556;
         } else if (6 == var13) {
            var16.y += 715626839;
         } else if (var13 == 7) {
            var16.x += -201312605;
            var16.y += 715626839;
         }

         this.field1531[var2] = true;
         this.field1532[var2] = var5.pathTraversed;
      } else if (var4 == 2) {
         int var12 = var1.method12339(4, 1333712909);
         Coord var15 = var5.coord;
         if (var12 == 0) {
            var15.x -= -2035381443;
            var15.y -= 1431253678;
         } else if (1 == var12) {
            var15.x -= -612920153;
            var15.y -= 1431253678;
         } else if (var12 == 2) {
            var15.y -= 503789506;
         } else if (3 == var12) {
            var15.x += -612920153;
            var15.y -= -177448257;
         } else if (4 == var12) {
            var15.x += -1225840306;
            var15.y -= -265865130;
         } else if (5 == var12) {
            var15.x -= 581800218;
            var15.y -= 1287557345;
         } else if (var12 == 6) {
            var15.x += 1929858069;
            var15.y -= 1343942822;
         } else if (7 == var12) {
            var15.x -= -1225840306;
         } else if (8 == var12) {
            var15.x += -1225840306;
         } else if (var12 == 9) {
            var15.x -= -1225840306;
            var15.y += 715626839;
         } else if (10 == var12) {
            var15.x += -371481504;
            var15.y += -2035762705;
         } else if (11 == var12) {
            var15.x -= -1565979473;
            var15.y += 609136454;
         } else if (var12 == 12) {
            var15.x -= -612920153;
            var15.y += -1942415063;
         } else if (13 == var12) {
            var15.y += 1431253678;
         } else if (14 == var12) {
            var15.x += -2060201673;
            var15.y += -224563183;
         } else if (var12 == 15) {
            var15.x += -1326245402;
            var15.y += -737133017;
         }

         this.field1531[var2] = true;
         this.field1532[var2] = var5.pathTraversed;
      } else {
         int var6 = var1.method12339(1, 1333712909);
         if (0 == var6) {
            int var14 = var1.method12339(12, 1333712909);
            int var17 = var14 >> 10;
            int var18 = var14 >> 5 & 31;
            if (var18 > 15) {
               var18 -= 32;
            }

            int var19 = var14 & 31;
            if (var19 > 15) {
               var19 -= 32;
            }

            Coord var20 = var5.coord;
            var20.plane = (byte)(var20.plane * 491260996 + var17 & 3) * 969692463;
            var20.x += -612920153 * var18;
            var20.y += 168938630 * var19;
            this.field1531[var2] = true;
            this.field1532[var2] = var5.pathTraversed;
         } else {
            int var7 = var1.method12339(30, 1333712909);
            int var8 = Coord.method8288(var7, -1541657747);
            int var9 = Coord.method8292(var7, 1021425443);
            int var10 = Coord.method8294(var7, 1346086770);
            Coord var11 = var5.coord;
            var11.plane = (byte)(var8 + -1188252669 * var11.plane & 3) * -1063521855;
            var11.x = (-617685017 * var11.x + var9 & 16383) * 1329096501;
            var11.y = 270050998 * (-263036313 * var11.y + var10 & 16383);
            this.field1531[var2] = true;
            this.field1532[var2] = var5.pathTraversed;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxj;I)V")
   @ObfuscatedName("gb")
   public static void method3626(PlayerUpdateManager var0, PacketBuffer var1, int var2) {
      if (var0 == null) {
         var0.updatePlayers(var1, var2);
      } else {
         boolean var3 = var1.method12339(1, 1333712909) == 1;
         if (var3) {
            var0.Players_pendingUpdateIndices[(var0.Players_emptyIdxCount += 1674177231) * 1318902831 - 1] = var2;
         }

         int var4 = var1.method12339(2, 1333712909);
         class46 var5 = var0.Players_regions[var2];
         if (var4 == 0) {
            if (var3) {
               var0.field1531[var2] = false;
            } else if (client.localPlayerIndex * -1548864151 == var2) {
               throw new RuntimeException();
            } else {
               var5.method554((byte)16);
               if (var1.method12339(1, 1333712909) != 0) {
                  method3631(var0, var1, var2, (byte)88);
               }

               var0.Players_targetIndices[(var0.Players_pendingUpdateCount += -1916566807) * 1555789145 - 1] = var2;
            }
         } else if (1 == var4) {
            int var13 = var1.method12339(3, 1333712909);
            Coord var16 = var5.coord;
            if (0 == var13) {
               var16.x -= -612920153;
               var16.y -= 715626839;
            } else if (1 == var13) {
               var16.y -= 715626839;
            } else if (2 == var13) {
               var16.x += -612920153;
               var16.y -= 715626839;
            } else if (var13 == 3) {
               var16.x -= -612920153;
            } else if (var13 == 4) {
               var16.x += -612920153;
            } else if (var13 == 5) {
               var16.x -= -612920153;
               var16.y += 715626839;
            } else if (6 == var13) {
               var16.y += 715626839;
            } else if (var13 == 7) {
               var16.x += -612920153;
               var16.y += 715626839;
            }

            var0.field1531[var2] = true;
            var0.field1532[var2] = var5.pathTraversed;
         } else if (var4 == 2) {
            int var12 = var1.method12339(4, 1333712909);
            Coord var15 = var5.coord;
            if (var12 == 0) {
               var15.x -= -1225840306;
               var15.y -= 1431253678;
            } else if (1 == var12) {
               var15.x -= -612920153;
               var15.y -= 1431253678;
            } else if (var12 == 2) {
               var15.y -= 1431253678;
            } else if (3 == var12) {
               var15.x += -612920153;
               var15.y -= 1431253678;
            } else if (4 == var12) {
               var15.x += -1225840306;
               var15.y -= 1431253678;
            } else if (5 == var12) {
               var15.x -= -1225840306;
               var15.y -= 715626839;
            } else if (var12 == 6) {
               var15.x += -1225840306;
               var15.y -= 715626839;
            } else if (7 == var12) {
               var15.x -= -1225840306;
            } else if (8 == var12) {
               var15.x += -1225840306;
            } else if (var12 == 9) {
               var15.x -= -1225840306;
               var15.y += 715626839;
            } else if (10 == var12) {
               var15.x += -1225840306;
               var15.y += 715626839;
            } else if (11 == var12) {
               var15.x -= -1225840306;
               var15.y += 1431253678;
            } else if (var12 == 12) {
               var15.x -= -612920153;
               var15.y += 1431253678;
            } else if (13 == var12) {
               var15.y += 1431253678;
            } else if (14 == var12) {
               var15.x += -612920153;
               var15.y += 1431253678;
            } else if (var12 == 15) {
               var15.x += -1225840306;
               var15.y += 1431253678;
            }

            var0.field1531[var2] = true;
            var0.field1532[var2] = var5.pathTraversed;
         } else {
            int var6 = var1.method12339(1, 1333712909);
            if (0 == var6) {
               int var14 = var1.method12339(12, 1333712909);
               int var17 = var14 >> 10;
               int var18 = var14 >> 5 & 31;
               if (var18 > 15) {
                  var18 -= 32;
               }

               int var19 = var14 & 31;
               if (var19 > 15) {
                  var19 -= 32;
               }

               Coord var20 = var5.coord;
               var20.plane = (byte)(var20.plane * 370217423 + var17 & 3) * 969692463;
               var20.x += -612920153 * var18;
               var20.y += 715626839 * var19;
               var0.field1531[var2] = true;
               var0.field1532[var2] = var5.pathTraversed;
            } else {
               int var7 = var1.method12339(30, 1333712909);
               int var8 = Coord.method8288(var7, -1701911731);
               int var9 = Coord.method8292(var7, -1404413731);
               int var10 = Coord.method8294(var7, 1346086770);
               Coord var11 = var5.coord;
               var11.plane = (byte)(var8 + 370217423 * var11.plane & 3) * 969692463;
               var11.x = (-1931160809 * var11.x + var9 & 16383) * -612920153;
               var11.y = 715626839 * (-263036313 * var11.y + var10 & 16383);
               var0.field1531[var2] = true;
               var0.field1532[var2] = var5.pathTraversed;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("rf")
   public static void method3639(PlayerUpdateManager var0) {
      if (var0 == null) {
         var0.method3633();
      }

      client.currentWorldViewId = 807826961;

      for (WorldView var2 : client.worldViewManager) {
         var0.method3644(var2, (byte)12);
      }
   }

   PlayerUpdateManager() {
      this.field1531 = new boolean[2048];
      this.field1532 = new MoveSpeed[2048];
      this.field1534 = new Buffer(new byte[5000]);
      this.field1533 = new String[3];
      this.Players_emptyIndices = new int[2048];
      this.Players_targetIndices = new int[2048];
      this.Players_pendingUpdateIndices = new int[2048];
      this.field1538 = 0;
      this.playerCount = 0;
      this.Players_pendingUpdateCount = 0;
      this.Players_emptyIdxCount = 0;

      for (int var1 = 0; var1 < 2048; var1++) {
         this.Players_regions[var1] = new class46(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)Z")
   @ObfuscatedName("bz")
   boolean method3628(PacketBuffer var1, int var2) {
      class46 var3 = this.Players_regions[var2];
      int var4 = var1.method12339(2, 1333712909);
      if (0 == var4) {
         if (var1.method12339(1, 1333712909) != 0) {
            method3631(this, var1, var2, (byte)-71);
         }

         int var15 = var1.method12339(13, 1333712909);
         int var18 = var1.method12339(13, 1333712909);
         boolean var21 = var1.method12339(1, 1333712909) == 1;
         if (var21) {
            this.Players_pendingUpdateIndices[(this.Players_emptyIdxCount += 1674177231) * 1318902831 - 1] = var2;
         }

         if (var3.method551(-1919716439)) {
            throw new RuntimeException();
         } else {
            var3.method559(var15, var18, 65822099);
            this.field1531[var2] = false;
            return true;
         }
      } else if (1 == var4) {
         int var14 = var1.method12339(2, 1333712909);
         int var17 = var3.field169 * 596721571;
         int var20 = Coord.method8288(var17, -1845734510) + var14 & 3;
         var3.method566(var20, 2134764171);
         var3.field169 = 1728637963 * ((var17 & 268435455) + (var20 << 28));
         return false;
      } else if (var4 == 2) {
         int var13 = var1.method12339(5, 1333712909);
         int var16 = var13 >> 3;
         int var19 = var13 & 7;
         int var22 = 596721571 * var3.field169;
         int var23 = Coord.method8288(var22, -2107240701) + var16 & 3;
         int var24 = var22 >> 14 & 0xFF;
         int var25 = var22 & 0xFF;
         if (0 == var19) {
            var24--;
            var25--;
         }

         if (var19 == 1) {
            var25--;
         }

         if (2 == var19) {
            var24++;
            var25--;
         }

         if (var19 == 3) {
            var24--;
         }

         if (4 == var19) {
            var24++;
         }

         if (5 == var19) {
            var24--;
            var25++;
         }

         if (var19 == 6) {
            var25++;
         }

         if (var19 == 7) {
            var24++;
            var25++;
         }

         var3.method566(var23, 2134764171);
         var3.field169 = Coord.method8286(var23, var24, var25, (byte)26) * 1728637963;
         return false;
      } else {
         int var5 = var1.method12339(18, 1333712909);
         int var6 = var5 >> 16;
         int var7 = var5 >> 8 & 0xFF;
         int var8 = var5 & 0xFF;
         int var9 = 596721571 * var3.field169;
         int var10 = Coord.method8288(var9, -2010983277) + var6 & 3;
         var3.method566(var10, 2134764171);
         int var11 = Coord.method8292(var9, 1236966334) + var7 & 0xFF;
         int var12 = Coord.method8294(var9, 1346086770) + var8 & 0xFF;
         var3.field169 = Coord.method8286(var3.method565(831964661), var11, var12, (byte)-59) * 1728637963;
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   void method3635() {
      for (int var1 = 0; var1 < 269935097 * this.Players_pendingUpdateCount; var1++) {
         int var2 = this.Players_targetIndices[var1];
         class46 var3 = this.Players_regions[var2];

         for (WorldView var5 : client.worldViewManager) {
            Player var6 = (Player)var5.npcs.get(var2);
            if (null != var6) {
               var3.method542(var6, 1666634197);
               var6.detach();
            }
         }

         var3.method545((byte)30);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)Z")
   @ObfuscatedName("bo")
   boolean method3629(PacketBuffer var1, int var2) {
      class46 var3 = this.Players_regions[var2];
      int var4 = var1.method12339(2, 1333712909);
      if (0 == var4) {
         if (var1.method12339(1, 1333712909) != 0) {
            method3631(this, var1, var2, (byte)-90);
         }

         int var15 = var1.method12339(13, 1333712909);
         int var18 = var1.method12339(13, 1333712909);
         boolean var21 = var1.method12339(1, 1333712909) == 1;
         if (var21) {
            this.Players_pendingUpdateIndices[(this.Players_emptyIdxCount += 1674177231) * 1318902831 - 1] = var2;
         }

         if (var3.method551(-631150094)) {
            throw new RuntimeException();
         } else {
            var3.method559(var15, var18, 1418962268);
            this.field1531[var2] = false;
            return true;
         }
      } else if (1 == var4) {
         int var14 = var1.method12339(2, 1333712909);
         int var17 = var3.field169 * 596721571;
         int var20 = Coord.method8288(var17, -1858144837) + var14 & 3;
         var3.method566(var20, 2134764171);
         var3.field169 = 1728637963 * ((var17 & 268435455) + (var20 << 28));
         return false;
      } else if (var4 == 2) {
         int var13 = var1.method12339(5, 1333712909);
         int var16 = var13 >> 3;
         int var19 = var13 & 7;
         int var22 = 596721571 * var3.field169;
         int var23 = Coord.method8288(var22, -1308838660) + var16 & 3;
         int var24 = var22 >> 14 & 0xFF;
         int var25 = var22 & 0xFF;
         if (0 == var19) {
            var24--;
            var25--;
         }

         if (var19 == 1) {
            var25--;
         }

         if (2 == var19) {
            var24++;
            var25--;
         }

         if (var19 == 3) {
            var24--;
         }

         if (4 == var19) {
            var24++;
         }

         if (5 == var19) {
            var24--;
            var25++;
         }

         if (var19 == 6) {
            var25++;
         }

         if (var19 == 7) {
            var24++;
            var25++;
         }

         var3.method566(var23, 2134764171);
         var3.field169 = Coord.method8286(var23, var24, var25, (byte)-69) * 1728637963;
         return false;
      } else {
         int var5 = var1.method12339(18, 1333712909);
         int var6 = var5 >> 16;
         int var7 = var5 >> 8 & 0xFF;
         int var8 = var5 & 0xFF;
         int var9 = 596721571 * var3.field169;
         int var10 = Coord.method8288(var9, -1444705271) + var6 & 3;
         var3.method566(var10, 2134764171);
         int var11 = Coord.method8292(var9, 567816400) + var7 & 0xFF;
         int var12 = Coord.method8294(var9, 1346086770) + var8 & 0xFF;
         var3.field169 = Coord.method8286(var3.method565(831964661), var11, var12, (byte)-80) * 1728637963;
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lxj;II)V")
   @ObfuscatedName("hc")
   public static void method3612(PlayerUpdateManager var0, PacketBuffer var1, int var2, int var3) {
      if (var0 == null) {
         var0.method3656(var1, var2, var2);
      } else {
         var0.method3662(var1, var2);

         try {
            int var4 = var1.offset * 2108391709;
            var0.Players_emptyIdxCount = 0;
            var0.method3617(var1, -1358888795);
            method3634(var0, (byte)0);
            method3641(var0, -696846496);
            var0.updatePlayers(var1, -181582075);
            method3647(var0, (byte)64);
            if (var1.offset * 2108391709 - var4 != var2) {
               if (var3 >= -1251198861) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException(var1.offset * 2108391709 - var4 + " " + var2);
               }
            } else {
               var0.method3664(var1, var2);
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "dz.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("ab")
   final void method3613(PacketBuffer var1, int var2) {
      int var3 = var1.offset * 2108391709;
      this.Players_emptyIdxCount = 0;
      this.method3617(var1, -1761167554);
      method3634(this, (byte)0);
      method3641(this, -154854878);
      this.updatePlayers(var1, 1154678863);
      method3647(this, (byte)64);
      if (var1.offset * 2108391709 - var3 != var2) {
         throw new RuntimeException(var1.offset * 2108391709 - var3 + " " + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   void method3640() {
      client.currentWorldViewId = 1092382715;

      for (WorldView var2 : client.worldViewManager) {
         this.method3644(var2, (byte)-116);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   void method3648() {
      for (int var1 = 0; var1 < 1320060371 * this.field1538; var1++) {
         int var2 = this.playerIndices[var1];
         if (this.field1531[var2]) {
            class46 var3 = this.Players_regions[var2];
            var3.method569(this.field1532[var2], (byte)-91);
            this.field1531[var2] = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("bu")
   void method3645(WorldView var1) {
      for (int var2 = 0; var2 < this.field1538 * 1320060371; var2++) {
         int var3 = this.playerIndices[var2];
         class46 var4 = this.Players_regions[var3];
         Coord var5 = var4.coord;
         Player var6 = (Player)var1.npcs.get(var3);
         boolean var7 = -1931160809 * var5.x > 825809917 * var1.baseX
            && var5.y * -263036313 > 1279964673 * var1.baseY
            && var5.x * -1931160809 < var1.sizeX * 2010544793 + var1.baseX * 825809917
            && -263036313 * var5.y < var1.sizeY * 1823353167 + var1.baseY * 1279964673;
         if (client.localPlayerIndex * -1548864151 == var3 && var7 && -1 != 577964535 * var1.id) {
            client.currentWorldViewId = var1.id * -1981865517;
         }

         if (var7 && null == var6) {
            var6 = var4.method550(var3, var1, 1381569876);
            class46.method540(var4, var6, 1611899205);
            GrandExchangeOfferTotalQuantityComparator.method9179(var1.npcs, var6, var3);
         } else if (!var7 && null != var6 && var6 != class330.localPlayer) {
            var4.method542(var6, 612832480);
            var6.detach();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("ag")
   void method3617(PacketBuffer var1, int var2) {
      try {
         this.Players_pendingUpdateCount = 0;
         int var3 = 0;
         PacketBuffer.method12336(var1, -61218846);

         for (int var4 = 0; var4 < this.field1538 * 1320060371; var4++) {
            int var5 = this.playerIndices[var4];
            if ((this.Players_regions[var5].field176 & 1) == 0) {
               if (var2 >= 207244945) {
                  throw new IllegalStateException();
               }

               if (var3 > 0) {
                  if (var2 >= 207244945) {
                     throw new IllegalStateException();
                  }

                  var3--;
                  this.Players_regions[var5].field176 = (byte)(this.Players_regions[var5].field176 | 2);
               } else {
                  int var6 = var1.method12339(1, 1333712909);
                  if (var6 == 0) {
                     if (var2 >= 207244945) {
                        throw new IllegalStateException();
                     }

                     var3 = this.method3620(var1, -733785204);
                     this.Players_regions[var5].field176 = (byte)(this.Players_regions[var5].field176 | 2);
                  } else {
                     this.readPlayerUpdate(var1, var5, (byte)67);
                  }
               }
            }
         }

         var1.exportIndex((byte)-83);
         if (0 != var3) {
            throw new RuntimeException();
         } else {
            PacketBuffer.method12336(var1, -1018382626);

            for (int var8 = 0; var8 < 1320060371 * this.field1538; var8++) {
               if (var2 >= 207244945) {
                  return;
               }

               int var12 = this.playerIndices[var8];
               if ((this.Players_regions[var12].field176 & 1) != 0) {
                  if (var2 >= 207244945) {
                     return;
                  }

                  if (var3 > 0) {
                     if (var2 >= 207244945) {
                        throw new IllegalStateException();
                     }

                     var3--;
                     this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                  } else {
                     int var15 = var1.method12339(1, 1333712909);
                     if (0 == var15) {
                        if (var2 >= 207244945) {
                           throw new IllegalStateException();
                        }

                        var3 = this.method3620(var1, -386253895);
                        this.Players_regions[var12].field176 = (byte)(this.Players_regions[var12].field176 | 2);
                     } else {
                        this.readPlayerUpdate(var1, var12, (byte)43);
                     }
                  }
               }
            }

            var1.exportIndex((byte)67);
            if (0 != var3) {
               throw new RuntimeException();
            } else {
               PacketBuffer.method12336(var1, 122516438);

               for (int var9 = 0; var9 < this.playerCount * -1752371791; var9++) {
                  if (var2 >= 207244945) {
                     throw new IllegalStateException();
                  }

                  int var13 = this.Players_emptyIndices[var9];
                  if ((this.Players_regions[var13].field176 & 1) != 0) {
                     if (var2 >= 207244945) {
                        throw new IllegalStateException();
                     }

                     if (var3 > 0) {
                        if (var2 >= 207244945) {
                           throw new IllegalStateException();
                        }

                        var3--;
                        this.Players_regions[var13].field176 = (byte)(this.Players_regions[var13].field176 | 2);
                     } else {
                        int var16 = var1.method12339(1, 1333712909);
                        if (var16 == 0) {
                           if (var2 >= 207244945) {
                              throw new IllegalStateException();
                           }

                           var3 = this.method3620(var1, 1049650186);
                           this.Players_regions[var13].field176 = (byte)(this.Players_regions[var13].field176 | 2);
                        } else if (method3631(this, var1, var13, (byte)-40)) {
                           if (var2 >= 207244945) {
                              throw new IllegalStateException();
                           }

                           this.Players_regions[var13].field176 = (byte)(this.Players_regions[var13].field176 | 2);
                        }
                     }
                  }
               }

               var1.exportIndex((byte)42);
               if (var3 != 0) {
                  if (var2 >= 207244945) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  PacketBuffer.method12336(var1, 2020453370);

                  for (int var10 = 0; var10 < this.playerCount * -1752371791; var10++) {
                     if (var2 >= 207244945) {
                        throw new IllegalStateException();
                     }

                     int var14 = this.Players_emptyIndices[var10];
                     if ((this.Players_regions[var14].field176 & 1) == 0) {
                        if (var2 >= 207244945) {
                           throw new IllegalStateException();
                        }

                        if (var3 > 0) {
                           if (var2 >= 207244945) {
                              return;
                           }

                           var3--;
                           this.Players_regions[var14].field176 = (byte)(this.Players_regions[var14].field176 | 2);
                        } else {
                           int var17 = var1.method12339(1, 1333712909);
                           if (0 == var17) {
                              var3 = this.method3620(var1, -499157874);
                              this.Players_regions[var14].field176 = (byte)(this.Players_regions[var14].field176 | 2);
                           } else if (method3631(this, var1, var14, (byte)38)) {
                              if (var2 >= 207244945) {
                                 throw new IllegalStateException();
                              }

                              this.Players_regions[var14].field176 = (byte)(this.Players_regions[var14].field176 | 2);
                           }
                        }
                     }
                  }

                  var1.exportIndex((byte)20);
                  if (0 == var3) {
                     this.field1538 = 0;
                     this.playerCount = 0;

                     for (int var11 = 1; var11 < 2048; var11++) {
                        if (var2 >= 207244945) {
                           throw new IllegalStateException();
                        }

                        this.Players_regions[var11].field176 = (byte)(this.Players_regions[var11].field176 >> 1);
                        if (this.Players_regions[var11].method551(334343727)) {
                           if (var2 >= 207244945) {
                              throw new IllegalStateException();
                           }

                           this.playerIndices[(this.field1538 += -2117789093) * 1320060371 - 1] = var11;
                        } else {
                           this.Players_emptyIndices[(this.playerCount += 787561297) * -1752371791 - 1] = var11;
                        }
                     }
                  } else if (var2 < 207244945) {
                     throw new RuntimeException();
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "dz.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)Z")
   @ObfuscatedName("bs")
   boolean method3630(PacketBuffer var1, int var2) {
      class46 var3 = this.Players_regions[var2];
      int var4 = var1.method12339(2, 1333712909);
      if (0 == var4) {
         if (var1.method12339(1, 1333712909) != 0) {
            method3631(this, var1, var2, (byte)-13);
         }

         int var15 = var1.method12339(13, 1333712909);
         int var18 = var1.method12339(13, 1333712909);
         boolean var21 = var1.method12339(1, 1333712909) == 1;
         if (var21) {
            this.Players_pendingUpdateIndices[(this.Players_emptyIdxCount += 1674177231) * 1318902831 - 1] = var2;
         }

         if (var3.method551(-32834533)) {
            throw new RuntimeException();
         } else {
            var3.method559(var15, var18, 158839101);
            this.field1531[var2] = false;
            return true;
         }
      } else if (1 == var4) {
         int var14 = var1.method12339(2, 1333712909);
         int var17 = var3.field169 * 596721571;
         int var20 = Coord.method8288(var17, -1563396503) + var14 & 3;
         var3.method566(var20, 2134764171);
         var3.field169 = 1728637963 * ((var17 & 268435455) + (var20 << 28));
         return false;
      } else if (var4 == 2) {
         int var13 = var1.method12339(5, 1333712909);
         int var16 = var13 >> 3;
         int var19 = var13 & 7;
         int var22 = 596721571 * var3.field169;
         int var23 = Coord.method8288(var22, -1352031467) + var16 & 3;
         int var24 = var22 >> 14 & 0xFF;
         int var25 = var22 & 0xFF;
         if (0 == var19) {
            var24--;
            var25--;
         }

         if (var19 == 1) {
            var25--;
         }

         if (2 == var19) {
            var24++;
            var25--;
         }

         if (var19 == 3) {
            var24--;
         }

         if (4 == var19) {
            var24++;
         }

         if (5 == var19) {
            var24--;
            var25++;
         }

         if (var19 == 6) {
            var25++;
         }

         if (var19 == 7) {
            var24++;
            var25++;
         }

         var3.method566(var23, 2134764171);
         var3.field169 = Coord.method8286(var23, var24, var25, (byte)3) * 1728637963;
         return false;
      } else {
         int var5 = var1.method12339(18, 1333712909);
         int var6 = var5 >> 16;
         int var7 = var5 >> 8 & 0xFF;
         int var8 = var5 & 0xFF;
         int var9 = 596721571 * var3.field169;
         int var10 = Coord.method8288(var9, -1437113506) + var6 & 3;
         var3.method566(var10, 2134764171);
         int var11 = Coord.method8292(var9, -1768555234) + var7 & 0xFF;
         int var12 = Coord.method8294(var9, 1346086770) + var8 & 0xFF;
         var3.field169 = Coord.method8286(var3.method565(831964661), var11, var12, (byte)25) * 1728637963;
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("mi")
   public static void method3636(PlayerUpdateManager var0) {
      if (var0 == null) {
         var0.method3660();
      } else {
         for (int var1 = 0; var1 < 1555789145 * var0.Players_pendingUpdateCount; var1++) {
            int var2 = var0.Players_targetIndices[var1];
            class46 var3 = var0.Players_regions[var2];

            for (WorldView var5 : client.worldViewManager) {
               Player var6 = (Player)var5.npcs.get(var2);
               if (null != var6) {
                  var3.method542(var6, 1793472706);
                  var6.detach();
               }
            }

            var3.method545((byte)45);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method3649() {
      for (int var1 = 0; var1 < 1320060371 * this.field1538; var1++) {
         int var2 = this.playerIndices[var1];
         if (this.field1531[var2]) {
            class46 var3 = this.Players_regions[var2];
            var3.method569(this.field1532[var2], (byte)89);
            this.field1531[var2] = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;II)V")
   @ObfuscatedName("bf")
   void method3653(PacketBuffer var1, int var2, int var3) {
      class46 var4 = this.Players_regions[var2];
      int var5 = 349003416;
      if (0 != (var3 & 4)) {
         int var6 = var1.readUnsignedByteAdd(-217853009);
         byte[] var7 = new byte[var6];
         Buffer var8 = new Buffer(var7);
         var1.writeBytes(var7, 0, var6, 1425102174);
         var4.method571(var8, 717013582);
      }

      if (0 != (var3 & -1958294319)) {
         var5 = var1.readByteNeg(344605225);
         if (1656779083 == var5) {
            this.field1532[var2] = MoveSpeed.field3805;
         } else {
            this.field1532[var2] = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var5, (byte)1);
         }
      }

      if (0 != (var3 & 1677209077)) {
         int var15 = 1759706017 * client.cycle + var1.readUnsignedShortAdd(-1156088784);
         int var26 = -178819673 * client.cycle + var1.readUnsignedShortAdd(-1156088784);
         byte var35 = var1.readByteSub(-639471049);
         byte var9 = var1.readByteAdd((byte)-43);
         byte var10 = var1.readByteSub(-639471049);
         byte var11 = (byte)var1.readUnsignedByteAdd(1686629954);
         var4.method612(var15, var26, var35, var9, var10, var11, -1569892422);
      }

      if (0 != (var3 & 1761775567)) {
         int var16 = Buffer.method12008(var1, (byte)5);
         class46.method595(var4, var16, -816455450);
      }

      if (0 != (var3 & 16)) {
         int var17 = var1.readUnsignedShortLE((byte)-68);
         if (-995911691 == var17) {
            var17 = -1;
         }

         int var27 = var1.readUnsignedByteAdd(1516432333);
         var4.method575(var17, var27, (byte)1);
      }

      if (0 != (var3 & 746198954)) {
         String var18 = var1.readStringCp1252NullCircumfixed(294788298);
         var4.method582(var18, (byte)1);
      }

      if ((var3 & 1396019128) != 0) {
         int var19 = var1.readUnsignedShortAdd(-1156088784);
         int var28 = var19 >> 8;
         int var36 = var28 >= 13 && var28 <= 20 ? var28 - 12 : 0;
         PlayerType var41 = (PlayerType)GrandExchangeOffer.findEnumerated(Varps.PlayerType_values(-991825498), var1.readUnsignedByteNeg(392207638), (byte)1);
         boolean var46 = var1.readUnsignedByteNeg(875081729) == 1;
         int var51 = var1.readUnsignedByteSub((byte)119);
         this.field1534.offset = 0;
         var1.method12206(this.field1534.array, 0, var51, (byte)9);
         this.field1534.offset = 0;
         String var12 = AbstractFont.escapeBrackets(ClanChannelMember.method3946(ObjectSound.method2647(this.field1534, 162307969), -1245719539));
         byte[] var13 = null;
         if (var36 > 0 && var36 <= 8) {
            var13 = new byte[var36];

            for (int var14 = 0; var14 < var36; var14++) {
               var13[var14] = var1.readByteAdd((byte)-21);
            }
         }

         class46.method598(var4, var19, var41, var46, var12, var13, (byte)3);
      }

      if ((var3 & 64) != 0) {
         int var20 = var1.readUnsignedByteNeg(-575713431);
         if (var20 > 0) {
            for (int var29 = 0; var29 < var20; var29++) {
               int var42 = -1;
               int var47 = -1;
               int var52 = -1;
               int var37 = Buffer.method12050(var1, -1568175528);
               if (var37 == 32767) {
                  var37 = Buffer.method12050(var1, -322477899);
                  var47 = Buffer.method12050(var1, 781356536);
                  var42 = Buffer.method12050(var1, 412504865);
                  var52 = Buffer.method12050(var1, -1637803373);
               } else if (32766 != var37) {
                  var47 = Buffer.method12050(var1, 946280940);
               } else {
                  var37 = -1;
               }

               int var55 = Buffer.method12050(var1, -487894402);
               var4.method585(var37, var47, var42, var52, var55, (byte)45);
            }
         }

         int var30 = var1.readUnsignedByteNeg(1861606674);
         if (var30 > 0) {
            for (int var38 = 0; var38 < var30; var38++) {
               int var43 = Buffer.method12050(var1, 163914857);
               int var48 = Buffer.method12050(var1, -874965605);
               if (var48 != 32767) {
                  int var53 = Buffer.method12050(var1, -1231543619);
                  int var56 = var1.readUnsignedByte(1461832290);
                  int var58 = var48 > 0 ? var1.readUnsignedByteAdd(1877503847) : var56;
                  class46.method586(var4, var43, var48, var53, var56, var58, 103958124);
               } else {
                  var4.method591(var43, -1261351938);
               }
            }
         }
      }

      if ((var3 & 2048) != 0) {
         var4.pathTraversed = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var1.readByteAdd((byte)-96), (byte)1);
         if (var5 == Integer.MAX_VALUE) {
            this.field1532[var2] = var4.pathTraversed;
         }
      }

      if (0 != (var3 & 2)) {
         var1.readUnsignedShortLE((byte)49);
         var1.readUnsignedByteNeg(-952634242);
         var1.readUnsignedByte(-1261345685);
         int var21 = var1.readUnsignedByteSub((byte)0);
         this.field1534.offset = 0;
         var1.method12209(this.field1534.array, 0, var21, (byte)63);
         this.field1534.offset = 0;
      }

      if ((var3 & 65536) != 0) {
         int var22 = var1.readUnsignedByte(505112587);

         for (int var31 = 0; var31 < var22; var31++) {
            int var39 = var1.readUnsignedByte(833243478);
            int var44 = var1.readUnsignedShortAddLE(1417933770);
            int var49 = Buffer.method12203(var1, -1295201084);
            var4.method616(var39, var44, var49 >> 16, var49 & 1180523665, (byte)-119);
         }
      }

      if ((var3 & 1024) != 0) {
         for (int var23 = 0; var23 < 3; var23++) {
            this.field1533[var23] = var1.readStringCp1252NullCircumfixed(263212999);
         }

         class46.method610(var4, this.field1533, -937676350);
      }

      if (0 != (var3 & 512)) {
         byte var24 = var1.readByteSub(-639471049);
         byte var32 = Buffer.method12001(var1, (byte)65);
         byte var40 = Buffer.method12001(var1, (byte)124);
         byte var45 = var1.readByteAdd((byte)-1);
         int var50 = var1.readUnsignedShortAdd(-1156088784) + -1217938267 * client.cycle;
         int var54 = Buffer.method12008(var1, (byte)5) + client.cycle * 1759706017;
         int var57 = var1.readUnsignedShortAddLE(1127586306);
         var4.method600(var24, var32, var40, var45, var50, var54, var57, -1543563048);
         this.field1531[var2] = false;
      }

      if (0 != (var3 & 8)) {
         int var33 = Buffer.method12008(var1, (byte)5);
         var33 += var1.readUnsignedByteSub((byte)-12) << 16;
         int var25 = -240467733;
         if (var25 == var33) {
            var33 = -1;
         }

         var4.method577(var33, 1903752890);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;II)V")
   @ObfuscatedName("bn")
   void method3654(PacketBuffer var1, int var2, int var3) {
      class46 var4 = this.Players_regions[var2];
      int var5 = Integer.MAX_VALUE;
      if (0 != (var3 & 4)) {
         int var6 = var1.readUnsignedByteAdd(2104201275);
         byte[] var7 = new byte[var6];
         Buffer var8 = new Buffer(var7);
         var1.writeBytes(var7, 0, var6, 1425102174);
         var4.method571(var8, 1373644472);
      }

      if (0 != (var3 & 16384)) {
         var5 = var1.readByteNeg(344605225);
         if (127 == var5) {
            this.field1532[var2] = MoveSpeed.field3805;
         } else {
            this.field1532[var2] = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var5, (byte)1);
         }
      }

      if (0 != (var3 & 8192)) {
         int var15 = 1759706017 * client.cycle + var1.readUnsignedShortAdd(-1156088784);
         int var26 = 1759706017 * client.cycle + var1.readUnsignedShortAdd(-1156088784);
         byte var35 = var1.readByteSub(-639471049);
         byte var9 = var1.readByteAdd((byte)-50);
         byte var10 = var1.readByteSub(-639471049);
         byte var11 = (byte)var1.readUnsignedByteAdd(437624601);
         var4.method612(var15, var26, var35, var9, var10, var11, 127380671);
      }

      if (0 != (var3 & 128)) {
         int var16 = Buffer.method12008(var1, (byte)5);
         class46.method595(var4, var16, -816455450);
      }

      if (0 != (var3 & 16)) {
         int var17 = var1.readUnsignedShortLE((byte)-56);
         if (65535 == var17) {
            var17 = -1;
         }

         int var27 = var1.readUnsignedByteAdd(628964994);
         var4.method575(var17, var27, (byte)1);
      }

      if (0 != (var3 & 32)) {
         String var18 = var1.readStringCp1252NullCircumfixed(-805780043);
         var4.method582(var18, (byte)1);
      }

      if ((var3 & 4096) != 0) {
         int var19 = var1.readUnsignedShortAdd(-1156088784);
         int var28 = var19 >> 8;
         int var36 = var28 >= 13 && var28 <= 20 ? var28 - 12 : 0;
         PlayerType var41 = (PlayerType)GrandExchangeOffer.findEnumerated(Varps.PlayerType_values(-2056358084), var1.readUnsignedByteNeg(-547219944), (byte)1);
         boolean var46 = var1.readUnsignedByteNeg(-669127485) == 1;
         int var51 = var1.readUnsignedByteSub((byte)-26);
         this.field1534.offset = 0;
         var1.method12206(this.field1534.array, 0, var51, (byte)-90);
         this.field1534.offset = 0;
         String var12 = AbstractFont.escapeBrackets(ClanChannelMember.method3946(ObjectSound.method2647(this.field1534, 162307969), 276147231));
         byte[] var13 = null;
         if (var36 > 0 && var36 <= 8) {
            var13 = new byte[var36];

            for (int var14 = 0; var14 < var36; var14++) {
               var13[var14] = var1.readByteAdd((byte)-121);
            }
         }

         class46.method598(var4, var19, var41, var46, var12, var13, (byte)3);
      }

      if ((var3 & 64) != 0) {
         int var20 = var1.readUnsignedByteNeg(1153574868);
         if (var20 > 0) {
            for (int var29 = 0; var29 < var20; var29++) {
               int var42 = -1;
               int var47 = -1;
               int var52 = -1;
               int var37 = Buffer.method12050(var1, 1225862443);
               if (var37 == 32767) {
                  var37 = Buffer.method12050(var1, -23912907);
                  var47 = Buffer.method12050(var1, 507339932);
                  var42 = Buffer.method12050(var1, -1889876332);
                  var52 = Buffer.method12050(var1, -947560620);
               } else if (32766 != var37) {
                  var47 = Buffer.method12050(var1, -1887353762);
               } else {
                  var37 = -1;
               }

               int var55 = Buffer.method12050(var1, 1863252877);
               var4.method585(var37, var47, var42, var52, var55, (byte)119);
            }
         }

         int var30 = var1.readUnsignedByteNeg(-1897480031);
         if (var30 > 0) {
            for (int var38 = 0; var38 < var30; var38++) {
               int var43 = Buffer.method12050(var1, -1576345553);
               int var48 = Buffer.method12050(var1, -1963978214);
               if (var48 != 32767) {
                  int var53 = Buffer.method12050(var1, 1309921032);
                  int var56 = var1.readUnsignedByte(-255145739);
                  int var58 = var48 > 0 ? var1.readUnsignedByteAdd(1106822895) : var56;
                  class46.method586(var4, var43, var48, var53, var56, var58, -957770174);
               } else {
                  var4.method591(var43, 1063024580);
               }
            }
         }
      }

      if ((var3 & 2048) != 0) {
         var4.pathTraversed = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var1.readByteAdd((byte)-18), (byte)1);
         if (var5 == Integer.MAX_VALUE) {
            this.field1532[var2] = var4.pathTraversed;
         }
      }

      if (0 != (var3 & 2)) {
         var1.readUnsignedShortLE((byte)2);
         var1.readUnsignedByteNeg(1226647499);
         var1.readUnsignedByte(-351783587);
         int var21 = var1.readUnsignedByteSub((byte)12);
         this.field1534.offset = 0;
         var1.method12209(this.field1534.array, 0, var21, (byte)69);
         this.field1534.offset = 0;
      }

      if ((var3 & 65536) != 0) {
         int var22 = var1.readUnsignedByte(-156570870);

         for (int var31 = 0; var31 < var22; var31++) {
            int var39 = var1.readUnsignedByte(1446743647);
            int var44 = var1.readUnsignedShortAddLE(109583983);
            int var49 = Buffer.method12203(var1, -1244336111);
            var4.method616(var39, var44, var49 >> 16, var49 & 65535, (byte)-126);
         }
      }

      if ((var3 & 1024) != 0) {
         for (int var23 = 0; var23 < 3; var23++) {
            this.field1533[var23] = var1.readStringCp1252NullCircumfixed(-1129560511);
         }

         class46.method610(var4, this.field1533, -937676350);
      }

      if (0 != (var3 & 512)) {
         byte var24 = var1.readByteSub(-639471049);
         byte var32 = Buffer.method12001(var1, (byte)9);
         byte var40 = Buffer.method12001(var1, (byte)65);
         byte var45 = var1.readByteAdd((byte)-100);
         int var50 = var1.readUnsignedShortAdd(-1156088784) + 1759706017 * client.cycle;
         int var54 = Buffer.method12008(var1, (byte)5) + client.cycle * 1759706017;
         int var57 = var1.readUnsignedShortAddLE(-289348080);
         var4.method600(var24, var32, var40, var45, var50, var54, var57, -1543563048);
         this.field1531[var2] = false;
      }

      if (0 != (var3 & 8)) {
         int var33 = Buffer.method12008(var1, (byte)5);
         var33 += var1.readUnsignedByteSub((byte)97) << 16;
         int var25 = 16777215;
         if (var25 == var33) {
            var33 = -1;
         }

         var4.method577(var33, 1343204897);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxj;II)V")
   @ObfuscatedName("nz")
   public static void method3655(PlayerUpdateManager var0, PacketBuffer var1, int var2, int var3) {
      class46 var4 = var0.Players_regions[var2];
      int var5 = Integer.MAX_VALUE;
      if (0 != (var3 & 4)) {
         int var6 = var1.readUnsignedByteAdd(-597452732);
         byte[] var7 = new byte[var6];
         Buffer var8 = new Buffer(var7);
         var1.writeBytes(var7, 0, var6, 1425102174);
         var4.method571(var8, 1724431345);
      }

      if (0 != (var3 & 16384)) {
         var5 = var1.readByteNeg(344605225);
         if (127 == var5) {
            var0.field1532[var2] = MoveSpeed.field3805;
         } else {
            var0.field1532[var2] = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var5, (byte)1);
         }
      }

      if (0 != (var3 & 8192)) {
         int var15 = 1759706017 * client.cycle + var1.readUnsignedShortAdd(-1156088784);
         int var26 = 1759706017 * client.cycle + var1.readUnsignedShortAdd(-1156088784);
         byte var35 = var1.readByteSub(-639471049);
         byte var9 = var1.readByteAdd((byte)-64);
         byte var10 = var1.readByteSub(-639471049);
         byte var11 = (byte)var1.readUnsignedByteAdd(955076537);
         var4.method612(var15, var26, var35, var9, var10, var11, -2091508100);
      }

      if (0 != (var3 & 128)) {
         int var16 = Buffer.method12008(var1, (byte)5);
         class46.method595(var4, var16, -816455450);
      }

      if (0 != (var3 & 16)) {
         int var17 = var1.readUnsignedShortLE((byte)12);
         if (65535 == var17) {
            var17 = -1;
         }

         int var27 = var1.readUnsignedByteAdd(-100341759);
         var4.method575(var17, var27, (byte)1);
      }

      if (0 != (var3 & 32)) {
         String var18 = var1.readStringCp1252NullCircumfixed(-1523562722);
         var4.method582(var18, (byte)1);
      }

      if ((var3 & 4096) != 0) {
         int var19 = var1.readUnsignedShortAdd(-1156088784);
         int var28 = var19 >> 8;
         int var36 = var28 >= 13 && var28 <= 20 ? var28 - 12 : 0;
         PlayerType var41 = (PlayerType)GrandExchangeOffer.findEnumerated(Varps.PlayerType_values(994155979), var1.readUnsignedByteNeg(1911522127), (byte)1);
         boolean var46 = var1.readUnsignedByteNeg(1781406617) == 1;
         int var51 = var1.readUnsignedByteSub((byte)7);
         var0.field1534.offset = 0;
         var1.method12206(var0.field1534.array, 0, var51, (byte)44);
         var0.field1534.offset = 0;
         String var12 = AbstractFont.escapeBrackets(ClanChannelMember.method3946(ObjectSound.method2647(var0.field1534, 162307969), 208229906));
         byte[] var13 = null;
         if (var36 > 0 && var36 <= 8) {
            var13 = new byte[var36];

            for (int var14 = 0; var14 < var36; var14++) {
               var13[var14] = var1.readByteAdd((byte)-14);
            }
         }

         class46.method598(var4, var19, var41, var46, var12, var13, (byte)3);
      }

      if ((var3 & 64) != 0) {
         int var20 = var1.readUnsignedByteNeg(-1348234591);
         if (var20 > 0) {
            for (int var29 = 0; var29 < var20; var29++) {
               int var42 = -1;
               int var47 = -1;
               int var52 = -1;
               int var37 = Buffer.method12050(var1, -1205181636);
               if (var37 == 32767) {
                  var37 = Buffer.method12050(var1, -1251708001);
                  var47 = Buffer.method12050(var1, 638025840);
                  var42 = Buffer.method12050(var1, 575038636);
                  var52 = Buffer.method12050(var1, -1296596158);
               } else if (32766 != var37) {
                  var47 = Buffer.method12050(var1, -977172416);
               } else {
                  var37 = -1;
               }

               int var55 = Buffer.method12050(var1, -747478760);
               var4.method585(var37, var47, var42, var52, var55, (byte)112);
            }
         }

         int var30 = var1.readUnsignedByteNeg(22463807);
         if (var30 > 0) {
            for (int var38 = 0; var38 < var30; var38++) {
               int var43 = Buffer.method12050(var1, -393374705);
               int var48 = Buffer.method12050(var1, 1955113993);
               if (var48 != 32767) {
                  int var53 = Buffer.method12050(var1, 125387458);
                  int var56 = var1.readUnsignedByte(409319843);
                  int var58 = var48 > 0 ? var1.readUnsignedByteAdd(1407206780) : var56;
                  class46.method586(var4, var43, var48, var53, var56, var58, -1113649344);
               } else {
                  var4.method591(var43, 713346452);
               }
            }
         }
      }

      if ((var3 & 2048) != 0) {
         var4.pathTraversed = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var1.readByteAdd((byte)-128), (byte)1);
         if (var5 == Integer.MAX_VALUE) {
            var0.field1532[var2] = var4.pathTraversed;
         }
      }

      if (0 != (var3 & 2)) {
         var1.readUnsignedShortLE((byte)63);
         var1.readUnsignedByteNeg(-1156742185);
         var1.readUnsignedByte(1452049082);
         int var21 = var1.readUnsignedByteSub((byte)30);
         var0.field1534.offset = 0;
         var1.method12209(var0.field1534.array, 0, var21, (byte)123);
         var0.field1534.offset = 0;
      }

      if ((var3 & 65536) != 0) {
         int var22 = var1.readUnsignedByte(98494871);

         for (int var31 = 0; var31 < var22; var31++) {
            int var39 = var1.readUnsignedByte(1593145924);
            int var44 = var1.readUnsignedShortAddLE(1764513086);
            int var49 = Buffer.method12203(var1, -1978385744);
            var4.method616(var39, var44, var49 >> 16, var49 & 65535, (byte)-42);
         }
      }

      if ((var3 & 1024) != 0) {
         for (int var23 = 0; var23 < 3; var23++) {
            var0.field1533[var23] = var1.readStringCp1252NullCircumfixed(1107284815);
         }

         class46.method610(var4, var0.field1533, -937676350);
      }

      if (0 != (var3 & 512)) {
         byte var24 = var1.readByteSub(-639471049);
         byte var32 = Buffer.method12001(var1, (byte)23);
         byte var40 = Buffer.method12001(var1, (byte)53);
         byte var45 = var1.readByteAdd((byte)-67);
         int var50 = var1.readUnsignedShortAdd(-1156088784) + 1759706017 * client.cycle;
         int var54 = Buffer.method12008(var1, (byte)5) + client.cycle * 1759706017;
         int var57 = var1.readUnsignedShortAddLE(511619277);
         var4.method600(var24, var32, var40, var45, var50, var54, var57, -1543563048);
         var0.field1531[var2] = false;
      }

      if (0 != (var3 & 8)) {
         int var33 = Buffer.method12008(var1, (byte)5);
         var33 += var1.readUnsignedByteSub((byte)2) << 16;
         int var25 = 16777215;
         if (var25 == var33) {
            var33 = -1;
         }

         var4.method577(var33, -523065230);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("fe")
   public static void method3650(PlayerUpdateManager var0) {
      if (var0 == null) {
         var0.method3635();
      } else {
         for (int var1 = 0; var1 < 1320060371 * var0.field1538; var1++) {
            int var2 = var0.playerIndices[var1];
            if (var0.field1531[var2]) {
               class46 var3 = var0.Players_regions[var2];
               var3.method569(var0.field1532[var2], (byte)-80);
               var0.field1531[var2] = false;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lci;)V")
   @ObfuscatedName("br")
   void method3658(Player var1) {
      if (var1 != null) {
         this.Players_regions[var1.index * -1903023775].method542(var1, 2021457557);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   void method3660() {
      this.field1538 = 0;

      for (int var1 = 0; var1 < -387760978; var1++) {
         this.Players_regions[var1].method534((byte)-39);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Lfi;")
   @ObfuscatedName("ae")
   static class137[] method3619(byte var0) {
      try {
         return new class137[]{class137.field1790, class137.field1794, class137.field1792, class137.field1791, class137.field1793};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "dz.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;II)V")
   @ObfuscatedName("at")
   final void method3656(PacketBuffer var1, int var2, int var3) {
      class46 var4 = this.Players_regions[var2];
      int var5 = Integer.MAX_VALUE;
      if (0 != (var3 & 4)) {
         int var6 = var1.readUnsignedByteNeg(2104201275);
         byte[] var7 = new byte[var6];
         Buffer var8 = new Buffer(var7);
         var1.writeBytes(var7, 0, var6, 1425102174);
         var4.method571(var8, 1373644472);
      }

      if (0 != (var3 & 16384)) {
         var5 = var1.readByteNeg(344605225);
         if (127 == var5) {
            this.field1532[var2] = MoveSpeed.field3808;
         } else {
            this.field1532[var2] = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var5, (byte)1);
         }
      }

      if (0 != (var3 & 8192)) {
         int var15 = 1759706017 * client.field710 + var1.readUnsignedByte(-1156088784);
         int var26 = 1759706017 * client.field946 + var1.method12181(-1156088784);
         byte var35 = var1.readByteNeg(-639471049);
         byte var9 = var1.readByteAdd((byte)-50);
         byte var10 = var1.readByteNeg(-639471049);
         byte var11 = (byte)var1.readSignedShort(437624601);
         var4.method612(var15, var26, var35, var9, var10, var11, 127380671);
      }

      if (0 != (var3 & 128)) {
         int var16 = Buffer.method12008(var1, (byte)5);
         class46.method595(var4, var16, -816455450);
      }

      if (0 != (var3 & 16)) {
         int var17 = var1.readShort((byte)-56);
         if (65535 == var17) {
            var17 = -1;
         }

         int var27 = var1.method12181(628964994);
         var4.method575(var17, var27, (byte)1);
      }

      if (0 != (var3 & 32)) {
         String var18 = var1.readStringCp1252NullCircumfixed(-805780043);
         var4.method582(var18, (byte)1);
      }

      if ((var3 & 4096) != 0) {
         int var19 = var1.readMedium(-1156088784);
         int var28 = var19 >> 8;
         int var36 = var28 >= 13 && var28 <= 20 ? var28 - 12 : 0;
         PlayerType var41 = (PlayerType)GrandExchangeOffer.findEnumerated(
            Varps.PlayerType_values(-2056358084), var1.readNullableLargeSmart(-547219944), (byte)1
         );
         boolean var46 = var1.readUnsignedByte(-669127485) == 1;
         int var51 = var1.method12164((byte)-26);
         this.field1534.offset = 0;
         var1.readBytes(this.field1534.array, 0, var51, (byte)-90);
         this.field1534.offset = 0;
         String var12 = AbstractFont.method10369(ClanChannelMember.method3946(ObjectSound.method2647(this.field1534, 162307969), 276147231));
         byte[] var13 = null;
         if (var36 > 0 && var36 <= 8) {
            var13 = new byte[var36];

            for (int var14 = 0; var14 < var36; var14++) {
               var13[var14] = var1.readByteAdd((byte)-121);
            }
         }

         class46.method598(var4, var19, var41, var46, var12, var13, (byte)3);
      }

      if ((var3 & 64) != 0) {
         int var20 = var1.method12183(1153574868);
         if (var20 > 0) {
            for (int var29 = 0; var29 < var20; var29++) {
               int var42 = -1;
               int var47 = -1;
               int var52 = -1;
               int var37 = Buffer.method12050(var1, 1225862443);
               if (var37 == 32767) {
                  var37 = Buffer.method12050(var1, -23912907);
                  var47 = Buffer.method12050(var1, 507339932);
                  var42 = Buffer.method12050(var1, -1889876332);
                  var52 = Buffer.method12050(var1, -947560620);
               } else if (32766 != var37) {
                  var47 = Buffer.method12050(var1, -1887353762);
               } else {
                  var37 = -1;
               }

               int var55 = Buffer.method12050(var1, 1863252877);
               var4.method585(var37, var47, var42, var52, var55, (byte)119);
            }
         }

         int var30 = var1.readShortSmartSub(-1897480031);
         if (var30 > 0) {
            for (int var38 = 0; var38 < var30; var38++) {
               int var43 = Buffer.method12050(var1, -1576345553);
               int var48 = Buffer.method12050(var1, -1963978214);
               if (var48 != 32767) {
                  int var53 = Buffer.method12050(var1, 1309921032);
                  int var56 = var1.packBytesToInt(-255145739);
                  int var58 = var48 > 0 ? var1.readLargeSmart(1106822895) : var56;
                  class46.method586(var4, var43, var48, var53, var56, var58, -957770174);
               } else {
                  var4.method561(var43, 1063024580);
               }
            }
         }
      }

      if ((var3 & 2048) != 0) {
         var4.pathTraversed = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3963(620885831), var1.readByteAdd((byte)-18), (byte)1);
         if (var5 == Integer.MAX_VALUE) {
            this.field1532[var2] = var4.pathTraversed;
         }
      }

      if (0 != (var3 & 2)) {
         var1.method12170((byte)2);
         var1.readUnsignedIntIME(1226647499);
         var1.readUnsignedByte(-351783587);
         int var21 = var1.readUnsignedShortLE((byte)12);
         this.field1534.offset = 0;
         var1.readBytes(this.field1534.array, 0, var21, (byte)69);
         this.field1534.offset = 0;
      }

      if ((var3 & 65536) != 0) {
         int var22 = var1.readLargeSmart(-156570870);

         for (int var31 = 0; var31 < var22; var31++) {
            int var39 = var1.readUnsignedByteAdd(1446743647);
            int var44 = var1.readSignedShort(109583983);
            int var49 = Buffer.method12203(var1, -1244336111);
            var4.method616(var39, var44, var49 >> 16, var49 & 65535, (byte)-126);
         }
      }

      if ((var3 & 1024) != 0) {
         for (int var23 = 0; var23 < 3; var23++) {
            this.field1533[var23] = var1.readStringCp1252NullCircumfixed(-1129560511);
         }

         class46.method610(var4, this.field1533, -937676350);
      }

      if (0 != (var3 & 512)) {
         byte var24 = var1.readByteSub(-639471049);
         byte var32 = Buffer.method12001(var1, (byte)9);
         byte var40 = Buffer.method12001(var1, (byte)65);
         byte var45 = var1.readByteAdd((byte)-100);
         int var50 = var1.method12183(-1156088784) + 1759706017 * client.field1001;
         int var54 = Buffer.method12008(var1, (byte)5) + client.revision * 1759706017;
         int var57 = var1.readShortSmartSub(-289348080);
         var4.method600(var24, var32, var40, var45, var50, var54, var57, -1543563048);
         this.field1531[var2] = false;
      }

      if (0 != (var3 & 8)) {
         int var33 = Buffer.method12008(var1, (byte)5);
         var33 += var1.method12174((byte)97) << 16;
         int var25 = 16777215;
         if (var25 == var33) {
            var33 = -1;
         }

         var4.method562(var33, 1343204897);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;I)V")
   @ObfuscatedName("gs")
   public static void method3641(PlayerUpdateManager var0, int var1) {
      if (var0 == null) {
         var0.clear(var1);
      }

      try {
         client.currentWorldViewId = 1092382715;
         Iterator var2 = client.worldViewManager.iterator();

         while (var2.hasNext()) {
            if (var1 >= 937423925) {
               throw new IllegalStateException();
            }

            WorldView var3 = (WorldView)var2.next();
            var0.method3644(var3, (byte)-125);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dz.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lxj;IB)Z")
   @ObfuscatedName("sb")
   public static boolean method3631(PlayerUpdateManager var0, PacketBuffer var1, int var2, byte var3) {
      if (var0 == null) {
         return var0.method3632(var1, var2, var3);
      } else {
         try {
            class46 var4 = var0.Players_regions[var2];
            int var5 = var1.method12339(2, 1333712909);
            if (0 == var5) {
               if (var3 == 8) {
                  throw new IllegalStateException();
               } else {
                  if (var1.method12339(1, 1333712909) != 0) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     method3631(var0, var1, var2, (byte)-63);
                  }

                  int var17 = var1.method12339(13, 1333712909);
                  int var20 = var1.method12339(13, 1333712909);
                  boolean var10000;
                  if (var1.method12339(1, 1333712909) == 1) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var23 = var10000;
                  if (var23) {
                     var0.Players_pendingUpdateIndices[(var0.Players_emptyIdxCount += 1674177231) * 1318902831 - 1] = var2;
                  }

                  if (var4.method551(-129484836)) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException();
                     }
                  } else {
                     var4.method559(var17, var20, -250751821);
                     var0.field1531[var2] = false;
                     return true;
                  }
               }
            } else if (1 == var5) {
               if (var3 == 8) {
                  throw new IllegalStateException();
               } else {
                  int var16 = var1.method12339(2, 1333712909);
                  int var19 = var4.field169 * 596721571;
                  int var22 = Coord.method8288(var19, -1415774464) + var16 & 3;
                  var4.method566(var22, 2134764171);
                  var4.field169 = 1728637963 * ((var19 & 268435455) + (var22 << 28));
                  return false;
               }
            } else if (var5 == 2) {
               if (var3 == 8) {
                  throw new IllegalStateException();
               } else {
                  int var15 = var1.method12339(5, 1333712909);
                  int var18 = var15 >> 3;
                  int var21 = var15 & 7;
                  int var24 = 596721571 * var4.field169;
                  int var25 = Coord.method8288(var24, -1396182269) + var18 & 3;
                  int var26 = var24 >> 14 & 0xFF;
                  int var27 = var24 & 0xFF;
                  if (0 == var21) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     var26--;
                     var27--;
                  }

                  if (var21 == 1) {
                     var27--;
                  }

                  if (2 == var21) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     var26++;
                     var27--;
                  }

                  if (var21 == 3) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     var26--;
                  }

                  if (4 == var21) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     var26++;
                  }

                  if (5 == var21) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     var26--;
                     var27++;
                  }

                  if (var21 == 6) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     var27++;
                  }

                  if (var21 == 7) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     var26++;
                     var27++;
                  }

                  var4.method566(var25, 2134764171);
                  var4.field169 = Coord.method8286(var25, var26, var27, (byte)63) * 1728637963;
                  return false;
               }
            } else {
               int var6 = var1.method12339(18, 1333712909);
               int var7 = var6 >> 16;
               int var8 = var6 >> 8 & 0xFF;
               int var9 = var6 & 0xFF;
               int var10 = 596721571 * var4.field169;
               int var11 = Coord.method8288(var10, -1474102630) + var7 & 3;
               var4.method566(var11, 2134764171);
               int var12 = Coord.method8292(var10, 1808529637) + var8 & 0xFF;
               int var13 = Coord.method8294(var10, 1346086770) + var9 & 0xFF;
               var4.field169 = Coord.method8286(var4.method565(831964661), var12, var13, (byte)-52) * 1728637963;
               return false;
            }
         } catch (RuntimeException var14) {
            throw RestClientThreadFactory.newRunException(var14, "dz.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ai")
   void clear(int var1) {
      try {
         client.followerIndex = 1092382715;
         Iterator var2 = client.worldViewManager.iterator();

         while (var2.hasNext()) {
            if (var1 >= 937423925) {
               throw new IllegalStateException();
            }

            WorldView var3 = (WorldView)var2.next();
            this.method3644(var3, (byte)-125);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dz.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;IB)Z")
   @ObfuscatedName("aj")
   boolean method3632(PacketBuffer var1, int var2, byte var3) {
      try {
         class46 var4 = this.Players_regions[var2];
         int var5 = var1.readBits(2, 1333712909);
         if (0 == var5) {
            if (var3 == 8) {
               throw new IllegalStateException();
            } else {
               if (var1.readBits(1, 1333712909) != 0) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  method3631(this, var1, var2, (byte)-63);
               }

               int var17 = var1.method12339(13, 1333712909);
               int var20 = var1.method12339(13, 1333712909);
               boolean var10000;
               if (var1.readBits(1, 1333712909) == 1) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var23 = var10000;
               if (var23) {
                  this.Players_emptyIndices[(this.Players_emptyIdxCount = this.Players_pendingUpdateCount + 1674177231) * 1318902831 - 1] = var2;
               }

               if (var4.method551(-129484836)) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  var4.method559(var17, var20, -250751821);
                  this.field1531[var2] = false;
                  return true;
               }
            }
         } else if (1 == var5) {
            if (var3 == 8) {
               throw new IllegalStateException();
            } else {
               int var16 = var1.method12339(2, 1333712909);
               int var19 = var4.field169 * 596721571;
               int var22 = Coord.method8288(var19, -1415774464) + var16 & 3;
               var4.method561(var22, 2134764171);
               var4.field169 = 1728637963 * ((var19 & 268435455) + (var22 << 28));
               return false;
            }
         } else if (var5 == 2) {
            if (var3 == 8) {
               throw new IllegalStateException();
            } else {
               int var15 = var1.method12339(5, 1333712909);
               int var18 = var15 >> 3;
               int var21 = var15 & 7;
               int var24 = 596721571 * var4.field171;
               int var25 = Coord.method8301(var24, -1396182269) + var18 & 3;
               int var26 = var24 >> 14 & 0xFF;
               int var27 = var24 & 0xFF;
               if (0 == var21) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var26--;
                  var27--;
               }

               if (var21 == 1) {
                  var27--;
               }

               if (2 == var21) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var26++;
                  var27--;
               }

               if (var21 == 3) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var26--;
               }

               if (4 == var21) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var26++;
               }

               if (5 == var21) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var26--;
                  var27++;
               }

               if (var21 == 6) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var27++;
               }

               if (var21 == 7) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var26++;
                  var27++;
               }

               var4.method566(var25, 2134764171);
               var4.field171 = Coord.method8286(var25, var26, var27, (byte)63) * 1728637963;
               return false;
            }
         } else {
            int var6 = var1.readBits(18, 1333712909);
            int var7 = var6 >> 16;
            int var8 = var6 >> 8 & 0xFF;
            int var9 = var6 & 0xFF;
            int var10 = 596721571 * var4.targetIndex;
            int var11 = Coord.method8294(var10, -1474102630) + var7 & 3;
            var4.method564(var11, 2134764171);
            int var12 = Coord.method8292(var10, 1808529637) + var8 & 0xFF;
            int var13 = Coord.method8301(var10, 1346086770) + var9 & 0xFF;
            var4.field168 = Coord.method8286(var4.method565(831964661), var12, var13, (byte)-52) * 1728637963;
            return false;
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "dz.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   void method3637(byte var1) {
      try {
         for (int var2 = 0; var2 < 1555789145 * this.Players_emptyIdxCount; var2++) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            int var3 = this.Players_pendingUpdateIndices[var2];
            class46 var4 = this.Players_regions[var3];
            Iterator var5 = client.worldViewManager.iterator();

            while (var5.hasNext()) {
               if (var1 != 0) {
                  return;
               }

               WorldView var6 = (WorldView)var5.next();
               Player var7 = (Player)var6.players.method9177(var3);
               if (null != var7) {
                  var4.method541(var7, 1381053839);
                  var7.method11274();
               }
            }

            var4.method545((byte)-43);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "dz.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   void method3661(int var1) {
      try {
         this.Players_emptyIdxCount = 0;

         for (int var2 = 0; var2 < 2048; var2++) {
            if (var1 == 1051081121) {
               return;
            }

            this.Players_regions[var2].method545((byte)-76);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dz.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("au")
   void method3651(byte var1) {
      try {
         for (int var2 = 0; var2 < 1320060371 * this.field1538; var2++) {
            if (var1 != 64) {
               throw new IllegalStateException();
            }

            int var3 = this.playerIndices[var2];
            if (this.field1531[var3]) {
               class46 var4 = this.Players_regions[var3];
               var4.method569(this.field1532[var3], (byte)-32);
               this.field1531[var3] = false;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "dz.au(" + ')');
      }
   }
}
