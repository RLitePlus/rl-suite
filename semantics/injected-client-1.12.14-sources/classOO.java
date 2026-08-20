import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oo")
public class classOO {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field4671 = 0;
   @ObfuscatedName("bo")
   int field4658;
   @ObfuscatedName("bg")
   int field4648;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field4669 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field4674 = 1;
   @ObfuscatedSignature(descriptor = "Lsf;")
   @ObfuscatedName("ax")
   classSF field4656;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field4672 = 30;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field4668 = 2;
   @ObfuscatedSignature(descriptor = "Lsf;")
   @ObfuscatedName("ar")
   classSF field4654 = new classSF();
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4673 = 0;
   @ObfuscatedName("al")
   boolean field4666;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4667 = 1;
   @ObfuscatedName("af")
   int field4663;
   @ObfuscatedName("ah")
   boolean field4655;
   @ObfuscatedName("bk")
   int field4662;
   @ObfuscatedName("aa")
   int field4650;
   @ObfuscatedName("aq")
   int field4653;
   @ObfuscatedName("bb")
   int field4649;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field4670 = 2;
   @ObfuscatedName("am")
   boolean field4651;
   @ObfuscatedName("bs")
   int field4660;
   @ObfuscatedName("bz")
   int field4657;
   @ObfuscatedName("bm")
   int field4665;
   @ObfuscatedName("bp")
   int field4659;
   @ObfuscatedName("bj")
   int field4664;
   @ObfuscatedName("be")
   int field4661;
   @ObfuscatedName("ao")
   int field4652;
   @ObfuscatedSignature(descriptor = "Lor;")
   @ObfuscatedName("bt")
   classOR field4675;
   @ObfuscatedSignature(descriptor = "Lor;")
   @ObfuscatedName("bu")
   classOR field4676;

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bb")
   public void method8481(boolean var1, int var2) {
      try {
         if (this.field4661 * -178140633 < this.field4654.method10130(-347746545)) {
            if (var2 != -680518357) {
               throw new IllegalStateException();
            }

            this.method8619(classSF.method10188(this.field4654, this.field4661 * -178140633, 1, (byte)0), var1, (short)512);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)Z")
   @ObfuscatedName("at")
   public boolean method8371(boolean var1, int var2) {
      try {
         var1 = var1 && this.field4651;
         boolean var10000;
         if (var1 != this.field4666) {
            if (var2 != 1485355144) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         this.field4666 = var1;
         if (!this.field4666) {
            if (var2 != 1485355144) {
               throw new IllegalStateException();
            }

            method8450(this, -178140633 * this.field4661, -178140633 * this.field4661, 825251314);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;ZI)V")
   @ObfuscatedName("ob")
   public static void method8465(classOO var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method8470(var1, var2);
      } else {
         try {
            if (var0.method8599(1339616614)) {
               if (var2 != -327983032) {
                  throw new IllegalStateException();
               }

               if (!var1) {
                  if (var2 != -327983032) {
                     return;
                  }

                  var0.method8619(Math.max(var0.field4658 * 1141616381, var0.field4661 * -178140633), var1, (short)512);
                  return;
               }
            }

            if (-178140633 * var0.field4661 < var0.field4654.method10130(-1446088853)) {
               if (var2 != -327983032) {
                  throw new IllegalStateException();
               }

               var0.method8619(1 + -178140633 * var0.field4661, var1, (short)512);
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "oo.bg(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ag")
   public void method8375(boolean var1, int var2) {
      try {
         boolean var10001;
         label25: {
            this.field4651 = var1;
            if (var1) {
               if (var2 == -245696287) {
                  throw new IllegalStateException();
               }

               if (this.field4666) {
                  if (var2 == -245696287) {
                     return;
                  }

                  var10001 = true;
                  break label25;
               }
            }

            var10001 = false;
         }

         this.field4666 = var10001;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;I)Lvp;")
   @ObfuscatedName("br")
   public static classVP method8640(classOO var0, int var1) {
      if (var0 == null) {
         return var0.method8643(var1);
      } else {
         try {
            int var2 = classSF.method10231(var0.field4654, var0.field4649 * -669313229, (byte)-86);
            int var3 = var0.field4654.method10234(940467603 * var0.field4664, -364225098);
            return new classVP(var2, var3);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "oo.dv(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("an")
   public boolean method8378(String var1, int var2) {
      try {
         String var3 = classSF.method10131(this.field4654, (byte)-1);
         if (!var3.equals(var1)) {
            if (var2 <= -1695883077) {
               throw new IllegalStateException();
            } else {
               var1 = method8601(this, var1, (byte)90);
               this.field4654.method10168(var1, -238156366);
               method8450(this, 1141616381 * this.field4658, this.field4661 * -178140633, 757924577);
               this.method8401(-1159242269 * this.field4665, 1144344585 * this.field4659, -1625581989);
               method8615(this, (byte)30);
               method8636(this, (byte)4);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("ae")
   boolean method8382(String var1, int var2) {
      try {
         this.field4656.method10168(var1, -238156366);
         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;B)Z")
   @ObfuscatedName("aj")
   boolean method8384(AbstractFont var1, byte var2) {
      try {
         boolean var10000;
         if (!this.field4655) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         this.field4654.method10140(var1, (short)356);
         this.field4656.method10140(var1, (short)6337);
         this.field4655 = true;
         var3 |= this.method8401(-1159242269 * this.field4665, 1144344585 * this.field4659, -1386185463);
         var3 |= method8450(this, this.field4658 * 1141616381, -178140633 * this.field4661, -1334233889);
         if (method8615(this, (byte)113)) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            method8636(this, (byte)4);
            var3 = true;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;IB)V")
   @ObfuscatedName("lh")
   public static void method8582(classOO var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method8583(var1, var2);
      } else {
         try {
            var0.field4654.method10223(var1, 1668865275);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "oo.cx(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)V")
   @ObfuscatedName("jj")
   public static void method8522(classOO var0) {
      int var1 = Math.max(0, classSF.method10196(var0.field4654, (byte)46) - 940467603 * var0.field4664);
      var0.field4659 = Math.min(var1, var0.field4659 * 1144344585 + classSF.method10199(var0.field4654, (byte)-71)) * -1568195015;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("cc")
   public int method8572(byte var1) {
      try {
         return -751218173 * this.field4662;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cc(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aw")
   public boolean method8392(int var1, int var2) {
      try {
         if (var1 < 0) {
            var1 = Integer.MAX_VALUE;
         }

         boolean var3 = var1 == this.field4654.method10204((short)16256);
         this.field4654.method10208(var1, -369216879);
         this.field4656.method10208(var1, 1071605755);
         if (method8615(this, (byte)3)) {
            if (var2 == 2006518972) {
               throw new IllegalStateException();
            }

            method8636(this, (byte)4);
            var3 = true;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ii")
   public boolean method8544() {
      return this.method8538((byte)0) && this.field4663 * 480497051 % 60 < 30;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ce")
   public int method8550(byte var1) {
      try {
         return this.field4658 * 1141616381;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.ce(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("am")
   public boolean method8401(int var1, int var2, int var3) {
      try {
         if (!this.method8557((byte)9)) {
            if (var3 >= -239574448) {
               throw new IllegalStateException();
            } else {
               this.field4665 = -968175669 * var1;
               this.field4659 = var2 * -1568195015;
               return false;
            }
         } else {
            int var4 = -1159242269 * this.field4665;
            int var5 = this.field4659 * 1144344585;
            int var6 = Math.max(0, this.field4654.method10191(-434302836) - -669313229 * this.field4649 + 2);
            int var7 = Math.max(0, classSF.method10196(this.field4654, (byte)46) - 940467603 * this.field4664 + 1);
            this.field4665 = Math.max(0, Math.min(var6, var1)) * -968175669;
            this.field4659 = Math.max(0, Math.min(var7, var2)) * -1568195015;
            if (var4 == this.field4665 * -1159242269) {
               if (var5 == 1144344585 * this.field4659) {
                  return false;
               }

               if (var3 >= -239574448) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "oo.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("au")
   public boolean method8405(int var1, int var2, int var3) {
      try {
         boolean var4;
         label47: {
            var4 = true;
            if (var1 >= 0) {
               if (var3 >= -1180684731) {
                  throw new IllegalStateException();
               }

               if (var1 <= 2) {
                  break label47;
               }

               if (var3 >= -1180684731) {
                  throw new IllegalStateException();
               }
            }

            var4 = false;
         }

         label40: {
            if (var2 >= 0) {
               if (var3 >= -1180684731) {
                  throw new IllegalStateException();
               }

               if (var2 <= 2) {
                  break label40;
               }

               if (var3 >= -1180684731) {
                  throw new IllegalStateException();
               }
            }

            var4 = false;
         }

         if (var4) {
            if (var3 >= -1180684731) {
               throw new IllegalStateException();
            } else {
               return classSF.method10145(this.field4654, var1, var2, -922358963);
            }
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oo.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jv")
   public boolean method8593() {
      return this.method8570(1582276079) > 1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ck")
   public int method8570(int var1) {
      try {
         return this.field4654.method10210(-1180180008);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.ck(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lor;)V")
   @ObfuscatedName("ha")
   public void method8525(classOR var1) {
      this.field4675 = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ac")
   public boolean method8417(int var1, int var2) {
      try {
         if (this.method8637(var1, -945420230)) {
            if (var2 <= 1371052334) {
               throw new IllegalStateException();
            }

            this.method8441(1189133353);
            classSC var3 = this.field4654.method10161((char)var1, -178140633 * this.field4661, this.field4657 * -1011709939, (byte)-105);
            method8450(this, var3.method10072((byte)-87), var3.method10072((byte)0), 66778916);
            method8615(this, (byte)119);
            method8636(this, (byte)4);
         }

         return true;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ab")
   public void method8422(byte var1) {
      try {
         if (!this.method8441(-28547448)) {
            if (var1 <= 20) {
               throw new IllegalStateException();
            }

            if (-178140633 * this.field4661 > 0) {
               if (var1 <= 20) {
                  throw new IllegalStateException();
               }

               int var2 = classSF.method10178(this.field4654, this.field4661 * -178140633 - 1, (byte)21);
               method8636(this, (byte)4);
               method8450(this, var2, var2, -1301938843);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   public void method8428(int var1) {
      try {
         if (!this.method8441(-277951456)) {
            if (var1 <= 1889823193) {
               throw new IllegalStateException();
            }

            if (-178140633 * this.field4661 < this.field4654.method10130(-300896797)) {
               if (var1 <= 1889823193) {
                  throw new IllegalStateException();
               }

               int var2 = classSF.method10178(this.field4654, -178140633 * this.field4661, (byte)21);
               method8636(this, (byte)4);
               method8450(this, var2, var2, -1704287399);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cj")
   int method8622(int var1) {
      try {
         return this.field4664 * 940467603 / classSF.method10199(this.field4654, (byte)-32);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("kv")
   boolean method8441(int var1) {
      try {
         if (!this.method8599(1339616614)) {
            if (var1 <= -393460967) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var2 = this.field4654.method10179(1141616381 * this.field4658, -178140633 * this.field4661, 2036214745);
            method8636(this, (byte)4);
            method8450(this, var2, var2, -1254782047);
            return true;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method8442(int var1) {
      try {
         method8450(this, 0, this.field4654.method10130(-1955614134), 285166995);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;ZB)V")
   @ObfuscatedName("do")
   public static void method8486(classOO var0, boolean var1, byte var2) {
      if (var0 == null) {
         var0.method8490(var1, var2);
      } else {
         try {
            if (var0.field4661 * -178140633 > 0) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               int var3 = var0.method8622(536027292);
               var0.method8619(classSF.method10188(var0.field4654, -178140633 * var0.field4661, -var3, (byte)0), var1, (short)512);
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "oo.bj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ao")
   public void method8451(boolean var1, int var2) {
      try {
         classVP var3 = method8611(this, -178140633 * this.field4661, (byte)0);
         this.method8619((Integer)var3.field6227, var1, (short)512);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("aa")
   public void method8454(boolean var1, int var2) {
      try {
         classVP var3 = method8611(this, this.field4661 * -178140633, (byte)0);
         this.method8619((Integer)var3.field6228, var1, (short)512);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("aq")
   public void method8457(boolean var1, int var2) {
      try {
         this.method8619(0, var1, (short)512);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("be")
   public void method8458(boolean var1, int var2) {
      try {
         this.method8619(this.field4654.method10130(-1717062275), var1, (short)512);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bs")
   public void method8471(boolean var1, int var2) {
      try {
         if (this.field4661 * -178140633 > 0) {
            if (var2 != -900931832) {
               throw new IllegalStateException();
            }

            classVP var3 = this.method8607(this.field4661 * -178140633 - 1, -2097813214);
            this.method8619((Integer)var3.field6227, var1, (short)512);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ef")
   public void method8410(int var1) {
      this.field4654.method10148(var1, 1914933652);
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bk")
   public void method8479(boolean var1, byte var2) {
      try {
         if (this.field4661 * -178140633 > 0) {
            if (var2 <= 0) {
               return;
            }

            this.method8619(classSF.method10188(this.field4654, -178140633 * this.field4661, -1, (byte)0), var1, (short)512);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V")
   @ObfuscatedName("by")
   public void method8512(Clipboard var1, byte var2) {
      try {
         if (this.method8599(1339616614)) {
            this.method8510(var1, (byte)-100);
            this.method8441(813788580);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bm")
   public void method8491(boolean var1, int var2) {
      try {
         if (-178140633 * this.field4661 < this.field4654.method10130(-1016584772)) {
            int var3 = this.method8622(-607126278);
            this.method8619(classSF.method10188(this.field4654, this.field4661 * -178140633, var3, (byte)0), var1, (short)512);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bp")
   public void method8494(boolean var1, byte var2) {
      try {
         classSI var3 = classSF.method10155(this.field4654, 0, -178140633 * this.field4661, -1676329452);
         classVP var4 = var3.method10301(726888077);
         this.method8619(classSF.method10182(this.field4654, (Integer)var4.field6227, 1144344585 * this.field4659, (byte)21), var1, (short)512);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oo.bp(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("fh")
   public static void method8495(classOO var0, boolean var1) {
      classSI var2 = classSF.method10155(var0.field4654, 0, -178140633 * var0.field4661, -1764292480);
      classVP var3 = var2.method10301(726888077);
      var0.method8619(classSF.method10182(var0.field4654, (Integer)var3.field6227, 1144344585 * var0.field4659, (byte)72), var1, (short)512);
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bt")
   public void method8496(boolean var1, byte var2) {
      try {
         classSI var3 = classSF.method10155(this.field4654, 0, -178140633 * this.field4661, -1761248826);
         classVP var4 = var3.method10301(726888077);
         this.method8619(
            classSF.method10182(this.field4654, (Integer)var4.field6227, 1144344585 * this.field4659 + 940467603 * this.field4664, (byte)29), var1, (short)512
         );
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oo.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("it")
   public int method8563() {
      return this.field4654.method10204((short)16256);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("uh")
   public static void method8466(classOO var0, boolean var1) {
      if (var0 == null) {
         var0.method8524();
      }

      if (var0.method8599(1339616614) && !var1) {
         var0.method8619(Math.max(var0.field4658 * 1141616381, var0.field4661 * -178140633), var1, (short)512);
      } else if (-178140633 * var0.field4661 < var0.field4654.method10130(1009172921)) {
         var0.method8619(1 + -178140633 * var0.field4661, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V")
   @ObfuscatedName("bi")
   public void method8510(Clipboard var1, byte var2) {
      try {
         classSI var3 = classSF.method10155(this.field4654, this.field4658 * 1141616381, -178140633 * this.field4661, -2048975258);
         if (!classSI.method10281(var3, -2146031385)) {
            String var4 = var3.method10274((byte)59);
            if (!var4.isEmpty()) {
               if (var2 >= 12) {
                  throw new IllegalStateException();
               }

               var1.setContents(new StringSelection(var4), null);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oo.bi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ah")
   public void method8437(int var1) {
      try {
         if (!this.method8441(-372442858) && -178140633 * this.field4661 < this.field4654.method10130(228320351)) {
            if (var1 <= 486301751) {
               throw new IllegalStateException();
            }

            classVP var2 = this.method8607(this.field4661 * -178140633, -1900756551);
            int var3 = this.field4654.method10179(this.field4661 * -178140633, (Integer)var2.field6228, 2036214745);
            method8636(this, (byte)4);
            method8450(this, var3, var3, 296468061);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("az")
   public boolean method8388(int var1, int var2, int var3) {
      try {
         boolean var10000;
         label27: {
            if (-669313229 * this.field4649 == var1) {
               if (var3 <= 327716789) {
                  throw new IllegalStateException();
               }

               if (var2 == 940467603 * this.field4664) {
                  var10000 = false;
                  break label27;
               }

               if (var3 <= 327716789) {
                  throw new IllegalStateException();
               }
            }

            var10000 = true;
         }

         boolean var4 = var10000;
         this.field4649 = var1 * -427115525;
         this.field4664 = var2 * 15040667;
         return var4 | this.method8401(-1159242269 * this.field4665, this.field4659 * 1144344585, -2146767072);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oo.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lor;B)V")
   @ObfuscatedName("br")
   public void method8528(classOR var1, byte var2) {
      try {
         this.field4676 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsf;")
   @ObfuscatedName("bl")
   public classSF method8533(int var1) {
      try {
         return this.field4656;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fi")
   public void method8443() {
      method8450(this, 0, this.field4654.method10130(1017793974), 1158087105);
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bq")
   public boolean method8538(byte var1) {
      try {
         return this.field4666;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.bq(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;I)Z")
   @ObfuscatedName("sb")
   public static boolean method8413(classOO var0, int var1) {
      if (var0 == null) {
         var0.method8533(var1);
      }

      var0.field4653 = var1 * 1665046741;
      String var2 = classSF.method10131(var0.field4654, (byte)-124);
      int var3 = var2.length();
      var2 = method8601(var0, var2, (byte)116);
      if (var2.length() != var3) {
         var0.field4654.method10168(var2, -238156366);
         var0.method8401(var0.field4665 * -1159242269, 1144344585 * var0.field4659, -766832500);
         method8615(var0, (byte)5);
         method8636(var0, (byte)4);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bx")
   public boolean method8541(int var1) {
      try {
         return this.field4651;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.bx(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("ex")
   public static void method8474(classOO var0, boolean var1) {
      if (-178140633 * var0.field4661 < var0.field4654.method10130(-1617619145)) {
         classVP var2 = var0.method8607(1 + -178140633 * var0.field4661, -1033459276);
         var0.method8619((Integer)var2.field6228, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bv")
   public boolean method8545(int var1) {
      try {
         if (this.method8538((byte)0)) {
            if (var1 != -1987300362) {
               throw new IllegalStateException();
            }

            if (this.field4663 * 480497051 % 60 < 30) {
               if (var1 != -1987300362) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dn")
   public boolean method8398(int var1) {
      this.field4662 = var1 * -2139658069;
      if (method8615(this, (byte)125)) {
         method8636(this, (byte)4);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bn")
   public void method8523(int var1) {
      try {
         int var2 = Math.max(0, classSF.method10196(this.field4654, (byte)46) - 940467603 * this.field4664);
         this.field4659 = Math.min(var2, this.field4659 * 1144344585 + classSF.method10199(this.field4654, (byte)-81)) * -1568195015;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hz")
   public void method8518() {
      this.field4659 = Math.max(0, 1144344585 * this.field4659 - classSF.method10199(this.field4654, (byte)21)) * -1568195015;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ct")
   public int method8558(byte var1) {
      try {
         return this.field4665 * -1159242269;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.ct(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cm")
   public int method8559(int var1) {
      try {
         return 1144344585 * this.field4659;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cm(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("dw")
   boolean method8637(int var1, int var2) {
      try {
         switch (this.field4653 * 1818353789) {
            case 1:
               return class189.isAlphaNumeric((char)var1, 1836679532);
            case 2:
               return ServerPacket.isCharAlphabetic((char)var1, (short)1722);
            case 3:
               return class341.isDigit((char)var1, 270022791);
            case 4:
               char var3 = (char)var1;
               if (class341.isDigit(var3, -1915305695)) {
                  if (var2 != -945420230) {
                     throw new IllegalStateException();
                  }

                  return true;
               } else {
                  if ('k' != var3) {
                     if (var2 != -945420230) {
                        throw new IllegalStateException();
                     }

                     if (var3 != 'K') {
                        if (var2 != -945420230) {
                           throw new IllegalStateException();
                        }

                        if (var3 != 'm') {
                           if (var2 != -945420230) {
                              throw new IllegalStateException();
                           }

                           if ('M' != var3) {
                              if (var2 != -945420230) {
                                 throw new IllegalStateException();
                              }

                              if ('b' != var3) {
                                 if (var3 != 'B') {
                                    return false;
                                 }

                                 if (var2 != -945420230) {
                                    throw new IllegalStateException();
                                 }
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
         throw RestClientThreadFactory.newRunException(var4, "oo.dw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("is")
   public boolean method8554() {
      return this.field4655;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("hj")
   public void method8514(Clipboard var1) {
      Transferable var2 = var1.getContents(null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = method8601(this, (String)var2.getTransferData(DataFlavor.stringFlavor), (byte)71);
            this.method8441(2004234159);
            classSC var4 = classSF.method10163(this.field4654, var3, this.field4661 * -178140633, -1011709939 * this.field4657, 1751400305);
            method8450(this, var4.method10072((byte)1), var4.method10072((byte)-117), -1307989783);
            method8615(this, (byte)22);
            method8636(this, (byte)4);
         } catch (Exception var5) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)V")
   @ObfuscatedName("cn")
   public void method8575(int var1, short var2) {
      try {
         this.field4652 = var1 * 563353481;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.cn(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)V")
   @ObfuscatedName("jf")
   public static void method8444(classOO var0) {
      method8450(var0, 0, var0.field4654.method10130(-1284566369), 263229699);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ga")
   public void method8482(boolean var1) {
      if (this.field4661 * -178140633 < this.field4654.method10130(-347586917)) {
         this.method8619(classSF.method10188(this.field4654, this.field4661 * -178140633, 1, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cp")
   public int method8588(int var1) {
      try {
         return this.field4654.method10225(-1166813539);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cd")
   public void method8591(int var1, int var2) {
      try {
         this.field4654.method10134(var1, -19585918);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.cd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ej")
   public void method8411(int var1) {
      this.field4654.method10148(var1, 1662040752);
   }

   @ObfuscatedSignature(descriptor = "(Lvp;Lvp;I)V")
   @ObfuscatedName("cy")
   void method8604(classVP var1, classVP var2, int var3) {
      try {
         if ((Integer)var2.field6227 < (Integer)var1.field6227) {
            if (var3 <= 1157268100) {
               return;
            }

            method8450(this, (Integer)var1.field6228, (Integer)var2.field6227, -883457605);
         } else {
            method8450(this, (Integer)var1.field6227, (Integer)var2.field6228, -538433347);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.cy(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;II)Z")
   @ObfuscatedName("gd")
   public static boolean method8406(classOO var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8554();
      }

      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var3 = false;
      }

      return var3 ? classSF.method10145(var0.field4654, var1, var2, 1480675522) : false;
   }

   @ObfuscatedSignature(descriptor = "(II)Lvp;")
   @ObfuscatedName("cq")
   classVP method8607(int var1, int var2) {
      try {
         int var3 = this.field4654.method10130(-1708259926);
         int var4 = 0;
         int var5 = var3;

         for (int var6 = var1; var6 > 0; var6--) {
            if (this.method8628(this.field4654.method10117(var6 - 1, (byte)27).field5869, 1109300748)) {
               if (var2 >= 65280) {
                  throw new IllegalStateException();
               }

               var4 = var6;
               break;
            }
         }

         for (int var8 = var1; var8 < var3; var8++) {
            if (var2 >= 65280) {
               throw new IllegalStateException();
            }

            if (this.method8628(this.field4654.method10117(var8, (byte)24).field5869, -945425636)) {
               if (var2 >= 65280) {
                  throw new IllegalStateException();
               }

               var5 = var8;
               break;
            }
         }

         return new classVP(var4, var5);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oo.cq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZS)V")
   @ObfuscatedName("cr")
   void method8619(int var1, boolean var2, short var3) {
      try {
         if (var2) {
            if (var3 != 512) {
               throw new IllegalStateException();
            }

            method8450(this, 1141616381 * this.field4658, var1, -770329033);
         } else {
            method8450(this, var1, var1, -18964315);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.cr(" + ')');
      }
   }

   classOO() {
      this.field4656 = new classSF();
      this.field4666 = false;
      this.field4651 = true;
      this.field4663 = 0;
      this.field4655 = false;
      this.field4652 = 0;
      this.field4650 = 0;
      this.field4653 = 0;
      this.field4661 = 0;
      this.field4658 = 0;
      this.field4648 = 0;
      this.field4660 = 0;
      this.field4657 = -2044790469;
      this.field4662 = -7825579;
      this.field4649 = 0;
      this.field4664 = 0;
      this.field4665 = 0;
      this.field4659 = 0;
      this.field4654.method10223(1, 1296003357);
      this.field4656.method10223(1, 1364813365);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ca")
   void method8625(byte var1) {
      try {
         classSI var2 = classSF.method10155(this.field4654, 0, -178140633 * this.field4661, -1799060057);
         classVP var3 = var2.method10301(726888077);
         int var4 = classSF.method10199(this.field4654, (byte)-10);
         int var5 = (Integer)var3.field6227 - 10;
         int var6 = 20 + var5;
         int var7 = (Integer)var3.field6228 - 3;
         int var8 = 6 + var7 + var4;
         int var9 = this.field4665 * -1159242269;
         int var10 = -669313229 * this.field4649 + var9;
         int var11 = this.field4659 * 1144344585;
         int var12 = var11 + 940467603 * this.field4664;
         int var13 = this.field4665 * -1159242269;
         int var14 = 1144344585 * this.field4659;
         if (var5 < var9) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var13 = var5;
         } else if (var6 > var10) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var13 = var6 - this.field4649 * -669313229;
         }

         if (var7 < var11) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var14 = var7;
         } else if (var8 > var12) {
            if (var1 <= 1) {
               return;
            }

            var14 = var8 - this.field4664 * 940467603;
         }

         this.method8401(var13, var14, -405349247);
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "oo.ca(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cl")
   boolean method8628(int var1, int var2) {
      try {
         if (var1 != 32) {
            if (var2 == -436944179) {
               throw new IllegalStateException();
            }

            if (10 != var1) {
               if (9 != var1) {
                  return false;
               }

               if (var2 == -436944179) {
                  throw new IllegalStateException();
               }
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.cl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ko")
   void method8632() {
      if (null != this.field4675) {
         this.field4675.vmethod158((byte)0);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("iv")
   public boolean method8555() {
      return this.field4655;
   }

   @ObfuscatedSignature(descriptor = "(Loo;I)I")
   @ObfuscatedName("rn")
   public static int method8578(classOO var0, int var1) {
      if (var0 == null) {
         return var0.method8567(var1);
      } else {
         try {
            return var0.field4654.method10219(720263077);
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "oo.co(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("dt")
   public boolean method8372(boolean var1) {
      var1 = var1 && this.field4651;
      boolean var2 = var1 != this.field4666;
      this.field4666 = var1;
      if (!this.field4666) {
         method8450(this, -178140633 * this.field4661, -178140633 * this.field4661, 1906746323);
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("dz")
   public void method8376(boolean var1) {
      this.field4651 = var1;
      this.field4666 = var1 && this.field4666;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fp")
   public void method8438() {
      if (!this.method8441(-26088963) && 356271812 * this.field4661 < this.field4654.method10130(-1335459468)) {
         classVP var1 = this.method8607(this.field4661 * -178140633, -70184242);
         int var2 = this.field4654.method10179(this.field4661 * 399779634, (Integer)var1.field6228, 2036214745);
         method8636(this, (byte)4);
         method8450(this, var2, var2, -341850460);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("da")
   public boolean method8379(String var1) {
      String var2 = classSF.method10131(this.field4654, (byte)-30);
      if (!var2.equals(var1)) {
         var1 = method8601(this, var1, (byte)44);
         this.field4654.method10168(var1, -238156366);
         method8450(this, 1141616381 * this.field4658, this.field4661 * -178140633, -552472803);
         this.method8401(-1159242269 * this.field4665, 1144344585 * this.field4659, -1998855286);
         method8615(this, (byte)95);
         method8636(this, (byte)4);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("di")
   public boolean method8380(String var1) {
      String var2 = classSF.method10131(this.field4654, (byte)-121);
      if (!var2.equals(var1)) {
         var1 = method8601(this, var1, (byte)119);
         this.field4654.method10168(var1, -238156366);
         method8450(this, 1141616381 * this.field4658, this.field4661 * -178140633, -2076067341);
         this.method8401(-1159242269 * this.field4665, 1144344585 * this.field4659, -1052656598);
         method8615(this, (byte)58);
         method8636(this, (byte)4);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("dl")
   boolean method8383(String var1) {
      this.field4656.method10168(var1, -238156366);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ai")
   public boolean method8414(int var1, int var2) {
      try {
         this.field4653 = var1 * 1665046741;
         String var3 = classSF.method10131(this.field4654, (byte)-50);
         int var4 = var3.length();
         var3 = method8601(this, var3, (byte)18);
         if (var3.length() != var4) {
            if (var2 != -1677752388) {
               throw new IllegalStateException();
            } else {
               this.field4654.method10168(var3, -238156366);
               this.method8401(this.field4665 * -1159242269, 1144344585 * this.field4659, -1202159937);
               method8615(this, (byte)91);
               method8636(this, (byte)4);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oo.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("tl")
   public static void method8467(classOO var0, boolean var1) {
      if (var0 == null) {
         var0.method8499(var1);
      } else {
         if (var0.method8599(1339616614) && !var1) {
            var0.method8619(Math.max(var0.field4658 * 1141616381, var0.field4661 * 871891190), var1, (short)512);
         } else if (-1970190956 * var0.field4661 < var0.field4654.method10130(-1996229598)) {
            var0.method8619(1 + -1863090529 * var0.field4661, var1, (short)512);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gb")
   public void method8492(boolean var1) {
      if (-178140633 * this.field4661 < this.field4654.method10130(-1450871118)) {
         int var2 = this.method8622(-898735654);
         this.method8619(classSF.method10188(this.field4654, this.field4661 * -178140633, var2, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ia")
   public int method8560() {
      return 181031980 * this.field4659;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("dg")
   public boolean method8389(int var1, int var2) {
      boolean var3 = -669313229 * this.field4649 != var1 || var2 != 940467603 * this.field4664;
      this.field4649 = var1 * -427115525;
      this.field4664 = var2 * 15040667;
      return var3 | this.method8401(-1159242269 * this.field4665, this.field4659 * 1144344585, -1507502196);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("dj")
   public boolean method8381(String var1) {
      String var2 = classSF.method10131(this.field4654, (byte)-29);
      if (!var2.equals(var1)) {
         var1 = method8601(this, var1, (byte)72);
         this.field4654.method10168(var1, -238156366);
         method8450(this, 1141616381 * this.field4658, this.field4661 * -178140633, 1890264907);
         this.method8401(-1159242269 * this.field4665, 1144344585 * this.field4659, -2129643750);
         method8615(this, (byte)26);
         method8636(this, (byte)4);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dk")
   public boolean method8396(int var1) {
      this.field4654.method10215(var1, -308762777);
      if (method8615(this, (byte)15)) {
         method8636(this, (byte)4);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("gq")
   public void method8505(int var1, int var2) {
      if (this.field4655 && this.method8538((byte)0)) {
         var1 += this.field4665 * -1159242269;
         var2 += this.field4659 * 1144344585;
         classVP var3 = method8640(this, -857058962);
         int var4 = classSF.method10182(this.field4654, var1 - (Integer)var3.field6227, var2 - (Integer)var3.field6228, (byte)30);
         switch (this.field4650 * 740051357) {
            case 0:
               method8450(this, this.field4658 * 1141616381, var4, -1865966400);
               break;
            case 1:
               classVP var9 = this.method8607(this.field4648 * -622649611, -1746821847);
               classVP var10 = this.method8607(var4, -1293364291);
               this.method8604(var9, var10, 1899481262);
               break;
            case 2:
               classVP var5 = method8611(this, this.field4648 * -622649611, (byte)0);
               classVP var6 = method8611(this, var4, (byte)0);
               this.method8604(var5, var6, 1542812200);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ec")
   public boolean method8399(int var1) {
      this.field4662 = var1 * -2139658069;
      if (method8615(this, (byte)9)) {
         method8636(this, (byte)4);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ee")
   public boolean method8402(int var1, int var2) {
      if (!this.method8557((byte)20)) {
         this.field4665 = -1500558728 * var1;
         this.field4659 = var2 * -1568195015;
         return false;
      } else {
         int var3 = -1159242269 * this.field4665;
         int var4 = this.field4659 * 1144344585;
         int var5 = Math.max(0, this.field4654.method10191(-434302836) - -669313229 * this.field4649 + 2);
         int var6 = Math.max(0, classSF.method10196(this.field4654, (byte)46) - 940467603 * this.field4664 + 1);
         this.field4665 = Math.max(0, Math.min(var5, var1)) * -1835712303;
         this.field4659 = Math.max(0, Math.min(var6, var2)) * -1450689826;
         return var3 != this.field4665 * -1159242269 || var4 != -1460911644 * this.field4659;
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;B)I")
   @ObfuscatedName("ks")
   public static int method8584(classOO var0, byte var1) {
      if (var0 == null) {
         var0.method8587(var1);
      }

      try {
         return 1818353789 * var0.field4653;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cg(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("eq")
   public boolean method8407(int var1, int var2) {
      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var3 = false;
      }

      return var3 ? classSF.method10145(this.field4654, var1, var2, -789592317) : false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jf")
   boolean method8597() {
      return this.field4661 * -178140633 != this.field4658 * 275396666;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("er")
   public boolean method8408(int var1, int var2) {
      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var3 = false;
      }

      return var3 ? classSF.method10145(this.field4654, var1, var2, 83083638) : false;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ar")
   public void method8433(byte var1) {
      try {
         if (!this.method8441(910875760)) {
            if (var1 == 1) {
               return;
            }

            if (this.field4661 * -178140633 > 0) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               classVP var2 = this.method8607(this.field4661 * -178140633 - 1, -1370445213);
               int var3 = this.field4654.method10179((Integer)var2.field6227, this.field4661 * -178140633, 2036214745);
               method8636(this, (byte)4);
               method8450(this, var3, var3, 2074643886);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V")
   @ObfuscatedName("bw")
   public void method8515(Clipboard var1, int var2) {
      try {
         Transferable var3 = var1.getContents(null);
         if (var3 != null) {
            if (var2 != 1205453202) {
               throw new IllegalStateException();
            }

            if (var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
               if (var2 != 1205453202) {
                  throw new IllegalStateException();
               }

               try {
                  String var4 = method8601(this, (String)var3.getTransferData(DataFlavor.stringFlavor), (byte)39);
                  this.method8441(-24241109);
                  classSC var5 = classSF.method10163(this.field4654, var4, this.field4661 * -178140633, -1011709939 * this.field4657, 2067996284);
                  method8450(this, var5.method10072((byte)-51), var5.method10072((byte)-108), -1881310640);
                  method8615(this, (byte)80);
                  method8636(this, (byte)4);
               } catch (Exception var6) {
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oo.bw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("eg")
   public boolean method8418(int var1) {
      if (this.method8637(var1, -945420230)) {
         this.method8441(1462705173);
         classSC var2 = this.field4654.method10161((char)var1, -178140633 * this.field4661, this.field4657 * -1011709939, (byte)-17);
         method8450(this, var2.method10072((byte)-114), var2.method10072((byte)-121), 2076419839);
         method8615(this, (byte)117);
         method8636(this, (byte)4);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eo")
   public void method8429() {
      if (!this.method8441(1529823575) && -178140633 * this.field4661 < this.field4654.method10130(-1749504745)) {
         int var1 = classSF.method10178(this.field4654, -178140633 * this.field4661, (byte)21);
         method8636(this, (byte)4);
         method8450(this, var1, var1, 1367774267);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;II)Z")
   @ObfuscatedName("me")
   public static boolean method8390(classOO var0, int var1, int var2) {
      boolean var3 = -669313229 * var0.field4649 != var1 || var2 != 940467603 * var0.field4664;
      var0.field4649 = var1 * -427115525;
      var0.field4664 = var2 * 15040667;
      return var3 | var0.method8401(-1159242269 * var0.field4665, var0.field4659 * 1144344585, -1540066676);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ei")
   public void method8423() {
      if (!this.method8441(817225398) && 7685100 * this.field4661 > 0) {
         int var1 = classSF.method10178(this.field4654, this.field4661 * -178140633 - 1, (byte)21);
         method8636(this, (byte)4);
         method8450(this, var1, var1, 936804349);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eu")
   public void method8424() {
      if (!this.method8441(616714432) && -178140633 * this.field4661 > 0) {
         int var1 = classSF.method10178(this.field4654, this.field4661 * -864748995 - 1, (byte)21);
         method8636(this, (byte)4);
         method8450(this, var1, var1, 1037130081);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;II)Z")
   @ObfuscatedName("ct")
   public static boolean method8391(classOO var0, int var1, int var2) {
      boolean var3 = -669313229 * var0.field4649 != var1 || var2 != 940467603 * var0.field4664;
      var0.field4649 = var1 * -427115525;
      var0.field4664 = var2 * 15040667;
      return var3 | var0.method8401(-1159242269 * var0.field4665, var0.field4659 * 1144344585, -863760792);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("ks")
   public static void method8472(classOO var0, boolean var1) {
      if (var0.field4661 * -178140633 > 0) {
         classVP var2 = var0.method8607(var0.field4661 * -480258347 - 1, -735447908);
         var0.method8619((Integer)var2.field6227, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ey")
   public void method8425() {
      if (!this.method8441(1802253958) && -178140633 * this.field4661 > 0) {
         int var1 = classSF.method10178(this.field4654, this.field4661 * -178140633 - 1, (byte)21);
         method8636(this, (byte)4);
         method8450(this, var1, var1, -157014596);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)V")
   @ObfuscatedName("us")
   public static void method8430(classOO var0) {
      if (var0 == null) {
         var0.method8537();
      }

      if (!var0.method8441(1666032275) && -492944167 * var0.field4661 < var0.field4654.method10130(-1737685009)) {
         int var1 = classSF.method10178(var0.field4654, -178140633 * var0.field4661, (byte)21);
         method8636(var0, (byte)4);
         method8450(var0, var1, var1, 90677112);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ev")
   public void method8431() {
      if (!this.method8441(1311892593) && -178140633 * this.field4661 < this.field4654.method10130(-621965875)) {
         int var1 = classSF.method10178(this.field4654, -178140633 * this.field4661, (byte)21);
         method8636(this, (byte)4);
         method8450(this, var1, var1, -111378519);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   public void method8412(int var1, int var2) {
      try {
         this.field4654.method10148(var1, 1091899234);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gw")
   public void method8493(boolean var1) {
      if (-904103187 * this.field4661 < this.field4654.method10130(415308485)) {
         int var2 = this.method8622(-58428199);
         this.method8619(classSF.method10188(this.field4654, this.field4661 * -1825638795, var2, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("gc")
   public void method8506(int var1, int var2) {
      if (this.field4655 && this.method8538((byte)0)) {
         var1 += this.field4665 * -1159242269;
         var2 += this.field4659 * 1144344585;
         classVP var3 = method8640(this, -857058962);
         int var4 = classSF.method10182(this.field4654, var1 - (Integer)var3.field6227, var2 - (Integer)var3.field6228, (byte)21);
         switch (this.field4650 * -1214939390) {
            case 0:
               method8450(this, this.field4658 * 771401887, var4, 645367633);
               break;
            case 1:
               classVP var9 = this.method8607(this.field4648 * -1144236091, -1817084855);
               classVP var10 = this.method8607(var4, -1451343247);
               this.method8604(var9, var10, 1383764878);
               break;
            case 2:
               classVP var5 = method8611(this, this.field4648 * -622649611, (byte)0);
               classVP var6 = method8611(this, var4, (byte)0);
               this.method8604(var5, var6, 1957947459);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ed")
   public void method8434() {
      if (!this.method8441(556025676) && this.field4661 * -178140633 > 0) {
         classVP var1 = this.method8607(this.field4661 * -178140633 - 1, -430640536);
         int var2 = this.field4654.method10179((Integer)var1.field6227, this.field4661 * -178140633, 2036214745);
         method8636(this, (byte)4);
         method8450(this, var2, var2, -2027557651);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("en")
   public void method8435() {
      if (!this.method8441(240833308) && this.field4661 * -828349134 > 0) {
         classVP var1 = this.method8607(this.field4661 * -890381975 - 1, -150483208);
         int var2 = this.field4654.method10179((Integer)var1.field6227, this.field4661 * 1552132771, 2036214745);
         method8636(this, (byte)4);
         method8450(this, var2, var2, -483487183);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eb")
   public void method8436() {
      if (!this.method8441(87129869) && this.field4661 * -178140633 > 0) {
         classVP var1 = this.method8607(this.field4661 * -178140633 - 1, -245495882);
         int var2 = this.field4654.method10179((Integer)var1.field6227, this.field4661 * -178140633, 2036214745);
         method8636(this, (byte)4);
         method8450(this, var2, var2, 313854549);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)V")
   @ObfuscatedName("nf")
   public static void method8439(classOO var0) {
      if (var0 == null) {
         var0.method8598();
      }

      if (!var0.method8441(1917657606) && -1670898734 * var0.field4661 < var0.field4654.method10130(-1390729633)) {
         classVP var1 = var0.method8607(var0.field4661 * 351448049, -749332780);
         int var2 = var0.field4654.method10179(var0.field4661 * -461183321, (Integer)var1.field6228, 2036214745);
         method8636(var0, (byte)4);
         method8450(var0, var2, var2, -2061370627);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;I)Z")
   @ObfuscatedName("zb")
   public static boolean method8419(classOO var0, int var1) {
      if (var0 == null) {
         var0.method8562();
      }

      if (var0.method8637(var1, -945420230)) {
         var0.method8441(1953118021);
         classSC var2 = var0.field4654.method10161((char)var1, -800555972 * var0.field4661, var0.field4657 * -798089887, (byte)-104);
         method8450(var0, var2.method10072((byte)-112), var2.method10072((byte)-76), 744814092);
         method8615(var0, (byte)36);
         method8636(var0, (byte)4);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ff")
   public void method8440() {
      if (!this.method8441(1553377496) && -178140633 * this.field4661 < this.field4654.method10130(824973701)) {
         classVP var1 = this.method8607(this.field4661 * -178140633, -320503291);
         int var2 = this.field4654.method10179(this.field4661 * -178140633, (Integer)var1.field6228, 2036214745);
         method8636(this, (byte)4);
         method8450(this, var2, var2, -1510589447);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;B)V")
   @ObfuscatedName("av")
   public static void method8367(AbstractArchive var0, byte var1) {
      try {
         class190.ParamDefinition_archive = var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;I)Z")
   @ObfuscatedName("rm")
   public static boolean method8629(classOO var0, int var1) {
      return var0 == null ? var0.method8555() : var1 == 32 || 10 == var1 || 9 == var1;
   }

   @ObfuscatedSignature(descriptor = "(Loo;B)Z")
   @ObfuscatedName("tv")
   public static boolean method8615(classOO var0, byte var1) {
      if (var0 == null) {
         var0.method8618(var1);
      }

      try {
         if (!var0.method8557((byte)-120)) {
            return false;
         } else {
            boolean var2 = false;
            if (var0.field4654.method10130(60263366) > -751218173 * var0.field4662) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               var0.field4654.method10179(-751218173 * var0.field4662, var0.field4654.method10130(-2062841723), 2036214745);
               var2 = true;
            }

            int var3 = var0.method8570(-421502796);
            if (var0.field4654.method10201(-1836721085) > var3) {
               int var4 = classSF.method10188(var0.field4654, 0, var3, (byte)0) - 1;
               var0.field4654.method10179(var4, var0.field4654.method10130(775550435), 2036214745);
               var2 = true;
            }

            if (var2) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               int var8 = var0.field4661 * -178140633;
               int var5 = var0.field4658 * 1141616381;
               int var6 = var0.field4654.method10130(-1240508642);
               if (-178140633 * var0.field4661 > var6) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  var8 = var6;
               }

               if (var0.field4658 * 1141616381 > var6) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  var5 = var6;
               }

               method8450(var0, var5, var8, -830627141);
            }

            return var2;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oo.cw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fl")
   public void method8445() {
      method8450(this, 0, this.field4654.method10130(-2080626727), -1608546634);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fh")
   public void method8446() {
      method8450(this, 0, this.field4654.method10130(48003458), 445832431);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gd")
   public void method8475(boolean var1) {
      if (-178140633 * this.field4661 < this.field4654.method10130(-1317643842)) {
         classVP var2 = this.method8607(1 + -178140633 * this.field4661, -212111867);
         this.method8619((Integer)var2.field6228, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("fg")
   public boolean method8448(int var1, int var2) {
      if (!this.method8557((byte)77)) {
         this.field4658 = 1857445461 * var1;
         this.field4661 = -113579311 * var2;
         return false;
      } else {
         if (var1 > this.field4654.method10130(-169631717)) {
            var1 = this.field4654.method10130(93992909);
         }

         if (var2 > this.field4654.method10130(-1332718539)) {
            var2 = this.field4654.method10130(-292347749);
         }

         boolean var3 = 1832128877 * this.field4658 != var1 || -2107460055 * this.field4661 != var2;
         this.field4658 = var1 * 261324326;
         if (this.field4661 * -1739607483 != var2) {
            this.field4661 = var2 * 688457111;
            this.field4663 = 0;
            this.method8625((byte)54);
         }

         if (var3 && null != this.field4676) {
            this.field4676.vmethod158((byte)0);
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)Z")
   @ObfuscatedName("tq")
   public static boolean method8373(classOO var0, boolean var1) {
      if (var0 == null) {
         var0.method8563();
      }

      var1 = var1 && var0.field4651;
      boolean var2 = var1 != var0.field4666;
      var0.field4666 = var1;
      if (!var0.field4666) {
         method8450(var0, 217733280 * var0.field4661, 1875052199 * var0.field4661, -1454713457);
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ft")
   public boolean method8449(int var1, int var2) {
      if (!this.method8557((byte)60)) {
         this.field4658 = 1857445461 * var1;
         this.field4661 = 688457111 * var2;
         return false;
      } else {
         if (var1 > this.field4654.method10130(-211503283)) {
            var1 = this.field4654.method10130(-792681093);
         }

         if (var2 > this.field4654.method10130(-1174128320)) {
            var2 = this.field4654.method10130(971427280);
         }

         boolean var3 = 1141616381 * this.field4658 != var1 || -178140633 * this.field4661 != var2;
         this.field4658 = var1 * 1857445461;
         if (this.field4661 * -178140633 != var2) {
            this.field4661 = var2 * 688457111;
            this.field4663 = 0;
            this.method8625((byte)45);
         }

         if (var3 && null != this.field4676) {
            this.field4676.vmethod158((byte)0);
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fm")
   public void method8468(boolean var1) {
      if (this.method8599(1339616614) && !var1) {
         this.method8619(Math.max(this.field4658 * 1141616381, this.field4661 * -178140633), var1, (short)512);
      } else if (-178140633 * this.field4661 < this.field4654.method10130(-485964960)) {
         this.method8619(1 + -178140633 * this.field4661, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fz")
   public void method8452(boolean var1) {
      classVP var2 = method8611(this, -178140633 * this.field4661, (byte)0);
      this.method8619((Integer)var2.field6227, var1, (short)512);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jw")
   boolean method8598() {
      return this.field4661 * -178140633 != this.field4658 * 1141616381;
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("ge")
   public void method8501(int var1, int var2, boolean var3, boolean var4) {
      int var5 = 0;
      if (!this.field4655) {
         var5 = 0;
      } else {
         var1 += this.field4665 * -1159242269;
         var2 += this.field4659 * 1144344585;
         classVP var6 = method8640(this, -857058962);
         var5 = classSF.method10182(this.field4654, var1 - (Integer)var6.field6227, var2 - (Integer)var6.field6228, (byte)30);
      }

      if (var3 && var4) {
         this.field4650 = -1245215563;
         classVP var14 = this.method8607(var5, -1890966268);
         classVP var7 = this.method8607(-622649611 * this.field4648, -1546989360);
         this.method8604(var7, var14, 1241765952);
      } else if (var3) {
         this.field4650 = -1245215563;
         classVP var11 = this.method8607(var5, -1471116322);
         method8450(this, (Integer)var11.field6227, (Integer)var11.field6228, -1586370691);
         this.field4648 = (Integer)var11.field6227 * -1483989667;
      } else if (var4) {
         method8450(this, -622649611 * this.field4648, var5, -1130106429);
      } else {
         if (1304772649 * this.field4660 > 0 && var5 == -622649611 * this.field4648) {
            if (this.field4661 * -178140633 == 1141616381 * this.field4658) {
               this.field4650 = -1245215563;
               classVP var12 = this.method8607(var5, -585976653);
               method8450(this, (Integer)var12.field6227, (Integer)var12.field6228, 1525766587);
            } else {
               this.field4650 = 1804536170;
               classVP var13 = method8611(this, var5, (byte)0);
               method8450(this, (Integer)var13.field6227, (Integer)var13.field6228, -1395795360);
            }
         } else {
            this.field4650 = 0;
            method8450(this, var5, var5, 341423278);
            this.field4648 = -1483989667 * var5;
         }

         this.field4660 = 886505073;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ir")
   public int method8551() {
      return this.field4658 * -850648805;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fu")
   public void method8459(boolean var1) {
      this.method8619(this.field4654.method10130(-1697224759), var1, (short)512);
   }

   @ObfuscatedSignature(descriptor = "(Loo;IB)Lvp;")
   @ObfuscatedName("rq")
   public static classVP method8611(classOO var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method8614(var1, var2);
      }

      try {
         int var3 = var0.field4654.method10130(261759549);
         int var4 = 0;
         int var5 = var3;

         for (int var6 = var1; var6 > 0; var6--) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (var0.field4654.method10117(var6 - 1, (byte)48).field5869 == '\n') {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               var4 = var6;
               break;
            }
         }

         for (int var8 = var1; var8 < var3; var8++) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (var0.field4654.method10117(var8, (byte)83).field5869 == '\n') {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               var5 = var8;
               break;
            }
         }

         return new classVP(var4, var5);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oo.cv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fx")
   public void method8462(boolean var1) {
      if (this.method8599(1339616614) && !var1) {
         this.method8619(Math.min(this.field4658 * 117814975, this.field4661 * -178140633), var1, (short)512);
      } else if (1217107140 * this.field4661 > 0) {
         this.method8619(-178140633 * this.field4661 - 1, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;)Z")
   @ObfuscatedName("du")
   boolean method8385(AbstractFont var1) {
      boolean var2 = !this.field4655;
      this.field4654.method10140(var1, (short)10701);
      this.field4656.method10140(var1, (short)-16549);
      this.field4655 = true;
      var2 |= this.method8401(-1159242269 * this.field4665, 1144344585 * this.field4659, -1262070937);
      var2 |= method8450(this, this.field4658 * 1141616381, -178140633 * this.field4661, -336453619);
      if (method8615(this, (byte)125)) {
         method8636(this, (byte)4);
         var2 = true;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;I)Z")
   @ObfuscatedName("dc")
   public static boolean method8393(classOO var0, int var1) {
      if (var0 == null) {
         var0.method8414(var1, var1);
      }

      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == var0.field4654.method10204((short)16256);
      var0.field4654.method10208(var1, -115822686);
      var0.field4656.method10208(var1, -1272068190);
      if (method8615(var0, (byte)55)) {
         method8636(var0, (byte)4);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fd")
   public void method8469(boolean var1) {
      if (this.method8599(1339616614) && !var1) {
         this.method8619(Math.max(this.field4658 * 1141616381, this.field4661 * -178140633), var1, (short)512);
      } else if (-178140633 * this.field4661 < this.field4654.method10130(740644426)) {
         this.method8619(1 + -178140633 * this.field4661, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvp;")
   @ObfuscatedName("ku")
   classVP method8641() {
      int var1 = classSF.method10231(this.field4654, this.field4649 * -669313229, (byte)-115);
      int var2 = this.field4654.method10234(940467603 * this.field4664, -1253855319);
      return new classVP(var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;I)Z")
   @ObfuscatedName("ij")
   public static boolean method8394(classOO var0, int var1) {
      if (var0 == null) {
         return var0.method8555();
      } else {
         if (var1 < 0) {
            var1 = -515135090;
         }

         boolean var2 = var1 == var0.field4654.method10204((short)16256);
         var0.field4654.method10208(var1, 565893203);
         var0.field4656.method10208(var1, 289203417);
         if (method8615(var0, (byte)116)) {
            method8636(var0, (byte)4);
            var2 = true;
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("kt")
   boolean method8638(int var1) {
      switch (this.field4653 * 1818353789) {
         case 1:
            return class189.isAlphaNumeric((char)var1, 1513556116);
         case 2:
            return ServerPacket.isCharAlphabetic((char)var1, (short)3159);
         case 3:
            return class341.isDigit((char)var1, -150322990);
         case 4:
            char var2 = (char)var1;
            if (class341.isDigit(var2, -391877679)) {
               return true;
            } else {
               if ('k' != var2 && var2 != 'K' && var2 != 'm' && 'M' != var2 && 'b' != var2 && var2 != 'B') {
                  return false;
               }

               return true;
            }
         default:
            return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hb")
   public void method8519() {
      this.field4659 = Math.max(0, -1104478909 * this.field4659 - classSF.method10199(this.field4654, (byte)48)) * -1568195015;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gm")
   public void method8476(boolean var1) {
      if (-178140633 * this.field4661 < this.field4654.method10130(-1742229273)) {
         classVP var2 = this.method8607(1 + -178140633 * this.field4661, -1936897966);
         this.method8619((Integer)var2.field6228, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gf")
   public void method8477(boolean var1) {
      if (-178140633 * this.field4661 < this.field4654.method10130(120952850)) {
         classVP var2 = this.method8607(1 + -178140633 * this.field4661, -480529512);
         this.method8619((Integer)var2.field6228, var1, (short)512);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("aa")
   public static void method8516(classOO var0, Clipboard var1) {
      if (var0 == null) {
         var0.method8425();
      }

      Transferable var2 = var1.getContents(null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = method8601(var0, (String)var2.getTransferData(DataFlavor.stringFlavor), (byte)103);
            var0.method8441(1414031333);
            classSC var4 = classSF.method10163(var0.field4654, var3, var0.field4661 * 360388915, -1011709939 * var0.field4657, -1298723995);
            method8450(var0, var4.method10072((byte)-69), var4.method10072((byte)-57), -598797601);
            method8615(var0, (byte)122);
            method8636(var0, (byte)4);
         } catch (Exception var5) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fk")
   public void method8455(boolean var1) {
      classVP var2 = method8611(this, this.field4661 * -178140633, (byte)0);
      this.method8619((Integer)var2.field6228, var1, (short)512);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("go")
   public void method8480(boolean var1) {
      if (this.field4661 * -178140633 > 0) {
         this.method8619(classSF.method10188(this.field4654, -178140633 * this.field4661, -1, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gg")
   public void method8483(boolean var1) {
      if (this.field4661 * -1182874232 < this.field4654.method10130(-4882955)) {
         this.method8619(classSF.method10188(this.field4654, this.field4661 * 31376144, 1, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsl;)Z")
   @ObfuscatedName("dq")
   boolean method8386(AbstractFont var1) {
      boolean var2 = !this.field4655;
      this.field4654.method10140(var1, (short)-23605);
      this.field4656.method10140(var1, (short)-9402);
      this.field4655 = true;
      var2 |= this.method8401(-1159242269 * this.field4665, 1144344585 * this.field4659, -566984755);
      var2 |= method8450(this, this.field4658 * 1141616381, -178140633 * this.field4661, -505123247);
      if (method8615(this, (byte)123)) {
         method8636(this, (byte)4);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gy")
   public void method8484(boolean var1) {
      if (this.field4661 * -178140633 < this.field4654.method10130(-928355450)) {
         this.method8619(classSF.method10188(this.field4654, this.field4661 * -178140633, 1, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gj")
   public void method8487(boolean var1) {
      if (this.field4661 * -178140633 > 0) {
         int var2 = this.method8622(1000804192);
         this.method8619(classSF.method10188(this.field4654, -178140633 * this.field4661, -var2, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gk")
   public void method8488(boolean var1) {
      if (this.field4661 * -691918930 > 0) {
         int var2 = this.method8622(-413005239);
         this.method8619(classSF.method10188(this.field4654, -178140633 * this.field4661, -var2, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gt")
   public void method8489(boolean var1) {
      if (this.field4661 * -178140633 > 0) {
         int var2 = this.method8622(750742245);
         this.method8619(classSF.method10188(this.field4654, -178140633 * this.field4661, -var2, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;I)Lsf;")
   @ObfuscatedName("lw")
   public static classSF method8531(classOO var0, int var1) {
      if (var0 == null) {
         var0.method8532(var1);
      }

      try {
         return var0.field4654;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fj")
   public void method8463(boolean var1) {
      if (this.method8599(1339616614) && !var1) {
         this.method8619(Math.min(this.field4658 * 1141616381, this.field4661 * -178140633), var1, (short)512);
      } else if (-178140633 * this.field4661 > 0) {
         this.method8619(-178140633 * this.field4661 - 1, var1, (short)512);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;II)V")
   @ObfuscatedName("zy")
   public static void method8507(classOO var0, int var1, int var2) {
      if (var0.field4655 && var0.method8538((byte)0)) {
         var1 += var0.field4665 * -1159242269;
         var2 += var0.field4659 * 1144344585;
         classVP var3 = method8640(var0, -857058962);
         int var4 = classSF.method10182(var0.field4654, var1 - (Integer)var3.field6227, var2 - (Integer)var3.field6228, (byte)115);
         switch (var0.field4650 * 740051357) {
            case 0:
               method8450(var0, var0.field4658 * 1141616381, var4, 1396656563);
               break;
            case 1:
               classVP var9 = var0.method8607(var0.field4648 * -622649611, -310457765);
               classVP var10 = var0.method8607(var4, -896519161);
               var0.method8604(var9, var10, 1873704369);
               break;
            case 2:
               classVP var5 = method8611(var0, var0.field4648 * -622649611, (byte)0);
               classVP var6 = method8611(var0, var4, (byte)0);
               var0.method8604(var5, var6, 1748387019);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gh")
   public void method8497(boolean var1) {
      classSI var2 = classSF.method10155(this.field4654, 0, -178140633 * this.field4661, -2089398712);
      classVP var3 = var2.method10301(726888077);
      this.method8619(
         classSF.method10182(this.field4654, (Integer)var3.field6227, 1144344585 * this.field4659 + 1733174818 * this.field4664, (byte)88), var1, (short)512
      );
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("id")
   public int method8589() {
      return this.field4654.method10225(-1268663874);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jm")
   public boolean method8594() {
      return this.method8570(-197323194) > 1;
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("gp")
   public void method8502(int var1, int var2, boolean var3, boolean var4) {
      int var5 = 0;
      if (!this.field4655) {
         var5 = 0;
      } else {
         var1 += this.field4665 * -1159242269;
         var2 += this.field4659 * 2098739460;
         classVP var6 = method8640(this, -857058962);
         var5 = classSF.method10182(this.field4654, var1 - (Integer)var6.field6227, var2 - (Integer)var6.field6228, (byte)45);
      }

      if (var3 && var4) {
         this.field4650 = 604182726;
         classVP var14 = this.method8607(var5, -1076182299);
         classVP var7 = this.method8607(1315847359 * this.field4648, -1461703263);
         this.method8604(var7, var14, 1880136963);
      } else if (var3) {
         this.field4650 = 60243192;
         classVP var11 = this.method8607(var5, -1829122104);
         method8450(this, (Integer)var11.field6227, (Integer)var11.field6228, -904577882);
         this.field4648 = (Integer)var11.field6227 * -1923438800;
      } else if (var4) {
         method8450(this, -1591099079 * this.field4648, var5, 1140610181);
      } else {
         if (1304772649 * this.field4660 > 0 && var5 == 1358671800 * this.field4648) {
            if (this.field4661 * -178140633 == 107380125 * this.field4658) {
               this.field4650 = -1245215563;
               classVP var12 = this.method8607(var5, -1740923641);
               method8450(this, (Integer)var12.field6227, (Integer)var12.field6228, 1278687833);
            } else {
               this.field4650 = -1885998173;
               classVP var13 = method8611(this, var5, (byte)0);
               method8450(this, (Integer)var13.field6227, (Integer)var13.field6228, -635742187);
            }
         } else {
            this.field4650 = 0;
            method8450(this, var5, var5, -716475561);
            this.field4648 = -412411108 * var5;
         }

         this.field4660 = 886505073;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("gx")
   public void method8503(int var1, int var2, boolean var3, boolean var4) {
      int var5 = 0;
      if (!this.field4655) {
         var5 = 0;
      } else {
         var1 += this.field4665 * -1159242269;
         var2 += this.field4659 * 1144344585;
         classVP var6 = method8640(this, -857058962);
         var5 = classSF.method10182(this.field4654, var1 - (Integer)var6.field6227, var2 - (Integer)var6.field6228, (byte)66);
      }

      if (var3 && var4) {
         this.field4650 = -1245215563;
         classVP var14 = this.method8607(var5, -1287023900);
         classVP var7 = this.method8607(-622649611 * this.field4648, -41373325);
         this.method8604(var7, var14, 1599375458);
      } else if (var3) {
         this.field4650 = -1245215563;
         classVP var11 = this.method8607(var5, -98419696);
         method8450(this, (Integer)var11.field6227, (Integer)var11.field6228, -1995300128);
         this.field4648 = (Integer)var11.field6227 * -1483989667;
      } else if (var4) {
         method8450(this, -622649611 * this.field4648, var5, -236903702);
      } else {
         if (1304772649 * this.field4660 > 0 && var5 == -622649611 * this.field4648) {
            if (this.field4661 * -178140633 == 1141616381 * this.field4658) {
               this.field4650 = -1245215563;
               classVP var12 = this.method8607(var5, -423115171);
               method8450(this, (Integer)var12.field6227, (Integer)var12.field6228, -1993339591);
            } else {
               this.field4650 = 1804536170;
               classVP var13 = method8611(this, var5, (byte)0);
               method8450(this, (Integer)var13.field6227, (Integer)var13.field6228, 664486391);
            }
         } else {
            this.field4650 = 0;
            method8450(this, var5, var5, 1830327259);
            this.field4648 = -1483989667 * var5;
         }

         this.field4660 = 886505073;
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;Lor;I)V")
   @ObfuscatedName("il")
   public static void method8526(classOO var0, classOR var1, int var2) {
      if (var0 == null) {
         var0.method8527(var1, var2);
      }

      try {
         var0.field4675 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.bd(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;I)Z")
   @ObfuscatedName("ac")
   public static boolean method8420(classOO var0, int var1) {
      if (var0 == null) {
         var0.method8564();
      }

      if (var0.method8637(var1, -945420230)) {
         var0.method8441(69906268);
         classSC var2 = var0.field4654.method10161((char)var1, -178140633 * var0.field4661, var0.field4657 * -1011709939, (byte)-30);
         method8450(var0, var2.method10072((byte)-15), var2.method10072((byte)-88), 946973497);
         method8615(var0, (byte)33);
         method8636(var0, (byte)4);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("gi")
   public void method8508(int var1, int var2) {
      if (this.field4655 && this.method8538((byte)0)) {
         var1 += this.field4665 * 936283155;
         var2 += this.field4659 * 1144344585;
         classVP var3 = method8640(this, -857058962);
         int var4 = classSF.method10182(this.field4654, var1 - (Integer)var3.field6227, var2 - (Integer)var3.field6228, (byte)24);
         switch (this.field4650 * 740051357) {
            case 0:
               method8450(this, this.field4658 * 661378717, var4, 1170225695);
               break;
            case 1:
               classVP var9 = this.method8607(this.field4648 * 446974078, -921947108);
               classVP var10 = this.method8607(var4, -410398510);
               this.method8604(var9, var10, 1528419640);
               break;
            case 2:
               classVP var5 = method8611(this, this.field4648 * -622649611, (byte)0);
               classVP var6 = method8611(this, var4, (byte)0);
               this.method8604(var5, var6, 2092891734);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bz")
   public void method8478(boolean var1, int var2) {
      try {
         if (-178140633 * this.field4661 < this.field4654.method10130(-1578456153)) {
            if (var2 >= -491496163) {
               throw new IllegalStateException();
            }

            classVP var3 = this.method8607(1 + -178140633 * this.field4661, -113163377);
            this.method8619((Integer)var3.field6228, var1, (short)512);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hc")
   public void method8524() {
      int var1 = Math.max(0, classSF.method10196(this.field4654, (byte)46) - 940467603 * this.field4664);
      this.field4659 = Math.min(var1, this.field4659 * 1144344585 + classSF.method10199(this.field4654, (byte)-86)) * -1568195015;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("yn")
   public static void method8460(classOO var0, boolean var1) {
      var0.method8619(var0.field4654.method10130(-2050779483), var1, (short)512);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("hg")
   public void method8513(Clipboard var1) {
      if (this.method8599(1339616614)) {
         this.method8510(var1, (byte)-32);
         this.method8441(1634396861);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;I)Z")
   @ObfuscatedName("vm")
   public static boolean method8595(classOO var0, int var1) {
      if (var0 == null) {
         var0.method8596(var1);
      }

      try {
         return var0.method8570(-1661104908) > 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ba")
   public void method8509(int var1, int var2, int var3) {
      try {
         if (this.field4655) {
            if (var3 != -658285040) {
               return;
            }

            if (this.method8538((byte)0)) {
               if (var3 != -658285040) {
                  throw new IllegalStateException();
               }

               var1 += this.field4665 * -1159242269;
               var2 += this.field4659 * 1144344585;
               classVP var4 = method8640(this, -857058962);
               int var5 = classSF.method10182(this.field4654, var1 - (Integer)var4.field6227, var2 - (Integer)var4.field6228, (byte)58);
               switch (this.field4650 * 740051357) {
                  case 0:
                     method8450(this, this.field4658 * 1141616381, var5, 713137299);
                     break;
                  case 1:
                     classVP var11 = this.method8607(this.field4648 * -622649611, -932064271);
                     classVP var12 = this.method8607(var5, -177996682);
                     this.method8604(var11, var12, 1442738866);
                     break;
                  case 2:
                     classVP var6 = method8611(this, this.field4648 * -622649611, (byte)0);
                     classVP var7 = method8611(this, var5, (byte)0);
                     this.method8604(var6, var7, 1977416171);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "oo.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;Ljava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("wc")
   public static String method8601(classOO var0, String var1, byte var2) {
      if (var0 == null) {
         return var0.method8603(var1, var2);
      } else {
         try {
            StringBuilder var3 = new StringBuilder(var1.length());

            for (int var4 = 0; var4 < var1.length(); var4++) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               char var5 = var1.charAt(var4);
               if (var0.method8637(var5, -945420230)) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  var3.append(var5);
               }
            }

            return var3.toString();
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "oo.cf(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;B)I")
   @ObfuscatedName("ll")
   public static int method8573(classOO var0, byte var1) {
      if (var0 == null) {
         var0.method8553(var1);
      }

      try {
         return var0.field4652 * -2025484615;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cs(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("fb")
   public static void method8498(classOO var0, boolean var1) {
      classSI var2 = classSF.method10155(var0.field4654, 0, -178140633 * var0.field4661, -1953067929);
      classVP var3 = var2.method10301(726888077);
      var0.method8619(
         classSF.method10182(var0.field4654, (Integer)var3.field6227, 1144344585 * var0.field4659 + 940467603 * var0.field4664, (byte)125), var1, (short)512
      );
   }

   @ObfuscatedSignature(descriptor = "(Loo;ZI)V")
   @ObfuscatedName("dd")
   public static void method8464(classOO var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method8461(var1, var2);
      }

      try {
         if (var0.method8599(1339616614) && !var1) {
            if (var2 >= 605996841) {
               throw new IllegalStateException();
            }

            var0.method8619(Math.min(var0.field4658 * 1141616381, var0.field4661 * -178140633), var1, (short)512);
         } else if (-178140633 * var0.field4661 > 0) {
            if (var2 >= 605996841) {
               throw new IllegalStateException();
            }

            var0.method8619(-178140633 * var0.field4661 - 1, var1, (short)512);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsi;")
   @ObfuscatedName("bc")
   public classSI method8536(int var1) {
      try {
         return classSF.method10155(this.field4654, this.field4658 * 1141616381, this.field4661 * -178140633, -1891460678);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public void method8416(int var1) {
      try {
         this.field4655 = false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hn")
   public void method8520() {
      this.field4659 = Math.max(0, 1144344585 * this.field4659 - classSF.method10199(this.field4654, (byte)-28)) * -1568195015;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kp")
   void method8633() {
      if (null != this.field4675) {
         this.field4675.vmethod158((byte)0);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kz")
   void method8634() {
      if (null != this.field4675) {
         this.field4675.vmethod158((byte)0);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eh")
   public void method8432() {
      if (!this.method8441(559322984) && -178140633 * this.field4661 < this.field4654.method10130(-110614786)) {
         int var1 = classSF.method10178(this.field4654, -178140633 * this.field4661, (byte)21);
         method8636(this, (byte)4);
         method8450(this, var1, var1, 1561423139);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dy")
   void method8368() {
      this.field4663 = (this.field4663 * 480497051 + 1) % 60 * -1269182317;
      if (1304772649 * this.field4660 > 0) {
         this.field4660 -= 2097044505;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lor;)V")
   @ObfuscatedName("hu")
   public void method8529(classOR var1) {
      this.field4676 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lor;)V")
   @ObfuscatedName("hr")
   public void method8530(classOR var1) {
      this.field4676 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Loo;III)Z")
   @ObfuscatedName("et")
   public static boolean method8450(classOO var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method8404(var1, var1, var1);
      } else {
         try {
            if (!var0.method8557((byte)9)) {
               if (var3 == -1615601984) {
                  throw new IllegalStateException();
               } else {
                  var0.field4658 = 1857445461 * var1;
                  var0.field4661 = 688457111 * var2;
                  return false;
               }
            } else {
               if (var1 > var0.field4654.method10130(-198914825)) {
                  if (var3 == -1615601984) {
                     throw new IllegalStateException();
                  }

                  var1 = var0.field4654.method10130(385164401);
               }

               if (var2 > var0.field4654.method10130(-1354110037)) {
                  if (var3 == -1615601984) {
                     throw new IllegalStateException();
                  }

                  var2 = var0.field4654.method10130(-1445845708);
               }

               boolean var10000;
               label71: {
                  if (1141616381 * var0.field4658 == var1) {
                     if (var3 == -1615601984) {
                        throw new IllegalStateException();
                     }

                     if (-178140633 * var0.field4661 == var2) {
                        var10000 = false;
                        break label71;
                     }

                     if (var3 == -1615601984) {
                        throw new IllegalStateException();
                     }
                  }

                  var10000 = true;
               }

               boolean var4 = var10000;
               var0.field4658 = var1 * 1857445461;
               if (var0.field4661 * -178140633 != var2) {
                  if (var3 == -1615601984) {
                     throw new IllegalStateException();
                  }

                  var0.field4661 = var2 * 688457111;
                  var0.field4663 = 0;
                  var0.method8625((byte)96);
               }

               if (var4) {
                  if (var3 == -1615601984) {
                     throw new IllegalStateException();
                  }

                  if (null != var0.field4676) {
                     if (var3 == -1615601984) {
                        throw new IllegalStateException();
                     }

                     var0.field4676.vmethod158((byte)0);
                  }
               }

               return var4;
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "oo.am(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("hi")
   public void method8511(Clipboard var1) {
      classSI var2 = classSF.method10155(this.field4654, this.field4658 * 1141616381, -178140633 * this.field4661, -1939658376);
      if (!classSI.method10281(var2, -2146954147)) {
         String var3 = var2.method10274((byte)106);
         if (!var3.isEmpty()) {
            var1.setContents(new StringSelection(var3), null);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ka")
   void method8626() {
      classSI var1 = classSF.method10155(this.field4654, 0, -178140633 * this.field4661, -2032501293);
      classVP var2 = var1.method10301(726888077);
      int var3 = classSF.method10199(this.field4654, (byte)-2);
      int var4 = (Integer)var2.field6227 - 10;
      int var5 = 20 + var4;
      int var6 = (Integer)var2.field6228 - 3;
      int var7 = 6 + var6 + var3;
      int var8 = this.field4665 * -1159242269;
      int var9 = -669313229 * this.field4649 + var8;
      int var10 = this.field4659 * 1144344585;
      int var11 = var10 + 940467603 * this.field4664;
      int var12 = this.field4665 * -1159242269;
      int var13 = 1144344585 * this.field4659;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - this.field4649 * -1469121797;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - this.field4664 * 940467603;
      }

      this.method8401(var12, var13, -2110734514);
   }

   @ObfuscatedSignature(descriptor = "()Lsf;")
   @ObfuscatedName("hk")
   public classSF method8534() {
      return this.field4656;
   }

   @ObfuscatedSignature(descriptor = "()Lsf;")
   @ObfuscatedName("ho")
   public classSF method8535() {
      return this.field4656;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hm")
   public boolean method8539() {
      return this.field4666;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("fd")
   public static void method8473(classOO var0, boolean var1) {
      if (var0.field4661 * -178140633 > 0) {
         classVP var2 = var0.method8607(var0.field4661 * 1893700259 - 1, -854765246);
         var0.method8619((Integer)var2.field6227, var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ap")
   public boolean method8397(int var1, int var2) {
      try {
         this.field4654.method10215(var1, 725897664);
         if (method8615(this, (byte)82)) {
            if (var2 != -1088391311) {
               throw new IllegalStateException();
            } else {
               method8636(this, (byte)4);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ib")
   public boolean method8542() {
      return this.field4651;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("if")
   public boolean method8543() {
      return this.field4651;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fo")
   public void method8456(boolean var1) {
      classVP var2 = method8611(this, this.field4661 * -178140633, (byte)0);
      this.method8619((Integer)var2.field6228, var1, (short)512);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("iu")
   public boolean method8546() {
      return this.method8538((byte)0) && this.field4663 * 725008096 % 60 < 30;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("de")
   public boolean method8395(int var1) {
      if (var1 < 0) {
         var1 = Integer.MAX_VALUE;
      }

      boolean var2 = var1 == this.field4654.method10204((short)16256);
      this.field4654.method10208(var1, 682726676);
      this.field4656.method10208(var1, -937318705);
      if (method8615(this, (byte)29)) {
         method8636(this, (byte)4);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ic")
   public int method8547() {
      return this.field4661 * -178140633;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("ao")
   public static void method8517(classOO var0, Clipboard var1) {
      if (var0 == null) {
         var0.method8586();
      }

      Transferable var2 = var1.getContents(null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = method8601(var0, (String)var2.getTransferData(DataFlavor.stringFlavor), (byte)15);
            var0.method8441(-69460205);
            classSC var4 = classSF.method10163(var0.field4654, var3, var0.field4661 * -178140633, -1011709939 * var0.field4657, -1335903508);
            method8450(var0, var4.method10072((byte)-6), var4.method10072((byte)-33), -32152716);
            method8615(var0, (byte)65);
            method8636(var0, (byte)4);
         } catch (Exception var5) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ix")
   public int method8548() {
      return this.field4661 * -178140633;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iq")
   public int method8552() {
      return this.field4658 * 1141616381;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hv")
   public boolean method8540() {
      return this.field4666;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jb")
   public void method8592(int var1) {
      this.field4654.method10134(var1, -19585918);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("iz")
   public boolean method8556() {
      return this.field4655;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("es")
   public boolean method8409(int var1, int var2) {
      boolean var3 = true;
      if (var1 < 0 || var1 > 2) {
         var3 = false;
      }

      if (var2 < 0 || var2 > 2) {
         var3 = false;
      }

      return var3 ? classSF.method10145(this.field4654, var1, var2, 283423261) : false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iy")
   public int method8561() {
      return 868418383 * this.field4659;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jk")
   public int method8562() {
      return 1144344585 * this.field4659;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("io")
   public int method8564() {
      return this.field4654.method10204((short)16256);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gs")
   public void method8485(boolean var1) {
      if (this.field4661 * -178140633 < this.field4654.method10130(-1666318625)) {
         this.method8619(classSF.method10188(this.field4654, this.field4661 * 815138615, 1, (byte)0), var1, (short)512);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iw")
   public int method8565() {
      return this.field4654.method10204((short)16256);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ih")
   public int method8566() {
      return this.field4654.method10204((short)16256);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ja")
   public int method8571() {
      return this.field4654.method10210(-1180180008);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jo")
   public int method8574() {
      return this.field4652 * -2025484615;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ik")
   public void method8576(int var1) {
      this.field4652 = var1 * 563353481;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("il")
   public void method8577(int var1) {
      this.field4652 = var1 * 563353481;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jp")
   public int method8579() {
      return this.field4654.method10219(-1009954545);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ay")
   public boolean method8400(int var1, int var2) {
      try {
         this.field4662 = var1 * -2139658069;
         if (method8615(this, (byte)27)) {
            if (var2 <= -749341264) {
               throw new IllegalStateException();
            } else {
               method8636(this, (byte)4);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jn")
   public int method8580() {
      return this.field4654.method10219(-1875234819);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("im")
   public int method8585() {
      return -1392630018 * this.field4653;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jj")
   public int method8586() {
      return 1818353789 * this.field4653;
   }

   @ObfuscatedSignature(descriptor = "(IIZZI)V")
   @ObfuscatedName("bu")
   public void method8504(int var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         int var6 = 0;
         if (!this.field4655) {
            if (var5 != -1718147780) {
               throw new IllegalStateException();
            }

            var6 = 0;
         } else {
            var1 += this.field4665 * -1159242269;
            var2 += this.field4659 * 1144344585;
            classVP var7 = method8640(this, -857058962);
            var6 = classSF.method10182(this.field4654, var1 - (Integer)var7.field6227, var2 - (Integer)var7.field6228, (byte)43);
         }

         if (var3) {
            if (var5 != -1718147780) {
               return;
            }

            if (var4) {
               this.field4650 = -1245215563;
               classVP var16 = this.method8607(var6, -1542439922);
               classVP var8 = this.method8607(-622649611 * this.field4648, -2013539934);
               this.method8604(var8, var16, 1577288369);
               return;
            }
         }

         if (var3) {
            this.field4650 = -1245215563;
            classVP var13 = this.method8607(var6, -1780201923);
            method8450(this, (Integer)var13.field6227, (Integer)var13.field6228, -1475607633);
            this.field4648 = (Integer)var13.field6227 * -1483989667;
         } else if (var4) {
            method8450(this, -622649611 * this.field4648, var6, -456398798);
         } else {
            label67: {
               if (1304772649 * this.field4660 > 0) {
                  if (var5 != -1718147780) {
                     throw new IllegalStateException();
                  }

                  if (var6 == -622649611 * this.field4648) {
                     if (this.field4661 * -178140633 == 1141616381 * this.field4658) {
                        if (var5 != -1718147780) {
                           throw new IllegalStateException();
                        }

                        this.field4650 = -1245215563;
                        classVP var14 = this.method8607(var6, -407152589);
                        method8450(this, (Integer)var14.field6227, (Integer)var14.field6228, 1160127657);
                     } else {
                        this.field4650 = 1804536170;
                        classVP var15 = method8611(this, var6, (byte)0);
                        method8450(this, (Integer)var15.field6227, (Integer)var15.field6228, -709828713);
                     }
                     break label67;
                  }
               }

               this.field4650 = 0;
               method8450(this, var6, var6, -102242165);
               this.field4648 = -1483989667 * var6;
            }

            this.field4660 = 886505073;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "oo.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("kq")
   boolean method8599(int var1) {
      try {
         boolean var10000;
         if (this.field4661 * -178140633 != this.field4658 * 1141616381) {
            if (var1 != 1339616614) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.ci(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Lsl;)Z")
   @ObfuscatedName("ht")
   public static boolean method8387(classOO var0, AbstractFont var1) {
      boolean var2 = !var0.field4655;
      var0.field4654.method10140(var1, (short)9811);
      var0.field4656.method10140(var1, (short)8403);
      var0.field4655 = true;
      var2 |= var0.method8401(1477083579 * var0.field4665, 1144344585 * var0.field4659, -504814327);
      var2 |= method8450(var0, var0.field4658 * -1090725051, -178140633 * var0.field4661, 466229862);
      if (method8615(var0, (byte)53)) {
         method8636(var0, (byte)4);
         var2 = true;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jx")
   public int method8590() {
      return this.field4654.method10225(-1832745790);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)V")
   @ObfuscatedName("ki")
   public static void method8426(classOO var0) {
      if (var0 == null) {
         var0.method8445();
      }

      if (!var0.method8441(861106329) && -178140633 * var0.field4661 > 0) {
         int var1 = classSF.method10178(var0.field4654, var0.field4661 * -178140633 - 1, (byte)21);
         method8636(var0, (byte)4);
         method8450(var0, var1, var1, 2064873094);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lsi;")
   @ObfuscatedName("hs")
   public classSI method8537() {
      return classSF.method10155(this.field4654, this.field4658 * 1141616381, this.field4661 * -178140633, -1780949591);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bf")
   public void method8521(byte var1) {
      try {
         this.field4659 = Math.max(0, 1144344585 * this.field4659 - classSF.method10199(this.field4654, (byte)-71)) * -1568195015;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.bf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ke")
   void method8635() {
      if (null != this.field4675) {
         this.field4675.vmethod158((byte)0);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ju")
   boolean method8600() {
      return this.field4661 * -178140633 != this.field4658 * 1141616381;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ch")
   public int method8549(int var1) {
      try {
         return this.field4661 * -178140633;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.ch(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("js")
   String method8602(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (this.method8637(var4, -945420230)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedSignature(descriptor = "(Lvp;Lvp;)V")
   @ObfuscatedName("ji")
   void method8605(classVP var1, classVP var2) {
      if ((Integer)var2.field6227 < (Integer)var1.field6227) {
         method8450(this, (Integer)var1.field6228, (Integer)var2.field6227, 1338021787);
      } else {
         method8450(this, (Integer)var1.field6227, (Integer)var2.field6228, -1575496794);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;Lvp;)V")
   @ObfuscatedName("jr")
   void method8606(classVP var1, classVP var2) {
      if ((Integer)var2.field6227 < (Integer)var1.field6227) {
         method8450(this, (Integer)var1.field6228, (Integer)var2.field6227, 1843829061);
      } else {
         method8450(this, (Integer)var1.field6227, (Integer)var2.field6228, -1184461867);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvp;")
   @ObfuscatedName("jq")
   classVP method8608(int var1) {
      int var2 = this.field4654.method10130(12159716);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (this.method8628(this.field4654.method10117(var5 - 1, (byte)20).field5869, 1176628948)) {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.method8628(this.field4654.method10117(var6, (byte)26).field5869, 2063924824)) {
            var4 = var6;
            break;
         }
      }

      return new classVP(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)Lvp;")
   @ObfuscatedName("jg")
   classVP method8609(int var1) {
      int var2 = this.field4654.method10130(-2072004656);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (this.method8628(this.field4654.method10117(var5 - 1, (byte)112).field5869, 541943073)) {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.method8628(this.field4654.method10117(var6, (byte)78).field5869, 737029607)) {
            var4 = var6;
            break;
         }
      }

      return new classVP(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)Lvp;")
   @ObfuscatedName("jc")
   classVP method8610(int var1) {
      int var2 = this.field4654.method10130(-1572561403);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (this.method8628(this.field4654.method10117(var5 - 1, (byte)116).field5869, 826725365)) {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.method8628(this.field4654.method10117(var6, (byte)89).field5869, 2097448672)) {
            var4 = var6;
            break;
         }
      }

      return new classVP(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Loo;B)V")
   @ObfuscatedName("ob")
   public static void method8636(classOO var0, byte var1) {
      if (var0 == null) {
         var0.method8427(var1);
      } else {
         try {
            if (null != var0.field4675) {
               if (var1 != 4) {
                  return;
               }

               var0.field4675.vmethod158((byte)0);
            }
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "oo.dd(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvp;")
   @ObfuscatedName("jh")
   classVP method8612(int var1) {
      int var2 = this.field4654.method10130(117024903);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (this.field4654.method10117(var5 - 1, (byte)58).field5869 == '\n') {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.field4654.method10117(var6, (byte)59).field5869 == '\n') {
            var4 = var6;
            break;
         }
      }

      return new classVP(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)Lvp;")
   @ObfuscatedName("jl")
   classVP method8613(int var1) {
      int var2 = this.field4654.method10130(362549551);
      int var3 = 0;
      int var4 = var2;

      for (int var5 = var1; var5 > 0; var5--) {
         if (this.field4654.method10117(var5 - 1, (byte)127).field5869 == '\n') {
            var3 = var5;
            break;
         }
      }

      for (int var6 = var1; var6 < var2; var6++) {
         if (this.field4654.method10117(var6, (byte)98).field5869 == '\n') {
            var4 = var6;
            break;
         }
      }

      return new classVP(var3, var4);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("je")
   boolean method8616() {
      if (!this.method8557((byte)56)) {
         return false;
      } else {
         boolean var1 = false;
         if (this.field4654.method10130(-663553111) > 1101026387 * this.field4662) {
            this.field4654.method10179(1971083600 * this.field4662, this.field4654.method10130(-935982354), 2036214745);
            var1 = true;
         }

         int var2 = this.method8570(-1871046432);
         if (this.field4654.method10201(-2070207934) > var2) {
            int var3 = classSF.method10188(this.field4654, 0, var2, (byte)0) - 1;
            this.field4654.method10179(var3, this.field4654.method10130(-749847441), 2036214745);
            var1 = true;
         }

         if (var1) {
            int var6 = this.field4661 * -178140633;
            int var4 = this.field4658 * 1141616381;
            int var5 = this.field4654.method10130(-220784731);
            if (-178140633 * this.field4661 > var5) {
               var6 = var5;
            }

            if (this.field4658 * 1329350918 > var5) {
               var4 = var5;
            }

            method8450(this, var4, var6, 609881409);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jz")
   boolean method8617() {
      if (!this.method8557((byte)5)) {
         return false;
      } else {
         boolean var1 = false;
         if (this.field4654.method10130(-1798821574) > -1238170022 * this.field4662) {
            this.field4654.method10179(905212732 * this.field4662, this.field4654.method10130(-379138438), 2036214745);
            var1 = true;
         }

         int var2 = this.method8570(-2111320753);
         if (this.field4654.method10201(-1615840998) > var2) {
            int var3 = classSF.method10188(this.field4654, 0, var2, (byte)0) - 1;
            this.field4654.method10179(var3, this.field4654.method10130(303037121), 2036214745);
            var1 = true;
         }

         if (var1) {
            int var6 = this.field4661 * -1465353206;
            int var4 = this.field4658 * 1141616381;
            int var5 = this.field4654.method10130(715902057);
            if (627364438 * this.field4661 > var5) {
               var6 = var5;
            }

            if (this.field4658 * -1856523017 > var5) {
               var4 = var5;
            }

            method8450(this, var4, var6, 859391636);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("df")
   void method8369() {
      this.field4663 = (this.field4663 * -960670575 + 1) % 60 * 1057800112;
      if (1304772649 * this.field4660 > 0) {
         this.field4660 -= -1850237453;
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("jt")
   void method8620(int var1, boolean var2) {
      if (var2) {
         method8450(this, 1141616381 * this.field4658, var1, 639070895);
      } else {
         method8450(this, var1, var1, 204564291);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kj")
   int method8623() {
      return this.field4664 * 940467603 / classSF.method10199(this.field4654, (byte)48);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kl")
   int method8624() {
      return this.field4664 * 940467603 / classSF.method10199(this.field4654, (byte)55);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method8370(int var1) {
      try {
         this.field4663 = (this.field4663 * 480497051 + 1) % 60 * -1269182317;
         if (1304772649 * this.field4660 > 0) {
            if (var1 == -1306701625) {
               throw new IllegalStateException();
            }

            this.field4660 -= 2097044505;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("kr")
   void method8627() {
      classSI var1 = classSF.method10155(this.field4654, 0, 1619928030 * this.field4661, -1748640432);
      classVP var2 = var1.method10301(726888077);
      int var3 = classSF.method10199(this.field4654, (byte)7);
      int var4 = (Integer)var2.field6227 - 10;
      int var5 = 20 + var4;
      int var6 = (Integer)var2.field6228 - 3;
      int var7 = 6 + var6 + var3;
      int var8 = this.field4665 * -1159242269;
      int var9 = -669313229 * this.field4649 + var8;
      int var10 = this.field4659 * 1144344585;
      int var11 = var10 + 940467603 * this.field4664;
      int var12 = this.field4665 * -1391406372;
      int var13 = 1144344585 * this.field4659;
      if (var4 < var8) {
         var12 = var4;
      } else if (var5 > var9) {
         var12 = var5 - this.field4649 * 2084389084;
      }

      if (var6 < var10) {
         var13 = var6;
      } else if (var7 > var11) {
         var13 = var7 - this.field4664 * 940467603;
      }

      this.method8401(var12, var13, -1844146315);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ci")
   boolean method8630(int var1) {
      return var1 == 32 || 10 == var1 || 9 == var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ky")
   boolean method8631(int var1) {
      return var1 == -1211561224 || 10 == var1 || 9 == var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ep")
   public boolean method8421(int var1) {
      if (this.method8637(var1, -945420230)) {
         this.method8441(1798004817);
         classSC var2 = this.field4654.method10161((char)var1, -178140633 * this.field4661, this.field4657 * -1011709939, (byte)-12);
         method8450(this, var2.method10072((byte)-102), var2.method10072((byte)-83), 2068221667);
         method8615(this, (byte)59);
         method8636(this, (byte)4);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ij")
   public int method8581() {
      return this.field4654.method10219(-1233290684);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("em")
   public boolean method8415(int var1) {
      this.field4653 = var1 * 1706064079;
      String var2 = classSF.method10131(this.field4654, (byte)-120);
      int var3 = var2.length();
      var2 = method8601(this, var2, (byte)4);
      if (var2.length() != var3) {
         this.field4654.method10168(var2, -238156366);
         this.method8401(this.field4665 * -1159242269, 1144344585 * this.field4659, -1591200637);
         method8615(this, (byte)99);
         method8636(this, (byte)4);
         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("gr")
   public static void method8377(classOO var0, boolean var1) {
      if (var0 == null) {
         var0.method8500(var1);
      }

      var0.field4651 = var1;
      var0.field4666 = var1 && var0.field4666;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("cu")
   public boolean method8557(byte var1) {
      try {
         return this.field4655;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cu(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)V")
   @ObfuscatedName("ln")
   public static void method8447(classOO var0) {
      method8450(var0, 0, var0.field4654.method10130(-1808556367), -1280222224);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("al")
   boolean method8639(int var1) {
      switch (this.field4653 * 1818353789) {
         case 1:
            return class189.isAlphaNumeric((char)var1, -67189462);
         case 2:
            return ServerPacket.isCharAlphabetic((char)var1, (short)-3843);
         case 3:
            return class341.isDigit((char)var1, -1630344583);
         case 4:
            char var2 = (char)var1;
            if (class341.isDigit(var2, -1532843382)) {
               return true;
            } else {
               if ('k' != var2 && var2 != -1952664437 && var2 != 78232375 && -1693131867 != var2 && 1674723517 != var2 && var2 != 1224979794) {
                  return false;
               }

               return true;
            }
         default:
            return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fq")
   public void method8453(boolean var1) {
      classVP var2 = method8611(this, -178140633 * this.field4661, (byte)0);
      this.method8619((Integer)var2.field6227, var1, (short)512);
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("jy")
   void method8621(int var1, boolean var2) {
      if (var2) {
         method8450(this, 1141616381 * this.field4658, var1, -441440620);
      } else {
         method8450(this, var1, var1, -1301408104);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gl")
   public void method8499(boolean var1) {
      classSI var2 = classSF.method10155(this.field4654, 0, -178140633 * this.field4661, -1691939398);
      classVP var3 = var2.method10301(726888077);
      this.method8619(
         classSF.method10182(this.field4654, (Integer)var3.field6227, -859471671 * this.field4659 + 940467603 * this.field4664, (byte)59), var1, (short)512
      );
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("db")
   public boolean method8374(boolean var1) {
      var1 = var1 && this.field4651;
      boolean var2 = var1 != this.field4666;
      this.field4666 = var1;
      if (!this.field4666) {
         method8450(this, -178140633 * this.field4661, -178140633 * this.field4661, -1680737476);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;II)Z")
   @ObfuscatedName("jv")
   public static boolean method8403(classOO var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8409(var1, var1);
      }

      if (!var0.method8557((byte)-67)) {
         var0.field4665 = -968175669 * var1;
         var0.field4659 = var2 * -1568195015;
         return false;
      } else {
         int var3 = -1159242269 * var0.field4665;
         int var4 = var0.field4659 * 1144344585;
         int var5 = Math.max(0, var0.field4654.method10191(-434302836) - -669313229 * var0.field4649 + 2);
         int var6 = Math.max(0, classSF.method10196(var0.field4654, (byte)46) - 940467603 * var0.field4664 + 1);
         var0.field4665 = Math.max(0, Math.min(var5, var1)) * -968175669;
         var0.field4659 = Math.max(0, Math.min(var6, var2)) * -1568195015;
         return var3 != var0.field4665 * -1159242269 || var4 != 1144344585 * var0.field4659;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ak")
   public boolean method8404(int var1, int var2, int var3) {
      try {
         if (!this.method8557((byte)9)) {
            if (var3 >= -239574448) {
               throw new IllegalStateException();
            } else {
               this.field4661 = -968175669 * var1;
               this.field4653 = var2 * -1568195015;
               return false;
            }
         } else {
            int var4 = -1159242269 * this.field4663;
            int var5 = this.field4664 * 1144344585;
            int var6 = Math.max(0, this.field4654.method10225(-434302836) - -669313229 * this.field4659 + 2);
            int var7 = Math.max(0, classSF.method10196(this.field4654, (byte)46) - 940467603 * this.field4662 + 1);
            this.field4652 = Math.max(0, Math.min(var6, var1)) * -968175669;
            this.field4664 = Math.max(0, Math.min(var7, var2)) * -1568195015;
            if (var4 == this.field4660 * -1159242269) {
               if (var5 == 1144344585 * this.field4649) {
                  return false;
               }

               if (var3 >= -239574448) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "oo.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bo")
   public void method8461(boolean var1, int var2) {
      try {
         this.method8619(this.field4656.method10225(-1717062275), var1, (short)512);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bg")
   public void method8470(boolean var1, int var2) {
      try {
         if (this.method8599(1339616614)) {
            if (var2 != -327983032) {
               throw new IllegalStateException();
            }

            if (!var1) {
               if (var2 != -327983032) {
                  return;
               }

               this.method8619(Math.max(this.field4665 * 1141616381, this.field4658 * -178140633), var1, (short)512);
               return;
            }
         }

         if (-178140633 * this.field4662 < this.field4654.method10230(-1446088853)) {
            if (var2 != -327983032) {
               throw new IllegalStateException();
            }

            this.method8619(1 + -178140633 * this.field4662, var1, (short)512);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.bg(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)Lvp;")
   @ObfuscatedName("zj")
   public static classVP method8642(classOO var0) {
      if (var0 == null) {
         var0.method8535();
      }

      int var1 = classSF.method10231(var0.field4654, var0.field4649 * -669313229, (byte)15);
      int var2 = var0.field4654.method10234(940467603 * var0.field4664, -920290026);
      return new classVP(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lor;I)V")
   @ObfuscatedName("bd")
   public void method8527(classOR var1, int var2) {
      try {
         this.field4675 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.bd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsf;")
   @ObfuscatedName("bh")
   public classSF method8532(int var1) {
      try {
         return this.field4654;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("co")
   public int method8567(int var1) {
      try {
         return this.field4654.method10204((short)16256);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("cx")
   public void method8583(int var1, byte var2) {
      try {
         this.field4656.method10223(var1, 1668865275);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.cx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loo;I)I")
   @ObfuscatedName("fj")
   public static int method8568(classOO var0, int var1) {
      if (var0 == null) {
         var0.method8569(var1);
      }

      try {
         return var0.field4654.method10204((short)16256);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cz")
   public boolean method8596(int var1) {
      try {
         return this.method8549(-1661104908) > 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("cf")
   String method8603(String var1, byte var2) {
      try {
         StringBuilder var3 = new StringBuilder(var1.length());

         for (int var4 = 0; var4 < var1.length(); var4++) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            char var5 = var1.charAt(var4);
            if (this.method8628(var5, -945420230)) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               var3.append(var5);
            }
         }

         return var3.toString();
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "oo.cf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lvp;")
   @ObfuscatedName("cv")
   classVP method8614(int var1, byte var2) {
      try {
         int var3 = this.field4656.method10191(261759549);
         int var4 = 0;
         int var5 = var3;

         for (int var6 = var1; var6 > 0; var6--) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (this.field4654.method10117(var6 - 1, (byte)48).field5869 == '\n') {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               var4 = var6;
               break;
            }
         }

         for (int var8 = var1; var8 < var3; var8++) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (this.field4654.method10117(var8, (byte)83).field5869 == '\n') {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               var5 = var8;
               break;
            }
         }

         return new classVP(var4, var5);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oo.cv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("cw")
   boolean method8618(byte var1) {
      try {
         if (!this.method8538((byte)-120)) {
            return false;
         } else {
            boolean var2 = false;
            if (this.field4654.method10175(60263366) > -751218173 * this.field4661) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               this.field4656.method10179(-751218173 * this.field4661, this.field4654.method10225(-2062841723), 2036214745);
               var2 = true;
            }

            int var3 = this.method8559(-421502796);
            if (this.field4656.method10201(-1836721085) > var3) {
               int var4 = classSF.method10188(this.field4656, 0, var3, (byte)0) - 1;
               this.field4656.method10179(var4, this.field4656.method10219(775550435), 2036214745);
               var2 = true;
            }

            if (var2) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               int var8 = this.field4658 * -178140633;
               int var5 = this.field4660 * 1141616381;
               int var6 = this.field4654.method10229(-1240508642);
               if (-178140633 * this.field4653 > var6) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  var8 = var6;
               }

               if (this.field4657 * 1141616381 > var6) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  var5 = var6;
               }

               method8450(this, var5, var8, -830627141);
            }

            return var2;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oo.cw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("dd")
   void method8427(byte var1) {
      try {
         if (!this.method8631(-28547448)) {
            if (var1 <= 20) {
               throw new IllegalStateException();
            }

            if (-178140633 * this.field4664 > 0) {
               if (var1 <= 20) {
                  throw new IllegalStateException();
               }

               int var2 = classSF.method10178(this.field4654, this.field4648 * -178140633 - 1, (byte)21);
               method8636(this, (byte)4);
               method8450(this, var2, var2, -1301938843);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oo.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvp;")
   @ObfuscatedName("dv")
   classVP method8643(int var1) {
      try {
         int var2 = classSF.method10231(this.field4654, this.field4653 * -669313229, (byte)-86);
         int var3 = this.field4654.method10187(940467603 * this.field4664, -364225098);
         return new classVP(var2, var3);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.dv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cb")
   public int method8569(int var1) {
      try {
         return this.field4656.method10204((short)16256);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("dh")
   public void method8500(boolean var1) {
      classSI var2 = classSF.method10155(this.field4656, 0, -178140633 * this.field4658, -1953067929);
      classVP var3 = var2.method10301(726888077);
      this.method8619(
         classSF.method10182(this.field4656, (Integer)var3.field6227, 1144344585 * this.field4653 + 940467603 * this.field4653, (byte)125), var1, (short)512
      );
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bj")
   public void method8490(boolean var1, byte var2) {
      try {
         if (this.field4662 * -178140633 > 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            int var3 = this.method8622(536027292);
            this.method8619(classSF.method10188(this.field4654, -178140633 * this.field4650, -var3, (byte)0), var1, (short)512);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oo.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("cs")
   public int method8553(byte var1) {
      try {
         return this.field4663 * 1141616381;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.ce(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("cg")
   public int method8587(byte var1) {
      try {
         return 1818353789 * this.field4650;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oo.cg(" + 41);
      }
   }
}
