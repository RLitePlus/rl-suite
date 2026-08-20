import net.runelite.api.Ignore;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rs")
public class Ignored extends User implements Ignore {
   @ObfuscatedSignature(descriptor = "Lec;")
   @ObfuscatedName("mr")
   static TextureProvider field5839;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   public static final int field5837 = 71;
   @ObfuscatedName("cg")
   static int field5838;
   @ObfuscatedName("az")
   int field5836;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod565(Object var1) {
      return method10184(this, (Ignored)var1, (byte)-116);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;I)I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod562(User var1, int var2) {
      try {
         return method10184(this, (Ignored)var1, (byte)-38);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rs.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrs;)I")
   @ObfuscatedName("as")
   int method10183(Ignored var1) {
      return -847650061 * this.field5836 - var1.field5836 * -847650061;
   }

   @ObfuscatedSignature(descriptor = "(Lrs;Lrs;B)I")
   @ObfuscatedName("yg")
   public static int method10184(Ignored var0, Ignored var1, byte var2) {
      if (var0 == null) {
         var0.method10186(var0, var2);
      }

      try {
         return -847650061 * var0.field5836 - var1.field5836 * -847650061;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rs.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)I")
   @ObfuscatedName("ak")
   @Override
   public int vmethod563(User var1) {
      return method10184(this, (Ignored)var1, (byte)-51);
   }

   Ignored() {
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)I")
   @ObfuscatedName("av")
   @Override
   public int vmethod564(User var1) {
      return method10184(this, (Ignored)var1, (byte)-94);
   }

   @ObfuscatedSignature(descriptor = "(Lrs;)I")
   @ObfuscatedName("ag")
   int method10185(Ignored var1) {
      return -847650061 * this.field5836 - var1.field5836 * 2003665183;
   }

   @Override
   public int compareTo(Object var1) {
      try {
         return method10184(this, (Ignored)var1, (byte)-28);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rs.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrs;B)I")
   @ObfuscatedName("az")
   int method10186(Ignored var1, byte var2) {
      try {
         return -847650061 * this.field5836 - var1.field5836 * -847650061;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rs.az(" + 41);
      }
   }
}
