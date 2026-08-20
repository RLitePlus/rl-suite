import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("no")
public final class class340 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final String field4323 = "Updating date of birth...";
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field4321 = 18;
   @ObfuscatedName("av")
   static long field4322;

   @ObfuscatedSignature(descriptor = "(Lql;J)Lvz;")
   @ObfuscatedName("fi")
   public static Node method7830(IterableNodeHashTable var0, long var1) {
      if (var0 == null) {
         var0.method8952();
      }

      return var0.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lxj;IB)V")
   @ObfuscatedName("av")
   static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1, int var2, byte var3) {
      try {
         int var4 = var1.readUnsignedByte(-489785466);
         if (var4 < var0.field1314.method10502(-1767098568)) {
            if (var3 <= 1) {
               client.method2458(var0, var1, var2);
               return;
            }

            for (int var5 = var4; var5 < var0.field1314.method10502(-1857053063); var5++) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               int var6 = var0.field1314.method10498(var5, (byte)68);
               WorldView var7 = WorldViewManager.method2901(client.worldViewManager, var6, (byte)1);
               if (null == var7) {
                  if (var3 <= 1) {
                     client.method2458(var0, var1, var2);
                     return;
                  }
               } else {
                  for (int var8 = 0; var8 < 1320060371 * client.playerUpdateManager.field1538; var8++) {
                     if (var3 <= 1) {
                        client.method2458(var0, var1, var2);
                        return;
                     }

                     int var9 = client.playerUpdateManager.playerIndices[var8];
                     client.playerUpdateManager.method3657((Player)var7.npcs.get(var9), -463696545);
                  }

                  client.worldViewManager.removeWorldViewById(var6, 753377245);
               }

               WorldEntity var19 = (WorldEntity)var0.worldEntities.get((long)var6);
               if (var19 != null) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var19.remove();
               }
            }
         }

         if (var4 > var0.field1314.method10502(-1933571494)) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            classSR.method10505(var0.field1314, -1457850207);
            WorldEntityCoord var16 = new WorldEntityCoord();

            for (int var17 = 0; var17 < var4; var17++) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               int var20 = var0.field1314.method10498(var17, (byte)70);
               WorldEntity var22 = (WorldEntity)var0.worldEntities.get((long)var20);
               int var24 = var1.readUnsignedByte(-1023734217);
               if (0 == var24) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  WorldView var26 = WorldViewManager.method2901(client.worldViewManager, var20, (byte)1);
                  if (null == var26) {
                     if (var3 <= 1) {
                        client.method2458(var0, var1, var2);
                        return;
                     }
                  } else {
                     for (int var28 = 0; var28 < client.playerUpdateManager.field1538 * 1320060371; var28++) {
                        int var30 = client.playerUpdateManager.playerIndices[var28];
                        client.playerUpdateManager.method3657((Player)var26.npcs.get(var30), -541736768);
                     }

                     client.worldViewManager.removeWorldViewById(var20, -1219137493);
                  }

                  if (null != var22) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var22.remove();
                  }
               } else {
                  var0.field1314.method10495(var20, (byte)-113);
                  if (var24 != 1) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var16.method6262(var22.method10837(-1008881917), 1925683341);
                     byte var10 = Buffer.method12001(var1, (byte)51);
                     if (0 == var10) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        int var11 = HttpRequestTask.method83(var1, var10, 0, -1960684968);
                        int var12 = HttpRequestTask.method83(var1, var10, 2, -116921687);
                        int var13 = HttpRequestTask.method83(var1, var10, 4, -1499284251);
                        int var14 = HttpRequestTask.method83(var1, var10, 6, -1614119515);
                        WorldEntityCoord.method6278(var16, var11, var12, var13, var14, (byte)-11);
                     }

                     if (2 == var24) {
                        var22.method10869(var16, -1852269755);
                     } else {
                        WorldEntity.method10874(var22, var16, -1017203982);
                     }
                  }

                  if (var2 >= 6) {
                     if (var3 <= 1) {
                        client.method2458(var0, var1, var2);
                        return;
                     }

                     Fonts.method11308(var22, var1, (byte)2);
                  }
               }
            }

            while (var1.bitsRemaining(253081433 * client.packetWriter.serverPacketLength, 1731200045) > 0) {
               if (var3 <= 1) {
                  client.method2458(var0, var1, var2);
                  return;
               }

               int var18 = Buffer.method12008(var1, (byte)5);
               var0.field1314.method10495(var18, (byte)-87);
               int var21 = var1.readUnsignedByte(-1399024893);
               int var23 = var1.readUnsignedByte(-1097509844);
               int var25 = var21 * 8;
               int var27 = var23 * 8;
               WorldView var29 = classGT.method4366(var18, var25, var27, -1765638269);
               WorldEntity var31 = new WorldEntity(var18, var29);
               var0.worldEntities.put((Node)var31, (long)var18);
               var31.plane = -1403921783 * var18;
               var31.field5964 = 162183745 * var0.id;
               var31.method10838(WorldMapRegion.method6991(var1.readShort((byte)-124), (byte)-124), -369965370);
               LoginPacket.method4150(var1, var31.worldEntityCoord, 0, 0, (byte)-1);
               var31.method10869(var31.worldEntityCoord, -1321548329);
               var31.method10848(
                  (WorldEntityOwnerType)GrandExchangeOffer.findEnumerated(class85.method3474(1309512402), var1.readUnsignedByte(1329192001), (byte)1),
                  641407105
               );
               if (var2 >= 6) {
                  Fonts.method11308(var31, var1, (byte)2);
               }
            }

            client.method2458(var0, var1, var2);
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "no.av(" + ')');
      }
   }

   class340() throws Throwable {
      throw new Error();
   }
}
