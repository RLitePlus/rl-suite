import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wf")
final class classWF implements classWK {
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lxa;)V")
   @ObfuscatedName("ap")
   void method11698(String var1, Buffer var2) {
      var2.writeStringCp1252NullTerminated(var1, 998990159);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/Object;")
   @ObfuscatedName("aj")
   @Override
   public Object vmethod442(Buffer var1) {
      return var1.readStringCp1252NullCircumfixed(-1447896232);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;I)V")
   @ObfuscatedName("av")
   @Override
   public void vmethod447(Object var1, Buffer var2, int var3) {
      try {
         method11699(this, (String)var1, var2, 124046343);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wf.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod444(Object var1, Buffer var2) {
      method11699(this, (String)var1, var2, -2128570937);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)Z")
   @ObfuscatedName("bv")
   public static boolean method11702(World var0) {
      if (var0 == null) {
         var0.method897();
      }

      return (class594.field6429.rsOrdinal((byte)17) & -607869593 * var0.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("an")
   @Override
   public void vmethod445(Object var1, Buffer var2) {
      method11699(this, (String)var1, var2, -206287850);
   }

   @ObfuscatedSignature(descriptor = "(Lwf;Ljava/lang/String;Lxa;I)V")
   @ObfuscatedName("ym")
   public static void method11699(classWF var0, String var1, Buffer var2, int var3) {
      if (var0 == null) {
         var0.method11701(var1, var2, var3);
      } else {
         try {
            var2.writeStringCp1252NullTerminated(var1, 998990159);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "wf.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod446(Object var1, Buffer var2) {
      method11699(this, (String)var1, var2, -1197320776);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)Ljava/lang/Object;")
   @ObfuscatedName("at")
   @Override
   public Object vmethod443(Buffer var1, byte var2) {
      try {
         return var1.readStringCp1252NullCircumfixed(960675419);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "wf.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lxa;)V")
   @ObfuscatedName("aw")
   void method11700(String var1, Buffer var2) {
      var2.writeStringCp1252NullTerminated(var1, 998990159);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lxa;I)V")
   @ObfuscatedName("ak")
   void method11701(String var1, Buffer var2, int var3) {
      try {
         var2.writeStringCp1252NullTerminated(var1, 998990159);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wf.ak(" + ')');
      }
   }
}
