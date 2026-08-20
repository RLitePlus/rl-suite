import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zp")
public class classZP {
   @ObfuscatedName("az")
   int field7234;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   public int method14079(int var1) {
      try {
         return 203459897 * this.field7234;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zp.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;Ljava/lang/String;)V")
   @ObfuscatedName("ua")
   public static void method14082(NPC var0, String var1) {
      if (var0 == null) {
         var0.vmethod273();
      }

      var0.field1571 = var1 == null ? "" : var1;
   }

   classZP(int var1, boolean var2) {
      this.field7234 = 1670140169 * var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)I")
   @ObfuscatedName("dp")
   public static int method14083(Actor var0) {
      return var0.field1463.field629 * 2034680854;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method14080() {
      return 203459897 * this.field7234;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int method14081() {
      return 492259730 * this.field7234;
   }
}
