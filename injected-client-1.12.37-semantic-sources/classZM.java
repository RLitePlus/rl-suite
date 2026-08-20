import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zm")
public class classZM {
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field7226 = 128;
   @ObfuscatedName("az")
   static final int[] field7225 = new int[]{
      16777215,
      14942979,
      16747520,
      16772352,
      32806,
      2375822,
      7547266,
      16720268,
      11884176,
      5261772,
      10724259,
      13970688,
      15693351,
      16577588,
      494960,
      2208255,
      10178454,
      16756679,
      13722276,
      8105443,
      16751190,
      2543274,
      7591918,
      10246609,
      10021057,
      11894492,
      2894892,
      9699842,
      6371605,
      13680896,
      4882723,
      14504,
      8388736,
      14025328,
      10682978,
      4004472
   };
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field7227 = 13;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field7228 = 8;

   classZM() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Lxo;I)Ljl;")
   @ObfuscatedName("ae")
   public static classJL method14065(int var0, String var1, classXO var2, int var3) {
      classJL var4 = classEF.method3849(classJS.MESSAGE_PUBLIC, client.field795.field1535, (byte)67);
      classXY.method12971(var4.field3343, 0, (byte)-92);
      int var5 = 702114061 * var4.field3343.field6955;
      classXY.method12971(var4.field3343, var0, (byte)-76);
      String var6 = var1.toLowerCase();
      int var7 = 0;
      byte[] var8 = null;
      if (var6.startsWith(classKK.field3609)) {
         var7 = 0;
         var1 = var1.substring(classKK.field3609.length());
      } else if (var6.startsWith(classKK.field3802)) {
         var7 = 1;
         var1 = var1.substring(classKK.field3802.length());
      } else if (var6.startsWith(classKK.field3626)) {
         var7 = 2;
         var1 = var1.substring(classKK.field3626.length());
      } else if (var6.startsWith(classKK.field3804)) {
         var7 = 3;
         var1 = var1.substring(classKK.field3804.length());
      } else if (var6.startsWith(classKK.field3923)) {
         var7 = 4;
         var1 = var1.substring(classKK.field3923.length());
      } else if (var6.startsWith(classKK.field3807)) {
         var7 = 5;
         var1 = var1.substring(classKK.field3807.length());
      } else if (var6.startsWith(classKK.field3922)) {
         var7 = 6;
         var1 = var1.substring(classKK.field3922.length());
      } else if (var6.startsWith(classKK.field3747)) {
         var7 = 7;
         var1 = var1.substring(classKK.field3747.length());
      } else if (var6.startsWith(classKK.field3809)) {
         var7 = 8;
         var1 = var1.substring(classKK.field3809.length());
      } else if (var6.startsWith(classKK.field3896)) {
         var7 = 9;
         var1 = var1.substring(classKK.field3896.length());
      } else if (var6.startsWith(classKK.field3894)) {
         var7 = 10;
         var1 = var1.substring(classKK.field3894.length());
      } else if (var6.startsWith(classKK.field3812)) {
         var7 = 11;
         var1 = var1.substring(classKK.field3812.length());
      } else if (var6.startsWith(classKK.field3813)) {
         var7 = 12;
         var1 = var1.substring(classKK.field3813.length());
      } else if (var6.startsWith(classKK.field3814)) {
         byte var10 = 48;
         byte var11 = 87;
         int var12 = classKK.field3814.length();
         int var13 = 0;
         byte[] var14 = new byte[8];

         byte[] var9;
         while (true) {
            int var15 = var13 + var12;
            if (var15 >= var6.length()) {
               var9 = null;
               break;
            }

            char var16 = var6.charAt(var15);
            if (':' == var16) {
               if (0 == var13) {
                  var9 = null;
               } else {
                  byte[] var20 = new byte[var13];
                  System.arraycopy(var14, 0, var20, 0, var13);
                  var9 = var20;
               }
               break;
            }

            if (var14.length == var13) {
               var9 = null;
               break;
            }

            if (var16 >= '0' && var16 <= '9') {
               var16 = (char)(var16 - '0');
            } else {
               if (var16 < 'a' || var16 > 'z') {
                  var9 = null;
                  break;
               }

               var16 = (char)(var16 - 'W');
            }

            var14[var13++] = (byte)var16;
         }

         var8 = var9;
         if (null != var9) {
            var7 = var9.length + 12;
            var1 = var1.substring(classKK.field3814.length() + var9.length + 1);
         }
      }

      var6 = var1.toLowerCase();
      byte var18 = 0;
      if (var6.startsWith(classKK.field3815)) {
         var18 = 1;
         var1 = var1.substring(classKK.field3815.length());
      } else if (var6.startsWith(classKK.field3857)) {
         var18 = 2;
         var1 = var1.substring(classKK.field3857.length());
      } else if (var6.startsWith(classKK.field3632)) {
         var18 = 3;
         var1 = var1.substring(classKK.field3632.length());
      } else if (var6.startsWith(classKK.field3871)) {
         var18 = 4;
         var1 = var1.substring(classKK.field3871.length());
      } else if (var6.startsWith(classKK.field3819)) {
         var18 = 5;
         var1 = var1.substring(classKK.field3819.length());
      }

      classXY.method12971(var4.field3343, var7, (byte)-10);
      classXY.method12971(var4.field3343, var18, (byte)-59);
      if (var8 != null) {
         for (int var19 = 0; var19 < var8.length; var19++) {
            classXY.method12971(var4.field3343, var8[var19], (byte)-13);
         }
      }

      Menu.method12644(var4.field3343, var1, 1584111025);
      if (var0 == classKT.field4020.vmethod8((byte)1)) {
         classXY.method12971(var4.field3343, var3, (byte)-59);
      }

      classXY.method13022(var4.field3343, var4.field3343.field6955 * 702114061 - var5, 2121161360);
      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[I")
   @ObfuscatedName("ag")
   public static int[] method14066(byte[] var0) {
      if (null != var0 && var0.length != 0 && var0.length <= 8) {
         int[] var1 = new int[var0.length];

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] < 0 || var0[var2] >= field7225.length) {
               return null;
            }

            var1[var2] = field7225[var0[var2]];
         }

         return var1;
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[I")
   @ObfuscatedName("ab")
   public static int[] method14067(byte[] var0) {
      if (null != var0 && var0.length != 0 && var0.length <= 8) {
         int[] var1 = new int[var0.length];

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] < 0 || var0[var2] >= field7225.length) {
               return null;
            }

            var1[var2] = field7225[var0[var2]];
         }

         return var1;
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[I")
   @ObfuscatedName("as")
   public static int[] method14068(byte[] var0) {
      if (null != var0 && var0.length != 0 && var0.length <= 8) {
         int[] var1 = new int[var0.length];

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] < 0 || var0[var2] >= field7225.length) {
               return null;
            }

            var1[var2] = field7225[var0[var2]];
         }

         return var1;
      } else {
         return null;
      }
   }
}
