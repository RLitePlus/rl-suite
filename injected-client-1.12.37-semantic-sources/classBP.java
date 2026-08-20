import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bp")
public abstract class classBP extends Node {
   @ObfuscatedName("az")
   int field522;

   @ObfuscatedSignature(descriptor = "(Lao;)I")
   @ObfuscatedName("ag")
   abstract int method1168(classAO var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   abstract void method1169();

   @ObfuscatedSignature(descriptor = "(Lao;)I")
   @ObfuscatedName("af")
   abstract int method1170(classAO var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   abstract void method1171();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   abstract void method1172();

   @ObfuscatedSignature(descriptor = "(Lao;)I")
   @ObfuscatedName("as")
   abstract int method1173(classAO var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;I)V")
   @ObfuscatedName("pu")
   public static void method1167(WorldMap var0, int var1) {
      if (var0 == null) {
         var0.method12468(var1, var1, var1, var1, var1);
      } else {
         if (var1 >= 1) {
            var0.field6702 = -1552585640 * var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;)V")
   @ObfuscatedName("sj")
   public static void method1166(classDJ var0) {
      if (var0 == null) {
         var0.method3365();
      }

      var0.field1534 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lao;)I")
   @ObfuscatedName("ac")
   abstract int method1174(classAO var1);

   @ObfuscatedSignature(descriptor = "(Lao;)I")
   @ObfuscatedName("ax")
   abstract int method1175(classAO var1);

   classBP() throws Throwable {
      throw new Error();
   }
}
