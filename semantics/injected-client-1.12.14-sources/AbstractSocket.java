import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("td")
public abstract class AbstractSocket {
   @ObfuscatedSignature(descriptor = "Lmu;")
   @ObfuscatedName("am")
   static WorldMapEvent worldMapEvent;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   public abstract boolean vmethod353(int var1) throws IOException;

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("at")
   public abstract boolean isAvailable(int var1, byte var2) throws IOException;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public abstract int readUnsignedByte(int var1) throws IOException;

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ah")
   public abstract void vmethod356(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedSignature(descriptor = "([BIII)I")
   @ObfuscatedName("ae")
   public abstract int read(byte[] var1, int var2, int var3, int var4) throws IOException;

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("aj")
   public abstract void write(byte[] var1, int var2, int var3, int var4) throws IOException;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public abstract void close(int var1);

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ar")
   public abstract void vmethod360(byte[] var1, int var2, int var3) throws IOException;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/net/Socket;II)Ltd;")
   @ObfuscatedName("ap")
   public static AbstractSocket method10587(Socket var0, int var1, int var2) throws IOException {
      return new BufferedNetSocket(var0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("au")
   public abstract boolean vmethod361(int var1) throws IOException;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public abstract int available(int var1) throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   public abstract int vmethod363() throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public abstract int vmethod364() throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public abstract int vmethod365() throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public abstract int vmethod366() throws IOException;

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("ac")
   public abstract int vmethod367(byte[] var1, int var2, int var3) throws IOException;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;)V")
   @ObfuscatedName("im")
   public static void method10589(UserList var0) {
      if (var0 == null) {
         var0.method10742();
      }

      var0.size = 0;
      Arrays.fill(var0.array, null);
      var0.usernamesMap.clear();
      var0.previousUsernamesMap.clear();
   }

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("ab")
   public abstract int vmethod368(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hk")
   static void method10590(int var0) {
      try {
         client.mouseLastLastPressedTimeMillis = -4031895470908010033L;
         if (class535.mouseRecorder != null) {
            if (var0 != -1202997885) {
               throw new IllegalStateException();
            }

            class535.mouseRecorder.index = 0;
         }

         class489.hasFocus = true;
         client.hadFocus = true;
         client.field770 = -8274296646023962997L;
         class27.method923((byte)7);
         client.packetWriter.clearBuffer((byte)8);
         client.packetWriter.field1408 = 0;
         client.packetWriter.packetBuffer.offset = 0;
         client.packetWriter.serverPacket = null;
         client.packetWriter.field1420 = null;
         client.packetWriter.field1421 = null;
         client.packetWriter.field1422 = null;
         client.packetWriter.serverPacketLength = 0;
         client.packetWriter.field1413 = 0;
         client.rebootTimer = 0;
         client.logoutTimer = 0;
         client.hintArrow.method8730(1613845080);
         classGP.method4262((byte)81);
         MouseHandler.MouseHandler_idleCycles = 0;
         client.method2433(-1);
         class69.method1397(-1240959061);
         client.isItemSelected = 0;
         client.isSpellSelected = false;
         RestClientThreadFactory.method1(-1383100471);
         client.camAngleY = 0;
         client.oculusOrbState = 0;
         client.field1026 = null;
         class39.minimapState = 0;
         class39.field189 = 1107025005;
         client.destinationX = 0;
         client.destinationY = 0;
         client.playerAttackOption = AttackOption.AttackOption_hidden;
         client.npcAttackOption = AttackOption.AttackOption_hidden;
         client.worldViewManager.clear((byte)-126);
         client.currentWorldViewId = 1092382715;
         NodeDeque.method9797(client.projectiles);
         PlayerUpdateManager.method3659(client.playerUpdateManager, 823202538);
         class320.friendSystem.method439(383084273);
         WorldMapScaleHandler.method7487((byte)74);
         if (class166.varcs != null) {
            if (var0 != -1202997885) {
               throw new IllegalStateException();
            }

            Varcs.method3142(class166.varcs, 1406454795);
         }

         client.followerIndex = 423164539;
         if (-1 != -1354500905 * client.rootInterface) {
            if (var0 != -1202997885) {
               throw new IllegalStateException();
            }

            WidgetDefinition.method7964(class226.widgetDefinition, client.rootInterface * -1354500905, -77027406);
         }

         for (InterfaceParent var1 = (InterfaceParent)client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)client.interfaceParents.next()) {
            if (var0 != -1202997885) {
               throw new IllegalStateException();
            }

            class39.closeInterface(var1, true, (byte)15);
         }

         client.rootInterface = -1349402343;
         client.interfaceParents = new NodeHashTable(8);
         client.meslayerContinueWidget = null;
         classGP.method4262((byte)110);
         client.playerAppearance.method7884(null, null, new int[]{0, 0, 0, 0, 0}, 0, -1, (byte)123);

         for (int var3 = 0; var3 < 8; var3++) {
            if (var0 != -1202997885) {
               throw new IllegalStateException();
            }

            client.playerMenuActions[var3] = null;
            client.method1721(var3);
            client.playerOptionsPriorities[var3] = false;
         }

         Skills.method8683((byte)81);
         client.isLoading = true;

         for (int var4 = 0; var4 < 100; var4++) {
            if (var0 != -1202997885) {
               throw new IllegalStateException();
            }

            client.validRootWidgets[var4] = true;
         }

         classQH.method8913((byte)0);
         BuddyRankComparator.friendsChat = null;
         client.method2056(-1);
         SecureRandomFuture.guestClanSettings = null;
         Arrays.fill(client.currentClanSettings, null);
         class57.guestClanChannel = null;
         client.method2452(-1);
         Arrays.fill(client.currentClanChannels, null);

         for (int var5 = 0; var5 < 8; var5++) {
            if (var0 != -1202997885) {
               throw new IllegalStateException();
            }

            client.grandExchangeOffers[var5] = new GrandExchangeOffer();
            client.method2446(var5);
         }

         class234.grandExchangeEvents = null;
         client.viewportOffsetX = 0;
         client.viewportOffsetY = 0;
         client.viewportWidth = 0;
         client.viewportHeight = 0;
         SecureUrlRequester.client.method837(false, (byte)-31);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "td.hk(" + ')');
      }
   }

   AbstractSocket() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public abstract void vmethod369();

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("al")
   public abstract void vmethod370(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public abstract void vmethod371();

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("ax")
   public abstract int vmethod372(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public abstract void vmethod373();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public abstract void vmethod374();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/net/Socket;II)Ltd;")
   @ObfuscatedName("aw")
   public static AbstractSocket method10588(Socket var0, int var1, int var2) throws IOException {
      return new BufferedNetSocket(var0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public abstract void vmethod375();
}
