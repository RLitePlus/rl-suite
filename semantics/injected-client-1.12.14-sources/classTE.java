import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("te")
class classTE implements Comparator {
   classTE(class498 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ltt;Ltt;I)I")
   @ObfuscatedName("av")
   int method10591(class499 var1, class499 var2, int var3) {
      try {
         if (2286872270706208031L * var1.field5979 > var2.field5979 * 2286872270706208031L) {
            if (var3 != -1978238968) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (2286872270706208031L * var1.field5979 < var2.field5979 * 2286872270706208031L) {
            if (var3 != -1978238968) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "te.av(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method10591((class499)var1, (class499)var2, -1978238968);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "te.compare(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("hg")
   public static int method10596(classTE var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method10600(var1, var1);
      }

      return var0.method10591((class499)var1, (class499)var2, -1978238968);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "te.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llt;)I")
   @ObfuscatedName("kb")
   public static int method10605(WorldMapData_1 var0) {
      return var0.chunkY * -472280825;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method10597(Object var1, Object var2) {
      return this.method10591((class499)var1, (class499)var2, -1978238968);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;)Z")
   @ObfuscatedName("yz")
   public static boolean method10602(classTE var0, Object var1) {
      return var0 == null ? var0.equals(var1) : var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ltt;Ltt;)I")
   @ObfuscatedName("ay")
   int method10592(class499 var1, class499 var2) {
      if (2286872270706208031L * var1.field5979 > var2.field5979 * 2286872270706208031L) {
         return 1;
      } else {
         return 2286872270706208031L * var1.field5979 < var2.field5979 * 2286872270706208031L ? -1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltt;Ltt;)I")
   @ObfuscatedName("ap")
   int method10593(class499 var1, class499 var2) {
      if (2286872270706208031L * var1.field5979 > var2.field5979 * 2286872270706208031L) {
         return 1;
      } else {
         return 2286872270706208031L * var1.field5979 < var2.field5979 * 2286872270706208031L ? -1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method10603(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("gt")
   public static int method10598(classTE var0, Object var1, Object var2) {
      return var0 == null ? var0.method10601(var1, var1) : var0.method10591((class499)var1, (class499)var2, -1978238968);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method10604(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method10599(Object var1, Object var2) {
      return this.method10591((class499)var1, (class499)var2, -1978238968);
   }

   @ObfuscatedSignature(descriptor = "(Ltt;Ltt;)I")
   @ObfuscatedName("ak")
   int method10594(class499 var1, class499 var2) {
      if (2286872270706208031L * var1.field5979 > var2.field5979 * 2286872270706208031L) {
         return 1;
      } else {
         return 2286872270706208031L * var1.field5979 < var2.field5979 * 2286872270706208031L ? -1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltt;Ltt;)I")
   @ObfuscatedName("aw")
   int method10595(class499 var1, class499 var2) {
      if (2286872270706208031L * var1.field5979 > var2.field5979 * 2286872270706208031L) {
         return 1;
      } else {
         return 2286872270706208031L * var1.field5979 < var2.field5979 * 2286872270706208031L ? -1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("nf")
   static final void method10606(int var0, int var1) {
      try {
         if (!WidgetDefinition.method7961(class226.widgetDefinition, var0, -2046625626)) {
            if (var1 == -247096033) {
               ;
            }
         } else {
            class203.drawModelComponents(
               class226.widgetDefinition.Widget_interfaceComponents[var0],
               0,
               class226.widgetDefinition.Widget_interfaceComponents[var0].length - 1,
               -1,
               -1,
               789799005
            );
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "te.nf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method10600(Object var1, Object var2) {
      return this.method10591((class499)var1, (class499)var2, -1978238968);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method10601(Object var1, Object var2) {
      return this.method10591((class499)var1, (class499)var2, -1978238968);
   }
}
