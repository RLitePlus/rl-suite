import java.awt.event.MouseEvent;
import java.io.File;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sl")
class classSL implements Callable {
   @ObfuscatedName("ai")
   static File field5975;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5974 = 3;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltz;Ljava/awt/event/MouseEvent;)I")
   @ObfuscatedName("uf")
   public static int method10469(MouseHandler var0, MouseEvent var1) {
      if (var0 == null) {
         var0.method11226(var1);
      }

      int var2 = var1.getButton();
      if (var1.isAltDown() || 2 == var2) {
         return 4;
      } else {
         return !var1.isMetaDown() && 3 != var2 ? 1 : 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;S)Ljava/lang/String;")
   @ObfuscatedName("ai")
   public static String method10470(CharSequence var0, short var1) {
      try {
         return classJC.method6352('*', var0.length(), 749532022);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "sl.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsk;)I")
   @ObfuscatedName("re")
   public static int method10466(classSK var0) {
      return -78036789 * var0.field5965;
   }

   @Override
   public Object call() {
      try {
         this.this$0.method10514(this.val$p, this.val$version, -999443308);
         return null;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "sl.call(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("az")
   public Object method10467() {
      this.this$0.method10514(this.val$p, this.val$version, -1634561626);
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("af")
   public Object method10468() {
      this.this$0.method10514(this.val$p, this.val$version, -1151485226);
      return null;
   }

   classSL(classSN var1, Buffer var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   @ObfuscatedSignature(descriptor = "(I)Lsj;")
   @ObfuscatedName("el")
   static classSJ method10471(int var0) {
      try {
         return client.field837.method2996(-2130951373 * client.field845, -1741491392);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "sl.el(" + ')');
      }
   }
}
