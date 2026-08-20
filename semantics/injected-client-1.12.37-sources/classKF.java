import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kf")
public class classKF {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3569 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3568 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final byte field3566 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field3570 = 12;
   @ObfuscatedSignature(descriptor = "Ldm;")
   @ObfuscatedName("kw")
   static classDM field3571;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field3567 = 2;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;)Ljava/lang/String;")
   @ObfuscatedName("hr")
   public static String method6471(classMA var0) {
      return var0.field4456.field4570;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrq;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("sn")
   public static int method6469(classRQ var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method10163(var1);
      }

      return var0.method10158((classRO)var1, (classRO)var2, 1766974101);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lid;J)V")
   @ObfuscatedName("vr")
   public static void method6470(classID var0, long var1) {
      if (var0 == null) {
         var0.method6165();
      }

      classJQ var3 = (classJQ)var0.field2945.method13595(var1);
      var0.method6152(var3);
   }

   classKF() throws Throwable {
      throw new Error();
   }
}
