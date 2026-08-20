import net.runelite.api.CollisionData;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gc")
public class classGC implements CollisionData {
   @ObfuscatedName("bb")
   final int[][] field2550;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2551 = 8;
   @ObfuscatedName("ba")
   int field2548;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field2552 = 1073741824;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field2560 = 1076101438;
   @ObfuscatedName("bo")
   int field2558;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2556 = 1;
   @ObfuscatedName("bu")
   int field2559;
   @ObfuscatedName("bw")
   int field2549;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2555 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field2553 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field2557 = 50;
   @ToRemove(unused = "true")
   @ObfuscatedName("cx")
   static final int field2561 = -2;
   @ObfuscatedSignature(descriptor = "Luk;")
   @ObfuscatedName("hg")
   static classUK field2562;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field2554 = 16;

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ao")
   public void method5340(int var1, int var2, int var3, int var4) {
      try {
         this.method5337(var1 - this.field2558 * 370701143, var2 - this.field2559 * 1140151217, var3, (byte)-45);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gc.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("zl")
   public void method5383(int var1, int var2, int var3) {
      this.method5340(var1, var2, var3, -2134326968);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZB)V")
   @ObfuscatedName("ar")
   public void method5377(int var1, int var2, int var3, int var4, int var5, boolean var6, byte var7) {
      try {
         int var8 = 256;
         if (var6) {
            if (var7 <= 1) {
               throw new IllegalStateException();
            }

            var8 += 131072;
         }

         label79: {
            var1 -= this.field2558 * 370701143;
            var2 -= 1140151217 * this.field2559;
            if (var5 != 1) {
               if (var7 <= 1) {
                  return;
               }

               if (3 != var5) {
                  break label79;
               }

               if (var7 <= 1) {
                  throw new IllegalStateException();
               }
            }

            int var9 = var3;
            var3 = var4;
            var4 = var9;
         }

         for (int var14 = var1; var14 < var1 + var3; var14++) {
            if (var7 <= 1) {
               return;
            }

            if (var14 >= 0 && var14 < this.field2548 * -148155585) {
               if (var7 <= 1) {
                  return;
               }

               for (int var10 = var2; var10 < var4 + var2; var10++) {
                  if (var7 <= 1) {
                     return;
                  }

                  if (var10 >= 0 && var10 < this.field2549 * 1473114359) {
                     if (var7 <= 1) {
                        throw new IllegalStateException();
                     }

                     this.method5337(var14, var10, var8, (byte)-124);
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "gc.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZ)V")
   @ObfuscatedName("cn")
   public void method5378(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.field2558 * -49641372;
      var2 -= -63844124 * this.field2559;
      if (var5 == 1 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var1 + var3; var12++) {
         if (var12 >= 0 && var12 < this.field2548 * -148155585) {
            for (int var9 = var2; var9 < var4 + var2; var9++) {
               if (var9 >= 0 && var9 < this.field2549 * 1473114359) {
                  this.method5337(var12, var9, var7, (byte)-25);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ck")
   public void method5368(int var1, int var2) {
      var1 -= this.field2558 * 682520820;
      var2 -= this.field2559 * 1140151217;
      this.field2550[var1][var2] = this.field2550[var1][var2] | -1045931674;
   }

   @ObfuscatedSignature(descriptor = "(Lgc;B)V")
   @ObfuscatedName("od")
   public static void method5324(classGC var0, byte var1) {
      if (var0 == null) {
         var0.method5328(var1);
      } else {
         try {
            for (int var2 = 0; var2 < -148155585 * var0.field2548; var2++) {
               if (var1 == 26) {
                  throw new IllegalStateException();
               }

               for (int var3 = 0; var3 < var0.field2549 * 1473114359; var3++) {
                  if (var1 == 26) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 1) {
                     if (var1 == 26) {
                        return;
                     }

                     if (var3 >= 1) {
                        if (var1 == 26) {
                           return;
                        }

                        if (var2 < var0.field2548 * -148155585 - 5) {
                           if (var1 == 26) {
                              throw new IllegalStateException();
                           }

                           if (var3 < var0.field2549 * 1473114359 - 5) {
                              var0.field2550[var2][var3] = 1073741824;
                              continue;
                           }

                           if (var1 == 26) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }

                  var0.field2550[var2][var3] = 16777215;
               }
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "gc.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("nj")
   public void method5384(int var1, int var2, int var3, int var4, boolean var5) {
      this.method5348(var1, var2, var3, var4, var5, -1761732661);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("co")
   public void method5369(int var1, int var2) {
      var1 -= this.field2558 * 370701143;
      var2 -= this.field2559 * 1140151217;
      this.field2550[var1][var2] = this.field2550[var1][var2] | 262144;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Z")
   @ObfuscatedName("ax")
   boolean method5329(int var1, int var2, int var3, byte var4) {
      try {
         return 0 != (this.field2550[var1][var2] & var3);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gc.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ac")
   void method5332(int var1, int var2, int var3, int var4) {
      try {
         this.field2550[var1][var2] = this.field2550[var1][var2] | var3;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gc.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("aa")
   void method5337(int var1, int var2, int var3, byte var4) {
      try {
         this.field2550[var1][var2] = this.field2550[var1][var2] & ~var3;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gc.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;)V")
   @ObfuscatedName("il")
   public static void method5325(classGC var0) {
      if (var0 == null) {
         var0.method5313();
      }

      for (int var1 = 0; var1 < -148155585 * var0.field2548; var1++) {
         for (int var2 = 0; var2 < var0.field2549 * 1473114359; var2++) {
            if (var1 >= 1 && var2 >= 1 && var1 < var0.field2548 * -148155585 - 5 && var2 < var0.field2549 * 1473114359 - 5) {
               var0.field2550[var1][var2] = 1073741824;
            } else {
               var0.field2550[var1][var2] = 16777215;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("aj")
   boolean method5346(int var1, int var2, byte var3) {
      try {
         if (var1 >= 1 && var1 < -148155585 * this.field2548 - 5) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            if (var2 >= 1) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (var2 < this.field2549 * 1473114359 - 5) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gc.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("al")
   public boolean method5344(int var1, int var2, byte var3) {
      try {
         return this.method5346(var1 - 370701143 * this.field2558, var2 - this.field2559 * 1140151217, (byte)-4);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gc.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZI)V")
   @ObfuscatedName("aq")
   void method5354(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         int var8 = 256;
         if (var6) {
            if (var7 >= -1713240564) {
               throw new IllegalStateException();
            }

            var8 += 131072;
         }

         label75: {
            var1 -= this.field2558 * 370701143;
            var2 -= this.field2559 * 1140151217;
            if (1 != var5) {
               if (3 != var5) {
                  break label75;
               }

               if (var7 >= -1713240564) {
                  return;
               }
            }

            int var9 = var3;
            var3 = var4;
            var4 = var9;
         }

         for (int var14 = var1; var14 < var1 + var3; var14++) {
            if (var7 >= -1713240564) {
               throw new IllegalStateException();
            }

            if (var14 >= 0) {
               if (var7 >= -1713240564) {
                  throw new IllegalStateException();
               }

               if (var14 < this.field2548 * -148155585) {
                  for (int var10 = var2; var10 < var4 + var2; var10++) {
                     if (var7 >= -1713240564) {
                        throw new IllegalStateException();
                     }

                     if (var10 >= 0 && var10 < 1473114359 * this.field2549) {
                        if (var7 >= -1713240564) {
                           throw new IllegalStateException();
                        }

                        this.method5332(var14, var10, var8, -1841167818);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "gc.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZI)V")
   @ObfuscatedName("ai")
   public void method5348(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= this.field2558 * 370701143;
         var2 -= this.field2559 * 1140151217;
         if (0 == var3) {
            if (var6 == -844046823) {
               throw new IllegalStateException();
            }

            if (0 == var4) {
               this.method5332(var1, var2, 128, -1944782814);
               this.method5332(var1 - 1, var2, 8, -2017347689);
            }

            if (var4 == 1) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 2, -1832069893);
               this.method5332(var1, 1 + var2, 32, -2113667690);
            }

            if (var4 == 2) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 8, -2084468035);
               this.method5332(1 + var1, var2, 128, -1936094734);
            }

            if (3 == var4) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 32, -2127752639);
               this.method5332(var1, var2 - 1, 2, -1858133694);
            }
         }

         label278: {
            if (var3 != 1) {
               if (var6 == -844046823) {
                  return;
               }

               if (var3 != 3) {
                  break label278;
               }

               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }
            }

            if (0 == var4) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 1, -1835486972);
               this.method5332(var1 - 1, var2 + 1, 16, -1939959206);
            }

            if (1 == var4) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 4, -2067328367);
               this.method5332(var1 + 1, var2 + 1, 64, -2127732276);
            }

            if (var4 == 2) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 16, -1949810605);
               this.method5332(1 + var1, var2 - 1, 1, -1696090516);
            }

            if (var4 == 3) {
               if (var6 == -844046823) {
                  return;
               }

               this.method5332(var1, var2, 64, -1727130978);
               this.method5332(var1 - 1, var2 - 1, 4, -1972983877);
            }
         }

         if (var3 == 2) {
            if (var6 == -844046823) {
               return;
            }

            if (var4 == 0) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 130, -2134603303);
               this.method5332(var1 - 1, var2, 8, -1684198962);
               this.method5332(var1, var2 + 1, 32, -1750815827);
            }

            if (var4 == 1) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 10, -1994608051);
               this.method5332(var1, var2 + 1, 32, -1964716481);
               this.method5332(1 + var1, var2, 128, -1792421191);
            }

            if (2 == var4) {
               this.method5332(var1, var2, 40, -1945241599);
               this.method5332(1 + var1, var2, 128, -1705295343);
               this.method5332(var1, var2 - 1, 2, -2127317004);
            }

            if (3 == var4) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               this.method5332(var1, var2, 160, -1727916046);
               this.method5332(var1, var2 - 1, 2, -1874098790);
               this.method5332(var1 - 1, var2, 8, -2025616037);
            }
         }

         if (var5) {
            if (var6 == -844046823) {
               throw new IllegalStateException();
            }

            if (0 == var3) {
               if (var6 == -844046823) {
                  return;
               }

               if (var4 == 0) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  this.method5332(var1, var2, 65536, -1724402597);
                  this.method5332(var1 - 1, var2, 4096, -2042904219);
               }

               if (1 == var4) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  this.method5332(var1, var2, 1024, -1733698039);
                  this.method5332(var1, 1 + var2, 16384, -1651610283);
               }

               if (var4 == 2) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  this.method5332(var1, var2, 4096, -2040994205);
                  this.method5332(var1 + 1, var2, 65536, -1651040437);
               }

               if (3 == var4) {
                  if (var6 == -844046823) {
                     return;
                  }

                  this.method5332(var1, var2, 16384, -2060408324);
                  this.method5332(var1, var2 - 1, 1024, -2075485411);
               }
            }

            label283: {
               if (var3 != 1) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  if (3 != var3) {
                     break label283;
                  }

                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }
               }

               if (var4 == 0) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  this.method5332(var1, var2, 512, -1661086008);
                  this.method5332(var1 - 1, 1 + var2, 8192, -1700149170);
               }

               if (1 == var4) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  this.method5332(var1, var2, 2048, -2026804949);
                  this.method5332(1 + var1, 1 + var2, 32768, -2068634649);
               }

               if (2 == var4) {
                  if (var6 == -844046823) {
                     return;
                  }

                  this.method5332(var1, var2, 8192, -1760685271);
                  this.method5332(var1 + 1, var2 - 1, 512, -1878868895);
               }

               if (3 == var4) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  this.method5332(var1, var2, 32768, -1811933477);
                  this.method5332(var1 - 1, var2 - 1, 2048, -1866680525);
               }
            }

            if (var3 == 2) {
               if (var6 == -844046823) {
                  throw new IllegalStateException();
               }

               if (0 == var4) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  this.method5332(var1, var2, 66560, -1942242079);
                  this.method5332(var1 - 1, var2, 4096, -2101316973);
                  this.method5332(var1, 1 + var2, 16384, -1776977110);
               }

               if (var4 == 1) {
                  if (var6 == -844046823) {
                     throw new IllegalStateException();
                  }

                  this.method5332(var1, var2, 5120, -1886332349);
                  this.method5332(var1, var2 + 1, 16384, -1784642342);
                  this.method5332(var1 + 1, var2, 65536, -1888346968);
               }

               if (var4 == 2) {
                  if (var6 == -844046823) {
                     return;
                  }

                  this.method5332(var1, var2, 20480, -1858047169);
                  this.method5332(1 + var1, var2, 65536, -1927590555);
                  this.method5332(var1, var2 - 1, 1024, -2038386445);
               }

               if (3 == var4) {
                  this.method5332(var1, var2, 81920, -1902073585);
                  this.method5332(var1, var2 - 1, 1024, -1897615855);
                  this.method5332(var1 - 1, var2, 4096, -1660567675);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gc.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("cl")
   public void method5357(int var1, int var2, int var3, int var4, boolean var5) {
      this.method5354(var1, var2, var3, var4, 0, var5, -2069477590);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("vb")
   public void method5385(int var1, int var2) {
      method5371(this, var1, var2, (byte)4);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZI)V")
   @ObfuscatedName("ay")
   public void method5373(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= 370701143 * this.field2558;
         var2 -= 1140151217 * this.field2559;
         if (var3 == 0) {
            if (var6 >= -2095241843) {
               throw new IllegalStateException();
            }

            if (0 == var4) {
               this.method5337(var1, var2, 128, (byte)-40);
               this.method5337(var1 - 1, var2, 8, (byte)-106);
            }

            if (var4 == 1) {
               if (var6 >= -2095241843) {
                  return;
               }

               this.method5337(var1, var2, 2, (byte)-31);
               this.method5337(var1, var2 + 1, 32, (byte)-68);
            }

            if (var4 == 2) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               this.method5337(var1, var2, 8, (byte)-93);
               this.method5337(1 + var1, var2, 128, (byte)-58);
            }

            if (var4 == 3) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               this.method5337(var1, var2, 32, (byte)-92);
               this.method5337(var1, var2 - 1, 2, (byte)-23);
            }
         }

         label266: {
            if (1 != var3) {
               if (var6 >= -2095241843) {
                  return;
               }

               if (3 != var3) {
                  break label266;
               }

               if (var6 >= -2095241843) {
                  return;
               }
            }

            if (var4 == 0) {
               this.method5337(var1, var2, 1, (byte)-22);
               this.method5337(var1 - 1, var2 + 1, 16, (byte)-20);
            }

            if (1 == var4) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               this.method5337(var1, var2, 4, (byte)-8);
               this.method5337(1 + var1, var2 + 1, 64, (byte)-106);
            }

            if (2 == var4) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               this.method5337(var1, var2, 16, (byte)-123);
               this.method5337(var1 + 1, var2 - 1, 1, (byte)-24);
            }

            if (var4 == 3) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               this.method5337(var1, var2, 64, (byte)-86);
               this.method5337(var1 - 1, var2 - 1, 4, (byte)-15);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               this.method5337(var1, var2, 130, (byte)-66);
               this.method5337(var1 - 1, var2, 8, (byte)-92);
               this.method5337(var1, 1 + var2, 32, (byte)-26);
            }

            if (1 == var4) {
               if (var6 >= -2095241843) {
                  return;
               }

               this.method5337(var1, var2, 10, (byte)0);
               this.method5337(var1, var2 + 1, 32, (byte)12);
               this.method5337(var1 + 1, var2, 128, (byte)-43);
            }

            if (var4 == 2) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               this.method5337(var1, var2, 40, (byte)-87);
               this.method5337(1 + var1, var2, 128, (byte)-51);
               this.method5337(var1, var2 - 1, 2, (byte)-35);
            }

            if (var4 == 3) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               this.method5337(var1, var2, 160, (byte)-119);
               this.method5337(var1, var2 - 1, 2, (byte)-1);
               this.method5337(var1 - 1, var2, 8, (byte)-69);
            }
         }

         if (var5) {
            if (var6 >= -2095241843) {
               throw new IllegalStateException();
            }

            if (0 == var3) {
               if (var6 >= -2095241843) {
                  throw new IllegalStateException();
               }

               if (var4 == 0) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 65536, (byte)-22);
                  this.method5337(var1 - 1, var2, 4096, (byte)-96);
               }

               if (1 == var4) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 1024, (byte)-78);
                  this.method5337(var1, var2 + 1, 16384, (byte)-99);
               }

               if (2 == var4) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 4096, (byte)-78);
                  this.method5337(1 + var1, var2, 65536, (byte)-8);
               }

               if (3 == var4) {
                  this.method5337(var1, var2, 16384, (byte)-25);
                  this.method5337(var1, var2 - 1, 1024, (byte)-100);
               }
            }

            label271: {
               if (1 != var3) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  if (var3 != 3) {
                     break label271;
                  }

                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }
               }

               if (var4 == 0) {
                  if (var6 >= -2095241843) {
                     return;
                  }

                  this.method5337(var1, var2, 512, (byte)-35);
                  this.method5337(var1 - 1, 1 + var2, 8192, (byte)-91);
               }

               if (var4 == 1) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 2048, (byte)13);
                  this.method5337(1 + var1, 1 + var2, 32768, (byte)-95);
               }

