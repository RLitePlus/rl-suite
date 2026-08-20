import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("si")
public class ActorSpotAnim extends Renderable implements net.runelite.api.ActorSpotAnim {
   @ObfuscatedName("as")
   final boolean field5962;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("af")
   public final classQR field5958;
   @ObfuscatedName("ae")
   public int field5961;
   @ObfuscatedName("az")
   public int field5959 = 861680777;
   @ObfuscatedSignature(descriptor = "Ldh;")
   @ObfuscatedName("ag")
   final Actor field5957;
   @ObfuscatedName("re")
   static int field5964;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field5963 = 765;
   @ObfuscatedName("ab")
   int field5960;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)I")
   @ObfuscatedName("jj")
   public static int method10454(classLH var0) {
      return -457263387 * var0.field4160;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   @Override
   protected int vmethod100() {
      return this.field5957.vmethod98(-312983606);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   @Override
   protected boolean vmethod96() {
      if (null == this.field5957) {
         return false;
      } else if (1612595797 * client.field855 < this.field5961 * 582342939) {
         return false;
      } else if (this.field5958.method9726(374233424) && this.field5958.method9731((byte)68).method8749(this.field5958.method9738(2049074655), 1284412146)) {
         return true;
      } else {
         Model var1 = classAI.method376(this.field5959 * -1839511320, -1302911466).method8726(-376558306);
         return null != var1 && null != var1.field2444;
      }
   }

   public void setFrame(int var1) {
      this.field5958.field5602 = var1 * -885908119;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;)Ljava/lang/String;")
   @ObfuscatedName("jw")
   public static String method10453(classMA var0) {
      return var0.field4456.method7657(-1297125300);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   public boolean method10444(int var1) {
      try {
         return classAI.method376(-1568506297 * this.field5959, -2050013648).method8728(-344613019);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "si.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod99() {
      return this.field5957.vmethod98(2131348794);
   }

   @ObfuscatedSignature(descriptor = "(Lsi;I)Z")
   @ObfuscatedName("eq")
   public static boolean method10448(ActorSpotAnim var0, int var1) {
      if (var0 == null) {
         var0.method10452(var1);
      }

      try {
         return var0.field5962;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "si.af(" + ')');
      }
   }

   public int getHeight() {
      return this.field5960 * 825461571;
   }

   public void setId(int var1) {
      this.field5959 = var1 * -861680777;
   }

   public int getStartCycle() {
      return this.field5961 * 1168432457;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   @Override
   protected boolean vmethod95(int var1) {
      try {
         if (null == this.field5957) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (1612595797 * client.field855 < this.field5961 * 1168432457) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (this.field5958.method9726(374233424)) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               if (this.field5958.method9731((byte)94).method8749(this.field5958.method9738(1795053762), 1284412146)) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            Model var2 = classAI.method376(this.field5959 * -1568506297, -1538969825).method8726(1068370205);
            if (null == var2 || null == var2.field2444) {
               return false;
            } else if (var1 == -702405562) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "si.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod92() {
      if (null == this.field5957) {
         return null;
      } else if (1612595797 * client.field855 < 216014736 * this.field5961) {
         return null;
      } else if (classQR.method9763(this.field5958, 30, -1142483741)) {
         return null;
      } else {
         classOR var1 = classAI.method376(-1568506297 * this.field5959, -2039373745);
         Model var2 = var1.method8724(this.field5958.method9738(1750593616), 1603539580);
         if (var2 == null) {
            return null;
         } else {
            var2.method5232(-(-666341653 * this.field5960));
            if (Actor.method3168(this.field5957, -1969508409) == 1) {
               var2.field2421 = true;
            }

            var2.method5205(this.field5957.vmethod274((byte)-70), (short)var2.field2419);
            var2.method5227(this.field5957.vmethod276(2074946198));
            var2.method5232(this.field5957.vmethod278(-1426279030));
            return var2;
         }
      }
   }

   public int getId() {
      return this.field5959 * -1568506297;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   @Override
   protected final Model vmethod93() {
      if (null == this.field5957) {
         return null;
      } else if (1612595797 * client.field855 < 1610117276 * this.field5961) {
         return null;
      } else if (classQR.method9763(this.field5958, 30, -681914151)) {
         return null;
      } else {
         classOR var1 = classAI.method376(-216247058 * this.field5959, -2089406467);
         Model var2 = var1.method8724(this.field5958.method9738(1769764105), 2108134630);
         if (var2 == null) {
            return null;
         } else {
            var2.method5232(-(825461571 * this.field5960));
            if (Actor.method3168(this.field5957, 1977588115) == 1) {
               var2.field2421 = true;
            }

            var2.method5205(this.field5957.vmethod274((byte)-39), (short)var2.field2419);
            var2.method5227(this.field5957.vmethod276(1701522977));
            var2.method5232(this.field5957.vmethod278(-1791702410));
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   public boolean method10449() {
      return this.field5962;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   @Override
   protected boolean vmethod94() {
      if (null == this.field5957) {
         return false;
      } else if (1612595797 * client.field855 < this.field5961 * 1168432457) {
         return false;
      } else if (this.field5958.method9726(374233424) && this.field5958.method9731((byte)27).method8749(this.field5958.method9738(1749874533), 1284412146)) {
         return true;
      } else {
         Model var1 = classAI.method376(this.field5959 * -1568506297, -1941507830).method8726(-579858414);
         return null != var1 && null != var1.field2444;
      }
   }

   public int getCycle() {
      return this.field5958.field5604 * -1399668821;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod97() {
      if (null == this.field5957) {
         return false;
      } else if (1612595797 * client.field855 < this.field5961 * 1168432457) {
         return false;
      } else if (this.field5958.method9726(374233424) && this.field5958.method9731((byte)19).method8749(this.field5958.method9738(1876883277), 1284412146)) {
         return true;
      } else {
         Model var1 = classAI.method376(this.field5959 * -1568506297, -2108963618).method8726(219138195);
         return null != var1 && null != var1.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   protected int vmethod98(int var1) {
      try {
         return this.field5957.vmethod98(1242417669);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "si.ag(" + 41);
      }
   }

   public void setStartCycle(int var1) {
      this.field5961 = var1 * 668116217;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)I")
   @ObfuscatedName("xh")
   public static int method10455(Actor var0) {
      return 635707271 * var0.field1463.field631;
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   protected final Model vmethod104(int var1) {
      int var2 = this.field5958.field5602 * 292569817;
      if (var2 != -1 && client.field1116 != null && client.field1116.test(this.field5958.field5598 * 1684838611)) {
         this.field5958.field5602 = (-2147483648 | Math.max(this.field5958.field5604 * -1399668821 - 1, 0) << 16 | var2) * -885908119;
      }

      Model var3;
      try {
         ActorSpotAnim var5 = this;
         int var6 = -891174633;

         Model var10000;
         try {
            if (null == var5.field5957) {
               if (var6 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var5 = null;
               var10000 = var5;
            } else if (1612595797 * client.field855 < 1168432457 * var5.field5961) {
               if (var6 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var5 = null;
               var10000 = var5;
            } else if (classQR.method9763(var5.field5958, 30, -1003247398)) {
               if (var6 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var5 = null;
               var10000 = var5;
            } else {
               classOR var7 = classAI.method376(-1568506297 * var5.field5959, -1406103855);
               Model var8 = var7.method8724(var5.field5958.method9738(2073738908), 875936462);
               if (var8 == null) {
                  if (var6 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  var5 = null;
                  var10000 = var5;
               } else {
                  var8.method5232(-(825461571 * var5.field5960));
                  if (Actor.method3168(var5.field5957, -2032654562) == 1) {
                     if (var6 <= -1767431455) {
                        throw new IllegalStateException();
                     }

                     var8.field2421 = true;
                  }

                  var8.method5205(var5.field5957.vmethod274((byte)-87), (short)var8.field2419);
                  var8.method5227(var5.field5957.vmethod276(1859691167));
                  var8.method5232(var5.field5957.vmethod278(-1814170184));
                  var10000 = var8;
               }
            }
         } catch (RuntimeException var11) {
            throw classEG.newRunException(var11, "si.ae(" + ')');
         }

         var3 = var10000;
      } finally {
         this.field5958.field5602 = var2 * -885908119;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   @Override
   protected int vmethod101() {
      return this.field5957.vmethod98(608492936);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   protected int vmethod102() {
      return this.field5957.vmethod98(1845331531);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lef;)[Lsg;")
   @ObfuscatedName("tu")
   public static classSG[] method10447(classEF var0) {
      return var0.field1745;
   }

   public void setHeight(int var1) {
      this.field5960 = var1 * -1763452565;
   }

   public int getFrame() {
      return this.field5958.field5602 * 292569817;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   protected int vmethod103() {
      return this.field5957.vmethod98(1690808201);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method10445() {
      return classAI.method376(-1568506297 * this.field5959, -1568080155).method8728(-1167547580);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   public boolean method10446() {
      return classAI.method376(-1568506297 * this.field5959, -1277442260).method8728(-866382518);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   public boolean method10450() {
      return this.field5962;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aa")
   public boolean method10451() {
      return this.field5962;
   }

   public void setCycle(int var1) {
      this.field5958.field5604 = var1 * -1873132797;
   }

   public ActorSpotAnim(int var1, int var2, int var3, Actor var4, boolean var5) {
      this.field5958 = new classQR();
      this.field5961 = 0;
      this.field5960 = 0;
      this.field5959 = -861680777 * var1;
      this.field5960 = var2 * -1763452565;
      this.field5961 = var3 * 668116217;
      this.field5957 = var4;
      if (-1568506297 * this.field5959 >= 0) {
         classQR.method9722(this.field5958, classAI.method376(-1568506297 * this.field5959, -1795637479).field5083 * 696329207, -2084471964);
      }

      this.field5962 = var5;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("af")
   public boolean method10452(int var1) {
      try {
         return this.field5962;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "si.af(" + ')');
      }
   }
}
