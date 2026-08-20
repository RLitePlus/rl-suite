import net.runelite.api.Perspective;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gb")
public class classGB {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field2545 = 16384;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field2542 = 16383;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2541 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2543 = 65536;
   @ObfuscatedName("ax")
   static final int[] field2540 = new int[16384];
   @ObfuscatedName("km")
   static boolean field2547;
   @ObfuscatedName("aa")
   public static final float[] field2539 = new float[16384];
   @ObfuscatedName("as")
   static final int[] field2537 = new int[16384];
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("co")
   static classPQ field2546;
   @ObfuscatedName("ac")
   public static final float[] field2538 = new float[16384];
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field2544 = 12;

   static {
      for (int var0 = 0; var0 < 16384; var0++) {
         field2537[var0] = (int)(65536.0 * Math.sin(3.834951969714103E-4 * var0));
         field2540[var0] = (int)(65536.0 * Math.cos(3.834951969714103E-4 * var0));
         field2538[var0] = (float)Math.sin(3.834951969714103E-4 * var0);
         field2539[var0] = (float)Math.cos(3.834951969714103E-4 * var0);
      }

      field2537 = Perspective.SINE14;
      field2540 = Perspective.COSINE14;
      field2538 = Perspective.SINEF14;
      field2539 = Perspective.COSINEF14;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public static int method5294(int var0) {
      return field2537[var0 & 16383];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public static int method5295(int var0) {
      return field2537[var0 & 855428982];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public static int method5296(int var0) {
      return field2537[var0 & 16383];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public static int method5297(int var0) {
      return field2537[var0 & 16383];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Loz;")
   @ObfuscatedName("zj")
   public static classOZ method5302(classPL var0) {
      return var0.field5318;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("zj")
   public static boolean method5303(classLW var0) {
      return 11 == var0.field4375 * -1510882375 || var0.field4375 * -1510882375 == 12;
   }

   classGB() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   public static int method5298(int var0) {
      return field2537[var0 & 16383];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aa")
   public static int method5299(int var0) {
      return field2540[var0 & 753270889];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   public static int method5300(int var0) {
      return field2540[var0 & 16383];
   }

   @ObfuscatedSignature(descriptor = "(I[IIB)V")
   @ObfuscatedName("az")
   static void method5301(int var0, int[] var1, int var2, byte var3) {
      try {
         for (int var4 = 0; var4 < classOA.method8289((byte)81); var4++) {
            classOF var5 = classHW.method6123(var4, -1876621299);
            if (null != var5) {
               if (var3 != 8) {
                  throw new IllegalStateException();
               }

               if (!var5.field4851) {
                  if (var3 != 8) {
                     throw new IllegalStateException();
                  }

                  if (var5.method8412(var2, var0, -2073253202)) {
                     if (var3 != 8) {
                        throw new IllegalStateException();
                     }

                     var1[classON.method8611(var2, (byte)69)] = 256 + var4;
                     break;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gb.az(" + ')');
      }
   }
}
