import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ch")
public final class classCH extends ObjectSound {
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field738 = 202;
   @ToRemove(unused = "true")
   @ObfuscatedName("el")
   static final int field739 = 5;
   @ObfuscatedSignature(descriptor = "Ldn;")
   @ObfuscatedName("az")
   final NPC field734;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field735 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field737 = 24;
   @ObfuscatedName("fm")
   static Iterator field741;
   @ObfuscatedName("lz")
   static String JX_REFRESH_TOKEN;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field736 = 6;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   @Override
   int vmethod204() {
      return this.field734.field1489 * -1272026483;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod189(int var1) {
      try {
         if (this.field734 == null) {
            if (var1 < 832295818) {
               ;
            }
         } else if (this.field734.definition == null) {
            if (var1 >= 832295818) {
               throw new IllegalStateException();
            } else {
               this.method3662(-621591188);
            }
         } else if (this.field734.definition.field5325 != null) {
            classPL var2 = this.field734.definition.method8955(652890385);
            if (var2 == null) {
               if (var1 >= 832295818) {
                  throw new IllegalStateException();
               } else {
                  this.field1643 = true;
               }
            } else {
               int var3 = -1727985133 * this.field1653.field6689;
               ObjectSound.method3648(this, var2.field5283, var2.field5335, (byte)-56);
               if (var3 != -1727985133 * this.field1653.field6689) {
                  this.field1643 = true;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ch.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   @Override
   int vmethod194(int var1) {
      try {
         return -1547553299 * this.field734.field1487;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ch.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   int vmethod197(int var1) {
      try {
         return -1547553299 * this.field734.field1487;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ch.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   @Override
   int vmethod202(int var1) {
      try {
         return -1272026483 * this.field734.field1489;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ch.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   int vmethod205(int var1) {
      try {
         return this.field734.field1489 * -1272026483;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ch.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   @Override
   void vmethod190() {
      if (this.field734 != null) {
         if (this.field734.definition == null) {
            this.method3662(560337998);
         } else if (this.field734.definition.field5325 != null) {
            classPL var1 = this.field734.definition.method8955(652890385);
            if (var1 == null) {
               this.field1643 = true;
            } else {
               int var2 = -1727985133 * this.field1653.field6689;
               ObjectSound.method3648(this, var1.field5283, var1.field5335, (byte)-105);
               if (var2 != -1727985133 * this.field1653.field6689) {
                  this.field1643 = true;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   @Override
   void vmethod191() {
      if (this.field734 != null) {
         if (this.field734.definition == null) {
            this.method3662(-934662401);
         } else if (this.field734.definition.field5325 != null) {
            classPL var1 = this.field734.definition.method8955(652890385);
            if (var1 == null) {
               this.field1643 = true;
            } else {
               int var2 = -1727985133 * this.field1653.field6689;
               ObjectSound.method3648(this, var1.field5283, var1.field5335, (byte)-36);
               if (var2 != -1727985133 * this.field1653.field6689) {
                  this.field1643 = true;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   @Override
   int vmethod203() {
      return 1896303741 * this.field734.field1489;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laap;)Z")
   @ObfuscatedName("ei")
   public static boolean method1499(AccountType var0) {
      return var0 == null ? var0.method233() : AccountType.jagexType == var0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   @Override
   int vmethod195() {
      return -1547553299 * this.field734.field1487;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   @Override
   int vmethod196() {
      return -1547553299 * this.field734.field1487;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIIILct;I)V")
   @ObfuscatedName("dz")
   static void method1501(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      Player var13,
      int var14
   ) {
      try {
         classOM var15;
         int var16;
         int var17;
         label64: {
            var15 = classMU.method7729(var6, 1501978861);
            if (var4 != 1) {
               if (var14 <= 1600128213) {
                  throw new IllegalStateException();
               }

               if (3 != var4) {
                  var16 = var15.field4944 * -582306509;
                  var17 = var15.field4924 * 402876423;
                  break label64;
               }

               if (var14 <= 1600128213) {
                  throw new IllegalStateException();
               }
            }

            var16 = 402876423 * var15.field4924;
            var17 = var15.field4944 * -582306509;
         }

         int var18 = var1 + (var16 >> 1);
         int var19 = (1 + var16 >> 1) + var1;
         int var20 = var2 + (var17 >> 1);
         int var21 = (1 + var17 >> 1) + var2;
         int[][] var22 = classCQ.field1220.field1688[var0];
         int var23 = var22[var18][var21] + var22[var19][var20] + var22[var18][var20] + var22[var19][var21] >> 2;
         int var24 = (var1 << 7) + (var16 << 6);
         int var25 = (var17 << 6) + (var2 << 7);
         Model var26 = var15.method8544(var3, var4, var22, var24, var23, var25, -1320580868);
         if (var26 != null) {
            if (var14 <= 1600128213) {
               throw new IllegalStateException();
            }

            classAT.method694(classCQ.field1220, var0, var1, var2, var5, -1, 0, 0, 31, null, 1 + var7, var8 + 1, -497118428);
            var13.field1258 = -2082172655 * (client.field855 * 1612595797 + var7);
            var13.field1263 = (1612595797 * client.field855 + var8) * -1789698443;
            var13.field1284 = var26;
            var13.field1273 = -843265152 * var1 + var16 * -421632576;
            var13.field1279 = -1031821696 * var2 + var17 * -515910848;
            var13.field1280 = 606289519 * var23;
            if (var9 > var11) {
               int var27 = var9;
               var9 = var11;
               var11 = var27;
            }

            if (var10 > var12) {
               if (var14 <= 1600128213) {
                  throw new IllegalStateException();
               }

               int var29 = var10;
               var10 = var12;
               var12 = var29;
            }

            var13.field1278 = (var1 + var9) * 2054951725;
            var13.field1277 = -1464814685 * (var11 + var1);
            var13.field1276 = (var2 + var10) * 214623599;
            var13.field1275 = 1014651473 * (var12 + var2);
         }
      } catch (RuntimeException var28) {
         throw classEG.newRunException(var28, "ch.dz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   @Override
   void vmethod192() {
      if (this.field734 != null) {
         if (this.field734.definition == null) {
            this.method3662(1016567356);
         } else if (this.field734.definition.field5325 != null) {
            classPL var1 = this.field734.definition.method8955(652890385);
            if (var1 == null) {
               this.field1643 = true;
            } else {
               int var2 = -1727985133 * this.field1653.field6689;
               ObjectSound.method3648(this, var1.field5283, var1.field5335, (byte)-93);
               if (var2 != 1766848654 * this.field1653.field6689) {
                  this.field1643 = true;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   int vmethod198() {
      return -1547553299 * this.field734.field1487;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   @Override
   int vmethod199() {
      return -1547553299 * this.field734.field1487;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   int vmethod200() {
      return -781849870 * this.field734.field1487;
   }

   classCH(NPC var1) {
      super(var1.vmethod258((byte)-74), var1.definition.field5283, var1.definition.field5335);
      this.field734 = var1;
      if (var1.definition.field5325 != null) {
         classPL var2 = var1.definition.method8955(652890385);
         if (var2 != null) {
            ObjectSound.method3648(this, var2.field5283, var2.field5335, (byte)-79);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   @Override
   int vmethod206() {
      return this.field734.field1489 * -1272026483;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   @Override
   int vmethod201() {
      return -1547553299 * this.field734.field1487;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   public static int method1500(int var0, int var1) {
      try {
         if (var0 > 0) {
            if (var1 == 883999582) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (var0 < 0) {
            if (var1 == 883999582) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ch.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   @Override
   void vmethod193() {
      if (this.field734 != null) {
         if (this.field734.definition == null) {
            this.method3662(-1847618187);
         } else if (this.field734.definition.field5325 != null) {
            classPL var1 = this.field734.definition.method8955(652890385);
            if (var1 == null) {
               this.field1643 = true;
            } else {
               int var2 = 1730521640 * this.field1653.field6689;
               ObjectSound.method3648(this, var1.field5283, var1.field5335, (byte)-67);
               if (var2 != 1180142742 * this.field1653.field6689) {
                  this.field1643 = true;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("cn")
   static void method1502(Widget var0, int var1) {
      try {
         var0.method7281(1995595493);
         var0.method7283(-1446730120).method6969(new classDQ(var0), 332209502);
         classLH.method6962(var0.method7283(-1696437786), new classCA(var0), (byte)3);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ch.cn(" + ')');
      }
   }
}
