import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ek")
public class classEK extends classRD {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field1777 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field1778 = 3;
   @ObfuscatedName("az")
   final boolean field1776;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("cn")
   static IndexedSprite field1779;

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("ae")
   int method3904(Buddy var1, Buddy var2) {
      if (-438323549 * var1.field5669 != 0 && var2.field5669 * -760305529 != 0) {
         return this.field1776 ? 1145202131 * var1.field5670 - 1145202131 * var2.field5670 : 1145202131 * var2.field5670 - 1145202131 * var1.field5670;
      } else {
         return classRD.method9942(this, var1, var2, 1535978393);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;S)I")
   @ObfuscatedName("az")
   int method3905(Buddy var1, Buddy var2, short var3) {
      try {
         if (-760305529 * var1.field5669 != 0) {
            if (var3 <= 256) {
               throw new IllegalStateException();
            }

            if (var2.field5669 * -760305529 != 0) {
               if (var3 <= 256) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.field1776) {
                  if (var3 <= 256) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1145202131 * var1.field5670 - 1145202131 * var2.field5670;
               } else {
                  var10000 = 1145202131 * var2.field5670 - 1145202131 * var1.field5670;
               }

               return var10000;
            }
         }

         return classRD.method9942(this, var1, var2, 1476272604);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ek.az(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method3905((Buddy)var1, (Buddy)var2, (short)26972);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ek.compare(" + 41);
      }
   }

   public classEK(boolean var1) {
      this.field1776 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method3907(Object var1, Object var2) {
      return this.method3905((Buddy)var1, (Buddy)var2, (short)28438);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lek;Lri;Lri;)I")
   @ObfuscatedName("wk")
   public static int method3906(classEK var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         return var0.method3904(var1, var1);
      } else if (-760305529 * var1.field5669 != 0 && var2.field5669 * -760305529 != 0) {
         return var0.field1776 ? 1145202131 * var1.field5670 - 1145202131 * var2.field5670 : 1145202131 * var2.field5670 - 1145202131 * var1.field5670;
      } else {
         return classRD.method9942(var0, var1, var2, 1841521752);
      }
   }

   @ObfuscatedSignature(descriptor = "([JB)Lte;")
   @ObfuscatedName("ay")
   static classTE method3909(long[] var0, byte var1) {
      try {
         classTE var2 = new classTE(classYY.field7115, true);
         var2.field6127 = var0;
         var2.field6131 = var0.length * -1063196331;
         var2.field6123 = var0.length * 404453943;
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ek.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("sn")
   public static void method3910(classLH var0, Clipboard var1) {
      if (var0 == null) {
         var0.method6878();
      } else {
         if (var0.method7049(2012791869)) {
            var0.method6946(var1, -887645341);
            classLH.method6876(var0, 455461300);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)I")
   @ObfuscatedName("aj")
   public static int method3908(int var0, int var1, int var2, byte var3) {
      try {
         if (var1 < var0) {
            throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
         } else {
            return Math.max(var0, Math.min(var2, var1));
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ek.aj(" + 41);
      }
   }
}
