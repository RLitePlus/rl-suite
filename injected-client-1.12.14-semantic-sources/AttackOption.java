import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dc")
public class AttackOption implements Enum {
   @ObfuscatedSignature(descriptor = "Ldc;")
   @ObfuscatedName("ae")
   static final AttackOption field1304 = new AttackOption(4);
   @ObfuscatedSignature(descriptor = "Ldc;")
   @ObfuscatedName("an")
   static final AttackOption AttackOption_hidden = new AttackOption(3);
   @ObfuscatedSignature(descriptor = "Ldc;")
   @ObfuscatedName("ag")
   static final AttackOption field1302 = new AttackOption(2);
   @ObfuscatedSignature(descriptor = "Ldc;")
   @ObfuscatedName("at")
   static final AttackOption AttackOption_alwaysRightClick = new AttackOption(1);
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field1306 = 66;
   @ObfuscatedName("aj")
   final int id;
   @ObfuscatedName("ai")
   public static String osNameLowercase;
   @ObfuscatedSignature(descriptor = "Ldc;")
   @ObfuscatedName("av")
   static final AttackOption AttackOption_dependsOnCombatLevels = new AttackOption(0);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.id * 339226445;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ldc;")
   @ObfuscatedName("aj")
   static AttackOption[] method3058() {
      return new AttackOption[]{AttackOption_alwaysRightClick, field1304, AttackOption_dependsOnCombatLevels, field1302, AttackOption_hidden};
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.id * 339226445;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dc.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.id * 339226445;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.id * -1347465318;
   }

   AttackOption(int var1) {
      this.id = 1699783045 * var1;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;ZLxj;I)V")
   @ObfuscatedName("lb")
   static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2, int var3) {
      client.method2391(var0, var1, var2);

      try {
         client.field831 = 0;
         client.npcCount = 0;
         PacketBuffer.method12336(var2, -1078212020);
         int var4 = var2.method12339(8, 1333712909);
         if (var4 < var0.field1313.method10502(-2022397828)) {
            if (var3 <= 1877586301) {
               throw new IllegalStateException();
            }

            for (int var5 = var4; var5 < var0.field1313.method10502(-1834384024); var5++) {
               if (var3 <= 1877586301) {
                  client.method2466(var0, var1, var2);
                  return;
               }

               int var6 = var0.field1313.method10498(var5, (byte)12);
               client.field832[(client.field831 += -1939101687) * -613128647 - 1] = var6;
               NPC var7 = (NPC)var0.players.get(var6);
               var7.field1498 = true;
            }
         }

         if (var4 > var0.field1313.method10502(-1760978275)) {
            throw new RuntimeException("");
         } else {
            classSR.method10505(var0.field1313, -2002988012);

            for (int var14 = 0; var14 < var4; var14++) {
               if (var3 <= 1877586301) {
                  throw new IllegalStateException();
               }

               int var16 = var0.field1313.method10498(var14, (byte)98);
               NPC var18 = (NPC)var0.players.get(var16);
               int var8 = var2.method12339(1, 1333712909);
               if (var8 == 0) {
                  if (var3 <= 1877586301) {
                     client.method2466(var0, var1, var2);
                     return;
                  }

                  var0.field1313.method10495(var16, (byte)-77);
               } else {
                  int var9 = var2.method12339(2, 1333712909);
                  if (var9 == 0) {
                     if (var3 <= 1877586301) {
                        client.method2466(var0, var1, var2);
                        return;
                     }

                     var0.field1313.method10495(var16, (byte)-38);
                     client.npcIndices[(client.npcCount += -1508875419) * 6231661 - 1] = var16;
                  } else if (var9 == 1) {
                     if (var3 <= 1877586301) {
                        throw new IllegalStateException();
                     }

                     var0.field1313.method10495(var16, (byte)-98);
                     int var10 = var2.method12339(3, 1333712909);
                     NPC.method3508(var18, var10, MoveSpeed.field3806, (byte)46);
                     int var11 = var2.method12339(1, 1333712909);
                     if (1 == var11) {
                        if (var3 <= 1877586301) {
                           client.method2466(var0, var1, var2);
                           return;
                        }

                        client.npcIndices[(client.npcCount += -1508875419) * 6231661 - 1] = var16;
                     }
                  } else if (var9 == 2) {
                     if (var3 <= 1877586301) {
                        client.method2466(var0, var1, var2);
                        return;
                     }

                     var0.field1313.method10495(var16, (byte)-32);
                     if (var2.method12339(1, 1333712909) == 1) {
                        int var19 = var2.method12339(3, 1333712909);
                        NPC.method3508(var18, var19, MoveSpeed.field3808, (byte)-26);
                        int var22 = var2.method12339(3, 1333712909);
                        NPC.method3508(var18, var22, MoveSpeed.field3808, (byte)78);
                     } else {
                        int var20 = var2.method12339(3, 1333712909);
                        NPC.method3508(var18, var20, MoveSpeed.field3807, (byte)26);
                     }

                     int var21 = var2.method12339(1, 1333712909);
                     if (var21 == 1) {
                        if (var3 <= 1877586301) {
                           throw new IllegalStateException();
                        }

                        client.npcIndices[(client.npcCount += -1508875419) * 6231661 - 1] = var16;
                     }
                  } else if (3 == var9) {
                     client.field832[(client.field831 += -1939101687) * -613128647 - 1] = var16;
                     var18.field1498 = true;
                  }
               }
            }

            class138.method3983(var0, var1, var2, -1570779086);
            FloatProjection.method6013(var0, var2, (byte)14);

            for (int var13 = 0; var13 < -613128647 * client.field831; var13++) {
               if (var3 <= 1877586301) {
                  throw new IllegalStateException();
               }

               int var15 = client.field832[var13];
               NPC var17 = (NPC)var0.players.get(var15);
               if (var17.field1498) {
                  if (var3 <= 1877586301) {
                     throw new IllegalStateException();
                  }

                  var17.method3552((NPCComposition)null);
                  var17.definition = null;
                  var17.detach();
               }
            }

            if (253081433 * client.packetWriter.serverPacketLength == 2108391709 * var2.offset) {
               client.method2466(var0, var1, var2);
            } else if (var3 <= 1877586301) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException(2108391709 * var2.offset + classDF.field1346 + 253081433 * client.packetWriter.serverPacketLength);
            }
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "dc.lb(" + ')');
      }
   }
}
