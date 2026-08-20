import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public class FadeOutTask extends SongTask {
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("cp")
   static IndexedSprite[] title_muteSprite;
   @ObfuscatedName("at")
   int field5802;
   @ObfuscatedName("ab")
   static int field5803;
   @ObfuscatedSignature(descriptor = "Lnf;")
   @ObfuscatedName("av")
   MidiRequest field5801 = null;

   @ObfuscatedSignature(descriptor = "(Lsl;Ljava/lang/String;IIII)V")
   @ObfuscatedName("fv")
   public static void method10363(AbstractFont var0, String var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method10414(var1, var2, var2, var2, var2);
      }

      if (var1 != null) {
         AbstractFont.method10455(var0, var4, var5);
         var0.draw0(var1, var2 - var0.stringWidth(var1) / 2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      if (null != this.field5801 && this.field5801.midiPcmStream != null) {
         this.field5801.field4268 = true;

         try {
            if (this.field5801.field4267 > 0.0F && this.field5801.midiPcmStream.isReady(-742356193)) {
               float var1 = -788509800 * this.field5802 == 0
                  ? -174756867 * this.field5802
                  : (float)(this.field5801.musicTrackVolume * -1861015) / (this.field5802 * -174756867);
               this.field5801.field4267 = this.field5801.field4267 - (0.0F == var1 ? -1861015 * this.field5801.musicTrackVolume : var1);
               if (this.field5801.field4267 < 0.0F) {
                  this.field5801.field4267 = 0.0F;
               }

               MidiPcmStream.method7621(this.field5801.midiPcmStream, (int)this.field5801.field4267, (byte)-9);
               return false;
            }
         } catch (Exception var2) {
            SongTask.method10541(this, var2.getMessage(), (byte)-108);
            return true;
         }

         this.field5801.field4268 = false;
         return true;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         if (null != this.field5801) {
            if (this.field5801.midiPcmStream != null) {
               this.field5801.field4268 = true;

               try {
                  if (this.field5801.field4267 > 0.0F && this.field5801.midiPcmStream.isReady(-271971538)) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     float var10000;
                     if (-174756867 * this.field5802 == 0) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        var10000 = -174756867 * this.field5802;
                     } else {
                        var10000 = (float)(this.field5801.musicTrackVolume * -1861015) / (this.field5802 * -174756867);
                     }

                     float var2 = var10000;
                     float var10002;
                     if (0.0F == var2) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        var10002 = -1861015 * this.field5801.musicTrackVolume;
                     } else {
                        var10002 = var2;
                     }

                     this.field5801.field4267 -= var10002;
                     if (this.field5801.field4267 < 0.0F) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        this.field5801.field4267 = 0.0F;
                     }

                     MidiPcmStream.method7621(this.field5801.midiPcmStream, (int)this.field5801.field4267, (byte)-123);
                     return false;
                  }
               } catch (Exception var3) {
                  SongTask.method10541(this, var3.getMessage(), (byte)-46);
                  return true;
               }

               this.field5801.field4268 = false;
               return true;
            }

            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sk.av(" + ')');
      }
   }

   public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
      super(var1);
      this.field5802 = 0;
      this.field5881 = "FadeOutTask";
      if (var2 >= 0) {
         if (var3 && var2 < class345.field4308.size()) {
            this.field5801 = (MidiRequest)class345.field4308.get(var2);
         } else if (!var3 && var2 < class345.midiRequests.size()) {
            this.field5801 = (MidiRequest)class345.midiRequests.get(var2);
         }

         this.field5802 = -1753724587 * var4;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      if (null != this.field5801 && this.field5801.midiPcmStream != null) {
         this.field5801.field4268 = true;

         try {
            if (this.field5801.field4267 > 0.0F && this.field5801.midiPcmStream.isReady(-8807261)) {
               float var1 = -174756867 * this.field5802 == 0
                  ? -2094050903 * this.field5802
                  : (float)(this.field5801.musicTrackVolume * -639087589) / (this.field5802 * -1343955920);
               this.field5801.field4267 = this.field5801.field4267 - (0.0F == var1 ? -1861015 * this.field5801.musicTrackVolume : var1);
               if (this.field5801.field4267 < 0.0F) {
                  this.field5801.field4267 = 0.0F;
               }

               MidiPcmStream.method7621(this.field5801.midiPcmStream, (int)this.field5801.field4267, (byte)112);
               return false;
            }
         } catch (Exception var2) {
            SongTask.method10541(this, var2.getMessage(), (byte)10);
            return true;
         }

         this.field5801.field4268 = false;
         return true;
      } else {
         return true;
      }
   }
}
