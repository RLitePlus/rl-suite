import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aa")
public class DevicePcmPlayer extends PcmPlayer {
   @ObfuscatedName("av")
   AudioFormat format;
   @ObfuscatedName("at")
   SourceDataLine line;
   @ObfuscatedName("ag")
   int capacity2;
   @ObfuscatedName("an")
   byte[] byteSamples;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   @Override
   protected void vmethod12() {
      short var1 = 512;
      if (FaceNormal.PcmPlayer_stereo) {
         var1 <<= 1;
      }

      for (int var2 = 0; var2 < var1; var2++) {
         int var3 = this.samples[var2];
         if (0 != (8388608 + var3 & 0xFF000000)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.byteSamples[2 * var2] = (byte)(var3 >> 8);
         this.byteSamples[1 + 2 * var2] = (byte)(var3 >> 16);
      }

      this.line.write(this.byteSamples, 0, var1 << 1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   @Override
   protected void vmethod0() {
      this.format = new AudioFormat(22050.0F, 16, FaceNormal.PcmPlayer_stereo ? 2 : 1, true, false);
      this.byteSamples = new byte[512 << (FaceNormal.PcmPlayer_stereo ? 2 : 1)];
   }

   DevicePcmPlayer() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   @Override
   protected void vmethod16() {
      if (this.line != null) {
         this.line.close();
         this.line = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   @Override
   protected void vmethod13() {
      short var1 = 512;
      if (FaceNormal.PcmPlayer_stereo) {
         var1 <<= 1;
      }

      for (int var2 = 0; var2 < var1; var2++) {
         int var3 = this.samples[var2];
         if (0 != (8388608 + var3 & 0xFF000000)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.byteSamples[2 * var2] = (byte)(var3 >> 8);
         this.byteSamples[1 + 2 * var2] = (byte)(var3 >> 16);
      }

      this.line.write(this.byteSamples, 0, var1 << 1);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   @Override
   protected void close(byte var1) {
      try {
         if (this.line != null) {
            if (var1 <= 1) {
               return;
            }

            this.line.close();
            this.line = null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aa.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   @Override
   protected void open(int var1, int var2) throws LineUnavailableException {
      try {
         try {
            Info var10000 = new Info;
            byte var10005;
            if (FaceNormal.PcmPlayer_stereo) {
               if (var2 <= 2144025324) {
                  throw new IllegalStateException();
               }

               var10005 = 2;
            } else {
               var10005 = 1;
            }

            var10000./* $VF: Unable to resugar constructor */<init>(SourceDataLine.class, this.format, var1 << var10005);
            Info var3 = var10000;
            this.line = (SourceDataLine)AudioSystem.getLine(var3);
            this.line.open();
            this.line.start();
            this.capacity2 = 457659667 * var1;
         } catch (LineUnavailableException var4) {
            if (ServerPacket.method7545(var1, (byte)3) != 1) {
               if (var2 <= 2144025324) {
                  throw new IllegalStateException();
               } else {
                  this.open(class161.method4253(var1, (byte)0), 2146829378);
               }
            } else {
               this.line = null;
               throw var4;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "aa.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   @Override
   protected void vmethod14() {
      int var1 = 547027572;
      if (FaceNormal.PcmPlayer_stereo) {
         var1 <<= 1;
      }

      for (int var2 = 0; var2 < var1; var2++) {
         int var3 = this.samples[var2];
         if (0 != (8388608 + var3 & 0xFF000000)) {
            var3 = 8388607 ^ var3 >> -433978622;
         }

         this.byteSamples[2 * var2] = (byte)(var3 >> 8);
         this.byteSamples[1 + 2 * var2] = (byte)(var3 >> 16);
      }

      this.line.write(this.byteSamples, 0, var1 << 1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   @Override
   protected void vmethod1() {
      this.format = new AudioFormat(22050.0F, 16, FaceNormal.PcmPlayer_stereo ? 2 : 1, true, false);
      this.byteSamples = new byte[512 << (FaceNormal.PcmPlayer_stereo ? 2 : 1)];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   @Override
   protected void vmethod2() {
      this.format = new AudioFormat(22050.0F, 16, FaceNormal.PcmPlayer_stereo ? 2 : 1, true, false);
      this.byteSamples = new byte[512 << (FaceNormal.PcmPlayer_stereo ? 2 : 1)];
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   @Override
   protected void discard(byte var1) {
      try {
         this.line.flush();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aa.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   @Override
   protected void vmethod3() {
      this.format = new AudioFormat(22050.0F, 16, FaceNormal.PcmPlayer_stereo ? 2 : 1, true, false);
      this.byteSamples = new byte[-835844604 << (FaceNormal.PcmPlayer_stereo ? 2 : 1)];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   @Override
   protected void vmethod7(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.format, var1 << (FaceNormal.PcmPlayer_stereo ? 2 : 1));
         this.line = (SourceDataLine)AudioSystem.getLine(var2);
         this.line.open();
         this.line.start();
         this.capacity2 = 457659667 * var1;
      } catch (LineUnavailableException var3) {
         if (ServerPacket.method7545(var1, (byte)-8) != 1) {
            this.open(class161.method4253(var1, (byte)0), 2144678375);
         } else {
            this.line = null;
            throw var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   @Override
   protected void vmethod8(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.format, var1 << (FaceNormal.PcmPlayer_stereo ? 2 : 1));
         this.line = (SourceDataLine)AudioSystem.getLine(var2);
         this.line.open();
         this.line.start();
         this.capacity2 = 457659667 * var1;
      } catch (LineUnavailableException var3) {
         if (ServerPacket.method7545(var1, (byte)24) != 1) {
            this.open(class161.method4253(var1, (byte)0), 2144424815);
         } else {
            this.line = null;
            throw var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   @Override
   protected int vmethod9() {
      return this.capacity2 * -1475756773 - (this.line.available() >> (FaceNormal.PcmPlayer_stereo ? 2 : 1));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   @Override
   protected void vmethod18() {
      if (this.line != null) {
         this.line.close();
         this.line = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   @Override
   protected void vmethod4() {
      this.format = new AudioFormat(22050.0F, 16, FaceNormal.PcmPlayer_stereo ? 2 : 1, true, false);
      this.byteSamples = new byte[512 << (FaceNormal.PcmPlayer_stereo ? 2 : 1)];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   @Override
   protected void vmethod19() {
      if (this.line != null) {
         this.line.close();
         this.line = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   @Override
   protected void write() {
      if (this.line != null) {
         this.line.close();
         this.line = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   @Override
   protected int vmethod10() {
      return this.capacity2 * -1475756773 - (this.line.available() >> (FaceNormal.PcmPlayer_stereo ? 2 : 1));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   @Override
   protected void vmethod22() {
      this.line.flush();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   @Override
   protected void vmethod23() {
      this.line.flush();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   @Override
   protected void init(byte var1) {
      try {
         AudioFormat var10001 = new AudioFormat;
         byte var10005;
         if (FaceNormal.PcmPlayer_stereo) {
            if (var1 != 15) {
               return;
            }

            var10005 = 2;
         } else {
            var10005 = 1;
         }

         var10001./* $VF: Unable to resugar constructor */<init>(22050.0F, 16, var10005, true, false);
         this.format = var10001;
         byte var10002;
         if (FaceNormal.PcmPlayer_stereo) {
            if (var1 != 15) {
               throw new IllegalStateException();
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         this.byteSamples = new byte[512 << var10002];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aa.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   protected int position(int var1) {
      try {
         return this.capacity2 * -1475756773 - (this.line.available() >> (FaceNormal.PcmPlayer_stereo ? 2 : 1));
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "aa.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;)Z")
   @ObfuscatedName("if")
   public static boolean method0(MidiFileReader var0) {
      int var1 = var0.trackPositions.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (var0.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   @Override
   protected void vmethod15() {
      short var1 = 512;
      if (FaceNormal.PcmPlayer_stereo) {
         var1 <<= 1;
      }

      for (int var2 = 0; var2 < var1; var2++) {
         int var3 = this.samples[var2];
         if (0 != (8388608 + var3 & 0xFF000000)) {
            var3 = 8388607 ^ var3 >> 1630359524;
         }

         this.byteSamples[2 * var2] = (byte)(var3 >> 8);
         this.byteSamples[1 + 2 * var2] = (byte)(var3 >> 16);
      }

      this.line.write(this.byteSamples, 0, var1 << 1);
   }
}
