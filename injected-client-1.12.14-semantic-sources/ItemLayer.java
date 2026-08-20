import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Area;
import javax.annotation.Nullable;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jb")
public final class ItemLayer implements net.runelite.api.ItemLayer, TileObject {
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   static final int field2805 = 145;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("aj")
   Renderable third;
   @ObfuscatedName("at")
   int x;
   @ObfuscatedName("av")
   int z;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("an")
   Renderable first;
   @ObfuscatedName("ag")
   int y;
   @ObfuscatedName("ke")
   public int field2806;
   @ObfuscatedName("ak")
   long tag;
   @ObfuscatedName("aw")
   int height;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ae")
   Renderable second;

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.method5393());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)Lvz;")
   @ObfuscatedName("qp")
   public static Node method5388(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method9656();
      }

      return IterableNodeDeque.method9643(var0, null);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ng")
   public void method5394(int var1) {
      this.field2806 = var1;
   }

   public int getHeight() {
      return this.height * 2067113767;
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("xf")
   public Renderable method5395() {
      return this.second;
   }

   public int getY() {
      return this.y * -162090531;
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("ql")
   public Renderable method5396() {
      return this.third;
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(SecureUrlRequester.client, var1, this.getLocalLocation(), var2, var3);
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(SecureUrlRequester.client, this.getLocalLocation(), this.getPlane(), var1);
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("qd")
   public WorldView method5392() {
      return WorldView.method3094(this.method5393());
   }

   public Shape getClickbox() {
      Area var1 = new Area();
      WorldView var2 = this.method5392();

      for (Renderable var6 : new Renderable[]{this.method5396(), this.method5395(), this.method5397()}) {
         if (var6 != null) {
            Model var7 = var6.method6220();
            if (var7 != null) {
               Shape var8 = Perspective.getClickbox(
                  SecureUrlRequester.client, var2, var7, 0, this.x * -1625205487, this.y * -162090531, this.z * -90686671 - this.height * 2067113767
               );
               if (var8 != null) {
                  var1.add(new Area(var8));
               }
            }
         }
      }

      return var1;
   }

   public int getPlane() {
      return this.field2806;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V")
   @ObfuscatedName("mn")
   static void method5391(int var0, String var1, int var2) {
      try {
         int var3 = 1320060371 * client.playerUpdateManager.field1538;
         int[] var4 = client.playerUpdateManager.playerIndices;
         boolean var5 = false;
         Username var6 = new Username(var1, LoginScreenAnimation.loginType);
         WorldView var7 = WorldViewManager.method2910(client.worldViewManager, (byte)1);
         if (var7 == null) {
            if (var2 <= -489887350) {
               throw new IllegalStateException();
            } else {
               class356.addGameMessage(4, "", Strings.field4870 + var1 + ", current world null.", -243542612);
            }
         } else {
            for (int var8 = 0; var8 < var3; var8++) {
               Player var9 = (Player)var7.npcs.get(var4[var8]);
               if (null != var9) {
                  if (var2 <= -489887350) {
                     throw new IllegalStateException();
                  }

                  if (var9 != class330.localPlayer && null != var9.username) {
                     if (var2 <= -489887350) {
                        throw new IllegalStateException();
                     }

                     if (var9.username.equals(var6)) {
                        if (var2 <= -489887350) {
                           throw new IllegalStateException();
                        }

                        if (1 == var0) {
                           if (var2 <= -489887350) {
                              throw new IllegalStateException();
                           }

                           PacketBufferNode var10 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3873, client.packetWriter.isaacCipher, -1284397151);
                           Buffer.method12113(var10.packetBuffer, 0, (short)-16947);
                           var10.packetBuffer.writeShort(var4[var8], -2142520955);
                           PacketWriter.method3330(client.packetWriter, var10, -1771370198);
                        } else if (4 == var0) {
                           if (var2 <= -489887350) {
                              throw new IllegalStateException();
                           }

                           PacketBufferNode var12 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3870, client.packetWriter.isaacCipher, -1894248930);
                           var12.packetBuffer.writeShort(var4[var8], -1671777913);
                           var12.packetBuffer.writeByteNeg(0, 338397670);
                           PacketWriter.method3330(client.packetWriter, var12, -1771370198);
                        } else if (6 == var0) {
                           PacketBufferNode var13 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3958, client.packetWriter.isaacCipher, -1853909770);
                           var13.packetBuffer.writeShort(var4[var8], -1841623960);
                           var13.packetBuffer.writeByteNeg(0, 338397670);
                           PacketWriter.method3330(client.packetWriter, var13, -1771370198);
                        } else if (var0 == 7) {
                           if (var2 <= -489887350) {
                              throw new IllegalStateException();
                           }

                           PacketBufferNode var14 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3892, client.packetWriter.isaacCipher, -1353109795);
                           var14.packetBuffer.writeShortAddLE(var4[var8], -1808534856);
                           Buffer.method12113(var14.packetBuffer, 0, (short)-13685);
                           PacketWriter.method3330(client.packetWriter, var14, -1771370198);
                        }

                        var5 = true;
                        break;
                     }
                  }
               }
            }

            if (!var5) {
               if (var2 <= -489887350) {
                  return;
               }

               class356.addGameMessage(4, "", Strings.field4870 + var1, -950642721);
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "jb.mn(" + ')');
      }
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(SecureUrlRequester.client, this.getLocalLocation());
   }

   ItemLayer() {
   }

   public boolean isOpShown(int var1) {
      PendingSpawn var2 = this.method5392().method3095(this.getHash());
      return var2 == null ? true : var2.method2999(var1);
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 20 & 4294967295L);
   }

   public int getZ() {
      return this.z * -90686671;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ap")
   public static void method5389(int var0, int var1, int var2, int var3, int var4) {
      try {
         class345.musicPlayerStatus = var0 * 497969771;
         class345.field4312 = var1 * 1561175877;
         class345.field4307 = 1402629673 * var2;
         class345.field4306 = 1099154967 * var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "jb.ap(" + ')');
      }
   }

   public Polygon getCanvasTilePoly() {
      int var1 = 1;
      int var2 = 1;
      if (this instanceof GameObject) {
         GameObject var3 = (GameObject)this;
         var1 = var3.endX * 1553138359 - var3.startX * 1666005069 + 1;
         var2 = var3.endY * -2094327665 - var3.startY * 889015863 + 1;
      }

      return Perspective.getCanvasTileAreaPoly(SecureUrlRequester.client, this.getLocalLocation(), var1, var2, this.getPlane(), 0);
   }

   @ObfuscatedSignature(descriptor = "()Ljz;")
   @ObfuscatedName("au")
   public Renderable method5397() {
      return this.first;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ne")
   public int method5393() {
      long var1 = this.getHash();
      int var3 = (int)(var1 >> 52 & 4095L);
      if (var3 == 4095L) {
         var3 = -1;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lut;Lut;IIII)V")
   @ObfuscatedName("az")
   public static void method5390(DynamicArray var0, DynamicArray var1, int var2, int var3, int var4, int var5) {
      try {
         classWJ.method11743(var0, (byte)-23);
         ArchiveDiskActionHandler.method8886(var1, var0.field6107, 1637040545);
         int var6 = var0.method11215((byte)82);
         int var7 = var1.method11215((byte)78);
         if (-1 == var4) {
            var4 = var0.method11215((byte)9) - var2;
         }

         if (var4 != 0) {
            if (var5 == -1463162589) {
               throw new IllegalStateException();
            } else {
               if (var0 == var1) {
                  if (var5 == -1463162589) {
                     return;
                  }

                  if (var2 == var3) {
                     if (var5 == -1463162589) {
                        throw new IllegalStateException();
                     }

                     return;
                  }
               }

               if (var2 >= 0) {
                  if (var5 == -1463162589) {
                     throw new IllegalStateException();
                  }

                  if (var2 + var4 <= var6) {
                     if (var5 == -1463162589) {
                        return;
                     }

                     if (var3 >= 0) {
                        if (var5 == -1463162589) {
                           return;
                        }

                        if (var3 + var4 <= var7) {
                           HttpResponse.method142(var0, var2, var1, var3, var4, (byte)2);
                           return;
                        }

                        if (var5 == -1463162589) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "jb.az(" + ')');
      }
   }

   public WorldPoint getWorldLocation() {
      WorldView var1 = WorldView.method3094(this.method5393());
      if (var1 == null) {
         var1 = Occluder.topLevelWorldView;
      }

      if (this instanceof GameObject) {
         GameObject var2 = (GameObject)this;
         int var3 = var2.startX * 1666005069;
         int var4 = var2.startY * 889015863;
         int var5 = var2.endX * 1553138359 - var3;
         int var6 = var2.endY * -2094327665 - var4;
         return WorldPoint.fromScene(var1, var3 + var5 / 2, var4 + var6 / 2, this.getPlane());
      } else {
         return WorldPoint.fromLocal(var1, this.getX(), this.getY(), this.getPlane());
      }
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   @Nullable
   public String getOpOverride(int var1) {
      PendingSpawn var2 = this.method5392().method3095(this.getHash());
      return var2 == null ? null : var2.method2997(var1);
   }

   public int getX() {
      return this.x * -1625205487;
   }

   public long getHash() {
      return this.tag;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   public static int method5387(int var0, int var1) {
      try {
         return (var0 & -677274403 * classWL.field6389) - 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jb.ag(" + 41);
      }
   }
}
