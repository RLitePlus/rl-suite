import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("du")
public class classDU implements Callable {
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   public static final int field1632 = 51;
   @ObfuscatedName("bw")
   static int field1633;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1631 = 22;
   @ObfuscatedName("al")
   static long[] field1634;

   @ObfuscatedSignature(descriptor = "(IIIIIII)I")
   @ObfuscatedName("az")
   public static int method3604(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (1 == (var5 & 1)) {
            if (var6 == -843196892) {
               throw new IllegalStateException();
            }

            int var7 = var3;
            var3 = var4;
            var4 = var7;
         }

         var2 &= 3;
         if (var2 == 0) {
            if (var6 == -843196892) {
               throw new IllegalStateException();
            } else {
               return var0;
            }
         } else if (1 == var2) {
            if (var6 == -843196892) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "du.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("as")
   static SecureRandom method3605() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("az")
   public Object method3608() {
      return classGP.method5547((byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("ab")
   static SecureRandom method3606() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("ag")
   static SecureRandom method3607() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @Override
   public Object call() {
      try {
         return classGP.method5547((byte)1);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "du.call(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("afp")
   protected static final int method3609(byte var0) {
      try {
         return classTQ.field6198.method10816(1732339090);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "du.afp(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;)Ljava/io/OutputStream;")
   @ObfuscatedName("lp")
   public static OutputStream method3610(classQC var0) throws IOException {
      return var0.val$tlsClientProtocol.getOutputStream();
   }

   classDU() {
   }
}
