import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ia")
public class classIA extends classIS {
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field2923 = 65536;
   @ObfuscatedName("af")
   byte field2920;
   @ObfuscatedName("ae")
   int field2921;
   @ObfuscatedName("ab")
   String field2926;
   @ObfuscatedName("az")
   int field2919;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ag")
   public static AbstractArchive field2927;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2924 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2922 = 28;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field2925 = 63;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod505(Buffer var1) {
      this.field2919 = Buffer.method13047(var1, 1342024445) * -1326993401;
      this.field2920 = Buffer.method13043(var1, (byte)17);
      this.field2921 = Buffer.method13047(var1, 70727043) * 1810015857;
      var1.method13059(1619290492);
      this.field2926 = var1.method13071(1395808511);
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod508(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.field2955.get(1665855653 * this.field2919);
      var2.field2841 = this.field2920;
      var2.field2842 = this.field2921 * -1466320636;
      var2.field2846 = new classAAE(this.field2926);
   }

   @ObfuscatedSignature(descriptor = "(Lie;I)V")
   @ObfuscatedName("af")
   @Override
   void vmethod509(ClanChannel var1, int var2) {
      try {
         ClanChannelMember var3 = (ClanChannelMember)var1.field2955.get(1665855653 * this.field2919);
         var3.field2841 = this.field2920;
         var3.field2842 = this.field2921 * 1642452849;
         var3.field2846 = new classAAE(this.field2926);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ia.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod506(Buffer var1) {
      this.field2919 = Buffer.method13047(var1, 683294502) * -848595155;
      this.field2920 = Buffer.method13043(var1, (byte)17);
      this.field2921 = Buffer.method13047(var1, 96279455) * -832897509;
      var1.method13059(1275235733);
      this.field2926 = var1.method13071(1218420373);
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod510(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.field2955.get(1665855653 * this.field2919);
      var2.field2841 = this.field2920;
      var2.field2842 = this.field2921 * 1642452849;
      var2.field2846 = new classAAE(this.field2926);
   }

   classIA(classIX var1) {
      this.this$0 = var1;
      this.field2919 = 848595155;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod507(Buffer var1, int var2) {
      try {
         this.field2919 = Buffer.method13047(var1, 500121357) * -848595155;
         this.field2920 = Buffer.method13043(var1, (byte)17);
         this.field2921 = Buffer.method13047(var1, -1680678979) * -832897509;
         var1.method13059(829292351);
         this.field2926 = var1.method13071(-226046619);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ia.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod511(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.field2955.get(209597842 * this.field2919);
      var2.field2841 = this.field2920;
      var2.field2842 = this.field2921 * 1642452849;
      var2.field2846 = new classAAE(this.field2926);
   }
}
