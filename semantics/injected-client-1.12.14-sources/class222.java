import java.util.Map;
import net.runelite.api.ChatMessageType;
import net.runelite.api.MessageNode;
import net.runelite.api.events.ChatMessage;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("id")
public class class222 {
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("au")
   static final class222 field2459 = new class222(10);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("at")
   static final class222 field2457 = new class222(1);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("ag")
   static final class222 field2458 = new class222(2);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("ak")
   static final class222 field2453 = new class222(6);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("ae")
   static final class222 field2451 = new class222(4);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("aj")
   public static final class222 field2448 = new class222(5);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("an")
   public static final class222 field2449 = new class222(3);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("aw")
   static final class222 field2460 = new class222(7);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("ap")
   static final class222 field2455 = new class222(8);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("ay")
   static final class222 field2456 = new class222(9);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("ad")
   static final class222 field2450 = new class222(12);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("az")
   public static final class222 field2452 = new class222(11);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("ai")
   static final class222 field2454 = new class222(13);
   @ObfuscatedSignature(descriptor = "Lid;")
   @ObfuscatedName("av")
   static final class222 field2447 = new class222(0);
   @ObfuscatedName("ac")
   public final int field2461;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field2462 = 18;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("ar")
   static Widget scriptActiveWidget;

   @ObfuscatedSignature(descriptor = "(Lof;IIIB)V")
   @ObfuscatedName("av")
   static final void drawMinimap(Widget var0, int var1, int var2, int var3, byte var4) {
      SpriteMask var5 = var0.method8195(class226.widgetDefinition, false);
      if (var5 != null) {
         if (class39.minimapState * 597277019 != 2 && class39.minimapState * 597277019 != 5) {
            int var6 = client.camAngleY * 1853484313 & 2047;

            try {
               if (client.field933 == null) {
                  client.field933 = client.method2529();
               }

               boolean var7 = !client.field1040 && client.field936 == client.field935;
               if (var7) {
                  AbstractRasterizer.method5462(var1, var2, var1 + var5.method8688(), var2 + var5.method8689());
                  int var8 = 48 + client.field828 * -361115983 / 32;
                  int var9 = 464 - client.field674 * -291215063 / 32;
                  class437.sceneMinimapSprite
                     .drawRotatedMaskedCenteredAround(
                        var1, var2, var5.method8688(), var5.method8689(), var8, var9, var6, 256, var1, var2, var5.method8687(), var5.method8690()
                     );
                  client.method2499(var0, var1, var2, 0.03125F);
               } else {
                  double var20 = client.field932;
                  double var10 = var20 / 128.0;
                  int var12 = Math.max(var5.method8688(), var5.method8689()) + 16;
                  if (client.field1034 == null || client.field1034.getWidth() != var12) {
                     client.field1034 = new SpritePixels(var12, var12);
                  }

                  int var13 = (int)(var12 / 2 / var10);
                  int var14 = client.field828 * -361115983 - var13;
                  int var15 = client.field674 * -291215063 - var13;
                  int var16 = Math.max(-Occluder.topLevelWorldView.scene.field3014, var14 >> 7);
                  int var17 = Math.max(-Occluder.topLevelWorldView.scene.field3014, var15 >> 7);
                  client.method2403(
                     Occluder.topLevelWorldView,
                     client.field1034,
                     var20,
                     Occluder.topLevelWorldView.plane * 2115028565,
                     var16,
                     var17,
                     (int)(-(var14 & 127) * var10),
                     (int)(-(var15 & 127) * var10)
                  );
                  client.field1034
                     .drawRotatedMaskedCenteredAround(
                        var1, var2, var5.method8688(), var5.method8689(), var12 / 2, var12 / 2, var6, 256, var1, var2, var5.method8687(), var5.method8690()
                     );
                  float var18 = (float)client.field932 / 128.0F;
                  client.method2499(var0, var1, var2, var18);
               }
            } catch (Exception var19) {
               client.field938.debug("minimap", var19);
            }
         } else {
            AbstractRasterizer.method5462(var1, var2, var1 + var5.method8688(), var2 + var5.method8689());
            AbstractRasterizer.method5452(var1, var2, 0, var5.method8687(), var5.method8690());
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Low;")
   @ObfuscatedName("ae")
   public static class386[] method4879(byte var0) {
      try {
         return new class386[]{class386.field4732, class386.field4733, class386.field4734};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "id.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwe;)V")
   @ObfuscatedName("gt")
   public static void method4880(DbTableType var0) {
      if (var0 == null) {
         var0.method11696();
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
   @ObfuscatedName("at")
   static void addChatMessage(int var0, String var1, String var2, String var3, byte var4) {
      String var13 = var3;
      String var12 = var2;
      String var11 = var1;
      int var10 = var0;
      byte var14 = 18;

      try {
         ChatChannel var15 = (ChatChannel)Messages.Messages_channels.get(var10);
         if (null == var15) {
            if (var14 <= -1) {
               throw new IllegalStateException();
            }

            var15 = new ChatChannel();
            Messages.Messages_channels.put(var10, var15);
         }

         Message var16 = ChatChannel.method2603(var15, var10, var11, var12, var13, (byte)-77);
         Messages.Messages_hashTable.put((Node)var16, (long)(var16.count * 380472083));
         Messages.Messages_queue.add(var16);
         client.chatCycle = -1387197951 * client.cycleCntr;
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "id.at(" + ')');
      }

      Map var5 = SecureUrlRequester.client.getChatLineMap();
      ChatChannel var6 = (ChatChannel)var5.get(var0);
      MessageNode var7 = var6.getLines()[0];
      ChatMessageType var8 = ChatMessageType.of(var0);
      if (var8 == ChatMessageType.CLAN_CHAT && var2 != null && var2.startsWith("|")) {
         var8 = ChatMessageType.CLAN_GIM_CHAT;
         var2 = var2.substring(1);
      }

      if (var8 == ChatMessageType.CLAN_MESSAGE && var2 != null && var2.startsWith("|")) {
         var8 = ChatMessageType.CLAN_GIM_MESSAGE;
         var2 = var2.substring(1);
      }

      if (client.field938.isDebugEnabled()) {
         String var9 = var8 == ChatMessageType.UNKNOWN ? String.valueOf(var0) : var8.name();
         client.field938.debug("Chat message type {}: {}", var9, var2);
      }

      ChatMessage var18 = new ChatMessage(var7, var8, var1, var2, var3, var7.getTimestamp());
      SecureUrlRequester.client.getCallbacks().post(var18);
   }

   class222(int var1) {
      this.field2461 = -1707747185 * var1;
   }
}
