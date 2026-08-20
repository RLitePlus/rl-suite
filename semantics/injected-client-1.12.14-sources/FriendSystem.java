import net.runelite.api.Ignore;
import net.runelite.api.events.RemovedFriend;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bd")
public class FriendSystem {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field126 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field128 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field127 = 2;
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("an")
   final LoginType loginType;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field129 = 0;
   @ObfuscatedSignature(descriptor = "Ltk;")
   @ObfuscatedName("aj")
   public final IgnoreList ignoreList;
   @ObfuscatedName("ak")
   int field123 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field131 = 32768;
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   static final int field130 = 65;
   @ObfuscatedSignature(descriptor = "Ltc;")
   @ObfuscatedName("ae")
   public final FriendsList friendsList;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field125 = 1024;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("be")
   static final void method409(String var0) {
      SwapSongTask.method10270(var0 + Strings.field5037, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   boolean method427(int var1) {
      try {
         boolean var10000;
         if (this.field123 * 636276089 == 2) {
            if (var1 == -1131594989) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bd.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("az")
   final void readUpdate(Buffer var1, int var2, int var3) {
      try {
         this.friendsList.read(var1, var2, (byte)85);
         this.field123 = -143517294;
         FadeInTask.method10494(-826368912);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bd.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;ZI)Z")
   @ObfuscatedName("as")
   final boolean isFriended(Username var1, boolean var2, int var3) {
      try {
         if (var1 == null) {
            if (var3 <= -2136271890) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (var1.equals(class330.localPlayer.username)) {
            return true;
         } else if (FriendsList.method10580(this.friendsList, var1, var2, (short)196)) {
            if (var3 <= -2136271890) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bd.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ab")
   final void addFriend(String var1, int var2) {
      try {
         if (null == var1) {
            if (var2 >= -1850006538) {
               throw new IllegalStateException();
            }
         } else {
            Username var3 = new Username(var1, this.loginType);
            if (!var3.hasCleanName(-698146178)) {
               if (var2 < -1850006538) {
                  ;
               }
            } else if (this.friendsListIsFull((byte)36)) {
               if (var2 < -1850006538) {
                  SwapSongTask.method10270(Strings.field4950, (byte)8);
               }
            } else if (class330.localPlayer.username.equals(var3)) {
               if (var2 < -1850006538) {
                  class200.method4651(2031508620);
               }
            } else if (this.isFriended(var3, false, -1599908534)) {
               if (var2 >= -1850006538) {
                  throw new IllegalStateException();
               } else {
                  class226.method5334(var1, 4921053);
               }
            } else if (method443(this, var3, (byte)-55)) {
               SwapSongTask.method10270(Strings.field5042 + var1 + Strings.field4938, (byte)8);
            } else {
               WorldMapLabelSize.method7219(var1, (byte)-47);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bd.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ax")
   final boolean friendsListIsFull(byte var1) {
      try {
         if (this.friendsList.isFull((byte)10)) {
            return true;
         } else if (var1 <= 1) {
            throw new IllegalStateException();
         } else {
            if (UserList.method10669(this.friendsList, -1328384155) >= 200) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (-1324427793 * client.field769 != 1) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bd.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ah")
   final boolean canAddIgnore(int var1) {
      try {
         if (!this.ignoreList.isFull((byte)10)) {
            if (var1 <= 1547961387) {
               throw new IllegalStateException();
            }

            if (UserList.method10669(this.ignoreList, -1967015144) < 100 || 1 == client.field769 * -1324427793) {
               return false;
            }

            if (var1 <= 1547961387) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bd.ah(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;)Z")
   @ObfuscatedName("kb")
   public static boolean method458(FriendSystem var0) {
      return var0.ignoreList.isFull((byte)10) || UserList.method10669(var0.ignoreList, 45332988) >= 1354695376 && 1 != client.field769 * -1324427793;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bj")
   static final void method416(String var0) {
      SwapSongTask.method10270(var0 + Strings.field5039, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)V")
   @ObfuscatedName("af")
   public final void removeIgnore(String var1, boolean var2, int var3) {
      this.method475(var1, var2);

      try {
         if (var1 == null) {
            if (var3 <= -2014501172) {
               throw new IllegalStateException();
            }
         } else {
            Username var4 = new Username(var1, this.loginType);
            if (!var4.hasCleanName(-698146178)) {
               if (var3 <= -2014501172) {
                  throw new IllegalStateException();
               }
            } else {
               if (this.ignoreList.removeByUsername(var4, (byte)8)) {
                  if (var3 <= -2014501172) {
                     return;
                  }

                  client.field869 = -2144279067 * client.cycleCntr;
                  if (var2) {
                     if (var3 <= -2014501172) {
                        throw new IllegalStateException();
                     }

                     PacketBufferNode var5 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3921, client.packetWriter.isaacCipher, -1928041243);
                     var5.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var1, -312728318), (short)-30198);
                     var5.packetBuffer.writeStringCp1252NullTerminated(var1, 998990159);
                     PacketWriter.method3330(client.packetWriter, var5, -1771370198);
                  }
               }

               FriendLoginUpdate.FriendSystem_invalidateIgnoreds((short)-32539);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bd.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Z)V")
   @ObfuscatedName("cf")
   public final void method465(String var1, boolean var2) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.loginType);
         if (var3.hasCleanName(-698146178)) {
            if (this.ignoreList.removeByUsername(var3, (byte)8)) {
               client.field869 = -2144279067 * client.cycleCntr;
               if (var2) {
                  PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3921, client.packetWriter.isaacCipher, -1990228866);
                  var4.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var1, 1801890073), (short)-29600);
                  var4.packetBuffer.writeStringCp1252NullTerminated(var1, 998990159);
                  PacketWriter.method3330(client.packetWriter, var4, -1771370198);
               }
            }

            FriendLoginUpdate.FriendSystem_invalidateIgnoreds((short)-18519);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ao")
   static final void method405(String var0) {
      class356.addGameMessage(30, "", var0, -1246159918);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;)Z")
   @ObfuscatedName("cl")
   public static boolean method428(FriendSystem var0) {
      return var0.field123 * 1070398148 == 2;
   }

   @ObfuscatedSignature(descriptor = "()Ltk;")
   @ObfuscatedName("ev")
   public IgnoreList method476() {
      return this.ignoreList;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bt")
   static final void method418(String var0) {
      SwapSongTask.method10270(Strings.field5044 + var0 + Strings.field5045, (byte)8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aq")
   static final void method406(String var0) {
      class356.addGameMessage(30, "", var0, 509153780);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;Lxv;)Z")
   @ObfuscatedName("dk")
   public static boolean method442(FriendSystem var0, Username var1) {
      if (var0 == null) {
         var0.method447(var1);
      }

      return var1 == null ? false : var0.ignoreList.contains(var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   final void processFriendUpdates(int var1) {
      try {
         for (FriendLoginUpdate var2 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last();
            var2 != null;
            var2 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()
         ) {
            if (var1 >= -2059175612) {
               throw new IllegalStateException();
            }

            if (-1064653935 * var2.field5932 < ParamComposition.method4949((byte)15) / 1000L - 5L) {
               if (var1 >= -2059175612) {
                  throw new IllegalStateException();
               }

               if (var2.world > 0) {
                  if (var1 >= -2059175612) {
                     throw new IllegalStateException();
                  }

                  class356.addGameMessage(5, "", var2.username + Strings.field5016, 369229713);
               }

               if (0 == var2.world) {
                  if (var1 >= -2059175612) {
                     return;
                  }

                  class356.addGameMessage(5, "", var2.username + Strings.field5017, -1928954271);
               }

               var2.remove();
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bd.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bo")
   static final void method410(String var0) {
      SwapSongTask.method10270(var0 + Strings.field5037, (byte)8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bi")
   static final void method419(String var0) {
      SwapSongTask.method10270(Strings.field5044 + var0 + Strings.field5045, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "()Ltc;")
   @ObfuscatedName("rd")
   public FriendsList method477() {
      return this.friendsList;
   }

   @ObfuscatedSignature(descriptor = "(Lbd;Ljava/lang/String;I)V")
   @ObfuscatedName("ie")
   public static void method460(FriendSystem var0, String var1, int var2) {
      if (var0 == null) {
         var0.removeFriend(var1, var2);
      }

      var0.method474(var1);

      try {
         if (var1 == null) {
            if (var2 != 831964661) {
               throw new IllegalStateException();
            }
         } else {
            Username var3 = new Username(var1, var0.loginType);
            if (!var3.hasCleanName(-698146178)) {
               if (var2 == 831964661) {
                  ;
               }
            } else {
               if (var0.friendsList.removeByUsername(var3, (byte)8)) {
                  if (var2 != 831964661) {
                     throw new IllegalStateException();
                  }

                  client.field869 = client.cycleCntr * -2144279067;
                  PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3905, client.packetWriter.isaacCipher, -1286297999);
                  var4.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var1, 569060289), (short)-8503);
                  var4.packetBuffer.writeStringCp1252NullTerminated(var1, 998990159);
                  PacketWriter.method3330(client.packetWriter, var4, -1771370198);
               }

               FadeInTask.method10494(401948489);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bd.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   static final void method411() {
      SwapSongTask.method10270(Strings.field5047, (byte)8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bz")
   static final void method413(String var0) {
      PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3926, client.packetWriter.isaacCipher, -1998470140);
      var1.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, -520077862), (short)-19151);
      var1.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
      PacketWriter.method3330(client.packetWriter, var1, -1771370198);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   static final void method414() {
      SwapSongTask.method10270(Strings.field5053, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "(Lbd;Lxv;B)Z")
   @ObfuscatedName("yr")
   public static boolean method443(FriendSystem var0, Username var1, byte var2) {
      if (var0 == null) {
         var0.isIgnored(var1, var2);
      }

      try {
         if (var1 == null) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (var0.ignoreList.contains(var1, (byte)0)) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bd.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("pz")
   public boolean method478(Username var1) {
      return method443(this, var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ch")
   final void method438() {
      this.field123 = 0;
      UserList.method10662(this.friendsList, 226040706);
      UserList.method10662(this.ignoreList, 1965532112);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   static final void method412() {
      SwapSongTask.method10270(Strings.field5047, (byte)8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bm")
   static final void method417(String var0) {
      SwapSongTask.method10270(var0 + Strings.field5039, (byte)8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bp")
   static final void method420(String var0) {
      SwapSongTask.method10270(Strings.field5044 + var0 + Strings.field5045, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;S)Z")
   @ObfuscatedName("am")
   final boolean isFriendAndHasWorld(Username var1, short var2) {
      try {
         Friend var3 = (Friend)UserList.method10680(this.friendsList, var1, (byte)17);
         boolean var10000;
         if (null != var3 && var3.hasWorld(937210184)) {
            if (var2 >= 325) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bd.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Z)V")
   @ObfuscatedName("ci")
   public final void method466(String var1, boolean var2) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.loginType);
         if (var3.hasCleanName(-698146178)) {
            if (this.ignoreList.removeByUsername(var3, (byte)8)) {
               client.field869 = -2144279067 * client.cycleCntr;
               if (var2) {
                  PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3921, client.packetWriter.isaacCipher, -1449643418);
                  var4.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var1, -1163354979), (short)-6329);
                  var4.packetBuffer.writeStringCp1252NullTerminated(var1, 998990159);
                  PacketWriter.method3330(client.packetWriter, var4, -1771370198);
               }
            }

            FriendLoginUpdate.FriendSystem_invalidateIgnoreds((short)-15374);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ba")
   static final void method421(String var0) {
      SwapSongTask.method10270(Strings.field5044 + var0 + Strings.field5045, (byte)8);
   }

   FriendSystem(LoginType var1) {
      this.loginType = var1;
      this.friendsList = new FriendsList(var1);
      this.ignoreList = new IgnoreList(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("by")
   static final void method423(String var0) {
      PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3893, client.packetWriter.isaacCipher, -1580619925);
      var1.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, 421522233), (short)-27505);
      var1.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
      PacketWriter.method3330(client.packetWriter, var1, -1771370198);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bw")
   static final void method424(String var0) {
      PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3893, client.packetWriter.isaacCipher, -1627144647);
      var1.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, 777472052), (short)-27718);
      var1.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
      PacketWriter.method3330(client.packetWriter, var1, -1771370198);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("bf")
   static final void method425(String var0, int var1) {
      PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3933, client.packetWriter.isaacCipher, -1396343624);
      var2.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, 1764551438) + 1, (short)-10648);
      Buffer.method12113(var2.packetBuffer, var1, (short)-31868);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
      PacketWriter.method3330(client.packetWriter, var2, -1771370198);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cp")
   final void method461(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName(-698146178)) {
            if (this.friendsList.removeByUsername(var2, (byte)8)) {
               client.field869 = client.cycleCntr * -2144279067;
               PacketBufferNode var3 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3905, client.packetWriter.isaacCipher, -2107594757);
               var3.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var1, -304232765), (short)-16846);
               var3.packetBuffer.writeStringCp1252NullTerminated(var1, 998990159);
               PacketWriter.method3330(client.packetWriter, var3, -1771370198);
            }

            FadeInTask.method10494(2090330092);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bd")
   boolean method429() {
      return this.field123 * 636276089 == 2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ai")
   final void method439(int var1) {
      try {
         this.field123 = 0;
         UserList.method10662(this.friendsList, 125692127);
         UserList.method10662(this.ignoreList, 1888221075);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bd.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   final void method430() {
      this.field123 = -71758647;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   final void method431() {
      this.field123 = -71758647;
   }

   @ObfuscatedSignature(descriptor = "(Lbd;I)V")
   @ObfuscatedName("ev")
   public static void method432(FriendSystem var0, int var1) {
      if (var0 == null) {
         var0.method437(var1);
      }

      try {
         var0.field123 = -71758647;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bd.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ar")
   final void addIgnore(String var1, int var2) {
      try {
         if (null == var1) {
            if (var2 > -1208776755) {
               ;
            }
         } else {
            Username var3 = new Username(var1, this.loginType);
            if (!var3.hasCleanName(-698146178)) {
               if (var2 > -1208776755) {
                  ;
               }
            } else if (this.canAddIgnore(1958466144)) {
               if (var2 <= -1208776755) {
                  throw new IllegalStateException();
               } else {
                  class343.method7608(422795684);
               }
            } else if (class330.localPlayer.username.equals(var3)) {
               if (var2 <= -1208776755) {
                  throw new IllegalStateException();
               } else {
                  SwapSongTask.method10270(Strings.field5041, (byte)8);
               }
            } else if (method443(this, var3, (byte)30)) {
               if (var2 <= -1208776755) {
                  throw new IllegalStateException();
               } else {
                  WorldMapSectionType.method7177(var1, -951127487);
               }
            } else if (this.isFriended(var3, false, 1832668474)) {
               if (var2 <= -1208776755) {
                  throw new IllegalStateException();
               } else {
                  FloorUnderlayDefinition.method4513(var1, (short)-19453);
               }
            } else {
               WorldEntity.method10824(var1, -1371229274);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bd.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bx")
   final void method436() {
      for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last();
         var1 != null;
         var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()
      ) {
         if (-1064653935 * var1.field5932 < ParamComposition.method4949((byte)15) / 1000L - 5L) {
            if (var1.world > 0) {
               class356.addGameMessage(5, "", var1.username + Strings.field5016, -651763856);
            }

            if (0 == var1.world) {
               class356.addGameMessage(5, "", var1.username + Strings.field5017, 1072850081);
            }

            var1.remove();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   final boolean method452() {
      return this.friendsList.isFull((byte)10) || UserList.method10669(this.friendsList, 1110405166) >= 200 && -1324427793 * client.field769 != 1;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("ct")
   final boolean method444(Username var1) {
      return var1 == null ? false : this.ignoreList.contains(var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("ce")
   final boolean method445(Username var1) {
      return var1 == null ? false : this.ignoreList.contains(var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Z)Z")
   @ObfuscatedName("rw")
   public boolean method479(Username var1, boolean var2) {
      return this.isFriended(var1, var2, -63638469);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("cu")
   final boolean method446(Username var1) {
      return var1 == null ? false : this.ignoreList.contains(var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIILkk;I)V")
   @ObfuscatedName("az")
   static final void addObjects(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7, int var8) {
      rl4 var9 = var0.isTopLevel() ? client.field1029 : client.field1030;
      if (var1 < Tiles.Tiles_minPlane * -957711027) {
         Tiles.Tiles_minPlane = var1 * 84476805;
      }

      Scene var10 = var9.field5656;
      ObjectComposition var11 = ObjectComposition.method5196(var4);
      int var12;
      int var13;
      if (var5 != 1 && var5 != 3) {
         var12 = var11.sizeX * 1813358617;
         var13 = var11.sizeY * -352504863;
      } else {
         var12 = var11.sizeY * -352504863;
         var13 = var11.sizeX * 1813358617;
      }

      int var14;
      int var15;
      if (var12 + var2 <= var10.field3018) {
         var14 = (var12 >> 1) + var2;
         var15 = (var12 + 1 >> 1) + var2;
      } else {
         var14 = var2;
         var15 = var2 + 1;
      }

      var14 += var10.field3014;
      var15 += var10.field3014;
      int var16;
      int var17;
      if (var13 + var3 <= var10.field3015) {
         var16 = (var13 >> 1) + var3;
         var17 = (var13 + 1 >> 1) + var3;
      } else {
         var16 = var3;
         var17 = var3 + 1;
      }

      var16 += var10.field3014;
      var17 += var10.field3014;
      int var18 = var2 + var10.field3014;
      int var19 = var3 + var10.field3014;
      boolean var20 = var2 > 0 && var2 < 103 && var3 > 0 && var3 < 103;
      int[][] var21 = var9.field5662[var1];
      int var22 = var21[var14][var17] + var21[var14][var16] + var21[var15][var16] + var21[var15][var17] >> 2;
      int var23 = (var18 << 7) + (var12 << 6);
      int var24 = (var19 << 7) + (var13 << 6);
      boolean var25 = var11.int1 * -1900812067 != 0 && var2 >= 0 && var2 < 128 && var3 >= 0 && var3 < 128;
      long var26 = client.method2401(var1, var2, var3, 2, !var25, var4, var0.id * 577964535);
      int var28 = var6 + (var5 << 6);
      if (var11.int3 * 1768476057 == 1) {
         var28 += 256;
      }

      if (var11.method5195()) {
         client.method2478(var9, var0.id * 577964535, var1, var2, var3, var11, var5);
      }

      if (var6 == 22) {
         boolean var29 = !client.isLowDetail || var11.int1 * -1900812067 != 0 || var11.interactType * 756705879 == 1 || var11.boolean2;
         if (!var29) {
            if (!client.$assertionsDisabled && !client.isLowDetail) {
               throw new AssertionError();
            }

            int var30 = var10.field3031[var1][var18][var19] & 32767;
            if (var30 > 0) {
               FloorOverlayDefinition var31 = var9.method9571(var30 - 1);
               if (var31.method5359() < 0 && var31.method5362() == 16711935) {
                  var29 = true;
               }
            }
         }

         if (var29) {
            Object var51;
            if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
               var51 = client.method2412(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
            } else {
               DynamicObject var64 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
               var64.field1198 = var10;
               var51 = var64;
            }

            var10.method5804(var1, var2, var3, var22, (Renderable)var51, var26, var28);
            if (var11.interactType * 756705879 == 1 && var7 != null && var20) {
               var7.method6446(var2, var3);
            }
         }
      } else if (var6 >= 12) {
         Object var40;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var40 = client.method2412(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var52 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var52.field1198 = var10;
            var40 = var52;
         }

         var10.method5808(var1, var2, var3, var22, 1, 1, (Renderable)var40, 0, var26, var28);
         if (var6 <= 17 && var6 != 13 && var1 > 0) {
            var9.field5638[var1][var18][var19] = var9.field5638[var1][var18][var19] | 2340;
         }

         if (var11.interactType * 756705879 != 0 && var7 != null && var20) {
            var7.method6443(var2, var3, var12, var13, var11.boolean2);
         }
      } else if (var6 == 10 || var6 == 11) {
         Object var50;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var50 = client.method2412(var0.scene, var10, var11, var21, var6, var5, 10, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var62 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var62.field1198 = var10;
            var50 = var62;
         }

         if (var50 != null && var10.method5808(var1, var2, var3, var22, var12, var13, (Renderable)var50, var6 == 11 ? 256 : 0, var26, var28) && var11.clipped) {
            int var63 = 15;
            if (var50 instanceof Model) {
               Model var70 = (Model)var50;
               var70.calculateBoundsCylinder();
               var63 = var70.getXYZMag() / 4;
               if (var63 > 30) {
                  var63 = 30;
               }
            }

            for (int var71 = 0; var71 <= var12; var71++) {
               for (int var75 = 0; var75 <= var13; var75++) {
                  if (var63 > var9.field5639[var1][var71 + var18][var75 + var19]) {
                     var9.field5639[var1][var71 + var18][var75 + var19] = (byte)var63;
                  }
               }
            }
         }

         if (var11.interactType * 756705879 != 0 && var7 != null && var20) {
            var7.method6443(var2, var3, var12, var13, var11.boolean1);
         }
      } else if (var6 == 0) {
         Object var41;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var41 = client.method2412(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var53 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var53.field1198 = var10;
            var41 = var53;
         }

         var10.method5794(var1, var2, var3, var22, (Renderable)var41, null, 1 << var5, 0, var26, var28);
         if (var5 == 0) {
            if (var11.clipped) {
               var9.field5639[var1][var18][var19] = 50;
               var9.field5639[var1][var18][var19 + 1] = 50;
            }

            if (var11.modelClipped) {
               var9.field5638[var1][var18][var19] = var9.field5638[var1][var18][var19] | 585;
            }
         } else if (var5 == 1) {
            if (var11.clipped) {
               var9.field5639[var1][var18][var19 + 1] = 50;
               var9.field5639[var1][var18 + 1][var19 + 1] = 50;
            }

            if (var11.modelClipped) {
               var9.field5638[var1][var18][var19 + 1] = var9.field5638[var1][var18][var19 + 1] | 1170;
            }
         } else if (var5 == 2) {
            if (var11.clipped) {
               var9.field5639[var1][var18 + 1][var19] = 50;
               var9.field5639[var1][var18 + 1][var19 + 1] = 50;
            }

            if (var11.modelClipped) {
               var9.field5638[var1][var18 + 1][var19] = var9.field5638[var1][var18 + 1][var19] | 585;
            }
         } else if (var5 == 3) {
            if (var11.clipped) {
               var9.field5639[var1][var18][var19] = 50;
               var9.field5639[var1][var18 + 1][var19] = 50;
            }

            if (var11.modelClipped) {
               var9.field5638[var1][var18][var19] = var9.field5638[var1][var18][var19] | 1170;
            }
         }

         if (var11.interactType * 756705879 != 0 && var7 != null && var20) {
            var7.method6442(var2, var3, var6, var5, var11.boolean1);
         }

         if (var11.int2 * 854845213 != 16) {
            var10.method5791(var1, var2, var3, var11.int2 * 854845213);
         }
      } else if (var6 == 1 || var6 == 3) {
         Object var49;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var49 = client.method2412(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var61 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var61.field1198 = var10;
            var49 = var61;
         }

         var10.method5794(var1, var2, var3, var22, (Renderable)var49, null, 16 << var5, 0, var26, var28);
         if (var11.clipped) {
            if (var5 == 0) {
               var9.field5639[var1][var18][var19 + 1] = 50;
            } else if (var5 == 1) {
               var9.field5639[var1][var18 + 1][var19 + 1] = 50;
            } else if (var5 == 2) {
               var9.field5639[var1][var18 + 1][var19] = 50;
            } else if (var5 == 3) {
               var9.field5639[var1][var18][var19] = 50;
            }
         }

         if (var11.interactType * 756705879 != 0 && var7 != null && var20) {
            var7.method6442(var2, var3, var6, var5, var11.boolean1);
         }
      } else if (var6 == 2) {
         int var42 = var5 + 1 & 3;
         Object var54;
         Object var65;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var65 = var11.method5192(2, var5 + 4, var21, var23, var22, var24);
            var54 = var11.method5192(2, var42, var21, var23, var22, var24);
         } else {
            DynamicObject var32 = new DynamicObject(var0, var4, 2, var5 + 4, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            DynamicObject var33 = new DynamicObject(var0, var4, 2, var42, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var32.field1198 = var33.field1198 = var10;
            var54 = var32;
            var65 = var33;
         }

         var10.method5794(var1, var2, var3, var22, (Renderable)var65, (Renderable)var54, 1 << var5, 1 << var42, var26, var28);
         if (var11.modelClipped) {
            if (var5 == 0) {
               var9.field5638[var1][var18][var19] = var9.field5638[var1][var18][var19] | 585;
               var9.field5638[var1][var18][var19 + 1] = var9.field5638[var1][var18][var19 + 1] | 1170;
            } else if (var5 == 1) {
               var9.field5638[var1][var18][var19 + 1] = var9.field5638[var1][var18][var19 + 1] | 1170;
               var9.field5638[var1][var18 + 1][var19] = var9.field5638[var1][var18 + 1][var19] | 585;
            } else if (var5 == 2) {
               var9.field5638[var1][var18 + 1][var19] = var9.field5638[var1][var18 + 1][var19] | 585;
               var9.field5638[var1][var18][var19] = var9.field5638[var1][var18][var19] | 1170;
            } else if (var5 == 3) {
               var9.field5638[var1][var18][var19] = var9.field5638[var1][var18][var19] | 1170;
               var9.field5638[var1][var18][var19] = var9.field5638[var1][var18][var19] | 585;
            }
         }

         if (var11.interactType * 756705879 != 0 && var7 != null && var20) {
            var7.method6442(var2, var3, var6, var5, var11.boolean1);
         }

         if (var11.int2 * 854845213 != 16) {
            var10.method5791(var1, var2, var3, var11.int2 * 854845213);
         }
      } else if (var6 == 9) {
         Object var43;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var43 = client.method2412(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var55 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var55.field1198 = var10;
            var43 = var55;
         }

         var10.method5808(var1, var2, var3, var22, 1, 1, (Renderable)var43, 0, var26, var28);
         if (var11.interactType * 756705879 != 0 && var7 != null && var20) {
            var7.method6443(var2, var3, var12, var13, var11.boolean1);
         }

         if (var11.int2 * 854845213 != 16) {
            var10.method5791(var1, var2, var3, var11.int2 * 854845213);
         }
      } else if (var6 == 4) {
         Object var44;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var44 = client.method2412(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var56 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var56.field1198 = var10;
            var44 = var56;
         }

         var10.method5809(var1, var2, var3, var22, (Renderable)var44, null, 1 << var5, 0, 0, 0, var26, var28);
      } else if (var6 == 5) {
         int var45 = 16;
         BoundaryObject var57 = var10.method5796(var1, var2, var3);
         if (var57 != null) {
            var45 = ObjectComposition.method5196(var57.getId()).int2 * 854845213;
         }

         Object var66;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var66 = client.method2412(var0.scene, var10, var11, var21, var6, var5, 4, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var72 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var72.field1198 = var10;
            var66 = var72;
         }

         var10.method5809(
            var1, var2, var3, var22, (Renderable)var66, null, 1 << var5, 0, var45 * Tiles.field604[var5], var45 * Tiles.field603[var5], var26, var28
         );
      } else if (var6 == 6) {
         int var46 = 8;
         BoundaryObject var58 = var10.method5796(var1, var2, var3);
         if (var58 != null) {
            var46 = ObjectComposition.method5196(var58.getId()).int2 * 854845213 / 2;
         }

         Object var67;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var67 = client.method2412(var0.scene, var10, var11, var21, var6, var5, 4, var5 + 4, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var73 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var73.field1198 = var10;
            var67 = var73;
         }

         var10.method5809(var1, var2, var3, var22, (Renderable)var67, null, 256, var5, var46 * Tiles.field606[var5], var46 * Tiles.field607[var5], var26, var28);
      } else if (var6 == 7) {
         int var47 = var5 + 2 & 3;
         Object var59;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var59 = client.method2412(var0.scene, var10, var11, var21, var6, var5, 4, var47 + 4, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var68 = new DynamicObject(var0, var4, 4, var47 + 4, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var68.field1198 = var10;
            var59 = var68;
         }

         var10.method5809(var1, var2, var3, var22, (Renderable)var59, null, 256, var47, 0, 0, var26, var28);
      } else if (var6 == 8) {
         int var48 = 8;
         BoundaryObject var60 = var10.method5796(var1, var2, var3);
         if (var60 != null) {
            var48 = ObjectComposition.method5196(var60.getId()).int2 * 854845213 / 2;
         }

         int var69 = var5 + 2 & 3;
         Object var74;
         Object var76;
         if (var11.animationId * 930784507 == -1 && var11.transforms == null) {
            var74 = var11.method5192(4, var5 + 4, var21, var23, var22, var24);
            var76 = var11.method5192(4, var69 + 4, var21, var23, var22, var24);
         } else {
            DynamicObject var34 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            DynamicObject var35 = new DynamicObject(var0, var4, 4, var69 + 4, var1, var2, var3, var11.animationId * 930784507, var11.boolean3, null);
            var34.field1198 = var35.field1198 = var10;
            var74 = var34;
            var76 = var35;
         }

         var10.method5809(
            var1, var2, var3, var22, (Renderable)var74, (Renderable)var76, 256, var5, var48 * Tiles.field606[var5], var48 * Tiles.field607[var5], var26, var28
         );
      } else {
         client.field938.debug("unknown loc type {}", var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cd")
   final void method455(String var1) {
      if (null != var1) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName(-698146178)) {
            if (this.canAddIgnore(1818257467)) {
               class343.method7608(-664379435);
            } else if (class330.localPlayer.username.equals(var2)) {
               SwapSongTask.method10270(Strings.field5041, (byte)8);
            } else if (method443(this, var2, (byte)-35)) {
               WorldMapSectionType.method7177(var1, -1543344374);
            } else if (this.isFriended(var2, false, -1985869735)) {
               FloorUnderlayDefinition.method4513(var1, (short)-11198);
            } else {
               WorldEntity.method10824(var1, 235781850);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("cb")
   final boolean method447(Username var1) {
      return var1 == null ? false : this.ignoreList.contains(var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cs")
   final void method462(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName(-698146178)) {
            if (this.friendsList.removeByUsername(var2, (byte)8)) {
               client.field869 = client.cycleCntr * -2144279067;
               PacketBufferNode var3 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3905, client.packetWriter.isaacCipher, -1251484133);
               var3.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var1, -726846236), (short)-24584);
               var3.packetBuffer.writeStringCp1252NullTerminated(var1, 998990159);
               PacketWriter.method3330(client.packetWriter, var3, -1771370198);
            }

            FadeInTask.method10494(-531611713);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cc")
   final boolean method453() {
      return this.friendsList.isFull((byte)10) || UserList.method10669(this.friendsList, 430347372) >= 200 && -1324427793 * client.field769 != 1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cn")
   final void method456(String var1) {
      if (null != var1) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName(-698146178)) {
            if (this.canAddIgnore(1760282185)) {
               class343.method7608(-301219685);
            } else if (class330.localPlayer.username.equals(var2)) {
               SwapSongTask.method10270(Strings.field5041, (byte)8);
            } else if (method443(this, var2, (byte)-14)) {
               WorldMapSectionType.method7177(var1, -1089099956);
            } else if (this.isFriended(var2, false, -453765755)) {
               FloorUnderlayDefinition.method4513(var1, (short)-23982);
            } else {
               WorldEntity.method10824(var1, -1975482437);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("bn")
   static final void method426(String var0, int var1) {
      PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3933, client.packetWriter.isaacCipher, -1840425699);
      var2.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, 1332866565) + 1, (short)-8401);
      Buffer.method12113(var2.packetBuffer, var1, (short)-10829);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
      PacketWriter.method3330(client.packetWriter, var2, -1771370198);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("co")
   final boolean method459() {
      return this.ignoreList.isFull((byte)10) || UserList.method10669(this.ignoreList, 2124725015) >= 100 && 1 != client.field769 * -1324427793;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cz")
   final void method463(String var1) {
      if (var1 != null) {
         Username var2 = new Username(var1, this.loginType);
         if (var2.hasCleanName(-698146178)) {
            if (this.friendsList.removeByUsername(var2, (byte)8)) {
               client.field869 = client.cycleCntr * -2144279067;
               PacketBufferNode var3 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3905, client.packetWriter.isaacCipher, -1753827834);
               var3.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var1, -1174213225), (short)-14537);
               var3.packetBuffer.writeStringCp1252NullTerminated(var1, 998990159);
               PacketWriter.method3330(client.packetWriter, var3, -1771370198);
            }

            FadeInTask.method10494(1632906293);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   static final void method415() {
      SwapSongTask.method10270(Strings.field5053, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "(II)Lhg;")
   @ObfuscatedName("at")
   public static VarcInt method404(int var0, int var1) {
      try {
         VarcInt var2 = (VarcInt)class402.method8806(VarcInt.VarcInt_cached, var0);
         if (null != var2) {
            if (var1 == 888972961) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = VarcInt.VarcInt_archive.getFile(19, var0, 430367135);
            var2 = new VarcInt();
            if (var3 != null) {
               if (var1 == 888972961) {
                  throw new IllegalStateException();
               }

               VarcInt.method4526(var2, new Buffer(var3), (byte)0);
            }

            VarcInt.VarcInt_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bd.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   final void method440() {
      this.field123 = 0;
      UserList.method10662(this.friendsList, -337034890);
      UserList.method10662(this.ignoreList, -668661784);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Z)V")
   @ObfuscatedName("cy")
   public final void method467(String var1, boolean var2) {
      if (var1 != null) {
         Username var3 = new Username(var1, this.loginType);
         if (var3.hasCleanName(-698146178)) {
            if (this.ignoreList.removeByUsername(var3, (byte)8)) {
               client.field869 = -2144279067 * client.cycleCntr;
               if (var2) {
                  PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3921, client.packetWriter.isaacCipher, -1436963262);
                  var4.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var1, 1227938171), (short)-17228);
                  var4.packetBuffer.writeStringCp1252NullTerminated(var1, 998990159);
                  PacketWriter.method3330(client.packetWriter, var4, -1771370198);
               }
            }

            FriendLoginUpdate.FriendSystem_invalidateIgnoreds((short)-4112);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("cq")
   final boolean method469(Username var1) {
      Friend var2 = (Friend)UserList.method10680(this.friendsList, var1, (byte)82);
      return null != var2 && var2.hasWorld(937210184);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bu")
   static final void method422(String var0) {
      SwapSongTask.method10270(Strings.field5044 + var0 + Strings.field5045, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   static void method471(int var0) {
      try {
         UserComparator6.otp.trim();
         if (UserComparator6.otp.length() != 6) {
            if (var0 <= -859198206) {
               throw new IllegalStateException();
            } else {
               class525.setLoginResponseString(Strings.field5118, Strings.field4955, Strings.field4894, (byte)1);
            }
         } else {
            class28.otpMedium = Integer.parseInt(UserComparator6.otp) * -1904399543;
            UserComparator6.otp = "";
            classFR.method4050(true, -224350890);
            class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
            WorldMapSectionType.updateGameState(20, (byte)45);
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bd.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)I")
   @ObfuscatedName("am")
   static int method472(Widget var0, int var1) {
      try {
         if (11 != 928687775 * var0.type) {
            if (var1 <= 1633026010) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               return 1;
            }
         } else {
            String var2 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var0.method8115(var2, -2118773102);
            return 1;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bd.am(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("bq")
   final void method434(Buffer var1, int var2) {
      this.friendsList.read(var1, var2, (byte)127);
      this.field123 = -143517294;
      FadeInTask.method10494(493790638);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;ZI)[B")
   @ObfuscatedName("at")
   public static byte[] method408(Object var0, boolean var1, int var2) {
      try {
         if (var0 == null) {
            if (var2 >= -1135868455) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (var0 instanceof byte[]) {
            if (var2 >= -1135868455) {
               throw new IllegalStateException();
            } else {
               byte[] var8 = (byte[])var0;
               if (var1) {
                  if (var2 >= -1135868455) {
                     throw new IllegalStateException();
                  } else {
                     int var5 = var8.length;
                     byte[] var6 = new byte[var5];
                     System.arraycopy(var8, 0, var6, 0, var5);
                     return var6;
                  }
               } else {
                  return var8;
               }
            }
         } else if (var0 instanceof AbstractByteArrayCopier) {
            if (var2 >= -1135868455) {
               throw new IllegalStateException();
            } else {
               AbstractByteArrayCopier var3 = (AbstractByteArrayCopier)var0;
               return var3.get(-1601907569);
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bd.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("qt")
   public void method474(String var1) {
      net.runelite.api.Friend var2 = (net.runelite.api.Friend)this.method477().findByName(var1);
      if (var2 != null) {
         SecureUrlRequester.client.getCallbacks().post(new RemovedFriend(var2));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aa")
   static final void method407(String var0) {
      class356.addGameMessage(30, "", var0, -1651195452);
   }

   @ObfuscatedSignature(descriptor = "(Lut;B)V")
   @ObfuscatedName("ap")
   public static void method470(DynamicArray var0, byte var1) {
      try {
         class461.method9338(var0, null, true, -928498657);
         int var2 = var0.method11215((byte)27);
         if (var2 <= 1) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         } else {
            if (class586.field6376 == var0.field6107) {
               LoginScreenAnimation.method1352(var0.method11207(2053374425), 0, var2 - 1, (byte)-64);
            } else if (var0.field6107 == class586.field6377) {
               if (var1 <= 1) {
                  return;
               }

               HttpResponse.method141(DynamicArray.method11211(var0, (byte)47), 0, var2 - 1, 980942039);
            } else {
               classFM.method4029(var0.method11214((byte)11), 0, var2 - 1, 2108391709);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bd.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Z)V")
   @ObfuscatedName("zs")
   public void method475(String var1, boolean var2) {
      Ignore var3 = (Ignore)this.method476().findByName(var1);
      if (var3 != null) {
         SecureUrlRequester.client.getCallbacks().post(new RemovedFriend(var3));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   final void method437(int var1) {
      try {
         for (FriendLoginUpdate var2 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.method9473();
            var2 != null;
            var2 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.method9473()
         ) {
            if (var1 >= -2059175612) {
               throw new IllegalStateException();
            }

            if (-1064653935 * var2.field5932 < ParamComposition.method4949((byte)15) / 1000L - 5L) {
               if (var1 >= -2059175612) {
                  throw new IllegalStateException();
               }

               if (var2.world > 0) {
                  if (var1 >= -2059175612) {
                     throw new IllegalStateException();
                  }

                  class356.addGameMessage(5, "", var2.username + Strings.field5122, 369229713);
               }

               if (0 == var2.world) {
                  if (var1 >= -2059175612) {
                     return;
                  }

                  class356.addGameMessage(5, "", var2.username + Strings.field5073, -1928954271);
               }

               var2.method11361();
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bd.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("al")
   final void removeFriend(String var1, int var2) {
      try {
         if (null == var1) {
            if (var2 >= -1850006538) {
               throw new IllegalStateException();
            }
         } else {
            Username var3 = new Username(var1, this.loginType);
            if (!var3.hasCleanName(-698146178)) {
               if (var2 < -1850006538) {
                  ;
               }
            } else if (this.friendsListIsFull((byte)36)) {
               if (var2 < -1850006538) {
                  SwapSongTask.method10270(Strings.field5100, (byte)8);
               }
            } else if (class330.localPlayer.username.equals(var3)) {
               if (var2 < -1850006538) {
                  class200.method4651(2031508620);
               }
            } else if (this.isFriended(var3, false, -1599908534)) {
               if (var2 >= -1850006538) {
                  throw new IllegalStateException();
               } else {
                  class226.method5334(var1, 4921053);
               }
            } else if (method443(this, var3, (byte)-55)) {
               SwapSongTask.method10270(Strings.field5082 + var1 + Strings.field4885, (byte)8);
            } else {
               WorldMapLabelSize.method7219(var1, (byte)-47);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bd.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;B)Z")
   @ObfuscatedName("ac")
   final boolean isIgnored(Username var1, byte var2) {
      try {
         if (var1 == null) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (this.ignoreList.contains(var1, (byte)0)) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bd.ac(" + ')');
      }
   }
}
