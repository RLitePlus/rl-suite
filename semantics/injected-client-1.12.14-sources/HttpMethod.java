import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ay")
public class HttpMethod implements Enum {
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field103 = 249;
   @ObfuscatedSignature(descriptor = "Lay;")
   @ObfuscatedName("at")
   public static final HttpMethod GET = new HttpMethod(1, "GET", true, false);
   @ObfuscatedSignature(descriptor = "Lay;")
   @ObfuscatedName("ag")
   static final HttpMethod PUT = new HttpMethod(2, "PUT", false, true);
   @ObfuscatedSignature(descriptor = "Lay;")
   @ObfuscatedName("an")
   static final HttpMethod PATCH = new HttpMethod(3, "PATCH", false, true);
   @ObfuscatedSignature(descriptor = "Lay;")
   @ObfuscatedName("ae")
   static final HttpMethod DELETE = new HttpMethod(4, "DELETE", false, true);
   @ObfuscatedName("aj")
   int field99;
   @ObfuscatedName("ak")
   String name;
   @ObfuscatedName("ap")
   boolean field102;
   @ObfuscatedSignature(descriptor = "Lay;")
   @ObfuscatedName("av")
   public static final HttpMethod POST = new HttpMethod(0, "POST", true, true);
   @ObfuscatedName("aw")
   boolean field100;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -1731089793 * this.field99;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ae")
   boolean method360(byte var1) {
      try {
         return this.field100;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ay.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String getName(byte var1) {
      try {
         return this.name;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ay.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   boolean method366(int var1) {
      try {
         return this.field102;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ay.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)V")
   @ObfuscatedName("jp")
   static final void drawLoadingMessage(String var0, boolean var1, int var2) {
      try {
         if (!client.showLoadingMessages) {
            if (var2 >= 1000625791) {
               throw new IllegalStateException();
            }
         } else {
            byte var3 = 4;
            int var4 = var3 + 6;
            int var5 = var3 + 6;
            int var6 = UserComparator5.fontPlain12.lineWidth(var0, 250);
            int var7 = UserComparator5.fontPlain12.lineCount(var0, 250) * 13;
            Rasterizer2D.Rasterizer2D_fillRectangle(var4 - var3, var5 - var3, var3 + var3 + var6, var7 + var3 + var3, 0);
            Rasterizer2D.Rasterizer2D_drawRectangle(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
            AbstractFont.method10416(UserComparator5.fontPlain12, var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            class31.method668(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, (byte)102);
            if (var1) {
               if (var2 >= 1000625791) {
                  throw new IllegalStateException();
               }

               client.rasterProvider.drawFull(0, 0, (byte)89);
            } else {
               class408.method8780(var4, var5, var6, var7, -473888564);
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ay.jp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -1731089793 * this.field99;
   }

   @ObfuscatedSignature(descriptor = "(IS)Ljava/lang/String;")
   @ObfuscatedName("ag")
   static final String method369(int var0, short var1) {
      try {
         if (var0 < 100000) {
            return "<col=ffff00>" + var0 + "</col>";
         } else if (var0 < 10000000) {
            if (var1 == -256) {
               throw new IllegalStateException();
            } else {
               return "<col=ffffff>" + var0 / 1000 + Strings.field4975 + "</col>";
            }
         } else {
            return "<col=00ff80>" + var0 / 1000000 + Strings.field5032 + "</col>";
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ay.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   boolean method361() {
      return this.field100;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   boolean method362() {
      return this.field100;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return -1731089793 * this.field99;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method365() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return -1731089793 * this.field99;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ay.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsr;I)I")
   @ObfuscatedName("qp")
   public static int method359(classSR var0, int var1) {
      if (var0 == null) {
         var0.method10507(var1);
      }

      return var0.field5859[var1];
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   boolean method367() {
      return this.field102;
   }

   HttpMethod(int var1, String var2, boolean var3, boolean var4) {
      this.field99 = var1 * -2097146497;
      this.name = var2;
      this.field100 = var3;
      this.field102 = var4;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)V")
   @ObfuscatedName("kq")
   static void method372(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         class1.method254(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, (byte)57);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ay.kq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lwn;")
   @ObfuscatedName("ae")
   public static AccessFile getPreferencesFile(String var0, String var1, boolean var2, byte var3) {
      try {
         File var4 = new File(class452.cacheDir, "preferences" + var0 + ".dat");
         label55:
         if (!var4.exists()) {
            String var5 = "";
            if (-1114182337 * class224.cacheGamebuild == 33) {
               if (var3 != 61) {
                  throw new IllegalStateException();
               }

               var5 = "_rc";
            } else if (class224.cacheGamebuild * -1114182337 == 34) {
               var5 = "_wip";
            }

            File var6 = new File(JagexCache.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
            if (!var2) {
               if (var3 != 61) {
                  throw new IllegalStateException();
               }

               if (var6.exists()) {
                  if (var3 != 61) {
                     throw new IllegalStateException();
                  }

                  try {
                     return new AccessFile(var6, "rw", 10000L);
                  } catch (IOException var9) {
                  }
               }
            }

            try {
               return new AccessFile(var4, "rw", 10000L);
            } catch (IOException var8) {
               throw new RuntimeException();
            }
         } else if (var3 != 61) {
            throw new IllegalStateException();
         } else {
            try {
               return new AccessFile(var4, "rw", 10000L);
            } catch (IOException var10) {
               break label55;
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "ay.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   static final int method368(int var0) {
      try {
         return -459009589 * ViewportMouse.ViewportMouse_y;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ay.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   boolean method363() {
      return this.field100;
   }
}
