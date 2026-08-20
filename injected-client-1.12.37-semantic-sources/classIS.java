import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("is")
public abstract class classIS extends Node {
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("dk")
   public static WorldView field3053;
   @ToRemove(unused = "true")
   @ObfuscatedName("dc")
   public static final int field3052 = 1;
   @ObfuscatedSignature(descriptor = "Ley;")
   @ObfuscatedName("ao")
   static classEY field3054;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   abstract void vmethod505(classXY var1);

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   abstract void vmethod507(classXY var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lay;[II)I")
   @ObfuscatedName("ns")
   public static int method6313(classAY var0, int[] var1, int var2) {
      if (var0 == null) {
         return var0.method732(var1, var2);
      } else {
         int var3 = var1[var2];
         int var4 = -1;
         int var5 = Integer.MAX_VALUE;

         for (int var6 = 0; var6 < var2; var6++) {
            int var7 = var1[var6];
            if (var7 > var3 && var7 < var5) {
               var4 = var6;
               var5 = var7;
            }
         }

         return var4;
      }
   }

   classIS() {
   }

   @ObfuscatedSignature(descriptor = "(Lie;I)V")
   @ObfuscatedName("af")
   abstract void vmethod509(ClanChannel var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ax")
   abstract void vmethod508(ClanChannel var1);

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ag")
   abstract void vmethod510(ClanChannel var1);

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   abstract void vmethod506(classXY var1);

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("as")
   abstract void vmethod511(ClanChannel var1);
}
