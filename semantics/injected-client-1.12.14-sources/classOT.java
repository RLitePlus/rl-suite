import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public class classOT {
   @ObfuscatedSignature(descriptor = "Ley;")
   @ObfuscatedName("av")
   UrlRequest field4699;
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("at")
   SpritePixels field4700;

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("at")
   SpritePixels method8662() {
      if (null == this.field4700 && null != this.field4699 && this.field4699.isDone(1741769013)) {
         if (this.field4699.getResponse((byte)35) != null) {
            this.field4700 = class201.readSpritePixelsFromBytes(this.field4699.getResponse((byte)110), (byte)-90);
         }

         this.field4699 = null;
      }

      return this.field4700;
   }

   classOT(UrlRequest var1) {
      this.field4699 = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)Lxt;")
   @ObfuscatedName("av")
   SpritePixels method8663(byte var1) {
      try {
         if (null == this.field4700) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            if (null != this.field4699) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               if (this.field4699.isDone(1741769013)) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.field4699.getResponse((byte)73) != null) {
                     this.field4700 = class201.readSpritePixelsFromBytes(this.field4699.getResponse((byte)125), (byte)-21);
                  }

                  this.field4699 = null;
               }
            }
         }

         return this.field4700;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ot.av(" + ')');
      }
   }

   classOT(String var1, UrlRequester var2) {
      try {
         this.field4699 = var2.request(new URL(var1), -726881254);
      } catch (MalformedURLException var4) {
         this.field4699 = null;
      }
   }
}
