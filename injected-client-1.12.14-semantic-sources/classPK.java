import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pk")
public class classPK {
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field4848 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4849 = 5000;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4850 = 40000;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field4847 = 5;

   @ObfuscatedSignature(descriptor = "(Lut;III)V")
   @ObfuscatedName("ai")
   public static void method8766(DynamicArray var0, int var1, int var2, int var3) {
      try {
         if (null != var0 && var0.method11215((byte)15) > 1) {
            class461.method9338(var0, null, true, -928498657);
            if (class586.field6376 == var0.field6107) {
               class488.method10108(var0.method11207(2053374425), var0.method11215((byte)34), var1, var2);
            } else if (class586.field6377 == var0.field6107) {
               class488.method10110(DynamicArray.method11211(var0, (byte)-35), var0.method11215((byte)120), var1, var2);
            } else {
               class488.method10113(var0.method11214((byte)-26), var0.method11215((byte)75), var1, var2);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "pk.ai(" + ')');
      }
   }

   classPK() throws Throwable {
      throw new Error();
   }
}
