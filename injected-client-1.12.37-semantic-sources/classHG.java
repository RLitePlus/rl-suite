import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hg")
public class classHG {
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   public static final int field2794 = 74;
   @ObfuscatedName("af")
   int field2792;
   @ObfuscatedName("ae")
   int field2790;
   @ObfuscatedName("ab")
   int field2791;
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   public static final int field2793 = 73;
   @ObfuscatedName("az")
   int field2789 = 1187461017;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method6008(int var0) {
      try {
         EvictingDualNodeHashTable.method6431(HealthBarDefinition.field5475);
         EvictingDualNodeHashTable.method6431(HealthBarDefinition.field5476);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "hg.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("gw")
   static final void method6011(byte var0) {
      try {
         for (Message var2 : classCN.field1174) {
            var2.method1484(-425903031);
         }

         if (null != classIB.field2935) {
            if (var0 == 0) {
               throw new IllegalStateException();
            }

            FriendsChat.method10327(classIB.field2935, 853246097);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hg.gw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)I")
   @ObfuscatedName("av")
   static final int method6010(int var0, int var1, int var2, byte var3) {
      try {
         if (var2 > 179) {
            var1 /= 2;
         }

         if (var2 > 192) {
            var1 /= 2;
         }

         if (var2 > 217) {
            if (var3 != 2) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 243) {
            if (var3 != 2) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         return var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "hg.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("af")
   public static void method6009(byte var0) {
      try {
         classMT.field4581.clear();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "hg.af(" + ')');
      }
   }

   classHG() {
      this.field2792 = 0;
      this.field2790 = -548323909;
      this.field2791 = 0;
   }
}
