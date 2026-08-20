import java.awt.datatransfer.Clipboard;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.Preferences;
import net.runelite.api.events.VolumeChanged;
import net.runelite.api.events.VolumeChanged.Type;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cl")
public class ClientPreferences implements Preferences {
   @ObfuscatedName("ad")
   int soundEffectsVolume;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field632 = 320;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field630 = 419;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field633 = 10;
   @ObfuscatedName("ac")
   String rememberedUsername;
   @ObfuscatedName("ae")
   final Map parameters = new LinkedHashMap();
   @ObfuscatedName("ak")
   boolean hideUsername = false;
   @ObfuscatedName("aw")
   boolean titleMusicDisabled;
   @ObfuscatedName("ap")
   boolean displayFps = false;
   @ObfuscatedName("ay")
   int field629;
   @ObfuscatedName("au")
   double brightness = 0.8;
   @ObfuscatedName("az")
   int musicVolume = -134650361;
   @ObfuscatedName("ax")
   int drawDistance;
   @ObfuscatedName("aj")
   boolean roofsHidden;
   @ObfuscatedName("as")
   int eula;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field631 = 12;
   @ObfuscatedName("ab")
   int windowMode;
   @ObfuscatedName("ai")
   int areaSoundEffectsVolume;
   @ObfuscatedName("ar")
   boolean field622;

