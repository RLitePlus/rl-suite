import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lb")
public class class299 implements WorldMapSection {
   @ToRemove(unused = "true")
   @ObfuscatedName("eh")
   static final int field3624 = 2;
   @ObfuscatedName("at")
   int field3618;
   @ObfuscatedName("ak")
   int field3615;
   @ObfuscatedName("an")
   int field3616;
   @ObfuscatedName("ae")
   int field3612;
   @ObfuscatedName("aj")
   int field3614;
   @ObfuscatedName("av")
   int field3619;
   @ObfuscatedName("aw")
   int field3620;
   @ObfuscatedName("ap")
   int field3617;
   @ObfuscatedName("ay")
   int field3621;
   @ToRemove(unused = "true")
   @ObfuscatedName("eg")
   static final int field3623 = 31;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   public static final int field3622 = 50;
   @ObfuscatedName("ag")
   int field3613;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfp;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ts")
   public static int method6980(UserComparator6 var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method4043(var1, var1);
      }

      return var0.compareBuddy((Buddy)var1, (Buddy)var2, -664968264);
   }

   @ObfuscatedSignature(descriptor = "(I)[Lxg;")
   @ObfuscatedName("ae")
   public static FillMode[] FillMode_values(int var0) {
      try {
         return new FillMode[]{FillMode.field6493, FillMode.field6494, FillMode.SOLID};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "lb.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;I)V")
   @ObfuscatedName("av")
   @Override
   public void expandBounds(WorldMapArea var1, int var2) {
      try {
         if (var1.regionLowX * 972064699 > -72774507 * this.field3612) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionLowX = this.field3612 * 1943449583;
         }

         if (var1.regionHighX * 2009549851 < -72774507 * this.field3612) {
            if (var2 >= -1420536974) {
               return;
            }

            var1.regionHighX = this.field3612 * -1554533105;
         }

         if (-262946729 * var1.regionLowY > this.field3614 * 1814140371) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionLowY = this.field3614 * -37177115;
         }

         if (-234334363 * var1.regionHighY < 1814140371 * this.field3614) {
            if (var2 >= -1420536974) {
               throw new IllegalStateException();
            }

            var1.regionHighY = -1458278185 * this.field3614;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lb.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ad")
   @Override
   public boolean vmethod266(int var1, int var2, int var3) {
      return var1 >= this.field3619 * 489984215 && var1 < this.field3618 * 345213555 + 489984215 * this.field3619
         ? var2 >= (468239605 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3)
            && var2 <= (468239605 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3) + 7
            && var3 >= (2033081509 * this.field3620 << 3) + (-1850076807 * this.field3616 << 6)
            && var3 <= (-1850076807 * this.field3616 << 6) + (this.field3620 * 2033081509 << 3) + 7
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean containsPosition(int var1, int var2, int var3) {
      try {
         if (var1 >= (-72774507 * this.field3612 << 6) + (this.field3617 * -380903341 << 3)) {
            if (var3 >= -1246167406) {
               throw new IllegalStateException();
            }

            if (var1 <= 7 + (this.field3612 * -72774507 << 6) + (-380903341 * this.field3617 << 3)) {
               if (var3 >= -1246167406) {
                  throw new IllegalStateException();
               }

               if (var2 >= (1814140371 * this.field3614 << 6) + (this.field3621 * -1730699417 << 3)) {
                  if (var3 >= -1246167406) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= 7 + (1814140371 * this.field3614 << 6) + (this.field3621 * -1730699417 << 3)) {
                     if (var3 >= -1246167406) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lb.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)[I")
   @ObfuscatedName("an")
   @Override
   public int[] getBorderTileLengths(int var1, int var2, int var3, byte var4) {
      try {
         return !this.containsCoord(var1, var2, var3, (byte)-83)
            ? null
            : new int[]{
               this.field3612 * -362601152 - -97436352 * this.field3613 + var2 + (1247740568 * this.field3617 - 1603479032 * this.field3615),
               this.field3621 * -960693448 - -915217112 * this.field3620 + var3 + (140866752 * this.field3614 - this.field3616 * 1854168640)
            };
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lb.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("ab")
   @Override
   public int[] vmethod276(int var1, int var2, int var3) {
      return !this.containsCoord(var1, var2, var3, (byte)-94)
         ? null
         : new int[]{
            this.field3612 * -362601152 - -97436352 * this.field3613 + var2 + (1247740568 * this.field3617 - 1603479032 * this.field3615),
            this.field3621 * -960693448 - -915217112 * this.field3620 + var3 + (140866752 * this.field3614 - this.field3616 * 1854168640)
         };
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aj")
   @Override
   public void read(Buffer var1, int var2) {
      try {
         this.field3619 = var1.readUnsignedByte(1593404530) * -470195481;
         this.field3618 = var1.readUnsignedByte(-232777571) * 1320233659;
         this.field3613 = Buffer.method12008(var1, (byte)5) * 1480509277;
         this.field3615 = var1.readUnsignedByte(902393518) * 859507519;
         this.field3616 = Buffer.method12008(var1, (byte)5) * 1352698057;
         this.field3620 = var1.readUnsignedByte(1637741043) * 1879190317;
         this.field3612 = Buffer.method12008(var1, (byte)5) * 1472388797;
         this.field3617 = var1.readUnsignedByte(438082665) * 191718363;
         this.field3614 = Buffer.method12008(var1, (byte)5) * -1442543013;
         this.field3621 = var1.readUnsignedByte(1132515322) * -1430254505;
         this.method6981((byte)-85);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lb.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   void method6981(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lb.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;)[I")
   @ObfuscatedName("gd")
   public static int[] method6983(NPC var0) {
      return var0.npcOverheadIcons != null ? var0.npcOverheadIcons.method12253(-1861431668) : var0.definition.method4707(-1300032824);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   static void performLoginRequest(int var0) {
      try {
         Login.Login_username = Login.Login_username.trim();
         client.method2115(-1);
         if (Login.Login_username.isEmpty()) {
            if (var0 == 169419667) {
               throw new IllegalStateException();
            } else {
               class525.setLoginResponseString(Strings.field5117, Strings.field4965, Strings.field5129, (byte)1);
            }
         } else {
            long var2;
            try {
               URL var4 = new URL(EnumComposition.method4474("services", false, 264901849) + "m=accountappeal/login.ws");
               URLConnection var5 = var4.openConnection();
               var5.setRequestProperty("connection", "close");
               var5.setDoInput(true);
               var5.setDoOutput(true);
               var5.setConnectTimeout(5000);
               OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
               var6.write("data1=req");
               var6.flush();
               InputStream var7 = var5.getInputStream();
               Buffer var8 = new Buffer(new byte[1000]);

               while (true) {
                  int var9 = var7.read(var8.array, 2108391709 * var8.offset, 1000 - var8.offset * 2108391709);
                  if (-1 == var9) {
                     if (var0 == 169419667) {
                        throw new IllegalStateException();
                     }

                     var8.offset = 0;
                     long var30 = Buffer.method12018(var8, -1982363254);
                     var2 = var30;
                     break;
                  }

                  var8.offset += var9 * 1741769013;
                  if (var8.offset * 2108391709 >= 1000) {
                     if (var0 == 169419667) {
                        return;
                     }

                     var2 = 0L;
                     break;
                  }
               }
            } catch (Exception var25) {
               var2 = 0L;
            }

            byte var1;
            if (0L == var2) {
               if (var0 == 169419667) {
                  throw new IllegalStateException();
               }

               var1 = 5;
            } else {
               String var28 = Login.Login_username;
               Random var29 = new Random();
               Buffer var31 = new Buffer(128);
               Buffer var10 = new Buffer(128);
               int[] var11 = new int[]{var29.nextInt(), var29.nextInt(), (int)(var2 >> 32), (int)var2};
               var31.writeByte(10, (short)-20569);

               for (int var12 = 0; var12 < 4; var12++) {
                  var31.writeInt(var29.nextInt(), 983058133);
               }

               var31.writeInt(var11[0], 55791152);
               var31.writeInt(var11[1], 891156182);
               var31.writeLongMedium(var2);
               var31.writeLongMedium(0L);

               for (int var32 = 0; var32 < 4; var32++) {
                  var31.writeInt(var29.nextInt(), 819150853);
               }

               var31.encryptRsa(classBC.field111, classBC.field112, (byte)50);
               var10.writeByte(10, (short)-16589);

               for (int var33 = 0; var33 < 3; var33++) {
                  if (var0 == 169419667) {
                     throw new IllegalStateException();
                  }

                  var10.writeInt(var29.nextInt(), 445789950);
               }

               var10.writeLongMedium(var29.nextLong());
               var10.method11944(var29.nextLong());
               if (client.randomDatData != null) {
                  if (var0 == 169419667) {
                     throw new IllegalStateException();
                  }

                  Buffer.method11967(var10, client.randomDatData, 0, client.randomDatData.length, -1187258379);
               } else {
                  byte[] var13 = new byte[24];

                  try {
                     JagexCache.JagexCache_randomDat.seek(0L);
                     JagexCache.JagexCache_randomDat.readFully(var13, 78600828);

                     int var14;
                     for (var14 = 0; var14 < 24; var14++) {
                        if (var0 == 169419667) {
                           throw new IllegalStateException();
                        }

                        if (var13[var14] != 0) {
                           break;
                        }
                     }

                     if (var14 >= 24) {
                        if (var0 == 169419667) {
                           throw new IllegalStateException();
                        }

                        throw new IOException();
                     }
                  } catch (Exception var24) {
                     for (int var15 = 0; var15 < 24; var15++) {
                        if (var0 == 169419667) {
                           throw new IllegalStateException();
                        }

                        var13[var15] = -1;
                     }
                  }

                  Buffer.method11967(var10, var13, 0, var13.length, -1187258379);
               }

               var10.writeLongMedium(var29.nextLong());
               var10.encryptRsa(classBC.field111, classBC.field112, (byte)83);
               int var34 = AccessFile.stringCp1252NullTerminatedByteSize(var28, 392041868);
               if (0 != var34 % 8) {
                  if (var0 == 169419667) {
                     throw new IllegalStateException();
                  }

                  var34 += 8 - var34 % 8;
               }

               Buffer var35 = new Buffer(var34);
               var35.writeStringCp1252NullTerminated(var28, 998990159);
               var35.offset = 1741769013 * var34;
               var35.xteaEncryptAll(var11, (short)24115);
               Buffer var36 = new Buffer(2108391709 * var35.offset + var10.offset * 2108391709 + 5 + 2108391709 * var31.offset);
               var36.writeByte(2, (short)-3453);
               var36.writeByte(var31.offset * 2108391709, (short)-11203);
               Buffer.method11967(var36, var31.array, 0, var31.offset * 2108391709, -1187258379);
               var36.writeByte(2108391709 * var10.offset, (short)-18689);
               Buffer.method11967(var36, var10.array, 0, 2108391709 * var10.offset, -1187258379);
               var36.writeShort(var35.offset * 2108391709, -1398451651);
               Buffer.method11967(var36, var35.array, 0, 2108391709 * var35.offset, -1187258379);
               byte[] var16 = var36.array;
               String var38 = BufferedSource.method10619(var16, 0, var16.length, (byte)83);
               String var17 = var38;

               byte var27;
               try {
                  URL var18 = new URL(EnumComposition.method4474("services", false, 1179940625) + "m=accountappeal/login.ws");
                  URLConnection var19 = var18.openConnection();
                  var19.setDoInput(true);
                  var19.setDoOutput(true);
                  var19.setConnectTimeout(5000);
                  OutputStreamWriter var20 = new OutputStreamWriter(var19.getOutputStream());
                  var20.write("data2=" + class320.method7361(var17, 2120071691) + "&dest=" + class320.method7361("passwordchoice.ws", -1906603509));
                  var20.flush();
                  InputStream var21 = var19.getInputStream();
                  var36 = new Buffer(new byte[1000]);

                  while (true) {
                     int var22 = var21.read(var36.array, var36.offset * 2108391709, 1000 - 2108391709 * var36.offset);
                     if (var22 == -1) {
                        if (var0 == 169419667) {
                           return;
                        }

                        var20.close();
                        var21.close();
                        String var39 = new String(var36.array);
                        if (var39.startsWith("OFFLINE")) {
                           if (var0 == 169419667) {
                              throw new IllegalStateException();
                           }

                           var27 = 4;
                        } else if (var39.startsWith("WRONG")) {
                           if (var0 == 169419667) {
                              throw new IllegalStateException();
                           }

                           var27 = 7;
                        } else if (var39.startsWith("RELOAD")) {
                           if (var0 == 169419667) {
                              throw new IllegalStateException();
                           }

                           var27 = 3;
                        } else if (var39.startsWith("Not permitted for social network accounts.")) {
                           if (var0 == 169419667) {
                              return;
                           }

                           var27 = 6;
                        } else {
                           var36.xteaDecryptAll(var11, (byte)113);

                           while (var36.offset * 2108391709 > 0) {
                              if (var0 == 169419667) {
                                 throw new IllegalStateException();
                              }

                              if (var36.array[2108391709 * var36.offset - 1] != 0) {
                                 break;
                              }

                              if (var0 == 169419667) {
                                 return;
                              }

                              var36.offset -= 1741769013;
                           }

                           String var40 = new String(var36.array, 0, 2108391709 * var36.offset);
                           if (WorldEntityCoord.method6258(var40, 1715908378)) {
                              if (var0 == 169419667) {
                                 throw new IllegalStateException();
                              }

                              class558.openURL(var40, (short)-13181);
                              var27 = 2;
                           } else {
                              var27 = 5;
                           }
                        }
                        break;
                     }

                     var36.offset += var22 * 1741769013;
                     if (var36.offset * 2108391709 >= 1000) {
                        if (var0 == 169419667) {
                           throw new IllegalStateException();
                        }

                        var27 = 5;
                        break;
                     }
                  }
               } catch (Throwable var23) {
                  var23.printStackTrace();
                  var27 = 5;
               }

               var1 = var27;
            }

            switch (var1) {
               case 2:
                  class525.setLoginResponseString(Strings.field5120, Strings.field5080, Strings.field5122, (byte)1);
                  class30.method1308(6, -408124921);
                  break;
               case 3:
                  class525.setLoginResponseString(Strings.field5123, Strings.field5124, Strings.field4970, (byte)1);
                  break;
               case 4:
                  class525.setLoginResponseString(Strings.field4934, Strings.field5127, Strings.field5157, (byte)1);
                  break;
               case 5:
                  class525.setLoginResponseString(Strings.field4887, Strings.field5096, Strings.field5050, (byte)1);
                  break;
               case 6:
                  class525.setLoginResponseString(Strings.field5132, Strings.field5133, Strings.field5134, (byte)1);
                  break;
               case 7:
                  class525.setLoginResponseString(Strings.field5070, Strings.field5136, Strings.field4902, (byte)1);
            }
         }
      } catch (RuntimeException var26) {
         throw RestClientThreadFactory.newRunException(var26, "lb.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("ap")
   @Override
   public void vmethod264(WorldMapArea var1) {
      if (var1.regionLowX * 972064699 > -72774507 * this.field3612) {
         var1.regionLowX = this.field3612 * 1943449583;
      }

      if (var1.regionHighX * 2009549851 < -72774507 * this.field3612) {
         var1.regionHighX = this.field3612 * -1554533105;
      }

      if (-262946729 * var1.regionLowY > this.field3614 * 1814140371) {
         var1.regionLowY = this.field3614 * -37177115;
      }

      if (-234334363 * var1.regionHighY < 1814140371 * this.field3614) {
         var1.regionHighY = -1458278185 * this.field3614;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod267(int var1, int var2, int var3) {
      return var1 >= this.field3619 * 489984215 && var1 < this.field3618 * 345213555 + 489984215 * this.field3619
         ? var2 >= (468239605 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3)
            && var2 <= (468239605 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3) + 7
            && var3 >= (2033081509 * this.field3620 << 3) + (-1850076807 * this.field3616 << 6)
            && var3 <= (-1850076807 * this.field3616 << 6) + (this.field3620 * 2033081509 << 3) + 7
         : false;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("as")
   @Override
   public boolean vmethod273(int var1, int var2) {
      return var1 >= (306154127 * this.field3612 << 6) + (this.field3617 * -380903341 << 3)
         && var1 <= 7 + (this.field3612 * 365406007 << 6) + (-380903341 * this.field3617 << 3)
         && var2 >= (1814140371 * this.field3614 << 6) + (this.field3621 * -668145981 << 3)
         && var2 <= 7 + (1886544254 * this.field3614 << 6) + (this.field3621 * -1730699417 << 3);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod268(int var1, int var2, int var3) {
      return var1 >= this.field3619 * -2082285321 && var1 < this.field3618 * 345213555 + -353644010 * this.field3619
         ? var2 >= (-727884571 * this.field3613 << 6) + (this.field3615 * -1550502852 << 3)
            && var2 <= (2010915821 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3) + 7
            && var3 >= (-1950238755 * this.field3620 << 3) + (-1850076807 * this.field3616 << 6)
            && var3 <= (-1850076807 * this.field3616 << 6) + (this.field3620 * 2033081509 << 3) + 7
         : false;
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("aw")
   @Override
   public void vmethod265(WorldMapArea var1) {
      if (var1.regionLowX * 972064699 > -72774507 * this.field3612) {
         var1.regionLowX = this.field3612 * 1943449583;
      }

      if (var1.regionHighX * 2009549851 < -72774507 * this.field3612) {
         var1.regionHighX = this.field3612 * -1554533105;
      }

      if (-262946729 * var1.regionLowY > this.field3614 * 1814140371) {
         var1.regionLowY = this.field3614 * -37177115;
      }

      if (-234334363 * var1.regionHighY < 1814140371 * this.field3614) {
         var1.regionHighY = -1458278185 * this.field3614;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ai")
   @Override
   public boolean vmethod269(int var1, int var2, int var3) {
      return var1 >= this.field3619 * 489984215 && var1 < this.field3618 * 345213555 + 489984215 * this.field3619
         ? var2 >= (-1243969394 * this.field3613 << 6) + (this.field3615 * 706130026 << 3)
            && var2 <= (468239605 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3) + 7
            && var3 >= (-429243873 * this.field3620 << 3) + (-1850076807 * this.field3616 << 6)
            && var3 <= (-1850076807 * this.field3616 << 6) + (this.field3620 * 176746746 << 3) + 7
         : false;
   }

   class299() {
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   @Override
   public boolean vmethod274(int var1, int var2) {
      return var1 >= (-72774507 * this.field3612 << 6) + (this.field3617 * -380903341 << 3)
         && var1 <= 7 + (this.field3612 * -72774507 << 6) + (-380903341 * this.field3617 << 3)
         && var2 >= (1814140371 * this.field3614 << 6) + (this.field3621 * -1730699417 << 3)
         && var2 <= 7 + (1814140371 * this.field3614 << 6) + (this.field3621 * -1730699417 << 3);
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Z")
   @ObfuscatedName("at")
   @Override
   public boolean containsCoord(int var1, int var2, int var3, byte var4) {
      try {
         if (var1 >= this.field3619 * 489984215 && var1 < this.field3618 * 345213555 + 489984215 * this.field3619) {
            if (var2 >= (468239605 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3)) {
               if (var4 >= 14) {
                  throw new IllegalStateException();
               }

               if (var2 <= (468239605 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3) + 7
                  && var3 >= (2033081509 * this.field3620 << 3) + (-1850076807 * this.field3616 << 6)) {
                  if (var4 >= 14) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= (-1850076807 * this.field3616 << 6) + (this.field3620 * 2033081509 << 3) + 7) {
                     return true;
                  }
               }
            }

            return false;
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "lb.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ax")
   @Override
   public Coord vmethod277(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -1712334888)) {
         return null;
      } else {
         int var3 = var1 + (-97436352 * this.field3613 - this.field3612 * -362601152) + (this.field3615 * 1603479032 - 1247740568 * this.field3617);
         int var4 = -915217112 * this.field3620 - -960693448 * this.field3621 + var2 + (1854168640 * this.field3616 - 140866752 * this.field3614);
         return new Coord(this.field3619 * 489984215, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ar")
   @Override
   public Coord vmethod278(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -1469269166)) {
         return null;
      } else {
         int var3 = var1 + (-97436352 * this.field3613 - this.field3612 * -362601152) + (this.field3615 * 1603479032 - 1247740568 * this.field3617);
         int var4 = -915217112 * this.field3620 - -960693448 * this.field3621 + var2 + (1854168640 * this.field3616 - 140866752 * this.field3614);
         return new Coord(this.field3619 * 489984215, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loj;")
   @ObfuscatedName("ah")
   @Override
   public Coord vmethod279(int var1, int var2) {
      if (!this.containsPosition(var1, var2, -1386425489)) {
         return null;
      } else {
         int var3 = var1 + (-97436352 * this.field3613 - this.field3612 * -362601152) + (this.field3615 * 1603479032 - 1247740568 * this.field3617);
         int var4 = -915217112 * this.field3620 - -960693448 * this.field3621 + var2 + (1854168640 * this.field3616 - 140866752 * this.field3614);
         return new Coord(this.field3619 * 489984215, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("al")
   @Override
   public void vmethod282(Buffer var1) {
      this.field3619 = var1.readUnsignedByte(-989516009) * -470195481;
      this.field3618 = var1.readUnsignedByte(-350953118) * -314354752;
      this.field3613 = Buffer.method12008(var1, (byte)5) * 610522519;
      this.field3615 = var1.readUnsignedByte(-147722897) * 335036105;
      this.field3616 = Buffer.method12008(var1, (byte)5) * 1352698057;
      this.field3620 = var1.readUnsignedByte(593516811) * 1879190317;
      this.field3612 = Buffer.method12008(var1, (byte)5) * 1472388797;
      this.field3617 = var1.readUnsignedByte(1087349594) * 191718363;
      this.field3614 = Buffer.method12008(var1, (byte)5) * -1442543013;
      this.field3621 = var1.readUnsignedByte(-1546563263) * -1430254505;
      this.method6981((byte)-85);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("am")
   @Override
   public void vmethod283(Buffer var1) {
      this.field3619 = var1.readUnsignedByte(-1355601647) * -470195481;
      this.field3618 = var1.readUnsignedByte(836581701) * 1320233659;
      this.field3613 = Buffer.method12008(var1, (byte)5) * 1480509277;
      this.field3615 = var1.readUnsignedByte(-184481744) * 859507519;
      this.field3616 = Buffer.method12008(var1, (byte)5) * 1352698057;
      this.field3620 = var1.readUnsignedByte(-558287291) * 1879190317;
      this.field3612 = Buffer.method12008(var1, (byte)5) * 1472388797;
      this.field3617 = var1.readUnsignedByte(-15990960) * 191718363;
      this.field3614 = Buffer.method12008(var1, (byte)5) * -1442543013;
      this.field3621 = var1.readUnsignedByte(1141623711) * -1430254505;
      this.method6981((byte)-85);
   }

   @ObfuscatedSignature(descriptor = "(III)Loj;")
   @ObfuscatedName("ae")
   @Override
   public Coord coord(int var1, int var2, int var3) {
      try {
         if (!this.containsPosition(var1, var2, -1399789163)) {
            if (var3 != 216292671) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var1 + (-97436352 * this.field3613 - this.field3612 * -362601152) + (this.field3615 * 1603479032 - 1247740568 * this.field3617);
            int var5 = -915217112 * this.field3620 - -960693448 * this.field3621 + var2 + (1854168640 * this.field3616 - 140866752 * this.field3614);
            return new Coord(this.field3619 * 489984215, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lb.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method6982() {
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("au")
   @Override
   public boolean vmethod271(int var1, int var2, int var3) {
      return var1 >= this.field3619 * -359917148 && var1 < this.field3618 * 345213555 + 563473243 * this.field3619
         ? var2 >= (-463764302 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3)
            && var2 <= (2046322977 * this.field3613 << 6) + (this.field3615 * -1410177857 << 3) + 7
            && var3 >= (2033081509 * this.field3620 << 3) + (-1412325538 * this.field3616 << 6)
            && var3 <= (706290946 * this.field3616 << 6) + (this.field3620 * 2033081509 << 3) + 7
         : false;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("af")
   @Override
   public void vmethod284(Buffer var1) {
      this.field3619 = var1.readUnsignedByte(-910599240) * -470195481;
      this.field3618 = var1.readUnsignedByte(2000167941) * 1320233659;
      this.field3613 = Buffer.method12008(var1, (byte)5) * 1480509277;
      this.field3615 = var1.readUnsignedByte(-1545683698) * 859507519;
      this.field3616 = Buffer.method12008(var1, (byte)5) * 1352698057;
      this.field3620 = var1.readUnsignedByte(292986398) * 1879190317;
      this.field3612 = Buffer.method12008(var1, (byte)5) * 1472388797;
      this.field3617 = var1.readUnsignedByte(1508132338) * 191718363;
      this.field3614 = Buffer.method12008(var1, (byte)5) * -1442543013;
      this.field3621 = var1.readUnsignedByte(1019128668) * -1430254505;
      this.method6981((byte)17);
   }
}
