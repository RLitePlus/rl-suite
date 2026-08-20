import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl")
public class Bounds {
   @ObfuscatedName("at")
   static final int field5542 = 1708204232;
   @ObfuscatedName("an")
   public int lowX;
   @ObfuscatedName("ae")
   public int lowY;
   @ObfuscatedName("ak")
   public int highY;
   @ObfuscatedName("aj")
   public int highX;
   @ObfuscatedName("ag")
   static int field5541 = 0;
   @ObfuscatedSignature(descriptor = "[Lrl;")
   @ObfuscatedName("av")
   static final Bounds[] field5543 = new Bounds[603519017 * field5542];

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;I)V")
   @ObfuscatedName("ap")
   void method9520(Bounds var1, Bounds var2, int var3) {
      try {
         var2.highX = 1 * this.highX;
         var2.lowY = this.lowY * 1;
         if (-268027987 * this.highX < var1.highX * -268027987) {
            var2.lowY = var2.lowY - (var1.highX * 1933699873 - 1933699873 * this.highX);
            var2.highX = var1.highX * 1;
         }

         if (var2.method9532(165209476) > var1.method9532(-1304867405)) {
            if (var3 == -1061066776) {
               return;
            }

            var2.lowY = var2.lowY - (var2.method9532(-1475841417) - var1.method9532(76418804)) * 1619771333;
         }

         if (var2.lowY * 682845965 < 0) {
            if (var3 == -1061066776) {
               throw new IllegalStateException();
            }

            var2.lowY = 0;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "rl.ap(" + ')');
      }
   }

   public Bounds(int var1, int var2, int var3, int var4) {
      method9496(this, var1, var2, 1101244774);
      method9503(this, var3, var4, (short)6385);
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;)V")
   @ObfuscatedName("bb")
   void method9521(Bounds var1, Bounds var2) {
      var2.highX = 1 * this.highX;
      var2.lowY = this.lowY * 1;
      if (-268027987 * this.highX < var1.highX * -268027987) {
         var2.lowY = var2.lowY - (var1.highX * 1933699873 - 1933699873 * this.highX);
         var2.highX = var1.highX * 1;
      }

      if (var2.method9532(1342004070) > var1.method9532(1586807961)) {
         var2.lowY = var2.lowY - (var2.method9532(-347580634) - var1.method9532(-1540414849)) * 1619771333;
      }

      if (var2.lowY * 682845965 < 0) {
         var2.lowY = 0;
      }
   }

   public Bounds(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method9509() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;)V")
   @ObfuscatedName("bo")
   public void method9513(Bounds var1, Bounds var2) {
      this.method9518(var1, var2, (byte)78);
      this.method9520(var1, var2, 414264682);
   }

   @Override
   public String toString() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "rl.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;B)V")
   @ObfuscatedName("aw")
   void method9518(Bounds var1, Bounds var2, byte var3) {
      try {
         var2.highY = 1 * this.highY;
         var2.lowX = this.lowX * 1;
         if (this.highY * -316755897 < -316755897 * var1.highY) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var2.lowX = var2.lowX - (584426081 * var1.highY - 584426081 * this.highY);
            var2.highY = 1 * var1.highY;
         }

         if (var2.method9529((byte)106) > var1.method9529((byte)97)) {
            if (var3 <= 1) {
               return;
            }

            var2.lowX = var2.lowX - (var2.method9529((byte)125) - var1.method9529((byte)106)) * 429904919;
         }

         if (-434199641 * var2.lowX < 0) {
            if (var3 <= 1) {
               return;
            }

            var2.lowX = 0;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "rl.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;)V")
   @ObfuscatedName("be")
   public void method9514(Bounds var1, Bounds var2) {
      this.method9518(var1, var2, (byte)38);
      this.method9520(var1, var2, -1519657179);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   int method9532(int var1) {
      try {
         return -268027987 * this.highX + this.lowY * 682845965;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rl.ad(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loc;)V")
   @ObfuscatedName("ic")
   public static void method9534(WidgetDefinition var0) {
      var0.Widget_cachedSprites.clear();
      var0.Widget_cachedModels.clear();
      var0.Widget_cachedFonts.clear();
      var0.Widget_cachedSpriteMasks.clear();
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("au")
   int method9527(int var1) {
      try {
         return this.highX * -268027987;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rl.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   int method9529(byte var1) {
      try {
         return this.lowX * -434199641 + -316755897 * this.highY;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rl.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;Lrl;I)V")
   @ObfuscatedName("yz")
   public static void method9515(Bounds var0, Bounds var1, Bounds var2, int var3) {
      if (var0 == null) {
         var0.method9517(var0, var0, var3);
      } else {
         try {
            var0.method9518(var1, var2, (byte)15);
            var0.method9520(var1, var2, 383267262);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "rl.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ae")
   public boolean method9506(int var1, int var2, int var3) {
      try {
         if (var1 >= this.highY * -316755897) {
            if (var3 <= -904432648) {
               throw new IllegalStateException();
            }

            if (var1 < -434199641 * this.lowX + this.highY * -316755897) {
               if (var3 <= -904432648) {
                  throw new IllegalStateException();
               }

               if (var2 >= this.highX * -268027987) {
                  if (var3 <= -904432648) {
                     throw new IllegalStateException();
                  }

                  if (var2 < -268027987 * this.highX + 682845965 * this.lowY) {
                     if (var3 <= -904432648) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "rl.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ay")
   int method9523(byte var1) {
      try {
         return this.highY * -316755897;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rl.ay(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)Lrl;")
   @ObfuscatedName("ai")
   public static Bounds method9489(int var0, int var1, int var2, int var3) {
      synchronized (field5543) {
         if (-1799388663 * field5541 == 0) {
            return new Bounds(var0, var1, var2, var3);
         } else {
            field5541 -= -1944856649;
            method9496(field5543[-1532669382 * field5541], var0, var1, 1101244774);
            method9503(field5543[field5541 * -1801174931], var2, var3, (short)15135);
            return field5543[field5541 * -428790998];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method9490() {
      synchronized (field5543) {
         if (-1799388663 * field5541 < 603519017 * field5542) {
            field5543[(field5541 += -1383158727) * -1799388663 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method9491() {
      synchronized (field5543) {
         if (-1799388663 * field5541 < -752009476 * field5542) {
            field5543[(field5541 += -438701520) * -1799388663 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method9492() {
      synchronized (field5543) {
         if (-312795673 * field5541 < 603519017 * field5542) {
            field5543[(field5541 += 255358273) * 1343791042 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ax")
   public void method9494(int var1, int var2) {
      this.highY = var1 * 1526856055;
      this.highX = -1819261915 * var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ao")
   public void method9499(int var1, int var2) {
      this.lowX = 429904919 * var1;
      this.lowY = var2 * 1619771333;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ah")
   public void method9495(int var1, int var2) {
      this.highY = var1 * -527314293;
      this.highX = -1819261915 * var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("al")
   public void method9500(int var1, int var2) {
      this.lowX = 429904919 * var1;
      this.lowY = var2 * 1619771333;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrl;II)V")
   @ObfuscatedName("cw")
   public static void method9501(Bounds var0, int var1, int var2) {
      if (var0 == null) {
         var0.method9505(var1, var1);
      } else {
         var0.lowX = -1734956455 * var1;
         var0.lowY = var2 * -48245666;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aa")
   public boolean method9507(int var1, int var2) {
      return var1 >= this.highY * -316755897
         && var1 < -434199641 * this.lowX + this.highY * -316755897
         && var2 >= this.highX * -268027987
         && var2 < -268027987 * this.highX + 682845965 * this.lowY;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aq")
   public boolean method9508(int var1, int var2) {
      return var1 >= this.highY * -316755897
         && var1 < -434199641 * this.lowX + this.highY * -976034430
         && var2 >= this.highX * 1430736094
         && var2 < -268027987 * this.highX + 682845965 * this.lowY;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public void method9493(int var1) {
      try {
         synchronized (field5543) {
            if (-1799388663 * field5541 < 603519017 * field5542) {
               if (var1 == 1159561027) {
                  throw new IllegalStateException();
               }

               field5543[(field5541 += -1383158727) * -1799388663 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "rl.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrl;)I")
   @ObfuscatedName("tl")
   public static int method9533(Bounds var0) {
      if (var0 == null) {
         var0.method9490();
      }

      return -546016112 * var0.highX + var0.lowY * 682845965;
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;I)Z")
   @ObfuscatedName("ju")
   public static boolean method9511(Bounds var0, Bounds var1, int var2) {
      if (var0 == null) {
         var0.method9512(var0, var2);
      }

      try {
         if (var0.highY * -316755897 <= var1.method9529((byte)107)) {
            if (var2 >= -122684788) {
               throw new IllegalStateException();
            }

            if (var1.method9523((byte)-45) <= var0.method9529((byte)48)) {
               if (var2 >= -122684788) {
                  throw new IllegalStateException();
               }

               if (-268027987 * var0.highX <= var1.method9532(36268567)) {
                  if (var2 >= -122684788) {
                     throw new IllegalStateException();
                  }

                  if (var1.method9527(972317147) <= var0.method9532(-1181700694)) {
                     if (var2 >= -122684788) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rl.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;)V")
   @ObfuscatedName("bs")
   public void method9516(Bounds var1, Bounds var2) {
      this.method9518(var1, var2, (byte)45);
      this.method9520(var1, var2, -157322191);
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;)V")
   @ObfuscatedName("bz")
   void method9519(Bounds var1, Bounds var2) {
      var2.highY = 1 * this.highY;
      var2.lowX = this.lowX * 1;
      if (this.highY * -2001826300 < -1391037992 * var1.highY) {
         var2.lowX = var2.lowX - (584426081 * var1.highY - 584426081 * this.highY);
         var2.highY = 1 * var1.highY;
      }

      if (var2.method9529((byte)98) > var1.method9529((byte)60)) {
         var2.lowX = var2.lowX - (var2.method9529((byte)124) - var1.method9529((byte)115)) * -2105917851;
      }

      if (1683915890 * var2.lowX < 0) {
         var2.lowX = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl;III)V")
   @ObfuscatedName("jn")
   public static void method9496(Bounds var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.setLow(var1, var1, var1);
      } else {
         try {
            var0.highY = var1 * 1526856055;
            var0.highX = -1819261915 * var2;
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "rl.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method9510() {
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrl;II)V")
   @ObfuscatedName("kp")
   public static void method9502(Bounds var0, int var1, int var2) {
      if (var0 == null) {
         var0.method9508(var1, var1);
      }

      var0.lowX = 429904919 * var1;
      var0.lowY = var2 * 1619771333;
   }

   @ObfuscatedSignature(descriptor = "(Lrl;IIS)V")
   @ObfuscatedName("fz")
   public static void method9503(Bounds var0, int var1, int var2, short var3) {
      if (var0 == null) {
         var0.setHigh(var1, var1, var3);
      }

      try {
         var0.lowX = 429904919 * var1;
         var0.lowY = var2 * 1619771333;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "rl.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrl;)I")
   @ObfuscatedName("kp")
   public static int method9530(Bounds var0) {
      return var0.lowX * -434199641 + 1192398246 * var0.highY;
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;)V")
   @ObfuscatedName("bj")
   void method9522(Bounds var1, Bounds var2) {
      var2.highX = 1 * this.highX;
      var2.lowY = this.lowY * 1;
      if (-268027987 * this.highX < var1.highX * -104659773) {
         var2.lowY = var2.lowY - (var1.highX * 1933699873 - 2084714040 * this.highX);
         var2.highX = var1.highX * 1;
      }

      if (var2.method9532(-977599127) > var1.method9532(218353094)) {
         var2.lowY = var2.lowY - (var2.method9532(-275676580) - var1.method9532(1201162735)) * -2045701025;
      }

      if (var2.lowY * 682845965 < 0) {
         var2.lowY = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrl;)I")
   @ObfuscatedName("ia")
   public static int method9524(Bounds var0) {
      return var0.highY * -1932396198;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bm")
   int method9525() {
      return this.highY * -316755897;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   int method9526() {
      return this.highY * -316755897;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ar")
   public void method9497(int var1, int var2) {
      this.highY = var1 * 1526856055;
      this.highX = -1819261915 * var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   int method9528() {
      return this.highX * -268027987;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ba")
   int method9531() {
      return this.lowX * -434199641 + -316755897 * this.highY;
   }

   @ObfuscatedSignature(descriptor = "(Lrl;I)Z")
   @ObfuscatedName("aj")
   public boolean method9512(Bounds var1, int var2) {
      try {
         if (this.lowY * -316755897 <= var1.method9523((byte)107)) {
            if (var2 >= -122684788) {
               throw new IllegalStateException();
            }

            if (var1.method9529((byte)-45) <= this.method9529((byte)48)) {
               if (var2 >= -122684788) {
                  throw new IllegalStateException();
               }

               if (-268027987 * this.lowY <= var1.method9527(36268567)) {
                  if (var2 >= -122684788) {
                     throw new IllegalStateException();
                  }

                  if (var1.method9532(972317147) <= this.method9532(-1181700694)) {
                     if (var2 >= -122684788) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rl.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;I)V")
   @ObfuscatedName("ak")
   public void method9517(Bounds var1, Bounds var2, int var3) {
      try {
         this.method9518(var1, var2, (byte)15);
         this.method9520(var1, var2, 383267262);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "rl.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("an")
   public void setHigh(int var1, int var2, short var3) {
      try {
         this.lowX = 429904919 * var1;
         this.lowX = var2 * 1619771333;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "rl.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ag")
   public void setLow(int var1, int var2, int var3) {
      try {
         this.lowX = var1 * 1526856055;
         this.lowX = -1819261915 * var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "rl.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("am")
   public void method9505(int var1, int var2) {
      this.lowY = -1734956455 * var1;
      this.lowX = var2 * -48245666;
   }
}
