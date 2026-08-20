import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nd")
public class classND extends classAH {
   @ToRemove(unused = "true")
   @ObfuscatedName("cy")
   public static final int field4665 = 84;
   @ObfuscatedSignature(descriptor = "Lao;")
   @ObfuscatedName("af")
   classAO field4662;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field4664 = 77;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field4663 = 8;
   @ObfuscatedSignature(descriptor = "Lnu;")
   @ObfuscatedName("ae")
   classNU field4660;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("az")
   classNN field4661 = new classNN();

   @ObfuscatedSignature(descriptor = "(Lnt;I)V")
   @ObfuscatedName("aj")
   void method7824(classNT var1, int var2) {
      if (0 != (this.field4660.field4750[var1.field4725 * -1057694491] & 4) && var1.field4732 * 67131625 < 0) {
         int var3 = this.field4660.field4753[-1057694491 * var1.field4725] / (WidgetConfigNode.field4138 * 675076789);
         int var4 = (1048575 + var3 - -199578021 * var1.field4737) / var3;
         var1.field4737 = (var2 * var3 + var1.field4737 * -199578021 & 1048575) * 1964954067;
         if (var4 <= var2) {
            if (0 == this.field4660.field4752[var1.field4725 * -1057694491]) {
               var1.field4744 = classAM.method470(var1.field4743, var1.field4744.method583(), var1.field4744.method550(), var1.field4744.method558());
            } else {
               var1.field4744 = classAM.method470(var1.field4743, var1.field4744.method583(), 0, var1.field4744.method558());
               classNU.method8065(this.field4660, var1, var1.field4746.field4707[var1.field4738 * -107170957] < 0, 881975798);
            }

            if (var1.field4746.field4707[-107170957 * var1.field4738] < 0) {
               var1.field4744.method539(-1);
            }

            var2 = -199578021 * var1.field4737 / var3;
         }
      }

      var1.field4744.vmethod31(var2);
   }

