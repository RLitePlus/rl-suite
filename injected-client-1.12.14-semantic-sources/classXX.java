import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xx")
public class classXX {
   @ObfuscatedName("av")
   public final int field6648;
   @ObfuscatedName("at")
   public Object field6647;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field6649 = 20;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method12741() {
      return super.hashCode();
   }

   public classXX(int var1, Object var2) {
      this.field6648 = var1 * 1073872853;
      this.field6647 = var2;
   }

   public classXX(int var1) {
      this.field6648 = var1 * 1073872853;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof classXX)) {
            return false;
         } else {
            classXX var2 = (classXX)var1;
            if (null == var2.field6647 && this.field6647 != null) {
               return false;
            } else {
               return this.field6647 == null && null != var2.field6647
                  ? false
                  : var2.field6648 * 575488381 == this.field6648 * 575488381 && var2.field6647.equals(this.field6647);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xx.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method12742(Object var1) {
      if (!(var1 instanceof classXX)) {
         return false;
      } else {
         classXX var2 = (classXX)var1;
         if (null == var2.field6647 && this.field6647 != null) {
            return false;
         } else {
            return this.field6647 == null && null != var2.field6647
               ? false
               : var2.field6648 * 575488381 == this.field6648 * 575488381 && var2.field6647.equals(this.field6647);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method12743(Object var1) {
      if (!(var1 instanceof classXX)) {
         return false;
      } else {
         classXX var2 = (classXX)var1;
         if (null == var2.field6647 && this.field6647 != null) {
            return false;
         } else {
            return this.field6647 == null && null != var2.field6647
               ? false
               : var2.field6648 * 575488381 == this.field6648 * 575488381 && var2.field6647.equals(this.field6647);
         }
      }
   }

   @Override
   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "xx.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method12744(Object var1) {
      if (!(var1 instanceof classXX)) {
         return false;
      } else {
         classXX var2 = (classXX)var1;
         if (null == var2.field6647 && this.field6647 != null) {
            return false;
         } else {
            return this.field6647 == null && null != var2.field6647
               ? false
               : var2.field6648 * 575488381 == this.field6648 * 1437278675 && var2.field6647.equals(this.field6647);
         }
      }
   }
}
