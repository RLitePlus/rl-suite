import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zv")
public final class Font extends AbstractFont {
   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ae")
   @Override
   final void vmethod2(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * field7102;
      int var8 = field7102 - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < field7096) {
         int var11 = field7096 - var3;
         var5 -= var11;
         var3 = field7096;
         var10 += var11 * var4;
         var7 += var11 * field7102;
      }

      if (var3 + var5 > field7098) {
         var5 -= var3 + var5 - field7098;
      }

      if (var2 < field7097) {
         int var12 = field7097 - var2;
         var4 -= var12;
         var2 = field7097;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 > field7099) {
         int var13 = var2 + var4 - field7099;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         method21(field7104, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("af")
   @Override
   final void vmethod0(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * field7102;
      int var9 = field7102 - var4;
      int var10 = 0;
      int var11 = 0;
      if (var3 < field7096) {
         int var12 = field7096 - var3;
         var5 -= var12;
         var3 = field7096;
         var11 += var12 * var4;
         var8 += var12 * field7102;
      }

      if (var3 + var5 > field7098) {
         var5 -= var3 + var5 - field7098;
      }

      if (var2 < field7097) {
         int var13 = field7097 - var2;
         var4 -= var13;
         var2 = field7097;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 > field7099) {
         int var14 = var2 + var4 - field7099;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         method26(field7104, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("az")
   @Override
   final void vmethod1(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * field7102;
      int var8 = field7102 - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < field7096) {
         int var11 = field7096 - var3;
         var5 -= var11;
         var3 = field7096;
         var10 += var11 * var4;
         var7 += var11 * field7102;
      }

      if (var3 + var5 > field7098) {
         var5 -= var3 + var5 - field7098;
      }

      if (var2 < field7097) {
         int var12 = field7097 - var2;
         var4 -= var12;
         var2 = field7097;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 > field7099) {
         int var13 = var2 + var4 - field7099;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         method21(field7104, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcj;)I")
   @ObfuscatedName("tj")
   public static int method14210(classCJ var0) {
      return 563987450 * var0.field751.field6079;
   }

   public Font(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var7);
   }

   public Font(byte[] var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ab")
   @Override
   final void vmethod3(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * field7102;
      int var8 = field7102 - var4;
      int var9 = 0;
      int var10 = 0;
      if (var3 < field7096) {
         int var11 = field7096 - var3;
         var5 -= var11;
         var3 = field7096;
         var10 += var11 * var4;
         var7 += var11 * field7102;
      }

      if (var3 + var5 > field7098) {
         var5 -= var3 + var5 - field7098;
      }

      if (var2 < field7097) {
         int var12 = field7097 - var2;
         var4 -= var12;
         var2 = field7097;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var2 + var4 > field7099) {
         int var13 = var2 + var4 - field7099;
         var4 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var4 > 0 && var5 > 0) {
         method21(field7104, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ag")
   @Override
   final void vmethod4(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * field7102;
      int var9 = field7102 - var4;
      int var10 = 0;
      int var11 = 0;
      if (var3 < field7096) {
         int var12 = field7096 - var3;
         var5 -= var12;
         var3 = field7096;
         var11 += var12 * var4;
         var8 += var12 * field7102;
      }

      if (var3 + var5 > field7098) {
         var5 -= var3 + var5 - field7098;
      }

      if (var2 < field7097) {
         int var13 = field7097 - var2;
         var4 -= var13;
         var2 = field7097;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 > field7099) {
         int var14 = var2 + var4 - field7099;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         method26(field7104, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
