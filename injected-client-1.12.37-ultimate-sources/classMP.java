import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mp")
public class classMP extends classMD {
   @ObfuscatedName("az")
   String field4551;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4552 = 1024;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ley;)Ljava/lang/String;")
   @ObfuscatedName("ql")
   public static String method7639(classEY var0) {
      if (var0 == null) {
         var0.method4107();
      }

      return var0.field1981.toString();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ax")
   @Override
   public String vmethod520() {
      return this.field4551;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;)Z")
   @ObfuscatedName("ng")
   public static boolean method7638(classQC var0) {
      if (var0 == null) {
         var0.getSupportedProtocols();
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod525(int var1) {
      try {
         return 1;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mp.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ac")
   @Override
   public String vmethod521() {
      return this.field4551;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod526() {
      return 1;
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIS)V")
   @ObfuscatedName("az")
   static void method7637(classLW var0, int var1, int var2, short var3) {
      try {
         if (var0.field4264 * 404669979 == 0) {
            if (var3 == 2048) {
               throw new IllegalStateException();
            }

            var0.field4281 = var0.field4248 * 1865716123;
            var0.method7310(-1);
         } else if (1 == var0.field4264 * 404669979) {
            if (var3 == 2048) {
               throw new IllegalStateException();
            }

            var0.field4281 = ((var1 - 1115597881 * var0.field4249) / 2 + 975005911 * var0.field4248) * 2084925661;
            var0.method7310(-1);
         } else if (var0.field4264 * 404669979 == 2) {
            if (var3 == 2048) {
               throw new IllegalStateException();
            }

            var0.field4281 = (var1 - var0.field4249 * 1115597881 - var0.field4248 * 975005911) * 2084925661;
            var0.method7310(-1);
         } else if (404669979 * var0.field4264 == 3) {
            var0.field4281 = 2084925661 * (var1 * var0.field4248 * 975005911 >> 14);
            var0.method7310(-1);
         } else if (4 == var0.field4264 * 404669979) {
            var0.field4281 = 2084925661 * ((var1 - 1115597881 * var0.field4249) / 2 + (var0.field4248 * 975005911 * var1 >> 14));
            var0.method7310(-1);
         } else {
            var0.field4281 = (var1 - var0.field4249 * 1115597881 - (var1 * var0.field4248 * 975005911 >> 14)) * 2084925661;
            var0.method7310(-1);
         }

         if (0 == var0.field4250 * 923944517) {
            if (var3 == 2048) {
               return;
            }

            var0.field4257 = -160021231 * var0.field4285;
            var0.method7315(-1);
         } else if (923944517 * var0.field4250 == 1) {
            var0.field4257 = ((var2 - 293773697 * var0.field4259) / 2 + var0.field4285 * -265516179) * -217131595;
            var0.method7315(-1);
         } else if (2 == var0.field4250 * 923944517) {
            if (var3 == 2048) {
               throw new IllegalStateException();
            }

            var0.field4257 = (var2 - 293773697 * var0.field4259 - -265516179 * var0.field4285) * -217131595;
            var0.method7315(-1);
         } else if (3 == var0.field4250 * 923944517) {
            var0.field4257 = (var2 * -265516179 * var0.field4285 >> 14) * -217131595;
            var0.method7315(-1);
         } else if (4 == var0.field4250 * 923944517) {
            if (var3 == 2048) {
               throw new IllegalStateException();
            }

            var0.field4257 = -217131595 * ((var2 * var0.field4285 * -265516179 >> 14) + (var2 - var0.field4259 * 293773697) / 2);
            var0.method7315(-1);
         } else {
            var0.field4257 = (var2 - var0.field4259 * 293773697 - (var2 * -265516179 * var0.field4285 >> 14)) * -217131595;
            var0.method7315(-1);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mp.az(" + ')');
      }
   }

   classMP(classMS var1, String var2, String var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field4551 = var3;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("as")
   @Override
   public String vmethod519(int var1) {
      try {
         return this.field4551;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mp.as(" + ')');
      }
   }
}
