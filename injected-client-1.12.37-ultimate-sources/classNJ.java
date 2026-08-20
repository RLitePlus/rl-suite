import java.util.BitSet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nj")
public class classNJ extends classVQ {
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field4677 = 70;
   @ObfuscatedName("af")
   int field4675;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field4676 = 2;
   @ObfuscatedName("az")
   BitSet field4674;
   @ObfuscatedSignature(descriptor = "Liq;")
   @ObfuscatedName("br")
   static classIQ field4678;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbv;)I")
   @ObfuscatedName("fu")
   public static int method7861(classBV var0) {
      return var0.field583 * 1160694231;
   }

   classNJ(int var1) {
      this.field4675 = 530466213 * var1;
      this.field4674 = new BitSet(128);
   }
}
