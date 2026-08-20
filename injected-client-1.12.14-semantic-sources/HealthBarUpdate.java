import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cj")
public class HealthBarUpdate extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   public static final int field598 = 61;
   @ObfuscatedName("at")
   int health;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field596 = 37;
   @ObfuscatedName("an")
   int cycleOffset;
   @ObfuscatedName("lc")
   static int field600;
   @ObfuscatedName("oy")
   static int[] field601;
   @ObfuscatedName("av")
   int cycle;
   @ToRemove(unused = "true")
   @ObfuscatedName("cm")
   static final int field599 = 50;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field597 = 25;
   @ObfuscatedName("ag")
   int health2;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field595 = 2;

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("bx")
   static int method1488(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (6500 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               int[] var31 = Interpreter.Interpreter_intStack;
               int var32 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var33;
               if (class406.loadWorlds(-378267328)) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  var33 = 1;
               } else {
                  var33 = 0;
               }

               var31[var32] = var33;
               return 1;
            }
         } else if (6501 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               World var16 = class339.worldListStart(-1303001442);
               if (null != var16) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 789563243 * var16.population;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var16.location * -607869593;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var16.activity;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var16.index * -428025341;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var16.properties * 2054822665;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var16.host;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               }

               return 1;
            }
         } else if (var0 == 6502) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               World var15 = class217.getNextWorldListWorld(-1691355241);
               if (null != var15) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 789563243 * var15.population;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var15.location * -607869593;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var15.activity;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -428025341 * var15.index;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 2054822665 * var15.properties;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var15.host;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               }

               return 1;
            }
         } else if (6506 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               int var14 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               World var22 = null;

               for (int var27 = 0; var27 < World.World_count * -858019443; var27++) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  if (World.World_worlds[var27].population * 789563243 == var14) {
                     var22 = World.World_worlds[var27];
                     break;
                  }
               }

               if (null != var22) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var22.population * 789563243;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var22.location * -607869593;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var22.activity;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -428025341 * var22.index;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var22.properties * 2054822665;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var22.host;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               }

               return 1;
            }
         } else if (6507 == var0) {
            class408.Interpreter_intStackSize -= 1417452148;
            int var13 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            boolean var29;
            if (Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize] == 1) {
               if (var3 <= 75) {
                  throw new IllegalStateException();
               }

               var29 = true;
            } else {
               var29 = false;
            }

            boolean var21 = var29;
            int var26 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
            if (1 == Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 3]) {
               if (var3 <= 75) {
                  throw new IllegalStateException();
               }

               var29 = true;
            } else {
               var29 = false;
            }

            boolean var7 = var29;
            class204.sortWorldList(var13, var21, var26, var7, -264481596);
            return 1;
         } else if (var0 == 6511) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               int var12 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (var12 >= 0) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  if (var12 < -858019443 * World.World_count) {
                     if (var3 <= 75) {
                        throw new IllegalStateException();
                     }

                     World var20 = World.World_worlds[var12];
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 789563243 * var20.population;
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -607869593 * var20.location;
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var20.activity;
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -428025341 * var20.index;
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 2054822665 * var20.properties;
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var20.host;
                     return 1;
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (var0 == 6512) {
            boolean var28;
            if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               if (var3 <= 75) {
                  throw new IllegalStateException();
               }

               var28 = true;
            } else {
               var28 = false;
            }

            client.followerOpsLowPriority = var28;
            return 1;
         } else if (var0 == 6513) {
            class408.Interpreter_intStackSize -= 708726074;
            int var11 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var19 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            ParamComposition var25 = WorldMap.getParamDefinition(var19, -202012634);
            if (ParamComposition.method4969(var25, 102971697)) {
               if (var3 <= 75) {
                  throw new IllegalStateException();
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = NPCComposition.method4698(
                  AsyncHttpResponse.getNpcDefinition(var11, (byte)13), var19, var25.defaultStr, (byte)72
               );
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = NPCComposition.method4694(
                  AsyncHttpResponse.getNpcDefinition(var11, (byte)112), var19, var25.defaultInt * -822826545, 192977228
               );
            }

            return 1;
         } else if (6514 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var18 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               ParamComposition var24 = WorldMap.getParamDefinition(var18, -1231297616);
               if (ParamComposition.method4969(var24, 1677417751)) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = AsyncHttpResponse.getObjectDefinition(
                        var10, 2119361899
                     )
                     .getStringParam(var18, var24.defaultStr, 1936338420);
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ObjectComposition.method5175(
                     AsyncHttpResponse.getObjectDefinition(var10, 2011745881), var18, -822826545 * var24.defaultInt, 1043429539
                  );
               }

               return 1;
            }
         } else if (var0 == 6515) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var9 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var17 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               ParamComposition var23 = WorldMap.getParamDefinition(var17, -280768526);
               if (ParamComposition.method4969(var23, -661028732)) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class150.ItemDefinition_get(
                        var9, -592652930
                     )
                     .getStringParam(var17, var23.defaultStr, (byte)80);
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ItemComposition.method5086(
                     class150.ItemDefinition_get(var9, 158669557), var17, -822826545 * var23.defaultInt, -2138103929
                  );
               }

               return 1;
            }
         } else if (var0 == 6516) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var5 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               ParamComposition var6 = WorldMap.getParamDefinition(var5, -656651950);
               if (ParamComposition.method4969(var6, -839806487)) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class39.StructDefinition_getStructDefinition(
                        var4, -950455341
                     )
                     .getStringParam(var5, var6.defaultStr, (byte)0);
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class39.StructDefinition_getStructDefinition(
                        var4, -753050301
                     )
                     .getIntParam(var5, var6.defaultInt * -822826545, 1630908785);
               }

               return 1;
            }
         } else if (6518 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (client.onMobile) {
                  if (var3 <= 75) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (6519 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.clientType * 1499774163;
               return 1;
            }
         } else if (var0 == 6520) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 == 6521) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 == 6522) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
               class408.Interpreter_intStackSize -= -1793120611;
               return 1;
            }
         } else if (var0 == 6523) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
               class408.Interpreter_intStackSize -= -1793120611;
               return 1;
            }
         } else if (6524 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               return 1;
            }
         } else if (6525 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               return 1;
            }
         } else if (6526 == var0) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               return 1;
            }
         } else if (var0 == 6527) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1225137509 * client.field717;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cj.bx(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("iv")
   static void method1486(int var0, byte var1) {
      try {
         PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3947, client.packetWriter.isaacCipher, -1835780741);
         var2.packetBuffer.writeByteAdd(var0, -874817993);
         PacketWriter.method3330(client.packetWriter, var2, -1771370198);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cj.iv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("at")
   void method1481(int var1, int var2, int var3, int var4) {
      this.cycle = var1 * -996923346;
      this.health = 1385168408 * var2;
      this.health2 = var3 * -1311064903;
      this.cycleOffset = var4 * 802174022;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ag")
   void method1482(int var1, int var2, int var3, int var4) {
      this.cycle = var1 * -63104703;
      this.health = 173316336 * var2;
      this.health2 = var3 * -1311064903;
      this.cycleOffset = var4 * -1414250185;
   }

   @ObfuscatedSignature(descriptor = "(Lsu;Lsu;Lsu;I)V")
   @ObfuscatedName("ax")
   static void drawTitle(Font var0, Font var1, Font var2, int var3) {
      Login.xPadding = (class489.canvasWidth * 120179835 - 765) / 2 * 816921945;
      Login.loginBoxX = 1308961390 + Login.xPadding * -1970420125;
      CollisionMap.loginBoxCenter = -485361479 * Login.loginBoxX + -729437604;
      if (Login.worldSelectOpen) {
         if (null == class461.worldSelectBackSprites) {
            class461.worldSelectBackSprites = class234.method5949(class147.archive8, "sl_back", "", -2085797468);
         }

         if (class107.worldSelectFlagSprites == null) {
            if (var3 <= 1783777249) {
               return;
            }

            class107.worldSelectFlagSprites = class288.getFont(class147.archive8, "sl_flags", "", (byte)-109);
         }

         if (MoveSpeed.worldSelectArrows == null) {
            MoveSpeed.worldSelectArrows = class288.getFont(class147.archive8, "sl_arrows", "", (byte)0);
         }

         if (null == class148.worldSelectStars) {
            class148.worldSelectStars = class288.getFont(class147.archive8, "sl_stars", "", (byte)-95);
         }

         if (null == class70.worldSelectLeftSprite) {
            class70.worldSelectLeftSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "leftarrow", "", 1939176022);
         }

         if (null == class339.worldSelectRightSprite) {
            class339.worldSelectRightSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "rightarrow", "", 2124909905);
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(921778921 * Login.xPadding, 23, 765, 480, 0);
         Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding * 921778921, 0, 125, 23, 12425273, 9135624);
         Rasterizer2D.Rasterizer2D_fillRectangleGradient(125 + 921778921 * Login.xPadding, 0, 640, 23, 5197647, 2697513);
         FadeOutTask.method10363(var0, Strings.field5153, 62 + Login.xPadding * 921778921, 15, 0, -1);
         if (null != class148.worldSelectStars) {
            class148.worldSelectStars[1].drawAt(140 + Login.xPadding * 921778921, 1);
            var1.method10402(Strings.field5154, 152 + 921778921 * Login.xPadding, 10, 16777215, -1);
            class148.worldSelectStars[0].drawAt(140 + 921778921 * Login.xPadding, 12);
            var1.method10402(Strings.field5155, 152 + Login.xPadding * 921778921, 21, 16777215, -1);
         }

         if (null != MoveSpeed.worldSelectArrows) {
            int var110 = 280 + Login.xPadding * 921778921;
            if (0 == World.World_sortOption1[0] && World.World_sortOption2[0] == 0) {
               MoveSpeed.worldSelectArrows[2].drawAt(var110, 4);
            } else {
               MoveSpeed.worldSelectArrows[0].drawAt(var110, 4);
            }

            label932: {
               if (0 == World.World_sortOption1[0]) {
                  if (var3 <= 1783777249) {
                     return;
                  }

                  if (World.World_sortOption2[0] == 1) {
                     MoveSpeed.worldSelectArrows[3].drawAt(15 + var110, 4);
                     break label932;
                  }
               }

               MoveSpeed.worldSelectArrows[1].drawAt(var110 + 15, 4);
            }

            var0.method10402(Strings.field4931, var110 + 32, 17, 16777215, -1);
            int var146 = Login.xPadding * 921778921 + 390;
            if (1 == World.World_sortOption1[0] && World.World_sortOption2[0] == 0) {
               if (var3 <= 1783777249) {
                  return;
               }

               MoveSpeed.worldSelectArrows[2].drawAt(var146, 4);
            } else {
               MoveSpeed.worldSelectArrows[0].drawAt(var146, 4);
            }

            if (1 == World.World_sortOption1[0] && World.World_sortOption2[0] == 1) {
               if (var3 <= 1783777249) {
                  return;
               }

               MoveSpeed.worldSelectArrows[3].drawAt(15 + var146, 4);
            } else {
               MoveSpeed.worldSelectArrows[1].drawAt(var146 + 15, 4);
            }

            int var170;
            label916: {
               var0.method10402(Strings.field5073, 32 + var146, 17, 16777215, -1);
               var170 = Login.xPadding * 921778921 + 500;
               if (World.World_sortOption1[0] == 2) {
                  if (var3 <= 1783777249) {
                     return;
                  }

                  if (World.World_sortOption2[0] == 0) {
                     if (var3 <= 1783777249) {
                        return;
                     }

                     MoveSpeed.worldSelectArrows[2].drawAt(var170, 4);
                     break label916;
                  }
               }

               MoveSpeed.worldSelectArrows[0].drawAt(var170, 4);
            }

            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
               if (var3 <= 1783777249) {
                  return;
               }

               MoveSpeed.worldSelectArrows[3].drawAt(15 + var170, 4);
            } else {
               MoveSpeed.worldSelectArrows[1].drawAt(15 + var170, 4);
            }

            var0.method10402(Strings.field5158, 32 + var170, 17, 16777215, -1);
            int var181 = 610 + Login.xPadding * 921778921;
            if (3 == World.World_sortOption1[0] && World.World_sortOption2[0] == 0) {
               MoveSpeed.worldSelectArrows[2].drawAt(var181, 4);
            } else {
               MoveSpeed.worldSelectArrows[0].drawAt(var181, 4);
            }

            label900: {
               if (3 == World.World_sortOption1[0]) {
                  if (var3 <= 1783777249) {
                     return;
                  }

                  if (1 == World.World_sortOption2[0]) {
                     MoveSpeed.worldSelectArrows[3].drawAt(15 + var181, 4);
                     break label900;
                  }
               }

               MoveSpeed.worldSelectArrows[1].drawAt(15 + var181, 4);
            }

            var0.method10402(Strings.field5159, var181 + 32, 17, 16777215, -1);
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(708 + 921778921 * Login.xPadding, 4, 50, 16, 0);
         FadeOutTask.method10363(var1, Strings.field5137, 25 + 708 + Login.xPadding * 921778921, 16, 16777215, -1);
         Login.hoveredWorldIndex = -660744019;
         if (null != class461.worldSelectBackSprites) {
            byte var111 = 88;
            byte var147 = 19;
            int var171 = 765 / (var111 + 1) - 1;
            int var182 = 480 / (var147 + 1);

            int var192;
            int var197;
            do {
               var192 = var182;
               var197 = var171;
               if (var182 * (var171 - 1) >= -858019443 * World.World_count) {
                  var171--;
               }

               if ((var182 - 1) * var171 >= -858019443 * World.World_count) {
                  var182--;
               }

               if (var171 * (var182 - 1) >= -858019443 * World.World_count) {
                  var182--;
               }
            } while (var182 != var192 || var171 != var197);

            if (var3 <= 1783777249) {
               return;
            }

            var192 = (765 - var171 * var111) / (1 + var171);
            if (var192 > 5) {
               var192 = 5;
            }

            var197 = (480 - var182 * var147) / (1 + var182);
            if (var197 > 5) {
               var197 = 5;
            }

            int var199 = (765 - var171 * var111 - (var171 - 1) * var192) / 2;
            int var200 = (480 - var182 * var147 - var197 * (var182 - 1)) / 2;
            int var12 = (var182 + -858019443 * World.World_count - 1) / var182;
            Login.worldSelectPagesCount = 1133401675 * (var12 - var171);
            if (class70.worldSelectLeftSprite != null && Login.worldSelectPage * 1401993025 > 0) {
               class70.worldSelectLeftSprite.drawAt(8, class374.canvasHeight * 19292887 / 2 - class70.worldSelectLeftSprite.subHeight / 2);
            }

            if (null != class339.worldSelectRightSprite && 1401993025 * Login.worldSelectPage < Login.worldSelectPagesCount * 2126332771) {
               class339.worldSelectRightSprite
                  .drawAt(
                     120179835 * class489.canvasWidth - class339.worldSelectRightSprite.subWidth - 8,
                     19292887 * class374.canvasHeight / 2 - class339.worldSelectRightSprite.subHeight / 2
                  );
            }

            int var201 = 23 + var200;
            int var202 = var199 + 921778921 * Login.xPadding;
            int var203 = 0;
            boolean var205 = false;
            int var206 = Login.worldSelectPage * 1401993025;

            for (int var18 = var182 * var206; var18 < World.World_count * -858019443 && var206 - 1401993025 * Login.worldSelectPage < var171; var18++) {
               World var19 = World.World_worlds[var18];
               boolean var20 = true;
               String var21 = Integer.toString(var19.properties * 2054822665);
               if (-1 == 2054822665 * var19.properties) {
                  var21 = Strings.field5160;
                  var20 = false;
               } else if (2054822665 * var19.properties > 1980) {
                  var21 = Strings.field5161;
                  var20 = false;
               }

               class88 var22 = null;
               int var23 = 0;
               if (var19.isBeta(591500994)) {
                  if (var3 <= 1783777249) {
                     return;
                  }

                  var22 = var19.isMembersOnly(-1575808794) ? class88.field1371 : class88.field1367;
               } else if (World.method891(var19, -1992403886)) {
                  var22 = var19.isMembersOnly(-1018596310) ? class88.field1363 : class88.field1375;
               } else if (var19.method902(-1235012159)) {
                  var23 = 16711680;
                  var22 = var19.isMembersOnly(-1928612185) ? class88.field1376 : class88.field1368;
               } else if (var19.method910(1943538074)) {
                  var22 = var19.isMembersOnly(-1008359872) ? class88.field1370 : class88.field1365;
               } else if (var19.isPvp(1789795895)) {
                  if (var3 <= 1783777249) {
                     return;
                  }

                  var22 = var19.isMembersOnly(-1629960231) ? class88.field1366 : class88.field1362;
               } else if (var19.method912((byte)-46)) {
                  var22 = var19.isMembersOnly(-293774891) ? class88.field1372 : class88.field1369;
               } else if (var19.method916(2135132969)) {
                  class88 var211;
                  if (var19.isMembersOnly(-1726808795)) {
                     if (var3 <= 1783777249) {
                        return;
                     }

                     var211 = class88.field1390;
                  } else {
                     var211 = class88.field1373;
                  }

                  var22 = var211;
               }

               if (null == var22 || var22.field1377 * 142977173 >= class461.worldSelectBackSprites.length) {
                  class88 var212;
                  if (var19.isMembersOnly(-767238226)) {
                     if (var3 <= 1783777249) {
                        return;
                     }

                     var212 = class88.field1364;
                  } else {
                     var212 = class88.field1361;
                  }

                  var22 = var212;
               }

               if (MouseHandler.MouseHandler_x * 1856325427 >= var202
                  && MouseHandler.MouseHandler_y * -1427762751 >= var201
                  && 1856325427 * MouseHandler.MouseHandler_x < var202 + var111
                  && MouseHandler.MouseHandler_y * -1427762751 < var147 + var201
                  && var20) {
                  Login.hoveredWorldIndex = var18 * 660744019;
                  class461.worldSelectBackSprites[var22.field1377 * 142977173].drawTransOverlayAt(var202, var201, 128, 16777215);
                  var205 = true;
               } else {
                  class461.worldSelectBackSprites[var22.field1377 * 142977173].method12647(var202, var201);
               }

               if (null != class107.worldSelectFlagSprites) {
                  class107.worldSelectFlagSprites[(var19.isMembersOnly(-324367213) ? 8 : 0) + -428025341 * var19.index].drawAt(29 + var202, var201);
               }

               FadeOutTask.method10363(var0, Integer.toString(789563243 * var19.population), var202 + 15, 5 + var201 + var147 / 2, var23, -1);
               FadeOutTask.method10363(var1, var21, var202 + 60, var147 / 2 + var201 + 5, 268435455, -1);
               var201 += var147 + var197;
               if (++var203 >= var182) {
                  var201 = 23 + var200;
                  var202 += var192 + var111;
                  var203 = 0;
                  var206++;
               }
            }

            if (var205) {
               if (var3 <= 1783777249) {
                  return;
               }

               int var207 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex * 1691792603].activity) + 6;
               int var208 = 8 + var1.ascent;
               int var209 = -1427762751 * MouseHandler.MouseHandler_y + 25;
               if (var209 + var208 > 480) {
                  var209 = MouseHandler.MouseHandler_y * -1427762751 - 25 - var208;
               }

               Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x * 1856325427 - var207 / 2, var209, var207, var208, 16777120);
               Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x * 1856325427 - var207 / 2, var209, var207, var208, 0);
               FadeOutTask.method10363(
                  var1,
                  World.World_worlds[Login.hoveredWorldIndex * 1691792603].activity,
                  1856325427 * MouseHandler.MouseHandler_x,
                  var209 + var1.ascent + 4,
                  0,
                  -1
               );
            }
         }
      } else {
         class560.leftTitleSprite.method12647(921778921 * Login.xPadding, 0);
         WorldMapData_1.rightTitleSprite.method12647(Login.xPadding * 921778921 + 382, 0);
         class50.logoSprite.drawAt(382 + 921778921 * Login.xPadding - class50.logoSprite.subWidth / 2, 18);
         if (0 == client.gameState * 1271535343 || 5 == 1271535343 * client.gameState) {
            byte var4 = 20;
            FadeOutTask.method10363(var0, Strings.field5036, 180 + 743318851 * Login.loginBoxX, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            Rasterizer2D.Rasterizer2D_drawRectangle(180 + Login.loginBoxX * 743318851 - 152, var5, 304, 34, 9179409);
            Rasterizer2D.Rasterizer2D_drawRectangle(180 + Login.loginBoxX * 743318851 - 151, var5 + 1, 302, 32, 0);
            Rasterizer2D.Rasterizer2D_fillRectangle(180 + Login.loginBoxX * 743318851 - 150, var5 + 2, Login.Login_loadingPercent * -603434983, 30, 9179409);
            Rasterizer2D.Rasterizer2D_fillRectangle(
               Login.loginBoxX * 743318851 + 180 - 150 + -603434983 * Login.Login_loadingPercent,
               var5 + 2,
               300 - Login.Login_loadingPercent * -603434983,
               30,
               0
            );
            FadeOutTask.method10363(var0, Login.Login_loadingText, 180 + Login.loginBoxX * 743318851, 276 - var4, 16777215, -1);
         }

         if (20 == 1271535343 * client.gameState) {
            class208.titleboxSprite
               .drawAt(180 + 743318851 * Login.loginBoxX - class208.titleboxSprite.subWidth / 2, 271 - class208.titleboxSprite.subHeight / 2);
            int var24 = 201;
            FadeOutTask.method10363(var0, Login.Login_response1, 743318851 * Login.loginBoxX + 180, var24, 16776960, 0);
            var24 += 15;
            FadeOutTask.method10363(var0, Login.Login_response2, 180 + Login.loginBoxX * 743318851, var24, 16776960, 0);
            var24 += 15;
            FadeOutTask.method10363(var0, Login.Login_response3, 180 + 743318851 * Login.loginBoxX, var24, 16776960, 0);
            var24 += 15;
            var24 += 7;
            if (Login.loginIndex * -1614560929 != 4 && 10 != -1614560929 * Login.loginIndex && 1 != -1614560929 * Login.loginIndex) {
               var0.method10402(Strings.field5151, 743318851 * Login.loginBoxX + 180 - 110, var24, 16777215, 0);
               short var112 = 200;
               String var6 = ClanMate.method10777((byte)-32);

               while (var0.stringWidth(var6) > var112) {
                  var6 = var6.substring(0, var6.length() - 1);
               }

               var0.method10402(AbstractFont.escapeBrackets(var6), 180 + 743318851 * Login.loginBoxX - 70, var24, 16777215, 0);
               var24 += 15;
               String var7 = FriendsList.method10586(Login.Login_password, 2097200167);

               while (var0.stringWidth(var7) > var112) {
                  var7 = var7.substring(1);
               }

               var0.method10402(Strings.field5094 + var7, Login.loginBoxX * 743318851 + 180 - 108, var24, 16777215, 0);
               var24 += 15;
            }
         }

         if (1271535343 * client.gameState == 10 || 1271535343 * client.gameState == 11 || 1271535343 * client.gameState == 50) {
            class208.titleboxSprite.drawAt(Login.loginBoxX * 743318851, 171);
            if (0 == Login.loginIndex * -1614560929) {
               int var31 = 251;
               FadeOutTask.method10363(var0, Strings.field5005, 743318851 * Login.loginBoxX + 180, var31, 16776960, 0);
               var31 += 30;
               int var113 = Login.loginBoxX * 743318851 + 180 - 80;
               short var148 = 291;
               World.titlebuttonSprite.drawAt(var113 - 73, var148 - 20);
               AbstractFont.method10416(var0, Strings.field5097, var113 - 73, var148 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var113 = 80 + Login.loginBoxX * 743318851 + 180;
               World.titlebuttonSprite.drawAt(var113 - 73, var148 - 20);
               AbstractFont.method10416(var0, Strings.field5098, var113 - 73, var148 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (-1614560929 * Login.loginIndex == 1) {
               if (var3 <= 1783777249) {
                  return;
               }

               FadeOutTask.method10363(var0, Login.Login_response0, 180 + Login.loginBoxX * 743318851, 201, 16776960, 0);
               int var33 = 236;
               FadeOutTask.method10363(var0, Login.Login_response1, 180 + 743318851 * Login.loginBoxX, var33, 16777215, 0);
               var33 += 15;
               FadeOutTask.method10363(var0, Login.Login_response2, Login.loginBoxX * 743318851 + 180, var33, 16777215, 0);
               var33 += 15;
               FadeOutTask.method10363(var0, Login.Login_response3, 180 + Login.loginBoxX * 743318851, var33, 16777215, 0);
               var33 += 15;
               int var115 = 180 + Login.loginBoxX * 743318851 - 80;
               short var149 = 321;
               World.titlebuttonSprite.drawAt(var115 - 73, var149 - 20);
               FadeOutTask.method10363(var0, Strings.field4859, var115, 5 + var149, 16777215, 0);
               var115 = 80 + 180 + 743318851 * Login.loginBoxX;
               World.titlebuttonSprite.drawAt(var115 - 73, var149 - 20);
               FadeOutTask.method10363(var0, Strings.field5137, var115, 5 + var149, 16777215, 0);
            } else if (Login.loginIndex * -1614560929 == 2) {
               int var37 = 201;
               FadeOutTask.method10363(var0, Login.Login_response1, -1998333989 * CollisionMap.loginBoxCenter, var37, 16776960, 0);
               var37 += 15;
               FadeOutTask.method10363(var0, Login.Login_response2, -1998333989 * CollisionMap.loginBoxCenter, var37, 16776960, 0);
               var37 += 15;
               FadeOutTask.method10363(var0, Login.Login_response3, CollisionMap.loginBoxCenter * -1998333989, var37, 16776960, 0);
               var37 += 15;
               var37 += 7;
               var0.method10402(Strings.field5151, CollisionMap.loginBoxCenter * -1998333989 - 110, var37, 16777215, 0);
               short var117 = 200;

               String var150;
               for (var150 = ClanMate.method10777((byte)-126); var0.stringWidth(var150) > var117; var150 = var150.substring(1)) {
                  if (var3 <= 1783777249) {
                     return;
                  }
               }

               var0.method10402(
                  AbstractFont.escapeBrackets(var150)
                     + (
                        244972893 * Login.currentLoginField == 0 & client.cycle * 1759706017 % 40 < 20
                           ? class144.colorStartTag(16776960, -325775967) + classDF.field1347
                           : ""
                     ),
                  -1998333989 * CollisionMap.loginBoxCenter - 70,
                  var37,
                  16777215,
                  0
               );
               var37 += 15;
               String var172 = FriendsList.method10586(Login.Login_password, 2097200167);

               while (var0.stringWidth(var172) > var117) {
                  var172 = var172.substring(1);
               }

               var0.method10402(
                  Strings.field5094
                     + var172
                     + (
                        1 == Login.currentLoginField * 244972893 & 1759706017 * client.cycle % 40 < 20
                           ? class144.colorStartTag(16776960, -923512544) + classDF.field1347
                           : ""
                     ),
                  -1998333989 * CollisionMap.loginBoxCenter - 108,
                  var37,
                  16777215,
                  0
               );
               var37 += 15;
               int var44 = 277;
               int var8 = CollisionMap.loginBoxCenter * -1998333989 + -117;
               boolean var10 = client.Login_isUsernameRemembered;
               boolean var11 = Login.field377;
               IndexedSprite var10000;
               if (var10) {
                  var10000 = var11 ? HealthBarDefinition.field2243 : WidgetConfigNode.options_buttons_2Sprite;
               } else if (var11) {
                  if (var3 <= 1783777249) {
                     return;
                  }

                  var10000 = UserComparator6.field1830;
               } else {
                  var10000 = class456.options_buttons_0Sprite;
               }

               IndexedSprite var9 = var10000;
               var9.drawAt(var8, var44);
               var8 += var9.subWidth + 5;
               var1.method10402(Strings.field5091, var8, 13 + var44, 16776960, 0);
               var8 = CollisionMap.loginBoxCenter * -1998333989 + 24;
               boolean var14 = ClientPreferences.method1560(class468.clientPreferences, 852369779);
               boolean var15 = Login.field392;
               IndexedSprite var13 = var14
                  ? (var15 ? HealthBarDefinition.field2243 : WidgetConfigNode.options_buttons_2Sprite)
                  : (var15 ? UserComparator6.field1830 : class456.options_buttons_0Sprite);
               var13.drawAt(var8, var44);
               var8 += var13.subWidth + 5;
               var1.method10402(Strings.field5067, var8, 13 + var44, 16776960, 0);
               var44 += 15;
               int var16 = CollisionMap.loginBoxCenter * -1998333989 - 80;
               short var17 = 321;
               World.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
               FadeOutTask.method10363(var0, Strings.field5084, var16, var17 + 5, 16777215, 0);
               var16 = -1998333989 * CollisionMap.loginBoxCenter + 80;
               World.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
               FadeOutTask.method10363(var0, Strings.field5137, var16, 5 + var17, 16777215, 0);
               short var46 = 357;
               switch (Login.field399 * 1340994199) {
                  case 2:
                     WorldMapLabel.field3791 = Strings.field5114;
                     break;
                  default:
                     WorldMapLabel.field3791 = Strings.field5001;
               }

               class181.field2057 = new Bounds(-1998333989 * CollisionMap.loginBoxCenter, var46, var1.stringWidth(WorldMapLabel.field3791), 11);
               WorldMapElement.field2221 = new Bounds(CollisionMap.loginBoxCenter * -1998333989, var46, var1.stringWidth(Strings.field5113), 11);
               FadeOutTask.method10363(var1, WorldMapLabel.field3791, -1998333989 * CollisionMap.loginBoxCenter, var46, 16777215, 0);
            } else if (3 == Login.loginIndex * -1614560929) {
               int var47 = 201;
               FadeOutTask.method10363(var0, Strings.field4969, 180 + 743318851 * Login.loginBoxX, var47, 16776960, 0);
               var47 += 20;
               FadeOutTask.method10363(var1, Strings.field5104, 743318851 * Login.loginBoxX + 180, var47, 16776960, 0);
               var47 += 20;
               FadeOutTask.method10363(var1, Strings.field4906, 180 + 743318851 * Login.loginBoxX, var47, 16776960, 0);
               var47 += 15;
               int var118 = Login.loginBoxX * 743318851 + 180;
               short var151 = 276;
               World.titlebuttonSprite.drawAt(var118 - 73, var151 - 20);
               FadeOutTask.method10363(var2, Strings.field5106, var118, var151 + 5, 16777215, 0);
               var118 = 180 + Login.loginBoxX * 743318851;
               var151 = 326;
               World.titlebuttonSprite.drawAt(var118 - 73, var151 - 20);
               FadeOutTask.method10363(var2, Strings.field5107, var118, 5 + var151, 16777215, 0);
            } else if (Login.loginIndex * -1614560929 == 4) {
               if (var3 <= 1783777249) {
                  return;
               }

               FadeOutTask.method10363(var0, Strings.field5083, 743318851 * Login.loginBoxX + 180, 201, 16776960, 0);
               int var51 = 236;
               FadeOutTask.method10363(var0, Login.Login_response1, 743318851 * Login.loginBoxX + 180, var51, 16777215, 0);
               var51 += 15;
               FadeOutTask.method10363(var0, Login.Login_response2, Login.loginBoxX * 743318851 + 180, var51, 16777215, 0);
               var51 += 15;
               FadeOutTask.method10363(var0, Login.Login_response3, 180 + 743318851 * Login.loginBoxX, var51, 16777215, 0);
               var51 += 15;
               var0.method10402(
                  Strings.field5095
                     + FriendsList.method10586(UserComparator6.otp, 2097200167)
                     + (client.cycle * 1759706017 % 40 < 20 ? class144.colorStartTag(16776960, -862968097) + classDF.field1347 : ""),
                  180 + 743318851 * Login.loginBoxX - 108,
                  var51,
                  16777215,
                  0
               );
               var51 -= 8;
               var0.method10402(Strings.field4862, 180 + Login.loginBoxX * 743318851 - 9, var51, 16776960, 0);
               var51 += 15;
               var0.method10402(Strings.field4863, 180 + 743318851 * Login.loginBoxX - 9, var51, 16776960, 0);
               int var120 = Login.loginBoxX * 743318851 + 180 - 9 + var0.stringWidth(Strings.field4863) + 15;
               int var153 = var51 - var0.ascent;
               IndexedSprite var173;
               if (Login.rememberUsername) {
                  var173 = WidgetConfigNode.options_buttons_2Sprite;
               } else {
                  var173 = class456.options_buttons_0Sprite;
               }

               var173.drawAt(var120, var153);
               var51 += 15;
               int var186 = Login.loginBoxX * 743318851 + 180 - 80;
               short var194 = 321;
               World.titlebuttonSprite.drawAt(var186 - 73, var194 - 20);
               FadeOutTask.method10363(var0, Strings.field4859, var186, var194 + 5, 16777215, 0);
               var186 = 80 + 180 + 743318851 * Login.loginBoxX;
               World.titlebuttonSprite.drawAt(var186 - 73, var194 - 20);
               FadeOutTask.method10363(var0, Strings.field5137, var186, 5 + var194, 16777215, 0);
               FadeOutTask.method10363(var1, Strings.field5001, 743318851 * Login.loginBoxX + 180, 36 + var194, 16777215, 0);
            } else if (-1614560929 * Login.loginIndex == 5) {
               FadeOutTask.method10363(var0, Strings.field5164, 180 + 743318851 * Login.loginBoxX, 201, 16776960, 0);
               int var58 = 221;
               FadeOutTask.method10363(var2, Login.Login_response1, 743318851 * Login.loginBoxX + 180, var58, 16776960, 0);
               var58 += 15;
               FadeOutTask.method10363(var2, Login.Login_response2, 180 + 743318851 * Login.loginBoxX, var58, 16776960, 0);
               var58 += 15;
               FadeOutTask.method10363(var2, Login.Login_response3, 743318851 * Login.loginBoxX + 180, var58, 16776960, 0);
               var58 += 15;
               var58 += 14;
               var0.method10402(Strings.field5109, 180 + 743318851 * Login.loginBoxX - 145, var58, 16777215, 0);
               short var121 = 174;

               String var154;
               for (var154 = ClanMate.method10777((byte)-94); var0.stringWidth(var154) > var121; var154 = var154.substring(1)) {
                  if (var3 <= 1783777249) {
                     return;
                  }
               }

               var0.method10402(
                  AbstractFont.escapeBrackets(var154)
                     + (client.cycle * 1759706017 % 40 < 20 ? class144.colorStartTag(16776960, 415252823) + classDF.field1347 : ""),
                  743318851 * Login.loginBoxX + 180 - 34,
                  var58,
                  16777215,
                  0
               );
               var58 += 15;
               int var174 = Login.loginBoxX * 743318851 + 180 - 80;
               short var188 = 321;
               World.titlebuttonSprite.drawAt(var174 - 73, var188 - 20);
               FadeOutTask.method10363(var0, Strings.field4897, var174, var188 + 5, 16777215, 0);
               var174 = 80 + 180 + Login.loginBoxX * 743318851;
               World.titlebuttonSprite.drawAt(var174 - 73, var188 - 20);
               FadeOutTask.method10363(var0, Strings.field5066, var174, var188 + 5, 16777215, 0);
               var188 = 356;
               FadeOutTask.method10363(var1, Strings.field5113, CollisionMap.loginBoxCenter * -1998333989, var188, 268435455, 0);
            } else if (-1614560929 * Login.loginIndex == 6) {
               int var64 = 201;
               FadeOutTask.method10363(var0, Login.Login_response1, 180 + Login.loginBoxX * 743318851, var64, 16776960, 0);
               var64 += 15;
               FadeOutTask.method10363(var0, Login.Login_response2, 743318851 * Login.loginBoxX + 180, var64, 16776960, 0);
               var64 += 15;
               FadeOutTask.method10363(var0, Login.Login_response3, Login.loginBoxX * 743318851 + 180, var64, 16776960, 0);
               var64 += 15;
               int var122 = 180 + Login.loginBoxX * 743318851;
               short var155 = 321;
               World.titlebuttonSprite.drawAt(var122 - 73, var155 - 20);
               FadeOutTask.method10363(var0, Strings.field5066, var122, 5 + var155, 16777215, 0);
            } else {
               label990:
               if (Login.loginIndex * -1614560929 == 7) {
                  if (Frames.field3189) {
                     if (var3 <= 1783777249) {
                        return;
                     }

                     if (!client.onMobile) {
                        int var72 = 201;
                        FadeOutTask.method10363(var0, Login.Login_response1, CollisionMap.loginBoxCenter * -1998333989, var72, 16776960, 0);
                        var72 += 15;
                        FadeOutTask.method10363(var0, Login.Login_response2, -1998333989 * CollisionMap.loginBoxCenter, var72, 16776960, 0);
                        var72 += 15;
                        FadeOutTask.method10363(var0, Login.Login_response3, CollisionMap.loginBoxCenter * -1998333989, var72, 16776960, 0);
                        int var125 = CollisionMap.loginBoxCenter * -1998333989 - 150;
                        var72 += 10;

                        for (int var157 = 0; var157 < 8; var157++) {
                           if (var3 <= 1783777249) {
                              return;
                           }

                           World.titlebuttonSprite.method12433(var125, var72, 30, 40);
                           boolean var210;
                           if (465659907 * Login.field386 == var157) {
                              if (var3 <= 1783777249) {
                                 return;
                              }

                              var210 = true;
                           } else {
                              var210 = false;
                           }

                           boolean var176 = var210 & client.cycle * 1759706017 % 40 < 20;
                           var0.method10402(
                              (Login.field387[var157] == null ? "" : Login.field387[var157])
                                 + (var176 ? class144.colorStartTag(16776960, -1136302260) + classDF.field1347 : ""),
                              var125 + 10,
                              var72 + 27,
                              16777215,
                              0
                           );
                           if (var157 != 1 && 3 != var157) {
                              var125 += 35;
                           } else {
                              var125 += 50;
                              var0.method10402(AbstractFont.escapeBrackets("/"), var125 - 13, var72 + 27, 16777215, 0);
                           }
                        }

                        int var158 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                        short var177 = 321;
                        World.titlebuttonSprite.drawAt(var158 - 73, var177 - 20);
                        FadeOutTask.method10363(var0, "Submit", var158, var177 + 5, 16777215, 0);
                        var158 = 80 + CollisionMap.loginBoxCenter * -1998333989;
                        World.titlebuttonSprite.drawAt(var158 - 73, var177 - 20);
                        FadeOutTask.method10363(var0, Strings.field5137, var158, 5 + var177, 16777215, 0);
                        break label990;
                     }
                  }

                  int var68 = 216;
                  FadeOutTask.method10363(var0, Strings.field5138, Login.loginBoxX * 743318851 + 180, var68, 16776960, 0);
                  var68 += 15;
                  FadeOutTask.method10363(var2, Strings.field5146, 180 + Login.loginBoxX * 743318851, var68, 16776960, 0);
                  var68 += 15;
                  FadeOutTask.method10363(var2, Strings.field5140, 180 + 743318851 * Login.loginBoxX, var68, 16776960, 0);
                  var68 += 15;
                  int var123 = 180 + 743318851 * Login.loginBoxX - 80;
                  short var156 = 321;
                  World.titlebuttonSprite.drawAt(var123 - 73, var156 - 20);
                  FadeOutTask.method10363(var0, Strings.field5141, var123, var156 + 5, 16777215, 0);
                  var123 = 80 + Login.loginBoxX * 743318851 + 180;
                  World.titlebuttonSprite.drawAt(var123 - 73, var156 - 20);
                  FadeOutTask.method10363(var0, Strings.field5066, var123, var156 + 5, 16777215, 0);
               } else if (-1614560929 * Login.loginIndex == 8) {
                  int var76 = 216;
                  FadeOutTask.method10363(var0, Strings.field4994, 180 + 743318851 * Login.loginBoxX, var76, 16776960, 0);
                  var76 += 15;
                  FadeOutTask.method10363(var2, Strings.field4995, Login.loginBoxX * 743318851 + 180, var76, 16776960, 0);
                  var76 += 15;
                  FadeOutTask.method10363(var2, Strings.field4892, Login.loginBoxX * 743318851 + 180, var76, 16776960, 0);
                  var76 += 15;
                  int var126 = 743318851 * Login.loginBoxX + 180 - 80;
                  short var160 = 321;
                  World.titlebuttonSprite.drawAt(var126 - 73, var160 - 20);
                  FadeOutTask.method10363(var0, Strings.field4997, var126, var160 + 5, 16777215, 0);
                  var126 = 743318851 * Login.loginBoxX + 180 + 80;
                  World.titlebuttonSprite.drawAt(var126 - 73, var160 - 20);
                  FadeOutTask.method10363(var0, Strings.field5066, var126, 5 + var160, 16777215, 0);
               } else if (9 == Login.loginIndex * -1614560929) {
                  int var80 = 221;
                  FadeOutTask.method10363(var0, Login.Login_response1, 180 + Login.loginBoxX * 743318851, var80, 16776960, 0);
                  var80 += 25;
                  FadeOutTask.method10363(var0, Login.Login_response2, 180 + Login.loginBoxX * 743318851, var80, 16776960, 0);
                  var80 += 25;
                  FadeOutTask.method10363(var0, Login.Login_response3, 180 + 743318851 * Login.loginBoxX, var80, 16776960, 0);
                  int var128 = 180 + 743318851 * Login.loginBoxX;
                  short var161 = 311;
                  World.titlebuttonSprite.drawAt(var128 - 73, var161 - 20);
                  FadeOutTask.method10363(var0, Strings.field5106, var128, 5 + var161, 16777215, 0);
               } else if (-1614560929 * Login.loginIndex == 10) {
                  int var83 = 743318851 * Login.loginBoxX + 180;
                  int var129 = 209;
                  FadeOutTask.method10363(var0, Strings.field5005, 743318851 * Login.loginBoxX + 180, var129, 16776960, 0);
                  var129 += 20;
                  classLX.field3801.drawAt(var83 - 109, var129);
                  if (Login.displayName.isEmpty()) {
                     if (var3 <= 1783777249) {
                        return;
                     }

                     TriBool.field5954.drawAt(var83 - 48, 18 + var129);
                  } else {
                     TriBool.field5954.drawAt(var83 - 48, 5 + var129);
                     FadeOutTask.method10363(var0, Login.displayName, var83, 68 + var129 - 15, 16776960, 0);
                  }
               } else if (12 == Login.loginIndex * -1614560929) {
                  int var84 = -1998333989 * CollisionMap.loginBoxCenter;
                  int var131 = 216;
                  FadeOutTask.method10363(var2, Strings.field5145, var84, var131, 16777215, 0);
                  var131 += 17;
                  FadeOutTask.method10363(var2, Strings.field4996, var84, var131, 16777215, 0);
                  var131 += 17;
                  FadeOutTask.method10363(var2, Strings.field4865, var84, var131, 16777215, 0);
                  var131 += 17;
                  FadeOutTask.method10363(var2, Strings.field5148, var84, var131, 16777215, 0);
                  var84 = -1998333989 * CollisionMap.loginBoxCenter - 80;
                  short var135 = 311;
                  World.titlebuttonSprite.drawAt(var84 - 73, var135 - 20);
                  FadeOutTask.method10363(var0, Strings.field5102, var84, 5 + var135, 16777215, 0);
                  var84 = CollisionMap.loginBoxCenter * -1998333989 + 80;
                  World.titlebuttonSprite.drawAt(var84 - 73, var135 - 20);
                  FadeOutTask.method10363(var0, Strings.field5152, var84, 5 + var135, 16777215, 0);
               } else if (13 == Login.loginIndex * -1614560929) {
                  if (var3 <= 1783777249) {
                     return;
                  }

                  int var87 = 231;
                  FadeOutTask.method10363(var2, Strings.field5149, 743318851 * Login.loginBoxX + 180, var87, 16777215, 0);
                  var87 += 20;
                  FadeOutTask.method10363(var2, Strings.field5150, Login.loginBoxX * 743318851 + 180, var87, 16777215, 0);
                  int var136 = Login.loginBoxX * 743318851 + 180;
                  short var89 = 311;
                  World.titlebuttonSprite.drawAt(var136 - 73, var89 - 20);
                  FadeOutTask.method10363(var0, Strings.field5066, var136, var89 + 5, 16777215, 0);
               } else if (14 == Login.loginIndex * -1614560929) {
                  int var90 = 201;
                  String var137 = "";
                  String var162 = "";
                  String var178 = "";
                  switch (Login.Login_banType * -1858173113) {
                     case 0:
                        var137 = Strings.field4907;
                        var162 = Strings.field4908;
                        var178 = Strings.field4909;
                        break;
                     case 1:
                        var137 = Strings.field4946;
                        var162 = Strings.field4947;
                        var178 = Strings.field4948;
                        break;
                     case 2:
                        var137 = Strings.field4982;
                        var162 = Strings.field4983;
                        var178 = Strings.field4984;
                        break;
                     default:
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)4322);
                  }

                  FadeOutTask.method10363(var0, var137, 180 + 743318851 * Login.loginBoxX, var90, 16776960, 0);
                  var90 += 20;
                  FadeOutTask.method10363(var0, var162, 180 + Login.loginBoxX * 743318851, var90, 16776960, 0);
                  var90 += 20;
                  FadeOutTask.method10363(var0, var178, 180 + Login.loginBoxX * 743318851, var90, 16776960, 0);
                  int var190 = Login.loginBoxX * 743318851 + 180;
                  short var195 = 276;
                  World.titlebuttonSprite.drawAt(var190 - 73, var195 - 20);
                  if (Login.Login_banType * -1858173113 == 1) {
                     if (var3 <= 1783777249) {
                        return;
                     }

                     FadeOutTask.method10363(var0, Strings.field4891, var190, var195 + 5, 16777215, 0);
                  } else {
                     FadeOutTask.method10363(var0, Strings.field4890, var190, var195 + 5, 16777215, 0);
                  }

                  var190 = 180 + 743318851 * Login.loginBoxX;
                  var195 = 326;
                  World.titlebuttonSprite.drawAt(var190 - 73, var195 - 20);
                  FadeOutTask.method10363(var0, Strings.field5066, var190, 5 + var195, 16777215, 0);
               } else if (24 == -1614560929 * Login.loginIndex) {
                  int var93 = 221;
                  FadeOutTask.method10363(var0, Login.Login_response1, 180 + 743318851 * Login.loginBoxX, var93, 16777215, 0);
                  var93 += 15;
                  FadeOutTask.method10363(var0, Login.Login_response2, 743318851 * Login.loginBoxX + 180, var93, 16777215, 0);
                  var93 += 15;
                  FadeOutTask.method10363(var0, Login.Login_response3, Login.loginBoxX * 743318851 + 180, var93, 16777215, 0);
                  var93 += 15;
                  int var138 = 743318851 * Login.loginBoxX + 180;
                  short var163 = 301;
                  World.titlebuttonSprite.drawAt(var138 - 73, var163 - 20);
                  FadeOutTask.method10363(var0, Strings.field5110, var138, 5 + var163, 16777215, 0);
               } else if (32 == -1614560929 * Login.loginIndex) {
                  int var97 = 216;
                  FadeOutTask.method10363(var0, Strings.field5138, 180 + 743318851 * Login.loginBoxX, var97, 16776960, 0);
                  var97 += 15;
                  FadeOutTask.method10363(var2, Strings.field5146, Login.loginBoxX * 743318851 + 180, var97, 16776960, 0);
                  var97 += 15;
                  FadeOutTask.method10363(var2, Strings.field5140, Login.loginBoxX * 743318851 + 180, var97, 16776960, 0);
                  var97 += 15;
                  int var139 = 180 + 743318851 * Login.loginBoxX - 80;
                  short var164 = 321;
                  World.titlebuttonSprite.drawAt(var139 - 73, var164 - 20);
                  FadeOutTask.method10363(var0, Strings.field5141, var139, var164 + 5, 16777215, 0);
                  var139 = 80 + 743318851 * Login.loginBoxX + 180;
                  World.titlebuttonSprite.drawAt(var139 - 73, var164 - 20);
                  FadeOutTask.method10363(var0, Strings.field5066, var139, var164 + 5, 16777215, 0);
               } else if (33 == -1614560929 * Login.loginIndex) {
                  int var101 = 201;
                  FadeOutTask.method10363(var0, Login.Login_response1, 743318851 * Login.loginBoxX + 180, var101, 16776960, 0);
                  var101 += 20;
                  FadeOutTask.method10363(var1, Login.Login_response2, Login.loginBoxX * 743318851 + 180, var101, 16776960, 0);
                  var101 += 20;
                  FadeOutTask.method10363(var1, Login.Login_response3, 180 + Login.loginBoxX * 743318851, var101, 16776960, 0);
                  var101 += 15;
                  int var141 = 180 + 743318851 * Login.loginBoxX;
                  short var165 = 276;
                  World.titlebuttonSprite.drawAt(var141 - 73, var165 - 20);
                  FadeOutTask.method10363(var2, Strings.field5165, var141, var165 + 5, 16777215, 0);
                  var141 = 180 + Login.loginBoxX * 743318851;
                  var165 = 326;
                  World.titlebuttonSprite.drawAt(var141 - 73, var165 - 20);
                  FadeOutTask.method10363(var2, Strings.field5066, var141, var165 + 5, 16777215, 0);
               } else if (Login.loginIndex * -1614560929 == 34) {
                  int var105 = 201;
                  FadeOutTask.method10363(var0, Login.Login_response1, 743318851 * Login.loginBoxX + 180, var105, 16776960, 0);
                  var105 += 20;
                  FadeOutTask.method10363(var1, Login.Login_response2, 180 + Login.loginBoxX * 743318851, var105, 16776960, 0);
                  var105 += 20;
                  FadeOutTask.method10363(var1, Login.Login_response3, 180 + Login.loginBoxX * 743318851, var105, 16776960, 0);
                  int var143 = 743318851 * Login.loginBoxX + 180;
                  short var167 = 276;
                  World.titlebuttonSprite.drawAt(var143 - 73, var167 - 20);
                  String var179 = null != Huffman.World_request ? Strings.field5162 : Strings.field5135;
                  FadeOutTask.method10363(var2, var179, var143, var167 + 5, 16777215, 0);
                  var143 = Login.loginBoxX * 743318851 + 180;
                  var167 = 326;
                  World.titlebuttonSprite.drawAt(var143 - 73, var167 - 20);
                  FadeOutTask.method10363(var2, Strings.field5066, var143, var167 + 5, 16777215, 0);
               }
            }
         }

         if (client.gameState * 1271535343 >= 10) {
            int[] var108 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var108);
            Rasterizer2D.Rasterizer2D_setClip(921778921 * Login.xPadding, 0, 765 + Login.xPadding * 921778921, class374.canvasHeight * 19292887);
            LoginScreenAnimation.method1353(class204.loginScreenRunesAnimation, Login.xPadding * 921778921 - 22, 1759706017 * client.cycle, -501971477);
            LoginScreenAnimation.method1353(
               class204.loginScreenRunesAnimation, 22 + 765 + Login.xPadding * 921778921 - 128, 1759706017 * client.cycle, 20092780
            );
            Rasterizer2D.Rasterizer2D_setClipArray(var108);
         }

         FadeOutTask.title_muteSprite[class468.clientPreferences.isTitleMusicDisabled(-1016083706) ? 1 : 0].drawAt(765 + Login.xPadding * 921778921 - 40, 463);
         if (client.gameState * 1271535343 > 5 && class352.clientLanguage == Language.Language_EN) {
            if (ModelData0.field3492 != null) {
               int var109 = Login.xPadding * 921778921 + 5;
               short var145 = 463;
               byte var169 = 100;
               byte var180 = 35;
               ModelData0.field3492.drawAt(var109, var145);
               FadeOutTask.method10363(var0, Strings.field5035 + " " + 1312022025 * client.worldId, var109 + var169 / 2, var145 + var180 / 2 - 2, 16777215, 0);
               if (null != Huffman.World_request) {
                  FadeOutTask.method10363(var1, Strings.field5162, var109 + var169 / 2, var180 / 2 + var145 + 12, 16777215, 0);
               } else {
                  FadeOutTask.method10363(var1, Strings.field5163, var169 / 2 + var109, var145 + var180 / 2 + 12, 16777215, 0);
               }
            } else {
               ModelData0.field3492 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "sl_button", "", 1952328785);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ty")
   public int method1489() {
      return this.health2 * -712865399;
   }

   @ObfuscatedSignature(descriptor = "(Lmm;S)V")
   @ObfuscatedName("kt")
   static final void method1487(classMM var0, short var1) {
      try {
         PacketBuffer var2 = client.packetWriter.packetBuffer;
         if (classMM.field3970 == var0) {
            if (var1 != 187) {
               int var33 = var2.method12183(148355530);
               int var45 = var2.method12183(-1709399725);
               int var58 = var2.readUnsignedShortLE((byte)26);
               int var71 = var2.readUnsignedByteAdd(1207355042);
               int var85 = 2115028565 * AsyncHttpResponse.worldView.plane;
               int var98 = AsyncHttpResponse.worldView.baseX * 825809917 + 989003393 * SpriteBufferProperties.field90 + (var71 >> 4 & 7);
               int var109 = 1279964673 * AsyncHttpResponse.worldView.baseY + classSA.field5752 * 1791732441 + (var71 & 7);
               int var119 = var2.readUnsignedShortAddLE(1624177600);
               int var125 = var2.readUnsignedByteAdd(-807317396);
               int var130 = Buffer.method12008(var2, (byte)5);
               int var136 = var2.readUnsignedShortLE((byte)-22);
               int var138 = var2.readUnsignedShortAddLE(-221620385);
               int var139 = Buffer.method12203(var2, -1523851807);
               int var140 = Coord.method8288(var139, -2077832540);
               int var141 = Coord.method8292(var139, 825907999);
               int var142 = Coord.method8294(var139, 1346086770);
               int var143 = var2.readUnsignedShortAdd(-1156088784);
               if (65535 != var143) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  }

                  Projectile var20 = new Projectile(
                     var85,
                     var98,
                     var109,
                     var130,
                     var33,
                     var140,
                     var141,
                     var142,
                     var119,
                     var45,
                     var143,
                     client.cycle * 1759706017 + var58,
                     var138 + client.cycle * 1759706017,
                     var125,
                     var136
                  );
                  client.projectiles.addFirst(var20);
               }
            }
         } else if (var0 == classMM.field3966) {
            if (var1 == 187) {
               throw new IllegalStateException();
            } else {
               int var32 = var2.readUnsignedByte(-666337807) & 31;
               int var44 = var2.readUnsignedByteNeg(844162162);
               int var57 = (var44 >> 4 & 7) + SpriteBufferProperties.field90 * 989003393;
               int var70 = classSA.field5752 * 1791732441 + (var44 & 7);
               int var84 = var2.readUnsignedByteSub((byte)3);
               int var97 = var2.readUnsignedShortAdd(-1156088784);
               int var108 = var2.readUnsignedByteSub((byte)24);
               int var118 = var2.readUnsignedByteSub((byte)-42);
               if (var57 >= 0) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  }

                  if (var70 >= 0) {
                     if (var1 == 187) {
                        throw new IllegalStateException();
                     }

                     if (var57 < AsyncHttpResponse.worldView.sizeX * 2010544793) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        if (var70 < 1823353167 * AsyncHttpResponse.worldView.sizeY) {
                           if (var1 == 187) {
                              return;
                           }

                           int var124 = var32 + 1;
                           if (class330.localPlayer.pathX[0] >= var57 - var124 && class330.localPlayer.pathX[0] <= var124 + var57) {
                              if (var1 == 187) {
                                 return;
                              }

                              if (class330.localPlayer.pathY[0] >= var70 - var124) {
                                 if (var1 == 187) {
                                    throw new IllegalStateException();
                                 }

                                 if (class330.localPlayer.pathY[0] <= var70 + var124) {
                                    if (var1 == 187) {
                                       throw new IllegalStateException();
                                    }

                                    classEM.method3784(AsyncHttpResponse.worldView.id * 577964535, var97, var57, var70, var32, var84, var108, var118, (byte)77);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else if (classMM.field3969 == var0) {
            if (var1 == 187) {
               throw new IllegalStateException();
            } else {
               int var31 = Buffer.method12008(var2, (byte)5);
               int var43 = var2.readUnsignedByteSub((byte)65);
               int var56 = Buffer.method12008(var2, (byte)5);
               int var69 = var2.readUnsignedByteAdd(468044693);
               int var82 = (var69 >> 4 & 7) + SpriteBufferProperties.field90 * 989003393;
               int var95 = (var69 & 7) + 1791732441 * classSA.field5752;
               if (var82 >= 0) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  }

                  if (var95 >= 0) {
                     if (var1 == 187) {
                        return;
                     }

                     if (var82 < AsyncHttpResponse.worldView.sizeX * 2010544793) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        if (var95 < AsyncHttpResponse.worldView.sizeY * 1823353167) {
                           if (var1 == 187) {
                              throw new IllegalStateException();
                           }

                           var82 = Coord.method8306(var82, 248986601);
                           var95 = Coord.method8306(var95, 248986601);
                           int var151;
                           if (-1 == client.overheadTextLimit * -1348022309) {
                              if (var1 == 187) {
                                 return;
                              }

                              var151 = 2115028565 * AsyncHttpResponse.worldView.plane;
                           } else {
                              var151 = client.overheadTextLimit * -1348022309;
                           }

                           int var107 = var151;
                           GraphicsObject var117 = new GraphicsObject(
                              AsyncHttpResponse.worldView,
                              var31,
                              var107,
                              var82,
                              var95,
                              NPCComposition.getTileHeight(AsyncHttpResponse.worldView, var82, var95, var107, -253070517) - var43,
                              var56,
                              client.cycle * 1759706017
                           );
                           AsyncHttpResponse.worldView.graphicsObjects.addFirst(var117);
                        }
                     }
                  }
               }
            }
         } else if (classMM.field3973 == var0) {
            if (var1 == 187) {
               throw new IllegalStateException();
            } else {
               int var30 = var2.readUnsignedByteNeg(-585626256);
               String[] var42 = null;
               if (var30 > 0) {
                  if (var1 == 187) {
                     return;
                  }

                  var42 = new String[5];

                  for (int var54 = 0; var54 < var30; var54++) {
                     if (var1 == 187) {
                        throw new IllegalStateException();
                     }

                     int var67 = var2.readUnsignedByteSub((byte)20);
                     String var80 = var2.readStringCp1252NullCircumfixed(1626367697);
                     if (var67 >= 0 && var67 < 5) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        var42[var67] = var80;
                     }
                  }
               }

               int var55 = var2.readUnsignedByteNeg(-168805139);
               int var68 = var55 >> 2;
               int var81 = var55 & 3;
               int var94 = client.field648[var68];
               int var106 = var2.readUnsignedByteAdd(1631630749);
               int var116 = var2.readUnsignedShortAdd(-1156088784);
               int var123 = var2.readUnsignedByteAdd(17868086);
               int var129 = (var123 >> 4 & 7) + 989003393 * SpriteBufferProperties.field90;
               int var135 = (var123 & 7) + 1791732441 * classSA.field5752;
               if (var129 >= 0) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  }

                  if (var135 >= 0 && var129 < 2010544793 * AsyncHttpResponse.worldView.sizeX) {
                     if (var1 == 187) {
                        throw new IllegalStateException();
                     }

                     if (var135 < AsyncHttpResponse.worldView.sizeY * 1823353167) {
                        int var137 = -1 == client.overheadTextLimit * -1348022309
                           ? AsyncHttpResponse.worldView.plane * 2115028565
                           : client.overheadTextLimit * -1348022309;
                        HttpRequest.method281(AsyncHttpResponse.worldView, var137, var129, var135, var94, var116, var68, var81, var106, var42, 0, -1, (byte)1);
                     }
                  }
               }
            }
         } else if (classMM.field3965 == var0) {
            if (var1 == 187) {
               throw new IllegalStateException();
            } else {
               int var29 = var2.readUnsignedShortAddLE(-798681239);
               int var41 = Buffer.method12203(var2, -1515050398);
               int var53 = var2.readUnsignedIntLE(-1370916521);
               int var66 = var2.readUnsignedByteNeg(-798900746);
               int var79 = SpriteBufferProperties.field90 * 989003393 + (var66 >> 4 & 7);
               int var93 = classSA.field5752 * 1791732441 + (var66 & 7);
               if (var79 >= 0 && var93 >= 0) {
                  if (var1 == 187) {
                     return;
                  }

                  if (var79 < AsyncHttpResponse.worldView.sizeX * 2010544793) {
                     if (var1 == 187) {
                        return;
                     }

                     if (var93 < AsyncHttpResponse.worldView.sizeY * 1823353167) {
                        int var150;
                        if (-1 == client.overheadTextLimit * -1348022309) {
                           if (var1 == 187) {
                              return;
                           }

                           var150 = AsyncHttpResponse.worldView.plane * 2115028565;
                        } else {
                           var150 = -1348022309 * client.overheadTextLimit;
                        }

                        int var105 = var150;
                        WorldMapIcon_0.method7216(var105, var79, var93, var29, var41, var53, 1706559695);
                     }
                  }
               }
            }
         } else if (classMM.field3972 == var0) {
            int var28 = var2.readUnsignedByte(-1417884636);
            int var40 = var28 >> 2;
            int var52 = var28 & 3;
            int var65 = client.field648[var40];
            int var78 = var2.readUnsignedByteSub((byte)-1);
            int var92 = (var78 >> 4 & 7) + 989003393 * SpriteBufferProperties.field90;
            int var104 = 1791732441 * classSA.field5752 + (var78 & 7);
            if (var92 >= 0) {
               if (var1 == 187) {
                  return;
               }

               if (var104 >= 0) {
                  if (var1 == 187) {
                     return;
                  }

                  if (var92 < 2010544793 * AsyncHttpResponse.worldView.sizeX && var104 < AsyncHttpResponse.worldView.sizeY * 1823353167) {
                     if (var1 == 187) {
                        return;
                     }

                     int var149;
                     if (-1348022309 * client.overheadTextLimit == -1) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        var149 = 2115028565 * AsyncHttpResponse.worldView.plane;
                     } else {
                        var149 = client.overheadTextLimit * -1348022309;
                     }

                     int var115 = var149;
                     HttpRequest.method281(AsyncHttpResponse.worldView, var115, var92, var104, var65, -1, var40, var52, 31, null, 0, -1, (byte)1);
                  }
               }
            }
         } else if (classMM.field3971 == var0) {
            int var27 = var2.readUnsignedByteNeg(387756478);
            int var39 = var27 >> 2;
            int var51 = var27 & 3;
            int var64 = client.field648[var39];
            int var77 = var2.readUnsignedShortAddLE(-977265209);
            int var91 = var2.readUnsignedByteNeg(-958181421);
            int var103 = (var91 >> 4 & 7) + 989003393 * SpriteBufferProperties.field90;
            int var114 = (var91 & 7) + classSA.field5752 * 1791732441;
            if (0 <= var103 && var103 < 103) {
               if (var1 == 187) {
                  return;
               }

               if (0 <= var114) {
                  if (var1 == 187) {
                     return;
                  }

                  if (var114 < 103) {
                     if (var1 == 187) {
                        throw new IllegalStateException();
                     }

                     int var148;
                     if (-1 == -1348022309 * client.overheadTextLimit) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        var148 = 2115028565 * AsyncHttpResponse.worldView.plane;
                     } else {
                        var148 = client.overheadTextLimit * -1348022309;
                     }

                     int var122 = var148;
                     PendingSpawn var128 = class67.method3010(AsyncHttpResponse.worldView, var122, var103, var114, var64, 650148394);
                     if (var128 != null) {
                        ObjectComposition var133 = AsyncHttpResponse.getObjectDefinition(-1096388433 * var128.objectId2, 2019137154);
                        if (var133.field2696) {
                           if (var1 == 187) {
                              throw new IllegalStateException();
                           }

                           classPE.method8719(var122, var103, var114, var39, var51, var64, var77, 1228825693);
                           var128.field1247 = 735477441 * var77;
                           return;
                        }
                     }

                     boolean var134 = classPE.method8719(var122, var103, var114, var39, var51, var64, var77, 1674043014);
                     if (var134) {
                        if (var1 == 187) {
                           return;
                        }

                        return;
                     }

                     if (var128 != null) {
                        if (var1 == 187) {
                           return;
                        }

                        var128.field1247 = 735477441 * var77;
                     }
                  }
               }
            }
         } else if (var0 == classMM.field3975) {
            if (var1 == 187) {
               throw new IllegalStateException();
            } else {
               int var26 = var2.readUnsignedByteSub((byte)40);
               int var38 = SpriteBufferProperties.field90 * 989003393 + (var26 >> 4 & 7);
               int var50 = 1791732441 * classSA.field5752 + (var26 & 7);
               int var63 = var2.method12164((byte)-30);
               int var76 = var2.readUnsignedIntLE(-1370916521);
               int var90 = var2.readUnsignedShortAddLE(455525012);
               int var102 = var2.readShortLE(1324472991);
               int var113 = var2.readUnsignedShortAddLE(669784312);
               short var121 = (short)var2.readShortLE(1529160260);
               short var127 = (short)var2.readShortLE(1940086409);
               if (var38 >= 0) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  }

                  if (var50 >= 0) {
                     if (var1 == 187) {
                        throw new IllegalStateException();
                     }

                     if (var38 < 104 && var50 < 104) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        int var132 = -1 == -1348022309 * client.overheadTextLimit
                           ? AsyncHttpResponse.worldView.plane * 2115028565
                           : client.overheadTextLimit * -1348022309;
                        AbstractWorldMapData.method7257(var132, var38, var50, var90, var76, var121, var63, var127, var102, var113, -63104703);
                     }
                  }
               }
            }
         } else {
            if (classMM.field3968 == var0) {
               if (var1 == 187) {
                  return;
               }

               int var3 = var2.readUnsignedByteNeg(-1320106599);
               int var4 = (var3 >> 4 & 7) + 989003393 * SpriteBufferProperties.field90;
               int var5 = (var3 & 7) + classSA.field5752 * 1791732441;
               int var6 = var2.readUnsignedByte(-1448623277);
               int var7 = Buffer.method12008(var2, (byte)5);
               int var8 = AsyncHttpResponse.worldView.plane * 2115028565;
               if (var4 >= 0) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  }

                  if (var5 >= 0 && var4 < AsyncHttpResponse.worldView.sizeX * 2010544793) {
                     if (var1 == 187) {
                        throw new IllegalStateException();
                     }

                     if (var5 < 1823353167 * AsyncHttpResponse.worldView.sizeY) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        NodeDeque var101 = AsyncHttpResponse.worldView.groundItems[var8][var4][var5];
                        if (var101 != null) {
                           if (var1 == 187) {
                              return;
                           }

                           for (TileItem var111 = (TileItem)var101.last(); var111 != null; var111 = (TileItem)var101.previous()) {
                              if (var111.visibleTime * 782226465 == var7) {
                                 if (var1 == 187) {
                                    return;
                                 }

                                 TileItem.method3035(var111, var6, (byte)15);
                                 break;
                              }
                           }
                        }

                        if (var4 >= 0 && var5 >= 0) {
                           if (var1 == 187) {
                              throw new IllegalStateException();
                           }

                           if (var4 < AsyncHttpResponse.worldView.sizeX * 2010544793) {
                              if (var1 == 187) {
                                 throw new IllegalStateException();
                              }

                              if (var5 < AsyncHttpResponse.worldView.sizeY * 1823353167) {
                                 if (var1 == 187) {
                                    throw new IllegalStateException();
                                 }

                                 int var147;
                                 if (client.overheadTextLimit * -1348022309 == -1) {
                                    if (var1 == 187) {
                                       throw new IllegalStateException();
                                    }

                                    var147 = AsyncHttpResponse.worldView.plane * 2115028565;
                                 } else {
                                    var147 = -1348022309 * client.overheadTextLimit;
                                 }

                                 int var112 = var147;
                                 HttpMethod.method372(var112, var4, var5, var7, var6, (byte)-14);
                              }
                           }
                        }

                        return;
                     }
                  }
               }
            }

            if (classMM.field3964 == var0) {
               if (var1 != 187) {
                  int var25 = Buffer.method12008(var2, (byte)5);
                  int var37 = var2.readUnsignedByteAdd(550830044);
                  int var49 = 989003393 * SpriteBufferProperties.field90 + (var37 >> 4 & 7);
                  int var62 = (var37 & 7) + classSA.field5752 * 1791732441;
                  int var75 = var2.readUnsignedIntLE(-1370916521);
                  int var89 = 2115028565 * AsyncHttpResponse.worldView.plane;
                  if (0 <= var49) {
                     if (var1 == 187) {
                        throw new IllegalStateException();
                     }

                     if (var49 < 104) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        if (0 <= var62) {
                           if (var1 == 187) {
                              throw new IllegalStateException();
                           }

                           if (var62 < 104) {
                              if (var1 == 187) {
                                 throw new IllegalStateException();
                              }

                              int var146;
                              if (-1 == client.overheadTextLimit * -1348022309) {
                                 if (var1 == 187) {
                                    return;
                                 }

                                 var146 = var89;
                              } else {
                                 var146 = -1348022309 * client.overheadTextLimit;
                              }

                              int var100 = var146;
                              WorldMapLabel.method7294(var100, var49, var62, var25, var75, (byte)104);
                           }
                        }
                     }
                  }
               }
            } else {
               if (var0 == classMM.field3967) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  }

                  int var22 = var2.readUnsignedByte(-379142635);
                  int var34 = var22 >> 2;
                  int var46 = var22 & 3;
                  int var59 = client.field648[var34];
                  byte var72 = var2.readByteAdd((byte)-13);
                  int var86 = var2.readUnsignedShortAdd(-1156088784);
                  int var9 = var2.readUnsignedShortAdd(-1156088784);
                  byte var10 = var2.readByteSub(-639471049);
                  byte var11 = var2.readByteSub(-639471049);
                  int var12 = Buffer.method12008(var2, (byte)5);
                  int var13 = var2.readUnsignedByteAdd(799195325);
                  int var14 = SpriteBufferProperties.field90 * 989003393 + (var13 >> 4 & 7);
                  int var15 = (var13 & 7) + 1791732441 * classSA.field5752;
                  int var16 = var2.readUnsignedShortLE((byte)-51);
                  byte var17 = var2.readByteNeg(344605225);
                  Player var18;
                  if (-1548864151 * client.localPlayerIndex == var9) {
                     if (var1 == 187) {
                        throw new IllegalStateException();
                     }

                     var18 = class330.localPlayer;
                  } else {
                     var18 = (Player)AsyncHttpResponse.worldView.npcs.get(var9);
                  }

                  if (null != var18) {
                     int var10000;
                     if (-1 == client.overheadTextLimit * -1348022309) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        var10000 = AsyncHttpResponse.worldView.plane * 2115028565;
                     } else {
                        var10000 = client.overheadTextLimit * -1348022309;
                     }

                     int var19 = var10000;
                     class586.method11718(var19, var14, var15, var34, var46, var59, var16, var86, var12, var11, var72, var17, var10, var18, 72748354);
                  }
               }

               if (var0 == classMM.field3976) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  } else {
                     int var24 = var2.readUnsignedShortAdd(-1156088784);
                     int var36 = var2.readUnsignedByteSub((byte)-9);
                     int var48 = (var36 >> 4 & 7) + SpriteBufferProperties.field90 * 989003393;
                     int var61 = (var36 & 7) + classSA.field5752 * 1791732441;
                     boolean var144;
                     if (var2.readUnsignedByteSub((byte)-6) == 1) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        var144 = 1;
                     } else {
                        var144 = 0;
                     }

                     boolean var74 = (boolean)var144;
                     int var88 = var2.readUnsignedByteSub((byte)-43);
                     int var99 = var2.readUnsignedByteAdd(-484320863);
                     int var110 = var2.readUnsignedShortLE((byte)-89);
                     int var120 = var2.readUnsignedIntLE(-1370916521);
                     int var126 = Buffer.method12008(var2, (byte)5);
                     if (var48 >= 0) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        if (var61 >= 0 && var48 < 2010544793 * AsyncHttpResponse.worldView.sizeX) {
                           if (var1 == 187) {
                              throw new IllegalStateException();
                           }

                           if (var61 < AsyncHttpResponse.worldView.sizeY * 1823353167) {
                              if (var1 == 187) {
                                 return;
                              }

                              if (-1348022309 * client.overheadTextLimit == -1) {
                                 if (var1 == 187) {
                                    throw new IllegalStateException();
                                 }

                                 var144 = AsyncHttpResponse.worldView.plane * 2115028565;
                              } else {
                                 var144 = -1348022309 * client.overheadTextLimit;
                              }

                              int var131 = var144;
                              Widget.addTileItemToGroundItems(var131, var48, var61, var110, var120, var88, var24, var126, var99, var74, 132153981);
                           }
                        }
                     }
                  }
               } else if (var0 == classMM.field3974) {
                  if (var1 == 187) {
                     throw new IllegalStateException();
                  } else {
                     int var23 = var2.readUnsignedByte(-1166793700);
                     int var35 = SpriteBufferProperties.field90 * 989003393 + (var23 >> 4 & 7);
                     int var47 = (var23 & 7) + classSA.field5752 * 1791732441;
                     int var60 = Buffer.method12203(var2, -1713136517);
                     int var73 = var2.readUnsignedShortAddLE(1062034144);
                     if (var35 >= 0) {
                        if (var1 == 187) {
                           throw new IllegalStateException();
                        }

                        if (var47 >= 0) {
                           if (var1 == 187) {
                              throw new IllegalStateException();
                           }

                           if (var35 < 104 && var47 < 104) {
                              if (var1 == 187) {
                                 return;
                              }

                              int var87 = -1 == client.overheadTextLimit * -1348022309
                                 ? 2115028565 * AsyncHttpResponse.worldView.plane
                                 : client.overheadTextLimit * -1348022309;
                              AbstractWorldMapData.method7258(var87, var35, var47, var73, var60, (byte)66);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var21) {
         throw RestClientThreadFactory.newRunException(var21, "cj.kt(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lra;Lra;)V")
   @ObfuscatedName("sc")
   public static void method1484(class461 var0, class461 var1) {
      if (var0 == null) {
         var0.method9342();
      }

      var0.field5502 = var1.field5502;
      var0.field5499 = var1.field5499;
      var0.field5500 = var1.field5500;
      var0.field5501 = var1.field5501;
   }

   HealthBarUpdate(int var1, int var2, int var3, int var4) {
      this.cycle = var1 * -63104703;
      this.health = var2 * 2049354777;
      this.health2 = -1311064903 * var3;
      this.cycleOffset = -1615261535 * var4;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("av")
   void set(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.cycle = var1 * -63104703;
         this.health = 2049354777 * var2;
         this.health2 = var3 * -1311064903;
         this.cycleOffset = var4 * -1615261535;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cj.av(" + ')');
      }
   }
}
