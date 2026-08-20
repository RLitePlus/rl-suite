import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ae")
public interface classAE {
   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("ab")
   classXY vmethod18(classXY var1);

   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("ae")
   classXY vmethod19(classXY var1);

   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("az")
   classXY vmethod20(classXY var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgw;)I")
   @ObfuscatedName("ln")
   static int method333(classGW var0) {
      return var0 == null ? var0.method5819() : var0.field2725 * 645983023 * var0.field2726 * 2032697513;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Lex;)V")
   @ObfuscatedName("mg")
   static void method334(Scene var0, classEX var1) {
      if (var1 != var0.field2052) {
         var0.field2052 = var1;
         Scene.method4304(Scene.field2072, Scene.field2130, Scene.field2126, Scene.field2135, Scene.field2131);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("ag")
   classXY vmethod21(classXY var1);

   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("as")
   classXY vmethod22(classXY var1);
}
