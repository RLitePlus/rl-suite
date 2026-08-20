import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("az")
public class classAZ implements classAE {
   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("as")
   @Override
   public Buffer vmethod22(Buffer var1) {
      Buffer var2 = new Buffer(-250087846);
      this.method744(var1, var2);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("az")
   @Override
   public Buffer vmethod20(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method744(var1, var2);
      return var2;
   }

   classAZ() {
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("ag")
   @Override
   public Buffer vmethod21(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method744(var1, var2);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("ab")
   @Override
   public Buffer vmethod18(Buffer var1) {
      Buffer var2 = new Buffer(100);
      this.method744(var1, var2);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Lxy;")
   @ObfuscatedName("ae")
   @Override
   public Buffer vmethod19(Buffer var1) {
      Buffer var2 = new Buffer(1279964818);
      this.method744(var1, var2);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpr;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ng")
   public static String method748(classPR var0, int var1, String var2) {
      if (var0 == null) {
         var0.getParams();
      }

      return classFS.method4977(var0.field5387, var1, var2, (byte)99);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Lxy;)V")
   @ObfuscatedName("af")
   void method744(Buffer var1, Buffer var2) {
      classAA var3 = new classAA(var1);
      classAG var4 = new classAG(var3);
      long var5 = 0L;

      while (!var4.method355(var3.method2(), var3.method0(), var5)) {
         var5++;
      }

      var2.method12987(var5);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Lxy;)V")
   @ObfuscatedName("ax")
   void method745(Buffer var1, Buffer var2) {
      classAA var3 = new classAA(var1);
      classAG var4 = new classAG(var3);
      long var5 = 0L;

      while (!var4.method355(var3.method2(), var3.method0(), var5)) {
         var5++;
      }

      var2.method12987(var5);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Lxy;)V")
   @ObfuscatedName("ac")
   void method746(Buffer var1, Buffer var2) {
      classAA var3 = new classAA(var1);
      classAG var4 = new classAG(var3);
      long var5 = 0L;

      while (!var4.method355(var3.method2(), var3.method0(), var5)) {
         var5++;
      }

      var2.method12987(var5);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Lxy;)V")
   @ObfuscatedName("aa")
   void method747(Buffer var1, Buffer var2) {
      classAA var3 = new classAA(var1);
      classAG var4 = new classAG(var3);
      long var5 = 0L;

      while (!var4.method355(var3.method2(), var3.method0(), var5)) {
         var5++;
      }

      var2.method12987(var5);
   }
}
