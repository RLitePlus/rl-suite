import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("st")
public class AddRequestTask extends SongTask {
   @ToRemove(unused = "true")
   @ObfuscatedName("cx")
   static final String field5864 = "beta";

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loa;II)V")
   @ObfuscatedName("bl")
   public static void method10515(PlayerComposition var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7934(var1, var1);
      } else {
         var0.bodyColors[var1] = var2;
         var0.method7922((byte)-31);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lnc;")
   @ObfuscatedName("at")
   MidiPcmStream method10513(int var1) {
      try {
         MidiPcmStream var2 = null;
         Iterator var3 = class345.field4311.iterator();

         while (var3.hasNext()) {
            if (var1 <= 2147348278) {
               throw new IllegalStateException();
            }

            MidiPcmStream var4 = (MidiPcmStream)var3.next();
            if (var4 != null) {
               if (var1 <= 2147348278) {
                  throw new IllegalStateException();
               }

               if (null != var2 && 268210409 * var2.field4208 <= var4.field4208 * 268210409) {
                  if (var1 <= 2147348278) {
                     throw new IllegalStateException();
                  }

                  if (var4.method7622(1794541496) != 0) {
                     continue;
                  }

                  if (var1 <= 2147348278) {
                     throw new IllegalStateException();
                  }

                  if (!var4.isReady(81817220)) {
                     continue;
                  }

                  if (var1 <= 2147348278) {
                     throw new IllegalStateException();
                  }
               }

               var2 = var4;
            }
         }

         if (null != var2) {
            if (var1 <= 2147348278) {
               throw new IllegalStateException();
            }

            var2.field4208 += 1683572569;
            if (var2.method7622(763372284) == 0) {
               if (var1 <= 2147348278) {
                  throw new IllegalStateException();
               }

               if (var2.isReady(918347740)) {
                  if (var1 <= 2147348278) {
                     throw new IllegalStateException();
                  }

                  var2.clear(1806462691);
                  var2.method7640((byte)-48);
                  MidiPcmStream.method7621(var2, 0, (byte)-59);
               }
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "st.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         while (!class345.field4308.isEmpty()) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            MidiRequest var2 = (MidiRequest)class345.field4308.peek();
            if (null == var2) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               class345.field4308.pop();
            } else {
               var2.midiPcmStream = this.method10513(2147411660);
               class345.midiRequests.add(var2);
               class345.field4308.pop();
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "st.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      while (!class345.field4308.isEmpty()) {
         MidiRequest var1 = (MidiRequest)class345.field4308.peek();
         if (null == var1) {
            class345.field4308.pop();
         } else {
            var1.midiPcmStream = this.method10513(2147359411);
            class345.midiRequests.add(var1);
            class345.field4308.pop();
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      while (!class345.field4308.isEmpty()) {
         MidiRequest var1 = (MidiRequest)class345.field4308.peek();
         if (null == var1) {
            class345.field4308.pop();
         } else {
            var1.midiPcmStream = this.method10513(2147466707);
            class345.midiRequests.add(var1);
            class345.field4308.pop();
         }
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)Lsf;")
   @ObfuscatedName("uf")
   public static classSF method10516(classOO var0) {
      return var0.field4654;
   }

   public AddRequestTask(SongTask var1) {
      super(var1);
      this.field5881 = "AddRequestTask";
   }

   @ObfuscatedSignature(descriptor = "()Lnc;")
   @ObfuscatedName("ae")
   MidiPcmStream method10514() {
      MidiPcmStream var1 = null;

      for (MidiPcmStream var3 : class345.field4311) {
         if (var3 != null
            && (null == var1 || 268210409 * var1.field4208 > var3.field4208 * 268210409 || var3.method7622(575367108) == 0 && var3.isReady(-1822191617))) {
            var1 = var3;
         }
      }

      if (null != var1) {
         var1.field4208 += 1683572569;
         if (var1.method7622(843574320) == 0 && var1.isReady(1398978844)) {
            var1.clear(1806462691);
            var1.method7640((byte)-91);
            MidiPcmStream.method7621(var1, 0, (byte)35);
         }
      }

      return var1;
   }
}
