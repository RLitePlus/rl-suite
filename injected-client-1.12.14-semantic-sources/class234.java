import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONObject;

@ObfuscatedName("jj")
public class class234 {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3056 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field3054 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field3055 = 3;
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ae")
   static final class234 field3044 = new class234();
   @ObfuscatedSignature(descriptor = "Lqq;")
   @ObfuscatedName("ig")
   static GrandExchangeEvents grandExchangeEvents;
   @ObfuscatedName("az")
   long field3051;
   @ObfuscatedName("aw")
   String field3047;
   @ObfuscatedName("ap")
   String field3050;
   @ObfuscatedName("ay")
   String field3053;
   @ObfuscatedName("au")
   String field3048;
   @ObfuscatedSignature(descriptor = "Lsu;")
   @ObfuscatedName("fw")
   public static Font fontBold12;
   @ObfuscatedSignature(descriptor = "Las;")
   @ObfuscatedName("ad")
   AsyncRestClient field3061;
   @ObfuscatedSignature(descriptor = "Lar;")
   @ObfuscatedName("ai")
   AsyncHttpResponse field3060;
   @ObfuscatedName("ak")
   final int field3046;
   @ObfuscatedName("ac")
   int field3045;
   @ObfuscatedName("ab")
   String field3062;
   @ObfuscatedName("aj")
   final int field3049 = 1;
   @ObfuscatedName("nm")
   static String accessToken;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field3057 = 47;
   @ObfuscatedName("as")
   int field3052;
   @ToRemove(unused = "true")
   @ObfuscatedName("cd")
   public static final int field3059 = 104;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field3058 = 69;
   @ObfuscatedName("ax")
   boolean field3066;

