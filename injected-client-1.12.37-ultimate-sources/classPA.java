import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pa")
public class classPA extends classVJ {
   @ObfuscatedName("as")
   public final int field5204;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   static classVA field5208;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ab")
   static classJZ field5203 = new classJZ(64);
   @ObfuscatedName("ag")
   public final boolean field5205;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   public static final int field5207 = 49;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5206 = 2;
   @ObfuscatedName("bw")
   static boolean field5209;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public static void method8828() {
      classJZ.method6431(field5203);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ab")
   public static void method8823(classVA var0) {
      field5208 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public static void method8829() {
      classJZ.method6431(field5203);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("as")
   public static void method8824(classVA var0) {
      field5208 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)I")
   @ObfuscatedName("ks")
   public static int method8833(classWM var0) {
      return var0.field6695 * -811287683;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpa;")
   @ObfuscatedName("ax")
   public static classPA method8826(int var0) {
      classPA var1 = (classPA)field5203.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5208.method11867(19, var0, -1462983089);
         var1 = new classPA(new classXY(var2));
         field5203.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpa;")
   @ObfuscatedName("ac")
   public static classPA method8827(int var0) {
      classPA var1 = (classPA)field5203.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5208.method11867(19, var0, -1619578252);
         var1 = new classPA(new classXY(var2));
         field5203.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public static void method8830() {
      classJZ.method6431(field5203);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;I)I")
   @ObfuscatedName("ox")
   public static int method8832(classPV var0, int var1) {
      return var0.field5430[var1 & 31];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ag")
   public static void method8825(classVA var0) {
      field5208 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loc;II)I")
   @ObfuscatedName("jm")
   public static int method8831(classOC var0, int var1, int var2) {
      return classGQ.method5602(var0.field4816, var1, var2, 62885504);
   }

   classPA(classXY var1) {
      boolean var2 = false;
      int var3 = -1;
      if (var1 != null && var1.field6954 != null) {
         label29:
         while (true) {
            int var4 = classXY.method13039(var1, -346779531);
            switch (var4) {
               case 0:
                  break label29;
               case 1:
               default:
                  continue;
               case 2:
                  var2 = true;
                  continue;
               case 3:
            }

            var3 = classXY.method13047(var1, -2006674292);
         }
      }

      this.field5205 = var2;
      this.field5204 = var3 * -1405933545;
   }
}
