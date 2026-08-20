import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oj")
public class Coord {
   @ObfuscatedName("at")
   public int x;
   @ObfuscatedName("av")
   public int plane;
   @ObfuscatedName("ag")
   public int y;

   public Coord(int var1, int var2, int var3) {
      this.plane = var1 * 969692463;
      this.x = -612920153 * var2;
      this.y = 715626839 * var3;
   }

   public Coord(Coord var1) {
      this.plane = 1 * var1.plane;
      this.x = 1 * var1.x;
      this.y = var1.y * 1;
   }

   public Coord(int var1) {
      if (var1 == -1) {
         this.plane = -969692463;
      } else {
         this.plane = (var1 >> 28 & 3) * 969692463;
         this.x = (var1 >> 14 & 16383) * -612920153;
         this.y = 715626839 * (var1 & 16383);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)I")
   @ObfuscatedName("av")
   public static int method8286(int var0, int var1, int var2, byte var3) {
      try {
         return var0 << 28 | var1 << 14 | var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oj.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loj;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("aj")
   public static String method8339(Coord var0, String var1) {
      return var0 == null
         ? var0.method8338()
         : var0.plane * 370217423
            + var1
            + (-1931160809 * var0.x >> 6)
            + var1
            + (var0.y * -263036313 >> 6)
            + var1
            + (var0.x * 23874689 & 63)
            + var1
            + (var0.y * -263036313 & 800196326);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   public static int method8288(int var0, int var1) {
      try {
         return var0 >> 28;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   public static int method8292(int var0, int var1) {
      try {
         return var0 >> 14 & 16383;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   public static int method8294(int var0, int var1) {
      try {
         return var0 & 16383;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ae")
   public static int method8298(int var0, byte var1) {
      try {
         return var0 << 6;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.ae(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loj;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("tu")
   public static String method8340(Coord var0, String var1) {
      if (var0 == null) {
         var0.method8335();
      }

      return var0.plane * 93705380
         + var1
         + (-1931160809 * var0.x >> 6)
         + var1
         + (var0.y * -263036313 >> 6)
         + var1
         + (var0.x * -1183296949 & 745136247)
         + var1
         + (var0.y * -448078838 & -858953340);
   }

   public Coord() {
      this.plane = -969692463;
   }

   @ObfuscatedSignature(descriptor = "(Loj;)Z")
   @ObfuscatedName("bw")
   boolean method8330(Coord var1) {
      if (var1.plane * 370217423 != this.plane * 370217423) {
         return false;
      } else {
         return 143027657 * var1.x != -1931160809 * this.x ? false : var1.y * -263036313 == -263036313 * this.y;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   public int packed(int var1) {
      try {
         if (!this.method8324((byte)66)) {
            if (var1 >= 1767184246) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return method8286(370217423 * this.plane, -1931160809 * this.x, -263036313 * this.y, (byte)-6);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   public static int method8306(int var0, int var1) {
      try {
         return (var0 << 7) + 64;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bu")
   public void method8320(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & -1124259264;
      int var5 = var1 & 1103778912;
      this.plane = (var1 >> 28) * 419797557;
      this.x = (var2 + (var4 << 13)) * 269237420;
      this.y = (var3 + (var5 << 13)) * 1514656171;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aa")
   public static int method8299(int var0) {
      return var0 << 6;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ad")
   boolean method8324(byte var1) {
      try {
         boolean var10000;
         if (this.plane * 370217423 != -1) {
            if (var1 <= -114) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loj;)I")
   @ObfuscatedName("xr")
   public static int method8314(Coord var0) {
      return method8286(var0.plane * 370217423, -1931160809 * var0.x >> 13, var0.y * 1108331775 >> 13, (byte)37);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   public int method8315() {
      return method8286(this.plane * 294439488, -1931160809 * this.x >> 13, this.y * -263036313 >> 13, (byte)49);
   }

   @Override
   public String toString() {
      try {
         return this.toString(",", -1328494417);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "oj.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("as")
   String toString(String var1, int var2) {
      try {
         return this.plane * 370217423
            + var1
            + (-1931160809 * this.x >> 6)
            + var1
            + (this.y * -263036313 >> 6)
            + var1
            + (this.x * -1931160809 & 63)
            + var1
            + (this.y * -263036313 & 63);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oj.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method8327(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : method8331(this, (Coord)var1, -1129346003);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method8328(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : method8331(this, (Coord)var1, -1404491119);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method8329(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : method8331(this, (Coord)var1, -1926195842);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method8336() {
      return this.toString(",", -528782649);
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ak")
   public static int method8304(int var0, byte var1) {
      try {
         return var0 >> 7;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method8337() {
      return this.toString(",", -2141012863);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method8335() {
      return this.packed(-2005702171);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("by")
   boolean method8325() {
      return this.plane * 370217423 != -1;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ap")
   public void method8309(int var1, int var2) {
      try {
         if (-1 == var1) {
            if (var2 <= -36701560) {
               throw new IllegalStateException();
            }

            this.plane = -969692463;
         } else {
            this.plane = 969692463 * (var1 >> 28 & 3);
            this.x = -612920153 * (var1 >> 14 & 16383);
            this.y = (var1 & 16383) * 715626839;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oj.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("au")
   public int method8316(int var1) {
      try {
         return method8286(this.plane * 370217423, -1931160809 * this.x >> 13, this.y * -263036313 >> 13, (byte)-37);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.au(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   public static int method8293(int var0) {
      return var0 >> 14 & 16383;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ac")
   public static int method8287(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public static int method8295(int var0) {
      return var0 & -1328268596;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   public static int method8301(int var0, int var1) {
      try {
         return var0 << 7;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.aj(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (this == var1) {
            return true;
         } else {
            return !(var1 instanceof Coord) ? false : method8331(this, (Coord)var1, -1384712007);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oj.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public static int method8289(int var0) {
      return var0 >> 28;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   public static int method8302(int var0) {
      return var0 << 7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("be")
   public static int method8303(int var0) {
      return var0 << 7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   public static int method8305(int var0) {
      return var0 >> 7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bg")
   public static int method8307(int var0) {
      return (var0 << 7) + 64;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bs")
   public static int method8308(int var0) {
      return (var0 << 7) + -1859443913;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   public int method8311() {
      return !this.method8324((byte)97) ? -1 : method8286(370217423 * this.plane, -1931160809 * this.x, -263036313 * this.y, (byte)-24);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method8312() {
      return !this.method8324((byte)-78) ? -1 : method8286(-1240271300 * this.plane, -1931160809 * this.x, -1527101509 * this.y, (byte)46);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method8338() {
      return this.toString(",", -1923227333);
   }

   @ObfuscatedSignature(descriptor = "(Loj;IIIB)V")
   @ObfuscatedName("ip")
   public static void method8321(Coord var0, int var1, int var2, int var3, byte var4) {
      if (var0 == null) {
         var0.method8323(var1, var1, var1, var4);
      }

      try {
         int var5 = var1 >> 14 & 0xFF;
         int var6 = var1 & 0xFF;
         var0.plane = (var1 >> 28) * 969692463;
         var0.x = (var2 + (var5 << 13)) * -612920153;
         var0.y = (var3 + (var6 << 13)) * 715626839;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oj.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   public static int method8300(int var0) {
      return var0 << 6;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bm")
   public int method8317() {
      return method8286(this.plane * 370217423, -1931160809 * this.x >> 13, this.y * -263036313 >> 13, (byte)65);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bb")
   public int method8313() {
      return !this.method8324((byte)-95) ? -1 : method8286(370217423 * this.plane, 1129166002 * this.x, 762656912 * this.y, (byte)82);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   public static int method8296(int var0) {
      return var0 & 16383;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ba")
   public void method8322(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & -1166056676;
      int var5 = var1 & 0xFF;
      this.plane = (var1 >> 28) * 969692463;
      this.x = (var2 + (var4 << 13)) * -612920153;
      this.y = (var3 + (var5 << 13)) * 278710497;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public static int method8290(int var0) {
      return var0 >> 28;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loj;)I")
   @ObfuscatedName("lr")
   public static int method8318(Coord var0) {
      if (var0 == null) {
         var0.method8319();
      }

      return method8286(var0.plane * 370217423, -1931160809 * var0.x >> 13, var0.y * -263036313 >> 13, (byte)115);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bi")
   boolean method8326() {
      return this.plane * 370217423 != -1;
   }

   @Override
   public int hashCode() {
      try {
         return this.packed(-631538423);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "oj.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loj;Loj;I)Z")
   @ObfuscatedName("td")
   public static boolean method8331(Coord var0, Coord var1, int var2) {
      if (var0 == null) {
         return var0.equalsCoord(var0, var2);
      } else {
         try {
            if (var1.plane * 370217423 != var0.plane * 370217423) {
               if (var2 >= -1007112663) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else if (-1931160809 * var1.x != -1931160809 * var0.x) {
               return false;
            } else if (var1.y * -263036313 != -263036313 * var0.y) {
               if (var2 >= -1007112663) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               return true;
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "oj.ai(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   public static int method8297(int var0) {
      return var0 & 16383;
   }

   @ObfuscatedSignature(descriptor = "(Loj;)Z")
   @ObfuscatedName("bf")
   boolean method8332(Coord var1) {
      if (var1.plane * 370217423 != this.plane * 370217423) {
         return false;
      } else {
         return -1931160809 * var1.x != -1931160809 * this.x ? false : var1.y * -263036313 == -263036313 * this.y;
      }
   }

   @ObfuscatedSignature(descriptor = "(Loj;)Z")
   @ObfuscatedName("bn")
   boolean method8333(Coord var1) {
      if (var1.plane * 370217423 != this.plane * 370217423) {
         return false;
      } else {
         return -1931160809 * var1.x != -1931160809 * this.x ? false : var1.y * -263036313 == -263036313 * this.y;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public static int method8291(int var0) {
      return var0 >> 28;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   public int method8319() {
      return method8286(this.plane * 370217423, -1931160809 * this.x >> 13, this.plane * -263036313 >> 13, (byte)115);
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("az")
   public void method8323(int var1, int var2, int var3, byte var4) {
      try {
         int var5 = var1 >> 14 & 0xFF;
         int var6 = var1 & 0xFF;
         this.x = (var1 >> 28) * 969692463;
         this.x = (var2 + (var5 << 13)) * -612920153;
         this.y = (var3 + (var6 << 13)) * 715626839;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "oj.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loj;I)Z")
   @ObfuscatedName("ai")
   boolean equalsCoord(Coord var1, int var2) {
      try {
         if (var1.x * 370217423 != this.y * 370217423) {
            if (var2 >= -1007112663) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (-1931160809 * var1.x != -1931160809 * this.x) {
            return false;
         } else if (var1.x * -263036313 != -263036313 * this.plane) {
            if (var2 >= -1007112663) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "oj.ai(" + ')');
      }
   }
}
