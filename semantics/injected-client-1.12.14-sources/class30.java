import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bz")
public class class30 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field436 = 34;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lxt;")
   @ObfuscatedName("ag")
   public static final SpritePixels method1300(byte[] var0) {
      BufferedImage var1 = null;

      try {
         synchronized (ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (var1 != null) {
            int var10 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var10 * var3];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var10, var3, var4, 0, var10);
            var5.grabPixels();
            return new SpritePixels(var4, var10, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lxt;")
   @ObfuscatedName("an")
   public static final SpritePixels method1301(byte[] var0) {
      BufferedImage var1 = null;

      try {
         synchronized (ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (var1 != null) {
            int var10 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var10 * var3];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var10, var3, var4, 0, var10);
            var5.grabPixels();
            return new SpritePixels(var4, var10, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lxt;")
   @ObfuscatedName("at")
   public static final SpritePixels method1302(byte[] var0) {
      BufferedImage var1 = null;

      try {
         synchronized (ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (var1 != null) {
            int var10 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var10 * var3];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var10, var3, var4, 0, var10);
            var5.grabPixels();
            return new SpritePixels(var4, var10, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return null;
   }

   static {
      ImageIO.setUseCache(false);
   }

   class30() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lxt;")
   @ObfuscatedName("ae")
   public static final SpritePixels method1303(byte[] var0) {
      BufferedImage var1 = null;

      try {
         synchronized (ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         if (var1 != null) {
            int var10 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var10 * var3];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var10, var3, var4, 0, var10);
            var5.grabPixels();
            return new SpritePixels(var4, var10, var3);
         }
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;)I")
   @ObfuscatedName("eb")
   public static int method1305(classFT var0) {
      return var0 == null ? var0.method4117() : var0.method4115(570529957) - classFT.method4113(var0, 829859530);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)Z")
   @ObfuscatedName("za")
   public static boolean method1306(classOO var0) {
      return var0.field4651;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("jh")
   static void method1309(byte var0) {
      try {
         for (class279 var1 = (class279)client.field762.last(); null != var1; var1 = (class279)client.field762.previous()) {
            var1.remove();
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bz.jh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aq")
   static void method1308(int var0, int var1) {
      try {
         if (-1614560929 * Login.loginIndex == var0) {
            if (var1 != 1845767532) {
               ;
            }
         } else {
            Login.loginIndex = var0 * 625007263;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bz.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("hs")
   static final void logOut(byte var0) {
      try {
         client.packetWriter.close((byte)117);
         WorldMapElement.clear(-87591057);
         client.worldViewManager.clear((byte)-81);
         NodeDeque.method9797(client.projectiles);
         PlayerUpdateManager.method3659(client.playerUpdateManager, -1796991682);
         client.widgetFocusInputManager.method6358(-694862455);
         System.gc();
         classGK.method4244(0, 0, 1892974992);
         class179.method4237(-1931393605);
         client.playingJingle = false;
         class356.method7753((byte)0);
         WorldMapSectionType.updateGameState(10, (byte)45);
         client.serverCycle = 0;
         byte var10000 = -1;
         client.method2449();
         WorldMapArea.method6908(1488231747).method5932(1365444010);
         class234.method5938(WorldMapArea.method6908(1181741238), (byte)-3);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bz.hs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;I)Lrx;")
   @ObfuscatedName("at")
   public static ProjectionCoord method1304(ProjectionCoord var0, int var1) {
      try {
         synchronized (ProjectionCoord.field5722) {
            if (0 == 1970955523 * ProjectionCoord.field5720) {
               if (var1 != 742787141) {
                  throw new IllegalStateException();
               } else {
                  return new ProjectionCoord(var0);
               }
            } else {
               ProjectionCoord.field5722[(ProjectionCoord.field5720 -= 1300180395) * 1970955523].method9875(var0, (byte)8);
               return ProjectionCoord.field5722[ProjectionCoord.field5720 * 1970955523];
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bz.at(" + ')');
      }
   }
}
