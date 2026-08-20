import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jo")
public abstract class classJO {
   @ObfuscatedName("an")
   String field3139;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field3140 = 1;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int vmethod198() {
      return -1;
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String method6146(byte var1) {
      try {
         return this.field3139;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jo.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int vmethod196(int var1) {
      try {
         return -1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jo.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String vmethod207(int var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jo.aj(" + ')');
      }
   }

   classJO(class236 var1, String var2) {
      this.this$0 = var1;
      this.field3139 = var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public abstract int vmethod195();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   public abstract int vmethod194(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int vmethod197() {
      return -1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ak")
   public String vmethod206() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String vmethod208() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String method6147() {
      return this.field3139;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("au")
   public String method6148() {
      return this.field3139;
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("at")
   static int method6145(int var0, int var1, byte var2) {
      try {
         if (var0 == -2) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else if (var0 == -1) {
            if (var2 <= 2) {
               throw new IllegalStateException();
            } else {
               if (var1 < 0) {
                  var1 = 0;
               } else if (var1 > 127) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  var1 = 127;
               }

               return 127 - var1;
            }
         } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
               var1 = 2;
            } else if (var1 > 126) {
               var1 = 126;
            }

            return (var0 & 65408) + var1;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jo.at(" + 41);
      }
   }
}
