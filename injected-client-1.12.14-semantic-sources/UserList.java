import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Nameable;
import net.runelite.api.NameableContainer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ti")
public abstract class UserList implements NameableContainer {
   @ObfuscatedSignature(descriptor = "[Ltz;")
   @ObfuscatedName("au")
   User[] array;
   @ObfuscatedName("ap")
   final int capacity;
   @ObfuscatedName("ad")
   HashMap previousUsernamesMap;
   @ObfuscatedName("az")
   HashMap usernamesMap;
   @ObfuscatedName("ay")
   int size = 0;
   @ObfuscatedName("ai")
   Comparator comparator = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field5931 = 1;

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;)Ltz;")
   @ObfuscatedName("dz")
   User method10700(Username var1, Username var2) {
      if (this.getByCurrentUsername(var1, 862907097) != null) {
         throw new IllegalStateException();
      } else {
         User var3 = this.newInstance(2069419014);
         User.method10991(var3, var1, var2, 710602227);
         this.arrayAddLast(var3, 1883367111);
         this.mapPut(var3, 1628183816);
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;)V")
   @ObfuscatedName("wl")
   public void vmethod351(Username var1, Username var2) {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   public int method10667() {
      return this.size * 733862689;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;B)Z")
   @ObfuscatedName("ba")
   public boolean contains(Username var1, byte var2) {
      try {
         if (!var1.hasCleanName(-698146178)) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (this.usernamesMap.containsKey(var1)) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.previousUsernamesMap.containsKey(var1);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;I)Ltz;")
   @ObfuscatedName("by")
   User getByCurrentUsername(Username var1, int var2) {
      try {
         if (!var1.hasCleanName(-698146178)) {
            if (var2 != 862907097) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (User)this.usernamesMap.get(var1);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;B)Z")
   @ObfuscatedName("bf")
   public final boolean removeByUsername(Username var1, byte var2) {
      try {
         User var3 = this.getByCurrentUsername(var1, 862907097);
         if (var3 == null) {
            if (var2 != 8) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            method10695(this, var3, -1246147203);
            return true;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ti.bf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;I)Ltz;")
   @ObfuscatedName("bd")
   User addLastNoPreviousUsername(Username var1, int var2) {
      try {
         return this.addLast(var1, null, -1142342067);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.bd(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Lxv;)Z")
   @ObfuscatedName("uo")
   public static boolean method10676(UserList var0, Username var1) {
      if (var0 == null) {
         var0.method10711();
      }

      if (!var1.hasCleanName(-698146178)) {
         return false;
      } else {
         return var0.usernamesMap.containsKey(var1) ? true : var0.previousUsernamesMap.containsKey(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ltz;")
   @ObfuscatedName("bh")
   public final User get(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < this.size * 733862689) {
               return this.array[var1];
            }

            if (var2 == 69206018) {
               throw new IllegalStateException();
            }
         }

         throw new ArrayIndexOutOfBoundsException(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bl")
   public final void sort(byte var1) {
      try {
         if (this.comparator == null) {
            Arrays.sort(this.array, 0, this.size * 733862689);
         } else {
            Arrays.sort(this.array, 0, 733862689 * this.size, this.comparator);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ti.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;)V")
   @ObfuscatedName("km")
   public void method10740(Username var1, Username var2) {
   }

   @ObfuscatedSignature(descriptor = "(Ltz;B)V")
   @ObfuscatedName("bx")
   final void mapRemove(User var1, byte var2) {
      try {
         if (this.usernamesMap.remove(var1.username) == null) {
            if (var2 == 0) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            if (null != var1.previousUsername) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               this.previousUsernamesMap.remove(var1.previousUsername);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.bx(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Ltz;Lxv;Lxv;)V")
   @ObfuscatedName("do")
   public static void method10713(UserList var0, User var1, Username var2, Username var3) {
      if (var0 == null) {
         var0.method10663();
      }

      var0.mapRemove(var1, (byte)-94);
      User.method10991(var1, var2, var3, 576599881);
      var0.mapPut(var1, 1097596477);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;)Z")
   @ObfuscatedName("qe")
   public static boolean method10672(UserList var0) {
      return -610830519 * var0.capacity == var0.size * 733862689;
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)V")
   @ObfuscatedName("em")
   public void vmethod352(User var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ltz;I)V")
   @ObfuscatedName("bv")
   final void arrayAddLast(User var1, int var2) {
      try {
         this.array[(this.size += -1367512863) * 733862689 - 1] = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;I)V")
   @ObfuscatedName("ch")
   final void mapPut(User var1, int var2) {
      try {
         this.usernamesMap.put(var1.username, var1);
         if (var1.previousUsername != null) {
            User var3 = this.previousUsernamesMap.put(var1.previousUsername, var1);
            if (null != var3 && var1 != var3) {
               if (var2 == -1165107921) {
                  throw new IllegalStateException();
               }

               var3.previousUsername = null;
               var3.method10995(-1);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ti.ch(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lti;I)V")
   @ObfuscatedName("is")
   public static void method10662(UserList var0, int var1) {
      if (var0 == null) {
         var0.clear(var1);
      }

      try {
         var0.size = 0;
         Arrays.fill(var0.array, null);
         var0.usernamesMap.clear();
         var0.previousUsernamesMap.clear();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ti.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ltz;")
   @ObfuscatedName("xr")
   public User[] method10742() {
      return this.array;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   public void method10663() {
      this.size = 0;
      Arrays.fill(this.array, null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedSignature(descriptor = "(I)Ltz;")
   @ObfuscatedName("av")
   abstract User newInstance(int var1);

   @ObfuscatedSignature(descriptor = "(II)[Ltz;")
   @ObfuscatedName("at")
   abstract User[] newTypedArray(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("cu")
   public final void removeComparator(byte var1) {
      try {
         this.comparator = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ti.cu(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Ltz;)V")
   @ObfuscatedName("vj")
   public static void method10728(UserList var0, User var1) {
      var0.usernamesMap.put(var1.username, var1);
      if (var1.previousUsername != null) {
         User var2 = var0.previousUsernamesMap.put(var1.previousUsername, var1);
         if (null != var2 && var1 != var2) {
            var2.previousUsername = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eq")
   public final void method10733() {
      this.comparator = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cp")
   public boolean method10673() {
      return -610830519 * this.capacity == this.size * 733862689;
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("ae")
   abstract User vmethod345();

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("aj")
   abstract User vmethod344();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Ltz;Lxv;Lxv;)V")
   @ObfuscatedName("hd")
   public static void method10714(UserList var0, User var1, Username var2, Username var3) {
      if (var0 == null) {
         var0.method10742();
      }

      var0.mapRemove(var1, (byte)51);
      User.method10991(var1, var2, var3, 1250377550);
      var0.mapPut(var1, 1182179539);
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ap")
   abstract User[] vmethod347(int var1);

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ay")
   abstract User[] vmethod348(int var1);

   @ObfuscatedSignature(descriptor = "(Lxv;I)Ltz;")
   @ObfuscatedName("bw")
   User getByPreviousUsername(Username var1, int var2) {
      try {
         return !var1.hasCleanName(-698146178) ? null : (User)this.previousUsernamesMap.get(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.bw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ak")
   abstract User[] vmethod350(int var1);

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("do")
   final int method10718(User var1) {
      for (int var2 = 0; var2 < 1323985602 * this.size; var2++) {
         if (this.array[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   public void method10664() {
      this.size = 0;
      Arrays.fill(this.array, null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("cq")
   User method10682(Username var1) {
      return !var1.hasCleanName(-698146178) ? null : (User)this.usernamesMap.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Lxv;Lxv;)Ltz;")
   @ObfuscatedName("ou")
   public static User method10701(UserList var0, Username var1, Username var2) {
      if (var0 == null) {
         var0.method10670();
      }

      if (var0.getByCurrentUsername(var1, 862907097) != null) {
         throw new IllegalStateException();
      } else {
         User var3 = var0.newInstance(2038944975);
         User.method10991(var3, var1, var2, 395400579);
         var0.arrayAddLast(var3, 1430729369);
         var0.mapPut(var3, -888185123);
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("cv")
   User method10683(Username var1) {
      return !var1.hasCleanName(-698146178) ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lti;Ljava/util/Comparator;B)V")
   @ObfuscatedName("tr")
   public static void method10734(UserList var0, Comparator var1, byte var2) {
      if (var0 == null) {
         var0.addComparator(var1, var2);
      }

      try {
         if (null == var0.comparator) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var0.comparator = var1;
         } else if (var0.comparator instanceof AbstractUserComparator) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            ((AbstractUserComparator)var0.comparator).addComparator(var1, 1048577);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.ct(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bu")
   public boolean isFull(byte var1) {
      try {
         return -610830519 * this.capacity == this.size * 733862689;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ti.bu(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;I)Ltz;")
   @ObfuscatedName("em")
   public static User method10705(UserList var0, int var1) {
      if (var0 == null) {
         var0.clear(var1);
      }

      if (var1 >= 0 && var1 < var0.size * -764862218) {
         return var0.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public Nameable[] getMembers() {
      User[] var1 = this.method10742();
      int var2 = this.getCount();
      return Arrays.copyOf(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)V")
   @ObfuscatedName("dn")
   final void method10725(User var1) {
      this.array[(this.size += -1367512863) * 733862689 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("cd")
   public boolean method10677(Username var1) {
      if (!var1.hasCleanName(-698146178)) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   public int getCount() {
      return this.size * 733862689;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("dd")
   public final boolean method10689(Username var1) {
      User var2 = this.getByCurrentUsername(var1, 862907097);
      if (var2 == null) {
         return false;
      } else {
         method10695(this, var2, -1615517047);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("ci")
   public User method10678(Username var1) {
      User var2 = this.getByCurrentUsername(var1, 862907097);
      return null != var2 ? var2 : this.getByPreviousUsername(var1, -386799897);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("cy")
   User method10684(Username var1) {
      return !var1.hasCleanName(-698146178) ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("an")
   abstract User vmethod343();

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("de")
   final int method10719(User var1) {
      for (int var2 = 0; var2 < -1135741698 * this.size; var2++) {
         if (this.array[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("cr")
   User method10686(Username var1) {
      return !var1.hasCleanName(-698146178) ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("dw")
   public final boolean method10690(Username var1) {
      User var2 = this.getByCurrentUsername(var1, 862907097);
      if (var2 == null) {
         return false;
      } else {
         method10695(this, var2, -1378513221);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ck")
   public void method10665() {
      this.size = 0;
      Arrays.fill(this.array, null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cx")
   public int method10668() {
      return this.size * 733862689;
   }

   @ObfuscatedSignature(descriptor = "(Lti;I)I")
   @ObfuscatedName("mb")
   public static int method10669(UserList var0, int var1) {
      if (var0 == null) {
         var0.getSize(var1);
      }

      try {
         return var0.size * 733862689;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ti.bt(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("cj")
   User method10687(Username var1) {
      return !var1.hasCleanName(-698146178) ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Ltz;)V")
   @ObfuscatedName("hk")
   public static void method10693(UserList var0, User var1) {
      if (var0 == null) {
         var0.method10711();
      } else {
         int var2 = method10720(var0, var1, (byte)120);
         if (var2 != -1) {
            var0.arrayRemove(var2, 1071929543);
            var0.mapRemove(var1, (byte)37);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)V")
   @ObfuscatedName("dv")
   final void method10694(User var1) {
      int var2 = method10720(this, var1, (byte)91);
      if (var2 != -1) {
         this.arrayRemove(var2, 899962021);
         this.mapRemove(var1, (byte)-57);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Lxv;Lxv;I)V")
   @ObfuscatedName("bc")
   final void changeName(User var1, Username var2, Username var3, int var4) {
      try {
         this.mapRemove(var1, (byte)-59);
         User.method10991(var1, var2, var3, 865496014);
         this.mapPut(var1, 1404204487);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ti.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("dc")
   User method10698(Username var1) {
      return this.addLast(var1, null, -1142342067);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("db")
   User method10699(Username var1) {
      return this.addLast(var1, null, -1142342067);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Lxv;Lxv;)V")
   @ObfuscatedName("dm")
   final void method10716(User var1, Username var2, Username var3) {
      this.mapRemove(var1, (byte)-114);
      User.method10991(var1, var2, var3, 1749045330);
      this.mapPut(var1, 400902318);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;I)Ltz;")
   @ObfuscatedName("br")
   User addLast(Username var1, Username var2, int var3) {
      try {
         if (this.getByCurrentUsername(var1, 862907097) != null) {
            throw new IllegalStateException();
         } else {
            User var4 = this.newInstance(2051919340);
            User.method10991(var4, var1, var2, 766649354);
            this.arrayAddLast(var4, 834110304);
            this.mapPut(var4, -148373805);
            GrandExchangeOfferTotalQuantityComparator.method9194(this, var1, var2);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ti.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;)Ltz;")
   @ObfuscatedName("di")
   User method10703(Username var1, Username var2) {
      if (this.getByCurrentUsername(var1, 862907097) != null) {
         throw new IllegalStateException();
      } else {
         User var3 = this.newInstance(2042803917);
         User.method10991(var3, var1, var2, 1791388111);
         this.arrayAddLast(var3, 1824635566);
         this.mapPut(var3, -1939436086);
         return var3;
      }
   }

   UserList(int var1) {
      this.capacity = var1 * -1740428551;
      this.array = this.newTypedArray(var1, -1205369208);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   @ObfuscatedSignature(descriptor = "(I)Ltz;")
   @ObfuscatedName("dr")
   public final User method10706(int var1) {
      if (var1 >= 0 && var1 < this.size * 733862689) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dx")
   public final void method10710() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size * 733862689);
      } else {
         Arrays.sort(this.array, 0, 733862689 * this.size, this.comparator);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;I)Ltz;")
   @ObfuscatedName("iy")
   public static User method10707(UserList var0, int var1) {
      if (var0 == null) {
         var0.method10667();
      }

      if (var1 >= 0 && var1 < var0.size * 733862689) {
         return var0.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dq")
   public final void method10711() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size * 733862689);
      } else {
         Arrays.sort(this.array, 0, 733862689 * this.size, this.comparator);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("du")
   public final void method10712() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size * 1150782100);
      } else {
         Arrays.sort(this.array, 0, 1433883123 * this.size, this.comparator);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Lxv;Lxv;)V")
   @ObfuscatedName("ds")
   final void method10717(User var1, Username var2, Username var3) {
      this.mapRemove(var1, (byte)-84);
      User.method10991(var1, var2, var3, 1857630072);
      this.mapPut(var1, 1390830117);
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("aw")
   abstract User[] vmethod349(int var1);

   @ObfuscatedSignature(descriptor = "(Lti;Ltz;B)I")
   @ObfuscatedName("fs")
   public static int method10720(UserList var0, User var1, byte var2) {
      if (var0 == null) {
         var0.indexOf(var1, var2);
      }

      try {
         for (int var3 = 0; var3 < 733862689 * var0.size; var3++) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            if (var0.array[var3] == var1) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ti.bq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ce")
   final void arrayRemove(int var1, int var2) {
      try {
         this.size -= -1367512863;
         if (var1 < this.size * 733862689) {
            if (var2 <= 81622619) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.array, 1 + var1, this.array, var1, this.size * 733862689 - var1);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.ce(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Ltz;")
   @ObfuscatedName("lp")
   public User method10743(Username var1) {
      return this.getByCurrentUsername(var1, 862907097);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("cl")
   public final boolean method10691(Username var1) {
      User var2 = this.getByCurrentUsername(var1, 862907097);
      if (var2 == null) {
         return false;
      } else {
         method10695(this, var2, -2078439678);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)V")
   @ObfuscatedName("ec")
   final void method10729(User var1) {
      this.usernamesMap.put(var1.username, var1);
      if (var1.previousUsername != null) {
         User var2 = this.previousUsernamesMap.put(var1.previousUsername, var1);
         if (null != var2 && var1 != var2) {
            var2.previousUsername = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)Z")
   @ObfuscatedName("ze")
   public boolean method10744(Username var1) {
      return this.contains(var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)V")
   @ObfuscatedName("ea")
   final void method10730(User var1) {
      this.usernamesMap.put(var1.username, var1);
      if (var1.previousUsername != null) {
         User var2 = this.previousUsernamesMap.put(var1.previousUsername, var1);
         if (null != var2 && var1 != var2) {
            var2.previousUsername = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("co")
   public int method10670() {
      return this.size * 733862689;
   }

   @ObfuscatedSignature(descriptor = "(Lti;Ltz;I)V")
   @ObfuscatedName("gy")
   public static void method10695(UserList var0, User var1, int var2) {
      if (var0 == null) {
         var0.remove(var1, var2);
      } else {
         var0.method10741(var1);

         try {
            int var3 = method10720(var0, var1, (byte)79);
            if (var3 == -1) {
               if (var2 == 1895673080) {
                  throw new IllegalStateException();
               }
            } else {
               var0.arrayRemove(var3, 640350549);
               var0.mapRemove(var1, (byte)4);
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "ti.bn(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;)V")
   @ObfuscatedName("er")
   public final void method10735(Comparator var1) {
      if (null == this.comparator) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1, 1048577);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;)V")
   @ObfuscatedName("ek")
   public final void method10736(Comparator var1) {
      if (null == this.comparator) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1, 1048577);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;)V")
   @ObfuscatedName("ef")
   public final void method10737(Comparator var1) {
      if (null == this.comparator) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1, 1048577);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;I)V")
   @ObfuscatedName("jr")
   static final void method10739(WorldView var0, int var1) {
      try {
         for (GraphicsObject var2 = (GraphicsObject)var0.graphicsObjects.last(); var2 != null; var2 = (GraphicsObject)var0.graphicsObjects.previous()) {
            if (var1 >= 1677885393) {
               return;
            }

            if (var2.plane * 423981473 == var0.plane * 2115028565) {
               if (var1 >= 1677885393) {
                  throw new IllegalStateException();
               }

               if (!GraphicsObject.method672(var2, 2001675472)) {
                  if (1759706017 * client.cycle >= 51530303 * var2.cycleStart) {
                     if (var1 >= 1677885393) {
                        throw new IllegalStateException();
                     }

                     var2.advance(client.graphicsCycle * -1533995753, -648834334);
                     if (GraphicsObject.method672(var2, -2028743016)) {
                        if (var1 >= 1677885393) {
                           throw new IllegalStateException();
                        }

                        var2.remove();
                     } else {
                        var0.scene.method5503(var2.plane * 423981473, -1678897417 * var2.x, 297135035 * var2.y, 480104681 * var2.z, 60, var2, 0, -1L, false);
                     }
                  }
                  continue;
               }

               if (var1 >= 1677885393) {
                  throw new IllegalStateException();
               }
            }

            var2.remove();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.jr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bp")
   public void clear(int var1) {
      try {
         this.size = 0;
         Arrays.fill(this.array, null);
         this.previousUsernamesMap.clear();
         this.usernamesMap.clear();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ti.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)V")
   @ObfuscatedName("xd")
   public void method10741(User var1) {
      this.vmethod352(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Lxv;)Z")
   @ObfuscatedName("gw")
   public static boolean method10692(UserList var0, Username var1) {
      if (var0 == null) {
         var0.getCount();
      }

      User var2 = var0.getByCurrentUsername(var1, 862907097);
      if (var2 == null) {
         return false;
      } else {
         method10695(var0, var2, -2082143411);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;B)Ltz;")
   @ObfuscatedName("bi")
   public User getByUsername(Username var1, byte var2) {
      try {
         User var3 = this.getByCurrentUsername(var1, 862907097);
         return null != var3 ? var3 : this.getByPreviousUsername(var1, -386799897);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ti.bi(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Ltz;)V")
   @ObfuscatedName("ja")
   public static void method10723(UserList var0, User var1) {
      if (var0.usernamesMap.remove(var1.username) == null) {
         throw new IllegalStateException();
      } else {
         if (null != var1.previousUsername) {
            var0.previousUsernamesMap.remove(var1.previousUsername);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bt")
   public int getSize(int var1) {
      try {
         return this.size * 733862689;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ti.bt(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Ltz;)V")
   @ObfuscatedName("sx")
   public static void method10696(UserList var0, User var1) {
      if (var0 == null) {
         var0.method10718(var1);
      }

      int var2 = method10720(var0, var1, (byte)124);
      if (var2 != -1) {
         var0.arrayRemove(var2, 385562785);
         var0.mapRemove(var1, (byte)-99);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;B)I")
   @ObfuscatedName("bq")
   final int indexOf(User var1, byte var2) {
      try {
         for (int var3 = 0; var3 < 733862689 * this.size; var3++) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            if (this.array[var3] == var1) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ti.bq(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;I)Ltz;")
   @ObfuscatedName("xx")
   public static User method10708(UserList var0, int var1) {
      if (var0 == null) {
         var0.method10742();
      }

      if (var1 >= 0 && var1 < var0.size * 733862689) {
         return var0.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lti;Lxv;B)Ltz;")
   @ObfuscatedName("ub")
   public static User method10680(UserList var0, Username var1, byte var2) {
      if (var0 == null) {
         return var0.getByUsername(var1, var2);
      } else {
         try {
            User var3 = var0.getByCurrentUsername(var1, 862907097);
            return null != var3 ? var3 : var0.getByPreviousUsername(var1, -386799897);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "ti.bi(" + ')');
         }
      }
   }

   public int getSize() {
      return this.capacity * -610830519;
   }

   public Nameable findByName(String var1) {
      return this.method10743(new Username(var1, LoginScreenAnimation.loginType));
   }

   @ObfuscatedSignature(descriptor = "(Ltz;I)V")
   @ObfuscatedName("bn")
   final void remove(User var1, int var2) {
      try {
         this.array[(this.size += -1367512863) * 733862689 - 1] = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;B)V")
   @ObfuscatedName("ct")
   public final void addComparator(Comparator var1, byte var2) {
      try {
         if (null == this.comparator) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            this.comparator = var1;
         } else if (this.comparator instanceof AbstractUserComparator) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            ((AbstractUserComparator)this.comparator).addComparator(var1, 1048577);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ti.ct(" + ')');
      }
   }
}
