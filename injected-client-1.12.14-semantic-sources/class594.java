import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wp")
public class class594 implements Enum {
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("bk")
   static final class594 field6424 = new class594(Integer.MIN_VALUE);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("at")
   public static final class594 field6437 = new class594(2);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ar")
   static final class594 field6408 = new class594(262144);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("an")
   public static final class594 field6428 = new class594(8);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ak")
   static final class594 field6419 = new class594(64, true);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ao")
   static final class594 field6432 = new class594(8388608);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("al")
   static final class594 field6426 = new class594(1048576);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("aw")
   static final class594 field6413 = new class594(128);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("av")
   public static final class594 field6406 = new class594(1);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ay")
   static final class594 field6415 = new class594(512);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("az")
   public static final class594 field6417 = new class594(2048);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("am")
   static final class594 field6431 = new class594(4194304);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ad")
   static final class594 field6412 = new class594(4096);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("aj")
   static final class594 field6411 = new class594(32);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("as")
   static final class594 field6420 = new class594(16384);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ac")
   static final class594 field6421 = new class594(32768);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ab")
   public static final class594 field6422 = new class594(65536);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ax")
   static final class594 field6423 = new class594(131072);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ai")
   static final class594 field6407 = new class594(8192);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ag")
   public static final class594 field6429 = new class594(4);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ap")
   public static final class594 field6433 = new class594(256, true);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("af")
   static final class594 field6427 = new class594(2097152);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("be")
   static final class594 field6418 = new class594(67108864, true);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("bo")
   public static final class594 field6436 = new class594(134217728);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("aa")
   static final class594 field6430 = new class594(16777216);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("aq")
   public static final class594 field6414 = new class594(33554432);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("au")
   public static final class594 field6416 = new class594(1024);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ae")
   static final class594 field6410 = new class594(16);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("bg")
   static final class594 field6434 = new class594(268435456);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("bs")
   public static final class594 field6435 = new class594(536870912, true);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("bz")
   public static final class594 field6409 = new class594(1073741824, true);
   @ObfuscatedSignature(descriptor = "Lwp;")
   @ObfuscatedName("ah")
   static final class594 field6425 = new class594(524288);
   @ObfuscatedName("bb")
   final int field6438;

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 1127905661 * this.field6438;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wp.av(" + 41);
      }
   }

   class594(int var1) {
      this(var1, false);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwf;Ljava/lang/String;Lxa;)V")
   @ObfuscatedName("pm")
   public static void method11828(classWF var0, String var1, Buffer var2) {
      if (var0 == null) {
         var0.method11700(var1, var2);
      }

      var2.writeStringCp1252NullTerminated(var1, 998990159);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return 1127905661 * this.field6438;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return 1127905661 * this.field6438;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;)I")
   @ObfuscatedName("bu")
   public static int method11829(ObjectSound var0) {
      return var0.x * 1915964479;
   }

   class594(int var1, boolean var2) {
      this.field6438 = 1978173397 * var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Ljava/awt/datatransfer/Clipboard;)V")
   @ObfuscatedName("iv")
   public static void method11830(classOO var0, Clipboard var1) {
      if (var0 == null) {
         var0.method8594();
      }

      Transferable var2 = var1.getContents(null);
      if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var3 = classOO.method8601(var0, (String)var2.getTransferData(DataFlavor.stringFlavor), (byte)89);
            var0.method8441(396291359);
            classSC var4 = classSF.method10163(var0.field4654, var3, var0.field4661 * -178140633, -83833642 * var0.field4657, -630362159);
            classOO.method8450(var0, var4.method10072((byte)-52), var4.method10072((byte)0), 791442111);
            classOO.method8615(var0, (byte)10);
            classOO.method8636(var0, (byte)4);
         } catch (Exception var5) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 1127905661 * this.field6438;
   }
}
