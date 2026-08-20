import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cb")
public class class57 {
   @ObfuscatedName("ae")
   static final int[] soundLocations = new int[50];
   @ObfuscatedSignature(descriptor = "[Ldx;")
   @ObfuscatedName("at")
   static final SoundEffect[] soundEffects = new SoundEffect[50];
   @ObfuscatedName("ag")
   static final int[] field467 = new int[50];
   @ObfuscatedName("an")
   static final int[] soundEffectIds = new int[50];
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field469 = 50;
   @ObfuscatedName("aj")
   static final int[] queuedSoundEffectDelays = new int[50];
   @ObfuscatedSignature(descriptor = "Lgz;")
   @ObfuscatedName("hb")
   static ClanChannel guestClanChannel;
   @ObfuscatedName("aw")
   static final int[] field466 = new int[50];
   @ObfuscatedName("ap")
   static final boolean[] field461 = new boolean[50];
   @ObfuscatedName("ay")
   public static int soundEffectCount = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   static final int field471 = 118;
   @ObfuscatedName("ak")
   static final int[] queuedSoundEffectLoops = new int[50];
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field470 = 6;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   static void method1366() {
      soundEffectCount = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("au")
   static void method1358(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (ClientPreferences.method1623(class468.clientPreferences, (byte)0) != 0 && var6 > 0 && soundEffectCount * 1548103253 < 50) {
         GrandExchangeOffer.method8889(AsyncHttpResponse.worldView.id * 577964535, var1, var2, var3, var4, var5, var6, var7, false, -1572985472);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lts;Z)Z")
   @ObfuscatedName("az")
   static boolean method1361(WorldEntity var0, WorldEntity var1, boolean var2) {
      if (var1 == var0) {
         return true;
      } else if (null == var1) {
         return true;
      } else {
         return var0 == null ? false : var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("aw")
   static void method1356(int var0, int var1, int var2) {
      if (ClientPreferences.method1620(class468.clientPreferences, 783604244) != 0 && var1 != 0 && 1548103253 * soundEffectCount < 50) {
         GrandExchangeOffer.method8889(-1, var0, 0, 0, 0, 0, var1, var2, false, -1627182491);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ap")
   static void method1359(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (ClientPreferences.method1623(class468.clientPreferences, (byte)0) != 0 && var6 > 0 && soundEffectCount * -1599091025 < 50) {
         GrandExchangeOffer.method8889(AsyncHttpResponse.worldView.id * 577964535, var1, var2, var3, var4, var5, var6, var7, false, -1169338688);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ay")
   static void method1360(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (ClientPreferences.method1623(class468.clientPreferences, (byte)0) != 0 && var6 > 0 && soundEffectCount * 1548103253 < 50) {
         GrandExchangeOffer.method8889(AsyncHttpResponse.worldView.id * 577964535, var1, var2, var3, var4, var5, var6, var7, false, -155170152);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIZ)V")
   @ObfuscatedName("aj")
   public static void method1355(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      soundEffectIds[soundEffectCount * 23913480] = var0;
      soundEffects[soundEffectCount * 285059767] = null;
      soundLocations[1548103253 * soundEffectCount] = var4 + (var3 << 8) + (var2 << 16);
      field466[1548103253 * soundEffectCount] = var1;
      queuedSoundEffectLoops[-756903141 * soundEffectCount] = var6;
      queuedSoundEffectDelays[-83083077 * soundEffectCount] = var7;
      field467[soundEffectCount * 1548103253] = var5;
      field461[soundEffectCount * 1548103253] = var8;
      soundEffectCount += -1575133443;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lts;Z)Z")
   @ObfuscatedName("ai")
   static boolean method1362(WorldEntity var0, WorldEntity var1, boolean var2) {
      if (var1 == var0) {
         return true;
      } else if (null == var1) {
         return true;
      } else {
         return var0 == null ? false : var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ak")
   static void method1357(int var0, int var1, int var2) {
      if (ClientPreferences.method1620(class468.clientPreferences, 1944007876) != 0 && var1 != 0 && 1328918715 * soundEffectCount < 50) {
         GrandExchangeOffer.method8889(-1, var0, 0, 0, 0, 0, var1, var2, false, -1085720827);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   static void method1367() {
      soundEffectCount = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lts;Z)Z")
   @ObfuscatedName("as")
   static boolean method1363(WorldEntity var0, WorldEntity var1, boolean var2) {
      if (var1 == var0) {
         return true;
      } else if (null == var1) {
         return true;
      } else {
         return var0 == null ? false : var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lts;Z)Z")
   @ObfuscatedName("ac")
   static boolean method1364(WorldEntity var0, WorldEntity var1, boolean var2) {
      if (var1 == var0) {
         return true;
      } else if (null == var1) {
         return true;
      } else {
         return var0 == null ? false : var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   static void method1368() {
      soundEffectCount = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   static void method1369() {
      soundEffectCount = 0;
   }

   class57() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ax")
   static final int method1371(int var0, int var1, byte var2) {
      try {
         if (-1 == var0) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               var1 = 126;
            }

            return (var0 & 65408) + var1;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cb.ax(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lts;Z)Z")
   @ObfuscatedName("ad")
   static boolean method1365(WorldEntity var0, WorldEntity var1, boolean var2) {
      if (var1 == var0) {
         return true;
      } else if (null == var1) {
         return true;
      } else {
         return var0 == null ? false : var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("op")
   static final void clanKickUser(String var0, byte var1) {
      try {
         if (BuddyRankComparator.friendsChat == null) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            }
         } else {
            PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3956, client.packetWriter.isaacCipher, -2107707107);
            var2.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, -678255530), (short)-23308);
            var2.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
            PacketWriter.method3330(client.packetWriter, var2, -1771370198);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cb.op(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ap")
   static boolean method1370(int var0) {
      try {
         if ((client.worldProperties * -1330094789 & class594.field6414.rsOrdinal((byte)22)) != 0) {
            if (var0 >= 1638145887) {
               throw new IllegalStateException();
            } else {
               Login.Login_response0 = "";
               Login.Login_response1 = Strings.field5058;
               Login.Login_response2 = Strings.field4959;
               Login.Login_response3 = Strings.field5082;
               class30.method1308(1, -555582190);
               return true;
            }
         } else if ((-1330094789 * client.worldProperties & class594.field6429.rsOrdinal((byte)98)) != 0) {
            if (var0 >= 1638145887) {
               throw new IllegalStateException();
            } else {
               if ((-1330094789 * client.worldProperties & class594.field6416.rsOrdinal((byte)65)) != 0) {
                  if (var0 >= 1638145887) {
                     throw new IllegalStateException();
                  }

                  Login.Login_response1 = Strings.field5076;
                  Login.Login_response2 = Strings.field5077;
                  Login.Login_response3 = Strings.field4885;
               } else {
                  Login.Login_response1 = Strings.field5049;
                  Login.Login_response2 = Strings.field5071;
                  Login.Login_response3 = Strings.field5072;
               }

               Login.Login_response0 = Strings.field5069;
               class30.method1308(1, -1544205072);
               return true;
            }
         } else if ((-1330094789 * client.worldProperties & class594.field6416.rsOrdinal((byte)113)) != 0) {
            if (var0 >= 1638145887) {
               throw new IllegalStateException();
            } else {
               Login.Login_response1 = Strings.field5004;
               Login.Login_response2 = Strings.field5074;
               Login.Login_response3 = Strings.field5075;
               Login.Login_response0 = Strings.field5069;
               class30.method1308(1, 2141974821);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cb.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pd")
   static void method1373(int var0) {
      try {
         if (1 == client.oculusOrbState * -2124467559) {
            if (var0 == 2146309727) {
               throw new IllegalStateException();
            }

            client.field665 = true;
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cb.pd(" + ')');
      }
   }
}
