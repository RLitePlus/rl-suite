import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ar")
public class AsyncHttpResponse {
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field57 = 27;
   @ObfuscatedName("av")
   Future responseFuture;
   @ObfuscatedName("at")
   String errorMessage;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("jz")
   static Archive field63;
   @ObfuscatedName("us")
   static int field60;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field59 = 1400;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field58 = 2;
   @ObfuscatedSignature(descriptor = "Ldd;")
   @ObfuscatedName("fx")
   static WorldView worldView;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ap")
   public final String method216() {
      return this.errorMessage;
   }

   AsyncHttpResponse(String var1) {
      method221(this, var1, -805239646);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lar;)Z")
   @ObfuscatedName("jo")
   public static boolean method225(AsyncHttpResponse var0) {
      return var0 == null ? var0.method227() : var0.errorMessage != null || null == var0.responseFuture;
   }

   @ObfuscatedSignature(descriptor = "(IB)Lhu;")
   @ObfuscatedName("av")
   public static NPCComposition getNpcDefinition(int var0, byte var1) {
      try {
         NPCComposition var2 = (NPCComposition)class402.method8806(NPCComposition.NpcDefinition_cached, var0);
         if (var2 != null) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = Username.NpcDefinition_archive.getFile(9, var0, 2101339988);
            var2 = new NPCComposition();
            var2.id = 596350035 * var0;
            if (var3 != null) {
               var2.decode(new Buffer(var3), 1108069782);
            }

            var2.postDecode((byte)85);
            NPCComposition.NpcDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ar.av(" + ')');
      }
   }

   AsyncHttpResponse(Future var1) {
      this.responseFuture = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public boolean hasError(int var1) {
      try {
         if (this.errorMessage == null) {
            if (null != this.responseFuture) {
               return false;
            }

            if (var1 >= -1891642359) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ar.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aj")
   public final String method217() {
      return this.errorMessage;
   }

   @ObfuscatedSignature(descriptor = "(Lar;I)Lal;")
   @ObfuscatedName("tw")
   public static HttpResponse method230(AsyncHttpResponse var0, int var1) {
      if (var0 == null) {
         return var0.await(var1);
      } else {
         try {
            if (var0.hasError(-2056339352)) {
               return new HttpResponse(var0.errorMessage);
            } else if (!var0.hasFinished(650593811)) {
               if (var1 == -1256286174) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               try {
                  return (HttpResponse)var0.responseFuture.get();
               } catch (Exception var4) {
                  String var3 = "Error retrieving REST request reply";
                  System.err.println(var3 + "\r\n" + var4);
                  method221(var0, var3, -1476895116);
                  return new HttpResponse(var3);
               }
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "ar.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Liv;")
   @ObfuscatedName("av")
   public static ObjectComposition getObjectDefinition(int var0, int var1) {
      synchronized (ObjectComposition.ObjectDefinition_cached) {
         int var4 = var0;
         int var5 = 2094555887;

         ObjectComposition var10000;
         try {
            ObjectComposition var6 = (ObjectComposition)class402.method8806(ObjectComposition.ObjectDefinition_cached, var4);
            if (null != var6) {
               var10000 = var6;
            } else {
               byte[] var7 = VarcInt.ObjectDefinition_archive.getFile(6, var4, -1169791916);
               var6 = new ObjectComposition();
               var6.id = -1273149277 * var4;
               if (var7 != null) {
                  var6.decode(new Buffer(var7), (byte)118);
               }

               var6.postDecode(634828876);
               if (var6.isSolid) {
                  var6.interactType = 0;
                  var6.boolean1 = false;
               }

               ObjectComposition.ObjectDefinition_cached.put(var6, var4);
               var10000 = var6;
            }
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "ar.av(" + ')');
         }

         return var10000;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("az")
   void method220(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.errorMessage = var1;
      if (null != this.responseFuture) {
         this.responseFuture.cancel(true);
         this.responseFuture = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lar;Ljava/lang/String;I)V")
   @ObfuscatedName("ow")
   public static void method221(AsyncHttpResponse var0, String var1, int var2) {
      if (var0 == null) {
         var0.method224(var1, var2);
      } else {
         try {
            if (null == var1) {
               if (var2 >= 1302373318) {
                  throw new IllegalStateException();
               }

               var1 = "";
            }

            var0.errorMessage = var1;
            if (null != var0.responseFuture) {
               if (var2 >= 1302373318) {
                  throw new IllegalStateException();
               }

               var0.responseFuture.cancel(true);
               var0.responseFuture = null;
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "ar.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("av")
   public final String getErrorMessage(int var1) {
      try {
         return this.errorMessage;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ar.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("au")
   void method222(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.errorMessage = var1;
      if (null != this.responseFuture) {
         this.responseFuture.cancel(true);
         this.responseFuture = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   public final boolean hasFinished(int var1) {
      try {
         if (this.hasError(-2045366595)) {
            if (var1 >= 1487820802) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.responseFuture.isDone();
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ar.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method227() {
      return this.errorMessage != null || null == this.responseFuture;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lar;Ljava/lang/String;)V")
   @ObfuscatedName("cf")
   public static void method223(AsyncHttpResponse var0, String var1) {
      if (var0 == null) {
         var0.method222(var1);
      } else {
         if (null == var1) {
            var1 = "";
         }

         var0.errorMessage = var1;
         if (null != var0.responseFuture) {
            var0.responseFuture.cancel(true);
            var0.responseFuture = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public final boolean method229() {
      return this.hasError(-2118243877) ? true : this.responseFuture.isDone();
   }

   @ObfuscatedSignature(descriptor = "()Lal;")
   @ObfuscatedName("ab")
   public final HttpResponse method231() {
      if (this.hasError(-2111631914)) {
         return new HttpResponse(this.errorMessage);
      } else if (!this.hasFinished(346026508)) {
         return null;
      } else {
         try {
            return (HttpResponse)this.responseFuture.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            method221(this, var2, -2075708419);
            return new HttpResponse(var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ak")
   public final String method219() {
      return this.errorMessage;
   }

   @ObfuscatedSignature(descriptor = "(I)Lal;")
   @ObfuscatedName("ae")
   public final HttpResponse await(int var1) {
      try {
         if (this.hasError(-2056339352)) {
            return new HttpResponse(this.errorMessage);
         } else if (!this.hasFinished(650593811)) {
            if (var1 == -1256286174) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            try {
               return (HttpResponse)this.responseFuture.get();
            } catch (Exception var4) {
               String var3 = "Error retrieving REST request reply";
               System.err.println(var3 + "\r\n" + var4);
               method221(this, var3, -1476895116);
               return new HttpResponse(var3);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ar.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("at")
   void method224(String var1, int var2) {
      try {
         if (null == var1) {
            if (var2 >= 1302373318) {
               throw new IllegalStateException();
            }

            var1 = "";
         }

         this.errorMessage = var1;
         if (null != this.responseFuture) {
            if (var2 >= 1302373318) {
               throw new IllegalStateException();
            }

            this.responseFuture.cancel(true);
            this.responseFuture = null;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ar.at(" + ')');
      }
   }
}
