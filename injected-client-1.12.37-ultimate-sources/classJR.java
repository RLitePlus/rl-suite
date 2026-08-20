import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jr")
public class classJR implements classJN {
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("as")
   public static final classJR field3360 = new classJR(21, 37);
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("af")
   public static final classJR field3364 = new classJR(15, 20);
   @ObfuscatedName("ao")
   public final int field3368;
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("ab")
   public static final classJR field3366 = new classJR(18, -2);
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("ae")
   public static final classJR field3361 = new classJR(16, -2);
   @ToRemove(unused = "true")
   @ObfuscatedName("dc")
   static final int field3370 = 100;
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("ax")
   static final classJR field3362 = new classJR(27, 0);
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("ag")
   public static final classJR field3363 = new classJR(19, -2);
   @ObfuscatedSignature(descriptor = "[Ljr;")
   @ObfuscatedName("aa")
   static final classJR[] field3367 = new classJR[33];
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("ac")
   public static final classJR field3365 = new classJR(32, 66);
   @ObfuscatedName("al")
   public final int field3369;
   @ObfuscatedSignature(descriptor = "Ljr;")
   @ObfuscatedName("az")
   public static final classJR field3359 = new classJR(14, 0);

   static {
      classJR[] var0 = new classJR[]{field3363, field3359, field3364, field3365, field3362, field3360, field3361, field3366};
      classJR[] var1 = var0;

      for (int var2 = 0; var2 < var1.length; var2++) {
         field3367[var1[var2].field3368 * 1882081851] = var1[var2];
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lsa;")
   @ObfuscatedName("ag")
   static classSA method6406(int var0, int var1) {
      try {
         classSA[] var2 = new classSA[]{
            classSA.field5886,
            classSA.field5891,
            classSA.field5888,
            classSA.field5889,
            classSA.field5893,
            classSA.field5890,
            classSA.field5892,
            classSA.field5887,
            classSA.field5894
         };
         classSA var3 = (classSA)classOF.method8404(var2, var0, -1521161495);
         if (var3 == null) {
            if (var1 >= -66741249) {
               throw new IllegalStateException();
            }

            var3 = classSA.field5894;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "jr.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method6405(int var0) {
      try {
         classJZ.method6431(classPC.field5219);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "jr.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIB)Z")
   @ObfuscatedName("dl")
   static boolean method6408(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         return classFA.method4551(classCQ.field1220.field1710 * -483624883, var0, var1, var2, var3, var4, var5, -208526133);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "jr.dl(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("bc")
   public static void method6407(classLH var0, boolean var1) {
      if (var0 == null) {
         var0.method7087();
      }

      var0.method7075(0, var1, -1831449096);
   }

   classJR(int var1, int var2) {
      this.field3368 = var1 * -206831885;
      this.field3369 = var2 * 1648772719;
   }
}
