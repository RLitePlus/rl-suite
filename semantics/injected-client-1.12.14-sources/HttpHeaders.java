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

@ObfuscatedName("tx")
public class HttpHeaders {
   @ObfuscatedName("ae")
   final Map acceptHeaderValues = new HashMap();
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final String field5999 = "Accept";
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final String field6000 = "Content-Type";
   @ObfuscatedName("an")
   final Map headers = new HashMap();
   @ObfuscatedName("aj")
   final DecimalFormat decimalFormat = new DecimalFormat();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public void method10962() {
      this.acceptHeaderValues.remove("Content-Type");
   }

   @ObfuscatedSignature(descriptor = "(Ltx;Lur;I)V")
   @ObfuscatedName("fw")
   public static void method10964(HttpHeaders var0, HttpContentType var1, int var2) {
      if (var0 == null) {
         var0.accept(var1, var2);
      }

      try {
         method10969(var0, var1, 1.0F, 650660433);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tx.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;Lut;I)I")
   @ObfuscatedName("av")
   public static int method10933(DynamicArray var0, DynamicArray var1, int var2) {
      try {
         if (var0 == var1) {
            if (var2 <= -434199641) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if (var0 == null) {
            if (var2 <= -434199641) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (var1 == null) {
            if (var2 <= -434199641) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            int var3;
            int var4;
            label189: {
               var3 = var0.method11215((byte)121);
               var4 = var1.method11215((byte)51);
               int var5 = Math.min(var3, var4);
               if (var0.field6107 == class586.field6376) {
                  if (var2 <= -434199641) {
                     throw new IllegalStateException();
                  }

                  if (var1.field6107 == class586.field6376) {
                     if (var2 <= -434199641) {
                        throw new IllegalStateException();
                     }

                     int[] var12 = var0.method11207(2053374425);
                     int[] var14 = var1.method11207(2053374425);
                     int var16 = 0;

                     while (true) {
                        if (var16 >= var5) {
                           break label189;
                        }

                        if (var2 <= -434199641) {
                           throw new IllegalStateException();
                        }

                        if (var12[var16] < var14[var16]) {
                           if (var2 <= -434199641) {
                              throw new IllegalStateException();
                           }

                           return -1;
                        }

                        if (var12[var16] > var14[var16]) {
                           if (var2 <= -434199641) {
                              throw new IllegalStateException();
                           }

                           return 1;
                        }

                        var16++;
                     }
                  }
               }

               if (class586.field6377 == var0.field6107 && var1.field6107 == class586.field6377) {
                  if (var2 <= -434199641) {
                     throw new IllegalStateException();
                  }

                  long[] var11 = DynamicArray.method11211(var0, (byte)101);
                  long[] var13 = DynamicArray.method11211(var1, (byte)106);

                  for (int var15 = 0; var15 < var5; var15++) {
                     if (var2 <= -434199641) {
                        throw new IllegalStateException();
                     }

                     if (var11[var15] < var13[var15]) {
                        if (var2 <= -434199641) {
                           throw new IllegalStateException();
                        }

                        return -1;
                     }

                     if (var11[var15] > var13[var15]) {
                        if (var2 <= -434199641) {
                           throw new IllegalStateException();
                        }

                        return 1;
                     }
                  }
               } else {
                  if (var0.field6107 != class586.field6379) {
                     throw new RuntimeException();
                  }

                  if (var2 <= -434199641) {
                     throw new IllegalStateException();
                  }

                  if (class586.field6379 != var1.field6107) {
                     throw new RuntimeException();
                  }

                  if (var2 <= -434199641) {
                     throw new IllegalStateException();
                  }

                  Object[] var6 = var0.method11214((byte)-109);
                  Object[] var7 = var1.method11214((byte)-71);

                  for (int var8 = 0; var8 < var5; var8++) {
                     if (var2 <= -434199641) {
                        throw new IllegalStateException();
                     }

                     int var9 = ((String)var6[var8]).compareTo((String)var7[var8]);
                     if (var9 < 0) {
                        if (var2 <= -434199641) {
                           throw new IllegalStateException();
                        }

                        return -1;
                     }

                     if (var9 > 0) {
                        if (var2 <= -434199641) {
                           throw new IllegalStateException();
                        }

                        return 1;
                     }
                  }
               }
            }

            byte var10000;
            if (var3 < var4) {
               if (var2 <= -434199641) {
                  throw new IllegalStateException();
               }

               var10000 = -1;
            } else if (var4 == var3) {
               if (var2 <= -434199641) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            return var10000;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "tx.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltx;Ljava/lang/String;I)V")
   @ObfuscatedName("io")
   public static void method10953(HttpHeaders var0, String var1, int var2) {
      if (var0 == null) {
         var0.bearerToken(var1, var2);
      } else {
         try {
            var0.authenticationHeader(HttpAuthenticationHeader.BASIC, var1, -1640107663);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "tx.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("an")
   public void removeHeader(String var1, byte var2) {
      try {
         if (null != var1 && !var1.isEmpty()) {
            this.acceptHeaderValues.remove(var1);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tx.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lso;Ljava/lang/String;I)V")
   @ObfuscatedName("ae")
   void authenticationHeader(HttpAuthenticationHeader var1, String var2, int var3) {
      try {
         String var4 = String.format("%s %s", HttpAuthenticationHeader.method10489(var1, (byte)-20), var2);
         this.header("Authorization", var4, 404505280);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "tx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   void method10970() {
      this.acceptHeaderValues.remove("Accept");
      if (!this.headers.isEmpty()) {
         this.acceptHeaderValues.put("Accept", method10974(this, (byte)-89));
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("aj")
   public void basicAuthentication(String var1, int var2) {
      try {
         this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1, -1640107663);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tx.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lur;I)V")
   @ObfuscatedName("aw")
   public void contentType(HttpContentType var1, int var2) {
      try {
         this.acceptHeaderValues.put("Content-Type", var1.getValue(-2097078961));
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tx.aw(" + ')');
      }
   }

   public HttpHeaders() {
      this.decimalFormat.setMaximumFractionDigits(2);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void updateAcceptHeader(int var1) {
      try {
         this.acceptHeaderValues.remove("Accept");
         if (!this.headers.isEmpty()) {
            if (var1 <= 225268427) {
               throw new IllegalStateException();
            }

            this.acceptHeaderValues.put("Accept", method10974(this, (byte)-81));
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lso;Ljava/lang/String;)V")
   @ObfuscatedName("aa")
   void method10949(HttpAuthenticationHeader var1, String var2) {
      String var3 = String.format("%s %s", HttpAuthenticationHeader.method10489(var1, (byte)52), var2);
      this.header("Authorization", var3, 273118179);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltx;Lur;)V")
   @ObfuscatedName("bp")
   public static void method10960(HttpHeaders var0, HttpContentType var1) {
      var0.acceptHeaderValues.put("Content-Type", var1.getValue(-968655222));
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HttpsURLConnection;)V")
   @ObfuscatedName("as")
   public void method10934(HttpsURLConnection var1) {
      for (Entry var3 : this.acceptHeaderValues.entrySet()) {
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HttpsURLConnection;)V")
   @ObfuscatedName("ab")
   public void method10935(HttpsURLConnection var1) {
      for (Entry var3 : this.acceptHeaderValues.entrySet()) {
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;)Liw;")
   @ObfuscatedName("wm")
   public static SequenceDefinition method10952(AnimationSequence var0) {
      return var0.sequenceDefinition;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("ar")
   public Map method10937() {
      return this.acceptHeaderValues;
   }

   @ObfuscatedSignature(descriptor = "(Ltx;B)Ljava/lang/String;")
   @ObfuscatedName("ln")
   public static String method10974(HttpHeaders var0, byte var1) {
      if (var0 == null) {
         var0.getAcceptHeaderValue(var1);
      }

      try {
         ArrayList var2 = new ArrayList(var0.headers.entrySet());
         Collections.sort(var2, new classTR(var0));
         StringBuilder var3 = new StringBuilder();
         Iterator var4 = var2.iterator();

         while (var4.hasNext()) {
            if (var1 >= -1) {
               throw new IllegalStateException();
            }

            Entry var5 = (Entry)var4.next();
            if (var3.length() > 0) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               var3.append(",");
            }

            var3.append(((HttpContentType)var5.getKey()).getValue(-1395181196));
            float var6 = (Float)var5.getValue();
            if (var6 < 1.0F) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               String var7 = var0.decimalFormat.format(var6);
               var3.append(";q=").append(var7);
            }
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "tx.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("af")
   public void method10941(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.acceptHeaderValues.put(var1, null != var2 ? var2 : "");
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ah")
   public void method10942(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.acceptHeaderValues.put(var1, null != var2 ? var2 : "");
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("al")
   public void method10943(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.acceptHeaderValues.put(var1, null != var2 ? var2 : "");
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bi")
   String method10975() {
      ArrayList var1 = new ArrayList(this.headers.entrySet());
      Collections.sort(var1, new classTR(this));
      StringBuilder var2 = new StringBuilder();

      for (Entry var4 : var1) {
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((HttpContentType)var4.getKey()).getValue(-2123945270));
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.decimalFormat.format(var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltx;Lur;F)V")
   @ObfuscatedName("hz")
   public static void method10967(HttpHeaders var0, HttpContentType var1, float var2) {
      var0.headers.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      var0.updateAcceptHeader(281053384);
   }

   @ObfuscatedSignature(descriptor = "(Ltx;I)Ljava/util/Map;")
   @ObfuscatedName("gy")
   public static Map method10938(HttpHeaders var0, int var1) {
      if (var0 == null) {
         return var0.getHeaders(var1);
      } else {
         try {
            return var0.acceptHeaderValues;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "tx.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   void method10972() {
      this.acceptHeaderValues.remove("Accept");
      if (!this.headers.isEmpty()) {
         this.acceptHeaderValues.put("Accept", method10974(this, (byte)-43));
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bg")
   public void method10946(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.acceptHeaderValues.remove(var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltx;)Ljava/util/Map;")
   @ObfuscatedName("bd")
   public static Map method10939(HttpHeaders var0) {
      if (var0 == null) {
         var0.method10973();
      }

      return var0.acceptHeaderValues;
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V")
   @ObfuscatedName("av")
   public void setRequestProperties(HttpsURLConnection var1, int var2) {
      try {
         for (Entry var4 : this.acceptHeaderValues.entrySet()) {
            var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "tx.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lso;Ljava/lang/String;)V")
   @ObfuscatedName("be")
   void method10950(HttpAuthenticationHeader var1, String var2) {
      String var3 = String.format("%s %s", HttpAuthenticationHeader.method10489(var1, (byte)-111), var2);
      this.header("Authorization", var3, -1640338111);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("am")
   public void method10954(String var1) {
      this.authenticationHeader(HttpAuthenticationHeader.BASIC, var1, -1640107663);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ao")
   public void method10957(String var1) {
      this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1, -1640107663);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bo")
   public void method10958(String var1) {
      this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1, -1640107663);
   }

   @ObfuscatedSignature(descriptor = "(Lur;)V")
   @ObfuscatedName("bk")
   public void method10961(HttpContentType var1) {
      this.acceptHeaderValues.put("Content-Type", var1.getValue(-2075395566));
   }

   @ObfuscatedSignature(descriptor = "(Lso;Ljava/lang/String;)V")
   @ObfuscatedName("aq")
   void method10951(HttpAuthenticationHeader var1, String var2) {
      String var3 = String.format("%s %s", HttpAuthenticationHeader.method10489(var1, (byte)-51), var2);
      this.header("Authorization", var3, -1553580099);
   }

   @ObfuscatedSignature(descriptor = "(Lur;)V")
   @ObfuscatedName("bm")
   public void method10965(HttpContentType var1) {
      method10969(this, var1, 1.0F, 650660433);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ap")
   public void removeContentType(byte var1) {
      try {
         this.acceptHeaderValues.remove("Content-Type");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tx.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("ag")
   public void header(String var1, String var2, int var3) {
      try {
         if (null != var1) {
            if (var3 == 2002029048) {
               return;
            }

            if (!var1.isEmpty()) {
               if (var3 == 2002029048) {
                  throw new IllegalStateException();
               }

               this.acceptHeaderValues.put(var1, null != var2 ? var2 : "");
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tx.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bs")
   public void method10947(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.acceptHeaderValues.remove(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("by")
   String method10976() {
      ArrayList var1 = new ArrayList(this.headers.entrySet());
      Collections.sort(var1, new classTR(this));
      StringBuilder var2 = new StringBuilder();

      for (Entry var4 : var1) {
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((HttpContentType)var4.getKey()).getValue(-1732367739));
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.decimalFormat.format(var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   void method10973() {
      this.acceptHeaderValues.remove("Accept");
      if (!this.headers.isEmpty()) {
         this.acceptHeaderValues.put("Accept", method10974(this, (byte)-90));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/Map;")
   @ObfuscatedName("at")
   public Map getHeaders(int var1) {
      try {
         return this.acceptHeaderValues;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tx.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lur;I)V")
   @ObfuscatedName("ay")
   public void accept(HttpContentType var1, int var2) {
      try {
         method10969(this, var1, 1.0F, 650660433);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tx.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lur;FI)V")
   @ObfuscatedName("au")
   void acceptWithFactor(HttpContentType var1, float var2, int var3) {
      try {
         this.acceptHeaderValues.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
         this.updateAcceptHeader(854522838);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tx.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("ad")
   String getAcceptHeaderValue(byte var1) {
      try {
         ArrayList var2 = new ArrayList(this.acceptHeaderValues.entrySet());
         Collections.sort(var2, new classTR(this));
         StringBuilder var3 = new StringBuilder();
         Iterator var4 = var2.iterator();

         while (var4.hasNext()) {
            if (var1 >= -1) {
               throw new IllegalStateException();
            }

            Entry var5 = (Entry)var4.next();
            if (var3.length() > 0) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               var3.append(",");
            }

            var3.append(((HttpContentType)var5.getKey()).getValue(-1395181196));
            float var6 = (Float)var5.getValue();
            if (var6 < 1.0F) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               String var7 = this.decimalFormat.format(var6);
               var3.append(";q=").append(var7);
            }
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "tx.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltx;Lur;FI)V")
   @ObfuscatedName("rn")
   public static void method10969(HttpHeaders var0, HttpContentType var1, float var2, int var3) {
      if (var0 == null) {
         var0.acceptWithFactor(var1, var2, var3);
      }

      try {
         var0.headers.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
         var0.updateAcceptHeader(854522838);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tx.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ak")
   public void bearerToken(String var1, int var2) {
      try {
         this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1, -1640107663);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tx.aj(" + ')');
      }
   }
}
