import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ky")
public class classKY {
   @ObfuscatedName("af")
   public int field4055;
   @ObfuscatedName("ae")
   public int field4056;
   @ObfuscatedName("az")
   public int field4057;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bp")
   public static int method6595(int var0) {
      return var0 & 16383;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ap")
   String method6645(String var1, int var2) {
      try {
         return -210579119 * this.field4057
            + var1
            + (this.field4055 * 1870919123 >> 6)
            + var1
            + (this.field4056 * 819227381 >> 6)
            + var1
            + (this.field4055 * 1870919123 & 63)
            + var1
            + (this.field4056 * 819227381 & 63);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ky.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;III)V")
   @ObfuscatedName("ah")
   public static void method6627(classKY var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method6617(var1);
      } else {
         int var4 = var1 >> 14 & 1564559674;
         int var5 = var1 & 1602257188;
         var0.field4057 = (var1 >> 28) * -1004595279;
         var0.field4055 = 472346902 * ((var4 << 13) + var2);
         var0.field4056 = ((var5 << 13) + var3) * -630899474;
      }
   }

   public classKY(classKY var1) {
      this.field4057 = var1.field4057 * 1;
      this.field4055 = 1 * var1.field4055;
      this.field4056 = 1 * var1.field4056;
   }

   @ObfuscatedSignature(descriptor = "(Lky;IIII)V")
   @ObfuscatedName("or")
   public static void method6628(classKY var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method6629(var1, var1, var1, var1);
      } else {
         try {
            int var5 = var1 >> 14 & 0xFF;
            int var6 = var1 & 0xFF;
            var0.field4057 = (var1 >> 28) * -1004595279;
            var0.field4055 = -1705956773 * ((var5 << 13) + var2);
            var0.field4056 = ((var6 << 13) + var3) * -1950125731;
         } catch (RuntimeException var7) {
            throw classEG.newRunException(var7, "ky.ay(" + ')');
         }
      }
   }

