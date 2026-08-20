import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rq")
public class class463 {
   @ObfuscatedName("au")
   float field5691;
   @ObfuscatedName("at")
   float field5690;
   @ObfuscatedName("ag")
   float field5685;
   @ObfuscatedName("an")
   float field5688;
   @ObfuscatedName("ay")
   float field5694;
   @ObfuscatedName("av")
   float field5692;
   @ObfuscatedName("ak")
   float field5687;
   @ObfuscatedName("aw")
   float field5693;
   @ObfuscatedName("ae")
   float field5684;
   @ObfuscatedSignature(descriptor = "Lrq;")
   @ObfuscatedName("ep")
   public static class463 field5683 = new class463();
   @ObfuscatedName("ap")
   float field5689;
   @ObfuscatedName("aj")
   float field5686;
   @ObfuscatedName("az")
   float field5695;

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("ag")
   public void method9766(float var1, int var2) {
      try {
         float var3 = (float)Math.cos(var1);
         float var4 = (float)Math.sin(var1);
         float var5 = this.field5692;
         float var6 = this.field5688;
         float var7 = this.field5687;
         float var8 = this.field5694;
         this.field5692 = var3 * var5 + var4 * this.field5685;
         this.field5685 = this.field5685 * var3 - var5 * var4;
         this.field5688 = this.field5686 * var4 + var3 * var6;
         this.field5686 = this.field5686 * var3 - var6 * var4;
         this.field5687 = var4 * this.field5689 + var3 * var7;
         this.field5689 = this.field5689 * var3 - var4 * var7;
         this.field5694 = this.field5695 * var4 + var3 * var8;
         this.field5695 = this.field5695 * var3 - var4 * var8;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "rq.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrq;)V")
   @ObfuscatedName("pd")
   public static void method9760(class463 var0) {
      if (var0 == null) {
         var0.method9762();
      } else {
         var0.field5695 = 0.0F;
         var0.field5691 = 0.0F;
         var0.field5694 = 0.0F;
         var0.field5693 = 0.0F;
         var0.field5687 = 0.0F;
         var0.field5686 = 0.0F;
         var0.field5688 = 0.0F;
         var0.field5685 = 0.0F;
         var0.field5690 = 0.0F;
         var0.field5689 = 1.0F;
         var0.field5684 = 1.0F;
         var0.field5692 = 1.0F;
      }
   }

   @Override
   public String toString() {
      try {
         return this.field5692
            + ","
            + this.field5688
            + ","
            + this.field5687
            + ","
            + this.field5694
            + "\n"
            + this.field5690
            + ","
            + this.field5684
            + ","
            + this.field5693
            + ","
            + this.field5691
            + "\n"
            + this.field5685
            + ","
            + this.field5686
            + ","
            + this.field5689
            + ","
            + this.field5695;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "rq.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("hj")
   static void method9785(short var0) {
      try {
         String var2;
         label28: {
            class234.accessToken = client.method2321("JX_ACCESS_TOKEN");
            client.refreshToken = client.method2321("JX_REFRESH_TOKEN");
            client.method2116(-1);
            PlayerUpdateManager.sessionId = client.method2321("JX_SESSION_ID");
            Message.characterId = client.method2321("JX_CHARACTER_ID");
            String var1 = client.method2321("JX_DISPLAY_NAME");
            if (var1 != null && !var1.isEmpty()) {
               if (var1.charAt(0) != '#') {
                  var2 = var1;
                  break label28;
               }

               if (var0 == 2340) {
                  throw new IllegalStateException();
               }
            }

            var2 = "";
         }

         Login.displayName = var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rq.hj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrq;FI)V")
   @ObfuscatedName("sd")
   public static void method9764(class463 var0, float var1, int var2) {
      if (var0 == null) {
         var0.method9773(var1, var2);
      } else {
         try {
            float var3 = (float)Math.cos(var1);
            float var4 = (float)Math.sin(var1);
            float var5 = var0.field5690;
            float var6 = var0.field5684;
            float var7 = var0.field5693;
            float var8 = var0.field5691;
            var0.field5690 = var3 * var5 - var0.field5685 * var4;
            var0.field5685 = var3 * var0.field5685 + var4 * var5;
            var0.field5684 = var3 * var6 - var4 * var0.field5686;
            var0.field5686 = var4 * var6 + var3 * var0.field5686;
            var0.field5693 = var3 * var7 - var4 * var0.field5689;
            var0.field5689 = var4 * var7 + var3 * var0.field5689;
            var0.field5691 = var3 * var8 - var0.field5695 * var4;
            var0.field5695 = var3 * var0.field5695 + var4 * var8;
         } catch (RuntimeException var9) {
            throw RestClientThreadFactory.newRunException(var9, "rq.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("nk")
   public void method9786(float var1) {
      method9764(this, var1, -1314816461);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;)V")
   @ObfuscatedName("bj")
   public static void method9783(Varcs var0) {
      if (var0 == null) {
         var0.method3160();
      }

      if (var0.unwrittenChanges && var0.field1386 < ParamComposition.method4949((byte)15) - 60000L) {
         var0.write(1961155964);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrq;F)V")
   @ObfuscatedName("gf")
   public static void method9767(class463 var0, float var1) {
      if (var0 == null) {
         var0.method9789(var1);
      } else {
         float var2 = (float)Math.cos(var1);
         float var3 = (float)Math.sin(var1);
         float var4 = var0.field5692;
         float var5 = var0.field5688;
         float var6 = var0.field5687;
         float var7 = var0.field5694;
         var0.field5692 = var2 * var4 + var3 * var0.field5685;
         var0.field5685 = var0.field5685 * var2 - var4 * var3;
         var0.field5688 = var0.field5686 * var3 + var2 * var5;
         var0.field5686 = var0.field5686 * var2 - var5 * var3;
         var0.field5687 = var3 * var0.field5689 + var2 * var6;
         var0.field5689 = var0.field5689 * var2 - var3 * var6;
         var0.field5694 = var0.field5695 * var3 + var2 * var7;
         var0.field5695 = var0.field5695 * var2 - var3 * var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("ai")
   public void method9774(float var1, float var2, float var3) {
      this.field5694 += var1;
      this.field5691 += var2;
      this.field5695 += var3;
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("ae")
   public void method9775(float var1, float var2, float var3, int var4) {
      try {
         this.field5694 += var1;
         this.field5691 += var2;
         this.field5695 += var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "rq.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method9761(int var1) {
      try {
         this.field5695 = 0.0F;
         this.field5691 = 0.0F;
         this.field5694 = 0.0F;
         this.field5693 = 0.0F;
         this.field5687 = 0.0F;
         this.field5686 = 0.0F;
         this.field5688 = 0.0F;
         this.field5685 = 0.0F;
         this.field5690 = 0.0F;
         this.field5689 = 1.0F;
         this.field5684 = 1.0F;
         this.field5692 = 1.0F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rq.av(" + ')');
      }
   }

   static {
      new class463();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;)V")
   @ObfuscatedName("ao")
   public static void method9770(class46 var0) {
      var0.field175.clear();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method9779() {
      return this.field5692
         + ","
         + this.field5688
         + ","
         + this.field5687
         + ","
         + this.field5694
         + "\n"
         + this.field5690
         + ","
         + this.field5684
         + ","
         + this.field5693
         + ","
         + this.field5691
         + "\n"
         + this.field5685
         + ","
         + this.field5686
         + ","
         + this.field5689
         + ","
         + this.field5695;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("zq")
   public void method9787() {
      this.method9761(120877745);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;C)I")
   @ObfuscatedName("gw")
   public static int method9763(class28 var0, char var1) {
      if (var0 == null) {
         var0.method506(var1);
      }

      return var0.method522(var1, -1005624215) ? var0.field159[var1] : 0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method9780() {
      return this.field5692
         + ","
         + this.field5688
         + ","
         + this.field5687
         + ","
         + this.field5694
         + "\n"
         + this.field5690
         + ","
         + this.field5684
         + ","
         + this.field5693
         + ","
         + this.field5691
         + "\n"
         + this.field5685
         + ","
         + this.field5686
         + ","
         + this.field5689
         + ","
         + this.field5695;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;Z)V")
   @ObfuscatedName("bd")
   public static void method9784(ClientPreferences var0, boolean var1) {
      if (var0 == null) {
         var0.method1596();
      }

      var0.field622 = var1;
      Player.savePreferences((byte)-57);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("vp")
   public void method9788(float var1, float var2, float var3) {
      this.method9775(var1, var2, var3, 1932432107);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method9762() {
      this.field5695 = 0.0F;
      this.field5691 = 0.0F;
      this.field5694 = 0.0F;
      this.field5693 = 0.0F;
      this.field5687 = 0.0F;
      this.field5686 = 0.0F;
      this.field5688 = 0.0F;
      this.field5685 = 0.0F;
      this.field5690 = 0.0F;
      this.field5689 = 1.0F;
      this.field5684 = 1.0F;
      this.field5692 = 1.0F;
   }

   public class463() {
      this.method9761(120877745);
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("aw")
   public void method9765(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = this.field5690;
      float var5 = this.field5684;
      float var6 = this.field5693;
      float var7 = this.field5691;
      this.field5690 = var2 * var4 - this.field5685 * var3;
      this.field5685 = var2 * this.field5685 + var3 * var4;
      this.field5684 = var2 * var5 - var3 * this.field5686;
      this.field5686 = var3 * var5 + var2 * this.field5686;
      this.field5693 = var2 * var6 - var3 * this.field5689;
      this.field5689 = var3 * var6 + var2 * this.field5689;
      this.field5691 = var2 * var7 - this.field5695 * var3;
      this.field5695 = var2 * this.field5695 + var3 * var7;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("fa")
   public void method9789(float var1) {
      this.method9766(var1, -1739121717);
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("ay")
   public void method9768(float var1) {
      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = this.field5692;
      float var5 = this.field5688;
      float var6 = this.field5687;
      float var7 = this.field5694;
      this.field5692 = var2 * var4 + var3 * this.field5685;
      this.field5685 = this.field5685 * var2 - var4 * var3;
      this.field5688 = this.field5686 * var3 + var2 * var5;
      this.field5686 = this.field5686 * var2 - var5 * var3;
      this.field5687 = var3 * this.field5689 + var2 * var6;
      this.field5689 = this.field5689 * var2 - var3 * var6;
      this.field5694 = this.field5695 * var3 + var2 * var7;
      this.field5695 = this.field5695 * var2 - var3 * var7;
   }

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("an")
   void method9771(float var1, int var2) {
      try {
         float var3 = (float)Math.cos(var1);
         float var4 = (float)Math.sin(var1);
         float var5 = this.field5692;
         float var6 = this.field5688;
         float var7 = this.field5687;
         float var8 = this.field5694;
         this.field5692 = var5 * var3 - this.field5690 * var4;
         this.field5690 = var5 * var4 + this.field5690 * var3;
         this.field5688 = var6 * var3 - var4 * this.field5684;
         this.field5684 = var4 * var6 + this.field5684 * var3;
         this.field5687 = var7 * var3 - var4 * this.field5693;
         this.field5693 = var7 * var4 + var3 * this.field5693;
         this.field5694 = var3 * var8 - this.field5691 * var4;
         this.field5691 = var8 * var4 + var3 * this.field5691;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "rq.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrq;F)V")
   @ObfuscatedName("wg")
   public static void method9772(class463 var0, float var1) {
      if (var0 == null) {
         var0.method9780();
      }

      float var2 = (float)Math.cos(var1);
      float var3 = (float)Math.sin(var1);
      float var4 = var0.field5692;
      float var5 = var0.field5688;
      float var6 = var0.field5687;
      float var7 = var0.field5694;
      var0.field5692 = var4 * var2 - var0.field5690 * var3;
      var0.field5690 = var4 * var3 + var0.field5690 * var2;
      var0.field5688 = var5 * var2 - var3 * var0.field5684;
      var0.field5684 = var3 * var5 + var0.field5684 * var2;
      var0.field5687 = var6 * var2 - var3 * var0.field5693;
      var0.field5693 = var6 * var3 + var2 * var0.field5693;
      var0.field5694 = var2 * var7 - var0.field5691 * var3;
      var0.field5691 = var7 * var3 + var2 * var0.field5691;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("az")
   public void method9776(float var1, float var2, float var3) {
      this.field5694 += var1;
      this.field5691 += var2;
      this.field5695 += var3;
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("ou")
   public void method9790(float var1) {
      this.method9771(var1, 517638479);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("ad")
   public void method9777(float var1, float var2, float var3) {
      this.field5694 += var1;
      this.field5691 += var2;
      this.field5695 += var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrq;)Ljava/lang/String;")
   @ObfuscatedName("cq")
   public static String method9781(class463 var0) {
      return var0 == null
         ? var0.method9782()
         : var0.field5692
            + ","
            + var0.field5688
            + ","
            + var0.field5687
            + ","
            + var0.field5694
            + "\n"
            + var0.field5690
            + ","
            + var0.field5684
            + ","
            + var0.field5693
            + ","
            + var0.field5691
            + "\n"
            + var0.field5685
            + ","
            + var0.field5686
            + ","
            + var0.field5689
            + ","
            + var0.field5695;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("as")
   public void method9778(float var1, float var2, float var3) {
      this.field5694 += var1;
      this.field5691 += var2;
      this.field5695 += var3;
   }

   @ObfuscatedSignature(descriptor = "(IB)Lhi;")
   @ObfuscatedName("at")
   public static WorldMapElement WorldMapElement_get(int var0, byte var1) {
      try {
         if (var0 >= 0) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            if (var0 < WorldMapElement.WorldMapElement_cached.length) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               if (null != WorldMapElement.WorldMapElement_cached[var0]) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  return WorldMapElement.WorldMapElement_cached[var0];
               }
            }
         }

         return new WorldMapElement(var0);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rq.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("at")
   public void method9773(float var1, int var2) {
      try {
         float var3 = (float)Math.cos(var1);
         float var4 = (float)Math.sin(var1);
         float var5 = this.field5692;
         float var6 = this.field5691;
         float var7 = this.field5692;
         float var8 = this.field5691;
         this.field5694 = var5 * var3 - this.field5695 * var4;
         this.field5687 = var5 * var4 + this.field5685 * var3;
         this.field5691 = var6 * var3 - var4 * this.field5685;
         this.field5694 = var4 * var6 + this.field5685 * var3;
         this.field5687 = var7 * var3 - var4 * this.field5684;
         this.field5687 = var7 * var4 + var3 * this.field5692;
         this.field5690 = var3 * var8 - this.field5689 * var4;
         this.field5687 = var8 * var4 + var3 * this.field5695;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "rq.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method9782() {
      return this.field5693
         + ","
         + this.field5694
         + ","
         + this.field5693
         + ","
         + this.field5689
         + "\n"
         + this.field5685
         + ","
         + this.field5694
         + ","
         + this.field5691
         + ","
         + this.field5685
         + "\n"
         + this.field5684
         + ","
         + this.field5688
         + ","
         + this.field5686
         + ","
         + this.field5690;
   }
}