               if (2 == var4) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 8192, (byte)-109);
                  this.method5337(var1 + 1, var2 - 1, 512, (byte)-18);
               }

               if (3 == var4) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 32768, (byte)-41);
                  this.method5337(var1 - 1, var2 - 1, 2048, (byte)-54);
               }
            }

            if (var3 == 2) {
               if (0 == var4) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 66560, (byte)-18);
                  this.method5337(var1 - 1, var2, 4096, (byte)-66);
                  this.method5337(var1, var2 + 1, 16384, (byte)-6);
               }

               if (1 == var4) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 5120, (byte)-91);
                  this.method5337(var1, 1 + var2, 16384, (byte)-27);
                  this.method5337(1 + var1, var2, 65536, (byte)-90);
               }

               if (var4 == 2) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 20480, (byte)-16);
                  this.method5337(var1 + 1, var2, 65536, (byte)-75);
                  this.method5337(var1, var2 - 1, 1024, (byte)-108);
               }

               if (3 == var4) {
                  if (var6 >= -2095241843) {
                     throw new IllegalStateException();
                  }

                  this.method5337(var1, var2, 81920, (byte)-120);
                  this.method5337(var1, var2 - 1, 1024, (byte)-90);
                  this.method5337(var1 - 1, var2, 4096, (byte)-73);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gc.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bx")
   final void method5318(int var1, int var2, int var3, int var4) {
      this.field2558 = 1954293863 * var1;
      this.field2559 = -143452847 * var2;
      this.field2548 = var3 * 1273896127;
      this.field2549 = var4 * 380096711;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("dw")
   public void method5386(int var1, int var2, int var3, int var4, boolean var5) {
      method5361(this, var1, var2, var3, var4, var5, (byte)-41);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("aw")
   public void method5380(int var1, int var2, int var3) {
      try {
         var1 -= this.field2558 * 370701143;
         var2 -= this.field2559 * 1140151217;
         this.field2550[var1][var2] = this.field2550[var1][var2] & -262145;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gc.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   int method5304() {
      return -1942466721 * this.field2558;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;III)V")
   @ObfuscatedName("em")
   public static void method5333(classGC var0, int var1, int var2, int var3) {
      var0.field2550[var1][var2] = var0.field2550[var1][var2] | var3;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bb")
   void method5338(int var1, int var2, int var3) {
      this.field2550[var1][var2] = this.field2550[var1][var2] & ~var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   int method5309() {
      return this.field2559 * -1515697340;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("yi")
   public void method5387(int var1, int var2) {
      this.method5364(var1, var2, -2018061884);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method5312() {
      return -148155585 * this.field2548;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method5315() {
      return this.field2549 * 1473114359;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   public int method5316() {
      return this.field2549 * -1930950539;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cv")
   public void method5363(int var1, int var2) {
      var1 -= this.field2558 * 1305017015;
      var2 -= this.field2559 * 325544783;
      this.field2550[var1][var2] = this.field2550[var1][var2] | 2097152;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bc")
   final void method5319(int var1, int var2, int var3, int var4) {
      this.field2558 = 1954293863 * var1;
      this.field2559 = 48012060 * var2;
      this.field2548 = var3 * 1273896127;
      this.field2549 = var4 * 380096711;
   }

   public int[][] getFlags() {
      return this.field2550;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   public void method5326() {
      for (int var1 = 0; var1 < -148155585 * this.field2548; var1++) {
         for (int var2 = 0; var2 < this.field2549 * 1473114359; var2++) {
            if (var1 >= 1 && var2 >= 1 && var1 < this.field2548 * -148155585 - 5 && var2 < this.field2549 * 1998543355 - 5) {
               this.field2550[var1][var2] = 1271937005;
            } else {
               this.field2550[var1][var2] = 16777215;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZ)V")
   @ObfuscatedName("cb")
   void method5355(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 1343564344;
      }

      var1 -= this.field2558 * 370701143;
      var2 -= this.field2559 * 1140151217;
      if (1 == var5 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var1 + var3; var12++) {
         if (var12 >= 0 && var12 < this.field2548 * -148155585) {
            for (int var9 = var2; var9 < var4 + var2; var9++) {
               if (var9 >= 0 && var9 < 1473114359 * this.field2549) {
                  this.method5332(var12, var9, var7, -1882426066);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public void method5327() {
      for (int var1 = 0; var1 < -148155585 * this.field2548; var1++) {
         for (int var2 = 0; var2 < this.field2549 * 1473114359; var2++) {
            if (var1 >= 1 && var2 >= 1 && var1 < this.field2548 * -2000189147 - 5 && var2 < this.field2549 * 1473114359 - 5) {
               this.field2550[var1][var2] = 654740841;
            } else {
               this.field2550[var1][var2] = -6365322;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIII)V")
   @ObfuscatedName("au")
   static final void method5382(classLW var0, int var1, int var2, int var3, int var4) {
      try {
         if (null == var0.field4370) {
            throw new RuntimeException();
         } else {
            var0.field4370[var1] = var2;
            var0.field4371[var1] = var3;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "gc.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bo")
   boolean method5330(int var1, int var2, int var3) {
      return 0 != (this.field2550[var1][var2] & var3);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ba")
   void method5334(int var1, int var2, int var3) {
      this.field2550[var1][var2] = this.field2550[var1][var2] | var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;III)V")
   @ObfuscatedName("zf")
   public static void method5341(classGC var0, int var1, int var2, int var3) {
      var0.method5337(var1 - var0.field2558 * 370701143, var2 - var0.field2559 * 1140151217, var3, (byte)-77);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bd")
   public boolean method5388(int var1, int var2) {
      return this.method5344(var1, var2, (byte)-108);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("by")
   void method5335(int var1, int var2, int var3) {
      this.field2550[var1][var2] = this.field2550[var1][var2] | var3;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bs")
   public void method5342(int var1, int var2, int var3) {
      this.method5337(var1 - this.field2558 * 370701143, var2 - this.field2559 * 1140151217, var3, (byte)-31);
   }

   @ObfuscatedSignature(descriptor = "(Lgc;I)I")
   @ObfuscatedName("wd")
   public static int method5305(classGC var0, int var1) {
      if (var0 == null) {
         return var0.method5308(var1);
      } else {
         try {
            return 370701143 * var0.field2558;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "gc.az(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bu")
   void method5336(int var1, int var2, int var3) {
      this.field2550[var1][var2] = this.field2550[var1][var2] | var3;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("bv")
   public void method5349(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2558 * 370701143;
      var2 -= this.field2559 * 1140151217;
      if (0 == var3) {
         if (0 == var4) {
            this.method5332(var1, var2, 128, -1784309332);
            this.method5332(var1 - 1, var2, 8, -1888402800);
         }

         if (var4 == 1) {
            this.method5332(var1, var2, 2, -1923729004);
            this.method5332(var1, 1 + var2, 32, -1685222582);
         }

         if (var4 == 2) {
            this.method5332(var1, var2, 8, -1705873432);
            this.method5332(1 + var1, var2, 128, -1831863313);
         }

         if (3 == var4) {
            this.method5332(var1, var2, 32, -1813122407);
            this.method5332(var1, var2 - 1, 2, -1661610963);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (0 == var4) {
            this.method5332(var1, var2, 1, -1756450639);
            this.method5332(var1 - 1, var2 + 1, 16, -2073073036);
         }

         if (1 == var4) {
            this.method5332(var1, var2, 4, -1723407222);
            this.method5332(var1 + 1, var2 + 1, 64, -1792468250);
         }

         if (var4 == 2) {
            this.method5332(var1, var2, 16, -2056192768);
            this.method5332(1 + var1, var2 - 1, 1, -1964113420);
         }

         if (var4 == 3) {
            this.method5332(var1, var2, 64, -1692245375);
            this.method5332(var1 - 1, var2 - 1, 4, -2142336823);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method5332(var1, var2, 130, -1978932705);
            this.method5332(var1 - 1, var2, 8, -1842161507);
            this.method5332(var1, var2 + 1, 32, -1721437340);
         }

         if (var4 == 1) {
            this.method5332(var1, var2, 10, -1679146148);
            this.method5332(var1, var2 + 1, 32, -2145960718);
            this.method5332(1 + var1, var2, 128, -1960123073);
         }

         if (2 == var4) {
            this.method5332(var1, var2, 40, -1791998033);
            this.method5332(1 + var1, var2, 128, -1933596669);
            this.method5332(var1, var2 - 1, 2, -1808456530);
         }

         if (3 == var4) {
            this.method5332(var1, var2, 160, -2049101255);
            this.method5332(var1, var2 - 1, 2, -1883722951);
            this.method5332(var1 - 1, var2, 8, -1666906038);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.method5332(var1, var2, 65536, -1869991791);
               this.method5332(var1 - 1, var2, 4096, -1862813149);
            }

            if (1 == var4) {
               this.method5332(var1, var2, 1024, -2139567398);
               this.method5332(var1, 1 + var2, 16384, -1745659886);
            }

            if (var4 == 2) {
               this.method5332(var1, var2, 4096, -2120662973);
               this.method5332(var1 + 1, var2, 65536, -1689746818);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 16384, -1914898999);
               this.method5332(var1, var2 - 1, 1024, -2043740757);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               this.method5332(var1, var2, 512, -2050681406);
               this.method5332(var1 - 1, 1 + var2, 8192, -1908208713);
            }

            if (1 == var4) {
               this.method5332(var1, var2, 2048, -2000316946);
               this.method5332(1 + var1, 1 + var2, 32768, -1953249116);
            }

            if (2 == var4) {
               this.method5332(var1, var2, 8192, -1717352120);
               this.method5332(var1 + 1, var2 - 1, 512, -1691262318);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 32768, -1756287423);
               this.method5332(var1 - 1, var2 - 1, 2048, -2062240921);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.method5332(var1, var2, 66560, -2140077928);
               this.method5332(var1 - 1, var2, 4096, -2010002411);
               this.method5332(var1, 1 + var2, 16384, -1833085389);
            }

            if (var4 == 1) {
               this.method5332(var1, var2, 5120, -1954764859);
               this.method5332(var1, var2 + 1, 16384, -2123639071);
               this.method5332(var1 + 1, var2, 65536, -2086673271);
            }

            if (var4 == 2) {
               this.method5332(var1, var2, 20480, -2004823024);
               this.method5332(1 + var1, var2, 65536, -1997553740);
               this.method5332(var1, var2 - 1, 1024, -1730212773);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 81920, -1733429696);
               this.method5332(var1, var2 - 1, 1024, -1655066649);
               this.method5332(var1 - 1, var2, 4096, -1947243515);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("be")
   void method5339(int var1, int var2, int var3) {
      this.field2550[var1][var2] = this.field2550[var1][var2] & ~var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   int method5306() {
      return 370701143 * this.field2558;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("vz")
   public boolean method5345(int var1, int var2) {
      return this.method5346(var1 - -976114656 * this.field2558, var2 - this.field2559 * 1140151217, (byte)-5);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bl")
   boolean method5347(int var1, int var2) {
      return var1 >= 1 && var1 < -148155585 * this.field2548 - 5 && var2 >= 1 && var2 < this.field2549 * 1473114359 - 5;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("ct")
   public void method5358(int var1, int var2, int var3, int var4, boolean var5) {
      this.method5354(var1, var2, var3, var4, 0, var5, -1983712900);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ap")
   public void method5364(int var1, int var2, int var3) {
      try {
         var1 -= this.field2558 * 370701143;
         var2 -= this.field2559 * 1140151217;
         this.field2550[var1][var2] = this.field2550[var1][var2] | 2097152;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gc.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("bz")
   public void method5350(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2558 * 1554750442;
      var2 -= this.field2559 * 1140151217;
      if (0 == var3) {
         if (0 == var4) {
            this.method5332(var1, var2, 128, -1980544934);
            this.method5332(var1 - 1, var2, 8, -1724495958);
         }

         if (var4 == 1) {
            this.method5332(var1, var2, 2, -1833166704);
            this.method5332(var1, 1 + var2, 32, -2115811624);
         }

         if (var4 == 2) {
            this.method5332(var1, var2, 8, -2000089347);
            this.method5332(1 + var1, var2, 128, -1905342973);
         }

         if (3 == var4) {
            this.method5332(var1, var2, 32, -1777801848);
            this.method5332(var1, var2 - 1, 2, -2066154041);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (0 == var4) {
            this.method5332(var1, var2, 1, -2142332782);
            this.method5332(var1 - 1, var2 + 1, 16, -1986516418);
         }

         if (1 == var4) {
            this.method5332(var1, var2, 4, -1841774023);
            this.method5332(var1 + 1, var2 + 1, 64, -2009881783);
         }

         if (var4 == 2) {
            this.method5332(var1, var2, 16, -1881926369);
            this.method5332(1 + var1, var2 - 1, 1, -1986714740);
         }

         if (var4 == 3) {
            this.method5332(var1, var2, -910370048, -1848393251);
            this.method5332(var1 - 1, var2 - 1, 4, -1975012421);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method5332(var1, var2, 130, -1972319955);
            this.method5332(var1 - 1, var2, 8, -2137897859);
            this.method5332(var1, var2 + 1, 32, -2031331940);
         }

         if (var4 == 1) {
            this.method5332(var1, var2, 10, -1961890691);
            this.method5332(var1, var2 + 1, -910394968, -2143647488);
            this.method5332(1 + var1, var2, -263562746, -1723702375);
         }

         if (2 == var4) {
            this.method5332(var1, var2, -1466108559, -2145795471);
            this.method5332(1 + var1, var2, -15260984, -1811920885);
            this.method5332(var1, var2 - 1, 2, -1978133845);
         }

         if (3 == var4) {
            this.method5332(var1, var2, 1564949021, -1842243320);
            this.method5332(var1, var2 - 1, 2, -1796558392);
            this.method5332(var1 - 1, var2, 8, -2099470347);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.method5332(var1, var2, 65536, -1885737414);
               this.method5332(var1 - 1, var2, 4096, -1814400076);
            }

            if (1 == var4) {
               this.method5332(var1, var2, 1024, -1989402455);
               this.method5332(var1, 1 + var2, 16384, -1996838132);
            }

            if (var4 == 2) {
               this.method5332(var1, var2, 1703843363, -1723251392);
               this.method5332(var1 + 1, var2, -918027248, -1939460582);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 1741075043, -1719888900);
               this.method5332(var1, var2 - 1, 1024, -2076483708);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               this.method5332(var1, var2, 512, -1913898957);
               this.method5332(var1 - 1, 1 + var2, 8192, -1683237838);
            }

            if (1 == var4) {
               this.method5332(var1, var2, 2048, -2061097953);
               this.method5332(1 + var1, 1 + var2, -424656766, -2044926660);
            }

            if (2 == var4) {
               this.method5332(var1, var2, 8192, -1905967368);
               this.method5332(var1 + 1, var2 - 1, 512, -2137705781);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 32768, -2134337063);
               this.method5332(var1 - 1, var2 - 1, 2048, -1902665295);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.method5332(var1, var2, 66560, -1796966946);
               this.method5332(var1 - 1, var2, 4096, -1904161390);
               this.method5332(var1, 1 + var2, 16384, -1847578571);
            }

            if (var4 == 1) {
               this.method5332(var1, var2, -348386413, -2006764319);
               this.method5332(var1, var2 + 1, -829318440, -2004791391);
               this.method5332(var1 + 1, var2, 65536, -1791489196);
            }

            if (var4 == 2) {
               this.method5332(var1, var2, 20480, -1882884860);
               this.method5332(1 + var1, var2, 229566932, -2051009569);
               this.method5332(var1, var2 - 1, 52343708, -1839312443);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 81985326, -2117107679);
               this.method5332(var1, var2 - 1, -1682584262, -2074543438);
               this.method5332(var1 - 1, var2, -1178444394, -1647762631);
            }
         }
      }
   }

   public classGC(int var1, int var2, boolean var3) {
      if (var3) {
         method5320(this, -1, -1, var1 + 6, 6 + var2, 476650753);
      } else {
         method5320(this, 0, 0, var1, var2, -541912044);
      }

      this.field2550 = new int[-148155585 * this.field2548][this.field2549 * 1473114359];
      method5324(this, (byte)-27);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZ)V")
   @ObfuscatedName("cu")
   void method5356(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += -686792469;
      }

      var1 -= this.field2558 * -783139297;
      var2 -= this.field2559 * -1600985446;
      if (1 == var5 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var1 + var3; var12++) {
         if (var12 >= 0 && var12 < this.field2548 * -148155585) {
            for (int var9 = var2; var9 < var4 + var2; var9++) {
               if (var9 >= 0 && var9 < 1473114359 * this.field2549) {
                  this.method5332(var12, var9, var7, -2008721363);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("cp")
   public void method5359(int var1, int var2, int var3, int var4, boolean var5) {
      this.method5354(var1, var2, var3, var4, 0, var5, -2066823809);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("cq")
   public void method5360(int var1, int var2, int var3, int var4, boolean var5) {
      this.method5354(var1, var2, var3, var4, 0, var5, -1787137347);
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("bh")
   public void method5351(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2558 * 370701143;
      var2 -= this.field2559 * 1140151217;
      if (0 == var3) {
         if (0 == var4) {
            this.method5332(var1, var2, 128, -1739465523);
            this.method5332(var1 - 1, var2, 8, -1766394011);
         }

         if (var4 == 1) {
            this.method5332(var1, var2, 2, -1671075051);
            this.method5332(var1, 1 + var2, 32, -1961120060);
         }

         if (var4 == 2) {
            this.method5332(var1, var2, 8, -1852111940);
            this.method5332(1 + var1, var2, 128, -1962531790);
         }

         if (3 == var4) {
            this.method5332(var1, var2, 32, -2116203888);
            this.method5332(var1, var2 - 1, 2, -2027182466);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (0 == var4) {
            this.method5332(var1, var2, 1, -2099106197);
            this.method5332(var1 - 1, var2 + 1, 16, -1691317177);
         }

         if (1 == var4) {
            this.method5332(var1, var2, 4, -1812723593);
            this.method5332(var1 + 1, var2 + 1, 64, -1773312899);
         }

         if (var4 == 2) {
            this.method5332(var1, var2, 16, -1916116678);
            this.method5332(1 + var1, var2 - 1, 1, -1669339564);
         }

         if (var4 == 3) {
            this.method5332(var1, var2, 64, -1675656091);
            this.method5332(var1 - 1, var2 - 1, 4, -2089683173);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method5332(var1, var2, 130, -1835666715);
            this.method5332(var1 - 1, var2, 8, -2100593696);
            this.method5332(var1, var2 + 1, 32, -1982362550);
         }

         if (var4 == 1) {
            this.method5332(var1, var2, 10, -1980840480);
            this.method5332(var1, var2 + 1, 32, -1820288991);
            this.method5332(1 + var1, var2, 128, -1979491366);
         }

         if (2 == var4) {
            this.method5332(var1, var2, 40, -2058875903);
            this.method5332(1 + var1, var2, 128, -1781102535);
            this.method5332(var1, var2 - 1, 2, -1870986839);
         }

         if (3 == var4) {
            this.method5332(var1, var2, 160, -2010844568);
            this.method5332(var1, var2 - 1, 2, -1859861257);
            this.method5332(var1 - 1, var2, 8, -1887515603);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.method5332(var1, var2, 65536, -1756839726);
               this.method5332(var1 - 1, var2, 4096, -1997113410);
            }

            if (1 == var4) {
               this.method5332(var1, var2, 1024, -1841504791);
               this.method5332(var1, 1 + var2, 16384, -1677339399);
            }

            if (var4 == 2) {
               this.method5332(var1, var2, 4096, -1773001972);
               this.method5332(var1 + 1, var2, 65536, -2019187060);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 16384, -1909128956);
               this.method5332(var1, var2 - 1, 1024, -2096409580);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               this.method5332(var1, var2, 512, -1831199650);
               this.method5332(var1 - 1, 1 + var2, 8192, -1906166057);
            }

            if (1 == var4) {
               this.method5332(var1, var2, 2048, -1840244182);
               this.method5332(1 + var1, 1 + var2, 32768, -2131439266);
            }

            if (2 == var4) {
               this.method5332(var1, var2, 8192, -1855272371);
               this.method5332(var1 + 1, var2 - 1, 512, -2093365139);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 32768, -1883161467);
               this.method5332(var1 - 1, var2 - 1, 2048, -2064569875);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.method5332(var1, var2, 66560, -1947009404);
               this.method5332(var1 - 1, var2, 4096, -1644957908);
               this.method5332(var1, 1 + var2, 16384, -1901317095);
            }

            if (var4 == 1) {
               this.method5332(var1, var2, 5120, -1729418887);
               this.method5332(var1, var2 + 1, 16384, -1951170033);
               this.method5332(var1 + 1, var2, 65536, -1751155730);
            }

            if (var4 == 2) {
               this.method5332(var1, var2, 20480, -2007651224);
               this.method5332(1 + var1, var2, 65536, -1957460532);
               this.method5332(var1, var2 - 1, 1024, -1771325033);
            }

            if (3 == var4) {
               this.method5332(var1, var2, 81920, -1725326534);
               this.method5332(var1, var2 - 1, 1024, -1776242052);
               this.method5332(var1 - 1, var2, 4096, -1766064490);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cs")
   public void method5365(int var1, int var2) {
      var1 -= this.field2558 * 370701143;
      var2 -= this.field2559 * 1140151217;
      this.field2550[var1][var2] = this.field2550[var1][var2] | 2097152;
   }

   @ObfuscatedSignature(descriptor = "(Lgc;IIIIZB)V")
   @ObfuscatedName("db")
   public static void method5361(classGC var0, int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      if (var0 == null) {
         var0.method5362(var1, var1, var1, var1, var5, var6);
      }

      try {
         var0.method5354(var1, var2, var3, var4, 0, var5, -1837603788);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gc.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int method5313() {
      return 1476838491 * this.field2548;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpn;)Z")
   @ObfuscatedName("yd")
   public static boolean method5353(classPN var0) {
      return classRN.method10130(var0.field5353 * 1468976603, 1138368900) == classYY.field7113;
   }

   @ObfuscatedSignature(descriptor = "(Lgc;IIIII)V")
   @ObfuscatedName("ny")
   public static void method5320(classGC var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method5322(var1, var1, var1, var1, var1);
      } else {
         try {
            var0.field2558 = 1954293863 * var1;
            var0.field2559 = -143452847 * var2;
            var0.field2548 = var3 * 1273896127;
            var0.field2549 = var4 * 380096711;
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "gc.ag(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;IIII)V")
   @ObfuscatedName("cs")
   public static void method5321(classGC var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5336(var1, var1, var1);
      }

      var0.field2558 = 1079891361 * var1;
      var0.field2559 = -1287396833 * var2;
      var0.field2548 = var3 * 935631792;
      var0.field2549 = var4 * 1667417018;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method5317(int var1) {
      try {
         return this.field2549 * 1473114359;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gc.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method5314(int var1) {
      try {
         return -148155585 * this.field2548;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gc.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("ca")
   public void method5374(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 1823652646 * this.field2558;
      var2 -= -503176542 * this.field2559;
      if (var3 == 0) {
         if (0 == var4) {
            this.method5337(var1, var2, 128, (byte)-64);
            this.method5337(var1 - 1, var2, 8, (byte)-31);
         }

         if (var4 == 1) {
            this.method5337(var1, var2, 2, (byte)-72);
            this.method5337(var1, var2 + 1, 32, (byte)-91);
         }

         if (var4 == 2) {
            this.method5337(var1, var2, 8, (byte)-55);
            this.method5337(1 + var1, var2, 128, (byte)-93);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, 32, (byte)-75);
            this.method5337(var1, var2 - 1, 2, (byte)-68);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (var4 == 0) {
            this.method5337(var1, var2, 1, (byte)-52);
            this.method5337(var1 - 1, var2 + 1, 16, (byte)-38);
         }

         if (1 == var4) {
            this.method5337(var1, var2, 4, (byte)-113);
            this.method5337(1 + var1, var2 + 1, -127837899, (byte)-38);
         }

         if (2 == var4) {
            this.method5337(var1, var2, 16, (byte)-118);
            this.method5337(var1 + 1, var2 - 1, 1, (byte)-63);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, 951289278, (byte)-93);
            this.method5337(var1 - 1, var2 - 1, 4, (byte)-77);
         }
      }

      if (var3 == 2) {
         if (0 == var4) {
            this.method5337(var1, var2, 130, (byte)-54);
            this.method5337(var1 - 1, var2, 8, (byte)-92);
            this.method5337(var1, 1 + var2, -1037371107, (byte)-19);
         }

         if (1 == var4) {
            this.method5337(var1, var2, 10, (byte)-80);
            this.method5337(var1, var2 + 1, 949745157, (byte)-44);
            this.method5337(var1 + 1, var2, 128, (byte)-99);
         }

         if (var4 == 2) {
            this.method5337(var1, var2, 2112555489, (byte)-14);
            this.method5337(1 + var1, var2, 128, (byte)-48);
            this.method5337(var1, var2 - 1, 2, (byte)-54);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, 160, (byte)13);
            this.method5337(var1, var2 - 1, 2, (byte)-57);
            this.method5337(var1 - 1, var2, 8, (byte)-3);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.method5337(var1, var2, 65536, (byte)-108);
               this.method5337(var1 - 1, var2, 4096, (byte)-38);
            }

            if (1 == var4) {
               this.method5337(var1, var2, 1024, (byte)-25);
               this.method5337(var1, var2 + 1, 16384, (byte)5);
            }

            if (2 == var4) {
               this.method5337(var1, var2, 4096, (byte)-112);
               this.method5337(1 + var1, var2, 2119081622, (byte)-18);
            }

            if (3 == var4) {
               this.method5337(var1, var2, 16384, (byte)-29);
               this.method5337(var1, var2 - 1, 1024, (byte)-118);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (var4 == 0) {
               this.method5337(var1, var2, 391600091, (byte)-107);
               this.method5337(var1 - 1, 1 + var2, 8192, (byte)-22);
            }

            if (var4 == 1) {
               this.method5337(var1, var2, 2048, (byte)-103);
               this.method5337(1 + var1, 1 + var2, -1990157554, (byte)-72);
            }

            if (2 == var4) {
               this.method5337(var1, var2, 1754307813, (byte)-106);
               this.method5337(var1 + 1, var2 - 1, 512, (byte)-107);
            }

            if (3 == var4) {
               this.method5337(var1, var2, -1093688366, (byte)-2);
               this.method5337(var1 - 1, var2 - 1, 2048, (byte)-65);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.method5337(var1, var2, 66560, (byte)-104);
               this.method5337(var1 - 1, var2, 1466401037, (byte)-20);
               this.method5337(var1, var2 + 1, 16384, (byte)-1);
            }

            if (1 == var4) {
               this.method5337(var1, var2, 363916962, (byte)-65);
               this.method5337(var1, 1 + var2, -2099299204, (byte)-58);
               this.method5337(1 + var1, var2, 2131474092, (byte)-94);
            }

            if (var4 == 2) {
               this.method5337(var1, var2, -1389801346, (byte)-110);
               this.method5337(var1 + 1, var2, 65536, (byte)-86);
               this.method5337(var1, var2 - 1, 1876923136, (byte)-111);
            }

            if (3 == var4) {
               this.method5337(var1, var2, 81920, (byte)-2);
               this.method5337(var1, var2 - 1, -1797614032, (byte)-116);
               this.method5337(var1 - 1, var2, 4096, (byte)-86);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("cc")
   public void method5375(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 370701143 * this.field2558;
      var2 -= 823945243 * this.field2559;
      if (var3 == 0) {
         if (0 == var4) {
            this.method5337(var1, var2, 1852087506, (byte)-31);
            this.method5337(var1 - 1, var2, 8, (byte)-47);
         }

         if (var4 == 1) {
            this.method5337(var1, var2, 2, (byte)-47);
            this.method5337(var1, var2 + 1, 32, (byte)-35);
         }

         if (var4 == 2) {
            this.method5337(var1, var2, 8, (byte)-120);
            this.method5337(1 + var1, var2, 128, (byte)13);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, -1529997671, (byte)-11);
            this.method5337(var1, var2 - 1, 2, (byte)-17);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (var4 == 0) {
            this.method5337(var1, var2, 1, (byte)4);
            this.method5337(var1 - 1, var2 + 1, 16, (byte)-117);
         }

         if (1 == var4) {
            this.method5337(var1, var2, 4, (byte)-2);
            this.method5337(1 + var1, var2 + 1, -27097336, (byte)-50);
         }

         if (2 == var4) {
            this.method5337(var1, var2, 16, (byte)-12);
            this.method5337(var1 + 1, var2 - 1, 1, (byte)-60);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, -1162485754, (byte)-14);
            this.method5337(var1 - 1, var2 - 1, 4, (byte)-38);
         }
      }

      if (var3 == 2) {
         if (0 == var4) {
            this.method5337(var1, var2, -1452379513, (byte)-37);
            this.method5337(var1 - 1, var2, 8, (byte)-119);
            this.method5337(var1, 1 + var2, 768799898, (byte)-34);
         }

         if (1 == var4) {
            this.method5337(var1, var2, 10, (byte)-87);
            this.method5337(var1, var2 + 1, -805537417, (byte)-102);
            this.method5337(var1 + 1, var2, 128, (byte)-100);
         }

         if (var4 == 2) {
            this.method5337(var1, var2, 40, (byte)-36);
            this.method5337(1 + var1, var2, 175628984, (byte)-128);
            this.method5337(var1, var2 - 1, 2, (byte)-77);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, 160, (byte)-7);
            this.method5337(var1, var2 - 1, 2, (byte)-123);
            this.method5337(var1 - 1, var2, 8, (byte)-30);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.method5337(var1, var2, 65536, (byte)-73);
               this.method5337(var1 - 1, var2, -1382578359, (byte)-68);
            }

            if (1 == var4) {
               this.method5337(var1, var2, 1024, (byte)-92);
               this.method5337(var1, var2 + 1, 16384, (byte)-97);
            }

            if (2 == var4) {
               this.method5337(var1, var2, 1515237953, (byte)-117);
               this.method5337(1 + var1, var2, 65536, (byte)-73);
            }

            if (3 == var4) {
               this.method5337(var1, var2, -464398882, (byte)-122);
               this.method5337(var1, var2 - 1, 1024, (byte)-63);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (var4 == 0) {
               this.method5337(var1, var2, 512, (byte)13);
               this.method5337(var1 - 1, 1 + var2, 8192, (byte)-111);
            }

            if (var4 == 1) {
               this.method5337(var1, var2, 2048, (byte)-36);
               this.method5337(1 + var1, 1 + var2, 32768, (byte)-110);
            }

            if (2 == var4) {
               this.method5337(var1, var2, 8192, (byte)-112);
               this.method5337(var1 + 1, var2 - 1, 557792472, (byte)-121);
            }

            if (3 == var4) {
               this.method5337(var1, var2, -1082505814, (byte)-51);
               this.method5337(var1 - 1, var2 - 1, 2048, (byte)-105);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.method5337(var1, var2, -1990010400, (byte)-37);
               this.method5337(var1 - 1, var2, 4096, (byte)-128);
               this.method5337(var1, var2 + 1, 1584272784, (byte)-63);
            }

            if (1 == var4) {
               this.method5337(var1, var2, 1457884246, (byte)-43);
               this.method5337(var1, 1 + var2, 16384, (byte)-121);
               this.method5337(1 + var1, var2, 178098116, (byte)-78);
            }

            if (var4 == 2) {
               this.method5337(var1, var2, -970060145, (byte)-20);
               this.method5337(var1 + 1, var2, 65536, (byte)-68);
               this.method5337(var1, var2 - 1, 1024, (byte)-113);
            }

            if (3 == var4) {
               this.method5337(var1, var2, -5537139, (byte)-110);
               this.method5337(var1, var2 - 1, 1024, (byte)-120);
               this.method5337(var1 - 1, var2, 4096, (byte)12);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;II)V")
   @ObfuscatedName("qp")
   public static void method5366(classGC var0, int var1, int var2) {
      if (var0 == null) {
         var0.method5367(var1, var1);
      }

      var1 -= var0.field2558 * 370701143;
      var2 -= var0.field2559 * 1140151217;
      var0.field2550[var1][var2] = var0.field2550[var1][var2] | 2097152;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("cf")
   public void method5376(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 370701143 * this.field2558;
      var2 -= 1140151217 * this.field2559;
      if (var3 == 0) {
         if (0 == var4) {
            this.method5337(var1, var2, 128, (byte)-66);
            this.method5337(var1 - 1, var2, 8, (byte)-62);
         }

         if (var4 == 1) {
            this.method5337(var1, var2, 2, (byte)-39);
            this.method5337(var1, var2 + 1, 32, (byte)-67);
         }

         if (var4 == 2) {
            this.method5337(var1, var2, 8, (byte)-38);
            this.method5337(1 + var1, var2, 128, (byte)-121);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, 32, (byte)-17);
            this.method5337(var1, var2 - 1, 2, (byte)-42);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (var4 == 0) {
            this.method5337(var1, var2, 1, (byte)-98);
            this.method5337(var1 - 1, var2 + 1, 16, (byte)-42);
         }

         if (1 == var4) {
            this.method5337(var1, var2, 4, (byte)-50);
            this.method5337(1 + var1, var2 + 1, 64, (byte)-21);
         }

         if (2 == var4) {
            this.method5337(var1, var2, 16, (byte)-50);
            this.method5337(var1 + 1, var2 - 1, 1, (byte)-10);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, 64, (byte)9);
            this.method5337(var1 - 1, var2 - 1, 4, (byte)-43);
         }
      }

      if (var3 == 2) {
         if (0 == var4) {
            this.method5337(var1, var2, 130, (byte)-107);
            this.method5337(var1 - 1, var2, 8, (byte)-30);
            this.method5337(var1, 1 + var2, 32, (byte)-71);
         }

         if (1 == var4) {
            this.method5337(var1, var2, 10, (byte)-115);
            this.method5337(var1, var2 + 1, 32, (byte)-42);
            this.method5337(var1 + 1, var2, 128, (byte)-91);
         }

         if (var4 == 2) {
            this.method5337(var1, var2, 40, (byte)-44);
            this.method5337(1 + var1, var2, 128, (byte)-33);
            this.method5337(var1, var2 - 1, 2, (byte)-29);
         }

         if (var4 == 3) {
            this.method5337(var1, var2, 160, (byte)5);
            this.method5337(var1, var2 - 1, 2, (byte)-28);
            this.method5337(var1 - 1, var2, 8, (byte)-59);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               this.method5337(var1, var2, 65536, (byte)-54);
               this.method5337(var1 - 1, var2, 4096, (byte)-92);
            }

            if (1 == var4) {
               this.method5337(var1, var2, 1024, (byte)-9);
               this.method5337(var1, var2 + 1, 16384, (byte)-43);
            }

            if (2 == var4) {
               this.method5337(var1, var2, 4096, (byte)-126);
               this.method5337(1 + var1, var2, 65536, (byte)-100);
            }

            if (3 == var4) {
               this.method5337(var1, var2, 16384, (byte)-84);
               this.method5337(var1, var2 - 1, 1024, (byte)-114);
            }
         }

         if (1 == var3 || var3 == 3) {
            if (var4 == 0) {
               this.method5337(var1, var2, 512, (byte)-27);
               this.method5337(var1 - 1, 1 + var2, 8192, (byte)-94);
            }

            if (var4 == 1) {
               this.method5337(var1, var2, 2048, (byte)-13);
               this.method5337(1 + var1, 1 + var2, 32768, (byte)-59);
            }

            if (2 == var4) {
               this.method5337(var1, var2, 8192, (byte)-114);
               this.method5337(var1 + 1, var2 - 1, 512, (byte)-88);
            }

            if (3 == var4) {
               this.method5337(var1, var2, 32768, (byte)-111);
               this.method5337(var1 - 1, var2 - 1, 2048, (byte)-42);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               this.method5337(var1, var2, 66560, (byte)-99);
               this.method5337(var1 - 1, var2, 4096, (byte)2);
               this.method5337(var1, var2 + 1, 16384, (byte)-99);
            }

            if (1 == var4) {
               this.method5337(var1, var2, 5120, (byte)-102);
               this.method5337(var1, 1 + var2, 16384, (byte)-84);
               this.method5337(1 + var1, var2, 65536, (byte)-58);
            }

            if (var4 == 2) {
               this.method5337(var1, var2, 20480, (byte)-27);
               this.method5337(var1 + 1, var2, 65536, (byte)-27);
               this.method5337(var1, var2 - 1, 1024, (byte)-115);
            }

            if (3 == var4) {
               this.method5337(var1, var2, 81920, (byte)-14);
               this.method5337(var1, var2 - 1, 1024, (byte)-15);
               this.method5337(var1 - 1, var2, 4096, (byte)-77);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cy")
   public void method5370(int var1, int var2) {
      var1 -= this.field2558 * 370701143;
      var2 -= this.field2559 * 1140151217;
      this.field2550[var1][var2] = this.field2550[var1][var2] | 262144;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZ)V")
   @ObfuscatedName("ch")
   public void method5379(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.field2558 * 370701143;
      var2 -= 1140151217 * this.field2559;
      if (var5 == 1 || 3 == var5) {
         int var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for (int var12 = var1; var12 < var1 + var3; var12++) {
         if (var12 >= 0 && var12 < this.field2548 * -148155585) {
            for (int var9 = var2; var9 < var4 + var2; var9++) {
               if (var9 >= 0 && var9 < this.field2549 * 1473114359) {
                  this.method5337(var12, var9, var7, (byte)-104);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cz")
   public void method5381(int var1, int var2) {
      var1 -= this.field2558 * 1830473737;
      var2 -= this.field2559 * 1140151217;
      this.field2550[var1][var2] = this.field2550[var1][var2] & -1575545659;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method5307(int var0) {
      try {
         classJZ.method6431(classOF.field4852);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "gc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bk")
   boolean method5331(int var1, int var2, int var3) {
      return 0 != (this.field2550[var1][var2] & var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;IIIIZ)V")
   @ObfuscatedName("aa")
   public static void method5352(classGC var0, int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= var0.field2558 * 370701143;
      var2 -= var0.field2559 * 1140151217;
      if (0 == var3) {
         if (0 == var4) {
            var0.method5332(var1, var2, 128, -1802989674);
            var0.method5332(var1 - 1, var2, 8, -1966817926);
         }

         if (var4 == 1) {
            var0.method5332(var1, var2, 2, -2104683614);
            var0.method5332(var1, 1 + var2, 32, -1906403888);
         }

         if (var4 == 2) {
            var0.method5332(var1, var2, 8, -2114287223);
            var0.method5332(1 + var1, var2, 128, -2031640852);
         }

         if (3 == var4) {
            var0.method5332(var1, var2, 32, -1819231843);
            var0.method5332(var1, var2 - 1, 2, -1733812984);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (0 == var4) {
            var0.method5332(var1, var2, 1, -1686430853);
            var0.method5332(var1 - 1, var2 + 1, 16, -1754623693);
         }

         if (1 == var4) {
            var0.method5332(var1, var2, 4, -1859142076);
            var0.method5332(var1 + 1, var2 + 1, 64, -2136587224);
         }

         if (var4 == 2) {
            var0.method5332(var1, var2, 16, -1823491307);
            var0.method5332(1 + var1, var2 - 1, 1, -1737788961);
         }

         if (var4 == 3) {
            var0.method5332(var1, var2, 64, -1840868134);
            var0.method5332(var1 - 1, var2 - 1, 4, -1949907126);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            var0.method5332(var1, var2, 130, -2104113602);
            var0.method5332(var1 - 1, var2, 8, -2113252944);
            var0.method5332(var1, var2 + 1, 32, -1919802620);
         }

         if (var4 == 1) {
            var0.method5332(var1, var2, 10, -2125592882);
            var0.method5332(var1, var2 + 1, 32, -2118850670);
            var0.method5332(1 + var1, var2, 128, -2016974372);
         }

         if (2 == var4) {
            var0.method5332(var1, var2, 40, -2026354429);
            var0.method5332(1 + var1, var2, 128, -2119077449);
            var0.method5332(var1, var2 - 1, 2, -1941774932);
         }

         if (3 == var4) {
            var0.method5332(var1, var2, 160, -1766745503);
            var0.method5332(var1, var2 - 1, 2, -1759941127);
            var0.method5332(var1 - 1, var2, 8, -1884629921);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (var4 == 0) {
               var0.method5332(var1, var2, 65536, -2105935122);
               var0.method5332(var1 - 1, var2, 4096, -1639852874);
            }

            if (1 == var4) {
               var0.method5332(var1, var2, 1024, -1679263386);
               var0.method5332(var1, 1 + var2, 16384, -2015178141);
            }

            if (var4 == 2) {
               var0.method5332(var1, var2, 4096, -2076562725);
               var0.method5332(var1 + 1, var2, 65536, -1762369433);
            }

            if (3 == var4) {
               var0.method5332(var1, var2, 16384, -1716734967);
               var0.method5332(var1, var2 - 1, 1024, -1880885542);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               var0.method5332(var1, var2, 512, -1644757515);
               var0.method5332(var1 - 1, 1 + var2, 8192, -1800841925);
            }

            if (1 == var4) {
               var0.method5332(var1, var2, 2048, -2051091554);
               var0.method5332(1 + var1, 1 + var2, 32768, -2091796020);
            }

            if (2 == var4) {
               var0.method5332(var1, var2, 8192, -1850368268);
               var0.method5332(var1 + 1, var2 - 1, 512, -1936180818);
            }

            if (3 == var4) {
               var0.method5332(var1, var2, 32768, -1745723690);
               var0.method5332(var1 - 1, var2 - 1, 2048, -1764681714);
            }
         }

         if (var3 == 2) {
            if (0 == var4) {
               var0.method5332(var1, var2, 66560, -1944442087);
               var0.method5332(var1 - 1, var2, 4096, -1640983734);
               var0.method5332(var1, 1 + var2, 16384, -1695824944);
            }

            if (var4 == 1) {
               var0.method5332(var1, var2, 5120, -1698770041);
               var0.method5332(var1, var2 + 1, 16384, -2141957397);
               var0.method5332(var1 + 1, var2, 65536, -2056202241);
            }

            if (var4 == 2) {
               var0.method5332(var1, var2, 20480, -1851434775);
               var0.method5332(1 + var1, var2, 65536, -1914722081);
               var0.method5332(var1, var2 - 1, 1024, -1976917867);
            }

            if (3 == var4) {
               var0.method5332(var1, var2, 81920, -1909895626);
               var0.method5332(var1, var2 - 1, 1024, -1682594941);
               var0.method5332(var1 - 1, var2, 4096, -1964847894);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ag")
   final void method5322(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.field2549 = 1954293863 * var1;
         this.field2549 = -143452847 * var2;
         this.field2549 = var3 * 1273896127;
         this.field2559 = var4 * 380096711;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gc.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   int method5308(int var1) {
      try {
         return 370701143 * this.field2559;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gc.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgc;IIB)V")
   @ObfuscatedName("rt")
   public static void method5371(classGC var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method5372(var1, var1, var3);
      } else {
         try {
            var1 -= var0.field2558 * 370701143;
            var2 -= var0.field2559 * 1140151217;
            var0.field2550[var1][var2] = var0.field2550[var1][var2] | 262144;
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "gc.au(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;IIII)V")
   @ObfuscatedName("ao")
   public static void method5323(classGC var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5334(var1, var1, var1);
      }

      var0.field2558 = 1954293863 * var1;
      var0.field2559 = -143452847 * var2;
      var0.field2548 = var3 * 1273896127;
      var0.field2549 = var4 * -1542058307;
   }

   @ObfuscatedSignature(descriptor = "(IIIIZB)V")
   @ObfuscatedName("ad")
   public void method5362(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      try {
         this.method5354(var1, var2, var3, var4, 0, var5, -1837603788);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "gc.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("au")
   public void method5372(int var1, int var2, byte var3) {
      try {
         var1 -= this.field2558 * 370701143;
         var2 -= this.field2558 * 1140151217;
         this.field2550[var1][var2] = this.field2550[var1][var2] | 262144;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gc.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bq")
   public void method5343(int var1, int var2, int var3) {
      this.method5337(var1 - this.field2548 * 370701143, var2 - this.field2549 * 1432708128, var3, (byte)-55);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("nl")
   public void method5389() {
      method5324(this, (byte)-61);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   public void method5328(byte var1) {
      try {
         for (int var2 = 0; var2 < -148155585 * this.field2558; var2++) {
            if (var1 == 26) {
               throw new IllegalStateException();
            }

            for (int var3 = 0; var3 < this.field2548 * 1473114359; var3++) {
               if (var1 == 26) {
                  throw new IllegalStateException();
               }

               if (var2 >= 1) {
                  if (var1 == 26) {
                     return;
                  }

                  if (var3 >= 1) {
                     if (var1 == 26) {
                        return;
                     }

                     if (var2 < this.field2549 * -148155585 - 5) {
                        if (var1 == 26) {
                           throw new IllegalStateException();
                        }

                        if (var3 < this.field2548 * 1473114359 - 5) {
                           this.field2550[var2][var3] = 1073741824;
                           continue;
                        }

                        if (var1 == 26) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               this.field2550[var2][var3] = 16777215;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gc.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgc;B)I")
   @ObfuscatedName("so")
   public static int method5310(classGC var0, byte var1) {
      if (var0 == null) {
         var0.method5311(var1);
      }

      try {
         return var0.field2559 * 1140151217;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gc.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("af")
   int method5311(byte var1) {
      try {
         return this.field2548 * 1140151217;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gc.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cd")
   public void method5367(int var1, int var2) {
      var1 -= this.field2558 * 370701143;
      var2 -= this.field2558 * 1140151217;
      this.field2550[var1][var2] = this.field2550[var1][var2] | 2097152;
   }
}
