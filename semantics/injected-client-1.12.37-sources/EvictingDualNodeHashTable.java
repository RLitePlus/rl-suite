import net.runelite.api.NodeCache;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jz")
public final class EvictingDualNodeHashTable implements NodeCache {
   @ObfuscatedName("af")
   int field3503;
   @ObfuscatedName("lv")
   public float field3501 = 0.0F;
   @ObfuscatedSignature(descriptor = "Lvj;")
   @ObfuscatedName("az")
   classVJ field3506 = new classVJ();
   @ObfuscatedName("ae")
   int field3505;
   @ObfuscatedName("if")
   public int field3507;
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("ab")
   IterableNodeHashTable field3502;
   @ObfuscatedSignature(descriptor = "Lnz;")
   @ObfuscatedName("ag")
   classNZ field3504 = new classNZ();

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("af")
   public void method6425(long var1) {
      classVJ var3 = (classVJ)this.field3502.method13595(var1);
      if (var3 != null) {
         var3.vmethod398();
         var3.method11958();
         this.field3505++;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hb")
   public void method6442() {
      this.field3507 = this.field3503;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ve")
   public static void method6443() {
      method6438("EnumDefinition_cached", EnumComposition.field4820);
      method6438("animPoseCache", SequenceDefinition.field5145);
      method6438("animationCache", SequenceDefinition.field5141);
      method6438("animayaPoses", SequenceDefinition.field5144);
      method6438("dbRowConfigCache", DbRowType.field7171);
      method6438("dbTableConfigCache", classZU.field7271);
      method6438("dbTableIndexCache", client.field978);
      method6438("field4546", WorldEntityConfig.field4872);
      method6438("field4739", classOW.field5183);
      method6438("field4817", WorldMapElement.field5406);
      method6438("field4842", classPA.field5203);
      method6438("field4963", classPC.field5219);
      method6438("field4974", classPH.field5252);
      method6438("field4978", classPF.field5235);
      method6438("field844", client.field937);
      method6438("healthBarCache", HealthBarDefinition.field5475);
      method6438("healthBarSpriteCache", HealthBarDefinition.field5476);
      method6438("hitslpatSpriteCache", classPW.field5446);
      method6438("hitsplatCache", classPW.field5445);
      method6438("hitsplatCompCache", classPG.field5238);
      method6438("hitsplatFontCache", classPW.field5447);
      method6438("hitsplatFontCache", classOF.field4852);
      method6438("inventoryCache", classOC.field4814);
      method6438("itemModelCache", ItemComposition.field5007);
      method6438("itemSpriteCache", ItemComposition.field5008);
      method6438("items", ItemComposition.field5006);
      method6438("npcModelCache", classPL.field5337);
      method6438("npcs", classPL.field5336);
      method6438("objModelCacheSpawn", classOM.field4967);
      method6438("objModelDataCache", classOM.field4968);
      method6438("objects", classOM.field4966);
      method6438("paramCompositionCache", classPN.field5350);
      method6438("playerModelCache", PlayerComposition.field4100);
      method6438("scriptCache", Script.field491);
      method6438("spotanimCache", classOR.field5098);
      method6438("spotanimModelCache", classOR.field5099);
      method6438("structCompositionCache", classPR.field5385);
      method6438("varbits", VarbitComposition.field5418);
      method6438("varplayers", classOY.field5194);
      method6438("wecSpriteCache", WorldEntityConfig.field4873);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljz;)V")
   @ObfuscatedName("ql")
   public static void method6438(String var0, EvictingDualNodeHashTable var1) {
      synchronized (var1) {
         EvictingDualNodeHashTable var3 = var1;
         boolean var4 = var3.method6440();
         var3.field3501 = var3.field3501 * 0.92F + (var4 ? 0.07999998F : 0.0F);
         if (var4) {
            if (var3.field3501 > 0.2F) {
               client.logger.trace("cache {} is thrashing", var0);
            }

            if (var3.field3501 > 0.9F && var3.field3503 < var3.field3507 * 8) {
               var3.method6437(var3.field3503 * 2);
               client.logger.info("cache {} thrashing, enlarging to {} entries", var0, var3.field3503);
            }
         }

         var3.field3504.method8287(var3.field3506);
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Lvj;")
   @ObfuscatedName("az")
   public classVJ method6422(long var1) {
      classVJ var3 = (classVJ)this.field3502.method13595(var1);
      if (var3 != null) {
         classNZ.method8265(this.field3504, var3);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gg")
   public void method6441() {
      this.field3501 = 0.0F;
      this.field3504.method8287(this.field3506);
   }

   @ObfuscatedSignature(descriptor = "(J)Lvj;")
   @ObfuscatedName("ag")
   public classVJ method6423(long var1) {
      classVJ var3 = (classVJ)this.field3502.method13595(var1);
      if (var3 != null) {
         classNZ.method8265(this.field3504, var3);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lvj;J)V")
   @ObfuscatedName("ae")
   public void method6428(classVJ var1, long var2) {
      if (this.field3505 == 0) {
         classVJ var4 = this.field3504.method8269();
         var4.vmethod398();
         var4.method11958();
         if (var4 == this.field3506) {
            var4 = this.field3504.method8269();
            var4.vmethod398();
            var4.method11958();
         }
      } else {
         this.field3505--;
      }

      IterableNodeHashTable.method13576(this.field3502, var1, var2);
      classNZ.method8265(this.field3504, var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lh")
   public void method6439(int var1) {
      this.method6437(var1);
      this.field3507 = this.field3503;
   }

   @ObfuscatedSignature(descriptor = "(J)Lvj;")
   @ObfuscatedName("as")
   public classVJ method6424(long var1) {
      classVJ var3 = (classVJ)this.field3502.method13595(var1);
      if (var3 != null) {
         classNZ.method8265(this.field3504, var3);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ax")
   public void method6426(long var1) {
      classVJ var3 = (classVJ)this.field3502.method13595(var1);
      if (var3 != null) {
         var3.vmethod398();
         var3.method11958();
         this.field3505++;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bj")
   public boolean method6440() {
      return this.field3505 <= 0 && this.field3506.method11962() == null;
   }

   public void reset() {
      method6431(this);
   }

   @ObfuscatedSignature(descriptor = "(Ljz;)V")
   @ObfuscatedName("rl")
   public static void method6431(EvictingDualNodeHashTable var0) {
      if (var0 == null) {
         var0.method6436();
      }

      var0.field3504.method8262();
      IterableNodeHashTable.method13579(var0.field3502);
      var0.field3506 = new classVJ();
      var0.field3505 = var0.field3503;
      var0.method6441();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljz;)V")
   @ObfuscatedName("kz")
   public static void method6432(EvictingDualNodeHashTable var0) {
      var0.field3504.method8262();
      IterableNodeHashTable.method13579(var0.field3502);
      var0.field3506 = new classVJ();
      var0.field3505 = var0.field3503;
   }

   public EvictingDualNodeHashTable(int var1) {
      this.field3503 = var1;
      this.field3505 = var1;
      byte var2 = 1;

      while (var2 + var2 < var1) {
         var2 += var2;
      }

      this.field3502 = new IterableNodeHashTable(var2);
      this.method6442();
   }

   @ObfuscatedSignature(descriptor = "(Lvj;J)V")
   @ObfuscatedName("aa")
   public void method6429(classVJ var1, long var2) {
      if (this.field3505 == 0) {
         classVJ var4 = this.field3504.method8269();
         var4.vmethod398();
         var4.method11958();
         if (var4 == this.field3506) {
            var4 = this.field3504.method8269();
            var4.vmethod398();
            var4.method11958();
         }
      } else {
         this.field3505--;
      }

      IterableNodeHashTable.method13576(this.field3502, var1, var2);
      classNZ.method8265(this.field3504, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lvj;J)V")
   @ObfuscatedName("ao")
   public void method6430(classVJ var1, long var2) {
      if (this.field3505 == 0) {
         classVJ var4 = this.field3504.method8269();
         var4.vmethod398();
         var4.method11958();
         if (var4 == this.field3506) {
            var4 = this.field3504.method8269();
            var4.vmethod398();
            var4.method11958();
         }
      } else {
         this.field3505--;
      }

      IterableNodeHashTable.method13576(this.field3502, var1, var2);
      classNZ.method8265(this.field3504, var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method6433() {
      this.field3504.method8262();
      IterableNodeHashTable.method13579(this.field3502);
      this.field3506 = new classVJ();
      this.field3505 = this.field3503;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljz;J)V")
   @ObfuscatedName("zf")
   public static void method6427(EvictingDualNodeHashTable var0, long var1) {
      classVJ var3 = (classVJ)var0.field3502.method13595(var1);
      if (var3 != null) {
         var3.vmethod398();
         var3.method11958();
         var0.field3505++;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ng")
   public void method6437(int var1) {
      if (var1 > this.field3503) {
         byte var2 = 1;

         while (var2 < var1) {
            var2 += var2;
         }

         this.field3503 = var2;
         this.reset();
         this.field3502 = new IterableNodeHashTable(var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Lvj;")
   @ObfuscatedName("js")
   public classVJ method6444(long var1) {
      return this.method6422(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lvj;J)V")
   @ObfuscatedName("yy")
   public void method6445(classVJ var1, long var2) {
      this.method6428(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method6434() {
      this.field3504.method8262();
      IterableNodeHashTable.method13579(this.field3502);
      this.field3506 = new classVJ();
      this.field3505 = this.field3503;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method6435() {
      this.field3504.method8262();
      IterableNodeHashTable.method13579(this.field3502);
      this.field3506 = new classVJ();
      this.field3505 = this.field3503;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method6436() {
      this.field3504.method8264();
      IterableNodeHashTable.method13579(this.field3502);
      this.field3506 = new classVJ();
      this.field3503 = this.field3503;
   }
}
