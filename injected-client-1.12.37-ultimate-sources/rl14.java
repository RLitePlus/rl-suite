import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl14")
class rl14 implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvq;")
   @ObfuscatedName("fw")
   public classVQ field5699;
   @ObfuscatedName("ss")
   public int field5698;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;II[[IIII)Lee;")
   @ObfuscatedName("um")
   public static classEE method10048(classOM var0, int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (var0.field4939 == null) {
         var7 = var2 + (var0.field4922 * -381960671 << 10);
      } else {
         var7 = var2 + (var0.field4922 * -381960671 << 10) + (var1 << 3);
      }

      Object var9 = (classEE)classOM.field4972.method6422(var7);
      if (var9 == null) {
         classER var10 = var0.method8595(var1, var2, -1973084331);
         if (var10 == null) {
            return null;
         }

         if (!var0.field4932) {
            var9 = var10.method4045(54395613 * var0.field4952 + 64, 768 + -1693032223 * var0.field4921, -50, -10, -50);
         } else {
            var10.field1878 = (short)(64 + 54395613 * var0.field4952);
            var10.field1879 = (short)(768 + -1693032223 * var0.field4921);
            classER.method4015(var10);
            var9 = var10;
         }

         classOM.field4972.method6428((classVJ)var9, var7);
      }

      if (var0.field4932) {
         var9 = classER.method3985((classER)var9);
      }

      if (var0.field4949 * 1531627111 >= 0) {
         if (var9 instanceof classFX) {
            var9 = ((classFX)var9).method5246(var3, var4, var5, var6, true, 1531627111 * var0.field4949);
         } else if (var9 instanceof classER) {
            var9 = ((classER)var9).method3987(var3, var4, var5, var6, true, var0.field4949 * 1531627111);
         }
      }

      return (classEE)var9;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmb;Ljava/lang/Runnable;I)Lmj;")
   @ObfuscatedName("xc")
   public static classMJ method10047(classMB var0, Runnable var1, int var2) {
      if (var0 == null) {
         var0.method7507();
      }

      return classMB.method7510(var0, 2, var2, 0, var1, -1133155428);
   }

   @ObfuscatedSignature(descriptor = "()Lvq;")
   @ObfuscatedName("bv")
   public classVQ method10049() {
      if (this.field5698 > 0 && this.field5697.field6986[this.field5698 - 1] != this.field5699) {
         classVQ var3 = this.field5699;
         this.field5699 = var3.method12064();
         return var3;
      } else {
         while (this.field5698 < this.field5697.field6987) {
            classVQ var1 = this.field5697.field6986[this.field5698++];
            classVQ var2 = var1.method12064();
            if (var1 != var2) {
               this.field5699 = var2.method12064();
               return var2;
            }
         }

         throw new NoSuchElementException();
      }
   }

   @Override
   public boolean hasNext() {
      if (this.field5698 > 0 && this.field5697.field6986[this.field5698 - 1] != this.field5699) {
         return true;
      } else {
         for (int var1 = this.field5698; var1 < this.field5697.field6987; var1++) {
            classVQ var2 = this.field5697.field6986[var1];
            classVQ var3 = var2.method12064();
            if (var2 != var3) {
               return true;
            }
         }

         return false;
      }
   }

   public rl14(classYI var1) {
      this.field5697 = var1;
   }
}
