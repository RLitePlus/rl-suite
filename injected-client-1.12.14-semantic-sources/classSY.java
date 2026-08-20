import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sy")
public class classSY extends SongTask {
   @ObfuscatedName("av")
   ArrayList field5876;
   @ObfuscatedName("ry")
   static int field5877;

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("al")
   static final boolean method10525(int var0, int var1, byte var2) {
      try {
         ObjectComposition var3 = AsyncHttpResponse.getObjectDefinition(var0, 2025766971);
         if (var1 == 11) {
            var1 = 10;
         }

         if (var1 >= 5) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (var1 <= 8) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               var1 = 4;
            }
         }

         return var3.method5157(var1, (byte)29);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sy.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         if (this.field5876.isEmpty()) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            Iterator var2 = this.field5876.iterator();

            while (var2.hasNext()) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               MidiRequest var3 = (MidiRequest)var2.next();

               try {
                  if (class345.midiRequests.contains(var3)) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var3 == null) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        class345.midiRequests.remove(var3);
                     } else {
                        if (268210409 * var3.midiPcmStream.field4208 > 0) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.midiPcmStream.field4208 -= 1683572569;
                        }

                        if (0 == 268210409 * var3.midiPcmStream.field4208) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           var3.midiPcmStream.clear(1806462691);
                           var3.midiPcmStream.method7640((byte)-78);
                           MidiPcmStream.method7621(var3.midiPcmStream, 0, (byte)62);
                        }

                        int var4 = -1778393937 * var3.musicTrackGroupId;
                        int var5 = -1740472291 * var3.musicTrackFileId;

                        for (classNE var7 : class345.field4305) {
                           var7.vmethod129(var4, var5, (byte)8);
                        }

                        class345.midiRequests.remove(var3);
                     }
                  }
               } catch (Exception var8) {
                  PlayerType.RunException_sendStackTrace(null, var8, -1474214750);
                  SongTask.method10541(this, var8.getMessage(), (byte)-13);
                  class345.midiRequests.clear();
                  return true;
               }
            }

            return true;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "sy.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpj;)I")
   @ObfuscatedName("lw")
   public static int method10524(HintArrow var0) {
      return var0.targetType * -81304289;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      if (this.field5876.isEmpty()) {
         return true;
      } else {
         for (MidiRequest var2 : this.field5876) {
            try {
               if (class345.midiRequests.contains(var2)) {
                  if (var2 == null) {
                     class345.midiRequests.remove(var2);
                  } else {
                     if (268210409 * var2.midiPcmStream.field4208 > 0) {
                        var2.midiPcmStream.field4208 -= 342117036;
                     }

                     if (0 == -1979114501 * var2.midiPcmStream.field4208) {
                        var2.midiPcmStream.clear(1806462691);
                        var2.midiPcmStream.method7640((byte)-24);
                        MidiPcmStream.method7621(var2.midiPcmStream, 0, (byte)80);
                     }

                     int var3 = -1778393937 * var2.musicTrackGroupId;
                     int var4 = -459638596 * var2.musicTrackFileId;

                     for (classNE var6 : class345.field4305) {
                        var6.vmethod129(var3, var4, (byte)8);
                     }

                     class345.midiRequests.remove(var2);
                  }
               }
            } catch (Exception var7) {
               PlayerType.RunException_sendStackTrace(null, var7, -551997516);
               SongTask.method10541(this, var7.getMessage(), (byte)-74);
               class345.midiRequests.clear();
               return true;
            }
         }

         return true;
      }
   }

   public classSY(SongTask var1, ArrayList var2) {
      super(var1);
      this.field5881 = "ClearRequestTask";
      this.field5876 = var2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      if (this.field5876.isEmpty()) {
         return true;
      } else {
         for (MidiRequest var2 : this.field5876) {
            try {
               if (class345.midiRequests.contains(var2)) {
                  if (var2 == null) {
                     class345.midiRequests.remove(var2);
                  } else {
                     if (268210409 * var2.midiPcmStream.field4208 > 0) {
                        var2.midiPcmStream.field4208 -= 1683572569;
                     }

                     if (0 == 268210409 * var2.midiPcmStream.field4208) {
                        var2.midiPcmStream.clear(1806462691);
                        var2.midiPcmStream.method7640((byte)-128);
                        MidiPcmStream.method7621(var2.midiPcmStream, 0, (byte)13);
                     }

                     int var3 = -1778393937 * var2.musicTrackGroupId;
                     int var4 = -1740472291 * var2.musicTrackFileId;

                     for (classNE var6 : class345.field4305) {
                        var6.vmethod129(var3, var4, (byte)8);
                     }

                     class345.midiRequests.remove(var2);
                  }
               }
            } catch (Exception var7) {
               PlayerType.RunException_sendStackTrace(null, var7, -2032020975);
               SongTask.method10541(this, var7.getMessage(), (byte)-29);
               class345.midiRequests.clear();
               return true;
            }
         }

         return true;
      }
   }
}
