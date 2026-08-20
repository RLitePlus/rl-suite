import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dx")
public final class classDX {
   @ObfuscatedName("ag")
   static int field1660 = 1333158646;
   @ObfuscatedName("af")
   int field1655;
   @ObfuscatedName("as")
   static int field1659 = -244097027;
   @ObfuscatedName("ab")
   static int field1657 = 923556279;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   public static final int field1663 = 73;
   @ObfuscatedName("az")
   ArrayList field1654 = new ArrayList(10);
   @ObfuscatedName("ae")
   static int field1656 = 0;
   @ObfuscatedName("ax")
   static int field1658 = -2038447187;
   @ToRemove(unused = "true")
   @ObfuscatedName("cu")
   public static final int field1664 = 1008;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field1661 = 10;
   @ObfuscatedName("ba")
   static int field1662;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method3682() {
      this.field1655 = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("az")
   void method3679(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < var1; var3++) {
            if (var2 <= -1309880290) {
               throw new IllegalStateException();
            }

            this.field1654.add(new classDB());
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "dx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldx;IIIIIB)V")
   @ObfuscatedName("nx")
   public static void method3690(classDX var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if (var0 == null) {
         var0.method3695(var1, var1, var1, var1, var1, var6);
      }

      try {
         if (var4 == var2) {
            if (var6 == 1) {
               return;
            }

            if (var2 != -1 && var5 != var3) {
               if (var6 == 1) {
                  throw new IllegalStateException();
               }

               var0.method3689(-871565127 * field1658, var1, -1, var2, -1, var5 - var3, -2035575510);
               return;
            }
         }

         if (-1 == var2) {
            if (var6 == 1) {
               return;
            }

            if (-1 != var4) {
               if (var6 == 1) {
                  throw new IllegalStateException();
               }

               if (var5 > 0) {
                  if (var6 == 1) {
                     throw new IllegalStateException();
                  }

                  boolean var11 = false;

                  for (int var12 = 0; var12 < var0.field1655 * -1432564885; var12++) {
                     if (var6 == 1) {
                        throw new IllegalStateException();
                     }

                     classDB var13 = (classDB)var0.field1654.get(var12);
                     if (-1315156953 * var13.field1374 == field1660 * 48170419) {
                        if (var6 == 1) {
                           throw new IllegalStateException();
                        }

                        if (1073934853 * var13.field1368 == var4) {
                           if (var6 == 1) {
                              return;
                           }

                           if (var5 == var13.field1373 * -979715423) {
                              if (var6 == 1) {
                                 throw new IllegalStateException();
                              }

                              var13.field1374 = 788642921 * field1659;
                              var13.field1369 = var1 * 881833361;
                              var13.field1371 = 1839559751;
                              var13.field1373 = 1907644063;
                              var11 = true;
                              break;
                           }
                        }
                     }
                  }

                  if (!var11) {
                     if (var6 == 1) {
                        throw new IllegalStateException();
                     }

                     var0.method3689(-1231891449 * field1657, var1, -1, var4, -1, var5, -534858038);
                  }

                  return;
               }
            }
         }

         if (var2 != -1) {
            if (var6 == 1) {
               return;
            }

            if (var4 == -1) {
               if (var6 == 1) {
                  return;
               }

               if (var3 > 0) {
                  if (var6 == 1) {
                     throw new IllegalStateException();
                  }

                  boolean var7 = false;

                  for (int var8 = 0; var8 < var0.field1655 * -1432564885; var8++) {
                     if (var6 == 1) {
                        throw new IllegalStateException();
                     }

                     classDB var9 = (classDB)var0.field1654.get(var8);
                     if (-1231891449 * field1657 == var9.field1374 * -1315156953 && var9.field1368 * 1073934853 == var2) {
                        if (var6 == 1) {
                           return;
                        }

                        if (var9.field1373 * -979715423 == var3) {
                           if (var6 == 1) {
                              throw new IllegalStateException();
                           }

                           var9.field1374 = field1659 * 788642921;
                           var9.field1369 = var1 * 881833361;
                           var9.field1371 = var9.field1368 * -884237155;
                           var9.field1368 = -644877005;
                           var9.field1373 = 1907644063;
                           var7 = true;
                           break;
                        }
                     }
                  }

                  if (!var7) {
                     if (var6 == 1) {
                        throw new IllegalStateException();
                     }

                     var0.method3689(48170419 * field1660, var1, -1, var2, -1, var3, -1141808045);
                  }

                  return;
               }
            }
         }

         if (-1 != var2) {
            if (var6 == 1) {
               return;
            }

            if (-1 != var4) {
               if (var6 == 1) {
                  throw new IllegalStateException();
               }

               if (var2 != var4) {
                  if (var6 == 1) {
                     throw new IllegalStateException();
                  }

                  var0.method3689(48170419 * field1660, var1, -1, var2, -1, var3, 295011751);
                  var0.method3689(field1657 * -1231891449, var1, -1, var4, -1, var5, -16557743);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "dx.ab(" + ')');
      }
   }

   classDX() {
      this.field1655 = 0;
      this.method3679(10, 324573946);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("au")
   void method3691(int var1, int var2, int var3, int var4, int var5) {
      if (var4 == var2 && var2 != -1 && var5 != var3) {
         this.method3689(-871565127 * field1658, var1, -1, var2, -1, var5 - var3, 3288651);
      } else if (-1 == var2 && -1 != var4 && var5 > 0) {
         boolean var9 = false;

         for (int var10 = 0; var10 < this.field1655 * -1432564885; var10++) {
            classDB var11 = (classDB)this.field1654.get(var10);
            if (-1315156953 * var11.field1374 == field1660 * 48170419 && 1073934853 * var11.field1368 == var4 && var5 == var11.field1373 * -979715423) {
               var11.field1374 = 788642921 * field1659;
               var11.field1369 = var1 * 881833361;
               var11.field1371 = 1839559751;
               var11.field1373 = 1907644063;
               var9 = true;
               break;
            }
         }

         if (!var9) {
            this.method3689(-1231891449 * field1657, var1, -1, var4, -1, var5, -1694606632);
         }
      } else if (var2 != -1 && var4 == -1 && var3 > 0) {
         boolean var6 = false;

         for (int var7 = 0; var7 < this.field1655 * -1432564885; var7++) {
            classDB var8 = (classDB)this.field1654.get(var7);
            if (-1231891449 * field1657 == var8.field1374 * -1315156953 && var8.field1368 * 1073934853 == var2 && var8.field1373 * -979715423 == var3) {
               var8.field1374 = field1659 * 788642921;
               var8.field1369 = var1 * 881833361;
               var8.field1371 = var8.field1368 * -884237155;
               var8.field1368 = -644877005;
               var8.field1373 = 1907644063;
               var6 = true;
               break;
            }
         }

         if (!var6) {
            this.method3689(48170419 * field1660, var1, -1, var2, -1, var3, -2041427219);
         }
      } else if (-1 != var2 && -1 != var4 && var2 != var4) {
         this.method3689(48170419 * field1660, var1, -1, var2, -1, var3, -1978356816);
         this.method3689(field1657 * -1231891449, var1, -1, var4, -1, var5, -780192499);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;I)V")
   @ObfuscatedName("wz")
   public static void method3680(classDX var0, int var1) {
      if (var0 == null) {
         var0.method3689(var1, var1, var1, var1, var1, var1, var1);
      } else {
         for (int var2 = 0; var2 < var1; var2++) {
            var0.field1654.add(new classDB());
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method3696() {
      boolean var5;
      do {
         int var1 = -1;
         int var2 = -1;
         int var3 = -1;
         int var4 = -1;
         var5 = false;

         for (int var6 = 1; var6 < this.field1655 * -1496345016; var6++) {
            classDB var7 = (classDB)this.field1654.get(var6);
            classDB var8 = (classDB)this.field1654.get(var6 - 1);
            if (var1 == -1
               && -1315156953 * var8.field1374 == field1660 * 48170419
               && var7.field1374 * -1315156953 == field1657 * -1231891449
               && 1233999159 * var8.field1370 == var7.field1370 * 1273737248) {
               var1 = -1159210771 * var7.field1370;
               var2 = var6;
               var3 = 1424160727 * var8.field1368;
               var4 = -754790258 * var7.field1368;
            } else if (-1 != var1
               && var8.field1374 * -1315156953 == field1660 * 48170419
               && -1315156953 * var7.field1374 == -1231891449 * field1657
               && var8.field1370 * -1066335148 == 747639308 * var7.field1370
               && 1073934853 * var8.field1368 == var4
               && var3 == 32472027 * var7.field1368) {
               classDB var9 = (classDB)this.field1654.get(var2);
               classDB var10 = (classDB)this.field1654.get(var2 - 1);
               var10.field1374 = 40822627 * field1656;
               var9.field1374 = field1656 * -1210143563;
               var7.field1374 = -1210143563 * field1656;
               var8.field1374 = field1659 * 788642921;
               var8.field1369 = 1269797420 * var10.field1370;
               var8.field1371 = -884237155 * var10.field1368;
               var8.field1373 = 1907644063;
               var5 = true;
               break;
            }
         }
      } while (var5);
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("as")
   void method3699(int var1, byte var2) {
      try {
         for (int var3 = 0; var3 < -1432564885 * this.field1655; var3++) {
            if (var2 <= 1) {
               return;
            }

            classDB var4 = (classDB)this.field1654.get(var3);
            if (var4.field1374 * -1315156953 != 0) {
               this.method3701(var1, var4, -1566630420);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "dx.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ap")
   void method3692(int var1, int var2, int var3, int var4, int var5) {
      if (var4 == var2 && var2 != -1 && var5 != var3) {
         this.method3689(-871565127 * field1658, var1, -1, var2, -1, var5 - var3, 124551308);
      } else if (-1 == var2 && -1 != var4 && var5 > 0) {
         boolean var9 = false;

         for (int var10 = 0; var10 < this.field1655 * 1832365537; var10++) {
            classDB var11 = (classDB)this.field1654.get(var10);
            if (-385900675 * var11.field1374 == field1660 * 48170419 && -2140491868 * var11.field1368 == var4 && var5 == var11.field1373 * -1546530852) {
               var11.field1374 = -1260695697 * field1659;
               var11.field1369 = var1 * 881833361;
               var11.field1371 = 2095918642;
               var11.field1373 = 1907644063;
               var9 = true;
               break;
            }
         }

         if (!var9) {
            this.method3689(-1231891449 * field1657, var1, -1, var4, -1, var5, 343829905);
         }
      } else if (var2 != -1 && var4 == -1 && var3 > 0) {
         boolean var6 = false;

         for (int var7 = 0; var7 < this.field1655 * -1432564885; var7++) {
            classDB var8 = (classDB)this.field1654.get(var7);
            if (-1231891449 * field1657 == var8.field1374 * -1315156953 && var8.field1368 * 1073934853 == var2 && var8.field1373 * -979715423 == var3) {
               var8.field1374 = field1659 * 1368782225;
               var8.field1369 = var1 * -1378943654;
               var8.field1371 = var8.field1368 * 1092944882;
               var8.field1368 = 818872060;
               var8.field1373 = -1611312961;
               var6 = true;
               break;
            }
         }

         if (!var6) {
            this.method3689(48170419 * field1660, var1, -1, var2, -1, var3, -1108762410);
         }
      } else if (-1 != var2 && -1 != var4 && var2 != var4) {
         this.method3689(2051642630 * field1660, var1, -1, var2, -1, var3, -797484463);
         this.method3689(field1657 * -1231891449, var1, -1, var4, -1, var5, -66908913);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILdb;I)V")
   @ObfuscatedName("ax")
   void method3701(int var1, classDB var2, int var3) {
      try {
         Object[] var4 = new Object[]{
            var1,
            -1315156953 * var2.field1374,
            -1159210771 * var2.field1370,
            -784749711 * var2.field1369,
            1073934853 * var2.field1368,
            var2.field1371 * 734399113,
            var2.field1373 * -979715423
         };
         ScriptEvent var5 = classZS.method14182(classCA.method1392(18, -1462926859).method14145(var4, (byte)2), (byte)126);
         classSZ.method10729(var5, -427479397);
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "dx.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method3683() {
      this.field1655 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;IIIII)V")
   @ObfuscatedName("hw")
   public static void method3693(classDX var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method3688(var1, var1, var1, var1, var1, var1);
      }

      if (var4 == var2 && var2 != -1 && var5 != var3) {
         var0.method3689(-871565127 * field1658, var1, -1, var2, -1, var5 - var3, -1168465938);
      } else if (-1 == var2 && -1 != var4 && var5 > 0) {
         boolean var9 = false;

         for (int var10 = 0; var10 < var0.field1655 * -1432564885; var10++) {
            classDB var11 = (classDB)var0.field1654.get(var10);
            if (-1105683577 * var11.field1374 == field1660 * 544334293 && -2047267423 * var11.field1368 == var4 && var5 == var11.field1373 * -1246273844) {
               var11.field1374 = -998786754 * field1659;
               var11.field1369 = var1 * 881833361;
               var11.field1371 = 558912959;
               var11.field1373 = 1497461875;
               var9 = true;
               break;
            }
         }

         if (!var9) {
            var0.method3689(-1394603110 * field1657, var1, -1, var4, -1, var5, -467165730);
         }
      } else if (var2 != -1 && var4 == -1 && var3 > 0) {
         boolean var6 = false;

         for (int var7 = 0; var7 < var0.field1655 * -1432564885; var7++) {
            classDB var8 = (classDB)var0.field1654.get(var7);
            if (-1315875586 * field1657 == var8.field1374 * -1865858015 && var8.field1368 * 2043857780 == var2 && var8.field1373 * -914885 == var3) {
               var8.field1374 = field1659 * -1578349495;
               var8.field1369 = var1 * 881833361;
               var8.field1371 = var8.field1368 * -884237155;
               var8.field1368 = 97321145;
               var8.field1373 = -1454049492;
               var6 = true;
               break;
            }
         }

         if (!var6) {
            var0.method3689(1808850553 * field1660, var1, -1, var2, -1, var3, 467316694);
         }
      } else if (-1 != var2 && -1 != var4 && var2 != var4) {
         var0.method3689(48170419 * field1660, var1, -1, var2, -1, var3, -1293615011);
         var0.method3689(field1657 * -1231891449, var1, -1, var4, -1, var5, -413915884);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   void method3684() {
      this.field1655 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void method3697(int var1) {
      try {
         boolean var6;
         do {
            int var2 = -1;
            int var3 = -1;
            int var4 = -1;
            int var5 = -1;
            var6 = false;

            for (int var7 = 1; var7 < this.field1655 * -1432564885; var7++) {
               if (var1 == 1115597881) {
                  throw new IllegalStateException();
               }

               classDB var8 = (classDB)this.field1654.get(var7);
               classDB var9 = (classDB)this.field1654.get(var7 - 1);
               if (var2 == -1) {
                  if (var1 == 1115597881) {
                     throw new IllegalStateException();
                  }

                  if (-1315156953 * var9.field1374 == field1660 * 48170419) {
                     if (var1 == 1115597881) {
                        return;
                     }

                     if (var8.field1374 * -1315156953 == field1657 * -1231891449) {
                        if (var1 == 1115597881) {
                           throw new IllegalStateException();
                        }

                        if (-1159210771 * var9.field1370 == var8.field1370 * -1159210771) {
                           if (var1 == 1115597881) {
                              throw new IllegalStateException();
                           }

                           var2 = -1159210771 * var8.field1370;
                           var3 = var7;
                           var4 = 1073934853 * var9.field1368;
                           var5 = 1073934853 * var8.field1368;
                           continue;
                        }
                     }
                  }
               }

               if (-1 != var2) {
                  if (var1 == 1115597881) {
                     throw new IllegalStateException();
                  }

                  if (var9.field1374 * -1315156953 == field1660 * 48170419) {
                     if (var1 == 1115597881) {
                        throw new IllegalStateException();
                     }

                     if (-1315156953 * var8.field1374 == -1231891449 * field1657 && var9.field1370 * -1159210771 == -1159210771 * var8.field1370) {
                        if (var1 == 1115597881) {
                           return;
                        }

                        if (1073934853 * var9.field1368 == var5) {
                           if (var1 == 1115597881) {
                              throw new IllegalStateException();
                           }

                           if (var4 == 1073934853 * var8.field1368) {
                              classDB var10 = (classDB)this.field1654.get(var3);
                              classDB var11 = (classDB)this.field1654.get(var3 - 1);
                              var11.field1374 = -1210143563 * field1656;
                              var10.field1374 = field1656 * -1210143563;
                              var8.field1374 = -1210143563 * field1656;
                              var9.field1374 = field1659 * 788642921;
                              var9.field1369 = 437546813 * var11.field1370;
                              var9.field1371 = -884237155 * var11.field1368;
                              var9.field1373 = 1907644063;
                              var6 = true;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         } while (var6);

         if (var1 == 1115597881) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "dx.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method3685() {
      this.field1655 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ay")
   void method3687(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (-1432564885 * this.field1655 >= this.field1654.size()) {
         this.field1654.add(new classDB());
      }

      ((classDB)this.field1654.get(this.field1655 * -1432564885)).method2882(var1, var2, var3, var4, var5, var6, 448247621);
      this.field1655 += 1164970307;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;ILdb;)V")
   @ObfuscatedName("qu")
   public static void method3702(classDX var0, int var1, classDB var2) {
      if (var0 == null) {
         var0.method3685();
      } else {
         Object[] var3 = new Object[]{
            var1,
            -1315156953 * var2.field1374,
            -1159210771 * var2.field1370,
            -784749711 * var2.field1369,
            1073934853 * var2.field1368,
            var2.field1371 * 734399113,
            var2.field1373 * -979715423
         };
         ScriptEvent var4 = classZS.method14182(classCA.method1392(18, -2045278717).method14145(var3, (byte)2), (byte)31);
         classSZ.method10729(var4, -1396787171);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("aq")
   void method3688(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (-1432564885 * this.field1655 >= this.field1654.size()) {
         this.field1654.add(new classDB());
      }

      ((classDB)this.field1654.get(this.field1655 * -1432564885)).method2882(var1, var2, var3, var4, var5, var6, 1755443289);
      this.field1655 += 1164970307;
   }

   @ObfuscatedSignature(descriptor = "(ILdb;)V")
   @ObfuscatedName("an")
   void method3703(int var1, classDB var2) {
      Object[] var3 = new Object[]{
         var1,
         -1315156953 * var2.field1374,
         -1159210771 * var2.field1370,
         -784749711 * var2.field1369,
         1073934853 * var2.field1368,
         var2.field1371 * 734399113,
         var2.field1373 * -979715423
      };
      ScriptEvent var4 = classZS.method14182(classCA.method1392(18, -1052802960).method14145(var3, (byte)2), (byte)9);
      classSZ.method10729(var4, -1369380041);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void method3686(int var1) {
      try {
         this.field1655 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "dx.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ai")
   void method3694(int var1, int var2, int var3, int var4, int var5) {
      if (var4 == var2 && var2 != -1 && var5 != var3) {
         this.method3689(251058905 * field1658, var1, -1, var2, -1, var5 - var3, -2015828386);
      } else if (-1 == var2 && -1 != var4 && var5 > 0) {
         boolean var9 = false;

         for (int var10 = 0; var10 < this.field1655 * -449750749; var10++) {
            classDB var11 = (classDB)this.field1654.get(var10);
            if (-1315156953 * var11.field1374 == field1660 * 630599895 && 1599044066 * var11.field1368 == var4 && var5 == var11.field1373 * 250381154) {
               var11.field1374 = 788642921 * field1659;
               var11.field1369 = var1 * -716008616;
               var11.field1371 = -47696011;
               var11.field1373 = 360219041;
               var9 = true;
               break;
            }
         }

         if (!var9) {
            this.method3689(-595610593 * field1657, var1, -1, var4, -1, var5, -791711983);
         }
      } else if (var2 != -1 && var4 == -1 && var3 > 0) {
         boolean var6 = false;

         for (int var7 = 0; var7 < this.field1655 * -1432564885; var7++) {
            classDB var8 = (classDB)this.field1654.get(var7);
            if (-1231891449 * field1657 == var8.field1374 * -1138225367 && var8.field1368 * 1073934853 == var2 && var8.field1373 * 509710884 == var3) {
               var8.field1374 = field1659 * 788642921;
               var8.field1369 = var1 * -977409891;
               var8.field1371 = var8.field1368 * -297551172;
               var8.field1368 = -644877005;
               var8.field1373 = -18511406;
               var6 = true;
               break;
            }
         }

         if (!var6) {
            this.method3689(-990058287 * field1660, var1, -1, var2, -1, var3, -1892248076);
         }
      } else if (-1 != var2 && -1 != var4 && var2 != var4) {
         this.method3689(48170419 * field1660, var1, -1, var2, -1, var3, -1162390041);
         this.method3689(field1657 * -64195905, var1, -1, var4, -1, var5, -1458935005);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("ae")
   void method3689(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (-1432564885 * this.field1655 >= this.field1654.size()) {
            if (var7 >= 541065232) {
               throw new IllegalStateException();
            }

            this.field1654.add(new classDB());
         }

         ((classDB)this.field1654.get(this.field1655 * -1432564885)).method2882(var1, var2, var3, var4, var5, var6, 405317337);
         this.field1655 += 1164970307;
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "dx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   void method3698() {
      boolean var5;
      do {
         int var1 = -1;
         int var2 = -1;
         int var3 = -1;
         int var4 = -1;
         var5 = false;

         for (int var6 = 1; var6 < this.field1655 * -1432564885; var6++) {
            classDB var7 = (classDB)this.field1654.get(var6);
            classDB var8 = (classDB)this.field1654.get(var6 - 1);
            if (var1 == -1
               && -1315156953 * var8.field1374 == field1660 * 48170419
               && var7.field1374 * -1315156953 == field1657 * -1231891449
               && -1159210771 * var8.field1370 == var7.field1370 * -1159210771) {
               var1 = -1159210771 * var7.field1370;
               var2 = var6;
               var3 = 1073934853 * var8.field1368;
               var4 = 1073934853 * var7.field1368;
            } else if (-1 != var1
               && var8.field1374 * -1315156953 == field1660 * 48170419
               && -1315156953 * var7.field1374 == -1231891449 * field1657
               && var8.field1370 * -1159210771 == -1159210771 * var7.field1370
               && 1073934853 * var8.field1368 == var4
               && var3 == 1073934853 * var7.field1368) {
               classDB var9 = (classDB)this.field1654.get(var2);
               classDB var10 = (classDB)this.field1654.get(var2 - 1);
               var10.field1374 = -1210143563 * field1656;
               var9.field1374 = field1656 * -1210143563;
               var7.field1374 = -1210143563 * field1656;
               var8.field1374 = field1659 * 788642921;
               var8.field1369 = 437546813 * var10.field1370;
               var8.field1371 = -884237155 * var10.field1368;
               var8.field1373 = 1907644063;
               var5 = true;
               break;
            }
         }
      } while (var5);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void method3700(int var1) {
      for (int var2 = 0; var2 < -1432564885 * this.field1655; var2++) {
         classDB var3 = (classDB)this.field1654.get(var2);
         if (var3.field1374 * -1315156953 != 0) {
            this.method3701(var1, var3, 1986405103);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILdb;)V")
   @ObfuscatedName("at")
   void method3704(int var1, classDB var2) {
      Object[] var3 = new Object[]{
         var1,
         -1315156953 * var2.field1374,
         -1159210771 * var2.field1370,
         -784749711 * var2.field1369,
         1073934853 * var2.field1368,
         var2.field1371 * 734399113,
         var2.field1373 * -979715423
      };
      ScriptEvent var4 = classZS.method14182(classCA.method1392(18, -2001636794).method14145(var3, (byte)2), (byte)87);
      classSZ.method10729(var4, -1674506987);
   }

   @ObfuscatedSignature(descriptor = "(FFFFB)F")
   @ObfuscatedName("ab")
   static final float method3681(float var0, float var1, float var2, float var3, byte var4) {
      try {
         return var1 * var2 - var3 * var0;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "dx.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)V")
   @ObfuscatedName("ab")
   void method3695(int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         if (var4 == var2) {
            if (var6 == 1) {
               return;
            }

            if (var2 != -1 && var5 != var3) {
               if (var6 == 1) {
                  throw new IllegalStateException();
               }

               this.method3689(-871565127 * field1657, var1, -1, var2, -1, var5 - var3, -2035575510);
               return;
            }
         }

         if (-1 == var2) {
            if (var6 == 1) {
               return;
            }

            if (-1 != var4) {
               if (var6 == 1) {
                  throw new IllegalStateException();
               }

               if (var5 > 0) {
                  if (var6 == 1) {
                     throw new IllegalStateException();
                  }

                  boolean var11 = false;

                  for (int var12 = 0; var12 < this.field1655 * -1432564885; var12++) {
                     if (var6 == 1) {
                        throw new IllegalStateException();
                     }

                     classDB var13 = (classDB)this.field1654.get(var12);
                     if (-1315156953 * var13.field1368 == field1662 * 48170419) {
                        if (var6 == 1) {
                           throw new IllegalStateException();
                        }

                        if (1073934853 * var13.field1368 == var4) {
                           if (var6 == 1) {
                              return;
                           }

                           if (var5 == var13.field1370 * -979715423) {
                              if (var6 == 1) {
                                 throw new IllegalStateException();
                              }

                              var13.field1369 = 788642921 * field1660;
                              var13.field1368 = var1 * 881833361;
                              var13.field1371 = 1839559751;
                              var13.field1368 = 1907644063;
                              var11 = true;
                              break;
                           }
                        }
                     }
                  }

                  if (!var11) {
                     if (var6 == 1) {
                        throw new IllegalStateException();
                     }

                     this.method3689(-1231891449 * field1657, var1, -1, var4, -1, var5, -534858038);
                  }

                  return;
               }
            }
         }

         if (var2 != -1) {
            if (var6 == 1) {
               return;
            }

            if (var4 == -1) {
               if (var6 == 1) {
                  return;
               }

               if (var3 > 0) {
                  if (var6 == 1) {
                     throw new IllegalStateException();
                  }

                  boolean var7 = false;

                  for (int var8 = 0; var8 < this.field1655 * -1432564885; var8++) {
                     if (var6 == 1) {
                        throw new IllegalStateException();
                     }

                     classDB var9 = (classDB)this.field1654.get(var8);
                     if (-1231891449 * field1660 == var9.field1371 * -1315156953 && var9.field1374 * 1073934853 == var2) {
                        if (var6 == 1) {
                           return;
                        }

                        if (var9.field1371 * -979715423 == var3) {
                           if (var6 == 1) {
                              throw new IllegalStateException();
                           }

                           var9.field1369 = field1659 * 788642921;
                           var9.field1374 = var1 * 881833361;
                           var9.field1373 = var9.field1368 * -884237155;
                           var9.field1368 = -644877005;
                           var9.field1371 = 1907644063;
                           var7 = true;
                           break;
                        }
                     }
                  }

                  if (!var7) {
                     if (var6 == 1) {
                        throw new IllegalStateException();
                     }

                     this.method3689(48170419 * field1658, var1, -1, var2, -1, var3, -1141808045);
                  }

                  return;
               }
            }
         }

         if (-1 != var2) {
            if (var6 == 1) {
               return;
            }

            if (-1 != var4) {
               if (var6 == 1) {
                  throw new IllegalStateException();
               }

               if (var2 != var4) {
                  if (var6 == 1) {
                     throw new IllegalStateException();
                  }

                  this.method3689(48170419 * field1662, var1, -1, var2, -1, var3, 295011751);
                  this.method3689(field1658 * -1231891449, var1, -1, var4, -1, var5, -16557743);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "dx.ab(" + ')');
      }
   }
}
