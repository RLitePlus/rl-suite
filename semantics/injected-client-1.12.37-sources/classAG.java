import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ag")
public class classAG implements classAX {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final String field149 = "SHA-256";
   @ObfuscatedName("af")
   final MessageDigest field148 = this.method362();

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("af")
   static int method348(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lag;Ljava/lang/String;J)[B")
   @ObfuscatedName("en")
   public static byte[] method356(classAG var0, String var1, long var2) {
      if (var0 == null) {
         var0.method357(var1, var2);
      }

      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      var0.field148.reset();

      try {
         var0.field148.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return var0.field148.digest();
   }

   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("az")
   static int method342(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method348(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;J)Z")
   @ObfuscatedName("ae")
   boolean method354(int var1, String var2, long var3) {
      byte[] var5 = this.method357(var2, var3);
      return method342(var5) >= var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("aa")
   static int method343(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method348(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;J)[B")
   @ObfuscatedName("ap")
   byte[] method357(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field148.reset();

      try {
         this.field148.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field148.digest();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/MessageDigest;")
   @ObfuscatedName("ag")
   MessageDigest method362() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("as")
   static int method344(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method348(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/MessageDigest;")
   @ObfuscatedName("ak")
   MessageDigest method363() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("ac")
   static int method345(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method348(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("ax")
   static int method346(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method348(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("ao")
   static int method347(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method348(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("al")
   static int method349(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aj")
   static int method350(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ay")
   static int method351(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aq")
   static int method352(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & 255; (var2 & 1622426376) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;II)V")
   @ObfuscatedName("fr")
   public static void method353(classDS var0, int var1, int var2) {
      var0.field1616.put(var1, var2);
      if (var0.field1617[var1]) {
         var0.field1615 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;J)[B")
   @ObfuscatedName("aw")
   byte[] method358(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field148.reset();

      try {
         this.field148.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field148.digest();
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;J)Z")
   @ObfuscatedName("ad")
   boolean method355(int var1, String var2, long var3) {
      byte[] var5 = this.method357(var2, var3);
      return method342(var5) >= var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;J)[B")
   @ObfuscatedName("ab")
   byte[] method359(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field148.reset();

      try {
         this.field148.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field148.digest();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;J)[B")
   @ObfuscatedName("au")
   byte[] method360(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field148.reset();

      try {
         this.field148.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field148.digest();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;J)[B")
   @ObfuscatedName("ai")
   byte[] method361(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field148.reset();

      try {
         this.field148.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field148.digest();
   }

   classAG(classAA var1) {
   }
}
