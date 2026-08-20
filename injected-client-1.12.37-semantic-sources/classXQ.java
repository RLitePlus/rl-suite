import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xq")
public class classXQ implements classXZ {
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("ae")
   static final classXQ field6912 = new classXQ("", 2, new classXW[]{classXW.field6948, classXW.field6949, classXW.field6947});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("af")
   static final classXQ field6918 = new classXQ("", 1, new classXW[]{classXW.field6948, classXW.field6947, classXW.field6946});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("ax")
   static final classXQ field6911 = new classXQ("", 6, new classXW[]{classXW.field6947});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("ab")
   static final classXQ field6909 = new classXQ("", 3, new classXW[]{classXW.field6948});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("aj")
   static final classXQ field6913 = new classXQ("", 12, new classXW[]{classXW.field6948, classXW.field6947});
   @ObfuscatedName("aq")
   final int field6907;
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("ag")
   static final classXQ field6915 = new classXQ("", 4);
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("ac")
   static final classXQ field6914 = new classXQ("", 8, new classXW[]{classXW.field6948, classXW.field6947});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("aa")
   static final classXQ field6919 = new classXQ("", 9, new classXW[]{classXW.field6948, classXW.field6949});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("az")
   static final classXQ field6910 = new classXQ("", 0, new classXW[]{classXW.field6947, classXW.field6946});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("al")
   static final classXQ field6917 = new classXQ("", 11, new classXW[]{classXW.field6948});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("as")
   static final classXQ field6916 = new classXQ("", 5, new classXW[]{classXW.field6948, classXW.field6947});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("ay")
   static final classXQ field6921 = new classXQ("", 13, new classXW[]{classXW.field6948});
   @ObfuscatedSignature(descriptor = "Lxq;")
   @ObfuscatedName("ao")
   static final classXQ field6920 = new classXQ("", 10, new classXW[]{classXW.field6948});
   @ObfuscatedName("ad")
   final Set field6908 = new HashSet();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return -1655695213 * this.field6907;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("gz")
   static final void method12876(int var0, int var1) {
      Scene.method4451(var0);

      try {
         for (WorldView var3 : client.field814) {
            var3.method3759(-1592433219);
         }

         int var6 = classGN.method5504(var0, (byte)1).field5193 * 2063088649;
         if (0 == var6) {
            if (var1 == 541084081) {
               throw new IllegalStateException();
            }
         } else {
            int var7 = classLB.field4090[var0];
            if (1 == var6) {
               if (var1 == 541084081) {
                  return;
               }

               if (var7 == 1) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  classHA.method5989(0.9);
               }

               if (2 == var7) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  classHA.method5989(0.8);
               }

               if (3 == var7) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  classHA.method5989(0.7);
               }

               if (4 == var7) {
                  classHA.method5989(0.6);
               }
            }

            if (3 == var6) {
               if (var1 == 541084081) {
                  throw new IllegalStateException();
               }

               if (0 == var7) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  ClientPreferences.method2765(classAB.field122, 255, 1222866659);
                  classKL.method6494(-1894929341);
               }

