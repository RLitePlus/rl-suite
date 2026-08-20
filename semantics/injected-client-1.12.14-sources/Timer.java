import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pb")
public class Timer {
   @ObfuscatedName("av")
   public boolean field4781 = false;
   @ObfuscatedName("at")
   long field4774 = 3640193842833584623L;
   @ObfuscatedName("ag")
   long field4776 = -1927340229650513099L;
   @ObfuscatedName("an")
   long field4777 = 0L;
   @ObfuscatedName("ae")
   long field4780 = 0L;
   @ObfuscatedName("aj")
   long field4779 = 0L;
   @ObfuscatedName("ay")
   int field4775 = 0;
   @ObfuscatedName("ap")
   int field4778 = 0;
   @ObfuscatedName("ak")
   int field4782 = 0;
   @ObfuscatedName("aw")
   int field4783 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("cf")
   static final int field4784 = 87;
   @ObfuscatedName("aq")
   static GarbageCollectorMXBean garbageCollector;

   @ObfuscatedSignature(descriptor = "(Lpb;B)V")
   @ObfuscatedName("gc")
   public static void method8700(Timer var0, byte var1) {
      if (var0 == null) {
         var0.method8703(var1);
      } else {
         try {
            if (-1L != var0.field4776 * 6950906862030424291L) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               var0.field4777 = (ParamComposition.method4949((byte)15) - var0.field4776 * 6950906862030424291L) * -7722097624216520623L;
               var0.field4776 = -1927340229650513099L;
            }

            var0.field4782 += -1790393811;
            var0.field4781 = true;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "pb.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public void method8708(int var1) {
      try {
         method8700(this, (byte)62);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pb.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpb;Lxa;B)V")
   @ObfuscatedName("xm")
   public static void method8709(Timer var0, Buffer var1, byte var2) {
      if (var0 == null) {
         var0.write(var1, var2);
      }

      try {
         WorldMapDecoration.method7196(var1, var0.field4780 * -1812830717920301363L);
         WorldMapDecoration.method7196(var1, var0.field4777 * 8255456635969114289L);
         WorldMapDecoration.method7196(var1, -6038534748471789L * var0.field4779);
         var1.writeShort(-721637661 * var0.field4775, -2032227835);
         var1.writeShort(var0.field4778 * 2028974083, -1738993728);
         var1.writeShort(var0.field4782 * 2023939493, -1581286747);
         var1.writeShort(284638697 * var0.field4783, -1820713894);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "pb.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method8693() {
      this.field4774 = ParamComposition.method4949((byte)15) * -3640193842833584623L;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method8701() {
      if (-1L != this.field4776 * 6950906862030424291L) {
         this.field4777 = (ParamComposition.method4949((byte)15) - this.field4776 * 6950906862030424291L) * -7722097624216520623L;
         this.field4776 = -1927340229650513099L;
      }

      this.field4782 += -1790393811;
      this.field4781 = true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public void method8696(int var1) {
      try {
         if (-1L != this.field4774 * -1919247549771439375L) {
            if (var1 != -378949484) {
               throw new IllegalStateException();
            }

            this.field4780 = (ParamComposition.method4949((byte)15) - -1919247549771439375L * this.field4774) * -1576333782001521147L;
            this.field4774 = 3640193842833584623L;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pb.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void method8694(int var1) {
      try {
         this.field4774 = ParamComposition.method4949((byte)15) * -3640193842833584623L;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pb.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;J)V")
   @ObfuscatedName("ap")
   static void method8692(Buffer var0, long var1) {
      var1 /= 10L;
      if (var1 < 0L) {
         var1 = 0L;
      } else if (var1 > 65535L) {
         var1 = 65535L;
      }

      var0.writeShort((int)var1, -1891940067);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   public void method8704(byte var1) {
      try {
         this.field4781 = false;
         this.field4778 = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pb.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public void method8697() {
      if (-1L != this.field4774 * -1919247549771439375L) {
         this.field4780 = (ParamComposition.method4949((byte)15) - -1919247549771439375L * this.field4774) * -1576333782001521147L;
         this.field4774 = 3640193842833584623L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method8698() {
      if (-1L != this.field4774 * -1919247549771439375L) {
         this.field4780 = (ParamComposition.method4949((byte)15) - -1919247549771439375L * this.field4774) * -1576333782001521147L;
         this.field4774 = 3640193842833584623L;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("an")
   public void method8699(int var1, int var2) {
      try {
         this.field4776 = ParamComposition.method4949((byte)15) * 1927340229650513099L;
         this.field4775 = var1 * -522713397;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "pb.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method8702() {
      if (-1L != this.field4776 * 6950906862030424291L) {
         this.field4777 = (ParamComposition.method4949((byte)15) - this.field4776 * 6950906862030424291L) * -7722097624216520623L;
         this.field4776 = -1927340229650513099L;
      }

      this.field4782 += -1790393811;
      this.field4781 = true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method8705() {
      this.field4781 = false;
      this.field4778 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method8706() {
      this.field4781 = false;
      this.field4778 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public void method8707() {
      this.field4781 = false;
      this.field4778 = 0;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   public void method8703(byte var1) {
      try {
         if (-1L != this.field4777 * 6950906862030424291L) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field4774 = (ParamComposition.method4949((byte)15) - this.field4780 * 6950906862030424291L) * -7722097624216520623L;
            this.field4779 = -1927340229650513099L;
         }

         this.field4783 += -1790393811;
         this.field4781 = true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pb.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpb;)V")
   @ObfuscatedName("sl")
   public static void method8695(Timer var0) {
      if (var0 == null) {
         var0.method8701();
      }

      var0.field4774 = ParamComposition.method4949((byte)15) * -3640193842833584623L;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("aw")
   public void write(Buffer var1, byte var2) {
      try {
         WorldMapDecoration.method7196(var1, this.field4777 * -1812830717920301363L);
         WorldMapDecoration.method7196(var1, this.field4780 * 8255456635969114289L);
         WorldMapDecoration.method7196(var1, -6038534748471789L * this.field4780);
         var1.writeIntIME(-721637661 * this.field4778, -2032227835);
         var1.writeLengthInt(this.field4775 * 2028974083, -1738993728);
         var1.writeLengthInt(this.field4783 * 2023939493, -1581286747);
         var1.writeInt(284638697 * this.field4775, -1820713894);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "pb.aw(" + ')');
      }
   }
}
