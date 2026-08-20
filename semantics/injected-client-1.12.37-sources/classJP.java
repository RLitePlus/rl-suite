import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jp")
public class classJP {
   @ObfuscatedName("dr")
   public static boolean field3357;
   @ObfuscatedSignature(descriptor = "Ljp;")
   @ObfuscatedName("af")
   static final classJP field3354 = new classJP(classGN.method5503((byte)77) + 1);
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field3355 = 1;
   @ObfuscatedSignature(descriptor = "Ljp;")
   @ObfuscatedName("az")
   static final classJP field3353 = new classJP(classGN.method5503((byte)70) + 1);
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field3356 = 60;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;Z)V")
   @ObfuscatedName("eb")
   public static void method6403(classLH var0, boolean var1) {
      if (var0 == null) {
         var0.method7083();
      }

      var0.field4145 = var1;
      var0.field4143 = var1 && var0.field4143;
   }

   classJP(int var1) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   static int method6400() {
      return classDG.method3057(98, 198, (byte)-12);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   public static int method6401(int var0, int var1) {
      return var0 << 8 | var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ag")
   public static int method6402(int var0, int var1, int var2, int var3) {
      try {
         int var4 = (int)classOW.method8807(1 + (var2 - var1), 2039590920);
         var4 <<= var1;
         int var6;
         return var6 = var0 & ~var4;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "jp.ag(" + 41);
      }
   }
}
