import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jk")
public class classJK {
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   static final boolean field3332 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3323 = -2;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field3325 = 338;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field3327 = 20;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field3328 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field3326 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3329 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   public static final int field3331 = 26;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field3322 = -3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field3324 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   static final int field3330 = 115;

   @ObfuscatedSignature(descriptor = "(Ldz;III)V")
   @ObfuscatedName("ea")
   static final void method6377(WorldView var0, int var1, int var2, int var3) {
      try {
         classLJ.method7116(var0, var0.field1710 * -483624883, var1, var2, (byte)3);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "jk.ea(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("tw")
   public static boolean method6376(classQM var0) {
      if (var0 == null) {
         var0.method9649();
      }

      return classQM.method9640(var0, -1640283079) ? true : var0.field5560.isDone();
   }

   classJK() throws Throwable {
      throw new Error();
   }
}
