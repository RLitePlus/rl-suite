import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("en")
public class classEN implements classXZ {
   @ObfuscatedName("as")
   public final int field1793;
   @ObfuscatedSignature(descriptor = "Len;")
   @ObfuscatedName("az")
   public static final classEN field1795 = new classEN(1, 0);
   @ObfuscatedSignature(descriptor = "Len;")
   @ObfuscatedName("ae")
   public static final classEN field1798 = new classEN(3, 2);
   @ObfuscatedSignature(descriptor = "Len;")
   @ObfuscatedName("ab")
   public static final classEN field1797 = new classEN(2, 3);
   @ObfuscatedSignature(descriptor = "Len;")
   @ObfuscatedName("ag")
   public static final classEN field1796 = new classEN(0, 4);
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final String field1801 = "services";
   @ObfuscatedName("ax")
   final int field1794;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("an")
   static AbstractArchive field1803;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hr")
   static classVP field1804;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("al")
   public static AbstractArchive field1802;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   public static final int field1800 = 61;
   @ObfuscatedSignature(descriptor = "Len;")
   @ObfuscatedName("af")
   public static final classEN field1799 = new classEN(4, 1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field1794 * 692765925;
   }

   classEN(int var1, int var2) {
      this.field1793 = var1 * -2139568645;
      this.field1794 = 1495619821 * var2;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public static int method3931(int var0, int var1) {
      try {
         return var0 >> 24 & 3;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "en.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field1794 * 692765925;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "en.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field1794 * 692765925;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field1794 * 692765925;
   }

   @ObfuscatedSignature(descriptor = "(ILcl;I)Lct;")
   @ObfuscatedName("az")
   public static Player method3930(int var0, classCL var1, int var2) {
      try {
         Player var3 = null;
         Iterator var4 = var1.iterator();

         while (var4.hasNext()) {
            if (var2 == 697875933) {
               throw new IllegalStateException();
            }

            WorldView var5 = (WorldView)var4.next();
            Player var6 = (Player)var5.field1694.method13404(var0);
            if (null != var6) {
               if (var2 == 697875933) {
                  throw new IllegalStateException();
               }

               if (!var5.method3719(-2087374717)) {
                  return var6;
               }

               if (var2 == 697875933) {
                  throw new IllegalStateException();
               }

               var3 = var6;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "en.az(" + ')');
      }
   }
}
