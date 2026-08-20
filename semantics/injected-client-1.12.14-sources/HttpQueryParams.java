import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uz")
public class HttpQueryParams implements HttpPayload {
   @ObfuscatedName("av")
   final Map field6144;

   public HttpQueryParams(Map var1) {
      this.field6144 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("aj")
   @Override
   public HttpContentType vmethod383() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Luz;I)Ljava/lang/String;")
   @ObfuscatedName("tz")
   public static String method11263(HttpQueryParams var0, int var1) throws UnsupportedEncodingException {
      if (var0 == null) {
         return var0.encode(var1);
      } else {
         try {
            StringBuilder var2 = new StringBuilder();
            Iterator var3 = var0.field6144.entrySet().iterator();

            while (var3.hasNext()) {
               if (var1 >= 268435455) {
                  throw new IllegalStateException();
               }

               Entry var4 = (Entry)var3.next();
               String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
               String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
               var2.append(var5).append("=").append(var6).append("&");
            }

            if (var2.length() != 0) {
               var2.deleteCharAt(var2.length() - 1);
               var2.insert(0, "?");
               return var2.toString();
            } else if (var1 >= 268435455) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "uz.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("at")
   @Override
   public byte[] toBytes(int var1) throws UnsupportedEncodingException {
      try {
         return method11263(this, -1936899827).getBytes("UTF-8");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "uz.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("av")
   @Override
   public HttpContentType getContentType(int var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "uz.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("ae")
   @Override
   public HttpContentType vmethod386() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("pv")
   static void method11269(byte[] var0, int var1, int var2) {
      try {
         if (client.randomDatData == null) {
            if (var2 <= 447302631) {
               return;
            }

            client.randomDatData = new byte[24];
         }

         class488.writeRandomDat(var0, var1, client.randomDatData, 0, 24);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "uz.pv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aw")
   @Override
   public byte[] vmethod389() throws UnsupportedEncodingException {
      return method11263(this, -1103573606).getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("ag")
   @Override
   public HttpContentType vmethod385() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ak")
   @Override
   public byte[] vmethod388() throws UnsupportedEncodingException {
      return method11263(this, -1834636552).getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("an")
   @Override
   public HttpContentType vmethod384() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ap")
   @Override
   public byte[] vmethod390() throws UnsupportedEncodingException {
      return method11263(this, 132901054).getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ay")
   @Override
   public byte[] vmethod391() throws UnsupportedEncodingException {
      return method11263(this, -2098696459).getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ad")
   public String method11264() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : this.field6144.entrySet()) {
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ai")
   public String method11265() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : this.field6144.entrySet()) {
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method11266() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : this.field6144.entrySet()) {
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lrt;")
   @ObfuscatedName("jc")
   public static NodeDeque method11268(int var0) {
      try {
         return client.scriptEvents;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "uz.jc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("au")
   public String encode(int var1) {
      try {
         StringBuilder var2 = new StringBuilder();
         Iterator var3 = this.field6144.entrySet().iterator();

         while (var3.hasNext()) {
            if (var1 >= 268435455) {
               throw new IllegalStateException();
            }

            Entry var4 = (Entry)var3.next();
            String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
            String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
            var2.append(var5).append("=").append(var6).append("&");
         }

         if (var2.length() != 0) {
            var2.deleteCharAt(var2.length() - 1);
            var2.insert(0, "?");
            return var2.toString();
         } else if (var1 >= 268435455) {
            throw new IllegalStateException();
         } else {
            return "";
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "uz.au(" + ')');
      }
   }
}
