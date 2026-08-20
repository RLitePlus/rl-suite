import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wc")
public class classWC {
   @ObfuscatedSignature(descriptor = "Lam;")
   @ObfuscatedName("az")
   classAM field6660;
   @ObfuscatedSignature(descriptor = "Lzl;")
   @ObfuscatedName("af")
   classZL field6663 = classZL.field7194;
   @ObfuscatedName("ae")
   long field6659 = 0L;
   @ObfuscatedName("ab")
   int field6658 = 0;
   @ObfuscatedName("ag")
   int field6661 = 0;
   @ObfuscatedName("as")
   int field6662 = 0;

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("at")
   int method12306(int var1, int var2, int var3) {
      return var2 >= var3 ? var1 : (int)(var1 * ((float)var2 / var3));
   }

   @ObfuscatedSignature(descriptor = "(IILwd;I)V")
   @ObfuscatedName("az")
   public void method12289(int var1, int var2, classWD var3, int var4) {
      try {
         int var5 = this.method12298(-1529138595);
         if (var5 < var1) {
            if (var4 <= 1808970688) {
               throw new IllegalStateException();
            }

            this.method12294(var1, var2, var3.method12327(2074239405), var3.method12325((byte)82), 128532627);
         } else if (var5 > var1) {
            this.method12294(var1, var2, var3.method12333((byte)-61), classWD.method12332(var3, -69764207), -160083108);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wc.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)I")
   @ObfuscatedName("ax")
   int method12309(int var1, long var2) {
      try {
         if (var1 == 1439462015 * this.field6662) {
            return var1;
         } else if (var1 > 1439462015 * this.field6662) {
            double var7 = 1.0 - classIC.method6141(var2, this.field6661 * -665718745, this.field6663, (byte)64);
            return (int)((-184585491 * this.field6658 - this.field6662 * 1439462015) * var7) + 1439462015 * this.field6662;
         } else {
            double var4 = classIC.method6141(var2, -665718745 * this.field6661, this.field6663, (byte)64);
            return this.field6658 * -184585491 + (int)(var4 * (this.field6662 * 1439462015 - -184585491 * this.field6658));
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wc.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method12298(int var1) {
      try {
         if (this.field6660 != null) {
            if (var1 >= 1654625937) {
               throw new IllegalStateException();
            } else {
               return this.field6660.method544();
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wc.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   public int method12299() {
      return this.field6660 != null ? this.field6660.method544() : 0;
   }

   @ObfuscatedSignature(descriptor = "(IIIS)I")
   @ObfuscatedName("as")
   int method12307(int var1, int var2, int var3, short var4) {
      try {
         if (var2 >= var3) {
            if (var4 != 402) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            return (int)(var1 * ((float)var2 / var3));
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wc.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public int method12300() {
      return this.field6660 != null ? this.field6660.method544() : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwc;)V")
   @ObfuscatedName("rh")
   public static void method12295(classWC var0) {
      if (null != var0.field6660) {
         int var1 = var0.field6660.method544();
         long var2 = classDD.method2983(16711680);
         long var4 = var2 - var0.field6659 * -7454620674419427857L;
         int var6 = var0.method12309(var1, var4);
         if (var6 != var1) {
            var0.field6660.method547(var6);
         }

         if (!var0.field6660.method12058()) {
            var0.field6660 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILzl;)V")
   @ObfuscatedName("aa")
   public void method12291(int var1, int var2, int var3, classZL var4) {
      if (this.field6660 != null && var1 != this.field6662 * 879785231) {
         this.field6658 = this.field6660.method544() * 1324877209;
         this.field6659 = classDD.method2983(16711680) * -4042382095557502705L;
         this.field6662 = 660426111 * var1;
         this.field6661 = this.method12307(var3, this.field6658 * -184585491 - this.field6662 * 1439462015, var2, (short)402) * -1217983909;
         this.field6663 = var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)I")
   @ObfuscatedName("an")
   int method12310(int var1, long var2) {
      if (var1 == 1439462015 * this.field6662) {
         return var1;
      } else if (var1 > 1439462015 * this.field6662) {
         double var6 = 1.0 - classIC.method6141(var2, this.field6661 * -665718745, this.field6663, (byte)64);
         return (int)((-184585491 * this.field6658 - this.field6662 * 1439462015) * var6) + 1439462015 * this.field6662;
      } else {
         double var4 = classIC.method6141(var2, -665718745 * this.field6661, this.field6663, (byte)64);
         return this.field6658 * -184585491 + (int)(var4 * (this.field6662 * 1439462015 - -184585491 * this.field6658));
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method12296() {
      if (null != this.field6660) {
         int var1 = this.field6660.method544();
         long var2 = classDD.method2983(16711680);
         long var4 = var2 - this.field6659 * -7454620674419427857L;
         int var6 = this.method12309(var1, var4);
         if (var6 != var1) {
            this.field6660.method547(var6);
         }

         if (!this.field6660.method12058()) {
            this.field6660 = null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwc;IIILzl;)V")
   @ObfuscatedName("bw")
   public static void method12292(classWC var0, int var1, int var2, int var3, classZL var4) {
      if (var0.field6660 != null && var1 != var0.field6662 * 1558962623) {
         var0.field6658 = var0.field6660.method544() * 3586789;
         var0.field6659 = classDD.method2983(16711680) * -4042382095557502705L;
         var0.field6662 = 660426111 * var1;
         var0.field6661 = var0.method12307(var3, var0.field6658 * -1784233630 - var0.field6662 * 1439462015, var2, (short)402) * -1623687273;
         var0.field6663 = var4;
      }
   }

   public classWC(classAJ var1, int var2, int var3) {
      this.field6660 = classAM.method467(var1, 100, var2);
      if (this.field6660 != null) {
         this.field6660.method539(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method12301() {
      return this.field6660 != null ? this.field6660.method544() : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwc;IIILzl;)V")
   @ObfuscatedName("vi")
   public static void method12293(classWC var0, int var1, int var2, int var3, classZL var4) {
      if (var0.field6660 != null && var1 != var0.field6662 * 1439462015) {
         var0.field6658 = var0.field6660.method544() * 3586789;
         var0.field6659 = classDD.method2983(16711680) * -4042382095557502705L;
         var0.field6662 = -1308502860 * var1;
         var0.field6661 = var0.method12307(var3, var0.field6658 * -1133894741 - var0.field6662 * 1439462015, var2, (short)402) * -1623687273;
         var0.field6663 = var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("av")
   int method12308(int var1, int var2, int var3) {
      return var2 >= var3 ? var1 : (int)(var1 * ((float)var2 / var3));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public int method12302() {
      return this.field6660 != null ? this.field6660.method544() : 0;
   }

   @ObfuscatedSignature(descriptor = "()Lam;")
   @ObfuscatedName("ak")
   public classAM method12303() {
      return this.field6660;
   }

   @ObfuscatedSignature(descriptor = "(IILwd;)V")
   @ObfuscatedName("ac")
   public void method12290(int var1, int var2, classWD var3) {
      int var4 = this.method12298(-1851517218);
      if (var4 < var1) {
         this.method12294(var1, var2, var3.method12327(-1850988872), var3.method12325((byte)106), -1424330541);
      } else if (var4 > var1) {
         this.method12294(var1, var2, var3.method12333((byte)-11), classWD.method12332(var3, 130788134), -572841414);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIILzl;I)V")
   @ObfuscatedName("af")
   public void method12294(int var1, int var2, int var3, classZL var4, int var5) {
      try {
         if (this.field6660 != null) {
            if (var5 == 1507292160) {
               throw new IllegalStateException();
            }

            if (var1 != this.field6662 * 1439462015) {
               this.field6658 = this.field6660.method544() * 3586789;
               this.field6659 = classDD.method2983(16711680) * -4042382095557502705L;
               this.field6662 = 660426111 * var1;
               this.field6661 = this.method12307(var3, this.field6658 * -184585491 - this.field6662 * 1439462015, var2, (short)402) * -1623687273;
               this.field6663 = var4;
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   public void method12297(byte var1) {
      try {
         if (null != this.field6660) {
            if (var1 == 2) {
               throw new IllegalStateException();
            }

            int var2 = this.field6660.method544();
            long var3 = classDD.method2983(16711680);
            long var5 = var3 - this.field6659 * -7454620674419427857L;
            int var7 = this.method12309(var2, var5);
            if (var7 != var2) {
               this.field6660.method547(var7);
            }

            if (!this.field6660.method12058()) {
               if (var1 == 2) {
                  return;
               }

               this.field6660 = null;
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "wc.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwc;I)Lam;")
   @ObfuscatedName("vp")
   public static classAM method12304(classWC var0, int var1) {
      if (var0 == null) {
         return var0.method12305(var1);
      } else {
         try {
            return var0.field6660;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "wc.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)I")
   @ObfuscatedName("am")
   int method12311(int var1, long var2) {
      if (var1 == 1439462015 * this.field6662) {
         return var1;
      } else if (var1 > 1439462015 * this.field6662) {
         double var6 = 1.0 - classIC.method6141(var2, this.field6661 * 1756978927, this.field6663, (byte)64);
         return (int)((-184585491 * this.field6658 - this.field6662 * -323418205) * var6) + 505348527 * this.field6662;
      } else {
         double var4 = classIC.method6141(var2, 1532894004 * this.field6661, this.field6663, (byte)64);
         return this.field6658 * -1877530026 + (int)(var4 * (this.field6662 * -792405213 - 326081682 * this.field6658));
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)I")
   @ObfuscatedName("ah")
   int method12312(int var1, long var2) {
      if (var1 == 1439462015 * this.field6662) {
         return var1;
      } else if (var1 > 1439462015 * this.field6662) {
         double var6 = 1.0 - classIC.method6141(var2, this.field6661 * -665718745, this.field6663, (byte)64);
         return (int)((-184585491 * this.field6658 - this.field6662 * 1439462015) * var6) + 1439462015 * this.field6662;
      } else {
         double var4 = classIC.method6141(var2, -665718745 * this.field6661, this.field6663, (byte)64);
         return this.field6658 * -184585491 + (int)(var4 * (this.field6662 * 1439462015 - -184585491 * this.field6658));
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("fn")
   static boolean method12313(int var0, byte var1) {
      try {
         for (int var2 = 0; var2 < client.field925.size(); var2++) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            int var3 = (Integer)client.field925.get(var2);
            if (var3 == -1) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }
            } else {
               int var4 = classLB.field4090[var3] & 65535;
               if (var4 == var0) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wc.fn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lam;")
   @ObfuscatedName("ag")
   public classAM method12305(int var1) {
      try {
         return this.field6660;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wc.ag(" + ')');
      }
   }
}
