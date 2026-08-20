import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qb")
public class classQB {
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5514 = 6;
   @ObfuscatedSignature(descriptor = "Lqb;")
   @ObfuscatedName("af")
   static final classQB field5512 = new classQB("Bearer");
   @ObfuscatedName("ae")
   final String field5513;
   @ObfuscatedSignature(descriptor = "Lqb;")
   @ObfuscatedName("az")
   static final classQB field5511 = new classQB("Basic");

   @ObfuscatedSignature(descriptor = "(ILcl;I)Ldz;")
   @ObfuscatedName("ae")
   public static classDZ method9434(int var0, classCL var1, int var2) {
      try {
         for (classDZ var4 : var1) {
            classCT var5 = (classCT)var4.field1694.method13404(var0);
            if (null != var5 && !var4.method3719(-2087374717)) {
               if (var2 == -431797757) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return classCL.method1592(var1, -1275085187);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "qb.ae(" + ')');
      }
   }

   classQB(String var1) {
      this.field5513 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ab")
   String method9431() {
      return this.field5513;
   }

   @ObfuscatedSignature(descriptor = "(Lqb;I)Ljava/lang/String;")
   @ObfuscatedName("tg")
   public static String method9432(classQB var0, int var1) {
      if (var0 == null) {
         var0.method9433(var1);
      }

      try {
         return var0.field5513;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qb.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("az")
   String method9433(int var1) {
      try {
         return this.field5513;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qb.az(" + ')');
      }
   }
}
