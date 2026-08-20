import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gw")
public class classGW {
   @ObfuscatedSignature(descriptor = "Lgw;")
   @ObfuscatedName("af")
   static final classGW field2720 = new classGW(2, 16, 16);
   @ObfuscatedSignature(descriptor = "Lgw;")
   @ObfuscatedName("ae")
   static final classGW field2719 = new classGW(6, 32, 32);
   @ObfuscatedSignature(descriptor = "Lgw;")
   @ObfuscatedName("az")
   static final classGW field2717 = new classGW(3, 8, 8);
   @ObfuscatedSignature(descriptor = "Lgw;")
   @ObfuscatedName("ab")
   static final classGW field2718 = new classGW(0, 48, 48);
   @ObfuscatedSignature(descriptor = "Lgw;")
   @ObfuscatedName("ax")
   static final classGW field2723 = new classGW(1, 128, 128);
   @ObfuscatedSignature(descriptor = "Lgw;")
   @ObfuscatedName("as")
   static final classGW field2722 = new classGW(5, 96, 96);
   @ObfuscatedSignature(descriptor = "Lgw;")
   @ObfuscatedName("ag")
   static final classGW field2721 = new classGW(4, 64, 64);
   @ObfuscatedName("ac")
   final int field2727;
   @ObfuscatedSignature(descriptor = "[Lgw;")
   @ObfuscatedName("aa")
   static final classGW[] field2724 = classEA.method3797(-971908582);
   @ObfuscatedName("ao")
   final int field2726;
   @ObfuscatedName("al")
   final int field2725;
   @ToRemove(unused = "true")
   @ObfuscatedName("ct")
   static final int field2729 = 109;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   public static final int field2728 = 31;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lgw;")
   @ObfuscatedName("ae")
   static classGW[] method5812() {
      return new classGW[]{field2718, field2723, field2720, field2717, field2721, field2722, field2719};
   }

   static {
      Arrays.sort(field2724, new classGD());
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   int method5814() {
      return this.field2725 * 645983023 * this.field2726 * 2032697513;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lgw;")
   @ObfuscatedName("ab")
   static classGW[] method5813() {
      return new classGW[]{field2718, field2723, field2720, field2717, field2721, field2722, field2719};
   }

   classGW(int var1, int var2, int var3) {
      this.field2727 = var1 * -1672527929;
      this.field2726 = 1319833 * var2;
      this.field2725 = var3 * -1244513329;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   int method5815() {
      return this.field2725 * 645983023 * this.field2726 * 2032697513;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   int method5816() {
      return this.field2725 * 185898137 * this.field2726 * 1062075444;
   }

   @ObfuscatedSignature(descriptor = "(Lgw;I)I")
   @ObfuscatedName("vy")
   public static int method5817(classGW var0, int var1) {
      if (var0 == null) {
         return var0.method5818(var1);
      } else {
         try {
            return var0.field2725 * 645983023 * var0.field2726 * 2032697513;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "gw.af(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   int method5818(int var1) {
      try {
         return this.field2726 * 645983023 * this.field2727 * 2032697513;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gw.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   int method5819() {
      return this.field2725 * 185898137 * this.field2726 * 1062075444;
   }
}
