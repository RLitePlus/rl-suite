import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sj")
public interface classSJ {
   @ObfuscatedSignature(descriptor = "(Luz;FFF)V")
   @ObfuscatedName("nq")
   static void method10457(classUZ var0, float var1, float var2, float var3) {
      if (var0 == null) {
         var0.method11783();
      }

      var0.method11728(var1, var2, var3, 1996170472);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   int vmethod310();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwc;IIILzl;)V")
   @ObfuscatedName("bq")
   static void method10456(classWC var0, int var1, int var2, int var3, classZL var4) {
      if (var0.field6660 != null && var1 != var0.field6662 * 1439462015) {
         var0.field6658 = var0.field6660.method544() * 1752077091;
         var0.field6659 = classDD.method2983(16711680) * -4042382095557502705L;
         var0.field6662 = 660426111 * var1;
         var0.field6661 = var0.method12307(var3, var0.field6658 * -213319706 - var0.field6662 * 1439462015, var2, (short)402) * 95557819;
         var0.field6663 = var4;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bd")
   boolean vmethod303();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   boolean vmethod304();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   int vmethod309(int var1);

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ac")
   boolean vmethod302(byte var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cq")
   int vmethod312();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   int vmethod307();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   int vmethod305();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   int vmethod306();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   int vmethod311();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   int vmethod308(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   int vmethod314(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cl")
   int vmethod313();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   int vmethod315();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cv")
   int vmethod316();
}
