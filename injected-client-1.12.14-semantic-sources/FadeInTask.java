import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sp")
public class FadeInTask extends SongTask {
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field5855 = 32;
   @ObfuscatedSignature(descriptor = "Lnf;")
   @ObfuscatedName("av")
   MidiRequest field5853 = null;
   @ObfuscatedName("at")
   int field5854 = 0;
   @ObfuscatedSignature(descriptor = "Ltd;")
   @ObfuscatedName("oi")
   static AbstractSocket field5856;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("om")
   static final void method10494(int var0) {
      try {
         Iterator var1 = client.worldViewManager.iterator();

         while (var1.hasNext()) {
            if (var0 == 449906397) {
               return;
            }

            WorldView var2 = (WorldView)var1.next();

            for (int var3 = 0; var3 < 1320060371 * client.playerUpdateManager.field1538; var3++) {
               if (var0 == 449906397) {
                  return;
               }

               Player var4 = (Player)var2.npcs.get(client.playerUpdateManager.playerIndices[var3]);
               if (var4 != null) {
                  if (var0 == 449906397) {
                     throw new IllegalStateException();
                  }

                  var4.clearIsFriend((short)-10480);
               }
            }
         }

         var1 = Messages.Messages_hashTable.iterator();

         while (var1.hasNext()) {
            if (var0 == 449906397) {
               return;
            }

            Message var7 = (Message)var1.next();
            var7.clearIsFromFriend((byte)24);
         }

         if (BuddyRankComparator.friendsChat != null) {
            if (var0 == 449906397) {
               return;
            }

            BuddyRankComparator.friendsChat.clearFriends((byte)59);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "sp.om(" + ')');
      }
   }

   public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
      super(var1);
      this.field5881 = "FadeInTask";
      if (var2 >= 0) {
         if (var3 && var2 < class345.field4308.size()) {
            this.field5853 = (MidiRequest)class345.field4308.get(var2);
         } else if (!var3 && var2 < class345.midiRequests.size()) {
            this.field5853 = (MidiRequest)class345.midiRequests.get(var2);
         }

         this.field5854 = -1507952609 * var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         if (this.field5853 != null) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            if (null != this.field5853.midiPcmStream) {
               this.field5853.field4268 = true;

               try {
                  if (this.field5853.field4267 < -1861015 * this.field5853.musicTrackVolume) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (this.field5853.midiPcmStream.isReady(-1237473223)) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        float var10000;
                        if (0 == 1112736735 * this.field5854) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10000 = this.field5854 * 1112736735;
                        } else {
                           var10000 = (float)(-1861015 * this.field5853.musicTrackVolume) / (this.field5854 * 1112736735);
                        }

                        float var2 = var10000;
                        float var10002;
                        if (var2 == 0.0F) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10002 = this.field5853.musicTrackVolume * -1861015;
                        } else {
                           var10002 = var2;
                        }

                        this.field5853.field4267 += var10002;
                        if (this.field5853.field4267 > this.field5853.musicTrackVolume * -1861015) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           this.field5853.field4267 = this.field5853.musicTrackVolume * -1861015;
                        }

                        MidiPcmStream.method7621(this.field5853.midiPcmStream, (int)this.field5853.field4267, (byte)-77);
                        return false;
                     }
                  }
               } catch (Exception var3) {
                  SongTask.method10541(this, var3.getMessage(), (byte)-98);
                  return true;
               }

               this.field5853.field4268 = false;
               return true;
            }

            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sp.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      if (this.field5853 != null && null != this.field5853.midiPcmStream) {
         this.field5853.field4268 = true;

         try {
            if (this.field5853.field4267 < -1861015 * this.field5853.musicTrackVolume && this.field5853.midiPcmStream.isReady(1414967088)) {
               float var1 = 0 == 1550514425 * this.field5854
                  ? this.field5854 * -115822556
                  : (float)(-1861015 * this.field5853.musicTrackVolume) / (this.field5854 * 1236169215);
               this.field5853.field4267 = this.field5853.field4267 + (var1 == 0.0F ? this.field5853.musicTrackVolume * -858070770 : var1);
               if (this.field5853.field4267 > this.field5853.musicTrackVolume * -1861015) {
                  this.field5853.field4267 = this.field5853.musicTrackVolume * 1252085593;
               }

               MidiPcmStream.method7621(this.field5853.midiPcmStream, (int)this.field5853.field4267, (byte)-85);
               return false;
            }
         } catch (Exception var2) {
            SongTask.method10541(this, var2.getMessage(), (byte)-8);
            return true;
         }

         this.field5853.field4268 = false;
         return true;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      if (this.field5853 != null && null != this.field5853.midiPcmStream) {
         this.field5853.field4268 = true;

         try {
            if (this.field5853.field4267 < -690594209 * this.field5853.musicTrackVolume && this.field5853.midiPcmStream.isReady(-1899671084)) {
               float var1 = 0 == 1112736735 * this.field5854
                  ? this.field5854 * 536644295
                  : (float)(1216509714 * this.field5853.musicTrackVolume) / (this.field5854 * 1112736735);
               this.field5853.field4267 = this.field5853.field4267 + (var1 == 0.0F ? this.field5853.musicTrackVolume * 380820712 : var1);
               if (this.field5853.field4267 > this.field5853.musicTrackVolume * -1724394437) {
                  this.field5853.field4267 = this.field5853.musicTrackVolume * 286232586;
               }

               MidiPcmStream.method7621(this.field5853.midiPcmStream, (int)this.field5853.field4267, (byte)77);
               return false;
            }
         } catch (Exception var2) {
            SongTask.method10541(this, var2.getMessage(), (byte)-26);
            return true;
         }

         this.field5853.field4268 = false;
         return true;
      } else {
         return true;
      }
   }
}
