import java.util.ArrayList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pg")
public class classPG extends classVJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field5248 = 48;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5245 = 2;
   @ObfuscatedName("al")
   final int[] field5242;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5243 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field5246 = 8;
   @ObfuscatedSignature(descriptor = "Lwd;")
   @ObfuscatedName("ay")
   final classWD field5239;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ac")
   static EvictingDualNodeHashTable field5238 = new EvictingDualNodeHashTable(16);
   @ObfuscatedName("ao")
   final int field5240;
   @ObfuscatedName("aj")
   final List field5241 = new ArrayList(8);
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5244 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5249 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field5247 = 8;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpg;")
   @ObfuscatedName("ap")
   public static classPG method8862(int var0) {
      classPG var1 = (classPG)field5238.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classBQ.field531.method11867(15, var0, -923256858);
         var1 = new classPG(new classXY(var2), var0);
         field5238.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ab")
   public int method8866(byte var1) {
      try {
         return this.field5240 * 874995967;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pg.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ag")
   public int method8869(byte var1) {
      try {
         int var10000;
         if (null != this.field5242) {
            if (var1 <= 60) {
               throw new IllegalStateException();
            }

            var10000 = this.field5242.length;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pg.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public int method8875(int var1) {
      try {
         return this.field5241.size();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pg.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lwd;")
   @ObfuscatedName("aa")
   public classWD method8880(int var1) {
      try {
         return this.field5239;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pg.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpg;I)Lww;")
   @ObfuscatedName("uc")
   public static classWW method8876(classPG var0, int var1) {
      return (classWW)var0.field5241.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(IB)Lww;")
   @ObfuscatedName("ac")
   public classWW method8877(int var1, byte var2) {
      try {
         return (classWW)this.field5241.get(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pg.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpg;")
   @ObfuscatedName("ai")
   public static classPG method8863(int var0) {
      classPG var1 = (classPG)field5238.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classBQ.field531.method11867(15, var0, -777243510);
         var1 = new classPG(new classXY(var2), var0);
         field5238.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lww;")
   @ObfuscatedName("ah")
   public classWW method8878(int var1) {
      return (classWW)this.field5241.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("al")
   public static void method8857(AbstractArchive var0) {
      classBQ.field531 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public static void method8859() {
      EvictingDualNodeHashTable.method6431(field5238);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public static void method8860() {
      EvictingDualNodeHashTable.method6431(field5238);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public static void method8861() {
      EvictingDualNodeHashTable.method6431(field5238);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpg;)I")
   @ObfuscatedName("wf")
   public static int method8867(classPG var0) {
      return var0.field5240 * 874995967;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpg;")
   @ObfuscatedName("ad")
   public static classPG method8864(int var0) {
      classPG var1 = (classPG)field5238.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classBQ.field531.method11867(15, var0, -1382632228);
         var1 = new classPG(new classXY(var2), var0);
         field5238.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public int method8870() {
      return null != this.field5242 ? this.field5242.length : 0;
   }

   classPG(classXY var1, int var2) {
      this.field5239 = new classWD();
      this.field5240 = -132669697 * var2;
      int[] var3 = null;
      if (var1 != null && var1.field6954 != null) {
         label66:
         while (true) {
            int var4 = classXY.method13039(var1, -346779531);
            switch (var4) {
               case 0:
                  break label66;
               case 1:
                  int var12 = classXY.method13039(var1, -346779531);
                  var3 = new int[var12];

                  for (int var15 = 0; var15 < var12; var15++) {
                     var3[var15] = classXY.method13047(var1, -1461538641);
                  }
                  break;
               case 2:
                  int var11 = classXY.method13047(var1, -36182986) * 20;
                  int var14 = classXY.method13047(var1, 141911779) * 20;
                  int var7 = classXY.method13039(var1, -346779531);
                  int[] var17 = new int[var7];

                  for (int var9 = 0; var9 < var7; var9++) {
                     var17[var9] = classXY.method13047(var1, -1095243703);
                  }

                  if (var7 <= 48 && this.field5241.size() < 8) {
                     this.field5241.add(new classWW(var17, var11, var14));
                  }
                  break;
               case 3:
                  int var13 = classXY.method13039(var1, -346779531);
                  classZL var10 = classZL.field7201[var13];
                  int var16 = classXY.method13047(var1, 1583176156) * 20;
                  this.field5239.method12314(var10, var16, (byte)23);
                  break;
               case 4:
                  int var6 = classXY.method13039(var1, -346779531);
                  classZL var5 = classZL.field7201[var6];
                  int var8 = classXY.method13047(var1, 665438358) * 20;
                  this.field5239.method12317(var5, var8, -388881497);
            }
         }
      }

      this.field5242 = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpg;")
   @ObfuscatedName("au")
   public static classPG method8865(int var0) {
      classPG var1 = (classPG)field5238.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classBQ.field531.method11867(15, var0, -997029302);
         var1 = new classPG(new classXY(var2), var0);
         field5238.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public int method8868() {
      return this.field5240 * -1569817733;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public int method8871() {
      return null != this.field5242 ? this.field5242.length : 0;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   public int method8873(int var1, int var2) {
      try {
         int var10000;
         if (null != this.field5242) {
            if (var2 == -46986528) {
               throw new IllegalStateException();
            }

            var10000 = this.field5242[var1];
         } else {
            var10000 = -1;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pg.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method8874(int var1) {
      return null != this.field5242 ? this.field5242[var1] : -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lww;")
   @ObfuscatedName("bx")
   public classWW method8879(int var1) {
      return (classWW)this.field5241.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ao")
   public static void method8858(AbstractArchive var0) {
      classBQ.field531 = var0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   public int method8872() {
      return null != this.field5242 ? this.field5242.length : 0;
   }
}
