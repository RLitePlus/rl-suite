import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tt")
public final class class499 implements Comparable {
   @ObfuscatedName("at")
   Object field5976;
   @ObfuscatedName("av")
   Object field5977;
   @ObfuscatedName("ag")
   long field5979;
   @ObfuscatedName("an")
   long field5980;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("az")
   static IndexedSprite[] mapSceneSprites;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field5978 = 128;

   @ObfuscatedSignature(descriptor = "(Ltt;B)I")
   @ObfuscatedName("av")
   int method10896(class499 var1, byte var2) {
      try {
         if (-2975702961368216467L * this.field5980 < var1.field5980 * -2975702961368216467L) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (this.field5980 * -2975702961368216467L > var1.field5980 * -2975702961368216467L) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tt.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltt;)I")
   @ObfuscatedName("at")
   int method10897(class499 var1) {
      if (-2975702961368216467L * this.field5980 < var1.field5980 * -2975702961368216467L) {
         return -1;
      } else {
         return this.field5980 * -2975702961368216467L > var1.field5980 * -2975702961368216467L ? 1 : 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltt;Ljava/lang/Object;)Z")
   @ObfuscatedName("vh")
   public static boolean method10899(class499 var0, Object var1) {
      if (var0 == null) {
         var0.compareTo(var1);
      }

      if (var1 instanceof class499) {
         return var0.field5977.equals(((class499)var1).field5977);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;CII)Lsc;")
   @ObfuscatedName("la")
   public static classSC method10905(classSF var0, char var1, int var2, int var3) {
      if (var0 == null) {
         var0.method10138(var2);
      }

      return classSF.method10163(var0, Character.toString(var1), var2, var3, 473615484);
   }

   @Override
   public int hashCode() {
      try {
         return this.field5977.hashCode();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "tt.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method10900(Object var1) {
      if (var1 instanceof class499) {
         return this.field5977.equals(((class499)var1).field5977);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltt;Ljava/lang/Object;)I")
   @ObfuscatedName("ol")
   public static int method10903(class499 var0, Object var1) {
      return var0 == null ? var0.method10902() : var0.method10896((class499)var1, (byte)7);
   }

   @Override
   public int compareTo(Object var1) {
      try {
         return this.method10896((class499)var1, (byte)-4);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tt.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method10901(Object var1) {
      if (var1 instanceof class499) {
         return this.field5977.equals(((class499)var1).field5977);
      } else {
         throw new IllegalArgumentException();
      }
   }

   class499(Object var1, Object var2) {
      this.field5976 = var1;
      this.field5977 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lsr;I)I")
   @ObfuscatedName("ol")
   public static int method10906(classSR var0, int var1) {
      return var0 == null ? var0.method10502(var1) : var0.method10498(var1, (byte)24);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method10902() {
      return this.field5977.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (var1 instanceof class499) {
            return this.field5977.equals(((class499)var1).field5977);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tt.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltt;)I")
   @ObfuscatedName("an")
   int method10898(class499 var1) {
      if (-2975702961368216467L * this.field5980 < var1.field5980 * -2975702961368216467L) {
         return -1;
      } else {
         return this.field5980 * -2975702961368216467L > var1.field5980 * -2975702961368216467L ? 1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("aj")
   public int method10904(Object var1) {
      return this.method10896((class499)var1, (byte)-71);
   }
}
