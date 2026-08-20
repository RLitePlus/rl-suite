import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jd")
public class class237 {
   @ObfuscatedName("ae")
   public float[] field2822;
   @ObfuscatedName("an")
   public String field2828;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2823 = 2;
   @ObfuscatedName("aj")
   public int field2819;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2824 = 1;
   @ObfuscatedName("ak")
   public int field2820;
   @ObfuscatedName("aw")
   public int field2821;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2825 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   public static final int field2826 = 49;
   @ObfuscatedName("ah")
   static java.awt.Font fontHelvetica13;

   class237(class236 var1) {
      this.this$0 = var1;
      this.field2822 = new float[4];
      this.field2819 = 72760971;
      this.field2820 = -33771755;
      this.field2821 = 0;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("av")
   public static int method5406(int var0, int var1, int var2) {
      try {
         int var3 = 1;

         while (var1 > 1) {
            if (var2 >= -2117047939) {
               throw new IllegalStateException();
            }

            if (0 != (var1 & 1)) {
               if (var2 >= -2117047939) {
                  throw new IllegalStateException();
               }

               var3 *= var0;
            }

            var0 *= var0;
            var1 >>= 1;
         }

         if (var1 != 1) {
            return var3;
         } else if (var2 >= -2117047939) {
            throw new IllegalStateException();
         } else {
            return var0 * var3;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "jd.av(" + 41);
      }
   }
}
