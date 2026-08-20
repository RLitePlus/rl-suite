import java.util.Arrays;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.BeforeMenuRender;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wz")
public class Menu implements net.runelite.api.Menu {
   @ObfuscatedName("jf")
   public int field6818;
   @ObfuscatedName("ad")
   int field6812;
   @ObfuscatedName("im")
   public int field6796;
   @ObfuscatedName("af")
   public int field6797;
   @ObfuscatedName("ac")
   public final int[] field6798;
   @ObfuscatedName("ax")
   public final int[] field6799;
   @ObfuscatedName("gz")
   public final int field6808;
   @ObfuscatedName("as")
   public final int[] menuIdentifiers;
   @ObfuscatedName("ab")
   public final int[] field6801;
   @ObfuscatedName("ae")
   public final int[] menuArguments2;
   @ObfuscatedName("ag")
   public final int[] menuOpcodes;
   @ObfuscatedName("aa")
   public final String[] field6804;
   @ObfuscatedSignature(descriptor = "[Lrl5;")
   @ObfuscatedName("le")
   public final rl5[] field6809;
   @ObfuscatedName("az")
   boolean field6810;
   @ObfuscatedName("ar")
   long field6819;
   @ObfuscatedName("aj")
   public final boolean[] field6807;
   @ObfuscatedName("ay")
   int field6817;
   @ObfuscatedName("ao")
   public final String[] field6805;
   @ObfuscatedName("au")
   int field6816;
   @ObfuscatedName("ap")
   int field6814;
   @ObfuscatedSignature(descriptor = "[Lwz;")
   @ObfuscatedName("al")
   public final Menu[] subMenus;
   @ObfuscatedName("ai")
   int field6813;
   @ObfuscatedName("fo")
   public int field6795 = -1;
   @ObfuscatedName("aq")
   int field6815;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   public final void method12676() {
      this.method12680(-781508173);
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ae")
   public final void method12653(int var1, int var2, byte var3) {
      try {
         classSV.method10696(this, -156515775);
         this.field6817 = 602060077 * (var1 - 1308041153 * this.field6812 / 2);
         if (this.field6812 * 1308041153 + 727605925 * this.field6817 > 773246731 * classSA.field5897) {
            if (var3 != 0) {
               return;
            }

            this.field6817 = classSA.field5897 * -2095371281 - this.field6812 * -649721363;
         }

         if (this.field6817 * 727605925 < 0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            this.field6817 = 0;
         }

         this.field6815 = var2 * -317857149;
         if (this.field6815 * 1457978411 + this.field6814 * -531540521 > IntProjection.field1938 * 8379747) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            this.field6815 = IntProjection.field1938 * 132558761 - -28198139 * this.field6814;
         }

         if (1457978411 * this.field6815 < 0) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            this.field6815 = 0;
         }

         if (this.field6816 * -1985221643 != -1) {
            if (var3 != 0) {
               return;
            }

            if (null != this.subMenus[this.field6816 * -1985221643]) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               this.subMenus[this.field6816 * -1985221643].method12700(this, (short)4036);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "wz.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ap")
   public final String method12645(int var1) {
      if (var1 < 0) {
         return "";
      } else {
         return !this.field6805[var1].isEmpty() ? this.field6804[var1] + classKK.field3785 + this.field6805[var1] : this.field6804[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwz;S)V")
   @ObfuscatedName("ab")
   final void method12700(Menu var1, short var2) {
      this.method12691(var1);
      this.field6817 = (var1.field6812 * 1308041153 + var1.field6817 * 727605925) * 602060077;
      if (this.field6817 * 727605925 + this.field6812 * 1308041153 > classSA.field5897 * 773246731) {
         this.field6817 = (var1.field6817 * 727605925 - this.field6812 * 1308041153) * 602060077;
      }

      if (this.field6817 * 727605925 < 0) {
         this.field6817 = 0 * 602060077;
      }

      assert var1 == client.menu;

      this.field6815 = (var1.field6815 * 1457978411 + (var1.field6797 * -1927903443 - 1 - var1.field6816 * -1985221643 - client.field1087) * 15) * -317857149;
      if (this.field6814 * -531540521 + this.field6815 * 1457978411 > IntProjection.field1938 * 8379747) {
         this.field6815 = (IntProjection.field1938 * 8379747 - this.field6814 * -531540521) * -317857149;
      }

      if (this.field6815 * 1457978411 < 0) {
         this.field6815 = 0 * -317857149;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("di")
   public void method12699(int var1, int var2) {
      assert var1 != var2;

      String var3 = this.field6804[var1];
      this.field6804[var1] = this.field6804[var2];
      this.field6804[var2] = var3;
      var3 = this.field6805[var1];
      this.field6805[var1] = this.field6805[var2];
      this.field6805[var2] = var3;
      int var4 = this.field6801[var1];
      this.field6801[var1] = this.field6801[var2];
      this.field6801[var2] = var4;
      var4 = this.menuIdentifiers[var1];
      this.menuIdentifiers[var1] = this.menuIdentifiers[var2];
      this.menuIdentifiers[var2] = var4;
      var4 = this.field6798[var1];
      this.field6798[var1] = this.field6798[var2];
      this.field6798[var2] = var4;
      var4 = this.field6799[var1];
      this.field6799[var1] = this.field6799[var2];
      this.field6799[var2] = var4;
      var4 = this.menuArguments2[var1];
      this.menuArguments2[var1] = this.menuArguments2[var2];
      this.menuArguments2[var2] = var4;
      var4 = this.menuOpcodes[var1];
      this.menuOpcodes[var1] = this.menuOpcodes[var2];
      this.menuOpcodes[var2] = var4;
      boolean var5 = this.field6807[var1];
      this.field6807[var1] = this.field6807[var2];
      this.field6807[var2] = var5;
      Menu var6 = this.subMenus[var1];
      this.subMenus[var1] = this.subMenus[var2];
      this.subMenus[var2] = var6;

      assert this.field6809[var1].field5801 == this;

      assert this.field6809[var2].field5801 == this;

      assert this.field6809[var1].field5802 == var1;

      assert this.field6809[var2].field5802 == var2;

      rl5 var7 = this.field6809[var1];
      this.field6809[var1] = this.field6809[var2];
      this.field6809[var2] = var7;
      this.field6809[var1].field5802 = var1;
      this.field6809[var2].field5802 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hg")
   public void method12698() {
      this.field6819 = -1L * 8994289655695694665L;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ig")
   public void method12703() {
      this.method12680(-781508173);
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ag")
   final int method12695(int var1, int var2, int var3) {
      int var4 = this == client.menu ? client.field1087 : client.field1080;

      for (int var5 = 0; var5 < this.field6797 * -1927903443; var5++) {
         int var6 = this.field6815 * 1457978411 + (this.field6797 * -1927903443 - 1 - var5 - var4) * 15 + 14;
         if (this.field6810) {
            var6 += 17;
         }

         if (var1 > this.field6817 * 727605925 && var1 < this.field6812 * 1308041153 + this.field6817 * 727605925 && var2 > var6 - 13 && var2 < var6 + 3) {
            return var5;
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("nq")
   public static void method12685(Menu var0) {
      int var1 = var0.field6817 * 727605925;
      int var2 = 1457978411 * var0.field6815;
      int var3 = 6116423;
      classYW.method13698(var1, var2, var0.field6812 * 1308041153, var0.field6814 * -531540521, var3);
      if (var0.field6810) {
         classYW.method13698(var1 + 1, var2 + 1, 1308041153 * var0.field6812 - 2, 16, 0);
         classYW.method13707(1 + var1, 18 + var2, var0.field6812 * 1308041153 - 2, var0.field6814 * -531540521 - 19, 0);
         classBB.field341.method56(classKK.field3847, 3 + var1, 14 + var2, var3, -1);
      } else {
         classYW.method13707(var1 + 1, var2 + 1, var0.field6812 * 1308041153 - 2, var0.field6814 * -531540521 - 2, 0);
      }

      int var4 = MouseHandler.field6255 * -38255113;
      int var5 = -2144333897 * MouseHandler.field6264;

      for (int var6 = 0; var6 < -1927903443 * var0.field6797; var6++) {
         int var7 = 14 + var2 + (var0.field6797 * -1927903443 - 1 - var6) * 15;
         if (var0.field6810) {
            var7 += 17;
         }

         int var8 = 16777215;
         if (var4 > var1 && var4 < var1 + 1308041153 * var0.field6812 && var5 > var7 - 13 && var5 < 3 + var7) {
            var8 = 16776960;
         }

         if (var6 == var0.field6816 * -1985221643 || -392503493 * var0.field6813 == var6 && var0.subMenus[var6] != null) {
            classYW.method13698(2 + var1, var7 - 12, var0.field6812 * 1308041153 - 4, 15, 7496785);
         }

         classBB.field341.method56(method12648(var0, var6, -115655011), var1 + 3, var7, var8, 0);
         if (var0.subMenus[var6] != null) {
            classBB.field341.method101(62, 1308041153 * var0.field6812 + var1 - 10, var7, 16777215);
         }
      }

      if (-1 != -1985221643 * var0.field6816 && null != var0.subMenus[var0.field6816 * -1985221643]) {
         var0.subMenus[var0.field6816 * -1985221643].method12692(-2000686243);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ar")
   public final void method12661(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 != -1111856393) {
               throw new IllegalStateException();
            }
         } else {
            classQP.method9703(
               this.field6798[var1],
               this.field6799[var1],
               this.menuIdentifiers[var1],
               this.field6801[var1],
               this.menuArguments2[var1],
               this.menuOpcodes[var1],
               this.field6804[var1],
               this.field6805[var1],
               MouseHandler.field6266 * 1422993977,
               1243590197 * MouseHandler.field6257,
               (byte)-44
            );
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wz.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   public final void method12673(int var1) {
      try {
         this.field6816 = 1982257059;

         for (int var2 = 0; var2 < this.field6797 * -1927903443; var2++) {
            if (null != this.subMenus[var2]) {
               if (var1 != 921182066) {
                  throw new IllegalStateException();
               }

               this.subMenus[var2].method12673(921182066);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wz.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   public final void method12674() {
      this.field6816 = 1982257059;

      for (int var1 = 0; var1 < this.field6797 * -1927903443; var1++) {
         if (null != this.subMenus[var1]) {
            this.subMenus[var1].method12673(921182066);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("id")
   public rl5 method12694(int var1) {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.field6797 * -1927903443 >= this.field6808) {
         throw new IllegalStateException("Menu has exceeded the maximum number of entries (" + this.field6808 + ")");
      } else {
         if (var1 < 0) {
            var1 = this.field6797 * -1927903443 + var1 + 1;
            if (var1 < 0) {
               throw new IllegalArgumentException();
            }
         }

         rl5 var2;
         if (var1 < this.field6797 * -1927903443) {
            rl5 var3 = this.field6809[this.field6797 * -1927903443];
            if (var3 == null) {
               var3 = this.field6809[this.field6797 * -1927903443] = new rl5(this, this.field6797 * -1927903443);
            }

            for (int var4 = this.field6797 * -1927903443; var4 > var1; this.field6809[var4].field5802 = var4--) {
               this.field6804[var4] = this.field6804[var4 - 1];
               this.field6805[var4] = this.field6805[var4 - 1];
               this.field6801[var4] = this.field6801[var4 - 1];
               this.menuIdentifiers[var4] = this.menuIdentifiers[var4 - 1];
               this.field6798[var4] = this.field6798[var4 - 1];
               this.field6799[var4] = this.field6799[var4 - 1];
               this.menuArguments2[var4] = this.menuArguments2[var4 - 1];
               this.menuOpcodes[var4] = this.menuOpcodes[var4 - 1];
               this.field6807[var4] = this.field6807[var4 - 1];
               this.subMenus[var4] = this.subMenus[var4 - 1];
               this.field6809[var4] = this.field6809[var4 - 1];
            }

            this.field6797 = (this.field6797 * -1927903443 + 1) * 1932681381;
            this.field6818 = this.field6797 * -1927903443;
            var2 = var3;
            this.field6809[var1] = var3;
            var3.field5802 = var1;
         } else {
            if (var1 != this.field6797 * -1927903443) {
               throw new IllegalArgumentException();
            }

            var2 = this.field6809[this.field6797 * -1927903443];
            if (var2 == null) {
               var2 = this.field6809[this.field6797 * -1927903443] = new rl5(this, this.field6797 * -1927903443);
            }

            this.field6797 = (this.field6797 * -1927903443 + 1) * 1932681381;
            this.field6818 = this.field6797 * -1927903443;
         }

         this.field6804[var2.field5802] = "";
         this.field6805[var2.field5802] = "";
         this.menuIdentifiers[var2.field5802] = MenuAction.RUNELITE.getId();
         this.field6801[var2.field5802] = 0;
         this.field6798[var2.field5802] = 0;
         this.field6799[var2.field5802] = 0;
         this.menuArguments2[var2.field5802] = -1;
         this.menuOpcodes[var2.field5802] = 0;
         this.subMenus[var2.field5802] = null;
         var2.field5803 = null;
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aw")
   public final void method12654(int var1, int var2) {
      classSV.method10696(this, 1407551530);
      this.field6817 = 602060077 * (var1 - 1913297146 * this.field6812 / 2);
      if (this.field6812 * -636172166 + 825361118 * this.field6817 > 773246731 * classSA.field5897) {
         this.field6817 = classSA.field5897 * -2095371281 - this.field6812 * -649721363;
      }

      if (this.field6817 * 727605925 < 0) {
         this.field6817 = 0;
      }

      this.field6815 = var2 * 484110040;
      if (this.field6815 * 1457978411 + this.field6814 * -531540521 > IntProjection.field1938 * 8379747) {
         this.field6815 = IntProjection.field1938 * -123479189 - -28198139 * this.field6814;
      }

      if (1457978411 * this.field6815 < 0) {
         this.field6815 = 0;
      }

      if (this.field6816 * -1985221643 != -1 && null != this.subMenus[this.field6816 * -1985221643]) {
         this.subMenus[this.field6816 * -796274021].method12700(this, (short)6966);
      }
   }

   public int getMenuX() {
      return this.field6817 * 727605925;
   }

   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("if")
   public void method12691(Menu var1) {
      int var2;
      if (var1 == null) {
         var2 = classBB.field341.getTextWidth("Choose Option");
      } else {
         var2 = classBB.field341.getTextWidth(var1.field6805[var1.field6816 * -1985221643]);
      }

      for (int var3 = 0; var3 < this.field6797 * -1927903443; var3++) {
         String var4 = this.field6804[var3];
         if (!this.field6805[var3].isEmpty()) {
            var4 = var4 + " " + this.field6805[var3];
         }

         if (this.subMenus[var3] != null) {
            var4 = var4 + " <gt>";
         }

         int var5 = classBB.field341.getTextWidth(var4);
         if (var5 > var2) {
            var2 = var5;
         }
      }

      var2 += 8;
      int var7 = this.field6797 * -1927903443 * 15 + 4;
      if (this.field6810) {
         var7 += 18;
      }

      this.field6812 = var2 * 1702686785;
      this.field6814 = var7 * -2088145433;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I")
   @ObfuscatedName("aj")
   public final int method12683(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10) {
      try {
         if (-1927903443 * this.field6797 < this.field6804.length) {
            if (var10 >= 657374242) {
               throw new IllegalStateException();
            } else {
               this.field6804[-1927903443 * this.field6797] = var1;
               this.field6805[this.field6797 * -1927903443] = var2;
               this.menuIdentifiers[-1927903443 * this.field6797] = var3;
               this.field6801[-1927903443 * this.field6797] = var4;
               this.field6798[-1927903443 * this.field6797] = var5;
               this.field6799[this.field6797 * -1927903443] = var6;
               this.menuArguments2[-1927903443 * this.field6797] = var7;
               this.menuOpcodes[this.field6797 * -1927903443] = var9;
               this.field6807[-1927903443 * this.field6797] = var8;
               this.subMenus[this.field6797 * -1927903443] = null;
               int var10000 = this.field6797 += 1932681381;
               this.method12696(-1);
               return var10000 * -1927903443 - 1;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "wz.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   final void method12680(int var1) {
      try {
         if (-1985221643 * this.field6816 != -1) {
            if (null != this.subMenus[-1985221643 * this.field6816]) {
               this.subMenus[this.field6816 * -1985221643].method12678(-1332660037);
            }

            this.field6816 = 1982257059;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wz.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ad")
   public final String method12646(int var1) {
      if (var1 < 0) {
         return "";
      } else {
         return !this.field6805[var1].isEmpty() ? this.field6804[var1] + classKK.field3785 + this.field6805[var1] : this.field6804[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("au")
   public boolean method12704(int var1, int var2) {
      return method12701(this, var1, var2, -2034522084);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public final void method12675() {
      this.field6816 = 1982257059;

      for (int var1 = 0; var1 < this.field6797 * -1927903443; var1++) {
         if (null != this.subMenus[var1]) {
            this.subMenus[var1].method12673(921182066);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public final void method12686() {
      int var1 = this.field6817 * 727605925;
      int var2 = 1457978411 * this.field6815;
      int var3 = 6116423;
      classYW.method13698(var1, var2, this.field6812 * 1308041153, this.field6814 * -531540521, var3);
      if (this.field6810) {
         classYW.method13698(var1 + 1, var2 + 1, 1308041153 * this.field6812 - 2, 16, 0);
         classYW.method13707(1 + var1, 18 + var2, this.field6812 * 1308041153 - 2, this.field6814 * -531540521 - 19, 0);
         classBB.field341.method56(classKK.field3847, 3 + var1, 14 + var2, var3, -1);
      } else {
         classYW.method13707(var1 + 1, var2 + 1, this.field6812 * 1308041153 - 2, this.field6814 * -531540521 - 2, 0);
      }

      int var4 = MouseHandler.field6255 * -38255113;
      int var5 = -2144333897 * MouseHandler.field6264;

      for (int var6 = 0; var6 < -1927903443 * this.field6797; var6++) {
         int var7 = 14 + var2 + (this.field6797 * -1927903443 - 1 - var6) * 15;
         if (this.field6810) {
            var7 += 17;
         }

         int var8 = 16777215;
         if (var4 > var1 && var4 < var1 + 1308041153 * this.field6812 && var5 > var7 - 13 && var5 < 3 + var7) {
            var8 = 16776960;
         }

         if (var6 == this.field6816 * -1985221643 || -392503493 * this.field6813 == var6 && this.subMenus[var6] != null) {
            classYW.method13698(2 + var1, var7 - 12, this.field6812 * 1308041153 - 4, 15, 7496785);
         }

         classBB.field341.method56(method12648(this, var6, -115655011), var1 + 3, var7, var8, 0);
         if (this.subMenus[var6] != null) {
            classBB.field341.method101(62, 1308041153 * this.field6812 + var1 - 10, var7, 16777215);
         }
      }

      if (-1 != -1985221643 * this.field6816 && null != this.subMenus[this.field6816 * -1985221643]) {
         this.subMenus[this.field6816 * -1985221643].method12692(-1262452597);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("as")
   public final void method12655(int var1, int var2) {
      classSV.method10696(this, -818090009);
      this.field6817 = 1642600503 * (var1 - -2092263792 * this.field6812 / 2);
      if (this.field6812 * 1308041153 + 1666175372 * this.field6817 > -717161267 * classSA.field5897) {
         this.field6817 = classSA.field5897 * -2095371281 - this.field6812 * -208644946;
      }

      if (this.field6817 * -1117783628 < 0) {
         this.field6817 = 0;
      }

      this.field6815 = var2 * -361229084;
      if (this.field6815 * -2010837480 + this.field6814 * -531540521 > IntProjection.field1938 * 1769000792) {
         this.field6815 = IntProjection.field1938 * -1549978419 - -28198139 * this.field6814;
      }

      if (219920206 * this.field6815 < 0) {
         this.field6815 = 0;
      }

      if (this.field6816 * 79511146 != -1 && null != this.subMenus[this.field6816 * -1985221643]) {
         this.subMenus[this.field6816 * 677406674].method12700(this, (short)-21612);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I")
   @ObfuscatedName("bi")
   public final int method12684(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      if (-1927903443 * this.field6797 < this.field6804.length) {
         this.field6804[-1927903443 * this.field6797] = var1;
         this.field6805[this.field6797 * 1243222294] = var2;
         this.menuIdentifiers[-1927903443 * this.field6797] = var3;
         this.field6801[2018550998 * this.field6797] = var4;
         this.field6798[-1927903443 * this.field6797] = var5;
         this.field6799[this.field6797 * -1927903443] = var6;
         this.menuArguments2[-1927903443 * this.field6797] = var7;
         this.menuOpcodes[this.field6797 * 481472702] = var9;
         this.field6807[938195248 * this.field6797] = var8;
         this.subMenus[this.field6797 * 1044966345] = null;
         return (this.field6797 += 1141238489) * -197275653 - 1;
      } else {
         return -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("di")
   public static void method12651(Menu var0) {
      if (var0 == null) {
         var0.method12686();
      }

      var0.field6812 = classBB.field341.method36(classKK.field3847) * 1702686785;

      for (int var1 = 0; var1 < -1927903443 * var0.field6797; var1++) {
         int var2 = classBB.field341.method36(method12648(var0, var1, -115655011));
         if (null != var0.subMenus[var1]) {
            var2 += 15;
         }

         if (var2 > var0.field6812 * 1308041153) {
            var0.field6812 = 1702686785 * var2;
         }
      }

      var0.field6812 += 736592392;
      var0.field6814 = 237352860 + var0.field6797 * 175834901;
      if (var0.field6810) {
         var0.field6814 += 1068087870;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("av")
   final void method12656(Menu var1) {
      classSV.method10696(this, 813742314);
      this.field6817 = var1.field6812 * -649721363 + var1.field6817 * 1;
      if (this.field6812 * 1308041153 + 727605925 * this.field6817 > 773246731 * classSA.field5897) {
         this.field6817 = 1 * var1.field6817 - this.field6812 * -649721363;
      }

      if (727605925 * this.field6817 < 0) {
         this.field6817 = 0;
      }

      int var2 = var1.field6797 * 1146219427 - 15 - var1.field6816 * 286446427 + var1.field6815 * 1457978411;
      if (var1.field6810) {
         var2 += 17;
      }

      int var3 = 19 + var2;
      this.field6815 = var2 * -317857149;
      if (this.field6815 * 1457978411 + this.field6814 * -531540521 > 8379747 * IntProjection.field1938) {
         this.field6815 = (var3 - this.field6814 * -531540521) * -317857149;
      }

      if (1457978411 * this.field6815 < 0) {
         this.field6815 = 0;
      }
   }

   public void setMenuEntries(MenuEntry[] var1) {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         boolean var2 = false;
         if (classON.field4993 != null && this.field6797 * -1927903443 > 0) {
            var2 = classON.field4993.method1366() == this.menuIdentifiers[this.field6797 * -1927903443 - 1]
               && classON.field4993.method1362() == this.field6801[this.field6797 * -1927903443 - 1]
               && classON.field4993.method1368() == this.field6804[this.field6797 * -1927903443 - 1]
               && classON.field4993.method1369() == this.field6805[this.field6797 * -1927903443 - 1]
               && classON.field4993.method1374() == this.field6798[this.field6797 * -1927903443 - 1]
               && classON.field4993.method1372() == this.field6799[this.field6797 * -1927903443 - 1]
               && classON.field4993.method1373() == this.menuArguments2[this.field6797 * -1927903443 - 1]
               && classON.field4993.method1363() == this.menuOpcodes[this.field6797 * -1927903443 - 1];
         }

         for (int var3 = 0; var3 < var1.length; var3++) {
            rl5 var4 = (rl5)var1[var3];
            if (var4.field5802 != var3) {
               if (var4.field5801 != this) {
                  throw new IllegalArgumentException("menu entry at index " + var3 + " doesn't belong to this menu");
               }

               if (var4.field5802 <= var3) {
                  throw new IllegalArgumentException("menu entry out of order (are you passing the same menu twice?)");
               }

               this.method12699(var4.field5802, var3);
            }
         }

         this.field6797 = var1.length * 1932681381;
         this.field6818 = var1.length;
         if (var2 && this.field6797 * -1927903443 > 0) {
            assert classON.field4993 != null;

            classON.field4993.method1375(this.menuIdentifiers[this.field6797 * -1927903443 - 1]);
            classON.field4993.method1367(this.field6801[this.field6797 * -1927903443 - 1]);
            classON.field4993.method1364(this.field6804[this.field6797 * -1927903443 - 1]);
            classON.field4993.method1365(this.field6805[this.field6797 * -1927903443 - 1]);
            classON.field4993.method1371(this.field6798[this.field6797 * -1927903443 - 1]);
            classON.field4993.method1360(this.field6799[this.field6797 * -1927903443 - 1]);
            classON.field4993.method1361(this.menuArguments2[this.field6797 * -1927903443 - 1]);
            classON.field4993.method1370(this.menuOpcodes[this.field6797 * -1927903443 - 1]);
            classON.field4993.field617 = this.field6809[this.field6797 * -1927903443 - 1].field5803;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("nb")
   public void method12705(int var1, int var2) {
      this.method12670(var1, var2, (short)-8747);
   }

   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("at")
   final void method12657(Menu var1) {
      classSV.method10696(this, -910756639);
      this.field6817 = var1.field6812 * -649721363 + var1.field6817 * 1;
      if (this.field6812 * 1308041153 + 727605925 * this.field6817 > 773246731 * classSA.field5897) {
         this.field6817 = 1 * var1.field6817 - this.field6812 * -649721363;
      }

      if (727605925 * this.field6817 < 0) {
         this.field6817 = 0;
      }

      int var2 = var1.field6797 * 1146219427 - 15 - var1.field6816 * 286446427 + var1.field6815 * 1457978411;
      if (var1.field6810) {
         var2 += 17;
      }

      int var3 = 19 + var2;
      this.field6815 = var2 * -317857149;
      if (this.field6815 * 1457978411 + this.field6814 * -531540521 > 8379747 * IntProjection.field1938) {
         this.field6815 = (var3 - this.field6814 * -531540521) * -317857149;
      }

      if (1457978411 * this.field6815 < 0) {
         this.field6815 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("vk")
   public void method12706(int var1) {
      this.method12661(var1, -1111856393);
   }

   public int getMenuWidth() {
      return this.field6812 * 1308041153;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("nh")
   public void method12707() {
      this.method12678(-45769207);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("og")
   public static void method12687(Menu var0) {
      int var1 = var0.field6817 * 727605925;
      int var2 = 1457978411 * var0.field6815;
      int var3 = 6116423;
      classYW.method13698(var1, var2, var0.field6812 * 1308041153, var0.field6814 * -531540521, var3);
      if (var0.field6810) {
         classYW.method13698(var1 + 1, var2 + 1, 1308041153 * var0.field6812 - 2, 16, 0);
         classYW.method13707(1 + var1, 18 + var2, var0.field6812 * 1308041153 - 2, var0.field6814 * -531540521 - 19, 0);
         classBB.field341.method56(classKK.field3847, 3 + var1, 14 + var2, var3, -1);
      } else {
         classYW.method13707(var1 + 1, var2 + 1, var0.field6812 * 1308041153 - 2, var0.field6814 * -531540521 - 2, 0);
      }

      int var4 = MouseHandler.field6255 * -38255113;
      int var5 = -2144333897 * MouseHandler.field6264;

      for (int var6 = 0; var6 < -1927903443 * var0.field6797; var6++) {
         int var7 = 14 + var2 + (var0.field6797 * -1927903443 - 1 - var6) * 15;
         if (var0.field6810) {
            var7 += 17;
         }

         int var8 = 16777215;
         if (var4 > var1 && var4 < var1 + 1308041153 * var0.field6812 && var5 > var7 - 13 && var5 < 3 + var7) {
            var8 = 16776960;
         }

         if (var6 == var0.field6816 * -1985221643 || -392503493 * var0.field6813 == var6 && var0.subMenus[var6] != null) {
            classYW.method13698(2 + var1, var7 - 12, var0.field6812 * 1308041153 - 4, 15, 7496785);
         }

         classBB.field341.method56(method12648(var0, var6, -115655011), var1 + 3, var7, var8, 0);
         if (var0.subMenus[var6] != null) {
            classBB.field341.method101(62, 1308041153 * var0.field6812 + var1 - 10, var7, 16777215);
         }
      }

      if (-1 != -1985221643 * var0.field6816 && null != var0.subMenus[var0.field6816 * -1985221643]) {
         var0.subMenus[var0.field6816 * -1985221643].method12692(-1894339153);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("am")
   final int method12659(int var1, int var2) {
      for (int var3 = 0; var3 < -1927903443 * this.field6797; var3++) {
         int var4 = 15 * (this.field6797 * -1927903443 - 1 - var3) + 14 + this.field6815 * 1457978411;
         if (this.field6810) {
            var4 += 17;
         }

         if (var1 > 727605925 * this.field6817 && var1 < 1308041153 * this.field6812 + 727605925 * this.field6817 && var2 > var4 - 13 && var2 < var4 + 3) {
            return var3;
         }
      }

      return -1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ah")
   public final void method12662(int var1) {
      if (var1 >= 0) {
         classQP.method9703(
            this.field6798[var1],
            this.field6799[var1],
            this.menuIdentifiers[var1],
            this.field6801[var1],
            this.menuArguments2[var1],
            this.menuOpcodes[var1],
            this.field6804[var1],
            this.field6805[var1],
            MouseHandler.field6266 * 1422993977,
            -1782692480 * MouseHandler.field6257,
            (byte)-54
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("bf")
   public void method12708(Menu var1) {
      this.method12700(var1, (short)-1785);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bn")
   public final void method12663(int var1) {
      if (var1 >= 0) {
         classQP.method9703(
            this.field6798[var1],
            this.field6799[var1],
            this.menuIdentifiers[var1],
            this.field6801[var1],
            this.menuArguments2[var1],
            this.menuOpcodes[var1],
            this.field6804[var1],
            this.field6805[var1],
            MouseHandler.field6266 * 1422993977,
            1243590197 * MouseHandler.field6257,
            (byte)-41
         );
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;II)Z")
   @ObfuscatedName("uc")
   public static boolean method12669(Menu var0, int var1, int var2) {
      if (-1 != -1985221643 * var0.field6816
         && null != var0.subMenus[-1985221643 * var0.field6816]
         && var0.subMenus[-1985221643 * var0.field6816].method12670(var1, var2, (short)14810)) {
         return true;
      } else {
         int var3 = var0.method12695(var1, var2, -1069010009);
         if (-1 != var3) {
            var0.method12661(var3, -1111856393);
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)Z")
   @ObfuscatedName("ac")
   public final boolean method12670(int var1, int var2, short var3) {
      try {
         if (-1 != -1985221643 * this.field6816) {
            if (var3 == 765) {
               throw new IllegalStateException();
            }

            if (null != this.subMenus[-1985221643 * this.field6816]) {
               if (var3 == 765) {
                  throw new IllegalStateException();
               }

               if (this.subMenus[-1985221643 * this.field6816].method12670(var1, var2, (short)-13951)) {
                  if (var3 == 765) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         int var4 = this.method12695(var1, var2, -18870212);
         if (-1 != var4) {
            if (var3 == 765) {
               throw new IllegalStateException();
            } else {
               this.method12661(var4, -1111856393);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wz.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("ut")
   public static void method12688(Menu var0) {
      if (var0 == null) {
         var0.method12676();
      } else {
         int var1 = var0.field6817 * 727605925;
         int var2 = 1457978411 * var0.field6815;
         int var3 = 6116423;
         classYW.method13698(var1, var2, var0.field6812 * -1420652696, var0.field6814 * 767956428, var3);
         if (var0.field6810) {
            classYW.method13698(var1 + 1, var2 + 1, 1308041153 * var0.field6812 - 2, 16, 0);
            classYW.method13707(1 + var1, 18 + var2, var0.field6812 * 1308041153 - 2, var0.field6814 * -1220125631 - 19, 0);
            classBB.field341.method56(classKK.field3847, 3 + var1, 14 + var2, var3, -1);
         } else {
            classYW.method13707(var1 + 1, var2 + 1, var0.field6812 * 1308041153 - 2, var0.field6814 * -1364787884 - 2, 0);
         }

         int var4 = MouseHandler.field6255 * 613408966;
         int var5 = -1630179091 * MouseHandler.field6264;

         for (int var6 = 0; var6 < -1927903443 * var0.field6797; var6++) {
            int var7 = 14 + var2 + (var0.field6797 * -1927903443 - 1 - var6) * 15;
            if (var0.field6810) {
               var7 += 17;
            }

            int var8 = 16777215;
            if (var4 > var1 && var4 < var1 + 1308041153 * var0.field6812 && var5 > var7 - 13 && var5 < 3 + var7) {
               var8 = 1172532167;
            }

            if (var6 == var0.field6816 * -1607949428 || -2128790815 * var0.field6813 == var6 && var0.subMenus[var6] != null) {
               classYW.method13698(2 + var1, var7 - 12, var0.field6812 * 1308041153 - 4, 15, -1172428688);
            }

            classBB.field341.method56(method12648(var0, var6, -115655011), var1 + 3, var7, var8, 0);
            if (var0.subMenus[var6] != null) {
               classBB.field341.method101(62, 1643328402 * var0.field6812 + var1 - 10, var7, 16777215);
            }
         }

         if (-1 != -1985221643 * var0.field6816 && null != var0.subMenus[var0.field6816 * -1954792566]) {
            var0.subMenus[var0.field6816 * -1985221643].method12692(-1803682473);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("uq")
   public int method12709(int var1, int var2) {
      return this.method12695(var1, var2, -521318322);
   }

   @ObfuscatedSignature(descriptor = "(Lwz;III)Z")
   @ObfuscatedName("ms")
   public static boolean method12701(Menu var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12702(var1, var1, var1);
      }

      boolean var4;
      if (var0.field6816 * -1985221643 != -1
         && var0.subMenus[var0.field6816 * -1985221643] != null
         && var0.subMenus[var0.field6816 * -1985221643].method12704(var1, var2)) {
         var4 = true;
      } else if (var1 >= var0.field6817 * 727605925 - 10
         && var1 <= var0.field6812 * 1308041153 + var0.field6817 * 727605925 + 10
         && var2 >= var0.field6815 * 1457978411 - 10
         && var2 <= var0.field6814 * -531540521 + var0.field6815 * 1457978411 + 10) {
         int var5 = var0.method12709(var1, var2);
         if (var5 != -1 && var5 != var0.field6816 * -1985221643) {
            long var6 = classOE.field4843.getGameCycle();
            int var8 = var5;
            long var9 = Math.max(var6, var0.field6819 * -7988158060854933767L);
            if (var0.field6816 * -1985221643 != -1) {
               if (var0.method12693(var1, var2)) {
                  var8 = -1;
                  var9 = Long.MAX_VALUE;
               } else if (var0.field6813 * -392503493 == -1) {
                  if (var1 == var0.field6795 && var2 == var0.field6796) {
                     var9 = var6 + 8L;
                  } else {
                     var9 = var6 + 2L;
                  }
               }
            }

            var0.field6813 = var8 * -164716045;
            var0.field6819 = var9 * 8994289655695694665L;
            if (var0.field6819 * -7988158060854933767L <= var6) {
               var0.field6813 = -1 * -164716045;
               var0.method12703();
               Menu var11 = var0.subMenus[var5];
               if (var11 != null) {
                  var0.field6816 = var5 * -1982257059;
                  var11.method12708(var0);
                  client.field1072 = 0;
                  client.field1080 = 0;
                  if (var11.field6814 * -531540521 > classOE.field4843.getCanvasHeight()) {
                     client.field1080 = 0;
                     client.field1072 = (var11.field6814 * -531540521 - classOE.field4843.getCanvasHeight() + 14) / 15;
                  }
               }
            }
         }

         var4 = true;
      } else {
         var4 = false;
      }

      var0.field6795 = var1;
      var0.field6796 = var2;
      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("zw")
   public static void method12652(Menu var0) {
      if (var0 == null) {
         var0.getMenuEntries();
      }

      var0.field6812 = classBB.field341.method36(classKK.field3847) * 1702686785;

      for (int var1 = 0; var1 < -1927903443 * var0.field6797; var1++) {
         int var2 = classBB.field341.method36(method12648(var0, var1, -115655011));
         if (null != var0.subMenus[var1]) {
            var2 += 15;
         }

         if (var2 > var0.field6812 * 1452049825) {
            var0.field6812 = 1702686785 * var2;
         }
      }

      var0.field6812 += 736592392;
      var0.field6814 = 237352860 + var0.field6797 * 175834901;
      if (var0.field6810) {
         var0.field6814 += 1068087870;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;II)I")
   @ObfuscatedName("dp")
   public static int method12660(Menu var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12662(var1);
      }

      for (int var3 = 0; var3 < -1927903443 * var0.field6797; var3++) {
         int var4 = 15 * (var0.field6797 * -1927903443 - 1 - var3) + 14 + var0.field6815 * 1457978411;
         if (var0.field6810) {
            var4 += 17;
         }

         if (var1 > 727605925 * var0.field6817 && var1 < 1308041153 * var0.field6812 + 727605925 * var0.field6817 && var2 > var4 - 13 && var2 < var4 + 3) {
            return var3;
         }
      }

      return -1;
   }

   public int getMenuY() {
      return this.field6815 * 1457978411;
   }

   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("ak")
   final void method12658(Menu var1) {
      classSV.method10696(this, 891635837);
      this.field6817 = var1.field6812 * 1009054268 + var1.field6817 * 1;
      if (this.field6812 * 336852242 + 548509948 * this.field6817 > 773246731 * classSA.field5897) {
         this.field6817 = 1 * var1.field6817 - this.field6812 * 404742155;
      }

      if (1018843180 * this.field6817 < 0) {
         this.field6817 = 0;
      }

      int var2 = var1.field6797 * 1146219427 - 15 - var1.field6816 * -1722149802 + var1.field6815 * 1457978411;
      if (var1.field6810) {
         var2 += 17;
      }

      int var3 = 19 + var2;
      this.field6815 = var2 * -317857149;
      if (this.field6815 * -196193027 + this.field6814 * -531540521 > 8379747 * IntProjection.field1938) {
         this.field6815 = (var3 - this.field6814 * -531540521) * -317857149;
      }

      if (1832674314 * this.field6815 < 0) {
         this.field6815 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("br")
   public final boolean method12666(int var1, int var2) {
      if (this.field6816 * -1985221643 != -1
         && this.subMenus[-1985221643 * this.field6816] != null
         && method12701(this.subMenus[this.field6816 * -1985221643], var1, var2, -2098090181)) {
         return true;
      } else if (var1 >= 565096300 * this.field6817 - 10
         && var1 <= 10 + 1308041153 * this.field6812 + this.field6817 * -744021948
         && var2 >= 313356009 * this.field6815 - 10
         && var2 <= 10 + 1457978411 * this.field6815 + this.field6814 * -531540521) {
         int var3 = this.method12695(var1, var2, 1189052319);
         if (var3 != -1 && var3 != -1985221643 * this.field6816) {
            if (-1144516730 * this.field6813 != var3) {
               this.field6813 = var3 * -1734459145;
               this.field6819 = classDD.method2983(16711680) * 8994289655695694665L;
               if (this.field6816 * -1618947856 != -1) {
                  this.field6819 += 5062261947113863564L;
               }
            }

            if (this.field6819 * -7988158060854933767L <= classDD.method2983(16711680)) {
               this.field6813 = 164716045;
               this.method12680(-781508173);
               if (this.subMenus[var3] != null) {
                  this.field6816 = var3 * -1982257059;
                  this.subMenus[var3].method12700(this, (short)-13464);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;I)Ljava/lang/String;")
   @ObfuscatedName("ik")
   public static String method12647(Menu var0, int var1) {
      if (var0 == null) {
         var0.method12645(var1);
      }

      if (var1 < 0) {
         return "";
      } else {
         return !var0.field6805[var1].isEmpty() ? var0.field6804[var1] + classKK.field3785 + var0.field6805[var1] : var0.field6804[var1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;II)Z")
   @ObfuscatedName("ni")
   public static boolean method12667(Menu var0, int var1, int var2) {
      if (var0.field6816 * 1256246264 != -1
         && var0.subMenus[1011150737 * var0.field6816] != null
         && method12701(var0.subMenus[var0.field6816 * -1985221643], var1, var2, -1655548224)) {
         return true;
      } else if (var1 >= -1997806456 * var0.field6817 - 10
         && var1 <= 10 + 1560970217 * var0.field6812 + var0.field6817 * 727605925
         && var2 >= 1457978411 * var0.field6815 - 10
         && var2 <= 10 + -1125919218 * var0.field6815 + var0.field6814 * -531540521) {
         int var3 = var0.method12695(var1, var2, -653432933);
         if (var3 != -1 && var3 != -1018693876 * var0.field6816) {
            if (-392503493 * var0.field6813 != var3) {
               var0.field6813 = var3 * 1320938569;
               var0.field6819 = classDD.method2983(16711680) * 8994289655695694665L;
               if (var0.field6816 * 2039411425 != -1) {
                  var0.field6819 += 5062261947113863564L;
               }
            }

            if (var0.field6819 * -7988158060854933767L <= classDD.method2983(16711680)) {
               var0.field6813 = 164716045;
               var0.method12680(-781508173);
               if (var0.subMenus[var3] != null) {
                  var0.field6816 = var3 * -1982257059;
                  var0.subMenus[var3].method12700(var0, (short)11042);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bg")
   public final boolean method12671(int var1, int var2) {
      if (-1 != -1985221643 * this.field6816
         && null != this.subMenus[683048908 * this.field6816]
         && this.subMenus[-1985221643 * this.field6816].method12670(var1, var2, (short)-13089)) {
         return true;
      } else {
         int var3 = this.method12695(var1, var2, 163313233);
         if (-1 != var3) {
            this.method12661(var3, -1111856393);
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jj")
   public void method12710() {
      this.method12673(921182066);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bj")
   public final boolean method12672(int var1, int var2) {
      if (-1 != -1985221643 * this.field6816
         && null != this.subMenus[-1985221643 * this.field6816]
         && this.subMenus[-1985221643 * this.field6816].method12670(var1, var2, (short)16742)) {
         return true;
      } else {
         int var3 = this.method12695(var1, var2, -1267883019);
         if (-1 != var3) {
            this.method12661(var3, -1111856393);
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bx")
   public final void method12664(int var1) {
      if (var1 >= 0) {
         classQP.method9703(
            this.field6798[var1],
            this.field6799[var1],
            this.menuIdentifiers[var1],
            this.field6801[var1],
            this.menuArguments2[var1],
            this.menuOpcodes[var1],
            this.field6804[var1],
            this.field6805[var1],
            MouseHandler.field6266 * 1422993977,
            1243590197 * MouseHandler.field6257,
            (byte)-92
         );
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("qx")
   public boolean method12693(int var1, int var2) {
      if (this.field6816 * -1985221643 == -1) {
         return false;
      } else {
         Menu var3 = this.subMenus[this.field6816 * -1985221643];
         if (var3 == null) {
            return false;
         } else if (var3.field6817 * 727605925 > this.field6817 * 727605925) {
            int var9 = var3.field6817 * 727605925;
            float var10 = method12697(var1, var2, var9, var3.field6815 * 1457978411);
            float var11 = method12697(this.field6795, this.field6796, var9, var3.field6815 * 1457978411);
            float var12 = method12697(var1, var2, var9, var3.field6815 * 1457978411 + var3.field6814 * -531540521);
            float var13 = method12697(this.field6795, this.field6796, var9, var3.field6815 * 1457978411 + var3.field6814 * -531540521);
            return var10 >= var11 && var12 < var13 || var10 > var11 && var12 <= var13;
         } else {
            int var4 = this.field6817 * 727605925;
            float var5 = method12697(var1, var2, var4, var3.field6815 * 1457978411);
            float var6 = method12697(this.field6795, this.field6796, var4, var3.field6815 * 1457978411);
            float var7 = method12697(var1, var2, var4, var3.field6815 * 1457978411 + var3.field6814 * -531540521);
            float var8 = method12697(this.field6795, this.field6796, var4, var3.field6815 * 1457978411 + var3.field6814 * -531540521);
            return var5 <= var6 && var7 > var8 || var5 < var6 && var7 >= var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bc")
   public final void method12665(int var1) {
      if (var1 >= 0) {
         classQP.method9703(
            this.field6798[var1],
            this.field6799[var1],
            this.menuIdentifiers[var1],
            this.field6801[var1],
            this.menuArguments2[var1],
            this.menuOpcodes[var1],
            this.field6804[var1],
            this.field6805[var1],
            MouseHandler.field6266 * 1422993977,
            1243590197 * MouseHandler.field6257,
            (byte)-75
         );
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   public final void method12677() {
      this.method12680(-781508173);
   }

   @ObfuscatedSignature(descriptor = "(IIII)F")
   @ObfuscatedName("ki")
   public static float method12697(int var0, int var1, int var2, int var3) {
      return ((float)var1 - var3) / (var2 - var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;)V")
   @ObfuscatedName("mg")
   public static void method12689(Menu var0) {
      int var1 = var0.field6817 * 727605925;
      int var2 = 1457978411 * var0.field6815;
      int var3 = 6116423;
      classYW.method13698(var1, var2, var0.field6812 * 1308041153, var0.field6814 * -531540521, var3);
      if (var0.field6810) {
         classYW.method13698(var1 + 1, var2 + 1, 1308041153 * var0.field6812 - 2, 16, 0);
         classYW.method13707(1 + var1, 18 + var2, var0.field6812 * 1308041153 - 2, var0.field6814 * -531540521 - 19, 0);
         classBB.field341.method56(classKK.field3847, 3 + var1, 14 + var2, var3, -1);
      } else {
         classYW.method13707(var1 + 1, var2 + 1, var0.field6812 * 1308041153 - 2, var0.field6814 * -531540521 - 2, 0);
      }

      int var4 = MouseHandler.field6255 * -38255113;
      int var5 = -2144333897 * MouseHandler.field6264;

      for (int var6 = 0; var6 < -1927903443 * var0.field6797; var6++) {
         int var7 = 14 + var2 + (var0.field6797 * -1927903443 - 1 - var6) * 15;
         if (var0.field6810) {
            var7 += 17;
         }

         int var8 = 16777215;
         if (var4 > var1 && var4 < var1 + 1308041153 * var0.field6812 && var5 > var7 - 13 && var5 < 3 + var7) {
            var8 = 16776960;
         }

         if (var6 == var0.field6816 * -1985221643 || -392503493 * var0.field6813 == var6 && var0.subMenus[var6] != null) {
            classYW.method13698(2 + var1, var7 - 12, var0.field6812 * 1308041153 - 4, 15, 7496785);
         }

         classBB.field341.method56(method12648(var0, var6, -115655011), var1 + 3, var7, var8, 0);
         if (var0.subMenus[var6] != null) {
            classBB.field341.method101(62, 1308041153 * var0.field6812 + var1 - 10, var7, 16777215);
         }
      }

      if (-1 != -1985221643 * var0.field6816 && null != var0.subMenus[var0.field6816 * -1985221643]) {
         var0.subMenus[var0.field6816 * -1985221643].method12692(-1765428614);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("xy")
   public void method12696(int var1) {
      int var2 = this.field6818;
      int var3 = this.field6797 * -1927903443;
      this.field6818 = var3;
      if (var3 < var2) {
         for (int var4 = var3; var4 < var2; var4++) {
            this.field6809[var4].field5803 = null;
         }
      } else if (var3 == var2 + 1) {
         rl5 var6 = this.field6809[var2];
         if (var6 == null) {
            var6 = this.field6809[var2] = new rl5(this, var2);
         } else {
            var6.field5803 = null;
         }

         MenuEntryAdded var5 = new MenuEntryAdded(var6);
         classOE.field4843.getCallbacks().post(var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   final void method12681() {
      if (-1985221643 * this.field6816 != -1) {
         if (null != this.subMenus[-1985221643 * this.field6816]) {
            this.subMenus[this.field6816 * -1985221643].method12678(-1932347280);
         }

         this.field6816 = 1982257059;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   final void method12682() {
      if (-141318718 * this.field6816 != -1) {
         if (null != this.subMenus[2032838106 * this.field6816]) {
            this.subMenus[this.field6816 * -1985221643].method12678(37541411);
         }

         this.field6816 = 1982257059;
      }
   }

   public int getMenuHeight() {
      return this.field6814 * -531540521;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   public final void method12678(int var1) {
      this.method12698();

      try {
         this.method12680(-781508173);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wz.ao(" + ')');
      }
   }

   public Menu(boolean var1) {
      this.field6796 = -1;
      int var2 = var1 ? 500 : 64;
      this.field6797 = 0 * 1932681381;
      this.field6798 = new int[var2];
      this.field6799 = new int[var2];
      this.menuIdentifiers = new int[var2];
      this.field6801 = new int[var2];
      this.menuArguments2 = new int[var2];
      this.menuOpcodes = new int[var2];
      this.field6804 = new String[var2];
      this.field6805 = new String[var2];
      this.subMenus = new Menu[var2];
      this.field6807 = new boolean[var2];
      this.field6808 = var2;
      this.field6809 = new rl5[var2];
      this.field6810 = true;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("pe")
   public void method12711(int var1, int var2) {
      this.method12653(var1, var2, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   public final void method12692(int var1) {
      BeforeMenuRender var2 = new BeforeMenuRender();
      classOE.field4843.getCallbacks().post(var2);
      if (!var2.isConsumed()) {
         client.method2240(this);
      }
   }

   public void removeMenuEntry(MenuEntry var1) {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         rl5 var2 = (rl5)var1;
         int var3 = var2.field5802;
         if (var2.field5801 == this && var3 < this.field6797 * -1927903443) {
            assert var3 >= 0 && var3 < this.field6797 * -1927903443;

            for (int var4 = var3; var4 < this.field6797 * -1927903443 - 1; this.field6809[var4].field5802 = var4++) {
               this.field6804[var4] = this.field6804[var4 + 1];
               this.field6805[var4] = this.field6805[var4 + 1];
               this.field6801[var4] = this.field6801[var4 + 1];
               this.menuIdentifiers[var4] = this.menuIdentifiers[var4 + 1];
               this.field6798[var4] = this.field6798[var4 + 1];
               this.field6799[var4] = this.field6799[var4 + 1];
               this.menuArguments2[var4] = this.menuArguments2[var4 + 1];
               this.menuOpcodes[var4] = this.menuOpcodes[var4 + 1];
               this.field6807[var4] = this.field6807[var4 + 1];
               this.subMenus[var4] = this.subMenus[var4 + 1];
               this.field6809[var4] = this.field6809[var4 + 1];
            }

            var2.field5802 = this.field6797 * -1927903443 - 1;
            this.field6809[this.field6797 * -1927903443 - 1] = var2;
            this.field6797 = (this.field6797 * -1927903443 - 1) * 1932681381;
            this.field6818 = this.field6797 * -1927903443;
         } else {
            throw new IllegalArgumentException("entry doesn't belong to menu");
         }
      }
   }

   public MenuEntry[] getMenuEntries() {
      return Arrays.copyOf(this.field6809, this.field6797 * -1927903443);
   }

   @ObfuscatedSignature(descriptor = "(Lwz;II)Ljava/lang/String;")
   @ObfuscatedName("go")
   public static String method12648(Menu var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12649(var1, var1);
      }

      try {
         if (var1 < 0) {
            if (var2 != -115655011) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else if (!var0.field6805[var1].isEmpty()) {
            if (var2 != -115655011) {
               throw new IllegalStateException();
            } else {
               return var0.field6804[var1] + classKK.field3785 + var0.field6805[var1];
            }
         } else {
            return var0.field6804[var1];
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wz.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("bp")
   public final boolean method12668(int var1, int var2) {
      if (this.field6816 * 1251479852 != -1
         && this.subMenus[-1985221643 * this.field6816] != null
         && method12701(this.subMenus[this.field6816 * -1985221643], var1, var2, -1553941953)) {
         return true;
      } else if (var1 >= -1250270610 * this.field6817 - 10
         && var1 <= 10 + 215304835 * this.field6812 + this.field6817 * -548447980
         && var2 >= 1457978411 * this.field6815 - 10
         && var2 <= 10 + 1457978411 * this.field6815 + this.field6814 * -531540521) {
         int var3 = this.method12695(var1, var2, -149630139);
         if (var3 != -1 && var3 != -1664095241 * this.field6816) {
            if (-392503493 * this.field6813 != var3) {
               this.field6813 = var3 * 1098245094;
               this.field6819 = classDD.method2983(16711680) * 8994289655695694665L;
               if (this.field6816 * -1985221643 != -1) {
                  this.field6819 += 5062261947113863564L;
               }
            }

            if (this.field6819 * -7988158060854933767L <= classDD.method2983(16711680)) {
               this.field6813 = 164716045;
               this.method12680(-781508173);
               if (this.subMenus[var3] != null) {
                  this.field6816 = var3 * -1982257059;
                  this.subMenus[var3].method12700(this, (short)-8110);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   public final void method12690() {
      int var1 = this.field6817 * 727605925;
      int var2 = 1457978411 * this.field6815;
      int var3 = 6116423;
      classYW.method13698(var1, var2, this.field6812 * 1308041153, this.field6814 * -531540521, var3);
      if (this.field6810) {
         classYW.method13698(var1 + 1, var2 + 1, 1308041153 * this.field6812 - 2, 16, 0);
         classYW.method13707(1 + var1, 18 + var2, this.field6812 * 1308041153 - 2, this.field6814 * -531540521 - 19, 0);
         classBB.field341.method56(classKK.field3847, 3 + var1, 14 + var2, var3, -1);
      } else {
         classYW.method13707(var1 + 1, var2 + 1, this.field6812 * 1308041153 - 2, this.field6814 * -531540521 - 2, 0);
      }

      int var4 = MouseHandler.field6255 * -38255113;
      int var5 = -2144333897 * MouseHandler.field6264;

      for (int var6 = 0; var6 < -1927903443 * this.field6797; var6++) {
         int var7 = 14 + var2 + (this.field6797 * -1927903443 - 1 - var6) * 15;
         if (this.field6810) {
            var7 += 17;
         }

         int var8 = 16777215;
         if (var4 > var1 && var4 < var1 + 1308041153 * this.field6812 && var5 > var7 - 13 && var5 < 3 + var7) {
            var8 = 16776960;
         }

         if (var6 == this.field6816 * -1985221643 || -392503493 * this.field6813 == var6 && this.subMenus[var6] != null) {
            classYW.method13698(2 + var1, var7 - 12, this.field6812 * 1308041153 - 4, 15, 7496785);
         }

         classBB.field341.method56(method12648(this, var6, -115655011), var1 + 3, var7, var8, 0);
         if (this.subMenus[var6] != null) {
            classBB.field341.method101(62, 1308041153 * this.field6812 + var1 - 10, var7, 16777215);
         }
      }

      if (-1 != -1985221643 * this.field6816 && null != this.subMenus[this.field6816 * -1985221643]) {
         this.subMenus[this.field6816 * -1985221643].method12692(-1689280628);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Ljava/lang/String;I)I")
   @ObfuscatedName("af")
   public static int method12644(classXY var0, String var1, int var2) {
      try {
         int var3 = var0.field6955 * 702114061;
         byte[] var4 = classVX.method12262(var1, -1925400387);
         var0.method13026(var4.length, -1454653314);
         var0.field6955 = var0.field6955
            + classLF.field4133.method7143(var4, 0, var4.length, var0.field6954, var0.field6955 * 702114061, -962292593) * -1095856699;
         return var0.field6955 * 702114061 - var3;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "wz.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ab")
   static void method12650(int var0, int var1, int var2, int var3, int var4) {
      try {
         ItemContainer var5 = (ItemContainer)ItemContainer.field454.method13363(var0);
         if (var5 == null) {
            var5 = new ItemContainer();
            ItemContainer.field454.method13372(var5, var0);
         }

         if (var5.quantities.length <= var1) {
            if (var4 == 1575592240) {
               throw new IllegalStateException();
            }

            int[] var6 = new int[var1 + 1];
            int[] var7 = new int[1 + var1];

            for (int var8 = 0; var8 < var5.quantities.length; var8++) {
               var6[var8] = var5.quantities[var8];
               var7[var8] = var5.ids[var8];
            }

            for (int var10 = var5.quantities.length; var10 < var1; var10++) {
               if (var4 == 1575592240) {
                  throw new IllegalStateException();
               }

               var6[var10] = -1;
               var7[var10] = 0;
            }

            var5.quantities = var6;
            var5.ids = var7;
         }

         var5.quantities[var1] = var2;
         var5.ids[var1] = var3;
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "wz.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("az")
   public final String method12649(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 != -115655011) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else if (!this.field6805[var1].isEmpty()) {
            if (var2 != -115655011) {
               throw new IllegalStateException();
            } else {
               return this.field6804[var1] + classKK.field3688 + this.field6804[var1];
            }
         } else {
            return this.field6804[var1];
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "wz.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ax")
   public final boolean method12702(int var1, int var2, int var3) {
      boolean var4;
      if (this.field6815 * -1985221643 != -1
         && this.subMenus[this.field6813 * -1985221643] != null
         && this.subMenus[this.field6816 * -1985221643].method12693(var1, var2)) {
         var4 = true;
      } else if (var1 >= this.field6815 * 727605925 - 10
         && var1 <= this.field6817 * 1308041153 + this.field6816 * 727605925 + 10
         && var2 >= this.field6817 * 1457978411 - 10
         && var2 <= this.field6816 * -531540521 + this.field6812 * 1457978411 + 10) {
         int var5 = this.method12709(var1, var2);
         if (var5 != -1 && var5 != this.field6813 * -1985221643) {
            long var6 = classOE.field4843.getViewportYOffset();
            int var8 = var5;
            long var9 = Math.max(var6, this.field6819 * -7988158060854933767L);
            if (this.field6816 * -1985221643 != -1) {
               if (this.method12693(var1, var2)) {
                  var8 = -1;
                  var9 = Long.MAX_VALUE;
               } else if (this.field6817 * -392503493 == -1) {
                  if (var1 == this.field6797 && var2 == this.field6796) {
                     var9 = var6 + 8L;
                  } else {
                     var9 = var6 + 2L;
                  }
               }
            }

            this.field6817 = var8 * -164716045;
            this.field6819 = var9 * 8994289655695694665L;
            if (this.field6819 * -7988158060854933767L <= var6) {
               this.field6813 = -1 * -164716045;
               this.method12707();
               Menu var11 = this.subMenus[var5];
               if (var11 != null) {
                  this.field6815 = var5 * -1982257059;
                  var11.method12708(this);
                  client.field1096 = 0;
                  client.field1079 = 0;
                  if (var11.field6812 * -531540521 > classOE.field4843.getCameraMode()) {
                     client.field1084 = 0;
                     client.field1081 = (var11.field6817 * -531540521 - classOE.field4843.getCameraPitchTarget() + 14) / 15;
                  }
               }
            }
         }

         var4 = true;
      } else {
         var4 = false;
      }

      this.field6795 = var1;
      this.field6796 = var2;
      return var4;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void method12679(int var1) {
      this.method12703();

      try {
         this.method12680(-781508173);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wz.ao(" + ')');
      }
   }
}
