import net.runelite.api.Ignore;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ty")
public class Ignored extends User implements Ignore {
   @ToRemove(unused = "true")
   @ObfuscatedName("ce")
   static final int field6003 = 30;
   @ObfuscatedName("av")
   int id;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field6001 = 28;

   @Override
   public int compareTo(Object var1) {
      try {
         return this.compareTo_ignored((Ignored)var1, 1699115097);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ty.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lty;I)I")
   @ObfuscatedName("av")
   int compareTo_ignored(Ignored var1, int var2) {
      try {
         return 1285081577 * this.id - var1.id * 1285081577;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ty.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("ap")
   @Override
   public int vmethod379(User var1) {
      return this.compareTo_ignored((Ignored)var1, 1863720760);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("aj")
   @Override
   public int vmethod380(Object var1) {
      return this.compareTo_ignored((Ignored)var1, 1779694795);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;I)I")
   @ObfuscatedName("at")
   @Override
   public int compareTo_user(User var1, int var2) {
      try {
         return this.compareTo_ignored((Ignored)var1, 1732550591);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ty.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod381(Object var1) {
      return this.compareTo_ignored((Ignored)var1, 2057217283);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lad;)[Ljava/lang/String;")
   @ObfuscatedName("mp")
   public static String[] method10980(SecureRandomSSLSocket var0) {
      if (var0 == null) {
         var0.method48();
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("ak")
   @Override
   public int vmethod376(User var1) {
      return this.compareTo_ignored((Ignored)var1, 1914041790);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod378(User var1) {
      return this.compareTo_ignored((Ignored)var1, 1745288326);
   }

   Ignored() {
   }

   @ObfuscatedSignature(descriptor = "(Lty;)I")
   @ObfuscatedName("ag")
   int method10979(Ignored var1) {
      return -1878311607 * this.id - var1.id * 1285081577;
   }
}
