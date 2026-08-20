import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qm")
public class classQM {
   @ToRemove(unused = "true")
   @ObfuscatedName("di")
   public static final int field5564 = 105;
   @ObfuscatedName("af")
   String field5565;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5561 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5562 = 6;
   @ObfuscatedName("az")
   Future field5560;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field5563 = 4;

   @ObfuscatedSignature(descriptor = "(Lqm;I)Z")
   @ObfuscatedName("wi")
   public static boolean method9640(classQM var0, int var1) {
      if (var0 == null) {
         return var0.method9645(var1);
      } else {
         try {
            if (var0.field5565 == null) {
               if (var0.field5560 != null) {
                  return false;
               }

               if (var1 != -1640283079) {
                  throw new IllegalStateException();
               }
            }

            return true;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "qm.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
   @ObfuscatedName("bx")
   public static final String method9652(String var0, int var1, byte var2) {
      try {
         if (var0 == null) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var0 = var1 + 1 + ": TEST";
         } else {
            var0 = 1 + var1 + ": " + var0;
         }

         return var0;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qm.bx(" + ')');
      }
   }

   classQM(String var1) {
      method9636(this, var1, 154719704);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("az")
   public final String method9631(int var1) {
      try {
         return this.field5565;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qm.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("as")
   public final String method9632() {
      return this.field5565;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ab")
   public final boolean method9646(byte var1) {
      try {
         if (method9640(this, -1640283079)) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.field5560.isDone();
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qm.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   public boolean method9641() {
      return this.field5565 != null || this.field5560 == null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ac")
   public final String method9633() {
      return this.field5565;
   }

   classQM(Future var1) {
      this.field5560 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ax")
   public final String method9634() {
      return this.field5565;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aa")
   void method9635(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.field5565 = var1;
      if (this.field5560 != null) {
         this.field5560.cancel(true);
         this.field5560 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;I)V")
   @ObfuscatedName("wj")
   public static void method9636(classQM var0, String var1, int var2) {
      if (var0 == null) {
         var0.method9639(var1, var2);
      }

      try {
         if (null == var1) {
            if (var2 != 154719704) {
               throw new IllegalStateException();
            }

            var1 = "";
         }

         var0.field5565 = var1;
         if (var0.field5560 != null) {
            if (var2 != 154719704) {
               throw new IllegalStateException();
            }

            var0.field5560.cancel(true);
            var0.field5560 = null;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qm.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method9642() {
      return this.field5565 != null || this.field5560 == null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   public boolean method9643() {
      return this.field5565 != null || this.field5560 == null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("al")
   void method9637(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.field5565 = var1;
      if (this.field5560 != null) {
         this.field5560.cancel(true);
         this.field5560 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method9644() {
      return this.field5565 != null || this.field5560 == null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ao")
   void method9638(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.field5565 = var1;
      if (this.field5560 != null) {
         this.field5560.cancel(true);
         this.field5560 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public final boolean method9647() {
      return method9640(this, -1640283079) ? true : this.field5560.isDone();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public final boolean method9648() {
      return method9640(this, -1640283079) ? true : this.field5560.isDone();
   }

   @ObfuscatedSignature(descriptor = "()Lqg;")
   @ObfuscatedName("aw")
   public final classQG method9649() {
      if (method9640(this, -1640283079)) {
         return new classQG(this.field5565);
      } else if (!this.method9646((byte)-20)) {
         return null;
      } else {
         try {
            return (classQG)this.field5560.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            method9636(this, var2, 154719704);
            return new classQG(var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lqg;")
   @ObfuscatedName("ak")
   public final classQG method9650() {
      if (method9640(this, -1640283079)) {
         return new classQG(this.field5565);
      } else if (!this.method9646((byte)-49)) {
         return null;
      } else {
         try {
            return (classQG)this.field5560.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            method9636(this, var2, 154719704);
            return new classQG(var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("ak")
   static int method9653(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var10000;
         if (var2) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            }

            var10000 = classSZ.field6110;
         } else {
            var10000 = TileItem.field1558;
         }

         Widget var4 = var10000;
         if (1600 == var0) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -34809441 * var4.field4341;
               return 1;
            }
         } else if (1601 == var0) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4331 * -41424189;
               return 1;
            }
         } else if (1602 == var0) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               if (-1510882375 * var4.field4375 == 12) {
                  if (var3 == -1419900860) {
                     throw new IllegalStateException();
                  }

                  classLH var26 = var4.method7283(-1055670543);
                  if (null != var26) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var26.method6970(-949643340).method13854((byte)-98);
                     return 1;
                  }
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var4.field4301;
               return 1;
            }
         } else if (1603 == var0) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4258 * -842862191;
            return 1;
         } else if (var0 == 1604) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -714521463 * var4.field4269;
               return 1;
            }
         } else if (var0 == 1605) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4338 * 245118287;
               return 1;
            }
         } else if (var0 == 1606) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4356 * -1246332317;
            return 1;
         } else if (var0 == 1607) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4294 * 827587461;
               return 1;
            }
         } else if (var0 == 1608) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1008620329 * var4.field4292;
               return 1;
            }
         } else if (var0 == 1609) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1517457381 * var4.field4347;
               return 1;
            }
         } else if (var0 == 1610) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4276 * 1991172799;
               return 1;
            }
         } else if (var0 == 1611) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4270 * 1740831551;
               return 1;
            }
         } else if (var0 == 1612) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 948260113 * var4.field4295;
               return 1;
            }
         } else if (1613 == var0) {
            if (var3 == -1419900860) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4307.vmethod8((byte)1);
               return 1;
            }
         } else if (var0 == 1614) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4298 ? 1 : 0;
            return 1;
         } else {
            if (1617 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               }

               classLI var5 = Widget.method7285(var4, 841529317);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var5 ? var5.field4172 * -211319977 : 0;
            }

            if (1618 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLI var25 = Widget.method7285(var4, 1150126364);
                  int[] var37 = classBB.field323;
                  int var47 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var57;
                  if (var25 != null) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var57 = 1532740787 * var25.field4170;
                  } else {
                     var57 = 0;
                  }

                  var37[var47] = var57;
                  return 1;
               }
            } else if (1619 == var0) {
               classLH var24 = var4.method7283(-333687421);
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = null != var24
                  ? classLH.method6973(var24, 811484056).method13854((byte)-62)
                  : "";
               return 1;
            } else if (1620 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLI var23 = Widget.method7285(var4, 1045618437);
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var23 ? 201043577 * var23.field4169 : 0;
                  return 1;
               }
            } else if (var0 == 1621) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var22 = var4.method7283(-242482181);
                  int[] var36 = classBB.field323;
                  int var46 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var56;
                  if (var22 != null) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var56 = var22.method7011((byte)-105);
                  } else {
                     var56 = 0;
                  }

                  var36[var46] = var56;
                  return 1;
               }
            } else if (1622 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var21 = var4.method7283(-538822329);
                  int[] var35 = classBB.field323;
                  int var45 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var55;
                  if (var21 != null) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var55 = classLH.method7014(var21, -2118783281);
                  } else {
                     var55 = 0;
                  }

                  var35[var45] = var55;
                  return 1;
               }
            } else if (1623 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var20 = var4.method7283(-859310346);
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var20 ? var20.method7017(572000354) : 0;
                  return 1;
               }
            } else if (1624 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  int var44;
                  byte var54;
                  label435: {
                     classLH var19 = var4.method7283(-1369461960);
                     var34 = classBB.field323;
                     var44 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                     if (var19 != null) {
                        if (var3 == -1419900860) {
                           throw new IllegalStateException();
                        }

                        if (var19.method6982(1825757736)) {
                           if (var3 == -1419900860) {
                              throw new IllegalStateException();
                           }

                           var54 = 1;
                           break label435;
                        }
                     }

                     var54 = 0;
                  }

                  var34[var44] = var54;
                  return 1;
               }
            } else if (1625 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var18 = var4.method7283(-2105176746);
                  int[] var33 = classBB.field323;
                  int var43 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  byte var53;
                  if (var18 != null && var18.method6985(-880967958)) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var53 = 1;
                  } else {
                     var53 = 0;
                  }

                  var33[var43] = var53;
                  return 1;
               }
            } else if (1626 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var17 = var4.method7283(-49002324);
                  Object[] var32 = classBB.field328;
                  int var42 = (classBB.field338 += 1222866659) * 1375698635 - 1;
                  String var52;
                  if (var17 != null) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var52 = classLH.method6977(var17, 1447661178).method195(1796816031);
                  } else {
                     var52 = "";
                  }

                  var32[var42] = var52;
                  return 1;
               }
            } else if (1627 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var16 = var4.method7283(-1084326343);
                  int var30;
                  if (null != var16) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var30 = var16.method6995(2037339164);
                  } else {
                     var30 = 0;
                  }

                  int var6 = var30;
                  int var31;
                  if (var16 != null) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var31 = var16.method6994((byte)-68);
                  } else {
                     var31 = 0;
                  }

                  int var7 = var31;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Math.min(var6, var7);
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Math.max(var6, var7);
                  return 1;
               }
            } else if (var0 == 1628) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var15 = var4.method7283(-1621595011);
                  int[] var29 = classBB.field323;
                  int var41 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var51;
                  if (null != var15) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var51 = var15.method6994((byte)-95);
                  } else {
                     var51 = 0;
                  }

                  var29[var41] = var51;
                  return 1;
               }
            } else if (var0 == 1629) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var14 = var4.method7283(-1211623350);
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var14 ? var14.method7025(653687243) : 0;
                  return 1;
               }
            } else if (var0 == 1630) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var13 = var4.method7283(-473074412);
                  int[] var28 = classBB.field323;
                  int var40 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var50;
                  if (null != var13) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var50 = var13.method7018(736088388);
                  } else {
                     var50 = 0;
                  }

                  var28[var40] = var50;
                  return 1;
               }
            } else if (var0 == 1631) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var12 = var4.method7283(-19845964);
                  int[] var27 = classBB.field323;
                  int var39 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  int var49;
                  if (null != var12) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var49 = var12.method7034((byte)3);
                  } else {
                     var49 = 0;
                  }

                  var27[var39] = var49;
                  return 1;
               }
            } else if (1632 == var0) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classLH var11 = var4.method7283(-375776656);
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var11 != null ? var11.method7039((byte)-47) : 0;
                  return 1;
               }
            } else if (var0 == 1633) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classTT var10 = Widget.method7287(var4, 1289741507);
                  int var38 = -324749371 * DynamicObject.field1679 - 1;
                  int var48;
                  if (null != var10) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var48 = var10.method11138(classBB.field323[DynamicObject.field1679 * -324749371 - 1], -959062396);
                  } else {
                     var48 = 0;
                  }

                  classBB.field323[var38] = var48;
                  return 1;
               }
            } else if (var0 == 1634) {
               if (var3 == -1419900860) {
                  throw new IllegalStateException();
               } else {
                  classTT var9 = Widget.method7287(var4, 1289741507);
                  int var10001 = DynamicObject.field1679 * -324749371 - 1;
                  int var10002;
                  if (null != var9) {
                     if (var3 == -1419900860) {
                        throw new IllegalStateException();
                     }

                     var10002 = var9.method11143((char)classBB.field323[-324749371 * DynamicObject.field1679 - 1], 1655829248);
                  } else {
                     var10002 = 0;
                  }

                  classBB.field323[var10001] = var10002;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "qm.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lqg;")
   @ObfuscatedName("ag")
   public final classQG method9651(int var1) {
      try {
         if (method9640(this, -1640283079)) {
            if (var1 == 66194928) {
               throw new IllegalStateException();
            } else {
               return new classQG(this.field5565);
            }
         } else if (!this.method9646((byte)105)) {
            if (var1 == 66194928) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            try {
               return (classQG)this.field5560.get();
            } catch (Exception var4) {
               String var3 = "Error retrieving REST request reply";
               System.err.println(var3 + "\r\n" + var4);
               method9636(this, var3, 154719704);
               return new classQG(var3);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "qm.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   public boolean method9645(int var1) {
      try {
         if (this.field5565 == null) {
            if (this.field5560 != null) {
               return false;
            }

            if (var1 != -1640283079) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qm.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("af")
   void method9639(String var1, int var2) {
      try {
         if (null == var1) {
            if (var2 != 154719704) {
               throw new IllegalStateException();
            }

            var1 = "";
         }

         this.field5565 = var1;
         if (this.field5560 != null) {
            if (var2 != 154719704) {
               throw new IllegalStateException();
            }

            this.field5560.cancel(true);
            this.field5560 = null;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qm.af(" + ')');
      }
   }
}
