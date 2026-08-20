import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ji")
public class classJI {
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field3161 = 32768;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field3159 = 16776960;
   @ToRemove(unused = "true")
   @ObfuscatedName("cl")
   static final int field3166 = 112;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("bb")
   public static classVA field3167;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   static final int field3163 = 98;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field3160 = 70;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3162 = 1000000;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   public static final int field3165 = 67;
   @ObfuscatedName("bh")
   static int field3164;

   @ObfuscatedSignature(descriptor = "(Lva;II)Lnr;")
   @ObfuscatedName("az")
   static classNR method6371(classVA var0, int var1, int var2) {
      try {
         byte[] var3 = classVA.method11814(var0, var1, -1717700222);
         return null == var3 ? null : new classNR(var3);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ji.az(" + ')');
      }
   }

   classJI() throws Throwable {
      throw new Error();
   }
}
