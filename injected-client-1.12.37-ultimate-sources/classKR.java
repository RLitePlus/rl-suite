import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kr")
public class classKR implements classXZ {
   @ObfuscatedName("ag")
   final int field4009;
   @ObfuscatedSignature(descriptor = "Lkr;")
   @ObfuscatedName("af")
   public static final classKR field4008 = new classKR(1, 1);
   @ObfuscatedSignature(descriptor = "Lkr;")
   @ObfuscatedName("az")
   public static final classKR field4006 = new classKR(0, 0);
   @ObfuscatedName("ab")
   final int field4010;
   @ObfuscatedSignature(descriptor = "Lkr;")
   @ObfuscatedName("ae")
   public static final classKR field4007 = new classKR(2, 2);
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field4011 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field4012 = 17;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return -1109034235 * this.field4009;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return -1109034235 * this.field4009;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "kr.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return -1109034235 * this.field4009;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("cv")
   static int method6558(int var0, classBL var1, boolean var2, byte var3) {
      try {
         if (7900 == var0) {
            if (var3 >= 96) {
               throw new IllegalStateException();
            } else {
               int var4 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               client.field882 = Math.max(var4, 0) * 1054231967;
               return 1;
            }
         } else if (var0 == 7901) {
            if (var3 >= 96) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = 1387630175 * client.field882;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "kr.cv(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(CLxo;B)C")
   @ObfuscatedName("af")
   static char method6556(char var0, classXO var1, byte var2) {
      try {
         if (var0 >= 192) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (var0 >= 192 && var0 <= 198) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 'A';
               }

               if (199 == var0) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 'C';
               }

               if (var0 >= 200) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 203) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     return 'E';
                  }
               }

               if (var0 >= 204) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 207) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     return 'I';
                  }
               }

               if (209 == var0) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (classXO.field6894 != var1) {
                     return 'N';
                  }
               }

               if (var0 >= 210 && var0 <= 214) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 'O';
               }

               if (var0 >= 217) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 220) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     return 'U';
                  }
               }

               if (var0 == 221) {
                  return 'Y';
               }

               if (var0 == 223) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 's';
               }

               if (var0 >= 224 && var0 <= 230) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 'a';
               }

               if (231 == var0) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 'c';
               }

               if (var0 >= 232) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 235) {
                     return 'e';
                  }
               }

               if (var0 >= 236) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 239) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     return 'i';
                  }
               }

               if (241 == var0 && classXO.field6894 != var1) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 'n';
               }

               if (var0 >= 242) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 246) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     return 'o';
                  }
               }

               if (var0 >= 249) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 252) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     return 'u';
                  }
               }

               if (253 == var0) {
                  return 'y';
               }

               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (var0 == 255) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 'y';
               }
            }
         }

         if (338 == var0) {
            return 'O';
         } else if (var0 == 339) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            } else {
               return 'o';
            }
         } else if (var0 != 376) {
            return var0;
         } else if (var2 >= 0) {
            throw new IllegalStateException();
         } else {
            return 'Y';
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "kr.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lkr;")
   @ObfuscatedName("as")
   public static classKR[] method6554() {
      return new classKR[]{field4006, field4008, field4007};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lkr;")
   @ObfuscatedName("ax")
   public static classKR[] method6555() {
      return new classKR[]{field4006, field4008, field4007};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return -1109034235 * this.field4009;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIB)V")
   @ObfuscatedName("ay")
   public static void method6557(ArrayList var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         classNP.field4699.clear();
         classNP.field4699.addAll(var0);
         classIF.method6207(var1, var2, var3, var4, (byte)-128);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "kr.ay(" + ')');
      }
   }

   classKR(int var1, int var2) {
      this.field4010 = 859297731 * var1;
      this.field4009 = var2 * 212146637;
   }
}
