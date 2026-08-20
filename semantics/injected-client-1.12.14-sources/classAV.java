import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("av")
public class classAV implements classAN {
   @ObfuscatedSignature(descriptor = "(Lxa;)Lxa;")
   @ObfuscatedName("ag")
   @Override
   public Buffer vmethod36(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method282(var1, var2);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Lxa;")
   @ObfuscatedName("an")
   @Override
   public Buffer vmethod35(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method282(var1, var2);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lxa;)V")
   @ObfuscatedName("at")
   void method282(Buffer var1, Buffer var2) {
      classAP var3 = new classAP(var1);
      classAJ var4 = new classAJ(var3);
      long var5 = 0L;

      while (!var4.method111(var3.method162(), classAP.method157(var3), var5)) {
         var5++;
      }

      var2.writeLongMedium(var5);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Lxa;")
   @ObfuscatedName("av")
   @Override
   public Buffer vmethod37(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method282(var1, var2);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lxa;)V")
   @ObfuscatedName("aj")
   void method283(Buffer var1, Buffer var2) {
      classAP var3 = new classAP(var1);
      classAJ var4 = new classAJ(var3);
      long var5 = 0L;

      while (!var4.method111(var3.method162(), classAP.method157(var3), var5)) {
         var5++;
      }

      var2.writeLongMedium(var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lav;Lxa;Lxa;)V")
   @ObfuscatedName("ud")
   public static void method284(classAV var0, Buffer var1, Buffer var2) {
      if (var0 == null) {
         var0.method282(var1, var1);
      } else {
         classAP var3 = new classAP(var1);
         classAJ var4 = new classAJ(var3);
         long var5 = 0L;

         while (!var4.method111(var3.method162(), classAP.method157(var3), var5)) {
            var5++;
         }

         var2.writeLongMedium(var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lxa;)V")
   @ObfuscatedName("ae")
   void method285(Buffer var1, Buffer var2) {
      classAP var3 = new classAP(var1);
      classAJ var4 = new classAJ(var3);
      long var5 = 0L;

      while (!var4.method111(var3.method162(), classAP.method157(var3), var5)) {
         var5++;
      }

      var2.writeLongMedium(var5);
   }
}
