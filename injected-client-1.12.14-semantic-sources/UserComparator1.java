import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xd")
public class UserComparator1 implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6483 = 475000;
   @ObfuscatedName("av")
   final boolean reversed;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("an")
   public static AbstractArchive field6484;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method12249(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Ltz;I)I")
   @ObfuscatedName("av")
   int compare_bridged(User var1, User var2, int var3) {
      try {
         int var10000;
         if (this.reversed) {
            if (var3 >= -1595015587) {
               throw new IllegalStateException();
            }

            var10000 = var1.compareTo_user(var2, 327716789);
         } else {
            var10000 = var2.compareTo_user(var1, 327716789);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xd.av(" + 41);
      }
   }

   public UserComparator1(boolean var1) {
      this.reversed = var1;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xd.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxd;Ljava/lang/Object;)Z")
   @ObfuscatedName("ho")
   public static boolean method12250(UserComparator1 var0, Object var1) {
      if (var0 == null) {
         var0.method12247(var1, var1);
      }

      return var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method12245(Object var1, Object var2) {
      return this.compare_bridged((User)var1, (User)var2, -1815858926);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method12246(Object var1, Object var2) {
      return this.compare_bridged((User)var1, (User)var2, -1799996036);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method12247(Object var1, Object var2) {
      return this.compare_bridged((User)var1, (User)var2, -1786070804);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;)V")
   @ObfuscatedName("dd")
   public static void method12252(ObjectSound var0) {
      if (var0.stream2 != null) {
         class50.pcmStreamMixer.removeSubStream(var0.stream2);
         var0.stream2 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method12248(Object var1, Object var2) {
      return this.compare_bridged((User)var1, (User)var2, -2023870423);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compare_bridged((User)var1, (User)var2, -1902833125);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xd.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method12251(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Ltz;)I")
   @ObfuscatedName("aj")
   int method12243(User var1, User var2) {
      return this.reversed ? var1.compareTo_user(var2, 327716789) : var2.compareTo_user(var1, 327716789);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Ltz;)I")
   @ObfuscatedName("ak")
   int method12244(User var1, User var2) {
      return this.reversed ? var1.compareTo_user(var2, 327716789) : var2.compareTo_user(var1, 327716789);
   }
}
