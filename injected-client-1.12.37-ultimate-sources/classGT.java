import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gt")
public class classGT implements classXZ {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2683 = 512;
   @ObfuscatedSignature(descriptor = "Lgt;")
   @ObfuscatedName("af")
   public static final classGT field2679 = new classGT((byte)0);
   @ObfuscatedSignature(descriptor = "Lgt;")
   @ObfuscatedName("ae")
   public static final classGT field2680 = new classGT((byte)1);
   @ObfuscatedName("pp")
   static int field2685;
   @ObfuscatedName("ag")
   final byte field2682;
   @ObfuscatedSignature(descriptor = "Lgt;")
   @ObfuscatedName("az")
   public static final classGT field2678 = new classGT((byte)-1);
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field2684 = 6;
   @ObfuscatedSignature(descriptor = "Lgt;")
   @ObfuscatedName("ab")
   public static final classGT field2681 = new classGT((byte)2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwd;)I")
   @ObfuscatedName("dc")
   public static int method5747(classWD var0) {
      return -1834437093 * var0.field6667;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpw;)Lpw;")
   @ObfuscatedName("og")
   public static classPW method5749(classPW var0) {
      if (var0 == null) {
         var0.method9347();
      }

      int var1 = -1;
      if (-1 != var0.field5462 * 1137484171) {
         var1 = classEM.method3922(var0.field5462 * 1465502619, -1743594932);
      } else if (1654141009 * var0.field5463 != -1) {
         var1 = classLB.field4090[-1836150061 * var0.field5463];
      }

      int var2;
      if (var1 >= 0 && var1 < var0.field5455.length - 1) {
         var2 = var0.field5455[var1];
      } else {
         var2 = var0.field5455[var0.field5455.length - 1];
      }

      return -1 != var2 ? classDJ.method3373(var2, (byte)110) : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field2682;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field2682;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gt.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lgt;")
   @ObfuscatedName("ax")
   public static classGT[] method5745() {
      return new classGT[]{field2681, field2680, field2679, field2678};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field2682;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhh;)V")
   @ObfuscatedName("sh")
   public static void method5748(classHH var0) {
      byte[] var1 = new byte[var0.field2795 * -1179191606 * -2111278427 * var0.field2795];
      int var2 = 0;

      for (int var3 = 1892782012 * var0.field2795 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < var0.field2795 * 1385383905; var4++) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.field2800[1][0] = var1;
      var1 = new byte[var0.field2795 * 1966526081 * -1158749411 * var0.field2795];
      var2 = 0;

      for (int var11 = 0; var11 < 1966526081 * var0.field2795; var11++) {
         for (int var14 = 0; var14 < 1472599212 * var0.field2795; var14++) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var14 >= var11 << 1) {
                  var1[var2] = -1;
               }

               var2++;
            } else {
               var2++;
            }
         }
      }

      var0.field2800[1][1] = var1;
      var1 = new byte[-586639119 * var0.field2795 * var0.field2795 * -495767958];
      var2 = 0;

      for (int var12 = 0; var12 < var0.field2795 * -920890785; var12++) {
         for (int var15 = var0.field2795 * 1966526081 - 1; var15 >= 0; var15--) {
            if (var15 <= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.field2800[1][2] = var1;
      var1 = new byte[var0.field2795 * 1528503359 * -370296244 * var0.field2795];
      var2 = 0;

      for (int var13 = -537924661 * var0.field2795 - 1; var13 >= 0; var13--) {
         for (int var16 = 1966526081 * var0.field2795 - 1; var16 >= 0; var16--) {
            if (var16 >= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.field2800[1][3] = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field2682;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lgt;")
   @ObfuscatedName("as")
   public static classGT[] method5746() {
      return new classGT[]{field2681, field2680, field2679, field2678};
   }

   classGT(byte var1) {
      this.field2682 = var1;
   }
}
