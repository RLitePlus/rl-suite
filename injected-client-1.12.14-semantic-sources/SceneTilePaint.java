import java.awt.event.FocusEvent;
import java.util.Collections;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kz")
public final class SceneTilePaint implements net.runelite.api.SceneTilePaint {
   @ObfuscatedName("ae")
   int texture;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field3590 = 16384;
   @ObfuscatedName("ag")
   int neColor;
   @ObfuscatedName("an")
   int nwColor;
   @ObfuscatedName("ak")
   int rgb;
   @ObfuscatedName("ji")
   public int field3593;
   @ObfuscatedName("aj")
   boolean isFlat = true;
   @ObfuscatedName("zy")
   public int field3595;
   @ObfuscatedName("at")
   int seColor;
   @ObfuscatedSignature(descriptor = "[Lxt;")
   @ObfuscatedName("pl")
   static SpritePixels[] headIconHintSprites;
   @ObfuscatedName("py")
   public int field3594;
   @ObfuscatedName("gt")
   static int field3592;
   @ToRemove(unused = "true")
   @ObfuscatedName("dc")
   public static final int field3591 = 105;
   @ObfuscatedName("av")
   int swColor;

   public void setBufferLen(int var1) {
      this.field3595 = var1;
   }

   public void setSeColor(int var1) {
      this.seColor = var1 * 1305723521;
   }

   public int getNeColor() {
      return this.neColor * -120051743;
   }

   public void setBufferOffset(int var1) {
      this.field3594 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwb;)Ljava/util/Iterator;")
   @ObfuscatedName("pl")
   public static Iterator method6898(classWB var0) {
      return null == var0.field6353 ? Collections.emptyList().iterator() : var0.field6353.values().iterator();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltx;)V")
   @ObfuscatedName("pp")
   public static void method6899(HttpHeaders var0) {
      var0.acceptHeaderValues.remove("Content-Type");
   }

   public int getSeColor() {
      return this.seColor * -1789756031;
   }

   public int getBufferLen() {
      return this.field3595;
   }

   public int getUvBufferOffset() {
      return this.field3593;
   }

   public void setTexture(int var1) {
      this.texture = var1 * 1466665179;
   }

   public int getSwColor() {
      return this.swColor * -1705968521;
   }

   public int getNwColor() {
      return this.nwColor * 94297073;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V")
   @ObfuscatedName("be")
   static void method6901(int var0, String var1, int var2) {
      try {
         Login.Login_loadingText = var1;
         Login.Login_loadingPercent = -2106710917 * var0;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kz.be(" + ')');
      }
   }

   public void setSwColor(int var1) {
      this.swColor = var1 * -348938937;
   }

   public void setNwColor(int var1) {
      this.nwColor = var1 * 1477621009;
   }

   public void setUvBufferOffset(int var1) {
      this.field3593 = var1;
   }

   public int getBufferOffset() {
      return this.field3594;
   }

   public void setNeColor(int var1) {
      this.neColor = var1 * -7447519;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("ww")
   public static void method6900(GameEngine var0, FocusEvent var1) {
      if (var0 == null) {
         var0.start();
      } else {
         GameEngine.volatileFocus = false;
      }
   }

   public int getRBG() {
      return this.rgb * -453092939;
   }

   public boolean isFlat() {
      return this.isFlat;
   }

   public int getTexture() {
      return this.texture * -699583661;
   }

   SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.swColor = var1 * -348938937;
      this.seColor = 1305723521 * var2;
      this.neColor = -7447519 * var3;
      this.nwColor = var4 * 1477621009;
      this.texture = var5 * 1466665179;
      this.rgb = 1671728285 * var6;
      this.isFlat = var7;
   }
}
