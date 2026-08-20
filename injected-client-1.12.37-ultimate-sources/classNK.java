import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nk")
public class classNK implements Deque {
   @ObfuscatedSignature(descriptor = "Lvm;")
   @ObfuscatedName("az")
   classVM field4680;
   @ObfuscatedSignature(descriptor = "Lvm;")
   @ObfuscatedName("af")
   classVM field4679 = new classVM();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnk;)Lvm;")
   @ObfuscatedName("kh")
   public static classVM method7867(classNK var0) {
      if (var0 == null) {
         return var0.method7869();
      } else {
         classVM var1 = var0.field4679.field6528;
         if (var1 == var0.field4679) {
            var0.field4680 = null;
            return null;
         } else {
            var0.field4680 = var1.field6528;
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvm;")
   @ObfuscatedName("af")
   public classVM method7868() {
      classVM var1 = this.field4679.field6528;
      if (var1 == this.field4679) {
         this.field4680 = null;
         return null;
      } else {
         this.field4680 = var1.field6528;
         return var1;
      }
   }

   public classNK() {
      this.field4679.field6528 = this.field4679;
      this.field4679.field6529 = this.field4679;
   }

   public Iterator iterator() {
      return new rl15(this);
   }

   public void clear() {
      Iterator var1 = this.iterator();

      while (var1.hasNext()) {
         var1.remove();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvm;)V")
   @ObfuscatedName("ab")
   public void method7862(classVM var1) {
      if (var1.field6529 != null) {
         classVM.method11996(var1);
      }

      var1.field6529 = this.field4679.field6529;
      var1.field6528 = this.field4679;
      var1.field6529.field6528 = var1;
      var1.field6528.field6529 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvm;")
   @ObfuscatedName("ae")
   public classVM method7872() {
      classVM var1 = this.field4680;
      if (var1 == this.field4679) {
         this.field4680 = null;
         return null;
      } else {
         this.field4680 = var1.field6528;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvm;)V")
   @ObfuscatedName("as")
   public void method7863(classVM var1) {
      if (var1.field6529 != null) {
         classVM.method11996(var1);
      }

      var1.field6529 = this.field4679.field6529;
      var1.field6528 = this.field4679;
      var1.field6529.field6528 = var1;
      var1.field6528.field6529 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvm;)V")
   @ObfuscatedName("ag")
   public void method7864(classVM var1) {
      if (var1.field6529 != null) {
         classVM.method11996(var1);
      }

      var1.field6529 = this.field4679.field6529;
      var1.field6528 = this.field4679;
      var1.field6529.field6528 = var1;
      var1.field6528.field6529 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnk;)Lvm;")
   @ObfuscatedName("uc")
   public static classVM method7873(classNK var0) {
      classVM var1 = var0.field4680;
      if (var1 == var0.field4679) {
         var0.field4680 = null;
         return null;
      } else {
         var0.field4680 = var1.field6528;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvm;")
   @ObfuscatedName("aa")
   public classVM method7869() {
      classVM var1 = this.field4679.field6528;
      if (var1 == this.field4679) {
         this.field4680 = null;
         return null;
      } else {
         this.field4680 = var1.field6528;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrh;)V")
   @ObfuscatedName("bc")
   public void method7877(classRH var1) {
      method7865(this, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lnk;Lvm;)V")
   @ObfuscatedName("fo")
   public static void method7865(classNK var0, classVM var1) {
      if (var0 == null) {
         var0.method7866(var1);
      }

      if (var1.field6529 != null) {
         classVM.method11996(var1);
      }

      var1.field6529 = var0.field4679.field6529;
      var1.field6528 = var0.field4679;
      var1.field6529.field6528 = var1;
      var1.field6528.field6529 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)I")
   @ObfuscatedName("xq")
   public static int method7876(classLH var0) {
      return 236265915 * var0.field4153 / var0.field4159.method13911((byte)62);
   }

   @ObfuscatedSignature(descriptor = "()Lvm;")
   @ObfuscatedName("ax")
   public classVM method7870() {
      classVM var1 = this.field4679.field6528;
      if (var1 == this.field4679) {
         this.field4680 = null;
         return null;
      } else {
         this.field4680 = var1.field6528;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnk;)Lvm;")
   @ObfuscatedName("vx")
   public static classVM method7874(classNK var0) {
      classVM var1 = var0.field4680;
      if (var1 == var0.field4679) {
         var0.field4680 = null;
         return null;
      } else {
         var0.field4680 = var1.field6528;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvm;")
   @ObfuscatedName("ao")
   public classVM method7871() {
      classVM var1 = this.field4679.field6528;
      if (var1 == this.field4679) {
         this.field4680 = null;
         return null;
      } else {
         this.field4680 = var1.field6528;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;ILxs;)V")
   @ObfuscatedName("bx")
   public static void method7875(classDH var0, int var1, classXS var2) {
      var0.field1463.method1382(var1, var2, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "(Lvm;)V")
   @ObfuscatedName("az")
   public void method7866(classVM var1) {
      if (var1.field6528 != null) {
         classVM.method11996(var1);
      }

      var1.field6529 = this.field4680.field6529;
      var1.field6528 = this.field4680;
      var1.field6528.field6529 = var1;
      var1.field6528.field6529 = var1;
   }
}
