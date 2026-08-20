import net.runelite.api.Nameable;
import net.runelite.api.clan.ClanChannelMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hn")
public class classHN implements ClanChannelMember {
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field2844 = 2;
   @ObfuscatedName("az")
   public byte field2841;
   @ObfuscatedName("af")
   public int field2842;
   @ObfuscatedSignature(descriptor = "Laae;")
   @ObfuscatedName("ae")
   public classAAE field2846;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field2843 = 1024;
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   static final int field2845 = 124;

   public ClanRank getRank() {
      return client.method2388(this.method6076());
   }

   public String getName() {
      classAAE var1 = this.method6077();
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.method186();
         return var2 == null ? null : var2.replace(' ', ' ');
      }
   }

   public String getPrevName() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("az")
   public byte method6076() {
      return this.field2841;
   }

   public int getWorld() {
      return this.field2842 * -906550845;
   }

   @ObfuscatedSignature(descriptor = "()Laae;")
   @ObfuscatedName("bz")
   public classAAE method6077() {
      return this.field2846;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;II)Z")
   @ObfuscatedName("xw")
   public static boolean method6074(classDZ var0, int var1, int var2) {
      if (var0 == null) {
         var0.method3733(var1, var1, var1);
      }

      return var1 >= 0 && var2 >= 0 && var1 < 1296729483 * var0.field1696 && var2 < var0.field1692 * -1269171107;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/Nameable;)I")
   @ObfuscatedName("hl")
   public int method6075(Nameable var1) {
      return this.getName().compareTo(var1.getName());
   }

   classHN() {
   }
}
