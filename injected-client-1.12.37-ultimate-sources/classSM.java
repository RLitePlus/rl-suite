import net.runelite.api.events.AreaSoundEffectPlayed;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sm")
public class classSM {
   @ObfuscatedName("af")
   int field5976;
   @ObfuscatedSignature(descriptor = "Lso;")
   @ObfuscatedName("ab")
   final classSO field5979;
   @ObfuscatedName("ve")
   public int field5981;
   @ObfuscatedSignature(descriptor = "[Lsb;")
   @ObfuscatedName("ae")
   final classSB[] field5977;
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   static final int field5980 = 1001;
   @ObfuscatedName("az")
   final int field5978 = 50;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ax")
   public boolean method10499(int var1) {
      try {
         return 2086456713 * this.field5976 >= 50;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sm.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsm;IIIIIIIIZ)V")
   @ObfuscatedName("dp")
   public static void method10483(classSM var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var0 == null) {
         var0.method10489(var1, var1, var1, var1, var1, var1, var1, var1, var9);
      } else if (var0.field5976 * 1678676266 < 99016510) {
         if ((var5 <= 0 || var0.field5979.vmethod388(-2066635095) != 0) && (var5 != 0 || var0.field5979.vmethod393(826200091) != 0)) {
            var0.field5977[var0.field5976 * -416038650].field5899 = var1 * 322732777;
            var0.field5977[-7635991 * var0.field5976].field5904 = null;
            var0.field5977[var0.field5976 * -757781128].field5898 = 1732440181 * ((var3 << 16) + (var4 << 8) + var5);
            var0.field5977[2086456713 * var0.field5976].field5903 = 1301054265 * var2;
            var0.field5977[2086456713 * var0.field5976].field5902 = -1569785761 * var7;
            var0.field5977[776328298 * var0.field5976].field5901 = -1601054310 * var8;
            var0.field5977[var0.field5976 * 471411417].field5900 = var6 * -239393433;
            var0.field5977[var0.field5976 * 1354149762].field5905 = var9;
            var0.field5976 += 55425209;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("en")
   public void method10506(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.field5981 = this.field5976 * 2086456713;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("wm")
   public void method10507(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (this.field5981 + 1 == this.field5976 * 2086456713) {
         boolean var10;
         if (var3 == 0 && var4 == 0 && var5 == 0) {
            SoundEffectPlayed var12 = new SoundEffectPlayed(classDH.field1499);
            var12.setSoundId(var2);
            var12.setDelay(var8);
            classOE.field4843.getCallbacks().post(var12);
            var10 = var12.isConsumed();
         } else {
            AreaSoundEffectPlayed var11 = new AreaSoundEffectPlayed(classDH.field1499);
            var11.setSoundId(var2);
            var11.setSceneX(var3);
            var11.setSceneY(var4);
            var11.setRange(var5);
            var11.setDelay(var8);
            classOE.field4843.getCallbacks().post(var11);
            var10 = var11.isConsumed();
         }

         if (var10) {
            this.field5976 = (this.field5976 * 2086456713 - 1) * 55425209;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("az")
   public void method10472(int var1, int var2, int var3, byte var4) {
      try {
         if (this.field5979.vmethod393(826200091) != 0) {
            if (var4 != 0) {
               throw new IllegalStateException();
            }

            if (var2 != 0) {
               if (var4 != 0) {
                  throw new IllegalStateException();
               }

               method10484(this, 0, var1, 0, 0, 0, 0, var2, var3, false, 158705590);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "sm.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ad")
   public void method10477(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field5979.vmethod388(-701870121) != 0 && var7 > 0) {
         method10484(this, var1, var2, var3, var4, var5, var6, var7, var8, false, -128298263);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public void method10495(int var1) {
      try {
         this.field5976 = 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sm.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public int method10496(int var1) {
      try {
         return 2086456713 * this.field5976;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sm.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void method10508(int var1) {
      method10492(this, var1, (byte)-104);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("zv")
   public void method10509(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      method10484(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, -1876940219);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ap")
   public void method10478(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field5979.vmethod388(-1252480360) != 0 && var7 > 0) {
         method10484(this, var1, var2, var3, var4, var5, var6, var7, var8, false, -518799957);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("aj")
   public void method10473(int var1, int var2, int var3) {
      if (this.field5979.vmethod393(826200091) != 0 && var2 != 0) {
         method10484(this, 0, var1, 0, 0, 0, 0, var2, var3, false, -1570602466);
      }
   }

   public classSM(classSO var1) {
      this.field5976 = 0;
      this.field5977 = new classSB[50];
      this.field5979 = var1;

      for (int var2 = 0; var2 < 50; var2++) {
         this.field5977[var2] = new classSB();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bn")
   public boolean method10500() {
      return 2086456713 * this.field5976 >= -1411936261;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("al")
   public void method10474(int var1, int var2, int var3) {
      if (this.field5979.vmethod393(826200091) != 0 && var2 != 0) {
         method10484(this, 0, var1, 0, 0, 0, 0, var2, var3, false, 2029973896);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("aq")
   public void method10479(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field5979.vmethod388(-1238654290) != 0 && var7 > 0) {
         method10484(this, var1, var2, var3, var4, var5, var6, var7, var8, false, -1037756107);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsm;IIIIIIII)V")
   @ObfuscatedName("do")
   public static void method10480(classSM var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var0.field5979.vmethod388(-793885386) != 0 && var7 > 0) {
         method10484(var0, var1, var2, var3, var4, var5, var6, var7, var8, false, -234363442);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ao")
   public void method10475(int var1, int var2, int var3) {
      if (this.field5979.vmethod393(826200091) != 0 && var2 != 0) {
         method10484(this, 0, var1, 0, 0, 0, 0, var2, var3, false, 2090846689);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsm;IIIIIIIIZI)V")
   @ObfuscatedName("jg")
   public static void method10484(classSM var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10) {
      if (var0 == null) {
         var0.method10488(var1, var1, var1, var1, var1, var1, var1, var1, var9, var1);
      }

      var0.method10506(var1, var2, var3, var4, var5, var6, var7, var8, var9);

      try {
         if (var0.field5976 * 2086456713 >= 50) {
            if (var10 == 1830375960) {
               throw new IllegalStateException();
            } else {
               var0.method10507(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            }
         } else {
            label61: {
               if (var5 > 0) {
                  if (var10 == 1830375960) {
                     throw new IllegalStateException();
                  }

                  if (var0.field5979.vmethod388(-1993123292) == 0) {
                     break label61;
                  }

                  if (var10 == 1830375960) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 == 0) {
                  if (var10 == 1830375960) {
                     var0.method10507(var1, var2, var3, var4, var5, var6, var7, var8, var9);
                     return;
                  }

                  if (var0.field5979.vmethod393(826200091) == 0) {
                     if (var10 == 1830375960) {
                        var0.method10507(var1, var2, var3, var4, var5, var6, var7, var8, var9);
                        return;
                     }
                     break label61;
                  }
               }

               var0.field5977[var0.field5976 * 2086456713].field5899 = var1 * 322732777;
               var0.field5977[2086456713 * var0.field5976].field5904 = null;
               var0.field5977[var0.field5976 * 2086456713].field5898 = -643204909 * ((var3 << 16) + (var4 << 8) + var5);
               var0.field5977[2086456713 * var0.field5976].field5903 = -1575487195 * var2;
               var0.field5977[2086456713 * var0.field5976].field5902 = -1206170819 * var7;
               var0.field5977[2086456713 * var0.field5976].field5901 = -509408507 * var8;
               var0.field5977[var0.field5976 * 2086456713].field5900 = var6 * -1796103743;
               var0.field5977[var0.field5976 * 2086456713].field5905 = var9;
               var0.field5976 += 55425209;
               var0.method10507(var1, var2, var3, var4, var5, var6, var7, var8, var9);
               return;
            }

            var0.method10507(var1, var2, var3, var4, var5, var6, var7, var8, var9);
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "sm.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method10497() {
      return 2086456713 * this.field5976;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("ai")
   public void method10485(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (this.field5976 * 2086456713 < 50) {
         if ((var5 <= 0 || this.field5979.vmethod388(-1625214020) != 0) && (var5 != 0 || this.field5979.vmethod393(826200091) != 0)) {
            this.field5977[this.field5976 * 2086456713].field5899 = var1 * 322732777;
            this.field5977[2086456713 * this.field5976].field5904 = null;
            this.field5977[this.field5976 * 2086456713].field5898 = -643204909 * ((var3 << 16) + (var4 << 8) + var5);
            this.field5977[2086456713 * this.field5976].field5903 = -1575487195 * var2;
            this.field5977[2086456713 * this.field5976].field5902 = -1206170819 * var7;
            this.field5977[2086456713 * this.field5976].field5901 = -509408507 * var8;
            this.field5977[this.field5976 * 2086456713].field5900 = var6 * -1796103743;
            this.field5977[this.field5976 * 2086456713].field5905 = var9;
            this.field5976 += 55425209;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("aw")
   public void method10486(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (this.field5976 * 2086456713 < 50) {
         if ((var5 <= 0 || this.field5979.vmethod388(-615876880) != 0) && (var5 != 0 || this.field5979.vmethod393(826200091) != 0)) {
            this.field5977[this.field5976 * -1180203821].field5899 = var1 * -1176004337;
            this.field5977[-1954165076 * this.field5976].field5904 = null;
            this.field5977[this.field5976 * 2086456713].field5898 = -1144242945 * ((var3 << 16) + (var4 << 8) + var5);
            this.field5977[2086456713 * this.field5976].field5903 = -1575487195 * var2;
            this.field5977[2086456713 * this.field5976].field5902 = 2124364414 * var7;
            this.field5977[2086456713 * this.field5976].field5901 = -509408507 * var8;
            this.field5977[this.field5976 * 2086456713].field5900 = var6 * 3029621;
            this.field5977[this.field5976 * 2086456713].field5905 = var9;
            this.field5976 += -1958188563;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public void method10490(int var1) {
      this.field5976 -= -58424959;

      for (int var2 = var1; var2 < this.field5976 * 2086456713; var2++) {
         classSB.method10358(this.field5977[var2], this.field5977[var2 + 1], -1965745720);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsm;IIIIIIIII)V")
   @ObfuscatedName("ut")
   public static void method10481(classSM var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var0 == null) {
         var0.method10482(var1, var1, var1, var1, var1, var1, var1, var1, var1);
      } else {
         try {
            if (var0.field5979.vmethod388(-1543227081) != 0) {
               if (var9 >= 16711680) {
                  throw new IllegalStateException();
               }

               if (var7 > 0) {
                  if (var9 >= 16711680) {
                     throw new IllegalStateException();
                  }

                  method10484(var0, var1, var2, var3, var4, var5, var6, var7, var8, false, 1849062476);
               }
            }
         } catch (RuntimeException var10) {
            throw classEG.method3884(var10, "sm.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("qg")
   public void method10491(int var1) {
      this.field5976 -= 55425209;

      for (int var2 = var1; var2 < this.field5976 * 2086456713; var2++) {
         classSB.method10358(this.field5977[var2], this.field5977[var2 + 1], -1864657622);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int method10498() {
      return 2086456713 * this.field5976;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("aa")
   public void method10476(int var1, int var2, int var3) {
      if (this.field5979.vmethod393(826200091) != 0 && var2 != 0) {
         method10484(this, 0, var1, 0, 0, 0, 0, var2, var3, false, -203503683);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsm;IIIIIIIIZ)V")
   @ObfuscatedName("gu")
   public static void method10487(classSM var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var0.field5976 * 2086456713 < 50) {
         if ((var5 <= 0 || var0.field5979.vmethod388(-861667635) != 0) && (var5 != 0 || var0.field5979.vmethod393(826200091) != 0)) {
            var0.field5977[var0.field5976 * 2086456713].field5899 = var1 * 322732777;
            var0.field5977[2086456713 * var0.field5976].field5904 = null;
            var0.field5977[var0.field5976 * 2086456713].field5898 = -643204909 * ((var3 << 16) + (var4 << 8) + var5);
            var0.field5977[2086456713 * var0.field5976].field5903 = -1575487195 * var2;
            var0.field5977[2086456713 * var0.field5976].field5902 = -1206170819 * var7;
            var0.field5977[2086456713 * var0.field5976].field5901 = -509408507 * var8;
            var0.field5977[var0.field5976 * 2086456713].field5900 = var6 * -1796103743;
            var0.field5977[var0.field5976 * 2086456713].field5905 = var9;
            var0.field5976 += 55425209;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   public boolean method10501() {
      return 2086456713 * this.field5976 >= 355913289;
   }

   @ObfuscatedSignature(descriptor = "(Lsm;IB)V")
   @ObfuscatedName("qm")
   public static void method10492(classSM var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method10494(var1, var2);
      } else {
         try {
            var0.field5976 -= 55425209;

            for (int var3 = var1; var3 < var0.field5976 * 2086456713; var3++) {
               if (var2 >= 8) {
                  return;
               }

               classSB.method10358(var0.field5977[var3], var0.field5977[var3 + 1], -2134176686);
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "sm.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsb;")
   @ObfuscatedName("bc")
   public classSB method10502(int var1) {
      return this.field5977[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Lsb;")
   @ObfuscatedName("bp")
   public classSB method10503(int var1) {
      return this.field5977[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lsm;II)Lsb;")
   @ObfuscatedName("yf")
   public static classSB method10504(classSM var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method10505(var1, var1);
      } else {
         try {
            return var0.field5977[var1];
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "sm.ac(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIII)V")
   @ObfuscatedName("af")
   public void method10482(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (this.field5979.vmethod388(-1543227081) != 0) {
            if (var9 >= 16711680) {
               throw new IllegalStateException();
            }

            if (var7 > 0) {
               if (var9 >= 16711680) {
                  throw new IllegalStateException();
               }

               method10484(this, var1, var2, var3, var4, var5, var6, var7, var8, false, 1849062476);
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "sm.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsm;I)V")
   @ObfuscatedName("mv")
   public static void method10493(classSM var0, int var1) {
      if (var0 == null) {
         var0.method10496(var1);
      }

      var0.field5976 -= 55425209;

      for (int var2 = var1; var2 < var0.field5976 * 2086456713; var2++) {
         classSB.method10358(var0.field5977[var2], var0.field5977[var2 + 1], -1960851939);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZI)V")
   @ObfuscatedName("ae")
   public void method10488(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10) {
      this.method10509(var1, var2, var3, var4, var5, var6, var7, var8, var9);

      try {
         if (this.field5976 * 2086456713 >= 50) {
            if (var10 == 1830375960) {
               throw new IllegalStateException();
            } else {
               this.method10486(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            }
         } else {
            label56: {
               if (var5 > 0) {
                  if (var10 == 1830375960) {
                     throw new IllegalStateException();
                  }

                  if (this.field5979.vmethod388(-1993123292) == 0) {
                     break label56;
                  }

                  if (var10 == 1830375960) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 == 0) {
                  if (var10 == 1830375960) {
                     this.method10509(var1, var2, var3, var4, var5, var6, var7, var8, var9);
                     return;
                  }

                  if (this.field5979.vmethod393(826200091) == 0) {
                     if (var10 == 1830375960) {
                        this.method10486(var1, var2, var3, var4, var5, var6, var7, var8, var9);
                        return;
                     }
                     break label56;
                  }
               }

               this.field5977[this.field5976 * 2086456713].field5902 = var1 * 322732777;
               this.field5977[2086456713 * this.field5976].field5904 = null;
               this.field5977[this.field5976 * 2086456713].field5902 = -643204909 * ((var3 << 16) + (var4 << 8) + var5);
               this.field5977[2086456713 * this.field5976].field5902 = -1575487195 * var2;
               this.field5977[2086456713 * this.field5976].field5902 = -1206170819 * var7;
               this.field5977[2086456713 * this.field5976].field5903 = -509408507 * var8;
               this.field5977[this.field5976 * 2086456713].field5903 = var6 * -1796103743;
               this.field5977[this.field5976 * 2086456713].field5905 = var9;
               this.field5976 += 55425209;
               this.method10506(var1, var2, var3, var4, var5, var6, var7, var8, var9);
               return;
            }

            this.method10509(var1, var2, var3, var4, var5, var6, var7, var8, var9);
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "sm.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lsb;")
   @ObfuscatedName("ac")
   public classSB method10505(int var1, int var2) {
      try {
         return this.field5977[var1];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sm.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("ar")
   public void method10489(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (this.field5976 * 2086456713 < 50) {
         if ((var5 <= 0 || this.field5979.vmethod388(-1625214020) != 0) && (var5 != 0 || this.field5979.vmethod393(826200091) != 0)) {
            this.field5977[this.field5976 * 2086456713].field5901 = var1 * 322732777;
            this.field5977[2086456713 * this.field5976].field5904 = null;
            this.field5977[this.field5976 * 2086456713].field5899 = -643204909 * ((var3 << 16) + (var4 << 8) + var5);
            this.field5977[2086456713 * this.field5976].field5900 = -1575487195 * var2;
            this.field5977[2086456713 * this.field5976].field5902 = -1206170819 * var7;
            this.field5977[2086456713 * this.field5976].field5900 = -509408507 * var8;
            this.field5977[this.field5976 * 2086456713].field5900 = var6 * -1796103743;
            this.field5977[this.field5976 * 2086456713].field5905 = var9;
            this.field5976 += 55425209;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ab")
   public void method10494(int var1, byte var2) {
      try {
         this.field5976 -= 55425209;

         for (int var3 = var1; var3 < this.field5976 * 2086456713; var3++) {
            if (var2 >= 8) {
               return;
            }

            classSB.method10358(this.field5977[var3], this.field5977[var3 + 1], -2134176686);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "sm.ab(" + ')');
      }
   }
}
