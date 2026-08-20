import net.runelite.api.Actor;
import net.runelite.api.Animation;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bs")
public final class classBS extends classEE implements Projectile {
   @ObfuscatedName("gy")
   static int field570;
   @ObfuscatedName("af")
   int field547;
   @ObfuscatedName("ae")
   int field559;
   @ToRemove(unused = "true")
   @ObfuscatedName("cm")
   public static final int field569 = 99;
   @ObfuscatedName("aj")
   int field558;
   @ObfuscatedName("as")
   int field551;
   @ToRemove(unused = "true")
   @ObfuscatedName("qz")
   static final int field571 = 32;
   @ObfuscatedName("ax")
   int field552;
   @ObfuscatedName("aa")
   int field557;
   @ObfuscatedName("ao")
   int field561;
   @ObfuscatedName("al")
   int field544;
   @ObfuscatedName("ap")
   double field564;
   @ObfuscatedName("ay")
   int field555;
   @ObfuscatedName("ag")
   int field550;
   @ObfuscatedName("ad")
   double field562;
   @ObfuscatedName("aq")
   int field554;
   @ObfuscatedName("au")
   double field560;
   @ObfuscatedName("ab")
   int field549;
   @ObfuscatedName("ar")
   int field566;
   @ObfuscatedName("aw")
   boolean field545 = false;
   @ObfuscatedName("ak")
   double field563;
   @ObfuscatedName("av")
   int field556;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("at")
   final classQR field553 = new classQR();
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field568 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   public static final int field567 = 57;
   @ObfuscatedName("ai")
   int field565;
   @ObfuscatedName("az")
   int field546;
   @ObfuscatedName("ac")
   int field548;

