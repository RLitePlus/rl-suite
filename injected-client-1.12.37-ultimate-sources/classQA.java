import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.api.events.PostAnimation;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qa")
public class classQA {
   @ObfuscatedName("ag")
   boolean field5507 = false;
   @ObfuscatedSignature(descriptor = "Lqy;")
   @ObfuscatedName("af")
   final classQY field5504;
   @ObfuscatedSignature(descriptor = "Lqq;")
   @ObfuscatedName("ae")
   final classQQ field5505;
   @ObfuscatedSignature(descriptor = "Lwg;")
   @ObfuscatedName("ab")
   classWG field5510;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field5508 = 16777215;
   @ObfuscatedName("as")
   boolean field5506 = false;
   @ObfuscatedName("az")
   final HttpsURLConnection field5502;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   public static final int field5509 = 33;
   @ObfuscatedName("ax")
   int field5503 = -1265793504;

   @ObfuscatedSignature(descriptor = "(Lwg;I)V")
   @ObfuscatedName("af")
   public void method9418(classWG var1, int var2) {
      try {
         if (!this.field5507) {
            if (var1 == null) {
               if (var2 == -103254840) {
                  throw new IllegalStateException();
               } else {
                  this.field5504.method9853("Content-Type", -945488981);
                  this.field5510 = null;
               }
            } else {
               this.field5510 = var1;
               if (this.field5510.vmethod631((byte)63) != null) {
                  this.field5504.method9865(this.field5510.vmethod631((byte)62), (byte)19);
               } else {
                  classQY.method9867(this.field5504, -874709466);
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qa.af(" + ')');
      }
   }

   public classQA(URL var1, classQQ var2, classQY var3, boolean var4) throws IOException {
      if (!var2.method9705(1240044487)) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method9706(88836456));
      } else {
         this.field5502 = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            this.field5502.setSSLSocketFactory(classQL.method9610(1598274060));
         }

         this.field5505 = var2;
         this.field5504 = var3 != null ? var3 : new classQY();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;)V")
   @ObfuscatedName("ko")
   public static void method9415(classKQ var0) {
      if (var0 == null) {
         var0.method6526();
      }

      var0.field3999 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Lqy;")
   @ObfuscatedName("az")
   public classQY method9416(int var1) {
      try {
         return this.field5504;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qa.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lqg;")
   @ObfuscatedName("aq")
   classQG method9426() {
      try {
         if (!this.field5507 || this.field5502.getResponseCode() == -1) {
            return new classQG("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.field5502.disconnect();
         return new classQG("Error decoding REST response code: " + var10.getMessage());
      }

      classQG var3;
      try {
         return new classQG(this.field5502);
      } catch (IOException var8) {
         var3 = new classQG("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.field5502.disconnect();
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   boolean method9423(int var1) throws IOException {
      try {
         if (!this.field5507) {
            if (var1 == -1522817247) {
               throw new IllegalStateException();
            }

            this.method9422(880555563);
         }

         this.field5502.connect();
         boolean var10000;
         if (this.field5502.getResponseCode() == -1) {
            if (var1 == -1522817247) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qa.ab(" + ')');
      }
   }

   public classQA(URL var1, classQQ var2, boolean var3) throws IOException {
      this(var1, var2, new classQY(), var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqa;)Z")
   @ObfuscatedName("rz")
   public static boolean method9424(classQA var0) throws IOException {
      if (!var0.field5507) {
         var0.method9422(880555563);
      }

      var0.field5502.connect();
      return var0.field5502.getResponseCode() == -1;
   }

   @ObfuscatedSignature(descriptor = "()Lqy;")
   @ObfuscatedName("as")
   public classQY method9417() {
      return this.field5504;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SIII)V")
   @ObfuscatedName("af")
   static void method9414(String[] var0, short[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            short var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for (int var9 = var2; var9 < var3; var9++) {
               if (var4 <= -1310151407) {
                  return;
               }

               if (null != var7) {
                  if (var4 <= -1310151407) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9] == null || var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 <= -1310151407) {
                     throw new IllegalStateException();
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method9414(var0, var1, var2, var6 - 1, -1295167483);
            method9414(var0, var1, var6 + 1, var3, -449139230);
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "qa.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwg;)V")
   @ObfuscatedName("ac")
   public void method9419(classWG var1) {
      if (!this.field5507) {
         if (var1 == null) {
            this.field5504.method9853("Content-Type", 902626256);
            this.field5510 = null;
         } else {
            this.field5510 = var1;
            if (this.field5510.vmethod631((byte)103) != null) {
               this.field5504.method9865(this.field5510.vmethod631((byte)11), (byte)19);
            } else {
               classQY.method9867(this.field5504, -1316975470);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method9420() throws ProtocolException {
      if (!this.field5507) {
         this.field5502.setRequestMethod(this.field5505.method9706(425966815));
         this.field5504.method9844(this.field5502, (byte)0);
         if (this.field5505.method9711(643990299) && null != this.field5510) {
            this.field5502.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.field5510.vmethod637(-1390912683));
               var1.writeTo(this.field5502.getOutputStream());
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

         this.field5502.setConnectTimeout(-794691121 * this.field5503);
         this.field5502.setInstanceFollowRedirects(this.field5506);
         this.field5507 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lqg;")
   @ObfuscatedName("ag")
   classQG method9427(byte var1) {
      try {
         try {
            label65: {
               if (this.field5507) {
                  if (var1 == 1) {
                     throw new IllegalStateException();
                  }

                  if (this.field5502.getResponseCode() != -1) {
                     break label65;
                  }

                  if (var1 == 1) {
                     throw new IllegalStateException();
                  }
               }

               return new classQG("No REST response has been received yet.");
            }
         } catch (IOException var12) {
            this.field5502.disconnect();
            return new classQG("Error decoding REST response code: " + var12.getMessage());
         }

         classQG var4;
         try {
            return new classQG(this.field5502);
         } catch (IOException var10) {
            var4 = new classQG("Error decoding REST response: " + var10.getMessage());
         } finally {
            this.field5502.disconnect();
         }

         return var4;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "qa.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   void method9421() throws ProtocolException {
      if (!this.field5507) {
         this.field5502.setRequestMethod(this.field5505.method9706(766059727));
         this.field5504.method9844(this.field5502, (byte)0);
         if (this.field5505.method9711(643990299) && null != this.field5510) {
            this.field5502.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.field5510.vmethod637(-1390912683));
               var1.writeTo(this.field5502.getOutputStream());
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

         this.field5502.setConnectTimeout(1848947901 * this.field5503);
         this.field5502.setInstanceFollowRedirects(this.field5506);
         this.field5507 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqa;)Z")
   @ObfuscatedName("bp")
   public static boolean method9425(classQA var0) throws IOException {
      if (!var0.field5507) {
         var0.method9422(880555563);
      }

      var0.field5502.connect();
      return var0.field5502.getResponseCode() == -1;
   }

   @ObfuscatedSignature(descriptor = "()Lqg;")
   @ObfuscatedName("ad")
   classQG method9428() {
      try {
         if (!this.field5507 || this.field5502.getResponseCode() == -1) {
            return new classQG("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.field5502.disconnect();
         return new classQG("Error decoding REST response code: " + var10.getMessage());
      }

      classQG var3;
      try {
         return new classQG(this.field5502);
      } catch (IOException var8) {
         var3 = new classQG("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.field5502.disconnect();
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(II)Lou;")
   @ObfuscatedName("az")
   public static classOU method9430(int var0, int var1) {
      synchronized (classOU.field5141) {
         int var5 = var0;
         int var6 = -1676962954;

         classOU var10000;
         try {
            classOU var7 = (classOU)classOU.field5141.method6422(var5);
            if (var7 != null) {
               if (var6 == 793448697) {
                  throw new IllegalStateException();
               }

               var10000 = var7;
            } else {
               byte[] var8 = classOU.field5153.method11867(12, var5, -617271788);
               var7 = new classOU(new classXY(var8), var5);
               classOU.field5141.method6428(var7, var5);
               var10000 = var7;
            }
         } catch (RuntimeException var9) {
            throw classEG.method3884(var9, "qa.az(" + ')');
         }

         classOU var3 = var10000;
         if (var3.field5118 == -1) {
            var3.field5118 = var0;
            classOE.field4843.getCallbacks().post(new PostAnimation(var3));
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;I)J")
   @ObfuscatedName("ad")
   public static long method9429(classTE var0, int var1) {
      try {
         classON.method8613(var0, classYY.field7111, -1336024436);
         int[] var2 = var0.method10748(1680031641);
         int var3 = var0.method10756(-1859683172);
         long var4 = 0L;

         for (int var6 = 0; var6 < var3; var6++) {
            if (var1 >= 1336932499) {
               throw new IllegalStateException();
            }

            var4 += var2[var6];
         }

         return var4;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "qa.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void method9422(int var1) throws ProtocolException {
      try {
         if (this.field5507) {
            if (var1 != 880555563) {
               throw new IllegalStateException();
            }
         } else {
            this.field5502.setRequestMethod(this.field5505.method9706(-640518930));
            this.field5504.method9844(this.field5502, (byte)0);
            label76:
            if (!this.field5505.method9711(643990299) || null == this.field5510) {
               this.field5502.setConnectTimeout(-794691121 * this.field5503);
               this.field5502.setInstanceFollowRedirects(this.field5506);
               this.field5507 = true;
            } else if (var1 != 880555563) {
               throw new IllegalStateException();
            } else {
               this.field5502.setDoOutput(true);
               ByteArrayOutputStream var2 = new ByteArrayOutputStream();

               try {
                  try {
                     var2.write(this.field5510.vmethod637(-1390912683));
                     var2.writeTo(this.field5502.getOutputStream());
                  } catch (IOException var13) {
                     var13.printStackTrace();
                  }
                  break label76;
               } finally {
                  try {
                     var2.close();
                  } catch (IOException var12) {
                     var12.printStackTrace();
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "qa.ae(" + ')');
      }
   }
}
