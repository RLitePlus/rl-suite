import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
@ObfuscatedName("zy")
public @interface classZY {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;)I")
   @ObfuscatedName("ja")
   static int method14236(classKQ var0) {
      return -1218877699 * var0.field3997;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;I)V")
   @ObfuscatedName("rw")
   static void method14237(WorldEntity var0, int var1) {
      if (var0 == null) {
         var0.method10601();
      }

      var0.field6013 = -1259548253 * var1;
   }
}
