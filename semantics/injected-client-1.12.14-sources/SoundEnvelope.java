import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dp")
public class SoundEnvelope {
   @ObfuscatedName("ap")
   int step;
   @ObfuscatedName("at")
   int end;
   @ObfuscatedName("ag")
   int form;
   @ObfuscatedName("av")
   int start;
   @ObfuscatedName("an")
   int segments = 2;
   @ObfuscatedName("aj")
   int[] phases;
   @ObfuscatedName("ak")
   int ticks;
   @ObfuscatedName("aw")
   int phaseIndex;
   @ObfuscatedName("au")
   int max;
   @ObfuscatedName("ay")
   int amplitude;
   @ObfuscatedName("ae")
   int[] durations = new int[2];

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   final void method3406() {
      this.ticks = 0;
      this.phaseIndex = 0;
      this.step = 0;
      this.amplitude = 0;
      this.max = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("av")
   final void decode(Buffer var1) {
      this.form = var1.readUnsignedByte(1666114585);
      this.start = Buffer.method12015(var1, 1008504075);
      this.end = Buffer.method12015(var1, 13426695);
      this.decodeSegments(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("at")
   final void decodeSegments(Buffer var1) {
      this.segments = var1.readUnsignedByte(-51114081);
      this.durations = new int[this.segments];
      this.phases = new int[this.segments];

      for (int var2 = 0; var2 < this.segments; var2++) {
         this.durations[var2] = Buffer.method12008(var1, (byte)5);
         this.phases[var2] = Buffer.method12008(var1, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   final void reset() {
      this.ticks = 0;
      this.phaseIndex = 0;
      this.step = 0;
      this.amplitude = 0;
      this.max = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   final int doStep(int var1) {
      if (this.max >= this.ticks) {
         this.amplitude = this.phases[this.phaseIndex++] << 15;
         if (this.phaseIndex >= this.segments) {
            this.phaseIndex = this.segments - 1;
         }

         this.ticks = (int)(this.durations[this.phaseIndex] / 65536.0 * var1);
         if (this.ticks > this.max) {
            this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
         }
      }

      this.amplitude = this.amplitude + this.step;
      this.max++;
      return this.amplitude - this.step >> 15;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   final int method3410(int var1) {
      if (this.max >= this.ticks) {
         this.amplitude = this.phases[this.phaseIndex++] << 15;
         if (this.phaseIndex >= this.segments) {
            this.phaseIndex = this.segments - 1;
         }

         this.ticks = (int)(this.durations[this.phaseIndex] / 65536.0 * var1);
         if (this.ticks > this.max) {
            this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
         }
      }

      this.amplitude = this.amplitude + this.step;
      this.max++;
      return this.amplitude - this.step >> 15;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   final void method3401(Buffer var1) {
      this.form = var1.readUnsignedByte(-55993911);
      this.start = Buffer.method12015(var1, -613849520);
      this.end = Buffer.method12015(var1, -954117389);
      this.decodeSegments(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ak")
   final void method3404(Buffer var1) {
      this.segments = var1.readUnsignedByte(-1278779668);
      this.durations = new int[this.segments];
      this.phases = new int[this.segments];

      for (int var2 = 0; var2 < this.segments; var2++) {
         this.durations[var2] = Buffer.method12008(var1, (byte)5);
         this.phases[var2] = Buffer.method12008(var1, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aw")
   final void method3405(Buffer var1) {
      this.segments = var1.readUnsignedByte(-251708706);
      this.durations = new int[this.segments];
      this.phases = new int[this.segments];

      for (int var2 = 0; var2 < this.segments; var2++) {
         this.durations[var2] = Buffer.method12008(var1, (byte)5);
         this.phases[var2] = Buffer.method12008(var1, (byte)5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldp;)V")
   @ObfuscatedName("fb")
   public static void method3408(SoundEnvelope var0) {
      if (var0 == null) {
         var0.method3406();
      } else {
         var0.ticks = 0;
         var0.phaseIndex = 0;
         var0.step = 0;
         var0.amplitude = 0;
         var0.max = 0;
      }
   }

   SoundEnvelope() {
      this.phases = new int[2];
      this.durations[0] = 0;
      this.durations[1] = 65535;
      this.phases[0] = 0;
      this.phases[1] = 65535;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aj")
   final void method3402(Buffer var1) {
      this.form = var1.readUnsignedByte(312187465);
      this.start = Buffer.method12015(var1, 1738425297);
      this.end = Buffer.method12015(var1, -533305854);
      this.decodeSegments(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   final int method3411(int var1) {
      if (this.max >= this.ticks) {
         this.amplitude = this.phases[this.phaseIndex++] << 15;
         if (this.phaseIndex >= this.segments) {
            this.phaseIndex = this.segments - 1;
         }

         this.ticks = (int)(this.durations[this.phaseIndex] / 65536.0 * var1);
         if (this.ticks > this.max) {
            this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
         }
      }

      this.amplitude = this.amplitude + this.step;
      this.max++;
      return this.amplitude - this.step >> 15;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   final int method3412(int var1) {
      if (this.max >= this.ticks) {
         this.amplitude = this.phases[this.phaseIndex++] << 15;
         if (this.phaseIndex >= this.segments) {
            this.phaseIndex = this.segments - 1;
         }

         this.ticks = (int)(this.durations[this.phaseIndex] / 65536.0 * var1);
         if (this.ticks > this.max) {
            this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
         }
      }

      this.amplitude = this.amplitude + this.step;
      this.max++;
      return this.amplitude - this.step >> 15;
   }
}
