import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ou")
public class WorldMapDecorationType implements Enum {
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ac")
   static final WorldMapDecorationType field4702 = new WorldMapDecorationType(17, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("al")
   public static final WorldMapDecorationType field4723 = new WorldMapDecorationType(10, 2);
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   public static final int field4725 = 9;
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("an")
   public static final WorldMapDecorationType field4706 = new WorldMapDecorationType(3, 0);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("aj")
   public static final WorldMapDecorationType field4718 = new WorldMapDecorationType(4, 1);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("at")
   static final WorldMapDecorationType field4721 = new WorldMapDecorationType(1, 0);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ak")
   public static final WorldMapDecorationType field4707 = new WorldMapDecorationType(5, 1);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("aw")
   public static final WorldMapDecorationType field4708 = new WorldMapDecorationType(6, 1);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ap")
   public static final WorldMapDecorationType field4709 = new WorldMapDecorationType(7, 1);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ay")
   public static final WorldMapDecorationType field4710 = new WorldMapDecorationType(8, 1);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("au")
   static final WorldMapDecorationType field4711 = new WorldMapDecorationType(12, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("az")
   static final WorldMapDecorationType field4715 = new WorldMapDecorationType(13, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ad")
   static final WorldMapDecorationType field4713 = new WorldMapDecorationType(14, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ai")
   static final WorldMapDecorationType field4714 = new WorldMapDecorationType(15, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("as")
   static final WorldMapDecorationType field4704 = new WorldMapDecorationType(16, 2);
   @ObfuscatedName("ao")
   public final int id;
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ae")
   public static final WorldMapDecorationType field4705 = new WorldMapDecorationType(9, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ax")
   static final WorldMapDecorationType field4712 = new WorldMapDecorationType(19, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ar")
   static final WorldMapDecorationType field4719 = new WorldMapDecorationType(20, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ag")
   public static final WorldMapDecorationType field4703 = new WorldMapDecorationType(2, 0);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("av")
   public static final WorldMapDecorationType field4701 = new WorldMapDecorationType(0, 0);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("af")
   public static final WorldMapDecorationType field4722 = new WorldMapDecorationType(11, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("am")
   public static final WorldMapDecorationType field4720 = new WorldMapDecorationType(22, 3);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ab")
   static final WorldMapDecorationType field4717 = new WorldMapDecorationType(18, 2);
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ah")
   static final WorldMapDecorationType field4716 = new WorldMapDecorationType(21, 2);

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return -13030657 * this.id;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ou.av(" + 41);
      }
   }

   WorldMapDecorationType(int var1, int var2) {
      this.id = var1 * 1083036927;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -13030657 * this.id;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 2145792082 * this.id;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -1533148872 * this.id;
   }

   @ObfuscatedSignature(descriptor = "(IB)Lwu;")
   @ObfuscatedName("pf")
   static DbTable getDbTable2(int var0, byte var1) {
      try {
         DbTable var2 = (DbTable)class402.method8806(client.archive11, var0);
         if (var2 == null) {
            if (var1 != 30) {
               throw new IllegalStateException();
            }

            var2 = new DbTable(class136.field1858, var0);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ou.pf(" + ')');
      }
   }
}
