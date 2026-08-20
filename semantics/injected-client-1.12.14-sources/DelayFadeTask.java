import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public class DelayFadeTask extends SongTask {
   @ObfuscatedName("at")
   int field5857;
   @ObfuscatedName("av")
   long field5858;

   public DelayFadeTask(SongTask var1, int var2) {
      super(var1);
      this.field5857 = var2 * 408465097;
      this.field5881 = "DelayFadeTask";
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      if (-6215936894117245883L * this.field5858 < this.field5857 * -509817991) {
         this.field5858 += -46417317659564403L;
         return false;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         if (-6215936894117245883L * this.field5858 < this.field5857 * -509817991) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               this.field5858 += -46417317659564403L;
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sq.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      if (-6215936894117245883L * this.field5858 < this.field5857 * -509817991) {
         this.field5858 += -46417317659564403L;
         return false;
      } else {
         return true;
      }
   }
}
