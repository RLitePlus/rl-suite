import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("we")
public class classWE implements classWG {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6675 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field6676 = 42;
   @ObfuscatedName("af")
   JSONObject field6674;

   @ObfuscatedSignature(descriptor = "(B)Lwy;")
   @ObfuscatedName("az")
   @Override
   public classWY vmethod631(byte var1) {
      try {
         return classWY.field6791;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "we.az(" + ')');
      }
   }

   public classWE(String var1) throws UnsupportedEncodingException {
      method12346(this, var1, -1204201464);
   }

   @ObfuscatedSignature(descriptor = "(Lwe;Ljava/lang/String;I)V")
   @ObfuscatedName("ae")
   public static void method12346(classWE var0, String var1, int var2) throws UnsupportedEncodingException {
      if (var0 == null) {
         var0.method12349(var1, var2);
      } else {
         try {
            try {
               if (var1.charAt(0) == '{') {
                  if (var2 != -1204201464) {
                     return;
                  }

                  var0.field6674 = new JSONObject(var1);
               } else {
                  if (var1.charAt(0) != '[') {
                     throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
                  }

                  if (var2 != -1204201464) {
                     return;
                  }

                  JSONArray var3 = new JSONArray(var1);
                  var0.field6674 = new JSONObject();
                  var0.field6674.put("arrayValues", var3);
               }
            } catch (JSONException var4) {
               throw new UnsupportedEncodingException(var4.getMessage());
            }
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "we.ao(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("aq")
   void method12342(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      method12346(this, var2, -1204201464);
   }

   @ObfuscatedSignature(descriptor = "(I)Lorg/json/JSONObject;")
   @ObfuscatedName("al")
   public JSONObject method12351(int var1) {
      try {
         return this.field6674;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "we.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("aa")
   void method12343(byte[] var1, int var2) throws UnsupportedEncodingException {
      try {
         String var3 = new String(var1, "UTF-8");
         method12346(this, var3, -1204201464);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "we.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwe;Ljava/lang/String;)V")
   @ObfuscatedName("pq")
   public static void method12347(classWE var0, String var1) throws UnsupportedEncodingException {
      if (var0 == null) {
         var0.method12350(var1);
      }

      try {
         if (var1.charAt(0) == '{') {
            var0.field6674 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            var0.field6674 = new JSONObject();
            var0.field6674.put("arrayValues", var2);
         }
      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)Z")
   @ObfuscatedName("jm")
   public static boolean method12356(classLH var0, boolean var1) {
      if (var0 == null) {
         var0.method6992();
      }

      var1 = var1 && var0.field4145;
      boolean var2 = var1 != var0.field4143;
      var0.field4143 = var1;
      if (!var0.field4143) {
         classLH.method6882(var0, var0.field4157 * -698145269, var0.field4157 * -698145269, 1122842785);
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("as")
   @Override
   public byte[] vmethod634() throws UnsupportedEncodingException {
      return null == this.field6674 ? new byte[0] : this.field6674.toString().getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ad")
   void method12348(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.field6674 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.field6674 = new JSONObject();
            this.field6674.put("arrayValues", var2);
         }
      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ObfuscatedSignature(descriptor = "()Lwy;")
   @ObfuscatedName("ae")
   @Override
   public classWY vmethod632() {
      return classWY.field6791;
   }

   @ObfuscatedSignature(descriptor = "()Lwy;")
   @ObfuscatedName("ab")
   @Override
   public classWY vmethod633() {
      return classWY.field6791;
   }

   public classWE(JSONObject var1) {
      this.field6674 = var1;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ax")
   @Override
   public byte[] vmethod635() throws UnsupportedEncodingException {
      return null == this.field6674 ? new byte[0] : this.field6674.toString().getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ac")
   @Override
   public byte[] vmethod636() throws UnsupportedEncodingException {
      return null == this.field6674 ? new byte[0] : this.field6674.toString().getBytes("UTF-8");
   }

   public classWE(byte[] var1) throws UnsupportedEncodingException {
      this.method12343(var1, 617089741);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("aj")
   void method12344(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      method12346(this, var2, -1204201464);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ay")
   void method12345(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      method12346(this, var2, -1204201464);
   }

   @ObfuscatedSignature(descriptor = "()Lorg/json/JSONObject;")
   @ObfuscatedName("ar")
   public JSONObject method12352() {
      return this.field6674;
   }

   @ObfuscatedSignature(descriptor = "()Lorg/json/JSONObject;")
   @ObfuscatedName("au")
   public JSONObject method12353() {
      return this.field6674;
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("af")
   @Override
   public byte[] vmethod637(int var1) throws UnsupportedEncodingException {
      try {
         if (null == this.field6674) {
            if (var1 != -1390912683) {
               throw new IllegalStateException();
            } else {
               return new byte[0];
            }
         } else {
            return this.field6674.toString().getBytes("UTF-8");
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "we.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ag")
   @Override
   public byte[] vmethod638() throws UnsupportedEncodingException {
      return null == this.field6674 ? new byte[0] : this.field6674.toString().getBytes("UTF-8");
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ao")
   void method12349(String var1, int var2) {
      try {
         try {
            if (var1.charAt(0) == '{') {
               if (var2 != -1204201464) {
                  return;
               }

               this.field6674 = new JSONObject(var1);
            } else {
               if (var1.charAt(0) != '[') {
                  throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
               }

               if (var2 != -1204201464) {
                  return;
               }

               JSONArray var3 = new JSONArray(var1);
               this.field6674 = new JSONObject();
               this.field6674.put("arrayValues", var3);
            }
         } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "we.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ap")
   void method12350(String var1) {
      try {
         if (var1.charAt(0) == '{') {
            this.field6674 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.field6674 = new JSONObject();
            this.field6674.put("arrayValues", var2);
         }
      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwe;)Lorg/json/JSONObject;")
   @ObfuscatedName("cq")
   public static JSONObject method12354(classWE var0) {
      if (var0 == null) {
         var0.method12355();
      }

      return var0.field6674;
   }

   @ObfuscatedSignature(descriptor = "()Lorg/json/JSONObject;")
   @ObfuscatedName("ai")
   public JSONObject method12355() {
      return this.field6674;
   }
}
