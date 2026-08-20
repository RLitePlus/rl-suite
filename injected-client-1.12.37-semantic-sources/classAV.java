import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("av")
public class classAV implements Runnable {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field289 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   public static final int field292 = 48;
   @ObfuscatedSignature(descriptor = "[Lak;")
   @ObfuscatedName("az")
   public volatile classAK[] field287 = new classAK[2];
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field291 = 11;
   @ObfuscatedSignature(descriptor = "Lda;")
   @ObfuscatedName("jz")
   static classDA field294;
   @ToRemove(unused = "true")
   @ObfuscatedName("dd")
   public static final int field293 = 101;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field288 = 1;
   @ObfuscatedName("ag")
   public static int field290;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lav;)V")
   @ObfuscatedName("pj")
   public static void method716(classAV var0) {
      if (var0 == null) {
         var0.method719();
      } else {
         try {
            for (int var1 = 0; var1 < 2; var1++) {
               classAK var2 = var0.field287[var1];
               if (null != var2) {
                  var2.method408((byte)-23);
               }
            }
         } catch (Exception var3) {
            classAAU.method275(null, var3, (byte)11);
         }
      }
   }

   @Override
   public void run() {
      this.method722();

      try {
         try {
            for (int var1 = 0; var1 < 2; var1++) {
               classAK var2 = this.field287[var1];
               if (null != var2) {
                  var2.method408((byte)-124);
               }
            }
         } catch (Exception var3) {
            classAAU.method275(null, var3, (byte)102);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "av.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lul;")
   @ObfuscatedName("az")
   public static classUL method720(byte var0) {
      try {
         synchronized (classUL.field6323) {
            if (0 == classUL.field6321 * 1171203923) {
               return new classUL();
            } else {
               classUL.method11377(classUL.field6323[(classUL.field6321 -= -1712212773) * 1171203923], -574479160);
               return classUL.field6323[classUL.field6321 * 1171203923];
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "av.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jp")
   public void method722() {
      Thread.currentThread().setName("Sound Engine");
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;)[I")
   @ObfuscatedName("kd")
   public static int[] method721(classLZ var0) {
      return Arrays.copyOf(var0.field4445, -1725791933 * var0.field4449);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method717() {
      try {
         for (int var1 = 0; var1 < 2; var1++) {
            classAK var2 = this.field287[var1];
            if (null != var2) {
               var2.method408((byte)-22);
            }
         }
      } catch (Exception var3) {
         classAAU.method275(null, var3, (byte)10);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lav;)V")
   @ObfuscatedName("lu")
   public static void method718(classAV var0) {
      if (var0 == null) {
         var0.method717();
      }

      try {
         for (int var1 = 0; var1 < 2; var1++) {
            classAK var2 = var0.field287[var1];
            if (null != var2) {
               var2.method408((byte)-1);
            }
         }
      } catch (Exception var3) {
         classAAU.method275(null, var3, (byte)23);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method719() {
      try {
         for (int var1 = 0; var1 < 2; var1++) {
            classAK var2 = this.field287[var1];
            if (null != var2) {
               var2.method408((byte)-23);
            }
         }
      } catch (Exception var3) {
         classAAU.method275(null, var3, (byte)11);
      }
   }
}
