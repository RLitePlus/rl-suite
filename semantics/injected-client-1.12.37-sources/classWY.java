import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wy")
public class classWY {
   @ObfuscatedSignature(descriptor = "Lwy;")
   @ObfuscatedName("az")
   public static final classWY field6791 = new classWY("application/json");
   @ObfuscatedName("ab")
   String field6790;
   @ObfuscatedSignature(descriptor = "Lwy;")
   @ObfuscatedName("ae")
   static final classWY field6793 = new classWY("application/x-www-form-urlencoded");
   @ObfuscatedSignature(descriptor = "Lwy;")
   @ObfuscatedName("af")
   static final classWY field6792 = new classWY("text/plain");
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   public static final int field6794 = 50;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("as")
   public String method12636() {
      return this.field6790;
   }

   classWY(String var1) {
      this.field6790 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;)I")
   @ObfuscatedName("if")
   public static int method12643(classGY var0) {
      return var0.field2742 * 1989307627 >> 7;
   }

   @ObfuscatedSignature(descriptor = "(Lwy;I)Ljava/lang/String;")
   @ObfuscatedName("xd")
   public static String method12637(classWY var0, int var1) {
      if (var0 == null) {
         return var0.method12641(var1);
      } else {
         try {
            return var0.field6790;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "wy.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ae")
   public String method12638() {
      return this.field6790;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ag")
   public String method12639() {
      return this.field6790;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("af")
   public String method12640() {
      return this.field6790;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lya;)V")
   @ObfuscatedName("gi")
   public static void method12642(classYA var0) {
      var0.field6964 = var0.field6962.field7017[0].field6554;
      var0.field6963 = 1;
      var0.field6961 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method12641(int var1) {
      try {
         return this.field6790;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wy.az(" + ')');
      }
   }
}
