import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yc")
public class classYC implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field6966 = 255;
   @ObfuscatedName("az")
   final boolean field6965;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Ljava/util/Comparator;)V")
   @ObfuscatedName("po")
   public static void method13312(classRT var0, Comparator var1) {
      if (null == var0.field5841) {
         var0.field5841 = var1;
      } else if (var0.field5841 instanceof classRD) {
         ((classRD)var0.field5841).method9940(var1, 1072642345);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method13307(Object var1, Object var2) {
      return method13302(this, (classRR)var1, (classRR)var2, (byte)89);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyc;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ib")
   public static int method13308(classYC var0, Object var1, Object var2) {
      return var0 == null ? var0.method13307(var1, var1) : method13302(var0, (classRR)var1, (classRR)var2, (byte)49);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "yc.equals(" + ')');
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return method13302(this, (classRR)var1, (classRR)var2, (byte)42);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "yc.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method13309(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;)I")
   @ObfuscatedName("ae")
   int method13300(classRR var1, classRR var2) {
      return this.field6965 ? var1.vmethod562(var2, -30374874) : var2.vmethod562(var1, -30374874);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method13310(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;I)I")
   @ObfuscatedName("zy")
   public static int method13313(classOM var0, int var1) {
      if (var0 == null) {
         var0.method8573(var1);
      }

      return 1 != var1 && 3 != var1 ? var0.field4924 * 402876423 : -582306509 * var0.field4944;
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;)I")
   @ObfuscatedName("af")
   int method13301(classRR var1, classRR var2) {
      return this.field6965 ? var1.vmethod562(var2, -30374874) : var2.vmethod562(var1, -30374874);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;Ljava/lang/String;)I")
   @ObfuscatedName("to")
   public static int method13311(classMA var0, String var1) {
      if (var0 == null) {
         var0.method7484();
      }

      return var0.field4456.field4572.containsKey(var1) ? (Integer)var0.field4456.field4572.get(var1) : -1;
   }

   @ObfuscatedSignature(descriptor = "(Lyc;Lrr;Lrr;B)I")
   @ObfuscatedName("sf")
   public static int method13302(classYC var0, classRR var1, classRR var2, byte var3) {
      if (var0 == null) {
         return var0.method13306(var1, var1, var3);
      } else {
         try {
            return var0.field6965 ? var1.vmethod562(var2, -30374874) : var2.vmethod562(var1, -30374874);
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "yc.az(" + 41);
         }
      }
   }

   public classYC(boolean var1) {
      this.field6965 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;)I")
   @ObfuscatedName("ab")
   int method13303(classRR var1, classRR var2) {
      return this.field6965 ? var1.vmethod562(var2, -30374874) : var2.vmethod562(var1, -30374874);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;)I")
   @ObfuscatedName("ag")
   int method13304(classRR var1, classRR var2) {
      return this.field6965 ? var1.vmethod562(var2, -30374874) : var2.vmethod562(var1, -30374874);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;)I")
   @ObfuscatedName("ac")
   int method13305(classRR var1, classRR var2) {
      return this.field6965 ? var1.vmethod562(var2, -30374874) : var2.vmethod562(var1, -30374874);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;B)I")
   @ObfuscatedName("az")
   int method13306(classRR var1, classRR var2, byte var3) {
      try {
         return this.field6965 ? var1.vmethod562(var2, -30374874) : var2.vmethod562(var1, -30374874);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "yc.az(" + 41);
      }
   }
}
