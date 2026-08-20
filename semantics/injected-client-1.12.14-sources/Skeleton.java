import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jc")
public class Skeleton extends Node {
   @ObfuscatedName("aj")
   int count;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field2816 = 2;
   @ObfuscatedSignature(descriptor = "Ljq;")
   @ObfuscatedName("ap")
   class251 field2814;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field2815 = 5;
   @ObfuscatedName("ak")
   int[] transformTypes;
   @ObfuscatedName("aw")
   int[][] labels;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2817 = 1;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kw")
   static Archive field2818;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int method5398() {
      return 1593543125 * this.count;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   public int method5399(byte var1) {
      try {
         return 1593543125 * this.count;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jc.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljq;")
   @ObfuscatedName("at")
   public class251 method5403(int var1) {
      try {
         return this.field2814;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jc.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int method5400() {
      return 1593543125 * this.count;
   }

   public Skeleton(int var1, byte[] var2) {
      Buffer var3 = new Buffer(var2);
      this.count = var3.readUnsignedByte(-1136814911) * -1957337219;
      this.transformTypes = new int[1593543125 * this.count];
      this.labels = new int[1593543125 * this.count][];

      for (int var4 = 0; var4 < 1593543125 * this.count; var4++) {
         this.transformTypes[var4] = var3.readUnsignedByte(326974169);
      }

      for (int var6 = 0; var6 < this.count * 1593543125; var6++) {
         this.labels[var6] = new int[var3.readUnsignedByte(-494310617)];
      }

      for (int var7 = 0; var7 < 1593543125 * this.count; var7++) {
         for (int var5 = 0; var5 < this.labels[var7].length; var5++) {
            this.labels[var7][var5] = var3.readUnsignedByte(-471374797);
         }
      }

      if (2108391709 * var3.offset < var3.array.length) {
         int var8 = Buffer.method12008(var3, (byte)5);
         if (var8 > 0) {
            this.field2814 = new class251(var3, var8);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   public int method5401() {
      return 1593543125 * this.count;
   }

   @ObfuscatedSignature(descriptor = "()Ljq;")
   @ObfuscatedName("aw")
   public class251 method5404() {
      return this.field2814;
   }

   @ObfuscatedSignature(descriptor = "()Ljq;")
   @ObfuscatedName("ak")
   public class251 method5405() {
      return this.field2814;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public int method5402() {
      return 1593543125 * this.count;
   }
}
