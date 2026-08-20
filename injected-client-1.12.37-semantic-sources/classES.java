import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("es")
public class classES extends classRD {
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   public static final int field1903 = 2048;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   public static final int field1902 = 56;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("av")
   static AbstractArchive field1904;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field1901 = 150;
   @ObfuscatedName("az")
   final boolean field1900;

   public classES(boolean var1) {
      this.field1900 = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return method4072(this, (Buddy)var1, (Buddy)var2, 580558154);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "es.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method4074(Object var1, Object var2) {
      return method4072(this, (Buddy)var1, (Buddy)var2, 1834300038);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Les;Lri;Lri;)I")
   @ObfuscatedName("gt")
   public static int method4069(classES var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         var0.method4070(var1, var1);
      }

      if (0 != 355214098 * var1.field5669 && -760305529 * var2.field5669 != 0) {
         return var0.field1900
            ? classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519)
            : classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
      } else {
         return classRD.method9942(var0, var1, var2, 1832006784);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("af")
   int method4070(Buddy var1, Buddy var2) {
      if (0 != 63821246 * var1.field5669 && 1527032954 * var2.field5669 != 0) {
         return this.field1900
            ? classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519)
            : classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
      } else {
         return classRD.method9942(this, var1, var2, 1447181937);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("ab")
   int method4071(Buddy var1, Buddy var2) {
      if (0 != -1785929601 * var1.field5669 && -2118451833 * var2.field5669 != 0) {
         return this.field1900
            ? classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519)
            : classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
      } else {
         return classRD.method9942(this, var1, var2, 1681395945);
      }
   }

   @ObfuscatedSignature(descriptor = "(Les;Lri;Lri;I)I")
   @ObfuscatedName("wb")
   public static int method4072(classES var0, Buddy var1, Buddy var2, int var3) {
      if (var0 == null) {
         return var0.method4073(var1, var1, var3);
      } else {
         try {
            if (0 != -760305529 * var1.field5669) {
               if (var3 == -818448895) {
                  throw new IllegalStateException();
               }

               if (-760305529 * var2.field5669 != 0) {
                  int var10000;
                  if (var0.field1900) {
                     if (var3 == -818448895) {
                        throw new IllegalStateException();
                     }

                     var10000 = classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519);
                  } else {
                     var10000 = classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
                  }

                  return var10000;
               }
            }

            return classRD.method9942(var0, var1, var2, 1575825425);
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "es.az(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIII)V")
   @ObfuscatedName("ag")
   static void method4075(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         classDF var7 = client.field837;
         int var8 = 927693091 * client.field971;
         int var9 = -2130951373 * client.field845;
         int var10 = -2087374717 * var7.field1419;
         int[] var11 = var7.field1423;

         for (int var12 = 0; var12 < var10 + classZH.method14003(var0.field1697, (byte)10); var12++) {
            if (var6 == -929369206) {
               return;
            }

            Actor var13;
            if (var12 < var10) {
               if (var6 == -929369206) {
                  throw new IllegalStateException();
               }

               var13 = (Actor)var0.field1694.method13404(var11[var12]);
               if (var11[var12] == var8) {
                  continue;
               }

               if (var6 == -929369206) {
                  throw new IllegalStateException();
               }

               if (var11[var12] == var9) {
                  continue;
               }
            } else {
               var13 = (Actor)var0.field1698.method13404(var0.field1697.method14001(var12 - var10, 1596834634));
            }

            classAU.method715(var0, var13, var12, var1, var2, var3, var4, var5, (byte)12);
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "es.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;I)I")
   @ObfuscatedName("az")
   int method4073(Buddy var1, Buddy var2, int var3) {
      try {
         if (0 != -760305529 * var1.field5671) {
            if (var3 == -818448895) {
               throw new IllegalStateException();
            }

            if (-760305529 * var2.field5669 != 0) {
               int var10000;
               if (this.field1900) {
                  if (var3 == -818448895) {
                     throw new IllegalStateException();
                  }

                  var10000 = classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519);
               } else {
                  var10000 = classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
               }

               return var10000;
            }
         }

         return classRD.method9942(this, var1, var2, 1575825425);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "es.az(" + 41);
      }
   }
}
