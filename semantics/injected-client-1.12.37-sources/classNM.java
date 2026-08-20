import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nm")
public class classNM {
   @ObfuscatedName("ab")
   String field4689;
   @ObfuscatedName("af")
   public final long field4687;
   @ObfuscatedSignature(descriptor = "Lmm;")
   @ObfuscatedName("ae")
   public final GrandExchangeOffer field4685;
   @ObfuscatedName("ag")
   String field4688;
   @ObfuscatedName("az")
   public final int field4686;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final int field4690 = 90;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ab")
   public String method7888() {
      return this.field4689;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method7889(int var1) {
      try {
         return this.field4689;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "nm.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("af")
   public String method7891(int var1) {
      try {
         return this.field4688;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "nm.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ae")
   public String method7890() {
      return this.field4689;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ag")
   public String method7892() {
      return this.field4688;
   }

   classNM(Buffer var1, byte var2, int var3) {
      this.field4689 = var1.method13071(2117716806);
      this.field4688 = var1.method13071(1817698247);
      this.field4686 = Buffer.method13047(var1, -617856821) * -1507921803;
      this.field4687 = var1.method13059(-432626029) * 1135738023595011617L;
      int var4 = var1.method13056((byte)1);
      int var5 = var1.method13056((byte)1);
      this.field4685 = new GrandExchangeOffer();
      this.field4685.method7611(2, (byte)4);
      GrandExchangeOffer.method7615(this.field4685, var2, 2008825883);
      this.field4685.field4534 = 961265821 * var4;
      this.field4685.field4536 = var5 * 373867205;
      this.field4685.field4537 = 0;
      this.field4685.field4538 = 0;
      this.field4685.field4535 = var3 * 443314353;
   }
}
