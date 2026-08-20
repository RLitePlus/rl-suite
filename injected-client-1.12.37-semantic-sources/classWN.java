import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wn")
public class classWN extends classWT {
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hs")
   static classVP field6759;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("at")
   static AbstractArchive field6758;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6757 = 2;

   public classWN(classWT var1) {
      super(var1);
      this.field6777 = "AddRequestTask";
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod627(byte var1) {
      try {
         while (!classNP.field4697.isEmpty()) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            MidiRequest var2 = (MidiRequest)classNP.field4697.peek();
            if (null == var2) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               classNP.field4697.pop();
            } else {
               var2.field4641 = this.method12604(1209653889);
               classNP.field4698.add(var2);
               classNP.field4697.pop();
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wn.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lnu;")
   @ObfuscatedName("as")
   classNU method12604(int var1) {
      try {
         classNU var2 = null;
         Iterator var3 = classNP.field4704.iterator();

         while (var3.hasNext()) {
            if (var1 != 1209653889) {
               throw new IllegalStateException();
            }

            classNU var4 = (classNU)var3.next();
            if (null != var4) {
               if (var1 != 1209653889) {
                  throw new IllegalStateException();
               }

               if (null != var2) {
                  if (var1 != 1209653889) {
                     throw new IllegalStateException();
                  }

                  if (917328323 * var2.field4751 <= 917328323 * var4.field4751) {
                     if (var1 != 1209653889) {
                        throw new IllegalStateException();
                     }

                     if (var4.method8014((byte)-124) != 0) {
                        continue;
                     }

                     if (var1 != 1209653889) {
                        throw new IllegalStateException();
                     }

                     if (!var4.method8041((byte)10)) {
                        continue;
                     }

                     if (var1 != 1209653889) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var2 = var4;
            }
         }

         if (var2 != null) {
            if (var1 != 1209653889) {
               throw new IllegalStateException();
            }

            var2.field4751 += 16852715;
            if (var2.method8014((byte)-108) == 0) {
               if (var1 != 1209653889) {
                  throw new IllegalStateException();
               }

               if (var2.method8041((byte)10)) {
                  if (var1 != 1209653889) {
                     throw new IllegalStateException();
                  }

                  var2.method8040((byte)37);
                  var2.method8026((byte)0);
                  var2.method8009(0, -1404437921);
               }
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wn.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod628() {
      while (!classNP.field4697.isEmpty()) {
         MidiRequest var1 = (MidiRequest)classNP.field4697.peek();
         if (null == var1) {
            classNP.field4697.pop();
         } else {
            var1.field4641 = this.method12604(1209653889);
            classNP.field4698.add(var1);
            classNP.field4697.pop();
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod629() {
      while (!classNP.field4697.isEmpty()) {
         MidiRequest var1 = (MidiRequest)classNP.field4697.peek();
         if (null == var1) {
            classNP.field4697.pop();
         } else {
            var1.field4641 = this.method12604(1209653889);
            classNP.field4698.add(var1);
            classNP.field4697.pop();
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(Luz;Luz;B)Luz;")
   @ObfuscatedName("ab")
   public static final classUZ method12606(classUZ var0, classUZ var1, byte var2) {
      try {
         classUZ var3 = WorldMapArea.method5840(var0, (byte)-27);
         var3.method11764(var1, -291135846);
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wn.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod630() {
      while (!classNP.field4697.isEmpty()) {
         MidiRequest var1 = (MidiRequest)classNP.field4697.peek();
         if (null == var1) {
            classNP.field4697.pop();
         } else {
            var1.field4641 = this.method12604(1209653889);
            classNP.field4698.add(var1);
            classNP.field4697.pop();
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Lnu;")
   @ObfuscatedName("ax")
   classNU method12605() {
      classNU var1 = null;

      for (classNU var3 : classNP.field4704) {
         if (null != var3
            && (null == var1 || 917328323 * var1.field4751 > 917328323 * var3.field4751 || var3.method8014((byte)-36) == 0 && var3.method8041((byte)10))) {
            var1 = var3;
         }
      }

      if (var1 != null) {
         var1.field4751 += 16852715;
         if (var1.method8014((byte)-44) == 0 && var1.method8041((byte)10)) {
            var1.method8040((byte)26);
            var1.method8026((byte)0);
            var1.method8009(0, -1267663706);
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod626() {
      while (!classNP.field4697.isEmpty()) {
         MidiRequest var1 = (MidiRequest)classNP.field4697.peek();
         if (null == var1) {
            classNP.field4697.pop();
         } else {
            var1.field4641 = this.method12604(1209653889);
            classNP.field4698.add(var1);
            classNP.field4697.pop();
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(II)Lzf;")
   @ObfuscatedName("az")
   public static classZF method12603(int var0, int var1) {
      try {
         classZF[] var2 = new classZF[]{classZF.field7178, classZF.field7180, classZF.field7179};
         classZF[] var3 = var2;

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var1 <= 1818461594) {
               throw new IllegalStateException();
            }

            classZF var5 = var3[var4];
            if (-1382377909 * var5.field7181 == var0) {
               if (var1 <= 1818461594) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "wn.az(" + ')');
      }
   }
}
