import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wc")
public class LoginType {
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("aj")
   static final LoginType field6362 = new LoginType(2, 5, "", "");
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("at")
   static final LoginType field6357 = new LoginType(0, 1, "", "");
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("ag")
   static final LoginType field6358 = new LoginType(4, 2, "", "");
   @ObfuscatedName("au")
   final String field6355;
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("an")
   static final LoginType field6360 = new LoginType(3, 3, "", "");
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("av")
   public static final LoginType oldscape = new LoginType(5, 0, "", "");
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("ak")
   static final LoginType field6363 = new LoginType(8, 6, "", "");
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("ae")
   static final LoginType field6359 = new LoginType(1, 4, "", "");
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("ap")
   public static final LoginType field6361 = new LoginType(7, -1, "", "", true, new LoginType[]{oldscape, field6357, field6358, field6359, field6360});
   @ObfuscatedName("ay")
   final int field6354;
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("aw")
   static final LoginType field6364 = new LoginType(6, 7, "", "");

   @ObfuscatedSignature(descriptor = "(Lcg;IIB)V")
   @ObfuscatedName("at")
   static void runScript(ScriptEvent var0, int var1, int var2, byte var3) {
      Object[] var4 = var0.getArguments();
      if (var4 != null && var4.length > 0 && var4[0] instanceof JavaScriptCallback) {
         try {
            ((JavaScriptCallback)var4[0]).run(var0);
         } catch (Exception var17) {
            client.field938.error("Error in JavaScriptCallback", var17);
         }
      } else {
         try {
            client.field1009 = var0;
            int var9 = var2;
            int var8 = var1;
            ScriptEvent var7 = var0;
            byte var10 = -13;

            try {
               Object[] var11 = var7.args;
               Script var12;
               if (Sound.isWorldMapEvent(var7.type * -1166617615, 370508977)) {
                  if (var10 >= 16) {
                     throw new IllegalStateException();
                  }

                  AbstractSocket.worldMapEvent = (WorldMapEvent)var11[0];
                  WorldMapElement var13 = class463.WorldMapElement_get(AbstractSocket.worldMapEvent.mapElement * -1281703535, (byte)0);
                  var12 = WorldMapSectionType.getWorldMapScript(var7.type * -1166617615, 348284615 * var13.objectId, var13.category * -629421571, -1921805386);
               } else {
                  int var20 = (Integer)var11[0];
                  var12 = class383.getScript(var20, 257085052);
               }

               if (var12 != null) {
                  if (var10 >= 16) {
                     throw new IllegalStateException();
                  }

                  WorldViewManager.runScriptLogic(var7, var12, var8, var9, 1369353301);
               }
            } catch (RuntimeException var18) {
               throw RestClientThreadFactory.newRunException(var18, "wc.at(" + ')');
            }
         } finally {
            client.field1012 = null;
         }
      }
   }

   LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
      this.field6354 = var1 * -340792861;
      this.field6355 = var4;
   }

   @Override
   public String toString() {
      try {
         return this.field6355;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "wc.toString(" + ')');
      }
   }

   LoginType(int var1, int var2, String var3, String var4) {
      this.field6354 = -340792861 * var1;
      this.field6355 = var4;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method11673() {
      return this.field6355;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method11674() {
      return this.field6355;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwe;)V")
   @ObfuscatedName("ot")
   public static void method11676(DbTableType var0) {
      if (var0 == null) {
         var0.method11696();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lty;Lty;)I")
   @ObfuscatedName("st")
   public static int method11672(Ignored var0, Ignored var1) {
      return 1285081577 * var0.id - var1.id * 1285081577;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method11675() {
      return this.field6355;
   }
}
