import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wa")
public class classWA extends classWT {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6653 = 4;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod626() {
      if (classNP.field4698.size() > 1
         && classNP.field4698.get(0) != null
         && ((MidiRequest)classNP.field4698.get(0)).field4641.method8041((byte)10)
         && classNP.field4698.get(1) != null
         && ((MidiRequest)classNP.field4698.get(1)).field4641.method8041((byte)10)) {
         MidiRequest var1 = (MidiRequest)classNP.field4698.get(0);
         classNP.field4698.set(0, classNP.field4698.get(1));
         classNP.field4698.set(1, var1);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod627(byte var1) {
      try {
         if (classNP.field4698.size() > 1) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            if (classNP.field4698.get(0) != null) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (((MidiRequest)classNP.field4698.get(0)).field4641.method8041((byte)10)
                  && classNP.field4698.get(1) != null
                  && ((MidiRequest)classNP.field4698.get(1)).field4641.method8041((byte)10)) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  MidiRequest var2 = (MidiRequest)classNP.field4698.get(0);
                  classNP.field4698.set(0, classNP.field4698.get(1));
                  classNP.field4698.set(1, var2);
               }
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wa.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod628() {
      if (classNP.field4698.size() > 1
         && classNP.field4698.get(0) != null
         && ((MidiRequest)classNP.field4698.get(0)).field4641.method8041((byte)10)
         && classNP.field4698.get(1) != null
         && ((MidiRequest)classNP.field4698.get(1)).field4641.method8041((byte)10)) {
         MidiRequest var1 = (MidiRequest)classNP.field4698.get(0);
         classNP.field4698.set(0, classNP.field4698.get(1));
         classNP.field4698.set(1, var1);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod629() {
      if (classNP.field4698.size() > 1
         && classNP.field4698.get(0) != null
         && ((MidiRequest)classNP.field4698.get(0)).field4641.method8041((byte)10)
         && classNP.field4698.get(1) != null
         && ((MidiRequest)classNP.field4698.get(1)).field4641.method8041((byte)10)) {
         MidiRequest var1 = (MidiRequest)classNP.field4698.get(0);
         classNP.field4698.set(0, classNP.field4698.get(1));
         classNP.field4698.set(1, var1);
      }

      return true;
   }

   public classWA(classWT var1) {
      super(var1);
      this.field6777 = "SwapSongTask";
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod630() {
      if (classNP.field4698.size() > 1
         && classNP.field4698.get(0) != null
         && ((MidiRequest)classNP.field4698.get(0)).field4641.method8041((byte)10)
         && classNP.field4698.get(1) != null
         && ((MidiRequest)classNP.field4698.get(1)).field4641.method8041((byte)10)) {
         MidiRequest var1 = (MidiRequest)classNP.field4698.get(0);
         classNP.field4698.set(0, classNP.field4698.get(1));
         classNP.field4698.set(1, var1);
      }

      return true;
   }
}
