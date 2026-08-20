import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("up")
public class ActorSpotAnim extends Node implements net.runelite.api.ActorSpotAnim {
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("at")
   public final AnimationSequence animationSequence;
   @ObfuscatedName("av")
   public int id = -1248982733;
   @ObfuscatedName("an")
   public int height;
   @ObfuscatedName("ag")
   public int startCycle;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field6085 = 512;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kp")
   static Archive archive13;

   public int getHeight() {
      return this.height * 1008557345;
   }

   public void setFrame(int var1) {
      this.animationSequence.frame = var1 * -449915737;
   }

   @ObfuscatedSignature(descriptor = "(IIIZS)V")
   @ObfuscatedName("mm")
   static final void method11200(int var0, int var1, int var2, boolean var3, short var4) {
      try {
         if (!WidgetDefinition.method7961(class226.widgetDefinition, var0, -2136782351)) {
            if (var4 <= 180) {
               throw new IllegalStateException();
            }
         } else {
            class452.resizeInterface(
               class226.widgetDefinition.Widget_interfaceComponents[var0],
               0,
               class226.widgetDefinition.Widget_interfaceComponents[var0].length - 1,
               -1,
               -1,
               var1,
               var2,
               var3,
               -1974223073
            );
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "up.mm(" + ')');
      }
   }

   public void setStartCycle(int var1) {
      this.startCycle = var1 * 2111487393;
   }

   public int getId() {
      return this.id * -1003297275;
   }

   public int getCycle() {
      return this.animationSequence.frameCycle * -1148754599;
   }

   public int getStartCycle() {
      return this.startCycle * -1097832863;
   }

   public void setHeight(int var1) {
      this.height = var1 * 1851156193;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;III)V")
   @ObfuscatedName("xb")
   public static void method11199(Scene var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method5542(var1, var1, var1);
      }

      var0.Scene_selectedPlane = var1;
      var0.Scene_selectedScreenX = var2;
      var0.Scene_selectedScreenY = var3;
   }

   public void setCycle(int var1) {
      this.animationSequence.frameCycle = var1 * 314086121;
   }

   public void setId(int var1) {
      this.id = var1 * 1248982733;
   }

   public int getFrame() {
      return this.animationSequence.frame * 1756992279;
   }

   public ActorSpotAnim(int var1, int var2, int var3) {
      this.animationSequence = new AnimationSequence();
      this.startCycle = 0;
      this.height = 0;
      this.id = var1 * 1248982733;
      this.height = 1851156193 * var2;
      this.startCycle = 2111487393 * var3;
      if (this.id * -1003297275 >= 0) {
         AnimationSequence.method10313(
            this.animationSequence, class181.SpotAnimationDefinition_get(this.id * -1003297275, -946192185).sequence * -508160903, 1464574745
         );
      }
   }
}
