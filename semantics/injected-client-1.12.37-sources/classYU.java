import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yu")
public class classYU implements Iterator {
   @ObfuscatedName("ae")
   int field7090;
   @ObfuscatedSignature(descriptor = "Lyk;")
   @ObfuscatedName("az")
   IndexedObjectSet field7088;
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("ab")
   classVO field7089 = null;
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("af")
   classVO field7091;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Luu;)V")
   @ObfuscatedName("eg")
   public static void method13657(classUU var0, classUU var1) {
      System.arraycopy(var1.field6403, 0, var0.field6403, 0, 16);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method13645() {
      this.field7091 = this.field7088.field6996[0].field6532;
      this.field7090 = 1;
      this.field7089 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method13655() {
      if (this.field7089 == null) {
         throw new IllegalStateException();
      } else {
         this.field7089.method12005();
         this.field7089 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyu;)Ljava/lang/Object;")
   @ObfuscatedName("yc")
   public static Object method13647(classYU var0) {
      if (var0 == null) {
         var0.method13652();
      }

      if (var0.field7091 != var0.field7088.field6996[var0.field7090 - 1]) {
         classVO var2 = var0.field7091;
         var0.field7091 = var2.field6532;
         var0.field7089 = var2;
         return var2;
      } else {
         while (var0.field7090 < var0.field7088.field6997) {
            classVO var1 = var0.field7088.field6996[var0.field7090++].field6532;
            if (var1 != var0.field7088.field6996[var0.field7090 - 1]) {
               var0.field7091 = var1.field6532;
               var0.field7089 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method13656() {
      if (this.field7089 == null) {
         throw new IllegalStateException();
      } else {
         this.field7089.method12005();
         this.field7089 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyu;)Ljava/lang/Object;")
   @ObfuscatedName("gz")
   public static Object method13648(classYU var0) {
      if (var0.field7091 != var0.field7088.field6996[var0.field7090 - 1]) {
         classVO var2 = var0.field7091;
         var0.field7091 = var2.field6532;
         var0.field7089 = var2;
         return var2;
      } else {
         while (var0.field7090 < var0.field7088.field6997) {
            classVO var1 = var0.field7088.field6996[var0.field7090++].field6532;
            if (var1 != var0.field7088.field6996[var0.field7090 - 1]) {
               var0.field7091 = var1.field6532;
               var0.field7089 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @Override
   public void remove() {
      if (this.field7089 == null) {
         throw new IllegalStateException();
      } else {
         this.field7089.method12005();
         this.field7089 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method13651() {
      if (this.field7091 != this.field7088.field6996[this.field7090 - 1]) {
         return true;
      } else {
         while (this.field7090 < this.field7088.field6997) {
            if (this.field7088.field6996[this.field7090++].field6532 != this.field7088.field6996[this.field7090 - 1]) {
               this.field7091 = this.field7088.field6996[this.field7090 - 1].field6532;
               return true;
            }

            this.field7091 = this.field7088.field6996[this.field7090 - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvo;")
   @ObfuscatedName("sl")
   public classVO method13658() {
      return (classVO)this.next();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("al")
   public Object method13649() {
      if (this.field7091 != this.field7088.field6996[this.field7090 - 1]) {
         classVO var2 = this.field7091;
         this.field7091 = var2.field6532;
         this.field7089 = var2;
         return var2;
      } else {
         while (this.field7090 < this.field7088.field6997) {
            classVO var1 = this.field7088.field6996[this.field7090++].field6532;
            if (var1 != this.field7088.field6996[this.field7090 - 1]) {
               this.field7091 = var1.field6532;
               this.field7089 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method13652() {
      if (this.field7091 != this.field7088.field6996[this.field7090 - 1]) {
         return true;
      } else {
         while (this.field7090 < this.field7088.field6997) {
            if (this.field7088.field6996[this.field7090++].field6532 != this.field7088.field6996[this.field7090 - 1]) {
               this.field7091 = this.field7088.field6996[this.field7090 - 1].field6532;
               return true;
            }

            this.field7091 = this.field7088.field6996[this.field7090 - 1];
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method13646() {
      this.field7091 = this.field7088.field6996[0].field6532;
      this.field7090 = 1;
      this.field7089 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method13653() {
      if (this.field7091 != this.field7088.field6996[this.field7090 - 1]) {
         return true;
      } else {
         while (this.field7090 < this.field7088.field6997) {
            if (this.field7088.field6996[this.field7090++].field6532 != this.field7088.field6996[this.field7090 - 1]) {
               this.field7091 = this.field7088.field6996[this.field7090 - 1].field6532;
               return true;
            }

            this.field7091 = this.field7088.field6996[this.field7090 - 1];
         }

         return false;
      }
   }

   @Override
   public boolean hasNext() {
      if (this.field7091 != this.field7088.field6996[this.field7090 - 1]) {
         return true;
      } else {
         while (this.field7090 < this.field7088.field6997) {
            if (this.field7088.field6996[this.field7090++].field6532 != this.field7088.field6996[this.field7090 - 1]) {
               this.field7091 = this.field7088.field6996[this.field7090 - 1].field6532;
               return true;
            }

            this.field7091 = this.field7088.field6996[this.field7090 - 1];
         }

         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyu;)Z")
   @ObfuscatedName("lw")
   public static boolean method13654(classYU var0) {
      if (var0.field7091 != var0.field7088.field6996[var0.field7090 - 1]) {
         return true;
      } else {
         while (var0.field7090 < var0.field7088.field6997) {
            if (var0.field7088.field6996[var0.field7090++].field6532 != var0.field7088.field6996[var0.field7090 - 1]) {
               var0.field7091 = var0.field7088.field6996[var0.field7090 - 1].field6532;
               return true;
            }

            var0.field7091 = var0.field7088.field6996[var0.field7090 - 1];
         }

         return false;
      }
   }

   classYU(IndexedObjectSet var1) {
      this.field7088 = var1;
      this.method13645();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ao")
   public Object method13650() {
      if (this.field7091 != this.field7088.field6996[this.field7090 - 1]) {
         classVO var2 = this.field7091;
         this.field7091 = var2.field6532;
         this.field7089 = var2;
         return var2;
      } else {
         while (this.field7090 < this.field7088.field6997) {
            classVO var1 = this.field7088.field6996[this.field7090++].field6532;
            if (var1 != this.field7088.field6996[this.field7090 - 1]) {
               this.field7091 = var1.field6532;
               this.field7089 = var1;
               return var1;
            }
         }

         return null;
      }
   }

   @Override
   public Object next() {
      if (this.field7091 != this.field7088.field6996[this.field7090 - 1]) {
         classVO var2 = this.field7091;
         this.field7091 = var2.field6532;
         this.field7089 = var2;
         return var2;
      } else {
         while (this.field7090 < this.field7088.field6997) {
            classVO var1 = this.field7088.field6996[this.field7090++].field6532;
            if (var1 != this.field7088.field6996[this.field7090 - 1]) {
               this.field7091 = var1.field6532;
               this.field7089 = var1;
               return var1;
            }
         }

         return null;
      }
   }
}
