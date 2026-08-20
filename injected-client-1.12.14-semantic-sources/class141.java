import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fz")
public class class141 implements Enum {
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("aw")
   static final class141 field1947 = new class141(7, 7, null, 6, 3);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("at")
   static final class141 field1950 = new class141(1, 1, null, 0, 2);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ag")
   static final class141 field1957 = new class141(2, 2, null, 1, 2);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("an")
   static final class141 field1949 = new class141(3, 3, null, 2, 2);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ae")
   static final class141 field1955 = new class141(4, 4, null, 3, 1);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("aj")
   static final class141 field1951 = new class141(5, 5, null, 4, 1);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ak")
   static final class141 field1959 = new class141(6, 6, null, 5, 1);
   @ObfuscatedName("ax")
   final int field1963;
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ap")
   static final class141 field1954 = new class141(8, 8, null, 7, 3);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ay")
   static final class141 field1962 = new class141(9, 9, null, 8, 3);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("au")
   static final class141 field1956 = new class141(10, 10, null, 0, 7);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("az")
   static final class141 field1952 = new class141(11, 11, null, 1, 7);
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("bf")
   public static AbstractArchive field1966;
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ab")
   static final class141 field1948 = new class141(16, 16, null, 0, 5);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("as")
   static final class141 field1960 = new class141(14, 14, null, 4, 7);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ai")
   static final class141 field1958 = new class141(13, 13, null, 3, 7);
   @ObfuscatedName("ar")
   final int field1965;
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ad")
   static final class141 field1953 = new class141(12, 12, null, 2, 7);
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ac")
   static final class141 field1961 = new class141(15, 15, null, 5, 7);
   @ObfuscatedName("ah")
   final int field1964;
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("av")
   static final class141 field1946 = new class141(0, 0, null, -1, -1);

   @ObfuscatedSignature(descriptor = "(II)Lwi;")
   @ObfuscatedName("at")
   public static DbRowType getDbRowType(int var0, int var1) {
      try {
         DbRowType var2 = (DbRowType)class402.method8806(DbRowType.DBRowType_cache, var0);
         if (null != var2) {
            if (var1 >= 357281809) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classGP.field2045.getFile(38, var0, -1649459582);
            var2 = new DbRowType();
            if (var3 != null) {
               if (var1 >= 357281809) {
                  throw new IllegalStateException();
               }

               var2.method11726(new Buffer(var3), 2005835858);
            }

            var2.method11736((byte)-86);
            DbRowType.DBRowType_cache.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fz.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return 83983233 * this.field1965;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fz.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ak")
   int method4209(byte var1) {
      try {
         return this.field1964 * -830743683;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fz.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcg;I)V")
   @ObfuscatedName("av")
   public static void runScriptEvent(ScriptEvent var0, int var1) {
      try {
         LoginType.runScript(var0, 500000, 475000, (byte)-13);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fz.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return 1327352664 * this.field1965;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return 83983233 * this.field1965;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lfz;")
   @ObfuscatedName("aw")
   static class141[] method4206() {
      return new class141[]{
         field1946,
         field1950,
         field1957,
         field1949,
         field1955,
         field1951,
         field1959,
         field1947,
         field1954,
         field1962,
         field1956,
         field1952,
         field1953,
         field1958,
         field1960,
         field1961,
         field1948
      };
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lfz;")
   @ObfuscatedName("ap")
   static class141[] method4207() {
      return new class141[]{
         field1946,
         field1950,
         field1957,
         field1949,
         field1955,
         field1951,
         field1959,
         field1947,
         field1954,
         field1962,
         field1956,
         field1952,
         field1953,
         field1958,
         field1960,
         field1961,
         field1948
      };
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lfz;")
   @ObfuscatedName("ay")
   static class141[] method4208() {
      return new class141[]{
         field1946,
         field1950,
         field1957,
         field1949,
         field1955,
         field1951,
         field1959,
         field1947,
         field1954,
         field1962,
         field1956,
         field1952,
         field1953,
         field1958,
         field1960,
         field1961,
         field1948
      };
   }

   @ObfuscatedSignature(descriptor = "(Lof;III)V")
   @ObfuscatedName("nw")
   static final void clickWidget(Widget var0, int var1, int var2, int var3) {
      try {
         if (null == client.clickedWidget) {
            if (!client.isMenuOpen) {
               if (var0 != null) {
                  if (KitDefinition.method4848(var0, (byte)80) != null) {
                     client.clickedWidget = var0;
                     client.clickedWidgetParent = KitDefinition.method4848(var0, (byte)48);
                     client.widgetClickX = var1 * 1681359969;
                     client.widgetClickY = var2 * -301301895;
                     class201.widgetDragDuration = 0;
                     client.isDraggingWidget = false;
                     client.method2513(-1);
                     int var4 = client.menu.field6552 * 1759446067 - 1;
                     if (-1 != var4) {
                        class329.method7395(var4, (byte)-64);
                     }

                     return;
                  }

                  if (var3 >= 783092497) {
                     throw new IllegalStateException();
                  }
               }

               return;
            }

            if (var3 >= 783092497) {
               return;
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "fz.nw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -1252446132 * this.field1965;
   }

   class141(int var1, int var2, String var3, int var4, int var5) {
      this.field1963 = 650643851 * var1;
      this.field1965 = var2 * 2024981633;
      this.field1964 = -1589660203 * var4;
   }
}
