import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ro")
public final class classRO implements Comparable {
   @ObfuscatedName("az")
   Object field5821;
   @ObfuscatedName("af")
   Object field5822;
   @ObfuscatedName("ab")
   long field5823;
   @ObfuscatedName("ae")
   long field5824;
   @ObfuscatedSignature(descriptor = "Lke;")
   @ObfuscatedName("gp")
   static classKE field5825;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afh")
   public int method10143() {
      return this.field5822.hashCode();
   }

   @ObfuscatedSignature(descriptor = "(Lro;I)I")
   @ObfuscatedName("az")
   int method10138(classRO var1, int var2) {
      try {
         if (6150833583405228361L * this.field5824 < 6150833583405228361L * var1.field5824) {
            if (var2 <= -1305254149) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (6150833583405228361L * this.field5824 > 6150833583405228361L * var1.field5824) {
            if (var2 <= -1305254149) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ro.az(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (var1 instanceof classRO) {
            return this.field5822.equals(((classRO)var1).field5822);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ro.equals(" + ')');
      }
   }

   @Override
   public int hashCode() {
      try {
         return this.field5822.hashCode();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ro.hashCode(" + 41);
      }
   }

   @Override
   public int compareTo(Object var1) {
      try {
         return this.method10138((classRO)var1, 1370849369);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ro.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method10140(Object var1) {
      if (var1 instanceof classRO) {
         return this.field5822.equals(((classRO)var1).field5822);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method10141(Object var1) {
      if (var1 instanceof classRO) {
         return this.field5822.equals(((classRO)var1).field5822);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afe")
   public int method10144() {
      return this.field5822.hashCode();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method10145() {
      return this.field5822.hashCode();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lro;Ljava/lang/Object;)I")
   @ObfuscatedName("jl")
   public static int method10147(classRO var0, Object var1) {
      if (var0 == null) {
         var0.method10144();
      }

      return var0.method10138((classRO)var1, -1122528872);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afs")
   public int method10146() {
      return this.field5822.hashCode();
   }

   classRO(Object var1, Object var2) {
      this.field5821 = var1;
      this.field5822 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lro;Lro;)I")
   @ObfuscatedName("il")
   public static int method10139(classRO var0, classRO var1) {
      if (6150833583405228361L * var0.field5824 < 6150833583405228361L * var1.field5824) {
         return -1;
      } else {
         return 6150833583405228361L * var0.field5824 > 6150833583405228361L * var1.field5824 ? 1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   static void method10148(int var0) {
      try {
         classKU.field4033 = null;
         classOY.field5202 = null;
         classCQ.field1221 = null;
         classPE.field5234 = null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ro.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("az")
   public static int method10142(int var0, int var1, int var2) {
      try {
         return (int)Math.round(Math.atan2(var0, var1) * 2607.5945876176133) & 16383;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ro.az(" + 41);
      }
   }
}
