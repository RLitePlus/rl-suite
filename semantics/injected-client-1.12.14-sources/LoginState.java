import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bf")
public class LoginState {
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("az")
   static final LoginState UNMAPPED_11 = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("at")
   static final LoginState INIT_MOUSEHANDLER_SOCKET = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ag")
   static final LoginState UNMAPPED_20 = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("an")
   static final LoginState READ_LOGIN_STATUS = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ae")
   static final LoginState READ_RANDOM_VERIFICATION_NUMBER = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("aj")
   static final LoginState WRITE_INITIAL_LOGIN_PACKET = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ak")
   static final LoginState READ_CLIENT_INFO_STATUS = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ah")
   static final LoginState UNMAPPED_18 = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ap")
   static final LoginState SUBMIT_DIGEST_PARSER_TASK = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ay")
   static final LoginState WRITE_DIGEST_PARSER_RESULT = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("au")
   static final LoginState READ_STATE_11_PACKET_SIZE = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("as")
   static final LoginState UNMAPPED = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("af")
   static final LoginState REFRESHING_TOKEN = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ai")
   static final LoginState PROFILE_TRANSFER = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ac")
   static final LoginState READ_ACCOUNT_INFO = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ad")
   static final LoginState READ_PROFILE_TRANSFER_TIME = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ab")
   static final LoginState SET_SERVER_PROTOCOL = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ax")
   static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ar")
   static final LoginState UNMAPPED_17 = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("aa")
   static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("al")
   static final LoginState UNMAPPED_19 = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("aw")
   static final LoginState READ_DIGEST_PARSER_PACKET_SIZE = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("am")
   static final LoginState TOKEN_RESPONSE = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("av")
   static final LoginState SHUTDOWN_PREVIOUS_CONNECTION = new LoginState();
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("ao")
   static final LoginState UNMAPPED_21 = new LoginState();
   @ObfuscatedName("os")
   static int[] field158;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   public static final int field157 = 99;

   LoginState() {
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("av")
   public static final void method484(long var0) {
      try {
         if (var0 > 0L) {
            if (0L == var0 % 10L) {
               Interpreter.method993(var0 - 1L);
               Interpreter.method993(1L);
            } else {
               Interpreter.method993(var0);
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bf.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("nt")
   static final void setMusicVolume(int var0, int var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 255);
         if (var0 != class468.clientPreferences.getMusicVolume((byte)6)) {
            if (var1 <= -721786571) {
               return;
            }

            label51: {
               if (class468.clientPreferences.getMusicVolume((byte)6) == 0) {
                  if (var1 <= -721786571) {
                     throw new IllegalStateException();
                  }

                  boolean var10000;
                  if (!class345.field4309.isEmpty()) {
                     if (var1 <= -721786571) {
                        return;
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var2 = var10000;
                  if (var2) {
                     if (var1 <= -721786571) {
                        return;
                     }

                     GameObject.method6301(GrandExchangeOfferOwnWorldComparator.field422, var0, (byte)3);
                     client.playingJingle = false;
                     break label51;
                  }
               }

               if (0 == var0) {
                  classGK.method4244(0, 0, 1271565463);
                  client.playingJingle = false;
               } else {
                  GrandExchangeOfferOwnWorldComparator.method1276(var0, 627648485);
               }
            }

            class468.clientPreferences.updateMusicVolume(var0, 1650207125);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bf.nt(" + ')');
      }
   }
}
