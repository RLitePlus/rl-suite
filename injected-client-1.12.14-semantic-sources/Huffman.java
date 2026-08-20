import java.util.Date;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oq")
public class Huffman {
   @ObfuscatedName("ag")
   int[] keys;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final String field4691 = "Please try again later. If the problem ";
   @ObfuscatedName("at")
   byte[] bits;
   @ObfuscatedName("av")
   int[] masks;
   @ObfuscatedSignature(descriptor = "Ley;")
   @ObfuscatedName("ay")
   static UrlRequest World_request;
   @ToRemove(unused = "true")
   @ObfuscatedName("ep")
   static final int field4689 = 100;

   @ObfuscatedSignature(descriptor = "([BI[BIII)I")
   @ObfuscatedName("at")
   int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
      try {
         if (0 == var5) {
            if (var6 <= -1761705084) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var7 = 0;
            var5 += var4;
            int var8 = var2;

            while (true) {
               byte var9 = var1[var8];
               if (var9 < 0) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var7 = this.keys[var7];
               } else {
                  var7++;
               }

               int var10;
               if ((var10 = this.keys[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 <= -1761705084) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 64)) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var7 = this.keys[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.keys[var7]) < 0) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 <= -1761705084) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 32)) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var7 = this.keys[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.keys[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 <= -1761705084) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 16) != 0) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var7 = this.keys[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.keys[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 <= -1761705084) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 8) != 0) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var7 = this.keys[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.keys[var7]) < 0) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 <= -1761705084) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 4)) {
                  var7 = this.keys[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.keys[var7]) < 0) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 <= -1761705084) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 2)) {
                  var7 = this.keys[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.keys[var7]) < 0) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 1)) {
                  var7 = this.keys[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.keys[var7]) < 0) {
                  if (var6 <= -1761705084) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 <= -1761705084) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               var8++;
            }

            return var8 + 1 - var2;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "oq.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loq;[BII[BIB)I")
   @ObfuscatedName("ly")
   public static int method8646(Huffman var0, byte[] var1, int var2, int var3, byte[] var4, int var5, byte var6) {
      if (var0 == null) {
         var0.compress(var1, var2, var2, var1, var2, var6);
      }

      try {
         int var7 = 0;
         int var8 = var5 << 3;

         for (int var16 = var3 + var2; var2 < var16; var2++) {
            int var9 = var1[var2] & 255;
            int var10 = var0.masks[var9];
            byte var11 = var0.bits[var9];
            if (var11 == 0) {
               if (var6 >= 1) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException("" + var9);
            }

            int var12 = var8 >> 3;
            int var13 = var8 & 7;
            int var17 = var7 & -var13 >> 31;
            int var14 = (var11 + var13 - 1 >> 3) + var12;
            var13 += 24;
            var4[var12] = (byte)(var7 = var17 | var10 >>> var13);
            if (var12 >= var14) {
               if (var6 >= 1) {
                  throw new IllegalStateException();
               }
            } else {
               var12++;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if (var12 >= var14) {
                  if (var6 >= 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  var12++;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if (var12 >= var14) {
                     if (var6 >= 1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var12++;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 >>> var13);
                     if (var12 >= var14) {
                        if (var6 >= 1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var12++;
                        var13 -= 8;
                        var4[var12] = (byte)(var7 = var10 << -var13);
                     }
                  }
               }
            }

            var8 += var11;
         }

         return (7 + var8 >> 3) - var5;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "oq.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BII[BI)I")
   @ObfuscatedName("ag")
   int method8647(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var6 = 0;
      int var7 = var5 << 3;

      for (int var14 = var3 + var2; var2 < var14; var2++) {
         int var8 = var1[var2] & 255;
         int var9 = this.masks[var8];
         byte var10 = this.bits[var8];
         if (var10 == 0) {
            throw new RuntimeException("" + var8);
         }

         int var11 = var7 >> 3;
         int var12 = var7 & 7;
         int var15 = var6 & -var12 >> 31;
         int var13 = (var10 + var12 - 1 >> 3) + var11;
         var12 += 24;
         var4[var11] = (byte)(var6 = var15 | var9 >>> var12);
         if (var11 < var13) {
            var11++;
            var12 -= 8;
            var4[var11] = (byte)(var6 = var9 >>> var12);
            if (var11 < var13) {
               var11++;
               var12 -= 8;
               var4[var11] = (byte)(var6 = var9 >>> var12);
               if (var11 < var13) {
                  var11++;
                  var12 -= 8;
                  var4[var11] = (byte)(var6 = var9 >>> var12);
                  if (var11 < var13) {
                     var11++;
                     var12 -= 8;
                     var4[var11] = (byte)(var6 = var9 << -var12);
                  }
               }
            }
         }

         var7 += var10;
      }

      return (7 + var7 >> 3) - var5;
   }

   @ObfuscatedSignature(descriptor = "([BII[BI)I")
   @ObfuscatedName("an")
   int method8648(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var6 = 0;
      int var7 = var5 << 3;

      for (int var14 = var3 + var2; var2 < var14; var2++) {
         int var8 = var1[var2] & 255;
         int var9 = this.masks[var8];
         byte var10 = this.bits[var8];
         if (var10 == 0) {
            throw new RuntimeException("" + var8);
         }

         int var11 = var7 >> 3;
         int var12 = var7 & 7;
         int var15 = var6 & -var12 >> -1083251213;
         int var13 = (var10 + var12 - 1 >> 3) + var11;
         var12 += 24;
         var4[var11] = (byte)(var6 = var15 | var9 >>> var12);
         if (var11 < var13) {
            var11++;
            var12 -= 8;
            var4[var11] = (byte)(var6 = var9 >>> var12);
            if (var11 < var13) {
               var11++;
               var12 -= 8;
               var4[var11] = (byte)(var6 = var9 >>> var12);
               if (var11 < var13) {
                  var11++;
                  var12 -= 8;
                  var4[var11] = (byte)(var6 = var9 >>> var12);
                  if (var11 < var13) {
                     var11++;
                     var12 -= 8;
                     var4[var11] = (byte)(var6 = var9 << -var12);
                  }
               }
            }
         }

         var7 += var10;
      }

      return (7 + var7 >> 3) - var5;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("bw")
   static int method8654(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 == 4100) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var32 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               int var45 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var32 + var45;
               return 1;
            }
         } else if (var0 == 4101) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               String var31 = (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
               String var44 = (String)Interpreter.Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var31 + var44;
               return 1;
            }
         } else if (var0 == 4102) {
            String var30 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            int var43 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var30
               + Tile.intToString(var43, true, -358468941);
            return 1;
         } else if (var0 == 4103) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var29 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var29.toLowerCase();
               return 1;
            }
         } else if (var0 == 4104) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               int var28 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               long var42 = 86400000L * (11745L + var28);
               Interpreter.Interpreter_calendar.setTime(new Date(var42));
               int var53 = Interpreter.Interpreter_calendar.get(5);
               int var56 = Interpreter.Interpreter_calendar.get(2);
               int var9 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var53
                  + "-"
                  + Interpreter.Interpreter_MONTHS[var56]
                  + "-"
                  + var9;
               return 1;
            }
         } else if (4105 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               String var27 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
               String var41 = (String)Interpreter.Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
               if (null != class330.localPlayer.appearance) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  if (0 != -941255479 * class330.localPlayer.appearance.gender) {
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var41;
                     return 1;
                  }

                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var27;
               return 1;
            }
         } else if (4106 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               int var26 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Integer.toString(var26);
               return 1;
            }
         } else if (4107 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class209.method4886(
                  WorldMapIcon_1.compareStrings(
                     (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize],
                     (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1],
                     class352.clientLanguage,
                     (byte)-76
                  ),
                  (byte)-4
               );
               return 1;
            }
         } else if (4108 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var25 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               class408.Interpreter_intStackSize -= 708726074;
               int var40 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var50 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               byte[] var52 = ActorSpotAnim.archive13.getFile(var50, 0, 633948157);
               Font var55 = new Font(var52);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var55.lineCount(var25, var40);
               return 1;
            }
         } else if (var0 == 4109) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var24 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               class408.Interpreter_intStackSize -= 708726074;
               int var39 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var49 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               byte[] var51 = ActorSpotAnim.archive13.getFile(var49, 0, -103926347);
               Font var54 = new Font(var51);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54.lineWidth(var24, var39);
               return 1;
            }
         } else if (var0 == 4110) {
            SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
            String var23 = (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
            String var38 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1];
            if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var23;
            } else {
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var38;
            }

            return 1;
         } else if (var0 == 4111) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var22 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = AbstractFont.escapeBrackets(
                  var22
               );
               return 1;
            }
         } else if (4112 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var21 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               int var37 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var21 + (char)var37;
               return 1;
            }
         } else if (4113 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               int var20 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int[] var58 = Interpreter.Interpreter_intStack;
               int var60 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var62;
               if (class164.isCharPrintable((char)var20, (byte)-42)) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  var62 = 1;
               } else {
                  var62 = 0;
               }

               var58[var60] = var62;
               return 1;
            }
         } else if (var0 == 4114) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class189.isAlphaNumeric(
                     (char)var19, 1475777381
                  )
                  ? 1
                  : 0;
               return 1;
            }
         } else if (4115 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               int var18 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int[] var57 = Interpreter.Interpreter_intStack;
               int var59 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var61;
               if (ServerPacket.isCharAlphabetic((char)var18, (short)1270)) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  var61 = 1;
               } else {
                  var61 = 0;
               }

               var57[var59] = var61;
               return 1;
            }
         } else if (4116 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               int var17 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class341.isDigit((char)var17, -582013226)
                  ? 1
                  : 0;
               return 1;
            }
         } else if (var0 == 4117) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var16 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               if (var16 != null) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var16.length();
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 4118) {
            String var15 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            class408.Interpreter_intStackSize -= 708726074;
            int var36 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var48 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var15.substring(var36, var48);
            return 1;
         } else if (4119 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var14 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               StringBuilder var35 = new StringBuilder(var14.length());
               boolean var47 = false;

               for (int var7 = 0; var7 < var14.length(); var7++) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  char var8 = var14.charAt(var7);
                  if (var8 == '<') {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var47 = true;
                  } else if (var8 == '>') {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var47 = false;
                  } else if (!var47) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var35.append(var8);
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var35.toString();
               return 1;
            }
         } else if (var0 == 4120) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               String var13 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               int var34 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var13.indexOf(var34);
               return 1;
            }
         } else if (4121 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               String var12 = (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
               String var33 = (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize + 1];
               int var46 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12.indexOf(var33, var46);
               return 1;
            }
         } else if (var0 == 4122) {
            String var11 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var11.toUpperCase();
            return 1;
         } else if (var0 == 4123) {
            SecureRandomFuture.Interpreter_objectStackSize -= -1799073313;
            String var4 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
            String var5 = (String)Interpreter.Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
            String var6 = (String)Interpreter.Interpreter_objectStack[2 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
            if (null == class330.localPlayer.appearance) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var6;
                  return 1;
               }
            } else {
               switch (1035639301 * class330.localPlayer.appearance.field4386) {
                  case 0:
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4;
                     break;
                  case 1:
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var5;
                     break;
                  case 2:
                  default:
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var6;
               }

               return 1;
            }
         } else if (4124 == var0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var10002;
               if (null != class330.localPlayer.appearance) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  var10002 = class330.localPlayer.appearance.field4386 * 1035639301;
               } else {
                  var10002 = -1;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "oq.bw(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lay;)Z")
   @ObfuscatedName("go")
   public static boolean method8645(HttpMethod var0) {
      if (var0 == null) {
         var0.vmethod30();
      }

      return var0.field102;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loq;[BI[BII)I")
   @ObfuscatedName("fz")
   public static int method8651(Huffman var0, byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if (var0 == null) {
         var0.decompress(var1, var2, var1, var2, var2, var2);
      }

      if (0 == var5) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var4;
         int var7 = var2;

         while (true) {
            byte var8 = var1[var7];
            if (var8 < 0) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            int var9;
            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 64)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 773890877)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 16) != 0) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 8) != 0) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 4)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 2)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 1)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            var7++;
         }

         return var7 + 1 - var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loq;[BI[BII)I")
   @ObfuscatedName("mm")
   public static int method8652(Huffman var0, byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if (var0 == null) {
         var0.method8653(var1, var2, var1, var2, var2);
      }

      if (0 == var5) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var4;
         int var7 = var2;

         while (true) {
            byte var8 = var1[var7];
            if (var8 < 0) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            int var9;
            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 64)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & -1747625828)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 16) != 0) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 8) != 0) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 4)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 2)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 1)) {
               var6 = var0.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            var7++;
         }

         return var7 + 1 - var2;
      }
   }

   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("aj")
   int method8653(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if (0 == var5) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var4;
         int var7 = var2;

         while (true) {
            byte var8 = var1[var7];
            if (var8 < 0) {
               var6 = this.keys[var6];
            } else {
               var6++;
            }

            int var9;
            if ((var9 = this.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 64)) {
               var6 = this.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = this.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 32)) {
               var6 = this.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = this.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 16) != 0) {
               var6 = this.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = this.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 8) != 0) {
               var6 = this.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = this.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 4)) {
               var6 = this.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = this.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 2)) {
               var6 = this.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = this.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 1)) {
               var6 = this.keys[var6];
            } else {
               var6++;
            }

            if ((var9 = this.keys[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            var7++;
         }

         return var7 + 1 - var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ol")
   static final void changeGameOptions(int var0, int var1) {
      Scene.method5492(var0);

      try {
         class184.method4487((byte)117);
         Iterator var2 = client.worldViewManager.iterator();

         while (var2.hasNext()) {
            if (var1 != 1382603152) {
               throw new IllegalStateException();
            }

            WorldView var3 = (WorldView)var2.next();

            for (ObjectSound var4 = (ObjectSound)var3.method3080(-1604402731).last(); null != var4; var4 = (ObjectSound)var3.method3080(-1286862642).previous()) {
               if (var4.obj != null) {
                  var4.set((byte)0);
               }
            }
         }

         int var6 = TileItem.VarpDefinition_get(var0, 1139215175).type * 138999049;
         if (var6 != 0) {
            int var7 = Varps.Varps_main[var0];
            if (1 == var6) {
               if (var1 != 1382603152) {
                  throw new IllegalStateException();
               }

               if (1 == var7) {
                  UserComparator3.method3684(0.9);
               }

               if (2 == var7) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  UserComparator3.method3684(0.8);
               }

               if (var7 == 3) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  UserComparator3.method3684(0.7);
               }

               if (4 == var7) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  UserComparator3.method3684(0.6);
               }
            }

            if (var6 == 3) {
               if (0 == var7) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  LoginState.setMusicVolume(255, 66154502);
               }

               if (var7 == 1) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  LoginState.setMusicVolume(192, 1347975396);
               }

               if (var7 == 2) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  LoginState.setMusicVolume(128, -323164387);
               }

               if (var7 == 3) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  LoginState.setMusicVolume(64, 1056096255);
               }

               if (var7 == 4) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  LoginState.setMusicVolume(0, 729147284);
               }
            }

            if (var6 == 4) {
               if (var1 != 1382603152) {
                  return;
               }

               if (0 == var7) {
                  User.method10994(127, (byte)1);
               }

               if (var7 == 1) {
                  User.method10994(96, (byte)9);
               }

               if (var7 == 2) {
                  User.method10994(64, (byte)-20);
               }

               if (var7 == 3) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  User.method10994(32, (byte)-99);
               }

               if (4 == var7) {
                  User.method10994(0, (byte)60);
               }
            }

            if (5 == var6) {
               client.leftClickOpensMenu = var7 == 1;
            }

            if (var6 == 6) {
               if (var1 != 1382603152) {
                  throw new IllegalStateException();
               }

               client.chatEffects = 857307235 * var7;
            }

            if (9 == var6 && var1 != 1382603152) {
               throw new IllegalStateException();
            } else {
               if (var6 == 10) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  if (var7 == 0) {
                     class383.method8659(127, -1847847248);
                  }

                  if (1 == var7) {
                     if (var1 != 1382603152) {
                        throw new IllegalStateException();
                     }

                     class383.method8659(96, -173222719);
                  }

                  if (var7 == 2) {
                     if (var1 != 1382603152) {
                        throw new IllegalStateException();
                     }

                     class383.method8659(64, -771451758);
                  }

                  if (3 == var7) {
                     if (var1 != 1382603152) {
                        throw new IllegalStateException();
                     }

                     class383.method8659(32, -863233245);
                  }

                  if (4 == var7) {
                     if (var1 != 1382603152) {
                        return;
                     }

                     class383.method8659(0, -1564005205);
                  }
               }

               if (var6 == 17) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  client.followerIndex = (var7 & 65535) * -423164539;
               }

               if (var6 == 18) {
                  client.playerAttackOption = (AttackOption)GrandExchangeOffer.findEnumerated(MouseRecorder.method2645(1642043640), var7, (byte)1);
                  if (client.playerAttackOption == null) {
                     if (var1 != 1382603152) {
                        throw new IllegalStateException();
                     }

                     client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
                  }
               }

               if (var6 == 19) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  if (var7 == -1) {
                     if (var1 != 1382603152) {
                        throw new IllegalStateException();
                     }

                     client.combatTargetPlayerIndex = -1631284207;
                  } else {
                     client.combatTargetPlayerIndex = 1631284207 * (var7 & 2047);
                  }
               }

               if (22 == var6) {
                  if (var1 != 1382603152) {
                     throw new IllegalStateException();
                  }

                  client.npcAttackOption = (AttackOption)GrandExchangeOffer.findEnumerated(MouseRecorder.method2645(791802161), var7, (byte)1);
                  if (null == client.npcAttackOption) {
                     if (var1 != 1382603152) {
                        throw new IllegalStateException();
                     }

                     client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
                  }
               }
            }
         } else if (var1 != 1382603152) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oq.ol(" + ')');
      }
   }

   public Huffman(byte[] var1) {
      int var2 = var1.length;
      this.masks = new int[var2];
      this.bits = var1;
      int[] var3 = new int[33];
      this.keys = new int[8];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         byte var6 = var1[var5];
         if (0 != var6) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.masks[var5] = var8;
            int var9;
            if (0 != (var8 & var7)) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for (int var10 = var6 - 1; var10 >= 1; var10--) {
                  int var11 = var3[var10];
                  if (var11 != var8) {
                     break;
                  }

                  int var12 = 1 << 32 - var10;
                  if ((var11 & var12) != 0) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for (int var15 = var6 + 1; var15 <= 32; var15++) {
               if (var3[var15] == var8) {
                  var3[var15] = var9;
               }
            }

            int var16 = 0;

            for (int var17 = 0; var17 < var6; var17++) {
               int var18 = Integer.MIN_VALUE >>> var17;
               if ((var8 & var18) != 0) {
                  if (this.keys[var16] == 0) {
                     this.keys[var16] = var4;
                  }

                  var16 = this.keys[var16];
               } else {
                  var16++;
               }

               if (var16 >= this.keys.length) {
                  int[] var13 = new int[this.keys.length * 2];

                  for (int var14 = 0; var14 < this.keys.length; var14++) {
                     var13[var14] = this.keys[var14];
                  }

                  this.keys = var13;
               }

               var18 >>>= 1;
            }

            this.keys[var16] = ~var5;
            if (var16 >= var4) {
               var4 = var16 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BII[BIB)I")
   @ObfuscatedName("av")
   int compress(byte[] var1, int var2, int var3, byte[] var4, int var5, byte var6) {
      try {
         int var7 = 0;
         int var8 = var5 << 3;

         for (int var16 = var3 + var2; var2 < var16; var2++) {
            int var9 = var1[var2] & 255;
            int var10 = this.keys[var9];
            byte var11 = this.bits[var9];
            if (var11 == 0) {
               if (var6 >= 1) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException("" + var9);
            }

            int var12 = var8 >> 3;
            int var13 = var8 & 7;
            int var17 = var7 & -var13 >> 31;
            int var14 = (var11 + var13 - 1 >> 3) + var12;
            var13 += 24;
            var4[var12] = (byte)(var7 = var17 | var10 >>> var13);
            if (var12 >= var14) {
               if (var6 >= 1) {
                  throw new IllegalStateException();
               }
            } else {
               var12++;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if (var12 >= var14) {
                  if (var6 >= 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  var12++;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if (var12 >= var14) {
                     if (var6 >= 1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var12++;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 >>> var13);
                     if (var12 >= var14) {
                        if (var6 >= 1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var12++;
                        var13 -= 8;
                        var4[var12] = (byte)(var7 = var10 << -var13);
                     }
                  }
               }
            }

            var8 += var11;
         }

         return (7 + var8 >> 3) - var5;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "oq.av(" + 41);
      }
   }
}
