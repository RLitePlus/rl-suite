import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ud")
public class classUD {
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field6027 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field6029 = 2047;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final double field6024 = 325.94932345220167;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field6030 = 2048;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field6028 = 65536;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field6025 = 1280;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6026 = 16;
   @ObfuscatedName("ab")
   static final int[] field6021 = new int[2048];
   @ObfuscatedName("ax")
   public static final int[] field6022 = new int[2048];
   @ObfuscatedName("ar")
   static final int[][] field6023 = new int[512][512];

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   public static int method11115(int var0) {
      var0 += 64;
      return (var0 & 2047) / 128;
   }

   static {
      double var0 = 0.0030679615757712823;

      for (int var2 = 0; var2 < 2048; var2++) {
         field6021[var2] = (int)(65536.0 * Math.sin(var0 * var2));
         field6022[var2] = (int)(65536.0 * Math.cos(var2 * var0));
      }

      for (int var4 = -256; var4 < 256; var4++) {
         for (int var3 = -256; var3 < 256; var3++) {
            field6023[var4 + 256][256 + var3] = (int)Math.round(Math.atan2(var4, var3) * 325.94932345220167) - 512 & 2047;
         }
      }
   }

   classUD() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ap")
   public static float method11097(int var0) {
      var0 &= 2139387358;
      return (float)(var0 / 2048.0F * (Math.PI * 2));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)D")
   @ObfuscatedName("al")
   public static double method11110(int var0) {
      int var1 = field6022[var0 & 2047];
      return var1 / 65536.0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("au")
   public static float method11098(int var0) {
      var0 &= -1289300179;
      return (float)(var0 / 2048.0F * (Math.PI * 2));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)I")
   @ObfuscatedName("az")
   public static int method11101(float var0) {
      return (int)(var0 / (Math.PI * 2) * 2048.0) & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)I")
   @ObfuscatedName("ad")
   public static int method11102(float var0) {
      return (int)(var0 / (Math.PI * 2) * 2048.0) & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("aw")
   public static float method11099(int var0) {
      var0 &= 2047;
      return (float)(var0 / 2048.0F * (Math.PI * 2));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)I")
   @ObfuscatedName("as")
   public static int method11103(float var0) {
      return (int)(var0 / (Math.PI * 2) * 2048.0) & 505153390;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public static int method11107(int var0) {
      return field6021[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   public static int method11105(int var0, int var1) {
      return (int)Math.round(Math.atan2(var0, var1) * 325.94932345220167) - 512 & 196589385;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ay")
   public static float method11100(int var0) {
      var0 &= 2047;
      return (float)(var0 / 2048.0F * (Math.PI * 2));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(F)I")
   @ObfuscatedName("ai")
   public static int method11104(float var0) {
      return (int)(var0 / (Math.PI * 2) * 2048.0) & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public static int method11108(int var0) {
      return field6021[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ac")
   public static int method11106(int var0, int var1) {
      return (int)Math.round(Math.atan2(var0, var1) * 325.94932345220167) - 512 & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)D")
   @ObfuscatedName("af")
   public static double method11111(int var0) {
      int var1 = field6022[var0 & 2047];
      return var1 / 65536.0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)D")
   @ObfuscatedName("am")
   public static double method11112(int var0) {
      int var1 = field6022[var0 & 2047];
      return var1 / 65536.0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ao")
   public static int method11113(int var0, int var1) {
      int var2 = var1 - var0 & 944823190;
      return var2 > 1940175321 ? -(809299790 - var2) : var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aa")
   public static int method11114(int var0, int var1) {
      int var2 = var1 - var0 & 2047;
      return var2 > 1024 ? -(2048 - var2) : var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   public static int method11109(int var0) {
      return field6021[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("be")
   public static int method11116(int var0) {
      var0 += 64;
      return (var0 & 2047) / 128;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   public static int method11117(int var0) {
      var0 += 64;
      return (var0 & -1811757621) / -466589197;
   }
}
