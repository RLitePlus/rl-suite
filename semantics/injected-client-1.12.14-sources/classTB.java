import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tb")
public class classTB {
   @ObfuscatedSignature(descriptor = "Ltb;")
   @ObfuscatedName("at")
   static final classTB field5893 = new classTB(1);
   @ObfuscatedName("ag")
   final int field5894;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field5895 = 3;
   @ObfuscatedSignature(descriptor = "Ltb;")
   @ObfuscatedName("av")
   public static final classTB field5892 = new classTB(0);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;I)V")
   @ObfuscatedName("cz")
   public static void method10575(Menu var0, int var1) {
      if (var0 == null) {
         var0.getMenuX();
      }

      if (var1 >= 0) {
         class101.menuAction(
            var0.menuArguments1[var1],
            var0.menuArguments2[var1],
            var0.menuOpcodes[var1],
            var0.menuIdentifiers[var1],
            var0.menuItemIds[var1],
            var0.menuWorldViewIds[var1],
            var0.menuActions[var1],
            var0.menuTargets[var1],
            MouseHandler.MouseHandler_lastPressedX * -1018773713,
            -261967643 * MouseHandler.MouseHandler_lastPressedY,
            (byte)16
         );
      }
   }

   classTB(int var1) {
      this.field5894 = var1 * -1076101875;
   }
}
