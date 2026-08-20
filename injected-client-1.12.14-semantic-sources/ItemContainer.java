import javax.annotation.Nonnull;
import net.runelite.api.Item;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cn")
public class ItemContainer extends Node implements net.runelite.api.ItemContainer {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field1061 = 127;
   @ObfuscatedName("at")
   int[] ids = new int[]{-1};
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field1060 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field1062 = 75;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("av")
   static NodeHashTable itemContainers = new NodeHashTable(32);
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field1063 = 40;
   @ObfuscatedName("an")
   public static short[][] field1065;
   @ObfuscatedName("ag")
   int[] quantities = new int[]{0};
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field1064 = 56;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   static int method2614(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)itemContainers.method8915(var0);
      if (null == var2) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
      }
   }

   public int count() {
      int var1 = 0;

      for (int var5 : this.ids) {
         if (var5 != -1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   static void method2622(int var0) {
      ItemContainer var1 = (ItemContainer)itemContainers.method8915(var0);
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.ids.length; var2++) {
            var1.ids[var2] = -1;
            var1.quantities[var2] = 0;
         }
      }
   }

   public Item getItem(int var1) {
      return var1 >= 0 && var1 < this.ids.length && this.ids[var1] != -1 ? new Item(this.ids[var1], this.quantities[var1]) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   static void method2623(int var0) {
      ItemContainer var1 = (ItemContainer)itemContainers.method8915(var0);
      if (var1 != null) {
         for (int var2 = 0; var2 < var1.ids.length; var2++) {
            var1.ids[var2] = -1;
            var1.quantities[var2] = 0;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ay")
   static int method2616(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)itemContainers.method8915(var0);
      if (null == var2) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for (int var4 = 0; var4 < var2.quantities.length; var4++) {
            if (var1 == var2.ids[var4]) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("au")
   static int method2617(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)itemContainers.method8915(var0);
      if (null == var2) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for (int var4 = 0; var4 < var2.quantities.length; var4++) {
            if (var1 == var2.ids[var4]) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;I)V")
   @ObfuscatedName("av")
   public static void method2613(AbstractArchive var0, int var1) {
      try {
         FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cn.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ad")
   static void method2620(int var0, int var1, int var2, int var3) {
      ItemContainer var4 = (ItemContainer)itemContainers.method8915(var0);
      if (var4 == null) {
         var4 = new ItemContainer();
         itemContainers.put(var4, var0);
      }

      if (var4.ids.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         for (int var7 = 0; var7 < var4.ids.length; var7++) {
            var5[var7] = var4.ids[var7];
            var6[var7] = var4.quantities[var7];
         }

         for (int var8 = var4.ids.length; var8 < var1; var8++) {
            var5[var8] = -1;
            var6[var8] = 0;
         }

         var4.ids = var5;
         var4.quantities = var6;
      }

      var4.ids[var1] = var2;
      var4.quantities[var1] = var3;
   }

   public boolean contains(int var1) {
      for (int var5 : this.ids) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }

   ItemContainer() {
   }

   public int count(int var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.ids.length; var3++) {
         if (this.ids[var3] == var1) {
            int var4 = this.quantities[var3];
            if (var4 > 1) {
               return var4;
            }

            var2++;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ap")
   static int method2618(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)itemContainers.method8915(var0);
      if (null == var2) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for (int var4 = 0; var4 < var2.quantities.length; var4++) {
            if (var1 == var2.ids[var4]) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ai")
   static void method2621(int var0, int var1, int var2, int var3) {
      ItemContainer var4 = (ItemContainer)itemContainers.method8915(var0);
      if (var4 == null) {
         var4 = new ItemContainer();
         itemContainers.put(var4, var0);
      }

      if (var4.ids.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         for (int var7 = 0; var7 < var4.ids.length; var7++) {
            var5[var7] = var4.ids[var7];
            var6[var7] = var4.quantities[var7];
         }

         for (int var8 = var4.ids.length; var8 < var1; var8++) {
            var5[var8] = -1;
            var6[var8] = 0;
         }

         var4.ids = var5;
         var4.quantities = var6;
      }

      var4.ids[var1] = var2;
      var4.quantities[var1] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   static void method2624(int var0) {
      ItemContainer var1 = (ItemContainer)itemContainers.method8915(var0);
      if (var1 != null) {
         var1.remove();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   static void method2625() {
      itemContainers = new NodeHashTable(177724639);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   static void method2626() {
      itemContainers = new NodeHashTable(32);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   static void method2627() {
      itemContainers = new NodeHashTable(918880107);
   }

   @Nonnull
   public Item[] getItems() {
      Item[] var1 = new Item[this.ids.length];

      for (int var2 = 0; var2 < this.ids.length; var2++) {
         var1[var2] = new Item(this.ids[var2], this.quantities[var2]);
      }

      return var1;
   }

   public int size() {
      return this.ids.length;
   }

   public int find(int var1) {
      for (int var2 = 0; var2 < this.ids.length; var2++) {
         if (this.ids[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public int getId() {
      return (int)this.getHash();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lms;)Z")
   @ObfuscatedName("ja")
   public static boolean method2615(AbstractWorldMapIcon var0) {
      if (var0 == null) {
         var0.getCoordinate();
      }

      return var0.getElement(1005465983) >= 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   static void method2628() {
      itemContainers = new NodeHashTable(32);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   static int method2619(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)itemContainers.method8915(var0);
      if (null == var2) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for (int var4 = 0; var4 < var2.quantities.length; var4++) {
            if (var1 == var2.ids[var4]) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }
}
