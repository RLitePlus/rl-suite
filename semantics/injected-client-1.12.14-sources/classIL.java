import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("il")
public class classIL extends classJO {
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field2512 = 8;
   @ObfuscatedName("av")
   String field2510;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field2513 = 1076101624;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final String field2514 = "2";
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field2511 = 22;

   classIL(class236 var1, String var2, String var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field2510 = var3;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   @Override
   public int vmethod194(int var1) {
      try {
         return 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "il.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ak")
   @Override
   public String vmethod206() {
      return this.field2510;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("aj")
   @Override
   public String vmethod207(int var1) {
      try {
         return this.field2510;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "il.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aw")
   @Override
   public String vmethod208() {
      return this.field2510;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod195() {
      return 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)I")
   @ObfuscatedName("uj")
   public static int method4912(classOO var0) {
      return var0.field4654.method10204((short)16256);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   static void method4910(byte var0) {
      try {
         for (ObjectSound var1 = (ObjectSound)ObjectSound.field1087.last(); null != var1; var1 = (ObjectSound)ObjectSound.field1087.previous()) {
            ObjectSound.method2652(var1, -824061258);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "il.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Lut;")
   @ObfuscatedName("ab")
   public static DynamicArray method4911(String var0, String var1, int var2) {
      try {
         if (var1 != null) {
            if (var2 != -979757086) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               int var3 = var1.length();
               int var4 = 1;
               int var5 = 0;

               while ((var5 = var0.indexOf(var1, var5)) != -1) {
                  var4++;
                  var5 += var3;
               }

               DynamicArray var6 = new DynamicArray(class586.field6379, null, var4, var4);
               int var7 = 0;
               var5 = 0;

               for (var4 = 0; (var5 = var0.indexOf(var1, var5)) != -1; var7 = var5) {
                  if (var2 != -979757086) {
                     throw new IllegalStateException();
                  }

                  var6.method11214((byte)-110)[var4++] = var0.substring(var7, var5);
                  var5 += var3;
               }

               var6.method11214((byte)-55)[var4] = var0.substring(var7);
               return var6;
            }

            if (var2 != -979757086) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "il.ab(" + ')');
      }
   }
}
