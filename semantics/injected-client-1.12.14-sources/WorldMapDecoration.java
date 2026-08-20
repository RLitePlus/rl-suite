import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lm")
public class WorldMapDecoration {
   @ObfuscatedName("ag")
   final int rotation;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field3725 = 10;
   @ObfuscatedName("at")
   final int decoration;
   @ObfuscatedName("av")
   final int objectDefinitionId;

   @ObfuscatedSignature(descriptor = "(Lxa;J)V")
   @ObfuscatedName("av")
   static void method7196(Buffer var0, long var1) {
      try {
         var1 /= 10L;
         if (var1 < 0L) {
            var1 = 0L;
         } else if (var1 > 65535L) {
            var1 = 65535L;
         }

         var0.writeShort((int)var1, -2109802380);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   static void focusPasswordWhenUsernameFilled(byte var0) {
      try {
         if (client.Login_isUsernameRemembered) {
            if (var0 != 8) {
               throw new IllegalStateException();
            }

            if (null != Login.Login_username) {
               if (var0 != 8) {
                  throw new IllegalStateException();
               }

               if (!Login.Login_username.isEmpty()) {
                  if (var0 != 8) {
                     throw new IllegalStateException();
                  }

                  Login.currentLoginField = -1340850443;
                  return;
               }
            }
         }

         Login.currentLoginField = 0;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "lm.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;)I")
   @ObfuscatedName("po")
   public static int method7197(WorldEntityCoord var0) {
      if (var0 == null) {
         var0.method6247();
      }

      return var0.x * -639471049 >> 7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)V")
   @ObfuscatedName("ef")
   public static void method7199(WorldMap var0) {
      if (var0 == null) {
         var0.method11421();
      }

      var0.minCachedTileY = 969746873;
      var0.cyclesPerFlash = -1126054733;
      var0.worldMapTargetX = -696675125;
      var0.field6247 = 904391371;
   }

   WorldMapDecoration(int var1, int var2, int var3) {
      this.objectDefinitionId = 1212980837 * var1;
      this.decoration = -1323573797 * var2;
      this.rotation = var3 * 1018201661;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;)I")
   @ObfuscatedName("pk")
   public static int method7198(WorldEntity var0) {
      return -452790851 * var0.worldView.sizeX + WorldEntityConfig.method4757(var0.worldEntityConfig, (byte)25);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ok")
   static void method7201(String var0, int var1) {
      try {
         class39.field196 = var0;

         try {
            String var2 = SecureUrlRequester.client.getParameter(Integer.toString(18));
            String var3 = SecureUrlRequester.client.getParameter(Integer.toString(13));
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            if (var0.isEmpty()) {
               if (var1 >= 1968976094) {
                  throw new IllegalStateException();
               }

               var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               String var5 = var4 + "; Expires=";
               long var7 = ParamComposition.method4949((byte)15) + 94608000000L;
               classNM.field4319.setTime(new Date(var7));
               int var9 = classNM.field4319.get(7);
               int var10 = classNM.field4319.get(5);
               int var11 = classNM.field4319.get(2);
               int var12 = classNM.field4319.get(1);
               int var13 = classNM.field4319.get(11);
               int var14 = classNM.field4319.get(12);
               int var15 = classNM.field4319.get(13);
               String var6 = classNM.field4320[var9 - 1]
                  + ", "
                  + var10 / 10
                  + var10 % 10
                  + "-"
                  + classNM.field4318[0][var11]
                  + "-"
                  + var12
                  + " "
                  + var13 / 10
                  + var13 % 10
                  + ":"
                  + var14 / 10
                  + var14 % 10
                  + ":"
                  + var15 / 10
                  + var15 % 10
                  + " GMT";
               var4 = var5 + var6 + "; Max-Age=" + 94608000L;
            }

            classBE.method481(SecureUrlRequester.client, "document.cookie=\"" + var4 + "\"", -271761016);
         } catch (Throwable var16) {
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "lm.ok(" + ')');
      }
   }
}
