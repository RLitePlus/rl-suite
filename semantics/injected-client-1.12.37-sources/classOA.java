import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oa")
public class classOA extends classPB {
   @ObfuscatedName("ab")
   int field4803;
   @ObfuscatedName("af")
   int field4802;
   @ObfuscatedName("ae")
   int field4804;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field4806 = 65535;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field4807 = 32;
   @ObfuscatedName("az")
   int field4805;

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ac")
   public static int method8289(byte var0) {
      try {
         return -1529735849 * classEY.field1983;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "oa.ac(" + 41);
      }
   }

   classOA(String var1, int var2, int var3, int var4, int var5) {
      super(var1);
      this.field4805 = 425793223 * var2;
      this.field4802 = var3 * -1293835387;
      this.field4804 = var4 * 1339993387;
      this.field4803 = var5 * 2110327357;
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("eh")
   static classKY method8290(int var0) {
      try {
         WorldView var3 = client.field814.method1590(client.field846 * -2034209657, (short)542);
         Player var5 = var3.method3737(client.field845 * -2130951373, (byte)1);
         classUZ var2;
         if (var5 != null) {
            if (var0 != 1544651080) {
               throw new IllegalStateException();
            }

            classUZ var6 = classYY.method13790(var3, var5.vmethod368(311606126), var5.vmethod371(-1909982160), (byte)107);
            var6.field6425 = var5.vmethod258((byte)-91);
            var2 = var6;
         } else {
            var2 = classHZ.method6135(16777216);
         }

         classKY var1;
         if (classUZ.method11745(var2, (byte)-71)) {
            if (var0 != 1544651080) {
               throw new IllegalStateException();
            }

            var1 = new classKY();
         } else {
            int var4 = classKY.method6608((int)var2.field6427, (byte)-67);
            int var8 = classKY.method6608((int)var2.field6426, (byte)-80);
            var1 = new classKY((int)var2.field6425, var4, var8);
         }

         if (classKY.method6630(var1, -1912810292)) {
            if (var0 != 1544651080) {
               throw new IllegalStateException();
            }

            var1.field4055 = var1.field4055 - 1982338775 * classIS.field3053.field1709;
            var1.field4056 = var1.field4056 - classIS.field3053.field1708 * 697183897;
         }

         return var1;
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "oa.eh(" + ')');
      }
   }
}
