import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yq")
public final class classYQ {
   @ObfuscatedName("bc")
   boolean[] field7029;
   @ObfuscatedName("am")
   int[] field7039;
   @ObfuscatedName("ae")
   final int field7030;
   @ObfuscatedName("at")
   int field7060;
   @ObfuscatedName("ag")
   final int field7032;
   @ObfuscatedName("bo")
   int[][] field7033;
   @ObfuscatedName("bm")
   byte[] field7044;
   @ObfuscatedName("ac")
   byte[] field7035;
   @ObfuscatedName("aa")
   byte[] field7036;
   @ObfuscatedName("ao")
   byte[] field7066;
   @ObfuscatedName("al")
   int field7037;
   @ObfuscatedName("aj")
   int field7055;
   @ObfuscatedName("ay")
   byte[] field7067;
   @ObfuscatedName("aq")
   int field7038;
   @ObfuscatedName("ad")
   int field7052;
   @ObfuscatedName("ap")
   int field7058;
   @ObfuscatedName("au")
   byte field7051;
   @ObfuscatedName("ai")
   int field7054;
   @ObfuscatedName("as")
   final int field7049;
   @ObfuscatedName("ar")
   int field7059;
   @ObfuscatedName("ab")
   final int field7034;
   @ObfuscatedName("av")
   int field7061;
   @ObfuscatedName("ak")
   int field7056;
   @ObfuscatedName("bx")
   int field7065;
   @ObfuscatedName("ax")
   final int field7041;
   @ObfuscatedName("ah")
   int field7053;
   @ObfuscatedName("bn")
   int[] field7040;
   @ObfuscatedName("bk")
   int[][] field7047;
   @ObfuscatedName("aw")
   int field7062;
   @ObfuscatedName("bp")
   boolean[] field7048;
   @ObfuscatedName("br")
   byte[] field7042;
   @ObfuscatedName("af")
   final int field7043 = 4096;
   @ObfuscatedName("bt")
   int[] field7045;
   @ObfuscatedName("bg")
   byte[][] field7046;
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   public static final int field7064 = 63;
   @ObfuscatedName("az")
   static int[] field7068;
   @ObfuscatedName("bj")
   int[][] field7031;
   @ObfuscatedName("bu")
   int[] field7050;
   @ObfuscatedName("ba")
   int field7063;
   @ObfuscatedName("an")
   int field7057;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)V")
   @ObfuscatedName("fv")
   public static void method13609(WorldMap var0) {
      if (var0 == null) {
         var0.getWorldMapData();
      }

      if (WorldMap.method12414(var0, 2104218553)) {
         int var1 = var0.field6696 * -19228805 - var0.field6736 * -988263171;
         int var2 = -1049438298 * var0.field6715 - -1268509173 * var0.field6738;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         WorldMap.method12403(var0, var1 + -1268315106 * var0.field6736, var0.field6738 * 1010414839 + var2, true, -2063968209);
         if (1642911700 * var0.field6736 == var0.field6696 * 117909126 && var0.field6738 * 1204376503 == var0.field6715 * -1101891105) {
            var0.field6696 = -2029390199;
            var0.field6715 = -1910538783;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lym;IIIII)V")
   @ObfuscatedName("kv")
   public static void method13610(SpritePixels var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.setMaxWidth(var1);
      } else if (var3 > 0 && var4 > 0) {
         int var6 = var0.field7007;
         int var7 = var0.field7009;
         int var8 = 0;
         int var9 = 0;
         int var10 = var0.field7006;
         int var11 = var0.field7008;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (var0.field7010 > 0) {
            int var14 = ((var0.field7010 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (var0.field7010 << 16);
         }

         if (var0.field7011 > 0) {
            int var17 = ((var0.field7011 << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (var0.field7011 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * SpritePixels.field7102;
         int var15 = SpritePixels.field7102 - var3;
         if (var2 + var4 > SpritePixels.field7098) {
            var4 -= var2 + var4 - SpritePixels.field7098;
         }

         if (var2 < SpritePixels.field7096) {
            int var16 = SpritePixels.field7096 - var2;
            var4 -= var16;
            var18 += var16 * SpritePixels.field7102;
            var9 += var13 * var16;
         }

         if (var1 + var3 > SpritePixels.field7099) {
            int var19 = var1 + var3 - SpritePixels.field7099;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < SpritePixels.field7097) {
            int var20 = SpritePixels.field7097 - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         SpritePixels.method13452(SpritePixels.field7104, var0.field7005, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   classYQ() {
      this.field7030 = 16;
      this.field7034 = 258;
      this.field7032 = 6;
      this.field7049 = 50;
      this.field7041 = 18002;
      this.field7035 = new byte[18002];
      this.field7036 = new byte[18002];
      this.field7037 = 0;
      this.field7038 = 0;
      this.field7039 = new int[256];
      this.field7040 = new int[257];
      this.field7029 = new boolean[256];
      this.field7048 = new boolean[16];
      this.field7042 = new byte[256];
      this.field7044 = new byte[4096];
      this.field7045 = new int[16];
      this.field7046 = new byte[6][258];
      this.field7047 = new int[6][258];
      this.field7033 = new int[6][258];
      this.field7031 = new int[6][258];
      this.field7050 = new int[6];
   }
}
