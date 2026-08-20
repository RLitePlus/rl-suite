import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("em")
public class classEM extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field1791 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field1790 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field1789 = 5;
   @ObfuscatedName("as")
   int field1786;
   @ObfuscatedName("ax")
   int[] field1785;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field1792 = 1;
   @ObfuscatedSignature(descriptor = "Lef;")
   @ObfuscatedName("aa")
   classEF field1788;
   @ObfuscatedName("ac")
   int[][] field1787;

   @ObfuscatedSignature(descriptor = "(B)Lef;")
   @ObfuscatedName("af")
   public classEF method3924(byte var1) {
      try {
         return this.field1788;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "em.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   public int method3923(int var1) {
      try {
         return 1690200285 * this.field1786;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "em.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lef;")
   @ObfuscatedName("ab")
   public classEF method3925() {
      return this.field1788;
   }

   @ObfuscatedSignature(descriptor = "()Lef;")
   @ObfuscatedName("ae")
   public classEF method3926() {
      return this.field1788;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   static void method3928(int var0) {
      try {
         if (-47366135 * classBF.field384 == 34) {
            if (var0 != Integer.MAX_VALUE) {
               throw new IllegalStateException();
            }

            classBJ.method1117(false, -347989319);
         }

         classBF.field413 = false;
         classYW.method13698(0, 0, classYW.field7102, classYW.field7101, 0);
         classNI.field4673.method13508(classBF.field385 * -329898575, 0);
         classFR.field2391.method13508(382 + classBF.field385 * -329898575, 0);
         IndexedSprite.method13810(AABB.field2372, 382 + classBF.field385 * -329898575 - AABB.field2372.field7121 / 2, 18);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "em.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lef;")
   @ObfuscatedName("ag")
   public classEF method3927() {
      return this.field1788;
   }

   public classEM(int var1, byte[] var2) {
      classXY var3 = new classXY(var2);
      this.field1786 = classXY.method13039(var3, -346779531) * 776449909;
      this.field1785 = new int[1690200285 * this.field1786];
      this.field1787 = new int[1690200285 * this.field1786][];

      for (int var4 = 0; var4 < 1690200285 * this.field1786; var4++) {
         this.field1785[var4] = classXY.method13039(var3, -346779531);
      }

      for (int var6 = 0; var6 < this.field1786 * 1690200285; var6++) {
         this.field1787[var6] = new int[classXY.method13039(var3, -346779531)];
      }

      for (int var7 = 0; var7 < this.field1786 * 1690200285; var7++) {
         for (int var5 = 0; var5 < this.field1787[var7].length; var5++) {
            this.field1787[var7][var5] = classXY.method13039(var3, -346779531);
         }
      }

      if (var3.field6955 * 702114061 < var3.field6954.length) {
         int var8 = classXY.method13047(var3, 1114906404);
         if (var8 > 0) {
            this.field1788 = new classEF(var3, var8);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public static int method3922(int var0, int var1) {
      try {
         VarbitComposition var2 = classOL.method8510(var0, (short)1781);
         int var3 = -1681019861 * var2.field5420;
         int var4 = -526564793 * var2.field5419;
         int var5 = 2095283109 * var2.field5421;
         int var6 = classLB.field4085[var5 - var4];
         return classLB.field4090[var3] >> var4 & var6;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "em.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("fa")
   static final void method3929(byte var0) {
      try {
         classKL.method6494(-1889122330);
         classDO.method3509((byte)71);
         classGI.method5464(-1952648005);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "em.fa(" + ')');
      }
   }
}
