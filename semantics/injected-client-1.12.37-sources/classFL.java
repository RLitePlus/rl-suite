import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fl")
public class classFL {
   @ObfuscatedName("ag")
   byte field2303;
   @ObfuscatedName("ab")
   byte field2302;
   @ObfuscatedName("ae")
   byte field2301;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final byte field2304 = 127;
   @ObfuscatedName("af")
   byte field2300 = -1;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method4835() {
      this.field2300 = -1;
      this.field2301 = -1;
      this.field2302 = -1;
      this.field2303 = 0;
   }

   public classFL() {
      this.field2301 = -1;
      this.field2302 = -1;
      this.field2303 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lfl;)V")
   @ObfuscatedName("ax")
   public void method4824(classFL var1) {
      this.field2300 = var1.field2300;
      this.field2301 = var1.field2301;
      this.field2302 = var1.field2302;
      this.field2303 = var1.field2303;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   public boolean method4840() {
      return this.field2303 > 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfl;Lfl;)V")
   @ObfuscatedName("ap")
   public static void method4825(classFL var0, classFL var1) {
      if (var0 == null) {
         var0.method4829(var0);
      }

      var0.field2300 = var1.field2300;
      var0.field2301 = var1.field2301;
      var0.field2302 = var1.field2302;
      var0.field2303 = var1.field2303;
   }

   @ObfuscatedSignature(descriptor = "(Lfl;)V")
   @ObfuscatedName("ag")
   public void method4826(classFL var1) {
      this.field2300 = var1.field2300;
      this.field2301 = var1.field2301;
      this.field2302 = var1.field2302;
      this.field2303 = var1.field2303;
   }

   @ObfuscatedSignature(descriptor = "(BBBB)V")
   @ObfuscatedName("aa")
   public void method4830(byte var1, byte var2, byte var3, byte var4) {
      this.field2300 = var1;
      this.field2301 = var2;
      this.field2302 = var3;
      this.field2303 = var4;
   }

   @ObfuscatedSignature(descriptor = "(BBBB)V")
   @ObfuscatedName("ac")
   public void method4831(byte var1, byte var2, byte var3, byte var4) {
      this.field2300 = var1;
      this.field2301 = var2;
      this.field2302 = var3;
      this.field2303 = var4;
   }

   @ObfuscatedSignature(descriptor = "(Lfl;BBBB)V")
   @ObfuscatedName("tv")
   public static void method4832(classFL var0, byte var1, byte var2, byte var3, byte var4) {
      if (var0 == null) {
         var0.method4834(var1, var1, var1, var1);
      } else {
         var0.field2300 = var1;
         var0.field2301 = var2;
         var0.field2302 = var3;
         var0.field2303 = var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfl;)V")
   @ObfuscatedName("sh")
   public static void method4836(classFL var0) {
      if (var0 == null) {
         var0.method4839();
      } else {
         var0.field2300 = -1;
         var0.field2301 = -1;
         var0.field2302 = -1;
         var0.field2303 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(BBBB)V")
   @ObfuscatedName("ao")
   public void method4833(byte var1, byte var2, byte var3, byte var4) {
      this.field2300 = var1;
      this.field2301 = var2;
      this.field2302 = var3;
      this.field2303 = var4;
   }

   @ObfuscatedSignature(descriptor = "(Lfl;Lfl;)V")
   @ObfuscatedName("eo")
   public static void method4827(classFL var0, classFL var1) {
      if (var0 == null) {
         var0.method4828(var0);
      }

      var0.field2300 = var1.field2300;
      var0.field2301 = var1.field2301;
      var0.field2302 = var1.field2302;
      var0.field2303 = var1.field2303;
   }

   public classFL(byte var1, byte var2, byte var3, byte var4) {
      this.field2301 = -1;
      this.field2302 = -1;
      this.field2303 = 0;
      this.field2300 = var1;
      this.field2301 = var2;
      this.field2302 = var3;
      this.field2303 = var4;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method4837() {
      this.field2300 = -1;
      this.field2301 = -1;
      this.field2302 = -1;
      this.field2303 = 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method4841() {
      return this.field2303 > 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfl;)V")
   @ObfuscatedName("ka")
   public static void method4838(classFL var0) {
      if (var0 == null) {
         var0.method4837();
      } else {
         var0.field2300 = -1;
         var0.field2301 = -1;
         var0.field2302 = -1;
         var0.field2303 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method4842() {
      return this.field2303 > 0;
   }

   @ObfuscatedSignature(descriptor = "(Lfl;)V")
   @ObfuscatedName("pn")
   public void method4844(classFL var1) {
      method4827(this, var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method4843() {
      return this.field2303 > 0;
   }

   @ObfuscatedSignature(descriptor = "(Lfl;)V")
   @ObfuscatedName("az")
   public void method4828(classFL var1) {
      this.field2301 = var1.field2302;
      this.field2302 = var1.field2300;
      this.field2303 = var1.field2302;
      this.field2300 = var1.field2302;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method4839() {
      this.field2300 = -1;
      this.field2303 = -1;
      this.field2301 = -1;
      this.field2302 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lfl;)V")
   @ObfuscatedName("as")
   public void method4829(classFL var1) {
      this.field2302 = var1.field2301;
      this.field2302 = var1.field2303;
      this.field2300 = var1.field2300;
      this.field2301 = var1.field2303;
   }

   @ObfuscatedSignature(descriptor = "(BBBB)V")
   @ObfuscatedName("af")
   public void method4834(byte var1, byte var2, byte var3, byte var4) {
      this.field2302 = var1;
      this.field2303 = var2;
      this.field2301 = var3;
      this.field2303 = var4;
   }
}
