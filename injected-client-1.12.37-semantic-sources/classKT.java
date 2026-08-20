import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class classKT implements classXZ {
   @ObfuscatedSignature(descriptor = "Lkt;")
   @ObfuscatedName("ab")
   public static final classKT field4020 = new classKT(3);
   @ObfuscatedSignature(descriptor = "Lkt;")
   @ObfuscatedName("ae")
   static final classKT field4019 = new classKT(2);
   @ObfuscatedName("bq")
   static int field4022;
   @ObfuscatedSignature(descriptor = "Lkt;")
   @ObfuscatedName("af")
   static final classKT field4021 = new classKT(1);
   @ObfuscatedSignature(descriptor = "Lkt;")
   @ObfuscatedName("ag")
   static final classKT field4018 = new classKT(4);
   @ObfuscatedName("as")
   final int field4016;
   @ObfuscatedSignature(descriptor = "Lkt;")
   @ObfuscatedName("az")
   static final classKT field4017 = new classKT(0);

   classKT(int var1) {
      this.field4016 = var1 * 789673457;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field4016 * -183313647;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "kt.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   public static int method6562(int var0, int var1) {
      try {
         return var0 >> 3 & 2047;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "kt.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field4016 * -183313647;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field4016 * -183313647;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field4016 * -183313647;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("af")
   public static int method6561(int var0, byte var1) {
      try {
         return var0 >>> 4 & classZK.field7192 * -145882333;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "kt.af(" + 41);
      }
   }
}
