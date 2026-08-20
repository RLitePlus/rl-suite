import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("go")
public class class161 extends classFM {
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2038 = 64;
   @ObfuscatedName("at")
   String field2041;
   @ObfuscatedName("ah")
   static int[] Tiles_hueMultiplier;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field2039 = 2;
   @ObfuscatedName("av")
   int field2040;

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("aj")
   public static int method4253(int var0, byte var1) {
      try {
         var0 = --var0 | var0 >>> 1;
         var0 |= var0 >>> 2;
         var0 |= var0 >>> 4;
         var0 |= var0 >>> 8;
         var0 |= var0 >>> 16;
         return var0 + 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "go.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field2040 = Buffer.method12015(var1, 1173587529) * -77756807;
         this.field2041 = var1.readStringCp1252NullCircumfixed(86060522);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "go.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("at")
   public static boolean method4255(char var0, byte var1) {
      try {
         if (var0 > 0) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            if (var0 < 128) {
               return true;
            }

            if (var1 != 1) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 160) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var0 != 0) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            char[] var2 = class451.cp1252AsciiExtension;

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               char var4 = var2[var3];
               if (var4 == var0) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "go.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;IIII)V")
   @ObfuscatedName("ab")
   static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3, int var4) {
      try {
         if (var0.field4560 == null) {
            if (var4 == 1339969195) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            var0.field4560[var1] = var2;
            var0.field4561[var1] = var3;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "go.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field2040 = Buffer.method12015(var1, 1605768581) * -77756807;
      this.field2041 = var1.readStringCp1252NullCircumfixed(-1803705397);
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4340(this.field2040 * 460194761, this.field2041, (byte)-12);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field2040 = Buffer.method12015(var1, 1200965524) * -77756807;
      this.field2041 = var1.readStringCp1252NullCircumfixed(387616174);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lay;)Z")
   @ObfuscatedName("of")
   public static boolean method4252(HttpMethod var0) {
      return var0.field100;
   }

   class161(class154 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4340(this.field2040 * 460194761, this.field2041, (byte)-50);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "go.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bg")
   static int method4257(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4 = class226.widgetDefinition
            .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1027745028);
         if (var0 == 2600) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.scrollX * 1068149169;
               return 1;
            }
         } else if (2601 == var0) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.scrollY * -497311503;
               return 1;
            }
         } else if (2602 == var0) {
            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.text;
            return 1;
         } else if (var0 == 2603) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.scrollWidth * -111672215;
               return 1;
            }
         } else if (2604 == var0) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.scrollHeight * -1963554889;
               return 1;
            }
         } else if (var0 == 2605) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1417816983 * var4.modelZoom;
               return 1;
            }
         } else if (var0 == 2606) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.modelAngleX * 751747207;
               return 1;
            }
         } else if (2607 == var0) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.modelAngleZ * 1415481045;
               return 1;
            }
         } else if (var0 == 2608) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.modelAngleY * 1629507461;
               return 1;
            }
         } else if (2609 == var0) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.transparencyTop * -2090288859;
               return 1;
            }
         } else if (var0 == 2610) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.transparencyBot * -185564907;
               return 1;
            }
         } else if (2611 == var0) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.color * 7845467;
               return 1;
            }
         } else if (2612 == var0) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1402291999 * var4.color2;
               return 1;
            }
         } else if (var0 == 2613) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.fillMode.rsOrdinal((byte)17);
            return 1;
         } else if (var0 == 2614) {
            if (var3 == 2108391709) {
               throw new IllegalStateException();
            } else {
               int[] var41 = Interpreter.Interpreter_intStack;
               int var57 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var73;
               if (var4.modelTransparency) {
                  if (var3 == 2108391709) {
                     throw new IllegalStateException();
                  }

                  var73 = 1;
               } else {
                  var73 = 0;
               }

               var41[var57] = var73;
               return 1;
            }
         } else {
            if (var0 == 2617) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               }

               class372 var5 = var4.method8158((short)16256);
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var10002;
               if (null != var5) {
                  if (var3 == 2108391709) {
                     throw new IllegalStateException();
                  }

                  var10002 = var5.field4640 * -936277931;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
            }

            if (2618 == var0) {
               class372 var25 = var4.method8158((short)16256);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var25 != null
                  ? var25.field4642 * 527385781
                  : 0;
               return 1;
            } else if (var0 == 2619) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var24 = var4.method8156(1207893061);
                  Object[] var40 = Interpreter.Interpreter_objectStack;
                  int var56 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var72;
                  if (null != var24) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var72 = classSF.method10131(var24.method8533(-198274072), (byte)-46);
                  } else {
                     var72 = "";
                  }

                  var40[var56] = var72;
                  return 1;
               }
            } else if (var0 == 2620) {
               class372 var23 = var4.method8158((short)16256);
               int[] var39 = Interpreter.Interpreter_intStack;
               int var55 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var71;
               if (var23 != null) {
                  if (var3 == 2108391709) {
                     throw new IllegalStateException();
                  }

                  var71 = 1635834675 * var23.field4641;
               } else {
                  var71 = 0;
               }

               var39[var55] = var71;
               return 1;
            } else if (var0 == 2621) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var22 = var4.method8156(266864970);
                  int[] var38 = Interpreter.Interpreter_intStack;
                  int var54 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var70;
                  if (null != var22) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var70 = classOO.method8568(var22, 1663378607);
                  } else {
                     var70 = 0;
                  }

                  var38[var54] = var70;
                  return 1;
               }
            } else if (2622 == var0) {
               classOO var21 = var4.method8156(1886595713);
               int[] var37 = Interpreter.Interpreter_intStack;
               int var53 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var69;
               if (var21 != null) {
                  if (var3 == 2108391709) {
                     throw new IllegalStateException();
                  }

                  var69 = var21.method8570(1006930565);
               } else {
                  var69 = 0;
               }

               var37[var53] = var69;
               return 1;
            } else if (var0 == 2623) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var20 = var4.method8156(615556603);
                  int[] var36 = Interpreter.Interpreter_intStack;
                  int var52 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var68;
                  if (null != var20) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var68 = var20.method8572((byte)-47);
                  } else {
                     var68 = 0;
                  }

                  var36[var52] = var68;
                  return 1;
               }
            } else if (var0 == 2624) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var19 = var4.method8156(1656559103);
                  int[] var35 = Interpreter.Interpreter_intStack;
                  int var51 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  byte var67;
                  if (var19 != null && var19.method8538((byte)0)) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var67 = 1;
                  } else {
                     var67 = 0;
                  }

                  var35[var51] = var67;
                  return 1;
               }
            } else if (var0 == 2625) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var18 = var4.method8156(1426166482);
                  int[] var34 = Interpreter.Interpreter_intStack;
                  int var50 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  byte var66;
                  if (null != var18 && var18.method8541(-382741623)) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var66 = 1;
                  } else {
                     var66 = 0;
                  }

                  var34[var50] = var66;
                  return 1;
               }
            } else if (var0 == 2626) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var17 = var4.method8156(1983186722);
                  Object[] var33 = Interpreter.Interpreter_objectStack;
                  int var49 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var65;
                  if (null != var17) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var65 = var17.method8536(-467707491).method10274((byte)8);
                  } else {
                     var65 = "";
                  }

                  var33[var49] = var65;
                  return 1;
               }
            } else if (var0 == 2627) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var16 = var4.method8156(900094655);
                  int var31;
                  if (var16 != null) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var31 = var16.method8550((byte)51);
                  } else {
                     var31 = 0;
                  }

                  int var6 = var31;
                  if (null != var16) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var31 = var16.method8549(1757525191);
                  } else {
                     var31 = 0;
                  }

                  int var7 = var31;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.min(var6, var7);
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Math.max(var6, var7);
                  return 1;
               }
            } else if (2628 == var0) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var15 = var4.method8156(605238654);
                  int[] var30 = Interpreter.Interpreter_intStack;
                  int var48 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var64;
                  if (var15 != null) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var64 = var15.method8549(1757525191);
                  } else {
                     var64 = 0;
                  }

                  var30[var48] = var64;
                  return 1;
               }
            } else if (2629 == var0) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var14 = var4.method8156(785019462);
                  int[] var29 = Interpreter.Interpreter_intStack;
                  int var47 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var63;
                  if (null != var14) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var63 = classOO.method8578(var14, 1616382543);
                  } else {
                     var63 = 0;
                  }

                  var29[var47] = var63;
                  return 1;
               }
            } else if (var0 == 2630) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var13 = var4.method8156(126598007);
                  int[] var28 = Interpreter.Interpreter_intStack;
                  int var46 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var62;
                  if (var13 != null) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var62 = classOO.method8573(var13, (byte)-62);
                  } else {
                     var62 = 0;
                  }

                  var28[var46] = var62;
                  return 1;
               }
            } else if (2631 == var0) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  classOO var12 = var4.method8156(1534769577);
                  int[] var27 = Interpreter.Interpreter_intStack;
                  int var45 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var61;
                  if (var12 != null) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var61 = classOO.method8584(var12, (byte)-69);
                  } else {
                     var61 = 0;
                  }

                  var27[var45] = var61;
                  return 1;
               }
            } else if (2632 == var0) {
               classOO var11 = var4.method8156(2096268354);
               int[] var26 = Interpreter.Interpreter_intStack;
               int var44 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var60;
               if (null != var11) {
                  if (var3 == 2108391709) {
                     throw new IllegalStateException();
                  }

                  var60 = var11.method8588(-2067649854);
               } else {
                  var60 = 0;
               }

               var26[var44] = var60;
               return 1;
            } else if (var0 == 2633) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  class28 var10 = var4.method8162((byte)13);
                  int var43 = 327716789 * class408.Interpreter_intStackSize - 1;
                  int var59;
                  if (null != var10) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var59 = var10.method493(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1], (byte)12);
                  } else {
                     var59 = 0;
                  }

                  Interpreter.Interpreter_intStack[var43] = var59;
                  return 1;
               }
            } else if (var0 == 2634) {
               if (var3 == 2108391709) {
                  throw new IllegalStateException();
               } else {
                  class28 var9 = var4.method8162((byte)13);
                  int var42 = class408.Interpreter_intStackSize * 327716789 - 1;
                  int var58;
                  if (null != var9) {
                     if (var3 == 2108391709) {
                        throw new IllegalStateException();
                     }

                     var58 = var9.method497((char)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1], 79230696);
                  } else {
                     var58 = 0;
                  }

                  Interpreter.Interpreter_intStack[var42] = var58;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "go.bg(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[JIIB)V")
   @ObfuscatedName("ae")
   public static void method4254(String[] var0, long[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            if (var4 <= 120) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            long var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var10 = var2; var10 < var3; var10++) {
               if (var4 <= 120) {
                  throw new IllegalStateException();
               }

               if (var7 != null) {
                  if (var4 <= 120) {
                     throw new IllegalStateException();
                  }

                  if (null == var0[var10]) {
                     continue;
                  }

                  if (var4 <= 120) {
                     throw new IllegalStateException();
                  }

                  if (var0[var10].compareTo(var7) >= (var10 & 1)) {
                     continue;
                  }

                  if (var4 <= 120) {
                     return;
                  }
               }

               String var11 = var0[var10];
               var0[var10] = var0[var6];
               var0[var6] = var11;
               long var12 = var1[var10];
               var1[var10] = var1[var6];
               var1[var6++] = var12;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method4254(var0, var1, var2, var6 - 1, (byte)125);
            method4254(var0, var1, 1 + var6, var3, (byte)124);
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "go.ae(" + ')');
      }
   }
}
