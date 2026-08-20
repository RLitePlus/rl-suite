import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xz")
public class UserComparator2 implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field6655 = 1;
   @ObfuscatedName("av")
   final boolean reversed;

   public UserComparator2(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method12760(Object var1) {
      return super.equals(var1);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xz.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method12756(Object var1, Object var2) {
      return method12751(this, (User)var1, (User)var2, 2001367751);
   }

   @ObfuscatedSignature(descriptor = "(Lxz;Ltz;Ltz;I)I")
   @ObfuscatedName("zz")
   public static int method12751(UserComparator2 var0, User var1, User var2, int var3) {
      if (var0 == null) {
         var0.compare_bridged(var1, var1, var3);
      }

      try {
         int var10000;
         if (var0.reversed) {
            if (var3 != 2001367751) {
               throw new IllegalStateException();
            }

            var10000 = var1.getUsername((byte)-82).compareToTyped(var2.getUsername((byte)-83), 2089680880);
         } else {
            var10000 = var2.getUsername((byte)-93).compareToTyped(var1.getUsername((byte)-50), 1829879603);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xz.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method12757(Object var1, Object var2) {
      return method12751(this, (User)var1, (User)var2, 2001367751);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxz;Ltz;Ltz;)I")
   @ObfuscatedName("ka")
   public static int method12752(UserComparator2 var0, User var1, User var2) {
      return var0.reversed
         ? var1.getUsername((byte)-101).compareToTyped(var2.getUsername((byte)-25), -296362268)
         : var2.getUsername((byte)-29).compareToTyped(var1.getUsername((byte)-84), 1571941409);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxz;Ljava/lang/Object;)Z")
   @ObfuscatedName("qb")
   public static boolean method12761(UserComparator2 var0, Object var1) {
      if (var0 == null) {
         var0.method12759(var1, var1);
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method12758(Object var1, Object var2) {
      return method12751(this, (User)var1, (User)var2, 2001367751);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method12759(Object var1, Object var2) {
      return method12751(this, (User)var1, (User)var2, 2001367751);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return method12751(this, (User)var1, (User)var2, 2001367751);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xz.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method12762(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxz;Ltz;Ltz;)I")
   @ObfuscatedName("mv")
   public static int method12753(UserComparator2 var0, User var1, User var2) {
      if (var0 == null) {
         var0.method12754(var1, var1);
      }

      return var0.reversed
         ? var1.getUsername((byte)-78).compareToTyped(var2.getUsername((byte)-89), 1282129174)
         : var2.getUsername((byte)-80).compareToTyped(var1.getUsername((byte)-7), 559258550);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Ltz;)I")
   @ObfuscatedName("ak")
   int method12754(User var1, User var2) {
      return this.reversed
         ? var1.getUsername((byte)-78).compareToTyped(var2.getUsername((byte)-89), 1282129174)
         : var2.getUsername((byte)-80).compareToTyped(var1.getUsername((byte)-7), 559258550);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Ltz;I)I")
   @ObfuscatedName("av")
   int compare_bridged(User var1, User var2, int var3) {
      try {
         int var10000;
         if (this.reversed) {
            if (var3 != 2001367751) {
               throw new IllegalStateException();
            }

            var10000 = var1.getUsername((byte)-82).compareToTyped(var2.getUsername((byte)-83), 2089680880);
         } else {
            var10000 = var2.getUsername((byte)-93).compareToTyped(var1.getUsername((byte)-50), 1829879603);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xz.av(" + 41);
      }
   }
}
