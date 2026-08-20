import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ni")
public class class356 implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4294 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field4296 = 103;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field4295 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field4293 = 1401;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method7756(Object var1, Object var2) {
      return this.method7755((classNR)var1, (classNR)var2, -1603958214);
   }

   @ObfuscatedSignature(descriptor = "(Lnr;Lnr;I)I")
   @ObfuscatedName("av")
   int method7755(classNR var1, classNR var2, int var3) {
      try {
         return 308419235 * var1.field4329 - 308419235 * var2.field4329;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ni.av(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method7755((classNR)var1, (classNR)var2, -1603958214);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ni.compare(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxt;III)V")
   @ObfuscatedName("qq")
   public static void method7754(SpritePixels var0, int var1, int var2, int var3) {
      var1 += var0.xOffset;
      var2 += var0.yOffset;
      int var4 = var1 + var2 * SpritePixels.Rasterizer2D_width;
      int var5 = 0;
      int var6 = var0.subHeight;
      int var7 = var0.subWidth;
      int var8 = SpritePixels.Rasterizer2D_width - var7;
      int var9 = 0;
      if (var2 < SpritePixels.Rasterizer2D_yClipStart) {
         int var10 = SpritePixels.Rasterizer2D_yClipStart - var2;
         var6 -= var10;
         var2 = SpritePixels.Rasterizer2D_yClipStart;
         var5 += var10 * var7;
         var4 += var10 * SpritePixels.Rasterizer2D_width;
      }

      if (var2 + var6 > SpritePixels.Rasterizer2D_yClipEnd) {
         var6 -= var2 + var6 - SpritePixels.Rasterizer2D_yClipEnd;
      }

      if (var1 < SpritePixels.Rasterizer2D_xClipStart) {
         int var13 = SpritePixels.Rasterizer2D_xClipStart - var1;
         var7 -= var13;
         var1 = SpritePixels.Rasterizer2D_xClipStart;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > SpritePixels.Rasterizer2D_xClipEnd) {
         int var14 = var1 + var7 - SpritePixels.Rasterizer2D_xClipEnd;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            SpritePixels.method12596(0, 0, 0, SpritePixels.Rasterizer2D_pixels, var0.pixels, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            SpritePixels.method12600(0, 0, 0, SpritePixels.Rasterizer2D_pixels, var0.pixels, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ni.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method7757(Object var1, Object var2) {
      return this.method7755((classNR)var1, (classNR)var2, -1603958214);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method7758(Object var1, Object var2) {
      return this.method7755((classNR)var1, (classNR)var2, -1603958214);
   }

   @ObfuscatedSignature(descriptor = "([II)Lut;")
   @ObfuscatedName("az")
   public static DynamicArray method7752(int[] var0, int var1) {
      try {
         DynamicArray var2 = new DynamicArray(class586.field6376, true);
         var2.array = var0;
         var2.size = -1205286309 * var0.length;
         var2.field6106 = -1332440619 * var0.length;
         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ni.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method7759(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/Date;")
   @ObfuscatedName("az")
   static Date method7762(int var0) throws ParseException {
      try {
         SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
         var1.setLenient(false);
         StringBuilder var2 = new StringBuilder();
         String[] var3 = Login.field387;

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var0 <= 1993728879) {
               throw new IllegalStateException();
            }

            String var5 = var3[var4];
            if (null == var5) {
               if (var0 <= 1993728879) {
                  throw new IllegalStateException();
               }

               WorldMapEvent.method7541("Date not valid.", "Please ensure all characters are populated.", "", 1054774324);
               return null;
            }

            var2.append(var5);
         }

         var2.append("12");
         return var1.parse(var2.toString());
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ni.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lni;Ljava/lang/Object;)Z")
   @ObfuscatedName("sa")
   public static boolean method7760(class356 var0, Object var1) {
      if (var0 == null) {
         var0.method7759(var1);
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("av")
   static void addGameMessage(int var0, String var1, String var2, int var3) {
      try {
         class222.addChatMessage(var0, var1, var2, null, (byte)68);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ni.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lni;Ljava/lang/Object;)Z")
   @ObfuscatedName("wl")
   public static boolean method7761(class356 var0, Object var1) {
      return var0 == null ? var0.equals(var1) : var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ad")
   static void method7753(byte var0) {
      try {
         Iterator var1 = client.worldViewManager.iterator();

         while (var1.hasNext()) {
            if (var0 != 0) {
               throw new IllegalStateException();
            }

            WorldView var2 = (WorldView)var1.next();

            for (ObjectSound var3 = (ObjectSound)var2.method3080(-1296809157).last(); null != var3; var3 = (ObjectSound)var2.method3080(-899073390).previous()) {
               if (var0 != 0) {
                  throw new IllegalStateException();
               }

               ObjectSound.method2708(var3, -687136603);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ni.ad(" + ')');
      }
   }

   class356() {
   }
}
