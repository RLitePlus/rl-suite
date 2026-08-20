import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bs")
public interface classBS {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrl;)Ljava/lang/String;")
   @ObfuscatedName("ff")
   static String method1169(Bounds var0) {
      if (var0 == null) {
         var0.method9526();
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("az")
   boolean vmethod89(boolean var1);

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("ay")
   boolean vmethod90(boolean var1);

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("ag")
   boolean vmethod91(char var1, byte var2);

   @ObfuscatedSignature(descriptor = "(ZI)Z")
   @ObfuscatedName("an")
   boolean vmethod92(boolean var1, int var2);

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   boolean vmethod93(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)Z")
   @ObfuscatedName("rj")
   static boolean method1170(WorldMap var0) {
      return -1 != var0.field6238 * -2014116575 && 274639978 * var0.minCachedTileX != -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean vmethod94(int var1);

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   boolean vmethod95(int var1);

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("av")
   boolean vmethod96(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("au")
   boolean vmethod97(boolean var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIII)Z")
   @ObfuscatedName("bk")
   static boolean method1171(Scene var0, int var1, int var2, int var3, int var4) {
      return var0.method5599(var0.field2956, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("at")
   boolean vmethod98(int var1, byte var2);

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("aw")
   boolean vmethod99(char var1);

   @ObfuscatedSignature(descriptor = "(Z)Z")
   @ObfuscatedName("ap")
   boolean vmethod100(boolean var1);
}
