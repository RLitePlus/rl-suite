import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lf")
public class classLF {
   @ObfuscatedSignature(descriptor = "Llr;")
   @ObfuscatedName("az")
   static classLR field4133;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4127 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field4128 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final String field4132 = "main_file_cache.dat2";
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   public static final int field4129 = 512;
   @ToRemove(unused = "true")
   @ObfuscatedName("ci")
   public static final int field4130 = -1;
   @ObfuscatedName("ne")
   static int field4131;

   classLF() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(ZZI)Lyz;")
   @ObfuscatedName("ab")
   static classYZ method6779(boolean var0, boolean var1, int var2) {
      try {
         classYZ var10000;
         if (var0) {
            if (var1) {
               if (var2 <= 26835265) {
                  throw new IllegalStateException();
               }

               var10000 = classQN.field5573;
            } else {
               var10000 = classEK.field1779;
            }
         } else if (var1) {
            if (var2 <= 26835265) {
               throw new IllegalStateException();
            }

            var10000 = classHC.field2768;
         } else {
            var10000 = classCK.field778;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lf.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ac")
   static void method6780(classXY var0, int var1) {
      try {
         while (true) {
            int var2 = classXY.method13047(var0, 170180413);
            if (var2 == 0) {
               if (var1 <= 188513080) {
                  throw new IllegalStateException();
               }
            } else {
               if (1 != var2) {
                  if (var2 > 49) {
                     continue;
                  }

                  if (var1 <= 188513080) {
                     throw new IllegalStateException();
                  }

                  var0.method13050((byte)16);
                  continue;
               }

               if (var1 <= 188513080) {
                  throw new IllegalStateException();
               }

               classXY.method13039(var0, -346779531);
            }

            return;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lf.ac(" + ')');
      }
   }
}
