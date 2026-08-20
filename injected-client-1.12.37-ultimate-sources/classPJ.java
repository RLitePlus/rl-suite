import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pj")
public class classPJ implements Iterator {
   @ObfuscatedName("af")
   int field5270;
   @ObfuscatedName("ae")
   int field5271 = 0;
   @ObfuscatedSignature(descriptor = "Lpz;")
   @ObfuscatedName("az")
   classPZ field5269;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final String field5273 = "random.dat";
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   public static final int field5272 = 67;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method8924() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean hasNext() {
      try {
         return this.field5271 * -984169853 < 287626351 * this.field5269.field5497;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "pj.hasNext(" + ')');
      }
   }

   classPJ(classPZ var1) {
      this.field5270 = this.field5269.field5494 * 2038097811;
      this.field5269 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method8917() {
      return this.field5271 * -984169853 < 287626351 * this.field5269.field5497;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ao")
   public Object method8920() {
      if (-160205185 * this.field5270 != this.field5269.field5494 * 868197357) {
         throw new ConcurrentModificationException();
      } else if (this.field5271 * -984169853 < this.field5269.field5497 * 287626351) {
         Object var1 = this.field5269.field5495[this.field5271 * -984169853].field5224;
         this.field5271 += -376628181;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "pj.remove(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("aj")
   public Object method8921() {
      if (-160205185 * this.field5270 != this.field5269.field5494 * 868197357) {
         throw new ConcurrentModificationException();
      } else if (this.field5271 * -984169853 < this.field5269.field5497 * 287626351) {
         Object var1 = this.field5269.field5495[this.field5271 * -984169853].field5224;
         this.field5271 += -376628181;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   public Object method8922() {
      if (-1162884564 * this.field5270 != this.field5269.field5494 * 1405692877) {
         throw new ConcurrentModificationException();
      } else if (this.field5271 * -984169853 < this.field5269.field5497 * -206018461) {
         Object var1 = this.field5269.field5495[this.field5271 * 1770533645].field5224;
         this.field5271 += -258712084;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method8918() {
      return this.field5271 * -984169853 < 287626351 * this.field5269.field5497;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method8919() {
      return this.field5271 * -276240757 < 722093119 * this.field5269.field5497;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("al")
   public Object method8923() {
      if (-160205185 * this.field5270 != this.field5269.field5494 * 868197357) {
         throw new ConcurrentModificationException();
      } else if (this.field5271 * -984169853 < this.field5269.field5497 * 287626351) {
         Object var1 = this.field5269.field5495[this.field5271 * -984169853].field5224;
         this.field5271 += -376628181;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method8925() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object next() {
      try {
         if (-160205185 * this.field5270 != this.field5269.field5494 * 868197357) {
            throw new ConcurrentModificationException();
         } else if (this.field5271 * -984169853 < this.field5269.field5497 * 287626351) {
            Object var1 = this.field5269.field5495[this.field5271 * -984169853].field5224;
            this.field5271 += -376628181;
            return var1;
         } else {
            throw new NoSuchElementException();
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pj.next(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpt;I)I")
   @ObfuscatedName("od")
   public static int method8916(classPT var0, int var1) {
      int var2 = classPT.field5417[1870062131 * var0.field5421 - -526564793 * var0.field5419];
      return var1 >> 811454747 * var0.field5419 & var2;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;IIB)V")
   @ObfuscatedName("bp")
   static void method8926(Object[] var0, int var1, int var2, byte var3) {
      try {
         while (var1 < var2) {
            if (var3 <= 1) {
               return;
            }

            Object var4 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var4;
            var1++;
            var2--;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "pj.bp(" + ')');
      }
   }
}
