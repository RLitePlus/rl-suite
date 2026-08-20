import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cx")
public class classCX {
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field1339 = 364868;
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("af")
   static final classCX field1327 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("az")
   static final classCX field1310 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ab")
   static final classCX field1313 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ae")
   static final classCX field1311 = new classCX();
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field1338 = 45;
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ax")
   static final classCX field1315 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ac")
   static final classCX field1317 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("aa")
   static final classCX field1318 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ao")
   static final classCX field1316 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("al")
   static final classCX field1320 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("aj")
   static final classCX field1321 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ar")
   static final classCX field1328 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("aq")
   static final classCX field1323 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ad")
   static final classCX field1324 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ap")
   static final classCX field1325 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("at")
   static final classCX field1332 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ai")
   static final classCX field1322 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ak")
   static final classCX field1312 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("aw")
   static final classCX field1329 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ay")
   static final classCX field1330 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("as")
   static final classCX field1326 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("au")
   static final classCX field1319 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("an")
   static final classCX field1314 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("am")
   static final classCX field1334 = new classCX();
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field1337 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field1335 = 5;
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("av")
   static final classCX field1331 = new classCX();
   @ObfuscatedSignature(descriptor = "Lcx;")
   @ObfuscatedName("ag")
   static final classCX field1333 = new classCX();
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field1336 = 99;

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Lxo;II)Ljl;")
   @ObfuscatedName("az")
   public static PacketBufferNode constructChat(int var0, String var1, classXO var2, int var3, int var4) {
      try {
         PacketBufferNode var5 = classEF.getPacketBufferNode(ClientPacket.MESSAGE_PUBLIC, client.packetWriter.isaacCipher, (byte)13);
         Buffer.method12971(var5.packetBuffer, 0, (byte)-106);
         int var6 = 702114061 * var5.packetBuffer.offset;
         Buffer.method12971(var5.packetBuffer, var0, (byte)-118);
         String var7 = var1.toLowerCase();
         int var8 = 0;
         byte[] var9 = null;
         if (var7.startsWith(classKK.field3609)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 0;
            var1 = var1.substring(classKK.field3609.length());
         } else if (var7.startsWith(classKK.field3802)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 1;
            var1 = var1.substring(classKK.field3802.length());
         } else if (var7.startsWith(classKK.field3626)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 2;
            var1 = var1.substring(classKK.field3626.length());
         } else if (var7.startsWith(classKK.field3804)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 3;
            var1 = var1.substring(classKK.field3804.length());
         } else if (var7.startsWith(classKK.field3923)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 4;
            var1 = var1.substring(classKK.field3923.length());
         } else if (var7.startsWith(classKK.field3807)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 5;
            var1 = var1.substring(classKK.field3807.length());
         } else if (var7.startsWith(classKK.field3922)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 6;
            var1 = var1.substring(classKK.field3922.length());
         } else if (var7.startsWith(classKK.field3747)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 7;
            var1 = var1.substring(classKK.field3747.length());
         } else if (var7.startsWith(classKK.field3809)) {
            var8 = 8;
            var1 = var1.substring(classKK.field3809.length());
         } else if (var7.startsWith(classKK.field3896)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 9;
            var1 = var1.substring(classKK.field3896.length());
         } else if (var7.startsWith(classKK.field3894)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 10;
            var1 = var1.substring(classKK.field3894.length());
         } else if (var7.startsWith(classKK.field3812)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 11;
            var1 = var1.substring(classKK.field3812.length());
         } else if (var7.startsWith(classKK.field3813)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var8 = 12;
            var1 = var1.substring(classKK.field3813.length());
         } else if (var7.startsWith(classKK.field3814)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            byte var11 = 48;
            byte var12 = 87;
            int var13 = classKK.field3814.length();
            int var14 = 0;
            byte[] var15 = new byte[8];

            byte[] var10;
            while (true) {
               int var16 = var14 + var13;
               if (var16 >= var7.length()) {
                  if (var4 <= 491127009) {
                     throw new IllegalStateException();
                  }

                  var10 = null;
                  break;
               }

               char var17 = var7.charAt(var16);
               if (':' == var17) {
                  if (var4 <= 491127009) {
                     throw new IllegalStateException();
                  }

                  if (0 == var14) {
                     if (var4 <= 491127009) {
                        throw new IllegalStateException();
                     }

                     var10 = null;
                  } else {
                     byte[] var22 = new byte[var14];
                     System.arraycopy(var15, 0, var22, 0, var14);
                     var10 = var22;
                  }
                  break;
               }

               if (var15.length == var14) {
                  if (var4 <= 491127009) {
                     throw new IllegalStateException();
                  }

                  var10 = null;
                  break;
               }

               label245: {
                  label273: {
                     if (var17 >= '0') {
                        if (var4 <= 491127009) {
                           throw new IllegalStateException();
                        }

                        if (var17 <= '9') {
                           if (var4 <= 491127009) {
                              throw new IllegalStateException();
                           }

                           var17 = (char)(var17 - '0');
                           break label273;
                        }
                     }

                     if (var17 < 'a') {
                        break label245;
                     }

                     if (var4 <= 491127009) {
                        throw new IllegalStateException();
                     }

                     if (var17 > 'z') {
                        break label245;
                     }

                     if (var4 <= 491127009) {
                        throw new IllegalStateException();
                     }

                     var17 = (char)(var17 - 'W');
                  }

                  var15[var14++] = (byte)var17;
                  continue;
               }

               var10 = null;
               break;
            }

            var9 = var10;
            if (null != var10) {
               if (var4 <= 491127009) {
                  throw new IllegalStateException();
               }

               var8 = var10.length + 12;
               var1 = var1.substring(classKK.field3814.length() + var10.length + 1);
            }
         }

         var7 = var1.toLowerCase();
         byte var20 = 0;
         if (var7.startsWith(classKK.field3815)) {
            var20 = 1;
            var1 = var1.substring(classKK.field3815.length());
         } else if (var7.startsWith(classKK.field3857)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var20 = 2;
            var1 = var1.substring(classKK.field3857.length());
         } else if (var7.startsWith(classKK.field3632)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var20 = 3;
            var1 = var1.substring(classKK.field3632.length());
         } else if (var7.startsWith(classKK.field3871)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var20 = 4;
            var1 = var1.substring(classKK.field3871.length());
         } else if (var7.startsWith(classKK.field3819)) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            var20 = 5;
            var1 = var1.substring(classKK.field3819.length());
         }

         Buffer.method12971(var5.packetBuffer, var8, (byte)-123);
         Buffer.method12971(var5.packetBuffer, var20, (byte)-112);
         if (var9 != null) {
            if (var4 <= 491127009) {
               throw new IllegalStateException();
            }

            for (int var21 = 0; var21 < var9.length; var21++) {
               Buffer.method12971(var5.packetBuffer, var9[var21], (byte)-4);
            }
         }

         Menu.method12644(var5.packetBuffer, var1, 1634305105);
         if (var0 == classKT.field4020.vmethod8((byte)1)) {
            Buffer.method12971(var5.packetBuffer, var3, (byte)-43);
         }

         Buffer.method13022(var5.packetBuffer, var5.packetBuffer.offset * 702114061 - var6, -942063960);
         return var5;
      } catch (RuntimeException var18) {
         throw classEG.newRunException(var18, "cx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)J")
   @ObfuscatedName("az")
   static long method2698(int var0, int var1, int var2, byte var3) {
      try {
         return var2 << 16 | var0 << 8 | var1;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "cx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIII)V")
   @ObfuscatedName("ab")
   static void method2699(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         classCE.field689 = 0;
         classES.method4075(var0, var1, var2, var3, var4, var5, -1578593603);

         for (int var7 = 0; var7 < classZH.method14003(var0.field1693, (byte)10); var7++) {
            if (var6 <= 2043869258) {
               throw new IllegalStateException();
            }

            WorldEntity var8 = (WorldEntity)var0.worldEntities.method13595(var0.field1693.method14001(var7, 1878255702));
            if (null != var8) {
               if (var6 <= 2043869258) {
                  throw new IllegalStateException();
               }

               classES.method4075(var8.field6012, var1, var2, var3, var4, var5, -271619431);
            }
         }

         boolean var24 = client.field851;
         if (var24) {
            if (var6 <= 2043869258) {
               throw new IllegalStateException();
            }

            int var25 = client.field845 * -2130951373;
            if (var25 < 0) {
               if (var6 <= 2043869258) {
                  throw new IllegalStateException();
               }
            } else {
               WorldView var9 = classQB.method9434(var25, client.field814, 287040560);
               Player var10 = var9.method3737(var25, (byte)1);
               if (null != var10) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  int var11 = classDF.method3050(client.field837, var25, 1043668321);
                  classAU.method715(var9, var10, var11, var1, var2, var3, var4, var5, (byte)9);
               }
            }
         }

         int var26 = client.field971 * 927693091;
         if (var26 < 0) {
            if (var6 <= 2043869258) {
               throw new IllegalStateException();
            }
         } else {
            WorldView var27 = classQB.method9434(var26, client.field814, -1522945937);
            Player var29 = var27.method3737(var26, (byte)1);
            if (null != var29) {
               if (var6 <= 2043869258) {
                  throw new IllegalStateException();
               }

               int var31 = classDF.method3050(client.field837, var26, 1043668321);
               classAU.method715(var27, var29, var31, var1, var2, var3, var4, var5, (byte)36);
            }
         }

         int var28 = -2114839507 * client.field984;
         Font var30 = classBB.field341;

         for (int var32 = 0; var32 < classCE.field689 * 1111851887; var32++) {
            if (var6 <= 2043869258) {
               return;
            }

            int var12 = classCE.field692[var32];
            int var13 = classCE.field703[var32];
            int var14 = classCE.field695[var32];
            int var15 = classCE.field694[var32];
            boolean var16 = true;

            while (var16) {
               var16 = false;

               for (int var17 = 0; var17 < var32; var17++) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  if (var13 + 2 > classCE.field703[var17] - classCE.field694[var17]) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     if (var13 - var15 < 2 + classCE.field703[var17]) {
                        if (var6 <= 2043869258) {
                           throw new IllegalStateException();
                        }

                        if (var12 - var14 < classCE.field692[var17] + classCE.field695[var17]) {
                           if (var6 <= 2043869258) {
                              throw new IllegalStateException();
                           }

                           if (var12 + var14 > classCE.field692[var17] - classCE.field695[var17]) {
                              if (var6 <= 2043869258) {
                                 throw new IllegalStateException();
                              }

                              if (classCE.field703[var17] - classCE.field694[var17] < var13) {
                                 if (var6 <= 2043869258) {
                                    throw new IllegalStateException();
                                 }

                                 var13 = classCE.field703[var17] - classCE.field694[var17];
                                 var16 = true;
                              }
                           }
                        }
                     }
                  }
               }
            }

            classCE.field690 = classCE.field692[var32] * 562042963;
            classCE.field700 = (classCE.field703[var32] = var13) * 854419263;
            String var33 = classCE.field699[var32];
            if (0 == var28) {
               if (var6 <= 2043869258) {
                  throw new IllegalStateException();
               }

               int var18 = 16776960;
               if (classCE.field693[var32] < 6) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  var18 = classCE.field704[classCE.field693[var32]];
               }

               if (classCE.field693[var32] == 6) {
                  if (var6 <= 2043869258) {
                     return;
                  }

                  int var10000;
                  if (var5 % 20 < 10) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var10000 = 16711680;
                  } else {
                     var10000 = 16776960;
                  }

                  var18 = var10000;
               }

               if (classCE.field693[var32] == 7) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  char var40;
                  if (var5 % 20 < 10) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var40 = 255;
                  } else {
                     var40 = '\uffff';
                  }

                  var18 = var40;
               }

               if (classCE.field693[var32] == 8) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  int var41;
                  if (var5 % 20 < 10) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var41 = 45056;
                  } else {
                     var41 = 8454016;
                  }

                  var18 = var41;
               }

               if (classCE.field693[var32] == 9) {
                  if (var6 <= 2043869258) {
                     return;
                  }

                  int var19 = 150 - classCE.field696[var32];
                  if (var19 < 50) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var18 = var19 * 1280 + 16711680;
                  } else if (var19 < 100) {
                     var18 = 16776960 - (var19 - 50) * 327680;
                  } else if (var19 < 150) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var18 = 5 * (var19 - 100) + 65280;
                  }
               }

               if (10 == classCE.field693[var32]) {
                  int var34 = 150 - classCE.field696[var32];
                  if (var34 < 50) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var18 = 5 * var34 + 16711680;
                  } else if (var34 < 100) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var18 = 16711935 - (var34 - 50) * 327680;
                  } else if (var34 < 150) {
                     if (var6 <= 2043869258) {
                        return;
                     }

                     var18 = 255 + 327680 * (var34 - 100) - (var34 - 100) * 5;
                  }
               }

               if (11 == classCE.field693[var32]) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  int var35 = 150 - classCE.field696[var32];
                  if (var35 < 50) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var18 = 16777215 - 327685 * var35;
                  } else if (var35 < 100) {
                     var18 = 65280 + 327685 * (var35 - 50);
                  } else if (var35 < 150) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var18 = 16777215 - (var35 - 100) * 327680;
                  }
               }

               if (12 == classCE.field693[var32]) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  if (null == classCE.field698[var32]) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     int var36 = var33.length();
                     classCE.field698[var32] = new int[var36];

                     for (int var20 = 0; var20 < var36; var20++) {
                        if (var6 <= 2043869258) {
                           throw new IllegalStateException();
                        }

                        int var21 = (int)(64.0F * ((float)var20 / var36));
                        int var22 = var21 << 10 | 896 | 64;
                        classCE.field698[var32][var20] = classGK.field2617[var22];
                     }
                  }
               }

               if (classCE.field697[var32] == 0) {
                  var30.method88(var33, classCE.field690 * 1269689307 + var1, -690353985 * classCE.field700 + var2, var18, 0, classCE.field698[var32]);
               }

               if (classCE.field697[var32] == 1) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  var30.method76(var33, var1 + 1269689307 * classCE.field690, var2 + classCE.field700 * -690353985, var18, 0, var5, classCE.field698[var32]);
               }

               if (2 == classCE.field697[var32]) {
                  if (var6 <= 2043869258) {
                     return;
                  }

                  AbstractFont.method80(
                     var30, var33, 1269689307 * classCE.field690 + var1, classCE.field700 * -690353985 + var2, var18, 0, var5, classCE.field698[var32]
                  );
               }

               if (classCE.field697[var32] == 3) {
                  var30.method85(
                     var33,
                     1269689307 * classCE.field690 + var1,
                     var2 + -690353985 * classCE.field700,
                     var18,
                     0,
                     var5,
                     150 - classCE.field696[var32],
                     classCE.field698[var32]
                  );
               }

               if (4 == classCE.field697[var32]) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  int var37 = (150 - classCE.field696[var32]) * (var30.method36(var33) + 100) / 150;
                  classYW.method13674(var1 + classCE.field690 * 1269689307 - 50, var2, var1 + classCE.field690 * 1269689307 + 50, var4 + var2);
                  var30.method92(
                     var33, classCE.field690 * 1269689307 + var1 + 50 - var37, var2 + -690353985 * classCE.field700, var18, 0, classCE.field698[var32]
                  );
                  classYW.method13671(var1, var2, var1 + var3, var2 + var4);
               }

               if (classCE.field697[var32] == 5) {
                  if (var6 <= 2043869258) {
                     throw new IllegalStateException();
                  }

                  int var38 = 150 - classCE.field696[var32];
                  int var39 = 0;
                  if (var38 < 25) {
                     if (var6 <= 2043869258) {
                        throw new IllegalStateException();
                     }

                     var39 = var38 - 25;
                  } else if (var38 > 125) {
                     var39 = var38 - 125;
                  }

                  classYW.method13674(var1, var2 + classCE.field700 * -690353985 - var30.field8 - 1, var3 + var1, 5 + classCE.field700 * -690353985 + var2);
                  var30.method88(var33, classCE.field690 * 1269689307 + var1, var2 + -690353985 * classCE.field700 + var39, var18, 0, classCE.field698[var32]);
                  classYW.method13671(var1, var2, var1 + var3, var4 + var2);
               }
            } else {
               var30.method65(var33, var1 + 1269689307 * classCE.field690, -690353985 * classCE.field700 + var2, 16776960, 0);
            }
         }
      } catch (RuntimeException var23) {
         throw classEG.newRunException(var23, "cx.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("cu")
   static int method2700(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (6809 == var0) {
            if (var3 == 6) {
               throw new IllegalStateException();
            } else {
               int var4 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classOM var5 = classMU.method7729(var4, 1963750688);
               Object[] var10000 = classBB.field328;
               int var10001 = (classBB.field338 += 1222866659) * 1375698635 - 1;
               String var10002;
               if (null != var5) {
                  if (var3 == 6) {
                     throw new IllegalStateException();
                  }

                  var10002 = var5.method8590((short)-18064);
               } else {
                  var10002 = "";
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "cx.cu(" + 41);
      }
   }

   classCX() {
   }

   @ObfuscatedSignature(descriptor = "(D)D")
   @ObfuscatedName("az")
   static double method2695(double var0) {
      try {
         return Math.exp(var0 * -var0 / 2.0) / Math.sqrt(Math.PI * 2);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lye;")
   @ObfuscatedName("ag")
   public static classYE[] method2696(int var0) {
      try {
         return new classYE[]{classYE.field6973, classYE.field6974, classYE.field6972};
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "cx.ag(" + ')');
      }
   }
}
