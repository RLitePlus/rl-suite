import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lx")
public class classLX {
   @ObfuscatedName("ab")
   public Object[] field4425;
   @ObfuscatedSignature(descriptor = "Lli;")
   @ObfuscatedName("af")
   classLI field4421;
   @ObfuscatedSignature(descriptor = "Ltt;")
   @ObfuscatedName("ae")
   classTT field4420;
   @ObfuscatedSignature(descriptor = "Llh;")
   @ObfuscatedName("az")
   public classLH field4419 = new classLH();
   @ObfuscatedName("ag")
   public Object[] field4426;
   @ObfuscatedName("as")
   public Object[] field4427;
   @ObfuscatedName("ax")
   public Object[] field4428;
   @ToRemove(unused = "true")
   @ObfuscatedName("dm")
   public static final int field4422 = 36;
   @ObfuscatedName("dc")
   static boolean field4424;
   @ObfuscatedName("ej")
   static int field4423;

   @ObfuscatedSignature(descriptor = "(Luu;B)Luu;")
   @ObfuscatedName("af")
   public static classUU method7372(classUU var0, byte var1) {
      try {
         synchronized (classUU.field6382) {
            if (0 == classUU.field6383 * -1618719293) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               } else {
                  return new classUU(var0);
               }
            } else {
               rl23.method10067(classUU.field6382[(classUU.field6383 -= 943786731) * -1618719293], var0, (byte)57);
               return classUU.field6382[classUU.field6383 * -1618719293];
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "lx.af(" + ')');
      }
   }

   classLX() {
      this.field4421 = new classLI();
      this.field4420 = new classTT();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Date;I)Z")
   @ObfuscatedName("aa")
   static boolean method7373(Date var0, int var1) {
      try {
         Date var2 = classSV.method10695(53480384);
         return var0.after(var2);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "lx.aa(" + ')');
      }
   }
}
