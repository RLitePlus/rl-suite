import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ObfuscatedName("rv")
public @interface classRV {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;)V")
   @ObfuscatedName("xg")
   static void method9845(FriendSystem var0) {
      if (var0 == null) {
         var0.method429();
      }

      var0.field123 = -71758647;
   }

   @ObfuscatedSignature(descriptor = "(Lna;I)V")
   @ObfuscatedName("sx")
   static void method9844(MidiFileReader var0, int var1) {
      if (var0 == null) {
         var0.markTrackPosition(var1);
      } else {
         var0.trackPositions[var1] = var0.buffer.offset * 2108391709;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;)I")
   @ObfuscatedName("iw")
   static int method9846(Actor var0) {
      return var0.poseAnimationSequence.getId(-1266562901);
   }
}
