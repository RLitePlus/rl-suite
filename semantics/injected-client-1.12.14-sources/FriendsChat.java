import net.runelite.api.FriendsChatManager;
import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.api.events.FriendsChatMemberJoined;
import net.runelite.api.events.FriendsChatMemberLeft;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ta")
public class FriendsChat extends UserList implements FriendsChatManager {
   @ObfuscatedName("ae")
   public String owner;
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("at")
   final LoginType loginType;
   @ObfuscatedName("aw")
   int field5886;
   @ObfuscatedName("an")
   public String name = null;
   @ObfuscatedName("ak")
   public int rank;
   @ObfuscatedName("aj")
   public byte minKick;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5891 = 500;
   @ObfuscatedSignature(descriptor = "Ltp;")
   @ObfuscatedName("ag")
   final Usernamed localUser;

   @ObfuscatedSignature(descriptor = "(I)Ltz;")
   @ObfuscatedName("av")
   @Override
   User newInstance(int var1) {
      try {
         return new ClanMate();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ta.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[Ltz;")
   @ObfuscatedName("at")
   @Override
   User[] newTypedArray(int var1, int var2) {
      try {
         return new ClanMate[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ta.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lta;)V")
   @ObfuscatedName("ow")
   public static void method10562(FriendsChat var0) {
      if (var0 == null) {
         var0.method10568();
      } else {
         for (int var1 = 0; var1 < UserList.method10669(var0, 1591511291); var1++) {
            ClanMate.method10754((ClanMate)var0.get(var1, -1482274590), (byte)-52);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lta;Lxa;I)V")
   @ObfuscatedName("im")
   public static void method10557(FriendsChat var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method10556(var1, var2);
      }

      try {
         Username var3 = new Username(var1.readStringCp1252NullCircumfixed(-341773848), var0.loginType);
         int var4 = Buffer.method12008(var1, (byte)5);
         byte var5 = Buffer.method12001(var1, (byte)93);
         boolean var6 = false;
         if (var5 == -128) {
            if (var2 != -1400240937) {
               throw new IllegalStateException();
            }

            var6 = true;
         }

         if (var6) {
            if (var2 != -1400240937) {
               throw new IllegalStateException();
            }

            if (UserList.method10669(var0, -936619094) == 0) {
               if (var2 != -1400240937) {
                  throw new IllegalStateException();
               }

               return;
            }

            ClanMate var7 = (ClanMate)var0.getByCurrentUsername(var3, 862907097);
            if (var7 != null) {
               if (var2 != -1400240937) {
                  throw new IllegalStateException();
               }

               if (var7.getWorld(-1864841334) == var4) {
                  UserList.method10695(var0, var7, -345822894);
               }
            }
         } else {
            var1.readStringCp1252NullCircumfixed(-1900278466);
            ClanMate var9 = (ClanMate)var0.getByCurrentUsername(var3, 862907097);
            if (var9 == null) {
               if (var2 != -1400240937) {
                  return;
               }

               if (UserList.method10669(var0, -882183687) > var0.capacity * -610830519) {
                  if (var2 != -1400240937) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               var9 = (ClanMate)var0.addLastNoPreviousUsername(var3, -2084290396);
            }

            var9.set(var4, (var0.field5886 += 1988194161) * -185634415 - 1, (short)-702);
            var9.rank = 1986803653 * var5;
            var0.isLocalPlayer(var9, -468643405);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ta.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("au")
   final void method10550(String var1, byte var2) {
      try {
         String var4 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
         if (null == var4) {
            var4 = "";
         }

         this.owner = var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ta.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("az")
   public final void method10554(Buffer var1, int var2) {
      try {
         this.method10550(var1.readStringCp1252NullCircumfixed(1881811172), (byte)42);
         long var3 = Buffer.method12018(var1, -2102652448);
         this.method10547(ApproximateRouteStrategy.method382(var3), 922004448);
         this.minKick = Buffer.method12001(var1, (byte)20);
         int var5 = var1.readShortSmartSub(-796232993);
         if (-1 != var5) {
            UserList.method10662(this, -967696484);

            for (int var6 = 0; var6 < var5; var6++) {
               if (var2 == 319833484) {
                  throw new IllegalStateException();
               }

               ClanMate var7 = (ClanMate)this.addLastNoPreviousUsername(
                  new Username(var1.readStringCp1252NullCircumfixed(-1571748972), this.loginType), -1973943379
               );
               int var8 = Buffer.method12008(var1, (byte)5);
               var7.set(var8, (this.field5886 += 1988194161) * -185634415 - 1, (short)3567);
               var7.rank = Buffer.method12001(var1, (byte)20) * 1986803653;
               var1.readStringCp1252NullCircumfixed(-1234040636);
               this.isLocalPlayer(var7, -1656508477);
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ta.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ai")
   public final void clearFriends(byte var1) {
      try {
         for (int var2 = 0; var2 < UserList.method10669(this, -765043575); var2++) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            }

            ClanMate.method10754((ClanMate)this.get(var2, -138601326), (byte)-105);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ta.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   public final void invalidateIgnoreds(byte var1) {
      try {
         for (int var2 = 0; var2 < UserList.method10669(this, -1815873789); var2++) {
            if (var1 >= -1) {
               throw new IllegalStateException();
            }

            ClanMate.method10767((ClanMate)this.get(var2, -1200597686), -1237213104);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ta.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltl;I)V")
   @ObfuscatedName("ac")
   final void isLocalPlayer(ClanMate var1, int var2) {
      try {
         if (var1.getUsername((byte)-36).equals(this.localUser.username(-1525411131))) {
            if (var2 >= 701763743) {
               throw new IllegalStateException();
            }

            this.rank = var1.rank * 893932873;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ta.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("an")
   @Override
   User vmethod343() {
      return new ClanMate();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lta;Ljava/lang/String;)V")
   @ObfuscatedName("kl")
   public static void method10551(FriendsChat var0, String var1) {
      if (var0 == null) {
         var0.vmethod343();
      }

      String var3 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
      if (null == var3) {
         var3 = "";
      }

      var0.owner = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lta;)V")
   @ObfuscatedName("ho")
   public static void method10566(FriendsChat var0) {
      if (var0 == null) {
         var0.getKickRank();
      }

      for (int var1 = 0; var1 < UserList.method10669(var0, 1925861613); var1++) {
         ClanMate.method10767((ClanMate)var0.get(var1, 1418360949), -1237213104);
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("iw")
   public byte method10573() {
      return this.minKick;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lta;Ltl;)V")
   @ObfuscatedName("zl")
   public static void method10570(FriendsChat var0, ClanMate var1) {
      if (var0 == null) {
         var0.vmethod343();
      }

      if (var1.getUsername((byte)-66).equals(var0.localUser.username(-416256635))) {
         var0.rank = var1.rank * -1965795827;
      }
   }

   public String getName() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ah")
   final void method10545(String var1) {
      String var3 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
      if (var3 == null) {
         var3 = "";
      }

      this.name = var3;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ax")
   final void method10546(String var1) {
      String var3 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
      if (var3 == null) {
         var3 = "";
      }

      this.name = var3;
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ap")
   @Override
   User[] vmethod347(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ay")
   @Override
   User[] vmethod348(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("aw")
   @Override
   User[] vmethod349(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("aj")
   @Override
   User vmethod344() {
      return new ClanMate();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ag")
   final void method10547(String var1, int var2) {
      try {
         String var4 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
         if (var4 == null) {
            if (var2 != 922004448) {
               throw new IllegalStateException();
            }

            var4 = "";
         }

         this.name = var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ta.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltl;)V")
   @ObfuscatedName("bb")
   final void method10571(ClanMate var1) {
      if (var1.getUsername((byte)-33).equals(this.localUser.username(1583950209))) {
         this.rank = var1.rank * -91723246;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsz;)Lsz;")
   @ObfuscatedName("lu")
   public static SongTask method10544(SongTask var0) {
      return var0.songTask;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ar")
   final void method10548(String var1) {
      String var3 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
      if (var3 == null) {
         var3 = "";
      }

      this.name = var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ao")
   public final void method10558(Buffer var1) {
      Username var2 = new Username(var1.readStringCp1252NullCircumfixed(-1482515657), this.loginType);
      int var3 = Buffer.method12008(var1, (byte)5);
      byte var4 = Buffer.method12001(var1, (byte)25);
      boolean var5 = false;
      if (var4 == 2038684973) {
         var5 = true;
      }

      if (var5) {
         if (UserList.method10669(this, 1784538623) == 0) {
            return;
         }

         ClanMate var6 = (ClanMate)this.getByCurrentUsername(var2, 862907097);
         if (var6 != null && var6.getWorld(-317562140) == var3) {
            UserList.method10695(this, var6, 120329761);
         }
      } else {
         var1.readStringCp1252NullCircumfixed(1521069635);
         ClanMate var7 = (ClanMate)this.getByCurrentUsername(var2, 862907097);
         if (var7 == null) {
            if (UserList.method10669(this, 1554051176) > this.capacity * -1459449716) {
               return;
            }

            var7 = (ClanMate)this.addLastNoPreviousUsername(var2, -2120378909);
         }

         var7.set(var3, (this.field5886 += 1988194161) * 1878378742 - 1, (short)14259);
         var7.rank = 1986803653 * var4;
         this.isLocalPlayer(var7, -680944976);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("al")
   final void method10552(String var1) {
      String var3 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
      if (null == var3) {
         var3 = "";
      }

      this.owner = var3;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("af")
   final void method10553(String var1) {
      String var3 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
      if (null == var3) {
         var3 = "";
      }

      this.owner = var3;
   }

   public FriendsChat(LoginType var1, Usernamed var2) {
      super(500);
      this.owner = null;
      this.field5886 = 1988194161;
      this.loginType = var1;
      this.localUser = var2;
   }

   public FriendsChatRank getKickRank() {
      return FriendsChatRank.valueOf(this.method10573());
   }

   public String getOwner() {
      return this.owner;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aq")
   public final void method10555(Buffer var1) {
      this.method10550(var1.readStringCp1252NullCircumfixed(1301721383), (byte)86);
      long var2 = Buffer.method12018(var1, -2080633874);
      this.method10547(ApproximateRouteStrategy.method382(var2), 922004448);
      this.minKick = Buffer.method12001(var1, (byte)33);
      int var4 = var1.readShortSmartSub(-483426159);
      if (-1 != var4) {
         UserList.method10662(this, -724648514);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(
               new Username(var1.readStringCp1252NullCircumfixed(-1517037872), this.loginType), -1904758259
            );
            int var7 = Buffer.method12008(var1, (byte)5);
            var6.set(var7, (this.field5886 += -1266821146) * -2036780707 - 1, (short)14548);
            var6.rank = Buffer.method12001(var1, (byte)23) * 1986803653;
            var1.readStringCp1252NullCircumfixed(-1001775544);
            this.isLocalPlayer(var6, -1023069884);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("ae")
   @Override
   User vmethod345() {
      return new ClanMate();
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("be")
   public final void method10559(Buffer var1) {
      Username var2 = new Username(var1.readStringCp1252NullCircumfixed(1063656513), this.loginType);
      int var3 = Buffer.method12008(var1, (byte)5);
      byte var4 = Buffer.method12001(var1, (byte)82);
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      if (var5) {
         if (UserList.method10669(this, -1035231168) == 0) {
            return;
         }

         ClanMate var6 = (ClanMate)this.getByCurrentUsername(var2, 862907097);
         if (var6 != null && var6.getWorld(49853049) == var3) {
            UserList.method10695(this, var6, -1423500238);
         }
      } else {
         var1.readStringCp1252NullCircumfixed(774490474);
         ClanMate var7 = (ClanMate)this.getByCurrentUsername(var2, 862907097);
         if (var7 == null) {
            if (UserList.method10669(this, -1039512736) > this.capacity * -610830519) {
               return;
            }

            var7 = (ClanMate)this.addLastNoPreviousUsername(var2, -1795133528);
         }

         var7.set(var3, (this.field5886 += 1988194161) * -185634415 - 1, (short)-20907);
         var7.rank = 1986803653 * var4;
         this.isLocalPlayer(var7, -304637643);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public final void method10564() {
      for (int var1 = 0; var1 < UserList.method10669(this, 1363865942); var1++) {
         ClanMate.method10754((ClanMate)this.get(var1, 2102474816), (byte)-126);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ak")
   @Override
   User[] vmethod350(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   public final void method10567() {
      for (int var1 = 0; var1 < UserList.method10669(this, 25754148); var1++) {
         ClanMate.method10767((ClanMate)this.get(var1, 2080887963), -1237213104);
      }
   }

   public FriendsChatRank getMyRank() {
      return FriendsChatRank.valueOf(this.method10574());
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("zm")
   public int method10574() {
      return this.rank * -44662875;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   public final void method10568() {
      for (int var1 = 0; var1 < UserList.method10669(this, -2135430906); var1++) {
         ClanMate.method10767((ClanMate)this.get(var1, 304904260), -1237213104);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lta;Ljava/lang/String;)V")
   @ObfuscatedName("wy")
   public static void method10549(FriendsChat var0, String var1) {
      if (var0 == null) {
         var0.method10552(var1);
      }

      String var3 = class27.base37DecodeLong(VarbitComposition.method4892(var1, 16711680));
      if (var3 == null) {
         var3 = "";
      }

      var0.name = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lta;Lxa;)V")
   @ObfuscatedName("ed")
   public static void method10560(FriendsChat var0, Buffer var1) {
      if (var0 == null) {
         var0.method10561(var1);
      }

      Username var2 = new Username(var1.readStringCp1252NullCircumfixed(-273794156), var0.loginType);
      int var3 = Buffer.method12008(var1, (byte)5);
      byte var4 = Buffer.method12001(var1, (byte)60);
      boolean var5 = false;
      if (var4 == -45829181) {
         var5 = true;
      }

      if (var5) {
         if (UserList.method10669(var0, -885101081) == 0) {
            return;
         }

         ClanMate var6 = (ClanMate)var0.getByCurrentUsername(var2, 862907097);
         if (var6 != null && var6.getWorld(-346416883) == var3) {
            UserList.method10695(var0, var6, -1686097060);
         }
      } else {
         var1.readStringCp1252NullCircumfixed(-1576236113);
         ClanMate var7 = (ClanMate)var0.getByCurrentUsername(var2, 862907097);
         if (var7 == null) {
            if (UserList.method10669(var0, 473622759) > var0.capacity * -610830519) {
               return;
            }

            var7 = (ClanMate)var0.addLastNoPreviousUsername(var2, -1888718766);
         }

         var7.set(var3, (var0.field5886 += 2124327147) * -1467841173 - 1, (short)-14220);
         var7.rank = 1986803653 * var4;
         var0.isLocalPlayer(var7, 296292069);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltl;)V")
   @ObfuscatedName("bj")
   final void method10572(ClanMate var1) {
      if (var1.getUsername((byte)-41).equals(this.localUser.username(-909341772))) {
         this.rank = var1.rank * 893932873;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;)V")
   @ObfuscatedName("wl")
   @Override
   public void vmethod351(Username var1, Username var2) {
      FriendsChatMember var3 = (FriendsChatMember)this.method10743(var1);
      if (var3 != null) {
         FriendsChatMemberJoined var4 = new FriendsChatMemberJoined(var3);
         SecureUrlRequester.client.getCallbacks().postDeferred(var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)V")
   @ObfuscatedName("em")
   @Override
   public void vmethod352(User var1) {
      FriendsChatMember var2 = (FriendsChatMember)this.method10743(var1.method10996());
      if (var2 != null) {
         FriendsChatMemberLeft var3 = new FriendsChatMemberLeft(var2);
         SecureUrlRequester.client.getCallbacks().postDeferred(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aa")
   public final void method10561(Buffer var1) {
      Username var2 = new Username(var1.readStringCp1252NullTerminatedOrNull(-273794156), this.loginType);
      int var3 = Buffer.method12008(var1, (byte)5);
      byte var4 = Buffer.method12001(var1, (byte)60);
      boolean var5 = false;
      if (var4 == -45829181) {
         var5 = true;
      }

      if (var5) {
         if (UserList.method10669(this, -885101081) == 0) {
            return;
         }

         ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(var2, 862907097);
         if (var6 != null && var6.getWorld(-346416883) == var3) {
            UserList.method10695(this, var6, -1686097060);
         }
      } else {
         var1.readStringCp1252NullTerminatedOrNull(-1576236113);
         ClanMate var7 = (ClanMate)this.getByCurrentUsername(var2, 862907097);
         if (var7 == null) {
            if (UserList.method10669(this, 473622759) > this.capacity * -610830519) {
               return;
            }

            var7 = (ClanMate)this.getByPreviousUsername(var2, -1888718766);
         }

         var7.set(var3, (this.field5886 += 2124327147) * -1467841173 - 1, (short)-14220);
         var7.rank = 1986803653 * var4;
         this.isLocalPlayer(var7, 296292069);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ad")
   public final void method10556(Buffer var1, int var2) {
      try {
         this.method10550(var1.readCESU8(1881811172), (byte)42);
         long var3 = Buffer.method12018(var1, -2102652448);
         this.method10547(ApproximateRouteStrategy.method382(var3), 922004448);
         this.minKick = Buffer.method12001(var1, (byte)20);
         int var5 = var1.readVarInt(-796232993);
         if (-1 != var5) {
            UserList.method10662(this, -967696484);

            for (int var6 = 0; var6 < var5; var6++) {
               if (var2 == 319833484) {
                  throw new IllegalStateException();
               }

               ClanMate var7 = (ClanMate)this.addLastNoPreviousUsername(
                  new Username(var1.readStringCp1252NullCircumfixed(-1571748972), this.loginType), -1973943379
               );
               int var8 = Buffer.method12008(var1, (byte)5);
               var7.set(var8, (this.field5886 += 1988194161) * -185634415 - 1, (short)3567);
               var7.int2 = Buffer.method12001(var1, (byte)20) * 1986803653;
               var1.readStringCp1252NullTerminatedOrNull(-1234040636);
               this.isLocalPlayer(var7, -1656508477);
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ta.az(" + ')');
      }
   }
}
