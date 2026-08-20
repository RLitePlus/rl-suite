import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pz")
public class CameraViewMode implements Enum {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5274 = 286331153;
   @ObfuscatedName("an")
   public final int mode;
   @ObfuscatedSignature(descriptor = "Lpz;")
   @ObfuscatedName("at")
   static final CameraViewMode field5271 = new CameraViewMode(1, 1);
   @ObfuscatedSignature(descriptor = "Lpz;")
   @ObfuscatedName("av")
   public static final CameraViewMode field5269 = new CameraViewMode(0, 0);
   @ObfuscatedName("ae")
   int field5272;
   @ObfuscatedSignature(descriptor = "Lpz;")
   @ObfuscatedName("ag")
   static final CameraViewMode field5270 = new CameraViewMode(2, 2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpz;")
   @ObfuscatedName("ak")
   public static CameraViewMode[] method8824() {
      return new CameraViewMode[]{field5269, field5271, field5270};
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return -2127446423 * this.field5272;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pz.av(" + 41);
      }
   }

   CameraViewMode(int var1, int var2) {
      this.mode = 1055578935 * var1;
      this.field5272 = var2 * -19418663;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/Graphics;)V")
   @ObfuscatedName("mf")
   public static void method8827(GameEngine var0, Graphics var1) {
      if (var0 == null) {
         var0.method769();
      }

      var0.paint(var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return -2127446423 * this.field5272;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;)Z")
   @ObfuscatedName("tw")
   public static boolean method8828(Scene var0) {
      return var0.viewportWalking && var0.baseX != -1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -2127446423 * this.field5272;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpz;")
   @ObfuscatedName("aj")
   public static CameraViewMode[] method8825() {
      return new CameraViewMode[]{field5269, field5271, field5270};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpz;")
   @ObfuscatedName("aw")
   public static CameraViewMode[] method8826() {
      return new CameraViewMode[]{field5269, field5271, field5270};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -2127446423 * this.field5272;
   }

   @ObfuscatedSignature(descriptor = "(Lci;III)V")
   @ObfuscatedName("im")
   static void performPlayerAnimation(Player var0, int var1, int var2, int var3) {
      try {
         SequenceDefinition var4 = AnimationSequence.method10318(var0.animationSequence, -1079767838);
         if (var1 == var0.animationSequence.getId(469777406)) {
            if (var3 != -40656488) {
               throw new IllegalStateException();
            }

            if (-1 != var1) {
               if (var3 != -40656488) {
                  throw new IllegalStateException();
               }

               int var5 = var4.restartMode * 564693013;
               if (1 == var5) {
                  var0.animationSequence.method10332((byte)33);
                  var0.field1153 = var2 * -296795651;
               }

               if (2 == var5) {
                  if (var3 != -40656488) {
                     throw new IllegalStateException();
                  }

                  var0.animationSequence.method10333((byte)11);
               }

               return;
            }
         }

         if (-1 != var1 && AnimationSequence.method10315(var0.animationSequence, -831296794)) {
            if (var3 != -40656488) {
               return;
            }

            if (ClientPacket.SequenceDefinition_get(var1, -1961717996).field2726 * -1808717695 < var4.field2726 * -1808717695) {
               return;
            }

            if (var3 != -40656488) {
               throw new IllegalStateException();
            }
         }

         AnimationSequence.method10313(var0.animationSequence, var1, 322149493);
         var0.animationSequence.method10332((byte)60);
         var0.field1153 = var2 * -296795651;
         var0.field1164 = -1060830063 * var0.pathLength;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "pz.im(" + ')');
      }
   }
}
