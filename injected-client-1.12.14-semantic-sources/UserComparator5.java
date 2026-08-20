import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eo")
public class UserComparator5 extends AbstractUserComparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field1624 = 31;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1625 = 64;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final String field1626 = "";
   @ObfuscatedSignature(descriptor = "Lsu;")
   @ObfuscatedName("fe")
   static Font fontPlain12;
   @ObfuscatedName("av")
   final boolean reversed;

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;I)I")
   @ObfuscatedName("av")
   int compareBuddy(Buddy var1, Buddy var2, int var3) {
      try {
         if (1914416777 * var1.world != 0) {
            if (var3 != -761932170) {
               throw new IllegalStateException();
            }

            if (0 == 1914416777 * var2.world) {
               if (var3 != -761932170) {
                  throw new IllegalStateException();
               }

               byte var10000;
               if (this.reversed) {
                  if (var3 != -761932170) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if (var2.world * 1914416777 != 0) {
            if (var3 != -761932170) {
               throw new IllegalStateException();
            }

            byte var5;
            if (this.reversed) {
               if (var3 != -761932170) {
                  throw new IllegalStateException();
               }

               var5 = 1;
            } else {
               var5 = -1;
            }

            return var5;
         }

         return this.compareUser(var1, var2, (byte)-11);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "eo.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aj")
   int method3796(Buddy var1, Buddy var2) {
      if (1215686913 * var1.world != 0) {
         if (0 == 1914416777 * var2.world) {
            return this.reversed ? -1 : 1;
         }
      } else if (var2.world * 1914416777 != 0) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2, (byte)-49);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method3798(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -761932170);
   }

   public UserComparator5(boolean var1) {
      this.reversed = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leo;Ltm;Ltm;)I")
   @ObfuscatedName("cg")
   public static int method3797(UserComparator5 var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         var0.method3796(var1, var1);
      }

      if (1914416777 * var1.world != 0) {
         if (0 == 1914416777 * var2.world) {
            return var0.reversed ? -1 : 1;
         }
      } else if (var2.world * -218492981 != 0) {
         return var0.reversed ? 1 : -1;
      }

      return var0.compareUser(var1, var2, (byte)-94);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compareBuddy((Buddy)var1, (Buddy)var2, -761932170);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "eo.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method3799(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -761932170);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method3800(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -761932170);
   }
}
