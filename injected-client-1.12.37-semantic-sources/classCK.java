import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ck")
public class classCK implements classXZ {
   @ObfuscatedName("as")
   final int field770;
   @ObfuscatedSignature(descriptor = "Lck;")
   @ObfuscatedName("af")
   static final classCK field769 = new classCK(1);
   @ObfuscatedSignature(descriptor = "Lck;")
   @ObfuscatedName("az")
   static final classCK field765 = new classCK(0);
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field772 = 8192;
   @ObfuscatedSignature(descriptor = "Lck;")
   @ObfuscatedName("ag")
   static final classCK field768 = new classCK(4);
   @ObfuscatedSignature(descriptor = "Lck;")
   @ObfuscatedName("ae")
   static final classCK field767 = new classCK(2);
   @ToRemove(unused = "true")
   @ObfuscatedName("cv")
   static final int field775 = 100;
   @ObfuscatedName("ik")
   static int field776;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("cc")
   static IndexedSprite field778;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   public static final int field773 = 25;
   @ObfuscatedSignature(descriptor = "Lck;")
   @ObfuscatedName("ab")
   static final classCK field766 = new classCK(3);
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   static final int field774 = 55;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field771 = 18;
   @ObfuscatedName("pl")
   static int field777;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmx;Lnm;Lnm;)I")
   @ObfuscatedName("kw")
   public static int method1576(classMX var0, classNM var1, classNM var2) {
      if (var0 == null) {
         var0.method7734(var1, var1);
      }

      return var1.field4687 * 4044309507405125089L < 4044309507405125089L * var2.field4687
         ? -1
         : (4044309507405125089L * var1.field4687 == 4044309507405125089L * var2.field4687 ? 0 : 1);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return -1776113227 * this.field770;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ck.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("gu")
   static void method1577(byte[] var0, int var1, int var2) {
      try {
         if (null == client.field944) {
            if (var2 == -6840416) {
               throw new IllegalStateException();
            }

            client.field944 = new byte[24];
         }

         classZZ.method14238(var0, var1, client.field944, 0, 24);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ck.gu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return -1776113227 * this.field770;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return -572266813 * this.field770;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return -1776113227 * this.field770;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public static int method1575(int var0, int var1) {
      try {
         return var0 >> 11 & 63;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ck.az(" + 41);
      }
   }

   classCK(int var1) {
      this.field770 = -171328355 * var1;
   }
}
