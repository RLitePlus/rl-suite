import java.awt.event.WindowEvent;
import java.time.LocalDate;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl0")
public class rl0 implements ClanMember {
   @ObfuscatedSignature(descriptor = "Lgs;")
   @ObfuscatedName("ot")
   public final ClanSettings field5548;
   @ObfuscatedName("su")
   public final int field5549;

   public String getName() {
      return this.field5548.method4350()[this.field5549];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("uv")
   public static void method9536(GameEngine var0, WindowEvent var1) {
      if (var0 == null) {
         var0.method802(var1);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rl0)) {
         return false;
      } else {
         rl0 var2 = (rl0)var1;
         if (!var2.method9537(this)) {
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
   @ObfuscatedSignature(descriptor = "(Lix;)I")
   @ObfuscatedName("ha")
   public static int method9535(class225 var0) {
      if (var0 == null) {
         var0.method5316();
      }

      return 57298406 * var0.field2762;
   }

   public ClanRank getRank() {
      return client.method2464(this.field5548.method4352()[this.field5549]);
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.getName();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      ClanRank var4 = this.getRank();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Override
   public String toString() {
      return "ClanMemberImpl(getName=" + this.getName() + ", getRank=" + this.getRank() + ")";
   }

   public LocalDate getJoinDate() {
      int var1 = this.field5548.memberJoinDates[this.field5549];
      return LocalDate.ofEpochDay(11745 + var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("pr")
   public boolean method9537(Object var1) {
      return var1 instanceof rl0;
   }

   public rl0(ClanSettings var1, int var2) {
      this.field5548 = var1;
      this.field5549 = var2;
   }
}
