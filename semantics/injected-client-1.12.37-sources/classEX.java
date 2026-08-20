import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ex")
public class classEX {
   @ObfuscatedSignature(descriptor = "Lex;")
   @ObfuscatedName("az")
   public static final classEX field1977 = new classEX();
   @ObfuscatedSignature(descriptor = "Lex;")
   @ObfuscatedName("af")
   public static final classEX field1978 = new classEX();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lex;")
   @ObfuscatedName("af")
   public static classEX[] method4104() {
      return new classEX[]{field1977, field1978};
   }

   classEX() {
   }

   @ObfuscatedSignature(descriptor = "()[Lex;")
   @ObfuscatedName("az")
   public static classEX[] method4105() {
      return new classEX[]{field1977, field1978};
   }
}
