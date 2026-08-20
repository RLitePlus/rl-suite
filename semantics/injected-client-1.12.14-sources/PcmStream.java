import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dn")
public abstract class PcmStream extends Node {
   @ObfuscatedName("af")
   volatile boolean active = true;
   @ObfuscatedName("ao")
   int field1448;
   @ObfuscatedSignature(descriptor = "Ldn;")
   @ObfuscatedName("am")
   PcmStream after;
   @ObfuscatedSignature(descriptor = "Lel;")
   @ObfuscatedName("al")
   AbstractSound sound;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   protected abstract int vmethod172();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   int vmethod161() {
      return 255;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   protected abstract void vmethod176(int var1);

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bo")
   protected abstract PcmStream vmethod169();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   protected abstract int vmethod171();

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ap")
   protected abstract void fill(int[] var1, int var2, int var3);

   protected PcmStream() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;II)V")
   @ObfuscatedName("ci")
   public static void method3395(MidiPcmStream var0, int var1, int var2) {
      var0.field4218[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bz")
   protected abstract PcmStream vmethod166();

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bb")
   protected abstract PcmStream vmethod164();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;[III)V")
   @ObfuscatedName("wg")
   public static void method3389(PcmStream var0, int[] var1, int var2, int var3) {
      if (var0.active) {
         var0.fill(var1, var2, var3);
      } else {
         var0.skip(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("ak")
   protected abstract PcmStream nextSubStream();

   @ObfuscatedSignature(descriptor = "(Ldn;[III)V")
   @ObfuscatedName("sh")
   public static void method3390(PcmStream var0, int[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.update(var1, var2, var2);
      } else {
         if (var0.active) {
            var0.fill(var1, var2, var3);
         } else {
            var0.skip(var3);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;[III)V")
   @ObfuscatedName("xk")
   public static void method3391(PcmStream var0, int[] var1, int var2, int var3) {
      if (var0.active) {
         var0.fill(var1, var2, var3);
      } else {
         var0.skip(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   protected abstract void skip(int var1);

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bk")
   protected abstract PcmStream vmethod163();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("er")
   int vmethod160() {
      return 255;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bs")
   protected abstract PcmStream vmethod168();

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bw")
   protected abstract void vmethod175(int[] var1, int var2, int var3);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;[III)V")
   @ObfuscatedName("cg")
   public static void method3392(PcmStream var0, int[] var1, int var2, int var3) {
      if (var0.active) {
         var0.fill(var1, var2, var3);
      } else {
         var0.skip(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("aj")
   protected abstract PcmStream firstSubStream();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("es")
   int vmethod162() {
      return -299791047;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bf")
   protected abstract void vmethod174(int[] var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bg")
   protected abstract PcmStream vmethod167();

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("gz")
   final void method3393(int[] var1, int var2, int var3) {
      if (this.active) {
         this.fill(var1, var2, var3);
      } else {
         this.skip(var3);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("gt")
   final void update(int[] var1, int var2, int var3) {
      if (this.active) {
         this.vmethod175(var1, var2, var3);
      } else {
         this.skip(var3);
      }
   }
}
