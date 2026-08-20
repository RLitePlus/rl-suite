import java.awt.FontMetrics;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONObject;

@ObfuscatedName("hp")
public class class201 {
   @ObfuscatedSignature(descriptor = "Lhp;")
   @ObfuscatedName("ag")
   public static final class201 field2282 = new class201();
   @ObfuscatedSignature(descriptor = "Lhp;")
   @ObfuscatedName("at")
   public static final class201 field2281 = new class201();
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   public static final int field2284 = 32;
   @ObfuscatedName("sk")
   static int widgetDragDuration;
   @ObfuscatedName("al")
   static FontMetrics loginScreenFontMetrics;
   @ObfuscatedSignature(descriptor = "Lhp;")
   @ObfuscatedName("av")
   public static final class201 field2280 = new class201();
   @ObfuscatedName("am")
   static String[] field2288;
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field2285 = 92;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2283 = 256;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsz;Ljava/lang/String;)V")
   @ObfuscatedName("hw")
   public static void method4635(SongTask var0, String var1) {
      if (var0 == null) {
         var0.method10539(var1);
      } else {
         var0.field5883 = true;
         var0.field5880 = var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)V")
   @ObfuscatedName("lk")
   public static void method4637(classSF var0) {
      var0.method10241(0, var0.field5767.size(), -176298461);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljk;Lorg/json/JSONObject;ILei;)Z")
   @ObfuscatedName("ey")
   public static boolean method4636(class236 var0, JSONObject var1, int var2, UrlRequester var3) {
      if (var0 == null) {
         var0.method5967();
      }

      JSONObject var4 = var1;
      if (var2 < 2) {
         try {
            var4 = var4.getJSONObject("message");
         } catch (Exception var13) {
            var0.method5972((byte)0);
            return false;
         }

         try {
            var0.method5984(var4.getJSONArray("images"), var3, 667439352);
         } catch (Exception var12) {
            var0.field3074.clear();
         }

         try {
            class236.method5991(var0, var4.getJSONArray("labels"), -1429352776);
         } catch (Exception var11) {
            var0.field3067.clear();
         }
      } else {
         try {
            class236.method5985(var0, var4.getJSONObject("image"), var3, (byte)64);
         } catch (Exception var10) {
            var0.field3074.clear();
         }

         try {
            class236.method5998(var0, var4.getJSONObject("label"), 1877585889);
         } catch (Exception var9) {
            var0.field3067.clear();
         }
      }

      try {
         var0.method6002(var4.getJSONObject("behaviour"), (byte)35);
      } catch (Exception var8) {
         var0.field3069 = null;
         var0.field3070[0] = 0.0F;
         var0.field3070[1] = 0.0F;
         var0.field3070[2] = 1.0F;
         var0.field3070[3] = 1.0F;
         var0.field3068.clear();
      }

      try {
         JSONObject var5 = var4.optJSONObject("meta");
         if (null != var5) {
            var0.method6005(var4.getJSONObject("meta"), (byte)-47);
         }
      } catch (Exception var7) {
         var0.field3071.clear();
         var0.field3072.clear();
      }

      if (var2 == 2) {
         try {
            var0.field3077 = var4.getString("id");
            var0.field3073 = Integer.parseInt(var4.getString("priority")) * 914479569;
         } catch (Exception var6) {
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "([BB)Lxt;")
   @ObfuscatedName("av")
   public static final SpritePixels readSpritePixelsFromBytes(byte[] var0, byte var1) {
      try {
         BufferedImage var2 = null;

         try {
            synchronized (ImageIO.class) {
               var2 = ImageIO.read(new ByteArrayInputStream(var0));
            }

            if (var2 != null) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               int var12 = var2.getWidth();
               int var4 = var2.getHeight();
               int[] var5 = new int[var12 * var4];
               PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var12, var4, var5, 0, var12);
               var6.grabPixels();
               return new SpritePixels(var5, var12, var4);
            }
         } catch (IOException var8) {
         } catch (InterruptedException var9) {
         }

         return null;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "hp.av(" + ')');
      }
   }

   class201() {
   }
}