   ClientPreferences(Buffer var1) {
      this.method1680(-1);
      this.soundEffectsVolume = 526702093;
      this.method1677(-1);
      this.areaSoundEffectsVolume = 710176719;
      this.method1678(-1);
      this.eula = 1818664445;
      this.rememberedUsername = null;
      this.windowMode = -2111209315;
      this.drawDistance = -1330373493;
      this.field622 = true;
      if (var1 != null && var1.array != null) {
         int var2 = var1.readUnsignedByte(-1544276760);
         if (var2 >= 0 && var2 <= 12) {
            if (var1.readUnsignedByte(496373444) == 1) {
               this.roofsHidden = true;
            }

            if (var2 > 1) {
               this.titleMusicDisabled = var1.readUnsignedByte(772850829) == 1;
            }

            if (var2 > 3) {
               this.windowMode = var1.readUnsignedByte(2107080210) * -2111209315;
            }

            if (var2 > 2) {
               int var3 = var1.readUnsignedByte(-1580186860);

               for (int var4 = 0; var4 < var3; var4++) {
                  int var5 = Buffer.method12015(var1, -907484938);
                  int var6 = Buffer.method12015(var1, -461296611);
                  this.parameters.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.rememberedUsername = var1.readCESU8(792604665);
            }

            if (var2 > 5) {
               this.hideUsername = Buffer.method12022(var1, 2004535120);
            }

            if (var2 > 6) {
               this.brightness = var1.readUnsignedByte(2091585233) / 100.0;
               this.musicVolume = var1.readUnsignedByte(1635327230) * -2131634567;
               this.method1680(-1);
               this.soundEffectsVolume = var1.readUnsignedByte(-940844865) * 1728897907;
               this.method1677(-1);
               this.areaSoundEffectsVolume = var1.readUnsignedByte(-273335848) * -1516246863;
               this.method1678(-1);
            }

            if (var2 > 7) {
               this.eula = var1.readUnsignedByte(-455823122) * -1818664445;
            }

            if (var2 > 8) {
               this.displayFps = var1.readUnsignedByte(-1429882320) == 1;
            }

            if (var2 > 9) {
               this.field629 = Buffer.method12015(var1, -125767194) * 116147611;
            }

            if (var2 > 10) {
               this.drawDistance = var1.readUnsignedByte(-677851582) * 1321174595;
            }

            if (var2 > 11) {
               this.field622 = var1.readUnsignedByte(570190821) == 1;
            }
         } else {
            this.method1547(true, 2129436943);
         }
      } else {
         this.method1547(true, 1500293663);
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("at")
   void method1547(boolean var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxa;")
   @ObfuscatedName("ag")
   Buffer toBuffer(int var1) {
      try {
         Buffer var2 = new Buffer(419, true);
         var2.writeByte(12, (short)-14360);
         byte var10001;
         if (this.roofsHidden) {
            if (var1 != 940084945) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var2.writeByte(var10001, (short)-6306);
         if (this.titleMusicDisabled) {
            if (var1 != 940084945) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var2.writeByte(var10001, (short)-26473);
         var2.writeByte(this.windowMode * -802617931, (short)-12767);
         var2.writeByte(this.parameters.size(), (short)-29728);
         Iterator var3 = this.parameters.entrySet().iterator();

         while (var3.hasNext()) {
            if (var1 != 940084945) {
               throw new IllegalStateException();
            }

            Entry var4 = (Entry)var3.next();
            var2.writeInt((Integer)var4.getKey(), 1576237739);
            var2.writeInt((Integer)var4.getValue(), 1286549114);
         }

         String var7;
         if (null != this.rememberedUsername) {
            if (var1 != 940084945) {
               throw new IllegalStateException();
            }

            var7 = this.rememberedUsername;
         } else {
            var7 = "";
         }

         var2.writeStringCp1252NullTerminated(var7, 998990159);
         var2.writeBoolean(this.hideUsername, (byte)88);
         var2.writeByte((int)(100.0 * this.brightness), (short)-15616);
         var2.writeByte(-932662327 * this.musicVolume, (short)-19405);
         var2.writeByte(-713426501 * this.soundEffectsVolume, (short)-31574);
         var2.writeByte(this.areaSoundEffectsVolume * -592093103, (short)-18985);
         var2.writeByte(-1477191509 * this.eula, (short)-4533);
         if (this.displayFps) {
            if (var1 != 940084945) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var2.writeByte(var10001, (short)-28229);
         var2.writeInt(this.field629 * -2030004077, 1806217823);
         var2.writeByte(-2135918997 * this.drawDistance, (short)-31875);
         if (this.field622) {
            if (var1 != 940084945) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var2.writeByte(var10001, (short)-16397);
         return var2;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "cl.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("da")
   public int method1617() {
      return -339965069 * this.soundEffectsVolume;
   }

   @ObfuscatedSignature(descriptor = "(ZS)V")
   @ObfuscatedName("ae")
   void updateRoofsHidden(boolean var1, short var2) {
      try {
         this.roofsHidden = var1;
         Player.savePreferences((byte)-84);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ea")
   void method1614(int var1) {
      this.musicVolume = -2131634567 * var1;
      Player.savePreferences((byte)-76);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dh")
   int method1609() {
      return this.musicVolume * 255824028;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;B)I")
   @ObfuscatedName("qi")
   public static int method1623(ClientPreferences var0, byte var1) {
      if (var0 == null) {
         return var0.getAreaSoundEffectsVolume(var1);
      } else {
         try {
            return var0.areaSoundEffectsVolume * -592093103;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cl.al(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;I)Z")
   @ObfuscatedName("ry")
   public static boolean method1560(ClientPreferences var0, int var1) {
      if (var0 == null) {
         var0.isUsernameHidden(var1);
      }

      try {
         return var0.hideUsername;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bo")
   void updateWindowMode(int var1, int var2) {
      try {
         this.windowMode = var1 * -2111209315;
         Player.savePreferences((byte)-52);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("au")
   boolean isDisplayingFps(int var1) {
      try {
         return this.displayFps;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   int method1595(int var1) {
      try {
         return this.field629 * -2030004077;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cn")
   void method1574(boolean var1) {
      this.titleMusicDisabled = var1;
      Player.savePreferences((byte)-11);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ev")
   boolean method1668() {
      return this.field622;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("ac")
   void updateBrightness(double var1) {
      try {
         this.brightness = var1;
         Player.savePreferences((byte)-6);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fa")
   public void method1677(int var1) {
      SecureUrlRequester.client.getCallbacks().post(new VolumeChanged(Type.EFFECTS));
   }

   @ObfuscatedSignature(descriptor = "(Lcl;II)V")
   @ObfuscatedName("ya")
   public static void method1661(ClientPreferences var0, int var1, int var2) {
      if (var0 == null) {
         var0.setDrawDistance(var1, var1);
      } else {
         try {
            var0.drawDistance = var1 * 1321174595;
            if (Occluder.topLevelWorldView != null) {
               if (var2 == 762513858) {
                  return;
               }

               Occluder.topLevelWorldView.scene.method5572(class468.clientPreferences.getDrawDistance((byte)-33));
            }

            Player.savePreferences((byte)-94);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "cl.bb(" + ')');
         }
      }
   }

   public String getRememberedUsername() {
      return this.rememberedUsername;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("jq")
   public boolean method1681() {
      return this.roofsHidden;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ab")
   int getMusicVolume(byte var1) {
      try {
         return this.musicVolume * -932662327;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ax")
   void updateMusicVolume(int var1, int var2) {
      try {
         this.musicVolume = -2131634567 * var1;
         this.method1680(-1);
         Player.savePreferences((byte)-127);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ah")
   void updateSoundEffectVolume(int var1, int var2) {
      try {
         this.soundEffectsVolume = 1728897907 * var1;
         this.method1677(-1);
         Player.savePreferences((byte)-50);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("af")
   void updateAreaSoundEffectsVolume(int var1, int var2) {
      try {
         this.areaSoundEffectsVolume = -1516246863 * var1;
         this.method1678(-1);
         Player.savePreferences((byte)-77);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;I)V")
   @ObfuscatedName("qh")
   public static void method1662(ClientPreferences var0, int var1) {
      if (var0 == null) {
         var0.method1643(var1);
      }

      var0.drawDistance = var1 * 1097188205;
      if (Occluder.topLevelWorldView != null) {
         Occluder.topLevelWorldView.scene.method5572(class468.clientPreferences.getDrawDistance((byte)-4));
      }

      Player.savePreferences((byte)-32);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("am")
   String getRememberedUsername(int var1) {
      try {
         return this.rememberedUsername;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.am(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;Z)V")
   @ObfuscatedName("vk")
   public static void method1575(ClientPreferences var0, boolean var1) {
      if (var0 == null) {
         var0.method1688();
      }

      var0.titleMusicDisabled = var1;
      Player.savePreferences((byte)-46);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("ao")
   void updateRememberedUsername(String var1, byte var2) {
      try {
         this.rememberedUsername = var1;
         Player.savePreferences((byte)-34);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aa")
   int getEULA(byte var1) {
      try {
         return -1477191509 * this.eula;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aq")
   void method1638(int var1, int var2) {
      try {
         this.eula = -1818664445 * var1;
         Player.savePreferences((byte)-63);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("be")
   int getWindowMode(byte var1) {
      try {
         return this.windowMode * -802617931;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.be(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cb")
   public void method1678(int var1) {
      SecureUrlRequester.client.getCallbacks().post(new VolumeChanged(Type.AREA));
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   boolean isRoofsHidden(int var1) {
      try {
         return this.roofsHidden;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("bg")
   void put(String var1, int var2, int var3) {
      try {
         int var4 = method1657(this, var1, 367286291);
         if (this.parameters.size() >= 10) {
            if (var3 <= 1839063334) {
               return;
            }

            if (!this.parameters.containsKey(var4)) {
               if (var3 <= 1839063334) {
                  throw new IllegalStateException();
               }

               Iterator var5 = this.parameters.entrySet().iterator();
               var5.next();
               var5.remove();
            }
         }

         this.parameters.put(var4, var2);
         Player.savePreferences((byte)-75);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cl.bg(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;I)V")
   @ObfuscatedName("dz")
   public static void method1639(ClientPreferences var0, int var1) {
      if (var0 == null) {
         var0.method1681();
      }

      var0.eula = 1825891482 * var1;
      Player.savePreferences((byte)-68);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I")
   @ObfuscatedName("bz")
   int getParameterValue(String var1, byte var2) {
      try {
         int var3 = method1657(this, var1, 643266460);
         if (!this.parameters.containsKey(var3)) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return (Integer)this.parameters.get(var3);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cl.bz(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   boolean method1561() {
      return this.hideUsername;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dt")
   int method1611() {
      return this.musicVolume * -932662327;
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ap")
   void updateTitleMusicDisabled(boolean var1, int var2) {
      try {
         this.titleMusicDisabled = var1;
         Player.savePreferences((byte)-17);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bm")
   boolean method1669(int var1) {
      try {
         return this.field622;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("en")
   public int method1682() {
      return this.eula * -1477191509;
   }

   @ObfuscatedSignature(descriptor = "()Lxa;")
   @ObfuscatedName("bn")
   Buffer method1550() {
      Buffer var1 = new Buffer(419, true);
      var1.writeByte(12, (short)-23145);
      var1.writeByte(this.roofsHidden ? 1 : 0, (short)-15268);
      var1.writeByte(this.titleMusicDisabled ? 1 : 0, (short)-7779);
      var1.writeByte(this.windowMode * -802617931, (short)-30125);
      var1.writeByte(this.parameters.size(), (short)-21295);

      for (Entry var3 : this.parameters.entrySet()) {
         var1.writeInt((Integer)var3.getKey(), 1702114635);
         var1.writeInt((Integer)var3.getValue(), 1604329747);
      }

      var1.writeStringCp1252NullTerminated(null != this.rememberedUsername ? this.rememberedUsername : "", 998990159);
      var1.writeBoolean(this.hideUsername, (byte)40);
      var1.writeByte((int)(100.0 * this.brightness), (short)-32124);
      var1.writeByte(-932662327 * this.musicVolume, (short)-15315);
      var1.writeByte(-713426501 * this.soundEffectsVolume, (short)-31353);
      var1.writeByte(this.areaSoundEffectsVolume * -592093103, (short)-13881);
      var1.writeByte(810051964 * this.eula, (short)-24508);
      var1.writeByte(this.displayFps ? 1 : 0, (short)-10116);
      var1.writeInt(this.field629 * -2030004077, 21383808);
      var1.writeByte(1584288748 * this.drawDistance, (short)-9229);
      var1.writeByte(this.field622 ? 1 : 0, (short)-22697);
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   static void method1544() {
      AccessFile var0 = null;

      try {
         var0 = HttpMethod.getPreferencesFile("", class520.field6071.name, true, (byte)61);
         Buffer var1 = class468.clientPreferences.toBuffer(940084945);
         AccessFile.method11798(var0, var1.array, 0, var1.offset * -973020368, (byte)-1);
      } catch (Exception var3) {
      }

      try {
         if (null != var0) {
            AccessFile.method11807(var0, true, (byte)-6);
         }
      } catch (Exception var2) {
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   void method1581() {
      method1591(this, !this.displayFps, -2130439869);
   }

   public void setSoundEffectVolume(int var1) {
      this.soundEffectsVolume = var1 * 1728897907;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   static void method1545() {
      AccessFile var0 = null;

      try {
         var0 = HttpMethod.getPreferencesFile("", class520.field6071.name, true, (byte)61);
         Buffer var1 = class468.clientPreferences.toBuffer(940084945);
         AccessFile.method11798(var0, var1.array, 0, var1.offset * 2108391709, (byte)-68);
      } catch (Exception var3) {
      }

      try {
         if (null != var0) {
            AccessFile.method11807(var0, true, (byte)-30);
         }
      } catch (Exception var2) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bi")
   void method1548(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Lxa;")
   @ObfuscatedName("by")
   Buffer method1551() {
      Buffer var1 = new Buffer(1989330776, true);
      var1.writeByte(12, (short)-30199);
      var1.writeByte(this.roofsHidden ? 1 : 0, (short)-25753);
      var1.writeByte(this.titleMusicDisabled ? 1 : 0, (short)-16496);
      var1.writeByte(this.windowMode * 469075199, (short)-3221);
      var1.writeByte(this.parameters.size(), (short)-7937);

      for (Entry var3 : this.parameters.entrySet()) {
         var1.writeInt((Integer)var3.getKey(), 2101797371);
         var1.writeInt((Integer)var3.getValue(), 441012696);
      }

      var1.writeStringCp1252NullTerminated(null != this.rememberedUsername ? this.rememberedUsername : "", 998990159);
      var1.writeBoolean(this.hideUsername, (byte)33);
      var1.writeByte((int)(100.0 * this.brightness), (short)-22378);
      var1.writeByte(152561838 * this.musicVolume, (short)-26942);
      var1.writeByte(-219920476 * this.soundEffectsVolume, (short)-1341);
      var1.writeByte(this.areaSoundEffectsVolume * 1334253267, (short)-25953);
      var1.writeByte(-1477191509 * this.eula, (short)-28047);
      var1.writeByte(this.displayFps ? 1 : 0, (short)-2231);
      var1.writeInt(this.field629 * 607488132, 819866073);
      var1.writeByte(1988824289 * this.drawDistance, (short)-11345);
      var1.writeByte(this.field622 ? 1 : 0, (short)-30196);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   void method1582() {
      method1591(this, !this.displayFps, 185221026);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("br")
   boolean method1556() {
      return this.roofsHidden;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bh")
   void method1558(boolean var1) {
      this.roofsHidden = var1;
      Player.savePreferences((byte)-20);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ek")
   void method1648(String var1, int var2) {
      int var3 = method1657(this, var1, 591582855);
      if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
         Iterator var4 = this.parameters.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.parameters.put(var3, var2);
      Player.savePreferences((byte)-96);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bq")
   boolean method1562() {
      return this.hideUsername;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   boolean method1563() {
      return this.hideUsername;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   boolean method1564() {
      return this.hideUsername;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ch")
   void method1566(boolean var1) {
      this.hideUsername = var1;
      Player.savePreferences((byte)-80);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cu")
   void method1567(boolean var1) {
      this.hideUsername = var1;
      Player.savePreferences((byte)-71);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ct")
   void method1568(boolean var1) {
      this.hideUsername = var1;
      Player.savePreferences((byte)-116);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cm")
   boolean method1571() {
      return this.titleMusicDisabled;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   boolean method1572() {
      return this.titleMusicDisabled;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)Z")
   @ObfuscatedName("hu")
   public static boolean method1590(ClientPreferences var0) {
      return var0.displayFps;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;I)V")
   @ObfuscatedName("rf")
   public static void method1640(ClientPreferences var0, int var1) {
      if (var0 == null) {
         var0.method1643(var1);
      }

      var0.eula = 163450851 * var1;
      Player.savePreferences((byte)-123);
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("dv")
   void method1606(double var1) {
      this.brightness = var1;
      Player.savePreferences((byte)-80);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ri")
   public boolean method1683() {
      return this.titleMusicDisabled;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;ZI)V")
   @ObfuscatedName("qm")
   public static void method1591(ClientPreferences var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.updateDisplayFps(var1, var2);
      }

      try {
         var0.displayFps = var1;
         Player.savePreferences((byte)-29);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cc")
   void method1577(boolean var1) {
      this.titleMusicDisabled = var1;
      Player.savePreferences((byte)-88);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;Z)V")
   @ObfuscatedName("lu")
   public static void method1592(ClientPreferences var0, boolean var1) {
      if (var0 == null) {
         var0.method1676(var1);
      }

      var0.displayFps = var1;
      Player.savePreferences((byte)-107);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ee")
   void method1616(int var1) {
      this.musicVolume = -2131634567 * var1;
      Player.savePreferences((byte)-52);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cg")
   void method1583() {
      method1591(this, !this.displayFps, -1738070565);
   }

   @ObfuscatedSignature(descriptor = "(Lcl;Ljava/lang/String;I)I")
   @ObfuscatedName("lz")
   public static int method1657(ClientPreferences var0, String var1, int var2) {
      if (var0 == null) {
         return var0.getParameterKey(var1, var2);
      } else {
         try {
            String var4 = var1.toLowerCase();
            int var5 = var4.length();
            int var6 = 0;

            for (int var7 = 0; var7 < var5; var7++) {
               if (var2 == 825809917) {
                  throw new IllegalStateException();
               }

               var6 = (var6 << 5) - var6 + var4.charAt(var7);
            }

            return var6;
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "cl.bk(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("rn")
   public int method1684() {
      return this.windowMode * -802617931;
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("ch")
   public double method1685() {
      return this.brightness;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cy")
   void method1593(boolean var1) {
      this.displayFps = var1;
      Player.savePreferences((byte)-77);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   void method1584() {
      method1591(this, !this.displayFps, -257603194);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   void method1585() {
      method1591(this, !this.displayFps, -2091797415);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ph")
   public void method1686(int var1) {
      this.musicVolume = var1 * -2131634567;
   }

   @ObfuscatedSignature(descriptor = "(I)D")
   @ObfuscatedName("as")
   double getBrightness(int var1) {
      try {
         return this.brightness;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;Ljava/lang/String;B)Z")
   @ObfuscatedName("ga")
   public static boolean method1650(ClientPreferences var0, String var1, byte var2) {
      if (var0 == null) {
         return var0.containsKey(var1, var2);
      } else {
         try {
            int var3 = method1657(var0, var1, 1410909417);
            return var0.parameters.containsKey(var3);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "cl.bs(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)Lxa;")
   @ObfuscatedName("is")
   public static Buffer method1552(ClientPreferences var0) {
      if (var0 == null) {
         var0.method1554();
      }

      Buffer var1 = new Buffer(419, true);
      var1.writeByte(12, (short)-23490);
      var1.writeByte(var0.roofsHidden ? 1 : 0, (short)-23220);
      var1.writeByte(var0.titleMusicDisabled ? 1 : 0, (short)-29672);
      var1.writeByte(var0.windowMode * -802617931, (short)-8246);
      var1.writeByte(var0.parameters.size(), (short)-12401);

      for (Entry var3 : var0.parameters.entrySet()) {
         var1.writeInt((Integer)var3.getKey(), 429657715);
         var1.writeInt((Integer)var3.getValue(), 167947349);
      }

      var1.writeStringCp1252NullTerminated(null != var0.rememberedUsername ? var0.rememberedUsername : "", 998990159);
      var1.writeBoolean(var0.hideUsername, (byte)113);
      var1.writeByte((int)(100.0 * var0.brightness), (short)-13987);
      var1.writeByte(-932662327 * var0.musicVolume, (short)-16095);
      var1.writeByte(-713426501 * var0.soundEffectsVolume, (short)-20212);
      var1.writeByte(var0.areaSoundEffectsVolume * -592093103, (short)-31968);
      var1.writeByte(-1477191509 * var0.eula, (short)-13038);
      var1.writeByte(var0.displayFps ? 1 : 0, (short)-18348);
      var1.writeInt(var0.field629 * -2030004077, 1073200182);
      var1.writeByte(-2135918997 * var0.drawDistance, (short)-3528);
      var1.writeByte(var0.field622 ? 1 : 0, (short)-31621);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cf")
   void method1594(boolean var1) {
      this.displayFps = var1;
      Player.savePreferences((byte)-32);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bl")
   void method1559(boolean var1) {
      this.roofsHidden = var1;
      Player.savePreferences((byte)-104);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   int method1596() {
      return this.field629 * 1457126410;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   int method1597() {
      return this.field629 * 102139193;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("do")
   int method1634() {
      return -1477191509 * this.eula;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("rv")
   public boolean method1687() {
      return this.displayFps;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)V")
   @ObfuscatedName("vx")
   public static void method1586(ClientPreferences var0) {
      method1591(var0, !var0.displayFps, 1310575283);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   void toggleDisplayFps(int var1) {
      this.field629 = 116147611 * var1;
      Player.savePreferences((byte)-84);
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("dw")
   double method1602() {
      return this.brightness;
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("cl")
   double method1603() {
      return this.brightness;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;ZI)V")
   @ObfuscatedName("bl")
   public static void method1569(ClientPreferences var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.updateHideUsername(var1, var2);
      } else {
         try {
            var0.hideUsername = var1;
            Player.savePreferences((byte)-68);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "cl.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;I)V")
   @ObfuscatedName("ek")
   public static void method1587(ClientPreferences var0, int var1) {
      if (var0 == null) {
         var0.method1588(var1);
      }

      try {
         boolean var10001;
         if (!var0.displayFps) {
            if (var1 >= 2098028917) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         method1591(var0, var10001, 501689734);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("dd")
   double method1604() {
      return this.brightness;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("dm")
   String method1629() {
      return this.rememberedUsername;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Log;)[I")
   @ObfuscatedName("wy")
   public static int[] method1543(class380 var0) {
      return Arrays.copyOf(var0.field4607, 117389541 * var0.field4613);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)Ljava/awt/datatransfer/Clipboard;")
   @ObfuscatedName("on")
   public static Clipboard method1580(GameEngine var0) {
      return var0.clipboard;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("df")
   void method1607(double var1) {
      this.brightness = var1;
      Player.savePreferences((byte)-15);
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("dy")
   void method1608(double var1) {
      this.brightness = var1;
      Player.savePreferences((byte)-87);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dc")
   int method1612() {
      return this.musicVolume * -932662327;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dl")
   public int method1618() {
      return -713426501 * this.soundEffectsVolume;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cj")
   void method1641(int var1) {
      this.eula = -1818664445 * var1;
      Player.savePreferences((byte)-56);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dj")
   public int method1619() {
      return -713426501 * this.soundEffectsVolume;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ec")
   void method1599(int var1) {
      this.field629 = 116147611 * var1;
      Player.savePreferences((byte)-53);
   }

   @ObfuscatedSignature(descriptor = "()Lxa;")
   @ObfuscatedName("bw")
   Buffer method1553() {
      Buffer var1 = new Buffer(419, true);
      var1.writeByte(12, (short)-28485);
      var1.writeByte(this.roofsHidden ? 1 : 0, (short)-118);
      var1.writeByte(this.titleMusicDisabled ? 1 : 0, (short)-26396);
      var1.writeByte(this.windowMode * -802617931, (short)-19081);
      var1.writeByte(this.parameters.size(), (short)-1138);

      for (Entry var3 : this.parameters.entrySet()) {
         var1.writeInt((Integer)var3.getKey(), 1847190975);
         var1.writeInt((Integer)var3.getValue(), 347403339);
      }

      var1.writeStringCp1252NullTerminated(null != this.rememberedUsername ? this.rememberedUsername : "", 998990159);
      var1.writeBoolean(this.hideUsername, (byte)26);
      var1.writeByte((int)(100.0 * this.brightness), (short)-1120);
      var1.writeByte(-932662327 * this.musicVolume, (short)-1987);
      var1.writeByte(-713426501 * this.soundEffectsVolume, (short)-23213);
      var1.writeByte(this.areaSoundEffectsVolume * 783003167, (short)-9725);
      var1.writeByte(2021161191 * this.eula, (short)-17205);
      var1.writeByte(this.displayFps ? 1 : 0, (short)-31728);
      var1.writeInt(this.field629 * -898143593, 2014447494);
      var1.writeByte(-2135918997 * this.drawDistance, (short)-8434);
      var1.writeByte(this.field622 ? 1 : 0, (short)-11875);
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;Ljava/lang/String;)I")
   @ObfuscatedName("gr")
   public static int method1655(ClientPreferences var0, String var1) {
      if (var0 == null) {
         var0.method1564();
      }

      int var2 = method1657(var0, var1, -451643446);
      return !var0.parameters.containsKey(var2) ? 0 : (Integer)var0.parameters.get(var2);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("et")
   void method1626(int var1) {
      this.areaSoundEffectsVolume = -1516246863 * var1;
      Player.savePreferences((byte)-65);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dr")
   public int method1624() {
      return this.areaSoundEffectsVolume * -1926120474;
   }

   public int getSoundEffectVolume() {
      return this.soundEffectsVolume * -713426501;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ai")
   void updateEULA(int var1, byte var2) {
      try {
         this.field629 = 116147611 * var1;
         Player.savePreferences((byte)-77);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aw")
   boolean isTitleMusicDisabled(int var1) {
      try {
         return this.titleMusicDisabled;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("dp")
   String method1630() {
      return this.rememberedUsername;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("du")
   String method1631() {
      return this.rememberedUsername;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nh")
   public int method1688() {
      return this.musicVolume * -932662327;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("es")
   int method1645() {
      return this.windowMode * -802617931;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fg")
   public void method1680(int var1) {
      SecureUrlRequester.client.getCallbacks().post(new VolumeChanged(Type.MUSIC));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("de")
   int method1635() {
      return -1477191509 * this.eula;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("em")
   int method1656(String var1) {
      int var2 = method1657(this, var1, 318760221);
      return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dk")
   int method1636() {
      return -1477191509 * this.eula;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dn")
   int method1637() {
      return -1477191509 * this.eula;
   }

   @ObfuscatedSignature(descriptor = "(Lcl;I)I")
   @ObfuscatedName("bz")
   public static int method1620(ClientPreferences var0, int var1) {
      if (var0 == null) {
         return var0.getSoundEffectsVolume(var1);
      } else {
         try {
            return -713426501 * var0.soundEffectsVolume;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cl.ar(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dx")
   void method1642(int var1) {
      this.eula = -1818664445 * var1;
      Player.savePreferences((byte)-97);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("db")
   int method1613() {
      return this.musicVolume * -932662327;
   }

   @ObfuscatedSignature(descriptor = "()Lxa;")
   @ObfuscatedName("sf")
   public Buffer method1689() {
      return this.toBuffer(940084945);
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bp")
   void method1671(boolean var1, int var2) {
      try {
         this.field622 = var1;
         Player.savePreferences((byte)-16);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("er")
   void method1649(String var1, int var2) {
      int var3 = method1657(this, var1, -2108731517);
      if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
         Iterator var4 = this.parameters.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.parameters.put(var3, var2);
      Player.savePreferences((byte)-98);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ce")
   void method1570(boolean var1) {
      this.hideUsername = var1;
      Player.savePreferences((byte)-72);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)I")
   @ObfuscatedName("qz")
   public static int method1665(ClientPreferences var0) {
      return -2135918997 * var0.drawDistance;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("ej")
   boolean method1651(String var1) {
      int var2 = method1657(this, var1, -322929163);
      return this.parameters.containsKey(var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("ew")
   boolean method1652(String var1) {
      int var2 = method1657(this, var1, 1890462995);
      return this.parameters.containsKey(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   static void method1546() {
      AccessFile var0 = null;

      try {
         var0 = HttpMethod.getPreferencesFile("", class520.field6071.name, true, (byte)61);
         Buffer var1 = class468.clientPreferences.toBuffer(940084945);
         AccessFile.method11798(var0, var1.array, 0, var1.offset * 2108391709, (byte)-17);
      } catch (Exception var3) {
      }

      try {
         if (null != var0) {
            AccessFile.method11807(var0, true, (byte)-24);
         }
      } catch (Exception var2) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("el")
   int method1658(String var1) {
      String var3 = var1.toLowerCase();
      int var4 = var3.length();
      int var5 = 0;

      for (int var6 = 0; var6 < var4; var6++) {
         var5 = (var5 << 5) - var5 + var3.charAt(var6);
      }

      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ep")
   int method1659(String var1) {
      String var3 = var1.toLowerCase();
      int var4 = var3.length();
      int var5 = 0;

      for (int var6 = 0; var6 < var4; var6++) {
         var5 = (var5 << 5) - var5 + var3.charAt(var6);
      }

      return var5;
   }

   public boolean getHideUsername() {
      return this.hideUsername;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dz")
   void method1663(int var1) {
      this.drawDistance = var1 * 1321174595;
      if (Occluder.topLevelWorldView != null) {
         Occluder.topLevelWorldView.scene.method5572(class468.clientPreferences.getDrawDistance((byte)-18));
      }

      Player.savePreferences((byte)-128);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bj")
   int getDrawDistance(byte var1) {
      try {
         return -2135918997 * this.drawDistance;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.bj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("eh")
   void method1672(boolean var1) {
      this.field622 = var1;
      Player.savePreferences((byte)-61);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ez")
   boolean method1670() {
      return this.field622;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ca")
   void method1627(int var1) {
      this.areaSoundEffectsVolume = -1516246863 * var1;
      Player.savePreferences((byte)-49);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("eo")
   void method1673(boolean var1) {
      this.field622 = var1;
      Player.savePreferences((byte)-46);
   }

   ClientPreferences() {
      this.method1680(-1);
      this.soundEffectsVolume = 526702093;
      this.method1677(-1);
      this.areaSoundEffectsVolume = 710176719;
      this.method1678(-1);
      this.eula = 1818664445;
      this.rememberedUsername = null;
      this.windowMode = -2111209315;
      this.drawDistance = -1330373493;
      this.field622 = true;
      this.method1547(true, 1923244014);
      this.method1679();
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("en")
   void method1674(boolean var1) {
      this.field622 = var1;
      Player.savePreferences((byte)-105);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("eb")
   void method1675(boolean var1) {
      this.field622 = var1;
      Player.savePreferences((byte)-110);
   }

   public int getAreaSoundEffectVolume() {
      return this.areaSoundEffectsVolume * -592093103;
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ak")
   void updateHideUsername(boolean var1, int var2) {
      try {
         this.hideUsername = var1;
         Player.savePreferences((byte)-17);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bb")
   void setDrawDistance(int var1, int var2) {
      try {
         this.windowMode = var1 * 1321174595;
         if (Occluder.topLevelWorldView != null) {
            if (var2 == 762513858) {
               return;
            }

            Occluder.topLevelWorldView.scene.method5768(class468.clientPreferences.getWindowMode((byte)-33));
         }

         Player.savePreferences((byte)-94);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public int getSoundEffectsVolume(int var1) {
      try {
         return -713426501 * this.soundEffectsVolume;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.ar(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qe")
   public int method1690() {
      return this.field629 * -2030004077;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("zq")
   public void method1679() {
      this.windowMode = 2 * -2111209315;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("al")
   public int getAreaSoundEffectsVolume(byte var1) {
      try {
         return -2135918997 * this.drawDistance;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.bj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Z")
   @ObfuscatedName("bs")
   boolean containsKey(String var1, byte var2) {
      try {
         int var3 = method1657(this, var1, 1410909417);
         return this.parameters.containsKey(var3);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cl.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("di")
   void method1588(int var1) {
      try {
         boolean var10001;
         if (!this.titleMusicDisabled) {
            if (var1 >= 2098028917) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         method1591(this, var10001, 501689734);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.ay(" + ')');
      }
   }

   public void setRememberedUsername(String var1) {
      this.rememberedUsername = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lxa;")
   @ObfuscatedName("bf")
   Buffer method1554() {
      Buffer var1 = new Buffer(1989330776, true);
      var1.writeByte(12, (short)-30199);
      var1.writeByte(this.roofsHidden ? 1 : 0, (short)-25753);
      var1.writeByte(this.roofsHidden ? 1 : 0, (short)-16496);
      var1.writeByte(this.musicVolume * 469075199, (short)-3221);
      var1.writeByte(this.parameters.size(), (short)-7937);

      for (Entry var3 : this.parameters.entrySet()) {
         var1.writeByteAdd((Integer)var3.getKey(), 2101797371);
         var1.writeLengthByte((Integer)var3.getValue(), 441012696);
      }

      var1.writeStringCp1252NullTerminated(null != this.rememberedUsername ? this.rememberedUsername : "", 998990159);
      var1.writeBoolean(this.hideUsername, (byte)33);
      var1.writeByte((int)(100.0 * this.brightness), (short)-22378);
      var1.writeByte(152561838 * this.soundEffectsVolume, (short)-26942);
      var1.writeByte(-219920476 * this.field629, (short)-1341);
      var1.writeByte(this.areaSoundEffectsVolume * 1334253267, (short)-25953);
      var1.writeByte(-1477191509 * this.field629, (short)-28047);
      var1.writeByte(this.field622 ? 1 : 0, (short)-2231);
      var1.writeShortAddLE(this.soundEffectsVolume * 607488132, 819866073);
      var1.writeByte(1988824289 * this.eula, (short)-11345);
      var1.writeByte(this.roofsHidden ? 1 : 0, (short)-30196);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("bk")
   int getParameterKey(String var1, int var2) {
      try {
         String var4 = var1.toLowerCase();
         int var5 = var4.length();
         int var6 = 0;

         for (int var7 = 0; var7 < var5; var7++) {
            if (var2 == 825809917) {
               throw new IllegalStateException();
            }

            var6 = (var6 << 5) - var6 + var4.charAt(var7);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cl.bk(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cq")
   void method1676(boolean var1) {
      this.field622 = var1;
      Player.savePreferences((byte)-110);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean isUsernameHidden(int var1) {
      try {
         return this.hideUsername;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cl.aj(" + ')');
      }
   }

   public void setAreaSoundEffectVolume(int var1) {
      this.areaSoundEffectsVolume = var1 * -1516246863;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dq")
   void method1643(int var1) {
      this.areaSoundEffectsVolume = 163450851 * var1;
      Player.savePreferences((byte)-123);
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("az")
   void updateDisplayFps(boolean var1, int var2) {
      try {
         this.field622 = var1;
         Player.savePreferences((byte)-17);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cl.ap(" + ')');
      }
   }
}
