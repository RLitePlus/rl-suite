import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fo")
class classFO implements Callable {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field1824 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field1823 = 20;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field1825 = 25;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   public Object method4031() {
      classFY.method4158(this.this$0, this.val$p, this.val$version, 590836253);
      return null;
   }

   @Override
   public Object call() {
      try {
         classFY.method4158(this.this$0, this.val$p, this.val$version, -1334730354);
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "fo.call(" + ')');
      }
   }

   classFO(classFY var1, Buffer var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   @ObfuscatedSignature(descriptor = "([I[JIIB)V")
   @ObfuscatedName("aw")
   public static void method4033(int[] var0, long[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            if (var4 <= 1) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            int var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            long var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;
            byte var10000;
            if (var7 == Integer.MAX_VALUE) {
               if (var4 <= 1) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var10 = var10000;

            for (int var11 = var2; var11 < var3; var11++) {
               if (var4 <= 1) {
                  throw new IllegalStateException();
               }

               if (var0[var11] < (var11 & var10) + var7) {
                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  int var12 = var0[var11];
                  var0[var11] = var0[var6];
                  var0[var6] = var12;
                  long var13 = var1[var11];
                  var1[var11] = var1[var6];
                  var1[var6++] = var13;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method4033(var0, var1, var2, var6 - 1, (byte)36);
            method4033(var0, var1, 1 + var6, var3, (byte)109);
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "fo.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("at")
   static final boolean method4032(char var0, byte var1) {
      try {
         if (160 != var0) {
            if (var1 != -1) {
               throw new IllegalStateException();
            }

            if (' ' != var0) {
               if (var1 != -1) {
                  throw new IllegalStateException();
               }

               if (var0 != '_') {
                  if (var0 != '-') {
                     return false;
                  }

                  if (var1 != -1) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fo.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bf")
   static int method4034(int var0, Script var1, boolean var2, int var3) {
      try {
         if (4200 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var26 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class150.ItemDefinition_get(
                     var26, -1329161253
                  )
                  .name;
               return 1;
            }
         } else if (var0 == 4201) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var25 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var35 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               ItemComposition var37 = class150.ItemDefinition_get(var25, -1336721803);
               if (var35 >= 1) {
                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }

                  if (var35 <= 5 && null != var37.groundActions[var35 - 1]) {
                     if (var3 != -125656445) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var37.groundActions[var35
                        - 1];
                     return 1;
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (4202 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var24 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var34 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               ItemComposition var36 = class150.ItemDefinition_get(var24, -26098292);
               if (var34 >= 1) {
                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }

                  if (var34 <= 5) {
                     if (var3 != -125656445) {
                        throw new IllegalStateException();
                     }

                     if (var36.inventoryActions[var34 - 1] != null) {
                        if (var3 != -125656445) {
                           throw new IllegalStateException();
                        }

                        Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var36.inventoryActions[var34
                           - 1];
                        return 1;
                     }
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (var0 == 4222) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var23 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var33 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               int var6 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
               ItemComposition var7 = class150.ItemDefinition_get(var23, -1064659384);
               String var8 = null;
               if (var33 >= 1) {
                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }

                  if (var33 <= 5) {
                     if (var3 != -125656445) {
                        throw new IllegalStateException();
                     }

                     if (null != var7.inventoryActions[var33 - 1]) {
                        if (var3 != -125656445) {
                           throw new IllegalStateException();
                        }

                        if (var7.subOps != null) {
                           if (var3 != -125656445) {
                              throw new IllegalStateException();
                           }

                           if (var7.subOps[var33 - 1] != null && var6 >= 1 && var6 <= var7.subOps[var33 - 1].length) {
                              if (var3 != -125656445) {
                                 throw new IllegalStateException();
                              }

                              var8 = var7.subOps[var33 - 1][var6 - 1];
                           }
                        }
                     }
                  }
               }

               Object[] var38 = Interpreter.Interpreter_objectStack;
               int var40 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
               String var41;
               if (var8 != null) {
                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }

                  var41 = var8;
               } else {
                  var41 = "";
               }

               var38[var40] = var41;
               return 1;
            }
         } else if (4203 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var22 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(
                        var22, -921837809
                     )
                     .price
                  * 1824214797;
               return 1;
            }
         } else if (var0 == 4204) {
            int var21 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int[] var10000 = Interpreter.Interpreter_intStack;
            int var39 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            byte var10002;
            if (class150.ItemDefinition_get(var21, -152348831).isStackable * 1515235515 == 1) {
               if (var3 != -125656445) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            var10000[var39] = var10002;
            return 1;
         } else if (4205 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var20 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               ItemComposition var32 = class150.ItemDefinition_get(var20, -962317520);
               if (var32.noteTemplate * 388376999 == -1) {
                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }

                  if (var32.note * 98718905 >= 0) {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 98718905 * var32.note;
                     return 1;
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var20;
               return 1;
            }
         } else if (4206 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               ItemComposition var31 = class150.ItemDefinition_get(var19, -300261160);
               if (var31.noteTemplate * 388376999 >= 0) {
                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }

                  if (98718905 * var31.note >= 0) {
                     if (var3 != -125656445) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var31.note * 98718905;
                     return 1;
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var19;
               return 1;
            }
         } else if (var0 == 4207) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var18 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(
                        var18, -518624337
                     )
                     .isTradable
                  ? 1
                  : 0;
               return 1;
            }
         } else if (var0 == 4208) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var17 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               ItemComposition var30 = class150.ItemDefinition_get(var17, -764974436);
               if (var30.placeholderTemplate * 413316061 == -1) {
                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }

                  if (var30.placeholder * -1134820861 >= 0) {
                     if (var3 != -125656445) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1134820861 * var30.placeholder;
                     return 1;
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var17;
               return 1;
            }
         } else if (4209 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var16 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               ItemComposition var29 = class150.ItemDefinition_get(var16, -1220631864);
               if (var29.placeholderTemplate * 413316061 >= 0 && -1134820861 * var29.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var29.placeholder * -1134820861;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var16;
               }

               return 1;
            }
         } else if (var0 == 4210) {
            String var15 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            int var28 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            boolean var10001;
            if (1 == var28) {
               if (var3 != -125656445) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            class408.findItemDefinitions(var15, var10001, -1213394640);
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class136.foundItemIdCount * -259451539;
            return 1;
         } else if (4211 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               if (null != class468.foundItemIds) {
                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }

                  if (1501959967 * AbstractByteArrayCopier.foundItemIndex < class136.foundItemIdCount * -259451539) {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class468.foundItemIds[(
                                 AbstractByteArrayCopier.foundItemIndex += 1616815327
                              )
                              * 1501959967
                           - 1]
                        & '\uffff';
                     return 1;
                  }

                  if (var3 != -125656445) {
                     throw new IllegalStateException();
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               return 1;
            }
         } else if (4212 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               AbstractByteArrayCopier.foundItemIndex = 0;
               return 1;
            }
         } else if (4213 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var14 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int var27 = class150.ItemDefinition_get(var14, -1835688253).getShiftClickIndex(1650304017);
               if (var27 == -1) {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var27;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1 + var27;
               }

               return 1;
            }
         } else if (var0 == 4214) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var13 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(
                        var13, -996010131
                     )
                     .maleModel
                  * -1427799695;
               return 1;
            }
         } else if (var0 == 4215) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var12 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(
                        var12, -229350791
                     )
                     .maleModel1
                  * -1551751121;
               return 1;
            }
         } else if (var0 == 4216) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var11 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class150.ItemDefinition_get(
                        var11, -1074499431
                     )
                     .maleModel2
                  * 1456474147;
               return 1;
            }
         } else if (var0 == 4217) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var10 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               ItemComposition var5 = class150.ItemDefinition_get(var10, -1620341538);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1609347271 * var5.field2605;
               return 1;
            }
         } else if (4218 == var0) {
            if (var3 != -125656445) {
               throw new IllegalStateException();
            } else {
               int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class150.ItemDefinition_get(
                     var4, -240194811
                  )
                  .examine;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "fo.bf(" + 41);
      }
   }
}
