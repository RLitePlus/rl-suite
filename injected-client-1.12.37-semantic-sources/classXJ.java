import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xj")
public class classXJ {
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("ag")
   public static final classXJ field6879 = new classXJ("verdana_13pt_regular");
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("af")
   public static final classXJ field6878 = new classXJ("p12_full");
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("ae")
   public static final classXJ field6876 = new classXJ("b12_full");
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("ab")
   public static final classXJ field6877 = new classXJ("verdana_11pt_regular");
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final String field6883 = "zeropad_";
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("as")
   public static final classXJ field6875 = new classXJ("verdana_15pt_regular");
   @ObfuscatedName("ax")
   String field6880;
   @ToRemove(unused = "true")
   @ObfuscatedName("dd")
   static final int field6882 = 2;
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("az")
   public static final classXJ field6874 = new classXJ("p11_full");
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field6881 = 40;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)I")
   @ObfuscatedName("uy")
   public static int method12795(ClientPreferences var0) {
      return var0 == null ? var0.method2747() : var0.field1346 * 588926121;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lxj;")
   @ObfuscatedName("af")
   public static classXJ[] method12791() {
      return new classXJ[]{field6875, field6876, field6879, field6878, field6874, field6877};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxi;)Z")
   @ObfuscatedName("ix")
   public static boolean method12794(classXI var0) {
      if (var0 == null) {
         var0.method12782();
      }

      return -345274759 * var0.field6873 < var0.this$0.method11706((byte)-114);
   }

   @ObfuscatedSignature(descriptor = "(B)[Lzl;")
   @ObfuscatedName("ag")
   static classZL[] method12793(byte var0) {
      try {
         return new classZL[]{
            classZL.field7194,
            classZL.field7222,
            classZL.field7195,
            classZL.field7196,
            classZL.field7197,
            classZL.field7198,
            classZL.field7208,
            classZL.field7199,
            classZL.field7200,
            classZL.field7209,
            classZL.field7202,
            classZL.field7221,
            classZL.field7215,
            classZL.field7204,
            classZL.field7205,
            classZL.field7206,
            classZL.field7207,
            classZL.field7218,
            classZL.field7203,
            classZL.field7210,
            classZL.field7211,
            classZL.field7212,
            classZL.field7213,
            classZL.field7214,
            classZL.field7220,
            classZL.field7219,
            classZL.field7216,
            classZL.field7217
         };
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "xj.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lxj;")
   @ObfuscatedName("az")
   public static classXJ[] method12792(int var0) {
      try {
         return new classXJ[]{field6875, field6876, field6879, field6878, field6874, field6877};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "xj.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bb")
   static void method12796(int var0) {
      try {
         client.field849 = client.field845 * 2071496817;
         classLE.field4126 = classKU.field4025;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "xj.bb(" + ')');
      }
   }

   classXJ(String var1) {
      this.field6880 = var1;
   }
}
