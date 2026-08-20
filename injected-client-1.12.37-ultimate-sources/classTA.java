import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ta")
public class classTA {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6111 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6113 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6115 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field6114 = 507;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field6112 = 27;

   classTA() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)I")
   @ObfuscatedName("fg")
   public static final int method10732(String var0, String var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         return classRP.method10155(var0, var1, var2, var3, var4, var5, -1, false, 0, -324749371);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ta.fg(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ap")
   static final int method10731(int var0, int var1, int var2, int var3) {
      try {
         int var4 = var0 / var2;
         int var5 = var0 & var2 - 1;
         int var6 = var1 / var2;
         int var7 = var1 & var2 - 1;
         int var8 = classBI.method1101(var4, var6, -1336616108);
         int var9 = classBI.method1101(1 + var4, var6, -546227840);
         int var10 = classBI.method1101(var4, var6 + 1, -1483735760);
         int var11 = classBI.method1101(1 + var4, var6 + 1, -1337985649);
         int var12 = classIN.method6229(var8, var9, var5, var2, -1293532603);
         int var13 = classIN.method6229(var10, var11, var5, var2, 980708827);
         return classIN.method6229(var12, var13, var7, var2, -680827345);
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "ta.ap(" + 41);
      }
   }
}
