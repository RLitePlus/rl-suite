import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vz")
public class classVZ {
   @ObfuscatedName("al")
   final int field6648;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field6652 = 2;
   @ObfuscatedName("ap")
   final int field6650;
   @ObfuscatedName("aj")
   final int field6647;
   @ObfuscatedName("ao")
   final int field6646;
   @ObfuscatedName("ay")
   final int field6645;
   @ObfuscatedName("aq")
   final int field6651;
   @ObfuscatedName("ad")
   final int field6649;

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ay")
   public static void method12278(byte var0) {
      try {
         classYL.field7002 = null;
         classYL.field7003 = null;
         classPO.field5371 = null;
         classGG.field2578 = null;
         classRB.field5639 = null;
         classYL.field7004 = (byte[][])null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "vz.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvz;)Ljava/lang/String;")
   @ObfuscatedName("ba")
   public static String method12273(classVZ var0) {
      return String.format(
         "%dx%d (offset %d,%d)", var0.field6648 * -789644154, var0.field6649 * -1446020951, var0.field6646 * -1311898939, -1680480153 * var0.field6645
      );
   }

   @Override
   public String toString() {
      try {
         return String.format(
            "%dx%d (offset %d,%d)", this.field6648 * -105665105, this.field6649 * 1760347583, this.field6646 * -1311898939, -1680480153 * this.field6645
         );
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "vz.toString(" + ')');
      }
   }

   classVZ(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field6648 = var1 * 2004994383;
      this.field6649 = var2 * 557197887;
      this.field6646 = var3 * 282078221;
      this.field6645 = 402830167 * var4;
      this.field6650 = var1 / 2 * 1073883851;
      this.field6647 = -2133131775 * (var2 / 2);
      this.field6651 = -513216623 * (this.field6650 * 1905552099 * 1905552099 * this.field6650 + this.field6647 * 455672321 * this.field6647 * 455672321);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method12274() {
      return String.format(
         "%dx%d (offset %d,%d)", this.field6648 * 2127347528, this.field6649 * 1750965116, this.field6646 * -1311898939, 440527287 * this.field6645
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lti;Ltl;I)V")
   @ObfuscatedName("oi")
   public static void method12276(classTI var0, classTL var1, int var2) {
      var0.field6143[var2] = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)Ljava/lang/String;")
   @ObfuscatedName("tf")
   public static String method12277(classKY var0) {
      if (var0 == null) {
         var0.method6639();
      }

      return var0.method6645(",", -1962339892);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method12275() {
      return String.format(
         "%dx%d (offset %d,%d)", this.field6648 * 335305802, this.field6649 * 1760347583, this.field6646 * -679072695, 652342371 * this.field6645
      );
   }
}
