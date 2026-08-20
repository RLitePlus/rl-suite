import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("he")
public class class182 extends DualNode {
   @ObfuscatedName("at")
   static long field2178;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   static EvictingDualNodeHashTable field1851 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field2177 = 8;

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("an")
   public static void method4489(int var0, int var1, int var2, int var3, int var4) {
      try {
         if (class345.midiRequests.size() > 1 && class345.midiRequests.get(0) != null) {
            if (var4 != 261830680) {
               throw new IllegalStateException();
            }

            if (((MidiRequest)class345.midiRequests.get(0)).midiPcmStream.isReady(-502329468)) {
               if (var4 != 261830680) {
                  return;
               }

               if (class345.midiRequests.get(1) != null) {
                  if (var4 != 261830680) {
                     throw new IllegalStateException();
                  }

                  if (((MidiRequest)class345.midiRequests.get(1)).midiPcmStream.isReady(-372411724)) {
                     if (var4 != 261830680) {
                        throw new IllegalStateException();
                     }

                     ItemLayer.method5389(var0, var1, var2, var3, -1625118638);
                     class345.field4310.add(new SwapSongTask(null));
                     ArrayList var5 = new ArrayList();
                     var5.add(new DelayFadeTask(new FadeInTask(null, 1, false, class345.field4306 * -673721945), class345.field4307 * 1197280793));
                     var5.add(new DelayFadeTask(new FadeOutTask(null, 0, false, class345.field4312 * 595186573), 847508035 * class345.musicPlayerStatus));
                     class345.field4310.add(new ConcurrentMidiTask(null, var5));
                     if (class345.field4309.get(0) != null) {
                        if (var4 != 261830680) {
                           throw new IllegalStateException();
                        }

                        if (class345.field4309.get(1) != null) {
                           if (var4 != 261830680) {
                              return;
                           }

                           MidiRequest var6 = (MidiRequest)class345.field4309.get(0);
                           class345.field4309.set(0, class345.midiRequests.get(1));
                           class345.field4309.set(1, var6);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "he.an(" + ')');
      }
   }

   class182() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ik")
   static int getWindowedMode(int var0) {
      try {
         byte var10000;
         if (client.isResizable) {
            if (var0 == -340792861) {
               throw new IllegalStateException();
            }

            var10000 = 2;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "he.ik(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public static void method4488() {
      field1851.clear();
   }
}
