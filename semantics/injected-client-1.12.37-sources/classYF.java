import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yf")
final class classYF implements classYH {
   @ObfuscatedSignature(descriptor = "(Lxy;B)Ljava/lang/Object;")
   @ObfuscatedName("af")
   @Override
   public Object vmethod653(Buffer var1, byte var2) {
      try {
         return var1.method13059(1472908214);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "yf.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;I)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod656(Object var1, Buffer var2, int var3) {
      try {
         method13327(this, (Long)var1, var2, 1948608740);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "yf.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lyf;Ljava/lang/Long;Lxy;I)V")
   @ObfuscatedName("vm")
   public static void method13327(classYF var0, Long var1, Buffer var2, int var3) {
      if (var0 == null) {
         var0.method13330(var1, var2, var3);
      }

      try {
         var2.method12987(var1);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "yf.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Long;Lxy;)V")
   @ObfuscatedName("ag")
   void method13328(Long var1, Buffer var2) {
      var2.method12987(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ax")
   @Override
   public Object vmethod654(Buffer var1) {
      return var1.method13059(-1125198728);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   @Override
   public Object vmethod655(Buffer var1) {
      return var1.method13059(-630621740);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyf;Ljava/lang/Long;Lxy;)V")
   @ObfuscatedName("lm")
   public static void method13329(classYF var0, Long var1, Buffer var2) {
      if (var0 == null) {
         var0.vmethod655(var2);
      }

      var2.method12987(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod657(Object var1, Buffer var2) {
      method13327(this, (Long)var1, var2, 1948608740);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Long;Lxy;I)V")
   @ObfuscatedName("az")
   void method13330(Long var1, Buffer var2, int var3) {
      try {
         var2.method12981(var1);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "yf.az(" + ')');
      }
   }
}
