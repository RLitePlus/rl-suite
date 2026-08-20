import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nb")
public class MidiRequest implements net.runelite.api.MidiRequest {
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("az")
   public AbstractArchive field4642;
   @ObfuscatedSignature(descriptor = "Lno;")
   @ObfuscatedName("ay")
   public classNO field4640;
   @ObfuscatedName("ae")
   public int field4630;
   @ObfuscatedName("ak")
   static int field4637;
   @ObfuscatedName("ag")
   public float field4631;
   @ObfuscatedName("af")
   public int field4632 = -1190162147;
   @ObfuscatedName("tp")
   public boolean field4645;
   @ObfuscatedName("ax")
   public boolean field4644;
   @ObfuscatedName("ac")
   public boolean field4643;
   @ObfuscatedName("aa")
   public boolean field4634;
   @ObfuscatedName("ao")
   boolean field4633;
   @ObfuscatedName("ab")
   public int field4635;
   @ObfuscatedSignature(descriptor = "Lat;")
   @ObfuscatedName("aj")
   public classAT field4639;
   @ObfuscatedName("as")
   public boolean field4636;
   @ObfuscatedSignature(descriptor = "Lnu;")
   @ObfuscatedName("al")
   public classNU field4641;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field4638 = 45;

   public MidiRequest(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      this.field4630 = -424024677;
      this.field4635 = 0;
      this.field4631 = 0.0F;
      this.field4636 = false;
      this.field4634 = false;
      this.field4633 = false;
      method7758(this, var1, var2, var3, var4, var5, (short)8320);
   }

   @ObfuscatedSignature(descriptor = "(Lva;IIIZ)V")
   @ObfuscatedName("af")
   void method7756(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      this.field4642 = var1;
      this.field4632 = var2 * 1190162147;
      this.field4630 = -1438544821 * var3;
      this.field4635 = var4 * -1016653583;
      this.field4636 = var5;
   }

   public int getArchiveId() {
      return this.field4632 * 1942111947;
   }

   public boolean isJingle() {
      return this.field4645;
   }

   public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
      this.field4630 = -424024677;
      this.field4635 = 0;
      this.field4631 = 0.0F;
      this.field4636 = false;
      this.field4634 = false;
      this.field4633 = false;
      this.field4632 = var1.method11848(var2, 1028821867) * 1190162147;
      this.field4630 = var1.method11851(this.field4632 * 1942111947, var3, (byte)-74) * 424024677;
      method7758(this, var1, 1942111947 * this.field4632, 450234221 * this.field4630, var4, var5, (short)8320);
   }

   @ObfuscatedSignature(descriptor = "(Lva;IIIZ)V")
   @ObfuscatedName("ab")
   void method7757(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      this.field4642 = var1;
      this.field4632 = var2 * 1190162147;
      this.field4630 = 424024677 * var3;
      this.field4635 = var4 * -1016653583;
      this.field4636 = var5;
   }

   @ObfuscatedSignature(descriptor = "(Lva;IIIZ)V")
   @ObfuscatedName("yj")
   public void method7761(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      classVP var6 = (classVP)var1;
      this.field4645 = var6.method12054() == 11;
   }

   @ObfuscatedSignature(descriptor = "(Lnb;Lva;IIIZS)V")
   @ObfuscatedName("og")
   public static void method7758(MidiRequest var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5, short var6) {
      if (var0 == null) {
         var0.method7760(var1, var2, var2, var2, var5, var6);
      } else {
         var0.method7761(var1, var2, var3, var4, var5);

         try {
            var0.field4642 = var1;
            var0.field4632 = var2 * 1190162147;
            var0.field4630 = 424024677 * var3;
            var0.field4635 = var4 * -1016653583;
            var0.field4636 = var5;
         } catch (RuntimeException var7) {
            throw classEG.method3884(var7, "nb.az(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnb;Lva;IIIZ)V")
   @ObfuscatedName("nd")
   public static void method7759(MidiRequest var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      if (var0 == null) {
         var0.method7756(var1, var2, var2, var2, var5);
      }

      var0.field4642 = var1;
      var0.field4632 = var2 * 1190162147;
      var0.field4630 = 424024677 * var3;
      var0.field4635 = var4 * -1016653583;
      var0.field4636 = var5;
   }

   @ObfuscatedSignature(descriptor = "(Lva;IIIZS)V")
   @ObfuscatedName("az")
   void method7760(AbstractArchive var1, int var2, int var3, int var4, boolean var5, short var6) {
      this.method7761(var1, var2, var3, var4, var5);

      try {
         this.field4642 = var1;
         this.field4635 = var2 * 1190162147;
         this.field4632 = 424024677 * var3;
         this.field4632 = var4 * -1016653583;
         this.field4643 = var5;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "nb.az(" + ')');
      }
   }
}
