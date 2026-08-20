import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xn")
public class class604 implements Enum {
   @ObfuscatedName("aw")
   final int field6593;
   @ObfuscatedSignature(descriptor = "Lxn;")
   @ObfuscatedName("at")
   public static final class604 field6589 = new class604(2, 2);
   @ObfuscatedSignature(descriptor = "Lxn;")
   @ObfuscatedName("ag")
   static final class604 field6592 = new class604(5, 5);
   @ObfuscatedSignature(descriptor = "Lxn;")
   @ObfuscatedName("an")
   static final class604 field6590 = new class604(1, 6);
   @ObfuscatedName("ak")
   final int field6594;
   @ObfuscatedSignature(descriptor = "Lxn;")
   @ObfuscatedName("aj")
   static final class604 field6591 = new class604(4, 8);
   @ObfuscatedSignature(descriptor = "Lxn;")
   @ObfuscatedName("av")
   public static final class604 field6587 = new class604(3, 0);
   @ObfuscatedSignature(descriptor = "Lxn;")
   @ObfuscatedName("ae")
   static final class604 field6588 = new class604(0, 7);

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field6593 * -2098599481;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xn.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxk;B)V")
   @ObfuscatedName("uu")
   public static void method12442(Menu var0, byte var1) {
      if (var0 == null) {
         var0.method12393(var1);
      }

      var0.method12401(null);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ak")
   public boolean method12438() {
      return field6589 == this;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aw")
   public boolean method12439() {
      return field6589 == this;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field6593 * -1897630583;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field6593 * -1088391311;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field6593 * -2098599481;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ae")
   public boolean method12440(byte var1) {
      try {
         return field6589 == this;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xn.ae(" + ')');
      }
   }

   class604(int var1, int var2) {
      this.field6594 = var1 * 1242669667;
      this.field6593 = -1245902857 * var2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   public boolean method12441() {
      return field6589 == this;
   }
}
