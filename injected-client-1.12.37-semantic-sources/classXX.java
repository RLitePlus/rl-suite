import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xx")
final class classXX implements classXF {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6951 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6953 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6952 = 2;

   @ObfuscatedSignature(descriptor = "(B)Lxt;")
   @ObfuscatedName("az")
   @Override
   public classXT vmethod648(byte var1) {
      try {
         return classXT.field6937;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("af")
   @Override
   public classXT vmethod647() {
      return classXT.field6937;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laag;)Z")
   @ObfuscatedName("nh")
   public static boolean method12953(classAAG var0) {
      return var0.field50 * -1797594471 == var0.field52 * 809569409;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIII)Lcd;")
   @ObfuscatedName("ds")
   static final classCD method12954(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         for (classCD var6 = (classCD)var0.field1690.method7915(); var6 != null; var6 = (classCD)classNN.method7924(var0.field1690)) {
            if (var5 <= -1031526441) {
               throw new IllegalStateException();
            }

            if (-1436432311 * var6.field679 == var1) {
               if (var5 <= -1031526441) {
                  throw new IllegalStateException();
               }

               if (var6.field676 * -1779660971 == var2 && var6.field680 * -522576623 == var3) {
                  if (var5 <= -1031526441) {
                     throw new IllegalStateException();
                  }

                  if (2125153617 * var6.field678 == var4) {
                     if (var5 <= -1031526441) {
                        throw new IllegalStateException();
                     }

                     return var6;
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "xx.ds(" + ')');
      }
   }
}