   @ObfuscatedSignature(descriptor = "(Ljj;ILjava/lang/String;I)V")
   @ObfuscatedName("jl")
   public static void method5918(class234 var0, int var1, String var2, int var3) {
      if (var0 == null) {
         var0.method5921(var1, var2, var1);
      }

      try {
         var0.field3045 = -376325871 * var1;
         var0.field3062 = var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "jj.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method5940() {
      if (!this.field3048.isEmpty()) {
         String var1 = "";
         switch (959207409 * this.field3045) {
            case 1:
               var1 = "events/click";
               break;
            case 2:
               var1 = "events/dismissed";
               break;
            case 3:
               var1 = "events/impression";
         }

         if (!this.field3062.isEmpty()) {
            String var2 = this.field3047;
            var2 = var2 + var1 + "/" + this.field3050 + "/" + this.field3048 + "/" + this.field3062 + "?userHash=" + this.field3053;

            try {
               this.field3060 = this.method5954(var2, (byte)69);
            } catch (IOException var4) {
               this.field3052 = 577360443;
            }

            this.field3052 = 577360443;
            this.field3045 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public void method5932(int var1) {
      try {
         if (this.field3060 == null) {
            if (!this.field3048.isEmpty() && 1 == 961492723 * this.field3052) {
               long var2 = ParamComposition.method4949((byte)15);
               long var4 = var2 - this.field3051 * 5148152992387298957L;
               String var6 = this.field3047;
               var6 = var6 + "session/close/" + this.field3050 + "/" + this.field3048;
               if (this.field3053.isEmpty()) {
                  var6 = var6 + "?sessionDuration=" + var4;
               } else {
                  var6 = var6 + "?userHash=" + this.field3053 + "&sessionDuration=" + var4;
               }

               try {
                  this.field3060 = this.method5954(var6, (byte)-2);
               } catch (IOException var8) {
                  this.field3052 = 577360443;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "jj.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljj;Z)V")
   @ObfuscatedName("cp")
   public static void method5922(class234 var0, boolean var1) {
      if (var0 == null) {
         var0.method5927(var1);
      }

      var0.field3066 = var1;
      var0.field3061 = new AsyncRestClient("crmsession", 1, 1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ls")
   static final void method5959(int var0) {
      try {
         for (WorldView var2 : client.worldViewManager) {
            SpriteBufferProperties.method298(var2, 192429840);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jj.ls(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Lar;")
   @ObfuscatedName("ay")
   AsyncHttpResponse method5954(String var1, byte var2) throws IOException {
      try {
         URL var3 = new URL(var1);
         HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.field3066);

         try {
            JSONObject var5 = new JSONObject();
            var4.setPayload(new HttpJsonRequestBody(var5), -581728802);
         } catch (Exception var6) {
         }

         return this.field3061.submitRequest(var4, 1373362749);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "jj.ay(" + ')');
      }
   }

   class234() {
      this.field3046 = 2;
      this.field3047 = "";
      this.field3050 = "";
      this.field3053 = "";
      this.field3048 = "";
      this.field3051 = 3157440718234731451L;
      this.field3052 = 577360443;
      this.field3045 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Ljj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
   @ObfuscatedName("xf")
   public static void method5928(class234 var0, String var1, String var2, String var3, byte var4) {
      if (var0 == null) {
         var0.method5931(var1, var1, var1, var4);
      }

      try {
         if (961492723 * var0.field3052 == 2) {
            if (var4 >= -1) {
               throw new IllegalStateException();
            }
         } else {
            var0.field3047 = var1;
            var0.field3050 = var2;
            var0.field3053 = var3;
            if (!var0.field3047.endsWith("/")) {
               if (var4 >= -1) {
                  return;
               }

               var0.field3047 = var0.field3047 + "/";
            }

            if (var0.field3050.equals("")) {
               if (var4 >= -1) {
                  throw new IllegalStateException();
               }
            } else {
               String var5 = var0.field3047;
               var5 = var5 + "session/open/" + var0.field3050;
               if (var0.field3053.equals("")) {
               }

               var5 = var5 + "?userHash=" + var0.field3053;

               try {
                  var0.field3060 = var0.method5954(var5, (byte)78);
                  var0.field3051 = ParamComposition.method4949((byte)15) * -3157440718234731451L;
               } catch (IOException var7) {
                  var0.field3060 = null;
                  var0.field3050 = "";
                  var0.field3053 = "";
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "jj.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljj;")
   @ObfuscatedName("au")
   public static class234 method5916() {
      return field3044;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public void method5943() {
      if (this.field3060 != null && this.field3060.hasFinished(313335687)) {
         if (this.field3060.hasFinished(-226330507)
            && AsyncHttpResponse.method230(this.field3060, 602942148).getResponseCode(-1173765548) == 795081197
            && this.field3048.isEmpty()) {
            String var1 = HttpResponse.method132(AsyncHttpResponse.method230(this.field3060, -581524195), -127381519);
            if (var1.isEmpty()) {
               return;
            }

            this.field3048 = var1;
         }

         if (2128012700 * this.field3045 != 0) {
            this.method5941(1420999248);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljj;ZI)V")
   @ObfuscatedName("bp")
   public static void method5923(class234 var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method5926(var1, var2);
      } else {
         try {
            var0.field3066 = var1;
            var0.field3061 = new AsyncRestClient("crmsession", 1, 1);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "jj.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("ai")
   public void method5919(int var1, String var2) {
      this.field3045 = -376325871 * var1;
      this.field3062 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lar;")
   @ObfuscatedName("bj")
   AsyncHttpResponse method5955(String var1) throws IOException {
      URL var2 = new URL(var1);
      HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field3066);

      try {
         JSONObject var4 = new JSONObject();
         var3.setPayload(new HttpJsonRequestBody(var4), 836422270);
      } catch (Exception var5) {
      }

      return this.field3061.submitRequest(var3, 822623030);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("as")
   public void method5924(boolean var1) {
      this.field3066 = var1;
      this.field3061 = new AsyncRestClient("crmsession", 1, 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljj;")
   @ObfuscatedName("az")
   public static class234 method5917() {
      return field3044;
   }

   @ObfuscatedSignature(descriptor = "(Ljj;Ljava/lang/String;I)Z")
   @ObfuscatedName("gi")
   public static boolean method5950(class234 var0, String var1, int var2) {
      if (var0 == null) {
         var0.method5952(var1, var2);
      }

      try {
         method5918(var0, 2, var1, -801624390);
         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jj.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ax")
   void method5929(String var1, String var2, String var3) {
      if (961492723 * this.field3052 != 2) {
         this.field3047 = var1;
         this.field3050 = var2;
         this.field3053 = var3;
         if (!this.field3047.endsWith("/")) {
            this.field3047 = this.field3047 + "/";
         }

         if (!this.field3050.equals("")) {
            String var4 = this.field3047;
            var4 = var4 + "session/open/" + this.field3050;
            if (this.field3053.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.field3053;

            try {
               this.field3060 = this.method5954(var4, (byte)-34);
               this.field3051 = ParamComposition.method4949((byte)15) * -3157440718234731451L;
            } catch (IOException var6) {
               this.field3060 = null;
               this.field3050 = "";
               this.field3053 = "";
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void method5941(int var1) {
      try {
         if (this.field3048.isEmpty()) {
            if (var1 <= -1274100050) {
               throw new IllegalStateException();
            }
         } else {
            String var2 = "";
            switch (959207409 * this.field3045) {
               case 1:
                  var2 = "events/click";
                  break;
               case 2:
                  var2 = "events/dismissed";
                  break;
               case 3:
                  var2 = "events/impression";
            }

            if (!this.field3062.isEmpty()) {
               String var3 = this.field3047;
               var3 = var3 + var2 + "/" + this.field3050 + "/" + this.field3048 + "/" + this.field3062 + "?userHash=" + this.field3053;

               try {
                  this.field3060 = this.method5954(var3, (byte)67);
               } catch (IOException var5) {
                  this.field3052 = 577360443;
               }

               this.field3052 = 577360443;
               this.field3045 = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "jj.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljj;B)V")
   @ObfuscatedName("ii")
   public static void method5944(class234 var0, byte var1) {
      if (var0 == null) {
         var0.method5948(var1);
      } else {
         try {
            if (var0.field3060 != null) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               if (var0.field3060.hasFinished(-659837645)) {
                  if (var0.field3060.hasFinished(-983923300) && AsyncHttpResponse.method230(var0.field3060, -2070169222).getResponseCode(-2144853147) == 200) {
                     if (var1 == -1) {
                        return;
                     }

                     if (var0.field3048.isEmpty()) {
                        if (var1 == -1) {
                           throw new IllegalStateException();
                        }

                        String var2 = HttpResponse.method132(AsyncHttpResponse.method230(var0.field3060, -875410844), -127381519);
                        if (var2.isEmpty()) {
                           if (var1 == -1) {
                              throw new IllegalStateException();
                           }

                           return;
                        }

                        var0.field3048 = var2;
                     }
                  }

                  if (959207409 * var0.field3045 != 0) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     var0.method5941(1326173517);
                  }

                  return;
               }

               if (var1 == -1) {
                  throw new IllegalStateException();
               }
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "jj.aw(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljj;)V")
   @ObfuscatedName("th")
   public static void method5933(class234 var0) {
      if (var0 == null) {
         var0.method5936();
      }

      if (var0.field3060 == null) {
         if (!var0.field3048.isEmpty() && 1 == 961492723 * var0.field3052) {
            long var1 = ParamComposition.method4949((byte)15);
            long var3 = var1 - var0.field3051 * 5148152992387298957L;
            String var5 = var0.field3047;
            var5 = var5 + "session/close/" + var0.field3050 + "/" + var0.field3048;
            if (var0.field3053.isEmpty()) {
               var5 = var5 + "?sessionDuration=" + var3;
            } else {
               var5 = var5 + "?userHash=" + var0.field3053 + "&sessionDuration=" + var3;
            }

            try {
               var0.field3060 = var0.method5954(var5, (byte)-3);
            } catch (IOException var7) {
               var0.field3052 = 577360443;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public void method5934() {
      if (this.field3060 == null) {
         if (!this.field3048.isEmpty() && 1 == 961492723 * this.field3052) {
            long var1 = ParamComposition.method4949((byte)15);
            long var3 = var1 - this.field3051 * 5148152992387298957L;
            String var5 = this.field3047;
            var5 = var5 + "session/close/" + this.field3050 + "/" + this.field3048;
            if (this.field3053.isEmpty()) {
               var5 = var5 + "?sessionDuration=" + var3;
            } else {
               var5 = var5 + "?userHash=" + this.field3053 + "&sessionDuration=" + var3;
            }

            try {
               this.field3060 = this.method5954(var5, (byte)-36);
            } catch (IOException var7) {
               this.field3052 = 577360443;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public void method5935() {
      if (this.field3060 == null) {
         if (!this.field3048.isEmpty() && 1 == 961492723 * this.field3052) {
            long var1 = ParamComposition.method4949((byte)15);
            long var3 = var1 - this.field3051 * 5148152992387298957L;
            String var5 = this.field3047;
            var5 = var5 + "session/close/" + this.field3050 + "/" + this.field3048;
            if (this.field3053.isEmpty()) {
               var5 = var5 + "?sessionDuration=" + var3;
            } else {
               var5 = var5 + "?userHash=" + this.field3053 + "&sessionDuration=" + var3;
            }

            try {
               this.field3060 = this.method5954(var5, (byte)-4);
            } catch (IOException var7) {
               this.field3052 = 577360443;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public void method5937() {
      if (null != this.field3061) {
         AsyncRestClient.method242(this.field3061, -1398249376);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   void method5942() {
      if (!this.field3048.isEmpty()) {
         String var1 = "";
         switch (1225343272 * this.field3045) {
            case 1:
               var1 = "events/click";
               break;
            case 2:
               var1 = "events/dismissed";
               break;
            case 3:
               var1 = "events/impression";
         }

         if (!this.field3062.isEmpty()) {
            String var2 = this.field3047;
            var2 = var2 + var1 + "/" + this.field3050 + "/" + this.field3048 + "/" + this.field3062 + "?userHash=" + this.field3053;

            try {
               this.field3060 = this.method5954(var2, (byte)48);
            } catch (IOException var4) {
               this.field3052 = 703425650;
            }

            this.field3052 = 577360443;
            this.field3045 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method5945() {
      if (this.field3060 != null && this.field3060.hasFinished(-383119258)) {
         if (this.field3060.hasFinished(-1406499019)
            && AsyncHttpResponse.method230(this.field3060, 476701705).getResponseCode(-1395066789) == 200
            && this.field3048.isEmpty()) {
            String var1 = HttpResponse.method132(AsyncHttpResponse.method230(this.field3060, 322520922), -127381519);
            if (var1.isEmpty()) {
               return;
            }

            this.field3048 = var1;
         }

         if (959207409 * this.field3045 != 0) {
            this.method5941(1015221734);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public void method5946() {
      if (this.field3060 != null && this.field3060.hasFinished(-97888541)) {
         if (this.field3060.hasFinished(-1593851658)
            && AsyncHttpResponse.method230(this.field3060, 1873530771).getResponseCode(-1046862885) == 200
            && this.field3048.isEmpty()) {
            String var1 = HttpResponse.method132(AsyncHttpResponse.method230(this.field3060, 416618286), -127381519);
            if (var1.isEmpty()) {
               return;
            }

            this.field3048 = var1;
         }

         if (959207409 * this.field3045 != 0) {
            this.method5941(1600404319);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public void method5947() {
      if (this.field3060 != null && this.field3060.hasFinished(-1613554578)) {
         if (this.field3060.hasFinished(725580792)
            && AsyncHttpResponse.method230(this.field3060, 429971928).getResponseCode(-1192392146) == 200
            && this.field3048.isEmpty()) {
            String var1 = HttpResponse.method132(AsyncHttpResponse.method230(this.field3060, 159034287), -127381519);
            if (var1.isEmpty()) {
               return;
            }

            this.field3048 = var1;
         }

         if (959207409 * this.field3045 != 0) {
            this.method5941(1334108036);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ar")
   void method5930(String var1, String var2, String var3) {
      if (961492723 * this.field3052 != 2) {
         this.field3047 = var1;
         this.field3050 = var2;
         this.field3053 = var3;
         if (!this.field3047.endsWith("/")) {
            this.field3047 = this.field3047 + "/";
         }

         if (!this.field3050.equals("")) {
            String var4 = this.field3047;
            var4 = var4 + "session/open/" + this.field3050;
            if (this.field3053.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.field3053;

            try {
               this.field3060 = this.method5954(var4, (byte)-7);
               this.field3051 = ParamComposition.method4949((byte)15) * -3157440718234731451L;
            } catch (IOException var6) {
               this.field3060 = null;
               this.field3050 = "";
               this.field3053 = "";
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("bk")
   public boolean method5951(String var1) {
      method5918(this, 2, var1, 28848685);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lar;")
   @ObfuscatedName("bb")
   AsyncHttpResponse method5956(String var1) throws IOException {
      URL var2 = new URL(var1);
      HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field3066);

      try {
         JSONObject var4 = new JSONObject();
         var3.setPayload(new HttpJsonRequestBody(var4), 917997708);
      } catch (Exception var5) {
      }

      return this.field3061.submitRequest(var3, 205295464);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("ad")
   public void method5920(int var1, String var2) {
      this.field3045 = 2044298388 * var1;
      this.field3062 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lar;")
   @ObfuscatedName("bm")
   AsyncHttpResponse method5957(String var1) throws IOException {
      URL var2 = new URL(var1);
      HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field3066);

      try {
         JSONObject var4 = new JSONObject();
         var3.setPayload(new HttpJsonRequestBody(var4), -561401327);
      } catch (Exception var5) {
      }

      return this.field3061.submitRequest(var3, 934971517);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;I)V")
   @ObfuscatedName("jb")
   static void method5958(WorldView var0, int var1) {
      try {
         int var2 = 1320060371 * client.playerUpdateManager.field1538;
         int[] var3 = client.playerUpdateManager.playerIndices;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1 <= 1809959663) {
               throw new IllegalStateException();
            }

            if (var3[var4] != client.combatTargetPlayerIndex * 1466770191 && -1548864151 * client.localPlayerIndex != var3[var4]) {
               class31.addPlayerToScene(var0, var3[var4], true, 2083769679);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "jj.jb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ac")
   public void method5925(boolean var1) {
      this.field3066 = var1;
      this.field3061 = new AsyncRestClient("crmsession", 1, 1);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;I)[Lxt;")
   @ObfuscatedName("ak")
   public static SpritePixels[] method5949(AbstractArchive var0, String var1, String var2, int var3) {
      try {
         if (!var0.isValidFileName(var1, var2, -1701764866)) {
            if (var3 != -2085797468) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var0.groupLoadPercentByName(var1, (byte)-89);
            int var5 = AbstractArchive.method9022(var0, var4, var2, 1321621639);
            return class69.method1399(var0, var4, var5, 2055707228);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "jj.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ag")
   public void method5926(boolean var1, int var2) {
      try {
         this.field3066 = var1;
         this.field3061 = new AsyncRestClient("crmsession", 1, 1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jj.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("ap")
   public boolean method5952(String var1, int var2) {
      try {
         method5918(this, 2, var1, -801624390);
         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jj.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljj;B)V")
   @ObfuscatedName("wx")
   public static void method5938(class234 var0, byte var1) {
      if (var0 == null) {
         var0.method5939(var1);
      }

      try {
         if (null != var0.field3061) {
            if (var1 >= 14) {
               throw new IllegalStateException();
            }

            AsyncRestClient.method242(var0.field3061, -1162146787);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jj.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   public void method5939(byte var1) {
      try {
         if (null != this.field3061) {
            if (var1 >= 14) {
               throw new IllegalStateException();
            }

            AsyncRestClient.method242(this.field3061, -1162146787);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jj.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aw")
   public void method5948(byte var1) {
      try {
         if (this.field3060 != null) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            if (this.field3060.hasFinished(-659837645)) {
               if (this.field3060.hasFinished(-983923300) && AsyncHttpResponse.method230(this.field3060, -2070169222).getResponseCode(-2144853147) == 200) {
                  if (var1 == -1) {
                     return;
                  }

                  if (this.field3053.isEmpty()) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     String var2 = HttpResponse.method132(AsyncHttpResponse.method230(this.field3060, -875410844), -127381519);
                     if (var2.isEmpty()) {
                        if (var1 == -1) {
                           throw new IllegalStateException();
                        }

                        return;
                     }

                     this.field3048 = var2;
                  }
               }

               if (959207409 * this.field3045 != 0) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  this.method5941(1326173517);
               }

               return;
            }

            if (var1 == -1) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jj.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ab")
   public void method5927(boolean var1) {
      this.field3066 = var1;
      this.field3061 = new AsyncRestClient("crmsession", 1, 1);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V")
   @ObfuscatedName("at")
   public void method5921(int var1, String var2, int var3) {
      try {
         this.field3045 = -376325871 * var1;
         this.field3047 = var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "jj.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljj;Ljava/lang/String;)Z")
   @ObfuscatedName("ic")
   public static boolean method5953(class234 var0, String var1) {
      if (var0 == null) {
         var0.method5930(var1, var1, var1);
      }

      method5918(var0, 2, var1, -1359317260);
      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method5936() {
      if (this.field3060 == null) {
         if (!this.field3047.isEmpty() && 1 == 961492723 * this.field3052) {
            long var1 = ParamComposition.method4949((byte)15);
            long var3 = var1 - this.field3051 * 5148152992387298957L;
            String var5 = this.field3048;
            var5 = var5 + "session/close/" + this.field3062 + "/" + this.field3048;
            if (this.field3048.isEmpty()) {
               var5 = var5 + "?sessionDuration=" + var3;
            } else {
               var5 = var5 + "?userHash=" + this.field3053 + "&sessionDuration=" + var3;
            }

            try {
               this.field3060 = this.method5954(var5, (byte)-3);
            } catch (IOException var7) {
               this.field3052 = 577360443;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
   @ObfuscatedName("an")
   void method5931(String var1, String var2, String var3, byte var4) {
      try {
         if (961492723 * this.field3052 == 2) {
            if (var4 >= -1) {
               throw new IllegalStateException();
            }
         } else {
            this.field3047 = var1;
            this.field3050 = var2;
            this.field3047 = var3;
            if (!this.field3048.endsWith("/")) {
               if (var4 >= -1) {
                  return;
               }

               this.field3047 = this.field3047 + "/";
            }

            if (this.field3047.equals("")) {
               if (var4 >= -1) {
                  throw new IllegalStateException();
               }
            } else {
               String var5 = this.field3062;
               var5 = var5 + "session/open/" + this.field3048;
               if (this.field3053.equals("")) {
               }

               var5 = var5 + "?userHash=" + this.field3047;

               try {
                  this.field3060 = this.method5954(var5, (byte)78);
                  this.field3051 = ParamComposition.method4949((byte)15) * -3157440718234731451L;
               } catch (IOException var7) {
                  this.field3060 = null;
                  this.field3050 = "";
                  this.field3047 = "";
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "jj.an(" + ')');
      }
   }
}
