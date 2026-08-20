import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eu")
public class SecureUrlRequester extends UrlRequester {
   @ObfuscatedName("ae")
   final boolean secureHttps;
   @ObfuscatedName("bj")
   static int field1707;
   @ObfuscatedSignature(descriptor = "Lclient;")
   @ObfuscatedName("ff")
   public static client client;
   @ToRemove(unused = "true")
   @ObfuscatedName("dg")
   static final String field1710 = "oldschool";
   @ToRemove(unused = "true")
   @ObfuscatedName("dq")
   static final int field1708 = 3;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leu;Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("bi")
   public static URLConnection method3896(SecureUrlRequester var0, UrlRequest var1) throws IOException {
      if (var0 == null) {
         return var0.method3900(var1);
      } else {
         HttpsURLConnection var2 = (HttpsURLConnection)var1.field1727.openConnection();
         if (!var0.secureHttps) {
            var2.setSSLSocketFactory(SecureRandomSSLSocketFactory.method8(1569116708));
         }

         var0.setDefaultRequestProperties(var2, 2146753197);
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;B)Ljava/net/URLConnection;")
   @ObfuscatedName("al")
   URLConnection openHttpConnection(UrlRequest var1, byte var2) throws IOException {
      try {
         URLConnection var3 = var1.field1727.openConnection();
         this.setDefaultRequestProperties(var3, 2146753197);
         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "eu.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Leu;Ley;B)Ljava/net/URLConnection;")
   @ObfuscatedName("re")
   public static URLConnection method3897(SecureUrlRequester var0, UrlRequest var1, byte var2) throws IOException {
      if (var0 == null) {
         var0.openHttpsConnection(var1, var2);
      }

      try {
         HttpsURLConnection var3 = (HttpsURLConnection)var1.field1727.openConnection();
         if (!var0.secureHttps) {
            var3.setSSLSocketFactory(SecureRandomSSLSocketFactory.method8(265586711));
         }

         var0.setDefaultRequestProperties(var3, 2146753197);
         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "eu.af(" + ')');
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Ley;B)V")
   @ObfuscatedName("av")
   @Override
   void openConnection(UrlRequest var1, byte var2) throws IOException {
      try {
         URLConnection var3 = null;
         boolean var11 = false /* VF: Semaphore variable */;

         label173: {
            label164: {
               try {
                  label170: {
                     var11 = true;
                     String var15 = var1.field1727.getProtocol();
                     if (var15.equals("http")) {
                        if (var2 >= 12) {
                           throw new IllegalStateException();
                        }

                        var3 = this.openHttpConnection(var1, (byte)100);
                     } else {
                        if (!var15.equals("https")) {
                           var1.field1728 = UrlRequest.field1726 * 53759743;
                           var11 = false;
                           break label170;
                        }

                        if (var2 >= 12) {
                           throw new IllegalStateException();
                        }

                        var3 = method3897(this, var1, (byte)120);
                     }

                     this.method3742(var3, var1, -948222317);
                     var11 = false;
                     break label173;
                  }
               } catch (IOException var12) {
                  var1.field1728 = UrlRequest.field1726 * 53759743;
                  var11 = false;
                  break label164;
               } finally {
                  if (var11) {
                     if (var3 != null) {
                        if (var2 >= 12) {
                           return;
                        }

                        if (var3 instanceof HttpURLConnection) {
                           if (var2 >= 12) {
                              throw new IllegalStateException();
                           }

                           HttpURLConnection var7 = (HttpURLConnection)var3;
                           var7.disconnect();
                        }
                     }
                  }
               }

               if (var3 != null) {
                  if (var2 >= 12) {
                     return;
                  }

                  if (var3 instanceof HttpURLConnection) {
                     if (var2 >= 12) {
                        throw new IllegalStateException();
                     }

                     HttpURLConnection var5 = (HttpURLConnection)var3;
                     var5.disconnect();
                  }
               }

               return;
            }

            if (var3 != null) {
               if (var2 >= 12) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof HttpURLConnection) {
                  if (var2 >= 12) {
                     throw new IllegalStateException();
                  }

                  HttpURLConnection var4 = (HttpURLConnection)var3;
                  var4.disconnect();
                  return;
               }
            }

            return;
         }

         if (var3 != null) {
            if (var2 >= 12) {
               throw new IllegalStateException();
            }

            if (var3 instanceof HttpURLConnection) {
               if (var2 >= 12) {
                  return;
               }

               HttpURLConnection var16 = (HttpURLConnection)var3;
               var16.disconnect();
            }
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "eu.av(" + ')');
      }
   }

   public SecureUrlRequester(boolean var1, int var2) {
      super(var2);
      this.secureHttps = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("ap")
   @Override
   void vmethod181(UrlRequest var1) throws IOException {
      URLConnection var2 = null;

      try {
         try {
            String var3 = var1.field1727.getProtocol();
            if (var3.equals("http")) {
               var2 = this.openHttpConnection(var1, (byte)-26);
            } else {
               if (!var3.equals("https")) {
                  var1.field1728 = UrlRequest.field1726 * 53759743;
                  return;
               }

               var2 = method3897(this, var1, (byte)47);
            }

            this.method3742(var2, var1, 891004335);
         } catch (IOException var9) {
            var1.field1728 = UrlRequest.field1726 * 53759743;
         }
      } finally {
         if (var2 != null && var2 instanceof HttpURLConnection) {
            HttpURLConnection var6 = (HttpURLConnection)var2;
            var6.disconnect();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leu;Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("lf")
   public static URLConnection method3898(SecureUrlRequester var0, UrlRequest var1) throws IOException {
      if (var0 == null) {
         var0.method3895(var1);
      }

      HttpsURLConnection var2 = (HttpsURLConnection)var1.field1727.openConnection();
      if (!var0.secureHttps) {
         var2.setSSLSocketFactory(SecureRandomSSLSocketFactory.method8(855076719));
      }

      var0.setDefaultRequestProperties(var2, 2146753197);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("ak")
   @Override
   void vmethod179(UrlRequest var1) throws IOException {
      URLConnection var2 = null;

      try {
         try {
            String var3 = var1.field1727.getProtocol();
            if (var3.equals("http")) {
               var2 = this.openHttpConnection(var1, (byte)-30);
            } else {
               if (!var3.equals("https")) {
                  var1.field1728 = UrlRequest.field1726 * 53759743;
                  return;
               }

               var2 = method3897(this, var1, (byte)87);
            }

            this.method3742(var2, var1, -737590347);
         } catch (IOException var9) {
            var1.field1728 = UrlRequest.field1726 * 53759743;
         }
      } finally {
         if (var2 != null && var2 instanceof HttpURLConnection) {
            HttpURLConnection var6 = (HttpURLConnection)var2;
            var6.disconnect();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;)V")
   @ObfuscatedName("aw")
   @Override
   void vmethod180(UrlRequest var1) throws IOException {
      URLConnection var2 = null;

      try {
         try {
            String var3 = var1.field1727.getProtocol();
            if (var3.equals("http")) {
               var2 = this.openHttpConnection(var1, (byte)-41);
            } else {
               if (!var3.equals("https")) {
                  var1.field1728 = UrlRequest.field1726 * 87658842;
                  return;
               }

               var2 = method3897(this, var1, (byte)112);
            }

            this.method3742(var2, var1, 1107568245);
         } catch (IOException var9) {
            var1.field1728 = UrlRequest.field1726 * 1074235976;
         }
      } finally {
         if (var2 != null && var2 instanceof HttpURLConnection) {
            HttpURLConnection var6 = (HttpURLConnection)var2;
            var6.disconnect();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("am")
   URLConnection method3895(UrlRequest var1) throws IOException {
      URLConnection var2 = var1.field1727.openConnection();
      this.setDefaultRequestProperties(var2, 2146753197);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("av")
   public static TransformationMatrix method3893(int var0) {
      try {
         synchronized (TransformationMatrix.field5731) {
            if (-1539552615 * TransformationMatrix.field5729 == 0) {
               if (var0 == -939066417) {
                  throw new IllegalStateException();
               } else {
                  return new TransformationMatrix();
               }
            } else {
               TransformationMatrix.field5731[(TransformationMatrix.field5729 -= -794138199) * -1539552615].method9938((byte)6);
               return TransformationMatrix.field5731[TransformationMatrix.field5729 * -1539552615];
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "eu.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;B)Ljava/net/URLConnection;")
   @ObfuscatedName("af")
   URLConnection openHttpsConnection(UrlRequest var1, byte var2) {
      try {
         HttpsURLConnection var3 = (HttpsURLConnection)var1.field1727.openConnection();
         if (!this.secureHttps) {
            var3.setSSLSocketFactory(SecureRandomSSLSocketFactory.method8(265586711));
         }

         this.setDefaultRequestProperties(var3, 2146753197);
         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "eu.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("aa")
   URLConnection method3900(UrlRequest var1) {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.field1727.openConnection();
      if (!this.secureHttps) {
         var2.setSSLSocketFactory(SecureRandomSSLSocketFactory.method8(1569116708));
      }

      this.setDefaultRequestProperties(var2, 2146753197);
      return var2;
   }
}
