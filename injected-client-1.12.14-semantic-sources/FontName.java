import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vy")
public class FontName {
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final String field6343 = "Please ensure all characters are populated.";
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("at")
   public static final FontName FontName_plain12 = new FontName("p12_full");
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("ag")
   public static final FontName FontName_bold12 = new FontName("b12_full");
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("an")
   public static final FontName FontName_verdana11 = new FontName("verdana_11pt_regular");
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("ae")
   public static final FontName FontName_verdana13 = new FontName("verdana_13pt_regular");
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("aj")
   public static final FontName FontName_verdana15 = new FontName("verdana_15pt_regular");
   @ObfuscatedName("ak")
   String name;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field6339 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("dx")
   static final int field6341 = 2;
   @ObfuscatedSignature(descriptor = "Lgs;")
   @ObfuscatedName("bo")
   static ClanSettings field6342;
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("av")
   public static final FontName FontName_plain11 = new FontName("p11_full");
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6338 = 19;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6340 = 100;

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ap")
   static int Messages_getLastChatID(int var0, byte var1) {
      try {
         Message var2 = (Message)Messages.Messages_hashTable.get((long)var0);
         if (var2 == null) {
            if (var1 >= 2) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (Messages.Messages_queue.sentinel == var2.previousDual) {
            if (var1 >= 2) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 380472083 * ((Message)var2.previousDual).count;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vy.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)I")
   @ObfuscatedName("av")
   public static int method11646(int var0, int var1, int var2, byte var3) {
      try {
         var2 &= 3;
         if (var2 == 0) {
            if (var3 >= 22) {
               throw new IllegalStateException();
            } else {
               return var0;
            }
         } else if (var2 == 1) {
            if (var3 >= 22) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else if (2 == var2) {
            if (var3 >= 22) {
               throw new IllegalStateException();
            } else {
               return 7 - var0;
            }
         } else {
            return 7 - var1;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vy.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/lang/String;I)V")
   @ObfuscatedName("ma")
   static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4, int var5) {
      try {
         int var6 = var0 >>> 16;
         int var7 = var0 & 65535;
         Widget var8 = class226.widgetDefinition.getWidgetChild(var1, var2, -1789580762);
         if (var8 == null) {
            if (var5 != -1376442236) {
               throw new IllegalStateException();
            }
         } else {
            if (null != var8.onClickRepeat) {
               if (var5 != -1376442236) {
                  return;
               }

               ScriptEvent var9 = new ScriptEvent();
               var9.widget = var8;
               var9.opIndex = 1362671939 * var7;
               var9.field525 = 1029542137 * var6;
               var9.targetName = var4;
               var9.args = var8.onClickRepeat;
               class141.runScriptEvent(var9, 1856325427);
            }

            boolean var15 = true;
            if (var8.contentType * 1889823193 > 0) {
               if (var5 != -1376442236) {
                  return;
               }

               var15 = classVK.method11310(var8, -215288251);
            }

            if (!var15) {
               if (var5 == -1376442236) {
                  ;
               }
            } else {
               int var11 = class69.getWidgetFlags2(var8, (byte)-6);
               int var12 = var7 - 1;
               boolean var10 = (var11 >> var12 & 1) != 0;
               if (var10) {
                  if (var6 == 0) {
                     if (var5 != -1376442236) {
                        throw new IllegalStateException();
                     }

                     PacketBufferNode var13 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3898, client.packetWriter.isaacCipher, -1884859185);
                     var13.packetBuffer.writeInt(var1, 728575822);
                     var13.packetBuffer.writeShort(var2, -2007675029);
                     var13.packetBuffer.writeShort(var3, -1989001037);
                     var13.packetBuffer.writeByte(var7, (short)-27517);
                     PacketWriter.method3330(client.packetWriter, var13, -1771370198);
                  } else {
                     PacketBufferNode var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3924, client.packetWriter.isaacCipher, -2048700221);
                     var16.packetBuffer.writeInt(var1, 184982892);
                     var16.packetBuffer.writeShort(var2, -1919793599);
                     var16.packetBuffer.writeShort(var3, -1861859814);
                     var16.packetBuffer.writeByte(var7, (short)-21374);
                     var16.packetBuffer.writeByte(var6 - 1, (short)-1597);
                     PacketWriter.method3330(client.packetWriter, var16, -1771370198);
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "vy.ma(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcp;)V")
   @ObfuscatedName("no")
   public static void method11648(MouseRecorder var0) {
      if (var0 == null) {
         var0.method2640();
      }

      for (; var0.isRunning; LoginState.method484(50L)) {
         synchronized (var0.lock) {
            if (847414097 * var0.index < 2105577751) {
               var0.ys[847414097 * var0.index] = MouseHandler.MouseHandler_x * 1250910360;
               var0.xs[847414097 * var0.index] = MouseHandler.MouseHandler_y * -2089235901;
               var0.millis[1186873932 * var0.index] = MouseHandler.MouseHandler_millis * -3445429405105067917L;
               var0.index += 1350035881;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("aj")
   static int method11651(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 < 1000) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return classFR.method4049(var0, var1, var2, 1725515448);
            }
         } else if (var0 < 1100) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class329.method7394(var0, var1, var2, 999017463);
            }
         } else if (var0 < 1200) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return classWA.method11669(var0, var1, var2, (byte)110);
            }
         } else if (var0 < 1300) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return Varcs.method3164(var0, var1, var2, 327716789);
            }
         } else if (var0 < 1400) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class343.method7618(var0, var1, var2, 239604991);
            }
         } else if (var0 < 1500) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return LoginPacket.method4152(var0, var1, var2, -364498099);
            }
         } else if (var0 < 1600) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return EnumComposition.method4472(var0, var1, var2, (byte)0);
            }
         } else if (var0 < 1700) {
            return classPO.method8779(var0, var1, var2, 1833713655);
         } else if (var0 < 1800) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return HttpResponse.method144(var0, var1, var2, -1293624304);
            }
         } else if (var0 < 1900) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return Language.method8871(var0, var1, var2, -857343037);
            }
         } else if (var0 < 2000) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class39.method650(var0, var1, var2, -1622367182);
            }
         } else if (var0 < 2100) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class329.method7394(var0, var1, var2, 2058535397);
            }
         } else if (var0 < 2200) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return classWA.method11669(var0, var1, var2, (byte)111);
            }
         } else if (var0 < 2300) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return Varcs.method3164(var0, var1, var2, 327716789);
            }
         } else if (var0 < 2400) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class343.method7618(var0, var1, var2, -1174663954);
            }
         } else if (var0 < 2500) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return LoginPacket.method4152(var0, var1, var2, -364498099);
            }
         } else if (var0 < 2600) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return ScriptFrame.method1175(var0, var1, var2, (byte)0);
            }
         } else if (var0 < 2700) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class161.method4257(var0, var1, var2, -505709100);
            }
         } else if (var0 < 2800) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class165.method4410(var0, var1, var2, -1510379402);
            }
         } else if (var0 < 2900) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class180.method4265(var0, var1, var2, 1340280688);
            }
         } else if (var0 < 3000) {
            return class39.method650(var0, var1, var2, -1622367182);
         } else if (var0 < 3200) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class431.method9225(var0, var1, var2, 369940969);
            }
         } else if (var0 < 3300) {
            return GameObject.method6302(var0, var1, var2, 1041269477);
         } else if (var0 < 3400) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class101.method3398(var0, var1, var2, 1827144587);
            }
         } else if (var0 < 3500) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class379.method7978(var0, var1, var2, -1813085635);
            }
         } else if (var0 < 3600) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return RestClientThreadFactory.method5(var0, var1, var2, -616650646);
            }
         } else if (var0 < 3700) {
            return Buddy.method10788(var0, var1, var2, (byte)114);
         } else if (var0 < 3800) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class138.method3982(var0, var1, var2, -1694757224);
            }
         } else if (var0 < 3900) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return FillMode.method12277(var0, var1, var2, 1893716028);
            }
         } else if (var0 < 4000) {
            return AbstractByteArrayCopier.method7836(var0, var1, var2, (byte)-49);
         } else if (var0 < 4100) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return VerticalAlignment.method4596(var0, var1, var2, 757613230);
            }
         } else if (var0 < 4200) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return Huffman.method8654(var0, var1, var2, (byte)1);
            }
         } else if (var0 < 4300) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return classFO.method4034(var0, var1, var2, -125656445);
            }
         } else if (var0 < 5100) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return ScriptFrame.method1176(var0, var1, var2, (byte)-73);
            }
         } else if (var0 < 5400) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return FloorOverlayDefinition.method5358(var0, var1, var2, 1167579445);
            }
         } else if (var0 < 5600) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class1.method253(var0, var1, var2, 1679490786);
            }
         } else if (var0 < 5700) {
            return class50.method1291(var0, var1, var2, -343906879);
         } else if (var0 < 6300) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return classNV.method7855(var0, var1, var2, -222241638);
            }
         } else if (var0 < 6600) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return HealthBarUpdate.method1488(var0, var1, var2, (byte)90);
            }
         } else if (var0 < 6700) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class291.method7263(var0, var1, var2, 23923789);
            }
         } else if (var0 < 6800) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return classGN.method4251(var0, var1, var2, (byte)-112);
            }
         } else if (var0 < 6900) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return HealthBarConfig.method3566(var0, var1, var2, (byte)-1);
            }
         } else if (var0 < 7000) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return AsyncRestClient.method246(var0, var1, var2, -1456359715);
            }
         } else if (var0 < 7100) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class545.method11165(var0, var1, var2, -918025140);
            }
         } else if (var0 < 7200) {
            return UserComparator6.method4045(var0, var1, var2, -1790511714);
         } else if (var0 < 7500) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return WorldEntityConfig.method4786(var0, var1, var2, (byte)77);
            }
         } else if (var0 < 7600) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return ObjectSound.method2737(var0, var1, var2, 2048154668);
            }
         } else if (var0 < 7700) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return ArchiveDiskActionHandler.method8887(var0, var1, var2, -1929398799);
            }
         } else if (var0 < 8000) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return classNJ.method7792(var0, var1, var2, (byte)-91);
            }
         } else if (var0 < 8100) {
            if (var3 == 301162749) {
               throw new IllegalStateException();
            } else {
               return class101.method3399(var0, var1, var2, (byte)-113);
            }
         } else {
            if (var0 >= 13000) {
               if (var3 == 301162749) {
                  throw new IllegalStateException();
               }

               if (var0 < 14000) {
                  if (var3 == 301162749) {
                     throw new IllegalStateException();
                  }

                  return class209.method4887(var0, var1, var2, (byte)99);
               }
            }

            return 2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vy.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;B)V")
   @ObfuscatedName("ag")
   static void method11650(WorldView var0, int var1, int var2, int var3, SpriteMask var4, byte var5) {
      try {
         for (int var6 = 0; var6 < var0.field1313.method10502(-1916889738); var6++) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            NPC var7 = (NPC)var0.players.get(var0.field1313.method10498(var6, (byte)43));
            if (var7 != null) {
               if (var5 <= 0) {
                  throw new IllegalStateException();
               }

               if (var7.isVisible(-1299489351)) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  NPCComposition var8 = var7.definition;
                  if (null != var8) {
                     if (var5 <= 0) {
                        return;
                     }

                     if (null != var8.transforms) {
                        if (var5 <= 0) {
                           return;
                        }

                        var8 = NPCComposition.method4683(var8, (byte)0);
                     }
                  }

                  if (var8 != null) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (var8.drawMapDot) {
                        if (var5 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (var8.isInteractable) {
                           ProjectionCoord var9 = classDH.method3122(var0, 340712311 * var7.x, -1747310679 * var7.y, (byte)74);
                           int var10 = (int)var9.x;
                           int var11 = (int)var9.y;
                           var9.release(-804947546);
                           int var12 = var10 / 32 - client.field828 * -361115983 / 32;
                           int var13 = var11 / 32 - -291215063 * client.field674 / 32;
                           SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, classWZ.field6473[1], var4, 531005788);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "vy.ag(" + ')');
      }
   }

   FontName(String var1) {
      this.name = var1;
   }

   @ObfuscatedSignature(descriptor = "(FFFFS)F")
   @ObfuscatedName("at")
   static final float method11647(float var0, float var1, float var2, float var3, short var4) {
      try {
         return var2 * var1 + var3 * var0;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "vy.at(" + ')');
      }
   }
}
