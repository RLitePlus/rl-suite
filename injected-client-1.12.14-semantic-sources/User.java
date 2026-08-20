import net.runelite.api.Nameable;
import net.runelite.api.events.NameableNameChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tz")
public class User implements Comparable, Nameable {
   @ObfuscatedSignature(descriptor = "Lxv;")
   @ObfuscatedName("an")
   Username previousUsername;
   @ToRemove(unused = "true")
   @ObfuscatedName("ed")
   static final int field6004 = 14;
   @ObfuscatedSignature(descriptor = "Lxv;")
   @ObfuscatedName("ag")
   Username username;
   @ToRemove(unused = "true")
   @ObfuscatedName("di")
   static final String field6005 = "jagex.disableBouncyCastle";

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int vmethod381(Object var1) {
      return this.compareTo_user((User)var1, 327716789);
   }

   public String getName() {
      return this.method10996().method12725();
   }

   @ObfuscatedSignature(descriptor = "(B)Lxv;")
   @ObfuscatedName("bs")
   public Username getUsername(byte var1) {
      try {
         return this.username;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tz.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bt")
   public String method10983() {
      return this.username == null ? "" : Username.method12702(this.username, (byte)8);
   }

   @Override
   public int compareTo(Object var1) {
      try {
         return this.compareTo_user((User)var1, 327716789);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tz.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;)V")
   @ObfuscatedName("by")
   void method10990(Username var1, Username var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.username = var1;
         this.previousUsername = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("aj")
   public int vmethod380(Object var1) {
      return this.compareTo_user((User)var1, 327716789);
   }

   @ObfuscatedSignature(descriptor = "()Lxv;")
   @ObfuscatedName("bj")
   public Username method10982() {
      return this.username;
   }

   @ObfuscatedSignature(descriptor = "()Lxv;")
   @ObfuscatedName("mv")
   public Username method10996() {
      return this.username;
   }

   @ObfuscatedSignature(descriptor = "(Ltz;I)Ljava/lang/String;")
   @ObfuscatedName("iv")
   public static String method10986(User var0, int var1) {
      if (var0 == null) {
         return var0.getPreviousName(var1);
      } else {
         try {
            return null == var0.previousUsername ? "" : Username.method12702(var0.previousUsername, (byte)-37);
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "tz.bk(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("aw")
   public int vmethod378(User var1) {
      return this.username.compareToTyped(var1.username, 343765107);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("ap")
   public int vmethod379(User var1) {
      return this.username.compareToTyped(var1.username, 1085485170);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Lxv;Lxv;I)V")
   @ObfuscatedName("zr")
   public static void method10991(User var0, Username var1, Username var2, int var3) {
      if (var0 == null) {
         var0.set(var1, var1, var3);
      }

      try {
         if (null == var1) {
            if (var3 <= 114313019) {
               throw new IllegalStateException();
            } else {
               throw new NullPointerException();
            }
         } else {
            var0.username = var1;
            var0.previousUsername = var2;
            var0.method10995(-1);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tz.bb(" + ')');
      }
   }

   User() {
   }

   public String getPrevName() {
      Username var1 = this.method10997();
      return var1 == null ? null : var1.method12725();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ba")
   public String method10987() {
      return null == this.previousUsername ? "" : Username.method12702(this.previousUsername, (byte)-28);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bu")
   public String method10988() {
      return null == this.previousUsername ? "" : Username.method12702(this.previousUsername, (byte)33);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;I)I")
   @ObfuscatedName("at")
   public int compareTo_user(User var1, int var2) {
      try {
         return this.username.compareToTyped(var1.username, 54746879);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tz.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("ak")
   public int vmethod376(User var1) {
      return this.username.compareToTyped(var1.username, 1803290596);
   }

   @ObfuscatedSignature(descriptor = "()Lxv;")
   @ObfuscatedName("tn")
   public Username method10997() {
      return this.previousUsername;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;)V")
   @ObfuscatedName("bi")
   void method10992(Username var1, Username var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.username = var1;
         this.previousUsername = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ns")
   static final void method10994(int var0, byte var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 127);
         class468.clientPreferences.updateSoundEffectVolume(var0, -1711294572);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tz.ns(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;B)Ljava/lang/String;")
   @ObfuscatedName("ii")
   public static String method10984(User var0, byte var1) {
      if (var0 == null) {
         return var0.getName(var1);
      } else {
         try {
            if (var0.username == null) {
               if (var1 == 3) {
                  throw new IllegalStateException();
               } else {
                  return "";
               }
            } else {
               return Username.method12702(var0.username, (byte)-92);
            }
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "tz.bz(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("bz")
   public String getName(byte var1) {
      try {
         if (this.username == null) {
            if (var1 == 3) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return Username.method12702(this.previousUsername, (byte)-92);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tz.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("xg")
   public void method10995(int var1) {
      NameableNameChanged var2 = new NameableNameChanged(this);
      SecureUrlRequester.client.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bk")
   public String getPreviousName(int var1) {
      try {
         return null == this.username ? "" : Username.method12702(this.username, (byte)-37);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tz.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;I)V")
   @ObfuscatedName("bb")
   void set(Username var1, Username var2, int var3) {
      try {
         if (null == var1) {
            if (var3 <= 114313019) {
               throw new IllegalStateException();
            } else {
               throw new NullPointerException();
            }
         } else {
            this.username = var1;
            this.previousUsername = var2;
            this.method10995(-1);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tz.bb(" + ')');
      }
   }
}
