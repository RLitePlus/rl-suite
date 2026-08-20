import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vu")
public class classVU {
   @ObfuscatedName("at")
   final int[] field6305;
   @ObfuscatedName("av")
   final int[] field6306 = new int[4];
   @ObfuscatedName("ae")
   int field6307;
   @ObfuscatedName("an")
   int field6309;
   @ObfuscatedName("ag")
   int field6308;
   @ObfuscatedSignature(descriptor = "[Lvu;")
   @ObfuscatedName("aj")
   static final classVU[] field6304 = new classVU[1570242397 * classVU.field6303];
   @ObfuscatedName("ak")
   static final int field6303 = -522924208;
   @ObfuscatedName("aw")
   static int field6302 = 0;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;Ljn;)V")
   @ObfuscatedName("ao")
   public static void method11626(Scene var0, TileRenderMode var1) {
      if (var1 != var0.field2944) {
         var0.field2944 = var1;
         var0.method5614(var0.field2946, var0.field3011, var0.field3007, var0.field3009, var0.field3004);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;Lvt;III)V")
   @ObfuscatedName("ai")
   public static void method11622(classVU var0, classVT var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method11610(var2);
      }

      var0.field6308 = -654269844 * var2;
      var0.field6309 = 90008849 * var3;
      var0.field6307 = 270921187 * var1.field6165;
      int var5 = classGW.method4374(var4, -994031453);
      var0.field6306[0] = var2 + var1.method11584(var5, 0, (byte)0);
      var0.field6305[0] = var3 + var1.method11588(var5, 0, (byte)-48);
      var0.field6306[1] = var2 + var1.method11584(var5, 1, (byte)0);
      var0.field6305[1] = var3 + var1.method11588(var5, 1, (byte)-33);
      var0.field6306[2] = var2 + var1.method11584(var5, 2, (byte)0);
      var0.field6305[2] = var3 + var1.method11588(var5, 2, (byte)19);
      var0.field6306[3] = var2 + var1.method11584(var5, 3, (byte)0);
      var0.field6305[3] = var3 + var1.method11588(var5, 3, (byte)-19);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   int method11615() {
      return this.field6309 * -684692590;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method11603(int var1) {
      return this.field6306[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;)V")
   @ObfuscatedName("cp")
   public static void method11598(classVU var0) {
      if (var0 == null) {
         var0.method11615();
      }

      var0.field6308 = 0;
      var0.field6309 = 0;
      var0.field6307 = 0;
      Arrays.fill(var0.field6306, 0);
      Arrays.fill(var0.field6305, 0);
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("an")
   int method11604(int var1, byte var2) {
      try {
         return this.field6306[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vu.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvt;IIIB)V")
   @ObfuscatedName("ap")
   public void method11623(classVT var1, int var2, int var3, int var4, byte var5) {
      try {
         this.field6308 = -1152658343 * var2;
         this.field6309 = 90008849 * var3;
         this.field6307 = 270921187 * var1.field6165;
         int var6 = classGW.method4374(var4, -166379393);
         this.field6306[0] = var2 + var1.method11584(var6, 0, (byte)0);
         this.field6305[0] = var3 + var1.method11588(var6, 0, (byte)13);
         this.field6306[1] = var2 + var1.method11584(var6, 1, (byte)0);
         this.field6305[1] = var3 + var1.method11588(var6, 1, (byte)18);
         this.field6306[2] = var2 + var1.method11584(var6, 2, (byte)0);
         this.field6305[2] = var3 + var1.method11588(var6, 2, (byte)-92);
         this.field6306[3] = var2 + var1.method11584(var6, 3, (byte)0);
         this.field6305[3] = var3 + var1.method11588(var6, 3, (byte)-22);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "vu.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvu;B)I")
   @ObfuscatedName("of")
   public static int method11618(classVU var0, byte var1) {
      if (var0 == null) {
         return var0.method11621(var1);
      } else {
         try {
            return var0.field6307 * 524937177;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "vu.aw(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   int method11616(int var1) {
      try {
         return this.field6309 * 1190339569;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vu.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvu;II)I")
   @ObfuscatedName("rv")
   public static int method11608(classVU var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method11612(var1, var1);
      } else {
         try {
            return var0.field6305[var1];
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "vu.ae(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method11595() {
      synchronized (field6304) {
         if (field6302 * -640625525 < field6303 * -1231717812) {
            field6304[(field6302 += 879099805) * 2056009464 - 1] = this;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Z)Lpn;")
   @ObfuscatedName("mg")
   public static class406 method11625(WorldEntity var0, boolean var1) {
      if (var0 == null) {
         var0.getConfig();
      }

      return var1 ? class406.field5183 : var0.worldEntityConfig.method4771((byte)123);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("at")
   public void method11596(byte var1) {
      try {
         synchronized (field6304) {
            if (field6302 * -640625525 < field6303 * 1570242397) {
               field6304[(field6302 += -1149635805) * -640625525 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "vu.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   int method11609(int var1) {
      return this.field6305[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lvu;")
   @ObfuscatedName("ay")
   public static classVU method11592() {
      synchronized (field6304) {
         if (field6302 * -640625525 == 0) {
            return new classVU();
         } else {
            method11599(field6304[(field6302 -= -1149635805) * -640625525], (byte)27);
            return field6304[-640625525 * field6302];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   int method11610(int var1) {
      return this.field6305[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lvu;")
   @ObfuscatedName("az")
   public static classVU method11593() {
      synchronized (field6304) {
         if (field6302 * -640625525 == 0) {
            return new classVU();
         } else {
            method11599(field6304[(field6302 -= -1149635805) * -640625525], (byte)8);
            return field6304[-640625525 * field6302];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvu;B)V")
   @ObfuscatedName("ny")
   public static void method11599(classVU var0, byte var1) {
      if (var0 == null) {
         var0.method11602(var1);
      } else {
         try {
            var0.field6308 = 0;
            var0.field6309 = 0;
            var0.field6307 = 0;
            Arrays.fill(var0.field6306, 0);
            Arrays.fill(var0.field6305, 0);
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "vu.ag(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfs;I)Lry;")
   @ObfuscatedName("vh")
   public static TransformationMatrix method11611(class136 var0, int var1) {
      return var0.field1850[var1];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method11597() {
      synchronized (field6304) {
         if (field6302 * -640625525 < field6303 * -1695646123) {
            field6304[(field6302 += -400117005) * -640625525 - 1] = this;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lvu;")
   @ObfuscatedName("au")
   public static classVU method11594() {
      synchronized (field6304) {
         if (field6302 * -640625525 == 0) {
            return new classVU();
         } else {
            method11599(field6304[(field6302 -= -1149635805) * -640625525], (byte)62);
            return field6304[-640625525 * field6302];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method11600() {
      this.field6308 = 0;
      this.field6309 = 0;
      this.field6307 = 0;
      Arrays.fill(this.field6306, 0);
      Arrays.fill(this.field6305, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;)V")
   @ObfuscatedName("hm")
   public static void method11601(classVU var0) {
      if (var0 == null) {
         var0.method11615();
      }

      var0.field6308 = 0;
      var0.field6309 = 0;
      var0.field6307 = 0;
      Arrays.fill(var0.field6306, 0);
      Arrays.fill(var0.field6305, 0);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   int method11605(int var1) {
      return this.field6306[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   int method11606(int var1) {
      return this.field6306[var1];
   }

   classVU() {
      this.field6305 = new int[4];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   int method11613() {
      return this.field6308 * -1805765655;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aj")
   int method11614(byte var1) {
      try {
         return this.field6308 * -1805765655;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vu.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   int method11619() {
      return this.field6307 * 524937177;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   int method11620() {
      return this.field6307 * 524937177;
   }

   @ObfuscatedSignature(descriptor = "(Lvt;III)V")
   @ObfuscatedName("bj")
   public void method11624(classVT var1, int var2, int var3, int var4) {
      this.field6308 = -1152658343 * var2;
      this.field6309 = 90008849 * var3;
      this.field6307 = 270921187 * var1.field6165;
      int var5 = classGW.method4374(var4, 382777930);
      this.field6306[0] = var2 + var1.method11584(var5, 0, (byte)0);
      this.field6305[0] = var3 + var1.method11588(var5, 0, (byte)-82);
      this.field6306[1] = var2 + var1.method11584(var5, 1, (byte)0);
      this.field6305[1] = var3 + var1.method11588(var5, 1, (byte)78);
      this.field6306[2] = var2 + var1.method11584(var5, 2, (byte)0);
      this.field6305[2] = var3 + var1.method11588(var5, 2, (byte)92);
      this.field6306[3] = var2 + var1.method11584(var5, 3, (byte)0);
      this.field6305[3] = var3 + var1.method11588(var5, 3, (byte)-46);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   int method11612(int var1, int var2) {
      try {
         return this.field6306[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vu.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   int method11607(int var1) {
      return this.field6305[var1];
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   void method11602(byte var1) {
      try {
         this.field6308 = 0;
         this.field6308 = 0;
         this.field6308 = 0;
         Arrays.fill(this.field6305, 0);
         Arrays.fill(this.field6305, 0);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vu.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;)I")
   @ObfuscatedName("lz")
   public static int method11617(classVU var0) {
      return var0.field6309 * 1190339569;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aw")
   int method11621(byte var1) {
      try {
         return this.field6309 * 524937177;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vu.aw(" + 41);
      }
   }
}
