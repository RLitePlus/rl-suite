import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wb")
public class classWB {
   @ObfuscatedName("af")
   public final Object field6655;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field6656 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field6657 = 8;
   @ObfuscatedName("az")
   public final Object field6654;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwb;)I")
   @ObfuscatedName("wi")
   public static int method12284(classWB var0) {
      if (var0 == null) {
         var0.method12280();
      }

      int var1 = 0;
      if (var0.field6654 != null) {
         var1 += var0.field6654.hashCode();
      }

      if (var0.field6655 != null) {
         var1 += 1405871799 * var0.field6655.hashCode();
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method12282(Object var1) {
      if (var1 != null && var1 instanceof classWB) {
         classWB var2 = (classWB)var1;
         if (this.field6654 == null) {
            if (var2.field6654 != null) {
               return false;
            }
         } else if (!this.field6654.equals(var2.field6654)) {
            return false;
         }

         if (this.field6655 == null) {
            if (null != var2.field6655) {
               return false;
            }
         } else if (!this.field6655.equals(var2.field6655)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwb;Ljava/lang/Object;)Z")
   @ObfuscatedName("tc")
   public static boolean method12283(classWB var0, Object var1) {
      if (var0 == null) {
         var0.hashCode();
      }

      if (var1 != null && var1 instanceof classWB) {
         classWB var2 = (classWB)var1;
         if (var0.field6654 == null) {
            if (var2.field6654 != null) {
               return false;
            }
         } else if (!var0.field6654.equals(var2.field6654)) {
            return false;
         }

         if (var0.field6655 == null) {
            if (null != var2.field6655) {
               return false;
            }
         } else if (!var0.field6655.equals(var2.field6655)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      try {
         return this.field6654 + ", " + this.field6655;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "wb.toString(" + ')');
      }
   }

   public classWB(Object var1, Object var2) {
      this.field6654 = var1;
      this.field6655 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzs;Z)Lzs;")
   @ObfuscatedName("he")
   public static classZS method12288(classZS var0, boolean var1) {
      if (var0 == null) {
         var0.method14188();
      }

      var0.field7268 = var1;
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwb;)I")
   @ObfuscatedName("gb")
   public static int method12285(classWB var0) {
      int var1 = 0;
      if (var0.field6654 != null) {
         var1 += var0.field6654.hashCode();
      }

      if (var0.field6655 != null) {
         var1 += 31 * var0.field6655.hashCode();
      }

      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (var1 != null && var1 instanceof classWB) {
            classWB var2 = (classWB)var1;
            if (this.field6654 == null) {
               if (var2.field6654 != null) {
                  return false;
               }
            } else if (!this.field6654.equals(var2.field6654)) {
               return false;
            }

            if (this.field6655 == null) {
               if (null != var2.field6655) {
                  return false;
               }
            } else if (!this.field6655.equals(var2.field6655)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wb.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method12279() {
      return this.field6654 + ", " + this.field6655;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method12280() {
      return this.field6654 + ", " + this.field6655;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method12281() {
      return this.field6654 + ", " + this.field6655;
   }

   @Override
   public int hashCode() {
      try {
         int var1 = 0;
         if (this.field6654 != null) {
            var1 += this.field6654.hashCode();
         }

         if (this.field6655 != null) {
            var1 += 31 * this.field6655.hashCode();
         }

         return var1;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wb.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afh")
   public int method12286() {
      int var1 = 0;
      if (this.field6654 != null) {
         var1 += this.field6654.hashCode();
      }

      if (this.field6655 != null) {
         var1 += 31 * this.field6655.hashCode();
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method12287() {
      int var1 = 0;
      if (this.field6654 != null) {
         var1 += this.field6654.hashCode();
      }

      if (this.field6655 != null) {
         var1 += 1703952098 * this.field6655.hashCode();
      }

      return var1;
   }
}
