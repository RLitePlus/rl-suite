import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("br")
public class Interpreter {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field348 = 500000;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field349 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field346 = 50;
   @ObfuscatedName("ae")
   static final String[] Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("be")
   static int field335 = 0;
   @ObfuscatedName("ap")
   static final double field334 = Math.log(2.0);
   @ObfuscatedName("au")
   static Object[] Interpreter_objectLocals;
   @ObfuscatedName("az")
   static int[] Interpreter_intStack = new int[1000];
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field347 = 5000000;
   @ObfuscatedName("ac")
   static int Interpreter_frameDepth = 0;
   @ObfuscatedSignature(descriptor = "[Lbt;")
   @ObfuscatedName("ab")
   static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];
   @ObfuscatedName("ax")
   static int field339 = 0;
   @ObfuscatedSignature(descriptor = "Log;")
   @ObfuscatedName("al")
   static class380 field340 = new class380();
   @ObfuscatedName("af")
   static Calendar Interpreter_calendar = Calendar.getInstance();
   @ObfuscatedName("aa")
   static boolean field338 = false;
   @ObfuscatedName("ai")
   static Object[] Interpreter_objectStack = new Object[1000];
   @ObfuscatedName("ao")
   static boolean field345 = false;
   @ObfuscatedName("aq")
   static ArrayList field344 = new ArrayList();

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("at")
   static final void method993(long var0) {
      try {
         try {
            Thread.sleep(var0);
         } catch (InterruptedException var3) {
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "br.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Z)V")
   @ObfuscatedName("dp")
   static void method1020(Widget var0, boolean var1) {
      if (var0 != null) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 417755003 - 1] = 1;
         if (var1) {
            UserComparator3.scriptDotWidget = var0;
         } else {
            class222.scriptActiveWidget = var0;
         }
      } else {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -751067374 - 1] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILoj;Z)V")
   @ObfuscatedName("il")
   static void method1152(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = class455.getWorldMap(-1883807661).getMapArea(var0, (byte)4);
      int var4 = -2060016843 * class330.localPlayer.plane;
      int var5 = (class330.localPlayer.x * 340712311 >> 7) + Occluder.topLevelWorldView.baseX * 825809917;
      int var6 = (-1747310679 * class330.localPlayer.y >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
      Coord var7 = new Coord(var4, var5, var6);
      class455.getWorldMap(285890352).method11432(var3, var7, var1, var2, 871111012);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)V")
   @ObfuscatedName("cv")
   public static void method995(ScriptEvent var0) {
      LoginType.runScript(var0, 500000, 475000, (byte)-115);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fk")
   static int method1063(int var0, Script var1, boolean var2) {
      if (var0 == 1927 || var0 == 2927) {
         if (field335 * -196365427 >= 10) {
            throw new RuntimeException();
         } else {
            Widget var11;
            if (var0 >= 2000) {
               var11 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -2128221871);
            } else {
               var11 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
            }

            if (null == var11.onTargetLeave) {
               return 0;
            } else {
               ScriptEvent var14 = new ScriptEvent();
               var14.widget = var11;
               var14.args = var11.onTargetLeave;
               var14.field530 = field335 * -1734903867 + 411265817;
               client.scriptEvents.addFirst(var14);
               return 1;
            }
         }
      } else if (var0 == 1928) {
         Widget var10 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var13 >= 1 && var13 <= 10) {
            classDY var16 = new classDY(var13, 278777747 * var10.id, var10.childIndex * 2077538819, -231674939 * var10.itemId);
            field344.add(var16);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 2928) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var9 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var12 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var15 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         if (var15 >= 1 && var15 <= 10) {
            Widget var17 = class226.widgetDefinition.getWidgetChild(var9, var12, -726031586);
            if (null == var17) {
               throw new RuntimeException();
            } else {
               classDY var19 = new classDY(var15, var9, var12, var17.itemId * -231674939);
               field344.add(var19);
               return 1;
            }
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 2929) {
         Object[] var3 = class195.method4536(716789859);
         class408.Interpreter_intStackSize -= -1084394537;
         int var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var5 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var6 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         int var7 = -1;
         Widget var8 = class226.widgetDefinition.getWidgetChild(var5, var6, -1922971716);
         if (null != var8) {
            var7 = -231674939 * var8.itemId;
            HttpRequestTask.method90(var5, var6, var7, var4, var3, -412771409);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;II)V")
   @ObfuscatedName("cr")
   static void method997(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.args;
      Script var4;
      if (Sound.isWorldMapEvent(var0.type * -1166617615, -615405819)) {
         AbstractSocket.worldMapEvent = (WorldMapEvent)var3[0];
         WorldMapElement var5 = class463.WorldMapElement_get(AbstractSocket.worldMapEvent.mapElement * -1281703535, (byte)0);
         var4 = WorldMapSectionType.getWorldMapScript(var0.type * -1166617615, 348284615 * var5.objectId, var5.category * -629421571, -1876005246);
      } else {
         int var6 = (Integer)var3[0];
         var4 = class383.getScript(var6, -1702500938);
      }

      if (var4 != null) {
         WorldViewManager.runScriptLogic(var0, var4, var1, var2, 159198534);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("eo")
   static int method1049(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1600) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 331299380) * 327716789 - 1] = -1382334796 * var3.scrollX;
         return 1;
      } else if (-967984861 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1386490192) * 265025266 - 1] = var3.scrollY * -497311503;
         return 1;
      } else if (1602 == var0) {
         if (var3.type * 928687775 == 12) {
            classOO var24 = var3.method8156(1825942137);
            if (null != var24) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 941737128 - 1] = classSF.method10131(
                  classOO.method8531(var24, 2046919295), (byte)-102
               );
               return 1;
            }
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.text;
         return 1;
      } else if (1603 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1272670981 - 1] = var3.scrollWidth * -111672215;
         return 1;
      } else if (var0 == -1877828214) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1894832460) * -705637627 - 1] = -1963554889 * var3.scrollHeight;
         return 1;
      } else if (1605 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -2078132320 - 1] = -1417816983 * var3.modelZoom;
         return 1;
      } else if (var0 == 1606) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1813368601 - 1] = var3.modelAngleX * 751747207;
         return 1;
      } else if (1607 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1413027620) * -1018917259 - 1] = 615793786 * var3.modelAngleZ;
         return 1;
      } else if (var0 == 1608) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1229429225) * -754817433 - 1] = 1629507461 * var3.modelAngleY;
         return 1;
      } else if (var0 == 1609) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1655191202 - 1] = var3.transparencyTop * -1769093762;
         return 1;
      } else if (var0 == 1610) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1338461072 * var3.transparencyBot;
         return 1;
      } else if (-433393918 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -204372433) * 327716789 - 1] = var3.color * 7845467;
         return 1;
      } else if (var0 == 1938396136) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -2022512615) * 1514912405 - 1] = var3.color2 * -1402291999;
         return 1;
      } else if (var0 == -88514892) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 946247414 - 1] = var3.fillMode.rsOrdinal((byte)98);
         return 1;
      } else if (var0 == 639084499) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1979344634) * -530383839 - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         if (var0 == 793704464) {
            class372 var4 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1936910645 - 1] = null != var4 ? var4.field4640 * -936277931 : 0;
         }

         if (var0 == 519700967) {
            class372 var23 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -802456812) * -188947966 - 1] = null != var23 ? var23.field4642 * -1867460589 : 0;
            return 1;
         } else if (var0 == 1619) {
            classOO var22 = var3.method8156(2047800860);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1744831174) * -1595015587 - 1] = var22 != null
               ? classSF.method10131(var22.method8533(-726040829), (byte)-2)
               : "";
            return 1;
         } else if (847708347 == var0) {
            class372 var21 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1278811881 - 1] = var21 != null ? var21.field4641 * 1739341220 : 0;
            return 1;
         } else if (var0 == -751976729) {
            classOO var20 = var3.method8156(1072626167);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -531678721 - 1] = null != var20
               ? classOO.method8568(var20, 1867619770)
               : 0;
            return 1;
         } else if (1622 == var0) {
            classOO var19 = var3.method8156(1695282514);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1868639747) * 327716789 - 1] = var19 != null ? var19.method8570(1738045320) : 0;
            return 1;
         } else if (var0 == -1696264263) {
            classOO var18 = var3.method8156(114231706);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var18 ? var18.method8572((byte)-47) : 0;
            return 1;
         } else if (var0 == 1624) {
            classOO var17 = var3.method8156(917427955);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 2028932225) * 1075948619 - 1] = var17 != null && var17.method8538((byte)0) ? 1 : 0;
            return 1;
         } else if (1625 != var0) {
            if (var0 == 1626) {
               classOO var16 = var3.method8156(1010140221);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1451599964) * -1595015587 - 1] = null != var16
                  ? var16.method8536(-467707491).method10274((byte)43)
                  : "";
               return 1;
            } else if (var0 == 410593376) {
               classOO var15 = var3.method8156(1034934650);
               int var5 = var15 != null ? var15.method8550((byte)20) : 0;
               int var6 = var15 != null ? var15.method8549(1757525191) : 0;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.min(var5, var6);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.max(var5, var6);
               return 1;
            } else if (1628 == var0) {
               classOO var14 = var3.method8156(1837528344);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 626305607) * 327716789 - 1] = null != var14 ? var14.method8549(1757525191) : 0;
               return 1;
            } else if (var0 == -1064362371) {
               classOO var13 = var3.method8156(1850857565);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -877736674) * 366533085 - 1] = var13 != null
                  ? classOO.method8578(var13, 1764749202)
                  : 0;
               return 1;
            } else if (var0 == -898707945) {
               classOO var12 = var3.method8156(781936466);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 884416927) * 1656128544 - 1] = var12 != null
                  ? classOO.method8573(var12, (byte)-76)
                  : 0;
               return 1;
            } else if (var0 == 1631) {
               classOO var11 = var3.method8156(1165417718);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 714763251) * 1642245694 - 1] = null != var11
                  ? classOO.method8584(var11, (byte)75)
                  : 0;
               return 1;
            } else if (-2067388440 == var0) {
               classOO var10 = var3.method8156(1297801930);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1049153547) * 327716789 - 1] = null != var10 ? var10.method8588(-2067649854) : 0;
               return 1;
            } else if (-998977089 == var0) {
               class28 var9 = var3.method8162((byte)13);
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = null != var9
                  ? var9.method493(Interpreter_intStack[class408.Interpreter_intStackSize * -1306007839 - 1], (byte)12)
                  : 0;
               return 1;
            } else if (var0 == -1221894934) {
               class28 var8 = var3.method8162((byte)13);
               Interpreter_intStack[class408.Interpreter_intStackSize * 1751527244 - 1] = null != var8
                  ? var8.method497((char)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], -101619483)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classOO var7 = var3.method8156(588288595);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1900004209) * 327716789 - 1] = var7 != null && var7.method8541(337201532) ? 1 : 0;
            return 1;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;Lcu;II)V")
   @ObfuscatedName("ca")
   static void method999(ScriptEvent var0, Script var1, int var2, int var3) {
      Object[] var4 = var0.args;
      class408.Interpreter_intStackSize = 0;
      SecureRandomFuture.Interpreter_objectStackSize = 0;
      int var5 = -1;
      int[] var6 = var1.opcodes;
      int[] var7 = var1.intOperands;
      int var8 = -1;
      Interpreter_frameDepth = 0;
      field345 = false;
      boolean var9 = false;
      field339 = 0;
      boolean var21 = false /* VF: Semaphore variable */;

      label631: {
         label632: {
            try {
               var21 = true;
               class251.Interpreter_intLocals = new int[var1.localIntCount * -58237571];
               int var24 = 0;
               Interpreter_objectLocals = new Object[-14880459 * var1.localStringCount];
               int var25 = 0;

               for (int var26 = 1; var26 < var4.length; var26++) {
                  if (var4[var26] instanceof Integer) {
                     int var13 = (Integer)var4[var26];
                     if (-2147483647 == var13) {
                        var13 = var0.mouseX * -1567081689;
                     }

                     if (-2147483646 == var13) {
                        var13 = var0.mouseY * -1332622121;
                     }

                     if (-2147483645 == var13) {
                        var13 = null != var0.widget ? 278777747 * var0.widget.id : -1;
                     }

                     if (var13 == -2147483644) {
                        var13 = var0.opIndex * 2029362027;
                     }

                     if (var13 == -2147483643) {
                        var13 = null != var0.widget ? var0.widget.childIndex * 2077538819 : -1;
                     }

                     if (-2147483642 == var13) {
                        var13 = null != var0.dragTarget ? 278777747 * var0.dragTarget.id : -1;
                     }

                     if (-2147483641 == var13) {
                        var13 = var0.dragTarget != null ? 2077538819 * var0.dragTarget.childIndex : -1;
                     }

                     if (-2147483640 == var13) {
                        var13 = var0.keyTyped * 1798396775;
                     }

                     if (-2147483639 == var13) {
                        var13 = 837595959 * var0.keyPressed;
                     }

                     if (var13 == -2147483638) {
                        var13 = 715272521 * var0.field525;
                     }

                     class251.Interpreter_intLocals[var24++] = var13;
                  } else if (var4[var26] instanceof String) {
                     String var43 = (String)var4[var26];
                     if (var43.equals("event_opbase")) {
                        var43 = var0.targetName;
                     }

                     Interpreter_objectLocals[var25++] = var43;
                  } else if (var4[var26] instanceof DynamicArray) {
                     Interpreter_objectLocals[var25++] = var4[var26];
                  }
               }

               field335 = -1821970675 * var0.field530;

               label620:
               while (true) {
                  field339 += 1177210717;
                  if (-2113340171 * field339 > var2) {
                     throw new RuntimeException();
                  }

                  var8 = var6[++var5];
                  if (var8 < 100) {
                     if (0 == var8) {
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7[var5];
                     } else if (1 == var8) {
                        int var42 = var7[var5];
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Varps.Varps_main[var42];
                     } else if (2 == var8) {
                        int var41 = var7[var5];
                        Varps.Varps_main[var41] = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        Huffman.changeGameOptions(var41, 1382603152);
                     } else if (var8 == 3) {
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var1.stringOperands[var5];
                     } else if (var8 == 6) {
                        var5 += var7[var5];
                     } else if (var8 == 7) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]
                           != Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 8) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                           == Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 9) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                           < Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 10) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[class408.Interpreter_intStackSize * 327716789]
                           > Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789]) {
                           var5 += var7[var5];
                        }
                     } else if (21 == var8) {
                        if (Interpreter_frameDepth * -444245115 == 0) {
                           var21 = false;
                           break label632;
                        }

                        ScriptFrame var39 = Interpreter_frames[(Interpreter_frameDepth -= -383228595) * -444245115];
                        var1 = var39.script;
                        var6 = var1.opcodes;
                        var7 = var1.intOperands;
                        var5 = 1078296483 * var39.pc;
                        class251.Interpreter_intLocals = var39.intLocals;
                        Interpreter_objectLocals = var39.stringLocals;
                     } else if (25 == var8) {
                        int var38 = var7[var5];
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapData_1.getVarbit(var38, 1710352530);
                     } else if (var8 == 27) {
                        int var37 = var7[var5];
                        VarbitComposition.method4905(var37, Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -2121628610);
                     } else if (31 == var8) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                           <= Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 32) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[class408.Interpreter_intStackSize * 327716789]
                           >= Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 33) {
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class251.Interpreter_intLocals[var7[var5]];
                     } else if (var8 == 34) {
                        class251.Interpreter_intLocals[var7[var5]] = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                     } else if (var8 == 35) {
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Interpreter_objectLocals[var7[var5]];
                     } else if (var8 == 36) {
                        Interpreter_objectLocals[var7[var5]] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661)
                           * -1595015587];
                     } else if (37 == var8) {
                        int var36 = var7[var5];
                        SecureRandomFuture.Interpreter_objectStackSize -= var36 * 831964661;
                        String var51 = WorldMapData_0.method7117(
                           Interpreter_objectStack, -1595015587 * SecureRandomFuture.Interpreter_objectStackSize, var36, -969181255
                        );
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var51;
                     } else if (var8 == 38) {
                        class408.Interpreter_intStackSize -= -1793120611;
                     } else if (var8 == 39) {
                        SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
                     } else if (var8 == 40) {
                        if (-444245115 * Interpreter_frameDepth == 50) {
                           throw new RuntimeException();
                        }

                        int var35 = var7[var5];
                        Script var50 = class383.getScript(var35, -224754569);
                        int[] var53 = new int[-58237571 * var50.localIntCount];
                        Object[] var15 = new Object[-14880459 * var50.localStringCount];
                        if (var50.intArgumentCount * -968069229 >= 0) {
                           System.arraycopy(
                              Interpreter_intStack,
                              0 + (327716789 * class408.Interpreter_intStackSize - var50.intArgumentCount * -968069229),
                              var53,
                              0,
                              -968069229 * var50.intArgumentCount
                           );
                        }

                        if (-1480905639 * var50.stringArgumentCount >= 0) {
                           System.arraycopy(
                              Interpreter_objectStack,
                              -1595015587 * SecureRandomFuture.Interpreter_objectStackSize - -1480905639 * var50.stringArgumentCount + 0,
                              var15,
                              0,
                              -1480905639 * var50.stringArgumentCount
                           );
                        }

                        class408.Interpreter_intStackSize = class408.Interpreter_intStackSize - 121454375 * var50.intArgumentCount;
                        SecureRandomFuture.Interpreter_objectStackSize = SecureRandomFuture.Interpreter_objectStackSize
                           - -1805128147 * var50.stringArgumentCount;
                        ScriptFrame var16 = new ScriptFrame();
                        var16.script = var1;
                        var16.pc = 1406577675 * var5;
                        var16.intLocals = class251.Interpreter_intLocals;
                        var16.stringLocals = Interpreter_objectLocals;
                        Interpreter_frames[(Interpreter_frameDepth += -383228595) * -444245115 - 1] = var16;
                        var1 = var50;
                        var6 = var50.opcodes;
                        var7 = var50.intOperands;
                        var5 = -1;
                        class251.Interpreter_intLocals = var53;
                        Interpreter_objectLocals = var15;
                     } else if (var8 == 42) {
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class166.varcs.getInt(var7[var5], (byte)1);
                     } else if (var8 == 43) {
                        Varcs.method3128(
                           class166.varcs, var7[var5], Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -104366019
                        );
                     } else if (var8 == 44) {
                        int var34 = var7[var5] >> 16;
                        int var49 = var7[var5] & 65535;
                        int var52 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        if (var52 < 0 || var52 > 5000) {
                           throw new RuntimeException();
                        }

                        if (var49 == 115) {
                           Interpreter_objectLocals[var34] = new DynamicArray(class586.field6379, "", var52, var52);
                        } else if (105 != var49 && var49 != 49) {
                           Interpreter_objectLocals[var34] = new DynamicArray(class586.field6376, -1, var52, var52);
                        } else {
                           Interpreter_objectLocals[var34] = new DynamicArray(class586.field6376, 0, var52, var52);
                        }
                     } else if (45 == var8) {
                        DynamicArray var28 = class66.method1387(var7[var5], Interpreter_objectLocals[var7[var5]], -2129267472);
                        int var45 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        class31.method666(var28, var45, -735196150);
                        if (var28.field6107 == class586.field6376) {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var28.method11207(2053374425)[var45];
                        } else {
                           Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var28.method11214(
                              (byte)47
                           )[var45];
                        }
                     } else if (var8 == 46) {
                        DynamicArray var29 = class66.method1387(var7[var5], Interpreter_objectLocals[var7[var5]], -1667164806);
                        if (!var29.field6109) {
                           throw new RuntimeException();
                        }

                        if (var29.field6107 == class586.field6376) {
                           class408.Interpreter_intStackSize -= 708726074;
                           int var46 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                           class31.method666(var29, var46, -1674700029);
                           var29.method11207(2053374425)[var46] = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
                        } else {
                           int var47 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                           class31.method666(var29, var47, 1900545820);
                           var29.method11214((byte)-11)[var47] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661)
                              * -1595015587];
                        }
                     } else if (49 == var8) {
                        String var30 = class166.varcs.getString(var7[var5], (byte)43);
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var30;
                     } else if (var8 == 50) {
                        class166.varcs
                           .setString(
                              var7[var5],
                              (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
                              2043045110
                           );
                     } else if (60 == var8) {
                        IterableNodeHashTable var31 = var1.switches[var7[var5]];
                        IntegerNode var48 = (IntegerNode)var31.get((long)Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
                        if (null != var48) {
                           var5 += var48.integer;
                        }
                     } else if (63 == var8) {
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null;
                     } else if (var8 == 74) {
                        Integer var32 = FontName.field6342.getTitleGroupValue(var7[var5], (byte)4);
                        if (var32 == null) {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                        } else {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var32;
                        }
                     } else {
                        if (76 != var8) {
                           throw new IllegalStateException();
                        }

                        Integer var33 = class4.field14.method11181(var7[var5], (byte)3);
                        if (null == var33) {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                        } else {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33;
                        }
                     }
                  } else {
                     boolean var27 = var1.intOperands[var5] == 1;
                     int var44 = FontName.method11651(var8, var1, var27, -2110518487);
                     switch (var44) {
                        case 0:
                           var21 = false;
                           break label620;
                        case 1:
                        default:
                           break;
                        case 2:
                           throw new IllegalStateException();
                     }
                  }
               }
            } catch (Exception var22) {
               var9 = true;
               StringBuilder var11 = new StringBuilder(30);
               var11.append("").append(var1.key).append(" ");

               for (int var12 = Interpreter_frameDepth * -444245115 - 1; var12 >= 0; var12--) {
                  var11.append("").append(Interpreter_frames[var12].script.key).append(" ");
               }

               var11.append("").append(var8);
               PlayerType.RunException_sendStackTrace(var11.toString(), var22, 713795073);
               var21 = false;
               break label631;
            } finally {
               if (var21) {
                  while (!field344.isEmpty()) {
                     classDY var18 = (classDY)field344.remove(0);
                     FontName.widgetDefaultMenuAction(
                        var18.method3597(1508981105), var18.method3600((byte)-106), var18.method3601((short)3558), var18.method3605((byte)0), "", -1376442236
                     );
                  }

                  if (field345) {
                     field345 = false;
                     Login.method1274((byte)1);
                  }

                  if (!var9 && var3 > 0 && -2113340171 * field339 >= var3) {
                     PlayerType.RunException_sendStackTrace(
                        "Warning: Script " + var1.field1216 + " finished at op count " + field339 * -2113340171 + " of max " + var2, null, 1849704838
                     );
                  }
               }
            }

            while (!field344.isEmpty()) {
               classDY var14 = (classDY)field344.remove(0);
               FontName.widgetDefaultMenuAction(
                  var14.method3597(1324197774), var14.method3600((byte)-75), var14.method3601((short)-15878), var14.method3605((byte)0), "", -1376442236
               );
            }

            if (field345) {
               field345 = false;
               Login.method1274((byte)1);
            }

            if (!var9 && var3 > 0 && -2113340171 * field339 >= var3) {
               PlayerType.RunException_sendStackTrace(
                  "Warning: Script " + var1.field1216 + " finished at op count " + field339 * -2113340171 + " of max " + var2, null, -423358166
               );
            }

            return;
         }

         while (!field344.isEmpty()) {
            classDY var40 = (classDY)field344.remove(0);
            FontName.widgetDefaultMenuAction(
               var40.method3597(471943695), var40.method3600((byte)-75), var40.method3601((short)16564), var40.method3605((byte)0), "", -1376442236
            );
         }

         if (field345) {
            field345 = false;
            Login.method1274((byte)1);
         }

         if (!var9 && var3 > 0 && -2113340171 * field339 >= var3) {
            PlayerType.RunException_sendStackTrace(
               "Warning: Script " + var1.field1216 + " finished at op count " + field339 * -2113340171 + " of max " + var2, null, -599077650
            );
         }

         return;
      }

      while (!field344.isEmpty()) {
         classDY var10 = (classDY)field344.remove(0);
         FontName.widgetDefaultMenuAction(
            var10.method3597(715606001), var10.method3600((byte)-97), var10.method3601((short)-21332), var10.method3605((byte)0), "", -1376442236
         );
      }

      if (field345) {
         field345 = false;
         Login.method1274((byte)1);
      }

      if (!var9 && var3 > 0 && -2113340171 * field339 >= var3) {
         PlayerType.RunException_sendStackTrace(
            "Warning: Script " + var1.field1216 + " finished at op count " + field339 * -2113340171 + " of max " + var2, null, 2144640543
         );
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)Lut;")
   @ObfuscatedName("cl")
   static DynamicArray method1001(int var0, Object var1) {
      DynamicArray var2 = (DynamicArray)var1;
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)Lut;")
   @ObfuscatedName("dd")
   static DynamicArray method1002(int var0, Object var1) {
      DynamicArray var2 = (DynamicArray)var1;
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)Lut;")
   @ObfuscatedName("dw")
   static DynamicArray method1003(int var0, Object var1) {
      DynamicArray var2 = (DynamicArray)var1;
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ec")
   static int method1027(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         var3 = class226.widgetDefinition.method7953(var4, 1015141944);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (var0 == 1100) {
         class408.Interpreter_intStackSize -= 708726074;
         int var39 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var45 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         if (12 == 928687775 * var3.type) {
            classOO var46 = var3.method8156(1493996054);
            if (var46 != null && var46.method8401(var39, var45, -1414930132)) {
               class376.invalidateWidget(var3, (byte)5);
            }
         } else {
            var3.scrollX = var39 * -1597374639;
            if (1068149169 * var3.scrollX > -111672215 * var3.scrollWidth - -1946208531 * var3.width) {
               var3.scrollX = -1481704391 * var3.scrollWidth - -1014270979 * var3.width;
            }

            if (1068149169 * var3.scrollX < 0) {
               var3.scrollX = 0;
            }

            var3.scrollY = 1603227665 * var45;
            if (-497311503 * var3.scrollY > -1963554889 * var3.scrollHeight - -905446999 * var3.height) {
               var3.scrollY = -50253017 * var3.scrollHeight - 351495225 * var3.height;
            }

            if (-497311503 * var3.scrollY < 0) {
               var3.scrollY = 0;
            }

            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1101) {
         var3.color = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1365603885;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1102) {
         var3.fill = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1103 == var0) {
         var3.transparencyTop = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -167855443;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1104 == var0) {
         var3.lineWid = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -249010551;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1105) {
         var3.spriteId2 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 2092479471;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1106 == var0) {
         var3.spriteAngle = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -795510295;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1107 == var0) {
         var3.spriteTiling = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1108 == var0) {
         var3.modelType = -1570196439;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1109 == var0) {
         class408.Interpreter_intStackSize -= 2126178222;
         var3.modelOffsetX = -37619155 * Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1] * -1048338377;
         var3.modelAngleX = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2] * -1977744073;
         var3.modelAngleY = 676548941 * Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
         var3.modelAngleZ = Interpreter_intStack[4 + 327716789 * class408.Interpreter_intStackSize] * 132153981;
         var3.modelZoom = 2012543961 * Interpreter_intStack[5 + class408.Interpreter_intStackSize * 327716789];
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1110 == var0) {
         int var38 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var3.sequenceId * -750054055 != var38) {
            var3.sequenceId = var38 * -12983575;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1111 == var0) {
         var3.modelOrthog = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1112 == var0) {
         String var37 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         if (var3.type * 928687775 == 12) {
            classOO var44 = var3.method8156(1296196979);
            if (null != var44 && var44.method8557((byte)15)) {
               var44.method8378(var37, -1624249454);
            } else {
               var3.text = var37;
            }

            class376.invalidateWidget(var3, (byte)5);
         } else if (!var37.equals(var3.text)) {
            var3.text = var37;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1113) {
         var3.fontId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1824873669;
         if (12 == 928687775 * var3.type) {
            classOO var36 = var3.method8156(1536898534);
            if (null != var36) {
               var36.method8416(-115914734);
            }
         }

         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1114 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         if (12 == 928687775 * var3.type) {
            classOO var35 = var3.method8156(1584221433);
            if (var35 != null) {
               var35.method8405(
                  Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
                  Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1],
                  -2003442957
               );
               var35.method8412(Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789], 1186061713);
            }
         } else {
            var3.textXAlignment = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * -563011291;
            var3.textYAlignment = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize] * 1108485379;
            var3.textLineHeight = -1440610935 * Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         }

         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1115) {
         var3.textShadowed = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1116 == var0) {
         var3.outline = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 217033705;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1117 == var0) {
         var3.spriteShadow = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1846663581;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1118) {
         var3.spriteFlipV = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1119 == var0) {
         var3.spriteFlipH = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1120) {
         class408.Interpreter_intStackSize -= 708726074;
         var3.scrollWidth = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * 1897778137;
         var3.scrollHeight = 1821115911 * Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         class376.invalidateWidget(var3, (byte)5);
         if (0 == var3.type * 928687775) {
            Widget[] var34 = 2077538819 * var3.childIndex == -1
               ? class226.widgetDefinition.Widget_interfaceComponents[278777747 * var3.id >> 16]
               : class226.widgetDefinition.method7953(794900977 * var3.parentId, -2088459663).children;
            class339.revalidateWidgetScroll(var34, var3, false, -914806020);
         }

         return 1;
      } else if (var0 == 1121) {
         HealthBarDefinition.resumePauseWidget(278777747 * var3.id, 2077538819 * var3.childIndex, 531202229);
         client.meslayerContinueWidget = var3;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1122 == var0) {
         var3.spriteId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -18433963;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1123) {
         var3.color2 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1017345247;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1124) {
         var3.transparencyBot = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 1009763901;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1125) {
         int var33 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         FillMode var43 = (FillMode)GrandExchangeOffer.findEnumerated(class299.FillMode_values(-1987675714), var33, (byte)1);
         if (null != var43) {
            var3.fillMode = var43;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1126) {
         boolean var32 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         var3.field4526 = var32;
         return 1;
      } else if (var0 == 1127) {
         boolean var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         var3.modelTransparency = var31;
         return 1;
      } else if (var0 == 1129) {
         var3.field4540 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1130 == var0) {
         var3.method8080(
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            "",
            class164.urlRequester,
            class6.getUserId(-1719834967)
         );
         return 1;
      } else if (1131 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         var3.method8099(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
            Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
            1683431084
         );
         return 1;
      } else if (var0 == 1132) {
         var3.method8101(
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789],
            (byte)12
         );
         return 1;
      } else if (var0 == 1133) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var30 = var3.method8158((short)16256);
         if (var30 != null) {
            var30.field4640 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -1863371523;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1134 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var29 = var3.method8158((short)16256);
         if (var29 != null) {
            var29.field4642 = -2050586211 * Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1135) {
         SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
         classOO var28 = var3.method8156(295908212);
         if (var28 != null) {
            var3.text2 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         }

         return 1;
      } else if (var0 == 1136) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var27 = var3.method8158((short)16256);
         if (var27 != null) {
            var27.field4641 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * -718628869;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1137 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var26 = var3.method8156(1673053094);
         if (null != var26 && var26.method8392(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], 469305633)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1138) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var25 = var3.method8156(911144678);
         if (var25 != null && var25.method8397(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1088391311)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1139) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var24 = var3.method8156(1772439210);
         if (null != var24 && var24.method8400(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -429013915)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1140 == var0) {
         boolean var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         client.widgetFocusInputManager.method6358(1268224241);
         classOO var42 = var3.method8156(957211537);
         if (null != var42 && var42.method8371(var23, 1485355144)) {
            if (var23) {
               client.widgetFocusInputManager.method6353(var3, (byte)93);
            }

            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1141 == var0) {
         boolean var22 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (!var22 && client.widgetFocusInputManager.method6348(-1820361897) == var3) {
            client.widgetFocusInputManager.method6358(-1971415408);
            class376.invalidateWidget(var3, (byte)5);
         }

         classOO var41 = var3.method8156(2119210468);
         if (var41 != null) {
            var41.method8375(var22, 1798706782);
         }

         return 1;
      } else if (1142 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         classOO var21 = var3.method8156(620065866);
         if (null != var21
            && classOO.method8450(
               var21,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
               -836676329
            )) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1143 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var20 = var3.method8156(1967045572);
         if (null != var20
            && classOO.method8450(
               var20,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               -376496522
            )) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1144) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var19 = var3.method8156(1064121717);
         if (null != var19) {
            classOO.method8582(var19, Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (byte)-79);
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1145) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var18 = var3.method8156(541758164);
         if (var18 != null) {
            var18.method8575(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (short)193);
         }

         return 1;
      } else if (var0 == 1146) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var17 = var3.method8156(689428415);
         if (null != var17) {
            var17.method8414(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1677752388);
         }

         return 1;
      } else if (1147 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var16 = var3.method8156(367307578);
         if (null != var16) {
            var16.method8591(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789], -613416271);
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1148 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         class28 var15 = var3.method8162((byte)13);
         if (null != var15) {
            class28.method486(
               var15,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
               1299642583
            );
         }

         return 1;
      } else if (var0 == 1149) {
         class408.Interpreter_intStackSize -= 708726074;
         class28 var14 = var3.method8162((byte)13);
         if (null != var14) {
            var14.method488(
               (char)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
               -371900800
            );
         }

         return 1;
      } else if (1150 == var0) {
         Widget.method8091(
            var3,
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            class164.urlRequester,
            2017600565
         );
         return 1;
      } else if (var0 == 1151) {
         SecureRandomFuture.Interpreter_objectStackSize -= -1799073313;
         String var13 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var40 = (String)Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var6 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 2];
         long var7 = class6.getUserId(362892880);
         long var9 = class40.getUserHash(1168996373);
         String var11 = PlatformInfo.method11338(class282.getPlatformInfo(-2059647657), class282.getPlatformInfo(-1088772657).os * -208903543, 168937541);
         if (-1L != var7) {
            var13 = var13.replaceAll("%userid%", Long.toString(var7));
         }

         if (var9 != -1L) {
            var13 = var13.replaceAll("%userhash%", Long.toString(var9));
         }

         if (!var11.isEmpty()) {
            var13 = var13.replaceAll("%deviceid%", var11);
         }

         var3.method8085(var13, var40, var6, var11, Long.toString(var9), class164.urlRequester, (byte)-37);
         return 1;
      } else if (1152 == var0) {
         if (928687775 * var3.type != 11) {
            throw new RuntimeException();
         } else {
            class225 var12 = Widget.method8141(var3, 818137127);
            boolean var5 = null != var12
               && var12.method5297((byte)18)
               && class234.method5950(WorldMapArea.method6908(108176323), var12.method5322((byte)53), -223682399);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5 ? 1 : 0;
            return 1;
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)V")
   @ObfuscatedName("df")
   static void method1005(DynamicArray var0, int var1) {
      if (var1 < 0 || var1 >= var0.method11215((byte)99)) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("jk")
   static Object method1157(int var0) {
      return var0 == -1 ? null : class165.method4411((class586)GrandExchangeOffer.findEnumerated(class586.method11705((byte)-24), var0, (byte)1), 790883686);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hf")
   static int method1127(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hp")
   static int method1119(int var0, Script var1, boolean var2) {
      if (6600 == var0) {
         int var38 = 2115028565 * Occluder.topLevelWorldView.plane;
         int var56 = 825809917 * Occluder.topLevelWorldView.baseX + (340712311 * class330.localPlayer.x >> 7);
         int var61 = (class330.localPlayer.y * -1747310679 >> 7) + Occluder.topLevelWorldView.baseY * 1279964673;
         WorldMap.method11413(class455.getWorldMap(92855364), var38, var56, var61, true, -1091228177);
         return 1;
      } else if (6601 == var0) {
         int var37 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         String var55 = "";
         WorldMapArea var60 = class455.getWorldMap(-1020422562).getMapArea(var37, (byte)4);
         if (var60 != null) {
            var55 = WorldMapArea.method6941(var60, -1910602165);
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var55;
         return 1;
      } else if (var0 == 6602) {
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(-551413631).setMaxFlashCount(var36, 1265471425);
         return 1;
      } else if (6603 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-927826960).getZoomLevel((byte)41);
         return 1;
      } else if (var0 == 6604) {
         int var35 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(-1103743916).setCurrentMapAreaId(var35, -1601929789);
         return 1;
      } else if (var0 == 6605) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(100657626).method11474(956299163)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 6606) {
         Coord var34 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMap.method11479(class455.getWorldMap(-1925640822), -1931160809 * var34.x, var34.y * -263036313, -1449991538);
         return 1;
      } else if (var0 == 6607) {
         Coord var33 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMap.method11482(class455.getWorldMap(273456296), var33.x * -1931160809, -263036313 * var33.y, (byte)53);
         return 1;
      } else if (6608 == var0) {
         Coord var32 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMap.method11484(class455.getWorldMap(-671552317), var32.plane * 370217423, -1931160809 * var32.x, var32.y * -263036313, (byte)0);
         return 1;
      } else if (var0 == 6609) {
         Coord var31 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         class455.getWorldMap(-521271065).method11486(var31.plane * 370217423, -1931160809 * var31.x, -263036313 * var31.y, -109316941);
         return 1;
      } else if (6610 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-13312136).getDisplayX(-1375810626);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMap.method11492(
            class455.getWorldMap(-1690796955), (byte)38
         );
         return 1;
      } else if (var0 == 6611) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapArea var54 = class455.getWorldMap(-333843632).getMapArea(var30, (byte)4);
         if (null == var54) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54.getOrigin(-771221770).packed(998201194);
         }

         return 1;
      } else if (6612 == var0) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapArea var53 = class455.getWorldMap(-640904342).getMapArea(var29, (byte)4);
         if (null == var53) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (
                  WorldMapArea.method6955(var53, (byte)0) - var53.getRegionLowX(-893961193) + 1
               )
               * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (
                  var53.getRegionHighY(219246473) - WorldMapArea.method6961(var53, (byte)42) + 1
               )
               * 64;
         }

         return 1;
      } else if (var0 == 6613) {
         int var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapArea var52 = class455.getWorldMap(-1739166842).getMapArea(var28, (byte)4);
         if (null == var52) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52.getRegionLowX(-318626437) * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6961(var52, (byte)-34) * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6955(var52, (byte)0) * 64 + 64 - 1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52.getRegionHighY(219246473) * 64 + 64 - 1;
         }

         return 1;
      } else if (var0 == 6614) {
         int var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapArea var51 = class455.getWorldMap(-1817353490).getMapArea(var27, (byte)4);
         if (var51 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var51.getZoom((byte)-94);
         }

         return 1;
      } else if (6615 == var0) {
         Coord var26 = class455.getWorldMap(-1389054533).getDisplayCoord((byte)20);
         if (null == var26) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1931160809 * var26.x;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var26.y * -263036313;
         }

         return 1;
      } else if (var0 == 6616) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-916277739).currentMapAreaId((byte)33);
         return 1;
      } else if (6617 == var0) {
         Coord var25 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMapArea var50 = WorldMap.method11425(class455.getWorldMap(-642960586), -915007473);
         if (var50 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         } else {
            int[] var59 = WorldMapArea.method6923(var50, 370217423 * var25.plane, -1931160809 * var25.x, var25.y * -263036313, 2054151223);
            if (var59 == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var59[0];
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var59[1];
            }

            return 1;
         }
      } else if (6618 == var0) {
         Coord var24 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMapArea var49 = WorldMap.method11425(class455.getWorldMap(-4715735), 2130316168);
         if (null == var49) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         } else {
            Coord var58 = var49.coord(-1931160809 * var24.x, var24.y * -263036313, (byte)107);
            if (var58 == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var58.packed(-509629796);
            }

            return 1;
         }
      } else if (var0 == 6619) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         Coord var48 = new Coord(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]);
         classLX.method7328(var23, var48, false, (byte)-91);
         return 1;
      } else if (6620 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         Coord var47 = new Coord(Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]);
         classLX.method7328(var22, var47, true, (byte)-75);
         return 1;
      } else if (var0 == 6621) {
         class408.Interpreter_intStackSize -= 708726074;
         int var21 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Coord var46 = new Coord(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]);
         WorldMapArea var57 = class455.getWorldMap(-723454260).getMapArea(var21, (byte)4);
         if (var57 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var57.containsCoord(
                  370217423 * var46.plane, var46.x * -1931160809, var46.y * -263036313, 2136870681
               )
               ? 1
               : 0;
            return 1;
         }
      } else if (6622 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-141690931).getDisplayWith(-944948834);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(217832350).getDisplayHeight((byte)-28);
         return 1;
      } else if (var0 == 6623) {
         Coord var20 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMapArea var45 = class455.getWorldMap(-1436043646).mapAreaAtCoord(370217423 * var20.plane, -1931160809 * var20.x, -263036313 * var20.y, 513934451);
         if (var45 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6931(var45, -2008398041);
         }

         return 1;
      } else if (var0 == 6624) {
         WorldMap.method11505(
            class455.getWorldMap(-1260581817), Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1381163576
         );
         return 1;
      } else if (6625 == var0) {
         WorldMap.method11512(class455.getWorldMap(-862873336), (byte)2);
         return 1;
      } else if (var0 == 6626) {
         class455.getWorldMap(-602369237).setCyclesPerFlash(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)-95);
         return 1;
      } else if (6627 == var0) {
         class455.getWorldMap(-1752518282).resetCyclesPerFlash(1750172012);
         return 1;
      } else if (6628 == var0) {
         boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class455.getWorldMap(-1843254826).setPerpetualFlash(var19, 914179139);
         return 1;
      } else if (var0 == 6629) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(-295291847).flashElement(var18, (byte)-36);
         return 1;
      } else if (var0 == 6630) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(-725341618).setZoomPercentage(var17, -1034821102);
         return 1;
      } else if (6631 == var0) {
         WorldMap.method11531(class455.getWorldMap(-1758233037), 541490837);
         return 1;
      } else if (6632 == var0) {
         boolean var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class455.getWorldMap(-954482510).setElementsDisabled(var16, (byte)1);
         return 1;
      } else if (6633 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         boolean var44 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] == 1;
         class455.getWorldMap(-2001592999).disableElement(var15, var44, (byte)105);
         return 1;
      } else if (var0 == 6634) {
         class408.Interpreter_intStackSize -= 708726074;
         int var14 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         boolean var43 = 1 == Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         class455.getWorldMap(-192050107).setCategoryDisabled(var14, var43, -720816937);
         return 1;
      } else if (6635 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-1129132648)
               .getElementsDisabled((byte)77)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 6636) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-1789402795)
               .isElementDisabled(var13, 2097047515)
            ? 1
            : 0;
         return 1;
      } else if (6637 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(180566484)
               .isCategoryDisabled(var12, 847739669)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 6638) {
         class408.Interpreter_intStackSize -= 708726074;
         int var11 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Coord var42 = new Coord(Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789]);
         Coord var5 = class455.getWorldMap(-394075983).method11555(var11, var42, 1136311836);
         if (var5 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5.packed(-49564052);
         }

         return 1;
      } else if (var0 == 6639) {
         AbstractWorldMapIcon var10 = WorldMap.method11563(class455.getWorldMap(-1291385512), 1905763545);
         if (var10 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var10.getElement(-1959391143);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var10.coord2.packed(-1892412263);
         }

         return 1;
      } else if (var0 == 6640) {
         AbstractWorldMapIcon var9 = class455.getWorldMap(216393240).iconStart(-1666108409);
         if (var9 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var9.getElement(1770022405);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var9.coord2.packed(-1479249224);
         }

         return 1;
      } else if (var0 == 6693) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var41 = class463.WorldMapElement_get(var8, (byte)0);
         if (null == var41.menuTargetName) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var41.menuTargetName;
         }

         return 1;
      } else if (var0 == 6694) {
         int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var40 = class463.WorldMapElement_get(var7, (byte)0);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var40.textSize * 1000629255;
         return 1;
      } else if (6695 == var0) {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var39 = class463.WorldMapElement_get(var6, (byte)0);
         if (var39 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -629421571 * var39.category;
         }

         return 1;
      } else if (6696 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var4 = class463.WorldMapElement_get(var3, (byte)0);
         if (var4 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.sprite1 * -393425597;
         }

         return 1;
      } else if (6697 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.mapElement * -1281703535;
         return 1;
      } else if (var0 == 6698) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.coord1.packed(-9692910);
         return 1;
      } else if (6699 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.coord2.packed(1129356589);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ek")
   static int method1033(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -517551721);
         var3 = false;
      } else {
         var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (var0 == 1300) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var17 >= 0 && var17 < 32) {
            var4.setAction(var17, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], 1720293839);
            return 1;
         } else {
            SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
            return 1;
         }
      } else if (var0 == 1301) {
         class408.Interpreter_intStackSize -= 708726074;
         int var16 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var22 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         var4.parent = class226.widgetDefinition.getWidgetChild(var16, var22, -2090772979);
         return 1;
      } else if (1302 == var0) {
         var4.isScrollBar = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else if (1303 == var0) {
         var4.dragZoneSize = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 709401353;
         return 1;
      } else if (1304 == var0) {
         var4.dragThreshold = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 2011961339;
         return 1;
      } else if (1305 == var0) {
         var4.dataText = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         return 1;
      } else if (1306 == var0) {
         var4.spellActionName = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         return 1;
      } else if (var0 == 1307) {
         var4.actions = null;
         var4.field4536 = (String[][])null;
         return 1;
      } else if (var0 == 1308) {
         var4.prioritizeMenuEntry = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else if (var0 == 1309) {
         class408.Interpreter_intStackSize -= -1793120611;
         return 1;
      } else if (1310 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var15 >= 0 && var15 <= 9 && var4.field4536 != null) {
            var4.field4536[var15] = null;
            return 1;
         } else {
            return 1;
         }
      } else if (var0 == 1311) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         int var21 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var21 >= 0 && var21 <= 9 && var14 >= 0) {
            var4.method8056(
               var21, var14, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], 1998511264
            );
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 1312) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (-1 == var13) {
            var4.targetPriority = 1300706076;
         } else if (var13 >= 1 && var13 <= 32) {
            var4.targetPriority = 1398918343 * (var13 - 1);
         }

         return 1;
      } else if (var0 != 1350) {
         if (1351 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            byte var12 = 10;
            byte[] var20 = new byte[]{(byte)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]};
            byte[] var27 = new byte[]{(byte)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]};
            MouseHandler.Widget_setKey(var4, var12, var20, var27, (short)512);
            return 1;
         } else if (var0 == 1352) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var11 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] - 1;
            int var19 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            int var26 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
            if (var11 >= 0 && var11 <= 9) {
               class161.Widget_setKeyRate(var4, var11, var19, var26, -316476348);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 1353) {
            byte var10 = 10;
            int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            class161.Widget_setKeyRate(var4, var10, var18, var25, 1738786217);
            return 1;
         } else if (var0 == 1354) {
            class408.Interpreter_intStackSize -= -1793120611;
            int var9 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] - 1;
            if (var9 >= 0 && var9 <= 9) {
               class379.Widget_setKeyIgnoreHeld(var4, var9, (short)28447);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (1355 == var0) {
            byte var8 = 10;
            class379.Widget_setKeyIgnoreHeld(var4, var8, (short)20060);
            return 1;
         } else {
            return 2;
         }
      } else {
         byte[] var5 = null;
         byte[] var6 = null;
         if (var3) {
            class408.Interpreter_intStackSize -= -751336926;
            byte var7 = 0;

            while (var7 < 10 && Interpreter_intStack[var7 + 327716789 * class408.Interpreter_intStackSize] >= 0) {
               var7 += 2;
            }

            if (var7 > 0) {
               var5 = new byte[var7 / 2];
               var6 = new byte[var7 / 2];

               for (int var23 = var7 - 2; var23 >= 0; var23 -= 2) {
                  var5[var23 / 2] = (byte)Interpreter_intStack[var23 + class408.Interpreter_intStackSize * 327716789];
                  var6[var23 / 2] = (byte)Interpreter_intStack[1 + var23 + class408.Interpreter_intStackSize * 327716789];
               }
            }
         } else {
            class408.Interpreter_intStackSize -= 708726074;
            var5 = new byte[]{(byte)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789]};
            var6 = new byte[]{(byte)Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]};
         }

         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var24 >= 0 && var24 <= 9) {
            MouseHandler.Widget_setKey(var4, var24, var5, var6, (short)512);
            return 1;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;IZLcu;)V")
   @ObfuscatedName("dh")
   static void method1009(Widget var0, int var1, boolean var2, Script var3) {
      if (var0.children == null) {
         var0.children = new Widget[var1 + 1];
      }

      if (var0.children.length <= var1) {
         Widget[] var4 = new Widget[1 + var1];
         System.arraycopy(var0.children, 0, var4, 0, var0.children.length);
         var0.children = var4;
      } else {
         Widget var5 = var0.children[var1];
         if (var5 != null) {
            if (var2) {
               throw new RuntimeException("");
            }

            ClickAction.method11249(var5, var0, (short)9077);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fb")
   static int method1054(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (1700 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -432785191) * 229543455 - 1] = 519959917 * var3.itemId;
         return 1;
      } else if (var0 == -1215381403) {
         if (-1 != var3.itemId * 273063743) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1532096415) * 327716789 - 1] = -403493130 * var3.itemQuantity;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 427649751) * -1093526153 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 343232086) * 327716789 - 1] = var3.childIndex * 2029967817;
         return 1;
      } else if (var0 == 1703) {
         int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -795907586) * 327716789];
         ParamComposition var8 = WorldMap.getParamDefinition(var7, -705192012);
         if (ParamComposition.method4969(var8, -135470718)) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1289758678 - 1] = var3.method8068(
               var7, var8.defaultStr, (byte)86
            );
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1323712980) * -1092779534 - 1] = var3.method8071(
               var7, -822826545 * var8.defaultInt, -1925383453
            );
         }

         return 1;
      } else if (1704 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var5 = class39.method651(var4, 775050645);
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1652615116) * -2127959386];
         Widget.method8079(var3, var6, var5, (byte)7);
         return 1;
      } else if (var0 == -1515007187) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 690862679 - 1] = var3.method8113((byte)14) ? 1 : 0;
         return 1;
      } else if (1708 == var0) {
         return FriendSystem.method472(var3, 2132673819);
      } else {
         return 1709 == var0 ? class28.method532(var3, (byte)-30) : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I)V")
   @ObfuscatedName("di")
   static void method1012(Widget var0, int var1) {
      if (0 == var0.type * 928687775 && 2077538819 * var0.childIndex > -1) {
         if (var1 > var0.field4454 * -86298045) {
            var0.field4454 = var1 * -593417621;
         }

         if (var1 < -1516264759 * var0.field4453) {
            var0.field4453 = -1970530439 * var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I)V")
   @ObfuscatedName("dj")
   static void method1013(Widget var0, int var1) {
      if (0 == var0.type * 928687775 && 2077538819 * var0.childIndex > -1) {
         if (var1 > var0.field4454 * -1248961497) {
            var0.field4454 = var1 * 799600906;
         }

         if (var1 < -1752444850 * var0.field4453) {
            var0.field4453 = -1970530439 * var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I)V")
   @ObfuscatedName("da")
   static void method1014(Widget var0, int var1) {
      if (0 == var0.type * 928687775 && 2077538819 * var0.childIndex > -1) {
         if (var1 > var0.field4454 * 22536532) {
            var0.field4454 = var1 * -593417621;
         }

         if (var1 < -1516264759 * var0.field4453) {
            var0.field4453 = 1876894377 * var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gq")
   static int method1103(int var0, Script var1, boolean var2) {
      if (var0 == -849190793) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1351312522) * 327716789 - 1] = class182.getWindowedMode(843319024);
         return 1;
      } else if (-1177904104 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (1 == var4 || var4 == 2) {
            MouseHandler.setWindowedMode(var4, 392937919);
         }

         return 1;
      } else if (5308 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -692912712) * 200483268 - 1] = class468.clientPreferences.getWindowMode((byte)9);
         return 1;
      } else if (var0 != 5309) {
         if (var0 == 40304302) {
            class408.Interpreter_intStackSize -= -1793120611;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var3 == 1 || var3 == 2) {
            class468.clientPreferences.updateWindowMode(var3, -64226290);
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hy")
   static int method1108(int var0, Script var1, boolean var2) {
      if (5504 == var0) {
         class408.Interpreter_intStackSize -= 576748941;
         int var5 = Interpreter_intStack[-177932835 * class408.Interpreter_intStackSize];
         int var4 = Interpreter_intStack[1 + -1412204584 * class408.Interpreter_intStackSize];
         if (!client.isCameraLocked) {
            client.camAngleX = var5 * -437578167;
            client.camAngleY = var4 * 1524568176;
         }

         return 1;
      } else if (var0 == 1268828543) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 474285680) * 327716789 - 1] = 1016118265 * client.camAngleX;
         return 1;
      } else if (var0 == 2059446382) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 547771303 * client.camAngleY;
         return 1;
      } else if (-1497039000 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1160727502) * 327716789];
         if (var3 < 0) {
            var3 = 0;
         }

         client.camFollowHeight = var3 * 435137032;
         return 1;
      } else if (var0 == 1864710139) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1924189385) * 983125242 - 1] = client.camFollowHeight * 249033505;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("dx")
   static int method1016(int var0, Script var1, boolean var2) {
      if (100 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var32 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var48 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var59 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         boolean var68 = Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789] != 0;
         Widget var76 = class226.widgetDefinition.method7953(var32, 427180975);
         if (928687775 * var76.type != 0) {
            throw new RuntimeException("");
         } else {
            GrandExchangeOfferOwnWorldComparator.method1278(var76, var59, var68, var1, -318906937);
            Widget var80 = new Widget();
            var80.type = var48 * -530909857;
            var80.parentId = (var80.id = var76.id * 1) * -1601929789;
            var80.childIndex = 1657618603 * var59;
            var80.isIf3 = true;
            if (var48 == 12) {
               SongTask.method10543(var80, (short)30911);
            }

            var76.children[var59] = var80;
            if (var2) {
               UserComparator3.scriptDotWidget = var80;
            } else {
               class222.scriptActiveWidget = var80;
            }

            class376.invalidateWidget(var76, (byte)5);
            return 1;
         }
      } else if (101 == var0) {
         Widget var31 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var47 = class226.widgetDefinition.method7953(278777747 * var31.id, 247439412);
         ClickAction.method11249(var31, var47, (short)4406);
         class376.invalidateWidget(var47, (byte)5);
         return 1;
      } else if (var0 == 102) {
         class408.Interpreter_intStackSize -= -1793120611;
         int var30 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Widget var46 = class226.widgetDefinition.method7953(var30, -1284792644);
         var46.children = null;
         class376.invalidateWidget(var46, (byte)5);
         return 1;
      } else if (var0 == 105) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var29 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var58 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         Widget var67 = class226.widgetDefinition.method7953(var29, 1296618915);
         Widget var75 = class226.widgetDefinition.getWidgetChild(var29, var45, -1217864859);
         if (null == var67) {
            throw new RuntimeException("");
         } else if (var45 < 0) {
            throw new RuntimeException("");
         } else if (var75 == null) {
            throw new RuntimeException("");
         } else if (0 == 928687775 * var75.type) {
            throw new RuntimeException("");
         } else {
            GrandExchangeOfferOwnWorldComparator.method1278(var67, var58, true, var1, 1854826005);
            if (-1 != var75.field4451 * 1865628485) {
               Widget var78 = class226.widgetDefinition.getWidgetChild(var29, var75.field4451 * 1865628485, -1074662989);
               class418.method9195(var78, var58, (byte)0);
            }

            Widget var79 = new Widget(var75);
            var79.childIndex = var58 * 1657618603;
            if (12 == var75.type * 928687775) {
               SongTask.method10543(var79, (short)7124);
            }

            var67.children[var58] = var79;
            if (var2) {
               UserComparator3.scriptDotWidget = var79;
            } else {
               class222.scriptActiveWidget = var79;
            }

            class376.invalidateWidget(var67, (byte)5);
            return 1;
         }
      } else if (106 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var28 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Widget var57 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var57 == null) {
            throw new RuntimeException("");
         } else {
            Widget var66 = class226.widgetDefinition.method7953(var57.parentId * 794900977, 1214263547);
            if (0 != var57.type * 928687775) {
               throw new RuntimeException("");
            } else if (0 != var66.type * 928687775) {
               throw new RuntimeException();
            } else {
               GrandExchangeOfferOwnWorldComparator.method1278(var66, var44, true, var1, -1480684452);
               class418.method9195(var57, var44, (byte)0);
               Widget var74 = new Widget();
               var74.type = -530909857 * var28;
               var74.parentId = (var74.id = 1 * var66.id) * -1601929789;
               var74.field4451 = var57.childIndex * -1613901657;
               var74.childIndex = 1657618603 * var44;
               var74.isIf3 = true;
               if (var28 == 12) {
                  SongTask.method10543(var74, (short)24956);
               }

               var66.children[var44] = var74;
               if (var2) {
                  UserComparator3.scriptDotWidget = var74;
               } else {
                  class222.scriptActiveWidget = var74;
               }

               class376.invalidateWidget(var66, (byte)5);
               return 1;
            }
         }
      } else if (107 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var27 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Widget var56 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var56 == null) {
            throw new RuntimeException("");
         } else {
            Widget var65 = class226.widgetDefinition.getWidgetChild(var56.parentId * 794900977, var56.field4451 * 1865628485, -1633546021);
            Widget var73 = class226.widgetDefinition.method7953(794900977 * var65.parentId, 1008136380);
            if (928687775 * var65.type != 0) {
               throw new RuntimeException("");
            } else if (0 != var73.type * 928687775) {
               throw new RuntimeException();
            } else {
               GrandExchangeOfferOwnWorldComparator.method1278(var73, var43, true, var1, -389821790);
               class418.method9195(var65, var43, (byte)0);
               Widget var77 = new Widget();
               var77.type = -530909857 * var27;
               var77.parentId = (var77.id = var73.id * 1) * -1601929789;
               var77.field4451 = var65.childIndex * -1613901657;
               var77.childIndex = 1657618603 * var43;
               var77.isIf3 = true;
               if (var27 == 12) {
                  SongTask.method10543(var77, (short)14766);
               }

               var73.children[var43] = var77;
               if (var2) {
                  UserComparator3.scriptDotWidget = var77;
               } else {
                  class222.scriptActiveWidget = var77;
               }

               class376.invalidateWidget(var73, (byte)5);
               return 1;
            }
         }
      } else if (var0 == 200) {
         class408.Interpreter_intStackSize -= 708726074;
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var42 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Widget var55 = var42 != -1 ? class226.widgetDefinition.getWidgetChild(var26, var42, -766904727) : null;
         WorldMapRectangle.method7261(var55, var2, -870120302);
         return 1;
      } else if (201 == var0) {
         WorldMapRectangle.method7261(
            class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 788391044),
            var2,
            -218574718
         );
         return 1;
      } else if (204 == var0) {
         Widget var25 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var41 = null != var25 ? class226.widgetDefinition.getWidgetChild(var25.parentId * 794900977, var25.field4451 * 1865628485, -621785385) : null;
         WorldMapRectangle.method7261(var41, var2, -873520244);
         return 1;
      } else if (205 == var0) {
         Widget var24 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var40 = null != var24 ? class226.widgetDefinition.method7953(var24.parentId * 794900977, 899025514) : null;
         WorldMapRectangle.method7261(var40, var2, -2049734043);
         return 1;
      } else if (var0 == 206) {
         Widget var23 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var23 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else if (var23.childIndex * 2077538819 == -1) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            Widget var39 = class226.widgetDefinition.method7953(var23.parentId * 794900977, 1931100062);
            Widget var54 = null;

            for (int var64 = var23.childIndex * 2077538819 + 1; var64 < var39.children.length; var64++) {
               Widget var72 = var39.children[var64];
               if (null != var72 && var72.field4451 * 1865628485 == var23.field4451 * 1865628485) {
                  var54 = var72;
                  break;
               }
            }

            WorldMapRectangle.method7261(var54, var2, -1964611688);
            return 1;
         }
      } else if (207 == var0) {
         Widget var22 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (null == var22) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else if (var22.childIndex * 2077538819 == -1) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            Widget var38 = class226.widgetDefinition.method7953(794900977 * var22.parentId, -91299219);
            Widget var53 = null;

            for (int var63 = 2077538819 * var22.childIndex - 1; var63 >= 0; var63--) {
               Widget var71 = var38.children[var63];
               if (var71 != null && var22.field4451 * 1865628485 == 1865628485 * var71.field4451) {
                  var53 = var71;
                  break;
               }
            }

            WorldMapRectangle.method7261(var53, var2, -1370652834);
            return 1;
         }
      } else if (var0 == 208) {
         Widget var21 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (null == var21) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else if (0 != var21.type * 928687775) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            Widget var37 = class226.widgetDefinition.method7953(794900977 * var21.parentId, 1030708806);
            if (var37.children == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            } else {
               int var52 = 0;

               for (int var62 = 0; var62 < var37.children.length; var62++) {
                  Widget var70 = var37.children[var62];
                  if (var70 != null && 1865628485 * var70.field4451 == var21.childIndex * 2077538819) {
                     var52++;
                  }
               }

               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52;
               return 1;
            }
         }
      } else if (var0 == 209) {
         Widget var20 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var20 != null ? 1865628485 * var20.field4451 : -1;
         return 1;
      } else if (210 == var0) {
         int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var51 = class39.method651(var19, 1753193173);
         int var61 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var69 = class39.method651(var36, 1154784617);
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         ParamComposition var9 = WorldMap.getParamDefinition(var8, -266807229);
         Object var10 = ParamComposition.method4969(var9, 1599169346) ? var9.defaultStr : -822826545 * var9.defaultInt;
         Object var11 = null;
         if (var61 >= 0) {
            ParamComposition var12 = WorldMap.getParamDefinition(var61, -1017230255);
            var11 = ParamComposition.method4969(var12, 1690050562) ? var12.defaultStr : -822826545 * var12.defaultInt;
         }

         Widget var81 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1287969638);
         Widget var13 = null;
         if (var81 != null && null != var81.children) {
            for (int var14 = 0; var14 < var81.children.length; var14++) {
               Widget var15 = var81.children[var14];
               if (null != var15
                  && (var8 < 0 || var15.method8068(var8, var10, (byte)83).equals(var69))
                  && (var61 < 0 || var15.method8068(var61, var11, (byte)121).equals(var51))) {
                  var13 = var15;
                  break;
               }
            }
         }

         WorldMapRectangle.method7261(var13, var2, -6095174);
         return 1;
      } else if (var0 == 211) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var18 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Widget var35 = class226.widgetDefinition.method7953(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1], 809563331);
         int var50 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         field340.method8241(var18, var35, var50, (byte)88);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = field340.method8251(1353125468);
         return 1;
      } else if (var0 == 212) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Widget var34 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var34.childIndex * 2077538819 == -1) {
            field340.method8241(var17, var34, -1, (byte)73);
         } else {
            field340.method8241(var17, class226.widgetDefinition.method7953(var34.parentId * 794900977, -1765955612), var34.childIndex * 2077538819, (byte)44);
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = field340.method8251(-1599455025);
         return 1;
      } else if (var0 == 213) {
         WorldMapRectangle.method7261(field340.method8255(-310190320), var2, -151772761);
         return 1;
      } else if (214 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = field340.method8259((short)7891);
         return 1;
      } else if (var0 == 215) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class356.method7752(
            class380.method8267(field340, 1137164883), -2123727096
         );
         return 1;
      } else if (216 == var0) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var33 = class39.method651(var16, 1387611217);
         int var49 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         ParamComposition var60 = WorldMap.getParamDefinition(var49, -1866648464);
         Object var7 = ParamComposition.method4969(var60, -45292322) ? var60.defaultStr : -822826545 * var60.defaultInt;
         class380.method8270(field340, var49, var33, var7, -651505321);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = field340.method8251(-1083633336);
         return 1;
      } else if (217 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Widget var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var4 == null) {
            throw new RuntimeException("");
         } else if (0 != 928687775 * var4.type) {
            throw new RuntimeException("");
         } else {
            Widget var5 = class226.widgetDefinition.method7953(794900977 * var4.parentId, 721742643);
            if (928687775 * var5.type != 0) {
               throw new RuntimeException();
            } else {
               Widget var6 = GrandExchangeOfferOwnWorldComparator.method1279(var3, var5, var4, -1772165511);
               WorldMapRectangle.method7261(var6, var2, -319812315);
               return 1;
            }
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("dq")
   static int method1017(int var0, Script var1, boolean var2) {
      if (100 == var0) {
         class408.Interpreter_intStackSize -= -1483414297;
         int var32 = Interpreter_intStack[-490845922 * class408.Interpreter_intStackSize];
         int var48 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var59 = Interpreter_intStack[class408.Interpreter_intStackSize * -271653886 + 2];
         boolean var68 = Interpreter_intStack[3 + class408.Interpreter_intStackSize * 1136275158] != 0;
         Widget var76 = class226.widgetDefinition.method7953(var32, 1476180090);
         if (928687775 * var76.type != 0) {
            throw new RuntimeException("");
         } else {
            GrandExchangeOfferOwnWorldComparator.method1278(var76, var59, var68, var1, 319048458);
            Widget var80 = new Widget();
            var80.type = var48 * 1596168633;
            var80.parentId = (var80.id = var76.id * 1) * -395383331;
            var80.childIndex = 1110228715 * var59;
            var80.isIf3 = true;
            if (var48 == 12) {
               SongTask.method10543(var80, (short)32508);
            }

            var76.children[var59] = var80;
            if (var2) {
               UserComparator3.scriptDotWidget = var80;
            } else {
               class222.scriptActiveWidget = var80;
            }

            class376.invalidateWidget(var76, (byte)5);
            return 1;
         }
      } else if (101 == var0) {
         Widget var31 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var47 = class226.widgetDefinition.method7953(1836957033 * var31.id, -2028985824);
         ClickAction.method11249(var31, var47, (short)13576);
         class376.invalidateWidget(var47, (byte)5);
         return 1;
      } else if (var0 == 102) {
         class408.Interpreter_intStackSize -= -1793120611;
         int var30 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Widget var46 = class226.widgetDefinition.method7953(var30, -1114801459);
         var46.children = null;
         class376.invalidateWidget(var46, (byte)5);
         return 1;
      } else if (var0 == 1837165307) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var29 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var58 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 1997817770];
         Widget var67 = class226.widgetDefinition.method7953(var29, -188682227);
         Widget var75 = class226.widgetDefinition.getWidgetChild(var29, var45, -634790758);
         if (null == var67) {
            throw new RuntimeException("");
         } else if (var45 < 0) {
            throw new RuntimeException("");
         } else if (var75 == null) {
            throw new RuntimeException("");
         } else if (0 == -584762511 * var75.type) {
            throw new RuntimeException("");
         } else {
            GrandExchangeOfferOwnWorldComparator.method1278(var67, var58, true, var1, 510356129);
            if (-1 != var75.field4451 * 47564314) {
               Widget var78 = class226.widgetDefinition.getWidgetChild(var29, var75.field4451 * 1865628485, -1704815711);
               class418.method9195(var78, var58, (byte)0);
            }

            Widget var79 = new Widget(var75);
            var79.childIndex = var58 * 305881341;
            if (12 == var75.type * 1014756217) {
               SongTask.method10543(var79, (short)9205);
            }

            var67.children[var58] = var79;
            if (var2) {
               UserComparator3.scriptDotWidget = var79;
            } else {
               class222.scriptActiveWidget = var79;
            }

            class376.invalidateWidget(var67, (byte)5);
            return 1;
         }
      } else if (-554414137 == var0) {
         class408.Interpreter_intStackSize -= 984361585;
         int var28 = Interpreter_intStack[-2004794442 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[1 + 1892590359 * class408.Interpreter_intStackSize];
         Widget var57 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var57 == null) {
            throw new RuntimeException("");
         } else {
            Widget var66 = class226.widgetDefinition.method7953(var57.parentId * 794900977, 1465416094);
            if (0 != var57.type * -1514366093) {
               throw new RuntimeException("");
            } else if (0 != var66.type * 928687775) {
               throw new RuntimeException();
            } else {
               GrandExchangeOfferOwnWorldComparator.method1278(var66, var44, true, var1, -1650669416);
               class418.method9195(var57, var44, (byte)0);
               Widget var74 = new Widget();
               var74.type = -530909857 * var28;
               var74.parentId = (var74.id = 1 * var66.id) * -1601929789;
               var74.field4451 = var57.childIndex * 739318046;
               var74.childIndex = 598735135 * var44;
               var74.isIf3 = true;
               if (var28 == 12) {
                  SongTask.method10543(var74, (short)20068);
               }

               var66.children[var44] = var74;
               if (var2) {
                  UserComparator3.scriptDotWidget = var74;
               } else {
                  class222.scriptActiveWidget = var74;
               }

               class376.invalidateWidget(var66, (byte)5);
               return 1;
            }
         }
      } else if (107 == var0) {
         class408.Interpreter_intStackSize -= -1406330248;
         int var27 = Interpreter_intStack[1822233594 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Widget var56 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var56 == null) {
            throw new RuntimeException("");
         } else {
            Widget var65 = class226.widgetDefinition.getWidgetChild(var56.parentId * 780211516, var56.field4451 * 1865628485, -917149199);
            Widget var73 = class226.widgetDefinition.method7953(794900977 * var65.parentId, 1957292033);
            if (911907185 * var65.type != 0) {
               throw new RuntimeException("");
            } else if (0 != var73.type * -340238484) {
               throw new RuntimeException();
            } else {
               GrandExchangeOfferOwnWorldComparator.method1278(var73, var43, true, var1, -1572534755);
               class418.method9195(var65, var43, (byte)0);
               Widget var77 = new Widget();
               var77.type = -530909857 * var27;
               var77.parentId = (var77.id = var73.id * 1) * -1601929789;
               var77.field4451 = var65.childIndex * -1613901657;
               var77.childIndex = 1657618603 * var43;
               var77.isIf3 = true;
               if (var27 == 12) {
                  SongTask.method10543(var77, (short)8255);
               }

               var73.children[var43] = var77;
               if (var2) {
                  UserComparator3.scriptDotWidget = var77;
               } else {
                  class222.scriptActiveWidget = var77;
               }

               class376.invalidateWidget(var73, (byte)5);
               return 1;
            }
         }
      } else if (var0 == -521668235) {
         class408.Interpreter_intStackSize -= 708726074;
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * -929654952];
         int var42 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 531566999];
         Widget var55 = var42 != -1 ? class226.widgetDefinition.getWidgetChild(var26, var42, -1102966860) : null;
         WorldMapRectangle.method7261(var55, var2, -1308807510);
         return 1;
      } else if (7318780 == var0) {
         WorldMapRectangle.method7261(
            class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1284936784) * 327716789], -1401917980),
            var2,
            -1760109958
         );
         return 1;
      } else if (204 == var0) {
         Widget var25 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var41 = null != var25
            ? class226.widgetDefinition.getWidgetChild(var25.parentId * -1218443552, var25.field4451 * 1865628485, -1578842855)
            : null;
         WorldMapRectangle.method7261(var41, var2, -1619138753);
         return 1;
      } else if (-291510366 == var0) {
         Widget var24 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var40 = null != var24 ? class226.widgetDefinition.method7953(var24.parentId * -1973363469, -740787935) : null;
         WorldMapRectangle.method7261(var40, var2, -451515186);
         return 1;
      } else if (var0 == 206) {
         Widget var23 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var23 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1669423449 - 1] = 0;
            return 1;
         } else if (var23.childIndex * 1453598437 == -1) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            Widget var39 = class226.widgetDefinition.method7953(var23.parentId * 794900977, 205869268);
            Widget var54 = null;

            for (int var64 = var23.childIndex * 2077538819 + 1; var64 < var39.children.length; var64++) {
               Widget var72 = var39.children[var64];
               if (null != var72 && var72.field4451 * 1090725843 == var23.field4451 * 151187708) {
                  var54 = var72;
                  break;
               }
            }

            WorldMapRectangle.method7261(var54, var2, -98648847);
            return 1;
         }
      } else if (207 == var0) {
         Widget var22 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (null == var22) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 713447272) * 327716789 - 1] = 0;
            return 1;
         } else if (var22.childIndex * 2077538819 == -1) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 704426384) * 327716789 - 1] = 0;
            return 1;
         } else {
            Widget var38 = class226.widgetDefinition.method7953(794900977 * var22.parentId, 2122053435);
            Widget var53 = null;

            for (int var63 = 2077538819 * var22.childIndex - 1; var63 >= 0; var63--) {
               Widget var71 = var38.children[var63];
               if (var71 != null && var22.field4451 * -869871570 == 1865628485 * var71.field4451) {
                  var53 = var71;
                  break;
               }
            }

            WorldMapRectangle.method7261(var53, var2, -265448431);
            return 1;
         }
      } else if (var0 == 208) {
         Widget var21 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (null == var21) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1849906128) * 327716789 - 1] = 0;
            return 1;
         } else if (0 != var21.type * 1074074133) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1762597881) * 327716789 - 1] = 0;
            return 1;
         } else {
            Widget var37 = class226.widgetDefinition.method7953(794900977 * var21.parentId, -243499274);
            if (var37.children == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            } else {
               int var52 = 0;

               for (int var62 = 0; var62 < var37.children.length; var62++) {
                  Widget var70 = var37.children[var62];
                  if (var70 != null && 298259045 * var70.field4451 == var21.childIndex * -1070168476) {
                     var52++;
                  }
               }

               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1974919962 - 1] = var52;
               return 1;
            }
         }
      } else if (var0 == 209) {
         Widget var20 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1348448502) * 1140406233 - 1] = var20 != null ? 1865628485 * var20.field4451 : -1;
         return 1;
      } else if (210 == var0) {
         int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 2073047299) * 327716789];
         Object var51 = class39.method651(var19, 1035689030);
         int var61 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1067308125) * 1753240542];
         Object var69 = class39.method651(var36, 755609428);
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1193255773) * -1836176639];
         ParamComposition var9 = WorldMap.getParamDefinition(var8, -875820395);
         Object var10 = ParamComposition.method4969(var9, 244325521) ? var9.defaultStr : -822826545 * var9.defaultInt;
         Object var11 = null;
         if (var61 >= 0) {
            ParamComposition var12 = WorldMap.getParamDefinition(var61, -2144786995);
            var11 = ParamComposition.method4969(var12, 1371325552) ? var12.defaultStr : -822826545 * var12.defaultInt;
         }

         Widget var81 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -939854897) * 327716789], -504718253);
         Widget var13 = null;
         if (var81 != null && null != var81.children) {
            for (int var14 = 0; var14 < var81.children.length; var14++) {
               Widget var15 = var81.children[var14];
               if (null != var15
                  && (var8 < 0 || var15.method8068(var8, var10, (byte)23).equals(var69))
                  && (var61 < 0 || var15.method8068(var61, var11, (byte)80).equals(var51))) {
                  var13 = var15;
                  break;
               }
            }
         }

         WorldMapRectangle.method7261(var13, var2, -1331829864);
         return 1;
      } else if (var0 == 1480409792) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var18 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Widget var35 = class226.widgetDefinition.method7953(Interpreter_intStack[class408.Interpreter_intStackSize * -1704485556 + 1], 1041103921);
         int var50 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         field340.method8241(var18, var35, var50, (byte)111);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1449532641) * 327716789 - 1] = field340.method8251(1966109169);
         return 1;
      } else if (var0 == 1641940509) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 420246776) * 327716789];
         Widget var34 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var34.childIndex * 2077538819 == -1) {
            field340.method8241(var17, var34, -1, (byte)20);
         } else {
            field340.method8241(var17, class226.widgetDefinition.method7953(var34.parentId * 1472316611, -11857096), var34.childIndex * 2077538819, (byte)100);
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1406352958) * -209769819 - 1] = field340.method8251(552088462);
         return 1;
      } else if (var0 == 213) {
         WorldMapRectangle.method7261(field340.method8255(687397744), var2, -699370586);
         return 1;
      } else if (814784165 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 357126509) * 1251058923 - 1] = field340.method8259((short)26057);
         return 1;
      } else if (var0 == -145074298) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1329019968) * -1595015587 - 1] = class356.method7752(
            class380.method8267(field340, 579087130), 1105486713
         );
         return 1;
      } else if (216 == var0) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1859011848) * 327716789];
         Object var33 = class39.method651(var16, 1041178800);
         int var49 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         ParamComposition var60 = WorldMap.getParamDefinition(var49, -877796982);
         Object var7 = ParamComposition.method4969(var60, 913692215) ? var60.defaultStr : -822826545 * var60.defaultInt;
         class380.method8270(field340, var49, var33, var7, -651505321);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = field340.method8251(1986120861);
         return 1;
      } else if (-729110374 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Widget var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var4 == null) {
            throw new RuntimeException("");
         } else if (0 != 593652117 * var4.type) {
            throw new RuntimeException("");
         } else {
            Widget var5 = class226.widgetDefinition.method7953(-1343842816 * var4.parentId, 943188192);
            if (-1768466751 * var5.type != 0) {
               throw new RuntimeException();
            } else {
               Widget var6 = GrandExchangeOfferOwnWorldComparator.method1279(var3, var5, var4, -1892197298);
               WorldMapRectangle.method7261(var6, var2, -1574720498);
               return 1;
            }
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILof;Lof;)Lof;")
   @ObfuscatedName("du")
   static Widget method1019(int var0, Widget var1, Widget var2) {
      int var3 = 0;
      Widget var4 = null;

      for (int var5 = 1 + var2.childIndex * 2077538819; var5 < var1.children.length; var5++) {
         Widget var6 = var1.children[var5];
         if (null != var6 && var2.childIndex * 2077538819 == var6.field4451 * 1865628485) {
            if (++var3 - 1 == var0) {
               var4 = var6;
               break;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Z)V")
   @ObfuscatedName("dm")
   static void method1021(Widget var0, boolean var1) {
      if (var0 != null) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 259334630 - 1] = 1;
         if (var1) {
            UserComparator3.scriptDotWidget = var0;
         } else {
            class222.scriptActiveWidget = var0;
         }
      } else {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -2138315097 - 1] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ib")
   static int method1128(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Z)V")
   @ObfuscatedName("dg")
   static void method1022(Widget var0, boolean var1) {
      if (var0 != null) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
         if (var1) {
            UserComparator3.scriptDotWidget = var0;
         } else {
            class222.scriptActiveWidget = var0;
         }
      } else {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ee")
   static int method1030(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -635770020);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      class376.invalidateWidget(var3, (byte)5);
      if (var0 == 1200 || var0 == 1205 || 1212 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var10 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var11 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         var3.itemId = 1664178957 * var10;
         var3.itemQuantity = -1909037165 * var11;
         ItemComposition var6 = class150.ItemDefinition_get(var10, -1547512475);
         var3.modelAngleX = -1892318899 * var6.xan2d;
         var3.modelAngleY = 1357613173 * var6.yan2d;
         var3.modelAngleZ = 1714868007 * var6.zan2d;
         var3.modelOffsetX = var6.offsetX2d * 2127673313;
         var3.modelOffsetY = 1491904511 * var6.offsetY2d;
         var3.modelZoom = var6.zoom2d * -1257260919;
         if (var0 == 1205) {
            var3.itemQuantityMode = 0;
         } else if (var0 == 1212 | 1515235515 * var6.isStackable == 1) {
            var3.itemQuantityMode = 1927430291;
         } else {
            var3.itemQuantityMode = -440106714;
         }

         if (var3.field4546 * -209716257 > 0) {
            var3.modelZoom = 1874496800 * var3.modelZoom / (var3.field4546 * -209716257) * 2012543961;
         } else if (var3.rawWidth * 1127299583 > 0) {
            var3.modelZoom = 1874496800 * var3.modelZoom / (1127299583 * var3.rawWidth) * 2012543961;
         }

         return 1;
      } else if (1201 == var0) {
         var3.modelType = 1154574418;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         return 1;
      } else if (var0 == 1202) {
         var3.modelType = -415622021;
         var3.modelId = PlayerComposition.method7917(class330.localPlayer.appearance, (byte)0) * -1314816461;
         return 1;
      } else if (1207 == var0) {
         boolean var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         var3.method8172(class330.localPlayer.appearance, var9, -1616088664);
         return 1;
      } else if (1208 == var0) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (null == var3.field4497) {
            throw new RuntimeException("");
         } else {
            var3.field4497.method7936(var8, -1064735412);
            return 1;
         }
      } else if (1209 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var7 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var5 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         if (var3.field4497 == null) {
            throw new RuntimeException("");
         } else {
            PlayerComposition.method7931(var3.field4497, var7, var5, 1665628438);
            return 1;
         }
      } else if (var0 == 1210) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (null == var3.field4497) {
            throw new RuntimeException("");
         } else {
            var3.field4497.method7925(class330.localPlayer.appearance.gender * -941255479, var4, -1704793879);
            return 1;
         }
      } else if (var0 == 1214) {
         var3.modelType = 323330376;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         return 1;
      } else if (var0 == 1215) {
         var3.modelType = -1246866063;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("de")
   static int method1024(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= -440122156) {
         var0 -= 1000;
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -726891953) * 327716789];
         var3 = class226.widgetDefinition.method7953(var4, -738059503);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (-549114722 == var0) {
         class408.Interpreter_intStackSize -= 748840110;
         var3.rawX = Interpreter_intStack[1277292394 * class408.Interpreter_intStackSize] * 1690200479;
         var3.rawY = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] * -1081551892;
         var3.xAlignment = -1002359914 * Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         var3.yAlignment = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 3] * 735789436;
         class376.invalidateWidget(var3, (byte)5);
         SecureUrlRequester.client.alignWidget(var3, 161779876);
         if (928687775 * var3.type == 0) {
            Widget[] var7 = -1 == 2077538819 * var3.childIndex
               ? class226.widgetDefinition.Widget_interfaceComponents[-1640313283 * var3.id >> 16]
               : class226.widgetDefinition.method7953(var3.parentId * 794900977, 1037711323).children;
            class339.revalidateWidgetScroll(var7, var3, false, -176578743);
         }

         return 1;
      } else if (var0 == 1001) {
         class408.Interpreter_intStackSize -= 1417452148;
         var3.rawWidth = Interpreter_intStack[class408.Interpreter_intStackSize * 2013599823] * -390301745;
         var3.rawHeight = 1971708753 * Interpreter_intStack[-1487042741 * class408.Interpreter_intStackSize + 1];
         var3.widthAlignment = Interpreter_intStack[class408.Interpreter_intStackSize * 1496304069 + 2] * -1384270729;
         var3.heightAlignment = Interpreter_intStack[1077885264 * class408.Interpreter_intStackSize + 3] * -500921095;
         class376.invalidateWidget(var3, (byte)5);
         SecureUrlRequester.client.alignWidget(var3, 1295123724);
         if (var3.type * -558418701 == 0) {
            Widget[] var6 = 2077538819 * var3.childIndex == -1
               ? class226.widgetDefinition.Widget_interfaceComponents[var3.id * 1630789813 >> 16]
               : class226.widgetDefinition.method7953(var3.parentId * 823082670, 91018225).children;
            class339.revalidateWidgetScroll(var6, var3, false, 238783621);
         }

         return 1;
      } else if (var0 == -1052433318) {
         boolean var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (var5 != var3.isHidden) {
            var3.isHidden = var5;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1005) {
         var3.noClickThrough = Interpreter_intStack[(class408.Interpreter_intStackSize -= 694602694) * 327716789] == 1;
         return 1;
      } else if (1006 == var0) {
         var3.noScrollThrough = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fi")
   static int method1061(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1800) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = LoginPacket.Widget_unpackTargetMask(
            class191.getWidgetFlags(var3, (byte)75), 378168866
         );
         return 1;
      } else if (var0 != 1801) {
         if (1802 == var0) {
            if (null == var3.dataText) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            } else {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         var4--;
         if (null != var3.actions && var4 < var3.actions.length && null != var3.actions[var4]) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.actions[var4];
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("dk")
   static int method1025(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         var3 = class226.widgetDefinition.method7953(var4, -508057619);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (-355838984 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         var3.rawX = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -1430340077;
         var3.rawY = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 1346517259] * -752065015;
         var3.xAlignment = 288713110 * Interpreter_intStack[2 + class408.Interpreter_intStackSize * -2095757239];
         var3.yAlignment = Interpreter_intStack[1933111775 * class408.Interpreter_intStackSize + 3] * -383703912;
         class376.invalidateWidget(var3, (byte)5);
         SecureUrlRequester.client.alignWidget(var3, 1135557482);
         if (478910452 * var3.type == 0) {
            Widget[] var7 = -1 == 1461484995 * var3.childIndex
               ? class226.widgetDefinition.Widget_interfaceComponents[-1732595248 * var3.id >> 16]
               : class226.widgetDefinition.method7953(var3.parentId * -1160575428, -1864200196).children;
            class339.revalidateWidgetScroll(var7, var3, false, 306108482);
         }

         return 1;
      } else if (var0 == 1001) {
         class408.Interpreter_intStackSize -= 2109795847;
         var3.rawWidth = Interpreter_intStack[class408.Interpreter_intStackSize * 1817883735] * -858231954;
         var3.rawHeight = 1904364405 * Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         var3.widthAlignment = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2] * 38676356;
         var3.heightAlignment = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 3] * -500921095;
         class376.invalidateWidget(var3, (byte)5);
         SecureUrlRequester.client.alignWidget(var3, 1394684192);
         if (var3.type * 928687775 == 0) {
            Widget[] var6 = -1554155589 * var3.childIndex == -1
               ? class226.widgetDefinition.Widget_interfaceComponents[var3.id * 278777747 >> 16]
               : class226.widgetDefinition.method7953(var3.parentId * 794900977, -732424504).children;
            class339.revalidateWidgetScroll(var6, var3, false, 359342029);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (var5 != var3.isHidden) {
            var3.isHidden = var5;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 2061409132) {
         var3.noClickThrough = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1184410772) * -436402298] == 1;
         return 1;
      } else if (703771538 == var0) {
         var3.noScrollThrough = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("dn")
   static int method1028(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         var3 = class226.widgetDefinition.method7953(var4, -2066238734);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (var0 == 1100) {
         class408.Interpreter_intStackSize -= 708726074;
         int var39 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var45 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         if (12 == 928687775 * var3.type) {
            classOO var46 = var3.method8156(1325892881);
            if (var46 != null && var46.method8401(var39, var45, -2026342533)) {
               class376.invalidateWidget(var3, (byte)5);
            }
         } else {
            var3.scrollX = var39 * -1597374639;
            if (1068149169 * var3.scrollX > -111672215 * var3.scrollWidth - -1946208531 * var3.width) {
               var3.scrollX = -1481704391 * var3.scrollWidth - -1014270979 * var3.width;
            }

            if (1068149169 * var3.scrollX < 0) {
               var3.scrollX = 0;
            }

            var3.scrollY = 1603227665 * var45;
            if (-497311503 * var3.scrollY > -1963554889 * var3.scrollHeight - -905446999 * var3.height) {
               var3.scrollY = -50253017 * var3.scrollHeight - 351495225 * var3.height;
            }

            if (-497311503 * var3.scrollY < 0) {
               var3.scrollY = 0;
            }

            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1101) {
         var3.color = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1365603885;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1102) {
         var3.fill = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1103 == var0) {
         var3.transparencyTop = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -167855443;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1104 == var0) {
         var3.lineWid = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -249010551;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1105) {
         var3.spriteId2 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 2092479471;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1106 == var0) {
         var3.spriteAngle = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -795510295;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1107 == var0) {
         var3.spriteTiling = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1108 == var0) {
         var3.modelType = -1570196439;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1109 == var0) {
         class408.Interpreter_intStackSize -= 2126178222;
         var3.modelOffsetX = -37619155 * Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1] * -1048338377;
         var3.modelAngleX = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2] * -1977744073;
         var3.modelAngleY = 676548941 * Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
         var3.modelAngleZ = Interpreter_intStack[4 + 327716789 * class408.Interpreter_intStackSize] * 132153981;
         var3.modelZoom = 2012543961 * Interpreter_intStack[5 + class408.Interpreter_intStackSize * 327716789];
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1110 == var0) {
         int var38 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var3.sequenceId * -750054055 != var38) {
            var3.sequenceId = var38 * -12983575;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1111 == var0) {
         var3.modelOrthog = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1112 == var0) {
         String var37 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         if (var3.type * 928687775 == 12) {
            classOO var44 = var3.method8156(1365076306);
            if (null != var44 && var44.method8557((byte)-34)) {
               var44.method8378(var37, 750037389);
            } else {
               var3.text = var37;
            }

            class376.invalidateWidget(var3, (byte)5);
         } else if (!var37.equals(var3.text)) {
            var3.text = var37;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1113) {
         var3.fontId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1824873669;
         if (12 == 928687775 * var3.type) {
            classOO var36 = var3.method8156(1823302229);
            if (null != var36) {
               var36.method8416(566599567);
            }
         }

         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1114 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         if (12 == 928687775 * var3.type) {
            classOO var35 = var3.method8156(1728334378);
            if (var35 != null) {
               var35.method8405(
                  Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
                  Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1],
                  -1826878115
               );
               var35.method8412(Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789], 1025638618);
            }
         } else {
            var3.textXAlignment = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * -563011291;
            var3.textYAlignment = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize] * 1108485379;
            var3.textLineHeight = -1440610935 * Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         }

         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1115) {
         var3.textShadowed = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1116 == var0) {
         var3.outline = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 217033705;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1117 == var0) {
         var3.spriteShadow = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1846663581;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1118) {
         var3.spriteFlipV = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1119 == var0) {
         var3.spriteFlipH = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1120) {
         class408.Interpreter_intStackSize -= 708726074;
         var3.scrollWidth = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * 1897778137;
         var3.scrollHeight = 1821115911 * Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         class376.invalidateWidget(var3, (byte)5);
         if (0 == var3.type * 928687775) {
            Widget[] var34 = 2077538819 * var3.childIndex == -1
               ? class226.widgetDefinition.Widget_interfaceComponents[278777747 * var3.id >> 16]
               : class226.widgetDefinition.method7953(794900977 * var3.parentId, -273607099).children;
            class339.revalidateWidgetScroll(var34, var3, false, -1857698050);
         }

         return 1;
      } else if (var0 == 1121) {
         HealthBarDefinition.resumePauseWidget(278777747 * var3.id, 2077538819 * var3.childIndex, 1078832721);
         client.meslayerContinueWidget = var3;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1122 == var0) {
         var3.spriteId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -18433963;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1123) {
         var3.color2 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1017345247;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1124) {
         var3.transparencyBot = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 1009763901;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1125) {
         int var33 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         FillMode var43 = (FillMode)GrandExchangeOffer.findEnumerated(class299.FillMode_values(-1931037526), var33, (byte)1);
         if (null != var43) {
            var3.fillMode = var43;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1126) {
         boolean var32 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         var3.field4526 = var32;
         return 1;
      } else if (var0 == 1127) {
         boolean var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         var3.modelTransparency = var31;
         return 1;
      } else if (var0 == 1129) {
         var3.field4540 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1130 == var0) {
         var3.method8080(
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            "",
            class164.urlRequester,
            class6.getUserId(-788581181)
         );
         return 1;
      } else if (1131 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         var3.method8099(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
            Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
            -155798878
         );
         return 1;
      } else if (var0 == 1132) {
         var3.method8101(
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789],
            (byte)12
         );
         return 1;
      } else if (var0 == 1133) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var30 = var3.method8158((short)16256);
         if (var30 != null) {
            var30.field4640 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -1863371523;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1134 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var29 = var3.method8158((short)16256);
         if (var29 != null) {
            var29.field4642 = -2050586211 * Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1135) {
         SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
         classOO var28 = var3.method8156(857165472);
         if (var28 != null) {
            var3.text2 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         }

         return 1;
      } else if (var0 == 1136) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var27 = var3.method8158((short)16256);
         if (var27 != null) {
            var27.field4641 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * -718628869;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1137 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var26 = var3.method8156(1615199576);
         if (null != var26 && var26.method8392(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], 61615480)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1138) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var25 = var3.method8156(151090188);
         if (var25 != null && var25.method8397(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1088391311)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1139) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var24 = var3.method8156(1553111470);
         if (null != var24 && var24.method8400(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -155888454)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1140 == var0) {
         boolean var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         client.widgetFocusInputManager.method6358(-1288580303);
         classOO var42 = var3.method8156(2022763336);
         if (null != var42 && var42.method8371(var23, 1485355144)) {
            if (var23) {
               client.widgetFocusInputManager.method6353(var3, (byte)63);
            }

            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1141 == var0) {
         boolean var22 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (!var22 && client.widgetFocusInputManager.method6348(-901260875) == var3) {
            client.widgetFocusInputManager.method6358(-733473994);
            class376.invalidateWidget(var3, (byte)5);
         }

         classOO var41 = var3.method8156(437056128);
         if (var41 != null) {
            var41.method8375(var22, -1224119806);
         }

         return 1;
      } else if (1142 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         classOO var21 = var3.method8156(675079355);
         if (null != var21
            && classOO.method8450(
               var21,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
               -660660681
            )) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1143 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var20 = var3.method8156(1717683169);
         if (null != var20
            && classOO.method8450(
               var20,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               -754110116
            )) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1144) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var19 = var3.method8156(716143681);
         if (null != var19) {
            classOO.method8582(var19, Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (byte)-107);
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1145) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var18 = var3.method8156(1846357291);
         if (var18 != null) {
            var18.method8575(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (short)193);
         }

         return 1;
      } else if (var0 == 1146) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var17 = var3.method8156(832804400);
         if (null != var17) {
            var17.method8414(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1677752388);
         }

         return 1;
      } else if (1147 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var16 = var3.method8156(242496736);
         if (null != var16) {
            var16.method8591(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789], 161841775);
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1148 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         class28 var15 = var3.method8162((byte)13);
         if (null != var15) {
            class28.method486(
               var15,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
               -1482579237
            );
         }

         return 1;
      } else if (var0 == 1149) {
         class408.Interpreter_intStackSize -= 708726074;
         class28 var14 = var3.method8162((byte)13);
         if (null != var14) {
            var14.method488(
               (char)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
               -371900800
            );
         }

         return 1;
      } else if (1150 == var0) {
         Widget.method8091(
            var3,
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            class164.urlRequester,
            581939179
         );
         return 1;
      } else if (var0 == 1151) {
         SecureRandomFuture.Interpreter_objectStackSize -= -1799073313;
         String var13 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var40 = (String)Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var6 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 2];
         long var7 = class6.getUserId(226342813);
         long var9 = class40.getUserHash(1962797798);
         String var11 = PlatformInfo.method11338(class282.getPlatformInfo(-680033570), class282.getPlatformInfo(1632319539).os * -208903543, 168937541);
         if (-1L != var7) {
            var13 = var13.replaceAll("%userid%", Long.toString(var7));
         }

         if (var9 != -1L) {
            var13 = var13.replaceAll("%userhash%", Long.toString(var9));
         }

         if (!var11.isEmpty()) {
            var13 = var13.replaceAll("%deviceid%", var11);
         }

         var3.method8085(var13, var40, var6, var11, Long.toString(var9), class164.urlRequester, (byte)-1);
         return 1;
      } else if (1152 == var0) {
         if (928687775 * var3.type != 11) {
            throw new RuntimeException();
         } else {
            class225 var12 = Widget.method8141(var3, 3426728);
            boolean var5 = null != var12
               && var12.method5297((byte)-41)
               && class234.method5950(WorldMapArea.method6908(639220907), var12.method5322((byte)-17), 1726539731);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5 ? 1 : 0;
            return 1;
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)I")
   @ObfuscatedName("fl")
   static int method1058(Widget var0) {
      if (11 != 928687775 * var0.type) {
         SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         return 1;
      } else {
         String var1 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var0.method8115(var1, -2133621926);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ea")
   static int method1029(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         var3 = class226.widgetDefinition.method7953(var4, 278913786);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (var0 == 1100) {
         class408.Interpreter_intStackSize -= 708726074;
         int var39 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var45 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         if (12 == 928687775 * var3.type) {
            classOO var46 = var3.method8156(1973497980);
            if (var46 != null && var46.method8401(var39, var45, -1874148747)) {
               class376.invalidateWidget(var3, (byte)5);
            }
         } else {
            var3.scrollX = var39 * -1597374639;
            if (1068149169 * var3.scrollX > -111672215 * var3.scrollWidth - -1946208531 * var3.width) {
               var3.scrollX = -1481704391 * var3.scrollWidth - -1014270979 * var3.width;
            }

            if (1068149169 * var3.scrollX < 0) {
               var3.scrollX = 0;
            }

            var3.scrollY = 1603227665 * var45;
            if (-497311503 * var3.scrollY > -1963554889 * var3.scrollHeight - -905446999 * var3.height) {
               var3.scrollY = -50253017 * var3.scrollHeight - 351495225 * var3.height;
            }

            if (-497311503 * var3.scrollY < 0) {
               var3.scrollY = 0;
            }

            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1101) {
         var3.color = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1365603885;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1102) {
         var3.fill = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1103 == var0) {
         var3.transparencyTop = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -167855443;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1104 == var0) {
         var3.lineWid = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -249010551;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1105) {
         var3.spriteId2 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 2092479471;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1106 == var0) {
         var3.spriteAngle = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -795510295;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1107 == var0) {
         var3.spriteTiling = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1108 == var0) {
         var3.modelType = -1570196439;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1109 == var0) {
         class408.Interpreter_intStackSize -= 2126178222;
         var3.modelOffsetX = -37619155 * Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         var3.modelOffsetY = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1] * -1048338377;
         var3.modelAngleX = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2] * -1977744073;
         var3.modelAngleY = 676548941 * Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
         var3.modelAngleZ = Interpreter_intStack[4 + 327716789 * class408.Interpreter_intStackSize] * 132153981;
         var3.modelZoom = 2012543961 * Interpreter_intStack[5 + class408.Interpreter_intStackSize * 327716789];
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1110 == var0) {
         int var38 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var3.sequenceId * -750054055 != var38) {
            var3.sequenceId = var38 * -12983575;
            var3.modelFrame = 0;
            var3.modelFrameCycle = 0;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1111 == var0) {
         var3.modelOrthog = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1112 == var0) {
         String var37 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         if (var3.type * 928687775 == 12) {
            classOO var44 = var3.method8156(622928034);
            if (null != var44 && var44.method8557((byte)-96)) {
               var44.method8378(var37, -1342138136);
            } else {
               var3.text = var37;
            }

            class376.invalidateWidget(var3, (byte)5);
         } else if (!var37.equals(var3.text)) {
            var3.text = var37;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1113) {
         var3.fontId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1824873669;
         if (12 == 928687775 * var3.type) {
            classOO var36 = var3.method8156(898796114);
            if (null != var36) {
               var36.method8416(-446044490);
            }
         }

         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1114 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         if (12 == 928687775 * var3.type) {
            classOO var35 = var3.method8156(390118636);
            if (var35 != null) {
               var35.method8405(
                  Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
                  Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1],
                  -1333304308
               );
               var35.method8412(Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789], 2108899215);
            }
         } else {
            var3.textXAlignment = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * -563011291;
            var3.textYAlignment = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize] * 1108485379;
            var3.textLineHeight = -1440610935 * Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         }

         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1115) {
         var3.textShadowed = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1116 == var0) {
         var3.outline = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 217033705;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1117 == var0) {
         var3.spriteShadow = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1846663581;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1118) {
         var3.spriteFlipV = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1119 == var0) {
         var3.spriteFlipH = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1120) {
         class408.Interpreter_intStackSize -= 708726074;
         var3.scrollWidth = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * 1897778137;
         var3.scrollHeight = 1821115911 * Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         class376.invalidateWidget(var3, (byte)5);
         if (0 == var3.type * 928687775) {
            Widget[] var34 = 2077538819 * var3.childIndex == -1
               ? class226.widgetDefinition.Widget_interfaceComponents[278777747 * var3.id >> 16]
               : class226.widgetDefinition.method7953(794900977 * var3.parentId, -1467858781).children;
            class339.revalidateWidgetScroll(var34, var3, false, -2422577);
         }

         return 1;
      } else if (var0 == 1121) {
         HealthBarDefinition.resumePauseWidget(278777747 * var3.id, 2077538819 * var3.childIndex, 1567440767);
         client.meslayerContinueWidget = var3;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1122 == var0) {
         var3.spriteId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -18433963;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1123) {
         var3.color2 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1017345247;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1124) {
         var3.transparencyBot = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 1009763901;
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (var0 == 1125) {
         int var33 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         FillMode var43 = (FillMode)GrandExchangeOffer.findEnumerated(class299.FillMode_values(-1976636498), var33, (byte)1);
         if (null != var43) {
            var3.fillMode = var43;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1126) {
         boolean var32 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         var3.field4526 = var32;
         return 1;
      } else if (var0 == 1127) {
         boolean var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         var3.modelTransparency = var31;
         return 1;
      } else if (var0 == 1129) {
         var3.field4540 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class376.invalidateWidget(var3, (byte)5);
         return 1;
      } else if (1130 == var0) {
         var3.method8080(
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            "",
            class164.urlRequester,
            class6.getUserId(-996266073)
         );
         return 1;
      } else if (1131 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         var3.method8099(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
            Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
            142139178
         );
         return 1;
      } else if (var0 == 1132) {
         var3.method8101(
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789],
            (byte)12
         );
         return 1;
      } else if (var0 == 1133) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var30 = var3.method8158((short)16256);
         if (var30 != null) {
            var30.field4640 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -1863371523;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1134 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var29 = var3.method8158((short)16256);
         if (var29 != null) {
            var29.field4642 = -2050586211 * Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1135) {
         SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
         classOO var28 = var3.method8156(2035274675);
         if (var28 != null) {
            var3.text2 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         }

         return 1;
      } else if (var0 == 1136) {
         class408.Interpreter_intStackSize -= -1793120611;
         class372 var27 = var3.method8158((short)16256);
         if (var27 != null) {
            var27.field4641 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * -718628869;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1137 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var26 = var3.method8156(1255002788);
         if (null != var26 && var26.method8392(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], 147345369)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1138) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var25 = var3.method8156(266829643);
         if (var25 != null && var25.method8397(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1088391311)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1139) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var24 = var3.method8156(703691255);
         if (null != var24 && var24.method8400(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], 1844629302)) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1140 == var0) {
         boolean var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         client.widgetFocusInputManager.method6358(1504252154);
         classOO var42 = var3.method8156(1832993507);
         if (null != var42 && var42.method8371(var23, 1485355144)) {
            if (var23) {
               client.widgetFocusInputManager.method6353(var3, (byte)81);
            }

            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1141 == var0) {
         boolean var22 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (!var22 && client.widgetFocusInputManager.method6348(-542849944) == var3) {
            client.widgetFocusInputManager.method6358(-185857518);
            class376.invalidateWidget(var3, (byte)5);
         }

         classOO var41 = var3.method8156(1280422972);
         if (var41 != null) {
            var41.method8375(var22, 818272869);
         }

         return 1;
      } else if (1142 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         classOO var21 = var3.method8156(1347691233);
         if (null != var21
            && classOO.method8450(
               var21,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
               -455739291
            )) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1143 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var20 = var3.method8156(865611874);
         if (null != var20
            && classOO.method8450(
               var20,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               702066665
            )) {
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1144) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var19 = var3.method8156(1155711855);
         if (null != var19) {
            classOO.method8582(var19, Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (byte)-127);
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1145) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var18 = var3.method8156(1285216343);
         if (var18 != null) {
            var18.method8575(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (short)193);
         }

         return 1;
      } else if (var0 == 1146) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var17 = var3.method8156(1159120546);
         if (null != var17) {
            var17.method8414(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1677752388);
         }

         return 1;
      } else if (1147 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         classOO var16 = var3.method8156(993076519);
         if (null != var16) {
            var16.method8591(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789], -970632277);
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (1148 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         class28 var15 = var3.method8162((byte)13);
         if (null != var15) {
            class28.method486(
               var15,
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
               -655972114
            );
         }

         return 1;
      } else if (var0 == 1149) {
         class408.Interpreter_intStackSize -= 708726074;
         class28 var14 = var3.method8162((byte)13);
         if (null != var14) {
            var14.method488(
               (char)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
               -371900800
            );
         }

         return 1;
      } else if (1150 == var0) {
         Widget.method8091(
            var3,
            (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
            class164.urlRequester,
            1433155078
         );
         return 1;
      } else if (var0 == 1151) {
         SecureRandomFuture.Interpreter_objectStackSize -= -1799073313;
         String var13 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var40 = (String)Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var6 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 2];
         long var7 = class6.getUserId(1435952764);
         long var9 = class40.getUserHash(2095308059);
         String var11 = PlatformInfo.method11338(class282.getPlatformInfo(1430161439), class282.getPlatformInfo(1536737319).os * -208903543, 168937541);
         if (-1L != var7) {
            var13 = var13.replaceAll("%userid%", Long.toString(var7));
         }

         if (var9 != -1L) {
            var13 = var13.replaceAll("%userhash%", Long.toString(var9));
         }

         if (!var11.isEmpty()) {
            var13 = var13.replaceAll("%deviceid%", var11);
         }

         var3.method8085(var13, var40, var6, var11, Long.toString(var9), class164.urlRequester, (byte)68);
         return 1;
      } else if (1152 == var0) {
         if (928687775 * var3.type != 11) {
            throw new RuntimeException();
         } else {
            class225 var12 = Widget.method8141(var3, 1109596937);
            boolean var5 = null != var12
               && var12.method5297((byte)5)
               && class234.method5950(WorldMapArea.method6908(1708918724), var12.method5322((byte)-13), 1822574034);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5 ? 1 : 0;
            return 1;
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gm")
   static int method1082(int var0, Script var1, boolean var2) {
      if (var0 == 3500) {
         int var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = IndexCheck.method6514(client.indexCheck, var5, (short)1337)
            ? 1
            : 0;
         return 1;
      } else if (3501 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.indexCheck.method6513(var4, 1828136296) ? 1 : 0;
         return 1;
      } else if (3502 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.indexCheck.method6517(var3, -448402994) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("eq")
   static int method1031(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= -1940501111) {
         var0 -= 1000;
         var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 2090707722);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      class376.invalidateWidget(var3, (byte)5);
      if (var0 == -2129410225 || var0 == 689130223 || 1212 == var0) {
         class408.Interpreter_intStackSize -= -337066618;
         int var10 = Interpreter_intStack[-1636612190 * class408.Interpreter_intStackSize];
         int var11 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         var3.itemId = -633853255 * var10;
         var3.itemQuantity = -1909037165 * var11;
         ItemComposition var6 = class150.ItemDefinition_get(var10, 282729353);
         var3.modelAngleX = 2004721148 * var6.xan2d;
         var3.modelAngleY = -849352749 * var6.yan2d;
         var3.modelAngleZ = 1714868007 * var6.zan2d;
         var3.modelOffsetX = var6.offsetX2d * 2127673313;
         var3.modelOffsetY = 1115751162 * var6.offsetY2d;
         var3.modelZoom = var6.zoom2d * -1119460626;
         if (var0 == 1205) {
            var3.itemQuantityMode = 0;
         } else if (var0 == -72597458 | 368203833 * var6.isStackable == 1) {
            var3.itemQuantityMode = 1927430291;
         } else {
            var3.itemQuantityMode = -440106714;
         }

         if (var3.field4546 * -742973567 > 0) {
            var3.modelZoom = 1874496800 * var3.modelZoom / (var3.field4546 * -765368540) * -921569551;
         } else if (var3.rawWidth * 1127299583 > 0) {
            var3.modelZoom = 1453083491 * var3.modelZoom / (1236984658 * var3.rawWidth) * 2012543961;
         }

         return 1;
      } else if (-728676058 == var0) {
         var3.modelType = 1303764854;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 231531579] * -1314816461;
         return 1;
      } else if (var0 == 1202) {
         var3.modelType = -415622021;
         var3.modelId = PlayerComposition.method7917(class330.localPlayer.appearance, (byte)0) * -1314816461;
         return 1;
      } else if (1207 == var0) {
         boolean var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -631990970) * 1948565462] == 1;
         var3.method8172(class330.localPlayer.appearance, var9, -1969276408);
         return 1;
      } else if (-1662961844 == var0) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 127224831) * 327716789];
         if (null == var3.field4497) {
            throw new RuntimeException("");
         } else {
            var3.field4497.method7936(var8, 799494478);
            return 1;
         }
      } else if (-1450609214 == var0) {
         class408.Interpreter_intStackSize -= -1967867703;
         int var7 = Interpreter_intStack[class408.Interpreter_intStackSize * -23749785];
         int var5 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         if (var3.field4497 == null) {
            throw new RuntimeException("");
         } else {
            PlayerComposition.method7931(var3.field4497, var7, var5, 1665628438);
            return 1;
         }
      } else if (var0 == 1210) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1085412470];
         if (null == var3.field4497) {
            throw new RuntimeException("");
         } else {
            var3.field4497.method7925(class330.localPlayer.appearance.gender * -610765444, var4, -1704793879);
            return 1;
         }
      } else if (var0 == 1862317670) {
         var3.modelType = 678132306;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= 195334414) * 327716789] * -1314816461;
         return 1;
      } else if (var0 == -469434005) {
         var3.modelType = 576976275;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("es")
   static int method1032(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1438242689);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      class376.invalidateWidget(var3, (byte)5);
      if (var0 == 1200 || var0 == 1205 || 1212 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var10 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var11 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         var3.itemId = 1664178957 * var10;
         var3.itemQuantity = -1909037165 * var11;
         ItemComposition var6 = class150.ItemDefinition_get(var10, -972639944);
         var3.modelAngleX = -1892318899 * var6.xan2d;
         var3.modelAngleY = 1357613173 * var6.yan2d;
         var3.modelAngleZ = 1714868007 * var6.zan2d;
         var3.modelOffsetX = var6.offsetX2d * 2127673313;
         var3.modelOffsetY = 1491904511 * var6.offsetY2d;
         var3.modelZoom = var6.zoom2d * -1257260919;
         if (var0 == 1205) {
            var3.itemQuantityMode = 0;
         } else if (var0 == 1212 | 1515235515 * var6.isStackable == 1) {
            var3.itemQuantityMode = 1927430291;
         } else {
            var3.itemQuantityMode = -440106714;
         }

         if (var3.field4546 * -209716257 > 0) {
            var3.modelZoom = 1874496800 * var3.modelZoom / (var3.field4546 * -209716257) * 2012543961;
         } else if (var3.rawWidth * 1127299583 > 0) {
            var3.modelZoom = 1874496800 * var3.modelZoom / (1127299583 * var3.rawWidth) * 2012543961;
         }

         return 1;
      } else if (1201 == var0) {
         var3.modelType = 1154574418;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         return 1;
      } else if (var0 == 1202) {
         var3.modelType = -415622021;
         var3.modelId = PlayerComposition.method7917(class330.localPlayer.appearance, (byte)0) * -1314816461;
         return 1;
      } else if (1207 == var0) {
         boolean var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         var3.method8172(class330.localPlayer.appearance, var9, -1601021776);
         return 1;
      } else if (1208 == var0) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (null == var3.field4497) {
            throw new RuntimeException("");
         } else {
            var3.field4497.method7936(var8, -675778847);
            return 1;
         }
      } else if (1209 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var7 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var5 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         if (var3.field4497 == null) {
            throw new RuntimeException("");
         } else {
            PlayerComposition.method7931(var3.field4497, var7, var5, 1665628438);
            return 1;
         }
      } else if (var0 == 1210) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (null == var3.field4497) {
            throw new RuntimeException("");
         } else {
            var3.field4497.method7925(class330.localPlayer.appearance.gender * -941255479, var4, -1704793879);
            return 1;
         }
      } else if (var0 == 1214) {
         var3.modelType = 323330376;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         return 1;
      } else if (var0 == 1215) {
         var3.modelType = -1246866063;
         var3.modelId = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("er")
   static int method1034(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1153784514);
         var3 = false;
      } else {
         var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (var0 == 1300) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var17 >= 0 && var17 < 32) {
            var4.setAction(var17, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], 1081326677);
            return 1;
         } else {
            SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
            return 1;
         }
      } else if (var0 == 1301) {
         class408.Interpreter_intStackSize -= 708726074;
         int var16 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var22 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         var4.parent = class226.widgetDefinition.getWidgetChild(var16, var22, -1856875983);
         return 1;
      } else if (1302 == var0) {
         var4.isScrollBar = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else if (1303 == var0) {
         var4.dragZoneSize = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 709401353;
         return 1;
      } else if (1304 == var0) {
         var4.dragThreshold = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 2011961339;
         return 1;
      } else if (1305 == var0) {
         var4.dataText = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         return 1;
      } else if (1306 == var0) {
         var4.spellActionName = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         return 1;
      } else if (var0 == 1307) {
         var4.actions = null;
         var4.field4536 = (String[][])null;
         return 1;
      } else if (var0 == 1308) {
         var4.prioritizeMenuEntry = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else if (var0 == 1309) {
         class408.Interpreter_intStackSize -= -1793120611;
         return 1;
      } else if (1310 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var15 >= 0 && var15 <= 9 && var4.field4536 != null) {
            var4.field4536[var15] = null;
            return 1;
         } else {
            return 1;
         }
      } else if (var0 == 1311) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         int var21 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var21 >= 0 && var21 <= 9 && var14 >= 0) {
            var4.method8056(
               var21, var14, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], 853445400
            );
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 1312) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (-1 == var13) {
            var4.targetPriority = 1300706076;
         } else if (var13 >= 1 && var13 <= 32) {
            var4.targetPriority = 1398918343 * (var13 - 1);
         }

         return 1;
      } else if (var0 != 1350) {
         if (1351 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            byte var12 = 10;
            byte[] var20 = new byte[]{(byte)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]};
            byte[] var27 = new byte[]{(byte)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]};
            MouseHandler.Widget_setKey(var4, var12, var20, var27, (short)512);
            return 1;
         } else if (var0 == 1352) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var11 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] - 1;
            int var19 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            int var26 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
            if (var11 >= 0 && var11 <= 9) {
               class161.Widget_setKeyRate(var4, var11, var19, var26, 243334557);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 1353) {
            byte var10 = 10;
            int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            class161.Widget_setKeyRate(var4, var10, var18, var25, 1713644081);
            return 1;
         } else if (var0 == 1354) {
            class408.Interpreter_intStackSize -= -1793120611;
            int var9 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] - 1;
            if (var9 >= 0 && var9 <= 9) {
               class379.Widget_setKeyIgnoreHeld(var4, var9, (short)17329);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (1355 == var0) {
            byte var8 = 10;
            class379.Widget_setKeyIgnoreHeld(var4, var8, (short)22416);
            return 1;
         } else {
            return 2;
         }
      } else {
         byte[] var5 = null;
         byte[] var6 = null;
         if (var3) {
            class408.Interpreter_intStackSize -= -751336926;
            byte var7 = 0;

            while (var7 < 10 && Interpreter_intStack[var7 + 327716789 * class408.Interpreter_intStackSize] >= 0) {
               var7 += 2;
            }

            if (var7 > 0) {
               var5 = new byte[var7 / 2];
               var6 = new byte[var7 / 2];

               for (int var23 = var7 - 2; var23 >= 0; var23 -= 2) {
                  var5[var23 / 2] = (byte)Interpreter_intStack[var23 + class408.Interpreter_intStackSize * 327716789];
                  var6[var23 / 2] = (byte)Interpreter_intStack[1 + var23 + class408.Interpreter_intStackSize * 327716789];
               }
            }
         } else {
            class408.Interpreter_intStackSize -= 708726074;
            var5 = new byte[]{(byte)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789]};
            var6 = new byte[]{(byte)Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]};
         }

         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var24 >= 0 && var24 <= 9) {
            MouseHandler.Widget_setKey(var4, var24, var5, var6, (short)512);
            return 1;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("dc")
   static int method1007(int var0, Script var1, boolean var2) {
      if (var0 < 1000) {
         return classFR.method4049(var0, var1, var2, -491456607);
      } else if (var0 < 1100) {
         return class329.method7394(var0, var1, var2, 1843627409);
      } else if (var0 < 1200) {
         return classWA.method11669(var0, var1, var2, (byte)107);
      } else if (var0 < 1300) {
         return Varcs.method3164(var0, var1, var2, 327716789);
      } else if (var0 < 1400) {
         return class343.method7618(var0, var1, var2, 683324100);
      } else if (var0 < 1500) {
         return LoginPacket.method4152(var0, var1, var2, -364498099);
      } else if (var0 < 1600) {
         return EnumComposition.method4472(var0, var1, var2, (byte)-6);
      } else if (var0 < 1700) {
         return classPO.method8779(var0, var1, var2, 1178427936);
      } else if (var0 < 1800) {
         return HttpResponse.method144(var0, var1, var2, 265308504);
      } else if (var0 < 1900) {
         return Language.method8871(var0, var1, var2, -1518041768);
      } else if (var0 < 2000) {
         return class39.method650(var0, var1, var2, -1622367182);
      } else if (var0 < 2100) {
         return class329.method7394(var0, var1, var2, 1724714654);
      } else if (var0 < 2200) {
         return classWA.method11669(var0, var1, var2, (byte)40);
      } else if (var0 < 2300) {
         return Varcs.method3164(var0, var1, var2, 327716789);
      } else if (var0 < 2400) {
         return class343.method7618(var0, var1, var2, -1610468869);
      } else if (var0 < 2500) {
         return LoginPacket.method4152(var0, var1, var2, -364498099);
      } else if (var0 < 2600) {
         return ScriptFrame.method1175(var0, var1, var2, (byte)0);
      } else if (var0 < 2700) {
         return class161.method4257(var0, var1, var2, 1996817898);
      } else if (var0 < 2800) {
         return class165.method4410(var0, var1, var2, -1108060204);
      } else if (var0 < 2900) {
         return class180.method4265(var0, var1, var2, -1585610818);
      } else if (var0 < 3000) {
         return class39.method650(var0, var1, var2, -1622367182);
      } else if (var0 < 3200) {
         return class431.method9225(var0, var1, var2, 1660847899);
      } else if (var0 < 3300) {
         return GameObject.method6302(var0, var1, var2, -390077306);
      } else if (var0 < 3400) {
         return class101.method3398(var0, var1, var2, 1784071966);
      } else if (var0 < 3500) {
         return class379.method7978(var0, var1, var2, -1813085635);
      } else if (var0 < 3600) {
         return RestClientThreadFactory.method5(var0, var1, var2, -616650646);
      } else if (var0 < 3700) {
         return Buddy.method10788(var0, var1, var2, (byte)54);
      } else if (var0 < 3800) {
         return class138.method3982(var0, var1, var2, -1778996082);
      } else if (var0 < 3900) {
         return FillMode.method12277(var0, var1, var2, 1893716028);
      } else if (var0 < 4000) {
         return AbstractByteArrayCopier.method7836(var0, var1, var2, (byte)-113);
      } else if (var0 < 4100) {
         return VerticalAlignment.method4596(var0, var1, var2, 937508360);
      } else if (var0 < 4200) {
         return Huffman.method8654(var0, var1, var2, (byte)1);
      } else if (var0 < 4300) {
         return classFO.method4034(var0, var1, var2, -125656445);
      } else if (var0 < 5100) {
         return ScriptFrame.method1176(var0, var1, var2, (byte)-118);
      } else if (var0 < 5400) {
         return FloorOverlayDefinition.method5358(var0, var1, var2, 1531289547);
      } else if (var0 < 5600) {
         return class1.method253(var0, var1, var2, 86323816);
      } else if (var0 < 5700) {
         return class50.method1291(var0, var1, var2, -343906879);
      } else if (var0 < 6300) {
         return classNV.method7855(var0, var1, var2, -222241638);
      } else if (var0 < 6600) {
         return HealthBarUpdate.method1488(var0, var1, var2, (byte)77);
      } else if (var0 < 6700) {
         return class291.method7263(var0, var1, var2, -663064865);
      } else if (var0 < 6800) {
         return classGN.method4251(var0, var1, var2, (byte)-119);
      } else if (var0 < 6900) {
         return HealthBarConfig.method3566(var0, var1, var2, (byte)-1);
      } else if (var0 < 7000) {
         return AsyncRestClient.method246(var0, var1, var2, -1456359715);
      } else if (var0 < 7100) {
         return class545.method11165(var0, var1, var2, -1551357981);
      } else if (var0 < 7200) {
         return UserComparator6.method4045(var0, var1, var2, -1790511714);
      } else if (var0 < 7500) {
         return WorldEntityConfig.method4786(var0, var1, var2, (byte)6);
      } else if (var0 < 7600) {
         return ObjectSound.method2737(var0, var1, var2, 1981105297);
      } else if (var0 < 7700) {
         return ArchiveDiskActionHandler.method8887(var0, var1, var2, -498278968);
      } else if (var0 < 8000) {
         return classNJ.method7792(var0, var1, var2, (byte)-24);
      } else if (var0 < 8100) {
         return class101.method3399(var0, var1, var2, (byte)-120);
      } else {
         return var0 >= 13000 && var0 < 14000 ? class209.method4887(var0, var1, var2, (byte)41) : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ef")
   static int method1035(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= -967246127) {
         var0 -= 1000;
         var4 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1224249475], -1799910958);
         var3 = false;
      } else {
         var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (var0 == -672824802) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -2105445799) * 327716789] - 1;
         if (var17 >= 0 && var17 < 32) {
            var4.setAction(var17, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1195078379], -2114474333);
            return 1;
         } else {
            SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
            return 1;
         }
      } else if (var0 == 1301) {
         class408.Interpreter_intStackSize -= 2036756844;
         int var16 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var22 = Interpreter_intStack[class408.Interpreter_intStackSize * 36365354 + 1];
         var4.parent = class226.widgetDefinition.getWidgetChild(var16, var22, -1706509095);
         return 1;
      } else if (563033655 == var0) {
         var4.isScrollBar = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else if (1303 == var0) {
         var4.dragZoneSize = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1945257577] * 713201281;
         return 1;
      } else if (1304 == var0) {
         var4.dragThreshold = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1595479827) * 327716789] * -2071683685;
         return 1;
      } else if (-1760580694 == var0) {
         var4.dataText = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -2082899688];
         return 1;
      } else if (1306 == var0) {
         var4.spellActionName = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         return 1;
      } else if (var0 == 893157378) {
         var4.actions = null;
         var4.field4536 = (String[][])null;
         return 1;
      } else if (var0 == 1308) {
         var4.prioritizeMenuEntry = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else if (var0 == 2092271475) {
         class408.Interpreter_intStackSize -= -799528591;
         return 1;
      } else if (1310 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1944601777) * 1681996506] - 1;
         if (var15 >= 0 && var15 <= 9 && var4.field4536 != null) {
            var4.field4536[var15] = null;
            return 1;
         } else {
            return 1;
         }
      } else if (var0 == 1311) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 376988577) * 327716789] - 1;
         int var21 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var21 >= 0 && var21 <= 9 && var14 >= 0) {
            var4.method8056(
               var21, var14, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1120101959) * -1589929854], 1715568345
            );
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 1338923071) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1080035184) * 327716789];
         if (-1 == var13) {
            var4.targetPriority = 1300706076;
         } else if (var13 >= 1 && var13 <= 1027290160) {
            var4.targetPriority = 1398918343 * (var13 - 1);
         }

         return 1;
      } else if (var0 != 1350) {
         if (1756647103 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            byte var12 = 10;
            byte[] var20 = new byte[]{(byte)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]};
            byte[] var27 = new byte[]{(byte)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]};
            MouseHandler.Widget_setKey(var4, var12, var20, var27, (short)512);
            return 1;
         } else if (var0 == 1352) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var11 = Interpreter_intStack[-638705729 * class408.Interpreter_intStackSize] - 1;
            int var19 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            int var26 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
            if (var11 >= 0 && var11 <= 9) {
               class161.Widget_setKeyRate(var4, var11, var19, var26, 1851263896);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 1353) {
            byte var10 = 10;
            int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1981904765) * -1485557848];
            int var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -232619793) * 327716789];
            class161.Widget_setKeyRate(var4, var10, var18, var25, 1560992770);
            return 1;
         } else if (var0 == -143042797) {
            class408.Interpreter_intStackSize -= -1771664545;
            int var9 = Interpreter_intStack[class408.Interpreter_intStackSize * -1891754045] - 1;
            if (var9 >= 0 && var9 <= 9) {
               class379.Widget_setKeyIgnoreHeld(var4, var9, (short)10993);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (1355 == var0) {
            byte var8 = 10;
            class379.Widget_setKeyIgnoreHeld(var4, var8, (short)17069);
            return 1;
         } else {
            return 2;
         }
      } else {
         byte[] var5 = null;
         byte[] var6 = null;
         if (var3) {
            class408.Interpreter_intStackSize -= -751336926;
            byte var7 = 0;

            while (var7 < 10 && Interpreter_intStack[var7 + 327716789 * class408.Interpreter_intStackSize] >= 0) {
               var7 += 2;
            }

            if (var7 > 0) {
               var5 = new byte[var7 / 2];
               var6 = new byte[var7 / 2];

               for (int var23 = var7 - 2; var23 >= 0; var23 -= 2) {
                  var5[var23 / 2] = (byte)Interpreter_intStack[var23 + class408.Interpreter_intStackSize * -1475687729];
                  var6[var23 / 2] = (byte)Interpreter_intStack[1 + var23 + class408.Interpreter_intStackSize * 137144873];
               }
            }
         } else {
            class408.Interpreter_intStackSize -= 708726074;
            var5 = new byte[]{(byte)Interpreter_intStack[class408.Interpreter_intStackSize * -1876508040]};
            var6 = new byte[]{(byte)Interpreter_intStack[1 + 1222903850 * class408.Interpreter_intStackSize]};
         }

         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] - 1;
         if (var24 >= 0 && var24 <= 9) {
            MouseHandler.Widget_setKey(var4, var24, var5, var6, (short)512);
            return 1;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("jx")
   static void method1161(Widget var0) {
      var0.method8152(-2111760762);
      var0.method8156(1715171609).method8528(new class85(var0), (byte)-41);
      classOO.method8526(var0.method8156(1640940219), new classDH(var0), 375708117);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I[B[B)V")
   @ObfuscatedName("ew")
   static final void method1036(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field4557) {
         if (null == var2) {
            return;
         }

         var0.field4557 = new byte[11][];
         var0.field4452 = new byte[11][];
         var0.field4560 = new int[11];
         var0.field4561 = new int[11];
      }

      var0.field4557[var1] = var2;
      if (null != var2) {
         var0.field4460 = true;
      } else {
         var0.field4460 = false;

         for (int var4 = 0; var4 < var0.field4557.length; var4++) {
            if (var0.field4557[var4] != null) {
               var0.field4460 = true;
               break;
            }
         }
      }

      var0.field4452[var1] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I[B[B)V")
   @ObfuscatedName("em")
   static final void method1037(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field4557) {
         if (null == var2) {
            return;
         }

         var0.field4557 = new byte[11][];
         var0.field4452 = new byte[11][];
         var0.field4560 = new int[11];
         var0.field4561 = new int[11];
      }

      var0.field4557[var1] = var2;
      if (null != var2) {
         var0.field4460 = true;
      } else {
         var0.field4460 = false;

         for (int var4 = 0; var4 < var0.field4557.length; var4++) {
            if (var0.field4557[var4] != null) {
               var0.field4460 = true;
               break;
            }
         }
      }

      var0.field4452[var1] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I[B[B)V")
   @ObfuscatedName("eg")
   static final void method1038(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field4557) {
         if (null == var2) {
            return;
         }

         var0.field4557 = new byte[11][];
         var0.field4452 = new byte[11][];
         var0.field4560 = new int[11];
         var0.field4561 = new int[11];
      }

      var0.field4557[var1] = var2;
      if (null != var2) {
         var0.field4460 = true;
      } else {
         var0.field4460 = false;

         for (int var4 = 0; var4 < var0.field4557.length; var4++) {
            if (var0.field4557[var4] != null) {
               var0.field4460 = true;
               break;
            }
         }
      }

      var0.field4452[var1] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Lof;)V")
   @ObfuscatedName("jf")
   static void method1165(Widget var0, Widget var1) {
      if (var0.type * 928687775 == 0) {
         for (int var2 = var0.field4453 * -1516264759; var2 <= -86298045 * var0.field4454; var2++) {
            Widget var3 = var1.children[var2];
            if (var3 != null && var0.childIndex * -2008015591 == var3.field4451 * -729022171) {
               ClickAction.method11249(var3, var1, (short)13315);
            }
         }
      }

      var1.children[2077538819 * var0.childIndex] = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I)V")
   @ObfuscatedName("ep")
   static final void method1041(Widget var0, int var1) {
      if (null == var0.field4557) {
         throw new RuntimeException();
      } else {
         if (var0.field4595 == null) {
            var0.field4595 = new int[var0.field4557.length];
         }

         var0.field4595[var1] = Integer.MAX_VALUE;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ey")
   static int method1046(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1500) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.x * -814361553;
         return 1;
      } else if (var0 == 1501) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.y * -286860451;
         return 1;
      } else if (1502 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1946208531 * var3.width;
         return 1;
      } else if (var0 == 1503) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -905446999 * var3.height;
         return 1;
      } else if (1504 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (1505 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.parentId * 794900977;
         return 1;
      } else if (var0 != 1506) {
         return 2;
      } else {
         int var4 = 794900977 * var3.parentId;
         if (var4 == -1) {
            for (InterfaceParent var5 = (InterfaceParent)client.interfaceParents.first(); var5 != null; var5 = (InterfaceParent)client.interfaceParents.next()) {
               if (278777747 * var3.id >> 16 == -1385287145 * var5.group) {
                  var4 = (int)var5.key;
                  break;
               }
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ex")
   static int method1043(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 469952972) {
         var0 -= 1000;
         var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= 1910023139) * 327716789], 1422894071);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      String var4 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
      int[] var5 = null;
      if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == -1401775576) {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 2081190220];
         if (var6 > 0) {
            var5 = new int[var6];

            while (var6-- > 0) {
               var5[var6] = Interpreter_intStack[(class408.Interpreter_intStackSize -= 845259787) * 17030324];
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      for (int var7 = var9.length - 1; var7 >= 1; var7--) {
         switch (var4.charAt(var7 - 1)) {
            case 'W':
            case 'X':
            case 's':
               var9[var7] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1504942758) * -1433244523];
               break;
            default:
               var9[var7] = new Integer(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1441502621) * 103587434]);
         }
      }

      int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1198116618];
      if (var10 != -1) {
         var9[0] = new Integer(var10);
      } else {
         var9 = null;
      }

      if (1481461940 == var0) {
         var3.onDialogAbort = var9;
      } else if (var0 == 1401) {
         var3.onResize = var9;
      } else if (570784106 == var0) {
         var3.field4569 = var9;
      } else if (-216914439 == var0) {
         var3.field4547 = var9;
      } else if (var0 == -1772850251) {
         var3.onMiscTransmit = var9;
      } else if (var0 == 1405) {
         var3.onOp = var9;
      } else if (var0 == 1406) {
         var3.onMouseOver = var9;
      } else if (1833530064 == var0) {
         var3.onLoad = var9;
         var3.varTransmitTriggers = var5;
      } else if (var0 == 1408) {
         var3.onTargetEnter = var9;
      } else if (1409 == var0) {
         var3.onClickRepeat = var9;
      } else if (1410 == var0) {
         var3.field4575 = var9;
      } else if (var0 == 90979496) {
         var3.onMouseRepeat = var9;
      } else if (-606676044 == var0) {
         var3.onRelease = var9;
      } else if (1414 == var0) {
         var3.onStatTransmit = var9;
         var3.invTransmitTriggers = var5;
      } else if (1415 == var0) {
         var3.onScroll = var9;
         var3.statTransmitTriggers = var5;
      } else if (var0 == 1416) {
         var3.onChatTransmit = var9;
      } else if (var0 == -1231252800) {
         var3.onVarTransmit = var9;
      } else if (-1880677847 == var0) {
         var3.onInvTransmit = var9;
      } else if (var0 == -702803305) {
         var3.onDrag = var9;
      } else if (var0 == 2140786110) {
         var3.onKey = var9;
      } else if (var0 == 1716768272) {
         var3.field4567 = var9;
      } else if (1562672098 == var0) {
         var3.onHold = var9;
      } else if (var0 == -282061206) {
         var3.field4587 = var9;
      } else if (var0 == 77361080) {
         var3.field4541 = var9;
      } else if (-1540330026 == var0) {
         var3.onSubChange = var9;
      } else if (var0 == 1426) {
         var3.onDragComplete = var9;
      } else if (-1029417438 == var0) {
         var3.onTargetLeave = var9;
      } else if (767243029 == var0) {
         var3.onStockTransmit = var9;
      } else if (var0 == 1429) {
         var3.onMouseLeave = var9;
      } else if (var0 == 1430) {
         var3.onFriendTransmit = var9;
      } else if (1431 == var0) {
         var3.onClick = var9;
      } else if (1434 == var0) {
         var3.onTimer = var9;
      } else if (1435 == var0) {
         var3.onClanTransmit = var9;
      } else {
         if (var0 < 1934272642 || var0 > -259825179) {
            return 2;
         }

         class376 var8 = var3.method8164((byte)-92);
         if (null != var8) {
            if (871872451 == var0) {
               var8.field4682 = var9;
            } else if (var0 == 368058592) {
               var8.field4683 = var9;
            } else if (var0 == 1116129134) {
               var8.field4684 = var9;
            } else if (var0 == -1694577251) {
               var8.field4685 = var9;
            }
         }
      }

      var3.hasListener = true;
      return 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)V")
   @ObfuscatedName("cq")
   public static void method996(ScriptEvent var0) {
      LoginType.runScript(var0, -1048818965, -1970946224, (byte)-78);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;IZLcu;)V")
   @ObfuscatedName("dt")
   static void method1010(Widget var0, int var1, boolean var2, Script var3) {
      if (var0.children == null) {
         var0.children = new Widget[var1 + 1];
      }

      if (var0.children.length <= var1) {
         Widget[] var4 = new Widget[1 + var1];
         System.arraycopy(var0.children, 0, var4, 0, var0.children.length);
         var0.children = var4;
      } else {
         Widget var5 = var0.children[var1];
         if (var5 != null) {
            if (var2) {
               throw new RuntimeException("");
            }

            ClickAction.method11249(var5, var0, (short)9203);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gb")
   static int method1094(int var0, Script var1, boolean var2) {
      if (4000 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * -1530416239];
         int var57 = Interpreter_intStack[-355008838 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var57 + var35;
         return 1;
      } else if (-258704411 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var34 = Interpreter_intStack[1410100206 * class408.Interpreter_intStackSize];
         int var56 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1430740967) * -1121228475 - 1] = var34 - var56;
         return 1;
      } else if (var0 == 4002) {
         class408.Interpreter_intStackSize -= 938920434;
         int var33 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var55 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 538601135 - 1] = var55 * var33;
         return 1;
      } else if (var0 == -281200545) {
         class408.Interpreter_intStackSize -= 708726074;
         int var32 = Interpreter_intStack[class408.Interpreter_intStackSize * 357305747];
         int var54 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1352715594 - 1] = var32 / var54;
         return 1;
      } else if (var0 == 4004) {
         int var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 21710769];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1763089308) * 327716789 - 1] = (int)(Math.random() * var31);
         return 1;
      } else if (4005 == var0) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1618617888) * 505313113];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1117962410) * 514970165 - 1] = (int)(Math.random() * (1 + var30));
         return 1;
      } else if (var0 == -545364371) {
         class408.Interpreter_intStackSize -= 1932580349;
         int var29 = Interpreter_intStack[class408.Interpreter_intStackSize * 1750222080];
         int var53 = Interpreter_intStack[1 + -1443756702 * class408.Interpreter_intStackSize];
         int var63 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         int var65 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 3];
         int var67 = Interpreter_intStack[4 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1230993647 - 1] = (var53 - var29) * (var67 - var63) / (var65 - var63)
            + var29;
         return 1;
      } else if (var0 == 4007) {
         class408.Interpreter_intStackSize -= 708726074;
         int var28 = Interpreter_intStack[class408.Interpreter_intStackSize * 1189921269];
         int var52 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1093447202) * 327716789 - 1] = var52 * var28 / -2073407228 + var28;
         return 1;
      } else if (4008 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var27 = Interpreter_intStack[class408.Interpreter_intStackSize * -1811431872];
         int var51 = Interpreter_intStack[585690918 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1372356091 - 1] = var27 | 1 << var51;
         return 1;
      } else if (561197736 == var0) {
         class408.Interpreter_intStackSize -= -1135173246;
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var50 = Interpreter_intStack[class408.Interpreter_intStackSize * -506666754 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var26 & -1 - (1 << var50);
         return 1;
      } else if (4010 == var0) {
         class408.Interpreter_intStackSize -= 1185987532;
         int var25 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var49 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 6272909];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (var25 & 1 << var49) != 0 ? 1 : 0;
         return 1;
      } else if (var0 == 4011) {
         class408.Interpreter_intStackSize -= 1189961946;
         int var24 = Interpreter_intStack[-1067457744 * class408.Interpreter_intStackSize];
         int var48 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -696525876];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1733734885) * 327716789 - 1] = var24 % var48;
         return 1;
      } else if (var0 == -1734737803) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var47 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         if (var23 == 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 603779109 - 1] = (int)Math.pow(var23, var47);
         }

         return 1;
      } else if (340205793 == var0) {
         class408.Interpreter_intStackSize -= -996040526;
         int var22 = Interpreter_intStack[-2112645636 * class408.Interpreter_intStackSize];
         int var46 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         if (var22 == 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            switch (var46) {
               case 0:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 1875387996) * 327716789 - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var22;
                  break;
               case 2:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -2027595280) * -1872466050 - 1] = (int)Math.sqrt(var22);
                  break;
               case 3:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.cbrt(var22);
                  break;
               case 4:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 984900970) * -1262330475 - 1] = (int)Math.sqrt(Math.sqrt(var22));
                  break;
               default:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1534468079 - 1] = (int)Math.pow(var22, 1.0 / var46);
            }

            return 1;
         }
      } else if (4014 == var0) {
         class408.Interpreter_intStackSize -= 1810721602;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1452499859) * 327716789 - 1] = var21 & var45;
         return 1;
      } else if (4015 == var0) {
         class408.Interpreter_intStackSize -= 1049649850;
         int var20 = Interpreter_intStack[894780096 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 324665350) * 327716789 - 1] = var20 | var44;
         return 1;
      } else if (-17739371 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var19 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[1307550220 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 868086203) * 327716789 - 1] = var19 < var43 ? var19 : var43;
         return 1;
      } else if (-556468706 == var0) {
         class408.Interpreter_intStackSize -= 1584623887;
         int var18 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var42 = Interpreter_intStack[class408.Interpreter_intStackSize * -1921622728 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1607235177) * 327716789 - 1] = var18 > var42 ? var18 : var42;
         return 1;
      } else if (var0 == 183177189) {
         class408.Interpreter_intStackSize -= -1084394537;
         long var17 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         long var62 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         long var66 = Interpreter_intStack[591614126 * class408.Interpreter_intStackSize + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 711309578) * 327716789 - 1] = (int)(var17 * var66 / var62);
         return 1;
      } else if (var0 == 4025) {
         int var16 = ServerPacket.method7545(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)36);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var16;
         return 1;
      } else if (1806638484 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var41 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -1246765393];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 48895191 - 1] = var15 ^ 1 << var41;
         return 1;
      } else if (4027 == var0) {
         class408.Interpreter_intStackSize -= -2087969440;
         int var14 = Interpreter_intStack[class408.Interpreter_intStackSize * -1660940932];
         int var40 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 535702097];
         int var61 = Interpreter_intStack[-916512805 * class408.Interpreter_intStackSize + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1104880156) * -1799523200 - 1] = class309.method7191(var14, var40, var61, (short)-31397);
         return 1;
      } else if (4028 == var0) {
         class408.Interpreter_intStackSize -= 1333744136;
         int var13 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var39 = Interpreter_intStack[class408.Interpreter_intStackSize * 1903430413 + 1];
         int var60 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1744577811) * 327716789 - 1] = FloatProjection.method6012(var13, var39, var60, 2132504742);
         return 1;
      } else if (var0 == 4029) {
         class408.Interpreter_intStackSize -= -1860861893;
         int var12 = Interpreter_intStack[class408.Interpreter_intStackSize * 538608384];
         int var38 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -1883670205];
         int var59 = Interpreter_intStack[2 + -1794863584 * class408.Interpreter_intStackSize];
         int var64 = -962410232 - var59;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -921103687) * 98536334 - 1] = var12 << var64 >>> var38 + var64;
         return 1;
      } else if (4030 == var0) {
         class408.Interpreter_intStackSize -= -1620105335;
         int var10 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var37 = Interpreter_intStack[1255239439 * class408.Interpreter_intStackSize + 1];
         int var58 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         int var6 = Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
         var10 = FloatProjection.method6012(var10, var58, var6, 1745153584);
         int var7 = SpotAnimationDefinition.method4605(1 + (var6 - var58), 1092228468);
         if (var37 > var7) {
            var37 = var7;
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var10 | var37 << var58;
         return 1;
      } else if (var0 == 853937502) {
         Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = class137.method4002(
            Interpreter_intStack[-2142381565 * class408.Interpreter_intStackSize - 1], -1972811201
         );
         return 1;
      } else if (var0 == 4033) {
         Interpreter_intStack[1230333186 * class408.Interpreter_intStackSize - 1] = class33.method657(
            Interpreter_intStack[496758858 * class408.Interpreter_intStackSize - 1], 2137907891
         );
         return 1;
      } else if (4034 == var0) {
         class408.Interpreter_intStackSize -= 998590549;
         int var9 = Interpreter_intStack[2083038907 * class408.Interpreter_intStackSize];
         int var36 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var5 = class394.method8799(var9, var36, 1225139487);
         Interpreter_intStack[(class408.Interpreter_intStackSize += 221672242) * 327716789 - 1] = var5;
         return 1;
      } else if (4035 == var0) {
         Interpreter_intStack[1604530473 * class408.Interpreter_intStackSize - 1] = Math.abs(
            Interpreter_intStack[1504747970 * class408.Interpreter_intStackSize - 1]
         );
         return 1;
      } else if (4036 == var0) {
         String var3 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 2111797622) * -650663455];
         int var4 = -1;
         if (ViewportMouse.isNumber(var3, -1336342672)) {
            var4 = Message.method1204(var3, (byte)-82);
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1360953352) * 327716789 - 1] = var4;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ev")
   static int method1047(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1500) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.x * -814361553;
         return 1;
      } else if (var0 == 1501) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.y * -286860451;
         return 1;
      } else if (1502 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1946208531 * var3.width;
         return 1;
      } else if (var0 == 1503) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -905446999 * var3.height;
         return 1;
      } else if (1504 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (1505 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.parentId * 794900977;
         return 1;
      } else if (var0 != 1506) {
         return 2;
      } else {
         int var4 = 794900977 * var3.parentId;
         if (var4 == -1) {
            for (InterfaceParent var5 = (InterfaceParent)client.interfaceParents.first(); var5 != null; var5 = (InterfaceParent)client.interfaceParents.next()) {
               if (278777747 * var3.id >> 16 == -1385287145 * var5.group) {
                  var4 = (int)var5.key;
                  break;
               }
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ez")
   static int method1048(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1500) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.x * -814361553;
         return 1;
      } else if (var0 == 1501) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.y * -286860451;
         return 1;
      } else if (1502 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1946208531 * var3.width;
         return 1;
      } else if (var0 == 1503) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -905446999 * var3.height;
         return 1;
      } else if (1504 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (1505 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.parentId * 794900977;
         return 1;
      } else if (var0 != 1506) {
         return 2;
      } else {
         int var4 = 794900977 * var3.parentId;
         if (var4 == -1) {
            for (InterfaceParent var5 = (InterfaceParent)client.interfaceParents.first(); var5 != null; var5 = (InterfaceParent)client.interfaceParents.next()) {
               if (278777747 * var3.id >> 16 == -1385287145 * var5.group) {
                  var4 = (int)var5.key;
                  break;
               }
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("eh")
   static int method1050(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == -1541502182) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1954987135 - 1] = 1225117931 * var3.scrollX;
         return 1;
      } else if (1601 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1169578625) * 327716789 - 1] = var3.scrollY * -1600220820;
         return 1;
      } else if (1602 == var0) {
         if (var3.type * 1430175727 == 12) {
            classOO var24 = var3.method8156(2020479401);
            if (null != var24) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1561328412) * -1595015587 - 1] = classSF.method10131(
                  classOO.method8531(var24, -414435955), (byte)-99
               );
               return 1;
            }
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.text;
         return 1;
      } else if (477310277 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.scrollWidth * -111672215;
         return 1;
      } else if (var0 == 1604) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1728885625 * var3.scrollHeight;
         return 1;
      } else if (-399687255 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1417816983 * var3.modelZoom;
         return 1;
      } else if (var0 == 1606) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.modelAngleX * 751747207;
         return 1;
      } else if (1607 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1464305238) * 877530608 - 1] = -1778547621 * var3.modelAngleZ;
         return 1;
      } else if (var0 == 1608) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1677788790) * 327716789 - 1] = -804795946 * var3.modelAngleY;
         return 1;
      } else if (var0 == 1754650765) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.transparencyTop * -2090288859;
         return 1;
      } else if (var0 == 1610) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -137891779) * -413996891 - 1] = -185564907 * var3.transparencyBot;
         return 1;
      } else if (928210996 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -320537036) * 327716789 - 1] = var3.color * -1201217584;
         return 1;
      } else if (var0 == 671983347) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1342871824) * 327716789 - 1] = var3.color2 * -1402291999;
         return 1;
      } else if (var0 == -1250811772) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 776287297) * -1231561806 - 1] = var3.fillMode.rsOrdinal((byte)45);
         return 1;
      } else if (var0 == 1614) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         if (var0 == 1682099174) {
            class372 var4 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1965538528 - 1] = null != var4 ? var4.field4640 * -936277931 : 0;
         }

         if (var0 == 1653824403) {
            class372 var23 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var23 ? var23.field4642 * 527385781 : 0;
            return 1;
         } else if (var0 == 1619) {
            classOO var22 = var3.method8156(910309207);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1363372118) * -1595015587 - 1] = var22 != null
               ? classSF.method10131(var22.method8533(-1610490446), (byte)-4)
               : "";
            return 1;
         } else if (1620 == var0) {
            class372 var21 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 60932828) * -1074946389 - 1] = var21 != null ? var21.field4641 * 1635834675 : 0;
            return 1;
         } else if (var0 == -1273625789) {
            classOO var20 = var3.method8156(164493971);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 663651519) * -405389078 - 1] = null != var20 ? classOO.method8568(var20, 1850208224) : 0;
            return 1;
         } else if (-1394632267 == var0) {
            classOO var19 = var3.method8156(1768504644);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1698096547) * 1105525630 - 1] = var19 != null ? var19.method8570(2003142841) : 0;
            return 1;
         } else if (var0 == 1623) {
            classOO var18 = var3.method8156(995788443);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -997539981) * 327716789 - 1] = null != var18 ? var18.method8572((byte)-25) : 0;
            return 1;
         } else if (var0 == 1624) {
            classOO var17 = var3.method8156(1042434084);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -151482093) * 327716789 - 1] = var17 != null && var17.method8538((byte)0) ? 1 : 0;
            return 1;
         } else if (1995892423 != var0) {
            if (var0 == 1626) {
               classOO var16 = var3.method8156(1421569795);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var16
                  ? var16.method8536(-467707491).method10274((byte)101)
                  : "";
               return 1;
            } else if (var0 == 1627) {
               classOO var15 = var3.method8156(576666690);
               int var5 = var15 != null ? var15.method8550((byte)-106) : 0;
               int var6 = var15 != null ? var15.method8549(1757525191) : 0;
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1846512157) * 1791353459 - 1] = Math.min(var5, var6);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1926851956) * 327716789 - 1] = Math.max(var5, var6);
               return 1;
            } else if (-1090246785 == var0) {
               classOO var14 = var3.method8156(768156780);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -89209831) * 327716789 - 1] = null != var14 ? var14.method8549(1757525191) : 0;
               return 1;
            } else if (var0 == 1629) {
               classOO var13 = var3.method8156(827166550);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1792699085) * 327716789 - 1] = var13 != null
                  ? classOO.method8578(var13, 1901638926)
                  : 0;
               return 1;
            } else if (var0 == 1925457785) {
               classOO var12 = var3.method8156(519169080);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12 != null
                  ? classOO.method8573(var12, (byte)-31)
                  : 0;
               return 1;
            } else if (var0 == -2076159159) {
               classOO var11 = var3.method8156(1075498212);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 2137814668) * -1174829870 - 1] = null != var11
                  ? classOO.method8584(var11, (byte)-46)
                  : 0;
               return 1;
            } else if (-1150624151 == var0) {
               classOO var10 = var3.method8156(742878952);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -2099536959) * 832349435 - 1] = null != var10 ? var10.method8588(-2067649854) : 0;
               return 1;
            } else if (1633 == var0) {
               class28 var9 = var3.method8162((byte)13);
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = null != var9
                  ? var9.method493(Interpreter_intStack[class408.Interpreter_intStackSize * 523131234 - 1], (byte)12)
                  : 0;
               return 1;
            } else if (var0 == -1348345940) {
               class28 var8 = var3.method8162((byte)13);
               Interpreter_intStack[class408.Interpreter_intStackSize * -1070434483 - 1] = null != var8
                  ? var8.method497((char)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], 1196466575)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classOO var7 = var3.method8156(661927445);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7 != null && var7.method8541(-407773986) ? 1 : 0;
            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("id")
   static int method1143(int var0, Script var1, boolean var2) {
      if (var0 == 8000) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var36 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1250227117);
         DynamicArray var61 = (DynamicArray)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
         class520.method11173(var36, var61, 529503132);
         return 1;
      } else if (var0 == 8001) {
         class408.Interpreter_intStackSize -= 708726074;
         int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var60 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         DynamicArray var78 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 71902363
         );
         classPK.method8766(var78, var35, var60, 116983739);
         return 1;
      } else if (8002 == var0) {
         DynamicArray var34 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var34 == null ? 1 : 0;
         return 1;
      } else if (var0 == 8003) {
         DynamicArray var33 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var33 ? var33.method11215((byte)3) : 0;
         return 1;
      } else if (var0 == 8004) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var32 = (DynamicArray)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         DynamicArray var59 = (DynamicArray)Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = HttpHeaders.method10933(var32, var59, 1344916061);
         return 1;
      } else if (var0 == 8005) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var31 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var58 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var77 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         Object var84 = class39.method651(var77, -831349886);
         DynamicArray var88 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var88
            ? BufferedSink.method10916(var88, var84, var31, var58, 148981997)
            : -1;
         return 1;
      } else if (8006 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var30 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var57 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var76 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         Object var83 = class39.method651(var76, 1343946465);
         DynamicArray var87 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var87 != null
            ? classPE.method8718(var87, var83, var30, var57, 703900950)
            : -1;
         return 1;
      } else if (8007 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var29 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var56 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var75 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         Object var82 = class39.method651(var75, 645567069);
         DynamicArray var86 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var86
            ? class320.method7365(var86, var82, var29, var56, -1803670333)
            : 0;
         return 1;
      } else if (var0 == 8008) {
         DynamicArray var28 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 268403403
         );
         int var55 = FloorUnderlayDefinition.method4514(var28, (byte)47);
         if (var28.field6107 == class586.field6376) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var55 >= 0 ? var28.method11207(2053374425)[var55] : -1;
         } else {
            if (class586.field6379 != var28.field6107) {
               throw new IllegalStateException();
            }

            String var74 = (String)(var55 >= 0 ? var28.method11214((byte)-69)[var55] : null);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var74 ? var74 : "";
         }

         return 1;
      } else if (8009 == var0) {
         DynamicArray var27 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1465638420
         );
         int var54 = Projectile.method1427(var27, 1393891487);
         if (var27.field6107 == class586.field6376) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54 >= 0 ? var27.method11207(2053374425)[var54] : -1;
         } else {
            if (class586.field6379 != var27.field6107) {
               throw new IllegalStateException();
            }

            String var73 = (String)(var54 >= 0 ? var27.method11214((byte)11)[var54] : null);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var73 != null ? var73 : "";
         }

         return 1;
      } else if (var0 == 8010) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var26 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var53 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var72 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         Object var81 = class39.method651(var72, 1672068917);
         DynamicArray var85 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -263730178
         );
         class532.method11167(var85, var81, var26, var53, -1560020699);
         return 1;
      } else if (8011 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var25 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var52 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var71 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         DynamicArray var80 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -305406397
         );
         IntHashTable.method10488(var80, var25, 1, var52, var71, 1461486816);
         return 1;
      } else if (var0 == 8012) {
         DynamicArray var24 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -469729391
         );
         FriendSystem.method470(var24, (byte)33);
         return 1;
      } else if (var0 == 8013) {
         int var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DynamicArray var51 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -481594164
         );
         VarpDefinition.method4805(var51, var23, (byte)39);
         return 1;
      } else if (var0 == 8014) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var50 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         DynamicArray var70 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -764760261
         );
         class380.method8275(var70, var22, var50, (byte)1);
         return 1;
      } else if (8015 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var49 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var69 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var79 = VarcInt.method4531(Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587], null, -1114107266);
         DynamicArray var7 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize + 1], null, -638677865);
         ItemLayer.method5390(var79, var7, var21, var49, var69, 68708291);
         return 1;
      } else if (var0 == 8016) {
         DynamicArray var20 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -635400186
         );
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)class6.method121(var20, 764544479);
         return 1;
      } else if (8017 == var0) {
         DynamicArray var19 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -714235403
         );
         int var48 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class236.method6007(var19, var48, 1820804724);
         return 1;
      } else if (var0 == 8018) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         String var18 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var47 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = classIL.method4911(var18, var47, -979757086);
         return 1;
      } else if (8019 == var0) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var17 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1476794093);
         String var46 = (String)Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class383.method8658(var17, var46, 921778921);
         return 1;
      } else if (var0 == 8020) {
         class408.Interpreter_intStackSize -= 708726074;
         int var16 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         EnumComposition var68 = class108.getEnum(var45, 192927917);
         if (var68.outputType != var16) {
            throw new RuntimeException();
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var68.method4463(-446231840);
            return 1;
         }
      } else if (8021 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         EnumComposition var67 = class108.getEnum(var44, 457304177);
         if (var67.inputType != var15) {
            throw new RuntimeException();
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = EnumComposition.method4465(
               var67, 1451871497
            );
            return 1;
         }
      } else if (var0 == 8022) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var14 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var66 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         if (var66 < var43) {
            var66 = var43;
         }

         if (var43 >= 0 && var43 <= 5000 && var66 >= 0 && var66 <= 5000) {
            if (115 == var14) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                  class586.field6379, "", var43, var66
               );
            } else if (var14 != 105 && var14 != 49) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                  class586.field6376, -1, var43, var66
               );
            } else {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                  class586.field6376, 0, var43, var66
               );
            }

            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 8023) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DynamicArray var42 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -515968537
         );
         if (var13 >= 0 && var13 <= 5000) {
            var42.method11226(var13, (byte)73);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (8024 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var41 = class39.method651(var12, 1316683759);
         DynamicArray var65 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -372310845
         );
         ProjectionCoord.method9918(var65, var65.method11215((byte)32), var41, -1370787800);
         return 1;
      } else if (8025 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var11 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var40 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Object var64 = class39.method651(var40, -209024577);
         DynamicArray var6 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1413639677
         );
         ProjectionCoord.method9918(var6, var11, var64, 1888976450);
         return 1;
      } else if (var0 == 8026) {
         int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DynamicArray var39 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 26435411
         );
         Object var63 = GrandExchangeEvent.method8939(var39, var10, -1636226245);
         SwapSongTask.method10272(var39.field6107, var63, (byte)54);
         return 1;
      } else if (8027 == var0) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var9 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -69010965);
         DynamicArray var38 = VarcInt.method4531(Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1], null, -1334943338);
         GrandExchangeOfferNameComparator.method9136(var9, var38, var9.method11215((byte)5), 122104396);
         return 1;
      } else if (var0 == 8028) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var37 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -171352351);
         DynamicArray var62 = VarcInt.method4531(Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -590465834);
         GrandExchangeOfferNameComparator.method9136(var37, var62, var8, 122104396);
         return 1;
      } else if (8029 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var3 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var4 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         DynamicArray var5 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -291295254
         );
         SpotAnimationDefinition.method4623(var5, var3, var4, -1027917603);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("iy")
   static int method1147(int var0, Script var1, boolean var2) {
      if (13337 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -2113340171 * field339;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("en")
   static int method1051(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1600) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1068149169 * var3.scrollX;
         return 1;
      } else if (1601 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.scrollY * -497311503;
         return 1;
      } else if (1602 == var0) {
         if (var3.type * 928687775 == 12) {
            classOO var24 = var3.method8156(963101438);
            if (null != var24) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = classSF.method10131(
                  classOO.method8531(var24, 424389582), (byte)-119
               );
               return 1;
            }
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.text;
         return 1;
      } else if (1603 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.scrollWidth * -111672215;
         return 1;
      } else if (var0 == 1604) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1963554889 * var3.scrollHeight;
         return 1;
      } else if (1605 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1417816983 * var3.modelZoom;
         return 1;
      } else if (var0 == 1606) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.modelAngleX * 751747207;
         return 1;
      } else if (1607 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1415481045 * var3.modelAngleZ;
         return 1;
      } else if (var0 == 1608) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1629507461 * var3.modelAngleY;
         return 1;
      } else if (var0 == 1609) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.transparencyTop * -2090288859;
         return 1;
      } else if (var0 == 1610) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -185564907 * var3.transparencyBot;
         return 1;
      } else if (1611 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.color * 7845467;
         return 1;
      } else if (var0 == 1612) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.color2 * -1402291999;
         return 1;
      } else if (var0 == 1613) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.fillMode.rsOrdinal((byte)34);
         return 1;
      } else if (var0 == 1614) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         if (var0 == 1617) {
            class372 var4 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var4 ? var4.field4640 * -936277931 : 0;
         }

         if (var0 == 1618) {
            class372 var23 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var23 ? var23.field4642 * 527385781 : 0;
            return 1;
         } else if (var0 == 1619) {
            classOO var22 = var3.method8156(1926132231);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var22 != null
               ? classSF.method10131(var22.method8533(-1309248755), (byte)-115)
               : "";
            return 1;
         } else if (1620 == var0) {
            class372 var21 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var21 != null ? var21.field4641 * 1635834675 : 0;
            return 1;
         } else if (var0 == 1621) {
            classOO var20 = var3.method8156(275242674);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var20
               ? classOO.method8568(var20, 2060820041)
               : 0;
            return 1;
         } else if (1622 == var0) {
            classOO var19 = var3.method8156(565482883);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var19 != null ? var19.method8570(-904227554) : 0;
            return 1;
         } else if (var0 == 1623) {
            classOO var18 = var3.method8156(1459420566);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var18 ? var18.method8572((byte)9) : 0;
            return 1;
         } else if (var0 == 1624) {
            classOO var17 = var3.method8156(862488618);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var17 != null && var17.method8538((byte)0) ? 1 : 0;
            return 1;
         } else if (1625 != var0) {
            if (var0 == 1626) {
               classOO var16 = var3.method8156(742685545);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var16
                  ? var16.method8536(-467707491).method10274((byte)95)
                  : "";
               return 1;
            } else if (var0 == 1627) {
               classOO var15 = var3.method8156(2026058193);
               int var5 = var15 != null ? var15.method8550((byte)9) : 0;
               int var6 = var15 != null ? var15.method8549(1757525191) : 0;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.min(var5, var6);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.max(var5, var6);
               return 1;
            } else if (1628 == var0) {
               classOO var14 = var3.method8156(338692120);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var14 ? var14.method8549(1757525191) : 0;
               return 1;
            } else if (var0 == 1629) {
               classOO var13 = var3.method8156(643411465);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var13 != null
                  ? classOO.method8578(var13, 2067473035)
                  : 0;
               return 1;
            } else if (var0 == 1630) {
               classOO var12 = var3.method8156(230535098);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12 != null
                  ? classOO.method8573(var12, (byte)-55)
                  : 0;
               return 1;
            } else if (var0 == 1631) {
               classOO var11 = var3.method8156(116738107);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var11
                  ? classOO.method8584(var11, (byte)3)
                  : 0;
               return 1;
            } else if (1632 == var0) {
               classOO var10 = var3.method8156(1911279739);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var10 ? var10.method8588(-2067649854) : 0;
               return 1;
            } else if (1633 == var0) {
               class28 var9 = var3.method8162((byte)13);
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = null != var9
                  ? var9.method493(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1], (byte)12)
                  : 0;
               return 1;
            } else if (var0 == 1634) {
               class28 var8 = var3.method8162((byte)13);
               Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = null != var8
                  ? var8.method497((char)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], 103963737)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classOO var7 = var3.method8156(1746463577);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7 != null && var7.method8541(-714782910) ? 1 : 0;
            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("eb")
   static int method1052(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1600) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -144493754) * -66653841 - 1] = 1012774773 * var3.scrollX;
         return 1;
      } else if (-1598450924 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.scrollY * -520221344;
         return 1;
      } else if (1602 == var0) {
         if (var3.type * -1928370475 == 12) {
            classOO var24 = var3.method8156(1145903441);
            if (null != var24) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = classSF.method10131(
                  classOO.method8531(var24, 1066190109), (byte)-63
               );
               return 1;
            }
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 920115428) * -201748020 - 1] = var3.text;
         return 1;
      } else if (1603 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1560309636 - 1] = var3.scrollWidth * -111672215;
         return 1;
      } else if (var0 == 1604) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1360444495) * 1809997020 - 1] = -1963554889 * var3.scrollHeight;
         return 1;
      } else if (1605 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1967643346 - 1] = 1491822242 * var3.modelZoom;
         return 1;
      } else if (var0 == 1606) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1760476601) * -1190421200 - 1] = var3.modelAngleX * 751747207;
         return 1;
      } else if (1607 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1885980512 - 1] = 1752733478 * var3.modelAngleZ;
         return 1;
      } else if (var0 == -1800541541) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -253677862 - 1] = 1629507461 * var3.modelAngleY;
         return 1;
      } else if (var0 == 1609) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 460439646) * -573589237 - 1] = var3.transparencyTop * 1203846182;
         return 1;
      } else if (var0 == 1265810264) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1211559440 * var3.transparencyBot;
         return 1;
      } else if (1777908893 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -331373543 - 1] = var3.color * 7845467;
         return 1;
      } else if (var0 == 1612) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.color2 * -1022912701;
         return 1;
      } else if (var0 == -500517413) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -2045766843) * 327716789 - 1] = var3.fillMode.rsOrdinal((byte)72);
         return 1;
      } else if (var0 == 1614) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -344452425 - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         if (var0 == 1617) {
            class372 var4 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1133656487) * -1964514185 - 1] = null != var4 ? var4.field4640 * -936277931 : 0;
         }

         if (var0 == 1618) {
            class372 var23 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1131166100 - 1] = null != var23 ? var23.field4642 * 527385781 : 0;
            return 1;
         } else if (var0 == 1619) {
            classOO var22 = var3.method8156(921007916);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -52966574) * -1595015587 - 1] = var22 != null
               ? classSF.method10131(var22.method8533(1745262861), (byte)-121)
               : "";
            return 1;
         } else if (-1439119192 == var0) {
            class372 var21 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var21 != null ? var21.field4641 * -1217342912 : 0;
            return 1;
         } else if (var0 == -1938961316) {
            classOO var20 = var3.method8156(756001754);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 356981208) * -1658797542 - 1] = null != var20
               ? classOO.method8568(var20, 2078520127)
               : 0;
            return 1;
         } else if (2117641115 == var0) {
            classOO var19 = var3.method8156(444850914);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1275754043) * 327716789 - 1] = var19 != null ? var19.method8570(-1335065594) : 0;
            return 1;
         } else if (var0 == -1731151457) {
            classOO var18 = var3.method8156(1859944951);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 916960876) * 1454039243 - 1] = null != var18 ? var18.method8572((byte)10) : 0;
            return 1;
         } else if (var0 == 1624) {
            classOO var17 = var3.method8156(1865252323);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1302398502) * 327716789 - 1] = var17 != null && var17.method8538((byte)0) ? 1 : 0;
            return 1;
         } else if (1625 != var0) {
            if (var0 == 2064887069) {
               classOO var16 = var3.method8156(936288492);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var16
                  ? var16.method8536(-467707491).method10274((byte)83)
                  : "";
               return 1;
            } else if (var0 == 582034140) {
               classOO var15 = var3.method8156(1036580049);
               int var5 = var15 != null ? var15.method8550((byte)-31) : 0;
               int var6 = var15 != null ? var15.method8549(1757525191) : 0;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.min(var5, var6);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1934931208) * -1375399133 - 1] = Math.max(var5, var6);
               return 1;
            } else if (1628 == var0) {
               classOO var14 = var3.method8156(1483330673);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var14 ? var14.method8549(1757525191) : 0;
               return 1;
            } else if (var0 == 889364441) {
               classOO var13 = var3.method8156(1554013002);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var13 != null
                  ? classOO.method8578(var13, 1527462864)
                  : 0;
               return 1;
            } else if (var0 == 1671601499) {
               classOO var12 = var3.method8156(1674949553);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12 != null
                  ? classOO.method8573(var12, (byte)-117)
                  : 0;
               return 1;
            } else if (var0 == 1631) {
               classOO var11 = var3.method8156(712907658);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 931205650) * 327716789 - 1] = null != var11 ? classOO.method8584(var11, (byte)58) : 0;
               return 1;
            } else if (1632 == var0) {
               classOO var10 = var3.method8156(406005507);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1104051249) * -1570714659 - 1] = null != var10 ? var10.method8588(-2067649854) : 0;
               return 1;
            } else if (1633 == var0) {
               class28 var9 = var3.method8162((byte)13);
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = null != var9
                  ? var9.method493(Interpreter_intStack[class408.Interpreter_intStackSize * 1493685892 - 1], (byte)12)
                  : 0;
               return 1;
            } else if (var0 == 902614259) {
               class28 var8 = var3.method8162((byte)13);
               Interpreter_intStack[class408.Interpreter_intStackSize * 1188962833 - 1] = null != var8
                  ? var8.method497((char)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], 3761493)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classOO var7 = var3.method8156(564541980);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7 != null && var7.method8541(-1302293633) ? 1 : 0;
            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ff")
   static int method1055(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (1700 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1057384527) * 180700134 - 1] = -1023163429 * var3.itemId;
         return 1;
      } else if (var0 == 1701) {
         if (-1 != var3.itemId * -1444321436) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1056917016 * var3.itemQuantity;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 115872508 - 1] = 0;
         }

         return 1;
      } else if (var0 == 751121099) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.childIndex * 2077538819;
         return 1;
      } else if (var0 == -1895743694) {
         int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1600845533) * 327716789];
         ParamComposition var8 = WorldMap.getParamDefinition(var7, -782632921);
         if (ParamComposition.method4969(var8, 1373048483)) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.method8068(
               var7, var8.defaultStr, (byte)35
            );
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 977955322) * 1236255695 - 1] = var3.method8071(
               var7, 1195457091 * var8.defaultInt, -777171331
            );
         }

         return 1;
      } else if (1704 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 446284877];
         Object var5 = class39.method651(var4, 1003634598);
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1001151554) * 287731675];
         Widget.method8079(var3, var6, var5, (byte)67);
         return 1;
      } else if (var0 == -1057335867) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1623532242) * -1692885433 - 1] = var3.method8113((byte)14) ? 1 : 0;
         return 1;
      } else if (-181141195 == var0) {
         return FriendSystem.method472(var3, 1642423493);
      } else {
         return -472457599 == var0 ? class28.method532(var3, (byte)-46) : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fp")
   static int method1056(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (1700 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -231674939 * var3.itemId;
         return 1;
      } else if (var0 == 1701) {
         if (-1 != var3.itemId * -231674939) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1070452379 * var3.itemQuantity;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.childIndex * 2077538819;
         return 1;
      } else if (var0 == 1703) {
         int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         ParamComposition var8 = WorldMap.getParamDefinition(var7, -719822735);
         if (ParamComposition.method4969(var8, 2061784375)) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.method8068(
               var7, var8.defaultStr, (byte)16
            );
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.method8071(
               var7, -822826545 * var8.defaultInt, -1921634202
            );
         }

         return 1;
      } else if (1704 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var5 = class39.method651(var4, 27658405);
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Widget.method8079(var3, var6, var5, (byte)-99);
         return 1;
      } else if (var0 == 1707) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.method8113((byte)14) ? 1 : 0;
         return 1;
      } else if (1708 == var0) {
         return FriendSystem.method472(var3, 2124175159);
      } else {
         return 1709 == var0 ? class28.method532(var3, (byte)96) : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("fw")
   static Object[] method1067() {
      String var0 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
      Object[] var1 = new Object[var0.length()];

      for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
         if (var0.charAt(var2) == 'i') {
            var1[var2] = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         } else {
            var1[var2] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fn")
   static int method1057(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (1700 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -231674939 * var3.itemId;
         return 1;
      } else if (var0 == 1701) {
         if (-1 != var3.itemId * -231674939) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1070452379 * var3.itemQuantity;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.childIndex * 2077538819;
         return 1;
      } else if (var0 == 1703) {
         int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         ParamComposition var8 = WorldMap.getParamDefinition(var7, -651605121);
         if (ParamComposition.method4969(var8, -389720509)) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.method8068(
               var7, var8.defaultStr, (byte)15
            );
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.method8071(
               var7, -822826545 * var8.defaultInt, -758367383
            );
         }

         return 1;
      } else if (1704 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var5 = class39.method651(var4, -544558203);
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Widget.method8079(var3, var6, var5, (byte)-53);
         return 1;
      } else if (var0 == 1707) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.method8113((byte)14) ? 1 : 0;
         return 1;
      } else if (1708 == var0) {
         return FriendSystem.method472(var3, 1831755713);
      } else {
         return 1709 == var0 ? class28.method532(var3, (byte)-68) : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I)V")
   @ObfuscatedName("dl")
   static void method1015(Widget var0, int var1) {
      if (0 == var0.type * 928687775 && 2077538819 * var0.childIndex > -1) {
         if (var1 > var0.field4454 * -86298045) {
            var0.field4454 = var1 * -593417621;
         }

         if (var1 < -1516264759 * var0.field4453) {
            var0.field4453 = -1970530439 * var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("jb")
   static void method1162(Widget var0) {
      var0.method8152(-1849664520);
      var0.method8156(650331989).method8528(new class85(var0), (byte)-32);
      classOO.method8526(var0.method8156(398910621), new classDH(var0), -600666969);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)I")
   @ObfuscatedName("fs")
   static int method1059(Widget var0) {
      if (var0.type * 928687775 != 11) {
         Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
         return 1;
      } else {
         String var1 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Widget.method8119(var0, var1, 1065258793);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fx")
   static int method1070(int var0, Script var1, boolean var2) {
      Widget var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1142847971], -1239370631);
      if (var0 == 2500) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1394474711) * 1624511832 - 1] = -927644520 * var3.x;
         return 1;
      } else if (436816561 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1253885473) * 327716789 - 1] = var3.y * -286860451;
         return 1;
      } else if (1955646555 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1737645368 - 1] = var3.width * -1946208531;
         return 1;
      } else if (2503 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -922161332) * 1040365207 - 1] = var3.height * -905446999;
         return 1;
      } else if (var0 == 2504) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (1144651876 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1138544446 - 1] = -483048996 * var3.parentId;
         return 1;
      } else if (var0 != 2506) {
         return 2;
      } else {
         int var4 = 794900977 * var3.parentId;
         if (var4 == -1) {
            for (InterfaceParent var5 = (InterfaceParent)client.interfaceParents.first(); null != var5; var5 = (InterfaceParent)client.interfaceParents.next()) {
               if (-698827873 * var5.group == var3.id * 278777747 >> 16) {
                  var4 = (int)var5.key;
                  break;
               }
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1390378852) * 327716789 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fg")
   static int method1062(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1800) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = LoginPacket.Widget_unpackTargetMask(
            class191.getWidgetFlags(var3, (byte)75), -1172732290
         );
         return 1;
      } else if (var0 != 1801) {
         if (1802 == var0) {
            if (null == var3.dataText) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            } else {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         var4--;
         if (null != var3.actions && var4 < var3.actions.length && null != var3.actions[var4]) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.actions[var4];
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ft")
   static int method1064(int var0, Script var1, boolean var2) {
      if (var0 == 1927 || var0 == 2927) {
         if (field335 * -196365427 >= 10) {
            throw new RuntimeException();
         } else {
            Widget var11;
            if (var0 >= 2000) {
               var11 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -592228455);
            } else {
               var11 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
            }

            if (null == var11.onTargetLeave) {
               return 0;
            } else {
               ScriptEvent var14 = new ScriptEvent();
               var14.widget = var11;
               var14.args = var11.onTargetLeave;
               var14.field530 = field335 * -1734903867 + 411265817;
               client.scriptEvents.addFirst(var14);
               return 1;
            }
         }
      } else if (var0 == 1928) {
         Widget var10 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var13 >= 1 && var13 <= 10) {
            classDY var16 = new classDY(var13, 278777747 * var10.id, var10.childIndex * 2077538819, -231674939 * var10.itemId);
            field344.add(var16);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 2928) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var9 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var12 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var15 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         if (var15 >= 1 && var15 <= 10) {
            Widget var17 = class226.widgetDefinition.getWidgetChild(var9, var12, -1801630009);
            if (null == var17) {
               throw new RuntimeException();
            } else {
               classDY var19 = new classDY(var15, var9, var12, var17.itemId * -231674939);
               field344.add(var19);
               return 1;
            }
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 2929) {
         Object[] var3 = class195.method4536(-1927402041);
         class408.Interpreter_intStackSize -= -1084394537;
         int var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var5 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var6 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         int var7 = -1;
         Widget var8 = class226.widgetDefinition.getWidgetChild(var5, var6, -1075503812);
         if (null != var8) {
            var7 = -231674939 * var8.itemId;
            HttpRequestTask.method90(var5, var6, var7, var4, var3, -1854648852);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fq")
   static int method1065(int var0, Script var1, boolean var2) {
      if (var0 == 1927 || var0 == 2927) {
         if (field335 * -196365427 >= 10) {
            throw new RuntimeException();
         } else {
            Widget var11;
            if (var0 >= 2000) {
               var11 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1352376346);
            } else {
               var11 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
            }

            if (null == var11.onTargetLeave) {
               return 0;
            } else {
               ScriptEvent var14 = new ScriptEvent();
               var14.widget = var11;
               var14.args = var11.onTargetLeave;
               var14.field530 = field335 * -1734903867 + 411265817;
               client.scriptEvents.addFirst(var14);
               return 1;
            }
         }
      } else if (var0 == 1928) {
         Widget var10 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var13 >= 1 && var13 <= 10) {
            classDY var16 = new classDY(var13, 278777747 * var10.id, var10.childIndex * 2077538819, -231674939 * var10.itemId);
            field344.add(var16);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 2928) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var9 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var12 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var15 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         if (var15 >= 1 && var15 <= 10) {
            Widget var17 = class226.widgetDefinition.getWidgetChild(var9, var12, -823252868);
            if (null == var17) {
               throw new RuntimeException();
            } else {
               classDY var19 = new classDY(var15, var9, var12, var17.itemId * -231674939);
               field344.add(var19);
               return 1;
            }
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 2929) {
         Object[] var3 = class195.method4536(-536829888);
         class408.Interpreter_intStackSize -= -1084394537;
         int var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var5 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var6 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         int var7 = -1;
         Widget var8 = class226.widgetDefinition.getWidgetChild(var5, var6, -2076087872);
         if (null != var8) {
            var7 = -231674939 * var8.itemId;
            HttpRequestTask.method90(var5, var6, var7, var4, var3, -1702106305);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fz")
   static int method1066(int var0, Script var1, boolean var2) {
      if (var0 == 1927 || var0 == 2927) {
         if (field335 * -196365427 >= 10) {
            throw new RuntimeException();
         } else {
            Widget var11;
            if (var0 >= 2000) {
               var11 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1947414751);
            } else {
               var11 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
            }

            if (null == var11.onTargetLeave) {
               return 0;
            } else {
               ScriptEvent var14 = new ScriptEvent();
               var14.widget = var11;
               var14.args = var11.onTargetLeave;
               var14.field530 = field335 * -1734903867 + 411265817;
               client.scriptEvents.addFirst(var14);
               return 1;
            }
         }
      } else if (var0 == 1928) {
         Widget var10 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var13 >= 1 && var13 <= 10) {
            classDY var16 = new classDY(var13, 278777747 * var10.id, var10.childIndex * 2077538819, -231674939 * var10.itemId);
            field344.add(var16);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 2928) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var9 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var12 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var15 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         if (var15 >= 1 && var15 <= 10) {
            Widget var17 = class226.widgetDefinition.getWidgetChild(var9, var12, -1479407863);
            if (null == var17) {
               throw new RuntimeException();
            } else {
               classDY var19 = new classDY(var15, var9, var12, var17.itemId * -231674939);
               field344.add(var19);
               return 1;
            }
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 2929) {
         Object[] var3 = class195.method4536(-1902020684);
         class408.Interpreter_intStackSize -= -1084394537;
         int var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var5 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var6 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         int var7 = -1;
         Widget var8 = class226.widgetDefinition.getWidgetChild(var5, var6, -1936521083);
         if (null != var8) {
            var7 = -231674939 * var8.itemId;
            HttpRequestTask.method90(var5, var6, var7, var4, var3, 2008689595);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("eu")
   static int method1044(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1483877340);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      String var4 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
      int[] var5 = null;
      if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var6 > 0) {
            var5 = new int[var6];

            while (var6-- > 0) {
               var5[var6] = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      for (int var7 = var9.length - 1; var7 >= 1; var7--) {
         switch (var4.charAt(var7 - 1)) {
            case 'W':
            case 'X':
            case 's':
               var9[var7] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               break;
            default:
               var9[var7] = new Integer(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         }
      }

      int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
      if (var10 != -1) {
         var9[0] = new Integer(var10);
      } else {
         var9 = null;
      }

      if (1400 == var0) {
         var3.onDialogAbort = var9;
      } else if (var0 == 1401) {
         var3.onResize = var9;
      } else if (1402 == var0) {
         var3.field4569 = var9;
      } else if (1403 == var0) {
         var3.field4547 = var9;
      } else if (var0 == 1404) {
         var3.onMiscTransmit = var9;
      } else if (var0 == 1405) {
         var3.onOp = var9;
      } else if (var0 == 1406) {
         var3.onMouseOver = var9;
      } else if (1407 == var0) {
         var3.onLoad = var9;
         var3.varTransmitTriggers = var5;
      } else if (var0 == 1408) {
         var3.onTargetEnter = var9;
      } else if (1409 == var0) {
         var3.onClickRepeat = var9;
      } else if (1410 == var0) {
         var3.field4575 = var9;
      } else if (var0 == 1411) {
         var3.onMouseRepeat = var9;
      } else if (1412 == var0) {
         var3.onRelease = var9;
      } else if (1414 == var0) {
         var3.onStatTransmit = var9;
         var3.invTransmitTriggers = var5;
      } else if (1415 == var0) {
         var3.onScroll = var9;
         var3.statTransmitTriggers = var5;
      } else if (var0 == 1416) {
         var3.onChatTransmit = var9;
      } else if (var0 == 1417) {
         var3.onVarTransmit = var9;
      } else if (1418 == var0) {
         var3.onInvTransmit = var9;
      } else if (var0 == 1419) {
         var3.onDrag = var9;
      } else if (var0 == 1420) {
         var3.onKey = var9;
      } else if (var0 == 1421) {
         var3.field4567 = var9;
      } else if (1422 == var0) {
         var3.onHold = var9;
      } else if (var0 == 1423) {
         var3.field4587 = var9;
      } else if (var0 == 1424) {
         var3.field4541 = var9;
      } else if (1425 == var0) {
         var3.onSubChange = var9;
      } else if (var0 == 1426) {
         var3.onDragComplete = var9;
      } else if (1427 == var0) {
         var3.onTargetLeave = var9;
      } else if (1428 == var0) {
         var3.onStockTransmit = var9;
      } else if (var0 == 1429) {
         var3.onMouseLeave = var9;
      } else if (var0 == 1430) {
         var3.onFriendTransmit = var9;
      } else if (1431 == var0) {
         var3.onClick = var9;
      } else if (1434 == var0) {
         var3.onTimer = var9;
      } else if (1435 == var0) {
         var3.onClanTransmit = var9;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class376 var8 = var3.method8164((byte)-28);
         if (null != var8) {
            if (1436 == var0) {
               var8.field4682 = var9;
            } else if (var0 == 1437) {
               var8.field4683 = var9;
            } else if (var0 == 1438) {
               var8.field4684 = var9;
            } else if (var0 == 1439) {
               var8.field4685 = var9;
            }
         }
      }

      var3.hasListener = true;
      return 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)I")
   @ObfuscatedName("fh")
   static int method1060(Widget var0) {
      if (var0.type * 928687775 != 11) {
         Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
         return 1;
      } else {
         String var1 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Widget.method8119(var0, var1, 1457783298);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("fe")
   static Object[] method1068() {
      String var0 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1825296037) * -1595015587];
      Object[] var1 = new Object[var0.length()];

      for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
         if (var0.charAt(var2) == 1837671627) {
            var1[var2] = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         } else {
            var1[var2] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -557553431) * -1595015587];
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gn")
   static int method1079(int var0, Script var1, boolean var2) {
      if (3300 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1759706017 * client.cycle;
         return 1;
      } else if (var0 == 3301) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var31 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOfferTotalQuantityComparator.method9178(
            var23, var31, 1972794310
         );
         return 1;
      } else if (var0 == 3302) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var30 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class209.ItemContainer_getCount(var22, var30, 1148857744);
         return 1;
      } else if (3303 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var29 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class320.method7362(var21, var29, 1876982269);
         return 1;
      } else if (3304 == var0) {
         int var20 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WallDecoration.getInvDefinition(var20, 248682657).size
            * -882743441;
         return 1;
      } else if (var0 == 3305) {
         int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.currentLevels[var19];
         return 1;
      } else if (3306 == var0) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.levels[var18];
         return 1;
      } else if (3307 == var0) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.experience[var17];
         return 1;
      } else if (3308 == var0) {
         int var16 = 2115028565 * Occluder.topLevelWorldView.plane;
         int var28 = (class330.localPlayer.x * 340712311 >> 7) + 825809917 * Occluder.topLevelWorldView.baseX;
         int var32 = (class330.localPlayer.y * -1747310679 >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8286(var16, var28, var32, (byte)37);
         return 1;
      } else if (var0 == 3309) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8292(var15, -1508529683);
         return 1;
      } else if (3310 == var0) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8288(var14, -1272712596);
         return 1;
      } else if (var0 == 3311) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8294(var13, 1346086770);
         return 1;
      } else if (var0 == 3312) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.isMembersWorld ? 1 : 0;
         return 1;
      } else if (var0 == 3313) {
         class408.Interpreter_intStackSize -= 708726074;
         int var12 = 32768 + Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var27 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOfferTotalQuantityComparator.method9178(
            var12, var27, 2043617828
         );
         return 1;
      } else if (var0 == 3314) {
         class408.Interpreter_intStackSize -= 708726074;
         int var11 = 32768 + Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var26 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class209.ItemContainer_getCount(var11, var26, 1148857744);
         return 1;
      } else if (3315 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var10 = 32768 + Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var25 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class320.method7362(var10, var25, 1876982269);
         return 1;
      } else if (var0 == 3316) {
         if (427594063 * client.staffModLevel >= 2) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 427594063 * client.staffModLevel;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (3317 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 257591815 * client.rebootTimer;
         return 1;
      } else if (var0 == 3318) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1312022025 * client.worldId;
         return 1;
      } else if (3321 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.runEnergy * -1850849067 / 100;
         return 1;
      } else if (3322 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -17542531 * client.weight;
         return 1;
      } else if (var0 == 3323) {
         if (client.playerMod) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (3324 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1330094789 * client.worldProperties;
         return 1;
      } else if (3325 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var9 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var24 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         int var5 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         int var6 = Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789];
         int var7 = Coord.method8286(var5, var24, var6, (byte)-55);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var9 + var7;
         return 1;
      } else if (3326 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field722 * -2071788461;
         return 1;
      } else if (var0 == 3327) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field723 * -1318930041;
         return 1;
      } else if (var0 == 3331) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.runEnergy * -1850849067;
         return 1;
      } else if (3332 == var0) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field682[var8];
         return 1;
      } else if (var0 == 3333) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = client.field673;
         return 1;
      } else if (var0 == 3339) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (-1 == var3) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         } else {
            WorldEntityConfig var4 = WorldMapRegion.method6991(var3, (byte)-75);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4 == null ? "" : var4.field2378;
         }

         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fy")
   static int method1071(int var0, Script var1, boolean var2) {
      Widget var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 950544066);
      if (var0 == 2500) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -814361553 * var3.x;
         return 1;
      } else if (2501 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.y * -286860451;
         return 1;
      } else if (2502 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.width * -1946208531;
         return 1;
      } else if (2503 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.height * -905446999;
         return 1;
      } else if (var0 == 2504) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (2505 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 794900977 * var3.parentId;
         return 1;
      } else if (var0 != 2506) {
         return 2;
      } else {
         int var4 = 794900977 * var3.parentId;
         if (var4 == -1) {
            for (InterfaceParent var5 = (InterfaceParent)client.interfaceParents.first(); null != var5; var5 = (InterfaceParent)client.interfaceParents.next()) {
               if (-1385287145 * var5.group == var3.id * 278777747 >> 16) {
                  var4 = (int)var5.key;
                  break;
               }
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)Lut;")
   @ObfuscatedName("dv")
   static DynamicArray method1004(int var0, Object var1) {
      DynamicArray var2 = (DynamicArray)var1;
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fv")
   static int method1072(int var0, Script var1, boolean var2) {
      Widget var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1880257828);
      if (var0 == 2500) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -814361553 * var3.x;
         return 1;
      } else if (2501 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.y * -286860451;
         return 1;
      } else if (2502 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.width * -1946208531;
         return 1;
      } else if (2503 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.height * -905446999;
         return 1;
      } else if (var0 == 2504) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (2505 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 794900977 * var3.parentId;
         return 1;
      } else if (var0 != 2506) {
         return 2;
      } else {
         int var4 = 794900977 * var3.parentId;
         if (var4 == -1) {
            for (InterfaceParent var5 = (InterfaceParent)client.interfaceParents.first(); null != var5; var5 = (InterfaceParent)client.interfaceParents.next()) {
               if (-1385287145 * var5.group == var3.id * 278777747 >> 16) {
                  var4 = (int)var5.key;
                  break;
               }
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ed")
   static int method1053(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      if (var0 == 1600) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 634110596) * 327716789 - 1] = 1068149169 * var3.scrollX;
         return 1;
      } else if (1280271960 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -23476265) * 327716789 - 1] = var3.scrollY * -497311503;
         return 1;
      } else if (-265477840 == var0) {
         if (var3.type * 928687775 == 12) {
            classOO var24 = var3.method8156(1011592546);
            if (null != var24) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1857054789) * 210793283 - 1] = classSF.method10131(
                  classOO.method8531(var24, 394918956), (byte)-91
               );
               return 1;
            }
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1173187013) * 1726739359 - 1] = var3.text;
         return 1;
      } else if (1603 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -955203763) * 327716789 - 1] = var3.scrollWidth * -1087462096;
         return 1;
      } else if (var0 == 1604) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 587561177 - 1] = -1963554889 * var3.scrollHeight;
         return 1;
      } else if (-2015168705 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1594503924) * 327716789 - 1] = -1417816983 * var3.modelZoom;
         return 1;
      } else if (var0 == 916131202) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1485207898 - 1] = var3.modelAngleX * 751747207;
         return 1;
      } else if (1607 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 631299642) * -1166167675 - 1] = 1963806323 * var3.modelAngleZ;
         return 1;
      } else if (var0 == 1608) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1826177989) * 327716789 - 1] = 1629507461 * var3.modelAngleY;
         return 1;
      } else if (var0 == 1609) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -781414554) * 1345415466 - 1] = var3.transparencyTop * -2090288859;
         return 1;
      } else if (var0 == 1610) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1194694054 * var3.transparencyBot;
         return 1;
      } else if (-325061829 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -107132796) * -580494224 - 1] = var3.color * 744384290;
         return 1;
      } else if (var0 == 1612) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 317992432) * -1403224314 - 1] = var3.color2 * -1402291999;
         return 1;
      } else if (var0 == 1613) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.fillMode.rsOrdinal((byte)115);
         return 1;
      } else if (var0 == 1614) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1670361977) * 1643233884 - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         if (var0 == 1402094571) {
            class372 var4 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1468594823 - 1] = null != var4 ? var4.field4640 * -936277931 : 0;
         }

         if (var0 == 729215966) {
            class372 var23 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var23 ? var23.field4642 * -1307226453 : 0;
            return 1;
         } else if (var0 == 1619) {
            classOO var22 = var3.method8156(342519490);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -394760000) * -1595015587 - 1] = var22 != null
               ? classSF.method10131(var22.method8533(-1721480757), (byte)-99)
               : "";
            return 1;
         } else if (-435828174 == var0) {
            class372 var21 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1564065574) * 1367475850 - 1] = var21 != null ? var21.field4641 * 310715113 : 0;
            return 1;
         } else if (var0 == -1112627933) {
            classOO var20 = var3.method8156(1635248796);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1774684356) * -1251198861 - 1] = null != var20
               ? classOO.method8568(var20, 2044622980)
               : 0;
            return 1;
         } else if (704315260 == var0) {
            classOO var19 = var3.method8156(793358928);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -273680565) * 1056123396 - 1] = var19 != null ? var19.method8570(-562627916) : 0;
            return 1;
         } else if (var0 == 1623) {
            classOO var18 = var3.method8156(1319955475);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 338473525 - 1] = null != var18 ? var18.method8572((byte)64) : 0;
            return 1;
         } else if (var0 == 1624) {
            classOO var17 = var3.method8156(328133310);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1033594313 - 1] = var17 != null && var17.method8538((byte)0) ? 1 : 0;
            return 1;
         } else if (-370216989 != var0) {
            if (var0 == 1626) {
               classOO var16 = var3.method8156(1531087413);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -2030852777) * -1595015587 - 1] = null != var16
                  ? var16.method8536(-467707491).method10274((byte)64)
                  : "";
               return 1;
            } else if (var0 == 1627) {
               classOO var15 = var3.method8156(650531863);
               int var5 = var15 != null ? var15.method8550((byte)-101) : 0;
               int var6 = var15 != null ? var15.method8549(1757525191) : 0;
               Interpreter_intStack[(class408.Interpreter_intStackSize += 213365895) * -1062135814 - 1] = Math.min(var5, var6);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1269595526) * -1307131120 - 1] = Math.max(var5, var6);
               return 1;
            } else if (1522757484 == var0) {
               classOO var14 = var3.method8156(1508756532);
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1099801418) * 327716789 - 1] = null != var14 ? var14.method8549(1757525191) : 0;
               return 1;
            } else if (var0 == 1629) {
               classOO var13 = var3.method8156(260082258);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var13 != null
                  ? classOO.method8578(var13, 1850688661)
                  : 0;
               return 1;
            } else if (var0 == 1630) {
               classOO var12 = var3.method8156(1510556787);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12 != null
                  ? classOO.method8573(var12, (byte)-126)
                  : 0;
               return 1;
            } else if (var0 == 1538078312) {
               classOO var11 = var3.method8156(350253175);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 2110228258 - 1] = null != var11
                  ? classOO.method8584(var11, (byte)40)
                  : 0;
               return 1;
            } else if (1632 == var0) {
               classOO var10 = var3.method8156(1516515646);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1145600185) * 2067256471 - 1] = null != var10 ? var10.method8588(-2067649854) : 0;
               return 1;
            } else if (1633 == var0) {
               class28 var9 = var3.method8162((byte)13);
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = null != var9
                  ? var9.method493(Interpreter_intStack[class408.Interpreter_intStackSize * -1777350259 - 1], (byte)12)
                  : 0;
               return 1;
            } else if (var0 == 1634) {
               class28 var8 = var3.method8162((byte)13);
               Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = null != var8
                  ? var8.method497((char)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], 2085361549)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classOO var7 = var3.method8156(1039624578);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1396059301) * 327716789 - 1] = var7 != null && var7.method8541(1518337290) ? 1 : 0;
            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fj")
   static int method1074(int var0, Script var1, boolean var2) {
      Widget var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -2108230339);
      if (var0 == 2600) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.scrollX * 1068149169;
         return 1;
      } else if (2601 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.scrollY * -497311503;
         return 1;
      } else if (2602 == var0) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3.text;
         return 1;
      } else if (var0 == 2603) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.scrollWidth * -111672215;
         return 1;
      } else if (2604 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.scrollHeight * -1963554889;
         return 1;
      } else if (var0 == 2605) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1417816983 * var3.modelZoom;
         return 1;
      } else if (var0 == 2606) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.modelAngleX * 751747207;
         return 1;
      } else if (2607 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.modelAngleZ * 1415481045;
         return 1;
      } else if (var0 == 2608) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.modelAngleY * 1629507461;
         return 1;
      } else if (2609 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.transparencyTop * -2090288859;
         return 1;
      } else if (var0 == 2610) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.transparencyBot * -185564907;
         return 1;
      } else if (2611 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.color * 7845467;
         return 1;
      } else if (2612 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1402291999 * var3.color2;
         return 1;
      } else if (var0 == 2613) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.fillMode.rsOrdinal((byte)110);
         return 1;
      } else if (var0 == 2614) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         if (var0 == 2617) {
            class372 var4 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var4 ? var4.field4640 * -936277931 : 0;
         }

         if (2618 == var0) {
            class372 var23 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var23 != null ? var23.field4642 * 527385781 : 0;
            return 1;
         } else if (var0 == 2619) {
            classOO var22 = var3.method8156(625005020);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var22
               ? classSF.method10131(var22.method8533(-582809457), (byte)-44)
               : "";
            return 1;
         } else if (var0 == 2620) {
            class372 var21 = var3.method8158((short)16256);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var21 != null ? 1635834675 * var21.field4641 : 0;
            return 1;
         } else if (var0 == 2621) {
            classOO var20 = var3.method8156(1162537191);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var20
               ? classOO.method8568(var20, 1904053180)
               : 0;
            return 1;
         } else if (2622 == var0) {
            classOO var19 = var3.method8156(293770586);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var19 != null ? var19.method8570(623320236) : 0;
            return 1;
         } else if (var0 == 2623) {
            classOO var18 = var3.method8156(875187142);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var18 ? var18.method8572((byte)-95) : 0;
            return 1;
         } else if (var0 == 2624) {
            classOO var17 = var3.method8156(2101583682);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var17 != null && var17.method8538((byte)0) ? 1 : 0;
            return 1;
         } else if (var0 != 2625) {
            if (var0 == 2626) {
               classOO var16 = var3.method8156(1053498431);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var16
                  ? var16.method8536(-467707491).method10274((byte)95)
                  : "";
               return 1;
            } else if (var0 == 2627) {
               classOO var15 = var3.method8156(957772326);
               int var5 = var15 != null ? var15.method8550((byte)-91) : 0;
               int var6 = null != var15 ? var15.method8549(1757525191) : 0;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.min(var5, var6);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.max(var5, var6);
               return 1;
            } else if (2628 == var0) {
               classOO var14 = var3.method8156(279237138);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14 != null ? var14.method8549(1757525191) : 0;
               return 1;
            } else if (2629 == var0) {
               classOO var13 = var3.method8156(919518998);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var13
                  ? classOO.method8578(var13, 1925878076)
                  : 0;
               return 1;
            } else if (var0 == 2630) {
               classOO var12 = var3.method8156(137900047);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12 != null
                  ? classOO.method8573(var12, (byte)-100)
                  : 0;
               return 1;
            } else if (2631 == var0) {
               classOO var11 = var3.method8156(846168075);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var11 != null
                  ? classOO.method8584(var11, (byte)0)
                  : 0;
               return 1;
            } else if (2632 == var0) {
               classOO var10 = var3.method8156(442488287);
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var10 ? var10.method8588(-2067649854) : 0;
               return 1;
            } else if (var0 == 2633) {
               class28 var9 = var3.method8162((byte)13);
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = null != var9
                  ? var9.method493(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1], (byte)12)
                  : 0;
               return 1;
            } else if (var0 == 2634) {
               class28 var8 = var3.method8162((byte)13);
               Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = null != var8
                  ? var8.method497((char)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1], 2145729239)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classOO var7 = var3.method8156(1159391562);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var7 && var7.method8541(470468314) ? 1 : 0;
            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fm")
   static int method1075(int var0, Script var1, boolean var2) {
      if (2700 == var0) {
         Widget var13 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1006748040);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var13.itemId * -231674939;
         return 1;
      } else if (var0 == 2701) {
         Widget var12 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 2111861291);
         if (var12.itemId * -231674939 != -1) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1070452379 * var12.itemQuantity;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         InterfaceParent var15 = (InterfaceParent)client.interfaceParents.method8915(var11);
         if (var15 != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2703) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var10 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Widget var14 = class226.widgetDefinition
            .getWidgetChild(
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1],
               Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789],
               -2048635329
            );
         ParamComposition var16 = WorldMap.getParamDefinition(var10, -269609967);
         if (ParamComposition.method4969(var16, 1902728097)) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var14.method8068(
               var10, var16.defaultStr, (byte)70
            );
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14.method8071(
               var10, -822826545 * var16.defaultInt, 167646792
            );
         }

         return 1;
      } else if (2704 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         Widget var9 = class226.widgetDefinition
            .getWidgetChild(
               Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
               -2110281615
            );
         int var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         Object var5 = class39.method651(var4, 378556180);
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Widget.method8079(var9, var6, var5, (byte)-60);
         return 1;
      } else if (2706 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1354500905 * client.rootInterface;
         return 1;
      } else if (2707 == var0) {
         Widget var8 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1506656248);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var8.method8113((byte)14) ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         Widget var7 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 900742792);
         return FriendSystem.method472(var7, 1827321971);
      } else if (2709 == var0) {
         Widget var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -2142433130);
         return class28.method532(var3, (byte)10);
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I)V")
   @ObfuscatedName("et")
   static final void method1042(Widget var0, int var1) {
      if (null == var0.field4557) {
         throw new RuntimeException();
      } else {
         if (var0.field4595 == null) {
            var0.field4595 = new int[var0.field4557.length];
         }

         var0.field4595[var1] = 1712123997;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fa")
   static int method1077(int var0, Script var1, boolean var2) {
      if (-969589992 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         class27.queueSoundEffect(
            Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
            Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
            Interpreter_intStack[2 + class408.Interpreter_intStackSize * 138517333],
            -1645689313
         );
         return 1;
      } else if (var0 == 3201) {
         class408.Interpreter_intStackSize -= -1982072966;
         int var17 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var25 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var37 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         int var57 = Interpreter_intStack[365560585 * class408.Interpreter_intStackSize + 3];
         int var62 = Interpreter_intStack[class408.Interpreter_intStackSize * -2083614165 + 4];
         ArrayList var63 = new ArrayList();
         var63.add(var17);
         KitDefinition.playSong(var63, var25, var37, var57, var62, (byte)-27);
         return 1;
      } else if (-1265228952 == var0) {
         class408.Interpreter_intStackSize -= -1775070388;
         MouseRecorder.method2642(
            Interpreter_intStack[class408.Interpreter_intStackSize * -429457989],
            Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
            -2084071294
         );
         return 1;
      } else if (var0 == -1915328138 || var0 == 1536479628 || -1717320950 == var0 || 3181 == var0 || var0 == 3203 || 1579479048 == var0 || var0 == 3207) {
         class67 var16 = class67.field1266;
         class66 var24 = class66.field477;
         int var33 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 140931678) * 327716789];
         if (var0 == 1961407478) {
            int var49 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1157478151];
            var16 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(892731113), var49, (byte)1);
            if (var16 == null) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var49));
            }
         }

         if (var0 == 3213) {
            int var50 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1617309262) * 1137797553];
            var24 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(-7603159), var50, (byte)1);
            if (null == var24) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var50));
            }
         }

         if (var0 == -2122077665) {
            int var51 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            var16 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-591007274), var51, (byte)1);
            if (null == var16) {
               var24 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(808509465), var51, (byte)1);
               if (var24 == null) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var51));
               }
            }
         } else if (3181 == var0) {
            var16 = class67.field1270;
         } else if (var0 == 1553041615) {
            var24 = class66.field480;
         } else if (3205 == var0) {
            var24 = class66.field478;
         } else if (-1338286385 == var0) {
            var24 = class66.field481;
         }

         if (class66.field477 == var24) {
            switch (var16.field1274 * 1194397097) {
               case 1:
                  ClientPreferences.method1569(class468.clientPreferences, var33 == 1, 2054761920);
                  break;
               case 2:
                  class468.clientPreferences.updateTitleMusicDisabled(1 == var33, -1639114276);
                  break;
               case 3:
                  ClientPreferences.method1591(class468.clientPreferences, var33 == 1, 1415097216);
                  break;
               case 4:
                  if (var33 < 0) {
                     var33 = 0;
                  }

                  class468.clientPreferences.updateEULA(var33, (byte)-8);
                  break;
               case 5:
                  DefaultsGroup.method11178(var33, -1768349965);
                  break;
               case 6:
                  class468.clientPreferences.method1671(1 == var33, 292730261);
                  break;
               default:
                  String var52 = String.format("Unkown device option: %s.", var16);
                  throw new RuntimeException(var52);
            }
         } else {
            switch (-128274541 * var24.field483) {
               case 1:
                  class468.clientPreferences.updateRoofsHidden(1 == var33, (short)27530);
                  break;
               case 2:
                  var33 = Math.min(Math.max(var33, 0), -1689786900);
                  int var56 = Math.round(var33 * 255 / 100.0F);
                  LoginState.setMusicVolume(var56, -398176149);
                  break;
               case 3:
                  var33 = Math.min(Math.max(var33, 0), 100);
                  int var55 = Math.round(-859296478 * var33 / 100.0F);
                  User.method10994(var55, (byte)-18);
                  break;
               case 4:
                  var33 = Math.min(Math.max(var33, 0), -2099712570);
                  int var54 = Math.round(var33 * 12915119 / 100.0F);
                  class383.method8659(var54, -218877527);
                  break;
               default:
                  String var53 = String.format("Unkown game option: %s.", var24);
                  throw new RuntimeException(var53);
            }
         }

         return 1;
      } else if (var0 == 186040044 || 3215 == var0 || var0 == -1470516101 || 3182 == var0 || -1218997426 == var0 || var0 == -1304550939 || 1140241694 == var0) {
         class67 var15 = class67.field1266;
         class66 var23 = class66.field477;
         int var31 = 0;
         if (1873305333 == var0) {
            int var41 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1853249175) * 327716789];
            var15 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(942650774), var41, (byte)1);
            if (null == var15) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var41));
            }
         }

         if (var0 == 607798226) {
            int var42 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            var23 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(42405974), var42, (byte)1);
            if (null == var23) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var42));
            }
         }

         if (var0 == 3210) {
            int var43 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1035123922) * 327716789];
            var15 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(277932796), var43, (byte)1);
            if (var15 == null) {
               var23 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(156517884), var43, (byte)1);
               if (null == var23) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var43));
               }
            }
         } else if (var0 == 357915364) {
            var15 = class67.field1270;
         } else if (var0 == -1382463175) {
            var23 = class66.field480;
         } else if (-729110192 == var0) {
            var23 = class66.field478;
         } else if (360540544 == var0) {
            var23 = class66.field481;
         }

         if (var23 == class66.field477) {
            switch (var15.field1274 * 1194397097) {
               case 1:
                  var31 = ClientPreferences.method1560(class468.clientPreferences, -2146203742) ? 1 : 0;
                  break;
               case 2:
                  var31 = class468.clientPreferences.isTitleMusicDisabled(1016596152) ? 1 : 0;
                  break;
               case 3:
                  var31 = class468.clientPreferences.isDisplayingFps(756705879) ? 1 : 0;
                  break;
               case 4:
                  var31 = class468.clientPreferences.method1595(937096097);
                  break;
               case 5:
                  var31 = ApproximateRouteStrategy.method383((byte)14);
                  break;
               case 6:
                  var31 = class468.clientPreferences.method1669(-1171752513) ? 1 : 0;
                  break;
               default:
                  String var44 = String.format("Unkown device option: %s.", var15);
                  throw new RuntimeException(var44);
            }
         } else {
            switch (var23.field483 * 1002545705) {
               case 1:
                  var31 = class468.clientPreferences.isRoofsHidden(1353807147) ? 1 : 0;
                  break;
               case 2:
                  int var48 = class468.clientPreferences.getMusicVolume((byte)6);
                  var31 = Math.round(100 * var48 / 255.0F);
                  break;
               case 3:
                  int var47 = ClientPreferences.method1620(class468.clientPreferences, -1440435870);
                  var31 = Math.round(108566672 * var47 / 127.0F);
                  break;
               case 4:
                  int var46 = ClientPreferences.method1623(class468.clientPreferences, (byte)0);
                  var31 = Math.round(var46 * -247364387 / 127.0F);
                  break;
               default:
                  String var45 = String.format("Unkown game option: %s.", var23);
                  throw new RuntimeException(var45);
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var31;
         return 1;
      } else if (var0 == 837492167) {
         return 1;
      } else if (3216 == var0) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -365334525) * 327716789];
         int var22 = 0;
         class67 var30 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-498687241), var14, (byte)1);
         if (var30 != null) {
            var22 = var30 != class67.field1266 ? 1 : 0;
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var22;
         return 1;
      } else if (3218 == var0) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -2025972243) * -390347969];
         int var21 = 0;
         class66 var29 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(473464699), var13, (byte)1);
         if (var29 != null) {
            var21 = class66.field477 != var29 ? 1 : 0;
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1620948294) * 1387118460 - 1] = var21;
         return 1;
      } else if (var0 == 1494738543 || var0 == -1662361406) {
         class67 var12 = class67.field1266;
         class66 var20 = class66.field477;
         byte var27 = -1;
         int var39 = -1;
         if (-31053629 == var0) {
            int var58 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1767167507];
            var12 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-1020668992), var58, (byte)1);
            if (null == var12) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var58));
            }
         }

         if (var0 == -2130938691) {
            int var59 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 422097700];
            var20 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(525902004), var59, (byte)1);
            if (var20 == null) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var59));
            }
         }

         if (var20 == class66.field477) {
            switch (142567766 * var12.field1274) {
               case 1:
               case 2:
               case 3:
                  var27 = 0;
                  var39 = 1;
                  break;
               case 4:
                  var27 = 0;
                  var39 = Integer.MAX_VALUE;
                  break;
               case 5:
                  var27 = 0;
                  var39 = 100;
                  break;
               default:
                  String var60 = String.format("Unkown device option: %s.", var12);
                  throw new RuntimeException(var60);
            }
         } else {
            switch (1002545705 * var20.field483) {
               case 1:
                  var27 = 0;
                  var39 = 1;
                  break;
               case 2:
               case 3:
               case 4:
                  var27 = 0;
                  var39 = 100;
                  break;
               default:
                  String var61 = String.format("Unkown game option: %s.", var20);
                  throw new RuntimeException(var61);
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += 1995622632) * 1163306714 - 1] = var27;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1013750645 - 1] = var39;
         return 1;
      } else if (var0 == 2134348184) {
         class408.Interpreter_intStackSize -= 1629749666;
         int var11 = Interpreter_intStack[1945180546 * class408.Interpreter_intStackSize];
         int var19 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         classGK.method4244(var11, var19, 2032637855);
         return 1;
      } else if (var0 == 3221) {
         class408.Interpreter_intStackSize -= 2126178222;
         int var10 = Interpreter_intStack[-1280180519 * class408.Interpreter_intStackSize];
         int var18 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var26 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 524458481];
         int var38 = Interpreter_intStack[3 + -94718550 * class408.Interpreter_intStackSize];
         int var7 = Interpreter_intStack[4 + 327716789 * class408.Interpreter_intStackSize];
         int var8 = Interpreter_intStack[5 + class408.Interpreter_intStackSize * 327716789];
         ArrayList var9 = new ArrayList();
         var9.add(var10);
         var9.add(var18);
         KitDefinition.playSong(var9, var26, var38, var7, var8, (byte)-68);
         return 1;
      } else if (var0 == 3222) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var3 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var4 = Interpreter_intStack[-685541805 * class408.Interpreter_intStackSize + 1];
         int var5 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         int var6 = Interpreter_intStack[3 + -1094600870 * class408.Interpreter_intStackSize];
         class182.method4489(var3, var4, var5, var6, 261830680);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fc")
   static int method1078(int var0, Script var1, boolean var2) {
      if (3200 == var0) {
         class408.Interpreter_intStackSize -= 2040201929;
         class27.queueSoundEffect(
            Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
            Interpreter_intStack[1 + -365665738 * class408.Interpreter_intStackSize],
            Interpreter_intStack[2 + class408.Interpreter_intStackSize * -167138427],
            -1645689313
         );
         return 1;
      } else if (var0 == -767587807) {
         class408.Interpreter_intStackSize -= -718227712;
         int var17 = Interpreter_intStack[234983862 * class408.Interpreter_intStackSize];
         int var25 = Interpreter_intStack[1 + 1462797014 * class408.Interpreter_intStackSize];
         int var37 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         int var57 = Interpreter_intStack[417209784 * class408.Interpreter_intStackSize + 3];
         int var62 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 4];
         ArrayList var63 = new ArrayList();
         var63.add(var17);
         KitDefinition.playSong(var63, var25, var37, var57, var62, (byte)-68);
         return 1;
      } else if (1710016534 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         MouseRecorder.method2642(
            Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
            Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
            -2084071294
         );
         return 1;
      } else if (var0 == 201509827 || var0 == -1466496469 || 3209 == var0 || 1798178950 == var0 || var0 == 1224029530 || 264458992 == var0 || var0 == 3207) {
         class67 var16 = class67.field1266;
         class66 var24 = class66.field477;
         int var33 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1289351049) * 1823868832];
         if (var0 == 3212) {
            int var49 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1308965480];
            var16 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-1562418293), var49, (byte)1);
            if (var16 == null) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var49));
            }
         }

         if (var0 == -301395790) {
            int var50 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1858716656];
            var24 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(454680354), var50, (byte)1);
            if (null == var24) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var50));
            }
         }

         if (var0 == 2021813333) {
            int var51 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 790991142) * -1721770644];
            var16 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(579317359), var51, (byte)1);
            if (null == var16) {
               var24 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(1975501115), var51, (byte)1);
               if (var24 == null) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var51));
               }
            }
         } else if (-402091819 == var0) {
            var16 = class67.field1270;
         } else if (var0 == 1819309017) {
            var24 = class66.field480;
         } else if (1730642445 == var0) {
            var24 = class66.field478;
         } else if (1377049951 == var0) {
            var24 = class66.field481;
         }

         if (class66.field477 == var24) {
            switch (var16.field1274 * -2117069257) {
               case 1:
                  ClientPreferences.method1569(class468.clientPreferences, var33 == 1, 1404821752);
                  break;
               case 2:
                  class468.clientPreferences.updateTitleMusicDisabled(1 == var33, 362776957);
                  break;
               case 3:
                  ClientPreferences.method1591(class468.clientPreferences, var33 == 1, -864514551);
                  break;
               case 4:
                  if (var33 < 0) {
                     var33 = 0;
                  }

                  class468.clientPreferences.updateEULA(var33, (byte)-66);
                  break;
               case 5:
                  DefaultsGroup.method11178(var33, -1825371444);
                  break;
               case 6:
                  class468.clientPreferences.method1671(1 == var33, 53396571);
                  break;
               default:
                  String var52 = String.format("Unkown device option: %s.", var16);
                  throw new RuntimeException(var52);
            }
         } else {
            switch (1002545705 * var24.field483) {
               case 1:
                  class468.clientPreferences.updateRoofsHidden(1 == var33, (short)28311);
                  break;
               case 2:
                  var33 = Math.min(Math.max(var33, 0), 100);
                  int var56 = Math.round(var33 * 255 / 100.0F);
                  LoginState.setMusicVolume(var56, 1190090676);
                  break;
               case 3:
                  var33 = Math.min(Math.max(var33, 0), 2050832813);
                  int var55 = Math.round(127 * var33 / 100.0F);
                  User.method10994(var55, (byte)-12);
                  break;
               case 4:
                  var33 = Math.min(Math.max(var33, 0), 100);
                  int var54 = Math.round(var33 * 127 / 100.0F);
                  class383.method8659(var54, 579601628);
                  break;
               default:
                  String var53 = String.format("Unkown game option: %s.", var24);
                  throw new RuntimeException(var53);
            }
         }

         return 1;
      } else if (var0 == 3214 || 1323598647 == var0 || var0 == -1009367041 || -1969440942 == var0 || 3204 == var0 || var0 == 3206 || 3208 == var0) {
         class67 var15 = class67.field1266;
         class66 var23 = class66.field477;
         int var31 = 0;
         if (-1417050964 == var0) {
            int var41 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 342733691) * 327716789];
            var15 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-1159268875), var41, (byte)1);
            if (null == var15) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var41));
            }
         }

         if (var0 == 3215) {
            int var42 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1104433170];
            var23 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(2000484825), var42, (byte)1);
            if (null == var23) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var42));
            }
         }

         if (var0 == 3210) {
            int var43 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            var15 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(1153915434), var43, (byte)1);
            if (var15 == null) {
               var23 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(1314909157), var43, (byte)1);
               if (null == var23) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var43));
               }
            }
         } else if (var0 == -1729178710) {
            var15 = class67.field1270;
         } else if (var0 == -186944458) {
            var23 = class66.field480;
         } else if (3206 == var0) {
            var23 = class66.field478;
         } else if (3208 == var0) {
            var23 = class66.field481;
         }

         if (var23 == class66.field477) {
            switch (var15.field1274 * 1350069141) {
               case 1:
                  var31 = ClientPreferences.method1560(class468.clientPreferences, -603282527) ? 1 : 0;
                  break;
               case 2:
                  var31 = class468.clientPreferences.isTitleMusicDisabled(1286637702) ? 1 : 0;
                  break;
               case 3:
                  var31 = class468.clientPreferences.isDisplayingFps(756705879) ? 1 : 0;
                  break;
               case 4:
                  var31 = class468.clientPreferences.method1595(919109131);
                  break;
               case 5:
                  var31 = ApproximateRouteStrategy.method383((byte)95);
                  break;
               case 6:
                  var31 = class468.clientPreferences.method1669(-1171752513) ? 1 : 0;
                  break;
               default:
                  String var44 = String.format("Unkown device option: %s.", var15);
                  throw new RuntimeException(var44);
            }
         } else {
            switch (var23.field483 * -1895682994) {
               case 1:
                  var31 = class468.clientPreferences.isRoofsHidden(1829442714) ? 1 : 0;
                  break;
               case 2:
                  int var48 = class468.clientPreferences.getMusicVolume((byte)6);
                  var31 = Math.round(100 * var48 / 255.0F);
                  break;
               case 3:
                  int var47 = ClientPreferences.method1620(class468.clientPreferences, 486922261);
                  var31 = Math.round(692971123 * var47 / 127.0F);
                  break;
               case 4:
                  int var46 = ClientPreferences.method1623(class468.clientPreferences, (byte)0);
                  var31 = Math.round(var46 * -1475824901 / 127.0F);
                  break;
               default:
                  String var45 = String.format("Unkown game option: %s.", var23);
                  throw new RuntimeException(var45);
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -35088157) * -393565449 - 1] = var31;
         return 1;
      } else if (var0 == -185125638) {
         return 1;
      } else if (707058957 == var0) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var22 = 0;
         class67 var30 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-539880300), var14, (byte)1);
         if (var30 != null) {
            var22 = var30 != class67.field1266 ? 1 : 0;
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -108477767 - 1] = var22;
         return 1;
      } else if (50152168 == var0) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -327781370) * -1990559778];
         int var21 = 0;
         class66 var29 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(-103754492), var13, (byte)1);
         if (var29 != null) {
            var21 = class66.field477 != var29 ? 1 : 0;
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -135551170) * -839269065 - 1] = var21;
         return 1;
      } else if (var0 == 3217 || var0 == -785265654) {
         class67 var12 = class67.field1266;
         class66 var20 = class66.field477;
         byte var27 = -1;
         int var39 = -1;
         if (3217 == var0) {
            int var58 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            var12 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method381(-765006097), var58, (byte)1);
            if (null == var12) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var58));
            }
         }

         if (var0 == 3219) {
            int var59 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1417297325];
            var20 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method9138(407767798), var59, (byte)1);
            if (var20 == null) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var59));
            }
         }

         if (var20 == class66.field477) {
            switch (1194397097 * var12.field1274) {
               case 1:
               case 2:
               case 3:
                  var27 = 0;
                  var39 = 1;
                  break;
               case 4:
                  var27 = 0;
                  var39 = Integer.MAX_VALUE;
                  break;
               case 5:
                  var27 = 0;
                  var39 = 369358702;
                  break;
               default:
                  String var60 = String.format("Unkown device option: %s.", var12);
                  throw new RuntimeException(var60);
            }
         } else {
            switch (-1249545607 * var20.field483) {
               case 1:
                  var27 = 0;
                  var39 = 1;
                  break;
               case 2:
               case 3:
               case 4:
                  var27 = 0;
                  var39 = 100;
                  break;
               default:
                  String var61 = String.format("Unkown game option: %s.", var20);
                  throw new RuntimeException(var61);
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 20443545 - 1] = var27;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1418649364) * 327716789 - 1] = var39;
         return 1;
      } else if (var0 == 3220) {
         class408.Interpreter_intStackSize -= 890911813;
         int var11 = Interpreter_intStack[905233433 * class408.Interpreter_intStackSize];
         int var19 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         classGK.method4244(var11, var19, 1242585450);
         return 1;
      } else if (var0 == 750087135) {
         class408.Interpreter_intStackSize -= 2126178222;
         int var10 = Interpreter_intStack[-1856159618 * class408.Interpreter_intStackSize];
         int var18 = Interpreter_intStack[1 + -663737014 * class408.Interpreter_intStackSize];
         int var26 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * -997418725];
         int var38 = Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
         int var7 = Interpreter_intStack[4 + -629294669 * class408.Interpreter_intStackSize];
         int var8 = Interpreter_intStack[5 + class408.Interpreter_intStackSize * 327716789];
         ArrayList var9 = new ArrayList();
         var9.add(var10);
         var9.add(var18);
         KitDefinition.playSong(var9, var26, var38, var7, var8, (byte)-87);
         return 1;
      } else if (var0 == 3222) {
         class408.Interpreter_intStackSize -= -238507027;
         int var3 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         int var5 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         int var6 = Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
         class182.method4489(var3, var4, var5, var6, 261830680);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fr")
   static int method1080(int var0, Script var1, boolean var2) {
      if (3300 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1759706017 * client.cycle;
         return 1;
      } else if (var0 == 3301) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var31 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOfferTotalQuantityComparator.method9178(
            var23, var31, 2029939227
         );
         return 1;
      } else if (var0 == 3302) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var30 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class209.ItemContainer_getCount(var22, var30, 1148857744);
         return 1;
      } else if (3303 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var29 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class320.method7362(var21, var29, 1876982269);
         return 1;
      } else if (3304 == var0) {
         int var20 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WallDecoration.getInvDefinition(var20, -1518465881).size
            * -882743441;
         return 1;
      } else if (var0 == 3305) {
         int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.currentLevels[var19];
         return 1;
      } else if (3306 == var0) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.levels[var18];
         return 1;
      } else if (3307 == var0) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.experience[var17];
         return 1;
      } else if (3308 == var0) {
         int var16 = 2115028565 * Occluder.topLevelWorldView.plane;
         int var28 = (class330.localPlayer.x * 340712311 >> 7) + 825809917 * Occluder.topLevelWorldView.baseX;
         int var32 = (class330.localPlayer.y * -1747310679 >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8286(var16, var28, var32, (byte)49);
         return 1;
      } else if (var0 == 3309) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8292(var15, 936521183);
         return 1;
      } else if (3310 == var0) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8288(var14, -1605648849);
         return 1;
      } else if (var0 == 3311) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8294(var13, 1346086770);
         return 1;
      } else if (var0 == 3312) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.isMembersWorld ? 1 : 0;
         return 1;
      } else if (var0 == 3313) {
         class408.Interpreter_intStackSize -= 708726074;
         int var12 = 32768 + Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var27 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOfferTotalQuantityComparator.method9178(
            var12, var27, 2007992530
         );
         return 1;
      } else if (var0 == 3314) {
         class408.Interpreter_intStackSize -= 708726074;
         int var11 = 32768 + Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var26 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class209.ItemContainer_getCount(var11, var26, 1148857744);
         return 1;
      } else if (3315 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var10 = 32768 + Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var25 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class320.method7362(var10, var25, 1876982269);
         return 1;
      } else if (var0 == 3316) {
         if (427594063 * client.staffModLevel >= 2) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 427594063 * client.staffModLevel;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (3317 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 257591815 * client.rebootTimer;
         return 1;
      } else if (var0 == 3318) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1312022025 * client.worldId;
         return 1;
      } else if (3321 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.runEnergy * -1850849067 / 100;
         return 1;
      } else if (3322 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -17542531 * client.weight;
         return 1;
      } else if (var0 == 3323) {
         if (client.playerMod) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (3324 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1330094789 * client.worldProperties;
         return 1;
      } else if (3325 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var9 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var24 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         int var5 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         int var6 = Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789];
         int var7 = Coord.method8286(var5, var24, var6, (byte)-47);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var9 + var7;
         return 1;
      } else if (3326 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field722 * -2071788461;
         return 1;
      } else if (var0 == 3327) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field723 * -1318930041;
         return 1;
      } else if (var0 == 3331) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.runEnergy * -1850849067;
         return 1;
      } else if (3332 == var0) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field682[var8];
         return 1;
      } else if (var0 == 3333) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = client.field673;
         return 1;
      } else if (var0 == 3339) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (-1 == var3) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         } else {
            WorldEntityConfig var4 = WorldMapRegion.method6991(var3, (byte)-14);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4 == null ? "" : var4.field2378;
         }

         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("do")
   static int method1026(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         var3 = class226.widgetDefinition.method7953(var4, 1893578126);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      if (1000 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         var3.rawX = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -1005032755;
         var3.rawY = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] * -752065015;
         var3.xAlignment = -1747850943 * Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         var3.yAlignment = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 3] * -1356647925;
         class376.invalidateWidget(var3, (byte)5);
         SecureUrlRequester.client.alignWidget(var3, 580200628);
         if (928687775 * var3.type == 0) {
            Widget[] var7 = -1 == 2077538819 * var3.childIndex
               ? class226.widgetDefinition.Widget_interfaceComponents[278777747 * var3.id >> 16]
               : class226.widgetDefinition.method7953(var3.parentId * 794900977, -2090253218).children;
            class339.revalidateWidgetScroll(var7, var3, false, -952579553);
         }

         return 1;
      } else if (var0 == 1001) {
         class408.Interpreter_intStackSize -= 1417452148;
         var3.rawWidth = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * 1403700735;
         var3.rawHeight = 449174585 * Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         var3.widthAlignment = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2] * -1384270729;
         var3.heightAlignment = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 3] * -500921095;
         class376.invalidateWidget(var3, (byte)5);
         SecureUrlRequester.client.alignWidget(var3, -58136810);
         if (var3.type * 928687775 == 0) {
            Widget[] var6 = 2077538819 * var3.childIndex == -1
               ? class226.widgetDefinition.Widget_interfaceComponents[var3.id * 278777747 >> 16]
               : class226.widgetDefinition.method7953(var3.parentId * 794900977, 208302085).children;
            class339.revalidateWidgetScroll(var6, var3, false, -1263704119);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (var5 != var3.isHidden) {
            var3.isHidden = var5;
            class376.invalidateWidget(var3, (byte)5);
         }

         return 1;
      } else if (var0 == 1005) {
         var3.noClickThrough = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else if (1006 == var0) {
         var3.noScrollThrough = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gu")
   static int method1081(int var0, Script var1, boolean var2) {
      if (var0 == -754245134) {
         class408.Interpreter_intStackSize -= 708726074;
         int var10 = Interpreter_intStack[class408.Interpreter_intStackSize * -1430463088];
         int var12 = Interpreter_intStack[1887086395 * class408.Interpreter_intStackSize + 1];
         EnumComposition var13 = class108.getEnum(var10, 5477762);
         if (1167844886 != var13.inputType) {
         }

         for (int var14 = 0; var14 < -1248439723 * var13.outputCount; var14++) {
            if (var12 == var13.keys[var14]) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var13.strVals[var14];
               var13 = null;
               break;
            }
         }

         if (null != var13) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1156998787) * -1595015587 - 1] = var13.defaultStr;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            int var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1062501965) * 327716789];
            EnumComposition var11 = class108.getEnum(var9, -1674259556);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1809642291) * 1396585375 - 1] = EnumComposition.method4460(var11, -1989282858);
            return 1;
         } else {
            return 2;
         }
      } else {
         class408.Interpreter_intStackSize -= -1024479274;
         int var3 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var4 = Interpreter_intStack[1 + -1258654280 * class408.Interpreter_intStackSize];
         int var5 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         int var6 = Interpreter_intStack[3 + class408.Interpreter_intStackSize * 1191900263];
         EnumComposition var7 = class108.getEnum(var5, 374512223);
         if (var7.outputType == var3 && var4 == var7.inputType) {
            for (int var8 = 0; var8 < -1673153089 * var7.outputCount; var8++) {
               if (var6 == var7.keys[var8]) {
                  if (var4 == -408082209) {
                     Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1753867978) * -1623926611 - 1] = var7.strVals[var8];
                  } else {
                     Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7.intVals[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if (null != var7) {
               if (115 == var4) {
                  Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var7.defaultStr;
               } else {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 376853926) * 327716789 - 1] = var7.defaultInt * 1780171489;
               }
            }

            return 1;
         } else {
            if (var4 == 115) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1046654224 - 1] = Strings.field4861;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("fo")
   static Object[] method1069() {
      String var0 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
      Object[] var1 = new Object[var0.length()];

      for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
         if (var0.charAt(var2) == 'i') {
            var1[var2] = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         } else {
            var1[var2] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gf")
   static int method1083(int var0, Script var1, boolean var2) {
      if (var0 == -984504913) {
         int var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1163092229) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = IndexCheck.method6514(client.indexCheck, var5, (short)1337)
            ? 1
            : 0;
         return 1;
      } else if (779393753 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -91339066) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1163707936) * 327716789 - 1] = client.indexCheck.method6513(var4, -1560214304) ? 1 : 0;
         return 1;
      } else if (-863186023 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -422630672];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1161173999 - 1] = client.indexCheck.method6517(var3, 1072094090) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gd")
   static int method1084(int var0, Script var1, boolean var2) {
      if (3600 == var0) {
         if (0 == 636276089 * class320.friendSystem.field123) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 458282143;
         } else if (1 == 606208503 * class320.friendSystem.field123) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -728588128) * 1766161989 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -517113171 - 1] = UserList.method10669(
               class320.friendSystem.friendsList, 922241607
            );
         }

         return 1;
      } else if (3601 == var0) {
         int var48 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1870741475];
         if (class320.friendSystem.method427(-565226316) && var48 >= 0 && var48 < UserList.method10669(class320.friendSystem.friendsList, 836077887)) {
            Friend var51 = (Friend)class320.friendSystem.friendsList.get(var48, -83881440);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -781482757 - 1] = User.method10984(var51, (byte)-12);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = User.method10986(var51, -52147986);
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -2086116569) * -747526838 - 1] = "";
         }

         return 1;
      } else if (var0 == 3602) {
         int var47 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -428987462];
         if (class320.friendSystem.method427(706066898) && var47 >= 0 && var47 < UserList.method10669(class320.friendSystem.friendsList, 1936874936)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((Buddy)class320.friendSystem
                     .friendsList
                     .get(var47, -1123658115))
                  .world
               * -58048586;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1210775220) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 315130933) {
         int var46 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (class320.friendSystem.method427(479397556) && var46 >= 0 && var46 < UserList.method10669(class320.friendSystem.friendsList, -755980521)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1026541144) * -142402566 - 1] = ((Buddy)class320.friendSystem
                     .friendsList
                     .get(var46, -91216225))
                  .rank
               * 736731006;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 724057426) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 449728081) {
         String var45 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1551668016) * -1095917366];
         int var50 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -98764459];
         Clock.method6212(var45, var50, 1527296132);
         return 1;
      } else if (var0 == 3605) {
         String var44 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class320.friendSystem.addFriend(var44, -2127795706);
         return 1;
      } else if (var0 == 3606) {
         String var43 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 254323427) * -1069863975];
         FriendSystem.method460(class320.friendSystem, var43, 831964661);
         return 1;
      } else if (var0 == -605764008) {
         String var42 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class320.friendSystem.addIgnore(var42, 762348742);
         return 1;
      } else if (3608 == var0) {
         String var41 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -501934474) * -1595015587];
         boolean var49 = true;
         class320.friendSystem.removeIgnore(var41, var49, 1072179091);
         return 1;
      } else if (1556789399 == var0) {
         String var39 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1839979674) * 66261896];
         var39 = class117.method3814(var39, -509999577);
         Interpreter_intStack[(class408.Interpreter_intStackSize += 660959344) * 327716789 - 1] = class320.friendSystem
               .isFriended(new Username(var39, LoginScreenAnimation.loginType), false, -1640197228)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 3611) {
         if (null != BuddyRankComparator.friendsChat) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 272250064 - 1] = BuddyRankComparator.friendsChat.name;
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -2083124759) * 1128713469 - 1] = "";
         }

         return 1;
      } else if (var0 == 3612) {
         if (null != BuddyRankComparator.friendsChat) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1676633963 - 1] = UserList.method10669(
               BuddyRankComparator.friendsChat, 1960358153
            );
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1025178944) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3613) {
         int var38 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1500179048];
         if (BuddyRankComparator.friendsChat != null && var38 < UserList.method10669(BuddyRankComparator.friendsChat, -580516197)) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1826160723) * -1595015587 - 1] = Username.method12702(
               BuddyRankComparator.friendsChat.get(var38, -861499848).getUsername((byte)-111), (byte)-84
            );
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 178192350) * -1546354732 - 1] = "";
         }

         return 1;
      } else if (3614 == var0) {
         int var37 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (null != BuddyRankComparator.friendsChat && var37 < UserList.method10669(BuddyRankComparator.friendsChat, 1043927331)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 602064188 - 1] = ((Buddy)BuddyRankComparator.friendsChat
                  .get(var37, 2054298129))
               .getWorld(648822277);
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1621278006) * 1672106446 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3615) {
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1832735114];
         if (BuddyRankComparator.friendsChat != null && var36 < UserList.method10669(BuddyRankComparator.friendsChat, 1238758004)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 637200328 - 1] = ((Buddy)BuddyRankComparator.friendsChat
                     .get(var36, -1717040237))
                  .rank
               * -1755333114;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -249044213 - 1] = 0;
         }

         return 1;
      } else if (var0 == 643893355) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != BuddyRankComparator.friendsChat
            ? BuddyRankComparator.friendsChat.minKick
            : 0;
         return 1;
      } else if (var0 == 3617) {
         String var35 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class57.clanKickUser(var35, (byte)3);
         return 1;
      } else if (3618 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1151602483 - 1] = null != BuddyRankComparator.friendsChat
            ? BuddyRankComparator.friendsChat.rank * -44662875
            : 0;
         return 1;
      } else if (3619 == var0) {
         String var34 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 821754477) * 748868366];
         IntProjection.Clan_joinChat(var34, -1148409527);
         return 1;
      } else if (-398384118 == var0) {
         class195.Clan_leaveChat(395110140);
         return 1;
      } else if (-289142596 == var0) {
         if (!class320.friendSystem.method427(-1602227476)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -806953158 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -338795548) * 546104424 - 1] = UserList.method10669(
               class320.friendSystem.ignoreList, -2111659218
            );
         }

         return 1;
      } else if (3622 == var0) {
         int var33 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1016263763) * 327716789];
         if (class320.friendSystem.method427(1916818321) && var33 >= 0 && var33 < UserList.method10669(class320.friendSystem.ignoreList, 1136664232)) {
            Ignored var4 = (Ignored)class320.friendSystem.ignoreList.get(var33, -129484565);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -427585755) * -1595015587 - 1] = User.method10984(var4, (byte)-38);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1144903722 - 1] = User.method10986(var4, -1233811899);
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1829479428 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 428948474 - 1] = "";
         }

         return 1;
      } else if (-1314255462 == var0) {
         String var31 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 396460255) * -1595015587];
         var31 = class117.method3814(var31, 1052116977);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -204731768 - 1] = FriendSystem.method443(
               class320.friendSystem, new Username(var31, LoginScreenAnimation.loginType), (byte)42
            )
            ? 1
            : 0;
         return 1;
      } else if (3624 == var0) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 830799313];
         if (null != BuddyRankComparator.friendsChat
            && var30 < UserList.method10669(BuddyRankComparator.friendsChat, 1128566552)
            && BuddyRankComparator.friendsChat.get(var30, -1062283464).getUsername((byte)-100).equals(class330.localPlayer.username)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 258650622) * 522791014 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2107849701) {
         if (BuddyRankComparator.friendsChat != null && BuddyRankComparator.friendsChat.owner != null) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 946446418) * 103773534 - 1] = BuddyRankComparator.friendsChat.owner;
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1965683038) * -36516470 - 1] = "";
         }

         return 1;
      } else if (var0 == -970651090) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 759378192) * 516853188];
         if (BuddyRankComparator.friendsChat != null
            && var29 < UserList.method10669(BuddyRankComparator.friendsChat, 1933655472)
            && ((ClanMate)BuddyRankComparator.friendsChat.get(var29, -290015856)).isFriend((byte)-60)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 2088621717 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -706269700) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 != 2010829076) {
         if (3628 == var0) {
            class320.friendSystem.friendsList.removeComparator((byte)87);
            return 1;
         } else if (-1105019723 == var0) {
            boolean var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -969016463) * -344133827] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator1(var28), (byte)24);
            return 1;
         } else if (var0 == 3630) {
            boolean var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator2(var27), (byte)27);
            return 1;
         } else if (var0 == -1922947791) {
            boolean var26 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -216197654] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator3(var26), (byte)3);
            return 1;
         } else if (var0 == 3632) {
            boolean var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 194548447) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator4(var25), (byte)28);
            return 1;
         } else if (1566650691 == var0) {
            boolean var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -598659569) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator5(var24), (byte)91);
            return 1;
         } else if (var0 == 1389567330) {
            boolean var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1902702594) * -1283170453] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator6(var23), (byte)57);
            return 1;
         } else if (1888390804 == var0) {
            boolean var22 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator7(var22), (byte)51);
            return 1;
         } else if (3636 == var0) {
            boolean var21 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator8(var21), (byte)55);
            return 1;
         } else if (3637 == var0) {
            boolean var20 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1422858668) * -207943552] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator9(var20), (byte)19);
            return 1;
         } else if (-629369838 == var0) {
            boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 842107756) * -1940296678] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator10(var19), (byte)51);
            return 1;
         } else if (var0 == -1896549428) {
            class320.friendSystem.friendsList.sort((byte)82);
            return 1;
         } else if (var0 == -480012289) {
            class320.friendSystem.ignoreList.removeComparator((byte)62);
            return 1;
         } else if (3641 == var0) {
            boolean var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 20869235) * -1781676978] == 1;
            UserList.method10734(class320.friendSystem.ignoreList, new UserComparator1(var18), (byte)50);
            return 1;
         } else if (var0 == -1005701594) {
            boolean var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.ignoreList, new UserComparator2(var17), (byte)81);
            return 1;
         } else if (var0 == 964976944) {
            class320.friendSystem.ignoreList.sort((byte)85);
            return 1;
         } else if (-1190636575 == var0) {
            if (null != BuddyRankComparator.friendsChat) {
               BuddyRankComparator.friendsChat.removeComparator((byte)118);
            }

            return 1;
         } else if (3645 == var0) {
            boolean var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1115079123) * -458295895] == 1;
            if (BuddyRankComparator.friendsChat != null) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator1(var16), (byte)123);
            }

            return 1;
         } else if (var0 == -788894736) {
            boolean var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -441836909) * 327716789] == 1;
            if (BuddyRankComparator.friendsChat != null) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator2(var15), (byte)64);
            }

            return 1;
         } else if (var0 == 1654588707) {
            boolean var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            if (BuddyRankComparator.friendsChat != null) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator3(var14), (byte)10);
            }

            return 1;
         } else if (var0 == -1686772047) {
            boolean var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator4(var13), (byte)78);
            }

            return 1;
         } else if (-67397661 == var0) {
            boolean var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 602972279] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator5(var12), (byte)36);
            }

            return 1;
         } else if (259559084 == var0) {
            boolean var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator6(var11), (byte)78);
            }

            return 1;
         } else if (var0 == -1160425136) {
            boolean var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator7(var10), (byte)10);
            }

            return 1;
         } else if (var0 == -1256095809) {
            boolean var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            if (BuddyRankComparator.friendsChat != null) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator8(var9), (byte)88);
            }

            return 1;
         } else if (3653 == var0) {
            boolean var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1029247417) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator9(var8), (byte)119);
            }

            return 1;
         } else if (var0 == 3654) {
            boolean var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 2007055668) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator10(var7), (byte)44);
            }

            return 1;
         } else if (var0 == 3655) {
            if (null != BuddyRankComparator.friendsChat) {
               BuddyRankComparator.friendsChat.sort((byte)94);
            }

            return 1;
         } else if (var0 == 693686171) {
            boolean var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -614649308) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new BuddyRankComparator(var6), (byte)91);
            return 1;
         } else if (var0 == -69943847) {
            boolean var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1581355046) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new BuddyRankComparator(var5), (byte)22);
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 555190066) * 1262421659];
         if (null != BuddyRankComparator.friendsChat
            && var3 < UserList.method10669(BuddyRankComparator.friendsChat, -1593654487)
            && ((ClanMate)BuddyRankComparator.friendsChat.get(var3, -1031708574)).isIgnored(-2012861431)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1980178381 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("go")
   static int method1085(int var0, Script var1, boolean var2) {
      if (-1915596395 == var0) {
         if (0 == 636276089 * class320.friendSystem.field123) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 916311662) * 327716789 - 1] = -2;
         } else if (1 == -2104712327 * class320.friendSystem.field123) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 572344151) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = UserList.method10669(
               class320.friendSystem.friendsList, 1270535815
            );
         }

         return 1;
      } else if (-1166952914 == var0) {
         int var48 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (class320.friendSystem.method427(1400646167) && var48 >= 0 && var48 < UserList.method10669(class320.friendSystem.friendsList, 782852241)) {
            Friend var51 = (Friend)class320.friendSystem.friendsList.get(var48, 752844249);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -149076662 - 1] = User.method10984(var51, (byte)13);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 27928114) * -170218625 - 1] = User.method10986(var51, -406205925);
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1391565732) * 147485225 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1741709015) * -298500082 - 1] = "";
         }

         return 1;
      } else if (var0 == 3602) {
         int var47 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -2013277526) * 1266956081];
         if (class320.friendSystem.method427(-869574208) && var47 >= 0 && var47 < UserList.method10669(class320.friendSystem.friendsList, -936875080)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1958413396) * 327716789 - 1] = ((Buddy)class320.friendSystem
                     .friendsList
                     .get(var47, 304788716))
                  .world
               * 1914416777;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -437004718 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3603) {
         int var46 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1230870608) * 327716789];
         if (class320.friendSystem.method427(-240551996) && var46 >= 0 && var46 < UserList.method10669(class320.friendSystem.friendsList, 1809867002)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -532681483) * 327716789 - 1] = ((Buddy)class320.friendSystem
                     .friendsList
                     .get(var46, 1050401192))
                  .rank
               * 91500301;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -140975452) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1744117246) {
         String var45 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         int var50 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1638339417) * 327716789];
         Clock.method6212(var45, var50, 221050589);
         return 1;
      } else if (var0 == 3605) {
         String var44 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1129271056) * -1595015587];
         class320.friendSystem.addFriend(var44, -2063000263);
         return 1;
      } else if (var0 == -1335266926) {
         String var43 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 947991339) * -152958493];
         FriendSystem.method460(class320.friendSystem, var43, 831964661);
         return 1;
      } else if (var0 == 3607) {
         String var42 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 53569218) * -1595015587];
         class320.friendSystem.addIgnore(var42, 1871070936);
         return 1;
      } else if (3608 == var0) {
         String var41 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1693455508) * -1357380393];
         boolean var49 = true;
         class320.friendSystem.removeIgnore(var41, var49, -437103087);
         return 1;
      } else if (-290994354 == var0) {
         String var39 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1280591667) * -1595015587];
         var39 = class117.method3814(var39, -1853747723);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class320.friendSystem
               .isFriended(new Username(var39, LoginScreenAnimation.loginType), false, 1624495531)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 3611) {
         if (null != BuddyRankComparator.friendsChat) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -2135193917) * -858017496 - 1] = BuddyRankComparator.friendsChat.name;
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1902414707 - 1] = "";
         }

         return 1;
      } else if (var0 == -1548440292) {
         if (null != BuddyRankComparator.friendsChat) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = UserList.method10669(
               BuddyRankComparator.friendsChat, -1392114833
            );
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 795998139) * -1508328258 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3613) {
         int var38 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (BuddyRankComparator.friendsChat != null && var38 < UserList.method10669(BuddyRankComparator.friendsChat, 327812374)) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1530040471) * -1595015587 - 1] = Username.method12702(
               BuddyRankComparator.friendsChat.get(var38, -892458396).getUsername((byte)-35), (byte)-51
            );
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         }

         return 1;
      } else if (3614 == var0) {
         int var37 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -952841556) * -1199575106];
         if (null != BuddyRankComparator.friendsChat && var37 < UserList.method10669(BuddyRankComparator.friendsChat, 1205674120)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1237851845) * 327716789 - 1] = ((Buddy)BuddyRankComparator.friendsChat
                  .get(var37, -353934727))
               .getWorld(-2057662456);
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 201019928 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3615) {
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1536308857) * -1393743054];
         if (BuddyRankComparator.friendsChat != null && var36 < UserList.method10669(BuddyRankComparator.friendsChat, -732980175)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -385339042) * 327716789 - 1] = ((Buddy)BuddyRankComparator.friendsChat
                     .get(var36, -852326375))
                  .rank
               * 91500301;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3616) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1329977271 - 1] = null != BuddyRankComparator.friendsChat
            ? BuddyRankComparator.friendsChat.minKick
            : 0;
         return 1;
      } else if (var0 == 3617) {
         String var35 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * 522473623];
         class57.clanKickUser(var35, (byte)34);
         return 1;
      } else if (3618 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 276651020) * -315019407 - 1] = null != BuddyRankComparator.friendsChat
            ? BuddyRankComparator.friendsChat.rank * 14686129
            : 0;
         return 1;
      } else if (3619 == var0) {
         String var34 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -740882868) * -1595015587];
         IntProjection.Clan_joinChat(var34, -1774767118);
         return 1;
      } else if (1349773023 == var0) {
         class195.Clan_leaveChat(904679172);
         return 1;
      } else if (1191452366 == var0) {
         if (!class320.friendSystem.method427(-1951951036)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1507276664) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 793831587) * 327716789 - 1] = UserList.method10669(
               class320.friendSystem.ignoreList, -1227998045
            );
         }

         return 1;
      } else if (-2006135636 == var0) {
         int var33 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1839877293];
         if (class320.friendSystem.method427(-461330629) && var33 >= 0 && var33 < UserList.method10669(class320.friendSystem.ignoreList, 214512831)) {
            Ignored var4 = (Ignored)class320.friendSystem.ignoreList.get(var33, -946281487);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1657767493 - 1] = User.method10984(var4, (byte)-76);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1395646611) * -84214251 - 1] = User.method10986(var4, -78203676);
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -87070121) * 1265269601 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1125478765) * -1595015587 - 1] = "";
         }

         return 1;
      } else if (3623 == var0) {
         String var31 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -57559869) * -1595015587];
         var31 = class117.method3814(var31, -1197348711);
         Interpreter_intStack[(class408.Interpreter_intStackSize += 746006949) * 244998464 - 1] = FriendSystem.method443(
               class320.friendSystem, new Username(var31, LoginScreenAnimation.loginType), (byte)16
            )
            ? 1
            : 0;
         return 1;
      } else if (3624 == var0) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 266216769) * -567699977];
         if (null != BuddyRankComparator.friendsChat
            && var30 < UserList.method10669(BuddyRankComparator.friendsChat, 398316334)
            && BuddyRankComparator.friendsChat.get(var30, 89899561).getUsername((byte)-38).equals(class330.localPlayer.username)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -435584336 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -479856154) * -1711912003 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2037779076) {
         if (BuddyRankComparator.friendsChat != null && BuddyRankComparator.friendsChat.owner != null) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 859913288) * -1595015587 - 1] = BuddyRankComparator.friendsChat.owner;
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -118711374) * 694697225 - 1] = "";
         }

         return 1;
      } else if (var0 == -1725917494) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 963574848) * 327716789];
         if (BuddyRankComparator.friendsChat != null
            && var29 < UserList.method10669(BuddyRankComparator.friendsChat, 1298515438)
            && ((ClanMate)BuddyRankComparator.friendsChat.get(var29, 750695788)).isFriend((byte)-4)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 70813623 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1017873762 - 1] = 0;
         }

         return 1;
      } else if (var0 != 3627) {
         if (3628 == var0) {
            class320.friendSystem.friendsList.removeComparator((byte)112);
            return 1;
         } else if (3629 == var0) {
            boolean var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1804713590] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator1(var28), (byte)12);
            return 1;
         } else if (var0 == -1784754308) {
            boolean var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1102211052) * -1949682188] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator2(var27), (byte)117);
            return 1;
         } else if (var0 == 3631) {
            boolean var26 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator3(var26), (byte)116);
            return 1;
         } else if (var0 == 516657810) {
            boolean var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -161763532) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator4(var25), (byte)33);
            return 1;
         } else if (-497221759 == var0) {
            boolean var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator5(var24), (byte)7);
            return 1;
         } else if (var0 == 1706963348) {
            boolean var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1018770905) * 1062625794] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator6(var23), (byte)117);
            return 1;
         } else if (3635 == var0) {
            boolean var22 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1283254019) * -1558442960] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator7(var22), (byte)4);
            return 1;
         } else if (1077231518 == var0) {
            boolean var21 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator8(var21), (byte)117);
            return 1;
         } else if (3637 == var0) {
            boolean var20 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1103274154) * -1266636737] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator9(var20), (byte)62);
            return 1;
         } else if (2007931346 == var0) {
            boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -663650556) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new UserComparator10(var19), (byte)94);
            return 1;
         } else if (var0 == 3639) {
            class320.friendSystem.friendsList.sort((byte)56);
            return 1;
         } else if (var0 == 1527190286) {
            class320.friendSystem.ignoreList.removeComparator((byte)3);
            return 1;
         } else if (3641 == var0) {
            boolean var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.ignoreList, new UserComparator1(var18), (byte)77);
            return 1;
         } else if (var0 == -1321829559) {
            boolean var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.ignoreList, new UserComparator2(var17), (byte)88);
            return 1;
         } else if (var0 == -139701055) {
            class320.friendSystem.ignoreList.sort((byte)38);
            return 1;
         } else if (3644 == var0) {
            if (null != BuddyRankComparator.friendsChat) {
               BuddyRankComparator.friendsChat.removeComparator((byte)54);
            }

            return 1;
         } else if (-1527915236 == var0) {
            boolean var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 579820223] == 1;
            if (BuddyRankComparator.friendsChat != null) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator1(var16), (byte)44);
            }

            return 1;
         } else if (var0 == 3646) {
            boolean var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 569680535) * 327716789] == 1;
            if (BuddyRankComparator.friendsChat != null) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator2(var15), (byte)123);
            }

            return 1;
         } else if (var0 == 823054838) {
            boolean var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1054003162] == 1;
            if (BuddyRankComparator.friendsChat != null) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator3(var14), (byte)10);
            }

            return 1;
         } else if (var0 == -1727810584) {
            boolean var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 445881877) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator4(var13), (byte)35);
            }

            return 1;
         } else if (1730115843 == var0) {
            boolean var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1135176522) * -2002076852] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator5(var12), (byte)51);
            }

            return 1;
         } else if (3650 == var0) {
            boolean var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator6(var11), (byte)4);
            }

            return 1;
         } else if (var0 == 3651) {
            boolean var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1210960636] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator7(var10), (byte)84);
            }

            return 1;
         } else if (var0 == 3652) {
            boolean var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -42092778] == 1;
            if (BuddyRankComparator.friendsChat != null) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator8(var9), (byte)70);
            }

            return 1;
         } else if (3653 == var0) {
            boolean var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1021849492] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator9(var8), (byte)117);
            }

            return 1;
         } else if (var0 == 3654) {
            boolean var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 722941539] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator10(var7), (byte)6);
            }

            return 1;
         } else if (var0 == 1505898501) {
            if (null != BuddyRankComparator.friendsChat) {
               BuddyRankComparator.friendsChat.sort((byte)18);
            }

            return 1;
         } else if (var0 == 607484492) {
            boolean var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1428046196) * 327716789] == 1;
            UserList.method10734(class320.friendSystem.friendsList, new BuddyRankComparator(var6), (byte)11);
            return 1;
         } else if (var0 == 3657) {
            boolean var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1265581652) * 327716789] == 1;
            if (null != BuddyRankComparator.friendsChat) {
               UserList.method10734(BuddyRankComparator.friendsChat, new BuddyRankComparator(var5), (byte)107);
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (null != BuddyRankComparator.friendsChat
            && var3 < UserList.method10669(BuddyRankComparator.friendsChat, -1205006983)
            && ((ClanMate)BuddyRankComparator.friendsChat.get(var3, -1393863277)).isIgnored(-2012861431)) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1021077797) * 327716789 - 1] = 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1301266131) * 327716789 - 1] = 0;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gs")
   static int method1086(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gg")
   static int method1087(int var0, Script var1, boolean var2) {
      if (3800 == var0) {
         if (SecureRandomFuture.guestClanSettings != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            FontName.field6342 = SecureRandomFuture.guestClanSettings;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3801) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1834587334) * -1311263713];
         if (client.currentClanSettings[var18] != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            FontName.field6342 = client.currentClanSettings[var18];
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3802) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 392768365) * -1595015587 - 1] = FontName.field6342.name;
         return 1;
      } else if (var0 == 3803) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1866461998) * 327716789 - 1] = FontName.field6342.allowGuests ? 1 : 0;
         return 1;
      } else if (var0 == 1117182802) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2068;
         return 1;
      } else if (3805 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2063;
         return 1;
      } else if (var0 == 184163400) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1660015880) * 327716789 - 1] = FontName.field6342.field2065;
         return 1;
      } else if (3807 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2066;
         return 1;
      } else if (var0 == 3809) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -567671738 - 1] = FontName.field6342.memberCount * 1627818507;
         return 1;
      } else if (var0 == 3810) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1090751742) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.memberNames[var17];
         return 1;
      } else if (var0 == -1180408895) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 2078322092];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 542867881) * 327716789 - 1] = FontName.field6342.memberRanks[var16];
         return 1;
      } else if (-2118966138 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -320965747 * FontName.field6342.bannedMemberCount;
         return 1;
      } else if (1965789885 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -2019782254];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -117507329) * -2118149705 - 1] = FontName.field6342.bannedMemberNames[var15];
         return 1;
      } else if (3814 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var14 = Interpreter_intStack[class408.Interpreter_intStackSize * 1010537968];
         int var20 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var21 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342
            .method4283(var14, var20, var21, -592523297);
         return 1;
      } else if (3815 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1822875900) * 327716789 - 1] = FontName.field6342.currentOwner * 1172757763;
         return 1;
      } else if (var0 == 3816) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1739912088) * 327716789 - 1] = FontName.field6342.field2058 * 1020828854;
         return 1;
      } else if (868924397 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1988839535) * -719706489 - 1] = classDY.method3606(
            FontName.field6342, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1986766067) * -1595015587], 1418983912
         );
         return 1;
      } else if (3818 == var0) {
         Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = FontName.field6342.getSortedMembers((byte)37)[Interpreter_intStack[class408.Interpreter_intStackSize
               * 327716789
            - 1]];
         return 1;
      } else if (3819 == var0) {
         class408.Interpreter_intStackSize -= 724893225;
         int var13 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var19 = Interpreter_intStack[class408.Interpreter_intStackSize * -1175090166 + 1];
         Message.method1207(var19, var13, -1648357056);
         return 1;
      } else if (var0 == 2050976547) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1845752910) * 1051389382];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 716394642) * 558539336 - 1] = FontName.field6342.memberJoinDates[var12];
         return 1;
      } else {
         if (3821 == var0) {
            class408.Interpreter_intStackSize -= -1235369436;
            int var3 = Interpreter_intStack[class408.Interpreter_intStackSize * -774955382];
            boolean var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1;
            int var5 = Interpreter_intStack[-643286553 * class408.Interpreter_intStackSize + 2];
            classIO.method4948(var5, var3, var4, 1846472163);
         }

         if (3822 == var0) {
            int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1860503905) * -515906293];
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1688363826) * 1346348395 - 1] = FontName.field6342.field2085[var11] ? 1 : 0;
            return 1;
         } else if (var0 == 3850) {
            if (null != class57.guestClanChannel) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               class225.field2771 = class57.guestClanChannel;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -169384126) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (var0 == -199653447) {
            int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 138331079];
            if (null != client.currentClanChannels[var10]) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               class225.field2771 = client.currentClanChannels[var10];
               class148.field1907 = var10 * -645119696;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1617258919) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (-1184903143 == var0) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class225.field2771.name;
            return 1;
         } else if (-790158992 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.field2134;
            return 1;
         } else if (var0 == 3854) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -573460095 - 1] = class225.field2771.field2135;
            return 1;
         } else if (-492823716 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.method4425(910872915);
            return 1;
         } else if (-1088153518 == var0) {
            int var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1287071817 - 1] = Username.method12702(
               ((ClanChannelMember)class225.field2771.members.get(var9)).username, (byte)13
            );
            return 1;
         } else if (-1789687521 == var0) {
            int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -820621910) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771.members.get(var8))
               .rank;
            return 1;
         } else if (3858 == var0) {
            int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771.members.get(var7))
                  .world
               * -1379379925;
            return 1;
         } else if (3859 == var0) {
            int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            class309.method7193(class148.field1907 * -714451522, var6, -844830756);
            return 1;
         } else if (2094965003 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 262166854) * 327716789 - 1] = class225.field2771
               .method4429((String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1432554483) * -1551173893], 1596368249);
            return 1;
         } else if (-1454604327 == var0) {
            Interpreter_intStack[class408.Interpreter_intStackSize * 950853612 - 1] = class225.field2771.getSortedMembers(-453092939)[Interpreter_intStack[-964852244
                  * class408.Interpreter_intStackSize
               - 1]];
            return 1;
         } else if (var0 == 3890) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -375125755) * 302393318 - 1] = null != class4.field14 ? 1 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ga")
   static int method1088(int var0, Script var1, boolean var2) {
      if (3800 == var0) {
         if (SecureRandomFuture.guestClanSettings != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            FontName.field6342 = SecureRandomFuture.guestClanSettings;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3801) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (client.currentClanSettings[var18] != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            FontName.field6342 = client.currentClanSettings[var18];
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3802) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.name;
         return 1;
      } else if (var0 == 3803) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.allowGuests ? 1 : 0;
         return 1;
      } else if (var0 == 3804) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2068;
         return 1;
      } else if (3805 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2063;
         return 1;
      } else if (var0 == 3806) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2065;
         return 1;
      } else if (3807 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2066;
         return 1;
      } else if (var0 == 3809) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberCount * 1184926393;
         return 1;
      } else if (var0 == 3810) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.memberNames[var17];
         return 1;
      } else if (var0 == 3811) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberRanks[var16];
         return 1;
      } else if (3812 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -890431577 * FontName.field6342.bannedMemberCount;
         return 1;
      } else if (3813 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.bannedMemberNames[var15];
         return 1;
      } else if (3814 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var14 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var20 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var21 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342
            .method4283(var14, var20, var21, 1029642156);
         return 1;
      } else if (3815 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.currentOwner * 1172757763;
         return 1;
      } else if (var0 == 3816) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2058 * 1673809521;
         return 1;
      } else if (3817 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = classDY.method3606(
            FontName.field6342, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], -273765635
         );
         return 1;
      } else if (3818 == var0) {
         Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = FontName.field6342.getSortedMembers((byte)-13)[Interpreter_intStack[class408.Interpreter_intStackSize
               * 327716789
            - 1]];
         return 1;
      } else if (3819 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var13 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var19 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Message.method1207(var19, var13, 1747586228);
         return 1;
      } else if (var0 == 3820) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberJoinDates[var12];
         return 1;
      } else {
         if (3821 == var0) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var3 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            boolean var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1;
            int var5 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
            classIO.method4948(var5, var3, var4, 1517273594);
         }

         if (3822 == var0) {
            int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2085[var11] ? 1 : 0;
            return 1;
         } else if (var0 == 3850) {
            if (null != class57.guestClanChannel) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               class225.field2771 = class57.guestClanChannel;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3851) {
            int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            if (null != client.currentClanChannels[var10]) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               class225.field2771 = client.currentClanChannels[var10];
               class148.field1907 = var10 * -606235673;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (3852 == var0) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class225.field2771.name;
            return 1;
         } else if (3853 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.field2134;
            return 1;
         } else if (var0 == 3854) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.field2135;
            return 1;
         } else if (3855 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.method4425(1081815312);
            return 1;
         } else if (3856 == var0) {
            int var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Username.method12702(
               ((ClanChannelMember)class225.field2771.members.get(var9)).username, (byte)32
            );
            return 1;
         } else if (3857 == var0) {
            int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771.members.get(var8))
               .rank;
            return 1;
         } else if (3858 == var0) {
            int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771.members.get(var7))
                  .world
               * -1379379925;
            return 1;
         } else if (3859 == var0) {
            int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            class309.method7193(class148.field1907 * 1695010775, var6, -844830756);
            return 1;
         } else if (3860 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771
               .method4429((String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], 1596368249);
            return 1;
         } else if (3861 == var0) {
            Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = class225.field2771.getSortedMembers(-453092939)[Interpreter_intStack[327716789
                  * class408.Interpreter_intStackSize
               - 1]];
            return 1;
         } else if (var0 == 3890) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != class4.field14 ? 1 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gy")
   static int method1089(int var0, Script var1, boolean var2) {
      if (3800 == var0) {
         if (SecureRandomFuture.guestClanSettings != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            FontName.field6342 = SecureRandomFuture.guestClanSettings;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3801) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (client.currentClanSettings[var18] != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            FontName.field6342 = client.currentClanSettings[var18];
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3802) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.name;
         return 1;
      } else if (var0 == 3803) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.allowGuests ? 1 : 0;
         return 1;
      } else if (var0 == 3804) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2068;
         return 1;
      } else if (3805 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2063;
         return 1;
      } else if (var0 == 3806) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2065;
         return 1;
      } else if (3807 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2066;
         return 1;
      } else if (var0 == 3809) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberCount * 1184926393;
         return 1;
      } else if (var0 == 3810) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.memberNames[var17];
         return 1;
      } else if (var0 == 3811) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberRanks[var16];
         return 1;
      } else if (3812 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -890431577 * FontName.field6342.bannedMemberCount;
         return 1;
      } else if (3813 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.bannedMemberNames[var15];
         return 1;
      } else if (3814 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var14 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var20 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var21 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342
            .method4283(var14, var20, var21, 97613914);
         return 1;
      } else if (3815 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.currentOwner * 1172757763;
         return 1;
      } else if (var0 == 3816) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2058 * 1673809521;
         return 1;
      } else if (3817 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = classDY.method3606(
            FontName.field6342, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], 11305891
         );
         return 1;
      } else if (3818 == var0) {
         Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = FontName.field6342.getSortedMembers((byte)32)[Interpreter_intStack[class408.Interpreter_intStackSize
               * 327716789
            - 1]];
         return 1;
      } else if (3819 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var13 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var19 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Message.method1207(var19, var13, -1752301849);
         return 1;
      } else if (var0 == 3820) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberJoinDates[var12];
         return 1;
      } else {
         if (3821 == var0) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var3 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            boolean var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1;
            int var5 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
            classIO.method4948(var5, var3, var4, 2025728586);
         }

         if (3822 == var0) {
            int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2085[var11] ? 1 : 0;
            return 1;
         } else if (var0 == 3850) {
            if (null != class57.guestClanChannel) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               class225.field2771 = class57.guestClanChannel;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3851) {
            int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            if (null != client.currentClanChannels[var10]) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               class225.field2771 = client.currentClanChannels[var10];
               class148.field1907 = var10 * -606235673;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (3852 == var0) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class225.field2771.name;
            return 1;
         } else if (3853 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.field2134;
            return 1;
         } else if (var0 == 3854) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.field2135;
            return 1;
         } else if (3855 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.method4425(-1427147001);
            return 1;
         } else if (3856 == var0) {
            int var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Username.method12702(
               ((ClanChannelMember)class225.field2771.members.get(var9)).username, (byte)-8
            );
            return 1;
         } else if (3857 == var0) {
            int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771.members.get(var8))
               .rank;
            return 1;
         } else if (3858 == var0) {
            int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771.members.get(var7))
                  .world
               * -1379379925;
            return 1;
         } else if (3859 == var0) {
            int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            class309.method7193(class148.field1907 * 1695010775, var6, -844830756);
            return 1;
         } else if (3860 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771
               .method4429((String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], 1596368249);
            return 1;
         } else if (3861 == var0) {
            Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = class225.field2771.getSortedMembers(-453092939)[Interpreter_intStack[327716789
                  * class408.Interpreter_intStackSize
               - 1]];
            return 1;
         } else if (var0 == 3890) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != class4.field14 ? 1 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gj")
   static int method1090(int var0, Script var1, boolean var2) {
      if (3800 == var0) {
         if (SecureRandomFuture.guestClanSettings != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 957692969) * 102892044 - 1] = 1;
            FontName.field6342 = SecureRandomFuture.guestClanSettings;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (var0 == -1154898913) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 2140803565];
         if (client.currentClanSettings[var18] != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1494118594) * 327716789 - 1] = 1;
            FontName.field6342 = client.currentClanSettings[var18];
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 919571049) * -243078877 - 1] = 0;
         }

         return 1;
      } else if (var0 == 880768536) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1370244091) * 1391431737 - 1] = FontName.field6342.name;
         return 1;
      } else if (var0 == -345146464) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1461843074 - 1] = FontName.field6342.allowGuests ? 1 : 0;
         return 1;
      } else if (var0 == 3804) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 943342883) * 327716789 - 1] = FontName.field6342.field2068;
         return 1;
      } else if (-382460518 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -193669884 - 1] = FontName.field6342.field2063;
         return 1;
      } else if (var0 == 3806) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1026208103) * 327716789 - 1] = FontName.field6342.field2065;
         return 1;
      } else if (3807 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2066;
         return 1;
      } else if (var0 == 799912035) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberCount * -1163778476;
         return 1;
      } else if (var0 == 3810) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -356606438) * -2134008943];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.memberNames[var17];
         return 1;
      } else if (var0 == 1357967527) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1093155773) * -2090900164];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 928035968 - 1] = FontName.field6342.memberRanks[var16];
         return 1;
      } else if (315875539 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1169708941 - 1] = -890431577 * FontName.field6342.bannedMemberCount;
         return 1;
      } else if (3813 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.bannedMemberNames[var15];
         return 1;
      } else if (1210089848 == var0) {
         class408.Interpreter_intStackSize -= 237679154;
         int var14 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var20 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var21 = Interpreter_intStack[2 + 1224944336 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1876945500) * 327716789 - 1] = FontName.field6342
            .method4283(var14, var20, var21, 1369120945);
         return 1;
      } else if (3815 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1063314380) * 327716789 - 1] = FontName.field6342.currentOwner * 912900473;
         return 1;
      } else if (var0 == 3816) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1576185736 - 1] = FontName.field6342.field2058 * 1673809521;
         return 1;
      } else if (-582554764 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -323255978) * 327716789 - 1] = classDY.method3606(
            FontName.field6342, (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], -60328708
         );
         return 1;
      } else if (3818 == var0) {
         Interpreter_intStack[class408.Interpreter_intStackSize * -326135496 - 1] = FontName.field6342.getSortedMembers((byte)-73)[Interpreter_intStack[class408.Interpreter_intStackSize
               * -1940210001
            - 1]];
         return 1;
      } else if (3819 == var0) {
         class408.Interpreter_intStackSize -= 1248133315;
         int var13 = Interpreter_intStack[1229515367 * class408.Interpreter_intStackSize];
         int var19 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Message.method1207(var19, var13, 214764819);
         return 1;
      } else if (var0 == -716029817) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1033641924) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1473900651 - 1] = FontName.field6342.memberJoinDates[var12];
         return 1;
      } else {
         if (3821 == var0) {
            class408.Interpreter_intStackSize -= -1148333685;
            int var3 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            boolean var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1;
            int var5 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
            classIO.method4948(var5, var3, var4, 1824552638);
         }

         if (3822 == var0) {
            int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -621826281];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2085[var11] ? 1 : 0;
            return 1;
         } else if (var0 == -1378861243) {
            if (null != class57.guestClanChannel) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1717947579) * 327716789 - 1] = 1;
               class225.field2771 = class57.guestClanChannel;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1929845931 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3851) {
            int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            if (null != client.currentClanChannels[var10]) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += 617527919) * -178032895 - 1] = 1;
               class225.field2771 = client.currentClanChannels[var10];
               class148.field1907 = var10 * -140981651;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -428654993) * 264254816 - 1] = 0;
            }

            return 1;
         } else if (3852 == var0) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 269368798) * -2017726625 - 1] = class225.field2771.name;
            return 1;
         } else if (258515603 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 71387327) * 462676694 - 1] = class225.field2771.field2134;
            return 1;
         } else if (var0 == 3854) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1556569728 - 1] = class225.field2771.field2135;
            return 1;
         } else if (1716162824 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.method4425(790650505);
            return 1;
         } else if (3856 == var0) {
            int var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1685733671) * 132135611];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1257677973) * -932083542 - 1] = Username.method12702(
               ((ClanChannelMember)class225.field2771.members.get(var9)).username, (byte)-117
            );
            return 1;
         } else if (769479092 == var0) {
            int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771.members.get(var8))
               .rank;
            return 1;
         } else if (3858 == var0) {
            int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -733878208];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -937676350) * -843959921 - 1] = ((ClanChannelMember)class225.field2771.members.get(var7))
                  .world
               * 1338682768;
            return 1;
         } else if (3859 == var0) {
            int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -149242884];
            class309.method7193(class148.field1907 * 1695010775, var6, -844830756);
            return 1;
         } else if (3860 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -283074204) * 1169402590 - 1] = class225.field2771
               .method4429((String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -271116625], 1596368249);
            return 1;
         } else if (3861 == var0) {
            Interpreter_intStack[class408.Interpreter_intStackSize * 1051369568 - 1] = class225.field2771.getSortedMembers(-453092939)[Interpreter_intStack[1847366095
                  * class408.Interpreter_intStackSize
               - 1]];
            return 1;
         } else if (var0 == 1581183274) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1264018284) * 327716789 - 1] = null != class4.field14 ? 1 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gk")
   static int method1091(int var0, Script var1, boolean var2) {
      if (3903 == var0) {
         int var32 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOffer.method8904(
            client.grandExchangeOffers[var32], 610030356
         );
         return 1;
      } else if (3904 == var0) {
         int var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var31].id * -840737413;
         return 1;
      } else if (var0 == 3905) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var30].unitPrice * 270012189;
         return 1;
      } else if (3906 == var0) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var29].totalQuantity * 966823731;
         return 1;
      } else if (var0 == 3907) {
         int var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -634712805
            * client.grandExchangeOffers[var28].currentQuantity;
         return 1;
      } else if (3908 == var0) {
         int var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var27].currentPrice * 993851531;
         return 1;
      } else if (var0 == 3910) {
         int var26 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var43 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var26], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0 == var43 ? 1 : 0;
         return 1;
      } else if (3911 == var0) {
         int var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var42 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var25], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var42 == 2 ? 1 : 0;
         return 1;
      } else if (var0 == 3912) {
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var41 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var24], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 5 == var41 ? 1 : 0;
         return 1;
      } else if (var0 == 3913) {
         int var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var40 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var23], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1 == var40 ? 1 : 0;
         return 1;
      } else if (var0 == 3914) {
         boolean var22 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var22, (byte)-1);
         }

         return 1;
      } else if (3915 == var0) {
         boolean var21 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var21, (byte)-1);
         }

         return 1;
      } else if (var0 == 3916) {
         class408.Interpreter_intStackSize -= 708726074;
         boolean var20 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] == 1;
         boolean var39 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1;
         if (class234.grandExchangeEvents != null) {
            client.GrandExchangeEvents_worldComparator.filterWorlds = var39;
            class234.grandExchangeEvents.sort(client.GrandExchangeEvents_worldComparator, var20, (byte)-1);
         }

         return 1;
      } else if (3917 == var0) {
         boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var19, (byte)-1);
         }

         return 1;
      } else if (3918 == var0) {
         boolean var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var18, (byte)-1);
         }

         return 1;
      } else if (3919 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null == class234.grandExchangeEvents
            ? 0
            : class234.grandExchangeEvents.events.size();
         return 1;
      } else if (var0 == 3920) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var38 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var17);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var38.world * -1787296361;
         return 1;
      } else if (var0 == 3921) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var37 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var16);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var37.getOfferName((byte)-66);
         return 1;
      } else if (3922 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var36 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var15);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var36.getPreviousOfferName((byte)65);
         return 1;
      } else if (var0 == 3923) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var35 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var14);
         long var5 = ParamComposition.method4949((byte)15) - 6337075287727686201L * classFH.field1789 - var35.age * 8132046234609306567L;
         int var7 = (int)(var5 / 3600000L);
         int var8 = (int)((var5 - var7 * 3600000) / 60000L);
         int var9 = (int)((var5 - 3600000 * var7 - 60000 * var8) / 1000L);
         String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var10;
         return 1;
      } else if (3924 == var0) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var34 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var13);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var34.grandExchangeOffer.totalQuantity * 966823731;
         return 1;
      } else if (var0 == 3925) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var33 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var12);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33.grandExchangeOffer.unitPrice * 270012189;
         return 1;
      } else if (3926 == var0) {
         int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var11);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -840737413 * var4.grandExchangeOffer.id;
         return 1;
      } else if (var0 == 3939) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(var3, -888482935).isMembersOnly
            ? 1
            : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gt")
   static int method1092(int var0, Script var1, boolean var2) {
      if (3903 == var0) {
         int var32 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOffer.method8904(
            client.grandExchangeOffers[var32], 554776136
         );
         return 1;
      } else if (3904 == var0) {
         int var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var31].id * -840737413;
         return 1;
      } else if (var0 == 3905) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var30].unitPrice * 270012189;
         return 1;
      } else if (3906 == var0) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var29].totalQuantity * 966823731;
         return 1;
      } else if (var0 == 3907) {
         int var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -634712805
            * client.grandExchangeOffers[var28].currentQuantity;
         return 1;
      } else if (3908 == var0) {
         int var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var27].currentPrice * 993851531;
         return 1;
      } else if (var0 == 3910) {
         int var26 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var43 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var26], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0 == var43 ? 1 : 0;
         return 1;
      } else if (3911 == var0) {
         int var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var42 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var25], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var42 == 2 ? 1 : 0;
         return 1;
      } else if (var0 == 3912) {
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var41 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var24], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 5 == var41 ? 1 : 0;
         return 1;
      } else if (var0 == 3913) {
         int var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var40 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var23], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1 == var40 ? 1 : 0;
         return 1;
      } else if (var0 == 3914) {
         boolean var22 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var22, (byte)-1);
         }

         return 1;
      } else if (3915 == var0) {
         boolean var21 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var21, (byte)-1);
         }

         return 1;
      } else if (var0 == 3916) {
         class408.Interpreter_intStackSize -= 708726074;
         boolean var20 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] == 1;
         boolean var39 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1;
         if (class234.grandExchangeEvents != null) {
            client.GrandExchangeEvents_worldComparator.filterWorlds = var39;
            class234.grandExchangeEvents.sort(client.GrandExchangeEvents_worldComparator, var20, (byte)-1);
         }

         return 1;
      } else if (3917 == var0) {
         boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var19, (byte)-1);
         }

         return 1;
      } else if (3918 == var0) {
         boolean var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var18, (byte)-1);
         }

         return 1;
      } else if (3919 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null == class234.grandExchangeEvents
            ? 0
            : class234.grandExchangeEvents.events.size();
         return 1;
      } else if (var0 == 3920) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var38 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var17);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var38.world * -1787296361;
         return 1;
      } else if (var0 == 3921) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var37 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var16);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var37.getOfferName((byte)-9);
         return 1;
      } else if (3922 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var36 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var15);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var36.getPreviousOfferName((byte)65);
         return 1;
      } else if (var0 == 3923) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var35 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var14);
         long var5 = ParamComposition.method4949((byte)15) - 6337075287727686201L * classFH.field1789 - var35.age * 8132046234609306567L;
         int var7 = (int)(var5 / 3600000L);
         int var8 = (int)((var5 - var7 * 3600000) / 60000L);
         int var9 = (int)((var5 - 3600000 * var7 - 60000 * var8) / 1000L);
         String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var10;
         return 1;
      } else if (3924 == var0) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var34 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var13);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var34.grandExchangeOffer.totalQuantity * 966823731;
         return 1;
      } else if (var0 == 3925) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var33 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var12);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33.grandExchangeOffer.unitPrice * 270012189;
         return 1;
      } else if (3926 == var0) {
         int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var11);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -840737413 * var4.grandExchangeOffer.id;
         return 1;
      } else if (var0 == 3939) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(var3, -1213992825).isMembersOnly
            ? 1
            : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gw")
   static int method1093(int var0, Script var1, boolean var2) {
      if (3903 == var0) {
         int var32 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOffer.method8904(
            client.grandExchangeOffers[var32], 1919733194
         );
         return 1;
      } else if (3904 == var0) {
         int var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var31].id * -840737413;
         return 1;
      } else if (var0 == 3905) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var30].unitPrice * 270012189;
         return 1;
      } else if (3906 == var0) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var29].totalQuantity * 966823731;
         return 1;
      } else if (var0 == 3907) {
         int var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -634712805
            * client.grandExchangeOffers[var28].currentQuantity;
         return 1;
      } else if (3908 == var0) {
         int var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var27].currentPrice * 993851531;
         return 1;
      } else if (var0 == 3910) {
         int var26 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var43 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var26], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0 == var43 ? 1 : 0;
         return 1;
      } else if (3911 == var0) {
         int var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var42 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var25], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var42 == 2 ? 1 : 0;
         return 1;
      } else if (var0 == 3912) {
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var41 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var24], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 5 == var41 ? 1 : 0;
         return 1;
      } else if (var0 == 3913) {
         int var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         int var40 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var23], -887756991);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1 == var40 ? 1 : 0;
         return 1;
      } else if (var0 == 3914) {
         boolean var22 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var22, (byte)-1);
         }

         return 1;
      } else if (3915 == var0) {
         boolean var21 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var21, (byte)-1);
         }

         return 1;
      } else if (var0 == 3916) {
         class408.Interpreter_intStackSize -= 708726074;
         boolean var20 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] == 1;
         boolean var39 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1;
         if (class234.grandExchangeEvents != null) {
            client.GrandExchangeEvents_worldComparator.filterWorlds = var39;
            class234.grandExchangeEvents.sort(client.GrandExchangeEvents_worldComparator, var20, (byte)-1);
         }

         return 1;
      } else if (3917 == var0) {
         boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var19, (byte)-1);
         }

         return 1;
      } else if (3918 == var0) {
         boolean var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         if (null != class234.grandExchangeEvents) {
            class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var18, (byte)-1);
         }

         return 1;
      } else if (3919 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null == class234.grandExchangeEvents
            ? 0
            : class234.grandExchangeEvents.events.size();
         return 1;
      } else if (var0 == 3920) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var38 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var17);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var38.world * -1787296361;
         return 1;
      } else if (var0 == 3921) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var37 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var16);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var37.getOfferName((byte)-125);
         return 1;
      } else if (3922 == var0) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var36 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var15);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var36.getPreviousOfferName((byte)65);
         return 1;
      } else if (var0 == 3923) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var35 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var14);
         long var5 = ParamComposition.method4949((byte)15) - 6337075287727686201L * classFH.field1789 - var35.age * 8132046234609306567L;
         int var7 = (int)(var5 / 3600000L);
         int var8 = (int)((var5 - var7 * 3600000) / 60000L);
         int var9 = (int)((var5 - 3600000 * var7 - 60000 * var8) / 1000L);
         String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var10;
         return 1;
      } else if (3924 == var0) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var34 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var13);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var34.grandExchangeOffer.totalQuantity * 966823731;
         return 1;
      } else if (var0 == 3925) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var33 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var12);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33.grandExchangeOffer.unitPrice * 270012189;
         return 1;
      } else if (3926 == var0) {
         int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         GrandExchangeEvent var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var11);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -840737413 * var4.grandExchangeOffer.id;
         return 1;
      } else if (var0 == 3939) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(var3, -2109834584).isMembersOnly
            ? 1
            : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ge")
   static int method1099(int var0, Script var1, boolean var2) {
      if (1748564357 == var0) {
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -473466728) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1602807859) * -1595015587 - 1] = class150.ItemDefinition_get(
               var24, -525206054
            )
            .name;
         return 1;
      } else if (var0 == -1431385351) {
         class408.Interpreter_intStackSize -= -622031331;
         int var23 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var33 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         ItemComposition var35 = class150.ItemDefinition_get(var23, -291229426);
         if (var33 >= 1 && var33 <= 5 && null != var35.groundActions[var33 - 1]) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1163395931 - 1] = var35.groundActions[var33 - 1];
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -906773822) * -1595015587 - 1] = "";
         }

         return 1;
      } else if (4202 == var0) {
         class408.Interpreter_intStackSize -= -294559192;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var32 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         ItemComposition var34 = class150.ItemDefinition_get(var22, -559369217);
         if (var32 >= 1 && var32 <= 5 && var34.inventoryActions[var32 - 1] != null) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -921157008 - 1] = var34.inventoryActions[var32 - 1];
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         }

         return 1;
      } else if (var0 == -902740236) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var31 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var5 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         ItemComposition var6 = class150.ItemDefinition_get(var21, -1390500263);
         String var7 = null;
         if (var31 >= 1
            && var31 <= 5
            && null != var6.inventoryActions[var31 - 1]
            && var6.subOps != null
            && var6.subOps[var31 - 1] != null
            && var5 >= 1
            && var5 <= var6.subOps[var31 - 1].length) {
            var7 = var6.subOps[var31 - 1][var5 - 1];
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 684036812) * -959908903 - 1] = var7 != null ? var7 : "";
         return 1;
      } else if (1081111810 == var0) {
         int var20 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -595299004) * -1027329541];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1622952031) * -1748120169 - 1] = class150.ItemDefinition_get(var20, -1307274144).price
            * 1824214797;
         return 1;
      } else if (var0 == -610759748) {
         int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1037295537) * -1576419877 - 1] = class150.ItemDefinition_get(var19, -1024024470).isStackable
                  * 1515235515
               == 1
            ? 1
            : 0;
         return 1;
      } else if (-319524138 == var0) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1773566520) * -1957505338];
         ItemComposition var30 = class150.ItemDefinition_get(var18, -543012554);
         if (var30.noteTemplate * 388376999 == -1 && var30.note * 875434759 >= 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1286255399) * -470122556 - 1] = -2082720184 * var30.note;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -47463628) * 837987444 - 1] = var18;
         }

         return 1;
      } else if (1198578278 == var0) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1623660229];
         ItemComposition var29 = class150.ItemDefinition_get(var17, -676356406);
         if (var29.noteTemplate * 388376999 >= 0 && 2065093612 * var29.note >= 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -241649451) * -2115027253 - 1] = var29.note * 1056092376;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var17;
         }

         return 1;
      } else if (var0 == 1253837246) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -2118086361) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(var16, -1740261925).isTradable
            ? 1
            : 0;
         return 1;
      } else if (var0 == -1286202987) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1409727226) * 327716789];
         ItemComposition var28 = class150.ItemDefinition_get(var15, -1956683879);
         if (var28.placeholderTemplate * -185584960 == -1 && var28.placeholder * -1727408361 >= 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1846093943) * 327716789 - 1] = 1409834509 * var28.placeholder;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var15;
         }

         return 1;
      } else if (4209 == var0) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1074367633) * 746989122];
         ItemComposition var27 = class150.ItemDefinition_get(var14, -1196980064);
         if (var27.placeholderTemplate * 413316061 >= 0 && -1134820861 * var27.placeholder >= 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var27.placeholder * -1897888319;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1342128096) * 2114589767 - 1] = var14;
         }

         return 1;
      } else if (var0 == 4210) {
         String var13 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1160247542) * -675659193];
         int var26 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -179181122];
         class408.findItemDefinitions(var13, 1 == var26, -171701861);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1362907781 - 1] = class136.foundItemIdCount * -59800608;
         return 1;
      } else if (4211 != var0) {
         if (-2105267052 == var0) {
            AbstractByteArrayCopier.foundItemIndex = 0;
            return 1;
         } else if (4213 == var0) {
            int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 170647470) * -1394024700];
            int var25 = class150.ItemDefinition_get(var12, -2107021641).getShiftClickIndex(1650304017);
            if (var25 == -1) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += 79121868) * 1567563151 - 1] = var25;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1733674109 - 1] = 1 + var25;
            }

            return 1;
         } else if (var0 == -1917990202) {
            int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -600343219) * 1176933787];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -59101348) * 327716789 - 1] = class150.ItemDefinition_get(var11, -847292433).maleModel
               * -1427799695;
            return 1;
         } else if (var0 == 1765673618) {
            int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -2007125263) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1952556905) * 327716789 - 1] = class150.ItemDefinition_get(var10, -1404846631).maleModel1
               * -1551751121;
            return 1;
         } else if (var0 == 172943338) {
            int var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += 2039336061) * -383628465 - 1] = class150.ItemDefinition_get(var9, -451509523).maleModel2
               * -2136770322;
            return 1;
         } else if (var0 == -1140455579) {
            int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            ItemComposition var4 = class150.ItemDefinition_get(var8, -1262232682);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 297233180) * 327716789 - 1] = 1609347271 * var4.field2605;
            return 1;
         } else if (1839291027 == var0) {
            int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -2055276748) * -1439678818];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1957758615) * -726101121 - 1] = class150.ItemDefinition_get(
                  var3, -1566696662
               )
               .examine;
            return 1;
         } else {
            return 2;
         }
      } else {
         if (null != class468.foundItemIds && 1501959967 * AbstractByteArrayCopier.foundItemIndex < class136.foundItemIdCount * 1879001698) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 730085318) * -1616489392 - 1] = class468.foundItemIds[(
                        AbstractByteArrayCopier.foundItemIndex += 1616815327
                     )
                     * 1501959967
                  - 1]
               & '\uffff';
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gz")
   static int method1095(int var0, Script var1, boolean var2) {
      if (-1720228094 == var0) {
         class408.Interpreter_intStackSize -= -110132435;
         int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var57 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 812170922) * 1650519435 - 1] = var57 + var35;
         return 1;
      } else if (-783563455 == var0) {
         class408.Interpreter_intStackSize -= -1256613175;
         int var34 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var56 = Interpreter_intStack[class408.Interpreter_intStackSize * -1831624730 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1514913889 - 1] = var34 - var56;
         return 1;
      } else if (var0 == 897546697) {
         class408.Interpreter_intStackSize -= 708726074;
         int var33 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var55 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var55 * var33;
         return 1;
      } else if (var0 == 4003) {
         class408.Interpreter_intStackSize -= 708726074;
         int var32 = Interpreter_intStack[class408.Interpreter_intStackSize * -1421736583];
         int var54 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var32 / var54;
         return 1;
      } else if (var0 == 4004) {
         int var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 2036748401) * 1036762214];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 570262521 - 1] = (int)(Math.random() * var31);
         return 1;
      } else if (4005 == var0) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -418960206];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)(Math.random() * (1 + var30));
         return 1;
      } else if (var0 == -721052681) {
         class408.Interpreter_intStackSize -= -679538239;
         int var29 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var53 = Interpreter_intStack[1 + -998345692 * class408.Interpreter_intStackSize];
         int var63 = Interpreter_intStack[2 + 1482213508 * class408.Interpreter_intStackSize];
         int var65 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 3];
         int var67 = Interpreter_intStack[4 + class408.Interpreter_intStackSize * -140526700];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1470001326 - 1] = (var53 - var29) * (var67 - var63) / (var65 - var63)
            + var29;
         return 1;
      } else if (var0 == 1023407180) {
         class408.Interpreter_intStackSize -= 708726074;
         int var28 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var52 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52 * var28 / -857536095 + var28;
         return 1;
      } else if (251840463 == var0) {
         class408.Interpreter_intStackSize -= 442990663;
         int var27 = Interpreter_intStack[class408.Interpreter_intStackSize * -606441127];
         int var51 = Interpreter_intStack[-1902359371 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1265119049) * -356853453 - 1] = var27 | 1 << var51;
         return 1;
      } else if (411036627 == var0) {
         class408.Interpreter_intStackSize -= -1641631995;
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * -612431981];
         int var50 = Interpreter_intStack[class408.Interpreter_intStackSize * -182034997 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var26 & -1 - (1 << var50);
         return 1;
      } else if (4010 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var25 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var49 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1121584885 - 1] = (var25 & 1 << var49) != 0 ? 1 : 0;
         return 1;
      } else if (var0 == -1750933394) {
         class408.Interpreter_intStackSize -= 708726074;
         int var24 = Interpreter_intStack[775882889 * class408.Interpreter_intStackSize];
         int var48 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -681449614];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1761100023 - 1] = var24 % var48;
         return 1;
      } else if (var0 == 4012) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[class408.Interpreter_intStackSize * 591396224];
         int var47 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         if (var23 == 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 23931426) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1184485579) * -1514034956 - 1] = (int)Math.pow(var23, var47);
         }

         return 1;
      } else if (-1061346325 == var0) {
         class408.Interpreter_intStackSize -= 1930788112;
         int var22 = Interpreter_intStack[1258435259 * class408.Interpreter_intStackSize];
         int var46 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 1351488674];
         if (var22 == 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -761622064) * 1977765775 - 1] = 0;
            return 1;
         } else {
            switch (var46) {
               case 0:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 179716440) * 327716789 - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var22;
                  break;
               case 2:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1927279965) * 327716789 - 1] = (int)Math.sqrt(var22);
                  break;
               case 3:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 1454432377) * 327716789 - 1] = (int)Math.cbrt(var22);
                  break;
               case 4:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -480311551) * -1760998650 - 1] = (int)Math.sqrt(Math.sqrt(var22));
                  break;
               default:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 1838571480) * 393864744 - 1] = (int)Math.pow(var22, 1.0 / var46);
            }

            return 1;
         }
      } else if (4014 == var0) {
         class408.Interpreter_intStackSize -= -1080621861;
         int var21 = Interpreter_intStack[-1110139886 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -973216286];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var21 & var45;
         return 1;
      } else if (1326039237 == var0) {
         class408.Interpreter_intStackSize -= 191435733;
         int var20 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[class408.Interpreter_intStackSize * 566403167 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 704750187) * -2025548580 - 1] = var20 | var44;
         return 1;
      } else if (4016 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var19 = Interpreter_intStack[-423445303 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[-1590275342 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -190060859) * 886545492 - 1] = var19 < var43 ? var19 : var43;
         return 1;
      } else if (1110869599 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var18 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var42 = Interpreter_intStack[class408.Interpreter_intStackSize * -18496548 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var18 > var42 ? var18 : var42;
         return 1;
      } else if (var0 == -1335685749) {
         class408.Interpreter_intStackSize -= -1084394537;
         long var17 = Interpreter_intStack[class408.Interpreter_intStackSize * 1599907420];
         long var62 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         long var66 = Interpreter_intStack[-478848844 * class408.Interpreter_intStackSize + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1312410229) * 327716789 - 1] = (int)(var17 * var66 / var62);
         return 1;
      } else if (var0 == -1116238377) {
         int var16 = ServerPacket.method7545(Interpreter_intStack[(class408.Interpreter_intStackSize -= -632950254) * 327716789], (byte)-11);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1740901164 - 1] = var16;
         return 1;
      } else if (-742974032 == var0) {
         class408.Interpreter_intStackSize -= -551588359;
         int var15 = Interpreter_intStack[1782500851 * class408.Interpreter_intStackSize];
         int var41 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 934200878];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var15 ^ 1 << var41;
         return 1;
      } else if (1940687473 == var0) {
         class408.Interpreter_intStackSize -= 1127096853;
         int var14 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var40 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var61 = Interpreter_intStack[1894760111 * class408.Interpreter_intStackSize + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1068911458) * 294579376 - 1] = class309.method7191(var14, var40, var61, (short)-25455);
         return 1;
      } else if (4028 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var13 = Interpreter_intStack[class408.Interpreter_intStackSize * 1991936014];
         int var39 = Interpreter_intStack[class408.Interpreter_intStackSize * -2031758180 + 1];
         int var60 = Interpreter_intStack[class408.Interpreter_intStackSize * -1313796980 + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FloatProjection.method6012(var13, var39, var60, 2139353104);
         return 1;
      } else if (var0 == 1996769891) {
         class408.Interpreter_intStackSize -= -975344327;
         int var12 = Interpreter_intStack[class408.Interpreter_intStackSize * 1634706745];
         int var38 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -81605857];
         int var59 = Interpreter_intStack[2 + -785752917 * class408.Interpreter_intStackSize];
         int var64 = 994576536 - var59;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 255897442 - 1] = var12 << var64 >>> var38 + var64;
         return 1;
      } else if (4030 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var10 = Interpreter_intStack[class408.Interpreter_intStackSize * 1733915236];
         int var37 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         int var58 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * -2001758795];
         int var6 = Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
         var10 = FloatProjection.method6012(var10, var58, var6, 1565742231);
         int var7 = SpotAnimationDefinition.method4605(1 + (var6 - var58), 46769362);
         if (var37 > var7) {
            var37 = var7;
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1572852313) * 965518383 - 1] = var10 | var37 << var58;
         return 1;
      } else if (var0 == 1547112631) {
         Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = class137.method4002(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], -2044060063
         );
         return 1;
      } else if (var0 == -44070342) {
         Interpreter_intStack[703744900 * class408.Interpreter_intStackSize - 1] = class33.method657(
            Interpreter_intStack[-1857646960 * class408.Interpreter_intStackSize - 1], 2123231013
         );
         return 1;
      } else if (4034 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var9 = Interpreter_intStack[-811332389 * class408.Interpreter_intStackSize];
         int var36 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var5 = class394.method8799(var9, var36, -1065596013);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5;
         return 1;
      } else if (4035 == var0) {
         Interpreter_intStack[-2056071543 * class408.Interpreter_intStackSize - 1] = Math.abs(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1]
         );
         return 1;
      } else if (-504454122 == var0) {
         String var3 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 174954799) * -1595015587];
         int var4 = -1;
         if (ViewportMouse.isNumber(var3, 585240553)) {
            var4 = Message.method1204(var3, (byte)-127);
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -711927390 - 1] = var4;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gv")
   static int method1096(int var0, Script var1, boolean var2) {
      if (4000 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var57 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var57 + var35;
         return 1;
      } else if (4001 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var34 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var56 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var34 - var56;
         return 1;
      } else if (var0 == 4002) {
         class408.Interpreter_intStackSize -= 708726074;
         int var33 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var55 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var55 * var33;
         return 1;
      } else if (var0 == 4003) {
         class408.Interpreter_intStackSize -= 708726074;
         int var32 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var54 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var32 / var54;
         return 1;
      } else if (var0 == 4004) {
         int var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)(Math.random() * var31);
         return 1;
      } else if (4005 == var0) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)(Math.random() * (1 + var30));
         return 1;
      } else if (var0 == 4006) {
         class408.Interpreter_intStackSize -= -375668463;
         int var29 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var53 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var63 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         int var65 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 3];
         int var67 = Interpreter_intStack[4 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (var53 - var29) * (var67 - var63) / (var65 - var63) + var29;
         return 1;
      } else if (var0 == 4007) {
         class408.Interpreter_intStackSize -= 708726074;
         int var28 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var52 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52 * var28 / 100 + var28;
         return 1;
      } else if (4008 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var27 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var51 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var27 | 1 << var51;
         return 1;
      } else if (4009 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var50 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var26 & -1 - (1 << var50);
         return 1;
      } else if (4010 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var25 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var49 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (var25 & 1 << var49) != 0 ? 1 : 0;
         return 1;
      } else if (var0 == 4011) {
         class408.Interpreter_intStackSize -= 708726074;
         int var24 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var48 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var24 % var48;
         return 1;
      } else if (var0 == 4012) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var47 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         if (var23 == 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.pow(var23, var47);
         }

         return 1;
      } else if (4013 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var46 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         if (var22 == 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            switch (var46) {
               case 0:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var22;
                  break;
               case 2:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.sqrt(var22);
                  break;
               case 3:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.cbrt(var22);
                  break;
               case 4:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.sqrt(Math.sqrt(var22));
                  break;
               default:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.pow(var22, 1.0 / var46);
            }

            return 1;
         }
      } else if (4014 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var21 & var45;
         return 1;
      } else if (4015 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var20 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var20 | var44;
         return 1;
      } else if (4016 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var19 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var19 < var43 ? var19 : var43;
         return 1;
      } else if (4017 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var18 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var42 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var18 > var42 ? var18 : var42;
         return 1;
      } else if (var0 == 4018) {
         class408.Interpreter_intStackSize -= -1084394537;
         long var17 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         long var62 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         long var66 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)(var17 * var66 / var62);
         return 1;
      } else if (var0 == 4025) {
         int var16 = ServerPacket.method7545(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)-38);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var16;
         return 1;
      } else if (4026 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var41 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var15 ^ 1 << var41;
         return 1;
      } else if (4027 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var14 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var40 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var61 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class309.method7191(var14, var40, var61, (short)-4274);
         return 1;
      } else if (4028 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var13 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var39 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var60 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FloatProjection.method6012(var13, var39, var60, 2014972405);
         return 1;
      } else if (var0 == 4029) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var12 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var38 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var59 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         int var64 = 31 - var59;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12 << var64 >>> var38 + var64;
         return 1;
      } else if (4030 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var10 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var37 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         int var58 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         int var6 = Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
         var10 = FloatProjection.method6012(var10, var58, var6, 1932313354);
         int var7 = SpotAnimationDefinition.method4605(1 + (var6 - var58), -538039729);
         if (var37 > var7) {
            var37 = var7;
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var10 | var37 << var58;
         return 1;
      } else if (var0 == 4032) {
         Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = class137.method4002(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], -1848299715
         );
         return 1;
      } else if (var0 == 4033) {
         Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = class33.method657(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], 2086326635
         );
         return 1;
      } else if (4034 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var9 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var36 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var5 = class394.method8799(var9, var36, -718443097);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5;
         return 1;
      } else if (4035 == var0) {
         Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = Math.abs(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1]
         );
         return 1;
      } else if (4036 == var0) {
         String var3 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         int var4 = -1;
         if (ViewportMouse.isNumber(var3, 92164423)) {
            var4 = Message.method1204(var3, (byte)-49);
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("iq")
   static int method1137(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gl")
   static int method1098(int var0, Script var1, boolean var2) {
      if (var0 == 4100) {
         String var30 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         int var43 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var30 + var43;
         return 1;
      } else if (var0 == 4101) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         String var29 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var42 = (String)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var29 + var42;
         return 1;
      } else if (var0 == 4102) {
         String var28 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         int var41 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var28
            + Tile.intToString(var41, true, -358468941);
         return 1;
      } else if (var0 == 4103) {
         String var27 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var27.toLowerCase();
         return 1;
      } else if (var0 == 4104) {
         int var26 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         long var40 = 86400000L * (11745L + var26);
         Interpreter_calendar.setTime(new Date(var40));
         int var51 = Interpreter_calendar.get(5);
         int var54 = Interpreter_calendar.get(2);
         int var8 = Interpreter_calendar.get(1);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var51
            + "-"
            + Interpreter_MONTHS[var54]
            + "-"
            + var8;
         return 1;
      } else if (4105 != var0) {
         if (4106 == var0) {
            int var25 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Integer.toString(var25);
            return 1;
         } else if (4107 == var0) {
            SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class209.method4886(
               WorldMapIcon_1.compareStrings(
                  (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize],
                  (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1],
                  class352.clientLanguage,
                  (byte)66
               ),
               (byte)-114
            );
            return 1;
         } else if (4108 == var0) {
            String var24 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            class408.Interpreter_intStackSize -= 708726074;
            int var39 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var48 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            byte[] var50 = ActorSpotAnim.archive13.getFile(var48, 0, 2014394428);
            Font var53 = new Font(var50);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var53.lineCount(var24, var39);
            return 1;
         } else if (var0 == 4109) {
            String var23 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            class408.Interpreter_intStackSize -= 708726074;
            int var38 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var47 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            byte[] var49 = ActorSpotAnim.archive13.getFile(var47, 0, -1259280324);
            Font var52 = new Font(var49);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52.lineWidth(var23, var38);
            return 1;
         } else if (var0 == 4110) {
            SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
            String var22 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
            String var37 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1];
            if (Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var22;
            } else {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var37;
            }

            return 1;
         } else if (var0 == 4111) {
            String var21 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = AbstractFont.escapeBrackets(var21);
            return 1;
         } else if (4112 == var0) {
            String var20 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var20 + (char)var36;
            return 1;
         } else if (4113 == var0) {
            int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class164.isCharPrintable((char)var19, (byte)-119)
               ? 1
               : 0;
            return 1;
         } else if (var0 == 4114) {
            int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class189.isAlphaNumeric((char)var18, 1266675309) ? 1 : 0;
            return 1;
         } else if (4115 == var0) {
            int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ServerPacket.isCharAlphabetic((char)var17, (short)-15191)
               ? 1
               : 0;
            return 1;
         } else if (4116 == var0) {
            int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class341.isDigit((char)var16, 503230964) ? 1 : 0;
            return 1;
         } else if (var0 == 4117) {
            String var15 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            if (var15 != null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var15.length();
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (var0 == 4118) {
            String var14 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            class408.Interpreter_intStackSize -= 708726074;
            int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var46 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var14.substring(var35, var46);
            return 1;
         } else if (4119 == var0) {
            String var13 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            StringBuilder var34 = new StringBuilder(var13.length());
            boolean var45 = false;

            for (int var6 = 0; var6 < var13.length(); var6++) {
               char var7 = var13.charAt(var6);
               if (var7 == '<') {
                  var45 = true;
               } else if (var7 == '>') {
                  var45 = false;
               } else if (!var45) {
                  var34.append(var7);
               }
            }

            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var34.toString();
            return 1;
         } else if (var0 == 4120) {
            String var12 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            int var33 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12.indexOf(var33);
            return 1;
         } else if (4121 == var0) {
            SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
            String var11 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
            String var32 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize + 1];
            int var44 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var11.indexOf(var32, var44);
            return 1;
         } else if (var0 == 4122) {
            String var10 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var10.toUpperCase();
            return 1;
         } else if (var0 == 4123) {
            SecureRandomFuture.Interpreter_objectStackSize -= -1799073313;
            String var9 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
            String var31 = (String)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
            String var5 = (String)Interpreter_objectStack[2 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
            if (null == class330.localPlayer.appearance) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var5;
               return 1;
            } else {
               switch (1035639301 * class330.localPlayer.appearance.field4386) {
                  case 0:
                     Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var9;
                     break;
                  case 1:
                     Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var31;
                     break;
                  case 2:
                  default:
                     Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var5;
               }

               return 1;
            }
         } else if (4124 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != class330.localPlayer.appearance
               ? class330.localPlayer.appearance.field4386 * 1035639301
               : -1;
            return 1;
         } else {
            return 2;
         }
      } else {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         String var3 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
         String var4 = (String)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
         if (null != class330.localPlayer.appearance && 0 != -941255479 * class330.localPlayer.appearance.gender) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4;
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwh;Ljava/lang/Object;)V")
   @ObfuscatedName("jo")
   static void method1159(class586 var0, Object var1) {
      if (null == var0) {
         throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
      } else {
         switch (676106613 * var0.field6375) {
            case 0:
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var1;
               break;
            case 3:
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (Integer)var1;
               break;
            default:
               throw new IllegalStateException("pushValueOfType() failure - unsupported type");
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;Lcu;II)V")
   @ObfuscatedName("cj")
   static void method1000(ScriptEvent var0, Script var1, int var2, int var3) {
      Object[] var4 = var0.args;
      class408.Interpreter_intStackSize = 0;
      SecureRandomFuture.Interpreter_objectStackSize = 0;
      int var5 = -1;
      int[] var6 = var1.opcodes;
      int[] var7 = var1.intOperands;
      int var8 = -1;
      Interpreter_frameDepth = 0;
      field345 = false;
      boolean var9 = false;
      field339 = 0;
      boolean var21 = false /* VF: Semaphore variable */;

      label631: {
         label632: {
            try {
               var21 = true;
               class251.Interpreter_intLocals = new int[var1.localIntCount * -58237571];
               int var24 = 0;
               Interpreter_objectLocals = new Object[-14880459 * var1.localStringCount];
               int var25 = 0;

               for (int var26 = 1; var26 < var4.length; var26++) {
                  if (var4[var26] instanceof Integer) {
                     int var13 = (Integer)var4[var26];
                     if (-2147483647 == var13) {
                        var13 = var0.mouseX * -1567081689;
                     }

                     if (-2147483646 == var13) {
                        var13 = var0.mouseY * -1332622121;
                     }

                     if (-2147483645 == var13) {
                        var13 = null != var0.widget ? 278777747 * var0.widget.id : -1;
                     }

                     if (var13 == -2147483644) {
                        var13 = var0.opIndex * 2029362027;
                     }

                     if (var13 == -2147483643) {
                        var13 = null != var0.widget ? var0.widget.childIndex * 2077538819 : -1;
                     }

                     if (-2147483642 == var13) {
                        var13 = null != var0.dragTarget ? 278777747 * var0.dragTarget.id : -1;
                     }

                     if (-2147483641 == var13) {
                        var13 = var0.dragTarget != null ? 2077538819 * var0.dragTarget.childIndex : -1;
                     }

                     if (-2147483640 == var13) {
                        var13 = var0.keyTyped * 1798396775;
                     }

                     if (-2147483639 == var13) {
                        var13 = 837595959 * var0.keyPressed;
                     }

                     if (var13 == -2147483638) {
                        var13 = 715272521 * var0.field525;
                     }

                     class251.Interpreter_intLocals[var24++] = var13;
                  } else if (var4[var26] instanceof String) {
                     String var43 = (String)var4[var26];
                     if (var43.equals("event_opbase")) {
                        var43 = var0.targetName;
                     }

                     Interpreter_objectLocals[var25++] = var43;
                  } else if (var4[var26] instanceof DynamicArray) {
                     Interpreter_objectLocals[var25++] = var4[var26];
                  }
               }

               field335 = -1821970675 * var0.field530;

               label620:
               while (true) {
                  field339 += 1177210717;
                  if (-2113340171 * field339 > var2) {
                     throw new RuntimeException();
                  }

                  var8 = var6[++var5];
                  if (var8 < 100) {
                     if (0 == var8) {
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7[var5];
                     } else if (1 == var8) {
                        int var42 = var7[var5];
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Varps.Varps_main[var42];
                     } else if (2 == var8) {
                        int var41 = var7[var5];
                        Varps.Varps_main[var41] = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        Huffman.changeGameOptions(var41, 1382603152);
                     } else if (var8 == 3) {
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var1.stringOperands[var5];
                     } else if (var8 == 6) {
                        var5 += var7[var5];
                     } else if (var8 == 7) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]
                           != Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 8) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                           == Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 9) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                           < Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 10) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[class408.Interpreter_intStackSize * 327716789]
                           > Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789]) {
                           var5 += var7[var5];
                        }
                     } else if (21 == var8) {
                        if (Interpreter_frameDepth * -444245115 == 0) {
                           var21 = false;
                           break label632;
                        }

                        ScriptFrame var39 = Interpreter_frames[(Interpreter_frameDepth -= -383228595) * -444245115];
                        var1 = var39.script;
                        var6 = var1.opcodes;
                        var7 = var1.intOperands;
                        var5 = 1078296483 * var39.pc;
                        class251.Interpreter_intLocals = var39.intLocals;
                        Interpreter_objectLocals = var39.stringLocals;
                     } else if (25 == var8) {
                        int var38 = var7[var5];
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapData_1.getVarbit(var38, -1434093574);
                     } else if (var8 == 27) {
                        int var37 = var7[var5];
                        VarbitComposition.method4905(var37, Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1385422393);
                     } else if (31 == var8) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                           <= Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 32) {
                        class408.Interpreter_intStackSize -= 708726074;
                        if (Interpreter_intStack[class408.Interpreter_intStackSize * 327716789]
                           >= Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 33) {
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class251.Interpreter_intLocals[var7[var5]];
                     } else if (var8 == 34) {
                        class251.Interpreter_intLocals[var7[var5]] = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                     } else if (var8 == 35) {
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Interpreter_objectLocals[var7[var5]];
                     } else if (var8 == 36) {
                        Interpreter_objectLocals[var7[var5]] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661)
                           * -1595015587];
                     } else if (37 == var8) {
                        int var36 = var7[var5];
                        SecureRandomFuture.Interpreter_objectStackSize -= var36 * 831964661;
                        String var51 = WorldMapData_0.method7117(
                           Interpreter_objectStack, -1595015587 * SecureRandomFuture.Interpreter_objectStackSize, var36, -2088588527
                        );
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var51;
                     } else if (var8 == 38) {
                        class408.Interpreter_intStackSize -= -1793120611;
                     } else if (var8 == 39) {
                        SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
                     } else if (var8 == 40) {
                        if (-444245115 * Interpreter_frameDepth == 50) {
                           throw new RuntimeException();
                        }

                        int var35 = var7[var5];
                        Script var50 = class383.getScript(var35, 1747030670);
                        int[] var53 = new int[-58237571 * var50.localIntCount];
                        Object[] var15 = new Object[-14880459 * var50.localStringCount];
                        if (var50.intArgumentCount * -968069229 >= 0) {
                           System.arraycopy(
                              Interpreter_intStack,
                              0 + (327716789 * class408.Interpreter_intStackSize - var50.intArgumentCount * -968069229),
                              var53,
                              0,
                              -968069229 * var50.intArgumentCount
                           );
                        }

                        if (-1480905639 * var50.stringArgumentCount >= 0) {
                           System.arraycopy(
                              Interpreter_objectStack,
                              -1595015587 * SecureRandomFuture.Interpreter_objectStackSize - -1480905639 * var50.stringArgumentCount + 0,
                              var15,
                              0,
                              -1480905639 * var50.stringArgumentCount
                           );
                        }

                        class408.Interpreter_intStackSize = class408.Interpreter_intStackSize - 121454375 * var50.intArgumentCount;
                        SecureRandomFuture.Interpreter_objectStackSize = SecureRandomFuture.Interpreter_objectStackSize
                           - -1805128147 * var50.stringArgumentCount;
                        ScriptFrame var16 = new ScriptFrame();
                        var16.script = var1;
                        var16.pc = 1406577675 * var5;
                        var16.intLocals = class251.Interpreter_intLocals;
                        var16.stringLocals = Interpreter_objectLocals;
                        Interpreter_frames[(Interpreter_frameDepth += -383228595) * -444245115 - 1] = var16;
                        var1 = var50;
                        var6 = var50.opcodes;
                        var7 = var50.intOperands;
                        var5 = -1;
                        class251.Interpreter_intLocals = var53;
                        Interpreter_objectLocals = var15;
                     } else if (var8 == 42) {
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class166.varcs.getInt(var7[var5], (byte)1);
                     } else if (var8 == 43) {
                        Varcs.method3128(
                           class166.varcs, var7[var5], Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 2005873066
                        );
                     } else if (var8 == 44) {
                        int var34 = var7[var5] >> 16;
                        int var49 = var7[var5] & 65535;
                        int var52 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        if (var52 < 0 || var52 > 5000) {
                           throw new RuntimeException();
                        }

                        if (var49 == 115) {
                           Interpreter_objectLocals[var34] = new DynamicArray(class586.field6379, "", var52, var52);
                        } else if (105 != var49 && var49 != 49) {
                           Interpreter_objectLocals[var34] = new DynamicArray(class586.field6376, -1, var52, var52);
                        } else {
                           Interpreter_objectLocals[var34] = new DynamicArray(class586.field6376, 0, var52, var52);
                        }
                     } else if (45 == var8) {
                        DynamicArray var28 = class66.method1387(var7[var5], Interpreter_objectLocals[var7[var5]], -1355295071);
                        int var45 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                        class31.method666(var28, var45, -1313836652);
                        if (var28.field6107 == class586.field6376) {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var28.method11207(2053374425)[var45];
                        } else {
                           Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var28.method11214(
                              (byte)-73
                           )[var45];
                        }
                     } else if (var8 == 46) {
                        DynamicArray var29 = class66.method1387(var7[var5], Interpreter_objectLocals[var7[var5]], -2016214948);
                        if (!var29.field6109) {
                           throw new RuntimeException();
                        }

                        if (var29.field6107 == class586.field6376) {
                           class408.Interpreter_intStackSize -= 708726074;
                           int var46 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                           class31.method666(var29, var46, 44330032);
                           var29.method11207(2053374425)[var46] = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
                        } else {
                           int var47 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                           class31.method666(var29, var47, -713123233);
                           var29.method11214((byte)59)[var47] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661)
                              * -1595015587];
                        }
                     } else if (49 == var8) {
                        String var30 = class166.varcs.getString(var7[var5], (byte)43);
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var30;
                     } else if (var8 == 50) {
                        class166.varcs
                           .setString(
                              var7[var5],
                              (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
                              2043045110
                           );
                     } else if (60 == var8) {
                        IterableNodeHashTable var31 = var1.switches[var7[var5]];
                        IntegerNode var48 = (IntegerNode)var31.get((long)Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
                        if (null != var48) {
                           var5 += var48.integer;
                        }
                     } else if (63 == var8) {
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null;
                     } else if (var8 == 74) {
                        Integer var32 = FontName.field6342.getTitleGroupValue(var7[var5], (byte)4);
                        if (var32 == null) {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                        } else {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var32;
                        }
                     } else {
                        if (76 != var8) {
                           throw new IllegalStateException();
                        }

                        Integer var33 = class4.field14.method11181(var7[var5], (byte)3);
                        if (null == var33) {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                        } else {
                           Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var33;
                        }
                     }
                  } else {
                     boolean var27 = var1.intOperands[var5] == 1;
                     int var44 = FontName.method11651(var8, var1, var27, 451487583);
                     switch (var44) {
                        case 0:
                           var21 = false;
                           break label620;
                        case 1:
                        default:
                           break;
                        case 2:
                           throw new IllegalStateException();
                     }
                  }
               }
            } catch (Exception var22) {
               var9 = true;
               StringBuilder var11 = new StringBuilder(30);
               var11.append("").append(var1.key).append(" ");

               for (int var12 = Interpreter_frameDepth * -444245115 - 1; var12 >= 0; var12--) {
                  var11.append("").append(Interpreter_frames[var12].script.key).append(" ");
               }

               var11.append("").append(var8);
               PlayerType.RunException_sendStackTrace(var11.toString(), var22, 656656347);
               var21 = false;
               break label631;
            } finally {
               if (var21) {
                  while (!field344.isEmpty()) {
                     classDY var18 = (classDY)field344.remove(0);
                     FontName.widgetDefaultMenuAction(
                        var18.method3597(-30150376), var18.method3600((byte)-105), var18.method3601((short)1720), var18.method3605((byte)0), "", -1376442236
                     );
                  }

                  if (field345) {
                     field345 = false;
                     Login.method1274((byte)1);
                  }

                  if (!var9 && var3 > 0 && -2113340171 * field339 >= var3) {
                     PlayerType.RunException_sendStackTrace(
                        "Warning: Script " + var1.field1216 + " finished at op count " + field339 * -2113340171 + " of max " + var2, null, -1397055978
                     );
                  }
               }
            }

            while (!field344.isEmpty()) {
               classDY var14 = (classDY)field344.remove(0);
               FontName.widgetDefaultMenuAction(
                  var14.method3597(-75527728), var14.method3600((byte)-8), var14.method3601((short)-23160), var14.method3605((byte)0), "", -1376442236
               );
            }

            if (field345) {
               field345 = false;
               Login.method1274((byte)1);
            }

            if (!var9 && var3 > 0 && -2113340171 * field339 >= var3) {
               PlayerType.RunException_sendStackTrace(
                  "Warning: Script " + var1.field1216 + " finished at op count " + field339 * -2113340171 + " of max " + var2, null, -303793974
               );
            }

            return;
         }

         while (!field344.isEmpty()) {
            classDY var40 = (classDY)field344.remove(0);
            FontName.widgetDefaultMenuAction(
               var40.method3597(225083099), var40.method3600((byte)-18), var40.method3601((short)-13952), var40.method3605((byte)0), "", -1376442236
            );
         }

         if (field345) {
            field345 = false;
            Login.method1274((byte)1);
         }

         if (!var9 && var3 > 0 && -2113340171 * field339 >= var3) {
            PlayerType.RunException_sendStackTrace(
               "Warning: Script " + var1.field1216 + " finished at op count " + field339 * -2113340171 + " of max " + var2, null, -845433412
            );
         }

         return;
      }

      while (!field344.isEmpty()) {
         classDY var10 = (classDY)field344.remove(0);
         FontName.widgetDefaultMenuAction(
            var10.method3597(-28649507), var10.method3600((byte)-81), var10.method3601((short)-11777), var10.method3605((byte)0), "", -1376442236
         );
      }

      if (field345) {
         field345 = false;
         Login.method1274((byte)1);
      }

      if (!var9 && var3 > 0 && -2113340171 * field339 >= var3) {
         PlayerType.RunException_sendStackTrace(
            "Warning: Script " + var1.field1216 + " finished at op count " + field339 * -2113340171 + " of max " + var2, null, 1073622267
         );
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gp")
   static int method1101(int var0, Script var1, boolean var2) {
      if (var0 == 684027641) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 365090854) * -1503542245 - 1] = 1935182656 * client.publicChatMode;
         return 1;
      } else if (var0 == 155728411) {
         class408.Interpreter_intStackSize -= 701885904;
         client.publicChatMode = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -870349271;
         ClientPacket.privateChatMode = class461.method9279(Interpreter_intStack[1 + -1867197711 * class408.Interpreter_intStackSize], (byte)91);
         if (null == ClientPacket.privateChatMode) {
            ClientPacket.privateChatMode = PrivateChatMode.field6653;
         }

         client.tradeChatMode = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize] * -2024629037;
         PacketBufferNode var20 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3906, client.packetWriter.isaacCipher, -1302025922);
         var20.packetBuffer.writeByte(client.publicChatMode * -1119152412, (short)-18882);
         var20.packetBuffer.writeByte(ClientPacket.privateChatMode.field6650 * -1408231813, (short)-21859);
         var20.packetBuffer.writeByte(-1536957932 * client.tradeChatMode, (short)-31725);
         PacketWriter.method3330(client.packetWriter, var20, -1771370198);
         return 1;
      } else if (5002 == var0) {
         String var19 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class408.Interpreter_intStackSize -= 7085058;
         int var27 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var32 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         PacketBufferNode var34 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3938, client.packetWriter.isaacCipher, -1857204134);
         var34.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var19, 1369992517) + 2, (short)-6568);
         var34.packetBuffer.writeStringCp1252NullTerminated(var19, 998990159);
         var34.packetBuffer.writeByte(var27 - 1, (short)-16894);
         var34.packetBuffer.writeByte(var32, (short)-2377);
         PacketWriter.method3330(client.packetWriter, var34, -1771370198);
         return 1;
      } else if (var0 == 5003) {
         class408.Interpreter_intStackSize -= -184571611;
         int var18 = Interpreter_intStack[-1145073911 * class408.Interpreter_intStackSize];
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * 568222650 + 1];
         Message var31 = class70.Messages_getByChannelAndID(var18, var26, (byte)1);
         if (var31 != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -630383157) * -172655187 - 1] = var31.count * 1876094597;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var31.cycle * 1755101527;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 389669461 - 1] = var31.sender != null ? var31.sender : "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1979628363 - 1] = var31.prefix != null ? var31.prefix : "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var31.text ? var31.text : "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1682271753) * 618123960 - 1] = var31.isFromFriend(-984916291)
               ? 1
               : (var31.isFromIgnored(782484908) ? 2 : 0);
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 632736745 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -463745509) * -1595015587 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -224599641) * -1595015587 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 2051061082) * -1595015587 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -2096034104) * -137640517 - 1] = 0;
         }

         return 1;
      } else if (211374966 == var0) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1510880996];
         Message var25 = ArchiveLoader.Messages_getMessage(var17, (byte)0);
         if (null != var25) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 2139697681 - 1] = var25.type * 139677055;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var25.cycle * 1863814373;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 352442507) * 1917514103 - 1] = var25.sender != null ? var25.sender : "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var25.prefix ? var25.prefix : "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var25.text != null ? var25.text : "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1873140026) * 1326692336 - 1] = var25.isFromFriend(-1776286835)
               ? 1
               : (var25.isFromIgnored(782484908) ? 2 : 0);
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -147971444) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -153190750) * -1595015587 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1394945088) * -1595015587 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1323564577 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 2090305901 - 1] = 0;
         }

         return 1;
      } else if (5005 == var0) {
         if (ClientPacket.privateChatMode == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -442706494) * -38592931 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -929137202) * 327716789 - 1] = -1408231813 * ClientPacket.privateChatMode.field6650;
         }

         return 1;
      } else if (var0 == 5008) {
         String var16 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 103479926) * 327716789];
         PacketBufferNode var30 = class184.method4483(var24, var16, class352.clientLanguage, -1, 1613763624);
         PacketWriter.method3330(client.packetWriter, var30, -1771370198);
         return 1;
      } else if (var0 == -1030563387) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         String var15 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * 1915531353];
         String var23 = (String)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
         PacketBufferNode var29 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3871, client.packetWriter.isaacCipher, -1412630707);
         var29.packetBuffer.writeShort(0, -1640983351);
         int var33 = 2108391709 * var29.packetBuffer.offset;
         var29.packetBuffer.writeStringCp1252NullTerminated(var15, 998990159);
         classLN.method7205(var29.packetBuffer, var23, -293496581);
         var29.packetBuffer.method11977(405350517 * var29.packetBuffer.offset - var33, (byte)42);
         PacketWriter.method3330(client.packetWriter, var29, -1771370198);
         return 1;
      } else if (var0 == 800583504) {
         String var14 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -257231455];
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var28 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 612646519];
         PacketBufferNode var6 = class184.method4483(var22, var14, class352.clientLanguage, var28, 371786123);
         PacketWriter.method3330(client.packetWriter, var6, -1771370198);
         return 1;
      } else if (var0 != -1863418893) {
         if (var0 == 536749802) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.tradeChatMode * -1546032189;
            return 1;
         } else if (var0 == 5017) {
            int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 150680402) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1811266148 - 1] = KeyHandler.Messages_getHistorySize(var13, 421673862);
            return 1;
         } else if (-618732467 == var0) {
            int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1415264080) * 208985664];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 825958427 - 1] = FontName.Messages_getLastChatID(var12, (byte)-78);
            return 1;
         } else if (5019 == var0) {
            int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1517700397) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -912450495) * 553452603 - 1] = class194.method4477(var11, (byte)-5);
            return 1;
         } else if (-294055765 == var0) {
            String var10 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            GrandExchangeOfferOwnWorldComparator.doCheat(var10, -895792833);
            return 1;
         } else if (5021 == var0) {
            client.field766 = ((String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587])
               .toLowerCase()
               .trim();
            return 1;
         } else if (5022 == var0) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = client.field766;
            return 1;
         } else if (var0 == 5023) {
            String var9 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * 529924788];
            System.out.println(var9);
            return 1;
         } else if (var0 == 5030) {
            class408.Interpreter_intStackSize -= -376200011;
            int var8 = Interpreter_intStack[class408.Interpreter_intStackSize * -974716721];
            int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            Message var5 = class70.Messages_getByChannelAndID(var8, var21, (byte)1);
            if (var5 != null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -678051652) * 327716789 - 1] = var5.count * -1444437665;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -233959981) * 327716789 - 1] = var5.cycle * 1755101527;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1174625702) * -990065996 - 1] = null != var5.sender
                  ? var5.sender
                  : "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 592344140) * -1917886599 - 1] = var5.prefix != null
                  ? var5.prefix
                  : "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var5.text != null ? var5.text : "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -152125720) * 1063219690 - 1] = var5.isFromFriend(1570799931)
                  ? 1
                  : (var5.isFromIgnored(782484908) ? 2 : 0);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -19023765) * -1595015587 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -195379233) * 327716789 - 1] = -1;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 44617911) * 302285315 - 1] = "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1567980191) * -1595015587 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += 489011366) * -1967654458 - 1] = 0;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (var0 == 5031) {
            int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Message var4 = ArchiveLoader.Messages_getMessage(var7, (byte)0);
            if (null != var4) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1951113593 - 1] = -1475546943 * var4.type;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1029802074) * 595102470 - 1] = 997596813 * var4.cycle;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var4.sender
                  ? var4.sender
                  : "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var4.prefix
                  ? var4.prefix
                  : "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -869122869) * -776367247 - 1] = null != var4.text ? var4.text : "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1143068762) * 235779196 - 1] = var4.isFromFriend(1087320871)
                  ? 1
                  : (var4.isFromIgnored(782484908) ? 2 : 0);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1080798511) * -2007814619 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1046643187) * -1497033414 - 1] = 0;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -807667802 - 1] = -1;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -337840124) * -1595015587 - 1] = "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1686470713 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -372585738) * 327716789 - 1] = 0;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         String var3;
         if (class330.localPlayer != null && class330.localPlayer.username != null) {
            var3 = Username.method12702(class330.localPlayer.username, (byte)-37);
         } else {
            var3 = "";
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var3;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gc")
   static int method1102(int var0, Script var1, boolean var2) {
      if (var0 == -316838005) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1492781764) * 327716789 - 1] = 286094873 * client.publicChatMode;
         return 1;
      } else if (var0 == 1015872224) {
         class408.Interpreter_intStackSize -= -1084394537;
         client.publicChatMode = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -870349271;
         ClientPacket.privateChatMode = class461.method9279(Interpreter_intStack[1 + -30054466 * class408.Interpreter_intStackSize], (byte)41);
         if (null == ClientPacket.privateChatMode) {
            ClientPacket.privateChatMode = PrivateChatMode.field6653;
         }

         client.tradeChatMode = Interpreter_intStack[2 + -261978314 * class408.Interpreter_intStackSize] * 1569742059;
         PacketBufferNode var20 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3906, client.packetWriter.isaacCipher, -2075555401);
         var20.packetBuffer.writeByte(client.publicChatMode * 286094873, (short)-6132);
         var20.packetBuffer.writeByte(ClientPacket.privateChatMode.field6650 * 239834769, (short)-24946);
         var20.packetBuffer.writeByte(-1546032189 * client.tradeChatMode, (short)-18732);
         PacketWriter.method3330(client.packetWriter, var20, -1771370198);
         return 1;
      } else if (366681790 == var0) {
         String var19 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * 2132232822];
         class408.Interpreter_intStackSize -= 708726074;
         int var27 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var32 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         PacketBufferNode var34 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3938, client.packetWriter.isaacCipher, -1976866196);
         var34.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var19, 1518075476) + 2, (short)-24511);
         var34.packetBuffer.writeStringCp1252NullTerminated(var19, 998990159);
         var34.packetBuffer.writeByte(var27 - 1, (short)-18746);
         var34.packetBuffer.writeByte(var32, (short)-22758);
         PacketWriter.method3330(client.packetWriter, var34, -1771370198);
         return 1;
      } else if (var0 == 254407792) {
         class408.Interpreter_intStackSize -= -510930982;
         int var18 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * 840593367 + 1];
         Message var31 = class70.Messages_getByChannelAndID(var18, var26, (byte)1);
         if (var31 != null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1226046029 - 1] = var31.count * 380472083;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1315769847) * 327716789 - 1] = var31.cycle * 1755101527;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1845455597) * -1595015587 - 1] = var31.sender != null
               ? var31.sender
               : "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -11625098) * -1595015587 - 1] = var31.prefix != null ? var31.prefix : "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -149079972 - 1] = null != var31.text ? var31.text : "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -219267816 - 1] = var31.isFromFriend(-1467065751)
               ? 1
               : (var31.isFromIgnored(782484908) ? 2 : 0);
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 334317758) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -154508100 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 2025036009) * 1232249821 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -839693966) * -1595015587 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1761743261 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         }

         return 1;
      } else if (806836403 == var0) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 614533307) * 966664884];
         Message var25 = ArchiveLoader.Messages_getMessage(var17, (byte)0);
         if (null != var25) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 864547033) * 1095677710 - 1] = var25.type * -2019424214;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 134245549) * 327716789 - 1] = var25.cycle * 1755101527;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1603173348) * 238344251 - 1] = var25.sender != null ? var25.sender : "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -930026872 - 1] = null != var25.prefix ? var25.prefix : "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1401131725) * -965646522 - 1] = var25.text != null ? var25.text : "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1429194454 - 1] = var25.isFromFriend(-417785651)
               ? 1
               : (var25.isFromIgnored(782484908) ? 2 : 0);
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1057243785) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1808070774 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1500356836) * 1090277554 - 1] = 0;
         }

         return 1;
      } else if (5005 == var0) {
         if (ClientPacket.privateChatMode == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1762097763) * 327716789 - 1] = -1408231813 * ClientPacket.privateChatMode.field6650;
         }

         return 1;
      } else if (var0 == 6372716) {
         String var16 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -2028549935) * 1056615409];
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 375232611) * 327716789];
         PacketBufferNode var30 = class184.method4483(var24, var16, class352.clientLanguage, -1, 1930985414);
         PacketWriter.method3330(client.packetWriter, var30, -1771370198);
         return 1;
      } else if (var0 == -181459679) {
         SecureRandomFuture.Interpreter_objectStackSize -= 2034304207;
         String var15 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * 1988714414];
         String var23 = (String)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -889855314];
         PacketBufferNode var29 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3871, client.packetWriter.isaacCipher, -1521429010);
         var29.packetBuffer.writeShort(0, -1252774781);
         int var33 = 1328361806 * var29.packetBuffer.offset;
         var29.packetBuffer.writeStringCp1252NullTerminated(var15, 998990159);
         classLN.method7205(var29.packetBuffer, var23, -293496581);
         var29.packetBuffer.method11977(2108391709 * var29.packetBuffer.offset - var33, (byte)127);
         PacketWriter.method3330(client.packetWriter, var29, -1771370198);
         return 1;
      } else if (var0 == 5010) {
         String var14 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[class408.Interpreter_intStackSize * -1696665370];
         int var28 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         PacketBufferNode var6 = class184.method4483(var22, var14, class352.clientLanguage, var28, 1231256142);
         PacketWriter.method3330(client.packetWriter, var6, -1771370198);
         return 1;
      } else if (var0 != -164550688) {
         if (var0 == -1983169871) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.tradeChatMode * 1890083113;
            return 1;
         } else if (var0 == 1697383758) {
            int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1296581681) * -609972342];
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1629539786) * 327716789 - 1] = KeyHandler.Messages_getHistorySize(var13, 421673862);
            return 1;
         } else if (5018 == var0) {
            int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 2035510881) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1580804767 - 1] = FontName.Messages_getLastChatID(var12, (byte)-23);
            return 1;
         } else if (2063334788 == var0) {
            int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1821031369) * -1033701];
            Interpreter_intStack[(class408.Interpreter_intStackSize += 303684080) * 361225857 - 1] = class194.method4477(var11, (byte)99);
            return 1;
         } else if (24786004 == var0) {
            String var10 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1213675599) * -1595015587];
            GrandExchangeOfferOwnWorldComparator.doCheat(var10, -1132036311);
            return 1;
         } else if (-365032690 == var0) {
            client.field766 = ((String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1008922253])
               .toLowerCase()
               .trim();
            return 1;
         } else if (181256244 == var0) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1237303733) * 280964174 - 1] = client.field766;
            return 1;
         } else if (var0 == -673393316) {
            String var9 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -374843191];
            System.out.println(var9);
            return 1;
         } else if (var0 == 5030) {
            class408.Interpreter_intStackSize -= 708726074;
            int var8 = Interpreter_intStack[class408.Interpreter_intStackSize * 1184002774];
            int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            Message var5 = class70.Messages_getByChannelAndID(var8, var21, (byte)1);
            if (var5 != null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5.count * 380472083;
               Interpreter_intStack[(class408.Interpreter_intStackSize += 767434267) * 1318189682 - 1] = var5.cycle * 1755101527;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 270707203) * -1595015587 - 1] = null != var5.sender
                  ? var5.sender
                  : "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1570665518) * 1258309511 - 1] = var5.prefix != null
                  ? var5.prefix
                  : "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var5.text != null ? var5.text : "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1309958111) * 327716789 - 1] = var5.isFromFriend(824762284)
                  ? 1
                  : (var5.isFromIgnored(782484908) ? 2 : 0);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1505901009) * 327716789 - 1] = -1;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1833332185) * 327716789 - 1] = 0;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1223839885 - 1] = "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 562216725) * -1538275899 - 1] = "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 626187253) * -1595015587 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -298484207) * 327716789 - 1] = 0;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -17814506 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1002140537 - 1] = 0;
            }

            return 1;
         } else if (var0 == 5031) {
            int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Message var4 = ArchiveLoader.Messages_getMessage(var7, (byte)0);
            if (null != var4) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -988114696) * -322654543 - 1] = 227619424 * var4.type;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 81174993 - 1] = 1755101527 * var4.cycle;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 63711348 - 1] = null != var4.sender ? var4.sender : "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -150043354) * -1595015587 - 1] = null != var4.prefix
                  ? var4.prefix
                  : "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 518940515) * 534406205 - 1] = null != var4.text ? var4.text : "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += 767993406) * 327716789 - 1] = var4.isFromFriend(1667234649)
                  ? 1
                  : (var4.isFromIgnored(782484908) ? 2 : 0);
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 486317405) * 815248143 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -758065507) * 13956015 - 1] = 0;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1123824736) * 327716789 - 1] = -1;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 324826095 - 1] = 0;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1179609617 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += -533122273) * 327716789 - 1] = 0;
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter_intStack[(class408.Interpreter_intStackSize += 1336591882) * 974916797 - 1] = 0;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         String var3;
         if (class330.localPlayer != null && class330.localPlayer.username != null) {
            var3 = Username.method12702(class330.localPlayer.username, (byte)20);
         } else {
            var3 = "";
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 1832755477 - 1] = var3;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gi")
   static int method1104(int var0, Script var1, boolean var2) {
      if (var0 == 5306) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 711722339) * 327716789 - 1] = class182.getWindowedMode(-156808631);
         return 1;
      } else if (-1964253931 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (1 == var4 || var4 == 2) {
            MouseHandler.setWindowedMode(var4, 1657294633);
         }

         return 1;
      } else if (5308 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class468.clientPreferences.getWindowMode((byte)9);
         return 1;
      } else if (var0 != -1453678289) {
         if (var0 == 5310) {
            class408.Interpreter_intStackSize -= 1999785638;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 389094806) * -723424212];
         if (var3 == 1 || var3 == 2) {
            class468.clientPreferences.updateWindowMode(var3, 540161249);
         }

         return 1;
      }
   }

   Interpreter() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("dr")
   static int method1018(int var0, Script var1, boolean var2) {
      if (100 == var0) {
         class408.Interpreter_intStackSize -= -1498215165;
         int var32 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var48 = Interpreter_intStack[1 + 459986967 * class408.Interpreter_intStackSize];
         int var59 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         boolean var68 = Interpreter_intStack[3 + class408.Interpreter_intStackSize * -609342453] != 0;
         Widget var76 = class226.widgetDefinition.method7953(var32, -1735869277);
         if (-1280950603 * var76.type != 0) {
            throw new RuntimeException("");
         } else {
            GrandExchangeOfferOwnWorldComparator.method1278(var76, var59, var68, var1, 56334269);
            Widget var80 = new Widget();
            var80.type = var48 * 1068233820;
            var80.parentId = (var80.id = var76.id * 1) * -1601929789;
            var80.childIndex = 1657618603 * var59;
            var80.isIf3 = true;
            if (var48 == 12) {
               SongTask.method10543(var80, (short)14050);
            }

            var76.children[var59] = var80;
            if (var2) {
               UserComparator3.scriptDotWidget = var80;
            } else {
               class222.scriptActiveWidget = var80;
            }

            class376.invalidateWidget(var76, (byte)5);
            return 1;
         }
      } else if (1482202184 == var0) {
         Widget var31 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var47 = class226.widgetDefinition.method7953(278777747 * var31.id, -37752240);
         ClickAction.method11249(var31, var47, (short)31735);
         class376.invalidateWidget(var47, (byte)5);
         return 1;
      } else if (var0 == 1191653104) {
         class408.Interpreter_intStackSize -= 1709006426;
         int var30 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Widget var46 = class226.widgetDefinition.method7953(var30, 370583797);
         var46.children = null;
         class376.invalidateWidget(var46, (byte)5);
         return 1;
      } else if (var0 == 105) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var29 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[1 + -306717553 * class408.Interpreter_intStackSize];
         int var58 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         Widget var67 = class226.widgetDefinition.method7953(var29, -1725078853);
         Widget var75 = class226.widgetDefinition.getWidgetChild(var29, var45, -663756538);
         if (null == var67) {
            throw new RuntimeException("");
         } else if (var45 < 0) {
            throw new RuntimeException("");
         } else if (var75 == null) {
            throw new RuntimeException("");
         } else if (0 == 928687775 * var75.type) {
            throw new RuntimeException("");
         } else {
            GrandExchangeOfferOwnWorldComparator.method1278(var67, var58, true, var1, 53867884);
            if (-1 != var75.field4451 * 1865628485) {
               Widget var78 = class226.widgetDefinition.getWidgetChild(var29, var75.field4451 * 1865628485, -1581555809);
               class418.method9195(var78, var58, (byte)0);
            }

            Widget var79 = new Widget(var75);
            var79.childIndex = var58 * 1657618603;
            if (12 == var75.type * 928687775) {
               SongTask.method10543(var79, (short)15253);
            }

            var67.children[var58] = var79;
            if (var2) {
               UserComparator3.scriptDotWidget = var79;
            } else {
               class222.scriptActiveWidget = var79;
            }

            class376.invalidateWidget(var67, (byte)5);
            return 1;
         }
      } else if (106 == var0) {
         class408.Interpreter_intStackSize -= 936566998;
         int var28 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         Widget var57 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var57 == null) {
            throw new RuntimeException("");
         } else {
            Widget var66 = class226.widgetDefinition.method7953(var57.parentId * 1688193610, -1366119580);
            if (0 != var57.type * 385850578) {
               throw new RuntimeException("");
            } else if (0 != var66.type * 928687775) {
               throw new RuntimeException();
            } else {
               GrandExchangeOfferOwnWorldComparator.method1278(var66, var44, true, var1, -1310499904);
               class418.method9195(var57, var44, (byte)0);
               Widget var74 = new Widget();
               var74.type = -1366575660 * var28;
               var74.parentId = (var74.id = 1 * var66.id) * -1325885956;
               var74.field4451 = var57.childIndex * -1613901657;
               var74.childIndex = 1657618603 * var44;
               var74.isIf3 = true;
               if (var28 == 12) {
                  SongTask.method10543(var74, (short)25772);
               }

               var66.children[var44] = var74;
               if (var2) {
                  UserComparator3.scriptDotWidget = var74;
               } else {
                  class222.scriptActiveWidget = var74;
               }

               class376.invalidateWidget(var66, (byte)5);
               return 1;
            }
         }
      } else if (107 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var27 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Widget var56 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var56 == null) {
            throw new RuntimeException("");
         } else {
            Widget var65 = class226.widgetDefinition.getWidgetChild(var56.parentId * 794900977, var56.field4451 * 97102591, -1030356347);
            Widget var73 = class226.widgetDefinition.method7953(794900977 * var65.parentId, 1121801937);
            if (928687775 * var65.type != 0) {
               throw new RuntimeException("");
            } else if (0 != var73.type * 2008077993) {
               throw new RuntimeException();
            } else {
               GrandExchangeOfferOwnWorldComparator.method1278(var73, var43, true, var1, 1403927275);
               class418.method9195(var65, var43, (byte)0);
               Widget var77 = new Widget();
               var77.type = -2019328465 * var27;
               var77.parentId = (var77.id = var73.id * 1) * -165784051;
               var77.field4451 = var65.childIndex * -129976842;
               var77.childIndex = 1657618603 * var43;
               var77.isIf3 = true;
               if (var27 == 12) {
                  SongTask.method10543(var77, (short)21637);
               }

               var73.children[var43] = var77;
               if (var2) {
                  UserComparator3.scriptDotWidget = var77;
               } else {
                  class222.scriptActiveWidget = var77;
               }

               class376.invalidateWidget(var73, (byte)5);
               return 1;
            }
         }
      } else if (var0 == 1738268780) {
         class408.Interpreter_intStackSize -= 708726074;
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var42 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Widget var55 = var42 != -1 ? class226.widgetDefinition.getWidgetChild(var26, var42, -1780039702) : null;
         WorldMapRectangle.method7261(var55, var2, -614867260);
         return 1;
      } else if (201 == var0) {
         WorldMapRectangle.method7261(
            class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= 136683544) * -1846738632], -1269776236),
            var2,
            -564607005
         );
         return 1;
      } else if (204 == var0) {
         Widget var25 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var41 = null != var25 ? class226.widgetDefinition.getWidgetChild(var25.parentId * 856986172, var25.field4451 * 1865628485, -1581878690) : null;
         WorldMapRectangle.method7261(var41, var2, -1653748772);
         return 1;
      } else if (205 == var0) {
         Widget var24 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Widget var40 = null != var24 ? class226.widgetDefinition.method7953(var24.parentId * 794900977, -2002326705) : null;
         WorldMapRectangle.method7261(var40, var2, -974887877);
         return 1;
      } else if (var0 == 206) {
         Widget var23 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var23 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 712112350) * 327716789 - 1] = 0;
            return 1;
         } else if (var23.childIndex * 2077538819 == -1) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            Widget var39 = class226.widgetDefinition.method7953(var23.parentId * -454100703, 396431228);
            Widget var54 = null;

            for (int var64 = var23.childIndex * 2077538819 + 1; var64 < var39.children.length; var64++) {
               Widget var72 = var39.children[var64];
               if (null != var72 && var72.field4451 * 396355050 == var23.field4451 * -1128324334) {
                  var54 = var72;
                  break;
               }
            }

            WorldMapRectangle.method7261(var54, var2, -1483563781);
            return 1;
         }
      } else if (-1560566335 == var0) {
         Widget var22 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (null == var22) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1086483498 - 1] = 0;
            return 1;
         } else if (var22.childIndex * 1696434457 == -1) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -973443469 - 1] = 0;
            return 1;
         } else {
            Widget var38 = class226.widgetDefinition.method7953(-925511388 * var22.parentId, 1893057068);
            Widget var53 = null;

            for (int var63 = -1400015449 * var22.childIndex - 1; var63 >= 0; var63--) {
               Widget var71 = var38.children[var63];
               if (var71 != null && var22.field4451 * 766122807 == 688288527 * var71.field4451) {
                  var53 = var71;
                  break;
               }
            }

            WorldMapRectangle.method7261(var53, var2, -7465230);
            return 1;
         }
      } else if (var0 == 1936005580) {
         Widget var21 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (null == var21) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1664889115 - 1] = 0;
            return 1;
         } else if (0 != var21.type * -1582988787) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 790087045) * 327716789 - 1] = 0;
            return 1;
         } else {
            Widget var37 = class226.widgetDefinition.method7953(794900977 * var21.parentId, -952984202);
            if (var37.children == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1295313519) * 327716789 - 1] = 0;
               return 1;
            } else {
               int var52 = 0;

               for (int var62 = 0; var62 < var37.children.length; var62++) {
                  Widget var70 = var37.children[var62];
                  if (var70 != null && 1865628485 * var70.field4451 == var21.childIndex * 2077538819) {
                     var52++;
                  }
               }

               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1899154532 - 1] = var52;
               return 1;
            }
         }
      } else if (var0 == 209) {
         Widget var20 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -237749679) * 327716789 - 1] = var20 != null ? 265541365 * var20.field4451 : -1;
         return 1;
      } else if (210 == var0) {
         int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 99036744) * 327716789];
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var51 = class39.method651(var19, 812535179);
         int var61 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -721948691];
         Object var69 = class39.method651(var36, 714878285);
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         ParamComposition var9 = WorldMap.getParamDefinition(var8, -1930907242);
         Object var10 = ParamComposition.method4969(var9, 211959081) ? var9.defaultStr : -481358049 * var9.defaultInt;
         Object var11 = null;
         if (var61 >= 0) {
            ParamComposition var12 = WorldMap.getParamDefinition(var61, -1062467952);
            var11 = ParamComposition.method4969(var12, -850143479) ? var12.defaultStr : 1711583028 * var12.defaultInt;
         }

         Widget var81 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1644437504) * 327716789], -1548845788);
         Widget var13 = null;
         if (var81 != null && null != var81.children) {
            for (int var14 = 0; var14 < var81.children.length; var14++) {
               Widget var15 = var81.children[var14];
               if (null != var15
                  && (var8 < 0 || var15.method8068(var8, var10, (byte)43).equals(var69))
                  && (var61 < 0 || var15.method8068(var61, var11, (byte)21).equals(var51))) {
                  var13 = var15;
                  break;
               }
            }
         }

         WorldMapRectangle.method7261(var13, var2, -1404149111);
         return 1;
      } else if (var0 == 594222366) {
         class408.Interpreter_intStackSize -= 1165768513;
         int var18 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Widget var35 = class226.widgetDefinition.method7953(Interpreter_intStack[class408.Interpreter_intStackSize * -410432287 + 1], 439563080);
         int var50 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         field340.method8241(var18, var35, var50, (byte)121);
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1628153400) * 327716789 - 1] = field340.method8251(-1696887821);
         return 1;
      } else if (var0 == 212) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -521421434) * -1377483398];
         Widget var34 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var34.childIndex * -1752185906 == -1) {
            field340.method8241(var17, var34, -1, (byte)39);
         } else {
            field340.method8241(var17, class226.widgetDefinition.method7953(var34.parentId * 1490436529, 1467371856), var34.childIndex * 2077538819, (byte)17);
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1693651851) * 327716789 - 1] = field340.method8251(1926232420);
         return 1;
      } else if (var0 == 213) {
         WorldMapRectangle.method7261(field340.method8255(-1682118864), var2, -1200495082);
         return 1;
      } else if (214 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1991336880) * 1973580637 - 1] = field340.method8259((short)20305);
         return 1;
      } else if (var0 == -1563390467) {
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class356.method7752(
            class380.method8267(field340, 760199821), -1659944568
         );
         return 1;
      } else if (-1868496080 == var0) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 889359883) * 327716789];
         Object var33 = class39.method651(var16, 816907253);
         int var49 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1356309955];
         ParamComposition var60 = WorldMap.getParamDefinition(var49, -738101849);
         Object var7 = ParamComposition.method4969(var60, 304464051) ? var60.defaultStr : -1904788231 * var60.defaultInt;
         class380.method8270(field340, var49, var33, var7, -651505321);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1597720780) * -817737544 - 1] = field340.method8251(-935240092);
         return 1;
      } else if (217 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1900599623) * 546426219];
         Widget var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (var4 == null) {
            throw new RuntimeException("");
         } else if (0 != 1228939444 * var4.type) {
            throw new RuntimeException("");
         } else {
            Widget var5 = class226.widgetDefinition.method7953(794900977 * var4.parentId, -2127658177);
            if (-2011068348 * var5.type != 0) {
               throw new RuntimeException();
            } else {
               Widget var6 = GrandExchangeOfferOwnWorldComparator.method1279(var3, var5, var4, -2047160838);
               WorldMapRectangle.method7261(var6, var2, -1416154836);
               return 1;
            }
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hi")
   static int method1105(int var0, Script var1, boolean var2) {
      if (var0 == 5306) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class182.getWindowedMode(-14824335);
         return 1;
      } else if (5307 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (1 == var4 || var4 == 2) {
            MouseHandler.setWindowedMode(var4, 1354364121);
         }

         return 1;
      } else if (5308 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class468.clientPreferences.getWindowMode((byte)9);
         return 1;
      } else if (var0 != 5309) {
         if (var0 == 5310) {
            class408.Interpreter_intStackSize -= -1793120611;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var3 == 1 || var3 == 2) {
            class468.clientPreferences.updateWindowMode(var3, 132453022);
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hg")
   static int method1106(int var0, Script var1, boolean var2) {
      if (var0 == 5306) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class182.getWindowedMode(-782583355);
         return 1;
      } else if (5307 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (1 == var4 || var4 == 2) {
            MouseHandler.setWindowedMode(var4, 1599252809);
         }

         return 1;
      } else if (5308 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class468.clientPreferences.getWindowMode((byte)9);
         return 1;
      } else if (var0 != 5309) {
         if (var0 == 5310) {
            class408.Interpreter_intStackSize -= -1793120611;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var3 == 1 || var3 == 2) {
            class468.clientPreferences.updateWindowMode(var3, 2050423465);
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ig")
   static int method1131(int var0, Script var1, boolean var2) {
      if (-201936613 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -2024304128 - 1] = WidgetConfigNode.method7991((byte)7) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hj")
   static int method1109(int var0, Script var1, boolean var2) {
      if (5630 == var0) {
         client.logoutTimer = 485255766;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;III)V")
   @ObfuscatedName("el")
   static final void method1040(Widget var0, int var1, int var2, int var3) {
      if (var0.field4560 == null) {
         throw new RuntimeException();
      } else {
         var0.field4560[var1] = var2;
         var0.field4561[var1] = var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hq")
   static int method1111(int var0) {
      return (int)Math.pow(2.0, var0 / 256.0F + 7.0F);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hn")
   static int method1112(int var0) {
      return (int)Math.pow(2.0, var0 / 256.0F + 7.0F);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hz")
   static int method1113(int var0) {
      return (int)((Math.log(var0) / field334 - 7.0) * 256.0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hb")
   static int method1114(int var0) {
      return (int)((Math.log(var0) / field334 - 7.0) * 256.0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hc")
   static int method1115(int var0, Script var1, boolean var2) {
      if (var0 == 6200) {
         class408.Interpreter_intStackSize -= 708726074;
         client.field695 = (short)SequenceDefinition.method5265(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789], 1207428375);
         if (client.field695 <= 0) {
            client.field695 = 256;
         }

         client.field696 = (short)SequenceDefinition.method5265(Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789], -807005774);
         if (client.field696 <= 0) {
            client.field696 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class408.Interpreter_intStackSize -= 708726074;
         client.zoomHeight = (short)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         if (client.zoomHeight <= 0) {
            client.zoomHeight = 256;
         }

         client.zoomWidth = (short)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         if (client.zoomWidth <= 0) {
            client.zoomWidth = 320;
         }

         return 1;
      } else if (6202 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         client.field699 = (short)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         if (client.field699 <= 0) {
            client.field699 = 1;
         }

         client.field638 = (short)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         if (client.field638 <= 0) {
            client.field638 = 32767;
         } else if (client.field638 < client.field699) {
            client.field638 = client.field699;
         }

         client.field700 = (short)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         if (client.field700 <= 0) {
            client.field700 = 1;
         }

         client.field701 = (short)Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789];
         if (client.field701 <= 0) {
            client.field701 = 32767;
         } else if (client.field701 < client.field700) {
            client.field701 = client.field700;
         }

         return 1;
      } else if (6203 == var0) {
         if (null != client.viewportWidget) {
            SoundCache.setViewportShape(0, 0, -1946208531 * client.viewportWidget.width, client.viewportWidget.height * -905446999, false, 2010683966);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.viewportWidth * 164941911;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.viewportHeight * 620574401;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.zoomHeight;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.zoomWidth;
         return 1;
      } else if (6205 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class160.method4229(client.field695, -194987070);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class160.method4229(client.field696, 1394604546);
         return 1;
      } else if (6220 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         return 1;
      } else if (6221 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 120179835 * class489.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 19292887 * class374.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hh")
   static int method1116(int var0, Script var1, boolean var2) {
      if (var0 == 6200) {
         class408.Interpreter_intStackSize -= 708726074;
         client.field695 = (short)SequenceDefinition.method5265(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789], -1629257654);
         if (client.field695 <= 0) {
            client.field695 = 256;
         }

         client.field696 = (short)SequenceDefinition.method5265(Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789], -933531562);
         if (client.field696 <= 0) {
            client.field696 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class408.Interpreter_intStackSize -= 708726074;
         client.zoomHeight = (short)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         if (client.zoomHeight <= 0) {
            client.zoomHeight = 256;
         }

         client.zoomWidth = (short)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         if (client.zoomWidth <= 0) {
            client.zoomWidth = 320;
         }

         return 1;
      } else if (6202 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         client.field699 = (short)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         if (client.field699 <= 0) {
            client.field699 = 1;
         }

         client.field638 = (short)Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         if (client.field638 <= 0) {
            client.field638 = 32767;
         } else if (client.field638 < client.field699) {
            client.field638 = client.field699;
         }

         client.field700 = (short)Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         if (client.field700 <= 0) {
            client.field700 = 1;
         }

         client.field701 = (short)Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789];
         if (client.field701 <= 0) {
            client.field701 = 32767;
         } else if (client.field701 < client.field700) {
            client.field701 = client.field700;
         }

         return 1;
      } else if (6203 == var0) {
         if (null != client.viewportWidget) {
            SoundCache.setViewportShape(0, 0, -1946208531 * client.viewportWidget.width, client.viewportWidget.height * -905446999, false, -1468431834);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.viewportWidth * 164941911;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.viewportHeight * 620574401;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.zoomHeight;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.zoomWidth;
         return 1;
      } else if (6205 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class160.method4229(client.field695, 1294980007);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class160.method4229(client.field696, 1165301408);
         return 1;
      } else if (6220 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         return 1;
      } else if (6221 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 120179835 * class489.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 19292887 * class374.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;I[B[B)V")
   @ObfuscatedName("ej")
   static final void method1039(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field4557) {
         if (null == var2) {
            return;
         }

         var0.field4557 = new byte[11][];
         var0.field4452 = new byte[11][];
         var0.field4560 = new int[11];
         var0.field4561 = new int[11];
      }

      var0.field4557[var1] = var2;
      if (null != var2) {
         var0.field4460 = true;
      } else {
         var0.field4460 = false;

         for (int var4 = 0; var4 < var0.field4557.length; var4++) {
            if (var0.field4557[var4] != null) {
               var0.field4460 = true;
               break;
            }
         }
      }

      var0.field4452[var1] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hl")
   static int method1117(int var0, Script var1, boolean var2) {
      if (6500 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 406833917 - 1] = class406.loadWorlds(879040885) ? 1 : 0;
         return 1;
      } else if (6501 == var0) {
         World var14 = class339.worldListStart(101351507);
         if (null != var14) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -692868316 - 1] = 789563243 * var14.population;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14.location * -607869593;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -921900267) * 488983281 - 1] = var14.activity;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14.index * -428025341;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14.properties * 1052456010;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1902565100) * -2131554255 - 1] = var14.host;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1807918745 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1995876561 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1555785482) * -1155024450 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 2052616260) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1709256234 - 1] = "";
         }

         return 1;
      } else if (var0 == 6502) {
         World var13 = class217.getNextWorldListWorld(-1752272508);
         if (null != var13) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1423138939) * 327716789 - 1] = 789563243 * var13.population;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 512764166 - 1] = var13.location * -298047577;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var13.activity;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1924435213) * 1838092650 - 1] = -428025341 * var13.index;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -445862269) * 1005406990 - 1] = 2054822665 * var13.properties;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var13.host;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -403468393 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -203930524) * -920902441 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 911238697 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1213183473) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1549568755) * 633458215 - 1] = "";
         }

         return 1;
      } else if (198928781 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1732945124) * 327716789];
         World var20 = null;

         for (int var25 = 0; var25 < World.World_count * -858019443; var25++) {
            if (World.World_worlds[var25].population * 789563243 == var12) {
               var20 = World.World_worlds[var25];
               break;
            }
         }

         if (null != var20) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1460468373) * 327716789 - 1] = var20.population * 789563243;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -137344568) * 337379609 - 1] = var20.location * 927922379;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var20.activity;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1353128253 - 1] = -428025341 * var20.index;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -374985598 - 1] = var20.properties * 1294501678;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -584533102) * -1595015587 - 1] = var20.host;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -649332488 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -211301975) * 846985018 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -584505667) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 2082145610) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -310703414 - 1] = "";
         }

         return 1;
      } else if (-253133878 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var11 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         boolean var19 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize] == 1;
         int var24 = Interpreter_intStack[-42658214 * class408.Interpreter_intStackSize + 2];
         boolean var6 = 1 == Interpreter_intStack[class408.Interpreter_intStackSize * 1237465182 + 3];
         class204.sortWorldList(var11, var19, var24, var6, -2052483414);
         return 1;
      } else if (var0 != 6511) {
         if (var0 == 472339613) {
            client.followerOpsLowPriority = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            return 1;
         } else if (var0 == 1677688346) {
            class408.Interpreter_intStackSize -= -1654680891;
            int var10 = Interpreter_intStack[class408.Interpreter_intStackSize * -1387632344];
            int var18 = Interpreter_intStack[class408.Interpreter_intStackSize * 1027788291 + 1];
            ParamComposition var23 = WorldMap.getParamDefinition(var18, -1365372094);
            if (ParamComposition.method4969(var23, 1524391364)) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = NPCComposition.method4698(
                  AsyncHttpResponse.getNpcDefinition(var10, (byte)79), var18, var23.defaultStr, (byte)-16
               );
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += 510880720) * -1323486512 - 1] = NPCComposition.method4694(
                  AsyncHttpResponse.getNpcDefinition(var10, (byte)109), var18, var23.defaultInt * -822826545, 192977228
               );
            }

            return 1;
         } else if (1420470530 == var0) {
            class408.Interpreter_intStackSize -= -248692583;
            int var9 = Interpreter_intStack[class408.Interpreter_intStackSize * -2020333978];
            int var17 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            ParamComposition var22 = WorldMap.getParamDefinition(var17, -2121727523);
            if (ParamComposition.method4969(var22, 174258882)) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -194417264) * 1014835342 - 1] = AsyncHttpResponse.getObjectDefinition(
                     var9, 2141889201
                  )
                  .getStringParam(var17, var22.defaultStr, 2100308981);
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ObjectComposition.method5175(
                  AsyncHttpResponse.getObjectDefinition(var9, 2090453761), var17, -822826545 * var22.defaultInt, 1949002701
               );
            }

            return 1;
         } else if (var0 == 1491018141) {
            class408.Interpreter_intStackSize -= 708726074;
            int var8 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var16 = Interpreter_intStack[-624696711 * class408.Interpreter_intStackSize + 1];
            ParamComposition var21 = WorldMap.getParamDefinition(var16, -1463867865);
            if (ParamComposition.method4969(var21, 1518520689)) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1001332362) * -1595015587 - 1] = class150.ItemDefinition_get(
                     var8, -1730265546
                  )
                  .getStringParam(var16, var21.defaultStr, (byte)46);
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -398442366) * 327716789 - 1] = ItemComposition.method5086(
                  class150.ItemDefinition_get(var8, -497834027), var16, -2122596258 * var21.defaultInt, -2138103929
               );
            }

            return 1;
         } else if (var0 == -395341010) {
            class408.Interpreter_intStackSize -= 708726074;
            int var7 = Interpreter_intStack[class408.Interpreter_intStackSize * 1762336942];
            int var15 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            ParamComposition var5 = WorldMap.getParamDefinition(var15, -805618374);
            if (ParamComposition.method4969(var5, 87940735)) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class39.StructDefinition_getStructDefinition(
                     var7, -1022362256
                  )
                  .getStringParam(var15, var5.defaultStr, (byte)0);
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += 235558049) * -913310988 - 1] = class39.StructDefinition_getStructDefinition(
                     var7, 1142017352
                  )
                  .getIntParam(var15, var5.defaultInt * -1265065581, 1630908785);
            }

            return 1;
         } else if (1369961654 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.onMobile ? 1 : 0;
            return 1;
         } else if (6519 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -210543833) * 327716789 - 1] = client.clientType * 1499774163;
            return 1;
         } else if (var0 == 6520) {
            return 1;
         } else if (var0 == 1607679237) {
            return 1;
         } else if (var0 == 6522) {
            SecureRandomFuture.Interpreter_objectStackSize -= -1327963851;
            class408.Interpreter_intStackSize -= -1793120611;
            return 1;
         } else if (var0 == 6523) {
            SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
            class408.Interpreter_intStackSize -= 1894155990;
            return 1;
         } else if (-718389858 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         } else if (-264670974 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 505586187 - 1] = 1;
            return 1;
         } else if (1535437450 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -666180542) * 1380464227 - 1] = 1;
            return 1;
         } else if (var0 == 6527) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -837319103) * 327716789 - 1] = 1225137509 * client.field717;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -26948736) * 327716789];
         if (var3 >= 0 && var3 < -858019443 * World.World_count) {
            World var4 = World.World_worlds[var3];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 359071898 * var4.population;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1159070726) * 327716789 - 1] = -607869593 * var4.location;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1715712958) * -1595015587 - 1] = var4.activity;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -2000997009 * var4.index;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 2054822665 * var4.properties;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 410318255 - 1] = var4.host;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1442445987 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -2025699535) * -1595015587 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -916922354) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1551283519) * -1160172793 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -362968808 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ha")
   static int method1120(int var0, Script var1, boolean var2) {
      if (-343150439 == var0) {
         int var38 = 2115028565 * Occluder.topLevelWorldView.plane;
         int var56 = -533484749 * Occluder.topLevelWorldView.baseX + (340712311 * class330.localPlayer.x >> 7);
         int var61 = (class330.localPlayer.y * -1747310679 >> 7) + Occluder.topLevelWorldView.baseY * 1279964673;
         WorldMap.method11413(class455.getWorldMap(-1809715555), var38, var56, var61, true, -1091228177);
         return 1;
      } else if (6601 == var0) {
         int var37 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -895350845];
         String var55 = "";
         WorldMapArea var60 = class455.getWorldMap(-950913792).getMapArea(var37, (byte)4);
         if (var60 != null) {
            var55 = WorldMapArea.method6941(var60, -1936583789);
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -2082485602 - 1] = var55;
         return 1;
      } else if (var0 == 6602) {
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1917260157) * 327716789];
         class455.getWorldMap(-858199686).setMaxFlashCount(var36, 1265471425);
         return 1;
      } else if (-667561293 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 704194383) * 327716789 - 1] = class455.getWorldMap(-288516543).getZoomLevel((byte)-46);
         return 1;
      } else if (var0 == 6604) {
         int var35 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(-297961947).setCurrentMapAreaId(var35, -1601929789);
         return 1;
      } else if (var0 == 749640595) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -648179169) * -95128228 - 1] = class455.getWorldMap(-1931412347).method11474(-784061233)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 1106887598) {
         Coord var34 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -491160116]);
         WorldMap.method11479(class455.getWorldMap(-721848040), -1931160809 * var34.x, var34.y * -263036313, 864863350);
         return 1;
      } else if (var0 == -1072916590) {
         Coord var33 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -654415244) * 327716789]);
         WorldMap.method11482(class455.getWorldMap(-121230788), var33.x * -1931160809, -263036313 * var33.y, (byte)124);
         return 1;
      } else if (-1356893638 == var0) {
         Coord var32 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= 1421532179) * 327716789]);
         WorldMap.method11484(class455.getWorldMap(-1504713235), var32.plane * -1944343812, -1931160809 * var32.x, var32.y * 915475007, (byte)0);
         return 1;
      } else if (var0 == 902685131) {
         Coord var31 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= 1997895706) * 327716789]);
         class455.getWorldMap(-1070206747).method11486(var31.plane * 1136475428, -1931160809 * var31.x, -263036313 * var31.y, 1242676046);
         return 1;
      } else if (6610 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -666244640) * -782309471 - 1] = class455.getWorldMap(-1166015395).getDisplayX(862408290);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMap.method11492(
            class455.getWorldMap(-63282483), (byte)63
         );
         return 1;
      } else if (var0 == 1591114728) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -274537112) * 327716789];
         WorldMapArea var54 = class455.getWorldMap(-748595823).getMapArea(var30, (byte)4);
         if (null == var54) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1639558003) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1646634099 - 1] = var54.getOrigin(-249432606).packed(-564689374);
         }

         return 1;
      } else if (6612 == var0) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 327065375) * 1893985695];
         WorldMapArea var53 = class455.getWorldMap(-2104664464).getMapArea(var29, (byte)4);
         if (null == var53) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1964462867) * 259194230 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -201579285 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (
                  WorldMapArea.method6955(var53, (byte)0) - var53.getRegionLowX(-583206742) + 1
               )
               * -1213007386;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1117929733 - 1] = (
                  var53.getRegionHighY(219246473) - WorldMapArea.method6961(var53, (byte)-27) + 1
               )
               * 64;
         }

         return 1;
      } else if (var0 == 1132749453) {
         int var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 608716974];
         WorldMapArea var52 = class455.getWorldMap(-1925598090).getMapArea(var28, (byte)4);
         if (null == var52) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -594858397 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1058178718 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -99449014 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 588516315 - 1] = var52.getRegionLowX(-1609607027) * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 329683422) * 327716789 - 1] = WorldMapArea.method6961(var52, (byte)-62) * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6955(var52, (byte)0) * -1725971834
               + 1434998541
               - 1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1215055719 - 1] = var52.getRegionHighY(219246473) * -183204994 + 64 - 1;
         }

         return 1;
      } else if (var0 == 566903218) {
         int var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 2035394674) * 327716789];
         WorldMapArea var51 = class455.getWorldMap(-249929378).getMapArea(var27, (byte)4);
         if (var51 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 616235256) * -127727308 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var51.getZoom((byte)-71);
         }

         return 1;
      } else if (6615 == var0) {
         Coord var26 = class455.getWorldMap(-2064628435).getDisplayCoord((byte)123);
         if (null == var26) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -712250877 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1602503774 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 658306545 - 1] = -1931160809 * var26.x;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 794862047) * 1129977811 - 1] = var26.y * -263036313;
         }

         return 1;
      } else if (var0 == 6616) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(11829501).currentMapAreaId((byte)114);
         return 1;
      } else if (526810003 == var0) {
         Coord var25 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -17395236) * 1689325649]);
         WorldMapArea var50 = WorldMap.method11425(class455.getWorldMap(-1862844348), 158656180);
         if (var50 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -973293681 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -193416773) * -53663689 - 1] = -1;
            return 1;
         } else {
            int[] var59 = WorldMapArea.method6923(var50, -942388854 * var25.plane, 240309737 * var25.x, var25.y * 854238194, 2067013528);
            if (var59 == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += 129462358) * 2009324150 - 1] = -1;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var59[0];
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1812024915 - 1] = var59[1];
            }

            return 1;
         }
      } else if (6618 == var0) {
         Coord var24 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1172323334) * 806498129]);
         WorldMapArea var49 = WorldMap.method11425(class455.getWorldMap(-298762261), -441454745);
         if (null == var49) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -265814916) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         } else {
            Coord var58 = var49.coord(-1341530748 * var24.x, var24.y * -263036313, (byte)45);
            if (var58 == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -995157097 - 1] = -1;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += 864431768) * -1238716845 - 1] = var58.packed(-1230695534);
            }

            return 1;
         }
      } else if (var0 == 6619) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         Coord var48 = new Coord(Interpreter_intStack[1601208862 * class408.Interpreter_intStackSize + 1]);
         classLX.method7328(var23, var48, false, (byte)-109);
         return 1;
      } else if (6620 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[-42374152 * class408.Interpreter_intStackSize];
         Coord var47 = new Coord(Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]);
         classLX.method7328(var22, var47, true, (byte)-76);
         return 1;
      } else if (var0 == 6621) {
         class408.Interpreter_intStackSize -= 708726074;
         int var21 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Coord var46 = new Coord(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]);
         WorldMapArea var57 = class455.getWorldMap(-531526722).getMapArea(var21, (byte)4);
         if (var57 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1677552943) * 327716789 - 1] = var57.containsCoord(
                  370217423 * var46.plane, var46.x * -1931160809, var46.y * 194635460, 2136870681
               )
               ? 1
               : 0;
            return 1;
         }
      } else if (6622 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1762160400 - 1] = class455.getWorldMap(-72469178)
            .getDisplayWith(-1039797565);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 379237963 - 1] = class455.getWorldMap(-1008562122)
            .getDisplayHeight((byte)-31);
         return 1;
      } else if (var0 == 291941174) {
         Coord var20 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= 414165902) * 327716789]);
         WorldMapArea var45 = class455.getWorldMap(-400258911).mapAreaAtCoord(370217423 * var20.plane, -1346286618 * var20.x, -191676987 * var20.y, 1159228651);
         if (var45 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 992071559) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1967603294 - 1] = WorldMapArea.method6931(var45, -1811606011);
         }

         return 1;
      } else if (var0 == -172222646) {
         WorldMap.method11505(
            class455.getWorldMap(-1180355769), Interpreter_intStack[(class408.Interpreter_intStackSize -= -575742127) * -1086684999], -231546253
         );
         return 1;
      } else if (6625 == var0) {
         WorldMap.method11512(class455.getWorldMap(-1833213347), (byte)-91);
         return 1;
      } else if (var0 == -1448205714) {
         class455.getWorldMap(-933829323).setCyclesPerFlash(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1237027604) * 327716789], (byte)-90);
         return 1;
      } else if (1950853700 == var0) {
         class455.getWorldMap(-1142346841).resetCyclesPerFlash(-2075654854);
         return 1;
      } else if (6628 == var0) {
         boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class455.getWorldMap(-684553443).setPerpetualFlash(var19, 1448150397);
         return 1;
      } else if (var0 == 1750891146) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1881650125) * 327716789];
         class455.getWorldMap(-401324701).flashElement(var18, (byte)-13);
         return 1;
      } else if (var0 == -1141162820) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1469952733) * 1544895354];
         class455.getWorldMap(-1836329838).setZoomPercentage(var17, 742910117);
         return 1;
      } else if (6631 == var0) {
         WorldMap.method11531(class455.getWorldMap(-670015894), 862656766);
         return 1;
      } else if (1942326475 == var0) {
         boolean var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 863130789] == 1;
         class455.getWorldMap(372679039).setElementsDisabled(var16, (byte)66);
         return 1;
      } else if (-527635720 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[class408.Interpreter_intStackSize * -1852493038];
         boolean var44 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -1661263266] == 1;
         class455.getWorldMap(152755016).disableElement(var15, var44, (byte)66);
         return 1;
      } else if (var0 == -1261883483) {
         class408.Interpreter_intStackSize -= -1567082812;
         int var14 = Interpreter_intStack[-1131896036 * class408.Interpreter_intStackSize];
         boolean var43 = 1 == Interpreter_intStack[class408.Interpreter_intStackSize * -1878681769 + 1];
         class455.getWorldMap(-1148312113).setCategoryDisabled(var14, var43, -2111643882);
         return 1;
      } else if (1287201471 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -972868758) * 327716789 - 1] = class455.getWorldMap(-629450303)
               .getElementsDisabled((byte)79)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 1217589951) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1008159892) * -1857482140];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1429323804) * 327716789 - 1] = class455.getWorldMap(-208903387)
               .isElementDisabled(var13, 1581915245)
            ? 1
            : 0;
         return 1;
      } else if (6637 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 2013944440];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 65677923) * 327716789 - 1] = class455.getWorldMap(-958756826)
               .isCategoryDisabled(var12, 1060894780)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 6638) {
         class408.Interpreter_intStackSize -= -263375590;
         int var11 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Coord var42 = new Coord(Interpreter_intStack[1 + class408.Interpreter_intStackSize * 40193595]);
         Coord var5 = class455.getWorldMap(-2059336802).method11555(var11, var42, 2029050249);
         if (var5 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1570958962 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 390345272) * 129634 - 1] = var5.packed(1355248912);
         }

         return 1;
      } else if (var0 == 6639) {
         AbstractWorldMapIcon var10 = WorldMap.method11563(class455.getWorldMap(-409087697), 1905763545);
         if (var10 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1211308695 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var10.getElement(-582751607);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1027827492) * -735068406 - 1] = var10.coord2.packed(-345578516);
         }

         return 1;
      } else if (var0 == 6640) {
         AbstractWorldMapIcon var9 = class455.getWorldMap(-407382272).iconStart(75705461);
         if (var9 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 779320916) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var9.getElement(1275917300);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1335488658) * 706234911 - 1] = var9.coord2.packed(-1050412796);
         }

         return 1;
      } else if (var0 == -663409483) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -53933497) * -389924046];
         WorldMapElement var41 = class463.WorldMapElement_get(var8, (byte)0);
         if (null == var41.menuTargetName) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -689497995 - 1] = "";
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1249304927) * 1231076301 - 1] = var41.menuTargetName;
         }

         return 1;
      } else if (var0 == -2067688980) {
         int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 167280843) * 327716789];
         WorldMapElement var40 = class463.WorldMapElement_get(var7, (byte)0);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var40.textSize * 1000629255;
         return 1;
      } else if (2000518647 == var0) {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -916711889) * -1782047763];
         WorldMapElement var39 = class463.WorldMapElement_get(var6, (byte)0);
         if (var39 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1515057829) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1276574312 * var39.category;
         }

         return 1;
      } else if (6696 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1324202812) * 327716789];
         WorldMapElement var4 = class463.WorldMapElement_get(var3, (byte)0);
         if (var4 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 742035438) * -1362187965 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 770901828 - 1] = var4.sprite1 * 1037263940;
         }

         return 1;
      } else if (-1195624205 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.mapElement * -1281703535;
         return 1;
      } else if (var0 == -1917166126) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1973225231 - 1] = AbstractSocket.worldMapEvent.coord1.packed(195982885);
         return 1;
      } else if (6699 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 939257608 - 1] = AbstractSocket.worldMapEvent.coord2.packed(132897362);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hu")
   static int method1121(int var0, Script var1, boolean var2) {
      if (6600 == var0) {
         int var38 = 2115028565 * Occluder.topLevelWorldView.plane;
         int var56 = 825809917 * Occluder.topLevelWorldView.baseX + (340712311 * class330.localPlayer.x >> 7);
         int var61 = (class330.localPlayer.y * -1747310679 >> 7) + Occluder.topLevelWorldView.baseY * 1279964673;
         WorldMap.method11413(class455.getWorldMap(-176518779), var38, var56, var61, true, -1091228177);
         return 1;
      } else if (6601 == var0) {
         int var37 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         String var55 = "";
         WorldMapArea var60 = class455.getWorldMap(164657803).getMapArea(var37, (byte)4);
         if (var60 != null) {
            var55 = WorldMapArea.method6941(var60, -2021440272);
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var55;
         return 1;
      } else if (var0 == 6602) {
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(-749293608).setMaxFlashCount(var36, 1265471425);
         return 1;
      } else if (6603 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-783045928).getZoomLevel((byte)-84);
         return 1;
      } else if (var0 == 6604) {
         int var35 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(-847025979).setCurrentMapAreaId(var35, -1601929789);
         return 1;
      } else if (var0 == 6605) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(247979995).method11474(-432212523)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 6606) {
         Coord var34 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMap.method11479(class455.getWorldMap(-1557245284), -1931160809 * var34.x, var34.y * -263036313, 2011091202);
         return 1;
      } else if (var0 == 6607) {
         Coord var33 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMap.method11482(class455.getWorldMap(180333225), var33.x * -1931160809, -263036313 * var33.y, (byte)76);
         return 1;
      } else if (6608 == var0) {
         Coord var32 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMap.method11484(class455.getWorldMap(-299265555), var32.plane * 370217423, -1931160809 * var32.x, var32.y * -263036313, (byte)0);
         return 1;
      } else if (var0 == 6609) {
         Coord var31 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         class455.getWorldMap(-5460873).method11486(var31.plane * 370217423, -1931160809 * var31.x, -263036313 * var31.y, 2077426730);
         return 1;
      } else if (6610 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(479573177).getDisplayX(-497653559);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMap.method11492(
            class455.getWorldMap(38357819), (byte)47
         );
         return 1;
      } else if (var0 == 6611) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapArea var54 = class455.getWorldMap(-232189460).getMapArea(var30, (byte)4);
         if (null == var54) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54.getOrigin(650483960).packed(-322568037);
         }

         return 1;
      } else if (6612 == var0) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapArea var53 = class455.getWorldMap(11321937).getMapArea(var29, (byte)4);
         if (null == var53) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (
                  WorldMapArea.method6955(var53, (byte)0) - var53.getRegionLowX(-342984505) + 1
               )
               * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (
                  var53.getRegionHighY(219246473) - WorldMapArea.method6961(var53, (byte)-7) + 1
               )
               * 64;
         }

         return 1;
      } else if (var0 == 6613) {
         int var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapArea var52 = class455.getWorldMap(-92337217).getMapArea(var28, (byte)4);
         if (null == var52) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52.getRegionLowX(-1570460929) * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6961(var52, (byte)19) * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6955(var52, (byte)0) * 64 + 64 - 1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52.getRegionHighY(219246473) * 64 + 64 - 1;
         }

         return 1;
      } else if (var0 == 6614) {
         int var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapArea var51 = class455.getWorldMap(-535818938).getMapArea(var27, (byte)4);
         if (var51 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var51.getZoom((byte)53);
         }

         return 1;
      } else if (6615 == var0) {
         Coord var26 = class455.getWorldMap(-1936806645).getDisplayCoord((byte)55);
         if (null == var26) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1931160809 * var26.x;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var26.y * -263036313;
         }

         return 1;
      } else if (var0 == 6616) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-1203068439)
            .currentMapAreaId((byte)51);
         return 1;
      } else if (6617 == var0) {
         Coord var25 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMapArea var50 = WorldMap.method11425(class455.getWorldMap(-612798332), 277501979);
         if (var50 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         } else {
            int[] var59 = WorldMapArea.method6923(var50, 370217423 * var25.plane, -1931160809 * var25.x, var25.y * -263036313, 2095668475);
            if (var59 == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var59[0];
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var59[1];
            }

            return 1;
         }
      } else if (6618 == var0) {
         Coord var24 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMapArea var49 = WorldMap.method11425(class455.getWorldMap(159474329), -317231317);
         if (null == var49) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         } else {
            Coord var58 = var49.coord(-1931160809 * var24.x, var24.y * -263036313, (byte)53);
            if (var58 == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var58.packed(50995822);
            }

            return 1;
         }
      } else if (var0 == 6619) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         Coord var48 = new Coord(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]);
         classLX.method7328(var23, var48, false, (byte)-88);
         return 1;
      } else if (6620 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         Coord var47 = new Coord(Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]);
         classLX.method7328(var22, var47, true, (byte)-80);
         return 1;
      } else if (var0 == 6621) {
         class408.Interpreter_intStackSize -= 708726074;
         int var21 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Coord var46 = new Coord(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]);
         WorldMapArea var57 = class455.getWorldMap(-52113973).getMapArea(var21, (byte)4);
         if (var57 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var57.containsCoord(
                  370217423 * var46.plane, var46.x * -1931160809, var46.y * -263036313, 2136870681
               )
               ? 1
               : 0;
            return 1;
         }
      } else if (6622 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-1402423089)
            .getDisplayWith(-1119646618);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(467407911).getDisplayHeight((byte)116);
         return 1;
      } else if (var0 == 6623) {
         Coord var20 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
         WorldMapArea var45 = class455.getWorldMap(-1797463043).mapAreaAtCoord(370217423 * var20.plane, -1931160809 * var20.x, -263036313 * var20.y, 168653569);
         if (var45 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6931(var45, -1902946968);
         }

         return 1;
      } else if (var0 == 6624) {
         WorldMap.method11505(class455.getWorldMap(-70128056), Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 63437038);
         return 1;
      } else if (6625 == var0) {
         WorldMap.method11512(class455.getWorldMap(-2055985345), (byte)23);
         return 1;
      } else if (var0 == 6626) {
         class455.getWorldMap(153755127).setCyclesPerFlash(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)-57);
         return 1;
      } else if (6627 == var0) {
         class455.getWorldMap(284624319).resetCyclesPerFlash(-1114877529);
         return 1;
      } else if (6628 == var0) {
         boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class455.getWorldMap(-647125915).setPerpetualFlash(var19, -92180970);
         return 1;
      } else if (var0 == 6629) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(148525033).flashElement(var18, (byte)11);
         return 1;
      } else if (var0 == 6630) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class455.getWorldMap(22421152).setZoomPercentage(var17, -2071785303);
         return 1;
      } else if (6631 == var0) {
         WorldMap.method11531(class455.getWorldMap(-937468864), 1553352609);
         return 1;
      } else if (6632 == var0) {
         boolean var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class455.getWorldMap(-1776569419).setElementsDisabled(var16, (byte)57);
         return 1;
      } else if (6633 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         boolean var44 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] == 1;
         class455.getWorldMap(-1789288570).disableElement(var15, var44, (byte)65);
         return 1;
      } else if (var0 == 6634) {
         class408.Interpreter_intStackSize -= 708726074;
         int var14 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         boolean var43 = 1 == Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         class455.getWorldMap(-732763970).setCategoryDisabled(var14, var43, 239208080);
         return 1;
      } else if (6635 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-1090349095)
               .getElementsDisabled((byte)94)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 6636) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-420042648)
               .isElementDisabled(var13, 1555474960)
            ? 1
            : 0;
         return 1;
      } else if (6637 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-1617516447)
               .isCategoryDisabled(var12, 387821145)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 6638) {
         class408.Interpreter_intStackSize -= 708726074;
         int var11 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Coord var42 = new Coord(Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789]);
         Coord var5 = class455.getWorldMap(-757643164).method11555(var11, var42, 1771814984);
         if (var5 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5.packed(1214316209);
         }

         return 1;
      } else if (var0 == 6639) {
         AbstractWorldMapIcon var10 = WorldMap.method11563(class455.getWorldMap(-1228558121), 1905763545);
         if (var10 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var10.getElement(-1577367229);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var10.coord2.packed(-1319512623);
         }

         return 1;
      } else if (var0 == 6640) {
         AbstractWorldMapIcon var9 = class455.getWorldMap(-1379536579).iconStart(-654448425);
         if (var9 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var9.getElement(-281993353);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var9.coord2.packed(-1110177092);
         }

         return 1;
      } else if (var0 == 6693) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var41 = class463.WorldMapElement_get(var8, (byte)0);
         if (null == var41.menuTargetName) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var41.menuTargetName;
         }

         return 1;
      } else if (var0 == 6694) {
         int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var40 = class463.WorldMapElement_get(var7, (byte)0);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var40.textSize * 1000629255;
         return 1;
      } else if (6695 == var0) {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var39 = class463.WorldMapElement_get(var6, (byte)0);
         if (var39 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -629421571 * var39.category;
         }

         return 1;
      } else if (6696 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var4 = class463.WorldMapElement_get(var3, (byte)0);
         if (var4 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.sprite1 * -393425597;
         }

         return 1;
      } else if (6697 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.mapElement * -1281703535;
         return 1;
      } else if (var0 == 6698) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.coord1.packed(-1861505958);
         return 1;
      } else if (6699 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.coord2.packed(-1989660453);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ht")
   static int method1122(int var0, Script var1, boolean var2) {
      if (6600 == var0) {
         int var38 = 1127187383 * Occluder.topLevelWorldView.plane;
         int var56 = 825809917 * Occluder.topLevelWorldView.baseX + (-1064315523 * class330.localPlayer.x >> 7);
         int var61 = (class330.localPlayer.y * -1354450658 >> 7) + Occluder.topLevelWorldView.baseY * -879553024;
         WorldMap.method11413(class455.getWorldMap(-1036520686), var38, var56, var61, true, -1091228177);
         return 1;
      } else if (-1485816614 == var0) {
         int var37 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         String var55 = "";
         WorldMapArea var60 = class455.getWorldMap(-512629574).getMapArea(var37, (byte)4);
         if (var60 != null) {
            var55 = WorldMapArea.method6941(var60, -2072698704);
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 96158433) * 1217747926 - 1] = var55;
         return 1;
      } else if (var0 == -2078701341) {
         int var36 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 2030063489) * 327716789];
         class455.getWorldMap(-441182592).setMaxFlashCount(var36, 1265471425);
         return 1;
      } else if (-2125793813 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1892078806) * 1519086852 - 1] = class455.getWorldMap(-446124048).getZoomLevel((byte)-119);
         return 1;
      } else if (var0 == 6604) {
         int var35 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1075377000) * 1732644178];
         class455.getWorldMap(-2113517332).setCurrentMapAreaId(var35, -1601929789);
         return 1;
      } else if (var0 == -2027546804) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(-1809882951).method11474(-1154308260)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 1996327433) {
         Coord var34 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -46449484) * 327716789]);
         WorldMap.method11479(class455.getWorldMap(-1119922072), 54502429 * var34.x, var34.y * -263036313, 1435728072);
         return 1;
      } else if (var0 == 1164820466) {
         Coord var33 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1994037070]);
         WorldMap.method11482(class455.getWorldMap(-10147913), var33.x * 1481469074, -263036313 * var33.y, (byte)47);
         return 1;
      } else if (6608 == var0) {
         Coord var32 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= 609100808) * 327716789]);
         WorldMap.method11484(class455.getWorldMap(-1593683618), var32.plane * 370217423, -1931160809 * var32.x, var32.y * -263036313, (byte)0);
         return 1;
      } else if (var0 == 1561729736) {
         Coord var31 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1468187762) * 327716789]);
         class455.getWorldMap(-227083238).method11486(var31.plane * 20703541, 1042279238 * var31.x, -365832335 * var31.y, -1901210449);
         return 1;
      } else if (1517962947 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -58281415) * 327716789 - 1] = class455.getWorldMap(535599134).getDisplayX(447519655);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -593969137 - 1] = WorldMap.method11492(
            class455.getWorldMap(-1010614770), (byte)52
         );
         return 1;
      } else if (var0 == -1549867439) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1523872597) * 327716789];
         WorldMapArea var54 = class455.getWorldMap(-921849038).getMapArea(var30, (byte)4);
         if (null == var54) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 210779126 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1668518191 - 1] = var54.getOrigin(-1200411317).packed(716336081);
         }

         return 1;
      } else if (6612 == var0) {
         int var29 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1140981115];
         WorldMapArea var53 = class455.getWorldMap(-1964746968).getMapArea(var29, (byte)4);
         if (null == var53) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -220302411) * -2054818274 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 367550811) * 327716789 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 541747684 - 1] = (
                  WorldMapArea.method6955(var53, (byte)0) - var53.getRegionLowX(-1897315796) + 1
               )
               * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -844466710) * -921496102 - 1] = (
                  var53.getRegionHighY(219246473) - WorldMapArea.method6961(var53, (byte)-22) + 1
               )
               * 1564622522;
         }

         return 1;
      } else if (var0 == -1008495260) {
         int var28 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1998021840];
         WorldMapArea var52 = class455.getWorldMap(248876359).getMapArea(var28, (byte)4);
         if (null == var52) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1817901468 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -2116457614) * -815952742 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1227252815) * -1899613567 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var52.getRegionLowX(-1202741895) * 1594858556;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1850664017 - 1] = WorldMapArea.method6961(var52, (byte)11) * 64;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -487305501 - 1] = WorldMapArea.method6955(var52, (byte)0) * 305920774
               + 64
               - 1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -612632564 - 1] = var52.getRegionHighY(219246473) * -1705170194 + 64 - 1;
         }

         return 1;
      } else if (var0 == 6614) {
         int var27 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1721373366) * 327716789];
         WorldMapArea var51 = class455.getWorldMap(-199832978).getMapArea(var27, (byte)4);
         if (var51 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1361062715 - 1] = var51.getZoom((byte)14);
         }

         return 1;
      } else if (6615 == var0) {
         Coord var26 = class455.getWorldMap(-1323004090).getDisplayCoord((byte)66);
         if (null == var26) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -617449502 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -437262824) * 536086754 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1334536017) * 327716789 - 1] = -1773726230 * var26.x;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -621070888) * 327716789 - 1] = var26.y * -263036313;
         }

         return 1;
      } else if (var0 == -1405758624) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -460935658) * 327716789 - 1] = class455.getWorldMap(-908214601).currentMapAreaId((byte)70);
         return 1;
      } else if (6617 == var0) {
         Coord var25 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= 1187036485) * -1572562771]);
         WorldMapArea var50 = WorldMap.method11425(class455.getWorldMap(-1340293220), 610241506);
         if (var50 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1294369651) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         } else {
            int[] var59 = WorldMapArea.method6923(var50, 370217423 * var25.plane, 1475623367 * var25.x, var25.y * -263036313, 2116823532);
            if (var59 == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += 618927021) * 1009667330 - 1] = -1;
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -177748184 - 1] = -1;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1349307801) * 327716789 - 1] = var59[0];
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var59[1];
            }

            return 1;
         }
      } else if (6618 == var0) {
         Coord var24 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1817710557]);
         WorldMapArea var49 = WorldMap.method11425(class455.getWorldMap(-120526962), -796223719);
         if (null == var49) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1121509055 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1966131754) * 442535161 - 1] = -1;
            return 1;
         } else {
            Coord var58 = var49.coord(-1931160809 * var24.x, var24.y * -263036313, (byte)95);
            if (var58 == null) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var58.packed(-1566670830);
            }

            return 1;
         }
      } else if (var0 == -470054379) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         Coord var48 = new Coord(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]);
         classLX.method7328(var23, var48, false, (byte)2);
         return 1;
      } else if (6620 == var0) {
         class408.Interpreter_intStackSize -= 77904534;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         Coord var47 = new Coord(Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]);
         classLX.method7328(var22, var47, true, (byte)-128);
         return 1;
      } else if (var0 == 1164334172) {
         class408.Interpreter_intStackSize -= 708726074;
         int var21 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         Coord var46 = new Coord(Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]);
         WorldMapArea var57 = class455.getWorldMap(487494807).getMapArea(var21, (byte)4);
         if (var57 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -926552129) * -937060831 - 1] = 0;
            return 1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1799581044) * 327716789 - 1] = var57.containsCoord(
                  370217423 * var46.plane, var46.x * -1931160809, var46.y * -263036313, 2136870681
               )
               ? 1
               : 0;
            return 1;
         }
      } else if (1228348088 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class455.getWorldMap(108128392).getDisplayWith(-1751122524);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -358923390) * 327716789 - 1] = class455.getWorldMap(-680805339).getDisplayHeight((byte)47);
         return 1;
      } else if (var0 == 6623) {
         Coord var20 = new Coord(Interpreter_intStack[(class408.Interpreter_intStackSize -= -917662074) * 327716789]);
         WorldMapArea var45 = class455.getWorldMap(-1711134202).mapAreaAtCoord(370217423 * var20.plane, -1931160809 * var20.x, -263036313 * var20.y, 725524952);
         if (var45 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -97744364) * -28869246 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapArea.method6931(var45, -1889234408);
         }

         return 1;
      } else if (var0 == 6624) {
         WorldMap.method11505(
            class455.getWorldMap(-1731696157), Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 725399223], -921245963
         );
         return 1;
      } else if (1284270055 == var0) {
         WorldMap.method11512(class455.getWorldMap(456973328), (byte)36);
         return 1;
      } else if (var0 == 1500375484) {
         class455.getWorldMap(-2110739440).setCyclesPerFlash(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1166259055) * 753740520], (byte)-5);
         return 1;
      } else if (6627 == var0) {
         class455.getWorldMap(-598887833).resetCyclesPerFlash(1876478482);
         return 1;
      } else if (887112292 == var0) {
         boolean var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class455.getWorldMap(-1573552425).setPerpetualFlash(var19, -510635666);
         return 1;
      } else if (var0 == -1708544881) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 687890514) * 327716789];
         class455.getWorldMap(-15349774).flashElement(var18, (byte)22);
         return 1;
      } else if (var0 == 6630) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1098383648];
         class455.getWorldMap(-581519572).setZoomPercentage(var17, -1366583655);
         return 1;
      } else if (-2099121066 == var0) {
         WorldMap.method11531(class455.getWorldMap(-2120351930), 1203410670);
         return 1;
      } else if (6632 == var0) {
         boolean var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         class455.getWorldMap(-1051413541).setElementsDisabled(var16, (byte)127);
         return 1;
      } else if (-1236175277 == var0) {
         class408.Interpreter_intStackSize -= 1428942142;
         int var15 = Interpreter_intStack[class408.Interpreter_intStackSize * -707936415];
         boolean var44 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] == 1;
         class455.getWorldMap(-531738869).disableElement(var15, var44, (byte)7);
         return 1;
      } else if (var0 == 6634) {
         class408.Interpreter_intStackSize -= 708726074;
         int var14 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         boolean var43 = 1 == Interpreter_intStack[class408.Interpreter_intStackSize * 661658120 + 1];
         class455.getWorldMap(-2089726913).setCategoryDisabled(var14, var43, 736841212);
         return 1;
      } else if (-1579002082 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 2106909604 - 1] = class455.getWorldMap(-1423845983)
               .getElementsDisabled((byte)118)
            ? 1
            : 0;
         return 1;
      } else if (var0 == 1025008846) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 533660867) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1535019642) * 198548477 - 1] = class455.getWorldMap(561377109)
               .isElementDisabled(var13, 1694967419)
            ? 1
            : 0;
         return 1;
      } else if (6637 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1457280596) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -565373657) * 327716789 - 1] = class455.getWorldMap(-264274263)
               .isCategoryDisabled(var12, -1540833519)
            ? 1
            : 0;
         return 1;
      } else if (var0 == -844167533) {
         class408.Interpreter_intStackSize -= -426227167;
         int var11 = Interpreter_intStack[class408.Interpreter_intStackSize * -40314741];
         Coord var42 = new Coord(Interpreter_intStack[1 + class408.Interpreter_intStackSize * 1719154842]);
         Coord var5 = class455.getWorldMap(-1228381006).method11555(var11, var42, 1158008265);
         if (var5 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1846710566 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1140093135) * -1659957531 - 1] = var5.packed(-522509578);
         }

         return 1;
      } else if (var0 == 6639) {
         AbstractWorldMapIcon var10 = WorldMap.method11563(class455.getWorldMap(523491878), 1905763545);
         if (var10 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -960336184 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1992781895) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1179010531 - 1] = var10.getElement(1984493117);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1785074386 - 1] = var10.coord2.packed(-1830227174);
         }

         return 1;
      } else if (var0 == 335975434) {
         AbstractWorldMapIcon var9 = class455.getWorldMap(28791105).iconStart(784273431);
         if (var9 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 86149624) * -474568843 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -34486580) * 327716789 - 1] = var9.getElement(-873676007);
            Interpreter_intStack[(class408.Interpreter_intStackSize += 636238361) * 327716789 - 1] = var9.coord2.packed(1523006323);
         }

         return 1;
      } else if (var0 == 6693) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -444270340) * 327716789];
         WorldMapElement var41 = class463.WorldMapElement_get(var8, (byte)0);
         if (null == var41.menuTargetName) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -2050919976 - 1] = "";
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var41.menuTargetName;
         }

         return 1;
      } else if (var0 == 1691904656) {
         int var7 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         WorldMapElement var40 = class463.WorldMapElement_get(var7, (byte)0);
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1294935136) * 1193860302 - 1] = var40.textSize * 2103177864;
         return 1;
      } else if (338016658 == var0) {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1038773328];
         WorldMapElement var39 = class463.WorldMapElement_get(var6, (byte)0);
         if (var39 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -77326961) * 1771607971 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -775214383) * 719339420 - 1] = -1948559780 * var39.category;
         }

         return 1;
      } else if (-1961330359 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -454182482) * 753470906];
         WorldMapElement var4 = class463.WorldMapElement_get(var3, (byte)0);
         if (var4 == null) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 927942996 - 1] = -1;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.sprite1 * -393425597;
         }

         return 1;
      } else if (6697 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1701858376) * 1948970424 - 1] = AbstractSocket.worldMapEvent.mapElement * -1281703535;
         return 1;
      } else if (var0 == 963387574) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 468784797 - 1] = AbstractSocket.worldMapEvent.coord1.packed(277391825);
         return 1;
      } else if (6699 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = AbstractSocket.worldMapEvent.coord2.packed(-639984352);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ii")
   static int method1132(int var0, Script var1, boolean var2) {
      if (7108 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -382008728) * -689108110 - 1] = WidgetConfigNode.method7991((byte)-67) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hk")
   static int method1123(int var0, Script var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -632220166) * -1003169692];
         NPCComposition var7 = AsyncHttpResponse.getNpcDefinition(var6, (byte)20);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -643176160) * -1595015587 - 1] = var7 != null ? var7.name : "";
         return 1;
      } else if (6764 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         NPCComposition var5 = AsyncHttpResponse.getNpcDefinition(Interpreter_intStack[-488830930 * class408.Interpreter_intStackSize], (byte)118);
         int var4 = Interpreter_intStack[268481772 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5.method4710(var4, -173046631);
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1655349041) * 327716789 - 1] = var5.method4715(var4, (byte)0);
         return 1;
      } else if (728272258 == var0) {
         NPCComposition var3 = AsyncHttpResponse.getNpcDefinition(
            Interpreter_intStack[(class408.Interpreter_intStackSize -= -1643673738) * -1731384439], (byte)5
         );
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -2070498822 - 1] = null != var3 ? var3.combatLevel * 339491756 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ho")
   static int method1124(int var0, Script var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         NPCComposition var7 = AsyncHttpResponse.getNpcDefinition(var6, (byte)46);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var7 != null ? var7.name : "";
         return 1;
      } else if (6764 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         NPCComposition var5 = AsyncHttpResponse.getNpcDefinition(Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (byte)32);
         int var4 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5.method4710(var4, -1112955534);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5.method4715(var4, (byte)0);
         return 1;
      } else if (6765 == var0) {
         NPCComposition var3 = AsyncHttpResponse.getNpcDefinition(
            Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)90
         );
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var3 ? var3.combatLevel * 1601675895 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hs")
   static int method1125(int var0, Script var1, boolean var2) {
      if (73771133 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1759968895) * -1247241361];
         ObjectComposition var4 = AsyncHttpResponse.getObjectDefinition(var3, 2144821520);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var4 ? var4.name : "";
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hm")
   static int method1126(int var0, Script var1, boolean var2) {
      if (6809 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -797972028];
         ObjectComposition var4 = AsyncHttpResponse.getObjectDefinition(var3, 2033348433);
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -622171937) * -1595015587 - 1] = null != var4 ? var4.name : "";
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hx")
   static int method1110(int var0, Script var1, boolean var2) {
      if (1275909679 == var0) {
         client.logoutTimer = 485255766;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hv")
   static int method1129(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;II)V")
   @ObfuscatedName("cw")
   static void method998(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.args;
      Script var4;
      if (Sound.isWorldMapEvent(var0.type * -1166617615, -659235780)) {
         AbstractSocket.worldMapEvent = (WorldMapEvent)var3[0];
         WorldMapElement var5 = class463.WorldMapElement_get(AbstractSocket.worldMapEvent.mapElement * -1281703535, (byte)0);
         var4 = WorldMapSectionType.getWorldMapScript(var0.type * -1166617615, 348284615 * var5.objectId, var5.category * -629421571, -2117195917);
      } else {
         int var6 = (Integer)var3[0];
         var4 = class383.getScript(var6, -446507062);
      }

      if (var4 != null) {
         WorldViewManager.runScriptLogic(var0, var4, var1, var2, 1954877770);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("if")
   static int method1130(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gx")
   static int method1100(int var0, Script var1, boolean var2) {
      if (278506469 == var0) {
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -945972483) * -586474647];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1244475069) * -1595015587 - 1] = class150.ItemDefinition_get(
               var24, -1822876741
            )
            .name;
         return 1;
      } else if (var0 == 4201) {
         class408.Interpreter_intStackSize -= -909325051;
         int var23 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var33 = Interpreter_intStack[class408.Interpreter_intStackSize * 744956626 + 1];
         ItemComposition var35 = class150.ItemDefinition_get(var23, -492090374);
         if (var33 >= 1 && var33 <= 5 && null != var35.groundActions[var33 - 1]) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var35.groundActions[var33 - 1];
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -2105475963 - 1] = "";
         }

         return 1;
      } else if (4202 == var0) {
         class408.Interpreter_intStackSize -= -1655402927;
         int var22 = Interpreter_intStack[895593936 * class408.Interpreter_intStackSize];
         int var32 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         ItemComposition var34 = class150.ItemDefinition_get(var22, -1634819679);
         if (var32 >= 1 && var32 <= 5 && var34.inventoryActions[var32 - 1] != null) {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var34.inventoryActions[var32 - 1];
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 367294077) * -1595015587 - 1] = "";
         }

         return 1;
      } else if (var0 == 4222) {
         class408.Interpreter_intStackSize -= 1320472537;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var31 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var5 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         ItemComposition var6 = class150.ItemDefinition_get(var21, 182411757);
         String var7 = null;
         if (var31 >= 1
            && var31 <= 5
            && null != var6.inventoryActions[var31 - 1]
            && var6.subOps != null
            && var6.subOps[var31 - 1] != null
            && var5 >= 1
            && var5 <= var6.subOps[var31 - 1].length) {
            var7 = var6.subOps[var31 - 1][var5 - 1];
         }

         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -132955347 - 1] = var7 != null ? var7 : "";
         return 1;
      } else if (4203 == var0) {
         int var20 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1026189832) * -1503469472];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 138118585) * 2013537248 - 1] = class150.ItemDefinition_get(var20, -968007208).price
            * 1824214797;
         return 1;
      } else if (var0 == 4204) {
         int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1596654034 - 1] = class150.ItemDefinition_get(var19, -1370852218).isStackable
                  * 1515235515
               == 1
            ? 1
            : 0;
         return 1;
      } else if (67147096 == var0) {
         int var18 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 489015990) * -845433244];
         ItemComposition var30 = class150.ItemDefinition_get(var18, -1806281226);
         if (var30.noteTemplate * 388376999 == -1 && var30.note * 98718905 >= 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 827839900 - 1] = 98718905 * var30.note;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -630438099 - 1] = var18;
         }

         return 1;
      } else if (4206 == var0) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1615426055) * 327716789];
         ItemComposition var29 = class150.ItemDefinition_get(var17, -1837583442);
         if (var29.noteTemplate * -1500351903 >= 0 && 923869062 * var29.note >= 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var29.note * 569069333;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var17;
         }

         return 1;
      } else if (var0 == 4207) {
         int var16 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1198614284) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1037811967 - 1] = class150.ItemDefinition_get(var16, -556632337).isTradable
            ? 1
            : 0;
         return 1;
      } else if (var0 == 967385805) {
         int var15 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1743993371];
         ItemComposition var28 = class150.ItemDefinition_get(var15, -693023312);
         if (var28.placeholderTemplate * 413316061 == -1 && var28.placeholder * -1134820861 >= 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1819275134) * 327716789 - 1] = -331874811 * var28.placeholder;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 2071405777 - 1] = var15;
         }

         return 1;
      } else if (1641709850 == var0) {
         int var14 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1592554078) * 327716789];
         ItemComposition var27 = class150.ItemDefinition_get(var14, 273790886);
         if (var27.placeholderTemplate * 1878048622 >= 0 && -851559368 * var27.placeholder >= 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -199584577) * 327716789 - 1] = var27.placeholder * -1134820861;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1452695291) * -91488265 - 1] = var14;
         }

         return 1;
      } else if (var0 == -238069704) {
         String var13 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1514710971) * -305761256];
         int var26 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         class408.findItemDefinitions(var13, 1 == var26, -70652554);
         Interpreter_intStack[(class408.Interpreter_intStackSize += 761089698) * 327716789 - 1] = class136.foundItemIdCount * -259451539;
         return 1;
      } else if (896635174 != var0) {
         if (4212 == var0) {
            AbstractByteArrayCopier.foundItemIndex = 0;
            return 1;
         } else if (4213 == var0) {
            int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int var25 = class150.ItemDefinition_get(var12, -384852447).getShiftClickIndex(1650304017);
            if (var25 == -1) {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1280766786) * -86995614 - 1] = var25;
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -2121850966 - 1] = 1 + var25;
            }

            return 1;
         } else if (var0 == 2114263792) {
            int var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -441104856];
            Interpreter_intStack[(class408.Interpreter_intStackSize += 360434885) * -1276741052 - 1] = class150.ItemDefinition_get(var11, -139587806).maleModel
               * -1427799695;
            return 1;
         } else if (var0 == 4215) {
            int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1632876717) * 327716789 - 1] = class150.ItemDefinition_get(var10, -2146669559).maleModel1
               * -1551751121;
            return 1;
         } else if (var0 == 1195071800) {
            int var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(var9, -423871741).maleModel2
               * 1456474147;
            return 1;
         } else if (var0 == 4217) {
            int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1562668462) * 1247280194];
            ItemComposition var4 = class150.ItemDefinition_get(var8, -1282299047);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -295288339 * var4.field2605;
            return 1;
         } else if (-287269512 == var0) {
            int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1139386604];
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -564655423) * 390663297 - 1] = class150.ItemDefinition_get(
                  var3, -1836663921
               )
               .examine;
            return 1;
         } else {
            return 2;
         }
      } else {
         if (null != class468.foundItemIds && 2070912915 * AbstractByteArrayCopier.foundItemIndex < class136.foundItemIdCount * 106092657) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class468.foundItemIds[(
                        AbstractByteArrayCopier.foundItemIndex += 1616815327
                     )
                     * 1501959967
                  - 1]
               & '\uffff';
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 955050626 - 1] = -1;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gh")
   static int method1097(int var0, Script var1, boolean var2) {
      if (4000 == var0) {
         class408.Interpreter_intStackSize -= -58040021;
         int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * 1984126343];
         int var57 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -310296418 - 1] = var57 + var35;
         return 1;
      } else if (4001 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var34 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var56 = Interpreter_intStack[class408.Interpreter_intStackSize * -444306794 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1014242302) * -789246802 - 1] = var34 - var56;
         return 1;
      } else if (var0 == 958861883) {
         class408.Interpreter_intStackSize -= 708726074;
         int var33 = Interpreter_intStack[-1256147166 * class408.Interpreter_intStackSize];
         int var55 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 604712384) * 327716789 - 1] = var55 * var33;
         return 1;
      } else if (var0 == -125422146) {
         class408.Interpreter_intStackSize -= 1543801414;
         int var32 = Interpreter_intStack[class408.Interpreter_intStackSize * 1762812392];
         int var54 = Interpreter_intStack[1 + -1576717526 * class408.Interpreter_intStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -800870723) * 1514967880 - 1] = var32 / var54;
         return 1;
      } else if (var0 == 4004) {
         int var31 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1783783449) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 69937090) * 380114191 - 1] = (int)(Math.random() * var31);
         return 1;
      } else if (-1092819938 == var0) {
         int var30 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1698910416) * -148245223];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1552823004) * 1568959198 - 1] = (int)(Math.random() * (1 + var30));
         return 1;
      } else if (var0 == 64107955) {
         class408.Interpreter_intStackSize -= -375668463;
         int var29 = Interpreter_intStack[class408.Interpreter_intStackSize * -270167295];
         int var53 = Interpreter_intStack[1 + 510840628 * class408.Interpreter_intStackSize];
         int var63 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         int var65 = Interpreter_intStack[class408.Interpreter_intStackSize * -181638340 + 3];
         int var67 = Interpreter_intStack[4 + class408.Interpreter_intStackSize * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 611053883) * -1033022322 - 1] = (var53 - var29) * (var67 - var63) / (var65 - var63) + var29;
         return 1;
      } else if (var0 == -2059046739) {
         class408.Interpreter_intStackSize -= -2077902182;
         int var28 = Interpreter_intStack[class408.Interpreter_intStackSize * -982687179];
         int var52 = Interpreter_intStack[class408.Interpreter_intStackSize * 802937509 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -714426719) * 327716789 - 1] = var52 * var28 / 316827532 + var28;
         return 1;
      } else if (167098402 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var27 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var51 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -542439088 - 1] = var27 | 1 << var51;
         return 1;
      } else if (4009 == var0) {
         class408.Interpreter_intStackSize -= 588575426;
         int var26 = Interpreter_intStack[class408.Interpreter_intStackSize * -1067223790];
         int var50 = Interpreter_intStack[class408.Interpreter_intStackSize * 911375617 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var26 & -1 - (1 << var50);
         return 1;
      } else if (4010 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var25 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var49 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -698964683];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -491090878 - 1] = (var25 & 1 << var49) != 0 ? 1 : 0;
         return 1;
      } else if (var0 == 4011) {
         class408.Interpreter_intStackSize -= -457598847;
         int var24 = Interpreter_intStack[-955509136 * class408.Interpreter_intStackSize];
         int var48 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 1025102138];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var24 % var48;
         return 1;
      } else if (var0 == -1412085904) {
         class408.Interpreter_intStackSize -= 708726074;
         int var23 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var47 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         if (var23 == 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 281835427 - 1] = 0;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 89987163) * 1174130602 - 1] = (int)Math.pow(var23, var47);
         }

         return 1;
      } else if (4013 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var46 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -1773602184];
         if (var22 == 0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 340118820) * -1240620713 - 1] = 0;
            return 1;
         } else {
            switch (var46) {
               case 0:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1202997885 - 1] = -1366674826;
                  break;
               case 1:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -579531416 - 1] = var22;
                  break;
               case 2:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1569293876) * 327716789 - 1] = (int)Math.sqrt(var22);
                  break;
               case 3:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 1858024734) * -546478446 - 1] = (int)Math.cbrt(var22);
                  break;
               case 4:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1334051204 - 1] = (int)Math.sqrt(Math.sqrt(var22));
                  break;
               default:
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 2072125122 - 1] = (int)Math.pow(var22, 1.0 / var46);
            }

            return 1;
         }
      } else if (734211157 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 1592163427];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var21 & var45;
         return 1;
      } else if (590528423 == var0) {
         class408.Interpreter_intStackSize -= -424855989;
         int var20 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1007965370 - 1] = var20 | var44;
         return 1;
      } else if (-1682391065 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var19 = Interpreter_intStack[261466209 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1190730061) * -1423922023 - 1] = var19 < var43 ? var19 : var43;
         return 1;
      } else if (4017 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var18 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var42 = Interpreter_intStack[class408.Interpreter_intStackSize * 124619806 + 1];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1745684150) * -66896524 - 1] = var18 > var42 ? var18 : var42;
         return 1;
      } else if (var0 == -554444048) {
         class408.Interpreter_intStackSize -= -1084394537;
         long var17 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         long var62 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         long var66 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 129762092) * -324882656 - 1] = (int)(var17 * var66 / var62);
         return 1;
      } else if (var0 == 1195524965) {
         int var16 = ServerPacket.method7545(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)42);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -49146064) * 327716789 - 1] = var16;
         return 1;
      } else if (1553703760 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[2099214679 * class408.Interpreter_intStackSize];
         int var41 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 1952130716];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var15 ^ 1 << var41;
         return 1;
      } else if (1081814798 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var14 = Interpreter_intStack[class408.Interpreter_intStackSize * -1085460288];
         int var40 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var61 = Interpreter_intStack[-2147285540 * class408.Interpreter_intStackSize + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -424005494 - 1] = class309.method7191(var14, var40, var61, (short)-13775);
         return 1;
      } else if (4028 == var0) {
         class408.Interpreter_intStackSize -= 1509134378;
         int var13 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var39 = Interpreter_intStack[class408.Interpreter_intStackSize * -1020546256 + 1];
         int var60 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -13621393 - 1] = FloatProjection.method6012(var13, var39, var60, 1867504742);
         return 1;
      } else if (var0 == 4029) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var12 = Interpreter_intStack[class408.Interpreter_intStackSize * -707968574];
         int var38 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var59 = Interpreter_intStack[2 + 2015540970 * class408.Interpreter_intStackSize];
         int var64 = 835914133 - var59;
         Interpreter_intStack[(class408.Interpreter_intStackSize += 543878052) * 327716789 - 1] = var12 << var64 >>> var38 + var64;
         return 1;
      } else if (553549510 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var10 = Interpreter_intStack[class408.Interpreter_intStackSize * -1297583036];
         int var37 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         int var58 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 1505796698];
         int var6 = Interpreter_intStack[3 + -1429414269 * class408.Interpreter_intStackSize];
         var10 = FloatProjection.method6012(var10, var58, var6, 1837891899);
         int var7 = SpotAnimationDefinition.method4605(1 + (var6 - var58), 1145061475);
         if (var37 > var7) {
            var37 = var7;
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -715618882) * -1394827905 - 1] = var10 | var37 << var58;
         return 1;
      } else if (var0 == 4032) {
         Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = class137.method4002(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], -1969354115
         );
         return 1;
      } else if (var0 == -324212900) {
         Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = class33.method657(
            Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], 2117985573
         );
         return 1;
      } else if (4034 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var9 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var36 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var5 = class394.method8799(var9, var36, 1155402860);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -280993882) * -1442015292 - 1] = var5;
         return 1;
      } else if (4035 == var0) {
         Interpreter_intStack[-46200962 * class408.Interpreter_intStackSize - 1] = Math.abs(
            Interpreter_intStack[-1420962000 * class408.Interpreter_intStackSize - 1]
         );
         return 1;
      } else if (-667480747 == var0) {
         String var3 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         int var4 = -1;
         if (ViewportMouse.isNumber(var3, -706575412)) {
            var4 = Message.method1204(var3, (byte)-6);
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += 1503141309) * -280623173 - 1] = var4;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("iu")
   static int method1133(int var0, Script var1, boolean var2) {
      if (7463 == var0) {
         boolean var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
         VarbitComposition.method4907(var3, (byte)-1);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ip")
   static int method1134(int var0, Script var1, boolean var2) {
      if (7463 == var0) {
         boolean var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -648767886) * 327716789] == 1;
         VarbitComposition.method4907(var3, (byte)-61);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("io")
   static int method1135(int var0, Script var1, boolean var2) {
      if (7500 == var0) {
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var30 = class39.method651(var24, 2084006716);
         int var34 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DbTable var37 = GraphicsObject.getDbTable(var34, (byte)-13);
         if (var37 == null) {
            throw new RuntimeException();
         } else {
            int var40 = ItemLayer.method5387(var34, 2132936771);
            VarcInt.field2192 = var37.method11886(var30, var40, 1152355492);
            if (null != VarcInt.field2192) {
               client.field709 = Buddy.method10784(var34, 1154991765) * -325293249;
               class291.field3774 = VarcInt.field2192.iterator();
               if (var0 == 7500) {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = VarcInt.field2192.size();
               }
            } else {
               client.field709 = 325293249;
               class291.field3774 = null;
               if (7500 == var0) {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }
            }

            return 1;
         }
      } else if (7501 != var0) {
         if (7502 == var0) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var23 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var29 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            int var33 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
            int var36 = Buddy.method10784(var29, 899981444);
            int var39 = class236.method5960(var29, (byte)-40);
            int var42 = ItemLayer.method5387(var29, 1098241992);
            DbRowType var43 = class141.getDbRowType(var23, 72844399);
            DbTableType var44 = ChatChannel.getDbTableType(var36, -1639043607);
            int[] var45 = var44.types[var39];
            int var12 = 0;
            int var13 = var45.length;
            if (var42 >= 0) {
               if (var42 >= var13) {
                  throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var42 + ", Max: " + var13);
               }

               var12 = var42;
               var13 = 1 + var42;
            }

            Object[] var14 = var43.getColumnType(var39, (byte)-5);
            if (null == var14 && null != var44.defaultValues) {
               var14 = var44.defaultValues[var39];
            }

            if (var14 == null) {
               for (int var46 = var12; var46 < var13; var46++) {
                  int var47 = var45[var46];
                  class586 var48 = class251.method6149(var47, -1703539756);
                  if (class586.field6379 == var48) {
                     Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  } else {
                     Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class113.method3912(var47, -1586861702);
                  }
               }

               return 1;
            } else {
               int var15 = var14.length / var45.length;
               if (var33 >= 0 && var33 < var15) {
                  for (int var16 = var12; var16 < var13; var16++) {
                     int var17 = var16 + var33 * var45.length;
                     class586 var18 = class251.method6149(var45[var16], -1703539756);
                     if (var18 == class586.field6379) {
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var14[var17];
                     } else {
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (Integer)var14[var17];
                     }
                  }

                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         } else if (7503 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var28 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            int var32 = 0;
            int var35 = Buddy.method10784(var28, 1088529454);
            int var38 = class236.method5960(var28, (byte)4);
            DbRowType var41 = class141.getDbRowType(var22, -1542318346);
            DbTableType var9 = ChatChannel.getDbTableType(var35, -1968532262);
            int[] var10 = var9.types[var38];
            Object[] var11 = var41.getColumnType(var38, (byte)6);
            if (var11 == null && var9.defaultValues != null) {
               var11 = var9.defaultValues[var38];
            }

            if (null != var11) {
               var32 = var11.length / var10.length;
            }

            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var32;
            return 1;
         } else if (var0 == 7504) {
            class408.Interpreter_intStackSize -= -1793120611;
            int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            DbTable var27 = WorldMapDecorationType.getDbTable2(var21, (byte)30);
            if (var27 == null) {
               throw new RuntimeException();
            } else {
               VarcInt.field2192 = var27.method11886(0, 0, 1167524517);
               int var31 = 0;
               if (null != VarcInt.field2192) {
                  client.field709 = -325293249 * var21;
                  class291.field3774 = VarcInt.field2192.iterator();
                  var31 = VarcInt.field2192.size();
               }

               if (7504 == var0) {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var31;
               }

               return 1;
            }
         } else if (var0 == 7505) {
            int var20 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            DbRowType var26 = class141.getDbRowType(var20, -1951941512);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1403723051 * var26.tableId;
            return 1;
         } else if (7506 == var0) {
            int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int var25 = -1;
            if (VarcInt.field2192 != null && var19 >= 0 && var19 < VarcInt.field2192.size()) {
               var25 = (Integer)VarcInt.field2192.get(var19);
            }

            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var25;
            return 1;
         } else if (7507 == var0) {
            int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Object var4 = class39.method651(var3, 743247368);
            int var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            DbTable var6 = GraphicsObject.getDbTable(var5, (byte)-123);
            if (var6 == null) {
               throw new RuntimeException();
            } else if (Buddy.method10784(var5, 1429471651) != client.field709 * -1381956417) {
               throw new RuntimeException();
            } else if (VarcInt.field2192 == null && VarcInt.field2192.isEmpty()) {
               throw new RuntimeException();
            } else {
               int var7 = ItemLayer.method5387(var5, 935581403);
               List var8 = var6.method11886(var4, var7, 1472803228);
               VarcInt.field2192 = new LinkedList(VarcInt.field2192);
               if (null != var8) {
                  VarcInt.field2192.retainAll(var8);
               } else {
                  VarcInt.field2192.clear();
               }

               class291.field3774 = VarcInt.field2192.iterator();
               if (7507 == var0) {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = VarcInt.field2192.size();
               }

               return 1;
            }
         } else {
            return 2;
         }
      } else {
         if (class291.field3774 != null && class291.field3774.hasNext()) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (Integer)class291.field3774.next();
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("it")
   static int method1136(int var0, Script var1, boolean var2) {
      if (-1395808339 == var0) {
         int var24 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -282962590];
         Object var30 = class39.method651(var24, -472928712);
         int var34 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DbTable var37 = GraphicsObject.getDbTable(var34, (byte)-64);
         if (var37 == null) {
            throw new RuntimeException();
         } else {
            int var40 = ItemLayer.method5387(var34, 1939912243);
            VarcInt.field2192 = var37.method11886(var30, var40, 729361000);
            if (null != VarcInt.field2192) {
               client.field709 = Buddy.method10784(var34, -460800769) * -1059055802;
               class291.field3774 = VarcInt.field2192.iterator();
               if (var0 == -405203691) {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1770660553 - 1] = VarcInt.field2192.size();
               }
            } else {
               client.field709 = -1082419894;
               class291.field3774 = null;
               if (-606936265 == var0) {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }
            }

            return 1;
         }
      } else if (7501 != var0) {
         if (-264419801 == var0) {
            class408.Interpreter_intStackSize -= -2108794519;
            int var23 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var29 = Interpreter_intStack[class408.Interpreter_intStackSize * -964831173 + 1];
            int var33 = Interpreter_intStack[2 + 1852463739 * class408.Interpreter_intStackSize];
            int var36 = Buddy.method10784(var29, -392327072);
            int var39 = class236.method5960(var29, (byte)92);
            int var42 = ItemLayer.method5387(var29, 1418307008);
            DbRowType var43 = class141.getDbRowType(var23, -1539011299);
            DbTableType var44 = ChatChannel.getDbTableType(var36, -1589956125);
            int[] var45 = var44.types[var39];
            int var12 = 0;
            int var13 = var45.length;
            if (var42 >= 0) {
               if (var42 >= var13) {
                  throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var42 + ", Max: " + var13);
               }

               var12 = var42;
               var13 = 1 + var42;
            }

            Object[] var14 = var43.getColumnType(var39, (byte)-21);
            if (null == var14 && null != var44.defaultValues) {
               var14 = var44.defaultValues[var39];
            }

            if (var14 == null) {
               for (int var46 = var12; var46 < var13; var46++) {
                  int var47 = var45[var46];
                  class586 var48 = class251.method6149(var47, -1703539756);
                  if (class586.field6379 == var48) {
                     Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -65426335) * -1367678048 - 1] = "";
                  } else {
                     Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class113.method3912(var47, -1879301197);
                  }
               }

               return 1;
            } else {
               int var15 = var14.length / var45.length;
               if (var33 >= 0 && var33 < var15) {
                  for (int var16 = var12; var16 < var13; var16++) {
                     int var17 = var16 + var33 * var45.length;
                     class586 var18 = class251.method6149(var45[var16], -1703539756);
                     if (var18 == class586.field6379) {
                        Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1333293409) * -1595015587 - 1] = var14[var17];
                     } else {
                        Interpreter_intStack[(class408.Interpreter_intStackSize += -1759215981) * -336291657 - 1] = (Integer)var14[var17];
                     }
                  }

                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         } else if (7503 == var0) {
            class408.Interpreter_intStackSize -= -1983397419;
            int var22 = Interpreter_intStack[-403571519 * class408.Interpreter_intStackSize];
            int var28 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            int var32 = 0;
            int var35 = Buddy.method10784(var28, -678172653);
            int var38 = class236.method5960(var28, (byte)-46);
            DbRowType var41 = class141.getDbRowType(var22, -1015347796);
            DbTableType var9 = ChatChannel.getDbTableType(var35, -2104193797);
            int[] var10 = var9.types[var38];
            Object[] var11 = var41.getColumnType(var38, (byte)31);
            if (var11 == null && var9.defaultValues != null) {
               var11 = var9.defaultValues[var38];
            }

            if (null != var11) {
               var32 = var11.length / var10.length;
            }

            Interpreter_intStack[(class408.Interpreter_intStackSize += -1798672103) * -1693247007 - 1] = var32;
            return 1;
         } else if (var0 == 1956120715) {
            class408.Interpreter_intStackSize -= -1793120611;
            int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            DbTable var27 = WorldMapDecorationType.getDbTable2(var21, (byte)30);
            if (var27 == null) {
               throw new RuntimeException();
            } else {
               VarcInt.field2192 = var27.method11886(0, 0, 1182128658);
               int var31 = 0;
               if (null != VarcInt.field2192) {
                  client.field709 = 1941884202 * var21;
                  class291.field3774 = VarcInt.field2192.iterator();
                  var31 = VarcInt.field2192.size();
               }

               if (7504 == var0) {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 369514383) * -13749886 - 1] = var31;
               }

               return 1;
            }
         } else if (var0 == -655424434) {
            int var20 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            DbRowType var26 = class141.getDbRowType(var20, -185177233);
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1403723051 * var26.tableId;
            return 1;
         } else if (7506 == var0) {
            int var19 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int var25 = -1;
            if (VarcInt.field2192 != null && var19 >= 0 && var19 < VarcInt.field2192.size()) {
               var25 = (Integer)VarcInt.field2192.get(var19);
            }

            Interpreter_intStack[(class408.Interpreter_intStackSize += -265730817) * 327716789 - 1] = var25;
            return 1;
         } else if (769207 == var0) {
            int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1742076820) * -143417227];
            Object var4 = class39.method651(var3, 99557950);
            int var5 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1380812443) * -1798706766];
            DbTable var6 = GraphicsObject.getDbTable(var5, (byte)-50);
            if (var6 == null) {
               throw new RuntimeException();
            } else if (Buddy.method10784(var5, 1711806901) != client.field709 * -199998940) {
               throw new RuntimeException();
            } else if (VarcInt.field2192 == null && VarcInt.field2192.isEmpty()) {
               throw new RuntimeException();
            } else {
               int var7 = ItemLayer.method5387(var5, 906078033);
               List var8 = var6.method11886(var4, var7, 1794892656);
               VarcInt.field2192 = new LinkedList(VarcInt.field2192);
               if (null != var8) {
                  VarcInt.field2192.retainAll(var8);
               } else {
                  VarcInt.field2192.clear();
               }

               class291.field3774 = VarcInt.field2192.iterator();
               if (7507 == var0) {
                  Interpreter_intStack[(class408.Interpreter_intStackSize += 1322955820) * 327716789 - 1] = VarcInt.field2192.size();
               }

               return 1;
            }
         } else {
            return 2;
         }
      } else {
         if (class291.field3774 != null && class291.field3774.hasNext()) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1550119692) * 327716789 - 1] = (Integer)class291.field3774.next();
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -149915179) * 327716789 - 1] = -1;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Z)V")
   @ObfuscatedName("ds")
   static void method1023(Widget var0, boolean var1) {
      if (var0 != null) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
         if (var1) {
            UserComparator3.scriptDotWidget = var0;
         } else {
            class222.scriptActiveWidget = var0;
         }
      } else {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ij")
   static int method1138(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("iv")
   static int method1139(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("is")
   static int method1140(int var0, Script var1, boolean var2) {
      if (7900 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -131102629) * 819965559];
         client.field711 = Math.max(var3, 0) * -930669964;
         return 1;
      } else if (-1187218405 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1620735179) * 2068182592 - 1] = client.field711 * -338757497;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("iz")
   static int method1141(int var0, Script var1, boolean var2) {
      if (7900 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         client.field711 = Math.max(var3, 0) * -705147593;
         return 1;
      } else if (7901 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field711 * -338757497;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("iw")
   static int method1142(int var0, Script var1, boolean var2) {
      if (7900 == var0) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         client.field711 = Math.max(var3, 0) * -705147593;
         return 1;
      } else if (7901 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field711 * -338757497;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;)Lci;")
   @ObfuscatedName("tu")
   public static Player method994(WorldViewManager var0) {
      if (var0 == null) {
         var0.method2928();
      }

      return WorldView.method3073(
         WorldViewManager.method2901(var0, 1201323213 * client.currentWorldViewId, (byte)1), client.localPlayerIndex * -1548864151, 1741775935
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ir")
   static int method1144(int var0, Script var1, boolean var2) {
      if (var0 == 8000) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var36 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1396503462);
         DynamicArray var61 = (DynamicArray)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
         class520.method11173(var36, var61, 529503132);
         return 1;
      } else if (var0 == 8001) {
         class408.Interpreter_intStackSize -= 708726074;
         int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var60 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         DynamicArray var78 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 253347788
         );
         classPK.method8766(var78, var35, var60, 1387009046);
         return 1;
      } else if (8002 == var0) {
         DynamicArray var34 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var34 == null ? 1 : 0;
         return 1;
      } else if (var0 == 8003) {
         DynamicArray var33 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var33 ? var33.method11215((byte)75) : 0;
         return 1;
      } else if (var0 == 8004) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var32 = (DynamicArray)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         DynamicArray var59 = (DynamicArray)Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = HttpHeaders.method10933(var32, var59, 277595647);
         return 1;
      } else if (var0 == 8005) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var31 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var58 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var77 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         Object var84 = class39.method651(var77, 1777834648);
         DynamicArray var88 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var88
            ? BufferedSink.method10916(var88, var84, var31, var58, 286706411)
            : -1;
         return 1;
      } else if (8006 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var30 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var57 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var76 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         Object var83 = class39.method651(var76, 1349680278);
         DynamicArray var87 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var87 != null
            ? classPE.method8718(var87, var83, var30, var57, 703900950)
            : -1;
         return 1;
      } else if (8007 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var29 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var56 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var75 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         Object var82 = class39.method651(var75, 1034274346);
         DynamicArray var86 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var86
            ? class320.method7365(var86, var82, var29, var56, -1673495005)
            : 0;
         return 1;
      } else if (var0 == 8008) {
         DynamicArray var28 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 125680779
         );
         int var55 = FloorUnderlayDefinition.method4514(var28, (byte)74);
         if (var28.field6107 == class586.field6376) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var55 >= 0 ? var28.method11207(2053374425)[var55] : -1;
         } else {
            if (class586.field6379 != var28.field6107) {
               throw new IllegalStateException();
            }

            String var74 = (String)(var55 >= 0 ? var28.method11214((byte)-75)[var55] : null);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var74 ? var74 : "";
         }

         return 1;
      } else if (8009 == var0) {
         DynamicArray var27 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1438111100
         );
         int var54 = Projectile.method1427(var27, 1393891487);
         if (var27.field6107 == class586.field6376) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54 >= 0 ? var27.method11207(2053374425)[var54] : -1;
         } else {
            if (class586.field6379 != var27.field6107) {
               throw new IllegalStateException();
            }

            String var73 = (String)(var54 >= 0 ? var27.method11214((byte)-96)[var54] : null);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var73 != null ? var73 : "";
         }

         return 1;
      } else if (var0 == 8010) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var26 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var53 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var72 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         Object var81 = class39.method651(var72, -158310615);
         DynamicArray var85 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -2045808111
         );
         class532.method11167(var85, var81, var26, var53, -1753495565);
         return 1;
      } else if (8011 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var25 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var52 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var71 = Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
         DynamicArray var80 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 149409160
         );
         IntHashTable.method10488(var80, var25, 1, var52, var71, 1461486816);
         return 1;
      } else if (var0 == 8012) {
         DynamicArray var24 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 250112317
         );
         FriendSystem.method470(var24, (byte)8);
         return 1;
      } else if (var0 == 8013) {
         int var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DynamicArray var51 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -310552311
         );
         VarpDefinition.method4805(var51, var23, (byte)7);
         return 1;
      } else if (var0 == 8014) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var50 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         DynamicArray var70 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1564981543
         );
         class380.method8275(var70, var22, var50, (byte)1);
         return 1;
      } else if (8015 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var49 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var69 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var79 = VarcInt.method4531(Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587], null, -1890264939);
         DynamicArray var7 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize + 1], null, -2005234208);
         ItemLayer.method5390(var79, var7, var21, var49, var69, 1357830736);
         return 1;
      } else if (var0 == 8016) {
         DynamicArray var20 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1908466635
         );
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)class6.method121(var20, 764544479);
         return 1;
      } else if (8017 == var0) {
         DynamicArray var19 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1256689361
         );
         int var48 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class236.method6007(var19, var48, -671975712);
         return 1;
      } else if (var0 == 8018) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         String var18 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var47 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = classIL.method4911(var18, var47, -979757086);
         return 1;
      } else if (8019 == var0) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var17 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -809498847);
         String var46 = (String)Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class383.method8658(var17, var46, 921778921);
         return 1;
      } else if (var0 == 8020) {
         class408.Interpreter_intStackSize -= 708726074;
         int var16 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         EnumComposition var68 = class108.getEnum(var45, -1889086454);
         if (var68.outputType != var16) {
            throw new RuntimeException();
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var68.method4463(-518979002);
            return 1;
         }
      } else if (8021 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         EnumComposition var67 = class108.getEnum(var44, 48303273);
         if (var67.inputType != var15) {
            throw new RuntimeException();
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = EnumComposition.method4465(
               var67, -783681704
            );
            return 1;
         }
      } else if (var0 == 8022) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var14 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var66 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         if (var66 < var43) {
            var66 = var43;
         }

         if (var43 >= 0 && var43 <= 5000 && var66 >= 0 && var66 <= 5000) {
            if (115 == var14) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                  class586.field6379, "", var43, var66
               );
            } else if (var14 != 105 && var14 != 49) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                  class586.field6376, -1, var43, var66
               );
            } else {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                  class586.field6376, 0, var43, var66
               );
            }

            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 8023) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DynamicArray var42 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -211736005
         );
         if (var13 >= 0 && var13 <= 5000) {
            var42.method11226(var13, (byte)35);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (8024 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var41 = class39.method651(var12, 1323972527);
         DynamicArray var65 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -950161376
         );
         ProjectionCoord.method9918(var65, var65.method11215((byte)53), var41, -493163983);
         return 1;
      } else if (8025 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var11 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var40 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Object var64 = class39.method651(var40, 809896236);
         DynamicArray var6 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 128158359
         );
         ProjectionCoord.method9918(var6, var11, var64, -1458495762);
         return 1;
      } else if (var0 == 8026) {
         int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DynamicArray var39 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 43448308
         );
         Object var63 = GrandExchangeEvent.method8939(var39, var10, -1701730553);
         SwapSongTask.method10272(var39.field6107, var63, (byte)23);
         return 1;
      } else if (8027 == var0) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var9 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1636209004);
         DynamicArray var38 = VarcInt.method4531(Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1], null, -1042100065);
         GrandExchangeOfferNameComparator.method9136(var9, var38, var9.method11215((byte)20), 122104396);
         return 1;
      } else if (var0 == 8028) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var37 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, 301593909);
         DynamicArray var62 = VarcInt.method4531(Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1686938417);
         GrandExchangeOfferNameComparator.method9136(var37, var62, var8, 122104396);
         return 1;
      } else if (8029 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var3 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var4 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         DynamicArray var5 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 262082142
         );
         SpotAnimationDefinition.method4623(var5, var3, var4, -1027917603);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("gr")
   static int method1107(int var0, Script var1, boolean var2) {
      if (var0 == 5306) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class182.getWindowedMode(-749963821);
         return 1;
      } else if (5307 == var0) {
         int var4 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (1 == var4 || var4 == 2) {
            MouseHandler.setWindowedMode(var4, 2109578575);
         }

         return 1;
      } else if (5308 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class468.clientPreferences.getWindowMode((byte)9);
         return 1;
      } else if (var0 != 5309) {
         if (var0 == 5310) {
            class408.Interpreter_intStackSize -= -1793120611;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var3 == 1 || var3 == 2) {
            class468.clientPreferences.updateWindowMode(var3, 680832515);
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("db")
   static int method1008(int var0, Script var1, boolean var2) {
      if (var0 < 1000) {
         return classFR.method4049(var0, var1, var2, -2083112753);
      } else if (var0 < 1100) {
         return class329.method7394(var0, var1, var2, 523086183);
      } else if (var0 < 1200) {
         return classWA.method11669(var0, var1, var2, (byte)4);
      } else if (var0 < 1300) {
         return Varcs.method3164(var0, var1, var2, 327716789);
      } else if (var0 < 1400) {
         return class343.method7618(var0, var1, var2, -500880345);
      } else if (var0 < 1500) {
         return LoginPacket.method4152(var0, var1, var2, -364498099);
      } else if (var0 < 1600) {
         return EnumComposition.method4472(var0, var1, var2, (byte)-28);
      } else if (var0 < 1700) {
         return classPO.method8779(var0, var1, var2, 65032203);
      } else if (var0 < 1800) {
         return HttpResponse.method144(var0, var1, var2, -1446398119);
      } else if (var0 < 1900) {
         return Language.method8871(var0, var1, var2, 776866622);
      } else if (var0 < 2000) {
         return class39.method650(var0, var1, var2, -1622367182);
      } else if (var0 < 2100) {
         return class329.method7394(var0, var1, var2, 1641377373);
      } else if (var0 < 2200) {
         return classWA.method11669(var0, var1, var2, (byte)73);
      } else if (var0 < 2300) {
         return Varcs.method3164(var0, var1, var2, 327716789);
      } else if (var0 < 2400) {
         return class343.method7618(var0, var1, var2, -56884516);
      } else if (var0 < 2500) {
         return LoginPacket.method4152(var0, var1, var2, -364498099);
      } else if (var0 < 2600) {
         return ScriptFrame.method1175(var0, var1, var2, (byte)0);
      } else if (var0 < 2700) {
         return class161.method4257(var0, var1, var2, -2127332257);
      } else if (var0 < 2800) {
         return class165.method4410(var0, var1, var2, 77309312);
      } else if (var0 < 2900) {
         return class180.method4265(var0, var1, var2, 108509540);
      } else if (var0 < 3000) {
         return class39.method650(var0, var1, var2, -1622367182);
      } else if (var0 < 3200) {
         return class431.method9225(var0, var1, var2, 1860563842);
      } else if (var0 < 3300) {
         return GameObject.method6302(var0, var1, var2, 1451037002);
      } else if (var0 < 3400) {
         return class101.method3398(var0, var1, var2, 2029483609);
      } else if (var0 < 3500) {
         return class379.method7978(var0, var1, var2, -1813085635);
      } else if (var0 < 3600) {
         return RestClientThreadFactory.method5(var0, var1, var2, -616650646);
      } else if (var0 < 3700) {
         return Buddy.method10788(var0, var1, var2, (byte)8);
      } else if (var0 < 3800) {
         return class138.method3982(var0, var1, var2, -1654050581);
      } else if (var0 < 3900) {
         return FillMode.method12277(var0, var1, var2, 1893716028);
      } else if (var0 < 4000) {
         return AbstractByteArrayCopier.method7836(var0, var1, var2, (byte)-59);
      } else if (var0 < 4100) {
         return VerticalAlignment.method4596(var0, var1, var2, -504801791);
      } else if (var0 < 4200) {
         return Huffman.method8654(var0, var1, var2, (byte)1);
      } else if (var0 < 4300) {
         return classFO.method4034(var0, var1, var2, -125656445);
      } else if (var0 < 5100) {
         return ScriptFrame.method1176(var0, var1, var2, (byte)-42);
      } else if (var0 < 5400) {
         return FloorOverlayDefinition.method5358(var0, var1, var2, -663683277);
      } else if (var0 < 5600) {
         return class1.method253(var0, var1, var2, -1071366641);
      } else if (var0 < 5700) {
         return class50.method1291(var0, var1, var2, -343906879);
      } else if (var0 < 6300) {
         return classNV.method7855(var0, var1, var2, -222241638);
      } else if (var0 < 6600) {
         return HealthBarUpdate.method1488(var0, var1, var2, (byte)92);
      } else if (var0 < 6700) {
         return class291.method7263(var0, var1, var2, -826941917);
      } else if (var0 < 6800) {
         return classGN.method4251(var0, var1, var2, (byte)-126);
      } else if (var0 < 6900) {
         return HealthBarConfig.method3566(var0, var1, var2, (byte)-1);
      } else if (var0 < 7000) {
         return AsyncRestClient.method246(var0, var1, var2, -1456359715);
      } else if (var0 < 7100) {
         return class545.method11165(var0, var1, var2, 29739896);
      } else if (var0 < 7200) {
         return UserComparator6.method4045(var0, var1, var2, -1790511714);
      } else if (var0 < 7500) {
         return WorldEntityConfig.method4786(var0, var1, var2, (byte)23);
      } else if (var0 < 7600) {
         return ObjectSound.method2737(var0, var1, var2, 2010288750);
      } else if (var0 < 7700) {
         return ArchiveDiskActionHandler.method8887(var0, var1, var2, -724740037);
      } else if (var0 < 8000) {
         return classNJ.method7792(var0, var1, var2, (byte)-53);
      } else if (var0 < 8100) {
         return class101.method3399(var0, var1, var2, (byte)-10);
      } else {
         return var0 >= 13000 && var0 < 14000 ? class209.method4887(var0, var1, var2, (byte)67) : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ix")
   static int method1145(int var0, Script var1, boolean var2) {
      if (var0 == 8000) {
         SecureRandomFuture.Interpreter_objectStackSize -= 288990877;
         DynamicArray var36 = VarcInt.method4531(Interpreter_objectStack[-1280023133 * SecureRandomFuture.Interpreter_objectStackSize], null, -220914467);
         DynamicArray var61 = (DynamicArray)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1129671682];
         class520.method11173(var36, var61, 529503132);
         return 1;
      } else if (var0 == -445955567) {
         class408.Interpreter_intStackSize -= 708726074;
         int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var60 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         DynamicArray var78 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -687851423) * -1595015587], null, -1047246990
         );
         classPK.method8766(var78, var35, var60, 1897279978);
         return 1;
      } else if (-760040235 == var0) {
         DynamicArray var34 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1889996295) * 1026519198];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -770642659 - 1] = var34 == null ? 1 : 0;
         return 1;
      } else if (var0 == -1190545217) {
         DynamicArray var33 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1385081792) * 2012087548];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1143203964) * 327716789 - 1] = null != var33 ? var33.method11215((byte)78) : 0;
         return 1;
      } else if (var0 == 8004) {
         SecureRandomFuture.Interpreter_objectStackSize -= -552139653;
         DynamicArray var32 = (DynamicArray)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         DynamicArray var59 = (DynamicArray)Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1673165988) * -1816482747 - 1] = HttpHeaders.method10933(var32, var59, 1910737693);
         return 1;
      } else if (var0 == 8005) {
         class408.Interpreter_intStackSize -= -569595998;
         int var31 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var58 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         int var77 = Interpreter_intStack[2 + -2004408080 * class408.Interpreter_intStackSize];
         Object var84 = class39.method651(var77, -763027055);
         DynamicArray var88 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * 2109937529];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var88
            ? BufferedSink.method10916(var88, var84, var31, var58, 512337587)
            : -1;
         return 1;
      } else if (8006 == var0) {
         class408.Interpreter_intStackSize -= 389896869;
         int var30 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var57 = Interpreter_intStack[class408.Interpreter_intStackSize * -2134832074 + 1];
         int var76 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 1007632455];
         Object var83 = class39.method651(var76, -159721037);
         DynamicArray var87 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -575568517) * -330926667];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 504950799) * 327716789 - 1] = var87 != null
            ? classPE.method8718(var87, var83, var30, var57, 703900950)
            : -1;
         return 1;
      } else if (8007 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var29 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var56 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var75 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         Object var82 = class39.method651(var75, 1185093041);
         DynamicArray var86 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -759403495) * 40139449];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var86
            ? class320.method7365(var86, var82, var29, var56, -2047504039)
            : 0;
         return 1;
      } else if (var0 == -1499550800) {
         DynamicArray var28 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * 1010091943], null, -378360438
         );
         int var55 = FloorUnderlayDefinition.method4514(var28, (byte)62);
         if (var28.field6107 == class586.field6376) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += 1021466731) * 327716789 - 1] = var55 >= 0 ? var28.method11207(2053374425)[var55] : -1;
         } else {
            if (class586.field6379 != var28.field6107) {
               throw new IllegalStateException();
            }

            String var74 = (String)(var55 >= 0 ? var28.method11214((byte)-8)[var55] : null);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 397043818 - 1] = null != var74 ? var74 : "";
         }

         return 1;
      } else if (8009 == var0) {
         DynamicArray var27 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1138276515) * 1585914196], null, -1205249274
         );
         int var54 = Projectile.method1427(var27, 1393891487);
         if (var27.field6107 == class586.field6376) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -934940113) * 1313319344 - 1] = var54 >= 0 ? var27.method11207(2053374425)[var54] : -1;
         } else {
            if (class586.field6379 != var27.field6107) {
               throw new IllegalStateException();
            }

            String var73 = (String)(var54 >= 0 ? var27.method11214((byte)-102)[var54] : null);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -864755126) * -1595015587 - 1] = var73 != null ? var73 : "";
         }

         return 1;
      } else if (var0 == 8010) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var26 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var53 = Interpreter_intStack[class408.Interpreter_intStackSize * 180841654 + 1];
         int var72 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
         Object var81 = class39.method651(var72, -148513292);
         DynamicArray var85 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -582064752) * -1595015587], null, -1193173519
         );
         class532.method11167(var85, var81, var26, var53, -1699178782);
         return 1;
      } else if (730032751 == var0) {
         class408.Interpreter_intStackSize -= 961477237;
         int var25 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var52 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var71 = Interpreter_intStack[2 + -213924246 * class408.Interpreter_intStackSize];
         DynamicArray var80 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -2056662545], null, -1415489674
         );
         IntHashTable.method10488(var80, var25, 1, var52, var71, 1461486816);
         return 1;
      } else if (var0 == 8012) {
         DynamicArray var24 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1786671231) * -1482353663], null, -617658291
         );
         FriendSystem.method470(var24, (byte)81);
         return 1;
      } else if (var0 == 1277590280) {
         int var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1807498639) * 327716789];
         DynamicArray var51 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1650610711
         );
         VarpDefinition.method4805(var51, var23, (byte)94);
         return 1;
      } else if (var0 == 1126211733) {
         class408.Interpreter_intStackSize -= 708726074;
         int var22 = Interpreter_intStack[-1855890179 * class408.Interpreter_intStackSize];
         int var50 = Interpreter_intStack[1046261732 * class408.Interpreter_intStackSize + 1];
         DynamicArray var70 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * 1592038098], null, -1617620076
         );
         class380.method8275(var70, var22, var50, (byte)1);
         return 1;
      } else if (110776578 == var0) {
         class408.Interpreter_intStackSize -= -1389266975;
         int var21 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var49 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var69 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * -324223391];
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var79 = VarcInt.method4531(Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587], null, -839257097);
         DynamicArray var7 = VarcInt.method4531(Interpreter_objectStack[-1454632619 * SecureRandomFuture.Interpreter_objectStackSize + 1], null, -2112055279);
         ItemLayer.method5390(var79, var7, var21, var49, var69, -2094536201);
         return 1;
      } else if (var0 == 638874856) {
         DynamicArray var20 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -75111556) * -158598576], null, 25913098
         );
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1705417161 - 1] = (int)class6.method121(var20, 764544479);
         return 1;
      } else if (-2129364094 == var0) {
         DynamicArray var19 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1418710265) * -1595015587], null, -1522881282
         );
         int var48 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -568941127) * 327716789];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 2103592562) * 327716789 - 1] = class236.method6007(var19, var48, -1371394106);
         return 1;
      } else if (var0 == 8018) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         String var18 = (String)Interpreter_objectStack[-598583068 * SecureRandomFuture.Interpreter_objectStackSize];
         String var47 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1751433464) * -1595015587 - 1] = classIL.method4911(
            var18, var47, -979757086
         );
         return 1;
      } else if (8019 == var0) {
         SecureRandomFuture.Interpreter_objectStackSize -= -1787757636;
         DynamicArray var17 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -2078507570);
         String var46 = (String)Interpreter_objectStack[1 + -647410208 * SecureRandomFuture.Interpreter_objectStackSize];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1200025875) * -1595015587 - 1] = class383.method8658(
            var17, var46, 921778921
         );
         return 1;
      } else if (var0 == 648155083) {
         class408.Interpreter_intStackSize -= -86349787;
         int var16 = Interpreter_intStack[-1894139064 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         EnumComposition var68 = class108.getEnum(var45, -1531347464);
         if (var68.outputType != var16) {
            throw new RuntimeException();
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var68.method4463(1956847625);
            return 1;
         }
      } else if (8021 == var0) {
         class408.Interpreter_intStackSize -= -87330982;
         int var15 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[-1503928190 * class408.Interpreter_intStackSize + 1];
         EnumComposition var67 = class108.getEnum(var44, -356993681);
         if (var67.inputType != var15) {
            throw new RuntimeException();
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = EnumComposition.method4465(
               var67, -383498467
            );
            return 1;
         }
      } else if (var0 == 8022) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var14 = Interpreter_intStack[-581677246 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[class408.Interpreter_intStackSize * 1149365951 + 1];
         int var66 = Interpreter_intStack[class408.Interpreter_intStackSize * -1469024846 + 2];
         if (var66 < var43) {
            var66 = var43;
         }

         if (var43 >= 0 && var43 <= -1100249552 && var66 >= 0 && var66 <= 5000) {
            if (115 == var14) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1423893894 - 1] = new DynamicArray(
                  class586.field6379, "", var43, var66
               );
            } else if (var14 != 105 && var14 != 1172215856) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1248591903) * 1497015143 - 1] = new DynamicArray(
                  class586.field6376, -1, var43, var66
               );
            } else {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1309643463) * -1595015587 - 1] = new DynamicArray(
                  class586.field6376, 0, var43, var66
               );
            }

            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 8023) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1568156076];
         DynamicArray var42 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1756200078) * -1595015587], null, -962015582
         );
         if (var13 >= 0 && var13 <= 5000) {
            var42.method11226(var13, (byte)96);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (8024 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var41 = class39.method651(var12, 1271904477);
         DynamicArray var65 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -63760195
         );
         ProjectionCoord.method9918(var65, var65.method11215((byte)22), var41, -1148338800);
         return 1;
      } else if (8025 == var0) {
         class408.Interpreter_intStackSize -= 1667355773;
         int var11 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var40 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Object var64 = class39.method651(var40, 1840730997);
         DynamicArray var6 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 480753882) * 1350483096], null, -2703785
         );
         ProjectionCoord.method9918(var6, var11, var64, -756513277);
         return 1;
      } else if (var0 == 8026) {
         int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 1435985905) * -1238682791];
         DynamicArray var39 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -656280799
         );
         Object var63 = GrandExchangeEvent.method8939(var39, var10, -2095564954);
         SwapSongTask.method10272(var39.field6107, var63, (byte)32);
         return 1;
      } else if (-980058868 == var0) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var9 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -914845864);
         DynamicArray var38 = VarcInt.method4531(Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1], null, -1135330794);
         GrandExchangeOfferNameComparator.method9136(var9, var38, var9.method11215((byte)1), 122104396);
         return 1;
      } else if (var0 == 405514896) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -681330909) * 327716789];
         SecureRandomFuture.Interpreter_objectStackSize -= -1605746123;
         DynamicArray var37 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -909349372);
         DynamicArray var62 = VarcInt.method4531(Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -128320107);
         GrandExchangeOfferNameComparator.method9136(var37, var62, var8, 122104396);
         return 1;
      } else if (1298684440 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var3 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var4 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         DynamicArray var5 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -966409297
         );
         SpotAnimationDefinition.method4623(var5, var3, var4, -1027917603);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fd")
   static int method1076(int var0, Script var1, boolean var2) {
      if (3100 == var0) {
         String var21 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         class356.addGameMessage(0, "", var21, 197167012);
         return 1;
      } else if (363035055 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         CameraViewMode.performPlayerAnimation(
            class330.localPlayer,
            Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
            Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
            -40656488
         );
         return 1;
      } else if (var0 == 3103) {
         if (!field338) {
            field345 = true;
         }

         return 1;
      } else if (3104 == var0) {
         String var20 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         int var28 = 0;
         if (ViewportMouse.isNumber(var20, -1239428843)) {
            var28 = Message.method1204(var20, (byte)-64);
         }

         PacketBufferNode var31 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3861, client.packetWriter.isaacCipher, -1997483715);
         var31.packetBuffer.writeInt(var28, 1915176426);
         PacketWriter.method3330(client.packetWriter, var31, -1771370198);
         return 1;
      } else if (var0 == 3105) {
         String var19 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 157513752) * -1595015587];
         PacketBufferNode var27 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3890, client.packetWriter.isaacCipher, -1388906970);
         var27.packetBuffer.writeByte(var19.length() + 1, (short)-5401);
         var27.packetBuffer.writeStringCp1252NullTerminated(var19, 998990159);
         PacketWriter.method3330(client.packetWriter, var27, -1771370198);
         return 1;
      } else if (3106 == var0) {
         String var18 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         PacketBufferNode var26 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3937, client.packetWriter.isaacCipher, -1980498819);
         var26.packetBuffer.writeByte(var18.length() + 1, (short)-15543);
         var26.packetBuffer.writeStringCp1252NullTerminated(var18, 998990159);
         PacketWriter.method3330(client.packetWriter, var26, -1771370198);
         return 1;
      } else if (var0 == 3107) {
         int var17 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 438039885) * 327716789];
         String var25 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -102590403];
         ItemLayer.method5391(var17, var25, 1537274411);
         return 1;
      } else if (3108 == var0) {
         class408.Interpreter_intStackSize -= 1829391578;
         int var16 = Interpreter_intStack[-117321632 * class408.Interpreter_intStackSize];
         int var24 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         int var30 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 888005076];
         Widget var32 = class226.widgetDefinition.method7953(var30, -287796488);
         class141.clickWidget(var32, var16, var24, -1598862641);
         return 1;
      } else if (var0 == 3109) {
         class408.Interpreter_intStackSize -= 708726074;
         int var15 = Interpreter_intStack[883743118 * class408.Interpreter_intStackSize];
         int var23 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         Widget var29 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         class141.clickWidget(var29, var15, var23, 139387819);
         return 1;
      } else if (var0 == 3110) {
         UrlRequest.mouseCam = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1810183808] == 1;
         return 1;
      } else if (1418453693 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1681492323 - 1] = class468.clientPreferences.isRoofsHidden(947779961)
            ? 1
            : 0;
         return 1;
      } else if (var0 == -1074279797) {
         class468.clientPreferences.updateRoofsHidden(Interpreter_intStack[(class408.Interpreter_intStackSize -= 1848909481) * 327716789] == 1, (short)28715);
         return 1;
      } else if (var0 == 3113) {
         String var14 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 768978777) * 1538610320];
         class408.Interpreter_intStackSize -= -1793120611;
         class558.openURL(var14, (short)8613);
         return 1;
      } else if (var0 == 3115) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1566338610];
         PacketBufferNode var22 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3863, client.packetWriter.isaacCipher, -1458329627);
         var22.packetBuffer.writeShort(var13, -1549546143);
         PacketWriter.method3330(client.packetWriter, var22, -1771370198);
         return 1;
      } else if (var0 == -951110070) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 752852591) * -476362823];
         SecureRandomFuture.Interpreter_objectStackSize -= 1352564948;
         String var4 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
         String var5 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize + 1];
         if (var4.length() > 1890652966) {
            return 1;
         } else if (var5.length() > 1501457232) {
            return 1;
         } else {
            PacketBufferNode var6 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3869, client.packetWriter.isaacCipher, -1225248227);
            var6.packetBuffer
               .writeShort(
                  1 + AccessFile.stringCp1252NullTerminatedByteSize(var4, 1129282750) + AccessFile.stringCp1252NullTerminatedByteSize(var5, -89477949),
                  -1838857902
               );
            var6.packetBuffer.writeStringCp1252NullTerminated(var4, 998990159);
            Buffer.method12113(var6.packetBuffer, var12, (short)-25852);
            var6.packetBuffer.writeStringCp1252NullTerminated(var5, 998990159);
            PacketWriter.method3330(client.packetWriter, var6, -1771370198);
            return 1;
         }
      } else if (var0 == 1404989407) {
         class408.Interpreter_intStackSize -= -1793120611;
         return 1;
      } else if (var0 == 986840856) {
         client.showMouseOverText = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1429198579] == 1;
         return 1;
      } else if (3119 == var0) {
         client.renderSelf = Interpreter_intStack[(class408.Interpreter_intStackSize -= -2117595615) * 1823465383] == 1;
         return 1;
      } else if (3120 == var0) {
         if (Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
            client.drawPlayerNames = -215759506 * (-1459845413 * client.drawPlayerNames | 1);
         } else {
            client.drawPlayerNames = -1577262800 * (client.drawPlayerNames * -224483232 & 2031436079);
         }

         return 1;
      } else if (var0 == 1845560132) {
         if (Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
            client.drawPlayerNames = (824554213 * client.drawPlayerNames | 2) * 1549102739;
         } else {
            client.drawPlayerNames = 701763743 * (1375705151 * client.drawPlayerNames & 1116550162);
         }

         return 1;
      } else if (var0 == 3122) {
         if (Interpreter_intStack[(class408.Interpreter_intStackSize -= 1613909537) * 327716789] == 1) {
            client.drawPlayerNames = -1545992877 * (-883358501 * client.drawPlayerNames | 4);
         } else {
            client.drawPlayerNames = 1504786526 * (client.drawPlayerNames * -1459845413 & -1199722562);
         }

         return 1;
      } else if (275958551 == var0) {
         if (Interpreter_intStack[(class408.Interpreter_intStackSize -= -1262844342) * 327716789] == 1) {
            client.drawPlayerNames = (client.drawPlayerNames * -1459845413 | 8) * -1545992877;
         } else {
            client.drawPlayerNames = 1940227762 * (client.drawPlayerNames * -1928004049 & -668176346);
         }

         return 1;
      } else if (271459533 == var0) {
         client.drawPlayerNames = 0;
         return 1;
      } else if (3125 == var0) {
         client.showMouseCross = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1319365947) * -1520880870] == 1;
         return 1;
      } else if (3126 == var0) {
         client.showLoadingMessages = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 842873241] == 1;
         return 1;
      } else if (-1946172288 == var0) {
         KeyHandler.setTapToDrop(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1, 660843766);
         return 1;
      } else if (var0 == 1548951970) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class175.getTapToDrop(-104017761) ? 1 : 0;
         return 1;
      } else if (3129 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         client.oculusOrbNormalSpeed = Interpreter_intStack[1172729690 * class408.Interpreter_intStackSize] * -1502776973;
         client.oculusOrbSlowedSpeed = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] * -481022501;
         return 1;
      } else if (var0 == 567796414) {
         class408.Interpreter_intStackSize -= 708726074;
         return 1;
      } else if (var0 == 3131) {
         class408.Interpreter_intStackSize -= -380218885;
         return 1;
      } else if (3132 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 412275444) * -1903392844 - 1] = class489.canvasWidth * 120179835;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1432221497 - 1] = 19292887 * class374.canvasHeight;
         return 1;
      } else if (1521625338 == var0) {
         class408.Interpreter_intStackSize -= -1965446681;
         return 1;
      } else if (var0 == 833944603) {
         return 1;
      } else if (var0 == -2106786123) {
         class408.Interpreter_intStackSize -= 708726074;
         return 1;
      } else if (var0 == 3136) {
         client.field636 = 96316967;
         client.field733 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -701967878) * 327716789] * 887301543;
         return 1;
      } else if (var0 == 3137) {
         client.field636 = -1367444454;
         client.field733 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 406741468) * 327716789] * 887301543;
         return 1;
      } else if (-1118752450 == var0) {
         client.field636 = 0;
         return 1;
      } else if (var0 == 3139) {
         client.field636 = 331299268;
         return 1;
      } else if (1629465850 == var0) {
         client.field636 = 1160883376;
         client.field733 = (var2 ? 900297422 * UserComparator3.scriptDotWidget.id : class222.scriptActiveWidget.id * 278777747) * 1170653297;
         return 1;
      } else if (var0 == 897205293) {
         boolean var11 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1116207785) * 327716789] == 1;
         ClientPreferences.method1569(class468.clientPreferences, var11, 1742487339);
         return 1;
      } else if (1679396486 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ClientPreferences.method1560(
               class468.clientPreferences, 1949744332
            )
            ? 1
            : 0;
         return 1;
      } else if (456950144 == var0) {
         boolean var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1287343578) * 327716789] == 1;
         client.Login_isUsernameRemembered = var10;
         if (!var10) {
            class468.clientPreferences.updateRememberedUsername("", (byte)1);
         }

         return 1;
      } else if (var0 == -893825085) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1954551822) * 327716789 - 1] = client.Login_isUsernameRemembered ? 1 : 0;
         return 1;
      } else if (-1659799307 == var0) {
         return 1;
      } else if (3146 == var0) {
         boolean var9 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -950268479) * -728308929] == 1;
         class468.clientPreferences.updateTitleMusicDisabled(!var9, -1316755967);
         return 1;
      } else if (346062419 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -2091994544) * 327716789 - 1] = class468.clientPreferences.isTitleMusicDisabled(1361940139)
            ? 0
            : 1;
         return 1;
      } else if (var0 == 3148) {
         return 1;
      } else if (var0 == 3149) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -865943563) * 1492775351 - 1] = 0;
         return 1;
      } else if (var0 == 2047437379) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         return 1;
      } else if (1202321287 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 2055058333) * 1381429769 - 1] = 0;
         return 1;
      } else if (var0 == -2102789670) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1510998892) * 327716789 - 1] = 0;
         return 1;
      } else if (3153 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1716896267) * 327716789 - 1] = 93450971 * Login.Login_loadingPercent;
         return 1;
      } else if (var0 == -1439123192) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1245002177 - 1] = StudioGame.method8771(871960420);
         return 1;
      } else if (var0 == 3155) {
         SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
         return 1;
      } else if (var0 == 1589798736) {
         return 1;
      } else if (3157 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         return 1;
      } else if (1521191976 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -113301584 - 1] = 0;
         return 1;
      } else if (var0 == 3159) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         return 1;
      } else if (var0 == 3160) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -87240656) * 327716789 - 1] = 0;
         return 1;
      } else if (3161 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1291822452) * 327716789 - 1] = 0;
         return 1;
      } else if (3162 == var0) {
         class408.Interpreter_intStackSize -= -341930359;
         Interpreter_intStack[(class408.Interpreter_intStackSize += 690197276) * 1856366955 - 1] = 0;
         return 1;
      } else if (var0 == 3163) {
         SecureRandomFuture.Interpreter_objectStackSize -= -585454830;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1326780406) * -890950932 - 1] = 0;
         return 1;
      } else if (3164 == var0) {
         class408.Interpreter_intStackSize -= 1073171524;
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 441260380) * -1595015587 - 1] = "";
         return 1;
      } else if (431044784 == var0) {
         class408.Interpreter_intStackSize -= 707433217;
         Interpreter_intStack[(class408.Interpreter_intStackSize += 505566908) * 327716789 - 1] = 0;
         return 1;
      } else if (3166 == var0) {
         class408.Interpreter_intStackSize -= -186409679;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1910324732 - 1] = 0;
         return 1;
      } else if (var0 == 3167) {
         class408.Interpreter_intStackSize -= -204668835;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1483192104) * -533208906 - 1] = 0;
         return 1;
      } else if (-1091115765 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -18643937) * -1595015587 - 1] = "";
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -320513384) * -1595015587 - 1] = "";
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1242752536) * -1595015587 - 1] = "";
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1239850553) * 879525974 - 1] = "";
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -516177687) * -1595015587 - 1] = "";
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += -1330451999) * -791036168 - 1] = "";
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 691917164) * -134192127 - 1] = "";
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         return 1;
      } else if (var0 == 3169) {
         return 1;
      } else if (var0 == 3170) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         return 1;
      } else if (1202399600 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1900356031 - 1] = 0;
         return 1;
      } else if (3172 == var0) {
         class408.Interpreter_intStackSize -= -1793120611;
         return 1;
      } else if (var0 == 334153961) {
         class408.Interpreter_intStackSize -= -1793120611;
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
         return 1;
      } else if (var0 == -68245094) {
         class408.Interpreter_intStackSize -= -1793120611;
         return 1;
      } else if (var0 == -602310125) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 574422561 - 1] = 0;
         return 1;
      } else if (var0 == 1927836578) {
         return 1;
      } else if (var0 == 1854250112) {
         return 1;
      } else if (var0 == 3178) {
         SecureRandomFuture.Interpreter_objectStackSize -= 17874616;
         return 1;
      } else if (-402718702 == var0) {
         return 1;
      } else if (var0 == 3180) {
         SecureRandomFuture.Interpreter_objectStackSize -= -487191540;
         return 1;
      } else if (var0 == 3181) {
         DefaultsGroup.method11178(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -2017562383);
         return 1;
      } else if (var0 == -248096846) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1663156372 - 1] = ApproximateRouteStrategy.method383((byte)60);
         return 1;
      } else if (-273893159 == var0) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         ClientPreferences.method1661(class468.clientPreferences, var8, -723996878);
         return 1;
      } else if (var0 == 3186) {
         int var7 = class468.clientPreferences.getDrawDistance((byte)-21);
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7;
         return 1;
      } else if (var0 == -1647324771) {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 454079079];
         classPY.method8823(var3, -1339845108);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ic")
   static int method1148(int var0, Script var1, boolean var2) {
      if (13337 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -793674838) * -171962254 - 1] = 1776193405 * field339;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ia")
   static void method1149(int var0) {
      if (var0 != -1) {
         if (WidgetDefinition.method7961(class226.widgetDefinition, var0, -2052135913)) {
            Widget[] var1 = class226.widgetDefinition.Widget_interfaceComponents[var0];

            for (int var2 = 0; var2 < var1.length; var2++) {
               Widget var3 = var1[var2];
               if (null != var3.field4566) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.field4566;
                  LoginType.runScript(var4, 5000000, 0, (byte)11);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("in")
   static void method1150(int var0) {
      if (var0 != -1) {
         if (WidgetDefinition.method7961(class226.widgetDefinition, var0, -2011848293)) {
            Widget[] var1 = class226.widgetDefinition.Widget_interfaceComponents[var0];

            for (int var2 = 0; var2 < var1.length; var2++) {
               Widget var3 = var1[var2];
               if (null != var3.field4566) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.field4566;
                  LoginType.runScript(var4, 5000000, 0, (byte)-45);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ih")
   static void method1151(int var0) {
      if (var0 != -1) {
         if (WidgetDefinition.method7961(class226.widgetDefinition, var0, -1803500128)) {
            Widget[] var1 = class226.widgetDefinition.Widget_interfaceComponents[var0];

            for (int var2 = 0; var2 < var1.length; var2++) {
               Widget var3 = var1[var2];
               if (null != var3.field4566) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.field4566;
                  LoginType.runScript(var4, 5000000, 0, (byte)4);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILoj;Z)V")
   @ObfuscatedName("im")
   static void method1153(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = class455.getWorldMap(-908932380).getMapArea(var0, (byte)4);
      int var4 = -2060016843 * class330.localPlayer.plane;
      int var5 = (class330.localPlayer.x * 340712311 >> 7) + Occluder.topLevelWorldView.baseX * 825809917;
      int var6 = (-1747310679 * class330.localPlayer.y >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
      Coord var7 = new Coord(var4, var5, var6);
      class455.getWorldMap(-984671135).method11432(var3, var7, var1, var2, 573941221);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILoj;Z)V")
   @ObfuscatedName("ik")
   static void method1154(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = class455.getWorldMap(-1707416260).getMapArea(var0, (byte)4);
      int var4 = -2060016843 * class330.localPlayer.plane;
      int var5 = (class330.localPlayer.x * 340712311 >> 7) + Occluder.topLevelWorldView.baseX * 825809917;
      int var6 = (-1747310679 * class330.localPlayer.y >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
      Coord var7 = new Coord(var4, var5, var6);
      class455.getWorldMap(-792808119).method11432(var3, var7, var1, var2, -1741271017);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("jm")
   static void method1163(Widget var0) {
      var0.method8152(-2060145755);
      var0.method8156(296393848).method8528(new class85(var0), (byte)-63);
      classOO.method8526(var0.method8156(1333874172), new classDH(var0), -1725722684);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILoj;Z)V")
   @ObfuscatedName("jj")
   static void method1155(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = class455.getWorldMap(-2064698468).getMapArea(var0, (byte)4);
      int var4 = -2060016843 * class330.localPlayer.plane;
      int var5 = (class330.localPlayer.x * 340712311 >> 7) + Occluder.topLevelWorldView.baseX * 825809917;
      int var6 = (-1747310679 * class330.localPlayer.y >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
      Coord var7 = new Coord(var4, var5, var6);
      class455.getWorldMap(-135152055).method11432(var3, var7, var1, var2, -534231869);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwh;)Ljava/lang/Object;")
   @ObfuscatedName("jp")
   static Object method1156(class586 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.field6375 * -988855830) {
            case 0:
               return Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            case 3:
               return Interpreter_intStack[(class408.Interpreter_intStackSize -= 1809936070) * 327716789];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("hr")
   static int method1118(int var0, Script var1, boolean var2) {
      if (6500 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class406.loadWorlds(-466122552) ? 1 : 0;
         return 1;
      } else if (6501 == var0) {
         World var14 = class339.worldListStart(-591687284);
         if (null != var14) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 789563243 * var14.population;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14.location * -607869593;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var14.activity;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14.index * -428025341;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14.properties * 2054822665;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var14.host;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         }

         return 1;
      } else if (var0 == 6502) {
         World var13 = class217.getNextWorldListWorld(-1783805206);
         if (null != var13) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 789563243 * var13.population;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var13.location * -607869593;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var13.activity;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -428025341 * var13.index;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 2054822665 * var13.properties;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var13.host;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         }

         return 1;
      } else if (6506 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         World var20 = null;

         for (int var25 = 0; var25 < World.World_count * -858019443; var25++) {
            if (World.World_worlds[var25].population * 789563243 == var12) {
               var20 = World.World_worlds[var25];
               break;
            }
         }

         if (null != var20) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var20.population * 789563243;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var20.location * -607869593;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var20.activity;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -428025341 * var20.index;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var20.properties * 2054822665;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var20.host;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         }

         return 1;
      } else if (6507 == var0) {
         class408.Interpreter_intStackSize -= 1417452148;
         int var11 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         boolean var19 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize] == 1;
         int var24 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
         boolean var6 = 1 == Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 3];
         class204.sortWorldList(var11, var19, var24, var6, -1474391494);
         return 1;
      } else if (var0 != 6511) {
         if (var0 == 6512) {
            client.followerOpsLowPriority = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            return 1;
         } else if (var0 == 6513) {
            class408.Interpreter_intStackSize -= 708726074;
            int var10 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var18 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            ParamComposition var23 = WorldMap.getParamDefinition(var18, -1800529043);
            if (ParamComposition.method4969(var23, -393631216)) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = NPCComposition.method4698(
                  AsyncHttpResponse.getNpcDefinition(var10, (byte)11), var18, var23.defaultStr, (byte)61
               );
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = NPCComposition.method4694(
                  AsyncHttpResponse.getNpcDefinition(var10, (byte)18), var18, var23.defaultInt * -822826545, 192977228
               );
            }

            return 1;
         } else if (6514 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            int var9 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var17 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            ParamComposition var22 = WorldMap.getParamDefinition(var17, -350309829);
            if (ParamComposition.method4969(var22, 859228274)) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = AsyncHttpResponse.getObjectDefinition(
                     var9, 2098621371
                  )
                  .getStringParam(var17, var22.defaultStr, 1937008376);
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ObjectComposition.method5175(
                  AsyncHttpResponse.getObjectDefinition(var9, 2072629102), var17, -822826545 * var22.defaultInt, -1372277080
               );
            }

            return 1;
         } else if (var0 == 6515) {
            class408.Interpreter_intStackSize -= 708726074;
            int var8 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var16 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            ParamComposition var21 = WorldMap.getParamDefinition(var16, -1108449416);
            if (ParamComposition.method4969(var21, 536398246)) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class150.ItemDefinition_get(
                     var8, -1568823071
                  )
                  .getStringParam(var16, var21.defaultStr, (byte)-22);
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ItemComposition.method5086(
                  class150.ItemDefinition_get(var8, -1121184563), var16, -822826545 * var21.defaultInt, -2138103929
               );
            }

            return 1;
         } else if (var0 == 6516) {
            class408.Interpreter_intStackSize -= 708726074;
            int var7 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var15 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            ParamComposition var5 = WorldMap.getParamDefinition(var15, -737201764);
            if (ParamComposition.method4969(var5, -316411305)) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class39.StructDefinition_getStructDefinition(
                     var7, 216798901
                  )
                  .getStringParam(var15, var5.defaultStr, (byte)0);
            } else {
               Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class39.StructDefinition_getStructDefinition(
                     var7, 1792660964
                  )
                  .getIntParam(var15, var5.defaultInt * -822826545, 1630908785);
            }

            return 1;
         } else if (6518 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.onMobile ? 1 : 0;
            return 1;
         } else if (6519 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.clientType * 1499774163;
            return 1;
         } else if (var0 == 6520) {
            return 1;
         } else if (var0 == 6521) {
            return 1;
         } else if (var0 == 6522) {
            SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
            class408.Interpreter_intStackSize -= -1793120611;
            return 1;
         } else if (var0 == 6523) {
            SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
            class408.Interpreter_intStackSize -= -1793120611;
            return 1;
         } else if (6524 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            return 1;
         } else if (6525 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            return 1;
         } else if (6526 == var0) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
            return 1;
         } else if (var0 == 6527) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1225137509 * client.field717;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var3 >= 0 && var3 < -858019443 * World.World_count) {
            World var4 = World.World_worlds[var3];
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 789563243 * var4.population;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -607869593 * var4.location;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.activity;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -428025341 * var4.index;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 2054822665 * var4.properties;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.host;
         } else {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("jd")
   static Object method1158(int var0) {
      return var0 == -1 ? null : class165.method4411((class586)GrandExchangeOffer.findEnumerated(class586.method11705((byte)54), var0, (byte)1), 790883686);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwh;Ljava/lang/Object;)V")
   @ObfuscatedName("ja")
   static void method1160(class586 var0, Object var1) {
      if (null == var0) {
         throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
      } else {
         switch (537648058 * var0.field6375) {
            case 0:
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var1;
               break;
            case 3:
               Interpreter_intStack[(class408.Interpreter_intStackSize += 751442108) * -1678165684 - 1] = (Integer)var1;
               break;
            default:
               throw new IllegalStateException("pushValueOfType() failure - unsupported type");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)V")
   @ObfuscatedName("dy")
   static void method1006(DynamicArray var0, int var1) {
      if (var1 < 0 || var1 >= var0.method11215((byte)105)) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ei")
   static int method1045(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1605607720], -1377230625);
      } else {
         var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
      }

      String var4 = (String)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -1848098761) * 520929431];
      int[] var5 = null;
      if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -49266167) * 1775866981];
         if (var6 > 0) {
            var5 = new int[var6];

            while (var6-- > 0) {
               var5[var6] = Interpreter_intStack[(class408.Interpreter_intStackSize -= 917912035) * -516135567];
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      for (int var7 = var9.length - 1; var7 >= 1; var7--) {
         switch (var4.charAt(var7 - 1)) {
            case 'W':
            case 'X':
            case 's':
               var9[var7] = Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               break;
            default:
               var9[var7] = new Integer(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 607574454]);
         }
      }

      int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 1701054998];
      if (var10 != -1) {
         var9[0] = new Integer(var10);
      } else {
         var9 = null;
      }

      if (532193785 == var0) {
         var3.onDialogAbort = var9;
      } else if (var0 == 1401) {
         var3.onResize = var9;
      } else if (1117116550 == var0) {
         var3.field4569 = var9;
      } else if (1403 == var0) {
         var3.field4547 = var9;
      } else if (var0 == 787528319) {
         var3.onMiscTransmit = var9;
      } else if (var0 == 1405) {
         var3.onOp = var9;
      } else if (var0 == 1406) {
         var3.onMouseOver = var9;
      } else if (-1253192823 == var0) {
         var3.onLoad = var9;
         var3.varTransmitTriggers = var5;
      } else if (var0 == 1929488970) {
         var3.onTargetEnter = var9;
      } else if (-1109994335 == var0) {
         var3.onClickRepeat = var9;
      } else if (2118758875 == var0) {
         var3.field4575 = var9;
      } else if (var0 == 1411) {
         var3.onMouseRepeat = var9;
      } else if (1473827233 == var0) {
         var3.onRelease = var9;
      } else if (1414 == var0) {
         var3.onStatTransmit = var9;
         var3.invTransmitTriggers = var5;
      } else if (1877896946 == var0) {
         var3.onScroll = var9;
         var3.statTransmitTriggers = var5;
      } else if (var0 == 1416) {
         var3.onChatTransmit = var9;
      } else if (var0 == 1998857735) {
         var3.onVarTransmit = var9;
      } else if (1418 == var0) {
         var3.onInvTransmit = var9;
      } else if (var0 == -2013325238) {
         var3.onDrag = var9;
      } else if (var0 == -461714433) {
         var3.onKey = var9;
      } else if (var0 == 1421) {
         var3.field4567 = var9;
      } else if (1422 == var0) {
         var3.onHold = var9;
      } else if (var0 == -1021112612) {
         var3.field4587 = var9;
      } else if (var0 == 1424) {
         var3.field4541 = var9;
      } else if (1739130196 == var0) {
         var3.onSubChange = var9;
      } else if (var0 == 1778924576) {
         var3.onDragComplete = var9;
      } else if (1007805842 == var0) {
         var3.onTargetLeave = var9;
      } else if (1428 == var0) {
         var3.onStockTransmit = var9;
      } else if (var0 == 1429) {
         var3.onMouseLeave = var9;
      } else if (var0 == 1774790090) {
         var3.onFriendTransmit = var9;
      } else if (1431 == var0) {
         var3.onClick = var9;
      } else if (1434 == var0) {
         var3.onTimer = var9;
      } else if (1435 == var0) {
         var3.onClanTransmit = var9;
      } else {
         if (var0 < -1011972218 || var0 > 1439) {
            return 2;
         }

         class376 var8 = var3.method8164((byte)-70);
         if (null != var8) {
            if (1436 == var0) {
               var8.field4682 = var9;
            } else if (var0 == 1437) {
               var8.field4683 = var9;
            } else if (var0 == 1438) {
               var8.field4684 = var9;
            } else if (var0 == 1439) {
               var8.field4685 = var9;
            }
         }
      }

      var3.hasListener = true;
      return 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("jn")
   static void method1164(Widget var0) {
      var0.method8152(-1425180700);
      var0.method8156(559600966).method8528(new class85(var0), (byte)-93);
      classOO.method8526(var0.method8156(1048719061), new classDH(var0), 2049502214);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("fu")
   static int method1073(int var0, Script var1, boolean var2) {
      Widget var3 = class226.widgetDefinition.method7953(Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -312704289);
      if (var0 == 2500) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -814361553 * var3.x;
         return 1;
      } else if (2501 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.y * -286860451;
         return 1;
      } else if (2502 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.width * -1946208531;
         return 1;
      } else if (2503 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.height * -905446999;
         return 1;
      } else if (var0 == 2504) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (2505 == var0) {
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 794900977 * var3.parentId;
         return 1;
      } else if (var0 != 2506) {
         return 2;
      } else {
         int var4 = 794900977 * var3.parentId;
         if (var4 == -1) {
            for (InterfaceParent var5 = (InterfaceParent)client.interfaceParents.first(); null != var5; var5 = (InterfaceParent)client.interfaceParents.next()) {
               if (-1385287145 * var5.group == var3.id * 278777747 >> 16) {
                  var4 = (int)var5.key;
                  break;
               }
            }
         }

         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Lof;)V")
   @ObfuscatedName("jv")
   static void method1166(Widget var0, Widget var1) {
      if (var0.type * 928687775 == 0) {
         for (int var2 = var0.field4453 * -1516264759; var2 <= -86298045 * var0.field4454; var2++) {
            Widget var3 = var1.children[var2];
            if (var3 != null && var0.childIndex * 2077538819 == var3.field4451 * 1865628485) {
               ClickAction.method11249(var3, var1, (short)30516);
            }
         }
      }

      var1.children[2077538819 * var0.childIndex] = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcu;Z)I")
   @ObfuscatedName("ie")
   static int method1146(int var0, Script var1, boolean var2) {
      if (var0 == 8000) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var36 = VarcInt.method4531(Interpreter_objectStack[1253211245 * SecureRandomFuture.Interpreter_objectStackSize], null, -2098339398);
         DynamicArray var61 = (DynamicArray)Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
         class520.method11173(var36, var61, 529503132);
         return 1;
      } else if (var0 == 8001) {
         class408.Interpreter_intStackSize -= 416526293;
         int var35 = Interpreter_intStack[class408.Interpreter_intStackSize * 1209687040];
         int var60 = Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         DynamicArray var78 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -414907872
         );
         classPK.method8766(var78, var35, var60, 855012744);
         return 1;
      } else if (8002 == var0) {
         DynamicArray var34 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1303652249) * -1415408052];
         Interpreter_intStack[(class408.Interpreter_intStackSize += 1393530098) * 327716789 - 1] = var34 == null ? 1 : 0;
         return 1;
      } else if (var0 == -960364655) {
         DynamicArray var33 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 732306534) * 44457241];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var33 ? var33.method11215((byte)29) : 0;
         return 1;
      } else if (var0 == 8004) {
         SecureRandomFuture.Interpreter_objectStackSize -= 674967135;
         DynamicArray var32 = (DynamicArray)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         DynamicArray var59 = (DynamicArray)Interpreter_objectStack[1 + 2064142749 * SecureRandomFuture.Interpreter_objectStackSize];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1845174590) * 327716789 - 1] = HttpHeaders.method10933(var32, var59, 935236023);
         return 1;
      } else if (var0 == 8005) {
         class408.Interpreter_intStackSize -= -925802400;
         int var31 = Interpreter_intStack[169667533 * class408.Interpreter_intStackSize];
         int var58 = Interpreter_intStack[class408.Interpreter_intStackSize * -1245075755 + 1];
         int var77 = Interpreter_intStack[2 + -932762065 * class408.Interpreter_intStackSize];
         Object var84 = class39.method651(var77, 1753663254);
         DynamicArray var88 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1480969003];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var88
            ? BufferedSink.method10916(var88, var84, var31, var58, -1154883212)
            : -1;
         return 1;
      } else if (-938254164 == var0) {
         class408.Interpreter_intStackSize -= -643820929;
         int var30 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
         int var57 = Interpreter_intStack[class408.Interpreter_intStackSize * -1233177593 + 1];
         int var76 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 1258028492];
         Object var83 = class39.method651(var76, 671851682);
         DynamicArray var87 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * -1323134795 - 1] = var87 != null
            ? classPE.method8718(var87, var83, var30, var57, 703900950)
            : -1;
         return 1;
      } else if (8007 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var29 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var56 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var75 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 1847495313];
         Object var82 = class39.method651(var75, 1198291221);
         DynamicArray var86 = (DynamicArray)Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1151628022 - 1] = null != var86
            ? class320.method7365(var86, var82, var29, var56, -1645562951)
            : 0;
         return 1;
      } else if (var0 == 1961027317) {
         DynamicArray var28 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 203363710) * -1595015587], null, -1814533156
         );
         int var55 = FloorUnderlayDefinition.method4514(var28, (byte)94);
         if (var28.field6107 == class586.field6376) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var55 >= 0 ? var28.method11207(2053374425)[var55] : -1;
         } else {
            if (class586.field6379 != var28.field6107) {
               throw new IllegalStateException();
            }

            String var74 = (String)(var55 >= 0 ? var28.method11214((byte)54)[var55] : null);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1113355694 - 1] = null != var74 ? var74 : "";
         }

         return 1;
      } else if (-1263497765 == var0) {
         DynamicArray var27 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -2123116168) * -1595015587], null, -1151092369
         );
         int var54 = Projectile.method1427(var27, 1393891487);
         if (var27.field6107 == class586.field6376) {
            Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 1384954665 - 1] = var54 >= 0 ? var27.method11207(2053374425)[var54] : -1;
         } else {
            if (class586.field6379 != var27.field6107) {
               throw new IllegalStateException();
            }

            String var73 = (String)(var54 >= 0 ? var27.method11214((byte)-80)[var54] : null);
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 130796491) * -1980949179 - 1] = var73 != null ? var73 : "";
         }

         return 1;
      } else if (var0 == 8010) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var26 = Interpreter_intStack[-1172704107 * class408.Interpreter_intStackSize];
         int var53 = Interpreter_intStack[class408.Interpreter_intStackSize * 974043642 + 1];
         int var72 = Interpreter_intStack[class408.Interpreter_intStackSize * -816302815 + 2];
         Object var81 = class39.method651(var72, 191939180);
         DynamicArray var85 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, 32794361
         );
         class532.method11167(var85, var81, var26, var53, -2005289300);
         return 1;
      } else if (8011 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var25 = Interpreter_intStack[class408.Interpreter_intStackSize * -1921565342];
         int var52 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var71 = Interpreter_intStack[2 + -1549447561 * class408.Interpreter_intStackSize];
         DynamicArray var80 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1694336687) * 1415473906], null, -66654721
         );
         IntHashTable.method10488(var80, var25, 1, var52, var71, 1461486816);
         return 1;
      } else if (var0 == -1516866758) {
         DynamicArray var24 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -143222942], null, -51737269
         );
         FriendSystem.method470(var24, (byte)99);
         return 1;
      } else if (var0 == 8013) {
         int var23 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1959624456) * 900095388];
         DynamicArray var51 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -2044660670], null, -894498802
         );
         VarpDefinition.method4805(var51, var23, (byte)12);
         return 1;
      } else if (var0 == -1010157779) {
         class408.Interpreter_intStackSize -= 852687655;
         int var22 = Interpreter_intStack[-1239131381 * class408.Interpreter_intStackSize];
         int var50 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         DynamicArray var70 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1656605957) * -1595015587], null, -1701723237
         );
         class380.method8275(var70, var22, var50, (byte)1);
         return 1;
      } else if (8015 == var0) {
         class408.Interpreter_intStackSize -= -1084394537;
         int var21 = Interpreter_intStack[11287659 * class408.Interpreter_intStackSize];
         int var49 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
         int var69 = Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var79 = VarcInt.method4531(Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587], null, -1973802533);
         DynamicArray var7 = VarcInt.method4531(Interpreter_objectStack[-223854732 * SecureRandomFuture.Interpreter_objectStackSize + 1], null, 141515898);
         ItemLayer.method5390(var79, var7, var21, var49, var69, -699354127);
         return 1;
      } else if (var0 == -669429564) {
         DynamicArray var20 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1287294987], null, 138516005
         );
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)class6.method121(var20, 764544479);
         return 1;
      } else if (8017 == var0) {
         DynamicArray var19 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1477365171], null, -317247084
         );
         int var48 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -148192368) * -1055909732];
         Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class236.method6007(var19, var48, -336669433);
         return 1;
      } else if (var0 == 1519380176) {
         SecureRandomFuture.Interpreter_objectStackSize -= 469647468;
         String var18 = (String)Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
         String var47 = (String)Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * 843066562 - 1] = classIL.method4911(var18, var47, -979757086);
         return 1;
      } else if (924204049 == var0) {
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var17 = VarcInt.method4531(Interpreter_objectStack[-1261463077 * SecureRandomFuture.Interpreter_objectStackSize], null, -852805627);
         String var46 = (String)Interpreter_objectStack[1 + -1444425288 * SecureRandomFuture.Interpreter_objectStackSize];
         Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1960079758) * 986084607 - 1] = class383.method8658(var17, var46, 921778921);
         return 1;
      } else if (var0 == -1105076877) {
         class408.Interpreter_intStackSize -= 708726074;
         int var16 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var45 = Interpreter_intStack[1538855059 * class408.Interpreter_intStackSize + 1];
         EnumComposition var68 = class108.getEnum(var45, -1358764254);
         if (var68.outputType != var16) {
            throw new RuntimeException();
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var68.method4463(1479977571);
            return 1;
         }
      } else if (8021 == var0) {
         class408.Interpreter_intStackSize -= 662878478;
         int var15 = Interpreter_intStack[1172389359 * class408.Interpreter_intStackSize];
         int var44 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
         EnumComposition var67 = class108.getEnum(var44, -1517043140);
         if (var67.inputType != var15) {
            throw new RuntimeException();
         } else {
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1403949387) * -1595015587 - 1] = EnumComposition.method4465(
               var67, 661089131
            );
            return 1;
         }
      } else if (var0 == 8022) {
         class408.Interpreter_intStackSize -= -1759596867;
         int var14 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var43 = Interpreter_intStack[class408.Interpreter_intStackSize * -996963236 + 1];
         int var66 = Interpreter_intStack[class408.Interpreter_intStackSize * -322926997 + 2];
         if (var66 < var43) {
            var66 = var43;
         }

         if (var43 >= 0 && var43 <= 5000 && var66 >= 0 && var66 <= 5000) {
            if (-345767940 == var14) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 1291505639) * -1595015587 - 1] = new DynamicArray(
                  class586.field6379, "", var43, var66
               );
            } else if (var14 != 105 && var14 != 49) {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 2060874229) * -1904841036 - 1] = new DynamicArray(
                  class586.field6376, -1, var43, var66
               );
            } else {
               Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                  class586.field6376, 0, var43, var66
               );
            }

            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 8023) {
         int var13 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         DynamicArray var42 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= -765776592) * 398721410], null, -338333974
         );
         if (var13 >= 0 && var13 <= 5000) {
            var42.method11226(var13, (byte)12);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (8024 == var0) {
         int var12 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         Object var41 = class39.method651(var12, -103187335);
         DynamicArray var65 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1632096013) * -1595015587], null, 196723547
         );
         ProjectionCoord.method9918(var65, var65.method11215((byte)1), var41, 1467463311);
         return 1;
      } else if (8025 == var0) {
         class408.Interpreter_intStackSize -= 122065167;
         int var11 = Interpreter_intStack[954507985 * class408.Interpreter_intStackSize];
         int var40 = Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
         Object var64 = class39.method651(var40, -689927381);
         DynamicArray var6 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * 2127739822], null, 290623242
         );
         ProjectionCoord.method9918(var6, var11, var64, -1135150346);
         return 1;
      } else if (var0 == 8026) {
         int var10 = Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * -1044646401];
         DynamicArray var39 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 1899405123) * 2144383146], null, -1222919230
         );
         Object var63 = GrandExchangeEvent.method8939(var39, var10, -1756181034);
         SwapSongTask.method10272(var39.field6107, var63, (byte)3);
         return 1;
      } else if (1610096293 == var0) {
         SecureRandomFuture.Interpreter_objectStackSize -= -1804659833;
         DynamicArray var9 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1544921038);
         DynamicArray var38 = VarcInt.method4531(Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1], null, -880657060);
         GrandExchangeOfferNameComparator.method9136(var9, var38, var9.method11215((byte)72), 122104396);
         return 1;
      } else if (var0 == -441052142) {
         int var8 = Interpreter_intStack[(class408.Interpreter_intStackSize -= 178416424) * -147576823];
         SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
         DynamicArray var37 = VarcInt.method4531(Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1784020338);
         DynamicArray var62 = VarcInt.method4531(Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, 101514727);
         GrandExchangeOfferNameComparator.method9136(var37, var62, var8, 122104396);
         return 1;
      } else if (554369671 == var0) {
         class408.Interpreter_intStackSize -= 708726074;
         int var3 = Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var4 = Interpreter_intStack[1 + class408.Interpreter_intStackSize * -2119837894];
         DynamicArray var5 = VarcInt.method4531(
            Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 774004816) * -630332237], null, -1321916631
         );
         SpotAnimationDefinition.method4623(var5, var3, var4, -1027917603);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lut;")
   @ObfuscatedName("ju")
   static DynamicArray method1167(Object var0, String var1) {
      if (null == var0) {
         throw new RuntimeException();
      } else {
         return (DynamicArray)var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lut;")
   @ObfuscatedName("jw")
   static DynamicArray method1168(Object var0, String var1) {
      if (null == var0) {
         throw new RuntimeException();
      } else {
         return (DynamicArray)var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;IZLcu;)V")
   @ObfuscatedName("dz")
   static void method1011(Widget var0, int var1, boolean var2, Script var3) {
      if (var0.children == null) {
         var0.children = new Widget[var1 + 1];
      }

      if (var0.children.length <= var1) {
         Widget[] var4 = new Widget[1 + var1];
         System.arraycopy(var0.children, 0, var4, 0, var0.children.length);
         var0.children = var4;
      } else {
         Widget var5 = var0.children[var1];
         if (var5 != null) {
            if (var2) {
               throw new RuntimeException("");
            }

            ClickAction.method11249(var5, var0, (short)30570);
         }
      }
   }
}
