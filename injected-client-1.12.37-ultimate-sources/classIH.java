import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ih")
public class classIH {
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field2971 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2973 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field2975 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field2974 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field2972 = 4;

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("cn")
   static final void method6211(short var0) {
      try {
         for (classCJ var1 = (classCJ)classYE.field6977.method13587(); null != var1; var1 = (classCJ)classYN.method13589(classYE.field6977)) {
            if (var0 == 209) {
               throw new IllegalStateException();
            }

            if (1612595797 * client.field855 > var1.method1557((short)1088)) {
               if (var0 == 209) {
                  throw new IllegalStateException();
               }

               var1.vmethod398();
            } else if (1612595797 * client.field855 >= classCJ.method1554(var1, (byte)0)) {
               if (var0 == 209) {
                  throw new IllegalStateException();
               }

               var1.method1531(client.field814, 1612595797 * client.field855, -322689719 * client.field949, (byte)-48);
               classEZ.method4477(
                  classIS.field3053.field1689,
                  var1.method1561((byte)4),
                  var1.method1562(-2100060870),
                  var1.method1568((byte)42),
                  var1.method1564((byte)8),
                  60,
                  var1,
                  var1.method1570((byte)-43),
                  -1L,
                  false
               );
            }
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ih.cn(" + ')');
      }
   }

   classIH() throws Throwable {
      throw new Error();
   }
}
