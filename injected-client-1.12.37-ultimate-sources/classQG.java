import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qg")
public class classQG {
   @ToRemove(unused = "true")
   @ObfuscatedName("ek")
   static final int field5537 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field5536 = 524288;
   @ObfuscatedName("ae")
   final Map field5534;
   @ObfuscatedName("ab")
   final String field5535;
   @ObfuscatedName("az")
   final int field5533;
   @ObfuscatedName("af")
   final String field5532;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ac")
   public String method9515() {
      return this.field5535;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ao")
   public String method9516() {
      return this.field5535;
   }

   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("oc")
   public static void method9520(classFX var0) {
      if (var0 == null) {
         var0.method5207();
      } else {
         var0.field2422 = null;
      }
   }

   classQG(HttpURLConnection var1) throws IOException {
      this.field5533 = var1.getResponseCode() * -91618159;
      this.field5532 = var1.getResponseMessage();
      this.field5534 = var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = -1998439311 * this.field5533 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (var3 != null) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while ((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field5535 = var2.toString();
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ab")
   public String method9506(int var1) {
      try {
         return this.field5532;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qg.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/util/Map;")
   @ObfuscatedName("ae")
   public Map method9512(byte var1) {
      try {
         return this.field5534;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qg.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("af")
   public String method9517(int var1) {
      try {
         return this.field5535;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qg.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public int method9503() {
      return -1998439311 * this.field5533;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aa")
   public String method9507() {
      return this.field5532;
   }

   classQG(String var1) {
      this.field5533 = 2007442064;
      this.field5532 = var1;
      this.field5534 = null;
      this.field5535 = "";
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String method9508() {
      return this.field5532;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aq")
   public String method9509() {
      return this.field5532;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("aj")
   public Map method9513() {
      return this.field5534;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("al")
   public Map method9514() {
      return this.field5534;
   }

   @ObfuscatedSignature(descriptor = "(Lez;)V")
   @ObfuscatedName("tl")
   public static void method9519(classEZ var0) {
      if (var0 == null) {
         var0.method4342();
      } else {
         var0.field2036 = -1;
         var0.field2033 = false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqg;I)I")
   @ObfuscatedName("al")
   public static int method9504(classQG var0, int var1) {
      if (var0 == null) {
         var0.method9505(var1);
      }

      try {
         return -1998439311 * var0.field5533;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qg.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("as")
   public String method9510() {
      return this.field5532;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hm")
   static void method9521(int var0) {
      try {
         if (null != classMC.field4481) {
            if (var0 != -419739223) {
               throw new IllegalStateException();
            }

            client.field881 = client.field855 * -493787601;
            classZX.method14224(classMC.field4481, 339443845);
            Iterator var1 = classIS.field3053.field1694.iterator();

            while (var1.hasNext()) {
               if (var0 != -419739223) {
                  throw new IllegalStateException();
               }

               classCT var2 = (classCT)var1.next();
               classMC.field4481
                  .method14220(
                     (var2.field1487 * -1547553299 >> 7) + -1444178379 * classIS.field3053.field1709,
                     (-1272026483 * var2.field1489 >> 7) + -351145363 * classIS.field3053.field1708,
                     (byte)-106
                  );
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qg.hm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ad")
   public String method9511() {
      return this.field5532;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ax")
   public String method9518() {
      return this.field5535;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   public int method9505(int var1) {
      try {
         return -1998439311 * this.field5533;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qg.az(" + 41);
      }
   }
}
