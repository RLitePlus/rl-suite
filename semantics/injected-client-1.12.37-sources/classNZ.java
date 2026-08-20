import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nz")
public class classNZ implements Iterable {
   @ObfuscatedSignature(descriptor = "Lvj;")
   @ObfuscatedName("af")
   classVJ field4801;
   @ObfuscatedSignature(descriptor = "Lvj;")
   @ObfuscatedName("az")
   public classVJ field4800 = new classVJ();

   public classNZ() {
      this.field4800.field6515 = this.field4800;
      this.field4800.field6516 = this.field4800;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method8262() {
      while (this.field4800.field6515 != this.field4800) {
         this.field4800.field6515.method11958();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfx;Lfz;)V")
   @ObfuscatedName("ql")
   public static void method8286(Model var0, classFZ var1) {
      if (var0 == null) {
         var0.method5216(var1);
      }

      var0.field2423 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvj;Lvj;)V")
   @ObfuscatedName("az")
   public static void method8260(classVJ var0, classVJ var1) {
      if (var0.field6516 != null) {
         var0.method11958();
      }

      var0.field6516 = var1;
      var0.field6515 = var1.field6515;
      var0.field6516.field6515 = var0;
      var0.field6515.field6516 = var0;
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("ab")
   public classVJ method8269() {
      classVJ var1 = this.field4800.field6515;
      if (var1 == this.field4800) {
         return null;
      } else {
         var1.method11958();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("ag")
   public classVJ method8271() {
      return this.method8275(null);
   }

   @Override
   public Iterator iterator() {
      return new classNX(this);
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("ax")
   public classVJ method8279() {
      classVJ var1 = this.field4801;
      if (var1 == this.field4800) {
         this.field4801 = null;
         return null;
      } else {
         this.field4801 = var1.field6515;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnz;Lvj;)V")
   @ObfuscatedName("tq")
   public static void method8265(classNZ var0, classVJ var1) {
      if (var0 == null) {
         var0.method8288(var1);
      } else {
         if (var1.field6516 != null) {
            var1.method11958();
         }

         var1.field6516 = var0.field4800.field6516;
         var1.field6515 = var0.field4800;
         var1.field6516.field6515 = var1;
         var1.field6515.field6516 = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("be")
   public Iterator method8283() {
      return new classNX(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvj;Lvj;)V")
   @ObfuscatedName("ac")
   public static void method8261(classVJ var0, classVJ var1) {
      if (var0.field6516 != null) {
         var0.method11958();
      }

      var0.field6516 = var1;
      var0.field6515 = var1.field6515;
      var0.field6516.field6515 = var0;
      var0.field6515.field6516 = var0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public void method8263() {
      while (this.field4800.field6515 != this.field4800) {
         this.field4800.field6515.method11958();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)V")
   @ObfuscatedName("al")
   public void method8266(classVJ var1) {
      if (var1.field6516 != null) {
         var1.method11958();
      }

      var1.field6516 = this.field4800.field6516;
      var1.field6515 = this.field4800;
      var1.field6516.field6515 = var1;
      var1.field6515.field6516 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("ak")
   public classVJ method8280() {
      classVJ var1 = this.field4801;
      if (var1 == this.field4800) {
         this.field4801 = null;
         return null;
      } else {
         this.field4801 = var1.field6515;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public void method8264() {
      while (this.field4800.field6515 != this.field4800) {
         this.field4800.field6515.method11958();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)Lvj;")
   @ObfuscatedName("as")
   classVJ method8275(classVJ var1) {
      classVJ var2;
      if (var1 == null) {
         var2 = this.field4800.field6515;
      } else {
         var2 = var1;
      }

      if (var2 == this.field4800) {
         this.field4801 = null;
         return null;
      } else {
         this.field4801 = var2.field6515;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)V")
   @ObfuscatedName("aq")
   public void method8267(classVJ var1) {
      if (var1.field6516 != null) {
         var1.method11958();
      }

      var1.field6516 = this.field4800.field6516;
      var1.field6515 = this.field4800;
      var1.field6516.field6515 = var1;
      var1.field6515.field6516 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("ad")
   public classVJ method8270() {
      classVJ var1 = this.field4800.field6515;
      if (var1 == this.field4800) {
         return null;
      } else {
         var1.method11958();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("au")
   public classVJ method8272() {
      return this.method8275(null);
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)Lvj;")
   @ObfuscatedName("ai")
   classVJ method8276(classVJ var1) {
      classVJ var2;
      if (var1 == null) {
         var2 = this.field4800.field6515;
      } else {
         var2 = var1;
      }

      if (var2 == this.field4800) {
         this.field4801 = null;
         return null;
      } else {
         this.field4801 = var2.field6515;
         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnz;)Ljava/util/Iterator;")
   @ObfuscatedName("ib")
   public static Iterator method8284(classNZ var0) {
      if (var0 == null) {
         var0.method8285();
      }

      return new classNX(var0);
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)Lvj;")
   @ObfuscatedName("ar")
   classVJ method8277(classVJ var1) {
      classVJ var2;
      if (var1 == null) {
         var2 = this.field4800.field6515;
      } else {
         var2 = var1;
      }

      if (var2 == this.field4800) {
         this.field4801 = null;
         return null;
      } else {
         this.field4801 = var2.field6515;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)Lvj;")
   @ObfuscatedName("aw")
   classVJ method8278(classVJ var1) {
      classVJ var2;
      if (var1 == null) {
         var2 = this.field4800.field6515;
      } else {
         var2 = var1;
      }

      if (var2 == this.field4800) {
         this.field4801 = null;
         return null;
      } else {
         this.field4801 = var2.field6515;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)V")
   @ObfuscatedName("aj")
   public void method8268(classVJ var1) {
      if (var1.field6516 != null) {
         var1.method11958();
      }

      var1.field6516 = this.field4800.field6516;
      var1.field6515 = this.field4800;
      var1.field6516.field6515 = var1;
      var1.field6515.field6516 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)V")
   @ObfuscatedName("om")
   public void method8287(classVJ var1) {
      method8265(this, var1);
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("av")
   public classVJ method8281() {
      classVJ var1 = this.field4801;
      if (var1 == this.field4800) {
         this.field4801 = null;
         return null;
      } else {
         this.field4801 = var1.field6515;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnz;)Lvj;")
   @ObfuscatedName("so")
   public static classVJ method8282(classNZ var0) {
      if (var0 == null) {
         var0.method8274();
      }

      classVJ var1 = var0.field4801;
      if (var1 == var0.field4800) {
         var0.field4801 = null;
         return null;
      } else {
         var0.field4801 = var1.field6515;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("ap")
   public classVJ method8273() {
      return this.method8275(null);
   }

   @ObfuscatedSignature(descriptor = "()Lvj;")
   @ObfuscatedName("at")
   public classVJ method8274() {
      return this.method8277(null);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("by")
   public Iterator method8285() {
      return new classNX(this);
   }

   @ObfuscatedSignature(descriptor = "(Lvj;)V")
   @ObfuscatedName("ae")
   public void method8288(classVJ var1) {
      method8265(this, var1);
   }
}
