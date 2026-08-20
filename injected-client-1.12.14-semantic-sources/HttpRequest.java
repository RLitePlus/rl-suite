import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("au")
public class HttpRequest {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field80 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field79 = 68;
   @ObfuscatedSignature(descriptor = "Lay;")
   @ObfuscatedName("ag")
   final HttpMethod field76;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("an")
   HttpPayload httpPayload;
   @ObfuscatedName("av")
   final HttpsURLConnection connection;
   @ObfuscatedName("ae")
   boolean requestInitialized;
   @ObfuscatedName("ak")
   int connectionTimeout;
   @ToRemove(unused = "true")
   @ObfuscatedName("cp")
   public static final int field81 = 87;
   @ObfuscatedSignature(descriptor = "Ltx;")
   @ObfuscatedName("at")
   final HttpHeaders httpHeaders;
   @ObfuscatedName("ai")
   static byte[][][] field83;
   @ObfuscatedName("aj")
   boolean followRedirects = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field78 = 2;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)V")
   @ObfuscatedName("wa")
   public static void method264(HttpRequest var0) throws ProtocolException {
      if (!var0.followRedirects) {
         var0.connection.setRequestMethod(var0.field76.getName((byte)-42));
         var0.httpHeaders.setRequestProperties(var0.connection, 690722571);
         if (var0.field76.method366(1232894927) && null != var0.httpPayload) {
            var0.connection.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(var0.httpPayload.toBytes(-115642726));
               var1.writeTo(var0.connection.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }
            }
         }

         var0.connection.setConnectTimeout(var0.connectionTimeout * -1487914785);
         var0.connection.setInstanceFollowRedirects(var0.requestInitialized);
         var0.followRedirects = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("wo")
   public static void method279(classOO var0, boolean var1) {
      if (var0 == null) {
         var0.method8520();
      }

      var0.method8619(0, var1, (short)512);
   }

   public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
      this.requestInitialized = false;
      this.connectionTimeout = 1444513824;
      if (!var2.method360((byte)-1)) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName((byte)0));
      } else {
         this.connection = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            this.connection.setSSLSocketFactory(SecureRandomSSLSocketFactory.method8(927080712));
         }

         this.field76 = var2;
         this.httpHeaders = null != var3 ? var3 : new HttpHeaders();
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("ay")
   public void method260(HttpPayload var1) {
      if (!this.followRedirects) {
         if (var1 == null) {
            this.httpHeaders.removeHeader("Content-Type", (byte)-44);
            this.httpPayload = null;
         } else {
            this.httpPayload = var1;
            if (this.httpPayload.getContentType(364878597) != null) {
               this.httpHeaders.contentType(this.httpPayload.getContentType(-337905814), 1627806445);
            } else {
               this.httpHeaders.removeContentType((byte)11);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lau;I)V")
   @ObfuscatedName("rf")
   public static void method265(HttpRequest var0, int var1) throws ProtocolException {
      if (var0 == null) {
         var0.initializeRequest(var1);
      } else {
         try {
            if (var0.followRedirects) {
               if (var1 != 1861658277) {
                  throw new IllegalStateException();
               }
            } else {
               var0.connection.setRequestMethod(var0.field76.getName((byte)-52));
               var0.httpHeaders.setRequestProperties(var0.connection, -1741375365);
               if (var0.field76.method366(1232894927)) {
                  if (var1 != 1861658277) {
                     throw new IllegalStateException();
                  }

                  if (null != var0.httpPayload) {
                     var0.connection.setDoOutput(true);
                     ByteArrayOutputStream var2 = new ByteArrayOutputStream();

                     try {
                        var2.write(var0.httpPayload.toBytes(-1948694789));
                        var2.writeTo(var0.connection.getOutputStream());
                     } catch (IOException var13) {
                        var13.printStackTrace();
                     } finally {
                        try {
                           var2.close();
                        } catch (IOException var12) {
                           var12.printStackTrace();
                        }
                     }
                  }
               }

               var0.connection.setConnectTimeout(var0.connectionTimeout * -1487914785);
               var0.connection.setInstanceFollowRedirects(var0.requestInitialized);
               var0.followRedirects = true;
            }
         } catch (RuntimeException var15) {
            throw RestClientThreadFactory.newRunException(var15, "au.ag(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)Z")
   @ObfuscatedName("yn")
   public static boolean method269(HttpRequest var0) throws IOException {
      if (!var0.followRedirects) {
         method265(var0, 1861658277);
      }

      var0.connection.connect();
      return var0.connection.getResponseCode() == -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Ltx;")
   @ObfuscatedName("av")
   public HttpHeaders getHeaders(int var1) {
      try {
         return this.httpHeaders;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "au.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIIII[Ljava/lang/String;IIB)V")
   @ObfuscatedName("ln")
   static void method281(
      WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11, byte var12
   ) {
      try {
         NodeDeque var13 = var0.pendingSpawns;
         PendingSpawn var14 = null;

         for (PendingSpawn var15 = (PendingSpawn)var13.last(); null != var15; var15 = (PendingSpawn)var13.previous()) {
            if (var12 != 1) {
               return;
            }

            if (1465889165 * var15.plane == var1) {
               if (var12 != 1) {
                  throw new IllegalStateException();
               }

               if (1691331269 * var15.x == var2) {
                  if (var12 != 1) {
                     return;
                  }

                  if (var15.y * -7912037 == var3) {
                     if (var12 != 1) {
                        throw new IllegalStateException();
                     }

                     if (var15.type * 1527879103 == var4) {
                        var14 = var15;
                        break;
                     }
                  }
               }
            }
         }

         if (null == var14) {
            if (var12 != 1) {
               return;
            }

            var14 = new PendingSpawn();
            var14.plane = 693107013 * var1;
            var14.type = var4 * 263805503;
            var14.x = -1187494899 * var2;
            var14.y = var3 * -2089969517;
            var14.field1247 = -735477441;
            WorldMapLabelSize.method7224(var0, var14, 1149527128);
            var13.addFirst(var14);
         }

         var14.objectId2 = var5 * 1920656975;
         var14.field1243 = var6 * -469119981;
         var14.field1246 = -1576974201 * var7;
         var14.delay = var10 * 753690807;
         var14.hitpoints = 316037303 * var11;
         var14.method2973(var8, (byte)-25);
         PendingSpawn.method2980(var14, var9, 2114463419);
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "au.ln(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luu;I)V")
   @ObfuscatedName("at")
   public void setPayload(HttpPayload var1, int var2) {
      try {
         if (!this.followRedirects) {
            if (var1 == null) {
               if (var2 > -1033955405) {
                  this.httpHeaders.removeHeader("Content-Type", (byte)-53);
                  this.httpPayload = null;
               }
            } else {
               this.httpPayload = var1;
               if (this.httpPayload.getContentType(1163055413) != null) {
                  if (var2 <= -1033955405) {
                     throw new IllegalStateException();
                  }

                  this.httpHeaders.contentType(this.httpPayload.getContentType(-914802620), -685462436);
               } else {
                  this.httpHeaders.removeContentType((byte)63);
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "au.at(" + ')');
      }
   }

   public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
      this(var1, var2, new HttpHeaders(), var3);
   }

   @ObfuscatedSignature(descriptor = "()Ltx;")
   @ObfuscatedName("aj")
   public HttpHeaders method257() {
      return this.httpHeaders;
   }

   @ObfuscatedSignature(descriptor = "(Luu;)V")
   @ObfuscatedName("au")
   public void method262(HttpPayload var1) {
      if (!this.followRedirects) {
         if (var1 == null) {
            this.httpHeaders.removeHeader("Content-Type", (byte)-57);
            this.httpPayload = null;
         } else {
            this.httpPayload = var1;
            if (this.httpPayload.getContentType(433970407) != null) {
               this.httpHeaders.contentType(this.httpPayload.getContentType(1035764196), -311997083);
            } else {
               this.httpHeaders.removeContentType((byte)122);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("an")
   boolean connect(byte var1) throws IOException {
      try {
         if (!this.followRedirects) {
            method265(this, 1861658277);
         }

         this.connection.connect();
         boolean var10000;
         if (this.connection.getResponseCode() == -1) {
            if (var1 >= 12) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "au.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method266() throws ProtocolException {
      if (!this.followRedirects) {
         this.connection.setRequestMethod(this.field76.getName((byte)-29));
         this.httpHeaders.setRequestProperties(this.connection, -1861480004);
         if (this.field76.method366(1232894927) && null != this.httpPayload) {
            this.connection.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.httpPayload.toBytes(-889734614));
               var1.writeTo(this.connection.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }
            }
         }

         this.connection.setConnectTimeout(this.connectionTimeout * -1487914785);
         this.connection.setInstanceFollowRedirects(this.requestInitialized);
         this.followRedirects = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)V")
   @ObfuscatedName("ie")
   public static void method267(HttpRequest var0) throws ProtocolException {
      if (!var0.followRedirects) {
         var0.connection.setRequestMethod(var0.field76.getName((byte)-124));
         var0.httpHeaders.setRequestProperties(var0.connection, -817742818);
         if (var0.field76.method366(1232894927) && null != var0.httpPayload) {
            var0.connection.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(var0.httpPayload.toBytes(860792622));
               var1.writeTo(var0.connection.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }
            }
         }

         var0.connection.setConnectTimeout(var0.connectionTimeout * -1487914785);
         var0.connection.setInstanceFollowRedirects(var0.requestInitialized);
         var0.followRedirects = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lau;B)Lal;")
   @ObfuscatedName("vg")
   public static HttpResponse method272(HttpRequest var0, byte var1) {
      if (var0 == null) {
         return var0.getResponse(var1);
      } else {
         try {
            try {
               label70: {
                  if (var0.followRedirects) {
                     if (var1 != 40) {
                        throw new IllegalStateException();
                     }

                     if (var0.connection.getResponseCode() != -1) {
                        break label70;
                     }

                     if (var1 != 40) {
                        throw new IllegalStateException();
                     }
                  }

                  return new HttpResponse("No REST response has been received yet.");
               }
            } catch (IOException var12) {
               var0.connection.disconnect();
               return new HttpResponse("Error decoding REST response code: " + var12.getMessage());
            }

            HttpResponse var4;
            try {
               return new HttpResponse(var0.connection);
            } catch (IOException var10) {
               var4 = new HttpResponse("Error decoding REST response: " + var10.getMessage());
            } finally {
               var0.connection.disconnect();
            }

            return var4;
         } catch (RuntimeException var13) {
            throw RestClientThreadFactory.newRunException(var13, "au.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   boolean method271() throws IOException {
      if (!this.followRedirects) {
         method265(this, 1861658277);
      }

      this.connection.connect();
      return this.connection.getResponseCode() == -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Lxv;)Ltz;")
   @ObfuscatedName("wr")
   public static User method263(UserList var0, Username var1) {
      if (var0 == null) {
         var0.method10677(var1);
      }

      User var2 = var0.getByCurrentUsername(var1, 862907097);
      return null != var2 ? var2 : var0.getByPreviousUsername(var1, -386799897);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;I)I")
   @ObfuscatedName("at")
   static int method278(AbstractArchive var0, int var1) {
      try {
         int var2 = Login.field405.length + Login.field383.length;
         String[] var3 = Login.field407;

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var1 == -1129661647) {
               throw new IllegalStateException();
            }

            String var5 = var3[var4];
            if (var0.groupLoadPercentByName(var5, (byte)-79) != -1) {
               if (var1 == -1129661647) {
                  throw new IllegalStateException();
               }

               var2++;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "au.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)Lal;")
   @ObfuscatedName("fu")
   public static HttpResponse method273(HttpRequest var0) {
      try {
         if (!var0.followRedirects || var0.connection.getResponseCode() == -1) {
            return new HttpResponse("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         var0.connection.disconnect();
         return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
      }

      HttpResponse var3;
      try {
         return new HttpResponse(var0.connection);
      } catch (IOException var8) {
         var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
      } finally {
         var0.connection.disconnect();
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Lal;")
   @ObfuscatedName("ah")
   HttpResponse method274() {
      try {
         if (!this.followRedirects || this.connection.getResponseCode() == -1) {
            return new HttpResponse("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.connection.disconnect();
         return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
      }

      HttpResponse var3;
      try {
         return new HttpResponse(this.connection);
      } catch (IOException var8) {
         var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.connection.disconnect();
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Lal;")
   @ObfuscatedName("ab")
   HttpResponse method275() {
      try {
         if (!this.followRedirects || this.connection.getResponseCode() == -1) {
            return new HttpResponse("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.connection.disconnect();
         return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
      }

      HttpResponse var3;
      try {
         return new HttpResponse(this.connection);
      } catch (IOException var8) {
         var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.connection.disconnect();
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Lal;")
   @ObfuscatedName("ar")
   HttpResponse method276() {
      try {
         if (!this.followRedirects || this.connection.getResponseCode() == -1) {
            return new HttpResponse("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.connection.disconnect();
         return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
      }

      HttpResponse var3;
      try {
         return new HttpResponse(this.connection);
      } catch (IOException var8) {
         var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.connection.disconnect();
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(B)Lkn;")
   @ObfuscatedName("hx")
   public static IndexCheck method280(byte var0) {
      try {
         return client.indexCheck;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "au.hx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ltx;")
   @ObfuscatedName("aw")
   public HttpHeaders method258() {
      return this.httpHeaders;
   }

   @ObfuscatedSignature(descriptor = "()Ltx;")
   @ObfuscatedName("ak")
   public HttpHeaders method259() {
      return this.httpHeaders;
   }

   @ObfuscatedSignature(descriptor = "(B)Lal;")
   @ObfuscatedName("ae")
   HttpResponse getResponse(byte var1) {
      try {
         try {
            label65: {
               if (this.requestInitialized) {
                  if (var1 != 40) {
                     throw new IllegalStateException();
                  }

                  if (this.connection.getResponseCode() != -1) {
                     break label65;
                  }

                  if (var1 != 40) {
                     throw new IllegalStateException();
                  }
               }

               return new HttpResponse("No REST response has been received yet.");
            }
         } catch (IOException var12) {
            this.connection.disconnect();
            return new HttpResponse("Error decoding REST response code: " + var12.getMessage());
         }

         HttpResponse var4;
         try {
            return new HttpResponse(this.connection);
         } catch (IOException var10) {
            var4 = new HttpResponse("Error decoding REST response: " + var10.getMessage());
         } finally {
            this.connection.disconnect();
         }

         return var4;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "au.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void initializeRequest(int var1) {
      try {
         if (this.followRedirects) {
            if (var1 != 1861658277) {
               throw new IllegalStateException();
            }
         } else {
            this.connection.setRequestMethod(this.field76.getName((byte)-52));
            this.httpHeaders.setRequestProperties(this.connection, -1741375365);
            if (this.field76.method366(1232894927)) {
               if (var1 != 1861658277) {
                  throw new IllegalStateException();
               }

               if (null != this.httpPayload) {
                  this.connection.setDoOutput(true);
                  ByteArrayOutputStream var2 = new ByteArrayOutputStream();

                  try {
                     var2.write(this.httpPayload.toBytes(-1948694789));
                     var2.writeTo(this.connection.getOutputStream());
                  } catch (IOException var13) {
                     var13.printStackTrace();
                  } finally {
                     try {
                        var2.close();
                     } catch (IOException var12) {
                        var12.printStackTrace();
                     }
                  }
               }
            }

            this.connection.setConnectTimeout(this.connectionTimeout * -1487914785);
            this.connection.setInstanceFollowRedirects(this.followRedirects);
            this.followRedirects = true;
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "au.ag(" + ')');
      }
   }
}
