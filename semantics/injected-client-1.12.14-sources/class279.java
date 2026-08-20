import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ki")
public class class279 extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field3316 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field3315 = 1076101384;
   @ObfuscatedName("ag")
   public int field3310;
   @ObfuscatedName("an")
   public int field3311;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("aj")
   public Widget field3312;
   @ToRemove(unused = "true")
   @ObfuscatedName("dw")
   static final float field3314 = 200.0F;
   @ObfuscatedSignature(descriptor = "[Lxt;")
   @ObfuscatedName("pg")
   static SpritePixels[] headIconPrayerSprites;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field3317 = 0;
   @ObfuscatedName("ae")
   public int field3313;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmc;J)Lvo;")
   @ObfuscatedName("ie")
   public static DualNode method6364(EvictingDualNodeHashTable var0, long var1) {
      DualNode var3 = (DualNode)var0.hashTable.get(var1);
      if (var3 != null) {
         var0.deque.add(var3);
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)Z")
   @ObfuscatedName("vo")
   public static boolean method6365(World var0) {
      if (var0 == null) {
         var0.getAddress();
      }

      return (class594.field6409.rsOrdinal((byte)111) & -607869593 * var0.location) != 0;
   }

   public class279(int var1, int var2, int var3, Widget var4) {
      this.field3313 = -1221461653 * var1;
      this.field3310 = var2 * -1944333859;
      this.field3311 = -1775110421 * var3;
      this.field3312 = var4;
   }
}
