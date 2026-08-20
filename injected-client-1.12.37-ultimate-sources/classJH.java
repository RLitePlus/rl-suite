import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jh")
public final class classJH {
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field3155 = 9;
   @ObfuscatedName("af")
   static long field3156;
   @ObfuscatedName("az")
   static long field3157;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field3154 = 61;
   @ObfuscatedName("bs")
   static String field3158;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field3153 = 6;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lha;)V")
   @ObfuscatedName("hi")
   public static void method6370(classHA var0) {
      if (var0 == null) {
         var0.method5960();
      }

      var0.field2758 = (short[][][])null;
      var0.field2759 = (short[][][])null;
      var0.field2757 = (byte[][][])null;
      var0.field2756 = (byte[][][])null;
      var0.field2760 = (classHZ[][][][])null;
      var0.field2748 = false;
      var0.field2749 = false;
   }

   classJH() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("af")
   public static final synchronized long method6368() {
      long var0 = System.currentTimeMillis();
      if (var0 < -3314051952393191505L * field3157) {
         field3156 = field3156 + (field3157 * -3314051952393191505L - var0) * -5842852769318758503L;
      }

      field3157 = 6736306076594779983L * var0;
      return -8691437873563546455L * field3156 + var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ae")
   public static final synchronized long method6369() {
      long var0 = System.currentTimeMillis();
      if (var0 < -3314051952393191505L * field3157) {
         field3156 = field3156 + (field3157 * -3314051952393191505L - var0) * -5842852769318758503L;
      }

      field3157 = 6736306076594779983L * var0;
      return -8691437873563546455L * field3156 + var0;
   }
}
