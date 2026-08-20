import net.runelite.api.WorldEntity;
import net.runelite.api.coords.LocalPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sp")
public class classSP extends classVQ implements classYB, WorldEntity {
   @ObfuscatedName("ag")
   public int field6009;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6024 = -1200;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6023 = 31;
   @ObfuscatedName("ni")
   public boolean field6008 = false;
   @ObfuscatedSignature(descriptor = "Lgy;")
   @ObfuscatedName("ab")
   public final classGY field6019;
   @ObfuscatedName("aa")
   int field6011;
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("as")
   public classDZ field6012;
   @ObfuscatedName("ao")
   public int field6020;
   @ObfuscatedSignature(descriptor = "[Lsr;")
   @ObfuscatedName("ac")
   classSR[] field6010;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final float field6022 = 0.01F;
   @ObfuscatedSignature(descriptor = "Loi;")
   @ObfuscatedName("ax")
   public classOI field6026;
   @ObfuscatedName("au")
   public int field6018;
   @ObfuscatedName("aj")
   int field6013;
   @ObfuscatedSignature(descriptor = "Lsq;")
   @ObfuscatedName("ay")
   classSQ field6014;
   @ObfuscatedName("aq")
   boolean field6015;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("ad")
   public classQR field6016;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("ap")
   public classQR field6017;
   @ObfuscatedSignature(descriptor = "Lkr;")
   @ObfuscatedName("al")
   classKR field6021;
   @ToRemove(unused = "true")
   @ObfuscatedName("cl")
   static final int field6025 = 249;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bp")
   public boolean method10557() {
      return this.field6012.field1689.field2055 == 0.01F;
   }

