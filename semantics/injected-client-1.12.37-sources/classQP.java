import net.runelite.api.events.MenuOptionClicked;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qp")
public class classQP {
   @ObfuscatedSignature(descriptor = "Lqp;")
   @ObfuscatedName("af")
   static final classQP field5582 = new classQP();
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field5583 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   public static final int field5584 = 62;
   @ToRemove(unused = "true")
   @ObfuscatedName("dt")
   static final int field5585 = 128;
   @ObfuscatedSignature(descriptor = "Lqp;")
   @ObfuscatedName("az")
   public static final classQP field5581 = new classQP();
   @ObfuscatedName("ct")
   static String field5586;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;Lfx;)V")
   @ObfuscatedName("kd")
   public static void method9702(Model var0, Model var1) {
      if (var0 == null) {
         var0.method5078(var0);
      }

      if (var1 != null) {
         var0.method5074(var1);

         for (int var2 = 0; var2 < var1.field2419; var2++) {
            var0.field2429[var0.field2419] = var1.field2429[var2] + var0.field2424;
            var0.field2432[var0.field2419] = var1.field2432[var2] + var0.field2424;
            var0.field2433[var0.field2419] = var1.field2433[var2] + var0.field2424;
            var0.field2434[var0.field2419] = var1.field2434[var2];
            var0.field2428[var0.field2419] = var1.field2428[var2];
            var0.field2435[var0.field2419] = var1.field2435[var2];
            if (var0.field2431 != null) {
               var0.field2431[var0.field2419] = var1.field2431 != null ? var1.field2431[var2] : var1.field2420;
            }

            if (var0.field2444 != null && var1.field2444 != null) {
               var0.field2444[var0.field2419] = var1.field2444[var2];
            }

            if (var0.field2437 != null) {
               var0.field2437[var0.field2419] = var1.field2437 != null ? var1.field2437[var2] : -1;
            }

            if (var0.field2436 != null) {
               if (var1.field2436 != null && var1.field2436[var2] != -1) {
                  var0.field2436[var0.field2419] = (byte)(var1.field2436[var2] + var0.field2418);
               } else {
                  var0.field2436[var0.field2419] = -1;
               }
            }

            if (var0.field2438 != null && var1.field2438 != null) {
               var0.field2438[var0.field2419] = var1.field2438[var2];
            }

            var0.field2419++;
         }

         for (int var3 = 0; var3 < var1.field2418; var3++) {
            var0.field2439[var0.field2418] = var1.field2439[var3] + var0.field2424;
            var0.field2440[var0.field2418] = var1.field2440[var3] + var0.field2424;
            var0.field2441[var0.field2418] = var1.field2441[var3] + var0.field2424;
            var0.field2418++;
         }

         for (int var4 = 0; var4 < var1.field2424; var4++) {
            var0.field2427[var0.field2424] = var1.field2427[var4];
            var0.field2430[var0.field2424] = var1.field2430[var4];
            var0.field2426[var0.field2424] = var1.field2426[var4];
            var0.field2424++;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V")
   @ObfuscatedName("ef")
   public static final void method9703(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9, byte var10) {
      rl5 var11 = client.method2249(client.menu, var0, var1, var2, var3, var4, var5, var6, var7);
      boolean var12 = false;
      if (classON.field4993 != null) {
         var12 = classON.field4993.method1366() == var2
            && classON.field4993.method1362() == var3
            && classON.field4993.method1368() == var6
            && classON.field4993.method1369() == var7
            && classON.field4993.method1374() == var0
            && classON.field4993.method1372() == var1
            && classON.field4993.method1373() == var4
            && classON.field4993.method1363() == var5;
      }

      if (var11 == null && var12) {
         int var13;
         if (client.menu.field6797 * -1927903443 < 500) {
            int var10000 = client.menu.field6797 * -1927903443;
            client.menu.field6797 = (client.menu.field6797 * -1927903443 + 1) * 1932681381;
            var13 = var10000;
         } else {
            var13 = 0;
         }

         client.menu.menuIdentifiers[var13] = var2;
         client.menu.field6801[var13] = var3;
         client.menu.field6804[var13] = var6;
         client.menu.field6805[var13] = var7;
         client.menu.field6798[var13] = var0;
         client.menu.field6799[var13] = var1;
         client.menu.menuArguments2[var13] = var4;
         client.menu.menuOpcodes[var13] = var5;
         client.menu.field6807[var13] = false;
         client.menu.subMenus[var13] = null;
         var11 = client.menu.field6809[var13];
         if (var11 == null) {
            var11 = client.menu.field6809[var13] = new rl5(client.menu, var13);
         }

         var11.field5803 = classON.field4993.field617;
      }

      if (var11 == null) {
         if (var8 != -1 || var9 != -1) {
            client.logger
               .warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {} world {}", new Object[]{var6, var7, var2, var3, var0, var1, var5});
         }
      } else {
         client.logger.trace("Menu click op {} targ {} action {} id {} p0 {} p1 {} world {}", new Object[]{var6, var7, var2, var3, var0, var1, var5});
         MenuOptionClicked var36 = new MenuOptionClicked(var11);
         classOE.client.getCallbacks().post(var36);
         if (var11.field5803 != null) {
            try {
               var11.field5803.accept(var11);
            } catch (Exception var34) {
               client.logger.warn("exception in menu callback", var34);
            }
         }

         if (var36.isConsumed()) {
            return;
         }

         var0 = var11.getParam0();
         var1 = var11.getParam1();
         var3 = var11.getIdentifier();
      }

      int var24 = var9;
      int var23 = var8;
      String var22 = var7;
      int var20 = var5;
      int var19 = var4;
      int var18 = var3;
      int var17 = var2;
      int var16 = var1;
      int var15 = var0;
      byte var25 = -44;

      try {
         WorldView var26 = client.field814.method1590(var20, (short)-10131);
         if (var26 != null) {
            int var27 = -1444178379 * var26.field1709;
            int var28 = -351145363 * var26.field1708;
            IndexedObjectSet var29 = var26.field1698;
            IndexedObjectSet var30 = var26.field1694;
            if (var17 >= 2000) {
               if (var25 >= 1) {
                  return;
               }

               var17 -= 2000;
            }

            classIK.method6221(var15, var16, var17, var18, var23, var24, var27, var28, -1377982978);
            if (var17 == 14) {
               Player var31 = (Player)var30.method13404(var18);
               if (null != var31) {
                  client.field957 = -727473855 * var23;
                  client.field958 = 527203475 * var24;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = -1254957895 * var15;
                  client.field834 = -877699493 * var16;
                  PacketBufferNode var32 = classEF.getPacketBufferNode(ClientPacket.OPPLAYERU, client.packetWriter.isaacCipher, (byte)-111);
                  Buffer.method13180(var32.packetBuffer, -1146573313 * classIR.field3051, (byte)-51);
                  var32.packetBuffer.method13238(classJC.field3137 * -896172231, -796948523);
                  PacketBuffer var94 = var32.packetBuffer;
                  byte var10001;
                  if (classFA.method4540(client.field931, 82, 242848078)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  Buffer.method12971(var94, var10001, (byte)-32);
                  var32.packetBuffer.method13188(1622907325 * classIJ.field2981, (short)-15818);
                  var32.packetBuffer.method13188(var18, (short)-30940);
                  client.packetWriter.addNode(var32, -1301097035);
               }
            }

            if (64 == var17) {
               if (var25 >= 1) {
                  return;
               }

               client.field957 = var23 * -727473855;
               client.field958 = 527203475 * var24;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var15;
               client.field834 = var16 * -877699493;
               PacketBufferNode var37 = classEF.getPacketBufferNode(ClientPacket.OPWORLDENTITY2, client.packetWriter.isaacCipher, (byte)-17);
               PacketBuffer var95 = var37.packetBuffer;
               byte var113;
               if (classFA.method4540(client.field931, 82, 1374077670)) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  var113 = 1;
               } else {
                  var113 = 0;
               }

               var95.method13151(var113, -1910538783);
               var37.packetBuffer.method12973(var18, -1542382992);
               client.packetWriter.addNode(var37, -1301097035);
            }

            if (29 == var17) {
               PacketBufferNode var38 = classEF.getPacketBufferNode(ClientPacket.IF_BUTTON, client.packetWriter.isaacCipher, (byte)-114);
               var38.packetBuffer.method12979(var16, 1087780475);
               client.packetWriter.addNode(var38, -1301097035);
               Widget var70 = classLY.method7375(classWK.field6691, var16, (byte)90);
               if (null != var70) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (null != var70.field4399) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (5 == var70.field4399[0][0]) {
                        if (var25 >= 1) {
                           throw new IllegalStateException();
                        }

                        int var33 = var70.field4399[0][1];
                        if (var70.field4401[0] != classLB.field4090[var33]) {
                           if (var25 >= 1) {
                              throw new IllegalStateException();
                           }

                           classLB.field4090[var33] = var70.field4401[0];
                           client.method2139(var33);
                           classXQ.method12876(var33, -1566261717);
                        }
                     }
                  }
               }
            }

            label967: {
               if (1008 != var17) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (1009 != var17) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (1010 != var17) {
                        if (var25 >= 1) {
                           return;
                        }

                        if (var17 != 1011) {
                           if (1012 != var17) {
                              break label967;
                           }

                           if (var25 >= 1) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }
               }

               WorldMap.method12580(client.field1125, var17, var18, new classKY(var15), new classKY(var16), 1153408874);
            }

            if (30 == var17) {
               if (var25 >= 1) {
                  return;
               }

               if (classVV.method12158(classWK.field6691, (byte)97)) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  classUL.method11401(var16, var15, 1283248075);
                  classVV.method12163(classWK.field6691, classLY.method7378(classWK.field6691, var16, var15, (byte)23), 103438946);
               }
            }

            if (17 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               client.field957 = var23 * -727473855;
               client.field958 = 527203475 * var24;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var15;
               client.field834 = -877699493 * var16;
               PacketBufferNode var39 = classEF.getPacketBufferNode(ClientPacket.OPOBJT, client.packetWriter.isaacCipher, (byte)-4);
               var39.packetBuffer.method12973(var27 + var15, -1542382992);
               var39.packetBuffer.method12979(565061963 * classBQ.field529, -494359999);
               PacketBuffer var96 = var39.packetBuffer;
               byte var114;
               if (classFA.method4540(client.field931, 82, 1862151082)) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  var114 = 1;
               } else {
                  var114 = 0;
               }

               var96.method13156(var114, (byte)-3);
               Buffer.method13180(var39.packetBuffer, 1333668003 * client.field980, (byte)16);
               var39.packetBuffer.method13188(var28 + var16, (short)-31202);
               var39.packetBuffer.method13188(var18, (short)-28864);
               var39.packetBuffer.method12973(-2095241843 * client.field981, -1542382992);
               client.packetWriter.addNode(var39, -1301097035);
            }

            if (65 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               client.field957 = -727473855 * var23;
               client.field958 = 527203475 * var24;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var15;
               client.field834 = var16 * -877699493;
               PacketBufferNode var40 = classEF.getPacketBufferNode(ClientPacket.OPWORLDENTITY3, client.packetWriter.isaacCipher, (byte)-79);
               var40.packetBuffer.method12973(var18, -1542382992);
               PacketBuffer var97 = var40.packetBuffer;
               byte var115;
               if (classFA.method4540(client.field931, 82, 759805406)) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  var115 = 1;
               } else {
                  var115 = 0;
               }

               Buffer.method12971(var97, var115, (byte)-114);
               client.packetWriter.addNode(var40, -1301097035);
            }

            if (58 == var17) {
               Widget var41 = classLY.method7378(classWK.field6691, var16, var15, (byte)-43);
               if (var41 != null) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (null != var41.field4254) {
                     if (var25 >= 1) {
                        return;
                     }

                     ScriptEvent var71 = classZS.method14182(
                        classUQ.method11465(var41, 231327867)
                           .method14145(var41.field4254, (byte)2)
                           .method14156(var18, -1579394610)
                           .method14165(var22, (byte)123),
                        (byte)31
                     );
                     classSZ.method10729(var71, -1922641172);
                  }

                  PacketBufferNode var72 = classEF.getPacketBufferNode(ClientPacket.IF_BUTTONT, client.packetWriter.isaacCipher, (byte)25);
                  Buffer.method13180(var72.packetBuffer, client.field981 * -2095241843, (byte)-20);
                  var72.packetBuffer.method12979(565061963 * classBQ.field529, -160696217);
                  var72.packetBuffer.method13188(var15, (short)-4924);
                  Buffer.method13186(var72.packetBuffer, var19, (byte)16);
                  var72.packetBuffer.method13188(1333668003 * client.field980, (short)-4123);
                  var72.packetBuffer.method13238(var16, 575053526);
                  client.packetWriter.addNode(var72, -1301097035);
               }
            }

            if (47 == var17) {
               Player var42 = (Player)var30.method13404(var18);
               if (var42 != null) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.field957 = var23 * -727473855;
                  client.field958 = 527203475 * var24;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = -1254957895 * var15;
                  client.field834 = var16 * -877699493;
                  PacketBufferNode var73 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER4, client.packetWriter.isaacCipher, (byte)-7);
                  var73.packetBuffer.method13156(classFA.method4540(client.field931, 82, 296540644) ? 1 : 0, (byte)76);
                  var73.packetBuffer.method12973(var18, -1542382992);
                  client.packetWriter.addNode(var73, -1301097035);
               }
            }

            classSW.method10700(var29, var15, var16, var17, var18, var23, var24, (short)20431);
            if (23 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               if (client.field973) {
                  Scene.method4330(var26.scene);
               } else {
                  var26.scene.method4324(true);
               }
            }

            if (67 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               client.field957 = -727473855 * var23;
               client.field958 = 527203475 * var24;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var15;
               client.field834 = -877699493 * var16;
               PacketBufferNode var43 = classEF.getPacketBufferNode(ClientPacket.OPWORLDENTITY5, client.packetWriter.isaacCipher, (byte)-41);
               PacketBuffer var98 = var43.packetBuffer;
               byte var116;
               if (classFA.method4540(client.field931, 82, 1522204832)) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  var116 = 1;
               } else {
                  var116 = 0;
               }

               var98.method13151(var116, -1910538783);
               var43.packetBuffer.method13188(var18, (short)-20818);
               client.packetWriter.addNode(var43, -1301097035);
            }

            if (var17 == 1004) {
               client.field957 = var23 * -727473855;
               client.field958 = 527203475 * var24;
               client.field863 = -921463806;
               client.field969 = 0;
               PacketBufferNode var44 = classEF.getPacketBufferNode(ClientPacket.OPOBJ6, client.packetWriter.isaacCipher, (byte)44);
               Buffer.method13180(var44.packetBuffer, var18, (byte)-77);
               var44.packetBuffer.method13188(var28 + var16, (short)-775);
               var44.packetBuffer.method12973(var15 + var27, -1542382992);
               client.packetWriter.addNode(var44, -1301097035);
            }

            if (var17 == 66) {
               if (var25 >= 1) {
                  return;
               }

               client.field957 = -727473855 * var23;
               client.field958 = 527203475 * var24;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var15;
               client.field834 = -877699493 * var16;
               PacketBufferNode var45 = classEF.getPacketBufferNode(ClientPacket.OPWORLDENTITY4, client.packetWriter.isaacCipher, (byte)13);
               var45.packetBuffer.method12973(var18, -1542382992);
               var45.packetBuffer.method13153(classFA.method4540(client.field931, 82, -39520575) ? 1 : 0, (byte)-38);
               client.packetWriter.addNode(var45, -1301097035);
            }

            if (var17 == 51) {
               Player var46 = (Player)var30.method13404(var18);
               if (null != var46) {
                  if (var25 >= 1) {
                     return;
                  }

                  client.field957 = -727473855 * var23;
                  client.field958 = 527203475 * var24;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = -1254957895 * var15;
                  client.field834 = var16 * -877699493;
                  PacketBufferNode var74 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER8, client.packetWriter.isaacCipher, (byte)-56);
                  Buffer.method13186(var74.packetBuffer, var18, (byte)16);
                  PacketBuffer var99 = var74.packetBuffer;
                  byte var117;
                  if (classFA.method4540(client.field931, 82, 1970356523)) {
                     if (var25 >= 1) {
                        return;
                     }

                     var117 = 1;
                  } else {
                     var117 = 0;
                  }

                  Buffer.method12971(var99, var117, (byte)-43);
                  client.packetWriter.addNode(var74, -1301097035);
               }
            }

            label915: {
               if (var17 != 57) {
                  if (1007 != var17) {
                     break label915;
                  }

                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }
               }

               Widget var47 = classLY.method7378(classWK.field6691, var16, var15, (byte)-84);
               if (null != var47) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  classEA.method3799(var18, var16, var15, var19, var22, -972851303);
               }
            }

            if (45 == var17) {
               Player var48 = (Player)var30.method13404(var18);
               if (var48 != null) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.field957 = -727473855 * var23;
                  client.field958 = var24 * 527203475;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = -1254957895 * var15;
                  client.field834 = var16 * -877699493;
                  PacketBufferNode var75 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER2, client.packetWriter.isaacCipher, (byte)8);
                  PacketBuffer var100 = var75.packetBuffer;
                  byte var118;
                  if (classFA.method4540(client.field931, 82, 1426972542)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var118 = 1;
                  } else {
                     var118 = 0;
                  }

                  var100.method13156(var118, (byte)-63);
                  Buffer.method13180(var75.packetBuffer, var18, (byte)-94);
                  client.packetWriter.addNode(var75, -1301097035);
               }
            }

            if (var17 == 16) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               client.field957 = -727473855 * var23;
               client.field958 = 527203475 * var24;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var15;
               client.field834 = var16 * -877699493;
               PacketBufferNode var49 = classEF.getPacketBufferNode(ClientPacket.OPOBJU, client.packetWriter.isaacCipher, (byte)33);
               var49.packetBuffer.method13188(classIJ.field2981 * 1622907325, (short)-32490);
               PacketBuffer var101 = var49.packetBuffer;
               byte var119;
               if (classFA.method4540(client.field931, 82, 199613861)) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  var119 = 1;
               } else {
                  var119 = 0;
               }

               Buffer.method12971(var101, var119, (byte)-39);
               Buffer.method13180(var49.packetBuffer, var18, (byte)28);
               Buffer.method13180(var49.packetBuffer, -1146573313 * classIR.field3051, (byte)-95);
               var49.packetBuffer.method12973(var16 + var28, -1542382992);
               Buffer.method13235(var49.packetBuffer, classJC.field3137 * -896172231, -1568292528);
               Buffer.method13186(var49.packetBuffer, var15 + var27, (byte)16);
               client.packetWriter.addNode(var49, -1301097035);
            }

            if (var17 == 24) {
               if (var25 >= 1) {
                  return;
               }

               Widget var50 = classLY.method7375(classWK.field6691, var16, (byte)80);
               if (var50 != null) {
                  if (var25 >= 1) {
                     return;
                  }

                  boolean var76 = true;
                  if (var50.field4334 * -90794217 > 0) {
                     var76 = classCR.method2575(var50, 843325427);
                  }

                  if (var76) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     PacketBufferNode var90 = classEF.getPacketBufferNode(ClientPacket.IF_BUTTON, client.packetWriter.isaacCipher, (byte)38);
                     var90.packetBuffer.method12979(var16, 2049446130);
                     client.packetWriter.addNode(var90, -1301097035);
                  }
               }
            }

            if (var17 == 61) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               WorldEntity var51 = (WorldEntity)var26.worldEntities.method13595(var18);
               if (null != var51) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.field957 = -727473855 * var23;
                  client.field958 = 527203475 * var24;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = var15 * -1254957895;
                  client.field834 = var16 * -877699493;
                  PacketBufferNode var77 = classEF.getPacketBufferNode(ClientPacket.OPWORLDENTITYU, client.packetWriter.isaacCipher, (byte)-39);
                  var77.packetBuffer.method13188(classIJ.field2981 * 1622907325, (short)-3128);
                  var77.packetBuffer.method12979(-896172231 * classJC.field3137, 267871357);
                  var77.packetBuffer.method13188(var18, (short)-3335);
                  Buffer.method13180(var77.packetBuffer, -1146573313 * classIR.field3051, (byte)6);
                  PacketBuffer var102 = var77.packetBuffer;
                  byte var120;
                  if (classFA.method4540(client.field931, 82, 1492528283)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var120 = 1;
                  } else {
                     var120 = 0;
                  }

                  var102.method13151(var120, -1910538783);
                  client.packetWriter.addNode(var77, -1301097035);
               }
            }

            if (8 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               NPC var52 = (NPC)var29.method13404(var18);
               if (var52 != null) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.field957 = var23 * -727473855;
                  client.field958 = 527203475 * var24;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = var15 * -1254957895;
                  client.field834 = -877699493 * var16;
                  PacketBufferNode var78 = classEF.getPacketBufferNode(ClientPacket.OPNPCT, client.packetWriter.isaacCipher, (byte)19);
                  PacketBuffer var103 = var78.packetBuffer;
                  byte var121;
                  if (classFA.method4540(client.field931, 82, 674415717)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var121 = 1;
                  } else {
                     var121 = 0;
                  }

                  var103.method13156(var121, (byte)-60);
                  var78.packetBuffer.method13232(565061963 * classBQ.field529, 730941790);
                  var78.packetBuffer.method12973(client.field980 * 1333668003, -1542382992);
                  var78.packetBuffer.method13188(-2095241843 * client.field981, (short)-10174);
                  Buffer.method13186(var78.packetBuffer, var18, (byte)16);
                  client.packetWriter.addNode(var78, -1301097035);
               }
            }

            if (var17 == 48) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               Player var53 = (Player)var30.method13404(var18);
               if (var53 != null) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.field957 = var23 * -727473855;
                  client.field958 = var24 * 527203475;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = var15 * -1254957895;
                  client.field834 = -877699493 * var16;
                  PacketBufferNode var79 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER5, client.packetWriter.isaacCipher, (byte)-23);
                  Buffer.method13186(var79.packetBuffer, var18, (byte)16);
                  PacketBuffer var104 = var79.packetBuffer;
                  byte var122;
                  if (classFA.method4540(client.field931, 82, 1665183896)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var122 = 1;
                  } else {
                     var122 = 0;
                  }

                  var104.method13151(var122, -1910538783);
                  client.packetWriter.addNode(var79, -1301097035);
               }
            }

            if (var17 == 49) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               Player var54 = (Player)var30.method13404(var18);
               if (var54 != null) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.field957 = var23 * -727473855;
                  client.field958 = var24 * 527203475;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = -1254957895 * var15;
                  client.field834 = -877699493 * var16;
                  PacketBufferNode var80 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER6, client.packetWriter.isaacCipher, (byte)-80);
                  PacketBuffer var105 = var80.packetBuffer;
                  byte var123;
                  if (classFA.method4540(client.field931, 82, -5943396)) {
                     if (var25 >= 1) {
                        return;
                     }

                     var123 = 1;
                  } else {
                     var123 = 0;
                  }

                  var105.method13151(var123, -1910538783);
                  Buffer.method13180(var80.packetBuffer, var18, (byte)-75);
                  client.packetWriter.addNode(var80, -1301097035);
               }
            }

            if (1013 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               client.field957 = -727473855 * var23;
               client.field958 = 527203475 * var24;
               client.field863 = -921463806;
               client.field969 = 0;
               PacketBufferNode var55 = classEF.getPacketBufferNode(ClientPacket.OPWORLDENTITY6, client.packetWriter.isaacCipher, (byte)39);
               Buffer.method13186(var55.packetBuffer, var18, (byte)16);
               client.packetWriter.addNode(var55, -1301097035);
            }

            if (var17 == 26) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               classTB.method10737((byte)24);
            }

            classHU.method6119(var15, var16, var17, var18, var23, var24, var27, var28, 492469016);
            if (var17 == 1) {
               if (var25 >= 1) {
                  return;
               }

               client.field957 = var23 * -727473855;
               client.field958 = var24 * 527203475;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = var15 * -1254957895;
               client.field834 = var16 * -877699493;
               PacketBufferNode var56 = classEF.getPacketBufferNode(ClientPacket.OPLOCU, client.packetWriter.isaacCipher, (byte)-65);
               var56.packetBuffer.method12973(-1146573313 * classIR.field3051, -1542382992);
               Buffer.method13180(var56.packetBuffer, 1622907325 * classIJ.field2981, (byte)14);
               Buffer.method13180(var56.packetBuffer, var18, (byte)72);
               Buffer.method13180(var56.packetBuffer, var16 + var28, (byte)-20);
               var56.packetBuffer.method13188(var27 + var15, (short)-12085);
               PacketBuffer var106 = var56.packetBuffer;
               byte var124;
               if (classFA.method4540(client.field931, 82, 1247531604)) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  var124 = 1;
               } else {
                  var124 = 0;
               }

               var106.method13151(var124, -1910538783);
               var56.packetBuffer.method13232(classJC.field3137 * -896172231, 730941790);
               client.packetWriter.addNode(var56, -1301097035);
            }

            if (var17 == 15) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               Player var57 = (Player)var30.method13404(var18);
               if (null != var57) {
                  client.field957 = var23 * -727473855;
                  client.field958 = var24 * 527203475;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = -1254957895 * var15;
                  client.field834 = var16 * -877699493;
                  PacketBufferNode var81 = classEF.getPacketBufferNode(ClientPacket.OPPLAYERT, client.packetWriter.isaacCipher, (byte)-29);
                  PacketBuffer var107 = var81.packetBuffer;
                  byte var125;
                  if (classFA.method4540(client.field931, 82, 569211504)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var125 = 1;
                  } else {
                     var125 = 0;
                  }

                  var107.method13153(var125, (byte)66);
                  Buffer.method13180(var81.packetBuffer, 1333668003 * client.field980, (byte)-54);
                  Buffer.method13235(var81.packetBuffer, classBQ.field529 * 565061963, -2018262788);
                  Buffer.method13180(var81.packetBuffer, -2095241843 * client.field981, (byte)10);
                  var81.packetBuffer.method13188(var18, (short)-3666);
                  client.packetWriter.addNode(var81, -1301097035);
               }
            }

            if (var17 == 1002) {
               client.field957 = -727473855 * var23;
               client.field958 = var24 * 527203475;
               client.field863 = -921463806;
               client.field969 = 0;
               PacketBufferNode var58 = classEF.getPacketBufferNode(ClientPacket.OPLOC6, client.packetWriter.isaacCipher, (byte)-16);
               Buffer.method13180(var58.packetBuffer, var18, (byte)9);
               client.packetWriter.addNode(var58, -1301097035);
            }

            if (var17 == 44) {
               Player var59 = (Player)var30.method13404(var18);
               if (null != var59) {
                  if (var25 >= 1) {
                     return;
                  }

                  client.field957 = -727473855 * var23;
                  client.field958 = var24 * 527203475;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = var15 * -1254957895;
                  client.field834 = -877699493 * var16;
                  PacketBufferNode var82 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER1, client.packetWriter.isaacCipher, (byte)25);
                  PacketBuffer var108 = var82.packetBuffer;
                  byte var126;
                  if (classFA.method4540(client.field931, 82, 124726501)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var126 = 1;
                  } else {
                     var126 = 0;
                  }

                  var108.method13153(var126, (byte)32);
                  var82.packetBuffer.method12973(var18, -1542382992);
                  client.packetWriter.addNode(var82, -1301097035);
               }
            }

            if (63 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               client.field957 = -727473855 * var23;
               client.field958 = var24 * 527203475;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var15;
               client.field834 = -877699493 * var16;
               PacketBufferNode var60 = classEF.getPacketBufferNode(ClientPacket.OPWORLDENTITY1, client.packetWriter.isaacCipher, (byte)30);
               var60.packetBuffer.method12973(var18, -1542382992);
               PacketBuffer var109 = var60.packetBuffer;
               byte var127;
               if (classFA.method4540(client.field931, 82, 896480903)) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  var127 = 1;
               } else {
                  var127 = 0;
               }

               var109.method13153(var127, (byte)13);
               client.packetWriter.addNode(var60, -1301097035);
            }

            if (var17 == 7) {
               NPC var61 = (NPC)var29.method13404(var18);
               if (var61 != null) {
                  client.field957 = var23 * -727473855;
                  client.field958 = 527203475 * var24;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = var15 * -1254957895;
                  client.field834 = -877699493 * var16;
                  PacketBufferNode var83 = classEF.getPacketBufferNode(ClientPacket.OPNPCU, client.packetWriter.isaacCipher, (byte)-57);
                  Buffer.method13180(var83.packetBuffer, classIR.field3051 * -1146573313, (byte)68);
                  PacketBuffer var110 = var83.packetBuffer;
                  byte var128;
                  if (classFA.method4540(client.field931, 82, 356725132)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var128 = 1;
                  } else {
                     var128 = 0;
                  }

                  var110.method13153(var128, (byte)6);
                  Buffer.method13180(var83.packetBuffer, var18, (byte)-115);
                  Buffer.method13186(var83.packetBuffer, classIJ.field2981 * 1622907325, (byte)16);
                  var83.packetBuffer.method12979(-896172231 * classJC.field3137, 915138276);
                  client.packetWriter.addNode(var83, -1301097035);
               }
            }

            if (50 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               Player var62 = (Player)var30.method13404(var18);
               if (null != var62) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.field957 = -727473855 * var23;
                  client.field958 = var24 * 527203475;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = var15 * -1254957895;
                  client.field834 = var16 * -877699493;
                  PacketBufferNode var84 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER7, client.packetWriter.isaacCipher, (byte)-95);
                  PacketBuffer var111 = var84.packetBuffer;
                  byte var129;
                  if (classFA.method4540(client.field931, 82, 314659735)) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var129 = 1;
                  } else {
                     var129 = 0;
                  }

                  var111.method13151(var129, -1910538783);
                  Buffer.method13180(var84.packetBuffer, var18, (byte)74);
                  client.packetWriter.addNode(var84, -1301097035);
               }
            }

            if (2 == var17) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               client.field957 = var23 * -727473855;
               client.field958 = var24 * 527203475;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var15;
               client.field834 = var16 * -877699493;
               PacketBufferNode var63 = classEF.getPacketBufferNode(ClientPacket.OPLOCT, client.packetWriter.isaacCipher, (byte)-6);
               var63.packetBuffer.method13151(classFA.method4540(client.field931, 82, 1740903576) ? 1 : 0, -1910538783);
               var63.packetBuffer.method12973(var15 + var27, -1542382992);
               var63.packetBuffer.method12973(var18, -1542382992);
               var63.packetBuffer.method12979(565061963 * classBQ.field529, 344499625);
               Buffer.method13180(var63.packetBuffer, 1333668003 * client.field980, (byte)-36);
               Buffer.method13180(var63.packetBuffer, var28 + var16, (byte)13);
               Buffer.method13186(var63.packetBuffer, client.field981 * -2095241843, (byte)16);
               client.packetWriter.addNode(var63, -1301097035);
            }

            if (var17 == 62) {
               if (var25 >= 1) {
                  return;
               }

               WorldEntity var64 = (WorldEntity)var26.worldEntities.method13595(var18);
               if (null != var64) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.field957 = var23 * -727473855;
                  client.field958 = 527203475 * var24;
                  client.field863 = -921463806;
                  client.field969 = 0;
                  client.field859 = -1254957895 * var15;
                  client.field834 = var16 * -877699493;
                  PacketBufferNode var85 = classEF.getPacketBufferNode(ClientPacket.OPWORLDENTITYT, client.packetWriter.isaacCipher, (byte)-38);
                  var85.packetBuffer.method13188(var18, (short)-19224);
                  Buffer.method13186(var85.packetBuffer, 1333668003 * client.field980, (byte)16);
                  var85.packetBuffer.method12973(client.field981 * -2095241843, -1542382992);
                  var85.packetBuffer.method12979(565061963 * classBQ.field529, 1212251348);
                  var85.packetBuffer.method13156(classFA.method4540(client.field931, 82, 393261184) ? 1 : 0, (byte)-38);
                  client.packetWriter.addNode(var85, -1301097035);
               }
            }

            if (60 == var17) {
               if (var25 >= 1) {
                  return;
               }

               client.field957 = -727473855 * var23;
               client.field958 = var24 * 527203475;
               client.field863 = 1686751745;
               client.field969 = 0;
               client.field988 = var18 * -2024696235;
               client.field838 = 945732806;
               PacketBufferNode var65 = classEF.getPacketBufferNode(ClientPacket.SET_HEADING, client.packetWriter.isaacCipher, (byte)-29);
               var65.packetBuffer.method13151(var18, -1910538783);
               client.packetWriter.addNode(var65, -1301097035);
            }

            if (var17 == 1003) {
               client.field957 = -727473855 * var23;
               client.field958 = var24 * 527203475;
               client.field863 = -921463806;
               client.field969 = 0;
               NPC var66 = (NPC)var29.method13404(var18);
               if (null != var66) {
                  if (var25 >= 1) {
                     return;
                  }

                  classPL var86 = var66.definition;
                  if (var86.field5325 != null) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     var86 = var86.method8955(652890385);
                  }

                  if (null != var86) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     PacketBufferNode var91 = classEF.getPacketBufferNode(ClientPacket.OPNPC6, client.packetWriter.isaacCipher, (byte)79);
                     Buffer.method13186(var91.packetBuffer, 283969983 * var86.field5302, (byte)16);
                     client.packetWriter.addNode(var91, -1301097035);
                  }
               }
            }

            if (var17 == 25) {
               if (var25 >= 1) {
                  throw new IllegalStateException();
               }

               Widget var67 = classLY.method7378(classWK.field6691, var16, var15, (byte)-101);
               if (null != var67) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  ClanChannel.method6193((byte)-76);
                  String var87 = classVV.method12125(classWK.field6691, var67, (byte)-103);
                  if (null == var87) {
                     var87 = classKK.field3615;
                  }

                  String var92;
                  if (var67.field4275) {
                     if (var25 >= 1) {
                        return;
                     }

                     var92 = var67.field4309 + classQY.method9847(16777215, (byte)76);
                  } else {
                     var92 = classQY.method9847(65280, (byte)49) + var67.field4317 + classQY.method9847(16777215, (byte)17);
                  }

                  classBQ.method1178(
                     var16, var15, classCK.method1575(classWK.field6691.method12173(var67, (byte)0), -2122575561), var19, var87, var92, -2085845878
                  );
                  client.field945 = 0;
               }
            } else {
               if (28 == var17) {
                  PacketBufferNode var68 = classEF.getPacketBufferNode(ClientPacket.IF_BUTTON, client.packetWriter.isaacCipher, (byte)-26);
                  var68.packetBuffer.method12979(var16, 105861394);
                  client.packetWriter.addNode(var68, -1301097035);
                  Widget var88 = classLY.method7375(classWK.field6691, var16, (byte)100);
                  if (var88 != null && var88.field4399 != null) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (5 == var88.field4399[0][0]) {
                        if (var25 >= 1) {
                           throw new IllegalStateException();
                        }

                        int var93 = var88.field4399[0][1];
                        classLB.field4090[var93] = 1 - classLB.field4090[var93];
                        client.method2139(var93);
                        classXQ.method12876(var93, 1045365826);
                     }
                  }
               }

               if (var17 == 46) {
                  if (var25 >= 1) {
                     return;
                  }

                  Player var69 = (Player)var30.method13404(var18);
                  if (null != var69) {
                     if (var25 >= 1) {
                        throw new IllegalStateException();
                     }

                     client.field957 = -727473855 * var23;
                     client.field958 = var24 * 527203475;
                     client.field863 = -921463806;
                     client.field969 = 0;
                     client.field859 = var15 * -1254957895;
                     client.field834 = -877699493 * var16;
                     PacketBufferNode var89 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER3, client.packetWriter.isaacCipher, (byte)-92);
                     Buffer.method13186(var89.packetBuffer, var18, (byte)16);
                     PacketBuffer var112 = var89.packetBuffer;
                     byte var130;
                     if (classFA.method4540(client.field931, 82, 477111082)) {
                        if (var25 >= 1) {
                           throw new IllegalStateException();
                        }

                        var130 = 1;
                     } else {
                        var130 = 0;
                     }

                     var112.method13151(var130, -1910538783);
                     client.packetWriter.addNode(var89, -1301097035);
                  }
               }

               if (client.field945 * -512792823 != 0) {
                  if (var25 >= 1) {
                     return;
                  }

                  client.field945 = 0;
               }

               if (client.field979) {
                  if (var25 >= 1) {
                     throw new IllegalStateException();
                  }

                  ClanChannel.method6193((byte)-110);
               }
            }
         }
      } catch (RuntimeException var35) {
         throw classEG.newRunException(var35, "qp.ef(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpg;)I")
   @ObfuscatedName("ge")
   public static int method9700(classPG var0) {
      if (var0 == null) {
         var0.method8872();
      }

      return null != var0.field5242 ? var0.field5242.length : 0;
   }

   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;IIB)I")
   @ObfuscatedName("ae")
   public static int method9699(classTE var0, Object var1, int var2, int var3, byte var4) {
      try {
         if (var2 < 0) {
            if (var4 != 0) {
               throw new IllegalStateException();
            }

            var2 = 0;
         }

         label114: {
            if (var3 >= 0) {
               if (var4 != 0) {
                  throw new IllegalStateException();
               }

               if (var3 <= var0.method10756(-43506899)) {
                  break label114;
               }

               if (var4 != 0) {
                  throw new IllegalStateException();
               }
            }

            var3 = var0.method10756(-621874871);
         }

         if (classYY.field7111 == var0.field6128) {
            if (var4 != 0) {
               throw new IllegalStateException();
            }

            int[] var5 = var0.method10748(1010647549);
            int var6 = (Integer)var1;

            for (int var7 = var3 - 1; var7 >= var2; var7--) {
               if (var4 != 0) {
                  throw new IllegalStateException();
               }

               if (var6 == var5[var7]) {
                  if (var4 != 0) {
                     throw new IllegalStateException();
                  }

                  return var7;
               }
            }
         } else if (classYY.field7115 == var0.field6128) {
            if (var4 != 0) {
               throw new IllegalStateException();
            }

            long[] var10 = var0.method10750(-1712873289);
            long var12 = (Long)var1;

            for (int var8 = var3 - 1; var8 >= var2; var8--) {
               if (var4 != 0) {
                  throw new IllegalStateException();
               }

               if (var12 == var10[var8]) {
                  if (var4 != 0) {
                     throw new IllegalStateException();
                  }

                  return var8;
               }
            }
         } else {
            Object[] var11 = classTE.method10753(var0, 1530373053);
            int var13 = var3 - 1;

            while (var13 >= var2) {
               if (var1 != var11[var13]) {
                  if (var4 != 0) {
                     throw new IllegalStateException();
                  }

                  if (null == var11[var13] || !var11[var13].equals(var1)) {
                     var13--;
                     continue;
                  }
               }

               return var13;
            }
         }

         return -1;
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "qp.ae(" + 41);
      }
   }

   classQP() {
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("az")
   static final boolean method9701(int var0, int var1) {
      try {
         if (14 != var0) {
            if (var1 == -1383766378) {
               throw new IllegalStateException();
            }

            if (15 != var0) {
               if (var1 == -1383766378) {
                  throw new IllegalStateException();
               }

               if (var0 >= 44) {
                  if (var1 == -1383766378) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 51) {
                     if (var1 == -1383766378) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }

               return false;
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qp.az(" + ')');
      }
   }
}
