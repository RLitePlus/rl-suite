import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("it")
public class classIT extends classIS {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field3058 = 17;
   @ObfuscatedName("af")
   byte field3056;
   @ObfuscatedName("ae")
   byte field3055;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3059 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("cz")
   static final int field3060 = 88;
   @ObfuscatedName("az")
   String field3061;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field3057 = 8;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod506(classXY var1) {
      this.field3061 = var1.method13069((byte)-56);
      if (null != this.field3061) {
         classXY.method13039(var1, -346779531);
         this.field3056 = classXY.method13043(var1, (byte)17);
         this.field3055 = classXY.method13043(var1, (byte)17);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod507(classXY var1, int var2) {
      try {
         this.field3061 = var1.method13069((byte)52);
         if (null != this.field3061) {
            classXY.method13039(var1, -346779531);
            this.field3056 = classXY.method13043(var1, (byte)17);
            this.field3055 = classXY.method13043(var1, (byte)17);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "it.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;I)V")
   @ObfuscatedName("af")
   @Override
   void vmethod509(classIE var1, int var2) {
      try {
         var1.field2948 = this.field3061;
         if (this.field3061 != null) {
            var1.field2949 = this.field3056;
            var1.field2950 = this.field3055;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "it.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod511(classIE var1) {
      var1.field2948 = this.field3061;
      if (this.field3061 != null) {
         var1.field2949 = this.field3056;
         var1.field2950 = this.field3055;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("al")
   public static int method6315(int var0, int var1, int var2) {
      try {
         return var0 + (int)(Math.random() * (var1 - var0));
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "it.al(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod508(classIE var1) {
      var1.field2948 = this.field3061;
      if (this.field3061 != null) {
         var1.field2949 = this.field3056;
         var1.field2950 = this.field3055;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod510(classIE var1) {
      var1.field2948 = this.field3061;
      if (this.field3061 != null) {
         var1.field2949 = this.field3056;
         var1.field2950 = this.field3055;
      }
   }

   classIT(classIX var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "([BI)Lym;")
   @ObfuscatedName("az")
   public static final classYM method6314(byte[] var0, int var1) {
      try {
         BufferedImage var2 = null;

         try {
            synchronized (ImageIO.class) {
               var2 = ImageIO.read(new ByteArrayInputStream(var0));
            }

            if (var2 != null) {
               int var12 = var2.getWidth();
               int var4 = var2.getHeight();
               int[] var5 = new int[var12 * var4];
               PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var12, var4, var5, 0, var12);
               var6.grabPixels();
               return new classYM(var5, var12, var4);
            }
         } catch (IOException var8) {
         } catch (InterruptedException var9) {
         }

         return null;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "it.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod505(classXY var1) {
      this.field3061 = var1.method13069((byte)62);
      if (null != this.field3061) {
         classXY.method13039(var1, -346779531);
         this.field3056 = classXY.method13043(var1, (byte)17);
         this.field3055 = classXY.method13043(var1, (byte)17);
      }
   }
}