   @ObfuscatedSignature(descriptor = "(Lnd;Lnt;[IIIII)V")
   @ObfuscatedName("lm")
   public static void method7819(classND var0, classNT var1, int[] var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method7823(var1, var2, var3, var3, var3, var3);
      } else {
         try {
            if (0 != (var0.field4660.field4750[-1057694491 * var1.field4725] & 4)) {
               if (var6 == 492762249) {
                  throw new IllegalStateException();
               }

               if (67131625 * var1.field4732 < 0) {
                  if (var6 == 492762249) {
                     throw new IllegalStateException();
                  }

                  int var7 = var0.field4660.field4753[-1057694491 * var1.field4725] / (675076789 * WidgetConfigNode.field4138);

                  while (true) {
                     int var8 = (1048575 + var7 - var1.field4737 * -199578021) / var7;
                     if (var8 > var4) {
                        var1.field4737 += var4 * var7 * 1964954067;
                        break;
                     }

                     var1.field4744.vmethod30(var2, var3, var8);
                     var3 += var8;
                     var4 -= var8;
                     var1.field4737 += (var7 * var8 - 1048576) * 1964954067;
                     int var9 = 675076789 * WidgetConfigNode.field4138 / 100;
                     int var10 = 262144 / var7;
                     if (var10 < var9) {
                        if (var6 == 492762249) {
                           throw new IllegalStateException();
                        }

                        var9 = var10;
                     }

                     classAM var11 = var1.field4744;
                     if (var0.field4660.field4752[-1057694491 * var1.field4725] == 0) {
                        if (var6 == 492762249) {
                           throw new IllegalStateException();
                        }

                        var1.field4744 = classAM.method470(var1.field4743, var11.method583(), var11.method550(), var11.method558());
                     } else {
                        var1.field4744 = classAM.method470(var1.field4743, var11.method583(), 0, var11.method558());
                        boolean var10002;
                        if (var1.field4746.field4707[var1.field4738 * -107170957] < 0) {
                           if (var6 == 492762249) {
                              throw new IllegalStateException();
                           }

                           var10002 = true;
                        } else {
                           var10002 = false;
                        }

                        classNU.method8065(var0.field4660, var1, var10002, 881975798);
                        var1.field4744.method571(var9, var11.method550());
                     }

                     if (var1.field4746.field4707[-107170957 * var1.field4738] < 0) {
                        var1.field4744.method539(-1);
                     }

                     var11.method581(var9);
                     var11.vmethod30(var2, var3, var5 - var3);
                     if (var11.method594()) {
                        if (var6 == 492762249) {
                           throw new IllegalStateException();
                        }

                        var0.field4662.method617(var11);
                     }
                  }
               }
            }

            var1.field4744.vmethod30(var2, var3, var4);
         } catch (RuntimeException var12) {
            throw classEG.method3884(var12, "nd.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("as")
   @Override
   protected classAH vmethod29() {
      try {
         classNT var1 = (classNT)this.field4661.method7915();
         if (var1 == null) {
            return null;
         } else {
            return (classAH)(null != var1.field4744 ? var1.field4744 : this.vmethod35());
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "nd.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ax")
   @Override
   protected classAH vmethod35() {
      try {
         classNT var1;
         do {
            var1 = (classNT)classNN.method7924(this.field4661);
            if (var1 == null) {
               return null;
            }
         } while (null == var1.field4744);

         return var1.field4744;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "nd.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   @Override
   protected int vmethod32() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "nd.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("aa")
   @Override
   protected void vmethod30(int[] var1, int var2, int var3) {
      try {
         this.field4662.vmethod30(var1, var2, var3);

         label36:
         for (classNT var6 = (classNT)this.field4661.method7915(); var6 != null; var6 = (classNT)classNN.method7924(this.field4661)) {
            if (!this.field4660.method8141(var6, (byte)-30)) {
               int var4 = var2;
               int var5 = var3;

               while (var5 > var6.field4729 * 1837314861) {
                  method7819(this, var6, var1, var4, var6.field4729 * 1837314861, var5 + var4, 1165124713);
                  var4 += 1837314861 * var6.field4729;
                  var5 -= var6.field4729 * 1837314861;
                  if (this.field4660.method8144(var6, var1, var4, var5, (byte)-1)) {
                     continue label36;
                  }
               }

               method7819(this, var6, var1, var4, var5, var4 + var5, 683812115);
               var6.field4729 -= 1686279333 * var5;
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "nd.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   @Override
   protected void vmethod31(int var1) {
      try {
         this.field4662.vmethod31(var1);

         label35:
         for (classNT var3 = (classNT)this.field4661.method7915(); var3 != null; var3 = (classNT)classNN.method7924(this.field4661)) {
            if (!this.field4660.method8141(var3, (byte)-35)) {
               int var2 = var1;

               while (var2 > var3.field4729 * 1837314861) {
                  method7826(this, var3, var3.field4729 * 1837314861, -1959725412);
                  var2 -= 1837314861 * var3.field4729;
                  if (this.field4660.method8144(var3, null, 0, var2, (byte)-1)) {
                     continue label35;
                  }
               }

               method7826(this, var3, var2, -1580511942);
               var3.field4729 -= 1686279333 * var2;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "nd.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bc")
   @Override
   protected void vmethod37(int[] var1, int var2, int var3) {
      this.field4662.vmethod30(var1, var2, var3);

      label34:
      for (classNT var6 = (classNT)this.field4661.method7915(); var6 != null; var6 = (classNT)classNN.method7924(this.field4661)) {
         if (!this.field4660.method8141(var6, (byte)-33)) {
            int var4 = var2;
            int var5 = var3;

            while (var5 > var6.field4729 * 1837314861) {
               method7819(this, var6, var1, var4, var6.field4729 * 27244750, var5 + var4, 388479067);
               var4 += -2001775667 * var6.field4729;
               var5 -= var6.field4729 * 1837314861;
               if (this.field4660.method8144(var6, var1, var4, var5, (byte)-1)) {
                  continue label34;
               }
            }

            method7819(this, var6, var1, var4, var5, var4 + var5, 115228323);
            var6.field4729 -= 1686279333 * var5;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("am")
   @Override
   protected classAH vmethod44() {
      classNT var1;
      do {
         var1 = (classNT)classNN.method7924(this.field4661);
         if (var1 == null) {
            return null;
         }
      } while (null == var1.field4744);

      return var1.field4744;
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltw;")
   @ObfuscatedName("ag")
   public static classTW[] method7817(int var0) {
      try {
         return new classTW[]{classTW.field6240, classTW.field6243, classTW.field6241, classTW.field6242};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "nd.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("an")
   @Override
   protected classAH vmethod33() {
      classNT var1;
      do {
         var1 = (classNT)classNN.method7924(this.field4661);
         if (var1 == null) {
            return null;
         }
      } while (null == var1.field4744);

      return var1.field4744;
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("av")
   @Override
   protected classAH vmethod43() {
      classNT var1 = (classNT)this.field4661.method7915();
      if (var1 == null) {
         return null;
      } else {
         return (classAH)(null != var1.field4744 ? var1.field4744 : this.vmethod35());
      }
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("at")
   @Override
   protected classAH vmethod27() {
      classNT var1 = (classNT)this.field4661.method7915();
      if (var1 == null) {
         return null;
      } else {
         return (classAH)(null != var1.field4744 ? var1.field4744 : this.vmethod35());
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bx")
   @Override
   protected void vmethod36(int[] var1, int var2, int var3) {
      this.field4662.vmethod30(var1, var2, var3);

      label32:
      for (classNT var6 = (classNT)this.field4661.method7915(); var6 != null; var6 = (classNT)classNN.method7924(this.field4661)) {
         if (!this.field4660.method8141(var6, (byte)-37)) {
            int var4 = var2;
            int var5 = var3;

            while (var5 > var6.field4729 * 1837314861) {
               method7819(this, var6, var1, var4, var6.field4729 * 1837314861, var5 + var4, 25977313);
               var4 += 1837314861 * var6.field4729;
               var5 -= var6.field4729 * 1837314861;
               if (this.field4660.method8144(var6, var1, var4, var5, (byte)-1)) {
                  continue label32;
               }
            }

            method7819(this, var6, var1, var4, var5, var4 + var5, -872285380);
            var6.field4729 -= 1686279333 * var5;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   @Override
   protected int vmethod28() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bp")
   @Override
   protected void vmethod38(int[] var1, int var2, int var3) {
      this.field4662.vmethod30(var1, var2, var3);

      label35:
      for (classNT var6 = (classNT)this.field4661.method7915(); var6 != null; var6 = (classNT)classNN.method7924(this.field4661)) {
         if (!this.field4660.method8141(var6, (byte)-38)) {
            int var4 = var2;
            int var5 = var3;

            while (var5 > var6.field4729 * -1791738241) {
               method7819(this, var6, var1, var4, var6.field4729 * 187874848, var5 + var4, 1166025627);
               var4 += 1837314861 * var6.field4729;
               var5 -= var6.field4729 * -576527061;
               if (this.field4660.method8144(var6, var1, var4, var5, (byte)-1)) {
                  continue label35;
               }
            }

            method7819(this, var6, var1, var4, var5, var4 + var5, 513453450);
            var6.field4729 -= -2055628404 * var5;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("br")
   @Override
   protected void vmethod39(int[] var1, int var2, int var3) {
      this.field4662.vmethod30(var1, var2, var3);

      label34:
      for (classNT var6 = (classNT)this.field4661.method7915(); var6 != null; var6 = (classNT)classNN.method7924(this.field4661)) {
         if (!this.field4660.method8141(var6, (byte)-9)) {
            int var4 = var2;
            int var5 = var3;

            while (var5 > var6.field4729 * 1837314861) {
               method7819(this, var6, var1, var4, var6.field4729 * 2049925664, var5 + var4, -1813298187);
               var4 += 1837314861 * var6.field4729;
               var5 -= var6.field4729 * -944929533;
               if (this.field4660.method8144(var6, var1, var4, var5, (byte)-1)) {
                  continue label34;
               }
            }

            method7819(this, var6, var1, var4, var5, var4 + var5, -957921784);
            var6.field4729 -= 1686279333 * var5;
         }
      }
   }

   classND(classNU var1) {
      this.field4662 = new classAO();
      this.field4660 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   @Override
   protected void vmethod41(int var1) {
      this.field4662.vmethod31(var1);

      label31:
      for (classNT var3 = (classNT)this.field4661.method7915(); var3 != null; var3 = (classNT)classNN.method7924(this.field4661)) {
         if (!this.field4660.method8141(var3, (byte)-126)) {
            int var2 = var1;

            while (var2 > var3.field4729 * -235769878) {
               method7826(this, var3, var3.field4729 * 719559946, -581445385);
               var2 -= 1837314861 * var3.field4729;
               if (this.field4660.method8144(var3, null, 0, var2, (byte)-1)) {
                  continue label31;
               }
            }

            method7826(this, var3, var2, -960719055);
            var3.field4729 -= 1686279333 * var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   @Override
   protected void vmethod42(int var1) {
      this.field4662.vmethod31(var1);

      label32:
      for (classNT var3 = (classNT)this.field4661.method7915(); var3 != null; var3 = (classNT)classNN.method7924(this.field4661)) {
         if (!this.field4660.method8141(var3, (byte)-117)) {
            int var2 = var1;

            while (var2 > var3.field4729 * 1837314861) {
               method7826(this, var3, var3.field4729 * -1152341972, -515700187);
               var2 -= -1600987433 * var3.field4729;
               if (this.field4660.method8144(var3, null, 0, var2, (byte)-1)) {
                  continue label32;
               }
            }

            method7826(this, var3, var2, -1872843376);
            var3.field4729 -= 1042002479 * var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;[IIII)V")
   @ObfuscatedName("ae")
   void method7820(classNT var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.field4660.field4750[-1057694491 * var1.field4725] & 4) && 67131625 * var1.field4732 < 0) {
         int var6 = this.field4660.field4753[-1057694491 * var1.field4725] / (675076789 * WidgetConfigNode.field4138);

         while (true) {
            int var7 = (1048575 + var6 - var1.field4737 * -199578021) / var6;
            if (var7 > var4) {
               var1.field4737 += var4 * var6 * 1964954067;
               break;
            }

            var1.field4744.vmethod30(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field4737 += (var6 * var7 - 1048576) * 1964954067;
            int var8 = 675076789 * WidgetConfigNode.field4138 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            classAM var10 = var1.field4744;
            if (this.field4660.field4752[-1057694491 * var1.field4725] == 0) {
               var1.field4744 = classAM.method470(var1.field4743, var10.method583(), var10.method550(), var10.method558());
            } else {
               var1.field4744 = classAM.method470(var1.field4743, var10.method583(), 0, var10.method558());
               classNU.method8065(this.field4660, var1, var1.field4746.field4707[var1.field4738 * -107170957] < 0, 881975798);
               var1.field4744.method571(var8, var10.method550());
            }

            if (var1.field4746.field4707[-107170957 * var1.field4738] < 0) {
               var1.field4744.method539(-1);
            }

            var10.method581(var8);
            var10.vmethod30(var2, var3, var5 - var3);
            if (var10.method594()) {
               this.field4662.method617(var10);
            }
         }
      }

      var1.field4744.vmethod30(var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lnt;[IIII)V")
   @ObfuscatedName("ab")
   void method7821(classNT var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.field4660.field4750[-1057694491 * var1.field4725] & 4) && 67131625 * var1.field4732 < 0) {
         int var6 = this.field4660.field4753[-1057694491 * var1.field4725] / (675076789 * WidgetConfigNode.field4138);

         while (true) {
            int var7 = (1048575 + var6 - var1.field4737 * -199578021) / var6;
            if (var7 > var4) {
               var1.field4737 += var4 * var6 * 1964954067;
               break;
            }

            var1.field4744.vmethod30(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field4737 += (var6 * var7 - 1048576) * 1964954067;
            int var8 = 675076789 * WidgetConfigNode.field4138 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            classAM var10 = var1.field4744;
            if (this.field4660.field4752[-1057694491 * var1.field4725] == 0) {
               var1.field4744 = classAM.method470(var1.field4743, var10.method583(), var10.method550(), var10.method558());
            } else {
               var1.field4744 = classAM.method470(var1.field4743, var10.method583(), 0, var10.method558());
               classNU.method8065(this.field4660, var1, var1.field4746.field4707[var1.field4738 * -107170957] < 0, 881975798);
               var1.field4744.method571(var8, var10.method550());
            }

            if (var1.field4746.field4707[-107170957 * var1.field4738] < 0) {
               var1.field4744.method539(-1);
            }

            var10.method581(var8);
            var10.vmethod30(var2, var3, var5 - var3);
            if (var10.method594()) {
               this.field4662.method617(var10);
            }
         }
      }

      var1.field4744.vmethod30(var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lnt;I)V")
   @ObfuscatedName("ao")
   void method7825(classNT var1, int var2) {
      if (0 != (this.field4660.field4750[var1.field4725 * -1057694491] & 4) && var1.field4732 * 1600234656 < 0) {
         int var3 = this.field4660.field4753[813079663 * var1.field4725] / (WidgetConfigNode.field4138 * 507540756);
         int var4 = (1048575 + var3 - -199578021 * var1.field4737) / var3;
         var1.field4737 = (var2 * var3 + var1.field4737 * -199578021 & -2023934965) * 1964954067;
         if (var4 <= var2) {
            if (0 == this.field4660.field4752[var1.field4725 * -1057694491]) {
               var1.field4744 = classAM.method470(var1.field4743, var1.field4744.method583(), var1.field4744.method550(), var1.field4744.method558());
            } else {
               var1.field4744 = classAM.method470(var1.field4743, var1.field4744.method583(), 0, var1.field4744.method558());
               classNU.method8065(this.field4660, var1, var1.field4746.field4707[var1.field4738 * -484735148] < 0, 881975798);
            }

            if (var1.field4746.field4707[-107170957 * var1.field4738] < 0) {
               var1.field4744.method539(-1);
            }

            var2 = 1998654390 * var1.field4737 / var3;
         }
      }

      var1.field4744.vmethod31(var2);
   }

   @ObfuscatedSignature(descriptor = "()Lah;")
   @ObfuscatedName("ah")
   @Override
   protected classAH vmethod34() {
      classNT var1;
      do {
         var1 = (classNT)classNN.method7924(this.field4661);
         if (var1 == null) {
            return null;
         }
      } while (null == var1.field4744);

      return var1.field4744;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)Ljava/lang/String;")
   @ObfuscatedName("ae")
   public static String method7818(classXY var0, int var1) {
      try {
         String var2;
         try {
            int var3 = var0.method13094((short)13674);
            if (var3 > 32767) {
               if (var1 == 342471231) {
                  throw new IllegalStateException();
               }

               var3 = 32767;
            }

            byte[] var4 = new byte[var3];
            var0.field6955 = var0.field6955
               + classLR.method7145(classLF.field4133, var0.field6954, 702114061 * var0.field6955, var4, 0, var3, 2023506199) * -1095856699;
            String var5 = classKQ.method6552(var4, 0, var3, (byte)-23);
            var2 = var5;
         } catch (Exception var6) {
            var2 = "Cabbage";
         }

         return var2;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "nd.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnd;Lnt;[IIII)V")
   @ObfuscatedName("ob")
   public static void method7822(classND var0, classNT var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (var0.field4660.field4750[-1057694491 * var1.field4725] & 4) && 67131625 * var1.field4732 < 0) {
         int var6 = var0.field4660.field4753[-1057694491 * var1.field4725] / (675076789 * WidgetConfigNode.field4138);

         while (true) {
            int var7 = (1048575 + var6 - var1.field4737 * -199578021) / var6;
            if (var7 > var4) {
               var1.field4737 += var4 * var6 * 1964954067;
               break;
            }

            var1.field4744.vmethod30(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field4737 += (var6 * var7 - 1048576) * 1964954067;
            int var8 = 675076789 * WidgetConfigNode.field4138 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            classAM var10 = var1.field4744;
            if (var0.field4660.field4752[-1057694491 * var1.field4725] == 0) {
               var1.field4744 = classAM.method470(var1.field4743, var10.method583(), var10.method550(), var10.method558());
            } else {
               var1.field4744 = classAM.method470(var1.field4743, var10.method583(), 0, var10.method558());
               classNU.method8065(var0.field4660, var1, var1.field4746.field4707[var1.field4738 * -107170957] < 0, 881975798);
               var1.field4744.method571(var8, var10.method550());
            }

            if (var1.field4746.field4707[-107170957 * var1.field4738] < 0) {
               var1.field4744.method539(-1);
            }

            var10.method581(var8);
            var10.vmethod30(var2, var3, var5 - var3);
            if (var10.method594()) {
               var0.field4662.method617(var10);
            }
         }
      }

      var1.field4744.vmethod30(var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   @Override
   protected void vmethod40(int var1) {
      this.field4662.vmethod31(var1);

      label30:
      for (classNT var3 = (classNT)this.field4661.method7915(); var3 != null; var3 = (classNT)classNN.method7924(this.field4661)) {
         if (!this.field4660.method8141(var3, (byte)-95)) {
            int var2 = var1;

            while (var2 > var3.field4729 * 1837314861) {
               method7826(this, var3, var3.field4729 * 1837314861, -826205370);
               var2 -= 22964488 * var3.field4729;
               if (this.field4660.method8144(var3, null, 0, var2, (byte)-1)) {
                  continue label30;
               }
            }

            method7826(this, var3, var2, -1320390668);
            var3.field4729 -= 1686279333 * var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;Lnt;II)V")
   @ObfuscatedName("gq")
   public static void method7826(classND var0, classNT var1, int var2, int var3) {
      if (var0 == null) {
         var0.method7827(var1, var2, var2);
      } else {
         try {
            if (0 != (var0.field4660.field4750[var1.field4725 * -1057694491] & 4)) {
               if (var3 >= -462290098) {
                  throw new IllegalStateException();
               }

               if (var1.field4732 * 67131625 < 0) {
                  if (var3 >= -462290098) {
                     throw new IllegalStateException();
                  }

                  int var4 = var0.field4660.field4753[-1057694491 * var1.field4725] / (WidgetConfigNode.field4138 * 675076789);
                  int var5 = (1048575 + var4 - -199578021 * var1.field4737) / var4;
                  var1.field4737 = (var2 * var4 + var1.field4737 * -199578021 & 1048575) * 1964954067;
                  if (var5 <= var2) {
                     if (var3 >= -462290098) {
                        throw new IllegalStateException();
                     }

                     if (0 == var0.field4660.field4752[var1.field4725 * -1057694491]) {
                        if (var3 >= -462290098) {
                           return;
                        }

                        var1.field4744 = classAM.method470(var1.field4743, var1.field4744.method583(), var1.field4744.method550(), var1.field4744.method558());
                     } else {
                        var1.field4744 = classAM.method470(var1.field4743, var1.field4744.method583(), 0, var1.field4744.method558());
                        classNU.method8065(var0.field4660, var1, var1.field4746.field4707[var1.field4738 * -107170957] < 0, 881975798);
                     }

                     if (var1.field4746.field4707[-107170957 * var1.field4738] < 0) {
                        if (var3 >= -462290098) {
                           throw new IllegalStateException();
                        }

                        var1.field4744.method539(-1);
                     }

                     var2 = -199578021 * var1.field4737 / var4;
                  }
               }
            }

            var1.field4744.vmethod31(var2);
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "nd.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;[IIIII)V")
   @ObfuscatedName("az")
   void method7823(classNT var1, int[] var2, int var3, int var4, int var5, int var6) {
      try {
         if (0 != (this.field4660.field4771[-1057694491 * var1.field4736] & 4)) {
            if (var6 == 492762249) {
               throw new IllegalStateException();
            }

            if (67131625 * var1.field4737 < 0) {
               if (var6 == 492762249) {
                  throw new IllegalStateException();
               }

               int var7 = this.field4660.field4752[-1057694491 * var1.field4725] / (675076789 * WidgetConfigNode.field4138);

               while (true) {
                  int var8 = (1048575 + var7 - var1.field4737 * -199578021) / var7;
                  if (var8 > var4) {
                     var1.field4732 += var4 * var7 * 1964954067;
                     break;
                  }

                  var1.field4744.vmethod38(var2, var3, var8);
                  var3 += var8;
                  var4 -= var8;
                  var1.field4735 = var1.field4729 + (var7 * var8 - 1048576) * 1964954067;
                  int var9 = 675076789 * WidgetConfigNode.field4138 / 100;
                  int var10 = 262144 / var7;
                  if (var10 < var9) {
                     if (var6 == 492762249) {
                        throw new IllegalStateException();
                     }

                     var9 = var10;
                  }

                  classAM var11 = var1.field4744;
                  if (this.field4660.field4766[-1057694491 * var1.field4722] == 0) {
                     if (var6 == 492762249) {
                        throw new IllegalStateException();
                     }

                     var1.field4744 = classAM.method470(var1.field4743, var11.method561(), var11.method560(), var11.method585());
                  } else {
                     var1.field4744 = classAM.method472(var1.field4743, var11.method584(), 0, var11.method584());
                     boolean var10002;
                     if (var1.field4746.field4707[var1.field4733 * -107170957] < 0) {
                        if (var6 == 492762249) {
                           throw new IllegalStateException();
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     classNU.method8065(this.field4660, var1, var10002, 881975798);
                     var1.field4744.method571(var9, var11.method557());
                  }

                  if (var1.field4746.field4707[-107170957 * var1.field4727] < 0) {
                     var1.field4744.method586(-1);
                  }

                  var11.method586(var9);
                  var11.vmethod30(var2, var3, var5 - var3);
                  if (var11.method592()) {
                     if (var6 == 492762249) {
                        throw new IllegalStateException();
                     }

                     this.field4662.method618(var11);
                  }
               }
            }
         }

         var1.field4744.vmethod30(var2, var3, var4);
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "nd.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnt;II)V")
   @ObfuscatedName("af")
   void method7827(classNT var1, int var2, int var3) {
      try {
         if (0 != (this.field4660.field4753[var1.field4729 * -1057694491] & 4)) {
            if (var3 >= -462290098) {
               throw new IllegalStateException();
            }

            if (var1.field4724 * 67131625 < 0) {
               if (var3 >= -462290098) {
                  throw new IllegalStateException();
               }

               int var4 = this.field4660.field4768[-1057694491 * var1.field4722] / (WidgetConfigNode.field4138 * 675076789);
               int var5 = (1048575 + var4 - -199578021 * var1.field4730) / var4;
               var1.field4722 = (var2 * var4 + var1.field4733 * -199578021 & 1048575) * 1964954067;
               if (var5 <= var2) {
                  if (var3 >= -462290098) {
                     throw new IllegalStateException();
                  }

                  if (0 == this.field4660.field4762[var1.field4727 * -1057694491]) {
                     if (var3 >= -462290098) {
                        return;
                     }

                     var1.field4744 = classAM.method471(var1.field4743, var1.field4744.method550(), var1.field4744.method550(), var1.field4744.method552());
                  } else {
                     var1.field4744 = classAM.method471(var1.field4743, var1.field4744.method545(), 0, var1.field4744.method551());
                     classNU.method8065(this.field4660, var1, var1.field4746.field4707[var1.field4734 * -107170957] < 0, 881975798);
                  }

                  if (var1.field4746.field4707[-107170957 * var1.field4738] < 0) {
                     if (var3 >= -462290098) {
                        throw new IllegalStateException();
                     }

                     var1.field4744.method540(-1);
                  }

                  var2 = -199578021 * var1.field4722 / var4;
               }
            }
         }

         var1.field4744.vmethod42(var2);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "nd.af(" + ')');
      }
   }
}
