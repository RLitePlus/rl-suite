import net.runelite.api.ChatPlayer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ri")
public class Buddy extends User implements ChatPlayer {
   @ObfuscatedName("as")
   public int field5670;
   @ObfuscatedName("ax")
   public int field5671;
   @ObfuscatedName("ag")
   public int field5669 = -849976631;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field5672 = 40;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bg")
   public int method9970(int var1) {
      try {
         return -760305529 * this.field5669;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ri.bg(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("oc")
   public int method9978() {
      return this.field5671 * 1234122453;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqs;)I")
   @ObfuscatedName("xc")
   public static int method9977(classQS var0) {
      return var0.field5614 * -1002575287;
   }

   Buddy() {
   }

   @ObfuscatedSignature(descriptor = "(Lri;I)Z")
   @ObfuscatedName("vc")
   public static boolean method9973(Buddy var0, int var1) {
      if (var0 == null) {
         return var0.method9976(var1);
      } else {
         try {
            boolean var10000;
            if (var0.field5669 * -760305529 > 0) {
               if (var1 >= -2021751741) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "ri.bj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;IIB)V")
   @ObfuscatedName("ln")
   public static void method9966(Buddy var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method9969(var1, var1, var3);
      } else {
         try {
            var0.field5669 = var1 * 849976631;
            var0.field5670 = 282868315 * var2;
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "ri.bt(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bk")
   void method9967(int var1, int var2) {
      this.field5669 = var1 * 849976631;
      this.field5670 = 282868315 * var2;
   }

   public int getWorld() {
      return this.field5669 * -760305529;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bo")
   void method9968(int var1, int var2) {
      this.field5669 = var1 * 849976631;
      this.field5670 = 282868315 * var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lri;)Z")
   @ObfuscatedName("sp")
   public static boolean method9974(Buddy var0) {
      return var0.field5669 * -714129562 > 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   public int method9971() {
      return -760305529 * this.field5669;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ba")
   public int method9972() {
      return -1921188773 * this.field5669;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bb")
   public boolean method9975() {
      return this.field5669 * -760305529 > 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bj")
   public boolean method9976(int var1) {
      try {
         boolean var10000;
         if (this.field5670 * -760305529 > 0) {
            if (var1 >= -2021751741) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ri.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("bt")
   void method9969(int var1, int var2, byte var3) {
      try {
         this.field5669 = var1 * 849976631;
         this.field5670 = 282868315 * var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ri.bt(" + ')');
      }
   }
}
