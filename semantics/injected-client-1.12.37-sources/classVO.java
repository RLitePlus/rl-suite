import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vo")
public class classVO extends classVJ {
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("eh")
   public classVO field6531;
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("el")
   public classVO field6532;
   @ObfuscatedName("ev")
   public long field6530;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcd;I)Z")
   @ObfuscatedName("te")
   public static boolean method12009(classCD var0, int var1) {
      return var0.field688 != null && var1 >= 0 && var1 < var0.field688.length && var0.field688[var1] != null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("md")
   public void method12004() {
      if (this.field6531 != null) {
         this.field6531.field6532 = this.field6532;
         this.field6532.field6531 = this.field6531;
         this.field6532 = null;
         this.field6531 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mi")
   public void method12005() {
      if (this.field6531 != null) {
         this.field6531.field6532 = this.field6532;
         this.field6532.field6531 = this.field6531;
         this.field6532 = null;
         this.field6531 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("mh")
   public void method12006() {
      if (this.field6531 != null) {
         this.field6531.field6532 = this.field6532;
         this.field6532.field6531 = this.field6531;
         this.field6532 = null;
         this.field6531 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqa;)Lqy;")
   @ObfuscatedName("fs")
   public static classQY method12008(classQA var0) {
      return var0.field5504;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvo;)V")
   @ObfuscatedName("jr")
   public static void method12007(classVO var0) {
      if (var0.field6531 != null) {
         var0.field6531.field6532 = var0.field6532;
         var0.field6532.field6531 = var0.field6531;
         var0.field6532 = null;
         var0.field6531 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lau;)Laj;")
   @ObfuscatedName("lp")
   public static classAJ method12010(classAU var0) {
      if (var0.field280.field138 == null) {
         var0.field280.field138 = var0.field280.field137.method972(null);
         var0.field280.field137 = null;
      }

      return var0.field280.field138;
   }
}
