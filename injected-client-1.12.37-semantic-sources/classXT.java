import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xt")
public class classXT {
   @ObfuscatedName("ac")
   final int field6930;
   @ObfuscatedName("aa")
   public final int field6931;
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("ae")
   static final classXT field6933 = new classXT(2, 2);
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("ab")
   static final classXT field6938 = new classXT(3, 2);
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("ag")
   static final classXT field6934 = new classXT(4, 3);
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("as")
   static final classXT field6936 = new classXT(5, 3);
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("ax")
   public static final classXT field6937 = new classXT(6, 4);
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("af")
   static final classXT field6935 = new classXT(1, 1);
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("az")
   static final classXT field6932 = new classXT(0, 1);
   @ObfuscatedName("ap")
   static int field6939;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)V")
   @ObfuscatedName("ew")
   public static void method12935(classVV var0, Widget var1) {
      if (var0 == null) {
         var0.method12164(var1);
      }

      var0.field6617 = var1;
   }

   classXT(int var1, int var2) {
      this.field6930 = -1236837143 * var1;
      this.field6931 = -148650399 * var2;
   }
}
