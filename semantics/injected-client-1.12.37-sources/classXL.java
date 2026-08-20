import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xl")
public class classXL {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;III)Z")
   @ObfuscatedName("bi")
   public static boolean method12838(CollisionMap var0, int var1, int var2, int var3) {
      return 0 != (var0.field2550[var1][var2] & var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnv;)V")
   @ObfuscatedName("pg")
   public static void method12839(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method8165();
      }

      var0.method8151();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lxz;I)Lxz;")
   @ObfuscatedName("ab")
   public static classXZ method12835(classXZ[] var0, int var1) {
      classXZ[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         classXZ var4 = var2[var3];
         if (var1 == var4.vmethod8((byte)1)) {
            return var4;
         }
      }

      return null;
   }

   static {
      new HashMap();
   }

   classXL() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lxz;I)Lxz;")
   @ObfuscatedName("ae")
   public static classXZ method12836(classXZ[] var0, int var1) {
      classXZ[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         classXZ var4 = var2[var3];
         if (var1 == var4.vmethod8((byte)1)) {
            return var4;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lxz;I)Lxz;")
   @ObfuscatedName("af")
   public static classXZ method12837(classXZ[] var0, int var1) {
      classXZ[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         classXZ var4 = var2[var3];
         if (var1 == var4.vmethod8((byte)1)) {
            return var4;
         }
      }

      return null;
   }
}
