import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
@ObfuscatedName("nn")
public @interface classNN {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)B")
   @ObfuscatedName("ot")
   static byte method7828(Buffer var0) {
      return var0.array[(var0.offset += 1741769013) * 2108391709 - 1];
   }
}
