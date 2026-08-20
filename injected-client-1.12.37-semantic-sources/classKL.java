import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kl")
public class classKL implements classXZ {
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("as")
   static final classKL field3946 = new classKL(5, 10, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("af")
   static final classKL field3956 = new classKL(1, 0, true, true, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ab")
   static final classKL field3948 = new classKL(3, 2, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ag")
   static final classKL field3947 = new classKL(4, 3, false, false, true);
   @ObfuscatedName("aw")
   public final boolean field3940;
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("au")
   static final classKL field3957 = new classKL(16, 52, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ax")
   static final classKL field3954 = new classKL(6, 22, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ac")
   static final classKL field3945 = new classKL(7, 41, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("aa")
   static final classKL field3949 = new classKL(8, 42, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ap")
   static final classKL field3955 = new classKL(15, 49, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("al")
   static final classKL field3951 = new classKL(10, 44, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("aj")
   static final classKL field3952 = new classKL(11, 45, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ay")
   static final classKL field3953 = new classKL(12, 46, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("aq")
   static final classKL field3944 = new classKL(13, 47, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("az")
   static final classKL field3941 = new classKL(0, -1, true, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ad")
   static final classKL field3942 = new classKL(14, 48, false, false, true);
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ae")
   static final classKL field3943 = new classKL(2, 1, true, true, false);
   @ObfuscatedName("ai")
   public final int field3939;
   @ObfuscatedName("ed")
   static int field3958;
   @ObfuscatedName("ar")
   public final boolean field3938;
   @ObfuscatedName("ak")
   final int field3937;
   @ObfuscatedSignature(descriptor = "Lkl;")
   @ObfuscatedName("ao")
   static final classKL field3950 = new classKL(9, 43, false, false, true);

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return 977591311 * this.field3937;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "kl.az(" + 41);
      }
   }

   classKL(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.field3937 = 1785369327 * var1;
      this.field3939 = -258604439 * var2;
      this.field3940 = var4;
      this.field3938 = var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgu;)Z")
   @ObfuscatedName("wy")
   public static boolean method6493(WorldMapRenderer var0) {
      if (var0 == null) {
         var0.method5789();
      }

      return var0.field2687;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return 1129546720 * this.field3937;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lkl;")
   @ObfuscatedName("as")
   public static classKL[] method6492() {
      return new classKL[]{
         field3954,
         field3950,
         field3947,
         field3946,
         field3951,
         field3948,
         field3956,
         field3941,
         field3943,
         field3955,
         field3953,
         field3944,
         field3942,
         field3952,
         field3957,
         field3945,
         field3949
      };
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return 977591311 * this.field3937;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return 977591311 * this.field3937;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fw")
   static final void method6494(int var0) {
      try {
         classKF.field3571.method3416(classAB.field122.method2764((byte)0), classAB.field122.method2820(1502000843), -1024273585);
         int var1 = classKF.field3571.method3425(-633125341);
         if (0 == var1) {
            if (var0 >= 225383526) {
               throw new IllegalStateException();
            }

            classBK.method1118(0, 0, (byte)4);
            client.field989 = false;
         } else if (var1 == 0 && TileItem.method3407(-1496781286)) {
            if (var0 >= 225383526) {
               throw new IllegalStateException();
            }

            classLE.method6778(classFC.field2208, var1, 124181514);
            client.field989 = false;
         } else {
            classDV.method3626(var1, (short)-9107);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "kl.fw(" + ')');
      }
   }
}
