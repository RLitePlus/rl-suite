import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pr")
public class class394 {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5230 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5225 = 24;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5226 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field5227 = 2047;
   @ToRemove(unused = "true")
   @ObfuscatedName("cr")
   public static final int field5232 = 96;
   @ObfuscatedName("az")
   public static int ItemDefinition_fileCount;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field5229 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field5228 = 19;

   class394() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public static int method8788(int var0) {
      return var0 >> 24 & 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public static int method8800(int var0) {
      return var0 >> 1 & 3;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("pi")
   static void method8803(byte var0) {
      try {
         for (int var1 = 0; var1 < client.field752.size(); var1++) {
            if (var0 <= 0) {
               throw new IllegalStateException();
            }

            if (HitSplatDefinition.method4993((Integer)client.field752.get(var1), 1402352388) != 2) {
               if (var0 <= 0) {
                  return;
               }

               client.field752.remove(var1);
               var1--;
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pr.pi(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public static int method8789(int var0) {
      return var0 >> 24 & 3;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("av")
   public static int method8799(int var0, int var1, int var2) {
      try {
         return (int)Math.round(Math.atan2(var0, var1) * 2607.5945876176133) & 16383;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "pr.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   public static int method8792(int var0) {
      return var0 >> 14 & 1023;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("au")
   public static int method8793(int var0) {
      return var0 >> 14 & 1023;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   public static int method8795(int var0) {
      return var0 >> 3 & -1135074140;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   public static int method8796(int var0) {
      return var0 >> 3 & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public static int method8797(int var0) {
      return var0 >> 3 & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public static int method8798(int var0) {
      return var0 >> 3 & 2047;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   public static int method8801(int var0) {
      return var0 >> 1 & 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public static int method8802(int var0) {
      return var0 >> 1 & 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public static int method8790(int var0) {
      return var0 >> 24 & 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public static int method8794(int var0) {
      return var0 >> 14 & -1050282542;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public static int method8791(int var0) {
      return var0 >> 24 & 3;
   }
}
