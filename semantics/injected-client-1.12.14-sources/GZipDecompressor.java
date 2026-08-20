import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xc")
public class GZipDecompressor {
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field6479 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6480 = 3;
   @ObfuscatedName("av")
   Inflater inflater;

   @ObfuscatedSignature(descriptor = "(Lxc;Lxa;[BI)V")
   @ObfuscatedName("rn")
   public static void method12237(GZipDecompressor var0, Buffer var1, byte[] var2, int var3) {
      if (var0 == null) {
         var0.decompress(var1, var2, var3);
      }

      try {
         if (var1.array[2108391709 * var1.offset] == 31) {
            if (-117 == var1.array[1 + 2108391709 * var1.offset]) {
               if (var0.inflater == null) {
                  var0.inflater = new Inflater(true);
               }

               try {
                  var0.inflater.setInput(var1.array, 2108391709 * var1.offset + 10, var1.array.length - (8 + 10 + var1.offset * 2108391709));
                  var0.inflater.inflate(var2);
               } catch (Exception var5) {
                  var0.inflater.reset();
                  throw new RuntimeException("");
               }

               var0.inflater.reset();
               return;
            }

            if (var3 != -535278753) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xc.av(" + ')');
      }
   }

   GZipDecompressor(int var1, int var2, int var3) {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;[B)V")
   @ObfuscatedName("at")
   public void method12241(Buffer var1, byte[] var2) {
      method12237(this, var1, var2, -535278753);
   }

   public GZipDecompressor() {
      this(-1, 1000000, 1000000);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Les;)I")
   @ObfuscatedName("xf")
   public static int method12240(class108 var0) {
      return var0 == null ? var0.method3862() : var0.field1672 * 1992769097;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;[B)V")
   @ObfuscatedName("du")
   public void method12238(Buffer var1, byte[] var2) {
      if (var1.array[2108391709 * var1.offset] == 31 && -117 == var1.array[1 + 2108391709 * var1.offset]) {
         if (this.inflater == null) {
            this.inflater = new Inflater(true);
         }

         try {
            this.inflater.setInput(var1.array, 2108391709 * var1.offset + 10, var1.array.length - (8 + 10 + var1.offset * 2108391709));
            this.inflater.inflate(var2);
         } catch (Exception var4) {
            this.inflater.reset();
            throw new RuntimeException("");
         }

         this.inflater.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;[BI)V")
   @ObfuscatedName("av")
   public void decompress(Buffer var1, byte[] var2, int var3) {
      try {
         if (var1.array[2108391709 * var1.offset] == 31) {
            if (-117 == var1.array[1 + 2108391709 * var1.offset]) {
               if (this.inflater == null) {
                  this.inflater = new Inflater(true);
               }

               try {
                  this.inflater.setInput(var1.array, 2108391709 * var1.offset + 10, var1.array.length - (8 + 10 + var1.offset * 2108391709));
                  this.inflater.inflate(var2);
               } catch (Exception var5) {
                  this.inflater.reset();
                  throw new RuntimeException("");
               }

               this.inflater.reset();
               return;
            }

            if (var3 != -535278753) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xc.av(" + ')');
      }
   }
}
