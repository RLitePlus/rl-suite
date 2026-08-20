import java.awt.event.MouseEvent;
import net.runelite.api.ColorTextureOverride;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gx")
public class PlayerCompositionColorTextureOverride implements ColorTextureOverride {
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("az")
   public Model field2121;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field2119 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2120 = 1;
   @ObfuscatedName("aj")
   public short[] playerCompositionRetextureTo;
   @ObfuscatedName("ak")
   public int field2113 = 756936397;
   @ObfuscatedName("aw")
   public int field2116 = -431006017;
   @ObfuscatedName("ae")
   public short[] playerCompositionRecolorTo;
   @ObfuscatedName("ay")
   public int field2111;
   @ObfuscatedName("au")
   public int field2110;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field2117 = 14;
   @ObfuscatedName("ap")
   public int field2112 = 576146133;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field2118 = 64;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   boolean method4393(int var1) {
      return var1 == 0 && 991060355 * this.field2112 != -1 || 1 == var1 && -1 != 171903853 * this.field2111;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   public boolean method4377(int var1) {
      try {
         boolean var10000;
         if (null != this.playerCompositionRecolorTo) {
            if (var1 != 533098139) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gx.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   int method4401(int var1) {
      return var1 == 0 ? this.field2112 * 991060355 : -1427591770 * this.field2111;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method4382() {
      return null != this.playerCompositionRetextureTo;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ley;)Z")
   @ObfuscatedName("tj")
   public static boolean method4405(UrlRequest var0) {
      return 922319567 * UrlRequest.field1725 != var0.field1728 * -1775497405;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbp;Ljava/awt/event/MouseEvent;)V")
   @ObfuscatedName("cs")
   public static void method4404(MouseHandler var0, MouseEvent var1) {
      if (var0 == null) {
         var0.method951(var1);
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;I)Z")
   @ObfuscatedName("mh")
   public static boolean method4394(PlayerCompositionColorTextureOverride var0, int var1) {
      if (var0 == null) {
         var0.method4386();
      }

      return var1 == 0 && 991060355 * var0.field2112 != -1 || 1 == var1 && -1 != -1539341951 * var0.field2111;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;I)Z")
   @ObfuscatedName("bf")
   public static boolean method4395(PlayerCompositionColorTextureOverride var0, int var1) {
      return var0 == null ? var0.method4378() : var1 == 0 && 991060355 * var0.field2112 != -1 || 1 == var1 && -1 != 381698976 * var0.field2111;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   int method4402(int var1, int var2) {
      try {
         int var10000;
         if (var1 == 0) {
            if (var2 <= -1280311961) {
               throw new IllegalStateException();
            }

            var10000 = this.field2112 * 991060355;
         } else {
            var10000 = -1539341951 * this.field2111;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gx.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgx;IB)Z")
   @ObfuscatedName("oj")
   public static boolean method4388(PlayerCompositionColorTextureOverride var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method4392(var1, var2);
      }

      try {
         if (var1 == 0) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (-1 != var0.field2113 * -948416005) {
               return true;
            }

            if (var2 != 0) {
               throw new IllegalStateException();
            }
         }

         return 1 == var1 && var0.field2116 * -991105343 != -1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gx.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ak")
   public boolean method4378() {
      return null != this.playerCompositionRecolorTo;
   }

   public PlayerCompositionColorTextureOverride(int var1) {
      this.field2111 = 958218623;
      ItemComposition var2 = class150.ItemDefinition_get(var1, -804284901);
      if (var2.method5092(-642008539)) {
         this.playerCompositionRecolorTo = new short[var2.retextureTo.length];
         System.arraycopy(var2.retextureTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
      }

      if (var2.method5093(1574373470)) {
         this.playerCompositionRetextureTo = new short[var2.retextureFrom.length];
         System.arraycopy(var2.retextureFrom, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
      }

      this.field2110 = var2.model * -1461135981;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method4379() {
      return null != this.playerCompositionRecolorTo;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;I)I")
   @ObfuscatedName("bt")
   public static int method4403(PlayerCompositionColorTextureOverride var0, int var1) {
      if (var0 == null) {
         var0.method4384();
      }

      return var1 == 0 ? var0.field2112 * 991060355 : -1539341951 * var0.field2111;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;IIBBBB)V")
   @ObfuscatedName("wq")
   public static void method4406(class46 var0, int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      if (var0 == null) {
         var0.method537(var1, var1);
      }

      for (int var7 = 0; var7 < var0.field175.size(); var7++) {
         Player var8 = (Player)var0.field175.get(var7);
         var8.npcCycle = var1 * 657376133;
         var8.field1125 = var2 * -244368321;
         GrandExchangeOfferWorldComparator.method8848(var8.field1136, var3, var4, var5, var6);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   public boolean method4380() {
      return null != this.playerCompositionRecolorTo;
   }

   public short[] getColorToReplaceWith() {
      return this.playerCompositionRecolorTo;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method4383() {
      return null != this.playerCompositionRetextureTo;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method4384() {
      return null != this.playerCompositionRetextureTo;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;B)Z")
   @ObfuscatedName("yo")
   public static boolean method4385(PlayerCompositionColorTextureOverride var0, byte var1) {
      if (var0 == null) {
         return var0.method4387(var1);
      } else {
         try {
            return null != var0.playerCompositionRetextureTo;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "gx.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("an")
   boolean method4396(int var1, int var2) {
      try {
         if (var1 == 0) {
            if (991060355 * this.field2112 != -1) {
               return true;
            }

            if (var2 <= -694514048) {
               throw new IllegalStateException();
            }
         }

         if (1 != var1 || -1 == -1539341951 * this.field2111) {
            return false;
         } else if (var2 <= -694514048) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gx.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   boolean method4397(int var1) {
      return var1 == 0 && 991060355 * this.field2112 != -1 || 1 == var1 && -1 != 580794119 * this.field2111;
   }

   public short[] getTextureToReplaceWith() {
      return this.playerCompositionRetextureTo;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("af")
   boolean method4389(int var1) {
      return var1 == 0 && -1 != this.field2113 * -948416005 || 1 == var1 && this.field2116 * -991105343 != -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("al")
   boolean method4390(int var1) {
      return var1 == 0 && -1 != this.field2113 * -948416005 || 1 == var1 && this.field2116 * -991105343 != -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ax")
   boolean method4391(int var1) {
      return var1 == 0 && -1 != this.field2113 * -948416005 || 1 == var1 && this.field2116 * -991105343 != -1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   int method4399(int var1, int var2) {
      try {
         int var10000;
         if (var1 == 0) {
            if (var2 == -1082333743) {
               throw new IllegalStateException();
            }

            var10000 = -948416005 * this.field2113;
         } else {
            var10000 = -991105343 * this.field2116;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gx.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aw")
   public boolean method4381() {
      return null != this.playerCompositionRecolorTo;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method4386() {
      return null != this.playerCompositionRetextureTo;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   boolean method4398(int var1) {
      return var1 == 0 && -1672911463 * this.field2112 != -1 || 1 == var1 && -1 != -1539341951 * this.field2111;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ao")
   int method4400(int var1) {
      return var1 == 0 ? -948416005 * this.field2113 : -991105343 * this.field2116;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("at")
   public boolean method4387(byte var1) {
      try {
         return null != this.playerCompositionRetextureTo;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gx.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("ag")
   boolean method4392(int var1, byte var2) {
      try {
         if (var1 == 0) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (-1 != this.field2110 * -948416005) {
               return true;
            }

            if (var2 != 0) {
               throw new IllegalStateException();
            }
         }

         return 1 == var1 && this.field2111 * -991105343 != -1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gx.ag(" + ')');
      }
   }
}