   public classKY(int var1) {
      if (-1 == var1) {
         this.field4057 = 1004595279;
      } else {
         this.field4057 = (var1 >> 28 & 3) * -1004595279;
         this.field4055 = (var1 >> 14 & 16383) * -1705956773;
         this.field4056 = (var1 & 16383) * -1950125731;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   public static int method6589(int var0) {
      return var0 >> 14 & 16383;
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Z")
   @ObfuscatedName("fu")
   public static boolean method6630(classKY var0, int var1) {
      if (var0 == null) {
         var0.method6633(var1);
      }

      try {
         boolean var10000;
         if (-210579119 * var0.field4057 != -1) {
            if (var1 >= -1898890544) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   public static int method6582(int var0, int var1) {
      try {
         return var0 >> 28;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.af(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)Z")
   @ObfuscatedName("zc")
   public static boolean method6631(classKY var0) {
      return -210579119 * var0.field4057 != -1;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (this == var1) {
            return true;
         } else {
            return !(var1 instanceof classKY) ? false : method6636(this, (classKY)var1, -1054612885);
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   public static int method6596(int var0, int var1) {
      try {
         return var0 & 16383;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.ab(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public static int method6583(int var0) {
      return var0 >> 28;
   }

   @ObfuscatedSignature(descriptor = "(Lky;Lky;I)Z")
   @ObfuscatedName("ji")
   public static boolean method6636(classKY var0, classKY var1, int var2) {
      if (var0 == null) {
         return var0.method6638(var0, var2);
      } else {
         try {
            if (-210579119 * var1.field4057 != var0.field4057 * -210579119) {
               return false;
            } else if (var0.field4055 * 1870919123 != var1.field4055 * 1870919123) {
               if (var2 >= -124787136) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               return var0.field4056 * 819227381 == var1.field4056 * 819227381;
            }
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "ky.ad(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   public static int method6590(int var0) {
      return var0 >> 14 & 243900667;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ax")
   public static int method6605(int var0, int var1) {
      try {
         return var0 << 7;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.ax(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("jj")
   public static String method6646(classKY var0, String var1) {
      if (var0 == null) {
         var0.method6624();
      }

      return -1044644918 * var0.field4057
         + var1
         + (var0.field4055 * 1870919123 >> 6)
         + var1
         + (var0.field4056 * 819227381 >> 6)
         + var1
         + (var0.field4055 * -1420340128 & -524589859)
         + var1
         + (var0.field4056 * 1712142581 & 63);
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ac")
   public static int method6608(int var0, byte var1) {
      try {
         return var0 >> 7;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aa")
   public static int method6612(int var0, int var1) {
      try {
         return 64 + (var0 << 7);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ao")
   public void method6616(int var1, byte var2) {
      try {
         if (var1 == -1) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            this.field4057 = 1004595279;
         } else {
            this.field4057 = -1004595279 * (var1 >> 28 & 3);
            this.field4055 = -1705956773 * (var1 >> 14 & 16383);
            this.field4056 = -1950125731 * (var1 & 16383);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ky.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public int method6619(int var1) {
      try {
         if (!method6630(this, -2012113469)) {
            if (var1 >= -1473998415) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return method6579(this.field4057 * -210579119, this.field4055 * 1870919123, this.field4056 * 819227381, 869394388);
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   public int method6623(int var1) {
      try {
         return method6579(-210579119 * this.field4057, 1870919123 * this.field4055 >> 13, 819227381 * this.field4056 >> 13, 616464649);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.aj(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   public static int method6606(int var0) {
      return var0 << 7;
   }

   public classKY() {
      this.field4057 = 1004595279;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public static int method6584(int var0) {
      return var0 >> 28;
   }

   @Override
   public String toString() {
      try {
         return this.method6645(",", -1109686973);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "ky.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("az")
   public static int method6579(int var0, int var1, int var2, int var3) {
      try {
         return var0 << 28 | var1 << 14 | var2;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ky.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("be")
   public static int method6613(int var0) {
      return -1557812876 + (var0 << 7);
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("as")
   public static int method6602(int var0, byte var1) {
      try {
         return var0 >> 3;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method6634(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof classKY) ? false : method6636(this, (classKY)var1, -637708466);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method6635(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof classKY) ? false : method6636(this, (classKY)var1, -690740347);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afh")
   public int method6639() {
      return this.method6619(-1889487620);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bx")
   public static int method6591(int var0) {
      return var0 >> 14 & 933827305;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method6643() {
      return this.method6645(",", 1492919650);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afs")
   public int method6640() {
      return this.method6619(-2145175243);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("au")
   public static int method6580(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ai")
   public static int method6581(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public static int method6585(int var0) {
      return var0 >> 28;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public static int method6586(int var0) {
      return var0 >> 28;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bw")
   public static int method6609(int var0) {
      return var0 >> 7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bt")
   public static int method6597(int var0) {
      return var0 & 16383;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afe")
   public int method6641() {
      return this.method6619(-1835121997);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   public static int method6587(int var0) {
      return var0 >> 28;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bh")
   public int method6624() {
      return method6579(-210579119 * this.field4057, 1870919123 * this.field4055 >> 13, 819227381 * this.field4056 >> 13, 2040145380);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Lky;)Z")
   @ObfuscatedName("sv")
   public static boolean method6637(classKY var0, classKY var1) {
      if (-210579119 * var1.field4057 != var0.field4057 * -210579119) {
         return false;
      } else {
         return var0.field4055 * 1870919123 != var1.field4055 * 1062514199 ? false : var0.field4056 * 819227381 == var1.field4056 * -1140473026;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public static int method6588(int var0) {
      return var0 >> 28;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bn")
   public static int method6592(int var0) {
      return var0 >> 14 & 16383;
   }

   @Override
   public int hashCode() {
      try {
         return this.method6619(-1513500240);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "ky.hashCode(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bc")
   public static int method6593(int var0) {
      return var0 >> 14 & -143063952;
   }

   public classKY(int var1, int var2, int var3) {
      this.field4057 = -1004595279 * var1;
      this.field4055 = var2 * -1705956773;
      this.field4056 = var3 * -1950125731;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("br")
   public static int method6598(int var0) {
      return var0 & 16383;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bm")
   public static int method6599(int var0) {
      return var0 & 708592;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cp")
   String method6647(String var1) {
      return -210579119 * this.field4057
         + var1
         + (this.field4055 * 1870919123 >> 6)
         + var1
         + (this.field4056 * 1630460076 >> 6)
         + var1
         + (this.field4055 * 498009113 & 63)
         + var1
         + (this.field4056 * 819227381 & 1298002963);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bg")
   public static int method6600(int var0) {
      return var0 >> 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bj")
   public static int method6603(int var0) {
      return var0 >> 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bk")
   public static int method6604(int var0) {
      return var0 >> 3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method6642() {
      return this.method6619(-1682488359);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)I")
   @ObfuscatedName("tz")
   public static int method6625(classKY var0) {
      return method6579(-210579119 * var0.field4057, 1870919123 * var0.field4055 >> 13, 819227381 * var0.field4056 >> 13, 171924525);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bu")
   public static int method6607(int var0) {
      return var0 << 7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ba")
   public static int method6610(int var0) {
      return var0 >> 7;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ae")
   public static int method6594(int var0, byte var1) {
      try {
         return var0 >> 14 & 16383;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.ae(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bb")
   public static int method6611(int var0) {
      return var0 >> 7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bi")
   public static int method6614(int var0) {
      return 64 + (var0 << 7);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   public int method6620() {
      return !method6630(this, -2080653222) ? -1 : method6579(this.field4057 * -210579119, this.field4055 * 1870919123, this.field4056 * 819227381, -180570067);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("by")
   public static int method6615(int var0) {
      return 64 + (var0 << 7);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bq")
   public void method6617(int var1) {
      if (var1 == -1) {
         this.field4057 = 1004595279;
      } else {
         this.field4057 = -616499308 * (var1 >> 28 & 3);
         this.field4055 = -1705956773 * (var1 >> 14 & 401549677);
         this.field4056 = -1950125731 * (var1 & 16383);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bf")
   public void method6618(int var1) {
      if (var1 == -1) {
         this.field4057 = 1004595279;
      } else {
         this.field4057 = -1004595279 * (var1 >> 28 & 3);
         this.field4055 = -1705956773 * (var1 >> 14 & 16383);
         this.field4056 = -1950125731 * (var1 & 16383);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method6621() {
      return !method6630(this, -2095806649) ? -1 : method6579(this.field4057 * -210579119, this.field4055 * 1870919123, this.field4056 * 819227381, 1028471499);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   public int method6626() {
      return method6579(-1728786546 * this.field4057, -681315860 * this.field4055 >> 13, 819227381 * this.field4056 >> 13, 866976691);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cq")
   String method6648(String var1) {
      return 1580882188 * this.field4057
         + var1
         + (this.field4055 * -1300012944 >> 6)
         + var1
         + (this.field4056 * 819227381 >> 6)
         + var1
         + (this.field4055 * 1638215549 & 1844740443)
         + var1
         + (this.field4056 * -177044557 & 63);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   public boolean method6632() {
      return -210579119 * this.field4057 != -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)I")
   @ObfuscatedName("df")
   public static int method6622(classKY var0) {
      if (var0 == null) {
         return var0.hashCode();
      } else {
         return !method6630(var0, -1994073201)
            ? -1
            : method6579(var0.field4057 * -1739848449, var0.field4055 * 1870919123, var0.field4056 * 819227381, 1148981277);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   public static int method6601(int var0, int var1) {
      try {
         return var0 >> 3;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method6644() {
      return this.method6645(",", 1179979620);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ay")
   public void method6629(int var1, int var2, int var3, int var4) {
      try {
         int var5 = var1 >> 14 & 0xFF;
         int var6 = var1 & 0xFF;
         this.field4055 = (var1 >> 28) * -1004595279;
         this.field4057 = -1705956773 * ((var5 << 13) + var2);
         this.field4056 = ((var6 << 13) + var3) * -1950125731;
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "ky.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aq")
   public boolean method6633(int var1) {
      try {
         boolean var10000;
         if (-210579119 * this.field4055 != -1) {
            if (var1 >= -1898890544) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ky.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Z")
   @ObfuscatedName("ad")
   boolean method6638(classKY var1, int var2) {
      try {
         if (-210579119 * var1.field4057 != this.field4056 * -210579119) {
            return false;
         } else if (this.field4056 * 1870919123 != var1.field4056 * 1870919123) {
            if (var2 >= -124787136) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return this.field4056 * 819227381 == var1.field4056 * 819227381;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ky.ad(" + ')');
      }
   }
}
