import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tl")
public class ClanMate extends Buddy implements FriendsChatMember {
   @ObfuscatedSignature(descriptor = "Ltq;")
   @ObfuscatedName("av")
   TriBool friend = TriBool.TriBool_unknown;
   @ObfuscatedSignature(descriptor = "Ltq;")
   @ObfuscatedName("at")
   TriBool ignored = TriBool.TriBool_unknown;

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ag")
   public final boolean isFriend(byte var1) {
      try {
         if (TriBool.TriBool_unknown == this.friend) {
            method10762(this, 1052128138);
         }

         boolean var10000;
         if (TriBool.TriBool_true == this.friend) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tl.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method10759() {
      this.friend = class320.friendSystem.friendsList.contains(this.username, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aa")
   public final boolean method10769() {
      if (this.ignored == TriBool.TriBool_unknown) {
         this.fillIsIgnored(1926584939);
      }

      return this.ignored == TriBool.TriBool_true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void fillIsIgnored(int var1) {
      try {
         TriBool var10001;
         if (class320.friendSystem.ignoreList.contains(this.username, (byte)0)) {
            if (var1 <= 1841744293) {
               throw new IllegalStateException();
            }

            var10001 = TriBool.TriBool_true;
         } else {
            var10001 = TriBool.TriBool_false;
         }

         this.ignored = var10001;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method10751() {
      this.friend = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method10752() {
      this.friend = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method10753() {
      this.friend = TriBool.TriBool_unknown;
   }

   ClanMate() {
   }

   public FriendsChatRank getRank() {
      return FriendsChatRank.valueOf(this.method10789());
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("an")
   static String method10777(byte var0) {
      try {
         String var10000;
         if (ClientPreferences.method1560(class468.clientPreferences, 1877631384)) {
            if (var0 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = FriendsList.method10586(Login.Login_username, 2097200167);
         } else {
            var10000 = Login.Login_username;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "tl.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   public final boolean method10757() {
      if (TriBool.TriBool_unknown == this.friend) {
         method10762(this, 1235155272);
      }

      return TriBool.TriBool_true == this.friend;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method10764() {
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method10760() {
      this.friend = class320.friendSystem.friendsList.contains(this.username, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   void method10761() {
      this.friend = class320.friendSystem.friendsList.contains(this.username, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method10765() {
      this.ignored = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method10766() {
      this.ignored = TriBool.TriBool_unknown;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltl;)Z")
   @ObfuscatedName("mj")
   public static boolean method10758(ClanMate var0) {
      if (TriBool.TriBool_unknown == var0.friend) {
         method10762(var0, 1398217156);
      }

      return TriBool.TriBool_true == var0.friend;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   public final boolean method10770() {
      if (this.ignored == TriBool.TriBool_unknown) {
         this.fillIsIgnored(2032125725);
      }

      return this.ignored == TriBool.TriBool_true;
   }

   @ObfuscatedSignature(descriptor = "(Ltl;B)V")
   @ObfuscatedName("lf")
   public static void method10754(ClanMate var0, byte var1) {
      if (var0 == null) {
         var0.clearIsFriend(var1);
      } else {
         try {
            var0.friend = TriBool.TriBool_unknown;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "tl.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public final boolean method10771() {
      if (this.ignored == TriBool.TriBool_unknown) {
         this.fillIsIgnored(2027672816);
      }

      return this.ignored == TriBool.TriBool_true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("be")
   public final boolean method10772() {
      if (this.ignored == TriBool.TriBool_unknown) {
         this.fillIsIgnored(2086997219);
      }

      return this.ignored == TriBool.TriBool_true;
   }

   @ObfuscatedSignature(descriptor = "(Ltl;I)V")
   @ObfuscatedName("sd")
   public static void method10767(ClanMate var0, int var1) {
      if (var0 == null) {
         var0.clearIsIgnored(var1);
      } else {
         try {
            var0.ignored = TriBool.TriBool_unknown;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "tl.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method10775() {
      this.ignored = class320.friendSystem.ignoreList.contains(this.username, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method10776() {
      this.ignored = class320.friendSystem.ignoreList.contains(this.username, (byte)0) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("au")
   public final boolean isIgnored(int var1) {
      try {
         if (this.ignored == TriBool.TriBool_unknown) {
            if (var1 != -2012861431) {
               throw new IllegalStateException();
            }

            this.fillIsIgnored(2076154857);
         }

         boolean var10000;
         if (this.ignored == TriBool.TriBool_true) {
            if (var1 != -2012861431) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tl.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   void clearIsFriend(byte var1) {
      try {
         this.friend = TriBool.TriBool_true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tl.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltl;I)V")
   @ObfuscatedName("jh")
   public static void method10762(ClanMate var0, int var1) {
      if (var0 == null) {
         var0.fillIsFriend(var1);
      }

      try {
         TriBool var10001;
         if (class320.friendSystem.friendsList.contains(var0.username, (byte)0)) {
            if (var1 == -2074498098) {
               throw new IllegalStateException();
            }

            var10001 = TriBool.TriBool_true;
         } else {
            var10001 = TriBool.TriBool_false;
         }

         var0.friend = var10001;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tl.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   void clearIsIgnored(int var1) {
      try {
         this.ignored = TriBool.TriBool_unknown;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tl.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   void fillIsFriend(int var1) {
      try {
         TriBool var10001;
         if (class320.friendSystem.friendsList.contains(this.username, (byte)0)) {
            if (var1 == -2074498098) {
               throw new IllegalStateException();
            }

            var10001 = TriBool.TriBool_true;
         } else {
            var10001 = TriBool.TriBool_true;
         }

         this.friend = var10001;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tl.an(" + ')');
      }
   }
}
