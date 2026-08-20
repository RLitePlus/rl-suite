import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qy")
public class classQY {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final String field5628 = "Accept";
   @ObfuscatedName("as")
   final DecimalFormat field5626;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final String field5629 = "Content-Type";
   @ObfuscatedName("ag")
   final Map field5624;
   @ObfuscatedName("ab")
   final Map field5625 = new HashMap();
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   public static final int field5627 = 72;

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HttpsURLConnection;B)V")
   @ObfuscatedName("az")
   public void method9844(HttpsURLConnection var1, byte var2) {
      try {
         Iterator var3 = this.field5625.entrySet().iterator();

         while (var3.hasNext()) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            Entry var4 = (Entry)var3.next();
            var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "qy.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;S)V")
   @ObfuscatedName("ae")
   public void method9851(String var1, String var2, short var3) {
      try {
         if (null != var1) {
            if (var3 <= 151) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               if (var3 <= 151) {
                  throw new IllegalStateException();
               }

               String var10002;
               if (null != var2) {
                  if (var3 <= 151) {
                     return;
                  }

                  var10002 = var2;
               } else {
                  var10002 = "";
               }

               this.field5625.put(var1, var10002);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "qy.ae(" + ')');
      }
   }

   public classQY() {
      this.field5624 = new HashMap();
      this.field5626 = new DecimalFormat();
      this.field5626.setMaximumFractionDigits(2);
   }

   @ObfuscatedSignature(descriptor = "(Lqb;Ljava/lang/String;)V")
   @ObfuscatedName("ar")
   void method9854(classQB var1, String var2) {
      String var3 = String.format("%s %s", classQB.method9432(var1, -1995884178), var2);
      this.method9851("Authorization", var3, (short)10575);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("ax")
   public void method9862(String var1, byte var2) {
      try {
         method9857(this, classQB.field5512, var1, -1638196283);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qy.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqy;I)V")
   @ObfuscatedName("uy")
   public static void method9867(classQY var0, int var1) {
      if (var0 == null) {
         var0.method9870(var1);
      } else {
         try {
            var0.field5625.remove("Content-Type");
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "qy.aa(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqy;Ljava/lang/String;B)V")
   @ObfuscatedName("jm")
   public static void method9858(classQY var0, String var1, byte var2) {
      if (var0 == null) {
         var0.method9861(var1, var2);
      } else {
         try {
            method9857(var0, classQB.field5511, var1, -38291990);
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "qy.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwy;B)V")
   @ObfuscatedName("ac")
   public void method9865(classWY var1, byte var2) {
      try {
         this.field5625.put("Content-Type", classWY.method12637(var1, -1999936381));
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qy.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/String;")
   @ObfuscatedName("af")
   public static String method9847(int var0, byte var1) {
      try {
         return "<col=" + Integer.toHexString(var0) + ">";
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qy.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwy;I)V")
   @ObfuscatedName("ao")
   public void method9871(classWY var1, int var2) {
      try {
         this.method9874(var1, 1.0F, 2016173534);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qy.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwy;FI)V")
   @ObfuscatedName("al")
   void method9874(classWY var1, float var2, int var3) {
      try {
         this.field5624.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
         method9882(this, -1828246286);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "qy.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ay")
   String method9883(int var1) {
      try {
         ArrayList var2 = new ArrayList(this.field5624.entrySet());
         Collections.sort(var2, new classQX(this));
         StringBuilder var3 = new StringBuilder();
         Iterator var4 = var2.iterator();

         while (var4.hasNext()) {
            if (var1 >= 1179829004) {
               throw new IllegalStateException();
            }

            Entry var5 = (Entry)var4.next();
            if (var3.length() > 0) {
               if (var1 >= 1179829004) {
                  throw new IllegalStateException();
               }

               var3.append(",");
            }

            var3.append(classWY.method12637((classWY)var5.getKey(), 841183347));
            float var6 = (Float)var5.getValue();
            if (var6 < 1.0F) {
               if (var1 >= 1179829004) {
                  throw new IllegalStateException();
               }

               String var7 = this.field5626.format(var6);
               var3.append(";q=").append(var7);
            }
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "qy.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;Lwy;F)V")
   @ObfuscatedName("gb")
   public static void method9875(classQY var0, classWY var1, float var2) {
      var0.field5624.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      method9882(var0, -1828246286);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("av")
   public void method9859(String var1) {
      method9857(this, classQB.field5511, var1, 12461873);
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HttpsURLConnection;)V")
   @ObfuscatedName("ad")
   public void method9845(HttpsURLConnection var1) {
      for (Entry var3 : this.field5625.entrySet()) {
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ab")
   public void method9853(String var1, int var2) {
      try {
         if (var1 != null) {
            if (var2 <= -1190919909) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               if (var2 <= -1190919909) {
                  return;
               }

               this.field5625.remove(var1);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qy.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("au")
   public void method9852(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.field5625.put(var1, null != var2 ? var2 : "");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqb;Ljava/lang/String;)V")
   @ObfuscatedName("aw")
   void method9855(classQB var1, String var2) {
      String var3 = String.format("%s %s", classQB.method9432(var1, -1995884178), var2);
      this.method9851("Authorization", var3, (short)14833);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ak")
   public void method9860(String var1) {
      method9857(this, classQB.field5511, var1, 1409233758);
   }

   @ObfuscatedSignature(descriptor = "(Lqy;B)Ljava/util/Map;")
   @ObfuscatedName("bb")
   public static Map method9848(classQY var0, byte var1) {
      if (var0 == null) {
         return var0.method9850(var1);
      } else {
         try {
            return var0.field5625;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "qy.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HttpsURLConnection;)V")
   @ObfuscatedName("aq")
   public void method9846(HttpsURLConnection var1) {
      for (Entry var3 : this.field5625.entrySet()) {
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("at")
   public void method9863(String var1) {
      method9857(this, classQB.field5512, var1, -690167923);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("an")
   public void method9864(String var1) {
      method9857(this, classQB.field5512, var1, -798980611);
   }

   @ObfuscatedSignature(descriptor = "(Lwy;)V")
   @ObfuscatedName("bx")
   public void method9866(classWY var1) {
      this.field5625.put("Content-Type", classWY.method12637(var1, -449720529));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   public void method9868() {
      this.field5625.remove("Content-Type");
   }

   @ObfuscatedSignature(descriptor = "(Lwy;)V")
   @ObfuscatedName("bc")
   public void method9872(classWY var1) {
      this.method9874(var1, 1.0F, 1956766109);
   }

   @ObfuscatedSignature(descriptor = "(Lwy;)V")
   @ObfuscatedName("am")
   public void method9873(classWY var1) {
      this.method9874(var1, 1.0F, 2107764056);
   }

   @ObfuscatedSignature(descriptor = "(Lwy;F)V")
   @ObfuscatedName("br")
   void method9876(classWY var1, float var2) {
      this.field5624.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      method9882(this, -1828246286);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   void method9878() {
      this.field5625.remove("Accept");
      if (!this.field5624.isEmpty()) {
         this.field5625.put("Accept", this.method9883(-833882570));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;)V")
   @ObfuscatedName("ri")
   public static void method9869(classQY var0) {
      if (var0 == null) {
         var0.method9880();
      }

      var0.field5625.remove("Content-Type");
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   void method9879() {
      this.field5625.remove("Accept");
      if (!this.field5624.isEmpty()) {
         this.field5625.put("Accept", this.method9883(-1470800084));
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method9880() {
      this.field5625.remove("Accept");
      if (!this.field5624.isEmpty()) {
         this.field5625.put("Accept", this.method9883(-920972436));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;)Ljava/util/Map;")
   @ObfuscatedName("rf")
   public static Map method9849(classQY var0) {
      return var0.field5625;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bk")
   String method9884() {
      ArrayList var1 = new ArrayList(this.field5624.entrySet());
      Collections.sort(var1, new classQX(this));
      StringBuilder var2 = new StringBuilder();

      for (Entry var4 : var1) {
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(classWY.method12637((classWY)var4.getKey(), 158812179));
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.field5626.format(var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   static void method9885(int var0) {
      try {
         if (classDQ.field1604.toLowerCase().indexOf("microsoft") != -1) {
            if (var0 >= -1257745409) {
               throw new IllegalStateException();
            }

            classTK.field6149[186] = 57;
            classTK.field6149[187] = 27;
            classTK.field6149[188] = 71;
            classTK.field6149[189] = 26;
            classTK.field6149[190] = 72;
            classTK.field6149[191] = 73;
            classTK.field6149[192] = 58;
            classTK.field6149[219] = 42;
            classTK.field6149[220] = 74;
            classTK.field6149[221] = 43;
            classTK.field6149[222] = 59;
            classTK.field6149[223] = 28;
         } else {
            classTK.field6149[44] = 71;
            classTK.field6149[45] = 26;
            classTK.field6149[46] = 72;
            classTK.field6149[47] = 73;
            classTK.field6149[59] = 57;
            classTK.field6149[61] = 27;
            classTK.field6149[91] = 42;
            classTK.field6149[92] = 74;
            classTK.field6149[93] = 43;
            classTK.field6149[192] = 28;
            classTK.field6149[222] = 58;
            classTK.field6149[520] = 59;
         }
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qy.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqb;Ljava/lang/String;I)V")
   @ObfuscatedName("ag")
   void method9856(classQB var1, String var2, int var3) {
      try {
         String var4 = String.format("%s %s", classQB.method9432(var1, -1995884178), var2);
         this.method9851("Authorization", var4, (short)23632);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "qy.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/util/Map;")
   @ObfuscatedName("af")
   public Map method9850(byte var1) {
      try {
         return this.field5625;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qy.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void method9881(int var1) {
      try {
         this.field5624.remove("Accept");
         if (!this.field5624.isEmpty()) {
            this.field5624.put("Accept", this.method9883(-1722587460));
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qy.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;Lwy;F)V")
   @ObfuscatedName("la")
   public static void method9877(classQY var0, classWY var1, float var2) {
      var0.field5624.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      method9882(var0, -1828246286);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("as")
   public void method9861(String var1, byte var2) {
      try {
         method9857(this, classQB.field5511, var1, -38291990);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qy.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqy;Lqb;Ljava/lang/String;I)V")
   @ObfuscatedName("fq")
   public static void method9857(classQY var0, classQB var1, String var2, int var3) {
      if (var0 == null) {
         var0.method9856(var1, var2, var3);
      }

      try {
         String var4 = String.format("%s %s", classQB.method9432(var1, -1995884178), var2);
         var0.method9851("Authorization", var4, (short)23632);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "qy.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqy;I)V")
   @ObfuscatedName("rf")
   public static void method9882(classQY var0, int var1) {
      if (var0 == null) {
         var0.method9881(var1);
      }

      try {
         var0.field5625.remove("Accept");
         if (!var0.field5624.isEmpty()) {
            var0.field5625.put("Accept", var0.method9883(-1722587460));
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qy.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   public void method9870(int var1) {
      try {
         this.field5624.remove("Content-Type");
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qy.aa(" + ')');
      }
   }
}
