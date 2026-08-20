import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ix")
public class classIX {
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("ac")
   classNV field3083;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field3085 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field3084 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field3086 = 5;
   @ObfuscatedName("as")
   long field3088;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field3087 = 1;
   @ObfuscatedName("ax")
   public long field3082 = 8226759114265297917L;

   @ObfuscatedSignature(descriptor = "(Lxy;S)V")
   @ObfuscatedName("az")
   void method6325(classXY var1, short var2) {
      try {
         this.field3088 = var1.method13059(-1384984816);
         this.field3082 = var1.method13059(-532145666) * -8226759114265297917L;

         for (int var3 = classXY.method13039(var1, -346779531); 0 != var3; var3 = classXY.method13039(var1, -346779531)) {
            if (var2 >= 255) {
               throw new IllegalStateException();
            }

            Object var4;
            if (1 == var3) {
               if (var2 >= 255) {
                  throw new IllegalStateException();
               }

               var4 = new classIR(this);
            } else if (4 == var3) {
               if (var2 >= 255) {
                  throw new IllegalStateException();
               }

               var4 = new classIT(this);
            } else if (3 == var3) {
               if (var2 >= 255) {
                  return;
               }

               var4 = new classIM(this);
            } else if (var3 == 2) {
               if (var2 >= 255) {
                  throw new IllegalStateException();
               }

               var4 = new classIA(this);
            } else {
               if (5 != var3) {
                  throw new RuntimeException("");
               }

               if (var2 >= 255) {
                  throw new IllegalStateException();
               }

               var4 = new classIB(this);
            }

            ((classIS)var4).vmethod507(var1, -719199796);
            classNV.method8156(this.field3083, (classVQ)var4);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ix.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;B)V")
   @ObfuscatedName("af")
   public void method6330(classIE var1, byte var2) {
      try {
         if (var1.field6552 == this.field3088) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (-8128530336532066645L * this.field3082 == -8293005437275873549L * var1.field2953) {
               for (classIS var3 = (classIS)this.field3083.method8167(); var3 != null; var3 = (classIS)classAAX.method294(this.field3083)) {
                  if (var2 >= 0) {
                     return;
                  }

                  var3.vmethod509(var1, 1059836227);
               }

               var1.field2953 += 2301448292752648763L;
               return;
            }

            if (var2 >= 0) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ix.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lix;Lxy;)V")
   @ObfuscatedName("ku")
   public static void method6326(classIX var0, classXY var1) {
      if (var0 == null) {
         var0.method6327(var1);
      } else {
         var0.field3088 = var1.method13059(-632078937);
         var0.field3082 = var1.method13059(2120238084) * -8226759114265297917L;

         for (int var2 = classXY.method13039(var1, -346779531); 0 != var2; var2 = classXY.method13039(var1, -346779531)) {
            Object var3;
            if (1 == var2) {
               var3 = new classIR(var0);
            } else if (4 == var2) {
               var3 = new classIT(var0);
            } else if (3 == var2) {
               var3 = new classIM(var0);
            } else if (var2 == 2) {
               var3 = new classIA(var0);
            } else {
               if (5 != var2) {
                  throw new RuntimeException("");
               }

               var3 = new classIB(var0);
            }

            ((classIS)var3).vmethod507(var1, -1723543446);
            classNV.method8156(var0.field3083, (classVQ)var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   void method6327(classXY var1) {
      this.field3088 = var1.method13059(520075859);
      this.field3082 = var1.method13059(289186193) * -8226759114265297917L;

      for (int var2 = classXY.method13039(var1, -346779531); 0 != var2; var2 = classXY.method13039(var1, -346779531)) {
         Object var3;
         if (1 == var2) {
            var3 = new classIR(this);
         } else if (4 == var2) {
            var3 = new classIT(this);
         } else if (3 == var2) {
            var3 = new classIM(this);
         } else if (var2 == 2) {
            var3 = new classIA(this);
         } else {
            if (5 != var2) {
               throw new RuntimeException("");
            }

            var3 = new classIB(this);
         }

         ((classIS)var3).vmethod507(var1, -1602566673);
         classNV.method8156(this.field3083, (classVQ)var3);
      }
   }

   public classIX(classXY var1) {
      this.field3083 = new classNV();
      this.method6325(var1, (short)-29660);
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("as")
   public void method6331(classIE var1) {
      if (var1.field6552 == this.field3088 && -8128530336532066645L * this.field3082 == -8293005437275873549L * var1.field2953) {
         for (classIS var2 = (classIS)this.field3083.method8167(); var2 != null; var2 = (classIS)classAAX.method294(this.field3083)) {
            var2.vmethod509(var1, -1454512603);
         }

         var1.field2953 += 2301448292752648763L;
      } else {
         throw new RuntimeException("");
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lix;Lxy;)V")
   @ObfuscatedName("la")
   public static void method6328(classIX var0, classXY var1) {
      if (var0 == null) {
         var0.method6327(var1);
      } else {
         var0.field3088 = var1.method13059(1464582720);
         var0.field3082 = var1.method13059(1774728430) * -8226759114265297917L;

         for (int var2 = classXY.method13039(var1, -346779531); 0 != var2; var2 = classXY.method13039(var1, -346779531)) {
            Object var3;
            if (1 == var2) {
               var3 = new classIR(var0);
            } else if (4 == var2) {
               var3 = new classIT(var0);
            } else if (3 == var2) {
               var3 = new classIM(var0);
            } else if (var2 == 2) {
               var3 = new classIA(var0);
            } else {
               if (5 != var2) {
                  throw new RuntimeException("");
               }

               var3 = new classIB(var0);
            }

            ((classIS)var3).vmethod507(var1, 386832497);
            classNV.method8156(var0.field3083, (classVQ)var3);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ax")
   public void method6332(classIE var1) {
      if (var1.field6552 == this.field3088 && -8128530336532066645L * this.field3082 == -8293005437275873549L * var1.field2953) {
         for (classIS var2 = (classIS)this.field3083.method8167(); var2 != null; var2 = (classIS)classAAX.method294(this.field3083)) {
            var2.vmethod509(var1, -1408873289);
         }

         var1.field2953 += 2301448292752648763L;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsp;III)V")
   @ObfuscatedName("af")
   static void method6333(classSP var0, int var1, int var2, int var3) {
      try {
         if (var1 == 65535) {
            if (var3 > 360123687) {
               byte var7 = -1;
               classQR.method9722(var0.field6017, var7, -2136593812);
               classQR.method9747(var0.field6017, -180040373);
               var0.field6018 = var2 * -1033857357;
            }
         } else {
            classOU var4 = var0.field6017.method9731((byte)30);
            if (var4 != null) {
               if (var3 <= 360123687) {
                  throw new IllegalStateException();
               }

               if (var1 == var0.method10598((byte)-65)) {
                  if (var3 <= 360123687) {
                     return;
                  }

                  int var5 = var4.field5122 * 1697446663;
                  if (1 == var5) {
                     if (var3 <= 360123687) {
                        throw new IllegalStateException();
                     }

                     classQR.method9747(var0.field6017, -126942821);
                     var0.field6018 = var2 * -1033857357;
                  }

                  if (2 == var5) {
                     if (var3 <= 360123687) {
                        throw new IllegalStateException();
                     }

                     classQR.method9754(var0.field6017, 228977571);
                  }

                  return;
               }

               if (classQA.method9430(var1, 1926809740).field5121 * -1968168817 < var4.field5121 * -1968168817) {
                  if (var3 <= 360123687) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }

            classQR.method9722(var0.field6017, var1, -2145678588);
            classQR.method9747(var0.field6017, -2021238633);
            var0.field6018 = var2 * -1033857357;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ix.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   public static int method6329(int var0, int var1) {
      try {
         return var0 & 0xFF;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ix.ae(" + 41);
      }
   }
}
