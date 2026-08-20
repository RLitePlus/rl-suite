import java.time.LocalDate;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl1")
public class rl1 implements ClanMember {
   @ObfuscatedName("hw")
   public final int field5690;
   @ObfuscatedSignature(descriptor = "Liq;")
   @ObfuscatedName("ks")
   public final classIQ field5689;

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.getName();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      ClanRank var4 = this.getRank();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("ab")
   public boolean method10029(Object var1) {
      return var1 instanceof rl1;
   }

   public ClanRank getRank() {
      return client.method2388(this.field5689.method6303()[this.field5690]);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rl1)) {
         return false;
      } else {
         rl1 var2 = (rl1)var1;
         if (!var2.method10029(this)) {
            return false;
         } else {
            String var3 = this.getName();
            String var4 = var2.getName();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               ClanRank var5 = this.getRank();
               ClanRank var6 = var2.getRank();
               return var5 == null ? var6 == null : var5.equals(var6);
            } else {
               return false;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvy;)Z")
   @ObfuscatedName("ic")
   public static boolean method10028(classVY var0) {
      return var0.field6641 * 1883191353 >= var0.field6643 * -665926205;
   }

   @Override
   public String toString() {
      return "ClanMemberImpl(getName=" + this.getName() + ", getRank=" + this.getRank() + ")";
   }

   public String getName() {
      return this.field5689.method6306()[this.field5690];
   }

   public LocalDate getJoinDate() {
      int var1 = this.field5689.field3039[this.field5690];
      return LocalDate.ofEpochDay(11745 + var1);
   }

   public rl1(classIQ var1, int var2) {
      this.field5689 = var1;
      this.field5690 = var2;
   }
}
