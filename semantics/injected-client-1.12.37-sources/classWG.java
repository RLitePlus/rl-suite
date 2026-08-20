import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wg")
public interface classWG {
   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("af")
   byte[] vmethod637(int var1) throws UnsupportedEncodingException;

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ax")
   byte[] vmethod635() throws UnsupportedEncodingException;

   @ObfuscatedSignature(descriptor = "()Lwy;")
   @ObfuscatedName("ae")
   classWY vmethod632();

   @ObfuscatedSignature(descriptor = "()Lwy;")
   @ObfuscatedName("ab")
   classWY vmethod633();

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("as")
   byte[] vmethod634() throws UnsupportedEncodingException;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;I)F")
   @ObfuscatedName("sx")
   static float method12362(classSU var0, int var1) {
      if (var0 == null) {
         var0.method10664();
      }

      if (var1 < classSU.method10662(var0, (byte)8)) {
         return var0.field6056;
      } else {
         return var1 > var0.method10666(2112203563) ? var0.field6055 : var0.field6067[var1 - classSU.method10662(var0, (byte)-5)];
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lwy;")
   @ObfuscatedName("az")
   classWY vmethod631(byte var1);

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ac")
   byte[] vmethod636() throws UnsupportedEncodingException;

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ag")
   byte[] vmethod638() throws UnsupportedEncodingException;
}
