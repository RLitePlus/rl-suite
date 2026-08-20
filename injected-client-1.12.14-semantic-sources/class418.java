import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class418 {
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ay")
   public static final class418 field5447 = new class418(8);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("at")
   public static final class418 field5427 = new class418(0);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ag")
   public static final class418 field5436 = new class418(1);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("an")
   public static final class418 field5428 = new class418(2);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ak")
   public static final class418 field5431 = new class418(5);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("aj")
   public static final class418 field5430 = new class418(4);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("af")
   public static final class418 field5446 = new class418(21);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("aa")
   static final class418 field5449 = new class418(24);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ap")
   public static final class418 field5433 = new class418(7);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("aw")
   public static final class418 field5432 = new class418(6);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("av")
   static final class418 field5425 = new class418(255);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("az")
   public static final class418 field5439 = new class418(10);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ad")
   public static final class418 field5435 = new class418(11);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ai")
   public static final class418 field5438 = new class418(12);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("as")
   public static final class418 field5443 = new class418(13);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ab")
   public static final class418 field5426 = new class418(15);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("au")
   public static final class418 field5434 = new class418(9);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ax")
   public static final class418 field5442 = new class418(17);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ar")
   public static final class418 field5437 = new class418(18);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("am")
   public static final class418 field5444 = new class418(22);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("al")
   public static final class418 field5445 = new class418(20);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ae")
   public static final class418 field5429 = new class418(3);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ac")
   public static final class418 field5440 = new class418(14);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ao")
   public static final class418 field5441 = new class418(23);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ah")
   public static final class418 field5448 = new class418(19);
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("aq")
   static final class418 field5450 = new class418(25);
   @ObfuscatedName("be")
   public final int field5451;

   class418(int var1) {
      this.field5451 = 1380391181 * var1;
   }

   @ObfuscatedSignature(descriptor = "(Lof;IB)V")
   @ObfuscatedName("aw")
   static void method9195(Widget var0, int var1, byte var2) {
      try {
         if (0 == var0.type * 928687775) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (2077538819 * var0.childIndex > -1) {
               if (var2 != 0) {
                  return;
               }

               if (var1 > var0.field4454 * -86298045) {
                  var0.field4454 = var1 * -593417621;
               }

               if (var1 < -1516264759 * var0.field4453) {
                  if (var2 != 0) {
                     throw new IllegalStateException();
                  }

                  var0.field4453 = -1970530439 * var1;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qw.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liz;)I")
   @ObfuscatedName("gs")
   public static int method9197(FloorOverlayDefinition var0) {
      return var0.hue * -1914711119;
   }

   @ObfuscatedSignature(descriptor = "(ZLxj;I)V")
   @ObfuscatedName("kv")
   static final void loadRegions(boolean var0, PacketBuffer var1, int var2) {
      client.method2148(var0, var1);

      try {
         client.isInInstance = var0;
         if (!client.isInInstance) {
            if (var2 != -1793120611) {
               throw new IllegalStateException();
            }

            int var3 = Buffer.method12008(var1, (byte)5);
            int var4 = var1.readUnsignedShortAddLE(1021854631);
            var1.method12164((byte)-57);
            int var5 = Buffer.method12008(var1, (byte)5);
            SpriteBufferProperties.xteaKeys = new int[var5][4];

            for (int var6 = 0; var6 < var5; var6++) {
               if (var2 != -1793120611) {
                  throw new IllegalStateException();
               }

               for (int var7 = 0; var7 < 4; var7++) {
                  if (var2 != -1793120611) {
                     throw new IllegalStateException();
                  }

                  SpriteBufferProperties.xteaKeys[var6][var7] = Buffer.method12015(var1, -355818100);
               }
            }

            Script.regions = new int[var5];
            FaceNormal.regionMapArchiveIds = new int[var5];
            class210.regionLandArchiveIds = new int[var5];
            class160.regionLandArchives = new byte[var5][];
            class148.regionMapArchives = new byte[var5][];
            var5 = 0;

            for (int var21 = (var3 - 6) / 8; var21 <= (var3 + 6) / 8; var21++) {
               if (var2 != -1793120611) {
                  throw new IllegalStateException();
               }

               for (int var24 = (var4 - 6) / 8; var24 <= (var4 + 6) / 8; var24++) {
                  if (var2 != -1793120611) {
                     throw new IllegalStateException();
                  }

                  int var8 = var24 + (var21 << 8);
                  Script.regions[var5] = var8;
                  FaceNormal.regionMapArchiveIds[var5] = Tile.archive9.groupLoadPercentByName("m" + var21 + "_" + var24, (byte)29);
                  class210.regionLandArchiveIds[var5] = Tile.archive9.groupLoadPercentByName("l" + var21 + "_" + var24, (byte)-43);
                  var5++;
               }
            }

            classGK.method4247(var3, var4, true, -1765432687);
         } else {
            int var17 = Buffer.method12008(var1, (byte)5);
            boolean var10000;
            if (var1.readUnsignedByteAdd(1657033841) == 1) {
               if (var2 != -1793120611) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var18 = var10000;
            int var20 = var1.readUnsignedShortAdd(-1156088784);
            int var22 = Buffer.method12008(var1, (byte)5);
            PacketBuffer.method12336(var1, -1813327222);

            for (int var25 = 0; var25 < 4; var25++) {
               if (var2 != -1793120611) {
                  throw new IllegalStateException();
               }

               for (int var28 = 0; var28 < 13; var28++) {
                  if (var2 != -1793120611) {
                     client.method2165(var0, var1);
                     return;
                  }

                  for (int var9 = 0; var9 < 13; var9++) {
                     if (var2 != -1793120611) {
                        throw new IllegalStateException();
                     }

                     int var10 = var1.method12339(1, 1333712909);
                     if (var10 == 1) {
                        if (var2 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        client.instanceChunkTemplates[var25][var28][var9] = var1.method12339(26, 1333712909);
                     } else {
                        client.instanceChunkTemplates[var25][var28][var9] = -1;
                     }
                  }
               }
            }

            var1.exportIndex((byte)-12);
            SpriteBufferProperties.xteaKeys = new int[var22][4];

            for (int var26 = 0; var26 < var22; var26++) {
               if (var2 != -1793120611) {
                  throw new IllegalStateException();
               }

               for (int var29 = 0; var29 < 4; var29++) {
                  SpriteBufferProperties.xteaKeys[var26][var29] = Buffer.method12015(var1, 1358192851);
               }
            }

            Script.regions = new int[var22];
            FaceNormal.regionMapArchiveIds = new int[var22];
            class210.regionLandArchiveIds = new int[var22];
            class160.regionLandArchives = new byte[var22][];
            class148.regionMapArchives = new byte[var22][];
            var22 = 0;

            for (int var27 = 0; var27 < 4; var27++) {
               if (var2 != -1793120611) {
                  client.method2165(var0, var1);
                  return;
               }

               for (int var30 = 0; var30 < 13; var30++) {
                  for (int var31 = 0; var31 < 13; var31++) {
                     if (var2 != -1793120611) {
                        client.method2165(var0, var1);
                        return;
                     }

                     int var32 = client.instanceChunkTemplates[var27][var30][var31];
                     if (var32 != -1) {
                        if (var2 != -1793120611) {
                           throw new IllegalStateException();
                        }

                        int var11 = class498.method10641(var32, 585341950);
                        int var12 = Renderable.method6216(var32, (byte)-37);
                        int var13 = (var11 / 8 << 8) + var12 / 8;

                        for (int var14 = 0; var14 < var22; var14++) {
                           if (Script.regions[var14] == var13) {
                              var13 = -1;
                              break;
                           }
                        }

                        if (-1 != var13) {
                           if (var2 != -1793120611) {
                              throw new IllegalStateException();
                           }

                           Script.regions[var22] = var13;
                           int var33 = var13 >> 8 & 0xFF;
                           int var15 = var13 & 0xFF;
                           FaceNormal.regionMapArchiveIds[var22] = Tile.archive9.groupLoadPercentByName("m" + var33 + "_" + var15, (byte)-53);
                           class210.regionLandArchiveIds[var22] = Tile.archive9.groupLoadPercentByName("l" + var33 + "_" + var15, (byte)29);
                           var22++;
                        }
                     }
                  }
               }
            }

            boolean var10002;
            if (!var18) {
               if (var2 != -1793120611) {
                  throw new IllegalStateException();
               }

               var10002 = true;
            } else {
               var10002 = false;
            }

            classGK.method4247(var20, var17, var10002, -1491427768);
         }

         client.method2165(var0, var1);
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "qw.kv(" + ')');
      }
   }
}
