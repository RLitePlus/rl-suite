import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gk")
public abstract class classGK extends Node {
   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   abstract void vmethod189(Buffer var1, byte var2);

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("aj")
   abstract void vmethod193(ClanChannel var1);

   @ObfuscatedSignature(descriptor = "(Lgz;B)V")
   @ObfuscatedName("at")
   abstract void vmethod191(ClanChannel var1, byte var2);

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   abstract void vmethod188(Buffer var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)V")
   @ObfuscatedName("uk")
   public static void method4246(WorldMap var0) {
      if (var0 == null) {
         var0.getWorldMapData();
      }

      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   abstract void vmethod190(Buffer var1);

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("ak")
   abstract void vmethod192(ClanChannel var1);

   classGK() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   abstract void vmethod187(Buffer var1);

   @ObfuscatedSignature(descriptor = "(IIZI)V")
   @ObfuscatedName("ke")
   static final void method4247(int var0, int var1, boolean var2, int var3) {
      if (!var2 || var0 != HealthBarUpdate.field600 * 1088736263 || var1 != ScriptFrame.field355 * -2101212985) {
         if (!client.$assertionsDisabled && client.field1029 != null) {
            throw new AssertionError();
         }

         if (client.field1029 != null) {
            client.field938.error("Loading map {},{},{} while another map load is in progress!", new Object[]{var0, var1, var2});
            client.field1029.method9575();
            client.method2596("concurrent map load", null);
         }

         rl4 var4 = new rl4(client.field1025, client.field998, Occluder.topLevelWorldView, rl2.method9552(true));
         var4.field5652 = (var0 - 6) * 8;
         var4.field5650 = (var1 - 6) * 8;
         var4.field5649 = var0;
         var4.field5651 = var1;
         var4.field5648 = AsyncHttpResponse.worldView.plane * 2115028565;
         if (!client.$assertionsDisabled && client.field1042) {
            throw new AssertionError();
         }

         if (client.gameState * 1271535343 != 30) {
            client.method2405(var4);
            if (!client.$assertionsDisabled && client.gameState * 1271535343 != 25) {
               throw new AssertionError();
            }

            client.field1028 = null;
         } else {
            client.field1027.method9551();
            client.field1042 = true;
            AsyncHttpResponse.worldView.plane = AsyncHttpResponse.worldView.field1331 * 1538131709;
            if (!client.$assertionsDisabled && client.field1028 != null) {
               throw new AssertionError();
            }
         }

         client.field1029 = var4;
         var4.method9592();
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   public static void method4245(byte var0) {
      try {
         WorldEntityConfig.field2375.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "gk.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ag")
   public static void method4244(int var0, int var1, int var2) {
      try {
         ItemLayer.method5389(var0, var1, 0, 0, -1241537630);
         class345.field4309.clear();
         class345.field4310.clear();
         if (class345.midiRequests.isEmpty()) {
            classFM.method4028(911952007);
         } else {
            label26:
            if (var2 > 146072145) {
               if (var0 == 0) {
                  if (var2 <= 146072145) {
                     throw new IllegalStateException();
                  }

                  if (var1 == 0) {
                     break label26;
                  }

                  if (var2 <= 146072145) {
                     return;
                  }
               }

               class345.field4310.add(new DelayFadeTask(null, class345.musicPlayerStatus * 847508035));
               class345.field4310.add(new FadeOutTask(null, 0, false, class345.field4312 * 595186573));
               ArrayList var3 = classLN.method7213((byte)38);
               class345.field4310.add(new classSY(null, var3));
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gk.ag(" + ')');
      }
   }
}
