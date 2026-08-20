import java.awt.Shape;
import net.runelite.api.HeadIcon;
import net.runelite.api.Perspective;
import net.runelite.api.events.PlayerChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ct")
public final class Player extends Actor implements net.runelite.api.Player {
   @ObfuscatedSignature(descriptor = "Lfx;")
   @ObfuscatedName("ap")
   Model field1284;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final float field1272 = 0.4F;
   @ObfuscatedSignature(descriptor = "Laae;")
   @ObfuscatedName("ae")
   classAAE field1283;
   @ObfuscatedSignature(descriptor = "Llc;")
   @ObfuscatedName("ab")
   PlayerComposition field1285;
   @ObfuscatedName("ai")
   int field1260;
   @ObfuscatedName("aj")
   int field1262;
   @ObfuscatedName("ax")
   String[] field1270;
   @ObfuscatedName("ar")
   int field1261;
   @ObfuscatedName("au")
   int field1271 = -1626737391;
   @ObfuscatedName("bc")
   int field1282;
   @ObfuscatedName("ay")
   int field1266 = -1744797409;
   @ObfuscatedName("aw")
   int field1263;
   @ObfuscatedName("ad")
   int field1274;
   @ObfuscatedName("av")
   int field1280;
   @ObfuscatedName("as")
   int field1279;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1281 = 3;
   @ObfuscatedName("ao")
   int field1278;
   @ObfuscatedName("al")
   int field1276;
   @ObfuscatedName("am")
   int field1277;
   @ObfuscatedName("ag")
   int field1275;
   @ObfuscatedName("ak")
   boolean field1264;
   @ObfuscatedName("ac")
   int field1265;
   @ObfuscatedName("at")
   boolean field1259;
   @ObfuscatedName("aq")
   int field1258;
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("ah")
   classRC field1267;
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("bn")
   classRC field1268;
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("bx")
   classRC field1269;
   @ObfuscatedName("aa")
   int field1273;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   boolean method2622(int var1) {
      try {
         if (classRC.field5640 == this.field1267) {
            if (var1 == -1517170935) {
               throw new IllegalStateException();
            }

            this.method2625((byte)-24);
         }

         return classRC.field5642 == this.field1267;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   @Override
   protected final Model vmethod93() {
      if (null == this.field1285) {
         return null;
      } else {
         classQR var1 = this.method3175(683470986);
         classQR var2 = this.field1264 ? null : this.method3177(var1, 1026482833);
         if (var1 == null && null == var2) {
            var2 = this.field1466;
            if (classQR.method9763(this.field1466, 30, -896486757)) {
               return null;
            }
         }

         SequenceDefinition var3 = var1 == null ? null : var1.method9731((byte)91);
         SequenceDefinition var4 = var2 == null ? null : var2.method9731((byte)86);
         int var5 = null == var1 ? -1 : var1.method9738(1746341136);
         int var6 = null == var2 ? -1 : var2.method9738(1804202104);
         Model var7 = this.field1285.method6701(var3, var5, var4, var6, (byte)1);
         if (var7 == null) {
            return null;
         } else {
            var7.method5230();
            this.field1470 = var7.field1743 * 477942601;
            int var8 = var7.field2419;
            if (!this.field1264 && null != this.field1284) {
               if (client.field855 * 1612595797 >= 1209316786 * this.field1263) {
                  this.field1284 = null;
               }

               if (client.field855 * -1724046018 >= this.field1258 * 1411153905 && -899415592 * client.field855 < this.field1263 * -1847262755) {
                  Model var9 = this.field1284;
                  var9.method5233(
                     this.field1273 * -1073528817 - -1547553299 * this.field1487,
                     this.field1280 * 975612831 - -617053517 * this.field1282,
                     -539276319 * this.field1279 - this.field1489 * 1822368852
                  );
                  if (-642007377 == this.field1496 * 677773095) {
                     var9.method5238();
                     var9.method5238();
                     var9.method5238();
                  } else if (1024 == this.field1496 * 677773095) {
                     var9.method5238();
                     var9.method5238();
                  } else if (500126427 == 810308515 * this.field1496) {
                     var9.method5238();
                  }

                  Model[] var10 = new Model[]{var7, var9};
                  var7 = new Model(var10, 2);
                  if (677773095 * this.field1496 == -626618206) {
                     var9.method5238();
                  } else if (this.field1496 * 1069030477 == 1024) {
                     var9.method5238();
                     var9.method5238();
                  } else if (1866458089 == this.field1496 * 782133904) {
                     var9.method5238();
                     var9.method5238();
                     var9.method5238();
                  }

                  var9.method5233(
                     this.field1487 * -1547553299 - -2045319565 * this.field1273,
                     -617053517 * this.field1282 - this.field1280 * -1732124529,
                     this.field1489 * 773298806 - -476032635 * this.field1279
                  );
               }
            }

            var7.field2421 = true;
            if (Actor.method3180(this, 268751189)) {
               var7.method5205(this.field1435, (short)var8);
            } else {
               classQG.method9520(var7);
            }

            var7.method5200(null != this.field1477 ? classUD.method11268(this.field1477, client.field855 * 1612595797) : 0);
            return var7;
         }
      }
   }

   public int getSkullIcon() {
      return this.field1271 * 1605395471;
   }

   public boolean isFriendsChatMember() {
      return method2629(this, 95785063);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("af")
   final void method2620(classXY var1, int var2) {
      try {
         var1.field6955 = 0;
         byte var3 = classXY.method13043(var1, (byte)17);
         byte var4 = -1;
         this.field1271 = classXY.method13043(var1, (byte)17) * 1626737391;
         this.field1266 = classXY.method13043(var1, (byte)17) * 1744797409;
         int var5 = -1;
         this.field1265 = 0;
         int[] var6 = new int[12];

         for (int var7 = 0; var7 < var6.length; var7++) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            int var8 = classXY.method13039(var1, -346779531);
            if (0 == var8) {
               var6[var7] = 0;
            } else {
               int var9 = classXY.method13039(var1, -346779531);
               int var10 = var9 + (var8 << 8);
               if (var7 == 0) {
                  if (var2 != -1316125685) {
                     throw new IllegalStateException();
                  }

                  if (var10 == 65535) {
                     if (var2 != -1316125685) {
                        this.method2666();
                        return;
                     }

                     var5 = classXY.method13047(var1, 88418643);
                     break;
                  }
               }

               var6[var7] = var10;
               if (this.method2660(var6[var7], -1257713214)) {
                  if (var2 != -1316125685) {
                     this.method2666();
                     return;
                  }

                  int var11 = this.method2662(var6[var7], -1792192131).field5047 * -115663245;
                  if (var11 != 0) {
                     if (var2 != -1316125685) {
                        throw new IllegalStateException();
                     }

                     this.field1265 = var11 * 1092747225;
                  }
               }
            }
         }

         int[] var16 = new int[12];

         for (int var17 = 0; var17 < var16.length; var17++) {
            if (var2 != -1316125685) {
               this.method2666();
               return;
            }

            int var19 = classXY.method13039(var1, -346779531);
            if (0 == var19) {
               if (var2 != -1316125685) {
                  this.method2666();
                  return;
               }

               var16[var17] = 0;
            } else {
               int var22 = classXY.method13039(var1, -346779531);
               var16[var17] = (var19 << 8) + var22;
            }
         }

         int[] var18 = new int[5];

         for (int var20 = 0; var20 < var18.length; var20++) {
            if (var2 != -1316125685) {
               this.method2666();
               return;
            }

            int var23;
            label253: {
               var23 = classXY.method13039(var1, -346779531);
               if (var23 >= 0) {
                  if (var2 != -1316125685) {
                     this.method2666();
                     return;
                  }

                  if (var23 < PlayerComposition.field4110[var20].length) {
                     break label253;
                  }

                  if (var2 != -1316125685) {
                     this.method2666();
                     return;
                  }
               }

               var23 = 0;
            }

            var18[var20] = var23;
         }

         this.field1436 = classXY.method13047(var1, 541644167) * -506237411;
         if (1457308725 * this.field1436 == 65535) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            this.field1436 = 506237411;
         }

         this.field1444 = classXY.method13047(var1, -1026926631) * -349066389;
         if (65535 == 1201940803 * this.field1444) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            this.field1444 = 349066389;
         }

         this.field1457 = -2128385759 * this.field1444;
         this.field1445 = classXY.method13047(var1, 1919426113) * -950783279;
         if (65535 == -1657575887 * this.field1445) {
            this.field1445 = 950783279;
         }

         this.field1462 = classXY.method13047(var1, 536561908) * 164191859;
         if (-412780869 * this.field1462 == 65535) {
            this.field1462 = -164191859;
         }

         this.field1450 = classXY.method13047(var1, -1867894167) * 1936897965;
         if (65535 == 1347929125 * this.field1450) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            this.field1450 = -1936897965;
         }

         this.field1448 = classXY.method13047(var1, 218986588) * -1239814673;
         if (65535 == this.field1448 * -144383729) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            this.field1448 = 1239814673;
         }

