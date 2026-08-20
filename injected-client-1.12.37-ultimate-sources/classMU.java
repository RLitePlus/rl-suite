import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONObject;

@ObfuscatedName("mu")
public class classMU {
   @ObfuscatedName("al")
   String field4592;
   @ObfuscatedName("aa")
   String field4596;
   @ObfuscatedName("ao")
   String field4591;
   @ObfuscatedSignature(descriptor = "Lmu;")
   @ObfuscatedName("ag")
   static final classMU field4587 = new classMU();
   @ObfuscatedName("as")
   final int field4595 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4599 = 0;
   @ObfuscatedName("ac")
   String field4590;
   @ObfuscatedName("aj")
   long field4593;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field4598 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field4597 = 3;
   @ObfuscatedName("ax")
   final int field4589 = 2;
   @ObfuscatedSignature(descriptor = "Lqd;")
   @ObfuscatedName("ay")
   classQD field4601;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aq")
   classQM field4602;
   @ObfuscatedName("ad")
   int field4594;
   @ObfuscatedName("ap")
   int field4588;
   @ObfuscatedName("au")
   String field4600;
   @ObfuscatedName("ai")
   boolean field4603;

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ae")
   public void method7701(boolean var1, int var2) {
      try {
         this.field4603 = var1;
         this.field4601 = new classQD("crmsession", 1, 1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mu.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmu;ILjava/lang/String;B)V")
   @ObfuscatedName("cz")
   public static void method7696(classMU var0, int var1, String var2, byte var3) {
      if (var0 == null) {
         var0.method7700(var1, var2, var3);
      }

      try {
         var0.field4588 = var1 * 2100917943;
         var0.field4600 = var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mu.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("bc")
   public boolean method7721(String var1) {
      method7696(this, 2, var1, (byte)10);
      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public void method7717() {
      if (this.field4602 != null && this.field4602.method9646((byte)-4)) {
         if (this.field4602.method9646((byte)-51) && classQG.method9504(this.field4602.method9651(1325078424), -1146707731) == 200 && this.field4592.isEmpty()) {
            String var1 = this.field4602.method9651(-1466561486).method9517(318046972);
            if (var1.isEmpty()) {
               return;
            }

            this.field4592 = var1;
         }

         if (0 != 1065830151 * this.field4588) {
            this.method7713(1508679445);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmu;Ljava/lang/String;I)Z")
   @ObfuscatedName("xv")
   public static boolean method7722(classMU var0, String var1, int var2) {
      if (var0 == null) {
         return var0.method7724(var1, var2);
      } else {
         try {
            method7696(var0, 2, var1, (byte)10);
            return true;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "mu.aa(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method7713(int var1) {
      try {
         if (this.field4592.isEmpty()) {
            if (var1 == -890289400) {
               throw new IllegalStateException();
            }
         } else {
            String var2 = "";
            switch (1065830151 * this.field4588) {
               case 1:
                  var2 = "events/click";
                  break;
               case 2:
                  var2 = "events/dismissed";
                  break;
               case 3:
                  var2 = "events/impression";
            }

            if (!this.field4600.isEmpty()) {
               String var3 = this.field4590;
               var3 = var3 + var2 + "/" + this.field4596 + "/" + this.field4592 + "/" + this.field4600 + "?userHash=" + this.field4591;

               try {
                  this.field4602 = this.method7725(var3, (byte)20);
               } catch (IOException var5) {
                  this.field4594 = -616310729;
               }

               this.field4594 = -616310729;
               this.field4588 = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "mu.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laae;)I")
   @ObfuscatedName("hd")
   public static int method7709(classAAE var0) {
      return null == var0.field41 ? 0 : var0.field41.hashCode();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ac")
   public void method7718(byte var1) {
      try {
         if (this.field4602 != null) {
            if (var1 <= 1) {
               return;
            }

            if (this.field4602.method9646((byte)26)) {
               if (this.field4602.method9646((byte)-50) && classQG.method9504(this.field4602.method9651(-326757245), -1146707731) == 200) {
                  if (var1 <= 1) {
                     return;
                  }

                  if (this.field4592.isEmpty()) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     String var2 = this.field4602.method9651(75473486).method9517(-1249299537);
                     if (var2.isEmpty()) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        return;
                     }

                     this.field4592 = var2;
                  }
               }

               if (0 != 1065830151 * this.field4588) {
                  if (var1 <= 1) {
                     return;
                  }

                  this.method7713(-1701150183);
               }

               return;
            }

            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mu.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lmu;")
   @ObfuscatedName("aq")
   public static classMU method7692() {
      return field4587;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lmu;")
   @ObfuscatedName("al")
   public static classMU method7693() {
      return field4587;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lmu;")
   @ObfuscatedName("aj")
   public static classMU method7694() {
      return field4587;
   }

   @ObfuscatedSignature(descriptor = "(Lmu;I)V")
   @ObfuscatedName("ay")
   public static void method7710(classMU var0, int var1) {
      if (var0 == null) {
         var0.method7716(var1);
      } else {
         try {
            if (null == var0.field4602) {
               if (!var0.field4592.isEmpty()) {
                  if (var1 == 1333907154) {
                     return;
                  }

                  if (1 == var0.field4594 * -1019519609) {
                     long var2 = classDD.method2983(16711680);
                     long var4 = var2 - -7570363771333412009L * var0.field4593;
                     String var6 = var0.field4590;
                     var6 = var6 + "session/close/" + var0.field4596 + "/" + var0.field4592;
                     if (var0.field4591.isEmpty()) {
                        if (var1 == 1333907154) {
                           throw new IllegalStateException();
                        }

                        var6 = var6 + "?sessionDuration=" + var4;
                     } else {
                        var6 = var6 + "?userHash=" + var0.field4591 + "&sessionDuration=" + var4;
                     }

                     try {
                        var0.field4602 = var0.method7725(var6, (byte)118);
                     } catch (IOException var8) {
                        var0.field4594 = -616310729;
                     }
                  }
               }
            }
         } catch (RuntimeException var9) {
            throw classEG.method3884(var9, "mu.ag(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lmu;")
   @ObfuscatedName("ay")
   public static classMU method7695() {
      return field4587;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   public void method7719() {
      if (this.field4602 != null && this.field4602.method9646((byte)-10)) {
         if (this.field4602.method9646((byte)-38) && classQG.method9504(this.field4602.method9651(-1494242309), -1146707731) == 200 && this.field4592.isEmpty()
            )
          {
            String var1 = this.field4602.method9651(1210808534).method9517(-425277087);
            if (var1.isEmpty()) {
               return;
            }

            this.field4592 = var1;
         }

         if (0 != 1065830151 * this.field4588) {
            this.method7713(-1226087021);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("ad")
   public void method7697(int var1, String var2) {
      this.field4588 = var1 * 2100917943;
      this.field4600 = var2;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("ap")
   public void method7698(int var1, String var2) {
      this.field4588 = var1 * 2100917943;
      this.field4600 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("at")
   void method7705(String var1, String var2, String var3) {
      if (-1019519609 * this.field4594 != 2) {
         this.field4590 = var1;
         this.field4596 = var2;
         this.field4591 = var3;
         if (!this.field4590.endsWith("/")) {
            this.field4590 = this.field4590 + "/";
         }

         if (!this.field4596.equals("")) {
            String var4 = this.field4590;
            var4 = var4 + "session/open/" + this.field4596;
            if (this.field4591.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.field4591;

            try {
               this.field4602 = this.method7725(var4, (byte)121);
               this.field4593 = classDD.method2983(16711680) * -7959198196523491225L;
            } catch (IOException var6) {
               this.field4602 = null;
               this.field4596 = "";
               this.field4591 = "";
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ai")
   public void method7702(boolean var1) {
      this.field4603 = var1;
      this.field4601 = new classQD("crmsession", 1, 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmu;Z)V")
   @ObfuscatedName("aa")
   public static void method7703(classMU var0, boolean var1) {
      if (var0 == null) {
         var0.method7714();
      } else {
         var0.field4603 = var1;
         var0.field4601 = new classQD("crmsession", 1, 1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmu;B)V")
   @ObfuscatedName("hz")
   public static void method7711(classMU var0, byte var1) {
      if (var0 == null) {
         var0.method7712(var1);
      } else {
         try {
            if (var0.field4601 != null) {
               if (var1 == 3) {
                  throw new IllegalStateException();
               }

               var0.field4601.method9488((byte)64);
            }
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "mu.as(" + ')');
         }
      }
   }

   classMU() {
      this.field4590 = "";
      this.field4596 = "";
      this.field4591 = "";
      this.field4592 = "";
      this.field4593 = 7959198196523491225L;
      this.field4594 = -616310729;
      this.field4588 = 0;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("au")
   public void method7699(int var1, String var2) {
      this.field4588 = var1 * -690347324;
      this.field4600 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Lqm;")
   @ObfuscatedName("ao")
   classQM method7725(String var1, byte var2) throws IOException {
      try {
         URL var3 = new URL(var1);
         classQA var4 = new classQA(var3, classQQ.field5587, this.field4603);

         try {
            JSONObject var5 = new JSONObject();
            var4.method9418(new classWE(var5), -1687985292);
         } catch (Exception var6) {
         }

         return this.field4601.method9487(var4, -2142603026);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "mu.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmu;Ljava/lang/String;)Lqm;")
   @ObfuscatedName("xg")
   public static classQM method7726(classMU var0, String var1) throws IOException {
      if (var0 == null) {
         return var0.method7727(var1);
      } else {
         URL var2 = new URL(var1);
         classQA var3 = new classQA(var2, classQQ.field5587, var0.field4603);

         try {
            JSONObject var4 = new JSONObject();
            var3.method9418(new classWE(var4), 303547196);
         } catch (Exception var5) {
         }

         return var0.field4601.method9487(var3, -639997526);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method7714() {
      if (!this.field4592.isEmpty()) {
         String var1 = "";
         switch (1065830151 * this.field4588) {
            case 1:
               var1 = "events/click";
               break;
            case 2:
               var1 = "events/dismissed";
               break;
            case 3:
               var1 = "events/impression";
         }

         if (!this.field4600.isEmpty()) {
            String var2 = this.field4590;
            var2 = var2 + var1 + "/" + this.field4596 + "/" + this.field4592 + "/" + this.field4600 + "?userHash=" + this.field4591;

            try {
               this.field4602 = this.method7725(var2, (byte)59);
            } catch (IOException var4) {
               this.field4594 = -616310729;
            }

            this.field4594 = -616310729;
            this.field4588 = 0;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("pk")
   public static void method7706(classMU var0, String var1, String var2, String var3) {
      if (var0 == null) {
         var0.method7714();
      } else if (-1019519609 * var0.field4594 != 2) {
         var0.field4590 = var1;
         var0.field4596 = var2;
         var0.field4591 = var3;
         if (!var0.field4590.endsWith("/")) {
            var0.field4590 = var0.field4590 + "/";
         }

         if (!var0.field4596.equals("")) {
            String var4 = var0.field4590;
            var4 = var4 + "session/open/" + var0.field4596;
            if (var0.field4591.equals("")) {
            }

            var4 = var4 + "?userHash=" + var0.field4591;

            try {
               var0.field4602 = var0.method7725(var4, (byte)88);
               var0.field4593 = classDD.method2983(16711680) * -7959198196523491225L;
            } catch (IOException var6) {
               var0.field4602 = null;
               var0.field4596 = "";
               var0.field4591 = "";
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bx")
   public void method7720() {
      if (this.field4602 != null && this.field4602.method9646((byte)21)) {
         if (this.field4602.method9646((byte)-7)
            && classQG.method9504(this.field4602.method9651(1209421855), -1146707731) == 2067719950
            && this.field4592.isEmpty()) {
            String var1 = this.field4602.method9651(-587445950).method9517(-365523304);
            if (var1.isEmpty()) {
               return;
            }

            this.field4592 = var1;
         }

         if (0 != -1302058492 * this.field4588) {
            this.method7713(-1606908458);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ar")
   public void method7704(boolean var1) {
      this.field4603 = var1;
      this.field4601 = new classQD("crmsession", 1, 1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lqm;")
   @ObfuscatedName("bg")
   classQM method7727(String var1) throws IOException {
      URL var2 = new URL(var1);
      classQA var3 = new classQA(var2, classQQ.field5587, this.field4603);

      try {
         JSONObject var4 = new JSONObject();
         var3.method9418(new classWE(var4), -1619499864);
      } catch (Exception var5) {
      }

      return this.field4601.method9487(var3, -845223471);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("bp")
   public boolean method7723(String var1) {
      method7696(this, 2, var1, (byte)10);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ak")
   void method7707(String var1, String var2, String var3) {
      if (-1019519609 * this.field4594 != 2) {
         this.field4590 = var1;
         this.field4596 = var2;
         this.field4591 = var3;
         if (!this.field4590.endsWith("/")) {
            this.field4590 = this.field4590 + "/";
         }

         if (!this.field4596.equals("")) {
            String var4 = this.field4590;
            var4 = var4 + "session/open/" + this.field4596;
            if (this.field4591.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.field4591;

            try {
               this.field4602 = this.method7725(var4, (byte)75);
               this.field4593 = classDD.method2983(16711680) * -7959198196523491225L;
            } catch (IOException var6) {
               this.field4602 = null;
               this.field4596 = "";
               this.field4591 = "";
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   void method7715() {
      if (!this.field4592.isEmpty()) {
         String var1 = "";
         switch (1065830151 * this.field4588) {
            case 1:
               var1 = "events/click";
               break;
            case 2:
               var1 = "events/dismissed";
               break;
            case 3:
               var1 = "events/impression";
         }

         if (!this.field4600.isEmpty()) {
            String var2 = this.field4590;
            var2 = var2 + var1 + "/" + this.field4596 + "/" + this.field4592 + "/" + this.field4600 + "?userHash=" + this.field4591;

            try {
               this.field4602 = this.method7725(var2, (byte)61);
            } catch (IOException var4) {
               this.field4594 = -616310729;
            }

            this.field4594 = -616310729;
            this.field4588 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("ab")
   void method7708(String var1, String var2, String var3, int var4) {
      try {
         if (-1019519609 * this.field4594 == 2) {
            if (var4 == 1872477243) {
               throw new IllegalStateException();
            }
         } else {
            this.field4590 = var1;
            this.field4596 = var2;
            this.field4591 = var3;
            if (!this.field4590.endsWith("/")) {
               if (var4 == 1872477243) {
                  throw new IllegalStateException();
               }

               this.field4590 = this.field4590 + "/";
            }

            if (this.field4596.equals("")) {
               if (var4 == 1872477243) {
                  throw new IllegalStateException();
               }
            } else {
               String var5 = this.field4590;
               var5 = var5 + "session/open/" + this.field4596;
               if (!this.field4591.equals("") || var4 != 1872477243) {
                  var5 = var5 + "?userHash=" + this.field4591;

                  try {
                     this.field4602 = this.method7725(var5, (byte)118);
                     this.field4593 = classDD.method2983(16711680) * -7959198196523491225L;
                  } catch (IOException var7) {
                     this.field4602 = null;
                     this.field4596 = "";
                     this.field4591 = "";
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "mu.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lom;")
   @ObfuscatedName("ae")
   public static classOM method7729(int var0, int var1) {
      synchronized (classOM.field4966) {
         int var4 = var0;
         int var5 = 1883040848;

         classOM var10000;
         try {
            classOM var6 = (classOM)classOM.field4966.method6422(var4);
            if (null != var6) {
               if (var5 <= 1234964183) {
                  throw new IllegalStateException();
               }

               var10000 = var6;
            } else {
               byte[] var7 = classAK.field213.method11867(6, var4, -1962631827);
               var6 = new classOM(new classXY(var7), var4, true);
               classOM.field4966.method6428(var6, var4);
               var10000 = var6;
            }
         } catch (RuntimeException var8) {
            throw classEG.method3884(var8, "mu.ae(" + ')');
         }

         return var10000;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)V")
   @ObfuscatedName("af")
   public void method7700(int var1, String var2, byte var3) {
      try {
         this.field4594 = var1 * 2100917943;
         this.field4596 = var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mu.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   public void method7712(byte var1) {
      try {
         if (this.field4601 != null) {
            if (var1 == 3) {
               throw new IllegalStateException();
            }

            this.field4601.method9488((byte)64);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mu.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmu;Ljava/lang/String;)Lqm;")
   @ObfuscatedName("hz")
   public static classQM method7728(classMU var0, String var1) throws IOException {
      if (var0 == null) {
         var0.method7705(var1, var1, var1);
      }

      URL var2 = new URL(var1);
      classQA var3 = new classQA(var2, classQQ.field5587, var0.field4603);

      try {
         JSONObject var4 = new JSONObject();
         var3.method9418(new classWE(var4), -1356055602);
      } catch (Exception var5) {
      }

      return var0.field4601.method9487(var3, -429891255);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("aa")
   public boolean method7724(String var1, int var2) {
      try {
         method7696(this, 2, var1, (byte)10);
         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mu.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public void method7716(int var1) {
      try {
         if (this.field4596.isEmpty()) {
            if (var1 == -890289400) {
               throw new IllegalStateException();
            }
         } else {
            String var2 = "";
            switch (1065830151 * this.field4594) {
               case 1:
                  var2 = "events/click";
                  break;
               case 2:
                  var2 = "events/dismissed";
                  break;
               case 3:
                  var2 = "events/impression";
            }

            if (!this.field4596.isEmpty()) {
               String var3 = this.field4591;
               var3 = var3 + var2 + "/" + this.field4592 + "/" + this.field4592 + "/" + this.field4596 + "?userHash=" + this.field4596;

               try {
                  this.field4602 = this.method7725(var3, (byte)20);
               } catch (IOException var5) {
                  this.field4588 = -616310729;
               }

               this.field4594 = -616310729;
               this.field4594 = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "mu.ax(" + ')');
      }
   }
}
