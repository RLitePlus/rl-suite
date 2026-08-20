import net.runelite.api.TileItem;
import net.runelite.api.events.ItemQuantityChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dl")
public final class classDL extends classEE implements TileItem {
   @ObfuscatedName("as")
   int field1554;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1555 = 31;
   @ObfuscatedName("cj")
   public int field1545 = -1;
   @ObfuscatedSignature(descriptor = "Ldl;")
   @ObfuscatedName("wo")
   public static classDL field1557;
   @ObfuscatedName("ag")
   int field1552;
   @ObfuscatedName("ae")
   int field1550;
   @ObfuscatedName("ac")
   int field1549;
   @ObfuscatedName("af")
   int field1551;
   @ObfuscatedName("ax")
   boolean field1560;
   @ObfuscatedName("wy")
   public int field1556;
   @ObfuscatedSignature(descriptor = "Lpi;")
   @ObfuscatedName("aa")
   classPI field1559;
   @ObfuscatedName("ab")
   int field1548;
   @ObfuscatedSignature(descriptor = "Luz;")
   @ObfuscatedName("ao")
   classUZ field1547;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field1553 = 11;
   @ObfuscatedName("bp")
   public int field1546 = -1;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("av")
   static classLW field1558;

   @ObfuscatedSignature(descriptor = "(Lpi;I)V")
   @ObfuscatedName("ac")
   void method3401(classPI var1, int var2) {
      try {
         this.field1559 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dl.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("af")
   boolean method3396(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 1282433543) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 <= 1282433543) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (0 != (this.field1548 * -1737503501 & 1 << var1)) {
                  if (var2 <= 1282433543) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dl.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   protected final classFX vmethod104(int var1) {
      try {
         classOP var2 = classOB.method8299(-1370204663 * this.field1552, (byte)36);
         classFX var10000;
         if (null == this.field1559) {
            if (var1 <= -1767431455) {
               throw new IllegalStateException();
            }

            var10000 = var2.method8657(this.field1554 * 1413659045, 329498713);
         } else {
            var10000 = var2.method8662(this.field1559, -904091968);
         }

         classFX var3 = var10000;
         if (null == var3) {
            if (var1 <= -1767431455) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classFX var4 = null;
            if (!classUZ.method11742(classUZ.field6433, this.field1547, (byte)-121)) {
               classUL var5 = classDD.method2988(this.field1547, 2120827972);
               classUL.method11384(var5, 1392053111);
               var4 = var3.method5081(false);
               classFX.method5222(var4, var5);
               var5.method11357(-1740924855);
            }

            if (var4 == null) {
               if (var1 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var10000 = var3;
            } else {
               var10000 = var4;
            }

            return var10000;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "dl.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   @Override
   protected boolean vmethod95(int var1) {
      try {
         classOP var2 = classOB.method8299(this.field1552 * -1370204663, (byte)-30);
         classFX var3 = null == this.field1559 ? var2.method8657(this.field1554 * 1413659045, -2005049212) : var2.method8662(this.field1559, -500626418);
         if (var3 != null) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            }

            if (null != var3.field2444) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dl.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Lpi;")
   @ObfuscatedName("ax")
   classPI method3399(short var1) {
      try {
         return this.field1559;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dl.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrl10;")
   @ObfuscatedName("ot")
   public rl10 method3413() {
      int var1 = this.field1545;
      int var2 = this.field1546;
      classDZ var3 = classDZ.method3780(this.field1556);
      if (var1 != -1 && var2 != -1 && var3 != null) {
         rl10[][][] var4 = var3.method3776().method4425();
         return var4[var3.getPlane()][var1][var2];
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   public int method3415() {
      return this.field1546;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;)Lul;")
   @ObfuscatedName("aq")
   static classUL method3398(classUZ var0) {
      classUZ var1 = classIZ.method6340(classUZ.field6433, var0, -1853298155);
      var1.method11747(-2143745352);
      float var2 = classLV.method7154(classUZ.field6433, var0, (byte)-55);
      float var3 = (float)Math.acos(var2);
      classUL var4 = classAV.method720((byte)0);
      var4.method11368(var1, var3, (byte)-42);
      classUZ.method11727(var1, 1828111105);
      return var4;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   void method3404(int var1) {
      try {
         this.field1559 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dl.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("az")
   void method3393(int var1, int var2) {
      try {
         this.field1548 = -713675717 * var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   @Override
   protected boolean vmethod96() {
      classOP var1 = classOB.method8299(this.field1552 * -1370204663, (byte)-55);
      classFX var2 = null == this.field1559 ? var1.method8657(this.field1554 * 1413659045, -70068740) : var1.method8662(this.field1559, -517475351);
      return var2 != null && null != var2.field2444;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   @Override
   protected final classFX vmethod93() {
      classOP var1 = classOB.method8299(310600877 * this.field1552, (byte)-54);
      classFX var2 = null == this.field1559 ? var1.method8657(this.field1554 * 1413659045, -1856510028) : var1.method8662(this.field1559, -1812681976);
      if (null == var2) {
         return null;
      } else {
         classFX var3 = null;
         if (!classUZ.method11742(classUZ.field6433, this.field1547, (byte)20)) {
            classUL var4 = classDD.method2988(this.field1547, 2029001904);
            classUL.method11384(var4, -458924421);
            var3 = var2.method5081(false);
            classFX.method5222(var3, var4);
            var4.method11357(-98941053);
         }

         return var3 == null ? var2 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpi;)V")
   @ObfuscatedName("bc")
   void method3402(classPI var1) {
      this.field1559 = var1;
   }

   public int getQuantity() {
      return this.field1554 * 1413659045;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   @Override
   protected boolean vmethod94() {
      classOP var1 = classOB.method8299(this.field1552 * -1370204663, (byte)8);
      classFX var2 = null == this.field1559 ? var1.method8657(this.field1554 * 1413659045, -998107844) : var1.method8662(this.field1559, -1833782936);
      return var2 != null && null != var2.field2444;
   }

   public int getDespawnTime() {
      return this.field1549 * 289254265 - client.field892 * -581422983 + client.field1082;
   }

   @ObfuscatedSignature(descriptor = "(Luz;)V")
   @ObfuscatedName("bp")
   void method3405(classUZ var1) {
      this.field1547 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   void method3394(int var1) {
      this.field1548 = 577109677 * var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void method3395(int var1) {
      this.field1548 = -713675717 * var1;
   }

   public int getId() {
      return this.field1552 * -1370204663;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("cr")
   static final void method3409(byte var0) {
      try {
         client.field956 += -451557715;
         classIS.field3053.field1689.method4345(client.field855 * 1612595797);
         if (client.field871 * -185864825 != -1) {
            if (var0 != 4) {
               throw new IllegalStateException();
            }

            if (classIS.field3053.field1689.method4122() != -185864825 * client.field871) {
               classER var1 = classER.method4047(classSX.field6097, client.field871 * -185864825, 0);
               if (null != var1) {
                  if (var0 != 4) {
                     return;
                  }

                  classIS.field3053.field1689.method4126(-185864825 * client.field871, var1.method4028());
               }
            }
         }

         classCC.method1408(-806820883);
         classLO.method7134(classIS.field3053, (byte)115);
         classDZ var6 = classIS.field3053;
         int var2 = -1927903443 * client.field974.field6797 - 1;
         if (classLJ.field4179 != null) {
            if (var0 != 4) {
               throw new IllegalStateException();
            }

            if (classIS.field3053 == var6 && var2 >= 0) {
               if (var0 != 4) {
                  throw new IllegalStateException();
               }

               if (60 == client.field974.field6800[var2]) {
                  if (var0 != 4) {
                     throw new IllegalStateException();
                  }

                  if (client.field838 * 1272389989 > 0 && client.field988 * 1200011005 == client.field974.field6801[var2]) {
                     if (var0 != 4) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var4 = 128 * client.field974.field6801[var2];
                     classCI.method1508(var6, var4, classLJ.field4179, (byte)71);
                  }
               }
            }
         }

         classCW.method2694(classIS.field3053, 2053550871);
         classDZ var7 = classIS.field3053;
         if (927693091 * client.field971 >= 0) {
            if (var0 != 4) {
               throw new IllegalStateException();
            }

            if (var7.field1694.method13404(client.field971 * 927693091) != null) {
               if (var0 != 4) {
                  return;
               }

               classDV.method3627(var7, 927693091 * client.field971, false, 1572604104);
            }
         }

         classEE.method3838(classIS.field3053, (byte)0);
         classFY.method5274(classIS.field3053, classKR.field4007, (byte)40);
         classFY.method5274(classIS.field3053, classKR.field4006, (byte)119);
         classHO.method6079(classIS.field3053, classOQ.field5079, (byte)0);
         classNG.method7841(classIS.field3053, 1770667891);
         classHO.method6079(classIS.field3053, classOQ.field5081, (byte)0);
         classHO.method6079(classIS.field3053, classOQ.field5080, (byte)0);
         classCC.method1409((byte)0);
         classIH.method6211((short)8342);
         classDZ var3 = classIS.field3053;

         for (classBI var8 = (classBI)var3.field1691.method7915(); var8 != null; var8 = (classBI)classNN.method7924(var3.field1691)) {
            if (var0 != 4) {
               throw new IllegalStateException();
            }

            if (var3.field1710 * -483624883 == var8.field471 * 1040651135) {
               if (var0 != 4) {
                  throw new IllegalStateException();
               }

               if (!var8.method1091(-1583423215)) {
                  if (client.field855 * 1612595797 >= var8.field470 * 1835952965) {
                     if (var0 != 4) {
                        return;
                     }

                     var8.method1105(-322689719 * client.field949, 2001249014);
                     if (var8.method1091(-1145533270)) {
                        if (var0 != 4) {
                           return;
                        }

                        var8.vmethod398();
                     } else {
                        classEZ.method4477(
                           var3.field1689,
                           1040651135 * var8.field471,
                           1586395561 * var8.field467,
                           var8.field468 * -1285652349,
                           var8.field469 * -1107927935,
                           60,
                           var8,
                           0,
                           -1L,
                           false
                        );
                     }
                  }
                  continue;
               }

               if (var0 != 4) {
                  return;
               }
            }

            var8.vmethod398();
         }

         classFY.method5274(classIS.field3053, classKR.field4008, (byte)11);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dl.cr(" + ')');
      }
   }

   public int getOwnership() {
      return this.field1551 * -1876787891;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)V")
   @ObfuscatedName("hv")
   public static void method3408(classWM var0) {
      if (var0 == null) {
         var0.method12547();
      }

      var0.field6705 = null;
   }

   @ObfuscatedSignature(descriptor = "()Lpi;")
   @ObfuscatedName("am")
   classPI method3400() {
      return this.field1559;
   }

   public boolean isPrivate() {
      return this.field1560;
   }

   @ObfuscatedSignature(descriptor = "(Luz;I)V")
   @ObfuscatedName("ao")
   void method3406(classUZ var1, int var2) {
      try {
         this.field1547 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dl.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mp")
   public void method3412(int var1) {
      this.field1545 = var1;
   }

   public int getVisibleTime() {
      return this.field1550 * 1358941319 - client.field892 * -581422983 + client.field1082;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mv")
   public void method3410(int var1) {
      this.field1546 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod97() {
      classOP var1 = classOB.method8299(this.field1552 * -1370204663, (byte)-58);
      classFX var2 = null == this.field1559 ? var1.method8657(this.field1554 * 1413659045, 1135635870) : var1.method8662(this.field1559, -1237182525);
      return var2 != null && null != var2.field2444;
   }

   classDL() {
      this.field1548 = -649110747;
      this.field1547 = classUZ.field6428;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ks")
   public int method3411() {
      return this.field1545;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   @Override
   protected final classFX vmethod92() {
      classOP var1 = classOB.method8299(-1370204663 * this.field1552, (byte)-43);
      classFX var2 = null == this.field1559 ? var1.method8657(this.field1554 * 1413659045, 1169975203) : var1.method8662(this.field1559, -1717004033);
      if (null == var2) {
         return null;
      } else {
         classFX var3 = null;
         if (!classUZ.method11742(classUZ.field6433, this.field1547, (byte)-103)) {
            classUL var4 = classDD.method2988(this.field1547, 2064394615);
            classUL.method11384(var4, -95899695);
            var3 = var2.method5081(false);
            classFX.method5222(var3, var4);
            var4.method11357(1180979049);
         }

         return var3 == null ? var2 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   public static boolean method3407(int var0) {
      try {
         boolean var10000;
         if (!classNP.field4699.isEmpty()) {
            if (var0 != -1496781286) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "dl.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpi;)V")
   @ObfuscatedName("bn")
   void method3403(classPI var1) {
      this.field1559 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldl;I)Z")
   @ObfuscatedName("qz")
   public static boolean method3397(classDL var0, int var1) {
      if (var0 == null) {
         var0.vmethod387();
      }

      return var1 >= 0 && var1 <= 4 ? 0 != (var0.field1548 * -1737503501 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("sr")
   public void method3414(int var1) {
      if (this.field1545 != -1) {
         client.field1026.debug("Item quantity changed: {} ({} -> {})", new Object[]{this.getId(), this.getQuantity(), var1});
         ItemQuantityChanged var2 = new ItemQuantityChanged(this, this.method3413(), this.getQuantity(), var1);
         classOE.field4843.getCallbacks().post(var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("po")
   @Override
   public void vmethod387() {
      if (this.field1545 != -1 && field1557 == null) {
         field1557 = this;
      }
   }
}
