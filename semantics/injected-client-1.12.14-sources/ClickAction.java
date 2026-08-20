import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uv")
public class ClickAction implements Enum {
   @ObfuscatedName("ae")
   final int field6117;
   @ObfuscatedSignature(descriptor = "Luv;")
   @ObfuscatedName("av")
   static final ClickAction field6118 = new ClickAction(0, 0);
   @ObfuscatedSignature(descriptor = "Luv;")
   @ObfuscatedName("ag")
   public static final ClickAction field6120 = new ClickAction(2, 2);
   @ObfuscatedName("an")
   final int field6116;
   @ObfuscatedSignature(descriptor = "Luv;")
   @ObfuscatedName("at")
   public static final ClickAction field6119 = new ClickAction(1, 1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field6116 * 1824272368;
   }

   ClickAction(int var1, int var2) {
      this.field6117 = -2079349049 * var1;
      this.field6116 = var2 * -903706989;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field6116 * 1929086875;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "uv.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field6116 * -596524040;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field6116 * 1929086875;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;I)Lsw;")
   @ObfuscatedName("ww")
   public static class472 method11248(classSF var0, int var1) {
      if (var0 == null) {
         var0.method10121(var1);
      }

      return (class472)var0.field5767.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Luv;")
   @ObfuscatedName("aj")
   public static ClickAction[] method11246() {
      return new ClickAction[]{field6118, field6119, field6120};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Luv;")
   @ObfuscatedName("ak")
   public static ClickAction[] method11247() {
      return new ClickAction[]{field6118, field6119, field6120};
   }

   @ObfuscatedSignature(descriptor = "(Lof;Lof;S)V")
   @ObfuscatedName("cf")
   static void method11249(Widget var0, Widget var1, short var2) {
      try {
         if (var0.type * 928687775 == 0) {
            if (var2 <= 128) {
               return;
            }

            for (int var3 = var0.field4453 * -1516264759; var3 <= -86298045 * var0.field4454; var3++) {
               if (var2 <= 128) {
                  return;
               }

               Widget var4 = var1.children[var3];
               if (var4 != null) {
                  if (var2 <= 128) {
                     throw new IllegalStateException();
                  }

                  if (var0.childIndex * 2077538819 == var4.field4451 * 1865628485) {
                     if (var2 <= 128) {
                        return;
                     }

                     method11249(var4, var1, (short)11154);
                  }
               }
            }
         }

         var1.children[2077538819 * var0.childIndex] = null;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uv.cf(" + ')');
      }
   }
}
