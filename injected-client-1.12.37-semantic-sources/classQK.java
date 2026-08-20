import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qk")
public class classQK implements Callable {
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("az")
   final classQA field5557;

   @ObfuscatedSignature(descriptor = "(Lxy;BIB)I")
   @ObfuscatedName("af")
   public static int method9604(classXY var0, byte var1, int var2, byte var3) {
      try {
         int var4 = var1 >> var2 & 3;
         if (var4 == 3) {
            if (var3 <= 7) {
               throw new IllegalStateException();
            } else {
               return var0.method13056((byte)1);
            }
         } else if (2 == var4) {
            if (var3 <= 7) {
               throw new IllegalStateException();
            } else {
               return var0.method13050((byte)16);
            }
         } else if (1 == var4) {
            if (var3 <= 7) {
               throw new IllegalStateException();
            } else {
               return classXY.method13043(var0, (byte)17);
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "qk.af(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lff;[I[FIIIIF)V")
   @ObfuscatedName("or")
   public static void method9607(classFF var0, int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      int var8 = var0.field2377[var4];
      var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
      int var9 = var1[var3];
      var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var10 = var0.field2378.field2210 & classFF.method4630(var2[var3], var7);
      var1[var3] = (var10 & var8) + (~var10 & var9);
   }

   @Override
   public Object call() throws Exception {
      try {
         try {
            while (this.field5557.method9423(819117750)) {
               Friend.method10149(10L);
            }
         } catch (IOException var2) {
            return new classQG("Error servicing REST query: " + var2.getMessage());
         }

         return this.field5557.method9427((byte)47);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qk.call(" + ')');
      }
   }

   classQK(classQD var1, classQA var2) {
      this.this$0 = var1;
      this.field5557 = var2;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("az")
   public Object method9605() throws Exception {
      try {
         while (this.field5557.method9423(-1143283457)) {
            Friend.method10149(10L);
         }
      } catch (IOException var2) {
         return new classQG("Error servicing REST query: " + var2.getMessage());
      }

      return this.field5557.method9427((byte)95);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loi;)Lkw;")
   @ObfuscatedName("dq")
   public static classKW method9608(WorldEntityConfig var0) {
      return var0 == null ? var0.method8489() : var0.field4886;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("af")
   public Object method9606() throws Exception {
      try {
         while (this.field5557.method9423(1333093394)) {
            Friend.method10149(10L);
         }
      } catch (IOException var2) {
         return new classQG("Error servicing REST query: " + var2.getMessage());
      }

      return this.field5557.method9427((byte)-3);
   }
}
