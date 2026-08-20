import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ez")
public class UserComparator8 extends AbstractUserComparator {
   @ObfuscatedName("av")
   final boolean reversed;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("au")
   static final int method3943(int var0) {
      try {
         return 770621097 * ViewportMouse.ViewportMouse_x;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ez.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;I)I")
   @ObfuscatedName("av")
   int compareBuddy(Buddy var1, Buddy var2, int var3) {
      try {
         if (client.worldId * 1312022025 == var1.world * 1914416777) {
            if (var3 >= 1413363659) {
               throw new IllegalStateException();
            }

            if (var2.world * 1914416777 != 1312022025 * client.worldId) {
               if (var3 >= 1413363659) {
                  throw new IllegalStateException();
               }

               byte var10000;
               if (this.reversed) {
                  if (var3 >= 1413363659) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if (1914416777 * var2.world == client.worldId * 1312022025) {
            if (var3 >= 1413363659) {
               throw new IllegalStateException();
            }

            return this.reversed ? 1 : -1;
         }

         return this.compareUser(var1, var2, (byte)-37);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ez.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Ltm;Ltm;)I")
   @ObfuscatedName("pp")
   public static int method3937(UserComparator8 var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         var0.method3939(var1, var1);
      }

      if (client.worldId * 1312022025 == var1.world * 1914416777) {
         if (var2.world * 1640104487 != 1598379145 * client.worldId) {
            return var0.reversed ? -1 : 1;
         }
      } else if (670234653 * var2.world == client.worldId * 1312022025) {
         return var0.reversed ? 1 : -1;
      }

      return var0.compareUser(var1, var2, (byte)-14);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compareBuddy((Buddy)var1, (Buddy)var2, 614914088);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ez.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method3940(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1056628976);
   }

   public UserComparator8(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method3941(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -720265426);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("ak")
   int method3938(Buddy var1, Buddy var2) {
      if (client.worldId * 1312022025 == var1.world * 1914416777) {
         if (var2.world * 1914416777 != 1312022025 * client.worldId) {
            return this.reversed ? -1 : 1;
         }
      } else if (1914416777 * var2.world == client.worldId * 1312022025) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2, (byte)-57);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aw")
   int method3939(Buddy var1, Buddy var2) {
      if (client.worldId * 1312022025 == var1.world * 1914416777) {
         if (var2.world * 925685556 != 1004587649 * client.worldId) {
            return this.reversed ? -1 : 1;
         }
      } else if (-236833147 * var2.world == client.worldId * 1312022025) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2, (byte)-96);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method3942(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1436160199);
   }
}
