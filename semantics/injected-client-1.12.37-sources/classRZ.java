import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rz")
public final class classRZ {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final long field5885 = 11745L;
   @ObfuscatedName("az")
   static final String[] field5884 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ar")
   static String method10344(int var0) {
      if (var0 >= 0 && var0 < 364868) {
         long var1 = (11745L + var0) * 86400000L;
         Calendar var3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
         var3.setTime(new Date(var1));
         int var4 = var3.get(5);
         int var5 = var3.get(2);
         int var6 = var3.get(1);
         return var4 + "-" + field5884[var5] + "-" + var6;
      } else {
         return "-";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxo;)Lrz;")
   @ObfuscatedName("aa")
   static classRZ method10336(classXO var0) {
      return new classRZ();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JIZZLrz;)Ljava/lang/String;")
   @ObfuscatedName("ao")
   static String method10337(long var0, int var2, boolean var3, boolean var4, classRZ var5) {
      boolean var6 = var0 < 0L;
      String var7 = Long.toString(var0);
      if (var6) {
         var7 = var7.substring(1);
      }

      String var9 = null;
      String var8;
      if (var2 <= 0) {
         var8 = var7;
      } else {
         while (var7.length() <= var2) {
            var7 = "0" + var7;
         }

         int var10 = var7.length() - var2;
         var8 = var7.substring(0, var10);
         String var11 = var7.substring(var10);
         String var12;
         if (!var4) {
            var12 = var11;
         } else {
            int var14 = var11.length();

            while (var14 > 0 && var11.charAt(var14 - 1) == '0') {
               var14--;
            }

            String var13 = var14 == 0 ? null : var11.substring(0, var14);
            var12 = var13;
         }

         var9 = var12;
      }

      if (var3) {
         StringBuilder var17 = new StringBuilder();
         int var18 = var8.length() % 3;
         if (0 == var18) {
            var18 = 3;
         }

         var17.append(var8, 0, var18);

         for (int var19 = var18; var19 < var8.length(); var19 += 3) {
            var17.append(",").append(var8, var19, 3 + var19);
         }

         String var15 = var17.toString();
         var8 = var15;
      }

      StringBuilder var16 = new StringBuilder();
      if (var6) {
         var16.append('-');
      }

      var16.append(var8);
      if (var9 != null) {
         var16.append(".").append(var9);
      }

      return var16.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JIZLrz;)Ljava/lang/String;")
   @ObfuscatedName("al")
   static String method10339(long var0, int var2, boolean var3, classRZ var4) {
      return classXW.method12950(var0, var2, false, var3, var4, (byte)10) + "%";
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JIZLrz;)Ljava/lang/String;")
   @ObfuscatedName("aj")
   static String method10340(long var0, int var2, boolean var3, classRZ var4) {
      return classXW.method12950(var0, var2, false, var3, var4, (byte)27) + "%";
   }

   classRZ() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JIIZLrz;)Ljava/lang/String;")
   @ObfuscatedName("aq")
   static String method10342(long var0, int var2, int var3, boolean var4, classRZ var5) {
      boolean var6 = var0 < 0L;
      long var7 = Math.abs(var0);
      if (Long.toString(var7).length() <= var2) {
         return Long.toString(var0);
      } else {
         long var9 = -1L;
         String var11 = "";
         if (var7 >= classRE.field5647) {
            long var12 = var7 / classRE.field5646;
            if (Long.toString(var12).length() <= var2) {
               var9 = classRE.field5646;
               var11 = "K";
            } else if (var7 >= classRE.field5651) {
               long var14 = var7 / classRE.field5649;
               if (Long.toString(var14).length() <= var2) {
                  var9 = classRE.field5649;
                  var11 = "M";
               } else if (var7 >= classRE.field5648) {
                  long var16 = var7 / classRE.field5650;
                  if (Long.toString(var16).length() <= var2) {
                     var9 = classRE.field5650;
                     var11 = "B";
                  }
               }
            }
         }

         if (-1L == var9) {
            return Long.toString(var0);
         } else {
            long var18 = var7;

            for (int var20 = 0; var20 < var3; var20++) {
               var18 *= 10L;
            }

            var18 /= var9;
            String var21 = classXW.method12950(var18, var3, false, var4, var5, (byte)20);
            return (var6 ? "-" : "") + var21 + var11;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JIIZLrz;)Ljava/lang/String;")
   @ObfuscatedName("ad")
   static String method10343(long var0, int var2, int var3, boolean var4, classRZ var5) {
      boolean var6 = var0 < 0L;
      long var7 = Math.abs(var0);
      if (Long.toString(var7).length() <= var2) {
         return Long.toString(var0);
      } else {
         long var9 = -1L;
         String var11 = "";
         if (var7 >= classRE.field5647) {
            long var12 = var7 / classRE.field5646;
            if (Long.toString(var12).length() <= var2) {
               var9 = classRE.field5646;
               var11 = "K";
            } else if (var7 >= classRE.field5651) {
               long var14 = var7 / classRE.field5649;
               if (Long.toString(var14).length() <= var2) {
                  var9 = classRE.field5649;
                  var11 = "M";
               } else if (var7 >= classRE.field5648) {
                  long var16 = var7 / classRE.field5650;
                  if (Long.toString(var16).length() <= var2) {
                     var9 = classRE.field5650;
                     var11 = "B";
                  }
               }
            }
         }

         if (-1L == var9) {
            return Long.toString(var0);
         } else {
            long var18 = var7;

            for (int var20 = 0; var20 < var3; var20++) {
               var18 *= 10L;
            }

            var18 /= var9;
            String var21 = classXW.method12950(var18, var3, false, var4, var5, (byte)74);
            return (var6 ? "-" : "") + var21 + var11;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ap")
   static String method10345(int var0) {
      if (var0 >= 0 && var0 < 364868) {
         long var1 = (11745L + var0) * 86400000L;
         Calendar var3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
         var3.setTime(new Date(var1));
         int var4 = var3.get(5);
         int var5 = var3.get(2);
         int var6 = var3.get(1);
         return var4 + "-" + field5884[var5] + "-" + var6;
      } else {
         return "-";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("au")
   static String method10346(int var0) {
      if (var0 >= 0 && var0 < -722215948) {
         long var1 = (11745L + var0) * 86400000L;
         Calendar var3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
         var3.setTime(new Date(var1));
         int var4 = var3.get(5);
         int var5 = var3.get(2);
         int var6 = var3.get(1);
         return var4 + "-" + field5884[var5] + "-" + var6;
      } else {
         return "-";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ai")
   static String method10347(int var0) {
      if (var0 >= 0 && var0 < 364868) {
         long var1 = (11745L + var0) * 86400000L;
         Calendar var3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
         var3.setTime(new Date(var1));
         int var4 = var3.get(5);
         int var5 = var3.get(2);
         int var6 = var3.get(1);
         return var4 + "-" + field5884[var5] + "-" + var6;
      } else {
         return "-";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("am")
   static String method10351(long var0) {
      return var0 < 10L ? "0" + var0 : Long.toString(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;)Lry;")
   @ObfuscatedName("aw")
   static classRY method10348(long var0, String var2) {
      classRY var3 = new classRY();
      var3.field5882 = var0 % 1000L * 1535572724674340763L;
      long var4 = var0 / 1000L;
      long var6 = var4 / 60L;
      long var8 = var6 / 60L;
      if (var2.equals("m")) {
         var3.field5880 = -8050594295617501823L * var6;
         var3.field5879 = var4 % 60L * -503644033987797831L;
      } else if (var2.equals("h")) {
         var3.field5881 = -8919200205680249099L * var8;
         var3.field5880 = var6 % 60L * -8050594295617501823L;
         var3.field5879 = -503644033987797831L * (var4 % 60L);
      } else if (var2.equals("d")) {
         var3.field5883 = var8 / 24L * -7447662746889974663L;
         var3.field5881 = -8919200205680249099L * (var8 % 24L);
         var3.field5880 = var6 % 60L * -8050594295617501823L;
         var3.field5879 = var4 % 60L * -503644033987797831L;
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;)Lry;")
   @ObfuscatedName("ak")
   static classRY method10349(long var0, String var2) {
      classRY var3 = new classRY();
      var3.field5882 = var0 % 1000L * 1535572724674340763L;
      long var4 = var0 / 1000L;
      long var6 = var4 / 60L;
      long var8 = var6 / 60L;
      if (var2.equals("m")) {
         var3.field5880 = -8050594295617501823L * var6;
         var3.field5879 = var4 % 60L * -503644033987797831L;
      } else if (var2.equals("h")) {
         var3.field5881 = -8919200205680249099L * var8;
         var3.field5880 = var6 % 60L * -8050594295617501823L;
         var3.field5879 = -503644033987797831L * (var4 % 60L);
      } else if (var2.equals("d")) {
         var3.field5883 = var8 / 24L * -7447662746889974663L;
         var3.field5881 = -8919200205680249099L * (var8 % 24L);
         var3.field5880 = var6 % 60L * -8050594295617501823L;
         var3.field5879 = var4 % 60L * -503644033987797831L;
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;)[Ljava/lang/Object;")
   @ObfuscatedName("ld")
   public static Object[] method10338(ScriptEvent var0) {
      return var0.field7251;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;Ljava/lang/String;Z)Ljava/lang/String;")
   @ObfuscatedName("av")
   static String method10350(classRY var0, String var1, boolean var2) {
      if (var0.field5883 * -3946776555521172023L >= 0L
         && var0.field5881 * 5030926867112396125L >= 0L
         && -5305962339389965695L * var0.field5880 >= 0L
         && var0.field5879 * 5393848908079016329L >= 0L
         && -6607959019370912109L * var0.field5882 >= 0L) {
         StringBuilder var3 = new StringBuilder();
         boolean var4 = false;
         if (var1.equals("d") && var0.field5883 * -3946776555521172023L > 0L) {
            var3.append(-3946776555521172023L * var0.field5883);
            var4 = true;
         }

         if (var1.equals("d") || var1.equals("h")) {
            if (var4) {
               var3.append(':').append(classGK.method5485(var0.field5881 * 5030926867112396125L));
            } else if (5030926867112396125L * var0.field5881 > 0L) {
               var3.append(5030926867112396125L * var0.field5881);
               var4 = true;
            }
         }

         if (var4) {
            var3.append(':').append(classGK.method5485(-5305962339389965695L * var0.field5880));
         } else {
            var3.append(var0.field5880 * -5305962339389965695L);
            var4 = true;
         }

         var3.append(':').append(classGK.method5485(var0.field5879 * 5393848908079016329L));
         if (var2) {
            var3.append('.').append(classGK.method5485(var0.field5882 * -6607959019370912109L / 10L));
         }

         return var3.toString();
      } else {
         return "-";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JIZLrz;)Ljava/lang/String;")
   @ObfuscatedName("ay")
   static String method10341(long var0, int var2, boolean var3, classRZ var4) {
      return classXW.method12950(var0, var2, false, var3, var4, (byte)-68) + "%";
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("at")
   static String method10352(long var0) {
      return var0 < 10L ? "0" + var0 : Long.toString(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("an")
   static String method10353(long var0) {
      return var0 < 10L ? "0" + var0 : Long.toString(var0);
   }
}
