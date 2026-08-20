import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uo")
public class class535 extends classUE {
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("jb")
   static MouseRecorder mouseRecorder;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field6079 = 18;

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod409(Buffer var1, int var2) {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("av")
   @Override
   void vmethod406(Buffer var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "uo.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;FFF)F")
   @ObfuscatedName("le")
   public static float method11198(TransformationMatrix var0, float var1, float var2, float var3) {
      return var1 * var0.field5724 + var0.field5735 * var2 + var0.field5743 * var3 + var0.field5742;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("at")
   @Override
   void vmethod408(Buffer var1, int var2) {
   }

   public class535(int var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("an")
   @Override
   void vmethod410(Buffer var1, int var2) {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod407(Buffer var1, int var2) {
   }
}
