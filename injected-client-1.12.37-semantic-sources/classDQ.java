import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dq")
final class classDQ implements classLM {
   @ObfuscatedName("ab")
   public static String field1604;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field1601 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field1602 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field1600 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field1603 = 36;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod147(int var1) {
      try {
         if (this.val$item.method7294(939136870).field4427 != null) {
            if (var1 >= -1750661258) {
               throw new IllegalStateException();
            }

            ScriptEvent var2 = classZS.method14182(
               classUQ.method11465(this.val$item, 1964705240).method14145(this.val$item.method7294(-450775735).field4427, (byte)2), (byte)65
            );
            client.field823.method9658(var2, 1697206599);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod151() {
      if (this.val$item.method7294(-191908874).field4427 != null) {
         ScriptEvent var1 = classZS.method14182(
            classUQ.method11465(this.val$item, 2136518866).method14145(this.val$item.method7294(1128949515).field4427, (byte)2), (byte)62
         );
         client.field823.method9658(var1, 1697206599);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   @Override
   public void vmethod148() {
      if (this.val$item.method7294(1442863420).field4427 != null) {
         ScriptEvent var1 = classZS.method14182(
            classUQ.method11465(this.val$item, 169726857).method14145(this.val$item.method7294(580253534).field4427, (byte)2), (byte)2
         );
         client.field823.method9658(var1, 1697206599);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod149() {
      if (this.val$item.method7294(-43080985).field4427 != null) {
         ScriptEvent var1 = classZS.method14182(
            classUQ.method11465(this.val$item, 2074542754).method14145(this.val$item.method7294(1047276279).field4427, (byte)2), (byte)87
         );
         client.field823.method9658(var1, 1697206599);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   @Override
   public void vmethod150() {
      if (this.val$item.method7294(-1358463930).field4427 != null) {
         ScriptEvent var1 = classZS.method14182(
            classUQ.method11465(this.val$item, 659724188).method14145(this.val$item.method7294(65186911).field4427, (byte)2), (byte)27
         );
         client.field823.method9658(var1, 1697206599);
      }
   }

   classDQ(Widget var1) {
      this.val$item = var1;
   }
}
