import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nf")
public class MidiRequest implements net.runelite.api.MidiRequest {
   @ObfuscatedName("lb")
   public boolean field4280;
   @ObfuscatedName("an")
   public int musicTrackVolume;
   @ObfuscatedName("at")
   public int musicTrackGroupId = 1577518513;
   @ObfuscatedName("ak")
   public boolean field4278;
   @ObfuscatedName("ag")
   public int musicTrackFileId = -197411381;
   @ObfuscatedName("ae")
   public float field4267;
   @ObfuscatedName("aj")
   public boolean musicTrackBoolean;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   public AbstractArchive musicTrackArchive;
   @ObfuscatedName("aw")
   public boolean field4279;
   @ObfuscatedName("ap")
   public boolean field4268;
   @ObfuscatedName("ay")
   boolean field4269;
   @ObfuscatedSignature(descriptor = "Lnc;")
   @ObfuscatedName("au")
   public MidiPcmStream midiPcmStream;
   @ObfuscatedSignature(descriptor = "Lds;")
   @ObfuscatedName("az")
   public SoundCache field4274;
   @ObfuscatedSignature(descriptor = "Lnq;")
   @ObfuscatedName("ad")
   public MusicTrack field4276;
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   public static final int field4272 = 73;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field4273 = 11;

   @ObfuscatedSignature(descriptor = "(Lqm;IIIZ)V")
   @ObfuscatedName("ag")
   void method7741(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      this.musicTrackArchive = var1;
      this.musicTrackGroupId = var2 * -1577518513;
      this.musicTrackFileId = 197411381 * var3;
      this.musicTrackVolume = var4 * -1589930535;
      this.musicTrackBoolean = var5;
   }

   public MidiRequest(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      this.musicTrackVolume = 0;
      this.field4267 = 0.0F;
      this.musicTrackBoolean = false;
      this.field4268 = false;
      this.field4269 = false;
      this.playMusicTrack(var1, var2, var3, var4, var5, -120751599);
   }

   public int getArchiveId() {
      return this.musicTrackGroupId * -1778393937;
   }

   public boolean isJingle() {
      return this.field4280;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IIIZI)V")
   @ObfuscatedName("av")
   void playMusicTrack(AbstractArchive var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method7746(var1, var2, var3, var4, var5);

      try {
         this.musicTrackArchive = var1;
         this.musicTrackGroupId = var2 * -1577518513;
         this.musicTrackFileId = 197411381 * var3;
         this.musicTrackVolume = var4 * -1589930535;
         this.musicTrackBoolean = var5;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "nf.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IIIZ)V")
   @ObfuscatedName("at")
   void method7743(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      this.musicTrackArchive = var1;
      this.musicTrackGroupId = var2 * -1577518513;
      this.musicTrackFileId = 197411381 * var3;
      this.musicTrackVolume = var4 * -1589930535;
      this.musicTrackBoolean = var5;
   }

   public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
      this.musicTrackVolume = 0;
      this.field4267 = 0.0F;
      this.musicTrackBoolean = false;
      this.field4268 = false;
      this.field4269 = false;
      this.musicTrackGroupId = var1.groupLoadPercentByName(var2, (byte)-42) * -1577518513;
      this.musicTrackFileId = AbstractArchive.method9022(var1, -1778393937 * this.musicTrackGroupId, var3, -272017019) * 197411381;
      this.playMusicTrack(var1, -1778393937 * this.musicTrackGroupId, this.musicTrackFileId * -1740472291, var4, var5, -1177724997);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IIIZ)V")
   @ObfuscatedName("an")
   void method7744(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      this.musicTrackArchive = var1;
      this.musicTrackGroupId = var2 * -1577518513;
      this.musicTrackFileId = 197411381 * var3;
      this.musicTrackVolume = var4 * -1589930535;
      this.musicTrackBoolean = var5;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IIIZ)V")
   @ObfuscatedName("td")
   public void method7746(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      Archive var6 = (Archive)var1;
      this.field4280 = var6.method9111() == 11;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IIIZ)V")
   @ObfuscatedName("ae")
   void method7745(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      this.musicTrackArchive = var1;
      this.musicTrackGroupId = var2 * -1577518513;
      this.musicTrackFileId = 877157599 * var3;
      this.musicTrackVolume = var4 * -1589930535;
      this.musicTrackBoolean = var5;
   }
}
