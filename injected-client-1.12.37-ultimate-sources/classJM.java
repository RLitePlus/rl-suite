import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jm")
@classZY
public final class classJM {
   @ObfuscatedName("ae")
   static final HashMap field3344 = new HashMap();
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final long field3347 = 86400000L;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3346 = 11745;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field3345 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final String field3348 = "n";

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;")
   @ObfuscatedName("ae")
   static TimeZone method6393(String var0) {
      synchronized (field3344) {
         TimeZone var2 = (TimeZone)field3344.get(var0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(var0);
            field3344.put(var0, var2);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;")
   @ObfuscatedName("az")
   static TimeZone method6394(String var0, int var1) {
      try {
         synchronized (field3344) {
            TimeZone var3 = (TimeZone)field3344.get(var0);
            if (var3 == null) {
               if (var1 <= -601431579) {
                  throw new IllegalStateException();
               }

               var3 = TimeZone.getTimeZone(var0);
               field3344.put(var0, var3);
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "jm.az(" + ')');
      }
   }

   static {
      Calendar.getInstance(method6394("Europe/London", 856429648));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;")
   @ObfuscatedName("af")
   static TimeZone method6395(String var0) {
      synchronized (field3344) {
         TimeZone var2 = (TimeZone)field3344.get(var0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(var0);
            field3344.put(var0, var2);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/String;I)Lte;")
   @ObfuscatedName("cz")
   static classTE method6398(Object var0, String var1, int var2) {
      try {
         if (var0 == null) {
            throw new RuntimeException();
         } else {
            return (classTE)var0;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "jm.cz(" + ')');
      }
   }

   classJM() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;")
   @ObfuscatedName("ag")
   static TimeZone method6396(String var0) {
      synchronized (field3344) {
         TimeZone var2 = (TimeZone)field3344.get(var0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(var0);
            field3344.put(var0, var2);
         }

         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;")
   @ObfuscatedName("ab")
   static TimeZone method6397(String var0) {
      synchronized (field3344) {
         TimeZone var2 = (TimeZone)field3344.get(var0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(var0);
            field3344.put(var0, var2);
         }

         return var2;
      }
   }
}
