import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ed")
public class classED extends classRD {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field1741 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field1739 = -306674912;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field1740 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1742 = 4096;
   @ObfuscatedName("az")
   final boolean field1738;

   @ObfuscatedSignature(descriptor = "(Lul;Lul;I)Lul;")
   @ObfuscatedName("as")
   static final classUL method3835(classUL var0, classUL var1, int var2) {
      try {
         classUL var3 = classSQ.method10636(var0, -506347951);
         var3.method11390(var1, 1591236864);
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ed.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;I)I")
   @ObfuscatedName("az")
   int method3829(Buddy var1, Buddy var2, int var3) {
      try {
         if (0 != var1.field5669 * -760305529) {
            if (var3 <= 1948874899) {
               throw new IllegalStateException();
            }

            if (0 == var2.field5669 * -760305529) {
               if (var3 <= 1948874899) {
                  throw new IllegalStateException();
               }

               byte var10000;
               if (this.field1738) {
                  if (var3 <= 1948874899) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if (var2.field5669 * -760305529 != 0) {
            if (var3 <= 1948874899) {
               throw new IllegalStateException();
            }

            byte var5;
            if (this.field1738) {
               if (var3 <= 1948874899) {
                  throw new IllegalStateException();
               }

               var5 = 1;
            } else {
               var5 = -1;
            }

            return var5;
         }

         return classRD.method9942(this, var1, var2, 1714535372);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ed.az(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method3829((Buddy)var1, (Buddy)var2, 2128884400);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ed.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method3833(Object var1, Object var2) {
      return this.method3829((Buddy)var1, (Buddy)var2, 2091240104);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Led;Lri;Lri;)I")
   @ObfuscatedName("zy")
   public static int method3830(classED var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         return var0.method3831(var1, var1);
      } else {
         if (0 != var1.field5669 * -760305529) {
            if (0 == var2.field5669 * -760305529) {
               return var0.field1738 ? -1 : 1;
            }
         } else if (var2.field5669 * -760305529 != 0) {
            return var0.field1738 ? 1 : -1;
         }

         return classRD.method9942(var0, var1, var2, 1327671337);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method3834(Object var1, Object var2) {
      return this.method3829((Buddy)var1, (Buddy)var2, 2103792287);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lff;FFFFF)F")
   @ObfuscatedName("bz")
   public static float method3836(classFF var0, float var1, float var2, float var3, float var4, float var5) {
      if (var0 == null) {
         var0.vmethod449();
      }

      var3 = var3 - var4 * var1 + var4;
      if (var2 < 0.0F) {
         var3 -= var5 * (int)var2;
      }

      return var3 - var5 * (var2 - (int)(var2 + 0.5F));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("az")
   public static void method3832(String var0, String var1, int var2) {
      try {
         classGQ.field2652.put(var0.toLowerCase(), var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ed.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("af")
   int method3831(Buddy var1, Buddy var2) {
      if (0 != var1.field5669 * -760305529) {
         if (0 == var2.field5669 * -760305529) {
            return this.field1738 ? -1 : 1;
         }
      } else if (var2.field5669 * -760305529 != 0) {
         return this.field1738 ? 1 : -1;
      }

      return classRD.method9942(this, var1, var2, 1310912392);
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("af")
   static float method3828(int var0, int var1) {
      try {
         return classGB.field2538[var0];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ed.af(" + ')');
      }
   }

   public classED(boolean var1) {
      this.field1738 = var1;
   }
}
