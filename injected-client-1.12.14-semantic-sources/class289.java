import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ly")
public class class289 implements Comparator {
   @ObfuscatedName("px")
   static int oculusOrbFocalPointZ;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field3802 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field3803 = 2;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method7333(Object var1, Object var2) {
      return this.method7329((class282)var1, (class282)var2, (byte)-54);
   }

   @ObfuscatedSignature(descriptor = "(Lkc;Lkc;B)I")
   @ObfuscatedName("av")
   int method7329(class282 var1, class282 var2, byte var3) {
      try {
         return var1.method6296((byte)-70) - var2.method6296((byte)32);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ly.av(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method7329((class282)var1, (class282)var2, (byte)58);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ly.compare(" + 41);
      }
   }

   class289() {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method7336(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method7334(Object var1, Object var2) {
      return this.method7329((class282)var1, (class282)var2, (byte)64);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method7335(Object var1, Object var2) {
      return this.method7329((class282)var1, (class282)var2, (byte)-22);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ly.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method7337(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method7338(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lkc;Lkc;)I")
   @ObfuscatedName("ak")
   int method7330(class282 var1, class282 var2) {
      return var1.method6296((byte)9) - var2.method6296((byte)33);
   }

   @ObfuscatedSignature(descriptor = "(Lkc;Lkc;)I")
   @ObfuscatedName("aw")
   int method7331(class282 var1, class282 var2) {
      return var1.method6296((byte)-10) - var2.method6296((byte)4);
   }

   @ObfuscatedSignature(descriptor = "(Lkc;Lkc;)I")
   @ObfuscatedName("aj")
   int method7332(class282 var1, class282 var2) {
      return var1.method6296((byte)29) - var2.method6296((byte)36);
   }
}
