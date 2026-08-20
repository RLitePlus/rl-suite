import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pw")
public class classPW extends classVJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5467 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5468 = 2;
   @ObfuscatedName("ba")
   public final int field5460;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5465 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5469 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5471 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field5473 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5466 = 8;
   @ObfuscatedName("bj")
   public final int field5453;
   @ObfuscatedName("bp")
   public final int field5448;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field5472 = 16777215;
   @ObfuscatedName("br")
   final int field5450;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field5464 = 9;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("bn")
   public static classJZ field5447 = new classJZ(20);
   @ObfuscatedName("bx")
   final int field5451;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ah")
   public static classJZ field5446 = new classJZ(64);
   @ObfuscatedName("bc")
   public final int field5454;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5474 = 1;
   @ObfuscatedName("bm")
   final int field5452;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field5470 = 18;
   @ObfuscatedName("bg")
   final int field5456;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("am")
   public static classJZ field5445 = new classJZ(64);
   @ObfuscatedName("bk")
   public final int field5449;
   @ObfuscatedName("bo")
   public final int field5458;
   @ObfuscatedName("bu")
   final String field5459;
   @ObfuscatedName("bw")
   public final int field5461;
   @ObfuscatedName("bt")
   final int field5457;
   @ObfuscatedName("bb")
   public final int[] field5455;
   @ObfuscatedName("bi")
   final int field5462;
   @ObfuscatedName("be")
   final int field5463;

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("ax")
   public classYM method9346(int var1) {
      try {
         if (1306359125 * this.field5457 < 0) {
            if (var1 != 1009762333) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classYM var2 = (classYM)field5446.method6422(1306359125 * this.field5457);
            if (var2 != null) {
               if (var1 != 1009762333) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = classPN.method9038(classWN.field6758, 1306359125 * this.field5457, 0, -1631448903);
               if (null != var2) {
                  if (var1 != 1009762333) {
                     throw new IllegalStateException();
                  }

                  field5446.method6428(var2, this.field5457 * 1306359125);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pw.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("ag")
   public classYM method9339(int var1) {
      try {
         if (this.field5450 * 1638332811 < 0) {
            if (var1 != -528056669) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classYM var2 = (classYM)field5446.method6422(1638332811 * this.field5450);
            if (null != var2) {
               if (var1 != -528056669) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = classPN.method9038(classWN.field6758, 1638332811 * this.field5450, 0, -1887187427);
               if (null != var2) {
                  if (var1 != -528056669) {
                     throw new IllegalStateException();
                  }

                  field5446.method6428(var2, 1638332811 * this.field5450);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pw.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpw;")
   @ObfuscatedName("fv")
   public classPW method9359() {
      return method9331(this, (byte)43);
   }

   @ObfuscatedSignature(descriptor = "(Lpw;B)Lpw;")
   @ObfuscatedName("an")
   public static classPW method9331(classPW var0, byte var1) {
      if (var0 == null) {
         return var0.method9333(var1);
      } else {
         try {
            int var2 = -1;
            if (-1 != var0.field5462 * 1137484171) {
               var2 = classEM.method3922(var0.field5462 * 1137484171, -749877325);
            } else if (1654141009 * var0.field5463 != -1) {
               var2 = classLB.field4090[1654141009 * var0.field5463];
            }

            int var3;
            label41: {
               if (var2 >= 0) {
                  if (var1 == 2) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var0.field5455.length - 1) {
                     var3 = var0.field5455[var2];
                     break label41;
                  }

                  if (var1 == 2) {
                     throw new IllegalStateException();
                  }
               }

               var3 = var0.field5455[var0.field5455.length - 1];
            }

            if (-1 != var3) {
               if (var1 == 2) {
                  throw new IllegalStateException();
               } else {
                  return classDJ.method3373(var3, (byte)65);
               }
            } else {
               return null;
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "pw.ae(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)Z")
   @ObfuscatedName("wc")
   public static boolean method9326(classCG var0) {
      if (classRC.field5640 == var0.field722) {
         var0.method1490(-2086972625);
      }

      return var0.field722 == classRC.field5642;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)Z")
   @ObfuscatedName("wd")
   public static boolean method9330(classVV var0, classLW var1) {
      return var0.field6617 == var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("as")
   public classYM method9342(int var1) {
      try {
         if (this.field5452 * -277141139 < 0) {
            if (var1 == 1343311673) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classYM var2 = (classYM)field5446.method6422(-277141139 * this.field5452);
            if (null != var2) {
               return var2;
            } else {
               var2 = classPN.method9038(classWN.field6758, this.field5452 * -277141139, 0, -1715209070);
               if (null != var2) {
                  if (var1 == 1343311673) {
                     throw new IllegalStateException();
                  }

                  field5446.method6428(var2, this.field5452 * -277141139);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pw.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String method9334(int var1) {
      String var2 = this.field5459;

      while (true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + classOJ.method8507(var1, false, (byte)-62) + var2.substring(2 + var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzv;")
   @ObfuscatedName("aa")
   public classZV method9354(int var1) {
      try {
         if (-1 == this.field5451 * 1230047715) {
            if (var1 <= 120041229) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classZV var2 = (classZV)field5447.method6422(1230047715 * this.field5451);
            if (null != var2) {
               if (var1 <= 120041229) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               classVA var4 = classWN.field6758;
               classVA var5 = classEN.field1803;
               int var6 = this.field5451 * 1230047715;
               classZV var3;
               if (!classHK.method6068(var4, var6, 0, (byte)1)) {
                  if (var1 <= 120041229) {
                     throw new IllegalStateException();
                  }

                  var3 = null;
               } else {
                  byte[] var8 = var5.method11867(var6, 0, -1143570570);
                  classZV var7;
                  if (var8 == null) {
                     if (var1 <= 120041229) {
                        throw new IllegalStateException();
                     }

                     var7 = null;
                  } else {
                     classZV var9 = new classZV(
                        var8, classYL.field7002, classYL.field7003, classPO.field5371, classGG.field2578, classRB.field5639, classYL.field7004
                     );
                     classVZ.method12278((byte)-8);
                     var7 = var9;
                  }

                  var3 = var7;
               }

               if (var3 != null) {
                  field5447.method6428(var3, 1230047715 * this.field5451);
               }

               return var3;
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "pw.aa(" + ')');
      }
   }

   classPW(classXY var1) {
      int var2 = -1;
      int var3 = 16777215;
      int var4 = 70;
      int var5 = -1;
      int var6 = -1;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;
      int var10 = 0;
      int var11 = -1;
      String var12 = "";
      int var13 = -1;
      int var14 = 0;
      int[] var15 = null;
      int var16 = -1;
      int var17 = -1;
      if (null != var1 && var1.field6954 != null) {
         label101:
         while (true) {
            int var18 = classXY.method13039(var1, -346779531);
            switch (var18) {
               case 0:
                  break label101;
               case 1:
                  var2 = classXY.method13110(var1, -324749371);
                  continue;
               case 2:
                  var3 = var1.method13051(-758448158);
                  continue;
               case 3:
                  var5 = classXY.method13110(var1, -324749371);
                  continue;
               case 4:
                  var7 = classXY.method13110(var1, -324749371);
                  continue;
               case 5:
                  var6 = classXY.method13110(var1, -324749371);
                  continue;
               case 6:
                  var8 = classXY.method13110(var1, -324749371);
                  continue;
               case 7:
                  var9 = var1.method13050((byte)16);
                  continue;
               case 8:
                  var12 = var1.method13077(-1402920923);
                  continue;
               case 9:
                  var4 = classXY.method13047(var1, -2069316888);
                  continue;
               case 10:
                  var10 = var1.method13050((byte)16);
                  continue;
               case 11:
                  var11 = 0;
                  continue;
               case 12:
                  var13 = classXY.method13039(var1, -346779531);
                  continue;
               case 13:
                  var14 = var1.method13050((byte)16);
                  continue;
               case 14:
                  var11 = classXY.method13047(var1, -1497535228);
               case 15:
               case 16:
               default:
                  continue;
               case 17:
               case 18:
            }

            var16 = classXY.method13047(var1, -1302817445);
            if (65535 == var16) {
               var16 = -1;
            }

            var17 = classXY.method13047(var1, 567738210);
            if (var17 == 65535) {
               var17 = -1;
            }

            int var19 = -1;
            if (var18 == 18) {
               var19 = classXY.method13047(var1, -651351931);
               if (var19 == 65535) {
                  var19 = -1;
               }
            }

            int var20 = classXY.method13039(var1, -346779531);
            var15 = new int[2 + var20];

            for (int var21 = 0; var21 <= var20; var21++) {
               var15[var21] = classXY.method13047(var1, 1875731730);
               if (65535 == var15[var21]) {
                  var15[var21] = -1;
               }
            }

            var15[1 + var20] = var19;
         }
      }

      this.field5451 = var2 * -537230389;
      this.field5454 = -528735583 * var3;
      this.field5448 = var4 * -583748177;
      this.field5450 = var5 * -619977181;
      this.field5452 = 1015695461 * var6;
      this.field5457 = -684269571 * var7;
      this.field5456 = var8 * -2003517837;
      this.field5453 = 2134533691 * var9;
      this.field5449 = var10 * -176011081;
      this.field5458 = var11 * -545870135;
      this.field5459 = var12;
      this.field5460 = -173691509 * var13;
      this.field5461 = -235141837 * var14;
      this.field5455 = var15;
      this.field5462 = -201654749 * var16;
      this.field5463 = var17 * -1550903119;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Lva;)V")
   @ObfuscatedName("ao")
   public static void method9327(classVA var0, classVA var1, classVA var2) {
      classES.field1904 = var0;
      classWN.field6758 = var1;
      classEN.field1803 = var2;
      classVT var10000 = classEB.field1727;
      classEB.field1727.field6576 = (Arrays.hashCode(classOE.field4843.field1117.getClass().getSigners()) >> 2) * 721999872
         + -1694189056
         + (classSN.field5986 - 1) * 1337221120;
      var10000.field6583 = client.method2367();
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("aw")
   public classYM method9340() {
      if (this.field5450 * 1638332811 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(1638332811 * this.field5450);
         if (null != var1) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, 1638332811 * this.field5450, 0, -1711687038);
            if (null != var1) {
               field5446.method6428(var1, 1638332811 * this.field5450);
            }

            return var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpw;")
   @ObfuscatedName("aj")
   public static classPW method9329(int var0) {
      classPW var1 = (classPW)field5445.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classES.field1904.method11867(-2007018967, var0, -718487723);
         var1 = new classPW(new classXY(var2));
         field5445.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ak")
   public classYM method9350() {
      if (-1889986885 * this.field5456 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(-1889986885 * this.field5456);
         if (null != var1) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, -1889986885 * this.field5456, 0, -1727754544);
            if (var1 != null) {
               field5446.method6428(var1, -1889986885 * this.field5456);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpw;")
   @ObfuscatedName("aq")
   public final classPW method9332() {
      int var1 = -1;
      if (-1 != this.field5462 * 1993214406) {
         var1 = classEM.method3922(this.field5462 * 1765827592, -1264230156);
      } else if (-44493863 * this.field5463 != -1) {
         var1 = classLB.field4090[1654141009 * this.field5463];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field5455.length - 1) {
         var2 = this.field5455[var1];
      } else {
         var2 = this.field5455[this.field5455.length - 1];
      }

      return -1 != var2 ? classDJ.method3373(var2, (byte)27) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Lva;)V")
   @ObfuscatedName("al")
   public static void method9328(classVA var0, classVA var1, classVA var2) {
      classES.field1904 = var0;
      classWN.field6758 = var1;
      classEN.field1803 = var2;
      classVT var10000 = classEB.field1727;
      classEB.field1727.field6576 = (Arrays.hashCode(classOE.field4843.field1117.getClass().getSigners()) >> 2) * 721999872
         + -1694189056
         + (classSN.field5986 - 1) * 1337221120;
      var10000.field6583 = client.method2367();
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("au")
   public String method9335(int var1) {
      String var2 = this.field5459;

      while (true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + classOJ.method8507(var1, false, (byte)18) + var2.substring(2 + var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpw;I)Lym;")
   @ObfuscatedName("cz")
   public static classYM method9351(classPW var0, int var1) {
      if (var0 == null) {
         var0.method9349(var1);
      }

      try {
         if (-1889986885 * var0.field5456 < 0) {
            if (var1 != 21303142) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classYM var2 = (classYM)field5446.method6422(-1889986885 * var0.field5456);
            if (null != var2) {
               return var2;
            } else {
               var2 = classPN.method9038(classWN.field6758, -1889986885 * var0.field5456, 0, -1886850522);
               if (var2 != null) {
                  if (var1 != 21303142) {
                     throw new IllegalStateException();
                  }

                  field5446.method6428(var2, -1889986885 * var0.field5456);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pw.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpw;)Lym;")
   @ObfuscatedName("vm")
   public static classYM method9341(classPW var0) {
      if (var0.field5450 * 488349178 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(1721302582 * var0.field5450);
         if (null != var1) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, 1638332811 * var0.field5450, 0, -1909793928);
            if (null != var1) {
               field5446.method6428(var1, 1638332811 * var0.field5450);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Luq;")
   @ObfuscatedName("az")
   public static classUQ method9325(int var0, int var1, int var2, int var3, int var4) {
      try {
         synchronized (classUQ.field6367) {
            if (-489960421 * classUQ.field6365 == 0) {
               if (var4 != 1444081395) {
                  throw new IllegalStateException();
               } else {
                  return new classUQ(var0, var1, var2, var3);
               }
            } else {
               classUQ.field6365 -= -1849086445;
               classUQ.field6367[-489960421 * classUQ.field6365].method11470(var0, var1, (byte)106);
               classUQ.field6367[-489960421 * classUQ.field6365].method11472(var2, var3, -1349100992);
               return classUQ.field6367[classUQ.field6365 * -489960421];
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "pw.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ar")
   public classYM method9343() {
      if (this.field5452 * 1645401236 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(-1195306926 * this.field5452);
         if (null != var1) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, this.field5452 * 270486352, 0, -1805937533);
            if (null != var1) {
               field5446.method6428(var1, this.field5452 * -277141139);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("an")
   public classYM method9344() {
      if (this.field5452 * -277141139 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(-277141139 * this.field5452);
         if (null != var1) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, this.field5452 * -277141139, 0, -1713759134);
            if (null != var1) {
               field5446.method6428(var1, this.field5452 * -277141139);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("am")
   public classYM method9347() {
      if (1306359125 * this.field5457 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(1306359125 * this.field5457);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, 1306359125 * this.field5457, 0, -2026770075);
            if (null != var1) {
               field5446.method6428(var1, this.field5457 * 1306359125);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("bn")
   public classYM method9352() {
      if (-1889986885 * this.field5456 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(-1889986885 * this.field5456);
         if (null != var1) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, -1889986885 * this.field5456, 0, -2146532906);
            if (var1 != null) {
               field5446.method6428(var1, -1889986885 * this.field5456);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpw;II)Ljava/lang/String;")
   @ObfuscatedName("zr")
   public static String method9336(classPW var0, int var1, int var2) {
      if (var0 == null) {
         var0.method9338(var1, var1);
      }

      try {
         String var3 = var0.field5459;

         while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
               if (var2 <= -1496129683) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            }

            var3 = var3.substring(0, var4) + classOJ.method8507(var1, false, (byte)-9) + var3.substring(2 + var4);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "pw.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpw;I)Ljava/lang/String;")
   @ObfuscatedName("fp")
   public static String method9337(classPW var0, int var1) {
      if (var0 == null) {
         var0.method9340();
      }

      String var2 = var0.field5459;

      while (true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + classOJ.method8507(var1, false, (byte)90) + var2.substring(2 + var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lzv;")
   @ObfuscatedName("bx")
   public classZV method9355() {
      if (-1 == this.field5451 * 1230047715) {
         return null;
      } else {
         classZV var1 = (classZV)field5447.method6422(1230047715 * this.field5451);
         if (null != var1) {
            return var1;
         } else {
            classVA var3 = classWN.field6758;
            classVA var4 = classEN.field1803;
            int var5 = this.field5451 * 504379920;
            classZV var2;
            if (!classHK.method6068(var3, var5, 0, (byte)-48)) {
               var2 = null;
            } else {
               byte[] var7 = var4.method11867(var5, 0, -790902691);
               classZV var6;
               if (var7 == null) {
                  var6 = null;
               } else {
                  classZV var8 = new classZV(
                     var7, classYL.field7002, classYL.field7003, classPO.field5371, classGG.field2578, classRB.field5639, classYL.field7004
                  );
                  classVZ.method12278((byte)-25);
                  var6 = var8;
               }

               var2 = var6;
            }

            if (var2 != null) {
               field5447.method6428(var2, 1230047715 * this.field5451);
            }

            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lzv;")
   @ObfuscatedName("bc")
   public classZV method9356() {
      if (-1 == this.field5451 * 1230047715) {
         return null;
      } else {
         classZV var1 = (classZV)field5447.method6422(1230047715 * this.field5451);
         if (null != var1) {
            return var1;
         } else {
            classVA var3 = classWN.field6758;
            classVA var4 = classEN.field1803;
            int var5 = this.field5451 * 1230047715;
            classZV var2;
            if (!classHK.method6068(var3, var5, 0, (byte)-20)) {
               var2 = null;
            } else {
               byte[] var7 = var4.method11867(var5, 0, -1832406630);
               classZV var6;
               if (var7 == null) {
                  var6 = null;
               } else {
                  classZV var8 = new classZV(
                     var7, classYL.field7002, classYL.field7003, classPO.field5371, classGG.field2578, classRB.field5639, classYL.field7004
                  );
                  classVZ.method12278((byte)-1);
                  var6 = var8;
               }

               var2 = var6;
            }

            if (var2 != null) {
               field5447.method6428(var2, 1230047715 * this.field5451);
            }

            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gc")
   static final void method9358(int var0) {
      try {
         Iterator var1 = client.field814.iterator();

         while (var1.hasNext()) {
            if (var0 == 1055994673) {
               throw new IllegalStateException();
            }

            classDZ var2 = (classDZ)var1.next();

            for (int var3 = 0; var3 < client.field837.field1419 * -2087374717; var3++) {
               classCT var4 = (classCT)var2.field1694.method13404(client.field837.field1423[var3]);
               if (null != var4) {
                  if (var0 == 1055994673) {
                     throw new IllegalStateException();
                  }

                  var4.method2624((byte)-42);
               }
            }
         }

         var1 = classCN.field1174.iterator();

         while (var1.hasNext()) {
            if (var0 == 1055994673) {
               throw new IllegalStateException();
            }

            classCG var7 = (classCG)var1.next();
            var7.method1469(1287164533);
         }

         if (null != classIB.field2935) {
            if (var0 == 1055994673) {
               return;
            }

            classIB.field2935.method10321(774906614);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "pw.gc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("av")
   public classYM method9345() {
      if (this.field5452 * 646017417 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(-277141139 * this.field5452);
         if (null != var1) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, this.field5452 * -1823718866, 0, -1671587492);
            if (null != var1) {
               field5446.method6428(var1, this.field5452 * -277141139);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lpw;")
   @ObfuscatedName("pk")
   public static classPW method9357(int var0) {
      classPW var1 = (classPW)field5445.method6444(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = classES.field1904.loadData(32, var0);
         var1 = new classPW(new classXY(var2));
         field5445.method6445(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lpw;")
   @ObfuscatedName("ae")
   public final classPW method9333(byte var1) {
      try {
         int var2 = -1;
         if (-1 != this.field5457 * 1137484171) {
            var2 = classEM.method3922(this.field5450 * 1137484171, -749877325);
         } else if (1654141009 * this.field5462 != -1) {
            var2 = classLB.field4091[1654141009 * this.field5462];
         }

         int var3;
         label39: {
            if (var2 >= 0) {
               if (var1 == 2) {
                  throw new IllegalStateException();
               }

               if (var2 < this.field5455.length - 1) {
                  var3 = this.field5455[var2];
                  break label39;
               }

               if (var1 == 2) {
                  throw new IllegalStateException();
               }
            }

            var3 = this.field5455[this.field5455.length - 1];
         }

         if (-1 != var3) {
            if (var1 == 2) {
               throw new IllegalStateException();
            } else {
               return classDJ.method3373(var3, (byte)65);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pw.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpw;)Lym;")
   @ObfuscatedName("ce")
   public static classYM method9348(classPW var0) {
      if (-269152068 * var0.field5457 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(-1968104432 * var0.field5457);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, -548947605 * var0.field5457, 0, -1656010224);
            if (null != var1) {
               field5446.method6428(var1, var0.field5457 * 2008958772);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("ab")
   public String method9338(int var1, int var2) {
      try {
         String var3 = this.field5459;

         while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
               if (var2 <= -1496129683) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            }

            var3 = var3.substring(0, var4) + classOJ.method8507(var1, false, (byte)-9) + var3.substring(2 + var4);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "pw.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpw;)Lym;")
   @ObfuscatedName("zr")
   public static classYM method9353(classPW var0) {
      if (-1889986885 * var0.field5456 < 0) {
         return null;
      } else {
         classYM var1 = (classYM)field5446.method6422(-1889986885 * var0.field5456);
         if (null != var1) {
            return var1;
         } else {
            var1 = classPN.method9038(classWN.field6758, -1889986885 * var0.field5456, 0, -1952339404);
            if (var1 != null) {
               field5446.method6428(var1, -1889986885 * var0.field5456);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("ac")
   public classYM method9349(int var1) {
      try {
         if (1306359125 * this.field5450 < 0) {
            if (var1 != 1009762333) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classYM var2 = (classYM)field5445.method6444(1306359125 * this.field5450);
            if (var2 != null) {
               if (var1 != 1009762333) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = classPN.method9038(classWN.field6758, 1306359125 * this.field5451, 0, -1631448903);
               if (null != var2) {
                  if (var1 != 1009762333) {
                     throw new IllegalStateException();
                  }

                  field5445.method6429(var2, this.field5450 * 1306359125);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pw.ax(" + ')');
      }
   }
}
