import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ox")
public class classOX {
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ak")
   public static classVA field5192;
   @ObfuscatedName("af")
   static char[] field5189;
   @ObfuscatedName("ae")
   static char[] field5188;
   @ObfuscatedName("ab")
   static int[] field5187;
   @ObfuscatedName("az")
   public static char[] field5186 = new char[64];
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field5190 = 27;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field5191 = 52;

   static {
      for (int var0 = 0; var0 < 26; var0++) {
         field5186[var0] = (char)(65 + var0);
      }

      for (int var2 = 26; var2 < 52; var2++) {
         field5186[var2] = (char)(97 + var2 - 26);
      }

      for (int var3 = 52; var3 < 62; var3++) {
         field5186[var3] = (char)(var3 + 48 - 52);
      }

      field5186[62] = '+';
      field5186[63] = '/';
      field5189 = new char[64];

      for (int var4 = 0; var4 < 26; var4++) {
         field5189[var4] = (char)(var4 + 65);
      }

      for (int var5 = 26; var5 < 52; var5++) {
         field5189[var5] = (char)(97 + var5 - 26);
      }

      for (int var6 = 52; var6 < 62; var6++) {
         field5189[var6] = (char)(48 + var6 - 52);
      }

      field5189[62] = '*';
      field5189[63] = '-';
      field5188 = new char[64];

      for (int var7 = 0; var7 < 26; var7++) {
         field5188[var7] = (char)(var7 + 65);
      }

      for (int var8 = 26; var8 < 52; var8++) {
         field5188[var8] = (char)(97 + var8 - 26);
      }

      for (int var9 = 52; var9 < 62; var9++) {
         field5188[var9] = (char)(48 + var9 - 52);
      }

      field5188[62] = '-';
      field5188[63] = '_';
      field5187 = new int[128];

      for (int var10 = 0; var10 < field5187.length; var10++) {
         field5187[var10] = -1;
      }

      for (int var11 = 65; var11 <= 90; var11++) {
         field5187[var11] = var11 - 65;
      }

      for (int var12 = 97; var12 <= 122; var12++) {
         field5187[var12] = 26 + (var12 - 97);
      }

      for (int var13 = 48; var13 <= 57; var13++) {
         field5187[var13] = 52 + (var13 - 48);
      }

      int[] var14 = field5187;
      field5187[43] = 62;
      var14[42] = 62;
      int[] var1 = field5187;
      field5187[47] = 63;
      var1[45] = 63;
   }

   classOX() throws Throwable {
      throw new Error();
   }
}
