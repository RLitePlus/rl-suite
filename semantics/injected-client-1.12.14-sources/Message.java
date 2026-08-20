import net.runelite.api.ChatMessageType;
import net.runelite.api.MessageNode;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bu")
public class Message extends DualNode implements MessageNode {
   @ObfuscatedName("ud")
   public int field361 = (int)(System.currentTimeMillis() / 1000L);
   @ObfuscatedSignature(descriptor = "Ltq;")
   @ObfuscatedName("aw")
   TriBool isFromFriend0 = TriBool.TriBool_unknown;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   static final int field368 = 53;
   @ObfuscatedName("ag")
   int type;
   @ObfuscatedName("oq")
   static String characterId;
   @ObfuscatedName("av")
   int count;
   @ObfuscatedName("at")
   int cycle;
   @ObfuscatedName("ak")
   String text;
   @ObfuscatedName("an")
   String sender;
   @ObfuscatedSignature(descriptor = "Ltq;")
   @ObfuscatedName("ap")
   TriBool isFromIgnored0 = TriBool.TriBool_unknown;
   @ToRemove(unused = "true")
   @ObfuscatedName("ce")
   static final int field369 = 69;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kh")
   static Archive soundEffectsArchive;
   @ObfuscatedName("kn")
   public String field373;
   @ObfuscatedName("aj")
   String prefix;
   @ObfuscatedSignature(descriptor = "Lxv;")
   @ObfuscatedName("ae")
   Username senderUsername;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field366 = 13;

   public void setName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.sender = var1;
         int var2 = var1.lastIndexOf(62);
         if (var2 != -1) {
            var1 = var1.substring(var2 + 1);
         }

