import net.runelite.api.FriendsChatManager;
import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.api.events.FriendsChatMemberJoined;
import net.runelite.api.events.FriendsChatMemberLeft;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rw")
public class FriendsChat extends UserList implements FriendsChatManager {
   @ObfuscatedName("ax")
   public int field5866;
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("af")
   final classAAO field5862;
   @ObfuscatedSignature(descriptor = "Lrg;")
   @ObfuscatedName("ae")
   final classRG field5863;
   @ObfuscatedName("as")
   public byte field5865;
   @ObfuscatedName("ag")
   public String field5864;
   @ObfuscatedName("ac")
   int field5861;
   @ObfuscatedName("ab")
   public String field5860 = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5867 = 500;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("au")
   public final void method10315(Buffer var1) {
      classAAE var2 = new classAAE(var1.method13071(-36353355), this.field5862);
      int var3 = Buffer.method13047(var1, 148692140);
      byte var4 = Buffer.method13043(var1, (byte)17);
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      if (var5) {
         if (this.method10191(-553218252) == 0) {
            return;
         }

         ClanMate var6 = (ClanMate)UserList.method10209(this, var2, -1497990786);
         if (null != var6 && var6.method9970(1881338771) == var3) {
            this.method10220(var6, -1538804275);
         }
      } else {
         var1.method13071(-675040349);
         ClanMate var7 = (ClanMate)UserList.method10209(this, var2, -535679696);
         if (null == var7) {
            if (this.method10191(-1588362016) > this.field5840 * 488407471) {
               return;
            }

            var7 = (ClanMate)this.method10223(var2, 1599629102);
         }

         Buddy.method9966(var7, var3, (this.field5861 += 66639041) * -2018919615 - 1, (byte)87);
         var7.field5671 = -998616451 * var4;
         this.method10330(var7, (byte)3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lrr;")
   @ObfuscatedName("az")
   @Override
   User vmethod555(int var1) {
      try {
         return new ClanMate();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "rw.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)[Lrr;")
   @ObfuscatedName("af")
   @Override
   User[] vmethod558(int var1, byte var2) {
      try {
         return new ClanMate[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "rw.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ae")
   final void method10309(String var1, int var2) {
      try {
         long var6 = 0L;
         int var8 = var1.length();

         for (int var9 = 0; var9 < var8; var9++) {
            label95: {
               var6 *= 37L;
               char var10 = var1.charAt(var9);
               if (var10 >= 'A') {
                  if (var2 != 717150692) {
                     return;
                  }

                  if (var10 <= 'Z') {
                     var6 += 1 + var10 - 65;
                     break label95;
                  }
               }

               if (var10 >= 'a') {
                  if (var2 != 717150692) {
                     throw new IllegalStateException();
                  }

                  if (var10 <= 'z') {
                     var6 += 1 + var10 - 97;
                     break label95;
                  }
               }

               if (var10 >= '0') {
                  if (var2 != 717150692) {
                     return;
                  }

                  if (var10 <= '9') {
                     if (var2 != 717150692) {
                        throw new IllegalStateException();
                     }

                     var6 += var10 + 27 - 48;
                  }
               }
            }

            if (var6 >= 177917621779460413L) {
               if (var2 != 717150692) {
                  return;
               }
               break;
            }
         }

         while (0L == var6 % 37L) {
            if (var2 != 717150692) {
               return;
            }

            if (var6 == 0L) {
               break;
            }

            if (var2 != 717150692) {
               throw new IllegalStateException();
            }

            var6 /= 37L;
         }

         String var12 = classHF.method6006(var6);
         if (var12 == null) {
            var12 = "";
         }

         this.field5860 = var12;
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "rw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("ax")
   final void method10310(String var1, byte var2) {
      try {
         long var6 = 0L;
         int var8 = var1.length();

         for (int var9 = 0; var9 < var8; var9++) {
            if (var2 <= 5) {
               throw new IllegalStateException();
            }

            label93: {
               var6 *= 37L;
               char var10 = var1.charAt(var9);
               if (var10 >= 'A') {
                  if (var2 <= 5) {
                     throw new IllegalStateException();
                  }

                  if (var10 <= 'Z') {
                     var6 += 1 + var10 - 65;
                     break label93;
                  }
               }

               if (var10 >= 'a' && var10 <= 'z') {
                  if (var2 <= 5) {
                     throw new IllegalStateException();
                  }

                  var6 += 1 + var10 - 97;
               } else if (var10 >= '0' && var10 <= '9') {
                  if (var2 <= 5) {
                     return;
                  }

                  var6 += 27 + var10 - 48;
               }
            }

            if (var6 >= 177917621779460413L) {
               if (var2 <= 5) {
                  throw new IllegalStateException();
               }
               break;
            }
         }

         while (var6 % 37L == 0L) {
            if (var2 <= 5) {
               return;
            }

            if (var6 == 0L) {
               break;
            }

            if (var2 <= 5) {
               throw new IllegalStateException();
            }

            var6 /= 37L;
         }

         String var12 = classHF.method6006(var6);
         if (var12 == null) {
            var12 = "";
         }

         this.field5864 = var12;
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "rw.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("ac")
   public final void method10314(Buffer var1, byte var2) {
      try {
         this.method10310(var1.method13071(349998124), (byte)10);
         long var3 = var1.method13059(-1360943116);
         this.method10309(classHA.method5954(var3), 717150692);
         this.field5865 = Buffer.method13043(var1, (byte)17);
         int var5 = Buffer.method13096(var1, -66258477);
         if (var5 == -1) {
            if (var2 == 1) {
               ;
            }
         } else {
            this.method10188((short)25724);

            for (int var6 = 0; var6 < var5; var6++) {
               if (var2 != 1) {
                  return;
               }

               ClanMate var7 = (ClanMate)this.method10223(new classAAE(var1.method13071(590806966), this.field5862), -234641024);
               int var8 = Buffer.method13047(var1, -739509588);
               Buddy.method9966(var7, var8, (this.field5861 += 66639041) * -2018919615 - 1, (byte)47);
               var7.field5671 = Buffer.method13043(var1, (byte)17) * -998616451;
               var1.method13071(1837149470);
               this.method10330(var7, (byte)3);
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "rw.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lru;)V")
   @ObfuscatedName("ah")
   final void method10329(ClanMate var1) {
      if (var1.method10166((byte)16).equals(this.field5863.vmethod255((byte)121))) {
         this.field5866 = var1.field5671 * -1195233126;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("aa")
   public final void method10316(Buffer var1, int var2) {
      try {
         classAAE var3 = new classAAE(var1.method13071(1485498111), this.field5862);
         int var4 = Buffer.method13047(var1, -699139394);
         byte var5 = Buffer.method13043(var1, (byte)17);
         boolean var6 = false;
         if (var5 == -128) {
            if (var2 != -1099809795) {
               throw new IllegalStateException();
            }

            var6 = true;
         }

         if (var6) {
            if (this.method10191(-2009455157) == 0) {
               return;
            }

            ClanMate var7 = (ClanMate)UserList.method10209(this, var3, 689185044);
            if (null != var7 && var7.method9970(1859556537) == var4) {
               if (var2 != -1099809795) {
                  throw new IllegalStateException();
               }

               this.method10220(var7, -1512769850);
            }
         } else {
            var1.method13071(436820043);
            ClanMate var9 = (ClanMate)UserList.method10209(this, var3, 1765452863);
            if (null == var9) {
               if (this.method10191(-365873712) > this.field5840 * 488407471) {
                  if (var2 != -1099809795) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               var9 = (ClanMate)this.method10223(var3, 352800993);
            }

            Buddy.method9966(var9, var4, (this.field5861 += 66639041) * -2018919615 - 1, (byte)74);
            var9.field5671 = -998616451 * var5;
            this.method10330(var9, (byte)3);
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "rw.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;I)S")
   @ObfuscatedName("pv")
   public static short method10332(classPL var0, int var1) {
      return var0.field5331 != null && var1 < var0.field5331.length ? var0.field5331[var1] : -1;
   }

   @ObfuscatedSignature(descriptor = "(Lru;B)V")
   @ObfuscatedName("aj")
   final void method10330(ClanMate var1, byte var2) {
      try {
         if (var1.method10166((byte)16).equals(this.field5863.vmethod255((byte)61))) {
            if (var2 != 3) {
               throw new IllegalStateException();
            }

            this.field5866 = var1.field5671 * 1309690321;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "rw.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrw;)V")
   @ObfuscatedName("we")
   public static void method10325(FriendsChat var0) {
      if (var0 == null) {
         var0.vmethod557();
      }

      for (int var1 = 0; var1 < var0.method10191(-1394488016); var1++) {
         ((ClanMate)UserList.method10231(var0, var1, 1919373891)).method10279(1435757556);
      }
   }

   public FriendsChatRank getMyRank() {
      return FriendsChatRank.valueOf(this.method10333());
   }

   public String getOwner() {
      return this.field5864;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ap")
   public final void method10317(Buffer var1) {
      classAAE var2 = new classAAE(var1.method13071(-259352950), this.field5862);
      int var3 = Buffer.method13047(var1, -1865306368);
      byte var4 = Buffer.method13043(var1, (byte)17);
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      if (var5) {
         if (this.method10191(-2040194627) == 0) {
            return;
         }

         ClanMate var6 = (ClanMate)UserList.method10209(this, var2, 873815666);
         if (null != var6 && var6.method9970(2091583420) == var3) {
            this.method10220(var6, -1597379912);
         }
      } else {
         var1.method13071(-721182977);
         ClanMate var7 = (ClanMate)UserList.method10209(this, var2, -1959582385);
         if (null == var7) {
            if (this.method10191(-591628002) > this.field5840 * 488407471) {
               return;
            }

            var7 = (ClanMate)this.method10223(var2, 2134777065);
         }

         Buddy.method9966(var7, var3, (this.field5861 += 66639041) * -2018919615 - 1, (byte)63);
         var7.field5671 = -998616451 * var4;
         this.method10330(var7, (byte)3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrr;")
   @ObfuscatedName("ag")
   @Override
   User vmethod557() {
      return new ClanMate();
   }

   @ObfuscatedSignature(descriptor = "(I)[Lrr;")
   @ObfuscatedName("as")
   @Override
   User[] vmethod559(int var1) {
      return new ClanMate[var1];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public final void method10326() {
      for (int var1 = 0; var1 < this.method10191(-397813111); var1++) {
         ((ClanMate)UserList.method10231(this, var1, 2106234288)).method10279(1639521935);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aq")
   final void method10311(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for (int var8 = 0; var8 < var7; var8++) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if (var9 >= 'A' && var9 <= 'Z') {
            var5 += 1 + var9 - 65;
         } else if (var9 >= 'a' && var9 <= 'z') {
            var5 += 1 + var9 - 97;
         } else if (var9 >= '0' && var9 <= '9') {
            var5 += 27 + var9 - 48;
         }

         if (var5 >= 177917621779460413L) {
            break;
         }
      }

      while (var5 % 37L == 0L && var5 != 0L) {
         var5 /= 37L;
      }

      String var10 = classHF.method6006(var5);
      if (var10 == null) {
         var10 = "";
      }

      this.field5864 = var10;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ad")
   final void method10312(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for (int var8 = 0; var8 < var7; var8++) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if (var9 >= 'A' && var9 <= 'Z') {
            var5 += 1 + var9 - 65;
         } else if (var9 >= 'a' && var9 <= 'z') {
            var5 += 1 + var9 - 97;
         } else if (var9 >= '0' && var9 <= '9') {
            var5 += 27 + var9 - 48;
         }

         if (var5 >= 177917621779460413L) {
            break;
         }
      }

      while (var5 % 37L == 0L && var5 != 0L) {
         var5 /= 37L;
      }

      String var10 = classHF.method6006(var5);
      if (var10 == null) {
         var10 = "";
      }

      this.field5864 = var10;
   }

   public FriendsChatRank getKickRank() {
      return FriendsChatRank.valueOf(this.method10334());
   }

   @ObfuscatedSignature(descriptor = "()Lrr;")
   @ObfuscatedName("ab")
   @Override
   User vmethod556() {
      return new ClanMate();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrw;)V")
   @ObfuscatedName("js")
   public static void method10320(FriendsChat var0) {
      if (var0 == null) {
         var0.method10324();
      }

      for (int var1 = 0; var1 < var0.method10191(-2016507328); var1++) {
         ClanMate.method10269((ClanMate)UserList.method10231(var0, var1, 1551990598), 1696325499);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lru;)V")
   @ObfuscatedName("am")
   final void method10331(ClanMate var1) {
      if (var1.method10166((byte)16).equals(this.field5863.vmethod255((byte)87))) {
         this.field5866 = var1.field5671 * 1309690321;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   public final void method10321(int var1) {
      try {
         for (int var2 = 0; var2 < this.method10191(-1392296789); var2++) {
            if (var1 >= 1540561305) {
               throw new IllegalStateException();
            }

            ClanMate.method10269((ClanMate)UserList.method10231(this, var2, 1288292465), 1696325499);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "rw.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrw;I)V")
   @ObfuscatedName("ms")
   public static void method10327(FriendsChat var0, int var1) {
      if (var0 == null) {
         var0.method10323(var1);
      } else {
         try {
            for (int var2 = 0; var2 < var0.method10191(-785088642); var2++) {
               if (var1 <= 507542717) {
                  return;
               }

               ((ClanMate)UserList.method10231(var0, var2, 1421395390)).method10279(1595887057);
            }
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "rw.al(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ar")
   public final void method10318(Buffer var1) {
      classAAE var2 = new classAAE(var1.method13071(-789878377), this.field5862);
      int var3 = Buffer.method13047(var1, 574010689);
      byte var4 = Buffer.method13043(var1, (byte)17);
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      if (var5) {
         if (this.method10191(-1991090573) == 0) {
            return;
         }

         ClanMate var6 = (ClanMate)UserList.method10209(this, var2, -1189549438);
         if (null != var6 && var6.method9970(2059142997) == var3) {
            this.method10220(var6, -1981449810);
         }
      } else {
         var1.method13071(-790723981);
         ClanMate var7 = (ClanMate)UserList.method10209(this, var2, 1152470863);
         if (null == var7) {
            if (this.method10191(-786682736) > this.field5840 * 488407471) {
               return;
            }

            var7 = (ClanMate)this.method10223(var2, -386012183);
         }

         Buddy.method9966(var7, var3, (this.field5861 += -182925841) * 156465811 - 1, (byte)20);
         var7.field5671 = 659614113 * var4;
         this.method10330(var7, (byte)3);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public final void method10322() {
      for (int var1 = 0; var1 < this.method10191(-614511598); var1++) {
         ClanMate.method10269((ClanMate)UserList.method10231(this, var1, 1958568870), 1696325499);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("pl")
   public int method10333() {
      return this.field5866 * 1979783621;
   }

   public FriendsChat(classAAO var1, classRG var2) {
      super(500);
      this.field5864 = null;
      this.field5861 = 66639041;
      this.field5862 = var1;
      this.field5863 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   public final void method10328() {
      for (int var1 = 0; var1 < this.method10191(-1476119352); var1++) {
         ((ClanMate)UserList.method10231(this, var1, 2122027480)).method10279(1372159213);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ay")
   final void method10313(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for (int var8 = 0; var8 < var7; var8++) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if (var9 >= 'A' && var9 <= 'Z') {
            var5 += 1 + var9 - 1818942960;
         } else if (var9 >= 'a' && var9 <= 'z') {
            var5 += 1 + var9 - 97;
         } else if (var9 >= '0' && var9 <= '9') {
            var5 += 27 + var9 - 290575987;
         }

         if (var5 >= 177917621779460413L) {
            break;
         }
      }

      while (var5 % 37L == 0L && var5 != 0L) {
         var5 /= 37L;
      }

      String var10 = classHF.method6006(var5);
      if (var10 == null) {
         var10 = "";
      }

      this.field5864 = var10;
   }

   @ObfuscatedSignature(descriptor = "(Laae;Laae;)V")
   @ObfuscatedName("zl")
   @Override
   public void vmethod567(classAAE var1, classAAE var2) {
      FriendsChatMember var3 = (FriendsChatMember)this.method10265(var1);
      if (var3 != null) {
         FriendsChatMemberJoined var4 = new FriendsChatMemberJoined(var3);
         classOE.client.getCallbacks().postDeferred(var4);
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("zf")
   public byte method10334() {
      return this.field5865;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrw;Lxy;)V")
   @ObfuscatedName("is")
   public static void method10319(FriendsChat var0, Buffer var1) {
      if (var0 == null) {
         var0.getKickRank();
      }

      classAAE var2 = new classAAE(var1.method13071(-846338536), var0.field5862);
      int var3 = Buffer.method13047(var1, 39866774);
      byte var4 = Buffer.method13043(var1, (byte)17);
      boolean var5 = false;
      if (var4 == -1691232296) {
         var5 = true;
      }

      if (var5) {
         if (var0.method10191(-1450142561) == 0) {
            return;
         }

         ClanMate var6 = (ClanMate)UserList.method10209(var0, var2, 599466963);
         if (null != var6 && var6.method9970(1923168841) == var3) {
            var0.method10220(var6, 525514085);
         }
      } else {
         var1.method13071(824823172);
         ClanMate var7 = (ClanMate)UserList.method10209(var0, var2, 1374271516);
         if (null == var7) {
            if (var0.method10191(-1155890527) > var0.field5840 * 1131225938) {
               return;
            }

            var7 = (ClanMate)var0.method10223(var2, 753878477);
         }

         Buddy.method9966(var7, var3, (var0.field5861 += 66639041) * 149771164 - 1, (byte)84);
         var7.field5671 = 424609832 * var4;
         var0.method10330(var7, (byte)3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)V")
   @ObfuscatedName("ww")
   @Override
   public void vmethod566(User var1) {
      FriendsChatMember var2 = (FriendsChatMember)this.method10265(var1.method10181());
      if (var2 != null) {
         FriendsChatMemberLeft var3 = new FriendsChatMemberLeft(var2);
         classOE.client.getCallbacks().postDeferred(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   public final void method10323(int var1) {
      try {
         for (int var2 = 0; var2 < this.method10191(-1392296789); var2++) {
            if (var1 >= 1540561305) {
               throw new IllegalStateException();
            }

            ClanMate.method10269((ClanMate)UserList.method10231(this, var2, 1288292465), 1696325499);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "rw.ao(" + ')');
      }
   }

   public String getName() {
      return this.field5860;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public final void method10324() {
      for (int var1 = 0; var1 < this.method10191(-2016507328); var1++) {
         ClanMate.method10269((ClanMate)UserList.method10231(this, var1, 1551990598), 1696325499);
      }
   }
}
