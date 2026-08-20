import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aaz")
public class classAAZ {
   @ObfuscatedName("af")
   public Object field120;
   @ObfuscatedName("az")
   public final int field119;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ley;)Ljava/lang/String;")
   @ObfuscatedName("ad")
   public static String method304(classEY var0) {
      return var0 == null ? var0.method4118() : var0.field1981.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaz;Ljava/lang/Object;)Z")
   @ObfuscatedName("tr")
   public static boolean method302(classAAZ var0, Object var1) {
      if (var0 == null) {
         var0.equals(var1);
      }

      if (!(var1 instanceof classAAZ)) {
         return false;
      } else {
         classAAZ var2 = (classAAZ)var1;
         if (null == var2.field120 && null != var0.field120) {
            return false;
         } else {
            return var0.field120 == null && null != var2.field120
               ? false
               : var0.field119 * -1072901121 == var2.field119 * -1072901121 && var2.field120.equals(var0.field120);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaz;)I")
   @ObfuscatedName("iy")
   public static int method298(classAAZ var0) {
      if (var0 == null) {
         var0.hashCode();
      }

      return var0.hashCode();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afs")
   public int method299() {
      return super.hashCode();
   }

   @Override
   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "aaz.hashCode(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof classAAZ)) {
            return false;
         } else {
            classAAZ var2 = (classAAZ)var1;
            if (null == var2.field120 && null != this.field120) {
               return false;
            } else {
               return this.field120 == null && null != var2.field120
                  ? false
                  : this.field119 * -1072901121 == var2.field119 * -1072901121 && var2.field120.equals(this.field120);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "aaz.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaz;Ljava/lang/Object;)Z")
   @ObfuscatedName("dc")
   public static boolean method303(classAAZ var0, Object var1) {
      if (var0 == null) {
         var0.method300();
      }

      if (!(var1 instanceof classAAZ)) {
         return false;
      } else {
         classAAZ var2 = (classAAZ)var1;
         if (null == var2.field120 && null != var0.field120) {
            return false;
         } else {
            return var0.field120 == null && null != var2.field120
               ? false
               : var0.field119 * -1072901121 == var2.field119 * 1688097432 && var2.field120.equals(var0.field120);
         }
      }
   }

   public classAAZ(int var1, Object var2) {
      this.field119 = 1885547519 * var1;
      this.field120 = var2;
   }

   public classAAZ(int var1) {
      this.field119 = 1885547519 * var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method300() {
      return super.hashCode();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afe")
   public int method301() {
      return super.hashCode();
   }
}
