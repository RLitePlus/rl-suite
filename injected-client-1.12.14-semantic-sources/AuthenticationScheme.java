import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fb")
public class AuthenticationScheme implements Enum {
   @ObfuscatedSignature(descriptor = "Lfb;")
   @ObfuscatedName("an")
   public static final AuthenticationScheme USERNAME_PASSWORD = new AuthenticationScheme(2, 3);
   @ObfuscatedName("aj")
   public final int schemeId;
   @ObfuscatedSignature(descriptor = "Lfb;")
   @ObfuscatedName("at")
   public static final AuthenticationScheme USERNAME_PASSWORD_REMEMBER = new AuthenticationScheme(1, 1);
   @ObfuscatedSignature(descriptor = "Lfb;")
   @ObfuscatedName("av")
   public static final AuthenticationScheme TOKEN_REMEMBER = new AuthenticationScheme(4, 0);
   @ObfuscatedSignature(descriptor = "Lfb;")
   @ObfuscatedName("ae")
   public static final AuthenticationScheme field1744 = new AuthenticationScheme(0, 4);
   @ObfuscatedSignature(descriptor = "Lfb;")
   @ObfuscatedName("ag")
   public static final AuthenticationScheme TOKEN = new AuthenticationScheme(3, 2);
   @ObfuscatedName("ak")
   final int packetId;
   @ObfuscatedName("uh")
   static int field1747;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field1745 = 27;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field1746 = 34;

   AuthenticationScheme(int var1, int var2) {
      this.schemeId = 756629065 * var1;
      this.packetId = var2 * -192127823;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 1597795409 * this.packetId;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fb.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return 777136901 * this.packetId;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 1597795409 * this.packetId;
   }

   @ObfuscatedSignature(descriptor = "(Ldu;[II)I")
   @ObfuscatedName("wl")
   public static int method3951(VorbisFloor var0, int[] var1, int var2) {
      if (var0 == null) {
         var0.method3484(var1, var2);
      }

      int var3 = var1[var2];
      int var4 = -1;
      int var5 = Integer.MAX_VALUE;

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var1[var6];
         if (var7 > var3 && var7 < var5) {
            var4 = var6;
            var5 = var7;
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return 1597795409 * this.packetId;
   }
}
