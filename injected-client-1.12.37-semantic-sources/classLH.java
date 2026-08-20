import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lh")
public class classLH {
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("aa")
   public static AbstractArchive field4168;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4163 = 0;
   @ObfuscatedName("bx")
   int field4152;
   @ObfuscatedName("bg")
   int field4153;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field4164 = 0;
   @ObfuscatedSignature(descriptor = "Lzd;")
   @ObfuscatedName("ai")
   classZD field4159 = new classZD();
   @ObfuscatedSignature(descriptor = "Lzd;")
   @ObfuscatedName("ar")
   classZD field4144 = new classZD();
   @ObfuscatedName("ak")
   boolean field4143 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field4161 = 2;
   @ObfuscatedName("ah")
   int field4150;
   @ObfuscatedName("aw")
   boolean field4147;
   @ObfuscatedName("an")
   int field4148;
   @ObfuscatedName("am")
   int field4149;
   @ObfuscatedName("bk")
   int field4160;
   @ObfuscatedName("br")
   int field4155;
   @ObfuscatedSignature(descriptor = "Llm;")
   @ObfuscatedName("bo")
   classLM field4166;
   @ObfuscatedName("bc")
   int field4151;
   @ObfuscatedName("bp")
   int field4156;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4165 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4162 = 1;
   @ObfuscatedName("bt")
   int field4158;
   @ObfuscatedName("bm")
   int field4142;
   @ObfuscatedName("bj")
   int field4154;
   @ObfuscatedName("at")
   boolean field4145 = true;
   @ObfuscatedName("av")
   int field4146 = 0;
   @ObfuscatedSignature(descriptor = "Llm;")
   @ObfuscatedName("bu")
   classLM field4167;
   @ObfuscatedName("bn")
   int field4157;

