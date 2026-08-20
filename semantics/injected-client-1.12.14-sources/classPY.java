import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("py")
public class classPY {
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field5264 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field5266 = 338;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field5263 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5265 = -2;
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   static final int field5268 = 55;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5267 = -3;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public static int method8819(int var0) {
      return -512 + var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   public static int method8817(int var0, int var1) {
      return var1 + (-3 - var0 << 8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   public static int method8818(int var0, int var1) {
      return var1 + (-245733999 - var0 << 8);
   }

   classPY() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public static int method8820(int var0) {
      return -512 + var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("pf")
   public static void method8822(Buffer var0, int var1) {
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;)I")
   @ObfuscatedName("qi")
   public static int method8821(CollisionMap var0) {
      return -67399471 * var0.ySize;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("pq")
   static void method8823(int var0, int var1) {
      try {
         SequenceDefinition var2 = ClientPacket.SequenceDefinition_get(var0, -158393850);
         if (!var2.isCachedModelIdSet((byte)-56)) {
            if (var1 < 1276955637) {
               ;
            }
         } else {
            if (HitSplatDefinition.method4993(-326405849 * var2.SequenceDefinition_cachedModelId, 1402352388) == 2) {
               if (var1 >= 1276955637) {
                  throw new IllegalStateException();
               }

               client.field752.add(-326405849 * var2.SequenceDefinition_cachedModelId);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "py.pq(" + ')');
      }
   }
}
