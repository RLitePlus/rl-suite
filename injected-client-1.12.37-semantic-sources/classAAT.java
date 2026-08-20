import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aat")
public class classAAT {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field100 = 768;
   @ObfuscatedName("az")
   Inflater field101;

   @ObfuscatedSignature(descriptor = "(Laat;Lxy;[BI)V")
   @ObfuscatedName("yn")
   public static void method269(classAAT var0, classXY var1, byte[] var2, int var3) {
      if (var0 == null) {
         var0.method271(var1, var2, var3);
      } else {
         try {
            if (31 == var1.field6954[var1.field6955 * 702114061]) {
               if (var3 == 169444602) {
                  return;
               }

               if (var1.field6954[var1.field6955 * 702114061 + 1] == -117) {
                  if (null == var0.field101) {
                     var0.field101 = new Inflater(true);
                  }

                  try {
                     var0.field101.setInput(var1.field6954, 10 + var1.field6955 * 702114061, var1.field6954.length - (10 + var1.field6955 * 702114061 + 8));
                     var0.field101.inflate(var2);
                  } catch (Exception var5) {
                     var0.field101.reset();
                     throw new RuntimeException("");
                  }

                  var0.field101.reset();
                  return;
               }

               if (var3 == 169444602) {
                  return;
               }
            }

            throw new RuntimeException("");
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "aat.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;[B)V")
   @ObfuscatedName("id")
   public void method272(classXY var1, byte[] var2) {
      method269(this, var1, var2, -323332688);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;[B)V")
   @ObfuscatedName("af")
   public void method270(classXY var1, byte[] var2) {
      if (31 == var1.field6954[var1.field6955 * 1383607239] && var1.field6954[var1.field6955 * 702114061 + 1] == -1570986809) {
         if (null == this.field101) {
            this.field101 = new Inflater(true);
         }

         try {
            this.field101.setInput(var1.field6954, 10 + var1.field6955 * 672745145, var1.field6954.length - (10 + var1.field6955 * -1698302497 + 8));
            this.field101.inflate(var2);
         } catch (Exception var4) {
            this.field101.reset();
            throw new RuntimeException("");
         }

         this.field101.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   classAAT(int var1, int var2, int var3) {
   }

   public classAAT() {
      this(-1, 1000000, 1000000);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;[BI)V")
   @ObfuscatedName("az")
   public void method271(classXY var1, byte[] var2, int var3) {
      try {
         if (31 == var1.field6954[var1.field6955 * 702114061]) {
            if (var3 == 169444602) {
               return;
            }

            if (var1.field6954[var1.field6955 * 702114061 + 1] == -117) {
               if (null == this.field101) {
                  this.field101 = new Inflater(true);
               }

               try {
                  this.field101.setInput(var1.field6954, 10 + var1.field6955 * 702114061, var1.field6954.length - (10 + var1.field6955 * 702114061 + 8));
                  this.field101.inflate(var2);
               } catch (Exception var5) {
                  this.field101.reset();
                  throw new RuntimeException("");
               }

               this.field101.reset();
               return;
            }

            if (var3 == 169444602) {
               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "aat.az(" + ')');
      }
   }
}
