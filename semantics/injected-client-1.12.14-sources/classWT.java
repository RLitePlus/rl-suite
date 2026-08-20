import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wt")
public class classWT extends classUQ {
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   public static final int field6457 = 42;

   classWT() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;I)I")
   @ObfuscatedName("vd")
   public static int method11881(AbstractFont var0, String var1, int var2) {
      if (var0 == null) {
         var0.method10409(var1, var2, var2, var2, var2);
      }

      return var0.breakLines(var1, new int[]{var2}, AbstractFont.AbstractFont_lines);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V")
   @ObfuscatedName("av")
   static void method11880(Component var0, int var1) {
      try {
         var0.addMouseListener(MouseHandler.MouseHandler_instance);
         var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
         var0.addFocusListener(MouseHandler.MouseHandler_instance);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wt.av(" + ')');
      }
   }
}
