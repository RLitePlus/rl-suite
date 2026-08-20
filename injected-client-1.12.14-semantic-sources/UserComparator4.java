import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ev")
public class UserComparator4 implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1712 = 512;
   @ObfuscatedName("av")
   final boolean reversed;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field1714 = 6;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("ko")
   static Archive archive6;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field1715 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field1713 = 1;

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("ak")
   int method3901(Buddy var1, Buddy var2) {
      return this.reversed ? 1577040331 * var1.int2 - 159077760 * var2.int2 : var2.int2 * -529820201 - var1.int2 * -615869720;
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;B)I")
   @ObfuscatedName("av")
   int compare_bridged(Buddy var1, Buddy var2, byte var3) {
      try {
         int var10000;
         if (this.reversed) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = -529820201 * var1.int2 - -529820201 * var2.int2;
         } else {
            var10000 = var2.int2 * -529820201 - var1.int2 * -529820201;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ev.av(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compare_bridged((Buddy)var1, (Buddy)var2, (byte)38);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ev.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method3905(Object var1, Object var2) {
      return this.compare_bridged((Buddy)var1, (Buddy)var2, (byte)94);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method3906(Object var1, Object var2) {
      return this.compare_bridged((Buddy)var1, (Buddy)var2, (byte)35);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method3907(Object var1, Object var2) {
      return this.compare_bridged((Buddy)var1, (Buddy)var2, (byte)116);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lev;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("nc")
   public static int method3908(UserComparator4 var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method3906(var1, var1);
      }

      return var0.compare_bridged((Buddy)var1, (Buddy)var2, (byte)126);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aw")
   int method3903(Buddy var1, Buddy var2) {
      return this.reversed ? -529820201 * var1.int2 - -529820201 * var2.int2 : var2.int2 * -529820201 - var1.int2 * -529820201;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ev.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method3909(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method3910(Object var1) {
      return super.equals(var1);
   }

   public UserComparator4(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aj")
   int method3904(Buddy var1, Buddy var2) {
      return this.reversed ? 1555590904 * var1.int2 - -529820201 * var2.int2 : var2.int2 * 532010792 - var1.int2 * -1799987869;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method3911(Object var1) {
      return super.equals(var1);
   }
}
