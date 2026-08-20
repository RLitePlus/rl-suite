import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zb")
final class classZB implements classYH {
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field7146 = 200;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7145 = 1;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;I)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod656(Object var1, Buffer var2, int var3) {
      try {
         method13825(this, (String)var1, var2, 601017928);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "zb.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lxy;)V")
   @ObfuscatedName("as")
   void method13822(String var1, Buffer var2) {
      Buffer.method12997(var2, var1, (short)21261);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)Ljava/lang/Object;")
   @ObfuscatedName("af")
   @Override
   public Object vmethod653(Buffer var1, byte var2) {
      try {
         return var1.method13071(793584546);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zb.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ax")
   @Override
   public Object vmethod654(Buffer var1) {
      return var1.method13071(-413073463);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   @Override
   public Object vmethod655(Buffer var1) {
      return var1.method13071(1201931987);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lxy;)V")
   @ObfuscatedName("ao")
   void method13823(String var1, Buffer var2) {
      Buffer.method12997(var2, var1, (short)9466);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lxy;)V")
   @ObfuscatedName("ab")
   void method13824(String var1, Buffer var2) {
      Buffer.method12997(var2, var1, (short)23706);
   }

   @ObfuscatedSignature(descriptor = "(Lzb;Ljava/lang/String;Lxy;I)V")
   @ObfuscatedName("sm")
   public static void method13825(classZB var0, String var1, Buffer var2, int var3) {
      if (var0 == null) {
         var0.method13827(var1, var2, var3);
      } else {
         try {
            Buffer.method12997(var2, var1, (short)2569);
         } catch (RuntimeException var4) {
            throw classEG.newRunException(var4, "zb.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod657(Object var1, Buffer var2) {
      method13825(this, (String)var1, var2, 601017928);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lxy;)V")
   @ObfuscatedName("ag")
   void method13826(String var1, Buffer var2) {
      Buffer.method12997(var2, var1, (short)13128);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lxy;I)V")
   @ObfuscatedName("az")
   void method13827(String var1, Buffer var2, int var3) {
      try {
         Buffer.method12997(var2, var1, (short)2569);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "zb.az(" + ')');
      }
   }
}
