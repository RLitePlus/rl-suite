import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gw")
public class classGW extends classFM {
   @ObfuscatedName("at")
   int field2107;
   @ObfuscatedName("av")
   int field2109;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field2108 = 4;

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4326(-655555767 * this.field2109, this.field2107 * -998490199, -1945234542);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field2109 = Buffer.method12015(var1, -889092984) * -2043431739;
         this.field2107 = Buffer.method12015(var1, 1087050538) * 1620497561;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4326(2068949517 * this.field2109, this.field2107 * -998490199, -1945234542);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field2109 = Buffer.method12015(var1, -393449854) * -2043431739;
      this.field2107 = Buffer.method12015(var1, -920240556) * 1620497561;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field2109 = Buffer.method12015(var1, -453658622) * -2043431739;
      this.field2107 = Buffer.method12015(var1, -79492218) * 1620497561;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("rj")
   public static void method4376(PlayerUpdateManager var0) {
      if (var0 == null) {
         var0.method3660();
      }

      var0.field1538 = 0;

      for (int var1 = 0; var1 < 1709958384; var1++) {
         var0.Players_regions[var1].method534((byte)-59);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   public static int method4374(int var0, int var1) {
      try {
         var0 += 64;
         return (var0 & 2047) / 128;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gw.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)V")
   @ObfuscatedName("av")
   public static void method4373(AbstractArchive var0, AbstractArchive var1, int var2) {
      try {
         class209.WorldMapElement_archive = var1;
         WorldMapElement.WorldMapElement_count = AbstractArchive.method9046(var0, 35, (byte)-69) * 961549525;
         WorldMapElement.WorldMapElement_cached = new WorldMapElement[143164541 * WorldMapElement.WorldMapElement_count];

         for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count * 143164541; var3++) {
            if (var2 != -718309399) {
               return;
            }

            byte[] var4 = var0.getFile(35, var3, -235540931);
            WorldMapElement.WorldMapElement_cached[var3] = new WorldMapElement(var3);
            if (null != var4) {
               if (var2 != -718309399) {
                  return;
               }

               WorldMapElement.WorldMapElement_cached[var3].decode(new Buffer(var4), (byte)88);
               WorldMapElement.method4553(WorldMapElement.WorldMapElement_cached[var3], (byte)1);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "gw.av(" + ')');
      }
   }

   classGW(class154 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("ce")
   public static int method4375(String var0, int var1) {
      try {
         return var0.length() + 2;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gw.ce(" + 41);
      }
   }
}
