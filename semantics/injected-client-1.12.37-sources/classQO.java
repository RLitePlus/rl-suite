import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qo")
public final class classQO {
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ab")
   final classQW field5576;
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("af")
   final classQW field5578;
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("az")
   final classQW field5575 = new classQW("day", "days");
   @ObfuscatedSignature(descriptor = "Lqw;")
   @ObfuscatedName("ae")
   final classQW field5577;
   @ObfuscatedName("ag")
   final String field5574;
   @ObfuscatedSignature(descriptor = "Lao;")
   @ObfuscatedName("ki")
   static classAO field5580;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field5579 = 30;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lqo;")
   @ObfuscatedName("ag")
   static classQO method9693() {
      return new classQO();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqo;Lry;Ljava/lang/String;ZZ)Ljava/lang/String;")
   @ObfuscatedName("ee")
   public static String method9689(classQO var0, classRY var1, String var2, boolean var3, boolean var4) {
      if (var0 == null) {
         var0.method9692(var1, var2, var3, var3);
      }

      Object var5 = new ArrayList();
      if (var2.equals("d")) {
         long var6 = -3946776555521172023L * var1.field5883;
         classQW var8 = var0.field5575;
         if (var6 > 0L) {
            var5.add(var6 + " " + var8.method9832(var6));
         }
      }

      if (var2.equals("d") || var2.equals("h")) {
         long var12 = 5030926867112396125L * var1.field5881;
         classQW var14 = var0.field5578;
         if (var12 > 0L) {
            var5.add(var12 + " " + var14.method9832(var12));
         }
      }

      long var13 = -5305962339389965695L * var1.field5880;
      classQW var15 = var0.field5577;
      if (var13 > 0L) {
         var5.add(var13 + " " + var15.method9832(var13));
      }

      if (!var3) {
         long var9 = 5393848908079016329L * var1.field5879;
         classQW var11 = var0.field5576;
         if (var9 > 0L) {
            var5.add(var9 + " " + var11.method9832(var9));
         }
      }

      if (var5.isEmpty()) {
         var5.add("0 " + var0.field5577.method9832(0L));
      }

      if (var4 && var5.size() > 2) {
         var5 = var5.subList(0, 2);
      }

      StringBuilder var16 = new StringBuilder();

      for (int var10 = 0; var10 < var5.size(); var10++) {
         if (var10 > 0) {
            var16.append(", ");
         }

         var16.append((String)var5.get(var10));
      }

      return var16.toString();
   }

   @ObfuscatedSignature(descriptor = "(Lqo;Lry;Ljava/lang/String;ZZI)Ljava/lang/String;")
   @ObfuscatedName("ft")
   public static String method9690(classQO var0, classRY var1, String var2, boolean var3, boolean var4, int var5) {
      if (var0 == null) {
         return var0.method9691(var1, var2, var3, var3, var5);
      } else {
         try {
            Object var6 = new ArrayList();
            if (var2.equals("d")) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               long var7 = -3946776555521172023L * var1.field5883;
               classQW var9 = var0.field5575;
               if (var7 > 0L) {
                  if (var5 != 329825058) {
                     throw new IllegalStateException();
                  }

                  var6.add(var7 + " " + var9.method9832(var7));
               }
            }

            label107: {
               if (!var2.equals("d")) {
                  if (var5 != 329825058) {
                     throw new IllegalStateException();
                  }

                  if (!var2.equals("h")) {
                     break label107;
                  }
               }

               long var14 = 5030926867112396125L * var1.field5881;
               classQW var16 = var0.field5578;
               if (var14 > 0L) {
                  if (var5 != 329825058) {
                     throw new IllegalStateException();
                  }

                  var6.add(var14 + " " + var16.method9832(var14));
               }
            }

            long var15 = -5305962339389965695L * var1.field5880;
            classQW var17 = var0.field5577;
            if (var15 > 0L) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               var6.add(var15 + " " + var17.method9832(var15));
            }

            if (!var3) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               long var10 = 5393848908079016329L * var1.field5879;
               classQW var12 = var0.field5576;
               if (var10 > 0L) {
                  if (var5 != 329825058) {
                     throw new IllegalStateException();
                  }

                  var6.add(var10 + " " + var12.method9832(var10));
               }
            }

