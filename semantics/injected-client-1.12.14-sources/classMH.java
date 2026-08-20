import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mh")
public class classMH {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field3845 = 1000000;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3847 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field3844 = 13;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field3846 = 512;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldy;)I")
   @ObfuscatedName("qd")
   public static int method7426(classDY var0) {
      if (var0 == null) {
         var0.method3599();
      }

      return var0.field1525 * 1558853963;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;Lha;)Ljm;")
   @ObfuscatedName("xt")
   public static ModelData method7427(NPCComposition var0, NpcOverrides var1) {
      if (var0 == null) {
         var0.getChatheadModels();
      }

      if (null != var0.transforms) {
         NPCComposition var2 = NPCComposition.method4683(var0, (byte)0);
         return null == var2 ? null : NPCComposition.method4677(var2, var1, 630682274);
      } else {
         return var0.getModelData(var0.chatHeadModels, var1, -618910119);
      }
   }

   classMH() throws Throwable {
      throw new Error();
   }
}
