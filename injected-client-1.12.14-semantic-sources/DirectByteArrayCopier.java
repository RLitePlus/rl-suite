import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import sun.misc.Unsafe;

@ObfuscatedName("nt")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
   @ObfuscatedName("av")
   ByteBuffer directBuffer;
   @ObfuscatedName("fc")
   public static final Unsafe field4336 = method7844();
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field4337 = 7;
   @ObfuscatedName("ki")
   public int field4340;
   @ToRemove(unused = "true")
   @ObfuscatedName("co")
   public static final int field4339 = 84;
   @ObfuscatedName("nj")
   public long field4341;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("cb")
   static IndexedSprite[] runesSprite;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field4338 = 4;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hq")
   public void method7843() {
      if (field4336 != null) {
         field4336.freeMemory(this.field4341);
         this.field4341 = 0L;
         this.field4340 = 0;
      }
   }

   DirectByteArrayCopier() {
   }

   @ObfuscatedSignature(descriptor = "()Lsun/misc/Unsafe;")
   @ObfuscatedName("ht")
   public static Unsafe method7844() {
      try {
         Field var0 = Unsafe.class.getDeclaredField("theUnsafe");
         if (!var0.getType().equals(Unsafe.class)) {
            return null;
         } else {
            int var1 = var0.getModifiers();
            if (Modifier.isStatic(var1) && Modifier.isFinal(var1)) {
               var0.setAccessible(true);
               return (Unsafe)var0.get(null);
            } else {
               return null;
            }
         }
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("ag")
   @Override
   byte[] get(int var1) {
      if (field4336 != null) {
         byte[] var3 = new byte[this.field4340];
         field4336.copyMemory(null, this.field4341, var3, Unsafe.ARRAY_BYTE_BASE_OFFSET, this.field4340);
         return var3;
      } else {
         byte[] var2 = new byte[this.directBuffer.capacity()];
         this.directBuffer.position(0);
         this.directBuffer.get(var2);
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "([BB)V")
   @ObfuscatedName("an")
   @Override
   void set(byte[] var1, byte var2) {
      if (field4336 != null) {
         assert this.field4341 == 0L;

         long var3 = field4336.allocateMemory(var1.length);
         field4336.copyMemory(var1, Unsafe.ARRAY_BYTE_BASE_OFFSET, null, var3, var1.length);
         this.field4341 = var3;
         this.field4340 = var1.length;
      } else {
         this.directBuffer = ByteBuffer.allocateDirect(var1.length);
         this.directBuffer.position(0);
         this.directBuffer.put(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("au")
   @Override
   void vmethod315(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      ((java.nio.Buffer)this.directBuffer).position(0);
      this.directBuffer.put(var1);
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aw")
   @Override
   byte[] vmethod312() {
      byte[] var1 = new byte[this.directBuffer.capacity()];
      ((java.nio.Buffer)this.directBuffer).position(0);
      this.directBuffer.get(var1);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ay")
   @Override
   void vmethod314(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      ((java.nio.Buffer)this.directBuffer).position(0);
      this.directBuffer.put(var1);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ap")
   @Override
   void vmethod310(byte[] var1) {
      this.directBuffer = ByteBuffer.allocateDirect(var1.length);
      ((java.nio.Buffer)this.directBuffer).position(0);
      this.directBuffer.put(var1);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("as")
   public void method7845(byte[] var1) {
      this.set(var1, (byte)2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;IILlq;Lmr;Llu;)V")
   @ObfuscatedName("lw")
   public static void method7842(WorldMapRegion var0, int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
      if (var0 == null) {
         var0.method6996(var1, var1, var1);
      } else {
         int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
         int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
         if (var6 == -1 && -1 == var7) {
            Rasterizer2D.Rasterizer2D_fillRectangle(
               var1 * -631149707 * var0.regionX,
               (63 - var2) * var0.regionX * -631149707,
               var0.regionX * -631149707,
               var0.regionX * -631149707,
               var0.regionY * 1935506723
            );
         }

         int var8 = 16711935;
         if (-1 != var7) {
            var8 = VerticalAlignment.method4594(var7, 1935506723 * var0.regionY, (byte)77);
         }

         if (var7 > -1 && var3.field3755[0][var1][var2] == 0) {
            Rasterizer2D.Rasterizer2D_fillRectangle(
               var1 * var0.regionX * -631149707, var0.regionX * -631149707 * (63 - var2), -631149707 * var0.regionX, var0.regionX * -631149707, var8
            );
         } else {
            int var9 = WorldMapRegion.method7054(var0, var1, var2, var3, var5, (byte)20);
            if (-1 == var7) {
               Rasterizer2D.Rasterizer2D_fillRectangle(
                  -631149707 * var0.regionX * var1, -631149707 * var0.regionX * (63 - var2), -631149707 * var0.regionX, var0.regionX * -631149707, var9
               );
            } else {
               var4.method7462(
                  var1 * -631149707 * var0.regionX,
                  -631149707 * var0.regionX * (63 - var2),
                  var9,
                  var8,
                  var0.regionX * -631149707,
                  -631149707 * var0.regionX,
                  var3.field3755[0][var1][var2],
                  var3.field3754[0][var1][var2],
                  2045138913
               );
            }
         }
      }
   }

   static {
      if (field4336 == null) {
         client.field938.info("unable to find Unsafe, using direct buffer");
      }
   }
}
