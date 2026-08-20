import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aj")
public class classAJ implements classAG {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final String field21 = "SHA-256";
   @ObfuscatedName("at")
   final MessageDigest field20 = this.method116();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ap")
   static int method104(byte var0) {
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

   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("av")
   static int method101(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method105(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("at")
   static int method105(byte var0) {
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

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;J)Z")
   @ObfuscatedName("ag")
   boolean method111(int var1, String var2, long var3) {
      byte[] var5 = this.method113(var2, var3);
      return method101(var5) >= var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ay")
   static int method106(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & 309104129; (var2 & 1204317832) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/MessageDigest;")
   @ObfuscatedName("ae")
   MessageDigest method116() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("aj")
   static int method102(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method105(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)I")
   @ObfuscatedName("ak")
   static int method103(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         byte var4 = var2[var3];
         int var5 = method105(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("au")
   static int method107(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & 255; (var2 & -580036331) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aw")
   static int method108(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & -1419921695; (var2 & 128) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lpw;)V")
   @ObfuscatedName("wh")
   public static void method118(WorldEntity var0, WorldEntityOwnerType var1) {
      if (var0 == null) {
         var0.vmethod142();
      }

      var0.worldEntityOwnerType = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   static int method109(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & 520090311; (var2 & 128) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;J)[B")
   @ObfuscatedName("an")
   byte[] method113(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field20.reset();

      try {
         this.field20.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field20.digest();
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;J)Z")
   @ObfuscatedName("ai")
   boolean method112(int var1, String var2, long var3) {
      byte[] var5 = this.method113(var2, var3);
      return method101(var5) >= var1;
   }

   classAJ(classAP var1) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laj;Ljava/lang/String;J)[B")
   @ObfuscatedName("fx")
   public static byte[] method114(classAJ var0, String var1, long var2) {
      if (var0 == null) {
         var0.method117();
      }

      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      var0.field20.reset();

      try {
         var0.field20.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return var0.field20.digest();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ad")
   static int method110(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for (int var2 = var0 & -1795198625; (var2 & 128) == 0; var2 <<= 1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laj;Ljava/lang/String;J)[B")
   @ObfuscatedName("eu")
   public static byte[] method115(classAJ var0, String var1, long var2) {
      if (var0 == null) {
         var0.method116();
      }

      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      var0.field20.reset();

      try {
         var0.field20.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return var0.field20.digest();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/MessageDigest;")
   @ObfuscatedName("ar")
   MessageDigest method117() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }
}
