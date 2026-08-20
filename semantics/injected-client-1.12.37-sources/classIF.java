import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("if")
public class classIF {
   @ObfuscatedName("ap")
   long field2965;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2962 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2961 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2964 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field2960 = 12;
   @ObfuscatedName("au")
   public int field2958 = 1051425213;
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("ai")
   IterableNodeDeque field2959 = new IterableNodeDeque();
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2963 = 5;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   void method6196(Buffer var1) {
      this.field2965 = var1.method13059(2044571467);
      this.field2958 = var1.method13056((byte)1) * -1051425213;

      for (int var2 = Buffer.method13039(var1, -346779531); 0 != var2; var2 = Buffer.method13039(var1, -346779531)) {
         Object var3;
         if (3 == var2) {
            var3 = new classIG(this);
         } else if (var2 == 1) {
            var3 = new classHC(this);
         } else if (var2 == 13) {
            var3 = new classIY(this);
         } else if (4 == var2) {
            var3 = new classHS(this);
         } else if (6 == var2) {
            var3 = new classIC(this);
         } else if (var2 == 5) {
            var3 = new classIJ(this);
         } else if (var2 == 2) {
            var3 = new classIW(this);
         } else if (var2 == 7) {
            var3 = new classIN(this);
         } else if (14 == var2) {
            var3 = new classIZ(this);
         } else if (var2 == 8) {
            var3 = new classIK(this);
         } else if (9 == var2) {
            var3 = new classIL(this);
         } else if (var2 == 10) {
            var3 = new classIV(this);
         } else if (var2 == 11) {
            var3 = new classIO(this);
         } else if (var2 == 12) {
            var3 = new classIU(this);
         } else {
            if (var2 != 15) {
               throw new RuntimeException("");
            }

            var3 = new classIP(this);
         }

         ((classHB)var3).vmethod498(var1, -2133361549);
         IterableNodeDeque.method8156(this.field2959, (Node)var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("as")
   void method6197(Buffer var1) {
      this.field2965 = var1.method13059(271624158);
      this.field2958 = var1.method13056((byte)1) * -1051425213;

      for (int var2 = Buffer.method13039(var1, -346779531); 0 != var2; var2 = Buffer.method13039(var1, -346779531)) {
         Object var3;
         if (3 == var2) {
            var3 = new classIG(this);
         } else if (var2 == 1) {
            var3 = new classHC(this);
         } else if (var2 == 13) {
            var3 = new classIY(this);
         } else if (4 == var2) {
            var3 = new classHS(this);
         } else if (6 == var2) {
            var3 = new classIC(this);
         } else if (var2 == 5) {
            var3 = new classIJ(this);
         } else if (var2 == 2) {
            var3 = new classIW(this);
         } else if (var2 == 7) {
            var3 = new classIN(this);
         } else if (14 == var2) {
            var3 = new classIZ(this);
         } else if (var2 == 8) {
            var3 = new classIK(this);
         } else if (9 == var2) {
            var3 = new classIL(this);
         } else if (var2 == 10) {
            var3 = new classIV(this);
         } else if (var2 == 11) {
            var3 = new classIO(this);
         } else if (var2 == 12) {
            var3 = new classIU(this);
         } else {
            if (var2 != 15) {
               throw new RuntimeException("");
            }

            var3 = new classIP(this);
         }

         ((classHB)var3).vmethod498(var1, -1540742998);
         IterableNodeDeque.method8156(this.field2959, (Node)var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lif;Lxy;I)V")
   @ObfuscatedName("rz")
   public static void method6198(classIF var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method6201(var1, var2);
      } else {
         try {
            var0.field2965 = var1.method13059(592163377);
            var0.field2958 = var1.method13056((byte)1) * -1051425213;

            for (int var3 = Buffer.method13039(var1, -346779531); 0 != var3; var3 = Buffer.method13039(var1, -346779531)) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               Object var4;
               if (3 == var3) {
                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classIG(var0);
               } else if (var3 == 1) {
                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classHC(var0);
               } else if (var3 == 13) {
                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classIY(var0);
               } else if (4 == var3) {
                  var4 = new classHS(var0);
               } else if (6 == var3) {
                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classIC(var0);
               } else if (var3 == 5) {
                  var4 = new classIJ(var0);
               } else if (var3 == 2) {
                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classIW(var0);
               } else if (var3 == 7) {
                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classIN(var0);
               } else if (14 == var3) {
                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classIZ(var0);
               } else if (var3 == 8) {
                  if (var2 != 1871139444) {
                     return;
                  }

                  var4 = new classIK(var0);
               } else if (9 == var3) {
                  var4 = new classIL(var0);
               } else if (var3 == 10) {
                  if (var2 != 1871139444) {
                     return;
                  }

                  var4 = new classIV(var0);
               } else if (var3 == 11) {
                  var4 = new classIO(var0);
               } else if (var3 == 12) {
                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classIU(var0);
               } else {
                  if (var3 != 15) {
                     throw new RuntimeException("");
                  }

                  if (var2 != 1871139444) {
                     throw new IllegalStateException();
                  }

                  var4 = new classIP(var0);
               }

               ((classHB)var4).vmethod498(var1, -1411701108);
               IterableNodeDeque.method8156(var0.field2959, (Node)var4);
            }
         } catch (RuntimeException var5) {
            throw classEG.newRunException(var5, "if.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   void method6199(Buffer var1) {
      this.field2965 = var1.method13059(1324457612);
      this.field2958 = var1.method13056((byte)1) * -1051425213;

      for (int var2 = Buffer.method13039(var1, -346779531); 0 != var2; var2 = Buffer.method13039(var1, -346779531)) {
         Object var3;
         if (3 == var2) {
            var3 = new classIG(this);
         } else if (var2 == 1) {
            var3 = new classHC(this);
         } else if (var2 == 13) {
            var3 = new classIY(this);
         } else if (4 == var2) {
            var3 = new classHS(this);
         } else if (6 == var2) {
            var3 = new classIC(this);
         } else if (var2 == 5) {
            var3 = new classIJ(this);
         } else if (var2 == 2) {
            var3 = new classIW(this);
         } else if (var2 == 7) {
            var3 = new classIN(this);
         } else if (14 == var2) {
            var3 = new classIZ(this);
         } else if (var2 == 8) {
            var3 = new classIK(this);
         } else if (9 == var2) {
            var3 = new classIL(this);
         } else if (var2 == 10) {
            var3 = new classIV(this);
         } else if (var2 == 11) {
            var3 = new classIO(this);
         } else if (var2 == 12) {
            var3 = new classIU(this);
         } else {
            if (var2 != 15) {
               throw new RuntimeException("");
            }

            var3 = new classIP(this);
         }

         ((classHB)var3).vmethod498(var1, -1491853646);
         IterableNodeDeque.method8156(this.field2959, (Node)var3);
      }
   }

   public classIF(Buffer var1) {
      method6198(this, var1, 1871139444);
   }

   @ObfuscatedSignature(descriptor = "(Liq;I)V")
   @ObfuscatedName("af")
   public void method6204(ClanSettings var1, int var2) {
      try {
         if (var1.field3032 * -7981298375333928091L == this.field2965) {
            if (var1.field3013 * 573608791 == -1560054165 * this.field2958) {
               for (classHB var3 = (classHB)this.field2959.method8167(); null != var3; var3 = (classHB)classAAX.method294(this.field2959)) {
                  if (var2 == -616858415) {
                     throw new IllegalStateException();
                  }

                  var3.vmethod499(var1, (byte)123);
               }

               var1.field3013 += -1766455193;
               return;
            }

            if (var2 == -616858415) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "if.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lif;Lxy;)V")
   @ObfuscatedName("vp")
   public static void method6200(classIF var0, Buffer var1) {
      if (var0 == null) {
         var0.method6199(var1);
      }

      var0.field2965 = var1.method13059(608776554);
      var0.field2958 = var1.method13056((byte)1) * -1051425213;

      for (int var2 = Buffer.method13039(var1, -346779531); 0 != var2; var2 = Buffer.method13039(var1, -346779531)) {
         Object var3;
         if (3 == var2) {
            var3 = new classIG(var0);
         } else if (var2 == 1) {
            var3 = new classHC(var0);
         } else if (var2 == 13) {
            var3 = new classIY(var0);
         } else if (4 == var2) {
            var3 = new classHS(var0);
         } else if (6 == var2) {
            var3 = new classIC(var0);
         } else if (var2 == 5) {
            var3 = new classIJ(var0);
         } else if (var2 == 2) {
            var3 = new classIW(var0);
         } else if (var2 == 7) {
            var3 = new classIN(var0);
         } else if (14 == var2) {
            var3 = new classIZ(var0);
         } else if (var2 == 8) {
            var3 = new classIK(var0);
         } else if (9 == var2) {
            var3 = new classIL(var0);
         } else if (var2 == 10) {
            var3 = new classIV(var0);
         } else if (var2 == 11) {
            var3 = new classIO(var0);
         } else if (var2 == 12) {
            var3 = new classIU(var0);
         } else {
            if (var2 != 15) {
               throw new RuntimeException("");
            }

            var3 = new classIP(var0);
         }

         ((classHB)var3).vmethod498(var1, -1556884441);
         IterableNodeDeque.method8156(var0.field2959, (Node)var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;)Ljava/util/ArrayList;")
   @ObfuscatedName("hu")
   public static ArrayList method6206(classMA var0) {
      return var0.field4456.field4569;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;IIII)V")
   @ObfuscatedName("xx")
   public static void method6202(classGY var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.toString();
      }

      var0.field2741 += var1 * -1593759415;
      var0.field2743 += var2 * -1271660423;
      var0.field2742 += var3 * 1296710373;
      var0.method5923(var4 + var0.field2744 * 1808185059, -437316553);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   public void method6205(ClanSettings var1) {
      if (var1.field3032 * -7981298375333928091L == this.field2965 && var1.field3013 * 573608791 == -1560054165 * this.field2958) {
         for (classHB var2 = (classHB)this.field2959.method8167(); null != var2; var2 = (classHB)classAAX.method294(this.field2959)) {
            var2.vmethod499(var1, (byte)52);
         }

         var1.field3013 += -1766455193;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "([FI)V")
   @ObfuscatedName("ab")
   static void method6208(float[] var0, int var1) {
      try {
         if (classST.field6039 + var0[0] < 1.3333334F) {
            if (var1 != -850399243) {
               return;
            }

            float var2 = var0[0] - 2.0F;
            float var3 = var0[0] - 1.0F;
            float var4 = (float)Math.sqrt(var2 * var2 - var3 * 4.0F * var3);
            float var5 = (-var2 + var4) * 0.5F;
            if (classST.field6039 + var0[1] > var5) {
               if (var1 != -850399243) {
                  return;
               }

               var0[1] = var5 - classST.field6039;
            } else {
               var5 = 0.5F * (-var2 - var4);
               if (var0[1] < classST.field6039 + var5) {
                  var0[1] = var5 + classST.field6039;
               }
            }
         } else {
            var0[0] = 1.3333334F - classST.field6039;
            var0[1] = 0.33333334F - classST.field6039;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "if.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("aj")
   static void method6207(int var0, int var1, int var2, int var3, byte var4) {
      try {
         classNP.field4703 = var0 * 173745189;
         classNP.field4702 = -1367216911 * var1;
         classNP.field4696 = -269856411 * var2;
         classNP.field4701 = -1506539367 * var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "if.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)I")
   @ObfuscatedName("oa")
   public static int method6203(classGN var0) {
      return var0.field2626 * 158094804;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   void method6201(Buffer var1, int var2) {
      try {
         this.field2965 = var1.method13059(592163377);
         this.field2958 = var1.method13100((byte)1) * -1051425213;

         for (int var3 = Buffer.method13039(var1, -346779531); 0 != var3; var3 = Buffer.method13039(var1, -346779531)) {
            if (var2 != 1871139444) {
               throw new IllegalStateException();
            }

            Object var4;
            if (3 == var3) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classIG(this);
            } else if (var3 == 1) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classHC(this);
            } else if (var3 == 13) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classIY(this);
            } else if (4 == var3) {
               var4 = new classHS(this);
            } else if (6 == var3) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classIC(this);
            } else if (var3 == 5) {
               var4 = new classIJ(this);
            } else if (var3 == 2) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classIW(this);
            } else if (var3 == 7) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classIN(this);
            } else if (14 == var3) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classIZ(this);
            } else if (var3 == 8) {
               if (var2 != 1871139444) {
                  return;
               }

               var4 = new classIK(this);
            } else if (9 == var3) {
               var4 = new classIL(this);
            } else if (var3 == 10) {
               if (var2 != 1871139444) {
                  return;
               }

               var4 = new classIV(this);
            } else if (var3 == 11) {
               var4 = new classIO(this);
            } else if (var3 == 12) {
               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classIU(this);
            } else {
               if (var3 != 15) {
                  throw new RuntimeException("");
               }

               if (var2 != 1871139444) {
                  throw new IllegalStateException();
               }

               var4 = new classIP(this);
            }

            ((classHB)var4).vmethod498(var1, -1411701108);
            IterableNodeDeque.method8156(this.field2959, (Node)var4);
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "if.az(" + ')');
      }
   }
}
