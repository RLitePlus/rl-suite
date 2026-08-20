import net.runelite.api.IterableHashTable;
import net.runelite.api.StructComposition;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pr")
public class classPR extends classVJ implements StructComposition, rl9 {
   @rl8(method10126 = 16)
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("ab")
   IterableNodeHashTable field5387;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field5389 = 2097152;
   @ObfuscatedName("zj")
   public int field5386 = -1;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ae")
   static EvictingDualNodeHashTable field5385 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5390 = 249;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("af")
   public static AbstractArchive field5391;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field5388 = 30;

   @ObfuscatedSignature(descriptor = "(Lpr;IJ)J")
   @ObfuscatedName("gv")
   public static long method9173(classPR var0, int var1, long var2) {
      if (var0 == null) {
         return var0.method9176(var1, var2);
      } else {
         try {
            return classBW.method1276(var0.field5387, var1, var2);
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "pr.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;S)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public String method9177(int var1, String var2, short var3) {
      try {
         return classFS.method4977(this.field5387, var1, var2, (byte)99);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pr.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ae")
   public int method9169(int var1, int var2, byte var3) {
      try {
         return classGQ.method5602(this.field5387, var1, var2, -828988955);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pr.ae(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsg;I)[F")
   @ObfuscatedName("pd")
   public static float[] method9181(classSG var0, int var1) {
      return var0.field5933[var1];
   }

   public int getId() {
      return this.field5386;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpr;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("dl")
   public static String method9178(classPR var0, int var1, String var2) {
      return var0 == null ? var0.method9180(var1, var2) : classFS.method4977(var0.field5387, var1, var2, (byte)111);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpr;II)I")
   @ObfuscatedName("my")
   public static int method9170(classPR var0, int var1, int var2) {
      return classGQ.method5602(var0.field5387, var1, var2, -349746830);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aa")
   public int method9171(int var1, int var2) {
      return classGQ.method5602(this.field5387, var1, var2, 373211485);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpr;")
   @ObfuscatedName("as")
   public static classPR method9167(int var0) {
      classPR var1 = (classPR)field5385.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field5391.method11867(-281613, var0, -1592183963);
         var1 = new classPR(new classXY(var2), var0);
         field5385.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public static void method9168() {
      EvictingDualNodeHashTable.method6431(field5385);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ac")
   public int method9172(int var1, int var2) {
      return classGQ.method5602(this.field5387, var1, var2, -863267617);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ad")
   public String method9179(int var1, String var2) {
      return classFS.method4977(this.field5387, var1, var2, (byte)41);
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("aq")
   public long method9174(int var1, long var2) {
      return classBW.method1276(this.field5387, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("ab")
   public long method9175(int var1, long var2) {
      return classBW.method1276(this.field5387, var1, var2);
   }

   classPR(classXY var1, int var2) {
      IterableNodeHashTable var3 = null;
      if (null != var1 && var1.field6954 != null) {
         label32:
         while (true) {
            int var4 = classXY.method13039(var1, -346779531);
            switch (var4) {
               case 0:
                  break label32;
               case 249:
                  var3 = classQH.method9525(var1, var3, 1978086108);
            }
         }
      }

      if (var3 == null) {
         this.field5387 = new IterableNodeHashTable(1);
      } else {
         this.field5387 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("vy")
   @Override
   public void vmethod537(IterableNodeHashTable var1) {
      this.field5387 = var1;
   }

   public IterableHashTable getParams() {
      return this.field5387;
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("ay")
   public long method9176(int var1, long var2) {
      try {
         return classBW.method1276(this.field5387, var1, var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pr.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String method9180(int var1, String var2) {
      return classFS.method4977(this.field5387, var1, var2, (byte)111);
   }
}
