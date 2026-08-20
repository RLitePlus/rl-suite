import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pt")
public class VarbitComposition extends classVJ implements net.runelite.api.VarbitComposition {
   @ObfuscatedName("ax")
   public final int field5421;
   @ObfuscatedName("af")
   static final int[] field5417 = new int[32];
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   static AbstractArchive field5423;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5422 = 1;
   @ObfuscatedName("ag")
   public final int field5420;
   @ObfuscatedName("as")
   public final int field5419;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ab")
   public static EvictingDualNodeHashTable field5418 = new EvictingDualNodeHashTable(64);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ab")
   public static void method9205(AbstractArchive var0) {
      field5423 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpt;")
   @ObfuscatedName("ac")
   public static VarbitComposition method9208(int var0) {
      VarbitComposition var1 = (VarbitComposition)field5418.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5423.method11867(14, var0, -1917771461);
         var1 = new VarbitComposition(new Buffer(var2));
         field5418.method6428(var1, var0);
         return var1;
      }
   }

   static {
      byte var0 = 2;

      for (int var1 = 0; var1 < 32; var1++) {
         field5417[var1] = var0 - 1;
         var0 += var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   int method9211(int var1) {
      int var2 = field5417[2095283109 * this.field5421 - -526564793 * this.field5419];
      return var1 >> -526564793 * this.field5419 & var2;
   }

   public int getMostSignificantBit() {
      return this.field5421 * 2095283109;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ag")
   public static void method9206(AbstractArchive var0) {
      field5423 = var0;
   }

   public int getLeastSignificantBit() {
      return this.field5419 * -526564793;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("bj")
   static final void method9216(String var0, byte var1) {
      try {
         if (var0.equalsIgnoreCase("toggleroof")) {
            ClientPreferences var10000 = classAB.field122;
            boolean var10001;
            if (!ClientPreferences.method2720(classAB.field122, -1315528093)) {
               if (var1 == 8) {
                  return;
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            var10000.method2721(var10001, 571683163);
            if (ClientPreferences.method2720(classAB.field122, -1315528093)) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               classPH.method8883(99, "", "Roofs are now all hidden", 1608904738);
            } else {
               classPH.method8883(99, "", "Roofs will only be removed selectively", 1571821419);
            }
         }

         if (var0.startsWith("zbuf")) {
            if (var1 == 8) {
               throw new IllegalStateException();
            }

            boolean var14;
            if (classJF.method6360(var0.substring(5).trim(), 156456283) == 1) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               var14 = true;
            } else {
               var14 = false;
            }

            boolean var2 = var14;
            classOE.client.method11100(var2, 1150763619);
            classFH.method4684(var2);
         }

         if (var0.equalsIgnoreCase("z")) {
            if (var1 == 8) {
               return;
            }

            boolean var15;
            if (!client.field899) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               var15 = true;
            } else {
               var15 = false;
            }

            client.field899 = var15;
         }

         if (var0.equalsIgnoreCase("displayfps")) {
            classAB.field122.method2737(-1640349003);
         }

         if (var0.equalsIgnoreCase("renderself")) {
            if (var1 == 8) {
               throw new IllegalStateException();
            }

            boolean var16;
            if (!client.field851) {
               if (var1 == 8) {
                  return;
               }

               var16 = true;
            } else {
               var16 = false;
            }

            client.field851 = var16;
         }

         if (var0.equalsIgnoreCase("mouseovertext")) {
            if (var1 == 8) {
               throw new IllegalStateException();
            }

            boolean var17;
            if (!client.field858) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               var17 = true;
            } else {
               var17 = false;
            }

            client.field858 = var17;
         }

         if (var0.startsWith("setdrawdistance")) {
            if (var1 == 8) {
               return;
            }

            String[] var8 = var0.split(" ");

            try {
               int var3 = Integer.parseInt(var8[1]);
               classAB.field122.method2812(var3, 1311981730);
            } catch (NumberFormatException var6) {
               classPH.method8883(
                  99,
                  "",
                  String.format(
                     "Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s",
                     var8[1]
                  ),
                  1820934249
               );
            }
         }

         if (var0.startsWith("settilerendermode")) {
            if (var1 == 8) {
               return;
            }

            String[] var9 = var0.split(" ");

            try {
               int var13 = Integer.parseInt(var9[1]);
               classIS.field3053.scene.method4254(classEX.method4105()[var13]);
            } catch (NumberFormatException var5) {
               classPH.method8883(
                  99,
                  "",
                  String.format(
                     "Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s",
                     var9[1]
                  ),
                  1170668280
               );
            }
         }

         if (var0.equalsIgnoreCase("getdrawdistance")) {
            classPH.method8883(99, "", String.format("%d", classAB.field122.method2817((byte)0)), 1807902546);
         }

         if (313368463 * client.field911 >= 2) {
            if (var1 == 8) {
               throw new IllegalStateException();
            }

            if (var0.equalsIgnoreCase("errortest")) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException();
            }

            if (var0.equalsIgnoreCase("showcoord")) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               client.field1125.field6701 = !client.field1125.field6701;
            }

            if (var0.equalsIgnoreCase("fpson")) {
               if (var1 == 8) {
                  return;
               }

               classAB.field122.method2743(true, (byte)-100);
            }

            if (var0.equalsIgnoreCase("fpsoff")) {
               if (var1 == 8) {
                  return;
               }

               classAB.field122.method2743(false, (byte)-96);
            }

            if (var0.equalsIgnoreCase("gc")) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               System.gc();
            }

            if (var0.equalsIgnoreCase("clientdrop")) {
               classCN.method2556((byte)-51);
            }

            if (var0.equalsIgnoreCase("clientreload")) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               classAC.method325((byte)11);
            } else if (var0.equalsIgnoreCase("sfx8bit")) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               ClientPreferences.method2829(classAB.field122, true, -22926792);
            } else if (var0.equalsIgnoreCase("sfx16bit")) {
               if (var1 == 8) {
                  return;
               }

               ClientPreferences.method2829(classAB.field122, false, -1649203021);
            } else if (var0.startsWith("playsong ")) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               String var10 = var0.substring("playsong ".length());

