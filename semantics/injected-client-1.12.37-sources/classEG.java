import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eg")
public class classEG extends classRD {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field1750 = 20;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field1751 = 512;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final String field1753 = "Please ensure all characters are populated.";
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   public static final int field1752 = 4;
   @ObfuscatedName("az")
   final boolean field1749;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laaf;")
   @ObfuscatedName("af")
   public static classAAF newRunException(Throwable var0, String var1) {
      classAAF var2;
      if (var0 instanceof classAAF) {
         var2 = (classAAF)var0;
      } else {
         var2 = new classAAF(var0, "");
      }

      if (!var1.endsWith("()")) {
         if (var2.field45.length() != 0) {
            var2.field45 = var2.field45 + " ";
         }

         var2.field45 = var2.field45 + var1;
      }

      return var2;
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method3876((Buddy)var1, (Buddy)var2, 1822819216);
      } catch (RuntimeException var3) {
         throw newRunException(var3, "eg.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method3879(Object var1, Object var2) {
      return this.method3876((Buddy)var1, (Buddy)var2, 1500200517);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method3880(Object var1, Object var2) {
      return this.method3876((Buddy)var1, (Buddy)var2, 1895651778);
   }

   public classEG(boolean var1) {
      this.field1749 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ax")
   public static int method3882(int var0, byte var1) {
      try {
         return var0 << 3;
      } catch (RuntimeException var2) {
         throw newRunException(var2, "eg.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;I)I")
   @ObfuscatedName("az")
   int method3876(Buddy var1, Buddy var2, int var3) {
      try {
         if (1234122453 * var1.field5671 != 1234122453 * var2.field5671) {
            int var10000;
            if (this.field1749) {
               if (var3 <= 1003982056) {
                  throw new IllegalStateException();
               }

               var10000 = var1.field5671 * 1234122453 - var2.field5671 * 1234122453;
            } else {
               var10000 = 1234122453 * var2.field5671 - 1234122453 * var1.field5671;
            }

            return var10000;
         } else {
            return classRD.method9942(this, var1, var2, 1672872765);
         }
      } catch (RuntimeException var4) {
         throw newRunException(var4, "eg.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leg;Lri;Lri;)I")
   @ObfuscatedName("jd")
   public static int method3877(classEG var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         return var0.method3878(var1, var1);
      } else if (2040157276 * var1.field5671 != 1234122453 * var2.field5671) {
         return var0.field1749 ? var1.field5671 * 1234122453 - var2.field5671 * 1234122453 : 1932572038 * var2.field5671 - -1513552045 * var1.field5671;
      } else {
         return classRD.method9942(var0, var1, var2, 1279543742);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnw;)V")
   @ObfuscatedName("pr")
   public static void method3881(classNW var0) {
      var0.field4786 = var0.field4785 != null ? var0.field4785.field4782.field6554 : null;
      var0.field4784 = null;
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)I")
   @ObfuscatedName("at")
   static int method3883(Widget var0, int var1) {
      try {
         if (11 != var0.field4375 * -1510882375) {
            classBB.field338 -= 1222866659;
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else {
            String var2 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var0.method7250(var2, 918177898);
            return 1;
         }
      } catch (RuntimeException var3) {
         throw newRunException(var3, "eg.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("af")
   int method3878(Buddy var1, Buddy var2) {
      if (1633223758 * var1.field5671 != 1234122453 * var2.field5671) {
         return this.field1749 ? var1.field5671 * -710042430 - var2.field5671 * 1234122453 : 1234122453 * var2.field5671 - -1896362558 * var1.field5671;
      } else {
         return classRD.method9942(this, var1, var2, 1961943907);
      }
   }
}
