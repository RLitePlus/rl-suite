import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@ObfuscatedName("rl8")
public @interface rl8 {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgi;IIILgg;Lgc;Z[I[I)I")
   @ObfuscatedName("yh")
   static int method10124(classGI var0, int var1, int var2, int var3, classGG var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
      return var0.method5445(var1, var2, var3, var4, var5, var6, var7, var8, var0.field2594[0], -695297447);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltt;C)I")
   @ObfuscatedName("ss")
   static int method10125(classTT var0, char var1) {
      if (var0 == null) {
         var0.method11158(var1);
      }

      return var0.method11157(var1, 1978640149) ? var0.field6229[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dr")
   int method10126();
}
