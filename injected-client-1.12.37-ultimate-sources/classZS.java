import net.runelite.api.ScriptEventBuilder;
import net.runelite.api.widgets.Widget;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zs")
public final class classZS implements ScriptEventBuilder {
   @ObfuscatedName("az")
   boolean field7268 = false;
   @ObfuscatedName("af")
   Object[] field7261 = null;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("ac")
   classLW field7259 = null;
   @ObfuscatedName("ab")
   int field7260 = 0;
   @ObfuscatedName("ay")
   int field7269;
   @ObfuscatedName("as")
   int field7262;
   @ObfuscatedName("ax")
   int field7263;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("ae")
   classLW field7258;
   @ObfuscatedName("aa")
   int field7257;
   @ObfuscatedName("ao")
   int field7266;
   @ObfuscatedName("al")
   String field7267;
   @ObfuscatedName("aj")
   int field7265;
   @ObfuscatedName("ag")
   int field7264 = 0;

   classZS() {
      this.field7262 = 0;
      this.field7263 = 0;
      this.field7258 = null;
      this.field7257 = 0;
      this.field7266 = 0;
      this.field7267 = null;
      this.field7265 = 0;
      this.field7269 = 0;
   }

   @ObfuscatedSignature(descriptor = "(ZI)Lzs;")
   @ObfuscatedName("az")
   public classZS method14138(boolean var1, int var2) {
      try {
         this.field7268 = var1;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lzs;")
   @ObfuscatedName("aq")
   public classZS method14139(boolean var1) {
      this.field7268 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(IB)Lzs;")
   @ObfuscatedName("ab")
   public classZS method14151(int var1, byte var2) {
      try {
         this.field7264 = -1434072017 * var1;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzs;II)Lzs;")
   @ObfuscatedName("us")
   public static classZS method14148(classZS var0, int var1, int var2) {
      if (var0 == null) {
         var0.method14160(var1, var1);
      }

      try {
         var0.field7260 = -871825887 * var1;
         return var0;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lzs;")
   @ObfuscatedName("ag")
   public classZS method14156(int var1, int var2) {
      try {
         this.field7262 = var1 * -785215481;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("bi")
   public classZS method14172(int var1) {
      this.field7257 = -1978668005 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Lzs;")
   @ObfuscatedName("ax")
   public classZS method14165(String var1, byte var2) {
      try {
         this.field7267 = var1;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lzs;")
   @ObfuscatedName("aa")
   public classZS method14173(int var1, int var2) {
      try {
         this.field7257 = -1978668005 * var1;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("be")
   public classZS method14178(int var1) {
      this.field7265 = -557249088 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lzs;")
   @ObfuscatedName("ay")
   public classZS method14140(boolean var1) {
      this.field7268 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Lzs;")
   @ObfuscatedName("ac")
   public classZS method14168(classLW var1, byte var2) {
      try {
         this.field7258 = var1;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyi;)Lvq;")
   @ObfuscatedName("fz")
   public static classVQ method14136(classYI var0) {
      if (var0.field6988 > 0 && var0.field6989 != var0.field6986[var0.field6988 - 1]) {
         classVQ var2 = var0.field6989;
         var0.field6989 = var2.field6554;
         return var2;
      } else {
         while (var0.field6988 < var0.field6987) {
            classVQ var1 = var0.field6986[var0.field6988++].field6554;
            if (var1 != var0.field6986[var0.field6988 - 1]) {
               var0.field6989 = var1.field6554;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lzs;")
   @ObfuscatedName("bg")
   public classZS method14166(String var1) {
      this.field7267 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lzs;B)Lzr;")
   @ObfuscatedName("op")
   public static classZR method14182(classZS var0, byte var1) {
      if (var0 == null) {
         var0.method14184(var1);
      }

      try {
         return new classZR(var0);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "zs.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzs;Llw;)Lzs;")
   @ObfuscatedName("gx")
   public static classZS method14169(classZS var0, classLW var1) {
      if (var0 == null) {
         var0.method14188();
      }

      var0.field7258 = var1;
      return var0;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)Lzs;")
   @ObfuscatedName("ai")
   public classZS method14142(Object[] var1) {
      this.field7261 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("qb")
   public classZS method14186(int var1) {
      this.field7262 = var1 * -785215481;
      return this;
   }

   public Object[] getArguments() {
      return this.field7261;
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("mq")
   public classLW method14187() {
      return this.field7259;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("ba")
   public classZS method14174(int var1) {
      this.field7257 = -1978668005 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)Lzs;")
   @ObfuscatedName("ar")
   public classZS method14143(Object[] var1) {
      this.field7261 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("yv")
   public classLW method14188() {
      return this.field7258;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)Lzs;")
   @ObfuscatedName("ak")
   public classZS method14144(Object[] var1) {
      this.field7261 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Lzr;")
   @ObfuscatedName("bq")
   public classZR method14183() {
      return new classZR(this);
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("at")
   public classZS method14149(int var1) {
      this.field7260 = -871825887 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("an")
   public classZS method14152(int var1) {
      this.field7264 = 197329699 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("am")
   public classZS method14153(int var1) {
      this.field7264 = -1434072017 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("ah")
   public classZS method14154(int var1) {
      this.field7264 = -1434072017 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/widgets/Widget;)Lzs;")
   @ObfuscatedName("ji")
   public classZS method14189(Widget var1) {
      this.field7259 = (classLW)var1;
      return this;
   }

   public int getOp() {
      return this.field7262 * 1913904567;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("bn")
   public classZS method14155(int var1) {
      this.field7264 = -1434072017 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;B)Lzs;")
   @ObfuscatedName("af")
   public classZS method14145(Object[] var1, byte var2) {
      try {
         this.field7261 = var1;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lzr;")
   @ObfuscatedName("wu")
   public classZR method14185() {
      return new classZR(this);
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("bc")
   public classZS method14157(int var1) {
      this.field7262 = var1 * -785215481;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/widgets/Widget;)Lzs;")
   @ObfuscatedName("xs")
   public classZS method14190(Widget var1) {
      this.field7258 = (classLW)var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("bp")
   public classZS method14158(int var1) {
      this.field7262 = var1 * -785215481;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("br")
   public classZS method14161(int var1) {
      this.field7263 = var1 * 1848781009;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(II)Lzs;")
   @ObfuscatedName("ao")
   public classZS method14177(int var1, int var2) {
      try {
         this.field7266 = -439510407 * var1;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("bt")
   public classZS method14162(int var1) {
      this.field7263 = var1 * 1848781009;
      return this;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)I")
   @ObfuscatedName("so")
   public static int method14137(classVW var0) {
      if (var0 == null) {
         var0.method12244();
      }

      return var0.field6629 * -2119087041;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("av")
   public classZS method14150(int var1) {
      this.field7260 = -871825887 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lzs;")
   @ObfuscatedName("bj")
   public classZS method14167(String var1) {
      this.field7267 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)Lzs;")
   @ObfuscatedName("lv")
   public classZS method14191(Object[] var1) {
      this.field7261 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lzs;")
   @ObfuscatedName("bk")
   public classZS method14170(classLW var1) {
      this.field7258 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(II)Lzs;")
   @ObfuscatedName("as")
   public classZS method14163(int var1, int var2) {
      try {
         this.field7263 = var1 * 1848781009;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzs;[Ljava/lang/Object;)Lzs;")
   @ObfuscatedName("kl")
   public static classZS method14146(classZS var0, Object[] var1) {
      if (var0 == null) {
         return var0.method14147(var1);
      } else {
         var0.field7261 = var1;
         return var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("bm")
   public classZS method14164(int var1) {
      this.field7263 = var1 * 1848781009;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("bb")
   public classZS method14175(int var1) {
      this.field7257 = -1094000011 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)Lzs;")
   @ObfuscatedName("au")
   public classZS method14147(Object[] var1) {
      this.field7261 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("bx")
   public classZS method14159(int var1) {
      this.field7262 = var1 * -785215481;
      return this;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzs;Z)Lzs;")
   @ObfuscatedName("ey")
   public static classZS method14141(classZS var0, boolean var1) {
      if (var0 == null) {
         return var0.method14140(var1);
      } else {
         var0.field7268 = var1;
         return var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzs;")
   @ObfuscatedName("by")
   public classZS method14179(int var1) {
      this.field7265 = -1742323659 * var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lzs;II)Lzs;")
   @ObfuscatedName("bi")
   public static classZS method14180(classZS var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method14181(var1, var1);
      } else {
         try {
            var0.field7265 = -1742323659 * var1;
            return var0;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "zs.al(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lzs;")
   @ObfuscatedName("bu")
   public classZS method14171(classLW var1) {
      this.field7258 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(II)Lzs;")
   @ObfuscatedName("ae")
   public classZS method14160(int var1, int var2) {
      try {
         this.field7262 = var1 * -785215481;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lzs;")
   @ObfuscatedName("al")
   public classZS method14181(int var1, int var2) {
      try {
         this.field7264 = -1742323659 * var1;
         return this;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "zs.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzs;I)Lzs;")
   @ObfuscatedName("gt")
   public static classZS method14176(classZS var0, int var1) {
      if (var0 == null) {
         return var0.method14158(var1);
      } else {
         var0.field7257 = -1978668005 * var1;
         return var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lzr;")
   @ObfuscatedName("aj")
   public classZR method14184(byte var1) {
      try {
         return new classZR(this);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "zs.aj(" + ')');
      }
   }
}
