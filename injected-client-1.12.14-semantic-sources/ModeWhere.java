import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qa")
public class ModeWhere implements Enum {
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("ay")
   static final ModeWhere field5289 = new ModeWhere("", 10, new class437[]{class437.field5341});
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field5290 = 45;
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("ag")
   static final ModeWhere field5279 = new ModeWhere("", 2, new class437[]{class437.field5341, class437.field5343, class437.field5342});
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("an")
   static final ModeWhere field5277 = new ModeWhere("", 3, new class437[]{class437.field5341});
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("at")
   static final ModeWhere field5280 = new ModeWhere("", 1, new class437[]{class437.field5341, class437.field5342, class437.field5340});
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("aj")
   static final ModeWhere field5282 = new ModeWhere("", 5, new class437[]{class437.field5341, class437.field5342});
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("ae")
   static final ModeWhere field5281 = new ModeWhere("", 4);
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("ak")
   static final ModeWhere field5288 = new ModeWhere("", 6, new class437[]{class437.field5342});
   @ObfuscatedName("as")
   final Set field5275 = new HashSet();
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("au")
   static final ModeWhere field5286 = new ModeWhere("", 11, new class437[]{class437.field5341});
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("ap")
   static final ModeWhere field5284 = new ModeWhere("", 9, new class437[]{class437.field5341, class437.field5343});
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("az")
   static final ModeWhere field5287 = new ModeWhere("", 12, new class437[]{class437.field5341, class437.field5342});
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("ad")
   static final ModeWhere field5285 = new ModeWhere("", 13, new class437[]{class437.field5341});
   @ObfuscatedName("ai")
   final int id;
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("aw")
   static final ModeWhere field5283 = new ModeWhere("", 8, new class437[]{class437.field5341, class437.field5342});
   @ObfuscatedSignature(descriptor = "Lqa;")
   @ObfuscatedName("av")
   static final ModeWhere field5278 = new ModeWhere("", 0, new class437[]{class437.field5342, class437.field5340});

   ModeWhere(String var1, int var2) {
      this.id = var2 * 742150981;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leq;)Z")
   @ObfuscatedName("zq")
   public static boolean method8830(class107 var0) {
      return var0 == null ? var0.method3818() : var0.field1632 == null;
   }

   ModeWhere(String var1, int var2, class437[] var3) {
      this.id = var2 * 742150981;
      class437[] var4 = var3;

      for (int var5 = 0; var5 < var4.length; var5++) {
         class437 var6 = var4[var5];
         this.field5275.add(var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.id * -589936755;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qa.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkq;[I[FIIF)V")
   @ObfuscatedName("vx")
   public static void method8831(class272 var0, int[] var1, float[] var2, int var3, int var4, float var5) {
      if (var0 == null) {
         var0.method6597(var1, var3, var3, var3, var3, var3, var5, var5, var5, var5);
      } else {
         var0.method6564(var1, var2, var3, var4, var5, class272.method6556(var2[var3], var5));
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.id * -1628181442;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.id * -589936755;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.id * -589936755;
   }
}
