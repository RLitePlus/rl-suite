import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oc")
public class classOC extends classVJ {
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ab")
   public static classJZ field4814 = new classJZ(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4817 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4819 = 2;
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("as")
   final classYN field4816;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field4818 = 5;
   @ObfuscatedName("ag")
   public final int field4815;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loc;")
   @ObfuscatedName("as")
   public static classOC method8303(int var0) {
      classOC var1 = (classOC)field4814.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classZW.field7286.method11867(5, var0, -1506492378);
         var1 = new classOC(new classXY(var2));
         field4814.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ae")
   public int method8306(int var1, int var2, byte var3) {
      try {
         return classGQ.method5602(this.field4816, var1, var2, -1679790382);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "oc.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("ab")
   public String method8308(int var1, String var2, byte var3) {
      try {
         return classFS.method4977(this.field4816, var1, var2, (byte)50);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "oc.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ag")
   public static void method8302(classVA var0) {
      classZW.field7286 = var0;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ao")
   public int method8307(int var1, int var2) {
      return classGQ.method5602(this.field4816, var1, var2, 565551096);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loc;")
   @ObfuscatedName("ax")
   public static classOC method8304(int var0) {
      classOC var1 = (classOC)field4814.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classZW.field7286.method11867(5, var0, -751956593);
         var1 = new classOC(new classXY(var2));
         field4814.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loc;")
   @ObfuscatedName("ac")
   public static classOC method8305(int var0) {
      classOC var1 = (classOC)field4814.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classZW.field7286.method11867(5, var0, -1228399928);
         var1 = new classOC(new classXY(var2));
         field4814.method6428(var1, var0);
         return var1;
      }
   }

   classOC(classXY var1) {
      int var2 = 0;
      classYN var3 = null;
      if (var1 != null && var1.field6954 != null) {
         while (true) {
            int var4 = classXY.method13039(var1, -346779531);
            if (0 == var4) {
               break;
            }

            switch (var4) {
               case 2:
                  var2 = classXY.method13047(var1, -1413961900);
                  break;
               case 249:
                  var3 = classQH.method9525(var1, var3, 1978086108);
            }
         }
      }

      this.field4815 = 1739391975 * var2;
      if (var3 == null) {
         this.field4816 = new classYN(1);
      } else {
         this.field4816 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("al")
   public String method8309(int var1, String var2) {
      return classFS.method4977(this.field4816, var1, var2, (byte)95);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method8310(int var1, String var2) {
      return classFS.method4977(this.field4816, var1, var2, (byte)93);
   }
}
