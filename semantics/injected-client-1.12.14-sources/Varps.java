import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ov")
public class Varps {
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field4727 = 2;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kf")
   static Archive field4729;
   @ObfuscatedName("ag")
   static int[] Varps_masks = new int[32];
   @ObfuscatedName("av")
   public static int[] Varps_temp;
   @ObfuscatedName("at")
   public static int[] Varps_main;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4728 = 7;

   @ObfuscatedSignature(descriptor = "(I)[Lpq;")
   @ObfuscatedName("ae")
   public static PlayerType[] PlayerType_values(int var0) {
      try {
         return new PlayerType[]{
            PlayerType.field5216,
            PlayerType.field5217,
            PlayerType.field5219,
            PlayerType.field5212,
            PlayerType.PlayerType_normal,
            PlayerType.field5213,
            PlayerType.field5211,
            PlayerType.field5210,
            PlayerType.PlayerType_ultimateIronman,
            PlayerType.field5206,
            PlayerType.PlayerType_hardcoreIronman,
            PlayerType.field5209,
            PlayerType.PlayerType_playerModerator,
            PlayerType.field5215,
            PlayerType.PlayerType_jagexModerator,
            PlayerType.field5218,
            PlayerType.PlayerType_ironman
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ov.ae(" + ')');
      }
   }

   static {
      byte var0 = 2;

      for (int var1 = 0; var1 < 32; var1++) {
         Varps_masks[var1] = var0 - 1;
         var0 += var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public static int method8666(int var0) {
      VarbitComposition var2 = (VarbitComposition)class402.method8806(VarbitComposition.VarbitDefinition_cached, var0);
      VarbitComposition var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         byte[] var3 = VarbitComposition.VarbitDefinition_archive.getFile(14, var0, -1935405682);
         var2 = new VarbitComposition();
         if (null != var3) {
            var2.decode(new Buffer(var3), (byte)85);
         }

         VarbitComposition.VarbitDefinition_cached.put(var2, var0);
         var1 = var2;
      }

      int var8 = var1.baseVar * 1848369271;
      int var4 = var1.startBit * 1628144867;
      int var5 = -1140929248 * var1.endBit;
      int var6 = Varps_masks[var5 - var4];
      return Varps_main[var8] >> var4 & var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;IIZ)J")
   @ObfuscatedName("dz")
   public static long method8675(SoundCache var0, int var1, int var2, boolean var3) {
      if (var0 == null) {
         var0.method3455(var1, var1, var1);
      }

      int var4 = var2 ^ (var1 << 4 & -1728454397 | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? var4 ^ 4294967296L : var4;
   }

   Varps() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public static int method8667(int var0) {
      VarbitComposition var2 = (VarbitComposition)class402.method8806(VarbitComposition.VarbitDefinition_cached, var0);
      VarbitComposition var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         byte[] var3 = VarbitComposition.VarbitDefinition_archive.getFile(14, var0, 1884667631);
         var2 = new VarbitComposition();
         if (null != var3) {
            var2.decode(new Buffer(var3), (byte)101);
         }

         VarbitComposition.VarbitDefinition_cached.put(var2, var0);
         var1 = var2;
      }

      int var8 = var1.baseVar * 1051846737;
      int var4 = var1.startBit * 1628144867;
      int var5 = -1525413401 * var1.endBit;
      int var6 = Varps_masks[var5 - var4];
      return Varps_main[var8] >> var4 & var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public static void method8671() {
      Arrays.fill(Varps_temp, 0);
      Arrays.fill(Varps_main, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public static void method8672() {
      Arrays.fill(Varps_temp, 0);
      Arrays.fill(Varps_main, 0);
   }

   @ObfuscatedSignature(descriptor = "(JII)V")
   @ObfuscatedName("ay")
   static final void method8676(long var0, int var2, int var3) {
      try {
         if (Integer.MAX_VALUE != ViewportMouse.field3480[ViewportMouse.ViewportMouse_entityCount * -1556503267]
            && var0 != ViewportMouse.ViewportMouse_entityTags[ViewportMouse.ViewportMouse_entityCount * -1556503267]) {
            if (var3 >= -40711758) {
               throw new IllegalStateException();
            }

            ViewportMouse.ViewportMouse_entityCount += 1422935349;
            ViewportMouse.field3480[ViewportMouse.ViewportMouse_entityCount * -1556503267] = Integer.MAX_VALUE;
         }

         ViewportMouse.ViewportMouse_entityTags[-1556503267 * ViewportMouse.ViewportMouse_entityCount] = var0;
         ViewportMouse.field3480[-1556503267 * ViewportMouse.ViewportMouse_entityCount] = Math.min(
            ViewportMouse.field3480[ViewportMouse.ViewportMouse_entityCount * -1556503267], var2
         );
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ov.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public static void method8673() {
      Arrays.fill(Varps_temp, 0);
      Arrays.fill(Varps_main, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public static void method8674() {
      Arrays.fill(Varps_temp, 0);
      Arrays.fill(Varps_main, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public static int method8668(int var0) {
      VarbitComposition var2 = (VarbitComposition)class402.method8806(VarbitComposition.VarbitDefinition_cached, var0);
      VarbitComposition var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         byte[] var3 = VarbitComposition.VarbitDefinition_archive.getFile(14, var0, 1568383083);
         var2 = new VarbitComposition();
         if (null != var3) {
            var2.decode(new Buffer(var3), (byte)80);
         }

         VarbitComposition.VarbitDefinition_cached.put(var2, var0);
         var1 = var2;
      }

      int var8 = var1.baseVar * 1051846737;
      int var4 = var1.startBit * -609904933;
      int var5 = -194532700 * var1.endBit;
      int var6 = Varps_masks[var5 - var4];
      return Varps_main[var8] >> var4 & var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   public static void method8670(int var0, int var1) {
      VarbitComposition var3 = (VarbitComposition)class402.method8806(VarbitComposition.VarbitDefinition_cached, var0);
      VarbitComposition var2;
      if (null != var3) {
         var2 = var3;
      } else {
         byte[] var4 = VarbitComposition.VarbitDefinition_archive.getFile(14, var0, -1929973895);
         var3 = new VarbitComposition();
         if (var4 != null) {
            var3.decode(new Buffer(var4), (byte)116);
         }

         VarbitComposition.VarbitDefinition_cached.put(var3, var0);
         var2 = var3;
      }

      int var9 = var2.baseVar * 1051846737;
      int var5 = 1628144867 * var2.startBit;
      int var6 = -1525413401 * var2.endBit;
      int var7 = Varps_masks[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      Varps_main[var9] = Varps_main[var9] & ~var7 | var1 << var5 & var7;
   }

   @ObfuscatedSignature(descriptor = "(I)[Lmm;")
   @ObfuscatedName("av")
   public static classMM[] method8665(int var0) {
      try {
         return new classMM[]{
            classMM.field3964,
            classMM.field3965,
            classMM.field3967,
            classMM.field3973,
            classMM.field3968,
            classMM.field3969,
            classMM.field3966,
            classMM.field3971,
            classMM.field3975,
            classMM.field3972,
            classMM.field3974,
            classMM.field3970,
            classMM.field3976
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ov.av(" + ')');
      }
   }
}
