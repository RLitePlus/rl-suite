import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mr")
public class classMR {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4567 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field4565 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field4564 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field4566 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field4563 = 8;

   @ObfuscatedSignature(descriptor = "(IB)Loc;")
   @ObfuscatedName("af")
   public static classOC method7647(int var0, byte var1) {
      try {
         classOC var2 = (classOC)classOC.field4814.method6422(var0);
         if (null != var2) {
            if (var1 == 10) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classZW.field7286.method11867(5, var0, -753352399);
            var2 = new classOC(new classXY(var3));
            classOC.field4814.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mr.af(" + ')');
      }
   }

   classMR() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("az")
   public static void method7646(classVA var0, int var1) {
      try {
         classPA.field5208 = var0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mr.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("gf")
   static void method7648(classXY var0, int var1, int var2) {
      try {
         classCK.method1577(var0.field6954, var1, 1087227559);
         classBZ.method1391(var0, var1, -1038651980);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mr.gf(" + ')');
      }
   }
}
