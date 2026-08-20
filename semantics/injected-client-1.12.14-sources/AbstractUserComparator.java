import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tn")
public abstract class AbstractUserComparator implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5943 = 1020;
   @ObfuscatedName("at")
   Comparator nextComparator;

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;I)V")
   @ObfuscatedName("ap")
   final void addComparator(Comparator var1, int var2) {
      try {
         if (null == this.nextComparator) {
            if (var2 != 1048577) {
               throw new IllegalStateException();
            }

            this.nextComparator = var1;
         } else if (this.nextComparator instanceof AbstractUserComparator) {
            if (var2 != 1048577) {
               throw new IllegalStateException();
            }

            ((AbstractUserComparator)this.nextComparator).addComparator(var1, 1048577);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tn.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltn;Ljava/lang/Object;)Z")
   @ObfuscatedName("ft")
   public static boolean method10794(AbstractUserComparator var0, Object var1) {
      return var0 == null ? var0.method10795(var1) : var0.equals(var1);
   }

   protected AbstractUserComparator() {
   }

   @ObfuscatedSignature(descriptor = "(Ltz;Ltz;B)I")
   @ObfuscatedName("ay")
   protected final int compareUser(User var1, User var2, byte var3) {
      try {
         if (this.nextComparator == null) {
            if (var3 >= 8) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.nextComparator.compare(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tn.ay(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tn.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method10795(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method10796(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljc;Lfy;I[ZZZ)V")
   @ObfuscatedName("vi")
   public static void method10797(Model var0, Skeleton var1, classFY var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      if (var0 == null) {
         var0.method6895(var2, var3);
      }

      class251 var7 = var1.method5403(-510419997);
      if (var7 != null) {
         var7.method6172(var2, var3, var4, var5, 2127690001);
         if (var6) {
            Scene.method5518(var0, var7, var2.method4165((byte)17));
         }
      }

      if (!var5 && var2.method4169((byte)12)) {
         var0.method6856(var2, var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltn;Ljava/util/Comparator;)V")
   @ObfuscatedName("tb")
   public static void method10791(AbstractUserComparator var0, Comparator var1) {
      if (null == var0.nextComparator) {
         var0.nextComparator = var1;
      } else if (var0.nextComparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)var0.nextComparator).addComparator(var1, 1048577);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;)V")
   @ObfuscatedName("az")
   final void method10792(Comparator var1) {
      if (null == this.nextComparator) {
         this.nextComparator = var1;
      } else if (this.nextComparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.nextComparator).addComparator(var1, 1048577);
      }
   }
}
