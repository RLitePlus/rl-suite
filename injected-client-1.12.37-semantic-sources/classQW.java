import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qw")
public final class classQW {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5619 = 1;
   @ObfuscatedName("af")
   final String field5618;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5621 = Integer.MAX_VALUE;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5620 = 10;
   @ObfuscatedName("az")
   final String field5617;
   @ObfuscatedName("gm")
   static String field5622;

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("af")
   String method9832(long var1) {
      try {
         return var1 == 1L ? this.field5617 : this.field5618;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qw.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;Lct;)V")
   @ObfuscatedName("uf")
   public static void method9831(classDC var0, Player var1) {
      var0.field1389.remove(var1);
   }

   @ObfuscatedSignature(descriptor = "(III)Lbl;")
   @ObfuscatedName("ae")
   static Script method9830(int var0, int var1, int var2) {
      try {
         Script var3 = (Script)Script.field491.method6422(var0 << 16);
         if (null != var3) {
            return var3;
         } else {
            String var4 = String.valueOf(var0);
            int var5 = classWN.field6759.method11848(var4, -534958479);
            if (var5 == -1) {
               if (var2 >= -1007302143) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               byte[] var6 = AbstractArchive.method11814(classWN.field6759, var5, 1297268776);
               if (null != var6) {
                  if (var2 >= -1007302143) {
                     throw new IllegalStateException();
                  }

                  if (var6.length <= 1) {
                     if (var2 >= -1007302143) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  var3 = Widget.method7156(var6, -1504310355);
                  if (var3 != null) {
                     Script.field491.method6428(var3, var0 << 16);
                     return var3;
                  }
               }

               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "qw.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Les;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ay")
   public static int method9828(classES var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.compare(var1, var1);
      }

      return classES.method4072(var0, (Buddy)var1, (Buddy)var2, -834814643);
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ab")
   String method9833(long var1) {
      return var1 == 1L ? this.field5617 : this.field5618;
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("az")
   String method9834(long var1) {
      return var1 == 1L ? this.field5617 : this.field5618;
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ae")
   String method9835(long var1) {
      return var1 == 1L ? this.field5617 : this.field5618;
   }

   classQW(String var1, String var2) {
      this.field5617 = var1;
      this.field5618 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   static boolean method9829(int var0) {
      try {
         boolean var10000;
         if (null != classCE.field714) {
            if (var0 <= -1666094862) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qw.ae(" + ')');
      }
   }
}