         this.field1449 = classXY.method13047(var1, 1475516210) * -627296855;
         if (65535 == -1549975911 * this.field1449) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            this.field1449 = 627296855;
         }

         this.field1283 = new classAAE(var1.method13071(513444226), InterfaceParent.field5279);
         this.method2624((byte)-7);
         this.method2633(1815161989);
         method2642(this, (byte)-99);
         if (-1315528093 * this.field1480 == client.field845 * -2130951373) {
            classAAF.field48 = this.field1283.method164(2144532368);
         }

         this.field1261 = classXY.method13039(var1, -346779531) * 785932115;
         this.field1262 = classXY.method13047(var1, -1289622180) * 1111937113;
         boolean var10001;
         if (classXY.method13039(var1, -346779531) == 1) {
            if (var2 != -1316125685) {
               this.method2666();
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field1259 = var10001;
         if (client.field940 * 2064080735 == 0) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            if (client.field911 * 313368463 >= 2) {
               this.field1259 = false;
            }
         }

         PlayerCompositionColorTextureOverride[] var21 = null;
         boolean var24 = false;
         int var26 = classXY.method13047(var1, 623493113);
         boolean var10000;
         if ((var26 >> 15 & 1) == 1) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         var24 = var10000;
         if (var26 > 0) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            if (var26 != 32768) {
               if (var2 != -1316125685) {
                  this.method2666();
                  return;
               }

               var21 = new PlayerCompositionColorTextureOverride[12];

               for (int var12 = 0; var12 < var21.length; var12++) {
                  if (var2 != -1316125685) {
                     this.method2666();
                     return;
                  }

                  int var13 = var26 >> 12 - var12 & 1;
                  if (var13 == 1) {
                     var21[var12] = classHQ.method6093(var6[var12] - 2048, var1, (byte)123);
                  }
               }
            }
         }

         for (int var27 = 0; var27 < 3; var27++) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            this.field1270[var27] = var1.method13071(383025457);
         }

         var4 = classXY.method13043(var1, (byte)17);
         if (null == this.field1285) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            this.field1285 = new PlayerComposition();
         }

         this.field1285.method6673(var16, var6, var21, var24, var18, var3, var5, var4, -1963864182);
         if (var5 != -1) {
            if (var2 != -1316125685) {
               throw new IllegalStateException();
            }

            this.field1441 = classOH.method8448(var5, 832369062).field5284 * -1188676331;
         } else {
            this.field1441 = -108884837;
         }

         this.field1260 = 1444000789 * (int)(0.4F * (this.field1441 * -29570688));
         this.method2666();
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "ct.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("cx")
   @Override
   public classFL vmethod270() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ax")
   void method2624(byte var1) {
      try {
         this.field1267 = classRC.field5640;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ac")
   void method2625(byte var1) {
      try {
         classRC var10001;
         if (classQQ.field5597.method1336(this.field1283, (short)3623)) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var10001 = classRC.field5642;
         } else {
            var10001 = classRC.field5641;
         }

         this.field1267 = var10001;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   void method2630() {
      this.field1268 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("bk")
   final void method2621(classXY var1) {
      var1.field6955 = 0;
      byte var2 = classXY.method13043(var1, (byte)17);
      byte var3 = -1;
      this.field1271 = classXY.method13043(var1, (byte)17) * 1626737391;
      this.field1266 = classXY.method13043(var1, (byte)17) * 1744797409;
      int var4 = -1;
      this.field1265 = 0;
      int[] var5 = new int[12];

      for (int var6 = 0; var6 < var5.length; var6++) {
         int var7 = classXY.method13039(var1, -346779531);
         if (0 == var7) {
            var5[var6] = 0;
         } else {
            int var8 = classXY.method13039(var1, -346779531);
            int var9 = var8 + (var7 << 8);
            if (var6 == 0 && var9 == 868351295) {
               var4 = classXY.method13047(var1, 1120511050);
               break;
            }

            var5[var6] = var9;
            if (this.method2660(var5[var6], -1444996677)) {
               int var10 = this.method2662(var5[var6], -1243629555).field5047 * -115663245;
               if (var10 != 0) {
                  this.field1265 = var10 * 1092747225;
               }
            }
         }
      }

      int[] var14 = new int[12];

      for (int var15 = 0; var15 < var14.length; var15++) {
         int var17 = classXY.method13039(var1, -346779531);
         if (0 == var17) {
            var14[var15] = 0;
         } else {
            int var20 = classXY.method13039(var1, -346779531);
            var14[var15] = (var17 << 8) + var20;
         }
      }

      int[] var16 = new int[5];

      for (int var18 = 0; var18 < var16.length; var18++) {
         int var21 = classXY.method13039(var1, -346779531);
         if (var21 < 0 || var21 >= PlayerComposition.field4110[var18].length) {
            var21 = 0;
         }

         var16[var18] = var21;
      }

      this.field1436 = classXY.method13047(var1, -2133433831) * -581266605;
      if (-1225740365 * this.field1436 == 65535) {
         this.field1436 = 836503440;
      }

      this.field1444 = classXY.method13047(var1, 1543659694) * -349066389;
      if (1486109052 == 1201940803 * this.field1444) {
         this.field1444 = 2108400268;
      }

      this.field1457 = -731776138 * this.field1444;
      this.field1445 = classXY.method13047(var1, -1564925662) * -950783279;
      if (65535 == -1657575887 * this.field1445) {
         this.field1445 = 741411103;
      }

      this.field1462 = classXY.method13047(var1, -306424782) * 164191859;
      if (1288035674 * this.field1462 == 65535) {
         this.field1462 = -164191859;
      }

      this.field1450 = classXY.method13047(var1, -123180571) * 1596485319;
      if (840214921 == 553536946 * this.field1450) {
         this.field1450 = -1560238992;
      }

      this.field1448 = classXY.method13047(var1, 1735837669) * 1290668580;
      if (62142960 == this.field1448 * -2005215583) {
         this.field1448 = -2107904130;
      }

      this.field1449 = classXY.method13047(var1, -457924943) * -627296855;
      if (-1680725575 == -708374122 * this.field1449) {
         this.field1449 = 580338797;
      }

      this.field1283 = new classAAE(var1.method13071(1048284967), InterfaceParent.field5279);
      this.method2624((byte)-117);
      this.method2633(2021466746);
      method2642(this, (byte)-36);
      if (-1695768445 * this.field1480 == client.field845 * -2130951373) {
         classAAF.field48 = this.field1283.method164(935915160);
      }

      this.field1261 = classXY.method13039(var1, -346779531) * -179718946;
      this.field1262 = classXY.method13047(var1, -1740420563) * 1997669203;
      this.field1259 = classXY.method13039(var1, -346779531) == 1;
      if (client.field940 * 2064080735 == 0 && client.field911 * -1596309145 >= 2) {
         this.field1259 = false;
      }

      PlayerCompositionColorTextureOverride[] var19 = null;
      boolean var22 = false;
      int var24 = classXY.method13047(var1, -1779175332);
      var22 = (var24 >> 15 & 1) == 1;
      if (var24 > 0 && var24 != 32768) {
         var19 = new PlayerCompositionColorTextureOverride[12];

         for (int var11 = 0; var11 < var19.length; var11++) {
            int var12 = var24 >> 12 - var11 & 1;
            if (var12 == 1) {
               var19[var11] = classHQ.method6093(var5[var11] - -464863891, var1, (byte)34);
            }
         }
      }

      for (int var25 = 0; var25 < 3; var25++) {
         this.field1270[var25] = var1.method13071(1188791031);
      }

      var3 = classXY.method13043(var1, (byte)17);
      if (null == this.field1285) {
         this.field1285 = new PlayerComposition();
      }

      this.field1285.method6673(var14, var5, var19, var22, var16, var2, var4, var3, 1540624168);
      if (var4 != -1) {
         this.field1441 = classOH.method8448(var4, -165448004).field5284 * -1188676331;
      } else {
         this.field1441 = -1799876086;
      }

      this.field1260 = 1444000789 * (int)(0.4F * (this.field1441 * -29570688));
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("al")
   void method2634(byte var1) {
      try {
         this.field1268 = classIB.field2935 != null && classIB.field2935.method10202(this.field1283, (byte)10) ? classRC.field5642 : classRC.field5641;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void method2638(int var1) {
      try {
         for (int var2 = 0; var2 < 4; var2++) {
            if (var1 <= 194762437) {
               throw new IllegalStateException();
            }

            if (client.field865[var2] != null) {
               if (var1 <= 194762437) {
                  throw new IllegalStateException();
               }

               if (classBE.method993(client.field865[var2], this.field1283.method164(1094117563), -1558465262) != -1 && var2 != 2) {
                  if (var1 <= 194762437) {
                     throw new IllegalStateException();
                  }

                  this.field1269 = classRC.field5642;
                  return;
               }
            }
         }

         this.field1269 = classRC.field5641;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ct.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qb")
   public void method2666() {
      classOE.field4843.getCallbacks().post(new PlayerChanged(this));
   }

   Player(int var1) {
      super(var1);
      this.field1270 = new String[3];
      this.field1261 = 0;
      this.field1262 = 0;
      this.field1258 = 0;
      this.field1263 = 0;
      this.field1264 = false;
      this.field1265 = 0;
      this.field1259 = false;
      this.field1267 = classRC.field5640;
      this.field1268 = classRC.field5640;
      this.field1269 = classRC.field5640;
      this.field1260 = 0;

      for (int var2 = 0; var2 < 3; var2++) {
         this.field1270[var2] = "";
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   protected final Model vmethod104(int var1) {
      if (client.field1116 != null
         && client.field1116
            .test(super.field1465.field5598 * 1684838611 != -1 ? super.field1465.field5598 * 1684838611 : super.field1464.field5598 * 1684838611)) {
         int var2 = super.field1465.field5602 * 292569817;
         int var3 = super.field1464.field5602 * 292569817;

         Model var4;
         try {
            super.field1465.field5602 = (-2147483648 | Math.max(super.field1465.field5604 * -1399668821 - 1, 0) << 16 | var2) * -885908119;
            super.field1464.field5602 = (-1073741824 | Math.max(super.field1464.field5604 * -1399668821 - 1, 0) << 16 | var3) * -885908119;
            var4 = this.method2665();
         } finally {
            super.field1465.field5602 = var2 * -885908119;
            super.field1464.field5602 = var3 * -885908119;
         }

         return var4;
      } else {
         return this.method2665();
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lfz;")
   @ObfuscatedName("bg")
   @Override
   protected classFZ vmethod260(byte var1) {
      try {
         return classFZ.field2517;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.bg(" + ')');
      }
   }

   public int getCombatLevel() {
      return this.field1261 * 810892507;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IILgt;I)V")
   @ObfuscatedName("am")
   final void method2650(WorldView var1, int var2, int var3, classGT var4, int var5) {
      try {
         if (this.field1465.method9726(374233424)) {
            if (var5 <= -1013526269) {
               throw new IllegalStateException();
            }

            if (this.field1465.method9731((byte)10).field5119 * 221400229 == 1) {
               if (var5 <= -1013526269) {
                  throw new IllegalStateException();
               }

               Actor.method3101(this, -2041058085);
            }
         }

         if (this.field1463.field625 == classLV.field4234) {
            if (var5 <= -1013526269) {
               throw new IllegalStateException();
            }

            Actor.method3160(this, -1300508373);
         }

         if (!var1.method3729(var2, var3, (byte)1)) {
            if (var5 <= -1013526269) {
               throw new IllegalStateException();
            }

            this.method3113(var2, var3, 527441438);
         } else if (!var1.method3729(this.field1474[0], this.field1433[0], (byte)1)) {
            if (var5 <= -1013526269) {
               throw new IllegalStateException();
            }

            this.method3113(var2, var3, 527441438);
         } else {
            if (classGT.field2681 == var4) {
               if (var5 <= -1013526269) {
                  return;
               }

               Player var6 = this;
               classGT var7 = classGT.field2681;
               int var8 = this.field1474[0];
               int var9 = this.field1433[0];
               int var10 = this.field1441 * 670857619;
               CollisionMap var11 = var1.field1687[var1.field1710 * -483624883];
               if (var8 >= var10) {
                  if (var5 <= -1013526269) {
                     throw new IllegalStateException();
                  }

                  if (var8 < var11.method5314(719965141) - var10) {
                     if (var5 <= -1013526269) {
                        throw new IllegalStateException();
                     }

                     if (var9 >= var10) {
                        if (var5 <= -1013526269) {
                           return;
                        }

                        if (var9 < var11.method5317(229979547) - var10 && var2 >= var10) {
                           if (var5 <= -1013526269) {
                              return;
                           }

                           if (var2 < var11.method5314(719965141) - var10) {
                              if (var5 <= -1013526269) {
                                 throw new IllegalStateException();
                              }

                              if (var3 >= var10) {
                                 if (var5 <= -1013526269) {
                                    throw new IllegalStateException();
                                 }

                                 if (var3 >= var11.method5317(293250640) - var10) {
                                    if (var5 <= -1013526269) {
                                       throw new IllegalStateException();
                                    }
                                 } else {
                                    classGI var12 = client.field797;
                                    client.field906.field2575 = var2 * 1282184713;
                                    client.field906.field2573 = -1029427619 * var3;
                                    client.field906.field2572 = 1082305177;
                                    client.field906.field2571 = 1267969013;
                                    classBU var16 = client.field906;
                                    int var17 = classGI.method5444(var12, var8, var9, var10, var16, var11, true, client.field1005, client.field818, 2020553521);
                                    if (var17 < 1) {
                                       if (var5 <= -1013526269) {
                                          throw new IllegalStateException();
                                       }
                                    } else {
                                       for (int var18 = 0; var18 < var17 - 1; var18++) {
                                          if (var5 <= -1013526269) {
                                             throw new IllegalStateException();
                                          }

                                          Actor.method3111(var6, client.field1005[var18], client.field818[var18], var7, -1933809627);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            Actor.method3111(this, var2, var3, var4, 1978443404);
         }
      } catch (RuntimeException var19) {
         throw classEG.method3884(var19, "ct.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ah")
   void method2654(int var1, int var2, int var3) {
      try {
         this.field1474[0] = var1;
         this.field1433[0] = var2;
         this.field1473 = 0;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ct.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bn")
   @Override
   final boolean vmethod262(byte var1) {
      try {
         return this.field1285 != null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   @Override
   protected boolean vmethod96() {
      if (this.field1285 == null) {
         return false;
      } else if (this.field1284 != null && null != this.field1284.field2444) {
         return true;
      } else if (this.method3146(-338708816)) {
         return true;
      } else if (this.field1477 != null && this.field1477.method282(client.field855 * 1612595797)) {
         return true;
      } else {
         Model var1 = this.field1285.method6701(null, -1, null, -1, (byte)1);
         return var1 != null && var1.field2444 != null;
      }
   }

   public HeadIcon getOverheadIcon() {
      switch (this.method2669()) {
         case 0:
            return HeadIcon.MELEE;
         case 1:
            return HeadIcon.RANGED;
         case 2:
            return HeadIcon.MAGIC;
         case 3:
            return HeadIcon.RETRIBUTION;
         case 4:
            return HeadIcon.SMITE;
         case 5:
            return HeadIcon.REDEMPTION;
         case 6:
            return HeadIcon.RANGE_MAGE;
         case 7:
            return HeadIcon.RANGE_MELEE;
         case 8:
            return HeadIcon.MAGE_MELEE;
         case 9:
            return HeadIcon.RANGE_MAGE_MELEE;
         case 10:
            return HeadIcon.WRATH;
         case 11:
            return HeadIcon.SOUL_SPLIT;
         case 12:
            return HeadIcon.DEFLECT_MELEE;
         case 13:
            return HeadIcon.DEFLECT_RANGE;
         case 14:
            return HeadIcon.DEFLECT_MAGE;
         default:
            return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lop;")
   @ObfuscatedName("bc")
   classOP method2662(int var1, int var2) {
      try {
         return classOB.method8299(var1 - 2048, (byte)-5);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ct.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bp")
   @Override
   int vmethod267(int var1) {
      try {
         int var10000;
         if (this.method3170(-921463806)) {
            if (var1 != -1423776655) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = this.field1260 * -776307907;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.bp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   void method2631() {
      this.field1268 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   @Override
   final boolean vmethod263() {
      return this.field1285 != null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bt")
   @Override
   public int vmethod278(int var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.bt(" + 41);
      }
   }

   public void setSkullIcon(int var1) {
      this.field1271 = var1 * 1626737391;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod92() {
      if (null == this.field1285) {
         return null;
      } else {
         classQR var1 = this.method3175(1310935380);
         classQR var2 = this.field1264 ? null : this.method3177(var1, 234763946);
         if (var1 == null && null == var2) {
            var2 = this.field1466;
            if (classQR.method9763(this.field1466, 30, -1854058660)) {
               return null;
            }
         }

         SequenceDefinition var3 = var1 == null ? null : var1.method9731((byte)86);
         SequenceDefinition var4 = var2 == null ? null : var2.method9731((byte)109);
         int var5 = null == var1 ? -1 : var1.method9738(1727974174);
         int var6 = null == var2 ? -1 : var2.method9738(1968260419);
         Model var7 = this.field1285.method6701(var3, var5, var4, var6, (byte)1);
         if (var7 == null) {
            return null;
         } else {
            var7.method5230();
            this.field1470 = var7.field1743 * 2010593719;
            int var8 = var7.field2419;
            if (!this.field1264 && null != this.field1284) {
               if (client.field855 * 1612595797 >= -1847262755 * this.field1263) {
                  this.field1284 = null;
               }

               if (client.field855 * 824713772 >= this.field1258 * 1411153905 && 1612595797 * client.field855 < this.field1263 * -548054895) {
                  Model var9 = this.field1284;
                  var9.method5233(
                     this.field1273 * 12490279 - -1547553299 * this.field1487,
                     this.field1280 * -1994643512 - 1583550407 * this.field1282,
                     -476032635 * this.field1279 - this.field1489 * -1942486535
                  );
                  if (890188318 == this.field1496 * 677773095) {
                     var9.method5238();
                     var9.method5238();
                     var9.method5238();
                  } else if (-1111373804 == this.field1496 * 677773095) {
                     var9.method5238();
                     var9.method5238();
                  } else if (-1877143436 == 677773095 * this.field1496) {
                     var9.method5238();
                  }

                  Model[] var10 = new Model[]{var7, var9};
                  var7 = new Model(var10, 2);
                  if (677773095 * this.field1496 == -823106) {
                     var9.method5238();
                  } else if (this.field1496 * 1344384338 == 1024) {
                     var9.method5238();
                     var9.method5238();
                  } else if (1536 == this.field1496 * -684639172) {
                     var9.method5238();
                     var9.method5238();
                     var9.method5238();
                  }

                  var9.method5233(
                     this.field1487 * 990646392 - 12490279 * this.field1273,
                     -538296219 * this.field1282 - this.field1280 * -327815306,
                     this.field1489 * -819497285 - -1553909214 * this.field1279
                  );
               }
            }

            var7.field2421 = true;
            if (Actor.method3180(this, -1626324276)) {
               var7.method5205(this.field1435, (short)var8);
            } else {
               classQG.method9520(var7);
            }

            var7.method5200(null != this.field1477 ? classUD.method11268(this.field1477, client.field855 * 1612595797) : 0);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod258(byte var1) {
      try {
         return -426380455 * this.field1274;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   @Override
   protected boolean vmethod94() {
      if (this.field1285 == null) {
         return false;
      } else if (this.field1284 != null && null != this.field1284.field2444) {
         return true;
      } else if (this.method3146(-961167001)) {
         return true;
      } else if (this.field1477 != null && this.field1477.method282(client.field855 * 1612595797)) {
         return true;
      } else {
         Model var1 = this.field1285.method6701(null, -1, null, -1, (byte)1);
         return var1 != null && var1.field2444 != null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("nb")
   public boolean method2667() {
      return this.field1259;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod97() {
      if (this.field1285 == null) {
         return false;
      } else if (this.field1284 != null && null != this.field1284.field2444) {
         return true;
      } else if (this.method3146(-1080088748)) {
         return true;
      } else if (this.field1477 != null && this.field1477.method282(client.field855 * 1612595797)) {
         return true;
      } else {
         Model var1 = this.field1285.method6701(null, -1, null, -1, (byte)1);
         return var1 != null && var1.field2444 != null;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   @Override
   public int vmethod259() {
      return 1465032957 * this.field1274;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   void method2639() {
      for (int var1 = 0; var1 < 4; var1++) {
         if (client.field865[var1] != null && classBE.method993(client.field865[var1], this.field1283.method164(663505214), -1022594830) != -1 && var1 != 2) {
            this.field1269 = classRC.field5642;
            return;
         }
      }

      this.field1269 = classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "()Llc;")
   @ObfuscatedName("wq")
   public PlayerComposition method2668() {
      return this.field1285;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   void method2626() {
      this.field1267 = classQQ.field5597.method1336(this.field1283, (short)14336) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bw")
   boolean method2627() {
      if (classRC.field5640 == this.field1268) {
         this.method2634((byte)-30);
      }

      return classRC.field5642 == this.field1268;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bb")
   boolean method2628() {
      if (classRC.field5640 == this.field1268) {
         this.method2634((byte)-24);
      }

      return classRC.field5642 == this.field1268;
   }

   public int getId() {
      return super.field1480 * -1315528093;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method2632() {
      this.field1268 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IILgt;)V")
   @ObfuscatedName("cl")
   final void method2651(WorldView var1, int var2, int var3, classGT var4) {
      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)127).field5119 * 221400229 == 1) {
         Actor.method3101(this, -1085377668);
      }

      if (this.field1463.field625 == classLV.field4234) {
         Actor.method3160(this, 1149440410);
      }

      if (!var1.method3729(var2, var3, (byte)1)) {
         this.method3113(var2, var3, 527441438);
      } else if (!var1.method3729(this.field1474[0], this.field1433[0], (byte)1)) {
         this.method3113(var2, var3, 527441438);
      } else {
         if (classGT.field2681 == var4) {
            Player var5 = this;
            classGT var6 = classGT.field2681;
            int var7 = this.field1474[0];
            int var8 = this.field1433[0];
            int var9 = this.field1441 * 670857619;
            CollisionMap var10 = var1.field1687[var1.field1710 * -483624883];
            if (var7 >= var9
               && var7 < var10.method5314(719965141) - var9
               && var8 >= var9
               && var8 < var10.method5317(209510011) - var9
               && var2 >= var9
               && var2 < var10.method5314(719965141) - var9
               && var3 >= var9
               && var3 < var10.method5317(490538551) - var9) {
               classGI var11 = client.field797;
               client.field906.field2575 = var2 * 498630228;
               client.field906.field2573 = -1029427619 * var3;
               client.field906.field2572 = 1072098885;
               client.field906.field2571 = 1267969013;
               classBU var15 = client.field906;
               int var16 = classGI.method5444(var11, var7, var8, var9, var15, var10, true, client.field1005, client.field818, 1685278142);
               if (var16 >= 1) {
                  for (int var17 = 0; var17 < var16 - 1; var17++) {
                     Actor.method3111(var5, client.field1005[var17], client.field818[var17], var6, 954292051);
                  }
               }
            }
         }

         Actor.method3111(this, var2, var3, var4, 2131038697);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ca")
   @Override
   final boolean vmethod264() {
      return this.field1285 != null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   void method2635() {
      this.field1268 = classIB.field2935 != null && classIB.field2935.method10202(this.field1283, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @Override
   public int getFootprintSize() {
      return this.field1260 * -776307907;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   void method2636() {
      this.field1268 = classIB.field2935 != null && classIB.field2935.method10202(this.field1283, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dm")
   @Override
   public int vmethod279() {
      return 0;
   }

   public boolean isClanMember() {
      return method2648(this, -1817263910);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   void method2640() {
      this.field1269 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   void method2641() {
      this.field1269 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("se")
   public int method2669() {
      return this.field1266 * -325171935;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("dc")
   @Override
   public float vmethod275() {
      return 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   boolean method2644() {
      if (this.field1269 == classRC.field5640) {
         this.method2638(1811111908);
      }

      return classRC.field5642 == this.field1269;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   boolean method2645() {
      if (this.field1269 == classRC.field5640) {
         this.method2638(208280783);
      }

      return classRC.field5642 == this.field1269;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ct")
   boolean method2646() {
      if (this.field1269 == classRC.field5640) {
         this.method2638(211119143);
      }

      return classRC.field5642 == this.field1269;
   }

   @ObfuscatedSignature(descriptor = "()Lfz;")
   @ObfuscatedName("cp")
   @Override
   protected classFZ vmethod261() {
      return classFZ.field2517;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("hx")
   public static void method2637(Player var0) {
      if (var0 == null) {
         var0.vmethod272();
      }

      var0.field1268 = classIB.field2935 != null && classIB.field2935.method10202(var0.field1283, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IILgt;)V")
   @ObfuscatedName("cq")
   final void method2652(WorldView var1, int var2, int var3, classGT var4) {
      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)111).field5119 * 221400229 == 1) {
         Actor.method3101(this, 579795154);
      }

      if (this.field1463.field625 == classLV.field4234) {
         Actor.method3160(this, 289399993);
      }

      if (!var1.method3729(var2, var3, (byte)1)) {
         this.method3113(var2, var3, 527441438);
      } else if (!var1.method3729(this.field1474[0], this.field1433[0], (byte)1)) {
         this.method3113(var2, var3, 527441438);
      } else {
         if (classGT.field2681 == var4) {
            Player var5 = this;
            classGT var6 = classGT.field2681;
            int var7 = this.field1474[0];
            int var8 = this.field1433[0];
            int var9 = this.field1441 * 1370260551;
            CollisionMap var10 = var1.field1687[var1.field1710 * -483624883];
            if (var7 >= var9
               && var7 < var10.method5314(719965141) - var9
               && var8 >= var9
               && var8 < var10.method5317(1386043373) - var9
               && var2 >= var9
               && var2 < var10.method5314(719965141) - var9
               && var3 >= var9
               && var3 < var10.method5317(162342951) - var9) {
               classGI var11 = client.field797;
               client.field906.field2575 = var2 * 1231443365;
               client.field906.field2573 = -1029427619 * var3;
               client.field906.field2572 = 1082305177;
               client.field906.field2571 = 1267969013;
               classBU var15 = client.field906;
               int var16 = classGI.method5444(var11, var7, var8, var9, var15, var10, true, client.field1005, client.field818, 2024318930);
               if (var16 >= 1) {
                  for (int var17 = 0; var17 < var16 - 1; var17++) {
                     Actor.method3111(var5, client.field1005[var17], client.field818[var17], var6, 1238188250);
                  }
               }
            }
         }

         Actor.method3111(this, var2, var3, var4, -1922552652);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;I)Z")
   @ObfuscatedName("bb")
   public static boolean method2629(Player var0, int var1) {
      if (var0 == null) {
         return var0.method2661(var1);
      } else {
         try {
            if (classRC.field5640 == var0.field1268) {
               if (var1 == -494923286) {
                  throw new IllegalStateException();
               }

               var0.method2634((byte)-17);
            }

            boolean var10000;
            if (classRC.field5642 == var0.field1268) {
               if (var1 == -494923286) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "ct.aa(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lct;)Z")
   @ObfuscatedName("yn")
   public static boolean method2623(Player var0) {
      if (classRC.field5640 == var0.field1267) {
         var0.method2625((byte)-38);
      }

      return classRC.field5642 == var0.field1267;
   }

   public boolean isFriend() {
      return this.method2622(-1742844410);
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("bm")
   @Override
   public float vmethod276(int var1) {
      try {
         return 1.0F;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IILgt;)V")
   @ObfuscatedName("cd")
   final void method2653(WorldView var1, int var2, int var3, classGT var4) {
      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)74).field5119 * 1714617423 == 1) {
         Actor.method3101(this, -1874297169);
      }

      if (this.field1463.field625 == classLV.field4234) {
         Actor.method3160(this, 187292462);
      }

      if (!var1.method3729(var2, var3, (byte)1)) {
         this.method3113(var2, var3, 527441438);
      } else if (!var1.method3729(this.field1474[0], this.field1433[0], (byte)1)) {
         this.method3113(var2, var3, 527441438);
      } else {
         if (classGT.field2681 == var4) {
            Player var5 = this;
            classGT var6 = classGT.field2681;
            int var7 = this.field1474[0];
            int var8 = this.field1433[0];
            int var9 = this.field1441 * 289006958;
            CollisionMap var10 = var1.field1687[var1.field1710 * -483624883];
            if (var7 >= var9
               && var7 < var10.method5314(719965141) - var9
               && var8 >= var9
               && var8 < var10.method5317(577567015) - var9
               && var2 >= var9
               && var2 < var10.method5314(719965141) - var9
               && var3 >= var9
               && var3 < var10.method5317(1140727572) - var9) {
               classGI var11 = client.field797;
               client.field906.field2575 = var2 * 1282184713;
               client.field906.field2573 = -1029427619 * var3;
               client.field906.field2572 = 1082305177;
               client.field906.field2571 = 1267969013;
               classBU var15 = client.field906;
               int var16 = classGI.method5444(var11, var7, var8, var9, var15, var10, true, client.field1005, client.field818, 1935527546);
               if (var16 >= 1) {
                  for (int var17 = 0; var17 < var16 - 1; var17++) {
                     Actor.method3111(var5, client.field1005[var17], client.field818[var17], var6, 501112585);
                  }
               }
            }
         }

         Actor.method3111(this, var2, var3, var4, 1674752683);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cy")
   void method2655(int var1, int var2) {
      this.field1474[0] = var1;
      this.field1433[0] = var2;
      this.field1473 = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cv")
   void method2656(int var1, int var2) {
      this.field1474[0] = var1;
      this.field1433[0] = var2;
      this.field1473 = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("co")
   void method2657(int var1, int var2) {
      this.field1474[0] = var1;
      this.field1433[0] = var2;
      this.field1473 = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cs")
   void method2658(int var1, int var2) {
      this.field1474[0] = var1;
      this.field1433[0] = var2;
      this.field1473 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aq")
   boolean method2659(int var1) {
      return var1 >= 2048;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   void method2633(int var1) {
      try {
         this.field1268 = classRC.field5640;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cc")
   @Override
   final boolean vmethod265() {
      return this.field1285 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cf")
   @Override
   final boolean vmethod266() {
      return this.field1285 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cr")
   boolean method2647() {
      if (this.field1269 == classRC.field5640) {
         this.method2638(1760905407);
      }

      return classRC.field5642 == this.field1269;
   }

   @ObfuscatedSignature(descriptor = "(I)Lop;")
   @ObfuscatedName("cz")
   classOP method2663(int var1) {
      return classOB.method8299(var1 - -1006705812, (byte)40);
   }

   @ObfuscatedSignature(descriptor = "(Lct;I)Z")
   @ObfuscatedName("zm")
   public static boolean method2648(Player var0, int var1) {
      if (var0 == null) {
         var0.method2649(var1);
      }

      try {
         if (var0.field1269 == classRC.field5640) {
            if (var1 >= -719672733) {
               throw new IllegalStateException();
            }

            var0.method2638(977576880);
         }

         boolean var10000;
         if (classRC.field5642 == var0.field1269) {
            if (var1 >= -719672733) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   @Override
   protected boolean vmethod95(int var1) {
      try {
         if (this.field1285 == null) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (this.field1284 != null) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               if (null != this.field1284.field2444) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            if (this.method3146(-924563615)) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               if (this.field1477 != null) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  if (this.field1477.method282(client.field855 * 1612595797)) {
                     return true;
                  }
               }

               Model var2 = this.field1285.method6701(null, -1, null, -1, (byte)1);
               if (var2 == null || var2.field2444 == null) {
                  return false;
               } else if (var1 == -702405562) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ct.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("qh")
   public Model method2665() {
      Player var1 = this;
      int var2 = -891174633;

      try {
         Model var10000;
         if (null == var1.field1285) {
            if (var2 <= -1767431455) {
               throw new IllegalStateException();
            }

            Object var14 = null;
            var10000 = (Model)var14;
         } else {
            classQR var3 = var1.method3175(1447637223);
            classQR var4 = var1.field1264 ? null : var1.method3177(var3, 160801004);
            if (var3 == null && null == var4) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var4 = var1.field1466;
               if (classQR.method9763(var1.field1466, 30, -1371533163)) {
                  if (var2 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            SequenceDefinition var17;
            if (var3 == null) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var17 = null;
            } else {
               var17 = var3.method9731((byte)8);
            }

            SequenceDefinition var5 = var17;
            SequenceDefinition var18;
            if (var4 == null) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var18 = null;
            } else {
               var18 = var4.method9731((byte)72);
            }

            SequenceDefinition var6 = var18;
            int var19;
            if (null == var3) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var19 = -1;
            } else {
               var19 = var3.method9738(2049180687);
            }

            int var7 = var19;
            int var20;
            if (null == var4) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var20 = -1;
            } else {
               var20 = var4.method9738(1715698560);
            }

            int var8 = var20;
            Model var9 = var1.field1285.method6701(var5, var7, var6, var8, (byte)1);
            if (var9 == null) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               Object var15 = null;
               var10000 = (Model)var15;
            } else {
               var9.method5230();
               var1.field1470 = var9.field1743 * 2010593719;
               int var10 = var9.field2419;
               if (!var1.field1264) {
                  if (var2 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  if (null != var1.field1284) {
                     if (client.field855 * 1612595797 >= -1847262755 * var1.field1263) {
                        if (var2 <= -1767431455) {
                           throw new IllegalStateException();
                        }

                        var1.field1284 = null;
                     }

                     if (client.field855 * 1612595797 >= var1.field1258 * 1411153905) {
                        if (var2 <= -1767431455) {
                           throw new IllegalStateException();
                        }

                        if (1612595797 * client.field855 < var1.field1263 * -1847262755) {
                           Model var11 = var1.field1284;
                           var11.method5233(
                              var1.field1273 * 12490279 - -1547553299 * var1.field1487,
                              var1.field1280 * -1732124529 - -617053517 * var1.field1282,
                              -476032635 * var1.field1279 - var1.field1489 * -1272026483
                           );
                           if (512 == var1.field1496 * 677773095) {
                              var11.method5238();
                              var11.method5238();
                              var11.method5238();
                           } else if (1024 == var1.field1496 * 677773095) {
                              if (var2 <= -1767431455) {
                                 throw new IllegalStateException();
                              }

                              var11.method5238();
                              var11.method5238();
                           } else if (1536 == 677773095 * var1.field1496) {
                              if (var2 <= -1767431455) {
                                 throw new IllegalStateException();
                              }

                              var11.method5238();
                           }

                           Model[] var12 = new Model[]{var9, var11};
                           var9 = new Model(var12, 2);
                           if (677773095 * var1.field1496 == 512) {
                              if (var2 <= -1767431455) {
                                 throw new IllegalStateException();
                              }

                              var11.method5238();
                           } else if (var1.field1496 * 677773095 == 1024) {
                              var11.method5238();
                              var11.method5238();
                           } else if (1536 == var1.field1496 * 677773095) {
                              if (var2 <= -1767431455) {
                                 throw new IllegalStateException();
                              }

                              var11.method5238();
                              var11.method5238();
                              var11.method5238();
                           }

                           var11.method5233(
                              var1.field1487 * -1547553299 - 12490279 * var1.field1273,
                              -617053517 * var1.field1282 - var1.field1280 * -1732124529,
                              var1.field1489 * -1272026483 - -476032635 * var1.field1279
                           );
                        }
                     }
                  }
               }

               var9.field2421 = true;
               if (Actor.method3180(var1, -736278414)) {
                  var9.method5205(var1.field1435, (short)var10);
               } else {
                  classQG.method9520(var9);
               }

               var9.method5200(null != var1.field1477 ? classUD.method11268(var1.field1477, client.field855 * 1612595797) : 0);
               var10000 = var9;
            }
         }

         return var10000;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "ct.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;B)V")
   @ObfuscatedName("ub")
   public static void method2642(Player var0, byte var1) {
      if (var0 == null) {
         var0.method2643(var1);
      } else {
         try {
            var0.field1269 = classRC.field5640;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "ct.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   @Override
   int vmethod268() {
      return this.method3170(-921463806) ? 0 : this.field1260 * -776307907;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cj")
   @Override
   int vmethod269() {
      return this.method3170(-921463806) ? 0 : this.field1260 * -776307907;
   }

   public Shape getConvexHull() {
      Model var1 = this.method3842();
      if (var1 == null) {
         return null;
      } else {
         WorldView var2 = this.method3284();
         int var3 = Perspective.getFootprintTileHeight(classOE.field4843, this.getLocalLocation(), var2.field1710 * -483624883, this.getFootprintSize());
         var3 -= this.getAnimationHeightOffset();
         return var1.method5252(var2, super.field1487 * -1547553299, super.field1489 * -1272026483, this.getCurrentOrientation(), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("ci")
   @Override
   public classFL vmethod271() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("ce")
   @Override
   public classFL vmethod272() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("cm")
   @Override
   public classFL vmethod273() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("sg")
   public int method2670() {
      return this.field1262 * 1777039337;
   }

   @ObfuscatedSignature(descriptor = "(B)Lfl;")
   @ObfuscatedName("br")
   @Override
   public classFL vmethod274(byte var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("dd")
   @Override
   public float vmethod277() {
      return 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dx")
   @Override
   public int vmethod280() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bx")
   boolean method2660(int var1, int var2) {
      try {
         boolean var10000;
         if (var1 >= 2048) {
            if (var2 >= 18294437) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ct.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   static void method2664(int var0) {
      try {
         classAC.method326(24, 2082710948);
         WorldEntity.method10624(classKK.field3844, classKK.field3845, classKK.field3803, (byte)-108);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ct.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ay")
   void method2643(byte var1) {
      try {
         this.field1267 = classRC.field5640;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ct.ay(" + ')');
      }
   }

   public int getTeam() {
      return this.field1265 * 532975721;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   boolean method2649(int var1) {
      try {
         if (this.field1285 == null) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (this.field1284 != null) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               if (null != this.field1284.field2444) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            if (this.method3170(-924563615)) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               if (this.field1477 != null) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  if (this.field1477.method282(client.field1081 * 1612595797)) {
                     return true;
                  }
               }

               Model var2 = this.field1285.method6701(null, -1, null, -1, (byte)1);
               if (var2 == null || var2.field2444 == null) {
                  return false;
               } else if (var1 == -702405562) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ct.ab(" + ')');
      }
   }

   public String getName() {
      if (this.field1283 == null) {
         return null;
      } else {
         String var1 = this.field1283.method186();
         return var1 == null ? null : var1.replace(' ', ' ');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cn")
   boolean method2661(int var1) {
      return var1 >= 2048;
   }
}
