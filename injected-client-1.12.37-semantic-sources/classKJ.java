import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kj")
public class classKJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field3602 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3603 = 25;
   @ObfuscatedName("ae")
   public static int[] field3600 = new int[99];
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field3601 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final String field3604 = "[<>=!]+";
   @ObfuscatedName("af")
   public static final boolean[] field3599 = new boolean[]{
      true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false
   };
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ad")
   public static AbstractArchive field3605;

   static {
      int var0 = 0;

      for (int var1 = 0; var1 < 99; var1++) {
         int var2 = var1 + 1;
         int var3 = (int)(var2 + 300.0 * Math.pow(2.0, var2 / 7.0));
         var0 += var3;
         field3600[var1] = var0 / 4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;)Ljava/lang/String;")
   @ObfuscatedName("vf")
   public static String method6488(ScriptEvent var0) {
      if (var0 == null) {
         var0.method14135();
      }

      return var0.field7250;
   }

   classKJ() throws Throwable {
      throw new Error();
   }
}
