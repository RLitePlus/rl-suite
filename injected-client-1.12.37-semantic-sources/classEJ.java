import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ej")
public class classEJ extends classRD {
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final String field1775 = "h";
   @ObfuscatedName("az")
   final boolean field1773;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field1774 = 15;

   public classEJ(boolean var1) {
      this.field1773 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("af")
   int method3900(Buddy var1, Buddy var2) {
      if (-760305529 * var1.field5669 == client.field827 * 1311484143) {
         if (1311484143 * client.field827 != var2.field5669 * -760305529) {
            return this.field1773 ? -1 : 1;
         }
      } else if (-760305529 * var2.field5669 == client.field827 * 1311484143) {
         return this.field1773 ? 1 : -1;
      }

      return classRD.method9942(this, var1, var2, 1858943394);
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;I)I")
   @ObfuscatedName("az")
   int method3901(Buddy var1, Buddy var2, int var3) {
      try {
         if (-760305529 * var1.field5669 == client.field827 * 1311484143) {
            if (var3 >= -1341891501) {
               throw new IllegalStateException();
            }

            if (1311484143 * client.field827 != var2.field5669 * -760305529) {
               if (var3 >= -1341891501) {
                  throw new IllegalStateException();
               }

               byte var10000;
               if (this.field1773) {
                  if (var3 >= -1341891501) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if (-760305529 * var2.field5669 == client.field827 * 1311484143) {
            if (var3 >= -1341891501) {
               throw new IllegalStateException();
            }

            byte var5;
            if (this.field1773) {
               if (var3 >= -1341891501) {
                  throw new IllegalStateException();
               }

               var5 = 1;
            } else {
               var5 = -1;
            }

            return var5;
         }

         return classRD.method9942(this, var1, var2, 1202169509);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ej.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method3902(Object var1, Object var2) {
      return this.method3901((Buddy)var1, (Buddy)var2, -1574122224);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method3901((Buddy)var1, (Buddy)var2, -1626307165);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ej.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqr;ILqv;I)I")
   @ObfuscatedName("af")
   static int method3903(classQR var0, int var1, classQV var2, int var3) {
      try {
         byte var4 = 0;
         SequenceDefinition var5 = var0.method9731((byte)6);
         if (var5.field5134 * 1665914959 > 0 && var1 > 0) {
            var1 -= 1665914959 * var5.field5134 * ((var1 - 1) / (1665914959 * var5.field5134));
         }

         int var6 = var0.method9738(1792305329);
         int var7 = classQR.method9743(var0, 22636646);

         while (var1 > 0) {
            if (var3 == -1090541576) {
               throw new IllegalStateException();
            }

            var1--;
            var6++;
            var4 |= 4;
            if (0 == (var4 & 2)) {
               if (var3 == -1090541576) {
                  throw new IllegalStateException();
               }

               if (null != var2) {
                  if (var3 == -1090541576) {
                     throw new IllegalStateException();
                  }

                  var2.vmethod13(var5, var6, 411323389);
               }
            }

            int var8 = var5.method8771(1901014809);
            if (var6 >= var8) {
               if (var3 == -1090541576) {
                  throw new IllegalStateException();
               }

               var7++;
               var4 |= 1;
               var6 -= var5.field5134 * 1665914959;
               if (var7 >= 2035920365 * var5.field5124) {
                  if (var3 == -1090541576) {
                     throw new IllegalStateException();
                  }

                  var4 |= 2;
               }

               label77: {
                  if (var6 >= 0) {
                     if (var3 == -1090541576) {
                        throw new IllegalStateException();
                     }

                     if (var6 < var8) {
                        break label77;
                     }
                  }

                  var4 |= 2;
                  var6 = 0;
               }

               if (0 == (var4 & 2) && var2 != null) {
                  if (var3 == -1090541576) {
                     throw new IllegalStateException();
                  }

                  var2.vmethod13(var5, var6, 1789967496);
               }
            }
         }

         var0.method9770(var6, var7, -102492219);
         return var4;
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "ej.af(" + 41);
      }
   }
}
