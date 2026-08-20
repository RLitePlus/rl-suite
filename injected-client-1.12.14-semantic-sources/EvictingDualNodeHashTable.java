import net.runelite.api.NodeCache;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mc")
public final class EvictingDualNodeHashTable implements NodeCache {
   @ObfuscatedSignature(descriptor = "Lvo;")
   @ObfuscatedName("av")
   DualNode dualNode;
   @ObfuscatedName("at")
   int capacity;
   @ObfuscatedName("ag")
   int remainingCapacity;
   @ObfuscatedName("hm")
   public int field3828;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("an")
   IterableNodeHashTable hashTable;
   @ObfuscatedName("uj")
   public float field3822 = 0.0F;
   @ObfuscatedSignature(descriptor = "Lrn;")
   @ObfuscatedName("ae")
   IterableDualNodeQueue deque;

   public EvictingDualNodeHashTable(int var1) {
      this.dualNode = new DualNode();
      this.deque = new IterableDualNodeQueue();
      this.capacity = var1;
      this.remainingCapacity = var1;
      byte var2 = 1;

      while (var2 + var2 < var1) {
         var2 += var2;
      }

      this.hashTable = new IterableNodeHashTable(var2);
      this.method7385();
   }

   @ObfuscatedSignature(descriptor = "(Lvo;J)V")
   @ObfuscatedName("ag")
   public void put(DualNode var1, long var2) {
      if (this.remainingCapacity == 0) {
         DualNode var4 = IterableDualNodeQueue.method9708(this.deque);
         var4.remove();
         var4.removeDual();
         if (var4 == this.dualNode) {
            var4 = IterableDualNodeQueue.method9708(this.deque);
            var4.remove();
            var4.removeDual();
         }
      } else {
         this.remainingCapacity--;
      }

      this.hashTable.put((Node)var1, var2);
      this.deque.add(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   public void clear() {
      this.deque.clear();
      this.hashTable.clear();
      this.dualNode = new DualNode();
      this.remainingCapacity = this.capacity;
      this.method7387();
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("ae")
   public DualNode method7366(long var1) {
      DualNode var3 = (DualNode)this.hashTable.get(var1);
      if (var3 != null) {
         this.deque.add(var3);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("ak")
   public DualNode method7367(long var1) {
      DualNode var3 = (DualNode)this.hashTable.get(var1);
      if (var3 != null) {
         this.deque.add(var3);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gm")
   public static void method7389() {
      method7384("EnumDefinition_cached", EnumComposition.EnumDefinition_cached);
      method7384("SpotAnimationDefinition_cachedModels", SpotAnimationDefinition.SpotAnimationDefinition_cached);
      method7384("animPoseCache", SequenceDefinition.SequenceDefinition_cachedFrames);
      method7384("animationCache", SequenceDefinition.SequenceDefinition_cached);
      method7384("animayaPoses", SequenceDefinition.SequenceDefinition_cachedModel);
      method7384("cachedModels2", ObjectComposition.ObjectDefinition_cachedModels);
      method7384("dbRowConfigCache", DbRowType.DBRowType_cache);
      method7384("dbTableConfigCache", DbTableType.DBTableType_cache);
      method7384("dbTableIndexCache", client.DBTableIndex_cache);
      method7384("field1951", class179.field1842);
      method7384("field1958", class180.field1913);
      method7384("field1965", class181.field1915);
      method7384("field1970", class182.field1851);
      method7384("field1980", class184.field1864);
      method7384("field1987", WorldMapElement.HitSplatDefinition_cached);
      method7384("field2011", VarcInt.VarcInt_cached);
      method7384("field2056", class191.field2007);
      method7384("field2076", class194.field2023);
      method7384("field2085", class196.field2026);
      method7384("field2162", class200.field2100);
      method7384("field2184", class203.field2022);
      method7384("field2237", WorldEntityConfig.field2374);
      method7384("field2261", class209.field2136);
      method7384("field2280", class212.field1909);
      method7384("field2311", HitSplatDefinition.HitSplatDefinition_cachedFonts);
      method7384("field511", client.archive11);
      method7384("healthBarCache", HealthBarDefinition.HealthBarDefinition_cached);
      method7384("healthBarSpriteCache", HealthBarDefinition.HealthBarDefinition_cachedSprites);
      method7384("hitsplatCompCache", HitSplatDefinition.HitSplatDefinition_cached);
      method7384("hitsplatFontCache", HitSplatDefinition.HitSplatDefinition_cachedSprites);
      method7384("identKits", KitDefinition.KitDefinition_cached);
      method7384("inventoryCache", InvDefinition.InvDefinition_cached);
      method7384("itemModelCache", ItemComposition.ItemDefinition_cachedModels);
      method7384("itemSpriteCache", ItemComposition.ItemDefinition_cachedSprites);
      method7384("items", ItemComposition.ItemDefinition_cached);
      method7384("npcModelCache", NPCComposition.NpcDefinition_cachedModels);
      method7384("npcs", NPCComposition.NpcDefinition_cached);
      method7384("objModelDataCache", ObjectComposition.ObjectDefinition_cachedModelData);
      method7384("objects", ObjectComposition.ObjectDefinition_cached);
      method7384("overlays", FloorOverlayDefinition.FloorOverlayDefinition_cached);
      method7384("paramCompositionCache", ParamComposition.ParamDefinition_cached);
      method7384("playerModelCache", PlayerComposition.PlayerAppearance_cachedModels);
      method7384("scriptCache", Script.Script_cached);
      method7384("spotanimModelCache", SpotAnimationDefinition.SpotAnimationDefinition_cachedModels);
      method7384("structCompositionCache", StructComposition.StructDefinition_cached);
      method7384("underlays", FloorUnderlayDefinition.FloorUnderlayDefinition_cached);
      method7384("varbits", VarbitComposition.VarbitDefinition_cached);
      method7384("varplayers", VarpDefinition.VarpDefinition_cached);
      method7384("worldEntitySpriteCache", WorldEntityConfig.field2375);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("at")
   public void remove(long var1) {
      DualNode var3 = (DualNode)this.hashTable.get(var1);
      if (var3 != null) {
         var3.remove();
         var3.removeDual();
         this.remainingCapacity++;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)I")
   @ObfuscatedName("kt")
   public static int method7382(classOO var0) {
      return var0.field4654.method10210(-1180180008);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("vw")
   public void method7387() {
      this.field3822 = 0.0F;
      this.deque.method9725(this.dualNode);
   }

   public void reset() {
      this.clear();
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("aj")
   public DualNode method7368(long var1) {
      DualNode var3 = (DualNode)this.hashTable.get(var1);
      if (var3 != null) {
         this.deque.add(var3);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("aw")
   public DualNode method7369(long var1) {
      DualNode var3 = (DualNode)this.hashTable.get(var1);
      if (var3 != null) {
         this.deque.add(var3);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("px")
   public void method7388(int var1) {
      if (var1 > this.capacity) {
         byte var2 = 1;

         while (var2 < var1) {
            var2 += var2;
         }

         this.capacity = var2;
         this.reset();
         this.hashTable = new IterableNodeHashTable(var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("df")
   public void method7385() {
      this.field3828 = this.capacity;
   }

   @ObfuscatedSignature(descriptor = "(Lvo;J)V")
   @ObfuscatedName("az")
   public void method7374(DualNode var1, long var2) {
      if (this.remainingCapacity == 0) {
         DualNode var4 = IterableDualNodeQueue.method9708(this.deque);
         var4.remove();
         var4.removeDual();
         if (var4 == this.dualNode) {
            var4 = IterableDualNodeQueue.method9708(this.deque);
            var4.remove();
            var4.removeDual();
         }
      } else {
         this.remainingCapacity--;
      }

      this.hashTable.put((Node)var1, var2);
      this.deque.add(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lmc;)V")
   @ObfuscatedName("by")
   public static void method7384(String var0, EvictingDualNodeHashTable var1) {
      synchronized (var1) {
         EvictingDualNodeHashTable var3 = var1;
         boolean var4 = var3.method7383();
         var3.field3822 = var3.field3822 * 0.92F + (var4 ? 0.07999998F : 0.0F);
         if (var4) {
            if (var3.field3822 > 0.2F) {
               client.field938.trace("cache {} is thrashing", var0);
            }

            if (var3.field3822 > 0.9F && var3.capacity < var3.field3828 * 8) {
               var3.method7388(var3.capacity * 2);
               client.field938.info("cache {} thrashing, enlarging to {} entries", var0, var3.capacity);
            }
         }

         var3.deque.method9725(var3.dualNode);
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("ga")
   public DualNode method7390(long var1) {
      return class402.method8806(this, var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method7377() {
      this.deque.clear();
      this.hashTable.clear();
      this.dualNode = new DualNode();
      this.remainingCapacity = this.capacity;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method7378() {
      this.deque.clear();
      this.hashTable.clear();
      this.dualNode = new DualNode();
      this.remainingCapacity = this.capacity;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("qu")
   public void method7386(int var1) {
      this.method7388(var1);
      this.field3828 = this.capacity;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmc;J)V")
   @ObfuscatedName("bs")
   public static void method7372(EvictingDualNodeHashTable var0, long var1) {
      DualNode var3 = (DualNode)var0.hashTable.get(var1);
      if (var3 != null) {
         var3.remove();
         var3.removeDual();
         var0.remainingCapacity++;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmc;)V")
   @ObfuscatedName("gg")
   public static void method7379(EvictingDualNodeHashTable var0) {
      var0.deque.clear();
      var0.hashTable.clear();
      var0.dualNode = new DualNode();
      var0.remainingCapacity = var0.capacity;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmc;Lvo;J)V")
   @ObfuscatedName("sd")
   public static void method7375(EvictingDualNodeHashTable var0, DualNode var1, long var2) {
      if (var0.remainingCapacity == 0) {
         DualNode var4 = IterableDualNodeQueue.method9708(var0.deque);
         var4.remove();
         var4.removeDual();
         if (var4 == var0.dualNode) {
            var4 = IterableDualNodeQueue.method9708(var0.deque);
            var4.remove();
            var4.removeDual();
         }
      } else {
         var0.remainingCapacity--;
      }

      var0.hashTable.put((Node)var1, var2);
      var0.deque.add(var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("li")
   public boolean method7383() {
      return this.remainingCapacity <= 0 && this.dualNode.method11346() == null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method7380() {
      this.deque.clear();
      this.hashTable.clear();
      this.dualNode = new DualNode();
      this.remainingCapacity = this.capacity;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmc;)V")
   @ObfuscatedName("ij")
   public static void method7381(EvictingDualNodeHashTable var0) {
      var0.deque.clear();
      var0.hashTable.clear();
      var0.dualNode = new DualNode();
      var0.remainingCapacity = var0.capacity;
   }

   @ObfuscatedSignature(descriptor = "(Lvo;J)V")
   @ObfuscatedName("qh")
   public void method7391(DualNode var1, long var2) {
      this.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(J)Lvo;")
   @ObfuscatedName("av")
   public DualNode get(long var1) {
      DualNode var3 = (DualNode)this.hashTable.get(var1);
      if (var3 != null) {
         this.deque.method9704(var3);
      }

      return var3;
   }
}
