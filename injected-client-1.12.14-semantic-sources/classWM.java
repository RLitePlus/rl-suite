import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wm")
public class classWM {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[III)V")
   @ObfuscatedName("bp")
   public static void method11777(long[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = Long.MAX_VALUE == var6 ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < (var10 & var9) + var6) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               int var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         class341.method7852(var0, var1, var2, var5 - 1, 2020833858);
         class341.method7852(var0, var1, 1 + var5, var3, 864194134);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[III)V")
   @ObfuscatedName("af")
   public static void method11764(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         WorldMapID.quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1, 308630169);
         WorldMapID.quicksortStringsWithCorrespondingIntegers(var0, var1, 1 + var5, var3, 585806084);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltx;Ljavax/net/ssl/HttpsURLConnection;)V")
   @ObfuscatedName("iy")
   public static void method11761(HttpHeaders var0, HttpsURLConnection var1) {
      for (Entry var3 : var0.acceptHeaderValues.entrySet()) {
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SII)V")
   @ObfuscatedName("ac")
   static void method11757(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class387.sortItemsByName(var0, var1, var2, var5 - 1, (byte)-20);
         class387.sortItemsByName(var0, var1, 1 + var5, var3, (byte)-112);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SII)V")
   @ObfuscatedName("ab")
   static void method11758(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class387.sortItemsByName(var0, var1, var2, var5 - 1, (byte)-20);
         class387.sortItemsByName(var0, var1, 1 + var5, var3, (byte)-65);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SII)V")
   @ObfuscatedName("ax")
   static void method11759(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class387.sortItemsByName(var0, var1, var2, var5 - 1, (byte)-27);
         class387.sortItemsByName(var0, var1, 1 + var5, var3, (byte)-77);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[Ljava/lang/Object;II)V")
   @ObfuscatedName("br")
   public static void method11788(long[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < var6 + (var10 & var9)) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               Object var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         HorizontalAlignment.method4600(var0, var1, var2, var5 - 1, 144373485);
         HorizontalAlignment.method4600(var0, var1, 1 + var5, var3, -1124612734);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V")
   @ObfuscatedName("aa")
   public static void method11768(String[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               Object var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         Renderable.method6217(var0, var1, var2, var5 - 1, (byte)10);
         Renderable.method6217(var0, var1, 1 + var5, var3, (byte)37);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[III)V")
   @ObfuscatedName("bm")
   public static void method11778(long[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = Long.MAX_VALUE == var6 ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < (var10 & var9) + var6) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               int var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         class341.method7852(var0, var1, var2, var5 - 1, 1479555317);
         class341.method7852(var0, var1, 1 + var5, var3, 1764362100);
      }
   }

   classWM() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[III)V")
   @ObfuscatedName("am")
   public static void method11765(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         WorldMapID.quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1, 1580834876);
         WorldMapID.quicksortStringsWithCorrespondingIntegers(var0, var1, 1 + var5, var3, 567638582);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[JII)V")
   @ObfuscatedName("ao")
   public static void method11767(String[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var6 == null || null != var0[var9] && var0[var9].compareTo(var6) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               long var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class161.method4254(var0, var1, var2, var5 - 1, (byte)127);
         class161.method4254(var0, var1, 1 + var5, var3, (byte)121);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[III)V")
   @ObfuscatedName("bz")
   public static void method11771(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class134.method4022(var0, var1, var2, var5 - 1, -817675254);
         class134.method4022(var0, var1, 1 + var5, var3, -817675254);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[III)V")
   @ObfuscatedName("bs")
   public static void method11772(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class134.method4022(var0, var1, var2, var5 - 1, -817675254);
         class134.method4022(var0, var1, 1 + var5, var3, -817675254);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V")
   @ObfuscatedName("be")
   public static void method11769(String[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               Object var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         Renderable.method6217(var0, var1, var2, var5 - 1, (byte)39);
         Renderable.method6217(var0, var1, 1 + var5, var3, (byte)39);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[III)V")
   @ObfuscatedName("bo")
   public static void method11773(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class134.method4022(var0, var1, var2, var5 - 1, -817675254);
         class134.method4022(var0, var1, 1 + var5, var3, -817675254);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[III)V")
   @ObfuscatedName("bg")
   public static void method11774(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class134.method4022(var0, var1, var2, var5 - 1, -817675254);
         class134.method4022(var0, var1, 1 + var5, var3, -817675254);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F[III)V")
   @ObfuscatedName("by")
   static void method11784(float[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         float var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var0[var8] < var6) {
               float var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classWO.method11827(var0, var1, var2, var5 - 1, -964557352);
         classWO.method11827(var0, var1, 1 + var5, var3, -494777690);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V")
   @ObfuscatedName("aq")
   public static void method11770(String[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               Object var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         Renderable.method6217(var0, var1, var2, var5 - 1, (byte)24);
         Renderable.method6217(var0, var1, 1 + var5, var3, (byte)101);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[JII)V")
   @ObfuscatedName("bk")
   public static void method11775(int[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < (var10 & var9) + var6) {
               int var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               long var12 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var12;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classFO.method4033(var0, var1, var2, var5 - 1, (byte)127);
         classFO.method4033(var0, var1, 1 + var5, var3, (byte)39);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[JII)V")
   @ObfuscatedName("bb")
   public static void method11776(int[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < (var10 & var9) + var6) {
               int var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               long var12 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var12;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classFO.method4033(var0, var1, var2, var5 - 1, (byte)23);
         classFO.method4033(var0, var1, 1 + var5, var3, (byte)39);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[III)V")
   @ObfuscatedName("bj")
   public static void method11779(long[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = Long.MAX_VALUE == var6 ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < (var10 & var9) + var6) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               int var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         class341.method7852(var0, var1, var2, var5 - 1, 1747290380);
         class341.method7852(var0, var1, 1 + var5, var3, 1053159358);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[JII)V")
   @ObfuscatedName("bt")
   public static void method11780(long[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         long var10 = var6 == Long.MAX_VALUE ? 0L : 1L;

         for (int var12 = var2; var12 < var3; var12++) {
            if (var0[var12] < var6 + (var12 & var10)) {
               long var13 = var0[var12];
               var0[var12] = var0[var5];
               var0[var5] = var13;
               long var15 = var1[var12];
               var1[var12] = var1[var5];
               var1[var5++] = var15;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         ChatChannel.method2611(var0, var1, var2, var5 - 1, (byte)-2);
         ChatChannel.method2611(var0, var1, var5 + 1, var3, (byte)-105);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[S)V")
   @ObfuscatedName("as")
   public static void method11756(String[] var0, short[] var1) {
      class387.sortItemsByName(var0, var1, 0, var0.length - 1, (byte)-73);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[I)V")
   @ObfuscatedName("ah")
   public static void method11762(String[] var0, int[] var1) {
      WorldMapID.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1, 524899702);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[JII)V")
   @ObfuscatedName("bu")
   public static void method11781(long[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         long var10 = var6 == Long.MAX_VALUE ? 0L : 1L;

         for (int var12 = var2; var12 < var3; var12++) {
            if (var0[var12] < var6 + (var12 & var10)) {
               long var13 = var0[var12];
               var0[var12] = var0[var5];
               var0[var5] = var13;
               long var15 = var1[var12];
               var1[var12] = var1[var5];
               var1[var5++] = var15;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         ChatChannel.method2611(var0, var1, var2, var5 - 1, (byte)-96);
         ChatChannel.method2611(var0, var1, var5 + 1, var3, (byte)-42);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[JII)V")
   @ObfuscatedName("ba")
   public static void method11782(long[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         long var10 = var6 == Long.MAX_VALUE ? 0L : 1L;

         for (int var12 = var2; var12 < var3; var12++) {
            if (var0[var12] < var6 + (var12 & var10)) {
               long var13 = var0[var12];
               var0[var12] = var0[var5];
               var0[var5] = var13;
               long var15 = var1[var12];
               var1[var12] = var1[var5];
               var1[var5++] = var15;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         ChatChannel.method2611(var0, var1, var2, var5 - 1, (byte)-15);
         ChatChannel.method2611(var0, var1, var5 + 1, var3, (byte)0);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;I)I")
   @ObfuscatedName("uj")
   public static int method11766(PacketBuffer var0, int var1) {
      int var2 = -1996081443 * var0.bitIndex >> 3;
      int var3 = 8 - (var0.bitIndex * -1996081443 & 7);
      int var4 = 0;

      for (var0.bitIndex += -1028566667 * var1; var1 > var3; var3 = 8) {
         var4 += (var0.array[var2++] & PacketBuffer.field6547[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 == var3) {
         var4 += var0.array[var2] & PacketBuffer.field6547[var3];
      } else {
         var4 += var0.array[var2] >> var3 - var1 & PacketBuffer.field6547[var1];
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[I)V")
   @ObfuscatedName("al")
   public static void method11763(String[] var0, int[] var1) {
      WorldMapID.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1, 1143402636);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SII)V")
   @ObfuscatedName("ar")
   static void method11760(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class387.sortItemsByName(var0, var1, var2, var5 - 1, (byte)-81);
         class387.sortItemsByName(var0, var1, 1 + var5, var3, (byte)-83);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;II)V")
   @ObfuscatedName("bw")
   public static void method11785(int[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == -1119283085 ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < var6 + (var9 & var8)) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               Object var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class69.method1400(var0, var1, var2, var5 - 1, 1772939328);
         class69.method1400(var0, var1, 1 + var5, var3, 1772939328);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;II)V")
   @ObfuscatedName("bf")
   public static void method11786(int[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < var6 + (var9 & var8)) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               Object var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class69.method1400(var0, var1, var2, var5 - 1, 1772939328);
         class69.method1400(var0, var1, 1 + var5, var3, 1772939328);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;II)V")
   @ObfuscatedName("bn")
   public static void method11787(int[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == -1670394463 ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < var6 + (var9 & var8)) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               Object var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         class69.method1400(var0, var1, var2, var5 - 1, 1772939328);
         class69.method1400(var0, var1, 1 + var5, var3, 1772939328);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[Ljava/lang/Object;II)V")
   @ObfuscatedName("bd")
   public static void method11789(long[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < var6 + (var10 & var9)) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               Object var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         HorizontalAlignment.method4600(var0, var1, var2, var5 - 1, -930205210);
         HorizontalAlignment.method4600(var0, var1, 1 + var5, var3, 1913554902);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F[I)V")
   @ObfuscatedName("bi")
   public static void method11783(float[] var0, int[] var1) {
      classWO.method11827(var0, var1, 0, var0.length - 1, 719420733);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ni")
   static final void method11790(int var0, int var1) {
      try {
         if (!WidgetDefinition.method7961(class226.widgetDefinition, var0, -1707493651)) {
            if (var1 == -1882331634) {
               ;
            }
         } else {
            Widget[] var2 = class226.widgetDefinition.Widget_interfaceComponents[var0];

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var1 != -1882331634) {
                  throw new IllegalStateException();
               }

               Widget var4 = var2[var3];
               if (var4 == null) {
                  if (var1 != -1882331634) {
                     return;
                  }
               } else {
                  var4.modelFrame = 0;
                  var4.modelFrameCycle = 0;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "wm.ni(" + ')');
      }
   }
}
