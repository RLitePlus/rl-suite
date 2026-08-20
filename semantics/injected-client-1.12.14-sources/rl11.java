import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rl11")
class rl11 extends ComponentAdapter {
   @Override
   public void componentResized(ComponentEvent var1) {
      this.field5557.field261 = this.field5557.canvas.getSize();
   }

   public rl11(GameEngine var1) {
      this.field5557 = var1;
   }
}
