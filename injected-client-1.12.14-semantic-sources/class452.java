import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ri")
public class class452 {
   @ObfuscatedName("an")
   static int[] field5527;
   @ObfuscatedName("at")
   static char[] field5529;
   @ObfuscatedName("av")
   static char[] field5526 = new char[64];
   @ObfuscatedName("fh")
   static boolean field5534;
   @ObfuscatedName("ag")
   static char[] field5528;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field5531 = 0;
   @ObfuscatedName("ax")
   static File cacheDir;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field5532 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field5530 = 1076101519;

   class452() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("at")
   public static String method9467(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(field5526[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(field5526[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(field5526[(var6 & 15) << 2 | var7 >>> 6]).append(field5526[var7 & 63]);
            } else {
               var3.append(field5526[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(field5526[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   static {
      for (int var0 = 0; var0 < 26; var0++) {
         field5526[var0] = (char)(65 + var0);
      }

      for (int var2 = 26; var2 < 52; var2++) {
         field5526[var2] = (char)(97 + var2 - 26);
      }

      for (int var3 = 52; var3 < 62; var3++) {
         field5526[var3] = (char)(var3 + 48 - 52);
      }

      field5526[62] = '+';
      field5526[63] = '/';
      field5529 = new char[64];

      for (int var4 = 0; var4 < 26; var4++) {
         field5529[var4] = (char)(var4 + 65);
      }

      for (int var5 = 26; var5 < 52; var5++) {
         field5529[var5] = (char)(var5 + 97 - 26);
      }

      for (int var6 = 52; var6 < 62; var6++) {
         field5529[var6] = (char)(var6 + 48 - 52);
      }

      field5529[62] = '*';
      field5529[63] = '-';
      field5528 = new char[64];

      for (int var7 = 0; var7 < 26; var7++) {
         field5528[var7] = (char)(var7 + 65);
      }

      for (int var8 = 26; var8 < 52; var8++) {
         field5528[var8] = (char)(97 + var8 - 26);
      }

      for (int var9 = 52; var9 < 62; var9++) {
         field5528[var9] = (char)(48 + var9 - 52);
      }

      field5528[62] = '-';
      field5528[63] = '_';
      field5527 = new int[128];

      for (int var10 = 0; var10 < field5527.length; var10++) {
         field5527[var10] = -1;
      }

      for (int var11 = 65; var11 <= 90; var11++) {
         field5527[var11] = var11 - 65;
      }

      for (int var12 = 97; var12 <= 122; var12++) {
         field5527[var12] = var12 - 97 + 26;
      }

      for (int var13 = 48; var13 <= 57; var13++) {
         field5527[var13] = var13 - 48 + 52;
      }

      int[] var14 = field5527;
      field5527[43] = 62;
      var14[42] = 62;
      int[] var1 = field5527;
      field5527[47] = 63;
      var1[45] = 63;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public static String method9468(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 1068144687;
         var3.append(field5526[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 705036896;
            var3.append(field5526[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & -1852382693;
               var3.append(field5526[(var6 & 15) << 2 | var7 >>> 6]).append(field5526[var7 & 63]);
            } else {
               var3.append(field5526[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(field5526[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("an")
   public static String method9469(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & -701705647;
         var3.append(field5526[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(field5526[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(field5526[(var6 & 15) << 2 | var7 >>> 6]).append(field5526[var7 & -432746731]);
            } else {
               var3.append(field5526[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(field5526[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   @ObfuscatedSignature(descriptor = "([Lof;IIIIIIZI)V")
   @ObfuscatedName("mj")
   static void resizeInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
      try {
         for (int var9 = var1; var9 <= var2; var9++) {
            Widget var10 = var0[var9];
            if (null != var10 && 794900977 * var10.parentId == var3) {
               if (var8 >= -1867693517) {
                  return;
               }

               if (1865628485 * var10.field4451 == var4) {
                  class70.alignWidgetSize(var10, var5, var6, var7, 1895812781);
                  Projectile.alignWidgetPosition(var10, var5, var6, -1844377419);
                  if (var10.scrollX * 1068149169 > -111672215 * var10.scrollWidth - -1946208531 * var10.width) {
                     if (var8 >= -1867693517) {
                        throw new IllegalStateException();
                     }

                     var10.scrollX = var10.scrollWidth * -1481704391 - var10.width * -1014270979;
                  }

                  if (1068149169 * var10.scrollX < 0) {
                     var10.scrollX = 0;
                  }

                  if (-497311503 * var10.scrollY > -1963554889 * var10.scrollHeight - -905446999 * var10.height) {
                     if (var8 >= -1867693517) {
                        throw new IllegalStateException();
                     }

                     var10.scrollY = var10.scrollHeight * -50253017 - var10.height * 351495225;
                  }

                  if (-497311503 * var10.scrollY < 0) {
                     if (var8 >= -1867693517) {
                        return;
                     }

                     var10.scrollY = 0;
                  }

                  if (0 == 928687775 * var10.type) {
                     class339.revalidateWidgetScroll(var0, var10, var7, -295896145);
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "ri.mj(" + ')');
      }
   }
}
