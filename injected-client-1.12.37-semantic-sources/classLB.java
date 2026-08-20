import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lb")
public class classLB {
   @ObfuscatedName("af")
   public static int[] field4090;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field4086 = 1;
   @ObfuscatedName("ae")
   static int[] field4085 = new int[32];
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field4087 = 76;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field4088 = 95;
   @ObfuscatedSignature(descriptor = "Luq;")
   @ObfuscatedName("bl")
   static classUQ field4089;
   @ObfuscatedName("az")
   public static int[] field4091;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvh;II)I")
   @ObfuscatedName("ho")
   public static int method6661(classVH var0, int var1, int var2) {
      return var0.field6506[var1][var2];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public static int method6658(int var0) {
      VarbitComposition var1 = classOL.method8510(var0, (short)3592);
      int var2 = -1681019861 * var1.field5420;
      int var3 = 2041941406 * var1.field5419;
      int var4 = -1973331921 * var1.field5421;
      int var5 = field4085[var4 - var3];
      return field4090[var2] >> var3 & var5;
   }

   static {
      byte var0 = 2;

      for (int var1 = 0; var1 < 32; var1++) {
         field4085[var1] = var0 - 1;
         var0 += var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ad")
   public static String method6662(String var0, int var1) {
      try {
         StringBuilder var2 = new StringBuilder(var0.length());
         int var3 = 0;
         int var4 = -1;

         for (int var5 = 0; var5 < var0.length(); var5++) {
            char var6 = var0.charAt(var5);
            if (var6 == '<') {
               if (var1 == 65535) {
                  throw new IllegalStateException();
               }

               var2.append(var0.substring(var3, var5));
               var4 = var5;
            } else if (var6 == '>') {
               if (var1 == 65535) {
                  throw new IllegalStateException();
               }

               if (-1 != var4) {
                  if (var1 == 65535) {
                     throw new IllegalStateException();
                  }

                  String var7 = var0.substring(1 + var4, var5);
                  var4 = -1;
                  if (var7.equals("lt")) {
                     if (var1 == 65535) {
                        throw new IllegalStateException();
                     }

                     var2.append("<");
                  } else if (var7.equals("gt")) {
                     if (var1 == 65535) {
                        throw new IllegalStateException();
                     }

                     var2.append(">");
                  } else if (var7.equals("at")) {
                     if (var1 == 65535) {
                        throw new IllegalStateException();
                     }

                     var2.append("@");
                  } else if (var7.equals("br") || var7.equals("n")) {
                     var2.append("\n");
                  }

                  var3 = var5 + 1;
               }
            }
         }

         if (var3 < var0.length()) {
            var2.append(var0.substring(var3, var0.length()));
         }

         return var2.toString();
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "lb.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public static int method6659(int var0) {
      VarbitComposition var1 = classOL.method8510(var0, (short)-5222);
      int var2 = -1681019861 * var1.field5420;
      int var3 = -526564793 * var1.field5419;
      int var4 = 2095283109 * var1.field5421;
      int var5 = field4085[var4 - var3];
      return field4090[var2] >> var3 & var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   public static void method6660(int var0, int var1) {
      VarbitComposition var2 = classOL.method8510(var0, (short)-3573);
      int var3 = -1681019861 * var2.field5420;
      int var4 = -526564793 * var2.field5419;
      int var5 = var2.field5421 * 2095283109;
      int var6 = field4085[var5 - var4];
      if (var1 < 0 || var1 > var6) {
         var1 = 0;
      }

      var6 <<= var4;
      field4090[var3] = field4090[var3] & ~var6 | var1 << var4 & var6;
   }

   classLB() throws Throwable {
      throw new Error();
   }
}