               if (var7 == 1) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  ClientPreferences.method2765(classAB.field122, 192, 1222866659);
                  classKL.method6494(-122589735);
               }

               if (var7 == 2) {
                  ClientPreferences.method2765(classAB.field122, 128, 1222866659);
                  classKL.method6494(-536779833);
               }

               if (3 == var7) {
                  if (var1 == 541084081) {
                     return;
                  }

                  ClientPreferences.method2765(classAB.field122, 64, 1222866659);
                  classKL.method6494(-1563284186);
               }

               if (var7 == 4) {
                  if (var1 == 541084081) {
                     return;
                  }

                  ClientPreferences.method2765(classAB.field122, 0, 1222866659);
                  classKL.method6494(-1139972936);
               }
            }

            if (4 == var6) {
               if (var1 == 541084081) {
                  return;
               }

               if (0 == var7) {
                  if (var1 == 541084081) {
                     return;
                  }

                  ClientPreferences.method2774(classAB.field122, 127, -1580279836);
                  classGI.method5464(-1779263393);
               }

               if (var7 == 1) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  ClientPreferences.method2774(classAB.field122, 96, -1169712968);
                  classGI.method5464(-1894517613);
               }

               if (var7 == 2) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  ClientPreferences.method2774(classAB.field122, 64, -1282325137);
                  classGI.method5464(-2006285235);
               }

               if (var7 == 3) {
                  if (var1 == 541084081) {
                     return;
                  }

                  ClientPreferences.method2774(classAB.field122, 32, -448671078);
                  classGI.method5464(-2093856574);
               }

               if (var7 == 4) {
                  if (var1 == 541084081) {
                     return;
                  }

                  ClientPreferences.method2774(classAB.field122, 0, -1537904000);
                  classGI.method5464(-2043956577);
               }
            }

            if (5 == var6) {
               if (var1 == 541084081) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (var7 == 1) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               client.field972 = var10000;
            }

            if (var6 == 6) {
               if (var1 == 541084081) {
                  throw new IllegalStateException();
               }

               client.field984 = var7 * 1235129253;
            }

            if (9 == var6) {
            }

            if (10 == var6) {
               if (var1 == 541084081) {
                  throw new IllegalStateException();
               }

               if (var7 == 0) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  classAB.field122.method2781(127, (byte)52);
                  classDO.method3509((byte)39);
               }

               if (1 == var7) {
                  classAB.field122.method2781(96, (byte)-45);
                  classDO.method3509((byte)103);
               }

               if (var7 == 2) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  classAB.field122.method2781(64, (byte)-33);
                  classDO.method3509((byte)80);
               }

               if (var7 == 3) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  classAB.field122.method2781(32, (byte)-99);
                  classDO.method3509((byte)116);
               }

               if (4 == var7) {
                  classAB.field122.method2781(0, (byte)20);
                  classDO.method3509((byte)25);
               }
            }

            if (17 == var6) {
               if (var1 == 541084081) {
                  return;
               }

               if (!client.field925.contains(var0)) {
                  client.field925.add(var0);
               }
            }

            if (18 == var6) {
               if (var1 == 541084081) {
                  throw new IllegalStateException();
               }

               classCK[] var4 = new classCK[]{classCK.field768, classCK.field765, classCK.field766, classCK.field767, classCK.field769};
               client.field916 = (classCK)classOF.method8404(var4, var7, 330820815);
               if (null == client.field916) {
                  if (var1 == 541084081) {
                     return;
                  }

                  client.field916 = classCK.field765;
               }
            }

            if (var6 == 19) {
               if (var1 == 541084081) {
                  throw new IllegalStateException();
               }

               if (var7 == -1) {
                  if (var1 == 541084081) {
                     throw new IllegalStateException();
                  }

                  client.field971 = 2023588213;
               } else {
                  client.field971 = -2023588213 * (var7 & 2047);
               }
            }

            if (var6 == 22) {
               if (var1 == 541084081) {
                  throw new IllegalStateException();
               }

               classCK[] var8 = new classCK[]{classCK.field768, classCK.field765, classCK.field766, classCK.field767, classCK.field769};
               client.field897 = (classCK)classOF.method8404(var8, var7, -14253417);
               if (null == client.field897) {
                  if (var1 == 541084081) {
                     return;
                  }

                  client.field897 = classCK.field765;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "xq.gz(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyi;Lvq;J)V")
   @ObfuscatedName("pv")
   public static void method12871(NodeHashTable var0, Node var1, long var2) {
      if (var0 == null) {
         var0.method13363(var2);
      }

      if (var1.field6553 != null) {
         var1.vmethod398();
      }

      Node var4 = var0.field6986[(int)(var2 & var0.field6987 - 1)];
      var1.field6553 = var4.field6553;
      var1.field6554 = var4;
      var1.field6553.field6554 = var1;
      var1.field6554.field6553 = var1;
      var1.field6552 = var2;
   }

   classXQ(String var1, int var2, classXW[] var3) {
      this.field6907 = var2 * -485964389;
      classXW[] var4 = var3;

      for (int var5 = 0; var5 < var4.length; var5++) {
         classXW var6 = var4[var5];
         this.field6908.add(var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return -1655695213 * this.field6907;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xq.az(" + 41);
      }
   }

   static {
      method12870((byte)105);
   }

   @ObfuscatedSignature(descriptor = "(Lnc;I)J")
   @ObfuscatedName("nz")
   public static long method12873(classNC var0, int var1) {
      return var0 == null ? var0.method7805(var1) : var0.field4655 + (long)var1 * var0.field4653;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return -1655695213 * this.field6907;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return -1655695213 * this.field6907;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("az")
   static int method12872(String var0, int var1) {
      try {
         int var3;
         for (var3 = var0.indexOf(60, 0); -1 != var3 && var3 > 0; var3 = var0.indexOf(60, 1 + var3)) {
            if (var1 <= 2014430317) {
               throw new IllegalStateException();
            }

            if (var0.charAt(var3 - 1) != '\\') {
               break;
            }
         }

         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xq.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lxq;")
   @ObfuscatedName("as")
   static classXQ[] method12869() {
      return new classXQ[]{
         field6920, field6916, field6918, field6911, field6919, field6913, field6910, field6914, field6915, field6912, field6917, field6921, field6909
      };
   }

   classXQ(String var1, int var2) {
      this.field6907 = -485964389 * var2;
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bn")
   static final void method12875(boolean var0, int var1) {
      try {
         if (var0) {
            if (var1 != 402128428) {
               return;
            }

            classEN var10000;
            if (classBF.field393) {
               if (var1 != 402128428) {
                  throw new IllegalStateException();
               }

               var10000 = classEN.field1799;
            } else {
               var10000 = classEN.field1797;
            }

            client.field927 = var10000;
         } else {
            classEN var3;
            if (classAB.field122.method2805(classBF.field389, (short)10983)) {
               if (var1 != 402128428) {
                  throw new IllegalStateException();
               }

               var3 = classEN.field1795;
            } else {
               var3 = classEN.field1798;
            }

            client.field927 = var3;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xq.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Lxq;")
   @ObfuscatedName("ag")
   static classXQ[] method12870(byte var0) {
      try {
         return new classXQ[]{
            field6920, field6916, field6918, field6911, field6919, field6913, field6910, field6914, field6915, field6912, field6917, field6921, field6909
         };
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "xq.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcp;I)V")
   @ObfuscatedName("aq")
   static void method12874(classCP var0, int var1) {
      try {
         if (var0 == client.field901) {
            if (var1 <= -1271687819) {
               throw new IllegalStateException();
            }
         } else {
            client.field901 = var0;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xq.aq(" + ')');
      }
   }
}
