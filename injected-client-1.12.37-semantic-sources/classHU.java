import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hu")
public final class classHU {
   @ObfuscatedName("bt")
   static int field2891;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2890 = 4096;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field2892 = 107;
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final String field2894 = "jagex.disableBouncyCastle";
   @ObfuscatedName("af")
   final int[] field2889;
   @ToRemove(unused = "true")
   @ObfuscatedName("ca")
   static final int field2893 = 149;

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   final int method6113(int var1, int var2) {
      return this.field2889[var1 + var2 * 64];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   final int method6114(int var1, int var2) {
      return this.field2889[var1 + var2 * 64];
   }

   classHU(int[] var1) {
      this.field2889 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("az")
   final int method6115(int var1, int var2, byte var3) {
      try {
         return this.field2889[var1 + var2 * 64];
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "hu.az(" + 41);
      }
   }

   classHU() {
      this.field2889 = new int[4096];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   final int method6116(int var1, int var2) {
      return this.field2889[var1 + var2 * 400616896];
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIII)V")
   @ObfuscatedName("em")
   static void method6119(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (18 == var2) {
            if (var8 != 492469016) {
               throw new IllegalStateException();
            }

            client.field957 = -727473855 * var4;
            client.field958 = var5 * 527203475;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = -1254957895 * var0;
            client.field834 = -877699493 * var1;
            int var9 = var3 & 65535;
            int var10 = var3 >> 16;
            classJL var11 = classEF.method3849(classJS.OPOBJ1_V2, client.field795.field1535, (byte)-36);
            var11.field3343.method13153(var10, (byte)38);
            classXY.method13186(var11.field3343, var0 + var6, (byte)16);
            var11.field3343.method13188(var1 + var7, (short)-5004);
            PacketBuffer var10000 = var11.field3343;
            byte var10001;
            if (classFA.method4540(client.field931, 82, 230349540)) {
               if (var8 != 492469016) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var10000.method13156(var10001, (byte)-31);
            var11.field3343.method12973(var9, -1542382992);
            client.field795.method3367(var11, -1301097035);
         }

         if (var2 == 19) {
            if (var8 != 492469016) {
               throw new IllegalStateException();
            }

            client.field957 = -727473855 * var4;
            client.field958 = 527203475 * var5;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = -1254957895 * var0;
            client.field834 = -877699493 * var1;
            int var13 = var3 & 65535;
            int var17 = var3 >> 16;
            classJL var21 = classEF.method3849(classJS.OPOBJ2_V2, client.field795.field1535, (byte)-7);
            var21.field3343.method13153(var17, (byte)34);
            var21.field3343.method12973(var7 + var1, -1542382992);
            classXY.method13186(var21.field3343, var13, (byte)16);
            classXY.method13186(var21.field3343, var0 + var6, (byte)16);
            PacketBuffer var25 = var21.field3343;
            byte var29;
            if (classFA.method4540(client.field931, 82, 1240789726)) {
               if (var8 != 492469016) {
                  return;
               }

               var29 = 1;
            } else {
               var29 = 0;
            }

            var25.method13151(var29, -1910538783);
            client.field795.method3367(var21, -1301097035);
         }

         if (20 == var2) {
            if (var8 != 492469016) {
               throw new IllegalStateException();
            }

            client.field957 = -727473855 * var4;
            client.field958 = 527203475 * var5;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = -1254957895 * var0;
            client.field834 = -877699493 * var1;
            int var14 = var3 & 65535;
            int var18 = var3 >> 16;
            classJL var22 = classEF.method3849(classJS.OPOBJ3_V2, client.field795.field1535, (byte)35);
            classXY.method13186(var22.field3343, var0 + var6, (byte)16);
            PacketBuffer var26 = var22.field3343;
            byte var30;
            if (classFA.method4540(client.field931, 82, 1101700517)) {
               if (var8 != 492469016) {
                  return;
               }

               var30 = 1;
            } else {
               var30 = 0;
            }

            var26.method13153(var30, (byte)-28);
            classXY.method12971(var22.field3343, var18, (byte)-110);
            classXY.method13180(var22.field3343, var14, (byte)-71);
            var22.field3343.method12973(var1 + var7, -1542382992);
            client.field795.method3367(var22, -1301097035);
         }

         if (var2 == 21) {
            client.field957 = var4 * -727473855;
            client.field958 = var5 * 527203475;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = -1254957895 * var0;
            client.field834 = -877699493 * var1;
            int var15 = var3 & 65535;
            int var19 = var3 >> 16;
            classJL var23 = classEF.method3849(classJS.OPOBJ4_V2, client.field795.field1535, (byte)-60);
            var23.field3343.method13153(var19, (byte)-10);
            PacketBuffer var27 = var23.field3343;
            byte var31;
            if (classFA.method4540(client.field931, 82, 901003751)) {
               if (var8 != 492469016) {
                  throw new IllegalStateException();
               }

               var31 = 1;
            } else {
               var31 = 0;
            }

            var27.method13156(var31, (byte)7);
            var23.field3343.method13188(var1 + var7, (short)-1309);
            classXY.method13186(var23.field3343, var15, (byte)16);
            classXY.method13180(var23.field3343, var6 + var0, (byte)-4);
            client.field795.method3367(var23, -1301097035);
         }

         if (22 == var2) {
            if (var8 != 492469016) {
               throw new IllegalStateException();
            }

            client.field957 = -727473855 * var4;
            client.field958 = var5 * 527203475;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = -1254957895 * var0;
            client.field834 = -877699493 * var1;
            int var16 = var3 & 65535;
            int var20 = var3 >> 16;
            classJL var24 = classEF.method3849(classJS.OPOBJ5_V2, client.field795.field1535, (byte)-58);
            var24.field3343.method13188(var16, (short)-32414);
            classXY.method12971(var24.field3343, var20, (byte)-73);
            classXY.method13180(var24.field3343, var6 + var0, (byte)-33);
            PacketBuffer var28 = var24.field3343;
            byte var32;
            if (classFA.method4540(client.field931, 82, 1261564632)) {
               if (var8 != 492469016) {
                  throw new IllegalStateException();
               }

               var32 = 1;
            } else {
               var32 = 0;
            }

            var28.method13156(var32, (byte)33);
            classXY.method13186(var24.field3343, var1 + var7, (byte)16);
            client.field795.method3367(var24, -1301097035);
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "hu.em(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("bo")
   static int method6118(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 == 3600) {
            if (0 == 215887637 * classQQ.field5597.field594) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -2;
            } else if (215887637 * classQQ.field5597.field594 == 1) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classQQ.field5597.field593.method10191(-1975366404);
            }

            return 1;
         } else if (3601 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var50 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (classQQ.field5597.method1277(-1995215397)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var50 >= 0) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var50 < classQQ.field5597.field593.method10191(-265945226)) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        Friend var53 = (Friend)UserList.method10231(classQQ.field5597.field593, var50, 1650310413);
                        classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = User.method10170(var53, (byte)1);
                        classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = User.method10171(var53, (byte)91);
                        return 1;
                     }
                  }
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               return 1;
            }
         } else if (3602 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var49 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (classQQ.field5597.method1277(-38469855)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var49 >= 0) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var49 < classQQ.field5597.field593.method10191(-1705074353)) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((Buddy)UserList.method10231(
                                 classQQ.field5597.field593, var49, 1759341845
                              ))
                              .field5669
                           * -760305529;
                        return 1;
                     }
                  }
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3603 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var48 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (classQQ.field5597.method1277(-1945240379)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var48 >= 0) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var48 < classQQ.field5597.field593.method10191(-1811344605)) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((Buddy)UserList.method10231(
                                 classQQ.field5597.field593, var48, 1710017987
                              ))
                              .field5671
                           * 1234122453;
                        return 1;
                     }
                  }
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (3604 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               String var47 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int var52 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classCR.method2573(var47, var52, -2124018804);
               return 1;
            }
         } else if (3605 == var0) {
            String var46 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            classQQ.field5597.method1303(var46, -850092971);
            return 1;
         } else if (var0 == 3606) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               String var45 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classQQ.field5597.method1325(var45, (byte)38);
               return 1;
            }
         } else if (3607 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               String var44 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classQQ.field5597.method1320(var44, -169290065);
               return 1;
            }
         } else if (3608 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               String var43 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               boolean var51 = true;
               classQQ.field5597.method1331(var43, var51, 1787057995);
               return 1;
            }
         } else if (3609 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               String var41 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               var41 = classKW.method6577(var41, -391222627);
               int[] var74 = classBB.field323;
               int var77 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var80;
               if (classQQ.field5597.method1296(new classAAE(var41, InterfaceParent.field5279), false, 728254179)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var80 = 1;
               } else {
                  var80 = 0;
               }

               var74[var77] = var80;
               return 1;
            }
         } else if (3611 == var0) {
            if (classIB.field2935 != null) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classIB.field2935.field5860;
            } else {
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
            }

            return 1;
         } else if (3612 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               if (null != classIB.field2935) {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classIB.field2935.method10191(-1805895116);
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else if (3613 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var40 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (classIB.field2935 != null && var40 < classIB.field2935.method10191(-2018528307)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = UserList.method10231(classIB.field2935, var40, 1740076631)
                     .method10166((byte)16)
                     .method164(925124102);
               } else {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               }

               return 1;
            }
         } else if (3614 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var39 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (null != classIB.field2935 && var39 < classIB.field2935.method10191(-1010776819)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((Buddy)UserList.method10231(classIB.field2935, var39, 1814276808))
                     .method9970(1888854034);
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else if (3615 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var38 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (null != classIB.field2935 && var38 < classIB.field2935.method10191(-1796962933)) {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((Buddy)UserList.method10231(classIB.field2935, var38, 1388187095))
                        .field5671
                     * 1234122453;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else if (3616 == var0) {
            int[] var73 = classBB.field323;
            int var76 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
            byte var79;
            if (null != classIB.field2935) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var79 = classIB.field2935.field5865;
            } else {
               var79 = 0;
            }

            var73[var76] = var79;
            return 1;
         } else if (var0 == 3617) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               String var37 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classCV.method2685(var37, (byte)37);
               return 1;
            }
         } else if (3618 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int[] var72 = classBB.field323;
               int var75 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               int var78;
               if (classIB.field2935 != null) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var78 = classIB.field2935.field5866 * 1979783621;
               } else {
                  var78 = 0;
               }

               var72[var75] = var78;
               return 1;
            }
         } else if (3619 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               String var36 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classIJ.method6216(var36, -1142457594);
               return 1;
            }
         } else if (3620 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               classIO.method6231((byte)-59);
               return 1;
            }
         } else if (var0 == 3621) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               if (!classQQ.field5597.method1277(-1462513166)) {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classQQ.field5597.field591.method10191(-396855415);
               }

               return 1;
            }
         } else if (var0 == 3622) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var35 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (classQQ.field5597.method1277(-1335537384)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var35 >= 0) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var35 < classQQ.field5597.field591.method10191(-823470546)) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        Ignored var5 = (Ignored)UserList.method10231(classQQ.field5597.field591, var35, 1297124491);
                        classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = User.method10170(var5, (byte)1);
                        classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = User.method10171(var5, (byte)40);
                        return 1;
                     }
                  }
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
               return 1;
            }
         } else if (var0 == 3623) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               String var33 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               var33 = classKW.method6577(var33, -1592022605);
               int[] var71 = classBB.field323;
               int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var10002;
               if (classQQ.field5597.method1299(new classAAE(var33, InterfaceParent.field5279), -1181618808)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var71[var10001] = var10002;
               return 1;
            }
         } else if (3624 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var32 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               if (null != classIB.field2935) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var32 < classIB.field2935.method10191(-1481923975)) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (UserList.method10231(classIB.field2935, var32, 2092533098).method10166((byte)16).equals(classOE.field4843.vmethod255((byte)101))) {
                        classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                        return 1;
                     }
                  }
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3625) {
            if (null != classIB.field2935) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (classIB.field2935.field5864 != null) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classIB.field2935.field5864;
                  return 1;
               }
            }

            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = "";
            return 1;
         } else if (3626 == var0) {
            int var31 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            if (classIB.field2935 != null && var31 < classIB.field2935.method10191(-647202361)) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (ClanMate.method10272((ClanMate)UserList.method10231(classIB.field2935, var31, 2132647428), 1742624293)) {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                  return 1;
               }
            }

            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (3627 != var0) {
            if (var0 == 3628) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  UserList.method10256(classQQ.field5597.field593, -2131694580);
                  return 1;
               }
            } else if (3629 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var70;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var70 = true;
                  } else {
                     var70 = false;
                  }

                  boolean var30 = var70;
                  classQQ.field5597.field593.method10262(new classYC(var30), 1419690830);
                  return 1;
               }
            } else if (3630 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var69;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var69 = true;
                  } else {
                     var69 = false;
                  }

                  boolean var29 = var69;
                  classQQ.field5597.field593.method10262(new classYS(var29), 2098901630);
                  return 1;
               }
            } else if (3631 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var68;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var68 = true;
                  } else {
                     var68 = false;
                  }

                  boolean var28 = var68;
                  classQQ.field5597.field593.method10262(new classEV(var28), 997350778);
                  return 1;
               }
            } else if (var0 == 3632) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var67;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var67 = true;
                  } else {
                     var67 = false;
                  }

                  boolean var27 = var67;
                  classQQ.field5597.field593.method10262(new classEA(var27), -1030307237);
                  return 1;
               }
            } else if (3633 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var66;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var66 = true;
                  } else {
                     var66 = false;
                  }

                  boolean var26 = var66;
                  classQQ.field5597.field593.method10262(new classED(var26), 1203228726);
                  return 1;
               }
            } else if (3634 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var65;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var65 = true;
                  } else {
                     var65 = false;
                  }

                  boolean var25 = var65;
                  classQQ.field5597.field593.method10262(new classES(var25), 673065149);
                  return 1;
               }
            } else if (var0 == 3635) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var64;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var64 = true;
                  } else {
                     var64 = false;
                  }

                  boolean var24 = var64;
                  classQQ.field5597.field593.method10262(new classEK(var24), 1731973139);
                  return 1;
               }
            } else if (3636 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var63;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var63 = true;
                  } else {
                     var63 = false;
                  }

                  boolean var23 = var63;
                  classQQ.field5597.field593.method10262(new classEJ(var23), 1678940149);
                  return 1;
               }
            } else if (3637 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var62;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var62 = true;
                  } else {
                     var62 = false;
                  }

                  boolean var22 = var62;
                  classQQ.field5597.field593.method10262(new classEL(var22), -376068010);
                  return 1;
               }
            } else if (3638 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var21 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
                  classQQ.field5597.field593.method10262(new classEH(var21), -89086832);
                  return 1;
               }
            } else if (3639 == var0) {
               classQQ.field5597.field593.method10234((byte)11);
               return 1;
            } else if (3640 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  UserList.method10256(classQQ.field5597.field591, -2131694580);
                  return 1;
               }
            } else if (3641 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var20 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
                  classQQ.field5597.field591.method10262(new classYC(var20), -723922616);
                  return 1;
               }
            } else if (3642 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var61;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var61 = true;
                  } else {
                     var61 = false;
                  }

                  boolean var19 = var61;
                  classQQ.field5597.field591.method10262(new classYS(var19), -1825666007);
                  return 1;
               }
            } else if (3643 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  classQQ.field5597.field591.method10234((byte)42);
                  return 1;
               }
            } else if (var0 == 3644) {
               if (classIB.field2935 != null) {
                  UserList.method10256(classIB.field2935, -2131694580);
               }

               return 1;
            } else if (var0 == 3645) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var18 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
                  if (null != classIB.field2935) {
                     classIB.field2935.method10262(new classYC(var18), -788685941);
                  }

                  return 1;
               }
            } else if (3646 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var60;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var60 = true;
                  } else {
                     var60 = false;
                  }

                  boolean var17 = var60;
                  if (null != classIB.field2935) {
                     classIB.field2935.method10262(new classYS(var17), -431056583);
                  }

                  return 1;
               }
            } else if (3647 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var16 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
                  if (null != classIB.field2935) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classIB.field2935.method10262(new classEV(var16), 1741176929);
                  }

                  return 1;
               }
            } else if (3648 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var15 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
                  if (null != classIB.field2935) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classIB.field2935.method10262(new classEA(var15), -1058933788);
                  }

                  return 1;
               }
            } else if (var0 == 3649) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var59;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var59 = true;
                  } else {
                     var59 = false;
                  }

                  boolean var14 = var59;
                  if (classIB.field2935 != null) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classIB.field2935.method10262(new classED(var14), -1230854395);
                  }

                  return 1;
               }
            } else if (3650 == var0) {
               boolean var58;
               if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var58 = true;
               } else {
                  var58 = false;
               }

               boolean var13 = var58;
               if (classIB.field2935 != null) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  classIB.field2935.method10262(new classES(var13), 1303752651);
               }

               return 1;
            } else if (var0 == 3651) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var57;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var57 = true;
                  } else {
                     var57 = false;
                  }

                  boolean var12 = var57;
                  if (classIB.field2935 != null) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classIB.field2935.method10262(new classEK(var12), 1901866740);
                  }

                  return 1;
               }
            } else if (3652 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var56;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var56 = true;
                  } else {
                     var56 = false;
                  }

                  boolean var11 = var56;
                  if (null != classIB.field2935) {
                     classIB.field2935.method10262(new classEJ(var11), 103868125);
                  }

                  return 1;
               }
            } else if (var0 == 3653) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var55;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var55 = true;
                  } else {
                     var55 = false;
                  }

                  boolean var10 = var55;
                  if (null != classIB.field2935) {
                     classIB.field2935.method10262(new classEL(var10), 235917122);
                  }

                  return 1;
               }
            } else if (3654 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var9 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
                  if (classIB.field2935 != null) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classIB.field2935.method10262(new classEH(var9), -1534611160);
                  }

                  return 1;
               }
            } else if (3655 == var0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  if (classIB.field2935 != null) {
                     classIB.field2935.method10234((byte)36);
                  }

                  return 1;
               }
            } else if (var0 == 3656) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  boolean var54;
                  if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var54 = true;
                  } else {
                     var54 = false;
                  }

                  boolean var8 = var54;
                  classQQ.field5597.field593.method10262(new classEG(var8), 1203362536);
                  return 1;
               }
            } else if (var0 == 3657) {
               boolean var10000;
               if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var7 = var10000;
               if (null != classIB.field2935) {
                  classIB.field2935.method10262(new classEG(var7), 1792264609);
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            int var4 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            if (classIB.field2935 != null) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (var4 < classIB.field2935.method10191(-1948161542)) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (((ClanMate)UserList.method10231(classIB.field2935, var4, 1433024429)).method10282(-1714319706)) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
                     return 1;
                  }
               }
            }

            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "hu.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("az")
   public static int method6117(int var0, int var1, int var2) {
      try {
         int var3 = 1;

         while (var1 > 1) {
            if (var2 != -474194162) {
               throw new IllegalStateException();
            }

            if ((var1 & 1) != 0) {
               if (var2 != -474194162) {
                  throw new IllegalStateException();
               }

               var3 *= var0;
            }

            var0 *= var0;
            var1 >>= 1;
         }

         if (var1 != 1) {
            return var3;
         } else if (var2 != -474194162) {
            throw new IllegalStateException();
         } else {
            return var3 * var0;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "hu.az(" + 41);
      }
   }
}
