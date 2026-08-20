import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yb")
public interface CameraFocusableEntity extends net.runelite.api.CameraFocusableEntity {
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   int vmethod259();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("di")
   default int vmethod385() {
      return this.vmethod371(-267974568);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ea")
   int vmethod371(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ey")
   int vmethod368(int var1);

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   int vmethod258(byte var1);

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("ef")
   float vmethod383();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hr")
   default int vmethod386() {
      return this.vmethod258((byte)-13);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyx;)[I")
   @ObfuscatedName("iy")
   static int[] method13299(classYX var0) {
      return var0.field7106;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hq")
   int vmethod369();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kh")
   int vmethod372();

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("yq")
   float vmethod382();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hg")
   default int vmethod384() {
      return this.vmethod368(311606126);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ky")
   int vmethod370();
}
