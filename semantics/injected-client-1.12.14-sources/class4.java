import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ae")
public final class class4 {
   @ObfuscatedSignature(descriptor = "Lul;")
   @ObfuscatedName("hw")
   static classUL field14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field12 = 37748736;
   @ObfuscatedName("pb")
   static int oculusOrbFocalPointY;

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/String;")
   @ObfuscatedName("mp")
   static final String formatItemStacks(int var0, byte var1) {
      try {
         String var2 = Integer.toString(var0);

         for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            if (var1 == 3) {
               throw new IllegalStateException();
            }

            var2 = var2.substring(0, var3) + classDF.field1346 + var2.substring(var3);
         }

         if (var2.length() > 9) {
            if (var1 == 3) {
               throw new IllegalStateException();
            } else {
               return " "
                  + class144.colorStartTag(65408, -1062524882)
                  + var2.substring(0, var2.length() - 8)
                  + Strings.field5031
                  + " "
                  + classDF.field1351
                  + var2
                  + classDF.field1349
                  + classDF.field1352;
            }
         } else if (var2.length() <= 6) {
            return " " + class144.colorStartTag(16776960, -552964105) + var2 + classDF.field1352;
         } else if (var1 == 3) {
            throw new IllegalStateException();
         } else {
            return " "
               + class144.colorStartTag(16777215, -253534593)
               + var2.substring(0, var2.length() - 4)
               + Strings.field5128
               + " "
               + classDF.field1351
               + var2
               + classDF.field1349
               + classDF.field1352;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ae.mp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Date;I)Z")
   @ObfuscatedName("ay")
   static boolean method74(Date var0, int var1) {
      try {
         Calendar var3 = Calendar.getInstance();
         var3.set(2, 0);
         var3.set(5, 1);
         var3.set(1, 1900);
         Date var2 = var3.getTime();
         return var0.after(var2);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ae.ay(" + ')');
      }
   }

   class4() throws Throwable {
      throw new Error();
   }
}
