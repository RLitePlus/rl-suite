import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pb")
public class classPB {
   @ObfuscatedName("ag")
   String field5210 = null;
   @ObfuscatedName("as")
   List field5211;
   @ObfuscatedSignature(descriptor = "Lpo;")
   @ObfuscatedName("ax")
   classPO field5212;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;)I")
   @ObfuscatedName("wd")
   public static int method8834(ScriptEvent var0) {
      return var0.field7247 * -522070929;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;)I")
   @ObfuscatedName("pq")
   public static int method8835(classSU var0) {
      return var0.field6060 * -1666621055;
   }

   classPB(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.field5210 = var1;
      }
   }
}
