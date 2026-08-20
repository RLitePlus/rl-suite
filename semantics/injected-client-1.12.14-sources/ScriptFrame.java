import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bt")
public class ScriptFrame {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field353 = 16;
   @ObfuscatedSignature(descriptor = "Lwq;")
   @ObfuscatedName("he")
   static classWQ field358;
   @ObfuscatedSignature(descriptor = "Lcu;")
   @ObfuscatedName("av")
   Script script;
   @ObfuscatedName("at")
   int pc = -1406577675;
   @ObfuscatedName("ag")
   int[] intLocals;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field352 = 18;
   @ObfuscatedName("lr")
   static int cameraY;
   @ObfuscatedName("an")
   Object[] stringLocals;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field354 = 1076101504;
   @ObfuscatedName("le")
   static int field355;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public static void method1173(int var0) {
      try {
         NPCComposition.NpcDefinition_cached.clear();
         NPCComposition.NpcDefinition_cachedModels.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bt.at(" + ')');
      }
   }

   ScriptFrame() {
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("bn")
   static int method1176(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 == 5000) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 286094873 * client.publicChatMode;
               return 1;
            }
         } else if (var0 == 5001) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               client.publicChatMode = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -870349271;
               ClientPacket.privateChatMode = class461.method9279(Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize], (byte)13);
               if (null == ClientPacket.privateChatMode) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  ClientPacket.privateChatMode = PrivateChatMode.field6653;
               }

               client.tradeChatMode = Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize] * 1569742059;
               PacketBufferNode var22 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3906, client.packetWriter.isaacCipher, -2027400978);
               var22.packetBuffer.writeByte(client.publicChatMode * 286094873, (short)-28041);
               var22.packetBuffer.writeByte(ClientPacket.privateChatMode.field6650 * -1408231813, (short)217);
               var22.packetBuffer.writeByte(-1546032189 * client.tradeChatMode, (short)-6881);
               PacketWriter.method3330(client.packetWriter, var22, -1771370198);
               return 1;
            }
         } else if (5002 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               String var21 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               class408.Interpreter_intStackSize -= 708726074;
               int var29 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var34 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               PacketBufferNode var36 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3938, client.packetWriter.isaacCipher, -1726811434);
               var36.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var21, 922819824) + 2, (short)-140);
               var36.packetBuffer.writeStringCp1252NullTerminated(var21, 998990159);
               var36.packetBuffer.writeByte(var29 - 1, (short)-28642);
               var36.packetBuffer.writeByte(var34, (short)-2340);
               PacketWriter.method3330(client.packetWriter, var36, -1771370198);
               return 1;
            }
         } else if (var0 == 5003) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var20 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var28 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               Message var33 = class70.Messages_getByChannelAndID(var20, var28, (byte)1);
               if (var33 != null) {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33.count * 380472083;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33.cycle * 1755101527;
                  Object[] var47 = Interpreter.Interpreter_objectStack;
                  int var61 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var75;
                  if (var33.sender != null) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var75 = var33.sender;
                  } else {
                     var75 = "";
                  }

                  var47[var61] = var75;
                  var47 = Interpreter.Interpreter_objectStack;
                  var61 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  if (var33.prefix != null) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var75 = var33.prefix;
                  } else {
                     var75 = "";
                  }

                  var47[var61] = var75;
                  var47 = Interpreter.Interpreter_objectStack;
                  var61 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  if (null != var33.text) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var75 = var33.text;
                  } else {
                     var75 = "";
                  }

                  var47[var61] = var75;
                  int[] var50 = Interpreter.Interpreter_intStack;
                  var61 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var78;
                  if (var33.isFromFriend(1180595798)) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var78 = 1;
                  } else {
                     var78 = var33.isFromIgnored(782484908) ? 2 : 0;
                  }

                  var50[var61] = var78;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (5004 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Message var27 = ArchiveLoader.Messages_getMessage(var19, (byte)0);
               if (null != var27) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var27.type * -1475546943;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var27.cycle * 1755101527;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var27.sender != null
                     ? var27.sender
                     : "";
                  Object[] var44 = Interpreter.Interpreter_objectStack;
                  int var58 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var72;
                  if (null != var27.prefix) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var72 = var27.prefix;
                  } else {
                     var72 = "";
                  }

                  var44[var58] = var72;
                  var44 = Interpreter.Interpreter_objectStack;
                  var58 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  if (var27.text != null) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var72 = var27.text;
                  } else {
                     var72 = "";
                  }

                  var44[var58] = var72;
                  int[] var46 = Interpreter.Interpreter_intStack;
                  var58 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  byte var74;
                  if (var27.isFromFriend(-938754472)) {
                     var74 = 1;
                  } else if (var27.isFromIgnored(782484908)) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var74 = 2;
                  } else {
                     var74 = 0;
                  }

                  var46[var58] = var74;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (5005 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               if (ClientPacket.privateChatMode == null) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1408231813
                     * ClientPacket.privateChatMode.field6650;
               }

               return 1;
            }
         } else if (var0 == 5008) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               String var18 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               int var26 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               PacketBufferNode var32 = class184.method4483(var26, var18, class352.clientLanguage, -1, 1509744528);
               PacketWriter.method3330(client.packetWriter, var32, -1771370198);
               return 1;
            }
         } else if (var0 == 5009) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               String var17 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
               String var25 = (String)Interpreter.Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
               PacketBufferNode var31 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3871, client.packetWriter.isaacCipher, -1634406309);
               var31.packetBuffer.writeShort(0, -2082017114);
               int var35 = 2108391709 * var31.packetBuffer.offset;
               var31.packetBuffer.writeStringCp1252NullTerminated(var17, 998990159);
               classLN.method7205(var31.packetBuffer, var25, -293496581);
               var31.packetBuffer.method11977(2108391709 * var31.packetBuffer.offset - var35, (byte)127);
               PacketWriter.method3330(client.packetWriter, var31, -1771370198);
               return 1;
            }
         } else if (var0 == 5010) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               String var16 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               class408.Interpreter_intStackSize -= 708726074;
               int var24 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var30 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               PacketBufferNode var7 = class184.method4483(var24, var16, class352.clientLanguage, var30, 1636634321);
               PacketWriter.method3330(client.packetWriter, var7, -1771370198);
               return 1;
            }
         } else if (var0 == 5015) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               String var15;
               label455: {
                  if (class330.localPlayer != null) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (class330.localPlayer.username != null) {
                        if (var3 >= 1) {
                           throw new IllegalStateException();
                        }

                        var15 = Username.method12702(class330.localPlayer.username, (byte)-56);
                        break label455;
                     }
                  }

                  var15 = "";
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var15;
               return 1;
            }
         } else if (var0 == 5016) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.tradeChatMode * -1546032189;
               return 1;
            }
         } else if (var0 == 5017) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var14 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = KeyHandler.Messages_getHistorySize(
                  var14, 421673862
               );
               return 1;
            }
         } else if (5018 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var13 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.Messages_getLastChatID(
                  var13, (byte)-103
               );
               return 1;
            }
         } else if (5019 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var12 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class194.method4477(var12, (byte)20);
               return 1;
            }
         } else if (5020 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               String var11 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               GrandExchangeOfferOwnWorldComparator.doCheat(var11, 371066558);
               return 1;
            }
         } else if (5021 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               client.field766 = ((String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587])
                  .toLowerCase()
                  .trim();
               return 1;
            }
         } else if (5022 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = client.field766;
               return 1;
            }
         } else if (var0 == 5023) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               String var10 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               System.out.println(var10);
               return 1;
            }
         } else if (var0 == 5030) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var23 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               Message var6 = class70.Messages_getByChannelAndID(var9, var23, (byte)1);
               if (var6 != null) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var6.count * 380472083;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var6.cycle * 1755101527;
                  Object[] var40 = Interpreter.Interpreter_objectStack;
                  int var54 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var68;
                  if (null != var6.sender) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var68 = var6.sender;
                  } else {
                     var68 = "";
                  }

                  var40[var54] = var68;
                  var40 = Interpreter.Interpreter_objectStack;
                  var54 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  if (var6.prefix != null) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var68 = var6.prefix;
                  } else {
                     var68 = "";
                  }

                  var40[var54] = var68;
                  var40 = Interpreter.Interpreter_objectStack;
                  var54 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  if (var6.text != null) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var68 = var6.text;
                  } else {
                     var68 = "";
                  }

                  var40[var54] = var68;
                  int[] var43 = Interpreter.Interpreter_intStack;
                  var54 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  byte var71;
                  if (var6.isFromFriend(-942215167)) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var71 = 1;
                  } else if (var6.isFromIgnored(782484908)) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     var71 = 2;
                  } else {
                     var71 = 0;
                  }

                  var43[var54] = var71;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 5031) {
            int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Message var5 = ArchiveLoader.Messages_getMessage(var4, (byte)0);
            if (null != var5) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1475546943 * var5.type;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1755101527 * var5.cycle;
               Object[] var10000 = Interpreter.Interpreter_objectStack;
               int var10001 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
               String var10002;
               if (null != var5.sender) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10002 = var5.sender;
               } else {
                  var10002 = "";
               }

               var10000[var10001] = var10002;
               var10000 = Interpreter.Interpreter_objectStack;
               var10001 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
               if (null != var5.prefix) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10002 = var5.prefix;
               } else {
                  var10002 = "";
               }

               var10000[var10001] = var10002;
               var10000 = Interpreter.Interpreter_objectStack;
               var10001 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
               if (null != var5.text) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10002 = var5.text;
               } else {
                  var10002 = "";
               }

               var10000[var10001] = var10002;
               int[] var39 = Interpreter.Interpreter_intStack;
               var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var67;
               if (var5.isFromFriend(-314886521)) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var67 = 1;
               } else if (var5.isFromIgnored(782484908)) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var67 = 2;
               } else {
                  var67 = 0;
               }

               var39[var10001] = var67;
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bt.bn(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("bo")
   static int method1175(int var0, Script var1, boolean var2, byte var3) {
      try {
         Widget var4 = class226.widgetDefinition
            .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1591114192);
         if (var0 == 2500) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -814361553 * var4.x;
               return 1;
            }
         } else if (2501 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.y * -286860451;
               return 1;
            }
         } else if (2502 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.width * -1946208531;
               return 1;
            }
         } else if (2503 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.height * -905446999;
               return 1;
            }
         } else if (var0 == 2504) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (var4.isHidden) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (2505 == var0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 794900977 * var4.parentId;
               return 1;
            }
         } else if (var0 != 2506) {
            return 2;
         } else {
            int var5 = 794900977 * var4.parentId;
            if (var5 == -1) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               for (InterfaceParent var6 = (InterfaceParent)client.interfaceParents.first();
                  null != var6;
                  var6 = (InterfaceParent)client.interfaceParents.next()
               ) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  if (-1385287145 * var6.group == var4.id * 278777747 >> 16) {
                     if (var3 != 0) {
                        throw new IllegalStateException();
                     }

                     var5 = (int)var6.key;
                     break;
                  }
               }
            }

            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5;
            return 1;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bt.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   public static boolean method1174(int var0) {
      try {
         boolean var1 = false;
         boolean var2 = false;
         if (!class345.field4310.isEmpty()) {
            if (var0 <= -662120321) {
               throw new IllegalStateException();
            }

            SongTask var3 = (SongTask)class345.field4310.get(0);
            if (null == var3) {
               class345.field4310.remove(0);
            } else if (var3.vmethod325((byte)111)) {
               if (var0 <= -662120321) {
                  throw new IllegalStateException();
               }

               if (var3.method10527(-1958046830)) {
                  if (var0 <= -662120321) {
                     throw new IllegalStateException();
                  }

                  System.out.println("Error in midimanager.service: " + var3.method10533((short)24882));
                  var1 = true;
               } else {
                  if (var3.method10538((byte)-62) != null) {
                     if (var0 <= -662120321) {
                        throw new IllegalStateException();
                     }

                     class345.field4310.add(1, var3.method10538((byte)-84));
                  }

                  var2 = var3.method10531(872312676);
               }

               class345.field4310.remove(0);
            } else {
               var2 = var3.method10531(-1899370864);
            }
         }

         if (var1) {
            if (var0 <= -662120321) {
               throw new IllegalStateException();
            }

            class345.field4310.clear();
            classFM.method4028(-1310936102);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bt.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIB)V")
   @ObfuscatedName("ag")
   static final void method1172(WorldView var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         int[][][] var6 = var0.tileHeights;
         int var7 = 2010544793 * var0.sizeX - 1;
         int var8 = 1823353167 * var0.sizeY - 1;

         for (int var9 = var2; var9 <= var2 + var4; var9++) {
            if (var5 >= 16) {
               throw new IllegalStateException();
            }

            for (int var10 = var1; var10 <= var3 + var1; var10++) {
               if (var5 >= 16) {
                  throw new IllegalStateException();
               }

               if (var10 >= 0) {
                  if (var5 >= 16) {
                     throw new IllegalStateException();
                  }

                  if (var10 < var6[0].length - 1) {
                     if (var5 >= 16) {
                        throw new IllegalStateException();
                     }

                     if (var9 >= 0) {
                        if (var5 >= 16) {
                           throw new IllegalStateException();
                        }

                        if (var9 < var6[0][0].length - 1) {
                           if (var5 >= 16) {
                              throw new IllegalStateException();
                           }

                           Tiles.Tiles_underlays2[0][var10][var9] = 127;
                           if (var1 == var10) {
                              if (var5 >= 16) {
                                 return;
                              }

                              if (var10 > 0) {
                                 if (var5 >= 16) {
                                    throw new IllegalStateException();
                                 }

                                 var6[0][var10][var9] = var6[0][var10 - 1][var9];
                              }
                           }

                           if (var10 == var3 + var1) {
                              if (var5 >= 16) {
                                 return;
                              }

                              if (var10 < var7) {
                                 if (var5 >= 16) {
                                    throw new IllegalStateException();
                                 }

                                 var6[0][var10][var9] = var6[0][var10 + 1][var9];
                              }
                           }

                           if (var9 == var2) {
                              if (var5 >= 16) {
                                 return;
                              }

                              if (var9 > 0) {
                                 if (var5 >= 16) {
                                    return;
                                 }

                                 var6[0][var10][var9] = var6[0][var10][var9 - 1];
                              }
                           }

                           if (var2 + var4 == var9) {
                              if (var5 >= 16) {
                                 throw new IllegalStateException();
                              }

                              if (var9 < var8) {
                                 if (var5 >= 16) {
                                    throw new IllegalStateException();
                                 }

                                 var6[0][var10][var9] = var6[0][var10][var9 + 1];
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "bt.ag(" + ')');
      }
   }
}
