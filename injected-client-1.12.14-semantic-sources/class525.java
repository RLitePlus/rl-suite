import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ui")
public class class525 {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6069 = 499;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6067 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6068 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6065 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field6066 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6064 = 1;

   @ObfuscatedSignature(descriptor = "(Lee;Lem;)I")
   @ObfuscatedName("nd")
   public static int method11170(VorbisCodebook var0, classEM var1) {
      if (var0 == null) {
         var0.method3700(var1);
      }

      int var2 = 0;

      while (var0.field1566[var2] >= 0) {
         var2 = classEM.method3774(var1, (byte)4) != 0 ? var0.field1566[var2] : var2 + 1;
      }

      return ~var0.field1566[var2];
   }

   class525() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;)I")
   @ObfuscatedName("ll")
   public static int method11169(IterableNodeDeque var0) {
      if (var0 == null) {
         var0.method9647();
      }

      return var0.method9649();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
   @ObfuscatedName("ar")
   static void setLoginResponseString(String var0, String var1, String var2, byte var3) {
      try {
         Login.Login_response1 = var0;
         Login.Login_response2 = var1;
         Login.Login_response3 = var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ui.ar(" + ')');
      }
   }
}
