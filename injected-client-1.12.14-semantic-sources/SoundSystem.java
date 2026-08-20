import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dg")
public class SoundSystem implements Runnable {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1355 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field1356 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field1357 = 37;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1354 = 6;
   @ObfuscatedSignature(descriptor = "[Ldm;")
   @ObfuscatedName("av")
   volatile PcmPlayer[] players = new PcmPlayer[2];

   SoundSystem() {
   }

   @Override
   public void run() {
      this.method3118();

      try {
         try {
            for (int var1 = 0; var1 < 2; var1++) {
               PcmPlayer var2 = this.players[var1];
               if (var2 != null) {
                  var2.run(327716789);
               }
            }
         } catch (Exception var3) {
            PlayerType.RunException_sendStackTrace(null, var3, -1606499883);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dg.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dk")
   public void method3112() {
      try {
         for (int var1 = 0; var1 < 2; var1++) {
            PcmPlayer var2 = this.players[var1];
            if (var2 != null) {
               var2.run(327716789);
            }
         }
      } catch (Exception var3) {
         PlayerType.RunException_sendStackTrace(null, var3, 1865716431);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public void method3113() {
      try {
         for (int var1 = 0; var1 < 2; var1++) {
            PcmPlayer var2 = this.players[var1];
            if (var2 != null) {
               var2.run(327716789);
            }
         }
      } catch (Exception var3) {
         PlayerType.RunException_sendStackTrace(null, var3, 607157651);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public void method3114() {
      try {
         for (int var1 = 0; var1 < 2; var1++) {
            PcmPlayer var2 = this.players[var1];
            if (var2 != null) {
               var2.run(327716789);
            }
         }
      } catch (Exception var3) {
         PlayerType.RunException_sendStackTrace(null, var3, -926288320);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("uy")
   public void method3118() {
      Thread.currentThread().setName("Sound Engine");
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("av")
   static String method3115(int var0, int var1) {
      try {
         return "<img=" + var0 + ">";
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dg.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;)V")
   @ObfuscatedName("dt")
   public static void method3117(WorldMapRenderer var0) {
      if (var0 == null) {
         var0.method7155();
      }

      var0.icons = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   static void method3116(int var0) {
      try {
         Tiles.Tiles_minPlane = -226730897;
         class33.Tiles_underlays = new short[4][104][104];
         class623.Tiles_overlays = new short[4][104][104];
         class200.Tiles_shapes = new byte[4][104][104];
         HttpRequest.field83 = new byte[4][104][104];
         class148.field1911 = new int[4][105][105];
         Tiles.Tiles_underlays2 = new byte[4][105][105];
         MouseRecorder.field1086 = new int[105][105];
         WorldMapSectionType.Tiles_hue = new int[104];
         class565.Tiles_saturation = new int[104];
         class67.Tiles_lightness = new int[104];
         class161.Tiles_hueMultiplier = new int[104];
         class154.field1761 = new int[104];
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "dg.av(" + ')');
      }
   }
}
