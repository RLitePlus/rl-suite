import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ha")
public class NpcOverrides implements net.runelite.api.NpcOverrides {
   @ToRemove(unused = "true")
   @ObfuscatedName("ex")
   static final int field2151 = 5;
   @ObfuscatedName("at")
   int[] modelIds;
   @ObfuscatedName("ag")
   short[] recolorTo;
   @ObfuscatedName("an")
   short[] retextureTo;
   @ObfuscatedName("ae")
   public boolean useLocalPlayer = false;
   @ObfuscatedName("av")
   public long field2145;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field2150 = 17;

   public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
      this.field2145 = var1 * -972700585894046047L;
      this.modelIds = var3;
      this.recolorTo = var4;
      this.retextureTo = var5;
      this.useLocalPlayer = var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lni;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("wt")
   public static int method4442(class356 var0, Object var1, Object var2) {
      return var0 == null ? var0.method7758(var1, var1) : var0.method7755((classNR)var1, (classNR)var2, -1603958214);
   }

   public int[] getModelIds() {
      return this.modelIds;
   }

   public short[] getColorToReplaceWith() {
      return this.recolorTo;
   }

   public boolean useLocalPlayer() {
      return this.useLocalPlayer;
   }

   public short[] getTextureToReplaceWith() {
      return this.retextureTo;
   }

   @ObfuscatedSignature(descriptor = "(Lbf;I)V")
   @ObfuscatedName("pw")
   static void updateLoginState(LoginState var0, int var1) {
      try {
         if (var0 == AbstractWorldMapData.loginState) {
            if (var1 <= -1729845178) {
               throw new IllegalStateException();
            }
         } else {
            AbstractWorldMapData.loginState = var0;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ha.pw(" + ')');
      }
   }
}
