import java.awt.event.WindowEvent;
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ww")
public class classWW {
   @ObfuscatedName("av")
   public static int field6464 = -1107470527;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field6465 = 14;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lix;)Ljava/util/ArrayList;")
   @ObfuscatedName("mo")
   public static ArrayList method11898(class225 var0) {
      return var0.field2761.field3068;
   }

   classWW() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("ss")
   public static void method11899(GameEngine var0, WindowEvent var1) {
      if (var0 == null) {
         var0.method795(var1);
      }
   }
}