   public int getOwnerType() {
      return this.field6021.method13274();
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ae")
   public void method10554(boolean var1, int var2) {
      try {
         classQR var3 = this.method10552(-873839240);
         classQR var10000;
         if (var3 != null) {
            if (var2 <= 1772825224) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = this.field6016;
         }

         classQR var4 = var10000;
         classUU.method11574(this.field6012.field1689.field2028, -1782703087);
         if (null != var4) {
            if (var2 <= 1772825224) {
               throw new IllegalStateException();
            }

            if (var4.method9734(500216846) != -1 && var4.method9765((byte)-52) && var4.method9731((byte)24).method8768((byte)0)) {
               if (var2 <= 1772825224) {
                  return;
               }

               classSN var5 = var4.method9731((byte)56).method8781(-1744796165);
               classEF var6 = var5.field5983.method3924((byte)-26);
               classSG var7 = var6.method3854(0, (byte)95);
               if (var7 != null) {
                  if (var2 <= 1772825224) {
                     return;
                  }

                  var6.method3865(var5, var4.method9738(1984534226), -1468766705);
                  rl23.method10067(this.field6012.field1689.field2028, classMN.method7625(var7, -2048083282), (byte)-94);
                  this.field6012.field1689.field2028.field6399 = -this.field6012.field1689.field2028.field6399;
               }
            }
         }

         this.field6012.field1689.field2027 = -483624883 * this.field6012.field1710;
         if (var1) {
            if (var2 <= 1772825224) {
               return;
            }

            this.field6012.field1689.field2030 = -1200;
            this.field6012.field1689.field2055 = 0.01F;
            int var11 = classOI.method8497(this.field6026, -906701437);
            classFL var12 = this.field6012.field1689.field2035;
            byte var13 = classGK.method5471(var11, -1823464209);
            byte var8 = classGK.method5472(var11, -1665176581);
            byte var9 = (byte)(var11 & 127);
            classFL.method4832(var12, var13, var8, var9, (byte)127);
         } else {
            this.field6012.field1689.field2030 = 0;
            this.field6012.field1689.field2055 = 1.0F;
            classFL.method4836(this.field6012.field1689.field2035);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "sp.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   public boolean method10558(int var1) {
      try {
         return this.field6012.field1689.field2055 == 0.01F;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lkw;")
   @ObfuscatedName("bi")
   public classKW method10573(boolean var1) {
      return var1 ? classKW.field4043 : classOI.method8488(this.field6026, 1221832000);
   }

   public int getOrientation() {
      return this.field6019.field2744 * 1859166197;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method10559(int var1) {
      try {
         return this.field6019.method5905(1170569827);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;Lgy;II)V")
   @ObfuscatedName("rc")
   public static void method10615(classSP var0, classGY var1, int var2, int var3) {
      if (-1956329391 * var0.field6011 < 9) {
         var0.field6011 += 1129391170;
      }

      for (int var4 = 1444063469 * var0.field6011; var4 > 0; var4--) {
         classSR var5 = var0.field6010[var4];
         var0.field6010[var4] = var0.field6010[var4 - 1];
         var0.field6010[var4 - 1] = var5;
      }

      var0.field6010[0].field6029.method5926(var1, -1712466395);
      var0.field6010[0].field6030 = client.field855 * -1876258533;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ea")
   @Override
   public int vmethod371(int var1) {
      try {
         return classGY.method5909(this.field6019, 1690676705);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.ea(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod258(byte var1) {
      try {
         if (this.field6020 * -1427480299 != 0) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            classDZ var2 = client.field814.method1590(-1427480299 * this.field6020, (short)30221);
            if (var2 != null) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               return var2.field1710 * -483624883;
            }
         }

         return classIS.field3053.field1710 * -483624883;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.az(" + 41);
      }
   }

   public LocalPoint transformToMainWorld(LocalPoint var1) {
      if (var1.getWorldView() != this.field6009 * -1807801405) {
         throw new IllegalArgumentException("LocalPoint doesn't belong do this WorldEntity");
      } else {
         classUZ var2 = this.method10632(var1.getX(), var1.getY());
         LocalPoint var3 = new LocalPoint((int)var2.field6427, (int)var2.field6426, 0);
         var2.method11788();
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public int method10561(int var1) {
      try {
         return this.field6019.method5920(1938488016);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lgy;")
   @ObfuscatedName("ax")
   public classGY method10563(int var1) {
      try {
         classGY var10000;
         if (-1956329391 * this.field6011 == 0) {
            if (var1 >= 704602430) {
               throw new IllegalStateException();
            }

            var10000 = this.field6019;
         } else {
            var10000 = this.field6010[0].field6029;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lkr;")
   @ObfuscatedName("aa")
   public classKR method10571(int var1) {
      try {
         return this.field6021;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsp;Loi;I)V")
   @ObfuscatedName("ea")
   public static void method10567(classSP var0, classOI var1, int var2) {
      if (var0 == null) {
         var0.method10570(var1, var2);
      }

      try {
         var0.field6026 = var1;
         var0.field6012.field1689.field2029 = var1.method8474(-2078533940);
         var0.field6012.field1689.field2047 = var1.method8478((byte)-10);
         var0.method10595(var1.method8479((byte)-18), (byte)-48);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)Lkw;")
   @ObfuscatedName("ao")
   public classKW method10574(boolean var1, int var2) {
      try {
         if (var1) {
            if (var2 == -1640531527) {
               throw new IllegalStateException();
            } else {
               return classKW.field4043;
            }
         } else {
            return classOI.method8488(this.field6026, 2136997395);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   public void method10583(int var1, int var2) {
      try {
         this.field6013 = -1165953645 * var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;Z)V")
   @ObfuscatedName("sa")
   public static void method10555(classSP var0, boolean var1) {
      if (var0 == null) {
         var0.method10575(var1);
      }

      classQR var2 = var0.method10552(-873839240);
      classQR var3 = var2 != null ? var2 : var0.field6016;
      classUU.method11574(var0.field6012.field1689.field2028, -1327161563);
      if (null != var3 && var3.method9734(500216846) != -1 && var3.method9765((byte)-82) && var3.method9731((byte)110).method8768((byte)0)) {
         classSN var4 = var3.method9731((byte)88).method8781(140288715);
         classEF var5 = var4.field5983.method3924((byte)38);
         classSG var6 = var5.method3854(0, (byte)-1);
         if (var6 != null) {
            var5.method3865(var4, var3.method9738(1798412406), -1468766705);
            rl23.method10067(var0.field6012.field1689.field2028, classMN.method7625(var6, -1993724010), (byte)38);
            var0.field6012.field1689.field2028.field6399 = -var0.field6012.field1689.field2028.field6399;
         }
      }

      var0.field6012.field1689.field2027 = -1606618975 * var0.field6012.field1710;
      if (var1) {
         var0.field6012.field1689.field2030 = -1200;
         var0.field6012.field1689.field2055 = 0.01F;
         int var9 = classOI.method8497(var0.field6026, -1845887744);
         classFL var10 = var0.field6012.field1689.field2035;
         byte var11 = classGK.method5471(var9, -1961320422);
         byte var7 = classGK.method5472(var9, -1665176581);
         byte var8 = (byte)(var9 & -1033650383);
         classFL.method4832(var10, var11, var7, var8, (byte)127);
      } else {
         var0.field6012.field1689.field2030 = 0;
         var0.field6012.field1689.field2055 = 1.0F;
         classFL.method4836(var0.field6012.field1689.field2035);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lgy;")
   @ObfuscatedName("bk")
   public classGY method10564() {
      return -1956329391 * this.field6011 == 0 ? this.field6019 : this.field6010[0].field6029;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;I)Z")
   @ObfuscatedName("gp")
   public static boolean method10584(classSP var0, int var1) {
      if (var0 == null) {
         var0.method10589(var1);
      }

      return var1 >= 0 && var1 <= 4 ? 0 != (-763793253 * var0.field6013 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   public int method10589(int var1) {
      try {
         return this.field6012.field1696 * 1386308288 + this.field6026.method8474(-1991754207);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   public int method10590(int var1) {
      try {
         return this.field6012.field1692 * 377427776 + this.field6026.method8478((byte)-10);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ap")
   void method10595(int var1, byte var2) {
      try {
         classQR.method9722(this.field6016, var1, -2114326922);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;II)V")
   @ObfuscatedName("ij")
   public static void method10602(classSP var0, int var1, int var2) {
      if (var0 == null) {
         var0.method10557();
      }

      for (int var3 = 0; var3 < var0.field6010.length; var3++) {
         var0.field6010[var3].field6029.method5936(var1, var2, (byte)81);
      }

      var0.field6019.method5936(var1, var2, (byte)79);
      var0.field6014.vmethod573(var1, var2, -1959195373);
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("cz")
   public void method10611(classGY var1) {
      this.field6019.method5926(var1, -1957102677);
      this.field6010[0].field6029.method5926(var1, 1084681233);
      this.field6011 = 0;
      this.field6015 = false;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ai")
   public void method10603(int var1, int var2, int var3) {
      try {
         for (int var4 = 0; var4 < this.field6010.length; var4++) {
            if (var3 <= 797468011) {
               throw new IllegalStateException();
            }

            this.field6010[var4].field6029.method5936(var1, var2, (byte)117);
         }

         this.field6019.method5936(var1, var2, (byte)101);
         this.field6014.vmethod573(var1, var2, -1079091816);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "sp.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;B)V")
   @ObfuscatedName("aw")
   public void method10612(classGY var1, byte var2) {
      this.method10626(var1);

      try {
         this.field6019.method5926(var1, 578993763);
         this.field6010[0].field6029.method5926(var1, 919843294);
         this.field6011 = 0;
         this.field6015 = false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cj")
   public final void method10617(int var1) {
      if (-1956329391 * this.field6011 == 0) {
         this.method10612(this.field6010[0].field6029, (byte)-49);
      } else {
         if (!this.field6015) {
            this.field6014.vmethod568(this.field6019, this.field6010[0], var1, (byte)16);
            this.field6015 = true;
         }

         if (this.field6014.vmethod571(this.field6019, var1, this.field6011 * -1956329391, 1263072438)) {
            this.field6011 -= 1733918897;
            this.field6015 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Luz;")
   @ObfuscatedName("at")
   public classUZ method10620(int var1, int var2, byte var3) {
      try {
         classUG var4 = classMQ.method7640(-989125358);
         classUU var5 = classRM.method10129(1778071523);
         classUL var6 = var4.field6305;
         int var8 = this.field6019.method5920(1880969876);
         var8 &= 2047;
         float var7 = (float)((Math.PI * 2) * (var8 / 2048.0F));
         var6.method11373(var7, 0.0F, 0.0F, -608116520);
         var4.field6307.method11728(this.field6019.method5903(152053513), 0.0F, classGY.method5909(this.field6019, 1690676705), 1685737082);
         var1 -= this.method10589(-532164052);
         var2 -= this.method10590(1874950260);
         var5.method11642(var4, 1861666336);
         var4.method11306(-428825938);
         classUZ var9 = var5.method11618(var1, 0.0F, var2, 1746397518);
         var5.method11555(2033466195);
         return var9;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "sp.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Luz;")
   @ObfuscatedName("an")
   public classUZ method10621(int var1, int var2, byte var3) {
      try {
         classUG var4 = classMQ.method7640(-1532875664);
         classUU var5 = classRM.method10129(1778071523);
         classUL var6 = var4.field6305;
         int var8 = this.field6019.method5920(1777638888);
         var8 &= 2047;
         float var7 = (float)(var8 / 2048.0F * (Math.PI * 2));
         var6.method11373(var7, 0.0F, 0.0F, 2100974472);
         var4.field6307.method11728(this.field6019.method5903(277844038), 0.0F, classGY.method5909(this.field6019, 1690676705), 1713688340);
         var5.method11642(var4, 1204407126);
         var5.method11609(-1126922930);
         var4.method11306(-333835718);
         classUZ var9 = var5.method11618(var1, 0.0F, var2, 1969403077);
         var9.method11754(this.method10589(-1942590158), 0.0F, this.method10590(2088304455), -1062600558);
         var5.method11555(2093398077);
         return var9;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "sp.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsp;IB)Z")
   @ObfuscatedName("hg")
   public static boolean method10585(classSP var0, int var1, byte var2) {
      if (var0 == null) {
         return var0.method10588(var1, var2);
      } else {
         try {
            if (var1 >= 0) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               if (var1 <= 4) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  return 0 != (-763793253 * var0.field6013 & 1 << var1);
               }
            }

            return true;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "sp.ay(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;II)Luz;")
   @ObfuscatedName("gj")
   public static classUZ method10622(classSP var0, int var1, int var2) {
      if (var0 == null) {
         var0.vmethod368(var1);
      }

      classUG var3 = classMQ.method7640(1074089605);
      classUU var4 = classRM.method10129(1778071523);
      classUL var5 = var3.field6305;
      int var7 = var0.field6019.method5920(1987525348);
      var7 &= 2047;
      float var6 = (float)(var7 / 2048.0F * (Math.PI * 2));
      var5.method11373(var6, 0.0F, 0.0F, 1088633836);
      var3.field6307.method11728(var0.field6019.method5903(1494712558), 0.0F, classGY.method5909(var0.field6019, 1690676705), 2145348735);
      var4.method11642(var3, 1273531332);
      var4.method11609(44537014);
      var3.method11306(159225740);
      classUZ var8 = var4.method11618(var1, 0.0F, var2, 2115726596);
      var8.method11754(var0.method10589(-494658626), 0.0F, var0.method10590(2056199487), -1062600558);
      var4.method11555(1723780482);
      return var8;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   @Override
   public int vmethod259() {
      if (this.field6020 * -1427480299 != 0) {
         classDZ var1 = client.field814.method1590(-1427480299 * this.field6020, (short)-3992);
         if (var1 != null) {
            return var1.field1710 * -483624883;
         }
      }

      return classIS.field3053.field1710 * -483624883;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hq")
   @Override
   public int vmethod369() {
      return this.field6019.method5903(252711677);
   }

   @ObfuscatedSignature(descriptor = "(Lsp;Lkr;I)V")
   @ObfuscatedName("kn")
   public static void method10577(classSP var0, classKR var1, int var2) {
      if (var0 == null) {
         var0.method10582(var1, var2);
      }

      try {
         var0.field6021 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;III)V")
   @ObfuscatedName("ak")
   void method10616(classGY var1, int var2, int var3, int var4) {
      try {
         if (-1956329391 * this.field6011 < 9) {
            if (var4 == 1222866659) {
               return;
            }

            this.field6011 += 1733918897;
         }

         for (int var5 = -1956329391 * this.field6011; var5 > 0; var5--) {
            classSR var6 = this.field6010[var5];
            this.field6010[var5] = this.field6010[var5 - 1];
            this.field6010[var5 - 1] = var6;
         }

         this.field6010[0].field6029.method5926(var1, -167262994);
         this.field6010[0].field6030 = client.field855 * -1876258533;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "sp.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cl")
   void method10596(int var1) {
      classQR.method9722(this.field6016, var1, -2008790253);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bx")
   public void method10556(boolean var1) {
      classQR var2 = this.method10552(-873839240);
      classQR var3 = var2 != null ? var2 : this.field6016;
      classUU.method11574(this.field6012.field1689.field2028, -246549455);
      if (null != var3 && var3.method9734(500216846) != -1 && var3.method9765((byte)-108) && var3.method9731((byte)44).method8768((byte)0)) {
         classSN var4 = var3.method9731((byte)18).method8781(1643765412);
         classEF var5 = var4.field5983.method3924((byte)5);
         classSG var6 = var5.method3854(0, (byte)35);
         if (var6 != null) {
            var5.method3865(var4, var3.method9738(1914775810), -1468766705);
            rl23.method10067(this.field6012.field1689.field2028, classMN.method7625(var6, -2087567950), (byte)-91);
            this.field6012.field1689.field2028.field6399 = -this.field6012.field1689.field2028.field6399;
         }
      }

      this.field6012.field1689.field2027 = 2025563689 * this.field6012.field1710;
      if (var1) {
         this.field6012.field1689.field2030 = -1002495153;
         this.field6012.field1689.field2055 = 0.01F;
         int var9 = classOI.method8497(this.field6026, 1938294297);
         classFL var10 = this.field6012.field1689.field2035;
         byte var11 = classGK.method5471(var9, -1800368190);
         byte var7 = classGK.method5472(var9, -1665176581);
         byte var8 = (byte)(var9 & 905041216);
         classFL.method4832(var10, var11, var7, var8, (byte)-369898630);
      } else {
         this.field6012.field1689.field2030 = 0;
         this.field6012.field1689.field2055 = 1.0F;
         classFL.method4836(this.field6012.field1689.field2035);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   public int method10591() {
      return this.field6012.field1692 * 377427776 + this.field6026.method8478((byte)68);
   }

   @ObfuscatedSignature(descriptor = "(Lkr;)V")
   @ObfuscatedName("bl")
   public void method10578(classKR var1) {
      this.field6021 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Loi;")
   @ObfuscatedName("vr")
   public classOI method10629() {
      return this.field6026;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kh")
   @Override
   public int vmethod372() {
      return classGY.method5909(this.field6019, 1690676705);
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("qn")
   public classDZ method10630() {
      return this.field6012;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ky")
   @Override
   public int vmethod370() {
      return classGY.method5909(this.field6019, 1690676705);
   }

   @ObfuscatedSignature(descriptor = "(Lkr;)V")
   @ObfuscatedName("bs")
   public void method10579(classKR var1) {
      this.field6021 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("br")
   public int method10560() {
      return this.field6019.method5905(1204387032);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;I)V")
   @ObfuscatedName("rq")
   public static void method10618(classSP var0, int var1) {
      if (-1706960194 * var0.field6011 == 0) {
         var0.method10612(var0.field6010[0].field6029, (byte)-63);
      } else {
         if (!var0.field6015) {
            var0.field6014.vmethod568(var0.field6019, var0.field6010[0], var1, (byte)6);
            var0.field6015 = true;
         }

         if (var0.field6014.vmethod571(var0.field6019, var1, var0.field6011 * 1612343003, 2111579848)) {
            var0.field6011 -= 1733918897;
            var0.field6015 = false;
         }
      }
   }

   public boolean isHiddenForOverlap() {
      return this.method10558(1954640952);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("av")
   public final void method10628(int var1, int var2) {
   }

   @ObfuscatedSignature(descriptor = "(Loi;)V")
   @ObfuscatedName("bu")
   public void method10568(classOI var1) {
      this.field6026 = var1;
      this.field6012.field1689.field2029 = var1.method8474(-1652450642);
      this.field6012.field1689.field2047 = var1.method8478((byte)-88);
      this.method10595(var1.method8479((byte)-77), (byte)-30);
   }

   @ObfuscatedSignature(descriptor = "(Loi;)V")
   @ObfuscatedName("bo")
   public void method10569(classOI var1) {
      this.field6026 = var1;
      this.field6012.field1689.field2029 = var1.method8474(-1855780411);
      this.field6012.field1689.field2047 = var1.method8478((byte)-9);
      this.method10595(var1.method8479((byte)59), (byte)-85);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cr")
   public boolean method10586(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (-763793253 * this.field6013 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "()Lqr;")
   @ObfuscatedName("ah")
   classQR method10551() {
      return 0 == -1902770053 * this.field6018 && this.field6017.method9726(374233424) && this.field6017.method9731((byte)47).method8785((byte)-5)
         ? this.field6017
         : null;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lkw;")
   @ObfuscatedName("by")
   public classKW method10575(boolean var1) {
      return var1 ? classKW.field4043 : classOI.method8488(this.field6026, 1278077171);
   }

   @ObfuscatedSignature(descriptor = "(Z)Lkw;")
   @ObfuscatedName("bq")
   public classKW method10576(boolean var1) {
      return var1 ? classKW.field4043 : classOI.method8488(this.field6026, 40625837);
   }

   @ObfuscatedSignature(descriptor = "(Lkr;)V")
   @ObfuscatedName("bf")
   public void method10580(classKR var1) {
      this.field6021 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lqr;")
   @ObfuscatedName("af")
   classQR method10552(int var1) {
      try {
         if (0 == -1902770053 * this.field6018) {
            if (var1 != -873839240) {
               throw new IllegalStateException();
            }

            if (this.field6017.method9726(374233424)) {
               if (var1 != -873839240) {
                  throw new IllegalStateException();
               }

               if (this.field6017.method9731((byte)66).method8785((byte)115)) {
                  if (var1 != -873839240) {
                     throw new IllegalStateException();
                  }

                  return this.field6017;
               }
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ey")
   @Override
   public int vmethod368(int var1) {
      try {
         return this.field6019.method5903(766668145);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.ey(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Luz;")
   @ObfuscatedName("cm")
   public classUZ method10623(int var1, int var2) {
      classUG var3 = classMQ.method7640(366539406);
      classUU var4 = classRM.method10129(1778071523);
      classUL var5 = var3.field6305;
      int var7 = this.field6019.method5920(1629522068);
      var7 &= 2047;
      float var6 = (float)(var7 / 2048.0F * (Math.PI * 2));
      var5.method11373(var6, 0.0F, 0.0F, 96113479);
      var3.field6307.method11728(this.field6019.method5903(886335028), 0.0F, classGY.method5909(this.field6019, 1690676705), 2116555934);
      var4.method11642(var3, 1651017828);
      var4.method11609(154152551);
      var3.method11306(-584363827);
      classUZ var8 = var4.method11618(var1, 0.0F, var2, -288434109);
      var8.method11754(this.method10589(-2099053425), 0.0F, this.method10590(-288724597), -1062600558);
      var4.method11555(2111172299);
      return var8;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bz")
   public boolean method10587(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (-1720764155 * this.field6013 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ri")
   public void method10627() {
      client.field1035.add(this);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   public int method10592() {
      return this.field6012.field1692 * 377427776 + this.field6026.method8478((byte)-17);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   public int method10593() {
      return this.field6012.field1692 * -1414382856 + this.field6026.method8478((byte)23);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   public int method10594() {
      return this.field6012.field1692 * 377427776 + this.field6026.method8478((byte)-107);
   }

   public LocalPoint getTargetLocation() {
      return this.field6011 * -1956329391 > 0
         ? new LocalPoint(this.field6010[0].field6029.field2741 * -787916131, this.field6010[0].field6029.field2742 * -478154003, 0)
         : this.getLocalLocation();
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("au")
   public int method10598(byte var1) {
      try {
         return this.field6017.method9734(500216846);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sp.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bm")
   public int method10562() {
      return this.field6019.method5920(2070687641);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;II)V")
   @ObfuscatedName("gt")
   public static void method10604(classSP var0, int var1, int var2) {
      if (var0 == null) {
         var0.vmethod371(var1);
      }

      for (int var3 = 0; var3 < var0.field6010.length; var3++) {
         var0.field6010[var3].field6029.method5936(var1, var2, (byte)79);
      }

      var0.field6019.method5936(var1, var2, (byte)119);
      var0.field6014.vmethod573(var1, var2, -1419331369);
   }

   public classSP(int var1, classDZ var2) {
      this.method10627();
      this.field6019 = new classGY();
      this.field6009 = 0;
      this.field6010 = new classSR[10];
      this.field6011 = 0;
      this.field6020 = 0;
      this.field6021 = classKR.field4006;
      this.field6013 = -1784824627;
      this.field6014 = new classSC();
      this.field6015 = false;
      this.field6016 = new classQR();
      this.field6017 = new classQR();
      this.field6018 = 0;
      this.field6009 = -662280981 * var1;
      this.field6012 = var2;
      this.field6011 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         this.field6010[var3] = new classSR();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cv")
   public int method10599() {
      return this.field6017.method9734(500216846);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;I)V")
   @ObfuscatedName("yl")
   public static void method10619(classSP var0, int var1) {
      if (-1956329391 * var0.field6011 == 0) {
         var0.method10612(var0.field6010[0].field6029, (byte)-123);
      } else {
         if (!var0.field6015) {
            var0.field6014.vmethod568(var0.field6019, var0.field6010[0], var1, (byte)2);
            var0.field6015 = true;
         }

         if (var0.field6014.vmethod571(var0.field6019, var1, var0.field6011 * -1956329391, 752947192)) {
            var0.field6011 -= 1733918897;
            var0.field6015 = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ck")
   public void method10625(int var1) {
      if (this.field6011 * -1956329391 == 0) {
         this.method10633(this.field6010[0].field6029);
      } else {
         if (!this.field6015) {
            if (this.field6008) {
               this.field6014.vmethod576(this.field6019, var1 - 1, this.field6011 * -1956329391);
            }

            this.field6014.method10637(this.field6019, this.field6010[0], var1);
            this.field6015 = true;
         }

         if (this.field6014.vmethod576(this.field6019, var1 + classMG.field4500, this.field6011 * -1956329391)) {
            this.field6011 = (this.field6011 * -1956329391 - 1) * 1733918897;
            this.field6015 = false;
         }

         this.field6008 = true;
      }
   }

   public LocalPoint getCameraFocus() {
      return this.getLocalLocation();
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("gk")
   public void method10631(int var1, int var2) {
      this.method10603(var1, var2, 1658344131);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   public int method10600() {
      return this.field6017.method9734(500216846);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cy")
   public int method10601() {
      return this.field6017.method9734(500216846);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("co")
   public void method10605(int var1, int var2) {
      for (int var3 = 0; var3 < this.field6010.length; var3++) {
         this.field6010[var3].field6029.method5936(var1, var2, (byte)81);
      }

      this.field6019.method5936(var1, var2, (byte)113);
      this.field6014.vmethod573(var1, var2, -1520996730);
   }

   @ObfuscatedSignature(descriptor = "()Lkr;")
   @ObfuscatedName("ba")
   public classKR method10572() {
      return this.field6021;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cc")
   public void method10606(int var1, int var2) {
      for (int var3 = 0; var3 < this.field6010.length; var3++) {
         this.field6010[var3].field6029.method5936(var1, var2, (byte)79);
      }

      this.field6019.method5936(var1, var2, (byte)89);
      this.field6014.vmethod573(var1, var2, -1711046143);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lgy;)V")
   @ObfuscatedName("cn")
   public final void method10607(classDZ var1, classGY var2) {
      int var3 = var2.method5912(1261838927);
      int var4 = classGY.method5918(var2, (byte)-10);
      if (!var1.method3729(var3, var4, (byte)1)) {
         this.method10612(var2, (byte)-41);
      } else {
         int var5 = var2.method5903(2076805807) - this.field6010[0].field6029.method5903(1371718340);
         int var6 = classGY.method5909(var2, 1690676705) - classGY.method5909(this.field6010[0].field6029, 1690676705);
         this.method10616(var2, Math.abs(var5), Math.abs(var6), -959279101);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lgy;)V")
   @ObfuscatedName("cf")
   public final void method10608(classDZ var1, classGY var2) {
      int var3 = var2.method5912(-2119487929);
      int var4 = classGY.method5918(var2, (byte)24);
      if (!var1.method3729(var3, var4, (byte)1)) {
         this.method10612(var2, (byte)0);
      } else {
         int var5 = var2.method5903(1006591670) - this.field6010[0].field6029.method5903(613593174);
         int var6 = classGY.method5909(var2, 1690676705) - classGY.method5909(this.field6010[0].field6029, 1690676705);
         this.method10616(var2, Math.abs(var5), Math.abs(var6), -2068936468);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("ch")
   public void method10613(classGY var1) {
      this.field6019.method5926(var1, -457105262);
      this.field6010[0].field6029.method5926(var1, 1130706594);
      this.field6011 = 0;
      this.field6015 = false;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("cg")
   public void method10614(classGY var1) {
      this.field6019.method5926(var1, -730153298);
      this.field6010[0].field6029.method5926(var1, 1669841926);
      this.field6011 = 0;
      this.field6015 = false;
   }

   @ObfuscatedSignature(descriptor = "(Lsp;Ldz;Lgy;B)V")
   @ObfuscatedName("ji")
   public static void method10609(classSP var0, classDZ var1, classGY var2, byte var3) {
      if (var0 == null) {
         var0.method10610(var1, var2, var3);
      }

      try {
         int var4 = var2.method5912(-1063803863);
         int var5 = classGY.method5918(var2, (byte)-36);
         if (!var1.method3729(var4, var5, (byte)1)) {
            if (var3 != 0) {
               return;
            }

            var0.method10612(var2, (byte)-103);
         } else {
            int var6 = var2.method5903(856187210) - var0.field6010[0].field6029.method5903(23684708);
            int var7 = classGY.method5909(var2, 1690676705) - classGY.method5909(var0.field6010[0].field6029, 1690676705);
            var0.method10616(var2, Math.abs(var6), Math.abs(var7), 62620156);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "sp.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkr;)V")
   @ObfuscatedName("bd")
   public void method10581(classKR var1) {
      this.field6021 = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)Luz;")
   @ObfuscatedName("fu")
   public classUZ method10632(int var1, int var2) {
      return this.method10620(var1, var2, (byte)49);
   }

   @ObfuscatedSignature(descriptor = "()Lgy;")
   @ObfuscatedName("bt")
   public classGY method10565() {
      return -1956329391 * this.field6011 == 0 ? this.field6019 : this.field6010[0].field6029;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cd")
   void method10597(int var1) {
      classQR.method9722(this.field6016, var1, -2125854107);
   }

   public int getTargetOrientation() {
      return this.field6011 * -1956329391 > 0 ? this.field6010[0].field6029.field2744 * 1859166197 : this.getOrientation();
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.field6019.field2741 * -787916131, this.field6019.field2742 * -478154003, 0);
   }

   @ObfuscatedSignature(descriptor = "()Lqr;")
   @ObfuscatedName("bn")
   classQR method10553() {
      return 0 == -1902770053 * this.field6018 && this.field6017.method9726(374233424) && this.field6017.method9731((byte)16).method8785((byte)92)
         ? this.field6017
         : null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
   @ObfuscatedName("ar")
   static void method10624(String var0, String var1, String var2, byte var3) {
      try {
         classBF.field397 = var0;
         classBF.field398 = var1;
         classBF.field399 = var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "sp.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hg")
   @Override
   public int vmethod384() {
      return this.vmethod368(311606126);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("di")
   @Override
   public int vmethod385() {
      return this.vmethod371(-267974568);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;)Lgy;")
   @ObfuscatedName("jb")
   public static classGY method10566(classSP var0) {
      return 740420949 * var0.field6011 == 0 ? var0.field6019 : var0.field6010[0].field6029;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hr")
   @Override
   public int vmethod386() {
      return this.vmethod258((byte)-13);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("yq")
   @Override
   public float vmethod382() {
      return this.field6019.field2741 * -787916131;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("dq")
   public void method10626(classGY var1) {
      this.field6008 = false;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("ef")
   @Override
   public float vmethod383() {
      return this.field6019.field2742 * -478154003;
   }

   @ObfuscatedSignature(descriptor = "(Loi;I)V")
   @ObfuscatedName("ac")
   public void method10570(classOI var1, int var2) {
      try {
         this.field6026 = var1;
         this.field6012.field1689.field2147 = var1.method8502(-2078533940);
         this.field6012.field1689.field2144 = var1.method8478((byte)-10);
         this.method10595(var1.method8479((byte)-18), (byte)-48);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkr;I)V")
   @ObfuscatedName("al")
   public void method10582(classKR var1, int var2) {
      try {
         this.field6021 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("xe")
   public void method10633(classGY var1) {
      this.method10612(var1, (byte)-117);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Lgy;B)V")
   @ObfuscatedName("ar")
   public final void method10610(classDZ var1, classGY var2, byte var3) {
      try {
         int var4 = var2.method5916(-1063803863);
         int var5 = classGY.method5918(var2, (byte)-36);
         if (!var1.method3729(var4, var5, (byte)1)) {
            if (var3 != 0) {
               return;
            }

            this.method10612(var2, (byte)-103);
         } else {
            int var6 = var2.method5916(856187210) - this.field6010[0].field6029.method5920(23684708);
            int var7 = classGY.method5909(var2, 1690676705) - classGY.method5909(this.field6010[0].field6029, 1690676705);
            this.method10616(var2, Math.abs(var6), Math.abs(var7), 62620156);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "sp.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ay")
   public boolean method10588(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               return 0 != (-763793253 * this.field6013 & 1 << var1);
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "sp.ay(" + ')');
      }
   }
}
