import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wq")
public class classWQ extends classWT {
   @ObfuscatedName("az")
   ArrayList field6766;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field6767 = 48;
   @ObfuscatedName("av")
   static String[] field6768;

   public classWQ(classWT var1, ArrayList var2) {
      super(var1);
      this.field6766 = var2;
      this.field6777 = "ConcurrentMidiTask";
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod629() {
      for (int var1 = 0; var1 < this.field6766.size(); var1++) {
         classWT var2 = (classWT)this.field6766.get(var1);
         if (var2 == null) {
            this.field6766.remove(var1);
            var1--;
         } else if (var2.vmethod627((byte)45)) {
            if (var2.method12613(1785831228)) {
               classWT.method12624(this, classWT.method12619(var2, -357106440), (byte)-61);
               this.field6766.clear();
               return true;
            }

            if (var2.method12621((short)-15369) != null) {
               this.field6766.add(var2.method12621((short)1808));
            }

            this.field6779 = var2.field6779;
            this.field6766.remove(var1);
            var1--;
         }
      }

      return this.field6766.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod628() {
      for (int var1 = 0; var1 < this.field6766.size(); var1++) {
         classWT var2 = (classWT)this.field6766.get(var1);
         if (var2 == null) {
            this.field6766.remove(var1);
            var1--;
         } else if (var2.vmethod627((byte)55)) {
            if (var2.method12613(-1235614441)) {
               classWT.method12624(this, classWT.method12619(var2, 476200571), (byte)23);
               this.field6766.clear();
               return true;
            }

            if (var2.method12621((short)15556) != null) {
               this.field6766.add(var2.method12621((short)-7044));
            }

            this.field6779 = var2.field6779;
            this.field6766.remove(var1);
            var1--;
         }
      }

      return this.field6766.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod627(byte var1) {
      try {
         for (int var2 = 0; var2 < this.field6766.size(); var2++) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            classWT var3 = (classWT)this.field6766.get(var2);
            if (var3 == null) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               this.field6766.remove(var2);
               var2--;
            } else if (var3.vmethod627((byte)81)) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (var3.method12613(-1918286699)) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  classWT.method12624(this, classWT.method12619(var3, -1627650028), (byte)-32);
                  this.field6766.clear();
                  return true;
               }

               if (var3.method12621((short)15013) != null) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.field6766.add(var3.method12621((short)-11428));
               }

               this.field6779 = var3.field6779;
               this.field6766.remove(var2);
               var2--;
            }
         }

         if (!this.field6766.isEmpty()) {
            return false;
         } else if (var1 <= 1) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "wq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod626() {
      for (int var1 = 0; var1 < this.field6766.size(); var1++) {
         classWT var2 = (classWT)this.field6766.get(var1);
         if (var2 == null) {
            this.field6766.remove(var1);
            var1--;
         } else if (var2.vmethod627((byte)14)) {
            if (var2.method12613(-1679124125)) {
               classWT.method12624(this, classWT.method12619(var2, -1239469063), (byte)60);
               this.field6766.clear();
               return true;
            }

            if (var2.method12621((short)-18078) != null) {
               this.field6766.add(var2.method12621((short)420));
            }

            this.field6779 = var2.field6779;
            this.field6766.remove(var1);
            var1--;
         }
      }

      return this.field6766.isEmpty();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod630() {
      for (int var1 = 0; var1 < this.field6766.size(); var1++) {
         classWT var2 = (classWT)this.field6766.get(var1);
         if (var2 == null) {
            this.field6766.remove(var1);
            var1--;
         } else if (var2.vmethod627((byte)94)) {
            if (var2.method12613(86539143)) {
               classWT.method12624(this, classWT.method12619(var2, 1384148841), (byte)16);
               this.field6766.clear();
               return true;
            }

            if (var2.method12621((short)-17883) != null) {
               this.field6766.add(var2.method12621((short)18678));
            }

            this.field6779 = var2.field6779;
            this.field6766.remove(var1);
            var1--;
         }
      }

      return this.field6766.isEmpty();
   }
}
