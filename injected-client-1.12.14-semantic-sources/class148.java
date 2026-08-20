import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fv")
public class class148 extends classFM {
   @ObfuscatedName("on")
   static byte[][] regionMapArchives;
   @ObfuscatedName("at")
   int field1906;
   @ObfuscatedName("ag")
   int field1904;
   @ObfuscatedName("bs")
   static int field1907;
   @ObfuscatedName("an")
   int field1905;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("dj")
   static IndexedSprite[] worldSelectStars;
   @ObfuscatedName("af")
   static int[][][] field1911;
   @ObfuscatedName("av")
   int field1903;
   @ToRemove(unused = "true")
   @ObfuscatedName("cj")
   static final int field1908 = 503;

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("aw")
   static void method4142(Buffer var0, byte var1) {
      try {
         while (true) {
            int var2 = Buffer.method12008(var0, (byte)5);
            if (var2 == 0) {
               if (var1 <= 32) {
                  throw new IllegalStateException();
               }
            } else {
               if (var2 != 1) {
                  if (var2 > 49) {
                     continue;
                  }

                  if (var1 <= 32) {
                     return;
                  }

                  var0.readShort((byte)-104);
                  continue;
               }

               if (var1 <= 32) {
                  throw new IllegalStateException();
               }

               var0.readUnsignedByte(-1249847115);
            }

            return;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fv.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field1903 = Buffer.method12008(var1, (byte)5) * 1242161149;
         this.field1906 = Buffer.method12015(var1, 523256480) * -481761977;
         this.field1904 = var1.readUnsignedByte(-126279374) * -1800163567;
         this.field1905 = var1.readUnsignedByte(544571984) * -1824667485;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fv.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4323(this.field1903 * -220039851, -1566755721 * this.field1906, -1294523919 * this.field1904, this.field1905 * -149476597, (byte)-78);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fv.at(" + ')');
      }
   }

   class148(class154 var1) {
      this.this$0 = var1;
      this.field1903 = -1242161149;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4323(this.field1903 * -220039851, 721268016 * this.field1906, -1294523919 * this.field1904, this.field1905 * 271304328, (byte)-85);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field1903 = Buffer.method12008(var1, (byte)5) * 1388455614;
      this.field1906 = Buffer.method12015(var1, 960680967) * -700966971;
      this.field1904 = var1.readUnsignedByte(1706042500) * 225197115;
      this.field1905 = var1.readUnsignedByte(-649604956) * -1824667485;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Law;)V")
   @ObfuscatedName("ei")
   public static void method4141(SpriteBufferProperties var0) {
      if (var0 == null) {
         var0.method297();
      } else {
         var0.field86.shutdown();
         var0.field86 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("it")
   static void method4143(String var0, int var1, int var2) {
      try {
         classGK.method4244(0, 0, 184564740);
         ArrayList var3 = new ArrayList();
         var3.add(new MidiRequest(GrandExchangeOfferOwnWorldComparator.field422, var0, "", var1, false));
         class113.method3918(var3, 0, 0, 0, 100, false, -1882065613);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fv.it(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field1903 = Buffer.method12008(var1, (byte)5) * 1242161149;
      this.field1906 = Buffer.method12015(var1, -397666799) * -481761977;
      this.field1904 = var1.readUnsignedByte(-1110479333) * -1847892572;
      this.field1905 = var1.readUnsignedByte(2023198588) * -141862017;
   }
}
