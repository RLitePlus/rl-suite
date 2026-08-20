import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vw")
public class classVW {
   @ObfuscatedName("as")
   int field6634;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("az")
   Widget field6622;
   @ObfuscatedName("ae")
   int field6623;
   @ObfuscatedName("ab")
   int field6624;
   @ObfuscatedName("ag")
   boolean field6626;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("ax")
   Widget field6630 = null;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("af")
   Widget field6625;
   @ObfuscatedName("ac")
   boolean field6621;
   @ObfuscatedName("aa")
   int field6628;
   @ObfuscatedName("aj")
   int field6631;
   @ObfuscatedName("al")
   boolean field6627;
   @ObfuscatedName("ao")
   int field6629;
   @ObfuscatedName("ay")
   int field6632;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field6633 = 33;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ch")
   public int method12238() {
      return this.field6629 * -2119087041;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Llw;IIB)V")
   @ObfuscatedName("az")
   void method12175(Widget var1, Widget var2, int var3, int var4, byte var5) {
      try {
         this.field6630 = var1;
         this.field6622 = var2;
         this.field6623 = var3 * 897114003;
         this.field6624 = var4 * -1777112801;
         this.field6634 = 0;
         this.field6626 = false;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "vw.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method12181(int var1) {
      try {
         this.field6630 = null;
         this.field6622 = null;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;Llw;II)Z")
   @ObfuscatedName("ic")
   public static boolean method12190(classVW var0, Widget var1, int var2, int var3) {
      if (var0.field6630 == var1) {
         var0.field6627 = true;
         var0.field6631 = -363936268 * var2;
         var0.field6632 = var3 * -1575374693;
         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;Llw;Llw;II)V")
   @ObfuscatedName("ua")
   public static void method12176(classVW var0, Widget var1, Widget var2, int var3, int var4) {
      if (var0 == null) {
         var0.method12204();
      }

      var0.field6630 = var1;
      var0.field6622 = var2;
      var0.field6623 = var3 * 897114003;
      var0.field6624 = var4 * -1777112801;
      var0.field6634 = 0;
      var0.field6626 = false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cf")
   public int method12239() {
      return this.field6629 * 1267290405;
   }

   @ObfuscatedSignature(descriptor = "(Lvw;B)I")
   @ObfuscatedName("fx")
   public static int method12226(classVW var0, byte var1) {
      if (var0 == null) {
         return var0.method12232(var1);
      } else {
         try {
            return -542846241 * var0.field6624;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "vw.ay(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;Llw;Llw;II)V")
   @ObfuscatedName("jc")
   public static void method12177(classVW var0, Widget var1, Widget var2, int var3, int var4) {
      if (var0 == null) {
         var0.method12206();
      } else {
         var0.field6630 = var1;
         var0.field6622 = var2;
         var0.field6623 = var3 * 897114003;
         var0.field6624 = var4 * -1777112801;
         var0.field6634 = 0;
         var0.field6626 = false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIS)Z")
   @ObfuscatedName("ag")
   public boolean method12194(Widget var1, int var2, int var3, short var4) {
      try {
         if (var1 == this.field6622) {
            if (var4 >= 222) {
               throw new IllegalStateException();
            } else {
               this.field6621 = true;
               this.field6628 = var2 * -680827073;
               this.field6629 = var3 * -1948998721;
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "vw.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   public void method12204() {
      this.field6634 += 36948744;
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)Z")
   @ObfuscatedName("bk")
   public boolean method12191(Widget var1, int var2, int var3) {
      if (this.field6630 == var1) {
         this.field6627 = true;
         this.field6631 = -1238415985 * var2;
         this.field6632 = var3 * -1575374693;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("aa")
   public Widget method12213(int var1) {
      try {
         return this.field6630;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("ao")
   public Widget method12215(int var1) {
      try {
         return this.field6622;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cy")
   public int method12240() {
      return this.field6629 * -2119087041;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   public boolean method12208() {
      return null != this.field6630;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   public boolean method12209(int var1) {
      try {
         boolean var10000;
         if (null != this.field6630) {
            if (var1 <= 1375698635) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int method12235(int var1) {
      try {
         return -279181121 * this.field6628;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvw;I)I")
   @ObfuscatedName("xg")
   public static int method12233(classVW var0, int var1) {
      if (var0 == null) {
         var0.method12234(var1);
      }

      try {
         return var0.field6632 * 1430697363;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ai")
   public int method12245(byte var1) {
      try {
         return 42513585 * this.field6634;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvw;I)V")
   @ObfuscatedName("mh")
   public static void method12186(classVW var0, int var1) {
      if (var0 == null) {
         var0.method12189(var1);
      }

      try {
         var0.field6625 = null;
         var0.field6621 = false;
         var0.field6628 = 680827073;
         var0.field6629 = 1948998721;
         var0.field6627 = false;
         var0.field6631 = 1238415985;
         var0.field6632 = 1575374693;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)Z")
   @ObfuscatedName("wl")
   public static boolean method12210(classVW var0) {
      return null != var0.field6630;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ar")
   public void method12249(byte var1) {
      try {
         if (this.field6634 * 42513585 == 0) {
            this.method12181(2140549221);
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   public void method12252(int var1) {
      try {
         this.field6626 = true;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("ak")
   public boolean method12253(short var1) {
      try {
         return this.field6626;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aq")
   public int method12228(byte var1) {
      try {
         return 985413999 * this.field6631;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("at")
   public boolean method12258(int var1) {
      try {
         return this.field6621;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;Llw;II)Z")
   @ObfuscatedName("gy")
   public static boolean method12195(classVW var0, Widget var1, int var2, int var3) {
      if (var1 == var0.field6622) {
         var0.field6621 = true;
         var0.field6628 = var2 * -680827073;
         var0.field6629 = var3 * -1948998721;
         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)Z")
   @ObfuscatedName("yt")
   public static boolean method12211(classVW var0) {
      return null != var0.field6630;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ax")
   public void method12205(byte var1) {
      try {
         this.field6634 += -1963912111;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Llw;II)V")
   @ObfuscatedName("ah")
   void method12178(Widget var1, Widget var2, int var3, int var4) {
      this.field6630 = var1;
      this.field6622 = var2;
      this.field6623 = var3 * 897114003;
      this.field6624 = var4 * -1083081708;
      this.field6634 = 0;
      this.field6626 = false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ck")
   public int method12229() {
      return -669309901 * this.field6631;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   public void method12182() {
      this.field6630 = null;
      this.field6622 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public void method12187() {
      this.field6625 = null;
      this.field6621 = false;
      this.field6628 = 680827073;
      this.field6629 = 1948998721;
      this.field6627 = false;
      this.field6631 = 1238415985;
      this.field6632 = 1575374693;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   public boolean method12255(int var1) {
      try {
         return this.field6627;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)Z")
   @ObfuscatedName("bo")
   public boolean method12196(Widget var1, int var2, int var3) {
      if (var1 == this.field6622) {
         this.field6621 = true;
         this.field6628 = var2 * -680827073;
         this.field6629 = var3 * -1948998721;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)Z")
   @ObfuscatedName("ba")
   public boolean method12197(Widget var1, int var2, int var3) {
      if (var1 == this.field6622) {
         this.field6621 = true;
         this.field6628 = var2 * -680827073;
         this.field6629 = var3 * -408688570;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("du")
   public boolean method12259() {
      return this.field6621;
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)Z")
   @ObfuscatedName("bb")
   public boolean method12198(Widget var1, int var2, int var3) {
      if (var1 == this.field6622) {
         this.field6621 = true;
         this.field6628 = var2 * -680827073;
         this.field6629 = var3 * -1948998721;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Llw;II)V")
   @ObfuscatedName("am")
   void method12179(Widget var1, Widget var2, int var3, int var4) {
      this.field6630 = var1;
      this.field6622 = var2;
      this.field6623 = var3 * 897114003;
      this.field6624 = var4 * -1777112801;
      this.field6634 = 0;
      this.field6626 = false;
   }

   @ObfuscatedSignature(descriptor = "(Lvw;B)I")
   @ObfuscatedName("ol")
   public static int method12241(classVW var0, byte var1) {
      if (var0 == null) {
         return var0.method12243(var1);
      } else {
         try {
            return var0.field6629 * -2119087041;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "vw.au(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("be")
   public void method12200(Widget var1) {
      this.field6625 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("by")
   public void method12201(Widget var1) {
      this.field6625 = var1;
   }

   classVW() {
      this.field6622 = null;
      this.field6623 = 0;
      this.field6624 = 0;
      this.field6626 = false;
      this.field6625 = null;
      this.field6621 = false;
      this.field6628 = 680827073;
      this.field6629 = 1948998721;
      this.field6627 = false;
      this.field6631 = 1238415985;
      this.field6632 = 1575374693;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   public int method12246() {
      return 42513585 * this.field6634;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   public void method12206() {
      this.field6634 += -1963912111;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   public boolean method12212() {
      return null != this.field6630;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("al")
   public Widget method12218(int var1) {
      try {
         return this.field6625;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("bz")
   public Widget method12214() {
      return this.field6630;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aj")
   public int method12224(byte var1) {
      try {
         return -314698085 * this.field6623;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("ct")
   public Widget method12219() {
      return this.field6625;
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("cp")
   public Widget method12220() {
      return this.field6625;
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("cq")
   public Widget method12221() {
      return this.field6625;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   public void method12250() {
      if (this.field6634 * 42513585 == 0) {
         this.method12181(2142530390);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cj")
   public int method12225() {
      return -314698085 * this.field6623;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)I")
   @ObfuscatedName("un")
   public static int method12242(classVW var0) {
      return var0.field6629 * -2119087041;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cc")
   public int method12227() {
      return -542846241 * this.field6624;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   public void method12183() {
      this.field6630 = null;
      this.field6622 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;Llw;II)Z")
   @ObfuscatedName("jf")
   public static boolean method12199(classVW var0, Widget var1, int var2, int var3) {
      if (var1 == var0.field6622) {
         var0.field6621 = true;
         var0.field6628 = var2 * -61871017;
         var0.field6629 = var3 * -1948998721;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("bi")
   public void method12202(Widget var1) {
      this.field6625 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("co")
   public int method12236() {
      return 929882788 * this.field6628;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cx")
   public int method12237() {
      return -279181121 * this.field6628;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)V")
   @ObfuscatedName("rg")
   public static void method12188(classVW var0) {
      if (var0 == null) {
         var0.method12212();
      }

      var0.field6625 = null;
      var0.field6621 = false;
      var0.field6628 = 680827073;
      var0.field6629 = -783879862;
      var0.field6627 = false;
      var0.field6631 = -700818709;
      var0.field6632 = -1592853406;
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)V")
   @ObfuscatedName("as")
   public void method12203(Widget var1, byte var2) {
      try {
         this.field6625 = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vw.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   public void method12184() {
      this.field6630 = null;
      this.field6622 = null;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Llw;II)V")
   @ObfuscatedName("bx")
   void method12180(Widget var1, Widget var2, int var3, int var4) {
      this.field6630 = var1;
      this.field6622 = var2;
      this.field6623 = var3 * 897114003;
      this.field6624 = var4 * -1777112801;
      this.field6634 = 0;
      this.field6626 = false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)Llw;")
   @ObfuscatedName("du")
   public static Widget method12216(classVW var0) {
      return var0 == null ? var0.method12223() : var0.field6622;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cn")
   public int method12247() {
      return 42513585 * this.field6634;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   public int method12248() {
      return 42513585 * this.field6634;
   }

   @ObfuscatedSignature(descriptor = "(Lvw;Llw;III)Z")
   @ObfuscatedName("pd")
   public static boolean method12192(classVW var0, Widget var1, int var2, int var3, int var4) {
      if (var0 == null) {
         return var0.method12193(var1, var2, var2, var2);
      } else {
         try {
            if (var0.field6630 == var1) {
               if (var4 == -903373568) {
                  throw new IllegalStateException();
               } else {
                  var0.field6627 = true;
                  var0.field6631 = -1238415985 * var2;
                  var0.field6632 = var3 * -1575374693;
                  return true;
               }
            } else {
               return false;
            }
         } catch (RuntimeException var5) {
            throw classEG.newRunException(var5, "vw.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   public void method12207() {
      this.field6634 += -1963912111;
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("cl")
   public Widget method12222() {
      return this.field6625;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)Llw;")
   @ObfuscatedName("fw")
   public static Widget method12217(classVW var0) {
      return var0.field6622;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dm")
   public boolean method12254() {
      return this.field6626;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dx")
   public boolean method12256() {
      return this.field6627;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dy")
   public boolean method12257() {
      return this.field6627;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("di")
   public boolean method12260() {
      return this.field6621;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ci")
   public int method12230() {
      return 985413999 * this.field6631;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   public int method12234(int var1) {
      try {
         return this.field6623 * 1430697363;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("au")
   public int method12243(byte var1) {
      try {
         return this.field6624 * -2119087041;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("cr")
   public Widget method12223() {
      return this.field6630;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)V")
   @ObfuscatedName("ig")
   public static void method12251(classVW var0) {
      if (var0.field6634 * 42513585 == 0) {
         var0.method12181(2147319392);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;III)Z")
   @ObfuscatedName("ab")
   public boolean method12193(Widget var1, int var2, int var3, int var4) {
      try {
         if (this.field6622 == var1) {
            if (var4 == -903373568) {
               throw new IllegalStateException();
            } else {
               this.field6627 = true;
               this.field6623 = -1238415985 * var2;
               this.field6634 = var3 * -1575374693;
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "vw.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   public int method12244() {
      return this.field6624 * -2119087041;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public void method12189(int var1) {
      try {
         this.field6622 = null;
         this.field6621 = false;
         this.field6631 = 680827073;
         this.field6634 = 1948998721;
         this.field6627 = false;
         this.field6632 = 1238415985;
         this.field6634 = 1575374693;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cz")
   public int method12231() {
      return 985413999 * this.field6629;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ay")
   public int method12232(byte var1) {
      try {
         return 985413999 * this.field6631;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vw.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dd")
   public void method12185() {
      this.field6630 = null;
      this.field6630 = null;
   }
}
