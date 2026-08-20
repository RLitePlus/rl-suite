import java.util.function.Consumer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("by")
public class classBY {
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field607 = 12;
   @ObfuscatedName("az")
   int field613;
   @ObfuscatedName("as")
   int field612;
   @ObfuscatedName("ae")
   int field608;
   @ObfuscatedName("af")
   int field609;
   @ObfuscatedName("ag")
   int field610;
   @ObfuscatedName("ax")
   String field616;
   @ObfuscatedName("ac")
   String field615;
   @ObfuscatedName("aa")
   boolean field618;
   @ObfuscatedName("ab")
   int field606;
   @ObfuscatedName("ay")
   static byte[][][] field619;
   @ObfuscatedName("vo")
   public Consumer field617;
   @ObfuscatedName("bs")
   static int field614;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field611 = 3;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("zd")
   public void method1360(int var1) {
      this.field613 = var1 * -385576485;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("wh")
   public void method1361(int var1) {
      this.field609 = var1 * 2074062867;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jy")
   public int method1362() {
      return this.field608 * -675640733;
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)I")
   @ObfuscatedName("ab")
   static int method1358(int var0, int var1, int var2, int var3, byte var4) {
      try {
         return var0 * var2 + var1 * var3;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "by.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("fc")
   static final void method1359(int var0, byte var1) {
      try {
         var0 = Math.max(Math.min(var0, 100), 0);
         var0 = 100 - var0;
         float var2 = var0 / 200.0F + 0.5F;
         classHA.method5989(var2);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "by.fc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qh")
   public int method1363() {
      return this.field610 * -522427581;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cn")
   public void method1364(String var1) {
      this.field616 = var1;
   }

   classBY() {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("jr")
   public void method1365(String var1) {
      this.field615 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   public int method1366() {
      return this.field612 * 568212409;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ir")
   public void method1367(int var1) {
      this.field608 = var1 * 1973962571;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("dt")
   public String method1368() {
      return this.field616;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ds")
   public String method1369() {
      return this.field615;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ss")
   public void method1370(int var1) {
      this.field610 = var1 * 829407595;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("sj")
   public void method1371(int var1) {
      this.field606 = var1 * 100846287;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jm")
   public int method1372() {
      return this.field613 * 1064501843;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cj")
   public int method1373() {
      return this.field609 * -93349349;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("yk")
   public int method1374() {
      return this.field606 * -1898447825;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yu")
   public void method1375(int var1) {
      this.field612 = var1 * -282371447;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("af")
   static int method1357(int var0, int var1, int var2) {
      try {
         classBH var3 = (classBH)classBH.field454.method13363(var0);
         if (null == var3) {
            if (var2 <= -829989290) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (var1 >= 0) {
               if (var2 <= -829989290) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.field455.length) {
                  return var3.field455[var1];
               }

               if (var2 <= -829989290) {
                  throw new IllegalStateException();
               }
            }

            return 0;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "by.af(" + 41);
      }
   }
}
