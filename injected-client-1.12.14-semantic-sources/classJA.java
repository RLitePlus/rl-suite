import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ja")
public class classJA {
   @ObfuscatedSignature(descriptor = "Lja;")
   @ObfuscatedName("at")
   static final classJA field2798 = new classJA();
   @ToRemove(unused = "true")
   @ObfuscatedName("dc")
   static final String field2800 = "JX_ACCESS_TOKEN";
   @ObfuscatedName("an")
   int field2796;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field2799 = 19;
   @ObfuscatedName("ag")
   Map field2797 = new HashMap();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lja;Lorg/json/JSONObject;ILei;)V")
   @ObfuscatedName("ti")
   public static void method5369(classJA var0, JSONObject var1, int var2, UrlRequester var3) {
      var0.field2797.clear();

      JSONObject var4;
      try {
         var4 = var1;
         var0.field2796 = 1465385229 * var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         var0.method5374(var4.getJSONArray("crmcomponents"), var0.field2796 * 376288709, var3, (byte)29);
      } catch (Exception var6) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;ILei;)V")
   @ObfuscatedName("aw")
   void method5373(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length(); var4++) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  class236 var7 = new class236();

                  try {
                     var7.method5975(var5, var2, var3, (byte)30);
                  } catch (Exception var9) {
                  }

                  if (!var7.field3069.isEmpty()) {
                     String var8 = var5.getString("location");
                     this.field2797.put(var8, var7);
                  }
               }
            }
         }

         this.field2797 = method5383(this, 1280120940);
         ParamComposition.method4949((byte)15);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lja;)Ljava/util/Map;")
   @ObfuscatedName("on")
   public static Map method5379(classJA var0) {
      if (var0 == null) {
         return var0.method5381();
      } else {
         HashMap var1 = new HashMap();
         ArrayList var2 = new ArrayList();
         var2.addAll(var0.field2797.entrySet());
         boolean var3 = false;

         while (!var3) {
            var3 = true;

            for (int var5 = 0; var5 < var2.size() - 1; var5++) {
               if (((class236)((Entry)var2.get(var5)).getValue()).method5968((byte)26)
                  > ((class236)((Entry)var2.get(var5 + 1)).getValue()).method5968((byte)58)) {
                  Entry var4 = (Entry)var2.get(var5);
                  var2.set(var5, var2.get(1 + var5));
                  var2.set(var5 + 1, var4);
                  var3 = false;
               }
            }
         }

         for (Entry var6 : var2) {
            var1.put(var6.getKey(), var6.getValue());
         }

         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lja;Lorg/json/JSONObject;ILei;)V")
   @ObfuscatedName("nd")
   public static void method5370(classJA var0, JSONObject var1, int var2, UrlRequester var3) {
      var0.field2797.clear();

      JSONObject var4;
      try {
         var4 = var1;
         var0.field2796 = 1465385229 * var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         var0.method5374(var4.getJSONArray("crmcomponents"), var0.field2796 * 376288709, var3, (byte)-20);
      } catch (Exception var6) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfs;I)Lry;")
   @ObfuscatedName("ev")
   public static TransformationMatrix method5378(class136 var0, int var1) {
      return var0 == null ? var0.method4058(var1) : var0.field1850[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;ILei;I)V")
   @ObfuscatedName("av")
   void method5371(JSONObject var1, int var2, UrlRequester var3, int var4) {
      try {
         this.field2797.clear();

         JSONObject var5;
         try {
            var5 = var1;
            this.field2796 = 1465385229 * var2;
            var1.getLong("lastfullsyncat");
            var1.getLong("lastcardupdatedat");
         } catch (Exception var8) {
            return;
         }

         try {
            this.method5374(var5.getJSONArray("crmcomponents"), this.field2796 * 376288709, var3, (byte)6);
         } catch (Exception var7) {
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ja.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;ILei;B)V")
   @ObfuscatedName("at")
   void method5374(JSONArray var1, int var2, UrlRequester var3, byte var4) throws JSONException {
      try {
         if (var1 != null) {
            for (int var5 = 0; var5 < var1.length(); var5++) {
               if (var4 == 1) {
                  throw new IllegalStateException();
               }

               JSONObject var6 = var1.getJSONObject(var5);
               if (!var6.getString("game").equals("osrs")) {
                  if (var4 == 1) {
                     throw new IllegalStateException();
                  }
               } else if (var6.getBoolean("removed")) {
                  if (var4 == 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  String var7 = var6.getString("platform");
                  if (!var7.equals("mobile")) {
                     if (var4 == 1) {
                        throw new IllegalStateException();
                     }

                     if (!var7.equals("android")) {
                        if (var4 == 1) {
                           throw new IllegalStateException();
                        }

                        if (var7.equals("ios")) {
                           if (var4 == 1) {
                              throw new IllegalStateException();
                           }
                        } else {
                           class236 var8 = new class236();

                           try {
                              var8.method5975(var6, var2, var3, (byte)84);
                           } catch (Exception var10) {
                           }

                           if (!var8.field3069.isEmpty()) {
                              if (var4 == 1) {
                                 throw new IllegalStateException();
                              }

                              String var9 = var6.getString("location");
                              this.field2797.put(var9, var8);
                           }
                        }
                     }
                  }
               }
            }

            this.field2797 = method5383(this, 1280120940);
            ParamComposition.method4949((byte)15);
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "ja.at(" + ')');
      }
   }

   classJA() {
      this.field2796 = 0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("ad")
   Map method5380() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.field2797.entrySet());
      boolean var3 = false;

      while (!var3) {
         var3 = true;

         for (int var5 = 0; var5 < var2.size() - 1; var5++) {
            if (((class236)((Entry)var2.get(var5)).getValue()).method5968((byte)-49) > ((class236)((Entry)var2.get(var5 + 1)).getValue()).method5968((byte)-24)
               )
             {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      for (Entry var6 : var2) {
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lja;Lorg/json/JSONArray;ILei;)V")
   @ObfuscatedName("zp")
   public static void method5375(classJA var0, JSONArray var1, int var2, UrlRequester var3) throws JSONException {
      if (var0 == null) {
         var0.method5381();
      }

      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length(); var4++) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  class236 var7 = new class236();

                  try {
                     var7.method5975(var5, var2, var3, (byte)-28);
                  } catch (Exception var9) {
                  }

                  if (!var7.field3069.isEmpty()) {
                     String var8 = var5.getString("location");
                     var0.field2797.put(var8, var7);
                  }
               }
            }
         }

         var0.field2797 = method5383(var0, 1280120940);
         ParamComposition.method4949((byte)15);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)[J")
   @ObfuscatedName("zk")
   public static long[] method5376(DynamicArray var0) {
      if (var0 == null) {
         var0.method11216();
      }

      return var0.field6110;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("au")
   Map method5381() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.field2797.entrySet());
      boolean var3 = false;

      while (!var3) {
         var3 = true;

         for (int var5 = 0; var5 < var2.size() - 1; var5++) {
            if (((class236)((Entry)var2.get(var5)).getValue()).method5968((byte)-16) > ((class236)((Entry)var2.get(var5 + 1)).getValue()).method5968((byte)14)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      for (Entry var6 : var2) {
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;ILei;)V")
   @ObfuscatedName("ae")
   void method5372(JSONObject var1, int var2, UrlRequester var3) {
      this.field2797.clear();

      JSONObject var4;
      try {
         var4 = var1;
         this.field2796 = 1465385229 * var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         this.method5374(var4.getJSONArray("crmcomponents"), this.field2796 * 376288709, var3, (byte)46);
      } catch (Exception var6) {
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("az")
   Map method5382() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.field2797.entrySet());
      boolean var3 = false;

      while (!var3) {
         var3 = true;

         for (int var5 = 0; var5 < var2.size() - 1; var5++) {
            if (((class236)((Entry)var2.get(var5)).getValue()).method5968((byte)-68) > ((class236)((Entry)var2.get(var5 + 1)).getValue()).method5968((byte)-72)
               )
             {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      for (Entry var6 : var2) {
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ag")
   public static int method5377(int var0, int var1, byte var2) {
      try {
         return (int)Math.round(Math.atan2(var0, var1) * 325.94932345220167) - 512 & 2047;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ja.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lja;I)Ljava/util/Map;")
   @ObfuscatedName("kz")
   public static Map method5383(classJA var0, int var1) {
      if (var0 == null) {
         return var0.method5384(var1);
      } else {
         try {
            HashMap var2 = new HashMap();
            ArrayList var3 = new ArrayList();
            var3.addAll(var0.field2797.entrySet());
            boolean var4 = false;

            while (!var4) {
               if (var1 != 1280120940) {
                  throw new IllegalStateException();
               }

               var4 = true;

               for (int var6 = 0; var6 < var3.size() - 1; var6++) {
                  if (var1 != 1280120940) {
                     throw new IllegalStateException();
                  }

                  if (((class236)((Entry)var3.get(var6)).getValue()).method5968((byte)-17)
                     > ((class236)((Entry)var3.get(var6 + 1)).getValue()).method5968((byte)-27)) {
                     Entry var5 = (Entry)var3.get(var6);
                     var3.set(var6, var3.get(1 + var6));
                     var3.set(var6 + 1, var5);
                     var4 = false;
                  }
               }
            }

            for (Entry var7 : var3) {
               var2.put(var7.getKey(), var7.getValue());
            }

            return var2;
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "ja.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/Map;")
   @ObfuscatedName("ag")
   Map method5384(int var1) {
      try {
         HashMap var2 = new HashMap();
         ArrayList var3 = new ArrayList();
         var3.addAll(this.field2797.entrySet());
         boolean var4 = false;

         while (!var4) {
            if (var1 != 1280120940) {
               throw new IllegalStateException();
            }

            var4 = true;

            for (int var6 = 0; var6 < var3.size() - 1; var6++) {
               if (var1 != 1280120940) {
                  throw new IllegalStateException();
               }

               if (((class236)((Entry)var3.get(var6)).getValue()).method5968((byte)-17)
                  > ((class236)((Entry)var3.get(var6 + 1)).getValue()).method5968((byte)-27)) {
                  Entry var5 = (Entry)var3.get(var6);
                  var3.set(var6, var3.get(1 + var6));
                  var3.set(var6 + 1, var5);
                  var4 = false;
               }
            }
         }

         for (Entry var7 : var3) {
            var2.put(var7.getKey(), var7.getValue());
         }

         return var2;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ja.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lja;Ljava/lang/String;S)Ljk;")
   @ObfuscatedName("ap")
   public static class236 method5385(classJA var0, String var1, short var2) {
      if (var0 == null) {
         var0.method5386(var1, var2);
      }

      try {
         return (class236)var0.field2797.get(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ja.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)Ljk;")
   @ObfuscatedName("an")
   class236 method5386(String var1, short var2) {
      try {
         return (class236)this.field2797.get(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ja.an(" + ')');
      }
   }
}
