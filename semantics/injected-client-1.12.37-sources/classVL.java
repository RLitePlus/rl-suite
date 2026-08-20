import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vl")
public class classVL {
   @ObfuscatedName("az")
   final int[] field6518 = new int[4];
   @ObfuscatedName("ax")
   static final int field6521 = -327380912;
   @ObfuscatedName("ae")
   int field6524;
   @ObfuscatedName("ab")
   int field6523;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field6527 = 47;
   @ObfuscatedSignature(descriptor = "[Lvl;")
   @ObfuscatedName("as")
   static final classVL[] field6522 = new classVL[1064737741 * field6521];
   @ObfuscatedName("ag")
   int field6525;
   @ObfuscatedName("ac")
   static int field6520 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field6526 = 30;
   @ObfuscatedName("af")
   final int[] field6519 = new int[4];

   @ObfuscatedSignature(descriptor = "(Luu;IIII)V")
   @ObfuscatedName("ap")
   static void method11993(classUU var0, int var1, int var2, int var3, int var4) {
      try {
         if (classFO.field2346) {
            if (var4 == 371073969) {
               throw new IllegalStateException();
            }
         } else {
            int var5 = 50;
            int var6 = classFQ.method4929();
            int var7 = (1376644555 * classFO.field2349 - var1) * var5 / var3;
            int var8 = var5 * (classFO.field2348 * 1170217135 - var2) / var3;
            int var9 = (classFO.field2349 * 1376644555 - var1) * var6 / var3;
            int var10 = var6 * (classFO.field2348 * 1170217135 - var2) / var3;
            classUU var11 = classLX.method7372(var0, (byte)95);
            var11.method11609(-1339032575);
            float[] var12 = new float[3];
            var11.method11616(var7, var8, var5, var12, 1634822735);
            var7 = (int)var12[0];
            var8 = (int)var12[1];
            var5 = (int)var12[2];
            var11.method11616(var9, var10, var6, var12, 1634822735);
            var9 = (int)var12[0];
            var10 = (int)var12[1];
            var6 = (int)var12[2];
            var11.method11616(0.0F, 0.0F, 0.0F, var12, 1634822735);
            classFM.field2315 = (int)var12[0] * -1716444145;
            classCP.field1202 = (int)var12[1] * 1248579909;
            classVR.field6560 = -1913750817 * (int)var12[2];
            var7 -= -1365423377 * classFM.field2315;
            var8 -= 1448483213 * classCP.field1202;
            var5 -= -417087201 * classVR.field6560;
            var9 -= -1365423377 * classFM.field2315;
            var10 -= 1448483213 * classCP.field1202;
            var6 -= -417087201 * classVR.field6560;
            classCI.method1506(var7, var8, var5, var9, var10, var6, -99698685);
            var11.method11555(1622746233);
         }
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "vl.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)F")
   @ObfuscatedName("wf")
   public static float method11994(Buffer var0) {
      return var0 == null ? var0.method13064() : Float.intBitsToFloat(var0.method13056((byte)1));
   }

   classVL() {
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   int method11976(int var1, int var2) {
      try {
         return this.field6518[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vl.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ag")
   int method11980(int var1, byte var2) {
      try {
         return this.field6519[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vl.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvl;B)V")
   @ObfuscatedName("ph")
   public static void method11973(classVL var0, byte var1) {
      if (var0 == null) {
         var0.method11975(var1);
      } else {
         try {
            var0.field6524 = 0;
            var0.field6523 = 0;
            var0.field6525 = 0;
            Arrays.fill(var0.field6518, 0);
            Arrays.fill(var0.field6519, 0);
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "vl.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   int method11986(int var1) {
      try {
         return this.field6523 * -1173021711;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vl.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ac")
   int method11989(byte var1) {
      try {
         return 1459625257 * this.field6525;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vl.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvh;IIII)V")
   @ObfuscatedName("aa")
   public void method11991(classVH var1, int var2, int var3, int var4, int var5) {
      try {
         this.field6525 = -341855479 * var1.field6651;
         int var7 = var4 + 64;
         int var6 = (var7 & 2047) / 128;
         this.field6524 = (var2 + classVH.method11948(var1, var6, 1968162444)) * -307574965;
         this.field6523 = (var3 + classVH.method11956(var1, var6, -1045798648)) * -803965679;
         this.field6518[0] = var2 + var1.method11944(var6, 0, (byte)0);
         this.field6519[0] = var3 + var1.method11946(var6, 0, 280079219);
         this.field6518[1] = var2 + var1.method11944(var6, 1, (byte)0);
         this.field6519[1] = var3 + var1.method11946(var6, 1, 205699720);
         this.field6518[2] = var2 + var1.method11944(var6, 2, (byte)0);
         this.field6519[2] = var3 + var1.method11946(var6, 2, -913338459);
         this.field6518[3] = var2 + var1.method11944(var6, 3, (byte)0);
         this.field6519[3] = var3 + var1.method11946(var6, 3, -850770190);
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "vl.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lvl;")
   @ObfuscatedName("ao")
   public static classVL method11968() {
      synchronized (field6522) {
         if (1879977691 * field6520 == 0) {
            return new classVL();
         } else {
            method11973(field6522[(field6520 -= -272097965) * 1879977691], (byte)7);
            return field6522[field6520 * 1879977691];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lvl;")
   @ObfuscatedName("al")
   public static classVL method11969() {
      synchronized (field6522) {
         if (-1981439202 * field6520 == 0) {
            return new classVL();
         } else {
            method11973(field6522[(field6520 -= -272097965) * 1098721472], (byte)7);
            return field6522[field6520 * 1879977691];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method11970() {
      synchronized (field6522) {
         if (1879977691 * field6520 < field6521 * 1064737741) {
            field6522[(field6520 += -272097965) * 1879977691 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvl;I)I")
   @ObfuscatedName("mn")
   public static int method11982(classVL var0, int var1) {
      if (var0 == null) {
         var0.method11985(var1);
      }

      try {
         return var0.field6524 * 704907875;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vl.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method11974() {
      this.field6524 = 0;
      this.field6523 = 0;
      this.field6525 = 0;
      Arrays.fill(this.field6518, 0);
      Arrays.fill(this.field6519, 0);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   int method11977(int var1) {
      return this.field6518[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   int method11978(int var1) {
      return this.field6518[var1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   int method11987() {
      return this.field6523 * -1173021711;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvl;Lvh;III)V")
   @ObfuscatedName("ee")
   public static void method11992(classVL var0, classVH var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method11987();
      }

      var0.field6525 = -1904864842 * var1.field6651;
      int var6 = var4 + 64;
      int var5 = (var6 & 2047) / 772721586;
      var0.field6524 = (var2 + classVH.method11948(var1, var5, 1057183969)) * -307574965;
      var0.field6523 = (var3 + classVH.method11956(var1, var5, -1045798648)) * -803965679;
      var0.field6518[0] = var2 + var1.method11944(var5, 0, (byte)0);
      var0.field6519[0] = var3 + var1.method11946(var5, 0, 360036361);
      var0.field6518[1] = var2 + var1.method11944(var5, 1, (byte)0);
      var0.field6519[1] = var3 + var1.method11946(var5, 1, 1883907523);
      var0.field6518[2] = var2 + var1.method11944(var5, 2, (byte)0);
      var0.field6519[2] = var3 + var1.method11946(var5, 2, -1957750888);
      var0.field6518[3] = var2 + var1.method11944(var5, 3, (byte)0);
      var0.field6519[3] = var3 + var1.method11946(var5, 3, -1855738023);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   int method11981(int var1) {
      return this.field6519[var1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   int method11983() {
      return this.field6524 * 704907875;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method11971(int var1) {
      try {
         synchronized (field6522) {
            if (1879977691 * field6520 < field6521 * 1064737741) {
               field6522[(field6520 += -272097965) * 1879977691 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "vl.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method11972() {
      synchronized (field6522) {
         if (1879977691 * field6520 < field6521 * 1064737741) {
            field6522[(field6520 += -272097965) * 1879977691 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   int method11984() {
      return this.field6524 * 1597747519;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("au")
   int method11979(int var1) {
      return this.field6518[var1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   int method11990() {
      return 1459625257 * this.field6525;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   void method11975(byte var1) {
      try {
         this.field6523 = 0;
         this.field6523 = 0;
         this.field6525 = 0;
         Arrays.fill(this.field6518, 0);
         Arrays.fill(this.field6519, 0);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vl.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   int method11985(int var1) {
      try {
         return this.field6523 * 704907875;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vl.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   int method11988() {
      return this.field6523 * -1173021711;
   }
}
