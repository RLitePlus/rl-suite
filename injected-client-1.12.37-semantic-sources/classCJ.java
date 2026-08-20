import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cj")
public class classCJ extends Renderable {
   @ObfuscatedSignature(descriptor = "Lsw;")
   @ObfuscatedName("az")
   final classSW field751;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final float field761 = 1.0E-6F;
   @ObfuscatedName("ao")
   float field753;
   @ObfuscatedName("mw")
   static int field763;
   @ObfuscatedName("ag")
   float field748;
   @ObfuscatedName("as")
   int field749;
   @ObfuscatedName("ax")
   boolean field750;
   @ObfuscatedName("ac")
   float field759;
   @ObfuscatedName("aa")
   float field752;
   @ObfuscatedName("ae")
   float field754;
   @ObfuscatedName("al")
   int field760;
   @ObfuscatedName("aj")
   int field755;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("ay")
   final classQR field756;
   @ObfuscatedName("aq")
   final Object[] field757;
   @ObfuscatedName("ab")
   float field745;
   @ObfuscatedName("au")
   float field758;
   @ObfuscatedName("ai")
   boolean field747;
   @ObfuscatedSignature(descriptor = "Lss;")
   @ObfuscatedName("af")
   classSS field746 = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field762 = 48;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("ie")
   static classVP field764;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   int method1550() {
      return this.field751.field6093 * 43544377;
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   protected Model vmethod104(int var1) {
      try {
         if (classQR.method9763(this.field756, 30, -582512908)) {
            if (var1 <= -1767431455) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classOR var2 = classAI.method376(this.field751.field6082 * 1369348907, -1718133593);
            Model var3 = var2.method8724(this.field756.method9738(1752853829), 693671413);
            if (null == var3) {
               if (var1 <= -1767431455) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var3.method5144(-559488473 * this.field755);
               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cj.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcj;IIIILcl;)Luz;")
   @ObfuscatedName("cg")
   public static classUZ method1528(classCJ var0, int var1, int var2, int var3, int var4, classCL var5) {
      if (var0 == null) {
         var0.method1527(var5);
      }

      WorldView var6 = null;
      classUZ var7 = classHZ.method6135(16777216);
      if (var1 != 0) {
         Object var8;
         if (var1 > 0) {
            int var9 = var1 - 1;
            var6 = classHB.method5990(var9, var5, 1131901716);
            var8 = (Actor)var6.field1698.method13404(var9);
         } else {
            int var15 = -var1 - 1;
            var6 = classQB.method9434(var15, var5, 2072194295);
            var8 = var6.method3737(var15, (byte)1);
         }

         if (var8 != null) {
            classKY var16 = ((Actor)var8).method3162(var6, (short)14590);
            var7.field6427 = var16.field4055 * 1870919123;
            var7.field6426 = var16.field4056 * 819227381;
         }
      }

      if (classUZ.method11745(var7, (byte)-105)) {
         var6 = var5.method1596(var2, var4, -1149214928);
         int var14 = var2 - -1444178379 * var6.field1709;
         int var17 = var4 - -351145363 * var6.field1708;
         WorldEntity var10 = (WorldEntity)classCL.method1592(var5, 389165674).worldEntities.method13595(2140889407 * var6.field1699);
         if (var10 != null) {
            var7 = var10.method10620(classKY.method6612(var14, 522055809), classKY.method6612(var17, -121372430), (byte)-15);
         } else {
            var7 = classIK.method6218(classKY.method6612(var14, -104388000), 0.0F, classKY.method6612(var17, 667342968), (byte)47);
         }
      }

      int var18 = (int)var7.field6427;
      int var11 = (int)var7.field6426;
      int var12 = classKV.method6571(var6, var18, var11, var3, (byte)122);
      WorldEntity var13 = (WorldEntity)classIS.field3053.worldEntities.method13595(2140889407 * var6.field1699);
      if (var13 != null) {
         var12 += classKV.method6571(classIS.field3053, var13.vmethod368(311606126), var13.vmethod371(-807889591), var13.vmethod258((byte)-29), (byte)122);
      }

      var7.field6425 = var12;
      return var7;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   @Override
   protected boolean vmethod95(int var1) {
      try {
         if (!this.field756.method9726(374233424) || !this.field756.method9731((byte)20).method8749(this.field756.method9738(1772728062), 1284412146)) {
            classOR var2 = classAI.method376(this.field751.field6082 * 1369348907, -2026512425);
            Model var3 = var2.method8726(-1330005868);
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
         } else if (var1 == -702405562) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cj.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   protected int vmethod98(int var1) {
      try {
         int var10000;
         if (this.field756.method9726(374233424)) {
            if (var1 <= -1498749565) {
               throw new IllegalStateException();
            }

            var10000 = this.field756.method9731((byte)1).field5138 * -687960895;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcj;)I")
   @ObfuscatedName("jz")
   public static int method1551(classCJ var0) {
      return var0.field751.field6093 * 43544377;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;I)V")
   @ObfuscatedName("af")
   void method1524(classCL var1, int var2) {
      try {
         classUZ var3 = this.method1529(
            -819116007 * this.field751.field6091,
            -212202065 * this.field751.field6083,
            264070925 * this.field751.field6076,
            this.field751.field6087 * -178421715,
            var1,
            150623303
         );
         var3.field6427 = var3.field6427 + 870654719 * this.field751.field6075;
         var3.field6425 = var3.field6425 - -656889031 * this.field751.field6092;
         var3.field6426 = var3.field6426 + this.field751.field6085 * 645704545;
         this.field759 = this.field754 = var3.field6427;
         this.field752 = this.field745 = var3.field6425;
         this.field753 = this.field748 = var3.field6426;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cj.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILcl;I)Luz;")
   @ObfuscatedName("as")
   classUZ method1529(int var1, int var2, int var3, int var4, classCL var5, int var6) {
      try {
         WorldView var7 = null;
         classUZ var8 = classHZ.method6135(16777216);
         if (var1 != 0) {
            if (var6 <= -620999211) {
               throw new IllegalStateException();
            }

            Object var9;
            if (var1 > 0) {
               if (var6 <= -620999211) {
                  throw new IllegalStateException();
               }

               int var10 = var1 - 1;
               var7 = classHB.method5990(var10, var5, -1880563498);
               var9 = (Actor)var7.field1698.method13404(var10);
            } else {
               int var17 = -var1 - 1;
               var7 = classQB.method9434(var17, var5, -481029454);
               var9 = var7.method3737(var17, (byte)1);
            }

            if (var9 != null) {
               if (var6 <= -620999211) {
                  throw new IllegalStateException();
               }

               classKY var18 = ((Actor)var9).method3162(var7, (short)22956);
               var8.field6427 = var18.field4055 * 1870919123;
               var8.field6426 = var18.field4056 * 819227381;
            }
         }

         if (classUZ.method11745(var8, (byte)-74)) {
            var7 = var5.method1596(var2, var4, -1524972910);
            int var16 = var2 - -1444178379 * var7.field1709;
            int var19 = var4 - -351145363 * var7.field1708;
            WorldEntity var11 = (WorldEntity)classCL.method1592(var5, -511366864).worldEntities.method13595(2140889407 * var7.field1699);
            if (var11 != null) {
               if (var6 <= -620999211) {
                  throw new IllegalStateException();
               }

               var8 = var11.method10620(classKY.method6612(var16, 1833314124), classKY.method6612(var19, 1377715964), (byte)40);
            } else {
               var8 = classIK.method6218(classKY.method6612(var16, -572404848), 0.0F, classKY.method6612(var19, -1665325163), (byte)-14);
            }
         }

         int var20 = (int)var8.field6427;
         int var12 = (int)var8.field6426;
         int var13 = classKV.method6571(var7, var20, var12, var3, (byte)122);
         WorldEntity var14 = (WorldEntity)classIS.field3053.worldEntities.method13595(2140889407 * var7.field1699);
         if (var14 != null) {
            if (var6 <= -620999211) {
               throw new IllegalStateException();
            }

            var13 += classKV.method6571(classIS.field3053, var14.vmethod368(311606126), var14.vmethod371(-804507138), var14.vmethod258((byte)-5), (byte)122);
         }

         var8.field6425 = var13;
         return var8;
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "cj.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;IIB)V")
   @ObfuscatedName("ax")
   void method1531(classCL var1, int var2, int var3, byte var4) {
      try {
         if (2092693847 * this.field749 > 0) {
            if (var4 != 8) {
               if (this.field749 * 2092693847 - var2 > 0) {
                  this.field751.field6093 += var3 * 928894729;
                  this.field751.field6079 += var3 * -1585926007;
               } else {
                  this.field749 = 0;
                  if (this.field750) {
                     if (var4 == 8) {
                        throw new IllegalStateException();
                     }

                     this.field751.field6079 = 0;
                  }
               }
            }
         } else {
            classUZ var5 = this.method1529(
               this.field751.field6086 * -1669737097,
               2055754807 * this.field751.field6088,
               this.field751.field6077 * 1668309685,
               this.field751.field6084 * 1850322099,
               var1,
               1699319227
            );
            var5.field6427 = var5.field6427 + -23682121 * this.field751.field6074;
            var5.field6425 = var5.field6425 - 1315550293 * this.field751.field6090;
            var5.field6426 = var5.field6426 + -1486956067 * this.field751.field6080;
            int var6 = this.field751.field6079 * -826817095 - 43544377 * this.field751.field6093;
            float var7 = (float)(var2 - this.field751.field6093 * 43544377) / var6;
            float var8 = this.method1542(var7, 1523443443);
            int var9 = Math.round(var8 * 65536.0F);
            float var10 = this.method1533(this.field751.field6089 * -853437357, var9, (byte)2);
            float var11 = this.method1533(this.field751.field6078 * -1088443213, var9, (byte)2);
            float var12 = this.method1533(this.field751.field6081 * -342173729, var9, (byte)2);
            classUZ var13 = classIK.method6218(this.field754, this.field745, this.field748, (byte)9);
            classUZ var14 = classWN.method12606(var5, var13, (byte)1);
            float var15 = var14.method11774(-1808401369);
            var14.method11747(806863921);
            classUZ var16 = classIZ.method6340(classUZ.field6432, var14, 1067363234);
            if (var16.method11774(-1808401369) < 1.0E-6F) {
               var16 = classIZ.method6340(classUZ.field6434, var14, -447838269);
            }

            var16.method11747(27671172);
            classUZ var17 = classIZ.method6340(var14, var16, 2097297857);
            var17.method11747(-1302149521);
            classUZ var18 = classIK.method6218(0.0F, 0.0F, 0.0F, (byte)-75);
            var18.method11757(var16, var10 * 128.0F, (byte)44);
            var18.method11757(var17, var11 * 128.0F, (byte)-75);
            var18.method11757(var14, var15 * var12, (byte)-37);
            var18.method11753(var13, -1017519437);
            classUZ var19 = classIK.method6218(this.field759, this.field752, this.field753, (byte)-45);
            this.field759 = var18.field6427;
            this.field752 = var18.field6425;
            this.field753 = var18.field6426;
            float var20 = this.field759 - var19.field6427;
            float var21 = this.field752 - var19.field6425;
            float var22 = this.field753 - var19.field6426;
            float var23 = (float)Math.sqrt(var22 * var22 + var20 * var20);
            if (var23 > 0.0) {
               this.field760 = ((int)(Math.atan2(var20, var22) * 325.9493F) + 1024 & 2047) * 802136627;
               this.field755 = ((int)(Math.atan2(var21, var23) * 325.9493F) & 2047) * -1840616041;
            }

            classAT.field277.method286(classIS.field3053, (int)this.field759, (int)this.field753, false, -1166926534);
            classRD.method9941(this.field756, var3, classAT.field277, -1355366987);
            classAAX.method290(classAT.field277, -314926901);
            this.method1543(var7, (byte)8);
            classUZ.method11727(var16, 1731791938);
            classUZ.method11727(var17, 2094073456);
            classUZ.method11727(var18, 2063958900);
            classUZ.method11727(var19, 1908396922);
            classUZ.method11727(var14, 2030111515);
            classUZ.method11727(var13, 1815549213);
            classUZ.method11727(var5, 1844890691);
         }
      } catch (RuntimeException var24) {
         throw classEG.method3884(var24, "cj.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)F")
   @ObfuscatedName("ac")
   float method1533(int var1, int var2, byte var3) {
      try {
         this.field757[0] = var1;
         this.field757[1] = var2;
         ScriptEvent var4 = classZS.method14182(classCA.method1392(86, -1915095011).method14145(this.field757, (byte)2), (byte)76);
         classSZ.method10729(var4, -1175922600);
         int var5 = classBB.field323[0];
         return var5 / 65536.0F;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "cj.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod99() {
      return this.field756.method9726(374233424) ? this.field756.method9731((byte)41).field5138 * -152042183 : 0;
   }

   @ObfuscatedSignature(descriptor = "(FB)V")
   @ObfuscatedName("ao")
   void method1543(float var1, byte var2) {
      try {
         if (null != this.field746) {
            this.field754 = this.field759;
            this.field745 = this.field752;
            this.field748 = this.field753;
            this.field758 = var1;
            this.field747 = true;
            this.field751.field6088 = 55373099 * this.field746.field6038;
            this.field751.field6077 = 1435548701 * this.field746.field6034;
            this.field751.field6084 = this.field746.field6033 * 1047513907;
            this.field751.field6074 = this.field746.field6032 * -1473560751;
            this.field751.field6090 = -817499283 * this.field746.field6035;
            this.field751.field6080 = this.field746.field6036 * 4884061;
            this.field751.field6086 = this.field746.field6037 * -13412519;
            this.field746 = null;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cj.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("al")
   void method1548(int var1, int var2, int var3) {
      try {
         this.field751.field6083 += var1 * 691497295;
         this.field751.field6087 += -1216819291 * var2;
         this.field751.field6088 += 1535353223 * var1;
         this.field751.field6084 += var2 * 21815931;
         this.field759 = this.field759 + classKY.method6605(var1, 377757096);
         this.field753 = this.field753 + classKY.method6605(var2, -213377151);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cj.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ay")
   int method1557(short var1) {
      try {
         return -826817095 * this.field751.field6079;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   int method1552() {
      return this.field751.field6093 * 43544377;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   int method1562(int var1) {
      try {
         return (int)this.field759;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.am(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aj")
   int method1564(byte var1) {
      try {
         return (int)this.field752;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aq")
   int method1568(byte var1) {
      try {
         return (int)this.field753;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.bn(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ah")
   int method1570(byte var1) {
      try {
         return this.field760 * -845403909;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.bx(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcj;Lss;IZ)V")
   @ObfuscatedName("cq")
   public static void method1520(classCJ var0, classSS var1, int var2, boolean var3) {
      if (var0 == null) {
         var0.method1538(var2, var2);
      }

      if (-1 != -640123209 * var1.field6038) {
         var0.field746 = var1;
      }

      if (-1 != var2) {
         var0.field749 = var2 * -28000336;
         var0.field750 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   @Override
   protected Model vmethod92() {
      if (classQR.method9763(this.field756, 30, -358027484)) {
         return null;
      } else {
         classOR var1 = classAI.method376(this.field751.field6082 * 1369348907, -1885745249);
         Model var2 = var1.method8724(this.field756.method9738(2070897939), 2115114581);
         if (null == var2) {
            return null;
         } else {
            var2.method5144(-559488473 * this.field755);
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   @Override
   protected Model vmethod93() {
      if (classQR.method9763(this.field756, 30, -1665523617)) {
         return null;
      } else {
         classOR var1 = classAI.method376(this.field751.field6082 * 1369348907, -1635472111);
         Model var2 = var1.method8724(this.field756.method9738(1685883776), 986120572);
         if (null == var2) {
            return null;
         } else {
            var2.method5144(2031021872 * this.field755);
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("bs")
   void method1544(float var1) {
      if (null != this.field746) {
         this.field754 = this.field759;
         this.field745 = this.field752;
         this.field748 = this.field753;
         this.field758 = var1;
         this.field747 = true;
         this.field751.field6088 = 55373099 * this.field746.field6038;
         this.field751.field6077 = 349251615 * this.field746.field6034;
         this.field751.field6084 = this.field746.field6033 * 1047513907;
         this.field751.field6074 = this.field746.field6032 * -1473560751;
         this.field751.field6090 = -1828429676 * this.field746.field6035;
         this.field751.field6080 = this.field746.field6036 * -1613231876;
         this.field751.field6086 = this.field746.field6037 * -13412519;
         this.field746 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   @Override
   protected boolean vmethod94() {
      if (this.field756.method9726(374233424) && this.field756.method9731((byte)117).method8749(this.field756.method9738(1842855393), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(this.field751.field6082 * -199475691, -1350307581);
         Model var2 = var1.method8726(-1288479329);
         return var2 != null && null != var2.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod97() {
      if (this.field756.method9726(374233424) && this.field756.method9731((byte)121).method8749(this.field756.method9738(1794646517), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(this.field751.field6082 * 248927602, -1720318771);
         Model var2 = var1.method8726(635083275);
         return var2 != null && null != var2.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   int method1553() {
      return this.field751.field6093 * -1099425379;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   @Override
   protected int vmethod100() {
      return this.field756.method9726(374233424) ? this.field756.method9731((byte)75).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   @Override
   protected int vmethod101() {
      return this.field756.method9726(374233424) ? this.field756.method9731((byte)38).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   protected int vmethod102() {
      return this.field756.method9726(374233424) ? this.field756.method9731((byte)121).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   int method1558() {
      return -826817095 * this.field751.field6079;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laae;)Ljava/lang/String;")
   @ObfuscatedName("do")
   public static String method1519(classAAE var0) {
      return var0.field41;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("kv")
   public void method1574(int var1, int var2) {
      this.method1548(var1, var2, -1092366021);
   }

   @ObfuscatedSignature(descriptor = "(Lss;IZ)V")
   @ObfuscatedName("bc")
   void method1521(classSS var1, int var2, boolean var3) {
      if (-1 != -1542389725 * var1.field6038) {
         this.field746 = var1;
      }

      if (-1 != var2) {
         this.field749 = var2 * -1520181269;
         this.field750 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lss;IZ)V")
   @ObfuscatedName("br")
   void method1522(classSS var1, int var2, boolean var3) {
      if (-1 != 1882263613 * var1.field6038) {
         this.field746 = var1;
      }

      if (-1 != var2) {
         this.field749 = var2 * 1802764903;
         this.field750 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;)V")
   @ObfuscatedName("bm")
   void method1525(classCL var1) {
      classUZ var2 = this.method1529(
         -819116007 * this.field751.field6091,
         -212202065 * this.field751.field6083,
         1395929055 * this.field751.field6076,
         this.field751.field6087 * -178421715,
         var1,
         2104982356
      );
      var2.field6427 = var2.field6427 + 870654719 * this.field751.field6075;
      var2.field6425 = var2.field6425 - 1302688881 * this.field751.field6092;
      var2.field6426 = var2.field6426 + this.field751.field6085 * 645704545;
      this.field759 = this.field754 = var2.field6427;
      this.field752 = this.field745 = var2.field6425;
      this.field753 = this.field748 = var2.field6426;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;)V")
   @ObfuscatedName("bt")
   void method1526(classCL var1) {
      classUZ var2 = this.method1529(
         -1159045401 * this.field751.field6091,
         -212202065 * this.field751.field6083,
         112069096 * this.field751.field6076,
         this.field751.field6087 * -178421715,
         var1,
         -77101865
      );
      var2.field6427 = var2.field6427 + 870654719 * this.field751.field6075;
      var2.field6425 = var2.field6425 - 59218765 * this.field751.field6092;
      var2.field6426 = var2.field6426 + this.field751.field6085 * 645704545;
      this.field759 = this.field754 = var2.field6427;
      this.field752 = this.field745 = var2.field6425;
      this.field753 = this.field748 = var2.field6426;
   }

   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("bf")
   float method1539(float var1) {
      if (!this.field747) {
         return var1;
      } else {
         float var2 = 1.0F - this.field758;
         if (var2 <= 1.0E-6F) {
            return 1.0F;
         } else {
            float var3 = (var1 - this.field758) / var2;
            if (var3 < 0.0F) {
               return 0.0F;
            } else {
               return var3 > 1.0F ? 1.0F : var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcj;B)I")
   @ObfuscatedName("st")
   public static int method1554(classCJ var0, byte var1) {
      if (var0 == null) {
         var0.method1555(var1);
      }

      try {
         return var0.field751.field6093 * 43544377;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cq")
   int method1559() {
      return -826817095 * this.field751.field6079;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;II)V")
   @ObfuscatedName("bu")
   void method1532(classCL var1, int var2, int var3) {
      if (2092693847 * this.field749 > 0) {
         if (this.field749 * -821737551 - var2 > 0) {
            this.field751.field6093 += var3 * 234658007;
            this.field751.field6079 += var3 * -1227079592;
         } else {
            this.field749 = 0;
            if (this.field750) {
               this.field751.field6079 = 0;
            }
         }
      } else {
         classUZ var4 = this.method1529(
            this.field751.field6086 * 1975245927,
            -463394519 * this.field751.field6088,
            this.field751.field6077 * 1161561653,
            this.field751.field6084 * 1850322099,
            var1,
            1770443196
         );
         var4.field6427 = var4.field6427 + 2143977367 * this.field751.field6074;
         var4.field6425 = var4.field6425 - -329087273 * this.field751.field6090;
         var4.field6426 = var4.field6426 + -1526034810 * this.field751.field6080;
         int var5 = this.field751.field6079 * 1641677243 - -1239308437 * this.field751.field6093;
         float var6 = (float)(var2 - this.field751.field6093 * -70570036) / var5;
         float var7 = this.method1542(var6, -834699808);
         int var8 = Math.round(var7 * 65536.0F);
         float var9 = this.method1533(this.field751.field6089 * 1331129832, var8, (byte)2);
         float var10 = this.method1533(this.field751.field6078 * -1088443213, var8, (byte)2);
         float var11 = this.method1533(this.field751.field6081 * -342173729, var8, (byte)2);
         classUZ var12 = classIK.method6218(this.field754, this.field745, this.field748, (byte)10);
         classUZ var13 = classWN.method12606(var4, var12, (byte)1);
         float var14 = var13.method11774(-1808401369);
         var13.method11747(1420099219);
         classUZ var15 = classIZ.method6340(classUZ.field6432, var13, 1997397725);
         if (var15.method11774(-1808401369) < 1.0E-6F) {
            var15 = classIZ.method6340(classUZ.field6434, var13, 1146340125);
         }

         var15.method11747(2138284508);
         classUZ var16 = classIZ.method6340(var13, var15, 678495323);
         var16.method11747(1499855215);
         classUZ var17 = classIK.method6218(0.0F, 0.0F, 0.0F, (byte)-95);
         var17.method11757(var15, var9 * 128.0F, (byte)70);
         var17.method11757(var16, var10 * 128.0F, (byte)-6);
         var17.method11757(var13, var14 * var11, (byte)63);
         var17.method11753(var12, -372877673);
         classUZ var18 = classIK.method6218(this.field759, this.field752, this.field753, (byte)39);
         this.field759 = var17.field6427;
         this.field752 = var17.field6425;
         this.field753 = var17.field6426;
         float var19 = this.field759 - var18.field6427;
         float var20 = this.field752 - var18.field6425;
         float var21 = this.field753 - var18.field6426;
         float var22 = (float)Math.sqrt(var21 * var21 + var19 * var19);
         if (var22 > 0.0) {
            this.field760 = ((int)(Math.atan2(var19, var21) * 325.9493F) + 1024 & 2047) * 802136627;
            this.field755 = ((int)(Math.atan2(var20, var22) * 325.9493F) & 2047) * -1840616041;
         }

         classAT.field277.method286(classIS.field3053, (int)this.field759, (int)this.field753, false, -1677535013);
         classRD.method9941(this.field756, var3, classAT.field277, -1553684687);
         classAAX.method290(classAT.field277, 226196260);
         this.method1543(var6, (byte)8);
         classUZ.method11727(var15, 1714304823);
         classUZ.method11727(var16, 1918825869);
         classUZ.method11727(var17, 1885310858);
         classUZ.method11727(var18, 1826379117);
         classUZ.method11727(var13, 2053377248);
         classUZ.method11727(var12, 1801046381);
         classUZ.method11727(var4, 1811016548);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("bw")
   float method1534(int var1, int var2) {
      this.field757[0] = var1;
      this.field757[1] = var2;
      ScriptEvent var3 = classZS.method14182(classCA.method1392(86, -1211743857).method14145(this.field757, (byte)2), (byte)17);
      classSZ.method10729(var3, -148148357);
      int var4 = classBB.field323[0];
      return var4 / 65536.0F;
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("bb")
   float method1535(int var1, int var2) {
      this.field757[0] = var1;
      this.field757[1] = var2;
      ScriptEvent var3 = classZS.method14182(classCA.method1392(86, -1318195149).method14145(this.field757, (byte)2), (byte)8);
      classSZ.method10729(var3, -1658721213);
      int var4 = classBB.field323[0];
      return var4 / 65536.0F;
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("bi")
   float method1536(int var1, int var2) {
      this.field757[0] = var1;
      this.field757[1] = var2;
      ScriptEvent var3 = classZS.method14182(classCA.method1392(1347938593, -1827146925).method14145(this.field757, (byte)2), (byte)72);
      classSZ.method10729(var3, -989446825);
      int var4 = classBB.field323[0];
      return var4 / 65536.0F;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bx")
   int method1561(byte var1) {
      try {
         return this.field751.field6076 * 264070925;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.aq(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcj;II)F")
   @ObfuscatedName("tm")
   public static float method1537(classCJ var0, int var1, int var2) {
      var0.field757[0] = var1;
      var0.field757[1] = var2;
      ScriptEvent var3 = classZS.method14182(classCA.method1392(86, -1128929206).method14145(var0.field757, (byte)2), (byte)94);
      classSZ.method10729(var3, -957583011);
      int var4 = classBB.field323[0];
      return var4 / 65536.0F;
   }

   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("bq")
   float method1540(float var1) {
      if (!this.field747) {
         return var1;
      } else {
         float var2 = 1.0F - this.field758;
         if (var2 <= 1.0E-6F) {
            return 1.0F;
         } else {
            float var3 = (var1 - this.field758) / var2;
            if (var3 < 0.0F) {
               return 0.0F;
            } else {
               return var3 > 1.0F ? 1.0F : var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("ar")
   public static boolean method1573(char var0, int var1) {
      try {
         if (var0 >= ' ') {
            if (var1 >= -1527999514) {
               throw new IllegalStateException();
            }

            if (var0 <= '~') {
               if (var1 >= -1527999514) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var0 >= 160) {
            if (var1 >= -1527999514) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 >= -1527999514) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (8364 != var0) {
            if (var1 >= -1527999514) {
               throw new IllegalStateException();
            }

            if (338 != var0) {
               if (var1 >= -1527999514) {
                  throw new IllegalStateException();
               }

               if (8212 != var0) {
                  if (var1 >= -1527999514) {
                     throw new IllegalStateException();
                  }

                  if (339 != var0) {
                     if (var1 >= -1527999514) {
                        throw new IllegalStateException();
                     }

                     if (var0 != 376) {
                        return false;
                     }

                     if (var1 >= -1527999514) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("by")
   float method1541(float var1) {
      if (!this.field747) {
         return var1;
      } else {
         float var2 = 1.0F - this.field758;
         if (var2 <= 1.0E-6F) {
            return 1.0F;
         } else {
            float var3 = (var1 - this.field758) / var2;
            if (var3 < 0.0F) {
               return 0.0F;
            } else {
               return var3 > 1.0F ? 1.0F : var3;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;)V")
   @ObfuscatedName("bj")
   void method1527(classCL var1) {
      classUZ var2 = this.method1529(
         -819116007 * this.field751.field6091,
         -212202065 * this.field751.field6083,
         264070925 * this.field751.field6076,
         this.field751.field6087 * -178421715,
         var1,
         -587131224
      );
      var2.field6427 = var2.field6427 + 870654719 * this.field751.field6075;
      var2.field6425 = var2.field6425 - -656889031 * this.field751.field6092;
      var2.field6426 = var2.field6426 + this.field751.field6085 * 645704545;
      this.field759 = this.field754 = var2.field6427;
      this.field752 = this.field745 = var2.field6425;
      this.field753 = this.field748 = var2.field6426;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   protected int vmethod103() {
      return this.field756.method9726(374233424) ? this.field756.method9731((byte)37).field5138 * -687960895 : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcj;F)V")
   @ObfuscatedName("qv")
   public static void method1545(classCJ var0, float var1) {
      if (null != var0.field746) {
         var0.field754 = var0.field759;
         var0.field745 = var0.field752;
         var0.field748 = var0.field753;
         var0.field758 = var1;
         var0.field747 = true;
         var0.field751.field6088 = 1214257159 * var0.field746.field6038;
         var0.field751.field6077 = 1897102753 * var0.field746.field6034;
         var0.field751.field6084 = var0.field746.field6033 * 524830703;
         var0.field751.field6074 = var0.field746.field6032 * 785049232;
         var0.field751.field6090 = -2084908326 * var0.field746.field6035;
         var0.field751.field6080 = var0.field746.field6036 * 4884061;
         var0.field751.field6086 = var0.field746.field6037 * -2141744883;
         var0.field746 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("bl")
   void method1546(float var1) {
      if (null != this.field746) {
         this.field754 = this.field759;
         this.field745 = this.field752;
         this.field748 = this.field753;
         this.field758 = var1;
         this.field747 = true;
         this.field751.field6088 = 55373099 * this.field746.field6038;
         this.field751.field6077 = 1435548701 * this.field746.field6034;
         this.field751.field6084 = this.field746.field6033 * 1047513907;
         this.field751.field6074 = this.field746.field6032 * -1473560751;
         this.field751.field6090 = -817499283 * this.field746.field6035;
         this.field751.field6080 = this.field746.field6036 * 4884061;
         this.field751.field6086 = this.field746.field6037 * -13412519;
         this.field746 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("bv")
   void method1547(float var1) {
      if (null != this.field746) {
         this.field754 = this.field759;
         this.field745 = this.field752;
         this.field748 = this.field753;
         this.field758 = var1;
         this.field747 = true;
         this.field751.field6088 = -1970619257 * this.field746.field6038;
         this.field751.field6077 = -1627432381 * this.field746.field6034;
         this.field751.field6084 = this.field746.field6033 * 2049477672;
         this.field751.field6074 = this.field746.field6032 * 2013515665;
         this.field751.field6090 = -596988233 * this.field746.field6035;
         this.field751.field6080 = this.field746.field6036 * -109089395;
         this.field751.field6086 = this.field746.field6037 * -13412519;
         this.field746 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bh")
   void method1549(int var1, int var2) {
      this.field751.field6083 += var1 * -28627362;
      this.field751.field6087 += -260670610 * var2;
      this.field751.field6088 += -292314493 * var1;
      this.field751.field6084 += var2 * 21815931;
      this.field759 = this.field759 + classKY.method6605(var1, 1815169363);
      this.field753 = this.field753 + classKY.method6605(var2, 463866929);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cy")
   int method1565() {
      return (int)this.field752;
   }

   @ObfuscatedSignature(descriptor = "(Lss;IZI)V")
   @ObfuscatedName("az")
   void method1523(classSS var1, int var2, boolean var3, int var4) {
      try {
         if (-1 != 1882263613 * var1.field6038) {
            if (var4 != 306770163) {
               throw new IllegalStateException();
            }

            this.field746 = var1;
         }

         if (-1 != var2) {
            if (var4 != 306770163) {
               throw new IllegalStateException();
            }

            this.field749 = var2 * 1802764903;
            this.field750 = var3;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "cj.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   @Override
   protected boolean vmethod96() {
      if (this.field756.method9726(374233424) && this.field756.method9731((byte)66).method8749(this.field756.method9738(1911726146), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(this.field751.field6082 * -1176385453, -1545155524);
         Model var2 = var1.method8726(-149157205);
         return var2 != null && null != var2.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILcl;)Luz;")
   @ObfuscatedName("bo")
   classUZ method1530(int var1, int var2, int var3, int var4, classCL var5) {
      WorldView var6 = null;
      classUZ var7 = classHZ.method6135(16777216);
      if (var1 != 0) {
         Object var8;
         if (var1 > 0) {
            int var9 = var1 - 1;
            var6 = classHB.method5990(var9, var5, -1133595850);
            var8 = (Actor)var6.field1698.method13404(var9);
         } else {
            int var15 = -var1 - 1;
            var6 = classQB.method9434(var15, var5, 99847313);
            var8 = var6.method3737(var15, (byte)1);
         }

         if (var8 != null) {
            classKY var16 = ((Actor)var8).method3162(var6, (short)21769);
            var7.field6427 = var16.field4055 * 1870919123;
            var7.field6426 = var16.field4056 * 819227381;
         }
      }

      if (classUZ.method11745(var7, (byte)-76)) {
         var6 = var5.method1596(var2, var4, -1166456350);
         int var14 = var2 - -1444178379 * var6.field1709;
         int var17 = var4 - -351145363 * var6.field1708;
         WorldEntity var10 = (WorldEntity)classCL.method1592(var5, -864240403).worldEntities.method13595(2140889407 * var6.field1699);
         if (var10 != null) {
            var7 = var10.method10620(classKY.method6612(var14, 1394073379), classKY.method6612(var17, -241731174), (byte)-43);
         } else {
            var7 = classIK.method6218(classKY.method6612(var14, 1450354291), 0.0F, classKY.method6612(var17, -1001615522), (byte)-28);
         }
      }

      int var18 = (int)var7.field6427;
      int var11 = (int)var7.field6426;
      int var12 = classKV.method6571(var6, var18, var11, var3, (byte)122);
      WorldEntity var13 = (WorldEntity)classIS.field3053.worldEntities.method13595(2140889407 * var6.field1699);
      if (var13 != null) {
         var12 += classKV.method6571(classIS.field3053, var13.vmethod368(311606126), var13.vmethod371(-1017509937), var13.vmethod258((byte)-27), (byte)122);
      }

      var7.field6425 = var12;
      return var7;
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("ba")
   float method1538(int var1, int var2) {
      this.field757[0] = var1;
      this.field757[1] = var2;
      ScriptEvent var3 = classZS.method14182(classCA.method1392(86, -1322829539).method14145(this.field757, (byte)2), (byte)19);
      classSZ.method10729(var3, -1415785063);
      int var4 = classBB.field323[0];
      return var4 / 65536.0F;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   int method1560() {
      return 506326138 * this.field751.field6079;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   int method1563() {
      return (int)this.field759;
   }

   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("aa")
   float method1542(float var1, int var2) {
      try {
         if (!this.field747) {
            if (var2 == -1895772977) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            float var3 = 1.0F - this.field758;
            if (var3 <= 1.0E-6F) {
               if (var2 == -1895772977) {
                  throw new IllegalStateException();
               } else {
                  return 1.0F;
               }
            } else {
               float var4 = (var1 - this.field758) / var3;
               if (var4 < 0.0F) {
                  if (var2 == -1895772977) {
                     throw new IllegalStateException();
                  } else {
                     return 0.0F;
                  }
               } else if (var4 > 1.0F) {
                  if (var2 == -1895772977) {
                     throw new IllegalStateException();
                  } else {
                     return 1.0F;
                  }
               } else {
                  return var4;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "cj.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("co")
   int method1566() {
      return (int)this.field752;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ck")
   int method1567() {
      return (int)this.field752;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ca")
   int method1569() {
      return (int)this.field753;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cc")
   int method1571() {
      return this.field760 * 1172186498;
   }

   @ObfuscatedSignature(descriptor = "([BI)Z")
   @ObfuscatedName("ao")
   static boolean method1572(byte[] var0, int var1) {
      try {
         return AABB.method4918(var0, 0, 0, 63, 63, (short)-18383);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.ao(" + ')');
      }
   }

   classCJ(classSW var1, classCL var2) {
      this.field754 = 0.0F;
      this.field745 = 0.0F;
      this.field748 = 0.0F;
      this.field749 = 0;
      this.field750 = false;
      this.field759 = 0.0F;
      this.field752 = 0.0F;
      this.field753 = 0.0F;
      this.field760 = 0;
      this.field755 = 0;
      this.field756 = new classQR();
      this.field757 = new Object[2];
      this.field758 = -1.0F;
      this.field747 = false;
      this.field751 = var1;
      classQR.method9722(this.field756, classAI.method376(var1.field6082 * 1369348907, -2016759459).field5083 * 696329207, -2024121467);
      this.method1524(var2, -473820696);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bn")
   int method1555(byte var1) {
      try {
         return this.field751.field6090 * 43544377;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cj.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cv")
   int method1556() {
      return this.field751.field6075 * -1099425379;
   }
}
