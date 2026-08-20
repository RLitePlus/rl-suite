import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xb")
public interface CameraFocusableEntity extends net.runelite.api.CameraFocusableEntity {
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fe")
   int vmethod142();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dl")
   int getX(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   int vmethod103();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;)V")
   @ObfuscatedName("bc")
   static void method12236(ObjectSound var0) {
      if (var0 == null) {
         var0.method2733();
      }

      ObjectSound.field1087.addFirst(var0);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ww")
   default int vmethod155() {
      return this.getPlane(446304328);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("cv")
   float vmethod151();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("is")
   default int vmethod154() {
      return this.getX(-727737924);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   int vmethod102();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   int getPlane(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lis;)V")
   @ObfuscatedName("ry")
   static void method12235(ItemComposition var0) {
      if (1 == var0.isStackable * 1515235515) {
         var0.field2605 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mv")
   default int vmethod153() {
      return this.getY(-1790262579);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   int vmethod105();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   int vmethod104();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dr")
   int getY(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fu")
   int vmethod146();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fw")
   int vmethod140();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fy")
   int vmethod143();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fo")
   int vmethod141();

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("nt")
   float vmethod152();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fv")
   int vmethod144();
}
