import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aap")
public class AccountType implements classXZ {
   @ObfuscatedSignature(descriptor = "Laap;")
   @ObfuscatedName("as")
   static final AccountType field89 = new AccountType(4, 8);
   @ObfuscatedSignature(descriptor = "Laap;")
   @ObfuscatedName("af")
   public static final AccountType jagexType = new AccountType(0, 2);
   @ObfuscatedSignature(descriptor = "Laap;")
   @ObfuscatedName("ae")
   static final AccountType field90 = new AccountType(3, 5);
   @ObfuscatedName("ac")
   final int field94;
   @ObfuscatedSignature(descriptor = "Laap;")
   @ObfuscatedName("ag")
   static final AccountType field91 = new AccountType(5, 7);
   @ObfuscatedSignature(descriptor = "Laap;")
   @ObfuscatedName("az")
   public static final AccountType legacyType = new AccountType(1, 0);
   @ObfuscatedName("ax")
   final int field95;
   @ObfuscatedSignature(descriptor = "Laap;")
   @ObfuscatedName("ab")
   static final AccountType field93 = new AccountType(2, 6);

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   public boolean method230() {
      return jagexType == this;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method231() {
      return jagexType == this;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return -414855871 * this.field94;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aap.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)Z")
   @ObfuscatedName("kg")
   public static boolean method229(classAU var0) {
      return var0 == null ? var0.method698() : null == var0.field280;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;I)Laay;")
   @ObfuscatedName("hd")
   public static classAAY method234(classZD var0, int var1) {
      return (classAAY)var0.field7158.get(var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return -229961136 * this.field94;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return -12140450 * this.field94;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return -414855871 * this.field94;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ag")
   public boolean method232(byte var1) {
      try {
         boolean var10000;
         if (jagexType == this) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "aap.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aa")
   public boolean method233() {
      return jagexType == this;
   }

   AccountType(int var1, int var2) {
      this.field95 = var1 * -526746545;
      this.field94 = 1217774273 * var2;
   }
}
