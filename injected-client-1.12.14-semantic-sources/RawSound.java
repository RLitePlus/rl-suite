import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dq")
public class RawSound extends AbstractSound {
   @ObfuscatedName("aj")
   boolean field1467 = false;
   @ObfuscatedName("ag")
   public int start;
   @ObfuscatedName("av")
   public int sampleRate;
   @ObfuscatedName("at")
   public short[] samples;
   @ObfuscatedName("an")
   int end;
   @ObfuscatedName("ae")
   public boolean field1471;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkm;II)V")
   @ObfuscatedName("ke")
   public static void method3415(classKM var0, int var1, int var2) {
      if (var0 == null) {
         var0.method6471(var1);
      }

      var0.field3369 = -282818888 * var1;
      var0.field3370 = var2 * -1752403085;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("av")
   boolean method3413() {
      return this.field1467;
   }

   RawSound(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
      this.start = var1;
      this.samples = var2;
      this.sampleRate = var3;
      this.end = var4;
      this.field1471 = var5;
      this.field1467 = var6;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("at")
   boolean method3414() {
      return this.field1467;
   }
}
