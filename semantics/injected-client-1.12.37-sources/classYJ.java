import net.runelite.api.coords.LocalPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yj")
public class classYJ implements CameraFocusableEntity {
   @ObfuscatedName("af")
   int field6992;
   @ObfuscatedName("ae")
   int field6991;
   @ObfuscatedName("az")
   int field6993;
   @ObfuscatedName("bi")
   static int field6994;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hq")
   @Override
   public int vmethod369() {
      return -640882365 * this.field6992;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("af")
   public void method13385(int var1, int var2, int var3, int var4) {
      try {
         this.field6992 = classKY.method6612(var2, 440265306) * -1254167701;
         this.field6991 = classKY.method6612(var3, 1292039406) * -1343438351;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "yj.af(" + ')');
      }
   }

   public LocalPoint getCameraFocus() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ow")
   public void method13386(int var1, int var2, int var3) {
      this.field6992 = classKY.method6612(var2, 559645505) * -1254167701;
      this.field6991 = classKY.method6612(var3, 127772384) * -1343438351;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod258(byte var1) {
      try {
         return this.field6993 * -1210178563;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "yj.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   @Override
   public int vmethod259() {
      return this.field6993 * -1210178563;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kh")
   @Override
   public int vmethod372() {
      return this.field6991 * 1183452945;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyj;III)V")
   @ObfuscatedName("ex")
   public static void method13387(classYJ var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.vmethod371(var1);
      }

      var0.field6992 = classKY.method6612(var2, 1254692947) * -1254167701;
      var0.field6991 = classKY.method6612(var3, -164596595) * -1343438351;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ky")
   @Override
   public int vmethod370() {
      return this.field6991 * 1183452945;
   }

   public net.runelite.api.WorldView getWorldView() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ey")
   @Override
   public int vmethod368(int var1) {
      try {
         return -640882365 * this.field6992;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "yj.ey(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ea")
   @Override
   public int vmethod371(int var1) {
      try {
         return this.field6991 * 1183452945;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "yj.ea(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("yq")
   @Override
   public float vmethod382() {
      return this.field6992 * -640882365;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ab")
   public void method13388(int var1, int var2, int var3) {
      this.method13385(var1, var2, var3, 1365691935);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("ef")
   @Override
   public float vmethod383() {
      return this.field6991 * 1183452945;
   }
}
