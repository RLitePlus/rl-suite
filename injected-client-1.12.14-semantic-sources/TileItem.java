import net.runelite.api.events.ItemQuantityChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("db")
public final class TileItem extends Renderable implements net.runelite.api.TileItem {
   @ObfuscatedName("aw")
   int flag;
   @ObfuscatedName("ds")
   public int field1283;
   @ObfuscatedName("le")
   public int field1294;
   @ObfuscatedName("an")
   int visibleTime;
   @ObfuscatedSignature(descriptor = "Lrx;")
   @ObfuscatedName("ay")
   ProjectionCoord field1284;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1290 = 31;
   @ObfuscatedName("aj")
   int ownership;
   @ObfuscatedName("at")
   int id;
   @ObfuscatedName("ak")
   boolean isPrivate;
   @ObfuscatedName("ag")
   int quantity;
   @ObfuscatedSignature(descriptor = "Lgx;")
   @ObfuscatedName("ap")
   PlayerCompositionColorTextureOverride field1297;
   @ObfuscatedSignature(descriptor = "Ldb;")
   @ObfuscatedName("eb")
   public static TileItem field1296;
   @ObfuscatedName("by")
   static int field1292;
   @ToRemove(unused = "true")
   @ObfuscatedName("ca")
   public static final int field1293 = 98;
   @ObfuscatedName("xr")
   public int field1282 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final long field1295 = 4095L;
   @ObfuscatedName("as")
   public static boolean ItemDefinition_inMembersWorld;
   @ObfuscatedName("ae")
   int despawnTime;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("zs")
   public void method3054(int var1) {
      this.field1282 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldb;I)V")
   @ObfuscatedName("ku")
   public static void method3034(TileItem var0, int var1) {
      if (var0 == null) {
         var0.vmethod49();
      }

      var0.quantity = var1 * -775486469;
   }

