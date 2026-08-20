import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jy")
public class classJY {
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field3494 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field3495 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field3497 = 35;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field3496 = 1;
   @ObfuscatedName("mg")
   static int field3500;
   @ToRemove(unused = "true")
   @ObfuscatedName("bv")
   static final int field3498 = 1003;
   @ToRemove(unused = "true")
   @ObfuscatedName("cd")
   public static final int field3499 = 81;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field3493 = 3;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Laae;)Lrr;")
   @ObfuscatedName("fb")
   public static User method6420(UserList var0, classAAE var1) {
      return var0 == null ? var0.method10213(var1) : var0.method10226(var1, null, (byte)-99);
   }

   classJY() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfp;)I")
   @ObfuscatedName("zt")
   public static int method6419(AABB var0) {
      return 1450116013 * var0.field2365 + var0.field2366 * -1027280203;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;B)Lte;")
   @ObfuscatedName("ab")
   static classTE method6421(int var0, Object var1, byte var2) {
      try {
         classTE var3 = (classTE)var1;
         if (var3 == null) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "jy.ab(" + ')');
      }
   }
}
