import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uf")
public class classUF extends classUR {
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field6300 = 20;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field6301 = 23;

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod579(Buffer var1, int var2) {
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("az")
   @Override
   void vmethod580(Buffer var1, int var2, byte var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "uf.az(" + ')');
      }
   }

   public classUF(int var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("af")
   @Override
   void vmethod581(Buffer var1, int var2) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyx;)[S")
   @ObfuscatedName("vx")
   public static short[] method11298(classYX var0) {
      return var0.field7105;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("az")
   public static void method11299(String var0, byte var1) {
      try {
         classOE.client.getCallbacks().openUrl(var0);
      } catch (Exception var3) {
         client.logger.error("unable to open url {}", var0, var3);
      }
   }
}