               try {
                  if (classMH.method7572((byte)11) == 0) {
                     if (var1 == 8) {
                        throw new IllegalStateException();
                     }

                     classBK.method1118(0, 0, (byte)107);
                  } else {
                     classPD.method8845(var10, classMH.method7572((byte)11), (byte)32);
                  }
               } catch (Exception var4) {
                  classPH.method8883(99, "", "Can't play the midi named " + var10, 1500884789);
               }
            } else if (var0.equalsIgnoreCase("stopsong")) {
               if (var1 == 8) {
                  return;
               }

               classBK.method1118(0, 0, (byte)41);
            }

            if (var0.equalsIgnoreCase("freecam")) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               classUK.method11337(1, -867453667);
            }

            if (var0.startsWith("unlockcam")) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               String[] var11 = var0.split(" ");
               client.field839 = Boolean.parseBoolean(var11[1]);
            }
         }

         PacketBufferNode var12 = classEF.getPacketBufferNode(ClientPacket.CLIENT_CHEAT, client.packetWriter.isaacCipher, (byte)-10);
         if (289984869 * classAAU.field102 >= 240) {
            Buffer.method12971(var12.packetBuffer, var0.length() + 2, (byte)-104);
         } else {
            Buffer.method12971(var12.packetBuffer, var0.length() + 1, (byte)-34);
         }

         Buffer.method12997(var12.packetBuffer, var0, (short)20904);
         if (289984869 * classAAU.field102 >= 240) {
            if (var1 == 8) {
               throw new IllegalStateException();
            }

            Buffer.method12971(var12.packetBuffer, 0, (byte)-59);
         }

         client.packetWriter.addNode(var12, -1301097035);
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "pt.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)I")
   @ObfuscatedName("ae")
   int method9212(int var1, short var2) {
      try {
         int var3 = field5417[2095283109 * this.field5421 - -526564793 * this.field5419];
         return var1 >> -526564793 * this.field5419 & var3;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "pt.ae(" + 41);
      }
   }

   VarbitComposition(Buffer var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      if (var1 != null && null != var1.array) {
         label30:
         while (true) {
            int var5 = Buffer.method13039(var1, -346779531);
            switch (var5) {
               case 0:
                  break label30;
               case 1:
                  var2 = Buffer.method13047(var1, 188196754);
                  var3 = Buffer.method13039(var1, -346779531);
                  var4 = Buffer.method13039(var1, -346779531);
            }
         }
      }

      this.field5420 = 2007085699 * var2;
      this.field5419 = 2081933175 * var3;
      this.field5421 = var4 * 1097004077;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   int method9213(int var1) {
      int var2 = field5417[2095283109 * this.field5421 - -1292603107 * this.field5419];
      return var1 >> 1187990771 * this.field5419 & var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("as")
   public static void method9207(AbstractArchive var0) {
      field5423 = var0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   int method9214(int var1) {
      int var2 = field5417[2095283109 * this.field5421 - -28672466 * this.field5419];
      return var1 >> -526564793 * this.field5419 & var2;
   }

   @ObfuscatedSignature(descriptor = "(I[[[IIIIB)I")
   @ObfuscatedName("ae")
   static int method9210(int var0, int[][][] var1, int var2, int var3, int var4, byte var5) {
      try {
         return var1[var2][SceneTilePaint.field2280[var0] + var3][SceneTilePaint.field2281[var0] + var4];
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "pt.ae(" + 41);
      }
   }

   public int getIndex() {
      return this.field5420 * -1681019861;
   }

   @ObfuscatedSignature(descriptor = "(Lte;III)V")
   @ObfuscatedName("av")
   public static void method9215(classTE var0, int var1, int var2, int var3) {
      try {
         classOL.method8512(var0, 1327640383);
         if (0 != var1) {
            if (var2 >= 0) {
               if (var3 != 1487907647) {
                  throw new IllegalStateException();
               }

               if (var2 < -1943548931 * var0.field6131 && var1 >= 0) {
                  if (var1 + var2 <= -1943548931 * var0.field6131) {
                     if (var2 < -1943548931 * var0.field6131 - var1) {
                        classMX.method7739(var0, var1 + var2, var0, var2, var0.field6131 * -1943548931 - (var1 + var2), -2127307838);
                     }

                     classTE.method10782(var0, -1943548931 * var0.field6131 - var1, (byte)2);
                     var0.field6133 = true;
                     return;
                  }

                  if (var3 != 1487907647) {
                     throw new IllegalStateException();
                  }
               }
            }

            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "pt.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpt;")
   @ObfuscatedName("ax")
   public static VarbitComposition method9209(int var0) {
      VarbitComposition var1 = (VarbitComposition)field5418.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5423.method11867(14, var0, -1934803759);
         var1 = new VarbitComposition(new Buffer(var2));
         field5418.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZI)V")
   @ObfuscatedName("gj")
   static final void method9217(int var0, int var1, boolean var2, int var3) {
      try {
         if (null == client.field866[var0]) {
            if (var3 < 1501863785) {
               ;
            }
         } else {
            if (var1 >= 0) {
               if (var3 >= 1501863785) {
                  throw new IllegalStateException();
               }

               if (var1 < ClanChannel.method6183(client.field866[var0], (byte)-66)) {
                  ClanChannelMember var4 = (ClanChannelMember)client.field866[var0].field2955.get(var1);
                  PacketBufferNode var5 = classEF.getPacketBufferNode(
                     ClientPacket.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL, client.packetWriter.isaacCipher, (byte)60
                  );
                  Buffer.method12971(var5.packetBuffer, 4 + classAU.method712(var4.field2846.method164(1081337898), (byte)102), (byte)-60);
                  Buffer.method12971(var5.packetBuffer, var0, (byte)-78);
                  var5.packetBuffer.method12973(var1, -1542382992);
                  Buffer.method12994(var5.packetBuffer, var2, -1737488759);
                  Buffer.method12997(var5.packetBuffer, var4.field2846.method164(752125537), (short)29816);
                  client.packetWriter.addNode(var5, -1301097035);
                  return;
               }

               if (var3 >= 1501863785) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "pt.gj(" + ')');
      }
   }
}
