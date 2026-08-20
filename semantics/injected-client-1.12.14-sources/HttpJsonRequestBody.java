import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ub")
public class HttpJsonRequestBody implements HttpPayload {
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   public static final int field6014 = 31;
   @ObfuscatedName("at")
   JSONObject body;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final String field6015 = "arrayValues";
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   static final int field6013 = 58;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final char field6012 = 'À';

   public HttpJsonRequestBody(String var1) throws UnsupportedEncodingException {
      this.setBodyFromString(var1, 1308018734);
   }

   public HttpJsonRequestBody(byte[] var1) throws UnsupportedEncodingException {
      method11084(this, var1, -1746207697);
   }

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("av")
   @Override
   public HttpContentType getContentType(int var1) {
      try {
         return HttpContentType.APPLICATION_JSON;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ub.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lorg/json/JSONObject;")
   @ObfuscatedName("ab")
   public JSONObject method11090() {
      return this.body;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ac")
   void method11086(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.body = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.body = new JSONObject();
            this.body.put("arrayValues", var2);
         }
      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("at")
   @Override
   public byte[] toBytes(int var1) throws UnsupportedEncodingException {
      try {
         if (null == this.body) {
            if (var1 >= 949974903) {
               throw new IllegalStateException();
            } else {
               return new byte[0];
            }
         } else {
            return this.body.toString().getBytes("UTF-8");
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ub.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("as")
   void method11087(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == 331119737) {
            this.body = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.body = new JSONObject();
            this.body.put("arrayValues", var2);
         }
      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("aj")
   @Override
   public HttpContentType vmethod383() {
      return HttpContentType.APPLICATION_JSON;
   }

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("an")
   @Override
   public HttpContentType vmethod384() {
      return HttpContentType.APPLICATION_JSON;
   }

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("ag")
   @Override
   public HttpContentType vmethod385() {
      return HttpContentType.APPLICATION_JSON;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ak")
   @Override
   public byte[] vmethod388() throws UnsupportedEncodingException {
      return null == this.body ? new byte[0] : this.body.toString().getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aw")
   @Override
   public byte[] vmethod389() throws UnsupportedEncodingException {
      return null == this.body ? new byte[0] : this.body.toString().getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ap")
   @Override
   public byte[] vmethod390() throws UnsupportedEncodingException {
      return null == this.body ? new byte[0] : this.body.toString().getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ay")
   @Override
   public byte[] vmethod391() throws UnsupportedEncodingException {
      return null == this.body ? new byte[0] : this.body.toString().getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()Lur;")
   @ObfuscatedName("ae")
   @Override
   public HttpContentType vmethod386() {
      return HttpContentType.APPLICATION_JSON;
   }

   @ObfuscatedSignature(descriptor = "(I)Lorg/json/JSONObject;")
   @ObfuscatedName("ad")
   public JSONObject getBody(int var1) {
      try {
         return this.body;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ub.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("az")
   void setBodyFromString(String var1, int var2) throws UnsupportedEncodingException {
      try {
         try {
            if (var1.charAt(0) == '{') {
               if (var2 >= 1852473984) {
                  throw new IllegalStateException();
               }

               this.body = new JSONObject(var1);
            } else {
               if (var1.charAt(0) != '[') {
                  throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
               }

               if (var2 >= 1852473984) {
                  throw new IllegalStateException();
               }

               JSONArray var3 = new JSONArray(var1);
               this.body = new JSONObject();
               this.body.put("arrayValues", var3);
            }
         } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ub.az(" + ')');
      }
   }

   public HttpJsonRequestBody(JSONObject var1) {
      this.body = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lorg/json/JSONObject;")
   @ObfuscatedName("ar")
   public JSONObject method11092() {
      return this.body;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lub;Ljava/lang/String;)V")
   @ObfuscatedName("vh")
   public static void method11089(HttpJsonRequestBody var0, String var1) throws UnsupportedEncodingException {
      if (var0 == null) {
         var0.method11092();
      }

      try {
         if (var1.charAt(0) == '{') {
            var0.body = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            var0.body = new JSONObject();
            var0.body.put("arrayValues", var2);
         }
      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   static void method11093(int var0, int var1) {
      try {
         ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.method8915(var0);
         if (var2 == null) {
            if (var1 != 155096849) {
               throw new IllegalStateException();
            }
         } else {
            var2.remove();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ub.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lub;[BI)V")
   @ObfuscatedName("ix")
   public static void method11084(HttpJsonRequestBody var0, byte[] var1, int var2) throws UnsupportedEncodingException {
      if (var0 == null) {
         var0.bodyFromBytes(var1, var2);
      }

      try {
         String var3 = new String(var1, "UTF-8");
         var0.setBodyFromString(var3, 1193255620);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ub.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("au")
   void bodyFromBytes(byte[] var1, int var2) {
      try {
         String var3 = new String(var1, "UTF-8");
         this.setBodyFromString(var3, 1193255620);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ub.au(" + ')');
      }
   }
}