   @ObfuscatedSignature(descriptor = "(Ldb;IB)V")
   @ObfuscatedName("ok")
   public static void method3035(TileItem var0, int var1, byte var2) {
      if (var0 == null) {
         var0.setFlag(var1, var2);
      } else {
         try {
            var0.quantity = var1 * -775486469;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "db.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lhw;")
   @ObfuscatedName("at")
   public static VarpDefinition VarpDefinition_get(int var0, int var1) {
      try {
         VarpDefinition var2 = (VarpDefinition)class402.method8806(VarpDefinition.VarpDefinition_cached, var0);
         if (null != var2) {
            if (var1 == 605996841) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = VarpDefinition.VarpDefinition_archive.getFile(16, var0, 642647589);
            var2 = new VarpDefinition();
            if (null != var3) {
               if (var1 == 605996841) {
                  throw new IllegalStateException();
               }

               var2.decode(new Buffer(var3), (short)-770);
            }

            VarpDefinition.VarpDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "db.at(" + ')');
      }
   }

   public boolean isPrivate() {
      return this.isPrivate;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("at")
   boolean method3039(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= -902501259) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 <= -902501259) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (0 != (1939050291 * this.quantity & 1 << var1)) {
                  if (var2 <= -902501259) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "db.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ag")
   @Override
   protected final Model getModel(int var1) {
      try {
         ItemComposition var2 = class150.ItemDefinition_get(782226465 * this.visibleTime, -2135676219);
         Model var10000;
         if (null == this.field1297) {
            if (var1 == 340712311) {
               throw new IllegalStateException();
            }

            var10000 = var2.getModel(-1247866467 * this.despawnTime, -1075053875);
         } else {
            var10000 = var2.method5061(this.field1297, -1224258624);
         }

         Model var3 = var10000;
         if (var3 == null) {
            if (var1 == 340712311) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Model var4 = null;
            if (ProjectionCoord.field5716 != this.field1284) {
               class461 var5 = classFM.method4026(-1951872169);
               var5.method9308(ProjectionCoord.field5719, this.field1284, 701614602);
               var5.method9318((byte)-108);
               var4 = var3.toSharedSequenceModel(false);
               Model.method6847(var4, var5);
               class461.method9289(var5, (byte)-53);
            }

            if (var4 == null) {
               if (var1 == 340712311) {
                  throw new IllegalStateException();
               }

               var10000 = var3;
            } else {
               var10000 = var4;
            }

            return var10000;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "db.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ow")
   public void method3056(int var1) {
      this.field1283 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("af")
   void method3041(PlayerCompositionColorTextureOverride var1) {
      this.field1297 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lgx;")
   @ObfuscatedName("aj")
   PlayerCompositionColorTextureOverride method3040(int var1) {
      try {
         return this.field1297;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "db.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrl8;")
   @ObfuscatedName("st")
   public rl8 method3055() {
      int var1 = this.field1282;
      int var2 = this.field1283;
      WorldView var3 = WorldView.method3094(this.field1294);
      if (var1 != -1 && var2 != -1 && var3 != null) {
         rl8[][][] var4 = var3.method3099().method5695();
         return var4[var3.getPlane()][var1][var2];
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gk")
   public int method3052() {
      return this.field1282;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;B)V")
   @ObfuscatedName("ak")
   void method3042(PlayerCompositionColorTextureOverride var1, byte var2) {
      try {
         this.field1297 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "db.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   void method3044(int var1) {
      try {
         this.field1297 = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "db.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;B)V")
   @ObfuscatedName("ac")
   void method3047(ProjectionCoord var1, byte var2) {
      try {
         this.field1284 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "db.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod49() {
      ItemComposition var1 = class150.ItemDefinition_get(782226465 * this.visibleTime, -2133023727);
      Model var2 = null == this.field1297 ? var1.getModel(-1247866467 * this.despawnTime, -1527511622) : var1.method5061(this.field1297, -1224258624);
      if (var2 == null) {
         return null;
      } else {
         Model var3 = null;
         if (ProjectionCoord.field5716 != this.field1284) {
            class461 var4 = classFM.method4026(-1715479577);
            var4.method9308(ProjectionCoord.field5719, this.field1284, 1663173880);
            var4.method9318((byte)-47);
            var3 = var2.toSharedSequenceModel(false);
            Model.method6847(var3, var4);
            class461.method9289(var4, (byte)-5);
         }

         return var3 == null ? var2 : var3;
      }
   }

   TileItem() {
      this.field1283 = -1;
      this.quantity = 1729723237;
      this.field1284 = ProjectionCoord.field5716;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   protected boolean vmethod50() {
      ItemComposition var1 = class150.ItemDefinition_get(this.visibleTime * -132963670, -401462347);
      Model var2 = null == this.field1297 ? var1.getModel(-1247866467 * this.despawnTime, -542351483) : var1.method5061(this.field1297, -1224258624);
      return null != var2 && var2.faceAlphas != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod52() {
      ItemComposition var1 = class150.ItemDefinition_get(this.visibleTime * 782226465, -1141377220);
      Model var2 = null == this.field1297 ? var1.getModel(-1247866467 * this.despawnTime, 1416037589) : var1.method5061(this.field1297, -1224258624);
      return null != var2 && var2.faceAlphas != null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;)V")
   @ObfuscatedName("ko")
   public static void method3050(NPCComposition var0) {
      if (-1 == var0.footprintSize * -1115912485) {
         var0.footprintSize = -1195124868 * (int)(0.4F * (var0.size * 2008299982));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method3036(int var1) {
      this.quantity = var1 * 275944213;
   }

   @ObfuscatedSignature(descriptor = "(Lgx;)V")
   @ObfuscatedName("al")
   void method3043(PlayerCompositionColorTextureOverride var1) {
      this.field1297 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   @Override
   protected boolean vmethod51(int var1) {
      try {
         ItemComposition var2 = class150.ItemDefinition_get(this.visibleTime * 782226465, -2524392);
         Model var10000;
         if (null == this.field1297) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            }

            var10000 = var2.getModel(-1247866467 * this.despawnTime, -1890830631);
         } else {
            var10000 = var2.method5061(this.field1297, -1224258624);
         }

         Model var3 = var10000;
         boolean var5;
         if (null != var3 && var3.faceAlphas != null) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            }

            var5 = true;
         } else {
            var5 = false;
         }

         return var5;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "db.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   void method3045() {
      this.field1297 = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   public int method3051() {
      return this.field1283;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method3046() {
      this.field1297 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fd")
   public void method3053(int var1) {
      if (this.field1282 != -1) {
         client.field938.debug("Item quantity changed: {} ({} -> {})", new Object[]{this.getId(), this.getQuantity(), var1});
         ItemQuantityChanged var2 = new ItemQuantityChanged(this, this.method3055(), this.getQuantity(), var1);
         SecureUrlRequester.client.getCallbacks().post(var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("aq")
   void method3048(ProjectionCoord var1) {
      this.field1284 = var1;
   }

   public int getId() {
      return this.visibleTime * 782226465;
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("bg")
   void method3049(ProjectionCoord var1) {
      this.field1284 = var1;
   }

   public int getQuantity() {
      return this.despawnTime * -1247866467;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void method3037(int var1) {
      this.quantity = var1 * -775486469;
   }

   public int getDespawnTime() {
      return this.ownership * -1748897679 - client.serverCycle * 1597664885 + client.field970;
   }

   public int getOwnership() {
      return this.id * -1140757547;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ud")
   @Override
   public void vmethod156() {
      if (this.field1282 != -1 && field1296 == null) {
         field1296 = this;
      }
   }

   public int getVisibleTime() {
      return this.flag * 1285003875 - client.serverCycle * 1597664885 + client.field970;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("av")
   void setFlag(int var1, byte var2) {
      try {
         this.ownership = var1 * -775486469;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "db.av(" + ')');
      }
   }
}
