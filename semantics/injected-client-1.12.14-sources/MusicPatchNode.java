import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nd")
public class MusicPatchNode extends Node {
   @ObfuscatedSignature(descriptor = "Ldq;")
   @ObfuscatedName("an")
   RawSound rawSound;
   @ObfuscatedName("at")
   int field4253;
   @ObfuscatedName("as")
   int field4252;
   @ObfuscatedName("aw")
   int field4256;
   @ObfuscatedName("ak")
   int field4248;
   @ObfuscatedName("ad")
   int field4244;
   @ObfuscatedName("aj")
   int field4247;
   @ObfuscatedSignature(descriptor = "Lng;")
   @ObfuscatedName("ae")
   MusicPatchNode2 field4263;
   @ObfuscatedName("ap")
   int field4250;
   @ObfuscatedName("ay")
   int field4258;
   @ObfuscatedName("au")
   int field4254;
   @ObfuscatedName("az")
   int field4259;
   @ObfuscatedSignature(descriptor = "Lnw;")
   @ObfuscatedName("ag")
   MusicPatch table;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4255 = 1048576;
   @ObfuscatedName("ar")
   int field4251;
   @ObfuscatedName("ac")
   int field4243;
   @ObfuscatedName("ab")
   int field4242;
   @ObfuscatedName("ax")
   int field4257;
   @ObfuscatedName("ai")
   int field4246;
   @ObfuscatedSignature(descriptor = "Ldk;")
   @ObfuscatedName("ah")
   RawPcmStream stream;
   @ObfuscatedName("al")
   int field4249;
   @ObfuscatedName("af")
   int field4245;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   public static final int field4260 = 1;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method7737(int var1) {
      try {
         this.table = null;
         this.rawSound = null;
         this.field4263 = null;
         this.stream = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nd.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   void method7738() {
      this.table = null;
      this.rawSound = null;
      this.field4263 = null;
      this.stream = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnd;)V")
   @ObfuscatedName("yr")
   public static void method7739(MusicPatchNode var0) {
      if (var0 == null) {
         var0.method7740();
      } else {
         var0.table = null;
         var0.rawSound = null;
         var0.field4263 = null;
         var0.stream = null;
      }
   }

   MusicPatchNode() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   void method7740() {
      this.table = null;
      this.rawSound = null;
      this.field4263 = null;
      this.stream = null;
   }

   @ObfuscatedSignature(descriptor = "(B)[Lpf;")
   @ObfuscatedName("ae")
   public static class403[] method7736(byte var0) {
      try {
         return new class403[]{class403.field4802, class403.field4803, class403.field4800, class403.field4801};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "nd.ae(" + ')');
      }
   }
}
