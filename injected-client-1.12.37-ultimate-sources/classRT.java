import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Nameable;
import net.runelite.api.NameableContainer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rt")
public abstract class classRT implements NameableContainer {
   @ObfuscatedName("aj")
   HashMap field5845;
   @ObfuscatedName("ao")
   int field5842 = 0;
   @ObfuscatedName("aq")
   Comparator field5841 = null;
   @ObfuscatedName("ay")
   HashMap field5844;
   @ObfuscatedSignature(descriptor = "[Lrr;")
   @ObfuscatedName("al")
   classRR[] field5843;
   @ObfuscatedName("aa")
   final int field5840;

   @ObfuscatedSignature(descriptor = "(Lrt;Laae;I)Lrr;")
   @ObfuscatedName("ss")
   public static classRR method10212(classRT var0, classAAE var1, int var2) {
      if (var0 == null) {
         return var0.method10215(var1, var2);
      } else {
         try {
            if (!var1.method171(-621636426)) {
               if (var2 <= 1845567280) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               return (classRR)var0.field5845.get(var1);
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "rt.bt(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;I)Lrr;")
   @ObfuscatedName("br")
   public classRR method10207(classAAE var1, int var2) {
      try {
         classRR var3 = method10209(this, var1, 1151810578);
         if (null != var3) {
            if (var2 != 282151994) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            return method10212(this, var1, 1869044132);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rt.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("bn")
   public void method10188(short var1) {
      try {
         this.field5842 = 0;
         Arrays.fill(this.field5843, null);
         this.field5844.clear();
         this.field5845.clear();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rt.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bx")
   public int method10191(int var1) {
      try {
         return 1744080879 * this.field5842;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rt.bx(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Laae;Laae;)V")
   @ObfuscatedName("dd")
   final void method10236(classRR var1, classAAE var2, classAAE var3) {
      this.method10244(var1, -349734976);
      classRR.method10176(var1, var2, var3, -1941374959);
      this.method10252(var1, -824594473);
   }

   @ObfuscatedSignature(descriptor = "(Laae;B)Z")
   @ObfuscatedName("bp")
   public boolean method10202(classAAE var1, byte var2) {
      try {
         if (!var1.method171(392176494)) {
            if (var2 != 10) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (this.field5844.containsKey(var1)) {
            if (var2 != 10) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.field5845.containsKey(var1);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bp(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Laae;)Z")
   @ObfuscatedName("jo")
   public static boolean method10203(classRT var0, classAAE var1) {
      if (var0 == null) {
         var0.method10211(var1);
      }

      if (!var1.method171(981779444)) {
         return false;
      } else {
         return var0.field5844.containsKey(var1) ? true : var0.field5845.containsKey(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("dw")
   final void method10248(classRR var1) {
      this.field5843[(this.field5842 += 2063367951) * 1744080879 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lrr;")
   @ObfuscatedName("az")
   abstract classRR vmethod555(int var1);

   @ObfuscatedSignature(descriptor = "(Laae;Laae;)V")
   @ObfuscatedName("xg")
   public void method10263(classAAE var1, classAAE var2) {
      this.vmethod567(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lrt;Laae;I)Lrr;")
   @ObfuscatedName("vm")
   public static classRR method10209(classRT var0, classAAE var1, int var2) {
      if (var0 == null) {
         return var0.method10216(var1, var2);
      } else {
         try {
            if (!var1.method171(-511180222)) {
               if (var2 == 742819657) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               return (classRR)var0.field5844.get(var1);
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "rt.bm(" + ')');
         }
      }
   }

   public Nameable findByName(String var1) {
      return this.method10265(new classAAE(var1, classPK.field5279));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Laae;)Z")
   @ObfuscatedName("mk")
   public static boolean method10217(classRT var0, classAAE var1) {
      if (var0 == null) {
         var0.method10225(var1);
      }

      classRR var2 = method10209(var0, var1, 1762849915);
      if (var2 == null) {
         return false;
      } else {
         var0.method10220(var2, 722366541);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;I)V")
   @ObfuscatedName("bj")
   final void method10220(classRR var1, int var2) {
      this.method10264(var1);

      try {
         int var3 = this.method10240(var1, 781452173);
         if (var3 == -1) {
            if (var2 >= 1916575490) {
               throw new IllegalStateException();
            }
         } else {
            this.method10253(var3, 2092413899);
            this.method10244(var1, -1160009488);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rt.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;I)Lrr;")
   @ObfuscatedName("bt")
   classRR method10223(classAAE var1, int var2) {
      try {
         return this.method10226(var1, null, (byte)-120);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;Laae;B)Lrr;")
   @ObfuscatedName("bo")
   classRR method10226(classAAE var1, classAAE var2, byte var3) {
      try {
         if (method10209(this, var1, -974674841) != null) {
            if (var3 >= 4) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            classRR var4 = this.vmethod555(1519310820);
            classRR.method10176(var4, var1, var2, -1940504862);
            this.method10249(var4, -183701127);
            this.method10252(var4, -824594473);
            this.method10263(var1, var2);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "rt.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ba")
   public final void method10234(byte var1) {
      try {
         if (this.field5841 == null) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            Arrays.sort(this.field5843, 0, this.field5842 * 1744080879);
         } else {
            Arrays.sort(this.field5843, 0, this.field5842 * 1744080879, this.field5841);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rt.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Laae;Laae;I)V")
   @ObfuscatedName("bw")
   final void method10237(classRR var1, classAAE var2, classAAE var3, int var4) {
      try {
         this.method10244(var1, -1333198206);
         classRR.method10176(var1, var2, var3, -1930057511);
         this.method10252(var1, -824594473);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "rt.bw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;I)I")
   @ObfuscatedName("bb")
   final int method10240(classRR var1, int var2) {
      try {
         for (int var3 = 0; var3 < 1744080879 * this.field5842; var3++) {
            if (this.field5843[var3] == var1) {
               if (var2 <= 186988688) {
                  throw new IllegalStateException();
               }

               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rt.bb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;I)V")
   @ObfuscatedName("bi")
   final void method10244(classRR var1, int var2) {
      try {
         if (this.field5844.remove(var1.field5835) == null) {
            throw new IllegalStateException();
         } else {
            if (var1.field5834 != null) {
               if (var2 >= 869567737) {
                  return;
               }

               this.field5845.remove(var1.field5834);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bi(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Ljava/util/Comparator;)V")
   @ObfuscatedName("ys")
   public static void method10261(classRT var0, Comparator var1) {
      if (null == var0.field5841) {
         var0.field5841 = var1;
      } else if (var0.field5841 instanceof classRD) {
         ((classRD)var0.field5841).method9940(var1, 1072642345);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method10190(int var0) {
      try {
         classJZ.method6431(classPR.field5385);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "rt.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Laae;Laae;)Lrr;")
   @ObfuscatedName("vd")
   public static classRR method10227(classRT var0, classAAE var1, classAAE var2) {
      if (var0 == null) {
         var0.method10225(var1);
      }

      if (method10209(var0, var1, -629464443) != null) {
         throw new IllegalStateException();
      } else {
         classRR var3 = var0.vmethod555(-2036634699);
         classRR.method10176(var3, var1, var2, -1663442090);
         var0.method10249(var3, -183701127);
         var0.method10252(var3, -824594473);
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;I)V")
   @ObfuscatedName("by")
   final void method10252(classRR var1, int var2) {
      try {
         this.field5844.put(var1.field5835, var1);
         if (var1.field5834 != null) {
            if (var2 != -824594473) {
               throw new IllegalStateException();
            }

            classRR var3 = this.field5845.put(var1.field5834, var1);
            if (null != var3) {
               if (var2 != -824594473) {
                  throw new IllegalStateException();
               }

               if (var3 != var1) {
                  var3.field5834 = null;
                  var3.method10180(-1);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rt.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrt;II)Lrr;")
   @ObfuscatedName("cl")
   public static classRR method10231(classRT var0, int var1, int var2) {
      if (var0 == null) {
         var0.method10233(var1, var1);
      }

      try {
         if (var1 >= 0) {
            if (var2 <= 1259291220) {
               throw new IllegalStateException();
            }

            if (var1 < var0.field5842 * 1744080879) {
               return var0.field5843[var1];
            }
         }

         throw new ArrayIndexOutOfBoundsException(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   public int method10192() {
      return -137866543 * this.field5842;
   }

   @ObfuscatedSignature(descriptor = "(Lrr;I)V")
   @ObfuscatedName("be")
   final void method10249(classRR var1, int var2) {
      try {
         this.field5843[(this.field5842 += 2063367951) * 1744080879 - 1] = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)[Lrr;")
   @ObfuscatedName("af")
   abstract classRR[] vmethod558(int var1, byte var2);

   @ObfuscatedSignature(descriptor = "()Lrr;")
   @ObfuscatedName("ab")
   abstract classRR vmethod556();

   @ObfuscatedSignature(descriptor = "()Lrr;")
   @ObfuscatedName("ag")
   abstract classRR vmethod557();

   @ObfuscatedSignature(descriptor = "(Lrt;I)Z")
   @ObfuscatedName("lf")
   public static boolean method10195(classRT var0, int var1) {
      if (var0 == null) {
         var0.method10201(var1);
      }

      try {
         boolean var10000;
         if (var0.field5840 * 488407471 == 1744080879 * var0.field5842) {
            if (var1 != 2037364072) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rt.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Lrr;")
   @ObfuscatedName("cg")
   classRR method10224(classAAE var1) {
      return this.method10226(var1, null, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   public void method10189() {
      this.field5842 = 0;
      Arrays.fill(this.field5843, null);
      this.field5844.clear();
      this.field5845.clear();
   }

   @ObfuscatedSignature(descriptor = "(Laae;Laae;)V")
   @ObfuscatedName("zl")
   public void vmethod567(classAAE var1, classAAE var2) {
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Lrr;")
   @ObfuscatedName("cl")
   public classRR method10265(classAAE var1) {
      return method10209(this, var1, -1470289739);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("cn")
   final void method10221(classRR var1) {
      int var2 = this.method10240(var1, 336474128);
      if (var2 != -1) {
         this.method10253(var2, 2109851146);
         this.method10244(var1, -285842783);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bv")
   public int method10193() {
      return 1014731329 * this.field5842;
   }

   @ObfuscatedSignature(descriptor = "(I)[Lrr;")
   @ObfuscatedName("as")
   abstract classRR[] vmethod559(int var1);

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cr")
   public boolean method10196() {
      return this.field5840 * 488407471 == 1744080879 * this.field5842;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   public boolean method10197() {
      return this.field5840 * 488407471 == 1744080879 * this.field5842;
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Lrr;")
   @ObfuscatedName("ck")
   classRR method10213(classAAE var1) {
      return !var1.method171(1175495949) ? null : (classRR)this.field5845.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Z")
   @ObfuscatedName("ct")
   public boolean method10204(classAAE var1) {
      if (!var1.method171(1314428683)) {
         return false;
      } else {
         return this.field5844.containsKey(var1) ? true : this.field5845.containsKey(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Z")
   @ObfuscatedName("cq")
   public boolean method10205(classAAE var1) {
      if (!var1.method171(252559147)) {
         return false;
      } else {
         return this.field5844.containsKey(var1) ? true : this.field5845.containsKey(var1);
      }
   }

   public int getCount() {
      return this.field5842 * 1744080879;
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Lrr;")
   @ObfuscatedName("oi")
   public classRR method10208(classAAE var1) {
      classRR var2 = method10209(this, var1, 1211872497);
      return null != var2 ? var2 : method10212(this, var1, 2063689206);
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Lrr;")
   @ObfuscatedName("cd")
   classRR method10210(classAAE var1) {
      return !var1.method171(362688807) ? null : (classRR)this.field5844.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Lrr;")
   @ObfuscatedName("cv")
   classRR method10211(classAAE var1) {
      return !var1.method171(-135614352) ? null : (classRR)this.field5844.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Lrr;")
   @ObfuscatedName("co")
   classRR method10214(classAAE var1) {
      return !var1.method171(1355585728) ? null : (classRR)this.field5845.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Laae;I)Z")
   @ObfuscatedName("bg")
   public final boolean method10218(classAAE var1, int var2) {
      try {
         classRR var3 = method10209(this, var1, 2014550388);
         if (var3 == null) {
            if (var2 == -315833907) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.method10220(var3, -1126613332);
            return true;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rt.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Z")
   @ObfuscatedName("tk")
   public boolean method10266(classAAE var1) {
      return this.method10202(var1, (byte)10);
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Z")
   @ObfuscatedName("cc")
   public final boolean method10219(classAAE var1) {
      classRR var2 = method10209(this, var1, 1990998649);
      if (var2 == null) {
         return false;
      } else {
         this.method10220(var2, -396801539);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("cf")
   final void method10222(classRR var1) {
      int var2 = this.method10240(var1, 504360974);
      if (var2 != -1) {
         this.method10253(var2, 2136174790);
         this.method10244(var1, -450794868);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("ww")
   public void vmethod566(classRR var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;I)V")
   @ObfuscatedName("bs")
   public final void method10262(Comparator var1, int var2) {
      try {
         if (null == this.field5841) {
            this.field5841 = var1;
         } else if (this.field5841 instanceof classRD) {
            if (var2 == -324749371) {
               throw new IllegalStateException();
            }

            ((classRD)this.field5841).method9940(var1, 1072642345);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;)Lrr;")
   @ObfuscatedName("ch")
   classRR method10225(classAAE var1) {
      return this.method10226(var1, null, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)I")
   @ObfuscatedName("dx")
   final int method10241(classRR var1) {
      for (int var2 = 0; var2 < 1744080879 * this.field5842; var2++) {
         if (this.field5843[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedSignature(descriptor = "(Laae;Laae;)Lrr;")
   @ObfuscatedName("cj")
   classRR method10228(classAAE var1, classAAE var2) {
      if (method10209(this, var1, -1260438771) != null) {
         throw new IllegalStateException();
      } else {
         classRR var3 = this.vmethod555(-1672285238);
         classRR.method10176(var3, var1, var2, -2100035047);
         this.method10249(var3, -183701127);
         this.method10252(var3, -824594473);
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;Laae;)Lrr;")
   @ObfuscatedName("ci")
   classRR method10229(classAAE var1, classAAE var2) {
      if (method10209(this, var1, 2135494846) != null) {
         throw new IllegalStateException();
      } else {
         classRR var3 = this.vmethod555(464373723);
         classRR.method10176(var3, var1, var2, -1907369293);
         this.method10249(var3, -183701127);
         this.method10252(var3, -824594473);
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bh")
   public int method10194() {
      return 1744080879 * this.field5842;
   }

   @ObfuscatedSignature(descriptor = "(I)Lrr;")
   @ObfuscatedName("ce")
   public final classRR method10232(int var1) {
      if (var1 >= 0 && var1 < this.field5842 * 1744080879) {
         return this.field5843[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   public final void method10235() {
      if (this.field5841 == null) {
         Arrays.sort(this.field5843, 0, this.field5842 * 1744080879);
      } else {
         Arrays.sort(this.field5843, 0, this.field5842 * 1744080879, this.field5841);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   public boolean method10198() {
      return this.field5840 * 559538103 == 1744080879 * this.field5842;
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Laae;Laae;)V")
   @ObfuscatedName("dc")
   final void method10238(classRR var1, classAAE var2, classAAE var3) {
      this.method10244(var1, -190592125);
      classRR.method10176(var1, var2, var3, -1805671888);
      this.method10252(var1, -824594473);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Laae;Laae;)V")
   @ObfuscatedName("dm")
   final void method10239(classRR var1, classAAE var2, classAAE var3) {
      this.method10244(var1, -517478367);
      classRR.method10176(var1, var2, var3, -2129434859);
      this.method10252(var1, -824594473);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;)Z")
   @ObfuscatedName("vu")
   public static boolean method10199(classRT var0) {
      if (var0 == null) {
         var0.method10200();
      }

      return var0.field5840 * 488407471 == 1744080879 * var0.field5842;
   }

   public Nameable[] getMembers() {
      classRR[] var1 = this.method10267();
      int var2 = this.getCount();
      return Arrays.copyOf(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)I")
   @ObfuscatedName("dy")
   final int method10242(classRR var1) {
      for (int var2 = 0; var2 < 1744080879 * this.field5842; var2++) {
         if (this.field5843[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Lrr;)I")
   @ObfuscatedName("mu")
   public static int method10243(classRT var0, classRR var1) {
      if (var0 == null) {
         var0.method10250(var1);
      }

      for (int var2 = 0; var2 < 810101209 * var0.field5842; var2++) {
         if (var0.field5843[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedSignature(descriptor = "(Lrt;I)V")
   @ObfuscatedName("cj")
   public static void method10256(classRT var0, int var1) {
      if (var0 == null) {
         var0.method10260(var1);
      } else {
         try {
            var0.field5841 = null;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "rt.bf(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   static void method10206(int var0) {
      try {
         classDI.field1511 = 1311180223;
         classDI.field1519 = new short[4][104][104];
         classCO.field1182 = new short[4][104][104];
         classBY.field619 = new byte[4][104][104];
         classDI.field1518 = new byte[4][104][104];
         classDE.field1410 = new int[4][105][105];
         classFE.field2250 = new byte[4][105][105];
         classDI.field1517 = new int[105][105];
         classAB.field126 = new int[104];
         classCR.field1229 = new int[104];
         client.field1148 = new int[104];
         classBI.field476 = new int[104];
         classIC.field2941 = new int[104];
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "rt.az(" + ')');
      }
   }

   public int getSize() {
      return this.field5840 * 488407471;
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("du")
   final void method10245(classRR var1) {
      if (this.field5844.remove(var1.field5835) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field5834 != null) {
            this.field5845.remove(var1.field5834);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("dt")
   final void method10246(classRR var1) {
      if (this.field5844.remove(var1.field5835) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field5834 != null) {
            this.field5845.remove(var1.field5834);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bq")
   final void method10253(int var1, int var2) {
      try {
         this.field5842 -= 2063367951;
         if (var1 < this.field5842 * 1744080879) {
            if (var2 <= 2079045159) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.field5843, 1 + var1, this.field5843, var1, 1744080879 * this.field5842 - var1);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("dk")
   final void method10250(classRR var1) {
      this.field5843[(this.field5842 += 2063367951) * 1744080879 - 1] = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Lrr;)V")
   @ObfuscatedName("kp")
   public static void method10247(classRT var0, classRR var1) {
      if (var0.field5844.remove(var1.field5835) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field5834 != null) {
            var0.field5845.remove(var1.field5834);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("db")
   final void method10251(classRR var1) {
      this.field5843[(this.field5842 += 2063367951) * 1744080879 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "()[Lrr;")
   @ObfuscatedName("ct")
   public classRR[] method10267() {
      return this.field5843;
   }

   classRT(int var1) {
      this.field5840 = 1220638031 * var1;
      this.field5843 = this.vmethod558(var1, (byte)2);
      this.field5844 = new HashMap(var1 / 8);
      this.field5845 = new HashMap(var1 / 8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("de")
   final void method10254(int var1) {
      this.field5842 -= 2063367951;
      if (var1 < this.field5842 * 1744080879) {
         System.arraycopy(this.field5843, 1 + var1, this.field5843, var1, 1744080879 * this.field5842 - var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dz")
   final void method10255(int var1) {
      this.field5842 -= 2063367951;
      if (var1 < this.field5842 * 1744080879) {
         System.arraycopy(this.field5843, 1 + var1, this.field5843, var1, 1744080879 * this.field5842 - var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public final void method10257() {
      this.field5841 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dv")
   public final void method10258() {
      this.field5841 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("do")
   public final void method10259() {
      this.field5841 = null;
   }

   @ObfuscatedSignature(descriptor = "(IIII)F")
   @ObfuscatedName("ay")
   static float method10187(int var0, int var1, int var2, int var3) {
      try {
         return (float)(var0 - var1) / (var2 - var1);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rt.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("xr")
   public void method10264(classRR var1) {
      this.vmethod566(var1);
   }

   @ObfuscatedSignature(descriptor = "(Laae;I)Lrr;")
   @ObfuscatedName("bm")
   classRR method10215(classAAE var1, int var2) {
      try {
         if (!var1.method171(-621636426)) {
            if (var2 <= 1845567280) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (classRR)this.field5845.get(var1);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;I)Lrr;")
   @ObfuscatedName("bk")
   classRR method10216(classAAE var1, int var2) {
      try {
         if (!var1.method171(-621636426)) {
            if (var2 <= 1845567280) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (classRR)this.field5845.get(var1);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bt(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Laae;Laae;)Lrr;")
   @ObfuscatedName("om")
   public static classRR method10230(classRT var0, classAAE var1, classAAE var2) {
      if (var0 == null) {
         return var0.method10228(var1, var1);
      } else if (method10209(var0, var1, -275920970) != null) {
         throw new IllegalStateException();
      } else {
         classRR var3 = var0.vmethod555(1403644934);
         classRR.method10176(var3, var1, var2, -2145908811);
         var0.method10249(var3, -183701127);
         var0.method10252(var3, -824594473);
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lrr;")
   @ObfuscatedName("bu")
   public final classRR method10233(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 1259291220) {
               throw new IllegalStateException();
            }

            if (var1 < this.field5842 * 1744080879) {
               return this.field5843[var1];
            }
         }

         throw new ArrayIndexOutOfBoundsException(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rt.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bz")
   public boolean method10200() {
      return this.field5840 * 488407471 == 1744080879 * this.field5842;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bc")
   public boolean method10201(int var1) {
      try {
         boolean var10000;
         if (this.field5840 * 488407471 == 1744080879 * this.field5842) {
            if (var1 != 2037364072) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rt.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bf")
   public final void method10260(int var1) {
      try {
         this.field5841 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rt.bf(" + ')');
      }
   }
}
