import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gv")
public class classGV {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final double field2708 = 325.94932345220167;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field2711 = 2047;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2714 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field2715 = 1280;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field2709 = 256;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field2712 = 768;
   @ObfuscatedName("ar")
   static final int[][] field2707 = new int[512][512];
   @ObfuscatedName("au")
   public static final int[] field2705 = new int[2048];
   @ObfuscatedName("ai")
   static final int[] field2706 = new int[2048];
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field2710 = 65536;
   @ObfuscatedName("ju")
   static String field2716;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2713 = 512;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aq")
   public static int method5807(int var0, int var1) {
      int var2 = var1 - var0 & 2047;
      return var2 > 1024 ? -(2048 - var2) : var2;
   }

   static {
      double var0 = 0.0030679615757712823;

      for (int var2 = 0; var2 < 2048; var2++) {
         field2705[var2] = (int)(65536.0 * Math.sin(var2 * var0));
         field2706[var2] = (int)(65536.0 * Math.cos(var0 * var2));
      }

      for (int var4 = -256; var4 < 256; var4++) {
         for (int var3 = -256; var3 < 256; var3++) {
            field2707[256 + var4][256 + var3] = (int)Math.round(Math.atan2(var4, var3) * 325.94932345220167) - 512 & 2047;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ad")
   public static int method5808(int var0, int var1) {
      int var2 = var1 - var0 & 2047;
      return var2 > 1024 ? -(2048 - var2) : var2;
   }

   classGV() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   static int method5799(int var0) {
      return field2705[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   public static int method5804(int var0) {
      return field2706[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aa")
   static int method5800(int var0) {
      return field2705[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   static int method5801(int var0) {
      return field2705[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   public static int method5805(int var0) {
      return field2706[var0 & -122529128];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   static int method5802(int var0) {
      return field2705[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ay")
   public static int method5809(int var0, int var1) {
      int var2 = var1 - var0 & 2047;
      return var2 > 1024 ? -(2048 - var2) : var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   static int method5803(int var0) {
      return field2705[var0 & 2047];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)D")
   @ObfuscatedName("aj")
   public static double method5806(int var0) {
      return classLO.method7132(var0, (byte)77) / 65536.0;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ag")
   static void method5810(int var0, byte var1) {
      try {
         classBH var2 = (classBH)classBH.field454.method13363(var0);
         if (null == var2) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }
         } else {
            for (int var3 = 0; var3 < var2.field456.length; var3++) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               var2.field456[var3] = -1;
               var2.field455[var3] = 0;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)V")
   @ObfuscatedName("dh")
   static void method5811(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         classAD.method332(classCQ.field1220, var0, var1, var2, var3, var4, -728364943);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gv.dh(" + ')');
      }
   }
}
