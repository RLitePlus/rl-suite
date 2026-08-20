import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eg")
public class Instrument {
   @ObfuscatedName("ah")
   int[] oscillatorVolume;
   @ObfuscatedName("at")
   static int[] Instrument_samples;
   @ObfuscatedName("ag")
   static int[] Instrument_noise = new int[32768];
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("ar")
   SoundEnvelope attack;
   @ObfuscatedName("ae")
   static int[] Instrument_phases = new int[5];
   @ObfuscatedName("aj")
   static int[] Instrument_delays = new int[5];
   @ObfuscatedName("ak")
   static int[] Instrument_volumeSteps = new int[5];
   @ObfuscatedName("au")
   int offset;
   @ObfuscatedName("ap")
   static int[] Instrument_pitchBaseSteps = new int[5];
   @ObfuscatedName("ay")
   int duration = 500;
   @ObfuscatedName("an")
   static int[] Instrument_sine;
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("ax")
   SoundEnvelope release;
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("ai")
   SoundEnvelope pitchModifier;
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("as")
   SoundEnvelope pitchModifierAmplitude;
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("ac")
   SoundEnvelope volumeMultiplier;
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("az")
   SoundEnvelope pitch;
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("aq")
   SoundEnvelope filterEnvelope;
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("ad")
   SoundEnvelope volume;
   @ObfuscatedName("aw")
   static int[] Instrument_pitchSteps = new int[5];
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final double field1583 = 1.0057929410678534;
   @ObfuscatedName("al")
   int[] oscillatorPitch;
   @ObfuscatedName("af")
   int[] oscillatorDelays;
   @ObfuscatedName("am")
   int delayTime;
   @ObfuscatedName("ao")
   int delayDecay;
   @ObfuscatedSignature(descriptor = "Lej;")
   @ObfuscatedName("aa")
   AudioFilter filter;
   @ObfuscatedSignature(descriptor = "Ldp;")
   @ObfuscatedName("ab")
   SoundEnvelope volumeMultiplierAmplitude;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   final void decode(Buffer var1) {
      this.release = new SoundEnvelope();
      this.release.decode(var1);
      this.attack = new SoundEnvelope();
      this.attack.decode(var1);
      int var2 = var1.readUnsignedByte(-804450254);
      if (var2 != 0) {
         var1.offset -= -1223355190;
         this.pitchModifierAmplitude = new SoundEnvelope();
         this.pitchModifierAmplitude.decode(var1);
         this.volumeMultiplier = new SoundEnvelope();
         this.volumeMultiplier.decode(var1);
      }

      var2 = var1.readUnsignedByte(1403622857);
      if (var2 != 0) {
         var1.offset -= 497237735;
         this.pitch = new SoundEnvelope();
         this.pitch.decode(var1);
         this.filterEnvelope = new SoundEnvelope();
         this.filterEnvelope.decode(var1);
      }

      var2 = var1.readUnsignedByte(-586979527);
      if (var2 != 0) {
         var1.offset -= 1741769013;
         this.volume = new SoundEnvelope();
         this.volume.decode(var1);
         this.volumeMultiplierAmplitude = new SoundEnvelope();
         this.volumeMultiplierAmplitude.decode(var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = Buffer.method12050(var1, 619694022);
         if (var4 == 0) {
            break;
         }

         this.oscillatorVolume[var3] = var4;
         this.oscillatorPitch[var3] = var1.readShortSmart(1917200151);
         this.oscillatorDelays[var3] = Buffer.method12050(var1, -2001473756);
      }

      this.delayTime = Buffer.method12050(var1, 257848639);
      this.delayDecay = Buffer.method12050(var1, -217276915);
      this.duration = Buffer.method12008(var1, (byte)5);
      this.offset = Buffer.method12008(var1, (byte)5);
      this.filter = new AudioFilter();
      this.pitchModifier = new SoundEnvelope();
      this.filter.method3766(var1, this.pitchModifier);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("at")
   final int evaluateWave(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return Instrument_sine[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? Instrument_noise[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aw")
   final void method3721(Buffer var1) {
      this.release = new SoundEnvelope();
      this.release.decode(var1);
      this.attack = new SoundEnvelope();
      this.attack.decode(var1);
      int var2 = var1.readUnsignedByte(1003827171);
      if (var2 != 0) {
         var1.offset -= 1741769013;
         this.pitchModifierAmplitude = new SoundEnvelope();
         this.pitchModifierAmplitude.decode(var1);
         this.volumeMultiplier = new SoundEnvelope();
         this.volumeMultiplier.decode(var1);
      }

      var2 = var1.readUnsignedByte(943587246);
      if (var2 != 0) {
         var1.offset -= 1828212106;
         this.pitch = new SoundEnvelope();
         this.pitch.decode(var1);
         this.filterEnvelope = new SoundEnvelope();
         this.filterEnvelope.decode(var1);
      }

      var2 = var1.readUnsignedByte(-705751284);
      if (var2 != 0) {
         var1.offset -= 11757123;
         this.volume = new SoundEnvelope();
         this.volume.decode(var1);
         this.volumeMultiplierAmplitude = new SoundEnvelope();
         this.volumeMultiplierAmplitude.decode(var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = Buffer.method12050(var1, -1493188721);
         if (var4 == 0) {
            break;
         }

         this.oscillatorVolume[var3] = var4;
         this.oscillatorPitch[var3] = var1.readShortSmart(1249964763);
         this.oscillatorDelays[var3] = Buffer.method12050(var1, 1820781958);
      }

      this.delayTime = Buffer.method12050(var1, -717524108);
      this.delayDecay = Buffer.method12050(var1, 1203975970);
      this.duration = Buffer.method12008(var1, (byte)5);
      this.offset = Buffer.method12008(var1, (byte)5);
      this.filter = new AudioFilter();
      this.pitchModifier = new SoundEnvelope();
      this.filter.method3766(var1, this.pitchModifier);
   }

   Instrument() {
      this.offset = 0;
      this.oscillatorVolume = new int[]{0, 0, 0, 0, 0};
      this.oscillatorPitch = new int[]{0, 0, 0, 0, 0};
      this.oscillatorDelays = new int[]{0, 0, 0, 0, 0};
      this.delayTime = 0;
      this.delayDecay = 100;
   }

   @ObfuscatedSignature(descriptor = "(Leg;Lxa;)V")
   @ObfuscatedName("zs")
   public static void method3722(Instrument var0, Buffer var1) {
      if (var0 == null) {
         var0.method3724(var1);
      } else {
         var0.release = new SoundEnvelope();
         var0.release.decode(var1);
         var0.attack = new SoundEnvelope();
         var0.attack.decode(var1);
         int var2 = var1.readUnsignedByte(982664164);
         if (var2 != 0) {
            var1.offset -= 1741769013;
            var0.pitchModifierAmplitude = new SoundEnvelope();
            var0.pitchModifierAmplitude.decode(var1);
            var0.volumeMultiplier = new SoundEnvelope();
            var0.volumeMultiplier.decode(var1);
         }

         var2 = var1.readUnsignedByte(-993803431);
         if (var2 != 0) {
            var1.offset -= 1741769013;
            var0.pitch = new SoundEnvelope();
            var0.pitch.decode(var1);
            var0.filterEnvelope = new SoundEnvelope();
            var0.filterEnvelope.decode(var1);
         }

         var2 = var1.readUnsignedByte(-303759600);
         if (var2 != 0) {
            var1.offset -= 1741769013;
            var0.volume = new SoundEnvelope();
            var0.volume.decode(var1);
            var0.volumeMultiplierAmplitude = new SoundEnvelope();
            var0.volumeMultiplierAmplitude.decode(var1);
         }

         for (int var3 = 0; var3 < 10; var3++) {
            int var4 = Buffer.method12050(var1, -439512924);
            if (var4 == 0) {
               break;
            }

            var0.oscillatorVolume[var3] = var4;
            var0.oscillatorPitch[var3] = var1.readShortSmart(-483331973);
            var0.oscillatorDelays[var3] = Buffer.method12050(var1, 1556975176);
         }

         var0.delayTime = Buffer.method12050(var1, 848355531);
         var0.delayDecay = Buffer.method12050(var1, 138952483);
         var0.duration = Buffer.method12008(var1, (byte)5);
         var0.offset = Buffer.method12008(var1, (byte)5);
         var0.filter = new AudioFilter();
         var0.pitchModifier = new SoundEnvelope();
         var0.filter.method3766(var1, var0.pitchModifier);
      }
   }

   @ObfuscatedSignature(descriptor = "(Leg;III)[I")
   @ObfuscatedName("lx")
   public static int[] method3713(Instrument var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method3716(var1, var1, var1);
      } else {
         class488.clearIntArray(Instrument_samples, 0, var1);
         if (var2 < 10) {
            return Instrument_samples;
         } else {
            double var4 = var1 / (var2 + 0.0);
            var0.release.reset();
            var0.attack.reset();
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            if (var0.pitchModifierAmplitude != null) {
               var0.pitchModifierAmplitude.reset();
               var0.volumeMultiplier.reset();
               var6 = (int)((var0.pitchModifierAmplitude.end - var0.pitchModifierAmplitude.start) * 32.768 / var4);
               var7 = (int)(var0.pitchModifierAmplitude.start * 32.768 / var4);
            }

            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (var0.pitch != null) {
               var0.pitch.reset();
               var0.filterEnvelope.reset();
               var9 = (int)((var0.pitch.end - var0.pitch.start) * 32.768 / var4);
               var10 = (int)(var0.pitch.start * 32.768 / var4);
            }

            for (int var12 = 0; var12 < 5; var12++) {
               if (var0.oscillatorVolume[var12] != 0) {
                  Instrument_phases[var12] = 0;
                  Instrument_delays[var12] = (int)(var0.oscillatorDelays[var12] * var4);
                  Instrument_volumeSteps[var12] = (var0.oscillatorVolume[var12] << 14) / 100;
                  Instrument_pitchSteps[var12] = (int)(
                     (var0.release.end - var0.release.start) * 32.768 * Math.pow(1.0057929410678534, var0.oscillatorPitch[var12]) / var4
                  );
                  Instrument_pitchBaseSteps[var12] = (int)(var0.release.start * 32.768 / var4);
               }
            }

            for (int var20 = 0; var20 < var1; var20++) {
               int var13 = var0.release.doStep(var1);
               int var14 = var0.attack.doStep(var1);
               if (var0.pitchModifierAmplitude != null) {
                  int var15 = var0.pitchModifierAmplitude.doStep(var1);
                  int var16 = var0.volumeMultiplier.doStep(var1);
                  var13 += var0.evaluateWave(var8, var16, var0.pitchModifierAmplitude.form) >> 1;
                  var8 += (var15 * var6 >> 16) + var7;
               }

               if (var0.pitch != null) {
                  int var32 = var0.pitch.doStep(var1);
                  int var36 = var0.filterEnvelope.doStep(var1);
                  var14 = var14 * ((var0.evaluateWave(var11, var36, var0.pitch.form) >> 1) + 32768) >> 15;
                  var11 += (var32 * var9 >> 16) + var10;
               }

               for (int var33 = 0; var33 < 5; var33++) {
                  if (var0.oscillatorVolume[var33] != 0) {
                     int var37 = var20 + Instrument_delays[var33];
                     if (var37 < var1) {
                        Instrument_samples[var37] = Instrument_samples[var37]
                           + var0.evaluateWave(Instrument_phases[var33], var14 * Instrument_volumeSteps[var33] >> 15, var0.release.form);
                        Instrument_phases[var33] = Instrument_phases[var33] + (var13 * Instrument_pitchSteps[var33] >> 16) + Instrument_pitchBaseSteps[var33];
                     }
                  }
               }
            }

            if (var0.volume != null) {
               var0.volume.reset();
               var0.volumeMultiplierAmplitude.reset();
               short var21 = 0;
               int var26 = 0;
               boolean var30 = true;

               for (int var34 = 0; var34 < var1; var34++) {
                  int var38 = var0.volume.doStep(var1);
                  int var17 = var0.volumeMultiplierAmplitude.doStep(var1);
                  if (var30) {
                     var26 = var0.volume.start + ((var0.volume.end - var0.volume.start) * var38 >> 8);
                  } else {
                     var26 = var0.volume.start + ((var0.volume.end - var0.volume.start) * var17 >> 8);
                  }

                  var21 += 256;
                  if (var21 >= var26) {
                     var21 = 0;
                     var30 = !var30;
                  }

                  if (var30) {
                     Instrument_samples[var34] = 0;
                  }
               }
            }

            if (var0.delayTime > 0 && var0.delayDecay > 0) {
               int var22 = (int)(var0.delayTime * var4);

               for (int var28 = var22; var28 < var1; var28++) {
                  Instrument_samples[var28] = Instrument_samples[var28] + Instrument_samples[var28 - var22] * var0.delayDecay / 100;
               }
            }

            if (var0.filter.pairs[0] > 0 || var0.filter.pairs[1] > 0) {
               var0.pitchModifier.reset();
               int var23 = var0.pitchModifier.doStep(var1 + 1);
               int var29 = AudioFilter.method3765(var0.filter, 0, var23 / 65536.0F, var3);
               int var31 = AudioFilter.method3765(var0.filter, 1, var23 / 65536.0F, var3);
               if (var1 >= var29 + var31) {
                  int var35 = 0;
                  int var39 = var31;
                  if (var31 > var1 - var29) {
                     var39 = var1 - var29;
                  }

                  while (var35 < var39) {
                     int var41 = (int)((long)Instrument_samples[var35 + var29] * AudioFilter.forwardMultiplier >> 16);

                     for (int var18 = 0; var18 < var29; var18++) {
                        var41 += (int)((long)Instrument_samples[var35 + var29 - 1 - var18] * AudioFilter.coefficients[0][var18] >> 16);
                     }

                     for (int var43 = 0; var43 < var35; var43++) {
                        var41 -= (int)((long)Instrument_samples[var35 - 1 - var43] * AudioFilter.coefficients[1][var43] >> 16);
                     }

                     Instrument_samples[var35] = var41;
                     var23 = var0.pitchModifier.doStep(var1 + 1);
                     var35++;
                  }

                  short var42 = 128;
                  var39 = 128;

                  while (true) {
                     if (var39 > var1 - var29) {
                        var39 = var1 - var29;
                     }

                     while (var35 < var39) {
                        int var44 = (int)((long)Instrument_samples[var35 + var29] * AudioFilter.forwardMultiplier >> 16);

                        for (int var19 = 0; var19 < var29; var19++) {
                           var44 += (int)((long)Instrument_samples[var35 + var29 - 1 - var19] * AudioFilter.coefficients[0][var19] >> 16);
                        }

                        for (int var46 = 0; var46 < var31; var46++) {
                           var44 -= (int)((long)Instrument_samples[var35 - 1 - var46] * AudioFilter.coefficients[1][var46] >> 16);
                        }

                        Instrument_samples[var35] = var44;
                        var23 = var0.pitchModifier.doStep(var1 + 1);
                        var35++;
                     }

                     if (var35 >= var1 - var29) {
                        while (var35 < var1) {
                           int var45 = 0;

                           for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
                              var45 += (int)((long)Instrument_samples[var35 + var29 - 1 - var47] * AudioFilter.coefficients[0][var47] >> 16);
                           }

                           for (int var48 = 0; var48 < var31; var48++) {
                              var45 -= (int)((long)Instrument_samples[var35 - 1 - var48] * AudioFilter.coefficients[1][var48] >> 16);
                           }

                           Instrument_samples[var35] = var45;
                           var23 = var0.pitchModifier.doStep(var1 + 1);
                           var35++;
                        }
                        break;
                     }

                     var29 = AudioFilter.method3765(var0.filter, 0, var23 / 65536.0F, var3);
                     var31 = AudioFilter.method3765(var0.filter, 1, var23 / 65536.0F, var3);
                     var39 += 128;
                  }
               }
            }

            for (int var25 = 0; var25 < var1; var25++) {
               if (Instrument_samples[var25] < -32768) {
                  Instrument_samples[var25] = -32768;
               }

               if (Instrument_samples[var25] > 32767) {
                  Instrument_samples[var25] = 32767;
               }
            }

            return Instrument_samples;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("av")
   final int[] method3714(int var1, int var2, int var3) {
      class488.clearIntArray(Instrument_samples, 0, var1);
      if (var2 < 10) {
         return Instrument_samples;
      } else {
         double var4 = var1 / (var2 + 0.0);
         this.release.reset();
         this.attack.reset();
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         if (this.pitchModifierAmplitude != null) {
            this.pitchModifierAmplitude.reset();
            this.volumeMultiplier.reset();
            var6 = (int)((this.pitchModifierAmplitude.end - this.pitchModifierAmplitude.start) * 32.768 / var4);
            var7 = (int)(this.pitchModifierAmplitude.start * 32.768 / var4);
         }

         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         if (this.pitch != null) {
            this.pitch.reset();
            this.filterEnvelope.reset();
            var9 = (int)((this.pitch.end - this.pitch.start) * 32.768 / var4);
            var10 = (int)(this.pitch.start * 32.768 / var4);
         }

         for (int var12 = 0; var12 < 5; var12++) {
            if (this.oscillatorVolume[var12] != 0) {
               Instrument_phases[var12] = 0;
               Instrument_delays[var12] = (int)(this.oscillatorDelays[var12] * var4);
               Instrument_volumeSteps[var12] = (this.oscillatorVolume[var12] << 14) / 100;
               Instrument_pitchSteps[var12] = (int)(
                  (this.release.end - this.release.start) * 32.768 * Math.pow(1.0057929410678534, this.oscillatorPitch[var12]) / var4
               );
               Instrument_pitchBaseSteps[var12] = (int)(this.release.start * 32.768 / var4);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var13 = this.release.doStep(var1);
            int var14 = this.attack.doStep(var1);
            if (this.pitchModifierAmplitude != null) {
               int var15 = this.pitchModifierAmplitude.doStep(var1);
               int var16 = this.volumeMultiplier.doStep(var1);
               var13 += this.evaluateWave(var8, var16, this.pitchModifierAmplitude.form) >> 1;
               var8 += (var15 * var6 >> 16) + var7;
            }

            if (this.pitch != null) {
               int var32 = this.pitch.doStep(var1);
               int var36 = this.filterEnvelope.doStep(var1);
               var14 = var14 * ((this.evaluateWave(var11, var36, this.pitch.form) >> 1) + 32768) >> 15;
               var11 += (var32 * var9 >> 16) + var10;
            }

            for (int var33 = 0; var33 < 5; var33++) {
               if (this.oscillatorVolume[var33] != 0) {
                  int var37 = var20 + Instrument_delays[var33];
                  if (var37 < var1) {
                     Instrument_samples[var37] = Instrument_samples[var37]
                        + this.evaluateWave(Instrument_phases[var33], var14 * Instrument_volumeSteps[var33] >> 15, this.release.form);
                     Instrument_phases[var33] = Instrument_phases[var33] + (var13 * Instrument_pitchSteps[var33] >> 16) + Instrument_pitchBaseSteps[var33];
                  }
               }
            }
         }

         if (this.volume != null) {
            this.volume.reset();
            this.volumeMultiplierAmplitude.reset();
            short var21 = 0;
            int var26 = 0;
            boolean var30 = true;

            for (int var34 = 0; var34 < var1; var34++) {
               int var38 = this.volume.doStep(var1);
               int var17 = this.volumeMultiplierAmplitude.doStep(var1);
               if (var30) {
                  var26 = this.volume.start + ((this.volume.end - this.volume.start) * var38 >> 8);
               } else {
                  var26 = this.volume.start + ((this.volume.end - this.volume.start) * var17 >> 8);
               }

               var21 += 256;
               if (var21 >= var26) {
                  var21 = 0;
                  var30 = !var30;
               }

               if (var30) {
                  Instrument_samples[var34] = 0;
               }
            }
         }

         if (this.delayTime > 0 && this.delayDecay > 0) {
            int var22 = (int)(this.delayTime * var4);

            for (int var28 = var22; var28 < var1; var28++) {
               Instrument_samples[var28] = Instrument_samples[var28] + Instrument_samples[var28 - var22] * this.delayDecay / 100;
            }
         }

         if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
            this.pitchModifier.reset();
            int var23 = this.pitchModifier.doStep(var1 + 1);
            int var29 = AudioFilter.method3765(this.filter, 0, var23 / 65536.0F, var3);
            int var31 = AudioFilter.method3765(this.filter, 1, var23 / 65536.0F, var3);
            if (var1 >= var29 + var31) {
               int var35 = 0;
               int var39 = var31;
               if (var31 > var1 - var29) {
                  var39 = var1 - var29;
               }

               while (var35 < var39) {
                  int var41 = (int)((long)Instrument_samples[var35 + var29] * AudioFilter.forwardMultiplier >> 16);

                  for (int var18 = 0; var18 < var29; var18++) {
                     var41 += (int)((long)Instrument_samples[var35 + var29 - 1 - var18] * AudioFilter.coefficients[0][var18] >> 16);
                  }

                  for (int var43 = 0; var43 < var35; var43++) {
                     var41 -= (int)((long)Instrument_samples[var35 - 1 - var43] * AudioFilter.coefficients[1][var43] >> 16);
                  }

                  Instrument_samples[var35] = var41;
                  var23 = this.pitchModifier.doStep(var1 + 1);
                  var35++;
               }

               short var42 = 128;
               var39 = 128;

               while (true) {
                  if (var39 > var1 - var29) {
                     var39 = var1 - var29;
                  }

                  while (var35 < var39) {
                     int var44 = (int)((long)Instrument_samples[var35 + var29] * AudioFilter.forwardMultiplier >> 16);

                     for (int var19 = 0; var19 < var29; var19++) {
                        var44 += (int)((long)Instrument_samples[var35 + var29 - 1 - var19] * AudioFilter.coefficients[0][var19] >> 16);
                     }

                     for (int var46 = 0; var46 < var31; var46++) {
                        var44 -= (int)((long)Instrument_samples[var35 - 1 - var46] * AudioFilter.coefficients[1][var46] >> 16);
                     }

                     Instrument_samples[var35] = var44;
                     var23 = this.pitchModifier.doStep(var1 + 1);
                     var35++;
                  }

                  if (var35 >= var1 - var29) {
                     while (var35 < var1) {
                        int var45 = 0;

                        for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
                           var45 += (int)((long)Instrument_samples[var35 + var29 - 1 - var47] * AudioFilter.coefficients[0][var47] >> 16);
                        }

                        for (int var48 = 0; var48 < var31; var48++) {
                           var45 -= (int)((long)Instrument_samples[var35 - 1 - var48] * AudioFilter.coefficients[1][var48] >> 16);
                        }

                        Instrument_samples[var35] = var45;
                        var23 = this.pitchModifier.doStep(var1 + 1);
                        var35++;
                     }
                     break;
                  }

                  var29 = AudioFilter.method3765(this.filter, 0, var23 / 65536.0F, var3);
                  var31 = AudioFilter.method3765(this.filter, 1, var23 / 65536.0F, var3);
                  var39 += 128;
               }
            }
         }

         for (int var25 = 0; var25 < var1; var25++) {
            if (Instrument_samples[var25] < -32768) {
               Instrument_samples[var25] = -32768;
            }

            if (Instrument_samples[var25] > 32767) {
               Instrument_samples[var25] = 32767;
            }
         }

         return Instrument_samples;
      }
   }

   static {
      Random var0 = new Random(0L);

      for (int var1 = 0; var1 < 32768; var1++) {
         Instrument_noise[var1] = (var0.nextInt() & 2) - 1;
      }

      Instrument_sine = new int[32768];

      for (int var2 = 0; var2 < 32768; var2++) {
         Instrument_sine[var2] = (int)(Math.sin(var2 / 5215.1903) * 16384.0);
      }

      Instrument_samples = new int[220500];
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ap")
   final void method3723(Buffer var1) {
      this.release = new SoundEnvelope();
      this.release.decode(var1);
      this.attack = new SoundEnvelope();
      this.attack.decode(var1);
      int var2 = var1.readUnsignedByte(113018567);
      if (var2 != 0) {
         var1.offset -= 1741769013;
         this.pitchModifierAmplitude = new SoundEnvelope();
         this.pitchModifierAmplitude.decode(var1);
         this.volumeMultiplier = new SoundEnvelope();
         this.volumeMultiplier.decode(var1);
      }

      var2 = var1.readUnsignedByte(-486546123);
      if (var2 != 0) {
         var1.offset -= 640385232;
         this.pitch = new SoundEnvelope();
         this.pitch.decode(var1);
         this.filterEnvelope = new SoundEnvelope();
         this.filterEnvelope.decode(var1);
      }

      var2 = var1.readUnsignedByte(-109215352);
      if (var2 != 0) {
         var1.offset -= 544766395;
         this.volume = new SoundEnvelope();
         this.volume.decode(var1);
         this.volumeMultiplierAmplitude = new SoundEnvelope();
         this.volumeMultiplierAmplitude.decode(var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = Buffer.method12050(var1, 1325202297);
         if (var4 == 0) {
            break;
         }

         this.oscillatorVolume[var3] = var4;
         this.oscillatorPitch[var3] = var1.readShortSmart(-839346016);
         this.oscillatorDelays[var3] = Buffer.method12050(var1, -2085740356);
      }

      this.delayTime = Buffer.method12050(var1, 2082038164);
      this.delayDecay = Buffer.method12050(var1, -810931534);
      this.duration = Buffer.method12008(var1, (byte)5);
      this.offset = Buffer.method12008(var1, (byte)5);
      this.filter = new AudioFilter();
      this.pitchModifier = new SoundEnvelope();
      this.filter.method3766(var1, this.pitchModifier);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leg;III)I")
   @ObfuscatedName("lt")
   public static int method3718(Instrument var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method3714(var1, var1, var1);
      }

      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return Instrument_sine[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? Instrument_noise[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ak")
   final int method3719(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return Instrument_sine[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? Instrument_noise[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leg;III)[I")
   @ObfuscatedName("me")
   public static int[] method3715(Instrument var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.evaluateWave(var1, var1, var1);
      }

      class488.clearIntArray(Instrument_samples, 0, var1);
      if (var2 < 10) {
         return Instrument_samples;
      } else {
         double var4 = var1 / (var2 + 0.0);
         var0.release.reset();
         var0.attack.reset();
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         if (var0.pitchModifierAmplitude != null) {
            var0.pitchModifierAmplitude.reset();
            var0.volumeMultiplier.reset();
            var6 = (int)((var0.pitchModifierAmplitude.end - var0.pitchModifierAmplitude.start) * 32.768 / var4);
            var7 = (int)(var0.pitchModifierAmplitude.start * 32.768 / var4);
         }

         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         if (var0.pitch != null) {
            var0.pitch.reset();
            var0.filterEnvelope.reset();
            var9 = (int)((var0.pitch.end - var0.pitch.start) * 32.768 / var4);
            var10 = (int)(var0.pitch.start * 32.768 / var4);
         }

         for (int var12 = 0; var12 < 5; var12++) {
            if (var0.oscillatorVolume[var12] != 0) {
               Instrument_phases[var12] = 0;
               Instrument_delays[var12] = (int)(var0.oscillatorDelays[var12] * var4);
               Instrument_volumeSteps[var12] = (var0.oscillatorVolume[var12] << 14) / 100;
               Instrument_pitchSteps[var12] = (int)(
                  (var0.release.end - var0.release.start) * 32.768 * Math.pow(1.0057929410678534, var0.oscillatorPitch[var12]) / var4
               );
               Instrument_pitchBaseSteps[var12] = (int)(var0.release.start * 32.768 / var4);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var13 = var0.release.doStep(var1);
            int var14 = var0.attack.doStep(var1);
            if (var0.pitchModifierAmplitude != null) {
               int var15 = var0.pitchModifierAmplitude.doStep(var1);
               int var16 = var0.volumeMultiplier.doStep(var1);
               var13 += var0.evaluateWave(var8, var16, var0.pitchModifierAmplitude.form) >> 1;
               var8 += (var15 * var6 >> 16) + var7;
            }

            if (var0.pitch != null) {
               int var32 = var0.pitch.doStep(var1);
               int var36 = var0.filterEnvelope.doStep(var1);
               var14 = var14 * ((var0.evaluateWave(var11, var36, var0.pitch.form) >> 1) + 32768) >> 15;
               var11 += (var32 * var9 >> 16) + var10;
            }

            for (int var33 = 0; var33 < 5; var33++) {
               if (var0.oscillatorVolume[var33] != 0) {
                  int var37 = var20 + Instrument_delays[var33];
                  if (var37 < var1) {
                     Instrument_samples[var37] = Instrument_samples[var37]
                        + var0.evaluateWave(Instrument_phases[var33], var14 * Instrument_volumeSteps[var33] >> 15, var0.release.form);
                     Instrument_phases[var33] = Instrument_phases[var33] + (var13 * Instrument_pitchSteps[var33] >> 16) + Instrument_pitchBaseSteps[var33];
                  }
               }
            }
         }

         if (var0.volume != null) {
            var0.volume.reset();
            var0.volumeMultiplierAmplitude.reset();
            short var21 = 0;
            int var26 = 0;
            boolean var30 = true;

            for (int var34 = 0; var34 < var1; var34++) {
               int var38 = var0.volume.doStep(var1);
               int var17 = var0.volumeMultiplierAmplitude.doStep(var1);
               if (var30) {
                  var26 = var0.volume.start + ((var0.volume.end - var0.volume.start) * var38 >> 8);
               } else {
                  var26 = var0.volume.start + ((var0.volume.end - var0.volume.start) * var17 >> 8);
               }

               var21 += 256;
               if (var21 >= var26) {
                  var21 = 0;
                  var30 = !var30;
               }

               if (var30) {
                  Instrument_samples[var34] = 0;
               }
            }
         }

         if (var0.delayTime > 0 && var0.delayDecay > 0) {
            int var22 = (int)(var0.delayTime * var4);

            for (int var28 = var22; var28 < var1; var28++) {
               Instrument_samples[var28] = Instrument_samples[var28] + Instrument_samples[var28 - var22] * var0.delayDecay / 100;
            }
         }

         if (var0.filter.pairs[0] > 0 || var0.filter.pairs[1] > 0) {
            var0.pitchModifier.reset();
            int var23 = var0.pitchModifier.doStep(var1 + 1);
            int var29 = AudioFilter.method3765(var0.filter, 0, var23 / 65536.0F, var3);
            int var31 = AudioFilter.method3765(var0.filter, 1, var23 / 65536.0F, var3);
            if (var1 >= var29 + var31) {
               int var35 = 0;
               int var39 = var31;
               if (var31 > var1 - var29) {
                  var39 = var1 - var29;
               }

               while (var35 < var39) {
                  int var41 = (int)((long)Instrument_samples[var35 + var29] * AudioFilter.forwardMultiplier >> 16);

                  for (int var18 = 0; var18 < var29; var18++) {
                     var41 += (int)((long)Instrument_samples[var35 + var29 - 1 - var18] * AudioFilter.coefficients[0][var18] >> 16);
                  }

                  for (int var43 = 0; var43 < var35; var43++) {
                     var41 -= (int)((long)Instrument_samples[var35 - 1 - var43] * AudioFilter.coefficients[1][var43] >> 16);
                  }

                  Instrument_samples[var35] = var41;
                  var23 = var0.pitchModifier.doStep(var1 + 1);
                  var35++;
               }

               short var42 = 128;
               var39 = 128;

               while (true) {
                  if (var39 > var1 - var29) {
                     var39 = var1 - var29;
                  }

                  while (var35 < var39) {
                     int var44 = (int)((long)Instrument_samples[var35 + var29] * AudioFilter.forwardMultiplier >> 16);

                     for (int var19 = 0; var19 < var29; var19++) {
                        var44 += (int)((long)Instrument_samples[var35 + var29 - 1 - var19] * AudioFilter.coefficients[0][var19] >> 16);
                     }

                     for (int var46 = 0; var46 < var31; var46++) {
                        var44 -= (int)((long)Instrument_samples[var35 - 1 - var46] * AudioFilter.coefficients[1][var46] >> 16);
                     }

                     Instrument_samples[var35] = var44;
                     var23 = var0.pitchModifier.doStep(var1 + 1);
                     var35++;
                  }

                  if (var35 >= var1 - var29) {
                     while (var35 < var1) {
                        int var45 = 0;

                        for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
                           var45 += (int)((long)Instrument_samples[var35 + var29 - 1 - var47] * AudioFilter.coefficients[0][var47] >> 16);
                        }

                        for (int var48 = 0; var48 < var31; var48++) {
                           var45 -= (int)((long)Instrument_samples[var35 - 1 - var48] * AudioFilter.coefficients[1][var48] >> 16);
                        }

                        Instrument_samples[var35] = var45;
                        var23 = var0.pitchModifier.doStep(var1 + 1);
                        var35++;
                     }
                     break;
                  }

                  var29 = AudioFilter.method3765(var0.filter, 0, var23 / 65536.0F, var3);
                  var31 = AudioFilter.method3765(var0.filter, 1, var23 / 65536.0F, var3);
                  var39 += 128;
               }
            }
         }

         for (int var25 = 0; var25 < var1; var25++) {
            if (Instrument_samples[var25] < -32768) {
               Instrument_samples[var25] = -32768;
            }

            if (Instrument_samples[var25] > 32767) {
               Instrument_samples[var25] = 32767;
            }
         }

         return Instrument_samples;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("an")
   final int[] method3716(int var1, int var2, int var3) {
      class488.method10104(Instrument_pitchBaseSteps, 0, var1);
      if (var2 < 10) {
         return Instrument_delays;
      } else {
         double var4 = var1 / (var2 + 0.0);
         this.pitch.reset();
         this.release.reset();
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         if (this.release != null) {
            this.filterEnvelope.method3406();
            this.volume.method3406();
            var6 = (int)((this.release.max - this.pitchModifier.start) * 32.768 / var4);
            var7 = (int)(this.attack.end * 32.768 / var4);
         }

         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         if (this.pitchModifier != null) {
            this.pitch.reset();
            this.attack.reset();
            var9 = (int)((this.pitchModifierAmplitude.start - this.pitchModifier.ticks) * 32.768 / var4);
            var10 = (int)(this.pitchModifierAmplitude.phaseIndex * 32.768 / var4);
         }

         for (int var12 = 0; var12 < 5; var12++) {
            if (this.oscillatorPitch[var12] != 0) {
               Instrument_delays[var12] = 0;
               Instrument_delays[var12] = (int)(this.oscillatorPitch[var12] * var4);
               Instrument_phases[var12] = (this.oscillatorPitch[var12] << 14) / 100;
               Instrument_noise[var12] = (int)(
                  (this.attack.ticks - this.volumeMultiplierAmplitude.amplitude) * 32.768 * Math.pow(1.0057929410678534, this.oscillatorPitch[var12]) / var4
               );
               Instrument_phases[var12] = (int)(this.filterEnvelope.end * 32.768 / var4);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var13 = this.pitch.method3410(var1);
            int var14 = this.release.method3412(var1);
            if (this.pitchModifierAmplitude != null) {
               int var15 = this.pitchModifierAmplitude.method3411(var1);
               int var16 = this.release.doStep(var1);
               var13 += this.evaluateWave(var8, var16, this.release.start) >> 1;
               var8 += (var15 * var6 >> 16) + var7;
            }

            if (this.filterEnvelope != null) {
               int var32 = this.pitchModifierAmplitude.doStep(var1);
               int var36 = this.pitchModifierAmplitude.method3412(var1);
               var14 = var14 * ((this.evaluateWave(var11, var36, this.pitchModifierAmplitude.segments) >> 1) + 32768) >> 15;
               var11 += (var32 * var9 >> 16) + var10;
            }

            for (int var33 = 0; var33 < 5; var33++) {
               if (this.oscillatorPitch[var33] != 0) {
                  int var37 = var20 + Instrument_volumeSteps[var33];
                  if (var37 < var1) {
                     Instrument_volumeSteps[var37] = Instrument_volumeSteps[var37]
                        + this.evaluateWave(Instrument_pitchBaseSteps[var33], var14 * Instrument_phases[var33] >> 15, this.volumeMultiplier.form);
                     Instrument_samples[var33] = Instrument_samples[var33] + (var13 * Instrument_sine[var33] >> 16) + Instrument_phases[var33];
                  }
               }
            }
         }

         if (this.pitchModifierAmplitude != null) {
            this.attack.reset();
            this.volumeMultiplierAmplitude.method3406();
            short var21 = 0;
            int var26 = 0;
            boolean var30 = true;

            for (int var34 = 0; var34 < var1; var34++) {
               int var38 = this.pitch.method3410(var1);
               int var17 = this.pitchModifier.method3412(var1);
               if (var30) {
                  var26 = this.volume.segments + ((this.release.segments - this.pitchModifierAmplitude.step) * var38 >> 8);
               } else {
                  var26 = this.volume.form + ((this.pitch.end - this.volume.ticks) * var17 >> 8);
               }

               var21 += 256;
               if (var21 >= var26) {
                  var21 = 0;
                  var30 = !var30;
               }

               if (var30) {
                  Instrument_phases[var34] = 0;
               }
            }
         }

         if (this.delayDecay > 0 && this.offset > 0) {
            int var22 = (int)(this.offset * var4);

            for (int var28 = var22; var28 < var1; var28++) {
               Instrument_volumeSteps[var28] = Instrument_volumeSteps[var28] + Instrument_volumeSteps[var28 - var22] * this.delayDecay / 100;
            }
         }

         if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
            this.filterEnvelope.reset();
            int var23 = this.release.method3411(var1 + 1);
            int var29 = AudioFilter.method3765(this.filter, 0, var23 / 65536.0F, var3);
            int var31 = AudioFilter.method3765(this.filter, 1, var23 / 65536.0F, var3);
            if (var1 >= var29 + var31) {
               int var35 = 0;
               int var39 = var31;
               if (var31 > var1 - var29) {
                  var39 = var1 - var29;
               }

               while (var35 < var39) {
                  int var41 = (int)((long)Instrument_volumeSteps[var35 + var29] * AudioFilter.forwardMultiplier >> 16);

                  for (int var18 = 0; var18 < var29; var18++) {
                     var41 += (int)((long)Instrument_phases[var35 + var29 - 1 - var18] * AudioFilter.coefficients[0][var18] >> 16);
                  }

                  for (int var43 = 0; var43 < var35; var43++) {
                     var41 -= (int)((long)Instrument_pitchBaseSteps[var35 - 1 - var43] * AudioFilter.coefficients[1][var43] >> 16);
                  }

                  Instrument_sine[var35] = var41;
                  var23 = this.volumeMultiplier.method3412(var1 + 1);
                  var35++;
               }

               short var42 = 128;
               var39 = 128;

               while (true) {
                  if (var39 > var1 - var29) {
                     var39 = var1 - var29;
                  }

                  while (var35 < var39) {
                     int var44 = (int)((long)Instrument_pitchSteps[var35 + var29] * AudioFilter.forwardMultiplier >> 16);

                     for (int var19 = 0; var19 < var29; var19++) {
                        var44 += (int)((long)Instrument_delays[var35 + var29 - 1 - var19] * AudioFilter.coefficients[0][var19] >> 16);
                     }

                     for (int var46 = 0; var46 < var31; var46++) {
                        var44 -= (int)((long)Instrument_delays[var35 - 1 - var46] * AudioFilter.coefficients[1][var46] >> 16);
                     }

                     Instrument_pitchSteps[var35] = var44;
                     var23 = this.volume.doStep(var1 + 1);
                     var35++;
                  }

                  if (var35 >= var1 - var29) {
                     while (var35 < var1) {
                        int var45 = 0;

                        for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
                           var45 += (int)((long)Instrument_noise[var35 + var29 - 1 - var47] * AudioFilter.coefficients[0][var47] >> 16);
                        }

                        for (int var48 = 0; var48 < var31; var48++) {
                           var45 -= (int)((long)Instrument_pitchBaseSteps[var35 - 1 - var48] * AudioFilter.coefficients[1][var48] >> 16);
                        }

                        Instrument_volumeSteps[var35] = var45;
                        var23 = this.filterEnvelope.method3411(var1 + 1);
                        var35++;
                     }
                     break;
                  }

                  var29 = AudioFilter.method3765(this.filter, 0, var23 / 65536.0F, var3);
                  var31 = AudioFilter.method3765(this.filter, 1, var23 / 65536.0F, var3);
                  var39 += 128;
               }
            }
         }

         for (int var25 = 0; var25 < var1; var25++) {
            if (Instrument_pitchBaseSteps[var25] < -32768) {
               Instrument_samples[var25] = -32768;
            }

            if (Instrument_volumeSteps[var25] > 32767) {
               Instrument_sine[var25] = 32767;
            }
         }

         return Instrument_phases;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ay")
   final void method3724(Buffer var1) {
      this.volume = new SoundEnvelope();
      this.release.decode(var1);
      this.volume = new SoundEnvelope();
      this.pitchModifier.method3402(var1);
      int var2 = var1.readVarInt(982664164);
      if (var2 != 0) {
         var1.offset -= 1741769013;
         this.pitch = new SoundEnvelope();
         this.pitchModifierAmplitude.method3404(var1);
         this.volumeMultiplierAmplitude = new SoundEnvelope();
         this.pitchModifier.method3405(var1);
      }

      var2 = var1.readShortLE(-993803431);
      if (var2 != 0) {
         var1.offset -= 1741769013;
         this.pitchModifierAmplitude = new SoundEnvelope();
         this.release.decodeSegments(var1);
         this.filterEnvelope = new SoundEnvelope();
         this.pitch.method3404(var1);
      }

      var2 = var1.packBytesToInt(-303759600);
      if (var2 != 0) {
         var1.offset -= 1741769013;
         this.volume = new SoundEnvelope();
         this.pitch.method3404(var1);
         this.pitchModifierAmplitude = new SoundEnvelope();
         this.pitchModifierAmplitude.method3404(var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = Buffer.method12050(var1, -439512924);
         if (var4 == 0) {
            break;
         }

         this.oscillatorPitch[var3] = var4;
         this.oscillatorVolume[var3] = var1.method12183(-483331973);
         this.oscillatorDelays[var3] = Buffer.method12050(var1, 1556975176);
      }

      this.delayTime = Buffer.method12050(var1, 848355531);
      this.delayTime = Buffer.method12050(var1, 138952483);
      this.offset = Buffer.method12008(var1, (byte)5);
      this.offset = Buffer.method12008(var1, (byte)5);
      this.filter = new AudioFilter();
      this.pitchModifierAmplitude = new SoundEnvelope();
      this.filter.method3768(var1, this.release);
   }
}
