import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dt")
public class classDT {
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("jc")
   static IndexedSprite[] field1630;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("af")
   final classVP field1624;
   @ObfuscatedName("ae")
   final int field1626;
   @ObfuscatedName("ab")
   int field1625 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1628 = 13;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1629 = 10000;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field1627 = 85;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldw;)I")
   @ObfuscatedName("co")
   public static int method3603(ObjectSound var0) {
      return var0.field1648 * -1766162897;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("ab")
   static final void method3602(String var0, byte var1) {
      try {
         String var2 = classKK.field3799 + var0 + classKK.field3800;
         classPH.method8883(30, "", var2, 1196754000);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dt.ab(" + ')');
      }
   }

   classDT(classVP var1, String var2) {
      this.field1624 = var1;
      this.field1626 = var1.method11832((byte)-73) * -461547673;
   }

   @ObfuscatedSignature(descriptor = "(Ldt;I)Z")
   @ObfuscatedName("hm")
   public static boolean method3597(classDT var0, int var1) {
      if (var0 == null) {
         return var0.method3601(var1);
      } else {
         try {
            var0.field1625 = 0;

            for (int var2 = 0; var2 < -452275113 * var0.field1626; var2++) {
               if (var1 == 1554777815) {
                  throw new IllegalStateException();
               }

               if (classVP.method12043(var0.field1624, var2, 1100671196)) {
                  if (var1 == 1554777815) {
                     throw new IllegalStateException();
                  }

                  if (!var0.field1624.method12040(var2, 1525597176)) {
                     continue;
                  }
               }

               var0.field1625 += 1394909781;
            }

            boolean var10000;
            if (-1687991555 * var0.field1625 >= var0.field1626 * -452275113) {
               if (var1 == 1554777815) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "dt.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lgt;")
   @ObfuscatedName("ag")
   public static classGT[] method3596(int var0) {
      try {
         return new classGT[]{classGT.field2681, classGT.field2680, classGT.field2679, classGT.field2678};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "dt.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   boolean method3598() {
      this.field1625 = 0;

      for (int var1 = 0; var1 < -452275113 * this.field1626; var1++) {
         if (!classVP.method12043(this.field1624, var1, 1100671196) || this.field1624.method12040(var1, 1525597176)) {
            this.field1625 += 1394909781;
         }
      }

      return -1687991555 * this.field1625 >= this.field1626 * -452275113;
   }

   @ObfuscatedSignature(descriptor = "(B)[Lkx;")
   @ObfuscatedName("ag")
   public static classKX[] method3599(byte var0) {
      try {
         return new classKX[]{classKX.field4049, classKX.field4047, classKX.field4051, classKX.field4046, classKX.field4050, classKX.field4048};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "dt.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldt;)Z")
   @ObfuscatedName("jm")
   public static boolean method3600(classDT var0) {
      if (var0 == null) {
         return var0.method3598();
      } else {
         var0.field1625 = 0;

         for (int var1 = 0; var1 < -452275113 * var0.field1626; var1++) {
            if (!classVP.method12043(var0.field1624, var1, 1100671196) || var0.field1624.method12040(var1, 1525597176)) {
               var0.field1625 += 1394909781;
            }
         }

         return -1687991555 * var0.field1625 >= var0.field1626 * -452275113;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   boolean method3601(int var1) {
      try {
         this.field1625 = 0;

         for (int var2 = 0; var2 < -452275113 * this.field1626; var2++) {
            if (var1 == 1554777815) {
               throw new IllegalStateException();
            }

            if (classVP.method12043(this.field1624, var2, 1100671196)) {
               if (var1 == 1554777815) {
                  throw new IllegalStateException();
               }

               if (!this.field1624.method12040(var2, 1525597176)) {
                  continue;
               }
            }

            this.field1625 += 1394909781;
         }

         boolean var10000;
         if (-1687991555 * this.field1625 >= this.field1626 * -452275113) {
            if (var1 == 1554777815) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dt.az(" + ')');
      }
   }
}
