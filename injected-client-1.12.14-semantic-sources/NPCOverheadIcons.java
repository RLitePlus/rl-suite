import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xe")
public class NPCOverheadIcons {
   @ObfuscatedName("av")
   int[] overheadArchiveIds = new int[8];
   @ObfuscatedName("at")
   short[] overheadSpriteIds = new short[8];
   @ToRemove(unused = "true")
   @ObfuscatedName("ci")
   static final int field6487 = 28;

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("av")
   public int[] method12253(int var1) {
      try {
         return this.overheadArchiveIds;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xe.av(" + ')');
      }
   }

   public NPCOverheadIcons(NPCComposition var1) {
      int var2 = 0;
      if (NPCComposition.method4703(var1, -1627042038)) {
         var2 = var1.method4707(-1300032824).length;
         System.arraycopy(var1.method4707(-1300032824), 0, this.overheadArchiveIds, 0, var2);
         System.arraycopy(var1.method4712((byte)-28), 0, this.overheadSpriteIds, 0, var2);
      }

      for (int var3 = var2; var3 < 8; var3++) {
         this.overheadArchiveIds[var3] = -1;
         this.overheadSpriteIds[var3] = -1;
      }
   }

   @ObfuscatedSignature(descriptor = "([I[SI)V")
   @ObfuscatedName("an")
   public void method12258(int[] var1, short[] var2, int var3) {
      try {
         this.overheadArchiveIds = var1;
         this.overheadSpriteIds = var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xe.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("aw")
   public void method12256(int var1, int var2, short var3) {
      this.overheadArchiveIds[var1] = var2;
      this.overheadSpriteIds[var1] = var3;
   }

   @ObfuscatedSignature(descriptor = "([I[S)V")
   @ObfuscatedName("ap")
   public void method12259(int[] var1, short[] var2) {
      this.overheadArchiveIds = var1;
      this.overheadSpriteIds = var2;
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("ak")
   public short[] method12254() {
      return this.overheadSpriteIds;
   }

   @ObfuscatedSignature(descriptor = "(IISB)V")
   @ObfuscatedName("ag")
   public void method12257(int var1, int var2, short var3, byte var4) {
      try {
         this.overheadArchiveIds[var1] = var2;
         this.overheadSpriteIds[var1] = var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "xe.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)[S")
   @ObfuscatedName("at")
   public short[] method12255(short var1) {
      try {
         return this.overheadSpriteIds;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xe.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([I[S)V")
   @ObfuscatedName("ay")
   public void method12260(int[] var1, short[] var2) {
      this.overheadArchiveIds = var1;
      this.overheadSpriteIds = var2;
   }

   @ObfuscatedSignature(descriptor = "([I[S)V")
   @ObfuscatedName("au")
   public void method12261(int[] var1, short[] var2) {
      this.overheadArchiveIds = var1;
      this.overheadSpriteIds = var2;
   }
}
