import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dx")
public class SoundEffect {
   @ObfuscatedSignature(descriptor = "[Leg;")
   @ObfuscatedName("ae")
   final Instrument[] instruments = new Instrument[10];
   @ObfuscatedName("at")
   int field1516;
   @ObfuscatedName("av")
   int field1517;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1522 = 4;
   @ObfuscatedSignature(descriptor = "Les;")
   @ObfuscatedName("ag")
   class108 field1518;
   @ObfuscatedName("aj")
   int start;
   @ObfuscatedName("ak")
   int end;
   @ObfuscatedSignature(descriptor = "Lem;")
   @ObfuscatedName("an")
   static classEM field1521 = new classEM();

   @ObfuscatedSignature(descriptor = "(Lqm;II)Ldx;")
   @ObfuscatedName("at")
   public static SoundEffect readSoundEffect(AbstractArchive var0, int var1, int var2) {
      class108 var3 = new class108(field1521);
      byte[] var4 = var0.getFile(var1, var2, -500266297);
      if (var4 == null) {
         return null;
      } else {
         Buffer var5 = new Buffer(var4);
         if (var2 == 1) {
            if (var4.length < 4) {
               return null;
            }

            int var6 = Buffer.method12015(var5, 1742914356);
            var3.method3884(var4, 4, -1226370646);
            var5.offset = (var6 + 4) * 1741769013;
         } else {
            if (var2 != 0) {
               return null;
            }

            var5 = new Buffer(var4);
         }

         return new SoundEffect(var5, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("av")
   void method3569(Buffer var1) {
      this.field1517 = 22050;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = var1.readUnsignedByte(592113458);
         if (var3 != 0) {
            var1.offset -= 1741769013;
            this.instruments[var2] = new Instrument();
            Instrument.method3722(this.instruments[var2], var1);
         }
      }

      this.start = Buffer.method12008(var1, (byte)5);
      this.end = Buffer.method12008(var1, (byte)5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;)I")
   @ObfuscatedName("tr")
   public static int method3587(SoundEffect var0) {
      if (var0 == null) {
         var0.toRawSound();
      }

      int var1 = -456185630;

      for (int var2 = 0; var2 < 10; var2++) {
         if (var0.instruments[var2] != null && var0.instruments[var2].offset / 20 < var1) {
            var1 = var0.instruments[var2].offset / 20;
         }
      }

      if (var0.start < var0.end && var0.start / 20 < var1) {
         var1 = var0.start / 20;
      }

      if (var1 != 1727136061 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (var0.instruments[var3] != null) {
               var0.instruments[var3].offset -= var1 * 20;
            }
         }

         if (var0.start < var0.end) {
            var0.start -= var1 * 20;
            var0.end -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   SoundEffect(Buffer var1, int var2, class108 var3) {
      this.field1516 = var2;
      this.field1518 = var3;
      if (var2 == 0) {
         this.method3569(var1);
      } else {
         if (var2 != 1) {
            throw new RuntimeException("Invalid fileId for SFX");
         }

         var3.method3871(var1, 1537732678);
         this.field1517 = var3.method3859(1863658004);
         this.start = class108.method3865(var3, 1107150673);
         this.end = var3.method3866(-745750199);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("cm")
   public RawSound method3595() {
      return method3582(this);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   public final int calculateDelay() {
      int var1 = 9999999;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.instruments[var2] != null && this.instruments[var2].offset / 20 < var1) {
            var1 = this.instruments[var2].offset / 20;
         }
      }

      if (this.start < this.end && this.start / 20 < var1) {
         var1 = this.start / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (this.instruments[var3] != null) {
               this.instruments[var3].offset -= var1 * 20;
            }
         }

         if (this.start < this.end) {
            this.start -= var1 * 20;
            this.end -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)[S")
   @ObfuscatedName("ak")
   final short[] mix(boolean var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         if (this.instruments[var3] != null && this.instruments[var3].duration + this.instruments[var3].offset > var2) {
            var2 = this.instruments[var3].duration + this.instruments[var3].offset;
         }
      }

      if (var2 == 0) {
         return new short[0];
      } else {
         int var11 = this.field1517 * var2 / 1000;
         short[] var4 = new short[var11];

         for (int var5 = 0; var5 < 10; var5++) {
            if (this.instruments[var5] != null) {
               int var6 = this.instruments[var5].duration * this.field1517 / 1000;
               int var7 = this.instruments[var5].offset * this.field1517 / 1000;
               int[] var8 = Instrument.method3713(this.instruments[var5], var6, this.instruments[var5].duration, this.field1517);
               if (var1) {
                  for (int var12 = 0; var12 < var6; var12++) {
                     int var14 = var4[var12 + var7] + (var8[var12] >> 8);
                     var14 = classSF.method10160(-128, 127, var14, -19618711);
                     var4[var12 + var7] = (byte)var14;
                  }
               } else {
                  for (int var9 = 0; var9 < var6; var9++) {
                     int var10 = var4[var9 + var7] + var8[var9];
                     var10 = classSF.method10160(-32768, 32767, var10, -19618711);
                     var4[var9 + var7] = (short)var10;
                  }
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aw")
   void method3570(Buffer var1) {
      this.field1517 = -260965551;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = var1.readUnsignedByte(1917343079);
         if (var3 != 0) {
            var1.offset -= -3508689;
            this.instruments[var2] = new Instrument();
            Instrument.method3722(this.instruments[var2], var1);
         }
      }

      this.start = Buffer.method12008(var1, (byte)5);
      this.end = Buffer.method12008(var1, (byte)5);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("au")
   void method3571(Buffer var1) {
      this.field1517 = 22050;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = var1.readUnsignedByte(549675861);
         if (var3 != 0) {
            var1.offset -= 1741769013;
            this.instruments[var2] = new Instrument();
            Instrument.method3722(this.instruments[var2], var1);
         }
      }

      this.start = Buffer.method12008(var1, (byte)5);
      this.end = Buffer.method12008(var1, (byte)5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Ldx;")
   @ObfuscatedName("ad")
   public static SoundEffect method3577(AbstractArchive var0, int var1, int var2) {
      class108 var3 = new class108(field1521);
      byte[] var4 = var0.getFile(var1, var2, 2131517565);
      if (var4 == null) {
         return null;
      } else {
         Buffer var5 = new Buffer(var4);
         if (var2 == 1) {
            if (var4.length < 4) {
               return null;
            }

            int var6 = Buffer.method12015(var5, 1521258866);
            var3.method3884(var4, 4, -1226370646);
            var5.offset = (var6 + 4) * 1741769013;
         } else {
            if (var2 != 0) {
               return null;
            }

            var5 = new Buffer(var4);
         }

         return new SoundEffect(var5, var2, var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Ldx;")
   @ObfuscatedName("ai")
   public static SoundEffect method3578(AbstractArchive var0, int var1, int var2) {
      class108 var3 = new class108(field1521);
      byte[] var4 = var0.getFile(var1, var2, 475723594);
      if (var4 == null) {
         return null;
      } else {
         Buffer var5 = new Buffer(var4);
         if (var2 == 1) {
            if (var4.length < 4) {
               return null;
            }

            int var6 = Buffer.method12015(var5, -724377679);
            var3.method3884(var4, 4, -1226370646);
            var5.offset = (var6 + 4) * 1741769013;
         } else {
            if (var2 != 0) {
               return null;
            }

            var5 = new Buffer(var4);
         }

         return new SoundEffect(var5, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Ldq;")
   @ObfuscatedName("ac")
   public RawSound method3579(boolean var1) {
      short[] var2 = this.mix(var1);
      return new RawSound(this.field1517, var2, this.field1517 * this.start / -1296205315, this.field1517 * this.end / -1908162379, false, var1);
   }

   @ObfuscatedSignature(descriptor = "(Z)Ldq;")
   @ObfuscatedName("ag")
   public RawSound method3580(boolean var1) {
      short[] var2 = this.mix(var1);
      return new RawSound(this.field1517, var2, this.field1517 * this.start / 1000, this.field1517 * this.end / 1000, false, var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;Z)Ldq;")
   @ObfuscatedName("vl")
   public static RawSound method3581(SoundEffect var0, boolean var1) {
      if (var0 == null) {
         return var0.method3580(var1);
      } else {
         short[] var2 = var0.mix(var1);
         return new RawSound(var0.field1517, var2, var0.field1517 * var0.start / 1000, var0.field1517 * var0.end / 1863109032, false, var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("az")
   void method3572(Buffer var1) {
      this.field1517 = 1902275796;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = var1.readUnsignedByte(349941292);
         if (var3 != 0) {
            var1.offset -= -1411600796;
            this.instruments[var2] = new Instrument();
            Instrument.method3722(this.instruments[var2], var1);
         }
      }

      this.start = Buffer.method12008(var1, (byte)5);
      this.end = Buffer.method12008(var1, (byte)5);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public final int method3589() {
      int var1 = 9999999;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.instruments[var2] != null && this.instruments[var2].offset / 20 < var1) {
            var1 = this.instruments[var2].offset / 20;
         }
      }

      if (this.start < this.end && this.start / 20 < var1) {
         var1 = this.start / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (this.instruments[var3] != null) {
               this.instruments[var3].offset -= var1 * 20;
            }
         }

         if (this.start < this.end) {
            this.start -= var1 * 20;
            this.end -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldx;)Ldq;")
   @ObfuscatedName("bf")
   public static RawSound method3582(SoundEffect var0) {
      if (var0 == null) {
         return var0.toRawSound();
      } else {
         return var0.field1516 == 0 ? var0.method3580(false) : var0.field1518.method3875((byte)-35);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ley;)[B")
   @ObfuscatedName("dl")
   public static byte[] method3594(UrlRequest var0) {
      return var0.response0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;)Ldq;")
   @ObfuscatedName("vu")
   public static RawSound method3583(SoundEffect var0) {
      return var0.field1516 == 0 ? var0.method3580(false) : var0.field1518.method3875((byte)71);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)[Ljava/lang/Object;")
   @ObfuscatedName("yk")
   public static Object[] method3593(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method9659();
      }

      return var0.method9659();
   }

   @ObfuscatedSignature(descriptor = "(Z)[S")
   @ObfuscatedName("am")
   final short[] method3591(boolean var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         if (this.instruments[var3] != null && this.instruments[var3].duration + this.instruments[var3].offset > var2) {
            var2 = this.instruments[var3].duration + this.instruments[var3].offset;
         }
      }

      if (var2 == 0) {
         return new short[0];
      } else {
         int var11 = this.field1517 * var2 / 1000;
         short[] var4 = new short[var11];

         for (int var5 = 0; var5 < 10; var5++) {
            if (this.instruments[var5] != null) {
               int var6 = this.instruments[var5].duration * this.field1517 / 718726147;
               int var7 = this.instruments[var5].offset * this.field1517 / -749046274;
               int[] var8 = Instrument.method3713(this.instruments[var5], var6, this.instruments[var5].duration, this.field1517);
               if (var1) {
                  for (int var12 = 0; var12 < var6; var12++) {
                     int var14 = var4[var12 + var7] + (var8[var12] >> 8);
                     var14 = classSF.method10160(-128, 127, var14, -19618711);
                     var4[var12 + var7] = (byte)var14;
                  }
               } else {
                  for (int var9 = 0; var9 < var6; var9++) {
                     int var10 = var4[var9 + var7] + var8[var9];
                     var10 = classSF.method10160(-32768, -1013706053, var10, -19618711);
                     var4[var9 + var7] = (short)var10;
                  }
               }
            }
         }

         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;Lxa;)V")
   @ObfuscatedName("xl")
   public static void method3573(SoundEffect var0, Buffer var1) {
      if (var0 == null) {
         var0.method3569(var1);
      }

      var0.field1517 = 22050;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = var1.readUnsignedByte(1900139641);
         if (var3 != 0) {
            var1.offset -= 1741769013;
            var0.instruments[var2] = new Instrument();
            Instrument.method3722(var0.instruments[var2], var1);
         }
      }

      var0.start = Buffer.method12008(var1, (byte)5);
      var0.end = Buffer.method12008(var1, (byte)5);
   }

   @ObfuscatedSignature(descriptor = "(Z)[S")
   @ObfuscatedName("ao")
   final short[] method3592(boolean var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         if (this.instruments[var3] != null && this.instruments[var3].duration + this.instruments[var3].offset > var2) {
            var2 = this.instruments[var3].duration + this.instruments[var3].offset;
         }
      }

      if (var2 == 0) {
         return new short[0];
      } else {
         int var11 = this.field1517 * var2 / 2125240497;
         short[] var4 = new short[var11];

         for (int var5 = 0; var5 < 10; var5++) {
            if (this.instruments[var5] != null) {
               int var6 = this.instruments[var5].duration * this.field1517 / 1000;
               int var7 = this.instruments[var5].offset * this.field1517 / 1000;
               int[] var8 = Instrument.method3713(this.instruments[var5], var6, this.instruments[var5].duration, this.field1517);
               if (var1) {
                  for (int var12 = 0; var12 < var6; var12++) {
                     int var14 = var4[var12 + var7] + (var8[var12] >> 8);
                     var14 = classSF.method10160(-128, 127, var14, -19618711);
                     var4[var12 + var7] = (byte)var14;
                  }
               } else {
                  for (int var9 = 0; var9 < var6; var9++) {
                     int var10 = var4[var9 + var7] + var8[var9];
                     var10 = classSF.method10160(-32768, -593597134, var10, -19618711);
                     var4[var9 + var7] = (short)var10;
                  }
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Ldq;")
   @ObfuscatedName("ae")
   public RawSound method3586(boolean var1) {
      return this.start == 0 ? this.method3580(var1) : this.field1518.method3875((byte)-86);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldx;Lxa;)V")
   @ObfuscatedName("mz")
   public static void method3574(SoundEffect var0, Buffer var1) {
      if (var0 == null) {
         var0.method3575(var1);
      } else {
         var0.field1517 = -1252595434;

         for (int var2 = 0; var2 < 10; var2++) {
            int var3 = var1.readUnsignedByte(1198926629);
            if (var3 != 0) {
               var1.offset -= 1741769013;
               var0.instruments[var2] = new Instrument();
               Instrument.method3722(var0.instruments[var2], var1);
            }
         }

         var0.start = Buffer.method12008(var1, (byte)5);
         var0.end = Buffer.method12008(var1, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("an")
   public RawSound toRawSound() {
      return this.end == 0 ? this.method3579(false) : this.field1518.method3875((byte)-35);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ap")
   void method3575(Buffer var1) {
      this.field1517 = -260965551;

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = var1.readUnsignedByte(1917343079);
         if (var3 != 0) {
            var1.offset -= -3508689;
            this.instruments[var2] = new Instrument();
            Instrument.method3722(this.instruments[var2], var1);
         }
      }

      this.field1517 = Buffer.method12008(var1, (byte)5);
      this.end = Buffer.method12008(var1, (byte)5);
   }

   @ObfuscatedSignature(descriptor = "()Ldq;")
   @ObfuscatedName("ar")
   public RawSound method3585() {
      return this.end == 0 ? this.method3586(false) : this.field1518.method3875((byte)57);
   }
}
