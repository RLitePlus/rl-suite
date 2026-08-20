import net.runelite.api.PendingLogin;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rh")
public class FriendLoginUpdate extends classVM implements PendingLogin {
   @ObfuscatedSignature(descriptor = "Laae;")
   @ObfuscatedName("af")
   public classAAE field5665;
   @ObfuscatedName("az")
   public int field5667 = (int)(classDD.method2983(16711680) / 1000L) * 866162873;
   @ObfuscatedName("ae")
   public short field5666;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5668 = 7;

   public short getWorld() {
      return this.field5666;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;)I")
   @ObfuscatedName("sc")
   public static int method9963(classZD var0) {
      return 913897383 * var0.field7161;
   }

   @ObfuscatedSignature(descriptor = "(Laae;I)V")
   @ObfuscatedName("tk")
   public void method9964(classAAE var1, int var2) {
      this.field5667 = (this.field5667 * 1669590409 + 5) * 866162873;
   }

   @ObfuscatedSignature(descriptor = "()Laae;")
   @ObfuscatedName("dg")
   public classAAE method9965() {
      return this.field5665;
   }

   public String getName() {
      return this.method9965().method186();
   }

   FriendLoginUpdate(classAAE var1, int var2) {
      this.field5665 = var1;
      this.field5666 = (short)var2;
      this.method9964(var1, var2);
   }
}
