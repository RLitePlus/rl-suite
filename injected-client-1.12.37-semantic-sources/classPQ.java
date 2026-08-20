import net.runelite.api.events.WidgetClosed;
import net.runelite.api.events.WidgetDrag;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pq")
public class classPQ {
   @ObfuscatedSignature(descriptor = "Ljx;")
   @ObfuscatedName("az")
   final classJX field5382;
   @ObfuscatedSignature(descriptor = "Ljv;")
   @ObfuscatedName("af")
   final classJV field5383;
   @ObfuscatedSignature(descriptor = "Lpu;")
   @ObfuscatedName("ae")
   final classPU field5381;
   @ObfuscatedSignature(descriptor = "Lqs;")
   @ObfuscatedName("ab")
   final classQS field5384 = new classQS();

   @ObfuscatedSignature(descriptor = "(ILvv;)V")
   @ObfuscatedName("yu")
   public void method9164(int var1, classVV var2) {
      method9137(this, var1, var2, 1310148379);
   }

   @ObfuscatedSignature(descriptor = "(Lvv;I)V")
   @ObfuscatedName("af")
   public void method9094(classVV var1, int var2) {
      try {
         if (-1 != -77072447 * var1.field6612) {
            var1.method7387(var1.field6612 * -77072447, 1153929065);
            var1.field6612 = -1130371137;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pq.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpq;Lvv;)V")
   @ObfuscatedName("jn")
   public static void method9095(classPQ var0, classVV var1) {
      if (var0 == null) {
         var0.method9096(var1);
      }

      if (-1 != -77072447 * var1.field6612) {
         var1.method7387(var1.field6612 * -77072447, -1637327880);
         var1.field6612 = -1130371137;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqp;Lvv;I)V")
   @ObfuscatedName("ao")
   public void method9126(classQP var1, classVV var2, int var3) {
      try {
         if (-1 != var2.field6612 * -77072447) {
            method9131(this, -77072447 * var2.field6612, var1, var2, (byte)-124);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pq.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILvv;Lqn;B)V")
   @ObfuscatedName("ag")
   public void method9108(int var1, int var2, classVV var3, classQN var4, byte var5) {
      try {
         InterfaceParent var6 = (InterfaceParent)var3.field6613.method13363(var1);
         InterfaceParent var7 = (InterfaceParent)var3.field6613.method13363(var2);
         if (var7 != null) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            boolean var10002;
            label48: {
               if (var6 != null) {
                  if (var5 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var6.field5276 * 2023647411 == var7.field5276 * 2023647411) {
                     var10002 = false;
                     break label48;
                  }

                  if (var5 != 0) {
                     throw new IllegalStateException();
                  }
               }

               var10002 = true;
            }

            method9106(this, var7, var10002, var3, (byte)-93);
         }

         if (var6 != null) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            var6.vmethod398();
            var3.field6613.method13372(var6, var2);
         }

         Widget var8 = classLY.method7375(var3, var2, (byte)47);
         if (var8 != null) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            classFC.method4586(var3.field4440[var8.field4329 * -1163656551 >>> 16], var8, true, var3, var4, 897179765);
         }

         this.method9126(classQP.field5582, var3, -1543721167);
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "pq.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIILvv;ILqn;B)V")
   @ObfuscatedName("ax")
   void method9113(int var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9, classQN var10, byte var11) {
      try {
         if (classLY.method7381(var8, var1, -56682132)) {
            method9118(
               this, var8.field4440[var1], 0, var8.field4440[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (byte)-103
            );
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "pq.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lclient;)Z")
   @ObfuscatedName("bc")
   public static boolean method9158(client var0) {
      return null != var0.field1102;
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIIIIILvv;I)V")
   @ObfuscatedName("aa")
   void method9121(Widget var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9) {
      try {
         byte var10;
         if (var8.field6619) {
            if (var9 <= 945021779) {
               throw new IllegalStateException();
            }

            var10 = 32;
         } else {
            var10 = 0;
         }

         label151: {
            var8.field6619 = false;
            if (classQS.method9790(this.field5384, -361602593) != 1) {
               if (this.field5383.vmethod168(-1996096499)) {
                  break label151;
               }

               if (var9 <= 945021779) {
                  throw new IllegalStateException();
               }

               if (classQS.method9790(this.field5384, -361602593) != 4) {
                  break label151;
               }

               if (var9 <= 945021779) {
                  throw new IllegalStateException();
               }
            }

            if (var6 >= var2) {
               if (var9 <= 945021779) {
                  throw new IllegalStateException();
               }

               if (var6 < 16 + var2) {
                  if (var9 <= 945021779) {
                     throw new IllegalStateException();
                  }

                  if (var7 >= var3) {
                     if (var9 <= 945021779) {
                        return;
                     }

                     if (var7 < var3 + 16) {
                        if (var9 <= 945021779) {
                           return;
                        }

                        var1.field4331 -= -299739220;
                        break label151;
                     }
                  }
               }
            }

            if (var6 >= var2) {
               if (var9 <= 945021779) {
                  throw new IllegalStateException();
               }

               if (var6 < 16 + var2) {
                  if (var9 <= 945021779) {
                     throw new IllegalStateException();
                  }

                  if (var7 >= var3 + var4 - 16) {
                     if (var9 <= 945021779) {
                        throw new IllegalStateException();
                     }

                     if (var7 < var3 + var4) {
                        if (var9 <= 945021779) {
                           throw new IllegalStateException();
                        }

                        var1.field4331 += -299739220;
                        break label151;
                     }
                  }
               }
            }

            if (var6 >= var2 - var10) {
               if (var9 <= 945021779) {
                  return;
               }

               if (var6 < var10 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
                  if (var9 <= 945021779) {
                     throw new IllegalStateException();
                  }

                  int var11 = var4 * (var4 - 32) / var5;
                  if (var11 < 8) {
                     if (var9 <= 945021779) {
                        throw new IllegalStateException();
                     }

                     var11 = 8;
                  }

                  int var12 = var7 - var3 - 16 - var11 / 2;
                  int var13 = var4 - 32 - var11;
                  var1.field4331 = (var5 - var4) * var12 / var13 * -1148676629;
                  var8.field6619 = true;
               }
            }
         }

         if (this.field5384.method9809((byte)-32) != 0) {
            if (var9 <= 945021779) {
               throw new IllegalStateException();
            }

            int var15 = var1.field4249 * 1115597881;
            if (var6 >= var2 - var15 && var7 >= var3) {
               if (var9 <= 945021779) {
                  throw new IllegalStateException();
               }

               if (var6 < 16 + var2) {
                  if (var9 <= 945021779) {
                     throw new IllegalStateException();
                  }

                  if (var7 <= var3 + var4) {
                     var1.field4331 = var1.field4331 + this.field5384.method9809((byte)-8) * -150840753;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "pq.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILqp;Lvv;)V")
   @ObfuscatedName("bf")
   void method9130(int var1, classQP var2, classVV var3) {
      if (classLY.method7381(var3, var1, 2086532451)) {
         method9139(this, var3.field4440[var1], var2, var3, (byte)3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpq;Lpk;ZLvv;)V")
   @ObfuscatedName("pv")
   public static void method9103(classPQ var0, InterfaceParent var1, boolean var2, classVV var3) {
      if (var0 == null) {
         var0.method9104(var1, var2, var3);
      } else {
         int var4 = -1550147844 * var1.field5276;
         var1.vmethod398();
         if (var2) {
            var3.method7387(var4, -846623488);
         }

         var3.method12128(var4, 1479147290);
         var0.method9126(classQP.field5582, var3, -894669533);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpq;IIILvv;Lqn;I)V")
   @ObfuscatedName("we")
   public static void method9090(classPQ var0, int var1, int var2, int var3, classVV var4, classQN var5, int var6) {
      if (var0 == null) {
         var0.method9093(var1, var1, var1, var4, var5, var1);
      }

      try {
         var4.field6612 = var1 * 1130371137;
         classCN.method2551(var4.field6612 * -77072447, var2, var3, false, var4, var5, (short)217);
         method9145(var0, var1, var4, -1584753516);
         method9137(var0, -77072447 * var4.field6612, var4, 1310148379);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "pq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;IIIILqn;)V")
   @ObfuscatedName("bt")
   public void method9110(classVV var1, int var2, int var3, int var4, int var5, classQN var6) {
      var1.method12112(706353244).method11924((byte)-30);
      classVW.method12186(var1.method12150((byte)0), -624973020);
      if (-77072447 * var1.field6612 != -1) {
         classQS.method9788(
            this.field5384,
            MouseHandler.field6251 * 2090434187,
            MouseHandler.field6255 * -38255113,
            MouseHandler.field6264 * -2144333897,
            MouseHandler.field6261 * 1229235359,
            MouseHandler.field6266 * 1422993977,
            MouseHandler.field6257 * 1243590197,
            var5,
            3392313
         );
         this.method9113(-77072447 * var1.field6612, 0, 0, var2, var3, 0, 0, var1, var4, var6, (byte)33);
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;ILqn;)V")
   @ObfuscatedName("bk")
   void method9117(
      Widget[] var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      classVV var12,
      int var13,
      classQN var14
   ) {
      boolean var15 = this.field5383.vmethod156((byte)0);
      classFA var16 = this.field5382.vmethod72(-1751247255);

      for (int var17 = var2; var17 <= var3; var17++) {
         Widget var18 = var1[var17];
         if (var18 != null
            && -1502647899 * var18.field4342 == var4
            && 653784551 * var18.field4263 == var5
            && var12.method12117(var18, (byte)-83)
            && (
               var18.field4275
                  ? !var12.method12119(var18, (byte)0)
                  : var18.field4375 * -1510882375 != 0 || var12.method12112(-128961542).method11927(var18, (byte)82) || !var12.method12119(var18, (byte)0)
            )) {
            if (-1510882375 * var18.field4375 == 11) {
               if (Widget.method7273(var18, var12, this.field5382.vmethod78((byte)-50), 1679933735)) {
                  if (var18.method7249(1355775728)) {
                     classFC.method4586(var18.field4340, var18, true, var12, var14, 1574025796);
                     classMU.method7696(var18.method7270(-1626603432).method7429((byte)9), 3, var18.method7270(-1626603432).method7478(644161130), (byte)10);
                  }

                  if (null != var18.field4398) {
                     ScriptEvent var19 = classZS.method14182(classUQ.method11465(var18, 287733073).method14145(var18.field4398, (byte)2), (byte)81);
                     var14.method9658(var19, 1697206599);
                  }
               }
            } else if (12 == var18.field4375 * -1510882375) {
               Widget.method7304(var18, var12, 1279009205);
            }

            int var36 = var18.field4281 * 744286069 + var10;
            int var20 = var11 + 1570844829 * var18.field4257;
            int var21;
            int var22;
            int var23;
            int var24;
            if (9 == -1510882375 * var18.field4375) {
               int var25 = var36;
               int var26 = var20;
               int var27 = 1115597881 * var18.field4249 + var36;
               int var28 = var20 + var18.field4259 * 293773697;
               if (var27 < var36) {
                  var25 = var27;
                  var27 = var36;
               }

               if (var28 < var20) {
                  var26 = var28;
                  var28 = var20;
               }

               var27++;
               var28++;
               var21 = var25 > var6 ? var25 : var6;
               var22 = var26 > var7 ? var26 : var7;
               var23 = var27 < var8 ? var27 : var8;
               var24 = var28 < var9 ? var28 : var9;
            } else {
               int var37 = var18.field4249 * 1115597881 + var36;
               int var39 = var18.field4259 * 293773697 + var20;
               var21 = var36 > var6 ? var36 : var6;
               var22 = var20 > var7 ? var20 : var7;
               var23 = var37 < var8 ? var37 : var8;
               var24 = var39 < var9 ? var39 : var9;
            }

            classVW.method12192(var12.method12150((byte)0), var18, var36, var20, -1621064682);
            boolean var38 = false;
            if (var18.field4360) {
               switch (var12.field6615 * -698898037) {
                  case 0:
                     var38 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (-1163656551 * var18.field4329 >>> 16 == -336184109 * var12.field6616) {
                        var38 = true;
                     }
                     break;
                  case 3:
                     if (-1163656551 * var18.field4329 == var12.field6616 * -336184109) {
                        var38 = true;
                     }
               }
            }

            if (var38 || !var18.field4275 || var21 < var23 && var22 < var24) {
               if (var18.field4275) {
                  if (var18.field4403) {
                     if (this.field5384.method9793((byte)104) >= var21
                        && this.field5384.method9795(543128027) >= var22
                        && this.field5384.method9793((byte)68) < var23
                        && this.field5384.method9795(676723738) < var24) {
                        var14.method9679(2112254256);
                        var12.method12150((byte)0).method12249((byte)60);
                        if (!var15) {
                           this.field5381.vmethod317(891814198);
                        }
                     }
                  } else if (var18.field4328
                     && this.field5384.method9793((byte)116) >= var21
                     && this.field5384.method9795(1693453516) >= var22
                     && this.field5384.method9793((byte)126) < var23
                     && this.field5384.method9795(1345288589) < var24) {
                     var14.method9685(-1478111027);
                  }
               }

               int var40 = this.field5384.method9793((byte)99);
               int var42 = this.field5384.method9795(559054605);
               if (classQS.method9799(this.field5384, 1784200476) != 0) {
                  var40 = this.field5384.method9803((byte)-64);
                  var42 = this.field5384.method9804(1997119720);
               }

               boolean var44 = var40 >= var21 && var42 >= var22 && var40 < var23 && var42 < var24;
               if (var18.field4334 * -90794217 == 1337) {
                  if (!this.field5383.vmethod166((byte)-88) && !var15 && var44) {
                     this.field5381.vmethod321(var40, var42, var21, var22, -972257835);
                  }
               } else if (1338 == -90794217 * var18.field4334) {
                  classNS.method8001(var18, var36, var20, (byte)106);
               } else {
                  if (1400 == var18.field4334 * -90794217) {
                     this.field5382
                        .vmethod84(774055787)
                        .method12386(var40, var42, var44, var36, var20, var18.field4249 * 1115597881, var18.field4259 * 293773697, (byte)74);
                  }

                  if (!var15 && var44) {
                     if (-90794217 * var18.field4334 == 1400) {
                        this.field5382
                           .vmethod84(1945838822)
                           .method12577(var36, var20, var18.field4249 * 1115597881, 293773697 * var18.field4259, var40, var42, -1221860810);
                     } else {
                        this.field5381.vmethod324(var18, (byte)-25);
                     }
                  }

                  if (var38) {
                     for (int var29 = 0; var29 < var18.field4312.length; var29++) {
                        boolean var30 = false;
                        boolean var31 = false;
                        if (!var30 && null != var18.field4312[var29]) {
                           for (int var32 = 0; var32 < var18.field4312[var29].length; var32++) {
                              boolean var33 = false;
                              if (null != var18.field4404) {
                                 var33 = classFA.method4540(var16, var18.field4312[var29][var32], 2010805321);
                              }

                              if (this.field5382.vmethod74((byte)58).method5062(var18.field4312[var29][var32], 1307123110) || var33) {
                                 var30 = true;
                                 if (var18.field4404 != null && var18.field4404[var29] > var13) {
                                    break;
                                 }

                                 byte var34 = var18.field4346[var29][var32];
                                 if (var34 == 0
                                    || (
                                          (var34 & 8) == 0
                                             || !classFA.method4540(var16, 86, 1771265661)
                                                && !classFA.method4540(var16, 82, -191016173)
                                                && !classFA.method4540(var16, 81, 1551555928)
                                       )
                                       && (0 == (var34 & 2) || classFA.method4540(var16, 86, 2090121774))
                                       && ((var34 & 1) == 0 || classFA.method4540(var16, 82, 1278023649))
                                       && ((var34 & 4) == 0 || classFA.method4540(var16, 81, 1197761504))) {
                                    var31 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var31) {
                           if (var29 < 10) {
                              this.field5381
                                 .vmethod329(
                                    1 + var29, -1163656551 * var18.field4329, var18.field4260 * 63131743, var18.field4319 * 2073671441, "", -1339238434
                                 );
                           } else if (var29 == 10) {
                              this.field5381.vmethod337((byte)-35);
                              String var59 = classVV.method12125(var12, var18, (byte)-49);
                              if (var59 == null) {
                                 var59 = classKK.field3615;
                              }

                              String var78 = var18.field4309 + classQY.method9847(16777215, (byte)59);
                              int var85 = var12.method12173(var18, (byte)0);
                              this.field5381
                                 .vmethod334(
                                    -1163656551 * var18.field4329,
                                    63131743 * var18.field4260,
                                    classCK.method1575(var85, -2095649936),
                                    var18.field4319 * 2073671441,
                                    var59,
                                    var78,
                                    (byte)39
                                 );
                           }

                           int var60 = var18.field4370[var29];
                           if (null == var18.field4404) {
                              var18.field4404 = new int[var18.field4312.length];
                           }

                           if (null == var18.field4371) {
                              var18.field4371 = new int[var18.field4312.length];
                           }

                           if (0 != var60) {
                              if (0 == var18.field4404[var29]) {
                                 var18.field4404[var29] = var60 + var13 + var18.field4371[var29];
                              } else {
                                 var18.field4404[var29] = var13 + var60;
                              }
                           } else {
                              var18.field4404[var29] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var30 && null != var18.field4404) {
                           var18.field4404[var29] = 0;
                        }
                     }
                  }

                  if (var18.field4275) {
                     var44 = this.field5384.method9793((byte)118) >= var21
                        && this.field5384.method9795(-2109370369) >= var22
                        && this.field5384.method9793((byte)103) < var23
                        && this.field5384.method9795(-222069661) < var24;
                     boolean var46 = (
                           classQS.method9790(this.field5384, -361602593) == 1
                              || !this.field5383.vmethod168(-164930398) && classQS.method9790(this.field5384, -361602593) == 4
                        )
                        && var44;
                     boolean var48 = (
                           classQS.method9799(this.field5384, 1784200476) == 1
                              || !this.field5383.vmethod168(-1838220262) && classQS.method9799(this.field5384, 1784200476) == 4
                        )
                        && this.field5384.method9803((byte)-87) >= var21
                        && this.field5384.method9804(1997119720) >= var22
                        && this.field5384.method9803((byte)4) < var23
                        && this.field5384.method9804(1997119720) < var24;
                     if (var48
                        && !this.field5383.vmethod156((byte)0)
                        && var12.method12157(var18, this.field5384.method9803((byte)-85) - var36, this.field5384.method9804(1997119720) - var20, 157750249)) {
                        this.field5381.vmethod343((byte)127);
                     }

                     if (Widget.method7215(var18, 1850584872)) {
                        if (var48) {
                           var14.method9664(
                              new classFM(0, -38255113 * MouseHandler.field6255 - var36, MouseHandler.field6264 * -2144333897 - var20, var18), -1687891513
                           );
                        }

                        if (var46) {
                           var14.method9664(
                              new classFM(1, MouseHandler.field6255 * -38255113 - var36, MouseHandler.field6264 * -2144333897 - var20, var18), -1923322349
                           );
                        }
                     }

                     if (-90794217 * var18.field4334 == 1400) {
                        this.field5382.vmethod84(571479845).method12389(var40, var42, var44 & var46, var44 & var48, -1687964001);
                     }

                     if (var12.method12154(-431955666)
                        && classVV.method12152(var12, (byte)-117) != var18
                        && var44
                        && classUH.method11324(var12.method12173(var18, (byte)0), (byte)-78)) {
                        var12.method12150((byte)0).method12203(var18, (byte)-54);
                     }

                     var12.method12150((byte)0).method12194(var18, var36, var20, (short)-15558);
                     if (var18.field4315) {
                        if (var44 && this.field5384.method9809((byte)-105) != 0 && var18.field4387 != null) {
                           ScriptEvent var49 = classZS.method14182(
                              classUQ.method11465(var18, 1209669318)
                                 .method14138(true, 371510532)
                                 .method14145(var18.field4387, (byte)2)
                                 .method14151(this.field5384.method9809((byte)-17), (byte)1),
                              (byte)60
                           );
                           var14.method9658(var49, 1697206599);
                        }

                        if (var12.method12154(-431955666) || this.field5383.vmethod156((byte)0)) {
                           var48 = false;
                           var46 = false;
                           var44 = false;
                        }

                        if (!var18.field4323 && var48) {
                           var18.field4323 = true;
                           if (null != var18.field4359) {
                              ScriptEvent var50 = classZS.method14182(
                                 classZS.method14148(
                                       classUQ.method11465(var18, 131335369).method14138(true, -1472899770).method14145(var18.field4359, (byte)2),
                                       1422993977 * MouseHandler.field6266 - var36,
                                       -2097630996
                                    )
                                    .method14151(1243590197 * MouseHandler.field6257 - var20, (byte)1),
                                 (byte)89
                              );
                              var14.method9658(var50, 1697206599);
                           }
                        }

                        if (var18.field4323 && var46 && null != var18.field4377) {
                           ScriptEvent var51 = classZS.method14182(
                              classZS.method14148(
                                    classUQ.method11465(var18, 1806650447).method14138(true, -340540116).method14145(var18.field4377, (byte)2),
                                    MouseHandler.field6255 * -38255113 - var36,
                                    -2092074401
                                 )
                                 .method14151(MouseHandler.field6264 * -2144333897 - var20, (byte)1),
                              (byte)101
                           );
                           var14.method9658(var51, 1697206599);
                        }

                        if (var18.field4323 && !var46) {
                           var18.field4323 = false;
                           if (var18.field4357 != null) {
                              ScriptEvent var52 = classZS.method14182(
                                 classZS.method14148(
                                       classUQ.method11465(var18, 64655907).method14138(true, 2023026715).method14145(var18.field4357, (byte)2),
                                       -38255113 * MouseHandler.field6255 - var36,
                                       -1961329802
                                    )
                                    .method14151(MouseHandler.field6264 * -2144333897 - var20, (byte)1),
                                 (byte)110
                              );
                              var14.method9661(var52, 2050667622);
                           }
                        }

                        if (var46 && var18.field4378 != null) {
                           ScriptEvent var53 = classZS.method14182(
                              classZS.method14148(
                                    classUQ.method11465(var18, 322852413).method14138(true, -1528215060).method14145(var18.field4378, (byte)2),
                                    MouseHandler.field6255 * -38255113 - var36,
                                    -1516113047
                                 )
                                 .method14151(MouseHandler.field6264 * -2144333897 - var20, (byte)1),
                              (byte)15
                           );
                           var14.method9658(var53, 1697206599);
                        }

                        if (!var18.field4322 && var44) {
                           var18.field4322 = true;
                           if (var18.field4402 != null) {
                              ScriptEvent var54 = classZS.method14182(
                                 classZS.method14148(
                                       classUQ.method11465(var18, 1784095699).method14138(true, 845187551).method14145(var18.field4402, (byte)2),
                                       -38255113 * MouseHandler.field6255 - var36,
                                       -2123085474
                                    )
                                    .method14151(MouseHandler.field6264 * -2144333897 - var20, (byte)1),
                                 (byte)22
                              );
                              var14.method9658(var54, 1697206599);
                           }
                        }

                        if (var18.field4322 && var44 && null != var18.field4286) {
                           ScriptEvent var55 = classZS.method14182(
                              classZS.method14148(
                                    classUQ.method11465(var18, -63200349).method14138(true, 202711738).method14145(var18.field4286, (byte)2),
                                    MouseHandler.field6255 * -38255113 - var36,
                                    -2075702945
                                 )
                                 .method14151(-2144333897 * MouseHandler.field6264 - var20, (byte)1),
                              (byte)81
                           );
                           var14.method9658(var55, 1697206599);
                        }

                        if (var18.field4322 && !var44) {
                           var18.field4322 = false;
                           if (var18.field4361 != null) {
                              ScriptEvent var56 = classZS.method14182(
                                 classZS.method14148(
                                       classUQ.method11465(var18, 1360563971).method14138(true, -1113485663).method14145(var18.field4361, (byte)2),
                                       -38255113 * MouseHandler.field6255 - var36,
                                       -1695340073
                                    )
                                    .method14151(MouseHandler.field6264 * -2144333897 - var20, (byte)1),
                                 (byte)105
                              );
                              var14.method9661(var56, -1639183105);
                           }
                        }

                        if (null != var18.field4343) {
                           ScriptEvent var57 = classZS.method14182(classUQ.method11465(var18, 581422148).method14145(var18.field4343, (byte)2), (byte)79);
                           classQN.method9660(var14, var57, (byte)-10);
                        }

                        classPV var58 = this.field5382.vmethod81(207462339);
                        if (var18.field4382 != null && var58.method9272((byte)-95) > -405159805 * var18.field4325) {
                           if (var18.field4280 != null && var58.method9272((byte)-83) - var18.field4325 * -405159805 <= 32) {
                              label815:
                              for (int var62 = var18.field4325 * -405159805; var62 < var58.method9272((byte)-7); var62++) {
                                 int var79 = var58.method9269(var62, -1472778680);

                                 for (int var86 = 0; var86 < var18.field4280.length; var86++) {
                                    if (var79 == var18.field4280[var86]) {
                                       ScriptEvent var35 = classZS.method14182(
                                          classUQ.method11465(var18, 2525273).method14145(var18.field4382, (byte)2), (byte)59
                                       );
                                       var14.method9658(var35, 1697206599);
                                       break label815;
                                    }
                                 }
                              }
                           } else {
                              ScriptEvent var61 = classZS.method14182(classUQ.method11465(var18, 657643735).method14145(var18.field4382, (byte)2), (byte)107);
                              var14.method9658(var61, 1697206599);
                           }

                           var18.field4325 = var58.method9272((byte)-28) * -1433629141;
                        }

                        if (var18.field4355 != null && var58.method9276(230517950) > var18.field4300 * 790413063) {
                           if (var18.field4267 != null && var58.method9276(230517950) - var18.field4300 * 790413063 <= 32) {
                              label791:
                              for (int var64 = 790413063 * var18.field4300; var64 < var58.method9276(230517950); var64++) {
                                 int var80 = var58.method9275(var64, 220101944);

                                 for (int var87 = 0; var87 < var18.field4267.length; var87++) {
                                    if (var80 == var18.field4267[var87]) {
                                       ScriptEvent var92 = classZS.method14182(
                                          classUQ.method11465(var18, 136539607).method14145(var18.field4355, (byte)2), (byte)110
                                       );
                                       var14.method9658(var92, 1697206599);
                                       break label791;
                                    }
                                 }
                              }
                           } else {
                              ScriptEvent var63 = classZS.method14182(classUQ.method11465(var18, 697495202).method14145(var18.field4355, (byte)2), (byte)41);
                              var14.method9658(var63, 1697206599);
                           }

                           var18.field4300 = var58.method9276(230517950) * -425558345;
                        }

                        if (null != var18.field4384 && var58.method9281(1288219174) > var18.field4326 * 1396002941) {
                           if (var18.field4385 != null && var58.method9281(1288219174) - 1396002941 * var18.field4326 <= 32) {
                              label767:
                              for (int var66 = 1396002941 * var18.field4326; var66 < var58.method9281(1288219174); var66++) {
                                 int var81 = var58.method9278(var66, 1065250396);

                                 for (int var88 = 0; var88 < var18.field4385.length; var88++) {
                                    if (var18.field4385[var88] == var81) {
                                       ScriptEvent var93 = classZS.method14182(
                                          classUQ.method11465(var18, 724829529).method14145(var18.field4384, (byte)2), (byte)36
                                       );
                                       var14.method9658(var93, 1697206599);
                                       break label767;
                                    }
                                 }
                              }
                           } else {
                              ScriptEvent var65 = classZS.method14182(classUQ.method11465(var18, 2060752939).method14145(var18.field4384, (byte)2), (byte)91);
                              var14.method9658(var65, 1697206599);
                           }

                           var18.field4326 = var58.method9281(1288219174) * 297445589;
                        }

                        if (classPV.method9313(var58, -176012129) > var18.field4324 * -1941419841 && var18.field4365 != null) {
                           ScriptEvent var67 = classZS.method14182(classUQ.method11465(var18, 730626900).method14145(var18.field4365, (byte)2), (byte)15);
                           var14.method9658(var67, 1697206599);
                        }

                        if (var58.method9284(-2047294149) > var18.field4324 * -1941419841 && var18.field4383 != null) {
                           ScriptEvent var68 = classZS.method14182(classUQ.method11465(var18, 507672593).method14145(var18.field4383, (byte)2), (byte)30);
                           var14.method9658(var68, 1697206599);
                        }

                        if (var58.method9286(-1983380543) > var18.field4324 * -1941419841 && var18.field4391 != null) {
                           ScriptEvent var69 = classZS.method14182(classUQ.method11465(var18, 1279220568).method14145(var18.field4391, (byte)2), (byte)86);
                           var14.method9658(var69, 1697206599);
                        }

                        if (var58.method9290(-923783653) > -1941419841 * var18.field4324 && null != var18.field4392) {
                           ScriptEvent var70 = classZS.method14182(classUQ.method11465(var18, 1683576032).method14145(var18.field4392, (byte)2), (byte)28);
                           var14.method9658(var70, 1697206599);
                        }

                        if (var58.method9292((byte)-1) > var18.field4324 * -1941419841 && null != var18.field4393) {
                           ScriptEvent var71 = classZS.method14182(classUQ.method11465(var18, 682554510).method14145(var18.field4393, (byte)2), (byte)5);
                           var14.method9658(var71, 1697206599);
                        }

                        if (var58.method9298(1389741871) > -1941419841 * var18.field4324 && null != var18.field4396) {
                           ScriptEvent var72 = classZS.method14182(classUQ.method11465(var18, 721987947).method14145(var18.field4396, (byte)2), (byte)48);
                           var14.method9658(var72, 1697206599);
                        }

                        if (var58.method9304(-2110015517) > -1941419841 * var18.field4324 && var18.field4397 != null) {
                           ScriptEvent var73 = classZS.method14182(classUQ.method11465(var18, 704467664).method14145(var18.field4397, (byte)2), (byte)30);
                           var14.method9658(var73, 1697206599);
                        }

                        if (classPV.method9308(var58, (byte)39) > var18.field4324 * -1941419841 && var18.field4394 != null) {
                           ScriptEvent var74 = classZS.method14182(classUQ.method11465(var18, 1368369539).method14145(var18.field4394, (byte)2), (byte)82);
                           var14.method9658(var74, 1697206599);
                        }

                        var18.field4324 = var58.method9267(342962976) * 1478436671;
                        if (var18.field4388 != null) {
                           classFW var75 = this.field5382.vmethod74((byte)27);

                           for (int var82 = 0; var82 < var75.method5043(-1103716758); var82++) {
                              ScriptEvent var89 = classZS.method14182(
                                 classUQ.method11465(var18, 704999611)
                                    .method14145(var18.field4388, (byte)2)
                                    .method14173(var75.method5056(var82, 2127322297), 108880585)
                                    .method14177(var75.method5060(var82, -1750243230), 390601550),
                                 (byte)122
                              );
                              var14.method9658(var89, 1697206599);
                           }
                        }

                        if (null != var18.field4389) {
                           int[] var76 = classFA.method4555(var16, -556200040);

                           for (int var83 = 0; var83 < var76.length; var83++) {
                              ScriptEvent var90 = classZS.method14182(
                                 classUQ.method11465(var18, 1508605786).method14145(var18.field4389, (byte)2).method14173(var76[var83], -1226112461), (byte)117
                              );
                              var14.method9658(var90, 1697206599);
                           }
                        }

                        if (null != var18.field4363) {
                           int[] var77 = var16.method4553(-212435337);

                           for (int var84 = 0; var84 < var77.length; var84++) {
                              ScriptEvent var91 = classZS.method14182(
                                 classUQ.method11465(var18, 2043144148).method14145(var18.field4363, (byte)2).method14173(var77[var84], 2040212231), (byte)48
                              );
                              var14.method9658(var91, 1697206599);
                           }
                        }
                     }
                  }

                  if (!var18.field4275) {
                     if (var12.method12154(-431955666) || this.field5383.vmethod156((byte)0)) {
                        continue;
                     }

                     if ((-2003253155 * var18.field4316 >= 0 || var18.field4272 * 318120869 != 0)
                        && this.field5384.method9793((byte)75) >= var21
                        && this.field5384.method9795(1732141895) >= var22
                        && this.field5384.method9793((byte)93) < var23
                        && this.field5384.method9795(-1064552944) < var24) {
                        if (var18.field4316 * -2003253155 >= 0) {
                           var12.method12112(514117950).method11929(var1[-2003253155 * var18.field4316], -1614698460);
                        } else {
                           var12.method12112(47497121).method11929(var18, -1651325217);
                        }
                     }

                     if (8 == -1510882375 * var18.field4375
                        && this.field5384.method9793((byte)55) >= var21
                        && this.field5384.method9795(1996077445) >= var22
                        && this.field5384.method9793((byte)7) < var23
                        && this.field5384.method9795(248520098) < var24) {
                        var12.method12112(302380637).method11933(var18, 1312686469);
                     }

                     if (-714521463 * var18.field4269 > 293773697 * var18.field4259) {
                        this.method9121(
                           var18,
                           var18.field4249 * 1115597881 + var36,
                           var20,
                           293773697 * var18.field4259,
                           -714521463 * var18.field4269,
                           this.field5384.method9793((byte)85),
                           this.field5384.method9795(1178516075),
                           var12,
                           2002015450
                        );
                     }
                  }

                  if (-1510882375 * var18.field4375 == 0) {
                     method9118(
                        this,
                        var1,
                        var18.field4265 * -1210177335,
                        var18.field4266 * 379541057,
                        -1163656551 * var18.field4329,
                        63131743 * var18.field4260,
                        var21,
                        var22,
                        var23,
                        var24,
                        var36 - var18.field4341 * -34809441,
                        var20 - var18.field4331 * -41424189,
                        var12,
                        var13,
                        var14,
                        (byte)-89
                     );
                     if (var18.field4340 != null) {
                        method9118(
                           this,
                           var18.field4340,
                           0,
                           var18.field4340.length - 1,
                           var18.field4329 * -1163656551,
                           -1,
                           var21,
                           var22,
                           var23,
                           var24,
                           var36 - var18.field4341 * -34809441,
                           var20 - var18.field4331 * -41424189,
                           var12,
                           var13,
                           var14,
                           (byte)-22
                        );
                     }

                     if (-1 == 63131743 * var18.field4260) {
                        InterfaceParent var47 = (InterfaceParent)var12.field6613.method13363(-1163656551 * var18.field4329);
                        if (var47 != null) {
                           if (-691218541 * var47.field5277 == 0
                              && -38255113 * MouseHandler.field6255 >= var21
                              && -2144333897 * MouseHandler.field6264 >= var22
                              && -38255113 * MouseHandler.field6255 < var23
                              && -2144333897 * MouseHandler.field6264 < var24
                              && !this.field5383.vmethod156((byte)0)) {
                              var14.method9679(1932473333);
                              var12.method12150((byte)0).method12249((byte)-21);
                              if (!var15) {
                                 this.field5381.vmethod317(891814198);
                              }
                           }

                           this.method9113(var47.field5276 * 2023647411, var21, var22, var23, var24, var36, var20, var12, var13, var14, (byte)-2);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;Lvv;B)V")
   @ObfuscatedName("ad")
   public void method9147(classQN var1, classVV var2, byte var3) {
      try {
         ScriptEvent var4 = classQN.method9671(var1, -1432447279);

         while (var4 != null) {
            ScriptEvent var5 = var4;
            var4 = classQN.method9671(var1, -1432447279);
            Widget var6 = ScriptEvent.method14092(var5, -457118805);
            if (var6.field4260 * 63131743 >= 0) {
               Widget var7 = classLY.method7375(var2, -1502647899 * var6.field4342, (byte)126);
               if (null == var7) {
                  continue;
               }

               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (var7.field4340 == null) {
                  continue;
               }

               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (63131743 * var6.field4260 >= var7.field4340.length) {
                  continue;
               }

               if (var3 == 1) {
                  return;
               }

               if (var6 != var7.field4340[var6.field4260 * 63131743]) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }
                  continue;
               }
            }

            classSZ.method10729(var5, -330603966);
         }

         var4 = classQN.method9673(var1, -1956158393);

         while (null != var4) {
            ScriptEvent var11 = var4;
            var4 = classQN.method9673(var1, 764118853);
            Widget var14 = ScriptEvent.method14092(var11, 980686676);
            if (var14.field4260 * 63131743 >= 0) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               Widget var17 = classLY.method7375(var2, -1502647899 * var14.field4342, (byte)18);
               if (null == var17) {
                  continue;
               }

               if (var3 == 1) {
                  return;
               }

               if (null == var17.field4340) {
                  continue;
               }

               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (63131743 * var14.field4260 >= var17.field4340.length) {
                  continue;
               }

               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (var14 != var17.field4340[var14.field4260 * 63131743]) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }
                  continue;
               }
            }

            classSZ.method10729(var11, -1992248587);
         }

         var4 = classQN.method9666(var1, (byte)100);

         while (var4 != null) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            ScriptEvent var12 = var4;
            var4 = classQN.method9666(var1, (byte)74);
            Widget var15 = ScriptEvent.method14092(var12, 2009836360);
            if (var15.field4260 * 63131743 >= 0) {
               Widget var18 = classLY.method7375(var2, var15.field4342 * -1502647899, (byte)44);
               if (null == var18) {
                  continue;
               }

               if (var3 == 1) {
                  return;
               }

               if (null == var18.field4340) {
                  continue;
               }

               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (63131743 * var15.field4260 >= var18.field4340.length) {
                  continue;
               }

               if (var15 != var18.field4340[63131743 * var15.field4260]) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }
                  continue;
               }
            }

            classSZ.method10729(var12, -1724521522);
         }

         boolean var13 = false;

         for (classFM var16 = var1.method9677((byte)101); null != var16; var16 = var1.method9677((byte)1)) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            if (12 == var16.field2306.field4375 * -1510882375) {
               if (var3 == 1) {
                  return;
               }

               var13 = true;
            }

            this.method9153(var16, var2, 1472436763);
         }

         if (!var13 && 1 == 1229235359 * MouseHandler.field6261) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            this.field5381.vmethod357(null, 2109787976);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "pq.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfm;Lvv;I)V")
   @ObfuscatedName("ap")
   void method9153(classFM var1, classVV var2, int var3) {
      try {
         if (var1 != null && var1.field2306 != null) {
            if (var1.field2306.field4260 * 63131743 >= 0) {
               Widget var4 = classLY.method7375(var2, -1502647899 * var1.field2306.field4342, (byte)31);
               if (null == var4) {
                  return;
               }

               if (var3 == -948608385) {
                  throw new IllegalStateException();
               }

               if (null == var4.field4340) {
                  return;
               }

               if (var3 == -948608385) {
                  throw new IllegalStateException();
               }

               if (var4.field4340.length == 0) {
                  return;
               }

               if (var3 == -948608385) {
                  throw new IllegalStateException();
               }

               if (63131743 * var1.field2306.field4260 >= var4.field4340.length) {
                  return;
               }

               if (var4.field4340[63131743 * var1.field2306.field4260] != var1.field2306) {
                  if (var3 == -948608385) {
                     return;
                  }

                  return;
               }
            }

            if (-1510882375 * var1.field2306.field4375 == 11) {
               if (var3 == -948608385) {
                  throw new IllegalStateException();
               }

               if (0 == var1.field2308 * -1735555937) {
                  if (var3 == -948608385) {
                     throw new IllegalStateException();
                  }

                  if (var1.field2306.method7247(1605458035 * var1.field2307, var1.field2305 * 213240559, 0, 0, (byte)91)) {
                     if (var3 == -948608385) {
                        throw new IllegalStateException();
                     }

                     this.field5381.vmethod354(var1.field2306, (byte)127);
                  }

                  return;
               }
            }

            if (-1510882375 * var1.field2306.field4375 == 12) {
               if (var3 == -948608385) {
                  return;
               }

               classLH var6 = var1.field2306.method7283(-619129432);
               if (var6 != null) {
                  if (var3 == -948608385) {
                     throw new IllegalStateException();
                  }

                  if (var6.method6985(-880967958)) {
                     if (var3 == -948608385) {
                        throw new IllegalStateException();
                     }

                     switch (-1735555937 * var1.field2308) {
                        case 0:
                           this.field5381.vmethod357(var1.field2306, 1750352878);
                           classLH.method6939(
                              var6,
                              1605458035 * var1.field2307,
                              var1.field2305 * 213240559,
                              classFA.method4540(this.field5382.vmethod72(-1370068174), 82, 353603741),
                              classFA.method4540(this.field5382.vmethod72(-429159985), 81, 742348860),
                              14704747
                           );
                           break;
                        case 1:
                           var6.method6942(var1.field2307 * 1605458035, 213240559 * var1.field2305, -1740986807);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "pq.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpq;Lvv;)V")
   @ObfuscatedName("ta")
   public static void method9154(classPQ var0, classVV var1) {
      if (var0 == null) {
         var0.method9098(var1);
      } else {
         classVW var2 = var1.method12150((byte)0);
         if (var2.method12209(1394014890)) {
            var2.method12205((byte)19);
            int var3 = var2.method12224((byte)34);
            int var4 = classVW.method12226(var2, (byte)-43);
            if (var2.method12255(-1519344304) && var2.method12258(718275352)) {
               Widget var5 = var2.method12213(-1767002121);
               Widget var6 = var2.method12215(-764534869);
               int var7 = var2.method12235(-375999162);
               int var8 = classVW.method12241(var2, (byte)-96);
               int var9 = var2.method12228((byte)1);
               int var10 = classVW.method12233(var2, -2113254100);
               int var11 = -38255113 * MouseHandler.field6255;
               int var12 = -2144333897 * MouseHandler.field6264;
               var11 -= var3;
               var12 -= var4;
               if (var11 < var7) {
                  var11 = var7;
               }

               if (1115597881 * var5.field4249 + var11 > 1115597881 * var6.field4249 + var7) {
                  var11 = var6.field4249 * 1115597881 + var7 - var5.field4249 * 1115597881;
               }

               if (var12 < var8) {
                  var12 = var8;
               }

               if (var12 + var5.field4259 * 293773697 > 293773697 * var6.field4259 + var8) {
                  var12 = var8 + 293773697 * var6.field4259 - 293773697 * var5.field4259;
               }

               int var13 = var11 - var9;
               int var14 = var12 - var10;
               int var15 = var5.field4368 * -782836685;
               if (var2.method12245((byte)-28) > var5.field4313 * 135384009 && (var13 > var15 || var13 < -var15 || var14 > var15 || var14 < -var15)) {
                  var2.method12252(-1811178912);
               }

               int var16 = var11 - var7 + -34809441 * var6.field4341;
               int var17 = var6.field4331 * -41424189 + (var12 - var8);
               if (var5.field4379 != null && var2.method12253((short)15876)) {
                  ScriptEvent var18 = classZS.method14182(
                     classZS.method14148(classUQ.method11465(var5, -171077490).method14145(var5.field4379, (byte)2), var16, -1278971402)
                        .method14151(var17, (byte)1),
                     (byte)56
                  );
                  classSZ.method10729(var18, -1434636174);
               }

               if (0 == MouseHandler.field6251 * 2090434187) {
                  if (var2.method12253((short)16045)) {
                     if (null != var5.field4380) {
                        ScriptEvent var21 = classZS.method14182(
                           classZS.method14148(classUQ.method11465(var5, 2055490702).method14145(var5.field4380, (byte)2), var16, -1691346852)
                              .method14151(var17, (byte)1)
                              .method14168(var2.method12218(271014207), (byte)115),
                           (byte)50
                        );
                        var0.field5381.vmethod347(var21, -1336876629);
                     }

                     var0.field5381.vmethod360(var5, var2.method12218(271014207), -1922763908);
                  } else {
                     var0.field5381.vmethod363(var9 + var3, var4 + var10, -511275367);
                  }

                  var2.method12181(2146507811);
               }
            } else {
               if (var2.method12245((byte)-22) > 1) {
                  if (!var2.method12253((short)25499) && var0.field5383.vmethod158(658002820) > 0) {
                     var0.field5381.vmethod344(var3 + var2.method12228((byte)1), var4 + classVW.method12233(var2, -1832940626), (byte)22);
                  }

                  var2.method12181(2144374889);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvv;)V")
   @ObfuscatedName("im")
   public void method9157(int var1, classVV var2) {
      Widget[][] var3 = var2.field4440;
      boolean var4 = var3 != null && var3[var1] != null;
      if (var4) {
         WidgetLoaded var5 = new WidgetLoaded();
         var5.setGroupId(var1);
         classOE.field4843.getCallbacks().post(var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;)V")
   @ObfuscatedName("at")
   public void method9096(classVV var1) {
      if (-1 != -77072447 * var1.field6612) {
         var1.method7387(var1.field6612 * -77072447, -1465814359);
         var1.field6612 = -1130371137;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILnv;)V")
   @ObfuscatedName("dp")
   public static void method9161(int var0, IterableNodeDeque var1) {
      for (ScriptEvent var2 = (ScriptEvent)var1.method8223(); var2 != null; var2 = (ScriptEvent)var1.method8224()) {
         Widget var3 = var2.method14133();
         int var4 = WidgetUtil.componentToInterface(var3.getId());
         if (var0 == var4) {
            var2.method12065();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpq;Lvv;)V")
   @ObfuscatedName("ut")
   public static void method9155(classPQ var0, classVV var1) {
      if (var0 == null) {
         var0.method9120(var1);
      }

      classVW var2 = var1.method12150((byte)0);
      if (var2.method12209(1446562899)) {
         var2.method12205((byte)19);
         int var3 = var2.method12224((byte)2);
         int var4 = classVW.method12226(var2, (byte)-13);
         if (var2.method12255(236756604) && var2.method12258(-513900158)) {
            Widget var5 = var2.method12213(-641372995);
            Widget var6 = var2.method12215(1813734215);
            int var7 = var2.method12235(-1927006611);
            int var8 = classVW.method12241(var2, (byte)-90);
            int var9 = var2.method12228((byte)1);
            int var10 = classVW.method12233(var2, -1494652093);
            int var11 = -38255113 * MouseHandler.field6255;
            int var12 = -2144333897 * MouseHandler.field6264;
            var11 -= var3;
            var12 -= var4;
            if (var11 < var7) {
               var11 = var7;
            }

            if (1115597881 * var5.field4249 + var11 > -1749394224 * var6.field4249 + var7) {
               var11 = var6.field4249 * 2073711389 + var7 - var5.field4249 * 1568979112;
            }

            if (var12 < var8) {
               var12 = var8;
            }

            if (var12 + var5.field4259 * 805641197 > 293773697 * var6.field4259 + var8) {
               var12 = var8 + 1828929115 * var6.field4259 - -130183486 * var5.field4259;
            }

            int var13 = var11 - var9;
            int var14 = var12 - var10;
            int var15 = var5.field4368 * -782836685;
            if (var2.method12245((byte)-89) > var5.field4313 * 135384009 && (var13 > var15 || var13 < -var15 || var14 > var15 || var14 < -var15)) {
               var2.method12252(-521298073);
            }

            int var16 = var11 - var7 + -34809441 * var6.field4341;
            int var17 = var6.field4331 * -41424189 + (var12 - var8);
            if (var5.field4379 != null && var2.method12253((short)5803)) {
               ScriptEvent var18 = classZS.method14182(
                  classZS.method14148(classUQ.method11465(var5, 164435947).method14145(var5.field4379, (byte)2), var16, -1574127030)
                     .method14151(var17, (byte)1),
                  (byte)37
               );
               classSZ.method10729(var18, -924254771);
            }

            if (0 == MouseHandler.field6251 * 2090434187) {
               if (var2.method12253((short)32599)) {
                  if (null != var5.field4380) {
                     ScriptEvent var21 = classZS.method14182(
                        classZS.method14148(classUQ.method11465(var5, 1538320051).method14145(var5.field4380, (byte)2), var16, -1720279542)
                           .method14151(var17, (byte)1)
                           .method14168(var2.method12218(271014207), (byte)92),
                        (byte)69
                     );
                     var0.field5381.vmethod347(var21, -1890707290);
                  }

                  var0.field5381.vmethod360(var5, var2.method12218(271014207), -2138234737);
               } else {
                  var0.field5381.vmethod363(var9 + var3, var4 + var10, -511275367);
               }

               var2.method12181(2139715829);
            }
         } else {
            if (var2.method12245((byte)-82) > 1) {
               if (!var2.method12253((short)23487) && var0.field5383.vmethod158(658002820) > 0) {
                  var0.field5381.vmethod344(var3 + var2.method12228((byte)1), var4 + classVW.method12233(var2, -1963417291), (byte)33);
               }

               var2.method12181(2124738752);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;)V")
   @ObfuscatedName("ak")
   public void method9097(classVV var1) {
      if (-1 != -77072447 * var1.field6612) {
         var1.method7387(var1.field6612 * -77072447, -1528241920);
         var1.field6612 = -1130371137;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;)V")
   @ObfuscatedName("av")
   public void method9098(classVV var1) {
      if (-1 != 1014821904 * var1.field6612) {
         var1.method7387(var1.field6612 * 1719901921, -793773478);
         var1.field6612 = -2124398386;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILvv;Lqn;)Lpk;")
   @ObfuscatedName("an")
   public InterfaceParent method9099(int var1, int var2, int var3, classVV var4, classQN var5) {
      InterfaceParent var6 = new InterfaceParent();
      var6.field5276 = var2 * 1771210363;
      var6.field5277 = -908534117 * var3;
      var4.field6613.method13372(var6, var1);
      method9145(this, var2, var4, -2044306888);
      Widget var7 = classLY.method7375(var4, var1, (byte)85);
      var4.method12167((byte)8);
      classFC.method4586(var4.field4440[var1 >> 16], var7, false, var4, var5, -1070344421);
      method9137(this, var2, var4, -1350338802);
      this.method9126(classQP.field5582, var4, -515058630);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(IIILvv;Lqn;)Lpk;")
   @ObfuscatedName("am")
   public InterfaceParent method9100(int var1, int var2, int var3, classVV var4, classQN var5) {
      InterfaceParent var6 = new InterfaceParent();
      var6.field5276 = var2 * 1771210363;
      var6.field5277 = -75682176 * var3;
      var4.field6613.method13372(var6, var1);
      method9145(this, var2, var4, -1673408409);
      Widget var7 = classLY.method7375(var4, var1, (byte)86);
      var4.method12167((byte)8);
      classFC.method4586(var4.field4440[var1 >> 16], var7, false, var4, var5, -760152405);
      method9137(this, var2, var4, -401433394);
      this.method9126(classQP.field5582, var4, 22383252);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(IIILvv;Lqn;)Lpk;")
   @ObfuscatedName("ah")
   public InterfaceParent method9101(int var1, int var2, int var3, classVV var4, classQN var5) {
      InterfaceParent var6 = new InterfaceParent();
      var6.field5276 = var2 * 1771210363;
      var6.field5277 = -784381136 * var3;
      var4.field6613.method13372(var6, var1);
      method9145(this, var2, var4, -1367449369);
      Widget var7 = classLY.method7375(var4, var1, (byte)105);
      var4.method12167((byte)8);
      classFC.method4586(var4.field4440[var1 >> 16], var7, false, var4, var5, 1290718548);
      method9137(this, var2, var4, -506615352);
      this.method9126(classQP.field5582, var4, -133586400);
      return var6;
   }

   @ObfuscatedSignature(descriptor = "(Lpk;ZLvv;)V")
   @ObfuscatedName("bx")
   public void method9104(InterfaceParent var1, boolean var2, classVV var3) {
      int var4 = 2023647411 * var1.field5276;
      var1.vmethod398();
      if (var2) {
         var3.method7387(var4, 566771252);
      }

      var3.method12128(var4, 632232789);
      this.method9126(classQP.field5582, var3, -1304817961);
   }

   @ObfuscatedSignature(descriptor = "(Lpk;ZLvv;)V")
   @ObfuscatedName("bc")
   public void method9105(InterfaceParent var1, boolean var2, classVV var3) {
      int var4 = 2023647411 * var1.field5276;
      var1.vmethod398();
      if (var2) {
         var3.method7387(var4, 288952925);
      }

      var3.method12128(var4, 1007249099);
      this.method9126(classQP.field5582, var3, -1088057362);
   }

   @ObfuscatedSignature(descriptor = "(IILvv;Lqn;)V")
   @ObfuscatedName("bp")
   public void method9109(int var1, int var2, classVV var3, classQN var4) {
      InterfaceParent var5 = (InterfaceParent)var3.field6613.method13363(var1);
      InterfaceParent var6 = (InterfaceParent)var3.field6613.method13363(var2);
      if (var6 != null) {
         method9106(this, var6, var5 == null || var5.field5276 * 2023647411 != var6.field5276 * 2023647411, var3, (byte)-88);
      }

      if (var5 != null) {
         var5.vmethod398();
         var3.field6613.method13372(var5, var2);
      }

      Widget var7 = classLY.method7375(var3, var2, (byte)92);
      if (var7 != null) {
         classFC.method4586(var3.field4440[var7.field4329 * -1163656551 >>> 16], var7, true, var3, var4, -1423804462);
      }

      this.method9126(classQP.field5582, var3, -192286525);
   }

   @ObfuscatedSignature(descriptor = "(Lvv;IIIILqn;)V")
   @ObfuscatedName("br")
   public void method9111(classVV var1, int var2, int var3, int var4, int var5, classQN var6) {
      var1.method12112(83511866).method11924((byte)2);
      classVW.method12186(var1.method12150((byte)0), -624973020);
      if (-77072447 * var1.field6612 != -1) {
         classQS.method9788(
            this.field5384,
            MouseHandler.field6251 * 2090434187,
            MouseHandler.field6255 * -38255113,
            MouseHandler.field6264 * -2144333897,
            MouseHandler.field6261 * 1229235359,
            MouseHandler.field6266 * 1422993977,
            MouseHandler.field6257 * 1243590197,
            var5,
            3392313
         );
         this.method9113(-77072447 * var1.field6612, 0, 0, var2, var3, 0, 0, var1, var4, var6, (byte)33);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;IIIILqn;)V")
   @ObfuscatedName("bm")
   public void method9112(classVV var1, int var2, int var3, int var4, int var5, classQN var6) {
      var1.method12112(256966096).method11924((byte)-103);
      classVW.method12186(var1.method12150((byte)0), -624973020);
      if (-77072447 * var1.field6612 != -1) {
         classQS.method9788(
            this.field5384,
            MouseHandler.field6251 * 2090434187,
            MouseHandler.field6255 * 15498753,
            MouseHandler.field6264 * 676434572,
            MouseHandler.field6261 * 1229235359,
            MouseHandler.field6266 * 1422993977,
            MouseHandler.field6257 * 1788344936,
            var5,
            3392313
         );
         this.method9113(21303142 * var1.field6612, 0, 0, var2, var3, 0, 0, var1, var4, var6, (byte)69);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpq;ILqp;Lvv;B)V")
   @ObfuscatedName("hx")
   public static void method9131(classPQ var0, int var1, classQP var2, classVV var3, byte var4) {
      if (var0 == null) {
         var0.method9134(var1, var2, var3, var4);
      } else {
         try {
            if (!classLY.method7381(var3, var1, 1925767696)) {
               if (var4 < 2) {
                  ;
               }
            } else {
               method9139(var0, var3.field4440[var1], var2, var3, (byte)3);
            }
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "pq.al(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILvv;Lqn;)V")
   @ObfuscatedName("ai")
   public void method9091(int var1, int var2, int var3, classVV var4, classQN var5) {
      var4.field6612 = var1 * 2017155750;
      classCN.method2551(var4.field6612 * -77072447, var2, var3, false, var4, var5, (short)217);
      method9145(this, var1, var4, -1710425320);
      method9137(this, -58062239 * var4.field6612, var4, -34121923);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIILvv;ILqn;)V")
   @ObfuscatedName("bg")
   void method9114(int var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9, classQN var10) {
      if (classLY.method7381(var8, var1, 562789226)) {
         method9118(this, var8.field4440[var1], 0, var8.field4440[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (byte)-41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpq;Lqn;Lvv;)V")
   @ObfuscatedName("rb")
   public static void method9148(classPQ var0, classQN var1, classVV var2) {
      if (var0 == null) {
         var0.method9152(var1, var2);
      } else {
         ScriptEvent var3 = classQN.method9671(var1, -1432447279);

         while (var3 != null) {
            ScriptEvent var4 = var3;
            var3 = classQN.method9671(var1, -1432447279);
            Widget var5 = ScriptEvent.method14092(var4, 385395161);
            if (var5.field4260 * 63131743 >= 0) {
               Widget var6 = classLY.method7375(var2, 410502503 * var5.field4342, (byte)44);
               if (null == var6
                  || var6.field4340 == null
                  || 63131743 * var5.field4260 >= var6.field4340.length
                  || var5 != var6.field4340[var5.field4260 * 1194219397]) {
                  continue;
               }
            }

            classSZ.method10729(var4, -1696775060);
         }

         var3 = classQN.method9673(var1, -165324379);

         while (null != var3) {
            ScriptEvent var9 = var3;
            var3 = classQN.method9673(var1, 356881506);
            Widget var12 = ScriptEvent.method14092(var9, 688429728);
            if (var12.field4260 * -885405631 >= 0) {
               Widget var15 = classLY.method7375(var2, 1439899044 * var12.field4342, (byte)122);
               if (null == var15
                  || null == var15.field4340
                  || 63131743 * var12.field4260 >= var15.field4340.length
                  || var12 != var15.field4340[var12.field4260 * -670637786]) {
                  continue;
               }
            }

            classSZ.method10729(var9, -951292320);
         }

         var3 = classQN.method9666(var1, (byte)117);

         while (var3 != null) {
            ScriptEvent var10 = var3;
            var3 = classQN.method9666(var1, (byte)17);
            Widget var13 = ScriptEvent.method14092(var10, 694927926);
            if (var13.field4260 * 389416460 >= 0) {
               Widget var16 = classLY.method7375(var2, var13.field4342 * -1502647899, (byte)94);
               if (null == var16
                  || null == var16.field4340
                  || 63131743 * var13.field4260 >= var16.field4340.length
                  || var13 != var16.field4340[1772792238 * var13.field4260]) {
                  continue;
               }
            }

            classSZ.method10729(var10, -885478793);
         }

         boolean var11 = false;

         for (classFM var14 = var1.method9677((byte)80); null != var14; var14 = var1.method9677((byte)24)) {
            if (12 == var14.field2306.field4375 * -1510882375) {
               var11 = true;
            }

            var0.method9153(var14, var2, 818237321);
         }

         if (!var11 && 1 == 1229235359 * MouseHandler.field6261) {
            var0.field5381.vmethod357(null, 2001429318);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpq;[Llw;Lqp;Lvv;B)V")
   @ObfuscatedName("kl")
   public static void method9139(classPQ var0, Widget[] var1, classQP var2, classVV var3, byte var4) {
      if (var0 == null) {
         var0.method9142(var1, var2, var3, var4);
      }

      try {
         for (int var5 = 0; var5 < var1.length; var5++) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            Widget var6 = var1[var5];
            if (null == var6) {
               if (var4 != 3) {
                  throw new IllegalStateException();
               }
            } else {
               if (0 == var6.field4375 * -1510882375) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  if (null != var6.field4340) {
                     if (var4 != 3) {
                        return;
                     }

                     method9139(var0, var6.field4340, var2, var3, (byte)3);
                  }

                  if (63131743 * var6.field4260 == -1) {
                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     InterfaceParent var7 = (InterfaceParent)var3.field6613.method13363(-1163656551 * var6.field4329);
                     if (var7 != null) {
                        if (var4 != 3) {
                           throw new IllegalStateException();
                        }

                        method9131(var0, var7.field5276 * 2023647411, var2, var3, (byte)-111);
                     }
                  }
               }

               if (classQP.field5581 == var2 && null != var6.field4406) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  ScriptEvent var9 = classZS.method14182(classUQ.method11465(var6, 1000282158).method14145(var6.field4406, (byte)2), (byte)118);
                  var0.field5381.vmethod347(var9, -1390295200);
               }

               if (var2 == classQP.field5582 && null != var6.field4395) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  if (var6.field4260 * 63131743 >= 0) {
                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     Widget var10 = classLY.method7375(var3, -1163656551 * var6.field4329, (byte)62);
                     if (null == var10) {
                        continue;
                     }

                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     if (var10.field4340 == null) {
                        continue;
                     }

                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     if (var6.field4260 * 63131743 >= var10.field4340.length) {
                        continue;
                     }

                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     if (var6 != var10.field4340[var6.field4260 * 63131743]) {
                        if (var4 != 3) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  ScriptEvent var11 = classZS.method14182(classUQ.method11465(var6, 753665777).method14145(var6.field4395, (byte)2), (byte)70);
                  var0.field5381.vmethod347(var11, -1627367532);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "pq.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpq;[Llw;IIIIIIIIIILvv;ILqn;B)V")
   @ObfuscatedName("zu")
   public static void method9118(
      classPQ var0,
      Widget[] var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      classVV var12,
      int var13,
      classQN var14,
      byte var15
   ) {
      if (var0 == null) {
         var0.method9119(var1, var2, var2, var2, var2, var2, var2, var2, var2, var2, var2, var12, var2, var14, var15);
      }

      var0.method9163(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);

      try {
         boolean var16 = var0.field5383.vmethod156((byte)0);
         classFA var17 = var0.field5382.vmethod72(94586861);

         for (int var18 = var2; var18 <= var3; var18++) {
            if (var15 >= 9) {
               throw new IllegalStateException();
            }

            Widget var19 = var1[var18];
            if (var19 == null) {
               if (var15 >= 9) {
                  throw new IllegalStateException();
               }
            } else if (-1502647899 * var19.field4342 == var4) {
               if (var15 >= 9) {
                  return;
               }

               if (653784551 * var19.field4263 == var5 && var12.method12117(var19, (byte)-45)) {
                  if (var19.field4275) {
                     if (var12.method12119(var19, (byte)0)) {
                        continue;
                     }
                  } else if (var19.field4375 * -1510882375 == 0) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     if (!var12.method12112(1645420575).method11927(var19, (byte)68)) {
                        if (var15 >= 9) {
                           return;
                        }

                        if (var12.method12119(var19, (byte)0)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }
                  }

                  if (-1510882375 * var19.field4375 == 11) {
                     if (Widget.method7273(var19, var12, var0.field5382.vmethod78((byte)7), 2146600203)) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var19.method7249(1355775728)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           classFC.method4586(var19.field4340, var19, true, var12, var14, -1178832808);
                           classMU.method7696(
                              var19.method7270(-1626603432).method7429((byte)-113), 3, var19.method7270(-1626603432).method7478(1235443706), (byte)10
                           );
                        }

                        if (null != var19.field4398) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           ScriptEvent var20 = classZS.method14182(classUQ.method11465(var19, 1821758521).method14145(var19.field4398, (byte)2), (byte)13);
                           var14.method9658(var20, 1697206599);
                        }
                     }
                  } else if (12 == var19.field4375 * -1510882375) {
                     Widget.method7304(var19, var12, 1317942401);
                  }

                  int var38 = var19.field4281 * 744286069 + var10;
                  int var21 = var11 + 1570844829 * var19.field4257;
                  int var22;
                  int var23;
                  int var24;
                  int var25;
                  if (9 == -1510882375 * var19.field4375) {
                     if (var15 >= 9) {
                        return;
                     }

                     int var26 = var38;
                     int var27 = var21;
                     int var28 = 1115597881 * var19.field4249 + var38;
                     int var29 = var21 + var19.field4259 * 293773697;
                     if (var28 < var38) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var26 = var28;
                        var28 = var38;
                     }

                     if (var29 < var21) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var27 = var29;
                        var29 = var21;
                     }

                     var28++;
                     var29++;
                     int var10000;
                     if (var26 > var6) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var10000 = var26;
                     } else {
                        var10000 = var6;
                     }

                     var22 = var10000;
                     if (var27 > var7) {
                        if (var15 >= 9) {
                           return;
                        }

                        var10000 = var27;
                     } else {
                        var10000 = var7;
                     }

                     var23 = var10000;
                     var24 = var28 < var8 ? var28 : var8;
                     if (var29 < var9) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var10000 = var29;
                     } else {
                        var10000 = var9;
                     }

                     var25 = var10000;
                  } else {
                     int var39 = var19.field4249 * 1115597881 + var38;
                     int var41 = var19.field4259 * 293773697 + var21;
                     int var98;
                     if (var38 > var6) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var98 = var38;
                     } else {
                        var98 = var6;
                     }

                     var22 = var98;
                     if (var21 > var7) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var98 = var21;
                     } else {
                        var98 = var7;
                     }

                     var23 = var98;
                     if (var39 < var8) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var98 = var39;
                     } else {
                        var98 = var8;
                     }

                     var24 = var98;
                     var25 = var41 < var9 ? var41 : var9;
                  }

                  classVW.method12192(var12.method12150((byte)0), var19, var38, var21, 2103779794);
                  boolean var40 = false;
                  if (var19.field4360) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     switch (var12.field6615 * -698898037) {
                        case 0:
                           var40 = true;
                        case 1:
                        default:
                           break;
                        case 2:
                           if (-1163656551 * var19.field4329 >>> 16 == -336184109 * var12.field6616) {
                              if (var15 >= 9) {
                                 return;
                              }

                              var40 = true;
                           }
                           break;
                        case 3:
                           if (-1163656551 * var19.field4329 == var12.field6616 * -336184109) {
                              var40 = true;
                           }
                     }
                  }

                  if (!var40) {
                     if (var15 >= 9) {
                        return;
                     }

                     if (var19.field4275) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var22 >= var24) {
                           continue;
                        }

                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var23 >= var25) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }
                  }

                  if (var19.field4275) {
                     if (var19.field4403) {
                        if (var0.field5384.method9793((byte)25) >= var22) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var0.field5384.method9795(-391255169) >= var23) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var0.field5384.method9793((byte)84) < var24 && var0.field5384.method9795(308056551) < var25) {
                                 var14.method9679(1763721559);
                                 var12.method12150((byte)0).method12249((byte)-22);
                                 if (!var16) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    var0.field5381.vmethod317(891814198);
                                 }
                              }
                           }
                        }
                     } else if (var19.field4328) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var0.field5384.method9793((byte)27) >= var22) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var0.field5384.method9795(121629884) >= var23 && var0.field5384.method9793((byte)9) < var24) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (var0.field5384.method9795(78121091) < var25) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 var14.method9685(-810050472);
                              }
                           }
                        }
                     }
                  }

                  int var42 = var0.field5384.method9793((byte)45);
                  int var44 = var0.field5384.method9795(844620399);
                  if (classQS.method9799(var0.field5384, 1784200476) != 0) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     var42 = var0.field5384.method9803((byte)60);
                     var44 = var0.field5384.method9804(1997119720);
                  }

                  boolean var101;
                  label1502: {
                     if (var42 >= var22) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var44 >= var23 && var42 < var24) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var44 < var25) {
                              if (var15 >= 9) {
                                 return;
                              }

                              var101 = true;
                              break label1502;
                           }
                        }
                     }

                     var101 = false;
                  }

                  boolean var46 = var101;
                  if (var19.field4334 * -90794217 == 1337) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     if (!var0.field5383.vmethod166((byte)-2)) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (!var16) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var46) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              var0.field5381.vmethod321(var42, var44, var22, var23, -113743310);
                           }
                        }
                     }
                  } else if (1338 == -90794217 * var19.field4334) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     classNS.method8001(var19, var38, var21, (byte)84);
                  } else {
                     if (1400 == var19.field4334 * -90794217) {
                        if (var15 >= 9) {
                           return;
                        }

                        var0.field5382
                           .vmethod84(1601996065)
                           .method12386(var42, var44, var46, var38, var21, var19.field4249 * 1115597881, var19.field4259 * 293773697, (byte)79);
                     }

                     if (!var16 && var46) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (-90794217 * var19.field4334 == 1400) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           var0.field5382
                              .vmethod84(454138964)
                              .method12577(var38, var21, var19.field4249 * 1115597881, 293773697 * var19.field4259, var42, var44, -757606060);
                        } else {
                           var0.field5381.vmethod324(var19, (byte)-37);
                        }
                     }

                     if (var40) {
                        for (int var30 = 0; var30 < var19.field4312.length; var30++) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           boolean var31 = false;
                           boolean var32 = false;
                           if (!var31) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              label1440:
                              if (null != var19.field4312[var30]) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 int var33 = 0;

                                 while (true) {
                                    if (var33 >= var19.field4312[var30].length) {
                                       break label1440;
                                    }

                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    boolean var34 = false;
                                    if (null != var19.field4404) {
                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       var34 = classFA.method4540(var17, var19.field4312[var30][var33], 1030177718);
                                    }

                                    label1528: {
                                       if (!var0.field5382.vmethod74((byte)29).method5062(var19.field4312[var30][var33], 1520410371)) {
                                          if (!var34) {
                                             break label1528;
                                          }

                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       var31 = true;
                                       if (var19.field4404 != null) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          if (var19.field4404[var30] > var13) {
                                             break label1440;
                                          }

                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       byte var35 = var19.field4346[var30][var33];
                                       if (var35 == 0) {
                                          break;
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       if ((var35 & 8) != 0) {
                                          if (classFA.method4540(var17, 86, -207049828) || classFA.method4540(var17, 82, -227637202)) {
                                             break label1528;
                                          }

                                          if (classFA.method4540(var17, 81, 53705378)) {
                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }
                                             break label1528;
                                          }
                                       }

                                       if (0 != (var35 & 2)) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          if (!classFA.method4540(var17, 86, 2129917571)) {
                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }
                                             break label1528;
                                          }
                                       }

                                       if ((var35 & 1) != 0) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          if (!classFA.method4540(var17, 82, 125044319)) {
                                             break label1528;
                                          }
                                       }

                                       if ((var35 & 4) == 0) {
                                          break;
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       if (classFA.method4540(var17, 81, -99888740)) {
                                          break;
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    var33++;
                                 }

                                 var32 = true;
                              }
                           }

                           if (var32) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var30 < 10) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 var0.field5381
                                    .vmethod329(
                                       1 + var30, -1163656551 * var19.field4329, var19.field4260 * 63131743, var19.field4319 * 2073671441, "", -510577957
                                    );
                              } else if (var30 == 10) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 var0.field5381.vmethod337((byte)-80);
                                 String var61 = classVV.method12125(var12, var19, (byte)-124);
                                 if (var61 == null) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    var61 = classKK.field3615;
                                 }

                                 String var80 = var19.field4309 + classQY.method9847(16777215, (byte)101);
                                 int var87 = var12.method12173(var19, (byte)0);
                                 var0.field5381
                                    .vmethod334(
                                       -1163656551 * var19.field4329,
                                       63131743 * var19.field4260,
                                       classCK.method1575(var87, -2126468581),
                                       var19.field4319 * 2073671441,
                                       var61,
                                       var80,
                                       (byte)104
                                    );
                              }

                              int var62 = var19.field4370[var30];
                              if (null == var19.field4404) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 var19.field4404 = new int[var19.field4312.length];
                              }

                              if (null == var19.field4371) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 var19.field4371 = new int[var19.field4312.length];
                              }

                              if (0 != var62) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == var19.field4404[var30]) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    var19.field4404[var30] = var62 + var13 + var19.field4371[var30];
                                 } else {
                                    var19.field4404[var30] = var13 + var62;
                                 }
                              } else {
                                 var19.field4404[var30] = Integer.MAX_VALUE;
                              }
                           }

                           if (!var31) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (null != var19.field4404) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 var19.field4404[var30] = 0;
                              }
                           }
                        }
                     }

                     if (var19.field4275) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        label1425: {
                           if (var0.field5384.method9793((byte)104) >= var22) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var0.field5384.method9795(1542204717) >= var23) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0.field5384.method9793((byte)62) < var24) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    if (var0.field5384.method9795(-211701125) < var25) {
                                       var101 = true;
                                       break label1425;
                                    }
                                 }
                              }
                           }

                           var101 = false;
                        }

                        label1415: {
                           label1414: {
                              var46 = var101;
                              if (classQS.method9790(var0.field5384, -361602593) != 1) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0.field5383.vmethod168(-672770366) || classQS.method9790(var0.field5384, -361602593) != 4) {
                                    break label1414;
                                 }

                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }
                              }

                              if (var46) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 var101 = true;
                                 break label1415;
                              }
                           }

                           var101 = false;
                        }

                        boolean var48;
                        label1403: {
                           label1402: {
                              var48 = var101;
                              if (classQS.method9799(var0.field5384, 1784200476) != 1) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 if (var0.field5383.vmethod168(-1931282748) || classQS.method9799(var0.field5384, 1784200476) != 4) {
                                    break label1402;
                                 }

                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }
                              }

                              if (var0.field5384.method9803((byte)13) >= var22) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0.field5384.method9804(1997119720) >= var23) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0.field5384.method9803((byte)-58) < var24) {
                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       if (var0.field5384.method9804(1997119720) < var25) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          var101 = true;
                                          break label1403;
                                       }
                                    }
                                 }
                              }
                           }

                           var101 = false;
                        }

                        boolean var50 = var101;
                        if (var50) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (!var0.field5383.vmethod156((byte)0)
                              && var12.method12157(var19, var0.field5384.method9803((byte)6) - var38, var0.field5384.method9804(1997119720) - var21, 1283450176)
                              )
                            {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              var0.field5381.vmethod343((byte)31);
                           }
                        }

                        if (Widget.method7215(var19, 525274146)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var50) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              var14.method9664(
                                 new classFM(0, -38255113 * MouseHandler.field6255 - var38, MouseHandler.field6264 * -2144333897 - var21, var19), -1243787837
                              );
                           }

                           if (var48) {
                              if (var15 >= 9) {
                                 return;
                              }

                              var14.method9664(
                                 new classFM(1, MouseHandler.field6255 * -38255113 - var38, MouseHandler.field6264 * -2144333897 - var21, var19), -1974220788
                              );
                           }
                        }

                        if (-90794217 * var19.field4334 == 1400) {
                           if (var15 >= 9) {
                              return;
                           }

                           var0.field5382.vmethod84(-587532282).method12389(var42, var44, var46 & var48, var46 & var50, -1962520718);
                        }

                        if (var12.method12154(-431955666)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (classVV.method12152(var12, (byte)-48) != var19) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var46) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (classUH.method11324(var12.method12173(var19, (byte)0), (byte)-81)) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    var12.method12150((byte)0).method12203(var19, (byte)-30);
                                 }
                              }
                           }
                        }

                        var12.method12150((byte)0).method12194(var19, var38, var21, (short)-32309);
                        if (var19.field4315) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var46 && var0.field5384.method9809((byte)-31) != 0 && var19.field4387 != null) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              ScriptEvent var51 = classZS.method14182(
                                 classUQ.method11465(var19, 541902774)
                                    .method14138(true, 754222515)
                                    .method14145(var19.field4387, (byte)2)
                                    .method14151(var0.field5384.method9809((byte)-26), (byte)1),
                                 (byte)45
                              );
                              var14.method9658(var51, 1697206599);
                           }

                           label1377: {
                              if (!var12.method12154(-431955666)) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (!var0.field5383.vmethod156((byte)0)) {
                                    break label1377;
                                 }

                                 if (var15 >= 9) {
                                    return;
                                 }
                              }

                              var50 = false;
                              var48 = false;
                              var46 = false;
                           }

                           if (!var19.field4323) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var50) {
                                 var19.field4323 = true;
                                 if (null != var19.field4359) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    ScriptEvent var52 = classZS.method14182(
                                       classZS.method14148(
                                             classUQ.method11465(var19, -82195840).method14138(true, 1196267688).method14145(var19.field4359, (byte)2),
                                             1422993977 * MouseHandler.field6266 - var38,
                                             -1985759611
                                          )
                                          .method14151(1243590197 * MouseHandler.field6257 - var21, (byte)1),
                                       (byte)121
                                    );
                                    var14.method9658(var52, 1697206599);
                                 }
                              }
                           }

                           if (var19.field4323 && var48) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (null != var19.field4377) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var53 = classZS.method14182(
                                    classZS.method14148(
                                          classUQ.method11465(var19, 447233436).method14138(true, -813950478).method14145(var19.field4377, (byte)2),
                                          MouseHandler.field6255 * -38255113 - var38,
                                          -1797422897
                                       )
                                       .method14151(MouseHandler.field6264 * -2144333897 - var21, (byte)1),
                                    (byte)98
                                 );
                                 var14.method9658(var53, 1697206599);
                              }
                           }

                           if (var19.field4323) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (!var48) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 var19.field4323 = false;
                                 if (var19.field4357 != null) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    ScriptEvent var54 = classZS.method14182(
                                       classZS.method14148(
                                             classUQ.method11465(var19, 251761525).method14138(true, -83845772).method14145(var19.field4357, (byte)2),
                                             -38255113 * MouseHandler.field6255 - var38,
                                             -1090908077
                                          )
                                          .method14151(MouseHandler.field6264 * -2144333897 - var21, (byte)1),
                                       (byte)5
                                    );
                                    var14.method9661(var54, 1513375706);
                                 }
                              }
                           }

                           if (var48) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (var19.field4378 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var55 = classZS.method14182(
                                    classZS.method14148(
                                          classUQ.method11465(var19, 292910948).method14138(true, -816691237).method14145(var19.field4378, (byte)2),
                                          MouseHandler.field6255 * -38255113 - var38,
                                          -1963929087
                                       )
                                       .method14151(MouseHandler.field6264 * -2144333897 - var21, (byte)1),
                                    (byte)98
                                 );
                                 var14.method9658(var55, 1697206599);
                              }
                           }

                           if (!var19.field4322) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var46) {
                                 var19.field4322 = true;
                                 if (var19.field4402 != null) {
                                    ScriptEvent var56 = classZS.method14182(
                                       classZS.method14148(
                                             classUQ.method11465(var19, 325458216).method14138(true, 1882697465).method14145(var19.field4402, (byte)2),
                                             -38255113 * MouseHandler.field6255 - var38,
                                             -2087208916
                                          )
                                          .method14151(MouseHandler.field6264 * -2144333897 - var21, (byte)1),
                                       (byte)105
                                    );
                                    var14.method9658(var56, 1697206599);
                                 }
                              }
                           }

                           if (var19.field4322) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (var46) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (null != var19.field4286) {
                                    ScriptEvent var57 = classZS.method14182(
                                       classZS.method14148(
                                             classUQ.method11465(var19, 1235048948).method14138(true, -1385284032).method14145(var19.field4286, (byte)2),
                                             MouseHandler.field6255 * -38255113 - var38,
                                             -1441134992
                                          )
                                          .method14151(-2144333897 * MouseHandler.field6264 - var21, (byte)1),
                                       (byte)105
                                    );
                                    var14.method9658(var57, 1697206599);
                                 }
                              }
                           }

                           if (var19.field4322 && !var46) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              var19.field4322 = false;
                              if (var19.field4361 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var58 = classZS.method14182(
                                    classZS.method14148(
                                          classUQ.method11465(var19, 449928328).method14138(true, 1982805502).method14145(var19.field4361, (byte)2),
                                          -38255113 * MouseHandler.field6255 - var38,
                                          -1869798690
                                       )
                                       .method14151(MouseHandler.field6264 * -2144333897 - var21, (byte)1),
                                    (byte)30
                                 );
                                 var14.method9661(var58, 1210007885);
                              }
                           }

                           if (null != var19.field4343) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              ScriptEvent var59 = classZS.method14182(classUQ.method11465(var19, 1089979455).method14145(var19.field4343, (byte)2), (byte)4);
                              classQN.method9660(var14, var59, (byte)-85);
                           }

                           classPV var60 = var0.field5382.vmethod81(1237108207);
                           if (var19.field4382 != null && var60.method9272((byte)-97) > -405159805 * var19.field4325) {
                              label1356: {
                                 if (var19.field4280 != null) {
                                    if (var60.method9272((byte)-61) - var19.field4325 * -405159805 <= 32) {
                                       int var64 = var19.field4325 * -405159805;

                                       while (true) {
                                          if (var64 >= var60.method9272((byte)-119)) {
                                             break label1356;
                                          }

                                          int var81 = var60.method9269(var64, -445124758);

                                          for (int var88 = 0; var88 < var19.field4280.length; var88++) {
                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }

                                             if (var81 == var19.field4280[var88]) {
                                                if (var15 >= 9) {
                                                   throw new IllegalStateException();
                                                }

                                                ScriptEvent var36 = classZS.method14182(
                                                   classUQ.method11465(var19, 341775175).method14145(var19.field4382, (byte)2), (byte)64
                                                );
                                                var14.method9658(var36, 1697206599);
                                                break label1356;
                                             }
                                          }

                                          var64++;
                                       }
                                    }

                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 ScriptEvent var63 = classZS.method14182(
                                    classUQ.method11465(var19, -146679022).method14145(var19.field4382, (byte)2), (byte)120
                                 );
                                 var14.method9658(var63, 1697206599);
                              }

                              var19.field4325 = var60.method9272((byte)0) * -1433629141;
                           }

                           if (var19.field4355 != null) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var60.method9276(230517950) > var19.field4300 * 790413063) {
                                 label1330: {
                                    if (var19.field4267 != null) {
                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       if (var60.method9276(230517950) - var19.field4300 * 790413063 <= 32) {
                                          int var66 = 790413063 * var19.field4300;

                                          while (true) {
                                             if (var66 >= var60.method9276(230517950)) {
                                                break label1330;
                                             }

                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }

                                             int var82 = var60.method9275(var66, 393471540);

                                             for (int var89 = 0; var89 < var19.field4267.length; var89++) {
                                                if (var82 == var19.field4267[var89]) {
                                                   if (var15 >= 9) {
                                                      throw new IllegalStateException();
                                                   }

                                                   ScriptEvent var94 = classZS.method14182(
                                                      classUQ.method11465(var19, 682125758).method14145(var19.field4355, (byte)2), (byte)27
                                                   );
                                                   var14.method9658(var94, 1697206599);
                                                   break label1330;
                                                }
                                             }

                                             var66++;
                                          }
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    ScriptEvent var65 = classZS.method14182(
                                       classUQ.method11465(var19, 639570543).method14145(var19.field4355, (byte)2), (byte)126
                                    );
                                    var14.method9658(var65, 1697206599);
                                 }

                                 var19.field4300 = var60.method9276(230517950) * -425558345;
                              }
                           }

                           if (null != var19.field4384) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var60.method9281(1288219174) > var19.field4326 * 1396002941) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 label1303: {
                                    if (var19.field4385 != null) {
                                       if (var15 >= 9) {
                                          return;
                                       }

                                       if (var60.method9281(1288219174) - 1396002941 * var19.field4326 <= 32) {
                                          int var68 = 1396002941 * var19.field4326;

                                          while (true) {
                                             if (var68 >= var60.method9281(1288219174)) {
                                                break label1303;
                                             }

                                             int var83 = var60.method9278(var68, -1111491396);

                                             for (int var90 = 0; var90 < var19.field4385.length; var90++) {
                                                if (var15 >= 9) {
                                                   throw new IllegalStateException();
                                                }

                                                if (var19.field4385[var90] == var83) {
                                                   if (var15 >= 9) {
                                                      throw new IllegalStateException();
                                                   }

                                                   ScriptEvent var95 = classZS.method14182(
                                                      classUQ.method11465(var19, 1366800940).method14145(var19.field4384, (byte)2), (byte)46
                                                   );
                                                   var14.method9658(var95, 1697206599);
                                                   break label1303;
                                                }
                                             }

                                             var68++;
                                          }
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    ScriptEvent var67 = classZS.method14182(
                                       classUQ.method11465(var19, -67274947).method14145(var19.field4384, (byte)2), (byte)90
                                    );
                                    var14.method9658(var67, 1697206599);
                                 }

                                 var19.field4326 = var60.method9281(1288219174) * 297445589;
                              }
                           }

                           if (classPV.method9313(var60, 2081930497) > var19.field4324 * -1941419841) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4365 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var69 = classZS.method14182(classUQ.method11465(var19, 763523364).method14145(var19.field4365, (byte)2), (byte)53);
                                 var14.method9658(var69, 1697206599);
                              }
                           }

                           if (var60.method9284(-1286699135) > var19.field4324 * -1941419841) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4383 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var70 = classZS.method14182(classUQ.method11465(var19, 1282543540).method14145(var19.field4383, (byte)2), (byte)6);
                                 var14.method9658(var70, 1697206599);
                              }
                           }

                           if (var60.method9286(-2046021315) > var19.field4324 * -1941419841) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (var19.field4391 != null) {
                                 ScriptEvent var71 = classZS.method14182(classUQ.method11465(var19, 313901820).method14145(var19.field4391, (byte)2), (byte)2);
                                 var14.method9658(var71, 1697206599);
                              }
                           }

                           if (var60.method9290(-1087972267) > -1941419841 * var19.field4324) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (null != var19.field4392) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var72 = classZS.method14182(
                                    classUQ.method11465(var19, 1736207581).method14145(var19.field4392, (byte)2), (byte)122
                                 );
                                 var14.method9658(var72, 1697206599);
                              }
                           }

                           if (var60.method9292((byte)-1) > var19.field4324 * -1941419841) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (null != var19.field4393) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var73 = classZS.method14182(classUQ.method11465(var19, 1571576681).method14145(var19.field4393, (byte)2), (byte)64);
                                 var14.method9658(var73, 1697206599);
                              }
                           }

                           if (var60.method9298(-693284363) > -1941419841 * var19.field4324) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (null != var19.field4396) {
                                 ScriptEvent var74 = classZS.method14182(classUQ.method11465(var19, 1456317932).method14145(var19.field4396, (byte)2), (byte)91);
                                 var14.method9658(var74, 1697206599);
                              }
                           }

                           if (var60.method9304(-2110015517) > -1941419841 * var19.field4324) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4397 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var75 = classZS.method14182(classUQ.method11465(var19, 707258764).method14145(var19.field4397, (byte)2), (byte)51);
                                 var14.method9658(var75, 1697206599);
                              }
                           }

                           if (classPV.method9308(var60, (byte)4) > var19.field4324 * -1941419841) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4394 != null) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 ScriptEvent var76 = classZS.method14182(classUQ.method11465(var19, 700046352).method14145(var19.field4394, (byte)2), (byte)119);
                                 var14.method9658(var76, 1697206599);
                              }
                           }

                           var19.field4324 = var60.method9267(342962976) * 1478436671;
                           if (var19.field4388 != null) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              classFW var77 = var0.field5382.vmethod74((byte)72);

                              for (int var84 = 0; var84 < var77.method5043(892616072); var84++) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 ScriptEvent var91 = classZS.method14182(
                                    classUQ.method11465(var19, 300971475)
                                       .method14145(var19.field4388, (byte)2)
                                       .method14173(var77.method5056(var84, 2069198089), 641798308)
                                       .method14177(var77.method5060(var84, -1837535319), 1410490447),
                                    (byte)126
                                 );
                                 var14.method9658(var91, 1697206599);
                              }
                           }

                           if (null != var19.field4389) {
                              int[] var78 = classFA.method4555(var17, -1056195858);

                              for (int var85 = 0; var85 < var78.length; var85++) {
                                 ScriptEvent var92 = classZS.method14182(
                                    classUQ.method11465(var19, 1154772678).method14145(var19.field4389, (byte)2).method14173(var78[var85], -1942436019),
                                    (byte)42
                                 );
                                 var14.method9658(var92, 1697206599);
                              }
                           }

                           if (null != var19.field4363) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              int[] var79 = var17.method4553(1765027070);

                              for (int var86 = 0; var86 < var79.length; var86++) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 ScriptEvent var93 = classZS.method14182(
                                    classUQ.method11465(var19, 99096592).method14145(var19.field4363, (byte)2).method14173(var79[var86], 349750555), (byte)73
                                 );
                                 var14.method9658(var93, 1697206599);
                              }
                           }
                        }
                     }

                     if (!var19.field4275) {
                        if (var12.method12154(-431955666)) {
                           continue;
                        }

                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var0.field5383.vmethod156((byte)0)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }

                        label1239: {
                           if (-2003253155 * var19.field4316 < 0) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4272 * 318120869 == 0) {
                                 break label1239;
                              }

                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (var0.field5384.method9793((byte)96) >= var22) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var0.field5384.method9795(758337458) >= var23) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0.field5384.method9793((byte)119) < var24) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0.field5384.method9795(859048038) < var25) {
                                       if (var15 >= 9) {
                                          return;
                                       }

                                       if (var19.field4316 * -2003253155 >= 0) {
                                          if (var15 >= 9) {
                                             return;
                                          }

                                          var12.method12112(252097765).method11929(var1[-2003253155 * var19.field4316], -1766608502);
                                       } else {
                                          var12.method12112(2064189916).method11929(var19, -1864074974);
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        if (8 == -1510882375 * var19.field4375) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var0.field5384.method9793((byte)35) >= var22) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (var0.field5384.method9795(1525346113) >= var23) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0.field5384.method9793((byte)81) < var24) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0.field5384.method9795(-1039273438) < var25) {
                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       var12.method12112(946925930).method11933(var19, -1106344526);
                                    }
                                 }
                              }
                           }
                        }

                        if (-714521463 * var19.field4269 > 293773697 * var19.field4259) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           var0.method9121(
                              var19,
                              var19.field4249 * 1115597881 + var38,
                              var21,
                              293773697 * var19.field4259,
                              -714521463 * var19.field4269,
                              var0.field5384.method9793((byte)120),
                              var0.field5384.method9795(1376332737),
                              var12,
                              1303753171
                           );
                        }
                     }

                     if (-1510882375 * var19.field4375 == 0) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        method9118(
                           var0,
                           var1,
                           var19.field4265 * -1210177335,
                           var19.field4266 * 379541057,
                           -1163656551 * var19.field4329,
                           63131743 * var19.field4260,
                           var22,
                           var23,
                           var24,
                           var25,
                           var38 - var19.field4341 * -34809441,
                           var21 - var19.field4331 * -41424189,
                           var12,
                           var13,
                           var14,
                           (byte)-28
                        );
                        if (var19.field4340 != null) {
                           if (var15 >= 9) {
                              return;
                           }

                           method9118(
                              var0,
                              var19.field4340,
                              0,
                              var19.field4340.length - 1,
                              var19.field4329 * -1163656551,
                              -1,
                              var22,
                              var23,
                              var24,
                              var25,
                              var38 - var19.field4341 * -34809441,
                              var21 - var19.field4331 * -41424189,
                              var12,
                              var13,
                              var14,
                              (byte)-90
                           );
                        }

                        if (-1 == 63131743 * var19.field4260) {
                           if (var15 >= 9) {
                              return;
                           }

                           InterfaceParent var49 = (InterfaceParent)var12.field6613.method13363(-1163656551 * var19.field4329);
                           if (var49 != null) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (-691218541 * var49.field5277 == 0) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 if (-38255113 * MouseHandler.field6255 >= var22) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    if (-2144333897 * MouseHandler.field6264 >= var23 && -38255113 * MouseHandler.field6255 < var24) {
                                       if (var15 >= 9) {
                                          return;
                                       }

                                       if (-2144333897 * MouseHandler.field6264 < var25 && !var0.field5383.vmethod156((byte)0)) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          var14.method9679(1806526567);
                                          var12.method12150((byte)0).method12249((byte)51);
                                          if (!var16) {
                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }

                                             var0.field5381.vmethod317(891814198);
                                          }
                                       }
                                    }
                                 }
                              }

                              var0.method9113(var49.field5276 * 2023647411, var22, var23, var24, var25, var38, var21, var12, var13, var14, (byte)9);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var37) {
         throw classEG.method3884(var37, "pq.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;)V")
   @ObfuscatedName("mk")
   public void method9120(classVV var1) {
      classVW var2 = var1.field6614;
      if (var2.field6630 != null && var2.field6627 && var2.field6621) {
         int var3 = MouseHandler.field6255 * -38255113;
         int var4 = MouseHandler.field6264 * -2144333897;
         var3 -= var2.field6623 * -314698085;
         var4 -= var2.field6624 * -542846241;
         if (var3 < var2.field6628 * -279181121) {
            var3 = var2.field6628 * -279181121;
         }

         if (var3 + var2.field6630.field4249 * 1115597881 > var2.field6628 * -279181121 + var2.field6622.field4249 * 1115597881) {
            var3 = var2.field6628 * -279181121 + var2.field6622.field4249 * 1115597881 - var2.field6630.field4249 * 1115597881;
         }

         if (var4 < var2.field6629 * -2119087041) {
            var4 = var2.field6629 * -2119087041;
         }

         if (var4 + var2.field6630.field4259 * 293773697 > var2.field6629 * -2119087041 + var2.field6622.field4259 * 293773697) {
            var4 = var2.field6629 * -2119087041 + var2.field6622.field4259 * 293773697 - var2.field6630.field4259 * 293773697;
         }

         int var5 = var3 - var2.field6631 * 985413999;
         int var6 = var4 - var2.field6632 * 1430697363;
         int var7 = var2.field6630.field4368 * -782836685;
         if (var2.field6634 * 42513585 + 1 > var2.field6630.field4313 * 135384009 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
            WidgetDrag var8 = new WidgetDrag();
            classOE.field4843.getCallbacks().post(var8);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;B)V")
   @ObfuscatedName("au")
   public void method9156(classVV var1, byte var2) {
      this.method9120(var1);

      try {
         classVW var3 = var1.method12150((byte)0);
         if (var3.method12209(1663421763)) {
            var3.method12205((byte)19);
            int var4 = var3.method12224((byte)4);
            int var5 = classVW.method12226(var3, (byte)-86);
            if (var3.method12255(1475678285)) {
               if (var2 != 0) {
                  return;
               }

               if (var3.method12258(-307638323)) {
                  Widget var6 = var3.method12213(-1516943161);
                  Widget var7 = var3.method12215(1901590269);
                  int var8 = var3.method12235(48117700);
                  int var9 = classVW.method12241(var3, (byte)-11);
                  int var10 = var3.method12228((byte)1);
                  int var11 = classVW.method12233(var3, -1597679967);
                  int var12 = -38255113 * MouseHandler.field6255;
                  int var13 = -2144333897 * MouseHandler.field6264;
                  var12 -= var4;
                  var13 -= var5;
                  if (var12 < var8) {
                     var12 = var8;
                  }

                  if (1115597881 * var6.field4249 + var12 > 1115597881 * var7.field4249 + var8) {
                     var12 = var7.field4249 * 1115597881 + var8 - var6.field4249 * 1115597881;
                  }

                  if (var13 < var9) {
                     if (var2 != 0) {
                        return;
                     }

                     var13 = var9;
                  }

                  if (var13 + var6.field4259 * 293773697 > 293773697 * var7.field4259 + var9) {
                     if (var2 != 0) {
                        throw new IllegalStateException();
                     }

                     var13 = var9 + 293773697 * var7.field4259 - 293773697 * var6.field4259;
                  }

                  int var14 = var12 - var10;
                  int var15 = var13 - var11;
                  int var16 = var6.field4368 * -782836685;
                  label139:
                  if (var3.method12245((byte)9) > var6.field4313 * 135384009) {
                     if (var14 <= var16) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        if (var14 >= -var16) {
                           if (var2 != 0) {
                              throw new IllegalStateException();
                           }

                           if (var15 <= var16) {
                              if (var2 != 0) {
                                 return;
                              }

                              if (var15 >= -var16) {
                                 break label139;
                              }

                              if (var2 != 0) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     var3.method12252(-1717841667);
                  }

                  int var17 = var12 - var8 + -34809441 * var7.field4341;
                  int var18 = var7.field4331 * -41424189 + (var13 - var9);
                  if (var6.field4379 != null) {
                     if (var2 != 0) {
                        throw new IllegalStateException();
                     }

                     if (var3.method12253((short)3311)) {
                        ScriptEvent var19 = classZS.method14182(
                           classZS.method14148(classUQ.method11465(var6, 607173943).method14145(var6.field4379, (byte)2), var17, -1985090638)
                              .method14151(var18, (byte)1),
                           (byte)120
                        );
                        classSZ.method10729(var19, -743728140);
                     }
                  }

                  if (0 == MouseHandler.field6251 * 2090434187) {
                     if (var2 != 0) {
                        throw new IllegalStateException();
                     }

                     if (var3.method12253((short)15535)) {
                        if (var2 != 0) {
                           throw new IllegalStateException();
                        }

                        if (null != var6.field4380) {
                           if (var2 != 0) {
                              throw new IllegalStateException();
                           }

                           ScriptEvent var23 = classZS.method14182(
                              classZS.method14148(classUQ.method11465(var6, 552092874).method14145(var6.field4380, (byte)2), var17, -1652226865)
                                 .method14151(var18, (byte)1)
                                 .method14168(var3.method12218(271014207), (byte)90),
                              (byte)122
                           );
                           this.field5381.vmethod347(var23, -1670979320);
                        }

                        this.field5381.vmethod360(var6, var3.method12218(271014207), -2046971986);
                     } else {
                        this.field5381.vmethod363(var10 + var4, var5 + var11, -511275367);
                     }

                     var3.method12181(2123816356);
                  }

                  return;
               }

               if (var2 != 0) {
                  throw new IllegalStateException();
               }
            }

            if (var3.method12245((byte)4) > 1) {
               if (var2 != 0) {
                  return;
               }

               if (!var3.method12253((short)2082)) {
                  if (var2 != 0) {
                     throw new IllegalStateException();
                  }

                  if (this.field5383.vmethod158(658002820) > 0) {
                     this.field5381.vmethod344(var4 + var3.method12228((byte)1), var5 + classVW.method12233(var3, -1852585598), (byte)112);
                  }
               }

               var3.method12181(2137302152);
            }
         }
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "pq.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;Lvv;)V")
   @ObfuscatedName("cu")
   public void method9149(classQN var1, classVV var2) {
      ScriptEvent var3 = classQN.method9671(var1, -1432447279);

      while (var3 != null) {
         ScriptEvent var4 = var3;
         var3 = classQN.method9671(var1, -1432447279);
         Widget var5 = ScriptEvent.method14092(var4, -764734020);
         if (var5.field4260 * 63131743 >= 0) {
            Widget var6 = classLY.method7375(var2, -1502647899 * var5.field4342, (byte)122);
            if (null == var6
               || var6.field4340 == null
               || 63131743 * var5.field4260 >= var6.field4340.length
               || var5 != var6.field4340[var5.field4260 * 63131743]) {
               continue;
            }
         }

         classSZ.method10729(var4, -1518596918);
      }

      var3 = classQN.method9673(var1, -1618186875);

      while (null != var3) {
         ScriptEvent var9 = var3;
         var3 = classQN.method9673(var1, -1672572561);
         Widget var12 = ScriptEvent.method14092(var9, -883464418);
         if (var12.field4260 * 63131743 >= 0) {
            Widget var15 = classLY.method7375(var2, -1502647899 * var12.field4342, (byte)67);
            if (null == var15
               || null == var15.field4340
               || 63131743 * var12.field4260 >= var15.field4340.length
               || var12 != var15.field4340[var12.field4260 * 63131743]) {
               continue;
            }
         }

         classSZ.method10729(var9, -919736810);
      }

      var3 = classQN.method9666(var1, (byte)117);

      while (var3 != null) {
         ScriptEvent var10 = var3;
         var3 = classQN.method9666(var1, (byte)14);
         Widget var13 = ScriptEvent.method14092(var10, 1795899255);
         if (var13.field4260 * 63131743 >= 0) {
            Widget var16 = classLY.method7375(var2, var13.field4342 * -1502647899, (byte)80);
            if (null == var16
               || null == var16.field4340
               || 63131743 * var13.field4260 >= var16.field4340.length
               || var13 != var16.field4340[63131743 * var13.field4260]) {
               continue;
            }
         }

         classSZ.method10729(var10, -1603499491);
      }

      boolean var11 = false;

      for (classFM var14 = var1.method9677((byte)110); null != var14; var14 = var1.method9677((byte)10)) {
         if (12 == var14.field2306.field4375 * -1510882375) {
            var11 = true;
         }

         this.method9153(var14, var2, -1853435511);
      }

      if (!var11 && 1 == 1229235359 * MouseHandler.field6261) {
         this.field5381.vmethod357(null, 1692985201);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILqp;Lvv;)V")
   @ObfuscatedName("bq")
   void method9132(int var1, classQP var2, classVV var3) {
      if (classLY.method7381(var3, var1, 1242108226)) {
         method9139(this, var3.field4440[var1], var2, var3, (byte)3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIIIIILvv;)V")
   @ObfuscatedName("bw")
   void method9122(Widget var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8) {
      byte var9;
      if (var8.field6619) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      var8.field6619 = false;
      if (classQS.method9790(this.field5384, -361602593) == 1 || !this.field5383.vmethod168(-1442780434) && classQS.method9790(this.field5384, -361602593) == 4
         )
       {
         if (var6 >= var2 && var6 < 16 + var2 && var7 >= var3 && var7 < var3 + 16) {
            var1.field4331 -= -299739220;
         } else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var3 + var4 - 16 && var7 < var3 + var4) {
            var1.field4331 += -299739220;
         } else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
            int var10 = var4 * (var4 - -1192116798) / var5;
            if (var10 < 8) {
               var10 = 8;
            }

            int var11 = var7 - var3 - 16 - var10 / 2;
            int var12 = var4 - 32 - var10;
            var1.field4331 = (var5 - var4) * var11 / var12 * -1864070355;
            var8.field6619 = true;
         }
      }

      if (this.field5384.method9809((byte)-92) != 0) {
         int var13 = var1.field4249 * -1919926931;
         if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
            var1.field4331 = var1.field4331 + this.field5384.method9809((byte)-17) * -150840753;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIIIIILvv;)V")
   @ObfuscatedName("bu")
   void method9123(Widget var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8) {
      byte var9;
      if (var8.field6619) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      var8.field6619 = false;
      if (classQS.method9790(this.field5384, -361602593) == 1 || !this.field5383.vmethod168(-1240968793) && classQS.method9790(this.field5384, -361602593) == 4
         )
       {
         if (var6 >= var2 && var6 < 16 + var2 && var7 >= var3 && var7 < var3 + 16) {
            var1.field4331 -= -299739220;
         } else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var3 + var4 - 16 && var7 < var3 + var4) {
            var1.field4331 += -299739220;
         } else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
            int var10 = var4 * (var4 - 32) / var5;
            if (var10 < 8) {
               var10 = 8;
            }

            int var11 = var7 - var3 - 16 - var10 / 2;
            int var12 = var4 - 32 - var10;
            var1.field4331 = (var5 - var4) * var11 / var12 * -1148676629;
            var8.field6619 = true;
         }
      }

      if (this.field5384.method9809((byte)-23) != 0) {
         int var13 = var1.field4249 * 1115597881;
         if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
            var1.field4331 = var1.field4331 + this.field5384.method9809((byte)-36) * -150840753;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqp;Lvv;)V")
   @ObfuscatedName("bb")
   public void method9127(classQP var1, classVV var2) {
      if (-1 != var2.field6612 * -77072447) {
         method9131(this, -77072447 * var2.field6612, var1, var2, (byte)-53);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpq;Lvv;IIIILqn;B)V")
   @ObfuscatedName("jj")
   public static void method9159(classPQ var0, classVV var1, int var2, int var3, int var4, int var5, classQN var6, byte var7) {
      if (var0 == null) {
         var0.method9160(var1, var2, var2, var2, var2, var6, var7);
      }

      if (client.method2268()) {
         var5 = 0;
      }

      classQN var13 = var6;
      int var12 = var5;
      int var11 = var4;
      int var10 = var3;
      int var9 = var2;
      classVV var8 = var1;
      classPQ var16 = var0;
      boolean var14 = true;

      try {
         var8.method12112(1593113106).method11924((byte)-22);
         classVW.method12186(var8.method12150((byte)0), -624973020);
         if (-77072447 * var8.field6612 == -1) {
            if (!var14) {
               throw new IllegalStateException();
            }
         } else {
            classQS.method9788(
               var16.field5384,
               MouseHandler.field6251 * 2090434187,
               MouseHandler.field6255 * -38255113,
               MouseHandler.field6264 * -2144333897,
               MouseHandler.field6261 * 1229235359,
               MouseHandler.field6266 * 1422993977,
               MouseHandler.field6257 * 1243590197,
               var12,
               3392313
            );
            var16.method9113(-77072447 * var8.field6612, 0, 0, var9, var10, 0, 0, var8, var11, var13, (byte)-8);
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "pq.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqp;Lvv;)V")
   @ObfuscatedName("bi")
   public void method9128(classQP var1, classVV var2) {
      if (-1 != var2.field6612 * -77072447) {
         method9131(this, -77072447 * var2.field6612, var1, var2, (byte)-46);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILqp;Lvv;)V")
   @ObfuscatedName("by")
   void method9133(int var1, classQP var2, classVV var3) {
      if (classLY.method7381(var3, var1, 104081870)) {
         method9139(this, var3.field4440[var1], var2, var3, (byte)3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILvv;Lqn;I)Lpk;")
   @ObfuscatedName("ae")
   public InterfaceParent method9102(int var1, int var2, int var3, classVV var4, classQN var5, int var6) {
      try {
         InterfaceParent var7 = new InterfaceParent();
         var7.field5276 = var2 * 1771210363;
         var7.field5277 = -908534117 * var3;
         var4.field6613.method13372(var7, var1);
         method9145(this, var2, var4, -1544827161);
         Widget var8 = classLY.method7375(var4, var1, (byte)113);
         var4.method12167((byte)8);
         classFC.method4586(var4.field4440[var1 >> 16], var8, false, var4, var5, 460100382);
         method9137(this, var2, var4, -1676173428);
         this.method9126(classQP.field5582, var4, -1878880951);
         return var7;
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "pq.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqp;Lvv;)V")
   @ObfuscatedName("be")
   public void method9129(classQP var1, classVV var2) {
      if (-1 != var2.field6612 * -77072447) {
         method9131(this, -77072447 * var2.field6612, var1, var2, (byte)-125);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvv;)V")
   @ObfuscatedName("bs")
   void method9135(int var1, classVV var2) {
      if (var1 != -1) {
         if (classLY.method7381(var2, var1, 1273850621)) {
            Widget[] var3 = var2.field4440[var1];

            for (int var4 = 0; var4 < var3.length; var4++) {
               Widget var5 = var3[var4];
               if (var5.field4376 != null) {
                  ScriptEvent var6 = classZS.method14182(classUQ.method11465(var5, 1116135879).method14145(var5.field4376, (byte)2), (byte)115);
                  this.field5381.vmethod349(var6, -2113542081);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpq;Llw;IIIIIILvv;)V")
   @ObfuscatedName("er")
   public static void method9124(classPQ var0, Widget var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8) {
      if (var0 == null) {
         var0.method9143(var2, var8);
      }

      byte var9;
      if (var8.field6619) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      var8.field6619 = false;
      if (classQS.method9790(var0.field5384, -361602593) == 1 || !var0.field5383.vmethod168(61514311) && classQS.method9790(var0.field5384, -361602593) == 4) {
         if (var6 >= var2 && var6 < 16 + var2 && var7 >= var3 && var7 < var3 + 16) {
            var1.field4331 -= -299739220;
         } else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var3 + var4 - 16 && var7 < var3 + var4) {
            var1.field4331 += -299739220;
         } else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
            int var10 = var4 * (var4 - 32) / var5;
            if (var10 < 8) {
               var10 = 8;
            }

            int var11 = var7 - var3 - 16 - var10 / 2;
            int var12 = var4 - 32 - var10;
            var1.field4331 = (var5 - var4) * var11 / var12 * -1148676629;
            var8.field6619 = true;
         }
      }

      if (var0.field5384.method9809((byte)-13) != 0) {
         int var13 = var1.field4249 * 1115597881;
         if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
            var1.field4331 = var1.field4331 + var0.field5384.method9809((byte)-70) * -150840753;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvv;)V")
   @ObfuscatedName("bd")
   void method9136(int var1, classVV var2) {
      if (var1 != -1) {
         if (classLY.method7381(var2, var1, 1044960666)) {
            Widget[] var3 = var2.field4440[var1];

            for (int var4 = 0; var4 < var3.length; var4++) {
               Widget var5 = var3[var4];
               if (var5.field4376 != null) {
                  ScriptEvent var6 = classZS.method14182(classUQ.method11465(var5, 1110098055).method14145(var5.field4376, (byte)2), (byte)10);
                  this.field5381.vmethod349(var6, 574387989);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;Lqp;Lvv;)V")
   @ObfuscatedName("bv")
   void method9140(Widget[] var1, classQP var2, classVV var3) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         Widget var5 = var1[var4];
         if (null != var5) {
            if (0 == var5.field4375 * -1510882375) {
               if (null != var5.field4340) {
                  method9139(this, var5.field4340, var2, var3, (byte)3);
               }

               if (63131743 * var5.field4260 == -1) {
                  InterfaceParent var6 = (InterfaceParent)var3.field6613.method13363(-1163656551 * var5.field4329);
                  if (var6 != null) {
                     method9131(this, var6.field5276 * 2023647411, var2, var3, (byte)-41);
                  }
               }
            }

            if (classQP.field5581 == var2 && null != var5.field4406) {
               ScriptEvent var7 = classZS.method14182(classUQ.method11465(var5, 1902572016).method14145(var5.field4406, (byte)2), (byte)71);
               this.field5381.vmethod347(var7, -1934930606);
            }

            if (var2 == classQP.field5582 && null != var5.field4395) {
               if (var5.field4260 * 63131743 >= 0) {
                  Widget var8 = classLY.method7375(var3, -1163656551 * var5.field4329, (byte)97);
                  if (null == var8
                     || var8.field4340 == null
                     || var5.field4260 * 63131743 >= var8.field4340.length
                     || var5 != var8.field4340[var5.field4260 * 63131743]) {
                     continue;
                  }
               }

               ScriptEvent var9 = classZS.method14182(classUQ.method11465(var5, 460157621).method14145(var5.field4395, (byte)2), (byte)105);
               this.field5381.vmethod347(var9, -1714527610);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;Lqp;Lvv;)V")
   @ObfuscatedName("bl")
   void method9141(Widget[] var1, classQP var2, classVV var3) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         Widget var5 = var1[var4];
         if (null != var5) {
            if (0 == var5.field4375 * -1510882375) {
               if (null != var5.field4340) {
                  method9139(this, var5.field4340, var2, var3, (byte)3);
               }

               if (63131743 * var5.field4260 == -1) {
                  InterfaceParent var6 = (InterfaceParent)var3.field6613.method13363(-1163656551 * var5.field4329);
                  if (var6 != null) {
                     method9131(this, var6.field5276 * 2023647411, var2, var3, (byte)-50);
                  }
               }
            }

            if (classQP.field5581 == var2 && null != var5.field4406) {
               ScriptEvent var7 = classZS.method14182(classUQ.method11465(var5, -18382433).method14145(var5.field4406, (byte)2), (byte)73);
               this.field5381.vmethod347(var7, -2081526055);
            }

            if (var2 == classQP.field5582 && null != var5.field4395) {
               if (var5.field4260 * 63131743 >= 0) {
                  Widget var8 = classLY.method7375(var3, -1163656551 * var5.field4329, (byte)96);
                  if (null == var8
                     || var8.field4340 == null
                     || var5.field4260 * 63131743 >= var8.field4340.length
                     || var5 != var8.field4340[var5.field4260 * 63131743]) {
                     continue;
                  }
               }

               ScriptEvent var9 = classZS.method14182(classUQ.method11465(var5, 1211554199).method14145(var5.field4395, (byte)2), (byte)15);
               this.field5381.vmethod347(var9, -1962788610);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvv;)V")
   @ObfuscatedName("bh")
   void method9143(int var1, classVV var2) {
      if (classLY.method7381(var2, var1, 909666691)) {
         Widget[] var3 = var2.field4440[var1];

         for (int var4 = 0; var4 < var3.length; var4++) {
            Widget var5 = var3[var4];
            if (null != var5) {
               var5.field4321 = 0;
               var5.field4327 = 0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;ILqn;)V")
   @ObfuscatedName("zw")
   public void method9163(
      Widget[] var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      classVV var12,
      int var13,
      classQN var14
   ) {
      for (int var15 = var2; var15 <= var3; var15++) {
         Widget var16 = var1[var15];
         if (var16 != null && var16.field4342 * -1502647899 == var4 && var16.field4263 * 653784551 == var5 && !var16.isSelfHidden()) {
            if (var4 != -1) {
               var16.method7312(var4);
            }

            int var17 = var10 + var16.getRelativeX();
            int var18 = var11 + var16.getRelativeY();
            var16.method7311(var17);
            var16.method7314(var18);
            if (var16.getType() == 0 && var16.getIndex() == -1) {
               InterfaceParent var19 = (InterfaceParent)var12.field6613.method13383(var16.getId());
               if (var19 != null) {
                  int var20 = var16.getId();
                  int var21 = var19.getId();
                  Widget[] var22 = classWK.field6691.field4440[var21];

                  for (Widget var26 : var22) {
                     if (var26.field4342 * -1502647899 == -1) {
                        var26.method7312(var20);
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpq;ILvv;I)V")
   @ObfuscatedName("od")
   public static void method9137(classPQ var0, int var1, classVV var2, int var3) {
      if (var0 == null) {
         var0.method9138(var1, var2, var1);
      } else {
         try {
            if (var1 == -1) {
               if (var3 >= 1377666464) {
                  throw new IllegalStateException();
               } else {
                  var0.method9157(var1, var2);
               }
            } else if (!classLY.method7381(var2, var1, 943864010)) {
               if (var3 >= 1377666464) {
                  var0.method9157(var1, var2);
               } else {
                  var0.method9157(var1, var2);
               }
            } else {
               Widget[] var4 = var2.field4440[var1];

               for (int var5 = 0; var5 < var4.length; var5++) {
                  if (var3 >= 1377666464) {
                     throw new IllegalStateException();
                  }

                  Widget var6 = var4[var5];
                  if (var6.field4376 != null) {
                     if (var3 >= 1377666464) {
                        var0.method9157(var1, var2);
                        return;
                     }

                     ScriptEvent var7 = classZS.method14182(classUQ.method11465(var6, 841725730).method14145(var6.field4376, (byte)2), (byte)8);
                     var0.field5381.vmethod349(var7, -1973248401);
                  }
               }

               var0.method9157(var1, var2);
            }
         } catch (RuntimeException var8) {
            throw classEG.method3884(var8, "pq.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;Lqp;Lvv;)V")
   @ObfuscatedName("vp")
   public void method9165(Widget[] var1, classQP var2, classVV var3) {
      method9139(this, var1, var2, var3, (byte)3);
   }

   @ObfuscatedSignature(descriptor = "(ILvv;)V")
   @ObfuscatedName("bz")
   void method9144(int var1, classVV var2) {
      if (classLY.method7381(var2, var1, 1212426477)) {
         Widget[] var3 = var2.field4440[var1];

         for (int var4 = 0; var4 < var3.length; var4++) {
            Widget var5 = var3[var4];
            if (null != var5) {
               var5.field4321 = 0;
               var5.field4327 = 0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;Lvv;)V")
   @ObfuscatedName("cr")
   public void method9150(classQN var1, classVV var2) {
      ScriptEvent var3 = classQN.method9671(var1, -1432447279);

      while (var3 != null) {
         ScriptEvent var4 = var3;
         var3 = classQN.method9671(var1, -1432447279);
         Widget var5 = ScriptEvent.method14092(var4, -306909430);
         if (var5.field4260 * 63131743 >= 0) {
            Widget var6 = classLY.method7375(var2, -1502647899 * var5.field4342, (byte)117);
            if (null == var6
               || var6.field4340 == null
               || 1300520343 * var5.field4260 >= var6.field4340.length
               || var5 != var6.field4340[var5.field4260 * -573530876]) {
               continue;
            }
         }

         classSZ.method10729(var4, -1861315236);
      }

      var3 = classQN.method9673(var1, 1488447084);

      while (null != var3) {
         ScriptEvent var9 = var3;
         var3 = classQN.method9673(var1, -375746252);
         Widget var12 = ScriptEvent.method14092(var9, -1541294117);
         if (var12.field4260 * 63131743 >= 0) {
            Widget var15 = classLY.method7375(var2, -1800430650 * var12.field4342, (byte)127);
            if (null == var15
               || null == var15.field4340
               || 63131743 * var12.field4260 >= var15.field4340.length
               || var12 != var15.field4340[var12.field4260 * 1427483844]) {
               continue;
            }
         }

         classSZ.method10729(var9, -877394763);
      }

      var3 = classQN.method9666(var1, (byte)81);

      while (var3 != null) {
         ScriptEvent var10 = var3;
         var3 = classQN.method9666(var1, (byte)46);
         Widget var13 = ScriptEvent.method14092(var10, 1111123811);
         if (var13.field4260 * 63131743 >= 0) {
            Widget var16 = classLY.method7375(var2, var13.field4342 * -1502647899, (byte)28);
            if (null == var16
               || null == var16.field4340
               || 63131743 * var13.field4260 >= var16.field4340.length
               || var13 != var16.field4340[1715870257 * var13.field4260]) {
               continue;
            }
         }

         classSZ.method10729(var10, -1238935588);
      }

      boolean var11 = false;

      for (classFM var14 = var1.method9677((byte)63); null != var14; var14 = var1.method9677((byte)57)) {
         if (12 == var14.field2306.field4375 * -1510882375) {
            var11 = true;
         }

         this.method9153(var14, var2, -929918431);
      }

      if (!var11 && 1 == 567742702 * MouseHandler.field6261) {
         this.field5381.vmethod357(null, 2016929771);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpk;ZLvv;)V")
   @ObfuscatedName("im")
   public void method9162(InterfaceParent var1, boolean var2, classVV var3) {
      classOE.field4843.getCallbacks().post(new WidgetClosed(var1.getId(), var1.getModalMode(), var2));
      if (var2) {
         int var4 = var1.getId();
         method9161(var4, client.field823.field5568);
         method9161(var4, client.field823.field5566);
         method9161(var4, client.field823.field5567);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIIIIILvv;)V")
   @ObfuscatedName("ba")
   void method9125(Widget var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8) {
      byte var9;
      if (var8.field6619) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      var8.field6619 = false;
      if (classQS.method9790(this.field5384, -361602593) == 1 || !this.field5383.vmethod168(-1534036577) && classQS.method9790(this.field5384, -361602593) == 4
         )
       {
         if (var6 >= var2 && var6 < 16 + var2 && var7 >= var3 && var7 < var3 + 16) {
            var1.field4331 -= -299739220;
         } else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var3 + var4 - 16 && var7 < var3 + var4) {
            var1.field4331 += -299739220;
         } else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
            int var10 = var4 * (var4 - 32) / var5;
            if (var10 < 8) {
               var10 = 8;
            }

            int var11 = var7 - var3 - 16 - var10 / 2;
            int var12 = var4 - 32 - var10;
            var1.field4331 = (var5 - var4) * var11 / var12 * -1148676629;
            var8.field6619 = true;
         }
      }

      if (this.field5384.method9809((byte)-102) != 0) {
         int var13 = var1.field4249 * 1115597881;
         if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
            var1.field4331 = var1.field4331 + this.field5384.method9809((byte)-52) * -150840753;
         }
      }
   }

   public classPQ(classJX var1, classJV var2, classPU var3) {
      this.field5382 = var1;
      this.field5383 = var2;
      this.field5381 = var3;
   }

   @ObfuscatedSignature(descriptor = "(Lqn;Lvv;)V")
   @ObfuscatedName("ct")
   public void method9151(classQN var1, classVV var2) {
      ScriptEvent var3 = classQN.method9671(var1, -1432447279);

      while (var3 != null) {
         ScriptEvent var4 = var3;
         var3 = classQN.method9671(var1, -1432447279);
         Widget var5 = ScriptEvent.method14092(var4, 247830512);
         if (var5.field4260 * 1988220111 >= 0) {
            Widget var6 = classLY.method7375(var2, -1502647899 * var5.field4342, (byte)39);
            if (null == var6
               || var6.field4340 == null
               || 2125812260 * var5.field4260 >= var6.field4340.length
               || var5 != var6.field4340[var5.field4260 * 63131743]) {
               continue;
            }
         }

         classSZ.method10729(var4, -2097672102);
      }

      var3 = classQN.method9673(var1, -1606946478);

      while (null != var3) {
         ScriptEvent var9 = var3;
         var3 = classQN.method9673(var1, 1534126105);
         Widget var12 = ScriptEvent.method14092(var9, -1690394113);
         if (var12.field4260 * 63131743 >= 0) {
            Widget var15 = classLY.method7375(var2, -1502647899 * var12.field4342, (byte)95);
            if (null == var15
               || null == var15.field4340
               || 63131743 * var12.field4260 >= var15.field4340.length
               || var12 != var15.field4340[var12.field4260 * 769957341]) {
               continue;
            }
         }

         classSZ.method10729(var9, -262789979);
      }

      var3 = classQN.method9666(var1, (byte)111);

      while (var3 != null) {
         ScriptEvent var10 = var3;
         var3 = classQN.method9666(var1, (byte)29);
         Widget var13 = ScriptEvent.method14092(var10, 886185647);
         if (var13.field4260 * 388722140 >= 0) {
            Widget var16 = classLY.method7375(var2, var13.field4342 * 192552022, (byte)63);
            if (null == var16
               || null == var16.field4340
               || 1463760122 * var13.field4260 >= var16.field4340.length
               || var13 != var16.field4340[63131743 * var13.field4260]) {
               continue;
            }
         }

         classSZ.method10729(var10, -863316723);
      }

      boolean var11 = false;

      for (classFM var14 = var1.method9677((byte)22); null != var14; var14 = var1.method9677((byte)76)) {
         if (12 == var14.field2306.field4375 * -1510882375) {
            var11 = true;
         }

         this.method9153(var14, var2, -1744225250);
      }

      if (!var11 && 1 == -1017308361 * MouseHandler.field6261) {
         this.field5381.vmethod357(null, 1970952563);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIILvv;ILqn;)V")
   @ObfuscatedName("bj")
   void method9115(int var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9, classQN var10) {
      if (classLY.method7381(var8, var1, 1412712374)) {
         method9118(this, var8.field4440[var1], 0, var8.field4440[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (byte)-25);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpq;Lpk;ZLvv;B)V")
   @ObfuscatedName("rl")
   public static void method9106(classPQ var0, InterfaceParent var1, boolean var2, classVV var3, byte var4) {
      if (var0 == null) {
         var0.method9107(var1, var2, var3, var4);
      }

      var0.method9162(var1, var2, var3);

      try {
         int var5 = 2023647411 * var1.field5276;
         var1.vmethod398();
         if (var2) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var3.method7387(var5, 1143930425);
         }

         var3.method12128(var5, -1118565855);
         var0.method9126(classQP.field5582, var3, -1117646971);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "pq.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpq;IIILvv;Lqn;)V")
   @ObfuscatedName("qa")
   public static void method9092(classPQ var0, int var1, int var2, int var3, classVV var4, classQN var5) {
      if (var0 == null) {
         var0.method9094(var4, var1);
      } else {
         var4.field6612 = var1 * 1130371137;
         classCN.method2551(var4.field6612 * -77072447, var2, var3, false, var4, var5, (short)217);
         method9145(var0, var1, var4, -1599344500);
         method9137(var0, -77072447 * var4.field6612, var4, -765568144);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILvv;Lqn;I)V")
   @ObfuscatedName("az")
   public void method9093(int var1, int var2, int var3, classVV var4, classQN var5, int var6) {
      try {
         var4.field6616 = var1 * 1130371137;
         classCN.method2551(var4.field6616 * -77072447, var2, var3, false, var4, var5, (short)217);
         method9145(this, var1, var4, -1584753516);
         method9137(this, -77072447 * var4.field6616, var4, 1310148379);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "pq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpq;ILvv;I)V")
   @ObfuscatedName("xx")
   public static void method9145(classPQ var0, int var1, classVV var2, int var3) {
      if (var0 == null) {
         var0.method9146(var1, var2, var1);
      }

      try {
         if (!classLY.method7381(var2, var1, 822839678)) {
            if (var3 >= -1159932592) {
               throw new IllegalStateException();
            }
         } else {
            Widget[] var4 = var2.field4440[var1];

            for (int var5 = 0; var5 < var4.length; var5++) {
               Widget var6 = var4[var5];
               if (null == var6) {
                  if (var3 >= -1159932592) {
                     throw new IllegalStateException();
                  }
               } else {
                  var6.field4321 = 0;
                  var6.field4327 = 0;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "pq.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpk;ZLvv;B)V")
   @ObfuscatedName("ab")
   public void method9107(InterfaceParent var1, boolean var2, classVV var3, byte var4) {
      this.method9162(var1, var2, var3);

      try {
         int var5 = 2023647411 * var1.field5276;
         var1.vmethod399();
         if (var2) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            var3.method7387(var5, 1143930425);
         }

         var3.method12128(var5, -1118565855);
         this.method9126(classQP.field5582, var3, -1117646971);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "pq.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;IIIILqn;B)V")
   @ObfuscatedName("as")
   public void method9160(classVV var1, int var2, int var3, int var4, int var5, classQN var6, byte var7) {
      if (client.method2107()) {
         var5 = 0;
      }

      classQN var13 = var6;
      int var12 = var5;
      int var11 = var4;
      int var10 = var3;
      int var9 = var2;
      classVV var8 = var1;
      classPQ var16 = this;
      boolean var14 = true;

      try {
         var8.method12112(1593113106).method11924((byte)-22);
         classVW.method12186(var8.method12150((byte)0), -624973020);
         if (-77072447 * var8.field6612 == -1) {
            if (!var14) {
               throw new IllegalStateException();
            }
         } else {
            classQS.method9788(
               var16.field5384,
               MouseHandler.field6264 * 2090434187,
               MouseHandler.field6261 * -38255113,
               MouseHandler.field6255 * -2144333897,
               MouseHandler.field6255 * 1229235359,
               MouseHandler.field6257 * 1422993977,
               MouseHandler.field6261 * 1243590197,
               var12,
               3392313
            );
            var16.method9113(-77072447 * var8.field6615, 0, 0, var9, var10, 0, 0, var8, var11, var13, (byte)-8);
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "pq.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;Lvv;)V")
   @ObfuscatedName("cb")
   public void method9152(classQN var1, classVV var2) {
      ScriptEvent var3 = classQN.method9671(var1, -1432447279);

      while (var3 != null) {
         ScriptEvent var4 = var3;
         var3 = classQN.method9671(var1, -1432447279);
         Widget var5 = ScriptEvent.method14092(var4, -764734020);
         if (var5.field4368 * 63131743 >= 0) {
            Widget var6 = classLY.method7375(var2, -1502647899 * var5.field4375, (byte)122);
            if (null == var6
               || var6.field4340 == null
               || 63131743 * var5.field4285 >= var6.field4340.length
               || var5 != var6.field4340[var5.field4349 * 63131743]) {
               continue;
            }
         }

         classSZ.method10729(var4, -1518596918);
      }

      var3 = classQN.method9673(var1, -1618186875);

      while (null != var3) {
         ScriptEvent var9 = var3;
         var3 = classQN.method9673(var1, -1672572561);
         Widget var12 = ScriptEvent.method14092(var9, -883464418);
         if (var12.field4288 * 63131743 >= 0) {
            Widget var15 = classLY.method7375(var2, -1502647899 * var12.field4327, (byte)67);
            if (null == var15
               || null == var15.field4340
               || 63131743 * var12.field4247 >= var15.field4340.length
               || var12 != var15.field4340[var12.field4321 * 63131743]) {
               continue;
            }
         }

         classSZ.method10729(var9, -919736810);
      }

      var3 = classQN.method9666(var1, (byte)117);

      while (var3 != null) {
         ScriptEvent var10 = var3;
         var3 = classQN.method9666(var1, (byte)14);
         Widget var13 = ScriptEvent.method14092(var10, 1795899255);
         if (var13.field4242 * 63131743 >= 0) {
            Widget var16 = classLY.method7375(var2, var13.field4326 * -1502647899, (byte)80);
            if (null == var16
               || null == var16.field4340
               || 63131743 * var13.field4292 >= var16.field4340.length
               || var13 != var16.field4340[63131743 * var13.field4320]) {
               continue;
            }
         }

         classSZ.method10729(var10, -1603499491);
      }

      boolean var11 = false;

      for (classFM var14 = var1.method9677((byte)110); null != var14; var14 = var1.method9677((byte)10)) {
         if (12 == var14.field2306.field4321 * -1510882375) {
            var11 = true;
         }

         this.method9153(var14, var2, -1853435511);
      }

      if (!var11 && 1 == 1229235359 * MouseHandler.field6255) {
         this.field5381.vmethod357(null, 1692985201);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILqp;Lvv;B)V")
   @ObfuscatedName("al")
   void method9134(int var1, classQP var2, classVV var3, byte var4) {
      try {
         if (!classLY.method7381(var3, var1, 1925767696)) {
            if (var4 < 2) {
               ;
            }
         } else {
            method9139(this, var3.field4440[var1], var2, var3, (byte)3);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "pq.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpq;IIIIIIILvv;ILqn;)V")
   @ObfuscatedName("ra")
   public static void method9116(classPQ var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, classVV var8, int var9, classQN var10) {
      if (var0 == null) {
         var0.method9115(var1, var1, var1, var1, var1, var1, var1, var8, var1, var10);
      }

      if (classLY.method7381(var8, var1, 1412712374)) {
         method9118(var0, var8.field4440[var1], 0, var8.field4440[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (byte)-25);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpk;ZLvv;)V")
   @ObfuscatedName("jv")
   public void method9166(InterfaceParent var1, boolean var2, classVV var3) {
      method9106(this, var1, var2, var3, (byte)-113);
   }

   @ObfuscatedSignature(descriptor = "(ILvv;I)V")
   @ObfuscatedName("aj")
   void method9146(int var1, classVV var2, int var3) {
      try {
         if (!classLY.method7381(var2, var1, 822839678)) {
            if (var3 >= -1159932592) {
               throw new IllegalStateException();
            }
         } else {
            Widget[] var4 = var2.field4440[var1];

            for (int var5 = 0; var5 < var4.length; var5++) {
               Widget var6 = var4[var5];
               if (null == var6) {
                  if (var3 >= -1159932592) {
                     throw new IllegalStateException();
                  }
               } else {
                  var6.field4295 = 0;
                  var6.field4310 = 0;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "pq.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvv;I)V")
   @ObfuscatedName("aq")
   void method9138(int var1, classVV var2, int var3) {
      try {
         if (var1 == -1) {
            if (var3 >= 1377666464) {
               throw new IllegalStateException();
            } else {
               this.method9157(var1, var2);
            }
         } else if (!classLY.method7381(var2, var1, 943864010)) {
            if (var3 >= 1377666464) {
               this.method9157(var1, var2);
            } else {
               this.method9157(var1, var2);
            }
         } else {
            Widget[] var4 = var2.field4440[var1];

            for (int var5 = 0; var5 < var4.length; var5++) {
               if (var3 >= 1377666464) {
                  throw new IllegalStateException();
               }

               Widget var6 = var4[var5];
               if (var6.field4388 != null) {
                  if (var3 >= 1377666464) {
                     this.method9157(var1, var2);
                     return;
                  }

                  ScriptEvent var7 = classZS.method14182(classUQ.method11465(var6, 841725730).method14145(var6.field4382, (byte)2), (byte)8);
                  this.field5381.vmethod349(var7, -1973248401);
               }
            }

            this.method9157(var1, var2);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "pq.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIIIIILvv;ILqn;B)V")
   @ObfuscatedName("ac")
   void method9119(
      Widget[] var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      classVV var12,
      int var13,
      classQN var14,
      byte var15
   ) {
      this.method9163(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);

      try {
         boolean var16 = this.field5383.vmethod156((byte)0);
         classFA var17 = this.field5382.vmethod72(94586861);

         for (int var18 = var2; var18 <= var3; var18++) {
            if (var15 >= 9) {
               throw new IllegalStateException();
            }

            Widget var19 = var1[var18];
            if (var19 == null) {
               if (var15 >= 9) {
                  throw new IllegalStateException();
               }
            } else if (-1502647899 * var19.field4303 == var4) {
               if (var15 >= 9) {
                  return;
               }

               if (653784551 * var19.field4335 == var5 && var12.method12119(var19, (byte)-45)) {
                  if (var19.field4373) {
                     if (var12.method12170(var19, (byte)0)) {
                        continue;
                     }
                  } else if (var19.field4284 * -1510882375 == 0) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     if (!var12.method12112(1645420575).method11927(var19, (byte)68)) {
                        if (var15 >= 9) {
                           return;
                        }

                        if (var12.method12170(var19, (byte)0)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }
                  }

                  if (-1510882375 * var19.field4329 == 11) {
                     if (Widget.method7273(var19, var12, this.field5382.vmethod78((byte)7), 2146600203)) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var19.method7219(1355775728)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           classFC.method4586(var19.field4340, var19, true, var12, var14, -1178832808);
                           classMU.method7696(
                              var19.method7270(-1626603432).method7429((byte)-113), 3, var19.method7270(-1626603432).method7469(1235443706), (byte)10
                           );
                        }

                        if (null != var19.field4365) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           ScriptEvent var20 = classZS.method14182(classUQ.method11465(var19, 1821758521).method14145(var19.field4355, (byte)2), (byte)13);
                           var14.method9658(var20, 1697206599);
                        }
                     }
                  } else if (12 == var19.field4294 * -1510882375) {
                     Widget.method7304(var19, var12, 1317942401);
                  }

                  int var38 = var19.field4266 * 744286069 + var10;
                  int var21 = var11 + 1570844829 * var19.field4316;
                  int var22;
                  int var23;
                  int var24;
                  int var25;
                  if (9 == -1510882375 * var19.field4284) {
                     if (var15 >= 9) {
                        return;
                     }

                     int var26 = var38;
                     int var27 = var21;
                     int var28 = 1115597881 * var19.field4250 + var38;
                     int var29 = var21 + var19.field4304 * 293773697;
                     if (var28 < var38) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var26 = var28;
                        var28 = var38;
                     }

                     if (var29 < var21) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var27 = var29;
                        var29 = var21;
                     }

                     var28++;
                     var29++;
                     int var10000;
                     if (var26 > var6) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var10000 = var26;
                     } else {
                        var10000 = var6;
                     }

                     var22 = var10000;
                     if (var27 > var7) {
                        if (var15 >= 9) {
                           return;
                        }

                        var10000 = var27;
                     } else {
                        var10000 = var7;
                     }

                     var23 = var10000;
                     var24 = var28 < var8 ? var28 : var8;
                     if (var29 < var9) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var10000 = var29;
                     } else {
                        var10000 = var9;
                     }

                     var25 = var10000;
                  } else {
                     int var39 = var19.field4326 * 1115597881 + var38;
                     int var41 = var19.field4266 * 293773697 + var21;
                     int var98;
                     if (var38 > var6) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var98 = var38;
                     } else {
                        var98 = var6;
                     }

                     var22 = var98;
                     if (var21 > var7) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var98 = var21;
                     } else {
                        var98 = var7;
                     }

                     var23 = var98;
                     if (var39 < var8) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        var98 = var39;
                     } else {
                        var98 = var8;
                     }

                     var24 = var98;
                     var25 = var41 < var9 ? var41 : var9;
                  }

                  classVW.method12192(var12.method12150((byte)0), var19, var38, var21, 2103779794);
                  boolean var40 = false;
                  if (var19.field4289) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     switch (var12.field6615 * -698898037) {
                        case 0:
                           var40 = true;
                        case 1:
                        default:
                           break;
                        case 2:
                           if (-1163656551 * var19.field4265 >>> 16 == -336184109 * var12.field6615) {
                              if (var15 >= 9) {
                                 return;
                              }

                              var40 = true;
                           }
                           break;
                        case 3:
                           if (-1163656551 * var19.field4281 == var12.field6616 * -336184109) {
                              var40 = true;
                           }
                     }
                  }

                  if (!var40) {
                     if (var15 >= 9) {
                        return;
                     }

                     if (var19.field4373) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var22 >= var24) {
                           continue;
                        }

                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var23 >= var25) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }
                  }

                  if (var19.field4282) {
                     if (var19.field4323) {
                        if (this.field5384.method9793((byte)25) >= var22) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (this.field5384.method9804(-391255169) >= var23) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (this.field5384.method9793((byte)84) < var24 && this.field5384.method9804(308056551) < var25) {
                                 var14.method9679(1763721559);
                                 var12.method12150((byte)0).method12249((byte)-22);
                                 if (!var16) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    this.field5381.vmethod317(891814198);
                                 }
                              }
                           }
                        }
                     } else if (var19.field4352) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (this.field5384.method9793((byte)27) >= var22) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (this.field5384.method9804(121629884) >= var23 && this.field5384.method9809((byte)9) < var24) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (this.field5384.method9804(78121091) < var25) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 var14.method9682(-810050472);
                              }
                           }
                        }
                     }
                  }

                  int var42 = this.field5384.method9809((byte)45);
                  int var44 = this.field5384.method9795(844620399);
                  if (classQS.method9799(this.field5384, 1784200476) != 0) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     var42 = this.field5384.method9793((byte)60);
                     var44 = this.field5384.method9795(1997119720);
                  }

                  boolean var101;
                  label1500: {
                     if (var42 >= var22) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (var44 >= var23 && var42 < var24) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var44 < var25) {
                              if (var15 >= 9) {
                                 return;
                              }

                              var101 = true;
                              break label1500;
                           }
                        }
                     }

                     var101 = false;
                  }

                  boolean var46 = var101;
                  if (var19.field4288 * -90794217 == 1337) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     if (!this.field5383.vmethod166((byte)-2)) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (!var16) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var46) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              this.field5381.vmethod321(var42, var44, var22, var23, -113743310);
                           }
                        }
                     }
                  } else if (1338 == -90794217 * var19.field4374) {
                     if (var15 >= 9) {
                        throw new IllegalStateException();
                     }

                     classNS.method8001(var19, var38, var21, (byte)84);
                  } else {
                     if (1400 == var19.field4321 * -90794217) {
                        if (var15 >= 9) {
                           return;
                        }

                        this.field5382
                           .vmethod84(1601996065)
                           .method12386(var42, var44, var46, var38, var21, var19.field4349 * 1115597881, var19.field4277 * 293773697, (byte)79);
                     }

                     if (!var16 && var46) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (-90794217 * var19.field4296 == 1400) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           this.field5382
                              .vmethod84(454138964)
                              .method12577(var38, var21, var19.field4338 * 1115597881, 293773697 * var19.field4245, var42, var44, -757606060);
                        } else {
                           this.field5381.vmethod324(var19, (byte)-37);
                        }
                     }

                     if (var40) {
                        for (int var30 = 0; var30 < var19.field4346.length; var30++) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           boolean var31 = false;
                           boolean var32 = false;
                           if (!var31) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              label1438:
                              if (null != var19.field4312[var30]) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 int var33 = 0;

                                 while (true) {
                                    if (var33 >= var19.field4346[var30].length) {
                                       break label1438;
                                    }

                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    boolean var34 = false;
                                    if (null != var19.field4404) {
                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       var34 = classFA.method4540(var17, var19.field4312[var30][var33], 1030177718);
                                    }

                                    label1523: {
                                       if (!this.field5382.vmethod74((byte)29).method5062(var19.field4312[var30][var33], 1520410371)) {
                                          if (!var34) {
                                             break label1523;
                                          }

                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       var31 = true;
                                       if (var19.field4404 != null) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          if (var19.field4372[var30] > var13) {
                                             break label1438;
                                          }

                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       byte var35 = var19.field4346[var30][var33];
                                       if (var35 == 0) {
                                          break;
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       if ((var35 & 8) != 0) {
                                          if (classFA.method4540(var17, 86, -207049828) || classFA.method4540(var17, 82, -227637202)) {
                                             break label1523;
                                          }

                                          if (classFA.method4540(var17, 81, 53705378)) {
                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }
                                             break label1523;
                                          }
                                       }

                                       if (0 != (var35 & 2)) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          if (!classFA.method4540(var17, 86, 2129917571)) {
                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }
                                             break label1523;
                                          }
                                       }

                                       if ((var35 & 1) != 0) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          if (!classFA.method4540(var17, 82, 125044319)) {
                                             break label1523;
                                          }
                                       }

                                       if ((var35 & 4) == 0) {
                                          break;
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       if (classFA.method4540(var17, 81, -99888740)) {
                                          break;
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    var33++;
                                 }

                                 var32 = true;
                              }
                           }

                           if (var32) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var30 < 10) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 this.field5381
                                    .vmethod329(
                                       1 + var30, -1163656551 * var19.field4331, var19.field4374 * 63131743, var19.field4331 * 2073671441, "", -510577957
                                    );
                              } else if (var30 == 10) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 this.field5381.vmethod337((byte)-80);
                                 String var61 = classVV.method12125(var12, var19, (byte)-124);
                                 if (var61 == null) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    var61 = classKK.field3843;
                                 }

                                 String var80 = var19.field4318 + classQY.method9847(16777215, (byte)101);
                                 int var87 = var12.method12173(var19, (byte)0);
                                 this.field5381
                                    .vmethod334(
                                       -1163656551 * var19.field4252,
                                       63131743 * var19.field4269,
                                       classCK.method1575(var87, -2126468581),
                                       var19.field4257 * 2073671441,
                                       var61,
                                       var80,
                                       (byte)104
                                    );
                              }

                              int var62 = var19.field4385[var30];
                              if (null == var19.field4390) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 var19.field4385 = new int[var19.field4312.length];
                              }

                              if (null == var19.field4390) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 var19.field4371 = new int[var19.field4346.length];
                              }

                              if (0 != var62) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == var19.field4390[var30]) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    var19.field4370[var30] = var62 + var13 + var19.field4280[var30];
                                 } else {
                                    var19.field4390[var30] = var13 + var62;
                                 }
                              } else {
                                 var19.field4372[var30] = Integer.MAX_VALUE;
                              }
                           }

                           if (!var31) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (null != var19.field4372) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 var19.field4370[var30] = 0;
                              }
                           }
                        }
                     }

                     if (var19.field4322) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        label1423: {
                           if (this.field5384.method9803((byte)104) >= var22) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (this.field5384.method9795(1542204717) >= var23) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (this.field5384.method9809((byte)62) < var24) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    if (this.field5384.method9795(-211701125) < var25) {
                                       var101 = true;
                                       break label1423;
                                    }
                                 }
                              }
                           }

                           var101 = false;
                        }

                        label1413: {
                           label1412: {
                              var46 = var101;
                              if (classQS.method9790(this.field5384, -361602593) != 1) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (this.field5383.vmethod168(-672770366) || classQS.method9790(this.field5384, -361602593) != 4) {
                                    break label1412;
                                 }

                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }
                              }

                              if (var46) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 var101 = true;
                                 break label1413;
                              }
                           }

                           var101 = false;
                        }

                        boolean var48;
                        label1401: {
                           label1400: {
                              var48 = var101;
                              if (classQS.method9799(this.field5384, 1784200476) != 1) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 if (this.field5383.vmethod168(-1931282748) || classQS.method9799(this.field5384, 1784200476) != 4) {
                                    break label1400;
                                 }

                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }
                              }

                              if (this.field5384.method9809((byte)13) >= var22) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (this.field5384.method9804(1997119720) >= var23) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    if (this.field5384.method9793((byte)-58) < var24) {
                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       if (this.field5384.method9795(1997119720) < var25) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          var101 = true;
                                          break label1401;
                                       }
                                    }
                                 }
                              }
                           }

                           var101 = false;
                        }

                        boolean var50 = var101;
                        if (var50) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (!this.field5383.vmethod156((byte)0)
                              && var12.method12157(var19, this.field5384.method9793((byte)6) - var38, this.field5384.method9795(1997119720) - var21, 1283450176)
                              )
                            {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              this.field5381.vmethod343((byte)31);
                           }
                        }

                        if (Widget.method7215(var19, 525274146)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var50) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              var14.method9664(
                                 new classFM(0, -38255113 * MouseHandler.field6257 - var38, MouseHandler.field6261 * -2144333897 - var21, var19), -1243787837
                              );
                           }

                           if (var48) {
                              if (var15 >= 9) {
                                 return;
                              }

                              var14.method9664(
                                 new classFM(1, MouseHandler.field6257 * -38255113 - var38, MouseHandler.field6257 * -2144333897 - var21, var19), -1974220788
                              );
                           }
                        }

                        if (-90794217 * var19.field4274 == 1400) {
                           if (var15 >= 9) {
                              return;
                           }

                           this.field5382.vmethod84(-587532282).method12389(var42, var44, var46 & var48, var46 & var50, -1962520718);
                        }

                        if (var12.method12154(-431955666)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (classVV.method12152(var12, (byte)-48) != var19) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var46) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (classUH.method11324(var12.method12173(var19, (byte)0), (byte)-81)) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    var12.method12150((byte)0).method12203(var19, (byte)-30);
                                 }
                              }
                           }
                        }

                        var12.method12150((byte)0).method12194(var19, var38, var21, (short)-32309);
                        if (var19.field4314) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (var46 && this.field5384.method9803((byte)-31) != 0 && var19.field4365 != null) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              ScriptEvent var51 = classZS.method14182(
                                 classUQ.method11465(var19, 541902774)
                                    .method14138(true, 754222515)
                                    .method14145(var19.field4394, (byte)2)
                                    .method14151(this.field5384.method9803((byte)-26), (byte)1),
                                 (byte)45
                              );
                              var14.method9658(var51, 1697206599);
                           }

                           label1375: {
                              if (!var12.method12154(-431955666)) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (!this.field5383.vmethod156((byte)0)) {
                                    break label1375;
                                 }

                                 if (var15 >= 9) {
                                    return;
                                 }
                              }

                              var50 = false;
                              var48 = false;
                              var46 = false;
                           }

                           if (!var19.field4322) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var50) {
                                 var19.field4298 = true;
                                 if (null != var19.field4383) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    ScriptEvent var52 = classZS.method14182(
                                       classZS.method14148(
                                             classUQ.method11465(var19, -82195840).method14138(true, 1196267688).method14145(var19.field4381, (byte)2),
                                             1422993977 * MouseHandler.field6264 - var38,
                                             -1985759611
                                          )
                                          .method14151(1243590197 * MouseHandler.field6255 - var21, (byte)1),
                                       (byte)121
                                    );
                                    var14.method9658(var52, 1697206599);
                                 }
                              }
                           }

                           if (var19.field4315 && var48) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (null != var19.field4392) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var53 = classZS.method14182(
                                    classZS.method14148(
                                          classUQ.method11465(var19, 447233436).method14138(true, -813950478).method14145(var19.field4395, (byte)2),
                                          MouseHandler.field6261 * -38255113 - var38,
                                          -1797422897
                                       )
                                       .method14151(MouseHandler.field6255 * -2144333897 - var21, (byte)1),
                                    (byte)98
                                 );
                                 var14.method9658(var53, 1697206599);
                              }
                           }

                           if (var19.field4328) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (!var48) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 var19.field4278 = false;
                                 if (var19.field4392 != null) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    ScriptEvent var54 = classZS.method14182(
                                       classZS.method14148(
                                             classUQ.method11465(var19, 251761525).method14138(true, -83845772).method14145(var19.field4254, (byte)2),
                                             -38255113 * MouseHandler.field6257 - var38,
                                             -1090908077
                                          )
                                          .method14151(MouseHandler.field6261 * -2144333897 - var21, (byte)1),
                                       (byte)5
                                    );
                                    var14.method9661(var54, 1513375706);
                                 }
                              }
                           }

                           if (var48) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (var19.field4396 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var55 = classZS.method14182(
                                    classZS.method14148(
                                          classUQ.method11465(var19, 292910948).method14138(true, -816691237).method14145(var19.field4397, (byte)2),
                                          MouseHandler.field6257 * -38255113 - var38,
                                          -1963929087
                                       )
                                       .method14151(MouseHandler.field6251 * -2144333897 - var21, (byte)1),
                                    (byte)98
                                 );
                                 var14.method9658(var55, 1697206599);
                              }
                           }

                           if (!var19.field4315) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var46) {
                                 var19.field4278 = true;
                                 if (var19.field4357 != null) {
                                    ScriptEvent var56 = classZS.method14182(
                                       classZS.method14148(
                                             classUQ.method11465(var19, 325458216).method14138(true, 1882697465).method14145(var19.field4380, (byte)2),
                                             -38255113 * MouseHandler.field6251 - var38,
                                             -2087208916
                                          )
                                          .method14151(MouseHandler.field6251 * -2144333897 - var21, (byte)1),
                                       (byte)105
                                    );
                                    var14.method9658(var56, 1697206599);
                                 }
                              }
                           }

                           if (var19.field4297) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (var46) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (null != var19.field4376) {
                                    ScriptEvent var57 = classZS.method14182(
                                       classZS.method14148(
                                             classUQ.method11465(var19, 1235048948).method14138(true, -1385284032).method14145(var19.field4355, (byte)2),
                                             MouseHandler.field6251 * -38255113 - var38,
                                             -1441134992
                                          )
                                          .method14151(-2144333897 * MouseHandler.field6257 - var21, (byte)1),
                                       (byte)105
                                    );
                                    var14.method9658(var57, 1697206599);
                                 }
                              }
                           }

                           if (var19.field4403 && !var46) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              var19.field4298 = false;
                              if (var19.field4397 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var58 = classZS.method14182(
                                    classZS.method14148(
                                          classUQ.method11465(var19, 449928328).method14138(true, 1982805502).method14145(var19.field4394, (byte)2),
                                          -38255113 * MouseHandler.field6264 - var38,
                                          -1869798690
                                       )
                                       .method14151(MouseHandler.field6264 * -2144333897 - var21, (byte)1),
                                    (byte)30
                                 );
                                 var14.method9661(var58, 1210007885);
                              }
                           }

                           if (null != var19.field4377) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              ScriptEvent var59 = classZS.method14182(classUQ.method11465(var19, 1089979455).method14145(var19.field4398, (byte)2), (byte)4);
                              classQN.method9660(var14, var59, (byte)-85);
                           }

                           classPV var60 = this.field5382.vmethod81(1237108207);
                           if (var19.field4361 != null && var60.method9272((byte)-97) > -405159805 * var19.field4261) {
                              label1354: {
                                 if (var19.field4372 != null) {
                                    if (var60.method9292((byte)-61) - var19.field4257 * -405159805 <= 32) {
                                       int var64 = var19.field4265 * -405159805;

                                       while (true) {
                                          if (var64 >= var60.method9312((byte)-119)) {
                                             break label1354;
                                          }

                                          int var81 = var60.method9278(var64, -445124758);

                                          for (int var88 = 0; var88 < var19.field4267.length; var88++) {
                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }

                                             if (var81 == var19.field4371[var88]) {
                                                if (var15 >= 9) {
                                                   throw new IllegalStateException();
                                                }

                                                ScriptEvent var36 = classZS.method14182(
                                                   classUQ.method11465(var19, 341775175).method14145(var19.field4343, (byte)2), (byte)64
                                                );
                                                var14.method9658(var36, 1697206599);
                                                break label1354;
                                             }
                                          }

                                          var64++;
                                       }
                                    }

                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 ScriptEvent var63 = classZS.method14182(
                                    classUQ.method11465(var19, -146679022).method14145(var19.field4387, (byte)2), (byte)120
                                 );
                                 var14.method9658(var63, 1697206599);
                              }

                              var19.field4262 = var60.method9312((byte)0) * -1433629141;
                           }

                           if (var19.field4363 != null) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var60.method9267(230517950) > var19.field4274 * 790413063) {
                                 label1328: {
                                    if (var19.field4267 != null) {
                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       if (var60.method9304(230517950) - var19.field4300 * 790413063 <= 32) {
                                          int var66 = 790413063 * var19.field4261;

                                          while (true) {
                                             if (var66 >= var60.method9280(230517950)) {
                                                break label1328;
                                             }

                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }

                                             int var82 = var60.method9278(var66, 393471540);

                                             for (int var89 = 0; var89 < var19.field4385.length; var89++) {
                                                if (var82 == var19.field4401[var89]) {
                                                   if (var15 >= 9) {
                                                      throw new IllegalStateException();
                                                   }

                                                   ScriptEvent var94 = classZS.method14182(
                                                      classUQ.method11465(var19, 682125758).method14145(var19.field4387, (byte)2), (byte)27
                                                   );
                                                   var14.method9658(var94, 1697206599);
                                                   break label1328;
                                                }
                                             }

                                             var66++;
                                          }
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    ScriptEvent var65 = classZS.method14182(
                                       classUQ.method11465(var19, 639570543).method14145(var19.field4246, (byte)2), (byte)126
                                    );
                                    var14.method9658(var65, 1697206599);
                                 }

                                 var19.field4338 = var60.method9267(230517950) * -425558345;
                              }
                           }

                           if (null != var19.field4379) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var60.method9290(1288219174) > var19.field4292 * 1396002941) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 label1301: {
                                    if (var19.field4385 != null) {
                                       if (var15 >= 9) {
                                          return;
                                       }

                                       if (var60.method9273(1288219174) - 1396002941 * var19.field4316 <= 32) {
                                          int var68 = 1396002941 * var19.field4264;

                                          while (true) {
                                             if (var68 >= var60.method9281(1288219174)) {
                                                break label1301;
                                             }

                                             int var83 = var60.method9275(var68, -1111491396);

                                             for (int var90 = 0; var90 < var19.field4372.length; var90++) {
                                                if (var15 >= 9) {
                                                   throw new IllegalStateException();
                                                }

                                                if (var19.field4371[var90] == var83) {
                                                   if (var15 >= 9) {
                                                      throw new IllegalStateException();
                                                   }

                                                   ScriptEvent var95 = classZS.method14182(
                                                      classUQ.method11465(var19, 1366800940).method14145(var19.field4393, (byte)2), (byte)46
                                                   );
                                                   var14.method9658(var95, 1697206599);
                                                   break label1301;
                                                }
                                             }

                                             var68++;
                                          }
                                       }

                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    ScriptEvent var67 = classZS.method14182(
                                       classUQ.method11465(var19, -67274947).method14145(var19.field4357, (byte)2), (byte)90
                                    );
                                    var14.method9658(var67, 1697206599);
                                 }

                                 var19.field4326 = var60.method9284(1288219174) * 297445589;
                              }
                           }

                           if (classPV.method9313(var60, 2081930497) > var19.field4241 * -1941419841) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4361 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var69 = classZS.method14182(classUQ.method11465(var19, 763523364).method14145(var19.field4383, (byte)2), (byte)53);
                                 var14.method9658(var69, 1697206599);
                              }
                           }

                           if (var60.method9270(-1286699135) > var19.field4273 * -1941419841) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4396 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var70 = classZS.method14182(classUQ.method11465(var19, 1282543540).method14145(var19.field4394, (byte)2), (byte)6);
                                 var14.method9658(var70, 1697206599);
                              }
                           }

                           if (var60.method9284(-2046021315) > var19.field4241 * -1941419841) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (var19.field4402 != null) {
                                 ScriptEvent var71 = classZS.method14182(classUQ.method11465(var19, 313901820).method14145(var19.field4388, (byte)2), (byte)2);
                                 var14.method9658(var71, 1697206599);
                              }
                           }

                           if (var60.method9304(-1087972267) > -1941419841 * var19.field4300) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (null != var19.field4396) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var72 = classZS.method14182(
                                    classUQ.method11465(var19, 1736207581).method14145(var19.field4396, (byte)2), (byte)122
                                 );
                                 var14.method9658(var72, 1697206599);
                              }
                           }

                           if (var60.method9292((byte)-1) > var19.field4296 * -1941419841) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (null != var19.field4398) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var73 = classZS.method14182(classUQ.method11465(var19, 1571576681).method14145(var19.field4397, (byte)2), (byte)64);
                                 var14.method9658(var73, 1697206599);
                              }
                           }

                           if (var60.method9290(-693284363) > -1941419841 * var19.field4241) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (null != var19.field4343) {
                                 ScriptEvent var74 = classZS.method14182(classUQ.method11465(var19, 1456317932).method14145(var19.field4361, (byte)2), (byte)91);
                                 var14.method9658(var74, 1697206599);
                              }
                           }

                           if (var60.method9270(-2110015517) > -1941419841 * var19.field4264) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4359 != null) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 ScriptEvent var75 = classZS.method14182(classUQ.method11465(var19, 707258764).method14145(var19.field4350, (byte)2), (byte)51);
                                 var14.method9658(var75, 1697206599);
                              }
                           }

                           if (classPV.method9308(var60, (byte)4) > var19.field4304 * -1941419841) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4391 != null) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 ScriptEvent var76 = classZS.method14182(classUQ.method11465(var19, 700046352).method14145(var19.field4286, (byte)2), (byte)119);
                                 var14.method9658(var76, 1697206599);
                              }
                           }

                           var19.field4247 = var60.method9270(342962976) * 1478436671;
                           if (var19.field4389 != null) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              classFW var77 = this.field5382.vmethod74((byte)72);

                              for (int var84 = 0; var84 < var77.method5057(892616072); var84++) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 ScriptEvent var91 = classZS.method14182(
                                    classUQ.method11465(var19, 300971475)
                                       .method14145(var19.field4392, (byte)2)
                                       .method14177(var77.method5056(var84, 2069198089), 641798308)
                                       .method14173(var77.method5056(var84, -1837535319), 1410490447),
                                    (byte)126
                                 );
                                 var14.method9658(var91, 1697206599);
                              }
                           }

                           if (null != var19.field4392) {
                              int[] var78 = classFA.method4555(var17, -1056195858);

                              for (int var85 = 0; var85 < var78.length; var85++) {
                                 ScriptEvent var92 = classZS.method14182(
                                    classUQ.method11465(var19, 1154772678).method14145(var19.field4365, (byte)2).method14156(var78[var85], -1942436019),
                                    (byte)42
                                 );
                                 var14.method9658(var92, 1697206599);
                              }
                           }

                           if (null != var19.field4382) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              int[] var79 = var17.method4553(1765027070);

                              for (int var86 = 0; var86 < var79.length; var86++) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 ScriptEvent var93 = classZS.method14182(
                                    classUQ.method11465(var19, 99096592).method14145(var19.field4350, (byte)2).method14163(var79[var86], 349750555), (byte)73
                                 );
                                 var14.method9658(var93, 1697206599);
                              }
                           }
                        }
                     }

                     if (!var19.field4403) {
                        if (var12.method12154(-431955666)) {
                           continue;
                        }

                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        if (this.field5383.vmethod156((byte)0)) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }

                        label1237: {
                           if (-2003253155 * var19.field4252 < 0) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (var19.field4356 * 318120869 == 0) {
                                 break label1237;
                              }

                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (this.field5384.method9809((byte)96) >= var22) {
                              if (var15 >= 9) {
                                 throw new IllegalStateException();
                              }

                              if (this.field5384.method9804(758337458) >= var23) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (this.field5384.method9809((byte)119) < var24) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    if (this.field5384.method9804(859048038) < var25) {
                                       if (var15 >= 9) {
                                          return;
                                       }

                                       if (var19.field4303 * -2003253155 >= 0) {
                                          if (var15 >= 9) {
                                             return;
                                          }

                                          var12.method12112(252097765).method11933(var1[-2003253155 * var19.field4349], -1766608502);
                                       } else {
                                          var12.method12112(2064189916).method11933(var19, -1864074974);
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        if (8 == -1510882375 * var19.field4281) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           if (this.field5384.method9803((byte)35) >= var22) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (this.field5384.method9795(1525346113) >= var23) {
                                 if (var15 >= 9) {
                                    throw new IllegalStateException();
                                 }

                                 if (this.field5384.method9793((byte)81) < var24) {
                                    if (var15 >= 9) {
                                       throw new IllegalStateException();
                                    }

                                    if (this.field5384.method9795(-1039273438) < var25) {
                                       if (var15 >= 9) {
                                          throw new IllegalStateException();
                                       }

                                       var12.method12112(946925930).method11933(var19, -1106344526);
                                    }
                                 }
                              }
                           }
                        }

                        if (-714521463 * var19.field4304 > 293773697 * var19.field4319) {
                           if (var15 >= 9) {
                              throw new IllegalStateException();
                           }

                           this.method9121(
                              var19,
                              var19.field4321 * 1115597881 + var38,
                              var21,
                              293773697 * var19.field4288,
                              -714521463 * var19.field4281,
                              this.field5384.method9793((byte)120),
                              this.field5384.method9795(1376332737),
                              var12,
                              1303753171
                           );
                        }
                     }

                     if (-1510882375 * var19.field4240 == 0) {
                        if (var15 >= 9) {
                           throw new IllegalStateException();
                        }

                        method9118(
                           this,
                           var1,
                           var19.field4321 * -1210177335,
                           var19.field4304 * 379541057,
                           -1163656551 * var19.field4288,
                           63131743 * var19.field4316,
                           var22,
                           var23,
                           var24,
                           var25,
                           var38 - var19.field4310 * -34809441,
                           var21 - var19.field4368 * -41424189,
                           var12,
                           var13,
                           var14,
                           (byte)-28
                        );
                        if (var19.field4340 != null) {
                           if (var15 >= 9) {
                              return;
                           }

                           method9118(
                              this,
                              var19.field4340,
                              0,
                              var19.field4340.length - 1,
                              var19.field4303 * -1163656551,
                              -1,
                              var22,
                              var23,
                              var24,
                              var25,
                              var38 - var19.field4331 * -34809441,
                              var21 - var19.field4347 * -41424189,
                              var12,
                              var13,
                              var14,
                              (byte)-90
                           );
                        }

                        if (-1 == 63131743 * var19.field4329) {
                           if (var15 >= 9) {
                              return;
                           }

                           InterfaceParent var49 = (InterfaceParent)var12.field6618.method13383(-1163656551 * var19.field4266);
                           if (var49 != null) {
                              if (var15 >= 9) {
                                 return;
                              }

                              if (-691218541 * var49.field5276 == 0) {
                                 if (var15 >= 9) {
                                    return;
                                 }

                                 if (-38255113 * MouseHandler.field6264 >= var22) {
                                    if (var15 >= 9) {
                                       return;
                                    }

                                    if (-2144333897 * MouseHandler.field6255 >= var23 && -38255113 * MouseHandler.field6257 < var24) {
                                       if (var15 >= 9) {
                                          return;
                                       }

                                       if (-2144333897 * MouseHandler.field6251 < var25 && !this.field5383.vmethod156((byte)0)) {
                                          if (var15 >= 9) {
                                             throw new IllegalStateException();
                                          }

                                          var14.method9682(1806526567);
                                          var12.method12150((byte)0).method12249((byte)51);
                                          if (!var16) {
                                             if (var15 >= 9) {
                                                throw new IllegalStateException();
                                             }

                                             this.field5381.vmethod317(891814198);
                                          }
                                       }
                                    }
                                 }
                              }

                              this.method9113(var49.field5277 * 2023647411, var22, var23, var24, var25, var38, var21, var12, var13, var14, (byte)9);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var37) {
         throw classEG.method3884(var37, "pq.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Llw;Lqp;Lvv;B)V")
   @ObfuscatedName("ay")
   void method9142(Widget[] var1, classQP var2, classVV var3, byte var4) {
      try {
         for (int var5 = 0; var5 < var1.length; var5++) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            Widget var6 = var1[var5];
            if (null == var6) {
               if (var4 != 3) {
                  throw new IllegalStateException();
               }
            } else {
               if (0 == var6.field4296 * -1510882375) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  if (null != var6.field4340) {
                     if (var4 != 3) {
                        return;
                     }

                     method9139(this, var6.field4340, var2, var3, (byte)3);
                  }

                  if (63131743 * var6.field4288 == -1) {
                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     InterfaceParent var7 = (InterfaceParent)var3.field6613.method13366(-1163656551 * var6.field4247);
                     if (var7 != null) {
                        if (var4 != 3) {
                           throw new IllegalStateException();
                        }

                        method9131(this, var7.field5277 * 2023647411, var2, var3, (byte)-111);
                     }
                  }
               }

               if (classQP.field5581 == var2 && null != var6.field4254) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  ScriptEvent var9 = classZS.method14182(classUQ.method11465(var6, 1000282158).method14145(var6.field4365, (byte)2), (byte)118);
                  this.field5381.vmethod347(var9, -1390295200);
               }

               if (var2 == classQP.field5582 && null != var6.field4357) {
                  if (var4 != 3) {
                     throw new IllegalStateException();
                  }

                  if (var6.field4374 * 63131743 >= 0) {
                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     Widget var10 = classLY.method7375(var3, -1163656551 * var6.field4300, (byte)62);
                     if (null == var10) {
                        continue;
                     }

                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     if (var10.field4340 == null) {
                        continue;
                     }

                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     if (var6.field4274 * 63131743 >= var10.field4340.length) {
                        continue;
                     }

                     if (var4 != 3) {
                        throw new IllegalStateException();
                     }

                     if (var6 != var10.field4340[var6.field4374 * 63131743]) {
                        if (var4 != 3) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  ScriptEvent var11 = classZS.method14182(classUQ.method11465(var6, 753665777).method14145(var6.field4398, (byte)2), (byte)70);
                  this.field5381.vmethod347(var11, -1627367532);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "pq.ay(" + ')');
      }
   }
}
