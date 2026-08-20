import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cb")
public class classCB implements classXZ {
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("af")
   static final classCB field639 = new classCB(1, 2);
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hn")
   static classVP field650;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("av")
   public static AbstractArchive field649;
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("ab")
   static final classCB field644 = new classCB(3, 4);
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("as")
   static final classCB field643 = new classCB(5, 6);
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("ag")
   static final classCB field642 = new classCB(4, 5);
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("ax")
   static final classCB field641 = new classCB(6, 14);
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("ac")
   static final classCB field645 = new classCB(7, 19);
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("aa")
   static final classCB field646 = new classCB(8, 22);
   @ObfuscatedName("ao")
   final int field648;
   @ObfuscatedName("al")
   final int field647;
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("az")
   static final classCB field638 = new classCB(0, -1);
   @ObfuscatedSignature(descriptor = "Lcb;")
   @ObfuscatedName("ae")
   static final classCB field640 = new classCB(2, 3);

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return 350850931 * this.field647;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cb.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)I")
   @ObfuscatedName("ir")
   public static int method1401(classPV var0) {
      return var0.field5429 * -634175101;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return 350850931 * this.field647;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return 350850931 * this.field647;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcb;")
   @ObfuscatedName("ac")
   static classCB[] method1397() {
      return new classCB[]{field646, field641, field642, field640, field644, field643, field639, field645, field638};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcb;")
   @ObfuscatedName("as")
   static classCB[] method1398() {
      return new classCB[]{field646, field641, field642, field640, field644, field643, field639, field645, field638};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return 350850931 * this.field647;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcb;")
   @ObfuscatedName("ax")
   static classCB[] method1399() {
      return new classCB[]{field646, field641, field642, field640, field644, field643, field639, field645, field638};
   }

   classCB(int var1, int var2) {
      this.field648 = -191909887 * var1;
      this.field647 = var2 * -220254789;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lcb;")
   @ObfuscatedName("aa")
   static classCB[] method1400() {
      return new classCB[]{field646, field641, field642, field640, field644, field643, field639, field645, field638};
   }

   @ObfuscatedSignature(descriptor = "(Ldz;I)V")
   @ObfuscatedName("dy")
   static void method1402(WorldView var0, int var1) {
      int var2 = classOE.client.method2424();
      if (!client.$assertionsDisabled && var2 != 25 && var2 != 30) {
         throw new AssertionError();
      } else if (!client.$assertionsDisabled && !client.field805) {
         throw new AssertionError();
      } else if (client.field1124 != null) {
         if (client.field1124.method10095()) {
            rl4 var4 = client.field1124;
            client.field1124 = null;
            client.field1143 = false;
            client.method2350(var4);
            client.field805 = false;
            classDA.field1366 = null;
         }
      } else {
         rl4 var3 = new rl4(client.field1118, 0, var0, client.field1006);
         var0.field1714 = var3.field5772.field6885;
         var0.field1712 = var3.field5772.field6884;
         var0.field1713 = var3.field5772.field6887;
         if (!client.$assertionsDisabled && classCQ.field1220 != var0) {
            throw new AssertionError();
         } else {
            var3.field5788 = classCQ.field1220.field1710 * -483624883;
            if (!client.$assertionsDisabled && classDA.field1366 != var0) {
               throw new AssertionError();
            } else if (!client.$assertionsDisabled && client.field1143) {
               throw new AssertionError();
            } else {
               client.field1143 = true;
               if (!client.$assertionsDisabled && client.field1124 != null) {
                  throw new AssertionError();
               } else {
                  client.field1124 = var3;
                  var3.method10102();
               }
            }
         }
      }
   }
}
