import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mf")
public interface classMF {
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   int vmethod527();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgr;Lgl;Ljava/util/List;)V")
   @ObfuscatedName("sh")
   static void method7564(classGR var0, classGL var1, List var2) {
      var0.field2659.clear();
      var0.field2669 = var1;
      var0.method5639(var2, (byte)-27);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   int vmethod528(int var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqq;)Z")
   @ObfuscatedName("pt")
   static boolean method7563(classQQ var0) {
      return var0.field5594;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   int vmethod529();
}
