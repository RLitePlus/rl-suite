import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hv")
public class classHV {
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   public static final int field2898 = 4;
   @ObfuscatedName("az")
   public int field2897;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("ae")
   public classKY field2895;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("af")
   public classKY field2896;

   @ObfuscatedSignature(descriptor = "(Lul;Lul;I)F")
   @ObfuscatedName("ag")
   static final float method6122(classUL var0, classUL var1, int var2) {
      try {
         return classUL.method11386(var0, var1, (byte)0);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "hv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("az")
   public static void method6120(AbstractArchive var0, int var1) {
      try {
         VarbitComposition.field5423 = var0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "hv.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwt;)Lwt;")
   @ObfuscatedName("nv")
   public static classWT method6121(classWT var0) {
      return var0.field6775;
   }

   public classHV(int var1, classKY var2, classKY var3) {
      this.field2897 = -881797973 * var1;
      this.field2896 = var2;
      this.field2895 = var3;
   }
}
