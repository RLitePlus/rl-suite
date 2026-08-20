import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lz")
public class MoveSpeed implements Enum {
   @ObfuscatedName("ae")
   final byte id;
   @ObfuscatedSignature(descriptor = "Llz;")
   @ObfuscatedName("at")
   public static final MoveSpeed field3807 = new MoveSpeed((byte)0);
   @ObfuscatedSignature(descriptor = "Llz;")
   @ObfuscatedName("av")
   public static final MoveSpeed field3805 = new MoveSpeed((byte)-1);
   @ObfuscatedSignature(descriptor = "Llz;")
   @ObfuscatedName("an")
   public static final MoveSpeed field3808 = new MoveSpeed((byte)2);
   @ToRemove(unused = "true")
   @ObfuscatedName("df")
   static final String field3812 = "shield/oauth/token";
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field3810 = 3;
   @ObfuscatedSignature(descriptor = "Llz;")
   @ObfuscatedName("ag")
   public static final MoveSpeed field3806 = new MoveSpeed((byte)1);
   @ObfuscatedName("ul")
   static int field3811;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("di")
   static IndexedSprite[] worldSelectArrows;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.id;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.id;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lz.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;)I")
   @ObfuscatedName("lv")
   public static int method7345(Widget var0, String var1) {
      return var0.type * -2009572945 == 11 && var0.field4442 != null && var0.method8113((byte)14) ? var0.field4442.method5299(var1, 233228120) : -1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.id;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.id;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Llz;")
   @ObfuscatedName("aj")
   public static MoveSpeed[] method7339() {
      return new MoveSpeed[]{field3806, field3807, field3805, field3808};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Llz;")
   @ObfuscatedName("aw")
   public static MoveSpeed[] method7340() {
      return new MoveSpeed[]{field3806, field3807, field3805, field3808};
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ag")
   static int method7343(int var0, int var1, int var2, int var3) {
      try {
         if (var2 > 179) {
            if (var3 != -1707581112) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 192) {
            var1 /= 2;
         }

         if (var2 > 217) {
            if (var3 != -1707581112) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 243) {
            if (var3 != -1707581112) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         return var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "lz.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leh;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("sy")
   public static int method7342(UserComparator7 var0, Object var1, Object var2) {
      return var0 == null ? var0.method3729(var1, var1) : var0.compareBuddy((Buddy)var1, (Buddy)var2, (byte)-59);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Llz;")
   @ObfuscatedName("ak")
   public static MoveSpeed[] method7341() {
      return new MoveSpeed[]{field3806, field3807, field3805, field3808};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;I)I")
   @ObfuscatedName("eh")
   public static int method7344(PlayerComposition var0, int var1) {
      if (var0 == null) {
         var0.getEquipmentIds();
      }

      return var1 - -2006801629 + 964897498;
   }

   MoveSpeed(byte var1) {
      this.id = var1;
   }
}
