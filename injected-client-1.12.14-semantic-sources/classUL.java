import java.awt.event.WindowEvent;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ul")
public class classUL implements classUY {
   @ToRemove(unused = "true")
   @ObfuscatedName("bv")
   static final int field6078 = 20;
   @ObfuscatedSignature(descriptor = "Lve;")
   @ObfuscatedName("av")
   public final classVE field6077;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method11179(int var1) {
      return this.field6077.vmethod433(var1, 2036523927);
   }

   classUL(classWB var1) {
      this.field6077 = var1;
   }

   public classUL(classUM var1) {
      this(new classWB(var1));
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int method11180(int var1) {
      return this.field6077.vmethod433(var1, 317040016);
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("av")
   public int method11181(int var1, byte var2) {
      try {
         return this.field6077.vmethod433(var1, 1090201482);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ul.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("jv")
   public static void method11183(GameEngine var0, WindowEvent var1) {
      if (var0 == null) {
         var0.method774();
      } else {
         var0.destroy();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method11182(int var1) {
      return this.field6077.vmethod433(var1, -144749267);
   }
}
