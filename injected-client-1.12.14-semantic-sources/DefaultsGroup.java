import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uk")
public class DefaultsGroup {
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final byte field6075 = 1;
   @ObfuscatedSignature(descriptor = "Luk;")
   @ObfuscatedName("at")
   static final DefaultsGroup field6074 = new DefaultsGroup(3);
   @ObfuscatedName("ag")
   final int group;
   @ObfuscatedSignature(descriptor = "Luk;")
   @ObfuscatedName("av")
   static final DefaultsGroup field6073 = new DefaultsGroup(1);
   @ObfuscatedName("tf")
   static boolean field6076;

   DefaultsGroup(int var1) {
      this.group = var1 * 556397649;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("np")
   static final void method11178(int var0, int var1) {
      try {
         var0 = Math.max(Math.min(var0, 100), 0);
         var0 = 100 - var0;
         float var2 = 0.5F + var0 / 200.0F;
         UserComparator3.method3684(var2);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "uk.np(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;Lvt;B)Lrl;")
   @ObfuscatedName("ag")
   public static Bounds method11177(WorldEntityCoord var0, classVT var1, byte var2) {
      try {
         int var3 = 809239137 * var1.field6161;
         int var4 = 978893637 * var1.field6159;
         int var5 = 299509079 * var1.field6163;
         int var6 = var1.field6164 * -1524422205;
         int var7 = var0.getX(647911908);
         int var8 = var0.getY(-1992062781);
         int var9 = var0.getZ(2044722015);
         double var10 = DevicePcmPlayerProvider.method146(var7, 192801641);
         double var12 = class66.method1386(var7, 265123991) / 65536.0;
         int var16 = (int)(var10 * var3 - var4 * var12);
         int var17 = (int)(var4 * var10 + var12 * var3);
         var8 += var16;
         var9 += var17;
         int var18 = (int)(var10 * var5 - var12 * var6);
         int var19 = (int)(var12 * var5 + var6 * var10);
         int var20 = (int)(var10 * var5 + var6 * var12);
         int var21 = (int)(var6 * var10 - var5 * var12);
         int var22 = var8 - var18;
         int var23 = var19 + var9;
         int var24 = var8 + var20;
         int var25 = var9 + var21;
         int var26 = var8 + var18;
         int var27 = var9 - var19;
         int var28 = var8 - var20;
         int var29 = var9 - var21;
         int var30 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
         int var31 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
         int var32 = Math.min(var23, Math.min(var25, Math.min(var27, var29)));
         int var33 = Math.max(var23, Math.max(var25, Math.max(var27, var29)));
         return AbstractArchive.method8960(var30, var32, 1 + (var31 - var30), var33 - var32 + 1, -1497663406);
      } catch (RuntimeException var34) {
         throw RestClientThreadFactory.newRunException(var34, "uk.ag(" + ')');
      }
   }
}
