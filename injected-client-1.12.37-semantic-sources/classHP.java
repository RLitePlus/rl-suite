import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hp")
public class classHP {
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   public static final int field2862 = 4194304;
   @ObfuscatedSignature(descriptor = "Lhp;")
   @ObfuscatedName("af")
   public static final classHP field2857 = new classHP(2, 1, 2);
   @ObfuscatedSignature(descriptor = "Lhp;")
   @ObfuscatedName("ae")
   public static final classHP field2858 = new classHP(0, 2, 0);
   @ObfuscatedSignature(descriptor = "Lhp;")
   @ObfuscatedName("az")
   public static final classHP field2856 = new classHP(1, 0, 3);
   @ObfuscatedName("ag")
   final int field2854;
   @ObfuscatedName("as")
   final int field2855;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2859 = 8;
   @ObfuscatedName("ab")
   final int field2853;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2860 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   static final int field2863 = 122;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2861 = 30;

   @ObfuscatedSignature(descriptor = "(FI)Z")
   @ObfuscatedName("ae")
   boolean method6087(float var1, int var2) {
      try {
         boolean var10000;
         if (var1 >= -918748885 * this.field2855) {
            if (var2 <= -1264009661) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hp.ae(" + ')');
      }
   }

   classHP(int var1, int var2, int var3) {
      this.field2853 = 1224731469 * var1;
      this.field2854 = -1147798695 * var2;
      this.field2855 = -547375741 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lhp;")
   @ObfuscatedName("as")
   static classHP[] method6081() {
      return new classHP[]{field2858, field2856, field2857};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhp;F)Z")
   @ObfuscatedName("lm")
   public static boolean method6088(classHP var0, float var1) {
      return var1 >= -918748885 * var0.field2855;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lhp;")
   @ObfuscatedName("ab")
   static classHP[] method6082() {
      return new classHP[]{field2858, field2856, field2857};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lef;Lsn;I[ZZ)V")
   @ObfuscatedName("ds")
   public static void method6092(classEF var0, classSN var1, int var2, boolean[] var3, boolean var4) {
      if (var0 == null) {
         var0.method3875();
      }

      int var5 = var1.method10516(-1222070415);
      int var6 = 0;
      classSG[] var7 = var0.method3860(-1477469449);

      for (int var8 = 0; var8 < var7.length; var8++) {
         classSG var9 = var7[var8];
         if (var3 == null || var3[var6] == var4) {
            var1.method10540(var2, var9, var6, var5, -108490733);
         }

         var6++;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhp;F)Z")
   @ObfuscatedName("kk")
   public static boolean method6089(classHP var0, float var1) {
      return var1 >= -918748885 * var0.field2855;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lhp;")
   @ObfuscatedName("ag")
   static classHP[] method6083() {
      return new classHP[]{field2858, field2856, field2857};
   }

   @ObfuscatedSignature(descriptor = "(B)[Lhp;")
   @ObfuscatedName("az")
   static classHP[] method6084(byte var0) {
      try {
         return new classHP[]{field2858, field2856, field2857};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "hp.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lhp;")
   @ObfuscatedName("af")
   static classHP method6085(int var0, byte var1) {
      try {
         classHP[] var2 = method6084((byte)11);

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            }

            classHP var4 = var2[var3];
            if (var0 == 1937022185 * var4.field2854) {
               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "hp.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(F)Z")
   @ObfuscatedName("ac")
   boolean method6090(float var1) {
      return var1 >= -918748885 * this.field2855;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhp;")
   @ObfuscatedName("ax")
   static classHP method6086(int var0) {
      classHP[] var1 = method6084((byte)-79);

      for (int var2 = 0; var2 < var1.length; var2++) {
         classHP var3 = var1[var2];
         if (var0 == 1937022185 * var3.field2854) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "([Lym;I)V")
   @ObfuscatedName("az")
   static void method6091(SpritePixels[] var0, int var1) {
      try {
         classCE.field713 = var0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "hp.az(" + ')');
      }
   }
}
