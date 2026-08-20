import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xy")
public class PrivateChatMode {
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("av")
   static final PrivateChatMode field6651 = new PrivateChatMode(0);
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("at")
   public static final PrivateChatMode field6653 = new PrivateChatMode(1);
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("ag")
   static final PrivateChatMode field6652 = new PrivateChatMode(2);
   @ObfuscatedName("an")
   public final int field6650;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lxy;")
   @ObfuscatedName("aj")
   public static PrivateChatMode method12747(int var0) {
      PrivateChatMode[] var1 = class33.method654(637943659);

      for (int var2 = 0; var2 < var1.length; var2++) {
         PrivateChatMode var3 = var1[var2];
         if (-1408231813 * var3.field6650 == var0) {
            return var3;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lxy;")
   @ObfuscatedName("an")
   static PrivateChatMode[] method12745() {
      return new PrivateChatMode[]{field6651, field6652, field6653};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lxy;")
   @ObfuscatedName("ag")
   static PrivateChatMode[] method12746() {
      return new PrivateChatMode[]{field6651, field6652, field6653};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lxy;")
   @ObfuscatedName("ae")
   public static PrivateChatMode method12748(int var0) {
      PrivateChatMode[] var1 = class33.method654(1061232147);

      for (int var2 = 0; var2 < var1.length; var2++) {
         PrivateChatMode var3 = var1[var2];
         if (-1408231813 * var3.field6650 == var0) {
            return var3;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Z)V")
   @ObfuscatedName("xi")
   public static void method12750(classOO var0, boolean var1) {
      if (var0 == null) {
         var0.method8374(var1);
      }

      var0.method8619(0, var1, (short)512);
   }

   PrivateChatMode(int var1) {
      this.field6650 = var1 * -1087219533;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lxy;")
   @ObfuscatedName("ak")
   public static PrivateChatMode method12749(int var0) {
      PrivateChatMode[] var1 = class33.method654(229612443);

      for (int var2 = 0; var2 < var1.length; var2++) {
         PrivateChatMode var3 = var1[var2];
         if (-1408231813 * var3.field6650 == var0) {
            return var3;
         }
      }

      return null;
   }
}
