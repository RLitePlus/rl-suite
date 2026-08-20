import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rk")
public class classRK implements Iterator {
   @ObfuscatedSignature(descriptor = "Lsb;")
   @ObfuscatedName("av")
   class468 field5538;
   @ObfuscatedName("at")
   int field5537 = 0;
   @ObfuscatedName("ag")
   int field5539;
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   static final int field5540 = 123;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ap")
   public Object method9482() {
      if (1073278063 * this.field5539 != 161248051 * this.field5538.field5755) {
         throw new ConcurrentModificationException();
      } else if (this.field5537 * -439769195 < -1002980573 * this.field5538.field5757) {
         Object var1 = this.field5538.field5756[this.field5537 * -439769195].field5748;
         this.field5537 += -138122307;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method9479() {
      return this.field5537 * -439769195 < this.field5538.field5757 * -1002980573;
   }

   @Override
   public Object next() {
      try {
         if (1073278063 * this.field5539 != 161248051 * this.field5538.field5755) {
            throw new ConcurrentModificationException();
         } else if (this.field5537 * -439769195 < -1002980573 * this.field5538.field5757) {
            Object var1 = this.field5538.field5756[this.field5537 * -439769195].field5748;
            this.field5537 += -138122307;
            return var1;
         } else {
            throw new NoSuchElementException();
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rk.next(" + ')');
      }
   }

   @Override
   public boolean hasNext() {
      try {
         return this.field5537 * -439769195 < this.field5538.field5757 * -1002980573;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "rk.hasNext(" + ')');
      }
   }

   @Override
   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "rk.remove(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrk;)V")
   @ObfuscatedName("ow")
   public static void method9485(classRK var0) {
      if (var0 == null) {
         var0.method9488();
      } else {
         throw new UnsupportedOperationException();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("au")
   public Object method9483() {
      if (-307543481 * this.field5539 != 161248051 * this.field5538.field5755) {
         throw new ConcurrentModificationException();
      } else if (this.field5537 * 1092978233 < -396156405 * this.field5538.field5757) {
         Object var1 = this.field5538.field5756[this.field5537 * -439769195].field5748;
         this.field5537 += -982384014;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   public Object method9484() {
      if (1073278063 * this.field5539 != 575032369 * this.field5538.field5755) {
         throw new ConcurrentModificationException();
      } else if (this.field5537 * -157351769 < -1060442872 * this.field5538.field5757) {
         Object var1 = this.field5538.field5756[this.field5537 * 2034529274].field5748;
         this.field5537 += 553781510;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method9480() {
      return this.field5537 * -439769195 < this.field5538.field5757 * -1922066923;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method9486() {
      throw new UnsupportedOperationException();
   }

   classRK(class468 var1) {
      this.field5539 = -596537475 * this.field5538.field5755;
      this.field5538 = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method9487() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method9481() {
      return this.field5537 * -1512352658 < this.field5538.field5757 * -1492942869;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method9488() {
      throw new UnsupportedOperationException();
   }
}