   public int getHeight() {
      return this.field549 * -1976479015;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bc")
   void method1210(int var1, int var2) {
      this.field547 += -1758672327 * var1;
      this.field559 += var2 * 1468183829;
      this.field552 += -1147372671 * var1;
      this.field548 += var2 * -2135583901;
      this.field562 = this.field562 + classKY.method6605(var1, -509334942);
      this.field564 = this.field564 + classKY.method6605(var2, 1650293400);
   }

   public LocalPoint getTarget() {
      return LocalPoint.fromWorld(classIS.field3053, this.field552 * 253215873, this.field548 * -1774680501);
   }

   public WorldPoint getTargetPoint() {
      return new WorldPoint(this.field552 * 253215873, this.field548 * -1774680501, this.field551 * -476329201);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fe")
   static final int method1223(int var0) {
      try {
         float var1 = 200.0F * ((float)classAB.field122.method2757(-1674478907) - 0.5F);
         return 100 - Math.round(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bs.fe(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   protected final classFX vmethod104(int var1) {
      try {
         if (classQR.method9763(this.field553, 30, -1564010216)) {
            if (var1 <= -1767431455) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classOR var2 = classAI.method376(this.field556 * -2127538519, -1276171479);
            classFX var3 = var2.method8724(this.field553.method9738(1823720123), 1621840478);
            if (null == var3) {
               return null;
            } else {
               var3.method5144(-947616749 * this.field566);
               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bs.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   static int method1204(int var0) {
      return var0 - 1;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   @Override
   protected final classFX vmethod92() {
      if (classQR.method9763(this.field553, 30, -236546980)) {
         return null;
      } else {
         classOR var1 = classAI.method376(this.field556 * -2127538519, -1757031176);
         classFX var2 = var1.method8724(this.field553.method9738(2053825511), 1329699974);
         if (null == var2) {
            return null;
         } else {
            var2.method5144(-947616749 * this.field566);
            return var2;
         }
      }
   }

   public void setEndCycle(int var1) {
      this.field558 = var1 * 1968259183;
   }

   public int getEndHeight() {
      return this.field557 * -1558582945;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   protected int vmethod98(int var1) {
      try {
         int var10000;
         if (this.field553.method9726(374233424)) {
            if (var1 <= -1498749565) {
               throw new IllegalStateException();
            }

            var10000 = this.field553.method9731((byte)85).field5138 * -687960895;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bs.ag(" + 41);
      }
   }

   public double getY() {
      return this.field564;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;Lcl;IIB)V")
   @ObfuscatedName("hb")
   public static void method1224(classBS var0, classCL var1, int var2, int var3, byte var4) {
      if (var0 == null) {
         var0.method1225(var1, var2, var2, var4);
      } else {
         if (var2 >= var0.field544 * -988090901) {
            ProjectileMoved var23 = new ProjectileMoved();
            var23.setProjectile(var0);
            var23.setPosition(var0.getTarget());
            var23.setZ(var0.field557 * -1558582945);
            classOE.field4843.getCallbacks().post(var23);
         }

         try {
            if (var2 < var0.field544 * -988090901) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               }
            } else {
               classUZ var5 = classNG.method7837(
                  var0.field561 * -711329097, var0.field552 * 253215873, -1774680501 * var0.field548, -476329201 * var0.field551, var1, -1853322114
               );
               int var6 = (int)var5.field6427;
               int var7 = (int)var5.field6426;
               int var8 = (int)var5.field6425 - -1558582945 * var0.field557;
               classUZ.method11727(var5, 2082085210);
               if (!var0.field545) {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }

                  classUZ var9 = classNG.method7837(
                     -431034519 * var0.field550, -295435255 * var0.field547, 1899622973 * var0.field559, var0.field546 * 728954045, var1, -921903166
                  );
                  int var10 = (int)var9.field6427;
                  int var11 = (int)var9.field6426;
                  int var12 = (int)var9.field6425 - var0.field549 * -1976479015;
                  classUZ.method11727(var9, 2136541289);
                  double var13 = var6 - var10;
                  double var15 = var7 - var11;
                  double var17 = Math.sqrt(var13 * var13 + var15 * var15);
                  double var10001;
                  if (Math.abs(var17) < 0.01F) {
                     if (var4 != 1) {
                        throw new IllegalStateException();
                     }

                     var10001 = var10;
                  } else {
                     var10001 = var10 + var13 * (980231641 * var0.field554) / var17;
                  }

                  var0.field562 = var10001;
                  if (Math.abs(var17) < 0.01F) {
                     if (var4 != 1) {
                        throw new IllegalStateException();
                     }

                     var10001 = var11;
                  } else {
                     var10001 = var0.field554 * 980231641 * var15 / var17 + var11;
                  }

                  var0.field564 = var10001;
                  var0.field560 = var12;
               }

               double var25 = var0.field558 * 384835215 + 1 - var2;
               double var26 = (var6 - var0.field562) / var25;
               double var27 = (var7 - var0.field564) / var25;
               double var28 = Math.sqrt(var26 * var26 + var27 * var27);
               if (!var0.field545) {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }

                  var0.field563 = -var28 * Math.tan(0.02454369 * (2109317713 * var0.field555));
               }

               double var29 = 2.0 * (var8 - var0.field560 - var25 * var0.field563) / (var25 * var25);
               var0.field545 = true;
               var0.field562 += var3 * var26;
               var0.field564 += var27 * var3;
               var0.field560 = var0.field560 + (var3 * var0.field563 + var3 * (var29 * 0.5) * var3);
               var0.field563 += var3 * var29;
               var0.field565 = ((int)(Math.atan2(var26, var27) * 325.949) + 1024 & 2047) * 2120328949;
               var0.field566 = ((int)(Math.atan2(var0.field563, var28) * 325.949) & 2047) * -640686565;
               classAT.field277.method286(classIS.field3053, (int)var0.field562, (int)var0.field564, false, 1868243250);
               classRD.method9941(var0.field553, var3, classAT.field277, -1847056053);
               classAAX.method290(classAT.field277, -845090641);
            }
         } catch (RuntimeException var24) {
            throw classEG.method3884(var24, "bs.ac(" + ')');
         }
      }
   }

   public Actor getSourceActor() {
      int var1 = this.field550 * -431034519;
      classDZ var2 = classIS.field3053;
      if (var1 > 0) {
         int var4 = var1 - 1;
         return (Actor)var2.field1698.method13405(var4);
      } else if (var1 < 0) {
         int var3 = -var1 - 1;
         return (Actor)var2.field1694.method13405(var3);
      } else {
         return null;
      }
   }

   public Animation getAnimation() {
      return this.field553.field5599;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   @Override
   protected boolean vmethod96() {
      if (this.field553.method9726(374233424) && this.field553.method9731((byte)115).method8749(this.field553.method9738(2094498840), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(-2127538519 * this.field556, -1611413342);
         classFX var2 = var1.method8726(1555762411);
         return var2 != null && null != var2.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   @Override
   protected boolean vmethod94() {
      if (this.field553.method9726(374233424) && this.field553.method9731((byte)37).method8749(this.field553.method9738(1858921218), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(-544039895 * this.field556, -1394048523);
         classFX var2 = var1.method8726(400892565);
         return var2 != null && null != var2.field2444;
      }
   }

   public double getZ() {
      return this.field560;
   }

   public int getFloor() {
      return this.getSourceLevel();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod97() {
      if (this.field553.method9726(374233424) && this.field553.method9731((byte)115).method8749(this.field553.method9738(1735652441), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(1294212229 * this.field556, -2051638579);
         classFX var2 = var1.method8726(1864499634);
         return var2 != null && null != var2.field2444;
      }
   }

   public int getAnimationFrame() {
      return this.field553.field5602 * 292569817;
   }

   public int getTargetLevel() {
      return this.field551 * -476329201;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   static int method1205(int var0) {
      return var0 - 1;
   }

   public int getSlope() {
      return this.field555 * 2109317713;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   @Override
   protected int vmethod100() {
      return this.field553.method9726(374233424) ? this.field553.method9731((byte)18).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   @Override
   protected boolean vmethod95(int var1) {
      try {
         if (this.field553.method9726(374233424)) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            }

            if (this.field553.method9731((byte)82).method8749(this.field553.method9738(2063741440), 1284412146)) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         classOR var2 = classAI.method376(-2127538519 * this.field556, -2108158718);
         classFX var3 = var2.method8726(-306048504);
         return var3 != null && null != var3.field2444;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;II)V")
   @ObfuscatedName("bm")
   void method1215(classCL var1, int var2, int var3) {
      if (var2 >= this.field544 * -988090901) {
         classUZ var4 = classNG.method7837(
            this.field561 * -2143695651, this.field552 * 1573881485, -1774680501 * this.field548, 1275886853 * this.field551, var1, -1149150687
         );
         int var5 = (int)var4.field6427;
         int var6 = (int)var4.field6426;
         int var7 = (int)var4.field6425 - 848487824 * this.field557;
         classUZ.method11727(var4, 1834510005);
         if (!this.field545) {
            classUZ var8 = classNG.method7837(
               843396195 * this.field550, 1323236034 * this.field547, 1899622973 * this.field559, this.field546 * 789642591, var1, -1353905931
            );
            int var9 = (int)var8.field6427;
            int var10 = (int)var8.field6426;
            int var11 = (int)var8.field6425 - this.field549 * -1976479015;
            classUZ.method11727(var8, 2013847212);
            double var12 = var5 - var9;
            double var14 = var6 - var10;
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            this.field562 = Math.abs(var16) < 0.01F ? var9 : var9 + var12 * (980231641 * this.field554) / var16;
            this.field564 = Math.abs(var16) < 0.01F ? var10 : this.field554 * 2012582295 * var14 / var16 + var10;
            this.field560 = var11;
         }

         double var18 = this.field558 * 384835215 + 1 - var2;
         double var19 = (var5 - this.field562) / var18;
         double var20 = (var6 - this.field564) / var18;
         double var21 = Math.sqrt(var19 * var19 + var20 * var20);
         if (!this.field545) {
            this.field563 = -var21 * Math.tan(0.02454369 * (2109317713 * this.field555));
         }

         double var22 = 2.0 * (var7 - this.field560 - var18 * this.field563) / (var18 * var18);
         this.field545 = true;
         this.field562 += var3 * var19;
         this.field564 += var20 * var3;
         this.field560 = this.field560 + (var3 * this.field563 + var3 * (var22 * 0.5) * var3);
         this.field563 += var3 * var22;
         this.field565 = ((int)(Math.atan2(var19, var20) * 325.949) + 642228427 & 1540065440) * 2120328949;
         this.field566 = ((int)(Math.atan2(this.field563, var21) * 325.949) & -1176386747) * -640686565;
         classAT.field277.method286(classIS.field3053, (int)this.field562, (int)this.field564, false, 1579253242);
         classRD.method9941(this.field553, var3, classAT.field277, -235825684);
         classAAX.method290(classAT.field277, -2073208404);
      }
   }

   public int getStartCycle() {
      return this.field544 * -988090901;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;III)V")
   @ObfuscatedName("cc")
   public static void method1211(classBS var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method1214(var1, var1, var1);
      }

      try {
         var0.field547 += -1758672327 * var1;
         var0.field559 += var2 * 1468183829;
         var0.field552 += -1147372671 * var1;
         var0.field548 += var2 * -2135583901;
         var0.field562 = var0.field562 + classKY.method6605(var1, -535895662);
         var0.field564 = var0.field564 + classKY.method6605(var2, -55391551);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bs.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("xu")
   public void method1226(int var1, int var2) {
      method1211(this, var1, var2, -1049759616);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   protected int vmethod103() {
      return this.field553.method9726(374233424) ? this.field553.method9731((byte)29).field5138 * -687960895 : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ao")
   static boolean method1202(int var0) {
      return var0 != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("al")
   static boolean method1203(int var0) {
      return var0 != 0;
   }

   public int getRemainingCycles() {
      int var1 = classOE.field4843.getGameCycle();
      return this.getEndCycle() - var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   static int method1206(int var0) {
      return var0 - 1;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;II)V")
   @ObfuscatedName("bp")
   void method1216(classCL var1, int var2, int var3) {
      if (var2 >= this.field544 * -988090901) {
         classUZ var4 = classNG.method7837(
            this.field561 * -434424920, this.field552 * 846124369, 188397345 * this.field548, -476329201 * this.field551, var1, -1612222692
         );
         int var5 = (int)var4.field6427;
         int var6 = (int)var4.field6426;
         int var7 = (int)var4.field6425 - -1421604176 * this.field557;
         classUZ.method11727(var4, 1792281252);
         if (!this.field545) {
            classUZ var8 = classNG.method7837(
               1899055320 * this.field550, -295435255 * this.field547, -545315742 * this.field559, this.field546 * 1795886189, var1, -399459984
            );
            int var9 = (int)var8.field6427;
            int var10 = (int)var8.field6426;
            int var11 = (int)var8.field6425 - this.field549 * -1976479015;
            classUZ.method11727(var8, 1904882167);
            double var12 = var5 - var9;
            double var14 = var6 - var10;
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            this.field562 = Math.abs(var16) < 0.01F ? var9 : var9 + var12 * (980231641 * this.field554) / var16;
            this.field564 = Math.abs(var16) < 0.01F ? var10 : this.field554 * -1178169900 * var14 / var16 + var10;
            this.field560 = var11;
         }

         double var18 = this.field558 * 384835215 + 1 - var2;
         double var19 = (var5 - this.field562) / var18;
         double var20 = (var6 - this.field564) / var18;
         double var21 = Math.sqrt(var19 * var19 + var20 * var20);
         if (!this.field545) {
            this.field563 = -var21 * Math.tan(0.02454369 * (2109317713 * this.field555));
         }

         double var22 = 2.0 * (var7 - this.field560 - var18 * this.field563) / (var18 * var18);
         this.field545 = true;
         this.field562 += var3 * var19;
         this.field564 += var20 * var3;
         this.field560 = this.field560 + (var3 * this.field563 + var3 * (var22 * 0.5) * var3);
         this.field563 += var3 * var22;
         this.field565 = ((int)(Math.atan2(var19, var20) * 325.949) + 1024 & 117321838) * 2120328949;
         this.field566 = ((int)(Math.atan2(this.field563, var21) * 325.949) & 1160360149) * 668790418;
         classAT.field277.method286(classIS.field3053, (int)this.field562, (int)this.field564, false, -1352873552);
         classRD.method9941(this.field553, var3, classAT.field277, -1735870657);
         classAAX.method290(classAT.field277, -1170825749);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod99() {
      return this.field553.method9726(374233424) ? this.field553.method9731((byte)36).field5138 * -687960895 : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   static int method1208(int var0) {
      return -var0 - 1;
   }

   public int getId() {
      return this.field556 * -2127538519;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   static int method1209(int var0) {
      return -var0 - 1;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   @Override
   protected final classFX vmethod93() {
      if (classQR.method9763(this.field553, 30, -226365416)) {
         return null;
      } else {
         classOR var1 = classAI.method376(this.field556 * 1275730851, -1391534362);
         classFX var2 = var1.method8724(this.field553.method9738(2042238521), 1722059945);
         if (null == var2) {
            return null;
         } else {
            var2.method5144(-947616749 * this.field566);
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bx")
   void method1212(int var1, int var2) {
      this.field547 += -1758672327 * var1;
      this.field559 += var2 * 1468183829;
      this.field552 += -1147372671 * var1;
      this.field548 += var2 * 42024057;
      this.field562 = this.field562 + classKY.method6605(var1, 1371935778);
      this.field564 = this.field564 + classKY.method6605(var2, 2033650775);
   }

   public double getX() {
      return this.field562;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   @Override
   protected int vmethod101() {
      return this.field553.method9726(374233424) ? this.field553.method9731((byte)85).field5138 * -421269324 : 0;
   }

   public int getStartPos() {
      return this.field554 * 980231641;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   protected int vmethod102() {
      return this.field553.method9726(374233424) ? this.field553.method9731((byte)73).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;II)V")
   @ObfuscatedName("br")
   void method1217(classCL var1, int var2, int var3) {
      if (var2 >= this.field544 * -988090901) {
         classUZ var4 = classNG.method7837(
            this.field561 * 2026180945, this.field552 * 253215873, -1774680501 * this.field548, -476329201 * this.field551, var1, -850146277
         );
         int var5 = (int)var4.field6427;
         int var6 = (int)var4.field6426;
         int var7 = (int)var4.field6425 - -1558582945 * this.field557;
         classUZ.method11727(var4, 1766979584);
         if (!this.field545) {
            classUZ var8 = classNG.method7837(
               -2010404175 * this.field550, 1873381453 * this.field547, 1899622973 * this.field559, this.field546 * 728954045, var1, -737431092
            );
            int var9 = (int)var8.field6427;
            int var10 = (int)var8.field6426;
            int var11 = (int)var8.field6425 - this.field549 * -1976479015;
            classUZ.method11727(var8, 2022063781);
            double var12 = var5 - var9;
            double var14 = var6 - var10;
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            this.field562 = Math.abs(var16) < 0.01F ? var9 : var9 + var12 * (-1606861187 * this.field554) / var16;
            this.field564 = Math.abs(var16) < 0.01F ? var10 : this.field554 * -595269690 * var14 / var16 + var10;
            this.field560 = var11;
         }

         double var18 = this.field558 * 286174958 + 1 - var2;
         double var19 = (var5 - this.field562) / var18;
         double var20 = (var6 - this.field564) / var18;
         double var21 = Math.sqrt(var19 * var19 + var20 * var20);
         if (!this.field545) {
            this.field563 = -var21 * Math.tan(0.02454369 * (2109317713 * this.field555));
         }

         double var22 = 2.0 * (var7 - this.field560 - var18 * this.field563) / (var18 * var18);
         this.field545 = true;
         this.field562 += var3 * var19;
         this.field564 += var20 * var3;
         this.field560 = this.field560 + (var3 * this.field563 + var3 * (var22 * 0.5) * var3);
         this.field563 += var3 * var22;
         this.field565 = ((int)(Math.atan2(var19, var20) * 325.949) + -170235679 & -103239752) * 2120328949;
         this.field566 = ((int)(Math.atan2(this.field563, var21) * 325.949) & 1058287986) * 630007551;
         classAT.field277.method286(classIS.field3053, (int)this.field562, (int)this.field564, false, 371644747);
         classRD.method9941(this.field553, var3, classAT.field277, -1153460167);
         classAAX.method290(classAT.field277, -846143920);
      }
   }

   public int getEndCycle() {
      return this.field558 * 384835215;
   }

   classBS(
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
      int var13,
      int var14,
      int var15
   ) {
      this.field546 = -1077303659 * var1;
      this.field547 = -1758672327 * var2;
      this.field559 = var3 * 1468183829;
      this.field549 = -619704983 * var4;
      this.field550 = var5 * 2072809689;
      this.field551 = var6 * 269468655;
      this.field552 = var7 * -1147372671;
      this.field548 = var8 * -2135583901;
      this.field557 = 2145170079 * var9;
      this.field561 = 167117575 * var10;
      this.field556 = var11 * 1991028121;
      this.field544 = -1854483773 * var12;
      this.field558 = 1968259183 * var13;
      this.field555 = 1731389105 * var14;
      this.field554 = -1507259799 * var15;
      classQR.method9722(this.field553, classAI.method376(-2127538519 * this.field556, -1725206219).field5083 * 696329207, -2116386216);
   }

   public WorldPoint getSourcePoint() {
      return new WorldPoint(this.field547 * -295435255, this.field559 * 1899622973, this.field546 * 728954045);
   }

   public int getOrientation() {
      return this.field565 * 1834702173;
   }

   public int getStartHeight() {
      return this.field549 * -1976479015;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIILcl;)Luz;")
   @ObfuscatedName("bt")
   static classUZ method1218(int var0, int var1, int var2, int var3, classCL var4) {
      classUZ var5 = null;
      classDZ var6 = null;
      if (classBZ.method1381(var0, (byte)-74)) {
         boolean var8 = var0 > 0;
         Object var7;
         if (var8) {
            int var9 = classHI.method6057(var0, -1508058413);
            var6 = classHB.method5990(var9, var4, 66607526);
            var7 = (classDH)var6.field1698.method13404(var9);
         } else {
            int var15 = classGA.method5290(var0, -1282125261);
            var6 = classQB.method9434(var15, var4, 1916673709);
            var7 = var6.method3737(var15, (byte)1);
         }

         if (var7 != null) {
            classKY var16 = ((classDH)var7).method3162(var6, (short)7751);
            var5 = classHZ.method6135(16777216);
            var5.field6427 = 1870919123 * var16.field4055;
            var5.field6426 = var16.field4056 * -449868112;
         }
      }

      if (var5 == null) {
         var6 = var4.method1596(var1, var2, -1357603660);
         int var13 = var1 - 1996520823 * var6.field1709;
         int var14 = var2 - -351145363 * var6.field1708;
         classSP var17 = (classSP)classCL.method1592(var4, -1404261670).field1700.method13595(2140889407 * var6.field1699);
         if (var17 != null) {
            var5 = var17.method10620(classKY.method6612(var13, -1865755514), classKY.method6612(var14, 1376016537), (byte)60);
         } else {
            var5 = classIK.method6218(classKY.method6612(var13, -220471336), 0.0F, classKY.method6612(var14, 1511916235), (byte)3);
         }
      }

      int var18 = (int)var5.field6427;
      int var10 = (int)var5.field6426;
      int var11 = classKV.method6571(var6, var18, var10, var3, (byte)122);
      classSP var12 = (classSP)classIS.field3053.field1700.method13595(var6.field1699 * 2140889407);
      if (null != var12) {
         var11 += classKV.method6571(classIS.field3053, var12.vmethod368(311606126), var12.vmethod371(376334859), var12.vmethod258((byte)-91), (byte)122);
      }

      var5.field6425 = var11;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bn")
   void method1213(int var1, int var2) {
      this.field547 += -409179964 * var1;
      this.field559 += var2 * 1468183829;
      this.field552 += -1147372671 * var1;
      this.field548 += var2 * -2135583901;
      this.field562 = this.field562 + classKY.method6605(var1, 2117323185);
      this.field564 = this.field564 + classKY.method6605(var2, 1820808361);
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("cp")
   static int method1222(int var0, classBL var1, boolean var2, int var3) {
      try {
         if (7108 == var0) {
            if (var3 >= -1565688993) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = classBB.field323;
               int var10001 = (classDY.field1679 += 120041229) * -324749371 - 1;
               byte var10002;
               if (classTB.method10736(585092889)) {
                  if (var3 >= -1565688993) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bs.cp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lra;")
   @ObfuscatedName("af")
   static classRA method1207(String var0, int var1) {
      try {
         boolean var2 = true;
         if (var0.endsWith("_z")) {
            if (var1 <= -1581618260) {
               throw new IllegalStateException();
            }

            var2 = false;
            var0 = var0.substring(0, var0.length() - "_z".length());
         }

         if (var0.isEmpty()) {
            if (var1 <= -1581618260) {
               throw new IllegalStateException();
            } else {
               return new classRA(0, var2);
            }
         } else {
            return new classRA(Integer.parseInt(var0), var2);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bs.af(" + ')');
      }
   }

   public int getY1() {
      return LocalPoint.fromWorld(classIS.field3053, this.field547 * -295435255, this.field559 * 1899622973).getY();
   }

   public Actor getTargetActor() {
      int var1 = this.field561 * -711329097;
      classDZ var2 = classIS.field3053;
      if (var1 > 0) {
         int var4 = var1 - 1;
         return (Actor)var2.field1698.method13405(var4);
      } else if (var1 < 0) {
         int var3 = -var1 - 1;
         return (Actor)var2.field1694.method13405(var3);
      } else {
         return null;
      }
   }

   public int getSourceLevel() {
      return this.field546 * 728954045;
   }

   @ObfuscatedSignature(descriptor = "(Lsu;FFFFFFFFB)V")
   @ObfuscatedName("ae")
   static void method1220(classSU var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, byte var9) {
      try {
         if (null == var0) {
            if (var9 >= -1) {
               throw new IllegalStateException();
            }
         } else {
            float var10 = var4 - var1;
            if (var10 == 0.0F) {
               if (var9 >= -1) {
                  throw new IllegalStateException();
               }
            } else {
               float[] var13;
               boolean var10001;
               label103: {
                  float var11 = var2 - var1;
                  float var12 = var3 - var1;
                  var13 = new float[]{var11 / var10, var12 / var10};
                  if (var13[0] == 0.33333334F) {
                     if (var9 >= -1) {
                        throw new IllegalStateException();
                     }

                     if (0.6666667F == var13[1]) {
                        if (var9 >= -1) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                        break label103;
                     }
                  }

                  var10001 = false;
               }

               var0.field6066 = var10001;
               float var14 = var13[0];
               float var15 = var13[1];
               if (var13[0] < 0.0F) {
                  if (var9 >= -1) {
                     throw new IllegalStateException();
                  }

                  var13[0] = 0.0F;
               }

               if (var13[1] > 1.0F) {
                  if (var9 >= -1) {
                     throw new IllegalStateException();
                  }

                  var13[1] = 1.0F;
               }

               label94: {
                  if (!(var13[0] > 1.0F)) {
                     if (var9 >= -1) {
                        throw new IllegalStateException();
                     }

                     if (!(var13[1] < -1.0F)) {
                        break label94;
                     }

                     if (var9 >= -1) {
                        throw new IllegalStateException();
                     }
                  }

                  classBU.method1247(var13, 290889158);
               }

               if (var14 != var13[0]) {
                  if (var9 >= -1) {
                     throw new IllegalStateException();
                  }

                  var2 = var13[0] * var10 + var1;
                  if (0.0F != var14) {
                     if (var9 >= -1) {
                        throw new IllegalStateException();
                     }

                     var6 = var5 + (var6 - var5) * var13[0] / var14;
                  }
               }

               if (var13[1] != var15) {
                  if (var9 >= -1) {
                     throw new IllegalStateException();
                  }

                  var3 = var1 + var13[1] * var10;
                  if (1.0F != var15) {
                     var7 = var8 - (1.0F - var13[1]) * (var8 - var7) / (1.0F - var15);
                  }
               }

               var0.field6057 = var1;
               var0.field6048 = var4;
               classBL.method1147(0.0F, var13[0], var13[1], 1.0F, var0, 2000914988);
               float var16 = var6 - var5;
               float var17 = var7 - var6;
               float var18 = var8 - var7;
               float var19 = var17 - var16;
               var0.field6053 = var18 - var17 - var19;
               var0.field6049 = var19 + (var19 + var19);
               var0.field6054 = var16 + var16 + var16;
               var0.field6058 = var5;
            }
         }
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "bs.ae(" + ')');
      }
   }

   public int getX1() {
      return LocalPoint.fromWorld(classIS.field3053, this.field547 * -295435255, this.field559 * 1899622973).getX();
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("bo")
   static final int method1221(int var0, byte var1) {
      try {
         int var2 = Math.abs(var0 - client.field796.method11436((short)-7322));
         short var3 = 8192;
         return var2 > var3 ? var0 + classKG.method6472(-1176778633) * (var0 < client.field796.method11436((short)-15215) ? 1 : -1) : var0;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bs.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;IIIIFFFFIIII)Z")
   @ObfuscatedName("ai")
   static final boolean method1219(
      classFX var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      try {
         if (!classAS.method660(2084378253)) {
            if (var12 == -492863254) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            classEV.method4087(var5, var6, var7, var8, var9, var10, var11, (byte)-78);
            return classMM.method7619(var0, var1, var2, var3, var4, (byte)76);
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "bs.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ax")
   void method1214(int var1, int var2, int var3) {
      try {
         this.field549 = this.field559 + -1758672327 * var1;
         this.field557 = this.field556 + var2 * 1468183829;
         this.field550 = this.field566 + -1147372671 * var1;
         this.field546 = this.field555 + var2 * -2135583901;
         this.field563 = this.field560 + classKY.method6605(var1, -535895662);
         this.field560 = this.field564 + classKY.method6612(var2, -55391551);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bs.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;IIB)V")
   @ObfuscatedName("ac")
   void method1225(classCL var1, int var2, int var3, byte var4) {
      if (var2 >= this.field554 * -988090901) {
         ProjectileMoved var23 = new ProjectileMoved();
         var23.setProjectile(this);
         var23.setPosition(this.getTarget());
         var23.setZ(this.field548 * -1558582945);
         classOE.field4843.getCallbacks().post(var23);
      }

      try {
         if (var2 < this.field547 * -988090901) {
            if (var4 != 1) {
               throw new IllegalStateException();
            }
         } else {
            classUZ var5 = classNG.method7837(
               this.field552 * -711329097, this.field555 * 253215873, -1774680501 * this.field557, -476329201 * this.field547, var1, -1853322114
            );
            int var6 = (int)var5.field6427;
            int var7 = (int)var5.field6427;
            int var8 = (int)var5.field6426 - -1558582945 * this.field555;
            classUZ.method11727(var5, 2082085210);
            if (!this.field545) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               }

               classUZ var9 = classNG.method7837(
                  -431034519 * this.field559, -295435255 * this.field557, 1899622973 * this.field557, this.field552 * 728954045, var1, -921903166
               );
               int var10 = (int)var9.field6426;
               int var11 = (int)var9.field6427;
               int var12 = (int)var9.field6426 - this.field559 * -1976479015;
               classUZ.method11727(var9, 2136541289);
               double var13 = var6 - var10;
               double var15 = var7 - var11;
               double var17 = Math.sqrt(var13 * var13 + var15 * var15);
               double var10001;
               if (Math.abs(var17) < 0.01F) {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }

                  var10001 = var10;
               } else {
                  var10001 = var10 + var13 * (980231641 * this.field556) / var17;
               }

               this.field563 = var10001;
               if (Math.abs(var17) < 0.01F) {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }

                  var10001 = var11;
               } else {
                  var10001 = this.field549 * 980231641 * var15 / var17 + var11;
               }

               this.field562 = var10001;
               this.field564 = var12;
            }

            double var25 = this.field565 * 384835215 + 1 - var2;
            double var26 = (var6 - this.field563) / var25;
            double var27 = (var7 - this.field563) / var25;
            double var28 = Math.sqrt(var26 * var26 + var27 * var27);
            if (!this.field545) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               }

               this.field564 = -var28 * Math.tan(0.02454369 * (2109317713 * this.field549));
            }

            double var29 = 2.0 * (var8 - this.field562 - var25 * this.field563) / (var25 * var25);
            this.field545 = true;
            this.field563 = this.field560 + var3 * var26;
            this.field564 += var27 * var3;
            this.field563 = this.field564 + (var3 * this.field563 + var3 * (var29 * 0.5) * var3);
            this.field562 = this.field564 + var3 * var29;
            this.field555 = ((int)(Math.atan2(var26, var27) * 325.949) + 1024 & 2047) * 2120328949;
            this.field566 = ((int)(Math.atan2(this.field560, var28) * 325.949) & 2047) * -640686565;
            classAT.field277.method286(classIS.field3053, (int)this.field562, (int)this.field560, false, 1868243250);
            classRD.method9941(this.field553, var3, classAT.field277, -1847056053);
            classAAX.method290(classAT.field277, -845090641);
         }
      } catch (RuntimeException var24) {
         throw classEG.method3884(var24, "bs.ac(" + ')');
      }
   }
}
