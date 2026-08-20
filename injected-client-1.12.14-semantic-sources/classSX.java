import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sx")
public class classSX extends SongTask {
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   AbstractArchive field5874;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aw")
   AbstractArchive field5873;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("at")
   AbstractArchive field5872;
   @ObfuscatedName("ut")
   static int field5875;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;Lha;)V")
   @ObfuscatedName("yh")
   public static void method10521(NPC var0, NpcOverrides var1) {
      if (var0 == null) {
         var0.method3554();
      }

      var0.chatheadOverrides = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      int var1 = 0;

      for (MidiRequest var3 : class345.midiRequests) {
         if (null != var3 && var3.midiPcmStream.field4208 * 586188051 > 1 && var3.midiPcmStream.method7656(-1417710458)) {
            SongTask.method10541(this, "Attempted to load patches of already loading midiplayer!", (byte)-19);
            return true;
         }

         if (null != var3 && !var3.field4278) {
            try {
               if (null != var3.musicTrackArchive && -1 != -1778393937 * var3.musicTrackGroupId && -2034265169 * var3.musicTrackFileId != -1) {
                  if (var3.field4276 == null) {
                     var3.field4276 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId * -1778393937, var3.musicTrackFileId * 826925948);
                     if (var3.field4276 == null) {
                        continue;
                     }
                  }

                  if (null == var3.field4274) {
                     var3.field4274 = new SoundCache(this.field5872, this.field5874);
                  }

                  if (var3.midiPcmStream.updateExternalPlayer(var3.field4276, this.field5873, var3.field4274, (byte)15)) {
                     var1++;
                     var3.field4278 = true;
                     var3.midiPcmStream.method7629((byte)73);
                  }
               } else {
                  var1++;
               }
            } catch (Exception var5) {
               PlayerType.RunException_sendStackTrace(null, var5, -223380088);
               SongTask.method10541(this, var5.getMessage(), (byte)-9);
               return true;
            }
         } else {
            var1++;
         }
      }

      return var1 == class345.midiRequests.size();
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         int var2 = 0;
         Iterator var3 = class345.midiRequests.iterator();

         while (var3.hasNext()) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            MidiRequest var4 = (MidiRequest)var3.next();
            if (null != var4) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (var4.midiPcmStream.field4208 * 268210409 > 1 && var4.midiPcmStream.method7656(-340915720)) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  SongTask.method10541(this, "Attempted to load patches of already loading midiplayer!", (byte)-9);
                  return true;
               }
            }

            if (null != var4) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (!var4.field4278) {
                  try {
                     if (null != var4.musicTrackArchive) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (-1 != -1778393937 * var4.musicTrackGroupId) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (-1740472291 * var4.musicTrackFileId != -1) {
                              if (var4.field4276 == null) {
                                 if (var1 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var4.field4276 = MusicTrack.readTrack(
                                    var4.musicTrackArchive, var4.musicTrackGroupId * -1778393937, var4.musicTrackFileId * -1740472291
                                 );
                                 if (var4.field4276 == null) {
                                    if (var1 <= 1) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }

                              if (null == var4.field4274) {
                                 var4.field4274 = new SoundCache(this.field5872, this.field5874);
                              }

                              if (var4.midiPcmStream.updateExternalPlayer(var4.field4276, this.field5873, var4.field4274, (byte)15)) {
                                 if (var1 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var2++;
                                 var4.field4278 = true;
                                 var4.midiPcmStream.method7629((byte)92);
                              }
                              continue;
                           }

                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }
                        }
                     }

                     var2++;
                     continue;
                  } catch (Exception var6) {
                     PlayerType.RunException_sendStackTrace(null, var6, -1921313505);
                     SongTask.method10541(this, var6.getMessage(), (byte)-77);
                     return true;
                  }
               }

               if (var1 <= 1) {
                  throw new IllegalStateException();
               }
            }

            var2++;
         }

         if (var2 != class345.midiRequests.size()) {
            return false;
         } else if (var1 <= 1) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "sx.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lej;IIF)F")
   @ObfuscatedName("av")
   public static float method10520(AudioFilter var0, int var1, int var2, float var3) {
      float var4 = var0.field1601[var1][0][var2] + var3 * (var0.field1601[var1][1][var2] - var0.field1601[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      int var1 = 0;

      for (MidiRequest var3 : class345.midiRequests) {
         if (null != var3 && var3.midiPcmStream.field4208 * 268210409 > 1 && var3.midiPcmStream.method7656(-2057936437)) {
            SongTask.method10541(this, "Attempted to load patches of already loading midiplayer!", (byte)-2);
            return true;
         }

         if (null != var3 && !var3.field4278) {
            try {
               if (null != var3.musicTrackArchive && -1 != -1778393937 * var3.musicTrackGroupId && -1740472291 * var3.musicTrackFileId != -1) {
                  if (var3.field4276 == null) {
                     var3.field4276 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId * -1778393937, var3.musicTrackFileId * -1740472291);
                     if (var3.field4276 == null) {
                        continue;
                     }
                  }

                  if (null == var3.field4274) {
                     var3.field4274 = new SoundCache(this.field5872, this.field5874);
                  }

                  if (var3.midiPcmStream.updateExternalPlayer(var3.field4276, this.field5873, var3.field4274, (byte)15)) {
                     var1++;
                     var3.field4278 = true;
                     var3.midiPcmStream.method7629((byte)5);
                  }
               } else {
                  var1++;
               }
            } catch (Exception var5) {
               PlayerType.RunException_sendStackTrace(null, var5, 2126665742);
               SongTask.method10541(this, var5.getMessage(), (byte)-36);
               return true;
            }
         } else {
            var1++;
         }
      }

      return var1 == class345.midiRequests.size();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljq;I)V")
   @ObfuscatedName("ji")
   public static void method10522(Model var0, class251 var1, int var2) {
      if (var0 == null) {
         var0.getXYZMag();
      }

      var0.method6874(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("am")
   static void method10523(byte var0) {
      try {
         if (Login.loginIndex * -1614560929 == 34) {
            if (var0 == 15) {
               throw new IllegalStateException();
            }

            SpotAnimationDefinition.Login_promptCredentials(false, (short)-29582);
         }

         Login.worldSelectOpen = false;
         Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
         class560.leftTitleSprite.method12647(Login.xPadding * 921778921, 0);
         WorldMapData_1.rightTitleSprite.method12647(Login.xPadding * 921778921 + 382, 0);
         class50.logoSprite.drawAt(382 + Login.xPadding * 921778921 - class50.logoSprite.subWidth / 2, 18);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "sx.am(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvl;)D")
   @ObfuscatedName("fq")
   public static double method10519(class560 var0) {
      return var0.field6185;
   }

   public classSX(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
      super(var1);
      this.field5873 = var2;
      this.field5874 = var3;
      this.field5872 = var4;
      this.field5881 = "LoadSongTask";
   }
}