            if (var6.isEmpty()) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               var6.add("0 " + var0.field5577.method9832(0L));
            }

            if (var4) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               if (var6.size() > 2) {
                  if (var5 != 329825058) {
                     throw new IllegalStateException();
                  }

                  var6 = var6.subList(0, 2);
               }
            }

            StringBuilder var18 = new StringBuilder();

            for (int var11 = 0; var11 < var6.size(); var11++) {
               if (var11 > 0) {
                  if (var5 != 329825058) {
                     throw new IllegalStateException();
                  }

                  var18.append(", ");
               }

               var18.append((String)var6.get(var11));
            }

            return var18.toString();
         } catch (RuntimeException var13) {
            throw classEG.newRunException(var13, "qo.az(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lqo;")
   @ObfuscatedName("ab")
   static classQO method9694() {
      return new classQO();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lqo;")
   @ObfuscatedName("ax")
   static classQO method9695() {
      return new classQO();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)Z")
   @ObfuscatedName("ns")
   public static boolean method9697(ClientPreferences var0) {
      return var0.field1353;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lqo;")
   @ObfuscatedName("as")
   static classQO method9696() {
      return new classQO();
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("by")
   static int method9698(int var0, Script var1, boolean var2, int var3) {
      try {
         if (5000 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 2102667627 * client.field870;
               return 1;
            }
         } else if (5001 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               client.field870 = classBB.field323[-324749371 * DynamicObject.field1679] * -1071072445;
               classBJ.field483 = classWN.method12603(classBB.field323[1 + -324749371 * DynamicObject.field1679], 1896452690);
               if (classBJ.field483 == null) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  classBJ.field483 = classZF.field7179;
               }

               client.field843 = classBB.field323[-324749371 * DynamicObject.field1679 + 2] * -1112856963;
               PacketBufferNode var22 = classEF.getPacketBufferNode(ClientPacket.SET_CHATFILTERSETTINGS, client.packetWriter.isaacCipher, (byte)-63);
               Buffer.method12971(var22.packetBuffer, client.field870 * 2102667627, (byte)-35);
               Buffer.method12971(var22.packetBuffer, classBJ.field483.field7181 * -1382377909, (byte)-57);
               Buffer.method12971(var22.packetBuffer, 960234197 * client.field843, (byte)-105);
               client.packetWriter.addNode(var22, -1301097035);
               return 1;
            }
         } else if (5002 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               String var21 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               DynamicObject.field1679 -= 240082458;
               int var30 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var35 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
               PacketBufferNode var37 = classEF.getPacketBufferNode(ClientPacket.SEND_SNAPSHOT, client.packetWriter.isaacCipher, (byte)-20);
               Buffer.method12971(var37.packetBuffer, classAU.method712(var21, (byte)79) + 2, (byte)-94);
               Buffer.method12997(var37.packetBuffer, var21, (short)14854);
               Buffer.method12971(var37.packetBuffer, var30 - 1, (byte)-59);
               Buffer.method12971(var37.packetBuffer, var35, (byte)-41);
               client.packetWriter.addNode(var37, -1301097035);
               return 1;
            }
         } else if (5003 == var0) {
            DynamicObject.field1679 -= 240082458;
            int var20 = classBB.field323[-324749371 * DynamicObject.field1679];
            int var29 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
            Message var34 = classGF.method5408(var20, var29, (byte)24);
            if (var34 != null) {
               if (var3 == -1549615250) {
                  throw new IllegalStateException();
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 707758669 * var34.field725;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var34.field724;
               Object[] var46 = classBB.field328;
               int var56 = (classBB.field338 += 1222866659) * 1375698635 - 1;
               String var66;
               if (var34.field729 != null) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  var66 = var34.field729;
               } else {
                  var66 = "";
               }

               var46[var56] = var66;
               var46 = classBB.field328;
               var56 = (classBB.field338 += 1222866659) * 1375698635 - 1;
               if (null != var34.field730) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  var66 = var34.field730;
               } else {
                  var66 = "";
               }

               var46[var56] = var66;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var34.field731 != null ? var34.field731 : "";
               int[] var48 = classBB.field323;
               var56 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var68;
               if (var34.method1473(1742811394)) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  var68 = 1;
               } else if (Message.method1486(var34, 1990608100)) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  var68 = 2;
               } else {
                  var68 = 0;
               }

               var48[var56] = var68;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (var0 == 5004) {
            int var19 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            Message var28 = classBQ.method1176(var19, 977843767);
            if (var28 != null) {
               if (var3 == -1549615250) {
                  throw new IllegalStateException();
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -601203557 * var28.field727;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var28.field724;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var28.field729 != null ? var28.field729 : "";
               Object[] var44 = classBB.field328;
               int var54 = (classBB.field338 += 1222866659) * 1375698635 - 1;
               String var64;
               if (null != var28.field730) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  var64 = var28.field730;
               } else {
                  var64 = "";
               }

               var44[var54] = var64;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = null != var28.field731 ? var28.field731 : "";
               int[] var45 = classBB.field323;
               var54 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var65;
               if (var28.method1473(259457920)) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  var65 = 1;
               } else if (Message.method1486(var28, 2082194756)) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  var65 = 2;
               } else {
                  var65 = 0;
               }

               var45[var54] = var65;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (5005 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               if (classBJ.field483 == null) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classBJ.field483.field7181 * -1382377909;
               }

               return 1;
            }
         } else if (var0 == 5008) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               String var18 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int var27 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               PacketBufferNode var33 = classCX.constructChat(var27, var18, classLU.field4232, -1, 1727418507);
               client.packetWriter.addNode(var33, -1301097035);
               return 1;
            }
         } else if (5009 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               String var17 = (String)classBB.field328[1375698635 * classBB.field338];
               String var26 = (String)classBB.field328[1 + classBB.field338 * 1375698635];
               PacketBufferNode var32 = classEF.getPacketBufferNode(ClientPacket.MESSAGE_PRIVATE, client.packetWriter.isaacCipher, (byte)1);
               var32.packetBuffer.method12973(0, -1542382992);
               int var36 = 702114061 * var32.packetBuffer.offset;
               Buffer.method12997(var32.packetBuffer, var17, (short)19070);
               Menu.method12644(var32.packetBuffer, var26, 2113111529);
               var32.packetBuffer.method13016(var32.packetBuffer.offset * 702114061 - var36, -1787616177);
               client.packetWriter.addNode(var32, -1301097035);
               return 1;
            }
         } else if (5010 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               String var16 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               DynamicObject.field1679 -= 240082458;
               int var25 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var31 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
               PacketBufferNode var7 = classCX.constructChat(var25, var16, classLU.field4232, var31, 1802458452);
               client.packetWriter.addNode(var7, -1301097035);
               return 1;
            }
         } else if (5015 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               classAAE var15 = classOE.client.vmethod255((byte)38);
               String var43;
               if (var15 != null) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  var43 = var15.method164(1582315039);
               } else {
                  var43 = "";
               }

               String var24 = var43;
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var24;
               return 1;
            }
         } else if (5016 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 960234197 * client.field843;
               return 1;
            }
         } else if (var0 == 5017) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               int var14 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNS.method7997(var14, -628869744);
               return 1;
            }
         } else if (5018 == var0) {
            int var13 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classVX.method12261(var13, (byte)2);
            return 1;
         } else if (5019 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               int var12 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classIW.method6323(var12, (byte)-79);
               return 1;
            }
         } else if (var0 == 5020) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               String var11 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               VarbitComposition.method9216(var11, (byte)41);
               return 1;
            }
         } else if (var0 == 5021) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               client.field929 = ((String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635]).toLowerCase().trim();
               return 1;
            }
         } else if (var0 == 5022) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = client.field929;
               return 1;
            }
         } else if (var0 == 5023) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               String var10 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               System.out.println(var10);
               return 1;
            }
         } else if (var0 == 5030) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var9 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var23 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
               Message var6 = classGF.method5408(var9, var23, (byte)-63);
               if (var6 != null) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 707758669 * var6.field725;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var6.field724;
                  Object[] var40 = classBB.field328;
                  int var51 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  String var61;
                  if (null != var6.field729) {
                     if (var3 == -1549615250) {
                        throw new IllegalStateException();
                     }

                     var61 = var6.field729;
                  } else {
                     var61 = "";
                  }

                  var40[var51] = var61;
                  var40 = classBB.field328;
                  var51 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  if (var6.field730 != null) {
                     if (var3 == -1549615250) {
                        throw new IllegalStateException();
                     }

                     var61 = var6.field730;
                  } else {
                     var61 = "";
                  }

                  var40[var51] = var61;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var6.field731 != null ? var6.field731 : "";
                  int[] var42 = classBB.field323;
                  var51 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  byte var63;
                  if (var6.method1473(862908491)) {
                     if (var3 == -1549615250) {
                        throw new IllegalStateException();
                     }

                     var63 = 1;
                  } else if (Message.method1486(var6, 2115887947)) {
                     if (var3 == -1549615250) {
                        throw new IllegalStateException();
                     }

                     var63 = 2;
                  } else {
                     var63 = 0;
                  }

                  var42[var51] = var63;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else if (5031 == var0) {
            if (var3 == -1549615250) {
               throw new IllegalStateException();
            } else {
               int var4 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               Message var5 = classBQ.method1176(var4, 977843767);
               if (var5 != null) {
                  if (var3 == -1549615250) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -601203557 * var5.field727;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var5.field724;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var5.field729 != null ? var5.field729 : "";
                  Object[] var10000 = classBB.field328;
                  int var10001 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  String var10002;
                  if (var5.field730 != null) {
                     if (var3 == -1549615250) {
                        throw new IllegalStateException();
                     }

                     var10002 = var5.field730;
                  } else {
                     var10002 = "";
                  }

                  var10000[var10001] = var10002;
                  var10000 = classBB.field328;
                  var10001 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  if (null != var5.field731) {
                     if (var3 == -1549615250) {
                        throw new IllegalStateException();
                     }

                     var10002 = var5.field731;
                  } else {
                     var10002 = "";
                  }

                  var10000[var10001] = var10002;
                  int[] var39 = classBB.field323;
                  var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  byte var60;
                  if (var5.method1473(61418922)) {
                     var60 = 1;
                  } else if (Message.method1486(var5, 1829689454)) {
                     if (var3 == -1549615250) {
                        throw new IllegalStateException();
                     }

                     var60 = 2;
                  } else {
                     var60 = 0;
                  }

                  var39[var10001] = var60;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "qo.by(" + 41);
      }
   }

   classQO() {
      this.field5578 = new classQW("hour", "hours");
      this.field5577 = new classQW("minute", "minutes");
      this.field5576 = new classQW("second", "seconds");
      this.field5574 = ", ";
   }

   @ObfuscatedSignature(descriptor = "(Lry;Ljava/lang/String;ZZI)Ljava/lang/String;")
   @ObfuscatedName("az")
   String method9691(classRY var1, String var2, boolean var3, boolean var4, int var5) {
      try {
         Object var6 = new ArrayList();
         if (var2.equals("d")) {
            if (var5 != 329825058) {
               throw new IllegalStateException();
            }

            long var7 = -3946776555521172023L * var1.field5883;
            classQW var9 = this.field5578;
            if (var7 > 0L) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               var6.add(var7 + " " + var9.method9835(var7));
            }
         }

         label105: {
            if (!var2.equals("d")) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               if (!var2.equals("h")) {
                  break label105;
               }
            }

            long var14 = 5030926867112396125L * var1.field5882;
            classQW var16 = this.field5576;
            if (var14 > 0L) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               var6.add(var14 + " " + var16.method9833(var14));
            }
         }

         long var15 = -5305962339389965695L * var1.field5879;
         classQW var17 = this.field5578;
         if (var15 > 0L) {
            if (var5 != 329825058) {
               throw new IllegalStateException();
            }

            var6.add(var15 + " " + var17.method9832(var15));
         }

         if (!var3) {
            if (var5 != 329825058) {
               throw new IllegalStateException();
            }

            long var10 = 5393848908079016329L * var1.field5880;
            classQW var12 = this.field5576;
            if (var10 > 0L) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               var6.add(var10 + " " + var12.method9834(var10));
            }
         }

         if (var6.isEmpty()) {
            if (var5 != 329825058) {
               throw new IllegalStateException();
            }

            var6.add("0 " + this.field5578.method9835(0L));
         }

         if (var4) {
            if (var5 != 329825058) {
               throw new IllegalStateException();
            }

            if (var6.size() > 2) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               var6 = var6.subList(0, 2);
            }
         }

         StringBuilder var18 = new StringBuilder();

         for (int var11 = 0; var11 < var6.size(); var11++) {
            if (var11 > 0) {
               if (var5 != 329825058) {
                  throw new IllegalStateException();
               }

               var18.append(", ");
            }

            var18.append((String)var6.get(var11));
         }

         return var18.toString();
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "qo.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;Ljava/lang/String;ZZ)Ljava/lang/String;")
   @ObfuscatedName("ae")
   String method9692(classRY var1, String var2, boolean var3, boolean var4) {
      Object var5 = new ArrayList();
      if (var2.equals("d")) {
         long var6 = -3946776555521172023L * var1.field5883;
         classQW var8 = this.field5578;
         if (var6 > 0L) {
            var5.add(var6 + " " + var8.method9835(var6));
         }
      }

      if (var2.equals("d") || var2.equals("h")) {
         long var12 = 5030926867112396125L * var1.field5879;
         classQW var14 = this.field5577;
         if (var12 > 0L) {
            var5.add(var12 + " " + var14.method9832(var12));
         }
      }

      long var13 = -5305962339389965695L * var1.field5882;
      classQW var15 = this.field5576;
      if (var13 > 0L) {
         var5.add(var13 + " " + var15.method9834(var13));
      }

      if (!var3) {
         long var9 = 5393848908079016329L * var1.field5881;
         classQW var11 = this.field5577;
         if (var9 > 0L) {
            var5.add(var9 + " " + var11.method9835(var9));
         }
      }

      if (var5.isEmpty()) {
         var5.add("0 " + this.field5575.method9833(0L));
      }

      if (var4 && var5.size() > 2) {
         var5 = var5.subList(0, 2);
      }

      StringBuilder var16 = new StringBuilder();

      for (int var10 = 0; var10 < var5.size(); var10++) {
         if (var10 > 0) {
            var16.append(", ");
         }

         var16.append((String)var5.get(var10));
      }

      return var16.toString();
   }
}
