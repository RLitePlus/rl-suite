import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fd")
public class classFD {
   @ObfuscatedName("aq")
   boolean field2211;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2225 = 512;
   @ObfuscatedName("ak")
   int field2227;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final float field2218 = 15000.0F;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final float field2221 = 1.0100503F;
   @ObfuscatedName("ad")
   public boolean field2212;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field2228 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2224 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field2223 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field2231 = 1;
   @ObfuscatedName("at")
   int field2233;
   @ObfuscatedName("aj")
   int field2217 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final float field2219 = 75.0F;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final float field2222 = 150.75377F;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final float field2220 = 14925.0F;
   @ObfuscatedName("ap")
   int field2213;
   @ObfuscatedName("au")
   public int field2209;
   @ObfuscatedSignature(descriptor = "Lfg;")
   @ObfuscatedName("ai")
   public classFG field2239;
   @ObfuscatedSignature(descriptor = "Lfl;")
   @ObfuscatedName("ay")
   final classFL field2215 = new classFL();
   @ObfuscatedName("aw")
   int field2235;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2236 = 128;
   @ObfuscatedName("av")
   int field2234;
   @ObfuscatedName("ar")
   int field2232;
   @ObfuscatedName("an")
   int field2230;
   @ObfuscatedName("am")
   int field2229;
   @ObfuscatedName("ah")
   int field2226;
   @ObfuscatedName("bn")
   int[] field2214;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field2238 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field2237 = 0;
   @ObfuscatedName("bp")
   int field2210;
   @ObfuscatedName("br")
   int field2216;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   void method4591() {
      this.field2232 = this.field2227 / 2;
      this.field2235 = this.field2234 / 2;
      this.field2233 = -this.field2232;
      this.field2230 = this.field2227 - this.field2232;
      this.field2229 = -this.field2235;
      this.field2226 = this.field2234 - this.field2235;
   }

   classFD() {
      this.field2211 = false;
      this.field2212 = true;
      this.field2213 = 0;
      this.field2209 = 512;
      this.field2214 = new int[1024];
      this.field2210 = -1;
      this.field2216 = -1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hr")
   public int method4602() {
      return this.field2229;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method4592() {
      this.field2232 = this.field2227 / 2;
      this.field2235 = this.field2234 / 2;
      this.field2233 = -this.field2232;
      this.field2230 = this.field2227 - this.field2232;
      this.field2229 = -this.field2235;
      this.field2226 = this.field2234 - this.field2235;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ou")
   public int method4603() {
      return this.field2230;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ax")
   void method4596(int var1, int var2, int var3, int var4) {
      this.field2232 = var1 - var2;
      this.field2235 = var3 - var4;
      this.field2233 = -this.field2232;
      this.field2230 = this.field2227 - this.field2232;
      this.field2229 = -this.field2235;
      this.field2226 = this.field2234 - this.field2235;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lx")
   public int method4604() {
      return this.field2226;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("by")
   public void method4605(boolean var1) {
      this.field2212 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lfd;IIII)V")
   @ObfuscatedName("ks")
   public static void method4597(classFD var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method4600(var1, var1, var1, var1);
      } else {
         var0.field2232 = var1 - var2;
         var0.field2235 = var3 - var4;
         var0.field2233 = -var0.field2232;
         var0.field2230 = var0.field2227 - var0.field2232;
         var0.field2229 = -var0.field2235;
         var0.field2226 = var0.field2234 - var0.field2235;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfd;IIII)V")
   @ObfuscatedName("ez")
   public static void method4598(classFD var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method4608();
      }

      var0.field2232 = var1 - var2;
      var0.field2235 = var3 - var4;
      var0.field2233 = -var0.field2232;
      var0.field2230 = var0.field2227 - var0.field2232;
      var0.field2229 = -var0.field2235;
      var0.field2226 = var0.field2234 - var0.field2235;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cr")
   public boolean method4606() {
      return this.field2212;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ac")
   void method4599(int var1, int var2, int var3, int var4) {
      this.field2232 = var1 - var2;
      this.field2235 = var3 - var4;
      this.field2233 = -this.field2232;
      this.field2230 = this.field2227 - this.field2232;
      this.field2229 = -this.field2235;
      this.field2226 = this.field2234 - this.field2235;
   }

   @ObfuscatedSignature(descriptor = "(Lfd;)V")
   @ObfuscatedName("yg")
   public static void method4593(classFD var0) {
      if (var0 == null) {
         var0.method4595();
      } else {
         var0.field2232 = var0.field2227 / 2;
         var0.field2235 = var0.field2234 / 2;
         var0.field2233 = -var0.field2232;
         var0.field2230 = var0.field2227 - var0.field2232;
         var0.field2229 = -var0.field2235;
         var0.field2226 = var0.field2234 - var0.field2235;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mi")
   public int method4607() {
      return this.field2209;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fn")
   public int method4608() {
      return this.field2233;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("cw")
   public static int method4601(classXY var0) {
      int var1 = var0.field6954[var0.field6955 * 702114061] & 255;
      return var1 < 128 ? classXY.method13039(var0, -346779531) - 1 : classXY.method13047(var0, -1167083753) - 32769;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("rw")
   public void method4609(int var1) {
      this.field2209 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kh")
   public int method4610() {
      return this.field2232;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfd;)V")
   @ObfuscatedName("ae")
   public static void method4594(classFD var0) {
      var0.field2232 = var0.field2227 / 2;
      var0.field2235 = var0.field2234 / 2;
      var0.field2233 = -var0.field2232;
      var0.field2230 = var0.field2227 - var0.field2232;
      var0.field2229 = -var0.field2235;
      var0.field2226 = var0.field2234 - var0.field2235;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ej")
   public int method4611() {
      return this.field2235;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("af")
   void method4600(int var1, int var2, int var3, int var4) {
      this.field2232 = var1 - var2;
      this.field2213 = var3 - var4;
      this.field2233 = -this.field2210;
      this.field2216 = this.field2235 - this.field2216;
      this.field2213 = -this.field2235;
      this.field2235 = this.field2229 - this.field2226;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method4595() {
      this.field2229 = this.field2216 / 2;
      this.field2233 = this.field2210 / 2;
      this.field2235 = -this.field2210;
      this.field2229 = this.field2226 - this.field2210;
      this.field2230 = -this.field2213;
      this.field2216 = this.field2213 - this.field2233;
   }
}
