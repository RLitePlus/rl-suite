import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("jk")
public class class236 {
   @ObfuscatedName("ap")
   String field3077;
   @ObfuscatedName("ag")
   ArrayList field3068 = new ArrayList();
   @ObfuscatedName("an")
   ArrayList field3074 = new ArrayList();
   @ObfuscatedName("ay")
   int field3073;
   @ObfuscatedName("ae")
   String field3069;
   @ObfuscatedName("aj")
   float[] field3070;
   @ObfuscatedName("ak")
   Map field3071;
   @ObfuscatedName("aw")
   Map field3072;
   @ObfuscatedName("at")
   ArrayList field3067 = new ArrayList();
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3076 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3075 = -1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("as")
   static int method5963(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ag")
   String method5965(int var1) {
      try {
         return this.field3077;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jk.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("an")
   int method5968(byte var1) {
      try {
         return this.field3073 * 666181425;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jk.an(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljk;Lorg/json/JSONObject;)V")
   @ObfuscatedName("we")
   public static void method6004(class236 var0, JSONObject var1) throws JSONException {
      if (var0 == null) {
         var0.method5966();
      }

      String[] var2 = JSONObject.getNames(var1);

      for (int var3 = 0; var3 < var1.length(); var3++) {
         try {
            int var4 = var1.optInt(var2[var3]);
            var0.field3071.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  var0.field3071.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  var0.field3071.put(var2[var3], 0);
               } else {
                  var0.field3072.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   void method5972(byte var1) {
      try {
         this.field3069 = null;
         this.field3070[0] = 0.0F;
         this.field3070[1] = 0.0F;
         this.field3070[2] = 1.0F;
         this.field3070[3] = 1.0F;
         this.field3068.clear();
         this.field3074.clear();
         this.field3067.clear();
         this.field3071.clear();
         this.field3072.clear();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jk.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;)V")
   @ObfuscatedName("bf")
   void method5997(JSONObject var1) throws JSONException {
      class237 var2 = new class237(this);
      var2.field2828 = var1.optString("text");
      var2.field2819 = AbstractArchive.method8964(var1.optString("align_x"), -1984278842) * 72760971;
      var2.field2820 = AbstractArchive.method8964(var1.optString("align_y"), -1094885294) * -33771755;
      var2.field2821 = var1.optInt("font") * -1244007471;
      var2.field2822 = MouseHandler.method933(var1, "placement", (short)11749);
      this.field3067.add(var2);
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("as")
   static final int method6008(int var0, int var1, int var2, int var3) {
      try {
         int var4 = var0 / var2;
         int var5 = var0 & var2 - 1;
         int var6 = var1 / var2;
         int var7 = var1 & var2 - 1;
         int var8 = Projection.method6227(var4, var6, -1644257037);
         int var9 = Projection.method6227(1 + var4, var6, -1644257037);
         int var10 = Projection.method6227(var4, var6 + 1, -1644257037);
         int var11 = Projection.method6227(var4 + 1, var6 + 1, -1644257037);
         int var13 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var5 * 1024 / var2] >> 1;
         int var12 = (var8 * (65536 - var13) >> 16) + (var13 * var9 >> 16);
         int var15 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var5 * 1024 / var2] >> 1;
         int var14 = (var10 * (65536 - var15) >> 16) + (var15 * var11 >> 16);
         int var17 = 65536 - Rasterizer3D.Rasterizer3D_cosine[1024 * var7 / var2] >> 1;
         return (var17 * var14 >> 16) + ((65536 - var17) * var12 >> 16);
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "jk.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZIII)J")
   @ObfuscatedName("ak")
   public static long calculateTag(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6, int var7) {
      try {
         long var8 = (var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16 | (var5 & 4294967295L) << 20 | (var6 & 4095L) << 52;
         if (var4) {
            if (var7 != -1329739818) {
               throw new IllegalStateException();
            }

            var8 |= 524288L;
         }

         return var8;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "jk.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;B)V")
   @ObfuscatedName("au")
   void method6002(JSONObject var1, byte var2) throws JSONException {
      try {
         if (null == var1) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }
         } else {
            this.field3070 = MouseHandler.method933(var1, "clickbounds", (short)177);
            this.field3069 = var1.getString("endpoint");
            String[] var3 = JSONObject.getNames(var1);

            for (int var4 = 0; var4 < var1.length(); var4++) {
               if (!var3[var4].equals("clickbounds")) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  if (!var3[var4].equals("endpoint")) {
                     try {
                        int var5 = var1.getInt(var3[var4]);
                        this.field3068.add(new class224(this, var3[var4], var5));
                     } catch (Exception var8) {
                        try {
                           String var6 = var1.getString(var3[var4]);
                           if (var6.equals("true")) {
                              if (var2 == 0) {
                                 throw new IllegalStateException();
                              }

                              this.field3068.add(new class224(this, var3[var4], 1));
                           } else if (var6.equals("false")) {
                              if (var2 == 0) {
                                 throw new IllegalStateException();
                              }

                              this.field3068.add(new class224(this, var3[var4], 0));
                           } else {
                              this.field3068.add(new classIL(this, var3[var4], var6));
                           }
                        } catch (Exception var7) {
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "jk.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;B)V")
   @ObfuscatedName("az")
   void method6005(JSONObject var1, byte var2) throws JSONException {
      try {
         String[] var3 = JSONObject.getNames(var1);

         for (int var4 = 0; var4 < var1.length(); var4++) {
            if (var2 == 6) {
               throw new IllegalStateException();
            }

            try {
               int var5 = var1.optInt(var3[var4]);
               this.field3071.put(var3[var4], var5);
            } catch (Exception var8) {
               try {
                  String var6 = var1.optString(var3[var4]);
                  if (var6.equals("true")) {
                     if (var2 == 6) {
                        throw new IllegalStateException();
                     }

                     this.field3071.put(var3[var4], 1);
                  } else if (var6.equals("false")) {
                     if (var2 == 6) {
                        return;
                     }

                     this.field3071.put(var3[var4], 0);
                  } else {
                     this.field3072.put(var3[var4], var6);
                  }
               } catch (Exception var7) {
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "jk.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;)[F")
   @ObfuscatedName("ai")
   static float[] method5961(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0);
         var2[1] = (float)var3.optDouble(1, 0.0);
         var2[2] = (float)var3.optDouble(2, 1.0);
         var2[3] = (float)var3.optDouble(3, 1.0);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ab")
   String method5966() {
      return this.field3077;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ac")
   static int method5964(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljk;Lorg/json/JSONArray;I)V")
   @ObfuscatedName("ex")
   public static void method5991(class236 var0, JSONArray var1, int var2) throws JSONException {
      if (var0 == null) {
         var0.method5996(var1, var2);
      }

      try {
         if (null == var1) {
            if (var2 <= -1534355899) {
               throw new IllegalStateException();
            }
         } else {
            for (int var3 = 0; var3 < var1.length(); var3++) {
               JSONObject var4 = var1.getJSONObject(var3);
               class237 var5 = new class237(var0);
               var5.field2828 = var4.getString("text");
               var5.field2819 = AbstractArchive.method8964(var4.getString("align_x"), 1259167768) * 72760971;
               var5.field2820 = AbstractArchive.method8964(var4.getString("align_y"), 1236419017) * -33771755;
               var5.field2821 = var4.getInt("font") * -1244007471;
               var5.field2822 = MouseHandler.method933(var4, "placement", (short)6126);
               var0.field3067.add(var5);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "jk.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ar")
   String method5967() {
      return this.field3077;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   int method5969() {
      return this.field3073 * 666181425;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method5970() {
      return this.field3073 * 666181425;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   int method5971() {
      return this.field3073 * 666181425;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;ILei;B)Z")
   @ObfuscatedName("aj")
   boolean method5975(JSONObject var1, int var2, UrlRequester var3, byte var4) {
      try {
         JSONObject var5 = var1;
         if (var2 < 2) {
            if (var4 == 42) {
               throw new IllegalStateException();
            }

            try {
               var5 = var5.getJSONObject("message");
            } catch (Exception var14) {
               this.method5972((byte)0);
               return false;
            }

            try {
               this.method5984(var5.getJSONArray("images"), var3, -97247135);
            } catch (Exception var13) {
               this.field3074.clear();
            }

            try {
               method5991(this, var5.getJSONArray("labels"), 482080231);
            } catch (Exception var12) {
               this.field3067.clear();
            }
         } else {
            try {
               method5985(this, var5.getJSONObject("image"), var3, (byte)21);
            } catch (Exception var11) {
               this.field3074.clear();
            }

            try {
               method5998(this, var5.getJSONObject("label"), 1985429154);
            } catch (Exception var10) {
               this.field3067.clear();
            }
         }

         try {
            this.method6002(var5.getJSONObject("behaviour"), (byte)21);
         } catch (Exception var9) {
            this.field3069 = null;
            this.field3070[0] = 0.0F;
            this.field3070[1] = 0.0F;
            this.field3070[2] = 1.0F;
            this.field3070[3] = 1.0F;
            this.field3068.clear();
         }

         try {
            JSONObject var6 = var5.optJSONObject("meta");
            if (null != var6) {
               if (var4 == 42) {
                  throw new IllegalStateException();
               }

               this.method6005(var5.getJSONObject("meta"), (byte)-35);
            }
         } catch (Exception var8) {
            this.field3071.clear();
            this.field3072.clear();
         }

         if (var2 == 2) {
            if (var4 == 42) {
               throw new IllegalStateException();
            }

            try {
               this.field3077 = var5.getString("id");
               this.field3073 = Integer.parseInt(var5.getString("priority")) * 914479569;
            } catch (Exception var7) {
            }
         }

         return true;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "jk.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;ILei;)Z")
   @ObfuscatedName("aa")
   boolean method5976(JSONObject var1, int var2, UrlRequester var3) {
      JSONObject var4 = var1;
      if (var2 < 2) {
         try {
            var4 = var4.getJSONObject("message");
         } catch (Exception var13) {
            this.method5972((byte)0);
            return false;
         }

         try {
            this.method5984(var4.getJSONArray("images"), var3, 384750547);
         } catch (Exception var12) {
            this.field3074.clear();
         }

         try {
            method5991(this, var4.getJSONArray("labels"), 1158259781);
         } catch (Exception var11) {
            this.field3067.clear();
         }
      } else {
         try {
            method5985(this, var4.getJSONObject("image"), var3, (byte)73);
         } catch (Exception var10) {
            this.field3074.clear();
         }

         try {
            method5998(this, var4.getJSONObject("label"), 2020148857);
         } catch (Exception var9) {
            this.field3067.clear();
         }
      }

      try {
         this.method6002(var4.getJSONObject("behaviour"), (byte)-64);
      } catch (Exception var8) {
         this.field3069 = null;
         this.field3070[0] = 0.0F;
         this.field3070[1] = 0.0F;
         this.field3070[2] = 1.0F;
         this.field3070[3] = 1.0F;
         this.field3068.clear();
      }

      try {
         JSONObject var5 = var4.optJSONObject("meta");
         if (null != var5) {
            this.method6005(var4.getJSONObject("meta"), (byte)-81);
         }
      } catch (Exception var7) {
         this.field3071.clear();
         this.field3072.clear();
      }

      if (var2 == 2) {
         try {
            this.field3077 = var4.getString("id");
            this.field3073 = Integer.parseInt(var4.getString("priority")) * 914479569;
         } catch (Exception var6) {
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Ljk;Lorg/json/JSONObject;Lei;B)V")
   @ObfuscatedName("lq")
   public static void method5985(class236 var0, JSONObject var1, UrlRequester var2, byte var3) throws JSONException {
      if (var0 == null) {
         var0.method5990(var1, var2, var3);
      } else {
         try {
            try {
               class226 var4 = new class226(var0);
               var4.field2777 = var2.request(new URL(var1.getString("src")), -726881254);
               var4.field2774 = MouseHandler.method933(var1, "placement", (short)-22384);
               var0.field3074.add(var4);
            } catch (MalformedURLException var5) {
            }
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "jk.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;ILei;)Z")
   @ObfuscatedName("aq")
   boolean method5977(JSONObject var1, int var2, UrlRequester var3) {
      JSONObject var4 = var1;
      if (var2 < 2) {
         try {
            var4 = var4.getJSONObject("message");
         } catch (Exception var13) {
            this.method5972((byte)0);
            return false;
         }

         try {
            this.method5984(var4.getJSONArray("images"), var3, 1606004785);
         } catch (Exception var12) {
            this.field3074.clear();
         }

         try {
            method5991(this, var4.getJSONArray("labels"), -1109478124);
         } catch (Exception var11) {
            this.field3067.clear();
         }
      } else {
         try {
            method5985(this, var4.getJSONObject("image"), var3, (byte)102);
         } catch (Exception var10) {
            this.field3074.clear();
         }

         try {
            method5998(this, var4.getJSONObject("label"), 2017047940);
         } catch (Exception var9) {
            this.field3067.clear();
         }
      }

      try {
         this.method6002(var4.getJSONObject("behaviour"), (byte)-68);
      } catch (Exception var8) {
         this.field3069 = null;
         this.field3070[0] = 0.0F;
         this.field3070[1] = 0.0F;
         this.field3070[2] = 1.0F;
         this.field3070[3] = 1.0F;
         this.field3068.clear();
      }

      try {
         JSONObject var5 = var4.optJSONObject("meta");
         if (null != var5) {
            this.method6005(var4.getJSONObject("meta"), (byte)-12);
         }
      } catch (Exception var7) {
         this.field3071.clear();
         this.field3072.clear();
      }

      if (var2 == 2) {
         try {
            this.field3077 = var4.getString("id");
            this.field3073 = Integer.parseInt(var4.getString("priority")) * 914479569;
         } catch (Exception var6) {
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;Lei;)V")
   @ObfuscatedName("bg")
   void method5979(JSONArray var1, UrlRequester var2) throws JSONException {
      if (null != var1) {
         for (int var3 = 0; var3 < var1.length(); var3++) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class226 var5 = new class226(this);
               var5.field2777 = var2.request(new URL(var4.getString("src")), -726881254);
               var5.field2774 = MouseHandler.method933(var4, "placement", (short)7836);
               this.field3074.add(var5);
            } catch (MalformedURLException var6) {
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;Lei;)V")
   @ObfuscatedName("bo")
   void method5980(JSONArray var1, UrlRequester var2) throws JSONException {
      if (null != var1) {
         for (int var3 = 0; var3 < var1.length(); var3++) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class226 var5 = new class226(this);
               var5.field2777 = var2.request(new URL(var4.getString("src")), -726881254);
               var5.field2774 = MouseHandler.method933(var4, "placement", (short)-11609);
               this.field3074.add(var5);
            } catch (MalformedURLException var6) {
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;)V")
   @ObfuscatedName("bt")
   void method5992(JSONArray var1) throws JSONException {
      if (null != var1) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            JSONObject var3 = var1.getJSONObject(var2);
            class237 var4 = new class237(this);
            var4.field2828 = var3.getString("text");
            var4.field2819 = AbstractArchive.method8964(var3.getString("align_x"), -485735932) * 968541551;
            var4.field2820 = AbstractArchive.method8964(var3.getString("align_y"), -998236947) * -33771755;
            var4.field2821 = var3.getInt("font") * -657872776;
            var4.field2822 = MouseHandler.method933(var3, "placement", (short)4633);
            this.field3067.add(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;Lei;)V")
   @ObfuscatedName("bs")
   void method5981(JSONArray var1, UrlRequester var2) throws JSONException {
      if (null != var1) {
         for (int var3 = 0; var3 < var1.length(); var3++) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class226 var5 = new class226(this);
               var5.field2777 = var2.request(new URL(var4.getString("src")), -726881254);
               var5.field2774 = MouseHandler.method933(var4, "placement", (short)17671);
               this.field3074.add(var5);
            } catch (MalformedURLException var6) {
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljk;Lorg/json/JSONObject;)V")
   @ObfuscatedName("yp")
   public static void method6003(class236 var0, JSONObject var1) throws JSONException {
      if (var0 == null) {
         var0.method5969();
      }

      if (null != var1) {
         var0.field3070 = MouseHandler.method933(var1, "clickbounds", (short)-15298);
         var0.field3069 = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for (int var3 = 0; var3 < var1.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  var0.field3068.add(new class224(var0, var2[var3], var4));
               } catch (Exception var7) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        var0.field3068.add(new class224(var0, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        var0.field3068.add(new class224(var0, var2[var3], 0));
                     } else {
                        var0.field3068.add(new classIL(var0, var2[var3], var5));
                     }
                  } catch (Exception var6) {
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;Lei;)V")
   @ObfuscatedName("bz")
   void method5982(JSONArray var1, UrlRequester var2) throws JSONException {
      if (null != var1) {
         for (int var3 = 0; var3 < var1.length(); var3++) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class226 var5 = new class226(this);
               var5.field2777 = var2.request(new URL(var4.getString("src")), -726881254);
               var5.field2774 = MouseHandler.method933(var4, "placement", (short)-12588);
               this.field3074.add(var5);
            } catch (MalformedURLException var6) {
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;Lei;)V")
   @ObfuscatedName("bk")
   void method5983(JSONArray var1, UrlRequester var2) throws JSONException {
      if (null != var1) {
         for (int var3 = 0; var3 < var1.length(); var3++) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class226 var5 = new class226(this);
               var5.field2777 = var2.request(new URL(var4.getString("src")), -726881254);
               var5.field2774 = MouseHandler.method933(var4, "placement", (short)-16105);
               this.field3074.add(var5);
            } catch (MalformedURLException var6) {
            }
         }
      }
   }

   class236() {
      this.field3069 = null;
      this.field3070 = new float[4];
      this.field3071 = new HashMap();
      this.field3072 = new HashMap();
      this.field3073 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Lei;)V")
   @ObfuscatedName("bj")
   void method5986(JSONObject var1, UrlRequester var2) throws JSONException {
      try {
         class226 var3 = new class226(this);
         var3.field2777 = var2.request(new URL(var1.getString("src")), -726881254);
         var3.field2774 = MouseHandler.method933(var1, "placement", (short)-8799);
         this.field3074.add(var3);
      } catch (MalformedURLException var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Lei;)V")
   @ObfuscatedName("bb")
   void method5987(JSONObject var1, UrlRequester var2) throws JSONException {
      try {
         class226 var3 = new class226(this);
         var3.field2777 = var2.request(new URL(var1.getString("src")), -726881254);
         var3.field2774 = MouseHandler.method933(var1, "placement", (short)5327);
         this.field3074.add(var3);
      } catch (MalformedURLException var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljk;Lorg/json/JSONObject;I)V")
   @ObfuscatedName("yt")
   public static void method5998(class236 var0, JSONObject var1, int var2) throws JSONException {
      if (var0 == null) {
         var0.method6001(var1, var2);
      } else {
         try {
            class237 var3 = new class237(var0);
            var3.field2828 = var1.optString("text");
            var3.field2819 = AbstractArchive.method8964(var1.optString("align_x"), -134231427) * 72760971;
            var3.field2820 = AbstractArchive.method8964(var1.optString("align_y"), -757962790) * -33771755;
            var3.field2821 = var1.optInt("font") * -1244007471;
            var3.field2822 = MouseHandler.method933(var1, "placement", (short)-27449);
            var0.field3067.add(var3);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "jk.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Lei;)V")
   @ObfuscatedName("bp")
   void method5988(JSONObject var1, UrlRequester var2) throws JSONException {
      try {
         class226 var3 = new class226(this);
         var3.field2777 = var2.request(new URL(var1.getString("src")), -726881254);
         var3.field2774 = MouseHandler.method933(var1, "placement", (short)5238);
         this.field3074.add(var3);
      } catch (MalformedURLException var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("at")
   public static int method5960(int var0, byte var1) {
      try {
         return var0 >>> 4 & 1187134365 * classWL.field6390;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jk.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;)V")
   @ObfuscatedName("bu")
   void method5993(JSONArray var1) throws JSONException {
      if (null != var1) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            JSONObject var3 = var1.getJSONObject(var2);
            class237 var4 = new class237(this);
            var4.field2828 = var3.getString("text");
            var4.field2819 = AbstractArchive.method8964(var3.getString("align_x"), 1287940707) * 72760971;
            var4.field2820 = AbstractArchive.method8964(var3.getString("align_y"), 967486241) * -33771755;
            var4.field2821 = var3.getInt("font") * -1244007471;
            var4.field2822 = MouseHandler.method933(var3, "placement", (short)-13035);
            this.field3067.add(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;)V")
   @ObfuscatedName("ba")
   void method5994(JSONArray var1) throws JSONException {
      if (null != var1) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            JSONObject var3 = var1.getJSONObject(var2);
            class237 var4 = new class237(this);
            var4.field2828 = var3.getString("text");
            var4.field2819 = AbstractArchive.method8964(var3.getString("align_x"), -1733248530) * 1656123417;
            var4.field2820 = AbstractArchive.method8964(var3.getString("align_y"), -1483218701) * 1497538531;
            var4.field2821 = var3.getInt("font") * -1244007471;
            var4.field2822 = MouseHandler.method933(var3, "placement", (short)-22059);
            this.field3067.add(var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;)V")
   @ObfuscatedName("bi")
   void method5995(JSONArray var1) throws JSONException {
      if (null != var1) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            JSONObject var3 = var1.getJSONObject(var2);
            class237 var4 = new class237(this);
            var4.field2828 = var3.getString("text");
            var4.field2819 = AbstractArchive.method8964(var3.getString("align_x"), 1122100837) * 72760971;
            var4.field2820 = AbstractArchive.method8964(var3.getString("align_y"), 1388958363) * -33771755;
            var4.field2821 = var3.getInt("font") * -1244007471;
            var4.field2822 = MouseHandler.method933(var3, "placement", (short)3926);
            this.field3067.add(var4);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljk;)V")
   @ObfuscatedName("mk")
   public static void method5973(class236 var0) {
      if (var0 == null) {
         var0.method5970();
      }

      var0.field3069 = null;
      var0.field3070[0] = 0.0F;
      var0.field3070[1] = 0.0F;
      var0.field3070[2] = 1.0F;
      var0.field3070[3] = 1.0F;
      var0.field3068.clear();
      var0.field3074.clear();
      var0.field3067.clear();
      var0.field3071.clear();
      var0.field3072.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;)[F")
   @ObfuscatedName("ad")
   static float[] method5962(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0);
         var2[1] = (float)var3.optDouble(1, 0.0);
         var2[2] = (float)var3.optDouble(2, 1.0);
         var2[3] = (float)var3.optDouble(3, 1.0);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;)V")
   @ObfuscatedName("bd")
   void method5999(JSONObject var1) throws JSONException {
      class237 var2 = new class237(this);
      var2.field2828 = var1.optString("text");
      var2.field2819 = AbstractArchive.method8964(var1.optString("align_x"), 1381118493) * 72760971;
      var2.field2820 = AbstractArchive.method8964(var1.optString("align_y"), 321442215) * -33771755;
      var2.field2821 = var1.optInt("font") * -1244007471;
      var2.field2822 = MouseHandler.method933(var1, "placement", (short)13697);
      this.field3067.add(var2);
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;)V")
   @ObfuscatedName("bw")
   void method6000(JSONObject var1) throws JSONException {
      class237 var2 = new class237(this);
      var2.field2828 = var1.optString("text");
      var2.field2819 = AbstractArchive.method8964(var1.optString("align_x"), -1623817391) * 72760971;
      var2.field2820 = AbstractArchive.method8964(var1.optString("align_y"), -226044464) * -33771755;
      var2.field2821 = var1.optInt("font") * -1244007471;
      var2.field2822 = MouseHandler.method933(var1, "placement", (short)9139);
      this.field3067.add(var2);
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;)V")
   @ObfuscatedName("by")
   void method6006(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for (int var3 = 0; var3 < var1.length(); var3++) {
         try {
            int var4 = var1.optInt(var2[var3]);
            this.field3071.put(var2[var3], var4);
         } catch (Exception var7) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  this.field3071.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.field3071.put(var2[var3], 0);
               } else {
                  this.field3072.put(var2[var3], var5);
               }
            } catch (Exception var6) {
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   void method5974() {
      this.field3069 = null;
      this.field3070[0] = 0.0F;
      this.field3070[1] = 0.0F;
      this.field3070[2] = 1.0F;
      this.field3070[3] = 1.0F;
      this.field3068.clear();
      this.field3074.clear();
      this.field3067.clear();
      this.field3071.clear();
      this.field3072.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;Lei;I)V")
   @ObfuscatedName("ak")
   void method5984(JSONArray var1, UrlRequester var2, int var3) throws JSONException {
      try {
         if (null == var1) {
            if (var3 <= -388520497) {
               throw new IllegalStateException();
            }
         } else {
            for (int var4 = 0; var4 < var1.length(); var4++) {
               try {
                  JSONObject var5 = var1.getJSONObject(var4);
                  class226 var6 = new class226(this);
                  var6.field2777 = var2.request(new URL(var5.getString("src")), -726881254);
                  var6.field2774 = MouseHandler.method933(var5, "placement", (short)-3275);
                  this.field3074.add(var6);
               } catch (MalformedURLException var7) {
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "jk.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;II)I")
   @ObfuscatedName("ac")
   public static int method6007(DynamicArray var0, int var1, int var2) {
      try {
         ProjectionCoord.method9919(var0, class586.field6376, 1664017637);
         if (var1 >= 0) {
            if (var2 <= -1522431545) {
               throw new IllegalStateException();
            }

            int[] var3 = var0.method11207(2053374425);
            int var4 = var0.method11215((byte)19);

            for (int var5 = 0; var5 < var4; var5++) {
               if (var2 <= -1522431545) {
                  throw new IllegalStateException();
               }

               if (var1 < var3[var5]) {
                  if (var2 <= -1522431545) {
                     throw new IllegalStateException();
                  }

                  return var5;
               }

               var1 -= var3[var5];
            }
         }

         return -1;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "jk.ac(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljk;Lorg/json/JSONObject;Lei;)V")
   @ObfuscatedName("ao")
   public static void method5989(class236 var0, JSONObject var1, UrlRequester var2) throws JSONException {
      if (var0 == null) {
         var0.method6000(var1);
      } else {
         try {
            class226 var3 = new class226(var0);
            var3.field2777 = var2.request(new URL(var1.getString("src")), -726881254);
            var3.field2774 = MouseHandler.method933(var1, "placement", (short)7739);
            var0.field3074.add(var3);
         } catch (MalformedURLException var4) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;I)V")
   @ObfuscatedName("ap")
   void method5996(JSONArray var1, int var2) {
      try {
         if (null == var1) {
            if (var2 <= -1534355899) {
               throw new IllegalStateException();
            }
         } else {
            for (int var3 = 0; var3 < var1.length(); var3++) {
               JSONObject var4 = var1.getJSONObject(var3);
               class237 var5 = new class237(this);
               var5.field2828 = var4.getString("text");
               var5.field2819 = AbstractArchive.method8964(var4.getString("align_x"), 1259167768) * 72760971;
               var5.field2821 = AbstractArchive.method8964(var4.getString("align_y"), 1236419017) * -33771755;
               var5.field2821 = var4.getInt("font") * -1244007471;
               var5.field2822 = MouseHandler.method933(var4, "placement", (short)6126);
               this.field3068.add(var5);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "jk.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;I)V")
   @ObfuscatedName("ay")
   void method6001(JSONObject var1, int var2) {
      try {
         class237 var3 = new class237(this);
         var3.field2828 = var1.optString("text");
         var3.field2821 = AbstractArchive.method8964(var1.optString("align_x"), -134231427) * 72760971;
         var3.field2820 = AbstractArchive.method8964(var1.optString("align_y"), -757962790) * -33771755;
         var3.field2819 = var1.optInt("font") * -1244007471;
         var3.field2822 = MouseHandler.method933(var1, "placement", (short)-27449);
         this.field3074.add(var3);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "jk.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Lei;B)V")
   @ObfuscatedName("aw")
   void method5990(JSONObject var1, UrlRequester var2, byte var3) {
      try {
         try {
            class226 var4 = new class226(this);
            var4.field2777 = var2.request(new URL(var1.getString("src")), -726881254);
            var4.field2774 = MouseHandler.method933(var1, "placement", (short)-22384);
            this.field3074.add(var4);
         } catch (MalformedURLException var5) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "jk.aw(" + ')');
      }
   }
}
