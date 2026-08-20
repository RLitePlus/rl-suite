import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xr")
public interface classXR {
   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/Object;")
   @ObfuscatedName("ag")
   Object vmethod411(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(Ljh;III)Lku;")
   @ObfuscatedName("oc")
   static BoundaryObject method12494(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.getBoundaryObject(var1, var1, var1);
      } else {
         var2 += var0.field3014;
         var3 += var0.field3014;
         int var4 = var0.method5690(var1, var2, var3);
         return var0.method5737(var4) ? var0.field2903[var4] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("au")
   Object vmethod412(int var1);

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("az")
   Object vmethod413(int var1);
}