         this.senderUsername = new Username(var1, LoginScreenAnimation.loginType);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   final void method1200() {
      if (null != this.sender) {
         this.senderUsername = new Username(class117.method3814(this.sender, 1551623633), LoginScreenAnimation.loginType);
      } else {
         this.senderUsername = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("av")
   void set(int var1, String var2, String var3, String var4, int var5) {
      try {
         int var6 = (Messages.Messages_count += -1932680933) * -570240749 - 1;
         this.count = var6 * -523110629;
         this.cycle = -1240350777 * client.cycle;
         this.type = 1206886209 * var1;
         this.sender = var2;
         method1201(this, -1590361376);
         this.prefix = var3;
         this.text = var4;
         this.clearIsFromFriend((byte)-17);
         this.clearIsFromIgnored(-767263040);
         this.method1208(var1, var2, var3, var4);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bu.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   final boolean isFromIgnored(int var1) {
      try {
         if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
            if (var1 != 782484908) {
               throw new IllegalStateException();
            }

            this.fillIsFromIgnored(-202776839);
         }

         return this.isFromIgnored0 == TriBool.TriBool_true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bu.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method1181() {
      this.isFromFriend0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void fillIsFromIgnored(int var1) {
      try {
         this.isFromIgnored0 = class320.friendSystem.ignoreList.contains(this.senderUsername, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bu.ak(" + ')');
      }
   }

   Message(int var1, String var2, String var3, String var4) {
      this.set(var1, var2, var3, var4, -1790419667);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void clearIsFromIgnored(int var1) {
      try {
         this.isFromIgnored0 = TriBool.TriBool_unknown;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bu.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method1190() {
      this.isFromIgnored0 = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("au")
   void method1178(int var1, String var2, String var3, String var4) {
      int var5 = (Messages.Messages_count += 1815299473) * -1170222401 - 1;
      this.count = var5 * -523110629;
      this.cycle = -1240350777 * client.cycle;
      this.type = 1206886209 * var1;
      this.sender = var2;
      method1201(this, 992197191);
      this.prefix = var3;
      this.text = var4;
      this.clearIsFromFriend((byte)-10);
      this.clearIsFromIgnored(-253686020);
   }

   public void setTimestamp(int var1) {
      this.field361 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ap")
   void method1179(int var1, String var2, String var3, String var4) {
      int var5 = (Messages.Messages_count += 391290910) * -570240749 - 1;
      this.count = var5 * -2080401048;
      this.cycle = -1971405815 * client.cycle;
      this.type = 1206886209 * var1;
      this.sender = var2;
      method1201(this, -630029469);
      this.prefix = var3;
      this.text = var4;
      this.clearIsFromFriend((byte)-13);
      this.clearIsFromIgnored(112439169);
   }

   public void setValue(String var1) {
      ChatMessageType var2 = ChatMessageType.of(this.type * -1475546943);
      if ((var2 == ChatMessageType.CLAN_CHAT || var2 == ChatMessageType.CLAN_MESSAGE) && this.text != null && this.text.startsWith("|")) {
         this.text = "|" + var1;
      } else {
         this.text = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("at")
   void clearIsFromFriend(byte var1) {
      try {
         this.isFromFriend0 = TriBool.TriBool_unknown;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bu.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method1183() {
      this.isFromFriend0 = TriBool.TriBool_unknown;
   }

   public String getValue() {
      if (this.text != null && this.text.startsWith("|")) {
         ChatMessageType var1 = ChatMessageType.of(this.type * -1475546943);
         if (var1 == ChatMessageType.CLAN_CHAT || var1 == ChatMessageType.CLAN_MESSAGE) {
            return this.text.substring(1);
         }
      }

      return this.text;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method1184() {
      this.isFromFriend0 = TriBool.TriBool_unknown;
   }

   public int getId() {
      return this.count * 380472083;
   }

   public void setRuneLiteFormatMessage(String var1) {
      this.field373 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   final boolean method1185() {
      if (this.isFromFriend0 == TriBool.TriBool_unknown) {
         method1188(this, -969263643);
      }

      return this.isFromFriend0 == TriBool.TriBool_true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method1187() {
      this.isFromFriend0 = class320.friendSystem.friendsList.contains(this.senderUsername, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "(Lbu;I)V")
   @ObfuscatedName("lk")
   public static void method1188(Message var0, int var1) {
      if (var0 == null) {
         var0.fillIsFromFriend(var1);
      } else {
         try {
            TriBool var10001;
            if (class320.friendSystem.friendsList.contains(var0.senderUsername, (byte)0)) {
               if (var1 <= -1609775092) {
                  throw new IllegalStateException();
               }

               var10001 = TriBool.TriBool_true;
            } else {
               var10001 = TriBool.TriBool_false;
            }

            var0.isFromFriend0 = var10001;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "bu.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("og")
   static final void method1207(int var0, int var1, int var2) {
      try {
         if (client.currentClanChannels[var0] == null) {
            if (var2 == 530437102) {
               throw new IllegalStateException();
            }
         } else {
            if (var1 >= 0) {
               if (var2 == 530437102) {
                  throw new IllegalStateException();
               }

               if (var1 < client.currentClanChannels[var0].method4425(1389114189)) {
                  ClanChannelMember var3 = (ClanChannelMember)client.currentClanChannels[var0].members.get(var1);
                  if (var3.rank != -1) {
                     return;
                  }

                  PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3954, client.packetWriter.isaacCipher, -1890346310);
                  var4.packetBuffer
                     .writeByte(3 + AccessFile.stringCp1252NullTerminatedByteSize(Username.method12702(var3.username, (byte)-116), 904101656), (short)-4579);
                  var4.packetBuffer.writeByte(var0, (short)-6749);
                  var4.packetBuffer.writeShort(var1, -1678139626);
                  var4.packetBuffer.writeStringCp1252NullTerminated(Username.method12702(var3.username, (byte)-124), 998990159);
                  PacketWriter.method3330(client.packetWriter, var4, -1771370198);
                  return;
               }

               if (var2 == 530437102) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bu.og(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method1191() {
      this.isFromIgnored0 = TriBool.TriBool_unknown;
   }

   public ChatMessageType getType() {
      ChatMessageType var1 = ChatMessageType.of(this.type * -1475546943);
      if (var1 == ChatMessageType.CLAN_CHAT) {
         if (this.text != null && this.text.startsWith("|")) {
            return ChatMessageType.CLAN_GIM_CHAT;
         }
      } else if (var1 == ChatMessageType.CLAN_MESSAGE && this.text != null && this.text.startsWith("|")) {
         return ChatMessageType.CLAN_GIM_MESSAGE;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lbu;I)V")
   @ObfuscatedName("bp")
   public static void method1201(Message var0, int var1) {
      if (var0 == null) {
         var0.fillSenderUsername(var1);
      } else {
         try {
            if (null != var0.sender) {
               var0.senderUsername = new Username(class117.method3814(var0.sender, 780785464), LoginScreenAnimation.loginType);
            } else {
               var0.senderUsername = null;
            }
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "bu.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method1192() {
      this.isFromIgnored0 = TriBool.TriBool_unknown;
   }

   public String getSender() {
      return this.prefix;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("al")
   final boolean method1194() {
      if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
         this.fillIsFromIgnored(-1999629698);
      }

      return this.isFromIgnored0 == TriBool.TriBool_true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method1197() {
      this.isFromIgnored0 = class320.friendSystem.ignoreList.contains(this.senderUsername, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method1198() {
      this.isFromIgnored0 = class320.friendSystem.ignoreList.contains(this.senderUsername, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   final void method1202() {
      if (null != this.sender) {
         this.senderUsername = new Username(class117.method3814(this.sender, -51963523), LoginScreenAnimation.loginType);
      } else {
         this.senderUsername = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("nx")
   public void method1208(int var1, String var2, String var3, String var4) {
      this.field373 = null;
      this.field361 = (int)(System.currentTimeMillis() / 1000L);
      if (var2 != null) {
         int var5 = var2.lastIndexOf(62);
         if (var5 != -1) {
            this.senderUsername = new Username(var2.substring(var5 + 1), LoginScreenAnimation.loginType);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   final void method1203() {
      if (null != this.sender) {
         this.senderUsername = new Username(class117.method3814(this.sender, -1650376665), LoginScreenAnimation.loginType);
      } else {
         this.senderUsername = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   final boolean isFromFriend(int var1) {
      try {
         if (this.isFromFriend0 == TriBool.TriBool_unknown) {
            if (var1 >= 1671263872) {
               throw new IllegalStateException();
            }

            method1188(this, -741097795);
         }

         boolean var10000;
         if (this.isFromFriend0 == TriBool.TriBool_true) {
            if (var1 >= 1671263872) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bu.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)Lcx;")
   @ObfuscatedName("oj")
   static final InterfaceParent openInterface(int var0, int var1, int var2, byte var3) {
      try {
         InterfaceParent var4 = new InterfaceParent();
         var4.group = var1 * -618650201;
         var4.type = var2 * 1475615593;
         client.interfaceParents.put(var4, var0);
         classWM.method11790(var1, -1882331634);
         Widget var5 = class226.widgetDefinition.method7953(var0, 1393651872);
         class376.invalidateWidget(var5, (byte)5);
         if (null != client.meslayerContinueWidget) {
            if (var3 >= 7) {
               throw new IllegalStateException();
            }

            class376.invalidateWidget(client.meslayerContinueWidget, (byte)5);
            client.meslayerContinueWidget = null;
         }

         class339.revalidateWidgetScroll(class226.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var5, false, 167500438);
         MidiPcmStream.runWidgetOnLoadListener(var1, 1491939158);
         if (-1 != client.rootInterface * -1354500905) {
            class520.runIntfCloseListeners(-1354500905 * client.rootInterface, 1, -984175377);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bu.oj(" + ')');
      }
   }

   public void setSender(String var1) {
      this.prefix = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ay")
   void method1180(int var1, String var2, String var3, String var4) {
      int var5 = (Messages.Messages_count += -1932680933) * -570240749 - 1;
      this.count = var5 * -523110629;
      this.cycle = -1240350777 * client.cycle;
      this.type = 1206886209 * var1;
      this.sender = var2;
      method1201(this, 575567423);
      this.prefix = var3;
      this.text = var4;
      this.clearIsFromFriend((byte)78);
      this.clearIsFromIgnored(-2031479641);
   }

   public String getRuneLiteFormatMessage() {
      return this.field373;
   }

   public String getName() {
      return this.sender;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)I")
   @ObfuscatedName("an")
   public static int method1204(CharSequence var0, byte var1) {
      try {
         return CollisionMap.method6404(var0, 10, true, -869919856);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bu.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   void fillIsFromFriend(int var1) {
      try {
         this.isFromIgnored0 = class320.friendSystem.ignoreList.contains(this.senderUsername, (byte)0) ? TriBool.TriBool_unknown : TriBool.TriBool_unknown;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bu.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbu;)Z")
   @ObfuscatedName("mp")
   public static boolean method1195(Message var0) {
      if (var0.isFromIgnored0 == TriBool.TriBool_unknown) {
         var0.fillIsFromIgnored(55974607);
      }

      return var0.isFromIgnored0 == TriBool.TriBool_true;
   }

   public int getTimestamp() {
      return this.field361;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   final void fillSenderUsername(int var1) {
      this.field361 = var1;
   }
}
