import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class UrlRequest {
   @ObfuscatedName("ae")
   volatile byte[] response0;
   @ObfuscatedName("at")
   static int field1726 = -1969430758;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("lg")
   static IndexedSprite[] field1731;
   @ObfuscatedName("an")
   volatile int field1728;
   @ObfuscatedName("av")
   static int field1725 = 2066538105;
   @ObfuscatedName("js")
   static boolean mouseCam;
   @ObfuscatedName("ag")
   final URL field1727;

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public String method3932(int var1) {
      try {
         return this.field1727.toString();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ey.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   public boolean isDone(int var1) {
      try {
         boolean var10000;
         if (-1574906825 * field1725 != this.field1728 * -546326971) {
            if (var1 != 1741769013) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ey.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;I)V")
   @ObfuscatedName("aq")
   static final void PcmStream_disable(PcmStream var0, int var1) {
      try {
         var0.active = false;
         if (null != var0.sound) {
            var0.sound.position = 0;
         }

         for (PcmStream var2 = var0.vmethod163(); null != var2; var2 = var0.vmethod169()) {
            if (var1 <= -291261094) {
               throw new IllegalStateException();
            }

            PcmStream_disable(var2, 1406553417);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ey.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   public boolean method3927() {
      return -1574906825 * field1725 != this.field1728 * -546326971;
   }

   @ObfuscatedSignature(descriptor = "(B)[B")
   @ObfuscatedName("at")
   public byte[] getResponse(byte var1) {
      try {
         return this.response0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ey.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   public boolean method3928() {
      return -1574906825 * field1725 != this.field1728 * -546326971;
   }

   UrlRequest(URL var1) {
      this.field1728 = field1725 * 399677003;
      this.field1727 = var1;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aw")
   public byte[] method3931() {
      return this.response0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String method3933() {
      return this.field1727.toString();
   }

   @ObfuscatedSignature(descriptor = "(II)Ljt;")
   @ObfuscatedName("ag")
   static Frames getFrames(int var0, int var1) {
      synchronized (SequenceDefinition.SequenceDefinition_cachedFrames) {
         int var4 = var0;
         int var5 = 1219846436;

         Frames var10000;
         try {
            Frames var6 = (Frames)class402.method8806(SequenceDefinition.SequenceDefinition_cachedFrames, var4);
            if (var6 != null) {
               if (var5 <= -719929334) {
                  throw new IllegalStateException();
               }

               var10000 = var6;
            } else {
               var6 = class142.method4014(class152.SequenceDefinition_animationsArchive, WorldMapIcon_0.SpotAnimationDefinition_archive, var4, (byte)104);
               if (var6 != null) {
                  if (var5 <= -719929334) {
                     throw new IllegalStateException();
                  }

                  SequenceDefinition.SequenceDefinition_cachedFrames.put(var6, var4);
               }

               var10000 = var6;
            }
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "ey.ag(" + ')');
         }

         return var10000;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("au")
   public String method3934() {
      return this.field1727.toString();
   }

   @ObfuscatedSignature(descriptor = "(IB)Lfi;")
   @ObfuscatedName("aj")
   static class137 method3929(int var0, byte var1) {
      try {
         class137 var2 = (class137)GrandExchangeOffer.findEnumerated(PlayerUpdateManager.method3619((byte)0), var0, (byte)1);
         if (var2 == null) {
            var2 = class137.field1790;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ey.aj(" + ')');
      }
   }
}
