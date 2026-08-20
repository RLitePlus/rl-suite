import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lp")
public class WorldMapLabelSize {
   @ObfuscatedSignature(descriptor = "Llp;")
   @ObfuscatedName("av")
   public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 3);
   @ObfuscatedName("aj")
   final int field3734;
   @ObfuscatedSignature(descriptor = "Llp;")
   @ObfuscatedName("ag")
   public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
   @ObfuscatedName("ae")
   final int field3733;
   @ObfuscatedSignature(descriptor = "Llp;")
   @ObfuscatedName("at")
   public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
   @ObfuscatedName("an")
   final int field3735;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field3739 = 32;
   @ObfuscatedSignature(descriptor = "Lvn;")
   @ObfuscatedName("vg")
   static PlatformInfo platformInfo;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field3740 = 5;

   @ObfuscatedSignature(descriptor = "(FI)Z")
   @ObfuscatedName("av")
   boolean method7217(float var1, int var2) {
      try {
         boolean var10000;
         if (var1 >= 310051823 * this.field3735) {
            if (var2 <= -690991640) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lp.av(" + ')');
      }
   }

   WorldMapLabelSize(int var1, int var2, int var3) {
      this.field3733 = -949996929 * var1;
      this.field3734 = var2 * 1117091049;
      this.field3735 = 316181263 * var3;
   }

   @ObfuscatedSignature(descriptor = "(F)Z")
   @ObfuscatedName("at")
   boolean method7218(float var1) {
      return var1 >= 310051823 * this.field3735;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lts;ZB)V")
   @ObfuscatedName("jf")
   static void method7223(WorldView var0, WorldEntity var1, boolean var2, byte var3) {
      try {
         boolean var10000;
         label117: {
            if (var1.worldEntityConfig.field2384) {
               if (var3 != 2) {
                  throw new IllegalStateException();
               }

               if (!var2) {
                  if (var3 != 2) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1;
                  break label117;
               }
            }

            var10000 = 0;
         }

         boolean var4 = (boolean)var10000;
         long var5 = 0L;
         if (577964535 * var1.worldView.id == 1201323213 * client.currentWorldViewId) {
            if (var3 != 2) {
               return;
            }

            var10000 = (boolean)1;
         } else {
            var10000 = (boolean)0;
         }

         boolean var7 = var10000;
         class406 var8 = var1.method10845(var7, 733677757);
         if (class406.field5185 == var8) {
            if (var3 != 2) {
               throw new IllegalStateException();
            }

            var5 = class236.calculateTag(0, 0, 0, 5, false, 0, 0, -1329739818);
         } else if (var4) {
            if (var3 != 2) {
               throw new IllegalStateException();
            }

            if (var8 != class406.field5183) {
               if (var3 != 2) {
                  throw new IllegalStateException();
               }

               if (class406.field5182 == var8) {
                  if (var3 != 2) {
                     throw new IllegalStateException();
                  }

                  var10000 = (boolean)1;
               } else {
                  var10000 = (boolean)0;
               }

               boolean var9 = var10000;
               var10000 = var1.getPlane(-732461658);
               int var10001 = Coord.method8304(var1.getY(-622714358), (byte)-126);
               int var10002 = Coord.method8304(var1.getX(-727737924), (byte)-10);
               boolean var10004;
               if (!var9) {
                  if (var3 != 2) {
                     return;
                  }

                  var10004 = true;
               } else {
                  var10004 = false;
               }

               var5 = class236.calculateTag(var10000, var10001, var10002, 4, var10004, var1.plane * 314555321, var0.id * 577964535, -1329739818);
            }
         }

         var1.worldEntityCoord
            .setZ(NPCComposition.getTileHeight(var0, var1.getY(-1295515546), var1.getX(-727737924), var0.plane * 2115028565, -253070517), (byte)-13);
         var1.worldView.scene.cycle = 1759706017 * client.cycle;
         var1.initScenePlane(var2, (byte)2);
         boolean var13 = var0.scene
            .method5503(
               2115028565 * var0.plane,
               var1.getY(-445997266),
               var1.getX(-727737924),
               var1.method10829(323729723),
               60,
               var1.worldView.scene,
               WorldEntity.method10834(var1, (byte)32),
               var5,
               false
            );
         if (var13) {
            if (var3 != 2) {
               return;
            }

            if (!var2) {
               if (var3 != 2) {
                  return;
               }

               WorldView var10 = var1.worldView;
               if (client.renderSelf) {
                  if (var3 != 2) {
                     return;
                  }

                  class31.addPlayerToScene(var10, client.localPlayerIndex * -1548864151, false, 2088516829);
               }

               WorldView var11 = var1.worldView;
               if (1466770191 * client.combatTargetPlayerIndex >= 0 && var11.npcs.get(client.combatTargetPlayerIndex * 1466770191) != null) {
                  if (var3 != 2) {
                     return;
                  }

                  class31.addPlayerToScene(var11, client.combatTargetPlayerIndex * 1466770191, false, 2083896862);
               }

               class291.addNpcsToScene(var1.worldView, class201.field2280, -1197120604);
               class234.method5958(var1.worldView, 1886489086);
               class291.addNpcsToScene(var1.worldView, class201.field2281, -1027704319);
               class291.addNpcsToScene(var1.worldView, class201.field2282, 1009564257);
               UserList.method10739(var1.worldView, 1368829620);
            }
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "lp.jf(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;II)V")
   @ObfuscatedName("zn")
   public static void method7222(CollisionMap var0, int var1, int var2) {
      var1 -= 504755687 * var0.xInset;
      var2 -= -1751058007 * var0.yInset;
      var0.flags[var1][var2] = var0.flags[var1][var2] & -262145;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;I)V")
   @ObfuscatedName("oj")
   public static void method7221(WorldEntity var0, int var1) {
      if (var0 == null) {
         var0.method10857();
      }

      var0.field5960 = 1366065475 * var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("an")
   static final void method7219(String var0, byte var1) {
      try {
         PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3926, client.packetWriter.isaacCipher, -1873996019);
         var2.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, 1183409661), (short)-14073);
         var2.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
         PacketWriter.method3330(client.packetWriter, var2, -1771370198);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lp.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Z")
   @ObfuscatedName("at")
   public static boolean method7220(long var0) {
      try {
         boolean var2 = var0 != 0L;
         if (var2) {
            boolean var3 = (int)(var0 >>> 19 & 1L) == 1;
            var2 = !var3;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lp.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lcw;I)V")
   @ObfuscatedName("ld")
   static final void method7224(WorldView var0, PendingSpawn var1, int var2) {
      try {
         Scene var3 = var0.scene;
         long var4 = 0L;
         int var6 = -1;
         int var7 = 0;
         int var8 = 0;
         if (1527879103 * var1.type == 0) {
            if (var2 != 1149527128) {
               return;
            }

            var4 = Scene.method5731(var3, var1.plane * 1465889165, 1691331269 * var1.x, var1.y * -7912037);
         }

         if (1 == var1.type * 1527879103) {
            if (var2 != 1149527128) {
               throw new IllegalStateException();
            }

            var4 = var3.method5763(var1.plane * 1465889165, 1691331269 * var1.x, var1.y * -7912037);
         }

         if (2 == 1527879103 * var1.type) {
            if (var2 != 1149527128) {
               throw new IllegalStateException();
            }

            var4 = var3.getWallDecorationTag(var1.plane * 1465889165, var1.x * 1691331269, var1.y * -7912037);
         }

         if (3 == 1527879103 * var1.type) {
            if (var2 != 1149527128) {
               throw new IllegalStateException();
            }

            var4 = var3.getBoundaryObjectTag(var1.plane * 1465889165, 1691331269 * var1.x, -7912037 * var1.y);
         }

         if (0L != var4) {
            int var9 = var3.method5784(var1.plane * 1465889165, var1.x * 1691331269, -7912037 * var1.y, var4);
            var6 = HorizontalAlignment.Entity_unpackID(var4);
            var7 = var9 & 31;
            var8 = var9 >> 6 & 3;
         }

         var1.objectId = -122296987 * var6;
         var1.field1245 = -790368387 * var7;
         var1.field1239 = -1682080193 * var8;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "lp.ld(" + ')');
      }
   }
}
