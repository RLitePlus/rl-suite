import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bw")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kr")
   static Archive field422;
   @ToRemove(unused = "true")
   @ObfuscatedName("cy")
   static final int field421 = 4;
   @ObfuscatedName("av")
   boolean filterWorlds;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field420 = 62;

   GrandExchangeOfferOwnWorldComparator() {
   }

   @ObfuscatedSignature(descriptor = "(Lvu;IIIIB)Z")
   @ObfuscatedName("ae")
   public static boolean method1277(classVU var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         if (!classFM.method4027(var0, var1, var2, var3, var4, (byte)0)) {
            if (var5 == 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return WorldMapSection1.method7452(
               var0.method11604(0, (byte)2),
               classVU.method11608(var0, 0, 1955071929),
               var0.method11604(1, (byte)-88),
               classVU.method11608(var0, 1, 724296285),
               var0.method11604(2, (byte)43),
               classVU.method11608(var0, 2, -1052168013),
               var0.method11604(3, (byte)-25),
               classVU.method11608(var0, 3, -1557644193),
               var1,
               var2,
               var3,
               var4,
               (byte)1
            );
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbw;Lqk;Lqk;B)I")
   @ObfuscatedName("yq")
   public static int method1281(GrandExchangeOfferOwnWorldComparator var0, GrandExchangeEvent var1, GrandExchangeEvent var2, byte var3) {
      if (var0 == null) {
         return var0.compare_bridged(var1, var1, var3);
      } else {
         try {
            if (-1787296361 * var2.world == -1787296361 * var1.world) {
               return 0;
            } else {
               if (var0.filterWorlds) {
                  if (var3 != 97) {
                     throw new IllegalStateException();
                  }

                  if (-1787296361 * var1.world == client.worldId * 1312022025) {
                     if (var3 != 97) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }

                  if (1312022025 * client.worldId == var2.world * -1787296361) {
                     if (var3 != 97) {
                        throw new IllegalStateException();
                     }

                     return 1;
                  }
               }

               byte var10000;
               if (var1.world * -1787296361 < var2.world * -1787296361) {
                  if (var3 != 97) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "bw.av(" + 41);
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bw.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method1283(Object var1, Object var2) {
      return method1281(this, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)97);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method1284(Object var1, Object var2) {
      return method1281(this, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)97);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method1285(Object var1, Object var2) {
      return method1281(this, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)97);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method1286(Object var1, Object var2) {
      return method1281(this, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)97);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return method1281(this, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)97);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bw.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method1287(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method1288(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("iz")
   static final void doCheat(String var0, int var1) {
      try {
         if (var0.equalsIgnoreCase("toggleroof")) {
            if (var1 >= 1271535343) {
               throw new IllegalStateException();
            }

            ClientPreferences var10000 = class468.clientPreferences;
            boolean var10001;
            if (!class468.clientPreferences.isRoofsHidden(1895302623)) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            var10000.updateRoofsHidden(var10001, (short)25920);
            if (class468.clientPreferences.isRoofsHidden(1282863545)) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               class356.addGameMessage(99, "", "Roofs are now all hidden", 303771839);
            } else {
               class356.addGameMessage(99, "", "Roofs will only be removed selectively", -1682209510);
            }
         }

         if (var0.startsWith("zbuf")) {
            if (var1 >= 1271535343) {
               return;
            }

            boolean var13;
            if (Message.method1204(var0.substring(5).trim(), (byte)-108) == 1) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               var13 = true;
            } else {
               var13 = false;
            }

            boolean var2 = var13;
            SecureUrlRequester.client.method837(var2, (byte)-80);
            Rasterizer3D.method5817(var2);
         }

         if (var0.equalsIgnoreCase("z")) {
            if (var1 >= 1271535343) {
               return;
            }

            boolean var14;
            if (!client.z) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               var14 = true;
            } else {
               var14 = false;
            }

            client.z = var14;
         }

         if (var0.equalsIgnoreCase("displayfps")) {
            ClientPreferences.method1587(class468.clientPreferences, -2028582431);
         }

         if (var0.equalsIgnoreCase("renderself")) {
            client.renderSelf = !client.renderSelf;
         }

         if (var0.equalsIgnoreCase("mouseovertext")) {
            if (var1 >= 1271535343) {
               throw new IllegalStateException();
            }

            boolean var15;
            if (!client.showMouseOverText) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               var15 = true;
            } else {
               var15 = false;
            }

            client.showMouseOverText = var15;
         }

         if (var0.startsWith("setdrawdistance")) {
            if (var1 >= 1271535343) {
               return;
            }

            String[] var8 = var0.split(" ");

            try {
               int var3 = Integer.parseInt(var8[1]);
               ClientPreferences.method1661(class468.clientPreferences, var3, -1563920807);
            } catch (NumberFormatException var6) {
               class356.addGameMessage(
                  99,
                  "",
                  String.format(
                     "Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s",
                     var8[1]
                  ),
                  503614290
               );
            }
         }

         if (var0.startsWith("settilerendermode")) {
            if (var1 >= 1271535343) {
               throw new IllegalStateException();
            }

            String[] var9 = var0.split(" ");

            try {
               int var12 = Integer.parseInt(var9[1]);
               Occluder.topLevelWorldView.scene.method5575(TileRenderMode.method6144()[var12]);
            } catch (NumberFormatException var5) {
               class356.addGameMessage(
                  99,
                  "",
                  String.format(
                     "Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s",
                     var9[1]
                  ),
                  -1616627656
               );
            }
         }

         if (var0.equalsIgnoreCase("getdrawdistance")) {
            if (var1 >= 1271535343) {
               throw new IllegalStateException();
            }

            class356.addGameMessage(99, "", String.format("%d", class468.clientPreferences.getDrawDistance((byte)-92)), 1005547342);
         }

         if (427594063 * client.staffModLevel >= 2) {
            if (var0.equalsIgnoreCase("errortest")) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException();
            }

            if (var0.equalsIgnoreCase("showcoord")) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               boolean var16;
               if (!Skills.worldMap.showCoord) {
                  if (var1 >= 1271535343) {
                     return;
                  }

                  var16 = true;
               } else {
                  var16 = false;
               }

               Skills.worldMap.showCoord = var16;
            }

            if (var0.equalsIgnoreCase("fpson")) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               ClientPreferences.method1591(class468.clientPreferences, true, 2022807506);
            }

            if (var0.equalsIgnoreCase("fpsoff")) {
               ClientPreferences.method1591(class468.clientPreferences, false, -80298566);
            }

            if (var0.equalsIgnoreCase("gc")) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               System.gc();
            }

            if (var0.equalsIgnoreCase("clientdrop")) {
               class165.method4409((byte)115);
            }

            if (var0.equalsIgnoreCase("clientreload")) {
               class144.method3969((byte)-7);
            } else if (var0.equalsIgnoreCase("sfx8bit")) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               class468.clientPreferences.method1671(true, 1000377854);
            } else if (var0.equalsIgnoreCase("sfx16bit")) {
               if (var1 >= 1271535343) {
                  return;
               }

               class468.clientPreferences.method1671(false, 1177255683);
            } else if (var0.startsWith("playsong ")) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               String var10 = var0.substring("playsong ".length());

               try {
                  if (class468.clientPreferences.getMusicVolume((byte)6) == 0) {
                     if (var1 >= 1271535343) {
                        throw new IllegalStateException();
                     }

                     classGK.method4244(0, 0, 1280066671);
                  } else {
                     class148.method4143(var10, class468.clientPreferences.getMusicVolume((byte)6), -1685540445);
                  }
               } catch (Exception var4) {
                  class356.addGameMessage(99, "", "Can't play the midi named " + var10, 558224947);
               }
            } else if (var0.equalsIgnoreCase("stopsong")) {
               if (var1 >= 1271535343) {
                  throw new IllegalStateException();
               }

               classGK.method4244(0, 0, 591326111);
            }
         }

         PacketBufferNode var11 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3884, client.packetWriter.isaacCipher, -1808903144);
         var11.packetBuffer.writeByte(var0.length() + 1, (short)-19371);
         var11.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
         PacketWriter.method3330(client.packetWriter, var11, -1771370198);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bw.iz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILof;Lof;I)Lof;")
   @ObfuscatedName("ay")
   static Widget method1279(int var0, Widget var1, Widget var2, int var3) {
      try {
         int var4 = 0;
         Widget var5 = null;

         for (int var6 = 1 + var2.childIndex * 2077538819; var6 < var1.children.length; var6++) {
            if (var3 >= -1582934749) {
               throw new IllegalStateException();
            }

            Widget var7 = var1.children[var6];
            if (null == var7) {
               if (var3 >= -1582934749) {
                  throw new IllegalStateException();
               }
            } else if (var2.childIndex * 2077538819 == var7.field4451 * 1865628485) {
               if (++var4 - 1 == var0) {
                  if (var3 >= -1582934749) {
                     throw new IllegalStateException();
                  }

                  var5 = var7;
                  break;
               }
            }
         }

         return var5;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bw.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;IZLcu;I)V")
   @ObfuscatedName("ak")
   static void method1278(Widget var0, int var1, boolean var2, Script var3, int var4) {
      try {
         if (var0.children == null) {
            if (var4 <= -1896950788) {
               throw new IllegalStateException();
            }

            var0.children = new Widget[var1 + 1];
         }

         if (var0.children.length <= var1) {
            Widget[] var5 = new Widget[1 + var1];
            System.arraycopy(var0.children, 0, var5, 0, var0.children.length);
            var0.children = var5;
         } else {
            Widget var7 = var0.children[var1];
            if (var7 != null) {
               if (var2) {
                  if (var4 <= -1896950788) {
                     return;
                  }

                  throw new RuntimeException("");
               }

               ClickAction.method11249(var7, var0, (short)26955);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bw.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbw;Ljava/lang/Object;)Z")
   @ObfuscatedName("rg")
   public static boolean method1289(GrandExchangeOfferOwnWorldComparator var0, Object var1) {
      return var0 == null ? var0.equals(var1) : var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   public static void method1276(int var0, int var1) {
      try {
         if (!class345.midiRequests.isEmpty()) {
            if (var1 != 627648485) {
               throw new IllegalStateException();
            }

            Iterator var2 = class345.midiRequests.iterator();

            while (var2.hasNext()) {
               if (var1 != 627648485) {
                  throw new IllegalStateException();
               }

               MidiRequest var3 = (MidiRequest)var2.next();
               if (null != var3) {
                  var3.musicTrackVolume = var0 * -1589930535;
               }
            }

            MidiRequest var5 = (MidiRequest)class345.midiRequests.get(0);
            if (var5 != null) {
               if (var1 != 627648485) {
                  throw new IllegalStateException();
               }

               if (var5.midiPcmStream != null) {
                  if (var1 != 627648485) {
                     throw new IllegalStateException();
                  }

                  if (var5.midiPcmStream.isReady(-1398127356)) {
                     if (var1 != 627648485) {
                        return;
                     }

                     if (!var5.field4268) {
                        MidiPcmStream.method7621(var5.midiPcmStream, var0, (byte)84);
                        var5.field4267 = var0;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public static void method1275(int var0) {
      try {
         InvDefinition.InvDefinition_cached.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqk;Lqk;B)I")
   @ObfuscatedName("av")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2, byte var3) {
      try {
         if (-1787296361 * var2.world == -1787296361 * var1.world) {
            return 0;
         } else {
            if (this.filterWorlds) {
               if (var3 != 97) {
                  throw new IllegalStateException();
               }

               if (-1787296361 * var1.world == client.revision * 1312022025) {
                  if (var3 != 97) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }

               if (1312022025 * client.field973 == var2.world * -1787296361) {
                  if (var3 != 97) {
                     throw new IllegalStateException();
                  }

                  return 1;
               }
            }

            byte var10000;
            if (var1.world * -1787296361 < var2.world * -1787296361) {
               if (var3 != 97) {
                  throw new IllegalStateException();
               }

               var10000 = -1;
            } else {
               var10000 = 1;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bw.av(" + 41);
      }
   }
}
