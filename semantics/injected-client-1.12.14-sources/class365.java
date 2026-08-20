import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ol")
public class class365 {
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final int field4637 = 91;
   @ObfuscatedSignature(descriptor = "Loq;")
   @ObfuscatedName("av")
   static Huffman huffman;
   @ObfuscatedName("lj")
   static String field4638;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;Ljava/lang/String;)I")
   @ObfuscatedName("ay")
   public static int method8348(Buffer var0, String var1) {
      int var2 = var0.offset * 2108391709;
      byte[] var3 = classLI.method7185(var1, (short)-14959);
      Buffer.method11983(var0, var3.length, (byte)66);
      var0.offset = var0.offset + Huffman.method8646(huffman, var3, 0, var3.length, var0.array, var0.offset * 2108391709, (byte)-54) * 1741769013;
      return 2108391709 * var0.offset - var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loq;)V")
   @ObfuscatedName("ae")
   public static void method8344(Huffman var0) {
      huffman = var0;
   }

   class365() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loq;)V")
   @ObfuscatedName("aj")
   public static void method8345(Huffman var0) {
      huffman = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loq;)V")
   @ObfuscatedName("aw")
   public static void method8346(Huffman var0) {
      huffman = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;Ljava/lang/String;)I")
   @ObfuscatedName("ap")
   public static int method8349(Buffer var0, String var1) {
      int var2 = var0.offset * 2108391709;
      byte[] var3 = classLI.method7185(var1, (short)-738);
      Buffer.method11983(var0, var3.length, (byte)102);
      var0.offset = var0.offset + Huffman.method8646(huffman, var3, 0, var3.length, var0.array, var0.offset * 2108391709, (byte)-26) * 1741769013;
      return 2108391709 * var0.offset - var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loq;)V")
   @ObfuscatedName("ak")
   public static void method8347(Huffman var0) {
      huffman = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/String;")
   @ObfuscatedName("au")
   public static String method8350(Buffer var0) {
      return PlayerType.method8786(var0, 32767, 1044510649);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/String;")
   @ObfuscatedName("az")
   public static String method8351(Buffer var0) {
      return PlayerType.method8786(var0, 32767, 326793095);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/String;")
   @ObfuscatedName("ad")
   public static String method8352(Buffer var0) {
      return PlayerType.method8786(var0, -479018363, 2136776);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)Ljava/lang/String;")
   @ObfuscatedName("ai")
   static String method8353(Buffer var0, int var1) {
      try {
         int var2 = Buffer.method12050(var0, -473032137);
         if (var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.offset = var0.offset + huffman.decompress(var0.array, var0.offset * 2108391709, var3, 0, var2, 1180767788) * 1741769013;
         return RouteStrategy.decodeStringCp1252(var3, 0, var2, 1895064943);
      } catch (Exception var5) {
         return "Cabbage";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)Ljava/lang/String;")
   @ObfuscatedName("as")
   static String method8354(Buffer var0, int var1) {
      try {
         int var2 = Buffer.method12050(var0, -1634857296);
         if (var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.offset = var0.offset + huffman.decompress(var0.array, var0.offset * 2108391709, var3, 0, var2, 1974457149) * 1741769013;
         return RouteStrategy.decodeStringCp1252(var3, 0, var2, 1895064943);
      } catch (Exception var5) {
         return "Cabbage";
      }
   }
}