   @ObfuscatedSignature(descriptor = "(Llh;Llm;B)V")
   @ObfuscatedName("qd")
   public static void method6962(classLH var0, classLM var1, byte var2) {
      if (var0 == null) {
         var0.method6966(var1, var2);
      }

      try {
         var0.field4166 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("js")
   public int method7024() {
      return this.field4159.method13938(-2008736246);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fy")
   public void method6878() {
      method6882(this, 0, this.field4159.method13850(-130672433), 1122842785);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;IZ)V")
   @ObfuscatedName("bb")
   public static void method7074(classLH var0, int var1, boolean var2) {
      if (var0 == null) {
         var0.method6822(var1);
      }

      if (var2) {
         method6882(var0, 1072642345 * var0.field4152, var1, 1122842785);
      } else {
         method6882(var0, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;I)Laag;")
   @ObfuscatedName("eo")
   public static classAAG method6977(classLH var0, int var1) {
      if (var0 == null) {
         var0.method6981(var1);
      }

      try {
         return var0.field4159.method13871(var0.field4152 * 1072642345, var0.field4157 * -698145269, 176225300);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   public void method6849(int var1) {
      try {
         this.field4147 = false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("cb")
   public boolean method6998(byte var1) {
      try {
         return this.field4147;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   public void method6870(int var1) {
      try {
         if (!method6876(this, 455461300)) {
            if (var1 == 1818385) {
               throw new IllegalStateException();
            }

            if (-698145269 * this.field4157 < this.field4159.method13850(2092781701)) {
               classWB var2 = this.method7064(-698145269 * this.field4157, 1700027085);
               int var3 = this.field4159.method13893(this.field4157 * -698145269, (Integer)var2.field6655, 1228397626);
               this.method7095((byte)94);
               method6882(this, var3, var3, 1122842785);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fn")
   public void method6885(boolean var1) {
      classWB var2 = this.method7068(this.field4157 * -1951118393, -473099497);
      this.method7075((Integer)var2.field6654, var1, -1999332591);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("dg")
   public boolean method6820(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 >= 897355686) {
               throw new IllegalStateException();
            }

            var1 = Integer.MAX_VALUE;
         }

         boolean var10000;
         if (var1 == this.field4159.method13923(347520185)) {
            if (var2 >= 897355686) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         classZD.method13926(this.field4159, var1, -2107277976);
         classZD.method13926(this.field4144, var1, -2089009959);
         if (this.method7073((byte)-54)) {
            if (var2 >= 897355686) {
               throw new IllegalStateException();
            }

            this.method7095((byte)55);
            var3 = true;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("al")
   public boolean method6834(int var1, int var2, int var3) {
      try {
         if (!this.method6998((byte)-48)) {
            if (var3 >= 869659365) {
               throw new IllegalStateException();
            } else {
               this.field4154 = var1 * -942303129;
               this.field4160 = var2 * -1673193747;
               return false;
            }
         } else {
            int var4 = -1184890025 * this.field4154;
            int var5 = -457263387 * this.field4160;
            int var6 = Math.max(0, this.field4159.method13906((byte)-74) - this.field4158 * 2084178789 + 2);
            int var7 = Math.max(0, this.field4159.method13908((byte)23) - 236265915 * this.field4153 + 1);
            this.field4154 = Math.max(0, Math.min(var6, var1)) * -942303129;
            this.field4160 = Math.max(0, Math.min(var7, var2)) * -1673193747;
            if (var4 == this.field4154 * -1184890025) {
               if (var3 >= 869659365) {
                  throw new IllegalStateException();
               }

               if (-457263387 * this.field4160 == var5) {
                  return false;
               }

               if (var3 >= 869659365) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "lh.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("eb")
   public boolean method6821(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field4159.method13923(1755643114);
      classZD.method13926(this.field4159, var1, -2052920692);
      classZD.method13926(this.field4144, var1, -2040748860);
      if (this.method7073((byte)-44)) {
         this.method7095((byte)114);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ay")
   public void method6841(int var1, int var2) {
      try {
         classZD.method13868(this.field4159, var1, (byte)116);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;II)Z")
   @ObfuscatedName("rz")
   public static boolean method7089(classLH var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7094(var1, var1);
      }

      try {
         if (32 != var1) {
            if (var2 >= 1053045388) {
               throw new IllegalStateException();
            }

            if (var1 != 10 && var1 != 9) {
               return false;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.cm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ev")
   public boolean method6845(int var1, int var2) {
      try {
         this.field4150 = var1 * -1502904977;
         String var3 = this.field4159.method13854((byte)-99);
         int var4 = var3.length();
         var3 = method7054(this, var3, 1949274329);
         if (var3.length() != var4) {
            if (var2 == -136218518) {
               throw new IllegalStateException();
            } else {
               this.field4159.method13889(var3, 903945741);
               this.method6834(this.field4154 * -1184890025, this.field4160 * -457263387, -1496690152);
               this.method7073((byte)-64);
               this.method7095((byte)67);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aq")
   public boolean method6854(int var1, int var2) {
      try {
         if (method7098(this, var1, -32389191)) {
            method6876(this, 455461300);
            classZP var3 = this.field4159.method13875((char)var1, -698145269 * this.field4157, this.field4155 * 1030611083, (byte)27);
            method6882(this, var3.method14079(916955013), var3.method14079(-1295548710), 1122842785);
            this.method7073((byte)-65);
            this.method7095((byte)88);
         }

         return true;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eu")
   public void method6850() {
      this.field4147 = false;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ai")
   public void method6865(byte var1) {
      try {
         if (!method6876(this, 455461300)) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            }

            if (this.field4157 * -698145269 < this.field4159.method13850(1950622253)) {
               if (var1 <= 2) {
                  return;
               }

               int var2 = classZD.method13892(this.field4159, this.field4157 * -698145269, -1596338929);
               this.method7095((byte)38);
               method6882(this, var2, var2, 1122842785);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llm;)V")
   @ObfuscatedName("hh")
   public void method6967(classLM var1) {
      this.field4167 = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   public void method6879(byte var1) {
      try {
         method6882(this, 0, this.field4159.method13850(87000098), 1122842785);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cn")
   boolean method7049(int var1) {
      try {
         boolean var10000;
         if (this.field4157 * -698145269 != this.field4152 * 1072642345) {
            if (var1 != 2012791869) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("an")
   public void method6886(boolean var1, byte var2) {
      try {
         classWB var3 = this.method7068(this.field4157 * -698145269, -2100457842);
         this.method7075((Integer)var3.field6654, var1, -2102365134);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("am")
   public void method6888(boolean var1, int var2) {
      try {
         classWB var3 = this.method7068(-698145269 * this.field4157, -1177535132);
         this.method7075((Integer)var3.field6655, var1, -1342884739);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.am(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)V")
   @ObfuscatedName("rm")
   public static void method6859(classLH var0) {
      if (var0 == null) {
         var0.method7042();
      }

      if (!method6876(var0, 455461300) && -698145269 * var0.field4157 > 0) {
         int var1 = classZD.method13892(var0.field4159, var0.field4157 * -698145269 - 1, -1596338929);
         var0.method7095((byte)36);
         method6882(var0, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("ah")
   public void method6894(boolean var1, byte var2) {
      try {
         this.method7075(0, var1, -711214799);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gs")
   public void method6921(boolean var1) {
      if (this.field4157 * -698145269 > 0) {
         int var2 = this.method7080(2101998004);
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, -var2, -1901213098), var1, -2109015603);
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bx")
   public void method6899(boolean var1, int var2) {
      try {
         if (this.method7049(2012791869)) {
            if (var2 == -1751455896) {
               throw new IllegalStateException();
            }

            if (!var1) {
               this.method7075(Math.min(this.field4152 * 1072642345, -698145269 * this.field4157), var1, -2137200963);
               return;
            }
         }

         if (-698145269 * this.field4157 > 0) {
            this.method7075(this.field4157 * -698145269 - 1, var1, -1469394953);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bc")
   public void method6903(boolean var1, byte var2) {
      try {
         if (this.method7049(2012791869)) {
            if (var2 <= 10) {
               throw new IllegalStateException();
            }

            if (!var1) {
               this.method7075(Math.max(this.field4152 * 1072642345, -698145269 * this.field4157), var1, -1470377285);
               return;
            }
         }

         if (this.field4157 * -698145269 < this.field4159.method13850(69845744)) {
            if (var2 <= 10) {
               throw new IllegalStateException();
            }

            this.method7075(1 + -698145269 * this.field4157, var1, -1257110877);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lzd;")
   @ObfuscatedName("hn")
   public classZD method6972() {
      return this.field4144;
   }

   @ObfuscatedSignature(descriptor = "(Llh;ZI)V")
   @ObfuscatedName("ek")
   public static void method6924(classLH var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method6926(var1, var2);
      } else {
         try {
            if (var0.field4157 * -698145269 < var0.field4159.method13850(-540295366)) {
               if (var2 != 988636327) {
                  throw new IllegalStateException();
               }

               int var3 = var0.method7080(1715761966);
               var0.method7075(classZD.method13901(var0.field4159, var0.field4157 * -698145269, var3, -1245485915), var1, -1104674755);
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "lh.bj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Laag;")
   @ObfuscatedName("hs")
   public classAAG method6978() {
      return this.field4159.method13871(this.field4152 * 1072642345, this.field4157 * -698145269, 49444063);
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bm")
   public void method6910(boolean var1, byte var2) {
      try {
         if (this.field4157 * -698145269 > 0) {
            if (var2 == 1) {
               return;
            }

            this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, -1, -600257831), var1, -1831247593);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bt")
   public void method6916(boolean var1, int var2) {
      try {
         if (this.field4157 * -698145269 < this.field4159.method13850(1117277900)) {
            if (var2 == 1461892107) {
               return;
            }

            this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, 1, -533399198), var1, -1459067041);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bg")
   public void method6922(boolean var1, int var2) {
      try {
         if (this.field4157 * -698145269 > 0) {
            if (var2 <= -565590623) {
               return;
            }

            int var3 = this.method7080(1731156472);
            this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, -var3, -656796446), var1, -998892416);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bo")
   public void method6933(boolean var1, int var2) {
      try {
         classAAG var3 = this.field4159.method13871(0, -698145269 * this.field4157, 740848598);
         classWB var4 = var3.method214((byte)-50);
         this.method7075(
            this.field4159.method13898((Integer)var4.field6654, 236265915 * this.field4153 + this.field4160 * -457263387, -1610974692), var1, -2063257757
         );
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ba")
   public void method6942(int var1, int var2, int var3) {
      try {
         if (this.field4147) {
            if (var3 == 610066815) {
               throw new IllegalStateException();
            }

            if (this.method6982(1491129216)) {
               if (var3 == 610066815) {
                  return;
               }

               var1 += this.field4154 * -1184890025;
               var2 += -457263387 * this.field4160;
               classWB var4 = method7099(this, -1079082866);
               int var5 = this.field4159.method13898(var1 - (Integer)var4.field6654, var2 - (Integer)var4.field6655, 924454399);
               switch (this.field4149 * -1083366195) {
                  case 0:
                     method6882(this, 1072642345 * this.field4152, var5, 1122842785);
                     break;
                  case 1:
                     classWB var11 = this.method7064(-1558750221 * this.field4151, 1833946392);
                     classWB var12 = this.method7064(var5, 925050001);
                     method7060(this, var11, var12, 1801667578);
                     break;
                  case 2:
                     classWB var6 = this.method7068(this.field4151 * -1558750221, -1848636692);
                     classWB var7 = this.method7068(var5, -355309306);
                     method7060(this, var6, var7, 1801667578);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "lh.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V")
   @ObfuscatedName("bi")
   public void method6946(Clipboard var1, int var2) {
      try {
         classAAG var3 = this.field4159.method13871(this.field4152 * 1072642345, this.field4157 * -698145269, 574211831);
         if (!classAAG.method202(var3, 760872983)) {
            if (var2 != -887645341) {
               throw new IllegalStateException();
            }

            String var4 = var3.method195(1486656855);
            if (!var4.isEmpty()) {
               if (var2 != -887645341) {
                  throw new IllegalStateException();
               }

               var1.setContents(new StringSelection(var4), null);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.bw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V")
   @ObfuscatedName("bw")
   public void method6950(Clipboard var1, int var2) {
      try {
         if (this.method7049(2012791869)) {
            this.method6946(var1, -887645341);
            method6876(this, 455461300);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method6794(int var1) {
      try {
         this.field4146 = (1 + this.field4146 * -1569689927) % 60 * -1662830711;
         if (1398532195 * this.field4156 > 0) {
            if (var1 == 643906573) {
               return;
            }

            this.field4156 -= -373434037;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;I)Lzd;")
   @ObfuscatedName("na")
   public static classZD method6973(classLH var0, int var1) {
      if (var0 == null) {
         var0.method6976(var1);
      }

      try {
         return var0.field4144;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.bd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzd;")
   @ObfuscatedName("bs")
   public classZD method6970(int var1) {
      try {
         return this.field4159;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dj")
   public boolean method6982(int var1) {
      try {
         return this.field4143;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bz")
   public boolean method6989(byte var1) {
      try {
         if (this.method6982(1172600452)) {
            if (var1 != 3) {
               throw new IllegalStateException();
            }

            if (-1569689927 * this.field4146 % 60 < 30) {
               if (var1 != 3) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("ag")
   static final String method7104(int var0, int var1) {
      try {
         if (var0 < 100000) {
            if (var1 <= 781150786) {
               throw new IllegalStateException();
            } else {
               return "<col=ffff00>" + var0 + "</col>";
            }
         } else if (var0 < 10000000) {
            if (var1 <= 781150786) {
               throw new IllegalStateException();
            } else {
               return "<col=ffffff>" + var0 / 1000 + classKK.field3806 + "</col>";
            }
         } else {
            return "<col=00ff80>" + var0 / 1000000 + classKK.field3787 + "</col>";
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ct")
   public int method7001(int var1) {
      try {
         return -1184890025 * this.field4154;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.ct(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("li")
   boolean method7090(int var1) {
      return 32 == var1 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bv")
   public boolean method6824(int var1) {
      this.field4159.method13934(var1, (byte)-106);
      if (this.method7073((byte)-56)) {
         this.method7095((byte)12);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bn")
   public void method6897(boolean var1, int var2) {
      try {
         this.method7075(this.field4159.method13850(206174522), var1, -1593943994);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cv")
   public int method7018(int var1) {
      try {
         return this.field4148 * 747182635;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cv(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;B)V")
   @ObfuscatedName("xo")
   public static void method6958(classLH var0, byte var1) {
      if (var0 == null) {
         var0.method6868(var1);
      } else {
         try {
            int var2 = Math.max(0, var0.field4159.method13908((byte)93) - var0.field4153 * 236265915);
            var0.field4160 = Math.min(var2, var0.field4160 * -457263387 + var0.field4159.method13911((byte)-61)) * -1673193747;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "lh.by(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("cs")
   public void method7020(int var1, byte var2) {
      try {
         this.field4148 = -1971006333 * var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.cs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;I)Lwb;")
   @ObfuscatedName("ac")
   public static classWB method7099(classLH var0, int var1) {
      if (var0 == null) {
         return var0.method7103(var1);
      } else {
         try {
            int var2 = var0.field4159.method13950(var0.field4158 * 2084178789, (byte)-38);
            int var3 = var0.field4159.method13952(var0.field4153 * 236265915, -605299333);
            return new classWB(var2, var3);
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "lh.dm(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cy")
   public int method7025(int var1) {
      try {
         return this.field4159.method13938(1715472693);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cy(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ck")
   public int method7034(byte var1) {
      try {
         return -1136623217 * this.field4150;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.ck(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("cf")
   public boolean method7045(byte var1) {
      try {
         boolean var10000;
         if (method7014(this, -2118783281) > 1) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("eg")
   public boolean method6838(int var1, int var2) {
      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var3 = false;
      }

      return var3 ? this.field4159.method13865(var1, var2, 64272116) : false;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gj")
   public void method6923(boolean var1) {
      if (this.field4157 * -698145269 > 0) {
         int var2 = this.method7080(1862321022);
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, -var2, -1470055672), var1, -1422404283);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lwb;")
   @ObfuscatedName("cg")
   classWB method7064(int var1, int var2) {
      try {
         int var3 = this.field4159.method13850(-466004839);
         int var4 = 0;
         int var5 = var3;

         for (int var6 = var1; var6 > 0; var6--) {
            if (var2 <= 778248094) {
               throw new IllegalStateException();
            }

            if (method7089(this, this.field4159.method13839(var6 - 1, -1052717093).field117, -1953563735)) {
               var4 = var6;
               break;
            }
         }

         for (int var8 = var1; var8 < var3; var8++) {
            if (var2 <= 778248094) {
               throw new IllegalStateException();
            }

            if (method7089(this, this.field4159.method13839(var8, -1052717093).field117, 719843947)) {
               var5 = var8;
               break;
            }
         }

         return new classWB(var4, var5);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "lh.cg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lwb;")
   @ObfuscatedName("cw")
   classWB method7068(int var1, int var2) {
      try {
         int var3 = this.field4159.method13850(1076947893);
         int var4 = 0;
         int var5 = var3;

         for (int var6 = var1; var6 > 0; var6--) {
            if (var2 >= -324749371) {
               throw new IllegalStateException();
            }

            if (this.field4159.method13839(var6 - 1, -1052717093).field117 == '\n') {
               if (var2 >= -324749371) {
                  throw new IllegalStateException();
               }

               var4 = var6;
               break;
            }
         }

         for (int var8 = var1; var8 < var3; var8++) {
            if (var2 >= -324749371) {
               throw new IllegalStateException();
            }

            if (this.field4159.method13839(var8, -1052717093).field117 == '\n') {
               var5 = var8;
               break;
            }
         }

         return new classWB(var4, var5);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "lh.cw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("cj")
   boolean method7073(byte var1) {
      try {
         if (!this.method6998((byte)-72)) {
            return false;
         } else {
            boolean var2 = false;
            if (this.field4159.method13850(797760493) > this.field4142 * 1701882209) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               this.field4159.method13893(this.field4142 * 1701882209, this.field4159.method13850(457927206), 2091425062);
               var2 = true;
            }

            int var3 = method7014(this, -2118783281);
            if (this.field4159.method13913(-97436395) > var3) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               int var4 = classZD.method13901(this.field4159, 0, var3, -1456277372) - 1;
               this.field4159.method13893(var4, this.field4159.method13850(632060943), 1020210013);
               var2 = true;
            }

            if (var2) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               int var8 = -698145269 * this.field4157;
               int var5 = 1072642345 * this.field4152;
               int var6 = this.field4159.method13850(9500134);
               if (this.field4157 * -698145269 > var6) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var8 = var6;
               }

               if (1072642345 * this.field4152 > var6) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var5 = var6;
               }

               method6882(this, var5, var8, 1122842785);
            }

            return var2;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "lh.cj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)V")
   @ObfuscatedName("ci")
   void method7075(int var1, boolean var2, int var3) {
      try {
         if (var2) {
            method6882(this, 1072642345 * this.field4152, var1, 1122842785);
         } else {
            method6882(this, var1, var1, 1122842785);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.ci(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("el")
   public boolean method6881(int var1, int var2) {
      if (!this.method6998((byte)-104)) {
         this.field4152 = var1 * -737774823;
         this.field4157 = 1468773795 * var2;
         return false;
      } else {
         if (var1 > this.field4159.method13850(1522423452)) {
            var1 = this.field4159.method13850(-1774138685);
         }

         if (var2 > this.field4159.method13850(-230861502)) {
            var2 = this.field4159.method13850(-456691850);
         }

         boolean var3 = var1 != 1072642345 * this.field4152 || this.field4157 * -698145269 != var2;
         this.field4152 = var1 * -737774823;
         if (this.field4157 * -698145269 != var2) {
            this.field4157 = 1468773795 * var2;
            this.field4146 = 0;
            this.method7084(1546724843);
         }

         if (var3 && null != this.field4167) {
            this.field4167.vmethod147(-2048435553);
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ce")
   void method7084(int var1) {
      try {
         classAAG var2 = this.field4159.method13871(0, -698145269 * this.field4157, 200682512);
         classWB var3 = var2.method214((byte)-106);
         int var4 = this.field4159.method13911((byte)-29);
         int var5 = (Integer)var3.field6654 - 10;
         int var6 = var5 + 20;
         int var7 = (Integer)var3.field6655 - 3;
         int var8 = var7 + 6 + var4;
         int var9 = -1184890025 * this.field4154;
         int var10 = 2084178789 * this.field4158 + var9;
         int var11 = -457263387 * this.field4160;
         int var12 = 236265915 * this.field4153 + var11;
         int var13 = -1184890025 * this.field4154;
         int var14 = this.field4160 * -457263387;
         if (var5 < var9) {
            if (var1 <= 1409580481) {
               throw new IllegalStateException();
            }

            var13 = var5;
         } else if (var6 > var10) {
            if (var1 <= 1409580481) {
               throw new IllegalStateException();
            }

            var13 = var6 - 2084178789 * this.field4158;
         }

         if (var7 < var11) {
            if (var1 <= 1409580481) {
               throw new IllegalStateException();
            }

            var14 = var7;
         } else if (var8 > var12) {
            if (var1 <= 1409580481) {
               throw new IllegalStateException();
            }

            var14 = var8 - 236265915 * this.field4153;
         }

         this.method6834(var13, var14, 865215021);
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "lh.ce(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("dc")
   void method7095(byte var1) {
      try {
         if (this.field4166 != null) {
            if (var1 <= 8) {
               return;
            }

            this.field4166.vmethod147(-1854632780);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.dc(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Ljava/lang/String;)Z")
   @ObfuscatedName("ub")
   public static boolean method6802(classLH var0, String var1) {
      String var2 = var0.field4159.method13854((byte)-91);
      if (!var2.equals(var1)) {
         var1 = method7054(var0, var1, 2101837519);
         var0.field4159.method13889(var1, 1420762832);
         method6882(var0, var0.field4152 * 1072642345, var0.field4157 * -698145269, 1122842785);
         var0.method6834(var0.field4154 * -1184890025, -457263387 * var0.field4160, -1944944322);
         var0.method7073((byte)-94);
         var0.method7095((byte)103);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("br")
   public void method6908(boolean var1, int var2) {
      try {
         if (-698145269 * this.field4157 < this.field4159.method13850(2015287633)) {
            if (var2 >= 1759765807) {
               throw new IllegalStateException();
            }

            classWB var3 = this.method7064(1 + this.field4157 * -698145269, 1958930142);
            this.method7075((Integer)var3.field6655, var1, -1972416505);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.br(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;I)Z")
   @ObfuscatedName("mf")
   public static boolean method7097(classLH var0, int var1) {
      switch (var0.field4150 * -1136623217) {
         case 1:
            return classSN.method10532((char)var1, 1931919572);
         case 2:
            return classTT.method11165((char)var1, -1342668229);
         case 3:
            return classEB.method3802((char)var1, (byte)-81);
         case 4:
            char var2 = (char)var1;
            if (classEB.method3802(var2, (byte)104)) {
               return true;
            } else {
               if (var2 != 'k' && var2 != 'K' && 'm' != var2 && 'M' != var2 && var2 != 'b' && 'B' != var2) {
                  return false;
               }

               return true;
            }
         default:
            return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dx")
   void method6795() {
      this.field4146 = (1 + this.field4146 * 234562754) % 60 * 765444008;
      if (1778357441 * this.field4156 > 0) {
         this.field4156 -= -373434037;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lzd;")
   @ObfuscatedName("hb")
   public classZD method6974() {
      return this.field4144;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("db")
   public void method6799(boolean var1) {
      this.field4145 = var1;
      this.field4143 = var1 && this.field4143;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("dw")
   public boolean method6803(String var1) {
      String var2 = this.field4159.method13854((byte)-78);
      if (!var2.equals(var1)) {
         var1 = method7054(this, var1, 1955686191);
         this.field4159.method13889(var1, 1202114375);
         method6882(this, this.field4152 * -921251019, this.field4157 * -180045852, 1122842785);
         this.method6834(this.field4154 * -1752598530, -457263387 * this.field4160, -1362499256);
         this.method7073((byte)-69);
         this.method7095((byte)117);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("de")
   boolean method6807(String var1) {
      this.field4144.method13889(var1, 1424169415);
      return true;
   }

   @ObfuscatedSignature(descriptor = "()Laag;")
   @ObfuscatedName("ib")
   public classAAG method6979() {
      return this.field4159.method13871(this.field4152 * 1072642345, this.field4157 * -698145269, 389044079);
   }

   @ObfuscatedSignature(descriptor = "(Laaa;)Z")
   @ObfuscatedName("dn")
   boolean method6811(AbstractFont var1) {
      boolean var2 = !this.field4147;
      classZD.method13863(this.field4159, var1, 1792850232);
      classZD.method13863(this.field4144, var1, 463994915);
      this.field4147 = true;
      var2 |= this.method6834(this.field4154 * -1184890025, this.field4160 * -2131320667, -420130938);
      var2 |= method6882(this, this.field4152 * 1072642345, -698145269 * this.field4157, 1122842785);
      if (this.method7073((byte)-88)) {
         this.method7095((byte)115);
         var2 = true;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;I)Lwb;")
   @ObfuscatedName("pl")
   public static classWB method7069(classLH var0, int var1) {
      int var2 = var0.field4159.method13850(1063975601);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (var0.field4159.method13839(var5 - 1, -1052717093).field117 == '\n') {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (var0.field4159.method13839(var6, -1052717093).field117 == '\n') {
            var4 = var6;
            break;
         }
      }

      return new classWB(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("hr")
   public void method6951(Clipboard var1) {
      if (this.method7049(2012791869)) {
         this.method6946(var1, -887645341);
         method6876(this, 455461300);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("dl")
   public boolean method6815(int var1, int var2) {
      boolean var3 = 2084178789 * this.field4158 != var1 || this.field4153 * 236265915 != var2;
      this.field4158 = 1821386384 * var1;
      this.field4153 = -526943373 * var2;
      return var3 | this.method6834(this.field4154 * 741902702, this.field4160 * -457263387, -801801654);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gr")
   public void method6927(boolean var1) {
      classAAG var2 = this.field4159.method13871(0, this.field4157 * -698145269, 1626104776);
      classWB var3 = var2.method214((byte)0);
      this.method7075(this.field4159.method13898((Integer)var3.field6654, this.field4160 * -457263387, 78000541), var1, -1978497216);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fb")
   public void method6880() {
      method6882(this, 0, this.field4159.method13850(1289136605), 1122842785);
   }

   @ObfuscatedSignature(descriptor = "(Laaa;)Z")
   @ObfuscatedName("dv")
   boolean method6812(AbstractFont var1) {
      boolean var2 = !this.field4147;
      classZD.method13863(this.field4159, var1, -1905729892);
      classZD.method13863(this.field4144, var1, 1240189256);
      this.field4147 = true;
      var2 |= this.method6834(this.field4154 * -1184890025, this.field4160 * -457263387, 714673537);
      var2 |= method6882(this, this.field4152 * 1072642345, -698145269 * this.field4157, 1122842785);
      if (this.method7073((byte)-99)) {
         this.method7095((byte)72);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Llm;)V")
   @ObfuscatedName("hj")
   public void method6963(classLM var1) {
      this.field4166 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ea")
   public boolean method6822(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field4159.method13923(1308842644);
      classZD.method13926(this.field4159, var1, -2073116382);
      classZD.method13926(this.field4144, var1, -2046413928);
      if (this.method7073((byte)-3)) {
         this.method7095((byte)36);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Llh;ZI)V")
   @ObfuscatedName("oy")
   public static void method6928(classLH var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method6932(var1, var2);
      }

      try {
         classAAG var3 = var0.field4159.method13871(0, var0.field4157 * -698145269, 1003674895);
         classWB var4 = var3.method214((byte)-25);
         var0.method7075(var0.field4159.method13898((Integer)var4.field6654, var0.field4160 * -457263387, -683973827), var1, -1667191298);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ed")
   public boolean method6985(int var1) {
      try {
         return this.field4145;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ej")
   public boolean method6825(int var1) {
      this.field4159.method13934(var1, (byte)-88);
      if (this.method7073((byte)-24)) {
         this.method7095((byte)25);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bh")
   public boolean method6826(int var1) {
      this.field4159.method13934(var1, (byte)-54);
      if (this.method7073((byte)-92)) {
         this.method7095((byte)71);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ei")
   public boolean method6828(int var1) {
      this.field4142 = 1211480737 * var1;
      if (this.method7073((byte)-8)) {
         this.method7095((byte)59);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ey")
   public boolean method6829(int var1) {
      this.field4142 = 1211480737 * var1;
      if (this.method7073((byte)-5)) {
         this.method7095((byte)42);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cu")
   public int method6995(int var1) {
      try {
         return this.field4152 * 1072642345;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cu(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ds")
   public boolean method6830(int var1) {
      this.field4142 = 1211480737 * var1;
      if (this.method7073((byte)-127)) {
         this.method7095((byte)54);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dp")
   public boolean method6831(int var1) {
      this.field4142 = 1211480737 * var1;
      if (this.method7073((byte)-76)) {
         this.method7095((byte)31);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ez")
   public void method6871() {
      if (!method6876(this, 455461300) && -698145269 * this.field4157 < this.field4159.method13850(-1335663263)) {
         classWB var1 = this.method7064(-698145269 * this.field4157, 1600008299);
         int var2 = this.field4159.method13893(this.field4157 * -1532942369, (Integer)var1.field6655, -202510427);
         this.method7095((byte)27);
         method6882(this, var2, var2, 1122842785);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("qh")
   public static void method6887(classLH var0, boolean var1) {
      classWB var2 = var0.method7068(var0.field4157 * -698145269, -1688894818);
      var0.method7075((Integer)var2.field6654, var1, -1368753634);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ap")
   public boolean method6835(int var1, int var2) {
      if (!this.method6998((byte)-119)) {
         this.field4154 = var1 * -1509044448;
         this.field4160 = var2 * -6592661;
         return false;
      } else {
         int var3 = -1184890025 * this.field4154;
         int var4 = -2126043422 * this.field4160;
         int var5 = Math.max(0, this.field4159.method13906((byte)-119) - this.field4158 * -1780625469 + 2);
         int var6 = Math.max(0, this.field4159.method13908((byte)12) - 1178306276 * this.field4153 + 1);
         this.field4154 = Math.max(0, Math.min(var5, var1)) * -942303129;
         this.field4160 = Math.max(0, Math.min(var6, var2)) * -1673193747;
         return var3 != this.field4154 * -1184890025 || -457263387 * this.field4160 != var4;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jk")
   public int method7038() {
      return this.field4159.method13946(-504149574);
   }

   @ObfuscatedSignature(descriptor = "(Llh;I)I")
   @ObfuscatedName("zu")
   public static int method7003(classLH var0, int var1) {
      if (var0 == null) {
         var0.method7007(var1);
      }

      try {
         return -457263387 * var0.field4160;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("dq")
   public boolean method6839(int var1, int var2) {
      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var3 = false;
      }

      return var3 ? this.field4159.method13865(var1, var2, 100169848) : false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Ljava/lang/String;)Z")
   @ObfuscatedName("hg")
   public static boolean method6808(classLH var0, String var1) {
      if (var0 == null) {
         return var0.method6810(var1);
      } else {
         var0.field4144.method13889(var1, 900459530);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ex")
   public void method6842(int var1) {
      classZD.method13868(this.field4159, var1, (byte)110);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("eh")
   public boolean method6836(int var1, int var2) {
      if (!this.method6998((byte)7)) {
         this.field4154 = var1 * 616459606;
         this.field4160 = var2 * 614320697;
         return false;
      } else {
         int var3 = -1184890025 * this.field4154;
         int var4 = -457263387 * this.field4160;
         int var5 = Math.max(0, this.field4159.method13906((byte)-122) - this.field4158 * -1560688385 + 2);
         int var6 = Math.max(0, this.field4159.method13908((byte)96) - 236265915 * this.field4153 + 1);
         this.field4154 = Math.max(0, Math.min(var5, var1)) * -942303129;
         this.field4160 = Math.max(0, Math.min(var6, var2)) * -1610204324;
         return var3 != this.field4154 * -1638711732 || -457263387 * this.field4160 != var4;
      }
   }

   classLH() {
      this.field4147 = false;
      this.field4148 = 0;
      this.field4149 = 0;
      this.field4150 = 0;
      this.field4157 = 0;
      this.field4152 = 0;
      this.field4151 = 0;
      this.field4156 = 0;
      this.field4155 = -47417123;
      this.field4142 = 936002911;
      this.field4158 = 0;
      this.field4153 = 0;
      this.field4154 = 0;
      this.field4160 = 0;
      this.field4159.method13941(1, 1265711088);
      this.field4144.method13941(1, 517338926);
   }

   @ObfuscatedSignature(descriptor = "(Llh;IB)Z")
   @ObfuscatedName("dl")
   public static boolean method6832(classLH var0, int var1, byte var2) {
      if (var0 == null) {
         return var0.method6833(var1, var2);
      } else {
         try {
            var0.field4142 = 1211480737 * var1;
            if (var0.method7073((byte)-78)) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               } else {
                  var0.method7095((byte)33);
                  return true;
               }
            } else {
               return false;
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "lh.ao(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ee")
   public boolean method6846(int var1) {
      this.field4150 = var1 * -1502904977;
      String var2 = this.field4159.method13854((byte)-87);
      int var3 = var2.length();
      var2 = method7054(this, var2, 2130136860);
      if (var2.length() != var3) {
         this.field4159.method13889(var2, 1139096933);
         this.method6834(this.field4154 * 564515252, this.field4160 * -457263387, 14451625);
         this.method7073((byte)-13);
         this.method7095((byte)20);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("fp")
   public boolean method6816(int var1, int var2) {
      boolean var3 = 2084178789 * this.field4158 != var1 || this.field4153 * 236265915 != var2;
      this.field4158 = -1191629203 * var1;
      this.field4153 = -526943373 * var2;
      return var3 | this.method6834(this.field4154 * -1184890025, this.field4160 * -457263387, -548633443);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fz")
   public void method6851() {
      this.field4147 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ef")
   public void method6852() {
      this.field4147 = false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fo")
   public void method6853() {
      this.field4147 = false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jd")
   public int method7008() {
      return this.field4159.method13923(79138326);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("na")
   public static void method6929(classLH var0, boolean var1) {
      classAAG var2 = var0.field4159.method13871(0, var0.field4157 * -698145269, 1948301296);
      classWB var3 = var2.method214((byte)-89);
      var0.method7075(var0.field4159.method13898((Integer)var3.field6654, var0.field4160 * -457263387, 544607211), var1, -1983529983);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ax")
   public boolean method6817(int var1, int var2, int var3) {
      try {
         boolean var10000;
         label22: {
            if (2084178789 * this.field4158 == var1) {
               if (var3 >= -483624883) {
                  throw new IllegalStateException();
               }

               if (this.field4153 * 236265915 == var2) {
                  var10000 = false;
                  break label22;
               }
            }

            var10000 = true;
         }

         boolean var4 = var10000;
         this.field4158 = -1191629203 * var1;
         this.field4153 = -526943373 * var2;
         return var4 | this.method6834(this.field4154 * -1184890025, this.field4160 * -457263387, -1950004505);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kf")
   public boolean method6986() {
      return this.field4145;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ca")
   public int method7039(byte var1) {
      try {
         return this.field4159.method13946(-504149574);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.ca(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fh")
   public void method6860() {
      if (!method6876(this, 455461300) && -698145269 * this.field4157 > 0) {
         int var1 = classZD.method13892(this.field4159, this.field4157 * -698145269 - 1, -1596338929);
         this.method7095((byte)124);
         method6882(this, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("em")
   public void method6861() {
      if (!method6876(this, 455461300) && -698145269 * this.field4157 > 0) {
         int var1 = classZD.method13892(this.field4159, this.field4157 * -698145269 - 1, -1596338929);
         this.method7095((byte)71);
         method6882(this, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fd")
   public void method6866() {
      if (!method6876(this, 455461300) && this.field4157 * -698145269 < this.field4159.method13850(-1329704435)) {
         int var1 = classZD.method13892(this.field4159, this.field4157 * -698145269, -1596338929);
         this.method7095((byte)109);
         method6882(this, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("aa")
   public boolean method6827(int var1, byte var2) {
      try {
         this.field4159.method13934(var1, (byte)-40);
         if (this.method7073((byte)-124)) {
            if (var2 != 1) {
               throw new IllegalStateException();
            } else {
               this.method7095((byte)99);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("ib")
   public static void method6911(classLH var0, boolean var1) {
      if (var0.field4157 * -698145269 > 0) {
         var0.method7075(classZD.method13901(var0.field4159, var0.field4157 * -698145269, -1, -556410341), var1, -1592076731);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fq")
   public void method6872() {
      if (!method6876(this, 455461300) && -698145269 * this.field4157 < this.field4159.method13850(1315844644)) {
         classWB var1 = this.method7064(-698145269 * this.field4157, 1346880431);
         int var2 = this.field4159.method13893(this.field4157 * -698145269, (Integer)var1.field6655, 2058236458);
         this.method7095((byte)23);
         method6882(this, var2, var2, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hu")
   public void method6873() {
      if (!method6876(this, 455461300) && -698145269 * this.field4157 < this.field4159.method13850(-2015533720)) {
         classWB var1 = this.method7064(-698145269 * this.field4157, 1250434340);
         int var2 = this.field4159.method13893(this.field4157 * -698145269, (Integer)var1.field6655, 1949173927);
         this.method7095((byte)12);
         method6882(this, var2, var2, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fi")
   public void method6874() {
      if (!method6876(this, 455461300) && -698145269 * this.field4157 < this.field4159.method13850(-1847763938)) {
         classWB var1 = this.method7064(-698145269 * this.field4157, 1465306933);
         int var2 = this.field4159.method13893(this.field4157 * -698145269, (Integer)var1.field6655, 1369095791);
         this.method7095((byte)43);
         method6882(this, var2, var2, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public void method6875() {
      if (!method6876(this, 455461300) && -698145269 * this.field4157 < this.field4159.method13850(807692534)) {
         classWB var1 = this.method7064(-698145269 * this.field4157, 1303400190);
         int var2 = this.field4159.method13893(this.field4157 * -698145269, (Integer)var1.field6655, 402751031);
         this.method7095((byte)77);
         method6882(this, var2, var2, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jf")
   public void method7021(int var1) {
      this.field4148 = -1061050160 * var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gx")
   public void method6925(boolean var1) {
      if (this.field4157 * -698145269 < this.field4159.method13850(-39775339)) {
         int var2 = this.method7080(1853316520);
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, var2, -1183341872), var1, -1106264835);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("da")
   public boolean method6855(int var1) {
      if (method7098(this, var1, -32389191)) {
         method6876(this, 455461300);
         classZP var2 = this.field4159.method13875((char)var1, -698145269 * this.field4157, this.field4155 * 1030611083, (byte)97);
         method6882(this, var2.method14079(169038737), var2.method14079(-39684417), 1122842785);
         this.method7073((byte)-119);
         this.method7095((byte)104);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Lwb;")
   @ObfuscatedName("lw")
   classWB method7100() {
      int var1 = this.field4159.method13950(this.field4158 * 2084178789, (byte)-117);
      int var2 = this.field4159.method13952(this.field4153 * 236265915, -1639788080);
      return new classWB(var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("bt")
   public static void method6947(classLH var0, Clipboard var1) {
      if (var0 == null) {
         var0.method6949(var1);
      }

      classAAG var2 = var0.field4159.method13871(var0.field4152 * 1072642345, var0.field4157 * -698145269, 856911178);
      if (!classAAG.method202(var2, 1730357919)) {
         String var3 = var2.method195(1492401288);
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), null);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fx")
   public void method6889(boolean var1) {
      classWB var2 = this.method7068(-698145269 * this.field4157, -2144259910);
      this.method7075((Integer)var2.field6655, var1, -2014321361);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fr")
   public void method6890(boolean var1) {
      classWB var2 = this.method7068(-722278368 * this.field4157, -399582529);
      this.method7075((Integer)var2.field6655, var1, -2053657812);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ft")
   public void method6891(boolean var1) {
      classWB var2 = this.method7068(-698145269 * this.field4157, -1923711887);
      this.method7075((Integer)var2.field6655, var1, -1321521928);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Lwb;Lwb;)V")
   @ObfuscatedName("zn")
   public static void method7059(classLH var0, classWB var1, classWB var2) {
      if (var0 == null) {
         var0.method7063(var1, var1);
      } else {
         if ((Integer)var2.field6654 < (Integer)var1.field6654) {
            method6882(var0, (Integer)var1.field6655, (Integer)var2.field6654, 1122842785);
         } else {
            method6882(var0, (Integer)var1.field6654, (Integer)var2.field6655, 1122842785);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ew")
   public boolean method6847(int var1) {
      this.field4150 = var1 * 689527944;
      String var2 = this.field4159.method13854((byte)-81);
      int var3 = var2.length();
      var2 = method7054(this, var2, 2074294826);
      if (var2.length() != var3) {
         this.field4159.method13889(var2, 1167144126);
         this.method6834(this.field4154 * -1184890025, this.field4160 * -457263387, -1935850458);
         this.method7073((byte)-85);
         this.method7095((byte)80);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fe")
   public void method6895(boolean var1) {
      this.method7075(0, var1, -953555876);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fc")
   public void method6896(boolean var1) {
      this.method7075(0, var1, -1233951363);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("et")
   public boolean method6848(int var1) {
      this.field4150 = var1 * -1652512911;
      String var2 = this.field4159.method13854((byte)-14);
      int var3 = var2.length();
      var2 = method7054(this, var2, 1912788008);
      if (var2.length() != var3) {
         this.field4159.method13889(var2, 900227482);
         this.method6834(this.field4154 * 995601190, this.field4160 * -810314250, -1069773317);
         this.method7073((byte)-85);
         this.method7095((byte)109);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fw")
   public void method6900(boolean var1) {
      if (this.method7049(2012791869) && !var1) {
         this.method7075(Math.min(this.field4152 * 1072642345, -698145269 * this.field4157), var1, -889581291);
      } else if (-698145269 * this.field4157 > 0) {
         this.method7075(this.field4157 * -698145269 - 1, var1, -1062212942);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gq")
   public void method6901(boolean var1) {
      if (this.method7049(2012791869) && !var1) {
         this.method7075(Math.min(this.field4152 * 1072642345, -698145269 * this.field4157), var1, -1300962940);
      } else if (-698145269 * this.field4157 > 0) {
         this.method7075(this.field4157 * -698145269 - 1, var1, -1973562466);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gb")
   public void method6902(boolean var1) {
      if (this.method7049(2012791869) && !var1) {
         this.method7075(Math.min(this.field4152 * 1072642345, -698145269 * this.field4157), var1, -736398567);
      } else if (-698145269 * this.field4157 > 0) {
         this.method7075(this.field4157 * -698145269 - 1, var1, -1471273416);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("df")
   public boolean method6856(int var1) {
      if (method7098(this, var1, -32389191)) {
         method6876(this, 455461300);
         classZP var2 = this.field4159.method13875((char)var1, -698145269 * this.field4157, this.field4155 * -602529696, (byte)23);
         method6882(this, var2.method14079(-2138140052), var2.method14079(-1856819948), 1122842785);
         this.method7073((byte)-23);
         this.method7095((byte)99);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gc")
   public void method6912(boolean var1) {
      if (this.field4157 * -698145269 > 0) {
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, -1, -1298631965), var1, -1699655484);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gw")
   public void method6913(boolean var1) {
      if (this.field4157 * -698145269 > 0) {
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, -1, -1408172875), var1, -785557906);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;III)Z")
   @ObfuscatedName("mx")
   public static boolean method6840(classLH var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method6837(var1, var1, var1);
      } else {
         try {
            boolean var4;
            label43: {
               var4 = true;
               if (var1 >= 0) {
                  if (var3 >= 585054447) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= 2) {
                     break label43;
                  }

                  if (var3 >= 585054447) {
                     throw new IllegalStateException();
                  }
               }

               var4 = false;
            }

            if (var2 < 0 || var2 > 2) {
               var4 = false;
            }

            if (var4) {
               if (var3 >= 585054447) {
                  throw new IllegalStateException();
               } else {
                  return var0.field4159.method13865(var1, var2, -142603297);
               }
            } else {
               return false;
            }
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "lh.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gg")
   public void method6914(boolean var1) {
      if (this.field4157 * 2070233846 > 0) {
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -49688484, -1, -1107810966), var1, -899536712);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;III)Z")
   @ObfuscatedName("sp")
   public static boolean method6882(classLH var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method6884(var1, var1, var1);
      }

      try {
         if (!var0.method6998((byte)-116)) {
            if (var3 != 1122842785) {
               throw new IllegalStateException();
            } else {
               var0.field4152 = var1 * -737774823;
               var0.field4157 = 1468773795 * var2;
               return false;
            }
         } else {
            if (var1 > var0.field4159.method13850(-381452321)) {
               if (var3 != 1122842785) {
                  throw new IllegalStateException();
               }

               var1 = var0.field4159.method13850(2055901482);
            }

            if (var2 > var0.field4159.method13850(-1869711221)) {
               if (var3 != 1122842785) {
                  throw new IllegalStateException();
               }

               var2 = var0.field4159.method13850(-1122154423);
            }

            boolean var10000;
            label63: {
               if (var1 == 1072642345 * var0.field4152) {
                  if (var3 != 1122842785) {
                     throw new IllegalStateException();
                  }

                  if (var0.field4157 * -698145269 == var2) {
                     var10000 = false;
                     break label63;
                  }
               }

               var10000 = true;
            }

            boolean var4 = var10000;
            var0.field4152 = var1 * -737774823;
            if (var0.field4157 * -698145269 != var2) {
               var0.field4157 = 1468773795 * var2;
               var0.field4146 = 0;
               var0.method7084(2141238320);
            }

            if (var4) {
               if (var3 != 1122842785) {
                  throw new IllegalStateException();
               }

               if (null != var0.field4167) {
                  if (var3 != 1122842785) {
                     throw new IllegalStateException();
                  }

                  var0.field4167.vmethod147(-1805182445);
               }
            }

            return var4;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gt")
   public void method6917(boolean var1) {
      if (this.field4157 * -698145269 < this.field4159.method13850(-1974791741)) {
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, 1, -1144557682), var1, -1196027771);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gm")
   public void method6918(boolean var1) {
      if (this.field4157 * -698145269 < this.field4159.method13850(-678491045)) {
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, 1, -1528076684), var1, -1831124647);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gy")
   public void method6919(boolean var1) {
      if (this.field4157 * 682319188 < this.field4159.method13850(-1426061732)) {
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -306933806, 1, -1120610461), var1, -1294314322);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jw")
   public int method7035() {
      return -1136623217 * this.field4150;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jg")
   public int method7016() {
      return this.field4142 * -865118543;
   }

   @ObfuscatedSignature(descriptor = "(Llh;Ljava/lang/String;I)Z")
   @ObfuscatedName("ak")
   public static boolean method6804(classLH var0, String var1, int var2) {
      if (var0 == null) {
         var0.method6805(var1, var2);
      }

      try {
         String var3 = var0.field4159.method13854((byte)-94);
         if (!var3.equals(var1)) {
            if (var2 == -1187145812) {
               throw new IllegalStateException();
            } else {
               var1 = method7054(var0, var1, 2103407397);
               var0.field4159.method13889(var1, 1731040047);
               method6882(var0, var0.field4152 * 1072642345, var0.field4157 * -698145269, 1122842785);
               var0.method6834(var0.field4154 * -1184890025, -457263387 * var0.field4160, -1937779588);
               var0.method7073((byte)-97);
               var0.method7095((byte)83);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ge")
   public void method6930(boolean var1) {
      classAAG var2 = this.field4159.method13871(0, this.field4157 * -698145269, 421337897);
      classWB var3 = var2.method214((byte)-116);
      this.method7075(this.field4159.method13898((Integer)var3.field6654, this.field4160 * -457263387, -2138511533), var1, -1084516753);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   public void method6862(int var1) {
      try {
         if (!method6876(this, 455461300)) {
            if (var1 >= -1927903443) {
               throw new IllegalStateException();
            }

            if (-698145269 * this.field4157 > 0) {
               if (var1 >= -1927903443) {
                  throw new IllegalStateException();
               }

               int var2 = classZD.method13892(this.field4159, this.field4157 * -698145269 - 1, -1596338929);
               this.method7095((byte)75);
               method6882(this, var2, var2, 1122842785);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gf")
   public void method6931(boolean var1) {
      classAAG var2 = this.field4159.method13871(0, this.field4157 * -698145269, 804525473);
      classWB var3 = var2.method214((byte)-106);
      this.method7075(this.field4159.method13898((Integer)var3.field6654, this.field4160 * -457263387, -364913884), var1, -1441286663);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lj")
   int method7079() {
      return 236265915 * this.field4153 / this.field4159.method13911((byte)-7);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("hz")
   public void method6934(boolean var1) {
      classAAG var2 = this.field4159.method13871(0, -851926162 * this.field4157, 1589760682);
      classWB var3 = var2.method214((byte)-97);
      this.method7075(
         this.field4159.method13898((Integer)var3.field6654, 671983326 * this.field4153 + this.field4160 * 1643728608, -1628755494), var1, -2117895141
      );
   }

   @ObfuscatedSignature(descriptor = "(Llh;II)Z")
   @ObfuscatedName("vp")
   public static boolean method7098(classLH var0, int var1, int var2) {
      if (var0 == null) {
         var0.method6858(var1, var1);
      }

      try {
         switch (var0.field4150 * -1136623217) {
            case 1:
               return classSN.method10532((char)var1, 1399850494);
            case 2:
               return classTT.method11165((char)var1, -1158089553);
            case 3:
               return classEB.method3802((char)var1, (byte)8);
            case 4:
               char var3 = (char)var1;
               if (classEB.method3802(var3, (byte)-51)) {
                  if (var2 != -32389191) {
                     throw new IllegalStateException();
                  }

                  return true;
               } else {
                  if (var3 != 'k') {
                     if (var2 != -32389191) {
                        throw new IllegalStateException();
                     }

                     if (var3 != 'K') {
                        if (var2 != -32389191) {
                           throw new IllegalStateException();
                        }

                        if ('m' != var3) {
                           if (var2 != -32389191) {
                              throw new IllegalStateException();
                           }

                           if ('M' != var3 && var3 != 'b') {
                              if (var2 != -32389191) {
                                 throw new IllegalStateException();
                              }

                              if ('B' != var3) {
                                 return false;
                              }

                              if (var2 != -32389191) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  }

                  return true;
               }
            default:
               return true;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.dd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("hw")
   public void method6935(boolean var1) {
      classAAG var2 = this.field4159.method13871(0, -698145269 * this.field4157, 1569814670);
      classWB var3 = var2.method214((byte)-87);
      this.method7075(
         this.field4159.method13898((Integer)var3.field6654, 236265915 * this.field4153 + this.field4160 * -457263387, -66543215), var1, -815356890
      );
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("ht")
   public void method6938(int var1, int var2, boolean var3, boolean var4) {
      int var5 = 0;
      if (!this.field4147) {
         var5 = 0;
      } else {
         var1 += this.field4154 * -1184890025;
         var2 += -457263387 * this.field4160;
         classWB var6 = method7099(this, -1079082866);
         var5 = this.field4159.method13898(var1 - (Integer)var6.field6654, var2 - (Integer)var6.field6655, -4008281);
      }

      if (var3 && var4) {
         this.field4149 = 328689669;
         classWB var14 = this.method7064(var5, 1766856383);
         classWB var7 = this.method7064(this.field4151 * -1558750221, 788898853);
         method7060(this, var7, var14, 1801667578);
      } else if (var3) {
         this.field4149 = 328689669;
         classWB var11 = this.method7064(var5, 1851460603);
         method6882(this, (Integer)var11.field6654, (Integer)var11.field6655, 1122842785);
         this.field4151 = (Integer)var11.field6654 * -2118535877;
      } else if (var4) {
         method6882(this, this.field4151 * -1558750221, var5, 1122842785);
      } else {
         if (this.field4156 * 1398532195 <= 0 || -1558750221 * this.field4151 != var5) {
            this.field4149 = 0;
            method6882(this, var5, var5, 1122842785);
            this.field4151 = -2118535877 * var5;
         } else if (1072642345 * this.field4152 == -698145269 * this.field4157) {
            this.field4149 = 328689669;
            classWB var12 = this.method7064(var5, 1266328072);
            method6882(this, (Integer)var12.field6654, (Integer)var12.field6655, 1122842785);
         } else {
            this.field4149 = 657379338;
            classWB var13 = this.method7068(var5, -439983550);
            method6882(this, (Integer)var13.field6654, (Integer)var13.field6655, 1122842785);
         }

         this.field4156 = -745916333;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("eq")
   public static void method6892(classLH var0, boolean var1) {
      classWB var2 = var0.method7068(-698145269 * var0.field4157, -1023878629);
      var0.method7075((Integer)var2.field6655, var1, -1724040841);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("hl")
   public void method6943(int var1, int var2) {
      if (this.field4147 && this.method6982(1315498564)) {
         var1 += this.field4154 * -1184890025;
         var2 += -457263387 * this.field4160;
         classWB var3 = method7099(this, -1079082866);
         int var4 = this.field4159.method13898(var1 - (Integer)var3.field6654, var2 - (Integer)var3.field6655, -876285557);
         switch (this.field4149 * 658423413) {
            case 0:
               method6882(this, 1072642345 * this.field4152, var4, 1122842785);
               break;
            case 1:
               classWB var9 = this.method7064(-1558750221 * this.field4151, 973723901);
               classWB var10 = this.method7064(var4, 896946424);
               method7060(this, var9, var10, 1801667578);
               break;
            case 2:
               classWB var5 = this.method7068(this.field4151 * 2126895099, -1282422350);
               classWB var6 = this.method7068(var4, -969888218);
               method7060(this, var5, var6, 1801667578);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("hp")
   public void method6944(int var1, int var2) {
      if (this.field4147 && this.method6982(2104483808)) {
         var1 += this.field4154 * -1776137327;
         var2 += 1316530823 * this.field4160;
         classWB var3 = method7099(this, -1079082866);
         int var4 = this.field4159.method13898(var1 - (Integer)var3.field6654, var2 - (Integer)var3.field6655, 1317483387);
         switch (this.field4149 * 325251303) {
            case 0:
               method6882(this, -121419683 * this.field4152, var4, 1122842785);
               break;
            case 1:
               classWB var9 = this.method7064(-1558750221 * this.field4151, 1619787905);
               classWB var10 = this.method7064(var4, 1650949096);
               method7060(this, var9, var10, 1801667578);
               break;
            case 2:
               classWB var5 = this.method7068(this.field4151 * -912129595, -775987779);
               classWB var6 = this.method7068(var4, -1161205663);
               method7060(this, var5, var6, 1801667578);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("hg")
   public void method6948(Clipboard var1) {
      classAAG var2 = this.field4159.method13871(this.field4152 * -553250984, this.field4157 * -698145269, 879259947);
      if (!classAAG.method202(var2, 1947462440)) {
         String var3 = var2.method195(1191066898);
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), null);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("rm")
   public static void method6904(classLH var0, boolean var1) {
      if (-698145269 * var0.field4157 > 0) {
         classWB var2 = var0.method7064(var0.field4157 * -698145269 - 1, 1710452106);
         var0.method7075((Integer)var2.field6654, var1, -1949573059);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("hf")
   public void method6952(Clipboard var1) {
      if (this.method7049(2012791869)) {
         this.method6946(var1, -887645341);
         method6876(this, 455461300);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;II)Z")
   @ObfuscatedName("zg")
   public static boolean method6883(classLH var0, int var1, int var2) {
      if (var0 == null) {
         var0.method6850();
      }

      if (!var0.method6998((byte)-41)) {
         var0.field4152 = var1 * -737774823;
         var0.field4157 = -897094938 * var2;
         return false;
      } else {
         if (var1 > var0.field4159.method13850(-2093072720)) {
            var1 = var0.field4159.method13850(-2144335305);
         }

         if (var2 > var0.field4159.method13850(-118391600)) {
            var2 = var0.field4159.method13850(-513331700);
         }

         boolean var3 = var1 != 1072642345 * var0.field4152 || var0.field4157 * -698145269 != var2;
         var0.field4152 = var1 * -740689143;
         if (var0.field4157 * -1073262000 != var2) {
            var0.field4157 = 1468773795 * var2;
            var0.field4146 = 0;
            var0.method7084(1956662936);
         }

         if (var3 && null != var0.field4167) {
            var0.field4167.vmethod147(-2138664229);
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("hk")
   public void method6953(Clipboard var1) {
      if (this.method7049(2012791869)) {
         this.method6946(var1, -887645341);
         method6876(this, 455461300);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ly")
   boolean method7091(int var1) {
      return 32 == var1 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gn")
   public void method6920(boolean var1) {
      if (this.field4157 * -698145269 < this.field4159.method13850(949849243)) {
         this.method7075(classZD.method13901(this.field4159, this.field4157 * -698145269, 1, -2074372504), var1, -1115995114);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("cz")
   public static void method6905(classLH var0, boolean var1) {
      if (var0 == null) {
         var0.method6996();
      }

      if (-698145269 * var0.field4157 > 0) {
         classWB var2 = var0.method7064(var0.field4157 * -698145269 - 1, 1662927646);
         var0.method7075((Integer)var2.field6654, var1, -1466259815);
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bp")
   public void method6906(boolean var1, byte var2) {
      try {
         if (-698145269 * this.field4157 > 0) {
            classWB var3 = this.method7064(this.field4157 * -698145269 - 1, 1743339920);
            this.method7075((Integer)var3.field6654, var1, -1392853539);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llm;)V")
   @ObfuscatedName("hq")
   public void method6964(classLM var1) {
      this.field4166 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Llh;B)V")
   @ObfuscatedName("fh")
   public static void method6956(classLH var0, byte var1) {
      if (var0 == null) {
         var0.method6957(var1);
      } else {
         try {
            var0.field4160 = Math.max(0, var0.field4160 * -457263387 - var0.field4159.method13911((byte)54)) * -1673193747;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "lh.be(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("dm")
   public static String method7054(classLH var0, String var1, int var2) {
      if (var0 == null) {
         return var0.method7058(var1, var2);
      } else {
         try {
            StringBuilder var3 = new StringBuilder(var1.length());

            for (int var4 = 0; var4 < var1.length(); var4++) {
               if (var2 <= 1906148269) {
                  throw new IllegalStateException();
               }

               char var5 = var1.charAt(var4);
               if (method7098(var0, var5, -32389191)) {
                  if (var2 <= 1906148269) {
                     throw new IllegalStateException();
                  }

                  var3.append(var5);
               }
            }

            return var3.toString();
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "lh.ch(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llm;)V")
   @ObfuscatedName("he")
   public void method6965(classLM var1) {
      this.field4166 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lzd;")
   @ObfuscatedName("hc")
   public classZD method6971() {
      return this.field4159;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ki")
   String method7055(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (method7098(this, var4, -32389191)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gh")
   public void method6936(boolean var1) {
      classAAG var2 = this.field4159.method13871(0, -698145269 * this.field4157, 1614579070);
      classWB var3 = var2.method214((byte)-126);
      this.method7075(
         this.field4159.method13898((Integer)var3.field6654, 236265915 * this.field4153 + this.field4160 * -457263387, -1678073262), var1, -1411214580
      );
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ep")
   public void method6959() {
      int var1 = Math.max(0, this.field4159.method13908((byte)5) - this.field4153 * -1486692866);
      this.field4160 = Math.min(var1, this.field4160 * -1875705624 + this.field4159.method13911((byte)-26)) * -859764701;
   }

   @ObfuscatedSignature(descriptor = "(I)Lwb;")
   @ObfuscatedName("kt")
   classWB method7065(int var1) {
      int var2 = this.field4159.method13850(187315475);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (method7089(this, this.field4159.method13839(var5 - 1, -1052717093).field117, -1747129619)) {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (method7089(this, this.field4159.method13839(var6, -1052717093).field117, 804032749)) {
            var4 = var6;
            break;
         }
      }

      return new classWB(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "()Lzd;")
   @ObfuscatedName("hv")
   public classZD method6975() {
      return this.field4144;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)Z")
   @ObfuscatedName("ka")
   public static boolean method6797(classLH var0, boolean var1) {
      if (var0 == null) {
         var0.method7086();
      }

      var1 = var1 && var0.field4145;
      boolean var2 = var1 != var0.field4143;
      var0.field4143 = var1;
      if (!var0.field4143) {
         method6882(var0, var0.field4157 * -698145269, var0.field4157 * -698145269, 1122842785);
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cx")
   int method7080(int var1) {
      try {
         return 236265915 * this.field4153 / this.field4159.method13911((byte)-26);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cx(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)V")
   @ObfuscatedName("tf")
   public static void method7085(classLH var0) {
      classAAG var1 = var0.field4159.method13871(0, -1717450966 * var0.field4157, 542889153);
      classWB var2 = var1.method214((byte)-80);
      int var3 = var0.field4159.method13911((byte)37);
      int var4 = (Integer)var2.field6654 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field6655 - 3;
      int var7 = var6 + 6 + var3;
      int var8 = -469357513 * var0.field4154;
      int var9 = -264213154 * var0.field4158 + var8;
      int var10 = -457263387 * var0.field4160;
      int var11 = 1858361115 * var0.field4153 + var10;
      int var12 = -1184890025 * var0.field4154;
      int var13 = var0.field4160 * -457263387;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - 2084178789 * var0.field4158;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - 236265915 * var0.field4153;
      }

      var0.method6834(var12, var13, 177778694);
   }

   @ObfuscatedSignature(descriptor = "(ZI)Z")
   @ObfuscatedName("af")
   public boolean method6798(boolean var1, int var2) {
      try {
         boolean var10000;
         label42: {
            if (var1) {
               if (var2 <= 1378509712) {
                  throw new IllegalStateException();
               }

               if (this.field4145) {
                  if (var2 <= 1378509712) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
                  break label42;
               }
            }

            var10000 = false;
         }

         var1 = var10000;
         if (var1 != this.field4143) {
            if (var2 <= 1378509712) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         this.field4143 = var1;
         if (!this.field4143) {
            if (var2 <= 1378509712) {
               throw new IllegalStateException();
            }

            method6882(this, this.field4157 * -698145269, this.field4157 * -698145269, 1122842785);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kp")
   public boolean method6999() {
      return this.field4147;
   }

   @ObfuscatedSignature(descriptor = "()Laag;")
   @ObfuscatedName("ix")
   public classAAG method6980() {
      return this.field4159.method13871(this.field4152 * 1072642345, this.field4157 * -698145269, 390586135);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("iq")
   public boolean method6983() {
      return this.field4143;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("in")
   public boolean method6984() {
      return this.field4143;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gk")
   public void method6907(boolean var1) {
      if (552303156 * this.field4157 > 0) {
         classWB var2 = this.method7064(this.field4157 * -698145269 - 1, 1588892639);
         this.method7075((Integer)var2.field6654, var1, -1662582798);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;II)V")
   @ObfuscatedName("dt")
   public static void method7043(classLH var0, int var1, int var2) {
      if (var0 == null) {
         var0.method6945(var1, var1);
      }

      try {
         var0.field4159.method13857(var1, 1691814797);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.cc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("il")
   public boolean method6987() {
      return this.field4145;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("iu")
   public boolean method6988() {
      return this.field4145;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ie")
   public boolean method6990() {
      return this.method6982(1082709922) && -1569689927 * this.field4146 % 1027280650 < 30;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eq")
   public void method6843(int var1) {
      classZD.method13868(this.field4159, var1, (byte)112);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("ag")
   boolean method6809(String var1, int var2) {
      try {
         this.field4144.method13889(var1, 1609355660);
         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("if")
   public int method6993() {
      return -698145269 * this.field4157;
   }

   @ObfuscatedSignature(descriptor = "(Llh;I)Z")
   @ObfuscatedName("jt")
   public static boolean method6876(classLH var0, int var1) {
      if (var0 == null) {
         return var0.method6877(var1);
      } else {
         try {
            if (!var0.method7049(2012791869)) {
               if (var1 != 455461300) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               int var2 = var0.field4159.method13893(1072642345 * var0.field4152, -698145269 * var0.field4157, -477828373);
               var0.method7095((byte)83);
               method6882(var0, var2, var2, 1122842785);
               return true;
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "lh.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iw")
   public int method6996() {
      return this.field4152 * 1072642345;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("io")
   public int method6997() {
      return this.field4152 * 1072642345;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kx")
   public boolean method7000() {
      return this.field4147;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cd")
   public int method7017(int var1) {
      try {
         return this.field4142 * 1701882209;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cd(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;Ljava/awt/datatransfer/Clipboard;I)V")
   @ObfuscatedName("jo")
   public static void method6954(classLH var0, Clipboard var1, int var2) {
      if (var0 == null) {
         var0.method6955(var1, var2);
      }

      try {
         Transferable var3 = var1.getContents(null);
         if (var3 != null && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            if (var2 <= -324749371) {
               return;
            }

            try {
               String var4 = method7054(var0, (String)var3.getTransferData(DataFlavor.stringFlavor), 2013546798);
               method6876(var0, 455461300);
               classZP var5 = var0.field4159.method13877(var4, -698145269 * var0.field4157, var0.field4155 * 1030611083, (byte)39);
               method6882(var0, var5.method14079(-589811403), var5.method14079(-391538325), 1122842785);
               var0.method7073((byte)-5);
               var0.method7095((byte)39);
            } catch (Exception var6) {
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "lh.bi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ic")
   public int method7002() {
      return 1821966956 * this.field4154;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ik")
   public int method7004() {
      return -457263387 * this.field4160;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   public boolean method6818(int var1, int var2) {
      boolean var3 = -568560274 * this.field4158 != var1 || this.field4153 * 236265915 != var2;
      this.field4158 = -1429954145 * var1;
      this.field4153 = 1394555105 * var2;
      return var3 | this.method6834(this.field4154 * -1184890025, this.field4160 * -457263387, 674609066);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ii")
   public int method7005() {
      return -457263387 * this.field4160;
   }

   @ObfuscatedSignature(descriptor = "(Lte;II)Ljava/lang/Object;")
   @ObfuscatedName("aw")
   public static Object method7023(classTE var0, int var1, int var2) {
      try {
         classOL.method8512(var0, 1327640383);
         if (var1 >= 0) {
            if (var1 < -1943548931 * var0.field6131) {
               Object var3 = var0.method10759(var1, (byte)-1);
               if (var1 < -1943548931 * var0.field6131 - 1) {
                  if (var2 <= -1095404274) {
                     throw new IllegalStateException();
                  }

                  classMX.method7739(var0, var1 + 1, var0, var1, -1943548931 * var0.field6131 - (var1 + 1), -2146130524);
               }

               classTE.method10782(var0, -1943548931 * var0.field6131 - 1, (byte)2);
               var0.field6133 = true;
               return var3;
            }

            if (var2 <= -1095404274) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ju")
   public int method7009() {
      return this.field4159.method13923(134253707);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ek")
   public boolean method6857(int var1) {
      if (method7098(this, var1, -32389191)) {
         method6876(this, 455461300);
         classZP var2 = this.field4159.method13875((char)var1, -698145269 * this.field4157, this.field4155 * 1030611083, (byte)23);
         method6882(this, var2.method14079(-1567180497), var2.method14079(717730848), 1122842785);
         this.method7073((byte)-47);
         this.method7095((byte)65);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jz")
   public int method7010() {
      return this.field4159.method13923(2040537729);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jq")
   public int method7013() {
      return this.field4159.method13930(-1321894998);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("cq")
   public int method7011(byte var1) {
      try {
         return this.field4159.method13923(1105844075);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;Lwb;Lwb;I)V")
   @ObfuscatedName("dy")
   public static void method7060(classLH var0, classWB var1, classWB var2, int var3) {
      if (var0 == null) {
         var0.method7062(var1, var1, var3);
      } else {
         try {
            if ((Integer)var2.field6654 < (Integer)var1.field6654) {
               if (var3 != 1801667578) {
                  throw new IllegalStateException();
               }

               method6882(var0, (Integer)var1.field6655, (Integer)var2.field6654, 1122842785);
            } else {
               method6882(var0, (Integer)var1.field6654, (Integer)var2.field6655, 1122842785);
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "lh.cz(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;ZI)V")
   @ObfuscatedName("gr")
   public static void method6800(classLH var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method6937(var1, var2);
      }

      try {
         boolean var10001;
         label27: {
            var0.field4145 = var1;
            if (var1) {
               if (var2 == -531711453) {
                  throw new IllegalStateException();
               }

               if (var0.field4143) {
                  if (var2 == -531711453) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
                  break label27;
               }
            }

            var10001 = false;
         }

         var0.field4143 = var10001;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ja")
   public int method7019() {
      return this.field4148 * 747182635;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jm")
   public int method7036() {
      return -1136623217 * this.field4150;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ji")
   public void method7022(int var1) {
      this.field4148 = -1971006333 * var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fu")
   public void method6867() {
      if (!method6876(this, 455461300) && this.field4157 * -442353210 < this.field4159.method13850(1323492499)) {
         int var1 = classZD.method13892(this.field4159, this.field4157 * -698145269, -1596338929);
         this.method7095((byte)32);
         method6882(this, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lh")
   void method7086() {
      classAAG var1 = this.field4159.method13871(0, -698145269 * this.field4157, 1641481856);
      classWB var2 = var1.method214((byte)-74);
      int var3 = this.field4159.method13911((byte)-7);
      int var4 = (Integer)var2.field6654 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field6655 - 3;
      int var7 = var6 + 6 + var3;
      int var8 = -1184890025 * this.field4154;
      int var9 = 2084178789 * this.field4158 + var8;
      int var10 = -457263387 * this.field4160;
      int var11 = 236265915 * this.field4153 + var10;
      int var12 = -1184890025 * this.field4154;
      int var13 = this.field4160 * -457263387;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - 2084178789 * this.field4158;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - 236265915 * this.field4153;
      }

      this.method6834(var12, var13, 493636127);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jc")
   public int method7026() {
      return this.field4159.method13938(-291544566);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jo")
   public int method7027() {
      return this.field4159.method13938(-1204457614);
   }

   @ObfuscatedSignature(descriptor = "(Llh;IIZZI)V")
   @ObfuscatedName("im")
   public static void method6939(classLH var0, int var1, int var2, boolean var3, boolean var4, int var5) {
      if (var0 == null) {
         var0.method6940(var1, var1, var3, var3, var1);
      }

      try {
         int var6 = 0;
         if (!var0.field4147) {
            if (var5 != 14704747) {
               return;
            }

            var6 = 0;
         } else {
            var1 += var0.field4154 * -1184890025;
            var2 += -457263387 * var0.field4160;
            classWB var7 = method7099(var0, -1079082866);
            var6 = var0.field4159.method13898(var1 - (Integer)var7.field6654, var2 - (Integer)var7.field6655, -889448140);
         }

         if (var3) {
            if (var5 != 14704747) {
               throw new IllegalStateException();
            }

            if (var4) {
               if (var5 != 14704747) {
                  throw new IllegalStateException();
               }

               var0.field4149 = 328689669;
               classWB var16 = var0.method7064(var6, 1531811288);
               classWB var8 = var0.method7064(var0.field4151 * -1558750221, 1656527774);
               method7060(var0, var8, var16, 1801667578);
               return;
            }
         }

         if (var3) {
            var0.field4149 = 328689669;
            classWB var13 = var0.method7064(var6, 941917352);
            method6882(var0, (Integer)var13.field6654, (Integer)var13.field6655, 1122842785);
            var0.field4151 = (Integer)var13.field6654 * -2118535877;
         } else if (var4) {
            method6882(var0, var0.field4151 * -1558750221, var6, 1122842785);
         } else {
            label71: {
               if (var0.field4156 * 1398532195 > 0) {
                  if (var5 != 14704747) {
                     throw new IllegalStateException();
                  }

                  if (-1558750221 * var0.field4151 == var6) {
                     if (var5 != 14704747) {
                        throw new IllegalStateException();
                     }

                     if (1072642345 * var0.field4152 == -698145269 * var0.field4157) {
                        if (var5 != 14704747) {
                           throw new IllegalStateException();
                        }

                        var0.field4149 = 328689669;
                        classWB var14 = var0.method7064(var6, 1840928457);
                        method6882(var0, (Integer)var14.field6654, (Integer)var14.field6655, 1122842785);
                     } else {
                        var0.field4149 = 657379338;
                        classWB var15 = var0.method7068(var6, -798068502);
                        method6882(var0, (Integer)var15.field6654, (Integer)var15.field6655, 1122842785);
                     }
                     break label71;
                  }
               }

               var0.field4149 = 0;
               method6882(var0, var6, var6, 1122842785);
               var0.field4151 = -2118535877 * var6;
            }

            var0.field4156 = -745916333;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "lh.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jt")
   public void method7029(int var1) {
      this.field4159.method13941(var1, 1893807923);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jx")
   public void method7030(int var1) {
      this.field4159.method13941(var1, 745205026);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gz")
   public void method6909(boolean var1) {
      if (-698145269 * this.field4157 < this.field4159.method13850(2130163215)) {
         classWB var2 = this.method7064(1 + this.field4157 * -698145269, 2129664245);
         this.method7075((Integer)var2.field6655, var1, -2025593619);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jh")
   public int method7037() {
      return 1426203687 * this.field4150;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("eo")
   public boolean method6823(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field4159.method13923(1709469416);
      classZD.method13926(this.field4159, var1, -2054023757);
      classZD.method13926(this.field4144, var1, -2091352093);
      if (this.method7073((byte)-50)) {
         this.method7095((byte)24);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jp")
   public int method7040() {
      return this.field4159.method13946(-504149574);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jb")
   public int method7041() {
      return this.field4159.method13946(-504149574);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("je")
   public void method7044(int var1) {
      this.field4159.method13857(var1, 850957696);
   }

   @ObfuscatedSignature(descriptor = "(Llh;B)V")
   @ObfuscatedName("bb")
   public static void method6869(classLH var0, byte var1) {
      if (var0 == null) {
         var0.method6960(var1);
      }

      try {
         if (!method6876(var0, 455461300)) {
            if (var1 == 2) {
               return;
            }

            if (var0.field4157 * -698145269 > 0) {
               if (var1 == 2) {
                  throw new IllegalStateException();
               }

               classWB var2 = var0.method7064(-698145269 * var0.field4157 - 1, 1573931620);
               int var3 = var0.field4159.method13893((Integer)var2.field6654, var0.field4157 * -698145269, 1205805656);
               var0.method7095((byte)109);
               method6882(var0, var3, var3, 1122842785);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.ar(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)V")
   @ObfuscatedName("pd")
   public static void method6863(classLH var0) {
      if (var0 == null) {
         var0.method6864();
      }

      if (!method6876(var0, 455461300) && -1410705525 * var0.field4157 > 0) {
         int var1 = classZD.method13892(var0.field4159, var0.field4157 * -698145269 - 1, -1596338929);
         var0.method7095((byte)81);
         method6882(var0, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ij")
   public boolean method7046() {
      return method7014(this, -2118783281) > 1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ig")
   public boolean method7047() {
      return method7014(this, -2118783281) > 1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("it")
   public boolean method7048() {
      return method7014(this, -2118783281) > 1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ks")
   boolean method7050() {
      return this.field4157 * -698145269 != this.field4152 * 1072642345;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ko")
   boolean method7051() {
      return this.field4157 * -698145269 != this.field4152 * 1072642345;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kr")
   boolean method7052() {
      return this.field4157 * 1795960488 != this.field4152 * 1072642345;
   }

   @ObfuscatedSignature(descriptor = "(Llm;)V")
   @ObfuscatedName("hy")
   public void method6968(classLM var1) {
      this.field4167 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("kq")
   String method7056(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (method7098(this, var4, -32389191)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ka")
   String method7057(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (method7098(this, var4, -32389191)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dy")
   void method6796() {
      this.field4146 = (1 + this.field4146 * -1569689927) % 60 * -1662830711;
      if (1398532195 * this.field4156 > 0) {
         this.field4156 -= -373434037;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;I)I")
   @ObfuscatedName("pw")
   public static int method7014(classLH var0, int var1) {
      if (var0 == null) {
         return var0.method7015(var1);
      } else {
         try {
            return var0.field4159.method13930(-1980073237);
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "lh.cl(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwb;Lwb;)V")
   @ObfuscatedName("kw")
   void method7061(classWB var1, classWB var2) {
      if ((Integer)var2.field6654 < (Integer)var1.field6654) {
         method6882(this, (Integer)var1.field6655, (Integer)var2.field6654, 1122842785);
      } else {
         method6882(this, (Integer)var1.field6654, (Integer)var2.field6655, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llm;I)V")
   @ObfuscatedName("bf")
   public void method6969(classLM var1, int var2) {
      try {
         this.field4167 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lwb;")
   @ObfuscatedName("kb")
   classWB method7066(int var1) {
      int var2 = this.field4159.method13850(659229269);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (method7089(this, this.field4159.method13839(var5 - 1, -1052717093).field117, -1487936950)) {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (method7089(this, this.field4159.method13839(var6, -1052717093).field117, 511322815)) {
            var4 = var6;
            break;
         }
      }

      return new classWB(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Llh;IS)V")
   @ObfuscatedName("kx")
   public static void method7031(classLH var0, int var1, short var2) {
      if (var0 == null) {
         var0.method7032(var1, var2);
      }

      try {
         var0.field4159.method13941(var1, 879949851);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.co(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lwb;")
   @ObfuscatedName("kj")
   classWB method7067(int var1) {
      int var2 = this.field4159.method13850(2209403);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (method7089(this, this.field4159.method13839(var5 - 1, -1052717093).field117, -1803259437)) {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (method7089(this, this.field4159.method13839(var6, -1052717093).field117, 370641079)) {
            var4 = var6;
            break;
         }
      }

      return new classWB(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)Lwb;")
   @ObfuscatedName("kn")
   classWB method7070(int var1) {
      int var2 = this.field4159.method13850(-1063084926);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (this.field4159.method13839(var5 - 1, -1052717093).field117 == '\n') {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.field4159.method13839(var6, -1052717093).field117 == '\n') {
            var4 = var6;
            break;
         }
      }

      return new classWB(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)Lwb;")
   @ObfuscatedName("ku")
   classWB method7071(int var1) {
      int var2 = this.field4159.method13850(749673156);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (this.field4159.method13839(var5 - 1, -1052717093).field117 == '\n') {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.field4159.method13839(var6, -1052717093).field117 == '\n') {
            var4 = var6;
            break;
         }
      }

      return new classWB(var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("jc")
   public static void method6801(classLH var0, boolean var1) {
      if (var0 == null) {
         var0.method6918(var1);
      } else {
         var0.field4145 = var1;
         var0.field4143 = var1 && var0.field4143;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jy")
   public int method7042() {
      return this.field4159.method13946(-504149574);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)Z")
   @ObfuscatedName("rc")
   public static boolean method6991(classLH var0) {
      return var0 == null ? var0.method6992() : var0.method6982(1386916343) && 138766506 * var0.field4146 % 60 < 30;
   }

   @ObfuscatedSignature(descriptor = "(I)Lwb;")
   @ObfuscatedName("kz")
   classWB method7072(int var1) {
      int var2 = this.field4159.method13850(1473584921);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (this.field4159.method13839(var5 - 1, -1052717093).field117 == '\n') {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.field4159.method13839(var6, -1052717093).field117 == '\n') {
            var4 = var6;
            break;
         }
      }

      return new classWB(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("kc")
   void method7076(int var1, boolean var2) {
      if (var2) {
         method6882(this, 1072642345 * this.field4152, var1, 1122842785);
      } else {
         method6882(this, var1, var1, 1122842785);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;I)V")
   @ObfuscatedName("nc")
   public static void method6844(classLH var0, int var1) {
      if (var0 == null) {
         var0.method7033(var1);
      }

      classZD.method13868(var0.field4159, var1, (byte)112);
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("kl")
   void method7077(int var1, boolean var2) {
      if (var2) {
         method6882(this, 1072642345 * this.field4152, var1, 1122842785);
      } else {
         method6882(this, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("km")
   void method7078(int var1, boolean var2) {
      if (var2) {
         method6882(this, -636870908 * this.field4152, var1, 1122842785);
      } else {
         method6882(this, var1, var1, 1122842785);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;II)Z")
   @ObfuscatedName("ys")
   public static boolean method6819(classLH var0, int var1, int var2) {
      boolean var3 = 2084178789 * var0.field4158 != var1 || var0.field4153 * 236265915 != var2;
      var0.field4158 = -1191629203 * var1;
      var0.field4153 = -526943373 * var2;
      return var3 | var0.method6834(var0.field4154 * -1184890025, var0.field4160 * -457263387, 204110968);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fk")
   public void method6893(boolean var1) {
      classWB var2 = this.method7068(1134208878 * this.field4157, -378442949);
      this.method7075((Integer)var2.field6655, var1, -1238332320);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ky")
   int method7081() {
      return 236265915 * this.field4153 / this.field4159.method13911((byte)17);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("cr")
   public int method6994(byte var1) {
      try {
         return -698145269 * this.field4157;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cr(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lm")
   int method7082() {
      return 236265915 * this.field4153 / this.field4159.method13911((byte)6);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lf")
   int method7083() {
      return 177023888 * this.field4153 / this.field4159.method13911((byte)26);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lz")
   void method7087() {
      classAAG var1 = this.field4159.method13871(0, -1559125646 * this.field4157, 1631990628);
      classWB var2 = var1.method214((byte)-117);
      int var3 = this.field4159.method13911((byte)-64);
      int var4 = (Integer)var2.field6654 - 10;
      int var5 = var4 + 20;
      int var6 = (Integer)var2.field6655 - 3;
      int var7 = var6 + 6 + var3;
      int var8 = -1379499806 * this.field4154;
      int var9 = 2084178789 * this.field4158 + var8;
      int var10 = -457263387 * this.field4160;
      int var11 = 236265915 * this.field4153 + var10;
      int var12 = 81567582 * this.field4154;
      int var13 = this.field4160 * -457263387;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - 2084178789 * this.field4158;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - 236265915 * this.field4153;
      }

      this.method6834(var12, var13, -524743527);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("lb")
   boolean method7092(int var1) {
      return -311851207 == var1 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("lg")
   boolean method7093(int var1) {
      return 32 == var1 || var1 == 10 || var1 == 9;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ip")
   public int method7006() {
      return -457263387 * this.field4160;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kg")
   boolean method7053() {
      return this.field4157 * 340310096 != this.field4152 * 1072642345;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lx")
   void method7096() {
      if (this.field4166 != null) {
         this.field4166.vmethod147(-1927177938);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lwb;")
   @ObfuscatedName("ll")
   classWB method7101() {
      int var1 = this.field4159.method13950(this.field4158 * 2084178789, (byte)-82);
      int var2 = this.field4159.method13952(this.field4153 * -1536341234, 2052033943);
      return new classWB(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()Lwb;")
   @ObfuscatedName("lv")
   classWB method7102() {
      int var1 = this.field4159.method13950(this.field4158 * 2084178789, (byte)-51);
      int var2 = this.field4159.method13952(this.field4153 * 236265915, -302596493);
      return new classWB(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Llh;Laaa;I)Z")
   @ObfuscatedName("sq")
   public static boolean method6813(classLH var0, AbstractFont var1, int var2) {
      if (var0 == null) {
         return var0.method6814(var1, var2);
      } else {
         try {
            boolean var10000;
            if (!var0.field4147) {
               if (var2 >= 693068370) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var3 = var10000;
            classZD.method13863(var0.field4159, var1, 180707768);
            classZD.method13863(var0.field4144, var1, -707528356);
            var0.field4147 = true;
            var3 |= var0.method6834(var0.field4154 * -1184890025, var0.field4160 * -457263387, -586031462);
            var3 |= method6882(var0, var0.field4152 * 1072642345, -698145269 * var0.field4157, 1122842785);
            if (var0.method7073((byte)-7)) {
               var0.method7095((byte)80);
               var3 = true;
            }

            return var3;
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "lh.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jn")
   public int method7028() {
      return this.field4159.method13938(1847526189);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bv")
   static int method7105(int var0) {
      try {
         byte var10000;
         if (client.field861) {
            if (var0 == -1798574594) {
               throw new IllegalStateException();
            }

            var10000 = 2;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "lh.bv(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("dz")
   boolean method6810(String var1) {
      this.field4159.method13889(var1, 1424169415);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fa")
   public void method6898(boolean var1) {
      this.method7075(this.field4159.method13923(-1128555433), var1, -1959632676);
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ao")
   public boolean method6833(int var1, byte var2) {
      try {
         this.field4148 = 1211480737 * var1;
         if (this.method7073((byte)-78)) {
            if (var2 == 0) {
               throw new IllegalStateException();
            } else {
               this.method7095((byte)33);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ar")
   public void method6960(byte var1) {
      try {
         int var2 = Math.max(0, this.field4144.method13906((byte)93) - this.field4160 * 236265915);
         this.field4152 = Math.min(var2, this.field4155 * -457263387 + this.field4144.method13908((byte)-61)) * -1673193747;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bj")
   public void method6926(boolean var1, int var2) {
      try {
         if (this.field4142 * -698145269 < this.field4159.method13949(-540295366)) {
            if (var2 != 988636327) {
               throw new IllegalStateException();
            }

            int var3 = this.method7080(1715761966);
            this.method7075(classZD.method13901(this.field4159, this.field4150 * -698145269, var3, -1245485915), var1, -1104674755);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bk")
   public void method6932(boolean var1, int var2) {
      try {
         classAAG var3 = this.field4159.method13871(0, this.field4158 * -698145269, 1003674895);
         classWB var4 = var3.method214((byte)-25);
         this.method7075(this.field4144.method13898((Integer)var4.field6654, this.field4146 * -457263387, -683973827), var1, -1667191298);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZZI)V")
   @ObfuscatedName("bu")
   public void method6940(int var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         int var6 = 0;
         if (!this.field4145) {
            if (var5 != 14704747) {
               return;
            }

            var6 = 0;
         } else {
            var1 += this.field4146 * -1184890025;
            var2 += -457263387 * this.field4149;
            classWB var7 = method7099(this, -1079082866);
            var6 = this.field4144.method13898(var1 - (Integer)var7.field6654, var2 - (Integer)var7.field6655, -889448140);
         }

         if (var3) {
            if (var5 != 14704747) {
               throw new IllegalStateException();
            }

            if (var4) {
               if (var5 != 14704747) {
                  throw new IllegalStateException();
               }

               this.field4156 = 328689669;
               classWB var16 = this.method7064(var6, 1531811288);
               classWB var8 = this.method7068(this.field4152 * -1558750221, 1656527774);
               method7060(this, var8, var16, 1801667578);
               return;
            }
         }

         if (var3) {
            this.field4142 = 328689669;
            classWB var13 = this.method7068(var6, 941917352);
            method6882(this, (Integer)var13.field6654, (Integer)var13.field6654, 1122842785);
            this.field4142 = (Integer)var13.field6655 * -2118535877;
         } else if (var4) {
            method6882(this, this.field4152 * -1558750221, var6, 1122842785);
         } else {
            label69: {
               if (this.field4148 * 1398532195 > 0) {
                  if (var5 != 14704747) {
                     throw new IllegalStateException();
                  }

                  if (-1558750221 * this.field4151 == var6) {
                     if (var5 != 14704747) {
                        throw new IllegalStateException();
                     }

                     if (1072642345 * this.field4142 == -698145269 * this.field4157) {
                        if (var5 != 14704747) {
                           throw new IllegalStateException();
                        }

                        this.field4155 = 328689669;
                        classWB var14 = this.method7064(var6, 1840928457);
                        method6882(this, (Integer)var14.field6654, (Integer)var14.field6654, 1122842785);
                     } else {
                        this.field4142 = 657379338;
                        classWB var15 = this.method7068(var6, -798068502);
                        method6882(this, (Integer)var15.field6655, (Integer)var15.field6655, 1122842785);
                     }
                     break label69;
                  }
               }

               this.field4157 = 0;
               method6882(this, var6, var6, 1122842785);
               this.field4146 = -2118535877 * var6;
            }

            this.field4151 = -745916333;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "lh.bu(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;Ljava/lang/String;)V")
   @ObfuscatedName("gf")
   public static void method6793(classQY var0, String var1) {
      if (var0 == null) {
         var0.method9859(var1);
      } else {
         if (var1 != null && !var1.isEmpty()) {
            var0.field5625.remove(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V")
   @ObfuscatedName("bb")
   public void method6955(Clipboard var1, int var2) {
      try {
         Transferable var3 = var1.getContents(null);
         if (var3 != null && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            if (var2 <= -324749371) {
               return;
            }

            try {
               String var4 = method7054(this, (String)var3.getTransferData(DataFlavor.stringFlavor), 2013546798);
               method6876(this, 455461300);
               classZP var5 = this.field4144.method13877(var4, -698145269 * this.field4154, this.field4158 * 1030611083, (byte)39);
               method6882(this, var5.method14079(-589811403), var5.method14079(-391538325), 1122842785);
               this.method7073((byte)-5);
               this.method7095((byte)39);
            } catch (Exception var6) {
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "lh.bi(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;IIZZ)V")
   @ObfuscatedName("ol")
   public static void method6941(classLH var0, int var1, int var2, boolean var3, boolean var4) {
      if (var0 == null) {
         var0.method6851();
      }

      int var5 = 0;
      if (!var0.field4147) {
         var5 = 0;
      } else {
         var1 += var0.field4154 * -1184890025;
         var2 += -457263387 * var0.field4160;
         classWB var6 = method7099(var0, -1079082866);
         var5 = var0.field4159.method13898(var1 - (Integer)var6.field6654, var2 - (Integer)var6.field6655, 155745000);
      }

      if (var3 && var4) {
         var0.field4149 = 328689669;
         classWB var14 = var0.method7064(var5, 1156104700);
         classWB var7 = var0.method7064(var0.field4151 * -1558750221, 1427318757);
         method7060(var0, var7, var14, 1801667578);
      } else if (var3) {
         var0.field4149 = 328689669;
         classWB var11 = var0.method7064(var5, 1182576901);
         method6882(var0, (Integer)var11.field6654, (Integer)var11.field6655, 1122842785);
         var0.field4151 = (Integer)var11.field6654 * -2118535877;
      } else if (var4) {
         method6882(var0, var0.field4151 * -1558750221, var5, 1122842785);
      } else {
         if (var0.field4156 * 1398532195 <= 0 || -1558750221 * var0.field4151 != var5) {
            var0.field4149 = 0;
            method6882(var0, var5, var5, 1122842785);
            var0.field4151 = -2118535877 * var5;
         } else if (1072642345 * var0.field4152 == -698145269 * var0.field4157) {
            var0.field4149 = 328689669;
            classWB var12 = var0.method7064(var5, 1883015778);
            method6882(var0, (Integer)var12.field6654, (Integer)var12.field6655, 1122842785);
         } else {
            var0.field4149 = 657379338;
            classWB var13 = var0.method7068(var5, -1210966479);
            method6882(var0, (Integer)var13.field6654, (Integer)var13.field6655, 1122842785);
         }

         var0.field4156 = -745916333;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("be")
   public void method6957(byte var1) {
      try {
         this.field4148 = Math.max(0, this.field4153 * -457263387 - this.field4159.method13906((byte)54)) * -1673193747;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.be(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)I")
   @ObfuscatedName("ft")
   public static int method7012(classLH var0) {
      return var0.field4159.method13923(1353637852);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("by")
   public void method6868(byte var1) {
      try {
         if (!method6876(this, 455461300)) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            }

            if (this.field4160 * -698145269 < this.field4144.method13923(1950622253)) {
               if (var1 <= 2) {
                  return;
               }

               int var2 = classZD.method13892(this.field4144, this.field4146 * -698145269, -1596338929);
               this.method7095((byte)38);
               method6882(this, var2, var2, 1122842785);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llm;B)V")
   @ObfuscatedName("bq")
   public void method6966(classLM var1, byte var2) {
      try {
         this.field4166 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.bq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzd;")
   @ObfuscatedName("bd")
   public classZD method6976(int var1) {
      try {
         return this.field4159;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.bd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Laag;")
   @ObfuscatedName("bl")
   public classAAG method6981(int var1) {
      try {
         return this.field4144.method13871(this.field4155 * 1072642345, this.field4148 * -698145269, 176225300);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ae")
   public void method6937(boolean var1, int var2) {
      try {
         classAAG var3 = this.field4159.method13871(0, -698145269 * this.field4142, 740848598);
         classWB var4 = var3.method214((byte)-50);
         this.method7075(
            this.field4144.method13898((Integer)var4.field6655, 236265915 * this.field4148 + this.field4160 * -457263387, -1610974692), var1, -2063257757
         );
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.bo(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)V")
   @ObfuscatedName("hm")
   public static void method6961(classLH var0) {
      int var1 = Math.max(0, var0.field4159.method13908((byte)85) - var0.field4153 * 236265915);
      var0.field4160 = Math.min(var1, var0.field4160 * -457263387 + var0.field4159.method13911((byte)63)) * -1673193747;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cl")
   public int method7015(int var1) {
      try {
         return this.field4159.method13913(-1980073237);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)V")
   @ObfuscatedName("co")
   public void method7032(int var1, short var2) {
      try {
         this.field4144.method13941(var1, 879949851);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.co(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cc")
   public void method6945(int var1, int var2) {
      if (this.field4143 && this.method6823(2104483808)) {
         var1 += this.field4158 * -1776137327;
         var2 += 1316530823 * this.field4155;
         classWB var3 = method7099(this, -1079082866);
         int var4 = this.field4144.method13893(var1 - (Integer)var3.field6654, var2 - (Integer)var3.field6655, 1317483387);
         switch (this.field4151 * 325251303) {
            case 0:
               method6882(this, -121419683 * this.field4148, var4, 1122842785);
               break;
            case 1:
               classWB var9 = this.method7068(-1558750221 * this.field4157, 1619787905);
               classWB var10 = this.method7064(var4, 1650949096);
               method7060(this, var9, var10, 1801667578);
               break;
            case 2:
               classWB var5 = this.method7068(this.field4142 * -912129595, -775987779);
               classWB var6 = this.method7064(var4, -1161205663);
               method7060(this, var5, var6, 1801667578);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwb;Lwb;I)V")
   @ObfuscatedName("cz")
   void method7062(classWB var1, classWB var2, int var3) {
      try {
         if ((Integer)var2.field6655 < (Integer)var1.field6655) {
            if (var3 != 1801667578) {
               throw new IllegalStateException();
            }

            method6882(this, (Integer)var1.field6654, (Integer)var2.field6655, 1122842785);
         } else {
            method6882(this, (Integer)var1.field6654, (Integer)var2.field6655, 1122842785);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.cz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cm")
   boolean method7094(int var1, int var2) {
      try {
         if (32 != var1) {
            if (var2 >= 1053045388) {
               throw new IllegalStateException();
            }

            if (var1 != 10 && var1 != 9) {
               return false;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.cm(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("lm")
   public static void method6915(classLH var0, boolean var1) {
      if (var0.field4157 * -698145269 > 0) {
         var0.method7075(classZD.method13901(var0.field4159, var0.field4157 * -698145269, -1, -1848367762), var1, -2071892668);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lwb;")
   @ObfuscatedName("dm")
   classWB method7103(int var1) {
      try {
         int var2 = this.field4144.method13950(this.field4158 * 2084178789, (byte)-38);
         int var3 = this.field4159.method13900(this.field4158 * 236265915, -605299333);
         return new classWB(var2, var3);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.dm(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lal;)Laj;")
   @ObfuscatedName("rx")
   public static classAJ method6806(classAL var0) {
      return var0.field216 == 0 ? var0.method438(false) : var0.field218.method386((byte)1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ih")
   public boolean method6992() {
      return this.method6831(1386916343) && 138766506 * this.field4156 % 60 < 30;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("er")
   public void method7033(int var1) {
      this.field4144.method13857(var1, 1893807923);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fg")
   public void method6864() {
      if (!method6876(this, 455461300) && -1410705525 * this.field4157 > 0) {
         int var1 = classZD.method13892(this.field4159, this.field4156 * -698145269 - 1, -1596338929);
         this.method7095((byte)81);
         method6882(this, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laaa;I)Z")
   @ObfuscatedName("as")
   boolean method6814(AbstractFont var1, int var2) {
      try {
         boolean var10000;
         if (!this.field4147) {
            if (var2 >= 693068370) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         classZD.method13863(this.field4159, var1, 180707768);
         classZD.method13863(this.field4159, var1, -707528356);
         this.field4143 = true;
         var3 |= this.method6817(this.field4155 * -1184890025, this.field4156 * -457263387, -586031462);
         var3 |= method6882(this, this.field4153 * 1072642345, -698145269 * this.field4146, 1122842785);
         if (this.method7073((byte)-7)) {
            this.method7095((byte)80);
            var3 = true;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("at")
   public boolean method6884(int var1, int var2, int var3) {
      try {
         if (!this.method7045((byte)-116)) {
            if (var3 != 1122842785) {
               throw new IllegalStateException();
            } else {
               this.field4142 = var1 * -737774823;
               this.field4142 = 1468773795 * var2;
               return false;
            }
         } else {
            if (var1 > this.field4144.method13938(-381452321)) {
               if (var3 != 1122842785) {
                  throw new IllegalStateException();
               }

               var1 = this.field4144.method13951(2055901482);
            }

            if (var2 > this.field4159.method13949(-1869711221)) {
               if (var3 != 1122842785) {
                  throw new IllegalStateException();
               }

               var2 = this.field4159.method13946(-1122154423);
            }

            boolean var10000;
            label61: {
               if (var1 == 1072642345 * this.field4156) {
                  if (var3 != 1122842785) {
                     throw new IllegalStateException();
                  }

                  if (this.field4160 * -698145269 == var2) {
                     var10000 = false;
                     break label61;
                  }
               }

               var10000 = true;
            }

            boolean var4 = var10000;
            this.field4142 = var1 * -737774823;
            if (this.field4142 * -698145269 != var2) {
               this.field4148 = 1468773795 * var2;
               this.field4155 = 0;
               this.method7084(2141238320);
            }

            if (var4) {
               if (var3 != 1122842785) {
                  throw new IllegalStateException();
               }

               if (null != this.field4166) {
                  if (var3 != 1122842785) {
                     throw new IllegalStateException();
                  }

                  this.field4167.vmethod147(-1805182445);
               }
            }

            return var4;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lh.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   boolean method6877(int var1) {
      try {
         if (!this.method7090(2012791869)) {
            if (var1 != 455461300) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var2 = this.field4159.method13898(1072642345 * this.field4152, -698145269 * this.field4154, -477828373);
            this.method7095((byte)83);
            method6882(this, var2, var2, 1122842785);
            return true;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lh.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("dd")
   boolean method6858(int var1, int var2) {
      try {
         if (method7098(this, var1, -32389191)) {
            method6876(this, 455461300);
            classZP var3 = this.field4159.method13875((char)var1, -698145269 * this.field4153, this.field4153 * 1030611083, (byte)27);
            method6882(this, var3.method14079(916955013), var3.method14079(-1295548710), 1122842785);
            this.method7073((byte)-65);
            this.method7095((byte)88);
         }

         return true;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("en")
   public void method7088(int var1) {
      try {
         classAAG var2 = this.field4144.method13871(0, -698145269 * this.field4154, 200682512);
         classWB var3 = var2.method214((byte)-106);
         int var4 = this.field4159.method13911((byte)-29);
         int var5 = (Integer)var3.field6655 - 10;
         int var6 = var5 + 20;
         int var7 = (Integer)var3.field6655 - 3;
         int var8 = var7 + 6 + var4;
         int var9 = -1184890025 * this.field4151;
         int var10 = 2084178789 * this.field4142 + var9;
         int var11 = -457263387 * this.field4155;
         int var12 = 236265915 * this.field4155 + var11;
         int var13 = -1184890025 * this.field4151;
         int var14 = this.field4153 * -457263387;
         if (var5 < var9) {
            if (var1 <= 1409580481) {
               throw new IllegalStateException();
            }

            var13 = var5;
         } else if (var6 > var10) {
            if (var1 <= 1409580481) {
               throw new IllegalStateException();
            }

            var13 = var6 - 2084178789 * this.field4154;
         }

         if (var7 < var11) {
            if (var1 <= 1409580481) {
               throw new IllegalStateException();
            }

            var14 = var7;
         } else if (var8 > var12) {
            if (var1 <= 1409580481) {
               throw new IllegalStateException();
            }

            var14 = var8 - 236265915 * this.field4155;
         }

         this.method6884(var13, var14, 865215021);
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "lh.ce(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("ab")
   public boolean method6805(String var1, int var2) {
      try {
         String var3 = this.field4144.method13854((byte)-94);
         if (!var3.equals(var1)) {
            if (var2 == -1187145812) {
               throw new IllegalStateException();
            } else {
               var1 = method7054(this, var1, 2103407397);
               this.field4144.method13889(var1, 1731040047);
               method6882(this, this.field4158 * 1072642345, this.field4156 * -698145269, 1122842785);
               this.method6884(this.field4150 * -1184890025, -457263387 * this.field4148, -1937779588);
               this.method7073((byte)-97);
               this.method7095((byte)83);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lh.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("hx")
   public void method6949(Clipboard var1) {
      classAAG var2 = this.field4144.method13871(this.field4149 * -553250984, this.field4142 * -698145269, 879259947);
      if (!classAAG.method202(var2, 1947462440)) {
         String var3 = var2.method195(1191066898);
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), null);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwb;Lwb;)V")
   @ObfuscatedName("kv")
   void method7063(classWB var1, classWB var2) {
      if ((Integer)var2.field6655 < (Integer)var1.field6655) {
         method6882(this, (Integer)var1.field6655, (Integer)var2.field6654, 1122842785);
      } else {
         method6882(this, (Integer)var1.field6654, (Integer)var2.field6654, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cp")
   public int method7007(int var1) {
      try {
         return -457263387 * this.field4148;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lh.cp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ch")
   String method7058(String var1, int var2) {
      try {
         StringBuilder var3 = new StringBuilder(var1.length());

         for (int var4 = 0; var4 < var1.length(); var4++) {
            if (var2 <= 1906148269) {
               throw new IllegalStateException();
            }

            char var5 = var1.charAt(var4);
            if (method7098(this, var5, -32389191)) {
               if (var2 <= 1906148269) {
                  throw new IllegalStateException();
               }

               var3.append(var5);
            }
         }

         return var3.toString();
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "lh.ch(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("aj")
   public boolean method6837(int var1, int var2, int var3) {
      try {
         if (!this.method6998((byte)-48)) {
            if (var3 >= 869659365) {
               throw new IllegalStateException();
            } else {
               this.field4158 = var1 * -942303129;
               this.field4155 = var2 * -1673193747;
               return false;
            }
         } else {
            int var4 = -1184890025 * this.field4158;
            int var5 = -457263387 * this.field4151;
            int var6 = Math.max(0, this.field4159.method13911((byte)-74) - this.field4160 * 2084178789 + 2);
            int var7 = Math.max(0, this.field4144.method13906((byte)23) - 236265915 * this.field4151 + 1);
            this.field4157 = Math.max(0, Math.min(var6, var1)) * -942303129;
            this.field4151 = Math.max(0, Math.min(var7, var2)) * -1673193747;
            if (var4 == this.field4153 * -1184890025) {
               if (var3 >= 869659365) {
                  throw new IllegalStateException();
               }

               if (-457263387 * this.field4142 == var5) {
                  return false;
               }

               if (var3 >= 869659365) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "lh.al(" + ')');
      }
   }
}
