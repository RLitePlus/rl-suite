import javax.annotation.Nullable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dy")
public class DynamicObject extends Renderable implements net.runelite.api.DynamicObject {
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field1683 = 54;
   @ObfuscatedName("af")
   final int field1678;
   @ObfuscatedName("dv")
   public boolean field1668;
   @ObfuscatedName("ag")
   final int field1677;
   @ObfuscatedName("xz")
   public int field1665 = -1;
   @ObfuscatedName("ab")
   final int field1670;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field1681 = 40;
   @ObfuscatedSignature(descriptor = "Lez;")
   @ObfuscatedName("dv")
   public Scene field1667;
   @ObfuscatedName("as")
   final int field1673;
   @ObfuscatedName("ax")
   final int field1674;
   @ObfuscatedName("qi")
   public int field1669;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("aa")
   final classQR field1671;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("ac")
   final classQR field1675;
   @ObfuscatedName("ao")
   int field1672;
   @ObfuscatedName("ae")
   final int field1666;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field1680 = 99;
   @ObfuscatedName("aq")
   static int field1679;
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("az")
   final WorldView field1676;
   @ObfuscatedName("ld")
   static byte[][] field1684;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field1682 = 32;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod97() {
      classOM var1 = classMU.method7729(this.field1678 * 1680132843, 1765271651);
      if (null != var1.field4930) {
         var1 = classOM.method8553(var1, 1772412596);
      }

      if (null == var1) {
         return false;
      } else if (this.field1671.method9726(374233424) && this.field1671.method9731((byte)39).method8749(this.field1671.method9738(1809600475), 1284412146)) {
         return true;
      } else if (this.field1675.method9726(374233424) && this.field1675.method9731((byte)111).method8749(this.field1675.method9738(2072772326), 1284412146)) {
         return true;
      } else {
         Model var2 = var1.method8594(this.field1666 * 480644337, -1904611005 * this.field1670, (int[][])null, 0, 0, 0, null, -1, -1135264680);
         return var2 != null && null != var2.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   protected final Model vmethod104(int var1) {
      if (!classOE.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         this.method3710();
         return this.method3713(rl21.field5728, this.field1671);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   public boolean method3709() {
      return this.field1671.field5599 == null;
   }

   public int getAnimFrame() {
      return this.field1671.field5602 * 292569817;
   }

   public int getAnimCycle() {
      return -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   @Override
   protected boolean vmethod95(int var1) {
      try {
         classOM var2 = classMU.method7729(this.field1678 * 1680132843, 1790166623);
         if (null != var2.field4930) {
            var2 = classOM.method8553(var2, -1407992321);
         }

         if (null == var2) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (this.field1671.method9726(374233424)) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               if (this.field1671.method9731((byte)74).method8749(this.field1671.method9738(1905034411), 1284412146)) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            if (this.field1675.method9726(374233424)) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               if (this.field1675.method9731((byte)53).method8749(this.field1675.method9738(1942594289), 1284412146)) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            Model var3 = var2.method8594(this.field1666 * 480644337, -1904611005 * this.field1670, (int[][])null, 0, 0, 0, null, -1, -1135264680);
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
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "dy.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("hu")
   public Model method3714() {
      return this.method3713(null, classQR.field5603);
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("iz")
   public Model method3715() {
      return this.field1671.field5599 != null ? null : this.method3713(null, this.field1671);
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod92() {
      classOM var1 = classMU.method7729(this.field1678 * 1680132843, 2028646052);
      if (null != var1.field4930) {
         var1 = classOM.method8553(var1, -815248374);
      }

      if (null == var1) {
         return null;
      } else {
         int var2;
         int var3;
         if (1 != -1904611005 * this.field1670 && 595445699 * this.field1670 != 3) {
            var2 = -582306509 * var1.field4944;
            var3 = var1.field4924 * 642445882;
         } else {
            var2 = var1.field4924 * 564213346;
            var3 = var1.field4944 * -582306509;
         }

         int var4 = (var2 >> 1) + 1026205107 * this.field1673;
         int var5 = 1772309092 * this.field1673 + (var2 + 1 >> 1);
         int var6 = -2058575863 * this.field1674 + (var3 >> 1);
         int var7 = (var3 + 1 >> 1) + -2058575863 * this.field1674;
         int[][] var8 = this.field1676.field1688[1159378693 * this.field1677];
         int var9 = var8[var4][var7] + var8[var5][var6] + var8[var4][var6] + var8[var5][var7] >> 2;
         int var10 = (1230521602 * this.field1673 << 7) + (var2 << 6);
         int var11 = (-2058575863 * this.field1674 << 7) + (var3 << 6);
         int var12 = client.field855 * 1612595797 - this.field1672 * 1216078950;
         this.field1672 = client.field855 * -474013645;
         classAT.field277.method286(this.field1676, var10, var11, false, -2144027360);
         int var13 = classRD.method9941(this.field1671, var12, classAT.field277, -2003029019);
         classAAX.method290(classAT.field277, 1718019056);
         if ((var13 & 1) != 0 && (var13 & 8) != 0) {
            classQR.method9720(this.field1671, 1298913438);
         }

         if (classQR.method9763(this.field1671, 30, -65318458)) {
            if (this.field1675.method9726(374233424)) {
               int var14 = classRD.method9941(this.field1675, var12, null, -926798770);
               if (0 != (var14 & 1) && (var14 & 8) != 0) {
                  classQR.method9720(this.field1675, -1829889297);
               }

               if (!classQR.method9763(this.field1675, 30, -2124200801)) {
                  return var1.method8594(
                     480644337 * this.field1666,
                     this.field1670 * -1904611005,
                     var8,
                     var10,
                     var9,
                     var11,
                     this.field1675.method9731((byte)108),
                     this.field1675.method9738(2083438286),
                     -1135264680
                  );
               }
            }

            return null;
         } else {
            return var1.method8594(
               this.field1666 * 480644337,
               this.field1670 * -1904611005,
               var8,
               var10,
               var9,
               var11,
               this.field1671.method9731((byte)34),
               this.field1671.method9738(1823620257),
               -1135264680
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   @Override
   protected int vmethod101() {
      classQR var1 = this.field1671;
      if (null == var1) {
         var1 = this.field1675;
      }

      if (null == var1) {
         return 0;
      } else {
         return var1.method9726(374233424) ? var1.method9731((byte)107).field5138 * -1989858266 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   @Override
   protected final Model vmethod93() {
      classOM var1 = classMU.method7729(this.field1678 * 918486231, 1726862138);
      if (null != var1.field4930) {
         var1 = classOM.method8553(var1, -725568927);
      }

      if (null == var1) {
         return null;
      } else {
         int var2;
         int var3;
         if (1 != -1904611005 * this.field1670 && 1232529933 * this.field1670 != 3) {
            var2 = -582306509 * var1.field4944;
            var3 = var1.field4924 * 383180666;
         } else {
            var2 = var1.field4924 * 1926398856;
            var3 = var1.field4944 * 1687510084;
         }

         int var4 = (var2 >> 1) + -712724519 * this.field1673;
         int var5 = -1826158038 * this.field1673 + (var2 + 1 >> 1);
         int var6 = -2058575863 * this.field1674 + (var3 >> 1);
         int var7 = (var3 + 1 >> 1) + -982825143 * this.field1674;
         int[][] var8 = this.field1676.field1688[1513770239 * this.field1677];
         int var9 = var8[var4][var7] + var8[var5][var6] + var8[var4][var6] + var8[var5][var7] >> 2;
         int var10 = (1026205107 * this.field1673 << 7) + (var2 << 6);
         int var11 = (-2058575863 * this.field1674 << 7) + (var3 << 6);
         int var12 = client.field855 * 1612595797 - this.field1672 * 1618438999;
         this.field1672 = client.field855 * -1037089410;
         classAT.field277.method286(this.field1676, var10, var11, false, 1418461139);
         int var13 = classRD.method9941(this.field1671, var12, classAT.field277, -870496540);
         classAAX.method290(classAT.field277, -1483083354);
         if ((var13 & 1) != 0 && (var13 & 8) != 0) {
            classQR.method9720(this.field1671, -927386427);
         }

         if (classQR.method9763(this.field1671, 30, -836391410)) {
            if (this.field1675.method9726(374233424)) {
               int var14 = classRD.method9941(this.field1675, var12, null, -1346755143);
               if (0 != (var14 & 1) && (var14 & 8) != 0) {
                  classQR.method9720(this.field1675, -114479556);
               }

               if (!classQR.method9763(this.field1675, 30, -1952796173)) {
                  return var1.method8594(
                     480644337 * this.field1666,
                     this.field1670 * -1904611005,
                     var8,
                     var10,
                     var9,
                     var11,
                     this.field1675.method9731((byte)117),
                     this.field1675.method9738(1893974363),
                     -1135264680
                  );
               }
            }

            return null;
         } else {
            return var1.method8594(
               this.field1666 * 497545433,
               this.field1670 * -2104311888,
               var8,
               var10,
               var9,
               var11,
               this.field1671.method9731((byte)40),
               this.field1671.method9738(2146529707),
               -1135264680
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("uy")
   public void method3706() {
      classOM var1 = classOM.method8603(this.field1678 * 1680132843);
      if (var1.field4930 != null) {
         if (var1.field4926 * 1087117325 != -1) {
            this.field1665 = client.method1771(var1.field4926 * 1087117325);
            this.field1669 = classLB.field4090[this.field1665];
         } else if (var1.field4962 * -1047341117 != -1) {
            this.field1665 = var1.field4962 * -1047341117;
            this.field1669 = classLB.field4090[this.field1665];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;)Lfx;")
   @ObfuscatedName("mh")
   public Model method3707(@Nullable rl21 param1) {
      return this.method3713(var1, this.field1671);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qx")
   public void method3710() {
      classOM var1 = classOM.method8603(this.field1678 * 1680132843);
      if (var1.field4930 != null) {
         var1 = this.method3712(var1);
      }

      if (var1 != null) {
         int var2;
         int var3;
         if (this.field1670 * -1904611005 != 1 && this.field1670 * -1904611005 != 3) {
            var2 = var1.field4944 * -582306509;
            var3 = var1.field4924 * 402876423;
         } else {
            var2 = var1.field4924 * 402876423;
            var3 = var1.field4944 * -582306509;
         }

         int var4 = (this.field1673 * 1026205107 << 7) + (var2 << 6);
         int var5 = (this.field1674 * -2058575863 << 7) + (var3 << 6);
         int var6 = client.field855 * 1612595797 - this.field1672 * 1618438999;
         this.field1672 = client.field855 * 1612595797 * 1780002919;
         classAT.field277.method295(this.field1676, var4, var5, false);
         int var7 = SequenceDefinition.method8800(this.field1671, var6, classAT.field277);
         classAT.field277.method296();
         if ((var7 & 1) != 0 && (var7 & 8) != 0) {
            this.field1671.method9783();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   @Override
   protected boolean vmethod96() {
      classOM var1 = classMU.method7729(this.field1678 * 1214763282, 1521515488);
      if (null != var1.field4930) {
         var1 = classOM.method8553(var1, -1725007026);
      }

      if (null == var1) {
         return false;
      } else if (this.field1671.method9726(374233424) && this.field1671.method9731((byte)63).method8749(this.field1671.method9738(1914883703), 1284412146)) {
         return true;
      } else if (this.field1675.method9726(374233424) && this.field1675.method9731((byte)49).method8749(this.field1675.method9738(2088283637), 1284412146)) {
         return true;
      } else {
         Model var2 = var1.method8594(this.field1666 * -500462189, 540706257 * this.field1670, (int[][])null, 0, 0, 0, null, -1, -1135264680);
         return var2 != null && null != var2.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   @Override
   protected boolean vmethod94() {
      classOM var1 = classMU.method7729(this.field1678 * 1680132843, 1243378607);
      if (null != var1.field4930) {
         var1 = classOM.method8553(var1, 427100777);
      }

      if (null == var1) {
         return false;
      } else if (this.field1671.method9726(374233424) && this.field1671.method9731((byte)89).method8749(this.field1671.method9738(1851262562), 1284412146)) {
         return true;
      } else if (this.field1675.method9726(374233424) && this.field1675.method9731((byte)25).method8749(this.field1675.method9738(2101440328), 1284412146)) {
         return true;
      } else {
         Model var2 = var1.method8594(this.field1666 * 1029319934, -1904611005 * this.field1670, (int[][])null, 0, 0, 0, null, -1, -1135264680);
         return var2 != null && null != var2.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   protected int vmethod98(int var1) {
      try {
         classQR var2 = this.field1671;
         if (null == var2) {
            if (var1 <= -1498749565) {
               throw new IllegalStateException();
            }

            var2 = this.field1675;
         }

         if (null == var2) {
            return 0;
         } else {
            return var2.method9726(374233424) ? var2.method9731((byte)88).field5138 * -687960895 : 0;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "dy.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod99() {
      classQR var1 = this.field1671;
      if (null == var1) {
         var1 = this.field1675;
      }

      if (null == var1) {
         return 0;
      } else {
         return var1.method9726(374233424) ? var1.method9731((byte)127).field5138 * -687960895 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lom;")
   @ObfuscatedName("wt")
   public classOM method3711() {
      classOM var1 = classOM.method8603(this.field1678 * 1680132843);
      if (var1.field4930 != null) {
         var1 = this.method3712(var1);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lou;")
   @ObfuscatedName("tx")
   public SequenceDefinition method3708() {
      return this.field1671.field5599;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   @Override
   protected int vmethod100() {
      classQR var1 = this.field1671;
      if (null == var1) {
         var1 = this.field1675;
      }

      if (null == var1) {
         return 0;
      } else {
         return var1.method9726(374233424) ? var1.method9731((byte)7).field5138 * -687960895 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   protected int vmethod103() {
      classQR var1 = this.field1671;
      if (null == var1) {
         var1 = this.field1675;
      }

      if (null == var1) {
         return 0;
      } else {
         return var1.method9726(374233424) ? var1.method9731((byte)93).field5138 * -687960895 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lom;)Lom;")
   @ObfuscatedName("gp")
   public classOM method3712(classOM var1) {
      if (this.field1665 == -1) {
         return null;
      } else {
         int var2 = -1;
         if (var1.field4926 * 1087117325 != -1) {
            var2 = client.method1739(var1.field4926 * 1087117325, this.field1669);
         } else if (var1.field4962 * -1047341117 != -1) {
            var2 = this.field1669;
         }

         int var3;
         if (var2 >= 0 && var2 < var1.field4930.length - 1) {
            var3 = var1.field4930[var2];
         } else {
            var3 = var1.field4930[var1.field4930.length - 1];
         }

         return var3 != -1 ? classOM.method8603(var3) : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Lqr;)Lfx;")
   @ObfuscatedName("xg")
   public Model method3713(@Nullable rl21 param1, classQR nullx) {
      classOM var3 = classOM.method8603(this.field1678 * 1680132843);
      if (var3.field4930 != null) {
         var3 = this.method3712(var3);
      }

      if (var3 == null) {
         return null;
      } else {
         int var4;
         int var5;
         if (this.field1670 * -1904611005 != 1 && this.field1670 * -1904611005 != 3) {
            var4 = var3.field4944 * -582306509;
            var5 = var3.field4924 * 402876423;
         } else {
            var4 = var3.field4924 * 402876423;
            var5 = var3.field4944 * -582306509;
         }

         int var6 = this.field1673 * 1026205107 + this.field1667.field2147;
         int var7 = this.field1674 * -2058575863 + this.field1667.field2147;
         int var8 = (var4 >> 1) + var6;
         int var9 = (var4 + 1 >> 1) + var6;
         int var10 = (var5 >> 1) + var7;
         int var11 = (var5 + 1 >> 1) + var7;
         int[][] var12 = this.field1667.field2060[this.field1677 * 1513770239];
         int var13 = var12[var8][var11] + var12[var8][var10] + var12[var9][var10] + var12[var9][var11] >> 2;
         int var14 = (var6 << 7) + (var4 << 6);
         int var15 = (var7 << 7) + (var5 << 6);
         int var16;
         if (client.field1116 != null && nullx.field5598 * 1684838611 != -1 && client.field1116.test(nullx.field5598 * 1684838611)) {
            var16 = -2147483648 | Math.max(nullx.field5604 * -1399668821 - 1, 0) << 16 | nullx.field5602 * 292569817;
         } else {
            var16 = nullx.field5602 * 292569817;
         }

         return var3.method8596(var1, this.field1666 * 480644337, this.field1670 * -1904611005, var12, var14, var13, var15, nullx.field5599, var16);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   protected int vmethod102() {
      classQR var1 = this.field1671;
      if (null == var1) {
         var1 = this.field1675;
      }

      if (null == var1) {
         return 0;
      } else {
         return var1.method9726(374233424) ? var1.method9731((byte)22).field5138 * -687960895 : 0;
      }
   }

   DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
      this.field1667 = var1.scene;
      if (var10 instanceof DynamicObject) {
         this.field1665 = ((DynamicObject)var10).field1665;
         this.field1669 = ((DynamicObject)var10).field1669;
      }

      this.field1676 = var1;
      this.field1678 = 1126337987 * var2;
      this.field1666 = -962894831 * var3;
      this.field1670 = -704371861 * var4;
      this.field1677 = 1436332799 * var5;
      this.field1673 = var6 * 884511099;
      this.field1674 = -437719495 * var7;
      this.field1671 = new classQR();
      this.field1675 = new classQR();
      if (var8 != -1) {
         classQR.method9722(this.field1671, var8, -2084590414);
         classQR.method9722(this.field1675, var8, -2138286862);
         SequenceDefinition var11 = this.field1671.method9731((byte)124);
         this.field1672 = -474013645 * client.field855 - 1780002919;
         if (var9 && 1665914959 * var11.field5134 != -1) {
            this.field1671.method9776((byte)0);
         }

         if (var10 instanceof DynamicObject) {
            DynamicObject var12 = (DynamicObject)var10;
            if (var12.field1671.method9734(500216846) == var8) {
               if (0 == 1697446663 * var11.field5122) {
                  classQR.method9716(this.field1671, var12.field1671, (byte)20);
                  this.field1672 = var12.field1672 * 1;
               }

               classQR.method9716(this.field1675, var12.field1675, (byte)-13);
            } else if (!var12.field1671.method9765((byte)-30)) {
               classQR.method9716(this.field1675, var12.field1675, (byte)87);
            } else {
               classQR.method9716(this.field1675, var12.field1671, (byte)40);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([JIII)V")
   @ObfuscatedName("bc")
   static void method3705(long[] var0, int var1, int var2, int var3) {
      try {
         while (var1 < var2) {
            if (var3 <= -117964552) {
               throw new IllegalStateException();
            }

            long var4 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var4;
            var1++;
            var2--;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "dy.bc(" + ')');
      }
   }
}
