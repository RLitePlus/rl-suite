import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sa")
public class classSA extends SongTask {
   @ObfuscatedName("pm")
   static int field5752;

   public classSA(SongTask var1) {
      super(var1);
      this.field5881 = "StartSongTask";
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         Iterator var2 = class345.midiRequests.iterator();

         while (var2.hasNext()) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            MidiRequest var3 = (MidiRequest)var2.next();
            if (null != var3 && !var3.field4279) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (var3.midiPcmStream == null) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  try {
                     var3.midiPcmStream.method7632((byte)124);
                     MidiPcmStream.method7621(var3.midiPcmStream, 0, (byte)26);
                     if (var3.field4276 != null) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        var3.midiPcmStream.setMusicTrack(var3.field4276, var3.musicTrackBoolean, (byte)71);
                     }

                     var3.field4276 = null;
                     var3.field4274 = null;
                     var3.musicTrackArchive = null;
                     var3.field4279 = true;
                  } catch (Exception var5) {
                     PlayerType.RunException_sendStackTrace(null, var5, -1538342257);
                     SongTask.method10541(this, var5.getMessage(), (byte)-23);
                     return true;
                  }
               }
            }
         }

         this.field5882 = true;
         return true;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "sa.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      for (MidiRequest var2 : class345.midiRequests) {
         if (null != var2 && !var2.field4279 && var2.midiPcmStream != null) {
            try {
               var2.midiPcmStream.method7632((byte)114);
               MidiPcmStream.method7621(var2.midiPcmStream, 0, (byte)33);
               if (var2.field4276 != null) {
                  var2.midiPcmStream.setMusicTrack(var2.field4276, var2.musicTrackBoolean, (byte)107);
               }

               var2.field4276 = null;
               var2.field4274 = null;
               var2.musicTrackArchive = null;
               var2.field4279 = true;
            } catch (Exception var4) {
               PlayerType.RunException_sendStackTrace(null, var4, -771305533);
               SongTask.method10541(this, var4.getMessage(), (byte)-96);
               return true;
            }
         }
      }

      this.field5882 = true;
      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lay;)Z")
   @ObfuscatedName("dq")
   public static boolean method10039(HttpMethod var0) {
      if (var0 == null) {
         var0.method363();
      }

      return var0.field100;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      for (MidiRequest var2 : class345.midiRequests) {
         if (null != var2 && !var2.field4279 && var2.midiPcmStream != null) {
            try {
               var2.midiPcmStream.method7632((byte)55);
               MidiPcmStream.method7621(var2.midiPcmStream, 0, (byte)107);
               if (var2.field4276 != null) {
                  var2.midiPcmStream.setMusicTrack(var2.field4276, var2.musicTrackBoolean, (byte)32);
               }

               var2.field4276 = null;
               var2.field4274 = null;
               var2.musicTrackArchive = null;
               var2.field4279 = true;
            } catch (Exception var4) {
               PlayerType.RunException_sendStackTrace(null, var4, 2104907138);
               SongTask.method10541(this, var4.getMessage(), (byte)-28);
               return true;
            }
         }
      }

      this.field5882 = true;
      return true;
   }
}
