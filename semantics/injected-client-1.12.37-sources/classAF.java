import java.awt.FontMetrics;
import java.util.Arrays;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("af")
public class classAF implements Callable {
   @ToRemove(unused = "true")
   @ObfuscatedName("ce")
   public static final int field144 = 98;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("az")
   final Buffer field143;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("he")
   static classVP field146;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("ig")
   static classVP field147;
   @ObfuscatedSignature(descriptor = "Lae;")
   @ObfuscatedName("af")
   final classAE field142;
   @ObfuscatedName("bf")
   static FontMetrics field145;

   classAF(classAC var1, Buffer var2, classAE var3) {
      this.this$0 = var1;
      this.field143 = var2;
      this.field142 = var3;
   }

   @ObfuscatedSignature(descriptor = "(ILpl;IZLdn;Ljava/lang/String;IIIIB)V")
   @ObfuscatedName("fk")
   static void method341(int var0, classPL var1, int var2, boolean var3, NPC var4, String var5, int var6, int var7, int var8, int var9, byte var10) {
      try {
         if (var1.method8930(936289412).vmethod546((byte)0)) {
            if (var10 == 7) {
               throw new IllegalStateException();
            }

            for (int var11 = 4; var11 >= 0; var11--) {
               if (!client.field822) {
                  if (var10 == 7) {
                     throw new IllegalStateException();
                  }

                  if (classGB.field2547) {
                     continue;
                  }

                  if (var10 == 7) {
                     throw new IllegalStateException();
                  }

                  if (!var4.method3445(var11, -94498273)) {
                     if (var10 == 7) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               String var12 = var1.method8930(936289412).vmethod551(var11, classLB.field4090, (byte)24);
               if (var3) {
                  if (var10 == 7) {
                     return;
                  }

                  if (null == var12) {
                     continue;
                  }

                  if (var10 == 7) {
                     return;
                  }

                  if (!var12.equalsIgnoreCase(classKK.field3776)) {
                     if (var10 == 7) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               if (!var3) {
                  if (var10 == 7) {
                     throw new IllegalStateException();
                  }

                  if (var12 != null) {
                     if (var10 == 7) {
                        return;
                     }

                     if (var12.equalsIgnoreCase(classKK.field3776)) {
                        if (var10 == 7) {
                           return;
                        }
                        continue;
                     }
                  }
               }

               if (client.field822) {
                  if (var10 == 7) {
                     throw new IllegalStateException();
                  }

                  var12 = classQM.method9652(var12, var11, (byte)-21);
               }

               if (var12 != null) {
                  if (var10 == 7) {
                     throw new IllegalStateException();
                  }

                  if (var3) {
                     if (var10 == 7) {
                        return;
                     }

                     if (client.field897 == classCK.field766) {
                        if (var10 == 7) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  label141: {
                     label187: {
                        if (var3) {
                           if (var10 == 7) {
                              throw new IllegalStateException();
                           }

                           if (client.field897 == classCK.field769) {
                              break label187;
                           }
                        }

                        if (classCK.field765 != client.field897) {
                           break label141;
                        }

                        if (var10 == 7) {
                           throw new IllegalStateException();
                        }

                        if (var1.field5320 * 1781570005 <= var2) {
                           break label141;
                        }

                        if (var10 == 7) {
                           return;
                        }
                     }

                     var0 = 2000;
                  }

                  int var13 = 0;
                  if (0 == var11) {
                     if (var10 == 7) {
                        throw new IllegalStateException();
                     }

                     var13 = 9 + var0;
                  }

                  if (1 == var11) {
                     if (var10 == 7) {
                        throw new IllegalStateException();
                     }

                     var13 = var0 + 10;
                  }

                  if (2 == var11) {
                     var13 = 11 + var0;
                  }

                  if (var11 == 3) {
                     if (var10 == 7) {
                        throw new IllegalStateException();
                     }

                     var13 = 12 + var0;
                  }

                  if (4 == var11) {
                     var13 = var0 + 13;
                  }

                  int var14 = Friend.method10155(var12, var5, var13, var6, var7, var8, -1, false, var9, -324749371);
                  classJC.method6354(var14, var1.method8930(936289412), var11, var5, var13, var6, var7, var8, var9, -1533141989);
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "af.fk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("az")
   public Object method337() {
      return this.field142.vmethod20(this.field143);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("af")
   public Object method338() {
      return this.field142.vmethod20(this.field143);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lej;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("qx")
   public static int method336(classEJ var0, Object var1, Object var2) {
      return var0 == null ? var0.method3902(var1, var1) : var0.method3901((Buddy)var1, (Buddy)var2, -1723306706);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IILup;Lkh;II)V")
   @ObfuscatedName("ag")
   static void method339(WorldView var0, int var1, int var2, classUP var3, classKH var4, int var5, int var6) {
      try {
         if (1 == var5) {
            if (var6 >= -1673958617) {
               throw new IllegalStateException();
            }

            NPC var7 = classCW.method2689(client.field941.method6533(-987724280), client.field814, 499194751);
            if (var7 != null) {
               if (var6 >= -1673958617) {
                  throw new IllegalStateException();
               }

               classNF.method7833(
                  var7.method3166((byte)4), var7.field1487 * -1547553299, var7.field1489 * -1272026483, var1, var2, var3, classCQ.field1221[1], var4, (byte)109
               );
            }
         } else if (var5 == 2) {
            if (var6 >= -1673958617) {
               throw new IllegalStateException();
            }

            WorldView var11 = client.field814.method1596(client.field941.method6535(1166741555), client.field941.method6537(-1955951477), -992137014);
            int var8 = classKY.method6605(client.field941.method6535(636704452) - -1444178379 * var11.field1709, 1247224829)
               + classKQ.method6540(client.field941, (byte)30);
            int var9 = classKY.method6605(client.field941.method6537(-1026635899) - -351145363 * var11.field1708, -415490596)
               + client.field941.method6544((byte)83);
            classNF.method7833(var11, var8, var9, var1, var2, var3, classCQ.field1221[1], var4, (byte)78);
         } else if (3 == var5) {
            if (var6 >= -1673958617) {
               throw new IllegalStateException();
            }

            Player var12 = classEN.method3930(client.field941.method6533(-839253239), client.field814, -1096730237);
            if (var12 != null) {
               if (var6 >= -1673958617) {
                  throw new IllegalStateException();
               }

               classNF.method7833(
                  var12.method3166((byte)7),
                  -1547553299 * var12.field1487,
                  -1272026483 * var12.field1489,
                  var1,
                  var2,
                  var3,
                  classCQ.field1221[1],
                  var4,
                  (byte)99
               );
            }
         } else if (var5 == 4) {
            int var13 = client.field941.method6533(-438197316);
            WorldEntity var14 = (WorldEntity)classIS.field3053.worldEntities.method13595(var13);
            if (null != var14) {
               if (var6 >= -1673958617) {
                  throw new IllegalStateException();
               }

               classNF.method7833(
                  classIS.field3053, var14.vmethod368(311606126), var14.vmethod371(-524024903), var1, var2, var3, classCQ.field1221[1], var4, (byte)47
               );
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "af.ag(" + ')');
      }
   }

   @Override
   public Object call() {
      try {
         return this.field142.vmethod20(this.field143);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "af.call(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Lcb;")
   @ObfuscatedName("ag")
   static classCB[] method335(byte var0) {
      try {
         return new classCB[]{
            classCB.field646,
            classCB.field641,
            classCB.field642,
            classCB.field640,
            classCB.field644,
            classCB.field643,
            classCB.field639,
            classCB.field645,
            classCB.field638
         };
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "af.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;III)V")
   @ObfuscatedName("ax")
   public static void method340(classTE var0, Object var1, int var2, int var3, int var4) {
      try {
         classOL.method8512(var0, 1327640383);
         if (var2 < 0) {
            if (var4 >= 30953652) {
               throw new IllegalStateException();
            }

            var2 = 0;
         }

         int var5;
         label46: {
            var5 = var2 + var3;
            if (var3 >= 0) {
               if (var4 >= 30953652) {
                  throw new IllegalStateException();
               }

               if (var5 >= 0) {
                  if (var5 <= var0.method10756(243125187)) {
                     break label46;
                  }

                  if (var4 >= 30953652) {
                     throw new IllegalStateException();
                  }
               }
            }

            var5 = var0.method10756(-228256047);
         }

         if (classYY.field7111 == var0.field6128) {
            Arrays.fill(var0.method10748(1721725735), var2, var5, ((Integer)var1).intValue());
         } else if (classYY.field7115 == var0.field6128) {
            if (var4 >= 30953652) {
               return;
            }

            Arrays.fill(var0.method10750(-1895332582), var2, var5, ((Long)var1).longValue());
         } else {
            Arrays.fill(classTE.method10753(var0, -136674534), var2, var5, var1);
         }

         var0.field6133 = true;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "af.ax(" + ')');
      }
   }
}
