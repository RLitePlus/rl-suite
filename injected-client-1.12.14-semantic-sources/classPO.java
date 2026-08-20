import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("po")
public class classPO {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field5191 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field5197 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field5192 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field5195 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field5198 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field5194 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field5193 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field5196 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field5190 = 64;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   public static final int field5199 = 262144;

   classPO() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("al")
   static int method8779(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var10000;
         if (var2) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            }

            var10000 = UserComparator3.scriptDotWidget;
         } else {
            var10000 = class222.scriptActiveWidget;
         }

         Widget var4 = var10000;
         if (var0 == 1600) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1068149169 * var4.scrollX;
            return 1;
         } else if (1601 == var0) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.scrollY * -497311503;
               return 1;
            }
         } else if (1602 == var0) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               if (var4.type * 928687775 == 12) {
                  classOO var26 = var4.method8156(817123017);
                  if (null != var26) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = classSF.method10131(
                        classOO.method8531(var26, -446568420), (byte)-76
                     );
                     return 1;
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.text;
               return 1;
            }
         } else if (1603 == var0) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.scrollWidth * -111672215;
               return 1;
            }
         } else if (var0 == 1604) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1963554889 * var4.scrollHeight;
               return 1;
            }
         } else if (1605 == var0) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1417816983 * var4.modelZoom;
               return 1;
            }
         } else if (var0 == 1606) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.modelAngleX * 751747207;
               return 1;
            }
         } else if (1607 == var0) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1415481045 * var4.modelAngleZ;
               return 1;
            }
         } else if (var0 == 1608) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1629507461 * var4.modelAngleY;
               return 1;
            }
         } else if (var0 == 1609) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.transparencyTop * -2090288859;
               return 1;
            }
         } else if (var0 == 1610) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -185564907 * var4.transparencyBot;
               return 1;
            }
         } else if (1611 == var0) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.color * 7845467;
               return 1;
            }
         } else if (var0 == 1612) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.color2 * -1402291999;
               return 1;
            }
         } else if (var0 == 1613) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.fillMode.rsOrdinal((byte)24);
            return 1;
         } else if (var0 == 1614) {
            if (var3 == -189886804) {
               throw new IllegalStateException();
            } else {
               int[] var42 = Interpreter.Interpreter_intStack;
               int var57 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var72;
               if (var4.modelTransparency) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  }

                  var72 = 1;
               } else {
                  var72 = 0;
               }

               var42[var57] = var72;
               return 1;
            }
         } else {
            if (var0 == 1617) {
               if (var3 == -189886804) {
                  throw new IllegalStateException();
               }

               class372 var5 = var4.method8158((short)16256);
               int[] var27 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var10002;
               if (null != var5) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  }

                  var10002 = var5.field4640 * -936277931;
               } else {
                  var10002 = 0;
               }

               var27[var10001] = var10002;
            }

            if (var0 == 1618) {
               if (var3 == -189886804) {
                  throw new IllegalStateException();
               } else {
                  class372 var25 = var4.method8158((short)16256);
                  int[] var41 = Interpreter.Interpreter_intStack;
                  int var56 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var71;
                  if (null != var25) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     var71 = var25.field4642 * 527385781;
                  } else {
                     var71 = 0;
                  }

                  var41[var56] = var71;
                  return 1;
               }
            } else if (var0 == 1619) {
               if (var3 == -189886804) {
                  throw new IllegalStateException();
               } else {
                  classOO var24 = var4.method8156(1195335592);
                  Object[] var40 = Interpreter.Interpreter_objectStack;
                  int var55 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var70;
                  if (var24 != null) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     var70 = classSF.method10131(var24.method8533(1469876369), (byte)-117);
                  } else {
                     var70 = "";
                  }

                  var40[var55] = var70;
                  return 1;
               }
            } else if (1620 == var0) {
               class372 var23 = var4.method8158((short)16256);
               int[] var39 = Interpreter.Interpreter_intStack;
               int var54 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var69;
               if (var23 != null) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  }

                  var69 = var23.field4641 * 1635834675;
               } else {
                  var69 = 0;
               }

               var39[var54] = var69;
               return 1;
            } else if (var0 == 1621) {
               if (var3 == -189886804) {
                  throw new IllegalStateException();
               } else {
                  classOO var22 = var4.method8156(1475186037);
                  int[] var38 = Interpreter.Interpreter_intStack;
                  int var53 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var68;
                  if (null != var22) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     var68 = classOO.method8568(var22, 1759209871);
                  } else {
                     var68 = 0;
                  }

                  var38[var53] = var68;
                  return 1;
               }
            } else if (1622 == var0) {
               if (var3 == -189886804) {
                  throw new IllegalStateException();
               } else {
                  classOO var21 = var4.method8156(466375009);
                  int[] var37 = Interpreter.Interpreter_intStack;
                  int var52 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var67;
                  if (var21 != null) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     var67 = var21.method8570(1731450831);
                  } else {
                     var67 = 0;
                  }

                  var37[var52] = var67;
                  return 1;
               }
            } else if (var0 == 1623) {
               if (var3 == -189886804) {
                  throw new IllegalStateException();
               } else {
                  classOO var20 = var4.method8156(1363031472);
                  int[] var36 = Interpreter.Interpreter_intStack;
                  int var51 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var66;
                  if (null != var20) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     var66 = var20.method8572((byte)-23);
                  } else {
                     var66 = 0;
                  }

                  var36[var51] = var66;
                  return 1;
               }
            } else if (var0 == 1624) {
               if (var3 == -189886804) {
                  throw new IllegalStateException();
               } else {
                  classOO var19 = var4.method8156(1226881612);
                  int[] var35 = Interpreter.Interpreter_intStack;
                  int var50 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  byte var65;
                  if (var19 != null && var19.method8538((byte)0)) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     var65 = 1;
                  } else {
                     var65 = 0;
                  }

                  var35[var50] = var65;
                  return 1;
               }
            } else if (1625 != var0) {
               if (var0 == 1626) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  } else {
                     classOO var18 = var4.method8156(1606498327);
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null != var18
                        ? var18.method8536(-467707491).method10274((byte)18)
                        : "";
                     return 1;
                  }
               } else if (var0 == 1627) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  } else {
                     classOO var17 = var4.method8156(1993240117);
                     int var33;
                     if (var17 != null) {
                        if (var3 == -189886804) {
                           throw new IllegalStateException();
                        }

                        var33 = var17.method8550((byte)-3);
                     } else {
                        var33 = 0;
                     }

                     int var6 = var33;
                     int var34;
                     if (var17 != null) {
                        if (var3 == -189886804) {
                           throw new IllegalStateException();
                        }

                        var34 = var17.method8549(1757525191);
                     } else {
                        var34 = 0;
                     }

                     int var7 = var34;
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.min(var6, var7);
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.max(var6, var7);
                     return 1;
                  }
               } else if (1628 == var0) {
                  classOO var16 = var4.method8156(1116083687);
                  int[] var32 = Interpreter.Interpreter_intStack;
                  int var49 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var64;
                  if (null != var16) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     var64 = var16.method8549(1757525191);
                  } else {
                     var64 = 0;
                  }

                  var32[var49] = var64;
                  return 1;
               } else if (var0 == 1629) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  } else {
                     classOO var15 = var4.method8156(1504920596);
                     int[] var31 = Interpreter.Interpreter_intStack;
                     int var48 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                     int var63;
                     if (var15 != null) {
                        if (var3 == -189886804) {
                           throw new IllegalStateException();
                        }

                        var63 = classOO.method8578(var15, 2042530632);
                     } else {
                        var63 = 0;
                     }

                     var31[var48] = var63;
                     return 1;
                  }
               } else if (var0 == 1630) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  } else {
                     classOO var14 = var4.method8156(638752620);
                     int[] var30 = Interpreter.Interpreter_intStack;
                     int var47 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                     int var62;
                     if (var14 != null) {
                        if (var3 == -189886804) {
                           throw new IllegalStateException();
                        }

                        var62 = classOO.method8573(var14, (byte)-79);
                     } else {
                        var62 = 0;
                     }

                     var30[var47] = var62;
                     return 1;
                  }
               } else if (var0 == 1631) {
                  classOO var13 = var4.method8156(441560438);
                  int[] var29 = Interpreter.Interpreter_intStack;
                  int var46 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var61;
                  if (null != var13) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     var61 = classOO.method8584(var13, (byte)-31);
                  } else {
                     var61 = 0;
                  }

                  var29[var46] = var61;
                  return 1;
               } else if (1632 == var0) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  } else {
                     classOO var12 = var4.method8156(503435135);
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var12
                        ? var12.method8588(-2067649854)
                        : 0;
                     return 1;
                  }
               } else if (1633 == var0) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  } else {
                     class28 var11 = var4.method8162((byte)13);
                     int var45 = 327716789 * class408.Interpreter_intStackSize - 1;
                     int var60;
                     if (null != var11) {
                        if (var3 == -189886804) {
                           throw new IllegalStateException();
                        }

                        var60 = var11.method493(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1], (byte)12);
                     } else {
                        var60 = 0;
                     }

                     Interpreter.Interpreter_intStack[var45] = var60;
                     return 1;
                  }
               } else if (var0 == 1634) {
                  if (var3 == -189886804) {
                     throw new IllegalStateException();
                  } else {
                     class28 var10 = var4.method8162((byte)13);
                     int var44 = class408.Interpreter_intStackSize * 327716789 - 1;
                     int var59;
                     if (null != var10) {
                        if (var3 == -189886804) {
                           throw new IllegalStateException();
                        }

                        var59 = var10.method497((char)Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], 1833692068);
                     } else {
                        var59 = 0;
                     }

                     Interpreter.Interpreter_intStack[var44] = var59;
                     return 1;
                  }
               } else {
                  return 2;
               }
            } else {
               int var43;
               byte var58;
               label455: {
                  classOO var9 = var4.method8156(779368541);
                  var28 = Interpreter.Interpreter_intStack;
                  var43 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  if (var9 != null) {
                     if (var3 == -189886804) {
                        throw new IllegalStateException();
                     }

                     if (var9.method8541(-1565855109)) {
                        if (var3 == -189886804) {
                           throw new IllegalStateException();
                        }

                        var58 = 1;
                        break label455;
                     }
                  }

                  var58 = 0;
               }

               var28[var43] = var58;
               return 1;
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "po.al(" + 41);
      }
   }
}
