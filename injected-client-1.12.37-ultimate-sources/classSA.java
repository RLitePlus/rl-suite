import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sa")
public class classSA implements classXZ {
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("ag")
   static final classSA field5893 = new classSA(4, 4);
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("ae")
   static final classSA field5888 = new classSA(2, 2);
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("az")
   static final classSA field5886 = new classSA(0, 0);
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("ab")
   static final classSA field5889 = new classSA(3, 3);
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("as")
   static final classSA field5890 = new classSA(5, 5);
   @ObfuscatedName("al")
   final int field5895;
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("ax")
   static final classSA field5892 = new classSA(6, 6);
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("ac")
   static final classSA field5887 = new classSA(7, 7);
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("aa")
   static final classSA field5894 = new classSA(8, 8);
   @ObfuscatedName("ao")
   final int field5896;
   @ObfuscatedName("qy")
   public static int field5897;
   @ObfuscatedSignature(descriptor = "Lsa;")
   @ObfuscatedName("af")
   static final classSA field5891 = new classSA(1, 1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field5895 * -1377265651;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field5895 * -1377265651;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sa.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field5895 * 1175252113;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lsa;")
   @ObfuscatedName("as")
   static classSA method10356(int var0) {
      classSA[] var1 = new classSA[]{field5886, field5891, field5888, field5889, field5893, field5890, field5892, field5887, field5894};
      classSA var2 = (classSA)classOF.method8404(var1, var0, 715458713);
      if (var2 == null) {
         var2 = field5894;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(JIII)J")
   @ObfuscatedName("as")
   public static long method10355(long var0, int var2, int var3, int var4) {
      try {
         long var5 = classOW.method8807(var3 - var2 + 1, 42311358);
         var5 <<= var2;
         long var8;
         return var8 = var0 & ~var5;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "sa.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lym;")
   @ObfuscatedName("aa")
   static classYM method10357(byte var0) {
      try {
         classYM var1 = new classYM();
         var1.field7006 = classYL.field7000 * -1073038619;
         var1.field7008 = classYL.field6999 * -1062567517;
         var1.field7010 = classYL.field7002[0];
         var1.field7011 = classYL.field7003[0];
         var1.field7007 = classPO.field5371[0];
         var1.field7009 = classGG.field2578[0];
         int var2 = var1.field7009 * var1.field7007;
         byte[] var3 = classYL.field7004[0];
         var1.field7005 = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            if (var0 == 25) {
               throw new IllegalStateException();
            }

            var1.field7005[var4] = classRB.field5639[var3[var4] & 255];
         }

         classVZ.method12278((byte)60);
         return var1;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "sa.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field5895 * 1562037963;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public static int method10354(int var0, int var1) {
      try {
         return var0 >>> 12;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sa.az(" + 41);
      }
   }

   classSA(int var1, int var2) {
      this.field5896 = -452794877 * var1;
      this.field5895 = var2 * 2103539397;
   }
}
