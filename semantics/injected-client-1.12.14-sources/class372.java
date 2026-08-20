import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("om")
public class class372 {
   @ObfuscatedName("at")
   public int field4641;
   @ObfuscatedSignature(descriptor = "Ldg;")
   @ObfuscatedName("ax")
   static SoundSystem soundSystem;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field4643 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4644 = 16384;
   @ObfuscatedName("av")
   public int field4642;
   @ObfuscatedName("ag")
   public int field4640;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqn;I)Z")
   @ObfuscatedName("cr")
   public static boolean method8356(Archive var0, int var1) {
      if (var0 == null) {
         var0.method9066();
      }

      return AbstractArchive.method8992(var0, var1, -1775968255) != null;
   }

   @ObfuscatedSignature(descriptor = "([BB)V")
   @ObfuscatedName("ag")
   public static void ByteArrayPool_release(byte[] var0, byte var1) {
      try {
         synchronized (ByteArrayPool.field5829) {
            if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount * -2080909031 < -758437091 * ByteArrayPool.field5832) {
               ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount += 1846047529) * -2080909031 - 1] = var0;
            } else {
               if (var0.length == 5000) {
                  if (var1 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (410827371 * ByteArrayPool.ByteArrayPool_mediumCount < 1845078879 * ByteArrayPool.field5833) {
                     if (var1 >= 1) {
                        return;
                     }

                     ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount += 202056259) * 410827371 - 1] = var0;
                     return;
                  }
               }

               if (var0.length == 10000) {
                  if (var1 >= 1) {
                     return;
                  }

                  if (1911186123 * ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field5834 * 1481942851) {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }

                     ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount += -167480605) * 1911186123 - 1] = var0;
                     return;
                  }
               }

               if (var0.length == 30000 && -125656445 * ByteArrayPool.field5841 < ByteArrayPool.field5835 * -1191692589) {
                  ByteArrayPool.field5830[(ByteArrayPool.field5841 += -1431815125) * -125656445 - 1] = var0;
               } else {
                  if (ByteArrayPool.ByteArrayPool_arrays != null) {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }

                     for (int var3 = 0; var3 < class451.ByteArrayPool_alternativeSizes.length; var3++) {
                        if (class451.ByteArrayPool_alternativeSizes[var3] == var0.length) {
                           if (var1 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (class70.ByteArrayPool_altSizeArrayCounts[var3] < ByteArrayPool.ByteArrayPool_arrays[var3].length) {
                              if (var1 >= 1) {
                                 throw new IllegalStateException();
                              }

                              ByteArrayPool.ByteArrayPool_arrays[var3][class70.ByteArrayPool_altSizeArrayCounts[var3]++] = var0;
                              return;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "om.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("ht")
   public static int method8357(Buffer var0) {
      if (var0 == null) {
         var0.method12173();
      }

      var0.offset += 930339743;
      return (var0.array[var0.offset * 2108391709 - 1] & 0xFF)
         + ((var0.array[var0.offset * 2108391709 - 2] & 0xFF) << 16)
         + ((var0.array[var0.offset * 2108391709 - 3] & 0xFF) << 8);
   }

   class372() {
   }
}
