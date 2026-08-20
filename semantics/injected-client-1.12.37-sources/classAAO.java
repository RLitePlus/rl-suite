import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aao")
public class classAAO {
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("as")
   static final classAAO field84 = new classAAO(6, 5, "", "");
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("af")
   static final classAAO field86 = new classAAO(2, 1, "", "");
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("ae")
   static final classAAO field81 = new classAAO(1, 2, "", "");
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("ac")
   static final classAAO field85 = new classAAO(0, 7, "", "");
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("ab")
   static final classAAO field82 = new classAAO(8, 3, "", "");
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("ag")
   static final classAAO field83 = new classAAO(4, 4, "", "");
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("aa")
   public static final classAAO field87 = new classAAO(3, -1, "", "", true, new classAAO[]{classAAO.field79, field86, field81, field83, field82});
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("ax")
   static final classAAO field80 = new classAAO(5, 6, "", "");
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("az")
   public static final classAAO field79 = new classAAO(7, 0, "", "");
   @ObfuscatedName("ao")
   final int field77;
   @ObfuscatedName("al")
   final String field78;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laao;)Ljava/lang/String;")
   @ObfuscatedName("kn")
   public static String method226(classAAO var0) {
      return var0.field78;
   }

   classAAO(int var1, int var2, String var3, String var4, boolean var5, classAAO[] var6) {
      this.field77 = -2094962513 * var1;
      this.field78 = var4;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method227() {
      return this.field78;
   }

   @Override
   public String toString() {
      try {
         return this.field78;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "aao.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method228() {
      return this.field78;
   }

   classAAO(int var1, int var2, String var3, String var4) {
      this.field77 = var1 * -2094962513;
      this.field78 = var4;
   }
}
