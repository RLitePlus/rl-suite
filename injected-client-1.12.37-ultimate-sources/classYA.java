import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ya")
public class classYA implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("af")
   classVQ field6964;
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("az")
   classYN field6962;
   @ObfuscatedName("ae")
   int field6963;
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("ab")
   classVQ field6961 = null;

   public classYA(classYN var1) {
      this.field6962 = var1;
      this.method13278();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method13278() {
      this.field6964 = this.field6962.field7017[0].field6554;
      this.field6963 = 1;
      this.field6961 = null;
   }

   public classYA() {
   }

   @Override
   public Object next() {
      if (this.field6964 != this.field6962.field7017[this.field6963 - 1]) {
         classVQ var2 = this.field6964;
         this.field6964 = var2.field6554;
         this.field6961 = var2;
         return var2;
      } else {
         while (this.field6963 < this.field6962.field7018) {
            classVQ var1 = this.field6962.field7017[this.field6963++].field6554;
            if (var1 != this.field6962.field7017[this.field6963 - 1]) {
               this.field6964 = var1.field6554;
               this.field6961 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lya;)Lvq;")
   @ObfuscatedName("fh")
   public static classVQ method13283(classYA var0) {
      if (var0 == null) {
         var0.method13294();
      }

      var0.method13278();
      return (classVQ)var0.next();
   }

   @Override
   public boolean hasNext() {
      if (this.field6964 != this.field6962.field7017[this.field6963 - 1]) {
         return true;
      } else {
         while (this.field6963 < this.field6962.field7018) {
            if (this.field6962.field7017[this.field6963++].field6554 != this.field6962.field7017[this.field6963 - 1]) {
               this.field6964 = this.field6962.field7017[this.field6963 - 1].field6554;
               return true;
            }

            this.field6964 = this.field6962.field7017[this.field6963 - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method13279() {
      this.field6964 = this.field6962.field7017[0].field6554;
      this.field6963 = 1;
      this.field6961 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lya;)Ljava/lang/Object;")
   @ObfuscatedName("bf")
   public static Object method13288(classYA var0) {
      if (var0.field6964 != var0.field6962.field7017[var0.field6963 - 1]) {
         classVQ var2 = var0.field6964;
         var0.field6964 = var2.field6554;
         var0.field6961 = var2;
         return var2;
      } else {
         while (var0.field6963 < var0.field6962.field7018) {
            classVQ var1 = var0.field6962.field7017[var0.field6963++].field6554;
            if (var1 != var0.field6962.field7017[var0.field6963 - 1]) {
               var0.field6964 = var1.field6554;
               var0.field6961 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("aj")
   public Object method13289() {
      if (this.field6964 != this.field6962.field7017[this.field6963 - 1]) {
         classVQ var2 = this.field6964;
         this.field6964 = var2.field6554;
         this.field6961 = var2;
         return var2;
      } else {
         while (this.field6963 < this.field6962.field7018) {
            classVQ var1 = this.field6962.field7017[this.field6963++].field6554;
            if (var1 != this.field6962.field7017[this.field6963 - 1]) {
               this.field6964 = var1.field6554;
               this.field6961 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method13296() {
      if (this.field6961 == null) {
         throw new IllegalStateException();
      } else {
         this.field6961.vmethod398();
         this.field6961 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ao")
   public Object method13290() {
      if (this.field6964 != this.field6962.field7017[this.field6963 - 1]) {
         classVQ var2 = this.field6964;
         this.field6964 = var2.field6554;
         this.field6961 = var2;
         return var2;
      } else {
         while (this.field6963 < this.field6962.field7018) {
            classVQ var1 = this.field6962.field7017[this.field6963++].field6554;
            if (var1 != this.field6962.field7017[this.field6963 - 1]) {
               this.field6964 = var1.field6554;
               this.field6961 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lya;)V")
   @ObfuscatedName("pn")
   public static void method13297(classYA var0) {
      if (var0.field6961 == null) {
         throw new IllegalStateException();
      } else {
         var0.field6961.vmethod398();
         var0.field6961 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laav;I)B")
   @ObfuscatedName("ae")
   public static byte method13287(classAAV var0, int var1) {
      if (var1 < var0.field105) {
         return var0.field108;
      } else if (var1 >= var0.field104) {
         var0.field108 = var0.field106;
         return var0.field108;
      } else {
         int var2 = var0.field107 & 255;
         int var3 = var0.field106 & 255;
         float var4 = (float)(var1 - var0.field105) / (var0.field104 - var0.field105);
         var0.field108 = (byte)classLU.method7149(var2, var3, var4, 120041229);
         return var0.field108;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method13292() {
      if (this.field6964 != this.field6962.field7017[this.field6963 - 1]) {
         return true;
      } else {
         while (this.field6963 < this.field6962.field7018) {
            if (this.field6962.field7017[this.field6963++].field6554 != this.field6962.field7017[this.field6963 - 1]) {
               this.field6964 = this.field6962.field7017[this.field6963 - 1].field6554;
               return true;
            }

            this.field6964 = this.field6962.field7017[this.field6963 - 1];
         }

         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvc;)V")
   @ObfuscatedName("dc")
   public static void method13275(classVC var0) {
      if (var0.field6489 != null) {
         if (-597373801 * var0.field6487 < -1027524225) {
            var0.field6487 += -592925861;
         }
      } else if (876333252 * var0.field6487 > 0) {
         var0.field6487 -= -1419496433;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method13293() {
      if (this.field6964 != this.field6962.field7017[this.field6963 - 1]) {
         return true;
      } else {
         while (this.field6963 < this.field6962.field7018) {
            if (this.field6962.field7017[this.field6963++].field6554 != this.field6962.field7017[this.field6963 - 1]) {
               this.field6964 = this.field6962.field7017[this.field6963 - 1].field6554;
               return true;
            }

            this.field6964 = this.field6962.field7017[this.field6963 - 1];
         }

         return false;
      }
   }

   @Override
   public void remove() {
      if (this.field6961 == null) {
         throw new IllegalStateException();
      } else {
         this.field6961.vmethod398();
         this.field6961 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lya;)Ljava/lang/Object;")
   @ObfuscatedName("nr")
   public static Object method13291(classYA var0) {
      if (var0.field6964 != var0.field6962.field7017[var0.field6963 - 1]) {
         classVQ var2 = var0.field6964;
         var0.field6964 = var2.field6554;
         var0.field6961 = var2;
         return var2;
      } else {
         while (var0.field6963 < var0.field6962.field7018) {
            classVQ var1 = var0.field6962.field7017[var0.field6963++].field6554;
            if (var1 != var0.field6962.field7017[var0.field6963 - 1]) {
               var0.field6964 = var1.field6554;
               var0.field6961 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;I)Lsp;")
   @ObfuscatedName("er")
   public static classSP method13298(classCL var0, int var1) {
      return var0 == null ? var0.method1600(var1) : (classSP)classCL.method1592(var0, 839252882).field1700.method13595(var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method13294() {
      if (this.field6964 != this.field6962.field7017[this.field6963 - 1]) {
         return true;
      } else {
         while (this.field6963 < this.field6962.field7018) {
            if (this.field6962.field7017[this.field6963++].field6554 != this.field6962.field7017[this.field6963 - 1]) {
               this.field6964 = this.field6962.field7017[this.field6963 - 1].field6554;
               return true;
            }

            this.field6964 = this.field6962.field7017[this.field6963 - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method13280() {
      this.field6964 = this.field6962.field7017[0].field6554;
      this.field6963 = 1;
      this.field6961 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method13295() {
      if (this.field6964 != this.field6962.field7017[this.field6963 - 1]) {
         return true;
      } else {
         while (this.field6963 < this.field6962.field7018) {
            if (this.field6962.field7017[this.field6963++].field6554 != this.field6962.field7017[this.field6963 - 1]) {
               this.field6964 = this.field6962.field7017[this.field6963 - 1].field6554;
               return true;
            }

            this.field6964 = this.field6962.field7017[this.field6963 - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method13281() {
      this.field6964 = this.field6962.field7017[0].field6554;
      this.field6963 = 1;
      this.field6961 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lya;Lyn;)V")
   @ObfuscatedName("br")
   public static void method13276(classYA var0, classYN var1) {
      if (var0 == null) {
         var0.method13277(var1);
      }

      var0.field6962 = var1;
      var0.method13278();
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("aw")
   public classVQ method13284() {
      this.method13278();
      return (classVQ)this.next();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lya;)V")
   @ObfuscatedName("jz")
   public static void method13282(classYA var0) {
      var0.field6964 = var0.field6962.field7017[0].field6554;
      var0.field6963 = 1;
      var0.field6961 = null;
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ak")
   public classVQ method13285() {
      this.method13278();
      return (classVQ)this.next();
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("ae")
   public classVQ method13286() {
      this.method13280();
      return (classVQ)this.next();
   }

   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("az")
   public void method13277(classYN var1) {
      this.field6962 = var1;
      this.method13281();
   }
}
