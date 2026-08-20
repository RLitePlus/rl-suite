import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class GrandExchangeEvent {
   @ObfuscatedName("an")
   String offerName;
   @ObfuscatedName("at")
   public final long age;
   @ObfuscatedSignature(descriptor = "Lqg;")
   @ObfuscatedName("ag")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("av")
   public final int world;
   @ObfuscatedName("ae")
   String previousOfferName;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ag")
   public String method8933() {
      return this.previousOfferName;
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("av")
   public String getOfferName(byte var1) {
      try {
         return this.previousOfferName;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qk.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("at")
   public String getPreviousOfferName(byte var1) {
      try {
         return this.offerName;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qk.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ae")
   public String method8937() {
      return this.offerName;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("an")
   public String method8935() {
      return this.previousOfferName;
   }

   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.previousOfferName = var1.readStringCp1252NullCircumfixed(567818636);
      this.offerName = var1.readStringCp1252NullCircumfixed(-253572485);
      this.world = Buffer.method12008(var1, (byte)5) * 31640103;
      this.age = Buffer.method12018(var1, -2014457910) * -4651140663968299529L;
      int var4 = Buffer.method12015(var1, 803045434);
      int var5 = Buffer.method12015(var1, -196969416);
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method8899(2, (byte)99);
      GrandExchangeOffer.method8908(this.grandExchangeOffer, var2, -1367739041);
      this.grandExchangeOffer.unitPrice = -495506635 * var4;
      this.grandExchangeOffer.totalQuantity = var5 * -2105408517;
      this.grandExchangeOffer.currentQuantity = 0;
      this.grandExchangeOffer.currentPrice = 0;
      this.grandExchangeOffer.id = -830735949 * var3;
   }

   @ObfuscatedSignature(descriptor = "(Lut;II)Ljava/lang/Object;")
   @ObfuscatedName("ah")
   public static Object method8939(DynamicArray var0, int var1, int var2) {
      try {
         class461.method9338(var0, null, true, -928498657);
         if (var1 >= 0) {
            if (var2 >= -1625510109) {
               throw new IllegalStateException();
            }

            if (var1 < 1583568339 * var0.size) {
               Object var3 = var0.method11219(var1, (short)-7543);
               if (var1 < var0.size * 1583568339 - 1) {
                  HttpResponse.method142(var0, var1 + 1, var0, var1, 1583568339 * var0.size - (var1 + 1), (byte)2);
               }

               var0.method11236(var0.size * 1583568339 - 1, (byte)-73);
               return var3;
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qk.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method8938() {
      return this.previousOfferName;
   }
}
