import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bq")
public class classBQ {
   @ObfuscatedName("af")
   static final BigInteger field524 = new BigInteger(
      "8008cc488ea535aa529757737359586b5ab3018f4ddede24a3f447c2b478eaac392381302f8da057a1550f4cabf937ab9c975036b371178524c87ac213835323b928c80dbc4bf272164afb394446fc2eef6b180048ce3f844ddf800b70ae5db055ae9bc4850cbaed6053448bfa88170f8d11969ef6fef57bc43ba2dda04cc2bd",
      16
   );
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field527 = 70;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field525 = 423;
   @ObfuscatedName("nw")
   static int field529;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field526 = 10;
   @ObfuscatedName("az")
   static final BigInteger field523 = new BigInteger("10001", 16);
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("aa")
   static classVA field531;
   @ObfuscatedName("on")
   static int field530;
   @ObfuscatedName("jg")
   static int field528;

   @ObfuscatedSignature(descriptor = "(II)Lcg;")
   @ObfuscatedName("ab")
   static classCG method1176(int var0, int var1) {
      try {
         return (classCG)classCN.field1174.method13595(var0);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bq.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ag")
   static String method1177(int var0) {
      try {
         String var10000;
         if (classCY.method2724(classAB.field122, (short)14302)) {
            if (var0 == 1990200307) {
               throw new IllegalStateException();
            }

            var10000 = classSL.method10470(classBF.field389, (short)-14678);
         } else {
            var10000 = classBF.field389;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "bq.ag(" + ')');
      }
   }

   classBQ() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("eb")
   static void method1178(int var0, int var1, int var2, int var3, String var4, String var5, int var6) {
      try {
         classLW var7 = classLY.method7378(classWK.field6691, var0, var1, (byte)-72);
         if (var7 != null) {
            if (var6 != -2085845878) {
               return;
            }

            if (null != var7.field4381) {
               if (var6 != -2085845878) {
                  throw new IllegalStateException();
               }

               classZR var8 = classZS.method14182(classUQ.method11465(var7, 2126959045).method14145(var7.field4381, (byte)2), (byte)127);
               classSZ.method10729(var8, -686242000);
            }
         }

         client.field981 = var3 * -1326078651;
         client.field979 = true;
         field529 = -1007347613 * var0;
         client.field980 = 636078859 * var1;
         classLF.field4131 = 1733518633 * var2;
         client.field924 = var4;
         client.field983 = var5;
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "bq.eb(" + ')');
      }
   }
}
